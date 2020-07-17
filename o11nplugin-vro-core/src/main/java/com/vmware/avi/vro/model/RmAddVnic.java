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
 * The RmAddVnic is a POJO class extends AviRestResource that used for creating
 * RmAddVnic.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RmAddVnic")
@VsoFinder(name = Constants.FINDER_VRO_RMADDVNIC)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RmAddVnic extends AviRestResource {
  @JsonProperty("network_name")
  @JsonInclude(Include.NON_NULL)
  private String networkName = null;

  @JsonProperty("network_uuid")
  @JsonInclude(Include.NON_NULL)
  private String networkUuid = null;

  @JsonProperty("subnet")
  @JsonInclude(Include.NON_NULL)
  private String subnet = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property network_name of obj type rmaddvnic field type str  type string.
   * @return networkName
   */
  @VsoMethod
  public String getNetworkName() {
    return networkName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property network_name of obj type rmaddvnic field type str  type string.
   * @param networkName set the networkName.
   */
  @VsoMethod
  public void setNetworkName(String  networkName) {
    this.networkName = networkName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of network.
   * @return networkUuid
   */
  @VsoMethod
  public String getNetworkUuid() {
    return networkUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of network.
   * @param networkUuid set the networkUuid.
   */
  @VsoMethod
  public void setNetworkUuid(String  networkUuid) {
    this.networkUuid = networkUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property subnet of obj type rmaddvnic field type str  type string.
   * @return subnet
   */
  @VsoMethod
  public String getSubnet() {
    return subnet;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property subnet of obj type rmaddvnic field type str  type string.
   * @param subnet set the subnet.
   */
  @VsoMethod
  public void setSubnet(String  subnet) {
    this.subnet = subnet;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RmAddVnic objRmAddVnic = (RmAddVnic) o;
  return   Objects.equals(this.networkName, objRmAddVnic.networkName)&&
  Objects.equals(this.networkUuid, objRmAddVnic.networkUuid)&&
  Objects.equals(this.subnet, objRmAddVnic.subnet);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RmAddVnic {\n");
      sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
        sb.append("    networkUuid: ").append(toIndentedString(networkUuid)).append("\n");
        sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
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

