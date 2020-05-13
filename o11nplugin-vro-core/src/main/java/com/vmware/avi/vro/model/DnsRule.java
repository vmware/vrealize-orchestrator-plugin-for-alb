package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DnsRuleAction;
import com.vmware.avi.vro.model.DnsRuleMatchTarget;
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
 * DnsRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsRule")
@VsoFinder(name = Constants.FINDER_VRO_DNSRULE, idAccessor = "getObjectID()")
@Service
public class DnsRule extends AviRestResource  {
  @JsonProperty("action")
  private DnsRuleAction action = null;

  @JsonProperty("enable")
  private Boolean enable = true;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("log")
  private Boolean log = null;

  @JsonProperty("match")
  private DnsRuleMatchTarget match = null;

  @JsonProperty("name")
  private String name = null;

  
  /**
   * Action to be performed upon successful matching. Field introduced in 17.1.1.
   * @return action
  **/
  @ApiModelProperty(value = "Action to be performed upon successful matching. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public DnsRuleAction getAction() {
    return action;
  }
    
  @VsoMethod
  public void setAction(DnsRuleAction action) {
    this.action = action;
  }

  
  /**
   * Enable or disable the rule. Field introduced in 17.1.1.
   * @return enable
  **/
  @ApiModelProperty(value = "Enable or disable the rule. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isEnable() {
    return enable;
  }
    
  @VsoMethod
  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  
  /**
   * Index of the rule. Field introduced in 17.1.1.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Index of the rule. Field introduced in 17.1.1.")
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
   * Log DNS query upon rule match. Field introduced in 17.1.1.
   * @return log
  **/
  @ApiModelProperty(value = "Log DNS query upon rule match. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isLog() {
    return log;
  }
    
  @VsoMethod
  public void setLog(Boolean log) {
    this.log = log;
  }

  
  /**
   * Add match criteria to the rule. Field introduced in 17.1.1.
   * @return match
  **/
  @ApiModelProperty(value = "Add match criteria to the rule. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public DnsRuleMatchTarget getMatch() {
    return match;
  }
    
  @VsoMethod
  public void setMatch(DnsRuleMatchTarget match) {
    this.match = match;
  }

  
  /**
   * Name of the rule. Field introduced in 17.1.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the rule. Field introduced in 17.1.1.")
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
		return "DnsRule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRule dnsRule = (DnsRule) o;
    return Objects.equals(this.action, dnsRule.action) &&
        Objects.equals(this.enable, dnsRule.enable) &&
        Objects.equals(this.index, dnsRule.index) &&
        Objects.equals(this.log, dnsRule.log) &&
        Objects.equals(this.match, dnsRule.match) &&
        Objects.equals(this.name, dnsRule.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, enable, index, log, match, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRule {\n");
    
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

