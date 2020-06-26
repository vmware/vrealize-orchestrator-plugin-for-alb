package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.VirtualServiceResource;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VsAwaitingSeEventDetails is a POJO class extends AviRestResource that used for creating
 * VsAwaitingSeEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VsAwaitingSeEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_VSAWAITINGSEEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VsAwaitingSeEventDetails extends AviRestResource {
  @JsonProperty("awaitingse_timeout")
  @JsonInclude(Include.NON_NULL)
  private Integer awaitingseTimeout = null;

  @JsonProperty("ip")
  @JsonInclude(Include.NON_NULL)
  private String ip = null;

  @JsonProperty("se_assigned")
  @JsonInclude(Include.NON_NULL)
  private List<VipSeAssigned> seAssigned = null;

  @JsonProperty("se_requested")
  @JsonInclude(Include.NON_NULL)
  private VirtualServiceResource seRequested = null;

  @JsonProperty("vs_uuid")
  @JsonInclude(Include.NON_NULL)
  private String vsUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property awaitingse_timeout of obj type vsawaitingseeventdetails field type str  type integer.
   * @return awaitingseTimeout
   */
  @VsoMethod
  public Integer getAwaitingseTimeout() {
    return awaitingseTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property awaitingse_timeout of obj type vsawaitingseeventdetails field type str  type integer.
   * @param awaitingseTimeout set the awaitingseTimeout.
   */
  @VsoMethod
  public void setAwaitingseTimeout(Integer  awaitingseTimeout) {
    this.awaitingseTimeout = awaitingseTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property ip of obj type vsawaitingseeventdetails field type str  type string.
   * @return ip
   */
  @VsoMethod
  public String getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property ip of obj type vsawaitingseeventdetails field type str  type string.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(String  ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_assigned of obj type vsawaitingseeventdetails field type str  type array.
   * @return seAssigned
   */
  @VsoMethod
  public List<VipSeAssigned> getSeAssigned() {
    return seAssigned;
  }

  /**
   * This is the setter method. this will set the seAssigned
   * Placeholder for description of property se_assigned of obj type vsawaitingseeventdetails field type str  type array.
   * @return seAssigned
   */
  @VsoMethod
  public void setSeAssigned(List<VipSeAssigned>  seAssigned) {
    this.seAssigned = seAssigned;
  }

  /**
   * This is the setter method this will set the seAssigned
   * Placeholder for description of property se_assigned of obj type vsawaitingseeventdetails field type str  type array.
   * @return seAssigned
   */
  @VsoMethod
  public VsAwaitingSeEventDetails addSeAssignedItem(VipSeAssigned seAssignedItem) {
    if (this.seAssigned == null) {
      this.seAssigned = new ArrayList<VipSeAssigned>();
    }
    this.seAssigned.add(seAssignedItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_requested of obj type vsawaitingseeventdetails field type str  type ref.
   * @return seRequested
   */
  @VsoMethod
  public VirtualServiceResource getSeRequested() {
    return seRequested;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property se_requested of obj type vsawaitingseeventdetails field type str  type ref.
   * @param seRequested set the seRequested.
   */
  @VsoMethod
  public void setSeRequested(VirtualServiceResource seRequested) {
    this.seRequested = seRequested;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of vs.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of vs.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VsAwaitingSeEventDetails objVsAwaitingSeEventDetails = (VsAwaitingSeEventDetails) o;
  return   Objects.equals(this.seAssigned, objVsAwaitingSeEventDetails.seAssigned)&&
  Objects.equals(this.seRequested, objVsAwaitingSeEventDetails.seRequested)&&
  Objects.equals(this.vsUuid, objVsAwaitingSeEventDetails.vsUuid)&&
  Objects.equals(this.awaitingseTimeout, objVsAwaitingSeEventDetails.awaitingseTimeout)&&
  Objects.equals(this.ip, objVsAwaitingSeEventDetails.ip);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VsAwaitingSeEventDetails {\n");
      sb.append("    awaitingseTimeout: ").append(toIndentedString(awaitingseTimeout)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    seAssigned: ").append(toIndentedString(seAssigned)).append("\n");
        sb.append("    seRequested: ").append(toIndentedString(seRequested)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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
