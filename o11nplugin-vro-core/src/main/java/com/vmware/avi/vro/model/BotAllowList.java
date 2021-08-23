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
 * The BotAllowList is a POJO class extends AviRestResource that used for creating
 * BotAllowList.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BotAllowList")
@VsoFinder(name = Constants.FINDER_VRO_BOTALLOWLIST)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BotAllowList extends AviRestResource {
    @JsonProperty("rules")
    @JsonInclude(Include.NON_NULL)
    private List<BotAllowRule> rules = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allow rules to control which requests undergo bot detection.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public List<BotAllowRule> getRules() {
    return rules;
  }

  /**
   * This is the setter method. this will set the rules
   * Allow rules to control which requests undergo bot detection.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public void setRules(List<BotAllowRule>  rules) {
    this.rules = rules;
  }

  /**
   * This is the setter method this will set the rules
   * Allow rules to control which requests undergo bot detection.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public BotAllowList addRulesItem(BotAllowRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<BotAllowRule>();
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
  BotAllowList objBotAllowList = (BotAllowList) o;
  return   Objects.equals(this.rules, objBotAllowList.rules);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BotAllowList {\n");
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

