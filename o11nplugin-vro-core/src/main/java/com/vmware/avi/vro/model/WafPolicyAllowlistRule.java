package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.MatchTarget;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The WafPolicyAllowlistRule is a POJO class extends AviRestResource that used for creating
 * WafPolicyAllowlistRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafPolicyAllowlistRule")
@VsoFinder(name = Constants.FINDER_VRO_WAFPOLICYALLOWLISTRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafPolicyAllowlistRule extends AviRestResource {
    @JsonProperty("actions")
    @JsonInclude(Include.NON_NULL)
    private List<String> actions;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("enable")
    @JsonInclude(Include.NON_NULL)
    private Boolean enable = true;

    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index;

    @JsonProperty("match")
    @JsonInclude(Include.NON_NULL)
    private MatchTarget match;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("sampling_percent")
    @JsonInclude(Include.NON_NULL)
    private Integer samplingPercent = 100;



  /**
   * This is the getter method this will return the attribute value.
   * Actions to be performed upon successful matching.
   * Enum options - WAF_POLICY_ALLOWLIST_ACTION_BYPASS, WAF_POLICY_ALLOWLIST_ACTION_DETECTION_MODE, WAF_POLICY_ALLOWLIST_ACTION_CONTINUE.
   * Field introduced in 20.1.3.
   * Minimum of 1 items required.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actions
   */
  @VsoMethod
  public List<String> getActions() {
    return actions;
  }

  /**
   * This is the setter method. this will set the actions
   * Actions to be performed upon successful matching.
   * Enum options - WAF_POLICY_ALLOWLIST_ACTION_BYPASS, WAF_POLICY_ALLOWLIST_ACTION_DETECTION_MODE, WAF_POLICY_ALLOWLIST_ACTION_CONTINUE.
   * Field introduced in 20.1.3.
   * Minimum of 1 items required.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actions
   */
  @VsoMethod
  public void setActions(List<String>  actions) {
    this.actions = actions;
  }

  /**
   * This is the setter method this will set the actions
   * Actions to be performed upon successful matching.
   * Enum options - WAF_POLICY_ALLOWLIST_ACTION_BYPASS, WAF_POLICY_ALLOWLIST_ACTION_DETECTION_MODE, WAF_POLICY_ALLOWLIST_ACTION_CONTINUE.
   * Field introduced in 20.1.3.
   * Minimum of 1 items required.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actions
   */
  @VsoMethod
  public WafPolicyAllowlistRule addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Description of this rule.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Description of this rule.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable or deactivate the rule.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enable
   */
  @VsoMethod
  public Boolean getEnable() {
    return enable;
  }

  /**
   * This is the setter method to the attribute.
   * Enable or deactivate the rule.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enable set the enable.
   */
  @VsoMethod
  public void setEnable(Boolean  enable) {
    this.enable = enable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rules are processed in order of this index field.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Rules are processed in order of this index field.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Match criteria describing requests to which this rule should be applied.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return match
   */
  @VsoMethod
  public MatchTarget getMatch() {
    return match;
  }

  /**
   * This is the setter method to the attribute.
   * Match criteria describing requests to which this rule should be applied.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param match set the match.
   */
  @VsoMethod
  public void setMatch(MatchTarget match) {
    this.match = match;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A name describing the rule in a short form.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * A name describing the rule in a short form.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Percentage of traffic that is sampled.
   * Allowed values are 0-100.
   * Field introduced in 20.1.3.
   * Unit is percent.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return samplingPercent
   */
  @VsoMethod
  public Integer getSamplingPercent() {
    return samplingPercent;
  }

  /**
   * This is the setter method to the attribute.
   * Percentage of traffic that is sampled.
   * Allowed values are 0-100.
   * Field introduced in 20.1.3.
   * Unit is percent.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param samplingPercent set the samplingPercent.
   */
  @VsoMethod
  public void setSamplingPercent(Integer  samplingPercent) {
    this.samplingPercent = samplingPercent;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  WafPolicyAllowlistRule objWafPolicyAllowlistRule = (WafPolicyAllowlistRule) o;
  return   Objects.equals(this.index, objWafPolicyAllowlistRule.index)&&
  Objects.equals(this.name, objWafPolicyAllowlistRule.name)&&
  Objects.equals(this.enable, objWafPolicyAllowlistRule.enable)&&
  Objects.equals(this.match, objWafPolicyAllowlistRule.match)&&
  Objects.equals(this.actions, objWafPolicyAllowlistRule.actions)&&
  Objects.equals(this.description, objWafPolicyAllowlistRule.description)&&
  Objects.equals(this.samplingPercent, objWafPolicyAllowlistRule.samplingPercent);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafPolicyAllowlistRule {\n");
      sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    match: ").append(toIndentedString(match)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    samplingPercent: ").append(toIndentedString(samplingPercent)).append("\n");
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

