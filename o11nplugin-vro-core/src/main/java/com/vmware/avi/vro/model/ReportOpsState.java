package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.TimeStamp;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ReportOpsState is a POJO class extends AviRestResource that used for creating
 * ReportOpsState.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ReportOpsState")
@VsoFinder(name = Constants.FINDER_VRO_REPORTOPSSTATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ReportOpsState extends AviRestResource {
    @JsonProperty("last_changed_time")
    @JsonInclude(Include.NON_NULL)
    private TimeStamp lastChangedTime = null;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason = null;

    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private String state = null;



  /**
   * This is the getter method this will return the attribute value.
   * The last time the state changed.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastChangedTime
   */
  @VsoMethod
  public TimeStamp getLastChangedTime() {
    return lastChangedTime;
  }

  /**
   * This is the setter method to the attribute.
   * The last time the state changed.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastChangedTime set the lastChangedTime.
   */
  @VsoMethod
  public void setLastChangedTime(TimeStamp lastChangedTime) {
    this.lastChangedTime = lastChangedTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Descriptive reason for the state-change.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Descriptive reason for the state-change.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The system operation's current fsm-state.
   * Enum options - SYSTEM_REPORT_STARTED, SYSTEM_REPORT_IN_PROGRESS, SYSTEM_REPORT_SUCCESS, SYSTEM_REPORT_WARNING, SYSTEM_REPORT_ERROR.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public String getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * The system operation's current fsm-state.
   * Enum options - SYSTEM_REPORT_STARTED, SYSTEM_REPORT_IN_PROGRESS, SYSTEM_REPORT_SUCCESS, SYSTEM_REPORT_WARNING, SYSTEM_REPORT_ERROR.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
  ReportOpsState objReportOpsState = (ReportOpsState) o;
  return   Objects.equals(this.state, objReportOpsState.state)&&
  Objects.equals(this.lastChangedTime, objReportOpsState.lastChangedTime)&&
  Objects.equals(this.reason, objReportOpsState.reason);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ReportOpsState {\n");
      sb.append("    lastChangedTime: ").append(toIndentedString(lastChangedTime)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

