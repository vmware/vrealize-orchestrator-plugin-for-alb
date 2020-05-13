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
 * IpAddr
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IpAddr")
@VsoFinder(name = Constants.FINDER_VRO_IPADDR, idAccessor = "getObjectID()")
@Service
public class IpAddr extends AviRestResource  {
  @JsonProperty("addr")
  private String addr = null;

  @JsonProperty("type")
  private String type = null;

  
  /**
   * IP address.
   * @return addr
  **/
  @ApiModelProperty(required = true, value = "IP address.")
  @NotNull


 
  @VsoMethod  
  public String getAddr() {
    return addr;
  }
    
  @VsoMethod
  public void setAddr(String addr) {
    this.addr = addr;
  }

  
  /**
   *  Enum options - V4, DNS, V6.
   * @return type
  **/
  @ApiModelProperty(required = true, value = " Enum options - V4, DNS, V6.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "IpAddr";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddr ipAddr = (IpAddr) o;
    return Objects.equals(this.addr, ipAddr.addr) &&
        Objects.equals(this.type, ipAddr.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addr, type);
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

