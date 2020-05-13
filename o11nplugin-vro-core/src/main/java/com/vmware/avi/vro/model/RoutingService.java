package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.FlowtableProfile;
import com.vmware.avi.vro.model.IpAddr;
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
 * RoutingService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "RoutingService")
@VsoFinder(name = Constants.FINDER_VRO_ROUTINGSERVICE, idAccessor = "getObjectID()")
@Service
public class RoutingService extends AviRestResource  {
  @JsonProperty("advertise_backend_networks")
  private Boolean advertiseBackendNetworks = null;

  @JsonProperty("enable_routing")
  private Boolean enableRouting = null;

  @JsonProperty("enable_vip_on_all_interfaces")
  private Boolean enableVipOnAllInterfaces = true;

  @JsonProperty("enable_vmac")
  private Boolean enableVmac = null;

  @JsonProperty("floating_intf_ip")
  @Valid
  private List<IpAddr> floatingIntfIp = null;

  @JsonProperty("floating_intf_ip_se_2")
  @Valid
  private List<IpAddr> floatingIntfIpSe2 = null;

  @JsonProperty("flowtable_profile")
  private FlowtableProfile flowtableProfile = null;

  @JsonProperty("graceful_restart")
  private Boolean gracefulRestart = null;

  @JsonProperty("nat_policy_ref")
  private String natPolicyRef = null;

  @JsonProperty("routing_by_linux_ipstack")
  private Boolean routingByLinuxIpstack = null;

  
  /**
   * Advertise reachability of backend server networks via ADC through BGP for default gateway feature. Field introduced in 18.2.5.
   * @return advertiseBackendNetworks
  **/
  @ApiModelProperty(value = "Advertise reachability of backend server networks via ADC through BGP for default gateway feature. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isAdvertiseBackendNetworks() {
    return advertiseBackendNetworks;
  }
    
  @VsoMethod
  public void setAdvertiseBackendNetworks(Boolean advertiseBackendNetworks) {
    this.advertiseBackendNetworks = advertiseBackendNetworks;
  }

  
  /**
   * Service Engine acts as Default Gateway for this service. Field introduced in 18.2.5.
   * @return enableRouting
  **/
  @ApiModelProperty(value = "Service Engine acts as Default Gateway for this service. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isEnableRouting() {
    return enableRouting;
  }
    
  @VsoMethod
  public void setEnableRouting(Boolean enableRouting) {
    this.enableRouting = enableRouting;
  }

  
  /**
   * Enable VIP on all interfaces of this service. Field introduced in 18.2.5.
   * @return enableVipOnAllInterfaces
  **/
  @ApiModelProperty(value = "Enable VIP on all interfaces of this service. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isEnableVipOnAllInterfaces() {
    return enableVipOnAllInterfaces;
  }
    
  @VsoMethod
  public void setEnableVipOnAllInterfaces(Boolean enableVipOnAllInterfaces) {
    this.enableVipOnAllInterfaces = enableVipOnAllInterfaces;
  }

  
  /**
   * Use Virtual MAC address for interfaces on which floating interface IPs are placed. Field introduced in 18.2.5.
   * @return enableVmac
  **/
  @ApiModelProperty(value = "Use Virtual MAC address for interfaces on which floating interface IPs are placed. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isEnableVmac() {
    return enableVmac;
  }
    
  @VsoMethod
  public void setEnableVmac(Boolean enableVmac) {
    this.enableVmac = enableVmac;
  }

  
  public RoutingService addFloatingIntfIpItem(IpAddr floatingIntfIpItem) {
    if (this.floatingIntfIp == null) {
      this.floatingIntfIp = new ArrayList<IpAddr>();
    }
    this.floatingIntfIp.add(floatingIntfIpItem);
    return this;
  }
  
  /**
   * Floating Interface IPs for the RoutingService. Field introduced in 18.2.5.
   * @return floatingIntfIp
  **/
  @ApiModelProperty(value = "Floating Interface IPs for the RoutingService. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public List<IpAddr> getFloatingIntfIp() {
    return floatingIntfIp;
  }
    
  @VsoMethod
  public void setFloatingIntfIp(List<IpAddr> floatingIntfIp) {
    this.floatingIntfIp = floatingIntfIp;
  }

  
  public RoutingService addFloatingIntfIpSe2Item(IpAddr floatingIntfIpSe2Item) {
    if (this.floatingIntfIpSe2 == null) {
      this.floatingIntfIpSe2 = new ArrayList<IpAddr>();
    }
    this.floatingIntfIpSe2.add(floatingIntfIpSe2Item);
    return this;
  }
  
  /**
   * If ServiceEngineGroup is configured for Legacy 1+1 Active Standby HA Mode, Floating IP's will be advertised only by the Active SE in the Pair. Virtual Services in this group must be disabled/enabled for any changes to the Floating IP's to take effect. Only active SE hosting VS tagged with Active Standby SE 2 Tag will advertise this floating IP when manual load distribution is enabled. Field introduced in 18.2.5.
   * @return floatingIntfIpSe2
  **/
  @ApiModelProperty(value = "If ServiceEngineGroup is configured for Legacy 1+1 Active Standby HA Mode, Floating IP's will be advertised only by the Active SE in the Pair. Virtual Services in this group must be disabled/enabled for any changes to the Floating IP's to take effect. Only active SE hosting VS tagged with Active Standby SE 2 Tag will advertise this floating IP when manual load distribution is enabled. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public List<IpAddr> getFloatingIntfIpSe2() {
    return floatingIntfIpSe2;
  }
    
  @VsoMethod
  public void setFloatingIntfIpSe2(List<IpAddr> floatingIntfIpSe2) {
    this.floatingIntfIpSe2 = floatingIntfIpSe2;
  }

  
  /**
   * Routing Service related Flow profile information. Field introduced in 18.2.5.
   * @return flowtableProfile
  **/
  @ApiModelProperty(value = "Routing Service related Flow profile information. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public FlowtableProfile getFlowtableProfile() {
    return flowtableProfile;
  }
    
  @VsoMethod
  public void setFlowtableProfile(FlowtableProfile flowtableProfile) {
    this.flowtableProfile = flowtableProfile;
  }

  
  /**
   * Enable graceful restart feature in routing service. For example, BGP. Field introduced in 18.2.6.
   * @return gracefulRestart
  **/
  @ApiModelProperty(value = "Enable graceful restart feature in routing service. For example, BGP. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Boolean isGracefulRestart() {
    return gracefulRestart;
  }
    
  @VsoMethod
  public void setGracefulRestart(Boolean gracefulRestart) {
    this.gracefulRestart = gracefulRestart;
  }

  
  /**
   * NAT policy for outbound NAT functionality. This is done in post-routing. It is a reference to an object of type NatPolicy. Field introduced in 18.2.5.
   * @return natPolicyRef
  **/
  @ApiModelProperty(value = "NAT policy for outbound NAT functionality. This is done in post-routing. It is a reference to an object of type NatPolicy. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getNatPolicyRef() {
    return natPolicyRef;
  }
    
  @VsoMethod
  public void setNatPolicyRef(String natPolicyRef) {
    this.natPolicyRef = natPolicyRef;
  }

  
  /**
   * For IP Routing feature, enabling this knob will fallback to routing through Linux, by default routing is done via Service Engine data-path. Field introduced in 18.2.5.
   * @return routingByLinuxIpstack
  **/
  @ApiModelProperty(value = "For IP Routing feature, enabling this knob will fallback to routing through Linux, by default routing is done via Service Engine data-path. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isRoutingByLinuxIpstack() {
    return routingByLinuxIpstack;
  }
    
  @VsoMethod
  public void setRoutingByLinuxIpstack(Boolean routingByLinuxIpstack) {
    this.routingByLinuxIpstack = routingByLinuxIpstack;
  }

  
  public String getObjectID() {
		return "RoutingService";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingService routingService = (RoutingService) o;
    return Objects.equals(this.advertiseBackendNetworks, routingService.advertiseBackendNetworks) &&
        Objects.equals(this.enableRouting, routingService.enableRouting) &&
        Objects.equals(this.enableVipOnAllInterfaces, routingService.enableVipOnAllInterfaces) &&
        Objects.equals(this.enableVmac, routingService.enableVmac) &&
        Objects.equals(this.floatingIntfIp, routingService.floatingIntfIp) &&
        Objects.equals(this.floatingIntfIpSe2, routingService.floatingIntfIpSe2) &&
        Objects.equals(this.flowtableProfile, routingService.flowtableProfile) &&
        Objects.equals(this.gracefulRestart, routingService.gracefulRestart) &&
        Objects.equals(this.natPolicyRef, routingService.natPolicyRef) &&
        Objects.equals(this.routingByLinuxIpstack, routingService.routingByLinuxIpstack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiseBackendNetworks, enableRouting, enableVipOnAllInterfaces, enableVmac, floatingIntfIp, floatingIntfIpSe2, flowtableProfile, gracefulRestart, natPolicyRef, routingByLinuxIpstack);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingService {\n");
    
    sb.append("    advertiseBackendNetworks: ").append(toIndentedString(advertiseBackendNetworks)).append("\n");
    sb.append("    enableRouting: ").append(toIndentedString(enableRouting)).append("\n");
    sb.append("    enableVipOnAllInterfaces: ").append(toIndentedString(enableVipOnAllInterfaces)).append("\n");
    sb.append("    enableVmac: ").append(toIndentedString(enableVmac)).append("\n");
    sb.append("    floatingIntfIp: ").append(toIndentedString(floatingIntfIp)).append("\n");
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

