package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AlertFilter;
import com.vmware.avi.vro.model.AlertRuleEvent;
import com.vmware.avi.vro.model.AlertRuleMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * AlertRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AlertRule")
@VsoFinder(name = Constants.FINDER_VRO_ALERTRULE, idAccessor = "getObjectID()")
@Service
public class AlertRule extends AviRestResource  {
  @JsonProperty("conn_app_log_rule")
  private AlertFilter connAppLogRule = null;

  @JsonProperty("event_match_filter")
  private String eventMatchFilter = null;

  @JsonProperty("metrics_rule")
  @Valid
  private List<AlertRuleMetric> metricsRule = null;

  @JsonProperty("operator")
  private String operator = "OPERATOR_AND";

  @JsonProperty("sys_event_rule")
  @Valid
  private List<AlertRuleEvent> sysEventRule = null;

  
  /**
   * Placeholder for description of property conn_app_log_rule of obj type AlertRule field type str  type object
   * @return connAppLogRule
  **/
  @ApiModelProperty(value = "Placeholder for description of property conn_app_log_rule of obj type AlertRule field type str  type object")

  @Valid

 
  @VsoMethod  
  public AlertFilter getConnAppLogRule() {
    return connAppLogRule;
  }
    
  @VsoMethod
  public void setConnAppLogRule(AlertFilter connAppLogRule) {
    this.connAppLogRule = connAppLogRule;
  }

  
  /**
   * event_match_filter of AlertRule.
   * @return eventMatchFilter
  **/
  @ApiModelProperty(value = "event_match_filter of AlertRule.")


 
  @VsoMethod  
  public String getEventMatchFilter() {
    return eventMatchFilter;
  }
    
  @VsoMethod
  public void setEventMatchFilter(String eventMatchFilter) {
    this.eventMatchFilter = eventMatchFilter;
  }

  
  public AlertRule addMetricsRuleItem(AlertRuleMetric metricsRuleItem) {
    if (this.metricsRule == null) {
      this.metricsRule = new ArrayList<AlertRuleMetric>();
    }
    this.metricsRule.add(metricsRuleItem);
    return this;
  }
  
  /**
   * Placeholder for description of property metrics_rule of obj type AlertRule field type str  type object
   * @return metricsRule
  **/
  @ApiModelProperty(value = "Placeholder for description of property metrics_rule of obj type AlertRule field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<AlertRuleMetric> getMetricsRule() {
    return metricsRule;
  }
    
  @VsoMethod
  public void setMetricsRule(List<AlertRuleMetric> metricsRule) {
    this.metricsRule = metricsRule;
  }

  
  /**
   *  Enum options - OPERATOR_AND, OPERATOR_OR.
   * @return operator
  **/
  @ApiModelProperty(value = " Enum options - OPERATOR_AND, OPERATOR_OR.")


 
  @VsoMethod  
  public String getOperator() {
    return operator;
  }
    
  @VsoMethod
  public void setOperator(String operator) {
    this.operator = operator;
  }

  
  public AlertRule addSysEventRuleItem(AlertRuleEvent sysEventRuleItem) {
    if (this.sysEventRule == null) {
      this.sysEventRule = new ArrayList<AlertRuleEvent>();
    }
    this.sysEventRule.add(sysEventRuleItem);
    return this;
  }
  
  /**
   * Placeholder for description of property sys_event_rule of obj type AlertRule field type str  type object
   * @return sysEventRule
  **/
  @ApiModelProperty(value = "Placeholder for description of property sys_event_rule of obj type AlertRule field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<AlertRuleEvent> getSysEventRule() {
    return sysEventRule;
  }
    
  @VsoMethod
  public void setSysEventRule(List<AlertRuleEvent> sysEventRule) {
    this.sysEventRule = sysEventRule;
  }

  
  public String getObjectID() {
		return "AlertRule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertRule alertRule = (AlertRule) o;
    return Objects.equals(this.connAppLogRule, alertRule.connAppLogRule) &&
        Objects.equals(this.eventMatchFilter, alertRule.eventMatchFilter) &&
        Objects.equals(this.metricsRule, alertRule.metricsRule) &&
        Objects.equals(this.operator, alertRule.operator) &&
        Objects.equals(this.sysEventRule, alertRule.sysEventRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connAppLogRule, eventMatchFilter, metricsRule, operator, sysEventRule);
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

