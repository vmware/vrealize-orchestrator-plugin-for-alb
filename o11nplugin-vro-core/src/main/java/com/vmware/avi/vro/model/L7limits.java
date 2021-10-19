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
 * The L7limits is a POJO class extends AviRestResource that used for creating
 * L7limits.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "L7limits")
@VsoFinder(name = Constants.FINDER_VRO_L7LIMITS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class L7limits extends AviRestResource {
    @JsonProperty("http_policies_per_vs")
    @JsonInclude(Include.NON_NULL)
    private Integer httpPoliciesPerVs = null;

    @JsonProperty("num_compression_filters")
    @JsonInclude(Include.NON_NULL)
    private Integer numCompressionFilters = null;

    @JsonProperty("num_custom_str")
    @JsonInclude(Include.NON_NULL)
    private Integer numCustomStr = null;

    @JsonProperty("num_matches_per_rule")
    @JsonInclude(Include.NON_NULL)
    private Integer numMatchesPerRule = null;

    @JsonProperty("num_rules_per_http_policy")
    @JsonInclude(Include.NON_NULL)
    private Integer numRulesPerHttpPolicy = null;

    @JsonProperty("num_strgroups_per_match")
    @JsonInclude(Include.NON_NULL)
    private Integer numStrgroupsPerMatch = null;

    @JsonProperty("str_cache_mime")
    @JsonInclude(Include.NON_NULL)
    private Integer strCacheMime = null;

    @JsonProperty("str_groups_cache_mime")
    @JsonInclude(Include.NON_NULL)
    private Integer strGroupsCacheMime = null;

    @JsonProperty("str_groups_no_cache_mime")
    @JsonInclude(Include.NON_NULL)
    private Integer strGroupsNoCacheMime = null;

    @JsonProperty("str_groups_no_cache_uri")
    @JsonInclude(Include.NON_NULL)
    private Integer strGroupsNoCacheUri = null;

    @JsonProperty("str_no_cache_mime")
    @JsonInclude(Include.NON_NULL)
    private Integer strNoCacheMime = null;

    @JsonProperty("str_no_cache_uri")
    @JsonInclude(Include.NON_NULL)
    private Integer strNoCacheUri = null;



  /**
   * This is the getter method this will return the attribute value.
   * Number of httppolicies attached to a vs.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpPoliciesPerVs
   */
  @VsoMethod
  public Integer getHttpPoliciesPerVs() {
    return httpPoliciesPerVs;
  }

  /**
   * This is the setter method to the attribute.
   * Number of httppolicies attached to a vs.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param httpPoliciesPerVs set the httpPoliciesPerVs.
   */
  @VsoMethod
  public void setHttpPoliciesPerVs(Integer  httpPoliciesPerVs) {
    this.httpPoliciesPerVs = httpPoliciesPerVs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of compression filters.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numCompressionFilters
   */
  @VsoMethod
  public Integer getNumCompressionFilters() {
    return numCompressionFilters;
  }

  /**
   * This is the setter method to the attribute.
   * Number of compression filters.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numCompressionFilters set the numCompressionFilters.
   */
  @VsoMethod
  public void setNumCompressionFilters(Integer  numCompressionFilters) {
    this.numCompressionFilters = numCompressionFilters;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of custom strings per match/action.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numCustomStr
   */
  @VsoMethod
  public Integer getNumCustomStr() {
    return numCustomStr;
  }

  /**
   * This is the setter method to the attribute.
   * Number of custom strings per match/action.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numCustomStr set the numCustomStr.
   */
  @VsoMethod
  public void setNumCustomStr(Integer  numCustomStr) {
    this.numCustomStr = numCustomStr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of matches per rule.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numMatchesPerRule
   */
  @VsoMethod
  public Integer getNumMatchesPerRule() {
    return numMatchesPerRule;
  }

  /**
   * This is the setter method to the attribute.
   * Number of matches per rule.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numMatchesPerRule set the numMatchesPerRule.
   */
  @VsoMethod
  public void setNumMatchesPerRule(Integer  numMatchesPerRule) {
    this.numMatchesPerRule = numMatchesPerRule;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of rules per httprequest/httpresponse/httpsecurity policy.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numRulesPerHttpPolicy
   */
  @VsoMethod
  public Integer getNumRulesPerHttpPolicy() {
    return numRulesPerHttpPolicy;
  }

  /**
   * This is the setter method to the attribute.
   * Number of rules per httprequest/httpresponse/httpsecurity policy.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numRulesPerHttpPolicy set the numRulesPerHttpPolicy.
   */
  @VsoMethod
  public void setNumRulesPerHttpPolicy(Integer  numRulesPerHttpPolicy) {
    this.numRulesPerHttpPolicy = numRulesPerHttpPolicy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of stringgroups/ipgroups per match.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numStrgroupsPerMatch
   */
  @VsoMethod
  public Integer getNumStrgroupsPerMatch() {
    return numStrgroupsPerMatch;
  }

  /**
   * This is the setter method to the attribute.
   * Number of stringgroups/ipgroups per match.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numStrgroupsPerMatch set the numStrgroupsPerMatch.
   */
  @VsoMethod
  public void setNumStrgroupsPerMatch(Integer  numStrgroupsPerMatch) {
    this.numStrgroupsPerMatch = numStrgroupsPerMatch;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of implicit strings for cacheable mime types.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return strCacheMime
   */
  @VsoMethod
  public Integer getStrCacheMime() {
    return strCacheMime;
  }

  /**
   * This is the setter method to the attribute.
   * Number of implicit strings for cacheable mime types.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param strCacheMime set the strCacheMime.
   */
  @VsoMethod
  public void setStrCacheMime(Integer  strCacheMime) {
    this.strCacheMime = strCacheMime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of string groups for cacheable mime types.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return strGroupsCacheMime
   */
  @VsoMethod
  public Integer getStrGroupsCacheMime() {
    return strGroupsCacheMime;
  }

  /**
   * This is the setter method to the attribute.
   * Number of string groups for cacheable mime types.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param strGroupsCacheMime set the strGroupsCacheMime.
   */
  @VsoMethod
  public void setStrGroupsCacheMime(Integer  strGroupsCacheMime) {
    this.strGroupsCacheMime = strGroupsCacheMime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of string groups for non cacheable mime types.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return strGroupsNoCacheMime
   */
  @VsoMethod
  public Integer getStrGroupsNoCacheMime() {
    return strGroupsNoCacheMime;
  }

  /**
   * This is the setter method to the attribute.
   * Number of string groups for non cacheable mime types.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param strGroupsNoCacheMime set the strGroupsNoCacheMime.
   */
  @VsoMethod
  public void setStrGroupsNoCacheMime(Integer  strGroupsNoCacheMime) {
    this.strGroupsNoCacheMime = strGroupsNoCacheMime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of string groups for non cacheable uri.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return strGroupsNoCacheUri
   */
  @VsoMethod
  public Integer getStrGroupsNoCacheUri() {
    return strGroupsNoCacheUri;
  }

  /**
   * This is the setter method to the attribute.
   * Number of string groups for non cacheable uri.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param strGroupsNoCacheUri set the strGroupsNoCacheUri.
   */
  @VsoMethod
  public void setStrGroupsNoCacheUri(Integer  strGroupsNoCacheUri) {
    this.strGroupsNoCacheUri = strGroupsNoCacheUri;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of implicit strings for non cacheable mime types.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return strNoCacheMime
   */
  @VsoMethod
  public Integer getStrNoCacheMime() {
    return strNoCacheMime;
  }

  /**
   * This is the setter method to the attribute.
   * Number of implicit strings for non cacheable mime types.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param strNoCacheMime set the strNoCacheMime.
   */
  @VsoMethod
  public void setStrNoCacheMime(Integer  strNoCacheMime) {
    this.strNoCacheMime = strNoCacheMime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of implicit strings for non cacheable uri.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return strNoCacheUri
   */
  @VsoMethod
  public Integer getStrNoCacheUri() {
    return strNoCacheUri;
  }

  /**
   * This is the setter method to the attribute.
   * Number of implicit strings for non cacheable uri.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param strNoCacheUri set the strNoCacheUri.
   */
  @VsoMethod
  public void setStrNoCacheUri(Integer  strNoCacheUri) {
    this.strNoCacheUri = strNoCacheUri;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  L7limits objL7limits = (L7limits) o;
  return   Objects.equals(this.numCompressionFilters, objL7limits.numCompressionFilters)&&
  Objects.equals(this.strGroupsCacheMime, objL7limits.strGroupsCacheMime)&&
  Objects.equals(this.strGroupsNoCacheMime, objL7limits.strGroupsNoCacheMime)&&
  Objects.equals(this.strGroupsNoCacheUri, objL7limits.strGroupsNoCacheUri)&&
  Objects.equals(this.strCacheMime, objL7limits.strCacheMime)&&
  Objects.equals(this.strNoCacheMime, objL7limits.strNoCacheMime)&&
  Objects.equals(this.strNoCacheUri, objL7limits.strNoCacheUri)&&
  Objects.equals(this.httpPoliciesPerVs, objL7limits.httpPoliciesPerVs)&&
  Objects.equals(this.numRulesPerHttpPolicy, objL7limits.numRulesPerHttpPolicy)&&
  Objects.equals(this.numMatchesPerRule, objL7limits.numMatchesPerRule)&&
  Objects.equals(this.numStrgroupsPerMatch, objL7limits.numStrgroupsPerMatch)&&
  Objects.equals(this.numCustomStr, objL7limits.numCustomStr);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class L7limits {\n");
      sb.append("    httpPoliciesPerVs: ").append(toIndentedString(httpPoliciesPerVs)).append("\n");
        sb.append("    numCompressionFilters: ").append(toIndentedString(numCompressionFilters)).append("\n");
        sb.append("    numCustomStr: ").append(toIndentedString(numCustomStr)).append("\n");
        sb.append("    numMatchesPerRule: ").append(toIndentedString(numMatchesPerRule)).append("\n");
        sb.append("    numRulesPerHttpPolicy: ").append(toIndentedString(numRulesPerHttpPolicy)).append("\n");
        sb.append("    numStrgroupsPerMatch: ").append(toIndentedString(numStrgroupsPerMatch)).append("\n");
        sb.append("    strCacheMime: ").append(toIndentedString(strCacheMime)).append("\n");
        sb.append("    strGroupsCacheMime: ").append(toIndentedString(strGroupsCacheMime)).append("\n");
        sb.append("    strGroupsNoCacheMime: ").append(toIndentedString(strGroupsNoCacheMime)).append("\n");
        sb.append("    strGroupsNoCacheUri: ").append(toIndentedString(strGroupsNoCacheUri)).append("\n");
        sb.append("    strNoCacheMime: ").append(toIndentedString(strNoCacheMime)).append("\n");
        sb.append("    strNoCacheUri: ").append(toIndentedString(strNoCacheUri)).append("\n");
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

