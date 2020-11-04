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
 * The WafExclusionType is a POJO class extends AviRestResource that used for creating
 * WafExclusionType.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafExclusionType")
@VsoFinder(name = Constants.FINDER_VRO_WAFEXCLUSIONTYPE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafExclusionType extends AviRestResource {
    @JsonProperty("match_case")
    @JsonInclude(Include.NON_NULL)
    private String matchCase = "SENSITIVE";

    @JsonProperty("match_op")
    @JsonInclude(Include.NON_NULL)
    private String matchOp = "EQUALS";



  /**
   * This is the getter method this will return the attribute value.
   * Case sensitivity to use for the matching.
   * Enum options - SENSITIVE, INSENSITIVE.
   * Field introduced in 17.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SENSITIVE".
   * @return matchCase
   */
  @VsoMethod
  public String getMatchCase() {
    return matchCase;
  }

  /**
   * This is the setter method to the attribute.
   * Case sensitivity to use for the matching.
   * Enum options - SENSITIVE, INSENSITIVE.
   * Field introduced in 17.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SENSITIVE".
   * @param matchCase set the matchCase.
   */
  @VsoMethod
  public void setMatchCase(String  matchCase) {
    this.matchCase = matchCase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * String operation to use for matching the exclusion.
   * Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH,
   * REGEX_DOES_NOT_MATCH.
   * Field introduced in 17.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as "EQUALS".
   * @return matchOp
   */
  @VsoMethod
  public String getMatchOp() {
    return matchOp;
  }

  /**
   * This is the setter method to the attribute.
   * String operation to use for matching the exclusion.
   * Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH,
   * REGEX_DOES_NOT_MATCH.
   * Field introduced in 17.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as "EQUALS".
   * @param matchOp set the matchOp.
   */
  @VsoMethod
  public void setMatchOp(String  matchOp) {
    this.matchOp = matchOp;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  WafExclusionType objWafExclusionType = (WafExclusionType) o;
  return   Objects.equals(this.matchOp, objWafExclusionType.matchOp)&&
  Objects.equals(this.matchCase, objWafExclusionType.matchCase);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafExclusionType {\n");
      sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
        sb.append("    matchOp: ").append(toIndentedString(matchOp)).append("\n");
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

