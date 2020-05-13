package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddrPrefix;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * IPNetworkSubnet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IPNetworkSubnet")
@VsoFinder(name = Constants.FINDER_VRO_IPNETWORKSUBNET, idAccessor = "getObjectID()")
@Service
public class IPNetworkSubnet extends AviRestResource  {
  @JsonProperty("network_ref")
  private String networkRef = null;

  @JsonProperty("subnet")
  private IpAddrPrefix subnet = null;

  @JsonProperty("subnet6")
  private IpAddrPrefix subnet6 = null;

  @JsonProperty("subnet6_uuid")
  private String subnet6Uuid = null;

  @JsonProperty("subnet_uuid")
  private String subnetUuid = null;

  
  /**
   * Network for VirtualService IP allocation with Vantage as the IPAM provider. Network should be created before this is configured. It is a reference to an object of type Network.
   * @return networkRef
  **/
  @ApiModelProperty(value = "Network for VirtualService IP allocation with Vantage as the IPAM provider. Network should be created before this is configured. It is a reference to an object of type Network.")


 
  @VsoMethod  
  public String getNetworkRef() {
    return networkRef;
  }
    
  @VsoMethod
  public void setNetworkRef(String networkRef) {
    this.networkRef = networkRef;
  }

  
  /**
   * Subnet for VirtualService IP allocation with Vantage or Infoblox as the IPAM provider. Only one of subnet or subnet_uuid configuration is allowed.
   * @return subnet
  **/
  @ApiModelProperty(value = "Subnet for VirtualService IP allocation with Vantage or Infoblox as the IPAM provider. Only one of subnet or subnet_uuid configuration is allowed.")

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
   * Subnet for VirtualService IPv6 allocation with Vantage or Infoblox as the IPAM provider. Only one of subnet or subnet_uuid configuration is allowed. Field introduced in 18.1.1.
   * @return subnet6
  **/
  @ApiModelProperty(value = "Subnet for VirtualService IPv6 allocation with Vantage or Infoblox as the IPAM provider. Only one of subnet or subnet_uuid configuration is allowed. Field introduced in 18.1.1.")

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
   * Subnet UUID or Name or Prefix for VirtualService IPv6 allocation with AWS or OpenStack as the IPAM provider. Only one of subnet or subnet_uuid configuration is allowed. Field introduced in 18.1.1.
   * @return subnet6Uuid
  **/
  @ApiModelProperty(value = "Subnet UUID or Name or Prefix for VirtualService IPv6 allocation with AWS or OpenStack as the IPAM provider. Only one of subnet or subnet_uuid configuration is allowed. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public String getSubnet6Uuid() {
    return subnet6Uuid;
  }
    
  @VsoMethod
  public void setSubnet6Uuid(String subnet6Uuid) {
    this.subnet6Uuid = subnet6Uuid;
  }

  
  /**
   * Subnet UUID or Name or Prefix for VirtualService IP allocation with AWS or OpenStack as the IPAM provider. Only one of subnet or subnet_uuid configuration is allowed.
   * @return subnetUuid
  **/
  @ApiModelProperty(value = "Subnet UUID or Name or Prefix for VirtualService IP allocation with AWS or OpenStack as the IPAM provider. Only one of subnet or subnet_uuid configuration is allowed.")


 
  @VsoMethod  
  public String getSubnetUuid() {
    return subnetUuid;
  }
    
  @VsoMethod
  public void setSubnetUuid(String subnetUuid) {
    this.subnetUuid = subnetUuid;
  }

  
  public String getObjectID() {
		return "IPNetworkSubnet";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPNetworkSubnet ipNetworkSubnet = (IPNetworkSubnet) o;
    return Objects.equals(this.networkRef, ipNetworkSubnet.networkRef) &&
        Objects.equals(this.subnet, ipNetworkSubnet.subnet) &&
        Objects.equals(this.subnet6, ipNetworkSubnet.subnet6) &&
        Objects.equals(this.subnet6Uuid, ipNetworkSubnet.subnet6Uuid) &&
        Objects.equals(this.subnetUuid, ipNetworkSubnet.subnetUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkRef, subnet, subnet6, subnet6Uuid, subnetUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPNetworkSubnet {\n");
    
    sb.append("    networkRef: ").append(toIndentedString(networkRef)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
    sb.append("    subnet6: ").append(toIndentedString(subnet6)).append("\n");
    sb.append("    subnet6Uuid: ").append(toIndentedString(subnet6Uuid)).append("\n");
    sb.append("    subnetUuid: ").append(toIndentedString(subnetUuid)).append("\n");
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

