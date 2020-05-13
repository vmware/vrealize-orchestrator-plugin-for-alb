package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.NetworkSecurityMatchTarget;
import com.vmware.avi.vro.model.NetworkSecurityPolicyActionRLParam;
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
 * NetworkSecurityRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NetworkSecurityRule")
@VsoFinder(name = Constants.FINDER_VRO_NETWORKSECURITYRULE, idAccessor = "getObjectID()")
@Service
public class NetworkSecurityRule extends AviRestResource  {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("age")
  private Integer age = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("enable")
  private Boolean enable = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("log")
  private Boolean log = null;

  @JsonProperty("match")
  private NetworkSecurityMatchTarget match = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rl_param")
  private NetworkSecurityPolicyActionRLParam rlParam = null;

  
  /**
   *  Enum options - NETWORK_SECURITY_POLICY_ACTION_TYPE_ALLOW, NETWORK_SECURITY_POLICY_ACTION_TYPE_DENY, NETWORK_SECURITY_POLICY_ACTION_TYPE_RATE_LIMIT.
   * @return action
  **/
  @ApiModelProperty(required = true, value = " Enum options - NETWORK_SECURITY_POLICY_ACTION_TYPE_ALLOW, NETWORK_SECURITY_POLICY_ACTION_TYPE_DENY, NETWORK_SECURITY_POLICY_ACTION_TYPE_RATE_LIMIT.")
  @NotNull


 
  @VsoMethod  
  public String getAction() {
    return action;
  }
    
  @VsoMethod
  public void setAction(String action) {
    this.action = action;
  }

  
  /**
   * Time in minutes after which rule will be deleted. Allowed values are 1-4294967295. Special values are 0- 'blocked for ever'.
   * @return age
  **/
  @ApiModelProperty(value = "Time in minutes after which rule will be deleted. Allowed values are 1-4294967295. Special values are 0- 'blocked for ever'.")


 
  @VsoMethod  
  public Integer getAge() {
    return age;
  }
    
  @VsoMethod
  public void setAge(Integer age) {
    this.age = age;
  }

  
  /**
   * Creator name.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Creator name.")


 
  @VsoMethod  
  public String getCreatedBy() {
    return createdBy;
  }
    
  @VsoMethod
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * Placeholder for description of property enable of obj type NetworkSecurityRule field type str  type boolean
   * @return enable
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property enable of obj type NetworkSecurityRule field type str  type boolean")
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
   * Number of index.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Number of index.")
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
   * Placeholder for description of property log of obj type NetworkSecurityRule field type str  type boolean
   * @return log
  **/
  @ApiModelProperty(value = "Placeholder for description of property log of obj type NetworkSecurityRule field type str  type boolean")


 
  @VsoMethod  
  public Boolean isLog() {
    return log;
  }
    
  @VsoMethod
  public void setLog(Boolean log) {
    this.log = log;
  }

  
  /**
   * Placeholder for description of property match of obj type NetworkSecurityRule field type str  type object
   * @return match
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property match of obj type NetworkSecurityRule field type str  type object")
  @NotNull

  @Valid

 
  @VsoMethod  
  public NetworkSecurityMatchTarget getMatch() {
    return match;
  }
    
  @VsoMethod
  public void setMatch(NetworkSecurityMatchTarget match) {
    this.match = match;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Placeholder for description of property rl_param of obj type NetworkSecurityRule field type str  type object
   * @return rlParam
  **/
  @ApiModelProperty(value = "Placeholder for description of property rl_param of obj type NetworkSecurityRule field type str  type object")

  @Valid

 
  @VsoMethod  
  public NetworkSecurityPolicyActionRLParam getRlParam() {
    return rlParam;
  }
    
  @VsoMethod
  public void setRlParam(NetworkSecurityPolicyActionRLParam rlParam) {
    this.rlParam = rlParam;
  }

  
  public String getObjectID() {
		return "NetworkSecurityRule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkSecurityRule networkSecurityRule = (NetworkSecurityRule) o;
    return Objects.equals(this.action, networkSecurityRule.action) &&
        Objects.equals(this.age, networkSecurityRule.age) &&
        Objects.equals(this.createdBy, networkSecurityRule.createdBy) &&
        Objects.equals(this.enable, networkSecurityRule.enable) &&
        Objects.equals(this.index, networkSecurityRule.index) &&
        Objects.equals(this.log, networkSecurityRule.log) &&
        Objects.equals(this.match, networkSecurityRule.match) &&
        Objects.equals(this.name, networkSecurityRule.name) &&
        Objects.equals(this.rlParam, networkSecurityRule.rlParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, age, createdBy, enable, index, log, match, name, rlParam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkSecurityRule {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rlParam: ").append(toIndentedString(rlParam)).append("\n");
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

