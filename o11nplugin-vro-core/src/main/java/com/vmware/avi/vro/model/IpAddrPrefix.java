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
 * IpAddrPrefix
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "IpAddrPrefix")
@VsoFinder(name = Constants.FINDER_VRO_IPADDRPREFIX, idAccessor = "getObjectID()")
@Service
public class IpAddrPrefix extends AviRestResource  {
  @JsonProperty("ip_addr")
  private IpAddr ipAddr = null;

  @JsonProperty("mask")
  private Integer mask = null;

  
  /**
   * Placeholder for description of property ip_addr of obj type IpAddrPrefix field type str  type object
   * @return ipAddr
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property ip_addr of obj type IpAddrPrefix field type str  type object")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddr getIpAddr() {
    return ipAddr;
  }
    
  @VsoMethod
  public void setIpAddr(IpAddr ipAddr) {
    this.ipAddr = ipAddr;
  }

  
  /**
   * Number of mask.
   * @return mask
  **/
  @ApiModelProperty(required = true, value = "Number of mask.")
  @NotNull


 
  @VsoMethod  
  public Integer getMask() {
    return mask;
  }
    
  @VsoMethod
  public void setMask(Integer mask) {
    this.mask = mask;
  }

  
  public String getObjectID() {
		return "IpAddrPrefix";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddrPrefix ipAddrPrefix = (IpAddrPrefix) o;
    return Objects.equals(this.ipAddr, ipAddrPrefix.ipAddr) &&
        Objects.equals(this.mask, ipAddrPrefix.mask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddr, mask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddrPrefix {\n");
    
    sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
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

