package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.RateLimiter;
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
 * HTTPSecurityActionRateProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPSecurityActionRateProfile")
@VsoFinder(name = Constants.FINDER_VRO_HTTPSECURITYACTIONRATEPROFILE, idAccessor = "getObjectID()")
@Service
public class HTTPSecurityActionRateProfile extends AviRestResource  {
  @JsonProperty("action")
  private RateLimiterAction action = null;

  @JsonProperty("per_client_ip")
  private Boolean perClientIp = null;

  @JsonProperty("per_uri_path")
  private Boolean perUriPath = null;

  @JsonProperty("rate_limiter")
  private RateLimiter rateLimiter = null;

  
  /**
   * The action to take when the rate limit has been reached. Field introduced in 20.1.1.
   * @return action
  **/
  @ApiModelProperty(required = true, value = "The action to take when the rate limit has been reached. Field introduced in 20.1.1.")
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
   * Rate limiting should be done on a per client ip basis. Field introduced in 20.1.1.
   * @return perClientIp
  **/
  @ApiModelProperty(value = "Rate limiting should be done on a per client ip basis. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isPerClientIp() {
    return perClientIp;
  }
    
  @VsoMethod
  public void setPerClientIp(Boolean perClientIp) {
    this.perClientIp = perClientIp;
  }

  
  /**
   * Rate limiting should be done on a per request uri path basis. Field introduced in 20.1.1.
   * @return perUriPath
  **/
  @ApiModelProperty(value = "Rate limiting should be done on a per request uri path basis. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isPerUriPath() {
    return perUriPath;
  }
    
  @VsoMethod
  public void setPerUriPath(Boolean perUriPath) {
    this.perUriPath = perUriPath;
  }

  
  /**
   * The rate limiter used when this action is triggered. Field introduced in 20.1.1.
   * @return rateLimiter
  **/
  @ApiModelProperty(required = true, value = "The rate limiter used when this action is triggered. Field introduced in 20.1.1.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public RateLimiter getRateLimiter() {
    return rateLimiter;
  }
    
  @VsoMethod
  public void setRateLimiter(RateLimiter rateLimiter) {
    this.rateLimiter = rateLimiter;
  }

  
  public String getObjectID() {
		return "HTTPSecurityActionRateProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPSecurityActionRateProfile htTPSecurityActionRateProfile = (HTTPSecurityActionRateProfile) o;
    return Objects.equals(this.action, htTPSecurityActionRateProfile.action) &&
        Objects.equals(this.perClientIp, htTPSecurityActionRateProfile.perClientIp) &&
        Objects.equals(this.perUriPath, htTPSecurityActionRateProfile.perUriPath) &&
        Objects.equals(this.rateLimiter, htTPSecurityActionRateProfile.rateLimiter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, perClientIp, perUriPath, rateLimiter);
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

