package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.MatchReplacePair;
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
 * ContentRewriteProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "ContentRewriteProfile")
@VsoFinder(name = Constants.FINDER_VRO_CONTENTREWRITEPROFILE, idAccessor = "getObjectID()")
@Service
public class ContentRewriteProfile extends AviRestResource  {
  @JsonProperty("req_match_replace_pair")
  @Valid
  private List<MatchReplacePair> reqMatchReplacePair = null;

  @JsonProperty("request_rewrite_enabled")
  private Boolean requestRewriteEnabled = null;

  @JsonProperty("response_rewrite_enabled")
  private Boolean responseRewriteEnabled = null;

  @JsonProperty("rewritable_content_ref")
  private String rewritableContentRef = null;

  @JsonProperty("rsp_match_replace_pair")
  @Valid
  private List<MatchReplacePair> rspMatchReplacePair = null;

  
  public ContentRewriteProfile addReqMatchReplacePairItem(MatchReplacePair reqMatchReplacePairItem) {
    if (this.reqMatchReplacePair == null) {
      this.reqMatchReplacePair = new ArrayList<MatchReplacePair>();
    }
    this.reqMatchReplacePair.add(reqMatchReplacePairItem);
    return this;
  }
  
  /**
   * Strings to be matched and replaced with on the request body.
   * @return reqMatchReplacePair
  **/
  @ApiModelProperty(value = "Strings to be matched and replaced with on the request body.")

  @Valid

 
  @VsoMethod  
  public List<MatchReplacePair> getReqMatchReplacePair() {
    return reqMatchReplacePair;
  }
    
  @VsoMethod
  public void setReqMatchReplacePair(List<MatchReplacePair> reqMatchReplacePair) {
    this.reqMatchReplacePair = reqMatchReplacePair;
  }

  
  /**
   * Enable rewrite on request body.
   * @return requestRewriteEnabled
  **/
  @ApiModelProperty(value = "Enable rewrite on request body.")


 
  @VsoMethod  
  public Boolean isRequestRewriteEnabled() {
    return requestRewriteEnabled;
  }
    
  @VsoMethod
  public void setRequestRewriteEnabled(Boolean requestRewriteEnabled) {
    this.requestRewriteEnabled = requestRewriteEnabled;
  }

  
  /**
   * Enable rewrite on response body.
   * @return responseRewriteEnabled
  **/
  @ApiModelProperty(value = "Enable rewrite on response body.")


 
  @VsoMethod  
  public Boolean isResponseRewriteEnabled() {
    return responseRewriteEnabled;
  }
    
  @VsoMethod
  public void setResponseRewriteEnabled(Boolean responseRewriteEnabled) {
    this.responseRewriteEnabled = responseRewriteEnabled;
  }

  
  /**
   * Rewrite only content types listed in this string group. Content types not present in this list are not rewritten. It is a reference to an object of type StringGroup.
   * @return rewritableContentRef
  **/
  @ApiModelProperty(value = "Rewrite only content types listed in this string group. Content types not present in this list are not rewritten. It is a reference to an object of type StringGroup.")


 
  @VsoMethod  
  public String getRewritableContentRef() {
    return rewritableContentRef;
  }
    
  @VsoMethod
  public void setRewritableContentRef(String rewritableContentRef) {
    this.rewritableContentRef = rewritableContentRef;
  }

  
  public ContentRewriteProfile addRspMatchReplacePairItem(MatchReplacePair rspMatchReplacePairItem) {
    if (this.rspMatchReplacePair == null) {
      this.rspMatchReplacePair = new ArrayList<MatchReplacePair>();
    }
    this.rspMatchReplacePair.add(rspMatchReplacePairItem);
    return this;
  }
  
  /**
   * Strings to be matched and replaced with on the response body.
   * @return rspMatchReplacePair
  **/
  @ApiModelProperty(value = "Strings to be matched and replaced with on the response body.")

  @Valid

 
  @VsoMethod  
  public List<MatchReplacePair> getRspMatchReplacePair() {
    return rspMatchReplacePair;
  }
    
  @VsoMethod
  public void setRspMatchReplacePair(List<MatchReplacePair> rspMatchReplacePair) {
    this.rspMatchReplacePair = rspMatchReplacePair;
  }

  
  public String getObjectID() {
		return "ContentRewriteProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentRewriteProfile contentRewriteProfile = (ContentRewriteProfile) o;
    return Objects.equals(this.reqMatchReplacePair, contentRewriteProfile.reqMatchReplacePair) &&
        Objects.equals(this.requestRewriteEnabled, contentRewriteProfile.requestRewriteEnabled) &&
        Objects.equals(this.responseRewriteEnabled, contentRewriteProfile.responseRewriteEnabled) &&
        Objects.equals(this.rewritableContentRef, contentRewriteProfile.rewritableContentRef) &&
        Objects.equals(this.rspMatchReplacePair, contentRewriteProfile.rspMatchReplacePair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reqMatchReplacePair, requestRewriteEnabled, responseRewriteEnabled, rewritableContentRef, rspMatchReplacePair);
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

