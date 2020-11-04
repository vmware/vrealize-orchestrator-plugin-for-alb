package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.MatchTarget;
import com.vmware.avi.vro.model.HTTPRedirectAction;
import com.vmware.avi.vro.model.HTTPRewriteURLAction;
import com.vmware.avi.vro.model.HTTPSwitchingAction;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HTTPRequestRule is a POJO class extends AviRestResource that used for creating
 * HTTPRequestRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPRequestRule")
@VsoFinder(name = Constants.FINDER_VRO_HTTPREQUESTRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPRequestRule extends AviRestResource {
    @JsonProperty("all_headers")
    @JsonInclude(Include.NON_NULL)
    private Boolean allHeaders = null;

    @JsonProperty("enable")
    @JsonInclude(Include.NON_NULL)
    private Boolean enable = true;

    @JsonProperty("hdr_action")
    @JsonInclude(Include.NON_NULL)
    private List<HTTPHdrAction> hdrAction = null;

    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index = null;

    @JsonProperty("log")
    @JsonInclude(Include.NON_NULL)
    private Boolean log = null;

    @JsonProperty("match")
    @JsonInclude(Include.NON_NULL)
    private MatchTarget match = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("redirect_action")
    @JsonInclude(Include.NON_NULL)
    private HTTPRedirectAction redirectAction = null;

    @JsonProperty("rewrite_url_action")
    @JsonInclude(Include.NON_NULL)
    private HTTPRewriteURLAction rewriteUrlAction = null;

    @JsonProperty("switching_action")
    @JsonInclude(Include.NON_NULL)
    private HTTPSwitchingAction switchingAction = null;



  /**
   * This is the getter method this will return the attribute value.
   * Log all http headers upon rule match.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allHeaders
   */
  @VsoMethod
  public Boolean getAllHeaders() {
    return allHeaders;
  }

  /**
   * This is the setter method to the attribute.
   * Log all http headers upon rule match.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param allHeaders set the allHeaders.
   */
  @VsoMethod
  public void setAllHeaders(Boolean  allHeaders) {
    this.allHeaders = allHeaders;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable or disable the rule.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enable
   */
  @VsoMethod
  public Boolean getEnable() {
    return enable;
  }

  /**
   * This is the setter method to the attribute.
   * Enable or disable the rule.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enable set the enable.
   */
  @VsoMethod
  public void setEnable(Boolean  enable) {
    this.enable = enable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http header rewrite action.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hdrAction
   */
  @VsoMethod
  public List<HTTPHdrAction> getHdrAction() {
    return hdrAction;
  }

  /**
   * This is the setter method. this will set the hdrAction
   * Http header rewrite action.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hdrAction
   */
  @VsoMethod
  public void setHdrAction(List<HTTPHdrAction>  hdrAction) {
    this.hdrAction = hdrAction;
  }

  /**
   * This is the setter method this will set the hdrAction
   * Http header rewrite action.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hdrAction
   */
  @VsoMethod
  public HTTPRequestRule addHdrActionItem(HTTPHdrAction hdrActionItem) {
    if (this.hdrAction == null) {
      this.hdrAction = new ArrayList<HTTPHdrAction>();
    }
    this.hdrAction.add(hdrActionItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Index of the rule.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Index of the rule.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Log http request upon rule match.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return log
   */
  @VsoMethod
  public Boolean getLog() {
    return log;
  }

  /**
   * This is the setter method to the attribute.
   * Log http request upon rule match.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param log set the log.
   */
  @VsoMethod
  public void setLog(Boolean  log) {
    this.log = log;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Add match criteria to the rule.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return match
   */
  @VsoMethod
  public MatchTarget getMatch() {
    return match;
  }

  /**
   * This is the setter method to the attribute.
   * Add match criteria to the rule.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param match set the match.
   */
  @VsoMethod
  public void setMatch(MatchTarget match) {
    this.match = match;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the rule.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the rule.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http redirect action.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return redirectAction
   */
  @VsoMethod
  public HTTPRedirectAction getRedirectAction() {
    return redirectAction;
  }

  /**
   * This is the setter method to the attribute.
   * Http redirect action.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param redirectAction set the redirectAction.
   */
  @VsoMethod
  public void setRedirectAction(HTTPRedirectAction redirectAction) {
    this.redirectAction = redirectAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http request url rewrite action.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rewriteUrlAction
   */
  @VsoMethod
  public HTTPRewriteURLAction getRewriteUrlAction() {
    return rewriteUrlAction;
  }

  /**
   * This is the setter method to the attribute.
   * Http request url rewrite action.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rewriteUrlAction set the rewriteUrlAction.
   */
  @VsoMethod
  public void setRewriteUrlAction(HTTPRewriteURLAction rewriteUrlAction) {
    this.rewriteUrlAction = rewriteUrlAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Content switching action.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return switchingAction
   */
  @VsoMethod
  public HTTPSwitchingAction getSwitchingAction() {
    return switchingAction;
  }

  /**
   * This is the setter method to the attribute.
   * Content switching action.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param switchingAction set the switchingAction.
   */
  @VsoMethod
  public void setSwitchingAction(HTTPSwitchingAction switchingAction) {
    this.switchingAction = switchingAction;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTPRequestRule objHTTPRequestRule = (HTTPRequestRule) o;
  return   Objects.equals(this.name, objHTTPRequestRule.name)&&
  Objects.equals(this.index, objHTTPRequestRule.index)&&
  Objects.equals(this.enable, objHTTPRequestRule.enable)&&
  Objects.equals(this.match, objHTTPRequestRule.match)&&
  Objects.equals(this.redirectAction, objHTTPRequestRule.redirectAction)&&
  Objects.equals(this.hdrAction, objHTTPRequestRule.hdrAction)&&
  Objects.equals(this.rewriteUrlAction, objHTTPRequestRule.rewriteUrlAction)&&
  Objects.equals(this.switchingAction, objHTTPRequestRule.switchingAction)&&
  Objects.equals(this.log, objHTTPRequestRule.log)&&
  Objects.equals(this.allHeaders, objHTTPRequestRule.allHeaders);
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

