package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The CustomIpamSubnet is a POJO class extends AviRestResource that used for creating
 * CustomIpamSubnet.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CustomIpamSubnet")
@VsoFinder(name = Constants.FINDER_VRO_CUSTOMIPAMSUBNET)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CustomIpamSubnet extends AviRestResource {
    @JsonProperty("network_id")
    @JsonInclude(Include.NON_NULL)
    private String networkId = null;

    @JsonProperty("subnet")
    @JsonInclude(Include.NON_NULL)
    private IpAddrPrefix subnet = null;

    @JsonProperty("subnet6")
    @JsonInclude(Include.NON_NULL)
    private IpAddrPrefix subnet6 = null;



  /**
   * This is the getter method this will return the attribute value.
   * Network to use for custom ipam ip allocation.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networkId
   */
  @VsoMethod
  public String getNetworkId() {
    return networkId;
  }

  /**
   * This is the setter method to the attribute.
   * Network to use for custom ipam ip allocation.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param networkId set the networkId.
   */
  @VsoMethod
  public void setNetworkId(String  networkId) {
    this.networkId = networkId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipv4 subnet to use for custom ipam ip allocation.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subnet
   */
  @VsoMethod
  public IpAddrPrefix getSubnet() {
    return subnet;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv4 subnet to use for custom ipam ip allocation.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subnet set the subnet.
   */
  @VsoMethod
  public void setSubnet(IpAddrPrefix subnet) {
    this.subnet = subnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipv6 subnet to use for custom ipam ip allocation.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subnet6
   */
  @VsoMethod
  public IpAddrPrefix getSubnet6() {
    return subnet6;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv6 subnet to use for custom ipam ip allocation.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subnet6 set the subnet6.
   */
  @VsoMethod
  public void setSubnet6(IpAddrPrefix subnet6) {
    this.subnet6 = subnet6;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CustomIpamSubnet objCustomIpamSubnet = (CustomIpamSubnet) o;
  return   Objects.equals(this.networkId, objCustomIpamSubnet.networkId)&&
  Objects.equals(this.subnet, objCustomIpamSubnet.subnet)&&
  Objects.equals(this.subnet6, objCustomIpamSubnet.subnet6);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CustomIpamSubnet {\n");
      sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
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

