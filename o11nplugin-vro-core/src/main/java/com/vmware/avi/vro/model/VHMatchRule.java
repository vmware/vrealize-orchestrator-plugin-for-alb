package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.MatchTarget;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VHMatchRule is a POJO class extends AviRestResource that used for creating
 * VHMatchRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VHMatchRule")
@VsoFinder(name = Constants.FINDER_VRO_VHMATCHRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VHMatchRule extends AviRestResource {
    @JsonProperty("matches")
    @JsonInclude(Include.NON_NULL)
    private MatchTarget matches = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;



  /**
   * This is the getter method this will return the attribute value.
   * Match criteria for selecting the virtual service.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matches
   */
  @VsoMethod
  public MatchTarget getMatches() {
    return matches;
  }

  /**
   * This is the setter method to the attribute.
   * Match criteria for selecting the virtual service.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matches set the matches.
   */
  @VsoMethod
  public void setMatches(MatchTarget matches) {
    this.matches = matches;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name for the match rule.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name for the match rule.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VHMatchRule objVHMatchRule = (VHMatchRule) o;
  return   Objects.equals(this.name, objVHMatchRule.name)&&
  Objects.equals(this.matches, objVHMatchRule.matches);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VHMatchRule {\n");
      sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

