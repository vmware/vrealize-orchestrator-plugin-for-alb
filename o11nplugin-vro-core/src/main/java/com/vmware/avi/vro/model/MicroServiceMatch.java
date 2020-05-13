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
 * MicroServiceMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "MicroServiceMatch")
@VsoFinder(name = Constants.FINDER_VRO_MICROSERVICEMATCH, idAccessor = "getObjectID()")
@Service
public class MicroServiceMatch extends AviRestResource  {
  @JsonProperty("group_ref")
  private String groupRef = null;

  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  
  /**
   * UUID of Micro Service group(s). It is a reference to an object of type MicroServiceGroup.
   * @return groupRef
  **/
  @ApiModelProperty(required = true, value = "UUID of Micro Service group(s). It is a reference to an object of type MicroServiceGroup.")
  @NotNull


 
  @VsoMethod  
  public String getGroupRef() {
    return groupRef;
  }
    
  @VsoMethod
  public void setGroupRef(String groupRef) {
    this.groupRef = groupRef;
  }

  
  /**
   * Criterion to use for Micro Service matching the HTTP request. Enum options - IS_IN, IS_NOT_IN.
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "Criterion to use for Micro Service matching the HTTP request. Enum options - IS_IN, IS_NOT_IN.")
  @NotNull


 
  @VsoMethod  
  public String getMatchCriteria() {
    return matchCriteria;
  }
    
  @VsoMethod
  public void setMatchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  
  public String getObjectID() {
		return "MicroServiceMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicroServiceMatch microServiceMatch = (MicroServiceMatch) o;
    return Objects.equals(this.groupRef, microServiceMatch.groupRef) &&
        Objects.equals(this.matchCriteria, microServiceMatch.matchCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupRef, matchCriteria);
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

