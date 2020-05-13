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
 * PGDeploymentRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "PGDeploymentRule")
@VsoFinder(name = Constants.FINDER_VRO_PGDEPLOYMENTRULE, idAccessor = "getObjectID()")
@Service
public class PGDeploymentRule extends AviRestResource  {
  @JsonProperty("metric_id")
  private String metricId = "health.health_score_value";

  @JsonProperty("operator")
  private String operator = "CO_GE";

  @JsonProperty("threshold")
  private Double threshold = null;

  
  /**
   * metric_id of PGDeploymentRule.
   * @return metricId
  **/
  @ApiModelProperty(value = "metric_id of PGDeploymentRule.")


 
  @VsoMethod  
  public String getMetricId() {
    return metricId;
  }
    
  @VsoMethod
  public void setMetricId(String metricId) {
    this.metricId = metricId;
  }

  
  /**
   *  Enum options - CO_EQ, CO_GT, CO_GE, CO_LT, CO_LE, CO_NE.
   * @return operator
  **/
  @ApiModelProperty(value = " Enum options - CO_EQ, CO_GT, CO_GE, CO_LT, CO_LE, CO_NE.")


 
  @VsoMethod  
  public String getOperator() {
    return operator;
  }
    
  @VsoMethod
  public void setOperator(String operator) {
    this.operator = operator;
  }

  
  /**
   * metric threshold that is used as the pass fail. If it is not provided then it will simply compare it with current pool vs new pool.
   * @return threshold
  **/
  @ApiModelProperty(value = "metric threshold that is used as the pass fail. If it is not provided then it will simply compare it with current pool vs new pool.")


 
  @VsoMethod  
  public Double getThreshold() {
    return threshold;
  }
    
  @VsoMethod
  public void setThreshold(Double threshold) {
    this.threshold = threshold;
  }

  
  public String getObjectID() {
		return "PGDeploymentRule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PGDeploymentRule pgDeploymentRule = (PGDeploymentRule) o;
    return Objects.equals(this.metricId, pgDeploymentRule.metricId) &&
        Objects.equals(this.operator, pgDeploymentRule.operator) &&
        Objects.equals(this.threshold, pgDeploymentRule.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricId, operator, threshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PGDeploymentRule {\n");
    
    sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

