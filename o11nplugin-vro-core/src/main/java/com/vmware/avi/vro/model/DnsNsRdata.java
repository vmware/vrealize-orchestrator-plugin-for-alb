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
 * DnsNsRdata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "DnsNsRdata")
@VsoFinder(name = Constants.FINDER_VRO_DNSNSRDATA, idAccessor = "getObjectID()")
@Service
public class DnsNsRdata extends AviRestResource  {
  @JsonProperty("ip6_address")
  private IpAddr ip6Address = null;

  @JsonProperty("ip_address")
  private IpAddr ipAddress = null;

  @JsonProperty("nsname")
  private String nsname = null;

  
  /**
   * IPv6 address for Name Server. Field introduced in 18.1.1.
   * @return ip6Address
  **/
  @ApiModelProperty(value = "IPv6 address for Name Server. Field introduced in 18.1.1.")

  @Valid

 
  @VsoMethod  
  public IpAddr getIp6Address() {
    return ip6Address;
  }
    
  @VsoMethod
  public void setIp6Address(IpAddr ip6Address) {
    this.ip6Address = ip6Address;
  }

  
  /**
   * IP address for Name Server. Field introduced in 17.1.1.
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP address for Name Server. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public IpAddr getIpAddress() {
    return ipAddress;
  }
    
  @VsoMethod
  public void setIpAddress(IpAddr ipAddress) {
    this.ipAddress = ipAddress;
  }

  
  /**
   * Name Server name. Field introduced in 17.1.1.
   * @return nsname
  **/
  @ApiModelProperty(required = true, value = "Name Server name. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getNsname() {
    return nsname;
  }
    
  @VsoMethod
  public void setNsname(String nsname) {
    this.nsname = nsname;
  }

  
  public String getObjectID() {
		return "DnsNsRdata";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsNsRdata dnsNsRdata = (DnsNsRdata) o;
    return Objects.equals(this.ip6Address, dnsNsRdata.ip6Address) &&
        Objects.equals(this.ipAddress, dnsNsRdata.ipAddress) &&
        Objects.equals(this.nsname, dnsNsRdata.nsname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip6Address, ipAddress, nsname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsNsRdata {\n");
    
    sb.append("    ip6Address: ").append(toIndentedString(ip6Address)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    nsname: ").append(toIndentedString(nsname)).append("\n");
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

