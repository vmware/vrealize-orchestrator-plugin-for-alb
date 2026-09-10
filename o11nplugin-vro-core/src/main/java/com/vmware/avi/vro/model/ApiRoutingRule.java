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
 * The ApiRoutingRule is a POJO class extends AviRestResource that used for creating
 * ApiRoutingRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApiRoutingRule")
@VsoFinder(name = Constants.FINDER_VRO_APIROUTINGRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApiRoutingRule extends AviRestResource {
    @JsonProperty("matches")
    @JsonInclude(Include.NON_NULL)
    private MatchTarget matches;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;



  /**
   * This is the getter method this will return the attribute value.
   * Match criteria containing only header matches for routing.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matches
   */
  @VsoMethod
  public MatchTarget getMatches() {
    return matches;
  }

  /**
   * This is the setter method to the attribute.
   * Match criteria containing only header matches for routing.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matches set the matches.
   */
  @VsoMethod
  public void setMatches(MatchTarget matches) {
    this.matches = matches;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name for the routing rule.
   * Must be unique within api_routing_info.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name for the routing rule.
   * Must be unique within api_routing_info.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
  ApiRoutingRule objApiRoutingRule = (ApiRoutingRule) o;
  return   Objects.equals(this.name, objApiRoutingRule.name)&&
  Objects.equals(this.matches, objApiRoutingRule.matches);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApiRoutingRule {\n");
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

