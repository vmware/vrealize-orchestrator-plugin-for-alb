package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HTTPHdrAction;
import com.vmware.avi.vro.model.HTTPRedirectAction;
import com.vmware.avi.vro.model.HTTPRewriteURLAction;
import com.vmware.avi.vro.model.HTTPSwitchingAction;
import com.vmware.avi.vro.model.MatchTarget;
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
 * HTTPRequestRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPRequestRule")
@VsoFinder(name = Constants.FINDER_VRO_HTTPREQUESTRULE, idAccessor = "getObjectID()")
@Service
public class HTTPRequestRule extends AviRestResource  {
  @JsonProperty("all_headers")
  private Boolean allHeaders = null;

  @JsonProperty("enable")
  private Boolean enable = true;

  @JsonProperty("hdr_action")
  @Valid
  private List<HTTPHdrAction> hdrAction = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("log")
  private Boolean log = null;

  @JsonProperty("match")
  private MatchTarget match = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("redirect_action")
  private HTTPRedirectAction redirectAction = null;

  @JsonProperty("rewrite_url_action")
  private HTTPRewriteURLAction rewriteUrlAction = null;

  @JsonProperty("switching_action")
  private HTTPSwitchingAction switchingAction = null;

  
  /**
   * Log all HTTP headers upon rule match.
   * @return allHeaders
  **/
  @ApiModelProperty(value = "Log all HTTP headers upon rule match.")


 
  @VsoMethod  
  public Boolean isAllHeaders() {
    return allHeaders;
  }
    
  @VsoMethod
  public void setAllHeaders(Boolean allHeaders) {
    this.allHeaders = allHeaders;
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

  
  public HTTPRequestRule addHdrActionItem(HTTPHdrAction hdrActionItem) {
    if (this.hdrAction == null) {
      this.hdrAction = new ArrayList<HTTPHdrAction>();
    }
    this.hdrAction.add(hdrActionItem);
    return this;
  }
  
  /**
   * HTTP header rewrite action.
   * @return hdrAction
  **/
  @ApiModelProperty(value = "HTTP header rewrite action.")

  @Valid

 
  @VsoMethod  
  public List<HTTPHdrAction> getHdrAction() {
    return hdrAction;
  }
    
  @VsoMethod
  public void setHdrAction(List<HTTPHdrAction> hdrAction) {
    this.hdrAction = hdrAction;
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

  
  /**
   * HTTP redirect action.
   * @return redirectAction
  **/
  @ApiModelProperty(value = "HTTP redirect action.")

  @Valid

 
  @VsoMethod  
  public HTTPRedirectAction getRedirectAction() {
    return redirectAction;
  }
    
  @VsoMethod
  public void setRedirectAction(HTTPRedirectAction redirectAction) {
    this.redirectAction = redirectAction;
  }

  
  /**
   * HTTP request URL rewrite action.
   * @return rewriteUrlAction
  **/
  @ApiModelProperty(value = "HTTP request URL rewrite action.")

  @Valid

 
  @VsoMethod  
  public HTTPRewriteURLAction getRewriteUrlAction() {
    return rewriteUrlAction;
  }
    
  @VsoMethod
  public void setRewriteUrlAction(HTTPRewriteURLAction rewriteUrlAction) {
    this.rewriteUrlAction = rewriteUrlAction;
  }

  
  /**
   * Content switching action.
   * @return switchingAction
  **/
  @ApiModelProperty(value = "Content switching action.")

  @Valid

 
  @VsoMethod  
  public HTTPSwitchingAction getSwitchingAction() {
    return switchingAction;
  }
    
  @VsoMethod
  public void setSwitchingAction(HTTPSwitchingAction switchingAction) {
    this.switchingAction = switchingAction;
  }

  
  public String getObjectID() {
		return "HTTPRequestRule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPRequestRule htTPRequestRule = (HTTPRequestRule) o;
    return Objects.equals(this.allHeaders, htTPRequestRule.allHeaders) &&
        Objects.equals(this.enable, htTPRequestRule.enable) &&
        Objects.equals(this.hdrAction, htTPRequestRule.hdrAction) &&
        Objects.equals(this.index, htTPRequestRule.index) &&
        Objects.equals(this.log, htTPRequestRule.log) &&
        Objects.equals(this.match, htTPRequestRule.match) &&
        Objects.equals(this.name, htTPRequestRule.name) &&
        Objects.equals(this.redirectAction, htTPRequestRule.redirectAction) &&
        Objects.equals(this.rewriteUrlAction, htTPRequestRule.rewriteUrlAction) &&
        Objects.equals(this.switchingAction, htTPRequestRule.switchingAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allHeaders, enable, hdrAction, index, log, match, name, redirectAction, rewriteUrlAction, switchingAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPRequestRule {\n");
    
    sb.append("    allHeaders: ").append(toIndentedString(allHeaders)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    hdrAction: ").append(toIndentedString(hdrAction)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    redirectAction: ").append(toIndentedString(redirectAction)).append("\n");
    sb.append("    rewriteUrlAction: ").append(toIndentedString(rewriteUrlAction)).append("\n");
    sb.append("    switchingAction: ").append(toIndentedString(switchingAction)).append("\n");
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

