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
 * VIGuestvNicIPAddr
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIGuestvNicIPAddr")
@VsoFinder(name = Constants.FINDER_VRO_VIGUESTVNICIPADDR, idAccessor = "getObjectID()")
@Service
public class VIGuestvNicIPAddr extends AviRestResource  {
  @JsonProperty("ip_addr")
  private String ipAddr = null;

  @JsonProperty("mask")
  private Integer mask = null;

  
  /**
   * ip_addr of VIGuestvNicIPAddr.
   * @return ipAddr
  **/
  @ApiModelProperty(required = true, value = "ip_addr of VIGuestvNicIPAddr.")
  @NotNull


 
  @VsoMethod  
  public String getIpAddr() {
    return ipAddr;
  }
    
  @VsoMethod
  public void setIpAddr(String ipAddr) {
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
		return "VIGuestvNicIPAddr";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIGuestvNicIPAddr viGuestvNicIPAddr = (VIGuestvNicIPAddr) o;
    return Objects.equals(this.ipAddr, viGuestvNicIPAddr.ipAddr) &&
        Objects.equals(this.mask, viGuestvNicIPAddr.mask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddr, mask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIGuestvNicIPAddr {\n");
    
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

