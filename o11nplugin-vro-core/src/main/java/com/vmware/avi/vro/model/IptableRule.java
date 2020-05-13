package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.PortRange;
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
 * IptableRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IptableRule")
@VsoFinder(name = Constants.FINDER_VRO_IPTABLERULE, idAccessor = "getObjectID()")
@Service
public class IptableRule extends AviRestResource  {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("dnat_ip")
  private IpAddr dnatIp = null;

  @JsonProperty("dst_ip")
  private IpAddrPrefix dstIp = null;

  @JsonProperty("dst_port")
  private PortRange dstPort = null;

  @JsonProperty("input_interface")
  private String inputInterface = null;

  @JsonProperty("output_interface")
  private String outputInterface = null;

  @JsonProperty("proto")
  private String proto = null;

  @JsonProperty("src_ip")
  private IpAddrPrefix srcIp = null;

  @JsonProperty("src_port")
  private PortRange srcPort = null;

  @JsonProperty("tag")
  private String tag = null;

  
  /**
   *  Enum options - ACCEPT, DROP, REJECT, DNAT, MASQUERADE.
   * @return action
  **/
  @ApiModelProperty(required = true, value = " Enum options - ACCEPT, DROP, REJECT, DNAT, MASQUERADE.")
  @NotNull


 
  @VsoMethod  
  public String getAction() {
    return action;
  }
    
  @VsoMethod
  public void setAction(String action) {
    this.action = action;
  }

  
  /**
   * Placeholder for description of property dnat_ip of obj type IptableRule field type str  type object
   * @return dnatIp
  **/
  @ApiModelProperty(value = "Placeholder for description of property dnat_ip of obj type IptableRule field type str  type object")

  @Valid

 
  @VsoMethod  
  public IpAddr getDnatIp() {
    return dnatIp;
  }
    
  @VsoMethod
  public void setDnatIp(IpAddr dnatIp) {
    this.dnatIp = dnatIp;
  }

  
  /**
   * Placeholder for description of property dst_ip of obj type IptableRule field type str  type object
   * @return dstIp
  **/
  @ApiModelProperty(value = "Placeholder for description of property dst_ip of obj type IptableRule field type str  type object")

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getDstIp() {
    return dstIp;
  }
    
  @VsoMethod
  public void setDstIp(IpAddrPrefix dstIp) {
    this.dstIp = dstIp;
  }

  
  /**
   * Placeholder for description of property dst_port of obj type IptableRule field type str  type object
   * @return dstPort
  **/
  @ApiModelProperty(value = "Placeholder for description of property dst_port of obj type IptableRule field type str  type object")

  @Valid

 
  @VsoMethod  
  public PortRange getDstPort() {
    return dstPort;
  }
    
  @VsoMethod
  public void setDstPort(PortRange dstPort) {
    this.dstPort = dstPort;
  }

  
  /**
   * input_interface of IptableRule.
   * @return inputInterface
  **/
  @ApiModelProperty(value = "input_interface of IptableRule.")


 
  @VsoMethod  
  public String getInputInterface() {
    return inputInterface;
  }
    
  @VsoMethod
  public void setInputInterface(String inputInterface) {
    this.inputInterface = inputInterface;
  }

  
  /**
   * output_interface of IptableRule.
   * @return outputInterface
  **/
  @ApiModelProperty(value = "output_interface of IptableRule.")


 
  @VsoMethod  
  public String getOutputInterface() {
    return outputInterface;
  }
    
  @VsoMethod
  public void setOutputInterface(String outputInterface) {
    this.outputInterface = outputInterface;
  }

  
  /**
   *  Enum options - PROTO_TCP, PROTO_UDP, PROTO_ICMP, PROTO_ALL.
   * @return proto
  **/
  @ApiModelProperty(value = " Enum options - PROTO_TCP, PROTO_UDP, PROTO_ICMP, PROTO_ALL.")


 
  @VsoMethod  
  public String getProto() {
    return proto;
  }
    
  @VsoMethod
  public void setProto(String proto) {
    this.proto = proto;
  }

  
  /**
   * Placeholder for description of property src_ip of obj type IptableRule field type str  type object
   * @return srcIp
  **/
  @ApiModelProperty(value = "Placeholder for description of property src_ip of obj type IptableRule field type str  type object")

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getSrcIp() {
    return srcIp;
  }
    
  @VsoMethod
  public void setSrcIp(IpAddrPrefix srcIp) {
    this.srcIp = srcIp;
  }

  
  /**
   * Placeholder for description of property src_port of obj type IptableRule field type str  type object
   * @return srcPort
  **/
  @ApiModelProperty(value = "Placeholder for description of property src_port of obj type IptableRule field type str  type object")

  @Valid

 
  @VsoMethod  
  public PortRange getSrcPort() {
    return srcPort;
  }
    
  @VsoMethod
  public void setSrcPort(PortRange srcPort) {
    this.srcPort = srcPort;
  }

  
  /**
   * tag of IptableRule.
   * @return tag
  **/
  @ApiModelProperty(value = "tag of IptableRule.")


 
  @VsoMethod  
  public String getTag() {
    return tag;
  }
    
  @VsoMethod
  public void setTag(String tag) {
    this.tag = tag;
  }

  
  public String getObjectID() {
		return "IptableRule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IptableRule iptableRule = (IptableRule) o;
    return Objects.equals(this.action, iptableRule.action) &&
        Objects.equals(this.dnatIp, iptableRule.dnatIp) &&
        Objects.equals(this.dstIp, iptableRule.dstIp) &&
        Objects.equals(this.dstPort, iptableRule.dstPort) &&
        Objects.equals(this.inputInterface, iptableRule.inputInterface) &&
        Objects.equals(this.outputInterface, iptableRule.outputInterface) &&
        Objects.equals(this.proto, iptableRule.proto) &&
        Objects.equals(this.srcIp, iptableRule.srcIp) &&
        Objects.equals(this.srcPort, iptableRule.srcPort) &&
        Objects.equals(this.tag, iptableRule.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, dnatIp, dstIp, dstPort, inputInterface, outputInterface, proto, srcIp, srcPort, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IptableRule {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    dnatIp: ").append(toIndentedString(dnatIp)).append("\n");
    sb.append("    dstIp: ").append(toIndentedString(dstIp)).append("\n");
    sb.append("    dstPort: ").append(toIndentedString(dstPort)).append("\n");
    sb.append("    inputInterface: ").append(toIndentedString(inputInterface)).append("\n");
    sb.append("    outputInterface: ").append(toIndentedString(outputInterface)).append("\n");
    sb.append("    proto: ").append(toIndentedString(proto)).append("\n");
    sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
    sb.append("    srcPort: ").append(toIndentedString(srcPort)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

