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
 * The DnsARdata is a POJO class extends AviRestResource that used for creating
 * DnsARdata.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsARdata")
@VsoFinder(name = Constants.FINDER_VRO_DNSARDATA)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsARdata extends AviRestResource {
    @JsonProperty("ip_address")
    @JsonInclude(Include.NON_NULL)
    private IpAddr ipAddress = null;



  /**
   * This is the getter method this will return the attribute value.
   * Ip address for fqdn.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddress
   */
  @VsoMethod
  public IpAddr getIpAddress() {
    return ipAddress;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address for fqdn.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipAddress set the ipAddress.
   */
  @VsoMethod
  public void setIpAddress(IpAddr ipAddress) {
    this.ipAddress = ipAddress;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsARdata objDnsARdata = (DnsARdata) o;
  return   Objects.equals(this.ipAddress, objDnsARdata.ipAddress);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsARdata {\n");
      sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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

