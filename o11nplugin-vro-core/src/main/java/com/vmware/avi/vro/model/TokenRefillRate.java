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
 * The TokenRefillRate is a POJO class extends AviRestResource that used for creating
 * TokenRefillRate.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TokenRefillRate")
@VsoFinder(name = Constants.FINDER_VRO_TOKENREFILLRATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TokenRefillRate extends AviRestResource {
    @JsonProperty("interval")
    @JsonInclude(Include.NON_NULL)
    private String interval = "PER_MINUTE_INTERVAL";

    @JsonProperty("refill_rate")
    @JsonInclude(Include.NON_NULL)
    private Integer refillRate = 1;



  /**
   * This is the getter method this will return the attribute value.
   * The time interval over which refill rate is defined.
   * Enum options - PER_MINUTE_INTERVAL.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "PER_MINUTE_INTERVAL".
   * @return interval
   */
  @VsoMethod
  public String getInterval() {
    return interval;
  }

  /**
   * This is the setter method to the attribute.
   * The time interval over which refill rate is defined.
   * Enum options - PER_MINUTE_INTERVAL.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "PER_MINUTE_INTERVAL".
   * @param interval set the interval.
   */
  @VsoMethod
  public void setInterval(String  interval) {
    this.interval = interval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The rate per refill interval at which tokens are added to the bucket.
   * Allowed values are 1-100000.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return refillRate
   */
  @VsoMethod
  public Integer getRefillRate() {
    return refillRate;
  }

  /**
   * This is the setter method to the attribute.
   * The rate per refill interval at which tokens are added to the bucket.
   * Allowed values are 1-100000.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param refillRate set the refillRate.
   */
  @VsoMethod
  public void setRefillRate(Integer  refillRate) {
    this.refillRate = refillRate;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TokenRefillRate objTokenRefillRate = (TokenRefillRate) o;
  return   Objects.equals(this.refillRate, objTokenRefillRate.refillRate)&&
  Objects.equals(this.interval, objTokenRefillRate.interval);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TokenRefillRate {\n");
      sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    refillRate: ").append(toIndentedString(refillRate)).append("\n");
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

