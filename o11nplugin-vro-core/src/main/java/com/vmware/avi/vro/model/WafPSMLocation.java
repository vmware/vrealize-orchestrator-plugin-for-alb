package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.WafPSMLocationMatch;
import com.vmware.avi.vro.model.WafPSMRule;
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
 * WafPSMLocation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafPSMLocation")
@VsoFinder(name = Constants.FINDER_VRO_WAFPSMLOCATION, idAccessor = "getObjectID()")
@Service
public class WafPSMLocation extends AviRestResource  {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("match")
  private WafPSMLocationMatch match = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rules")
  @Valid
  private List<WafPSMRule> rules = null;

  
  /**
   * Free-text comment about this location. Field introduced in 18.2.3.
   * @return description
  **/
  @ApiModelProperty(value = "Free-text comment about this location. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Location index, this is used to determine the order of the locations. Field introduced in 18.2.3.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Location index, this is used to determine the order of the locations. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public Integer getIndex() {
    return index;
  }
    
  @VsoMethod
  public void setIndex(Integer index) {
    this.index = index;
  }

  
  /**
   * Apply these rules only if the request is matching this description. Field introduced in 18.2.3.
   * @return match
  **/
  @ApiModelProperty(value = "Apply these rules only if the request is matching this description. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public WafPSMLocationMatch getMatch() {
    return match;
  }
    
  @VsoMethod
  public void setMatch(WafPSMLocationMatch match) {
    this.match = match;
  }

  
  /**
   * User defined name for this location, it must be unique in the group. Field introduced in 18.2.3.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "User defined name for this location, it must be unique in the group. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public WafPSMLocation addRulesItem(WafPSMRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<WafPSMRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }
  
  /**
   * A list of rules which should be applied on this location. Field introduced in 18.2.3.
   * @return rules
  **/
  @ApiModelProperty(value = "A list of rules which should be applied on this location. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public List<WafPSMRule> getRules() {
    return rules;
  }
    
  @VsoMethod
  public void setRules(List<WafPSMRule> rules) {
    this.rules = rules;
  }

  
  public String getObjectID() {
		return "WafPSMLocation";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafPSMLocation wafPSMLocation = (WafPSMLocation) o;
    return Objects.equals(this.description, wafPSMLocation.description) &&
        Objects.equals(this.index, wafPSMLocation.index) &&
        Objects.equals(this.match, wafPSMLocation.match) &&
        Objects.equals(this.name, wafPSMLocation.name) &&
        Objects.equals(this.rules, wafPSMLocation.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, index, match, name, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafPSMLocation {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

