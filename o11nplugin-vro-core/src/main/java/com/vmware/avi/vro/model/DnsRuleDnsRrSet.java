package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DnsRrSet;
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
 * DnsRuleDnsRrSet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsRuleDnsRrSet")
@VsoFinder(name = Constants.FINDER_VRO_DNSRULEDNSRRSET, idAccessor = "getObjectID()")
@Service
public class DnsRuleDnsRrSet extends AviRestResource  {
  @JsonProperty("resource_record_set")
  private DnsRrSet resourceRecordSet = null;

  @JsonProperty("section")
  private String section = "DNS_MESSAGE_SECTION_ANSWER";

  
  /**
   * DNS resource record set - (records in the resource record set share the DNS domain name, type, and class). Field introduced in 17.2.12, 18.1.2.
   * @return resourceRecordSet
  **/
  @ApiModelProperty(required = true, value = "DNS resource record set - (records in the resource record set share the DNS domain name, type, and class). Field introduced in 17.2.12, 18.1.2.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public DnsRrSet getResourceRecordSet() {
    return resourceRecordSet;
  }
    
  @VsoMethod
  public void setResourceRecordSet(DnsRrSet resourceRecordSet) {
    this.resourceRecordSet = resourceRecordSet;
  }

  
  /**
   * DNS message section for the resource record set. Enum options - DNS_MESSAGE_SECTION_QUESTION, DNS_MESSAGE_SECTION_ANSWER, DNS_MESSAGE_SECTION_AUTHORITY, DNS_MESSAGE_SECTION_ADDITIONAL. Field introduced in 17.2.12, 18.1.2.
   * @return section
  **/
  @ApiModelProperty(value = "DNS message section for the resource record set. Enum options - DNS_MESSAGE_SECTION_QUESTION, DNS_MESSAGE_SECTION_ANSWER, DNS_MESSAGE_SECTION_AUTHORITY, DNS_MESSAGE_SECTION_ADDITIONAL. Field introduced in 17.2.12, 18.1.2.")


 
  @VsoMethod  
  public String getSection() {
    return section;
  }
    
  @VsoMethod
  public void setSection(String section) {
    this.section = section;
  }

  
  public String getObjectID() {
		return "DnsRuleDnsRrSet";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRuleDnsRrSet dnsRuleDnsRrSet = (DnsRuleDnsRrSet) o;
    return Objects.equals(this.resourceRecordSet, dnsRuleDnsRrSet.resourceRecordSet) &&
        Objects.equals(this.section, dnsRuleDnsRrSet.section);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceRecordSet, section);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRuleDnsRrSet {\n");
    
    sb.append("    resourceRecordSet: ").append(toIndentedString(resourceRecordSet)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
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

