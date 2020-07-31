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
 * The VIVmVnicInfo is a POJO class extends AviRestResource that used for creating
 * VIVmVnicInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VIVmVnicInfo")
@VsoFinder(name = Constants.FINDER_VRO_VIVMVNICINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VIVmVnicInfo extends AviRestResource {
  @JsonProperty("mac_addr")
  @JsonInclude(Include.NON_NULL)
  private String macAddr = null;

  @JsonProperty("vcenter_portgroup")
  @JsonInclude(Include.NON_NULL)
  private String vcenterPortgroup = null;

  @JsonProperty("vcenter_vnic_nw")
  @JsonInclude(Include.NON_NULL)
  private String vcenterVnicNw = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property mac_addr of obj type vivmvnicinfo field type str  type string.
   * @return macAddr
   */
  @VsoMethod
  public String getMacAddr() {
    return macAddr;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property mac_addr of obj type vivmvnicinfo field type str  type string.
   * @param macAddr set the macAddr.
   */
  @VsoMethod
  public void setMacAddr(String  macAddr) {
    this.macAddr = macAddr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_portgroup of obj type vivmvnicinfo field type str  type string.
   * @return vcenterPortgroup
   */
  @VsoMethod
  public String getVcenterPortgroup() {
    return vcenterPortgroup;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_portgroup of obj type vivmvnicinfo field type str  type string.
   * @param vcenterPortgroup set the vcenterPortgroup.
   */
  @VsoMethod
  public void setVcenterPortgroup(String  vcenterPortgroup) {
    this.vcenterPortgroup = vcenterPortgroup;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - VNIC_VSWITCH, VNIC_DVS.
   * @return vcenterVnicNw
   */
  @VsoMethod
  public String getVcenterVnicNw() {
    return vcenterVnicNw;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - VNIC_VSWITCH, VNIC_DVS.
   * @param vcenterVnicNw set the vcenterVnicNw.
   */
  @VsoMethod
  public void setVcenterVnicNw(String  vcenterVnicNw) {
    this.vcenterVnicNw = vcenterVnicNw;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VIVmVnicInfo objVIVmVnicInfo = (VIVmVnicInfo) o;
  return   Objects.equals(this.macAddr, objVIVmVnicInfo.macAddr)&&
  Objects.equals(this.vcenterVnicNw, objVIVmVnicInfo.vcenterVnicNw)&&
  Objects.equals(this.vcenterPortgroup, objVIVmVnicInfo.vcenterPortgroup);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VIVmVnicInfo {\n");
      sb.append("    macAddr: ").append(toIndentedString(macAddr)).append("\n");
        sb.append("    vcenterPortgroup: ").append(toIndentedString(vcenterPortgroup)).append("\n");
        sb.append("    vcenterVnicNw: ").append(toIndentedString(vcenterVnicNw)).append("\n");
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

