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
 * GCPOneArmMode
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GCPOneArmMode")
@VsoFinder(name = Constants.FINDER_VRO_GCPONEARMMODE, idAccessor = "getObjectID()")
@Service
public class GCPOneArmMode extends AviRestResource  {
  @JsonProperty("data_vpc_network_name")
  private String dataVpcNetworkName = null;

  @JsonProperty("data_vpc_project_id")
  private String dataVpcProjectId = null;

  @JsonProperty("data_vpc_subnet_name")
  private String dataVpcSubnetName = null;

  @JsonProperty("management_vpc_network_name")
  private String managementVpcNetworkName = null;

  @JsonProperty("management_vpc_subnet_name")
  private String managementVpcSubnetName = null;

  
  /**
   * Service Engine Data Network Name. Field introduced in 18.2.2.
   * @return dataVpcNetworkName
  **/
  @ApiModelProperty(required = true, value = "Service Engine Data Network Name. Field introduced in 18.2.2.")
  @NotNull


 
  @VsoMethod  
  public String getDataVpcNetworkName() {
    return dataVpcNetworkName;
  }
    
  @VsoMethod
  public void setDataVpcNetworkName(String dataVpcNetworkName) {
    this.dataVpcNetworkName = dataVpcNetworkName;
  }

  
  /**
   * Project ID of the Service Engine Data Network. By default, Service Engine Project ID will be used. Field introduced in 18.2.1.
   * @return dataVpcProjectId
  **/
  @ApiModelProperty(value = "Project ID of the Service Engine Data Network. By default, Service Engine Project ID will be used. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getDataVpcProjectId() {
    return dataVpcProjectId;
  }
    
  @VsoMethod
  public void setDataVpcProjectId(String dataVpcProjectId) {
    this.dataVpcProjectId = dataVpcProjectId;
  }

  
  /**
   * Service Engine Data Network Subnet Name. Field introduced in 18.2.1.
   * @return dataVpcSubnetName
  **/
  @ApiModelProperty(required = true, value = "Service Engine Data Network Subnet Name. Field introduced in 18.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getDataVpcSubnetName() {
    return dataVpcSubnetName;
  }
    
  @VsoMethod
  public void setDataVpcSubnetName(String dataVpcSubnetName) {
    this.dataVpcSubnetName = dataVpcSubnetName;
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
		return "GCPOneArmMode";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPOneArmMode gcPOneArmMode = (GCPOneArmMode) o;
    return Objects.equals(this.dataVpcNetworkName, gcPOneArmMode.dataVpcNetworkName) &&
        Objects.equals(this.dataVpcProjectId, gcPOneArmMode.dataVpcProjectId) &&
        Objects.equals(this.dataVpcSubnetName, gcPOneArmMode.dataVpcSubnetName) &&
        Objects.equals(this.managementVpcNetworkName, gcPOneArmMode.managementVpcNetworkName) &&
        Objects.equals(this.managementVpcSubnetName, gcPOneArmMode.managementVpcSubnetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataVpcNetworkName, dataVpcProjectId, dataVpcSubnetName, managementVpcNetworkName, managementVpcSubnetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPOneArmMode {\n");
    
    sb.append("    dataVpcNetworkName: ").append(toIndentedString(dataVpcNetworkName)).append("\n");
    sb.append("    dataVpcProjectId: ").append(toIndentedString(dataVpcProjectId)).append("\n");
    sb.append("    dataVpcSubnetName: ").append(toIndentedString(dataVpcSubnetName)).append("\n");
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

