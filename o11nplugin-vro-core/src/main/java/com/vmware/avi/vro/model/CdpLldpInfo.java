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
 * CdpLldpInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CdpLldpInfo")
@VsoFinder(name = Constants.FINDER_VRO_CDPLLDPINFO, idAccessor = "getObjectID()")
@Service
public class CdpLldpInfo extends AviRestResource  {
  @JsonProperty("chassis")
  private String chassis = null;

  @JsonProperty("device")
  private String device = null;

  @JsonProperty("mgmtaddr")
  private String mgmtaddr = null;

  @JsonProperty("port")
  private String port = null;

  @JsonProperty("switch_info_type")
  private String switchInfoType = null;

  @JsonProperty("system_name")
  private String systemName = null;

  
  /**
   * chassis of CdpLldpInfo.
   * @return chassis
  **/
  @ApiModelProperty(value = "chassis of CdpLldpInfo.")


 
  @VsoMethod  
  public String getChassis() {
    return chassis;
  }
    
  @VsoMethod
  public void setChassis(String chassis) {
    this.chassis = chassis;
  }

  
  /**
   * device of CdpLldpInfo.
   * @return device
  **/
  @ApiModelProperty(value = "device of CdpLldpInfo.")


 
  @VsoMethod  
  public String getDevice() {
    return device;
  }
    
  @VsoMethod
  public void setDevice(String device) {
    this.device = device;
  }

  
  /**
   * mgmtaddr of CdpLldpInfo.
   * @return mgmtaddr
  **/
  @ApiModelProperty(value = "mgmtaddr of CdpLldpInfo.")


 
  @VsoMethod  
  public String getMgmtaddr() {
    return mgmtaddr;
  }
    
  @VsoMethod
  public void setMgmtaddr(String mgmtaddr) {
    this.mgmtaddr = mgmtaddr;
  }

  
  /**
   * port of CdpLldpInfo.
   * @return port
  **/
  @ApiModelProperty(value = "port of CdpLldpInfo.")


 
  @VsoMethod  
  public String getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(String port) {
    this.port = port;
  }

  
  /**
   *  Enum options - CDP, LLDP, NOT_APPLICABLE.
   * @return switchInfoType
  **/
  @ApiModelProperty(value = " Enum options - CDP, LLDP, NOT_APPLICABLE.")


 
  @VsoMethod  
  public String getSwitchInfoType() {
    return switchInfoType;
  }
    
  @VsoMethod
  public void setSwitchInfoType(String switchInfoType) {
    this.switchInfoType = switchInfoType;
  }

  
  /**
   * system_name of CdpLldpInfo.
   * @return systemName
  **/
  @ApiModelProperty(value = "system_name of CdpLldpInfo.")


 
  @VsoMethod  
  public String getSystemName() {
    return systemName;
  }
    
  @VsoMethod
  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }

  
  public String getObjectID() {
		return "CdpLldpInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdpLldpInfo cdpLldpInfo = (CdpLldpInfo) o;
    return Objects.equals(this.chassis, cdpLldpInfo.chassis) &&
        Objects.equals(this.device, cdpLldpInfo.device) &&
        Objects.equals(this.mgmtaddr, cdpLldpInfo.mgmtaddr) &&
        Objects.equals(this.port, cdpLldpInfo.port) &&
        Objects.equals(this.switchInfoType, cdpLldpInfo.switchInfoType) &&
        Objects.equals(this.systemName, cdpLldpInfo.systemName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chassis, device, mgmtaddr, port, switchInfoType, systemName);
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

