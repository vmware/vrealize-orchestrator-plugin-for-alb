package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
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
 * IpAddrPort
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IpAddrPort")
@VsoFinder(name = Constants.FINDER_VRO_IPADDRPORT, idAccessor = "getObjectID()")
@Service
public class IpAddrPort extends AviRestResource  {
  @JsonProperty("hostname")
  private String hostname = null;

  @JsonProperty("ip")
  private IpAddr ip = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("port")
  private Integer port = null;

  
  /**
   * Hostname of server. One of IP address or hostname should be set.
   * @return hostname
  **/
  @ApiModelProperty(value = "Hostname of server. One of IP address or hostname should be set.")


 
  @VsoMethod  
  public String getHostname() {
    return hostname;
  }
    
  @VsoMethod
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  
  /**
   * IP Address of host. One of IP address or hostname should be set.
   * @return ip
  **/
  @ApiModelProperty(value = "IP Address of host. One of IP address or hostname should be set.")

  @Valid

 
  @VsoMethod  
  public IpAddr getIp() {
    return ip;
  }
    
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the object.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Port number of server. Allowed values are 1-65535.
   * @return port
  **/
  @ApiModelProperty(required = true, value = "Port number of server. Allowed values are 1-65535.")
  @NotNull


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  public String getObjectID() {
		return "IpAddrPort";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddrPort ipAddrPort = (IpAddrPort) o;
    return Objects.equals(this.hostname, ipAddrPort.hostname) &&
        Objects.equals(this.ip, ipAddrPort.ip) &&
        Objects.equals(this.name, ipAddrPort.name) &&
        Objects.equals(this.port, ipAddrPort.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, ip, name, port);
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

