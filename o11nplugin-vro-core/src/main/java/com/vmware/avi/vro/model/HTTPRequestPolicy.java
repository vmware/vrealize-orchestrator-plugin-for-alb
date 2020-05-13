package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HTTPRequestRule;
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
 * HTTPRequestPolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPRequestPolicy")
@VsoFinder(name = Constants.FINDER_VRO_HTTPREQUESTPOLICY, idAccessor = "getObjectID()")
@Service
public class HTTPRequestPolicy extends AviRestResource  {
  @JsonProperty("rules")
  @Valid
  private List<HTTPRequestRule> rules = null;

  
  public HTTPRequestPolicy addRulesItem(HTTPRequestRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<HTTPRequestRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }
  
  /**
   * Add rules to the HTTP request policy.
   * @return rules
  **/
  @ApiModelProperty(value = "Add rules to the HTTP request policy.")

  @Valid

 
  @VsoMethod  
  public List<HTTPRequestRule> getRules() {
    return rules;
  }
    
  @VsoMethod
  public void setRules(List<HTTPRequestRule> rules) {
    this.rules = rules;
  }

  
  public String getObjectID() {
		return "HTTPRequestPolicy";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPRequestPolicy htTPRequestPolicy = (HTTPRequestPolicy) o;
    return Objects.equals(this.rules, htTPRequestPolicy.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPRequestPolicy {\n");
    
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

