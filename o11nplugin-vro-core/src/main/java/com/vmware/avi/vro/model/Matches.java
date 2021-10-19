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
 * The Matches is a POJO class extends AviRestResource that used for creating
 * Matches.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Matches")
@VsoFinder(name = Constants.FINDER_VRO_MATCHES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Matches extends AviRestResource {
    @JsonProperty("match_element")
    @JsonInclude(Include.NON_NULL)
    private String matchElement = null;

    @JsonProperty("match_value")
    @JsonInclude(Include.NON_NULL)
    private String matchValue = null;



  /**
   * This is the getter method this will return the attribute value.
   * Matches in signature rule.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchElement
   */
  @VsoMethod
  public String getMatchElement() {
    return matchElement;
  }

  /**
   * This is the setter method to the attribute.
   * Matches in signature rule.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchElement set the matchElement.
   */
  @VsoMethod
  public void setMatchElement(String  matchElement) {
    this.matchElement = matchElement;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Match value in signature rule.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchValue
   */
  @VsoMethod
  public String getMatchValue() {
    return matchValue;
  }

  /**
   * This is the setter method to the attribute.
   * Match value in signature rule.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchValue set the matchValue.
   */
  @VsoMethod
  public void setMatchValue(String  matchValue) {
    this.matchValue = matchValue;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  Matches objMatches = (Matches) o;
  return   Objects.equals(this.matchElement, objMatches.matchElement)&&
  Objects.equals(this.matchValue, objMatches.matchValue);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Matches {\n");
      sb.append("    matchElement: ").append(toIndentedString(matchElement)).append("\n");
        sb.append("    matchValue: ").append(toIndentedString(matchValue)).append("\n");
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

