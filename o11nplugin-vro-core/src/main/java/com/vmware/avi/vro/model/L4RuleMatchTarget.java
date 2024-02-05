package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.L4RulePortMatch;
import com.vmware.avi.vro.model.L4RuleProtocolMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The L4RuleMatchTarget is a POJO class extends AviRestResource that used for creating
 * L4RuleMatchTarget.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "L4RuleMatchTarget")
@VsoFinder(name = Constants.FINDER_VRO_L4RULEMATCHTARGET)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class L4RuleMatchTarget extends AviRestResource {
    @JsonProperty("client_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddrMatch clientIp;

    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private L4RulePortMatch port;

    @JsonProperty("protocol")
    @JsonInclude(Include.NON_NULL)
    private L4RuleProtocolMatch protocol;



  /**
   * This is the getter method this will return the attribute value.
   * Ip addresses to match against client ip.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIp set the clientIp.
   */
  @VsoMethod
  public void setClientIp(IpAddrMatch clientIp) {
    this.clientIp = clientIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Port number to match against virtual service listner port.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return port
   */
  @VsoMethod
  public L4RulePortMatch getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Port number to match against virtual service listner port.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(L4RulePortMatch port) {
    this.port = port;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tcp/udp/icmp protocol to match against transport protocol.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return protocol
   */
  @VsoMethod
  public L4RuleProtocolMatch getProtocol() {
    return protocol;
  }

  /**
   * This is the setter method to the attribute.
   * Tcp/udp/icmp protocol to match against transport protocol.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param protocol set the protocol.
   */
  @VsoMethod
  public void setProtocol(L4RuleProtocolMatch protocol) {
    this.protocol = protocol;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  L4RuleMatchTarget objL4RuleMatchTarget = (L4RuleMatchTarget) o;
  return   Objects.equals(this.clientIp, objL4RuleMatchTarget.clientIp)&&
  Objects.equals(this.port, objL4RuleMatchTarget.port)&&
  Objects.equals(this.protocol, objL4RuleMatchTarget.protocol);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class L4RuleMatchTarget {\n");
      sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

