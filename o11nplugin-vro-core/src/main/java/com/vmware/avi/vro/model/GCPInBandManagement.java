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
 * The GCPInBandManagement is a POJO class extends AviRestResource that used for creating
 * GCPInBandManagement.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GCPInBandManagement")
@VsoFinder(name = Constants.FINDER_VRO_GCPINBANDMANAGEMENT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GCPInBandManagement extends AviRestResource {
  @JsonProperty("vpc_network_name")
  @JsonInclude(Include.NON_NULL)
  private String vpcNetworkName = null;

  @JsonProperty("vpc_project_id")
  @JsonInclude(Include.NON_NULL)
  private String vpcProjectId = null;

  @JsonProperty("vpc_subnet_name")
  @JsonInclude(Include.NON_NULL)
  private String vpcSubnetName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Service engine network name.
   * Field introduced in 18.2.2.
   * @return vpcNetworkName
   */
  @VsoMethod
  public String getVpcNetworkName() {
    return vpcNetworkName;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine network name.
   * Field introduced in 18.2.2.
   * @param vpcNetworkName set the vpcNetworkName.
   */
  @VsoMethod
  public void setVpcNetworkName(String  vpcNetworkName) {
    this.vpcNetworkName = vpcNetworkName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Project id of the service engine network.
   * By default, service engine project id will be used.
   * Field introduced in 18.2.1.
   * @return vpcProjectId
   */
  @VsoMethod
  public String getVpcProjectId() {
    return vpcProjectId;
  }

  /**
   * This is the setter method to the attribute.
   * Project id of the service engine network.
   * By default, service engine project id will be used.
   * Field introduced in 18.2.1.
   * @param vpcProjectId set the vpcProjectId.
   */
  @VsoMethod
  public void setVpcProjectId(String  vpcProjectId) {
    this.vpcProjectId = vpcProjectId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine network subnet name.
   * Field introduced in 18.2.1.
   * @return vpcSubnetName
   */
  @VsoMethod
  public String getVpcSubnetName() {
    return vpcSubnetName;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine network subnet name.
   * Field introduced in 18.2.1.
   * @param vpcSubnetName set the vpcSubnetName.
   */
  @VsoMethod
  public void setVpcSubnetName(String  vpcSubnetName) {
    this.vpcSubnetName = vpcSubnetName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GCPInBandManagement objGCPInBandManagement = (GCPInBandManagement) o;
  return   Objects.equals(this.vpcSubnetName, objGCPInBandManagement.vpcSubnetName)&&
  Objects.equals(this.vpcProjectId, objGCPInBandManagement.vpcProjectId)&&
  Objects.equals(this.vpcNetworkName, objGCPInBandManagement.vpcNetworkName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GCPInBandManagement {\n");
      sb.append("    vpcNetworkName: ").append(toIndentedString(vpcNetworkName)).append("\n");
        sb.append("    vpcProjectId: ").append(toIndentedString(vpcProjectId)).append("\n");
        sb.append("    vpcSubnetName: ").append(toIndentedString(vpcSubnetName)).append("\n");
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

