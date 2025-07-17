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
 * The VipAction is a POJO class extends AviRestResource that used for creating
 * VipAction.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VipAction")
@VsoFinder(name = Constants.FINDER_VRO_VIPACTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VipAction extends AviRestResource {
    @JsonProperty("action")
    @JsonInclude(Include.NON_NULL)
    private String action;

    @JsonProperty("from_se")
    @JsonInclude(Include.NON_NULL)
    private String fromSe;

    @JsonProperty("new_vcpus")
    @JsonInclude(Include.NON_NULL)
    private Integer newVcpus;

    @JsonProperty("se_list")
    @JsonInclude(Include.NON_NULL)
    private List<String> seList;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status;

    @JsonProperty("timestamp")
    @JsonInclude(Include.NON_NULL)
    private Integer timestamp;

    @JsonProperty("to_new_se")
    @JsonInclude(Include.NON_NULL)
    private Boolean toNewSe;

    @JsonProperty("to_se")
    @JsonInclude(Include.NON_NULL)
    private String toSe;

    @JsonProperty("vip_id")
    @JsonInclude(Include.NON_NULL)
    private String vipId;

    @JsonProperty("vip_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vipUuid;

    @JsonProperty("vs_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vsUuid;

    @JsonProperty("waiting_for_sibling")
    @JsonInclude(Include.NON_NULL)
    private Boolean waitingForSibling = false;



  /**
   * This is the getter method this will return the attribute value.
   * Enum options - PLACEMENT_ORCHESTRATOR_VIP_MIGRATE, PLACEMENT_ORCHESTRATOR_VIP_SCALEOUT, PLACEMENT_ORCHESTRATOR_VIP_SCALEIN,
   * PLACEMENT_ORCHESTRATOR_VIP_FORCE_SCALEIN.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return action
   */
  @VsoMethod
  public String getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - PLACEMENT_ORCHESTRATOR_VIP_MIGRATE, PLACEMENT_ORCHESTRATOR_VIP_SCALEOUT, PLACEMENT_ORCHESTRATOR_VIP_SCALEIN,
   * PLACEMENT_ORCHESTRATOR_VIP_FORCE_SCALEIN.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(String  action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fromSe
   */
  @VsoMethod
  public String getFromSe() {
    return fromSe;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fromSe set the fromSe.
   */
  @VsoMethod
  public void setFromSe(String  fromSe) {
    this.fromSe = fromSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return newVcpus
   */
  @VsoMethod
  public Integer getNewVcpus() {
    return newVcpus;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param newVcpus set the newVcpus.
   */
  @VsoMethod
  public void setNewVcpus(Integer  newVcpus) {
    this.newVcpus = newVcpus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seList
   */
  @VsoMethod
  public List<String> getSeList() {
    return seList;
  }

  /**
   * This is the setter method. this will set the seList
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seList
   */
  @VsoMethod
  public void setSeList(List<String>  seList) {
    this.seList = seList;
  }

  /**
   * This is the setter method this will set the seList
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seList
   */
  @VsoMethod
  public VipAction addSeListItem(String seListItem) {
    if (this.seList == null) {
      this.seList = new ArrayList<String>();
    }
    this.seList.add(seListItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return timestamp
   */
  @VsoMethod
  public Integer getTimestamp() {
    return timestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param timestamp set the timestamp.
   */
  @VsoMethod
  public void setTimestamp(Integer  timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return toNewSe
   */
  @VsoMethod
  public Boolean getToNewSe() {
    return toNewSe;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param toNewSe set the toNewSe.
   */
  @VsoMethod
  public void setToNewSe(Boolean  toNewSe) {
    this.toNewSe = toNewSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return toSe
   */
  @VsoMethod
  public String getToSe() {
    return toSe;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param toSe set the toSe.
   */
  @VsoMethod
  public void setToSe(String  toSe) {
    this.toSe = toSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipId
   */
  @VsoMethod
  public String getVipId() {
    return vipId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipId set the vipId.
   */
  @VsoMethod
  public void setVipId(String  vipId) {
    this.vipId = vipId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipUuid
   */
  @VsoMethod
  public String getVipUuid() {
    return vipUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipUuid set the vipUuid.
   */
  @VsoMethod
  public void setVipUuid(String  vipUuid) {
    this.vipUuid = vipUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return waitingForSibling
   */
  @VsoMethod
  public Boolean getWaitingForSibling() {
    return waitingForSibling;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param waitingForSibling set the waitingForSibling.
   */
  @VsoMethod
  public void setWaitingForSibling(Boolean  waitingForSibling) {
    this.waitingForSibling = waitingForSibling;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VipAction objVipAction = (VipAction) o;
  return   Objects.equals(this.vsUuid, objVipAction.vsUuid)&&
  Objects.equals(this.vipUuid, objVipAction.vipUuid)&&
  Objects.equals(this.vipId, objVipAction.vipId)&&
  Objects.equals(this.action, objVipAction.action)&&
  Objects.equals(this.fromSe, objVipAction.fromSe)&&
  Objects.equals(this.status, objVipAction.status)&&
  Objects.equals(this.timestamp, objVipAction.timestamp)&&
  Objects.equals(this.toSe, objVipAction.toSe)&&
  Objects.equals(this.seList, objVipAction.seList)&&
  Objects.equals(this.waitingForSibling, objVipAction.waitingForSibling)&&
  Objects.equals(this.toNewSe, objVipAction.toNewSe)&&
  Objects.equals(this.newVcpus, objVipAction.newVcpus);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VipAction {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    fromSe: ").append(toIndentedString(fromSe)).append("\n");
        sb.append("    newVcpus: ").append(toIndentedString(newVcpus)).append("\n");
        sb.append("    seList: ").append(toIndentedString(seList)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    toNewSe: ").append(toIndentedString(toNewSe)).append("\n");
        sb.append("    toSe: ").append(toIndentedString(toSe)).append("\n");
        sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
        sb.append("    vipUuid: ").append(toIndentedString(vipUuid)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
        sb.append("    waitingForSibling: ").append(toIndentedString(waitingForSibling)).append("\n");
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

