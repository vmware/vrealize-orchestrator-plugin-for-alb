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
 * The VISeVmIpConfParams is a POJO class extends AviRestResource that used for creating
 * VISeVmIpConfParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VISeVmIpConfParams")
@VsoFinder(name = Constants.FINDER_VRO_VISEVMIPCONFPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VISeVmIpConfParams extends AviRestResource {
    @JsonProperty("default_gw")
    @JsonInclude(Include.NON_NULL)
    private String defaultGw = null;

    @JsonProperty("mgmt_ip_addr")
    @JsonInclude(Include.NON_NULL)
    private String mgmtIpAddr = null;

    @JsonProperty("mgmt_ip_type")
    @JsonInclude(Include.NON_NULL)
    private String mgmtIpType = null;

    @JsonProperty("mgmt_net_mask")
    @JsonInclude(Include.NON_NULL)
    private String mgmtNetMask = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property default_gw of obj type visevmipconfparams field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return defaultGw
   */
  @VsoMethod
  public String getDefaultGw() {
    return defaultGw;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property default_gw of obj type visevmipconfparams field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param defaultGw set the defaultGw.
   */
  @VsoMethod
  public void setDefaultGw(String  defaultGw) {
    this.defaultGw = defaultGw;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property mgmt_ip_addr of obj type visevmipconfparams field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mgmtIpAddr
   */
  @VsoMethod
  public String getMgmtIpAddr() {
    return mgmtIpAddr;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property mgmt_ip_addr of obj type visevmipconfparams field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mgmtIpAddr set the mgmtIpAddr.
   */
  @VsoMethod
  public void setMgmtIpAddr(String  mgmtIpAddr) {
    this.mgmtIpAddr = mgmtIpAddr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - VNIC_IP_TYPE_DHCP, VNIC_IP_TYPE_STATIC.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mgmtIpType
   */
  @VsoMethod
  public String getMgmtIpType() {
    return mgmtIpType;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - VNIC_IP_TYPE_DHCP, VNIC_IP_TYPE_STATIC.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mgmtIpType set the mgmtIpType.
   */
  @VsoMethod
  public void setMgmtIpType(String  mgmtIpType) {
    this.mgmtIpType = mgmtIpType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property mgmt_net_mask of obj type visevmipconfparams field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mgmtNetMask
   */
  @VsoMethod
  public String getMgmtNetMask() {
    return mgmtNetMask;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property mgmt_net_mask of obj type visevmipconfparams field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mgmtNetMask set the mgmtNetMask.
   */
  @VsoMethod
  public void setMgmtNetMask(String  mgmtNetMask) {
    this.mgmtNetMask = mgmtNetMask;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VISeVmIpConfParams objVISeVmIpConfParams = (VISeVmIpConfParams) o;
  return   Objects.equals(this.mgmtIpType, objVISeVmIpConfParams.mgmtIpType)&&
  Objects.equals(this.mgmtIpAddr, objVISeVmIpConfParams.mgmtIpAddr)&&
  Objects.equals(this.mgmtNetMask, objVISeVmIpConfParams.mgmtNetMask)&&
  Objects.equals(this.defaultGw, objVISeVmIpConfParams.defaultGw);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VISeVmIpConfParams {\n");
      sb.append("    defaultGw: ").append(toIndentedString(defaultGw)).append("\n");
        sb.append("    mgmtIpAddr: ").append(toIndentedString(mgmtIpAddr)).append("\n");
        sb.append("    mgmtIpType: ").append(toIndentedString(mgmtIpType)).append("\n");
        sb.append("    mgmtNetMask: ").append(toIndentedString(mgmtNetMask)).append("\n");
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

