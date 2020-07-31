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
 * The GCPSetup is a POJO class extends AviRestResource that used for creating
 * GCPSetup.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GCPSetup")
@VsoFinder(name = Constants.FINDER_VRO_GCPSETUP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GCPSetup extends AviRestResource {
  @JsonProperty("cc_id")
  @JsonInclude(Include.NON_NULL)
  private String ccId = null;

  @JsonProperty("hostname")
  @JsonInclude(Include.NON_NULL)
  private String hostname = null;

  @JsonProperty("network")
  @JsonInclude(Include.NON_NULL)
  private String network = null;

  @JsonProperty("nhop_inst")
  @JsonInclude(Include.NON_NULL)
  private String nhopInst = null;

  @JsonProperty("nhop_ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddr nhopIp = null;

  @JsonProperty("project")
  @JsonInclude(Include.NON_NULL)
  private String project = null;

  @JsonProperty("reason")
  @JsonInclude(Include.NON_NULL)
  private String reason = null;

  @JsonProperty("route_name")
  @JsonInclude(Include.NON_NULL)
  private String routeName = null;

  @JsonProperty("subnet")
  @JsonInclude(Include.NON_NULL)
  private String subnet = null;

  @JsonProperty("vip")
  @JsonInclude(Include.NON_NULL)
  private IpAddr vip = null;

  @JsonProperty("vs_name")
  @JsonInclude(Include.NON_NULL)
  private String vsName = null;

  @JsonProperty("vs_uuid")
  @JsonInclude(Include.NON_NULL)
  private String vsUuid = null;

  @JsonProperty("zone")
  @JsonInclude(Include.NON_NULL)
  private String zone = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cc_id of obj type gcpsetup field type str  type string.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cc_id of obj type gcpsetup field type str  type string.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property hostname of obj type gcpsetup field type str  type string.
   * @return hostname
   */
  @VsoMethod
  public String getHostname() {
    return hostname;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property hostname of obj type gcpsetup field type str  type string.
   * @param hostname set the hostname.
   */
  @VsoMethod
  public void setHostname(String  hostname) {
    this.hostname = hostname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property network of obj type gcpsetup field type str  type string.
   * @return network
   */
  @VsoMethod
  public String getNetwork() {
    return network;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property network of obj type gcpsetup field type str  type string.
   * @param network set the network.
   */
  @VsoMethod
  public void setNetwork(String  network) {
    this.network = network;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property nhop_inst of obj type gcpsetup field type str  type string.
   * @return nhopInst
   */
  @VsoMethod
  public String getNhopInst() {
    return nhopInst;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property nhop_inst of obj type gcpsetup field type str  type string.
   * @param nhopInst set the nhopInst.
   */
  @VsoMethod
  public void setNhopInst(String  nhopInst) {
    this.nhopInst = nhopInst;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property nhop_ip of obj type gcpsetup field type str  type ref.
   * @return nhopIp
   */
  @VsoMethod
  public IpAddr getNhopIp() {
    return nhopIp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property nhop_ip of obj type gcpsetup field type str  type ref.
   * @param nhopIp set the nhopIp.
   */
  @VsoMethod
  public void setNhopIp(IpAddr nhopIp) {
    this.nhopIp = nhopIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property project of obj type gcpsetup field type str  type string.
   * @return project
   */
  @VsoMethod
  public String getProject() {
    return project;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property project of obj type gcpsetup field type str  type string.
   * @param project set the project.
   */
  @VsoMethod
  public void setProject(String  project) {
    this.project = project;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property reason of obj type gcpsetup field type str  type string.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property reason of obj type gcpsetup field type str  type string.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property route_name of obj type gcpsetup field type str  type string.
   * @return routeName
   */
  @VsoMethod
  public String getRouteName() {
    return routeName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property route_name of obj type gcpsetup field type str  type string.
   * @param routeName set the routeName.
   */
  @VsoMethod
  public void setRouteName(String  routeName) {
    this.routeName = routeName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property subnet of obj type gcpsetup field type str  type string.
   * @return subnet
   */
  @VsoMethod
  public String getSubnet() {
    return subnet;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property subnet of obj type gcpsetup field type str  type string.
   * @param subnet set the subnet.
   */
  @VsoMethod
  public void setSubnet(String  subnet) {
    this.subnet = subnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vip of obj type gcpsetup field type str  type ref.
   * @return vip
   */
  @VsoMethod
  public IpAddr getVip() {
    return vip;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vip of obj type gcpsetup field type str  type ref.
   * @param vip set the vip.
   */
  @VsoMethod
  public void setVip(IpAddr vip) {
    this.vip = vip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vs_name of obj type gcpsetup field type str  type string.
   * @return vsName
   */
  @VsoMethod
  public String getVsName() {
    return vsName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vs_name of obj type gcpsetup field type str  type string.
   * @param vsName set the vsName.
   */
  @VsoMethod
  public void setVsName(String  vsName) {
    this.vsName = vsName;
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

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property zone of obj type gcpsetup field type str  type string.
   * @return zone
   */
  @VsoMethod
  public String getZone() {
    return zone;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property zone of obj type gcpsetup field type str  type string.
   * @param zone set the zone.
   */
  @VsoMethod
  public void setZone(String  zone) {
    this.zone = zone;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GCPSetup objGCPSetup = (GCPSetup) o;
  return   Objects.equals(this.ccId, objGCPSetup.ccId)&&
  Objects.equals(this.project, objGCPSetup.project)&&
  Objects.equals(this.network, objGCPSetup.network)&&
  Objects.equals(this.zone, objGCPSetup.zone)&&
  Objects.equals(this.hostname, objGCPSetup.hostname)&&
  Objects.equals(this.subnet, objGCPSetup.subnet)&&
  Objects.equals(this.vip, objGCPSetup.vip)&&
  Objects.equals(this.nhopIp, objGCPSetup.nhopIp)&&
  Objects.equals(this.nhopInst, objGCPSetup.nhopInst)&&
  Objects.equals(this.vsUuid, objGCPSetup.vsUuid)&&
  Objects.equals(this.routeName, objGCPSetup.routeName)&&
  Objects.equals(this.reason, objGCPSetup.reason)&&
  Objects.equals(this.vsName, objGCPSetup.vsName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GCPSetup {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    nhopInst: ").append(toIndentedString(nhopInst)).append("\n");
        sb.append("    nhopIp: ").append(toIndentedString(nhopIp)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    routeName: ").append(toIndentedString(routeName)).append("\n");
        sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
        sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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

