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
 * The ApicAgentVsNetworkError is a POJO class extends AviRestResource that used for creating
 * ApicAgentVsNetworkError.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApicAgentVsNetworkError")
@VsoFinder(name = Constants.FINDER_VRO_APICAGENTVSNETWORKERROR)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApicAgentVsNetworkError extends AviRestResource {
  @JsonProperty("pool_name")
  @JsonInclude(Include.NON_NULL)
  private String poolName = null;

  @JsonProperty("pool_network")
  @JsonInclude(Include.NON_NULL)
  private String poolNetwork = null;

  @JsonProperty("vs_name")
  @JsonInclude(Include.NON_NULL)
  private String vsName = null;

  @JsonProperty("vs_network")
  @JsonInclude(Include.NON_NULL)
  private String vsNetwork = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property pool_name of obj type apicagentvsnetworkerror field type str  type string.
   * @return poolName
   */
  @VsoMethod
  public String getPoolName() {
    return poolName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property pool_name of obj type apicagentvsnetworkerror field type str  type string.
   * @param poolName set the poolName.
   */
  @VsoMethod
  public void setPoolName(String  poolName) {
    this.poolName = poolName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property pool_network of obj type apicagentvsnetworkerror field type str  type string.
   * @return poolNetwork
   */
  @VsoMethod
  public String getPoolNetwork() {
    return poolNetwork;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property pool_network of obj type apicagentvsnetworkerror field type str  type string.
   * @param poolNetwork set the poolNetwork.
   */
  @VsoMethod
  public void setPoolNetwork(String  poolNetwork) {
    this.poolNetwork = poolNetwork;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vs_name of obj type apicagentvsnetworkerror field type str  type string.
   * @return vsName
   */
  @VsoMethod
  public String getVsName() {
    return vsName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vs_name of obj type apicagentvsnetworkerror field type str  type string.
   * @param vsName set the vsName.
   */
  @VsoMethod
  public void setVsName(String  vsName) {
    this.vsName = vsName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vs_network of obj type apicagentvsnetworkerror field type str  type string.
   * @return vsNetwork
   */
  @VsoMethod
  public String getVsNetwork() {
    return vsNetwork;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vs_network of obj type apicagentvsnetworkerror field type str  type string.
   * @param vsNetwork set the vsNetwork.
   */
  @VsoMethod
  public void setVsNetwork(String  vsNetwork) {
    this.vsNetwork = vsNetwork;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ApicAgentVsNetworkError objApicAgentVsNetworkError = (ApicAgentVsNetworkError) o;
  return   Objects.equals(this.poolName, objApicAgentVsNetworkError.poolName)&&
  Objects.equals(this.vsName, objApicAgentVsNetworkError.vsName)&&
  Objects.equals(this.vsNetwork, objApicAgentVsNetworkError.vsNetwork)&&
  Objects.equals(this.poolNetwork, objApicAgentVsNetworkError.poolNetwork);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApicAgentVsNetworkError {\n");
      sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    poolNetwork: ").append(toIndentedString(poolNetwork)).append("\n");
        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
        sb.append("    vsNetwork: ").append(toIndentedString(vsNetwork)).append("\n");
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

