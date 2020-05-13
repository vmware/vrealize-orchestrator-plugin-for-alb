package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.OpenStackHypervisorProperties;
import com.vmware.avi.vro.model.OpenStackRoleMapping;
import com.vmware.avi.vro.model.OpenStackVipNetwork;
import com.vmware.avi.vro.model.Property;
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
 * OpenStackConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "OpenStackConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_OPENSTACKCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class OpenStackConfiguration extends AviRestResource  {
  @JsonProperty("admin_tenant")
  private String adminTenant = null;

  @JsonProperty("admin_tenant_uuid")
  private String adminTenantUuid = null;

  @JsonProperty("allowed_address_pairs")
  private Boolean allowedAddressPairs = true;

  @JsonProperty("anti_affinity")
  private Boolean antiAffinity = true;

  @JsonProperty("auth_url")
  private String authUrl = null;

  @JsonProperty("config_drive")
  private Boolean configDrive = true;

  @JsonProperty("contrail_disable_policy")
  private Boolean contrailDisablePolicy = null;

  @JsonProperty("contrail_endpoint")
  private String contrailEndpoint = null;

  @JsonProperty("contrail_plugin")
  private Boolean contrailPlugin = null;

  @JsonProperty("custom_se_image_properties")
  @Valid
  private List<Property> customSeImageProperties = null;

  @JsonProperty("external_networks")
  private Boolean externalNetworks = null;

  @JsonProperty("free_floatingips")
  private Boolean freeFloatingips = null;

  @JsonProperty("hypervisor")
  private String hypervisor = "KVM";

  @JsonProperty("hypervisor_properties")
  @Valid
  private List<OpenStackHypervisorProperties> hypervisorProperties = null;

  @JsonProperty("img_format")
  private String imgFormat = "OS_IMG_FMT_AUTO";

  @JsonProperty("import_keystone_tenants")
  private Boolean importKeystoneTenants = true;

  @JsonProperty("insecure")
  private Boolean insecure = true;

  @JsonProperty("intf_sec_ips")
  private Boolean intfSecIps = null;

  @JsonProperty("keystone_host")
  private String keystoneHost = null;

  @JsonProperty("map_admin_to_cloudadmin")
  private Boolean mapAdminToCloudadmin = null;

  @JsonProperty("mgmt_network_name")
  private String mgmtNetworkName = null;

  @JsonProperty("mgmt_network_uuid")
  private String mgmtNetworkUuid = null;

  @JsonProperty("name_owner")
  private Boolean nameOwner = true;

  @JsonProperty("neutron_rbac")
  private Boolean neutronRbac = true;

  @JsonProperty("nuage_organization")
  private String nuageOrganization = null;

  @JsonProperty("nuage_password")
  private String nuagePassword = null;

  @JsonProperty("nuage_port")
  private Integer nuagePort = 8443;

  @JsonProperty("nuage_username")
  private String nuageUsername = null;

  @JsonProperty("nuage_virtualip")
  private Boolean nuageVirtualip = null;

  @JsonProperty("nuage_vsd_host")
  private String nuageVsdHost = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("port_security")
  private Boolean portSecurity = null;

  @JsonProperty("privilege")
  private String privilege = null;

  @JsonProperty("prov_name")
  @Valid
  private List<String> provName = null;

  @JsonProperty("provider_vip_networks")
  @Valid
  private List<OpenStackVipNetwork> providerVipNetworks = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("role_mapping")
  @Valid
  private List<OpenStackRoleMapping> roleMapping = null;

  @JsonProperty("se_group_ref")
  private String seGroupRef = null;

  @JsonProperty("security_groups")
  private Boolean securityGroups = true;

  @JsonProperty("tenant_se")
  private Boolean tenantSe = true;

  @JsonProperty("usable_network_uuids")
  @Valid
  private List<String> usableNetworkUuids = null;

  @JsonProperty("use_admin_url")
  private Boolean useAdminUrl = true;

  @JsonProperty("use_internal_endpoints")
  private Boolean useInternalEndpoints = null;

  @JsonProperty("use_keystone_auth")
  private Boolean useKeystoneAuth = true;

  @JsonProperty("use_nuagevip")
  private Boolean useNuagevip = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("wildcard_access")
  private Boolean wildcardAccess = null;

  
  /**
   * OpenStack admin tenant (or project) information. For Keystone v3, provide the project information in project@domain format. Domain need not be specified if the project belongs to the 'Default' domain.
   * @return adminTenant
  **/
  @ApiModelProperty(required = true, value = "OpenStack admin tenant (or project) information. For Keystone v3, provide the project information in project@domain format. Domain need not be specified if the project belongs to the 'Default' domain.")
  @NotNull


 
  @VsoMethod  
  public String getAdminTenant() {
    return adminTenant;
  }
    
  @VsoMethod
  public void setAdminTenant(String adminTenant) {
    this.adminTenant = adminTenant;
  }

  
  /**
   * admin-tenant's UUID in OpenStack.
   * @return adminTenantUuid
  **/
  @ApiModelProperty(value = "admin-tenant's UUID in OpenStack.")


 
  @VsoMethod  
  public String getAdminTenantUuid() {
    return adminTenantUuid;
  }
    
  @VsoMethod
  public void setAdminTenantUuid(String adminTenantUuid) {
    this.adminTenantUuid = adminTenantUuid;
  }

  
  /**
   * If false, allowed-address-pairs extension will not be used. .
   * @return allowedAddressPairs
  **/
  @ApiModelProperty(value = "If false, allowed-address-pairs extension will not be used. .")


 
  @VsoMethod  
  public Boolean isAllowedAddressPairs() {
    return allowedAddressPairs;
  }
    
  @VsoMethod
  public void setAllowedAddressPairs(Boolean allowedAddressPairs) {
    this.allowedAddressPairs = allowedAddressPairs;
  }

  
  /**
   * If true, an anti-affinity policy will be applied to all SEs of a SE-Group, else no such policy will be applied.
   * @return antiAffinity
  **/
  @ApiModelProperty(value = "If true, an anti-affinity policy will be applied to all SEs of a SE-Group, else no such policy will be applied.")


 
  @VsoMethod  
  public Boolean isAntiAffinity() {
    return antiAffinity;
  }
    
  @VsoMethod
  public void setAntiAffinity(Boolean antiAffinity) {
    this.antiAffinity = antiAffinity;
  }

  
  /**
   * Auth URL for connecting to keystone. If this is specified, any value provided for keystone_host is ignored.
   * @return authUrl
  **/
  @ApiModelProperty(value = "Auth URL for connecting to keystone. If this is specified, any value provided for keystone_host is ignored.")


 
  @VsoMethod  
  public String getAuthUrl() {
    return authUrl;
  }
    
  @VsoMethod
  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }

  
  /**
   * If false, metadata service will be used instead of  config-drive functionality to retrieve SE VM metadata.
   * @return configDrive
  **/
  @ApiModelProperty(value = "If false, metadata service will be used instead of  config-drive functionality to retrieve SE VM metadata.")


 
  @VsoMethod  
  public Boolean isConfigDrive() {
    return configDrive;
  }
    
  @VsoMethod
  public void setConfigDrive(Boolean configDrive) {
    this.configDrive = configDrive;
  }

  
  /**
   * When set to True, the VIP and Data ports will be programmed to set virtual machine interface disable-policy. Please refer Contrail documentation for more on disable-policy. Field introduced in 18.1.2.
   * @return contrailDisablePolicy
  **/
  @ApiModelProperty(value = "When set to True, the VIP and Data ports will be programmed to set virtual machine interface disable-policy. Please refer Contrail documentation for more on disable-policy. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Boolean isContrailDisablePolicy() {
    return contrailDisablePolicy;
  }
    
  @VsoMethod
  public void setContrailDisablePolicy(Boolean contrailDisablePolicy) {
    this.contrailDisablePolicy = contrailDisablePolicy;
  }

  
  /**
   * Contrail VNC endpoint url (example http //10.10.10.100 8082). By default, 'http //' scheme and 8082 port will be used if not provided in the url.
   * @return contrailEndpoint
  **/
  @ApiModelProperty(value = "Contrail VNC endpoint url (example http //10.10.10.100 8082). By default, 'http //' scheme and 8082 port will be used if not provided in the url.")


 
  @VsoMethod  
  public String getContrailEndpoint() {
    return contrailEndpoint;
  }
    
  @VsoMethod
  public void setContrailEndpoint(String contrailEndpoint) {
    this.contrailEndpoint = contrailEndpoint;
  }

  
  /**
   * Enable Contrail plugin mode. (deprecated).
   * @return contrailPlugin
  **/
  @ApiModelProperty(value = "Enable Contrail plugin mode. (deprecated).")


 
  @VsoMethod  
  public Boolean isContrailPlugin() {
    return contrailPlugin;
  }
    
  @VsoMethod
  public void setContrailPlugin(Boolean contrailPlugin) {
    this.contrailPlugin = contrailPlugin;
  }

  
  public OpenStackConfiguration addCustomSeImagePropertiesItem(Property customSeImagePropertiesItem) {
    if (this.customSeImageProperties == null) {
      this.customSeImageProperties = new ArrayList<Property>();
    }
    this.customSeImageProperties.add(customSeImagePropertiesItem);
    return this;
  }
  
  /**
   * Custom image properties to be set on a Service Engine image. Only hw_vif_multiqueue_enabled property is supported. Other properties will be ignored. Field introduced in 18.2.7, 20.1.1.
   * @return customSeImageProperties
  **/
  @ApiModelProperty(value = "Custom image properties to be set on a Service Engine image. Only hw_vif_multiqueue_enabled property is supported. Other properties will be ignored. Field introduced in 18.2.7, 20.1.1.")

  @Valid

 
  @VsoMethod  
  public List<Property> getCustomSeImageProperties() {
    return customSeImageProperties;
  }
    
  @VsoMethod
  public void setCustomSeImageProperties(List<Property> customSeImageProperties) {
    this.customSeImageProperties = customSeImageProperties;
  }

  
  /**
   * If True, allow selection of networks marked as 'external' for management,  vip or data networks.
   * @return externalNetworks
  **/
  @ApiModelProperty(value = "If True, allow selection of networks marked as 'external' for management,  vip or data networks.")


 
  @VsoMethod  
  public Boolean isExternalNetworks() {
    return externalNetworks;
  }
    
  @VsoMethod
  public void setExternalNetworks(Boolean externalNetworks) {
    this.externalNetworks = externalNetworks;
  }

  
  /**
   * Free unused floating IPs.
   * @return freeFloatingips
  **/
  @ApiModelProperty(value = "Free unused floating IPs.")


 
  @VsoMethod  
  public Boolean isFreeFloatingips() {
    return freeFloatingips;
  }
    
  @VsoMethod
  public void setFreeFloatingips(Boolean freeFloatingips) {
    this.freeFloatingips = freeFloatingips;
  }

  
  /**
   * Default hypervisor type. Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * @return hypervisor
  **/
  @ApiModelProperty(value = "Default hypervisor type. Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.")


 
  @VsoMethod  
  public String getHypervisor() {
    return hypervisor;
  }
    
  @VsoMethod
  public void setHypervisor(String hypervisor) {
    this.hypervisor = hypervisor;
  }

  
  public OpenStackConfiguration addHypervisorPropertiesItem(OpenStackHypervisorProperties hypervisorPropertiesItem) {
    if (this.hypervisorProperties == null) {
      this.hypervisorProperties = new ArrayList<OpenStackHypervisorProperties>();
    }
    this.hypervisorProperties.add(hypervisorPropertiesItem);
    return this;
  }
  
  /**
   * Custom properties per hypervisor type. Field introduced in 17.2.1.
   * @return hypervisorProperties
  **/
  @ApiModelProperty(value = "Custom properties per hypervisor type. Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public List<OpenStackHypervisorProperties> getHypervisorProperties() {
    return hypervisorProperties;
  }
    
  @VsoMethod
  public void setHypervisorProperties(List<OpenStackHypervisorProperties> hypervisorProperties) {
    this.hypervisorProperties = hypervisorProperties;
  }

  
  /**
   * If OS_IMG_FMT_RAW, use RAW images else use QCOW2 or streamOptimized/flat VMDK as appropriate. . Enum options - OS_IMG_FMT_AUTO, OS_IMG_FMT_QCOW2, OS_IMG_FMT_VMDK, OS_IMG_FMT_RAW, OS_IMG_FMT_FLAT.
   * @return imgFormat
  **/
  @ApiModelProperty(value = "If OS_IMG_FMT_RAW, use RAW images else use QCOW2 or streamOptimized/flat VMDK as appropriate. . Enum options - OS_IMG_FMT_AUTO, OS_IMG_FMT_QCOW2, OS_IMG_FMT_VMDK, OS_IMG_FMT_RAW, OS_IMG_FMT_FLAT.")


 
  @VsoMethod  
  public String getImgFormat() {
    return imgFormat;
  }
    
  @VsoMethod
  public void setImgFormat(String imgFormat) {
    this.imgFormat = imgFormat;
  }

  
  /**
   * Import keystone tenants list into Avi.
   * @return importKeystoneTenants
  **/
  @ApiModelProperty(value = "Import keystone tenants list into Avi.")


 
  @VsoMethod  
  public Boolean isImportKeystoneTenants() {
    return importKeystoneTenants;
  }
    
  @VsoMethod
  public void setImportKeystoneTenants(Boolean importKeystoneTenants) {
    this.importKeystoneTenants = importKeystoneTenants;
  }

  
  /**
   * Allow self-signed certificates when communicating with https service endpoints.
   * @return insecure
  **/
  @ApiModelProperty(value = "Allow self-signed certificates when communicating with https service endpoints.")


 
  @VsoMethod  
  public Boolean isInsecure() {
    return insecure;
  }
    
  @VsoMethod
  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }

  
  /**
   * If True, interface-secondary-ips method will be used for VIP association. Field deprecated in 18.1.2.
   * @return intfSecIps
  **/
  @ApiModelProperty(value = "If True, interface-secondary-ips method will be used for VIP association. Field deprecated in 18.1.2.")


 
  @VsoMethod  
  public Boolean isIntfSecIps() {
    return intfSecIps;
  }
    
  @VsoMethod
  public void setIntfSecIps(Boolean intfSecIps) {
    this.intfSecIps = intfSecIps;
  }

  
  /**
   * Keystone's hostname or IP address. (Deprecated) Use auth_url instead.
   * @return keystoneHost
  **/
  @ApiModelProperty(value = "Keystone's hostname or IP address. (Deprecated) Use auth_url instead.")


 
  @VsoMethod  
  public String getKeystoneHost() {
    return keystoneHost;
  }
    
  @VsoMethod
  public void setKeystoneHost(String keystoneHost) {
    this.keystoneHost = keystoneHost;
  }

  
  /**
   * If True, map Avi 'admin' tenant to the admin_tenant of the Cloud. Else map Avi 'admin' to OpenStack 'admin' tenant.
   * @return mapAdminToCloudadmin
  **/
  @ApiModelProperty(value = "If True, map Avi 'admin' tenant to the admin_tenant of the Cloud. Else map Avi 'admin' to OpenStack 'admin' tenant.")


 
  @VsoMethod  
  public Boolean isMapAdminToCloudadmin() {
    return mapAdminToCloudadmin;
  }
    
  @VsoMethod
  public void setMapAdminToCloudadmin(Boolean mapAdminToCloudadmin) {
    this.mapAdminToCloudadmin = mapAdminToCloudadmin;
  }

  
  /**
   * Avi Management network name or cidr.
   * @return mgmtNetworkName
  **/
  @ApiModelProperty(required = true, value = "Avi Management network name or cidr.")
  @NotNull


 
  @VsoMethod  
  public String getMgmtNetworkName() {
    return mgmtNetworkName;
  }
    
  @VsoMethod
  public void setMgmtNetworkName(String mgmtNetworkName) {
    this.mgmtNetworkName = mgmtNetworkName;
  }

  
  /**
   * Management network UUID.
   * @return mgmtNetworkUuid
  **/
  @ApiModelProperty(value = "Management network UUID.")


 
  @VsoMethod  
  public String getMgmtNetworkUuid() {
    return mgmtNetworkUuid;
  }
    
  @VsoMethod
  public void setMgmtNetworkUuid(String mgmtNetworkUuid) {
    this.mgmtNetworkUuid = mgmtNetworkUuid;
  }

  
  /**
   * If True, embed owner info in VIP port 'name', else embed owner info in 'device_id' field.
   * @return nameOwner
  **/
  @ApiModelProperty(value = "If True, embed owner info in VIP port 'name', else embed owner info in 'device_id' field.")


 
  @VsoMethod  
  public Boolean isNameOwner() {
    return nameOwner;
  }
    
  @VsoMethod
  public void setNameOwner(Boolean nameOwner) {
    this.nameOwner = nameOwner;
  }

  
  /**
   * If True, enable neutron rbac discovery of networks shared across tenants/projects.
   * @return neutronRbac
  **/
  @ApiModelProperty(value = "If True, enable neutron rbac discovery of networks shared across tenants/projects.")


 
  @VsoMethod  
  public Boolean isNeutronRbac() {
    return neutronRbac;
  }
    
  @VsoMethod
  public void setNeutronRbac(Boolean neutronRbac) {
    this.neutronRbac = neutronRbac;
  }

  
  /**
   * nuage_organization of OpenStackConfiguration.
   * @return nuageOrganization
  **/
  @ApiModelProperty(value = "nuage_organization of OpenStackConfiguration.")


 
  @VsoMethod  
  public String getNuageOrganization() {
    return nuageOrganization;
  }
    
  @VsoMethod
  public void setNuageOrganization(String nuageOrganization) {
    this.nuageOrganization = nuageOrganization;
  }

  
  /**
   * nuage_password of OpenStackConfiguration.
   * @return nuagePassword
  **/
  @ApiModelProperty(value = "nuage_password of OpenStackConfiguration.")


 
  @VsoMethod  
  public String getNuagePassword() {
    return nuagePassword;
  }
    
  @VsoMethod
  public void setNuagePassword(String nuagePassword) {
    this.nuagePassword = nuagePassword;
  }

  
  /**
   * Number of nuage_port.
   * @return nuagePort
  **/
  @ApiModelProperty(value = "Number of nuage_port.")


 
  @VsoMethod  
  public Integer getNuagePort() {
    return nuagePort;
  }
    
  @VsoMethod
  public void setNuagePort(Integer nuagePort) {
    this.nuagePort = nuagePort;
  }

  
  /**
   * nuage_username of OpenStackConfiguration.
   * @return nuageUsername
  **/
  @ApiModelProperty(value = "nuage_username of OpenStackConfiguration.")


 
  @VsoMethod  
  public String getNuageUsername() {
    return nuageUsername;
  }
    
  @VsoMethod
  public void setNuageUsername(String nuageUsername) {
    this.nuageUsername = nuageUsername;
  }

  
  /**
   * Applicable only if allowed-address-pairs is disabled or unusable. VIP placement uses Nuage virtualIp if true, else redirectionTarget. Field introduced in 17.2.3.
   * @return nuageVirtualip
  **/
  @ApiModelProperty(value = "Applicable only if allowed-address-pairs is disabled or unusable. VIP placement uses Nuage virtualIp if true, else redirectionTarget. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public Boolean isNuageVirtualip() {
    return nuageVirtualip;
  }
    
  @VsoMethod
  public void setNuageVirtualip(Boolean nuageVirtualip) {
    this.nuageVirtualip = nuageVirtualip;
  }

  
  /**
   * Nuage VSD host name or IP address.
   * @return nuageVsdHost
  **/
  @ApiModelProperty(value = "Nuage VSD host name or IP address.")


 
  @VsoMethod  
  public String getNuageVsdHost() {
    return nuageVsdHost;
  }
    
  @VsoMethod
  public void setNuageVsdHost(String nuageVsdHost) {
    this.nuageVsdHost = nuageVsdHost;
  }

  
  /**
   * The password Avi Vantage will use when authenticating to Keystone.
   * @return password
  **/
  @ApiModelProperty(value = "The password Avi Vantage will use when authenticating to Keystone.")


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * If true, port-security extension (if detected) will be used instead of security-groups, allowed-address-pairs or interface-secondary-ips. If false, port-security extension is skipped.
   * @return portSecurity
  **/
  @ApiModelProperty(value = "If true, port-security extension (if detected) will be used instead of security-groups, allowed-address-pairs or interface-secondary-ips. If false, port-security extension is skipped.")


 
  @VsoMethod  
  public Boolean isPortSecurity() {
    return portSecurity;
  }
    
  @VsoMethod
  public void setPortSecurity(Boolean portSecurity) {
    this.portSecurity = portSecurity;
  }

  
  /**
   * Access privilege. Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
   * @return privilege
  **/
  @ApiModelProperty(required = true, value = "Access privilege. Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.")
  @NotNull


 
  @VsoMethod  
  public String getPrivilege() {
    return privilege;
  }
    
  @VsoMethod
  public void setPrivilege(String privilege) {
    this.privilege = privilege;
  }

  
  public OpenStackConfiguration addProvNameItem(String provNameItem) {
    if (this.provName == null) {
      this.provName = new ArrayList<String>();
    }
    this.provName.add(provNameItem);
    return this;
  }
  
  /**
   * LBaaS provider name.
   * @return provName
  **/
  @ApiModelProperty(value = "LBaaS provider name.")


 
  @VsoMethod  
  public List<String> getProvName() {
    return provName;
  }
    
  @VsoMethod
  public void setProvName(List<String> provName) {
    this.provName = provName;
  }

  
  public OpenStackConfiguration addProviderVipNetworksItem(OpenStackVipNetwork providerVipNetworksItem) {
    if (this.providerVipNetworks == null) {
      this.providerVipNetworks = new ArrayList<OpenStackVipNetwork>();
    }
    this.providerVipNetworks.add(providerVipNetworksItem);
    return this;
  }
  
  /**
   * A tenant can normally use its own networks and any networks shared with it. In addition, this setting provides extra networks that are usable by tenants. Field introduced in 18.1.2.
   * @return providerVipNetworks
  **/
  @ApiModelProperty(value = "A tenant can normally use its own networks and any networks shared with it. In addition, this setting provides extra networks that are usable by tenants. Field introduced in 18.1.2.")

  @Valid

 
  @VsoMethod  
  public List<OpenStackVipNetwork> getProviderVipNetworks() {
    return providerVipNetworks;
  }
    
  @VsoMethod
  public void setProviderVipNetworks(List<OpenStackVipNetwork> providerVipNetworks) {
    this.providerVipNetworks = providerVipNetworks;
  }

  
  /**
   * Region name.
   * @return region
  **/
  @ApiModelProperty(value = "Region name.")


 
  @VsoMethod  
  public String getRegion() {
    return region;
  }
    
  @VsoMethod
  public void setRegion(String region) {
    this.region = region;
  }

  
  public OpenStackConfiguration addRoleMappingItem(OpenStackRoleMapping roleMappingItem) {
    if (this.roleMapping == null) {
      this.roleMapping = new ArrayList<OpenStackRoleMapping>();
    }
    this.roleMapping.add(roleMappingItem);
    return this;
  }
  
  /**
   * Defines the mapping from OpenStack role names to avi local role names. For an OpenStack role, this mapping is consulted only if there is no local Avi role with the same name as the OpenStack role. This is an ordered list and only the first matching entry is used. You can use '*' to match all OpenStack role names.
   * @return roleMapping
  **/
  @ApiModelProperty(value = "Defines the mapping from OpenStack role names to avi local role names. For an OpenStack role, this mapping is consulted only if there is no local Avi role with the same name as the OpenStack role. This is an ordered list and only the first matching entry is used. You can use '*' to match all OpenStack role names.")

  @Valid

 
  @VsoMethod  
  public List<OpenStackRoleMapping> getRoleMapping() {
    return roleMapping;
  }
    
  @VsoMethod
  public void setRoleMapping(List<OpenStackRoleMapping> roleMapping) {
    this.roleMapping = roleMapping;
  }

  
  /**
   * This field has been generalized for all clouds and has been renamed to se_group_template_uuid. It is a reference to an object of type ServiceEngineGroup. Field deprecated in 18.2.5.
   * @return seGroupRef
  **/
  @ApiModelProperty(value = "This field has been generalized for all clouds and has been renamed to se_group_template_uuid. It is a reference to an object of type ServiceEngineGroup. Field deprecated in 18.2.5.")


 
  @VsoMethod  
  public String getSeGroupRef() {
    return seGroupRef;
  }
    
  @VsoMethod
  public void setSeGroupRef(String seGroupRef) {
    this.seGroupRef = seGroupRef;
  }

  
  /**
   * If false, security-groups extension will not be used. .
   * @return securityGroups
  **/
  @ApiModelProperty(value = "If false, security-groups extension will not be used. .")


 
  @VsoMethod  
  public Boolean isSecurityGroups() {
    return securityGroups;
  }
    
  @VsoMethod
  public void setSecurityGroups(Boolean securityGroups) {
    this.securityGroups = securityGroups;
  }

  
  /**
   * If true, then SEs will be created in the appropriate tenants, else SEs will be created in the admin_tenant.
   * @return tenantSe
  **/
  @ApiModelProperty(value = "If true, then SEs will be created in the appropriate tenants, else SEs will be created in the admin_tenant.")


 
  @VsoMethod  
  public Boolean isTenantSe() {
    return tenantSe;
  }
    
  @VsoMethod
  public void setTenantSe(Boolean tenantSe) {
    this.tenantSe = tenantSe;
  }

  
  public OpenStackConfiguration addUsableNetworkUuidsItem(String usableNetworkUuidsItem) {
    if (this.usableNetworkUuids == null) {
      this.usableNetworkUuids = new ArrayList<String>();
    }
    this.usableNetworkUuids.add(usableNetworkUuidsItem);
    return this;
  }
  
  /**
   * Deprecated, please use provider_vip_networks. Field deprecated in 18.2.2. Field introduced in 17.1.1.
   * @return usableNetworkUuids
  **/
  @ApiModelProperty(value = "Deprecated, please use provider_vip_networks. Field deprecated in 18.2.2. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public List<String> getUsableNetworkUuids() {
    return usableNetworkUuids;
  }
    
  @VsoMethod
  public void setUsableNetworkUuids(List<String> usableNetworkUuids) {
    this.usableNetworkUuids = usableNetworkUuids;
  }

  
  /**
   * If admin URLs are either inaccessible or not to be accessed from Avi Controller, then set this to False.
   * @return useAdminUrl
  **/
  @ApiModelProperty(value = "If admin URLs are either inaccessible or not to be accessed from Avi Controller, then set this to False.")


 
  @VsoMethod  
  public Boolean isUseAdminUrl() {
    return useAdminUrl;
  }
    
  @VsoMethod
  public void setUseAdminUrl(Boolean useAdminUrl) {
    this.useAdminUrl = useAdminUrl;
  }

  
  /**
   * Use internalURL for OpenStack endpoints instead of the default publicURL endpoints.
   * @return useInternalEndpoints
  **/
  @ApiModelProperty(value = "Use internalURL for OpenStack endpoints instead of the default publicURL endpoints.")


 
  @VsoMethod  
  public Boolean isUseInternalEndpoints() {
    return useInternalEndpoints;
  }
    
  @VsoMethod
  public void setUseInternalEndpoints(Boolean useInternalEndpoints) {
    this.useInternalEndpoints = useInternalEndpoints;
  }

  
  /**
   * Use keystone for user authentication.
   * @return useKeystoneAuth
  **/
  @ApiModelProperty(value = "Use keystone for user authentication.")


 
  @VsoMethod  
  public Boolean isUseKeystoneAuth() {
    return useKeystoneAuth;
  }
    
  @VsoMethod
  public void setUseKeystoneAuth(Boolean useKeystoneAuth) {
    this.useKeystoneAuth = useKeystoneAuth;
  }

  
  /**
   * If True, use nuage vip as device_owner of VIP ports, else use neutron LOADBALANCER. Field introduced in 17.2.1.
   * @return useNuagevip
  **/
  @ApiModelProperty(value = "If True, use nuage vip as device_owner of VIP ports, else use neutron LOADBALANCER. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public Boolean isUseNuagevip() {
    return useNuagevip;
  }
    
  @VsoMethod
  public void setUseNuagevip(Boolean useNuagevip) {
    this.useNuagevip = useNuagevip;
  }

  
  /**
   * The username Avi Vantage will use when authenticating to Keystone. For Keystone v3, provide the user information in user@domain format, unless that user belongs to the Default domain.
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The username Avi Vantage will use when authenticating to Keystone. For Keystone v3, provide the user information in user@domain format, unless that user belongs to the Default domain.")
  @NotNull


 
  @VsoMethod  
  public String getUsername() {
    return username;
  }
    
  @VsoMethod
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   * If enabled, program SE security group with ingress rule to allow SSH (port 22) access from 0.0.0.0/0. Field deprecated in 17.1.5. Field introduced in 17.1.3.
   * @return wildcardAccess
  **/
  @ApiModelProperty(value = "If enabled, program SE security group with ingress rule to allow SSH (port 22) access from 0.0.0.0/0. Field deprecated in 17.1.5. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Boolean isWildcardAccess() {
    return wildcardAccess;
  }
    
  @VsoMethod
  public void setWildcardAccess(Boolean wildcardAccess) {
    this.wildcardAccess = wildcardAccess;
  }

  
  public String getObjectID() {
		return "OpenStackConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenStackConfiguration openStackConfiguration = (OpenStackConfiguration) o;
    return Objects.equals(this.adminTenant, openStackConfiguration.adminTenant) &&
        Objects.equals(this.adminTenantUuid, openStackConfiguration.adminTenantUuid) &&
        Objects.equals(this.allowedAddressPairs, openStackConfiguration.allowedAddressPairs) &&
        Objects.equals(this.antiAffinity, openStackConfiguration.antiAffinity) &&
        Objects.equals(this.authUrl, openStackConfiguration.authUrl) &&
        Objects.equals(this.configDrive, openStackConfiguration.configDrive) &&
        Objects.equals(this.contrailDisablePolicy, openStackConfiguration.contrailDisablePolicy) &&
        Objects.equals(this.contrailEndpoint, openStackConfiguration.contrailEndpoint) &&
        Objects.equals(this.contrailPlugin, openStackConfiguration.contrailPlugin) &&
        Objects.equals(this.customSeImageProperties, openStackConfiguration.customSeImageProperties) &&
        Objects.equals(this.externalNetworks, openStackConfiguration.externalNetworks) &&
        Objects.equals(this.freeFloatingips, openStackConfiguration.freeFloatingips) &&
        Objects.equals(this.hypervisor, openStackConfiguration.hypervisor) &&
        Objects.equals(this.hypervisorProperties, openStackConfiguration.hypervisorProperties) &&
        Objects.equals(this.imgFormat, openStackConfiguration.imgFormat) &&
        Objects.equals(this.importKeystoneTenants, openStackConfiguration.importKeystoneTenants) &&
        Objects.equals(this.insecure, openStackConfiguration.insecure) &&
        Objects.equals(this.intfSecIps, openStackConfiguration.intfSecIps) &&
        Objects.equals(this.keystoneHost, openStackConfiguration.keystoneHost) &&
        Objects.equals(this.mapAdminToCloudadmin, openStackConfiguration.mapAdminToCloudadmin) &&
        Objects.equals(this.mgmtNetworkName, openStackConfiguration.mgmtNetworkName) &&
        Objects.equals(this.mgmtNetworkUuid, openStackConfiguration.mgmtNetworkUuid) &&
        Objects.equals(this.nameOwner, openStackConfiguration.nameOwner) &&
        Objects.equals(this.neutronRbac, openStackConfiguration.neutronRbac) &&
        Objects.equals(this.nuageOrganization, openStackConfiguration.nuageOrganization) &&
        Objects.equals(this.nuagePassword, openStackConfiguration.nuagePassword) &&
        Objects.equals(this.nuagePort, openStackConfiguration.nuagePort) &&
        Objects.equals(this.nuageUsername, openStackConfiguration.nuageUsername) &&
        Objects.equals(this.nuageVirtualip, openStackConfiguration.nuageVirtualip) &&
        Objects.equals(this.nuageVsdHost, openStackConfiguration.nuageVsdHost) &&
        Objects.equals(this.password, openStackConfiguration.password) &&
        Objects.equals(this.portSecurity, openStackConfiguration.portSecurity) &&
        Objects.equals(this.privilege, openStackConfiguration.privilege) &&
        Objects.equals(this.provName, openStackConfiguration.provName) &&
        Objects.equals(this.providerVipNetworks, openStackConfiguration.providerVipNetworks) &&
        Objects.equals(this.region, openStackConfiguration.region) &&
        Objects.equals(this.roleMapping, openStackConfiguration.roleMapping) &&
        Objects.equals(this.seGroupRef, openStackConfiguration.seGroupRef) &&
        Objects.equals(this.securityGroups, openStackConfiguration.securityGroups) &&
        Objects.equals(this.tenantSe, openStackConfiguration.tenantSe) &&
        Objects.equals(this.usableNetworkUuids, openStackConfiguration.usableNetworkUuids) &&
        Objects.equals(this.useAdminUrl, openStackConfiguration.useAdminUrl) &&
        Objects.equals(this.useInternalEndpoints, openStackConfiguration.useInternalEndpoints) &&
        Objects.equals(this.useKeystoneAuth, openStackConfiguration.useKeystoneAuth) &&
        Objects.equals(this.useNuagevip, openStackConfiguration.useNuagevip) &&
        Objects.equals(this.username, openStackConfiguration.username) &&
        Objects.equals(this.wildcardAccess, openStackConfiguration.wildcardAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminTenant, adminTenantUuid, allowedAddressPairs, antiAffinity, authUrl, configDrive, contrailDisablePolicy, contrailEndpoint, contrailPlugin, customSeImageProperties, externalNetworks, freeFloatingips, hypervisor, hypervisorProperties, imgFormat, importKeystoneTenants, insecure, intfSecIps, keystoneHost, mapAdminToCloudadmin, mgmtNetworkName, mgmtNetworkUuid, nameOwner, neutronRbac, nuageOrganization, nuagePassword, nuagePort, nuageUsername, nuageVirtualip, nuageVsdHost, password, portSecurity, privilege, provName, providerVipNetworks, region, roleMapping, seGroupRef, securityGroups, tenantSe, usableNetworkUuids, useAdminUrl, useInternalEndpoints, useKeystoneAuth, useNuagevip, username, wildcardAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenStackConfiguration {\n");
    
    sb.append("    adminTenant: ").append(toIndentedString(adminTenant)).append("\n");
    sb.append("    adminTenantUuid: ").append(toIndentedString(adminTenantUuid)).append("\n");
    sb.append("    allowedAddressPairs: ").append(toIndentedString(allowedAddressPairs)).append("\n");
    sb.append("    antiAffinity: ").append(toIndentedString(antiAffinity)).append("\n");
    sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
    sb.append("    configDrive: ").append(toIndentedString(configDrive)).append("\n");
    sb.append("    contrailDisablePolicy: ").append(toIndentedString(contrailDisablePolicy)).append("\n");
    sb.append("    contrailEndpoint: ").append(toIndentedString(contrailEndpoint)).append("\n");
    sb.append("    contrailPlugin: ").append(toIndentedString(contrailPlugin)).append("\n");
    sb.append("    customSeImageProperties: ").append(toIndentedString(customSeImageProperties)).append("\n");
    sb.append("    externalNetworks: ").append(toIndentedString(externalNetworks)).append("\n");
    sb.append("    freeFloatingips: ").append(toIndentedString(freeFloatingips)).append("\n");
    sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
    sb.append("    hypervisorProperties: ").append(toIndentedString(hypervisorProperties)).append("\n");
    sb.append("    imgFormat: ").append(toIndentedString(imgFormat)).append("\n");
    sb.append("    importKeystoneTenants: ").append(toIndentedString(importKeystoneTenants)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
    sb.append("    intfSecIps: ").append(toIndentedString(intfSecIps)).append("\n");
    sb.append("    keystoneHost: ").append(toIndentedString(keystoneHost)).append("\n");
    sb.append("    mapAdminToCloudadmin: ").append(toIndentedString(mapAdminToCloudadmin)).append("\n");
    sb.append("    mgmtNetworkName: ").append(toIndentedString(mgmtNetworkName)).append("\n");
    sb.append("    mgmtNetworkUuid: ").append(toIndentedString(mgmtNetworkUuid)).append("\n");
    sb.append("    nameOwner: ").append(toIndentedString(nameOwner)).append("\n");
    sb.append("    neutronRbac: ").append(toIndentedString(neutronRbac)).append("\n");
    sb.append("    nuageOrganization: ").append(toIndentedString(nuageOrganization)).append("\n");
    sb.append("    nuagePassword: ").append(toIndentedString(nuagePassword)).append("\n");
    sb.append("    nuagePort: ").append(toIndentedString(nuagePort)).append("\n");
    sb.append("    nuageUsername: ").append(toIndentedString(nuageUsername)).append("\n");
    sb.append("    nuageVirtualip: ").append(toIndentedString(nuageVirtualip)).append("\n");
    sb.append("    nuageVsdHost: ").append(toIndentedString(nuageVsdHost)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    portSecurity: ").append(toIndentedString(portSecurity)).append("\n");
    sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
    sb.append("    provName: ").append(toIndentedString(provName)).append("\n");
    sb.append("    providerVipNetworks: ").append(toIndentedString(providerVipNetworks)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    roleMapping: ").append(toIndentedString(roleMapping)).append("\n");
    sb.append("    seGroupRef: ").append(toIndentedString(seGroupRef)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    tenantSe: ").append(toIndentedString(tenantSe)).append("\n");
    sb.append("    usableNetworkUuids: ").append(toIndentedString(usableNetworkUuids)).append("\n");
    sb.append("    useAdminUrl: ").append(toIndentedString(useAdminUrl)).append("\n");
    sb.append("    useInternalEndpoints: ").append(toIndentedString(useInternalEndpoints)).append("\n");
    sb.append("    useKeystoneAuth: ").append(toIndentedString(useKeystoneAuth)).append("\n");
    sb.append("    useNuagevip: ").append(toIndentedString(useNuagevip)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    wildcardAccess: ").append(toIndentedString(wildcardAccess)).append("\n");
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

