package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ContentRewriteProfile is a POJO class extends AviRestResource that used for creating
 * ContentRewriteProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ContentRewriteProfile")
@VsoFinder(name = Constants.FINDER_VRO_CONTENTREWRITEPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ContentRewriteProfile extends AviRestResource {
  @JsonProperty("req_match_replace_pair")
  @JsonInclude(Include.NON_NULL)
  private List<MatchReplacePair> reqMatchReplacePair = null;

  @JsonProperty("request_rewrite_enabled")
  @JsonInclude(Include.NON_NULL)
  private Boolean requestRewriteEnabled = false;

  @JsonProperty("response_rewrite_enabled")
  @JsonInclude(Include.NON_NULL)
  private Boolean responseRewriteEnabled = false;

  @JsonProperty("rewritable_content_ref")
  @JsonInclude(Include.NON_NULL)
  private String rewritableContentRef = null;

  @JsonProperty("rsp_match_replace_pair")
  @JsonInclude(Include.NON_NULL)
  private List<MatchReplacePair> rspMatchReplacePair = null;



  /**
   * This is the getter method this will return the attribute value.
   * Strings to be matched and replaced with on the request body.
   * @return reqMatchReplacePair
   */
  @VsoMethod
  public List<MatchReplacePair> getReqMatchReplacePair() {
    return reqMatchReplacePair;
  }

  /**
   * This is the setter method. this will set the reqMatchReplacePair
   * Strings to be matched and replaced with on the request body.
   * @return reqMatchReplacePair
   */
  @VsoMethod
  public void setReqMatchReplacePair(List<MatchReplacePair>  reqMatchReplacePair) {
    this.reqMatchReplacePair = reqMatchReplacePair;
  }

  /**
   * This is the setter method this will set the reqMatchReplacePair
   * Strings to be matched and replaced with on the request body.
   * @return reqMatchReplacePair
   */
  @VsoMethod
  public ContentRewriteProfile addReqMatchReplacePairItem(MatchReplacePair reqMatchReplacePairItem) {
    if (this.reqMatchReplacePair == null) {
      this.reqMatchReplacePair = new ArrayList<MatchReplacePair>();
    }
    this.reqMatchReplacePair.add(reqMatchReplacePairItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Enable rewrite on request body.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return requestRewriteEnabled
   */
  @VsoMethod
  public Boolean getRequestRewriteEnabled() {
    return requestRewriteEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable rewrite on request body.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param requestRewriteEnabled set the requestRewriteEnabled.
   */
  @VsoMethod
  public void setRequestRewriteEnabled(Boolean  requestRewriteEnabled) {
    this.requestRewriteEnabled = requestRewriteEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable rewrite on response body.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return responseRewriteEnabled
   */
  @VsoMethod
  public Boolean getResponseRewriteEnabled() {
    return responseRewriteEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable rewrite on response body.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param responseRewriteEnabled set the responseRewriteEnabled.
   */
  @VsoMethod
  public void setResponseRewriteEnabled(Boolean  responseRewriteEnabled) {
    this.responseRewriteEnabled = responseRewriteEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rewrite only content types listed in this string group.
   * Content types not present in this list are not rewritten.
   * It is a reference to an object of type stringgroup.
   * @return rewritableContentRef
   */
  @VsoMethod
  public String getRewritableContentRef() {
    return rewritableContentRef;
  }

  /**
   * This is the setter method to the attribute.
   * Rewrite only content types listed in this string group.
   * Content types not present in this list are not rewritten.
   * It is a reference to an object of type stringgroup.
   * @param rewritableContentRef set the rewritableContentRef.
   */
  @VsoMethod
  public void setRewritableContentRef(String  rewritableContentRef) {
    this.rewritableContentRef = rewritableContentRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Strings to be matched and replaced with on the response body.
   * @return rspMatchReplacePair
   */
  @VsoMethod
  public List<MatchReplacePair> getRspMatchReplacePair() {
    return rspMatchReplacePair;
  }

  /**
   * This is the setter method. this will set the rspMatchReplacePair
   * Strings to be matched and replaced with on the response body.
   * @return rspMatchReplacePair
   */
  @VsoMethod
  public void setRspMatchReplacePair(List<MatchReplacePair>  rspMatchReplacePair) {
    this.rspMatchReplacePair = rspMatchReplacePair;
  }

  /**
   * This is the setter method this will set the rspMatchReplacePair
   * Strings to be matched and replaced with on the response body.
   * @return rspMatchReplacePair
   */
  @VsoMethod
  public ContentRewriteProfile addRspMatchReplacePairItem(MatchReplacePair rspMatchReplacePairItem) {
    if (this.rspMatchReplacePair == null) {
      this.rspMatchReplacePair = new ArrayList<MatchReplacePair>();
    }
    this.rspMatchReplacePair.add(rspMatchReplacePairItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ContentRewriteProfile objContentRewriteProfile = (ContentRewriteProfile) o;
  return   Objects.equals(this.responseRewriteEnabled, objContentRewriteProfile.responseRewriteEnabled)&&
  Objects.equals(this.requestRewriteEnabled, objContentRewriteProfile.requestRewriteEnabled)&&
  Objects.equals(this.reqMatchReplacePair, objContentRewriteProfile.reqMatchReplacePair)&&
  Objects.equals(this.rspMatchReplacePair, objContentRewriteProfile.rspMatchReplacePair)&&
  Objects.equals(this.rewritableContentRef, objContentRewriteProfile.rewritableContentRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ContentRewriteProfile {\n");
      sb.append("    reqMatchReplacePair: ").append(toIndentedString(reqMatchReplacePair)).append("\n");
        sb.append("    requestRewriteEnabled: ").append(toIndentedString(requestRewriteEnabled)).append("\n");
        sb.append("    responseRewriteEnabled: ").append(toIndentedString(responseRewriteEnabled)).append("\n");
        sb.append("    rewritableContentRef: ").append(toIndentedString(rewritableContentRef)).append("\n");
        sb.append("    rspMatchReplacePair: ").append(toIndentedString(rspMatchReplacePair)).append("\n");
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
