package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.HTTPLocalFile;
import com.vmware.avi.vro.model.HTTPRedirectAction;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The RateLimiterAction is a POJO class extends AviRestResource that used for creating
 * RateLimiterAction.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RateLimiterAction")
@VsoFinder(name = Constants.FINDER_VRO_RATELIMITERACTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RateLimiterAction extends AviRestResource {
  @JsonProperty("file")
  @JsonInclude(Include.NON_NULL)
  private HTTPLocalFile file = null;

  @JsonProperty("redirect")
  @JsonInclude(Include.NON_NULL)
  private HTTPRedirectAction redirect = null;

  @JsonProperty("status_code")
  @JsonInclude(Include.NON_NULL)
  private String statusCode = "HTTP_LOCAL_RESPONSE_STATUS_CODE_429";

  @JsonProperty("type")
  @JsonInclude(Include.NON_NULL)
  private String type = "RL_ACTION_NONE";



  /**
   * This is the getter method this will return the attribute value.
   * File to be used for http local response rate limit action.
   * @return file
   */
  @VsoMethod
  public HTTPLocalFile getFile() {
    return file;
  }

  /**
   * This is the setter method to the attribute.
   * File to be used for http local response rate limit action.
   * @param file set the file.
   */
  @VsoMethod
  public void setFile(HTTPLocalFile file) {
    this.file = file;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Parameters for http redirect rate limit action.
   * @return redirect
   */
  @VsoMethod
  public HTTPRedirectAction getRedirect() {
    return redirect;
  }

  /**
   * This is the setter method to the attribute.
   * Parameters for http redirect rate limit action.
   * @param redirect set the redirect.
   */
  @VsoMethod
  public void setRedirect(HTTPRedirectAction redirect) {
    this.redirect = redirect;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http status code for local response rate limit action.
   * Enum options - HTTP_LOCAL_RESPONSE_STATUS_CODE_200, HTTP_LOCAL_RESPONSE_STATUS_CODE_204, HTTP_LOCAL_RESPONSE_STATUS_CODE_403,
   * HTTP_LOCAL_RESPONSE_STATUS_CODE_404, HTTP_LOCAL_RESPONSE_STATUS_CODE_429, HTTP_LOCAL_RESPONSE_STATUS_CODE_501.
   * Default value when not specified in API or module is interpreted by Avi Controller as HTTP_LOCAL_RESPONSE_STATUS_CODE_429.
   * @return statusCode
   */
  @VsoMethod
  public String getStatusCode() {
    return statusCode;
  }

  /**
   * This is the setter method to the attribute.
   * Http status code for local response rate limit action.
   * Enum options - HTTP_LOCAL_RESPONSE_STATUS_CODE_200, HTTP_LOCAL_RESPONSE_STATUS_CODE_204, HTTP_LOCAL_RESPONSE_STATUS_CODE_403,
   * HTTP_LOCAL_RESPONSE_STATUS_CODE_404, HTTP_LOCAL_RESPONSE_STATUS_CODE_429, HTTP_LOCAL_RESPONSE_STATUS_CODE_501.
   * Default value when not specified in API or module is interpreted by Avi Controller as HTTP_LOCAL_RESPONSE_STATUS_CODE_429.
   * @param statusCode set the statusCode.
   */
  @VsoMethod
  public void setStatusCode(String  statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of action to be enforced upon hitting the rate limit.
   * Enum options - RL_ACTION_NONE, RL_ACTION_DROP_CONN, RL_ACTION_RESET_CONN, RL_ACTION_CLOSE_CONN, RL_ACTION_LOCAL_RSP, RL_ACTION_REDIRECT.
   * Default value when not specified in API or module is interpreted by Avi Controller as RL_ACTION_NONE.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of action to be enforced upon hitting the rate limit.
   * Enum options - RL_ACTION_NONE, RL_ACTION_DROP_CONN, RL_ACTION_RESET_CONN, RL_ACTION_CLOSE_CONN, RL_ACTION_LOCAL_RSP, RL_ACTION_REDIRECT.
   * Default value when not specified in API or module is interpreted by Avi Controller as RL_ACTION_NONE.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RateLimiterAction objRateLimiterAction = (RateLimiterAction) o;
  return   Objects.equals(this.redirect, objRateLimiterAction.redirect)&&
  Objects.equals(this.statusCode, objRateLimiterAction.statusCode)&&
  Objects.equals(this.type, objRateLimiterAction.type)&&
  Objects.equals(this.file, objRateLimiterAction.file);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RateLimiterAction {\n");
      sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
