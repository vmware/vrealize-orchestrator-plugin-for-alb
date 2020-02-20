package com.vmware.avi.vro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.vmware.avi.sdk.AviApi;
import com.vmware.avi.sdk.AviApiException;
import com.vmware.avi.sdk.AviCredentials;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;

@VsoObject(create = false)
@VsoFinder(name = Constants.FINDER_AVI_VRO_CLIENT)
@Service
public class AviVroClient {
	
	private static final Logger logger = Logger.getLogger(AviVroClient.class);
	
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

	public void add(String objectType, String objectData) throws ParseException {
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = (JSONObject) parser.parse(objectData);

		AviObjectMetadata aviObjectMetadata = new AviObjectMetadata(objectType, jsonObj, OPERATION.ADD.toString());
		workflowDataQueue.add(aviObjectMetadata);
		logger.info("Adding " + objectType + " into queue :" + workflowDataQueue);
	}

	public void delete(String objectType, String objectData) throws ParseException {
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = (JSONObject) parser.parse(objectData);
		AviObjectMetadata aviObjectMetadata = new AviObjectMetadata(objectType, jsonObj, OPERATION.DELETE.toString());
		workflowDataQueue.add(aviObjectMetadata);
		logger.info("Adding " + objectType + " into queue :" + workflowDataQueue);
	}

	@SuppressWarnings("unchecked")
	public ArrayList<JSONObject> executeWorkflow() {
		int count = -1;
		logger.info("Inside executeWorkflow :" + workflowDataQueue);
		try {
			AviApi session = getSession();

			ArrayList<JSONObject> jsonResponse = new ArrayList<JSONObject>();

			for (AviObjectMetadata aviObjectMetadata : workflowDataQueue) {
				JSONObject response = null;
				String operation = aviObjectMetadata.getOperation();
				Map<String, String> params = new HashMap<>();
				params.put("name", aviObjectMetadata.getNewObject().get("name").toString());
				JSONArray resource = get(aviObjectMetadata.getObjectType(), params);

				if (operation.equals(OPERATION.ADD.toString())) {

					if (resource.isEmpty()) {
						response = session.post(aviObjectMetadata.getObjectType(), aviObjectMetadata.getNewObject());
						logger.info(aviObjectMetadata.getObjectType() + " created and response is " + response);
					} else {
						aviObjectMetadata.setOperation(OPERATION.UPDATE.toString());
						JSONObject resourceObj = (JSONObject) resource.get(0);
						aviObjectMetadata.setExistingObject((JSONObject) resourceObj.clone());
						// TODO: Need to verify for nested list
						resourceObj.putAll(aviObjectMetadata.getNewObject());
						response = session.put(aviObjectMetadata.getObjectType(), resourceObj);
						logger.info(aviObjectMetadata.getObjectType() + " updated and response is " + response);

					}

				} else if (operation.equals(OPERATION.DELETE.toString()) && !resource.isEmpty()) {
					JSONObject resourceObj = (JSONObject) resource.get(0);
					String resourceUUID = resourceObj.get("uuid").toString();
					aviObjectMetadata.setExistingObject((JSONObject) resourceObj.clone());
					response = session.delete(aviObjectMetadata.getObjectType(), resourceUUID);
					logger.info(aviObjectMetadata.getObjectType() + " deleted and response is " + response);

				}
				jsonResponse.add(response);
				count++;

			}
			System.out.println("response = " + jsonResponse);
			return jsonResponse;
		} catch (AviApiException e) {
			e.printStackTrace();
			this.rollback(count, workflowDataQueue);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			clearQueue();
		}

		return null;
	}

	public void clearQueue() {
		if (!this.workflowDataQueue.isEmpty()) {
			this.workflowDataQueue.clear();
		}
	}

	public JSONArray get(String objectType, Map<String, String> params) throws Exception {
		AviApi session = getSession();
		JSONObject data = session.get(objectType, params);
		logger.info(data);
		return (JSONArray) data.get("results");
	}

	public void rollback(int count, Queue<AviObjectMetadata> metadata) {
		AviApi session = getSession();
		JSONObject response = null;
		try {
			LinkedList<AviObjectMetadata> metadataList = (LinkedList<AviObjectMetadata>) metadata;
			logger.info("Inide Rollback :" + metadataList);
			for (int counter = count; counter >= 0; counter--) {
				AviObjectMetadata currentObjectData = metadataList.get(counter);
				JSONObject existingObjectData = currentObjectData.getExistingObject();

				String operationType = currentObjectData.getOperation();
				if (OPERATION.ADD.toString().equals(operationType)) {
					logger.info("Inside Rollback Deleting Object");
					Map<String, String> params = new HashMap<>();
					params.put("name", currentObjectData.getNewObject().get("name").toString());
					JSONArray resource = null;
					resource = get(currentObjectData.getObjectType(), params);
					JSONObject resourceObj = (JSONObject) resource.get(0);
					String resourceUUID = resourceObj.get("uuid").toString();
					response = session.delete(currentObjectData.getObjectType(), resourceUUID);
					logger.info("response is:- " + response);
				} else if (OPERATION.UPDATE.toString().equals(operationType)) {
					logger.info("Inside Rollback Creating Object");
					if (!existingObjectData.isEmpty()) {
						response = session.post(currentObjectData.getObjectType(),
								currentObjectData.getExistingObject());
						logger.info("response is:- " + response);
					}
				} else {
					logger.info("Inside Rollback Creating Object");
					if (!existingObjectData.isEmpty()) {
						if (currentObjectData.getObjectType().equals("virtualservice")) {
							existingObjectData.remove("vsvip_ref");
						}
						response = session.post(currentObjectData.getObjectType(),
								currentObjectData.getExistingObject());
						logger.info("response is:- " + response);
					}
				}

			}
		} catch (AviApiException e) {
			logger.error(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}