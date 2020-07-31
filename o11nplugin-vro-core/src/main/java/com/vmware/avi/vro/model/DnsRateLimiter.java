package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.DnsRuleRLAction;
import com.vmware.avi.vro.model.RateLimiter;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DnsRateLimiter is a POJO class extends AviRestResource that used for creating
 * DnsRateLimiter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsRateLimiter")
@VsoFinder(name = Constants.FINDER_VRO_DNSRATELIMITER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsRateLimiter extends AviRestResource {
  @JsonProperty("action")
  @JsonInclude(Include.NON_NULL)
  private DnsRuleRLAction action = null;

  @JsonProperty("rate_limiter_object")
  @JsonInclude(Include.NON_NULL)
  private RateLimiter rateLimiterObject = null;



  /**
   * This is the getter method this will return the attribute value.
   * Action to perform upon rate limiting.
   * Field introduced in 20.1.1.
   * @return action
   */
  @VsoMethod
  public DnsRuleRLAction getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Action to perform upon rate limiting.
   * Field introduced in 20.1.1.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(DnsRuleRLAction action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limiting object.
   * Field introduced in 20.1.1.
   * @return rateLimiterObject
   */
  @VsoMethod
  public RateLimiter getRateLimiterObject() {
    return rateLimiterObject;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limiting object.
   * Field introduced in 20.1.1.
   * @param rateLimiterObject set the rateLimiterObject.
   */
  @VsoMethod
  public void setRateLimiterObject(RateLimiter rateLimiterObject) {
    this.rateLimiterObject = rateLimiterObject;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsRateLimiter objDnsRateLimiter = (DnsRateLimiter) o;
  return   Objects.equals(this.rateLimiterObject, objDnsRateLimiter.rateLimiterObject)&&
  Objects.equals(this.action, objDnsRateLimiter.action);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsRateLimiter {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    rateLimiterObject: ").append(toIndentedString(rateLimiterObject)).append("\n");
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

