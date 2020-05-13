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
 * AlertMetricThreshold
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AlertMetricThreshold")
@VsoFinder(name = Constants.FINDER_VRO_ALERTMETRICTHRESHOLD, idAccessor = "getObjectID()")
@Service
public class AlertMetricThreshold extends AviRestResource  {
  @JsonProperty("comparator")
  private String comparator = "ALERT_OP_GT";

  @JsonProperty("threshold")
  private Integer threshold = null;

  
  /**
   *  Enum options - ALERT_OP_LT, ALERT_OP_LE, ALERT_OP_EQ, ALERT_OP_NE, ALERT_OP_GE, ALERT_OP_GT.
   * @return comparator
  **/
  @ApiModelProperty(required = true, value = " Enum options - ALERT_OP_LT, ALERT_OP_LE, ALERT_OP_EQ, ALERT_OP_NE, ALERT_OP_GE, ALERT_OP_GT.")
  @NotNull


 
  @VsoMethod  
  public String getComparator() {
    return comparator;
  }
    
  @VsoMethod
  public void setComparator(String comparator) {
    this.comparator = comparator;
  }

  
  /**
   * Metric threshold for comparison.
   * @return threshold
  **/
  @ApiModelProperty(value = "Metric threshold for comparison.")


 
  @VsoMethod  
  public Integer getThreshold() {
    return threshold;
  }
    
  @VsoMethod
  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }

  
  public String getObjectID() {
		return "AlertMetricThreshold";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertMetricThreshold alertMetricThreshold = (AlertMetricThreshold) o;
    return Objects.equals(this.comparator, alertMetricThreshold.comparator) &&
        Objects.equals(this.threshold, alertMetricThreshold.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparator, threshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertMetricThreshold {\n");
    
    sb.append("    comparator: ").append(toIndentedString(comparator)).append("\n");
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

