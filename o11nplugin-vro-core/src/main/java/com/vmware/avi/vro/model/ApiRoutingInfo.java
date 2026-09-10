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
 * The ApiRoutingInfo is a POJO class extends AviRestResource that used for creating
 * ApiRoutingInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApiRoutingInfo")
@VsoFinder(name = Constants.FINDER_VRO_APIROUTINGINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApiRoutingInfo extends AviRestResource {
    @JsonProperty("rules")
    @JsonInclude(Include.NON_NULL)
    private List<ApiRoutingRule> rules;



  /**
   * This is the getter method this will return the attribute value.
   * Header-based routing rules for api policy selection.
   * Rules are ored  a request matches if any rule matches.
   * Header conditions within a rule are anded  all must match.
   * Example  a rule named 'v1-route' with an hdr_equals match on x-api-version='v1' matches only requests carrying that header.
   * Field introduced in 32.1.4.
   * Maximum of 32 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public List<ApiRoutingRule> getRules() {
    return rules;
  }

  /**
   * This is the setter method. this will set the rules
   * Header-based routing rules for api policy selection.
   * Rules are ored  a request matches if any rule matches.
   * Header conditions within a rule are anded  all must match.
   * Example  a rule named 'v1-route' with an hdr_equals match on x-api-version='v1' matches only requests carrying that header.
   * Field introduced in 32.1.4.
   * Maximum of 32 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public void setRules(List<ApiRoutingRule>  rules) {
    this.rules = rules;
  }

  /**
   * This is the setter method this will set the rules
   * Header-based routing rules for api policy selection.
   * Rules are ored  a request matches if any rule matches.
   * Header conditions within a rule are anded  all must match.
   * Example  a rule named 'v1-route' with an hdr_equals match on x-api-version='v1' matches only requests carrying that header.
   * Field introduced in 32.1.4.
   * Maximum of 32 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public ApiRoutingInfo addRulesItem(ApiRoutingRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<ApiRoutingRule>();
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
  ApiRoutingInfo objApiRoutingInfo = (ApiRoutingInfo) o;
  return   Objects.equals(this.rules, objApiRoutingInfo.rules);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApiRoutingInfo {\n");
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

