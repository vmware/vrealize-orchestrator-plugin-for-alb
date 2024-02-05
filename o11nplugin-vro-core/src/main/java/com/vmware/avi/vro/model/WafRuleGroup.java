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
 * The WafRuleGroup is a POJO class extends AviRestResource that used for creating
 * WafRuleGroup.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafRuleGroup")
@VsoFinder(name = Constants.FINDER_VRO_WAFRULEGROUP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafRuleGroup extends AviRestResource {
    @JsonProperty("enable")
    @JsonInclude(Include.NON_NULL)
    private Boolean enable = true;

    @JsonProperty("exclude_list")
    @JsonInclude(Include.NON_NULL)
    private List<WafExcludeListEntry> excludeList;

    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("rules")
    @JsonInclude(Include.NON_NULL)
    private List<WafRule> rules;



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
   * Exclude list for the waf rule group.
   * The fields in the exclude list entry are logically and'ed to deduce the exclusion criteria.
   * If there are multiple excludelist entries, it will be 'logical or' of them.
   * Field introduced in 17.2.1.
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
   * Exclude list for the waf rule group.
   * The fields in the exclude list entry are logically and'ed to deduce the exclusion criteria.
   * If there are multiple excludelist entries, it will be 'logical or' of them.
   * Field introduced in 17.2.1.
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
   * Exclude list for the waf rule group.
   * The fields in the exclude list entry are logically and'ed to deduce the exclusion criteria.
   * If there are multiple excludelist entries, it will be 'logical or' of them.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return excludeList
   */
  @VsoMethod
  public WafRuleGroup addExcludeListItem(WafExcludeListEntry excludeListItem) {
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
   * Rules as per modsec language.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public List<WafRule> getRules() {
    return rules;
  }

  /**
   * This is the setter method. this will set the rules
   * Rules as per modsec language.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public void setRules(List<WafRule>  rules) {
    this.rules = rules;
  }

  /**
   * This is the setter method this will set the rules
   * Rules as per modsec language.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public WafRuleGroup addRulesItem(WafRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<WafRule>();
    }
    this.rules.add(rulesItem);
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
  WafRuleGroup objWafRuleGroup = (WafRuleGroup) o;
  return   Objects.equals(this.index, objWafRuleGroup.index)&&
  Objects.equals(this.name, objWafRuleGroup.name)&&
  Objects.equals(this.enable, objWafRuleGroup.enable)&&
  Objects.equals(this.rules, objWafRuleGroup.rules)&&
  Objects.equals(this.excludeList, objWafRuleGroup.excludeList);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafRuleGroup {\n");
      sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    excludeList: ").append(toIndentedString(excludeList)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

