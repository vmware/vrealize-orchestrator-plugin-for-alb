package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AnalyticsPolicy;
import com.vmware.avi.vro.model.ContentRewriteProfile;
import com.vmware.avi.vro.model.DiscoveredNetwork;
import com.vmware.avi.vro.model.DnsInfo;
import com.vmware.avi.vro.model.DnsPolicies;
import com.vmware.avi.vro.model.DnsRecord;
import com.vmware.avi.vro.model.HTTPClientAuthenticationParams;
import com.vmware.avi.vro.model.HTTPPolicies;
import com.vmware.avi.vro.model.IPNetworkSubnet;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.L4Policies;
import com.vmware.avi.vro.model.PerformanceLimits;
import com.vmware.avi.vro.model.RateProfile;
import com.vmware.avi.vro.model.SAMLSPConfig;
import com.vmware.avi.vro.model.SSLProfileSelector;
import com.vmware.avi.vro.model.SSOPolicy;
import com.vmware.avi.vro.model.Service;
import com.vmware.avi.vro.model.ServicePoolSelector;
import com.vmware.avi.vro.model.SidebandProfile;
import com.vmware.avi.vro.model.VSDataScripts;
import com.vmware.avi.vro.model.Vip;
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

/**
 * VirtualService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "VirtualService")
@VsoFinder(name = Constants.FINDER_VRO_VIRTUALSERVICE, idAccessor = "getObjectID()")
@org.springframework.stereotype.Service
public class VirtualService extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("active_standby_se_tag")
  private String activeStandbySeTag = "ACTIVE_STANDBY_SE_1";

  @JsonProperty("allow_invalid_client_cert")
  private Boolean allowInvalidClientCert = null;

  @JsonProperty("analytics_policy")
  private AnalyticsPolicy analyticsPolicy = null;

  @JsonProperty("analytics_profile_ref")
  private String analyticsProfileRef = null;

  @JsonProperty("apic_contract_graph")
  private String apicContractGraph = null;

  @JsonProperty("application_profile_ref")
  private String applicationProfileRef = null;

  @JsonProperty("auto_allocate_floating_ip")
  private Boolean autoAllocateFloatingIp = null;

  @JsonProperty("auto_allocate_ip")
  private Boolean autoAllocateIp = null;

  @JsonProperty("availability_zone")
  private String availabilityZone = null;

  @JsonProperty("avi_allocated_fip")
  private Boolean aviAllocatedFip = null;

  @JsonProperty("avi_allocated_vip")
  private Boolean aviAllocatedVip = null;

  @JsonProperty("azure_availability_set")
  private String azureAvailabilitySet = null;

  @JsonProperty("bulk_sync_kvcache")
  private Boolean bulkSyncKvcache = null;

  @JsonProperty("client_auth")
  private HTTPClientAuthenticationParams clientAuth = null;

  @JsonProperty("close_client_conn_on_config_update")
  private Boolean closeClientConnOnConfigUpdate = null;

  @JsonProperty("cloud_config_cksum")
  private String cloudConfigCksum = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("cloud_type")
  private String cloudType = "CLOUD_NONE";

  @JsonProperty("connections_rate_limit")
  private RateProfile connectionsRateLimit = null;

  @JsonProperty("content_rewrite")
  private ContentRewriteProfile contentRewrite = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("delay_fairness")
  private Boolean delayFairness = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("discovered_network_ref")
  @Valid
  private List<String> discoveredNetworkRef = null;

  @JsonProperty("discovered_networks")
  @Valid
  private List<DiscoveredNetwork> discoveredNetworks = null;

  @JsonProperty("discovered_subnet")
  @Valid
  private List<IpAddrPrefix> discoveredSubnet = null;

  @JsonProperty("dns_info")
  @Valid
  private List<DnsInfo> dnsInfo = null;

  @JsonProperty("dns_policies")
  @Valid
  private List<DnsPolicies> dnsPolicies = null;

  @JsonProperty("east_west_placement")
  private Boolean eastWestPlacement = null;

  @JsonProperty("enable_autogw")
  private Boolean enableAutogw = true;

  @JsonProperty("enable_rhi")
  private Boolean enableRhi = null;

  @JsonProperty("enable_rhi_snat")
  private Boolean enableRhiSnat = null;

  @JsonProperty("enabled")
  private Boolean enabled = true;

  @JsonProperty("error_page_profile_ref")
  private String errorPageProfileRef = null;

  @JsonProperty("floating_ip")
  private IpAddr floatingIp = null;

  @JsonProperty("floating_subnet_uuid")
  private String floatingSubnetUuid = null;

  @JsonProperty("flow_dist")
  private String flowDist = "LOAD_AWARE";

  @JsonProperty("flow_label_type")
  private String flowLabelType = "NO_LABEL";

  @JsonProperty("fqdn")
  private String fqdn = null;

  @JsonProperty("host_name_xlate")
  private String hostNameXlate = null;

  @JsonProperty("http_policies")
  @Valid
  private List<HTTPPolicies> httpPolicies = null;

  @JsonProperty("ign_pool_net_reach")
  private Boolean ignPoolNetReach = null;

  @JsonProperty("ip_address")
  private IpAddr ipAddress = null;

  @JsonProperty("ipam_network_subnet")
  private IPNetworkSubnet ipamNetworkSubnet = null;

  @JsonProperty("l4_policies")
  @Valid
  private List<L4Policies> l4Policies = null;

  @JsonProperty("limit_doser")
  private Boolean limitDoser = null;

  @JsonProperty("max_cps_per_client")
  private Integer maxCpsPerClient = null;

  @JsonProperty("microservice_ref")
  private String microserviceRef = null;

  @JsonProperty("min_pools_up")
  private Integer minPoolsUp = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("network_profile_ref")
  private String networkProfileRef = null;

  @JsonProperty("network_ref")
  private String networkRef = null;

  @JsonProperty("network_security_policy_ref")
  private String networkSecurityPolicyRef = null;

  @JsonProperty("nsx_securitygroup")
  @Valid
  private List<String> nsxSecuritygroup = null;

  @JsonProperty("performance_limits")
  private PerformanceLimits performanceLimits = null;

  @JsonProperty("pool_group_ref")
  private String poolGroupRef = null;

  @JsonProperty("pool_ref")
  private String poolRef = null;

  @JsonProperty("port_uuid")
  private String portUuid = null;

  @JsonProperty("remove_listening_port_on_vs_down")
  private Boolean removeListeningPortOnVsDown = null;

  @JsonProperty("requests_rate_limit")
  private RateProfile requestsRateLimit = null;

  @JsonProperty("saml_sp_config")
  private SAMLSPConfig samlSpConfig = null;

  @JsonProperty("scaleout_ecmp")
  private Boolean scaleoutEcmp = null;

  @JsonProperty("se_group_ref")
  private String seGroupRef = null;

  @JsonProperty("security_policy_ref")
  private String securityPolicyRef = null;

  @JsonProperty("server_network_profile_ref")
  private String serverNetworkProfileRef = null;

  @JsonProperty("service_metadata")
  private String serviceMetadata = null;

  @JsonProperty("service_pool_select")
  @Valid
  private List<ServicePoolSelector> servicePoolSelect = null;

  @JsonProperty("services")
  @Valid
  private List<Service> services = null;

  @JsonProperty("sideband_profile")
  private SidebandProfile sidebandProfile = null;

  @JsonProperty("snat_ip")
  @Valid
  private List<IpAddr> snatIp = null;

  @JsonProperty("sp_pool_refs")
  @Valid
  private List<String> spPoolRefs = null;

  @JsonProperty("ssl_key_and_certificate_refs")
  @Valid
  private List<String> sslKeyAndCertificateRefs = null;

  @JsonProperty("ssl_profile_ref")
  private String sslProfileRef = null;

  @JsonProperty("ssl_profile_selectors")
  @Valid
  private List<SSLProfileSelector> sslProfileSelectors = null;

  @JsonProperty("ssl_sess_cache_avg_size")
  private Integer sslSessCacheAvgSize = 1024;

  @JsonProperty("sso_policy")
  private SSOPolicy ssoPolicy = null;

  @JsonProperty("sso_policy_ref")
  private String ssoPolicyRef = null;

  @JsonProperty("static_dns_records")
  @Valid
  private List<DnsRecord> staticDnsRecords = null;

  @JsonProperty("subnet")
  private IpAddrPrefix subnet = null;

  @JsonProperty("subnet_uuid")
  private String subnetUuid = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("test_se_datastore_level_1_ref")
  private String testSeDatastoreLevel1Ref = null;

  @JsonProperty("topology_policies")
  @Valid
  private List<DnsPolicies> topologyPolicies = null;

  @JsonProperty("traffic_clone_profile_ref")
  private String trafficCloneProfileRef = null;

  @JsonProperty("traffic_enabled")
  private Boolean trafficEnabled = true;

  @JsonProperty("type")
  private String type = "VS_TYPE_NORMAL";

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("use_bridge_ip_as_vip")
  private Boolean useBridgeIpAsVip = null;

  @JsonProperty("use_vip_as_snat")
  private Boolean useVipAsSnat = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vh_domain_name")
  @Valid
  private List<String> vhDomainName = null;

  @JsonProperty("vh_parent_vs_uuid")
  private String vhParentVsUuid = null;

  @JsonProperty("vip")
  @Valid
  private List<Vip> vip = null;

  @JsonProperty("vrf_context_ref")
  private String vrfContextRef = null;

  @JsonProperty("vs_datascripts")
  @Valid
  private List<VSDataScripts> vsDatascripts = null;

  @JsonProperty("vsvip_cloud_config_cksum")
  private String vsvipCloudConfigCksum = null;

  @JsonProperty("vsvip_ref")
  private String vsvipRef = null;

  @JsonProperty("waf_policy_ref")
  private String wafPolicyRef = null;

  @JsonProperty("weight")
  private Integer weight = 1;

  
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
   * This configuration only applies if the VirtualService is in Legacy Active Standby HA mode and Load Distribution among Active Standby is enabled. This field is used to tag the VirtualService so that VirtualServices with the same tag will share the same Active ServiceEngine. VirtualServices with different tags will have different Active ServiceEngines. If one of the ServiceEngine's in the ServiceEngineGroup fails, all VirtualServices will end up using the same Active ServiceEngine. Redistribution of the VirtualServices can be either manual or automated when the failed ServiceEngine recovers. Redistribution is based on the auto redistribute property of the ServiceEngineGroup. Enum options - ACTIVE_STANDBY_SE_1, ACTIVE_STANDBY_SE_2.
   * @return activeStandbySeTag
  **/
  @ApiModelProperty(value = "This configuration only applies if the VirtualService is in Legacy Active Standby HA mode and Load Distribution among Active Standby is enabled. This field is used to tag the VirtualService so that VirtualServices with the same tag will share the same Active ServiceEngine. VirtualServices with different tags will have different Active ServiceEngines. If one of the ServiceEngine's in the ServiceEngineGroup fails, all VirtualServices will end up using the same Active ServiceEngine. Redistribution of the VirtualServices can be either manual or automated when the failed ServiceEngine recovers. Redistribution is based on the auto redistribute property of the ServiceEngineGroup. Enum options - ACTIVE_STANDBY_SE_1, ACTIVE_STANDBY_SE_2.")


 
  @VsoMethod  
  public String getActiveStandbySeTag() {
    return activeStandbySeTag;
  }
    
  @VsoMethod
  public void setActiveStandbySeTag(String activeStandbySeTag) {
    this.activeStandbySeTag = activeStandbySeTag;
  }

  
  /**
   * Process request even if invalid client certificate is presented. Datascript APIs need to be used for processing of such requests. Field introduced in 18.2.3.
   * @return allowInvalidClientCert
  **/
  @ApiModelProperty(value = "Process request even if invalid client certificate is presented. Datascript APIs need to be used for processing of such requests. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isAllowInvalidClientCert() {
    return allowInvalidClientCert;
  }
    
  @VsoMethod
  public void setAllowInvalidClientCert(Boolean allowInvalidClientCert) {
    this.allowInvalidClientCert = allowInvalidClientCert;
  }

  
  /**
   * Determines analytics settings for the application.
   * @return analyticsPolicy
  **/
  @ApiModelProperty(value = "Determines analytics settings for the application.")

  @Valid

 
  @VsoMethod  
  public AnalyticsPolicy getAnalyticsPolicy() {
    return analyticsPolicy;
  }
    
  @VsoMethod
  public void setAnalyticsPolicy(AnalyticsPolicy analyticsPolicy) {
    this.analyticsPolicy = analyticsPolicy;
  }

  
  /**
   * Specifies settings related to analytics. It is a reference to an object of type AnalyticsProfile.
   * @return analyticsProfileRef
  **/
  @ApiModelProperty(value = "Specifies settings related to analytics. It is a reference to an object of type AnalyticsProfile.")


 
  @VsoMethod  
  public String getAnalyticsProfileRef() {
    return analyticsProfileRef;
  }
    
  @VsoMethod
  public void setAnalyticsProfileRef(String analyticsProfileRef) {
    this.analyticsProfileRef = analyticsProfileRef;
  }

  
  /**
   * The name of the Contract/Graph associated with the Virtual Service. Should be in the <Contract name> <Graph name> format. This is applicable only for Service Integration mode with Cisco APIC Controller . Field introduced in 17.2.12,18.1.2.
   * @return apicContractGraph
  **/
  @ApiModelProperty(value = "The name of the Contract/Graph associated with the Virtual Service. Should be in the <Contract name> <Graph name> format. This is applicable only for Service Integration mode with Cisco APIC Controller . Field introduced in 17.2.12,18.1.2.")


 
  @VsoMethod  
  public String getApicContractGraph() {
    return apicContractGraph;
  }
    
  @VsoMethod
  public void setApicContractGraph(String apicContractGraph) {
    this.apicContractGraph = apicContractGraph;
  }

  
  /**
   * Enable application layer specific features for the Virtual Service. It is a reference to an object of type ApplicationProfile.
   * @return applicationProfileRef
  **/
  @ApiModelProperty(value = "Enable application layer specific features for the Virtual Service. It is a reference to an object of type ApplicationProfile.")


 
  @VsoMethod  
  public String getApplicationProfileRef() {
    return applicationProfileRef;
  }
    
  @VsoMethod
  public void setApplicationProfileRef(String applicationProfileRef) {
    this.applicationProfileRef = applicationProfileRef;
  }

  
  /**
   * Auto-allocate floating/elastic IP from the Cloud infrastructure. Field deprecated in 17.1.1.
   * @return autoAllocateFloatingIp
  **/
  @ApiModelProperty(value = "Auto-allocate floating/elastic IP from the Cloud infrastructure. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public Boolean isAutoAllocateFloatingIp() {
    return autoAllocateFloatingIp;
  }
    
  @VsoMethod
  public void setAutoAllocateFloatingIp(Boolean autoAllocateFloatingIp) {
    this.autoAllocateFloatingIp = autoAllocateFloatingIp;
  }

  
  /**
   * Auto-allocate VIP from the provided subnet. Field deprecated in 17.1.1.
   * @return autoAllocateIp
  **/
  @ApiModelProperty(value = "Auto-allocate VIP from the provided subnet. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public Boolean isAutoAllocateIp() {
    return autoAllocateIp;
  }
    
  @VsoMethod
  public void setAutoAllocateIp(Boolean autoAllocateIp) {
    this.autoAllocateIp = autoAllocateIp;
  }

  
  /**
   * Availability-zone to place the Virtual Service. Field deprecated in 17.1.1.
   * @return availabilityZone
  **/
  @ApiModelProperty(value = "Availability-zone to place the Virtual Service. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public String getAvailabilityZone() {
    return availabilityZone;
  }
    
  @VsoMethod
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  
  /**
   * (internal-use) FIP allocated by Avi in the Cloud infrastructure. Field deprecated in 17.1.1.
   * @return aviAllocatedFip
  **/
  @ApiModelProperty(value = "(internal-use) FIP allocated by Avi in the Cloud infrastructure. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public Boolean isAviAllocatedFip() {
    return aviAllocatedFip;
  }
    
  @VsoMethod
  public void setAviAllocatedFip(Boolean aviAllocatedFip) {
    this.aviAllocatedFip = aviAllocatedFip;
  }

  
  /**
   * (internal-use) VIP allocated by Avi in the Cloud infrastructure. Field deprecated in 17.1.1.
   * @return aviAllocatedVip
  **/
  @ApiModelProperty(value = "(internal-use) VIP allocated by Avi in the Cloud infrastructure. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public Boolean isAviAllocatedVip() {
    return aviAllocatedVip;
  }
    
  @VsoMethod
  public void setAviAllocatedVip(Boolean aviAllocatedVip) {
    this.aviAllocatedVip = aviAllocatedVip;
  }

  
  /**
   * (internal-use)Applicable for Azure only. Azure Availability set to which this VS is associated. Internally set by the cloud connector. Field introduced in 17.2.12, 18.1.2.
   * @return azureAvailabilitySet
  **/
  @ApiModelProperty(readOnly = true, value = "(internal-use)Applicable for Azure only. Azure Availability set to which this VS is associated. Internally set by the cloud connector. Field introduced in 17.2.12, 18.1.2.")


 
  @VsoMethod  
  public String getAzureAvailabilitySet() {
    return azureAvailabilitySet;
  }
    
  @VsoMethod
  public void setAzureAvailabilitySet(String azureAvailabilitySet) {
    this.azureAvailabilitySet = azureAvailabilitySet;
  }

  
  /**
   * (This is a beta feature). Sync Key-Value cache to the new SEs when VS is scaled out. For ex  SSL sessions are stored using VS's Key-Value cache. When the VS is scaled out, the SSL session information is synced to the new SE, allowing existing SSL sessions to be reused on the new SE. . Field introduced in 17.2.7, 18.1.1.
   * @return bulkSyncKvcache
  **/
  @ApiModelProperty(value = "(This is a beta feature). Sync Key-Value cache to the new SEs when VS is scaled out. For ex  SSL sessions are stored using VS's Key-Value cache. When the VS is scaled out, the SSL session information is synced to the new SE, allowing existing SSL sessions to be reused on the new SE. . Field introduced in 17.2.7, 18.1.1.")


 
  @VsoMethod  
  public Boolean isBulkSyncKvcache() {
    return bulkSyncKvcache;
  }
    
  @VsoMethod
  public void setBulkSyncKvcache(Boolean bulkSyncKvcache) {
    this.bulkSyncKvcache = bulkSyncKvcache;
  }

  
  /**
   * HTTP authentication configuration for protected resources.
   * @return clientAuth
  **/
  @ApiModelProperty(value = "HTTP authentication configuration for protected resources.")

  @Valid

 
  @VsoMethod  
  public HTTPClientAuthenticationParams getClientAuth() {
    return clientAuth;
  }
    
  @VsoMethod
  public void setClientAuth(HTTPClientAuthenticationParams clientAuth) {
    this.clientAuth = clientAuth;
  }

  
  /**
   * close client connection on vs config update. Field introduced in 17.2.4.
   * @return closeClientConnOnConfigUpdate
  **/
  @ApiModelProperty(value = "close client connection on vs config update. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public Boolean isCloseClientConnOnConfigUpdate() {
    return closeClientConnOnConfigUpdate;
  }
    
  @VsoMethod
  public void setCloseClientConnOnConfigUpdate(Boolean closeClientConnOnConfigUpdate) {
    this.closeClientConnOnConfigUpdate = closeClientConnOnConfigUpdate;
  }

  
  /**
   * Checksum of cloud configuration for VS. Internally set by cloud connector.
   * @return cloudConfigCksum
  **/
  @ApiModelProperty(value = "Checksum of cloud configuration for VS. Internally set by cloud connector.")


 
  @VsoMethod  
  public String getCloudConfigCksum() {
    return cloudConfigCksum;
  }
    
  @VsoMethod
  public void setCloudConfigCksum(String cloudConfigCksum) {
    this.cloudConfigCksum = cloudConfigCksum;
  }

  
  /**
   *  It is a reference to an object of type Cloud.
   * @return cloudRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Cloud.")


 
  @VsoMethod  
  public String getCloudRef() {
    return cloudRef;
  }
    
  @VsoMethod
  public void setCloudRef(String cloudRef) {
    this.cloudRef = cloudRef;
  }

  
  /**
   *  Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP, CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP.
   * @return cloudType
  **/
  @ApiModelProperty(value = " Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP, CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP.")


 
  @VsoMethod  
  public String getCloudType() {
    return cloudType;
  }
    
  @VsoMethod
  public void setCloudType(String cloudType) {
    this.cloudType = cloudType;
  }

  
  /**
   * Rate limit the incoming connections to this virtual service.
   * @return connectionsRateLimit
  **/
  @ApiModelProperty(value = "Rate limit the incoming connections to this virtual service.")

  @Valid

 
  @VsoMethod  
  public RateProfile getConnectionsRateLimit() {
    return connectionsRateLimit;
  }
    
  @VsoMethod
  public void setConnectionsRateLimit(RateProfile connectionsRateLimit) {
    this.connectionsRateLimit = connectionsRateLimit;
  }

  
  /**
   * Profile used to match and rewrite strings in request and/or response body.
   * @return contentRewrite
  **/
  @ApiModelProperty(value = "Profile used to match and rewrite strings in request and/or response body.")

  @Valid

 
  @VsoMethod  
  public ContentRewriteProfile getContentRewrite() {
    return contentRewrite;
  }
    
  @VsoMethod
  public void setContentRewrite(ContentRewriteProfile contentRewrite) {
    this.contentRewrite = contentRewrite;
  }

  
  /**
   * Creator name.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Creator name.")


 
  @VsoMethod  
  public String getCreatedBy() {
    return createdBy;
  }
    
  @VsoMethod
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * Select the algorithm for QoS fairness.  This determines how multiple Virtual Services sharing the same Service Engines will prioritize traffic over a congested network.
   * @return delayFairness
  **/
  @ApiModelProperty(value = "Select the algorithm for QoS fairness.  This determines how multiple Virtual Services sharing the same Service Engines will prioritize traffic over a congested network.")


 
  @VsoMethod  
  public Boolean isDelayFairness() {
    return delayFairness;
  }
    
  @VsoMethod
  public void setDelayFairness(Boolean delayFairness) {
    this.delayFairness = delayFairness;
  }

  
  /**
   * User defined description for the object.
   * @return description
  **/
  @ApiModelProperty(value = "User defined description for the object.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  public VirtualService addDiscoveredNetworkRefItem(String discoveredNetworkRefItem) {
    if (this.discoveredNetworkRef == null) {
      this.discoveredNetworkRef = new ArrayList<String>();
    }
    this.discoveredNetworkRef.add(discoveredNetworkRefItem);
    return this;
  }
  
  /**
   * (internal-use) Discovered networks providing reachability for client facing Virtual Service IP. This field is deprecated. It is a reference to an object of type Network. Field deprecated in 17.1.1.
   * @return discoveredNetworkRef
  **/
  @ApiModelProperty(value = "(internal-use) Discovered networks providing reachability for client facing Virtual Service IP. This field is deprecated. It is a reference to an object of type Network. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public List<String> getDiscoveredNetworkRef() {
    return discoveredNetworkRef;
  }
    
  @VsoMethod
  public void setDiscoveredNetworkRef(List<String> discoveredNetworkRef) {
    this.discoveredNetworkRef = discoveredNetworkRef;
  }

  
  public VirtualService addDiscoveredNetworksItem(DiscoveredNetwork discoveredNetworksItem) {
    if (this.discoveredNetworks == null) {
      this.discoveredNetworks = new ArrayList<DiscoveredNetwork>();
    }
    this.discoveredNetworks.add(discoveredNetworksItem);
    return this;
  }
  
  /**
   * (internal-use) Discovered networks providing reachability for client facing Virtual Service IP. This field is used internally by Avi, not editable by the user. Field deprecated in 17.1.1.
   * @return discoveredNetworks
  **/
  @ApiModelProperty(value = "(internal-use) Discovered networks providing reachability for client facing Virtual Service IP. This field is used internally by Avi, not editable by the user. Field deprecated in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<DiscoveredNetwork> getDiscoveredNetworks() {
    return discoveredNetworks;
  }
    
  @VsoMethod
  public void setDiscoveredNetworks(List<DiscoveredNetwork> discoveredNetworks) {
    this.discoveredNetworks = discoveredNetworks;
  }

  
  public VirtualService addDiscoveredSubnetItem(IpAddrPrefix discoveredSubnetItem) {
    if (this.discoveredSubnet == null) {
      this.discoveredSubnet = new ArrayList<IpAddrPrefix>();
    }
    this.discoveredSubnet.add(discoveredSubnetItem);
    return this;
  }
  
  /**
   * (internal-use) Discovered subnets providing reachability for client facing Virtual Service IP. This field is deprecated. Field deprecated in 17.1.1.
   * @return discoveredSubnet
  **/
  @ApiModelProperty(value = "(internal-use) Discovered subnets providing reachability for client facing Virtual Service IP. This field is deprecated. Field deprecated in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<IpAddrPrefix> getDiscoveredSubnet() {
    return discoveredSubnet;
  }
    
  @VsoMethod
  public void setDiscoveredSubnet(List<IpAddrPrefix> discoveredSubnet) {
    this.discoveredSubnet = discoveredSubnet;
  }

  
  public VirtualService addDnsInfoItem(DnsInfo dnsInfoItem) {
    if (this.dnsInfo == null) {
      this.dnsInfo = new ArrayList<DnsInfo>();
    }
    this.dnsInfo.add(dnsInfoItem);
    return this;
  }
  
  /**
   * Service discovery specific data including fully qualified domain name, type and Time-To-Live of the DNS record. Note that only one of fqdn and dns_info setting is allowed.
   * @return dnsInfo
  **/
  @ApiModelProperty(value = "Service discovery specific data including fully qualified domain name, type and Time-To-Live of the DNS record. Note that only one of fqdn and dns_info setting is allowed.")

  @Valid

 
  @VsoMethod  
  public List<DnsInfo> getDnsInfo() {
    return dnsInfo;
  }
    
  @VsoMethod
  public void setDnsInfo(List<DnsInfo> dnsInfo) {
    this.dnsInfo = dnsInfo;
  }

  
  public VirtualService addDnsPoliciesItem(DnsPolicies dnsPoliciesItem) {
    if (this.dnsPolicies == null) {
      this.dnsPolicies = new ArrayList<DnsPolicies>();
    }
    this.dnsPolicies.add(dnsPoliciesItem);
    return this;
  }
  
  /**
   * DNS Policies applied on the dns traffic of the Virtual Service. Field introduced in 17.1.1.
   * @return dnsPolicies
  **/
  @ApiModelProperty(value = "DNS Policies applied on the dns traffic of the Virtual Service. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<DnsPolicies> getDnsPolicies() {
    return dnsPolicies;
  }
    
  @VsoMethod
  public void setDnsPolicies(List<DnsPolicies> dnsPolicies) {
    this.dnsPolicies = dnsPolicies;
  }

  
  /**
   * Force placement on all SE's in service group (Mesos mode only).
   * @return eastWestPlacement
  **/
  @ApiModelProperty(value = "Force placement on all SE's in service group (Mesos mode only).")


 
  @VsoMethod  
  public Boolean isEastWestPlacement() {
    return eastWestPlacement;
  }
    
  @VsoMethod
  public void setEastWestPlacement(Boolean eastWestPlacement) {
    this.eastWestPlacement = eastWestPlacement;
  }

  
  /**
   * Response traffic to clients will be sent back to the source MAC address of the connection, rather than statically sent to a default gateway.
   * @return enableAutogw
  **/
  @ApiModelProperty(value = "Response traffic to clients will be sent back to the source MAC address of the connection, rather than statically sent to a default gateway.")


 
  @VsoMethod  
  public Boolean isEnableAutogw() {
    return enableAutogw;
  }
    
  @VsoMethod
  public void setEnableAutogw(Boolean enableAutogw) {
    this.enableAutogw = enableAutogw;
  }

  
  /**
   * Enable Route Health Injection using the BGP Config in the vrf context.
   * @return enableRhi
  **/
  @ApiModelProperty(value = "Enable Route Health Injection using the BGP Config in the vrf context.")


 
  @VsoMethod  
  public Boolean isEnableRhi() {
    return enableRhi;
  }
    
  @VsoMethod
  public void setEnableRhi(Boolean enableRhi) {
    this.enableRhi = enableRhi;
  }

  
  /**
   * Enable Route Health Injection for Source NAT'ted floating IP Address using the BGP Config in the vrf context.
   * @return enableRhiSnat
  **/
  @ApiModelProperty(value = "Enable Route Health Injection for Source NAT'ted floating IP Address using the BGP Config in the vrf context.")


 
  @VsoMethod  
  public Boolean isEnableRhiSnat() {
    return enableRhiSnat;
  }
    
  @VsoMethod
  public void setEnableRhiSnat(Boolean enableRhiSnat) {
    this.enableRhiSnat = enableRhiSnat;
  }

  
  /**
   * Enable or disable the Virtual Service.
   * @return enabled
  **/
  @ApiModelProperty(value = "Enable or disable the Virtual Service.")


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * Error Page Profile to be used for this virtualservice.This profile is used to send the custom error page to the client generated by the proxy. It is a reference to an object of type ErrorPageProfile. Field introduced in 17.2.4.
   * @return errorPageProfileRef
  **/
  @ApiModelProperty(value = "Error Page Profile to be used for this virtualservice.This profile is used to send the custom error page to the client generated by the proxy. It is a reference to an object of type ErrorPageProfile. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public String getErrorPageProfileRef() {
    return errorPageProfileRef;
  }
    
  @VsoMethod
  public void setErrorPageProfileRef(String errorPageProfileRef) {
    this.errorPageProfileRef = errorPageProfileRef;
  }

  
  /**
   * Floating IP to associate with this Virtual Service. Field deprecated in 17.1.1.
   * @return floatingIp
  **/
  @ApiModelProperty(value = "Floating IP to associate with this Virtual Service. Field deprecated in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public IpAddr getFloatingIp() {
    return floatingIp;
  }
    
  @VsoMethod
  public void setFloatingIp(IpAddr floatingIp) {
    this.floatingIp = floatingIp;
  }

  
  /**
   * If auto_allocate_floating_ip is True and more than one floating-ip subnets exist, then the subnet for the floating IP address allocation. This field is applicable only if the VirtualService belongs to an OpenStack or AWS cloud. In OpenStack or AWS cloud it is required when auto_allocate_floating_ip is selected. Field deprecated in 17.1.1.
   * @return floatingSubnetUuid
  **/
  @ApiModelProperty(value = "If auto_allocate_floating_ip is True and more than one floating-ip subnets exist, then the subnet for the floating IP address allocation. This field is applicable only if the VirtualService belongs to an OpenStack or AWS cloud. In OpenStack or AWS cloud it is required when auto_allocate_floating_ip is selected. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public String getFloatingSubnetUuid() {
    return floatingSubnetUuid;
  }
    
  @VsoMethod
  public void setFloatingSubnetUuid(String floatingSubnetUuid) {
    this.floatingSubnetUuid = floatingSubnetUuid;
  }

  
  /**
   * Criteria for flow distribution among SEs. Enum options - LOAD_AWARE, CONSISTENT_HASH_SOURCE_IP_ADDRESS, CONSISTENT_HASH_SOURCE_IP_ADDRESS_AND_PORT.
   * @return flowDist
  **/
  @ApiModelProperty(value = "Criteria for flow distribution among SEs. Enum options - LOAD_AWARE, CONSISTENT_HASH_SOURCE_IP_ADDRESS, CONSISTENT_HASH_SOURCE_IP_ADDRESS_AND_PORT.")


 
  @VsoMethod  
  public String getFlowDist() {
    return flowDist;
  }
    
  @VsoMethod
  public void setFlowDist(String flowDist) {
    this.flowDist = flowDist;
  }

  
  /**
   * Criteria for flow labelling. Enum options - NO_LABEL, APPLICATION_LABEL, SERVICE_LABEL.
   * @return flowLabelType
  **/
  @ApiModelProperty(value = "Criteria for flow labelling. Enum options - NO_LABEL, APPLICATION_LABEL, SERVICE_LABEL.")


 
  @VsoMethod  
  public String getFlowLabelType() {
    return flowLabelType;
  }
    
  @VsoMethod
  public void setFlowLabelType(String flowLabelType) {
    this.flowLabelType = flowLabelType;
  }

  
  /**
   * DNS resolvable, fully qualified domain name of the virtualservice. Only one of 'fqdn' and 'dns_info' configuration is allowed.
   * @return fqdn
  **/
  @ApiModelProperty(value = "DNS resolvable, fully qualified domain name of the virtualservice. Only one of 'fqdn' and 'dns_info' configuration is allowed.")


 
  @VsoMethod  
  public String getFqdn() {
    return fqdn;
  }
    
  @VsoMethod
  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }

  
  /**
   * Translate the host name sent to the servers to this value.  Translate the host name sent from servers back to the value used by the client.
   * @return hostNameXlate
  **/
  @ApiModelProperty(value = "Translate the host name sent to the servers to this value.  Translate the host name sent from servers back to the value used by the client.")


 
  @VsoMethod  
  public String getHostNameXlate() {
    return hostNameXlate;
  }
    
  @VsoMethod
  public void setHostNameXlate(String hostNameXlate) {
    this.hostNameXlate = hostNameXlate;
  }

  
  public VirtualService addHttpPoliciesItem(HTTPPolicies httpPoliciesItem) {
    if (this.httpPolicies == null) {
      this.httpPolicies = new ArrayList<HTTPPolicies>();
    }
    this.httpPolicies.add(httpPoliciesItem);
    return this;
  }
  
  /**
   * HTTP Policies applied on the data traffic of the Virtual Service.
   * @return httpPolicies
  **/
  @ApiModelProperty(value = "HTTP Policies applied on the data traffic of the Virtual Service.")

  @Valid

 
  @VsoMethod  
  public List<HTTPPolicies> getHttpPolicies() {
    return httpPolicies;
  }
    
  @VsoMethod
  public void setHttpPolicies(List<HTTPPolicies> httpPolicies) {
    this.httpPolicies = httpPolicies;
  }

  
  /**
   * Ignore Pool servers network reachability constraints for Virtual Service placement.
   * @return ignPoolNetReach
  **/
  @ApiModelProperty(value = "Ignore Pool servers network reachability constraints for Virtual Service placement.")


 
  @VsoMethod  
  public Boolean isIgnPoolNetReach() {
    return ignPoolNetReach;
  }
    
  @VsoMethod
  public void setIgnPoolNetReach(Boolean ignPoolNetReach) {
    this.ignPoolNetReach = ignPoolNetReach;
  }

  
  /**
   * IP Address of the Virtual Service. Field deprecated in 17.1.1.
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP Address of the Virtual Service. Field deprecated in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public IpAddr getIpAddress() {
    return ipAddress;
  }
    
  @VsoMethod
  public void setIpAddress(IpAddr ipAddress) {
    this.ipAddress = ipAddress;
  }

  
  /**
   * Subnet and/or Network for allocating VirtualService IP by IPAM Provider module. Field deprecated in 17.1.1.
   * @return ipamNetworkSubnet
  **/
  @ApiModelProperty(value = "Subnet and/or Network for allocating VirtualService IP by IPAM Provider module. Field deprecated in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public IPNetworkSubnet getIpamNetworkSubnet() {
    return ipamNetworkSubnet;
  }
    
  @VsoMethod
  public void setIpamNetworkSubnet(IPNetworkSubnet ipamNetworkSubnet) {
    this.ipamNetworkSubnet = ipamNetworkSubnet;
  }

  
  public VirtualService addL4PoliciesItem(L4Policies l4PoliciesItem) {
    if (this.l4Policies == null) {
      this.l4Policies = new ArrayList<L4Policies>();
    }
    this.l4Policies.add(l4PoliciesItem);
    return this;
  }
  
  /**
   * L4 Policies applied to the data traffic of the Virtual Service. Field introduced in 17.2.7.
   * @return l4Policies
  **/
  @ApiModelProperty(value = "L4 Policies applied to the data traffic of the Virtual Service. Field introduced in 17.2.7.")

  @Valid

 
  @VsoMethod  
  public List<L4Policies> getL4Policies() {
    return l4Policies;
  }
    
  @VsoMethod
  public void setL4Policies(List<L4Policies> l4Policies) {
    this.l4Policies = l4Policies;
  }

  
  /**
   * Limit potential DoS attackers who exceed max_cps_per_client significantly to a fraction of max_cps_per_client for a while.
   * @return limitDoser
  **/
  @ApiModelProperty(value = "Limit potential DoS attackers who exceed max_cps_per_client significantly to a fraction of max_cps_per_client for a while.")


 
  @VsoMethod  
  public Boolean isLimitDoser() {
    return limitDoser;
  }
    
  @VsoMethod
  public void setLimitDoser(Boolean limitDoser) {
    this.limitDoser = limitDoser;
  }

  
  /**
   * Maximum connections per second per client IP. Allowed values are 10-1000. Special values are 0- 'unlimited'.
   * @return maxCpsPerClient
  **/
  @ApiModelProperty(value = "Maximum connections per second per client IP. Allowed values are 10-1000. Special values are 0- 'unlimited'.")


 
  @VsoMethod  
  public Integer getMaxCpsPerClient() {
    return maxCpsPerClient;
  }
    
  @VsoMethod
  public void setMaxCpsPerClient(Integer maxCpsPerClient) {
    this.maxCpsPerClient = maxCpsPerClient;
  }

  
  /**
   * Microservice representing the virtual service. It is a reference to an object of type MicroService.
   * @return microserviceRef
  **/
  @ApiModelProperty(value = "Microservice representing the virtual service. It is a reference to an object of type MicroService.")


 
  @VsoMethod  
  public String getMicroserviceRef() {
    return microserviceRef;
  }
    
  @VsoMethod
  public void setMicroserviceRef(String microserviceRef) {
    this.microserviceRef = microserviceRef;
  }

  
  /**
   * Minimum number of UP pools to mark VS up. Field introduced in 18.2.1, 17.2.12.
   * @return minPoolsUp
  **/
  @ApiModelProperty(value = "Minimum number of UP pools to mark VS up. Field introduced in 18.2.1, 17.2.12.")


 
  @VsoMethod  
  public Integer getMinPoolsUp() {
    return minPoolsUp;
  }
    
  @VsoMethod
  public void setMinPoolsUp(Integer minPoolsUp) {
    this.minPoolsUp = minPoolsUp;
  }

  
  /**
   * Name for the Virtual Service.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name for the Virtual Service.")
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
   * Determines network settings such as protocol, TCP or UDP, and related options for the protocol. It is a reference to an object of type NetworkProfile.
   * @return networkProfileRef
  **/
  @ApiModelProperty(value = "Determines network settings such as protocol, TCP or UDP, and related options for the protocol. It is a reference to an object of type NetworkProfile.")


 
  @VsoMethod  
  public String getNetworkProfileRef() {
    return networkProfileRef;
  }
    
  @VsoMethod
  public void setNetworkProfileRef(String networkProfileRef) {
    this.networkProfileRef = networkProfileRef;
  }

  
  /**
   * Manually override the network on which the Virtual Service is placed. It is a reference to an object of type Network. Field deprecated in 17.1.1.
   * @return networkRef
  **/
  @ApiModelProperty(value = "Manually override the network on which the Virtual Service is placed. It is a reference to an object of type Network. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public String getNetworkRef() {
    return networkRef;
  }
    
  @VsoMethod
  public void setNetworkRef(String networkRef) {
    this.networkRef = networkRef;
  }

  
  /**
   * Network security policies for the Virtual Service. It is a reference to an object of type NetworkSecurityPolicy.
   * @return networkSecurityPolicyRef
  **/
  @ApiModelProperty(value = "Network security policies for the Virtual Service. It is a reference to an object of type NetworkSecurityPolicy.")


 
  @VsoMethod  
  public String getNetworkSecurityPolicyRef() {
    return networkSecurityPolicyRef;
  }
    
  @VsoMethod
  public void setNetworkSecurityPolicyRef(String networkSecurityPolicyRef) {
    this.networkSecurityPolicyRef = networkSecurityPolicyRef;
  }

  
  public VirtualService addNsxSecuritygroupItem(String nsxSecuritygroupItem) {
    if (this.nsxSecuritygroup == null) {
      this.nsxSecuritygroup = new ArrayList<String>();
    }
    this.nsxSecuritygroup.add(nsxSecuritygroupItem);
    return this;
  }
  
  /**
   * A list of NSX Service Groups representing the Clients which can access the Virtual IP of the Virtual Service. Field introduced in 17.1.1.
   * @return nsxSecuritygroup
  **/
  @ApiModelProperty(value = "A list of NSX Service Groups representing the Clients which can access the Virtual IP of the Virtual Service. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public List<String> getNsxSecuritygroup() {
    return nsxSecuritygroup;
  }
    
  @VsoMethod
  public void setNsxSecuritygroup(List<String> nsxSecuritygroup) {
    this.nsxSecuritygroup = nsxSecuritygroup;
  }

  
  /**
   * Optional settings that determine performance limits like max connections or bandwdith etc.
   * @return performanceLimits
  **/
  @ApiModelProperty(value = "Optional settings that determine performance limits like max connections or bandwdith etc.")

  @Valid

 
  @VsoMethod  
  public PerformanceLimits getPerformanceLimits() {
    return performanceLimits;
  }
    
  @VsoMethod
  public void setPerformanceLimits(PerformanceLimits performanceLimits) {
    this.performanceLimits = performanceLimits;
  }

  
  /**
   * The pool group is an object that contains pools. It is a reference to an object of type PoolGroup.
   * @return poolGroupRef
  **/
  @ApiModelProperty(value = "The pool group is an object that contains pools. It is a reference to an object of type PoolGroup.")


 
  @VsoMethod  
  public String getPoolGroupRef() {
    return poolGroupRef;
  }
    
  @VsoMethod
  public void setPoolGroupRef(String poolGroupRef) {
    this.poolGroupRef = poolGroupRef;
  }

  
  /**
   * The pool is an object that contains destination servers and related attributes such as load-balancing and persistence. It is a reference to an object of type Pool.
   * @return poolRef
  **/
  @ApiModelProperty(value = "The pool is an object that contains destination servers and related attributes such as load-balancing and persistence. It is a reference to an object of type Pool.")


 
  @VsoMethod  
  public String getPoolRef() {
    return poolRef;
  }
    
  @VsoMethod
  public void setPoolRef(String poolRef) {
    this.poolRef = poolRef;
  }

  
  /**
   * (internal-use) Network port assigned to the Virtual Service IP address. Field deprecated in 17.1.1.
   * @return portUuid
  **/
  @ApiModelProperty(value = "(internal-use) Network port assigned to the Virtual Service IP address. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public String getPortUuid() {
    return portUuid;
  }
    
  @VsoMethod
  public void setPortUuid(String portUuid) {
    this.portUuid = portUuid;
  }

  
  /**
   * Remove listening port if VirtualService is down.
   * @return removeListeningPortOnVsDown
  **/
  @ApiModelProperty(value = "Remove listening port if VirtualService is down.")


 
  @VsoMethod  
  public Boolean isRemoveListeningPortOnVsDown() {
    return removeListeningPortOnVsDown;
  }
    
  @VsoMethod
  public void setRemoveListeningPortOnVsDown(Boolean removeListeningPortOnVsDown) {
    this.removeListeningPortOnVsDown = removeListeningPortOnVsDown;
  }

  
  /**
   * Rate limit the incoming requests to this virtual service.
   * @return requestsRateLimit
  **/
  @ApiModelProperty(value = "Rate limit the incoming requests to this virtual service.")

  @Valid

 
  @VsoMethod  
  public RateProfile getRequestsRateLimit() {
    return requestsRateLimit;
  }
    
  @VsoMethod
  public void setRequestsRateLimit(RateProfile requestsRateLimit) {
    this.requestsRateLimit = requestsRateLimit;
  }

  
  /**
   * Application-specific SAML config. Field introduced in 18.2.3.
   * @return samlSpConfig
  **/
  @ApiModelProperty(value = "Application-specific SAML config. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public SAMLSPConfig getSamlSpConfig() {
    return samlSpConfig;
  }
    
  @VsoMethod
  public void setSamlSpConfig(SAMLSPConfig samlSpConfig) {
    this.samlSpConfig = samlSpConfig;
  }

  
  /**
   * Disable re-distribution of flows across service engines for a virtual service. Enable if the network itself performs flow hashing with ECMP in environments such as GCP.
   * @return scaleoutEcmp
  **/
  @ApiModelProperty(value = "Disable re-distribution of flows across service engines for a virtual service. Enable if the network itself performs flow hashing with ECMP in environments such as GCP.")


 
  @VsoMethod  
  public Boolean isScaleoutEcmp() {
    return scaleoutEcmp;
  }
    
  @VsoMethod
  public void setScaleoutEcmp(Boolean scaleoutEcmp) {
    this.scaleoutEcmp = scaleoutEcmp;
  }

  
  /**
   * The Service Engine Group to use for this Virtual Service. Moving to a new SE Group is disruptive to existing connections for this VS. It is a reference to an object of type ServiceEngineGroup.
   * @return seGroupRef
  **/
  @ApiModelProperty(value = "The Service Engine Group to use for this Virtual Service. Moving to a new SE Group is disruptive to existing connections for this VS. It is a reference to an object of type ServiceEngineGroup.")


 
  @VsoMethod  
  public String getSeGroupRef() {
    return seGroupRef;
  }
    
  @VsoMethod
  public void setSeGroupRef(String seGroupRef) {
    this.seGroupRef = seGroupRef;
  }

  
  /**
   * Security policy applied on the traffic of the Virtual Service. This policy is used to perform security actions such as Distributed Denial of Service (DDoS) attack mitigation, etc. It is a reference to an object of type SecurityPolicy. Field introduced in 18.2.1.
   * @return securityPolicyRef
  **/
  @ApiModelProperty(value = "Security policy applied on the traffic of the Virtual Service. This policy is used to perform security actions such as Distributed Denial of Service (DDoS) attack mitigation, etc. It is a reference to an object of type SecurityPolicy. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getSecurityPolicyRef() {
    return securityPolicyRef;
  }
    
  @VsoMethod
  public void setSecurityPolicyRef(String securityPolicyRef) {
    this.securityPolicyRef = securityPolicyRef;
  }

  
  /**
   * Determines the network settings profile for the server side of TCP proxied connections.  Leave blank to use the same settings as the client to VS side of the connection. It is a reference to an object of type NetworkProfile.
   * @return serverNetworkProfileRef
  **/
  @ApiModelProperty(value = "Determines the network settings profile for the server side of TCP proxied connections.  Leave blank to use the same settings as the client to VS side of the connection. It is a reference to an object of type NetworkProfile.")


 
  @VsoMethod  
  public String getServerNetworkProfileRef() {
    return serverNetworkProfileRef;
  }
    
  @VsoMethod
  public void setServerNetworkProfileRef(String serverNetworkProfileRef) {
    this.serverNetworkProfileRef = serverNetworkProfileRef;
  }

  
  /**
   * Metadata pertaining to the Service provided by this virtual service. In Openshift/Kubernetes environments, egress pod info is stored. Any user input to this field will be overwritten by Avi Vantage.
   * @return serviceMetadata
  **/
  @ApiModelProperty(value = "Metadata pertaining to the Service provided by this virtual service. In Openshift/Kubernetes environments, egress pod info is stored. Any user input to this field will be overwritten by Avi Vantage.")


 
  @VsoMethod  
  public String getServiceMetadata() {
    return serviceMetadata;
  }
    
  @VsoMethod
  public void setServiceMetadata(String serviceMetadata) {
    this.serviceMetadata = serviceMetadata;
  }

  
  public VirtualService addServicePoolSelectItem(ServicePoolSelector servicePoolSelectItem) {
    if (this.servicePoolSelect == null) {
      this.servicePoolSelect = new ArrayList<ServicePoolSelector>();
    }
    this.servicePoolSelect.add(servicePoolSelectItem);
    return this;
  }
  
  /**
   * Select pool based on destination port.
   * @return servicePoolSelect
  **/
  @ApiModelProperty(value = "Select pool based on destination port.")

  @Valid

 
  @VsoMethod  
  public List<ServicePoolSelector> getServicePoolSelect() {
    return servicePoolSelect;
  }
    
  @VsoMethod
  public void setServicePoolSelect(List<ServicePoolSelector> servicePoolSelect) {
    this.servicePoolSelect = servicePoolSelect;
  }

  
  public VirtualService addServicesItem(Service servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<Service>();
    }
    this.services.add(servicesItem);
    return this;
  }
  
  /**
   * List of Services defined for this Virtual Service.
   * @return services
  **/
  @ApiModelProperty(value = "List of Services defined for this Virtual Service.")

  @Valid

 
  @VsoMethod  
  public List<Service> getServices() {
    return services;
  }
    
  @VsoMethod
  public void setServices(List<Service> services) {
    this.services = services;
  }

  
  /**
   * Sideband configuration to be used for this virtualservice.It can be used for sending traffic to sideband VIPs for external inspection etc.
   * @return sidebandProfile
  **/
  @ApiModelProperty(value = "Sideband configuration to be used for this virtualservice.It can be used for sending traffic to sideband VIPs for external inspection etc.")

  @Valid

 
  @VsoMethod  
  public SidebandProfile getSidebandProfile() {
    return sidebandProfile;
  }
    
  @VsoMethod
  public void setSidebandProfile(SidebandProfile sidebandProfile) {
    this.sidebandProfile = sidebandProfile;
  }

  
  public VirtualService addSnatIpItem(IpAddr snatIpItem) {
    if (this.snatIp == null) {
      this.snatIp = new ArrayList<IpAddr>();
    }
    this.snatIp.add(snatIpItem);
    return this;
  }
  
  /**
   * NAT'ted floating source IP Address(es) for upstream connection to servers.
   * @return snatIp
  **/
  @ApiModelProperty(value = "NAT'ted floating source IP Address(es) for upstream connection to servers.")

  @Valid

 
  @VsoMethod  
  public List<IpAddr> getSnatIp() {
    return snatIp;
  }
    
  @VsoMethod
  public void setSnatIp(List<IpAddr> snatIp) {
    this.snatIp = snatIp;
  }

  
  public VirtualService addSpPoolRefsItem(String spPoolRefsItem) {
    if (this.spPoolRefs == null) {
      this.spPoolRefs = new ArrayList<String>();
    }
    this.spPoolRefs.add(spPoolRefsItem);
    return this;
  }
  
  /**
   * GSLB pools used to manage site-persistence functionality. Each site-persistence pool contains the virtualservices in all the other sites, that is auto-generated by the GSLB manager. This is a read-only field for the user. It is a reference to an object of type Pool. Field introduced in 17.2.2.
   * @return spPoolRefs
  **/
  @ApiModelProperty(readOnly = true, value = "GSLB pools used to manage site-persistence functionality. Each site-persistence pool contains the virtualservices in all the other sites, that is auto-generated by the GSLB manager. This is a read-only field for the user. It is a reference to an object of type Pool. Field introduced in 17.2.2.")


 
  @VsoMethod  
  public List<String> getSpPoolRefs() {
    return spPoolRefs;
  }
    
  @VsoMethod
  public void setSpPoolRefs(List<String> spPoolRefs) {
    this.spPoolRefs = spPoolRefs;
  }

  
  public VirtualService addSslKeyAndCertificateRefsItem(String sslKeyAndCertificateRefsItem) {
    if (this.sslKeyAndCertificateRefs == null) {
      this.sslKeyAndCertificateRefs = new ArrayList<String>();
    }
    this.sslKeyAndCertificateRefs.add(sslKeyAndCertificateRefsItem);
    return this;
  }
  
  /**
   * Select or create one or two certificates, EC and/or RSA, that will be presented to SSL/TLS terminated connections. It is a reference to an object of type SSLKeyAndCertificate.
   * @return sslKeyAndCertificateRefs
  **/
  @ApiModelProperty(value = "Select or create one or two certificates, EC and/or RSA, that will be presented to SSL/TLS terminated connections. It is a reference to an object of type SSLKeyAndCertificate.")


 
  @VsoMethod  
  public List<String> getSslKeyAndCertificateRefs() {
    return sslKeyAndCertificateRefs;
  }
    
  @VsoMethod
  public void setSslKeyAndCertificateRefs(List<String> sslKeyAndCertificateRefs) {
    this.sslKeyAndCertificateRefs = sslKeyAndCertificateRefs;
  }

  
  /**
   * Determines the set of SSL versions and ciphers to accept for SSL/TLS terminated connections. It is a reference to an object of type SSLProfile.
   * @return sslProfileRef
  **/
  @ApiModelProperty(value = "Determines the set of SSL versions and ciphers to accept for SSL/TLS terminated connections. It is a reference to an object of type SSLProfile.")


 
  @VsoMethod  
  public String getSslProfileRef() {
    return sslProfileRef;
  }
    
  @VsoMethod
  public void setSslProfileRef(String sslProfileRef) {
    this.sslProfileRef = sslProfileRef;
  }

  
  public VirtualService addSslProfileSelectorsItem(SSLProfileSelector sslProfileSelectorsItem) {
    if (this.sslProfileSelectors == null) {
      this.sslProfileSelectors = new ArrayList<SSLProfileSelector>();
    }
    this.sslProfileSelectors.add(sslProfileSelectorsItem);
    return this;
  }
  
  /**
   * Select SSL Profile based on client IP address match. Field introduced in 18.2.3.
   * @return sslProfileSelectors
  **/
  @ApiModelProperty(value = "Select SSL Profile based on client IP address match. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public List<SSLProfileSelector> getSslProfileSelectors() {
    return sslProfileSelectors;
  }
    
  @VsoMethod
  public void setSslProfileSelectors(List<SSLProfileSelector> sslProfileSelectors) {
    this.sslProfileSelectors = sslProfileSelectors;
  }

  
  /**
   * Expected number of SSL session cache entries (may be exceeded). Allowed values are 1024-16383.
   * @return sslSessCacheAvgSize
  **/
  @ApiModelProperty(value = "Expected number of SSL session cache entries (may be exceeded). Allowed values are 1024-16383.")


 
  @VsoMethod  
  public Integer getSslSessCacheAvgSize() {
    return sslSessCacheAvgSize;
  }
    
  @VsoMethod
  public void setSslSessCacheAvgSize(Integer sslSessCacheAvgSize) {
    this.sslSessCacheAvgSize = sslSessCacheAvgSize;
  }

  
  /**
   * Client Authentication and Authorization Policy for the virtualservice. Field deprecated in 18.2.3. Field introduced in 18.2.1.
   * @return ssoPolicy
  **/
  @ApiModelProperty(value = "Client Authentication and Authorization Policy for the virtualservice. Field deprecated in 18.2.3. Field introduced in 18.2.1.")

  @Valid

 
  @VsoMethod  
  public SSOPolicy getSsoPolicy() {
    return ssoPolicy;
  }
    
  @VsoMethod
  public void setSsoPolicy(SSOPolicy ssoPolicy) {
    this.ssoPolicy = ssoPolicy;
  }

  
  /**
   * The SSO Policy attached to the virtualservice. It is a reference to an object of type SSOPolicy. Field introduced in 18.2.3.
   * @return ssoPolicyRef
  **/
  @ApiModelProperty(value = "The SSO Policy attached to the virtualservice. It is a reference to an object of type SSOPolicy. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getSsoPolicyRef() {
    return ssoPolicyRef;
  }
    
  @VsoMethod
  public void setSsoPolicyRef(String ssoPolicyRef) {
    this.ssoPolicyRef = ssoPolicyRef;
  }

  
  public VirtualService addStaticDnsRecordsItem(DnsRecord staticDnsRecordsItem) {
    if (this.staticDnsRecords == null) {
      this.staticDnsRecords = new ArrayList<DnsRecord>();
    }
    this.staticDnsRecords.add(staticDnsRecordsItem);
    return this;
  }
  
  /**
   * List of static DNS records applied to this Virtual Service. These are static entries and no health monitoring is performed against the IP addresses.
   * @return staticDnsRecords
  **/
  @ApiModelProperty(value = "List of static DNS records applied to this Virtual Service. These are static entries and no health monitoring is performed against the IP addresses.")

  @Valid

 
  @VsoMethod  
  public List<DnsRecord> getStaticDnsRecords() {
    return staticDnsRecords;
  }
    
  @VsoMethod
  public void setStaticDnsRecords(List<DnsRecord> staticDnsRecords) {
    this.staticDnsRecords = staticDnsRecords;
  }

  
  /**
   * Subnet providing reachability for client facing Virtual Service IP. Field deprecated in 17.1.1.
   * @return subnet
  **/
  @ApiModelProperty(value = "Subnet providing reachability for client facing Virtual Service IP. Field deprecated in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getSubnet() {
    return subnet;
  }
    
  @VsoMethod
  public void setSubnet(IpAddrPrefix subnet) {
    this.subnet = subnet;
  }

  
  /**
   * It represents subnet for the Virtual Service IP address allocation when auto_allocate_ip is True.It is only applicable in OpenStack or AWS cloud. This field is required if auto_allocate_ip is True. Field deprecated in 17.1.1.
   * @return subnetUuid
  **/
  @ApiModelProperty(value = "It represents subnet for the Virtual Service IP address allocation when auto_allocate_ip is True.It is only applicable in OpenStack or AWS cloud. This field is required if auto_allocate_ip is True. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public String getSubnetUuid() {
    return subnetUuid;
  }
    
  @VsoMethod
  public void setSubnetUuid(String subnetUuid) {
    this.subnetUuid = subnetUuid;
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
   * Used for testing SE Datastore Upgrade 2.0 functionality. It is a reference to an object of type TestSeDatastoreLevel1. Field introduced in 18.2.6.
   * @return testSeDatastoreLevel1Ref
  **/
  @ApiModelProperty(value = "Used for testing SE Datastore Upgrade 2.0 functionality. It is a reference to an object of type TestSeDatastoreLevel1. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getTestSeDatastoreLevel1Ref() {
    return testSeDatastoreLevel1Ref;
  }
    
  @VsoMethod
  public void setTestSeDatastoreLevel1Ref(String testSeDatastoreLevel1Ref) {
    this.testSeDatastoreLevel1Ref = testSeDatastoreLevel1Ref;
  }

  
  public VirtualService addTopologyPoliciesItem(DnsPolicies topologyPoliciesItem) {
    if (this.topologyPolicies == null) {
      this.topologyPolicies = new ArrayList<DnsPolicies>();
    }
    this.topologyPolicies.add(topologyPoliciesItem);
    return this;
  }
  
  /**
   * Topology Policies applied on the dns traffic of the Virtual Service based onGSLB Topology algorithm. Field introduced in 18.2.3.
   * @return topologyPolicies
  **/
  @ApiModelProperty(value = "Topology Policies applied on the dns traffic of the Virtual Service based onGSLB Topology algorithm. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public List<DnsPolicies> getTopologyPolicies() {
    return topologyPolicies;
  }
    
  @VsoMethod
  public void setTopologyPolicies(List<DnsPolicies> topologyPolicies) {
    this.topologyPolicies = topologyPolicies;
  }

  
  /**
   * Server network or list of servers for cloning traffic. It is a reference to an object of type TrafficCloneProfile. Field introduced in 17.1.1.
   * @return trafficCloneProfileRef
  **/
  @ApiModelProperty(value = "Server network or list of servers for cloning traffic. It is a reference to an object of type TrafficCloneProfile. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getTrafficCloneProfileRef() {
    return trafficCloneProfileRef;
  }
    
  @VsoMethod
  public void setTrafficCloneProfileRef(String trafficCloneProfileRef) {
    this.trafficCloneProfileRef = trafficCloneProfileRef;
  }

  
  /**
   * Knob to enable the Virtual Service traffic on its assigned service engines. This setting is effective only when the enabled flag is set to True. Field introduced in 17.2.8.
   * @return trafficEnabled
  **/
  @ApiModelProperty(value = "Knob to enable the Virtual Service traffic on its assigned service engines. This setting is effective only when the enabled flag is set to True. Field introduced in 17.2.8.")


 
  @VsoMethod  
  public Boolean isTrafficEnabled() {
    return trafficEnabled;
  }
    
  @VsoMethod
  public void setTrafficEnabled(Boolean trafficEnabled) {
    this.trafficEnabled = trafficEnabled;
  }

  
  /**
   * Specify if this is a normal Virtual Service, or if it is the parent or child of an SNI-enabled virtual hosted Virtual Service. Enum options - VS_TYPE_NORMAL, VS_TYPE_VH_PARENT, VS_TYPE_VH_CHILD.
   * @return type
  **/
  @ApiModelProperty(value = "Specify if this is a normal Virtual Service, or if it is the parent or child of an SNI-enabled virtual hosted Virtual Service. Enum options - VS_TYPE_NORMAL, VS_TYPE_VH_PARENT, VS_TYPE_VH_CHILD.")


 
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
   * Use Bridge IP as VIP on each Host in Mesos deployments.
   * @return useBridgeIpAsVip
  **/
  @ApiModelProperty(value = "Use Bridge IP as VIP on each Host in Mesos deployments.")


 
  @VsoMethod  
  public Boolean isUseBridgeIpAsVip() {
    return useBridgeIpAsVip;
  }
    
  @VsoMethod
  public void setUseBridgeIpAsVip(Boolean useBridgeIpAsVip) {
    this.useBridgeIpAsVip = useBridgeIpAsVip;
  }

  
  /**
   * Use the Virtual IP as the SNAT IP for health monitoring and sending traffic to the backend servers instead of the Service Engine interface IP. The caveat of enabling this option is that the VirtualService cannot be configued in an Active-Active HA mode. DNS based Multi VIP solution has to be used for HA & Non-disruptive Upgrade purposes. Field introduced in 17.1.9,17.2.3.
   * @return useVipAsSnat
  **/
  @ApiModelProperty(value = "Use the Virtual IP as the SNAT IP for health monitoring and sending traffic to the backend servers instead of the Service Engine interface IP. The caveat of enabling this option is that the VirtualService cannot be configued in an Active-Active HA mode. DNS based Multi VIP solution has to be used for HA & Non-disruptive Upgrade purposes. Field introduced in 17.1.9,17.2.3.")


 
  @VsoMethod  
  public Boolean isUseVipAsSnat() {
    return useVipAsSnat;
  }
    
  @VsoMethod
  public void setUseVipAsSnat(Boolean useVipAsSnat) {
    this.useVipAsSnat = useVipAsSnat;
  }

  
  /**
   * UUID of the VirtualService.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the VirtualService.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public VirtualService addVhDomainNameItem(String vhDomainNameItem) {
    if (this.vhDomainName == null) {
      this.vhDomainName = new ArrayList<String>();
    }
    this.vhDomainName.add(vhDomainNameItem);
    return this;
  }
  
  /**
   * The exact name requested from the client's SNI-enabled TLS hello domain name field. If this is a match, the parent VS will forward the connection to this child VS.
   * @return vhDomainName
  **/
  @ApiModelProperty(value = "The exact name requested from the client's SNI-enabled TLS hello domain name field. If this is a match, the parent VS will forward the connection to this child VS.")


 
  @VsoMethod  
  public List<String> getVhDomainName() {
    return vhDomainName;
  }
    
  @VsoMethod
  public void setVhDomainName(List<String> vhDomainName) {
    this.vhDomainName = vhDomainName;
  }

  
  /**
   * Specifies the Virtual Service acting as Virtual Hosting (SNI) parent.
   * @return vhParentVsUuid
  **/
  @ApiModelProperty(value = "Specifies the Virtual Service acting as Virtual Hosting (SNI) parent.")


 
  @VsoMethod  
  public String getVhParentVsUuid() {
    return vhParentVsUuid;
  }
    
  @VsoMethod
  public void setVhParentVsUuid(String vhParentVsUuid) {
    this.vhParentVsUuid = vhParentVsUuid;
  }

  
  public VirtualService addVipItem(Vip vipItem) {
    if (this.vip == null) {
      this.vip = new ArrayList<Vip>();
    }
    this.vip.add(vipItem);
    return this;
  }
  
  /**
   * List of Virtual Service IPs. While creating a 'Shared VS',please use vsvip_ref to point to the shared entities. Field introduced in 17.1.1.
   * @return vip
  **/
  @ApiModelProperty(value = "List of Virtual Service IPs. While creating a 'Shared VS',please use vsvip_ref to point to the shared entities. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<Vip> getVip() {
    return vip;
  }
    
  @VsoMethod
  public void setVip(List<Vip> vip) {
    this.vip = vip;
  }

  
  /**
   * Virtual Routing Context that the Virtual Service is bound to. This is used to provide the isolation of the set of networks the application is attached to. It is a reference to an object of type VrfContext.
   * @return vrfContextRef
  **/
  @ApiModelProperty(value = "Virtual Routing Context that the Virtual Service is bound to. This is used to provide the isolation of the set of networks the application is attached to. It is a reference to an object of type VrfContext.")


 
  @VsoMethod  
  public String getVrfContextRef() {
    return vrfContextRef;
  }
    
  @VsoMethod
  public void setVrfContextRef(String vrfContextRef) {
    this.vrfContextRef = vrfContextRef;
  }

  
  public VirtualService addVsDatascriptsItem(VSDataScripts vsDatascriptsItem) {
    if (this.vsDatascripts == null) {
      this.vsDatascripts = new ArrayList<VSDataScripts>();
    }
    this.vsDatascripts.add(vsDatascriptsItem);
    return this;
  }
  
  /**
   * Datascripts applied on the data traffic of the Virtual Service.
   * @return vsDatascripts
  **/
  @ApiModelProperty(value = "Datascripts applied on the data traffic of the Virtual Service.")

  @Valid

 
  @VsoMethod  
  public List<VSDataScripts> getVsDatascripts() {
    return vsDatascripts;
  }
    
  @VsoMethod
  public void setVsDatascripts(List<VSDataScripts> vsDatascripts) {
    this.vsDatascripts = vsDatascripts;
  }

  
  /**
   * Checksum of cloud configuration for VsVip. Internally set by cloud connector. Field introduced in 17.2.9, 18.1.2.
   * @return vsvipCloudConfigCksum
  **/
  @ApiModelProperty(value = "Checksum of cloud configuration for VsVip. Internally set by cloud connector. Field introduced in 17.2.9, 18.1.2.")


 
  @VsoMethod  
  public String getVsvipCloudConfigCksum() {
    return vsvipCloudConfigCksum;
  }
    
  @VsoMethod
  public void setVsvipCloudConfigCksum(String vsvipCloudConfigCksum) {
    this.vsvipCloudConfigCksum = vsvipCloudConfigCksum;
  }

  
  /**
   * Mostly used during the creation of Shared VS, this field refers to entities that can be shared across Virtual Services. It is a reference to an object of type VsVip. Field introduced in 17.1.1.
   * @return vsvipRef
  **/
  @ApiModelProperty(value = "Mostly used during the creation of Shared VS, this field refers to entities that can be shared across Virtual Services. It is a reference to an object of type VsVip. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getVsvipRef() {
    return vsvipRef;
  }
    
  @VsoMethod
  public void setVsvipRef(String vsvipRef) {
    this.vsvipRef = vsvipRef;
  }

  
  /**
   * WAF policy for the Virtual Service. It is a reference to an object of type WafPolicy. Field introduced in 17.2.1.
   * @return wafPolicyRef
  **/
  @ApiModelProperty(value = "WAF policy for the Virtual Service. It is a reference to an object of type WafPolicy. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getWafPolicyRef() {
    return wafPolicyRef;
  }
    
  @VsoMethod
  public void setWafPolicyRef(String wafPolicyRef) {
    this.wafPolicyRef = wafPolicyRef;
  }

  
  /**
   * The Quality of Service weight to assign to traffic transmitted from this Virtual Service.  A higher weight will prioritize traffic versus other Virtual Services sharing the same Service Engines. Allowed values are 1-128.
   * @return weight
  **/
  @ApiModelProperty(value = "The Quality of Service weight to assign to traffic transmitted from this Virtual Service.  A higher weight will prioritize traffic versus other Virtual Services sharing the same Service Engines. Allowed values are 1-128.")


 
  @VsoMethod  
  public Integer getWeight() {
    return weight;
  }
    
  @VsoMethod
  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  
  public String getObjectID() {
		return "VirtualService";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualService virtualService = (VirtualService) o;
    return Objects.equals(this.lastModified, virtualService.lastModified) &&
        Objects.equals(this.activeStandbySeTag, virtualService.activeStandbySeTag) &&
        Objects.equals(this.allowInvalidClientCert, virtualService.allowInvalidClientCert) &&
        Objects.equals(this.analyticsPolicy, virtualService.analyticsPolicy) &&
        Objects.equals(this.analyticsProfileRef, virtualService.analyticsProfileRef) &&
        Objects.equals(this.apicContractGraph, virtualService.apicContractGraph) &&
        Objects.equals(this.applicationProfileRef, virtualService.applicationProfileRef) &&
        Objects.equals(this.autoAllocateFloatingIp, virtualService.autoAllocateFloatingIp) &&
        Objects.equals(this.autoAllocateIp, virtualService.autoAllocateIp) &&
        Objects.equals(this.availabilityZone, virtualService.availabilityZone) &&
        Objects.equals(this.aviAllocatedFip, virtualService.aviAllocatedFip) &&
        Objects.equals(this.aviAllocatedVip, virtualService.aviAllocatedVip) &&
        Objects.equals(this.azureAvailabilitySet, virtualService.azureAvailabilitySet) &&
        Objects.equals(this.bulkSyncKvcache, virtualService.bulkSyncKvcache) &&
        Objects.equals(this.clientAuth, virtualService.clientAuth) &&
        Objects.equals(this.closeClientConnOnConfigUpdate, virtualService.closeClientConnOnConfigUpdate) &&
        Objects.equals(this.cloudConfigCksum, virtualService.cloudConfigCksum) &&
        Objects.equals(this.cloudRef, virtualService.cloudRef) &&
        Objects.equals(this.cloudType, virtualService.cloudType) &&
        Objects.equals(this.connectionsRateLimit, virtualService.connectionsRateLimit) &&
        Objects.equals(this.contentRewrite, virtualService.contentRewrite) &&
        Objects.equals(this.createdBy, virtualService.createdBy) &&
        Objects.equals(this.delayFairness, virtualService.delayFairness) &&
        Objects.equals(this.description, virtualService.description) &&
        Objects.equals(this.discoveredNetworkRef, virtualService.discoveredNetworkRef) &&
        Objects.equals(this.discoveredNetworks, virtualService.discoveredNetworks) &&
        Objects.equals(this.discoveredSubnet, virtualService.discoveredSubnet) &&
        Objects.equals(this.dnsInfo, virtualService.dnsInfo) &&
        Objects.equals(this.dnsPolicies, virtualService.dnsPolicies) &&
        Objects.equals(this.eastWestPlacement, virtualService.eastWestPlacement) &&
        Objects.equals(this.enableAutogw, virtualService.enableAutogw) &&
        Objects.equals(this.enableRhi, virtualService.enableRhi) &&
        Objects.equals(this.enableRhiSnat, virtualService.enableRhiSnat) &&
        Objects.equals(this.enabled, virtualService.enabled) &&
        Objects.equals(this.errorPageProfileRef, virtualService.errorPageProfileRef) &&
        Objects.equals(this.floatingIp, virtualService.floatingIp) &&
        Objects.equals(this.floatingSubnetUuid, virtualService.floatingSubnetUuid) &&
        Objects.equals(this.flowDist, virtualService.flowDist) &&
        Objects.equals(this.flowLabelType, virtualService.flowLabelType) &&
        Objects.equals(this.fqdn, virtualService.fqdn) &&
        Objects.equals(this.hostNameXlate, virtualService.hostNameXlate) &&
        Objects.equals(this.httpPolicies, virtualService.httpPolicies) &&
        Objects.equals(this.ignPoolNetReach, virtualService.ignPoolNetReach) &&
        Objects.equals(this.ipAddress, virtualService.ipAddress) &&
        Objects.equals(this.ipamNetworkSubnet, virtualService.ipamNetworkSubnet) &&
        Objects.equals(this.l4Policies, virtualService.l4Policies) &&
        Objects.equals(this.limitDoser, virtualService.limitDoser) &&
        Objects.equals(this.maxCpsPerClient, virtualService.maxCpsPerClient) &&
        Objects.equals(this.microserviceRef, virtualService.microserviceRef) &&
        Objects.equals(this.minPoolsUp, virtualService.minPoolsUp) &&
        Objects.equals(this.name, virtualService.name) &&
        Objects.equals(this.networkProfileRef, virtualService.networkProfileRef) &&
        Objects.equals(this.networkRef, virtualService.networkRef) &&
        Objects.equals(this.networkSecurityPolicyRef, virtualService.networkSecurityPolicyRef) &&
        Objects.equals(this.nsxSecuritygroup, virtualService.nsxSecuritygroup) &&
        Objects.equals(this.performanceLimits, virtualService.performanceLimits) &&
        Objects.equals(this.poolGroupRef, virtualService.poolGroupRef) &&
        Objects.equals(this.poolRef, virtualService.poolRef) &&
        Objects.equals(this.portUuid, virtualService.portUuid) &&
        Objects.equals(this.removeListeningPortOnVsDown, virtualService.removeListeningPortOnVsDown) &&
        Objects.equals(this.requestsRateLimit, virtualService.requestsRateLimit) &&
        Objects.equals(this.samlSpConfig, virtualService.samlSpConfig) &&
        Objects.equals(this.scaleoutEcmp, virtualService.scaleoutEcmp) &&
        Objects.equals(this.seGroupRef, virtualService.seGroupRef) &&
        Objects.equals(this.securityPolicyRef, virtualService.securityPolicyRef) &&
        Objects.equals(this.serverNetworkProfileRef, virtualService.serverNetworkProfileRef) &&
        Objects.equals(this.serviceMetadata, virtualService.serviceMetadata) &&
        Objects.equals(this.servicePoolSelect, virtualService.servicePoolSelect) &&
        Objects.equals(this.services, virtualService.services) &&
        Objects.equals(this.sidebandProfile, virtualService.sidebandProfile) &&
        Objects.equals(this.snatIp, virtualService.snatIp) &&
        Objects.equals(this.spPoolRefs, virtualService.spPoolRefs) &&
        Objects.equals(this.sslKeyAndCertificateRefs, virtualService.sslKeyAndCertificateRefs) &&
        Objects.equals(this.sslProfileRef, virtualService.sslProfileRef) &&
        Objects.equals(this.sslProfileSelectors, virtualService.sslProfileSelectors) &&
        Objects.equals(this.sslSessCacheAvgSize, virtualService.sslSessCacheAvgSize) &&
        Objects.equals(this.ssoPolicy, virtualService.ssoPolicy) &&
        Objects.equals(this.ssoPolicyRef, virtualService.ssoPolicyRef) &&
        Objects.equals(this.staticDnsRecords, virtualService.staticDnsRecords) &&
        Objects.equals(this.subnet, virtualService.subnet) &&
        Objects.equals(this.subnetUuid, virtualService.subnetUuid) &&
        Objects.equals(this.tenantRef, virtualService.tenantRef) &&
        Objects.equals(this.testSeDatastoreLevel1Ref, virtualService.testSeDatastoreLevel1Ref) &&
        Objects.equals(this.topologyPolicies, virtualService.topologyPolicies) &&
        Objects.equals(this.trafficCloneProfileRef, virtualService.trafficCloneProfileRef) &&
        Objects.equals(this.trafficEnabled, virtualService.trafficEnabled) &&
        Objects.equals(this.type, virtualService.type) &&
        Objects.equals(this.url, virtualService.url) &&
        Objects.equals(this.useBridgeIpAsVip, virtualService.useBridgeIpAsVip) &&
        Objects.equals(this.useVipAsSnat, virtualService.useVipAsSnat) &&
        Objects.equals(this.uuid, virtualService.uuid) &&
        Objects.equals(this.vhDomainName, virtualService.vhDomainName) &&
        Objects.equals(this.vhParentVsUuid, virtualService.vhParentVsUuid) &&
        Objects.equals(this.vip, virtualService.vip) &&
        Objects.equals(this.vrfContextRef, virtualService.vrfContextRef) &&
        Objects.equals(this.vsDatascripts, virtualService.vsDatascripts) &&
        Objects.equals(this.vsvipCloudConfigCksum, virtualService.vsvipCloudConfigCksum) &&
        Objects.equals(this.vsvipRef, virtualService.vsvipRef) &&
        Objects.equals(this.wafPolicyRef, virtualService.wafPolicyRef) &&
        Objects.equals(this.weight, virtualService.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, activeStandbySeTag, allowInvalidClientCert, analyticsPolicy, analyticsProfileRef, apicContractGraph, applicationProfileRef, autoAllocateFloatingIp, autoAllocateIp, availabilityZone, aviAllocatedFip, aviAllocatedVip, azureAvailabilitySet, bulkSyncKvcache, clientAuth, closeClientConnOnConfigUpdate, cloudConfigCksum, cloudRef, cloudType, connectionsRateLimit, contentRewrite, createdBy, delayFairness, description, discoveredNetworkRef, discoveredNetworks, discoveredSubnet, dnsInfo, dnsPolicies, eastWestPlacement, enableAutogw, enableRhi, enableRhiSnat, enabled, errorPageProfileRef, floatingIp, floatingSubnetUuid, flowDist, flowLabelType, fqdn, hostNameXlate, httpPolicies, ignPoolNetReach, ipAddress, ipamNetworkSubnet, l4Policies, limitDoser, maxCpsPerClient, microserviceRef, minPoolsUp, name, networkProfileRef, networkRef, networkSecurityPolicyRef, nsxSecuritygroup, performanceLimits, poolGroupRef, poolRef, portUuid, removeListeningPortOnVsDown, requestsRateLimit, samlSpConfig, scaleoutEcmp, seGroupRef, securityPolicyRef, serverNetworkProfileRef, serviceMetadata, servicePoolSelect, services, sidebandProfile, snatIp, spPoolRefs, sslKeyAndCertificateRefs, sslProfileRef, sslProfileSelectors, sslSessCacheAvgSize, ssoPolicy, ssoPolicyRef, staticDnsRecords, subnet, subnetUuid, tenantRef, testSeDatastoreLevel1Ref, topologyPolicies, trafficCloneProfileRef, trafficEnabled, type, url, useBridgeIpAsVip, useVipAsSnat, uuid, vhDomainName, vhParentVsUuid, vip, vrfContextRef, vsDatascripts, vsvipCloudConfigCksum, vsvipRef, wafPolicyRef, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualService {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    activeStandbySeTag: ").append(toIndentedString(activeStandbySeTag)).append("\n");
    sb.append("    allowInvalidClientCert: ").append(toIndentedString(allowInvalidClientCert)).append("\n");
    sb.append("    analyticsPolicy: ").append(toIndentedString(analyticsPolicy)).append("\n");
    sb.append("    analyticsProfileRef: ").append(toIndentedString(analyticsProfileRef)).append("\n");
    sb.append("    apicContractGraph: ").append(toIndentedString(apicContractGraph)).append("\n");
    sb.append("    applicationProfileRef: ").append(toIndentedString(applicationProfileRef)).append("\n");
    sb.append("    autoAllocateFloatingIp: ").append(toIndentedString(autoAllocateFloatingIp)).append("\n");
    sb.append("    autoAllocateIp: ").append(toIndentedString(autoAllocateIp)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    aviAllocatedFip: ").append(toIndentedString(aviAllocatedFip)).append("\n");
    sb.append("    aviAllocatedVip: ").append(toIndentedString(aviAllocatedVip)).append("\n");
    sb.append("    azureAvailabilitySet: ").append(toIndentedString(azureAvailabilitySet)).append("\n");
    sb.append("    bulkSyncKvcache: ").append(toIndentedString(bulkSyncKvcache)).append("\n");
    sb.append("    clientAuth: ").append(toIndentedString(clientAuth)).append("\n");
    sb.append("    closeClientConnOnConfigUpdate: ").append(toIndentedString(closeClientConnOnConfigUpdate)).append("\n");
    sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    connectionsRateLimit: ").append(toIndentedString(connectionsRateLimit)).append("\n");
    sb.append("    contentRewrite: ").append(toIndentedString(contentRewrite)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    delayFairness: ").append(toIndentedString(delayFairness)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discoveredNetworkRef: ").append(toIndentedString(discoveredNetworkRef)).append("\n");
    sb.append("    discoveredNetworks: ").append(toIndentedString(discoveredNetworks)).append("\n");
    sb.append("    discoveredSubnet: ").append(toIndentedString(discoveredSubnet)).append("\n");
    sb.append("    dnsInfo: ").append(toIndentedString(dnsInfo)).append("\n");
    sb.append("    dnsPolicies: ").append(toIndentedString(dnsPolicies)).append("\n");
    sb.append("    eastWestPlacement: ").append(toIndentedString(eastWestPlacement)).append("\n");
    sb.append("    enableAutogw: ").append(toIndentedString(enableAutogw)).append("\n");
    sb.append("    enableRhi: ").append(toIndentedString(enableRhi)).append("\n");
    sb.append("    enableRhiSnat: ").append(toIndentedString(enableRhiSnat)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    errorPageProfileRef: ").append(toIndentedString(errorPageProfileRef)).append("\n");
    sb.append("    floatingIp: ").append(toIndentedString(floatingIp)).append("\n");
    sb.append("    floatingSubnetUuid: ").append(toIndentedString(floatingSubnetUuid)).append("\n");
    sb.append("    flowDist: ").append(toIndentedString(flowDist)).append("\n");
    sb.append("    flowLabelType: ").append(toIndentedString(flowLabelType)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    hostNameXlate: ").append(toIndentedString(hostNameXlate)).append("\n");
    sb.append("    httpPolicies: ").append(toIndentedString(httpPolicies)).append("\n");
    sb.append("    ignPoolNetReach: ").append(toIndentedString(ignPoolNetReach)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipamNetworkSubnet: ").append(toIndentedString(ipamNetworkSubnet)).append("\n");
    sb.append("    l4Policies: ").append(toIndentedString(l4Policies)).append("\n");
    sb.append("    limitDoser: ").append(toIndentedString(limitDoser)).append("\n");
    sb.append("    maxCpsPerClient: ").append(toIndentedString(maxCpsPerClient)).append("\n");
    sb.append("    microserviceRef: ").append(toIndentedString(microserviceRef)).append("\n");
    sb.append("    minPoolsUp: ").append(toIndentedString(minPoolsUp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkProfileRef: ").append(toIndentedString(networkProfileRef)).append("\n");
    sb.append("    networkRef: ").append(toIndentedString(networkRef)).append("\n");
    sb.append("    networkSecurityPolicyRef: ").append(toIndentedString(networkSecurityPolicyRef)).append("\n");
    sb.append("    nsxSecuritygroup: ").append(toIndentedString(nsxSecuritygroup)).append("\n");
    sb.append("    performanceLimits: ").append(toIndentedString(performanceLimits)).append("\n");
    sb.append("    poolGroupRef: ").append(toIndentedString(poolGroupRef)).append("\n");
    sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
    sb.append("    portUuid: ").append(toIndentedString(portUuid)).append("\n");
    sb.append("    removeListeningPortOnVsDown: ").append(toIndentedString(removeListeningPortOnVsDown)).append("\n");
    sb.append("    requestsRateLimit: ").append(toIndentedString(requestsRateLimit)).append("\n");
    sb.append("    samlSpConfig: ").append(toIndentedString(samlSpConfig)).append("\n");
    sb.append("    scaleoutEcmp: ").append(toIndentedString(scaleoutEcmp)).append("\n");
    sb.append("    seGroupRef: ").append(toIndentedString(seGroupRef)).append("\n");
    sb.append("    securityPolicyRef: ").append(toIndentedString(securityPolicyRef)).append("\n");
    sb.append("    serverNetworkProfileRef: ").append(toIndentedString(serverNetworkProfileRef)).append("\n");
    sb.append("    serviceMetadata: ").append(toIndentedString(serviceMetadata)).append("\n");
    sb.append("    servicePoolSelect: ").append(toIndentedString(servicePoolSelect)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    sidebandProfile: ").append(toIndentedString(sidebandProfile)).append("\n");
    sb.append("    snatIp: ").append(toIndentedString(snatIp)).append("\n");
    sb.append("    spPoolRefs: ").append(toIndentedString(spPoolRefs)).append("\n");
    sb.append("    sslKeyAndCertificateRefs: ").append(toIndentedString(sslKeyAndCertificateRefs)).append("\n");
    sb.append("    sslProfileRef: ").append(toIndentedString(sslProfileRef)).append("\n");
    sb.append("    sslProfileSelectors: ").append(toIndentedString(sslProfileSelectors)).append("\n");
    sb.append("    sslSessCacheAvgSize: ").append(toIndentedString(sslSessCacheAvgSize)).append("\n");
    sb.append("    ssoPolicy: ").append(toIndentedString(ssoPolicy)).append("\n");
    sb.append("    ssoPolicyRef: ").append(toIndentedString(ssoPolicyRef)).append("\n");
    sb.append("    staticDnsRecords: ").append(toIndentedString(staticDnsRecords)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
    sb.append("    subnetUuid: ").append(toIndentedString(subnetUuid)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    testSeDatastoreLevel1Ref: ").append(toIndentedString(testSeDatastoreLevel1Ref)).append("\n");
    sb.append("    topologyPolicies: ").append(toIndentedString(topologyPolicies)).append("\n");
    sb.append("    trafficCloneProfileRef: ").append(toIndentedString(trafficCloneProfileRef)).append("\n");
    sb.append("    trafficEnabled: ").append(toIndentedString(trafficEnabled)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    useBridgeIpAsVip: ").append(toIndentedString(useBridgeIpAsVip)).append("\n");
    sb.append("    useVipAsSnat: ").append(toIndentedString(useVipAsSnat)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vhDomainName: ").append(toIndentedString(vhDomainName)).append("\n");
    sb.append("    vhParentVsUuid: ").append(toIndentedString(vhParentVsUuid)).append("\n");
    sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
    sb.append("    vrfContextRef: ").append(toIndentedString(vrfContextRef)).append("\n");
    sb.append("    vsDatascripts: ").append(toIndentedString(vsDatascripts)).append("\n");
    sb.append("    vsvipCloudConfigCksum: ").append(toIndentedString(vsvipCloudConfigCksum)).append("\n");
    sb.append("    vsvipRef: ").append(toIndentedString(vsvipRef)).append("\n");
    sb.append("    wafPolicyRef: ").append(toIndentedString(wafPolicyRef)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

