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
 * DnsServiceDomain
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsServiceDomain")
@VsoFinder(name = Constants.FINDER_VRO_DNSSERVICEDOMAIN, idAccessor = "getObjectID()")
@Service
public class DnsServiceDomain extends AviRestResource  {
  @JsonProperty("domain_name")
  private String domainName = null;

  @JsonProperty("num_dns_ip")
  private Integer numDnsIp = 1;

  @JsonProperty("pass_through")
  private Boolean passThrough = true;

  @JsonProperty("record_ttl")
  private Integer recordTtl = null;

  
  /**
   * Service domain string used for FQDN.
   * @return domainName
  **/
  @ApiModelProperty(required = true, value = "Service domain string used for FQDN.")
  @NotNull


 
  @VsoMethod  
  public String getDomainName() {
    return domainName;
  }
    
  @VsoMethod
  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  
  /**
   * Specifies the number of A records returned by Avi DNS Service. Allowed values are 0-20. Special values are 0- 'Return all IP addresses'.
   * @return numDnsIp
  **/
  @ApiModelProperty(value = "Specifies the number of A records returned by Avi DNS Service. Allowed values are 0-20. Special values are 0- 'Return all IP addresses'.")


 
  @VsoMethod  
  public Integer getNumDnsIp() {
    return numDnsIp;
  }
    
  @VsoMethod
  public void setNumDnsIp(Integer numDnsIp) {
    this.numDnsIp = numDnsIp;
  }

  
  /**
   * Third-party Authoritative domain requests are delegated toDNS VirtualService's pool of nameservers.
   * @return passThrough
  **/
  @ApiModelProperty(value = "Third-party Authoritative domain requests are delegated toDNS VirtualService's pool of nameservers.")


 
  @VsoMethod  
  public Boolean isPassThrough() {
    return passThrough;
  }
    
  @VsoMethod
  public void setPassThrough(Boolean passThrough) {
    this.passThrough = passThrough;
  }

  
  /**
   * TTL value for DNS records. Allowed values are 1-604800.
   * @return recordTtl
  **/
  @ApiModelProperty(value = "TTL value for DNS records. Allowed values are 1-604800.")


 
  @VsoMethod  
  public Integer getRecordTtl() {
    return recordTtl;
  }
    
  @VsoMethod
  public void setRecordTtl(Integer recordTtl) {
    this.recordTtl = recordTtl;
  }

  
  public String getObjectID() {
		return "DnsServiceDomain";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsServiceDomain dnsServiceDomain = (DnsServiceDomain) o;
    return Objects.equals(this.domainName, dnsServiceDomain.domainName) &&
        Objects.equals(this.numDnsIp, dnsServiceDomain.numDnsIp) &&
        Objects.equals(this.passThrough, dnsServiceDomain.passThrough) &&
        Objects.equals(this.recordTtl, dnsServiceDomain.recordTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainName, numDnsIp, passThrough, recordTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsServiceDomain {\n");
    
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    numDnsIp: ").append(toIndentedString(numDnsIp)).append("\n");
    sb.append("    passThrough: ").append(toIndentedString(passThrough)).append("\n");
    sb.append("    recordTtl: ").append(toIndentedString(recordTtl)).append("\n");
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

