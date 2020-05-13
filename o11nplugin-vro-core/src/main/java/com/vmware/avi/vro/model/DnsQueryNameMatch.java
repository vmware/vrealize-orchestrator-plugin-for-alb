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
 * DnsQueryNameMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsQueryNameMatch")
@VsoFinder(name = Constants.FINDER_VRO_DNSQUERYNAMEMATCH, idAccessor = "getObjectID()")
@Service
public class DnsQueryNameMatch extends AviRestResource  {
  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  @JsonProperty("query_domain_names")
  @Valid
  private List<String> queryDomainNames = null;

  @JsonProperty("string_group_refs")
  @Valid
  private List<String> stringGroupRefs = null;

  
  /**
   * Criterion to use for string matching the DNS query domain name in the question section. Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH, REGEX_DOES_NOT_MATCH. Field introduced in 17.1.1.
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "Criterion to use for string matching the DNS query domain name in the question section. Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH, REGEX_DOES_NOT_MATCH. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getMatchCriteria() {
    return matchCriteria;
  }
    
  @VsoMethod
  public void setMatchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  
  public DnsQueryNameMatch addQueryDomainNamesItem(String queryDomainNamesItem) {
    if (this.queryDomainNames == null) {
      this.queryDomainNames = new ArrayList<String>();
    }
    this.queryDomainNames.add(queryDomainNamesItem);
    return this;
  }
  
  /**
   * Domain name to match against that specified in the question section of the DNS query. Field introduced in 17.1.1.
   * @return queryDomainNames
  **/
  @ApiModelProperty(value = "Domain name to match against that specified in the question section of the DNS query. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public List<String> getQueryDomainNames() {
    return queryDomainNames;
  }
    
  @VsoMethod
  public void setQueryDomainNames(List<String> queryDomainNames) {
    this.queryDomainNames = queryDomainNames;
  }

  
  public DnsQueryNameMatch addStringGroupRefsItem(String stringGroupRefsItem) {
    if (this.stringGroupRefs == null) {
      this.stringGroupRefs = new ArrayList<String>();
    }
    this.stringGroupRefs.add(stringGroupRefsItem);
    return this;
  }
  
  /**
   * UUID of the string group(s) for matching against DNS query domain name in the question section. It is a reference to an object of type StringGroup. Field introduced in 17.1.1.
   * @return stringGroupRefs
  **/
  @ApiModelProperty(value = "UUID of the string group(s) for matching against DNS query domain name in the question section. It is a reference to an object of type StringGroup. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public List<String> getStringGroupRefs() {
    return stringGroupRefs;
  }
    
  @VsoMethod
  public void setStringGroupRefs(List<String> stringGroupRefs) {
    this.stringGroupRefs = stringGroupRefs;
  }

  
  public String getObjectID() {
		return "DnsQueryNameMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsQueryNameMatch dnsQueryNameMatch = (DnsQueryNameMatch) o;
    return Objects.equals(this.matchCriteria, dnsQueryNameMatch.matchCriteria) &&
        Objects.equals(this.queryDomainNames, dnsQueryNameMatch.queryDomainNames) &&
        Objects.equals(this.stringGroupRefs, dnsQueryNameMatch.stringGroupRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCriteria, queryDomainNames, stringGroupRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsQueryNameMatch {\n");
    
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
    sb.append("    queryDomainNames: ").append(toIndentedString(queryDomainNames)).append("\n");
    sb.append("    stringGroupRefs: ").append(toIndentedString(stringGroupRefs)).append("\n");
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

