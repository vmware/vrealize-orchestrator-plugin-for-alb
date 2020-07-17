package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AlertMetricThreshold;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The AlertRuleMetric is a POJO class extends AviRestResource that used for creating
 * AlertRuleMetric.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AlertRuleMetric")
@VsoFinder(name = Constants.FINDER_VRO_ALERTRULEMETRIC)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AlertRuleMetric extends AviRestResource {
  @JsonProperty("duration")
  @JsonInclude(Include.NON_NULL)
  private Integer duration = null;

  @JsonProperty("metric_id")
  @JsonInclude(Include.NON_NULL)
  private String metricId = null;

  @JsonProperty("metric_threshold")
  @JsonInclude(Include.NON_NULL)
  private AlertMetricThreshold metricThreshold = null;



  /**
   * This is the getter method this will return the attribute value.
   * Evaluation window for the metrics.
   * @return duration
   */
  @VsoMethod
  public Integer getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Evaluation window for the metrics.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(Integer  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Metric id for the alert.
   * Eg.
   * L4_client.avg_complete_conns.
   * @return metricId
   */
  @VsoMethod
  public String getMetricId() {
    return metricId;
  }

  /**
   * This is the setter method to the attribute.
   * Metric id for the alert.
   * Eg.
   * L4_client.avg_complete_conns.
   * @param metricId set the metricId.
   */
  @VsoMethod
  public void setMetricId(String  metricId) {
    this.metricId = metricId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property metric_threshold of obj type alertrulemetric field type str  type ref.
   * @return metricThreshold
   */
  @VsoMethod
  public AlertMetricThreshold getMetricThreshold() {
    return metricThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property metric_threshold of obj type alertrulemetric field type str  type ref.
   * @param metricThreshold set the metricThreshold.
   */
  @VsoMethod
  public void setMetricThreshold(AlertMetricThreshold metricThreshold) {
    this.metricThreshold = metricThreshold;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AlertRuleMetric objAlertRuleMetric = (AlertRuleMetric) o;
  return   Objects.equals(this.duration, objAlertRuleMetric.duration)&&
  Objects.equals(this.metricThreshold, objAlertRuleMetric.metricThreshold)&&
  Objects.equals(this.metricId, objAlertRuleMetric.metricId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AlertRuleMetric {\n");
      sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
        sb.append("    metricThreshold: ").append(toIndentedString(metricThreshold)).append("\n");
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

