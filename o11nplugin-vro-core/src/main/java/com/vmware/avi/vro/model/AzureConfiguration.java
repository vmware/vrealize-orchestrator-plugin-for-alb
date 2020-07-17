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
 * The AzureConfiguration is a POJO class extends AviRestResource that used for creating
 * AzureConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AzureConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_AZURECONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AzureConfiguration extends AviRestResource {
  @JsonProperty("availability_zones")
  @JsonInclude(Include.NON_NULL)
  private List<String> availabilityZones = null;

  @JsonProperty("cloud_credentials_ref")
  @JsonInclude(Include.NON_NULL)
  private String cloudCredentialsRef = null;

  @JsonProperty("des_id")
  @JsonInclude(Include.NON_NULL)
  private String desId = null;

  @JsonProperty("location")
  @JsonInclude(Include.NON_NULL)
  private String location = null;

  @JsonProperty("network_info")
  @JsonInclude(Include.NON_NULL)
  private List<AzureNetworkInfo> networkInfo = null;

  @JsonProperty("resource_group")
  @JsonInclude(Include.NON_NULL)
  private String resourceGroup = null;

  @JsonProperty("subscription_id")
  @JsonInclude(Include.NON_NULL)
  private String subscriptionId = null;

  @JsonProperty("use_azure_dns")
  @JsonInclude(Include.NON_NULL)
  private Boolean useAzureDns = false;

  @JsonProperty("use_enhanced_ha")
  @JsonInclude(Include.NON_NULL)
  private Boolean useEnhancedHa = false;

  @JsonProperty("use_managed_disks")
  @JsonInclude(Include.NON_NULL)
  private Boolean useManagedDisks = true;

  @JsonProperty("use_standard_alb")
  @JsonInclude(Include.NON_NULL)
  private Boolean useStandardAlb = false;



  /**
   * This is the getter method this will return the attribute value.
   * Availability zones to be used in azure.
   * Field introduced in 17.2.5.
   * @return availabilityZones
   */
  @VsoMethod
  public List<String> getAvailabilityZones() {
    return availabilityZones;
  }

  /**
   * This is the setter method. this will set the availabilityZones
   * Availability zones to be used in azure.
   * Field introduced in 17.2.5.
   * @return availabilityZones
   */
  @VsoMethod
  public void setAvailabilityZones(List<String>  availabilityZones) {
    this.availabilityZones = availabilityZones;
  }

  /**
   * This is the setter method this will set the availabilityZones
   * Availability zones to be used in azure.
   * Field introduced in 17.2.5.
   * @return availabilityZones
   */
  @VsoMethod
  public AzureConfiguration addAvailabilityZonesItem(String availabilityZonesItem) {
    if (this.availabilityZones == null) {
      this.availabilityZones = new ArrayList<String>();
    }
    this.availabilityZones.add(availabilityZonesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Credentials to access azure cloud.
   * It is a reference to an object of type cloudconnectoruser.
   * Field introduced in 17.2.1.
   * @return cloudCredentialsRef
   */
  @VsoMethod
  public String getCloudCredentialsRef() {
    return cloudCredentialsRef;
  }

  /**
   * This is the setter method to the attribute.
   * Credentials to access azure cloud.
   * It is a reference to an object of type cloudconnectoruser.
   * Field introduced in 17.2.1.
   * @param cloudCredentialsRef set the cloudCredentialsRef.
   */
  @VsoMethod
  public void setCloudCredentialsRef(String  cloudCredentialsRef) {
    this.cloudCredentialsRef = cloudCredentialsRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Disks encryption set resource-id (des_id) to encrypt se image and managed disk using customer-managed-keys.
   * Field introduced in 20.1.1.
   * @return desId
   */
  @VsoMethod
  public String getDesId() {
    return desId;
  }

  /**
   * This is the setter method to the attribute.
   * Disks encryption set resource-id (des_id) to encrypt se image and managed disk using customer-managed-keys.
   * Field introduced in 20.1.1.
   * @param desId set the desId.
   */
  @VsoMethod
  public void setDesId(String  desId) {
    this.desId = desId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Azure location where this cloud will be located.
   * Field introduced in 17.2.1.
   * @return location
   */
  @VsoMethod
  public String getLocation() {
    return location;
  }

  /**
   * This is the setter method to the attribute.
   * Azure location where this cloud will be located.
   * Field introduced in 17.2.1.
   * @param location set the location.
   */
  @VsoMethod
  public void setLocation(String  location) {
    this.location = location;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Azure virtual network and subnet information.
   * Field introduced in 17.2.1.
   * @return networkInfo
   */
  @VsoMethod
  public List<AzureNetworkInfo> getNetworkInfo() {
    return networkInfo;
  }

  /**
   * This is the setter method. this will set the networkInfo
   * Azure virtual network and subnet information.
   * Field introduced in 17.2.1.
   * @return networkInfo
   */
  @VsoMethod
  public void setNetworkInfo(List<AzureNetworkInfo>  networkInfo) {
    this.networkInfo = networkInfo;
  }

  /**
   * This is the setter method this will set the networkInfo
   * Azure virtual network and subnet information.
   * Field introduced in 17.2.1.
   * @return networkInfo
   */
  @VsoMethod
  public AzureConfiguration addNetworkInfoItem(AzureNetworkInfo networkInfoItem) {
    if (this.networkInfo == null) {
      this.networkInfo = new ArrayList<AzureNetworkInfo>();
    }
    this.networkInfo.add(networkInfoItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Azure resource group dedicated for avi controller.
   * Avi controller will create all its resources in this resource group.
   * Field introduced in 17.2.1.
   * @return resourceGroup
   */
  @VsoMethod
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * This is the setter method to the attribute.
   * Azure resource group dedicated for avi controller.
   * Avi controller will create all its resources in this resource group.
   * Field introduced in 17.2.1.
   * @param resourceGroup set the resourceGroup.
   */
  @VsoMethod
  public void setResourceGroup(String  resourceGroup) {
    this.resourceGroup = resourceGroup;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Subscription id for the azure subscription.
   * Field introduced in 17.2.1.
   * @return subscriptionId
   */
  @VsoMethod
  public String getSubscriptionId() {
    return subscriptionId;
  }

  /**
   * This is the setter method to the attribute.
   * Subscription id for the azure subscription.
   * Field introduced in 17.2.1.
   * @param subscriptionId set the subscriptionId.
   */
  @VsoMethod
  public void setSubscriptionId(String  subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Azure is the dns provider.
   * Field introduced in 17.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useAzureDns
   */
  @VsoMethod
  public Boolean getUseAzureDns() {
    return useAzureDns;
  }

  /**
   * This is the setter method to the attribute.
   * Azure is the dns provider.
   * Field introduced in 17.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useAzureDns set the useAzureDns.
   */
  @VsoMethod
  public void setUseAzureDns(Boolean  useAzureDns) {
    this.useAzureDns = useAzureDns;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use azure's enhanced ha features.
   * This needs a public ip to be associated with the vip.
   * Field introduced in 17.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useEnhancedHa
   */
  @VsoMethod
  public Boolean getUseEnhancedHa() {
    return useEnhancedHa;
  }

  /**
   * This is the setter method to the attribute.
   * Use azure's enhanced ha features.
   * This needs a public ip to be associated with the vip.
   * Field introduced in 17.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useEnhancedHa set the useEnhancedHa.
   */
  @VsoMethod
  public void setUseEnhancedHa(Boolean  useEnhancedHa) {
    this.useEnhancedHa = useEnhancedHa;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use azure managed disks for se storage.
   * Field introduced in 17.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return useManagedDisks
   */
  @VsoMethod
  public Boolean getUseManagedDisks() {
    return useManagedDisks;
  }

  /**
   * This is the setter method to the attribute.
   * Use azure managed disks for se storage.
   * Field introduced in 17.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param useManagedDisks set the useManagedDisks.
   */
  @VsoMethod
  public void setUseManagedDisks(Boolean  useManagedDisks) {
    this.useManagedDisks = useManagedDisks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use standard sku azure load balancer.
   * By default basic sku load balancer is used.
   * Field introduced in 17.2.7.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useStandardAlb
   */
  @VsoMethod
  public Boolean getUseStandardAlb() {
    return useStandardAlb;
  }

  /**
   * This is the setter method to the attribute.
   * Use standard sku azure load balancer.
   * By default basic sku load balancer is used.
   * Field introduced in 17.2.7.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useStandardAlb set the useStandardAlb.
   */
  @VsoMethod
  public void setUseStandardAlb(Boolean  useStandardAlb) {
    this.useStandardAlb = useStandardAlb;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AzureConfiguration objAzureConfiguration = (AzureConfiguration) o;
  return   Objects.equals(this.useManagedDisks, objAzureConfiguration.useManagedDisks)&&
  Objects.equals(this.availabilityZones, objAzureConfiguration.availabilityZones)&&
  Objects.equals(this.resourceGroup, objAzureConfiguration.resourceGroup)&&
  Objects.equals(this.useEnhancedHa, objAzureConfiguration.useEnhancedHa)&&
  Objects.equals(this.cloudCredentialsRef, objAzureConfiguration.cloudCredentialsRef)&&
  Objects.equals(this.useAzureDns, objAzureConfiguration.useAzureDns)&&
  Objects.equals(this.location, objAzureConfiguration.location)&&
  Objects.equals(this.desId, objAzureConfiguration.desId)&&
  Objects.equals(this.networkInfo, objAzureConfiguration.networkInfo)&&
  Objects.equals(this.subscriptionId, objAzureConfiguration.subscriptionId)&&
  Objects.equals(this.useStandardAlb, objAzureConfiguration.useStandardAlb);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AzureConfiguration {\n");
      sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
        sb.append("    cloudCredentialsRef: ").append(toIndentedString(cloudCredentialsRef)).append("\n");
        sb.append("    desId: ").append(toIndentedString(desId)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    networkInfo: ").append(toIndentedString(networkInfo)).append("\n");
        sb.append("    resourceGroup: ").append(toIndentedString(resourceGroup)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    useAzureDns: ").append(toIndentedString(useAzureDns)).append("\n");
        sb.append("    useEnhancedHa: ").append(toIndentedString(useEnhancedHa)).append("\n");
        sb.append("    useManagedDisks: ").append(toIndentedString(useManagedDisks)).append("\n");
        sb.append("    useStandardAlb: ").append(toIndentedString(useStandardAlb)).append("\n");
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

