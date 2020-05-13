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
 * IpAllocInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IpAllocInfo")
@VsoFinder(name = Constants.FINDER_VRO_IPALLOCINFO, idAccessor = "getObjectID()")
@Service
public class IpAllocInfo extends AviRestResource  {
  @JsonProperty("ip")
  private IpAddr ip = null;

  @JsonProperty("mac")
  private String mac = null;

  @JsonProperty("se_uuid")
  private String seUuid = null;

  
  /**
   * Placeholder for description of property ip of obj type IpAllocInfo field type str  type object
   * @return ip
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property ip of obj type IpAllocInfo field type str  type object")
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
   * mac of IpAllocInfo.
   * @return mac
  **/
  @ApiModelProperty(required = true, value = "mac of IpAllocInfo.")
  @NotNull


 
  @VsoMethod  
  public String getMac() {
    return mac;
  }
    
  @VsoMethod
  public void setMac(String mac) {
    this.mac = mac;
  }

  
  /**
   * Unique object identifier of se.
   * @return seUuid
  **/
  @ApiModelProperty(required = true, value = "Unique object identifier of se.")
  @NotNull


 
  @VsoMethod  
  public String getSeUuid() {
    return seUuid;
  }
    
  @VsoMethod
  public void setSeUuid(String seUuid) {
    this.seUuid = seUuid;
  }

  
  public String getObjectID() {
		return "IpAllocInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAllocInfo ipAllocInfo = (IpAllocInfo) o;
    return Objects.equals(this.ip, ipAllocInfo.ip) &&
        Objects.equals(this.mac, ipAllocInfo.mac) &&
        Objects.equals(this.seUuid, ipAllocInfo.seUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, mac, seUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAllocInfo {\n");
    
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
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

