package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DnsNsRdata is a POJO class extends AviRestResource that used for creating
 * DnsNsRdata.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsNsRdata")
@VsoFinder(name = Constants.FINDER_VRO_DNSNSRDATA)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsNsRdata extends AviRestResource {
  @JsonProperty("ip6_address")
  @JsonInclude(Include.NON_NULL)
  private IpAddr ip6Address = null;

  @JsonProperty("ip_address")
  @JsonInclude(Include.NON_NULL)
  private IpAddr ipAddress = null;

  @JsonProperty("nsname")
  @JsonInclude(Include.NON_NULL)
  private String nsname = null;



  /**
   * This is the getter method this will return the attribute value.
   * Ipv6 address for name server.
   * Field introduced in 18.1.1.
   * @return ip6Address
   */
  @VsoMethod
  public IpAddr getIp6Address() {
    return ip6Address;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv6 address for name server.
   * Field introduced in 18.1.1.
   * @param ip6Address set the ip6Address.
   */
  @VsoMethod
  public void setIp6Address(IpAddr ip6Address) {
    this.ip6Address = ip6Address;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip address for name server.
   * Field introduced in 17.1.1.
   * @return ipAddress
   */
  @VsoMethod
  public IpAddr getIpAddress() {
    return ipAddress;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address for name server.
   * Field introduced in 17.1.1.
   * @param ipAddress set the ipAddress.
   */
  @VsoMethod
  public void setIpAddress(IpAddr ipAddress) {
    this.ipAddress = ipAddress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name server name.
   * Field introduced in 17.1.1.
   * @return nsname
   */
  @VsoMethod
  public String getNsname() {
    return nsname;
  }

  /**
   * This is the setter method to the attribute.
   * Name server name.
   * Field introduced in 17.1.1.
   * @param nsname set the nsname.
   */
  @VsoMethod
  public void setNsname(String  nsname) {
    this.nsname = nsname;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsNsRdata objDnsNsRdata = (DnsNsRdata) o;
  return   Objects.equals(this.ip6Address, objDnsNsRdata.ip6Address)&&
  Objects.equals(this.ipAddress, objDnsNsRdata.ipAddress)&&
  Objects.equals(this.nsname, objDnsNsRdata.nsname);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsNsRdata {\n");
      sb.append("    ip6Address: ").append(toIndentedString(ip6Address)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    nsname: ").append(toIndentedString(nsname)).append("\n");
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
