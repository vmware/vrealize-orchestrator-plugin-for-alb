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
 * The IPReputationTypeMatch is a POJO class extends AviRestResource that used for creating
 * IPReputationTypeMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IPReputationTypeMatch")
@VsoFinder(name = Constants.FINDER_VRO_IPREPUTATIONTYPEMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IPReputationTypeMatch extends AviRestResource {
    @JsonProperty("match_operation")
    @JsonInclude(Include.NON_NULL)
    private String matchOperation = null;

    @JsonProperty("reputation_types")
    @JsonInclude(Include.NON_NULL)
    private List<String> reputationTypes = null;



  /**
   * This is the getter method this will return the attribute value.
   * Match criteria.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchOperation
   */
  @VsoMethod
  public String getMatchOperation() {
    return matchOperation;
  }

  /**
   * This is the setter method to the attribute.
   * Match criteria.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchOperation set the matchOperation.
   */
  @VsoMethod
  public void setMatchOperation(String  matchOperation) {
    this.matchOperation = matchOperation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip reputation type.
   * Enum options - IP_REPUTATION_TYPE_SPAM_SOURCE, IP_REPUTATION_TYPE_WINDOWS_EXPLOITS, IP_REPUTATION_TYPE_WEB_ATTACKS, IP_REPUTATION_TYPE_BOTNETS,
   * IP_REPUTATION_TYPE_SCANNERS, IP_REPUTATION_TYPE_DOS, IP_REPUTATION_TYPE_REPUTATION, IP_REPUTATION_TYPE_PHISHING, IP_REPUTATION_TYPE_PROXY,
   * IP_REPUTATION_TYPE_CLOUD, IP_REPUTATION_TYPE_MOBILE_THREATS, IP_REPUTATION_TYPE_TOR, IP_REPUTATION_TYPE_ALL.
   * Field introduced in 20.1.1.
   * Minimum of 1 items required.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reputationTypes
   */
  @VsoMethod
  public List<String> getReputationTypes() {
    return reputationTypes;
  }

  /**
   * This is the setter method. this will set the reputationTypes
   * Ip reputation type.
   * Enum options - IP_REPUTATION_TYPE_SPAM_SOURCE, IP_REPUTATION_TYPE_WINDOWS_EXPLOITS, IP_REPUTATION_TYPE_WEB_ATTACKS, IP_REPUTATION_TYPE_BOTNETS,
   * IP_REPUTATION_TYPE_SCANNERS, IP_REPUTATION_TYPE_DOS, IP_REPUTATION_TYPE_REPUTATION, IP_REPUTATION_TYPE_PHISHING, IP_REPUTATION_TYPE_PROXY,
   * IP_REPUTATION_TYPE_CLOUD, IP_REPUTATION_TYPE_MOBILE_THREATS, IP_REPUTATION_TYPE_TOR, IP_REPUTATION_TYPE_ALL.
   * Field introduced in 20.1.1.
   * Minimum of 1 items required.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reputationTypes
   */
  @VsoMethod
  public void setReputationTypes(List<String>  reputationTypes) {
    this.reputationTypes = reputationTypes;
  }

  /**
   * This is the setter method this will set the reputationTypes
   * Ip reputation type.
   * Enum options - IP_REPUTATION_TYPE_SPAM_SOURCE, IP_REPUTATION_TYPE_WINDOWS_EXPLOITS, IP_REPUTATION_TYPE_WEB_ATTACKS, IP_REPUTATION_TYPE_BOTNETS,
   * IP_REPUTATION_TYPE_SCANNERS, IP_REPUTATION_TYPE_DOS, IP_REPUTATION_TYPE_REPUTATION, IP_REPUTATION_TYPE_PHISHING, IP_REPUTATION_TYPE_PROXY,
   * IP_REPUTATION_TYPE_CLOUD, IP_REPUTATION_TYPE_MOBILE_THREATS, IP_REPUTATION_TYPE_TOR, IP_REPUTATION_TYPE_ALL.
   * Field introduced in 20.1.1.
   * Minimum of 1 items required.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reputationTypes
   */
  @VsoMethod
  public IPReputationTypeMatch addReputationTypesItem(String reputationTypesItem) {
    if (this.reputationTypes == null) {
      this.reputationTypes = new ArrayList<String>();
    }
    this.reputationTypes.add(reputationTypesItem);
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
  IPReputationTypeMatch objIPReputationTypeMatch = (IPReputationTypeMatch) o;
  return   Objects.equals(this.matchOperation, objIPReputationTypeMatch.matchOperation)&&
  Objects.equals(this.reputationTypes, objIPReputationTypeMatch.reputationTypes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IPReputationTypeMatch {\n");
      sb.append("    matchOperation: ").append(toIndentedString(matchOperation)).append("\n");
        sb.append("    reputationTypes: ").append(toIndentedString(reputationTypes)).append("\n");
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

