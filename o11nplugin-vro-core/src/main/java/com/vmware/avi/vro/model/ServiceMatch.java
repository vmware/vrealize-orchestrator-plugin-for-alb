package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.L4RuleProtocolMatch;
import com.vmware.avi.vro.model.PortMatch;
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
 * ServiceMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ServiceMatch")
@VsoFinder(name = Constants.FINDER_VRO_SERVICEMATCH, idAccessor = "getObjectID()")
@Service
public class ServiceMatch extends AviRestResource  {
  @JsonProperty("destination_port")
  private PortMatch destinationPort = null;

  @JsonProperty("protocol")
  private L4RuleProtocolMatch protocol = null;

  @JsonProperty("source_port")
  private PortMatch sourcePort = null;

  
  /**
   * Destination Port of the packet. Field introduced in 18.2.5.
   * @return destinationPort
  **/
  @ApiModelProperty(value = "Destination Port of the packet. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public PortMatch getDestinationPort() {
    return destinationPort;
  }
    
  @VsoMethod
  public void setDestinationPort(PortMatch destinationPort) {
    this.destinationPort = destinationPort;
  }

  
  /**
   * Protocol to match. Field introduced in 20.1.1.
   * @return protocol
  **/
  @ApiModelProperty(value = "Protocol to match. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public L4RuleProtocolMatch getProtocol() {
    return protocol;
  }
    
  @VsoMethod
  public void setProtocol(L4RuleProtocolMatch protocol) {
    this.protocol = protocol;
  }

  
  /**
   * Source Port of the packet. Field introduced in 18.2.5.
   * @return sourcePort
  **/
  @ApiModelProperty(value = "Source Port of the packet. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public PortMatch getSourcePort() {
    return sourcePort;
  }
    
  @VsoMethod
  public void setSourcePort(PortMatch sourcePort) {
    this.sourcePort = sourcePort;
  }

  
  public String getObjectID() {
		return "ServiceMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceMatch serviceMatch = (ServiceMatch) o;
    return Objects.equals(this.destinationPort, serviceMatch.destinationPort) &&
        Objects.equals(this.protocol, serviceMatch.protocol) &&
        Objects.equals(this.sourcePort, serviceMatch.sourcePort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationPort, protocol, sourcePort);
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

