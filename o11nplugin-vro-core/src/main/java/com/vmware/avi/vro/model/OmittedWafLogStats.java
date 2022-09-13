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
 * The OmittedWafLogStats is a POJO class extends AviRestResource that used for creating
 * OmittedWafLogStats.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OmittedWafLogStats")
@VsoFinder(name = Constants.FINDER_VRO_OMITTEDWAFLOGSTATS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OmittedWafLogStats extends AviRestResource {
    @JsonProperty("match_elements")
    @JsonInclude(Include.NON_NULL)
    private Integer matchElements = 0;

    @JsonProperty("rules")
    @JsonInclude(Include.NON_NULL)
    private Integer rules = 0;



  /**
   * This is the getter method this will return the attribute value.
   * The total count of omitted match element logs in all rules.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return matchElements
   */
  @VsoMethod
  public Integer getMatchElements() {
    return matchElements;
  }

  /**
   * This is the setter method to the attribute.
   * The total count of omitted match element logs in all rules.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param matchElements set the matchElements.
   */
  @VsoMethod
  public void setMatchElements(Integer  matchElements) {
    this.matchElements = matchElements;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The total count of omitted rule logs.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return rules
   */
  @VsoMethod
  public Integer getRules() {
    return rules;
  }

  /**
   * This is the setter method to the attribute.
   * The total count of omitted rule logs.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param rules set the rules.
   */
  @VsoMethod
  public void setRules(Integer  rules) {
    this.rules = rules;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OmittedWafLogStats objOmittedWafLogStats = (OmittedWafLogStats) o;
  return   Objects.equals(this.rules, objOmittedWafLogStats.rules)&&
  Objects.equals(this.matchElements, objOmittedWafLogStats.matchElements);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OmittedWafLogStats {\n");
      sb.append("    matchElements: ").append(toIndentedString(matchElements)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

