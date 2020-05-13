package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.MemberInterface;
import com.vmware.avi.vro.model.VNICNetwork;
import com.vmware.avi.vro.model.VlanInterface;
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
 * VNIC
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VNIC")
@VsoFinder(name = Constants.FINDER_VRO_VNIC, idAccessor = "getObjectID()")
@Service
public class VNIC extends AviRestResource  {
  @JsonProperty("adapter")
  private String adapter = null;

  @JsonProperty("aggregator_chgd")
  private Boolean aggregatorChgd = null;

  @JsonProperty("can_se_dp_takeover")
  private Boolean canSeDpTakeover = true;

  @JsonProperty("connected")
  private Boolean connected = null;

  @JsonProperty("del_pending")
  private Boolean delPending = null;

  @JsonProperty("delete_vnic")
  private Boolean deleteVnic = null;

  @JsonProperty("dhcp_enabled")
  private Boolean dhcpEnabled = true;

  @JsonProperty("dp_deletion_done")
  private Boolean dpDeletionDone = null;

  @JsonProperty("enabled")
  private Boolean enabled = true;

  @JsonProperty("if_name")
  private String ifName = null;

  @JsonProperty("ip6_autocfg_enabled")
  private Boolean ip6AutocfgEnabled = true;

  @JsonProperty("is_asm")
  private Boolean isAsm = null;

  @JsonProperty("is_avi_internal_network")
  private Boolean isAviInternalNetwork = null;

  @JsonProperty("is_hsm")
  private Boolean isHsm = null;

  @JsonProperty("is_mgmt")
  private Boolean isMgmt = null;

  @JsonProperty("is_portchannel")
  private Boolean isPortchannel = null;

  @JsonProperty("link_up")
  private Boolean linkUp = true;

  @JsonProperty("linux_name")
  private String linuxName = null;

  @JsonProperty("mac_address")
  private String macAddress = null;

  @JsonProperty("members")
  @Valid
  private List<MemberInterface> members = null;

  @JsonProperty("mtu")
  private Integer mtu = 1500;

  @JsonProperty("network_name")
  private String networkName = null;

  @JsonProperty("network_ref")
  private String networkRef = null;

  @JsonProperty("pci_id")
  private String pciId = null;

  @JsonProperty("port_uuid")
  private String portUuid = null;

  @JsonProperty("vlan_id")
  private Integer vlanId = null;

  @JsonProperty("vlan_interfaces")
  @Valid
  private List<VlanInterface> vlanInterfaces = null;

  @JsonProperty("vnic_networks")
  @Valid
  private List<VNICNetwork> vnicNetworks = null;

  @JsonProperty("vrf_id")
  private Integer vrfId = null;

  @JsonProperty("vrf_ref")
  private String vrfRef = null;

  
  /**
   * adapter of vNIC.
   * @return adapter
  **/
  @ApiModelProperty(value = "adapter of vNIC.")


 
  @VsoMethod  
  public String getAdapter() {
    return adapter;
  }
    
  @VsoMethod
  public void setAdapter(String adapter) {
    this.adapter = adapter;
  }

  
  /**
   *  Field introduced in 17.2.7.
   * @return aggregatorChgd
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.7.")


 
  @VsoMethod  
  public Boolean isAggregatorChgd() {
    return aggregatorChgd;
  }
    
  @VsoMethod
  public void setAggregatorChgd(Boolean aggregatorChgd) {
    this.aggregatorChgd = aggregatorChgd;
  }

  
  /**
   * Placeholder for description of property can_se_dp_takeover of obj type vNIC field type str  type boolean
   * @return canSeDpTakeover
  **/
  @ApiModelProperty(value = "Placeholder for description of property can_se_dp_takeover of obj type vNIC field type str  type boolean")


 
  @VsoMethod  
  public Boolean isCanSeDpTakeover() {
    return canSeDpTakeover;
  }
    
  @VsoMethod
  public void setCanSeDpTakeover(Boolean canSeDpTakeover) {
    this.canSeDpTakeover = canSeDpTakeover;
  }

  
  /**
   * Placeholder for description of property connected of obj type vNIC field type str  type boolean
   * @return connected
  **/
  @ApiModelProperty(value = "Placeholder for description of property connected of obj type vNIC field type str  type boolean")


 
  @VsoMethod  
  public Boolean isConnected() {
    return connected;
  }
    
  @VsoMethod
  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  
  /**
   * Placeholder for description of property del_pending of obj type vNIC field type str  type boolean
   * @return delPending
  **/
  @ApiModelProperty(value = "Placeholder for description of property del_pending of obj type vNIC field type str  type boolean")


 
  @VsoMethod  
  public Boolean isDelPending() {
    return delPending;
  }
    
  @VsoMethod
  public void setDelPending(Boolean delPending) {
    this.delPending = delPending;
  }

  
  /**
   * Delete this VNIC. Please confirm dp_deletion_done before removing the VNIC from the cloud. Field introduced in 18.2.5.
   * @return deleteVnic
  **/
  @ApiModelProperty(value = "Delete this VNIC. Please confirm dp_deletion_done before removing the VNIC from the cloud. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isDeleteVnic() {
    return deleteVnic;
  }
    
  @VsoMethod
  public void setDeleteVnic(Boolean deleteVnic) {
    this.deleteVnic = deleteVnic;
  }

  
  /**
   * Placeholder for description of property dhcp_enabled of obj type vNIC field type str  type boolean
   * @return dhcpEnabled
  **/
  @ApiModelProperty(value = "Placeholder for description of property dhcp_enabled of obj type vNIC field type str  type boolean")


 
  @VsoMethod  
  public Boolean isDhcpEnabled() {
    return dhcpEnabled;
  }
    
  @VsoMethod
  public void setDhcpEnabled(Boolean dhcpEnabled) {
    this.dhcpEnabled = dhcpEnabled;
  }

  
  /**
   * The VNIC has been cleaned up in the datapath. Field introduced in 18.2.3.
   * @return dpDeletionDone
  **/
  @ApiModelProperty(value = "The VNIC has been cleaned up in the datapath. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isDpDeletionDone() {
    return dpDeletionDone;
  }
    
  @VsoMethod
  public void setDpDeletionDone(Boolean dpDeletionDone) {
    this.dpDeletionDone = dpDeletionDone;
  }

  
  /**
   * Placeholder for description of property enabled of obj type vNIC field type str  type boolean
   * @return enabled
  **/
  @ApiModelProperty(value = "Placeholder for description of property enabled of obj type vNIC field type str  type boolean")


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * if_name of vNIC.
   * @return ifName
  **/
  @ApiModelProperty(value = "if_name of vNIC.")


 
  @VsoMethod  
  public String getIfName() {
    return ifName;
  }
    
  @VsoMethod
  public void setIfName(String ifName) {
    this.ifName = ifName;
  }

  
  /**
   * Enable IPv6 auto configuration. Field introduced in 18.1.1.
   * @return ip6AutocfgEnabled
  **/
  @ApiModelProperty(value = "Enable IPv6 auto configuration. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Boolean isIp6AutocfgEnabled() {
    return ip6AutocfgEnabled;
  }
    
  @VsoMethod
  public void setIp6AutocfgEnabled(Boolean ip6AutocfgEnabled) {
    this.ip6AutocfgEnabled = ip6AutocfgEnabled;
  }

  
  /**
   * Placeholder for description of property is_asm of obj type vNIC field type str  type boolean
   * @return isAsm
  **/
  @ApiModelProperty(value = "Placeholder for description of property is_asm of obj type vNIC field type str  type boolean")


 
  @VsoMethod  
  public Boolean isIsAsm() {
    return isAsm;
  }
    
  @VsoMethod
  public void setIsAsm(Boolean isAsm) {
    this.isAsm = isAsm;
  }

  
  /**
   * Placeholder for description of property is_avi_internal_network of obj type vNIC field type str  type boolean
   * @return isAviInternalNetwork
  **/
  @ApiModelProperty(value = "Placeholder for description of property is_avi_internal_network of obj type vNIC field type str  type boolean")


 
  @VsoMethod  
  public Boolean isIsAviInternalNetwork() {
    return isAviInternalNetwork;
  }
    
  @VsoMethod
  public void setIsAviInternalNetwork(Boolean isAviInternalNetwork) {
    this.isAviInternalNetwork = isAviInternalNetwork;
  }

  
  /**
   * Placeholder for description of property is_hsm of obj type vNIC field type str  type boolean
   * @return isHsm
  **/
  @ApiModelProperty(value = "Placeholder for description of property is_hsm of obj type vNIC field type str  type boolean")


 
  @VsoMethod  
  public Boolean isIsHsm() {
    return isHsm;
  }
    
  @VsoMethod
  public void setIsHsm(Boolean isHsm) {
    this.isHsm = isHsm;
  }

  
  /**
   * Placeholder for description of property is_mgmt of obj type vNIC field type str  type boolean
   * @return isMgmt
  **/
  @ApiModelProperty(value = "Placeholder for description of property is_mgmt of obj type vNIC field type str  type boolean")


 
  @VsoMethod  
  public Boolean isIsMgmt() {
    return isMgmt;
  }
    
  @VsoMethod
  public void setIsMgmt(Boolean isMgmt) {
    this.isMgmt = isMgmt;
  }

  
  /**
   * Placeholder for description of property is_portchannel of obj type vNIC field type str  type boolean
   * @return isPortchannel
  **/
  @ApiModelProperty(value = "Placeholder for description of property is_portchannel of obj type vNIC field type str  type boolean")


 
  @VsoMethod  
  public Boolean isIsPortchannel() {
    return isPortchannel;
  }
    
  @VsoMethod
  public void setIsPortchannel(Boolean isPortchannel) {
    this.isPortchannel = isPortchannel;
  }

  
  /**
   * The link is operationally up. Field introduced in 18.2.8, 20.1.1.
   * @return linkUp
  **/
  @ApiModelProperty(value = "The link is operationally up. Field introduced in 18.2.8, 20.1.1.")


 
  @VsoMethod  
  public Boolean isLinkUp() {
    return linkUp;
  }
    
  @VsoMethod
  public void setLinkUp(Boolean linkUp) {
    this.linkUp = linkUp;
  }

  
  /**
   * linux_name of vNIC.
   * @return linuxName
  **/
  @ApiModelProperty(value = "linux_name of vNIC.")


 
  @VsoMethod  
  public String getLinuxName() {
    return linuxName;
  }
    
  @VsoMethod
  public void setLinuxName(String linuxName) {
    this.linuxName = linuxName;
  }

  
  /**
   * mac_address of vNIC.
   * @return macAddress
  **/
  @ApiModelProperty(required = true, value = "mac_address of vNIC.")
  @NotNull


 
  @VsoMethod  
  public String getMacAddress() {
    return macAddress;
  }
    
  @VsoMethod
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  
  public VNIC addMembersItem(MemberInterface membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<MemberInterface>();
    }
    this.members.add(membersItem);
    return this;
  }
  
  /**
   * Placeholder for description of property members of obj type vNIC field type str  type object
   * @return members
  **/
  @ApiModelProperty(value = "Placeholder for description of property members of obj type vNIC field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<MemberInterface> getMembers() {
    return members;
  }
    
  @VsoMethod
  public void setMembers(List<MemberInterface> members) {
    this.members = members;
  }

  
  /**
   * Number of mtu.
   * @return mtu
  **/
  @ApiModelProperty(value = "Number of mtu.")


 
  @VsoMethod  
  public Integer getMtu() {
    return mtu;
  }
    
  @VsoMethod
  public void setMtu(Integer mtu) {
    this.mtu = mtu;
  }

  
  /**
   * network_name of vNIC.
   * @return networkName
  **/
  @ApiModelProperty(value = "network_name of vNIC.")


 
  @VsoMethod  
  public String getNetworkName() {
    return networkName;
  }
    
  @VsoMethod
  public void setNetworkName(String networkName) {
    this.networkName = networkName;
  }

  
  /**
   *  It is a reference to an object of type Network.
   * @return networkRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Network.")


 
  @VsoMethod  
  public String getNetworkRef() {
    return networkRef;
  }
    
  @VsoMethod
  public void setNetworkRef(String networkRef) {
    this.networkRef = networkRef;
  }

  
  /**
   * pci_id of vNIC.
   * @return pciId
  **/
  @ApiModelProperty(value = "pci_id of vNIC.")


 
  @VsoMethod  
  public String getPciId() {
    return pciId;
  }
    
  @VsoMethod
  public void setPciId(String pciId) {
    this.pciId = pciId;
  }

  
  /**
   * Unique object identifier of port.
   * @return portUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of port.")


 
  @VsoMethod  
  public String getPortUuid() {
    return portUuid;
  }
    
  @VsoMethod
  public void setPortUuid(String portUuid) {
    this.portUuid = portUuid;
  }

  
  /**
   * Number of vlan_id.
   * @return vlanId
  **/
  @ApiModelProperty(value = "Number of vlan_id.")


 
  @VsoMethod  
  public Integer getVlanId() {
    return vlanId;
  }
    
  @VsoMethod
  public void setVlanId(Integer vlanId) {
    this.vlanId = vlanId;
  }

  
  public VNIC addVlanInterfacesItem(VlanInterface vlanInterfacesItem) {
    if (this.vlanInterfaces == null) {
      this.vlanInterfaces = new ArrayList<VlanInterface>();
    }
    this.vlanInterfaces.add(vlanInterfacesItem);
    return this;
  }
  
  /**
   * Placeholder for description of property vlan_interfaces of obj type vNIC field type str  type object
   * @return vlanInterfaces
  **/
  @ApiModelProperty(value = "Placeholder for description of property vlan_interfaces of obj type vNIC field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<VlanInterface> getVlanInterfaces() {
    return vlanInterfaces;
  }
    
  @VsoMethod
  public void setVlanInterfaces(List<VlanInterface> vlanInterfaces) {
    this.vlanInterfaces = vlanInterfaces;
  }

  
  public VNIC addVnicNetworksItem(VNICNetwork vnicNetworksItem) {
    if (this.vnicNetworks == null) {
      this.vnicNetworks = new ArrayList<VNICNetwork>();
    }
    this.vnicNetworks.add(vnicNetworksItem);
    return this;
  }
  
  /**
   * Placeholder for description of property vnic_networks of obj type vNIC field type str  type object
   * @return vnicNetworks
  **/
  @ApiModelProperty(value = "Placeholder for description of property vnic_networks of obj type vNIC field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<VNICNetwork> getVnicNetworks() {
    return vnicNetworks;
  }
    
  @VsoMethod
  public void setVnicNetworks(List<VNICNetwork> vnicNetworks) {
    this.vnicNetworks = vnicNetworks;
  }

  
  /**
   * Number of vrf_id.
   * @return vrfId
  **/
  @ApiModelProperty(value = "Number of vrf_id.")


 
  @VsoMethod  
  public Integer getVrfId() {
    return vrfId;
  }
    
  @VsoMethod
  public void setVrfId(Integer vrfId) {
    this.vrfId = vrfId;
  }

  
  /**
   *  It is a reference to an object of type VrfContext.
   * @return vrfRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VrfContext.")


 
  @VsoMethod  
  public String getVrfRef() {
    return vrfRef;
  }
    
  @VsoMethod
  public void setVrfRef(String vrfRef) {
    this.vrfRef = vrfRef;
  }

  
  public String getObjectID() {
		return "VNIC";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VNIC vNIC = (VNIC) o;
    return Objects.equals(this.adapter, vNIC.adapter) &&
        Objects.equals(this.aggregatorChgd, vNIC.aggregatorChgd) &&
        Objects.equals(this.canSeDpTakeover, vNIC.canSeDpTakeover) &&
        Objects.equals(this.connected, vNIC.connected) &&
        Objects.equals(this.delPending, vNIC.delPending) &&
        Objects.equals(this.deleteVnic, vNIC.deleteVnic) &&
        Objects.equals(this.dhcpEnabled, vNIC.dhcpEnabled) &&
        Objects.equals(this.dpDeletionDone, vNIC.dpDeletionDone) &&
        Objects.equals(this.enabled, vNIC.enabled) &&
        Objects.equals(this.ifName, vNIC.ifName) &&
        Objects.equals(this.ip6AutocfgEnabled, vNIC.ip6AutocfgEnabled) &&
        Objects.equals(this.isAsm, vNIC.isAsm) &&
        Objects.equals(this.isAviInternalNetwork, vNIC.isAviInternalNetwork) &&
        Objects.equals(this.isHsm, vNIC.isHsm) &&
        Objects.equals(this.isMgmt, vNIC.isMgmt) &&
        Objects.equals(this.isPortchannel, vNIC.isPortchannel) &&
        Objects.equals(this.linkUp, vNIC.linkUp) &&
        Objects.equals(this.linuxName, vNIC.linuxName) &&
        Objects.equals(this.macAddress, vNIC.macAddress) &&
        Objects.equals(this.members, vNIC.members) &&
        Objects.equals(this.mtu, vNIC.mtu) &&
        Objects.equals(this.networkName, vNIC.networkName) &&
        Objects.equals(this.networkRef, vNIC.networkRef) &&
        Objects.equals(this.pciId, vNIC.pciId) &&
        Objects.equals(this.portUuid, vNIC.portUuid) &&
        Objects.equals(this.vlanId, vNIC.vlanId) &&
        Objects.equals(this.vlanInterfaces, vNIC.vlanInterfaces) &&
        Objects.equals(this.vnicNetworks, vNIC.vnicNetworks) &&
        Objects.equals(this.vrfId, vNIC.vrfId) &&
        Objects.equals(this.vrfRef, vNIC.vrfRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adapter, aggregatorChgd, canSeDpTakeover, connected, delPending, deleteVnic, dhcpEnabled, dpDeletionDone, enabled, ifName, ip6AutocfgEnabled, isAsm, isAviInternalNetwork, isHsm, isMgmt, isPortchannel, linkUp, linuxName, macAddress, members, mtu, networkName, networkRef, pciId, portUuid, vlanId, vlanInterfaces, vnicNetworks, vrfId, vrfRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VNIC {\n");
    
    sb.append("    adapter: ").append(toIndentedString(adapter)).append("\n");
    sb.append("    aggregatorChgd: ").append(toIndentedString(aggregatorChgd)).append("\n");
    sb.append("    canSeDpTakeover: ").append(toIndentedString(canSeDpTakeover)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    delPending: ").append(toIndentedString(delPending)).append("\n");
    sb.append("    deleteVnic: ").append(toIndentedString(deleteVnic)).append("\n");
    sb.append("    dhcpEnabled: ").append(toIndentedString(dhcpEnabled)).append("\n");
    sb.append("    dpDeletionDone: ").append(toIndentedString(dpDeletionDone)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    ifName: ").append(toIndentedString(ifName)).append("\n");
    sb.append("    ip6AutocfgEnabled: ").append(toIndentedString(ip6AutocfgEnabled)).append("\n");
    sb.append("    isAsm: ").append(toIndentedString(isAsm)).append("\n");
    sb.append("    isAviInternalNetwork: ").append(toIndentedString(isAviInternalNetwork)).append("\n");
    sb.append("    isHsm: ").append(toIndentedString(isHsm)).append("\n");
    sb.append("    isMgmt: ").append(toIndentedString(isMgmt)).append("\n");
    sb.append("    isPortchannel: ").append(toIndentedString(isPortchannel)).append("\n");
    sb.append("    linkUp: ").append(toIndentedString(linkUp)).append("\n");
    sb.append("    linuxName: ").append(toIndentedString(linuxName)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
    sb.append("    networkRef: ").append(toIndentedString(networkRef)).append("\n");
    sb.append("    pciId: ").append(toIndentedString(pciId)).append("\n");
    sb.append("    portUuid: ").append(toIndentedString(portUuid)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
    sb.append("    vlanInterfaces: ").append(toIndentedString(vlanInterfaces)).append("\n");
    sb.append("    vnicNetworks: ").append(toIndentedString(vnicNetworks)).append("\n");
    sb.append("    vrfId: ").append(toIndentedString(vrfId)).append("\n");
    sb.append("    vrfRef: ").append(toIndentedString(vrfRef)).append("\n");
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

