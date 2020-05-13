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
 * GCPInBandManagement
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GCPInBandManagement")
@VsoFinder(name = Constants.FINDER_VRO_GCPINBANDMANAGEMENT, idAccessor = "getObjectID()")
@Service
public class GCPInBandManagement extends AviRestResource  {
  @JsonProperty("vpc_network_name")
  private String vpcNetworkName = null;

  @JsonProperty("vpc_project_id")
  private String vpcProjectId = null;

  @JsonProperty("vpc_subnet_name")
  private String vpcSubnetName = null;

  
  /**
   * Service Engine Network Name. Field introduced in 18.2.2.
   * @return vpcNetworkName
  **/
  @ApiModelProperty(required = true, value = "Service Engine Network Name. Field introduced in 18.2.2.")
  @NotNull


 
  @VsoMethod  
  public String getVpcNetworkName() {
    return vpcNetworkName;
  }
    
  @VsoMethod
  public void setVpcNetworkName(String vpcNetworkName) {
    this.vpcNetworkName = vpcNetworkName;
  }

  
  /**
   * Project ID of the Service Engine Network. By default, Service Engine Project ID will be used. Field introduced in 18.2.1.
   * @return vpcProjectId
  **/
  @ApiModelProperty(value = "Project ID of the Service Engine Network. By default, Service Engine Project ID will be used. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getVpcProjectId() {
    return vpcProjectId;
  }
    
  @VsoMethod
  public void setVpcProjectId(String vpcProjectId) {
    this.vpcProjectId = vpcProjectId;
  }

  
  /**
   * Service Engine Network Subnet Name. Field introduced in 18.2.1.
   * @return vpcSubnetName
  **/
  @ApiModelProperty(required = true, value = "Service Engine Network Subnet Name. Field introduced in 18.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getVpcSubnetName() {
    return vpcSubnetName;
  }
    
  @VsoMethod
  public void setVpcSubnetName(String vpcSubnetName) {
    this.vpcSubnetName = vpcSubnetName;
  }

  
  public String getObjectID() {
		return "GCPInBandManagement";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPInBandManagement gcPInBandManagement = (GCPInBandManagement) o;
    return Objects.equals(this.vpcNetworkName, gcPInBandManagement.vpcNetworkName) &&
        Objects.equals(this.vpcProjectId, gcPInBandManagement.vpcProjectId) &&
        Objects.equals(this.vpcSubnetName, gcPInBandManagement.vpcSubnetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpcNetworkName, vpcProjectId, vpcSubnetName);
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

