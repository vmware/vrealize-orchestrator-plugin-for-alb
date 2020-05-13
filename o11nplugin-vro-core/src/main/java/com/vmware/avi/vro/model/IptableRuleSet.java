package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IptableRule;
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
 * IptableRuleSet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IptableRuleSet")
@VsoFinder(name = Constants.FINDER_VRO_IPTABLERULESET, idAccessor = "getObjectID()")
@Service
public class IptableRuleSet extends AviRestResource  {
  @JsonProperty("chain")
  private String chain = null;

  @JsonProperty("rules")
  @Valid
  private List<IptableRule> rules = null;

  @JsonProperty("table")
  private String table = null;

  
  /**
   * chain of IptableRuleSet.
   * @return chain
  **/
  @ApiModelProperty(required = true, value = "chain of IptableRuleSet.")
  @NotNull


 
  @VsoMethod  
  public String getChain() {
    return chain;
  }
    
  @VsoMethod
  public void setChain(String chain) {
    this.chain = chain;
  }

  
  public IptableRuleSet addRulesItem(IptableRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<IptableRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }
  
  /**
   * Placeholder for description of property rules of obj type IptableRuleSet field type str  type object
   * @return rules
  **/
  @ApiModelProperty(value = "Placeholder for description of property rules of obj type IptableRuleSet field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<IptableRule> getRules() {
    return rules;
  }
    
  @VsoMethod
  public void setRules(List<IptableRule> rules) {
    this.rules = rules;
  }

  
  /**
   * table of IptableRuleSet.
   * @return table
  **/
  @ApiModelProperty(required = true, value = "table of IptableRuleSet.")
  @NotNull


 
  @VsoMethod  
  public String getTable() {
    return table;
  }
    
  @VsoMethod
  public void setTable(String table) {
    this.table = table;
  }

  
  public String getObjectID() {
		return "IptableRuleSet";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IptableRuleSet iptableRuleSet = (IptableRuleSet) o;
    return Objects.equals(this.chain, iptableRuleSet.chain) &&
        Objects.equals(this.rules, iptableRuleSet.rules) &&
        Objects.equals(this.table, iptableRuleSet.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chain, rules, table);
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

