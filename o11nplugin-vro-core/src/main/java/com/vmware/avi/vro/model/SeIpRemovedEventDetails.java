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
 * The SeIpRemovedEventDetails is a POJO class extends AviRestResource that used for creating
 * SeIpRemovedEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeIpRemovedEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEIPREMOVEDEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeIpRemovedEventDetails extends AviRestResource {
  @JsonProperty("if_name")
  @JsonInclude(Include.NON_NULL)
  private String ifName = null;

  @JsonProperty("ip")
  @JsonInclude(Include.NON_NULL)
  private String ip = null;

  @JsonProperty("linux_name")
  @JsonInclude(Include.NON_NULL)
  private String linuxName = null;

  @JsonProperty("mac")
  @JsonInclude(Include.NON_NULL)
  private String mac = null;

  @JsonProperty("mask")
  @JsonInclude(Include.NON_NULL)
  private Integer mask = null;

  @JsonProperty("mode")
  @JsonInclude(Include.NON_NULL)
  private String mode = null;

  @JsonProperty("network_uuid")
  @JsonInclude(Include.NON_NULL)
  private String networkUuid = null;

  @JsonProperty("ns")
  @JsonInclude(Include.NON_NULL)
  private String ns = null;

  @JsonProperty("se_ref")
  @JsonInclude(Include.NON_NULL)
  private String seRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * Vnic name.
   * @return ifName
   */
  @VsoMethod
  public String getIfName() {
    return ifName;
  }

  /**
   * This is the setter method to the attribute.
   * Vnic name.
   * @param ifName set the ifName.
   */
  @VsoMethod
  public void setIfName(String  ifName) {
    this.ifName = ifName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip added.
   * @return ip
   */
  @VsoMethod
  public String getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Ip added.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(String  ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vnic linux name.
   * @return linuxName
   */
  @VsoMethod
  public String getLinuxName() {
    return linuxName;
  }

  /**
   * This is the setter method to the attribute.
   * Vnic linux name.
   * @param linuxName set the linuxName.
   */
  @VsoMethod
  public void setLinuxName(String  linuxName) {
    this.linuxName = linuxName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mac address.
   * @return mac
   */
  @VsoMethod
  public String getMac() {
    return mac;
  }

  /**
   * This is the setter method to the attribute.
   * Mac address.
   * @param mac set the mac.
   */
  @VsoMethod
  public void setMac(String  mac) {
    this.mac = mac;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mask .
   * @return mask
   */
  @VsoMethod
  public Integer getMask() {
    return mask;
  }

  /**
   * This is the setter method to the attribute.
   * Mask .
   * @param mask set the mask.
   */
  @VsoMethod
  public void setMask(Integer  mask) {
    this.mask = mask;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dchp or static.
   * @return mode
   */
  @VsoMethod
  public String getMode() {
    return mode;
  }

  /**
   * This is the setter method to the attribute.
   * Dchp or static.
   * @param mode set the mode.
   */
  @VsoMethod
  public void setMode(String  mode) {
    this.mode = mode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Network uuid.
   * @return networkUuid
   */
  @VsoMethod
  public String getNetworkUuid() {
    return networkUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Network uuid.
   * @param networkUuid set the networkUuid.
   */
  @VsoMethod
  public void setNetworkUuid(String  networkUuid) {
    this.networkUuid = networkUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Namespace.
   * @return ns
   */
  @VsoMethod
  public String getNs() {
    return ns;
  }

  /**
   * This is the setter method to the attribute.
   * Namespace.
   * @param ns set the ns.
   */
  @VsoMethod
  public void setNs(String  ns) {
    this.ns = ns;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the se responsible for this event.
   * It is a reference to an object of type serviceengine.
   * @return seRef
   */
  @VsoMethod
  public String getSeRef() {
    return seRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the se responsible for this event.
   * It is a reference to an object of type serviceengine.
   * @param seRef set the seRef.
   */
  @VsoMethod
  public void setSeRef(String  seRef) {
    this.seRef = seRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeIpRemovedEventDetails objSeIpRemovedEventDetails = (SeIpRemovedEventDetails) o;
  return   Objects.equals(this.networkUuid, objSeIpRemovedEventDetails.networkUuid)&&
  Objects.equals(this.ip, objSeIpRemovedEventDetails.ip)&&
  Objects.equals(this.linuxName, objSeIpRemovedEventDetails.linuxName)&&
  Objects.equals(this.mask, objSeIpRemovedEventDetails.mask)&&
  Objects.equals(this.ifName, objSeIpRemovedEventDetails.ifName)&&
  Objects.equals(this.mac, objSeIpRemovedEventDetails.mac)&&
  Objects.equals(this.seRef, objSeIpRemovedEventDetails.seRef)&&
  Objects.equals(this.ns, objSeIpRemovedEventDetails.ns)&&
  Objects.equals(this.mode, objSeIpRemovedEventDetails.mode);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeIpRemovedEventDetails {\n");
      sb.append("    ifName: ").append(toIndentedString(ifName)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    linuxName: ").append(toIndentedString(linuxName)).append("\n");
        sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
        sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    networkUuid: ").append(toIndentedString(networkUuid)).append("\n");
        sb.append("    ns: ").append(toIndentedString(ns)).append("\n");
        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
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

