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
 * The VinfraPoolServerDeleteDetails is a POJO class extends AviRestResource that used for creating
 * VinfraPoolServerDeleteDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VinfraPoolServerDeleteDetails")
@VsoFinder(name = Constants.FINDER_VRO_VINFRAPOOLSERVERDELETEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VinfraPoolServerDeleteDetails extends AviRestResource {
  @JsonProperty("pool_name")
  @JsonInclude(Include.NON_NULL)
  private String poolName = null;

  @JsonProperty("server_ip")
  @JsonInclude(Include.NON_NULL)
  private List<String> serverIp = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property pool_name of obj type vinfrapoolserverdeletedetails field type str  type string.
   * @return poolName
   */
  @VsoMethod
  public String getPoolName() {
    return poolName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property pool_name of obj type vinfrapoolserverdeletedetails field type str  type string.
   * @param poolName set the poolName.
   */
  @VsoMethod
  public void setPoolName(String  poolName) {
    this.poolName = poolName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property server_ip of obj type vinfrapoolserverdeletedetails field type str  type array.
   * @return serverIp
   */
  @VsoMethod
  public List<String> getServerIp() {
    return serverIp;
  }

  /**
   * This is the setter method. this will set the serverIp
   * Placeholder for description of property server_ip of obj type vinfrapoolserverdeletedetails field type str  type array.
   * @return serverIp
   */
  @VsoMethod
  public void setServerIp(List<String>  serverIp) {
    this.serverIp = serverIp;
  }

  /**
   * This is the setter method this will set the serverIp
   * Placeholder for description of property server_ip of obj type vinfrapoolserverdeletedetails field type str  type array.
   * @return serverIp
   */
  @VsoMethod
  public VinfraPoolServerDeleteDetails addServerIpItem(String serverIpItem) {
    if (this.serverIp == null) {
      this.serverIp = new ArrayList<String>();
    }
    this.serverIp.add(serverIpItem);
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
  VinfraPoolServerDeleteDetails objVinfraPoolServerDeleteDetails = (VinfraPoolServerDeleteDetails) o;
  return   Objects.equals(this.poolName, objVinfraPoolServerDeleteDetails.poolName)&&
  Objects.equals(this.serverIp, objVinfraPoolServerDeleteDetails.serverIp);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VinfraPoolServerDeleteDetails {\n");
      sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
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

