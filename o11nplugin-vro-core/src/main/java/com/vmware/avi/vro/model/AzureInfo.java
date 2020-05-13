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
 * AzureInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AzureInfo")
@VsoFinder(name = Constants.FINDER_VRO_AZUREINFO, idAccessor = "getObjectID()")
@Service
public class AzureInfo extends AviRestResource  {
  @JsonProperty("availability_set")
  private String availabilitySet = null;

  @JsonProperty("fault_domain")
  private String faultDomain = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("resource_group")
  private String resourceGroup = null;

  @JsonProperty("subnet_id")
  private String subnetId = null;

  @JsonProperty("update_domain")
  private String updateDomain = null;

  @JsonProperty("vm_uuid")
  private String vmUuid = null;

  @JsonProperty("vnic_id")
  private String vnicId = null;

  
  /**
   * Name of the availability set of which the VM is a part of. Field introduced in 17.2.1.
   * @return availabilitySet
  **/
  @ApiModelProperty(value = "Name of the availability set of which the VM is a part of. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getAvailabilitySet() {
    return availabilitySet;
  }
    
  @VsoMethod
  public void setAvailabilitySet(String availabilitySet) {
    this.availabilitySet = availabilitySet;
  }

  
  /**
   * Fault domain within the availability set the VM is a part of. Field introduced in 17.2.1.
   * @return faultDomain
  **/
  @ApiModelProperty(value = "Fault domain within the availability set the VM is a part of. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getFaultDomain() {
    return faultDomain;
  }
    
  @VsoMethod
  public void setFaultDomain(String faultDomain) {
    this.faultDomain = faultDomain;
  }

  
  /**
   * Name of the Azure VM. Field introduced in 17.2.1.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the Azure VM. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Resource group name for the VM. Field introduced in 17.2.1.
   * @return resourceGroup
  **/
  @ApiModelProperty(value = "Resource group name for the VM. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getResourceGroup() {
    return resourceGroup;
  }
    
  @VsoMethod
  public void setResourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
  }

  
  /**
   * Subnet ID of the primary nic of the VM. Field introduced in 17.2.1.
   * @return subnetId
  **/
  @ApiModelProperty(value = "Subnet ID of the primary nic of the VM. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getSubnetId() {
    return subnetId;
  }
    
  @VsoMethod
  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  
  /**
   * Update domain within the availability set the VM is a part of. Field introduced in 17.2.1.
   * @return updateDomain
  **/
  @ApiModelProperty(value = "Update domain within the availability set the VM is a part of. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getUpdateDomain() {
    return updateDomain;
  }
    
  @VsoMethod
  public void setUpdateDomain(String updateDomain) {
    this.updateDomain = updateDomain;
  }

  
  /**
   * Azure VM uuid for the SE VM. Field introduced in 17.2.1.
   * @return vmUuid
  **/
  @ApiModelProperty(value = "Azure VM uuid for the SE VM. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getVmUuid() {
    return vmUuid;
  }
    
  @VsoMethod
  public void setVmUuid(String vmUuid) {
    this.vmUuid = vmUuid;
  }

  
  /**
   * VNIC id of the primary nic of the VM. Field introduced in 17.2.1.
   * @return vnicId
  **/
  @ApiModelProperty(value = "VNIC id of the primary nic of the VM. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getVnicId() {
    return vnicId;
  }
    
  @VsoMethod
  public void setVnicId(String vnicId) {
    this.vnicId = vnicId;
  }

  
  public String getObjectID() {
		return "AzureInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureInfo azureInfo = (AzureInfo) o;
    return Objects.equals(this.availabilitySet, azureInfo.availabilitySet) &&
        Objects.equals(this.faultDomain, azureInfo.faultDomain) &&
        Objects.equals(this.name, azureInfo.name) &&
        Objects.equals(this.resourceGroup, azureInfo.resourceGroup) &&
        Objects.equals(this.subnetId, azureInfo.subnetId) &&
        Objects.equals(this.updateDomain, azureInfo.updateDomain) &&
        Objects.equals(this.vmUuid, azureInfo.vmUuid) &&
        Objects.equals(this.vnicId, azureInfo.vnicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilitySet, faultDomain, name, resourceGroup, subnetId, updateDomain, vmUuid, vnicId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureInfo {\n");
    
    sb.append("    availabilitySet: ").append(toIndentedString(availabilitySet)).append("\n");
    sb.append("    faultDomain: ").append(toIndentedString(faultDomain)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceGroup: ").append(toIndentedString(resourceGroup)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    updateDomain: ").append(toIndentedString(updateDomain)).append("\n");
    sb.append("    vmUuid: ").append(toIndentedString(vmUuid)).append("\n");
    sb.append("    vnicId: ").append(toIndentedString(vnicId)).append("\n");
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

