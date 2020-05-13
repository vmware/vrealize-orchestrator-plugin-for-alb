package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AlertMetricThreshold;
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
 * AlertRuleMetric
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AlertRuleMetric")
@VsoFinder(name = Constants.FINDER_VRO_ALERTRULEMETRIC, idAccessor = "getObjectID()")
@Service
public class AlertRuleMetric extends AviRestResource  {
  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("metric_id")
  private String metricId = null;

  @JsonProperty("metric_threshold")
  private AlertMetricThreshold metricThreshold = null;

  
  /**
   * Evaluation window for the Metrics.
   * @return duration
  **/
  @ApiModelProperty(value = "Evaluation window for the Metrics.")


 
  @VsoMethod  
  public Integer getDuration() {
    return duration;
  }
    
  @VsoMethod
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * Metric Id for the Alert. Eg. l4_client.avg_complete_conns.
   * @return metricId
  **/
  @ApiModelProperty(value = "Metric Id for the Alert. Eg. l4_client.avg_complete_conns.")


 
  @VsoMethod  
  public String getMetricId() {
    return metricId;
  }
    
  @VsoMethod
  public void setMetricId(String metricId) {
    this.metricId = metricId;
  }

  
  /**
   * Placeholder for description of property metric_threshold of obj type AlertRuleMetric field type str  type object
   * @return metricThreshold
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property metric_threshold of obj type AlertRuleMetric field type str  type object")
  @NotNull

  @Valid

 
  @VsoMethod  
  public AlertMetricThreshold getMetricThreshold() {
    return metricThreshold;
  }
    
  @VsoMethod
  public void setMetricThreshold(AlertMetricThreshold metricThreshold) {
    this.metricThreshold = metricThreshold;
  }

  
  public String getObjectID() {
		return "AlertRuleMetric";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertRuleMetric alertRuleMetric = (AlertRuleMetric) o;
    return Objects.equals(this.duration, alertRuleMetric.duration) &&
        Objects.equals(this.metricId, alertRuleMetric.metricId) &&
        Objects.equals(this.metricThreshold, alertRuleMetric.metricThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, metricId, metricThreshold);
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

