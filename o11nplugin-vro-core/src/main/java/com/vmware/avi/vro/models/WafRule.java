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
 * The WafRule is a POJO class extends AviRestResource that used for creating
 * WafRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafRule")
@VsoFinder(name = Constants.FINDER_VRO_WAFRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafRule extends AviRestResource {
    @JsonProperty("enable")
    @JsonInclude(Include.NON_NULL)
    private Boolean enable = true;

    @JsonProperty("exclude_list")
    @JsonInclude(Include.NON_NULL)
    private List<WafExcludeListEntry> excludeList = null;

    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index = null;

    @JsonProperty("is_sensitive")
    @JsonInclude(Include.NON_NULL)
    private Boolean isSensitive = false;

    @JsonProperty("mode")
    @JsonInclude(Include.NON_NULL)
    private String mode = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("phase")
    @JsonInclude(Include.NON_NULL)
    private String phase;

    @JsonProperty("rule")
    @JsonInclude(Include.NON_NULL)
    private String rule = null;

    @JsonProperty("rule_id")
    @JsonInclude(Include.NON_NULL)
    private String ruleId = null;

    @JsonProperty("tags")
    @JsonInclude(Include.NON_NULL)
    private List<String> tags = null;



  /**
   * This is the getter method this will return the attribute value.
   * Enable or disable waf rule group.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enable
   */
  @VsoMethod
  public Boolean getEnable() {
    return enable;
  }

  /**
   * This is the setter method to the attribute.
   * Enable or disable waf rule group.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enable set the enable.
   */
  @VsoMethod
  public void setEnable(Boolean  enable) {
    this.enable = enable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Exclude list for the waf rule.
   * The fields in the exclude list entry are logically and'ed to deduce the exclusion criteria.
   * If there are multiple excludelist entries, it will be 'logical or' of them.
   * Field introduced in 17.2.3.
   * Maximum of 64 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return excludeList
   */
  @VsoMethod
  public List<WafExcludeListEntry> getExcludeList() {
    return excludeList;
  }

  /**
   * This is the setter method. this will set the excludeList
   * Exclude list for the waf rule.
   * The fields in the exclude list entry are logically and'ed to deduce the exclusion criteria.
   * If there are multiple excludelist entries, it will be 'logical or' of them.
   * Field introduced in 17.2.3.
   * Maximum of 64 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return excludeList
   */
  @VsoMethod
  public void setExcludeList(List<WafExcludeListEntry>  excludeList) {
    this.excludeList = excludeList;
  }

  /**
   * This is the setter method this will set the excludeList
   * Exclude list for the waf rule.
   * The fields in the exclude list entry are logically and'ed to deduce the exclusion criteria.
   * If there are multiple excludelist entries, it will be 'logical or' of them.
   * Field introduced in 17.2.3.
   * Maximum of 64 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return excludeList
   */
  @VsoMethod
  public WafRule addExcludeListItem(WafExcludeListEntry excludeListItem) {
    if (this.excludeList == null) {
      this.excludeList = new ArrayList<WafExcludeListEntry>();
    }
    this.excludeList.add(excludeListItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The rule field is sensitive and will not be displayed.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isSensitive
   */
  @VsoMethod
  public Boolean getIsSensitive() {
    return isSensitive;
  }

  /**
   * This is the setter method to the attribute.
   * The rule field is sensitive and will not be displayed.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isSensitive set the isSensitive.
   */
  @VsoMethod
  public void setIsSensitive(Boolean  isSensitive) {
    this.isSensitive = isSensitive;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf rule mode.
   * This can be detection or enforcement.
   * If this is not set, the policy mode is used.
   * This only takes effect if the policy allows delegation.
   * Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT.
   * Field introduced in 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mode
   */
  @VsoMethod
  public String getMode() {
    return mode;
  }

  /**
   * This is the setter method to the attribute.
   * Waf rule mode.
   * This can be detection or enforcement.
   * If this is not set, the policy mode is used.
   * This only takes effect if the policy allows delegation.
   * Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT.
   * Field introduced in 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mode set the mode.
   */
  @VsoMethod
  public void setMode(String  mode) {
    this.mode = mode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User-friendly optional name for a rule.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * User-friendly optional name for a rule.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The execution phase where this rule will be executed.
   * Enum options - WAF_PHASE_CONNECTION, WAF_PHASE_REQUEST_HEADER, WAF_PHASE_REQUEST_BODY, WAF_PHASE_RESPONSE_HEADER, WAF_PHASE_RESPONSE_BODY,
   * WAF_PHASE_LOGGING.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return phase
   */
  @VsoMethod
  public String getPhase() {
    return phase;
  }

  /**
   * This is the setter method to the attribute.
   * The execution phase where this rule will be executed.
   * Enum options - WAF_PHASE_CONNECTION, WAF_PHASE_REQUEST_HEADER, WAF_PHASE_REQUEST_BODY, WAF_PHASE_RESPONSE_HEADER, WAF_PHASE_RESPONSE_BODY,
   * WAF_PHASE_LOGGING.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @param phase set the phase.
   */
  @VsoMethod
  public void setPhase(String  phase) {
    this.phase = phase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rule as per modsec language.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rule
   */
  @VsoMethod
  public String getRule() {
    return rule;
  }

  /**
   * This is the setter method to the attribute.
   * Rule as per modsec language.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rule set the rule.
   */
  @VsoMethod
  public void setRule(String  rule) {
    this.rule = rule;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Identifier (id) for a rule per modsec language.
   * All secrule and secaction directives require an id.
   * It is extracted from the id action in a modsec rule.
   * Rules within a single waf policy are required to have unique rule_ids.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ruleId
   */
  @VsoMethod
  public String getRuleId() {
    return ruleId;
  }

  /**
   * This is the setter method to the attribute.
   * Identifier (id) for a rule per modsec language.
   * All secrule and secaction directives require an id.
   * It is extracted from the id action in a modsec rule.
   * Rules within a single waf policy are required to have unique rule_ids.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ruleId set the ruleId.
   */
  @VsoMethod
  public void setRuleId(String  ruleId) {
    this.ruleId = ruleId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tags for waf rule as per modsec language.
   * They are extracted from the tag action in a modsec rule.
   * Field introduced in 18.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tags
   */
  @VsoMethod
  public List<String> getTags() {
    return tags;
  }

  /**
   * This is the setter method. this will set the tags
   * Tags for waf rule as per modsec language.
   * They are extracted from the tag action in a modsec rule.
   * Field introduced in 18.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tags
   */
  @VsoMethod
  public void setTags(List<String>  tags) {
    this.tags = tags;
  }

  /**
   * This is the setter method this will set the tags
   * Tags for waf rule as per modsec language.
   * They are extracted from the tag action in a modsec rule.
   * Field introduced in 18.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tags
   */
  @VsoMethod
  public WafRule addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
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
  WafRule objWafRule = (WafRule) o;
  return   Objects.equals(this.index, objWafRule.index)&&
  Objects.equals(this.name, objWafRule.name)&&
  Objects.equals(this.ruleId, objWafRule.ruleId)&&
  Objects.equals(this.enable, objWafRule.enable)&&
  Objects.equals(this.rule, objWafRule.rule)&&
  Objects.equals(this.excludeList, objWafRule.excludeList)&&
  Objects.equals(this.tags, objWafRule.tags)&&
  Objects.equals(this.mode, objWafRule.mode)&&
  Objects.equals(this.isSensitive, objWafRule.isSensitive)&&
  Objects.equals(this.phase, objWafRule.phase);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafRule {\n");
      sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    excludeList: ").append(toIndentedString(excludeList)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    isSensitive: ").append(toIndentedString(isSensitive)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

