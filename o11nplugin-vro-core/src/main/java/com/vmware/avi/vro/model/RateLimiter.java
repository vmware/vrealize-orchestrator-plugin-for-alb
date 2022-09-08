package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The RateLimiter is a POJO class extends AviRestResource that used for creating
 * RateLimiter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RateLimiter")
@VsoFinder(name = Constants.FINDER_VRO_RATELIMITER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RateLimiter extends AviRestResource {
    @JsonProperty("burst_sz")
    @JsonInclude(Include.NON_NULL)
    private Integer burstSz = 0;

    @JsonProperty("count")
    @JsonInclude(Include.NON_NULL)
    private Integer count = 1000000000;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("period")
    @JsonInclude(Include.NON_NULL)
    private Integer period = 1;



  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of connections, requests or packets to be let through instantaneously.
   * If this is less than count, it will have no effect.
   * Allowed values are 0-1000000000.
   * Field introduced in 18.2.9.
   * Allowed in enterprise edition with any value, basic edition(allowed values- 0), essentials, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return burstSz
   */
  @VsoMethod
  public Integer getBurstSz() {
    return burstSz;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of connections, requests or packets to be let through instantaneously.
   * If this is less than count, it will have no effect.
   * Allowed values are 0-1000000000.
   * Field introduced in 18.2.9.
   * Allowed in enterprise edition with any value, basic edition(allowed values- 0), essentials, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param burstSz set the burstSz.
   */
  @VsoMethod
  public void setBurstSz(Integer  burstSz) {
    this.burstSz = burstSz;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of connections, requests or packets permitted each period.
   * Allowed values are 1-1000000000.
   * Field introduced in 18.2.9.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000000000.
   * @return count
   */
  @VsoMethod
  public Integer getCount() {
    return count;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of connections, requests or packets permitted each period.
   * Allowed values are 1-1000000000.
   * Field introduced in 18.2.9.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000000000.
   * @param count set the count.
   */
  @VsoMethod
  public void setCount(Integer  count) {
    this.count = count;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Identifier for rate limit.
   * Constructed according to context.
   * Field introduced in 18.2.9.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Identifier for rate limit.
   * Constructed according to context.
   * Field introduced in 18.2.9.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time value in seconds to enforce rate count.
   * Allowed values are 1-1000000000.
   * Field introduced in 18.2.9.
   * Unit is sec.
   * Allowed in enterprise edition with any value, basic edition(allowed values- 1), essentials, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return period
   */
  @VsoMethod
  public Integer getPeriod() {
    return period;
  }

  /**
   * This is the setter method to the attribute.
   * Time value in seconds to enforce rate count.
   * Allowed values are 1-1000000000.
   * Field introduced in 18.2.9.
   * Unit is sec.
   * Allowed in enterprise edition with any value, basic edition(allowed values- 1), essentials, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param period set the period.
   */
  @VsoMethod
  public void setPeriod(Integer  period) {
    this.period = period;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RateLimiter objRateLimiter = (RateLimiter) o;
  return   Objects.equals(this.count, objRateLimiter.count)&&
  Objects.equals(this.period, objRateLimiter.period)&&
  Objects.equals(this.burstSz, objRateLimiter.burstSz)&&
  Objects.equals(this.name, objRateLimiter.name);
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

