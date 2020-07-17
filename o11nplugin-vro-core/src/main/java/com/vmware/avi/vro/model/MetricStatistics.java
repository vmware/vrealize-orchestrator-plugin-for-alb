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
 * The MetricStatistics is a POJO class extends AviRestResource that used for creating
 * MetricStatistics.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MetricStatistics")
@VsoFinder(name = Constants.FINDER_VRO_METRICSTATISTICS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MetricStatistics extends AviRestResource {
  @JsonProperty("last_sample")
  @JsonInclude(Include.NON_NULL)
  private Float lastSample = null;

  @JsonProperty("max")
  @JsonInclude(Include.NON_NULL)
  private Float max = null;

  @JsonProperty("max_ts")
  @JsonInclude(Include.NON_NULL)
  private String maxTs = null;

  @JsonProperty("mean")
  @JsonInclude(Include.NON_NULL)
  private Float mean = null;

  @JsonProperty("min")
  @JsonInclude(Include.NON_NULL)
  private Float min = null;

  @JsonProperty("min_ts")
  @JsonInclude(Include.NON_NULL)
  private String minTs = null;

  @JsonProperty("num_samples")
  @JsonInclude(Include.NON_NULL)
  private Integer numSamples = null;

  @JsonProperty("sum")
  @JsonInclude(Include.NON_NULL)
  private Float sum = null;

  @JsonProperty("trend")
  @JsonInclude(Include.NON_NULL)
  private Float trend = null;



  /**
   * This is the getter method this will return the attribute value.
   * Value of the last sample.
   * @return lastSample
   */
  @VsoMethod
  public Float getLastSample() {
    return lastSample;
  }

  /**
   * This is the setter method to the attribute.
   * Value of the last sample.
   * @param lastSample set the lastSample.
   */
  @VsoMethod
  public void setLastSample(Float  lastSample) {
    this.lastSample = lastSample;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum value in time series requested.
   * @return max
   */
  @VsoMethod
  public Float getMax() {
    return max;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum value in time series requested.
   * @param max set the max.
   */
  @VsoMethod
  public void setMax(Float  max) {
    this.max = max;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp of the minimum value.
   * @return maxTs
   */
  @VsoMethod
  public String getMaxTs() {
    return maxTs;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp of the minimum value.
   * @param maxTs set the maxTs.
   */
  @VsoMethod
  public void setMaxTs(String  maxTs) {
    this.maxTs = maxTs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Arithmetic mean.
   * @return mean
   */
  @VsoMethod
  public Float getMean() {
    return mean;
  }

  /**
   * This is the setter method to the attribute.
   * Arithmetic mean.
   * @param mean set the mean.
   */
  @VsoMethod
  public void setMean(Float  mean) {
    this.mean = mean;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum value in time series requested.
   * @return min
   */
  @VsoMethod
  public Float getMin() {
    return min;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum value in time series requested.
   * @param min set the min.
   */
  @VsoMethod
  public void setMin(Float  min) {
    this.min = min;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp of the minimum value.
   * @return minTs
   */
  @VsoMethod
  public String getMinTs() {
    return minTs;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp of the minimum value.
   * @param minTs set the minTs.
   */
  @VsoMethod
  public void setMinTs(String  minTs) {
    this.minTs = minTs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of actual data samples.
   * It excludes fake data.
   * @return numSamples
   */
  @VsoMethod
  public Integer getNumSamples() {
    return numSamples;
  }

  /**
   * This is the setter method to the attribute.
   * Number of actual data samples.
   * It excludes fake data.
   * @param numSamples set the numSamples.
   */
  @VsoMethod
  public void setNumSamples(Integer  numSamples) {
    this.numSamples = numSamples;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Summation of all values.
   * @return sum
   */
  @VsoMethod
  public Float getSum() {
    return sum;
  }

  /**
   * This is the setter method to the attribute.
   * Summation of all values.
   * @param sum set the sum.
   */
  @VsoMethod
  public void setSum(Float  sum) {
    this.sum = sum;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Slope of the data points across the time series requested.
   * Trend = (last_value - avg)/avg.
   * @return trend
   */
  @VsoMethod
  public Float getTrend() {
    return trend;
  }

  /**
   * This is the setter method to the attribute.
   * Slope of the data points across the time series requested.
   * Trend = (last_value - avg)/avg.
   * @param trend set the trend.
   */
  @VsoMethod
  public void setTrend(Float  trend) {
    this.trend = trend;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MetricStatistics objMetricStatistics = (MetricStatistics) o;
  return   Objects.equals(this.min, objMetricStatistics.min)&&
  Objects.equals(this.trend, objMetricStatistics.trend)&&
  Objects.equals(this.max, objMetricStatistics.max)&&
  Objects.equals(this.sum, objMetricStatistics.sum)&&
  Objects.equals(this.maxTs, objMetricStatistics.maxTs)&&
  Objects.equals(this.minTs, objMetricStatistics.minTs)&&
  Objects.equals(this.numSamples, objMetricStatistics.numSamples)&&
  Objects.equals(this.lastSample, objMetricStatistics.lastSample)&&
  Objects.equals(this.mean, objMetricStatistics.mean);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricStatistics {\n");
      sb.append("    lastSample: ").append(toIndentedString(lastSample)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    maxTs: ").append(toIndentedString(maxTs)).append("\n");
        sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    minTs: ").append(toIndentedString(minTs)).append("\n");
        sb.append("    numSamples: ").append(toIndentedString(numSamples)).append("\n");
        sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
        sb.append("    trend: ").append(toIndentedString(trend)).append("\n");
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

