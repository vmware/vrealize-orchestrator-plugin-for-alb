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
 * The AzureInfo is a POJO class extends AviRestResource that used for creating
 * AzureInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AzureInfo")
@VsoFinder(name = Constants.FINDER_VRO_AZUREINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AzureInfo extends AviRestResource {
    @JsonProperty("availability_set")
    @JsonInclude(Include.NON_NULL)
    private String availabilitySet;

    @JsonProperty("fault_domain")
    @JsonInclude(Include.NON_NULL)
    private String faultDomain;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("resource_group")
    @JsonInclude(Include.NON_NULL)
    private String resourceGroup;

    @JsonProperty("subnet_id")
    @JsonInclude(Include.NON_NULL)
    private String subnetId;

    @JsonProperty("update_domain")
    @JsonInclude(Include.NON_NULL)
    private String updateDomain;

    @JsonProperty("vm_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vmUuid;

    @JsonProperty("vnic_id")
    @JsonInclude(Include.NON_NULL)
    private String vnicId;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the availability set of which the vm is a part of.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return availabilitySet
   */
  @VsoMethod
  public String getAvailabilitySet() {
    return availabilitySet;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the availability set of which the vm is a part of.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param availabilitySet set the availabilitySet.
   */
  @VsoMethod
  public void setAvailabilitySet(String  availabilitySet) {
    this.availabilitySet = availabilitySet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Fault domain within the availability set the vm is a part of.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return faultDomain
   */
  @VsoMethod
  public String getFaultDomain() {
    return faultDomain;
  }

  /**
   * This is the setter method to the attribute.
   * Fault domain within the availability set the vm is a part of.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param faultDomain set the faultDomain.
   */
  @VsoMethod
  public void setFaultDomain(String  faultDomain) {
    this.faultDomain = faultDomain;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the azure vm.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the azure vm.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Resource group name for the vm.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resourceGroup
   */
  @VsoMethod
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * This is the setter method to the attribute.
   * Resource group name for the vm.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param resourceGroup set the resourceGroup.
   */
  @VsoMethod
  public void setResourceGroup(String  resourceGroup) {
    this.resourceGroup = resourceGroup;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Subnet id of the primary nic of the vm.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subnetId
   */
  @VsoMethod
  public String getSubnetId() {
    return subnetId;
  }

  /**
   * This is the setter method to the attribute.
   * Subnet id of the primary nic of the vm.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subnetId set the subnetId.
   */
  @VsoMethod
  public void setSubnetId(String  subnetId) {
    this.subnetId = subnetId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Update domain within the availability set the vm is a part of.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return updateDomain
   */
  @VsoMethod
  public String getUpdateDomain() {
    return updateDomain;
  }

  /**
   * This is the setter method to the attribute.
   * Update domain within the availability set the vm is a part of.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param updateDomain set the updateDomain.
   */
  @VsoMethod
  public void setUpdateDomain(String  updateDomain) {
    this.updateDomain = updateDomain;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Azure vm uuid for the se vm.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vmUuid
   */
  @VsoMethod
  public String getVmUuid() {
    return vmUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Azure vm uuid for the se vm.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vmUuid set the vmUuid.
   */
  @VsoMethod
  public void setVmUuid(String  vmUuid) {
    this.vmUuid = vmUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vnic id of the primary nic of the vm.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vnicId
   */
  @VsoMethod
  public String getVnicId() {
    return vnicId;
  }

  /**
   * This is the setter method to the attribute.
   * Vnic id of the primary nic of the vm.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vnicId set the vnicId.
   */
  @VsoMethod
  public void setVnicId(String  vnicId) {
    this.vnicId = vnicId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AzureInfo objAzureInfo = (AzureInfo) o;
  return   Objects.equals(this.vmUuid, objAzureInfo.vmUuid)&&
  Objects.equals(this.resourceGroup, objAzureInfo.resourceGroup)&&
  Objects.equals(this.name, objAzureInfo.name)&&
  Objects.equals(this.subnetId, objAzureInfo.subnetId)&&
  Objects.equals(this.vnicId, objAzureInfo.vnicId)&&
  Objects.equals(this.availabilitySet, objAzureInfo.availabilitySet)&&
  Objects.equals(this.faultDomain, objAzureInfo.faultDomain)&&
  Objects.equals(this.updateDomain, objAzureInfo.updateDomain);
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

