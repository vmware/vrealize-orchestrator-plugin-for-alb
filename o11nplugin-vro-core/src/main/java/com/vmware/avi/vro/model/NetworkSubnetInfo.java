package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The NetworkSubnetInfo is a POJO class extends AviRestResource that used for creating
 * NetworkSubnetInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NetworkSubnetInfo")
@VsoFinder(name = Constants.FINDER_VRO_NETWORKSUBNETINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NetworkSubnetInfo extends AviRestResource {
  @JsonProperty("free")
  @JsonInclude(Include.NON_NULL)
  private Integer free = null;

  @JsonProperty("network_name")
  @JsonInclude(Include.NON_NULL)
  private String networkName = null;

  @JsonProperty("network_uuid")
  @JsonInclude(Include.NON_NULL)
  private String networkUuid = null;

  @JsonProperty("subnet")
  @JsonInclude(Include.NON_NULL)
  private IpAddrPrefix subnet = null;

  @JsonProperty("total")
  @JsonInclude(Include.NON_NULL)
  private Integer total = null;

  @JsonProperty("used")
  @JsonInclude(Include.NON_NULL)
  private Integer used = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property free of obj type networksubnetinfo field type str  type integer.
   * @return free
   */
  @VsoMethod
  public Integer getFree() {
    return free;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property free of obj type networksubnetinfo field type str  type integer.
   * @param free set the free.
   */
  @VsoMethod
  public void setFree(Integer  free) {
    this.free = free;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property network_name of obj type networksubnetinfo field type str  type string.
   * @return networkName
   */
  @VsoMethod
  public String getNetworkName() {
    return networkName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property network_name of obj type networksubnetinfo field type str  type string.
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
   * Placeholder for description of property subnet of obj type networksubnetinfo field type str  type ref.
   * @return subnet
   */
  @VsoMethod
  public IpAddrPrefix getSubnet() {
    return subnet;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property subnet of obj type networksubnetinfo field type str  type ref.
   * @param subnet set the subnet.
   */
  @VsoMethod
  public void setSubnet(IpAddrPrefix subnet) {
    this.subnet = subnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property total of obj type networksubnetinfo field type str  type integer.
   * @return total
   */
  @VsoMethod
  public Integer getTotal() {
    return total;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property total of obj type networksubnetinfo field type str  type integer.
   * @param total set the total.
   */
  @VsoMethod
  public void setTotal(Integer  total) {
    this.total = total;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property used of obj type networksubnetinfo field type str  type integer.
   * @return used
   */
  @VsoMethod
  public Integer getUsed() {
    return used;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property used of obj type networksubnetinfo field type str  type integer.
   * @param used set the used.
   */
  @VsoMethod
  public void setUsed(Integer  used) {
    this.used = used;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NetworkSubnetInfo objNetworkSubnetInfo = (NetworkSubnetInfo) o;
  return   Objects.equals(this.subnet, objNetworkSubnetInfo.subnet)&&
  Objects.equals(this.used, objNetworkSubnetInfo.used)&&
  Objects.equals(this.networkUuid, objNetworkSubnetInfo.networkUuid)&&
  Objects.equals(this.free, objNetworkSubnetInfo.free)&&
  Objects.equals(this.total, objNetworkSubnetInfo.total)&&
  Objects.equals(this.networkName, objNetworkSubnetInfo.networkName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NetworkSubnetInfo {\n");
      sb.append("    free: ").append(toIndentedString(free)).append("\n");
        sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
        sb.append("    networkUuid: ").append(toIndentedString(networkUuid)).append("\n");
        sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

