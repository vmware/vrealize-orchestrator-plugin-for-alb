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
 * The CloudIpChange is a POJO class extends AviRestResource that used for creating
 * CloudIpChange.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CloudIpChange")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDIPCHANGE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CloudIpChange extends AviRestResource {
  @JsonProperty("cc_id")
  @JsonInclude(Include.NON_NULL)
  private String ccId = null;

  @JsonProperty("error_string")
  @JsonInclude(Include.NON_NULL)
  private String errorString = null;

  @JsonProperty("ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddr ip = null;

  @JsonProperty("ip6")
  @JsonInclude(Include.NON_NULL)
  private IpAddr ip6 = null;

  @JsonProperty("ip6_mask")
  @JsonInclude(Include.NON_NULL)
  private Integer ip6Mask = 128;

  @JsonProperty("ip_mask")
  @JsonInclude(Include.NON_NULL)
  private Integer ipMask = 32;

  @JsonProperty("mac_addr")
  @JsonInclude(Include.NON_NULL)
  private String macAddr = null;

  @JsonProperty("port_uuid")
  @JsonInclude(Include.NON_NULL)
  private String portUuid = null;

  @JsonProperty("se_vm_uuid")
  @JsonInclude(Include.NON_NULL)
  private String seVmUuid = null;

  @JsonProperty("vtype")
  @JsonInclude(Include.NON_NULL)
  private String vtype = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cc_id of obj type cloudipchange field type str  type string.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cc_id of obj type cloudipchange field type str  type string.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property error_string of obj type cloudipchange field type str  type string.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property error_string of obj type cloudipchange field type str  type string.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property ip of obj type cloudipchange field type str  type ref.
   * @return ip
   */
  @VsoMethod
  public IpAddr getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property ip of obj type cloudipchange field type str  type ref.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.1.1.
   * @return ip6
   */
  @VsoMethod
  public IpAddr getIp6() {
    return ip6;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.1.1.
   * @param ip6 set the ip6.
   */
  @VsoMethod
  public void setIp6(IpAddr ip6) {
    this.ip6 = ip6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 128.
   * @return ip6Mask
   */
  @VsoMethod
  public Integer getIp6Mask() {
    return ip6Mask;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 128.
   * @param ip6Mask set the ip6Mask.
   */
  @VsoMethod
  public void setIp6Mask(Integer  ip6Mask) {
    this.ip6Mask = ip6Mask;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 32.
   * @return ipMask
   */
  @VsoMethod
  public Integer getIpMask() {
    return ipMask;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 32.
   * @param ipMask set the ipMask.
   */
  @VsoMethod
  public void setIpMask(Integer  ipMask) {
    this.ipMask = ipMask;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property mac_addr of obj type cloudipchange field type str  type string.
   * @return macAddr
   */
  @VsoMethod
  public String getMacAddr() {
    return macAddr;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property mac_addr of obj type cloudipchange field type str  type string.
   * @param macAddr set the macAddr.
   */
  @VsoMethod
  public void setMacAddr(String  macAddr) {
    this.macAddr = macAddr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of port.
   * @return portUuid
   */
  @VsoMethod
  public String getPortUuid() {
    return portUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of port.
   * @param portUuid set the portUuid.
   */
  @VsoMethod
  public void setPortUuid(String  portUuid) {
    this.portUuid = portUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of se_vm.
   * @return seVmUuid
   */
  @VsoMethod
  public String getSeVmUuid() {
    return seVmUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of se_vm.
   * @param seVmUuid set the seVmUuid.
   */
  @VsoMethod
  public void setSeVmUuid(String  seVmUuid) {
    this.seVmUuid = seVmUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * @return vtype
   */
  @VsoMethod
  public String getVtype() {
    return vtype;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * @param vtype set the vtype.
   */
  @VsoMethod
  public void setVtype(String  vtype) {
    this.vtype = vtype;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CloudIpChange objCloudIpChange = (CloudIpChange) o;
  return   Objects.equals(this.ip6Mask, objCloudIpChange.ip6Mask)&&
  Objects.equals(this.vtype, objCloudIpChange.vtype)&&
  Objects.equals(this.portUuid, objCloudIpChange.portUuid)&&
  Objects.equals(this.errorString, objCloudIpChange.errorString)&&
  Objects.equals(this.ip, objCloudIpChange.ip)&&
  Objects.equals(this.seVmUuid, objCloudIpChange.seVmUuid)&&
  Objects.equals(this.ipMask, objCloudIpChange.ipMask)&&
  Objects.equals(this.ip6, objCloudIpChange.ip6)&&
  Objects.equals(this.macAddr, objCloudIpChange.macAddr)&&
  Objects.equals(this.ccId, objCloudIpChange.ccId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CloudIpChange {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    ip6: ").append(toIndentedString(ip6)).append("\n");
        sb.append("    ip6Mask: ").append(toIndentedString(ip6Mask)).append("\n");
        sb.append("    ipMask: ").append(toIndentedString(ipMask)).append("\n");
        sb.append("    macAddr: ").append(toIndentedString(macAddr)).append("\n");
        sb.append("    portUuid: ").append(toIndentedString(portUuid)).append("\n");
        sb.append("    seVmUuid: ").append(toIndentedString(seVmUuid)).append("\n");
        sb.append("    vtype: ").append(toIndentedString(vtype)).append("\n");
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

