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
 * The CfgState is a POJO class extends AviRestResource that used for creating
 * CfgState.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CfgState")
@VsoFinder(name = Constants.FINDER_VRO_CFGSTATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CfgState extends AviRestResource {
    @JsonProperty("cfg_version")
    @JsonInclude(Include.NON_NULL)
    private Integer cfgVersion = null;

    @JsonProperty("cfg_version_in_flight")
    @JsonInclude(Include.NON_NULL)
    private Integer cfgVersionInFlight = null;

    @JsonProperty("last_changed_time")
    @JsonInclude(Include.NON_NULL)
    private TimeStamp lastChangedTime = null;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason = null;

    @JsonProperty("site_uuid")
    @JsonInclude(Include.NON_NULL)
    private String siteUuid = null;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status = "SYSERR_SUCCESS";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Cfg-version synced to follower.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cfgVersion
   */
  @VsoMethod
  public Integer getCfgVersion() {
    return cfgVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Cfg-version synced to follower.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cfgVersion set the cfgVersion.
   */
  @VsoMethod
  public void setCfgVersion(Integer  cfgVersion) {
    this.cfgVersion = cfgVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cfg-version in flight to follower.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cfgVersionInFlight
   */
  @VsoMethod
  public Integer getCfgVersionInFlight() {
    return cfgVersionInFlight;
  }

  /**
   * This is the setter method to the attribute.
   * Cfg-version in flight to follower.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cfgVersionInFlight set the cfgVersionInFlight.
   */
  @VsoMethod
  public void setCfgVersionInFlight(Integer  cfgVersionInFlight) {
    this.cfgVersionInFlight = cfgVersionInFlight;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property last_changed_time of obj type cfgstate field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastChangedTime
   */
  @VsoMethod
  public TimeStamp getLastChangedTime() {
    return lastChangedTime;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property last_changed_time of obj type cfgstate field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastChangedTime set the lastChangedTime.
   */
  @VsoMethod
  public void setLastChangedTime(TimeStamp lastChangedTime) {
    this.lastChangedTime = lastChangedTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property reason of obj type cfgstate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property reason of obj type cfgstate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Site_uuid to which the object was synced.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return siteUuid
   */
  @VsoMethod
  public String getSiteUuid() {
    return siteUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Site_uuid to which the object was synced.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param siteUuid set the siteUuid.
   */
  @VsoMethod
  public void setSiteUuid(String  siteUuid) {
    this.siteUuid = siteUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Status of the object.
   * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
   * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
   * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_BAD_REQUEST, SYSERR_TEST1...
   * Default value when not specified in API or module is interpreted by Avi Controller as "SYSERR_SUCCESS".
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Status of the object.
   * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
   * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
   * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_BAD_REQUEST, SYSERR_TEST1...
   * Default value when not specified in API or module is interpreted by Avi Controller as "SYSERR_SUCCESS".
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Object-uuid that is being synced to follower.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Object-uuid that is being synced to follower.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CfgState objCfgState = (CfgState) o;
  return   Objects.equals(this.uuid, objCfgState.uuid)&&
  Objects.equals(this.cfgVersion, objCfgState.cfgVersion)&&
  Objects.equals(this.cfgVersionInFlight, objCfgState.cfgVersionInFlight)&&
  Objects.equals(this.status, objCfgState.status)&&
  Objects.equals(this.reason, objCfgState.reason)&&
  Objects.equals(this.siteUuid, objCfgState.siteUuid)&&
  Objects.equals(this.lastChangedTime, objCfgState.lastChangedTime);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CfgState {\n");
      sb.append("    cfgVersion: ").append(toIndentedString(cfgVersion)).append("\n");
        sb.append("    cfgVersionInFlight: ").append(toIndentedString(cfgVersionInFlight)).append("\n");
        sb.append("    lastChangedTime: ").append(toIndentedString(lastChangedTime)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    siteUuid: ").append(toIndentedString(siteUuid)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

