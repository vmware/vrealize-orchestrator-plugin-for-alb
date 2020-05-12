package com.vmware.avi.vro;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vmware.avi.sdk.AviApi;
import com.vmware.avi.sdk.AviApiException;
import com.vmware.avi.sdk.AviCredentials;
import com.vmware.avi.vro.model.AviRestResource;
import com.vmware.o11n.plugin.sdk.annotation.VsoConstructor;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;

/***
 * This class acts as a service in Plugin. It performs the actions from the
 * workflow and perform rollback if needed.
 * 
 * @author tushar
 *
 */
@VsoObject(create = false, name = "AviVroClient")
@VsoFinder(name = Constants.FINDER_VRO_CLIENT, idAccessor = "getObjectID()")
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
	private ObjectMapper mapper = new ObjectMapper();

	static {
		try {
			VroPluginFactory.initializeModelMap();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}
	}

	public enum OPERATION {

		ADD, UPDATE, DELETE;
	}

	public AviCredentials getCred() {
		return cred;
	}

	public void setCred(AviCredentials cred) {
		this.cred = cred;
	}

	/**
	 * This method will instantiate the AviApi if the current instance is null
	 * 
	 * @return instance of AviApi
	 */
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
	 * his method add the data into the queue with add operation and if the data is
	 * already exist it add operation ad update
	 * 
	 * @param objectData contains the actual data which is used of creating object
	 *                   on the controller
	 * @throws JsonProcessingException
	 * @throws AviApiException
	 */
	@VsoMethod
	public void addObject(AviRestResource objectData) throws JsonProcessingException, AviApiException {
		if (null != objectData) {
			String objectType = objectData.getClass().getSimpleName();
			mapper.setSerializationInclusion(Include.NON_NULL);
			String jsonStr = mapper.writeValueAsString(objectData);
			JSONObject jsonObj = new JSONObject(jsonStr);
			AviObjectMetadata aviObjectMetadata = new AviObjectMetadata(objectType, jsonObj, OPERATION.ADD.toString());
			workflowDataQueue.add(aviObjectMetadata);
			logger.info("Adding " + objectType + " into queue :" + workflowDataQueue);
		} else {
			logger.info("Object data is empty");
			throw new AviApiException("Object data is empty");
		}
	}

	/***
	 * This method add the data into the queue with add operation and if the data is
	 * already exist it add operation ad update
	 * 
	 * @param objectTypeis the type of object.
	 * @param objectData   contains the actual data which is used of creating object
	 *                     on the controller
	 * @throws AviApiException
	 */
	@VsoMethod
	public void add(String objectType, String objectData) throws AviApiException {
		this.add(objectType, objectData, null);
	}

	/**
	 * This method add the data into the queue with add operation and if the data is
	 * already exist it add operation ad update
	 * 
	 * @param objectType is the type of object.a
	 * @param objectData contains the actual data which is used of creating object
	 * @param tenant     name of Tenant. on the controller
	 * @throws AviApiException
	 */
	@VsoMethod
	public void add(String objectType, String objectData, String tenant) throws AviApiException {
		if (((null != objectType) && (!objectType.isEmpty())) && ((null != objectData) && (!objectData.isEmpty()))) {
			JSONObject jsonObj = new JSONObject(objectData);
			AviObjectMetadata aviObjectMetadata = new AviObjectMetadata(objectType, jsonObj, OPERATION.ADD.toString(),
					tenant);
			workflowDataQueue.add(aviObjectMetadata);
			logger.info("Adding " + objectType + " into queue :" + workflowDataQueue);
		} else {
			logger.debug("Object type or object data is empty");
			throw new AviApiException("Object type or object data is empty");
		}
	}

	/**
	 * This method add the data into the queue with delete operation.
	 * 
	 * @param objectData contains the actual data which is used of creating object
	 *                   on the controller
	 * @throws JsonProcessingException
	 * @throws AviApiException
	 */
	@VsoMethod
	public void deleteObject(AviRestResource objectData) throws JsonProcessingException, AviApiException {
		this.deleteObject(objectData, null);
	}

	/***
	 * This method add the data into the queue with delete operation.
	 * 
	 * @param objectType type of the object
	 * @param name       name of the Object
	 * @throws Exception
	 */

	@VsoMethod
	public void deleteObjectByName(String objectType, String name) throws Exception {
		this.deleteObjectByName(objectType, name, null);
	}

	/***
	 * This method add the data into the queue with delete operation.
	 * 
	 * @param objectType type of the Object.
	 * @param uuid       uuid of the object.
	 * @throws Exception
	 */
	@VsoMethod
	public void deleteObjectByUUID(String objectType, String uuid) throws Exception {
		this.deleteObjectByUUID(objectType, uuid, null);
	}

	/**
	 * this method add the data into the queue with delete operation.
	 * 
	 * @param objectType is the type of object.
	 * @param objectData contains the actual data which is used of creating object
	 *                   on the controller
	 * @throws AviApiException
	 */
	@VsoMethod
	public void delete(String objectType, String objectData) throws AviApiException {
		if (((null != objectType) && (!objectType.isEmpty())) && ((null != objectData) && (!objectData.isEmpty()))) {
			logger.debug("ObjectType is empty");
			JSONObject jsonObj = new JSONObject(objectData);
			if ((jsonObj.has("uuid")) || (jsonObj.has("name"))) {
				AviObjectMetadata aviObjectMetadata = new AviObjectMetadata(objectType, jsonObj,
						OPERATION.DELETE.toString());
				workflowDataQueue.add(aviObjectMetadata);
				logger.info("Adding " + objectType + " into queue :" + workflowDataQueue + " for deletion");
			} else {
				logger.debug("Name or UUID is missing");
				throw new AviApiException("Please provide name or uuid");
			}
		} else {
			logger.debug("Object type or object data is empty");
			throw new AviApiException("Object type or object data is empty");
		}
	}

	/***
	 * this method add the data into the queue with delete operation
	 * 
	 * @param objectType is the type of object.
	 * @param objectData contains the actual data which is used of creating object
	 *                   on the controller
	 * @param tenant     name of Tenant.
	 * @throws JsonProcessingException
	 * @throws AviApiException
	 */
	@VsoMethod
	public void deleteObject(AviRestResource objectData, String tenant)
			throws JsonProcessingException, AviApiException {
		if (objectData != null) {
			String objectType = objectData.getClass().getSimpleName();
			mapper.setSerializationInclusion(Include.NON_NULL);
			String jsonStr = mapper.writeValueAsString(objectData);
			JSONObject jsonObj = new JSONObject(jsonStr);
			if ((jsonObj != null) && ((jsonObj.has("uuid")) || (jsonObj.has("name")))) {
				String uuid = jsonObj.getString("uuid").toString();
				AviObjectMetadata aviObjectMetadata = new AviObjectMetadata(objectType, jsonObj,
						OPERATION.DELETE.toString(), tenant);
				workflowDataQueue.add(aviObjectMetadata);
				logger.info("Adding " + objectType + " with uuid " + uuid + "into queue :" + workflowDataQueue
						+ " for deletion");
			} else {
				logger.debug("Name or UUID is missing");
				throw new AviApiException("Please provide name or uuid");
			}
		} else {
			logger.debug("Object data is empty");
			throw new AviApiException("Object data is empty");
		}
	}

	/***
	 * This method add the data into the queue with delete operation
	 * 
	 * @param objectType type of the Object.
	 * @param name       name of the object.
	 * @param tenant     name of Tenant.
	 * @throws Exception
	 */
	@VsoMethod
	public void deleteObjectByName(String objectType, String name, String tenant) throws Exception {
		if ((null != objectType) && (!objectType.isEmpty())) {
			HashMap<String, String> userHeader = this.getTenantHeader(tenant);
			JSONObject jsonObject = this.getObjectDataByName(objectType, name, userHeader);
			String uuid = jsonObject.getString("uuid").toString();
			AviObjectMetadata aviObjectMetadata = new AviObjectMetadata(objectType, jsonObject,
					OPERATION.DELETE.toString(), tenant);
			workflowDataQueue.add(aviObjectMetadata);
			logger.info("Adding " + objectType + " with uuid " + uuid + "into queue :" + workflowDataQueue
					+ " for deletion");
		} else {
			logger.debug("ObjectType is empty");
			throw new AviApiException("Please provide object type");
		}
	}

	/***
	 * This method add the data into the queue with delete operation
	 * 
	 * @param objectType type of the Object.
	 * @param uuid       uuid of the object.
	 * @param tenant     name of Tenant. on the controller
	 * @throws Exception
	 */
	@VsoMethod
	public void deleteObjectByUUID(String objectType, String uuid, String tenant) throws Exception {
		if ((null != objectType) && (!objectType.isEmpty())) {
			HashMap<String, String> userHeader = this.getTenantHeader(tenant);
			JSONObject jsonObject = this.getObjectDataByUUID(objectType, uuid, userHeader);
			AviObjectMetadata aviObjectMetadata = new AviObjectMetadata(objectType, jsonObject,
					OPERATION.DELETE.toString(), tenant);
			workflowDataQueue.add(aviObjectMetadata);
			logger.info("Adding " + objectType + " with uuid " + uuid + "into queue :" + workflowDataQueue
					+ " for deletion");
		} else {
			logger.debug("ObjectType is empty");
			throw new AviApiException("Please provide object type");
		}
	}

	/**
	 * This method fetch data from the Queue and perform the actions based on its
	 * operation.
	 * 
	 * @return ArrayList of AviRestResource.
	 * @throws Exception
	 */
	@VsoMethod
	public ArrayList<AviRestResource> executeWorkflow() throws Exception {
		int count = 0;
		logger.debug("Executing workflow");
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<AviRestResource> jsonResponse = new ArrayList<AviRestResource>();
		logger.info("Inside executeWorkflow :" + workflowDataQueue);
		try {
			AviApi session = getSession();
			for (AviObjectMetadata aviObjectMetadata : workflowDataQueue) {
				JSONObject response = null;
				String objectType = aviObjectMetadata.getObjectType().toLowerCase();
				AviRestResource object = this.getAviRestResourceObject(objectType);
				String operation = aviObjectMetadata.getOperation();
				JSONObject resource = null;
				String tenant = aviObjectMetadata.getTenant();
				HashMap<String, String> userHeader = this.getTenantHeader(tenant);
				String nameOfObject = aviObjectMetadata.getNewObject().get("name").toString();
				if (aviObjectMetadata.getNewObject().has("uuid")) {
					resource = getObjectDataByUUID(objectType, aviObjectMetadata.getNewObject().get("uuid").toString(),
							userHeader);
				} else {
					resource = getObjectDataByName(objectType, nameOfObject, userHeader);
				}
				if (operation.equals(OPERATION.ADD.toString())) {
					if (null == resource) {
						logger.debug("Creating " + objectType);
						response = session.post(objectType, aviObjectMetadata.getNewObject(), userHeader);
						object = mapper.readValue(response.toString(), object.getClass());
						logger.info(objectType + " created and response is " + response);
					} else {
						logger.debug("Updating  " + objectType);
						aviObjectMetadata.setOperation(OPERATION.UPDATE.toString());
						JSONObject copyOfObject = new JSONObject(resource.toString());
						aviObjectMetadata.setExistingObject(copyOfObject);
						JSONObject mergedObject = this.mergeJsonObjects(resource, aviObjectMetadata.getNewObject());
						response = session.put(objectType, mergedObject, userHeader);
						object = mapper.readValue(response.toString(), object.getClass());
						logger.info(objectType + " updated and response is " + response);

					}

				} else if (operation.equals(OPERATION.DELETE.toString())) {
					logger.debug("Deleting " + aviObjectMetadata.getObjectType().toLowerCase());
					if (null != resource) {
						this.deleteObject(resource, aviObjectMetadata, "executeWorkflow", count);
					}
				}

				jsonResponse.add(object);
				count++;
			}
		} catch (AviApiException e) {
			// jsonResponse.add(new JSONObject().put("error", e.getMessage()));
			this.rollback(count - 1, workflowDataQueue, e);
		} finally {
			clearQueue();
		}

		return jsonResponse;
	}

	/***
	 * this method generate the user header
	 * 
	 * @param tenant name of tenant.
	 * @return TenantHeader
	 */
	public HashMap<String, String> getTenantHeader(String tenant) {
		HashMap<String, String> userHeader = null;
		if (tenant != null) {
			userHeader = new HashMap<String, String>();
			userHeader.put("X-Avi-Tenant", tenant);
		}
		return userHeader;
	}

	/***
	 * This method returns AviRestResource
	 * 
	 * @param objectType name of the object.
	 * @return AviRestResource
	 */

	public AviRestResource getAviRestResourceObject(String objectType) {
		String className = null;
		AviRestResource object = null;
		if (VroPluginFactory.modelMap.containsKey(objectType.toUpperCase())) {
			className = VroPluginFactory.modelMap.get(objectType.toUpperCase());
		}
		try {
			@SuppressWarnings("unchecked")
			Class<AviRestResource> obj = (Class<AviRestResource>) Class
					.forName("com.vmware.avi.vro.model." + className);
			object = obj.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return object;
	}

	/**
	 * 
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
		return this.get(objectType, params, null);
	}

	/***
	 * Method for getting object data.
	 * 
	 * @param objectType is the type of object.
	 * @param params     is a map containing the key and values.
	 * @param tenant     name of the Tenant
	 * @return the JSONArray of the response.
	 * @throws Exception
	 */
	@VsoMethod
	public JSONArray get(String objectType, Map<String, String> params, String tenant) throws Exception {
		AviApi session = getSession();
		if ((null != objectType) && (!objectType.isEmpty())) {
			HashMap<String, String> userHeader = this.getTenantHeader(tenant);
			JSONObject data = session.get(objectType, params, userHeader);
			logger.info("Existing data of " + objectType + " : " + data);
			return (JSONArray) data.get("results");
		} else {
			logger.debug("ObjectType is empty");
			throw new AviApiException("Please provide objectType");
		}
	}

	/***
	 * Method for getting object data.
	 * 
	 * @param objectType is the type of object.
	 * @param objectName name of the object.
	 * @param userHeader user header with additional properties.
	 * @return JSONObject
	 * @throws Exception
	 */

	@VsoMethod
	public JSONObject getObjectDataByName(String objectType, String objectName, HashMap<String, String> userHeader)
			throws Exception {
		AviApi session = getSession();
		JSONObject data = null;
		JSONObject result = null;
		String path = null;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("include_name", "true");
		if ((null != objectName) && (!objectName.isEmpty())) {
			path = objectType + "?name=" + objectName;
			data = session.get(path, map, userHeader);
		} else {
			logger.debug("Incorrect " + objectType + " name ");
			throw new AviApiException("Please provide name of the " + objectType);
		}

		logger.info("Existing data of " + objectType + " : " + data);
		if ((data.has("count")) && (Integer.parseInt(data.get("count").toString()) > 0)) {
			JSONArray objectArray = (JSONArray) data.get("results");
			result = (JSONObject) objectArray.get(0);
		}
		return result;
	}

	/***
	 * Method for getting object data.
	 * 
	 * @param objectType is the type of object.
	 * @param uuid       uuid of the object.
	 * @param userHeader user header with additional properties.
	 * @return JSONObject
	 * @throws Exception
	 */
	@VsoMethod
	public JSONObject getObjectDataByUUID(String objectType, String uuid, HashMap<String, String> userHeader)
			throws Exception {
		AviApi session = getSession();
		String path = null;
		JSONObject data = null;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("include_name", "true");
		if ((null != uuid) && (!uuid.isEmpty())) {
			path = objectType + "/" + uuid;
			data = session.get(path, map, userHeader);
		} else {
			logger.debug("Incorrect " + objectType + " uuid ");
			throw new AviApiException("Please provide uuid of the " + objectType);
		}
		logger.info("Existing data of " + objectType + " : " + data);
		return data;
	}

	/***
	 * Method for getting object data.
	 * 
	 * @param objectType is the type of object.
	 * @param params     is a map containing the key and values.
	 * @return List of AviRestResource
	 * @throws Exception
	 */

	@VsoMethod
	public List<AviRestResource> getObject(String objectType, Map<String, String> params) throws Exception {
		return this.getObject(objectType, params, null);
	}

	/**
	 * Method for getting object data based on its name.
	 * 
	 * @param objectType is the type of object.
	 * @param objectName name of the object.
	 * @return AviRestResource
	 * 
	 * @throws Exception
	 */

	@VsoMethod
	public AviRestResource getObjectByName(String objectType, String objectName) throws Exception {
		return this.getObjectByName(objectType, objectName, null);

	}

	/**
	 * Method for getting object data based on its uuid.
	 * 
	 * @param objectType is the type of object.
	 * @param uuid       uuid of the object.
	 * @return the JSONObject of the response.
	 * 
	 * @throws Exception
	 */

	@VsoMethod
	public AviRestResource getObjectByUUID(String objectType, String uuid) throws Exception {
		return this.getObjectByUUID(objectType, uuid, null);

	}

	/***
	 * Method for getting object data.
	 * 
	 * @param objectType is the type of object.
	 * @param params     is a map containing the key and values.
	 * @param tenant     name of the Tenant
	 * @return List of AviRestResource
	 * @throws Exception
	 */
	@VsoMethod
	public List<AviRestResource> getObject(String objectType, Map<String, String> params, String tenant)
			throws Exception {
		JSONArray array = this.get(objectType, params, tenant);
		List<AviRestResource> objectList = new ArrayList<AviRestResource>();
		System.out.println("objectType : " + objectType);
		AviRestResource object = this.getAviRestResourceObject(objectType);
		ObjectMapper mapper = new ObjectMapper();
		for (int counter = 0; counter < array.length(); counter++) {
			JSONObject result = array.getJSONObject(counter);
			object = mapper.readValue(result.toString(), object.getClass());
			object = mapper.readValue(result.toString(), object.getClass());
			objectList.add(object);
		}
		logger.info("ObjectList : " + objectList);
		return objectList;
	}

	/**
	 * Method for getting object data based on its name.
	 * 
	 * @param objectType is the type of object.
	 * @param objectName name of the object.
	 * @param tenant     name of the tenant
	 * @return AviRestResource.
	 * @throws Exception
	 */

	@VsoMethod
	public AviRestResource getObjectByName(String objectType, String objectName, String tenant) throws Exception {
		if ((null != objectType) && ("" != objectType)) {
			AviRestResource object = this.getAviRestResourceObject(objectType);
			HashMap<String, String> userHeader = this.getTenantHeader(tenant);
			JSONObject jsonObject = this.getObjectDataByName(objectType, objectName, userHeader);
			object = mapper.readValue(jsonObject.toString(), object.getClass());
			return object;
		} else {
			logger.debug("ObjectType is empty");
			throw new AviApiException("Please provide object type");
		}

	}

	/**
	 * Method for getting object data based on its uuid.
	 * 
	 * @param objectType is the type of object.
	 * @param uuid       uuid of the object.
	 * @param tenant     name of the tenant
	 * @return the AviRestResource .
	 * 
	 * @throws Exception
	 */

	@VsoMethod
	public AviRestResource getObjectByUUID(String objectType, String uuid, String tenant) throws Exception {
		if ((null != objectType) && ("" != objectType)) {
			AviRestResource object = this.getAviRestResourceObject(objectType);
			HashMap<String, String> userHeader = this.getTenantHeader(tenant);
			JSONObject jsonObject = this.getObjectDataByUUID(objectType, uuid, userHeader);
			object = mapper.readValue(jsonObject.toString(), object.getClass());
			return object;
		} else {
			logger.debug("ObjectType is empty");
			throw new AviApiException("Please provide object type");
		}
	}

	/***
	 * This method is perform roll back task i.e. if something wents wrong during
	 * the workflow execution all the previous actions will be rool back.
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
				String tenant = currentObjectData.getTenant();
				HashMap<String, String> userHeader = this.getTenantHeader(tenant);
				if (OPERATION.ADD.toString().equals(operationType)) {
					String loggerMsg = " Deleting " + currentObjectData.getObjectType().toLowerCase() + " :: ";
					logger.info(loggerMsg);
					rollBackMsg = rollBackMsg + loggerMsg;
					JSONObject resource = getObjectDataByName(currentObjectData.getObjectType().toLowerCase(),
							currentObjectData.getNewObject().get("name").toString(), userHeader);
					this.deleteObject(resource, currentObjectData, "rollback", 0);
				} else if (OPERATION.UPDATE.toString().equals(operationType)) {
					String loggerMsg = " Restoring " + currentObjectData.getObjectType().toLowerCase() + " :: ";
					logger.info(loggerMsg);
					rollBackMsg = rollBackMsg + loggerMsg;

					if (!existingObjectData.isEmpty()) {
						JSONObject resource = getObjectDataByName(currentObjectData.getObjectType().toLowerCase(),
								currentObjectData.getNewObject().get("name").toString(), userHeader);
						if (resource == null) {
							response = session.post(currentObjectData.getObjectType().toLowerCase(),
									currentObjectData.getExistingObject(), userHeader);
							logger.info(currentObjectData.getObjectType().toLowerCase() + " : "
									+ "created & response is:- " + response);
						} else {
							JSONObject mergedObject = this.mergeJsonObjects(resource,
									currentObjectData.getExistingObject());

							response = session.put(currentObjectData.getObjectType().toLowerCase(), mergedObject,
									userHeader);
							logger.info(currentObjectData.getObjectType().toLowerCase() + "updated  :" + response);
						}

					}
				} else {
					if (null != existingObjectData) {
						String loggerMsg = " Creating " + currentObjectData.getObjectType().toLowerCase() + " :: ";
						logger.info(loggerMsg);
						rollBackMsg = rollBackMsg + loggerMsg;
						if (currentObjectData.getObjectType().toLowerCase().equals("virtualservice")) {
							existingObjectData.remove("vsvip_ref");
						}
						JSONObject updatedObject = transformRef(existingObjectData);
						response = session.post(currentObjectData.getObjectType().toLowerCase(), updatedObject,
								userHeader);
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
	 * This method makes the REST delete call..
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
		if (null != resource) {
			String tenant = aviObjectMetadata.getTenant();
			HashMap<String, String> userHeader = this.getTenantHeader(tenant);
			copyOfObject = new JSONObject(resource, JSONObject.getNames(resource));
			if ("executeWorkflow".equals(action)) {
				aviObjectMetadata.setExistingObject(copyOfObject);
			}
			String resourceUUID = resource.get("uuid").toString();
			if ((!("").equals(resourceUUID)) || (null != resourceUUID)) {
				response = session.delete(aviObjectMetadata.getObjectType().toLowerCase(), resourceUUID, userHeader);
				logger.info(aviObjectMetadata.getObjectType().toLowerCase() + " deleted and response is " + response);
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
	 * This method will check keys of the json object if it found object reference
	 * or references it will replace the uuid with the name in condition.
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
	 * this method modified the string and appending name condition.
	 * 
	 * @param str
	 * @return the String which replace uuid with name in condition.
	 */
	private String createReference(String str) {
		if ((null != str) && ("" != str)) {
			return str.substring(0, str.lastIndexOf("/")) + "/?name=" + str.substring(str.indexOf("#") + 1);
		}
		return null;
	}
}
