package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DnsServiceDomain;
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
 * IpamDnsInternalProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IpamDnsInternalProfile")
@VsoFinder(name = Constants.FINDER_VRO_IPAMDNSINTERNALPROFILE, idAccessor = "getObjectID()")
@Service
public class IpamDnsInternalProfile extends AviRestResource  {
  @JsonProperty("dns_service_domain")
  @Valid
  private List<DnsServiceDomain> dnsServiceDomain = null;

  @JsonProperty("dns_virtualservice_ref")
  private String dnsVirtualserviceRef = null;

  @JsonProperty("ttl")
  private Integer ttl = 30;

  @JsonProperty("usable_network_refs")
  @Valid
  private List<String> usableNetworkRefs = null;

  
  public IpamDnsInternalProfile addDnsServiceDomainItem(DnsServiceDomain dnsServiceDomainItem) {
    if (this.dnsServiceDomain == null) {
      this.dnsServiceDomain = new ArrayList<DnsServiceDomain>();
    }
    this.dnsServiceDomain.add(dnsServiceDomainItem);
    return this;
  }
  
  /**
   * List of service domains.
   * @return dnsServiceDomain
  **/
  @ApiModelProperty(value = "List of service domains.")

  @Valid

 
  @VsoMethod  
  public List<DnsServiceDomain> getDnsServiceDomain() {
    return dnsServiceDomain;
  }
    
  @VsoMethod
  public void setDnsServiceDomain(List<DnsServiceDomain> dnsServiceDomain) {
    this.dnsServiceDomain = dnsServiceDomain;
  }

  
  /**
   * Avi VirtualService to be used for serving DNS records. It is a reference to an object of type VirtualService.
   * @return dnsVirtualserviceRef
  **/
  @ApiModelProperty(value = "Avi VirtualService to be used for serving DNS records. It is a reference to an object of type VirtualService.")


 
  @VsoMethod  
  public String getDnsVirtualserviceRef() {
    return dnsVirtualserviceRef;
  }
    
  @VsoMethod
  public void setDnsVirtualserviceRef(String dnsVirtualserviceRef) {
    this.dnsVirtualserviceRef = dnsVirtualserviceRef;
  }

  
  /**
   * Default TTL for all records, overridden by TTL value for each service domain configured in DnsServiceDomain. Allowed values are 1-604800.
   * @return ttl
  **/
  @ApiModelProperty(value = "Default TTL for all records, overridden by TTL value for each service domain configured in DnsServiceDomain. Allowed values are 1-604800.")


 
  @VsoMethod  
  public Integer getTtl() {
    return ttl;
  }
    
  @VsoMethod
  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }

  
  public IpamDnsInternalProfile addUsableNetworkRefsItem(String usableNetworkRefsItem) {
    if (this.usableNetworkRefs == null) {
      this.usableNetworkRefs = new ArrayList<String>();
    }
    this.usableNetworkRefs.add(usableNetworkRefsItem);
    return this;
  }
  
  /**
   * Usable networks for Virtual IP. If VirtualService does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for IP allocation. It is a reference to an object of type Network.
   * @return usableNetworkRefs
  **/
  @ApiModelProperty(value = "Usable networks for Virtual IP. If VirtualService does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for IP allocation. It is a reference to an object of type Network.")


 
  @VsoMethod  
  public List<String> getUsableNetworkRefs() {
    return usableNetworkRefs;
  }
    
  @VsoMethod
  public void setUsableNetworkRefs(List<String> usableNetworkRefs) {
    this.usableNetworkRefs = usableNetworkRefs;
  }

  
  public String getObjectID() {
		return "IpamDnsInternalProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpamDnsInternalProfile ipamDnsInternalProfile = (IpamDnsInternalProfile) o;
    return Objects.equals(this.dnsServiceDomain, ipamDnsInternalProfile.dnsServiceDomain) &&
        Objects.equals(this.dnsVirtualserviceRef, ipamDnsInternalProfile.dnsVirtualserviceRef) &&
        Objects.equals(this.ttl, ipamDnsInternalProfile.ttl) &&
        Objects.equals(this.usableNetworkRefs, ipamDnsInternalProfile.usableNetworkRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsServiceDomain, dnsVirtualserviceRef, ttl, usableNetworkRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpamDnsInternalProfile {\n");
    
    sb.append("    dnsServiceDomain: ").append(toIndentedString(dnsServiceDomain)).append("\n");
    sb.append("    dnsVirtualserviceRef: ").append(toIndentedString(dnsVirtualserviceRef)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    usableNetworkRefs: ").append(toIndentedString(usableNetworkRefs)).append("\n");
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

