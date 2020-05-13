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
 * AppLearningParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AppLearningParams")
@VsoFinder(name = Constants.FINDER_VRO_APPLEARNINGPARAMS, idAccessor = "getObjectID()")
@Service
public class AppLearningParams extends AviRestResource  {
  @JsonProperty("enable_per_uri_learning")
  private Boolean enablePerUriLearning = true;

  @JsonProperty("max_params")
  private Integer maxParams = 100;

  @JsonProperty("max_uris")
  private Integer maxUris = 500;

  @JsonProperty("min_hits_to_learn")
  private Long minHitsToLearn = 10000l;

  @JsonProperty("sampling_percent")
  private Integer samplingPercent = 1;

  @JsonProperty("update_interval")
  private Integer updateInterval = 30;

  
  /**
   * Learn the params per URI path. Field introduced in 18.2.3.
   * @return enablePerUriLearning
  **/
  @ApiModelProperty(value = "Learn the params per URI path. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isEnablePerUriLearning() {
    return enablePerUriLearning;
  }
    
  @VsoMethod
  public void setEnablePerUriLearning(Boolean enablePerUriLearning) {
    this.enablePerUriLearning = enablePerUriLearning;
  }

  
  /**
   * Maximum number of params to learn for an application. Allowed values are 10-1000. Field introduced in 18.2.3.
   * @return maxParams
  **/
  @ApiModelProperty(value = "Maximum number of params to learn for an application. Allowed values are 10-1000. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getMaxParams() {
    return maxParams;
  }
    
  @VsoMethod
  public void setMaxParams(Integer maxParams) {
    this.maxParams = maxParams;
  }

  
  /**
   * Maximum number of URI paths to learn for an application. Allowed values are 10-10000. Field introduced in 18.2.3.
   * @return maxUris
  **/
  @ApiModelProperty(value = "Maximum number of URI paths to learn for an application. Allowed values are 10-10000. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getMaxUris() {
    return maxUris;
  }
    
  @VsoMethod
  public void setMaxUris(Integer maxUris) {
    this.maxUris = maxUris;
  }

  
  /**
   * Minimum number of occurances required for a Param to qualify for learning. Field introduced in 18.2.5.
   * @return minHitsToLearn
  **/
  @ApiModelProperty(value = "Minimum number of occurances required for a Param to qualify for learning. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Long getMinHitsToLearn() {
    return minHitsToLearn;
  }
    
  @VsoMethod
  public void setMinHitsToLearn(Long minHitsToLearn) {
    this.minHitsToLearn = minHitsToLearn;
  }

  
  /**
   * Percent of the requests subjected to Application learning. Allowed values are 1-100. Field introduced in 18.2.3.
   * @return samplingPercent
  **/
  @ApiModelProperty(value = "Percent of the requests subjected to Application learning. Allowed values are 1-100. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getSamplingPercent() {
    return samplingPercent;
  }
    
  @VsoMethod
  public void setSamplingPercent(Integer samplingPercent) {
    this.samplingPercent = samplingPercent;
  }

  
  /**
   * Frequency with which SE publishes Application learning data to controller. Allowed values are 1-10080. Field introduced in 18.2.3.
   * @return updateInterval
  **/
  @ApiModelProperty(value = "Frequency with which SE publishes Application learning data to controller. Allowed values are 1-10080. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getUpdateInterval() {
    return updateInterval;
  }
    
  @VsoMethod
  public void setUpdateInterval(Integer updateInterval) {
    this.updateInterval = updateInterval;
  }

  
  public String getObjectID() {
		return "AppLearningParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppLearningParams appLearningParams = (AppLearningParams) o;
    return Objects.equals(this.enablePerUriLearning, appLearningParams.enablePerUriLearning) &&
        Objects.equals(this.maxParams, appLearningParams.maxParams) &&
        Objects.equals(this.maxUris, appLearningParams.maxUris) &&
        Objects.equals(this.minHitsToLearn, appLearningParams.minHitsToLearn) &&
        Objects.equals(this.samplingPercent, appLearningParams.samplingPercent) &&
        Objects.equals(this.updateInterval, appLearningParams.updateInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enablePerUriLearning, maxParams, maxUris, minHitsToLearn, samplingPercent, updateInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppLearningParams {\n");
    
    sb.append("    enablePerUriLearning: ").append(toIndentedString(enablePerUriLearning)).append("\n");
    sb.append("    maxParams: ").append(toIndentedString(maxParams)).append("\n");
    sb.append("    maxUris: ").append(toIndentedString(maxUris)).append("\n");
    sb.append("    minHitsToLearn: ").append(toIndentedString(minHitsToLearn)).append("\n");
    sb.append("    samplingPercent: ").append(toIndentedString(samplingPercent)).append("\n");
    sb.append("    updateInterval: ").append(toIndentedString(updateInterval)).append("\n");
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

