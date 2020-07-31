package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The IpAddrPort is a POJO class extends AviRestResource that used for creating
 * IpAddrPort.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IpAddrPort")
@VsoFinder(name = Constants.FINDER_VRO_IPADDRPORT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IpAddrPort extends AviRestResource {
  @JsonProperty("hostname")
  @JsonInclude(Include.NON_NULL)
  private String hostname = null;

  @JsonProperty("ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddr ip = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("port")
  @JsonInclude(Include.NON_NULL)
  private Integer port = null;



  /**
   * This is the getter method this will return the attribute value.
   * Hostname of server.
   * One of ip address or hostname should be set.
   * @return hostname
   */
  @VsoMethod
  public String getHostname() {
    return hostname;
  }

  /**
   * This is the setter method to the attribute.
   * Hostname of server.
   * One of ip address or hostname should be set.
   * @param hostname set the hostname.
   */
  @VsoMethod
  public void setHostname(String  hostname) {
    this.hostname = hostname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip address of host.
   * One of ip address or hostname should be set.
   * @return ip
   */
  @VsoMethod
  public IpAddr getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address of host.
   * One of ip address or hostname should be set.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Port number of server.
   * Allowed values are 1-65535.
   * @return port
   */
  @VsoMethod
  public Integer getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Port number of server.
   * Allowed values are 1-65535.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(Integer  port) {
    this.port = port;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  IpAddrPort objIpAddrPort = (IpAddrPort) o;
  return   Objects.equals(this.ip, objIpAddrPort.ip)&&
  Objects.equals(this.port, objIpAddrPort.port)&&
  Objects.equals(this.hostname, objIpAddrPort.hostname)&&
  Objects.equals(this.name, objIpAddrPort.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IpAddrPort {\n");
      sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

