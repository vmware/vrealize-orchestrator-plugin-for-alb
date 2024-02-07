package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.PortMatch;
import com.vmware.avi.vro.model.L4RuleProtocolMatch;
import com.vmware.avi.vro.model.PortMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ServiceMatch is a POJO class extends AviRestResource that used for creating
 * ServiceMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ServiceMatch")
@VsoFinder(name = Constants.FINDER_VRO_SERVICEMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ServiceMatch extends AviRestResource {
    @JsonProperty("destination_port")
    @JsonInclude(Include.NON_NULL)
    private PortMatch destinationPort;

    @JsonProperty("protocol")
    @JsonInclude(Include.NON_NULL)
    private L4RuleProtocolMatch protocol;

    @JsonProperty("source_port")
    @JsonInclude(Include.NON_NULL)
    private PortMatch sourcePort;



  /**
   * This is the getter method this will return the attribute value.
   * Destination port of the packet.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return destinationPort
   */
  @VsoMethod
  public PortMatch getDestinationPort() {
    return destinationPort;
  }

  /**
   * This is the setter method to the attribute.
   * Destination port of the packet.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param destinationPort set the destinationPort.
   */
  @VsoMethod
  public void setDestinationPort(PortMatch destinationPort) {
    this.destinationPort = destinationPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Protocol to match.
   * Supported protocols are tcp, udp and icmp.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return protocol
   */
  @VsoMethod
  public L4RuleProtocolMatch getProtocol() {
    return protocol;
  }

  /**
   * This is the setter method to the attribute.
   * Protocol to match.
   * Supported protocols are tcp, udp and icmp.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param protocol set the protocol.
   */
  @VsoMethod
  public void setProtocol(L4RuleProtocolMatch protocol) {
    this.protocol = protocol;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Source port of the packet.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sourcePort
   */
  @VsoMethod
  public PortMatch getSourcePort() {
    return sourcePort;
  }

  /**
   * This is the setter method to the attribute.
   * Source port of the packet.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sourcePort set the sourcePort.
   */
  @VsoMethod
  public void setSourcePort(PortMatch sourcePort) {
    this.sourcePort = sourcePort;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ServiceMatch objServiceMatch = (ServiceMatch) o;
  return   Objects.equals(this.sourcePort, objServiceMatch.sourcePort)&&
  Objects.equals(this.destinationPort, objServiceMatch.destinationPort)&&
  Objects.equals(this.protocol, objServiceMatch.protocol);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ServiceMatch {\n");
      sb.append("    destinationPort: ").append(toIndentedString(destinationPort)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
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

