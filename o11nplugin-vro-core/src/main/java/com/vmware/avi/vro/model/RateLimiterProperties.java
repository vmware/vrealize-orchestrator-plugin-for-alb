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
 * RateLimiterProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "RateLimiterProperties")
@VsoFinder(name = Constants.FINDER_VRO_RATELIMITERPROPERTIES, idAccessor = "getObjectID()")
@Service
public class RateLimiterProperties extends AviRestResource  {
  @JsonProperty("msf_num_stages")
  private Integer msfNumStages = 1;

  @JsonProperty("msf_stage_size")
  private Long msfStageSize = 16384l;

  
  /**
   * Number of stages in msf rate limiter. Allowed values are 1-2. Field introduced in 20.1.1.
   * @return msfNumStages
  **/
  @ApiModelProperty(value = "Number of stages in msf rate limiter. Allowed values are 1-2. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getMsfNumStages() {
    return msfNumStages;
  }
    
  @VsoMethod
  public void setMsfNumStages(Integer msfNumStages) {
    this.msfNumStages = msfNumStages;
  }

  
  /**
   * Each stage size in msf rate limiter. Field introduced in 20.1.1.
   * @return msfStageSize
  **/
  @ApiModelProperty(value = "Each stage size in msf rate limiter. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Long getMsfStageSize() {
    return msfStageSize;
  }
    
  @VsoMethod
  public void setMsfStageSize(Long msfStageSize) {
    this.msfStageSize = msfStageSize;
  }

  
  public String getObjectID() {
		return "RateLimiterProperties";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLimiterProperties rateLimiterProperties = (RateLimiterProperties) o;
    return Objects.equals(this.msfNumStages, rateLimiterProperties.msfNumStages) &&
        Objects.equals(this.msfStageSize, rateLimiterProperties.msfStageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msfNumStages, msfStageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLimiterProperties {\n");
    
    sb.append("    msfNumStages: ").append(toIndentedString(msfNumStages)).append("\n");
    sb.append("    msfStageSize: ").append(toIndentedString(msfStageSize)).append("\n");
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

