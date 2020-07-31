package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.MetricsDbRuntime;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The MetricsDbQueueHealthyEventDetails is a POJO class extends AviRestResource that used for creating
 * MetricsDbQueueHealthyEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MetricsDbQueueHealthyEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_METRICSDBQUEUEHEALTHYEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MetricsDbQueueHealthyEventDetails extends AviRestResource {
  @JsonProperty("high")
  @JsonInclude(Include.NON_NULL)
  private Integer high = null;

  @JsonProperty("instanceport")
  @JsonInclude(Include.NON_NULL)
  private Integer instanceport = null;

  @JsonProperty("low")
  @JsonInclude(Include.NON_NULL)
  private Integer low = null;

  @JsonProperty("nodeid")
  @JsonInclude(Include.NON_NULL)
  private String nodeid = null;

  @JsonProperty("period")
  @JsonInclude(Include.NON_NULL)
  private String period = null;

  @JsonProperty("runtime")
  @JsonInclude(Include.NON_NULL)
  private MetricsDbRuntime runtime = null;

  @JsonProperty("watermark")
  @JsonInclude(Include.NON_NULL)
  private Integer watermark = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property high of obj type metricsdbqueuehealthyeventdetails field type str  type integer.
   * @return high
   */
  @VsoMethod
  public Integer getHigh() {
    return high;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property high of obj type metricsdbqueuehealthyeventdetails field type str  type integer.
   * @param high set the high.
   */
  @VsoMethod
  public void setHigh(Integer  high) {
    this.high = high;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property instanceport of obj type metricsdbqueuehealthyeventdetails field type str  type integer.
   * @return instanceport
   */
  @VsoMethod
  public Integer getInstanceport() {
    return instanceport;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property instanceport of obj type metricsdbqueuehealthyeventdetails field type str  type integer.
   * @param instanceport set the instanceport.
   */
  @VsoMethod
  public void setInstanceport(Integer  instanceport) {
    this.instanceport = instanceport;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property low of obj type metricsdbqueuehealthyeventdetails field type str  type integer.
   * @return low
   */
  @VsoMethod
  public Integer getLow() {
    return low;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property low of obj type metricsdbqueuehealthyeventdetails field type str  type integer.
   * @param low set the low.
   */
  @VsoMethod
  public void setLow(Integer  low) {
    this.low = low;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property nodeid of obj type metricsdbqueuehealthyeventdetails field type str  type string.
   * @return nodeid
   */
  @VsoMethod
  public String getNodeid() {
    return nodeid;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property nodeid of obj type metricsdbqueuehealthyeventdetails field type str  type string.
   * @param nodeid set the nodeid.
   */
  @VsoMethod
  public void setNodeid(String  nodeid) {
    this.nodeid = nodeid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property period of obj type metricsdbqueuehealthyeventdetails field type str  type string.
   * @return period
   */
  @VsoMethod
  public String getPeriod() {
    return period;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property period of obj type metricsdbqueuehealthyeventdetails field type str  type string.
   * @param period set the period.
   */
  @VsoMethod
  public void setPeriod(String  period) {
    this.period = period;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property runtime of obj type metricsdbqueuehealthyeventdetails field type str  type ref.
   * @return runtime
   */
  @VsoMethod
  public MetricsDbRuntime getRuntime() {
    return runtime;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property runtime of obj type metricsdbqueuehealthyeventdetails field type str  type ref.
   * @param runtime set the runtime.
   */
  @VsoMethod
  public void setRuntime(MetricsDbRuntime runtime) {
    this.runtime = runtime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property watermark of obj type metricsdbqueuehealthyeventdetails field type str  type integer.
   * @return watermark
   */
  @VsoMethod
  public Integer getWatermark() {
    return watermark;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property watermark of obj type metricsdbqueuehealthyeventdetails field type str  type integer.
   * @param watermark set the watermark.
   */
  @VsoMethod
  public void setWatermark(Integer  watermark) {
    this.watermark = watermark;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MetricsDbQueueHealthyEventDetails objMetricsDbQueueHealthyEventDetails = (MetricsDbQueueHealthyEventDetails) o;
  return   Objects.equals(this.low, objMetricsDbQueueHealthyEventDetails.low)&&
  Objects.equals(this.high, objMetricsDbQueueHealthyEventDetails.high)&&
  Objects.equals(this.watermark, objMetricsDbQueueHealthyEventDetails.watermark)&&
  Objects.equals(this.nodeid, objMetricsDbQueueHealthyEventDetails.nodeid)&&
  Objects.equals(this.instanceport, objMetricsDbQueueHealthyEventDetails.instanceport)&&
  Objects.equals(this.period, objMetricsDbQueueHealthyEventDetails.period)&&
  Objects.equals(this.runtime, objMetricsDbQueueHealthyEventDetails.runtime);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricsDbQueueHealthyEventDetails {\n");
      sb.append("    high: ").append(toIndentedString(high)).append("\n");
        sb.append("    instanceport: ").append(toIndentedString(instanceport)).append("\n");
        sb.append("    low: ").append(toIndentedString(low)).append("\n");
        sb.append("    nodeid: ").append(toIndentedString(nodeid)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
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

