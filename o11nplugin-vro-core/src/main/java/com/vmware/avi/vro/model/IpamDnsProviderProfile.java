package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpamDnsAwsProfile;
import com.vmware.avi.vro.model.IpamDnsAzureProfile;
import com.vmware.avi.vro.model.IpamDnsCustomProfile;
import com.vmware.avi.vro.model.IpamDnsGCPProfile;
import com.vmware.avi.vro.model.IpamDnsInfobloxProfile;
import com.vmware.avi.vro.model.IpamDnsInternalProfile;
import com.vmware.avi.vro.model.IpamDnsOCIProfile;
import com.vmware.avi.vro.model.IpamDnsOpenstackProfile;
import com.vmware.avi.vro.model.IpamDnsTencentProfile;
import com.vmware.avi.vro.model.ProxyConfiguration;
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
 * IpamDnsProviderProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IpamDnsProviderProfile")
@VsoFinder(name = Constants.FINDER_VRO_IPAMDNSPROVIDERPROFILE, idAccessor = "getObjectID()")
@Service
public class IpamDnsProviderProfile extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("allocate_ip_in_vrf")
  private Boolean allocateIpInVrf = null;

  @JsonProperty("aws_profile")
  private IpamDnsAwsProfile awsProfile = null;

  @JsonProperty("azure_profile")
  private IpamDnsAzureProfile azureProfile = null;

  @JsonProperty("custom_profile")
  private IpamDnsCustomProfile customProfile = null;

  @JsonProperty("gcp_profile")
  private IpamDnsGCPProfile gcpProfile = null;

  @JsonProperty("infoblox_profile")
  private IpamDnsInfobloxProfile infobloxProfile = null;

  @JsonProperty("internal_profile")
  private IpamDnsInternalProfile internalProfile = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("oci_profile")
  private IpamDnsOCIProfile ociProfile = null;

  @JsonProperty("openstack_profile")
  private IpamDnsOpenstackProfile openstackProfile = null;

  @JsonProperty("proxy_configuration")
  private ProxyConfiguration proxyConfiguration = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("tencent_profile")
  private IpamDnsTencentProfile tencentProfile = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * If this flag is set, only allocate IP from networks in the Virtual Service VRF. Applicable for Avi Vantage IPAM only. Field introduced in 17.2.4.
   * @return allocateIpInVrf
  **/
  @ApiModelProperty(value = "If this flag is set, only allocate IP from networks in the Virtual Service VRF. Applicable for Avi Vantage IPAM only. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public Boolean isAllocateIpInVrf() {
    return allocateIpInVrf;
  }
    
  @VsoMethod
  public void setAllocateIpInVrf(Boolean allocateIpInVrf) {
    this.allocateIpInVrf = allocateIpInVrf;
  }

  
  /**
   * Provider details if type is AWS.
   * @return awsProfile
  **/
  @ApiModelProperty(value = "Provider details if type is AWS.")

  @Valid

 
  @VsoMethod  
  public IpamDnsAwsProfile getAwsProfile() {
    return awsProfile;
  }
    
  @VsoMethod
  public void setAwsProfile(IpamDnsAwsProfile awsProfile) {
    this.awsProfile = awsProfile;
  }

  
  /**
   * Provider details if type is Microsoft Azure. Field introduced in 17.2.1.
   * @return azureProfile
  **/
  @ApiModelProperty(value = "Provider details if type is Microsoft Azure. Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public IpamDnsAzureProfile getAzureProfile() {
    return azureProfile;
  }
    
  @VsoMethod
  public void setAzureProfile(IpamDnsAzureProfile azureProfile) {
    this.azureProfile = azureProfile;
  }

  
  /**
   * Provider details if type is Custom. Field introduced in 17.1.1.
   * @return customProfile
  **/
  @ApiModelProperty(value = "Provider details if type is Custom. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public IpamDnsCustomProfile getCustomProfile() {
    return customProfile;
  }
    
  @VsoMethod
  public void setCustomProfile(IpamDnsCustomProfile customProfile) {
    this.customProfile = customProfile;
  }

  
  /**
   * Provider details if type is Google Cloud.
   * @return gcpProfile
  **/
  @ApiModelProperty(value = "Provider details if type is Google Cloud.")

  @Valid

 
  @VsoMethod  
  public IpamDnsGCPProfile getGcpProfile() {
    return gcpProfile;
  }
    
  @VsoMethod
  public void setGcpProfile(IpamDnsGCPProfile gcpProfile) {
    this.gcpProfile = gcpProfile;
  }

  
  /**
   * Provider details if type is Infoblox.
   * @return infobloxProfile
  **/
  @ApiModelProperty(value = "Provider details if type is Infoblox.")

  @Valid

 
  @VsoMethod  
  public IpamDnsInfobloxProfile getInfobloxProfile() {
    return infobloxProfile;
  }
    
  @VsoMethod
  public void setInfobloxProfile(IpamDnsInfobloxProfile infobloxProfile) {
    this.infobloxProfile = infobloxProfile;
  }

  
  /**
   * Provider details if type is Avi.
   * @return internalProfile
  **/
  @ApiModelProperty(value = "Provider details if type is Avi.")

  @Valid

 
  @VsoMethod  
  public IpamDnsInternalProfile getInternalProfile() {
    return internalProfile;
  }
    
  @VsoMethod
  public void setInternalProfile(IpamDnsInternalProfile internalProfile) {
    this.internalProfile = internalProfile;
  }

  
  /**
   * Name for the IPAM/DNS Provider profile.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name for the IPAM/DNS Provider profile.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Provider details for Oracle Cloud. Field introduced in 18.2.1,18.1.3.
   * @return ociProfile
  **/
  @ApiModelProperty(value = "Provider details for Oracle Cloud. Field introduced in 18.2.1,18.1.3.")

  @Valid

 
  @VsoMethod  
  public IpamDnsOCIProfile getOciProfile() {
    return ociProfile;
  }
    
  @VsoMethod
  public void setOciProfile(IpamDnsOCIProfile ociProfile) {
    this.ociProfile = ociProfile;
  }

  
  /**
   * Provider details if type is OpenStack.
   * @return openstackProfile
  **/
  @ApiModelProperty(value = "Provider details if type is OpenStack.")

  @Valid

 
  @VsoMethod  
  public IpamDnsOpenstackProfile getOpenstackProfile() {
    return openstackProfile;
  }
    
  @VsoMethod
  public void setOpenstackProfile(IpamDnsOpenstackProfile openstackProfile) {
    this.openstackProfile = openstackProfile;
  }

  
  /**
   *  Field introduced in 17.1.1.
   * @return proxyConfiguration
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public ProxyConfiguration getProxyConfiguration() {
    return proxyConfiguration;
  }
    
  @VsoMethod
  public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
    this.proxyConfiguration = proxyConfiguration;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * Provider details for Tencent Cloud. Field introduced in 18.2.3.
   * @return tencentProfile
  **/
  @ApiModelProperty(value = "Provider details for Tencent Cloud. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public IpamDnsTencentProfile getTencentProfile() {
    return tencentProfile;
  }
    
  @VsoMethod
  public void setTencentProfile(IpamDnsTencentProfile tencentProfile) {
    this.tencentProfile = tencentProfile;
  }

  
  /**
   * Provider Type for the IPAM/DNS Provider profile. Enum options - IPAMDNS_TYPE_INFOBLOX, IPAMDNS_TYPE_AWS, IPAMDNS_TYPE_OPENSTACK, IPAMDNS_TYPE_GCP, IPAMDNS_TYPE_INFOBLOX_DNS, IPAMDNS_TYPE_CUSTOM, IPAMDNS_TYPE_CUSTOM_DNS, IPAMDNS_TYPE_AZURE, IPAMDNS_TYPE_OCI, IPAMDNS_TYPE_TENCENT, IPAMDNS_TYPE_INTERNAL, IPAMDNS_TYPE_INTERNAL_DNS, IPAMDNS_TYPE_AWS_DNS, IPAMDNS_TYPE_AZURE_DNS.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Provider Type for the IPAM/DNS Provider profile. Enum options - IPAMDNS_TYPE_INFOBLOX, IPAMDNS_TYPE_AWS, IPAMDNS_TYPE_OPENSTACK, IPAMDNS_TYPE_GCP, IPAMDNS_TYPE_INFOBLOX_DNS, IPAMDNS_TYPE_CUSTOM, IPAMDNS_TYPE_CUSTOM_DNS, IPAMDNS_TYPE_AZURE, IPAMDNS_TYPE_OCI, IPAMDNS_TYPE_TENCENT, IPAMDNS_TYPE_INTERNAL, IPAMDNS_TYPE_INTERNAL_DNS, IPAMDNS_TYPE_AWS_DNS, IPAMDNS_TYPE_AZURE_DNS.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * UUID of the IPAM/DNS Provider profile.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the IPAM/DNS Provider profile.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "IpamDnsProviderProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpamDnsProviderProfile ipamDnsProviderProfile = (IpamDnsProviderProfile) o;
    return Objects.equals(this.lastModified, ipamDnsProviderProfile.lastModified) &&
        Objects.equals(this.allocateIpInVrf, ipamDnsProviderProfile.allocateIpInVrf) &&
        Objects.equals(this.awsProfile, ipamDnsProviderProfile.awsProfile) &&
        Objects.equals(this.azureProfile, ipamDnsProviderProfile.azureProfile) &&
        Objects.equals(this.customProfile, ipamDnsProviderProfile.customProfile) &&
        Objects.equals(this.gcpProfile, ipamDnsProviderProfile.gcpProfile) &&
        Objects.equals(this.infobloxProfile, ipamDnsProviderProfile.infobloxProfile) &&
        Objects.equals(this.internalProfile, ipamDnsProviderProfile.internalProfile) &&
        Objects.equals(this.name, ipamDnsProviderProfile.name) &&
        Objects.equals(this.ociProfile, ipamDnsProviderProfile.ociProfile) &&
        Objects.equals(this.openstackProfile, ipamDnsProviderProfile.openstackProfile) &&
        Objects.equals(this.proxyConfiguration, ipamDnsProviderProfile.proxyConfiguration) &&
        Objects.equals(this.tenantRef, ipamDnsProviderProfile.tenantRef) &&
        Objects.equals(this.tencentProfile, ipamDnsProviderProfile.tencentProfile) &&
        Objects.equals(this.type, ipamDnsProviderProfile.type) &&
        Objects.equals(this.url, ipamDnsProviderProfile.url) &&
        Objects.equals(this.uuid, ipamDnsProviderProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, allocateIpInVrf, awsProfile, azureProfile, customProfile, gcpProfile, infobloxProfile, internalProfile, name, ociProfile, openstackProfile, proxyConfiguration, tenantRef, tencentProfile, type, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpamDnsProviderProfile {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    allocateIpInVrf: ").append(toIndentedString(allocateIpInVrf)).append("\n");
    sb.append("    awsProfile: ").append(toIndentedString(awsProfile)).append("\n");
    sb.append("    azureProfile: ").append(toIndentedString(azureProfile)).append("\n");
    sb.append("    customProfile: ").append(toIndentedString(customProfile)).append("\n");
    sb.append("    gcpProfile: ").append(toIndentedString(gcpProfile)).append("\n");
    sb.append("    infobloxProfile: ").append(toIndentedString(infobloxProfile)).append("\n");
    sb.append("    internalProfile: ").append(toIndentedString(internalProfile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ociProfile: ").append(toIndentedString(ociProfile)).append("\n");
    sb.append("    openstackProfile: ").append(toIndentedString(openstackProfile)).append("\n");
    sb.append("    proxyConfiguration: ").append(toIndentedString(proxyConfiguration)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    tencentProfile: ").append(toIndentedString(tencentProfile)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

