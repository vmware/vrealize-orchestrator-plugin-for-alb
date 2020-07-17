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
 * The HTTPResponsePolicy is a POJO class extends AviRestResource that used for creating
 * HTTPResponsePolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPResponsePolicy")
@VsoFinder(name = Constants.FINDER_VRO_HTTPRESPONSEPOLICY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPResponsePolicy extends AviRestResource {
  @JsonProperty("rules")
  @JsonInclude(Include.NON_NULL)
  private List<HTTPResponseRule> rules = null;



  /**
   * This is the getter method this will return the attribute value.
   * Add rules to the http response policy.
   * @return rules
   */
  @VsoMethod
  public List<HTTPResponseRule> getRules() {
    return rules;
  }

  /**
   * This is the setter method. this will set the rules
   * Add rules to the http response policy.
   * @return rules
   */
  @VsoMethod
  public void setRules(List<HTTPResponseRule>  rules) {
    this.rules = rules;
  }

  /**
   * This is the setter method this will set the rules
   * Add rules to the http response policy.
   * @return rules
   */
  @VsoMethod
  public HTTPResponsePolicy addRulesItem(HTTPResponseRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<HTTPResponseRule>();
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
  HTTPResponsePolicy objHTTPResponsePolicy = (HTTPResponsePolicy) o;
  return   Objects.equals(this.rules, objHTTPResponsePolicy.rules);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HTTPResponsePolicy {\n");
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

