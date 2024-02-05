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
 * The WafPSMRule is a POJO class extends AviRestResource that used for creating
 * WafPSMRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafPSMRule")
@VsoFinder(name = Constants.FINDER_VRO_WAFPSMRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafPSMRule extends AviRestResource {
    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("enable")
    @JsonInclude(Include.NON_NULL)
    private Boolean enable = true;

    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index;

    @JsonProperty("match_case")
    @JsonInclude(Include.NON_NULL)
    private String matchCase = "INSENSITIVE";

    @JsonProperty("match_elements")
    @JsonInclude(Include.NON_NULL)
    private List<WafPSMMatchElement> matchElements;

    @JsonProperty("match_value_max_length")
    @JsonInclude(Include.NON_NULL)
    private Integer matchValueMaxLength;

    @JsonProperty("match_value_pattern")
    @JsonInclude(Include.NON_NULL)
    private String matchValuePattern;

    @JsonProperty("match_value_string_group_key")
    @JsonInclude(Include.NON_NULL)
    private String matchValueStringGroupKey;

    @JsonProperty("match_value_string_group_ref")
    @JsonInclude(Include.NON_NULL)
    private String matchValueStringGroupRef;

    @JsonProperty("mode")
    @JsonInclude(Include.NON_NULL)
    private String mode;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("paranoia_level")
    @JsonInclude(Include.NON_NULL)
    private String paranoiaLevel = "WAF_PARANOIA_LEVEL_LOW";

    @JsonProperty("rule_id")
    @JsonInclude(Include.NON_NULL)
    private String ruleId;



  /**
   * This is the getter method this will return the attribute value.
   * Free-text comment about this rule.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Free-text comment about this rule.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable or disable this rule.
   * Field introduced in 18.2.3.
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
   * Enable or disable this rule.
   * Field introduced in 18.2.3.
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
   * Rule index, this is used to determine the order of the rules.
   * Field introduced in 18.2.3.
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
   * Rule index, this is used to determine the order of the rules.
   * Field introduced in 18.2.3.
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
   * The field match_value_pattern regular expression is case sensitive.
   * Enum options - SENSITIVE, INSENSITIVE.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "INSENSITIVE".
   * @return matchCase
   */
  @VsoMethod
  public String getMatchCase() {
    return matchCase;
  }

  /**
   * This is the setter method to the attribute.
   * The field match_value_pattern regular expression is case sensitive.
   * Enum options - SENSITIVE, INSENSITIVE.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "INSENSITIVE".
   * @param matchCase set the matchCase.
   */
  @VsoMethod
  public void setMatchCase(String  matchCase) {
    this.matchCase = matchCase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The match elements, for example args id or args|!args password.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchElements
   */
  @VsoMethod
  public List<WafPSMMatchElement> getMatchElements() {
    return matchElements;
  }

  /**
   * This is the setter method. this will set the matchElements
   * The match elements, for example args id or args|!args password.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchElements
   */
  @VsoMethod
  public void setMatchElements(List<WafPSMMatchElement>  matchElements) {
    this.matchElements = matchElements;
  }

  /**
   * This is the setter method this will set the matchElements
   * The match elements, for example args id or args|!args password.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchElements
   */
  @VsoMethod
  public WafPSMRule addMatchElementsItem(WafPSMMatchElement matchElementsItem) {
    if (this.matchElements == null) {
      this.matchElements = new ArrayList<WafPSMMatchElement>();
    }
    this.matchElements.add(matchElementsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The maximum allowed length of the match_value.
   * If this is not set, the length will not be checked.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchValueMaxLength
   */
  @VsoMethod
  public Integer getMatchValueMaxLength() {
    return matchValueMaxLength;
  }

  /**
   * This is the setter method to the attribute.
   * The maximum allowed length of the match_value.
   * If this is not set, the length will not be checked.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchValueMaxLength set the matchValueMaxLength.
   */
  @VsoMethod
  public void setMatchValueMaxLength(Integer  matchValueMaxLength) {
    this.matchValueMaxLength = matchValueMaxLength;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A regular expression which describes the expected value.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchValuePattern
   */
  @VsoMethod
  public String getMatchValuePattern() {
    return matchValuePattern;
  }

  /**
   * This is the setter method to the attribute.
   * A regular expression which describes the expected value.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchValuePattern set the matchValuePattern.
   */
  @VsoMethod
  public void setMatchValuePattern(String  matchValuePattern) {
    this.matchValuePattern = matchValuePattern;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If match_value_string_group_uuid and match_value_string_group_key are set, the referenced regular expression is used as match_value_pattern.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchValueStringGroupKey
   */
  @VsoMethod
  public String getMatchValueStringGroupKey() {
    return matchValueStringGroupKey;
  }

  /**
   * This is the setter method to the attribute.
   * If match_value_string_group_uuid and match_value_string_group_key are set, the referenced regular expression is used as match_value_pattern.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchValueStringGroupKey set the matchValueStringGroupKey.
   */
  @VsoMethod
  public void setMatchValueStringGroupKey(String  matchValueStringGroupKey) {
    this.matchValueStringGroupKey = matchValueStringGroupKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The uuid of a string group containing key used in match_value_string_group_key.
   * It is a reference to an object of type stringgroup.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchValueStringGroupRef
   */
  @VsoMethod
  public String getMatchValueStringGroupRef() {
    return matchValueStringGroupRef;
  }

  /**
   * This is the setter method to the attribute.
   * The uuid of a string group containing key used in match_value_string_group_key.
   * It is a reference to an object of type stringgroup.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchValueStringGroupRef set the matchValueStringGroupRef.
   */
  @VsoMethod
  public void setMatchValueStringGroupRef(String  matchValueStringGroupRef) {
    this.matchValueStringGroupRef = matchValueStringGroupRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf rule mode.
   * This can be detection or enforcement.
   * If this is not set, the policy mode is used.
   * This only takes effect if the policy allows delegation.
   * Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT.
   * Field introduced in 18.2.3.
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
   * Field introduced in 18.2.3.
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
   * Name of the rule.
   * Field introduced in 18.2.3.
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
   * Name of the rule.
   * Field introduced in 18.2.3.
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
   * Waf ruleset paranoia mode.
   * This is used to select rules based on the paranoia-level.
   * Enum options - WAF_PARANOIA_LEVEL_LOW, WAF_PARANOIA_LEVEL_MEDIUM, WAF_PARANOIA_LEVEL_HIGH, WAF_PARANOIA_LEVEL_EXTREME.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_PARANOIA_LEVEL_LOW".
   * @return paranoiaLevel
   */
  @VsoMethod
  public String getParanoiaLevel() {
    return paranoiaLevel;
  }

  /**
   * This is the setter method to the attribute.
   * Waf ruleset paranoia mode.
   * This is used to select rules based on the paranoia-level.
   * Enum options - WAF_PARANOIA_LEVEL_LOW, WAF_PARANOIA_LEVEL_MEDIUM, WAF_PARANOIA_LEVEL_HIGH, WAF_PARANOIA_LEVEL_EXTREME.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_PARANOIA_LEVEL_LOW".
   * @param paranoiaLevel set the paranoiaLevel.
   */
  @VsoMethod
  public void setParanoiaLevel(String  paranoiaLevel) {
    this.paranoiaLevel = paranoiaLevel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Id field which is used for log and metric generation.
   * This id must be unique for all rules in this group.
   * Field introduced in 18.2.3.
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
   * Id field which is used for log and metric generation.
   * This id must be unique for all rules in this group.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ruleId set the ruleId.
   */
  @VsoMethod
  public void setRuleId(String  ruleId) {
    this.ruleId = ruleId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  WafPSMRule objWafPSMRule = (WafPSMRule) o;
  return   Objects.equals(this.index, objWafPSMRule.index)&&
  Objects.equals(this.ruleId, objWafPSMRule.ruleId)&&
  Objects.equals(this.name, objWafPSMRule.name)&&
  Objects.equals(this.enable, objWafPSMRule.enable)&&
  Objects.equals(this.mode, objWafPSMRule.mode)&&
  Objects.equals(this.paranoiaLevel, objWafPSMRule.paranoiaLevel)&&
  Objects.equals(this.matchElements, objWafPSMRule.matchElements)&&
  Objects.equals(this.matchValueMaxLength, objWafPSMRule.matchValueMaxLength)&&
  Objects.equals(this.matchValuePattern, objWafPSMRule.matchValuePattern)&&
  Objects.equals(this.matchCase, objWafPSMRule.matchCase)&&
  Objects.equals(this.description, objWafPSMRule.description)&&
  Objects.equals(this.matchValueStringGroupRef, objWafPSMRule.matchValueStringGroupRef)&&
  Objects.equals(this.matchValueStringGroupKey, objWafPSMRule.matchValueStringGroupKey);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafPSMRule {\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
        sb.append("    matchElements: ").append(toIndentedString(matchElements)).append("\n");
        sb.append("    matchValueMaxLength: ").append(toIndentedString(matchValueMaxLength)).append("\n");
        sb.append("    matchValuePattern: ").append(toIndentedString(matchValuePattern)).append("\n");
        sb.append("    matchValueStringGroupKey: ").append(toIndentedString(matchValueStringGroupKey)).append("\n");
        sb.append("    matchValueStringGroupRef: ").append(toIndentedString(matchValueStringGroupRef)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    paranoiaLevel: ").append(toIndentedString(paranoiaLevel)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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

