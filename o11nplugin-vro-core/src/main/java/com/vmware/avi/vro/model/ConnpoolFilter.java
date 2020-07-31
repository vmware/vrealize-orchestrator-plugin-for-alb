package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ConnpoolFilter is a POJO class extends AviRestResource that used for creating
 * ConnpoolFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ConnpoolFilter")
@VsoFinder(name = Constants.FINDER_VRO_CONNPOOLFILTER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ConnpoolFilter extends AviRestResource {
  @JsonProperty("ip_addr")
  @JsonInclude(Include.NON_NULL)
  private String ipAddr = null;

  @JsonProperty("ip_mask")
  @JsonInclude(Include.NON_NULL)
  private String ipMask = null;

  @JsonProperty("port")
  @JsonInclude(Include.NON_NULL)
  private Integer port = null;

  @JsonProperty("type")
  @JsonInclude(Include.NON_NULL)
  private String type = null;



  /**
   * This is the getter method this will return the attribute value.
   * Backend or se ip address.
   * @return ipAddr
   */
  @VsoMethod
  public String getIpAddr() {
    return ipAddr;
  }

  /**
   * This is the setter method to the attribute.
   * Backend or se ip address.
   * @param ipAddr set the ipAddr.
   */
  @VsoMethod
  public void setIpAddr(String  ipAddr) {
    this.ipAddr = ipAddr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Backend or se ip address mask.
   * @return ipMask
   */
  @VsoMethod
  public String getIpMask() {
    return ipMask;
  }

  /**
   * This is the setter method to the attribute.
   * Backend or se ip address mask.
   * @param ipMask set the ipMask.
   */
  @VsoMethod
  public void setIpMask(String  ipMask) {
    this.ipMask = ipMask;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Backend or se port.
   * @return port
   */
  @VsoMethod
  public Integer getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Backend or se port.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(Integer  port) {
    this.port = port;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cache type.
   * Enum options - CP_ALL, CP_FREE, CP_BIND, CP_CACHED.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Cache type.
   * Enum options - CP_ALL, CP_FREE, CP_BIND, CP_CACHED.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ConnpoolFilter objConnpoolFilter = (ConnpoolFilter) o;
  return   Objects.equals(this.type, objConnpoolFilter.type)&&
  Objects.equals(this.ipAddr, objConnpoolFilter.ipAddr)&&
  Objects.equals(this.ipMask, objConnpoolFilter.ipMask)&&
  Objects.equals(this.port, objConnpoolFilter.port);
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

