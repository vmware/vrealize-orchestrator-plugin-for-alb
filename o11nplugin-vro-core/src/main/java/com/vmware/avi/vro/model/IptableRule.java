package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.PortRange;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.PortRange;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The IptableRule is a POJO class extends AviRestResource that used for creating
 * IptableRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IptableRule")
@VsoFinder(name = Constants.FINDER_VRO_IPTABLERULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IptableRule extends AviRestResource {
  @JsonProperty("action")
  @JsonInclude(Include.NON_NULL)
  private String action = null;

  @JsonProperty("dnat_ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddr dnatIp = null;

  @JsonProperty("dst_ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddrPrefix dstIp = null;

  @JsonProperty("dst_port")
  @JsonInclude(Include.NON_NULL)
  private PortRange dstPort = null;

  @JsonProperty("input_interface")
  @JsonInclude(Include.NON_NULL)
  private String inputInterface = null;

  @JsonProperty("output_interface")
  @JsonInclude(Include.NON_NULL)
  private String outputInterface = null;

  @JsonProperty("proto")
  @JsonInclude(Include.NON_NULL)
  private String proto = null;

  @JsonProperty("src_ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddrPrefix srcIp = null;

  @JsonProperty("src_port")
  @JsonInclude(Include.NON_NULL)
  private PortRange srcPort = null;

  @JsonProperty("tag")
  @JsonInclude(Include.NON_NULL)
  private String tag = null;



  /**
   * This is the getter method this will return the attribute value.
   * Enum options - ACCEPT, DROP, REJECT, DNAT, MASQUERADE.
   * @return action
   */
  @VsoMethod
  public String getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - ACCEPT, DROP, REJECT, DNAT, MASQUERADE.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(String  action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property dnat_ip of obj type iptablerule field type str  type ref.
   * @return dnatIp
   */
  @VsoMethod
  public IpAddr getDnatIp() {
    return dnatIp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property dnat_ip of obj type iptablerule field type str  type ref.
   * @param dnatIp set the dnatIp.
   */
  @VsoMethod
  public void setDnatIp(IpAddr dnatIp) {
    this.dnatIp = dnatIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property dst_ip of obj type iptablerule field type str  type ref.
   * @return dstIp
   */
  @VsoMethod
  public IpAddrPrefix getDstIp() {
    return dstIp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property dst_ip of obj type iptablerule field type str  type ref.
   * @param dstIp set the dstIp.
   */
  @VsoMethod
  public void setDstIp(IpAddrPrefix dstIp) {
    this.dstIp = dstIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property dst_port of obj type iptablerule field type str  type ref.
   * @return dstPort
   */
  @VsoMethod
  public PortRange getDstPort() {
    return dstPort;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property dst_port of obj type iptablerule field type str  type ref.
   * @param dstPort set the dstPort.
   */
  @VsoMethod
  public void setDstPort(PortRange dstPort) {
    this.dstPort = dstPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property input_interface of obj type iptablerule field type str  type string.
   * @return inputInterface
   */
  @VsoMethod
  public String getInputInterface() {
    return inputInterface;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property input_interface of obj type iptablerule field type str  type string.
   * @param inputInterface set the inputInterface.
   */
  @VsoMethod
  public void setInputInterface(String  inputInterface) {
    this.inputInterface = inputInterface;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property output_interface of obj type iptablerule field type str  type string.
   * @return outputInterface
   */
  @VsoMethod
  public String getOutputInterface() {
    return outputInterface;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property output_interface of obj type iptablerule field type str  type string.
   * @param outputInterface set the outputInterface.
   */
  @VsoMethod
  public void setOutputInterface(String  outputInterface) {
    this.outputInterface = outputInterface;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - PROTO_TCP, PROTO_UDP, PROTO_ICMP, PROTO_ALL.
   * @return proto
   */
  @VsoMethod
  public String getProto() {
    return proto;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - PROTO_TCP, PROTO_UDP, PROTO_ICMP, PROTO_ALL.
   * @param proto set the proto.
   */
  @VsoMethod
  public void setProto(String  proto) {
    this.proto = proto;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property src_ip of obj type iptablerule field type str  type ref.
   * @return srcIp
   */
  @VsoMethod
  public IpAddrPrefix getSrcIp() {
    return srcIp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property src_ip of obj type iptablerule field type str  type ref.
   * @param srcIp set the srcIp.
   */
  @VsoMethod
  public void setSrcIp(IpAddrPrefix srcIp) {
    this.srcIp = srcIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property src_port of obj type iptablerule field type str  type ref.
   * @return srcPort
   */
  @VsoMethod
  public PortRange getSrcPort() {
    return srcPort;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property src_port of obj type iptablerule field type str  type ref.
   * @param srcPort set the srcPort.
   */
  @VsoMethod
  public void setSrcPort(PortRange srcPort) {
    this.srcPort = srcPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property tag of obj type iptablerule field type str  type string.
   * @return tag
   */
  @VsoMethod
  public String getTag() {
    return tag;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property tag of obj type iptablerule field type str  type string.
   * @param tag set the tag.
   */
  @VsoMethod
  public void setTag(String  tag) {
    this.tag = tag;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  IptableRule objIptableRule = (IptableRule) o;
  return   Objects.equals(this.dnatIp, objIptableRule.dnatIp)&&
  Objects.equals(this.srcPort, objIptableRule.srcPort)&&
  Objects.equals(this.proto, objIptableRule.proto)&&
  Objects.equals(this.inputInterface, objIptableRule.inputInterface)&&
  Objects.equals(this.outputInterface, objIptableRule.outputInterface)&&
  Objects.equals(this.srcIp, objIptableRule.srcIp)&&
  Objects.equals(this.tag, objIptableRule.tag)&&
  Objects.equals(this.dstPort, objIptableRule.dstPort)&&
  Objects.equals(this.action, objIptableRule.action)&&
  Objects.equals(this.dstIp, objIptableRule.dstIp);
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

