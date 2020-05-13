package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AzureServicePrincipalCredentials;
import com.vmware.avi.vro.model.AzureUserPassCredentials;
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
 * IpamDnsAzureProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IpamDnsAzureProfile")
@VsoFinder(name = Constants.FINDER_VRO_IPAMDNSAZUREPROFILE, idAccessor = "getObjectID()")
@Service
public class IpamDnsAzureProfile extends AviRestResource  {
  @JsonProperty("azure_serviceprincipal")
  private AzureServicePrincipalCredentials azureServiceprincipal = null;

  @JsonProperty("azure_userpass")
  private AzureUserPassCredentials azureUserpass = null;

  @JsonProperty("egress_service_subnets")
  @Valid
  private List<String> egressServiceSubnets = null;

  @JsonProperty("resource_group")
  private String resourceGroup = null;

  @JsonProperty("subscription_id")
  private String subscriptionId = null;

  @JsonProperty("usable_domains")
  @Valid
  private List<String> usableDomains = null;

  @JsonProperty("usable_network_uuids")
  @Valid
  private List<String> usableNetworkUuids = null;

  @JsonProperty("use_enhanced_ha")
  private Boolean useEnhancedHa = null;

  @JsonProperty("use_standard_alb")
  private Boolean useStandardAlb = null;

  @JsonProperty("virtual_network_ids")
  @Valid
  private List<String> virtualNetworkIds = null;

  
  /**
   * Service principal based credentials for azure. Only one of azure_userpass or azure_serviceprincipal is allowed. Field introduced in 17.2.1.
   * @return azureServiceprincipal
  **/
  @ApiModelProperty(value = "Service principal based credentials for azure. Only one of azure_userpass or azure_serviceprincipal is allowed. Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public AzureServicePrincipalCredentials getAzureServiceprincipal() {
    return azureServiceprincipal;
  }
    
  @VsoMethod
  public void setAzureServiceprincipal(AzureServicePrincipalCredentials azureServiceprincipal) {
    this.azureServiceprincipal = azureServiceprincipal;
  }

  
  /**
   * User name password based credentials for azure. Only one of azure_userpass or azure_serviceprincipal is allowed. Field introduced in 17.2.1.
   * @return azureUserpass
  **/
  @ApiModelProperty(value = "User name password based credentials for azure. Only one of azure_userpass or azure_serviceprincipal is allowed. Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public AzureUserPassCredentials getAzureUserpass() {
    return azureUserpass;
  }
    
  @VsoMethod
  public void setAzureUserpass(AzureUserPassCredentials azureUserpass) {
    this.azureUserpass = azureUserpass;
  }

  
  public IpamDnsAzureProfile addEgressServiceSubnetsItem(String egressServiceSubnetsItem) {
    if (this.egressServiceSubnets == null) {
      this.egressServiceSubnets = new ArrayList<String>();
    }
    this.egressServiceSubnets.add(egressServiceSubnetsItem);
    return this;
  }
  
  /**
   * Used for allocating egress service source IPs. Field introduced in 17.2.8.
   * @return egressServiceSubnets
  **/
  @ApiModelProperty(value = "Used for allocating egress service source IPs. Field introduced in 17.2.8.")


 
  @VsoMethod  
  public List<String> getEgressServiceSubnets() {
    return egressServiceSubnets;
  }
    
  @VsoMethod
  public void setEgressServiceSubnets(List<String> egressServiceSubnets) {
    this.egressServiceSubnets = egressServiceSubnets;
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

  
  public IpamDnsAzureProfile addUsableDomainsItem(String usableDomainsItem) {
    if (this.usableDomains == null) {
      this.usableDomains = new ArrayList<String>();
    }
    this.usableDomains.add(usableDomainsItem);
    return this;
  }
  
  /**
   * Usable domains to pick from Azure DNS. Field introduced in 17.2.1.
   * @return usableDomains
  **/
  @ApiModelProperty(value = "Usable domains to pick from Azure DNS. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public List<String> getUsableDomains() {
    return usableDomains;
  }
    
  @VsoMethod
  public void setUsableDomains(List<String> usableDomains) {
    this.usableDomains = usableDomains;
  }

  
  public IpamDnsAzureProfile addUsableNetworkUuidsItem(String usableNetworkUuidsItem) {
    if (this.usableNetworkUuids == null) {
      this.usableNetworkUuids = new ArrayList<String>();
    }
    this.usableNetworkUuids.add(usableNetworkUuidsItem);
    return this;
  }
  
  /**
   * Usable networks for Virtual IP. If VirtualService does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for IP allocation. Field introduced in 17.2.1.
   * @return usableNetworkUuids
  **/
  @ApiModelProperty(value = "Usable networks for Virtual IP. If VirtualService does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for IP allocation. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public List<String> getUsableNetworkUuids() {
    return usableNetworkUuids;
  }
    
  @VsoMethod
  public void setUsableNetworkUuids(List<String> usableNetworkUuids) {
    this.usableNetworkUuids = usableNetworkUuids;
  }

  
  /**
   * Use Azure's enhanced HA features. This needs a public IP to be associated with the VIP. Field introduced in 17.2.1.
   * @return useEnhancedHa
  **/
  @ApiModelProperty(value = "Use Azure's enhanced HA features. This needs a public IP to be associated with the VIP. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public Boolean isUseEnhancedHa() {
    return useEnhancedHa;
  }
    
  @VsoMethod
  public void setUseEnhancedHa(Boolean useEnhancedHa) {
    this.useEnhancedHa = useEnhancedHa;
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

  
  public IpamDnsAzureProfile addVirtualNetworkIdsItem(String virtualNetworkIdsItem) {
    if (this.virtualNetworkIds == null) {
      this.virtualNetworkIds = new ArrayList<String>();
    }
    this.virtualNetworkIds.add(virtualNetworkIdsItem);
    return this;
  }
  
  /**
   * Virtual networks where Virtual IPs will belong. Field introduced in 17.2.1.
   * @return virtualNetworkIds
  **/
  @ApiModelProperty(value = "Virtual networks where Virtual IPs will belong. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public List<String> getVirtualNetworkIds() {
    return virtualNetworkIds;
  }
    
  @VsoMethod
  public void setVirtualNetworkIds(List<String> virtualNetworkIds) {
    this.virtualNetworkIds = virtualNetworkIds;
  }

  
  public String getObjectID() {
		return "IpamDnsAzureProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpamDnsAzureProfile ipamDnsAzureProfile = (IpamDnsAzureProfile) o;
    return Objects.equals(this.azureServiceprincipal, ipamDnsAzureProfile.azureServiceprincipal) &&
        Objects.equals(this.azureUserpass, ipamDnsAzureProfile.azureUserpass) &&
        Objects.equals(this.egressServiceSubnets, ipamDnsAzureProfile.egressServiceSubnets) &&
        Objects.equals(this.resourceGroup, ipamDnsAzureProfile.resourceGroup) &&
        Objects.equals(this.subscriptionId, ipamDnsAzureProfile.subscriptionId) &&
        Objects.equals(this.usableDomains, ipamDnsAzureProfile.usableDomains) &&
        Objects.equals(this.usableNetworkUuids, ipamDnsAzureProfile.usableNetworkUuids) &&
        Objects.equals(this.useEnhancedHa, ipamDnsAzureProfile.useEnhancedHa) &&
        Objects.equals(this.useStandardAlb, ipamDnsAzureProfile.useStandardAlb) &&
        Objects.equals(this.virtualNetworkIds, ipamDnsAzureProfile.virtualNetworkIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureServiceprincipal, azureUserpass, egressServiceSubnets, resourceGroup, subscriptionId, usableDomains, usableNetworkUuids, useEnhancedHa, useStandardAlb, virtualNetworkIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpamDnsAzureProfile {\n");
    
    sb.append("    azureServiceprincipal: ").append(toIndentedString(azureServiceprincipal)).append("\n");
    sb.append("    azureUserpass: ").append(toIndentedString(azureUserpass)).append("\n");
    sb.append("    egressServiceSubnets: ").append(toIndentedString(egressServiceSubnets)).append("\n");
    sb.append("    resourceGroup: ").append(toIndentedString(resourceGroup)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    usableDomains: ").append(toIndentedString(usableDomains)).append("\n");
    sb.append("    usableNetworkUuids: ").append(toIndentedString(usableNetworkUuids)).append("\n");
    sb.append("    useEnhancedHa: ").append(toIndentedString(useEnhancedHa)).append("\n");
    sb.append("    useStandardAlb: ").append(toIndentedString(useStandardAlb)).append("\n");
    sb.append("    virtualNetworkIds: ").append(toIndentedString(virtualNetworkIds)).append("\n");
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

