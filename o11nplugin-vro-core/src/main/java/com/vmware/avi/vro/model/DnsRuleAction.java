package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.DnsRuleActionAllowDrop;
import com.vmware.avi.vro.model.DnsRateProfile;
import com.vmware.avi.vro.model.DnsRateLimiter;
import com.vmware.avi.vro.model.DnsRuleActionGslbSiteSelection;
import com.vmware.avi.vro.model.DnsRuleActionPoolSwitching;
import com.vmware.avi.vro.model.DnsRuleActionResponse;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DnsRuleAction is a POJO class extends AviRestResource that used for creating
 * DnsRuleAction.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsRuleAction")
@VsoFinder(name = Constants.FINDER_VRO_DNSRULEACTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsRuleAction extends AviRestResource {
  @JsonProperty("allow")
  @JsonInclude(Include.NON_NULL)
  private DnsRuleActionAllowDrop allow = null;

  @JsonProperty("dns_rate_limit")
  @JsonInclude(Include.NON_NULL)
  private DnsRateProfile dnsRateLimit = null;

  @JsonProperty("dns_rate_limiter")
  @JsonInclude(Include.NON_NULL)
  private DnsRateLimiter dnsRateLimiter = null;

  @JsonProperty("gslb_site_selection")
  @JsonInclude(Include.NON_NULL)
  private DnsRuleActionGslbSiteSelection gslbSiteSelection = null;

  @JsonProperty("pool_switching")
  @JsonInclude(Include.NON_NULL)
  private DnsRuleActionPoolSwitching poolSwitching = null;

  @JsonProperty("response")
  @JsonInclude(Include.NON_NULL)
  private DnsRuleActionResponse response = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allow or drop the dns query.
   * Field introduced in 17.1.1.
   * @return allow
   */
  @VsoMethod
  public DnsRuleActionAllowDrop getAllow() {
    return allow;
  }

  /**
   * This is the setter method to the attribute.
   * Allow or drop the dns query.
   * Field introduced in 17.1.1.
   * @param allow set the allow.
   */
  @VsoMethod
  public void setAllow(DnsRuleActionAllowDrop allow) {
    this.allow = allow;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limits the dns requests.
   * Field deprecated in 20.1.1.
   * Field introduced in 18.2.5.
   * @return dnsRateLimit
   */
  @VsoMethod
  public DnsRateProfile getDnsRateLimit() {
    return dnsRateLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limits the dns requests.
   * Field deprecated in 20.1.1.
   * Field introduced in 18.2.5.
   * @param dnsRateLimit set the dnsRateLimit.
   */
  @VsoMethod
  public void setDnsRateLimit(DnsRateProfile dnsRateLimit) {
    this.dnsRateLimit = dnsRateLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limits the dns requests.
   * Field introduced in 20.1.1.
   * @return dnsRateLimiter
   */
  @VsoMethod
  public DnsRateLimiter getDnsRateLimiter() {
    return dnsRateLimiter;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limits the dns requests.
   * Field introduced in 20.1.1.
   * @param dnsRateLimiter set the dnsRateLimiter.
   */
  @VsoMethod
  public void setDnsRateLimiter(DnsRateLimiter dnsRateLimiter) {
    this.dnsRateLimiter = dnsRateLimiter;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Select a specific gslb site for the dns query.
   * This action should be used only when gslb services have been configured for the dns virtual service.
   * Field introduced in 17.1.5.
   * @return gslbSiteSelection
   */
  @VsoMethod
  public DnsRuleActionGslbSiteSelection getGslbSiteSelection() {
    return gslbSiteSelection;
  }

  /**
   * This is the setter method to the attribute.
   * Select a specific gslb site for the dns query.
   * This action should be used only when gslb services have been configured for the dns virtual service.
   * Field introduced in 17.1.5.
   * @param gslbSiteSelection set the gslbSiteSelection.
   */
  @VsoMethod
  public void setGslbSiteSelection(DnsRuleActionGslbSiteSelection gslbSiteSelection) {
    this.gslbSiteSelection = gslbSiteSelection;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Select a pool or pool group for the passthrough dns query which cannot be served locally but could be served by upstream servers.
   * Field introduced in 18.1.3, 17.2.12.
   * @return poolSwitching
   */
  @VsoMethod
  public DnsRuleActionPoolSwitching getPoolSwitching() {
    return poolSwitching;
  }

  /**
   * This is the setter method to the attribute.
   * Select a pool or pool group for the passthrough dns query which cannot be served locally but could be served by upstream servers.
   * Field introduced in 18.1.3, 17.2.12.
   * @param poolSwitching set the poolSwitching.
   */
  @VsoMethod
  public void setPoolSwitching(DnsRuleActionPoolSwitching poolSwitching) {
    this.poolSwitching = poolSwitching;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Generate a response for the dns query.
   * Field introduced in 17.1.1.
   * @return response
   */
  @VsoMethod
  public DnsRuleActionResponse getResponse() {
    return response;
  }

  /**
   * This is the setter method to the attribute.
   * Generate a response for the dns query.
   * Field introduced in 17.1.1.
   * @param response set the response.
   */
  @VsoMethod
  public void setResponse(DnsRuleActionResponse response) {
    this.response = response;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsRuleAction objDnsRuleAction = (DnsRuleAction) o;
  return   Objects.equals(this.dnsRateLimiter, objDnsRuleAction.dnsRateLimiter)&&
  Objects.equals(this.dnsRateLimit, objDnsRuleAction.dnsRateLimit)&&
  Objects.equals(this.poolSwitching, objDnsRuleAction.poolSwitching)&&
  Objects.equals(this.gslbSiteSelection, objDnsRuleAction.gslbSiteSelection)&&
  Objects.equals(this.allow, objDnsRuleAction.allow)&&
  Objects.equals(this.response, objDnsRuleAction.response);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsRuleAction {\n");
      sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
        sb.append("    dnsRateLimit: ").append(toIndentedString(dnsRateLimit)).append("\n");
        sb.append("    dnsRateLimiter: ").append(toIndentedString(dnsRateLimiter)).append("\n");
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
