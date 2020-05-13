package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.SnmpV3UserParams;
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
 * SnmpTrapServer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SnmpTrapServer")
@VsoFinder(name = Constants.FINDER_VRO_SNMPTRAPSERVER, idAccessor = "getObjectID()")
@Service
public class SnmpTrapServer extends AviRestResource  {
  @JsonProperty("community")
  private String community = null;

  @JsonProperty("ip_addr")
  private IpAddr ipAddr = null;

  @JsonProperty("port")
  private Integer port = 162;

  @JsonProperty("user")
  private SnmpV3UserParams user = null;

  @JsonProperty("version")
  private String version = "SNMP_VER2";

  
  /**
   * The community string to communicate with the trap server.
   * @return community
  **/
  @ApiModelProperty(value = "The community string to communicate with the trap server.")


 
  @VsoMethod  
  public String getCommunity() {
    return community;
  }
    
  @VsoMethod
  public void setCommunity(String community) {
    this.community = community;
  }

  
  /**
   * IP Address of the SNMP trap destination.
   * @return ipAddr
  **/
  @ApiModelProperty(required = true, value = "IP Address of the SNMP trap destination.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddr getIpAddr() {
    return ipAddr;
  }
    
  @VsoMethod
  public void setIpAddr(IpAddr ipAddr) {
    this.ipAddr = ipAddr;
  }

  
  /**
   * The UDP port of the trap server. Field introduced in 16.5.4,17.2.5.
   * @return port
  **/
  @ApiModelProperty(value = "The UDP port of the trap server. Field introduced in 16.5.4,17.2.5.")


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  /**
   * SNMP version 3 configuration. Field introduced in 17.2.3.
   * @return user
  **/
  @ApiModelProperty(value = "SNMP version 3 configuration. Field introduced in 17.2.3.")

  @Valid

 
  @VsoMethod  
  public SnmpV3UserParams getUser() {
    return user;
  }
    
  @VsoMethod
  public void setUser(SnmpV3UserParams user) {
    this.user = user;
  }

  
  /**
   * SNMP version support. V2 or V3. Enum options - SNMP_VER2, SNMP_VER3. Field introduced in 17.2.3.
   * @return version
  **/
  @ApiModelProperty(value = "SNMP version support. V2 or V3. Enum options - SNMP_VER2, SNMP_VER3. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getVersion() {
    return version;
  }
    
  @VsoMethod
  public void setVersion(String version) {
    this.version = version;
  }

  
  public String getObjectID() {
		return "SnmpTrapServer";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnmpTrapServer snmpTrapServer = (SnmpTrapServer) o;
    return Objects.equals(this.community, snmpTrapServer.community) &&
        Objects.equals(this.ipAddr, snmpTrapServer.ipAddr) &&
        Objects.equals(this.port, snmpTrapServer.port) &&
        Objects.equals(this.user, snmpTrapServer.user) &&
        Objects.equals(this.version, snmpTrapServer.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(community, ipAddr, port, user, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnmpTrapServer {\n");
    
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
    sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

