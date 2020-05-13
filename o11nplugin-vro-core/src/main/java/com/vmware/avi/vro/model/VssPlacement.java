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
 * VssPlacement
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VssPlacement")
@VsoFinder(name = Constants.FINDER_VRO_VSSPLACEMENT, idAccessor = "getObjectID()")
@Service
public class VssPlacement extends AviRestResource  {
  @JsonProperty("core_nonaffinity")
  private Integer coreNonaffinity = 2;

  @JsonProperty("num_subcores")
  private Integer numSubcores = 4;

  
  /**
   * Degree of core non-affinity for VS placement. Allowed values are 1-256. Field introduced in 17.2.5.
   * @return coreNonaffinity
  **/
  @ApiModelProperty(value = "Degree of core non-affinity for VS placement. Allowed values are 1-256. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public Integer getCoreNonaffinity() {
    return coreNonaffinity;
  }
    
  @VsoMethod
  public void setCoreNonaffinity(Integer coreNonaffinity) {
    this.coreNonaffinity = coreNonaffinity;
  }

  
  /**
   * Number of sub-cores that comprise a CPU core. Allowed values are 1-128. Field introduced in 17.2.5.
   * @return numSubcores
  **/
  @ApiModelProperty(value = "Number of sub-cores that comprise a CPU core. Allowed values are 1-128. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public Integer getNumSubcores() {
    return numSubcores;
  }
    
  @VsoMethod
  public void setNumSubcores(Integer numSubcores) {
    this.numSubcores = numSubcores;
  }

  
  public String getObjectID() {
		return "VssPlacement";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VssPlacement vssPlacement = (VssPlacement) o;
    return Objects.equals(this.coreNonaffinity, vssPlacement.coreNonaffinity) &&
        Objects.equals(this.numSubcores, vssPlacement.numSubcores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coreNonaffinity, numSubcores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VssPlacement {\n");
    
    sb.append("    coreNonaffinity: ").append(toIndentedString(coreNonaffinity)).append("\n");
    sb.append("    numSubcores: ").append(toIndentedString(numSubcores)).append("\n");
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

