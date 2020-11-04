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
    private RateLimiterAction action = null;

    @JsonProperty("burst_sz")
    @JsonInclude(Include.NON_NULL)
    private Integer burstSz;

    @JsonProperty("count")
    @JsonInclude(Include.NON_NULL)
    private Integer count;

    @JsonProperty("explicit_tracking")
    @JsonInclude(Include.NON_NULL)
    private Boolean explicitTracking = false;

    @JsonProperty("fine_grain")
    @JsonInclude(Include.NON_NULL)
    private Boolean fineGrain = false;

    @JsonProperty("http_cookie")
    @JsonInclude(Include.NON_NULL)
    private String httpCookie = null;

    @JsonProperty("http_header")
    @JsonInclude(Include.NON_NULL)
    private String httpHeader = null;

    @JsonProperty("period")
    @JsonInclude(Include.NON_NULL)
    private Integer period;

    @JsonProperty("rate_limiter")
    @JsonInclude(Include.NON_NULL)
    private RateLimiter rateLimiter = null;



  /**
   * This is the getter method this will return the attribute value.
   * Action to perform upon rate limiting.
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
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(RateLimiterAction action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of connections or requests or packets to be let through instantaneously.
   * Allowed values are 10-2500.
   * Special values are 0- 'automatic'.
   * Field deprecated in 18.2.9.
   * @return burstSz
   */
  @VsoMethod
  public Integer getBurstSz() {
    return burstSz;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of connections or requests or packets to be let through instantaneously.
   * Allowed values are 10-2500.
   * Special values are 0- 'automatic'.
   * Field deprecated in 18.2.9.
   * @param burstSz set the burstSz.
   */
  @VsoMethod
  public void setBurstSz(Integer  burstSz) {
    this.burstSz = burstSz;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of connections or requests or packets.
   * Allowed values are 1-1000000000.
   * Special values are 0- 'unlimited'.
   * Field deprecated in 18.2.9.
   * @return count
   */
  @VsoMethod
  public Integer getCount() {
    return count;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of connections or requests or packets.
   * Allowed values are 1-1000000000.
   * Special values are 0- 'unlimited'.
   * Field deprecated in 18.2.9.
   * @param count set the count.
   */
  @VsoMethod
  public void setCount(Integer  count) {
    this.count = count;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Explicitly tracks an attacker across rate periods.
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
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param httpHeader set the httpHeader.
   */
  @VsoMethod
  public void setHttpHeader(String  httpHeader) {
    this.httpHeader = httpHeader;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time value in seconds to enforce rate count.
   * Allowed values are 1-300.
   * Field deprecated in 18.2.9.
   * Unit is sec.
   * @return period
   */
  @VsoMethod
  public Integer getPeriod() {
    return period;
  }

  /**
   * This is the setter method to the attribute.
   * Time value in seconds to enforce rate count.
   * Allowed values are 1-300.
   * Field deprecated in 18.2.9.
   * Unit is sec.
   * @param period set the period.
   */
  @VsoMethod
  public void setPeriod(Integer  period) {
    this.period = period;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The rate limiter configuration for this rate profile.
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
   * The rate limiter configuration for this rate profile.
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
  RateProfile objRateProfile = (RateProfile) o;
  return   Objects.equals(this.count, objRateProfile.count)&&
  Objects.equals(this.burstSz, objRateProfile.burstSz)&&
  Objects.equals(this.period, objRateProfile.period)&&
  Objects.equals(this.explicitTracking, objRateProfile.explicitTracking)&&
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
        sb.append("    burstSz: ").append(toIndentedString(burstSz)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    explicitTracking: ").append(toIndentedString(explicitTracking)).append("\n");
        sb.append("    fineGrain: ").append(toIndentedString(fineGrain)).append("\n");
        sb.append("    httpCookie: ").append(toIndentedString(httpCookie)).append("\n");
        sb.append("    httpHeader: ").append(toIndentedString(httpHeader)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

