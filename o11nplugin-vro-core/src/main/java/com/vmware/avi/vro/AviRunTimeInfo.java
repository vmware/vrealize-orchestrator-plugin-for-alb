package com.vmware.avi.vro;

import org.springframework.http.HttpMethod;

import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
@VsoObject(create = false, name = "AviRunTimeInfo")
@VsoFinder(name = Constants.FINDER_VRO_AVI_RUNTIME_INFO, idAccessor = "getObjectID()")
public class AviRunTimeInfo {
	private String url;
	private String httpMethod;
	private Object requestBody;
	private Object responseBody;
	private String httpStatuseCode;
	
	public String getObjectID() {
		return this.url;
	}
	@VsoMethod
	public String getUrl() {
		return url;
	}
	@VsoMethod
	public void setUrl(String url) {
		this.url = url;
	}
	@VsoMethod
	public String getHttpMethod() {
		return httpMethod;
	}
	@VsoMethod
	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}
	@VsoMethod
	public Object getRequestBody() {
		return requestBody;
	}
	@VsoMethod
	public void setRequestBody(Object requestBody) {
		this.requestBody = requestBody;
	}
	@VsoMethod
	public Object getResponseBody() {
		return responseBody;
	}
	@VsoMethod
	public void setResponseBody(Object responseBody) {
		this.responseBody = responseBody;
	}
	@VsoMethod
	public String getHttpStatuseCode() {
		return httpStatuseCode;
	}
	@VsoMethod
	public void setHttpStatuseCode(String httpStatuseCode) {
		this.httpStatuseCode = httpStatuseCode;
	}
}
