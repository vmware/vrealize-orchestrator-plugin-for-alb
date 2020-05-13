package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * VIVmVnicInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIVmVnicInfo")
@VsoFinder(name = Constants.FINDER_VRO_VIVMVNICINFO, idAccessor = "getObjectID()")
@Service
public class VIVmVnicInfo extends AviRestResource  {
  @JsonProperty("mac_addr")
  private String macAddr = null;

  @JsonProperty("vcenter_portgroup")
  private String vcenterPortgroup = null;

  @JsonProperty("vcenter_vnic_nw")
  private String vcenterVnicNw = null;

  
  /**
   * mac_addr of VIVmVnicInfo.
   * @return macAddr
  **/
  @ApiModelProperty(required = true, value = "mac_addr of VIVmVnicInfo.")
  @NotNull


 
  @VsoMethod  
  public String getMacAddr() {
    return macAddr;
  }
    
  @VsoMethod
  public void setMacAddr(String macAddr) {
    this.macAddr = macAddr;
  }

  
  /**
   * vcenter_portgroup of VIVmVnicInfo.
   * @return vcenterPortgroup
  **/
  @ApiModelProperty(value = "vcenter_portgroup of VIVmVnicInfo.")


 
  @VsoMethod  
  public String getVcenterPortgroup() {
    return vcenterPortgroup;
  }
    
  @VsoMethod
  public void setVcenterPortgroup(String vcenterPortgroup) {
    this.vcenterPortgroup = vcenterPortgroup;
  }

  
  /**
   *  Enum options - VNIC_VSWITCH, VNIC_DVS.
   * @return vcenterVnicNw
  **/
  @ApiModelProperty(value = " Enum options - VNIC_VSWITCH, VNIC_DVS.")


 
  @VsoMethod  
  public String getVcenterVnicNw() {
    return vcenterVnicNw;
  }
    
  @VsoMethod
  public void setVcenterVnicNw(String vcenterVnicNw) {
    this.vcenterVnicNw = vcenterVnicNw;
  }

  
  public String getObjectID() {
		return "VIVmVnicInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIVmVnicInfo viVmVnicInfo = (VIVmVnicInfo) o;
    return Objects.equals(this.macAddr, viVmVnicInfo.macAddr) &&
        Objects.equals(this.vcenterPortgroup, viVmVnicInfo.vcenterPortgroup) &&
        Objects.equals(this.vcenterVnicNw, viVmVnicInfo.vcenterVnicNw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(macAddr, vcenterPortgroup, vcenterVnicNw);
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

