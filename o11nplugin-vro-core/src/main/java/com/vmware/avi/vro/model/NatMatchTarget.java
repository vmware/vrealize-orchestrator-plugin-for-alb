package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.ServiceMatch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * NatMatchTarget
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NatMatchTarget")
@VsoFinder(name = Constants.FINDER_VRO_NATMATCHTARGET, idAccessor = "getObjectID()")
@Service
public class NatMatchTarget extends AviRestResource  {
  @JsonProperty("destination_ip")
  private IpAddrMatch destinationIp = null;

  @JsonProperty("services")
  private ServiceMatch services = null;

  @JsonProperty("source_ip")
  private IpAddrMatch sourceIp = null;

  
  /**
   * Destination IP of the packet. Field introduced in 18.2.3.
   * @return destinationIp
  **/
  @ApiModelProperty(value = "Destination IP of the packet. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public IpAddrMatch getDestinationIp() {
    return destinationIp;
  }
    
  @VsoMethod
  public void setDestinationIp(IpAddrMatch destinationIp) {
    this.destinationIp = destinationIp;
  }

  
  /**
   * Services like port-matching and protocol. Field introduced in 18.2.5.
   * @return services
  **/
  @ApiModelProperty(value = "Services like port-matching and protocol. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public ServiceMatch getServices() {
    return services;
  }
    
  @VsoMethod
  public void setServices(ServiceMatch services) {
    this.services = services;
  }

  
  /**
   * Source IP of the packet. Field introduced in 18.2.3.
   * @return sourceIp
  **/
  @ApiModelProperty(value = "Source IP of the packet. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public IpAddrMatch getSourceIp() {
    return sourceIp;
  }
    
  @VsoMethod
  public void setSourceIp(IpAddrMatch sourceIp) {
    this.sourceIp = sourceIp;
  }

  
  public String getObjectID() {
		return "NatMatchTarget";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NatMatchTarget natMatchTarget = (NatMatchTarget) o;
    return Objects.equals(this.destinationIp, natMatchTarget.destinationIp) &&
        Objects.equals(this.services, natMatchTarget.services) &&
        Objects.equals(this.sourceIp, natMatchTarget.sourceIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationIp, services, sourceIp);
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

