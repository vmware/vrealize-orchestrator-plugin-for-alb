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
 * The IpAddr is a POJO class extends AviRestResource that used for creating
 * IpAddr.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IpAddr")
@VsoFinder(name = Constants.FINDER_VRO_IPADDR)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IpAddr extends AviRestResource {
  @JsonProperty("addr")
  @JsonInclude(Include.NON_NULL)
  private String addr = null;

  @JsonProperty("type")
  @JsonInclude(Include.NON_NULL)
  private String type = null;



  /**
   * This is the getter method this will return the attribute value.
   * Ip address.
   * @return addr
   */
  @VsoMethod
  public String getAddr() {
    return addr;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address.
   * @param addr set the addr.
   */
  @VsoMethod
  public void setAddr(String  addr) {
    this.addr = addr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - V4, DNS, V6.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - V4, DNS, V6.
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
  IpAddr objIpAddr = (IpAddr) o;
  return   Objects.equals(this.addr, objIpAddr.addr)&&
  Objects.equals(this.type, objIpAddr.type);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IpAddr {\n");
      sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
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

