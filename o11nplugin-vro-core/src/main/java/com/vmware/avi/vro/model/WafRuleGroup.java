package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.WafExcludeListEntry;
import com.vmware.avi.vro.model.WafRule;
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
 * WafRuleGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafRuleGroup")
@VsoFinder(name = Constants.FINDER_VRO_WAFRULEGROUP, idAccessor = "getObjectID()")
@Service
public class WafRuleGroup extends AviRestResource  {
  @JsonProperty("enable")
  private Boolean enable = true;

  @JsonProperty("exclude_list")
  @Valid
  private List<WafExcludeListEntry> excludeList = null;

  @JsonProperty("force_detection")
  private Boolean forceDetection = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rules")
  @Valid
  private List<WafRule> rules = null;

  
  /**
   * Enable or disable WAF Rule Group. Field introduced in 17.2.1.
   * @return enable
  **/
  @ApiModelProperty(required = true, value = "Enable or disable WAF Rule Group. Field introduced in 17.2.1.")
  @NotNull


 
  @VsoMethod  
  public Boolean isEnable() {
    return enable;
  }
    
  @VsoMethod
  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  
  public WafRuleGroup addExcludeListItem(WafExcludeListEntry excludeListItem) {
    if (this.excludeList == null) {
      this.excludeList = new ArrayList<WafExcludeListEntry>();
    }
    this.excludeList.add(excludeListItem);
    return this;
  }
  
  /**
   * Exclude list for the WAF rule group. The fields in the exclude list entry are logically and'ed to deduce the exclusion criteria. If there are multiple excludelist entries, it will be 'logical or' of them. Field introduced in 17.2.1.
   * @return excludeList
  **/
  @ApiModelProperty(value = "Exclude list for the WAF rule group. The fields in the exclude list entry are logically and'ed to deduce the exclusion criteria. If there are multiple excludelist entries, it will be 'logical or' of them. Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public List<WafExcludeListEntry> getExcludeList() {
    return excludeList;
  }
    
  @VsoMethod
  public void setExcludeList(List<WafExcludeListEntry> excludeList) {
    this.excludeList = excludeList;
  }

  
  /**
   * When set to 'true', any rule in this group will not cause 'deny' or 'redirect' actions to run, even if WAF Policy is set to enforcement mode. The behavior would be as if this rule operated in detection mode regardless of WAF Policy setting. Field deprecated in 18.1.5. Field introduced in 18.1.4.
   * @return forceDetection
  **/
  @ApiModelProperty(value = "When set to 'true', any rule in this group will not cause 'deny' or 'redirect' actions to run, even if WAF Policy is set to enforcement mode. The behavior would be as if this rule operated in detection mode regardless of WAF Policy setting. Field deprecated in 18.1.5. Field introduced in 18.1.4.")


 
  @VsoMethod  
  public Boolean isForceDetection() {
    return forceDetection;
  }
    
  @VsoMethod
  public void setForceDetection(Boolean forceDetection) {
    this.forceDetection = forceDetection;
  }

  
  /**
   *  Field introduced in 17.2.1.
   * @return index
  **/
  @ApiModelProperty(required = true, value = " Field introduced in 17.2.1.")
  @NotNull


 
  @VsoMethod  
  public Integer getIndex() {
    return index;
  }
    
  @VsoMethod
  public void setIndex(Integer index) {
    this.index = index;
  }

  
  /**
   *  Field introduced in 17.2.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = " Field introduced in 17.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public WafRuleGroup addRulesItem(WafRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<WafRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }
  
  /**
   * Rules as per Modsec language. Field introduced in 17.2.1.
   * @return rules
  **/
  @ApiModelProperty(value = "Rules as per Modsec language. Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public List<WafRule> getRules() {
    return rules;
  }
    
  @VsoMethod
  public void setRules(List<WafRule> rules) {
    this.rules = rules;
  }

  
  public String getObjectID() {
		return "WafRuleGroup";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafRuleGroup wafRuleGroup = (WafRuleGroup) o;
    return Objects.equals(this.enable, wafRuleGroup.enable) &&
        Objects.equals(this.excludeList, wafRuleGroup.excludeList) &&
        Objects.equals(this.forceDetection, wafRuleGroup.forceDetection) &&
        Objects.equals(this.index, wafRuleGroup.index) &&
        Objects.equals(this.name, wafRuleGroup.name) &&
        Objects.equals(this.rules, wafRuleGroup.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, excludeList, forceDetection, index, name, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafRuleGroup {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    excludeList: ").append(toIndentedString(excludeList)).append("\n");
    sb.append("    forceDetection: ").append(toIndentedString(forceDetection)).append("\n");
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

