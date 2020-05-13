package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.APICConfiguration;
import com.vmware.avi.vro.model.AwsConfiguration;
import com.vmware.avi.vro.model.AzureConfiguration;
import com.vmware.avi.vro.model.CloudStackConfiguration;
import com.vmware.avi.vro.model.CustomTag;
import com.vmware.avi.vro.model.DockerConfiguration;
import com.vmware.avi.vro.model.GCPConfiguration;
import com.vmware.avi.vro.model.LinuxServerConfiguration;
import com.vmware.avi.vro.model.MesosConfiguration;
import com.vmware.avi.vro.model.NsxConfiguration;
import com.vmware.avi.vro.model.OShiftK8SConfiguration;
import com.vmware.avi.vro.model.OpenStackConfiguration;
import com.vmware.avi.vro.model.ProxyConfiguration;
import com.vmware.avi.vro.model.RancherConfiguration;
import com.vmware.avi.vro.model.VCenterConfiguration;
import com.vmware.avi.vro.model.VCloudAirConfiguration;
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
 * Cloud
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "Cloud")
@VsoFinder(name = Constants.FINDER_VRO_CLOUD, idAccessor = "getObjectID()")
@Service
public class Cloud extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("apic_configuration")
  private APICConfiguration apicConfiguration = null;

  @JsonProperty("apic_mode")
  private Boolean apicMode = null;

  @JsonProperty("autoscale_polling_interval")
  private Integer autoscalePollingInterval = 60;

  @JsonProperty("aws_configuration")
  private AwsConfiguration awsConfiguration = null;

  @JsonProperty("azure_configuration")
  private AzureConfiguration azureConfiguration = null;

  @JsonProperty("cloudstack_configuration")
  private CloudStackConfiguration cloudstackConfiguration = null;

  @JsonProperty("custom_tags")
  @Valid
  private List<CustomTag> customTags = null;

  @JsonProperty("dhcp_enabled")
  private Boolean dhcpEnabled = null;

  @JsonProperty("dns_provider_ref")
  private String dnsProviderRef = null;

  @JsonProperty("dns_resolution_on_se")
  private Boolean dnsResolutionOnSe = null;

  @JsonProperty("docker_configuration")
  private DockerConfiguration dockerConfiguration = null;

  @JsonProperty("east_west_dns_provider_ref")
  private String eastWestDnsProviderRef = null;

  @JsonProperty("east_west_ipam_provider_ref")
  private String eastWestIpamProviderRef = null;

  @JsonProperty("enable_vip_static_routes")
  private Boolean enableVipStaticRoutes = null;

  @JsonProperty("gcp_configuration")
  private GCPConfiguration gcpConfiguration = null;

  @JsonProperty("ip6_autocfg_enabled")
  private Boolean ip6AutocfgEnabled = null;

  @JsonProperty("ipam_provider_ref")
  private String ipamProviderRef = null;

  @JsonProperty("license_tier")
  private String licenseTier = null;

  @JsonProperty("license_type")
  private String licenseType = null;

  @JsonProperty("linuxserver_configuration")
  private LinuxServerConfiguration linuxserverConfiguration = null;

  @JsonProperty("mesos_configuration")
  private MesosConfiguration mesosConfiguration = null;

  @JsonProperty("mtu")
  private Integer mtu = 1500;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nsx_configuration")
  private NsxConfiguration nsxConfiguration = null;

  @JsonProperty("obj_name_prefix")
  private String objNamePrefix = null;

  @JsonProperty("openstack_configuration")
  private OpenStackConfiguration openstackConfiguration = null;

  @JsonProperty("oshiftk8s_configuration")
  private OShiftK8SConfiguration oshiftk8sConfiguration = null;

  @JsonProperty("prefer_static_routes")
  private Boolean preferStaticRoutes = null;

  @JsonProperty("proxy_configuration")
  private ProxyConfiguration proxyConfiguration = null;

  @JsonProperty("rancher_configuration")
  private RancherConfiguration rancherConfiguration = null;

  @JsonProperty("se_group_template_ref")
  private String seGroupTemplateRef = null;

  @JsonProperty("state_based_dns_registration")
  private Boolean stateBasedDnsRegistration = true;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vca_configuration")
  private VCloudAirConfiguration vcaConfiguration = null;

  @JsonProperty("vcenter_configuration")
  private VCenterConfiguration vcenterConfiguration = null;

  @JsonProperty("vtype")
  private String vtype = "CLOUD_NONE";

  
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
   * Placeholder for description of property apic_configuration of obj type Cloud field type str  type object
   * @return apicConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property apic_configuration of obj type Cloud field type str  type object")

  @Valid

 
  @VsoMethod  
  public APICConfiguration getApicConfiguration() {
    return apicConfiguration;
  }
    
  @VsoMethod
  public void setApicConfiguration(APICConfiguration apicConfiguration) {
    this.apicConfiguration = apicConfiguration;
  }

  
  /**
   * Placeholder for description of property apic_mode of obj type Cloud field type str  type boolean
   * @return apicMode
  **/
  @ApiModelProperty(value = "Placeholder for description of property apic_mode of obj type Cloud field type str  type boolean")


 
  @VsoMethod  
  public Boolean isApicMode() {
    return apicMode;
  }
    
  @VsoMethod
  public void setApicMode(Boolean apicMode) {
    this.apicMode = apicMode;
  }

  
  /**
   * CloudConnector polling interval in seconds for external autoscale groups, minimum 60 seconds. Allowed values are 60-3600. Field introduced in 18.2.2.
   * @return autoscalePollingInterval
  **/
  @ApiModelProperty(value = "CloudConnector polling interval in seconds for external autoscale groups, minimum 60 seconds. Allowed values are 60-3600. Field introduced in 18.2.2.")


 
  @VsoMethod  
  public Integer getAutoscalePollingInterval() {
    return autoscalePollingInterval;
  }
    
  @VsoMethod
  public void setAutoscalePollingInterval(Integer autoscalePollingInterval) {
    this.autoscalePollingInterval = autoscalePollingInterval;
  }

  
  /**
   * Placeholder for description of property aws_configuration of obj type Cloud field type str  type object
   * @return awsConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property aws_configuration of obj type Cloud field type str  type object")

  @Valid

 
  @VsoMethod  
  public AwsConfiguration getAwsConfiguration() {
    return awsConfiguration;
  }
    
  @VsoMethod
  public void setAwsConfiguration(AwsConfiguration awsConfiguration) {
    this.awsConfiguration = awsConfiguration;
  }

  
  /**
   *  Field introduced in 17.2.1.
   * @return azureConfiguration
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public AzureConfiguration getAzureConfiguration() {
    return azureConfiguration;
  }
    
  @VsoMethod
  public void setAzureConfiguration(AzureConfiguration azureConfiguration) {
    this.azureConfiguration = azureConfiguration;
  }

  
  /**
   * Placeholder for description of property cloudstack_configuration of obj type Cloud field type str  type object
   * @return cloudstackConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property cloudstack_configuration of obj type Cloud field type str  type object")

  @Valid

 
  @VsoMethod  
  public CloudStackConfiguration getCloudstackConfiguration() {
    return cloudstackConfiguration;
  }
    
  @VsoMethod
  public void setCloudstackConfiguration(CloudStackConfiguration cloudstackConfiguration) {
    this.cloudstackConfiguration = cloudstackConfiguration;
  }

  
  public Cloud addCustomTagsItem(CustomTag customTagsItem) {
    if (this.customTags == null) {
      this.customTags = new ArrayList<CustomTag>();
    }
    this.customTags.add(customTagsItem);
    return this;
  }
  
  /**
   * Custom tags for all Avi created resources in the cloud infrastructure. Field introduced in 17.1.5.
   * @return customTags
  **/
  @ApiModelProperty(value = "Custom tags for all Avi created resources in the cloud infrastructure. Field introduced in 17.1.5.")

  @Valid

 
  @VsoMethod  
  public List<CustomTag> getCustomTags() {
    return customTags;
  }
    
  @VsoMethod
  public void setCustomTags(List<CustomTag> customTags) {
    this.customTags = customTags;
  }

  
  /**
   * Select the IP address management scheme.
   * @return dhcpEnabled
  **/
  @ApiModelProperty(value = "Select the IP address management scheme.")


 
  @VsoMethod  
  public Boolean isDhcpEnabled() {
    return dhcpEnabled;
  }
    
  @VsoMethod
  public void setDhcpEnabled(Boolean dhcpEnabled) {
    this.dhcpEnabled = dhcpEnabled;
  }

  
  /**
   * DNS Profile for the cloud. It is a reference to an object of type IpamDnsProviderProfile.
   * @return dnsProviderRef
  **/
  @ApiModelProperty(value = "DNS Profile for the cloud. It is a reference to an object of type IpamDnsProviderProfile.")


 
  @VsoMethod  
  public String getDnsProviderRef() {
    return dnsProviderRef;
  }
    
  @VsoMethod
  public void setDnsProviderRef(String dnsProviderRef) {
    this.dnsProviderRef = dnsProviderRef;
  }

  
  /**
   * By default, pool member FQDNs are resolved on the Controller. When this is set, pool member FQDNs are instead resolved on Service Engines in this cloud. This is useful in scenarios where pool member FQDNs can only be resolved from Service Engines and not from the Controller. Field introduced in 18.2.6.
   * @return dnsResolutionOnSe
  **/
  @ApiModelProperty(value = "By default, pool member FQDNs are resolved on the Controller. When this is set, pool member FQDNs are instead resolved on Service Engines in this cloud. This is useful in scenarios where pool member FQDNs can only be resolved from Service Engines and not from the Controller. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Boolean isDnsResolutionOnSe() {
    return dnsResolutionOnSe;
  }
    
  @VsoMethod
  public void setDnsResolutionOnSe(Boolean dnsResolutionOnSe) {
    this.dnsResolutionOnSe = dnsResolutionOnSe;
  }

  
  /**
   * Placeholder for description of property docker_configuration of obj type Cloud field type str  type object
   * @return dockerConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property docker_configuration of obj type Cloud field type str  type object")

  @Valid

 
  @VsoMethod  
  public DockerConfiguration getDockerConfiguration() {
    return dockerConfiguration;
  }
    
  @VsoMethod
  public void setDockerConfiguration(DockerConfiguration dockerConfiguration) {
    this.dockerConfiguration = dockerConfiguration;
  }

  
  /**
   * DNS Profile for East-West services. It is a reference to an object of type IpamDnsProviderProfile.
   * @return eastWestDnsProviderRef
  **/
  @ApiModelProperty(value = "DNS Profile for East-West services. It is a reference to an object of type IpamDnsProviderProfile.")


 
  @VsoMethod  
  public String getEastWestDnsProviderRef() {
    return eastWestDnsProviderRef;
  }
    
  @VsoMethod
  public void setEastWestDnsProviderRef(String eastWestDnsProviderRef) {
    this.eastWestDnsProviderRef = eastWestDnsProviderRef;
  }

  
  /**
   * Ipam Profile for East-West services. Warning - Please use virtual subnets in this IPAM profile that do not conflict with the underlay networks or any overlay networks in the cluster. For example in AWS and GCP, 169.254.0.0/16 is used for storing instance metadata. Hence, it should not be used in this profile. It is a reference to an object of type IpamDnsProviderProfile.
   * @return eastWestIpamProviderRef
  **/
  @ApiModelProperty(value = "Ipam Profile for East-West services. Warning - Please use virtual subnets in this IPAM profile that do not conflict with the underlay networks or any overlay networks in the cluster. For example in AWS and GCP, 169.254.0.0/16 is used for storing instance metadata. Hence, it should not be used in this profile. It is a reference to an object of type IpamDnsProviderProfile.")


 
  @VsoMethod  
  public String getEastWestIpamProviderRef() {
    return eastWestIpamProviderRef;
  }
    
  @VsoMethod
  public void setEastWestIpamProviderRef(String eastWestIpamProviderRef) {
    this.eastWestIpamProviderRef = eastWestIpamProviderRef;
  }

  
  /**
   * Use static routes for VIP side network resolution during VirtualService placement.
   * @return enableVipStaticRoutes
  **/
  @ApiModelProperty(value = "Use static routes for VIP side network resolution during VirtualService placement.")


 
  @VsoMethod  
  public Boolean isEnableVipStaticRoutes() {
    return enableVipStaticRoutes;
  }
    
  @VsoMethod
  public void setEnableVipStaticRoutes(Boolean enableVipStaticRoutes) {
    this.enableVipStaticRoutes = enableVipStaticRoutes;
  }

  
  /**
   * Google Cloud Platform Configuration. Field introduced in 18.2.1.
   * @return gcpConfiguration
  **/
  @ApiModelProperty(value = "Google Cloud Platform Configuration. Field introduced in 18.2.1.")

  @Valid

 
  @VsoMethod  
  public GCPConfiguration getGcpConfiguration() {
    return gcpConfiguration;
  }
    
  @VsoMethod
  public void setGcpConfiguration(GCPConfiguration gcpConfiguration) {
    this.gcpConfiguration = gcpConfiguration;
  }

  
  /**
   * Enable IPv6 auto configuration. Field introduced in 18.1.1.
   * @return ip6AutocfgEnabled
  **/
  @ApiModelProperty(value = "Enable IPv6 auto configuration. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Boolean isIp6AutocfgEnabled() {
    return ip6AutocfgEnabled;
  }
    
  @VsoMethod
  public void setIp6AutocfgEnabled(Boolean ip6AutocfgEnabled) {
    this.ip6AutocfgEnabled = ip6AutocfgEnabled;
  }

  
  /**
   * Ipam Profile for the cloud. It is a reference to an object of type IpamDnsProviderProfile.
   * @return ipamProviderRef
  **/
  @ApiModelProperty(value = "Ipam Profile for the cloud. It is a reference to an object of type IpamDnsProviderProfile.")


 
  @VsoMethod  
  public String getIpamProviderRef() {
    return ipamProviderRef;
  }
    
  @VsoMethod
  public void setIpamProviderRef(String ipamProviderRef) {
    this.ipamProviderRef = ipamProviderRef;
  }

  
  /**
   * Specifies the default license tier which would be used by new SE Groups. This field by default inherits the value from system configuration. Enum options - ENTERPRISE_16, ENTERPRISE_18. Field introduced in 17.2.5.
   * @return licenseTier
  **/
  @ApiModelProperty(value = "Specifies the default license tier which would be used by new SE Groups. This field by default inherits the value from system configuration. Enum options - ENTERPRISE_16, ENTERPRISE_18. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getLicenseTier() {
    return licenseTier;
  }
    
  @VsoMethod
  public void setLicenseTier(String licenseTier) {
    this.licenseTier = licenseTier;
  }

  
  /**
   * If no license type is specified then default license enforcement for the cloud type is chosen. The default mappings are Container Cloud is Max Ses, OpenStack and VMware is cores and linux it is Sockets. Enum options - LIC_BACKEND_SERVERS, LIC_SOCKETS, LIC_CORES, LIC_HOSTS, LIC_SE_BANDWIDTH, LIC_METERED_SE_BANDWIDTH.
   * @return licenseType
  **/
  @ApiModelProperty(value = "If no license type is specified then default license enforcement for the cloud type is chosen. The default mappings are Container Cloud is Max Ses, OpenStack and VMware is cores and linux it is Sockets. Enum options - LIC_BACKEND_SERVERS, LIC_SOCKETS, LIC_CORES, LIC_HOSTS, LIC_SE_BANDWIDTH, LIC_METERED_SE_BANDWIDTH.")


 
  @VsoMethod  
  public String getLicenseType() {
    return licenseType;
  }
    
  @VsoMethod
  public void setLicenseType(String licenseType) {
    this.licenseType = licenseType;
  }

  
  /**
   * Placeholder for description of property linuxserver_configuration of obj type Cloud field type str  type object
   * @return linuxserverConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property linuxserver_configuration of obj type Cloud field type str  type object")

  @Valid

 
  @VsoMethod  
  public LinuxServerConfiguration getLinuxserverConfiguration() {
    return linuxserverConfiguration;
  }
    
  @VsoMethod
  public void setLinuxserverConfiguration(LinuxServerConfiguration linuxserverConfiguration) {
    this.linuxserverConfiguration = linuxserverConfiguration;
  }

  
  /**
   *  Field deprecated in 18.2.2.
   * @return mesosConfiguration
  **/
  @ApiModelProperty(value = " Field deprecated in 18.2.2.")

  @Valid

 
  @VsoMethod  
  public MesosConfiguration getMesosConfiguration() {
    return mesosConfiguration;
  }
    
  @VsoMethod
  public void setMesosConfiguration(MesosConfiguration mesosConfiguration) {
    this.mesosConfiguration = mesosConfiguration;
  }

  
  /**
   * MTU setting for the cloud.
   * @return mtu
  **/
  @ApiModelProperty(value = "MTU setting for the cloud.")


 
  @VsoMethod  
  public Integer getMtu() {
    return mtu;
  }
    
  @VsoMethod
  public void setMtu(Integer mtu) {
    this.mtu = mtu;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
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
   * Configuration parameters for NSX Manager. Field introduced in 17.1.1.
   * @return nsxConfiguration
  **/
  @ApiModelProperty(value = "Configuration parameters for NSX Manager. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public NsxConfiguration getNsxConfiguration() {
    return nsxConfiguration;
  }
    
  @VsoMethod
  public void setNsxConfiguration(NsxConfiguration nsxConfiguration) {
    this.nsxConfiguration = nsxConfiguration;
  }

  
  /**
   * Default prefix for all automatically created objects in this cloud. This prefix can be overridden by the SE-Group template.
   * @return objNamePrefix
  **/
  @ApiModelProperty(value = "Default prefix for all automatically created objects in this cloud. This prefix can be overridden by the SE-Group template.")


 
  @VsoMethod  
  public String getObjNamePrefix() {
    return objNamePrefix;
  }
    
  @VsoMethod
  public void setObjNamePrefix(String objNamePrefix) {
    this.objNamePrefix = objNamePrefix;
  }

  
  /**
   * Placeholder for description of property openstack_configuration of obj type Cloud field type str  type object
   * @return openstackConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property openstack_configuration of obj type Cloud field type str  type object")

  @Valid

 
  @VsoMethod  
  public OpenStackConfiguration getOpenstackConfiguration() {
    return openstackConfiguration;
  }
    
  @VsoMethod
  public void setOpenstackConfiguration(OpenStackConfiguration openstackConfiguration) {
    this.openstackConfiguration = openstackConfiguration;
  }

  
  /**
   * Placeholder for description of property oshiftk8s_configuration of obj type Cloud field type str  type object
   * @return oshiftk8sConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property oshiftk8s_configuration of obj type Cloud field type str  type object")

  @Valid

 
  @VsoMethod  
  public OShiftK8SConfiguration getOshiftk8sConfiguration() {
    return oshiftk8sConfiguration;
  }
    
  @VsoMethod
  public void setOshiftk8sConfiguration(OShiftK8SConfiguration oshiftk8sConfiguration) {
    this.oshiftk8sConfiguration = oshiftk8sConfiguration;
  }

  
  /**
   * Prefer static routes over interface routes during VirtualService placement.
   * @return preferStaticRoutes
  **/
  @ApiModelProperty(value = "Prefer static routes over interface routes during VirtualService placement.")


 
  @VsoMethod  
  public Boolean isPreferStaticRoutes() {
    return preferStaticRoutes;
  }
    
  @VsoMethod
  public void setPreferStaticRoutes(Boolean preferStaticRoutes) {
    this.preferStaticRoutes = preferStaticRoutes;
  }

  
  /**
   * Placeholder for description of property proxy_configuration of obj type Cloud field type str  type object
   * @return proxyConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property proxy_configuration of obj type Cloud field type str  type object")

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
   * Placeholder for description of property rancher_configuration of obj type Cloud field type str  type object
   * @return rancherConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property rancher_configuration of obj type Cloud field type str  type object")

  @Valid

 
  @VsoMethod  
  public RancherConfiguration getRancherConfiguration() {
    return rancherConfiguration;
  }
    
  @VsoMethod
  public void setRancherConfiguration(RancherConfiguration rancherConfiguration) {
    this.rancherConfiguration = rancherConfiguration;
  }

  
  /**
   * The Service Engine Group to use as template. It is a reference to an object of type ServiceEngineGroup. Field introduced in 18.2.5.
   * @return seGroupTemplateRef
  **/
  @ApiModelProperty(value = "The Service Engine Group to use as template. It is a reference to an object of type ServiceEngineGroup. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getSeGroupTemplateRef() {
    return seGroupTemplateRef;
  }
    
  @VsoMethod
  public void setSeGroupTemplateRef(String seGroupTemplateRef) {
    this.seGroupTemplateRef = seGroupTemplateRef;
  }

  
  /**
   * DNS records for VIPs are added/deleted based on the operational state of the VIPs. Field introduced in 17.1.12.
   * @return stateBasedDnsRegistration
  **/
  @ApiModelProperty(value = "DNS records for VIPs are added/deleted based on the operational state of the VIPs. Field introduced in 17.1.12.")


 
  @VsoMethod  
  public Boolean isStateBasedDnsRegistration() {
    return stateBasedDnsRegistration;
  }
    
  @VsoMethod
  public void setStateBasedDnsRegistration(Boolean stateBasedDnsRegistration) {
    this.stateBasedDnsRegistration = stateBasedDnsRegistration;
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
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   * Placeholder for description of property vca_configuration of obj type Cloud field type str  type object
   * @return vcaConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property vca_configuration of obj type Cloud field type str  type object")

  @Valid

 
  @VsoMethod  
  public VCloudAirConfiguration getVcaConfiguration() {
    return vcaConfiguration;
  }
    
  @VsoMethod
  public void setVcaConfiguration(VCloudAirConfiguration vcaConfiguration) {
    this.vcaConfiguration = vcaConfiguration;
  }

  
  /**
   * Placeholder for description of property vcenter_configuration of obj type Cloud field type str  type object
   * @return vcenterConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_configuration of obj type Cloud field type str  type object")

  @Valid

 
  @VsoMethod  
  public VCenterConfiguration getVcenterConfiguration() {
    return vcenterConfiguration;
  }
    
  @VsoMethod
  public void setVcenterConfiguration(VCenterConfiguration vcenterConfiguration) {
    this.vcenterConfiguration = vcenterConfiguration;
  }

  
  /**
   * Cloud type. Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP, CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP.
   * @return vtype
  **/
  @ApiModelProperty(required = true, value = "Cloud type. Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP, CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP.")
  @NotNull


 
  @VsoMethod  
  public String getVtype() {
    return vtype;
  }
    
  @VsoMethod
  public void setVtype(String vtype) {
    this.vtype = vtype;
  }

  
  public String getObjectID() {
		return "Cloud";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cloud cloud = (Cloud) o;
    return Objects.equals(this.lastModified, cloud.lastModified) &&
        Objects.equals(this.apicConfiguration, cloud.apicConfiguration) &&
        Objects.equals(this.apicMode, cloud.apicMode) &&
        Objects.equals(this.autoscalePollingInterval, cloud.autoscalePollingInterval) &&
        Objects.equals(this.awsConfiguration, cloud.awsConfiguration) &&
        Objects.equals(this.azureConfiguration, cloud.azureConfiguration) &&
        Objects.equals(this.cloudstackConfiguration, cloud.cloudstackConfiguration) &&
        Objects.equals(this.customTags, cloud.customTags) &&
        Objects.equals(this.dhcpEnabled, cloud.dhcpEnabled) &&
        Objects.equals(this.dnsProviderRef, cloud.dnsProviderRef) &&
        Objects.equals(this.dnsResolutionOnSe, cloud.dnsResolutionOnSe) &&
        Objects.equals(this.dockerConfiguration, cloud.dockerConfiguration) &&
        Objects.equals(this.eastWestDnsProviderRef, cloud.eastWestDnsProviderRef) &&
        Objects.equals(this.eastWestIpamProviderRef, cloud.eastWestIpamProviderRef) &&
        Objects.equals(this.enableVipStaticRoutes, cloud.enableVipStaticRoutes) &&
        Objects.equals(this.gcpConfiguration, cloud.gcpConfiguration) &&
        Objects.equals(this.ip6AutocfgEnabled, cloud.ip6AutocfgEnabled) &&
        Objects.equals(this.ipamProviderRef, cloud.ipamProviderRef) &&
        Objects.equals(this.licenseTier, cloud.licenseTier) &&
        Objects.equals(this.licenseType, cloud.licenseType) &&
        Objects.equals(this.linuxserverConfiguration, cloud.linuxserverConfiguration) &&
        Objects.equals(this.mesosConfiguration, cloud.mesosConfiguration) &&
        Objects.equals(this.mtu, cloud.mtu) &&
        Objects.equals(this.name, cloud.name) &&
        Objects.equals(this.nsxConfiguration, cloud.nsxConfiguration) &&
        Objects.equals(this.objNamePrefix, cloud.objNamePrefix) &&
        Objects.equals(this.openstackConfiguration, cloud.openstackConfiguration) &&
        Objects.equals(this.oshiftk8sConfiguration, cloud.oshiftk8sConfiguration) &&
        Objects.equals(this.preferStaticRoutes, cloud.preferStaticRoutes) &&
        Objects.equals(this.proxyConfiguration, cloud.proxyConfiguration) &&
        Objects.equals(this.rancherConfiguration, cloud.rancherConfiguration) &&
        Objects.equals(this.seGroupTemplateRef, cloud.seGroupTemplateRef) &&
        Objects.equals(this.stateBasedDnsRegistration, cloud.stateBasedDnsRegistration) &&
        Objects.equals(this.tenantRef, cloud.tenantRef) &&
        Objects.equals(this.url, cloud.url) &&
        Objects.equals(this.uuid, cloud.uuid) &&
        Objects.equals(this.vcaConfiguration, cloud.vcaConfiguration) &&
        Objects.equals(this.vcenterConfiguration, cloud.vcenterConfiguration) &&
        Objects.equals(this.vtype, cloud.vtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, apicConfiguration, apicMode, autoscalePollingInterval, awsConfiguration, azureConfiguration, cloudstackConfiguration, customTags, dhcpEnabled, dnsProviderRef, dnsResolutionOnSe, dockerConfiguration, eastWestDnsProviderRef, eastWestIpamProviderRef, enableVipStaticRoutes, gcpConfiguration, ip6AutocfgEnabled, ipamProviderRef, licenseTier, licenseType, linuxserverConfiguration, mesosConfiguration, mtu, name, nsxConfiguration, objNamePrefix, openstackConfiguration, oshiftk8sConfiguration, preferStaticRoutes, proxyConfiguration, rancherConfiguration, seGroupTemplateRef, stateBasedDnsRegistration, tenantRef, url, uuid, vcaConfiguration, vcenterConfiguration, vtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cloud {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    apicConfiguration: ").append(toIndentedString(apicConfiguration)).append("\n");
    sb.append("    apicMode: ").append(toIndentedString(apicMode)).append("\n");
    sb.append("    autoscalePollingInterval: ").append(toIndentedString(autoscalePollingInterval)).append("\n");
    sb.append("    awsConfiguration: ").append(toIndentedString(awsConfiguration)).append("\n");
    sb.append("    azureConfiguration: ").append(toIndentedString(azureConfiguration)).append("\n");
    sb.append("    cloudstackConfiguration: ").append(toIndentedString(cloudstackConfiguration)).append("\n");
    sb.append("    customTags: ").append(toIndentedString(customTags)).append("\n");
    sb.append("    dhcpEnabled: ").append(toIndentedString(dhcpEnabled)).append("\n");
    sb.append("    dnsProviderRef: ").append(toIndentedString(dnsProviderRef)).append("\n");
    sb.append("    dnsResolutionOnSe: ").append(toIndentedString(dnsResolutionOnSe)).append("\n");
    sb.append("    dockerConfiguration: ").append(toIndentedString(dockerConfiguration)).append("\n");
    sb.append("    eastWestDnsProviderRef: ").append(toIndentedString(eastWestDnsProviderRef)).append("\n");
    sb.append("    eastWestIpamProviderRef: ").append(toIndentedString(eastWestIpamProviderRef)).append("\n");
    sb.append("    enableVipStaticRoutes: ").append(toIndentedString(enableVipStaticRoutes)).append("\n");
    sb.append("    gcpConfiguration: ").append(toIndentedString(gcpConfiguration)).append("\n");
    sb.append("    ip6AutocfgEnabled: ").append(toIndentedString(ip6AutocfgEnabled)).append("\n");
    sb.append("    ipamProviderRef: ").append(toIndentedString(ipamProviderRef)).append("\n");
    sb.append("    licenseTier: ").append(toIndentedString(licenseTier)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    linuxserverConfiguration: ").append(toIndentedString(linuxserverConfiguration)).append("\n");
    sb.append("    mesosConfiguration: ").append(toIndentedString(mesosConfiguration)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nsxConfiguration: ").append(toIndentedString(nsxConfiguration)).append("\n");
    sb.append("    objNamePrefix: ").append(toIndentedString(objNamePrefix)).append("\n");
    sb.append("    openstackConfiguration: ").append(toIndentedString(openstackConfiguration)).append("\n");
    sb.append("    oshiftk8sConfiguration: ").append(toIndentedString(oshiftk8sConfiguration)).append("\n");
    sb.append("    preferStaticRoutes: ").append(toIndentedString(preferStaticRoutes)).append("\n");
    sb.append("    proxyConfiguration: ").append(toIndentedString(proxyConfiguration)).append("\n");
    sb.append("    rancherConfiguration: ").append(toIndentedString(rancherConfiguration)).append("\n");
    sb.append("    seGroupTemplateRef: ").append(toIndentedString(seGroupTemplateRef)).append("\n");
    sb.append("    stateBasedDnsRegistration: ").append(toIndentedString(stateBasedDnsRegistration)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vcaConfiguration: ").append(toIndentedString(vcaConfiguration)).append("\n");
    sb.append("    vcenterConfiguration: ").append(toIndentedString(vcenterConfiguration)).append("\n");
    sb.append("    vtype: ").append(toIndentedString(vtype)).append("\n");
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

