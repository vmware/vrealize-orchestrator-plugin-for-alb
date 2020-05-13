package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.VIMgrIPSubnetRuntime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * VIMgrGuestNicRuntime
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIMgrGuestNicRuntime")
@VsoFinder(name = Constants.FINDER_VRO_VIMGRGUESTNICRUNTIME, idAccessor = "getObjectID()")
@Service
public class VIMgrGuestNicRuntime extends AviRestResource  {
  @JsonProperty("avi_internal_network")
  private Boolean aviInternalNetwork = null;

  @JsonProperty("connected")
  private Boolean connected = null;

  @JsonProperty("del_pending")
  private Boolean delPending = null;

  @JsonProperty("guest_ip")
  @Valid
  private List<VIMgrIPSubnetRuntime> guestIp = null;

  @JsonProperty("label")
  private String label = "Unknown";

  @JsonProperty("mac_addr")
  private String macAddr = null;

  @JsonProperty("mgmt_vnic")
  private Boolean mgmtVnic = null;

  @JsonProperty("network_name")
  private String networkName = null;

  @JsonProperty("network_uuid")
  private String networkUuid = null;

  @JsonProperty("os_port_uuid")
  private String osPortUuid = null;

  @JsonProperty("type")
  private String type = null;

  
  /**
   * Placeholder for description of property avi_internal_network of obj type VIMgrGuestNicRuntime field type str  type boolean
   * @return aviInternalNetwork
  **/
  @ApiModelProperty(value = "Placeholder for description of property avi_internal_network of obj type VIMgrGuestNicRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isAviInternalNetwork() {
    return aviInternalNetwork;
  }
    
  @VsoMethod
  public void setAviInternalNetwork(Boolean aviInternalNetwork) {
    this.aviInternalNetwork = aviInternalNetwork;
  }

  
  /**
   * Placeholder for description of property connected of obj type VIMgrGuestNicRuntime field type str  type boolean
   * @return connected
  **/
  @ApiModelProperty(value = "Placeholder for description of property connected of obj type VIMgrGuestNicRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isConnected() {
    return connected;
  }
    
  @VsoMethod
  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  
  /**
   * Placeholder for description of property del_pending of obj type VIMgrGuestNicRuntime field type str  type boolean
   * @return delPending
  **/
  @ApiModelProperty(value = "Placeholder for description of property del_pending of obj type VIMgrGuestNicRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isDelPending() {
    return delPending;
  }
    
  @VsoMethod
  public void setDelPending(Boolean delPending) {
    this.delPending = delPending;
  }

  
  public VIMgrGuestNicRuntime addGuestIpItem(VIMgrIPSubnetRuntime guestIpItem) {
    if (this.guestIp == null) {
      this.guestIp = new ArrayList<VIMgrIPSubnetRuntime>();
    }
    this.guestIp.add(guestIpItem);
    return this;
  }
  
  /**
   * Placeholder for description of property guest_ip of obj type VIMgrGuestNicRuntime field type str  type object
   * @return guestIp
  **/
  @ApiModelProperty(value = "Placeholder for description of property guest_ip of obj type VIMgrGuestNicRuntime field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<VIMgrIPSubnetRuntime> getGuestIp() {
    return guestIp;
  }
    
  @VsoMethod
  public void setGuestIp(List<VIMgrIPSubnetRuntime> guestIp) {
    this.guestIp = guestIp;
  }

  
  /**
   * label of VIMgrGuestNicRuntime.
   * @return label
  **/
  @ApiModelProperty(value = "label of VIMgrGuestNicRuntime.")


 
  @VsoMethod  
  public String getLabel() {
    return label;
  }
    
  @VsoMethod
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * mac_addr of VIMgrGuestNicRuntime.
   * @return macAddr
  **/
  @ApiModelProperty(required = true, value = "mac_addr of VIMgrGuestNicRuntime.")
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
   * Placeholder for description of property mgmt_vnic of obj type VIMgrGuestNicRuntime field type str  type boolean
   * @return mgmtVnic
  **/
  @ApiModelProperty(value = "Placeholder for description of property mgmt_vnic of obj type VIMgrGuestNicRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isMgmtVnic() {
    return mgmtVnic;
  }
    
  @VsoMethod
  public void setMgmtVnic(Boolean mgmtVnic) {
    this.mgmtVnic = mgmtVnic;
  }

  
  /**
   * network_name of VIMgrGuestNicRuntime.
   * @return networkName
  **/
  @ApiModelProperty(value = "network_name of VIMgrGuestNicRuntime.")


 
  @VsoMethod  
  public String getNetworkName() {
    return networkName;
  }
    
  @VsoMethod
  public void setNetworkName(String networkName) {
    this.networkName = networkName;
  }

  
  /**
   * Unique object identifier of network.
   * @return networkUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of network.")


 
  @VsoMethod  
  public String getNetworkUuid() {
    return networkUuid;
  }
    
  @VsoMethod
  public void setNetworkUuid(String networkUuid) {
    this.networkUuid = networkUuid;
  }

  
  /**
   * Unique object identifier of os_port.
   * @return osPortUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of os_port.")


 
  @VsoMethod  
  public String getOsPortUuid() {
    return osPortUuid;
  }
    
  @VsoMethod
  public void setOsPortUuid(String osPortUuid) {
    this.osPortUuid = osPortUuid;
  }

  
  /**
   *  Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP, CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP.
   * @return type
  **/
  @ApiModelProperty(required = true, value = " Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP, CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "VIMgrGuestNicRuntime";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIMgrGuestNicRuntime viMgrGuestNicRuntime = (VIMgrGuestNicRuntime) o;
    return Objects.equals(this.aviInternalNetwork, viMgrGuestNicRuntime.aviInternalNetwork) &&
        Objects.equals(this.connected, viMgrGuestNicRuntime.connected) &&
        Objects.equals(this.delPending, viMgrGuestNicRuntime.delPending) &&
        Objects.equals(this.guestIp, viMgrGuestNicRuntime.guestIp) &&
        Objects.equals(this.label, viMgrGuestNicRuntime.label) &&
        Objects.equals(this.macAddr, viMgrGuestNicRuntime.macAddr) &&
        Objects.equals(this.mgmtVnic, viMgrGuestNicRuntime.mgmtVnic) &&
        Objects.equals(this.networkName, viMgrGuestNicRuntime.networkName) &&
        Objects.equals(this.networkUuid, viMgrGuestNicRuntime.networkUuid) &&
        Objects.equals(this.osPortUuid, viMgrGuestNicRuntime.osPortUuid) &&
        Objects.equals(this.type, viMgrGuestNicRuntime.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aviInternalNetwork, connected, delPending, guestIp, label, macAddr, mgmtVnic, networkName, networkUuid, osPortUuid, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIMgrGuestNicRuntime {\n");
    
    sb.append("    aviInternalNetwork: ").append(toIndentedString(aviInternalNetwork)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    delPending: ").append(toIndentedString(delPending)).append("\n");
    sb.append("    guestIp: ").append(toIndentedString(guestIp)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    macAddr: ").append(toIndentedString(macAddr)).append("\n");
    sb.append("    mgmtVnic: ").append(toIndentedString(mgmtVnic)).append("\n");
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
    sb.append("    networkUuid: ").append(toIndentedString(networkUuid)).append("\n");
    sb.append("    osPortUuid: ").append(toIndentedString(osPortUuid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

