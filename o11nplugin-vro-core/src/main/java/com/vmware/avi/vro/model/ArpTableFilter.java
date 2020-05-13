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
 * ArpTableFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ArpTableFilter")
@VsoFinder(name = Constants.FINDER_VRO_ARPTABLEFILTER, idAccessor = "getObjectID()")
@Service
public class ArpTableFilter extends AviRestResource  {
  @JsonProperty("ip_address")
  private IpAddr ipAddress = null;

  
  /**
   * IP address.
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP address.")

  @Valid

 
  @VsoMethod  
  public IpAddr getIpAddress() {
    return ipAddress;
  }
    
  @VsoMethod
  public void setIpAddress(IpAddr ipAddress) {
    this.ipAddress = ipAddress;
  }

  
  public String getObjectID() {
		return "ArpTableFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArpTableFilter arpTableFilter = (ArpTableFilter) o;
    return Objects.equals(this.ipAddress, arpTableFilter.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArpTableFilter {\n");
    
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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

