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
 * The WafApplicationSignatures is a POJO class extends AviRestResource that used for creating
 * WafApplicationSignatures.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafApplicationSignatures")
@VsoFinder(name = Constants.FINDER_VRO_WAFAPPLICATIONSIGNATURES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafApplicationSignatures extends AviRestResource {
  @JsonProperty("provider_ref")
  @JsonInclude(Include.NON_NULL)
  private String providerRef = null;

  @JsonProperty("rules")
  @JsonInclude(Include.NON_NULL)
  private List<WafRule> rules = null;

  @JsonProperty("ruleset_version")
  @JsonInclude(Include.NON_NULL)
  private String rulesetVersion = null;

  @JsonProperty("selected_applications")
  @JsonInclude(Include.NON_NULL)
  private List<String> selectedApplications = null;



  /**
   * This is the getter method this will return the attribute value.
   * The external provide for the rules.
   * It is a reference to an object of type wafapplicationsignatureprovider.
   * Field introduced in 20.1.1.
   * @return providerRef
   */
  @VsoMethod
  public String getProviderRef() {
    return providerRef;
  }

  /**
   * This is the setter method to the attribute.
   * The external provide for the rules.
   * It is a reference to an object of type wafapplicationsignatureprovider.
   * Field introduced in 20.1.1.
   * @param providerRef set the providerRef.
   */
  @VsoMethod
  public void setProviderRef(String  providerRef) {
    this.providerRef = providerRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The active application specific rules.
   * You can change attributes like enabled, waf mode and exclusions, but not the rules itself.
   * To change the rules, you can change the tags or the rule provider.
   * Field introduced in 20.1.1.
   * @return rules
   */
  @VsoMethod
  public List<WafRule> getRules() {
    return rules;
  }

  /**
   * This is the setter method. this will set the rules
   * The active application specific rules.
   * You can change attributes like enabled, waf mode and exclusions, but not the rules itself.
   * To change the rules, you can change the tags or the rule provider.
   * Field introduced in 20.1.1.
   * @return rules
   */
  @VsoMethod
  public void setRules(List<WafRule>  rules) {
    this.rules = rules;
  }

  /**
   * This is the setter method this will set the rules
   * The active application specific rules.
   * You can change attributes like enabled, waf mode and exclusions, but not the rules itself.
   * To change the rules, you can change the tags or the rule provider.
   * Field introduced in 20.1.1.
   * @return rules
   */
  @VsoMethod
  public WafApplicationSignatures addRulesItem(WafRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<WafRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The version in use of the provided ruleset.
   * Field introduced in 20.1.1.
   * @return rulesetVersion
   */
  @VsoMethod
  public String getRulesetVersion() {
    return rulesetVersion;
  }

  /**
   * This is the setter method to the attribute.
   * The version in use of the provided ruleset.
   * Field introduced in 20.1.1.
   * @param rulesetVersion set the rulesetVersion.
   */
  @VsoMethod
  public void setRulesetVersion(String  rulesetVersion) {
    this.rulesetVersion = rulesetVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of applications for which we use the rules from the wafapplicationsignatureprovider.
   * Field introduced in 20.1.1.
   * @return selectedApplications
   */
  @VsoMethod
  public List<String> getSelectedApplications() {
    return selectedApplications;
  }

  /**
   * This is the setter method. this will set the selectedApplications
   * List of applications for which we use the rules from the wafapplicationsignatureprovider.
   * Field introduced in 20.1.1.
   * @return selectedApplications
   */
  @VsoMethod
  public void setSelectedApplications(List<String>  selectedApplications) {
    this.selectedApplications = selectedApplications;
  }

  /**
   * This is the setter method this will set the selectedApplications
   * List of applications for which we use the rules from the wafapplicationsignatureprovider.
   * Field introduced in 20.1.1.
   * @return selectedApplications
   */
  @VsoMethod
  public WafApplicationSignatures addSelectedApplicationsItem(String selectedApplicationsItem) {
    if (this.selectedApplications == null) {
      this.selectedApplications = new ArrayList<String>();
    }
    this.selectedApplications.add(selectedApplicationsItem);
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
  WafApplicationSignatures objWafApplicationSignatures = (WafApplicationSignatures) o;
  return   Objects.equals(this.rulesetVersion, objWafApplicationSignatures.rulesetVersion)&&
  Objects.equals(this.rules, objWafApplicationSignatures.rules)&&
  Objects.equals(this.selectedApplications, objWafApplicationSignatures.selectedApplications)&&
  Objects.equals(this.providerRef, objWafApplicationSignatures.providerRef);
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
