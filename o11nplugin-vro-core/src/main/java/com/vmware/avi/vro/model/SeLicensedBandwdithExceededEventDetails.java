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
 * The SeLicensedBandwdithExceededEventDetails is a POJO class extends AviRestResource that used for creating
 * SeLicensedBandwdithExceededEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeLicensedBandwdithExceededEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SELICENSEDBANDWDITHEXCEEDEDEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeLicensedBandwdithExceededEventDetails extends AviRestResource {
  @JsonProperty("num_pkts_dropped")
  @JsonInclude(Include.NON_NULL)
  private Integer numPktsDropped = null;

  @JsonProperty("se_ref")
  @JsonInclude(Include.NON_NULL)
  private String seRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * Number of packets dropped since the last event.
   * @return numPktsDropped
   */
  @VsoMethod
  public Integer getNumPktsDropped() {
    return numPktsDropped;
  }

  /**
   * This is the setter method to the attribute.
   * Number of packets dropped since the last event.
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
  SeLicensedBandwdithExceededEventDetails objSeLicensedBandwdithExceededEventDetails = (SeLicensedBandwdithExceededEventDetails) o;
  return   Objects.equals(this.numPktsDropped, objSeLicensedBandwdithExceededEventDetails.numPktsDropped)&&
  Objects.equals(this.seRef, objSeLicensedBandwdithExceededEventDetails.seRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeLicensedBandwdithExceededEventDetails {\n");
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
