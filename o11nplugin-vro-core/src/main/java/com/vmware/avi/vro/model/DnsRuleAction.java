package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DnsRateProfile;
import com.vmware.avi.vro.model.DnsRuleActionAllowDrop;
import com.vmware.avi.vro.model.DnsRuleActionGslbSiteSelection;
import com.vmware.avi.vro.model.DnsRuleActionPoolSwitching;
import com.vmware.avi.vro.model.DnsRuleActionResponse;
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
 * DnsRuleAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsRuleAction")
@VsoFinder(name = Constants.FINDER_VRO_DNSRULEACTION, idAccessor = "getObjectID()")
@Service
public class DnsRuleAction extends AviRestResource  {
  @JsonProperty("allow")
  private DnsRuleActionAllowDrop allow = null;

  @JsonProperty("dns_rate_limit")
  private DnsRateProfile dnsRateLimit = null;

  @JsonProperty("gslb_site_selection")
  private DnsRuleActionGslbSiteSelection gslbSiteSelection = null;

  @JsonProperty("pool_switching")
  private DnsRuleActionPoolSwitching poolSwitching = null;

  @JsonProperty("response")
  private DnsRuleActionResponse response = null;

  
  /**
   * Allow or drop the DNS query. Field introduced in 17.1.1.
   * @return allow
  **/
  @ApiModelProperty(value = "Allow or drop the DNS query. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public DnsRuleActionAllowDrop getAllow() {
    return allow;
  }
    
  @VsoMethod
  public void setAllow(DnsRuleActionAllowDrop allow) {
    this.allow = allow;
  }

  
  /**
   * Rate limit the DNS requests. Field introduced in 18.2.5.
   * @return dnsRateLimit
  **/
  @ApiModelProperty(value = "Rate limit the DNS requests. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public DnsRateProfile getDnsRateLimit() {
    return dnsRateLimit;
  }
    
  @VsoMethod
  public void setDnsRateLimit(DnsRateProfile dnsRateLimit) {
    this.dnsRateLimit = dnsRateLimit;
  }

  
  /**
   * Select a specific GSLB site for the DNS query. This action should be used only when GSLB services have been configured for the DNS virtual service. Field introduced in 17.1.5.
   * @return gslbSiteSelection
  **/
  @ApiModelProperty(value = "Select a specific GSLB site for the DNS query. This action should be used only when GSLB services have been configured for the DNS virtual service. Field introduced in 17.1.5.")

  @Valid

 
  @VsoMethod  
  public DnsRuleActionGslbSiteSelection getGslbSiteSelection() {
    return gslbSiteSelection;
  }
    
  @VsoMethod
  public void setGslbSiteSelection(DnsRuleActionGslbSiteSelection gslbSiteSelection) {
    this.gslbSiteSelection = gslbSiteSelection;
  }

  
  /**
   * Select a pool or pool group for the passthrough DNS query which cannot be served locally but could be served by upstream servers. Field introduced in 18.1.3, 17.2.12.
   * @return poolSwitching
  **/
  @ApiModelProperty(value = "Select a pool or pool group for the passthrough DNS query which cannot be served locally but could be served by upstream servers. Field introduced in 18.1.3, 17.2.12.")

  @Valid

 
  @VsoMethod  
  public DnsRuleActionPoolSwitching getPoolSwitching() {
    return poolSwitching;
  }
    
  @VsoMethod
  public void setPoolSwitching(DnsRuleActionPoolSwitching poolSwitching) {
    this.poolSwitching = poolSwitching;
  }

  
  /**
   * Generate a response for the DNS query. Field introduced in 17.1.1.
   * @return response
  **/
  @ApiModelProperty(value = "Generate a response for the DNS query. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public DnsRuleActionResponse getResponse() {
    return response;
  }
    
  @VsoMethod
  public void setResponse(DnsRuleActionResponse response) {
    this.response = response;
  }

  
  public String getObjectID() {
		return "DnsRuleAction";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRuleAction dnsRuleAction = (DnsRuleAction) o;
    return Objects.equals(this.allow, dnsRuleAction.allow) &&
        Objects.equals(this.dnsRateLimit, dnsRuleAction.dnsRateLimit) &&
        Objects.equals(this.gslbSiteSelection, dnsRuleAction.gslbSiteSelection) &&
        Objects.equals(this.poolSwitching, dnsRuleAction.poolSwitching) &&
        Objects.equals(this.response, dnsRuleAction.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allow, dnsRateLimit, gslbSiteSelection, poolSwitching, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRuleAction {\n");
    
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
    sb.append("    dnsRateLimit: ").append(toIndentedString(dnsRateLimit)).append("\n");
    sb.append("    gslbSiteSelection: ").append(toIndentedString(gslbSiteSelection)).append("\n");
    sb.append("    poolSwitching: ").append(toIndentedString(poolSwitching)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

