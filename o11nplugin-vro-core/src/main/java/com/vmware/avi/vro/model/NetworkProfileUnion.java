package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.TCPFastPathProfile;
import com.vmware.avi.vro.model.TCPProxyProfile;
import com.vmware.avi.vro.model.UDPFastPathProfile;
import com.vmware.avi.vro.model.UDPProxyProfile;
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
 * NetworkProfileUnion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NetworkProfileUnion")
@VsoFinder(name = Constants.FINDER_VRO_NETWORKPROFILEUNION, idAccessor = "getObjectID()")
@Service
public class NetworkProfileUnion extends AviRestResource  {
  @JsonProperty("tcp_fast_path_profile")
  private TCPFastPathProfile tcpFastPathProfile = null;

  @JsonProperty("tcp_proxy_profile")
  private TCPProxyProfile tcpProxyProfile = null;

  @JsonProperty("type")
  private String type = "PROTOCOL_TYPE_TCP_PROXY";

  @JsonProperty("udp_fast_path_profile")
  private UDPFastPathProfile udpFastPathProfile = null;

  @JsonProperty("udp_proxy_profile")
  private UDPProxyProfile udpProxyProfile = null;

  
  /**
   * Placeholder for description of property tcp_fast_path_profile of obj type NetworkProfileUnion field type str  type object
   * @return tcpFastPathProfile
  **/
  @ApiModelProperty(value = "Placeholder for description of property tcp_fast_path_profile of obj type NetworkProfileUnion field type str  type object")

  @Valid

 
  @VsoMethod  
  public TCPFastPathProfile getTcpFastPathProfile() {
    return tcpFastPathProfile;
  }
    
  @VsoMethod
  public void setTcpFastPathProfile(TCPFastPathProfile tcpFastPathProfile) {
    this.tcpFastPathProfile = tcpFastPathProfile;
  }

  
  /**
   * Placeholder for description of property tcp_proxy_profile of obj type NetworkProfileUnion field type str  type object
   * @return tcpProxyProfile
  **/
  @ApiModelProperty(value = "Placeholder for description of property tcp_proxy_profile of obj type NetworkProfileUnion field type str  type object")

  @Valid

 
  @VsoMethod  
  public TCPProxyProfile getTcpProxyProfile() {
    return tcpProxyProfile;
  }
    
  @VsoMethod
  public void setTcpProxyProfile(TCPProxyProfile tcpProxyProfile) {
    this.tcpProxyProfile = tcpProxyProfile;
  }

  
  /**
   * Configure one of either proxy or fast path profiles. Enum options - PROTOCOL_TYPE_TCP_PROXY, PROTOCOL_TYPE_TCP_FAST_PATH, PROTOCOL_TYPE_UDP_FAST_PATH, PROTOCOL_TYPE_UDP_PROXY.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Configure one of either proxy or fast path profiles. Enum options - PROTOCOL_TYPE_TCP_PROXY, PROTOCOL_TYPE_TCP_FAST_PATH, PROTOCOL_TYPE_UDP_FAST_PATH, PROTOCOL_TYPE_UDP_PROXY.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Placeholder for description of property udp_fast_path_profile of obj type NetworkProfileUnion field type str  type object
   * @return udpFastPathProfile
  **/
  @ApiModelProperty(value = "Placeholder for description of property udp_fast_path_profile of obj type NetworkProfileUnion field type str  type object")

  @Valid

 
  @VsoMethod  
  public UDPFastPathProfile getUdpFastPathProfile() {
    return udpFastPathProfile;
  }
    
  @VsoMethod
  public void setUdpFastPathProfile(UDPFastPathProfile udpFastPathProfile) {
    this.udpFastPathProfile = udpFastPathProfile;
  }

  
  /**
   * Configure UDP Proxy network profile. Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * @return udpProxyProfile
  **/
  @ApiModelProperty(value = "Configure UDP Proxy network profile. Field introduced in 17.2.8, 18.1.3, 18.2.1.")

  @Valid

 
  @VsoMethod  
  public UDPProxyProfile getUdpProxyProfile() {
    return udpProxyProfile;
  }
    
  @VsoMethod
  public void setUdpProxyProfile(UDPProxyProfile udpProxyProfile) {
    this.udpProxyProfile = udpProxyProfile;
  }

  
  public String getObjectID() {
		return "NetworkProfileUnion";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkProfileUnion networkProfileUnion = (NetworkProfileUnion) o;
    return Objects.equals(this.tcpFastPathProfile, networkProfileUnion.tcpFastPathProfile) &&
        Objects.equals(this.tcpProxyProfile, networkProfileUnion.tcpProxyProfile) &&
        Objects.equals(this.type, networkProfileUnion.type) &&
        Objects.equals(this.udpFastPathProfile, networkProfileUnion.udpFastPathProfile) &&
        Objects.equals(this.udpProxyProfile, networkProfileUnion.udpProxyProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tcpFastPathProfile, tcpProxyProfile, type, udpFastPathProfile, udpProxyProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkProfileUnion {\n");
    
    sb.append("    tcpFastPathProfile: ").append(toIndentedString(tcpFastPathProfile)).append("\n");
    sb.append("    tcpProxyProfile: ").append(toIndentedString(tcpProxyProfile)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    udpFastPathProfile: ").append(toIndentedString(udpFastPathProfile)).append("\n");
    sb.append("    udpProxyProfile: ").append(toIndentedString(udpProxyProfile)).append("\n");
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

