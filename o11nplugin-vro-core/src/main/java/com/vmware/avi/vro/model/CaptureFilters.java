package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CaptureIPC;
import com.vmware.avi.vro.model.DebugIpAddr;
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
 * CaptureFilters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CaptureFilters")
@VsoFinder(name = Constants.FINDER_VRO_CAPTUREFILTERS, idAccessor = "getObjectID()")
@Service
public class CaptureFilters extends AviRestResource  {
  @JsonProperty("capture_ip")
  private DebugIpAddr captureIp = null;

  @JsonProperty("capture_ipc")
  private CaptureIPC captureIpc = null;

  @JsonProperty("dst_port_end")
  private Integer dstPortEnd = null;

  @JsonProperty("dst_port_start")
  private Integer dstPortStart = null;

  @JsonProperty("eth_proto")
  private String ethProto = null;

  @JsonProperty("ip_proto")
  private String ipProto = null;

  @JsonProperty("src_port")
  private Integer srcPort = null;

  @JsonProperty("tcp_ack")
  private Boolean tcpAck = null;

  @JsonProperty("tcp_fin")
  private Boolean tcpFin = null;

  @JsonProperty("tcp_push")
  private Boolean tcpPush = null;

  @JsonProperty("tcp_syn")
  private Boolean tcpSyn = null;

  
  /**
   * Per packet IP filter. Matches with source and destination address. Curently not applicable for DebugServiceEngine. Field introduced in 18.2.5.
   * @return captureIp
  **/
  @ApiModelProperty(value = "Per packet IP filter. Matches with source and destination address. Curently not applicable for DebugServiceEngine. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public DebugIpAddr getCaptureIp() {
    return captureIp;
  }
    
  @VsoMethod
  public void setCaptureIp(DebugIpAddr captureIp) {
    this.captureIp = captureIp;
  }

  
  /**
   * Capture filter for SE IPC. Not applicable for Debug Virtual Service. Field introduced in 18.2.5.
   * @return captureIpc
  **/
  @ApiModelProperty(value = "Capture filter for SE IPC. Not applicable for Debug Virtual Service. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public CaptureIPC getCaptureIpc() {
    return captureIpc;
  }
    
  @VsoMethod
  public void setCaptureIpc(CaptureIPC captureIpc) {
    this.captureIpc = captureIpc;
  }

  
  /**
   * Destination Port range filter. Field introduced in 18.2.5.
   * @return dstPortEnd
  **/
  @ApiModelProperty(value = "Destination Port range filter. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getDstPortEnd() {
    return dstPortEnd;
  }
    
  @VsoMethod
  public void setDstPortEnd(Integer dstPortEnd) {
    this.dstPortEnd = dstPortEnd;
  }

  
  /**
   * Destination Port range filter. Field introduced in 18.2.5.
   * @return dstPortStart
  **/
  @ApiModelProperty(value = "Destination Port range filter. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getDstPortStart() {
    return dstPortStart;
  }
    
  @VsoMethod
  public void setDstPortStart(Integer dstPortStart) {
    this.dstPortStart = dstPortStart;
  }

  
  /**
   * Ethernet Proto filter. Enum options - ETH_TYPE_IPV4. Field introduced in 18.2.5.
   * @return ethProto
  **/
  @ApiModelProperty(value = "Ethernet Proto filter. Enum options - ETH_TYPE_IPV4. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getEthProto() {
    return ethProto;
  }
    
  @VsoMethod
  public void setEthProto(String ethProto) {
    this.ethProto = ethProto;
  }

  
  /**
   * IP Proto filter. Support for TCP only for now. Enum options - IP_TYPE_TCP. Field introduced in 18.2.5.
   * @return ipProto
  **/
  @ApiModelProperty(value = "IP Proto filter. Support for TCP only for now. Enum options - IP_TYPE_TCP. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getIpProto() {
    return ipProto;
  }
    
  @VsoMethod
  public void setIpProto(String ipProto) {
    this.ipProto = ipProto;
  }

  
  /**
   * Source Port filter. Field introduced in 18.2.5.
   * @return srcPort
  **/
  @ApiModelProperty(value = "Source Port filter. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getSrcPort() {
    return srcPort;
  }
    
  @VsoMethod
  public void setSrcPort(Integer srcPort) {
    this.srcPort = srcPort;
  }

  
  /**
   * TCP ACK flag filter. Field introduced in 18.2.5.
   * @return tcpAck
  **/
  @ApiModelProperty(value = "TCP ACK flag filter. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isTcpAck() {
    return tcpAck;
  }
    
  @VsoMethod
  public void setTcpAck(Boolean tcpAck) {
    this.tcpAck = tcpAck;
  }

  
  /**
   * TCP FIN flag filter. Field introduced in 18.2.5.
   * @return tcpFin
  **/
  @ApiModelProperty(value = "TCP FIN flag filter. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isTcpFin() {
    return tcpFin;
  }
    
  @VsoMethod
  public void setTcpFin(Boolean tcpFin) {
    this.tcpFin = tcpFin;
  }

  
  /**
   * TCP PUSH flag filter. Field introduced in 18.2.5.
   * @return tcpPush
  **/
  @ApiModelProperty(value = "TCP PUSH flag filter. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isTcpPush() {
    return tcpPush;
  }
    
  @VsoMethod
  public void setTcpPush(Boolean tcpPush) {
    this.tcpPush = tcpPush;
  }

  
  /**
   * TCP SYN flag filter. Field introduced in 18.2.5.
   * @return tcpSyn
  **/
  @ApiModelProperty(value = "TCP SYN flag filter. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isTcpSyn() {
    return tcpSyn;
  }
    
  @VsoMethod
  public void setTcpSyn(Boolean tcpSyn) {
    this.tcpSyn = tcpSyn;
  }

  
  public String getObjectID() {
		return "CaptureFilters";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptureFilters captureFilters = (CaptureFilters) o;
    return Objects.equals(this.captureIp, captureFilters.captureIp) &&
        Objects.equals(this.captureIpc, captureFilters.captureIpc) &&
        Objects.equals(this.dstPortEnd, captureFilters.dstPortEnd) &&
        Objects.equals(this.dstPortStart, captureFilters.dstPortStart) &&
        Objects.equals(this.ethProto, captureFilters.ethProto) &&
        Objects.equals(this.ipProto, captureFilters.ipProto) &&
        Objects.equals(this.srcPort, captureFilters.srcPort) &&
        Objects.equals(this.tcpAck, captureFilters.tcpAck) &&
        Objects.equals(this.tcpFin, captureFilters.tcpFin) &&
        Objects.equals(this.tcpPush, captureFilters.tcpPush) &&
        Objects.equals(this.tcpSyn, captureFilters.tcpSyn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(captureIp, captureIpc, dstPortEnd, dstPortStart, ethProto, ipProto, srcPort, tcpAck, tcpFin, tcpPush, tcpSyn);
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

