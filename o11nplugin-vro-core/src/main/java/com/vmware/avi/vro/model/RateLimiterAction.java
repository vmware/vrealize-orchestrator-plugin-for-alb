package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HTTPLocalFile;
import com.vmware.avi.vro.model.HTTPRedirectAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * RateLimiterAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "RateLimiterAction")
@VsoFinder(name = Constants.FINDER_VRO_RATELIMITERACTION, idAccessor = "getObjectID()")
@Service
public class RateLimiterAction extends AviRestResource  {
  @JsonProperty("file")
  private HTTPLocalFile file = null;

  @JsonProperty("redirect")
  private HTTPRedirectAction redirect = null;

  @JsonProperty("status_code")
  private String statusCode = "HTTP_LOCAL_RESPONSE_STATUS_CODE_429";

  @JsonProperty("type")
  private String type = "RL_ACTION_NONE";

  
  /**
   * File to be used for HTTP Local response rate limit action.
   * @return file
  **/
  @ApiModelProperty(value = "File to be used for HTTP Local response rate limit action.")

  @Valid

 
  @VsoMethod  
  public HTTPLocalFile getFile() {
    return file;
  }
    
  @VsoMethod
  public void setFile(HTTPLocalFile file) {
    this.file = file;
  }

  
  /**
   * Parameters for HTTP Redirect rate limit action.
   * @return redirect
  **/
  @ApiModelProperty(value = "Parameters for HTTP Redirect rate limit action.")

  @Valid

 
  @VsoMethod  
  public HTTPRedirectAction getRedirect() {
    return redirect;
  }
    
  @VsoMethod
  public void setRedirect(HTTPRedirectAction redirect) {
    this.redirect = redirect;
  }

  
  /**
   * HTTP status code for Local Response rate limit action. Enum options - HTTP_LOCAL_RESPONSE_STATUS_CODE_200, HTTP_LOCAL_RESPONSE_STATUS_CODE_204, HTTP_LOCAL_RESPONSE_STATUS_CODE_403, HTTP_LOCAL_RESPONSE_STATUS_CODE_404, HTTP_LOCAL_RESPONSE_STATUS_CODE_429, HTTP_LOCAL_RESPONSE_STATUS_CODE_501.
   * @return statusCode
  **/
  @ApiModelProperty(value = "HTTP status code for Local Response rate limit action. Enum options - HTTP_LOCAL_RESPONSE_STATUS_CODE_200, HTTP_LOCAL_RESPONSE_STATUS_CODE_204, HTTP_LOCAL_RESPONSE_STATUS_CODE_403, HTTP_LOCAL_RESPONSE_STATUS_CODE_404, HTTP_LOCAL_RESPONSE_STATUS_CODE_429, HTTP_LOCAL_RESPONSE_STATUS_CODE_501.")


 
  @VsoMethod  
  public String getStatusCode() {
    return statusCode;
  }
    
  @VsoMethod
  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  
  /**
   * Type of action to be enforced upon hitting the rate limit. Enum options - RL_ACTION_NONE, RL_ACTION_DROP_CONN, RL_ACTION_RESET_CONN, RL_ACTION_CLOSE_CONN, RL_ACTION_LOCAL_RSP, RL_ACTION_REDIRECT.
   * @return type
  **/
  @ApiModelProperty(value = "Type of action to be enforced upon hitting the rate limit. Enum options - RL_ACTION_NONE, RL_ACTION_DROP_CONN, RL_ACTION_RESET_CONN, RL_ACTION_CLOSE_CONN, RL_ACTION_LOCAL_RSP, RL_ACTION_REDIRECT.")


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "RateLimiterAction";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLimiterAction rateLimiterAction = (RateLimiterAction) o;
    return Objects.equals(this.file, rateLimiterAction.file) &&
        Objects.equals(this.redirect, rateLimiterAction.redirect) &&
        Objects.equals(this.statusCode, rateLimiterAction.statusCode) &&
        Objects.equals(this.type, rateLimiterAction.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, redirect, statusCode, type);
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

