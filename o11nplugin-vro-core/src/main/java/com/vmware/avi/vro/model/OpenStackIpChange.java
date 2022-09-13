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
 * The OpenStackIpChange is a POJO class extends AviRestResource that used for creating
 * OpenStackIpChange.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OpenStackIpChange")
@VsoFinder(name = Constants.FINDER_VRO_OPENSTACKIPCHANGE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OpenStackIpChange extends AviRestResource {
    @JsonProperty("error_string")
    @JsonInclude(Include.NON_NULL)
    private String errorString = null;

    @JsonProperty("ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr ip = null;

    @JsonProperty("mac_addr")
    @JsonInclude(Include.NON_NULL)
    private String macAddr = null;

    @JsonProperty("port_uuid")
    @JsonInclude(Include.NON_NULL)
    private String portUuid = null;

    @JsonProperty("se_vm_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seVmUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ip
   */
  @VsoMethod
  public IpAddr getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return macAddr
   */
  @VsoMethod
  public String getMacAddr() {
    return macAddr;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param macAddr set the macAddr.
   */
  @VsoMethod
  public void setMacAddr(String  macAddr) {
    this.macAddr = macAddr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return portUuid
   */
  @VsoMethod
  public String getPortUuid() {
    return portUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param portUuid set the portUuid.
   */
  @VsoMethod
  public void setPortUuid(String  portUuid) {
    this.portUuid = portUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seVmUuid
   */
  @VsoMethod
  public String getSeVmUuid() {
    return seVmUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seVmUuid set the seVmUuid.
   */
  @VsoMethod
  public void setSeVmUuid(String  seVmUuid) {
    this.seVmUuid = seVmUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OpenStackIpChange objOpenStackIpChange = (OpenStackIpChange) o;
  return   Objects.equals(this.ip, objOpenStackIpChange.ip)&&
  Objects.equals(this.seVmUuid, objOpenStackIpChange.seVmUuid)&&
  Objects.equals(this.portUuid, objOpenStackIpChange.portUuid)&&
  Objects.equals(this.macAddr, objOpenStackIpChange.macAddr)&&
  Objects.equals(this.errorString, objOpenStackIpChange.errorString);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OpenStackIpChange {\n");
      sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    macAddr: ").append(toIndentedString(macAddr)).append("\n");
        sb.append("    portUuid: ").append(toIndentedString(portUuid)).append("\n");
        sb.append("    seVmUuid: ").append(toIndentedString(seVmUuid)).append("\n");
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

