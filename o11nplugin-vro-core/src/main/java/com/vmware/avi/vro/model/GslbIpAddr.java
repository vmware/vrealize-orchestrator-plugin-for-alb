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
 * The GslbIpAddr is a POJO class extends AviRestResource that used for creating
 * GslbIpAddr.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbIpAddr")
@VsoFinder(name = Constants.FINDER_VRO_GSLBIPADDR)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbIpAddr extends AviRestResource {
  @JsonProperty("ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddr ip = null;



  /**
   * This is the getter method this will return the attribute value.
   * Public ip address of the pool member.
   * Field introduced in 17.1.2.
   * @return ip
   */
  @VsoMethod
  public IpAddr getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Public ip address of the pool member.
   * Field introduced in 17.1.2.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbIpAddr objGslbIpAddr = (GslbIpAddr) o;
  return   Objects.equals(this.ip, objGslbIpAddr.ip);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbIpAddr {\n");
      sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
