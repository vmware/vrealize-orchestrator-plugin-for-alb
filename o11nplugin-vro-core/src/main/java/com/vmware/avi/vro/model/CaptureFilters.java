package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.DebugIpAddr;
import com.vmware.avi.vro.model.CaptureIPC;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The CaptureFilters is a POJO class extends AviRestResource that used for creating
 * CaptureFilters.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CaptureFilters")
@VsoFinder(name = Constants.FINDER_VRO_CAPTUREFILTERS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CaptureFilters extends AviRestResource {
    @JsonProperty("capture_ip")
    @JsonInclude(Include.NON_NULL)
    private DebugIpAddr captureIp = null;

    @JsonProperty("capture_ipc")
    @JsonInclude(Include.NON_NULL)
    private CaptureIPC captureIpc = null;

    @JsonProperty("dst_port_end")
    @JsonInclude(Include.NON_NULL)
    private Integer dstPortEnd = null;

    @JsonProperty("dst_port_start")
    @JsonInclude(Include.NON_NULL)
    private Integer dstPortStart = null;

    @JsonProperty("eth_proto")
    @JsonInclude(Include.NON_NULL)
    private String ethProto = null;

    @JsonProperty("ip_proto")
    @JsonInclude(Include.NON_NULL)
    private String ipProto = null;

    @JsonProperty("src_port")
    @JsonInclude(Include.NON_NULL)
    private Integer srcPort = null;

    @JsonProperty("src_port_range_end")
    @JsonInclude(Include.NON_NULL)
    private Integer srcPortRangeEnd = null;

    @JsonProperty("tcp_ack")
    @JsonInclude(Include.NON_NULL)
    private Boolean tcpAck = null;

    @JsonProperty("tcp_fin")
    @JsonInclude(Include.NON_NULL)
    private Boolean tcpFin = null;

    @JsonProperty("tcp_push")
    @JsonInclude(Include.NON_NULL)
    private Boolean tcpPush = null;

    @JsonProperty("tcp_syn")
    @JsonInclude(Include.NON_NULL)
    private Boolean tcpSyn = null;



  /**
   * This is the getter method this will return the attribute value.
   * Per packet ip filter.
   * Matches with source and destination address.
   * Curently not applicable for debugserviceengine.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return captureIp
   */
  @VsoMethod
  public DebugIpAddr getCaptureIp() {
    return captureIp;
  }

  /**
   * This is the setter method to the attribute.
   * Per packet ip filter.
   * Matches with source and destination address.
   * Curently not applicable for debugserviceengine.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param captureIp set the captureIp.
   */
  @VsoMethod
  public void setCaptureIp(DebugIpAddr captureIp) {
    this.captureIp = captureIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Capture filter for se ipc.
   * Not applicable for debug virtual service.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return captureIpc
   */
  @VsoMethod
  public CaptureIPC getCaptureIpc() {
    return captureIpc;
  }

  /**
   * This is the setter method to the attribute.
   * Capture filter for se ipc.
   * Not applicable for debug virtual service.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param captureIpc set the captureIpc.
   */
  @VsoMethod
  public void setCaptureIpc(CaptureIPC captureIpc) {
    this.captureIpc = captureIpc;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Destination port range filter.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dstPortEnd
   */
  @VsoMethod
  public Integer getDstPortEnd() {
    return dstPortEnd;
  }

  /**
   * This is the setter method to the attribute.
   * Destination port range filter.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dstPortEnd set the dstPortEnd.
   */
  @VsoMethod
  public void setDstPortEnd(Integer  dstPortEnd) {
    this.dstPortEnd = dstPortEnd;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Destination port range filter.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dstPortStart
   */
  @VsoMethod
  public Integer getDstPortStart() {
    return dstPortStart;
  }

  /**
   * This is the setter method to the attribute.
   * Destination port range filter.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dstPortStart set the dstPortStart.
   */
  @VsoMethod
  public void setDstPortStart(Integer  dstPortStart) {
    this.dstPortStart = dstPortStart;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ethernet proto filter.
   * Enum options - ETH_TYPE_IPV4.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ethProto
   */
  @VsoMethod
  public String getEthProto() {
    return ethProto;
  }

  /**
   * This is the setter method to the attribute.
   * Ethernet proto filter.
   * Enum options - ETH_TYPE_IPV4.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ethProto set the ethProto.
   */
  @VsoMethod
  public void setEthProto(String  ethProto) {
    this.ethProto = ethProto;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip proto filter.
   * Support for tcp only for now.
   * Enum options - IP_TYPE_TCP.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipProto
   */
  @VsoMethod
  public String getIpProto() {
    return ipProto;
  }

  /**
   * This is the setter method to the attribute.
   * Ip proto filter.
   * Support for tcp only for now.
   * Enum options - IP_TYPE_TCP.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipProto set the ipProto.
   */
  @VsoMethod
  public void setIpProto(String  ipProto) {
    this.ipProto = ipProto;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Source port filter.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return srcPort
   */
  @VsoMethod
  public Integer getSrcPort() {
    return srcPort;
  }

  /**
   * This is the setter method to the attribute.
   * Source port filter.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param srcPort set the srcPort.
   */
  @VsoMethod
  public void setSrcPort(Integer  srcPort) {
    this.srcPort = srcPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Source port range end filter.
   * If specified, the source port filter will be a range.
   * The filter range will be between src_port and src_port_range_end.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return srcPortRangeEnd
   */
  @VsoMethod
  public Integer getSrcPortRangeEnd() {
    return srcPortRangeEnd;
  }

  /**
   * This is the setter method to the attribute.
   * Source port range end filter.
   * If specified, the source port filter will be a range.
   * The filter range will be between src_port and src_port_range_end.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param srcPortRangeEnd set the srcPortRangeEnd.
   */
  @VsoMethod
  public void setSrcPortRangeEnd(Integer  srcPortRangeEnd) {
    this.srcPortRangeEnd = srcPortRangeEnd;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tcp ack flag filter.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tcpAck
   */
  @VsoMethod
  public Boolean getTcpAck() {
    return tcpAck;
  }

  /**
   * This is the setter method to the attribute.
   * Tcp ack flag filter.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tcpAck set the tcpAck.
   */
  @VsoMethod
  public void setTcpAck(Boolean  tcpAck) {
    this.tcpAck = tcpAck;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tcp fin flag filter.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tcpFin
   */
  @VsoMethod
  public Boolean getTcpFin() {
    return tcpFin;
  }

  /**
   * This is the setter method to the attribute.
   * Tcp fin flag filter.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tcpFin set the tcpFin.
   */
  @VsoMethod
  public void setTcpFin(Boolean  tcpFin) {
    this.tcpFin = tcpFin;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tcp push flag filter.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tcpPush
   */
  @VsoMethod
  public Boolean getTcpPush() {
    return tcpPush;
  }

  /**
   * This is the setter method to the attribute.
   * Tcp push flag filter.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tcpPush set the tcpPush.
   */
  @VsoMethod
  public void setTcpPush(Boolean  tcpPush) {
    this.tcpPush = tcpPush;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tcp syn flag filter.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tcpSyn
   */
  @VsoMethod
  public Boolean getTcpSyn() {
    return tcpSyn;
  }

  /**
   * This is the setter method to the attribute.
   * Tcp syn flag filter.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tcpSyn set the tcpSyn.
   */
  @VsoMethod
  public void setTcpSyn(Boolean  tcpSyn) {
    this.tcpSyn = tcpSyn;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CaptureFilters objCaptureFilters = (CaptureFilters) o;
  return   Objects.equals(this.captureIp, objCaptureFilters.captureIp)&&
  Objects.equals(this.ethProto, objCaptureFilters.ethProto)&&
  Objects.equals(this.ipProto, objCaptureFilters.ipProto)&&
  Objects.equals(this.srcPort, objCaptureFilters.srcPort)&&
  Objects.equals(this.dstPortStart, objCaptureFilters.dstPortStart)&&
  Objects.equals(this.dstPortEnd, objCaptureFilters.dstPortEnd)&&
  Objects.equals(this.tcpSyn, objCaptureFilters.tcpSyn)&&
  Objects.equals(this.tcpAck, objCaptureFilters.tcpAck)&&
  Objects.equals(this.tcpFin, objCaptureFilters.tcpFin)&&
  Objects.equals(this.tcpPush, objCaptureFilters.tcpPush)&&
  Objects.equals(this.captureIpc, objCaptureFilters.captureIpc)&&
  Objects.equals(this.srcPortRangeEnd, objCaptureFilters.srcPortRangeEnd);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CaptureFilters {\n");
      sb.append("    captureIp: ").append(toIndentedString(captureIp)).append("\n");
        sb.append("    captureIpc: ").append(toIndentedString(captureIpc)).append("\n");
        sb.append("    dstPortEnd: ").append(toIndentedString(dstPortEnd)).append("\n");
        sb.append("    dstPortStart: ").append(toIndentedString(dstPortStart)).append("\n");
        sb.append("    ethProto: ").append(toIndentedString(ethProto)).append("\n");
        sb.append("    ipProto: ").append(toIndentedString(ipProto)).append("\n");
        sb.append("    srcPort: ").append(toIndentedString(srcPort)).append("\n");
        sb.append("    srcPortRangeEnd: ").append(toIndentedString(srcPortRangeEnd)).append("\n");
        sb.append("    tcpAck: ").append(toIndentedString(tcpAck)).append("\n");
        sb.append("    tcpFin: ").append(toIndentedString(tcpFin)).append("\n");
        sb.append("    tcpPush: ").append(toIndentedString(tcpPush)).append("\n");
        sb.append("    tcpSyn: ").append(toIndentedString(tcpSyn)).append("\n");
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

