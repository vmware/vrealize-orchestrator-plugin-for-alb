package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.PGDeploymentRule;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The PGDeploymentRuleResult is a POJO class extends AviRestResource that used for creating
 * PGDeploymentRuleResult.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PGDeploymentRuleResult")
@VsoFinder(name = Constants.FINDER_VRO_PGDEPLOYMENTRULERESULT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PGDeploymentRuleResult extends AviRestResource {
  @JsonProperty("metric_value")
  @JsonInclude(Include.NON_NULL)
  private Float metricValue = null;

  @JsonProperty("result")
  @JsonInclude(Include.NON_NULL)
  private Boolean result = null;

  @JsonProperty("rule")
  @JsonInclude(Include.NON_NULL)
  private PGDeploymentRule rule = null;



  /**
   * This is the getter method this will return the attribute value.
   * Metric value that is used as the pass fail.
   * If it is not provided then it will simply compare it with current pool vs new pool.
   * @return metricValue
   */
  @VsoMethod
  public Float getMetricValue() {
    return metricValue;
  }

  /**
   * This is the setter method to the attribute.
   * Metric value that is used as the pass fail.
   * If it is not provided then it will simply compare it with current pool vs new pool.
   * @param metricValue set the metricValue.
   */
  @VsoMethod
  public void setMetricValue(Float  metricValue) {
    this.metricValue = metricValue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Whether rule passed or failed.
   * @return result
   */
  @VsoMethod
  public Boolean getResult() {
    return result;
  }

  /**
   * This is the setter method to the attribute.
   * Whether rule passed or failed.
   * @param result set the result.
   */
  @VsoMethod
  public void setResult(Boolean  result) {
    this.result = result;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rule used for evaluation.
   * @return rule
   */
  @VsoMethod
  public PGDeploymentRule getRule() {
    return rule;
  }

  /**
   * This is the setter method to the attribute.
   * Rule used for evaluation.
   * @param rule set the rule.
   */
  @VsoMethod
  public void setRule(PGDeploymentRule rule) {
    this.rule = rule;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PGDeploymentRuleResult objPGDeploymentRuleResult = (PGDeploymentRuleResult) o;
  return   Objects.equals(this.metricValue, objPGDeploymentRuleResult.metricValue)&&
  Objects.equals(this.rule, objPGDeploymentRuleResult.rule)&&
  Objects.equals(this.result, objPGDeploymentRuleResult.result);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PGDeploymentRuleResult {\n");
      sb.append("    metricValue: ").append(toIndentedString(metricValue)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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

