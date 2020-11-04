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
 * The CdpLldpInfo is a POJO class extends AviRestResource that used for creating
 * CdpLldpInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CdpLldpInfo")
@VsoFinder(name = Constants.FINDER_VRO_CDPLLDPINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CdpLldpInfo extends AviRestResource {
    @JsonProperty("chassis")
    @JsonInclude(Include.NON_NULL)
    private String chassis = null;

    @JsonProperty("device")
    @JsonInclude(Include.NON_NULL)
    private String device = null;

    @JsonProperty("mgmtaddr")
    @JsonInclude(Include.NON_NULL)
    private String mgmtaddr = null;

    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private String port = null;

    @JsonProperty("switch_info_type")
    @JsonInclude(Include.NON_NULL)
    private String switchInfoType = null;

    @JsonProperty("system_name")
    @JsonInclude(Include.NON_NULL)
    private String systemName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property chassis of obj type cdplldpinfo field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return chassis
   */
  @VsoMethod
  public String getChassis() {
    return chassis;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property chassis of obj type cdplldpinfo field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param chassis set the chassis.
   */
  @VsoMethod
  public void setChassis(String  chassis) {
    this.chassis = chassis;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property device of obj type cdplldpinfo field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return device
   */
  @VsoMethod
  public String getDevice() {
    return device;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property device of obj type cdplldpinfo field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param device set the device.
   */
  @VsoMethod
  public void setDevice(String  device) {
    this.device = device;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property mgmtaddr of obj type cdplldpinfo field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mgmtaddr
   */
  @VsoMethod
  public String getMgmtaddr() {
    return mgmtaddr;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property mgmtaddr of obj type cdplldpinfo field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mgmtaddr set the mgmtaddr.
   */
  @VsoMethod
  public void setMgmtaddr(String  mgmtaddr) {
    this.mgmtaddr = mgmtaddr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property port of obj type cdplldpinfo field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return port
   */
  @VsoMethod
  public String getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property port of obj type cdplldpinfo field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(String  port) {
    this.port = port;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - CDP, LLDP, NOT_APPLICABLE.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return switchInfoType
   */
  @VsoMethod
  public String getSwitchInfoType() {
    return switchInfoType;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - CDP, LLDP, NOT_APPLICABLE.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param switchInfoType set the switchInfoType.
   */
  @VsoMethod
  public void setSwitchInfoType(String  switchInfoType) {
    this.switchInfoType = switchInfoType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property system_name of obj type cdplldpinfo field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return systemName
   */
  @VsoMethod
  public String getSystemName() {
    return systemName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property system_name of obj type cdplldpinfo field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param systemName set the systemName.
   */
  @VsoMethod
  public void setSystemName(String  systemName) {
    this.systemName = systemName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CdpLldpInfo objCdpLldpInfo = (CdpLldpInfo) o;
  return   Objects.equals(this.switchInfoType, objCdpLldpInfo.switchInfoType)&&
  Objects.equals(this.device, objCdpLldpInfo.device)&&
  Objects.equals(this.chassis, objCdpLldpInfo.chassis)&&
  Objects.equals(this.port, objCdpLldpInfo.port)&&
  Objects.equals(this.mgmtaddr, objCdpLldpInfo.mgmtaddr)&&
  Objects.equals(this.systemName, objCdpLldpInfo.systemName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CdpLldpInfo {\n");
      sb.append("    chassis: ").append(toIndentedString(chassis)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    mgmtaddr: ").append(toIndentedString(mgmtaddr)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    switchInfoType: ").append(toIndentedString(switchInfoType)).append("\n");
        sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
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

