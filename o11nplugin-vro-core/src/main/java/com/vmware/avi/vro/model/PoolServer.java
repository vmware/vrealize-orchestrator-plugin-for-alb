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
 * PoolServer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "PoolServer")
@VsoFinder(name = Constants.FINDER_VRO_POOLSERVER, idAccessor = "getObjectID()")
@Service
public class PoolServer extends AviRestResource  {
  @JsonProperty("hostname")
  private String hostname = null;

  @JsonProperty("ip")
  private IpAddr ip = null;

  @JsonProperty("port")
  private Integer port = null;

  
  /**
   * DNS resolvable name of the server.  May be used in place of the IP address.
   * @return hostname
  **/
  @ApiModelProperty(value = "DNS resolvable name of the server.  May be used in place of the IP address.")


 
  @VsoMethod  
  public String getHostname() {
    return hostname;
  }
    
  @VsoMethod
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  
  /**
   * IP address of the server in the poool.
   * @return ip
  **/
  @ApiModelProperty(required = true, value = "IP address of the server in the poool.")
  @NotNull

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
   * Port of the pool server listening for HTTP/HTTPS. Default value is the default port in the pool. Allowed values are 1-65535.
   * @return port
  **/
  @ApiModelProperty(value = "Port of the pool server listening for HTTP/HTTPS. Default value is the default port in the pool. Allowed values are 1-65535.")


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  public String getObjectID() {
		return "PoolServer";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolServer poolServer = (PoolServer) o;
    return Objects.equals(this.hostname, poolServer.hostname) &&
        Objects.equals(this.ip, poolServer.ip) &&
        Objects.equals(this.port, poolServer.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, ip, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolServer {\n");
    
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

