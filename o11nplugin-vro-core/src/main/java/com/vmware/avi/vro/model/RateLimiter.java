package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * RateLimiter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "RateLimiter")
@VsoFinder(name = Constants.FINDER_VRO_RATELIMITER, idAccessor = "getObjectID()")
@Service
public class RateLimiter extends AviRestResource  {
  @JsonProperty("burst_sz")
  private Integer burstSz = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("period")
  private Integer period = null;

  
  /**
   * Maximum number of connections or requests or packets to be let through instantaneously. Allowed values are 0-1000000000. Field introduced in 20.1.1.
   * @return burstSz
  **/
  @ApiModelProperty(value = "Maximum number of connections or requests or packets to be let through instantaneously. Allowed values are 0-1000000000. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getBurstSz() {
    return burstSz;
  }
    
  @VsoMethod
  public void setBurstSz(Integer burstSz) {
    this.burstSz = burstSz;
  }

  
  /**
   * Maximum number of connections, requests or packets, should be less than burst size. Allowed values are 1-1000000000. Field introduced in 20.1.1.
   * @return count
  **/
  @ApiModelProperty(required = true, value = "Maximum number of connections, requests or packets, should be less than burst size. Allowed values are 1-1000000000. Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public Integer getCount() {
    return count;
  }
    
  @VsoMethod
  public void setCount(Integer count) {
    this.count = count;
  }

  
  /**
   * Identifier for Rate Limit. Constructed according to context. Field introduced in 20.1.1.
   * @return name
  **/
  @ApiModelProperty(value = "Identifier for Rate Limit. Constructed according to context. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Time value in seconds to enforce rate count. Allowed values are 1-1000000000. Field introduced in 20.1.1.
   * @return period
  **/
  @ApiModelProperty(required = true, value = "Time value in seconds to enforce rate count. Allowed values are 1-1000000000. Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public Integer getPeriod() {
    return period;
  }
    
  @VsoMethod
  public void setPeriod(Integer period) {
    this.period = period;
  }

  
  public String getObjectID() {
		return "RateLimiter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLimiter rateLimiter = (RateLimiter) o;
    return Objects.equals(this.burstSz, rateLimiter.burstSz) &&
        Objects.equals(this.count, rateLimiter.count) &&
        Objects.equals(this.name, rateLimiter.name) &&
        Objects.equals(this.period, rateLimiter.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(burstSz, count, name, period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLimiter {\n");
    
    sb.append("    burstSz: ").append(toIndentedString(burstSz)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

