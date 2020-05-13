package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * DnsQueryTypeMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsQueryTypeMatch")
@VsoFinder(name = Constants.FINDER_VRO_DNSQUERYTYPEMATCH, idAccessor = "getObjectID()")
@Service
public class DnsQueryTypeMatch extends AviRestResource  {
  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  @JsonProperty("query_type")
  @Valid
  private List<String> queryType = null;

  
  /**
   * Criterion to use for matching the DNS query typein the question section. Enum options - IS_IN, IS_NOT_IN. Field introduced in 17.1.1.
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "Criterion to use for matching the DNS query typein the question section. Enum options - IS_IN, IS_NOT_IN. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getMatchCriteria() {
    return matchCriteria;
  }
    
  @VsoMethod
  public void setMatchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  
  public DnsQueryTypeMatch addQueryTypeItem(String queryTypeItem) {
    if (this.queryType == null) {
      this.queryType = new ArrayList<String>();
    }
    this.queryType.add(queryTypeItem);
    return this;
  }
  
  /**
   * DNS query types in the request query . Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX, DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR, DNS_RECORD_ANY. Field introduced in 17.1.1.
   * @return queryType
  **/
  @ApiModelProperty(value = "DNS query types in the request query . Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX, DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR, DNS_RECORD_ANY. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public List<String> getQueryType() {
    return queryType;
  }
    
  @VsoMethod
  public void setQueryType(List<String> queryType) {
    this.queryType = queryType;
  }

  
  public String getObjectID() {
		return "DnsQueryTypeMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsQueryTypeMatch dnsQueryTypeMatch = (DnsQueryTypeMatch) o;
    return Objects.equals(this.matchCriteria, dnsQueryTypeMatch.matchCriteria) &&
        Objects.equals(this.queryType, dnsQueryTypeMatch.queryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCriteria, queryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsQueryTypeMatch {\n");
    
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
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

