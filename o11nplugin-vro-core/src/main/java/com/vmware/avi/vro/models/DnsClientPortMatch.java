package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.PortMatchGeneric;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DnsClientPortMatch is a POJO class extends AviRestResource that used for creating
 * DnsClientPortMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsClientPortMatch")
@VsoFinder(name = Constants.FINDER_VRO_DNSCLIENTPORTMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsClientPortMatch extends AviRestResource {
    @JsonProperty("client_ports")
    @JsonInclude(Include.NON_NULL)
    private PortMatchGeneric clientPorts = null;



  /**
   * This is the getter method this will return the attribute value.
   * Port number to match against client port number in request.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientPorts
   */
  @VsoMethod
  public PortMatchGeneric getClientPorts() {
    return clientPorts;
  }

  /**
   * This is the setter method to the attribute.
   * Port number to match against client port number in request.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientPorts set the clientPorts.
   */
  @VsoMethod
  public void setClientPorts(PortMatchGeneric clientPorts) {
    this.clientPorts = clientPorts;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsClientPortMatch objDnsClientPortMatch = (DnsClientPortMatch) o;
  return   Objects.equals(this.clientPorts, objDnsClientPortMatch.clientPorts);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsClientPortMatch {\n");
      sb.append("    clientPorts: ").append(toIndentedString(clientPorts)).append("\n");
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

