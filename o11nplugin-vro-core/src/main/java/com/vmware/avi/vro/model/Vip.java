package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DiscoveredNetwork;
import com.vmware.avi.vro.model.IPNetworkSubnet;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.VipPlacementNetwork;
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
 * Vip
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "Vip")
@VsoFinder(name = Constants.FINDER_VRO_VIP, idAccessor = "getObjectID()")
@Service
public class Vip extends AviRestResource  {
  @JsonProperty("auto_allocate_floating_ip")
  private Boolean autoAllocateFloatingIp = null;

  @JsonProperty("auto_allocate_ip")
  private Boolean autoAllocateIp = null;

  @JsonProperty("auto_allocate_ip_type")
  private String autoAllocateIpType = "V4_ONLY";

  @JsonProperty("availability_zone")
  private String availabilityZone = null;

  @JsonProperty("avi_allocated_fip")
  private Boolean aviAllocatedFip = null;

  @JsonProperty("avi_allocated_vip")
  private Boolean aviAllocatedVip = null;

  @JsonProperty("discovered_networks")
  @Valid
  private List<DiscoveredNetwork> discoveredNetworks = null;

  @JsonProperty("enabled")
  private Boolean enabled = true;

  @JsonProperty("floating_ip")
  private IpAddr floatingIp = null;

  @JsonProperty("floating_ip6")
  private IpAddr floatingIp6 = null;

  @JsonProperty("floating_subnet6_uuid")
  private String floatingSubnet6Uuid = null;

  @JsonProperty("floating_subnet_uuid")
  private String floatingSubnetUuid = null;

  @JsonProperty("ip6_address")
  private IpAddr ip6Address = null;

  @JsonProperty("ip_address")
  private IpAddr ipAddress = null;

  @JsonProperty("ipam_network_subnet")
  private IPNetworkSubnet ipamNetworkSubnet = null;

  @JsonProperty("network_ref")
  private String networkRef = null;

  @JsonProperty("placement_networks")
  @Valid
  private List<VipPlacementNetwork> placementNetworks = null;

  @JsonProperty("port_uuid")
  private String portUuid = null;

  @JsonProperty("subnet")
  private IpAddrPrefix subnet = null;

  @JsonProperty("subnet6")
  private IpAddrPrefix subnet6 = null;

  @JsonProperty("subnet6_uuid")
  private String subnet6Uuid = null;

  @JsonProperty("subnet_uuid")
  private String subnetUuid = null;

  @JsonProperty("vip_id")
  private String vipId = null;

  
  /**
   * Auto-allocate floating/elastic IP from the Cloud infrastructure. Field introduced in 17.1.1.
   * @return autoAllocateFloatingIp
  **/
  @ApiModelProperty(value = "Auto-allocate floating/elastic IP from the Cloud infrastructure. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isAutoAllocateFloatingIp() {
    return autoAllocateFloatingIp;
  }
    
  @VsoMethod
  public void setAutoAllocateFloatingIp(Boolean autoAllocateFloatingIp) {
    this.autoAllocateFloatingIp = autoAllocateFloatingIp;
  }

  
  /**
   * Auto-allocate VIP from the provided subnet. Field introduced in 17.1.1.
   * @return autoAllocateIp
  **/
  @ApiModelProperty(value = "Auto-allocate VIP from the provided subnet. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isAutoAllocateIp() {
    return autoAllocateIp;
  }
    
  @VsoMethod
  public void setAutoAllocateIp(Boolean autoAllocateIp) {
    this.autoAllocateIp = autoAllocateIp;
  }

  
  /**
   * Specifies whether to auto-allocate only a V4 address, only a V6 address, or one of each type. Enum options - V4_ONLY, V6_ONLY, V4_V6. Field introduced in 18.1.1.
   * @return autoAllocateIpType
  **/
  @ApiModelProperty(value = "Specifies whether to auto-allocate only a V4 address, only a V6 address, or one of each type. Enum options - V4_ONLY, V6_ONLY, V4_V6. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public String getAutoAllocateIpType() {
    return autoAllocateIpType;
  }
    
  @VsoMethod
  public void setAutoAllocateIpType(String autoAllocateIpType) {
    this.autoAllocateIpType = autoAllocateIpType;
  }

  
  /**
   * Availability-zone to place the Virtual Service. Field introduced in 17.1.1.
   * @return availabilityZone
  **/
  @ApiModelProperty(value = "Availability-zone to place the Virtual Service. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getAvailabilityZone() {
    return availabilityZone;
  }
    
  @VsoMethod
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  
  /**
   * (internal-use) FIP allocated by Avi in the Cloud infrastructure. Field introduced in 17.1.1.
   * @return aviAllocatedFip
  **/
  @ApiModelProperty(value = "(internal-use) FIP allocated by Avi in the Cloud infrastructure. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isAviAllocatedFip() {
    return aviAllocatedFip;
  }
    
  @VsoMethod
  public void setAviAllocatedFip(Boolean aviAllocatedFip) {
    this.aviAllocatedFip = aviAllocatedFip;
  }

  
  /**
   * (internal-use) VIP allocated by Avi in the Cloud infrastructure. Field introduced in 17.1.1.
   * @return aviAllocatedVip
  **/
  @ApiModelProperty(value = "(internal-use) VIP allocated by Avi in the Cloud infrastructure. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isAviAllocatedVip() {
    return aviAllocatedVip;
  }
    
  @VsoMethod
  public void setAviAllocatedVip(Boolean aviAllocatedVip) {
    this.aviAllocatedVip = aviAllocatedVip;
  }

  
  public Vip addDiscoveredNetworksItem(DiscoveredNetwork discoveredNetworksItem) {
    if (this.discoveredNetworks == null) {
      this.discoveredNetworks = new ArrayList<DiscoveredNetwork>();
    }
    this.discoveredNetworks.add(discoveredNetworksItem);
    return this;
  }
  
  /**
   * Discovered networks providing reachability for client facing Vip IP. Field introduced in 17.1.1.
   * @return discoveredNetworks
  **/
  @ApiModelProperty(value = "Discovered networks providing reachability for client facing Vip IP. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<DiscoveredNetwork> getDiscoveredNetworks() {
    return discoveredNetworks;
  }
    
  @VsoMethod
  public void setDiscoveredNetworks(List<DiscoveredNetwork> discoveredNetworks) {
    this.discoveredNetworks = discoveredNetworks;
  }

  
  /**
   * Enable or disable the Vip. Field introduced in 17.1.1.
   * @return enabled
  **/
  @ApiModelProperty(value = "Enable or disable the Vip. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * Floating IPv4 to associate with this Vip. Field introduced in 17.1.1.
   * @return floatingIp
  **/
  @ApiModelProperty(value = "Floating IPv4 to associate with this Vip. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public IpAddr getFloatingIp() {
    return floatingIp;
  }
    
  @VsoMethod
  public void setFloatingIp(IpAddr floatingIp) {
    this.floatingIp = floatingIp;
  }

  
  /**
   * Floating IPv6 address to associate with this Vip. Field introduced in 18.1.1.
   * @return floatingIp6
  **/
  @ApiModelProperty(value = "Floating IPv6 address to associate with this Vip. Field introduced in 18.1.1.")

  @Valid

 
  @VsoMethod  
  public IpAddr getFloatingIp6() {
    return floatingIp6;
  }
    
  @VsoMethod
  public void setFloatingIp6(IpAddr floatingIp6) {
    this.floatingIp6 = floatingIp6;
  }

  
  /**
   * If auto_allocate_floating_ip is True and more than one floating-ip subnets exist, then the subnet for the floating IPv6 address allocation. Field introduced in 18.1.1.
   * @return floatingSubnet6Uuid
  **/
  @ApiModelProperty(value = "If auto_allocate_floating_ip is True and more than one floating-ip subnets exist, then the subnet for the floating IPv6 address allocation. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public String getFloatingSubnet6Uuid() {
    return floatingSubnet6Uuid;
  }
    
  @VsoMethod
  public void setFloatingSubnet6Uuid(String floatingSubnet6Uuid) {
    this.floatingSubnet6Uuid = floatingSubnet6Uuid;
  }

  
  /**
   * If auto_allocate_floating_ip is True and more than one floating-ip subnets exist, then the subnet for the floating IP address allocation. Field introduced in 17.1.1.
   * @return floatingSubnetUuid
  **/
  @ApiModelProperty(value = "If auto_allocate_floating_ip is True and more than one floating-ip subnets exist, then the subnet for the floating IP address allocation. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getFloatingSubnetUuid() {
    return floatingSubnetUuid;
  }
    
  @VsoMethod
  public void setFloatingSubnetUuid(String floatingSubnetUuid) {
    this.floatingSubnetUuid = floatingSubnetUuid;
  }

  
  /**
   * IPv6 Address of the Vip. Field introduced in 18.1.1.
   * @return ip6Address
  **/
  @ApiModelProperty(value = "IPv6 Address of the Vip. Field introduced in 18.1.1.")

  @Valid

 
  @VsoMethod  
  public IpAddr getIp6Address() {
    return ip6Address;
  }
    
  @VsoMethod
  public void setIp6Address(IpAddr ip6Address) {
    this.ip6Address = ip6Address;
  }

  
  /**
   * IPv4 Address of the VIP. Field introduced in 17.1.1.
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IPv4 Address of the VIP. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public IpAddr getIpAddress() {
    return ipAddress;
  }
    
  @VsoMethod
  public void setIpAddress(IpAddr ipAddress) {
    this.ipAddress = ipAddress;
  }

  
  /**
   * Subnet and/or Network for allocating VirtualService IP by IPAM Provider module. Field introduced in 17.1.1.
   * @return ipamNetworkSubnet
  **/
  @ApiModelProperty(value = "Subnet and/or Network for allocating VirtualService IP by IPAM Provider module. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public IPNetworkSubnet getIpamNetworkSubnet() {
    return ipamNetworkSubnet;
  }
    
  @VsoMethod
  public void setIpamNetworkSubnet(IPNetworkSubnet ipamNetworkSubnet) {
    this.ipamNetworkSubnet = ipamNetworkSubnet;
  }

  
  /**
   * Manually override the network on which the Vip is placed. It is a reference to an object of type Network. Field introduced in 17.1.1.
   * @return networkRef
  **/
  @ApiModelProperty(value = "Manually override the network on which the Vip is placed. It is a reference to an object of type Network. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getNetworkRef() {
    return networkRef;
  }
    
  @VsoMethod
  public void setNetworkRef(String networkRef) {
    this.networkRef = networkRef;
  }

  
  public Vip addPlacementNetworksItem(VipPlacementNetwork placementNetworksItem) {
    if (this.placementNetworks == null) {
      this.placementNetworks = new ArrayList<VipPlacementNetwork>();
    }
    this.placementNetworks.add(placementNetworksItem);
    return this;
  }
  
  /**
   * Placement networks/subnets to use for vip placement. Field introduced in 18.2.5.
   * @return placementNetworks
  **/
  @ApiModelProperty(value = "Placement networks/subnets to use for vip placement. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public List<VipPlacementNetwork> getPlacementNetworks() {
    return placementNetworks;
  }
    
  @VsoMethod
  public void setPlacementNetworks(List<VipPlacementNetwork> placementNetworks) {
    this.placementNetworks = placementNetworks;
  }

  
  /**
   * (internal-use) Network port assigned to the Vip IP address. Field introduced in 17.1.1.
   * @return portUuid
  **/
  @ApiModelProperty(value = "(internal-use) Network port assigned to the Vip IP address. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getPortUuid() {
    return portUuid;
  }
    
  @VsoMethod
  public void setPortUuid(String portUuid) {
    this.portUuid = portUuid;
  }

  
  /**
   * Subnet providing reachability for client facing Vip IP. Field introduced in 17.1.1.
   * @return subnet
  **/
  @ApiModelProperty(value = "Subnet providing reachability for client facing Vip IP. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getSubnet() {
    return subnet;
  }
    
  @VsoMethod
  public void setSubnet(IpAddrPrefix subnet) {
    this.subnet = subnet;
  }

  
  /**
   * Subnet providing reachability for client facing Vip IPv6. Field introduced in 18.1.1.
   * @return subnet6
  **/
  @ApiModelProperty(value = "Subnet providing reachability for client facing Vip IPv6. Field introduced in 18.1.1.")

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getSubnet6() {
    return subnet6;
  }
    
  @VsoMethod
  public void setSubnet6(IpAddrPrefix subnet6) {
    this.subnet6 = subnet6;
  }

  
  /**
   * If auto_allocate_ip is True, then the subnet for the Vip IPv6 address allocation. This field is applicable only if the VirtualService belongs to an Openstack or AWS cloud, in which case it is mandatory, if auto_allocate is selected. Field introduced in 18.1.1.
   * @return subnet6Uuid
  **/
  @ApiModelProperty(value = "If auto_allocate_ip is True, then the subnet for the Vip IPv6 address allocation. This field is applicable only if the VirtualService belongs to an Openstack or AWS cloud, in which case it is mandatory, if auto_allocate is selected. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public String getSubnet6Uuid() {
    return subnet6Uuid;
  }
    
  @VsoMethod
  public void setSubnet6Uuid(String subnet6Uuid) {
    this.subnet6Uuid = subnet6Uuid;
  }

  
  /**
   * If auto_allocate_ip is True, then the subnet for the Vip IP address allocation. This field is applicable only if the VirtualService belongs to an Openstack or AWS cloud, in which case it is mandatory, if auto_allocate is selected. Field introduced in 17.1.1.
   * @return subnetUuid
  **/
  @ApiModelProperty(value = "If auto_allocate_ip is True, then the subnet for the Vip IP address allocation. This field is applicable only if the VirtualService belongs to an Openstack or AWS cloud, in which case it is mandatory, if auto_allocate is selected. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getSubnetUuid() {
    return subnetUuid;
  }
    
  @VsoMethod
  public void setSubnetUuid(String subnetUuid) {
    this.subnetUuid = subnetUuid;
  }

  
  /**
   * Unique ID associated with the vip. Field introduced in 17.1.1.
   * @return vipId
  **/
  @ApiModelProperty(required = true, value = "Unique ID associated with the vip. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getVipId() {
    return vipId;
  }
    
  @VsoMethod
  public void setVipId(String vipId) {
    this.vipId = vipId;
  }

  
  public String getObjectID() {
		return "Vip";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vip vip = (Vip) o;
    return Objects.equals(this.autoAllocateFloatingIp, vip.autoAllocateFloatingIp) &&
        Objects.equals(this.autoAllocateIp, vip.autoAllocateIp) &&
        Objects.equals(this.autoAllocateIpType, vip.autoAllocateIpType) &&
        Objects.equals(this.availabilityZone, vip.availabilityZone) &&
        Objects.equals(this.aviAllocatedFip, vip.aviAllocatedFip) &&
        Objects.equals(this.aviAllocatedVip, vip.aviAllocatedVip) &&
        Objects.equals(this.discoveredNetworks, vip.discoveredNetworks) &&
        Objects.equals(this.enabled, vip.enabled) &&
        Objects.equals(this.floatingIp, vip.floatingIp) &&
        Objects.equals(this.floatingIp6, vip.floatingIp6) &&
        Objects.equals(this.floatingSubnet6Uuid, vip.floatingSubnet6Uuid) &&
        Objects.equals(this.floatingSubnetUuid, vip.floatingSubnetUuid) &&
        Objects.equals(this.ip6Address, vip.ip6Address) &&
        Objects.equals(this.ipAddress, vip.ipAddress) &&
        Objects.equals(this.ipamNetworkSubnet, vip.ipamNetworkSubnet) &&
        Objects.equals(this.networkRef, vip.networkRef) &&
        Objects.equals(this.placementNetworks, vip.placementNetworks) &&
        Objects.equals(this.portUuid, vip.portUuid) &&
        Objects.equals(this.subnet, vip.subnet) &&
        Objects.equals(this.subnet6, vip.subnet6) &&
        Objects.equals(this.subnet6Uuid, vip.subnet6Uuid) &&
        Objects.equals(this.subnetUuid, vip.subnetUuid) &&
        Objects.equals(this.vipId, vip.vipId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAllocateFloatingIp, autoAllocateIp, autoAllocateIpType, availabilityZone, aviAllocatedFip, aviAllocatedVip, discoveredNetworks, enabled, floatingIp, floatingIp6, floatingSubnet6Uuid, floatingSubnetUuid, ip6Address, ipAddress, ipamNetworkSubnet, networkRef, placementNetworks, portUuid, subnet, subnet6, subnet6Uuid, subnetUuid, vipId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vip {\n");
    
    sb.append("    autoAllocateFloatingIp: ").append(toIndentedString(autoAllocateFloatingIp)).append("\n");
    sb.append("    autoAllocateIp: ").append(toIndentedString(autoAllocateIp)).append("\n");
    sb.append("    autoAllocateIpType: ").append(toIndentedString(autoAllocateIpType)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    aviAllocatedFip: ").append(toIndentedString(aviAllocatedFip)).append("\n");
    sb.append("    aviAllocatedVip: ").append(toIndentedString(aviAllocatedVip)).append("\n");
    sb.append("    discoveredNetworks: ").append(toIndentedString(discoveredNetworks)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    floatingIp: ").append(toIndentedString(floatingIp)).append("\n");
    sb.append("    floatingIp6: ").append(toIndentedString(floatingIp6)).append("\n");
    sb.append("    floatingSubnet6Uuid: ").append(toIndentedString(floatingSubnet6Uuid)).append("\n");
    sb.append("    floatingSubnetUuid: ").append(toIndentedString(floatingSubnetUuid)).append("\n");
    sb.append("    ip6Address: ").append(toIndentedString(ip6Address)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipamNetworkSubnet: ").append(toIndentedString(ipamNetworkSubnet)).append("\n");
    sb.append("    networkRef: ").append(toIndentedString(networkRef)).append("\n");
    sb.append("    placementNetworks: ").append(toIndentedString(placementNetworks)).append("\n");
    sb.append("    portUuid: ").append(toIndentedString(portUuid)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
    sb.append("    subnet6: ").append(toIndentedString(subnet6)).append("\n");
    sb.append("    subnet6Uuid: ").append(toIndentedString(subnet6Uuid)).append("\n");
    sb.append("    subnetUuid: ").append(toIndentedString(subnetUuid)).append("\n");
    sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
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

