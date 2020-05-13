package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.L4Rule;
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
 * L4ConnectionPolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "L4ConnectionPolicy")
@VsoFinder(name = Constants.FINDER_VRO_L4CONNECTIONPOLICY, idAccessor = "getObjectID()")
@Service
public class L4ConnectionPolicy extends AviRestResource  {
  @JsonProperty("rules")
  @Valid
  private List<L4Rule> rules = null;

  
  public L4ConnectionPolicy addRulesItem(L4Rule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<L4Rule>();
    }
    this.rules.add(rulesItem);
    return this;
  }
  
  /**
   * Rules to apply when a new transport connection is setup. Field introduced in 17.2.7.
   * @return rules
  **/
  @ApiModelProperty(value = "Rules to apply when a new transport connection is setup. Field introduced in 17.2.7.")

  @Valid

 
  @VsoMethod  
  public List<L4Rule> getRules() {
    return rules;
  }
    
  @VsoMethod
  public void setRules(List<L4Rule> rules) {
    this.rules = rules;
  }

  
  public String getObjectID() {
		return "L4ConnectionPolicy";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L4ConnectionPolicy l4ConnectionPolicy = (L4ConnectionPolicy) o;
    return Objects.equals(this.rules, l4ConnectionPolicy.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L4ConnectionPolicy {\n");
    
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

