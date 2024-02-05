package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The vNICNetwork is a POJO class extends AviRestResource that used for creating
 * vNICNetwork.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "vNICNetwork")
@VsoFinder(name = Constants.FINDER_VRO_VNICNETWORK)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class vNICNetwork extends AviRestResource {
    @JsonProperty("ctlr_alloc")
    @JsonInclude(Include.NON_NULL)
    private Boolean ctlrAlloc = false;

    @JsonProperty("ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddrPrefix ip;

    @JsonProperty("mode")
    @JsonInclude(Include.NON_NULL)
    private String mode = "DHCP";



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return ctlrAlloc
   */
  @VsoMethod
  public Boolean getCtlrAlloc() {
    return ctlrAlloc;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param ctlrAlloc set the ctlrAlloc.
   */
  @VsoMethod
  public void setCtlrAlloc(Boolean  ctlrAlloc) {
    this.ctlrAlloc = ctlrAlloc;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ip
   */
  @VsoMethod
  public IpAddrPrefix getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(IpAddrPrefix ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - DHCP, STATIC, VIP, DOCKER_HOST.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "DHCP".
   * @return mode
   */
  @VsoMethod
  public String getMode() {
    return mode;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - DHCP, STATIC, VIP, DOCKER_HOST.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "DHCP".
   * @param mode set the mode.
   */
  @VsoMethod
  public void setMode(String  mode) {
    this.mode = mode;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  vNICNetwork objvNICNetwork = (vNICNetwork) o;
  return   Objects.equals(this.ip, objvNICNetwork.ip)&&
  Objects.equals(this.ctlrAlloc, objvNICNetwork.ctlrAlloc)&&
  Objects.equals(this.mode, objvNICNetwork.mode);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class vNICNetwork {\n");
      sb.append("    ctlrAlloc: ").append(toIndentedString(ctlrAlloc)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

