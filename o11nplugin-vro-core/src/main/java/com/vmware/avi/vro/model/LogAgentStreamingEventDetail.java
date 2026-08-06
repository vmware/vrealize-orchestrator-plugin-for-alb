package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The LogAgentStreamingEventDetail is a POJO class extends AviRestResource that used for creating
 * LogAgentStreamingEventDetail.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LogAgentStreamingEventDetail")
@VsoFinder(name = Constants.FINDER_VRO_LOGAGENTSTREAMINGEVENTDETAIL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LogAgentStreamingEventDetail extends AviRestResource {
    @JsonProperty("error_code")
    @JsonInclude(Include.NON_NULL)
    private Integer errorCode;

    @JsonProperty("error_reason")
    @JsonInclude(Include.NON_NULL)
    private String errorReason;

    @JsonProperty("host")
    @JsonInclude(Include.NON_NULL)
    private String host;

    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private Integer port;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 32.1.3.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorCode
   */
  @VsoMethod
  public Integer getErrorCode() {
    return errorCode;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 32.1.3.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorCode set the errorCode.
   */
  @VsoMethod
  public void setErrorCode(Integer  errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 32.1.3.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorReason
   */
  @VsoMethod
  public String getErrorReason() {
    return errorReason;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 32.1.3.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorReason set the errorReason.
   */
  @VsoMethod
  public void setErrorReason(String  errorReason) {
    this.errorReason = errorReason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 32.1.3.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return host
   */
  @VsoMethod
  public String getHost() {
    return host;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 32.1.3.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param host set the host.
   */
  @VsoMethod
  public void setHost(String  host) {
    this.host = host;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 32.1.3.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return port
   */
  @VsoMethod
  public Integer getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 32.1.3.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(Integer  port) {
    this.port = port;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LogAgentStreamingEventDetail objLogAgentStreamingEventDetail = (LogAgentStreamingEventDetail) o;
  return   Objects.equals(this.host, objLogAgentStreamingEventDetail.host)&&
  Objects.equals(this.port, objLogAgentStreamingEventDetail.port)&&
  Objects.equals(this.errorCode, objLogAgentStreamingEventDetail.errorCode)&&
  Objects.equals(this.errorReason, objLogAgentStreamingEventDetail.errorReason);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LogAgentStreamingEventDetail {\n");
      sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

