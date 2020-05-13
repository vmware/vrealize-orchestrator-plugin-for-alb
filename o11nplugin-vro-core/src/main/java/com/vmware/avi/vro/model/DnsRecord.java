package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DnsAAAARdata;
import com.vmware.avi.vro.model.DnsARdata;
import com.vmware.avi.vro.model.DnsCnameRdata;
import com.vmware.avi.vro.model.DnsMxRdata;
import com.vmware.avi.vro.model.DnsNsRdata;
import com.vmware.avi.vro.model.DnsSrvRdata;
import com.vmware.avi.vro.model.DnsTxtRdata;
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
 * DnsRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsRecord")
@VsoFinder(name = Constants.FINDER_VRO_DNSRECORD, idAccessor = "getObjectID()")
@Service
public class DnsRecord extends AviRestResource  {
  @JsonProperty("algorithm")
  private String algorithm = "DNS_RECORD_RESPONSE_ROUND_ROBIN";

  @JsonProperty("cname")
  private DnsCnameRdata cname = null;

  @JsonProperty("delegated")
  private Boolean delegated = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("fqdn")
  @Valid
  private List<String> fqdn = null;

  @JsonProperty("ip6_address")
  @Valid
  private List<DnsAAAARdata> ip6Address = null;

  @JsonProperty("ip_address")
  @Valid
  private List<DnsARdata> ipAddress = null;

  @JsonProperty("metadata")
  private String metadata = null;

  @JsonProperty("mx_records")
  @Valid
  private List<DnsMxRdata> mxRecords = null;

  @JsonProperty("ns")
  @Valid
  private List<DnsNsRdata> ns = null;

  @JsonProperty("num_records_in_response")
  private Integer numRecordsInResponse = null;

  @JsonProperty("service_locator")
  @Valid
  private List<DnsSrvRdata> serviceLocator = null;

  @JsonProperty("ttl")
  private Integer ttl = null;

  @JsonProperty("txt_records")
  @Valid
  private List<DnsTxtRdata> txtRecords = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("wildcard_match")
  private Boolean wildcardMatch = null;

  
  /**
   * Specifies the algorithm to pick the IP address(es) to be returned, when multiple entries are configured. This does not apply if num_records_in_response is 0. Default is round-robin. Enum options - DNS_RECORD_RESPONSE_ROUND_ROBIN, DNS_RECORD_RESPONSE_CONSISTENT_HASH. Field introduced in 17.1.1.
   * @return algorithm
  **/
  @ApiModelProperty(value = "Specifies the algorithm to pick the IP address(es) to be returned, when multiple entries are configured. This does not apply if num_records_in_response is 0. Default is round-robin. Enum options - DNS_RECORD_RESPONSE_ROUND_ROBIN, DNS_RECORD_RESPONSE_CONSISTENT_HASH. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getAlgorithm() {
    return algorithm;
  }
    
  @VsoMethod
  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  
  /**
   * Canonical name in CNAME record.
   * @return cname
  **/
  @ApiModelProperty(value = "Canonical name in CNAME record.")

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
   * Configured FQDNs are delegated domains (i.e. they represent a zone cut). Field introduced in 17.1.2.
   * @return delegated
  **/
  @ApiModelProperty(value = "Configured FQDNs are delegated domains (i.e. they represent a zone cut). Field introduced in 17.1.2.")


 
  @VsoMethod  
  public Boolean isDelegated() {
    return delegated;
  }
    
  @VsoMethod
  public void setDelegated(Boolean delegated) {
    this.delegated = delegated;
  }

  
  /**
   * Details of DNS record.
   * @return description
  **/
  @ApiModelProperty(value = "Details of DNS record.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  public DnsRecord addFqdnItem(String fqdnItem) {
    if (this.fqdn == null) {
      this.fqdn = new ArrayList<String>();
    }
    this.fqdn.add(fqdnItem);
    return this;
  }
  
  /**
   * Fully Qualified Domain Name.
   * @return fqdn
  **/
  @ApiModelProperty(value = "Fully Qualified Domain Name.")


 
  @VsoMethod  
  public List<String> getFqdn() {
    return fqdn;
  }
    
  @VsoMethod
  public void setFqdn(List<String> fqdn) {
    this.fqdn = fqdn;
  }

  
  public DnsRecord addIp6AddressItem(DnsAAAARdata ip6AddressItem) {
    if (this.ip6Address == null) {
      this.ip6Address = new ArrayList<DnsAAAARdata>();
    }
    this.ip6Address.add(ip6AddressItem);
    return this;
  }
  
  /**
   * IPv6 address in AAAA record. Field introduced in 18.1.1.
   * @return ip6Address
  **/
  @ApiModelProperty(value = "IPv6 address in AAAA record. Field introduced in 18.1.1.")

  @Valid

 
  @VsoMethod  
  public List<DnsAAAARdata> getIp6Address() {
    return ip6Address;
  }
    
  @VsoMethod
  public void setIp6Address(List<DnsAAAARdata> ip6Address) {
    this.ip6Address = ip6Address;
  }

  
  public DnsRecord addIpAddressItem(DnsARdata ipAddressItem) {
    if (this.ipAddress == null) {
      this.ipAddress = new ArrayList<DnsARdata>();
    }
    this.ipAddress.add(ipAddressItem);
    return this;
  }
  
  /**
   * IP address in A record.
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP address in A record.")

  @Valid

 
  @VsoMethod  
  public List<DnsARdata> getIpAddress() {
    return ipAddress;
  }
    
  @VsoMethod
  public void setIpAddress(List<DnsARdata> ipAddress) {
    this.ipAddress = ipAddress;
  }

  
  /**
   * Internal metadata for the DNS record. Field introduced in 18.2.5.
   * @return metadata
  **/
  @ApiModelProperty(value = "Internal metadata for the DNS record. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getMetadata() {
    return metadata;
  }
    
  @VsoMethod
  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  
  public DnsRecord addMxRecordsItem(DnsMxRdata mxRecordsItem) {
    if (this.mxRecords == null) {
      this.mxRecords = new ArrayList<DnsMxRdata>();
    }
    this.mxRecords.add(mxRecordsItem);
    return this;
  }
  
  /**
   * MX record. Field introduced in 20.1.1.
   * @return mxRecords
  **/
  @ApiModelProperty(value = "MX record. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public List<DnsMxRdata> getMxRecords() {
    return mxRecords;
  }
    
  @VsoMethod
  public void setMxRecords(List<DnsMxRdata> mxRecords) {
    this.mxRecords = mxRecords;
  }

  
  public DnsRecord addNsItem(DnsNsRdata nsItem) {
    if (this.ns == null) {
      this.ns = new ArrayList<DnsNsRdata>();
    }
    this.ns.add(nsItem);
    return this;
  }
  
  /**
   * Name Server information in NS record. Field introduced in 17.1.1.
   * @return ns
  **/
  @ApiModelProperty(value = "Name Server information in NS record. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<DnsNsRdata> getNs() {
    return ns;
  }
    
  @VsoMethod
  public void setNs(List<DnsNsRdata> ns) {
    this.ns = ns;
  }

  
  /**
   * Specifies the number of records returned by the DNS service. Enter 0 to return all records. Default is 0. Allowed values are 0-20. Special values are 0- 'Return all records'. Field introduced in 17.1.1.
   * @return numRecordsInResponse
  **/
  @ApiModelProperty(value = "Specifies the number of records returned by the DNS service. Enter 0 to return all records. Default is 0. Allowed values are 0-20. Special values are 0- 'Return all records'. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getNumRecordsInResponse() {
    return numRecordsInResponse;
  }
    
  @VsoMethod
  public void setNumRecordsInResponse(Integer numRecordsInResponse) {
    this.numRecordsInResponse = numRecordsInResponse;
  }

  
  public DnsRecord addServiceLocatorItem(DnsSrvRdata serviceLocatorItem) {
    if (this.serviceLocator == null) {
      this.serviceLocator = new ArrayList<DnsSrvRdata>();
    }
    this.serviceLocator.add(serviceLocatorItem);
    return this;
  }
  
  /**
   * Service locator info in SRV record.
   * @return serviceLocator
  **/
  @ApiModelProperty(value = "Service locator info in SRV record.")

  @Valid

 
  @VsoMethod  
  public List<DnsSrvRdata> getServiceLocator() {
    return serviceLocator;
  }
    
  @VsoMethod
  public void setServiceLocator(List<DnsSrvRdata> serviceLocator) {
    this.serviceLocator = serviceLocator;
  }

  
  /**
   * Time To Live for this DNS record.
   * @return ttl
  **/
  @ApiModelProperty(value = "Time To Live for this DNS record.")


 
  @VsoMethod  
  public Integer getTtl() {
    return ttl;
  }
    
  @VsoMethod
  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }

  
  public DnsRecord addTxtRecordsItem(DnsTxtRdata txtRecordsItem) {
    if (this.txtRecords == null) {
      this.txtRecords = new ArrayList<DnsTxtRdata>();
    }
    this.txtRecords.add(txtRecordsItem);
    return this;
  }
  
  /**
   * Text record. Field introduced in 20.1.1.
   * @return txtRecords
  **/
  @ApiModelProperty(value = "Text record. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public List<DnsTxtRdata> getTxtRecords() {
    return txtRecords;
  }
    
  @VsoMethod
  public void setTxtRecords(List<DnsTxtRdata> txtRecords) {
    this.txtRecords = txtRecords;
  }

  
  /**
   * DNS record type. Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX, DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR, DNS_RECORD_ANY.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "DNS record type. Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX, DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR, DNS_RECORD_ANY.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Enable wild-card match of fqdn  if an exact match is not found in the DNS table, the longest match is chosen by wild-carding the fqdn in the DNS request. Default is false. Field introduced in 17.1.1.
   * @return wildcardMatch
  **/
  @ApiModelProperty(value = "Enable wild-card match of fqdn  if an exact match is not found in the DNS table, the longest match is chosen by wild-carding the fqdn in the DNS request. Default is false. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isWildcardMatch() {
    return wildcardMatch;
  }
    
  @VsoMethod
  public void setWildcardMatch(Boolean wildcardMatch) {
    this.wildcardMatch = wildcardMatch;
  }

  
  public String getObjectID() {
		return "DnsRecord";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRecord dnsRecord = (DnsRecord) o;
    return Objects.equals(this.algorithm, dnsRecord.algorithm) &&
        Objects.equals(this.cname, dnsRecord.cname) &&
        Objects.equals(this.delegated, dnsRecord.delegated) &&
        Objects.equals(this.description, dnsRecord.description) &&
        Objects.equals(this.fqdn, dnsRecord.fqdn) &&
        Objects.equals(this.ip6Address, dnsRecord.ip6Address) &&
        Objects.equals(this.ipAddress, dnsRecord.ipAddress) &&
        Objects.equals(this.metadata, dnsRecord.metadata) &&
        Objects.equals(this.mxRecords, dnsRecord.mxRecords) &&
        Objects.equals(this.ns, dnsRecord.ns) &&
        Objects.equals(this.numRecordsInResponse, dnsRecord.numRecordsInResponse) &&
        Objects.equals(this.serviceLocator, dnsRecord.serviceLocator) &&
        Objects.equals(this.ttl, dnsRecord.ttl) &&
        Objects.equals(this.txtRecords, dnsRecord.txtRecords) &&
        Objects.equals(this.type, dnsRecord.type) &&
        Objects.equals(this.wildcardMatch, dnsRecord.wildcardMatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, cname, delegated, description, fqdn, ip6Address, ipAddress, metadata, mxRecords, ns, numRecordsInResponse, serviceLocator, ttl, txtRecords, type, wildcardMatch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRecord {\n");
    
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
    sb.append("    delegated: ").append(toIndentedString(delegated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    ip6Address: ").append(toIndentedString(ip6Address)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mxRecords: ").append(toIndentedString(mxRecords)).append("\n");
    sb.append("    ns: ").append(toIndentedString(ns)).append("\n");
    sb.append("    numRecordsInResponse: ").append(toIndentedString(numRecordsInResponse)).append("\n");
    sb.append("    serviceLocator: ").append(toIndentedString(serviceLocator)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    txtRecords: ").append(toIndentedString(txtRecords)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    wildcardMatch: ").append(toIndentedString(wildcardMatch)).append("\n");
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

