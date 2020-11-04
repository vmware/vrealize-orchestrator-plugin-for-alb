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
 * The MetricsEventThreshold is a POJO class extends AviRestResource that used for creating
 * MetricsEventThreshold.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MetricsEventThreshold")
@VsoFinder(name = Constants.FINDER_VRO_METRICSEVENTTHRESHOLD)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MetricsEventThreshold extends AviRestResource {
    @JsonProperty("metrics_event_threshold_type")
    @JsonInclude(Include.NON_NULL)
    private String metricsEventThresholdType = null;

    @JsonProperty("reset_threshold")
    @JsonInclude(Include.NON_NULL)
    private Float resetThreshold = null;

    @JsonProperty("watermark_thresholds")
    @JsonInclude(Include.NON_NULL)
    private List<Integer> watermarkThresholds = null;



  /**
   * This is the getter method this will return the attribute value.
   * Type of the metrics event threshold.
   * This value will decide which metric rule (or rules) use configured thresholds.
   * Enum options - THRESHOLD_TYPE_STATIC, SE_CPU_THRESHOLD, SE_MEM_THRESHOLD, SE_DISK_THRESHOLD.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricsEventThresholdType
   */
  @VsoMethod
  public String getMetricsEventThresholdType() {
    return metricsEventThresholdType;
  }

  /**
   * This is the setter method to the attribute.
   * Type of the metrics event threshold.
   * This value will decide which metric rule (or rules) use configured thresholds.
   * Enum options - THRESHOLD_TYPE_STATIC, SE_CPU_THRESHOLD, SE_MEM_THRESHOLD, SE_DISK_THRESHOLD.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metricsEventThresholdType set the metricsEventThresholdType.
   */
  @VsoMethod
  public void setMetricsEventThresholdType(String  metricsEventThresholdType) {
    this.metricsEventThresholdType = metricsEventThresholdType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This value is used to reset the event state machine.
   * Allowed values are 0-100.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resetThreshold
   */
  @VsoMethod
  public Float getResetThreshold() {
    return resetThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * This value is used to reset the event state machine.
   * Allowed values are 0-100.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param resetThreshold set the resetThreshold.
   */
  @VsoMethod
  public void setResetThreshold(Float  resetThreshold) {
    this.resetThreshold = resetThreshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Threshold value for which event in raised.
   * There can be multiple thresholds defined.health score degrades when the the target is higher than this threshold.
   * Allowed values are 0-100.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return watermarkThresholds
   */
  @VsoMethod
  public List<Integer> getWatermarkThresholds() {
    return watermarkThresholds;
  }

  /**
   * This is the setter method. this will set the watermarkThresholds
   * Threshold value for which event in raised.
   * There can be multiple thresholds defined.health score degrades when the the target is higher than this threshold.
   * Allowed values are 0-100.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return watermarkThresholds
   */
  @VsoMethod
  public void setWatermarkThresholds(List<Integer>  watermarkThresholds) {
    this.watermarkThresholds = watermarkThresholds;
  }

  /**
   * This is the setter method this will set the watermarkThresholds
   * Threshold value for which event in raised.
   * There can be multiple thresholds defined.health score degrades when the the target is higher than this threshold.
   * Allowed values are 0-100.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return watermarkThresholds
   */
  @VsoMethod
  public MetricsEventThreshold addWatermarkThresholdsItem(Integer watermarkThresholdsItem) {
    if (this.watermarkThresholds == null) {
      this.watermarkThresholds = new ArrayList<Integer>();
    }
    this.watermarkThresholds.add(watermarkThresholdsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MetricsEventThreshold objMetricsEventThreshold = (MetricsEventThreshold) o;
  return   Objects.equals(this.resetThreshold, objMetricsEventThreshold.resetThreshold)&&
  Objects.equals(this.watermarkThresholds, objMetricsEventThreshold.watermarkThresholds)&&
  Objects.equals(this.metricsEventThresholdType, objMetricsEventThreshold.metricsEventThresholdType);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricsEventThreshold {\n");
      sb.append("    metricsEventThresholdType: ").append(toIndentedString(metricsEventThresholdType)).append("\n");
        sb.append("    resetThreshold: ").append(toIndentedString(resetThreshold)).append("\n");
        sb.append("    watermarkThresholds: ").append(toIndentedString(watermarkThresholds)).append("\n");
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

