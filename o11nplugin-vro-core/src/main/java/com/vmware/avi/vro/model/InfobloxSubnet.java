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
 * The InfobloxSubnet is a POJO class extends AviRestResource that used for creating
 * InfobloxSubnet.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "InfobloxSubnet")
@VsoFinder(name = Constants.FINDER_VRO_INFOBLOXSUBNET)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class InfobloxSubnet extends AviRestResource {
    @JsonProperty("subnet")
    @JsonInclude(Include.NON_NULL)
    private IpAddrPrefix subnet;

    @JsonProperty("subnet6")
    @JsonInclude(Include.NON_NULL)
    private IpAddrPrefix subnet6;



  /**
   * This is the getter method this will return the attribute value.
   * Ipv4 subnet to use for infoblox allocation.
   * Field introduced in 18.2.8, 20.1.1.
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
   * Ipv4 subnet to use for infoblox allocation.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subnet set the subnet.
   */
  @VsoMethod
  public void setSubnet(IpAddrPrefix subnet) {
    this.subnet = subnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipv6 subnet to use for infoblox allocation.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subnet6
   */
  @VsoMethod
  public IpAddrPrefix getSubnet6() {
    return subnet6;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv6 subnet to use for infoblox allocation.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
  InfobloxSubnet objInfobloxSubnet = (InfobloxSubnet) o;
  return   Objects.equals(this.subnet, objInfobloxSubnet.subnet)&&
  Objects.equals(this.subnet6, objInfobloxSubnet.subnet6);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class InfobloxSubnet {\n");
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

