package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * IPReputationTypeMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IPReputationTypeMatch")
@VsoFinder(name = Constants.FINDER_VRO_IPREPUTATIONTYPEMATCH, idAccessor = "getObjectID()")
@Service
public class IPReputationTypeMatch extends AviRestResource  {
  @JsonProperty("match_operation")
  private String matchOperation = null;

  @JsonProperty("reputation_types")
  @Valid
  private List<String> reputationTypes = null;

  
  /**
   * Match criteria. Enum options - IS_IN, IS_NOT_IN. Field introduced in 20.1.1.
   * @return matchOperation
  **/
  @ApiModelProperty(required = true, value = "Match criteria. Enum options - IS_IN, IS_NOT_IN. Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getMatchOperation() {
    return matchOperation;
  }
    
  @VsoMethod
  public void setMatchOperation(String matchOperation) {
    this.matchOperation = matchOperation;
  }

  
  public IPReputationTypeMatch addReputationTypesItem(String reputationTypesItem) {
    if (this.reputationTypes == null) {
      this.reputationTypes = new ArrayList<String>();
    }
    this.reputationTypes.add(reputationTypesItem);
    return this;
  }
  
  /**
   * IP reputation type. Enum options - IP_REPUTATION_TYPE_SPAM_SOURCE, IP_REPUTATION_TYPE_WINDOWS_EXPLOITS, IP_REPUTATION_TYPE_WEB_ATTACKS, IP_REPUTATION_TYPE_BOTNETS, IP_REPUTATION_TYPE_SCANNERS, IP_REPUTATION_TYPE_DOS, IP_REPUTATION_TYPE_REPUTATION, IP_REPUTATION_TYPE_PHISHING, IP_REPUTATION_TYPE_PROXY, IP_REPUTATION_TYPE_CLOUD, IP_REPUTATION_TYPE_MOBILE_THREATS, IP_REPUTATION_TYPE_TOR, IP_REPUTATION_TYPE_ALL. Field introduced in 20.1.1.
   * @return reputationTypes
  **/
  @ApiModelProperty(value = "IP reputation type. Enum options - IP_REPUTATION_TYPE_SPAM_SOURCE, IP_REPUTATION_TYPE_WINDOWS_EXPLOITS, IP_REPUTATION_TYPE_WEB_ATTACKS, IP_REPUTATION_TYPE_BOTNETS, IP_REPUTATION_TYPE_SCANNERS, IP_REPUTATION_TYPE_DOS, IP_REPUTATION_TYPE_REPUTATION, IP_REPUTATION_TYPE_PHISHING, IP_REPUTATION_TYPE_PROXY, IP_REPUTATION_TYPE_CLOUD, IP_REPUTATION_TYPE_MOBILE_THREATS, IP_REPUTATION_TYPE_TOR, IP_REPUTATION_TYPE_ALL. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public List<String> getReputationTypes() {
    return reputationTypes;
  }
    
  @VsoMethod
  public void setReputationTypes(List<String> reputationTypes) {
    this.reputationTypes = reputationTypes;
  }

  
  public String getObjectID() {
		return "IPReputationTypeMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPReputationTypeMatch ipReputationTypeMatch = (IPReputationTypeMatch) o;
    return Objects.equals(this.matchOperation, ipReputationTypeMatch.matchOperation) &&
        Objects.equals(this.reputationTypes, ipReputationTypeMatch.reputationTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchOperation, reputationTypes);
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

