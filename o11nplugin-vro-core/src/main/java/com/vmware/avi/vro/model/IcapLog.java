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
 * The IcapLog is a POJO class extends AviRestResource that used for creating
 * IcapLog.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IcapLog")
@VsoFinder(name = Constants.FINDER_VRO_ICAPLOG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IcapLog extends AviRestResource {
  @JsonProperty("action")
  @JsonInclude(Include.NON_NULL)
  private String action = null;

  @JsonProperty("request_logs")
  @JsonInclude(Include.NON_NULL)
  private List<IcapRequestLog> requestLogs = null;



  /**
   * This is the getter method this will return the attribute value.
   * Denotes whether the content was processed by icap server and an action was taken.
   * Enum options - ICAP_DISABLED, ICAP_PASSED, ICAP_MODIFIED, ICAP_BLOCKED, ICAP_FAILED.
   * Field introduced in 20.1.1.
   * @return action
   */
  @VsoMethod
  public String getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Denotes whether the content was processed by icap server and an action was taken.
   * Enum options - ICAP_DISABLED, ICAP_PASSED, ICAP_MODIFIED, ICAP_BLOCKED, ICAP_FAILED.
   * Field introduced in 20.1.1.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(String  action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Logs for the http request's content sent to the icap server.
   * Field introduced in 20.1.1.
   * @return requestLogs
   */
  @VsoMethod
  public List<IcapRequestLog> getRequestLogs() {
    return requestLogs;
  }

  /**
   * This is the setter method. this will set the requestLogs
   * Logs for the http request's content sent to the icap server.
   * Field introduced in 20.1.1.
   * @return requestLogs
   */
  @VsoMethod
  public void setRequestLogs(List<IcapRequestLog>  requestLogs) {
    this.requestLogs = requestLogs;
  }

  /**
   * This is the setter method this will set the requestLogs
   * Logs for the http request's content sent to the icap server.
   * Field introduced in 20.1.1.
   * @return requestLogs
   */
  @VsoMethod
  public IcapLog addRequestLogsItem(IcapRequestLog requestLogsItem) {
    if (this.requestLogs == null) {
      this.requestLogs = new ArrayList<IcapRequestLog>();
    }
    this.requestLogs.add(requestLogsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  IcapLog objIcapLog = (IcapLog) o;
  return   Objects.equals(this.action, objIcapLog.action)&&
  Objects.equals(this.requestLogs, objIcapLog.requestLogs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IcapLog {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    requestLogs: ").append(toIndentedString(requestLogs)).append("\n");
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

