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
 * The WafRuleGroupOverrides is a POJO class extends AviRestResource that used for creating
 * WafRuleGroupOverrides.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafRuleGroupOverrides")
@VsoFinder(name = Constants.FINDER_VRO_WAFRULEGROUPOVERRIDES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafRuleGroupOverrides extends AviRestResource {
    @JsonProperty("enable")
    @JsonInclude(Include.NON_NULL)
    private Boolean enable = null;

    @JsonProperty("exclude_list")
    @JsonInclude(Include.NON_NULL)
    private List<WafExcludeListEntry> excludeList = null;

    @JsonProperty("mode")
    @JsonInclude(Include.NON_NULL)
    private String mode = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("rule_overrides")
    @JsonInclude(Include.NON_NULL)
    private List<WafRuleOverrides> ruleOverrides = null;



  /**
   * This is the getter method this will return the attribute value.
   * Override the enable flag for this group.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enable
   */
  @VsoMethod
  public Boolean getEnable() {
    return enable;
  }

  /**
   * This is the setter method to the attribute.
   * Override the enable flag for this group.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param enable set the enable.
   */
  @VsoMethod
  public void setEnable(Boolean  enable) {
    this.enable = enable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Replace the exclude list for this group.
   * Field introduced in 20.1.6.
   * Maximum of 64 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return excludeList
   */
  @VsoMethod
  public List<WafExcludeListEntry> getExcludeList() {
    return excludeList;
  }

  /**
   * This is the setter method. this will set the excludeList
   * Replace the exclude list for this group.
   * Field introduced in 20.1.6.
   * Maximum of 64 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return excludeList
   */
  @VsoMethod
  public void setExcludeList(List<WafExcludeListEntry>  excludeList) {
    this.excludeList = excludeList;
  }

  /**
   * This is the setter method this will set the excludeList
   * Replace the exclude list for this group.
   * Field introduced in 20.1.6.
   * Maximum of 64 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return excludeList
   */
  @VsoMethod
  public WafRuleGroupOverrides addExcludeListItem(WafExcludeListEntry excludeListItem) {
    if (this.excludeList == null) {
      this.excludeList = new ArrayList<WafExcludeListEntry>();
    }
    this.excludeList.add(excludeListItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Override the waf mode for this group.
   * Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mode
   */
  @VsoMethod
  public String getMode() {
    return mode;
  }

  /**
   * This is the setter method to the attribute.
   * Override the waf mode for this group.
   * Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mode set the mode.
   */
  @VsoMethod
  public void setMode(String  mode) {
    this.mode = mode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of the group where attributes or rules are overridden.
   * Field introduced in 20.1.6.
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
   * The name of the group where attributes or rules are overridden.
   * Field introduced in 20.1.6.
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
   * Rule specific overrides.
   * Field introduced in 20.1.6.
   * Maximum of 1024 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ruleOverrides
   */
  @VsoMethod
  public List<WafRuleOverrides> getRuleOverrides() {
    return ruleOverrides;
  }

  /**
   * This is the setter method. this will set the ruleOverrides
   * Rule specific overrides.
   * Field introduced in 20.1.6.
   * Maximum of 1024 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ruleOverrides
   */
  @VsoMethod
  public void setRuleOverrides(List<WafRuleOverrides>  ruleOverrides) {
    this.ruleOverrides = ruleOverrides;
  }

  /**
   * This is the setter method this will set the ruleOverrides
   * Rule specific overrides.
   * Field introduced in 20.1.6.
   * Maximum of 1024 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ruleOverrides
   */
  @VsoMethod
  public WafRuleGroupOverrides addRuleOverridesItem(WafRuleOverrides ruleOverridesItem) {
    if (this.ruleOverrides == null) {
      this.ruleOverrides = new ArrayList<WafRuleOverrides>();
    }
    this.ruleOverrides.add(ruleOverridesItem);
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
  WafRuleGroupOverrides objWafRuleGroupOverrides = (WafRuleGroupOverrides) o;
  return   Objects.equals(this.name, objWafRuleGroupOverrides.name)&&
  Objects.equals(this.enable, objWafRuleGroupOverrides.enable)&&
  Objects.equals(this.mode, objWafRuleGroupOverrides.mode)&&
  Objects.equals(this.excludeList, objWafRuleGroupOverrides.excludeList)&&
  Objects.equals(this.ruleOverrides, objWafRuleGroupOverrides.ruleOverrides);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafRuleGroupOverrides {\n");
      sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    excludeList: ").append(toIndentedString(excludeList)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ruleOverrides: ").append(toIndentedString(ruleOverrides)).append("\n");
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

