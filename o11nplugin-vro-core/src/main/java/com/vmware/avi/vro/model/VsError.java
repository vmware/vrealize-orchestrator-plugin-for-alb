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
 * The VsError is a POJO class extends AviRestResource that used for creating
 * VsError.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VsError")
@VsoFinder(name = Constants.FINDER_VRO_VSERROR)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VsError extends AviRestResource {
    @JsonProperty("event_timestamp")
    @JsonInclude(Include.NON_NULL)
    private TimeStamp eventTimestamp = null;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private List<String> reason = null;

    @JsonProperty("se_group_ha_mode")
    @JsonInclude(Include.NON_NULL)
    private String seGroupHaMode = null;

    @JsonProperty("se_group_ref")
    @JsonInclude(Include.NON_NULL)
    private String seGroupRef = null;

    @JsonProperty("se_ref")
    @JsonInclude(Include.NON_NULL)
    private String seRef = null;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("traffic_status")
    @JsonInclude(Include.NON_NULL)
    private String trafficStatus = null;

    @JsonProperty("vip_id")
    @JsonInclude(Include.NON_NULL)
    private String vipId = null;

    @JsonProperty("vs_ref")
    @JsonInclude(Include.NON_NULL)
    private String vsRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * The time at which the error occurred.
   * Field introduced in 18.2.10, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventTimestamp
   */
  @VsoMethod
  public TimeStamp getEventTimestamp() {
    return eventTimestamp;
  }

  /**
   * This is the setter method to the attribute.
   * The time at which the error occurred.
   * Field introduced in 18.2.10, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param eventTimestamp set the eventTimestamp.
   */
  @VsoMethod
  public void setEventTimestamp(TimeStamp eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property reason of obj type vserror field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public List<String> getReason() {
    return reason;
  }

  /**
   * This is the setter method. this will set the reason
   * Placeholder for description of property reason of obj type vserror field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public void setReason(List<String>  reason) {
    this.reason = reason;
  }

  /**
   * This is the setter method this will set the reason
   * Placeholder for description of property reason of obj type vserror field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public VsError addReasonItem(String reasonItem) {
    if (this.reason == null) {
      this.reason = new ArrayList<String>();
    }
    this.reason.add(reasonItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupHaMode
   */
  @VsoMethod
  public String getSeGroupHaMode() {
    return seGroupHaMode;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGroupHaMode set the seGroupHaMode.
   */
  @VsoMethod
  public void setSeGroupHaMode(String  seGroupHaMode) {
    this.seGroupHaMode = seGroupHaMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceenginegroup.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupRef
   */
  @VsoMethod
  public String getSeGroupRef() {
    return seGroupRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type serviceenginegroup.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGroupRef set the seGroupRef.
   */
  @VsoMethod
  public void setSeGroupRef(String  seGroupRef) {
    this.seGroupRef = seGroupRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The se on which the vs errored during scale-in/scale-out operations.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.10, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seRef
   */
  @VsoMethod
  public String getSeRef() {
    return seRef;
  }

  /**
   * This is the setter method to the attribute.
   * The se on which the vs errored during scale-in/scale-out operations.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.10, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seRef set the seRef.
   */
  @VsoMethod
  public void setSeRef(String  seRef) {
    this.seRef = seRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - TRAFFIC_DISRUPTED, TRAFFIC_NOT_DISRUPTED.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return trafficStatus
   */
  @VsoMethod
  public String getTrafficStatus() {
    return trafficStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - TRAFFIC_DISRUPTED, TRAFFIC_NOT_DISRUPTED.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param trafficStatus set the trafficStatus.
   */
  @VsoMethod
  public void setTrafficStatus(String  trafficStatus) {
    this.trafficStatus = trafficStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vip_id of obj type vserror field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipId
   */
  @VsoMethod
  public String getVipId() {
    return vipId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vip_id of obj type vserror field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipId set the vipId.
   */
  @VsoMethod
  public void setVipId(String  vipId) {
    this.vipId = vipId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type virtualservice.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsRef
   */
  @VsoMethod
  public String getVsRef() {
    return vsRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type virtualservice.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsRef set the vsRef.
   */
  @VsoMethod
  public void setVsRef(String  vsRef) {
    this.vsRef = vsRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VsError objVsError = (VsError) o;
  return   Objects.equals(this.vsRef, objVsError.vsRef)&&
  Objects.equals(this.seGroupRef, objVsError.seGroupRef)&&
  Objects.equals(this.seGroupHaMode, objVsError.seGroupHaMode)&&
  Objects.equals(this.tenantRef, objVsError.tenantRef)&&
  Objects.equals(this.trafficStatus, objVsError.trafficStatus)&&
  Objects.equals(this.reason, objVsError.reason)&&
  Objects.equals(this.vipId, objVsError.vipId)&&
  Objects.equals(this.seRef, objVsError.seRef)&&
  Objects.equals(this.eventTimestamp, objVsError.eventTimestamp);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VsError {\n");
      sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    seGroupHaMode: ").append(toIndentedString(seGroupHaMode)).append("\n");
        sb.append("    seGroupRef: ").append(toIndentedString(seGroupRef)).append("\n");
        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    trafficStatus: ").append(toIndentedString(trafficStatus)).append("\n");
        sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
        sb.append("    vsRef: ").append(toIndentedString(vsRef)).append("\n");
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

