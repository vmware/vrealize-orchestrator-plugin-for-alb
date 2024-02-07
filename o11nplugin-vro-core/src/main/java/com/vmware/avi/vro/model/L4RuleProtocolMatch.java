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
 * The L4RuleProtocolMatch is a POJO class extends AviRestResource that used for creating
 * L4RuleProtocolMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "L4RuleProtocolMatch")
@VsoFinder(name = Constants.FINDER_VRO_L4RULEPROTOCOLMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class L4RuleProtocolMatch extends AviRestResource {
    @JsonProperty("match_criteria")
    @JsonInclude(Include.NON_NULL)
    private String matchCriteria;

    @JsonProperty("protocol")
    @JsonInclude(Include.NON_NULL)
    private String protocol;



  /**
   * This is the getter method this will return the attribute value.
   * Criterion to use for transport protocol matching.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchCriteria
   */
  @VsoMethod
  public String getMatchCriteria() {
    return matchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Criterion to use for transport protocol matching.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchCriteria set the matchCriteria.
   */
  @VsoMethod
  public void setMatchCriteria(String  matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Transport protocol to match.
   * Enum options - PROTOCOL_ICMP, PROTOCOL_TCP, PROTOCOL_UDP, PROTOCOL_SCTP.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return protocol
   */
  @VsoMethod
  public String getProtocol() {
    return protocol;
  }

  /**
   * This is the setter method to the attribute.
   * Transport protocol to match.
   * Enum options - PROTOCOL_ICMP, PROTOCOL_TCP, PROTOCOL_UDP, PROTOCOL_SCTP.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param protocol set the protocol.
   */
  @VsoMethod
  public void setProtocol(String  protocol) {
    this.protocol = protocol;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  L4RuleProtocolMatch objL4RuleProtocolMatch = (L4RuleProtocolMatch) o;
  return   Objects.equals(this.matchCriteria, objL4RuleProtocolMatch.matchCriteria)&&
  Objects.equals(this.protocol, objL4RuleProtocolMatch.protocol);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class L4RuleProtocolMatch {\n");
      sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

