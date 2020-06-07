package com.vmware.avi.vro.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vmware.avi.vro.Constants;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;

import io.swagger.annotations.ApiModelProperty;

/**
 * Pool
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "Pool")
@VsoFinder(name = Constants.FINDER_VRO_POOL, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Pool extends AviRestResource {
	@JsonProperty("_last_modified")
	private String lastModified = null;

	@JsonProperty("a_pool")
	private String aPool = null;

	@JsonProperty("ab_pool")
	private AbPool abPool = null;

	@JsonProperty("ab_priority")
	private Integer abPriority = null;

	@JsonProperty("analytics_policy")
	private PoolAnalyticsPolicy analyticsPolicy = null;

	@JsonProperty("analytics_profile_ref")
	private String analyticsProfileRef = null;

	@JsonProperty("apic_epg_name")
	private String apicEpgName = null;

	@JsonProperty("application_persistence_profile_ref")
	private String applicationPersistenceProfileRef = null;

	@JsonProperty("autoscale_launch_config_ref")
	private String autoscaleLaunchConfigRef = null;

	@JsonProperty("autoscale_networks")
	@Valid
	private List<String> autoscaleNetworks = null;

	@JsonProperty("autoscale_policy_ref")
	private String autoscalePolicyRef = null;

	@JsonProperty("capacity_estimation")
	private Boolean capacityEstimation = null;

	@JsonProperty("capacity_estimation_ttfb_thresh")
	private Integer capacityEstimationTtfbThresh = null;

	@JsonProperty("cloud_config_cksum")
	private String cloudConfigCksum = null;

	@JsonProperty("cloud_ref")
	private String cloudRef = null;

	@JsonProperty("conn_pool_properties")
	private ConnPoolProperties connPoolProperties = null;

	@JsonProperty("connection_ramp_duration")
	private Integer connectionRampDuration = 10;

	@JsonProperty("created_by")
	private String createdBy = null;

	@JsonProperty("default_server_port")
	private Integer defaultServerPort = 80;

	@JsonProperty("delete_server_on_dns_refresh")
	private Boolean deleteServerOnDnsRefresh = true;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("domain_name")
	@Valid
	private List<String> domainName = null;

	@JsonProperty("east_west")
	private Boolean eastWest = null;

	@JsonProperty("enable_http2")
	private Boolean enableHttp2 = null;

	@JsonProperty("enabled")
	private Boolean enabled = true;

	@JsonProperty("external_autoscale_groups")
	@Valid
	private List<String> externalAutoscaleGroups = null;

	@JsonProperty("fail_action")
	private FailAction failAction = null;

	@JsonProperty("fewest_tasks_feedback_delay")
	private Integer fewestTasksFeedbackDelay = 10;

	@JsonProperty("graceful_disable_timeout")
	private Integer gracefulDisableTimeout = 1;

	@JsonProperty("gslb_sp_enabled")
	private Boolean gslbSpEnabled = null;

	@JsonProperty("health_monitor_refs")
	@Valid
	private List<String> healthMonitorRefs = null;

	@JsonProperty("host_check_enabled")
	private Boolean hostCheckEnabled = null;

	@JsonProperty("ignore_server_port")
	private Boolean ignoreServerPort = null;

	@JsonProperty("inline_health_monitor")
	private Boolean inlineHealthMonitor = true;

	@JsonProperty("ipaddrgroup_ref")
	private String ipaddrgroupRef = null;

	@JsonProperty("lb_algorithm")
	private String lbAlgorithm = "LB_ALGORITHM_LEAST_CONNECTIONS";

	@JsonProperty("lb_algorithm_consistent_hash_hdr")
	private String lbAlgorithmConsistentHashHdr = null;

	@JsonProperty("lb_algorithm_core_nonaffinity")
	private Integer lbAlgorithmCoreNonaffinity = 2;

	@JsonProperty("lb_algorithm_hash")
	private String lbAlgorithmHash = "LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS";

	@JsonProperty("lookup_server_by_name")
	private Boolean lookupServerByName = null;

	@JsonProperty("max_concurrent_connections_per_server")
	private Integer maxConcurrentConnectionsPerServer = null;

	@JsonProperty("max_conn_rate_per_server")
	private RateProfile maxConnRatePerServer = null;

	@JsonProperty("min_health_monitors_up")
	private Integer minHealthMonitorsUp = null;

	@JsonProperty("min_servers_up")
	private Integer minServersUp = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("networks")
	@Valid
	private List<NetworkFilter> networks = null;

	@JsonProperty("nsx_securitygroup")
	@Valid
	private List<String> nsxSecuritygroup = null;

	@JsonProperty("pki_profile_ref")
	private String pkiProfileRef = null;

	@JsonProperty("placement_networks")
	@Valid
	private List<PlacementNetwork> placementNetworks = null;

	@JsonProperty("prst_hdr_name")
	private String prstHdrName = null;

	@JsonProperty("request_queue_depth")
	private Integer requestQueueDepth = 128;

	@JsonProperty("request_queue_enabled")
	private Boolean requestQueueEnabled = null;

	@JsonProperty("rewrite_host_header_to_server_name")
	private Boolean rewriteHostHeaderToServerName = null;

	@JsonProperty("rewrite_host_header_to_sni")
	private Boolean rewriteHostHeaderToSni = null;

	@JsonProperty("server_auto_scale")
	private Boolean serverAutoScale = null;

	@JsonProperty("server_count")
	private Integer serverCount = null;

	@JsonProperty("server_name")
	private String serverName = null;

	@JsonProperty("server_reselect")
	private HTTPServerReselect serverReselect = null;

	@JsonProperty("server_timeout")
	private Integer serverTimeout = null;

	@JsonProperty("servers")
	@Valid
	private List<Server> servers = null;

	@JsonProperty("service_metadata")
	private String serviceMetadata = null;

	@JsonProperty("sni_enabled")
	private Boolean sniEnabled = true;

	@JsonProperty("ssl_key_and_certificate_ref")
	private String sslKeyAndCertificateRef = null;

	@JsonProperty("ssl_profile_ref")
	private String sslProfileRef = null;

	@JsonProperty("tenant_ref")
	private String tenantRef = null;

	@JsonProperty("url")
	private String url = null;

	@JsonProperty("use_service_port")
	private Boolean useServicePort = null;

	@JsonProperty("uuid")
	private String uuid = null;

	@JsonProperty("vrf_ref")
	private String vrfRef = null;

	/**
	 * UNIX time since epoch in microseconds. Units(MICROSECONDS).
	 * 
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
	 * Name of container cloud application that constitutes A pool in a A-B pool
	 * configuration, if different from VS app. Field deprecated in 18.1.2.
	 * 
	 * @return aPool
	 **/
	@ApiModelProperty(value = "Name of container cloud application that constitutes A pool in a A-B pool configuration, if different from VS app. Field deprecated in 18.1.2.")

	@VsoMethod
	public String getAPool() {
		return aPool;
	}

	@VsoMethod
	public void setAPool(String aPool) {
		this.aPool = aPool;
	}

	/**
	 * A/B pool configuration. Field deprecated in 18.1.2.
	 * 
	 * @return abPool
	 **/
	@ApiModelProperty(value = "A/B pool configuration. Field deprecated in 18.1.2.")

	@Valid

	@VsoMethod
	public AbPool getAbPool() {
		return abPool;
	}

	@VsoMethod
	public void setAbPool(AbPool abPool) {
		this.abPool = abPool;
	}

	/**
	 * Priority of this pool in a A-B pool pair. Internally used. Field deprecated
	 * in 18.1.2.
	 * 
	 * @return abPriority
	 **/
	@ApiModelProperty(value = "Priority of this pool in a A-B pool pair. Internally used. Field deprecated in 18.1.2.")

	@VsoMethod
	public Integer getAbPriority() {
		return abPriority;
	}

	@VsoMethod
	public void setAbPriority(Integer abPriority) {
		this.abPriority = abPriority;
	}

	/**
	 * Determines analytics settings for the pool. Field introduced in 18.1.5,
	 * 18.2.1.
	 * 
	 * @return analyticsPolicy
	 **/
	@ApiModelProperty(value = "Determines analytics settings for the pool. Field introduced in 18.1.5, 18.2.1.")

	@Valid

	@VsoMethod
	public PoolAnalyticsPolicy getAnalyticsPolicy() {
		return analyticsPolicy;
	}

	@VsoMethod
	public void setAnalyticsPolicy(PoolAnalyticsPolicy analyticsPolicy) {
		this.analyticsPolicy = analyticsPolicy;
	}

	/**
	 * Specifies settings related to analytics. It is a reference to an object of
	 * type AnalyticsProfile. Field introduced in 18.1.4,18.2.1.
	 * 
	 * @return analyticsProfileRef
	 **/
	@ApiModelProperty(value = "Specifies settings related to analytics. It is a reference to an object of type AnalyticsProfile. Field introduced in 18.1.4,18.2.1.")

	@VsoMethod
	public String getAnalyticsProfileRef() {
		return analyticsProfileRef;
	}

	@VsoMethod
	public void setAnalyticsProfileRef(String analyticsProfileRef) {
		this.analyticsProfileRef = analyticsProfileRef;
	}

	/**
	 * Synchronize Cisco APIC EPG members with pool servers.
	 * 
	 * @return apicEpgName
	 **/
	@ApiModelProperty(value = "Synchronize Cisco APIC EPG members with pool servers.")

	@VsoMethod
	public String getApicEpgName() {
		return apicEpgName;
	}

	@VsoMethod
	public void setApicEpgName(String apicEpgName) {
		this.apicEpgName = apicEpgName;
	}

	/**
	 * Persistence will ensure the same user sticks to the same server for a desired
	 * duration of time. It is a reference to an object of type
	 * ApplicationPersistenceProfile.
	 * 
	 * @return applicationPersistenceProfileRef
	 **/
	@ApiModelProperty(value = "Persistence will ensure the same user sticks to the same server for a desired duration of time. It is a reference to an object of type ApplicationPersistenceProfile.")

	@VsoMethod
	public String getApplicationPersistenceProfileRef() {
		return applicationPersistenceProfileRef;
	}

	@VsoMethod
	public void setApplicationPersistenceProfileRef(String applicationPersistenceProfileRef) {
		this.applicationPersistenceProfileRef = applicationPersistenceProfileRef;
	}

	/**
	 * If configured then Avi will trigger orchestration of pool server creation and
	 * deletion. It is only supported for container clouds like Mesos, Opensift,
	 * Kubernates, Docker etc. It is a reference to an object of type
	 * AutoScaleLaunchConfig.
	 * 
	 * @return autoscaleLaunchConfigRef
	 **/
	@ApiModelProperty(value = "If configured then Avi will trigger orchestration of pool server creation and deletion. It is only supported for container clouds like Mesos, Opensift, Kubernates, Docker etc. It is a reference to an object of type AutoScaleLaunchConfig.")

	@VsoMethod
	public String getAutoscaleLaunchConfigRef() {
		return autoscaleLaunchConfigRef;
	}

	@VsoMethod
	public void setAutoscaleLaunchConfigRef(String autoscaleLaunchConfigRef) {
		this.autoscaleLaunchConfigRef = autoscaleLaunchConfigRef;
	}

	public Pool addAutoscaleNetworksItem(String autoscaleNetworksItem) {
		if (this.autoscaleNetworks == null) {
			this.autoscaleNetworks = new ArrayList<String>();
		}
		this.autoscaleNetworks.add(autoscaleNetworksItem);
		return this;
	}

	/**
	 * Network Ids for the launch configuration.
	 * 
	 * @return autoscaleNetworks
	 **/
	@ApiModelProperty(value = "Network Ids for the launch configuration.")

	@VsoMethod
	public List<String> getAutoscaleNetworks() {
		return autoscaleNetworks;
	}

	@VsoMethod
	public void setAutoscaleNetworks(List<String> autoscaleNetworks) {
		this.autoscaleNetworks = autoscaleNetworks;
	}

	/**
	 * Reference to Server Autoscale Policy. It is a reference to an object of type
	 * ServerAutoScalePolicy.
	 * 
	 * @return autoscalePolicyRef
	 **/
	@ApiModelProperty(value = "Reference to Server Autoscale Policy. It is a reference to an object of type ServerAutoScalePolicy.")

	@VsoMethod
	public String getAutoscalePolicyRef() {
		return autoscalePolicyRef;
	}

	@VsoMethod
	public void setAutoscalePolicyRef(String autoscalePolicyRef) {
		this.autoscalePolicyRef = autoscalePolicyRef;
	}

	/**
	 * Inline estimation of capacity of servers.
	 * 
	 * @return capacityEstimation
	 **/
	@ApiModelProperty(value = "Inline estimation of capacity of servers.")

	@VsoMethod
	public Boolean isCapacityEstimation() {
		return capacityEstimation;
	}

	@VsoMethod
	public void setCapacityEstimation(Boolean capacityEstimation) {
		this.capacityEstimation = capacityEstimation;
	}

	/**
	 * The maximum time-to-first-byte of a server. Allowed values are 1-5000.
	 * Special values are 0 - 'Automatic'.
	 * 
	 * @return capacityEstimationTtfbThresh
	 **/
	@ApiModelProperty(value = "The maximum time-to-first-byte of a server. Allowed values are 1-5000. Special values are 0 - 'Automatic'.")

	@VsoMethod
	public Integer getCapacityEstimationTtfbThresh() {
		return capacityEstimationTtfbThresh;
	}

	@VsoMethod
	public void setCapacityEstimationTtfbThresh(Integer capacityEstimationTtfbThresh) {
		this.capacityEstimationTtfbThresh = capacityEstimationTtfbThresh;
	}

	/**
	 * Checksum of cloud configuration for Pool. Internally set by cloud connector.
	 * 
	 * @return cloudConfigCksum
	 **/
	@ApiModelProperty(value = "Checksum of cloud configuration for Pool. Internally set by cloud connector.")

	@VsoMethod
	public String getCloudConfigCksum() {
		return cloudConfigCksum;
	}

	@VsoMethod
	public void setCloudConfigCksum(String cloudConfigCksum) {
		this.cloudConfigCksum = cloudConfigCksum;
	}

	/**
	 * It is a reference to an object of type Cloud.
	 * 
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
	 * Connnection pool properties. Field introduced in 18.2.1.
	 * 
	 * @return connPoolProperties
	 **/
	@ApiModelProperty(value = "Connnection pool properties. Field introduced in 18.2.1.")

	@Valid

	@VsoMethod
	public ConnPoolProperties getConnPoolProperties() {
		return connPoolProperties;
	}

	@VsoMethod
	public void setConnPoolProperties(ConnPoolProperties connPoolProperties) {
		this.connPoolProperties = connPoolProperties;
	}

	/**
	 * Duration for which new connections will be gradually ramped up to a server
	 * recently brought online. Useful for LB algorithms that are least connection
	 * based. Allowed values are 1-300. Special values are 0 - 'Immediate'.
	 * 
	 * @return connectionRampDuration
	 **/
	@ApiModelProperty(value = "Duration for which new connections will be gradually ramped up to a server recently brought online.  Useful for LB algorithms that are least connection based. Allowed values are 1-300. Special values are 0 - 'Immediate'.")

	@VsoMethod
	public Integer getConnectionRampDuration() {
		return connectionRampDuration;
	}

	@VsoMethod
	public void setConnectionRampDuration(Integer connectionRampDuration) {
		this.connectionRampDuration = connectionRampDuration;
	}

	/**
	 * Creator name.
	 * 
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
	 * Traffic sent to servers will use this destination server port unless
	 * overridden by the server's specific port attribute. The SSL checkbox enables
	 * Avi to server encryption. Allowed values are 1-65535.
	 * 
	 * @return defaultServerPort
	 **/
	@ApiModelProperty(value = "Traffic sent to servers will use this destination server port unless overridden by the server's specific port attribute. The SSL checkbox enables Avi to server encryption. Allowed values are 1-65535.")

	@VsoMethod
	public Integer getDefaultServerPort() {
		return defaultServerPort;
	}

	@VsoMethod
	public void setDefaultServerPort(Integer defaultServerPort) {
		this.defaultServerPort = defaultServerPort;
	}

	/**
	 * Indicates whether existing IPs are disabled(false) or deleted(true) on dns
	 * hostname refreshDetail -- On a dns refresh, some IPs set on pool may no
	 * longer be returned by the resolver. These IPs are deleted from the pool when
	 * this knob is set to true. They are disabled, if the knob is set to false.
	 * Field introduced in 18.2.3.
	 * 
	 * @return deleteServerOnDnsRefresh
	 **/
	@ApiModelProperty(value = "Indicates whether existing IPs are disabled(false) or deleted(true) on dns hostname refreshDetail -- On a dns refresh, some IPs set on pool may no longer be returned by the resolver. These IPs are deleted from the pool when this knob is set to true. They are disabled, if the knob is set to false. Field introduced in 18.2.3.")

	@VsoMethod
	public Boolean isDeleteServerOnDnsRefresh() {
		return deleteServerOnDnsRefresh;
	}

	@VsoMethod
	public void setDeleteServerOnDnsRefresh(Boolean deleteServerOnDnsRefresh) {
		this.deleteServerOnDnsRefresh = deleteServerOnDnsRefresh;
	}

	/**
	 * A description of the pool.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "A description of the pool.")

	@VsoMethod
	public String getDescription() {
		return description;
	}

	@VsoMethod
	public void setDescription(String description) {
		this.description = description;
	}

	public Pool addDomainNameItem(String domainNameItem) {
		if (this.domainName == null) {
			this.domainName = new ArrayList<String>();
		}
		this.domainName.add(domainNameItem);
		return this;
	}

	/**
	 * Comma separated list of domain names which will be used to verify the common
	 * names or subject alternative names presented by server certificates. It is
	 * performed only when common name check host_check_enabled is enabled.
	 * 
	 * @return domainName
	 **/
	@ApiModelProperty(value = "Comma separated list of domain names which will be used to verify the common names or subject alternative names presented by server certificates. It is performed only when common name check host_check_enabled is enabled.")

	@VsoMethod
	public List<String> getDomainName() {
		return domainName;
	}

	@VsoMethod
	public void setDomainName(List<String> domainName) {
		this.domainName = domainName;
	}

	/**
	 * Inherited config from VirtualService.
	 * 
	 * @return eastWest
	 **/
	@ApiModelProperty(value = "Inherited config from VirtualService.")

	@VsoMethod
	public Boolean isEastWest() {
		return eastWest;
	}

	@VsoMethod
	public void setEastWest(Boolean eastWest) {
		this.eastWest = eastWest;
	}

	/**
	 * Enable HTTP/2 for traffic from VirtualService to all backend servers in this
	 * pool. Field introduced in 20.1.1.
	 * 
	 * @return enableHttp2
	 **/
	@ApiModelProperty(value = "Enable HTTP/2 for traffic from VirtualService to all backend servers in this pool. Field introduced in 20.1.1.")

	@VsoMethod
	public Boolean isEnableHttp2() {
		return enableHttp2;
	}

	@VsoMethod
	public void setEnableHttp2(Boolean enableHttp2) {
		this.enableHttp2 = enableHttp2;
	}

	/**
	 * Enable or disable the pool. Disabling will terminate all open connections and
	 * pause health monitors.
	 * 
	 * @return enabled
	 **/
	@ApiModelProperty(value = "Enable or disable the pool.  Disabling will terminate all open connections and pause health monitors.")

	@VsoMethod
	public Boolean isEnabled() {
		return enabled;
	}

	@VsoMethod
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Pool addExternalAutoscaleGroupsItem(String externalAutoscaleGroupsItem) {
		if (this.externalAutoscaleGroups == null) {
			this.externalAutoscaleGroups = new ArrayList<String>();
		}
		this.externalAutoscaleGroups.add(externalAutoscaleGroupsItem);
		return this;
	}

	/**
	 * Names of external auto-scale groups for pool servers. Currently available
	 * only for AWS and Azure. Field introduced in 17.1.2.
	 * 
	 * @return externalAutoscaleGroups
	 **/
	@ApiModelProperty(value = "Names of external auto-scale groups for pool servers. Currently available only for AWS and Azure. Field introduced in 17.1.2.")

	@VsoMethod
	public List<String> getExternalAutoscaleGroups() {
		return externalAutoscaleGroups;
	}

	@VsoMethod
	public void setExternalAutoscaleGroups(List<String> externalAutoscaleGroups) {
		this.externalAutoscaleGroups = externalAutoscaleGroups;
	}

	/**
	 * Enable an action - Close Connection, HTTP Redirect or Local HTTP Response -
	 * when a pool failure happens. By default, a connection will be closed, in case
	 * the pool experiences a failure.
	 * 
	 * @return failAction
	 **/
	@ApiModelProperty(value = "Enable an action - Close Connection, HTTP Redirect or Local HTTP Response - when a pool failure happens. By default, a connection will be closed, in case the pool experiences a failure.")

	@Valid

	@VsoMethod
	public FailAction getFailAction() {
		return failAction;
	}

	@VsoMethod
	public void setFailAction(FailAction failAction) {
		this.failAction = failAction;
	}

	/**
	 * Periodicity of feedback for fewest tasks server selection algorithm. Allowed
	 * values are 1-300.
	 * 
	 * @return fewestTasksFeedbackDelay
	 **/
	@ApiModelProperty(value = "Periodicity of feedback for fewest tasks server selection algorithm. Allowed values are 1-300.")

	@VsoMethod
	public Integer getFewestTasksFeedbackDelay() {
		return fewestTasksFeedbackDelay;
	}

	@VsoMethod
	public void setFewestTasksFeedbackDelay(Integer fewestTasksFeedbackDelay) {
		this.fewestTasksFeedbackDelay = fewestTasksFeedbackDelay;
	}

	/**
	 * Used to gracefully disable a server. Virtual service waits for the specified
	 * time before terminating the existing connections to the servers that are
	 * disabled. Allowed values are 1-7200. Special values are 0 - 'Immediate', -1 -
	 * 'Infinite'.
	 * 
	 * @return gracefulDisableTimeout
	 **/
	@ApiModelProperty(value = "Used to gracefully disable a server. Virtual service waits for the specified time before terminating the existing connections  to the servers that are disabled. Allowed values are 1-7200. Special values are 0 - 'Immediate', -1 - 'Infinite'.")

	@VsoMethod
	public Integer getGracefulDisableTimeout() {
		return gracefulDisableTimeout;
	}

	@VsoMethod
	public void setGracefulDisableTimeout(Integer gracefulDisableTimeout) {
		this.gracefulDisableTimeout = gracefulDisableTimeout;
	}

	/**
	 * Indicates if the pool is a site-persistence pool. . Field introduced in
	 * 17.2.1.
	 * 
	 * @return gslbSpEnabled
	 **/
	@ApiModelProperty(readOnly = true, value = "Indicates if the pool is a site-persistence pool. . Field introduced in 17.2.1.")

	@VsoMethod
	public Boolean isGslbSpEnabled() {
		return gslbSpEnabled;
	}

	@VsoMethod
	public void setGslbSpEnabled(Boolean gslbSpEnabled) {
		this.gslbSpEnabled = gslbSpEnabled;
	}

	public Pool addHealthMonitorRefsItem(String healthMonitorRefsItem) {
		if (this.healthMonitorRefs == null) {
			this.healthMonitorRefs = new ArrayList<String>();
		}
		this.healthMonitorRefs.add(healthMonitorRefsItem);
		return this;
	}

	/**
	 * Verify server health by applying one or more health monitors. Active monitors
	 * generate synthetic traffic from each Service Engine and mark a server up or
	 * down based on the response. The Passive monitor listens only to client to
	 * server communication. It raises or lowers the ratio of traffic destined to a
	 * server based on successful responses. It is a reference to an object of type
	 * HealthMonitor.
	 * 
	 * @return healthMonitorRefs
	 **/
	@ApiModelProperty(value = "Verify server health by applying one or more health monitors.  Active monitors generate synthetic traffic from each Service Engine and mark a server up or down based on the response. The Passive monitor listens only to client to server communication. It raises or lowers the ratio of traffic destined to a server based on successful responses. It is a reference to an object of type HealthMonitor.")

	@VsoMethod
	public List<String> getHealthMonitorRefs() {
		return healthMonitorRefs;
	}

	@VsoMethod
	public void setHealthMonitorRefs(List<String> healthMonitorRefs) {
		this.healthMonitorRefs = healthMonitorRefs;
	}

	/**
	 * Enable common name check for server certificate. If enabled and no explicit
	 * domain name is specified, Avi will use the incoming host header to do the
	 * match.
	 * 
	 * @return hostCheckEnabled
	 **/
	@ApiModelProperty(value = "Enable common name check for server certificate. If enabled and no explicit domain name is specified, Avi will use the incoming host header to do the match.")

	@VsoMethod
	public Boolean isHostCheckEnabled() {
		return hostCheckEnabled;
	}

	@VsoMethod
	public void setHostCheckEnabled(Boolean hostCheckEnabled) {
		this.hostCheckEnabled = hostCheckEnabled;
	}

	/**
	 * Ignore the server port in building the load balancing state.Applicable only
	 * for consistent hash load balancing algorithm or Disable Port translation
	 * (use_service_port) use cases. Field introduced in 20.1.1.
	 * 
	 * @return ignoreServerPort
	 **/
	@ApiModelProperty(value = "Ignore the server port in building the load balancing state.Applicable only for consistent hash load balancing algorithm or Disable Port translation (use_service_port) use cases. Field introduced in 20.1.1.")

	@VsoMethod
	public Boolean isIgnoreServerPort() {
		return ignoreServerPort;
	}

	@VsoMethod
	public void setIgnoreServerPort(Boolean ignoreServerPort) {
		this.ignoreServerPort = ignoreServerPort;
	}

	/**
	 * The Passive monitor will monitor client to server connections and requests
	 * and adjust traffic load to servers based on successful responses. This may
	 * alter the expected behavior of the LB method, such as Round Robin.
	 * 
	 * @return inlineHealthMonitor
	 **/
	@ApiModelProperty(value = "The Passive monitor will monitor client to server connections and requests and adjust traffic load to servers based on successful responses.  This may alter the expected behavior of the LB method, such as Round Robin.")

	@VsoMethod
	public Boolean isInlineHealthMonitor() {
		return inlineHealthMonitor;
	}

	@VsoMethod
	public void setInlineHealthMonitor(Boolean inlineHealthMonitor) {
		this.inlineHealthMonitor = inlineHealthMonitor;
	}

	/**
	 * Use list of servers from Ip Address Group. It is a reference to an object of
	 * type IpAddrGroup.
	 * 
	 * @return ipaddrgroupRef
	 **/
	@ApiModelProperty(value = "Use list of servers from Ip Address Group. It is a reference to an object of type IpAddrGroup.")

	@VsoMethod
	public String getIpaddrgroupRef() {
		return ipaddrgroupRef;
	}

	@VsoMethod
	public void setIpaddrgroupRef(String ipaddrgroupRef) {
		this.ipaddrgroupRef = ipaddrgroupRef;
	}

	/**
	 * The load balancing algorithm will pick a server within the pool's list of
	 * available servers. Enum options - LB_ALGORITHM_LEAST_CONNECTIONS,
	 * LB_ALGORITHM_ROUND_ROBIN, LB_ALGORITHM_FASTEST_RESPONSE,
	 * LB_ALGORITHM_CONSISTENT_HASH, LB_ALGORITHM_LEAST_LOAD,
	 * LB_ALGORITHM_FEWEST_SERVERS, LB_ALGORITHM_RANDOM, LB_ALGORITHM_FEWEST_TASKS,
	 * LB_ALGORITHM_NEAREST_SERVER, LB_ALGORITHM_CORE_AFFINITY,
	 * LB_ALGORITHM_TOPOLOGY.
	 * 
	 * @return lbAlgorithm
	 **/
	@ApiModelProperty(value = "The load balancing algorithm will pick a server within the pool's list of available servers. Enum options - LB_ALGORITHM_LEAST_CONNECTIONS, LB_ALGORITHM_ROUND_ROBIN, LB_ALGORITHM_FASTEST_RESPONSE, LB_ALGORITHM_CONSISTENT_HASH, LB_ALGORITHM_LEAST_LOAD, LB_ALGORITHM_FEWEST_SERVERS, LB_ALGORITHM_RANDOM, LB_ALGORITHM_FEWEST_TASKS, LB_ALGORITHM_NEAREST_SERVER, LB_ALGORITHM_CORE_AFFINITY, LB_ALGORITHM_TOPOLOGY.")

	@VsoMethod
	public String getLbAlgorithm() {
		return lbAlgorithm;
	}

	@VsoMethod
	public void setLbAlgorithm(String lbAlgorithm) {
		this.lbAlgorithm = lbAlgorithm;
	}

	/**
	 * HTTP header name to be used for the hash key.
	 * 
	 * @return lbAlgorithmConsistentHashHdr
	 **/
	@ApiModelProperty(value = "HTTP header name to be used for the hash key.")

	@VsoMethod
	public String getLbAlgorithmConsistentHashHdr() {
		return lbAlgorithmConsistentHashHdr;
	}

	@VsoMethod
	public void setLbAlgorithmConsistentHashHdr(String lbAlgorithmConsistentHashHdr) {
		this.lbAlgorithmConsistentHashHdr = lbAlgorithmConsistentHashHdr;
	}

	/**
	 * Degree of non-affinity for core afffinity based server selection. Allowed
	 * values are 1-65535. Field introduced in 17.1.3.
	 * 
	 * @return lbAlgorithmCoreNonaffinity
	 **/
	@ApiModelProperty(value = "Degree of non-affinity for core afffinity based server selection. Allowed values are 1-65535. Field introduced in 17.1.3.")

	@VsoMethod
	public Integer getLbAlgorithmCoreNonaffinity() {
		return lbAlgorithmCoreNonaffinity;
	}

	@VsoMethod
	public void setLbAlgorithmCoreNonaffinity(Integer lbAlgorithmCoreNonaffinity) {
		this.lbAlgorithmCoreNonaffinity = lbAlgorithmCoreNonaffinity;
	}

	/**
	 * Criteria used as a key for determining the hash between the client and
	 * server. Enum options - LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS,
	 * LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS_AND_PORT,
	 * LB_ALGORITHM_CONSISTENT_HASH_URI, LB_ALGORITHM_CONSISTENT_HASH_CUSTOM_HEADER,
	 * LB_ALGORITHM_CONSISTENT_HASH_CUSTOM_STRING,
	 * LB_ALGORITHM_CONSISTENT_HASH_CALLID.
	 * 
	 * @return lbAlgorithmHash
	 **/
	@ApiModelProperty(value = "Criteria used as a key for determining the hash between the client and  server. Enum options - LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS, LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS_AND_PORT, LB_ALGORITHM_CONSISTENT_HASH_URI, LB_ALGORITHM_CONSISTENT_HASH_CUSTOM_HEADER, LB_ALGORITHM_CONSISTENT_HASH_CUSTOM_STRING, LB_ALGORITHM_CONSISTENT_HASH_CALLID.")

	@VsoMethod
	public String getLbAlgorithmHash() {
		return lbAlgorithmHash;
	}

	@VsoMethod
	public void setLbAlgorithmHash(String lbAlgorithmHash) {
		this.lbAlgorithmHash = lbAlgorithmHash;
	}

	/**
	 * Allow server lookup by name. Field introduced in 17.1.11,17.2.4.
	 * 
	 * @return lookupServerByName
	 **/
	@ApiModelProperty(value = "Allow server lookup by name. Field introduced in 17.1.11,17.2.4.")

	@VsoMethod
	public Boolean isLookupServerByName() {
		return lookupServerByName;
	}

	@VsoMethod
	public void setLookupServerByName(Boolean lookupServerByName) {
		this.lookupServerByName = lookupServerByName;
	}

	/**
	 * The maximum number of concurrent connections allowed to each server within
	 * the pool. NOTE applied value will be no less than the number of service
	 * engines that the pool is placed on. If set to 0, no limit is applied.
	 * 
	 * @return maxConcurrentConnectionsPerServer
	 **/
	@ApiModelProperty(value = "The maximum number of concurrent connections allowed to each server within the pool. NOTE  applied value will be no less than the number of service engines that the pool is placed on. If set to 0, no limit is applied.")

	@VsoMethod
	public Integer getMaxConcurrentConnectionsPerServer() {
		return maxConcurrentConnectionsPerServer;
	}

	@VsoMethod
	public void setMaxConcurrentConnectionsPerServer(Integer maxConcurrentConnectionsPerServer) {
		this.maxConcurrentConnectionsPerServer = maxConcurrentConnectionsPerServer;
	}

	/**
	 * Rate Limit connections to each server.
	 * 
	 * @return maxConnRatePerServer
	 **/
	@ApiModelProperty(value = "Rate Limit connections to each server.")

	@Valid

	@VsoMethod
	public RateProfile getMaxConnRatePerServer() {
		return maxConnRatePerServer;
	}

	@VsoMethod
	public void setMaxConnRatePerServer(RateProfile maxConnRatePerServer) {
		this.maxConnRatePerServer = maxConnRatePerServer;
	}

	/**
	 * Minimum number of health monitors in UP state to mark server UP. Field
	 * introduced in 18.2.1, 17.2.12.
	 * 
	 * @return minHealthMonitorsUp
	 **/
	@ApiModelProperty(value = "Minimum number of health monitors in UP state to mark server UP. Field introduced in 18.2.1, 17.2.12.")

	@VsoMethod
	public Integer getMinHealthMonitorsUp() {
		return minHealthMonitorsUp;
	}

	@VsoMethod
	public void setMinHealthMonitorsUp(Integer minHealthMonitorsUp) {
		this.minHealthMonitorsUp = minHealthMonitorsUp;
	}

	/**
	 * Minimum number of servers in UP state for marking the pool UP. Field
	 * introduced in 18.2.1, 17.2.12.
	 * 
	 * @return minServersUp
	 **/
	@ApiModelProperty(value = "Minimum number of servers in UP state for marking the pool UP. Field introduced in 18.2.1, 17.2.12.")

	@VsoMethod
	public Integer getMinServersUp() {
		return minServersUp;
	}

	@VsoMethod
	public void setMinServersUp(Integer minServersUp) {
		this.minServersUp = minServersUp;
	}

	/**
	 * The name of the pool.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(required = true, value = "The name of the pool.")
	@NotNull

	@VsoMethod
	public String getName() {
		return name;
	}

	@VsoMethod
	public void setName(String name) {
		this.name = name;
	}

	public Pool addNetworksItem(NetworkFilter networksItem) {
		if (this.networks == null) {
			this.networks = new ArrayList<NetworkFilter>();
		}
		this.networks.add(networksItem);
		return this;
	}

	/**
	 * (internal-use) Networks designated as containing servers for this pool. The
	 * servers may be further narrowed down by a filter. This field is used
	 * internally by Avi, not editable by the user.
	 * 
	 * @return networks
	 **/
	@ApiModelProperty(value = "(internal-use) Networks designated as containing servers for this pool.  The servers may be further narrowed down by a filter. This field is used internally by Avi, not editable by the user.")

	@Valid

	@VsoMethod
	public List<NetworkFilter> getNetworks() {
		return networks;
	}

	@VsoMethod
	public void setNetworks(List<NetworkFilter> networks) {
		this.networks = networks;
	}

	public Pool addNsxSecuritygroupItem(String nsxSecuritygroupItem) {
		if (this.nsxSecuritygroup == null) {
			this.nsxSecuritygroup = new ArrayList<String>();
		}
		this.nsxSecuritygroup.add(nsxSecuritygroupItem);
		return this;
	}

	/**
	 * A list of NSX Service Groups where the Servers for the Pool are created .
	 * Field introduced in 17.1.1.
	 * 
	 * @return nsxSecuritygroup
	 **/
	@ApiModelProperty(value = "A list of NSX Service Groups where the Servers for the Pool are created . Field introduced in 17.1.1.")

	@VsoMethod
	public List<String> getNsxSecuritygroup() {
		return nsxSecuritygroup;
	}

	@VsoMethod
	public void setNsxSecuritygroup(List<String> nsxSecuritygroup) {
		this.nsxSecuritygroup = nsxSecuritygroup;
	}

	/**
	 * Avi will validate the SSL certificate present by a server against the
	 * selected PKI Profile. It is a reference to an object of type PKIProfile.
	 * 
	 * @return pkiProfileRef
	 **/
	@ApiModelProperty(value = "Avi will validate the SSL certificate present by a server against the selected PKI Profile. It is a reference to an object of type PKIProfile.")

	@VsoMethod
	public String getPkiProfileRef() {
		return pkiProfileRef;
	}

	@VsoMethod
	public void setPkiProfileRef(String pkiProfileRef) {
		this.pkiProfileRef = pkiProfileRef;
	}

	public Pool addPlacementNetworksItem(PlacementNetwork placementNetworksItem) {
		if (this.placementNetworks == null) {
			this.placementNetworks = new ArrayList<PlacementNetwork>();
		}
		this.placementNetworks.add(placementNetworksItem);
		return this;
	}

	/**
	 * Manually select the networks and subnets used to provide reachability to the
	 * pool's servers. Specify the Subnet using the following syntax 10-1-1-0/24.
	 * Use static routes in VRF configuration when pool servers are not directly
	 * connected butroutable from the service engine.
	 * 
	 * @return placementNetworks
	 **/
	@ApiModelProperty(value = "Manually select the networks and subnets used to provide reachability to the pool's servers.  Specify the Subnet using the following syntax  10-1-1-0/24. Use static routes in VRF configuration when pool servers are not directly connected butroutable from the service engine.")

	@Valid

	@VsoMethod
	public List<PlacementNetwork> getPlacementNetworks() {
		return placementNetworks;
	}

	@VsoMethod
	public void setPlacementNetworks(List<PlacementNetwork> placementNetworks) {
		this.placementNetworks = placementNetworks;
	}

	/**
	 * Header name for custom header persistence. Field deprecated in 18.1.2.
	 * 
	 * @return prstHdrName
	 **/
	@ApiModelProperty(value = "Header name for custom header persistence. Field deprecated in 18.1.2.")

	@VsoMethod
	public String getPrstHdrName() {
		return prstHdrName;
	}

	@VsoMethod
	public void setPrstHdrName(String prstHdrName) {
		this.prstHdrName = prstHdrName;
	}

	/**
	 * Minimum number of requests to be queued when pool is full.
	 * 
	 * @return requestQueueDepth
	 **/
	@ApiModelProperty(value = "Minimum number of requests to be queued when pool is full.")

	@VsoMethod
	public Integer getRequestQueueDepth() {
		return requestQueueDepth;
	}

	@VsoMethod
	public void setRequestQueueDepth(Integer requestQueueDepth) {
		this.requestQueueDepth = requestQueueDepth;
	}

	/**
	 * Enable request queue when pool is full.
	 * 
	 * @return requestQueueEnabled
	 **/
	@ApiModelProperty(value = "Enable request queue when pool is full.")

	@VsoMethod
	public Boolean isRequestQueueEnabled() {
		return requestQueueEnabled;
	}

	@VsoMethod
	public void setRequestQueueEnabled(Boolean requestQueueEnabled) {
		this.requestQueueEnabled = requestQueueEnabled;
	}

	/**
	 * Rewrite incoming Host Header to server name of the server to which the
	 * request is proxied. Enabling this feature rewrites Host Header for requests
	 * to all servers in the pool.
	 * 
	 * @return rewriteHostHeaderToServerName
	 **/
	@ApiModelProperty(value = "Rewrite incoming Host Header to server name of the server to which the request is proxied.  Enabling this feature rewrites Host Header for requests to all servers in the pool.")

	@VsoMethod
	public Boolean isRewriteHostHeaderToServerName() {
		return rewriteHostHeaderToServerName;
	}

	@VsoMethod
	public void setRewriteHostHeaderToServerName(Boolean rewriteHostHeaderToServerName) {
		this.rewriteHostHeaderToServerName = rewriteHostHeaderToServerName;
	}

	/**
	 * If SNI server name is specified, rewrite incoming host header to the SNI
	 * server name.
	 * 
	 * @return rewriteHostHeaderToSni
	 **/
	@ApiModelProperty(value = "If SNI server name is specified, rewrite incoming host header to the SNI server name.")

	@VsoMethod
	public Boolean isRewriteHostHeaderToSni() {
		return rewriteHostHeaderToSni;
	}

	@VsoMethod
	public void setRewriteHostHeaderToSni(Boolean rewriteHostHeaderToSni) {
		this.rewriteHostHeaderToSni = rewriteHostHeaderToSni;
	}

	/**
	 * Server AutoScale. Not used anymore. Field deprecated in 18.1.2.
	 * 
	 * @return serverAutoScale
	 **/
	@ApiModelProperty(value = "Server AutoScale. Not used anymore. Field deprecated in 18.1.2.")

	@VsoMethod
	public Boolean isServerAutoScale() {
		return serverAutoScale;
	}

	@VsoMethod
	public void setServerAutoScale(Boolean serverAutoScale) {
		this.serverAutoScale = serverAutoScale;
	}

	/**
	 * Field deprecated in 18.2.1.
	 * 
	 * @return serverCount
	 **/
	@ApiModelProperty(value = " Field deprecated in 18.2.1.")

	@VsoMethod
	public Integer getServerCount() {
		return serverCount;
	}

	@VsoMethod
	public void setServerCount(Integer serverCount) {
		this.serverCount = serverCount;
	}

	/**
	 * Fully qualified DNS hostname which will be used in the TLS SNI extension in
	 * server connections if SNI is enabled. If no value is specified, Avi will use
	 * the incoming host header instead.
	 * 
	 * @return serverName
	 **/
	@ApiModelProperty(value = "Fully qualified DNS hostname which will be used in the TLS SNI extension in server connections if SNI is enabled. If no value is specified, Avi will use the incoming host header instead.")

	@VsoMethod
	public String getServerName() {
		return serverName;
	}

	@VsoMethod
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	/**
	 * Server reselect configuration for HTTP requests.
	 * 
	 * @return serverReselect
	 **/
	@ApiModelProperty(value = "Server reselect configuration for HTTP requests.")

	@Valid

	@VsoMethod
	public HTTPServerReselect getServerReselect() {
		return serverReselect;
	}

	@VsoMethod
	public void setServerReselect(HTTPServerReselect serverReselect) {
		this.serverReselect = serverReselect;
	}

	/**
	 * Server timeout value specifies the time within which a server connection
	 * needs to be established and a request-response exchange completes between AVI
	 * and the server. Value of 0 results in using default timeout of 60 minutes.
	 * Allowed values are 0-3600000. Field introduced in 18.1.5,18.2.1.
	 * 
	 * @return serverTimeout
	 **/
	@ApiModelProperty(value = "Server timeout value specifies the time within which a server connection needs to be established and a request-response exchange completes between AVI and the server. Value of 0 results in using default timeout of 60 minutes. Allowed values are 0-3600000. Field introduced in 18.1.5,18.2.1.")

	@VsoMethod
	public Integer getServerTimeout() {
		return serverTimeout;
	}

	@VsoMethod
	public void setServerTimeout(Integer serverTimeout) {
		this.serverTimeout = serverTimeout;
	}

	public Pool addServersItem(Server serversItem) {
		if (this.servers == null) {
			this.servers = new ArrayList<Server>();
		}
		this.servers.add(serversItem);
		return this;
	}

	/**
	 * The pool directs load balanced traffic to this list of destination servers.
	 * The servers can be configured by IP address, name, network or via IP Address
	 * Group.
	 * 
	 * @return servers
	 **/
	@ApiModelProperty(value = "The pool directs load balanced traffic to this list of destination servers. The servers can be configured by IP address, name, network or via IP Address Group.")

	@Valid

	@VsoMethod
	public List<Server> getServers() {
		return servers;
	}

	@VsoMethod
	public void setServers(List<Server> servers) {
		this.servers = servers;
	}

	/**
	 * Metadata pertaining to the service provided by this Pool. In
	 * Openshift/Kubernetes environments, app metadata info is stored. Any user
	 * input to this field will be overwritten by Avi Vantage. Field introduced in
	 * 17.2.14,18.1.5,18.2.1.
	 * 
	 * @return serviceMetadata
	 **/
	@ApiModelProperty(value = "Metadata pertaining to the service provided by this Pool. In Openshift/Kubernetes environments, app metadata info is stored. Any user input to this field will be overwritten by Avi Vantage. Field introduced in 17.2.14,18.1.5,18.2.1.")

	@VsoMethod
	public String getServiceMetadata() {
		return serviceMetadata;
	}

	@VsoMethod
	public void setServiceMetadata(String serviceMetadata) {
		this.serviceMetadata = serviceMetadata;
	}

	/**
	 * Enable TLS SNI for server connections. If disabled, Avi will not send the SNI
	 * extension as part of the handshake.
	 * 
	 * @return sniEnabled
	 **/
	@ApiModelProperty(value = "Enable TLS SNI for server connections. If disabled, Avi will not send the SNI extension as part of the handshake.")

	@VsoMethod
	public Boolean isSniEnabled() {
		return sniEnabled;
	}

	@VsoMethod
	public void setSniEnabled(Boolean sniEnabled) {
		this.sniEnabled = sniEnabled;
	}

	/**
	 * Service Engines will present a client SSL certificate to the server. It is a
	 * reference to an object of type SSLKeyAndCertificate.
	 * 
	 * @return sslKeyAndCertificateRef
	 **/
	@ApiModelProperty(value = "Service Engines will present a client SSL certificate to the server. It is a reference to an object of type SSLKeyAndCertificate.")

	@VsoMethod
	public String getSslKeyAndCertificateRef() {
		return sslKeyAndCertificateRef;
	}

	@VsoMethod
	public void setSslKeyAndCertificateRef(String sslKeyAndCertificateRef) {
		this.sslKeyAndCertificateRef = sslKeyAndCertificateRef;
	}

	/**
	 * When enabled, Avi re-encrypts traffic to the backend servers. The specific
	 * SSL profile defines which ciphers and SSL versions will be supported. It is a
	 * reference to an object of type SSLProfile.
	 * 
	 * @return sslProfileRef
	 **/
	@ApiModelProperty(value = "When enabled, Avi re-encrypts traffic to the backend servers. The specific SSL profile defines which ciphers and SSL versions will be supported. It is a reference to an object of type SSLProfile.")

	@VsoMethod
	public String getSslProfileRef() {
		return sslProfileRef;
	}

	@VsoMethod
	public void setSslProfileRef(String sslProfileRef) {
		this.sslProfileRef = sslProfileRef;
	}

	/**
	 * It is a reference to an object of type Tenant.
	 * 
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
	 * 
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
	 * Do not translate the client's destination port when sending the connection to
	 * the server. The pool or servers specified service port will still be used for
	 * health monitoring.
	 * 
	 * @return useServicePort
	 **/
	@ApiModelProperty(value = "Do not translate the client's destination port when sending the connection to the server.  The pool or servers specified service port will still be used for health monitoring.")

	@VsoMethod
	public Boolean isUseServicePort() {
		return useServicePort;
	}

	@VsoMethod
	public void setUseServicePort(Boolean useServicePort) {
		this.useServicePort = useServicePort;
	}

	/**
	 * UUID of the pool.
	 * 
	 * @return uuid
	 **/
	@ApiModelProperty(value = "UUID of the pool.")

	@VsoMethod
	public String getUuid() {
		return uuid;
	}

	@VsoMethod
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * Virtual Routing Context that the pool is bound to. This is used to provide
	 * the isolation of the set of networks the pool is attached to. The pool
	 * inherits the Virtual Routing Conext of the Virtual Service, and this field is
	 * used only internally, and is set by pb-transform. It is a reference to an
	 * object of type VrfContext.
	 * 
	 * @return vrfRef
	 **/
	@ApiModelProperty(value = "Virtual Routing Context that the pool is bound to. This is used to provide the isolation of the set of networks the pool is attached to. The pool inherits the Virtual Routing Conext of the Virtual Service, and this field is used only internally, and is set by pb-transform. It is a reference to an object of type VrfContext.")

	@VsoMethod
	public String getVrfRef() {
		return vrfRef;
	}

	@VsoMethod
	public void setVrfRef(String vrfRef) {
		this.vrfRef = vrfRef;
	}

	public String getObjectID() {
	//	return name;
		//String uuid = url.substring(url.lastIndexOf("/") + 1);
		//String controller = url.substring(url.indexOf("//") + 2, url.indexOf("/api"));
		return name + "(" + uuid + ")";
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Pool pool = (Pool) o;
		return Objects.equals(this.lastModified, pool.lastModified) && Objects.equals(this.aPool, pool.aPool)
				&& Objects.equals(this.abPool, pool.abPool) && Objects.equals(this.abPriority, pool.abPriority)
				&& Objects.equals(this.analyticsPolicy, pool.analyticsPolicy)
				&& Objects.equals(this.analyticsProfileRef, pool.analyticsProfileRef)
				&& Objects.equals(this.apicEpgName, pool.apicEpgName)
				&& Objects.equals(this.applicationPersistenceProfileRef, pool.applicationPersistenceProfileRef)
				&& Objects.equals(this.autoscaleLaunchConfigRef, pool.autoscaleLaunchConfigRef)
				&& Objects.equals(this.autoscaleNetworks, pool.autoscaleNetworks)
				&& Objects.equals(this.autoscalePolicyRef, pool.autoscalePolicyRef)
				&& Objects.equals(this.capacityEstimation, pool.capacityEstimation)
				&& Objects.equals(this.capacityEstimationTtfbThresh, pool.capacityEstimationTtfbThresh)
				&& Objects.equals(this.cloudConfigCksum, pool.cloudConfigCksum)
				&& Objects.equals(this.cloudRef, pool.cloudRef)
				&& Objects.equals(this.connPoolProperties, pool.connPoolProperties)
				&& Objects.equals(this.connectionRampDuration, pool.connectionRampDuration)
				&& Objects.equals(this.createdBy, pool.createdBy)
				&& Objects.equals(this.defaultServerPort, pool.defaultServerPort)
				&& Objects.equals(this.deleteServerOnDnsRefresh, pool.deleteServerOnDnsRefresh)
				&& Objects.equals(this.description, pool.description)
				&& Objects.equals(this.domainName, pool.domainName) && Objects.equals(this.eastWest, pool.eastWest)
				&& Objects.equals(this.enableHttp2, pool.enableHttp2) && Objects.equals(this.enabled, pool.enabled)
				&& Objects.equals(this.externalAutoscaleGroups, pool.externalAutoscaleGroups)
				&& Objects.equals(this.failAction, pool.failAction)
				&& Objects.equals(this.fewestTasksFeedbackDelay, pool.fewestTasksFeedbackDelay)
				&& Objects.equals(this.gracefulDisableTimeout, pool.gracefulDisableTimeout)
				&& Objects.equals(this.gslbSpEnabled, pool.gslbSpEnabled)
				&& Objects.equals(this.healthMonitorRefs, pool.healthMonitorRefs)
				&& Objects.equals(this.hostCheckEnabled, pool.hostCheckEnabled)
				&& Objects.equals(this.ignoreServerPort, pool.ignoreServerPort)
				&& Objects.equals(this.inlineHealthMonitor, pool.inlineHealthMonitor)
				&& Objects.equals(this.ipaddrgroupRef, pool.ipaddrgroupRef)
				&& Objects.equals(this.lbAlgorithm, pool.lbAlgorithm)
				&& Objects.equals(this.lbAlgorithmConsistentHashHdr, pool.lbAlgorithmConsistentHashHdr)
				&& Objects.equals(this.lbAlgorithmCoreNonaffinity, pool.lbAlgorithmCoreNonaffinity)
				&& Objects.equals(this.lbAlgorithmHash, pool.lbAlgorithmHash)
				&& Objects.equals(this.lookupServerByName, pool.lookupServerByName)
				&& Objects.equals(this.maxConcurrentConnectionsPerServer, pool.maxConcurrentConnectionsPerServer)
				&& Objects.equals(this.maxConnRatePerServer, pool.maxConnRatePerServer)
				&& Objects.equals(this.minHealthMonitorsUp, pool.minHealthMonitorsUp)
				&& Objects.equals(this.minServersUp, pool.minServersUp) && Objects.equals(this.name, pool.name)
				&& Objects.equals(this.networks, pool.networks)
				&& Objects.equals(this.nsxSecuritygroup, pool.nsxSecuritygroup)
				&& Objects.equals(this.pkiProfileRef, pool.pkiProfileRef)
				&& Objects.equals(this.placementNetworks, pool.placementNetworks)
				&& Objects.equals(this.prstHdrName, pool.prstHdrName)
				&& Objects.equals(this.requestQueueDepth, pool.requestQueueDepth)
				&& Objects.equals(this.requestQueueEnabled, pool.requestQueueEnabled)
				&& Objects.equals(this.rewriteHostHeaderToServerName, pool.rewriteHostHeaderToServerName)
				&& Objects.equals(this.rewriteHostHeaderToSni, pool.rewriteHostHeaderToSni)
				&& Objects.equals(this.serverAutoScale, pool.serverAutoScale)
				&& Objects.equals(this.serverCount, pool.serverCount)
				&& Objects.equals(this.serverName, pool.serverName)
				&& Objects.equals(this.serverReselect, pool.serverReselect)
				&& Objects.equals(this.serverTimeout, pool.serverTimeout) && Objects.equals(this.servers, pool.servers)
				&& Objects.equals(this.serviceMetadata, pool.serviceMetadata)
				&& Objects.equals(this.sniEnabled, pool.sniEnabled)
				&& Objects.equals(this.sslKeyAndCertificateRef, pool.sslKeyAndCertificateRef)
				&& Objects.equals(this.sslProfileRef, pool.sslProfileRef)
				&& Objects.equals(this.tenantRef, pool.tenantRef) && Objects.equals(this.url, pool.url)
				&& Objects.equals(this.useServicePort, pool.useServicePort) && Objects.equals(this.uuid, pool.uuid)
				&& Objects.equals(this.vrfRef, pool.vrfRef);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lastModified, aPool, abPool, abPriority, analyticsPolicy, analyticsProfileRef, apicEpgName,
				applicationPersistenceProfileRef, autoscaleLaunchConfigRef, autoscaleNetworks, autoscalePolicyRef,
				capacityEstimation, capacityEstimationTtfbThresh, cloudConfigCksum, cloudRef, connPoolProperties,
				connectionRampDuration, createdBy, defaultServerPort, deleteServerOnDnsRefresh, description, domainName,
				eastWest, enableHttp2, enabled, externalAutoscaleGroups, failAction, fewestTasksFeedbackDelay,
				gracefulDisableTimeout, gslbSpEnabled, healthMonitorRefs, hostCheckEnabled, ignoreServerPort,
				inlineHealthMonitor, ipaddrgroupRef, lbAlgorithm, lbAlgorithmConsistentHashHdr,
				lbAlgorithmCoreNonaffinity, lbAlgorithmHash, lookupServerByName, maxConcurrentConnectionsPerServer,
				maxConnRatePerServer, minHealthMonitorsUp, minServersUp, name, networks, nsxSecuritygroup,
				pkiProfileRef, placementNetworks, prstHdrName, requestQueueDepth, requestQueueEnabled,
				rewriteHostHeaderToServerName, rewriteHostHeaderToSni, serverAutoScale, serverCount, serverName,
				serverReselect, serverTimeout, servers, serviceMetadata, sniEnabled, sslKeyAndCertificateRef,
				sslProfileRef, tenantRef, url, useServicePort, uuid, vrfRef);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Pool {\n");

		sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
		sb.append("    aPool: ").append(toIndentedString(aPool)).append("\n");
		sb.append("    abPool: ").append(toIndentedString(abPool)).append("\n");
		sb.append("    abPriority: ").append(toIndentedString(abPriority)).append("\n");
		sb.append("    analyticsPolicy: ").append(toIndentedString(analyticsPolicy)).append("\n");
		sb.append("    analyticsProfileRef: ").append(toIndentedString(analyticsProfileRef)).append("\n");
		sb.append("    apicEpgName: ").append(toIndentedString(apicEpgName)).append("\n");
		sb.append("    applicationPersistenceProfileRef: ").append(toIndentedString(applicationPersistenceProfileRef))
				.append("\n");
		sb.append("    autoscaleLaunchConfigRef: ").append(toIndentedString(autoscaleLaunchConfigRef)).append("\n");
		sb.append("    autoscaleNetworks: ").append(toIndentedString(autoscaleNetworks)).append("\n");
		sb.append("    autoscalePolicyRef: ").append(toIndentedString(autoscalePolicyRef)).append("\n");
		sb.append("    capacityEstimation: ").append(toIndentedString(capacityEstimation)).append("\n");
		sb.append("    capacityEstimationTtfbThresh: ").append(toIndentedString(capacityEstimationTtfbThresh))
				.append("\n");
		sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
		sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
		sb.append("    connPoolProperties: ").append(toIndentedString(connPoolProperties)).append("\n");
		sb.append("    connectionRampDuration: ").append(toIndentedString(connectionRampDuration)).append("\n");
		sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
		sb.append("    defaultServerPort: ").append(toIndentedString(defaultServerPort)).append("\n");
		sb.append("    deleteServerOnDnsRefresh: ").append(toIndentedString(deleteServerOnDnsRefresh)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
		sb.append("    eastWest: ").append(toIndentedString(eastWest)).append("\n");
		sb.append("    enableHttp2: ").append(toIndentedString(enableHttp2)).append("\n");
		sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
		sb.append("    externalAutoscaleGroups: ").append(toIndentedString(externalAutoscaleGroups)).append("\n");
		sb.append("    failAction: ").append(toIndentedString(failAction)).append("\n");
		sb.append("    fewestTasksFeedbackDelay: ").append(toIndentedString(fewestTasksFeedbackDelay)).append("\n");
		sb.append("    gracefulDisableTimeout: ").append(toIndentedString(gracefulDisableTimeout)).append("\n");
		sb.append("    gslbSpEnabled: ").append(toIndentedString(gslbSpEnabled)).append("\n");
		sb.append("    healthMonitorRefs: ").append(toIndentedString(healthMonitorRefs)).append("\n");
		sb.append("    hostCheckEnabled: ").append(toIndentedString(hostCheckEnabled)).append("\n");
		sb.append("    ignoreServerPort: ").append(toIndentedString(ignoreServerPort)).append("\n");
		sb.append("    inlineHealthMonitor: ").append(toIndentedString(inlineHealthMonitor)).append("\n");
		sb.append("    ipaddrgroupRef: ").append(toIndentedString(ipaddrgroupRef)).append("\n");
		sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
		sb.append("    lbAlgorithmConsistentHashHdr: ").append(toIndentedString(lbAlgorithmConsistentHashHdr))
				.append("\n");
		sb.append("    lbAlgorithmCoreNonaffinity: ").append(toIndentedString(lbAlgorithmCoreNonaffinity)).append("\n");
		sb.append("    lbAlgorithmHash: ").append(toIndentedString(lbAlgorithmHash)).append("\n");
		sb.append("    lookupServerByName: ").append(toIndentedString(lookupServerByName)).append("\n");
		sb.append("    maxConcurrentConnectionsPerServer: ").append(toIndentedString(maxConcurrentConnectionsPerServer))
				.append("\n");
		sb.append("    maxConnRatePerServer: ").append(toIndentedString(maxConnRatePerServer)).append("\n");
		sb.append("    minHealthMonitorsUp: ").append(toIndentedString(minHealthMonitorsUp)).append("\n");
		sb.append("    minServersUp: ").append(toIndentedString(minServersUp)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
		sb.append("    nsxSecuritygroup: ").append(toIndentedString(nsxSecuritygroup)).append("\n");
		sb.append("    pkiProfileRef: ").append(toIndentedString(pkiProfileRef)).append("\n");
		sb.append("    placementNetworks: ").append(toIndentedString(placementNetworks)).append("\n");
		sb.append("    prstHdrName: ").append(toIndentedString(prstHdrName)).append("\n");
		sb.append("    requestQueueDepth: ").append(toIndentedString(requestQueueDepth)).append("\n");
		sb.append("    requestQueueEnabled: ").append(toIndentedString(requestQueueEnabled)).append("\n");
		sb.append("    rewriteHostHeaderToServerName: ").append(toIndentedString(rewriteHostHeaderToServerName))
				.append("\n");
		sb.append("    rewriteHostHeaderToSni: ").append(toIndentedString(rewriteHostHeaderToSni)).append("\n");
		sb.append("    serverAutoScale: ").append(toIndentedString(serverAutoScale)).append("\n");
		sb.append("    serverCount: ").append(toIndentedString(serverCount)).append("\n");
		sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
		sb.append("    serverReselect: ").append(toIndentedString(serverReselect)).append("\n");
		sb.append("    serverTimeout: ").append(toIndentedString(serverTimeout)).append("\n");
		sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
		sb.append("    serviceMetadata: ").append(toIndentedString(serviceMetadata)).append("\n");
		sb.append("    sniEnabled: ").append(toIndentedString(sniEnabled)).append("\n");
		sb.append("    sslKeyAndCertificateRef: ").append(toIndentedString(sslKeyAndCertificateRef)).append("\n");
		sb.append("    sslProfileRef: ").append(toIndentedString(sslProfileRef)).append("\n");
		sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    useServicePort: ").append(toIndentedString(useServicePort)).append("\n");
		sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
		sb.append("    vrfRef: ").append(toIndentedString(vrfRef)).append("\n");
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
