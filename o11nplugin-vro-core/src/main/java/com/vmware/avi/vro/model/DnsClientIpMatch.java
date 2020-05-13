package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddrMatch;
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
 * DnsClientIpMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsClientIpMatch")
@VsoFinder(name = Constants.FINDER_VRO_DNSCLIENTIPMATCH, idAccessor = "getObjectID()")
@Service
public class DnsClientIpMatch extends AviRestResource  {
  @JsonProperty("client_ip")
  private IpAddrMatch clientIp = null;

  @JsonProperty("use_edns_client_subnet_ip")
  private Boolean useEdnsClientSubnetIp = true;

  
  /**
   * IP addresses to match against client IP. Field introduced in 17.1.6,17.2.2.
   * @return clientIp
  **/
  @ApiModelProperty(required = true, value = "IP addresses to match against client IP. Field introduced in 17.1.6,17.2.2.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddrMatch getClientIp() {
    return clientIp;
  }
    
  @VsoMethod
  public void setClientIp(IpAddrMatch clientIp) {
    this.clientIp = clientIp;
  }

  
  /**
   * Use the IP address from the EDNS client subnet option, if available, as the source IP address of the client. It should be noted that the edns subnet IP may not be a /32 IP address. Field introduced in 17.1.6,17.2.2.
   * @return useEdnsClientSubnetIp
  **/
  @ApiModelProperty(value = "Use the IP address from the EDNS client subnet option, if available, as the source IP address of the client. It should be noted that the edns subnet IP may not be a /32 IP address. Field introduced in 17.1.6,17.2.2.")


 
  @VsoMethod  
  public Boolean isUseEdnsClientSubnetIp() {
    return useEdnsClientSubnetIp;
  }
    
  @VsoMethod
  public void setUseEdnsClientSubnetIp(Boolean useEdnsClientSubnetIp) {
    this.useEdnsClientSubnetIp = useEdnsClientSubnetIp;
  }

  
  public String getObjectID() {
		return "DnsClientIpMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsClientIpMatch dnsClientIpMatch = (DnsClientIpMatch) o;
    return Objects.equals(this.clientIp, dnsClientIpMatch.clientIp) &&
        Objects.equals(this.useEdnsClientSubnetIp, dnsClientIpMatch.useEdnsClientSubnetIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIp, useEdnsClientSubnetIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsClientIpMatch {\n");
    
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    useEdnsClientSubnetIp: ").append(toIndentedString(useEdnsClientSubnetIp)).append("\n");
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

