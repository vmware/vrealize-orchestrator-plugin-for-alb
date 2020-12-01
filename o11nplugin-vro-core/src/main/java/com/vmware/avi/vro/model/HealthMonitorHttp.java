package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.HealthMonitorSSLAttributes;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HealthMonitorHttp is a POJO class extends AviRestResource that used for creating
 * HealthMonitorHttp.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HealthMonitorHttp")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITORHTTP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HealthMonitorHttp extends AviRestResource {
    @JsonProperty("auth_type")
    @JsonInclude(Include.NON_NULL)
    private String authType = null;

    @JsonProperty("exact_http_request")
    @JsonInclude(Include.NON_NULL)
    private Boolean exactHttpRequest = false;

    @JsonProperty("http_request")
    @JsonInclude(Include.NON_NULL)
    private String httpRequest = "GET / HTTP/1.0";

    @JsonProperty("http_request_body")
    @JsonInclude(Include.NON_NULL)
    private String httpRequestBody = null;

    @JsonProperty("http_response")
    @JsonInclude(Include.NON_NULL)
    private String httpResponse = null;

    @JsonProperty("http_response_code")
    @JsonInclude(Include.NON_NULL)
    private List<String> httpResponseCode = null;

    @JsonProperty("maintenance_code")
    @JsonInclude(Include.NON_NULL)
    private List<Integer> maintenanceCode = null;

    @JsonProperty("maintenance_response")
    @JsonInclude(Include.NON_NULL)
    private String maintenanceResponse = null;

    @JsonProperty("response_size")
    @JsonInclude(Include.NON_NULL)
    private Integer responseSize = null;

    @JsonProperty("ssl_attributes")
    @JsonInclude(Include.NON_NULL)
    private HealthMonitorSSLAttributes sslAttributes = null;



  /**
   * This is the getter method this will return the attribute value.
   * Type of the authentication method.
   * Enum options - AUTH_BASIC, AUTH_NTLM.
   * Field introduced in 20.1.1.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authType
   */
  @VsoMethod
  public String getAuthType() {
    return authType;
  }

  /**
   * This is the setter method to the attribute.
   * Type of the authentication method.
   * Enum options - AUTH_BASIC, AUTH_NTLM.
   * Field introduced in 20.1.1.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param authType set the authType.
   */
  @VsoMethod
  public void setAuthType(String  authType) {
    this.authType = authType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use the exact http_request string as specified by user, without any automatic insert of headers like host header.
   * Field introduced in 17.1.6,17.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return exactHttpRequest
   */
  @VsoMethod
  public Boolean getExactHttpRequest() {
    return exactHttpRequest;
  }

  /**
   * This is the setter method to the attribute.
   * Use the exact http_request string as specified by user, without any automatic insert of headers like host header.
   * Field introduced in 17.1.6,17.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param exactHttpRequest set the exactHttpRequest.
   */
  @VsoMethod
  public void setExactHttpRequest(Boolean  exactHttpRequest) {
    this.exactHttpRequest = exactHttpRequest;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Send an http request to the server.
   * The default get / http/1.0 may be extended with additional headers or information.
   * For instance, get /index.htm http/1.1 host  www.site.com connection  close.
   * Default value when not specified in API or module is interpreted by Avi Controller as "GET / HTTP/1.0".
   * @return httpRequest
   */
  @VsoMethod
  public String getHttpRequest() {
    return httpRequest;
  }

  /**
   * This is the setter method to the attribute.
   * Send an http request to the server.
   * The default get / http/1.0 may be extended with additional headers or information.
   * For instance, get /index.htm http/1.1 host  www.site.com connection  close.
   * Default value when not specified in API or module is interpreted by Avi Controller as "GET / HTTP/1.0".
   * @param httpRequest set the httpRequest.
   */
  @VsoMethod
  public void setHttpRequest(String  httpRequest) {
    this.httpRequest = httpRequest;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http request body.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpRequestBody
   */
  @VsoMethod
  public String getHttpRequestBody() {
    return httpRequestBody;
  }

  /**
   * This is the setter method to the attribute.
   * Http request body.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param httpRequestBody set the httpRequestBody.
   */
  @VsoMethod
  public void setHttpRequestBody(String  httpRequestBody) {
    this.httpRequestBody = httpRequestBody;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Match for a keyword in the first 2kb of the server header and body response.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpResponse
   */
  @VsoMethod
  public String getHttpResponse() {
    return httpResponse;
  }

  /**
   * This is the setter method to the attribute.
   * Match for a keyword in the first 2kb of the server header and body response.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param httpResponse set the httpResponse.
   */
  @VsoMethod
  public void setHttpResponse(String  httpResponse) {
    this.httpResponse = httpResponse;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of http response codes to match as successful.
   * Default is 2xx.
   * Enum options - HTTP_ANY, HTTP_1XX, HTTP_2XX, HTTP_3XX, HTTP_4XX, HTTP_5XX.
   * Minimum of 1 items required.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpResponseCode
   */
  @VsoMethod
  public List<String> getHttpResponseCode() {
    return httpResponseCode;
  }

  /**
   * This is the setter method. this will set the httpResponseCode
   * List of http response codes to match as successful.
   * Default is 2xx.
   * Enum options - HTTP_ANY, HTTP_1XX, HTTP_2XX, HTTP_3XX, HTTP_4XX, HTTP_5XX.
   * Minimum of 1 items required.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpResponseCode
   */
  @VsoMethod
  public void setHttpResponseCode(List<String>  httpResponseCode) {
    this.httpResponseCode = httpResponseCode;
  }

  /**
   * This is the setter method this will set the httpResponseCode
   * List of http response codes to match as successful.
   * Default is 2xx.
   * Enum options - HTTP_ANY, HTTP_1XX, HTTP_2XX, HTTP_3XX, HTTP_4XX, HTTP_5XX.
   * Minimum of 1 items required.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpResponseCode
   */
  @VsoMethod
  public HealthMonitorHttp addHttpResponseCodeItem(String httpResponseCodeItem) {
    if (this.httpResponseCode == null) {
      this.httpResponseCode = new ArrayList<String>();
    }
    this.httpResponseCode.add(httpResponseCodeItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Match or look for this http response code indicating server maintenance.
   * A successful match results in the server being marked down.
   * Allowed values are 101-599.
   * Maximum of 4 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maintenanceCode
   */
  @VsoMethod
  public List<Integer> getMaintenanceCode() {
    return maintenanceCode;
  }

  /**
   * This is the setter method. this will set the maintenanceCode
   * Match or look for this http response code indicating server maintenance.
   * A successful match results in the server being marked down.
   * Allowed values are 101-599.
   * Maximum of 4 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maintenanceCode
   */
  @VsoMethod
  public void setMaintenanceCode(List<Integer>  maintenanceCode) {
    this.maintenanceCode = maintenanceCode;
  }

  /**
   * This is the setter method this will set the maintenanceCode
   * Match or look for this http response code indicating server maintenance.
   * A successful match results in the server being marked down.
   * Allowed values are 101-599.
   * Maximum of 4 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maintenanceCode
   */
  @VsoMethod
  public HealthMonitorHttp addMaintenanceCodeItem(Integer maintenanceCodeItem) {
    if (this.maintenanceCode == null) {
      this.maintenanceCode = new ArrayList<Integer>();
    }
    this.maintenanceCode.add(maintenanceCodeItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Match or look for this keyword in the first 2kb of server header and body response indicating server maintenance.
   * A successful match results in the server being marked down.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maintenanceResponse
   */
  @VsoMethod
  public String getMaintenanceResponse() {
    return maintenanceResponse;
  }

  /**
   * This is the setter method to the attribute.
   * Match or look for this keyword in the first 2kb of server header and body response indicating server maintenance.
   * A successful match results in the server being marked down.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maintenanceResponse set the maintenanceResponse.
   */
  @VsoMethod
  public void setMaintenanceResponse(String  maintenanceResponse) {
    this.maintenanceResponse = maintenanceResponse;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Expected http/https response page size.
   * Allowed values are 2048-16384.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return responseSize
   */
  @VsoMethod
  public Integer getResponseSize() {
    return responseSize;
  }

  /**
   * This is the setter method to the attribute.
   * Expected http/https response page size.
   * Allowed values are 2048-16384.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param responseSize set the responseSize.
   */
  @VsoMethod
  public void setResponseSize(Integer  responseSize) {
    this.responseSize = responseSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ssl attributes for https health monitor.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslAttributes
   */
  @VsoMethod
  public HealthMonitorSSLAttributes getSslAttributes() {
    return sslAttributes;
  }

  /**
   * This is the setter method to the attribute.
   * Ssl attributes for https health monitor.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sslAttributes set the sslAttributes.
   */
  @VsoMethod
  public void setSslAttributes(HealthMonitorSSLAttributes sslAttributes) {
    this.sslAttributes = sslAttributes;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HealthMonitorHttp objHealthMonitorHttp = (HealthMonitorHttp) o;
  return   Objects.equals(this.httpRequest, objHealthMonitorHttp.httpRequest)&&
  Objects.equals(this.httpResponseCode, objHealthMonitorHttp.httpResponseCode)&&
  Objects.equals(this.httpResponse, objHealthMonitorHttp.httpResponse)&&
  Objects.equals(this.maintenanceCode, objHealthMonitorHttp.maintenanceCode)&&
  Objects.equals(this.maintenanceResponse, objHealthMonitorHttp.maintenanceResponse)&&
  Objects.equals(this.sslAttributes, objHealthMonitorHttp.sslAttributes)&&
  Objects.equals(this.exactHttpRequest, objHealthMonitorHttp.exactHttpRequest)&&
  Objects.equals(this.authType, objHealthMonitorHttp.authType)&&
  Objects.equals(this.httpRequestBody, objHealthMonitorHttp.httpRequestBody)&&
  Objects.equals(this.responseSize, objHealthMonitorHttp.responseSize);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HealthMonitorHttp {\n");
      sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    exactHttpRequest: ").append(toIndentedString(exactHttpRequest)).append("\n");
        sb.append("    httpRequest: ").append(toIndentedString(httpRequest)).append("\n");
        sb.append("    httpRequestBody: ").append(toIndentedString(httpRequestBody)).append("\n");
        sb.append("    httpResponse: ").append(toIndentedString(httpResponse)).append("\n");
        sb.append("    httpResponseCode: ").append(toIndentedString(httpResponseCode)).append("\n");
        sb.append("    maintenanceCode: ").append(toIndentedString(maintenanceCode)).append("\n");
        sb.append("    maintenanceResponse: ").append(toIndentedString(maintenanceResponse)).append("\n");
        sb.append("    responseSize: ").append(toIndentedString(responseSize)).append("\n");
        sb.append("    sslAttributes: ").append(toIndentedString(sslAttributes)).append("\n");
      sb.append("}");
  return sb.toString();
}

/**
* Convert the given object to string with each line indented by 4 spaces
* (except the first line).
*/
private String toIndentedString(java.lang.Object o) {
  if (o == null) {
    return "null";
  }
  return o.toString().replace("\n", "\n    ");
}
}

