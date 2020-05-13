package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * L4RuleProtocolMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "L4RuleProtocolMatch")
@VsoFinder(name = Constants.FINDER_VRO_L4RULEPROTOCOLMATCH, idAccessor = "getObjectID()")
@Service
public class L4RuleProtocolMatch extends AviRestResource  {
  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  @JsonProperty("protocol")
  private String protocol = null;

  
  /**
   * Criterion to use for transport protocol matching. Enum options - IS_IN, IS_NOT_IN. Field introduced in 17.2.7.
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "Criterion to use for transport protocol matching. Enum options - IS_IN, IS_NOT_IN. Field introduced in 17.2.7.")
  @NotNull


 
  @VsoMethod  
  public String getMatchCriteria() {
    return matchCriteria;
  }
    
  @VsoMethod
  public void setMatchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  
  /**
   * Transport protocol to match. Enum options - PROTOCOL_ICMP, PROTOCOL_TCP, PROTOCOL_UDP. Field introduced in 17.2.7.
   * @return protocol
  **/
  @ApiModelProperty(required = true, value = "Transport protocol to match. Enum options - PROTOCOL_ICMP, PROTOCOL_TCP, PROTOCOL_UDP. Field introduced in 17.2.7.")
  @NotNull


 
  @VsoMethod  
  public String getProtocol() {
    return protocol;
  }
    
  @VsoMethod
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  
  public String getObjectID() {
		return "L4RuleProtocolMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L4RuleProtocolMatch l4RuleProtocolMatch = (L4RuleProtocolMatch) o;
    return Objects.equals(this.matchCriteria, l4RuleProtocolMatch.matchCriteria) &&
        Objects.equals(this.protocol, l4RuleProtocolMatch.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCriteria, protocol);
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

