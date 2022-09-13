package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DnsAAAARdata is a POJO class extends AviRestResource that used for creating
 * DnsAAAARdata.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsAAAARdata")
@VsoFinder(name = Constants.FINDER_VRO_DNSAAAARDATA)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsAAAARdata extends AviRestResource {
    @JsonProperty("ip6_address")
    @JsonInclude(Include.NON_NULL)
    private IpAddr ip6Address = null;



  /**
   * This is the getter method this will return the attribute value.
   * Ipv6 address for fqdn.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ip6Address
   */
  @VsoMethod
  public IpAddr getIp6Address() {
    return ip6Address;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv6 address for fqdn.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ip6Address set the ip6Address.
   */
  @VsoMethod
  public void setIp6Address(IpAddr ip6Address) {
    this.ip6Address = ip6Address;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsAAAARdata objDnsAAAARdata = (DnsAAAARdata) o;
  return   Objects.equals(this.ip6Address, objDnsAAAARdata.ip6Address);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsAAAARdata {\n");
      sb.append("    ip6Address: ").append(toIndentedString(ip6Address)).append("\n");
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

