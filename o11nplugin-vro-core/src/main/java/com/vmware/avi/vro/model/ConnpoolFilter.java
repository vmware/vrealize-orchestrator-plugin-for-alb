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
 * ConnpoolFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ConnpoolFilter")
@VsoFinder(name = Constants.FINDER_VRO_CONNPOOLFILTER, idAccessor = "getObjectID()")
@Service
public class ConnpoolFilter extends AviRestResource  {
  @JsonProperty("ip_addr")
  private String ipAddr = null;

  @JsonProperty("ip_mask")
  private String ipMask = null;

  @JsonProperty("port")
  private Integer port = null;

  @JsonProperty("type")
  private String type = null;

  
  /**
   * Backend or SE IP address.
   * @return ipAddr
  **/
  @ApiModelProperty(value = "Backend or SE IP address.")


 
  @VsoMethod  
  public String getIpAddr() {
    return ipAddr;
  }
    
  @VsoMethod
  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  
  /**
   * Backend or SE IP address mask.
   * @return ipMask
  **/
  @ApiModelProperty(value = "Backend or SE IP address mask.")


 
  @VsoMethod  
  public String getIpMask() {
    return ipMask;
  }
    
  @VsoMethod
  public void setIpMask(String ipMask) {
    this.ipMask = ipMask;
  }

  
  /**
   * Backend or SE port.
   * @return port
  **/
  @ApiModelProperty(value = "Backend or SE port.")


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  /**
   * cache type. Enum options - CP_ALL, CP_FREE, CP_BIND, CP_CACHED.
   * @return type
  **/
  @ApiModelProperty(value = "cache type. Enum options - CP_ALL, CP_FREE, CP_BIND, CP_CACHED.")


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "ConnpoolFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnpoolFilter connpoolFilter = (ConnpoolFilter) o;
    return Objects.equals(this.ipAddr, connpoolFilter.ipAddr) &&
        Objects.equals(this.ipMask, connpoolFilter.ipMask) &&
        Objects.equals(this.port, connpoolFilter.port) &&
        Objects.equals(this.type, connpoolFilter.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddr, ipMask, port, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnpoolFilter {\n");
    
    sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
    sb.append("    ipMask: ").append(toIndentedString(ipMask)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

