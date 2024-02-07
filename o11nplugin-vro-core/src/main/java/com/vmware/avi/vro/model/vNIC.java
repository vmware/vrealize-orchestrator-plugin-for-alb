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
 * The vNIC is a POJO class extends AviRestResource that used for creating
 * vNIC.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "vNIC")
@VsoFinder(name = Constants.FINDER_VRO_VNIC)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class vNIC extends AviRestResource {
    @JsonProperty("adapter")
    @JsonInclude(Include.NON_NULL)
    private String adapter;

    @JsonProperty("aggregator_chgd")
    @JsonInclude(Include.NON_NULL)
    private Boolean aggregatorChgd = false;

    @JsonProperty("can_se_dp_takeover")
    @JsonInclude(Include.NON_NULL)
    private Boolean canSeDpTakeover = true;

    @JsonProperty("connected")
    @JsonInclude(Include.NON_NULL)
    private Boolean connected;

    @JsonProperty("del_pending")
    @JsonInclude(Include.NON_NULL)
    private Boolean delPending = false;

    @JsonProperty("delete_vnic")
    @JsonInclude(Include.NON_NULL)
    private Boolean deleteVnic = false;

    @JsonProperty("dhcp_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean dhcpEnabled = true;

    @JsonProperty("dp_deletion_done")
    @JsonInclude(Include.NON_NULL)
    private Boolean dpDeletionDone = false;

    @JsonProperty("enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean enabled = true;

    @JsonProperty("if_name")
    @JsonInclude(Include.NON_NULL)
    private String ifName;

    @JsonProperty("ip6_autocfg_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean ip6AutocfgEnabled = true;

    @JsonProperty("is_asm")
    @JsonInclude(Include.NON_NULL)
    private Boolean isAsm = false;

    @JsonProperty("is_avi_internal_network")
    @JsonInclude(Include.NON_NULL)
    private Boolean isAviInternalNetwork = false;

    @JsonProperty("is_hsm")
    @JsonInclude(Include.NON_NULL)
    private Boolean isHsm = false;

    @JsonProperty("is_mgmt")
    @JsonInclude(Include.NON_NULL)
    private Boolean isMgmt = false;

    @JsonProperty("is_portchannel")
    @JsonInclude(Include.NON_NULL)
    private Boolean isPortchannel = false;

    @JsonProperty("link_up")
    @JsonInclude(Include.NON_NULL)
    private Boolean linkUp = true;

    @JsonProperty("linux_name")
    @JsonInclude(Include.NON_NULL)
    private String linuxName;

    @JsonProperty("mac_address")
    @JsonInclude(Include.NON_NULL)
    private String macAddress;

    @JsonProperty("members")
    @JsonInclude(Include.NON_NULL)
    private List<MemberInterface> members;

    @JsonProperty("mtu")
    @JsonInclude(Include.NON_NULL)
    private Integer mtu = 1500;

    @JsonProperty("network_name")
    @JsonInclude(Include.NON_NULL)
    private String networkName;

    @JsonProperty("network_ref")
    @JsonInclude(Include.NON_NULL)
    private String networkRef;

    @JsonProperty("num_rx_descriptors")
    @JsonInclude(Include.NON_NULL)
    private Integer numRxDescriptors;

    @JsonProperty("num_tx_descriptors")
    @JsonInclude(Include.NON_NULL)
    private Integer numTxDescriptors;

    @JsonProperty("pci_id")
    @JsonInclude(Include.NON_NULL)
    private String pciId;

    @JsonProperty("port_uuid")
    @JsonInclude(Include.NON_NULL)
    private String portUuid;

    @JsonProperty("vlan_id")
    @JsonInclude(Include.NON_NULL)
    private Integer vlanId = 0;

    @JsonProperty("vlan_interfaces")
    @JsonInclude(Include.NON_NULL)
    private List<VlanInterface> vlanInterfaces;

    @JsonProperty("vnic_networks")
    @JsonInclude(Include.NON_NULL)
    private List<vNICNetwork> vnicNetworks;

    @JsonProperty("vrf_id")
    @JsonInclude(Include.NON_NULL)
    private Integer vrfId = 0;

    @JsonProperty("vrf_ref")
    @JsonInclude(Include.NON_NULL)
    private String vrfRef;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return adapter
   */
  @VsoMethod
  public String getAdapter() {
    return adapter;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param adapter set the adapter.
   */
  @VsoMethod
  public void setAdapter(String  adapter) {
    this.adapter = adapter;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return aggregatorChgd
   */
  @VsoMethod
  public Boolean getAggregatorChgd() {
    return aggregatorChgd;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param aggregatorChgd set the aggregatorChgd.
   */
  @VsoMethod
  public void setAggregatorChgd(Boolean  aggregatorChgd) {
    this.aggregatorChgd = aggregatorChgd;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return canSeDpTakeover
   */
  @VsoMethod
  public Boolean getCanSeDpTakeover() {
    return canSeDpTakeover;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param canSeDpTakeover set the canSeDpTakeover.
   */
  @VsoMethod
  public void setCanSeDpTakeover(Boolean  canSeDpTakeover) {
    this.canSeDpTakeover = canSeDpTakeover;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return connected
   */
  @VsoMethod
  public Boolean getConnected() {
    return connected;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param connected set the connected.
   */
  @VsoMethod
  public void setConnected(Boolean  connected) {
    this.connected = connected;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return delPending
   */
  @VsoMethod
  public Boolean getDelPending() {
    return delPending;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param delPending set the delPending.
   */
  @VsoMethod
  public void setDelPending(Boolean  delPending) {
    this.delPending = delPending;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Delete this vnic.
   * Please confirm dp_deletion_done before removing the vnic from the cloud.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return deleteVnic
   */
  @VsoMethod
  public Boolean getDeleteVnic() {
    return deleteVnic;
  }

  /**
   * This is the setter method to the attribute.
   * Delete this vnic.
   * Please confirm dp_deletion_done before removing the vnic from the cloud.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param deleteVnic set the deleteVnic.
   */
  @VsoMethod
  public void setDeleteVnic(Boolean  deleteVnic) {
    this.deleteVnic = deleteVnic;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return dhcpEnabled
   */
  @VsoMethod
  public Boolean getDhcpEnabled() {
    return dhcpEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param dhcpEnabled set the dhcpEnabled.
   */
  @VsoMethod
  public void setDhcpEnabled(Boolean  dhcpEnabled) {
    this.dhcpEnabled = dhcpEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The vnic has been cleaned up in the datapath.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return dpDeletionDone
   */
  @VsoMethod
  public Boolean getDpDeletionDone() {
    return dpDeletionDone;
  }

  /**
   * This is the setter method to the attribute.
   * The vnic has been cleaned up in the datapath.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param dpDeletionDone set the dpDeletionDone.
   */
  @VsoMethod
  public void setDpDeletionDone(Boolean  dpDeletionDone) {
    this.dpDeletionDone = dpDeletionDone;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ifName
   */
  @VsoMethod
  public String getIfName() {
    return ifName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ifName set the ifName.
   */
  @VsoMethod
  public void setIfName(String  ifName) {
    this.ifName = ifName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable ipv6 auto configuration.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return ip6AutocfgEnabled
   */
  @VsoMethod
  public Boolean getIp6AutocfgEnabled() {
    return ip6AutocfgEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable ipv6 auto configuration.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param ip6AutocfgEnabled set the ip6AutocfgEnabled.
   */
  @VsoMethod
  public void setIp6AutocfgEnabled(Boolean  ip6AutocfgEnabled) {
    this.ip6AutocfgEnabled = ip6AutocfgEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isAsm
   */
  @VsoMethod
  public Boolean getIsAsm() {
    return isAsm;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isAsm set the isAsm.
   */
  @VsoMethod
  public void setIsAsm(Boolean  isAsm) {
    this.isAsm = isAsm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isAviInternalNetwork
   */
  @VsoMethod
  public Boolean getIsAviInternalNetwork() {
    return isAviInternalNetwork;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isAviInternalNetwork set the isAviInternalNetwork.
   */
  @VsoMethod
  public void setIsAviInternalNetwork(Boolean  isAviInternalNetwork) {
    this.isAviInternalNetwork = isAviInternalNetwork;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isHsm
   */
  @VsoMethod
  public Boolean getIsHsm() {
    return isHsm;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isHsm set the isHsm.
   */
  @VsoMethod
  public void setIsHsm(Boolean  isHsm) {
    this.isHsm = isHsm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isMgmt
   */
  @VsoMethod
  public Boolean getIsMgmt() {
    return isMgmt;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isMgmt set the isMgmt.
   */
  @VsoMethod
  public void setIsMgmt(Boolean  isMgmt) {
    this.isMgmt = isMgmt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isPortchannel
   */
  @VsoMethod
  public Boolean getIsPortchannel() {
    return isPortchannel;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isPortchannel set the isPortchannel.
   */
  @VsoMethod
  public void setIsPortchannel(Boolean  isPortchannel) {
    this.isPortchannel = isPortchannel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The link is operationally up.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return linkUp
   */
  @VsoMethod
  public Boolean getLinkUp() {
    return linkUp;
  }

  /**
   * This is the setter method to the attribute.
   * The link is operationally up.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param linkUp set the linkUp.
   */
  @VsoMethod
  public void setLinkUp(Boolean  linkUp) {
    this.linkUp = linkUp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return linuxName
   */
  @VsoMethod
  public String getLinuxName() {
    return linuxName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param linuxName set the linuxName.
   */
  @VsoMethod
  public void setLinuxName(String  linuxName) {
    this.linuxName = linuxName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return macAddress
   */
  @VsoMethod
  public String getMacAddress() {
    return macAddress;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param macAddress set the macAddress.
   */
  @VsoMethod
  public void setMacAddress(String  macAddress) {
    this.macAddress = macAddress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return members
   */
  @VsoMethod
  public List<MemberInterface> getMembers() {
    return members;
  }

  /**
   * This is the setter method. this will set the members
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return members
   */
  @VsoMethod
  public void setMembers(List<MemberInterface>  members) {
    this.members = members;
  }

  /**
   * This is the setter method this will set the members
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return members
   */
  @VsoMethod
  public vNIC addMembersItem(MemberInterface membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<MemberInterface>();
    }
    this.members.add(membersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1500.
   * @return mtu
   */
  @VsoMethod
  public Integer getMtu() {
    return mtu;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1500.
   * @param mtu set the mtu.
   */
  @VsoMethod
  public void setMtu(Integer  mtu) {
    this.mtu = mtu;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networkName
   */
  @VsoMethod
  public String getNetworkName() {
    return networkName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param networkName set the networkName.
   */
  @VsoMethod
  public void setNetworkName(String  networkName) {
    this.networkName = networkName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type network.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networkRef
   */
  @VsoMethod
  public String getNetworkRef() {
    return networkRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type network.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param networkRef set the networkRef.
   */
  @VsoMethod
  public void setNetworkRef(String  networkRef) {
    this.networkRef = networkRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User defined value for rx descriptor ring size, expressed as power of 2.
   * Setting a value of 0 implies the default value for that environment.
   * (tech-preview, vcenter only).
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numRxDescriptors
   */
  @VsoMethod
  public Integer getNumRxDescriptors() {
    return numRxDescriptors;
  }

  /**
   * This is the setter method to the attribute.
   * User defined value for rx descriptor ring size, expressed as power of 2.
   * Setting a value of 0 implies the default value for that environment.
   * (tech-preview, vcenter only).
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numRxDescriptors set the numRxDescriptors.
   */
  @VsoMethod
  public void setNumRxDescriptors(Integer  numRxDescriptors) {
    this.numRxDescriptors = numRxDescriptors;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User defined value for tx descriptor ring size, expressed as power of 2.
   * Setting a value of 0 implies the default value for that environment.
   * (tech-preview, vcenter only).
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numTxDescriptors
   */
  @VsoMethod
  public Integer getNumTxDescriptors() {
    return numTxDescriptors;
  }

  /**
   * This is the setter method to the attribute.
   * User defined value for tx descriptor ring size, expressed as power of 2.
   * Setting a value of 0 implies the default value for that environment.
   * (tech-preview, vcenter only).
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numTxDescriptors set the numTxDescriptors.
   */
  @VsoMethod
  public void setNumTxDescriptors(Integer  numTxDescriptors) {
    this.numTxDescriptors = numTxDescriptors;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pciId
   */
  @VsoMethod
  public String getPciId() {
    return pciId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pciId set the pciId.
   */
  @VsoMethod
  public void setPciId(String  pciId) {
    this.pciId = pciId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return portUuid
   */
  @VsoMethod
  public String getPortUuid() {
    return portUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param portUuid set the portUuid.
   */
  @VsoMethod
  public void setPortUuid(String  portUuid) {
    this.portUuid = portUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return vlanId
   */
  @VsoMethod
  public Integer getVlanId() {
    return vlanId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param vlanId set the vlanId.
   */
  @VsoMethod
  public void setVlanId(Integer  vlanId) {
    this.vlanId = vlanId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vlanInterfaces
   */
  @VsoMethod
  public List<VlanInterface> getVlanInterfaces() {
    return vlanInterfaces;
  }

  /**
   * This is the setter method. this will set the vlanInterfaces
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vlanInterfaces
   */
  @VsoMethod
  public void setVlanInterfaces(List<VlanInterface>  vlanInterfaces) {
    this.vlanInterfaces = vlanInterfaces;
  }

  /**
   * This is the setter method this will set the vlanInterfaces
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vlanInterfaces
   */
  @VsoMethod
  public vNIC addVlanInterfacesItem(VlanInterface vlanInterfacesItem) {
    if (this.vlanInterfaces == null) {
      this.vlanInterfaces = new ArrayList<VlanInterface>();
    }
    this.vlanInterfaces.add(vlanInterfacesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vnicNetworks
   */
  @VsoMethod
  public List<vNICNetwork> getVnicNetworks() {
    return vnicNetworks;
  }

  /**
   * This is the setter method. this will set the vnicNetworks
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vnicNetworks
   */
  @VsoMethod
  public void setVnicNetworks(List<vNICNetwork>  vnicNetworks) {
    this.vnicNetworks = vnicNetworks;
  }

  /**
   * This is the setter method this will set the vnicNetworks
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vnicNetworks
   */
  @VsoMethod
  public vNIC addVnicNetworksItem(vNICNetwork vnicNetworksItem) {
    if (this.vnicNetworks == null) {
      this.vnicNetworks = new ArrayList<vNICNetwork>();
    }
    this.vnicNetworks.add(vnicNetworksItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return vrfId
   */
  @VsoMethod
  public Integer getVrfId() {
    return vrfId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param vrfId set the vrfId.
   */
  @VsoMethod
  public void setVrfId(Integer  vrfId) {
    this.vrfId = vrfId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type vrfcontext.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vrfRef
   */
  @VsoMethod
  public String getVrfRef() {
    return vrfRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type vrfcontext.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vrfRef set the vrfRef.
   */
  @VsoMethod
  public void setVrfRef(String  vrfRef) {
    this.vrfRef = vrfRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  vNIC objvNIC = (vNIC) o;
  return   Objects.equals(this.ifName, objvNIC.ifName)&&
  Objects.equals(this.macAddress, objvNIC.macAddress)&&
  Objects.equals(this.connected, objvNIC.connected)&&
  Objects.equals(this.isMgmt, objvNIC.isMgmt)&&
  Objects.equals(this.networkRef, objvNIC.networkRef)&&
  Objects.equals(this.networkName, objvNIC.networkName)&&
  Objects.equals(this.dhcpEnabled, objvNIC.dhcpEnabled)&&
  Objects.equals(this.isAviInternalNetwork, objvNIC.isAviInternalNetwork)&&
  Objects.equals(this.enabled, objvNIC.enabled)&&
  Objects.equals(this.adapter, objvNIC.adapter)&&
  Objects.equals(this.vlanId, objvNIC.vlanId)&&
  Objects.equals(this.pciId, objvNIC.pciId)&&
  Objects.equals(this.linuxName, objvNIC.linuxName)&&
  Objects.equals(this.portUuid, objvNIC.portUuid)&&
  Objects.equals(this.delPending, objvNIC.delPending)&&
  Objects.equals(this.mtu, objvNIC.mtu)&&
  Objects.equals(this.vnicNetworks, objvNIC.vnicNetworks)&&
  Objects.equals(this.canSeDpTakeover, objvNIC.canSeDpTakeover)&&
  Objects.equals(this.vrfRef, objvNIC.vrfRef)&&
  Objects.equals(this.vrfId, objvNIC.vrfId)&&
  Objects.equals(this.vlanInterfaces, objvNIC.vlanInterfaces)&&
  Objects.equals(this.isPortchannel, objvNIC.isPortchannel)&&
  Objects.equals(this.members, objvNIC.members)&&
  Objects.equals(this.isHsm, objvNIC.isHsm)&&
  Objects.equals(this.isAsm, objvNIC.isAsm)&&
  Objects.equals(this.ip6AutocfgEnabled, objvNIC.ip6AutocfgEnabled)&&
  Objects.equals(this.aggregatorChgd, objvNIC.aggregatorChgd)&&
  Objects.equals(this.dpDeletionDone, objvNIC.dpDeletionDone)&&
  Objects.equals(this.deleteVnic, objvNIC.deleteVnic)&&
  Objects.equals(this.linkUp, objvNIC.linkUp)&&
  Objects.equals(this.numRxDescriptors, objvNIC.numRxDescriptors)&&
  Objects.equals(this.numTxDescriptors, objvNIC.numTxDescriptors);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class vNIC {\n");
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
        sb.append("    numRxDescriptors: ").append(toIndentedString(numRxDescriptors)).append("\n");
        sb.append("    numTxDescriptors: ").append(toIndentedString(numTxDescriptors)).append("\n");
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

