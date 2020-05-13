package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DnsClientIpMatch;
import com.vmware.avi.vro.model.DnsGeoLocationMatch;
import com.vmware.avi.vro.model.DnsQueryNameMatch;
import com.vmware.avi.vro.model.DnsQueryTypeMatch;
import com.vmware.avi.vro.model.DnsTransportProtocolMatch;
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
 * DnsRuleMatchTarget
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsRuleMatchTarget")
@VsoFinder(name = Constants.FINDER_VRO_DNSRULEMATCHTARGET, idAccessor = "getObjectID()")
@Service
public class DnsRuleMatchTarget extends AviRestResource  {
  @JsonProperty("client_ip")
  private IpAddrMatch clientIp = null;

  @JsonProperty("client_ip_address")
  private DnsClientIpMatch clientIpAddress = null;

  @JsonProperty("geo_location")
  private DnsGeoLocationMatch geoLocation = null;

  @JsonProperty("protocol")
  private DnsTransportProtocolMatch protocol = null;

  @JsonProperty("query_name")
  private DnsQueryNameMatch queryName = null;

  @JsonProperty("query_type")
  private DnsQueryTypeMatch queryType = null;

  
  /**
   * IP addresses to match against client IP. From 17.1.6 release onwards, IP addresses needs to be configured in the client_ip_address field of this message. Field deprecated in 17.1.6,17.2.2. Field introduced in 17.1.1.
   * @return clientIp
  **/
  @ApiModelProperty(value = "IP addresses to match against client IP. From 17.1.6 release onwards, IP addresses needs to be configured in the client_ip_address field of this message. Field deprecated in 17.1.6,17.2.2. Field introduced in 17.1.1.")

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
   * IP addresses to match against client IP or the EDNS client subnet IP. Field introduced in 17.1.6,17.2.2.
   * @return clientIpAddress
  **/
  @ApiModelProperty(value = "IP addresses to match against client IP or the EDNS client subnet IP. Field introduced in 17.1.6,17.2.2.")

  @Valid

 
  @VsoMethod  
  public DnsClientIpMatch getClientIpAddress() {
    return clientIpAddress;
  }
    
  @VsoMethod
  public void setClientIpAddress(DnsClientIpMatch clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
  }

  
  /**
   * Geographical location attribute to match against that of the client IP. Field introduced in 17.1.5.
   * @return geoLocation
  **/
  @ApiModelProperty(value = "Geographical location attribute to match against that of the client IP. Field introduced in 17.1.5.")

  @Valid

 
  @VsoMethod  
  public DnsGeoLocationMatch getGeoLocation() {
    return geoLocation;
  }
    
  @VsoMethod
  public void setGeoLocation(DnsGeoLocationMatch geoLocation) {
    this.geoLocation = geoLocation;
  }

  
  /**
   * DNS transport protocol match. Field introduced in 17.1.1.
   * @return protocol
  **/
  @ApiModelProperty(value = "DNS transport protocol match. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public DnsTransportProtocolMatch getProtocol() {
    return protocol;
  }
    
  @VsoMethod
  public void setProtocol(DnsTransportProtocolMatch protocol) {
    this.protocol = protocol;
  }

  
  /**
   * Domain names to match against query name. Field introduced in 17.1.1.
   * @return queryName
  **/
  @ApiModelProperty(value = "Domain names to match against query name. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public DnsQueryNameMatch getQueryName() {
    return queryName;
  }
    
  @VsoMethod
  public void setQueryName(DnsQueryNameMatch queryName) {
    this.queryName = queryName;
  }

  
  /**
   * DNS query types to match against request query type. Field introduced in 17.1.1.
   * @return queryType
  **/
  @ApiModelProperty(value = "DNS query types to match against request query type. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public DnsQueryTypeMatch getQueryType() {
    return queryType;
  }
    
  @VsoMethod
  public void setQueryType(DnsQueryTypeMatch queryType) {
    this.queryType = queryType;
  }

  
  public String getObjectID() {
		return "DnsRuleMatchTarget";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRuleMatchTarget dnsRuleMatchTarget = (DnsRuleMatchTarget) o;
    return Objects.equals(this.clientIp, dnsRuleMatchTarget.clientIp) &&
        Objects.equals(this.clientIpAddress, dnsRuleMatchTarget.clientIpAddress) &&
        Objects.equals(this.geoLocation, dnsRuleMatchTarget.geoLocation) &&
        Objects.equals(this.protocol, dnsRuleMatchTarget.protocol) &&
        Objects.equals(this.queryName, dnsRuleMatchTarget.queryName) &&
        Objects.equals(this.queryType, dnsRuleMatchTarget.queryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIp, clientIpAddress, geoLocation, protocol, queryName, queryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRuleMatchTarget {\n");
    
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    clientIpAddress: ").append(toIndentedString(clientIpAddress)).append("\n");
    sb.append("    geoLocation: ").append(toIndentedString(geoLocation)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    queryName: ").append(toIndentedString(queryName)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
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

