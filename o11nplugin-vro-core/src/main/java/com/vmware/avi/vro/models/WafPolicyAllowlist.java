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
 * The WafPolicyAllowlist is a POJO class extends AviRestResource that used for creating
 * WafPolicyAllowlist.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafPolicyAllowlist")
@VsoFinder(name = Constants.FINDER_VRO_WAFPOLICYALLOWLIST)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafPolicyAllowlist extends AviRestResource {
    @JsonProperty("rules")
    @JsonInclude(Include.NON_NULL)
    private List<WafPolicyAllowlistRule> rules = null;



  /**
   * This is the getter method this will return the attribute value.
   * Rules to bypass waf.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public List<WafPolicyAllowlistRule> getRules() {
    return rules;
  }

  /**
   * This is the setter method. this will set the rules
   * Rules to bypass waf.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public void setRules(List<WafPolicyAllowlistRule>  rules) {
    this.rules = rules;
  }

  /**
   * This is the setter method this will set the rules
   * Rules to bypass waf.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public WafPolicyAllowlist addRulesItem(WafPolicyAllowlistRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<WafPolicyAllowlistRule>();
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
  WafPolicyAllowlist objWafPolicyAllowlist = (WafPolicyAllowlist) o;
  return   Objects.equals(this.rules, objWafPolicyAllowlist.rules);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafPolicyAllowlist {\n");
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

