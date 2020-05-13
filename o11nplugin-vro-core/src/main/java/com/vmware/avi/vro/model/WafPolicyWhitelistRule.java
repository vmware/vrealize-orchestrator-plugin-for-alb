package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.MatchTarget;
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
 * WafPolicyWhitelistRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafPolicyWhitelistRule")
@VsoFinder(name = Constants.FINDER_VRO_WAFPOLICYWHITELISTRULE, idAccessor = "getObjectID()")
@Service
public class WafPolicyWhitelistRule extends AviRestResource  {
  @JsonProperty("actions")
  @Valid
  private List<String> actions = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("enable")
  private Boolean enable = true;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("match")
  private MatchTarget match = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("sampling_percent")
  private Integer samplingPercent = 100;

  
  public WafPolicyWhitelistRule addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }
  
  /**
   * Actions to be performed upon successful matching. Enum options - WAF_POLICY_WHITELIST_ACTION_ALLOW, WAF_POLICY_WHITELIST_ACTION_DETECTION_MODE, WAF_POLICY_WHITELIST_ACTION_CONTINUE. Field introduced in 18.2.3.
   * @return actions
  **/
  @ApiModelProperty(value = "Actions to be performed upon successful matching. Enum options - WAF_POLICY_WHITELIST_ACTION_ALLOW, WAF_POLICY_WHITELIST_ACTION_DETECTION_MODE, WAF_POLICY_WHITELIST_ACTION_CONTINUE. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public List<String> getActions() {
    return actions;
  }
    
  @VsoMethod
  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  
  /**
   * Description of this rule. Field introduced in 18.2.3.
   * @return description
  **/
  @ApiModelProperty(value = "Description of this rule. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Enable or disable the rule. Field introduced in 18.2.3.
   * @return enable
  **/
  @ApiModelProperty(value = "Enable or disable the rule. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isEnable() {
    return enable;
  }
    
  @VsoMethod
  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  
  /**
   * Rules are executed in order of this index field. Field introduced in 18.2.3.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Rules are executed in order of this index field. Field introduced in 18.2.3.")
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
   * Match criteria describing requests to which this rule should be applied. Field introduced in 18.2.3.
   * @return match
  **/
  @ApiModelProperty(required = true, value = "Match criteria describing requests to which this rule should be applied. Field introduced in 18.2.3.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public MatchTarget getMatch() {
    return match;
  }
    
  @VsoMethod
  public void setMatch(MatchTarget match) {
    this.match = match;
  }

  
  /**
   * A name describing the rule in a short form. Field introduced in 18.2.3.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A name describing the rule in a short form. Field introduced in 18.2.3.")
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
   * Percentage of traffic that is sampled. Allowed values are 0-100. Field introduced in 20.1.1.
   * @return samplingPercent
  **/
  @ApiModelProperty(value = "Percentage of traffic that is sampled. Allowed values are 0-100. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getSamplingPercent() {
    return samplingPercent;
  }
    
  @VsoMethod
  public void setSamplingPercent(Integer samplingPercent) {
    this.samplingPercent = samplingPercent;
  }

  
  public String getObjectID() {
		return "WafPolicyWhitelistRule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafPolicyWhitelistRule wafPolicyWhitelistRule = (WafPolicyWhitelistRule) o;
    return Objects.equals(this.actions, wafPolicyWhitelistRule.actions) &&
        Objects.equals(this.description, wafPolicyWhitelistRule.description) &&
        Objects.equals(this.enable, wafPolicyWhitelistRule.enable) &&
        Objects.equals(this.index, wafPolicyWhitelistRule.index) &&
        Objects.equals(this.match, wafPolicyWhitelistRule.match) &&
        Objects.equals(this.name, wafPolicyWhitelistRule.name) &&
        Objects.equals(this.samplingPercent, wafPolicyWhitelistRule.samplingPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, description, enable, index, match, name, samplingPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafPolicyWhitelistRule {\n");
    
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

