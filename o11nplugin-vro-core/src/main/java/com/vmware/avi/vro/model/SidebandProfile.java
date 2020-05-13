package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * SidebandProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SidebandProfile")
@VsoFinder(name = Constants.FINDER_VRO_SIDEBANDPROFILE, idAccessor = "getObjectID()")
@Service
public class SidebandProfile extends AviRestResource  {
  @JsonProperty("ip")
  @Valid
  private List<IpAddr> ip = null;

  @JsonProperty("sideband_max_request_body_size")
  private Integer sidebandMaxRequestBodySize = 1024;

  
  public SidebandProfile addIpItem(IpAddr ipItem) {
    if (this.ip == null) {
      this.ip = new ArrayList<IpAddr>();
    }
    this.ip.add(ipItem);
    return this;
  }
  
  /**
   * IP Address of the sideband server.
   * @return ip
  **/
  @ApiModelProperty(value = "IP Address of the sideband server.")

  @Valid

 
  @VsoMethod  
  public List<IpAddr> getIp() {
    return ip;
  }
    
  @VsoMethod
  public void setIp(List<IpAddr> ip) {
    this.ip = ip;
  }

  
  /**
   * Maximum size of the request body that will be sent on the sideband. Allowed values are 0-16384.
   * @return sidebandMaxRequestBodySize
  **/
  @ApiModelProperty(value = "Maximum size of the request body that will be sent on the sideband. Allowed values are 0-16384.")


 
  @VsoMethod  
  public Integer getSidebandMaxRequestBodySize() {
    return sidebandMaxRequestBodySize;
  }
    
  @VsoMethod
  public void setSidebandMaxRequestBodySize(Integer sidebandMaxRequestBodySize) {
    this.sidebandMaxRequestBodySize = sidebandMaxRequestBodySize;
  }

  
  public String getObjectID() {
		return "SidebandProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SidebandProfile sidebandProfile = (SidebandProfile) o;
    return Objects.equals(this.ip, sidebandProfile.ip) &&
        Objects.equals(this.sidebandMaxRequestBodySize, sidebandProfile.sidebandMaxRequestBodySize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, sidebandMaxRequestBodySize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SidebandProfile {\n");
    
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    sidebandMaxRequestBodySize: ").append(toIndentedString(sidebandMaxRequestBodySize)).append("\n");
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

