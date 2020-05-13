package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AzureNetworkInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * AzureConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AzureConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_AZURECONFIGURATION, idAccessor = "getObjectID()")
@Service
public class AzureConfiguration extends AviRestResource  {
  @JsonProperty("availability_zones")
  @Valid
  private List<String> availabilityZones = null;

  @JsonProperty("cloud_credentials_ref")
  private String cloudCredentialsRef = null;

  @JsonProperty("des_id")
  private String desId = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("network_info")
  @Valid
  private List<AzureNetworkInfo> networkInfo = null;

  @JsonProperty("resource_group")
  private String resourceGroup = null;

  @JsonProperty("subscription_id")
  private String subscriptionId = null;

  @JsonProperty("use_azure_dns")
  private Boolean useAzureDns = null;

  @JsonProperty("use_enhanced_ha")
  private Boolean useEnhancedHa = null;

  @JsonProperty("use_managed_disks")
  private Boolean useManagedDisks = true;

  @JsonProperty("use_standard_alb")
  private Boolean useStandardAlb = null;

  
  public AzureConfiguration addAvailabilityZonesItem(String availabilityZonesItem) {
    if (this.availabilityZones == null) {
      this.availabilityZones = new ArrayList<String>();
    }
    this.availabilityZones.add(availabilityZonesItem);
    return this;
  }
  
  /**
   * Availability zones to be used in Azure. Field introduced in 17.2.5.
   * @return availabilityZones
  **/
  @ApiModelProperty(value = "Availability zones to be used in Azure. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public List<String> getAvailabilityZones() {
    return availabilityZones;
  }
    
  @VsoMethod
  public void setAvailabilityZones(List<String> availabilityZones) {
    this.availabilityZones = availabilityZones;
  }

  
  /**
   * Credentials to access azure cloud. It is a reference to an object of type CloudConnectorUser. Field introduced in 17.2.1.
   * @return cloudCredentialsRef
  **/
  @ApiModelProperty(value = "Credentials to access azure cloud. It is a reference to an object of type CloudConnectorUser. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getCloudCredentialsRef() {
    return cloudCredentialsRef;
  }
    
  @VsoMethod
  public void setCloudCredentialsRef(String cloudCredentialsRef) {
    this.cloudCredentialsRef = cloudCredentialsRef;
  }

  
  /**
   * Disks Encryption Set resource-id (des_id) to encrypt se image and managed disk using customer-managed-keys. Field introduced in 20.1.1.
   * @return desId
  **/
  @ApiModelProperty(value = "Disks Encryption Set resource-id (des_id) to encrypt se image and managed disk using customer-managed-keys. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getDesId() {
    return desId;
  }
    
  @VsoMethod
  public void setDesId(String desId) {
    this.desId = desId;
  }

  
  /**
   * Azure location where this cloud will be located. Field introduced in 17.2.1.
   * @return location
  **/
  @ApiModelProperty(value = "Azure location where this cloud will be located. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getLocation() {
    return location;
  }
    
  @VsoMethod
  public void setLocation(String location) {
    this.location = location;
  }

  
  public AzureConfiguration addNetworkInfoItem(AzureNetworkInfo networkInfoItem) {
    if (this.networkInfo == null) {
      this.networkInfo = new ArrayList<AzureNetworkInfo>();
    }
    this.networkInfo.add(networkInfoItem);
    return this;
  }
  
  /**
   * Azure virtual network and subnet information. Field introduced in 17.2.1.
   * @return networkInfo
  **/
  @ApiModelProperty(value = "Azure virtual network and subnet information. Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public List<AzureNetworkInfo> getNetworkInfo() {
    return networkInfo;
  }
    
  @VsoMethod
  public void setNetworkInfo(List<AzureNetworkInfo> networkInfo) {
    this.networkInfo = networkInfo;
  }

  
  /**
   * Azure resource group dedicated for Avi Controller. Avi Controller will create all its resources in this resource group. Field introduced in 17.2.1.
   * @return resourceGroup
  **/
  @ApiModelProperty(value = "Azure resource group dedicated for Avi Controller. Avi Controller will create all its resources in this resource group. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getResourceGroup() {
    return resourceGroup;
  }
    
  @VsoMethod
  public void setResourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
  }

  
  /**
   * Subscription Id for the Azure subscription. Field introduced in 17.2.1.
   * @return subscriptionId
  **/
  @ApiModelProperty(value = "Subscription Id for the Azure subscription. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getSubscriptionId() {
    return subscriptionId;
  }
    
  @VsoMethod
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  
  /**
   * Azure is the DNS provider. Field introduced in 17.2.1.
   * @return useAzureDns
  **/
  @ApiModelProperty(value = "Azure is the DNS provider. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public Boolean isUseAzureDns() {
    return useAzureDns;
  }
    
  @VsoMethod
  public void setUseAzureDns(Boolean useAzureDns) {
    this.useAzureDns = useAzureDns;
  }

  
  /**
   * Use Azure's enhanced HA features. This needs a public IP to be associated with the VIP. . Field introduced in 17.2.1.
   * @return useEnhancedHa
  **/
  @ApiModelProperty(value = "Use Azure's enhanced HA features. This needs a public IP to be associated with the VIP. . Field introduced in 17.2.1.")


 
  @VsoMethod  
  public Boolean isUseEnhancedHa() {
    return useEnhancedHa;
  }
    
  @VsoMethod
  public void setUseEnhancedHa(Boolean useEnhancedHa) {
    this.useEnhancedHa = useEnhancedHa;
  }

  
  /**
   * Use Azure managed disks for SE storage. Field introduced in 17.2.2.
   * @return useManagedDisks
  **/
  @ApiModelProperty(value = "Use Azure managed disks for SE storage. Field introduced in 17.2.2.")


 
  @VsoMethod  
  public Boolean isUseManagedDisks() {
    return useManagedDisks;
  }
    
  @VsoMethod
  public void setUseManagedDisks(Boolean useManagedDisks) {
    this.useManagedDisks = useManagedDisks;
  }

  
  /**
   * Use Standard SKU Azure Load Balancer. By default Basic SKU Load Balancer is used. Field introduced in 17.2.7.
   * @return useStandardAlb
  **/
  @ApiModelProperty(value = "Use Standard SKU Azure Load Balancer. By default Basic SKU Load Balancer is used. Field introduced in 17.2.7.")


 
  @VsoMethod  
  public Boolean isUseStandardAlb() {
    return useStandardAlb;
  }
    
  @VsoMethod
  public void setUseStandardAlb(Boolean useStandardAlb) {
    this.useStandardAlb = useStandardAlb;
  }

  
  public String getObjectID() {
		return "AzureConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureConfiguration azureConfiguration = (AzureConfiguration) o;
    return Objects.equals(this.availabilityZones, azureConfiguration.availabilityZones) &&
        Objects.equals(this.cloudCredentialsRef, azureConfiguration.cloudCredentialsRef) &&
        Objects.equals(this.desId, azureConfiguration.desId) &&
        Objects.equals(this.location, azureConfiguration.location) &&
        Objects.equals(this.networkInfo, azureConfiguration.networkInfo) &&
        Objects.equals(this.resourceGroup, azureConfiguration.resourceGroup) &&
        Objects.equals(this.subscriptionId, azureConfiguration.subscriptionId) &&
        Objects.equals(this.useAzureDns, azureConfiguration.useAzureDns) &&
        Objects.equals(this.useEnhancedHa, azureConfiguration.useEnhancedHa) &&
        Objects.equals(this.useManagedDisks, azureConfiguration.useManagedDisks) &&
        Objects.equals(this.useStandardAlb, azureConfiguration.useStandardAlb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityZones, cloudCredentialsRef, desId, location, networkInfo, resourceGroup, subscriptionId, useAzureDns, useEnhancedHa, useManagedDisks, useStandardAlb);
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

