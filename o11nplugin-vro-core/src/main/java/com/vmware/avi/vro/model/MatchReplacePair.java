package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ReplaceStringVar;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The MatchReplacePair is a POJO class extends AviRestResource that used for creating
 * MatchReplacePair.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MatchReplacePair")
@VsoFinder(name = Constants.FINDER_VRO_MATCHREPLACEPAIR)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MatchReplacePair extends AviRestResource {
    @JsonProperty("match_string")
    @JsonInclude(Include.NON_NULL)
    private String matchString = null;

    @JsonProperty("replacement_string")
    @JsonInclude(Include.NON_NULL)
    private ReplaceStringVar replacementString = null;



  /**
   * This is the getter method this will return the attribute value.
   * String to be matched.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchString
   */
  @VsoMethod
  public String getMatchString() {
    return matchString;
  }

  /**
   * This is the setter method to the attribute.
   * String to be matched.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchString set the matchString.
   */
  @VsoMethod
  public void setMatchString(String  matchString) {
    this.matchString = matchString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Replacement string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return replacementString
   */
  @VsoMethod
  public ReplaceStringVar getReplacementString() {
    return replacementString;
  }

  /**
   * This is the setter method to the attribute.
   * Replacement string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param replacementString set the replacementString.
   */
  @VsoMethod
  public void setReplacementString(ReplaceStringVar replacementString) {
    this.replacementString = replacementString;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MatchReplacePair objMatchReplacePair = (MatchReplacePair) o;
  return   Objects.equals(this.matchString, objMatchReplacePair.matchString)&&
  Objects.equals(this.replacementString, objMatchReplacePair.replacementString);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MatchReplacePair {\n");
      sb.append("    matchString: ").append(toIndentedString(matchString)).append("\n");
        sb.append("    replacementString: ").append(toIndentedString(replacementString)).append("\n");
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

