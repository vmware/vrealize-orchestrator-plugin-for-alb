package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HTTPReselectRespCode;
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
 * HTTPServerReselect
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:16:36.466+05:30")

@VsoObject(create = false, name = "HTTPServerReselect")
@VsoFinder(name = Constants.FINDER_VRO_HTTPSERVERRESELECT, idAccessor = "getObjectID()")
@Service
public class HTTPServerReselect extends AviRestResource  {
  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("num_retries")
  private Integer numRetries = 4;

  @JsonProperty("retry_nonidempotent")
  private Boolean retryNonidempotent = null;

  @JsonProperty("retry_timeout")
  private Integer retryTimeout = null;

  @JsonProperty("svr_resp_code")
  private HTTPReselectRespCode svrRespCode = null;

  
  /**
   * Enable HTTP request reselect when server responds with specific response codes.
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "Enable HTTP request reselect when server responds with specific response codes.")
  @NotNull


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * Number of times to retry an HTTP request when server responds with configured status codes.
   * @return numRetries
  **/
  @ApiModelProperty(value = "Number of times to retry an HTTP request when server responds with configured status codes.")


 
  @VsoMethod  
  public Integer getNumRetries() {
    return numRetries;
  }
    
  @VsoMethod
  public void setNumRetries(Integer numRetries) {
    this.numRetries = numRetries;
  }

  
  /**
   * Allow retry of non-idempotent HTTP requests.
   * @return retryNonidempotent
  **/
  @ApiModelProperty(value = "Allow retry of non-idempotent HTTP requests.")


 
  @VsoMethod  
  public Boolean isRetryNonidempotent() {
    return retryNonidempotent;
  }
    
  @VsoMethod
  public void setRetryNonidempotent(Boolean retryNonidempotent) {
    this.retryNonidempotent = retryNonidempotent;
  }

  
  /**
   * Timeout per retry attempt, for a given request. Value of 0 indicates default timeout. Allowed values are 0-3600000. Field introduced in 18.1.5,18.2.1.
   * @return retryTimeout
  **/
  @ApiModelProperty(value = "Timeout per retry attempt, for a given request. Value of 0 indicates default timeout. Allowed values are 0-3600000. Field introduced in 18.1.5,18.2.1.")


 
  @VsoMethod  
  public Integer getRetryTimeout() {
    return retryTimeout;
  }
    
  @VsoMethod
  public void setRetryTimeout(Integer retryTimeout) {
    this.retryTimeout = retryTimeout;
  }

  
  /**
   * Server response codes which will trigger an HTTP request retry.
   * @return svrRespCode
  **/
  @ApiModelProperty(value = "Server response codes which will trigger an HTTP request retry.")

  @Valid

 
  @VsoMethod  
  public HTTPReselectRespCode getSvrRespCode() {
    return svrRespCode;
  }
    
  @VsoMethod
  public void setSvrRespCode(HTTPReselectRespCode svrRespCode) {
    this.svrRespCode = svrRespCode;
  }

  
  public String getObjectID() {
		return "HTTPServerReselect";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPServerReselect htTPServerReselect = (HTTPServerReselect) o;
    return Objects.equals(this.enabled, htTPServerReselect.enabled) &&
        Objects.equals(this.numRetries, htTPServerReselect.numRetries) &&
        Objects.equals(this.retryNonidempotent, htTPServerReselect.retryNonidempotent) &&
        Objects.equals(this.retryTimeout, htTPServerReselect.retryTimeout) &&
        Objects.equals(this.svrRespCode, htTPServerReselect.svrRespCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, numRetries, retryNonidempotent, retryTimeout, svrRespCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPServerReselect {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    numRetries: ").append(toIndentedString(numRetries)).append("\n");
    sb.append("    retryNonidempotent: ").append(toIndentedString(retryNonidempotent)).append("\n");
    sb.append("    retryTimeout: ").append(toIndentedString(retryTimeout)).append("\n");
    sb.append("    svrRespCode: ").append(toIndentedString(svrRespCode)).append("\n");
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

