package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.SnmpV3UserParams;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SnmpTrapServer is a POJO class extends AviRestResource that used for creating
 * SnmpTrapServer.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SnmpTrapServer")
@VsoFinder(name = Constants.FINDER_VRO_SNMPTRAPSERVER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SnmpTrapServer extends AviRestResource {
    @JsonProperty("community")
    @JsonInclude(Include.NON_NULL)
    private String community = null;

    @JsonProperty("ip_addr")
    @JsonInclude(Include.NON_NULL)
    private IpAddr ipAddr = null;

    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private Integer port = 162;

    @JsonProperty("user")
    @JsonInclude(Include.NON_NULL)
    private SnmpV3UserParams user = null;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private String version = "SNMP_VER2";



  /**
   * This is the getter method this will return the attribute value.
   * The community string to communicate with the trap server.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return community
   */
  @VsoMethod
  public String getCommunity() {
    return community;
  }

  /**
   * This is the setter method to the attribute.
   * The community string to communicate with the trap server.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param community set the community.
   */
  @VsoMethod
  public void setCommunity(String  community) {
    this.community = community;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip(v4/v6) address or fqdn of the snmp trap destination.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddr
   */
  @VsoMethod
  public IpAddr getIpAddr() {
    return ipAddr;
  }

  /**
   * This is the setter method to the attribute.
   * Ip(v4/v6) address or fqdn of the snmp trap destination.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipAddr set the ipAddr.
   */
  @VsoMethod
  public void setIpAddr(IpAddr ipAddr) {
    this.ipAddr = ipAddr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The udp port of the trap server.
   * Field introduced in 16.5.4,17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 162.
   * @return port
   */
  @VsoMethod
  public Integer getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * The udp port of the trap server.
   * Field introduced in 16.5.4,17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 162.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(Integer  port) {
    this.port = port;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Snmp version 3 configuration.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return user
   */
  @VsoMethod
  public SnmpV3UserParams getUser() {
    return user;
  }

  /**
   * This is the setter method to the attribute.
   * Snmp version 3 configuration.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param user set the user.
   */
  @VsoMethod
  public void setUser(SnmpV3UserParams user) {
    this.user = user;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Snmp version support.
   * V2 or v3.
   * Enum options - SNMP_VER2, SNMP_VER3.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SNMP_VER2".
   * @return version
   */
  @VsoMethod
  public String getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Snmp version support.
   * V2 or v3.
   * Enum options - SNMP_VER2, SNMP_VER3.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SNMP_VER2".
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(String  version) {
    this.version = version;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SnmpTrapServer objSnmpTrapServer = (SnmpTrapServer) o;
  return   Objects.equals(this.ipAddr, objSnmpTrapServer.ipAddr)&&
  Objects.equals(this.community, objSnmpTrapServer.community)&&
  Objects.equals(this.version, objSnmpTrapServer.version)&&
  Objects.equals(this.user, objSnmpTrapServer.user)&&
  Objects.equals(this.port, objSnmpTrapServer.port);
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

