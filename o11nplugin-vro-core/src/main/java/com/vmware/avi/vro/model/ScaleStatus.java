package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.VipPlacementResolutionInfo;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ScaleStatus is a POJO class extends AviRestResource that used for creating
 * ScaleStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ScaleStatus")
@VsoFinder(name = Constants.FINDER_VRO_SCALESTATUS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ScaleStatus extends AviRestResource {
    @JsonProperty("action")
    @JsonInclude(Include.NON_NULL)
    private String action = null;

    @JsonProperty("action_success")
    @JsonInclude(Include.NON_NULL)
    private Boolean actionSuccess = null;

    @JsonProperty("end_time_str")
    @JsonInclude(Include.NON_NULL)
    private String endTimeStr = null;

    @JsonProperty("num_se_assigned")
    @JsonInclude(Include.NON_NULL)
    private Integer numSeAssigned = null;

    @JsonProperty("num_se_requested")
    @JsonInclude(Include.NON_NULL)
    private Integer numSeRequested = null;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private List<String> reason = null;

    @JsonProperty("reason_code")
    @JsonInclude(Include.NON_NULL)
    private Integer reasonCode = null;

    @JsonProperty("reason_code_string")
    @JsonInclude(Include.NON_NULL)
    private String reasonCodeString = null;

    @JsonProperty("scale_se")
    @JsonInclude(Include.NON_NULL)
    private String scaleSe = null;

    @JsonProperty("start_time_str")
    @JsonInclude(Include.NON_NULL)
    private String startTimeStr = null;

    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private String state = null;

    @JsonProperty("vip_placement_resolution_info")
    @JsonInclude(Include.NON_NULL)
    private VipPlacementResolutionInfo vipPlacementResolutionInfo = null;



  /**
   * This is the getter method this will return the attribute value.
   * Enum options - OTHER, CREATE, READ, UPDATE, DELETE, SCALE_OUT, SCALE_IN, SE_REMOVED, SE_DISCONNECT, SE_RECONNECT, WARM_RESTART, COLD_RESTART,
   * UPDATE_LOGMGR_MAP, MIGRATE_SCALEOUT, MIGRATE_SCALEIN, INITIAL_PLACEMENT, ROTATE_KEYS, GLB_MGR_UPDATE, UPDATE_DNS_RECORDS, SCALEOUT_ADMINUP...
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return action
   */
  @VsoMethod
  public String getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - OTHER, CREATE, READ, UPDATE, DELETE, SCALE_OUT, SCALE_IN, SE_REMOVED, SE_DISCONNECT, SE_RECONNECT, WARM_RESTART, COLD_RESTART,
   * UPDATE_LOGMGR_MAP, MIGRATE_SCALEOUT, MIGRATE_SCALEIN, INITIAL_PLACEMENT, ROTATE_KEYS, GLB_MGR_UPDATE, UPDATE_DNS_RECORDS, SCALEOUT_ADMINUP...
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(String  action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actionSuccess
   */
  @VsoMethod
  public Boolean getActionSuccess() {
    return actionSuccess;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param actionSuccess set the actionSuccess.
   */
  @VsoMethod
  public void setActionSuccess(Boolean  actionSuccess) {
    this.actionSuccess = actionSuccess;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property end_time_str of obj type scalestatus field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return endTimeStr
   */
  @VsoMethod
  public String getEndTimeStr() {
    return endTimeStr;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property end_time_str of obj type scalestatus field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param endTimeStr set the endTimeStr.
   */
  @VsoMethod
  public void setEndTimeStr(String  endTimeStr) {
    this.endTimeStr = endTimeStr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_se_assigned of obj type scalestatus field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numSeAssigned
   */
  @VsoMethod
  public Integer getNumSeAssigned() {
    return numSeAssigned;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_se_assigned of obj type scalestatus field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numSeAssigned set the numSeAssigned.
   */
  @VsoMethod
  public void setNumSeAssigned(Integer  numSeAssigned) {
    this.numSeAssigned = numSeAssigned;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_se_requested of obj type scalestatus field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numSeRequested
   */
  @VsoMethod
  public Integer getNumSeRequested() {
    return numSeRequested;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_se_requested of obj type scalestatus field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numSeRequested set the numSeRequested.
   */
  @VsoMethod
  public void setNumSeRequested(Integer  numSeRequested) {
    this.numSeRequested = numSeRequested;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property reason of obj type scalestatus field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public List<String> getReason() {
    return reason;
  }

  /**
   * This is the setter method. this will set the reason
   * Placeholder for description of property reason of obj type scalestatus field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public void setReason(List<String>  reason) {
    this.reason = reason;
  }

  /**
   * This is the setter method this will set the reason
   * Placeholder for description of property reason of obj type scalestatus field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public ScaleStatus addReasonItem(String reasonItem) {
    if (this.reason == null) {
      this.reason = new ArrayList<String>();
    }
    this.reason.add(reasonItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property reason_code of obj type scalestatus field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reasonCode
   */
  @VsoMethod
  public Integer getReasonCode() {
    return reasonCode;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property reason_code of obj type scalestatus field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reasonCode set the reasonCode.
   */
  @VsoMethod
  public void setReasonCode(Integer  reasonCode) {
    this.reasonCode = reasonCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property reason_code_string of obj type scalestatus field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reasonCodeString
   */
  @VsoMethod
  public String getReasonCodeString() {
    return reasonCodeString;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property reason_code_string of obj type scalestatus field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reasonCodeString set the reasonCodeString.
   */
  @VsoMethod
  public void setReasonCodeString(String  reasonCodeString) {
    this.reasonCodeString = reasonCodeString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property scale_se of obj type scalestatus field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scaleSe
   */
  @VsoMethod
  public String getScaleSe() {
    return scaleSe;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property scale_se of obj type scalestatus field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param scaleSe set the scaleSe.
   */
  @VsoMethod
  public void setScaleSe(String  scaleSe) {
    this.scaleSe = scaleSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property start_time_str of obj type scalestatus field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return startTimeStr
   */
  @VsoMethod
  public String getStartTimeStr() {
    return startTimeStr;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property start_time_str of obj type scalestatus field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param startTimeStr set the startTimeStr.
   */
  @VsoMethod
  public void setStartTimeStr(String  startTimeStr) {
    this.startTimeStr = startTimeStr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - SCALEOUT_PROCESSING, SCALEOUT_AWAITING_SE_ASSIGNMENT, SCALEOUT_AWAITING_ADMINUP, SCALEOUT_CREATING_SE,
   * SCALEOUT_ADMINUP_AWAITING_CLOUD_ATTACH, SCALEOUT_RESOURCES, SCALEOUT_AWAITING_CLOUD_ATTACH, SCALEOUT_AWAITING_SE_PROGRAMMING,
   * SCALEOUT_AWAITING_SE_READY, SCALEOUT_WAIT_FOR_SE_READY, SCALEOUT_SUCCESS, SCALEOUT_ERROR, SCALEOUT_ROLLBACK, SCALEOUT_ERROR_DISABLED,
   * SCALEIN_AWAITING_SE_READY, SCALEIN_AWAITING_SE_PRE_RELEASE, SCALEIN_AWAITING_PRIMARY_SWITCHOVER, SCALEIN_AWAITING_SE_PROGRAMMING,
   * SCALEIN_AWAITING_CLOUD_DETACH, SCALEIN_WAIT_FOR_SE_READY...
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public String getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - SCALEOUT_PROCESSING, SCALEOUT_AWAITING_SE_ASSIGNMENT, SCALEOUT_AWAITING_ADMINUP, SCALEOUT_CREATING_SE,
   * SCALEOUT_ADMINUP_AWAITING_CLOUD_ATTACH, SCALEOUT_RESOURCES, SCALEOUT_AWAITING_CLOUD_ATTACH, SCALEOUT_AWAITING_SE_PROGRAMMING,
   * SCALEOUT_AWAITING_SE_READY, SCALEOUT_WAIT_FOR_SE_READY, SCALEOUT_SUCCESS, SCALEOUT_ERROR, SCALEOUT_ROLLBACK, SCALEOUT_ERROR_DISABLED,
   * SCALEIN_AWAITING_SE_READY, SCALEIN_AWAITING_SE_PRE_RELEASE, SCALEIN_AWAITING_PRIMARY_SWITCHOVER, SCALEIN_AWAITING_SE_PROGRAMMING,
   * SCALEIN_AWAITING_CLOUD_DETACH, SCALEIN_WAIT_FOR_SE_READY...
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(String  state) {
    this.state = state;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vip_placement_resolution_info of obj type scalestatus field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipPlacementResolutionInfo
   */
  @VsoMethod
  public VipPlacementResolutionInfo getVipPlacementResolutionInfo() {
    return vipPlacementResolutionInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vip_placement_resolution_info of obj type scalestatus field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipPlacementResolutionInfo set the vipPlacementResolutionInfo.
   */
  @VsoMethod
  public void setVipPlacementResolutionInfo(VipPlacementResolutionInfo vipPlacementResolutionInfo) {
    this.vipPlacementResolutionInfo = vipPlacementResolutionInfo;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ScaleStatus objScaleStatus = (ScaleStatus) o;
  return   Objects.equals(this.state, objScaleStatus.state)&&
  Objects.equals(this.reason, objScaleStatus.reason)&&
  Objects.equals(this.reasonCode, objScaleStatus.reasonCode)&&
  Objects.equals(this.scaleSe, objScaleStatus.scaleSe)&&
  Objects.equals(this.numSeRequested, objScaleStatus.numSeRequested)&&
  Objects.equals(this.numSeAssigned, objScaleStatus.numSeAssigned)&&
  Objects.equals(this.reasonCodeString, objScaleStatus.reasonCodeString)&&
  Objects.equals(this.vipPlacementResolutionInfo, objScaleStatus.vipPlacementResolutionInfo)&&
  Objects.equals(this.startTimeStr, objScaleStatus.startTimeStr)&&
  Objects.equals(this.endTimeStr, objScaleStatus.endTimeStr)&&
  Objects.equals(this.action, objScaleStatus.action)&&
  Objects.equals(this.actionSuccess, objScaleStatus.actionSuccess);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ScaleStatus {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    actionSuccess: ").append(toIndentedString(actionSuccess)).append("\n");
        sb.append("    endTimeStr: ").append(toIndentedString(endTimeStr)).append("\n");
        sb.append("    numSeAssigned: ").append(toIndentedString(numSeAssigned)).append("\n");
        sb.append("    numSeRequested: ").append(toIndentedString(numSeRequested)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
        sb.append("    reasonCodeString: ").append(toIndentedString(reasonCodeString)).append("\n");
        sb.append("    scaleSe: ").append(toIndentedString(scaleSe)).append("\n");
        sb.append("    startTimeStr: ").append(toIndentedString(startTimeStr)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    vipPlacementResolutionInfo: ").append(toIndentedString(vipPlacementResolutionInfo)).append("\n");
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

