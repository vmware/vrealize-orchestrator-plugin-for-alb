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
 * The ServerAutoScaleOutCompleteInfo is a POJO class extends AviRestResource that used for creating
 * ServerAutoScaleOutCompleteInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ServerAutoScaleOutCompleteInfo")
@VsoFinder(name = Constants.FINDER_VRO_SERVERAUTOSCALEOUTCOMPLETEINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ServerAutoScaleOutCompleteInfo extends AviRestResource {
    @JsonProperty("launch_config_uuid")
    @JsonInclude(Include.NON_NULL)
    private String launchConfigUuid = null;

    @JsonProperty("nscaleout")
    @JsonInclude(Include.NON_NULL)
    private Integer nscaleout = null;

    @JsonProperty("pool_ref")
    @JsonInclude(Include.NON_NULL)
    private String poolRef = null;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason = null;

    @JsonProperty("reason_code")
    @JsonInclude(Include.NON_NULL)
    private String reasonCode = "SYSERR_SUCCESS";

    @JsonProperty("scaled_out_servers")
    @JsonInclude(Include.NON_NULL)
    private List<ServerId> scaledOutServers = null;



  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of launch_config.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return launchConfigUuid
   */
  @VsoMethod
  public String getLaunchConfigUuid() {
    return launchConfigUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of launch_config.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param launchConfigUuid set the launchConfigUuid.
   */
  @VsoMethod
  public void setLaunchConfigUuid(String  launchConfigUuid) {
    this.launchConfigUuid = launchConfigUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property nscaleout of obj type serverautoscaleoutcompleteinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nscaleout
   */
  @VsoMethod
  public Integer getNscaleout() {
    return nscaleout;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property nscaleout of obj type serverautoscaleoutcompleteinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nscaleout set the nscaleout.
   */
  @VsoMethod
  public void setNscaleout(Integer  nscaleout) {
    this.nscaleout = nscaleout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the pool.
   * It is a reference to an object of type pool.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolRef
   */
  @VsoMethod
  public String getPoolRef() {
    return poolRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the pool.
   * It is a reference to an object of type pool.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolRef set the poolRef.
   */
  @VsoMethod
  public void setPoolRef(String  poolRef) {
    this.poolRef = poolRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property reason of obj type serverautoscaleoutcompleteinfo field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property reason of obj type serverautoscaleoutcompleteinfo field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
   * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
   * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_BAD_REQUEST...
   * Default value when not specified in API or module is interpreted by Avi Controller as "SYSERR_SUCCESS".
   * @return reasonCode
   */
  @VsoMethod
  public String getReasonCode() {
    return reasonCode;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
   * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
   * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_BAD_REQUEST...
   * Default value when not specified in API or module is interpreted by Avi Controller as "SYSERR_SUCCESS".
   * @param reasonCode set the reasonCode.
   */
  @VsoMethod
  public void setReasonCode(String  reasonCode) {
    this.reasonCode = reasonCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property scaled_out_servers of obj type serverautoscaleoutcompleteinfo field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scaledOutServers
   */
  @VsoMethod
  public List<ServerId> getScaledOutServers() {
    return scaledOutServers;
  }

  /**
   * This is the setter method. this will set the scaledOutServers
   * Placeholder for description of property scaled_out_servers of obj type serverautoscaleoutcompleteinfo field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scaledOutServers
   */
  @VsoMethod
  public void setScaledOutServers(List<ServerId>  scaledOutServers) {
    this.scaledOutServers = scaledOutServers;
  }

  /**
   * This is the setter method this will set the scaledOutServers
   * Placeholder for description of property scaled_out_servers of obj type serverautoscaleoutcompleteinfo field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scaledOutServers
   */
  @VsoMethod
  public ServerAutoScaleOutCompleteInfo addScaledOutServersItem(ServerId scaledOutServersItem) {
    if (this.scaledOutServers == null) {
      this.scaledOutServers = new ArrayList<ServerId>();
    }
    this.scaledOutServers.add(scaledOutServersItem);
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
  ServerAutoScaleOutCompleteInfo objServerAutoScaleOutCompleteInfo = (ServerAutoScaleOutCompleteInfo) o;
  return   Objects.equals(this.poolRef, objServerAutoScaleOutCompleteInfo.poolRef)&&
  Objects.equals(this.nscaleout, objServerAutoScaleOutCompleteInfo.nscaleout)&&
  Objects.equals(this.scaledOutServers, objServerAutoScaleOutCompleteInfo.scaledOutServers)&&
  Objects.equals(this.launchConfigUuid, objServerAutoScaleOutCompleteInfo.launchConfigUuid)&&
  Objects.equals(this.reason, objServerAutoScaleOutCompleteInfo.reason)&&
  Objects.equals(this.reasonCode, objServerAutoScaleOutCompleteInfo.reasonCode);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ServerAutoScaleOutCompleteInfo {\n");
      sb.append("    launchConfigUuid: ").append(toIndentedString(launchConfigUuid)).append("\n");
        sb.append("    nscaleout: ").append(toIndentedString(nscaleout)).append("\n");
        sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
        sb.append("    scaledOutServers: ").append(toIndentedString(scaledOutServers)).append("\n");
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

