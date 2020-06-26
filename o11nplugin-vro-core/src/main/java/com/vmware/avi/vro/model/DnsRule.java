package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.DnsRuleAction;
import com.vmware.avi.vro.model.DnsRuleMatchTarget;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DnsRule is a POJO class extends AviRestResource that used for creating
 * DnsRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsRule")
@VsoFinder(name = Constants.FINDER_VRO_DNSRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsRule extends AviRestResource {
  @JsonProperty("action")
  @JsonInclude(Include.NON_NULL)
  private DnsRuleAction action = null;

  @JsonProperty("enable")
  @JsonInclude(Include.NON_NULL)
  private Boolean enable = true;

  @JsonProperty("index")
  @JsonInclude(Include.NON_NULL)
  private Integer index = null;

  @JsonProperty("log")
  @JsonInclude(Include.NON_NULL)
  private Boolean log = null;

  @JsonProperty("match")
  @JsonInclude(Include.NON_NULL)
  private DnsRuleMatchTarget match = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;



  /**
   * This is the getter method this will return the attribute value.
   * Action to be performed upon successful matching.
   * Field introduced in 17.1.1.
   * @return action
   */
  @VsoMethod
  public DnsRuleAction getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Action to be performed upon successful matching.
   * Field introduced in 17.1.1.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(DnsRuleAction action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable or disable the rule.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enable
   */
  @VsoMethod
  public Boolean getEnable() {
    return enable;
  }

  /**
   * This is the setter method to the attribute.
   * Enable or disable the rule.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enable set the enable.
   */
  @VsoMethod
  public void setEnable(Boolean  enable) {
    this.enable = enable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Index of the rule.
   * Field introduced in 17.1.1.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Index of the rule.
   * Field introduced in 17.1.1.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Log dns query upon rule match.
   * Field introduced in 17.1.1.
   * @return log
   */
  @VsoMethod
  public Boolean getLog() {
    return log;
  }

  /**
   * This is the setter method to the attribute.
   * Log dns query upon rule match.
   * Field introduced in 17.1.1.
   * @param log set the log.
   */
  @VsoMethod
  public void setLog(Boolean  log) {
    this.log = log;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Add match criteria to the rule.
   * Field introduced in 17.1.1.
   * @return match
   */
  @VsoMethod
  public DnsRuleMatchTarget getMatch() {
    return match;
  }

  /**
   * This is the setter method to the attribute.
   * Add match criteria to the rule.
   * Field introduced in 17.1.1.
   * @param match set the match.
   */
  @VsoMethod
  public void setMatch(DnsRuleMatchTarget match) {
    this.match = match;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the rule.
   * Field introduced in 17.1.1.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the rule.
   * Field introduced in 17.1.1.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsRule objDnsRule = (DnsRule) o;
  return   Objects.equals(this.index, objDnsRule.index)&&
  Objects.equals(this.enable, objDnsRule.enable)&&
  Objects.equals(this.name, objDnsRule.name)&&
  Objects.equals(this.action, objDnsRule.action)&&
  Objects.equals(this.match, objDnsRule.match)&&
  Objects.equals(this.log, objDnsRule.log);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsRule {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
        sb.append("    match: ").append(toIndentedString(match)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
