package com.vmware.avi.vro;

import org.json.JSONObject;

/***
 * This is a POJO class contains the metadata of the AVI objects.
 * 
 * @author tushar
 *
 */
public class AviObjectMetadata {

	private String objectType;
	private JSONObject newObject;
	private JSONObject existingObject;
	private String operation;
	private String tenant;

	/***
	 * Constructor to instantiate class with mandatory parameter.
	 * 
	 * @param objectType type of the Object.
	 * @param newObject  Object with actual input data.
	 * @param operation  type of operation.
	 * @param tenant     tenant name.
	 */
	public AviObjectMetadata(String objectType, JSONObject newObject, String operation, String tenant) {
		super();
		this.objectType = objectType;
		this.newObject = newObject;
		this.operation = operation;
		this.tenant = tenant;
	}

	public String getTenant() {
		return tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	/***
	 * Constructor to instantiate class with mandatory parameters
	 * 
	 * @param objectType type of the Object.
	 * @param newObject  Object with actual inpiut data.
	 * @param operation  type of operation.
	 */
	public AviObjectMetadata(String objectType, JSONObject newObject, String operation) {
		this.objectType = objectType;
		this.newObject = newObject;
		this.operation = operation;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public JSONObject getNewObject() {
		return newObject;
	}

	public void setNewObject(JSONObject newObject) {
		this.newObject = newObject;
	}

	public JSONObject getExistingObject() {
		return existingObject;
	}

	public void setExistingObject(JSONObject existingObject) {
		this.existingObject = existingObject;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "AviObjectMetadata [objectType=" + objectType + ", newObject=" + newObject + ", existingObject="
				+ existingObject + ", operation=" + operation + ", tenant=" + tenant + "]";
	}

}
