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
 * GCPTwoArmMode
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GCPTwoArmMode")
@VsoFinder(name = Constants.FINDER_VRO_GCPTWOARMMODE, idAccessor = "getObjectID()")
@Service
public class GCPTwoArmMode extends AviRestResource  {
  @JsonProperty("backend_data_vpc_network_name")
  private String backendDataVpcNetworkName = null;

  @JsonProperty("backend_data_vpc_subnet_name")
  private String backendDataVpcSubnetName = null;

  @JsonProperty("frontend_data_vpc_network_name")
  private String frontendDataVpcNetworkName = null;

  @JsonProperty("frontend_data_vpc_project_id")
  private String frontendDataVpcProjectId = null;

  @JsonProperty("frontend_data_vpc_subnet_name")
  private String frontendDataVpcSubnetName = null;

  @JsonProperty("management_vpc_network_name")
  private String managementVpcNetworkName = null;

  @JsonProperty("management_vpc_subnet_name")
  private String managementVpcSubnetName = null;

  
  /**
   * Service Engine Backend Data Network Name. Field introduced in 18.2.2.
   * @return backendDataVpcNetworkName
  **/
  @ApiModelProperty(required = true, value = "Service Engine Backend Data Network Name. Field introduced in 18.2.2.")
  @NotNull


 
  @VsoMethod  
  public String getBackendDataVpcNetworkName() {
    return backendDataVpcNetworkName;
  }
    
  @VsoMethod
  public void setBackendDataVpcNetworkName(String backendDataVpcNetworkName) {
    this.backendDataVpcNetworkName = backendDataVpcNetworkName;
  }

  
  /**
   * Service Engine Backend Data Network Subnet Name. Field introduced in 18.2.1.
   * @return backendDataVpcSubnetName
  **/
  @ApiModelProperty(required = true, value = "Service Engine Backend Data Network Subnet Name. Field introduced in 18.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getBackendDataVpcSubnetName() {
    return backendDataVpcSubnetName;
  }
    
  @VsoMethod
  public void setBackendDataVpcSubnetName(String backendDataVpcSubnetName) {
    this.backendDataVpcSubnetName = backendDataVpcSubnetName;
  }

  
  /**
   * Service Engine Frontend Data Network Name. Field introduced in 18.2.2.
   * @return frontendDataVpcNetworkName
  **/
  @ApiModelProperty(required = true, value = "Service Engine Frontend Data Network Name. Field introduced in 18.2.2.")
  @NotNull


 
  @VsoMethod  
  public String getFrontendDataVpcNetworkName() {
    return frontendDataVpcNetworkName;
  }
    
  @VsoMethod
  public void setFrontendDataVpcNetworkName(String frontendDataVpcNetworkName) {
    this.frontendDataVpcNetworkName = frontendDataVpcNetworkName;
  }

  
  /**
   * Project ID of the Service Engine Frontend Data Network. By default, Service Engine Project ID will be used. Field introduced in 18.2.1.
   * @return frontendDataVpcProjectId
  **/
  @ApiModelProperty(value = "Project ID of the Service Engine Frontend Data Network. By default, Service Engine Project ID will be used. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getFrontendDataVpcProjectId() {
    return frontendDataVpcProjectId;
  }
    
  @VsoMethod
  public void setFrontendDataVpcProjectId(String frontendDataVpcProjectId) {
    this.frontendDataVpcProjectId = frontendDataVpcProjectId;
  }

  
  /**
   * Service Engine Frontend Data Network Subnet Name. Field introduced in 18.2.1.
   * @return frontendDataVpcSubnetName
  **/
  @ApiModelProperty(required = true, value = "Service Engine Frontend Data Network Subnet Name. Field introduced in 18.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getFrontendDataVpcSubnetName() {
    return frontendDataVpcSubnetName;
  }
    
  @VsoMethod
  public void setFrontendDataVpcSubnetName(String frontendDataVpcSubnetName) {
    this.frontendDataVpcSubnetName = frontendDataVpcSubnetName;
  }

  
  /**
   * Service Engine Management Network Name. Field introduced in 18.2.2.
   * @return managementVpcNetworkName
  **/
  @ApiModelProperty(required = true, value = "Service Engine Management Network Name. Field introduced in 18.2.2.")
  @NotNull


 
  @VsoMethod  
  public String getManagementVpcNetworkName() {
    return managementVpcNetworkName;
  }
    
  @VsoMethod
  public void setManagementVpcNetworkName(String managementVpcNetworkName) {
    this.managementVpcNetworkName = managementVpcNetworkName;
  }

  
  /**
   * Service Engine Management Network Subnet Name. Field introduced in 18.2.1.
   * @return managementVpcSubnetName
  **/
  @ApiModelProperty(required = true, value = "Service Engine Management Network Subnet Name. Field introduced in 18.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getManagementVpcSubnetName() {
    return managementVpcSubnetName;
  }
    
  @VsoMethod
  public void setManagementVpcSubnetName(String managementVpcSubnetName) {
    this.managementVpcSubnetName = managementVpcSubnetName;
  }

  
  public String getObjectID() {
		return "GCPTwoArmMode";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPTwoArmMode gcPTwoArmMode = (GCPTwoArmMode) o;
    return Objects.equals(this.backendDataVpcNetworkName, gcPTwoArmMode.backendDataVpcNetworkName) &&
        Objects.equals(this.backendDataVpcSubnetName, gcPTwoArmMode.backendDataVpcSubnetName) &&
        Objects.equals(this.frontendDataVpcNetworkName, gcPTwoArmMode.frontendDataVpcNetworkName) &&
        Objects.equals(this.frontendDataVpcProjectId, gcPTwoArmMode.frontendDataVpcProjectId) &&
        Objects.equals(this.frontendDataVpcSubnetName, gcPTwoArmMode.frontendDataVpcSubnetName) &&
        Objects.equals(this.managementVpcNetworkName, gcPTwoArmMode.managementVpcNetworkName) &&
        Objects.equals(this.managementVpcSubnetName, gcPTwoArmMode.managementVpcSubnetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backendDataVpcNetworkName, backendDataVpcSubnetName, frontendDataVpcNetworkName, frontendDataVpcProjectId, frontendDataVpcSubnetName, managementVpcNetworkName, managementVpcSubnetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPTwoArmMode {\n");
    
    sb.append("    backendDataVpcNetworkName: ").append(toIndentedString(backendDataVpcNetworkName)).append("\n");
    sb.append("    backendDataVpcSubnetName: ").append(toIndentedString(backendDataVpcSubnetName)).append("\n");
    sb.append("    frontendDataVpcNetworkName: ").append(toIndentedString(frontendDataVpcNetworkName)).append("\n");
    sb.append("    frontendDataVpcProjectId: ").append(toIndentedString(frontendDataVpcProjectId)).append("\n");
    sb.append("    frontendDataVpcSubnetName: ").append(toIndentedString(frontendDataVpcSubnetName)).append("\n");
    sb.append("    managementVpcNetworkName: ").append(toIndentedString(managementVpcNetworkName)).append("\n");
    sb.append("    managementVpcSubnetName: ").append(toIndentedString(managementVpcSubnetName)).append("\n");
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

