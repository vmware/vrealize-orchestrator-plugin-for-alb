package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DnsClientIpMatch is a POJO class extends AviRestResource that used for creating
 * DnsClientIpMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsClientIpMatch")
@VsoFinder(name = Constants.FINDER_VRO_DNSCLIENTIPMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsClientIpMatch extends AviRestResource {
    @JsonProperty("client_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddrMatch clientIp = null;

    @JsonProperty("use_edns_client_subnet_ip")
    @JsonInclude(Include.NON_NULL)
    private Boolean useEdnsClientSubnetIp = true;



  /**
   * This is the getter method this will return the attribute value.
   * Ip addresses to match against client ip.
   * Field introduced in 17.1.6,17.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientIp
   */
  @VsoMethod
  public IpAddrMatch getClientIp() {
    return clientIp;
  }

  /**
   * This is the setter method to the attribute.
   * Ip addresses to match against client ip.
   * Field introduced in 17.1.6,17.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIp set the clientIp.
   */
  @VsoMethod
  public void setClientIp(IpAddrMatch clientIp) {
    this.clientIp = clientIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use the ip address from the edns client subnet option, if available, as the source ip address of the client.
   * It should be noted that the edns subnet ip may not be a /32 ip address.
   * Field introduced in 17.1.6,17.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return useEdnsClientSubnetIp
   */
  @VsoMethod
  public Boolean getUseEdnsClientSubnetIp() {
    return useEdnsClientSubnetIp;
  }

  /**
   * This is the setter method to the attribute.
   * Use the ip address from the edns client subnet option, if available, as the source ip address of the client.
   * It should be noted that the edns subnet ip may not be a /32 ip address.
   * Field introduced in 17.1.6,17.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param useEdnsClientSubnetIp set the useEdnsClientSubnetIp.
   */
  @VsoMethod
  public void setUseEdnsClientSubnetIp(Boolean  useEdnsClientSubnetIp) {
    this.useEdnsClientSubnetIp = useEdnsClientSubnetIp;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsClientIpMatch objDnsClientIpMatch = (DnsClientIpMatch) o;
  return   Objects.equals(this.clientIp, objDnsClientIpMatch.clientIp)&&
  Objects.equals(this.useEdnsClientSubnetIp, objDnsClientIpMatch.useEdnsClientSubnetIp);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsClientIpMatch {\n");
      sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    useEdnsClientSubnetIp: ").append(toIndentedString(useEdnsClientSubnetIp)).append("\n");
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

