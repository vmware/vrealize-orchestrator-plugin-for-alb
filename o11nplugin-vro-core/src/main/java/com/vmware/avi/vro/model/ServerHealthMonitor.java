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
 * The ServerHealthMonitor is a POJO class extends AviRestResource that used for creating
 * ServerHealthMonitor.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ServerHealthMonitor")
@VsoFinder(name = Constants.FINDER_VRO_SERVERHEALTHMONITOR)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ServerHealthMonitor extends AviRestResource {
    @JsonProperty("avg_response_time")
    @JsonInclude(Include.NON_NULL)
    private Integer avgResponseTime;

    @JsonProperty("failure_code")
    @JsonInclude(Include.NON_NULL)
    private String failureCode;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason;

    @JsonProperty("recent_response_time")
    @JsonInclude(Include.NON_NULL)
    private Integer recentResponseTime;

    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private String state;



  /**
   * This is the getter method this will return the attribute value.
   * Average health monitor response time from server in milli-seconds.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgResponseTime
   */
  @VsoMethod
  public Integer getAvgResponseTime() {
    return avgResponseTime;
  }

  /**
   * This is the setter method to the attribute.
   * Average health monitor response time from server in milli-seconds.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgResponseTime set the avgResponseTime.
   */
  @VsoMethod
  public void setAvgResponseTime(Integer  avgResponseTime) {
    this.avgResponseTime = avgResponseTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - ARP_UNRESOLVED, CONNECTION_REFUSED, CONNECTION_TIMEOUT, RESPONSE_CODE_MISMATCH, PAYLOAD_CONTENT_MISMATCH, SERVER_UNREACHABLE,
   * CONNECTION_RESET, CONNECTION_ERROR, HOST_ERROR, ADDRESS_ERROR, NO_PORT, PAYLOAD_TIMEOUT, NO_RESPONSE, NO_RESOURCES, SSL_ERROR, SSL_CERT_ERROR,
   * PORT_UNREACHABLE, SCRIPT_ERROR, OTHER_ERROR, SERVER_DISABLED...
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return failureCode
   */
  @VsoMethod
  public String getFailureCode() {
    return failureCode;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - ARP_UNRESOLVED, CONNECTION_REFUSED, CONNECTION_TIMEOUT, RESPONSE_CODE_MISMATCH, PAYLOAD_CONTENT_MISMATCH, SERVER_UNREACHABLE,
   * CONNECTION_RESET, CONNECTION_ERROR, HOST_ERROR, ADDRESS_ERROR, NO_PORT, PAYLOAD_TIMEOUT, NO_RESPONSE, NO_RESOURCES, SSL_ERROR, SSL_CERT_ERROR,
   * PORT_UNREACHABLE, SCRIPT_ERROR, OTHER_ERROR, SERVER_DISABLED...
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param failureCode set the failureCode.
   */
  @VsoMethod
  public void setFailureCode(String  failureCode) {
    this.failureCode = failureCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average health monitor response time from server in milli-seconds in the last few health monitor instances.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return recentResponseTime
   */
  @VsoMethod
  public Integer getRecentResponseTime() {
    return recentResponseTime;
  }

  /**
   * This is the setter method to the attribute.
   * Average health monitor response time from server in milli-seconds in the last few health monitor instances.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param recentResponseTime set the recentResponseTime.
   */
  @VsoMethod
  public void setRecentResponseTime(Integer  recentResponseTime) {
    this.recentResponseTime = recentResponseTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - OPER_UP, OPER_DOWN, OPER_CREATING, OPER_RESOURCES, OPER_INACTIVE, OPER_DISABLED, OPER_UNUSED, OPER_UNKNOWN, OPER_PROCESSING,
   * OPER_INITIALIZING, OPER_ERROR_DISABLED, OPER_AWAIT_MANUAL_PLACEMENT, OPER_UPGRADING, OPER_SE_PROCESSING, OPER_PARTITIONED, OPER_DISABLING,
   * OPER_FAILED, OPER_UNAVAIL, OPER_AGGREGATE_DOWN.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public String getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - OPER_UP, OPER_DOWN, OPER_CREATING, OPER_RESOURCES, OPER_INACTIVE, OPER_DISABLED, OPER_UNUSED, OPER_UNKNOWN, OPER_PROCESSING,
   * OPER_INITIALIZING, OPER_ERROR_DISABLED, OPER_AWAIT_MANUAL_PLACEMENT, OPER_UPGRADING, OPER_SE_PROCESSING, OPER_PARTITIONED, OPER_DISABLING,
   * OPER_FAILED, OPER_UNAVAIL, OPER_AGGREGATE_DOWN.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(String  state) {
    this.state = state;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ServerHealthMonitor objServerHealthMonitor = (ServerHealthMonitor) o;
  return   Objects.equals(this.name, objServerHealthMonitor.name)&&
  Objects.equals(this.state, objServerHealthMonitor.state)&&
  Objects.equals(this.recentResponseTime, objServerHealthMonitor.recentResponseTime)&&
  Objects.equals(this.avgResponseTime, objServerHealthMonitor.avgResponseTime)&&
  Objects.equals(this.failureCode, objServerHealthMonitor.failureCode)&&
  Objects.equals(this.reason, objServerHealthMonitor.reason);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ServerHealthMonitor {\n");
      sb.append("    avgResponseTime: ").append(toIndentedString(avgResponseTime)).append("\n");
        sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    recentResponseTime: ").append(toIndentedString(recentResponseTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

