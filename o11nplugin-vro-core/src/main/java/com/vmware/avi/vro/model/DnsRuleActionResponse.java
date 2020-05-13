package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DnsRuleDnsRrSet;
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
 * DnsRuleActionResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsRuleActionResponse")
@VsoFinder(name = Constants.FINDER_VRO_DNSRULEACTIONRESPONSE, idAccessor = "getObjectID()")
@Service
public class DnsRuleActionResponse extends AviRestResource  {
  @JsonProperty("authoritative")
  private Boolean authoritative = true;

  @JsonProperty("rcode")
  private String rcode = "DNS_RCODE_NOERROR";

  @JsonProperty("resource_record_sets")
  @Valid
  private List<DnsRuleDnsRrSet> resourceRecordSets = null;

  @JsonProperty("truncation")
  private Boolean truncation = null;

  
  /**
   * DNS response is authoritative. Field introduced in 17.1.1.
   * @return authoritative
  **/
  @ApiModelProperty(value = "DNS response is authoritative. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isAuthoritative() {
    return authoritative;
  }
    
  @VsoMethod
  public void setAuthoritative(Boolean authoritative) {
    this.authoritative = authoritative;
  }

  
  /**
   * DNS response code. Enum options - DNS_RCODE_NOERROR, DNS_RCODE_FORMERR, DNS_RCODE_SERVFAIL, DNS_RCODE_NXDOMAIN, DNS_RCODE_NOTIMP, DNS_RCODE_REFUSED, DNS_RCODE_YXDOMAIN, DNS_RCODE_YXRRSET, DNS_RCODE_NXRRSET, DNS_RCODE_NOTAUTH, DNS_RCODE_NOTZONE. Field introduced in 17.1.1.
   * @return rcode
  **/
  @ApiModelProperty(value = "DNS response code. Enum options - DNS_RCODE_NOERROR, DNS_RCODE_FORMERR, DNS_RCODE_SERVFAIL, DNS_RCODE_NXDOMAIN, DNS_RCODE_NOTIMP, DNS_RCODE_REFUSED, DNS_RCODE_YXDOMAIN, DNS_RCODE_YXRRSET, DNS_RCODE_NXRRSET, DNS_RCODE_NOTAUTH, DNS_RCODE_NOTZONE. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getRcode() {
    return rcode;
  }
    
  @VsoMethod
  public void setRcode(String rcode) {
    this.rcode = rcode;
  }

  
  public DnsRuleActionResponse addResourceRecordSetsItem(DnsRuleDnsRrSet resourceRecordSetsItem) {
    if (this.resourceRecordSets == null) {
      this.resourceRecordSets = new ArrayList<DnsRuleDnsRrSet>();
    }
    this.resourceRecordSets.add(resourceRecordSetsItem);
    return this;
  }
  
  /**
   * DNS resource record sets - (resource record set share the DNS domain name, type, and class). Field introduced in 17.2.12, 18.1.2.
   * @return resourceRecordSets
  **/
  @ApiModelProperty(value = "DNS resource record sets - (resource record set share the DNS domain name, type, and class). Field introduced in 17.2.12, 18.1.2.")

  @Valid

 
  @VsoMethod  
  public List<DnsRuleDnsRrSet> getResourceRecordSets() {
    return resourceRecordSets;
  }
    
  @VsoMethod
  public void setResourceRecordSets(List<DnsRuleDnsRrSet> resourceRecordSets) {
    this.resourceRecordSets = resourceRecordSets;
  }

  
  /**
   * DNS response is truncated. Field introduced in 17.1.1.
   * @return truncation
  **/
  @ApiModelProperty(value = "DNS response is truncated. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isTruncation() {
    return truncation;
  }
    
  @VsoMethod
  public void setTruncation(Boolean truncation) {
    this.truncation = truncation;
  }

  
  public String getObjectID() {
		return "DnsRuleActionResponse";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRuleActionResponse dnsRuleActionResponse = (DnsRuleActionResponse) o;
    return Objects.equals(this.authoritative, dnsRuleActionResponse.authoritative) &&
        Objects.equals(this.rcode, dnsRuleActionResponse.rcode) &&
        Objects.equals(this.resourceRecordSets, dnsRuleActionResponse.resourceRecordSets) &&
        Objects.equals(this.truncation, dnsRuleActionResponse.truncation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authoritative, rcode, resourceRecordSets, truncation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRuleActionResponse {\n");
    
    sb.append("    authoritative: ").append(toIndentedString(authoritative)).append("\n");
    sb.append("    rcode: ").append(toIndentedString(rcode)).append("\n");
    sb.append("    resourceRecordSets: ").append(toIndentedString(resourceRecordSets)).append("\n");
    sb.append("    truncation: ").append(toIndentedString(truncation)).append("\n");
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

