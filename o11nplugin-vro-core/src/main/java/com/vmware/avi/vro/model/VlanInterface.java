package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.VNICNetwork;
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
 * VlanInterface
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VlanInterface")
@VsoFinder(name = Constants.FINDER_VRO_VLANINTERFACE, idAccessor = "getObjectID()")
@Service
public class VlanInterface extends AviRestResource  {
  @JsonProperty("dhcp_enabled")
  private Boolean dhcpEnabled = true;

  @JsonProperty("enabled")
  private Boolean enabled = true;

  @JsonProperty("if_name")
  private String ifName = null;

  @JsonProperty("ip6_autocfg_enabled")
  private Boolean ip6AutocfgEnabled = true;

  @JsonProperty("is_mgmt")
  private Boolean isMgmt = null;

  @JsonProperty("vlan_id")
  private Integer vlanId = null;

  @JsonProperty("vnic_networks")
  @Valid
  private List<VNICNetwork> vnicNetworks = null;

  @JsonProperty("vrf_ref")
  private String vrfRef = null;

  
  /**
   * Placeholder for description of property dhcp_enabled of obj type VlanInterface field type str  type boolean
   * @return dhcpEnabled
  **/
  @ApiModelProperty(value = "Placeholder for description of property dhcp_enabled of obj type VlanInterface field type str  type boolean")


 
  @VsoMethod  
  public Boolean isDhcpEnabled() {
    return dhcpEnabled;
  }
    
  @VsoMethod
  public void setDhcpEnabled(Boolean dhcpEnabled) {
    this.dhcpEnabled = dhcpEnabled;
  }

  
  /**
   * Enable the interface. Field introduced in 18.2.5.
   * @return enabled
  **/
  @ApiModelProperty(value = "Enable the interface. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * if_name of VlanInterface.
   * @return ifName
  **/
  @ApiModelProperty(required = true, value = "if_name of VlanInterface.")
  @NotNull


 
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
   * Placeholder for description of property is_mgmt of obj type VlanInterface field type str  type boolean
   * @return isMgmt
  **/
  @ApiModelProperty(value = "Placeholder for description of property is_mgmt of obj type VlanInterface field type str  type boolean")


 
  @VsoMethod  
  public Boolean isIsMgmt() {
    return isMgmt;
  }
    
  @VsoMethod
  public void setIsMgmt(Boolean isMgmt) {
    this.isMgmt = isMgmt;
  }

  
  /**
   * VLAN ID. Allowed values are 0-4096.
   * @return vlanId
  **/
  @ApiModelProperty(value = "VLAN ID. Allowed values are 0-4096.")


 
  @VsoMethod  
  public Integer getVlanId() {
    return vlanId;
  }
    
  @VsoMethod
  public void setVlanId(Integer vlanId) {
    this.vlanId = vlanId;
  }

  
  public VlanInterface addVnicNetworksItem(VNICNetwork vnicNetworksItem) {
    if (this.vnicNetworks == null) {
      this.vnicNetworks = new ArrayList<VNICNetwork>();
    }
    this.vnicNetworks.add(vnicNetworksItem);
    return this;
  }
  
  /**
   * Placeholder for description of property vnic_networks of obj type VlanInterface field type str  type object
   * @return vnicNetworks
  **/
  @ApiModelProperty(value = "Placeholder for description of property vnic_networks of obj type VlanInterface field type str  type object")

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
		return "VlanInterface";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VlanInterface vlanInterface = (VlanInterface) o;
    return Objects.equals(this.dhcpEnabled, vlanInterface.dhcpEnabled) &&
        Objects.equals(this.enabled, vlanInterface.enabled) &&
        Objects.equals(this.ifName, vlanInterface.ifName) &&
        Objects.equals(this.ip6AutocfgEnabled, vlanInterface.ip6AutocfgEnabled) &&
        Objects.equals(this.isMgmt, vlanInterface.isMgmt) &&
        Objects.equals(this.vlanId, vlanInterface.vlanId) &&
        Objects.equals(this.vnicNetworks, vlanInterface.vnicNetworks) &&
        Objects.equals(this.vrfRef, vlanInterface.vrfRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dhcpEnabled, enabled, ifName, ip6AutocfgEnabled, isMgmt, vlanId, vnicNetworks, vrfRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VlanInterface {\n");
    
    sb.append("    dhcpEnabled: ").append(toIndentedString(dhcpEnabled)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    ifName: ").append(toIndentedString(ifName)).append("\n");
    sb.append("    ip6AutocfgEnabled: ").append(toIndentedString(ip6AutocfgEnabled)).append("\n");
    sb.append("    isMgmt: ").append(toIndentedString(isMgmt)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
    sb.append("    vnicNetworks: ").append(toIndentedString(vnicNetworks)).append("\n");
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

