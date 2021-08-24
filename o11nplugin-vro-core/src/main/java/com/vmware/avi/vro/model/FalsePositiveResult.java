package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.HeaderInfoInURI;
import com.vmware.avi.vro.model.ParamsInURI;
import com.vmware.avi.vro.model.RuleInfo;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The FalsePositiveResult is a POJO class extends AviRestResource that used for creating
 * FalsePositiveResult.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "FalsePositiveResult")
@VsoFinder(name = Constants.FINDER_VRO_FALSEPOSITIVERESULT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class FalsePositiveResult extends AviRestResource {
    @JsonProperty("always_fail")
    @JsonInclude(Include.NON_NULL)
    private Boolean alwaysFail = null;

    @JsonProperty("attack")
    @JsonInclude(Include.NON_NULL)
    private Boolean attack = null;

    @JsonProperty("confidence")
    @JsonInclude(Include.NON_NULL)
    private Float confidence = null;

    @JsonProperty("false_positive")
    @JsonInclude(Include.NON_NULL)
    private Boolean falsePositive = null;

    @JsonProperty("header_info")
    @JsonInclude(Include.NON_NULL)
    private HeaderInfoInURI headerInfo = null;

    @JsonProperty("http_method")
    @JsonInclude(Include.NON_NULL)
    private String httpMethod = null;

    @JsonProperty("not_sure")
    @JsonInclude(Include.NON_NULL)
    private Boolean notSure = null;

    @JsonProperty("params_info")
    @JsonInclude(Include.NON_NULL)
    private ParamsInURI paramsInfo = null;

    @JsonProperty("rule_info")
    @JsonInclude(Include.NON_NULL)
    private RuleInfo ruleInfo = null;

    @JsonProperty("sometimes_fail")
    @JsonInclude(Include.NON_NULL)
    private Boolean sometimesFail = null;

    @JsonProperty("uri")
    @JsonInclude(Include.NON_NULL)
    private String uri = null;



  /**
   * This is the getter method this will return the attribute value.
   * Whether this uri is always fail.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return alwaysFail
   */
  @VsoMethod
  public Boolean getAlwaysFail() {
    return alwaysFail;
  }

  /**
   * This is the setter method to the attribute.
   * Whether this uri is always fail.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param alwaysFail set the alwaysFail.
   */
  @VsoMethod
  public void setAlwaysFail(Boolean  alwaysFail) {
    this.alwaysFail = alwaysFail;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This flag indicates whether this result is identifying an attack.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attack
   */
  @VsoMethod
  public Boolean getAttack() {
    return attack;
  }

  /**
   * This is the setter method to the attribute.
   * This flag indicates whether this result is identifying an attack.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param attack set the attack.
   */
  @VsoMethod
  public void setAttack(Boolean  attack) {
    this.attack = attack;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Confidence on false positive detection.
   * Allowed values are 0-100.
   * Field introduced in 21.1.1.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return confidence
   */
  @VsoMethod
  public Float getConfidence() {
    return confidence;
  }

  /**
   * This is the setter method to the attribute.
   * Confidence on false positive detection.
   * Allowed values are 0-100.
   * Field introduced in 21.1.1.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param confidence set the confidence.
   */
  @VsoMethod
  public void setConfidence(Float  confidence) {
    this.confidence = confidence;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This flag indicates whether this result is identifying a false positive.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return falsePositive
   */
  @VsoMethod
  public Boolean getFalsePositive() {
    return falsePositive;
  }

  /**
   * This is the setter method to the attribute.
   * This flag indicates whether this result is identifying a false positive.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param falsePositive set the falsePositive.
   */
  @VsoMethod
  public void setFalsePositive(Boolean  falsePositive) {
    this.falsePositive = falsePositive;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Header info if uri hit signature rule and match element is request_headers.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return headerInfo
   */
  @VsoMethod
  public HeaderInfoInURI getHeaderInfo() {
    return headerInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Header info if uri hit signature rule and match element is request_headers.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param headerInfo set the headerInfo.
   */
  @VsoMethod
  public void setHeaderInfo(HeaderInfoInURI headerInfo) {
    this.headerInfo = headerInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http method for uris did false positive detection.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpMethod
   */
  @VsoMethod
  public String getHttpMethod() {
    return httpMethod;
  }

  /**
   * This is the setter method to the attribute.
   * Http method for uris did false positive detection.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param httpMethod set the httpMethod.
   */
  @VsoMethod
  public void setHttpMethod(String  httpMethod) {
    this.httpMethod = httpMethod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This flag indicates that system is not confident about this result.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return notSure
   */
  @VsoMethod
  public Boolean getNotSure() {
    return notSure;
  }

  /**
   * This is the setter method to the attribute.
   * This flag indicates that system is not confident about this result.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param notSure set the notSure.
   */
  @VsoMethod
  public void setNotSure(Boolean  notSure) {
    this.notSure = notSure;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Params info if uri hit signature rule and match element is args.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return paramsInfo
   */
  @VsoMethod
  public ParamsInURI getParamsInfo() {
    return paramsInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Params info if uri hit signature rule and match element is args.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param paramsInfo set the paramsInfo.
   */
  @VsoMethod
  public void setParamsInfo(ParamsInURI paramsInfo) {
    this.paramsInfo = paramsInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Signature rule info hitted by uri.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ruleInfo
   */
  @VsoMethod
  public RuleInfo getRuleInfo() {
    return ruleInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Signature rule info hitted by uri.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ruleInfo set the ruleInfo.
   */
  @VsoMethod
  public void setRuleInfo(RuleInfo ruleInfo) {
    this.ruleInfo = ruleInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Whether this uri is sometimes fail.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sometimesFail
   */
  @VsoMethod
  public Boolean getSometimesFail() {
    return sometimesFail;
  }

  /**
   * This is the setter method to the attribute.
   * Whether this uri is sometimes fail.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sometimesFail set the sometimesFail.
   */
  @VsoMethod
  public void setSometimesFail(Boolean  sometimesFail) {
    this.sometimesFail = sometimesFail;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uris did false positive detection.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uri
   */
  @VsoMethod
  public String getUri() {
    return uri;
  }

  /**
   * This is the setter method to the attribute.
   * Uris did false positive detection.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uri set the uri.
   */
  @VsoMethod
  public void setUri(String  uri) {
    this.uri = uri;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  FalsePositiveResult objFalsePositiveResult = (FalsePositiveResult) o;
  return   Objects.equals(this.falsePositive, objFalsePositiveResult.falsePositive)&&
  Objects.equals(this.attack, objFalsePositiveResult.attack)&&
  Objects.equals(this.notSure, objFalsePositiveResult.notSure)&&
  Objects.equals(this.uri, objFalsePositiveResult.uri)&&
  Objects.equals(this.paramsInfo, objFalsePositiveResult.paramsInfo)&&
  Objects.equals(this.ruleInfo, objFalsePositiveResult.ruleInfo)&&
  Objects.equals(this.confidence, objFalsePositiveResult.confidence)&&
  Objects.equals(this.headerInfo, objFalsePositiveResult.headerInfo)&&
  Objects.equals(this.httpMethod, objFalsePositiveResult.httpMethod)&&
  Objects.equals(this.alwaysFail, objFalsePositiveResult.alwaysFail)&&
  Objects.equals(this.sometimesFail, objFalsePositiveResult.sometimesFail);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class FalsePositiveResult {\n");
      sb.append("    alwaysFail: ").append(toIndentedString(alwaysFail)).append("\n");
        sb.append("    attack: ").append(toIndentedString(attack)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    falsePositive: ").append(toIndentedString(falsePositive)).append("\n");
        sb.append("    headerInfo: ").append(toIndentedString(headerInfo)).append("\n");
        sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
        sb.append("    notSure: ").append(toIndentedString(notSure)).append("\n");
        sb.append("    paramsInfo: ").append(toIndentedString(paramsInfo)).append("\n");
        sb.append("    ruleInfo: ").append(toIndentedString(ruleInfo)).append("\n");
        sb.append("    sometimesFail: ").append(toIndentedString(sometimesFail)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

