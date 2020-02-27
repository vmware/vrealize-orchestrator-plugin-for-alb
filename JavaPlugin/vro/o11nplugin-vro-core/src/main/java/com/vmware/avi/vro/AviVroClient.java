package com.vmware.avi.vro;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.vmware.avi.sdk.AviApi;
import com.vmware.avi.sdk.AviApiException;
import com.vmware.avi.sdk.AviCredentials;
import com.vmware.o11n.plugin.sdk.annotation.VsoConstructor;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;

/***
 * 
 * @author tushar
 *
 */
@VsoObject(create = false, name = "AviVroClient")
@VsoFinder(name = Constants.FINDER_AVI_VRO_CLIENT)
@Service
public class AviVroClient {

	@VsoConstructor
	public AviVroClient() {
	}

	private static final Logger logger = LoggerFactory.getLogger(AviVroClient.class);
	private AviCredentials cred = null;
	private Queue<AviObjectMetadata> workflowDataQueue = new LinkedList<>();
	private static AviApi AVI_API = null;

	public enum OPERATION {

		ADD, UPDATE, DELETE;
	}

	public AviCredentials getCred() {
		return cred;
	}

	public void setCred(AviCredentials cred) {
		this.cred = cred;
	}

	public AviApi getSession() {
		if (AVI_API == null) {
			synchronized (AviApi.class) {
				if (AVI_API == null) {
					AVI_API = new AviApi(cred);
				}
			}
		}
		return AVI_API;
	}

	/***
	 * this method add the data into the queue with add operation and if the data is
	 * already exist it add operation ad update
	 * 
	 * @param objectType is the type of object.
	 * @param objectData contains the actual data which is used of creating object
	 *                   on the controller
	 * @throws ParseException
	 */
	@VsoMethod
	public void add(String objectType, String objectData) {
		JSONObject jsonObj = new JSONObject(objectData);

		AviObjectMetadata aviObjectMetadata = new AviObjectMetadata(objectType, jsonObj, OPERATION.ADD.toString());
		workflowDataQueue.add(aviObjectMetadata);
		logger.info("Adding " + objectType + " into queue :" + workflowDataQueue);
	}

	/***
	 * this method add the data into the queue with delete operation.
	 * 
	 * @param objectType is the type of object.
	 * @param objectData contains the actual data which is used of creating object
	 *                   on the controller
	 * @throws ParseException
	 */
	@VsoMethod
	public void delete(String objectType, String objectData) {
		JSONObject jsonObj = new JSONObject(objectData);
		AviObjectMetadata aviObjectMetadata = new AviObjectMetadata(objectType, jsonObj, OPERATION.DELETE.toString());
		workflowDataQueue.add(aviObjectMetadata);
		logger.info("Adding " + objectType + " into queue :" + workflowDataQueue);
	}

	/**
	 * This method fetch data from the Queue and perform the actions based on its
	 * operation.
	 * 
	 * @return
	 * @throws Exception
	 */
	@VsoMethod
	public String executeWorkflow() throws Exception {
		int count = 0;
		logger.debug("Executing workflow");
		ArrayList<JSONObject> jsonResponse = new ArrayList<JSONObject>();
		logger.info("Inside executeWorkflow :" + workflowDataQueue);
		try {
			AviApi session = getSession();

			for (AviObjectMetadata aviObjectMetadata : workflowDataQueue) {
				JSONObject response = null;
				String operation = aviObjectMetadata.getOperation();
				Map<String, String> params = new HashMap<>();
				params.put("name", aviObjectMetadata.getNewObject().get("name").toString());
				JSONArray resource = getExistingData(aviObjectMetadata.getObjectType(), params);

				if (operation.equals(OPERATION.ADD.toString())) {

					if (resource.isEmpty()) {
						logger.debug("Creating " + aviObjectMetadata.getObjectType());
						response = session.post(aviObjectMetadata.getObjectType(), aviObjectMetadata.getNewObject());
						logger.info(aviObjectMetadata.getObjectType() + " created and response is " + response);
					} else {
						logger.debug("Updating  " + aviObjectMetadata.getObjectType());
						aviObjectMetadata.setOperation(OPERATION.UPDATE.toString());
						JSONObject resourceObj = (JSONObject) resource.get(0);
						aviObjectMetadata.setExistingObject(resourceObj);
						JSONObject mergedObject = this.mergeJSONObjects(resourceObj, aviObjectMetadata.getNewObject());
						response = session.put(aviObjectMetadata.getObjectType(), mergedObject);
						logger.info(aviObjectMetadata.getObjectType() + " updated and response is " + response);

					}

				} else if (operation.equals(OPERATION.DELETE.toString())) {
					logger.debug("Deleting " + aviObjectMetadata.getObjectType());
					JSONObject resourceObj = (JSONObject) resource.get(0);
					String resourceUUID = resourceObj.get("uuid").toString();
					aviObjectMetadata.setExistingObject(resourceObj);
					if ((!("").equals(resourceUUID)) || (null != resourceUUID)) {
						response = session.delete(aviObjectMetadata.getObjectType(), resourceUUID);
					}
					logger.info(aviObjectMetadata.getObjectType() + " deleted and response is " + response);
				}

				jsonResponse.add(response);
				count++;
			}
		} catch (AviApiException e) {
			jsonResponse.add(new JSONObject(e.getMessage()));
			this.rollback(count - 1, workflowDataQueue, e);
		} finally {
			clearQueue();
		}

		return jsonResponse.toString();
	}

	/**
	 * method for clearing the queue
	 */
	private void clearQueue() {
		if (!this.workflowDataQueue.isEmpty()) {
			this.workflowDataQueue.clear();
		}
	}

	/***
	 * 
	 * @param objectType is the type of object.
	 * @param params     is a map containing the key and values.
	 * @return the JSONArray of the response.
	 * @throws Exception
	 */
	@VsoMethod
	private JSONArray getExistingData(String objectType, Map<String, String> params) throws Exception {
		AviApi session = getSession();
		JSONObject data = session.get(objectType, params);
		logger.info("Existing data of " + objectType + " : " + data);
		return (JSONArray) data.get("results");
	}

	/***
	 * 
	 * @param count    which tells how many objects needs to rollback.
	 * @param metadata contains the AviObjectMetadata which used for the rollback.
	 * @throws Exception
	 */
	@VsoMethod
	public void rollback(int count, Queue<AviObjectMetadata> metadata, Exception exception) throws Exception {
		AviApi session = getSession();
		String rollBackMsg = null;
		JSONObject response = null;
		logger.debug("Doing rollback :");
		try {
			LinkedList<AviObjectMetadata> metadataList = (LinkedList<AviObjectMetadata>) metadata;
			logger.info("Rollback Object List:" + metadataList);
			for (int counter = count; counter >= 0; counter--) {
				AviObjectMetadata currentObjectData = metadataList.get(counter);
				JSONObject existingObjectData = currentObjectData.getExistingObject();
				String operationType = currentObjectData.getOperation();
				if (OPERATION.ADD.toString().equals(operationType)) {
					String loggerMsg = " Deleting " + currentObjectData.getObjectType() + " :: ";
					logger.info(loggerMsg);
					rollBackMsg = rollBackMsg + loggerMsg;
					Map<String, String> params = new HashMap<>();
					params.put("name", currentObjectData.getNewObject().get("name").toString());
					JSONArray resource = null;
					resource = getExistingData(currentObjectData.getObjectType(), params);
					JSONObject resourceObj = (JSONObject) resource.get(0);
					String resourceUUID = resourceObj.get("uuid").toString();
					if ((!("").equals(resourceUUID)) || (!(null == resourceUUID))) {
						response = session.delete(currentObjectData.getObjectType(), resourceUUID);
					}
					logger.info(currentObjectData.getObjectType() + "deleted");
				} else if (OPERATION.UPDATE.toString().equals(operationType)) {
					String loggerMsg = " Restoring " + currentObjectData.getObjectType() + " :: ";
					logger.info(loggerMsg);
					rollBackMsg = rollBackMsg + loggerMsg;

					if (!existingObjectData.isEmpty()) {
						response = session.post(currentObjectData.getObjectType(),
								currentObjectData.getExistingObject());
						logger.info(currentObjectData.getObjectType() + "created :" + response);
					}
				} else {
					String loggerMsg = " Creating " + currentObjectData.getObjectType() + " :: ";
					logger.info(loggerMsg);
					rollBackMsg = rollBackMsg + loggerMsg;
					if (!existingObjectData.isEmpty()) {
						if (currentObjectData.getObjectType().equals("virtualservice")) {
							existingObjectData.remove("vsvip_ref");
						}
						response = session.post(currentObjectData.getObjectType(),
								currentObjectData.getExistingObject());
						logger.info(currentObjectData.getObjectType() + "created :" + response);
					}
				}
			}
			throw new Exception("\n" + exception.getMessage() + ":: Inside Rollback ::" + rollBackMsg + "\n");
		} catch (AviApiException e) {
			logger.error(e.getMessage());
			throw new Exception(e.getMessage() + "::" + rollBackMsg);

		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new Exception(e.getMessage() + "::" + rollBackMsg);
		}

	}

	/***
	 * This method merge the two JSON Objects.
	 * 
	 * @param json1 JSON object.
	 * @param json2 JSON object.
	 * @return the merged JSON object.
	 */
	private JSONObject mergeJSONObjects(JSONObject json1, JSONObject json2) {
		JSONObject mergedJSON = new JSONObject();
		logger.debug("Merging JSON objects : ");
		logger.info("\n first object :" + json1 + "\n second object :" + json2);
		try {
			mergedJSON = new JSONObject(json1, JSONObject.getNames(json1));
			for (String crunchifyKey : JSONObject.getNames(json2)) {
				mergedJSON.put(crunchifyKey, json2.get(crunchifyKey));
			}
			logger.info("Merged Object : " + mergedJSON);

		} catch (JSONException e) {
			logger.error(e.getMessage());
			throw new RuntimeException("JSON Exception" + e);
		}
		return mergedJSON;
	}

}
