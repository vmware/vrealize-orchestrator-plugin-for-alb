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
 * ConnectionClearFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ConnectionClearFilter")
@VsoFinder(name = Constants.FINDER_VRO_CONNECTIONCLEARFILTER, idAccessor = "getObjectID()")
@Service
public class ConnectionClearFilter extends AviRestResource  {
  @JsonProperty("ip_addr")
  private String ipAddr = null;

  @JsonProperty("port")
  private Integer port = null;

  
  /**
   * IP address in dotted decimal notation.
   * @return ipAddr
  **/
  @ApiModelProperty(value = "IP address in dotted decimal notation.")


 
  @VsoMethod  
  public String getIpAddr() {
    return ipAddr;
  }
    
  @VsoMethod
  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  
  /**
   * Port number.
   * @return port
  **/
  @ApiModelProperty(value = "Port number.")


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  public String getObjectID() {
		return "ConnectionClearFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionClearFilter connectionClearFilter = (ConnectionClearFilter) o;
    return Objects.equals(this.ipAddr, connectionClearFilter.ipAddr) &&
        Objects.equals(this.port, connectionClearFilter.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddr, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionClearFilter {\n");
    
    sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
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

