package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DnsAAAARdata;
import com.vmware.avi.vro.model.DnsARdata;
import com.vmware.avi.vro.model.DnsCnameRdata;
import com.vmware.avi.vro.model.DnsNsRdata;
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
 * DnsRrSet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsRrSet")
@VsoFinder(name = Constants.FINDER_VRO_DNSRRSET, idAccessor = "getObjectID()")
@Service
public class DnsRrSet extends AviRestResource  {
  @JsonProperty("cname")
  private DnsCnameRdata cname = null;

  @JsonProperty("fqdn")
  private String fqdn = null;

  @JsonProperty("ip6_addresses")
  @Valid
  private List<DnsAAAARdata> ip6Addresses = null;

  @JsonProperty("ip_addresses")
  @Valid
  private List<DnsARdata> ipAddresses = null;

  @JsonProperty("nses")
  @Valid
  private List<DnsNsRdata> nses = null;

  @JsonProperty("ttl")
  private Integer ttl = null;

  @JsonProperty("type")
  private String type = null;

  
  /**
   * Canonical name in CNAME record. Field introduced in 17.2.12, 18.1.2.
   * @return cname
  **/
  @ApiModelProperty(value = "Canonical name in CNAME record. Field introduced in 17.2.12, 18.1.2.")

  @Valid

 
  @VsoMethod  
  public DnsCnameRdata getCname() {
    return cname;
  }
    
  @VsoMethod
  public void setCname(DnsCnameRdata cname) {
    this.cname = cname;
  }

  
  /**
   * Fully Qualified Domain Name. Field introduced in 17.2.12, 18.1.2.
   * @return fqdn
  **/
  @ApiModelProperty(required = true, value = "Fully Qualified Domain Name. Field introduced in 17.2.12, 18.1.2.")
  @NotNull


 
  @VsoMethod  
  public String getFqdn() {
    return fqdn;
  }
    
  @VsoMethod
  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }

  
  public DnsRrSet addIp6AddressesItem(DnsAAAARdata ip6AddressesItem) {
    if (this.ip6Addresses == null) {
      this.ip6Addresses = new ArrayList<DnsAAAARdata>();
    }
    this.ip6Addresses.add(ip6AddressesItem);
    return this;
  }
  
  /**
   * IPv6 address in AAAA record. Field introduced in 18.1.2.
   * @return ip6Addresses
  **/
  @ApiModelProperty(value = "IPv6 address in AAAA record. Field introduced in 18.1.2.")

  @Valid

 
  @VsoMethod  
  public List<DnsAAAARdata> getIp6Addresses() {
    return ip6Addresses;
  }
    
  @VsoMethod
  public void setIp6Addresses(List<DnsAAAARdata> ip6Addresses) {
    this.ip6Addresses = ip6Addresses;
  }

  
  public DnsRrSet addIpAddressesItem(DnsARdata ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<DnsARdata>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }
  
  /**
   * IP address in A record. Field introduced in 17.2.12, 18.1.2.
   * @return ipAddresses
  **/
  @ApiModelProperty(value = "IP address in A record. Field introduced in 17.2.12, 18.1.2.")

  @Valid

 
  @VsoMethod  
  public List<DnsARdata> getIpAddresses() {
    return ipAddresses;
  }
    
  @VsoMethod
  public void setIpAddresses(List<DnsARdata> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }

  
  public DnsRrSet addNsesItem(DnsNsRdata nsesItem) {
    if (this.nses == null) {
      this.nses = new ArrayList<DnsNsRdata>();
    }
    this.nses.add(nsesItem);
    return this;
  }
  
  /**
   * Name Server information in NS record. Field introduced in 17.2.12, 18.1.2.
   * @return nses
  **/
  @ApiModelProperty(value = "Name Server information in NS record. Field introduced in 17.2.12, 18.1.2.")

  @Valid

 
  @VsoMethod  
  public List<DnsNsRdata> getNses() {
    return nses;
  }
    
  @VsoMethod
  public void setNses(List<DnsNsRdata> nses) {
    this.nses = nses;
  }

  
  /**
   * Time To Live for this DNS record. Allowed values are 0-2147483647. Field introduced in 17.2.12, 18.1.2.
   * @return ttl
  **/
  @ApiModelProperty(required = true, value = "Time To Live for this DNS record. Allowed values are 0-2147483647. Field introduced in 17.2.12, 18.1.2.")
  @NotNull


 
  @VsoMethod  
  public Integer getTtl() {
    return ttl;
  }
    
  @VsoMethod
  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }

  
  /**
   * DNS record type. Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX, DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR, DNS_RECORD_ANY. Field introduced in 17.2.12, 18.1.2.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "DNS record type. Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX, DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR, DNS_RECORD_ANY. Field introduced in 17.2.12, 18.1.2.")
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
		return "DnsRrSet";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRrSet dnsRrSet = (DnsRrSet) o;
    return Objects.equals(this.cname, dnsRrSet.cname) &&
        Objects.equals(this.fqdn, dnsRrSet.fqdn) &&
        Objects.equals(this.ip6Addresses, dnsRrSet.ip6Addresses) &&
        Objects.equals(this.ipAddresses, dnsRrSet.ipAddresses) &&
        Objects.equals(this.nses, dnsRrSet.nses) &&
        Objects.equals(this.ttl, dnsRrSet.ttl) &&
        Objects.equals(this.type, dnsRrSet.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cname, fqdn, ip6Addresses, ipAddresses, nses, ttl, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRrSet {\n");
    
    sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    ip6Addresses: ").append(toIndentedString(ip6Addresses)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    nses: ").append(toIndentedString(nses)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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

