package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.MetricsQueryResponse;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The MetricLog is a POJO class extends AviRestResource that used for creating
 * MetricLog.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MetricLog")
@VsoFinder(name = Constants.FINDER_VRO_METRICLOG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MetricLog extends AviRestResource {
  @JsonProperty("end_timestamp")
  @JsonInclude(Include.NON_NULL)
  private Float endTimestamp = null;

  @JsonProperty("metric_id")
  @JsonInclude(Include.NON_NULL)
  private String metricId = null;

  @JsonProperty("report_timestamp")
  @JsonInclude(Include.NON_NULL)
  private Float reportTimestamp = null;

  @JsonProperty("step")
  @JsonInclude(Include.NON_NULL)
  private Integer step = null;

  @JsonProperty("time_series")
  @JsonInclude(Include.NON_NULL)
  private MetricsQueryResponse timeSeries = null;

  @JsonProperty("value")
  @JsonInclude(Include.NON_NULL)
  private Float value = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property end_timestamp of obj type metriclog field type str  type float.
   * @return endTimestamp
   */
  @VsoMethod
  public Float getEndTimestamp() {
    return endTimestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property end_timestamp of obj type metriclog field type str  type float.
   * @param endTimestamp set the endTimestamp.
   */
  @VsoMethod
  public void setEndTimestamp(Float  endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property metric_id of obj type metriclog field type str  type string.
   * @return metricId
   */
  @VsoMethod
  public String getMetricId() {
    return metricId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property metric_id of obj type metriclog field type str  type string.
   * @param metricId set the metricId.
   */
  @VsoMethod
  public void setMetricId(String  metricId) {
    this.metricId = metricId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property report_timestamp of obj type metriclog field type str  type float.
   * @return reportTimestamp
   */
  @VsoMethod
  public Float getReportTimestamp() {
    return reportTimestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property report_timestamp of obj type metriclog field type str  type float.
   * @param reportTimestamp set the reportTimestamp.
   */
  @VsoMethod
  public void setReportTimestamp(Float  reportTimestamp) {
    this.reportTimestamp = reportTimestamp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property step of obj type metriclog field type str  type integer.
   * @return step
   */
  @VsoMethod
  public Integer getStep() {
    return step;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property step of obj type metriclog field type str  type integer.
   * @param step set the step.
   */
  @VsoMethod
  public void setStep(Integer  step) {
    this.step = step;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property time_series of obj type metriclog field type str  type ref.
   * @return timeSeries
   */
  @VsoMethod
  public MetricsQueryResponse getTimeSeries() {
    return timeSeries;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property time_series of obj type metriclog field type str  type ref.
   * @param timeSeries set the timeSeries.
   */
  @VsoMethod
  public void setTimeSeries(MetricsQueryResponse timeSeries) {
    this.timeSeries = timeSeries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property value of obj type metriclog field type str  type float.
   * @return value
   */
  @VsoMethod
  public Float getValue() {
    return value;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property value of obj type metriclog field type str  type float.
   * @param value set the value.
   */
  @VsoMethod
  public void setValue(Float  value) {
    this.value = value;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MetricLog objMetricLog = (MetricLog) o;
  return   Objects.equals(this.metricId, objMetricLog.metricId)&&
  Objects.equals(this.value, objMetricLog.value)&&
  Objects.equals(this.reportTimestamp, objMetricLog.reportTimestamp)&&
  Objects.equals(this.endTimestamp, objMetricLog.endTimestamp)&&
  Objects.equals(this.step, objMetricLog.step)&&
  Objects.equals(this.timeSeries, objMetricLog.timeSeries);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricLog {\n");
      sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
        sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
        sb.append("    reportTimestamp: ").append(toIndentedString(reportTimestamp)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    timeSeries: ").append(toIndentedString(timeSeries)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

