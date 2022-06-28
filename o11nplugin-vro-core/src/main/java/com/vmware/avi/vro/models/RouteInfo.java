package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The RouteInfo is a POJO class extends AviRestResource that used for creating
 * RouteInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RouteInfo")
@VsoFinder(name = Constants.FINDER_VRO_ROUTEINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RouteInfo extends AviRestResource {
    @JsonProperty("if_name")
    @JsonInclude(Include.NON_NULL)
    private String ifName = null;

    @JsonProperty("network_namespace")
    @JsonInclude(Include.NON_NULL)
    private String networkNamespace = "HOST_NAMESPACE";

    @JsonProperty("nexthop")
    @JsonInclude(Include.NON_NULL)
    private IpAddr nexthop = null;

    @JsonProperty("subnet")
    @JsonInclude(Include.NON_NULL)
    private IpAddrPrefix subnet = null;



  /**
   * This is the getter method this will return the attribute value.
   * Host interface name.
   * Field introduced in 18.2.6.
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
   * Host interface name.
   * Field introduced in 18.2.6.
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
   * Network namespace type used to add an route entry in a specific namespace.
   * Enum options - LOCAL_NAMESPACE, HOST_NAMESPACE, OTHER_NAMESPACE.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "HOST_NAMESPACE".
   * @return networkNamespace
   */
  @VsoMethod
  public String getNetworkNamespace() {
    return networkNamespace;
  }

  /**
   * This is the setter method to the attribute.
   * Network namespace type used to add an route entry in a specific namespace.
   * Enum options - LOCAL_NAMESPACE, HOST_NAMESPACE, OTHER_NAMESPACE.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "HOST_NAMESPACE".
   * @param networkNamespace set the networkNamespace.
   */
  @VsoMethod
  public void setNetworkNamespace(String  networkNamespace) {
    this.networkNamespace = networkNamespace;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Host nexthop ip address.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nexthop
   */
  @VsoMethod
  public IpAddr getNexthop() {
    return nexthop;
  }

  /**
   * This is the setter method to the attribute.
   * Host nexthop ip address.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nexthop set the nexthop.
   */
  @VsoMethod
  public void setNexthop(IpAddr nexthop) {
    this.nexthop = nexthop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Host subnet address.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subnet
   */
  @VsoMethod
  public IpAddrPrefix getSubnet() {
    return subnet;
  }

  /**
   * This is the setter method to the attribute.
   * Host subnet address.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subnet set the subnet.
   */
  @VsoMethod
  public void setSubnet(IpAddrPrefix subnet) {
    this.subnet = subnet;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RouteInfo objRouteInfo = (RouteInfo) o;
  return   Objects.equals(this.subnet, objRouteInfo.subnet)&&
  Objects.equals(this.nexthop, objRouteInfo.nexthop)&&
  Objects.equals(this.ifName, objRouteInfo.ifName)&&
  Objects.equals(this.networkNamespace, objRouteInfo.networkNamespace);
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

