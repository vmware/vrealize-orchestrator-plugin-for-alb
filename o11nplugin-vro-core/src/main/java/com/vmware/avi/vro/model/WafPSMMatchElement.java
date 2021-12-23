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
 * The WafPSMMatchElement is a POJO class extends AviRestResource that used for creating
 * WafPSMMatchElement.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafPSMMatchElement")
@VsoFinder(name = Constants.FINDER_VRO_WAFPSMMATCHELEMENT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafPSMMatchElement extends AviRestResource {
    @JsonProperty("excluded")
    @JsonInclude(Include.NON_NULL)
    private Boolean excluded = false;

    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index = null;

    @JsonProperty("match_case")
    @JsonInclude(Include.NON_NULL)
    private String matchCase = "INSENSITIVE";

    @JsonProperty("match_op")
    @JsonInclude(Include.NON_NULL)
    private String matchOp = "EQUALS";

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("sub_element")
    @JsonInclude(Include.NON_NULL)
    private String subElement = null;



  /**
   * This is the getter method this will return the attribute value.
   * Mark this element excluded, like in '!args password'.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return excluded
   */
  @VsoMethod
  public Boolean getExcluded() {
    return excluded;
  }

  /**
   * This is the setter method to the attribute.
   * Mark this element excluded, like in '!args password'.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param excluded set the excluded.
   */
  @VsoMethod
  public void setExcluded(Boolean  excluded) {
    this.excluded = excluded;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Match_element index.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Match_element index.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Case sensitivity of match_op operation.
   * Enum options - SENSITIVE, INSENSITIVE.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as "INSENSITIVE".
   * @return matchCase
   */
  @VsoMethod
  public String getMatchCase() {
    return matchCase;
  }

  /**
   * This is the setter method to the attribute.
   * Case sensitivity of match_op operation.
   * Enum options - SENSITIVE, INSENSITIVE.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as "INSENSITIVE".
   * @param matchCase set the matchCase.
   */
  @VsoMethod
  public void setMatchCase(String  matchCase) {
    this.matchCase = matchCase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * String operation to use for matching the sub_element.
   * Default is equals.
   * Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH,
   * REGEX_DOES_NOT_MATCH.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as "EQUALS".
   * @return matchOp
   */
  @VsoMethod
  public String getMatchOp() {
    return matchOp;
  }

  /**
   * This is the setter method to the attribute.
   * String operation to use for matching the sub_element.
   * Default is equals.
   * Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH,
   * REGEX_DOES_NOT_MATCH.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as "EQUALS".
   * @param matchOp set the matchOp.
   */
  @VsoMethod
  public void setMatchOp(String  matchOp) {
    this.matchOp = matchOp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The variable specification.
   * For example args or request_cookies.
   * This can be a scalar like path_info.
   * Enum options - WAF_VARIABLE_ARGS, WAF_VARIABLE_ARGS_GET, WAF_VARIABLE_ARGS_POST, WAF_VARIABLE_ARGS_NAMES, WAF_VARIABLE_REQUEST_COOKIES,
   * WAF_VARIABLE_QUERY_STRING, WAF_VARIABLE_REQUEST_BASENAME, WAF_VARIABLE_REQUEST_URI, WAF_VARIABLE_PATH_INFO.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * The variable specification.
   * For example args or request_cookies.
   * This can be a scalar like path_info.
   * Enum options - WAF_VARIABLE_ARGS, WAF_VARIABLE_ARGS_GET, WAF_VARIABLE_ARGS_POST, WAF_VARIABLE_ARGS_NAMES, WAF_VARIABLE_REQUEST_COOKIES,
   * WAF_VARIABLE_QUERY_STRING, WAF_VARIABLE_REQUEST_BASENAME, WAF_VARIABLE_REQUEST_URI, WAF_VARIABLE_PATH_INFO.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of the request collection element.
   * This can be empty, if we address the whole collection or a scalar element.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subElement
   */
  @VsoMethod
  public String getSubElement() {
    return subElement;
  }

  /**
   * This is the setter method to the attribute.
   * The name of the request collection element.
   * This can be empty, if we address the whole collection or a scalar element.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subElement set the subElement.
   */
  @VsoMethod
  public void setSubElement(String  subElement) {
    this.subElement = subElement;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  WafPSMMatchElement objWafPSMMatchElement = (WafPSMMatchElement) o;
  return   Objects.equals(this.index, objWafPSMMatchElement.index)&&
  Objects.equals(this.name, objWafPSMMatchElement.name)&&
  Objects.equals(this.subElement, objWafPSMMatchElement.subElement)&&
  Objects.equals(this.excluded, objWafPSMMatchElement.excluded)&&
  Objects.equals(this.matchOp, objWafPSMMatchElement.matchOp)&&
  Objects.equals(this.matchCase, objWafPSMMatchElement.matchCase);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafPSMMatchElement {\n");
      sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
        sb.append("    matchOp: ").append(toIndentedString(matchOp)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    subElement: ").append(toIndentedString(subElement)).append("\n");
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

