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
 * The WafRuleLog is a POJO class extends AviRestResource that used for creating
 * WafRuleLog.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafRuleLog")
@VsoFinder(name = Constants.FINDER_VRO_WAFRULELOG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafRuleLog extends AviRestResource {
    @JsonProperty("matches")
    @JsonInclude(Include.NON_NULL)
    private List<WafRuleMatchData> matches = null;

    @JsonProperty("msg")
    @JsonInclude(Include.NON_NULL)
    private String msg = null;

    @JsonProperty("omitted_match_elements")
    @JsonInclude(Include.NON_NULL)
    private Integer omittedMatchElements = 0;

    @JsonProperty("phase")
    @JsonInclude(Include.NON_NULL)
    private String phase = null;

    @JsonProperty("rule_group")
    @JsonInclude(Include.NON_NULL)
    private String ruleGroup = null;

    @JsonProperty("rule_id")
    @JsonInclude(Include.NON_NULL)
    private Integer ruleId = null;

    @JsonProperty("rule_name")
    @JsonInclude(Include.NON_NULL)
    private String ruleName = null;

    @JsonProperty("tags")
    @JsonInclude(Include.NON_NULL)
    private List<String> tags = null;



  /**
   * This is the getter method this will return the attribute value.
   * Transaction data that matched the rule.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matches
   */
  @VsoMethod
  public List<WafRuleMatchData> getMatches() {
    return matches;
  }

  /**
   * This is the setter method. this will set the matches
   * Transaction data that matched the rule.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matches
   */
  @VsoMethod
  public void setMatches(List<WafRuleMatchData>  matches) {
    this.matches = matches;
  }

  /**
   * This is the setter method this will set the matches
   * Transaction data that matched the rule.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matches
   */
  @VsoMethod
  public WafRuleLog addMatchesItem(WafRuleMatchData matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<WafRuleMatchData>();
    }
    this.matches.add(matchesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Rule's msg string per modsec language.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return msg
   */
  @VsoMethod
  public String getMsg() {
    return msg;
  }

  /**
   * This is the setter method to the attribute.
   * Rule's msg string per modsec language.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param msg set the msg.
   */
  @VsoMethod
  public void setMsg(String  msg) {
    this.msg = msg;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The count of omitted match element logs in the current rule.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return omittedMatchElements
   */
  @VsoMethod
  public Integer getOmittedMatchElements() {
    return omittedMatchElements;
  }

  /**
   * This is the setter method to the attribute.
   * The count of omitted match element logs in the current rule.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param omittedMatchElements set the omittedMatchElements.
   */
  @VsoMethod
  public void setOmittedMatchElements(Integer  omittedMatchElements) {
    this.omittedMatchElements = omittedMatchElements;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Phase in which transaction matched the rule - for instance, request header phase.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return phase
   */
  @VsoMethod
  public String getPhase() {
    return phase;
  }

  /**
   * This is the setter method to the attribute.
   * Phase in which transaction matched the rule - for instance, request header phase.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param phase set the phase.
   */
  @VsoMethod
  public void setPhase(String  phase) {
    this.phase = phase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rule group for the matching rule.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ruleGroup
   */
  @VsoMethod
  public String getRuleGroup() {
    return ruleGroup;
  }

  /**
   * This is the setter method to the attribute.
   * Rule group for the matching rule.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ruleGroup set the ruleGroup.
   */
  @VsoMethod
  public void setRuleGroup(String  ruleGroup) {
    this.ruleGroup = ruleGroup;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Id of the matching rule per modsec language.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ruleId
   */
  @VsoMethod
  public Integer getRuleId() {
    return ruleId;
  }

  /**
   * This is the setter method to the attribute.
   * Id of the matching rule per modsec language.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ruleId set the ruleId.
   */
  @VsoMethod
  public void setRuleId(Integer  ruleId) {
    this.ruleId = ruleId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the rule.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ruleName
   */
  @VsoMethod
  public String getRuleName() {
    return ruleName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the rule.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ruleName set the ruleName.
   */
  @VsoMethod
  public void setRuleName(String  ruleName) {
    this.ruleName = ruleName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rule's tags per modsec language.
   * Field introduced in 17.2.1.
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
   * Rule's tags per modsec language.
   * Field introduced in 17.2.1.
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
   * Rule's tags per modsec language.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tags
   */
  @VsoMethod
  public WafRuleLog addTagsItem(String tagsItem) {
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
  WafRuleLog objWafRuleLog = (WafRuleLog) o;
  return   Objects.equals(this.phase, objWafRuleLog.phase)&&
  Objects.equals(this.ruleId, objWafRuleLog.ruleId)&&
  Objects.equals(this.ruleGroup, objWafRuleLog.ruleGroup)&&
  Objects.equals(this.msg, objWafRuleLog.msg)&&
  Objects.equals(this.matches, objWafRuleLog.matches)&&
  Objects.equals(this.tags, objWafRuleLog.tags)&&
  Objects.equals(this.ruleName, objWafRuleLog.ruleName)&&
  Objects.equals(this.omittedMatchElements, objWafRuleLog.omittedMatchElements);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafRuleLog {\n");
      sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    omittedMatchElements: ").append(toIndentedString(omittedMatchElements)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    ruleGroup: ").append(toIndentedString(ruleGroup)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
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

