package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.RateLimiterAction;
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
 * RateProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "RateProfile")
@VsoFinder(name = Constants.FINDER_VRO_RATEPROFILE, idAccessor = "getObjectID()")
@Service
public class RateProfile extends AviRestResource  {
  @JsonProperty("action")
  private RateLimiterAction action = null;

  @JsonProperty("burst_sz")
  private Integer burstSz = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("explicit_tracking")
  private Boolean explicitTracking = null;

  @JsonProperty("fine_grain")
  private Boolean fineGrain = null;

  @JsonProperty("http_cookie")
  private String httpCookie = null;

  @JsonProperty("http_header")
  private String httpHeader = null;

  @JsonProperty("period")
  private Integer period = 1;

  
  /**
   * Action to perform upon rate limiting.
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Action to perform upon rate limiting.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public RateLimiterAction getAction() {
    return action;
  }
    
  @VsoMethod
  public void setAction(RateLimiterAction action) {
    this.action = action;
  }

  
  /**
   * Maximum number of connections or requests or packets to be let through instantaneously. Allowed values are 10-2500. Special values are 0- 'automatic'.
   * @return burstSz
  **/
  @ApiModelProperty(value = "Maximum number of connections or requests or packets to be let through instantaneously. Allowed values are 10-2500. Special values are 0- 'automatic'.")


 
  @VsoMethod  
  public Integer getBurstSz() {
    return burstSz;
  }
    
  @VsoMethod
  public void setBurstSz(Integer burstSz) {
    this.burstSz = burstSz;
  }

  
  /**
   * Maximum number of connections or requests or packets. Allowed values are 1-1000000000. Special values are 0- 'unlimited'.
   * @return count
  **/
  @ApiModelProperty(value = "Maximum number of connections or requests or packets. Allowed values are 1-1000000000. Special values are 0- 'unlimited'.")


 
  @VsoMethod  
  public Integer getCount() {
    return count;
  }
    
  @VsoMethod
  public void setCount(Integer count) {
    this.count = count;
  }

  
  /**
   * Explicitly tracks an attacker across rate periods.
   * @return explicitTracking
  **/
  @ApiModelProperty(value = "Explicitly tracks an attacker across rate periods.")


 
  @VsoMethod  
  public Boolean isExplicitTracking() {
    return explicitTracking;
  }
    
  @VsoMethod
  public void setExplicitTracking(Boolean explicitTracking) {
    this.explicitTracking = explicitTracking;
  }

  
  /**
   * Enable fine granularity.
   * @return fineGrain
  **/
  @ApiModelProperty(value = "Enable fine granularity.")


 
  @VsoMethod  
  public Boolean isFineGrain() {
    return fineGrain;
  }
    
  @VsoMethod
  public void setFineGrain(Boolean fineGrain) {
    this.fineGrain = fineGrain;
  }

  
  /**
   * HTTP cookie name. Field introduced in 17.1.1.
   * @return httpCookie
  **/
  @ApiModelProperty(value = "HTTP cookie name. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getHttpCookie() {
    return httpCookie;
  }
    
  @VsoMethod
  public void setHttpCookie(String httpCookie) {
    this.httpCookie = httpCookie;
  }

  
  /**
   * HTTP header name. Field introduced in 17.1.1.
   * @return httpHeader
  **/
  @ApiModelProperty(value = "HTTP header name. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getHttpHeader() {
    return httpHeader;
  }
    
  @VsoMethod
  public void setHttpHeader(String httpHeader) {
    this.httpHeader = httpHeader;
  }

  
  /**
   * Time value in seconds to enforce rate count. Allowed values are 1-300.
   * @return period
  **/
  @ApiModelProperty(value = "Time value in seconds to enforce rate count. Allowed values are 1-300.")


 
  @VsoMethod  
  public Integer getPeriod() {
    return period;
  }
    
  @VsoMethod
  public void setPeriod(Integer period) {
    this.period = period;
  }

  
  public String getObjectID() {
		return "RateProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateProfile rateProfile = (RateProfile) o;
    return Objects.equals(this.action, rateProfile.action) &&
        Objects.equals(this.burstSz, rateProfile.burstSz) &&
        Objects.equals(this.count, rateProfile.count) &&
        Objects.equals(this.explicitTracking, rateProfile.explicitTracking) &&
        Objects.equals(this.fineGrain, rateProfile.fineGrain) &&
        Objects.equals(this.httpCookie, rateProfile.httpCookie) &&
        Objects.equals(this.httpHeader, rateProfile.httpHeader) &&
        Objects.equals(this.period, rateProfile.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, burstSz, count, explicitTracking, fineGrain, httpCookie, httpHeader, period);
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

