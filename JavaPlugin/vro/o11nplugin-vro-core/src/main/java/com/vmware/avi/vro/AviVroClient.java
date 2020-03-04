package com.vmware.avi.vro;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.json.JSONArray;
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
@VsoFinder(name = Constants.FINDER_AVI_VRO_CLIENT, idAccessor = "getObjectID()")
@Service
public class AviVroClient {

	public String getObjectID() {
		return cred.getController() + cred.getUsername() + cred.getPort();
	}

	@VsoConstructor
	public AviVroClient() {
	}

	private static final Logger logger = LoggerFactory.getLogger(AviVroClient.class);
	private AviCredentials cred = null;
	private Queue<AviObjectMetadata> workflowDataQueue = new LinkedList<>();
	private AviApi AVI_API = null;

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
				JSONObject resource = null;
				String nameOfObject = aviObjectMetadata.getNewObject().get("name").toString();
				if (aviObjectMetadata.getNewObject().has("uuid")) {
					resource = getObjectDataByUUID(aviObjectMetadata.getObjectType(),
							aviObjectMetadata.getNewObject().get("uuid").toString());
				} else {
					resource = getObjectDataByName(aviObjectMetadata.getObjectType(), nameOfObject);
				}
				int noOfRecords = Integer.parseInt(resource.get("count").toString());
				if (operation.equals(OPERATION.ADD.toString())) {
					if (noOfRecords == 0) {
						logger.debug("Creating " + aviObjectMetadata.getObjectType());
						response = session.post(aviObjectMetadata.getObjectType(), aviObjectMetadata.getNewObject());
						logger.info(aviObjectMetadata.getObjectType() + " created and response is " + response);
					} else {
						logger.debug("Updating  " + aviObjectMetadata.getObjectType());
						aviObjectMetadata.setOperation(OPERATION.UPDATE.toString());
						JSONArray objectArray = (JSONArray) resource.get("results");
						JSONObject object = (JSONObject) objectArray.get(0);
						JSONObject copyOfObject = new JSONObject(object.toString());
						aviObjectMetadata.setExistingObject(copyOfObject);
						JSONObject mergedObject = this.mergeJsonObjects(object, aviObjectMetadata.getNewObject());
						response = session.put(aviObjectMetadata.getObjectType(), mergedObject);
						logger.info(aviObjectMetadata.getObjectType() + " updated and response is " + response);

					}

				} else if (operation.equals(OPERATION.DELETE.toString())) {
					logger.debug("Deleting " + aviObjectMetadata.getObjectType());
					if (noOfRecords > 0) {
						this.deleteObject(resource, aviObjectMetadata, "executeWorkflow", count);
					} else {
						if (count > 0) {
							this.rollback(count - 1, workflowDataQueue, new Exception(""));
						}

					}

				}

				jsonResponse.add(response);
				count++;
			}
		} catch (AviApiException e) {
			jsonResponse.add(new JSONObject().put("error", e.getMessage()));
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
		logger.debug("Clearing workflowDataQueue");
		if (!this.workflowDataQueue.isEmpty()) {
			this.workflowDataQueue.clear();
		}
	}

	/***
	 * Method for getting object data.
	 * 
	 * @param objectType is the type of object.
	 * @param params     is a map containing the key and values.
	 * @return the JSONArray of the response.
	 * @throws Exception
	 */
	@VsoMethod
	public JSONArray get(String objectType, Map<String, String> params) throws Exception {
		AviApi session = getSession();
		JSONObject data = session.get(objectType, params);
		logger.info("Existing data of " + objectType + " : " + data);
		return (JSONArray) data.get("results");
	}

	/**
	 * Method for getting object data based on its name.
	 * 
	 * @param objectType is the type of object.
	 * @param objectName name of the object.
	 * @return the JSONObject of the response.
	 * 
	 * @throws Exception
	 */

	@VsoMethod
	public JSONObject getObjectDataByName(String objectType, String objectName) throws Exception {
		AviApi session = getSession();
		JSONObject data = null;
		String path = null;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("include_name", "true");
		if ((null != objectName) && ("" != objectName)) {
			path = objectType + "?name=" + objectName;
			data = session.get(path, map);
		} else {
			logger.debug("Incorrect " + objectType + " name ");
			throw new AviApiException("Please provide name of the " + objectType);
		}
		logger.info("Existing data of " + objectType + " : " + data);
		return data;
	}

	/**
	 * Method for getting object data based on its uuid.
	 * 
	 * @param objectType is the type of object.
	 * @param uuid       of the object.
	 * @return JSONObject of the response.
	 * @throws Exception
	 */
	@VsoMethod
	public JSONObject getObjectDataByUUID(String objectType, String uuid) throws Exception {
		AviApi session = getSession();
		String path = null;
		JSONObject data = null;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("include_name", "true");
		if ((null != uuid) && ("" != uuid)) {
			path = objectType + "/" + uuid;
			data = session.get(path, map);
		} else {
			logger.debug("Incorrect " + objectType + " uuid ");
			throw new AviApiException("Please provide uuid of the " + objectType);
		}
		logger.info("Existing data of " + objectType + " : " + data);
		return data;
	}

	/***
	 * 
	 * @param count    indicating how many objects needs to rollback.
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
					JSONObject resource = getObjectDataByName(currentObjectData.getObjectType(),
							currentObjectData.getNewObject().get("name").toString());
					this.deleteObject(resource, currentObjectData, "rollback", 0);
				} else if (OPERATION.UPDATE.toString().equals(operationType)) {
					String loggerMsg = " Restoring " + currentObjectData.getObjectType() + " :: ";
					logger.info(loggerMsg);
					rollBackMsg = rollBackMsg + loggerMsg;

					if (!existingObjectData.isEmpty()) {
						JSONObject resource = getObjectDataByName(currentObjectData.getObjectType(),
								currentObjectData.getNewObject().get("name").toString());
						if (resource.isEmpty()) {
							response = session.post(currentObjectData.getObjectType(),
									currentObjectData.getExistingObject());
							logger.info(
									currentObjectData.getObjectType() + " : " + "created & response is:- " + response);
						} else {
							JSONArray obj = (JSONArray) resource.get("results");
							JSONObject mergedObject = this.mergeJsonObjects(obj.getJSONObject(0),
									currentObjectData.getExistingObject());

							response = session.put(currentObjectData.getObjectType(), mergedObject);
							logger.info(currentObjectData.getObjectType() + "updated  :" + response);
						}

					}
				} else {
					String loggerMsg = " Creating " + currentObjectData.getObjectType() + " :: ";
					logger.info(loggerMsg);
					rollBackMsg = rollBackMsg + loggerMsg;
					if (!existingObjectData.isEmpty()) {
						if (currentObjectData.getObjectType().equals("virtualservice")) {
							existingObjectData.remove("vsvip_ref");
						}
						JSONObject updatedObject = transformRef(existingObjectData);
						response = session.post(currentObjectData.getObjectType(), updatedObject);
						logger.info(currentObjectData.getObjectType() + " : " + "created & response is:- " + response);
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
	private JSONObject mergeJsonObjects(JSONObject object1, JSONObject object2) {
		Iterator<String> keys = object1.keys();
		Object obj1, obj2 = null;
		while (keys.hasNext()) {
			String next = keys.next();
			if (object1.isNull(next))
				continue;
			obj1 = object1.get(next);
			if (!object2.has(next))
				object2.putOpt(next, obj1);
			obj2 = object2.get(next);
			if (obj1 instanceof JSONObject && obj2 instanceof JSONObject) {
				mergeJsonObjects((JSONObject) obj1, (JSONObject) obj2);
			}
		}
		object2.remove("_last_modified");
		return object2;
	}

	/***
	 * 
	 * @param resource          is a response containing uuid needed for delete
	 *                          operation.
	 * @param aviObjectMetadata contains the AviObjectMetadata which used for the
	 *                          rollback.
	 * @param action            define from where the deleteObect method
	 *                          called(executeWorkflow or rollback).
	 * @param count             indicating how many objects needs to rollback.
	 * @return
	 * @throws Exception
	 */
	private JSONObject deleteObject(JSONObject resource, AviObjectMetadata aviObjectMetadata, String action, int count)
			throws Exception {

		AviApi session = getSession();
		JSONObject response = null;
		JSONObject copyOfObject = null;
		JSONArray objectArray = (JSONArray) resource.get("results");
		if (objectArray.length() > 0) {
			JSONObject object = (JSONObject) objectArray.get(0);
			copyOfObject = new JSONObject(object, JSONObject.getNames(object));
			if ("executeWorkflow".equals(action)) {
				aviObjectMetadata.setExistingObject(copyOfObject);
			}
			String resourceUUID = object.get("uuid").toString();
			if ((!("").equals(resourceUUID)) || (null != resourceUUID)) {
				response = session.delete(aviObjectMetadata.getObjectType(), resourceUUID);
				logger.info(aviObjectMetadata.getObjectType() + " deleted and response is " + response);
			}
		} else {

			if ("executeWorkflow".equals(action)) {
				this.rollback(count - 1, workflowDataQueue,
						new AviApiException(
								"Object with name " + aviObjectMetadata.getNewObject().get("name").toString()
										+ " is not found on controller " + cred.getController()));
			}

		}
		return copyOfObject;
	}

	/***
	 * 
	 * @param jsonObject is the object which needs to be modified (references).
	 * @return JSONObject with updated references.
	 */
	private JSONObject transformRef(JSONObject jsonObject) {
		if (!jsonObject.isEmpty()) {
			Set<String> keys = jsonObject.keySet();
			for (String key : keys) {
				Object value = jsonObject.get(key);
				if (key.endsWith("_ref")) {
					String valueOfKey = value.toString();
					String updatedRef = createReference(valueOfKey);
					jsonObject.put(key, updatedRef);
				} else if (key.endsWith("_refs")) {
					JSONArray stringArray = (JSONArray) value;
					ArrayList<String> updatedList = new ArrayList<String>();
					for (Object s : stringArray) {
						String updatedValue = createReference(s.toString());
						updatedList.add(updatedValue);
					}
					jsonObject.put(key, updatedList);

				} else {

				}
			}
		}
		return jsonObject;
	}

	/***
	 * 
	 * @param str
	 * @return the String which replace uuid with name condition.
	 */
	private String createReference(String str) {
		if ((null != str) && ("" != str)) {
			return str.substring(0, str.lastIndexOf("/")) + "/?name=" + str.substring(str.indexOf("#") + 1);
		}
		return null;
	}

}
