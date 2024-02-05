package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.FlowtableProfile;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The RoutingService is a POJO class extends AviRestResource that used for creating
 * RoutingService.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RoutingService")
@VsoFinder(name = Constants.FINDER_VRO_ROUTINGSERVICE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RoutingService extends AviRestResource {
    @JsonProperty("advertise_backend_networks")
    @JsonInclude(Include.NON_NULL)
    private Boolean advertiseBackendNetworks = false;

    @JsonProperty("enable_auto_gateway")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableAutoGateway = false;

    @JsonProperty("enable_routing")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableRouting = false;

    @JsonProperty("enable_vip_on_all_interfaces")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableVipOnAllInterfaces = true;

    @JsonProperty("enable_vmac")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableVmac = false;

    @JsonProperty("floating_intf_ip")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddr> floatingIntfIp;

    @JsonProperty("floating_intf_ip6_addresses")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddr> floatingIntfIp6Addresses;

    @JsonProperty("floating_intf_ip6_se_2_addresses")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddr> floatingIntfIp6Se2Addresses;

    @JsonProperty("floating_intf_ip_se_2")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddr> floatingIntfIpSe2;

    @JsonProperty("flowtable_profile")
    @JsonInclude(Include.NON_NULL)
    private FlowtableProfile flowtableProfile;

    @JsonProperty("graceful_restart")
    @JsonInclude(Include.NON_NULL)
    private Boolean gracefulRestart = false;

    @JsonProperty("nat_policy_ref")
    @JsonInclude(Include.NON_NULL)
    private String natPolicyRef;

    @JsonProperty("routing_by_linux_ipstack")
    @JsonInclude(Include.NON_NULL)
    private Boolean routingByLinuxIpstack = false;



  /**
   * This is the getter method this will return the attribute value.
   * Advertise reachability of backend server networks via adc through bgp for default gateway feature.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return advertiseBackendNetworks
   */
  @VsoMethod
  public Boolean getAdvertiseBackendNetworks() {
    return advertiseBackendNetworks;
  }

  /**
   * This is the setter method to the attribute.
   * Advertise reachability of backend server networks via adc through bgp for default gateway feature.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param advertiseBackendNetworks set the advertiseBackendNetworks.
   */
  @VsoMethod
  public void setAdvertiseBackendNetworks(Boolean  advertiseBackendNetworks) {
    this.advertiseBackendNetworks = advertiseBackendNetworks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable auto gateway to save and use the same l2 path to send the return traffic.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableAutoGateway
   */
  @VsoMethod
  public Boolean getEnableAutoGateway() {
    return enableAutoGateway;
  }

  /**
   * This is the setter method to the attribute.
   * Enable auto gateway to save and use the same l2 path to send the return traffic.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableAutoGateway set the enableAutoGateway.
   */
  @VsoMethod
  public void setEnableAutoGateway(Boolean  enableAutoGateway) {
    this.enableAutoGateway = enableAutoGateway;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine acts as default gateway for this service.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableRouting
   */
  @VsoMethod
  public Boolean getEnableRouting() {
    return enableRouting;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine acts as default gateway for this service.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableRouting set the enableRouting.
   */
  @VsoMethod
  public void setEnableRouting(Boolean  enableRouting) {
    this.enableRouting = enableRouting;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable vip on all interfaces of this service.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enableVipOnAllInterfaces
   */
  @VsoMethod
  public Boolean getEnableVipOnAllInterfaces() {
    return enableVipOnAllInterfaces;
  }

  /**
   * This is the setter method to the attribute.
   * Enable vip on all interfaces of this service.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enableVipOnAllInterfaces set the enableVipOnAllInterfaces.
   */
  @VsoMethod
  public void setEnableVipOnAllInterfaces(Boolean  enableVipOnAllInterfaces) {
    this.enableVipOnAllInterfaces = enableVipOnAllInterfaces;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use virtual mac address for interfaces on which floating interface ips are placed.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableVmac
   */
  @VsoMethod
  public Boolean getEnableVmac() {
    return enableVmac;
  }

  /**
   * This is the setter method to the attribute.
   * Use virtual mac address for interfaces on which floating interface ips are placed.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableVmac set the enableVmac.
   */
  @VsoMethod
  public void setEnableVmac(Boolean  enableVmac) {
    this.enableVmac = enableVmac;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Floating interface ips for the routingservice.
   * Field introduced in 18.2.5.
   * Maximum of 32 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIp
   */
  @VsoMethod
  public List<IpAddr> getFloatingIntfIp() {
    return floatingIntfIp;
  }

  /**
   * This is the setter method. this will set the floatingIntfIp
   * Floating interface ips for the routingservice.
   * Field introduced in 18.2.5.
   * Maximum of 32 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIp
   */
  @VsoMethod
  public void setFloatingIntfIp(List<IpAddr>  floatingIntfIp) {
    this.floatingIntfIp = floatingIntfIp;
  }

  /**
   * This is the setter method this will set the floatingIntfIp
   * Floating interface ips for the routingservice.
   * Field introduced in 18.2.5.
   * Maximum of 32 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIp
   */
  @VsoMethod
  public RoutingService addFloatingIntfIpItem(IpAddr floatingIntfIpItem) {
    if (this.floatingIntfIp == null) {
      this.floatingIntfIp = new ArrayList<IpAddr>();
    }
    this.floatingIntfIp.add(floatingIntfIpItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Ipv6 floating interface ips for the routingservice.
   * Field introduced in 22.1.6, 30.2.1.
   * Maximum of 32 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIp6Addresses
   */
  @VsoMethod
  public List<IpAddr> getFloatingIntfIp6Addresses() {
    return floatingIntfIp6Addresses;
  }

  /**
   * This is the setter method. this will set the floatingIntfIp6Addresses
   * Ipv6 floating interface ips for the routingservice.
   * Field introduced in 22.1.6, 30.2.1.
   * Maximum of 32 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIp6Addresses
   */
  @VsoMethod
  public void setFloatingIntfIp6Addresses(List<IpAddr>  floatingIntfIp6Addresses) {
    this.floatingIntfIp6Addresses = floatingIntfIp6Addresses;
  }

  /**
   * This is the setter method this will set the floatingIntfIp6Addresses
   * Ipv6 floating interface ips for the routingservice.
   * Field introduced in 22.1.6, 30.2.1.
   * Maximum of 32 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIp6Addresses
   */
  @VsoMethod
  public RoutingService addFloatingIntfIp6AddressesItem(IpAddr floatingIntfIp6AddressesItem) {
    if (this.floatingIntfIp6Addresses == null) {
      this.floatingIntfIp6Addresses = new ArrayList<IpAddr>();
    }
    this.floatingIntfIp6Addresses.add(floatingIntfIp6AddressesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * If serviceenginegroup is configured for legacy 1+1 active standby ha mode, ipv6 floating ip's will be advertised only by the active se in the
   * pair.
   * Virtual services in this group must be disabled/enabled for any changes to the ipv6 floating ip's to take effect.
   * Only active se hosting vs tagged with active standby se 2 tag will advertise this floating ip when manual load distribution is enabled.
   * Field introduced in 22.1.6, 30.2.1.
   * Maximum of 32 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIp6Se2Addresses
   */
  @VsoMethod
  public List<IpAddr> getFloatingIntfIp6Se2Addresses() {
    return floatingIntfIp6Se2Addresses;
  }

  /**
   * This is the setter method. this will set the floatingIntfIp6Se2Addresses
   * If serviceenginegroup is configured for legacy 1+1 active standby ha mode, ipv6 floating ip's will be advertised only by the active se in the
   * pair.
   * Virtual services in this group must be disabled/enabled for any changes to the ipv6 floating ip's to take effect.
   * Only active se hosting vs tagged with active standby se 2 tag will advertise this floating ip when manual load distribution is enabled.
   * Field introduced in 22.1.6, 30.2.1.
   * Maximum of 32 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIp6Se2Addresses
   */
  @VsoMethod
  public void setFloatingIntfIp6Se2Addresses(List<IpAddr>  floatingIntfIp6Se2Addresses) {
    this.floatingIntfIp6Se2Addresses = floatingIntfIp6Se2Addresses;
  }

  /**
   * This is the setter method this will set the floatingIntfIp6Se2Addresses
   * If serviceenginegroup is configured for legacy 1+1 active standby ha mode, ipv6 floating ip's will be advertised only by the active se in the
   * pair.
   * Virtual services in this group must be disabled/enabled for any changes to the ipv6 floating ip's to take effect.
   * Only active se hosting vs tagged with active standby se 2 tag will advertise this floating ip when manual load distribution is enabled.
   * Field introduced in 22.1.6, 30.2.1.
   * Maximum of 32 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIp6Se2Addresses
   */
  @VsoMethod
  public RoutingService addFloatingIntfIp6Se2AddressesItem(IpAddr floatingIntfIp6Se2AddressesItem) {
    if (this.floatingIntfIp6Se2Addresses == null) {
      this.floatingIntfIp6Se2Addresses = new ArrayList<IpAddr>();
    }
    this.floatingIntfIp6Se2Addresses.add(floatingIntfIp6Se2AddressesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * If serviceenginegroup is configured for legacy 1+1 active standby ha mode, floating ip's will be advertised only by the active se in the pair.
   * Virtual services in this group must be disabled/enabled for any changes to the floating ip's to take effect.
   * Only active se hosting vs tagged with active standby se 2 tag will advertise this floating ip when manual load distribution is enabled.
   * Field introduced in 18.2.5.
   * Maximum of 32 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIpSe2
   */
  @VsoMethod
  public List<IpAddr> getFloatingIntfIpSe2() {
    return floatingIntfIpSe2;
  }

  /**
   * This is the setter method. this will set the floatingIntfIpSe2
   * If serviceenginegroup is configured for legacy 1+1 active standby ha mode, floating ip's will be advertised only by the active se in the pair.
   * Virtual services in this group must be disabled/enabled for any changes to the floating ip's to take effect.
   * Only active se hosting vs tagged with active standby se 2 tag will advertise this floating ip when manual load distribution is enabled.
   * Field introduced in 18.2.5.
   * Maximum of 32 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIpSe2
   */
  @VsoMethod
  public void setFloatingIntfIpSe2(List<IpAddr>  floatingIntfIpSe2) {
    this.floatingIntfIpSe2 = floatingIntfIpSe2;
  }

  /**
   * This is the setter method this will set the floatingIntfIpSe2
   * If serviceenginegroup is configured for legacy 1+1 active standby ha mode, floating ip's will be advertised only by the active se in the pair.
   * Virtual services in this group must be disabled/enabled for any changes to the floating ip's to take effect.
   * Only active se hosting vs tagged with active standby se 2 tag will advertise this floating ip when manual load distribution is enabled.
   * Field introduced in 18.2.5.
   * Maximum of 32 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIpSe2
   */
  @VsoMethod
  public RoutingService addFloatingIntfIpSe2Item(IpAddr floatingIntfIpSe2Item) {
    if (this.floatingIntfIpSe2 == null) {
      this.floatingIntfIpSe2 = new ArrayList<IpAddr>();
    }
    this.floatingIntfIpSe2.add(floatingIntfIpSe2Item);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Routing service related flow profile information.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return flowtableProfile
   */
  @VsoMethod
  public FlowtableProfile getFlowtableProfile() {
    return flowtableProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Routing service related flow profile information.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param flowtableProfile set the flowtableProfile.
   */
  @VsoMethod
  public void setFlowtableProfile(FlowtableProfile flowtableProfile) {
    this.flowtableProfile = flowtableProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable graceful restart feature in routing service.
   * For example, bgp.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return gracefulRestart
   */
  @VsoMethod
  public Boolean getGracefulRestart() {
    return gracefulRestart;
  }

  /**
   * This is the setter method to the attribute.
   * Enable graceful restart feature in routing service.
   * For example, bgp.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param gracefulRestart set the gracefulRestart.
   */
  @VsoMethod
  public void setGracefulRestart(Boolean  gracefulRestart) {
    this.gracefulRestart = gracefulRestart;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Nat policy for outbound nat functionality.
   * This is done in post-routing.
   * It is a reference to an object of type natpolicy.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return natPolicyRef
   */
  @VsoMethod
  public String getNatPolicyRef() {
    return natPolicyRef;
  }

  /**
   * This is the setter method to the attribute.
   * Nat policy for outbound nat functionality.
   * This is done in post-routing.
   * It is a reference to an object of type natpolicy.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param natPolicyRef set the natPolicyRef.
   */
  @VsoMethod
  public void setNatPolicyRef(String  natPolicyRef) {
    this.natPolicyRef = natPolicyRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * For ip routing feature, enabling this knob will fallback to routing through linux, by default routing is done via service engine data-path.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return routingByLinuxIpstack
   */
  @VsoMethod
  public Boolean getRoutingByLinuxIpstack() {
    return routingByLinuxIpstack;
  }

  /**
   * This is the setter method to the attribute.
   * For ip routing feature, enabling this knob will fallback to routing through linux, by default routing is done via service engine data-path.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param routingByLinuxIpstack set the routingByLinuxIpstack.
   */
  @VsoMethod
  public void setRoutingByLinuxIpstack(Boolean  routingByLinuxIpstack) {
    this.routingByLinuxIpstack = routingByLinuxIpstack;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RoutingService objRoutingService = (RoutingService) o;
  return   Objects.equals(this.enableRouting, objRoutingService.enableRouting)&&
  Objects.equals(this.routingByLinuxIpstack, objRoutingService.routingByLinuxIpstack)&&
  Objects.equals(this.floatingIntfIp, objRoutingService.floatingIntfIp)&&
  Objects.equals(this.floatingIntfIpSe2, objRoutingService.floatingIntfIpSe2)&&
  Objects.equals(this.enableVmac, objRoutingService.enableVmac)&&
  Objects.equals(this.enableVipOnAllInterfaces, objRoutingService.enableVipOnAllInterfaces)&&
  Objects.equals(this.advertiseBackendNetworks, objRoutingService.advertiseBackendNetworks)&&
  Objects.equals(this.natPolicyRef, objRoutingService.natPolicyRef)&&
  Objects.equals(this.flowtableProfile, objRoutingService.flowtableProfile)&&
  Objects.equals(this.gracefulRestart, objRoutingService.gracefulRestart)&&
  Objects.equals(this.enableAutoGateway, objRoutingService.enableAutoGateway)&&
  Objects.equals(this.floatingIntfIp6Addresses, objRoutingService.floatingIntfIp6Addresses)&&
  Objects.equals(this.floatingIntfIp6Se2Addresses, objRoutingService.floatingIntfIp6Se2Addresses);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RoutingService {\n");
      sb.append("    advertiseBackendNetworks: ").append(toIndentedString(advertiseBackendNetworks)).append("\n");
        sb.append("    enableAutoGateway: ").append(toIndentedString(enableAutoGateway)).append("\n");
        sb.append("    enableRouting: ").append(toIndentedString(enableRouting)).append("\n");
        sb.append("    enableVipOnAllInterfaces: ").append(toIndentedString(enableVipOnAllInterfaces)).append("\n");
        sb.append("    enableVmac: ").append(toIndentedString(enableVmac)).append("\n");
        sb.append("    floatingIntfIp: ").append(toIndentedString(floatingIntfIp)).append("\n");
        sb.append("    floatingIntfIp6Addresses: ").append(toIndentedString(floatingIntfIp6Addresses)).append("\n");
        sb.append("    floatingIntfIp6Se2Addresses: ").append(toIndentedString(floatingIntfIp6Se2Addresses)).append("\n");
        sb.append("    floatingIntfIpSe2: ").append(toIndentedString(floatingIntfIpSe2)).append("\n");
        sb.append("    flowtableProfile: ").append(toIndentedString(flowtableProfile)).append("\n");
        sb.append("    gracefulRestart: ").append(toIndentedString(gracefulRestart)).append("\n");
        sb.append("    natPolicyRef: ").append(toIndentedString(natPolicyRef)).append("\n");
        sb.append("    routingByLinuxIpstack: ").append(toIndentedString(routingByLinuxIpstack)).append("\n");
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

