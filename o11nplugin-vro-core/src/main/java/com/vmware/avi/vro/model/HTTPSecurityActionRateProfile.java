package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.RateLimiterAction;
import com.vmware.avi.vro.model.RateLimiter;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HTTPSecurityActionRateProfile is a POJO class extends AviRestResource that used for creating
 * HTTPSecurityActionRateProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPSecurityActionRateProfile")
@VsoFinder(name = Constants.FINDER_VRO_HTTPSECURITYACTIONRATEPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPSecurityActionRateProfile extends AviRestResource {
    @JsonProperty("action")
    @JsonInclude(Include.NON_NULL)
    private RateLimiterAction action = null;

    @JsonProperty("per_client_ip")
    @JsonInclude(Include.NON_NULL)
    private Boolean perClientIp = null;

    @JsonProperty("per_uri_path")
    @JsonInclude(Include.NON_NULL)
    private Boolean perUriPath = null;

    @JsonProperty("rate_limiter")
    @JsonInclude(Include.NON_NULL)
    private RateLimiter rateLimiter = null;



  /**
   * This is the getter method this will return the attribute value.
   * The action to take when the rate limit has been reached.
   * Field introduced in 18.2.9.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return action
   */
  @VsoMethod
  public RateLimiterAction getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * The action to take when the rate limit has been reached.
   * Field introduced in 18.2.9.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(RateLimiterAction action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limiting should be done on a per client ip basis.
   * Field introduced in 18.2.9.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return perClientIp
   */
  @VsoMethod
  public Boolean getPerClientIp() {
    return perClientIp;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limiting should be done on a per client ip basis.
   * Field introduced in 18.2.9.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param perClientIp set the perClientIp.
   */
  @VsoMethod
  public void setPerClientIp(Boolean  perClientIp) {
    this.perClientIp = perClientIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limiting should be done on a per request uri path basis.
   * Field introduced in 18.2.9.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return perUriPath
   */
  @VsoMethod
  public Boolean getPerUriPath() {
    return perUriPath;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limiting should be done on a per request uri path basis.
   * Field introduced in 18.2.9.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param perUriPath set the perUriPath.
   */
  @VsoMethod
  public void setPerUriPath(Boolean  perUriPath) {
    this.perUriPath = perUriPath;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The rate limiter used when this action is triggered.
   * Field introduced in 18.2.9.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rateLimiter
   */
  @VsoMethod
  public RateLimiter getRateLimiter() {
    return rateLimiter;
  }

  /**
   * This is the setter method to the attribute.
   * The rate limiter used when this action is triggered.
   * Field introduced in 18.2.9.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rateLimiter set the rateLimiter.
   */
  @VsoMethod
  public void setRateLimiter(RateLimiter rateLimiter) {
    this.rateLimiter = rateLimiter;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTPSecurityActionRateProfile objHTTPSecurityActionRateProfile = (HTTPSecurityActionRateProfile) o;
  return   Objects.equals(this.rateLimiter, objHTTPSecurityActionRateProfile.rateLimiter)&&
  Objects.equals(this.action, objHTTPSecurityActionRateProfile.action)&&
  Objects.equals(this.perClientIp, objHTTPSecurityActionRateProfile.perClientIp)&&
  Objects.equals(this.perUriPath, objHTTPSecurityActionRateProfile.perUriPath);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HTTPSecurityActionRateProfile {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    perClientIp: ").append(toIndentedString(perClientIp)).append("\n");
        sb.append("    perUriPath: ").append(toIndentedString(perUriPath)).append("\n");
        sb.append("    rateLimiter: ").append(toIndentedString(rateLimiter)).append("\n");
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

