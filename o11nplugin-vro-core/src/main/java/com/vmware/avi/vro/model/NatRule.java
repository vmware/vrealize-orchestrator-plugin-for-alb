package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.NatMatchTarget;
import com.vmware.avi.vro.model.NatPolicyAction;
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
 * NatRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NatRule")
@VsoFinder(name = Constants.FINDER_VRO_NATRULE, idAccessor = "getObjectID()")
@Service
public class NatRule extends AviRestResource  {
  @JsonProperty("action")
  private NatPolicyAction action = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("enable")
  private Boolean enable = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("match")
  private NatMatchTarget match = null;

  @JsonProperty("name")
  private String name = null;

  
  /**
   * Nat rule Action Information. Field introduced in 18.2.3.
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Nat rule Action Information. Field introduced in 18.2.3.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public NatPolicyAction getAction() {
    return action;
  }
    
  @VsoMethod
  public void setAction(NatPolicyAction action) {
    this.action = action;
  }

  
  /**
   * Creator name. Field introduced in 18.2.3.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Creator name. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getCreatedBy() {
    return createdBy;
  }
    
  @VsoMethod
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * Nat rule enable flag. Field introduced in 18.2.3.
   * @return enable
  **/
  @ApiModelProperty(required = true, value = "Nat rule enable flag. Field introduced in 18.2.3.")
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
   * Nat rule Index. Field introduced in 18.2.3.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Nat rule Index. Field introduced in 18.2.3.")
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
   * Nat rule Match Criteria. Field introduced in 18.2.3.
   * @return match
  **/
  @ApiModelProperty(required = true, value = "Nat rule Match Criteria. Field introduced in 18.2.3.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public NatMatchTarget getMatch() {
    return match;
  }
    
  @VsoMethod
  public void setMatch(NatMatchTarget match) {
    this.match = match;
  }

  
  /**
   * Nat rule Name. Field introduced in 18.2.3.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nat rule Name. Field introduced in 18.2.3.")
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
		return "NatRule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NatRule natRule = (NatRule) o;
    return Objects.equals(this.action, natRule.action) &&
        Objects.equals(this.createdBy, natRule.createdBy) &&
        Objects.equals(this.enable, natRule.enable) &&
        Objects.equals(this.index, natRule.index) &&
        Objects.equals(this.match, natRule.match) &&
        Objects.equals(this.name, natRule.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, createdBy, enable, index, match, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatRule {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

