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
 * The AppLearningConfidenceOverride is a POJO class extends AviRestResource that used for creating
 * AppLearningConfidenceOverride.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AppLearningConfidenceOverride")
@VsoFinder(name = Constants.FINDER_VRO_APPLEARNINGCONFIDENCEOVERRIDE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AppLearningConfidenceOverride extends AviRestResource {
    @JsonProperty("confid_high_value")
    @JsonInclude(Include.NON_NULL)
    private Integer confidHighValue = 9500;

    @JsonProperty("confid_low_value")
    @JsonInclude(Include.NON_NULL)
    private Integer confidLowValue = 7500;

    @JsonProperty("confid_probable_value")
    @JsonInclude(Include.NON_NULL)
    private Integer confidProbableValue = 9000;

    @JsonProperty("confid_very_high_value")
    @JsonInclude(Include.NON_NULL)
    private Integer confidVeryHighValue = 9999;



  /**
   * This is the getter method this will return the attribute value.
   * Confidence threshold for label confidence_high.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 9500.
   * @return confidHighValue
   */
  @VsoMethod
  public Integer getConfidHighValue() {
    return confidHighValue;
  }

  /**
   * This is the setter method to the attribute.
   * Confidence threshold for label confidence_high.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 9500.
   * @param confidHighValue set the confidHighValue.
   */
  @VsoMethod
  public void setConfidHighValue(Integer  confidHighValue) {
    this.confidHighValue = confidHighValue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Confidence threshold for label confidence_low.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 7500.
   * @return confidLowValue
   */
  @VsoMethod
  public Integer getConfidLowValue() {
    return confidLowValue;
  }

  /**
   * This is the setter method to the attribute.
   * Confidence threshold for label confidence_low.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 7500.
   * @param confidLowValue set the confidLowValue.
   */
  @VsoMethod
  public void setConfidLowValue(Integer  confidLowValue) {
    this.confidLowValue = confidLowValue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Confidence threshold for label confidence_probable.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 9000.
   * @return confidProbableValue
   */
  @VsoMethod
  public Integer getConfidProbableValue() {
    return confidProbableValue;
  }

  /**
   * This is the setter method to the attribute.
   * Confidence threshold for label confidence_probable.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 9000.
   * @param confidProbableValue set the confidProbableValue.
   */
  @VsoMethod
  public void setConfidProbableValue(Integer  confidProbableValue) {
    this.confidProbableValue = confidProbableValue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Confidence threshold for label confidence_very_high.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 9999.
   * @return confidVeryHighValue
   */
  @VsoMethod
  public Integer getConfidVeryHighValue() {
    return confidVeryHighValue;
  }

  /**
   * This is the setter method to the attribute.
   * Confidence threshold for label confidence_very_high.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 9999.
   * @param confidVeryHighValue set the confidVeryHighValue.
   */
  @VsoMethod
  public void setConfidVeryHighValue(Integer  confidVeryHighValue) {
    this.confidVeryHighValue = confidVeryHighValue;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AppLearningConfidenceOverride objAppLearningConfidenceOverride = (AppLearningConfidenceOverride) o;
  return   Objects.equals(this.confidVeryHighValue, objAppLearningConfidenceOverride.confidVeryHighValue)&&
  Objects.equals(this.confidHighValue, objAppLearningConfidenceOverride.confidHighValue)&&
  Objects.equals(this.confidProbableValue, objAppLearningConfidenceOverride.confidProbableValue)&&
  Objects.equals(this.confidLowValue, objAppLearningConfidenceOverride.confidLowValue);
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

