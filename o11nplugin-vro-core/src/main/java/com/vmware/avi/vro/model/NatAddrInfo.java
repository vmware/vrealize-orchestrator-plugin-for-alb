package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrRange;
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
 * NatAddrInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NatAddrInfo")
@VsoFinder(name = Constants.FINDER_VRO_NATADDRINFO, idAccessor = "getObjectID()")
@Service
public class NatAddrInfo extends AviRestResource  {
  @JsonProperty("nat_ip")
  private IpAddr natIp = null;

  @JsonProperty("nat_ip_range")
  private IpAddrRange natIpRange = null;

  
  /**
   * Nat IP address. Field introduced in 18.2.3.
   * @return natIp
  **/
  @ApiModelProperty(value = "Nat IP address. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public IpAddr getNatIp() {
    return natIp;
  }
    
  @VsoMethod
  public void setNatIp(IpAddr natIp) {
    this.natIp = natIp;
  }

  
  /**
   * Nat IP address range. Field introduced in 18.2.3.
   * @return natIpRange
  **/
  @ApiModelProperty(value = "Nat IP address range. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public IpAddrRange getNatIpRange() {
    return natIpRange;
  }
    
  @VsoMethod
  public void setNatIpRange(IpAddrRange natIpRange) {
    this.natIpRange = natIpRange;
  }

  
  public String getObjectID() {
		return "NatAddrInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NatAddrInfo natAddrInfo = (NatAddrInfo) o;
    return Objects.equals(this.natIp, natAddrInfo.natIp) &&
        Objects.equals(this.natIpRange, natAddrInfo.natIpRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(natIp, natIpRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatAddrInfo {\n");
    
    sb.append("    natIp: ").append(toIndentedString(natIp)).append("\n");
    sb.append("    natIpRange: ").append(toIndentedString(natIpRange)).append("\n");
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

