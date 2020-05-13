package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DnsZone;
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
 * DnsServiceApplicationProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsServiceApplicationProfile")
@VsoFinder(name = Constants.FINDER_VRO_DNSSERVICEAPPLICATIONPROFILE, idAccessor = "getObjectID()")
@Service
public class DnsServiceApplicationProfile extends AviRestResource  {
  @JsonProperty("aaaa_empty_response")
  private Boolean aaaaEmptyResponse = true;

  @JsonProperty("admin_email")
  private String adminEmail = "hostmaster";

  @JsonProperty("authoritative_domain_names")
  @Valid
  private List<String> authoritativeDomainNames = null;

  @JsonProperty("dns_over_tcp_enabled")
  private Boolean dnsOverTcpEnabled = true;

  @JsonProperty("dns_zones")
  @Valid
  private List<DnsZone> dnsZones = null;

  @JsonProperty("domain_names")
  @Valid
  private List<String> domainNames = null;

  @JsonProperty("ecs_stripping_enabled")
  private Boolean ecsStrippingEnabled = true;

  @JsonProperty("edns")
  private Boolean edns = true;

  @JsonProperty("edns_client_subnet_prefix_len")
  private Integer ednsClientSubnetPrefixLen = null;

  @JsonProperty("error_response")
  private String errorResponse = "DNS_ERROR_RESPONSE_NONE";

  @JsonProperty("name_server")
  private String nameServer = null;

  @JsonProperty("negative_caching_ttl")
  private Integer negativeCachingTtl = 30;

  @JsonProperty("num_dns_ip")
  private Integer numDnsIp = 1;

  @JsonProperty("ttl")
  private Integer ttl = 30;

  
  /**
   * Respond to AAAA queries with empty response when there are only IPV4 records.
   * @return aaaaEmptyResponse
  **/
  @ApiModelProperty(value = "Respond to AAAA queries with empty response when there are only IPV4 records.")


 
  @VsoMethod  
  public Boolean isAaaaEmptyResponse() {
    return aaaaEmptyResponse;
  }
    
  @VsoMethod
  public void setAaaaEmptyResponse(Boolean aaaaEmptyResponse) {
    this.aaaaEmptyResponse = aaaaEmptyResponse;
  }

  
  /**
   * Email address of the administrator responsible for this zone . This field is used in SOA records (rname) pertaining to all domain names specified as authoritative domain names. If not configured, the default value 'hostmaster' is used in SOA responses. Field introduced in 18.2.5.
   * @return adminEmail
  **/
  @ApiModelProperty(value = "Email address of the administrator responsible for this zone . This field is used in SOA records (rname) pertaining to all domain names specified as authoritative domain names. If not configured, the default value 'hostmaster' is used in SOA responses. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getAdminEmail() {
    return adminEmail;
  }
    
  @VsoMethod
  public void setAdminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
  }

  
  public DnsServiceApplicationProfile addAuthoritativeDomainNamesItem(String authoritativeDomainNamesItem) {
    if (this.authoritativeDomainNames == null) {
      this.authoritativeDomainNames = new ArrayList<String>();
    }
    this.authoritativeDomainNames.add(authoritativeDomainNamesItem);
    return this;
  }
  
  /**
   * Domain names authoritatively serviced by this Virtual Service. These are configured as Ends-With semantics. Queries for FQDNs that are subdomains of this domain and do not have any DNS record in Avi are dropped or NXDomain response sent. . Field deprecated in 18.2.6. Field introduced in 17.1.6,17.2.2.
   * @return authoritativeDomainNames
  **/
  @ApiModelProperty(value = "Domain names authoritatively serviced by this Virtual Service. These are configured as Ends-With semantics. Queries for FQDNs that are subdomains of this domain and do not have any DNS record in Avi are dropped or NXDomain response sent. . Field deprecated in 18.2.6. Field introduced in 17.1.6,17.2.2.")


 
  @VsoMethod  
  public List<String> getAuthoritativeDomainNames() {
    return authoritativeDomainNames;
  }
    
  @VsoMethod
  public void setAuthoritativeDomainNames(List<String> authoritativeDomainNames) {
    this.authoritativeDomainNames = authoritativeDomainNames;
  }

  
  /**
   * Enable DNS query/response over TCP. This enables analytics for pass-through queries as well. Field introduced in 17.1.1.
   * @return dnsOverTcpEnabled
  **/
  @ApiModelProperty(value = "Enable DNS query/response over TCP. This enables analytics for pass-through queries as well. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isDnsOverTcpEnabled() {
    return dnsOverTcpEnabled;
  }
    
  @VsoMethod
  public void setDnsOverTcpEnabled(Boolean dnsOverTcpEnabled) {
    this.dnsOverTcpEnabled = dnsOverTcpEnabled;
  }

  
  public DnsServiceApplicationProfile addDnsZonesItem(DnsZone dnsZonesItem) {
    if (this.dnsZones == null) {
      this.dnsZones = new ArrayList<DnsZone>();
    }
    this.dnsZones.add(dnsZonesItem);
    return this;
  }
  
  /**
   * DNS zones hosted on this Virtual Service. Field introduced in 18.2.6.
   * @return dnsZones
  **/
  @ApiModelProperty(value = "DNS zones hosted on this Virtual Service. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public List<DnsZone> getDnsZones() {
    return dnsZones;
  }
    
  @VsoMethod
  public void setDnsZones(List<DnsZone> dnsZones) {
    this.dnsZones = dnsZones;
  }

  
  public DnsServiceApplicationProfile addDomainNamesItem(String domainNamesItem) {
    if (this.domainNames == null) {
      this.domainNames = new ArrayList<String>();
    }
    this.domainNames.add(domainNamesItem);
    return this;
  }
  
  /**
   * Subdomain names serviced by this Virtual Service. These are configured as Ends-With semantics.
   * @return domainNames
  **/
  @ApiModelProperty(value = "Subdomain names serviced by this Virtual Service. These are configured as Ends-With semantics.")


 
  @VsoMethod  
  public List<String> getDomainNames() {
    return domainNames;
  }
    
  @VsoMethod
  public void setDomainNames(List<String> domainNames) {
    this.domainNames = domainNames;
  }

  
  /**
   * Enable stripping of EDNS client subnet (ecs) option towards client if DNS service inserts ecs option in the DNS query towards upstream servers. Field introduced in 17.1.5.
   * @return ecsStrippingEnabled
  **/
  @ApiModelProperty(value = "Enable stripping of EDNS client subnet (ecs) option towards client if DNS service inserts ecs option in the DNS query towards upstream servers. Field introduced in 17.1.5.")


 
  @VsoMethod  
  public Boolean isEcsStrippingEnabled() {
    return ecsStrippingEnabled;
  }
    
  @VsoMethod
  public void setEcsStrippingEnabled(Boolean ecsStrippingEnabled) {
    this.ecsStrippingEnabled = ecsStrippingEnabled;
  }

  
  /**
   * Enable DNS service to be aware of EDNS (Extension mechanism for DNS). EDNS extensions are parsed and shown in logs. For GSLB services, the EDNS client subnet option can be used to influence Load Balancing. Field introduced in 17.1.1.
   * @return edns
  **/
  @ApiModelProperty(value = "Enable DNS service to be aware of EDNS (Extension mechanism for DNS). EDNS extensions are parsed and shown in logs. For GSLB services, the EDNS client subnet option can be used to influence Load Balancing. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isEdns() {
    return edns;
  }
    
  @VsoMethod
  public void setEdns(Boolean edns) {
    this.edns = edns;
  }

  
  /**
   * Specifies the IP address prefix length to use in the EDNS client subnet (ECS) option. When the incoming request does not have any ECS option and the prefix length is specified, an ECS option is inserted in the request passed to upstream server. If the incoming request already has an ECS option, the prefix length (and correspondingly the address) in the ECS option is updated, with the minimum of the prefix length present in the incoming and the configured prefix length, before passing the request to upstream server. Allowed values are 1-32. Field introduced in 17.1.3.
   * @return ednsClientSubnetPrefixLen
  **/
  @ApiModelProperty(value = "Specifies the IP address prefix length to use in the EDNS client subnet (ECS) option. When the incoming request does not have any ECS option and the prefix length is specified, an ECS option is inserted in the request passed to upstream server. If the incoming request already has an ECS option, the prefix length (and correspondingly the address) in the ECS option is updated, with the minimum of the prefix length present in the incoming and the configured prefix length, before passing the request to upstream server. Allowed values are 1-32. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Integer getEdnsClientSubnetPrefixLen() {
    return ednsClientSubnetPrefixLen;
  }
    
  @VsoMethod
  public void setEdnsClientSubnetPrefixLen(Integer ednsClientSubnetPrefixLen) {
    this.ednsClientSubnetPrefixLen = ednsClientSubnetPrefixLen;
  }

  
  /**
   * Drop or respond to client when the DNS service encounters an error processing a client query. By default, such a request is dropped without any response, or passed through to a passthrough pool, if configured. When set to respond, an appropriate response is sent to client, e.g. NXDOMAIN response for non-existent records, empty NOERROR response for unsupported queries, etc. Enum options - DNS_ERROR_RESPONSE_ERROR, DNS_ERROR_RESPONSE_NONE.
   * @return errorResponse
  **/
  @ApiModelProperty(value = "Drop or respond to client when the DNS service encounters an error processing a client query. By default, such a request is dropped without any response, or passed through to a passthrough pool, if configured. When set to respond, an appropriate response is sent to client, e.g. NXDOMAIN response for non-existent records, empty NOERROR response for unsupported queries, etc. Enum options - DNS_ERROR_RESPONSE_ERROR, DNS_ERROR_RESPONSE_NONE.")


 
  @VsoMethod  
  public String getErrorResponse() {
    return errorResponse;
  }
    
  @VsoMethod
  public void setErrorResponse(String errorResponse) {
    this.errorResponse = errorResponse;
  }

  
  /**
   * The <domain-name>  of the name server that was the original or primary source of data for this zone. This field is used in SOA records (mname) pertaining to all domain names specified as authoritative domain names. If not configured, domain name is used as name server in SOA response. Field introduced in 18.2.5.
   * @return nameServer
  **/
  @ApiModelProperty(value = "The <domain-name>  of the name server that was the original or primary source of data for this zone. This field is used in SOA records (mname) pertaining to all domain names specified as authoritative domain names. If not configured, domain name is used as name server in SOA response. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getNameServer() {
    return nameServer;
  }
    
  @VsoMethod
  public void setNameServer(String nameServer) {
    this.nameServer = nameServer;
  }

  
  /**
   * Specifies the TTL value (in seconds) for SOA (Start of Authority) (corresponding to a authoritative domain owned by this DNS Virtual Service) record's minimum TTL served by the DNS Virtual Service. Allowed values are 0-86400. Field introduced in 17.2.4.
   * @return negativeCachingTtl
  **/
  @ApiModelProperty(value = "Specifies the TTL value (in seconds) for SOA (Start of Authority) (corresponding to a authoritative domain owned by this DNS Virtual Service) record's minimum TTL served by the DNS Virtual Service. Allowed values are 0-86400. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public Integer getNegativeCachingTtl() {
    return negativeCachingTtl;
  }
    
  @VsoMethod
  public void setNegativeCachingTtl(Integer negativeCachingTtl) {
    this.negativeCachingTtl = negativeCachingTtl;
  }

  
  /**
   * Specifies the number of IP addresses returned by the DNS Service. Enter 0 to return all IP addresses. Allowed values are 1-20. Special values are 0- 'Return all IP addresses'.
   * @return numDnsIp
  **/
  @ApiModelProperty(value = "Specifies the number of IP addresses returned by the DNS Service. Enter 0 to return all IP addresses. Allowed values are 1-20. Special values are 0- 'Return all IP addresses'.")


 
  @VsoMethod  
  public Integer getNumDnsIp() {
    return numDnsIp;
  }
    
  @VsoMethod
  public void setNumDnsIp(Integer numDnsIp) {
    this.numDnsIp = numDnsIp;
  }

  
  /**
   * Specifies the TTL value (in seconds) for records served by DNS Service. Allowed values are 0-86400.
   * @return ttl
  **/
  @ApiModelProperty(value = "Specifies the TTL value (in seconds) for records served by DNS Service. Allowed values are 0-86400.")


 
  @VsoMethod  
  public Integer getTtl() {
    return ttl;
  }
    
  @VsoMethod
  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }

  
  public String getObjectID() {
		return "DnsServiceApplicationProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsServiceApplicationProfile dnsServiceApplicationProfile = (DnsServiceApplicationProfile) o;
    return Objects.equals(this.aaaaEmptyResponse, dnsServiceApplicationProfile.aaaaEmptyResponse) &&
        Objects.equals(this.adminEmail, dnsServiceApplicationProfile.adminEmail) &&
        Objects.equals(this.authoritativeDomainNames, dnsServiceApplicationProfile.authoritativeDomainNames) &&
        Objects.equals(this.dnsOverTcpEnabled, dnsServiceApplicationProfile.dnsOverTcpEnabled) &&
        Objects.equals(this.dnsZones, dnsServiceApplicationProfile.dnsZones) &&
        Objects.equals(this.domainNames, dnsServiceApplicationProfile.domainNames) &&
        Objects.equals(this.ecsStrippingEnabled, dnsServiceApplicationProfile.ecsStrippingEnabled) &&
        Objects.equals(this.edns, dnsServiceApplicationProfile.edns) &&
        Objects.equals(this.ednsClientSubnetPrefixLen, dnsServiceApplicationProfile.ednsClientSubnetPrefixLen) &&
        Objects.equals(this.errorResponse, dnsServiceApplicationProfile.errorResponse) &&
        Objects.equals(this.nameServer, dnsServiceApplicationProfile.nameServer) &&
        Objects.equals(this.negativeCachingTtl, dnsServiceApplicationProfile.negativeCachingTtl) &&
        Objects.equals(this.numDnsIp, dnsServiceApplicationProfile.numDnsIp) &&
        Objects.equals(this.ttl, dnsServiceApplicationProfile.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aaaaEmptyResponse, adminEmail, authoritativeDomainNames, dnsOverTcpEnabled, dnsZones, domainNames, ecsStrippingEnabled, edns, ednsClientSubnetPrefixLen, errorResponse, nameServer, negativeCachingTtl, numDnsIp, ttl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsServiceApplicationProfile {\n");
    
    sb.append("    aaaaEmptyResponse: ").append(toIndentedString(aaaaEmptyResponse)).append("\n");
    sb.append("    adminEmail: ").append(toIndentedString(adminEmail)).append("\n");
    sb.append("    authoritativeDomainNames: ").append(toIndentedString(authoritativeDomainNames)).append("\n");
    sb.append("    dnsOverTcpEnabled: ").append(toIndentedString(dnsOverTcpEnabled)).append("\n");
    sb.append("    dnsZones: ").append(toIndentedString(dnsZones)).append("\n");
    sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
    sb.append("    ecsStrippingEnabled: ").append(toIndentedString(ecsStrippingEnabled)).append("\n");
    sb.append("    edns: ").append(toIndentedString(edns)).append("\n");
    sb.append("    ednsClientSubnetPrefixLen: ").append(toIndentedString(ednsClientSubnetPrefixLen)).append("\n");
    sb.append("    errorResponse: ").append(toIndentedString(errorResponse)).append("\n");
    sb.append("    nameServer: ").append(toIndentedString(nameServer)).append("\n");
    sb.append("    negativeCachingTtl: ").append(toIndentedString(negativeCachingTtl)).append("\n");
    sb.append("    numDnsIp: ").append(toIndentedString(numDnsIp)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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

