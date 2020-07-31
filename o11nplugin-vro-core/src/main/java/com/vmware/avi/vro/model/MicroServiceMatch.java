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
 * The MicroServiceMatch is a POJO class extends AviRestResource that used for creating
 * MicroServiceMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MicroServiceMatch")
@VsoFinder(name = Constants.FINDER_VRO_MICROSERVICEMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MicroServiceMatch extends AviRestResource {
  @JsonProperty("group_ref")
  @JsonInclude(Include.NON_NULL)
  private String groupRef = null;

  @JsonProperty("match_criteria")
  @JsonInclude(Include.NON_NULL)
  private String matchCriteria = null;



  /**
   * This is the getter method this will return the attribute value.
   * Uuid of micro service group(s).
   * It is a reference to an object of type microservicegroup.
   * @return groupRef
   */
  @VsoMethod
  public String getGroupRef() {
    return groupRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of micro service group(s).
   * It is a reference to an object of type microservicegroup.
   * @param groupRef set the groupRef.
   */
  @VsoMethod
  public void setGroupRef(String  groupRef) {
    this.groupRef = groupRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Criterion to use for micro service matching the http request.
   * Enum options - IS_IN, IS_NOT_IN.
   * @return matchCriteria
   */
  @VsoMethod
  public String getMatchCriteria() {
    return matchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Criterion to use for micro service matching the http request.
   * Enum options - IS_IN, IS_NOT_IN.
   * @param matchCriteria set the matchCriteria.
   */
  @VsoMethod
  public void setMatchCriteria(String  matchCriteria) {
    this.matchCriteria = matchCriteria;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MicroServiceMatch objMicroServiceMatch = (MicroServiceMatch) o;
  return   Objects.equals(this.matchCriteria, objMicroServiceMatch.matchCriteria)&&
  Objects.equals(this.groupRef, objMicroServiceMatch.groupRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MicroServiceMatch {\n");
      sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
        sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
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

