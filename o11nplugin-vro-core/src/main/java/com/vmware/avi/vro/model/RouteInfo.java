package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
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
 * RouteInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "RouteInfo")
@VsoFinder(name = Constants.FINDER_VRO_ROUTEINFO, idAccessor = "getObjectID()")
@Service
public class RouteInfo extends AviRestResource  {
  @JsonProperty("if_name")
  private String ifName = null;

  @JsonProperty("network_namespace")
  private String networkNamespace = "HOST_NAMESPACE";

  @JsonProperty("nexthop")
  private IpAddr nexthop = null;

  @JsonProperty("subnet")
  private IpAddrPrefix subnet = null;

  
  /**
   * Host interface name. Field introduced in 18.2.6.
   * @return ifName
  **/
  @ApiModelProperty(value = "Host interface name. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getIfName() {
    return ifName;
  }
    
  @VsoMethod
  public void setIfName(String ifName) {
    this.ifName = ifName;
  }

  
  /**
   * Network Namespace type used to add an route entry in a specific namespace. Enum options - LOCAL_NAMESPACE, HOST_NAMESPACE, OTHER_NAMESPACE. Field introduced in 18.2.6.
   * @return networkNamespace
  **/
  @ApiModelProperty(value = "Network Namespace type used to add an route entry in a specific namespace. Enum options - LOCAL_NAMESPACE, HOST_NAMESPACE, OTHER_NAMESPACE. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getNetworkNamespace() {
    return networkNamespace;
  }
    
  @VsoMethod
  public void setNetworkNamespace(String networkNamespace) {
    this.networkNamespace = networkNamespace;
  }

  
  /**
   * Host nexthop ip address. Field introduced in 18.2.6.
   * @return nexthop
  **/
  @ApiModelProperty(value = "Host nexthop ip address. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public IpAddr getNexthop() {
    return nexthop;
  }
    
  @VsoMethod
  public void setNexthop(IpAddr nexthop) {
    this.nexthop = nexthop;
  }

  
  /**
   * Host subnet address. Field introduced in 18.2.6.
   * @return subnet
  **/
  @ApiModelProperty(required = true, value = "Host subnet address. Field introduced in 18.2.6.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getSubnet() {
    return subnet;
  }
    
  @VsoMethod
  public void setSubnet(IpAddrPrefix subnet) {
    this.subnet = subnet;
  }

  
  public String getObjectID() {
		return "RouteInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteInfo routeInfo = (RouteInfo) o;
    return Objects.equals(this.ifName, routeInfo.ifName) &&
        Objects.equals(this.networkNamespace, routeInfo.networkNamespace) &&
        Objects.equals(this.nexthop, routeInfo.nexthop) &&
        Objects.equals(this.subnet, routeInfo.subnet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ifName, networkNamespace, nexthop, subnet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteInfo {\n");
    
    sb.append("    ifName: ").append(toIndentedString(ifName)).append("\n");
    sb.append("    networkNamespace: ").append(toIndentedString(networkNamespace)).append("\n");
    sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
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

