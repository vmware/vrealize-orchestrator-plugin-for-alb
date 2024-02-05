package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DnsServiceDomain is a POJO class extends AviRestResource that used for creating
 * DnsServiceDomain.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsServiceDomain")
@VsoFinder(name = Constants.FINDER_VRO_DNSSERVICEDOMAIN)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsServiceDomain extends AviRestResource {
    @JsonProperty("domain_name")
    @JsonInclude(Include.NON_NULL)
    private String domainName;

    @JsonProperty("pass_through")
    @JsonInclude(Include.NON_NULL)
    private Boolean passThrough = true;

    @JsonProperty("record_ttl")
    @JsonInclude(Include.NON_NULL)
    private Integer recordTtl;



  /**
   * This is the getter method this will return the attribute value.
   * Service domain string used for fqdn.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return domainName
   */
  @VsoMethod
  public String getDomainName() {
    return domainName;
  }

  /**
   * This is the setter method to the attribute.
   * Service domain string used for fqdn.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param domainName set the domainName.
   */
  @VsoMethod
  public void setDomainName(String  domainName) {
    this.domainName = domainName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Third-party authoritative domain requests are delegated todns virtualservice's pool of nameservers.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return passThrough
   */
  @VsoMethod
  public Boolean getPassThrough() {
    return passThrough;
  }

  /**
   * This is the setter method to the attribute.
   * Third-party authoritative domain requests are delegated todns virtualservice's pool of nameservers.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param passThrough set the passThrough.
   */
  @VsoMethod
  public void setPassThrough(Boolean  passThrough) {
    this.passThrough = passThrough;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ttl value for dns records.
   * Allowed values are 1-604800.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return recordTtl
   */
  @VsoMethod
  public Integer getRecordTtl() {
    return recordTtl;
  }

  /**
   * This is the setter method to the attribute.
   * Ttl value for dns records.
   * Allowed values are 1-604800.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param recordTtl set the recordTtl.
   */
  @VsoMethod
  public void setRecordTtl(Integer  recordTtl) {
    this.recordTtl = recordTtl;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsServiceDomain objDnsServiceDomain = (DnsServiceDomain) o;
  return   Objects.equals(this.domainName, objDnsServiceDomain.domainName)&&
  Objects.equals(this.recordTtl, objDnsServiceDomain.recordTtl)&&
  Objects.equals(this.passThrough, objDnsServiceDomain.passThrough);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsServiceDomain {\n");
      sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
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

