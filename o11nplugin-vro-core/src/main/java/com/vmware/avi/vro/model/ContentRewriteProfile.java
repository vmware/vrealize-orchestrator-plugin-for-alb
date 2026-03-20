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
    @JsonProperty("req_rewrite_rules")
    @JsonInclude(Include.NON_NULL)
    private List<ReqContentRewriteRule> reqRewriteRules;

    @JsonProperty("rsp_rewrite_rules")
    @JsonInclude(Include.NON_NULL)
    private List<RspContentRewriteRule> rspRewriteRules;



  /**
   * This is the getter method this will return the attribute value.
   * Content rewrite rules to be enabled on therequest body.
   * Field introduced in 31.2.1.
   * Maximum of 1 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reqRewriteRules
   */
  @VsoMethod
  public List<ReqContentRewriteRule> getReqRewriteRules() {
    return reqRewriteRules;
  }

  /**
   * This is the setter method. this will set the reqRewriteRules
   * Content rewrite rules to be enabled on therequest body.
   * Field introduced in 31.2.1.
   * Maximum of 1 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reqRewriteRules
   */
  @VsoMethod
  public void setReqRewriteRules(List<ReqContentRewriteRule>  reqRewriteRules) {
    this.reqRewriteRules = reqRewriteRules;
  }

  /**
   * This is the setter method this will set the reqRewriteRules
   * Content rewrite rules to be enabled on therequest body.
   * Field introduced in 31.2.1.
   * Maximum of 1 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reqRewriteRules
   */
  @VsoMethod
  public ContentRewriteProfile addReqRewriteRulesItem(ReqContentRewriteRule reqRewriteRulesItem) {
    if (this.reqRewriteRules == null) {
      this.reqRewriteRules = new ArrayList<ReqContentRewriteRule>();
    }
    this.reqRewriteRules.add(reqRewriteRulesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Content rewrite rules to be enabled on theresponse body.
   * Field introduced in 21.1.3.
   * Maximum of 1 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rspRewriteRules
   */
  @VsoMethod
  public List<RspContentRewriteRule> getRspRewriteRules() {
    return rspRewriteRules;
  }

  /**
   * This is the setter method. this will set the rspRewriteRules
   * Content rewrite rules to be enabled on theresponse body.
   * Field introduced in 21.1.3.
   * Maximum of 1 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rspRewriteRules
   */
  @VsoMethod
  public void setRspRewriteRules(List<RspContentRewriteRule>  rspRewriteRules) {
    this.rspRewriteRules = rspRewriteRules;
  }

  /**
   * This is the setter method this will set the rspRewriteRules
   * Content rewrite rules to be enabled on theresponse body.
   * Field introduced in 21.1.3.
   * Maximum of 1 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rspRewriteRules
   */
  @VsoMethod
  public ContentRewriteProfile addRspRewriteRulesItem(RspContentRewriteRule rspRewriteRulesItem) {
    if (this.rspRewriteRules == null) {
      this.rspRewriteRules = new ArrayList<RspContentRewriteRule>();
    }
    this.rspRewriteRules.add(rspRewriteRulesItem);
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
  return   Objects.equals(this.rspRewriteRules, objContentRewriteProfile.rspRewriteRules)&&
  Objects.equals(this.reqRewriteRules, objContentRewriteProfile.reqRewriteRules);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ContentRewriteProfile {\n");
      sb.append("    reqRewriteRules: ").append(toIndentedString(reqRewriteRules)).append("\n");
        sb.append("    rspRewriteRules: ").append(toIndentedString(rspRewriteRules)).append("\n");
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

