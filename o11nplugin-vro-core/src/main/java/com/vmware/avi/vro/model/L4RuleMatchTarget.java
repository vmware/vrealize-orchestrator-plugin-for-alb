package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.L4RulePortMatch;
import com.vmware.avi.vro.model.L4RuleProtocolMatch;
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
 * L4RuleMatchTarget
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "L4RuleMatchTarget")
@VsoFinder(name = Constants.FINDER_VRO_L4RULEMATCHTARGET, idAccessor = "getObjectID()")
@Service
public class L4RuleMatchTarget extends AviRestResource  {
  @JsonProperty("client_ip")
  private IpAddrMatch clientIp = null;

  @JsonProperty("port")
  private L4RulePortMatch port = null;

  @JsonProperty("protocol")
  private L4RuleProtocolMatch protocol = null;

  
  /**
   * IP addresses to match against client IP. Field introduced in 17.2.7.
   * @return clientIp
  **/
  @ApiModelProperty(value = "IP addresses to match against client IP. Field introduced in 17.2.7.")

  @Valid

 
  @VsoMethod  
  public IpAddrMatch getClientIp() {
    return clientIp;
  }
    
  @VsoMethod
  public void setClientIp(IpAddrMatch clientIp) {
    this.clientIp = clientIp;
  }

  
  /**
   * Port number to match against Virtual Service listner port. Field introduced in 17.2.7.
   * @return port
  **/
  @ApiModelProperty(value = "Port number to match against Virtual Service listner port. Field introduced in 17.2.7.")

  @Valid

 
  @VsoMethod  
  public L4RulePortMatch getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(L4RulePortMatch port) {
    this.port = port;
  }

  
  /**
   * TCP/UDP/ICMP protocol to match against transport protocol. Field introduced in 17.2.7.
   * @return protocol
  **/
  @ApiModelProperty(value = "TCP/UDP/ICMP protocol to match against transport protocol. Field introduced in 17.2.7.")

  @Valid

 
  @VsoMethod  
  public L4RuleProtocolMatch getProtocol() {
    return protocol;
  }
    
  @VsoMethod
  public void setProtocol(L4RuleProtocolMatch protocol) {
    this.protocol = protocol;
  }

  
  public String getObjectID() {
		return "L4RuleMatchTarget";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L4RuleMatchTarget l4RuleMatchTarget = (L4RuleMatchTarget) o;
    return Objects.equals(this.clientIp, l4RuleMatchTarget.clientIp) &&
        Objects.equals(this.port, l4RuleMatchTarget.port) &&
        Objects.equals(this.protocol, l4RuleMatchTarget.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIp, port, protocol);
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

