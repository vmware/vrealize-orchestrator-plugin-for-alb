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
 * The RateProfile is a POJO class extends AviRestResource that used for creating
 * RateProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RateProfile")
@VsoFinder(name = Constants.FINDER_VRO_RATEPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RateProfile extends AviRestResource {
    @JsonProperty("action")
    @JsonInclude(Include.NON_NULL)
    private RateLimiterAction action;

    @JsonProperty("explicit_tracking")
    @JsonInclude(Include.NON_NULL)
    private Boolean explicitTracking = false;

    @JsonProperty("fine_grain")
    @JsonInclude(Include.NON_NULL)
    private Boolean fineGrain = false;

    @JsonProperty("http_cookie")
    @JsonInclude(Include.NON_NULL)
    private String httpCookie;

    @JsonProperty("http_header")
    @JsonInclude(Include.NON_NULL)
    private String httpHeader;

    @JsonProperty("rate_limiter")
    @JsonInclude(Include.NON_NULL)
    private RateLimiter rateLimiter;



  /**
   * This is the getter method this will return the attribute value.
   * Action to perform upon rate limiting.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return action
   */
  @VsoMethod
  public RateLimiterAction getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Action to perform upon rate limiting.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(RateLimiterAction action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Explicitly tracks an attacker across rate periods.
   * Allowed in enterprise edition with any value, basic edition(allowed values- false), essentials, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return explicitTracking
   */
  @VsoMethod
  public Boolean getExplicitTracking() {
    return explicitTracking;
  }

  /**
   * This is the setter method to the attribute.
   * Explicitly tracks an attacker across rate periods.
   * Allowed in enterprise edition with any value, basic edition(allowed values- false), essentials, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param explicitTracking set the explicitTracking.
   */
  @VsoMethod
  public void setExplicitTracking(Boolean  explicitTracking) {
    this.explicitTracking = explicitTracking;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable fine granularity.
   * Allowed in enterprise edition with any value, basic edition(allowed values- false), essentials, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return fineGrain
   */
  @VsoMethod
  public Boolean getFineGrain() {
    return fineGrain;
  }

  /**
   * This is the setter method to the attribute.
   * Enable fine granularity.
   * Allowed in enterprise edition with any value, basic edition(allowed values- false), essentials, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param fineGrain set the fineGrain.
   */
  @VsoMethod
  public void setFineGrain(Boolean  fineGrain) {
    this.fineGrain = fineGrain;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http cookie name.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpCookie
   */
  @VsoMethod
  public String getHttpCookie() {
    return httpCookie;
  }

  /**
   * This is the setter method to the attribute.
   * Http cookie name.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param httpCookie set the httpCookie.
   */
  @VsoMethod
  public void setHttpCookie(String  httpCookie) {
    this.httpCookie = httpCookie;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http header name.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpHeader
   */
  @VsoMethod
  public String getHttpHeader() {
    return httpHeader;
  }

  /**
   * This is the setter method to the attribute.
   * Http header name.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param httpHeader set the httpHeader.
   */
  @VsoMethod
  public void setHttpHeader(String  httpHeader) {
    this.httpHeader = httpHeader;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The rate limiter configuration for this rate profile.
   * Field introduced in 18.2.9.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rateLimiter
   */
  @VsoMethod
  public RateLimiter getRateLimiter() {
    return rateLimiter;
  }

  /**
   * This is the setter method to the attribute.
   * The rate limiter configuration for this rate profile.
   * Field introduced in 18.2.9.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
  RateProfile objRateProfile = (RateProfile) o;
  return   Objects.equals(this.explicitTracking, objRateProfile.explicitTracking)&&
  Objects.equals(this.fineGrain, objRateProfile.fineGrain)&&
  Objects.equals(this.action, objRateProfile.action)&&
  Objects.equals(this.httpHeader, objRateProfile.httpHeader)&&
  Objects.equals(this.httpCookie, objRateProfile.httpCookie)&&
  Objects.equals(this.rateLimiter, objRateProfile.rateLimiter);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RateProfile {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    explicitTracking: ").append(toIndentedString(explicitTracking)).append("\n");
        sb.append("    fineGrain: ").append(toIndentedString(fineGrain)).append("\n");
        sb.append("    httpCookie: ").append(toIndentedString(httpCookie)).append("\n");
        sb.append("    httpHeader: ").append(toIndentedString(httpHeader)).append("\n");
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

