package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.WafPSMMatchElement;
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
 * WafPSMRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafPSMRule")
@VsoFinder(name = Constants.FINDER_VRO_WAFPSMRULE, idAccessor = "getObjectID()")
@Service
public class WafPSMRule extends AviRestResource  {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("enable")
  private Boolean enable = true;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("match_case")
  private String matchCase = "INSENSITIVE";

  @JsonProperty("match_elements")
  @Valid
  private List<WafPSMMatchElement> matchElements = null;

  @JsonProperty("match_value_max_length")
  private Integer matchValueMaxLength = null;

  @JsonProperty("match_value_pattern")
  private String matchValuePattern = null;

  @JsonProperty("mode")
  private String mode = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("paranoia_level")
  private String paranoiaLevel = "WAF_PARANOIA_LEVEL_LOW";

  @JsonProperty("rule_id")
  private String ruleId = null;

  
  /**
   * Free-text comment about this rule. Field introduced in 18.2.3.
   * @return description
  **/
  @ApiModelProperty(value = "Free-text comment about this rule. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Enable or disable this rule. Field introduced in 18.2.3.
   * @return enable
  **/
  @ApiModelProperty(value = "Enable or disable this rule. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isEnable() {
    return enable;
  }
    
  @VsoMethod
  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  
  /**
   * Rule index, this is used to determine the order of the rules. Field introduced in 18.2.3.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Rule index, this is used to determine the order of the rules. Field introduced in 18.2.3.")
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
   * The field match_value_pattern regular expression is case sensitive. Enum options - SENSITIVE, INSENSITIVE. Field introduced in 18.2.3.
   * @return matchCase
  **/
  @ApiModelProperty(value = "The field match_value_pattern regular expression is case sensitive. Enum options - SENSITIVE, INSENSITIVE. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getMatchCase() {
    return matchCase;
  }
    
  @VsoMethod
  public void setMatchCase(String matchCase) {
    this.matchCase = matchCase;
  }

  
  public WafPSMRule addMatchElementsItem(WafPSMMatchElement matchElementsItem) {
    if (this.matchElements == null) {
      this.matchElements = new ArrayList<WafPSMMatchElement>();
    }
    this.matchElements.add(matchElementsItem);
    return this;
  }
  
  /**
   * The match elements, for example ARGS id or ARGS|!ARGS password. Field introduced in 18.2.3.
   * @return matchElements
  **/
  @ApiModelProperty(value = "The match elements, for example ARGS id or ARGS|!ARGS password. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public List<WafPSMMatchElement> getMatchElements() {
    return matchElements;
  }
    
  @VsoMethod
  public void setMatchElements(List<WafPSMMatchElement> matchElements) {
    this.matchElements = matchElements;
  }

  
  /**
   * The maximum allowed length of the match_value. If this is not set, the length will not be checked. Field introduced in 18.2.3.
   * @return matchValueMaxLength
  **/
  @ApiModelProperty(value = "The maximum allowed length of the match_value. If this is not set, the length will not be checked. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getMatchValueMaxLength() {
    return matchValueMaxLength;
  }
    
  @VsoMethod
  public void setMatchValueMaxLength(Integer matchValueMaxLength) {
    this.matchValueMaxLength = matchValueMaxLength;
  }

  
  /**
   * A regular expression which describes the expected value. Field introduced in 18.2.3.
   * @return matchValuePattern
  **/
  @ApiModelProperty(required = true, value = "A regular expression which describes the expected value. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getMatchValuePattern() {
    return matchValuePattern;
  }
    
  @VsoMethod
  public void setMatchValuePattern(String matchValuePattern) {
    this.matchValuePattern = matchValuePattern;
  }

  
  /**
   * WAF Rule mode. This can be detection or enforcement. If this is not set, the Policy mode is used. This only takes effect if the policy allows delegation. Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT. Field introduced in 18.2.3.
   * @return mode
  **/
  @ApiModelProperty(value = "WAF Rule mode. This can be detection or enforcement. If this is not set, the Policy mode is used. This only takes effect if the policy allows delegation. Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getMode() {
    return mode;
  }
    
  @VsoMethod
  public void setMode(String mode) {
    this.mode = mode;
  }

  
  /**
   * Name of the rule. Field introduced in 18.2.3.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the rule. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * WAF Ruleset paranoia mode. This is used to select Rules based on the paranoia-level. Enum options - WAF_PARANOIA_LEVEL_LOW, WAF_PARANOIA_LEVEL_MEDIUM, WAF_PARANOIA_LEVEL_HIGH, WAF_PARANOIA_LEVEL_EXTREME. Field introduced in 18.2.3.
   * @return paranoiaLevel
  **/
  @ApiModelProperty(value = "WAF Ruleset paranoia mode. This is used to select Rules based on the paranoia-level. Enum options - WAF_PARANOIA_LEVEL_LOW, WAF_PARANOIA_LEVEL_MEDIUM, WAF_PARANOIA_LEVEL_HIGH, WAF_PARANOIA_LEVEL_EXTREME. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getParanoiaLevel() {
    return paranoiaLevel;
  }
    
  @VsoMethod
  public void setParanoiaLevel(String paranoiaLevel) {
    this.paranoiaLevel = paranoiaLevel;
  }

  
  /**
   * Id field which is used for log and metric generation. This id must be unique for all rules in this group. Field introduced in 18.2.3.
   * @return ruleId
  **/
  @ApiModelProperty(required = true, value = "Id field which is used for log and metric generation. This id must be unique for all rules in this group. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getRuleId() {
    return ruleId;
  }
    
  @VsoMethod
  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  
  public String getObjectID() {
		return "WafPSMRule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafPSMRule wafPSMRule = (WafPSMRule) o;
    return Objects.equals(this.description, wafPSMRule.description) &&
        Objects.equals(this.enable, wafPSMRule.enable) &&
        Objects.equals(this.index, wafPSMRule.index) &&
        Objects.equals(this.matchCase, wafPSMRule.matchCase) &&
        Objects.equals(this.matchElements, wafPSMRule.matchElements) &&
        Objects.equals(this.matchValueMaxLength, wafPSMRule.matchValueMaxLength) &&
        Objects.equals(this.matchValuePattern, wafPSMRule.matchValuePattern) &&
        Objects.equals(this.mode, wafPSMRule.mode) &&
        Objects.equals(this.name, wafPSMRule.name) &&
        Objects.equals(this.paranoiaLevel, wafPSMRule.paranoiaLevel) &&
        Objects.equals(this.ruleId, wafPSMRule.ruleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enable, index, matchCase, matchElements, matchValueMaxLength, matchValuePattern, mode, name, paranoiaLevel, ruleId);
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

