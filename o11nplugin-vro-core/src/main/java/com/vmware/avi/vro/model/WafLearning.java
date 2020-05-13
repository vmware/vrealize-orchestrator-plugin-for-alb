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
 * WafLearning
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafLearning")
@VsoFinder(name = Constants.FINDER_VRO_WAFLEARNING, idAccessor = "getObjectID()")
@Service
public class WafLearning extends AviRestResource  {
  @JsonProperty("arg_summarization_threshold")
  private Integer argSummarizationThreshold = null;

  @JsonProperty("confidence")
  private Integer confidence = null;

  @JsonProperty("enable")
  private Boolean enable = null;

  @JsonProperty("path_summarization_threshold")
  private Integer pathSummarizationThreshold = null;

  @JsonProperty("sampling_percent")
  private Integer samplingPercent = null;

  
  /**
   * Suffix Summarization threshold used to compress args. Allowed values are 3-255. Field deprecated in 18.2.3. Field introduced in 18.1.2.
   * @return argSummarizationThreshold
  **/
  @ApiModelProperty(value = "Suffix Summarization threshold used to compress args. Allowed values are 3-255. Field deprecated in 18.2.3. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Integer getArgSummarizationThreshold() {
    return argSummarizationThreshold;
  }
    
  @VsoMethod
  public void setArgSummarizationThreshold(Integer argSummarizationThreshold) {
    this.argSummarizationThreshold = argSummarizationThreshold;
  }

  
  /**
   * Confidence level used to derive rules from the WAF learning. Allowed values are 60-100. Field deprecated in 18.2.3. Field introduced in 18.1.2.
   * @return confidence
  **/
  @ApiModelProperty(value = "Confidence level used to derive rules from the WAF learning. Allowed values are 60-100. Field deprecated in 18.2.3. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Integer getConfidence() {
    return confidence;
  }
    
  @VsoMethod
  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  
  /**
   * Enable Learning for WAF policy. Field deprecated in 18.2.3. Field introduced in 18.1.2.
   * @return enable
  **/
  @ApiModelProperty(value = "Enable Learning for WAF policy. Field deprecated in 18.2.3. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Boolean isEnable() {
    return enable;
  }
    
  @VsoMethod
  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  
  /**
   * Suffix Summarization threshold used to compress paths. Allowed values are 3-255. Field deprecated in 18.2.3. Field introduced in 18.1.2.
   * @return pathSummarizationThreshold
  **/
  @ApiModelProperty(value = "Suffix Summarization threshold used to compress paths. Allowed values are 3-255. Field deprecated in 18.2.3. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Integer getPathSummarizationThreshold() {
    return pathSummarizationThreshold;
  }
    
  @VsoMethod
  public void setPathSummarizationThreshold(Integer pathSummarizationThreshold) {
    this.pathSummarizationThreshold = pathSummarizationThreshold;
  }

  
  /**
   * Sampling percent of the requests subjected to WAF learning. Allowed values are 1-100. Field deprecated in 18.2.3. Field introduced in 18.1.2.
   * @return samplingPercent
  **/
  @ApiModelProperty(value = "Sampling percent of the requests subjected to WAF learning. Allowed values are 1-100. Field deprecated in 18.2.3. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Integer getSamplingPercent() {
    return samplingPercent;
  }
    
  @VsoMethod
  public void setSamplingPercent(Integer samplingPercent) {
    this.samplingPercent = samplingPercent;
  }

  
  public String getObjectID() {
		return "WafLearning";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafLearning wafLearning = (WafLearning) o;
    return Objects.equals(this.argSummarizationThreshold, wafLearning.argSummarizationThreshold) &&
        Objects.equals(this.confidence, wafLearning.confidence) &&
        Objects.equals(this.enable, wafLearning.enable) &&
        Objects.equals(this.pathSummarizationThreshold, wafLearning.pathSummarizationThreshold) &&
        Objects.equals(this.samplingPercent, wafLearning.samplingPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(argSummarizationThreshold, confidence, enable, pathSummarizationThreshold, samplingPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafLearning {\n");
    
    sb.append("    argSummarizationThreshold: ").append(toIndentedString(argSummarizationThreshold)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    pathSummarizationThreshold: ").append(toIndentedString(pathSummarizationThreshold)).append("\n");
    sb.append("    samplingPercent: ").append(toIndentedString(samplingPercent)).append("\n");
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

