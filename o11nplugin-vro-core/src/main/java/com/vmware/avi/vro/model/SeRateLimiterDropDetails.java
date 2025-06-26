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
 * The SeRateLimiterDropDetails is a POJO class extends AviRestResource that used for creating
 * SeRateLimiterDropDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeRateLimiterDropDetails")
@VsoFinder(name = Constants.FINDER_VRO_SERATELIMITERDROPDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeRateLimiterDropDetails extends AviRestResource {
    @JsonProperty("num_pkts_dropped")
    @JsonInclude(Include.NON_NULL)
    private Integer numPktsDropped;

    @JsonProperty("se_ref")
    @JsonInclude(Include.NON_NULL)
    private String seRef;



  /**
   * This is the getter method this will return the attribute value.
   * Number of packets dropped by rate limiter.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numPktsDropped
   */
  @VsoMethod
  public Integer getNumPktsDropped() {
    return numPktsDropped;
  }

  /**
   * This is the setter method to the attribute.
   * Number of packets dropped by rate limiter.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numPktsDropped set the numPktsDropped.
   */
  @VsoMethod
  public void setNumPktsDropped(Integer  numPktsDropped) {
    this.numPktsDropped = numPktsDropped;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the se responsible for this event.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seRef
   */
  @VsoMethod
  public String getSeRef() {
    return seRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the se responsible for this event.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seRef set the seRef.
   */
  @VsoMethod
  public void setSeRef(String  seRef) {
    this.seRef = seRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeRateLimiterDropDetails objSeRateLimiterDropDetails = (SeRateLimiterDropDetails) o;
  return   Objects.equals(this.seRef, objSeRateLimiterDropDetails.seRef)&&
  Objects.equals(this.numPktsDropped, objSeRateLimiterDropDetails.numPktsDropped);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeRateLimiterDropDetails {\n");
      sb.append("    numPktsDropped: ").append(toIndentedString(numPktsDropped)).append("\n");
        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
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

