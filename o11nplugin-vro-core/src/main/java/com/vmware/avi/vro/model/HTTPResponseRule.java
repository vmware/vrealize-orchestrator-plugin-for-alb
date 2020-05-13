package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HTTPHdrAction;
import com.vmware.avi.vro.model.HTTPRewriteLocHdrAction;
import com.vmware.avi.vro.model.ResponseMatchTarget;
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
 * HTTPResponseRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPResponseRule")
@VsoFinder(name = Constants.FINDER_VRO_HTTPRESPONSERULE, idAccessor = "getObjectID()")
@Service
public class HTTPResponseRule extends AviRestResource  {
  @JsonProperty("all_headers")
  private Boolean allHeaders = null;

  @JsonProperty("enable")
  private Boolean enable = true;

  @JsonProperty("hdr_action")
  @Valid
  private List<HTTPHdrAction> hdrAction = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("loc_hdr_action")
  private HTTPRewriteLocHdrAction locHdrAction = null;

  @JsonProperty("log")
  private Boolean log = null;

  @JsonProperty("match")
  private ResponseMatchTarget match = null;

  @JsonProperty("name")
  private String name = null;

  
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

  
  public HTTPResponseRule addHdrActionItem(HTTPHdrAction hdrActionItem) {
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
   * Location header rewrite action.
   * @return locHdrAction
  **/
  @ApiModelProperty(value = "Location header rewrite action.")

  @Valid

 
  @VsoMethod  
  public HTTPRewriteLocHdrAction getLocHdrAction() {
    return locHdrAction;
  }
    
  @VsoMethod
  public void setLocHdrAction(HTTPRewriteLocHdrAction locHdrAction) {
    this.locHdrAction = locHdrAction;
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
  public ResponseMatchTarget getMatch() {
    return match;
  }
    
  @VsoMethod
  public void setMatch(ResponseMatchTarget match) {
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
		return "HTTPResponseRule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPResponseRule htTPResponseRule = (HTTPResponseRule) o;
    return Objects.equals(this.allHeaders, htTPResponseRule.allHeaders) &&
        Objects.equals(this.enable, htTPResponseRule.enable) &&
        Objects.equals(this.hdrAction, htTPResponseRule.hdrAction) &&
        Objects.equals(this.index, htTPResponseRule.index) &&
        Objects.equals(this.locHdrAction, htTPResponseRule.locHdrAction) &&
        Objects.equals(this.log, htTPResponseRule.log) &&
        Objects.equals(this.match, htTPResponseRule.match) &&
        Objects.equals(this.name, htTPResponseRule.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allHeaders, enable, hdrAction, index, locHdrAction, log, match, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPResponseRule {\n");
    
    sb.append("    allHeaders: ").append(toIndentedString(allHeaders)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    hdrAction: ").append(toIndentedString(hdrAction)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    locHdrAction: ").append(toIndentedString(locHdrAction)).append("\n");
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

