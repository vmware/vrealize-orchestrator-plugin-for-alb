package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SeHmEventVsDetails is a POJO class extends AviRestResource that used for creating
 * SeHmEventVsDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeHmEventVsDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEHMEVENTVSDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeHmEventVsDetails extends AviRestResource {
  @JsonProperty("ha_reason")
  @JsonInclude(Include.NON_NULL)
  private String haReason = null;

  @JsonProperty("reason")
  @JsonInclude(Include.NON_NULL)
  private String reason = null;

  @JsonProperty("se_name")
  @JsonInclude(Include.NON_NULL)
  private String seName = null;

  @JsonProperty("src_uuid")
  @JsonInclude(Include.NON_NULL)
  private String srcUuid = null;

  @JsonProperty("vip6_address")
  @JsonInclude(Include.NON_NULL)
  private IpAddr vip6Address = null;

  @JsonProperty("vip_address")
  @JsonInclude(Include.NON_NULL)
  private IpAddr vipAddress = null;

  @JsonProperty("vip_id")
  @JsonInclude(Include.NON_NULL)
  private String vipId = null;

  @JsonProperty("virtual_service")
  @JsonInclude(Include.NON_NULL)
  private String virtualService = null;



  /**
   * This is the getter method this will return the attribute value.
   * Ha compromised reason.
   * @return haReason
   */
  @VsoMethod
  public String getHaReason() {
    return haReason;
  }

  /**
   * This is the setter method to the attribute.
   * Ha compromised reason.
   * @param haReason set the haReason.
   */
  @VsoMethod
  public void setHaReason(String  haReason) {
    this.haReason = haReason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason for virtual service down.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason for virtual service down.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine name.
   * @return seName
   */
  @VsoMethod
  public String getSeName() {
    return seName;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine name.
   * @param seName set the seName.
   */
  @VsoMethod
  public void setSeName(String  seName) {
    this.seName = seName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the event generator.
   * @return srcUuid
   */
  @VsoMethod
  public String getSrcUuid() {
    return srcUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the event generator.
   * @param srcUuid set the srcUuid.
   */
  @VsoMethod
  public void setSrcUuid(String  srcUuid) {
    this.srcUuid = srcUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vip address.
   * @return vip6Address
   */
  @VsoMethod
  public IpAddr getVip6Address() {
    return vip6Address;
  }

  /**
   * This is the setter method to the attribute.
   * Vip address.
   * @param vip6Address set the vip6Address.
   */
  @VsoMethod
  public void setVip6Address(IpAddr vip6Address) {
    this.vip6Address = vip6Address;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vip address.
   * @return vipAddress
   */
  @VsoMethod
  public IpAddr getVipAddress() {
    return vipAddress;
  }

  /**
   * This is the setter method to the attribute.
   * Vip address.
   * @param vipAddress set the vipAddress.
   */
  @VsoMethod
  public void setVipAddress(IpAddr vipAddress) {
    this.vipAddress = vipAddress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vip id.
   * @return vipId
   */
  @VsoMethod
  public String getVipId() {
    return vipId;
  }

  /**
   * This is the setter method to the attribute.
   * Vip id.
   * @param vipId set the vipId.
   */
  @VsoMethod
  public void setVipId(String  vipId) {
    this.vipId = vipId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Virtual service name.
   * It is a reference to an object of type virtualservice.
   * @return virtualService
   */
  @VsoMethod
  public String getVirtualService() {
    return virtualService;
  }

  /**
   * This is the setter method to the attribute.
   * Virtual service name.
   * It is a reference to an object of type virtualservice.
   * @param virtualService set the virtualService.
   */
  @VsoMethod
  public void setVirtualService(String  virtualService) {
    this.virtualService = virtualService;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeHmEventVsDetails objSeHmEventVsDetails = (SeHmEventVsDetails) o;
  return   Objects.equals(this.srcUuid, objSeHmEventVsDetails.srcUuid)&&
  Objects.equals(this.vipId, objSeHmEventVsDetails.vipId)&&
  Objects.equals(this.virtualService, objSeHmEventVsDetails.virtualService)&&
  Objects.equals(this.vipAddress, objSeHmEventVsDetails.vipAddress)&&
  Objects.equals(this.vip6Address, objSeHmEventVsDetails.vip6Address)&&
  Objects.equals(this.reason, objSeHmEventVsDetails.reason)&&
  Objects.equals(this.haReason, objSeHmEventVsDetails.haReason)&&
  Objects.equals(this.seName, objSeHmEventVsDetails.seName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeHmEventVsDetails {\n");
      sb.append("    haReason: ").append(toIndentedString(haReason)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
        sb.append("    srcUuid: ").append(toIndentedString(srcUuid)).append("\n");
        sb.append("    vip6Address: ").append(toIndentedString(vip6Address)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
        sb.append("    virtualService: ").append(toIndentedString(virtualService)).append("\n");
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

