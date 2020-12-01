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
 * The StringMatch is a POJO class extends AviRestResource that used for creating
 * StringMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "StringMatch")
@VsoFinder(name = Constants.FINDER_VRO_STRINGMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class StringMatch extends AviRestResource {
    @JsonProperty("match_criteria")
    @JsonInclude(Include.NON_NULL)
    private String matchCriteria = null;

    @JsonProperty("match_str")
    @JsonInclude(Include.NON_NULL)
    private List<String> matchStr = null;

    @JsonProperty("string_group_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> stringGroupRefs = null;



  /**
   * This is the getter method this will return the attribute value.
   * Criterion to use for string matching the http request.
   * Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH,
   * REGEX_DOES_NOT_MATCH.
   * Allowed in basic(allowed values- begins_with,does_not_begin_with,contains,does_not_contain,ends_with,does_not_end_with,equals,does_not_equal)
   * edition, essentials(allowed values- begins_with,does_not_begin_with,contains,does_not_contain,ends_with,does_not_end_with,equals,does_not_equal)
   * edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchCriteria
   */
  @VsoMethod
  public String getMatchCriteria() {
    return matchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Criterion to use for string matching the http request.
   * Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH,
   * REGEX_DOES_NOT_MATCH.
   * Allowed in basic(allowed values- begins_with,does_not_begin_with,contains,does_not_contain,ends_with,does_not_end_with,equals,does_not_equal)
   * edition, essentials(allowed values- begins_with,does_not_begin_with,contains,does_not_contain,ends_with,does_not_end_with,equals,does_not_equal)
   * edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchCriteria set the matchCriteria.
   */
  @VsoMethod
  public void setMatchCriteria(String  matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * String value(s).
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchStr
   */
  @VsoMethod
  public List<String> getMatchStr() {
    return matchStr;
  }

  /**
   * This is the setter method. this will set the matchStr
   * String value(s).
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchStr
   */
  @VsoMethod
  public void setMatchStr(List<String>  matchStr) {
    this.matchStr = matchStr;
  }

  /**
   * This is the setter method this will set the matchStr
   * String value(s).
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchStr
   */
  @VsoMethod
  public StringMatch addMatchStrItem(String matchStrItem) {
    if (this.matchStr == null) {
      this.matchStr = new ArrayList<String>();
    }
    this.matchStr.add(matchStrItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the string group(s).
   * It is a reference to an object of type stringgroup.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringGroupRefs
   */
  @VsoMethod
  public List<String> getStringGroupRefs() {
    return stringGroupRefs;
  }

  /**
   * This is the setter method. this will set the stringGroupRefs
   * Uuid of the string group(s).
   * It is a reference to an object of type stringgroup.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringGroupRefs
   */
  @VsoMethod
  public void setStringGroupRefs(List<String>  stringGroupRefs) {
    this.stringGroupRefs = stringGroupRefs;
  }

  /**
   * This is the setter method this will set the stringGroupRefs
   * Uuid of the string group(s).
   * It is a reference to an object of type stringgroup.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringGroupRefs
   */
  @VsoMethod
  public StringMatch addStringGroupRefsItem(String stringGroupRefsItem) {
    if (this.stringGroupRefs == null) {
      this.stringGroupRefs = new ArrayList<String>();
    }
    this.stringGroupRefs.add(stringGroupRefsItem);
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
  StringMatch objStringMatch = (StringMatch) o;
  return   Objects.equals(this.matchCriteria, objStringMatch.matchCriteria)&&
  Objects.equals(this.matchStr, objStringMatch.matchStr)&&
  Objects.equals(this.stringGroupRefs, objStringMatch.stringGroupRefs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class StringMatch {\n");
      sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
        sb.append("    matchStr: ").append(toIndentedString(matchStr)).append("\n");
        sb.append("    stringGroupRefs: ").append(toIndentedString(stringGroupRefs)).append("\n");
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

