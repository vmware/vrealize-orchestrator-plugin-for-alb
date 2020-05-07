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
 * DnsAAAARdata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "DnsAAAARdata")
@VsoFinder(name = Constants.FINDER_VRO_DNSAAAARDATA, idAccessor = "getObjectID()")
@Service
public class DnsAAAARdata extends AviRestResource  {
  @JsonProperty("ip6_address")
  private IpAddr ip6Address = null;

  
  /**
   * IPv6 address for FQDN. Field introduced in 18.1.1.
   * @return ip6Address
  **/
  @ApiModelProperty(required = true, value = "IPv6 address for FQDN. Field introduced in 18.1.1.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddr getIp6Address() {
    return ip6Address;
  }
    
  @VsoMethod
  public void setIp6Address(IpAddr ip6Address) {
    this.ip6Address = ip6Address;
  }

  
  public String getObjectID() {
		return "DnsAAAARdata";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsAAAARdata dnsAAAARdata = (DnsAAAARdata) o;
    return Objects.equals(this.ip6Address, dnsAAAARdata.ip6Address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip6Address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsAAAARdata {\n");
    
    sb.append("    ip6Address: ").append(toIndentedString(ip6Address)).append("\n");
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

