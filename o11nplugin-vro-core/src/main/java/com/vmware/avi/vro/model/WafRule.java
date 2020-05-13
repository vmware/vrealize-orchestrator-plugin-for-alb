package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.WafExcludeListEntry;
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
 * WafRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafRule")
@VsoFinder(name = Constants.FINDER_VRO_WAFRULE, idAccessor = "getObjectID()")
@Service
public class WafRule extends AviRestResource  {
  @JsonProperty("enable")
  private Boolean enable = true;

  @JsonProperty("exclude_list")
  @Valid
  private List<WafExcludeListEntry> excludeList = null;

  @JsonProperty("force_detection")
  private Boolean forceDetection = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("is_sensitive")
  private Boolean isSensitive = null;

  @JsonProperty("mode")
  private String mode = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phase")
  private String phase = null;

  @JsonProperty("rule")
  private String rule = null;

  @JsonProperty("rule_id")
  private String ruleId = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  
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

  
  public WafRule addExcludeListItem(WafExcludeListEntry excludeListItem) {
    if (this.excludeList == null) {
      this.excludeList = new ArrayList<WafExcludeListEntry>();
    }
    this.excludeList.add(excludeListItem);
    return this;
  }
  
  /**
   * Exclude list for the WAF rule. The fields in the exclude list entry are logically and'ed to deduce the exclusion criteria. If there are multiple excludelist entries, it will be 'logical or' of them. Field introduced in 17.2.3.
   * @return excludeList
  **/
  @ApiModelProperty(value = "Exclude list for the WAF rule. The fields in the exclude list entry are logically and'ed to deduce the exclusion criteria. If there are multiple excludelist entries, it will be 'logical or' of them. Field introduced in 17.2.3.")

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
   * When set to 'true', this rule will not cause 'deny' or 'redirect' actions to run, even if WAF Policy is set to enforcement mode. The behavior would be as if this rule operated in detection mode regardless of WAF Policy setting. Field deprecated in 18.1.5. Field introduced in 18.1.4.
   * @return forceDetection
  **/
  @ApiModelProperty(value = "When set to 'true', this rule will not cause 'deny' or 'redirect' actions to run, even if WAF Policy is set to enforcement mode. The behavior would be as if this rule operated in detection mode regardless of WAF Policy setting. Field deprecated in 18.1.5. Field introduced in 18.1.4.")


 
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
   * The rule field is sensitive and will not be displayed. Field introduced in 20.1.1.
   * @return isSensitive
  **/
  @ApiModelProperty(value = "The rule field is sensitive and will not be displayed. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isIsSensitive() {
    return isSensitive;
  }
    
  @VsoMethod
  public void setIsSensitive(Boolean isSensitive) {
    this.isSensitive = isSensitive;
  }

  
  /**
   * WAF Rule mode. This can be detection or enforcement. If this is not set, the Policy mode is used. This only takes effect if the policy allows delegation. Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT. Field introduced in 18.1.5, 18.2.1.
   * @return mode
  **/
  @ApiModelProperty(value = "WAF Rule mode. This can be detection or enforcement. If this is not set, the Policy mode is used. This only takes effect if the policy allows delegation. Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT. Field introduced in 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public String getMode() {
    return mode;
  }
    
  @VsoMethod
  public void setMode(String mode) {
    this.mode = mode;
  }

  
  /**
   * User-friendly optional name for a rule. Field introduced in 17.2.1.
   * @return name
  **/
  @ApiModelProperty(value = "User-friendly optional name for a rule. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The execution phase where this rule will be executed. Enum options - WAF_PHASE_CONNECTION, WAF_PHASE_REQUEST_HEADER, WAF_PHASE_REQUEST_BODY, WAF_PHASE_RESPONSE_HEADER, WAF_PHASE_RESPONSE_BODY, WAF_PHASE_LOGGING. Field introduced in 20.1.1.
   * @return phase
  **/
  @ApiModelProperty(readOnly = true, value = "The execution phase where this rule will be executed. Enum options - WAF_PHASE_CONNECTION, WAF_PHASE_REQUEST_HEADER, WAF_PHASE_REQUEST_BODY, WAF_PHASE_RESPONSE_HEADER, WAF_PHASE_RESPONSE_BODY, WAF_PHASE_LOGGING. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getPhase() {
    return phase;
  }
    
  @VsoMethod
  public void setPhase(String phase) {
    this.phase = phase;
  }

  
  /**
   * Rule as per Modsec language. Field introduced in 17.2.1.
   * @return rule
  **/
  @ApiModelProperty(required = true, value = "Rule as per Modsec language. Field introduced in 17.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getRule() {
    return rule;
  }
    
  @VsoMethod
  public void setRule(String rule) {
    this.rule = rule;
  }

  
  /**
   * Identifier (id) for a rule per Modsec language. All SecRule and SecAction directives require an id. It is extracted from the id action in a ModSec rule. Rules within a single WAF Policy are required to have unique rule_ids. Field introduced in 17.2.2.
   * @return ruleId
  **/
  @ApiModelProperty(value = "Identifier (id) for a rule per Modsec language. All SecRule and SecAction directives require an id. It is extracted from the id action in a ModSec rule. Rules within a single WAF Policy are required to have unique rule_ids. Field introduced in 17.2.2.")


 
  @VsoMethod  
  public String getRuleId() {
    return ruleId;
  }
    
  @VsoMethod
  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  
  public WafRule addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }
  
  /**
   * Tags for WAF rule as per Modsec language. They are extracted from the tag action in a ModSec rule. Field introduced in 18.1.3.
   * @return tags
  **/
  @ApiModelProperty(value = "Tags for WAF rule as per Modsec language. They are extracted from the tag action in a ModSec rule. Field introduced in 18.1.3.")


 
  @VsoMethod  
  public List<String> getTags() {
    return tags;
  }
    
  @VsoMethod
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  public String getObjectID() {
		return "WafRule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafRule wafRule = (WafRule) o;
    return Objects.equals(this.enable, wafRule.enable) &&
        Objects.equals(this.excludeList, wafRule.excludeList) &&
        Objects.equals(this.forceDetection, wafRule.forceDetection) &&
        Objects.equals(this.index, wafRule.index) &&
        Objects.equals(this.isSensitive, wafRule.isSensitive) &&
        Objects.equals(this.mode, wafRule.mode) &&
        Objects.equals(this.name, wafRule.name) &&
        Objects.equals(this.phase, wafRule.phase) &&
        Objects.equals(this.rule, wafRule.rule) &&
        Objects.equals(this.ruleId, wafRule.ruleId) &&
        Objects.equals(this.tags, wafRule.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, excludeList, forceDetection, index, isSensitive, mode, name, phase, rule, ruleId, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafRule {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    excludeList: ").append(toIndentedString(excludeList)).append("\n");
    sb.append("    forceDetection: ").append(toIndentedString(forceDetection)).append("\n");
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

