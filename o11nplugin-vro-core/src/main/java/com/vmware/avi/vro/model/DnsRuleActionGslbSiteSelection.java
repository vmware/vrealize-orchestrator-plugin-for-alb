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
 * DnsRuleActionGslbSiteSelection
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsRuleActionGslbSiteSelection")
@VsoFinder(name = Constants.FINDER_VRO_DNSRULEACTIONGSLBSITESELECTION, idAccessor = "getObjectID()")
@Service
public class DnsRuleActionGslbSiteSelection extends AviRestResource  {
  @JsonProperty("fallback_site_names")
  @Valid
  private List<String> fallbackSiteNames = null;

  @JsonProperty("is_site_preferred")
  private Boolean isSitePreferred = true;

  @JsonProperty("site_name")
  private String siteName = null;

  
  public DnsRuleActionGslbSiteSelection addFallbackSiteNamesItem(String fallbackSiteNamesItem) {
    if (this.fallbackSiteNames == null) {
      this.fallbackSiteNames = new ArrayList<String>();
    }
    this.fallbackSiteNames.add(fallbackSiteNamesItem);
    return this;
  }
  
  /**
   * GSLB fallback sites to use in case the desired site is down. Field introduced in 17.2.5.
   * @return fallbackSiteNames
  **/
  @ApiModelProperty(value = "GSLB fallback sites to use in case the desired site is down. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public List<String> getFallbackSiteNames() {
    return fallbackSiteNames;
  }
    
  @VsoMethod
  public void setFallbackSiteNames(List<String> fallbackSiteNames) {
    this.fallbackSiteNames = fallbackSiteNames;
  }

  
  /**
   * When set to true, GSLB site is a preferred site. This setting comes into play when the site is down, as well as no configured fallback site is available (all fallback sites are also down), then any one available site is selected based on the default algorithm for GSLB pool member selection. Field introduced in 17.2.5.
   * @return isSitePreferred
  **/
  @ApiModelProperty(value = "When set to true, GSLB site is a preferred site. This setting comes into play when the site is down, as well as no configured fallback site is available (all fallback sites are also down), then any one available site is selected based on the default algorithm for GSLB pool member selection. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public Boolean isIsSitePreferred() {
    return isSitePreferred;
  }
    
  @VsoMethod
  public void setIsSitePreferred(Boolean isSitePreferred) {
    this.isSitePreferred = isSitePreferred;
  }

  
  /**
   * GSLB site name. Field introduced in 17.1.5.
   * @return siteName
  **/
  @ApiModelProperty(required = true, value = "GSLB site name. Field introduced in 17.1.5.")
  @NotNull


 
  @VsoMethod  
  public String getSiteName() {
    return siteName;
  }
    
  @VsoMethod
  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  
  public String getObjectID() {
		return "DnsRuleActionGslbSiteSelection";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRuleActionGslbSiteSelection dnsRuleActionGslbSiteSelection = (DnsRuleActionGslbSiteSelection) o;
    return Objects.equals(this.fallbackSiteNames, dnsRuleActionGslbSiteSelection.fallbackSiteNames) &&
        Objects.equals(this.isSitePreferred, dnsRuleActionGslbSiteSelection.isSitePreferred) &&
        Objects.equals(this.siteName, dnsRuleActionGslbSiteSelection.siteName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fallbackSiteNames, isSitePreferred, siteName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRuleActionGslbSiteSelection {\n");
    
    sb.append("    fallbackSiteNames: ").append(toIndentedString(fallbackSiteNames)).append("\n");
    sb.append("    isSitePreferred: ").append(toIndentedString(isSitePreferred)).append("\n");
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
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

