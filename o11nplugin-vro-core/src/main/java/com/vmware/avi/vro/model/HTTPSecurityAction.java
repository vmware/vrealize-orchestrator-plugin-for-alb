package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.HTTPLocalFile;
import com.vmware.avi.vro.model.RateProfile;
import com.vmware.avi.vro.model.HTTPSecurityActionRateProfile;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HTTPSecurityAction is a POJO class extends AviRestResource that used for creating
 * HTTPSecurityAction.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPSecurityAction")
@VsoFinder(name = Constants.FINDER_VRO_HTTPSECURITYACTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPSecurityAction extends AviRestResource {
  @JsonProperty("action")
  @JsonInclude(Include.NON_NULL)
  private String action = null;

  @JsonProperty("file")
  @JsonInclude(Include.NON_NULL)
  private HTTPLocalFile file = null;

  @JsonProperty("https_port")
  @JsonInclude(Include.NON_NULL)
  private Integer httpsPort = null;

  @JsonProperty("rate_limit")
  @JsonInclude(Include.NON_NULL)
  private RateProfile rateLimit = null;

  @JsonProperty("rate_profile")
  @JsonInclude(Include.NON_NULL)
  private HTTPSecurityActionRateProfile rateProfile = null;

  @JsonProperty("status_code")
  @JsonInclude(Include.NON_NULL)
  private String statusCode = null;



  /**
   * This is the getter method this will return the attribute value.
   * Type of the security action to perform.
   * Enum options - HTTP_SECURITY_ACTION_CLOSE_CONN, HTTP_SECURITY_ACTION_SEND_RESPONSE, HTTP_SECURITY_ACTION_ALLOW,
   * HTTP_SECURITY_ACTION_REDIRECT_TO_HTTPS, HTTP_SECURITY_ACTION_RATE_LIMIT, HTTP_SECURITY_ACTION_REQUEST_CHECK_ICAP.
   * @return action
   */
  @VsoMethod
  public String getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Type of the security action to perform.
   * Enum options - HTTP_SECURITY_ACTION_CLOSE_CONN, HTTP_SECURITY_ACTION_SEND_RESPONSE, HTTP_SECURITY_ACTION_ALLOW,
   * HTTP_SECURITY_ACTION_REDIRECT_TO_HTTPS, HTTP_SECURITY_ACTION_RATE_LIMIT, HTTP_SECURITY_ACTION_REQUEST_CHECK_ICAP.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(String  action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * File to be used for generating http local response.
   * @return file
   */
  @VsoMethod
  public HTTPLocalFile getFile() {
    return file;
  }

  /**
   * This is the setter method to the attribute.
   * File to be used for generating http local response.
   * @param file set the file.
   */
  @VsoMethod
  public void setFile(HTTPLocalFile file) {
    this.file = file;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Secure ssl/tls port to redirect the http request to.
   * Allowed values are 1-65535.
   * @return httpsPort
   */
  @VsoMethod
  public Integer getHttpsPort() {
    return httpsPort;
  }

  /**
   * This is the setter method to the attribute.
   * Secure ssl/tls port to redirect the http request to.
   * Allowed values are 1-65535.
   * @param httpsPort set the httpsPort.
   */
  @VsoMethod
  public void setHttpsPort(Integer  httpsPort) {
    this.httpsPort = httpsPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limit profile to be used to rate-limit the flow.
   * (deprecated).
   * Field deprecated in 18.2.9.
   * @return rateLimit
   */
  @VsoMethod
  public RateProfile getRateLimit() {
    return rateLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limit profile to be used to rate-limit the flow.
   * (deprecated).
   * Field deprecated in 18.2.9.
   * @param rateLimit set the rateLimit.
   */
  @VsoMethod
  public void setRateLimit(RateProfile rateLimit) {
    this.rateLimit = rateLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limiting configuration for this action.
   * Field introduced in 18.2.9.
   * @return rateProfile
   */
  @VsoMethod
  public HTTPSecurityActionRateProfile getRateProfile() {
    return rateProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limiting configuration for this action.
   * Field introduced in 18.2.9.
   * @param rateProfile set the rateProfile.
   */
  @VsoMethod
  public void setRateProfile(HTTPSecurityActionRateProfile rateProfile) {
    this.rateProfile = rateProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http status code to use for local response.
   * Enum options - HTTP_LOCAL_RESPONSE_STATUS_CODE_200, HTTP_LOCAL_RESPONSE_STATUS_CODE_204, HTTP_LOCAL_RESPONSE_STATUS_CODE_403,
   * HTTP_LOCAL_RESPONSE_STATUS_CODE_404, HTTP_LOCAL_RESPONSE_STATUS_CODE_429, HTTP_LOCAL_RESPONSE_STATUS_CODE_501.
   * @return statusCode
   */
  @VsoMethod
  public String getStatusCode() {
    return statusCode;
  }

  /**
   * This is the setter method to the attribute.
   * Http status code to use for local response.
   * Enum options - HTTP_LOCAL_RESPONSE_STATUS_CODE_200, HTTP_LOCAL_RESPONSE_STATUS_CODE_204, HTTP_LOCAL_RESPONSE_STATUS_CODE_403,
   * HTTP_LOCAL_RESPONSE_STATUS_CODE_404, HTTP_LOCAL_RESPONSE_STATUS_CODE_429, HTTP_LOCAL_RESPONSE_STATUS_CODE_501.
   * @param statusCode set the statusCode.
   */
  @VsoMethod
  public void setStatusCode(String  statusCode) {
    this.statusCode = statusCode;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTPSecurityAction objHTTPSecurityAction = (HTTPSecurityAction) o;
  return   Objects.equals(this.httpsPort, objHTTPSecurityAction.httpsPort)&&
  Objects.equals(this.statusCode, objHTTPSecurityAction.statusCode)&&
  Objects.equals(this.rateLimit, objHTTPSecurityAction.rateLimit)&&
  Objects.equals(this.rateProfile, objHTTPSecurityAction.rateProfile)&&
  Objects.equals(this.file, objHTTPSecurityAction.file)&&
  Objects.equals(this.action, objHTTPSecurityAction.action);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HTTPSecurityAction {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    httpsPort: ").append(toIndentedString(httpsPort)).append("\n");
        sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
        sb.append("    rateProfile: ").append(toIndentedString(rateProfile)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

