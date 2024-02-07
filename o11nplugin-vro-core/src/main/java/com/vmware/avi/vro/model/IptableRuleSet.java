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
 * The IptableRuleSet is a POJO class extends AviRestResource that used for creating
 * IptableRuleSet.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IptableRuleSet")
@VsoFinder(name = Constants.FINDER_VRO_IPTABLERULESET)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IptableRuleSet extends AviRestResource {
    @JsonProperty("chain")
    @JsonInclude(Include.NON_NULL)
    private String chain;

    @JsonProperty("rules")
    @JsonInclude(Include.NON_NULL)
    private List<IptableRule> rules;

    @JsonProperty("table")
    @JsonInclude(Include.NON_NULL)
    private String table;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return chain
   */
  @VsoMethod
  public String getChain() {
    return chain;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param chain set the chain.
   */
  @VsoMethod
  public void setChain(String  chain) {
    this.chain = chain;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public List<IptableRule> getRules() {
    return rules;
  }

  /**
   * This is the setter method. this will set the rules
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public void setRules(List<IptableRule>  rules) {
    this.rules = rules;
  }

  /**
   * This is the setter method this will set the rules
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public IptableRuleSet addRulesItem(IptableRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<IptableRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return table
   */
  @VsoMethod
  public String getTable() {
    return table;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param table set the table.
   */
  @VsoMethod
  public void setTable(String  table) {
    this.table = table;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  IptableRuleSet objIptableRuleSet = (IptableRuleSet) o;
  return   Objects.equals(this.table, objIptableRuleSet.table)&&
  Objects.equals(this.chain, objIptableRuleSet.chain)&&
  Objects.equals(this.rules, objIptableRuleSet.rules);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IptableRuleSet {\n");
      sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
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

