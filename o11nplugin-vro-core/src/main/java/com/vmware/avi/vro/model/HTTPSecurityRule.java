package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HTTPSecurityAction;
import com.vmware.avi.vro.model.MatchTarget;
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
 * HTTPSecurityRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPSecurityRule")
@VsoFinder(name = Constants.FINDER_VRO_HTTPSECURITYRULE, idAccessor = "getObjectID()")
@Service
public class HTTPSecurityRule extends AviRestResource  {
  @JsonProperty("action")
  private HTTPSecurityAction action = null;

  @JsonProperty("enable")
  private Boolean enable = true;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("log")
  private Boolean log = null;

  @JsonProperty("match")
  private MatchTarget match = null;

  @JsonProperty("name")
  private String name = null;

  
  /**
   * Action to be performed upon successful matching.
   * @return action
  **/
  @ApiModelProperty(value = "Action to be performed upon successful matching.")

  @Valid

 
  @VsoMethod  
  public HTTPSecurityAction getAction() {
    return action;
  }
    
  @VsoMethod
  public void setAction(HTTPSecurityAction action) {
    this.action = action;
  }

  
  /**
   * Enable or disable the rule.
   * @return enable
  **/
  @ApiModelProperty(required = true, value = "Enable or disable the rule.")
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
   * Index of the rule.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Index of the rule.")
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
   * Log HTTP request upon rule match.
   * @return log
  **/
  @ApiModelProperty(value = "Log HTTP request upon rule match.")


 
  @VsoMethod  
  public Boolean isLog() {
    return log;
  }
    
  @VsoMethod
  public void setLog(Boolean log) {
    this.log = log;
  }

  
  /**
   * Add match criteria to the rule.
   * @return match
  **/
  @ApiModelProperty(value = "Add match criteria to the rule.")

  @Valid

 
  @VsoMethod  
  public MatchTarget getMatch() {
    return match;
  }
    
  @VsoMethod
  public void setMatch(MatchTarget match) {
    this.match = match;
  }

  
  /**
   * Name of the rule.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the rule.")
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
		return "HTTPSecurityRule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPSecurityRule htTPSecurityRule = (HTTPSecurityRule) o;
    return Objects.equals(this.action, htTPSecurityRule.action) &&
        Objects.equals(this.enable, htTPSecurityRule.enable) &&
        Objects.equals(this.index, htTPSecurityRule.index) &&
        Objects.equals(this.log, htTPSecurityRule.log) &&
        Objects.equals(this.match, htTPSecurityRule.match) &&
        Objects.equals(this.name, htTPSecurityRule.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, enable, index, log, match, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPSecurityRule {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
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

