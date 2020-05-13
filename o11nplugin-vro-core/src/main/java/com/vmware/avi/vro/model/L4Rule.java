package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.L4RuleAction;
import com.vmware.avi.vro.model.L4RuleMatchTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * L4Rule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "L4Rule")
@VsoFinder(name = Constants.FINDER_VRO_L4RULE, idAccessor = "getObjectID()")
@Service
public class L4Rule extends AviRestResource  {
  @JsonProperty("action")
  private L4RuleAction action = null;

  @JsonProperty("enable")
  private Boolean enable = true;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("match")
  private L4RuleMatchTarget match = null;

  @JsonProperty("name")
  private String name = null;

  
  /**
   * Action to be performed upon successful rule match. Field introduced in 17.2.7.
   * @return action
  **/
  @ApiModelProperty(value = "Action to be performed upon successful rule match. Field introduced in 17.2.7.")

  @Valid

 
  @VsoMethod  
  public L4RuleAction getAction() {
    return action;
  }
    
  @VsoMethod
  public void setAction(L4RuleAction action) {
    this.action = action;
  }

  
  /**
   * Enable or disable the rule. Field introduced in 17.2.7.
   * @return enable
  **/
  @ApiModelProperty(value = "Enable or disable the rule. Field introduced in 17.2.7.")


 
  @VsoMethod  
  public Boolean isEnable() {
    return enable;
  }
    
  @VsoMethod
  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  
  /**
   * Index of the rule. Field introduced in 17.2.7.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Index of the rule. Field introduced in 17.2.7.")
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
   * Match criteria of the rule. Field introduced in 17.2.7.
   * @return match
  **/
  @ApiModelProperty(value = "Match criteria of the rule. Field introduced in 17.2.7.")

  @Valid

 
  @VsoMethod  
  public L4RuleMatchTarget getMatch() {
    return match;
  }
    
  @VsoMethod
  public void setMatch(L4RuleMatchTarget match) {
    this.match = match;
  }

  
  /**
   * Name of the rule. Field introduced in 17.2.7.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the rule. Field introduced in 17.2.7.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public String getObjectID() {
		return "L4Rule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L4Rule l4Rule = (L4Rule) o;
    return Objects.equals(this.action, l4Rule.action) &&
        Objects.equals(this.enable, l4Rule.enable) &&
        Objects.equals(this.index, l4Rule.index) &&
        Objects.equals(this.match, l4Rule.match) &&
        Objects.equals(this.name, l4Rule.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, enable, index, match, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L4Rule {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

