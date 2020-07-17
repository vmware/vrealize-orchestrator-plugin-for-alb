package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.ServiceMatch;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The NatMatchTarget is a POJO class extends AviRestResource that used for creating
 * NatMatchTarget.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NatMatchTarget")
@VsoFinder(name = Constants.FINDER_VRO_NATMATCHTARGET)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NatMatchTarget extends AviRestResource {
  @JsonProperty("destination_ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddrMatch destinationIp = null;

  @JsonProperty("services")
  @JsonInclude(Include.NON_NULL)
  private ServiceMatch services = null;

  @JsonProperty("source_ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddrMatch sourceIp = null;



  /**
   * This is the getter method this will return the attribute value.
   * Destination ip of the packet.
   * Field introduced in 18.2.3.
   * @return destinationIp
   */
  @VsoMethod
  public IpAddrMatch getDestinationIp() {
    return destinationIp;
  }

  /**
   * This is the setter method to the attribute.
   * Destination ip of the packet.
   * Field introduced in 18.2.3.
   * @param destinationIp set the destinationIp.
   */
  @VsoMethod
  public void setDestinationIp(IpAddrMatch destinationIp) {
    this.destinationIp = destinationIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Services like port-matching and protocol.
   * Field introduced in 18.2.5.
   * @return services
   */
  @VsoMethod
  public ServiceMatch getServices() {
    return services;
  }

  /**
   * This is the setter method to the attribute.
   * Services like port-matching and protocol.
   * Field introduced in 18.2.5.
   * @param services set the services.
   */
  @VsoMethod
  public void setServices(ServiceMatch services) {
    this.services = services;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Source ip of the packet.
   * Field introduced in 18.2.3.
   * @return sourceIp
   */
  @VsoMethod
  public IpAddrMatch getSourceIp() {
    return sourceIp;
  }

  /**
   * This is the setter method to the attribute.
   * Source ip of the packet.
   * Field introduced in 18.2.3.
   * @param sourceIp set the sourceIp.
   */
  @VsoMethod
  public void setSourceIp(IpAddrMatch sourceIp) {
    this.sourceIp = sourceIp;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NatMatchTarget objNatMatchTarget = (NatMatchTarget) o;
  return   Objects.equals(this.services, objNatMatchTarget.services)&&
  Objects.equals(this.destinationIp, objNatMatchTarget.destinationIp)&&
  Objects.equals(this.sourceIp, objNatMatchTarget.sourceIp);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NatMatchTarget {\n");
      sb.append("    destinationIp: ").append(toIndentedString(destinationIp)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
        sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
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

