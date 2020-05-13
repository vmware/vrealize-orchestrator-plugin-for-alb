package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * WafApplicationSignatures
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafApplicationSignatures")
@VsoFinder(name = Constants.FINDER_VRO_WAFAPPLICATIONSIGNATURES, idAccessor = "getObjectID()")
@Service
public class WafApplicationSignatures extends AviRestResource  {
  @JsonProperty("provider_ref")
  private String providerRef = null;

  @JsonProperty("rules")
  @Valid
  private List<WafRule> rules = null;

  @JsonProperty("ruleset_version")
  private String rulesetVersion = null;

  @JsonProperty("selected_applications")
  @Valid
  private List<String> selectedApplications = null;

  
  /**
   * The external provide for the rules. It is a reference to an object of type WafApplicationSignatureProvider. Field introduced in 20.1.1.
   * @return providerRef
  **/
  @ApiModelProperty(required = true, value = "The external provide for the rules. It is a reference to an object of type WafApplicationSignatureProvider. Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getProviderRef() {
    return providerRef;
  }
    
  @VsoMethod
  public void setProviderRef(String providerRef) {
    this.providerRef = providerRef;
  }

  
  public WafApplicationSignatures addRulesItem(WafRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<WafRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }
  
  /**
   * The active application specific rules. You can change attributes like enabled, waf mode and exclusions, but not the rules itself. To change the rules, you can change the tags or the rule provider. Field introduced in 20.1.1.
   * @return rules
  **/
  @ApiModelProperty(value = "The active application specific rules. You can change attributes like enabled, waf mode and exclusions, but not the rules itself. To change the rules, you can change the tags or the rule provider. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public List<WafRule> getRules() {
    return rules;
  }
    
  @VsoMethod
  public void setRules(List<WafRule> rules) {
    this.rules = rules;
  }

  
  /**
   * The version in use of the provided ruleset. Field introduced in 20.1.1.
   * @return rulesetVersion
  **/
  @ApiModelProperty(readOnly = true, value = "The version in use of the provided ruleset. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getRulesetVersion() {
    return rulesetVersion;
  }
    
  @VsoMethod
  public void setRulesetVersion(String rulesetVersion) {
    this.rulesetVersion = rulesetVersion;
  }

  
  public WafApplicationSignatures addSelectedApplicationsItem(String selectedApplicationsItem) {
    if (this.selectedApplications == null) {
      this.selectedApplications = new ArrayList<String>();
    }
    this.selectedApplications.add(selectedApplicationsItem);
    return this;
  }
  
  /**
   * List of applications for which we use the rules from the WafApplicationSignatureProvider. Field introduced in 20.1.1.
   * @return selectedApplications
  **/
  @ApiModelProperty(value = "List of applications for which we use the rules from the WafApplicationSignatureProvider. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public List<String> getSelectedApplications() {
    return selectedApplications;
  }
    
  @VsoMethod
  public void setSelectedApplications(List<String> selectedApplications) {
    this.selectedApplications = selectedApplications;
  }

  
  public String getObjectID() {
		return "WafApplicationSignatures";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafApplicationSignatures wafApplicationSignatures = (WafApplicationSignatures) o;
    return Objects.equals(this.providerRef, wafApplicationSignatures.providerRef) &&
        Objects.equals(this.rules, wafApplicationSignatures.rules) &&
        Objects.equals(this.rulesetVersion, wafApplicationSignatures.rulesetVersion) &&
        Objects.equals(this.selectedApplications, wafApplicationSignatures.selectedApplications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerRef, rules, rulesetVersion, selectedApplications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafApplicationSignatures {\n");
    
    sb.append("    providerRef: ").append(toIndentedString(providerRef)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    rulesetVersion: ").append(toIndentedString(rulesetVersion)).append("\n");
    sb.append("    selectedApplications: ").append(toIndentedString(selectedApplications)).append("\n");
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

