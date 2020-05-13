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
 * GslbSiteDnsVs
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GslbSiteDnsVs")
@VsoFinder(name = Constants.FINDER_VRO_GSLBSITEDNSVS, idAccessor = "getObjectID()")
@Service
public class GslbSiteDnsVs extends AviRestResource  {
  @JsonProperty("dns_vs_uuid")
  private String dnsVsUuid = null;

  @JsonProperty("domain_names")
  @Valid
  private List<String> domainNames = null;

  
  /**
   * This field identifies the DNS VS uuid for this site. Field introduced in 17.2.3.
   * @return dnsVsUuid
  **/
  @ApiModelProperty(required = true, value = "This field identifies the DNS VS uuid for this site. Field introduced in 17.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getDnsVsUuid() {
    return dnsVsUuid;
  }
    
  @VsoMethod
  public void setDnsVsUuid(String dnsVsUuid) {
    this.dnsVsUuid = dnsVsUuid;
  }

  
  public GslbSiteDnsVs addDomainNamesItem(String domainNamesItem) {
    if (this.domainNames == null) {
      this.domainNames = new ArrayList<String>();
    }
    this.domainNames.add(domainNamesItem);
    return this;
  }
  
  /**
   * This field identifies the subdomains that are hosted on the DNS VS. GslbService(s) whose FQDNs map to one of the subdomains will be hosted on this DNS VS. If no subdomains are configured, then the default behavior is to host all the GslbServices on this DNS VS. Field introduced in 17.2.3.
   * @return domainNames
  **/
  @ApiModelProperty(value = "This field identifies the subdomains that are hosted on the DNS VS. GslbService(s) whose FQDNs map to one of the subdomains will be hosted on this DNS VS. If no subdomains are configured, then the default behavior is to host all the GslbServices on this DNS VS. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public List<String> getDomainNames() {
    return domainNames;
  }
    
  @VsoMethod
  public void setDomainNames(List<String> domainNames) {
    this.domainNames = domainNames;
  }

  
  public String getObjectID() {
		return "GslbSiteDnsVs";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GslbSiteDnsVs gslbSiteDnsVs = (GslbSiteDnsVs) o;
    return Objects.equals(this.dnsVsUuid, gslbSiteDnsVs.dnsVsUuid) &&
        Objects.equals(this.domainNames, gslbSiteDnsVs.domainNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsVsUuid, domainNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GslbSiteDnsVs {\n");
    
    sb.append("    dnsVsUuid: ").append(toIndentedString(dnsVsUuid)).append("\n");
    sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
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

