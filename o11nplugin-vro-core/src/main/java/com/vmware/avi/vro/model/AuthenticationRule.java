package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AuthenticationAction;
import com.vmware.avi.vro.model.AuthenticationMatch;
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
 * AuthenticationRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "AuthenticationRule")
@VsoFinder(name = Constants.FINDER_VRO_AUTHENTICATIONRULE, idAccessor = "getObjectID()")
@Service
public class AuthenticationRule extends AviRestResource  {
  @JsonProperty("action")
  private AuthenticationAction action = null;

  @JsonProperty("enable")
  private Boolean enable = true;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("match")
  private AuthenticationMatch match = null;

  @JsonProperty("name")
  private String name = null;

  
  /**
   * Enable or disable authentication for matched targets. Field introduced in 18.2.5.
   * @return action
  **/
  @ApiModelProperty(value = "Enable or disable authentication for matched targets. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public AuthenticationAction getAction() {
    return action;
  }
    
  @VsoMethod
  public void setAction(AuthenticationAction action) {
    this.action = action;
  }

  
  /**
   * Enable or disable the rule. Field introduced in 18.2.5.
   * @return enable
  **/
  @ApiModelProperty(required = true, value = "Enable or disable the rule. Field introduced in 18.2.5.")
  @NotNull


 
  @VsoMethod  
  public Boolean isEnable() {
    return enable;
  }
    
  @VsoMethod
  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  
  /**
   * Index of the rule. Field introduced in 18.2.5.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Index of the rule. Field introduced in 18.2.5.")
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
   * Add match criteria to the rule. Field introduced in 18.2.5.
   * @return match
  **/
  @ApiModelProperty(value = "Add match criteria to the rule. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public AuthenticationMatch getMatch() {
    return match;
  }
    
  @VsoMethod
  public void setMatch(AuthenticationMatch match) {
    this.match = match;
  }

  
  /**
   * Name of the rule. Field introduced in 18.2.5.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the rule. Field introduced in 18.2.5.")
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
		return "AuthenticationRule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationRule authenticationRule = (AuthenticationRule) o;
    return Objects.equals(this.action, authenticationRule.action) &&
        Objects.equals(this.enable, authenticationRule.enable) &&
        Objects.equals(this.index, authenticationRule.index) &&
        Objects.equals(this.match, authenticationRule.match) &&
        Objects.equals(this.name, authenticationRule.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, enable, index, match, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationRule {\n");
    
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

