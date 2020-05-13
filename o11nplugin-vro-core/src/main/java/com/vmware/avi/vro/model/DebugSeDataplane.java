package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * DebugSeDataplane
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DebugSeDataplane")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGSEDATAPLANE, idAccessor = "getObjectID()")
@Service
public class DebugSeDataplane extends AviRestResource  {
  @JsonProperty("flag")
  private String flag = null;

  
  /**
   *  Enum options - DEBUG_DISPATCHER_FLOW, DEBUG_DISPATCHER_FLOW_DETAIL, DEBUG_DISPATCHER_FLOW_ALL, DEBUG_CONFIG, DEBUG_IP, DEBUG_IP_PKT_IN, DEBUG_IP_PKT_OUT, DEBUG_ARP, DEBUG_ARP_PKT_IN, DEBUG_ARP_PKT_OUT, DEBUG_ETHERNET, DEBUG_ETHERNET_PKT_IN, DEBUG_ETHERNET_PKT_OUT, DEBUG_ICMP, DEBUG_PCAP_RX, DEBUG_PCAP_TX, DEBUG_PCAP_DROP, DEBUG_PCAP_ALL, DEBUG_MISC, DEBUG_CRUD, DEBUG_POOL, DEBUG_PCAP_DOS, DEBUG_PCAP_HM, DEBUG_SE_APP, DEBUG_UDP, DEBUG_SE_VS_HB, DEBUG_ND, DEBUG_ERROR, DEBUG_NONE, DEBUG_ALL, DEBUG_STRICT, DEBUG_FLOW_MIRROR, DEBUG_NAT, DEBUG_NAT_ERROR, DEBUG_NAT_PKT, DEBUG_NAT_END2END, DEBUG_NAT_ALL, DEBUG_PCAP_SE_IPC.
   * @return flag
  **/
  @ApiModelProperty(required = true, value = " Enum options - DEBUG_DISPATCHER_FLOW, DEBUG_DISPATCHER_FLOW_DETAIL, DEBUG_DISPATCHER_FLOW_ALL, DEBUG_CONFIG, DEBUG_IP, DEBUG_IP_PKT_IN, DEBUG_IP_PKT_OUT, DEBUG_ARP, DEBUG_ARP_PKT_IN, DEBUG_ARP_PKT_OUT, DEBUG_ETHERNET, DEBUG_ETHERNET_PKT_IN, DEBUG_ETHERNET_PKT_OUT, DEBUG_ICMP, DEBUG_PCAP_RX, DEBUG_PCAP_TX, DEBUG_PCAP_DROP, DEBUG_PCAP_ALL, DEBUG_MISC, DEBUG_CRUD, DEBUG_POOL, DEBUG_PCAP_DOS, DEBUG_PCAP_HM, DEBUG_SE_APP, DEBUG_UDP, DEBUG_SE_VS_HB, DEBUG_ND, DEBUG_ERROR, DEBUG_NONE, DEBUG_ALL, DEBUG_STRICT, DEBUG_FLOW_MIRROR, DEBUG_NAT, DEBUG_NAT_ERROR, DEBUG_NAT_PKT, DEBUG_NAT_END2END, DEBUG_NAT_ALL, DEBUG_PCAP_SE_IPC.")
  @NotNull


 
  @VsoMethod  
  public String getFlag() {
    return flag;
  }
    
  @VsoMethod
  public void setFlag(String flag) {
    this.flag = flag;
  }

  
  public String getObjectID() {
		return "DebugSeDataplane";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugSeDataplane debugSeDataplane = (DebugSeDataplane) o;
    return Objects.equals(this.flag, debugSeDataplane.flag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugSeDataplane {\n");
    
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
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

