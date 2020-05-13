package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IPReputationTypeMatch;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.MicroServiceMatch;
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
 * NetworkSecurityMatchTarget
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NetworkSecurityMatchTarget")
@VsoFinder(name = Constants.FINDER_VRO_NETWORKSECURITYMATCHTARGET, idAccessor = "getObjectID()")
@Service
public class NetworkSecurityMatchTarget extends AviRestResource  {
  @JsonProperty("client_ip")
  private IpAddrMatch clientIp = null;

  @JsonProperty("ip_reputation_type")
  private IPReputationTypeMatch ipReputationType = null;

  @JsonProperty("microservice")
  private MicroServiceMatch microservice = null;

  @JsonProperty("vs_port")
  private PortMatch vsPort = null;

  
  /**
   * Placeholder for description of property client_ip of obj type NetworkSecurityMatchTarget field type str  type object
   * @return clientIp
  **/
  @ApiModelProperty(value = "Placeholder for description of property client_ip of obj type NetworkSecurityMatchTarget field type str  type object")

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
   *  Field introduced in 20.1.1.
   * @return ipReputationType
  **/
  @ApiModelProperty(value = " Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public IPReputationTypeMatch getIpReputationType() {
    return ipReputationType;
  }
    
  @VsoMethod
  public void setIpReputationType(IPReputationTypeMatch ipReputationType) {
    this.ipReputationType = ipReputationType;
  }

  
  /**
   * Placeholder for description of property microservice of obj type NetworkSecurityMatchTarget field type str  type object
   * @return microservice
  **/
  @ApiModelProperty(value = "Placeholder for description of property microservice of obj type NetworkSecurityMatchTarget field type str  type object")

  @Valid

 
  @VsoMethod  
  public MicroServiceMatch getMicroservice() {
    return microservice;
  }
    
  @VsoMethod
  public void setMicroservice(MicroServiceMatch microservice) {
    this.microservice = microservice;
  }

  
  /**
   * Placeholder for description of property vs_port of obj type NetworkSecurityMatchTarget field type str  type object
   * @return vsPort
  **/
  @ApiModelProperty(value = "Placeholder for description of property vs_port of obj type NetworkSecurityMatchTarget field type str  type object")

  @Valid

 
  @VsoMethod  
  public PortMatch getVsPort() {
    return vsPort;
  }
    
  @VsoMethod
  public void setVsPort(PortMatch vsPort) {
    this.vsPort = vsPort;
  }

  
  public String getObjectID() {
		return "NetworkSecurityMatchTarget";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkSecurityMatchTarget networkSecurityMatchTarget = (NetworkSecurityMatchTarget) o;
    return Objects.equals(this.clientIp, networkSecurityMatchTarget.clientIp) &&
        Objects.equals(this.ipReputationType, networkSecurityMatchTarget.ipReputationType) &&
        Objects.equals(this.microservice, networkSecurityMatchTarget.microservice) &&
        Objects.equals(this.vsPort, networkSecurityMatchTarget.vsPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIp, ipReputationType, microservice, vsPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkSecurityMatchTarget {\n");
    
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    ipReputationType: ").append(toIndentedString(ipReputationType)).append("\n");
    sb.append("    microservice: ").append(toIndentedString(microservice)).append("\n");
    sb.append("    vsPort: ").append(toIndentedString(vsPort)).append("\n");
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

