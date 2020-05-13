package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HTTPLocalFile;
import com.vmware.avi.vro.model.HTTPSecurityActionRateProfile;
import com.vmware.avi.vro.model.RateProfile;
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
 * HTTPSecurityAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPSecurityAction")
@VsoFinder(name = Constants.FINDER_VRO_HTTPSECURITYACTION, idAccessor = "getObjectID()")
@Service
public class HTTPSecurityAction extends AviRestResource  {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("file")
  private HTTPLocalFile file = null;

  @JsonProperty("https_port")
  private Integer httpsPort = null;

  @JsonProperty("rate_limit")
  private RateProfile rateLimit = null;

  @JsonProperty("rate_profile")
  private HTTPSecurityActionRateProfile rateProfile = null;

  @JsonProperty("status_code")
  private String statusCode = null;

  
  /**
   * Type of the security action to perform. Enum options - HTTP_SECURITY_ACTION_CLOSE_CONN, HTTP_SECURITY_ACTION_SEND_RESPONSE, HTTP_SECURITY_ACTION_ALLOW, HTTP_SECURITY_ACTION_REDIRECT_TO_HTTPS, HTTP_SECURITY_ACTION_RATE_LIMIT.
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Type of the security action to perform. Enum options - HTTP_SECURITY_ACTION_CLOSE_CONN, HTTP_SECURITY_ACTION_SEND_RESPONSE, HTTP_SECURITY_ACTION_ALLOW, HTTP_SECURITY_ACTION_REDIRECT_TO_HTTPS, HTTP_SECURITY_ACTION_RATE_LIMIT.")
  @NotNull


 
  @VsoMethod  
  public String getAction() {
    return action;
  }
    
  @VsoMethod
  public void setAction(String action) {
    this.action = action;
  }

  
  /**
   * File to be used for generating HTTP local response.
   * @return file
  **/
  @ApiModelProperty(value = "File to be used for generating HTTP local response.")

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
   * Secure SSL/TLS port to redirect the HTTP request to. Allowed values are 1-65535.
   * @return httpsPort
  **/
  @ApiModelProperty(value = "Secure SSL/TLS port to redirect the HTTP request to. Allowed values are 1-65535.")


 
  @VsoMethod  
  public Integer getHttpsPort() {
    return httpsPort;
  }
    
  @VsoMethod
  public void setHttpsPort(Integer httpsPort) {
    this.httpsPort = httpsPort;
  }

  
  /**
   * Rate Limit profile to be used to rate-limit the flow.  (deprecated). Field deprecated in 20.1.1.
   * @return rateLimit
  **/
  @ApiModelProperty(value = "Rate Limit profile to be used to rate-limit the flow.  (deprecated). Field deprecated in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public RateProfile getRateLimit() {
    return rateLimit;
  }
    
  @VsoMethod
  public void setRateLimit(RateProfile rateLimit) {
    this.rateLimit = rateLimit;
  }

  
  /**
   * Rate limiting configuration for this action. Field introduced in 20.1.1.
   * @return rateProfile
  **/
  @ApiModelProperty(value = "Rate limiting configuration for this action. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public HTTPSecurityActionRateProfile getRateProfile() {
    return rateProfile;
  }
    
  @VsoMethod
  public void setRateProfile(HTTPSecurityActionRateProfile rateProfile) {
    this.rateProfile = rateProfile;
  }

  
  /**
   * HTTP status code to use for local response. Enum options - HTTP_LOCAL_RESPONSE_STATUS_CODE_200, HTTP_LOCAL_RESPONSE_STATUS_CODE_204, HTTP_LOCAL_RESPONSE_STATUS_CODE_403, HTTP_LOCAL_RESPONSE_STATUS_CODE_404, HTTP_LOCAL_RESPONSE_STATUS_CODE_429, HTTP_LOCAL_RESPONSE_STATUS_CODE_501.
   * @return statusCode
  **/
  @ApiModelProperty(value = "HTTP status code to use for local response. Enum options - HTTP_LOCAL_RESPONSE_STATUS_CODE_200, HTTP_LOCAL_RESPONSE_STATUS_CODE_204, HTTP_LOCAL_RESPONSE_STATUS_CODE_403, HTTP_LOCAL_RESPONSE_STATUS_CODE_404, HTTP_LOCAL_RESPONSE_STATUS_CODE_429, HTTP_LOCAL_RESPONSE_STATUS_CODE_501.")


 
  @VsoMethod  
  public String getStatusCode() {
    return statusCode;
  }
    
  @VsoMethod
  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  
  public String getObjectID() {
		return "HTTPSecurityAction";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPSecurityAction htTPSecurityAction = (HTTPSecurityAction) o;
    return Objects.equals(this.action, htTPSecurityAction.action) &&
        Objects.equals(this.file, htTPSecurityAction.file) &&
        Objects.equals(this.httpsPort, htTPSecurityAction.httpsPort) &&
        Objects.equals(this.rateLimit, htTPSecurityAction.rateLimit) &&
        Objects.equals(this.rateProfile, htTPSecurityAction.rateProfile) &&
        Objects.equals(this.statusCode, htTPSecurityAction.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, file, httpsPort, rateLimit, rateProfile, statusCode);
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

