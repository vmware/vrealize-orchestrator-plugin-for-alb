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
 * The RmAddNetworksEventDetails is a POJO class extends AviRestResource that used for creating
 * RmAddNetworksEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RmAddNetworksEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_RMADDNETWORKSEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RmAddNetworksEventDetails extends AviRestResource {
  @JsonProperty("networks")
  @JsonInclude(Include.NON_NULL)
  private List<RmAddVnic> networks = null;

  @JsonProperty("reason")
  @JsonInclude(Include.NON_NULL)
  private String reason = null;

  @JsonProperty("se_name")
  @JsonInclude(Include.NON_NULL)
  private String seName = null;

  @JsonProperty("se_uuid")
  @JsonInclude(Include.NON_NULL)
  private String seUuid = null;

  @JsonProperty("vs_name")
  @JsonInclude(Include.NON_NULL)
  private List<String> vsName = null;

  @JsonProperty("vs_uuid")
  @JsonInclude(Include.NON_NULL)
  private List<String> vsUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property networks of obj type rmaddnetworkseventdetails field type str  type array.
   * @return networks
   */
  @VsoMethod
  public List<RmAddVnic> getNetworks() {
    return networks;
  }

  /**
   * This is the setter method. this will set the networks
   * Placeholder for description of property networks of obj type rmaddnetworkseventdetails field type str  type array.
   * @return networks
   */
  @VsoMethod
  public void setNetworks(List<RmAddVnic>  networks) {
    this.networks = networks;
  }

  /**
   * This is the setter method this will set the networks
   * Placeholder for description of property networks of obj type rmaddnetworkseventdetails field type str  type array.
   * @return networks
   */
  @VsoMethod
  public RmAddNetworksEventDetails addNetworksItem(RmAddVnic networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<RmAddVnic>();
    }
    this.networks.add(networksItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property reason of obj type rmaddnetworkseventdetails field type str  type string.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property reason of obj type rmaddnetworkseventdetails field type str  type string.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_name of obj type rmaddnetworkseventdetails field type str  type string.
   * @return seName
   */
  @VsoMethod
  public String getSeName() {
    return seName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property se_name of obj type rmaddnetworkseventdetails field type str  type string.
   * @param seName set the seName.
   */
  @VsoMethod
  public void setSeName(String  seName) {
    this.seName = seName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of se.
   * @return seUuid
   */
  @VsoMethod
  public String getSeUuid() {
    return seUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of se.
   * @param seUuid set the seUuid.
   */
  @VsoMethod
  public void setSeUuid(String  seUuid) {
    this.seUuid = seUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vs_name of obj type rmaddnetworkseventdetails field type str  type array.
   * @return vsName
   */
  @VsoMethod
  public List<String> getVsName() {
    return vsName;
  }

  /**
   * This is the setter method. this will set the vsName
   * Placeholder for description of property vs_name of obj type rmaddnetworkseventdetails field type str  type array.
   * @return vsName
   */
  @VsoMethod
  public void setVsName(List<String>  vsName) {
    this.vsName = vsName;
  }

  /**
   * This is the setter method this will set the vsName
   * Placeholder for description of property vs_name of obj type rmaddnetworkseventdetails field type str  type array.
   * @return vsName
   */
  @VsoMethod
  public RmAddNetworksEventDetails addVsNameItem(String vsNameItem) {
    if (this.vsName == null) {
      this.vsName = new ArrayList<String>();
    }
    this.vsName.add(vsNameItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of vs.
   * @return vsUuid
   */
  @VsoMethod
  public List<String> getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method. this will set the vsUuid
   * Unique object identifier of vs.
   * @return vsUuid
   */
  @VsoMethod
  public void setVsUuid(List<String>  vsUuid) {
    this.vsUuid = vsUuid;
  }

  /**
   * This is the setter method this will set the vsUuid
   * Unique object identifier of vs.
   * @return vsUuid
   */
  @VsoMethod
  public RmAddNetworksEventDetails addVsUuidItem(String vsUuidItem) {
    if (this.vsUuid == null) {
      this.vsUuid = new ArrayList<String>();
    }
    this.vsUuid.add(vsUuidItem);
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
  RmAddNetworksEventDetails objRmAddNetworksEventDetails = (RmAddNetworksEventDetails) o;
  return   Objects.equals(this.seUuid, objRmAddNetworksEventDetails.seUuid)&&
  Objects.equals(this.seName, objRmAddNetworksEventDetails.seName)&&
  Objects.equals(this.networks, objRmAddNetworksEventDetails.networks)&&
  Objects.equals(this.vsName, objRmAddNetworksEventDetails.vsName)&&
  Objects.equals(this.vsUuid, objRmAddNetworksEventDetails.vsUuid)&&
  Objects.equals(this.reason, objRmAddNetworksEventDetails.reason);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RmAddNetworksEventDetails {\n");
      sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
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

