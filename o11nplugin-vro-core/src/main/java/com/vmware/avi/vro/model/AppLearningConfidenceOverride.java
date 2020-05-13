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
 * AppLearningConfidenceOverride
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AppLearningConfidenceOverride")
@VsoFinder(name = Constants.FINDER_VRO_APPLEARNINGCONFIDENCEOVERRIDE, idAccessor = "getObjectID()")
@Service
public class AppLearningConfidenceOverride extends AviRestResource  {
  @JsonProperty("confid_high_value")
  private Integer confidHighValue = 9500;

  @JsonProperty("confid_low_value")
  private Integer confidLowValue = 7500;

  @JsonProperty("confid_probable_value")
  private Integer confidProbableValue = 9000;

  @JsonProperty("confid_very_high_value")
  private Integer confidVeryHighValue = 9999;

  
  /**
   * Confidence threshold for label CONFIDENCE_HIGH. Field introduced in 18.2.3.
   * @return confidHighValue
  **/
  @ApiModelProperty(value = "Confidence threshold for label CONFIDENCE_HIGH. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getConfidHighValue() {
    return confidHighValue;
  }
    
  @VsoMethod
  public void setConfidHighValue(Integer confidHighValue) {
    this.confidHighValue = confidHighValue;
  }

  
  /**
   * Confidence threshold for label CONFIDENCE_LOW. Field introduced in 18.2.3.
   * @return confidLowValue
  **/
  @ApiModelProperty(value = "Confidence threshold for label CONFIDENCE_LOW. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getConfidLowValue() {
    return confidLowValue;
  }
    
  @VsoMethod
  public void setConfidLowValue(Integer confidLowValue) {
    this.confidLowValue = confidLowValue;
  }

  
  /**
   * Confidence threshold for label CONFIDENCE_PROBABLE. Field introduced in 18.2.3.
   * @return confidProbableValue
  **/
  @ApiModelProperty(value = "Confidence threshold for label CONFIDENCE_PROBABLE. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getConfidProbableValue() {
    return confidProbableValue;
  }
    
  @VsoMethod
  public void setConfidProbableValue(Integer confidProbableValue) {
    this.confidProbableValue = confidProbableValue;
  }

  
  /**
   * Confidence threshold for label CONFIDENCE_VERY_HIGH. Field introduced in 18.2.3.
   * @return confidVeryHighValue
  **/
  @ApiModelProperty(value = "Confidence threshold for label CONFIDENCE_VERY_HIGH. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getConfidVeryHighValue() {
    return confidVeryHighValue;
  }
    
  @VsoMethod
  public void setConfidVeryHighValue(Integer confidVeryHighValue) {
    this.confidVeryHighValue = confidVeryHighValue;
  }

  
  public String getObjectID() {
		return "AppLearningConfidenceOverride";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppLearningConfidenceOverride appLearningConfidenceOverride = (AppLearningConfidenceOverride) o;
    return Objects.equals(this.confidHighValue, appLearningConfidenceOverride.confidHighValue) &&
        Objects.equals(this.confidLowValue, appLearningConfidenceOverride.confidLowValue) &&
        Objects.equals(this.confidProbableValue, appLearningConfidenceOverride.confidProbableValue) &&
        Objects.equals(this.confidVeryHighValue, appLearningConfidenceOverride.confidVeryHighValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidHighValue, confidLowValue, confidProbableValue, confidVeryHighValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppLearningConfidenceOverride {\n");
    
    sb.append("    confidHighValue: ").append(toIndentedString(confidHighValue)).append("\n");
    sb.append("    confidLowValue: ").append(toIndentedString(confidLowValue)).append("\n");
    sb.append("    confidProbableValue: ").append(toIndentedString(confidProbableValue)).append("\n");
    sb.append("    confidVeryHighValue: ").append(toIndentedString(confidVeryHighValue)).append("\n");
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

