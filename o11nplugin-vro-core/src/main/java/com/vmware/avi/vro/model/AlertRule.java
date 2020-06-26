package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AlertFilter;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The AlertRule is a POJO class extends AviRestResource that used for creating
 * AlertRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AlertRule")
@VsoFinder(name = Constants.FINDER_VRO_ALERTRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AlertRule extends AviRestResource {
  @JsonProperty("conn_app_log_rule")
  @JsonInclude(Include.NON_NULL)
  private AlertFilter connAppLogRule = null;

  @JsonProperty("event_match_filter")
  @JsonInclude(Include.NON_NULL)
  private String eventMatchFilter = null;

  @JsonProperty("metrics_rule")
  @JsonInclude(Include.NON_NULL)
  private List<AlertRuleMetric> metricsRule = null;

  @JsonProperty("operator")
  @JsonInclude(Include.NON_NULL)
  private String operator = "OPERATOR_AND";

  @JsonProperty("sys_event_rule")
  @JsonInclude(Include.NON_NULL)
  private List<AlertRuleEvent> sysEventRule = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property conn_app_log_rule of obj type alertrule field type str  type ref.
   * @return connAppLogRule
   */
  @VsoMethod
  public AlertFilter getConnAppLogRule() {
    return connAppLogRule;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property conn_app_log_rule of obj type alertrule field type str  type ref.
   * @param connAppLogRule set the connAppLogRule.
   */
  @VsoMethod
  public void setConnAppLogRule(AlertFilter connAppLogRule) {
    this.connAppLogRule = connAppLogRule;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property event_match_filter of obj type alertrule field type str  type string.
   * @return eventMatchFilter
   */
  @VsoMethod
  public String getEventMatchFilter() {
    return eventMatchFilter;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property event_match_filter of obj type alertrule field type str  type string.
   * @param eventMatchFilter set the eventMatchFilter.
   */
  @VsoMethod
  public void setEventMatchFilter(String  eventMatchFilter) {
    this.eventMatchFilter = eventMatchFilter;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property metrics_rule of obj type alertrule field type str  type array.
   * @return metricsRule
   */
  @VsoMethod
  public List<AlertRuleMetric> getMetricsRule() {
    return metricsRule;
  }

  /**
   * This is the setter method. this will set the metricsRule
   * Placeholder for description of property metrics_rule of obj type alertrule field type str  type array.
   * @return metricsRule
   */
  @VsoMethod
  public void setMetricsRule(List<AlertRuleMetric>  metricsRule) {
    this.metricsRule = metricsRule;
  }

  /**
   * This is the setter method this will set the metricsRule
   * Placeholder for description of property metrics_rule of obj type alertrule field type str  type array.
   * @return metricsRule
   */
  @VsoMethod
  public AlertRule addMetricsRuleItem(AlertRuleMetric metricsRuleItem) {
    if (this.metricsRule == null) {
      this.metricsRule = new ArrayList<AlertRuleMetric>();
    }
    this.metricsRule.add(metricsRuleItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Enum options - OPERATOR_AND, OPERATOR_OR.
   * Default value when not specified in API or module is interpreted by Avi Controller as OPERATOR_AND.
   * @return operator
   */
  @VsoMethod
  public String getOperator() {
    return operator;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - OPERATOR_AND, OPERATOR_OR.
   * Default value when not specified in API or module is interpreted by Avi Controller as OPERATOR_AND.
   * @param operator set the operator.
   */
  @VsoMethod
  public void setOperator(String  operator) {
    this.operator = operator;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property sys_event_rule of obj type alertrule field type str  type array.
   * @return sysEventRule
   */
  @VsoMethod
  public List<AlertRuleEvent> getSysEventRule() {
    return sysEventRule;
  }

  /**
   * This is the setter method. this will set the sysEventRule
   * Placeholder for description of property sys_event_rule of obj type alertrule field type str  type array.
   * @return sysEventRule
   */
  @VsoMethod
  public void setSysEventRule(List<AlertRuleEvent>  sysEventRule) {
    this.sysEventRule = sysEventRule;
  }

  /**
   * This is the setter method this will set the sysEventRule
   * Placeholder for description of property sys_event_rule of obj type alertrule field type str  type array.
   * @return sysEventRule
   */
  @VsoMethod
  public AlertRule addSysEventRuleItem(AlertRuleEvent sysEventRuleItem) {
    if (this.sysEventRule == null) {
      this.sysEventRule = new ArrayList<AlertRuleEvent>();
    }
    this.sysEventRule.add(sysEventRuleItem);
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
  AlertRule objAlertRule = (AlertRule) o;
  return   Objects.equals(this.operator, objAlertRule.operator)&&
  Objects.equals(this.sysEventRule, objAlertRule.sysEventRule)&&
  Objects.equals(this.metricsRule, objAlertRule.metricsRule)&&
  Objects.equals(this.eventMatchFilter, objAlertRule.eventMatchFilter)&&
  Objects.equals(this.connAppLogRule, objAlertRule.connAppLogRule);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AlertRule {\n");
      sb.append("    connAppLogRule: ").append(toIndentedString(connAppLogRule)).append("\n");
        sb.append("    eventMatchFilter: ").append(toIndentedString(eventMatchFilter)).append("\n");
        sb.append("    metricsRule: ").append(toIndentedString(metricsRule)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    sysEventRule: ").append(toIndentedString(sysEventRule)).append("\n");
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
