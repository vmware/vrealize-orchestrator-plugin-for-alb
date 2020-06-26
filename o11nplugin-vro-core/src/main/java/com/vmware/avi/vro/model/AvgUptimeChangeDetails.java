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
 * The AvgUptimeChangeDetails is a POJO class extends AviRestResource that used for creating
 * AvgUptimeChangeDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AvgUptimeChangeDetails")
@VsoFinder(name = Constants.FINDER_VRO_AVGUPTIMECHANGEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AvgUptimeChangeDetails extends AviRestResource {
  @JsonProperty("current_value")
  @JsonInclude(Include.NON_NULL)
  private Float currentValue = null;

  @JsonProperty("metric_id")
  @JsonInclude(Include.NON_NULL)
  private String metricId = null;

  @JsonProperty("metric_name")
  @JsonInclude(Include.NON_NULL)
  private String metricName = null;

  @JsonProperty("resource_str")
  @JsonInclude(Include.NON_NULL)
  private String resourceStr = null;

  @JsonProperty("threshold")
  @JsonInclude(Include.NON_NULL)
  private Float threshold = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property current_value of obj type avguptimechangedetails field type str  type float.
   * @return currentValue
   */
  @VsoMethod
  public Float getCurrentValue() {
    return currentValue;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property current_value of obj type avguptimechangedetails field type str  type float.
   * @param currentValue set the currentValue.
   */
  @VsoMethod
  public void setCurrentValue(Float  currentValue) {
    this.currentValue = currentValue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property metric_id of obj type avguptimechangedetails field type str  type string.
   * @return metricId
   */
  @VsoMethod
  public String getMetricId() {
    return metricId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property metric_id of obj type avguptimechangedetails field type str  type string.
   * @param metricId set the metricId.
   */
  @VsoMethod
  public void setMetricId(String  metricId) {
    this.metricId = metricId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property metric_name of obj type avguptimechangedetails field type str  type string.
   * @return metricName
   */
  @VsoMethod
  public String getMetricName() {
    return metricName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property metric_name of obj type avguptimechangedetails field type str  type string.
   * @param metricName set the metricName.
   */
  @VsoMethod
  public void setMetricName(String  metricName) {
    this.metricName = metricName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property resource_str of obj type avguptimechangedetails field type str  type string.
   * @return resourceStr
   */
  @VsoMethod
  public String getResourceStr() {
    return resourceStr;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property resource_str of obj type avguptimechangedetails field type str  type string.
   * @param resourceStr set the resourceStr.
   */
  @VsoMethod
  public void setResourceStr(String  resourceStr) {
    this.resourceStr = resourceStr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property threshold of obj type avguptimechangedetails field type str  type float.
   * @return threshold
   */
  @VsoMethod
  public Float getThreshold() {
    return threshold;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property threshold of obj type avguptimechangedetails field type str  type float.
   * @param threshold set the threshold.
   */
  @VsoMethod
  public void setThreshold(Float  threshold) {
    this.threshold = threshold;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AvgUptimeChangeDetails objAvgUptimeChangeDetails = (AvgUptimeChangeDetails) o;
  return   Objects.equals(this.currentValue, objAvgUptimeChangeDetails.currentValue)&&
  Objects.equals(this.threshold, objAvgUptimeChangeDetails.threshold)&&
  Objects.equals(this.resourceStr, objAvgUptimeChangeDetails.resourceStr)&&
  Objects.equals(this.metricName, objAvgUptimeChangeDetails.metricName)&&
  Objects.equals(this.metricId, objAvgUptimeChangeDetails.metricId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AvgUptimeChangeDetails {\n");
      sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
        sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    resourceStr: ").append(toIndentedString(resourceStr)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
