package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.HTTPReselectRespCode;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HTTPServerReselect is a POJO class extends AviRestResource that used for creating
 * HTTPServerReselect.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPServerReselect")
@VsoFinder(name = Constants.FINDER_VRO_HTTPSERVERRESELECT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPServerReselect extends AviRestResource {
    @JsonProperty("enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean enabled = false;

    @JsonProperty("num_retries")
    @JsonInclude(Include.NON_NULL)
    private Integer numRetries = 4;

    @JsonProperty("retry_nonidempotent")
    @JsonInclude(Include.NON_NULL)
    private Boolean retryNonidempotent = false;

    @JsonProperty("retry_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer retryTimeout = 0;

    @JsonProperty("svr_resp_code")
    @JsonInclude(Include.NON_NULL)
    private HTTPReselectRespCode svrRespCode;



  /**
   * This is the getter method this will return the attribute value.
   * Enable http request reselect when server responds with specific response codes.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable http request reselect when server responds with specific response codes.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of times to retry an http request when server responds with configured status codes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @return numRetries
   */
  @VsoMethod
  public Integer getNumRetries() {
    return numRetries;
  }

  /**
   * This is the setter method to the attribute.
   * Number of times to retry an http request when server responds with configured status codes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @param numRetries set the numRetries.
   */
  @VsoMethod
  public void setNumRetries(Integer  numRetries) {
    this.numRetries = numRetries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allow retry of non-idempotent http requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return retryNonidempotent
   */
  @VsoMethod
  public Boolean getRetryNonidempotent() {
    return retryNonidempotent;
  }

  /**
   * This is the setter method to the attribute.
   * Allow retry of non-idempotent http requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param retryNonidempotent set the retryNonidempotent.
   */
  @VsoMethod
  public void setRetryNonidempotent(Boolean  retryNonidempotent) {
    this.retryNonidempotent = retryNonidempotent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timeout per retry attempt, for a given request.
   * Value of 0 indicates default timeout.
   * Allowed values are 0-3600000.
   * Field introduced in 18.1.5,18.2.1.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return retryTimeout
   */
  @VsoMethod
  public Integer getRetryTimeout() {
    return retryTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Timeout per retry attempt, for a given request.
   * Value of 0 indicates default timeout.
   * Allowed values are 0-3600000.
   * Field introduced in 18.1.5,18.2.1.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param retryTimeout set the retryTimeout.
   */
  @VsoMethod
  public void setRetryTimeout(Integer  retryTimeout) {
    this.retryTimeout = retryTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Server response codes which will trigger an http request retry.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return svrRespCode
   */
  @VsoMethod
  public HTTPReselectRespCode getSvrRespCode() {
    return svrRespCode;
  }

  /**
   * This is the setter method to the attribute.
   * Server response codes which will trigger an http request retry.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param svrRespCode set the svrRespCode.
   */
  @VsoMethod
  public void setSvrRespCode(HTTPReselectRespCode svrRespCode) {
    this.svrRespCode = svrRespCode;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTPServerReselect objHTTPServerReselect = (HTTPServerReselect) o;
  return   Objects.equals(this.enabled, objHTTPServerReselect.enabled)&&
  Objects.equals(this.svrRespCode, objHTTPServerReselect.svrRespCode)&&
  Objects.equals(this.numRetries, objHTTPServerReselect.numRetries)&&
  Objects.equals(this.retryNonidempotent, objHTTPServerReselect.retryNonidempotent)&&
  Objects.equals(this.retryTimeout, objHTTPServerReselect.retryTimeout);
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

