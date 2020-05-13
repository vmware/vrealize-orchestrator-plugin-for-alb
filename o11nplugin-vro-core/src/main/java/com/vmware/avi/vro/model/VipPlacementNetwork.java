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
 * VipPlacementNetwork
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VipPlacementNetwork")
@VsoFinder(name = Constants.FINDER_VRO_VIPPLACEMENTNETWORK, idAccessor = "getObjectID()")
@Service
public class VipPlacementNetwork extends AviRestResource  {
  @JsonProperty("network_ref")
  private String networkRef = null;

  @JsonProperty("subnet")
  private IpAddrPrefix subnet = null;

  @JsonProperty("subnet6")
  private IpAddrPrefix subnet6 = null;

  
  /**
   * Network to use for vip placement. It is a reference to an object of type Network. Field introduced in 18.2.5.
   * @return networkRef
  **/
  @ApiModelProperty(value = "Network to use for vip placement. It is a reference to an object of type Network. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getNetworkRef() {
    return networkRef;
  }
    
  @VsoMethod
  public void setNetworkRef(String networkRef) {
    this.networkRef = networkRef;
  }

  
  /**
   * IPv4 Subnet to use for vip placement. Field introduced in 18.2.5.
   * @return subnet
  **/
  @ApiModelProperty(value = "IPv4 Subnet to use for vip placement. Field introduced in 18.2.5.")

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
   * IPv6 subnet to use for vip placement. Field introduced in 18.2.5.
   * @return subnet6
  **/
  @ApiModelProperty(value = "IPv6 subnet to use for vip placement. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getSubnet6() {
    return subnet6;
  }
    
  @VsoMethod
  public void setSubnet6(IpAddrPrefix subnet6) {
    this.subnet6 = subnet6;
  }

  
  public String getObjectID() {
		return "VipPlacementNetwork";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VipPlacementNetwork vipPlacementNetwork = (VipPlacementNetwork) o;
    return Objects.equals(this.networkRef, vipPlacementNetwork.networkRef) &&
        Objects.equals(this.subnet, vipPlacementNetwork.subnet) &&
        Objects.equals(this.subnet6, vipPlacementNetwork.subnet6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkRef, subnet, subnet6);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VipPlacementNetwork {\n");
    
    sb.append("    networkRef: ").append(toIndentedString(networkRef)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
    sb.append("    subnet6: ").append(toIndentedString(subnet6)).append("\n");
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

