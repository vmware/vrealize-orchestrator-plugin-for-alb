package com.vmware.avi.vro;

import org.json.simple.JSONObject;


public class AviObjectMetadata {
	private String objectType;
	private JSONObject newObject;
	private JSONObject existingObject;
	private String operation;

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
				+ existingObject + ", operation=" + operation + "]";
	}
}