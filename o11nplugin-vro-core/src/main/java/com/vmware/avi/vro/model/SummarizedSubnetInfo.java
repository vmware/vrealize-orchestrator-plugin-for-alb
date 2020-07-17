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
 * The SummarizedSubnetInfo is a POJO class extends AviRestResource that used for creating
 * SummarizedSubnetInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SummarizedSubnetInfo")
@VsoFinder(name = Constants.FINDER_VRO_SUMMARIZEDSUBNETINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SummarizedSubnetInfo extends AviRestResource {
  @JsonProperty("cidr_prefix")
  @JsonInclude(Include.NON_NULL)
  private String cidrPrefix = null;

  @JsonProperty("network")
  @JsonInclude(Include.NON_NULL)
  private String network = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cidr_prefix of obj type summarizedsubnetinfo field type str  type string.
   * @return cidrPrefix
   */
  @VsoMethod
  public String getCidrPrefix() {
    return cidrPrefix;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cidr_prefix of obj type summarizedsubnetinfo field type str  type string.
   * @param cidrPrefix set the cidrPrefix.
   */
  @VsoMethod
  public void setCidrPrefix(String  cidrPrefix) {
    this.cidrPrefix = cidrPrefix;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property network of obj type summarizedsubnetinfo field type str  type string.
   * @return network
   */
  @VsoMethod
  public String getNetwork() {
    return network;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property network of obj type summarizedsubnetinfo field type str  type string.
   * @param network set the network.
   */
  @VsoMethod
  public void setNetwork(String  network) {
    this.network = network;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SummarizedSubnetInfo objSummarizedSubnetInfo = (SummarizedSubnetInfo) o;
  return   Objects.equals(this.cidrPrefix, objSummarizedSubnetInfo.cidrPrefix)&&
  Objects.equals(this.network, objSummarizedSubnetInfo.network);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SummarizedSubnetInfo {\n");
      sb.append("    cidrPrefix: ").append(toIndentedString(cidrPrefix)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
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

