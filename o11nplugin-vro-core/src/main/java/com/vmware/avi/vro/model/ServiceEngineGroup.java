package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CustomTag;
import com.vmware.avi.vro.model.DosThresholdProfile;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.IptableRuleSet;
import com.vmware.avi.vro.model.MetricsRealTimeUpdate;
import com.vmware.avi.vro.model.PortRange;
import com.vmware.avi.vro.model.RateLimiterProperties;
import com.vmware.avi.vro.model.VcenterClusters;
import com.vmware.avi.vro.model.VcenterDatastore;
import com.vmware.avi.vro.model.VcenterHosts;
import com.vmware.avi.vro.model.VipAutoscaleGroup;
import com.vmware.avi.vro.model.VssPlacement;
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
 * ServiceEngineGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ServiceEngineGroup")
@VsoFinder(name = Constants.FINDER_VRO_SERVICEENGINEGROUP, idAccessor = "getObjectID()")
@Service
public class ServiceEngineGroup extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("accelerated_networking")
  private Boolean acceleratedNetworking = null;

  @JsonProperty("active_standby")
  private Boolean activeStandby = null;

  @JsonProperty("additional_config_memory")
  private Integer additionalConfigMemory = null;

  @JsonProperty("advertise_backend_networks")
  private Boolean advertiseBackendNetworks = null;

  @JsonProperty("aggressive_failure_detection")
  private Boolean aggressiveFailureDetection = null;

  @JsonProperty("algo")
  private String algo = "PLACEMENT_ALGO_PACKED";

  @JsonProperty("allow_burst")
  private Boolean allowBurst = null;

  @JsonProperty("app_cache_percent")
  private Integer appCachePercent = 10;

  @JsonProperty("app_cache_threshold")
  private Integer appCacheThreshold = 5;

  @JsonProperty("app_learning_memory_percent")
  private Integer appLearningMemoryPercent = null;

  @JsonProperty("archive_shm_limit")
  private Integer archiveShmLimit = 8;

  @JsonProperty("async_ssl")
  private Boolean asyncSsl = null;

  @JsonProperty("async_ssl_threads")
  private Integer asyncSslThreads = 1;

  @JsonProperty("auto_rebalance")
  private Boolean autoRebalance = null;

  @JsonProperty("auto_rebalance_capacity_per_se")
  @Valid
  private List<Integer> autoRebalanceCapacityPerSe = null;

  @JsonProperty("auto_rebalance_criteria")
  @Valid
  private List<String> autoRebalanceCriteria = null;

  @JsonProperty("auto_rebalance_interval")
  private Integer autoRebalanceInterval = 300;

  @JsonProperty("auto_redistribute_active_standby_load")
  private Boolean autoRedistributeActiveStandbyLoad = null;

  @JsonProperty("bgp_state_update_interval")
  private Integer bgpStateUpdateInterval = 60;

  @JsonProperty("buffer_se")
  private Integer bufferSe = 1;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("config_debugs_on_all_cores")
  private Boolean configDebugsOnAllCores = null;

  @JsonProperty("connection_memory_percentage")
  private Integer connectionMemoryPercentage = 50;

  @JsonProperty("core_shm_app_cache")
  private Boolean coreShmAppCache = null;

  @JsonProperty("core_shm_app_learning")
  private Boolean coreShmAppLearning = null;

  @JsonProperty("cpu_reserve")
  private Boolean cpuReserve = null;

  @JsonProperty("cpu_socket_affinity")
  private Boolean cpuSocketAffinity = null;

  @JsonProperty("custom_securitygroups_data")
  @Valid
  private List<String> customSecuritygroupsData = null;

  @JsonProperty("custom_securitygroups_mgmt")
  @Valid
  private List<String> customSecuritygroupsMgmt = null;

  @JsonProperty("custom_tag")
  @Valid
  private List<CustomTag> customTag = null;

  @JsonProperty("data_network_id")
  private String dataNetworkId = null;

  @JsonProperty("datascript_timeout")
  private Long datascriptTimeout = 1000000l;

  @JsonProperty("dedicated_dispatcher_core")
  private Boolean dedicatedDispatcherCore = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("disable_avi_securitygroups")
  private Boolean disableAviSecuritygroups = null;

  @JsonProperty("disable_csum_offloads")
  private Boolean disableCsumOffloads = null;

  @JsonProperty("disable_gro")
  private Boolean disableGro = true;

  @JsonProperty("disable_se_memory_check")
  private Boolean disableSeMemoryCheck = null;

  @JsonProperty("disable_tso")
  private Boolean disableTso = null;

  @JsonProperty("disk_per_se")
  private Integer diskPerSe = 10;

  @JsonProperty("distribute_load_active_standby")
  private Boolean distributeLoadActiveStandby = null;

  @JsonProperty("distribute_queues")
  private Boolean distributeQueues = null;

  @JsonProperty("distribute_vnics")
  private Boolean distributeVnics = null;

  @JsonProperty("enable_gratarp_permanent")
  private Boolean enableGratarpPermanent = null;

  @JsonProperty("enable_hsm_priming")
  private Boolean enableHsmPriming = null;

  @JsonProperty("enable_multi_lb")
  private Boolean enableMultiLb = null;

  @JsonProperty("enable_pcap_tx_ring")
  private Boolean enablePcapTxRing = null;

  @JsonProperty("enable_routing")
  private Boolean enableRouting = null;

  @JsonProperty("enable_vip_on_all_interfaces")
  private Boolean enableVipOnAllInterfaces = null;

  @JsonProperty("enable_vmac")
  private Boolean enableVmac = null;

  @JsonProperty("ephemeral_portrange_end")
  private Integer ephemeralPortrangeEnd = null;

  @JsonProperty("ephemeral_portrange_start")
  private Integer ephemeralPortrangeStart = null;

  @JsonProperty("extra_config_multiplier")
  private Double extraConfigMultiplier = null;

  @JsonProperty("extra_shared_config_memory")
  private Integer extraSharedConfigMemory = null;

  @JsonProperty("floating_intf_ip")
  @Valid
  private List<IpAddr> floatingIntfIp = null;

  @JsonProperty("floating_intf_ip_se_2")
  @Valid
  private List<IpAddr> floatingIntfIpSe2 = null;

  @JsonProperty("flow_table_new_syn_max_entries")
  private Integer flowTableNewSynMaxEntries = null;

  @JsonProperty("free_list_size")
  private Integer freeListSize = 1024;

  @JsonProperty("gratarp_permanent_periodicity")
  private Integer gratarpPermanentPeriodicity = 10;

  @JsonProperty("ha_mode")
  private String haMode = "HA_MODE_SHARED";

  @JsonProperty("hardwaresecuritymodulegroup_ref")
  private String hardwaresecuritymodulegroupRef = null;

  @JsonProperty("heap_minimum_config_memory")
  private Integer heapMinimumConfigMemory = 8;

  @JsonProperty("hm_on_standby")
  private Boolean hmOnStandby = true;

  @JsonProperty("host_attribute_key")
  private String hostAttributeKey = null;

  @JsonProperty("host_attribute_value")
  private String hostAttributeValue = null;

  @JsonProperty("host_gateway_monitor")
  private Boolean hostGatewayMonitor = null;

  @JsonProperty("hypervisor")
  private String hypervisor = null;

  @JsonProperty("ignore_rtt_threshold")
  private Integer ignoreRttThreshold = 5000;

  @JsonProperty("ingress_access_data")
  private String ingressAccessData = "SG_INGRESS_ACCESS_ALL";

  @JsonProperty("ingress_access_mgmt")
  private String ingressAccessMgmt = "SG_INGRESS_ACCESS_ALL";

  @JsonProperty("instance_flavor")
  private String instanceFlavor = null;

  @JsonProperty("iptables")
  @Valid
  private List<IptableRuleSet> iptables = null;

  @JsonProperty("least_load_core_selection")
  private Boolean leastLoadCoreSelection = true;

  @JsonProperty("license_tier")
  private String licenseTier = null;

  @JsonProperty("license_type")
  private String licenseType = null;

  @JsonProperty("log_disksz")
  private Integer logDisksz = 10000;

  @JsonProperty("max_concurrent_external_hm")
  private Integer maxConcurrentExternalHm = null;

  @JsonProperty("max_cpu_usage")
  private Integer maxCpuUsage = 80;

  @JsonProperty("max_memory_per_mempool")
  private Integer maxMemoryPerMempool = 64;

  @JsonProperty("max_num_se_dps")
  private Integer maxNumSeDps = null;

  @JsonProperty("max_public_ips_per_lb")
  private Integer maxPublicIpsPerLb = 30;

  @JsonProperty("max_queues_per_vnic")
  private Integer maxQueuesPerVnic = 1;

  @JsonProperty("max_rules_per_lb")
  private Integer maxRulesPerLb = 150;

  @JsonProperty("max_scaleout_per_vs")
  private Integer maxScaleoutPerVs = 4;

  @JsonProperty("max_se")
  private Integer maxSe = 10;

  @JsonProperty("max_vs_per_se")
  private Integer maxVsPerSe = 10;

  @JsonProperty("mem_reserve")
  private Boolean memReserve = true;

  @JsonProperty("memory_for_config_update")
  private Integer memoryForConfigUpdate = 15;

  @JsonProperty("memory_per_se")
  private Integer memoryPerSe = 2048;

  @JsonProperty("mgmt_network_ref")
  private String mgmtNetworkRef = null;

  @JsonProperty("mgmt_subnet")
  private IpAddrPrefix mgmtSubnet = null;

  @JsonProperty("min_cpu_usage")
  private Integer minCpuUsage = 30;

  @JsonProperty("min_scaleout_per_vs")
  private Integer minScaleoutPerVs = 1;

  @JsonProperty("min_se")
  private Integer minSe = 1;

  @JsonProperty("minimum_connection_memory")
  private Integer minimumConnectionMemory = 20;

  @JsonProperty("minimum_required_config_memory")
  private Integer minimumRequiredConfigMemory = null;

  @JsonProperty("n_log_streaming_threads")
  private Integer nLogStreamingThreads = 1;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nat_flow_tcp_closed_timeout")
  private Integer natFlowTcpClosedTimeout = null;

  @JsonProperty("nat_flow_tcp_established_timeout")
  private Integer natFlowTcpEstablishedTimeout = null;

  @JsonProperty("nat_flow_tcp_half_closed_timeout")
  private Integer natFlowTcpHalfClosedTimeout = null;

  @JsonProperty("nat_flow_tcp_handshake_timeout")
  private Integer natFlowTcpHandshakeTimeout = null;

  @JsonProperty("nat_flow_udp_noresponse_timeout")
  private Integer natFlowUdpNoresponseTimeout = null;

  @JsonProperty("nat_flow_udp_response_timeout")
  private Integer natFlowUdpResponseTimeout = null;

  @JsonProperty("non_significant_log_throttle")
  private Integer nonSignificantLogThrottle = 100;

  @JsonProperty("num_dispatcher_cores")
  private Integer numDispatcherCores = null;

  @JsonProperty("num_flow_cores_sum_changes_to_ignore")
  private Integer numFlowCoresSumChangesToIgnore = 8;

  @JsonProperty("openstack_availability_zone")
  private String openstackAvailabilityZone = null;

  @JsonProperty("openstack_availability_zones")
  @Valid
  private List<String> openstackAvailabilityZones = null;

  @JsonProperty("openstack_mgmt_network_name")
  private String openstackMgmtNetworkName = null;

  @JsonProperty("openstack_mgmt_network_uuid")
  private String openstackMgmtNetworkUuid = null;

  @JsonProperty("os_reserved_memory")
  private Integer osReservedMemory = null;

  @JsonProperty("pcap_tx_mode")
  private String pcapTxMode = "PCAP_TX_AUTO";

  @JsonProperty("per_app")
  private Boolean perApp = null;

  @JsonProperty("placement_mode")
  private String placementMode = "PLACEMENT_MODE_AUTO";

  @JsonProperty("realtime_se_metrics")
  private MetricsRealTimeUpdate realtimeSeMetrics = null;

  @JsonProperty("reboot_on_panic")
  private Boolean rebootOnPanic = true;

  @JsonProperty("reboot_on_stop")
  private Boolean rebootOnStop = null;

  @JsonProperty("se_bandwidth_type")
  private String seBandwidthType = null;

  @JsonProperty("se_deprovision_delay")
  private Integer seDeprovisionDelay = 120;

  @JsonProperty("se_dos_profile")
  private DosThresholdProfile seDosProfile = null;

  @JsonProperty("se_dp_max_hb_version")
  private Integer seDpMaxHbVersion = 2;

  @JsonProperty("se_dp_vnic_queue_stall_event_sleep")
  private Integer seDpVnicQueueStallEventSleep = null;

  @JsonProperty("se_dp_vnic_queue_stall_threshold")
  private Integer seDpVnicQueueStallThreshold = 2000;

  @JsonProperty("se_dp_vnic_queue_stall_timeout")
  private Integer seDpVnicQueueStallTimeout = 10000;

  @JsonProperty("se_dp_vnic_restart_on_queue_stall_count")
  private Integer seDpVnicRestartOnQueueStallCount = 3;

  @JsonProperty("se_dp_vnic_stall_se_restart_window")
  private Integer seDpVnicStallSeRestartWindow = 3600;

  @JsonProperty("se_dpdk_pmd")
  private Integer seDpdkPmd = null;

  @JsonProperty("se_flow_probe_retries")
  private Integer seFlowProbeRetries = 2;

  @JsonProperty("se_flow_probe_retry_timer")
  private Integer seFlowProbeRetryTimer = 40;

  @JsonProperty("se_flow_probe_timer")
  private Integer seFlowProbeTimer = null;

  @JsonProperty("se_ipc_udp_port")
  private Integer seIpcUdpPort = null;

  @JsonProperty("se_kni_burst_factor")
  private Integer seKniBurstFactor = null;

  @JsonProperty("se_lro")
  private Boolean seLro = true;

  @JsonProperty("se_mtu")
  private Integer seMtu = null;

  @JsonProperty("se_name_prefix")
  private String seNamePrefix = "Avi";

  @JsonProperty("se_pcap_lookahead")
  private Boolean sePcapLookahead = null;

  @JsonProperty("se_pcap_pkt_count")
  private Integer sePcapPktCount = null;

  @JsonProperty("se_pcap_pkt_sz")
  private Integer sePcapPktSz = 69632;

  @JsonProperty("se_pcap_qdisc_bypass")
  private Boolean sePcapQdiscBypass = true;

  @JsonProperty("se_pcap_reinit_frequency")
  private Integer sePcapReinitFrequency = null;

  @JsonProperty("se_pcap_reinit_threshold")
  private Integer sePcapReinitThreshold = null;

  @JsonProperty("se_probe_port")
  private Integer seProbePort = 7;

  @JsonProperty("se_remote_punt_udp_port")
  private Integer seRemotePuntUdpPort = null;

  @JsonProperty("se_rl_prop")
  private RateLimiterProperties seRlProp = null;

  @JsonProperty("se_routing")
  private Boolean seRouting = null;

  @JsonProperty("se_rum_sampling_nav_interval")
  private Integer seRumSamplingNavInterval = 1;

  @JsonProperty("se_rum_sampling_nav_percent")
  private Integer seRumSamplingNavPercent = 1;

  @JsonProperty("se_rum_sampling_res_interval")
  private Integer seRumSamplingResInterval = 2;

  @JsonProperty("se_rum_sampling_res_percent")
  private Integer seRumSamplingResPercent = 100;

  @JsonProperty("se_sb_dedicated_core")
  private Boolean seSbDedicatedCore = null;

  @JsonProperty("se_sb_threads")
  private Integer seSbThreads = 1;

  @JsonProperty("se_thread_multiplier")
  private Integer seThreadMultiplier = 1;

  @JsonProperty("se_tracert_port_range")
  private PortRange seTracertPortRange = null;

  @JsonProperty("se_tunnel_mode")
  private Integer seTunnelMode = null;

  @JsonProperty("se_tunnel_udp_port")
  private Integer seTunnelUdpPort = 1550;

  @JsonProperty("se_tx_batch_size")
  private Integer seTxBatchSize = 64;

  @JsonProperty("se_udp_encap_ipc")
  private Integer seUdpEncapIpc = null;

  @JsonProperty("se_use_dpdk")
  private Integer seUseDpdk = null;

  @JsonProperty("se_vs_hb_max_pkts_in_batch")
  private Integer seVsHbMaxPktsInBatch = 64;

  @JsonProperty("se_vs_hb_max_vs_in_pkt")
  private Integer seVsHbMaxVsInPkt = 256;

  @JsonProperty("self_se_election")
  private Boolean selfSeElection = null;

  @JsonProperty("service_ip6_subnets")
  @Valid
  private List<IpAddrPrefix> serviceIp6Subnets = null;

  @JsonProperty("service_ip_subnets")
  @Valid
  private List<IpAddrPrefix> serviceIpSubnets = null;

  @JsonProperty("shm_minimum_config_memory")
  private Integer shmMinimumConfigMemory = 4;

  @JsonProperty("significant_log_throttle")
  private Integer significantLogThrottle = 100;

  @JsonProperty("ssl_preprocess_sni_hostname")
  private Boolean sslPreprocessSniHostname = true;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("udf_log_throttle")
  private Integer udfLogThrottle = 100;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("use_standard_alb")
  private Boolean useStandardAlb = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vcenter_clusters")
  private VcenterClusters vcenterClusters = null;

  @JsonProperty("vcenter_datastore_mode")
  private String vcenterDatastoreMode = "VCENTER_DATASTORE_ANY";

  @JsonProperty("vcenter_datastores")
  @Valid
  private List<VcenterDatastore> vcenterDatastores = null;

  @JsonProperty("vcenter_datastores_include")
  private Boolean vcenterDatastoresInclude = null;

  @JsonProperty("vcenter_folder")
  private String vcenterFolder = "AviSeFolder";

  @JsonProperty("vcenter_hosts")
  private VcenterHosts vcenterHosts = null;

  @JsonProperty("vcpus_per_se")
  private Integer vcpusPerSe = 1;

  @JsonProperty("vip_asg")
  private VipAutoscaleGroup vipAsg = null;

  @JsonProperty("vs_host_redundancy")
  private Boolean vsHostRedundancy = true;

  @JsonProperty("vs_scalein_timeout")
  private Integer vsScaleinTimeout = 30;

  @JsonProperty("vs_scalein_timeout_for_upgrade")
  private Integer vsScaleinTimeoutForUpgrade = 30;

  @JsonProperty("vs_scaleout_timeout")
  private Integer vsScaleoutTimeout = 600;

  @JsonProperty("vs_se_scaleout_additional_wait_time")
  private Integer vsSeScaleoutAdditionalWaitTime = null;

  @JsonProperty("vs_se_scaleout_ready_timeout")
  private Integer vsSeScaleoutReadyTimeout = 60;

  @JsonProperty("vs_switchover_timeout")
  private Integer vsSwitchoverTimeout = 300;

  @JsonProperty("vss_placement")
  private VssPlacement vssPlacement = null;

  @JsonProperty("vss_placement_enabled")
  private Boolean vssPlacementEnabled = null;

  @JsonProperty("waf_learning_interval")
  private Integer wafLearningInterval = null;

  @JsonProperty("waf_learning_memory")
  private Integer wafLearningMemory = null;

  @JsonProperty("waf_mempool")
  private Boolean wafMempool = true;

  @JsonProperty("waf_mempool_size")
  private Integer wafMempoolSize = 64;

  
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
   * Enable accelerated networking option for Azure SE. Accelerated networking enables single root I/O virtualization (SR-IOV) to a SE VM. This improves networking performance. Field introduced in 17.2.14,18.1.5,18.2.1.
   * @return acceleratedNetworking
  **/
  @ApiModelProperty(value = "Enable accelerated networking option for Azure SE. Accelerated networking enables single root I/O virtualization (SR-IOV) to a SE VM. This improves networking performance. Field introduced in 17.2.14,18.1.5,18.2.1.")


 
  @VsoMethod  
  public Boolean isAcceleratedNetworking() {
    return acceleratedNetworking;
  }
    
  @VsoMethod
  public void setAcceleratedNetworking(Boolean acceleratedNetworking) {
    this.acceleratedNetworking = acceleratedNetworking;
  }

  
  /**
   * Service Engines in active/standby mode for HA failover.
   * @return activeStandby
  **/
  @ApiModelProperty(value = "Service Engines in active/standby mode for HA failover.")


 
  @VsoMethod  
  public Boolean isActiveStandby() {
    return activeStandby;
  }
    
  @VsoMethod
  public void setActiveStandby(Boolean activeStandby) {
    this.activeStandby = activeStandby;
  }

  
  /**
   * Indicates the percent of config memory used for config updates. Allowed values are 0-90. Field deprecated in 18.1.2. Field introduced in 18.1.1.
   * @return additionalConfigMemory
  **/
  @ApiModelProperty(value = "Indicates the percent of config memory used for config updates. Allowed values are 0-90. Field deprecated in 18.1.2. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Integer getAdditionalConfigMemory() {
    return additionalConfigMemory;
  }
    
  @VsoMethod
  public void setAdditionalConfigMemory(Integer additionalConfigMemory) {
    this.additionalConfigMemory = additionalConfigMemory;
  }

  
  /**
   * Advertise reach-ability of backend server networks via ADC through BGP for default gateway feature. Field deprecated in 18.2.5.
   * @return advertiseBackendNetworks
  **/
  @ApiModelProperty(value = "Advertise reach-ability of backend server networks via ADC through BGP for default gateway feature. Field deprecated in 18.2.5.")


 
  @VsoMethod  
  public Boolean isAdvertiseBackendNetworks() {
    return advertiseBackendNetworks;
  }
    
  @VsoMethod
  public void setAdvertiseBackendNetworks(Boolean advertiseBackendNetworks) {
    this.advertiseBackendNetworks = advertiseBackendNetworks;
  }

  
  /**
   * Enable aggressive failover configuration for ha.
   * @return aggressiveFailureDetection
  **/
  @ApiModelProperty(value = "Enable aggressive failover configuration for ha.")


 
  @VsoMethod  
  public Boolean isAggressiveFailureDetection() {
    return aggressiveFailureDetection;
  }
    
  @VsoMethod
  public void setAggressiveFailureDetection(Boolean aggressiveFailureDetection) {
    this.aggressiveFailureDetection = aggressiveFailureDetection;
  }

  
  /**
   * In compact placement, Virtual Services are placed on existing SEs until max_vs_per_se limit is reached. Enum options - PLACEMENT_ALGO_PACKED, PLACEMENT_ALGO_DISTRIBUTED.
   * @return algo
  **/
  @ApiModelProperty(value = "In compact placement, Virtual Services are placed on existing SEs until max_vs_per_se limit is reached. Enum options - PLACEMENT_ALGO_PACKED, PLACEMENT_ALGO_DISTRIBUTED.")


 
  @VsoMethod  
  public String getAlgo() {
    return algo;
  }
    
  @VsoMethod
  public void setAlgo(String algo) {
    this.algo = algo;
  }

  
  /**
   * Allow SEs to be created using burst license. Field introduced in 17.2.5.
   * @return allowBurst
  **/
  @ApiModelProperty(value = "Allow SEs to be created using burst license. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public Boolean isAllowBurst() {
    return allowBurst;
  }
    
  @VsoMethod
  public void setAllowBurst(Boolean allowBurst) {
    this.allowBurst = allowBurst;
  }

  
  /**
   * A percent value of total SE memory reserved for applicationcaching. This is an SE bootup property and requires SE restart.Requires SE Reboot. Allowed values are 0 - 100. Special values are 0- 'disable'. Field introduced in 18.2.3.
   * @return appCachePercent
  **/
  @ApiModelProperty(value = "A percent value of total SE memory reserved for applicationcaching. This is an SE bootup property and requires SE restart.Requires SE Reboot. Allowed values are 0 - 100. Special values are 0- 'disable'. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getAppCachePercent() {
    return appCachePercent;
  }
    
  @VsoMethod
  public void setAppCachePercent(Integer appCachePercent) {
    this.appCachePercent = appCachePercent;
  }

  
  /**
   * The max memory that can be allocated for the app cache. This value will act as an upper bound on the cache size specified in app_cache_percent. Special values are 0- 'disable'. Field introduced in 20.1.1.
   * @return appCacheThreshold
  **/
  @ApiModelProperty(value = "The max memory that can be allocated for the app cache. This value will act as an upper bound on the cache size specified in app_cache_percent. Special values are 0- 'disable'. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getAppCacheThreshold() {
    return appCacheThreshold;
  }
    
  @VsoMethod
  public void setAppCacheThreshold(Integer appCacheThreshold) {
    this.appCacheThreshold = appCacheThreshold;
  }

  
  /**
   * A percent value of total SE memory reserved for Application learning. This is an SE bootup property and requires SE restart. Allowed values are 0 - 10. Field introduced in 18.2.3.
   * @return appLearningMemoryPercent
  **/
  @ApiModelProperty(value = "A percent value of total SE memory reserved for Application learning. This is an SE bootup property and requires SE restart. Allowed values are 0 - 10. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getAppLearningMemoryPercent() {
    return appLearningMemoryPercent;
  }
    
  @VsoMethod
  public void setAppLearningMemoryPercent(Integer appLearningMemoryPercent) {
    this.appLearningMemoryPercent = appLearningMemoryPercent;
  }

  
  /**
   * Amount of SE memory in GB until which shared memory is collected in core archive. Field introduced in 17.1.3.
   * @return archiveShmLimit
  **/
  @ApiModelProperty(value = "Amount of SE memory in GB until which shared memory is collected in core archive. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Integer getArchiveShmLimit() {
    return archiveShmLimit;
  }
    
  @VsoMethod
  public void setArchiveShmLimit(Integer archiveShmLimit) {
    this.archiveShmLimit = archiveShmLimit;
  }

  
  /**
   * SSL handshakes will be handled by dedicated SSL Threads.Requires SE Reboot.
   * @return asyncSsl
  **/
  @ApiModelProperty(value = "SSL handshakes will be handled by dedicated SSL Threads.Requires SE Reboot.")


 
  @VsoMethod  
  public Boolean isAsyncSsl() {
    return asyncSsl;
  }
    
  @VsoMethod
  public void setAsyncSsl(Boolean asyncSsl) {
    this.asyncSsl = asyncSsl;
  }

  
  /**
   * Number of Async SSL threads per se_dp.Requires SE Reboot. Allowed values are 1-16.
   * @return asyncSslThreads
  **/
  @ApiModelProperty(value = "Number of Async SSL threads per se_dp.Requires SE Reboot. Allowed values are 1-16.")


 
  @VsoMethod  
  public Integer getAsyncSslThreads() {
    return asyncSslThreads;
  }
    
  @VsoMethod
  public void setAsyncSslThreads(Integer asyncSslThreads) {
    this.asyncSslThreads = asyncSslThreads;
  }

  
  /**
   * If set, Virtual Services will be automatically migrated when load on an SE is less than minimum or more than maximum thresholds. Only Alerts are generated when the auto_rebalance is not set.
   * @return autoRebalance
  **/
  @ApiModelProperty(value = "If set, Virtual Services will be automatically migrated when load on an SE is less than minimum or more than maximum thresholds. Only Alerts are generated when the auto_rebalance is not set.")


 
  @VsoMethod  
  public Boolean isAutoRebalance() {
    return autoRebalance;
  }
    
  @VsoMethod
  public void setAutoRebalance(Boolean autoRebalance) {
    this.autoRebalance = autoRebalance;
  }

  
  public ServiceEngineGroup addAutoRebalanceCapacityPerSeItem(Integer autoRebalanceCapacityPerSeItem) {
    if (this.autoRebalanceCapacityPerSe == null) {
      this.autoRebalanceCapacityPerSe = new ArrayList<Integer>();
    }
    this.autoRebalanceCapacityPerSe.add(autoRebalanceCapacityPerSeItem);
    return this;
  }
  
  /**
   * Capacities of SE for auto rebalance for each criteria. Field introduced in 17.2.4.
   * @return autoRebalanceCapacityPerSe
  **/
  @ApiModelProperty(value = "Capacities of SE for auto rebalance for each criteria. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public List<Integer> getAutoRebalanceCapacityPerSe() {
    return autoRebalanceCapacityPerSe;
  }
    
  @VsoMethod
  public void setAutoRebalanceCapacityPerSe(List<Integer> autoRebalanceCapacityPerSe) {
    this.autoRebalanceCapacityPerSe = autoRebalanceCapacityPerSe;
  }

  
  public ServiceEngineGroup addAutoRebalanceCriteriaItem(String autoRebalanceCriteriaItem) {
    if (this.autoRebalanceCriteria == null) {
      this.autoRebalanceCriteria = new ArrayList<String>();
    }
    this.autoRebalanceCriteria.add(autoRebalanceCriteriaItem);
    return this;
  }
  
  /**
   * Set of criteria for SE Auto Rebalance. Enum options - SE_AUTO_REBALANCE_CPU, SE_AUTO_REBALANCE_PPS, SE_AUTO_REBALANCE_MBPS, SE_AUTO_REBALANCE_OPEN_CONNS, SE_AUTO_REBALANCE_CPS. Field introduced in 17.2.3.
   * @return autoRebalanceCriteria
  **/
  @ApiModelProperty(value = "Set of criteria for SE Auto Rebalance. Enum options - SE_AUTO_REBALANCE_CPU, SE_AUTO_REBALANCE_PPS, SE_AUTO_REBALANCE_MBPS, SE_AUTO_REBALANCE_OPEN_CONNS, SE_AUTO_REBALANCE_CPS. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public List<String> getAutoRebalanceCriteria() {
    return autoRebalanceCriteria;
  }
    
  @VsoMethod
  public void setAutoRebalanceCriteria(List<String> autoRebalanceCriteria) {
    this.autoRebalanceCriteria = autoRebalanceCriteria;
  }

  
  /**
   * Frequency of rebalance, if 'Auto rebalance' is enabled.
   * @return autoRebalanceInterval
  **/
  @ApiModelProperty(value = "Frequency of rebalance, if 'Auto rebalance' is enabled.")


 
  @VsoMethod  
  public Integer getAutoRebalanceInterval() {
    return autoRebalanceInterval;
  }
    
  @VsoMethod
  public void setAutoRebalanceInterval(Integer autoRebalanceInterval) {
    this.autoRebalanceInterval = autoRebalanceInterval;
  }

  
  /**
   * Redistribution of virtual services from the takeover SE to the replacement SE can cause momentary traffic loss. If the auto-redistribute load option is left in its default off state, any desired rebalancing requires calls to REST API.
   * @return autoRedistributeActiveStandbyLoad
  **/
  @ApiModelProperty(value = "Redistribution of virtual services from the takeover SE to the replacement SE can cause momentary traffic loss. If the auto-redistribute load option is left in its default off state, any desired rebalancing requires calls to REST API.")


 
  @VsoMethod  
  public Boolean isAutoRedistributeActiveStandbyLoad() {
    return autoRedistributeActiveStandbyLoad;
  }
    
  @VsoMethod
  public void setAutoRedistributeActiveStandbyLoad(Boolean autoRedistributeActiveStandbyLoad) {
    this.autoRedistributeActiveStandbyLoad = autoRedistributeActiveStandbyLoad;
  }

  
  /**
   * BGP peer state update interval. Allowed values are 5-100. Field introduced in 17.2.14,18.1.5,18.2.1.
   * @return bgpStateUpdateInterval
  **/
  @ApiModelProperty(value = "BGP peer state update interval. Allowed values are 5-100. Field introduced in 17.2.14,18.1.5,18.2.1.")


 
  @VsoMethod  
  public Integer getBgpStateUpdateInterval() {
    return bgpStateUpdateInterval;
  }
    
  @VsoMethod
  public void setBgpStateUpdateInterval(Integer bgpStateUpdateInterval) {
    this.bgpStateUpdateInterval = bgpStateUpdateInterval;
  }

  
  /**
   * Excess Service Engine capacity provisioned for HA failover.
   * @return bufferSe
  **/
  @ApiModelProperty(value = "Excess Service Engine capacity provisioned for HA failover.")


 
  @VsoMethod  
  public Integer getBufferSe() {
    return bufferSe;
  }
    
  @VsoMethod
  public void setBufferSe(Integer bufferSe) {
    this.bufferSe = bufferSe;
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
   * Enable config debugs on all cores of SE. Field introduced in 17.2.13,18.1.5,18.2.1.
   * @return configDebugsOnAllCores
  **/
  @ApiModelProperty(value = "Enable config debugs on all cores of SE. Field introduced in 17.2.13,18.1.5,18.2.1.")


 
  @VsoMethod  
  public Boolean isConfigDebugsOnAllCores() {
    return configDebugsOnAllCores;
  }
    
  @VsoMethod
  public void setConfigDebugsOnAllCores(Boolean configDebugsOnAllCores) {
    this.configDebugsOnAllCores = configDebugsOnAllCores;
  }

  
  /**
   * Percentage of memory for connection state. This will come at the expense of memory used for HTTP in-memory cache. Allowed values are 10-90.
   * @return connectionMemoryPercentage
  **/
  @ApiModelProperty(value = "Percentage of memory for connection state. This will come at the expense of memory used for HTTP in-memory cache. Allowed values are 10-90.")


 
  @VsoMethod  
  public Integer getConnectionMemoryPercentage() {
    return connectionMemoryPercentage;
  }
    
  @VsoMethod
  public void setConnectionMemoryPercentage(Integer connectionMemoryPercentage) {
    this.connectionMemoryPercentage = connectionMemoryPercentage;
  }

  
  /**
   * Include shared memory for app cache in core file.Requires SE Reboot. Field introduced in 18.2.8, 20.1.1.
   * @return coreShmAppCache
  **/
  @ApiModelProperty(value = "Include shared memory for app cache in core file.Requires SE Reboot. Field introduced in 18.2.8, 20.1.1.")


 
  @VsoMethod  
  public Boolean isCoreShmAppCache() {
    return coreShmAppCache;
  }
    
  @VsoMethod
  public void setCoreShmAppCache(Boolean coreShmAppCache) {
    this.coreShmAppCache = coreShmAppCache;
  }

  
  /**
   * Include shared memory for app learning in core file.Requires SE Reboot. Field introduced in 18.2.8, 20.1.1.
   * @return coreShmAppLearning
  **/
  @ApiModelProperty(value = "Include shared memory for app learning in core file.Requires SE Reboot. Field introduced in 18.2.8, 20.1.1.")


 
  @VsoMethod  
  public Boolean isCoreShmAppLearning() {
    return coreShmAppLearning;
  }
    
  @VsoMethod
  public void setCoreShmAppLearning(Boolean coreShmAppLearning) {
    this.coreShmAppLearning = coreShmAppLearning;
  }

  
  /**
   * Placeholder for description of property cpu_reserve of obj type ServiceEngineGroup field type str  type boolean
   * @return cpuReserve
  **/
  @ApiModelProperty(value = "Placeholder for description of property cpu_reserve of obj type ServiceEngineGroup field type str  type boolean")


 
  @VsoMethod  
  public Boolean isCpuReserve() {
    return cpuReserve;
  }
    
  @VsoMethod
  public void setCpuReserve(Boolean cpuReserve) {
    this.cpuReserve = cpuReserve;
  }

  
  /**
   * Allocate all the CPU cores for the Service Engine Virtual Machines  on the same CPU socket. Applicable only for vCenter Cloud.
   * @return cpuSocketAffinity
  **/
  @ApiModelProperty(value = "Allocate all the CPU cores for the Service Engine Virtual Machines  on the same CPU socket. Applicable only for vCenter Cloud.")


 
  @VsoMethod  
  public Boolean isCpuSocketAffinity() {
    return cpuSocketAffinity;
  }
    
  @VsoMethod
  public void setCpuSocketAffinity(Boolean cpuSocketAffinity) {
    this.cpuSocketAffinity = cpuSocketAffinity;
  }

  
  public ServiceEngineGroup addCustomSecuritygroupsDataItem(String customSecuritygroupsDataItem) {
    if (this.customSecuritygroupsData == null) {
      this.customSecuritygroupsData = new ArrayList<String>();
    }
    this.customSecuritygroupsData.add(customSecuritygroupsDataItem);
    return this;
  }
  
  /**
   * Custom Security Groups to be associated with data vNics for SE instances in OpenStack and AWS Clouds. Field introduced in 17.1.3.
   * @return customSecuritygroupsData
  **/
  @ApiModelProperty(value = "Custom Security Groups to be associated with data vNics for SE instances in OpenStack and AWS Clouds. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public List<String> getCustomSecuritygroupsData() {
    return customSecuritygroupsData;
  }
    
  @VsoMethod
  public void setCustomSecuritygroupsData(List<String> customSecuritygroupsData) {
    this.customSecuritygroupsData = customSecuritygroupsData;
  }

  
  public ServiceEngineGroup addCustomSecuritygroupsMgmtItem(String customSecuritygroupsMgmtItem) {
    if (this.customSecuritygroupsMgmt == null) {
      this.customSecuritygroupsMgmt = new ArrayList<String>();
    }
    this.customSecuritygroupsMgmt.add(customSecuritygroupsMgmtItem);
    return this;
  }
  
  /**
   * Custom Security Groups to be associated with management vNic for SE instances in OpenStack and AWS Clouds. Field introduced in 17.1.3.
   * @return customSecuritygroupsMgmt
  **/
  @ApiModelProperty(value = "Custom Security Groups to be associated with management vNic for SE instances in OpenStack and AWS Clouds. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public List<String> getCustomSecuritygroupsMgmt() {
    return customSecuritygroupsMgmt;
  }
    
  @VsoMethod
  public void setCustomSecuritygroupsMgmt(List<String> customSecuritygroupsMgmt) {
    this.customSecuritygroupsMgmt = customSecuritygroupsMgmt;
  }

  
  public ServiceEngineGroup addCustomTagItem(CustomTag customTagItem) {
    if (this.customTag == null) {
      this.customTag = new ArrayList<CustomTag>();
    }
    this.customTag.add(customTagItem);
    return this;
  }
  
  /**
   * Custom tag will be used to create the tags for SE instance in AWS. Note this is not the same as the prefix for SE name.
   * @return customTag
  **/
  @ApiModelProperty(value = "Custom tag will be used to create the tags for SE instance in AWS. Note this is not the same as the prefix for SE name.")

  @Valid

 
  @VsoMethod  
  public List<CustomTag> getCustomTag() {
    return customTag;
  }
    
  @VsoMethod
  public void setCustomTag(List<CustomTag> customTag) {
    this.customTag = customTag;
  }

  
  /**
   * Subnet used to spin up the data nic for Service Engines, used only for Azure cloud. Overrides the cloud level setting for Service Engine subnet. Field introduced in 18.2.3.
   * @return dataNetworkId
  **/
  @ApiModelProperty(value = "Subnet used to spin up the data nic for Service Engines, used only for Azure cloud. Overrides the cloud level setting for Service Engine subnet. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getDataNetworkId() {
    return dataNetworkId;
  }
    
  @VsoMethod
  public void setDataNetworkId(String dataNetworkId) {
    this.dataNetworkId = dataNetworkId;
  }

  
  /**
   * Number of instructions before datascript times out. Allowed values are 0-100000000. Field introduced in 18.2.3.
   * @return datascriptTimeout
  **/
  @ApiModelProperty(value = "Number of instructions before datascript times out. Allowed values are 0-100000000. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Long getDatascriptTimeout() {
    return datascriptTimeout;
  }
    
  @VsoMethod
  public void setDatascriptTimeout(Long datascriptTimeout) {
    this.datascriptTimeout = datascriptTimeout;
  }

  
  /**
   * Dedicate the core that handles packet receive/transmit from the network to just the dispatching function. Don't use it for TCP/IP and SSL functions.
   * @return dedicatedDispatcherCore
  **/
  @ApiModelProperty(value = "Dedicate the core that handles packet receive/transmit from the network to just the dispatching function. Don't use it for TCP/IP and SSL functions.")


 
  @VsoMethod  
  public Boolean isDedicatedDispatcherCore() {
    return dedicatedDispatcherCore;
  }
    
  @VsoMethod
  public void setDedicatedDispatcherCore(Boolean dedicatedDispatcherCore) {
    this.dedicatedDispatcherCore = dedicatedDispatcherCore;
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

  
  /**
   * By default, Avi creates and manages security groups along with custom sg provided by user. Set this to True to disallow Avi to create and manage new security groups. Avi will only make use of custom security groups provided by user. This option is supported for AWS and OpenStack cloud types. Field introduced in 17.2.13,18.1.4,18.2.1.
   * @return disableAviSecuritygroups
  **/
  @ApiModelProperty(value = "By default, Avi creates and manages security groups along with custom sg provided by user. Set this to True to disallow Avi to create and manage new security groups. Avi will only make use of custom security groups provided by user. This option is supported for AWS and OpenStack cloud types. Field introduced in 17.2.13,18.1.4,18.2.1.")


 
  @VsoMethod  
  public Boolean isDisableAviSecuritygroups() {
    return disableAviSecuritygroups;
  }
    
  @VsoMethod
  public void setDisableAviSecuritygroups(Boolean disableAviSecuritygroups) {
    this.disableAviSecuritygroups = disableAviSecuritygroups;
  }

  
  /**
   * Stop using TCP/UDP and IP checksum offload features of NICs. Field introduced in 17.1.14, 17.2.5, 18.1.1.
   * @return disableCsumOffloads
  **/
  @ApiModelProperty(value = "Stop using TCP/UDP and IP checksum offload features of NICs. Field introduced in 17.1.14, 17.2.5, 18.1.1.")


 
  @VsoMethod  
  public Boolean isDisableCsumOffloads() {
    return disableCsumOffloads;
  }
    
  @VsoMethod
  public void setDisableCsumOffloads(Boolean disableCsumOffloads) {
    this.disableCsumOffloads = disableCsumOffloads;
  }

  
  /**
   * Disable Generic Receive Offload (GRO) in DPDK poll-mode driver packet receive path.  GRO is on by default on NICs that do not support LRO (Large Receive Offload) or do not gain performance boost from LRO. Field introduced in 17.2.5, 18.1.1.
   * @return disableGro
  **/
  @ApiModelProperty(value = "Disable Generic Receive Offload (GRO) in DPDK poll-mode driver packet receive path.  GRO is on by default on NICs that do not support LRO (Large Receive Offload) or do not gain performance boost from LRO. Field introduced in 17.2.5, 18.1.1.")


 
  @VsoMethod  
  public Boolean isDisableGro() {
    return disableGro;
  }
    
  @VsoMethod
  public void setDisableGro(Boolean disableGro) {
    this.disableGro = disableGro;
  }

  
  /**
   * If set, disable the config memory check done in service engine. Field introduced in 18.1.2.
   * @return disableSeMemoryCheck
  **/
  @ApiModelProperty(value = "If set, disable the config memory check done in service engine. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Boolean isDisableSeMemoryCheck() {
    return disableSeMemoryCheck;
  }
    
  @VsoMethod
  public void setDisableSeMemoryCheck(Boolean disableSeMemoryCheck) {
    this.disableSeMemoryCheck = disableSeMemoryCheck;
  }

  
  /**
   * Disable TCP Segmentation Offload (TSO) in DPDK poll-mode driver packet transmit path. TSO is on by default on NICs that support it. Field introduced in 17.2.5, 18.1.1.
   * @return disableTso
  **/
  @ApiModelProperty(value = "Disable TCP Segmentation Offload (TSO) in DPDK poll-mode driver packet transmit path. TSO is on by default on NICs that support it. Field introduced in 17.2.5, 18.1.1.")


 
  @VsoMethod  
  public Boolean isDisableTso() {
    return disableTso;
  }
    
  @VsoMethod
  public void setDisableTso(Boolean disableTso) {
    this.disableTso = disableTso;
  }

  
  /**
   * Amount of disk space for each of the Service Engine virtual machines.
   * @return diskPerSe
  **/
  @ApiModelProperty(value = "Amount of disk space for each of the Service Engine virtual machines.")


 
  @VsoMethod  
  public Integer getDiskPerSe() {
    return diskPerSe;
  }
    
  @VsoMethod
  public void setDiskPerSe(Integer diskPerSe) {
    this.diskPerSe = diskPerSe;
  }

  
  /**
   * Use both the active and standby Service Engines for Virtual Service placement in the legacy active standby HA mode.
   * @return distributeLoadActiveStandby
  **/
  @ApiModelProperty(value = "Use both the active and standby Service Engines for Virtual Service placement in the legacy active standby HA mode.")


 
  @VsoMethod  
  public Boolean isDistributeLoadActiveStandby() {
    return distributeLoadActiveStandby;
  }
    
  @VsoMethod
  public void setDistributeLoadActiveStandby(Boolean distributeLoadActiveStandby) {
    this.distributeLoadActiveStandby = distributeLoadActiveStandby;
  }

  
  /**
   * Distributes queue ownership among cores so multiple cores handle dispatcher duties.Requires SE Reboot. Field introduced in 17.2.8.
   * @return distributeQueues
  **/
  @ApiModelProperty(value = "Distributes queue ownership among cores so multiple cores handle dispatcher duties.Requires SE Reboot. Field introduced in 17.2.8.")


 
  @VsoMethod  
  public Boolean isDistributeQueues() {
    return distributeQueues;
  }
    
  @VsoMethod
  public void setDistributeQueues(Boolean distributeQueues) {
    this.distributeQueues = distributeQueues;
  }

  
  /**
   * Distributes vnic ownership among cores so multiple cores handle dispatcher duties.Requires SE Reboot. Field introduced in 18.2.5.
   * @return distributeVnics
  **/
  @ApiModelProperty(value = "Distributes vnic ownership among cores so multiple cores handle dispatcher duties.Requires SE Reboot. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isDistributeVnics() {
    return distributeVnics;
  }
    
  @VsoMethod
  public void setDistributeVnics(Boolean distributeVnics) {
    this.distributeVnics = distributeVnics;
  }

  
  /**
   * Enable GratArp for VIP_IP. Field introduced in 18.2.3.
   * @return enableGratarpPermanent
  **/
  @ApiModelProperty(value = "Enable GratArp for VIP_IP. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isEnableGratarpPermanent() {
    return enableGratarpPermanent;
  }
    
  @VsoMethod
  public void setEnableGratarpPermanent(Boolean enableGratarpPermanent) {
    this.enableGratarpPermanent = enableGratarpPermanent;
  }

  
  /**
   * (This is a beta feature). Enable HSM key priming. If enabled, key handles on the hsm will be synced to SE before processing client connections. Field introduced in 17.2.7, 18.1.1.
   * @return enableHsmPriming
  **/
  @ApiModelProperty(value = "(This is a beta feature). Enable HSM key priming. If enabled, key handles on the hsm will be synced to SE before processing client connections. Field introduced in 17.2.7, 18.1.1.")


 
  @VsoMethod  
  public Boolean isEnableHsmPriming() {
    return enableHsmPriming;
  }
    
  @VsoMethod
  public void setEnableHsmPriming(Boolean enableHsmPriming) {
    this.enableHsmPriming = enableHsmPriming;
  }

  
  /**
   * Applicable only for Azure cloud with Basic SKU LB. If set, additional Azure LBs will be automatically created if resources in existing LB are exhausted. Field introduced in 17.2.10, 18.1.2.
   * @return enableMultiLb
  **/
  @ApiModelProperty(value = "Applicable only for Azure cloud with Basic SKU LB. If set, additional Azure LBs will be automatically created if resources in existing LB are exhausted. Field introduced in 17.2.10, 18.1.2.")


 
  @VsoMethod  
  public Boolean isEnableMultiLb() {
    return enableMultiLb;
  }
    
  @VsoMethod
  public void setEnableMultiLb(Boolean enableMultiLb) {
    this.enableMultiLb = enableMultiLb;
  }

  
  /**
   * Enable TX ring support in pcap mode of operation. TSO feature is not supported with TX Ring enabled. Deprecated from 18.2.8, instead use pcap_tx_mode. Requires SE Reboot. Field introduced in 18.2.5.
   * @return enablePcapTxRing
  **/
  @ApiModelProperty(value = "Enable TX ring support in pcap mode of operation. TSO feature is not supported with TX Ring enabled. Deprecated from 18.2.8, instead use pcap_tx_mode. Requires SE Reboot. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isEnablePcapTxRing() {
    return enablePcapTxRing;
  }
    
  @VsoMethod
  public void setEnablePcapTxRing(Boolean enablePcapTxRing) {
    this.enablePcapTxRing = enablePcapTxRing;
  }

  
  /**
   * Enable routing for this ServiceEngineGroup . Field deprecated in 18.2.5.
   * @return enableRouting
  **/
  @ApiModelProperty(value = "Enable routing for this ServiceEngineGroup . Field deprecated in 18.2.5.")


 
  @VsoMethod  
  public Boolean isEnableRouting() {
    return enableRouting;
  }
    
  @VsoMethod
  public void setEnableRouting(Boolean enableRouting) {
    this.enableRouting = enableRouting;
  }

  
  /**
   * Enable VIP on all interfaces of SE. Field deprecated in 18.2.5. Field introduced in 17.1.1.
   * @return enableVipOnAllInterfaces
  **/
  @ApiModelProperty(value = "Enable VIP on all interfaces of SE. Field deprecated in 18.2.5. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isEnableVipOnAllInterfaces() {
    return enableVipOnAllInterfaces;
  }
    
  @VsoMethod
  public void setEnableVipOnAllInterfaces(Boolean enableVipOnAllInterfaces) {
    this.enableVipOnAllInterfaces = enableVipOnAllInterfaces;
  }

  
  /**
   * Use Virtual MAC address for interfaces on which floating interface IPs are placed. Field deprecated in 18.2.5.
   * @return enableVmac
  **/
  @ApiModelProperty(value = "Use Virtual MAC address for interfaces on which floating interface IPs are placed. Field deprecated in 18.2.5.")


 
  @VsoMethod  
  public Boolean isEnableVmac() {
    return enableVmac;
  }
    
  @VsoMethod
  public void setEnableVmac(Boolean enableVmac) {
    this.enableVmac = enableVmac;
  }

  
  /**
   * End local ephemeral port number for outbound connections. Field introduced in 17.2.13, 18.1.5, 18.2.1.
   * @return ephemeralPortrangeEnd
  **/
  @ApiModelProperty(value = "End local ephemeral port number for outbound connections. Field introduced in 17.2.13, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public Integer getEphemeralPortrangeEnd() {
    return ephemeralPortrangeEnd;
  }
    
  @VsoMethod
  public void setEphemeralPortrangeEnd(Integer ephemeralPortrangeEnd) {
    this.ephemeralPortrangeEnd = ephemeralPortrangeEnd;
  }

  
  /**
   * Start local ephemeral port number for outbound connections. Field introduced in 17.2.13, 18.1.5, 18.2.1.
   * @return ephemeralPortrangeStart
  **/
  @ApiModelProperty(value = "Start local ephemeral port number for outbound connections. Field introduced in 17.2.13, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public Integer getEphemeralPortrangeStart() {
    return ephemeralPortrangeStart;
  }
    
  @VsoMethod
  public void setEphemeralPortrangeStart(Integer ephemeralPortrangeStart) {
    this.ephemeralPortrangeStart = ephemeralPortrangeStart;
  }

  
  /**
   * Multiplier for extra config to support large VS/Pool config.
   * @return extraConfigMultiplier
  **/
  @ApiModelProperty(value = "Multiplier for extra config to support large VS/Pool config.")


 
  @VsoMethod  
  public Double getExtraConfigMultiplier() {
    return extraConfigMultiplier;
  }
    
  @VsoMethod
  public void setExtraConfigMultiplier(Double extraConfigMultiplier) {
    this.extraConfigMultiplier = extraConfigMultiplier;
  }

  
  /**
   * Extra config memory to support large Geo DB configuration. Field introduced in 17.1.1.
   * @return extraSharedConfigMemory
  **/
  @ApiModelProperty(value = "Extra config memory to support large Geo DB configuration. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getExtraSharedConfigMemory() {
    return extraSharedConfigMemory;
  }
    
  @VsoMethod
  public void setExtraSharedConfigMemory(Integer extraSharedConfigMemory) {
    this.extraSharedConfigMemory = extraSharedConfigMemory;
  }

  
  public ServiceEngineGroup addFloatingIntfIpItem(IpAddr floatingIntfIpItem) {
    if (this.floatingIntfIp == null) {
      this.floatingIntfIp = new ArrayList<IpAddr>();
    }
    this.floatingIntfIp.add(floatingIntfIpItem);
    return this;
  }
  
  /**
   * If ServiceEngineGroup is configured for Legacy 1+1 Active Standby HA Mode, Floating IP's will be advertised only by the Active SE in the Pair. Virtual Services in this group must be disabled/enabled for any changes to the Floating IP's to take effect. Only active SE hosting VS tagged with Active Standby SE 1 Tag will advertise this floating IP when manual load distribution is enabled. Field deprecated in 18.2.5.
   * @return floatingIntfIp
  **/
  @ApiModelProperty(value = "If ServiceEngineGroup is configured for Legacy 1+1 Active Standby HA Mode, Floating IP's will be advertised only by the Active SE in the Pair. Virtual Services in this group must be disabled/enabled for any changes to the Floating IP's to take effect. Only active SE hosting VS tagged with Active Standby SE 1 Tag will advertise this floating IP when manual load distribution is enabled. Field deprecated in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public List<IpAddr> getFloatingIntfIp() {
    return floatingIntfIp;
  }
    
  @VsoMethod
  public void setFloatingIntfIp(List<IpAddr> floatingIntfIp) {
    this.floatingIntfIp = floatingIntfIp;
  }

  
  public ServiceEngineGroup addFloatingIntfIpSe2Item(IpAddr floatingIntfIpSe2Item) {
    if (this.floatingIntfIpSe2 == null) {
      this.floatingIntfIpSe2 = new ArrayList<IpAddr>();
    }
    this.floatingIntfIpSe2.add(floatingIntfIpSe2Item);
    return this;
  }
  
  /**
   * If ServiceEngineGroup is configured for Legacy 1+1 Active Standby HA Mode, Floating IP's will be advertised only by the Active SE in the Pair. Virtual Services in this group must be disabled/enabled for any changes to the Floating IP's to take effect. Only active SE hosting VS tagged with Active Standby SE 2 Tag will advertise this floating IP when manual load distribution is enabled. Field deprecated in 18.2.5.
   * @return floatingIntfIpSe2
  **/
  @ApiModelProperty(value = "If ServiceEngineGroup is configured for Legacy 1+1 Active Standby HA Mode, Floating IP's will be advertised only by the Active SE in the Pair. Virtual Services in this group must be disabled/enabled for any changes to the Floating IP's to take effect. Only active SE hosting VS tagged with Active Standby SE 2 Tag will advertise this floating IP when manual load distribution is enabled. Field deprecated in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public List<IpAddr> getFloatingIntfIpSe2() {
    return floatingIntfIpSe2;
  }
    
  @VsoMethod
  public void setFloatingIntfIpSe2(List<IpAddr> floatingIntfIpSe2) {
    this.floatingIntfIpSe2 = floatingIntfIpSe2;
  }

  
  /**
   * Maximum number of flow table entries that have not completed TCP three-way handshake yet. Field introduced in 17.2.5.
   * @return flowTableNewSynMaxEntries
  **/
  @ApiModelProperty(value = "Maximum number of flow table entries that have not completed TCP three-way handshake yet. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public Integer getFlowTableNewSynMaxEntries() {
    return flowTableNewSynMaxEntries;
  }
    
  @VsoMethod
  public void setFlowTableNewSynMaxEntries(Integer flowTableNewSynMaxEntries) {
    this.flowTableNewSynMaxEntries = flowTableNewSynMaxEntries;
  }

  
  /**
   * Number of entries in the free list. Field introduced in 17.2.10, 18.1.2.
   * @return freeListSize
  **/
  @ApiModelProperty(value = "Number of entries in the free list. Field introduced in 17.2.10, 18.1.2.")


 
  @VsoMethod  
  public Integer getFreeListSize() {
    return freeListSize;
  }
    
  @VsoMethod
  public void setFreeListSize(Integer freeListSize) {
    this.freeListSize = freeListSize;
  }

  
  /**
   * GratArp periodicity for VIP-IP. Allowed values are 5-30. Field introduced in 18.2.3.
   * @return gratarpPermanentPeriodicity
  **/
  @ApiModelProperty(value = "GratArp periodicity for VIP-IP. Allowed values are 5-30. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getGratarpPermanentPeriodicity() {
    return gratarpPermanentPeriodicity;
  }
    
  @VsoMethod
  public void setGratarpPermanentPeriodicity(Integer gratarpPermanentPeriodicity) {
    this.gratarpPermanentPeriodicity = gratarpPermanentPeriodicity;
  }

  
  /**
   * High Availability mode for all the Virtual Services using this Service Engine group. Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.
   * @return haMode
  **/
  @ApiModelProperty(value = "High Availability mode for all the Virtual Services using this Service Engine group. Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.")


 
  @VsoMethod  
  public String getHaMode() {
    return haMode;
  }
    
  @VsoMethod
  public void setHaMode(String haMode) {
    this.haMode = haMode;
  }

  
  /**
   *  It is a reference to an object of type HardwareSecurityModuleGroup.
   * @return hardwaresecuritymodulegroupRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type HardwareSecurityModuleGroup.")


 
  @VsoMethod  
  public String getHardwaresecuritymodulegroupRef() {
    return hardwaresecuritymodulegroupRef;
  }
    
  @VsoMethod
  public void setHardwaresecuritymodulegroupRef(String hardwaresecuritymodulegroupRef) {
    this.hardwaresecuritymodulegroupRef = hardwaresecuritymodulegroupRef;
  }

  
  /**
   * Minimum required heap memory to apply any configuration. Allowed values are 0-100. Field introduced in 18.1.2.
   * @return heapMinimumConfigMemory
  **/
  @ApiModelProperty(value = "Minimum required heap memory to apply any configuration. Allowed values are 0-100. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Integer getHeapMinimumConfigMemory() {
    return heapMinimumConfigMemory;
  }
    
  @VsoMethod
  public void setHeapMinimumConfigMemory(Integer heapMinimumConfigMemory) {
    this.heapMinimumConfigMemory = heapMinimumConfigMemory;
  }

  
  /**
   * Enable active health monitoring from the standby SE for all placed virtual services.
   * @return hmOnStandby
  **/
  @ApiModelProperty(value = "Enable active health monitoring from the standby SE for all placed virtual services.")


 
  @VsoMethod  
  public Boolean isHmOnStandby() {
    return hmOnStandby;
  }
    
  @VsoMethod
  public void setHmOnStandby(Boolean hmOnStandby) {
    this.hmOnStandby = hmOnStandby;
  }

  
  /**
   * Key of a (Key, Value) pair identifying a label for a set of Nodes usually in Container Clouds. Needs to be specified together with host_attribute_value. SEs can be configured differently including HA modes across different SE Groups. May also be used for isolation between different classes of VirtualServices. VirtualServices' SE Group may be specified via annotations/labels. A OpenShift/Kubernetes namespace maybe annotated with a matching SE Group label as openshift.io/node-selector  apptype=prod. When multiple SE Groups are used in a Cloud with host attributes specified,just a single SE Group can exist as a match-all SE Group without a host_attribute_key.
   * @return hostAttributeKey
  **/
  @ApiModelProperty(value = "Key of a (Key, Value) pair identifying a label for a set of Nodes usually in Container Clouds. Needs to be specified together with host_attribute_value. SEs can be configured differently including HA modes across different SE Groups. May also be used for isolation between different classes of VirtualServices. VirtualServices' SE Group may be specified via annotations/labels. A OpenShift/Kubernetes namespace maybe annotated with a matching SE Group label as openshift.io/node-selector  apptype=prod. When multiple SE Groups are used in a Cloud with host attributes specified,just a single SE Group can exist as a match-all SE Group without a host_attribute_key.")


 
  @VsoMethod  
  public String getHostAttributeKey() {
    return hostAttributeKey;
  }
    
  @VsoMethod
  public void setHostAttributeKey(String hostAttributeKey) {
    this.hostAttributeKey = hostAttributeKey;
  }

  
  /**
   * Value of a (Key, Value) pair identifying a label for a set of Nodes usually in Container Clouds. Needs to be specified together with host_attribute_key.
   * @return hostAttributeValue
  **/
  @ApiModelProperty(value = "Value of a (Key, Value) pair identifying a label for a set of Nodes usually in Container Clouds. Needs to be specified together with host_attribute_key.")


 
  @VsoMethod  
  public String getHostAttributeValue() {
    return hostAttributeValue;
  }
    
  @VsoMethod
  public void setHostAttributeValue(String hostAttributeValue) {
    this.hostAttributeValue = hostAttributeValue;
  }

  
  /**
   * Enable the host gateway monitor when service engine is deployed as docker container. Disabled by default. Field introduced in 17.2.4.
   * @return hostGatewayMonitor
  **/
  @ApiModelProperty(value = "Enable the host gateway monitor when service engine is deployed as docker container. Disabled by default. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public Boolean isHostGatewayMonitor() {
    return hostGatewayMonitor;
  }
    
  @VsoMethod
  public void setHostGatewayMonitor(Boolean hostGatewayMonitor) {
    this.hostGatewayMonitor = hostGatewayMonitor;
  }

  
  /**
   * Override default hypervisor. Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * @return hypervisor
  **/
  @ApiModelProperty(value = "Override default hypervisor. Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.")


 
  @VsoMethod  
  public String getHypervisor() {
    return hypervisor;
  }
    
  @VsoMethod
  public void setHypervisor(String hypervisor) {
    this.hypervisor = hypervisor;
  }

  
  /**
   * Ignore RTT samples if it is above threshold. Field introduced in 17.1.6,17.2.2.
   * @return ignoreRttThreshold
  **/
  @ApiModelProperty(value = "Ignore RTT samples if it is above threshold. Field introduced in 17.1.6,17.2.2.")


 
  @VsoMethod  
  public Integer getIgnoreRttThreshold() {
    return ignoreRttThreshold;
  }
    
  @VsoMethod
  public void setIgnoreRttThreshold(Integer ignoreRttThreshold) {
    this.ignoreRttThreshold = ignoreRttThreshold;
  }

  
  /**
   * Program SE security group ingress rules to allow VIP data access from remote CIDR type. Enum options - SG_INGRESS_ACCESS_NONE, SG_INGRESS_ACCESS_ALL, SG_INGRESS_ACCESS_VPC. Field introduced in 17.1.5.
   * @return ingressAccessData
  **/
  @ApiModelProperty(value = "Program SE security group ingress rules to allow VIP data access from remote CIDR type. Enum options - SG_INGRESS_ACCESS_NONE, SG_INGRESS_ACCESS_ALL, SG_INGRESS_ACCESS_VPC. Field introduced in 17.1.5.")


 
  @VsoMethod  
  public String getIngressAccessData() {
    return ingressAccessData;
  }
    
  @VsoMethod
  public void setIngressAccessData(String ingressAccessData) {
    this.ingressAccessData = ingressAccessData;
  }

  
  /**
   * Program SE security group ingress rules to allow SSH/ICMP management access from remote CIDR type. Enum options - SG_INGRESS_ACCESS_NONE, SG_INGRESS_ACCESS_ALL, SG_INGRESS_ACCESS_VPC. Field introduced in 17.1.5.
   * @return ingressAccessMgmt
  **/
  @ApiModelProperty(value = "Program SE security group ingress rules to allow SSH/ICMP management access from remote CIDR type. Enum options - SG_INGRESS_ACCESS_NONE, SG_INGRESS_ACCESS_ALL, SG_INGRESS_ACCESS_VPC. Field introduced in 17.1.5.")


 
  @VsoMethod  
  public String getIngressAccessMgmt() {
    return ingressAccessMgmt;
  }
    
  @VsoMethod
  public void setIngressAccessMgmt(String ingressAccessMgmt) {
    this.ingressAccessMgmt = ingressAccessMgmt;
  }

  
  /**
   * Instance/Flavor name for SE instance.
   * @return instanceFlavor
  **/
  @ApiModelProperty(value = "Instance/Flavor name for SE instance.")


 
  @VsoMethod  
  public String getInstanceFlavor() {
    return instanceFlavor;
  }
    
  @VsoMethod
  public void setInstanceFlavor(String instanceFlavor) {
    this.instanceFlavor = instanceFlavor;
  }

  
  public ServiceEngineGroup addIptablesItem(IptableRuleSet iptablesItem) {
    if (this.iptables == null) {
      this.iptables = new ArrayList<IptableRuleSet>();
    }
    this.iptables.add(iptablesItem);
    return this;
  }
  
  /**
   * Iptable Rules.
   * @return iptables
  **/
  @ApiModelProperty(value = "Iptable Rules.")

  @Valid

 
  @VsoMethod  
  public List<IptableRuleSet> getIptables() {
    return iptables;
  }
    
  @VsoMethod
  public void setIptables(List<IptableRuleSet> iptables) {
    this.iptables = iptables;
  }

  
  /**
   * Select core with least load for new flow.
   * @return leastLoadCoreSelection
  **/
  @ApiModelProperty(value = "Select core with least load for new flow.")


 
  @VsoMethod  
  public Boolean isLeastLoadCoreSelection() {
    return leastLoadCoreSelection;
  }
    
  @VsoMethod
  public void setLeastLoadCoreSelection(Boolean leastLoadCoreSelection) {
    this.leastLoadCoreSelection = leastLoadCoreSelection;
  }

  
  /**
   * Specifies the license tier which would be used. This field by default inherits the value from cloud. Enum options - ENTERPRISE_16, ENTERPRISE_18. Field introduced in 17.2.5.
   * @return licenseTier
  **/
  @ApiModelProperty(value = "Specifies the license tier which would be used. This field by default inherits the value from cloud. Enum options - ENTERPRISE_16, ENTERPRISE_18. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getLicenseTier() {
    return licenseTier;
  }
    
  @VsoMethod
  public void setLicenseTier(String licenseTier) {
    this.licenseTier = licenseTier;
  }

  
  /**
   * If no license type is specified then default license enforcement for the cloud type is chosen. Enum options - LIC_BACKEND_SERVERS, LIC_SOCKETS, LIC_CORES, LIC_HOSTS, LIC_SE_BANDWIDTH, LIC_METERED_SE_BANDWIDTH. Field introduced in 17.2.5.
   * @return licenseType
  **/
  @ApiModelProperty(value = "If no license type is specified then default license enforcement for the cloud type is chosen. Enum options - LIC_BACKEND_SERVERS, LIC_SOCKETS, LIC_CORES, LIC_HOSTS, LIC_SE_BANDWIDTH, LIC_METERED_SE_BANDWIDTH. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getLicenseType() {
    return licenseType;
  }
    
  @VsoMethod
  public void setLicenseType(String licenseType) {
    this.licenseType = licenseType;
  }

  
  /**
   * Maximum disk capacity (in MB) to be allocated to an SE. This is exclusively used for debug and log data.
   * @return logDisksz
  **/
  @ApiModelProperty(value = "Maximum disk capacity (in MB) to be allocated to an SE. This is exclusively used for debug and log data.")


 
  @VsoMethod  
  public Integer getLogDisksz() {
    return logDisksz;
  }
    
  @VsoMethod
  public void setLogDisksz(Integer logDisksz) {
    this.logDisksz = logDisksz;
  }

  
  /**
   * Maximum number of external health monitors that can run concurrently in a service engine. This helps control the CPU and memory use by external health monitors. Special values are 0- 'Value will be internally calculated based on cpu and memory'. Field introduced in 18.2.7.
   * @return maxConcurrentExternalHm
  **/
  @ApiModelProperty(value = "Maximum number of external health monitors that can run concurrently in a service engine. This helps control the CPU and memory use by external health monitors. Special values are 0- 'Value will be internally calculated based on cpu and memory'. Field introduced in 18.2.7.")


 
  @VsoMethod  
  public Integer getMaxConcurrentExternalHm() {
    return maxConcurrentExternalHm;
  }
    
  @VsoMethod
  public void setMaxConcurrentExternalHm(Integer maxConcurrentExternalHm) {
    this.maxConcurrentExternalHm = maxConcurrentExternalHm;
  }

  
  /**
   * When CPU usage on an SE exceeds this threshold, Virtual Services hosted on this SE may be rebalanced to other SEs to reduce load. A new SE may be created as part of this process. Allowed values are 40-90.
   * @return maxCpuUsage
  **/
  @ApiModelProperty(value = "When CPU usage on an SE exceeds this threshold, Virtual Services hosted on this SE may be rebalanced to other SEs to reduce load. A new SE may be created as part of this process. Allowed values are 40-90.")


 
  @VsoMethod  
  public Integer getMaxCpuUsage() {
    return maxCpuUsage;
  }
    
  @VsoMethod
  public void setMaxCpuUsage(Integer maxCpuUsage) {
    this.maxCpuUsage = maxCpuUsage;
  }

  
  /**
   * Max bytes that can be allocated in a single mempool. Field introduced in 18.1.5.
   * @return maxMemoryPerMempool
  **/
  @ApiModelProperty(value = "Max bytes that can be allocated in a single mempool. Field introduced in 18.1.5.")


 
  @VsoMethod  
  public Integer getMaxMemoryPerMempool() {
    return maxMemoryPerMempool;
  }
    
  @VsoMethod
  public void setMaxMemoryPerMempool(Integer maxMemoryPerMempool) {
    this.maxMemoryPerMempool = maxMemoryPerMempool;
  }

  
  /**
   * Configures the maximum number of se_dp processes created on the SE, requires SE reboot. If not configured, defaults to the number of CPUs on the SE. This should only be used if user wants to limit the number of se_dps to less than the available CPUs on the SE. Field introduced in 20.1.1.
   * @return maxNumSeDps
  **/
  @ApiModelProperty(value = "Configures the maximum number of se_dp processes created on the SE, requires SE reboot. If not configured, defaults to the number of CPUs on the SE. This should only be used if user wants to limit the number of se_dps to less than the available CPUs on the SE. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getMaxNumSeDps() {
    return maxNumSeDps;
  }
    
  @VsoMethod
  public void setMaxNumSeDps(Integer maxNumSeDps) {
    this.maxNumSeDps = maxNumSeDps;
  }

  
  /**
   * Applicable to Azure platform only. Maximum number of public IPs per Azure LB. . Field introduced in 17.2.12, 18.1.2.
   * @return maxPublicIpsPerLb
  **/
  @ApiModelProperty(value = "Applicable to Azure platform only. Maximum number of public IPs per Azure LB. . Field introduced in 17.2.12, 18.1.2.")


 
  @VsoMethod  
  public Integer getMaxPublicIpsPerLb() {
    return maxPublicIpsPerLb;
  }
    
  @VsoMethod
  public void setMaxPublicIpsPerLb(Integer maxPublicIpsPerLb) {
    this.maxPublicIpsPerLb = maxPublicIpsPerLb;
  }

  
  /**
   * Maximum number of queues per vnic Setting to '0' utilises all queues that are distributed across dispatcher cores. Allowed values are 0,1,2,4,8,16. Field introduced in 18.2.7, 20.1.1.
   * @return maxQueuesPerVnic
  **/
  @ApiModelProperty(value = "Maximum number of queues per vnic Setting to '0' utilises all queues that are distributed across dispatcher cores. Allowed values are 0,1,2,4,8,16. Field introduced in 18.2.7, 20.1.1.")


 
  @VsoMethod  
  public Integer getMaxQueuesPerVnic() {
    return maxQueuesPerVnic;
  }
    
  @VsoMethod
  public void setMaxQueuesPerVnic(Integer maxQueuesPerVnic) {
    this.maxQueuesPerVnic = maxQueuesPerVnic;
  }

  
  /**
   * Applicable to Azure platform only. Maximum number of rules per Azure LB. . Field introduced in 17.2.12, 18.1.2.
   * @return maxRulesPerLb
  **/
  @ApiModelProperty(value = "Applicable to Azure platform only. Maximum number of rules per Azure LB. . Field introduced in 17.2.12, 18.1.2.")


 
  @VsoMethod  
  public Integer getMaxRulesPerLb() {
    return maxRulesPerLb;
  }
    
  @VsoMethod
  public void setMaxRulesPerLb(Integer maxRulesPerLb) {
    this.maxRulesPerLb = maxRulesPerLb;
  }

  
  /**
   * Maximum number of active Service Engines for the Virtual Service. Allowed values are 1-64.
   * @return maxScaleoutPerVs
  **/
  @ApiModelProperty(value = "Maximum number of active Service Engines for the Virtual Service. Allowed values are 1-64.")


 
  @VsoMethod  
  public Integer getMaxScaleoutPerVs() {
    return maxScaleoutPerVs;
  }
    
  @VsoMethod
  public void setMaxScaleoutPerVs(Integer maxScaleoutPerVs) {
    this.maxScaleoutPerVs = maxScaleoutPerVs;
  }

  
  /**
   * Maximum number of Services Engines in this group. Allowed values are 0-1000.
   * @return maxSe
  **/
  @ApiModelProperty(value = "Maximum number of Services Engines in this group. Allowed values are 0-1000.")


 
  @VsoMethod  
  public Integer getMaxSe() {
    return maxSe;
  }
    
  @VsoMethod
  public void setMaxSe(Integer maxSe) {
    this.maxSe = maxSe;
  }

  
  /**
   * Maximum number of Virtual Services that can be placed on a single Service Engine. East West Virtual Services are excluded from this limit. Allowed values are 1-1000.
   * @return maxVsPerSe
  **/
  @ApiModelProperty(value = "Maximum number of Virtual Services that can be placed on a single Service Engine. East West Virtual Services are excluded from this limit. Allowed values are 1-1000.")


 
  @VsoMethod  
  public Integer getMaxVsPerSe() {
    return maxVsPerSe;
  }
    
  @VsoMethod
  public void setMaxVsPerSe(Integer maxVsPerSe) {
    this.maxVsPerSe = maxVsPerSe;
  }

  
  /**
   * Placeholder for description of property mem_reserve of obj type ServiceEngineGroup field type str  type boolean
   * @return memReserve
  **/
  @ApiModelProperty(value = "Placeholder for description of property mem_reserve of obj type ServiceEngineGroup field type str  type boolean")


 
  @VsoMethod  
  public Boolean isMemReserve() {
    return memReserve;
  }
    
  @VsoMethod
  public void setMemReserve(Boolean memReserve) {
    this.memReserve = memReserve;
  }

  
  /**
   * Indicates the percent of memory reserved for config updates. Allowed values are 0-100. Field introduced in 18.1.2.
   * @return memoryForConfigUpdate
  **/
  @ApiModelProperty(value = "Indicates the percent of memory reserved for config updates. Allowed values are 0-100. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Integer getMemoryForConfigUpdate() {
    return memoryForConfigUpdate;
  }
    
  @VsoMethod
  public void setMemoryForConfigUpdate(Integer memoryForConfigUpdate) {
    this.memoryForConfigUpdate = memoryForConfigUpdate;
  }

  
  /**
   * Amount of memory for each of the Service Engine virtual machines.
   * @return memoryPerSe
  **/
  @ApiModelProperty(value = "Amount of memory for each of the Service Engine virtual machines.")


 
  @VsoMethod  
  public Integer getMemoryPerSe() {
    return memoryPerSe;
  }
    
  @VsoMethod
  public void setMemoryPerSe(Integer memoryPerSe) {
    this.memoryPerSe = memoryPerSe;
  }

  
  /**
   * Management network to use for Avi Service Engines. It is a reference to an object of type Network.
   * @return mgmtNetworkRef
  **/
  @ApiModelProperty(value = "Management network to use for Avi Service Engines. It is a reference to an object of type Network.")


 
  @VsoMethod  
  public String getMgmtNetworkRef() {
    return mgmtNetworkRef;
  }
    
  @VsoMethod
  public void setMgmtNetworkRef(String mgmtNetworkRef) {
    this.mgmtNetworkRef = mgmtNetworkRef;
  }

  
  /**
   * Management subnet to use for Avi Service Engines.
   * @return mgmtSubnet
  **/
  @ApiModelProperty(value = "Management subnet to use for Avi Service Engines.")

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getMgmtSubnet() {
    return mgmtSubnet;
  }
    
  @VsoMethod
  public void setMgmtSubnet(IpAddrPrefix mgmtSubnet) {
    this.mgmtSubnet = mgmtSubnet;
  }

  
  /**
   * When CPU usage on an SE falls below the minimum threshold, Virtual Services hosted on the SE may be consolidated onto other underutilized SEs. After consolidation, unused Service Engines may then be eligible for deletion. . Allowed values are 20-60.
   * @return minCpuUsage
  **/
  @ApiModelProperty(value = "When CPU usage on an SE falls below the minimum threshold, Virtual Services hosted on the SE may be consolidated onto other underutilized SEs. After consolidation, unused Service Engines may then be eligible for deletion. . Allowed values are 20-60.")


 
  @VsoMethod  
  public Integer getMinCpuUsage() {
    return minCpuUsage;
  }
    
  @VsoMethod
  public void setMinCpuUsage(Integer minCpuUsage) {
    this.minCpuUsage = minCpuUsage;
  }

  
  /**
   * Minimum number of active Service Engines for the Virtual Service. Allowed values are 1-64.
   * @return minScaleoutPerVs
  **/
  @ApiModelProperty(value = "Minimum number of active Service Engines for the Virtual Service. Allowed values are 1-64.")


 
  @VsoMethod  
  public Integer getMinScaleoutPerVs() {
    return minScaleoutPerVs;
  }
    
  @VsoMethod
  public void setMinScaleoutPerVs(Integer minScaleoutPerVs) {
    this.minScaleoutPerVs = minScaleoutPerVs;
  }

  
  /**
   * Minimum number of Services Engines in this group (relevant for SE AutoRebalance only). Allowed values are 0-1000. Field introduced in 17.2.13,18.1.3,18.2.1.
   * @return minSe
  **/
  @ApiModelProperty(value = "Minimum number of Services Engines in this group (relevant for SE AutoRebalance only). Allowed values are 0-1000. Field introduced in 17.2.13,18.1.3,18.2.1.")


 
  @VsoMethod  
  public Integer getMinSe() {
    return minSe;
  }
    
  @VsoMethod
  public void setMinSe(Integer minSe) {
    this.minSe = minSe;
  }

  
  /**
   * Indicates the percent of memory reserved for connections. Allowed values are 0-100. Field introduced in 18.1.2.
   * @return minimumConnectionMemory
  **/
  @ApiModelProperty(value = "Indicates the percent of memory reserved for connections. Allowed values are 0-100. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Integer getMinimumConnectionMemory() {
    return minimumConnectionMemory;
  }
    
  @VsoMethod
  public void setMinimumConnectionMemory(Integer minimumConnectionMemory) {
    this.minimumConnectionMemory = minimumConnectionMemory;
  }

  
  /**
   * Required available config memory to apply any configuration. Allowed values are 0-90. Field deprecated in 18.1.2. Field introduced in 18.1.1.
   * @return minimumRequiredConfigMemory
  **/
  @ApiModelProperty(value = "Required available config memory to apply any configuration. Allowed values are 0-90. Field deprecated in 18.1.2. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Integer getMinimumRequiredConfigMemory() {
    return minimumRequiredConfigMemory;
  }
    
  @VsoMethod
  public void setMinimumRequiredConfigMemory(Integer minimumRequiredConfigMemory) {
    this.minimumRequiredConfigMemory = minimumRequiredConfigMemory;
  }

  
  /**
   * Number of threads to use for log streaming. Allowed values are 1-100. Field introduced in 17.2.12, 18.1.2.
   * @return nLogStreamingThreads
  **/
  @ApiModelProperty(value = "Number of threads to use for log streaming. Allowed values are 1-100. Field introduced in 17.2.12, 18.1.2.")


 
  @VsoMethod  
  public Integer getNLogStreamingThreads() {
    return nLogStreamingThreads;
  }
    
  @VsoMethod
  public void setNLogStreamingThreads(Integer nLogStreamingThreads) {
    this.nLogStreamingThreads = nLogStreamingThreads;
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
   * Idle timeout in seconds for nat tcp flows in closed state. Allowed values are 1-3600. Field deprecated in 18.2.5. Field introduced in 18.2.5.
   * @return natFlowTcpClosedTimeout
  **/
  @ApiModelProperty(value = "Idle timeout in seconds for nat tcp flows in closed state. Allowed values are 1-3600. Field deprecated in 18.2.5. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getNatFlowTcpClosedTimeout() {
    return natFlowTcpClosedTimeout;
  }
    
  @VsoMethod
  public void setNatFlowTcpClosedTimeout(Integer natFlowTcpClosedTimeout) {
    this.natFlowTcpClosedTimeout = natFlowTcpClosedTimeout;
  }

  
  /**
   * Idle timeout in seconds for nat tcp flows in established state. Allowed values are 1-3600. Field deprecated in 18.2.5. Field introduced in 18.2.5.
   * @return natFlowTcpEstablishedTimeout
  **/
  @ApiModelProperty(value = "Idle timeout in seconds for nat tcp flows in established state. Allowed values are 1-3600. Field deprecated in 18.2.5. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getNatFlowTcpEstablishedTimeout() {
    return natFlowTcpEstablishedTimeout;
  }
    
  @VsoMethod
  public void setNatFlowTcpEstablishedTimeout(Integer natFlowTcpEstablishedTimeout) {
    this.natFlowTcpEstablishedTimeout = natFlowTcpEstablishedTimeout;
  }

  
  /**
   * Idle timeout in seconds for nat tcp flows in half closed state. Allowed values are 1-3600. Field deprecated in 18.2.5. Field introduced in 18.2.5.
   * @return natFlowTcpHalfClosedTimeout
  **/
  @ApiModelProperty(value = "Idle timeout in seconds for nat tcp flows in half closed state. Allowed values are 1-3600. Field deprecated in 18.2.5. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getNatFlowTcpHalfClosedTimeout() {
    return natFlowTcpHalfClosedTimeout;
  }
    
  @VsoMethod
  public void setNatFlowTcpHalfClosedTimeout(Integer natFlowTcpHalfClosedTimeout) {
    this.natFlowTcpHalfClosedTimeout = natFlowTcpHalfClosedTimeout;
  }

  
  /**
   * Idle timeout in seconds for nat tcp flows in handshake state. Allowed values are 1-3600. Field deprecated in 18.2.5. Field introduced in 18.2.5.
   * @return natFlowTcpHandshakeTimeout
  **/
  @ApiModelProperty(value = "Idle timeout in seconds for nat tcp flows in handshake state. Allowed values are 1-3600. Field deprecated in 18.2.5. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getNatFlowTcpHandshakeTimeout() {
    return natFlowTcpHandshakeTimeout;
  }
    
  @VsoMethod
  public void setNatFlowTcpHandshakeTimeout(Integer natFlowTcpHandshakeTimeout) {
    this.natFlowTcpHandshakeTimeout = natFlowTcpHandshakeTimeout;
  }

  
  /**
   * Idle timeout in seconds for nat udp flows in noresponse state. Allowed values are 1-3600. Field deprecated in 18.2.5. Field introduced in 18.2.5.
   * @return natFlowUdpNoresponseTimeout
  **/
  @ApiModelProperty(value = "Idle timeout in seconds for nat udp flows in noresponse state. Allowed values are 1-3600. Field deprecated in 18.2.5. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getNatFlowUdpNoresponseTimeout() {
    return natFlowUdpNoresponseTimeout;
  }
    
  @VsoMethod
  public void setNatFlowUdpNoresponseTimeout(Integer natFlowUdpNoresponseTimeout) {
    this.natFlowUdpNoresponseTimeout = natFlowUdpNoresponseTimeout;
  }

  
  /**
   * Idle timeout in seconds for nat udp flows in response state. Allowed values are 1-3600. Field deprecated in 18.2.5. Field introduced in 18.2.5.
   * @return natFlowUdpResponseTimeout
  **/
  @ApiModelProperty(value = "Idle timeout in seconds for nat udp flows in response state. Allowed values are 1-3600. Field deprecated in 18.2.5. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getNatFlowUdpResponseTimeout() {
    return natFlowUdpResponseTimeout;
  }
    
  @VsoMethod
  public void setNatFlowUdpResponseTimeout(Integer natFlowUdpResponseTimeout) {
    this.natFlowUdpResponseTimeout = natFlowUdpResponseTimeout;
  }

  
  /**
   * This setting limits the number of non-significant logs generated per second per core on this SE. Default is 100 logs per second. Set it to zero (0) to disable throttling. Field introduced in 17.1.3.
   * @return nonSignificantLogThrottle
  **/
  @ApiModelProperty(value = "This setting limits the number of non-significant logs generated per second per core on this SE. Default is 100 logs per second. Set it to zero (0) to disable throttling. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Integer getNonSignificantLogThrottle() {
    return nonSignificantLogThrottle;
  }
    
  @VsoMethod
  public void setNonSignificantLogThrottle(Integer nonSignificantLogThrottle) {
    this.nonSignificantLogThrottle = nonSignificantLogThrottle;
  }

  
  /**
   * Number of dispatcher cores (0,1,2,4,8 or 16). If set to 0, then number of dispatcher cores is deduced automatically.Requires SE Reboot. Allowed values are 0,1,2,4,8,16. Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * @return numDispatcherCores
  **/
  @ApiModelProperty(value = "Number of dispatcher cores (0,1,2,4,8 or 16). If set to 0, then number of dispatcher cores is deduced automatically.Requires SE Reboot. Allowed values are 0,1,2,4,8,16. Field introduced in 17.2.12, 18.1.3, 18.2.1.")


 
  @VsoMethod  
  public Integer getNumDispatcherCores() {
    return numDispatcherCores;
  }
    
  @VsoMethod
  public void setNumDispatcherCores(Integer numDispatcherCores) {
    this.numDispatcherCores = numDispatcherCores;
  }

  
  /**
   * Number of changes in num flow cores sum to ignore.
   * @return numFlowCoresSumChangesToIgnore
  **/
  @ApiModelProperty(value = "Number of changes in num flow cores sum to ignore.")


 
  @VsoMethod  
  public Integer getNumFlowCoresSumChangesToIgnore() {
    return numFlowCoresSumChangesToIgnore;
  }
    
  @VsoMethod
  public void setNumFlowCoresSumChangesToIgnore(Integer numFlowCoresSumChangesToIgnore) {
    this.numFlowCoresSumChangesToIgnore = numFlowCoresSumChangesToIgnore;
  }

  
  /**
   *  Field deprecated in 17.1.1.
   * @return openstackAvailabilityZone
  **/
  @ApiModelProperty(value = " Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public String getOpenstackAvailabilityZone() {
    return openstackAvailabilityZone;
  }
    
  @VsoMethod
  public void setOpenstackAvailabilityZone(String openstackAvailabilityZone) {
    this.openstackAvailabilityZone = openstackAvailabilityZone;
  }

  
  public ServiceEngineGroup addOpenstackAvailabilityZonesItem(String openstackAvailabilityZonesItem) {
    if (this.openstackAvailabilityZones == null) {
      this.openstackAvailabilityZones = new ArrayList<String>();
    }
    this.openstackAvailabilityZones.add(openstackAvailabilityZonesItem);
    return this;
  }
  
  /**
   *  Field introduced in 17.1.1.
   * @return openstackAvailabilityZones
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")


 
  @VsoMethod  
  public List<String> getOpenstackAvailabilityZones() {
    return openstackAvailabilityZones;
  }
    
  @VsoMethod
  public void setOpenstackAvailabilityZones(List<String> openstackAvailabilityZones) {
    this.openstackAvailabilityZones = openstackAvailabilityZones;
  }

  
  /**
   * Avi Management network name.
   * @return openstackMgmtNetworkName
  **/
  @ApiModelProperty(value = "Avi Management network name.")


 
  @VsoMethod  
  public String getOpenstackMgmtNetworkName() {
    return openstackMgmtNetworkName;
  }
    
  @VsoMethod
  public void setOpenstackMgmtNetworkName(String openstackMgmtNetworkName) {
    this.openstackMgmtNetworkName = openstackMgmtNetworkName;
  }

  
  /**
   * Management network UUID.
   * @return openstackMgmtNetworkUuid
  **/
  @ApiModelProperty(value = "Management network UUID.")


 
  @VsoMethod  
  public String getOpenstackMgmtNetworkUuid() {
    return openstackMgmtNetworkUuid;
  }
    
  @VsoMethod
  public void setOpenstackMgmtNetworkUuid(String openstackMgmtNetworkUuid) {
    this.openstackMgmtNetworkUuid = openstackMgmtNetworkUuid;
  }

  
  /**
   * Amount of extra memory to be reserved for use by the Operating System on a Service Engine.
   * @return osReservedMemory
  **/
  @ApiModelProperty(value = "Amount of extra memory to be reserved for use by the Operating System on a Service Engine.")


 
  @VsoMethod  
  public Integer getOsReservedMemory() {
    return osReservedMemory;
  }
    
  @VsoMethod
  public void setOsReservedMemory(Integer osReservedMemory) {
    this.osReservedMemory = osReservedMemory;
  }

  
  /**
   * Determines the PCAP transmit mode of operation. Requires SE Reboot. Enum options - PCAP_TX_AUTO, PCAP_TX_SOCKET, PCAP_TX_RING. Field introduced in 18.2.8, 20.1.1.
   * @return pcapTxMode
  **/
  @ApiModelProperty(value = "Determines the PCAP transmit mode of operation. Requires SE Reboot. Enum options - PCAP_TX_AUTO, PCAP_TX_SOCKET, PCAP_TX_RING. Field introduced in 18.2.8, 20.1.1.")


 
  @VsoMethod  
  public String getPcapTxMode() {
    return pcapTxMode;
  }
    
  @VsoMethod
  public void setPcapTxMode(String pcapTxMode) {
    this.pcapTxMode = pcapTxMode;
  }

  
  /**
   * Per-app SE mode is designed for deploying dedicated load balancers per app (VS). In this mode, each SE is limited to a max of 2 VSs. vCPUs in per-app SEs count towards licensing usage at 25% rate.
   * @return perApp
  **/
  @ApiModelProperty(value = "Per-app SE mode is designed for deploying dedicated load balancers per app (VS). In this mode, each SE is limited to a max of 2 VSs. vCPUs in per-app SEs count towards licensing usage at 25% rate.")


 
  @VsoMethod  
  public Boolean isPerApp() {
    return perApp;
  }
    
  @VsoMethod
  public void setPerApp(Boolean perApp) {
    this.perApp = perApp;
  }

  
  /**
   * If placement mode is 'Auto', Virtual Services are automatically placed on Service Engines. Enum options - PLACEMENT_MODE_AUTO.
   * @return placementMode
  **/
  @ApiModelProperty(value = "If placement mode is 'Auto', Virtual Services are automatically placed on Service Engines. Enum options - PLACEMENT_MODE_AUTO.")


 
  @VsoMethod  
  public String getPlacementMode() {
    return placementMode;
  }
    
  @VsoMethod
  public void setPlacementMode(String placementMode) {
    this.placementMode = placementMode;
  }

  
  /**
   * Enable or disable real time SE metrics.
   * @return realtimeSeMetrics
  **/
  @ApiModelProperty(value = "Enable or disable real time SE metrics.")

  @Valid

 
  @VsoMethod  
  public MetricsRealTimeUpdate getRealtimeSeMetrics() {
    return realtimeSeMetrics;
  }
    
  @VsoMethod
  public void setRealtimeSeMetrics(MetricsRealTimeUpdate realtimeSeMetrics) {
    this.realtimeSeMetrics = realtimeSeMetrics;
  }

  
  /**
   * Reboot the VM or host on kernel panic. Field introduced in 18.2.5.
   * @return rebootOnPanic
  **/
  @ApiModelProperty(value = "Reboot the VM or host on kernel panic. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isRebootOnPanic() {
    return rebootOnPanic;
  }
    
  @VsoMethod
  public void setRebootOnPanic(Boolean rebootOnPanic) {
    this.rebootOnPanic = rebootOnPanic;
  }

  
  /**
   * Reboot the system if the SE is stopped. Field deprecated in 18.2.5.
   * @return rebootOnStop
  **/
  @ApiModelProperty(value = "Reboot the system if the SE is stopped. Field deprecated in 18.2.5.")


 
  @VsoMethod  
  public Boolean isRebootOnStop() {
    return rebootOnStop;
  }
    
  @VsoMethod
  public void setRebootOnStop(Boolean rebootOnStop) {
    this.rebootOnStop = rebootOnStop;
  }

  
  /**
   * Select the SE bandwidth for the bandwidth license. Enum options - SE_BANDWIDTH_UNLIMITED, SE_BANDWIDTH_25M, SE_BANDWIDTH_200M, SE_BANDWIDTH_1000M, SE_BANDWIDTH_10000M. Field introduced in 17.2.5.
   * @return seBandwidthType
  **/
  @ApiModelProperty(value = "Select the SE bandwidth for the bandwidth license. Enum options - SE_BANDWIDTH_UNLIMITED, SE_BANDWIDTH_25M, SE_BANDWIDTH_200M, SE_BANDWIDTH_1000M, SE_BANDWIDTH_10000M. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getSeBandwidthType() {
    return seBandwidthType;
  }
    
  @VsoMethod
  public void setSeBandwidthType(String seBandwidthType) {
    this.seBandwidthType = seBandwidthType;
  }

  
  /**
   * Duration to preserve unused Service Engine virtual machines before deleting them. If traffic to a Virtual Service were to spike up abruptly, this SE would still be available to be utilized again rather than creating a new SE. If this value is set to 0, Controller will never delete any SEs and administrator has to manually cleanup unused SEs. Allowed values are 0-525600.
   * @return seDeprovisionDelay
  **/
  @ApiModelProperty(value = "Duration to preserve unused Service Engine virtual machines before deleting them. If traffic to a Virtual Service were to spike up abruptly, this SE would still be available to be utilized again rather than creating a new SE. If this value is set to 0, Controller will never delete any SEs and administrator has to manually cleanup unused SEs. Allowed values are 0-525600.")


 
  @VsoMethod  
  public Integer getSeDeprovisionDelay() {
    return seDeprovisionDelay;
  }
    
  @VsoMethod
  public void setSeDeprovisionDelay(Integer seDeprovisionDelay) {
    this.seDeprovisionDelay = seDeprovisionDelay;
  }

  
  /**
   * Placeholder for description of property se_dos_profile of obj type ServiceEngineGroup field type str  type object
   * @return seDosProfile
  **/
  @ApiModelProperty(value = "Placeholder for description of property se_dos_profile of obj type ServiceEngineGroup field type str  type object")

  @Valid

 
  @VsoMethod  
  public DosThresholdProfile getSeDosProfile() {
    return seDosProfile;
  }
    
  @VsoMethod
  public void setSeDosProfile(DosThresholdProfile seDosProfile) {
    this.seDosProfile = seDosProfile;
  }

  
  /**
   * The highest supported SE-SE Heartbeat protocol version. This version is reported by Secondary SE to Primary SE in Heartbeat response messages. Allowed values are 1-2. Field introduced in 20.1.1.
   * @return seDpMaxHbVersion
  **/
  @ApiModelProperty(value = "The highest supported SE-SE Heartbeat protocol version. This version is reported by Secondary SE to Primary SE in Heartbeat response messages. Allowed values are 1-2. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getSeDpMaxHbVersion() {
    return seDpMaxHbVersion;
  }
    
  @VsoMethod
  public void setSeDpMaxHbVersion(Integer seDpMaxHbVersion) {
    this.seDpMaxHbVersion = seDpMaxHbVersion;
  }

  
  /**
   * Time (in seconds) service engine waits for after generating a Vnic transmit queue stall event before resetting theNIC. Field introduced in 18.2.5.
   * @return seDpVnicQueueStallEventSleep
  **/
  @ApiModelProperty(value = "Time (in seconds) service engine waits for after generating a Vnic transmit queue stall event before resetting theNIC. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getSeDpVnicQueueStallEventSleep() {
    return seDpVnicQueueStallEventSleep;
  }
    
  @VsoMethod
  public void setSeDpVnicQueueStallEventSleep(Integer seDpVnicQueueStallEventSleep) {
    this.seDpVnicQueueStallEventSleep = seDpVnicQueueStallEventSleep;
  }

  
  /**
   * Number of consecutive transmit failures to look for before generating a Vnic transmit queue stall event. Field introduced in 18.2.5.
   * @return seDpVnicQueueStallThreshold
  **/
  @ApiModelProperty(value = "Number of consecutive transmit failures to look for before generating a Vnic transmit queue stall event. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getSeDpVnicQueueStallThreshold() {
    return seDpVnicQueueStallThreshold;
  }
    
  @VsoMethod
  public void setSeDpVnicQueueStallThreshold(Integer seDpVnicQueueStallThreshold) {
    this.seDpVnicQueueStallThreshold = seDpVnicQueueStallThreshold;
  }

  
  /**
   * Time (in milliseconds) to wait for network/NIC recovery on detecting a transmit queue stall after which service engine resets the NIC. Field introduced in 18.2.5.
   * @return seDpVnicQueueStallTimeout
  **/
  @ApiModelProperty(value = "Time (in milliseconds) to wait for network/NIC recovery on detecting a transmit queue stall after which service engine resets the NIC. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getSeDpVnicQueueStallTimeout() {
    return seDpVnicQueueStallTimeout;
  }
    
  @VsoMethod
  public void setSeDpVnicQueueStallTimeout(Integer seDpVnicQueueStallTimeout) {
    this.seDpVnicQueueStallTimeout = seDpVnicQueueStallTimeout;
  }

  
  /**
   * Number of consecutive transmit queue stall events in se_dp_vnic_stall_se_restart_window to look for before restarting SE. Field introduced in 18.2.5.
   * @return seDpVnicRestartOnQueueStallCount
  **/
  @ApiModelProperty(value = "Number of consecutive transmit queue stall events in se_dp_vnic_stall_se_restart_window to look for before restarting SE. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getSeDpVnicRestartOnQueueStallCount() {
    return seDpVnicRestartOnQueueStallCount;
  }
    
  @VsoMethod
  public void setSeDpVnicRestartOnQueueStallCount(Integer seDpVnicRestartOnQueueStallCount) {
    this.seDpVnicRestartOnQueueStallCount = seDpVnicRestartOnQueueStallCount;
  }

  
  /**
   * Window of time (in seconds) during which se_dp_vnic_restart_on_queue_stall_count number of consecutive stalls results in a SE restart. Field introduced in 18.2.5.
   * @return seDpVnicStallSeRestartWindow
  **/
  @ApiModelProperty(value = "Window of time (in seconds) during which se_dp_vnic_restart_on_queue_stall_count number of consecutive stalls results in a SE restart. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getSeDpVnicStallSeRestartWindow() {
    return seDpVnicStallSeRestartWindow;
  }
    
  @VsoMethod
  public void setSeDpVnicStallSeRestartWindow(Integer seDpVnicStallSeRestartWindow) {
    this.seDpVnicStallSeRestartWindow = seDpVnicStallSeRestartWindow;
  }

  
  /**
   * Determines if DPDK pool mode driver should be used or not   0  Automatically determine based on hypervisor/NIC type 1  Unconditionally use DPDK poll mode driver 2  Don't use DPDK poll mode driver.Requires SE Reboot. Allowed values are 0-2. Field introduced in 18.1.3.
   * @return seDpdkPmd
  **/
  @ApiModelProperty(value = "Determines if DPDK pool mode driver should be used or not   0  Automatically determine based on hypervisor/NIC type 1  Unconditionally use DPDK poll mode driver 2  Don't use DPDK poll mode driver.Requires SE Reboot. Allowed values are 0-2. Field introduced in 18.1.3.")


 
  @VsoMethod  
  public Integer getSeDpdkPmd() {
    return seDpdkPmd;
  }
    
  @VsoMethod
  public void setSeDpdkPmd(Integer seDpdkPmd) {
    this.seDpdkPmd = seDpdkPmd;
  }

  
  /**
   * Flow probe retry count if no replies are received.Requires SE Reboot. Allowed values are 0-5. Field introduced in 18.1.4, 18.2.1.
   * @return seFlowProbeRetries
  **/
  @ApiModelProperty(value = "Flow probe retry count if no replies are received.Requires SE Reboot. Allowed values are 0-5. Field introduced in 18.1.4, 18.2.1.")


 
  @VsoMethod  
  public Integer getSeFlowProbeRetries() {
    return seFlowProbeRetries;
  }
    
  @VsoMethod
  public void setSeFlowProbeRetries(Integer seFlowProbeRetries) {
    this.seFlowProbeRetries = seFlowProbeRetries;
  }

  
  /**
   * Timeout in milliseconds for flow probe retries.Requires SE Reboot. Allowed values are 20-50. Field introduced in 18.2.5.
   * @return seFlowProbeRetryTimer
  **/
  @ApiModelProperty(value = "Timeout in milliseconds for flow probe retries.Requires SE Reboot. Allowed values are 20-50. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getSeFlowProbeRetryTimer() {
    return seFlowProbeRetryTimer;
  }
    
  @VsoMethod
  public void setSeFlowProbeRetryTimer(Integer seFlowProbeRetryTimer) {
    this.seFlowProbeRetryTimer = seFlowProbeRetryTimer;
  }

  
  /**
   * Timeout in milliseconds for flow probe entries. Allowed values are 10-200. Field deprecated in 18.2.5. Field introduced in 18.1.4, 18.2.1.
   * @return seFlowProbeTimer
  **/
  @ApiModelProperty(value = "Timeout in milliseconds for flow probe entries. Allowed values are 10-200. Field deprecated in 18.2.5. Field introduced in 18.1.4, 18.2.1.")


 
  @VsoMethod  
  public Integer getSeFlowProbeTimer() {
    return seFlowProbeTimer;
  }
    
  @VsoMethod
  public void setSeFlowProbeTimer(Integer seFlowProbeTimer) {
    this.seFlowProbeTimer = seFlowProbeTimer;
  }

  
  /**
   * UDP Port for SE_DP IPC in Docker bridge mode. Field deprecated in 20.1.1. Field introduced in 17.1.2.
   * @return seIpcUdpPort
  **/
  @ApiModelProperty(value = "UDP Port for SE_DP IPC in Docker bridge mode. Field deprecated in 20.1.1. Field introduced in 17.1.2.")


 
  @VsoMethod  
  public Integer getSeIpcUdpPort() {
    return seIpcUdpPort;
  }
    
  @VsoMethod
  public void setSeIpcUdpPort(Integer seIpcUdpPort) {
    this.seIpcUdpPort = seIpcUdpPort;
  }

  
  /**
   * Knob to control burst size used in polling KNI interfaces for traffic sent from KNI towards DPDK application Also controls burst size used by KNI module to read pkts punted from DPDK application towards KNI Helps minimize drops in non-VIP traffic in either pathFactor of (0-2) multiplies/divides burst size by 2^N. Allowed values are 0-2. Field introduced in 18.2.6.
   * @return seKniBurstFactor
  **/
  @ApiModelProperty(value = "Knob to control burst size used in polling KNI interfaces for traffic sent from KNI towards DPDK application Also controls burst size used by KNI module to read pkts punted from DPDK application towards KNI Helps minimize drops in non-VIP traffic in either pathFactor of (0-2) multiplies/divides burst size by 2^N. Allowed values are 0-2. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getSeKniBurstFactor() {
    return seKniBurstFactor;
  }
    
  @VsoMethod
  public void setSeKniBurstFactor(Integer seKniBurstFactor) {
    this.seKniBurstFactor = seKniBurstFactor;
  }

  
  /**
   * Enable or disable Large Receive Optimization for vnics. Requires SE Reboot. Field introduced in 18.2.5.
   * @return seLro
  **/
  @ApiModelProperty(value = "Enable or disable Large Receive Optimization for vnics. Requires SE Reboot. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isSeLro() {
    return seLro;
  }
    
  @VsoMethod
  public void setSeLro(Boolean seLro) {
    this.seLro = seLro;
  }

  
  /**
   * MTU for the VNICs of SEs in the SE group. Allowed values are 512-9000. Field introduced in 18.2.8, 20.1.1.
   * @return seMtu
  **/
  @ApiModelProperty(value = "MTU for the VNICs of SEs in the SE group. Allowed values are 512-9000. Field introduced in 18.2.8, 20.1.1.")


 
  @VsoMethod  
  public Integer getSeMtu() {
    return seMtu;
  }
    
  @VsoMethod
  public void setSeMtu(Integer seMtu) {
    this.seMtu = seMtu;
  }

  
  /**
   * Prefix to use for virtual machine name of Service Engines.
   * @return seNamePrefix
  **/
  @ApiModelProperty(value = "Prefix to use for virtual machine name of Service Engines.")


 
  @VsoMethod  
  public String getSeNamePrefix() {
    return seNamePrefix;
  }
    
  @VsoMethod
  public void setSeNamePrefix(String seNamePrefix) {
    this.seNamePrefix = seNamePrefix;
  }

  
  /**
   * Enables lookahead mode of packet receive in PCAP mode. Introduced to overcome an issue with hv_netvsc driver. Lookahead mode attempts to ensure that application and kernel's view of the receive rings are consistent. Field introduced in 18.2.3.
   * @return sePcapLookahead
  **/
  @ApiModelProperty(value = "Enables lookahead mode of packet receive in PCAP mode. Introduced to overcome an issue with hv_netvsc driver. Lookahead mode attempts to ensure that application and kernel's view of the receive rings are consistent. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isSePcapLookahead() {
    return sePcapLookahead;
  }
    
  @VsoMethod
  public void setSePcapLookahead(Boolean sePcapLookahead) {
    this.sePcapLookahead = sePcapLookahead;
  }

  
  /**
   * Max number of packets the pcap interface can hold and if the value is 0 the optimum value will be chosen. The optimum value will be chosen based on SE-memory, Cloud Type and Number of Interfaces.Requires SE Reboot. Field introduced in 18.2.5.
   * @return sePcapPktCount
  **/
  @ApiModelProperty(value = "Max number of packets the pcap interface can hold and if the value is 0 the optimum value will be chosen. The optimum value will be chosen based on SE-memory, Cloud Type and Number of Interfaces.Requires SE Reboot. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getSePcapPktCount() {
    return sePcapPktCount;
  }
    
  @VsoMethod
  public void setSePcapPktCount(Integer sePcapPktCount) {
    this.sePcapPktCount = sePcapPktCount;
  }

  
  /**
   * Max size of each packet in the pcap interface. Requires SE Reboot. Field introduced in 18.2.5.
   * @return sePcapPktSz
  **/
  @ApiModelProperty(value = "Max size of each packet in the pcap interface. Requires SE Reboot. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getSePcapPktSz() {
    return sePcapPktSz;
  }
    
  @VsoMethod
  public void setSePcapPktSz(Integer sePcapPktSz) {
    this.sePcapPktSz = sePcapPktSz;
  }

  
  /**
   * Bypass the kernel's traffic control layer, to deliver packets directly to the driver. Enabling this feature results in egress packets not being captured in host tcpdump. Note   brief packet reordering or loss may occur upon toggle. Field introduced in 18.2.6.
   * @return sePcapQdiscBypass
  **/
  @ApiModelProperty(value = "Bypass the kernel's traffic control layer, to deliver packets directly to the driver. Enabling this feature results in egress packets not being captured in host tcpdump. Note   brief packet reordering or loss may occur upon toggle. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Boolean isSePcapQdiscBypass() {
    return sePcapQdiscBypass;
  }
    
  @VsoMethod
  public void setSePcapQdiscBypass(Boolean sePcapQdiscBypass) {
    this.sePcapQdiscBypass = sePcapQdiscBypass;
  }

  
  /**
   * Frequency in seconds at which periodically a PCAP reinit check is triggered. May be used in conjunction with the configuration pcap_reinit_threshold. (Valid range   15 mins - 12 hours, 0 - disables). Allowed values are 900-43200. Special values are 0- 'disable'. Field introduced in 17.2.13, 18.1.3, 18.2.1.
   * @return sePcapReinitFrequency
  **/
  @ApiModelProperty(value = "Frequency in seconds at which periodically a PCAP reinit check is triggered. May be used in conjunction with the configuration pcap_reinit_threshold. (Valid range   15 mins - 12 hours, 0 - disables). Allowed values are 900-43200. Special values are 0- 'disable'. Field introduced in 17.2.13, 18.1.3, 18.2.1.")


 
  @VsoMethod  
  public Integer getSePcapReinitFrequency() {
    return sePcapReinitFrequency;
  }
    
  @VsoMethod
  public void setSePcapReinitFrequency(Integer sePcapReinitFrequency) {
    this.sePcapReinitFrequency = sePcapReinitFrequency;
  }

  
  /**
   * Threshold for input packet receive errors in PCAP mode exceeding which a PCAP reinit is triggered. If not set, an unconditional reinit is performed. This value is checked every pcap_reinit_frequency interval. Field introduced in 17.2.13, 18.1.3, 18.2.1.
   * @return sePcapReinitThreshold
  **/
  @ApiModelProperty(value = "Threshold for input packet receive errors in PCAP mode exceeding which a PCAP reinit is triggered. If not set, an unconditional reinit is performed. This value is checked every pcap_reinit_frequency interval. Field introduced in 17.2.13, 18.1.3, 18.2.1.")


 
  @VsoMethod  
  public Integer getSePcapReinitThreshold() {
    return sePcapReinitThreshold;
  }
    
  @VsoMethod
  public void setSePcapReinitThreshold(Integer sePcapReinitThreshold) {
    this.sePcapReinitThreshold = sePcapReinitThreshold;
  }

  
  /**
   * TCP port on SE where echo service will be run. Field introduced in 17.2.2.
   * @return seProbePort
  **/
  @ApiModelProperty(value = "TCP port on SE where echo service will be run. Field introduced in 17.2.2.")


 
  @VsoMethod  
  public Integer getSeProbePort() {
    return seProbePort;
  }
    
  @VsoMethod
  public void setSeProbePort(Integer seProbePort) {
    this.seProbePort = seProbePort;
  }

  
  /**
   * UDP Port for punted packets in Docker bridge mode. Field deprecated in 20.1.1. Field introduced in 17.1.2.
   * @return seRemotePuntUdpPort
  **/
  @ApiModelProperty(value = "UDP Port for punted packets in Docker bridge mode. Field deprecated in 20.1.1. Field introduced in 17.1.2.")


 
  @VsoMethod  
  public Integer getSeRemotePuntUdpPort() {
    return seRemotePuntUdpPort;
  }
    
  @VsoMethod
  public void setSeRemotePuntUdpPort(Integer seRemotePuntUdpPort) {
    this.seRemotePuntUdpPort = seRemotePuntUdpPort;
  }

  
  /**
   * Rate limiter properties. Field introduced in 20.1.1.
   * @return seRlProp
  **/
  @ApiModelProperty(value = "Rate limiter properties. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public RateLimiterProperties getSeRlProp() {
    return seRlProp;
  }
    
  @VsoMethod
  public void setSeRlProp(RateLimiterProperties seRlProp) {
    this.seRlProp = seRlProp;
  }

  
  /**
   * Enable routing via Service Engine Datapath. When disabled, routing is done by the Linux kernel. IP Routing needs to be enabled in Service Engine Group for SE Routing to be effective. Field deprecated in 18.2.5. Field introduced in 18.2.3.
   * @return seRouting
  **/
  @ApiModelProperty(value = "Enable routing via Service Engine Datapath. When disabled, routing is done by the Linux kernel. IP Routing needs to be enabled in Service Engine Group for SE Routing to be effective. Field deprecated in 18.2.5. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isSeRouting() {
    return seRouting;
  }
    
  @VsoMethod
  public void setSeRouting(Boolean seRouting) {
    this.seRouting = seRouting;
  }

  
  /**
   * Minimum time to wait on server between taking sampleswhen sampling the navigation timing data from the end user client. Field introduced in 18.2.6.
   * @return seRumSamplingNavInterval
  **/
  @ApiModelProperty(value = "Minimum time to wait on server between taking sampleswhen sampling the navigation timing data from the end user client. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getSeRumSamplingNavInterval() {
    return seRumSamplingNavInterval;
  }
    
  @VsoMethod
  public void setSeRumSamplingNavInterval(Integer seRumSamplingNavInterval) {
    this.seRumSamplingNavInterval = seRumSamplingNavInterval;
  }

  
  /**
   * Percentage of navigation timing data from the end user client, used for sampling to get client insights. Field introduced in 18.2.6.
   * @return seRumSamplingNavPercent
  **/
  @ApiModelProperty(value = "Percentage of navigation timing data from the end user client, used for sampling to get client insights. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getSeRumSamplingNavPercent() {
    return seRumSamplingNavPercent;
  }
    
  @VsoMethod
  public void setSeRumSamplingNavPercent(Integer seRumSamplingNavPercent) {
    this.seRumSamplingNavPercent = seRumSamplingNavPercent;
  }

  
  /**
   * Minimum time to wait on server between taking sampleswhen sampling the resource timing data from the end user client. Field introduced in 18.2.6.
   * @return seRumSamplingResInterval
  **/
  @ApiModelProperty(value = "Minimum time to wait on server between taking sampleswhen sampling the resource timing data from the end user client. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getSeRumSamplingResInterval() {
    return seRumSamplingResInterval;
  }
    
  @VsoMethod
  public void setSeRumSamplingResInterval(Integer seRumSamplingResInterval) {
    this.seRumSamplingResInterval = seRumSamplingResInterval;
  }

  
  /**
   * Percentage of resource timing data from the end user client used for sampling to get client insight. Field introduced in 18.2.6.
   * @return seRumSamplingResPercent
  **/
  @ApiModelProperty(value = "Percentage of resource timing data from the end user client used for sampling to get client insight. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getSeRumSamplingResPercent() {
    return seRumSamplingResPercent;
  }
    
  @VsoMethod
  public void setSeRumSamplingResPercent(Integer seRumSamplingResPercent) {
    this.seRumSamplingResPercent = seRumSamplingResPercent;
  }

  
  /**
   * Sideband traffic will be handled by a dedicated core.Requires SE Reboot. Field introduced in 16.5.2, 17.1.9, 17.2.3.
   * @return seSbDedicatedCore
  **/
  @ApiModelProperty(value = "Sideband traffic will be handled by a dedicated core.Requires SE Reboot. Field introduced in 16.5.2, 17.1.9, 17.2.3.")


 
  @VsoMethod  
  public Boolean isSeSbDedicatedCore() {
    return seSbDedicatedCore;
  }
    
  @VsoMethod
  public void setSeSbDedicatedCore(Boolean seSbDedicatedCore) {
    this.seSbDedicatedCore = seSbDedicatedCore;
  }

  
  /**
   * Number of Sideband threads per SE.Requires SE Reboot. Allowed values are 1-128. Field introduced in 16.5.2, 17.1.9, 17.2.3.
   * @return seSbThreads
  **/
  @ApiModelProperty(value = "Number of Sideband threads per SE.Requires SE Reboot. Allowed values are 1-128. Field introduced in 16.5.2, 17.1.9, 17.2.3.")


 
  @VsoMethod  
  public Integer getSeSbThreads() {
    return seSbThreads;
  }
    
  @VsoMethod
  public void setSeSbThreads(Integer seSbThreads) {
    this.seSbThreads = seSbThreads;
  }

  
  /**
   * Multiplier for SE threads based on vCPU. Allowed values are 1-10.
   * @return seThreadMultiplier
  **/
  @ApiModelProperty(value = "Multiplier for SE threads based on vCPU. Allowed values are 1-10.")


 
  @VsoMethod  
  public Integer getSeThreadMultiplier() {
    return seThreadMultiplier;
  }
    
  @VsoMethod
  public void setSeThreadMultiplier(Integer seThreadMultiplier) {
    this.seThreadMultiplier = seThreadMultiplier;
  }

  
  /**
   * Traceroute port range. Field introduced in 17.2.8.
   * @return seTracertPortRange
  **/
  @ApiModelProperty(value = "Traceroute port range. Field introduced in 17.2.8.")

  @Valid

 
  @VsoMethod  
  public PortRange getSeTracertPortRange() {
    return seTracertPortRange;
  }
    
  @VsoMethod
  public void setSeTracertPortRange(PortRange seTracertPortRange) {
    this.seTracertPortRange = seTracertPortRange;
  }

  
  /**
   * Determines if DSR from secondary SE is active or not  0  Automatically determine based on hypervisor type. 1  Disable DSR unconditionally. 2  Enable DSR unconditionally. Allowed values are 0-2. Field introduced in 17.1.1.
   * @return seTunnelMode
  **/
  @ApiModelProperty(value = "Determines if DSR from secondary SE is active or not  0  Automatically determine based on hypervisor type. 1  Disable DSR unconditionally. 2  Enable DSR unconditionally. Allowed values are 0-2. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getSeTunnelMode() {
    return seTunnelMode;
  }
    
  @VsoMethod
  public void setSeTunnelMode(Integer seTunnelMode) {
    this.seTunnelMode = seTunnelMode;
  }

  
  /**
   * UDP Port for tunneled packets from secondary to primary SE in Docker bridge mode.Requires SE Reboot. Field introduced in 17.1.3.
   * @return seTunnelUdpPort
  **/
  @ApiModelProperty(value = "UDP Port for tunneled packets from secondary to primary SE in Docker bridge mode.Requires SE Reboot. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Integer getSeTunnelUdpPort() {
    return seTunnelUdpPort;
  }
    
  @VsoMethod
  public void setSeTunnelUdpPort(Integer seTunnelUdpPort) {
    this.seTunnelUdpPort = seTunnelUdpPort;
  }

  
  /**
   * Number of packets to batch for transmit to the nic. Requires SE Reboot. Field introduced in 18.2.5.
   * @return seTxBatchSize
  **/
  @ApiModelProperty(value = "Number of packets to batch for transmit to the nic. Requires SE Reboot. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getSeTxBatchSize() {
    return seTxBatchSize;
  }
    
  @VsoMethod
  public void setSeTxBatchSize(Integer seTxBatchSize) {
    this.seTxBatchSize = seTxBatchSize;
  }

  
  /**
   * Determines if SE-SE IPC messages are encapsulated in a UDP header  0  Automatically determine based on hypervisor type. 1  Use UDP encap unconditionally.Requires SE Reboot. Allowed values are 0-1. Field introduced in 17.1.2.
   * @return seUdpEncapIpc
  **/
  @ApiModelProperty(value = "Determines if SE-SE IPC messages are encapsulated in a UDP header  0  Automatically determine based on hypervisor type. 1  Use UDP encap unconditionally.Requires SE Reboot. Allowed values are 0-1. Field introduced in 17.1.2.")


 
  @VsoMethod  
  public Integer getSeUdpEncapIpc() {
    return seUdpEncapIpc;
  }
    
  @VsoMethod
  public void setSeUdpEncapIpc(Integer seUdpEncapIpc) {
    this.seUdpEncapIpc = seUdpEncapIpc;
  }

  
  /**
   * Determines if DPDK library should be used or not   0  Automatically determine based on hypervisor type 1  Use DPDK if PCAP is not enabled 2  Don't use DPDK. Allowed values are 0-2. Field introduced in 18.1.3.
   * @return seUseDpdk
  **/
  @ApiModelProperty(value = "Determines if DPDK library should be used or not   0  Automatically determine based on hypervisor type 1  Use DPDK if PCAP is not enabled 2  Don't use DPDK. Allowed values are 0-2. Field introduced in 18.1.3.")


 
  @VsoMethod  
  public Integer getSeUseDpdk() {
    return seUseDpdk;
  }
    
  @VsoMethod
  public void setSeUseDpdk(Integer seUseDpdk) {
    this.seUseDpdk = seUseDpdk;
  }

  
  /**
   * Maximum number of aggregated vs heartbeat packets to send in a batch. Allowed values are 1-256. Field introduced in 17.1.1.
   * @return seVsHbMaxPktsInBatch
  **/
  @ApiModelProperty(value = "Maximum number of aggregated vs heartbeat packets to send in a batch. Allowed values are 1-256. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getSeVsHbMaxPktsInBatch() {
    return seVsHbMaxPktsInBatch;
  }
    
  @VsoMethod
  public void setSeVsHbMaxPktsInBatch(Integer seVsHbMaxPktsInBatch) {
    this.seVsHbMaxPktsInBatch = seVsHbMaxPktsInBatch;
  }

  
  /**
   * Maximum number of virtualservices for which heartbeat messages are aggregated in one packet. Allowed values are 1-1024. Field introduced in 17.1.1.
   * @return seVsHbMaxVsInPkt
  **/
  @ApiModelProperty(value = "Maximum number of virtualservices for which heartbeat messages are aggregated in one packet. Allowed values are 1-1024. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getSeVsHbMaxVsInPkt() {
    return seVsHbMaxVsInPkt;
  }
    
  @VsoMethod
  public void setSeVsHbMaxVsInPkt(Integer seVsHbMaxVsInPkt) {
    this.seVsHbMaxVsInPkt = seVsHbMaxVsInPkt;
  }

  
  /**
   * Enable SEs to elect a primary amongst themselves in the absence of a connectivity to controller. Field introduced in 18.1.2.
   * @return selfSeElection
  **/
  @ApiModelProperty(value = "Enable SEs to elect a primary amongst themselves in the absence of a connectivity to controller. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Boolean isSelfSeElection() {
    return selfSeElection;
  }
    
  @VsoMethod
  public void setSelfSeElection(Boolean selfSeElection) {
    this.selfSeElection = selfSeElection;
  }

  
  public ServiceEngineGroup addServiceIp6SubnetsItem(IpAddrPrefix serviceIp6SubnetsItem) {
    if (this.serviceIp6Subnets == null) {
      this.serviceIp6Subnets = new ArrayList<IpAddrPrefix>();
    }
    this.serviceIp6Subnets.add(serviceIp6SubnetsItem);
    return this;
  }
  
  /**
   * IPv6 Subnets assigned to the SE group. Required for VS group placement. Field introduced in 18.1.1.
   * @return serviceIp6Subnets
  **/
  @ApiModelProperty(value = "IPv6 Subnets assigned to the SE group. Required for VS group placement. Field introduced in 18.1.1.")

  @Valid

 
  @VsoMethod  
  public List<IpAddrPrefix> getServiceIp6Subnets() {
    return serviceIp6Subnets;
  }
    
  @VsoMethod
  public void setServiceIp6Subnets(List<IpAddrPrefix> serviceIp6Subnets) {
    this.serviceIp6Subnets = serviceIp6Subnets;
  }

  
  public ServiceEngineGroup addServiceIpSubnetsItem(IpAddrPrefix serviceIpSubnetsItem) {
    if (this.serviceIpSubnets == null) {
      this.serviceIpSubnets = new ArrayList<IpAddrPrefix>();
    }
    this.serviceIpSubnets.add(serviceIpSubnetsItem);
    return this;
  }
  
  /**
   * Subnets assigned to the SE group. Required for VS group placement. Field introduced in 17.1.1.
   * @return serviceIpSubnets
  **/
  @ApiModelProperty(value = "Subnets assigned to the SE group. Required for VS group placement. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<IpAddrPrefix> getServiceIpSubnets() {
    return serviceIpSubnets;
  }
    
  @VsoMethod
  public void setServiceIpSubnets(List<IpAddrPrefix> serviceIpSubnets) {
    this.serviceIpSubnets = serviceIpSubnets;
  }

  
  /**
   * Minimum required shared memory to apply any configuration. Allowed values are 0-100. Field introduced in 18.1.2.
   * @return shmMinimumConfigMemory
  **/
  @ApiModelProperty(value = "Minimum required shared memory to apply any configuration. Allowed values are 0-100. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Integer getShmMinimumConfigMemory() {
    return shmMinimumConfigMemory;
  }
    
  @VsoMethod
  public void setShmMinimumConfigMemory(Integer shmMinimumConfigMemory) {
    this.shmMinimumConfigMemory = shmMinimumConfigMemory;
  }

  
  /**
   * This setting limits the number of significant logs generated per second per core on this SE. Default is 100 logs per second. Set it to zero (0) to disable throttling. Field introduced in 17.1.3.
   * @return significantLogThrottle
  **/
  @ApiModelProperty(value = "This setting limits the number of significant logs generated per second per core on this SE. Default is 100 logs per second. Set it to zero (0) to disable throttling. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Integer getSignificantLogThrottle() {
    return significantLogThrottle;
  }
    
  @VsoMethod
  public void setSignificantLogThrottle(Integer significantLogThrottle) {
    this.significantLogThrottle = significantLogThrottle;
  }

  
  /**
   * (Beta) Preprocess SSL Client Hello for SNI hostname extension.If set to True, this will apply SNI child's SSL protocol(s), if they are different from SNI Parent's allowed SSL protocol(s). Field introduced in 17.2.12, 18.1.3.
   * @return sslPreprocessSniHostname
  **/
  @ApiModelProperty(value = "(Beta) Preprocess SSL Client Hello for SNI hostname extension.If set to True, this will apply SNI child's SSL protocol(s), if they are different from SNI Parent's allowed SSL protocol(s). Field introduced in 17.2.12, 18.1.3.")


 
  @VsoMethod  
  public Boolean isSslPreprocessSniHostname() {
    return sslPreprocessSniHostname;
  }
    
  @VsoMethod
  public void setSslPreprocessSniHostname(Boolean sslPreprocessSniHostname) {
    this.sslPreprocessSniHostname = sslPreprocessSniHostname;
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
   * This setting limits the number of UDF logs generated per second per core on this SE. UDF logs are generated due to the configured client log filters or the rules with logging enabled. Default is 100 logs per second. Set it to zero (0) to disable throttling. Field introduced in 17.1.3.
   * @return udfLogThrottle
  **/
  @ApiModelProperty(value = "This setting limits the number of UDF logs generated per second per core on this SE. UDF logs are generated due to the configured client log filters or the rules with logging enabled. Default is 100 logs per second. Set it to zero (0) to disable throttling. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Integer getUdfLogThrottle() {
    return udfLogThrottle;
  }
    
  @VsoMethod
  public void setUdfLogThrottle(Integer udfLogThrottle) {
    this.udfLogThrottle = udfLogThrottle;
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
   * Use Standard SKU Azure Load Balancer. By default cloud level flag is set. If not set, it inherits/uses the use_standard_alb flag from the cloud. Field introduced in 18.2.3.
   * @return useStandardAlb
  **/
  @ApiModelProperty(value = "Use Standard SKU Azure Load Balancer. By default cloud level flag is set. If not set, it inherits/uses the use_standard_alb flag from the cloud. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isUseStandardAlb() {
    return useStandardAlb;
  }
    
  @VsoMethod
  public void setUseStandardAlb(Boolean useStandardAlb) {
    this.useStandardAlb = useStandardAlb;
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
   * Placeholder for description of property vcenter_clusters of obj type ServiceEngineGroup field type str  type object
   * @return vcenterClusters
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_clusters of obj type ServiceEngineGroup field type str  type object")

  @Valid

 
  @VsoMethod  
  public VcenterClusters getVcenterClusters() {
    return vcenterClusters;
  }
    
  @VsoMethod
  public void setVcenterClusters(VcenterClusters vcenterClusters) {
    this.vcenterClusters = vcenterClusters;
  }

  
  /**
   *  Enum options - VCENTER_DATASTORE_ANY, VCENTER_DATASTORE_LOCAL, VCENTER_DATASTORE_SHARED.
   * @return vcenterDatastoreMode
  **/
  @ApiModelProperty(value = " Enum options - VCENTER_DATASTORE_ANY, VCENTER_DATASTORE_LOCAL, VCENTER_DATASTORE_SHARED.")


 
  @VsoMethod  
  public String getVcenterDatastoreMode() {
    return vcenterDatastoreMode;
  }
    
  @VsoMethod
  public void setVcenterDatastoreMode(String vcenterDatastoreMode) {
    this.vcenterDatastoreMode = vcenterDatastoreMode;
  }

  
  public ServiceEngineGroup addVcenterDatastoresItem(VcenterDatastore vcenterDatastoresItem) {
    if (this.vcenterDatastores == null) {
      this.vcenterDatastores = new ArrayList<VcenterDatastore>();
    }
    this.vcenterDatastores.add(vcenterDatastoresItem);
    return this;
  }
  
  /**
   * Placeholder for description of property vcenter_datastores of obj type ServiceEngineGroup field type str  type object
   * @return vcenterDatastores
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_datastores of obj type ServiceEngineGroup field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<VcenterDatastore> getVcenterDatastores() {
    return vcenterDatastores;
  }
    
  @VsoMethod
  public void setVcenterDatastores(List<VcenterDatastore> vcenterDatastores) {
    this.vcenterDatastores = vcenterDatastores;
  }

  
  /**
   * Placeholder for description of property vcenter_datastores_include of obj type ServiceEngineGroup field type str  type boolean
   * @return vcenterDatastoresInclude
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_datastores_include of obj type ServiceEngineGroup field type str  type boolean")


 
  @VsoMethod  
  public Boolean isVcenterDatastoresInclude() {
    return vcenterDatastoresInclude;
  }
    
  @VsoMethod
  public void setVcenterDatastoresInclude(Boolean vcenterDatastoresInclude) {
    this.vcenterDatastoresInclude = vcenterDatastoresInclude;
  }

  
  /**
   * Folder to place all the Service Engine virtual machines in vCenter.
   * @return vcenterFolder
  **/
  @ApiModelProperty(value = "Folder to place all the Service Engine virtual machines in vCenter.")


 
  @VsoMethod  
  public String getVcenterFolder() {
    return vcenterFolder;
  }
    
  @VsoMethod
  public void setVcenterFolder(String vcenterFolder) {
    this.vcenterFolder = vcenterFolder;
  }

  
  /**
   * Placeholder for description of property vcenter_hosts of obj type ServiceEngineGroup field type str  type object
   * @return vcenterHosts
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_hosts of obj type ServiceEngineGroup field type str  type object")

  @Valid

 
  @VsoMethod  
  public VcenterHosts getVcenterHosts() {
    return vcenterHosts;
  }
    
  @VsoMethod
  public void setVcenterHosts(VcenterHosts vcenterHosts) {
    this.vcenterHosts = vcenterHosts;
  }

  
  /**
   * Number of vcpus for each of the Service Engine virtual machines.
   * @return vcpusPerSe
  **/
  @ApiModelProperty(value = "Number of vcpus for each of the Service Engine virtual machines.")


 
  @VsoMethod  
  public Integer getVcpusPerSe() {
    return vcpusPerSe;
  }
    
  @VsoMethod
  public void setVcpusPerSe(Integer vcpusPerSe) {
    this.vcpusPerSe = vcpusPerSe;
  }

  
  /**
   * When vip_asg is set, Vip configuration will be managed by Avi.User will be able to configure vip_asg or Vips individually at the time of create. Field introduced in 17.2.12, 18.1.2.
   * @return vipAsg
  **/
  @ApiModelProperty(value = "When vip_asg is set, Vip configuration will be managed by Avi.User will be able to configure vip_asg or Vips individually at the time of create. Field introduced in 17.2.12, 18.1.2.")

  @Valid

 
  @VsoMethod  
  public VipAutoscaleGroup getVipAsg() {
    return vipAsg;
  }
    
  @VsoMethod
  public void setVipAsg(VipAutoscaleGroup vipAsg) {
    this.vipAsg = vipAsg;
  }

  
  /**
   * Ensure primary and secondary Service Engines are deployed on different physical hosts.
   * @return vsHostRedundancy
  **/
  @ApiModelProperty(value = "Ensure primary and secondary Service Engines are deployed on different physical hosts.")


 
  @VsoMethod  
  public Boolean isVsHostRedundancy() {
    return vsHostRedundancy;
  }
    
  @VsoMethod
  public void setVsHostRedundancy(Boolean vsHostRedundancy) {
    this.vsHostRedundancy = vsHostRedundancy;
  }

  
  /**
   * Time to wait for the scaled in SE to drain existing flows before marking the scalein done.
   * @return vsScaleinTimeout
  **/
  @ApiModelProperty(value = "Time to wait for the scaled in SE to drain existing flows before marking the scalein done.")


 
  @VsoMethod  
  public Integer getVsScaleinTimeout() {
    return vsScaleinTimeout;
  }
    
  @VsoMethod
  public void setVsScaleinTimeout(Integer vsScaleinTimeout) {
    this.vsScaleinTimeout = vsScaleinTimeout;
  }

  
  /**
   * During SE upgrade, Time to wait for the scaled-in SE to drain existing flows before marking the scalein done.
   * @return vsScaleinTimeoutForUpgrade
  **/
  @ApiModelProperty(value = "During SE upgrade, Time to wait for the scaled-in SE to drain existing flows before marking the scalein done.")


 
  @VsoMethod  
  public Integer getVsScaleinTimeoutForUpgrade() {
    return vsScaleinTimeoutForUpgrade;
  }
    
  @VsoMethod
  public void setVsScaleinTimeoutForUpgrade(Integer vsScaleinTimeoutForUpgrade) {
    this.vsScaleinTimeoutForUpgrade = vsScaleinTimeoutForUpgrade;
  }

  
  /**
   * Time to wait for the scaled out SE to become ready before marking the scaleout done.
   * @return vsScaleoutTimeout
  **/
  @ApiModelProperty(value = "Time to wait for the scaled out SE to become ready before marking the scaleout done.")


 
  @VsoMethod  
  public Integer getVsScaleoutTimeout() {
    return vsScaleoutTimeout;
  }
    
  @VsoMethod
  public void setVsScaleoutTimeout(Integer vsScaleoutTimeout) {
    this.vsScaleoutTimeout = vsScaleoutTimeout;
  }

  
  /**
   * Wait time for sending scaleout ready notification after Virtual Service is marked UP. In certain deployments, there may be an additional delay to accept traffic. For example, for BGP, some time is needed for route advertisement. Allowed values are 0-20. Field introduced in 18.1.5,18.2.1.
   * @return vsSeScaleoutAdditionalWaitTime
  **/
  @ApiModelProperty(value = "Wait time for sending scaleout ready notification after Virtual Service is marked UP. In certain deployments, there may be an additional delay to accept traffic. For example, for BGP, some time is needed for route advertisement. Allowed values are 0-20. Field introduced in 18.1.5,18.2.1.")


 
  @VsoMethod  
  public Integer getVsSeScaleoutAdditionalWaitTime() {
    return vsSeScaleoutAdditionalWaitTime;
  }
    
  @VsoMethod
  public void setVsSeScaleoutAdditionalWaitTime(Integer vsSeScaleoutAdditionalWaitTime) {
    this.vsSeScaleoutAdditionalWaitTime = vsSeScaleoutAdditionalWaitTime;
  }

  
  /**
   * Timeout in seconds for Service Engine to sendScaleout Ready notification of a Virtual Service. Allowed values are 0-90. Field introduced in 18.1.5,18.2.1.
   * @return vsSeScaleoutReadyTimeout
  **/
  @ApiModelProperty(value = "Timeout in seconds for Service Engine to sendScaleout Ready notification of a Virtual Service. Allowed values are 0-90. Field introduced in 18.1.5,18.2.1.")


 
  @VsoMethod  
  public Integer getVsSeScaleoutReadyTimeout() {
    return vsSeScaleoutReadyTimeout;
  }
    
  @VsoMethod
  public void setVsSeScaleoutReadyTimeout(Integer vsSeScaleoutReadyTimeout) {
    this.vsSeScaleoutReadyTimeout = vsSeScaleoutReadyTimeout;
  }

  
  /**
   * During SE upgrade in a legacy active/standby segroup, Time to wait for the new primary SE to accept flows before marking the switchover done. Field introduced in 17.2.13,18.1.4,18.2.1.
   * @return vsSwitchoverTimeout
  **/
  @ApiModelProperty(value = "During SE upgrade in a legacy active/standby segroup, Time to wait for the new primary SE to accept flows before marking the switchover done. Field introduced in 17.2.13,18.1.4,18.2.1.")


 
  @VsoMethod  
  public Integer getVsSwitchoverTimeout() {
    return vsSwitchoverTimeout;
  }
    
  @VsoMethod
  public void setVsSwitchoverTimeout(Integer vsSwitchoverTimeout) {
    this.vsSwitchoverTimeout = vsSwitchoverTimeout;
  }

  
  /**
   * Parameters to place Virtual Services on only a subset of the cores of an SE. Field introduced in 17.2.5.
   * @return vssPlacement
  **/
  @ApiModelProperty(value = "Parameters to place Virtual Services on only a subset of the cores of an SE. Field introduced in 17.2.5.")

  @Valid

 
  @VsoMethod  
  public VssPlacement getVssPlacement() {
    return vssPlacement;
  }
    
  @VsoMethod
  public void setVssPlacement(VssPlacement vssPlacement) {
    this.vssPlacement = vssPlacement;
  }

  
  /**
   * If set, Virtual Services will be placed on only a subset of the cores of an SE. Field introduced in 18.1.1.
   * @return vssPlacementEnabled
  **/
  @ApiModelProperty(value = "If set, Virtual Services will be placed on only a subset of the cores of an SE. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Boolean isVssPlacementEnabled() {
    return vssPlacementEnabled;
  }
    
  @VsoMethod
  public void setVssPlacementEnabled(Boolean vssPlacementEnabled) {
    this.vssPlacementEnabled = vssPlacementEnabled;
  }

  
  /**
   * Frequency with which SE publishes WAF learning. Allowed values are 1-43200. Field deprecated in 18.2.3. Field introduced in 18.1.2.
   * @return wafLearningInterval
  **/
  @ApiModelProperty(value = "Frequency with which SE publishes WAF learning. Allowed values are 1-43200. Field deprecated in 18.2.3. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Integer getWafLearningInterval() {
    return wafLearningInterval;
  }
    
  @VsoMethod
  public void setWafLearningInterval(Integer wafLearningInterval) {
    this.wafLearningInterval = wafLearningInterval;
  }

  
  /**
   * Amount of memory reserved on SE for WAF learning. This can be atmost 5% of SE memory. Field deprecated in 18.2.3. Field introduced in 18.1.2.
   * @return wafLearningMemory
  **/
  @ApiModelProperty(value = "Amount of memory reserved on SE for WAF learning. This can be atmost 5% of SE memory. Field deprecated in 18.2.3. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Integer getWafLearningMemory() {
    return wafLearningMemory;
  }
    
  @VsoMethod
  public void setWafLearningMemory(Integer wafLearningMemory) {
    this.wafLearningMemory = wafLearningMemory;
  }

  
  /**
   * Enable memory pool for WAF.Requires SE Reboot. Field introduced in 17.2.3.
   * @return wafMempool
  **/
  @ApiModelProperty(value = "Enable memory pool for WAF.Requires SE Reboot. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public Boolean isWafMempool() {
    return wafMempool;
  }
    
  @VsoMethod
  public void setWafMempool(Boolean wafMempool) {
    this.wafMempool = wafMempool;
  }

  
  /**
   * Memory pool size used for WAF.Requires SE Reboot. Field introduced in 17.2.3.
   * @return wafMempoolSize
  **/
  @ApiModelProperty(value = "Memory pool size used for WAF.Requires SE Reboot. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public Integer getWafMempoolSize() {
    return wafMempoolSize;
  }
    
  @VsoMethod
  public void setWafMempoolSize(Integer wafMempoolSize) {
    this.wafMempoolSize = wafMempoolSize;
  }

  
  public String getObjectID() {
		return "ServiceEngineGroup";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceEngineGroup serviceEngineGroup = (ServiceEngineGroup) o;
    return Objects.equals(this.lastModified, serviceEngineGroup.lastModified) &&
        Objects.equals(this.acceleratedNetworking, serviceEngineGroup.acceleratedNetworking) &&
        Objects.equals(this.activeStandby, serviceEngineGroup.activeStandby) &&
        Objects.equals(this.additionalConfigMemory, serviceEngineGroup.additionalConfigMemory) &&
        Objects.equals(this.advertiseBackendNetworks, serviceEngineGroup.advertiseBackendNetworks) &&
        Objects.equals(this.aggressiveFailureDetection, serviceEngineGroup.aggressiveFailureDetection) &&
        Objects.equals(this.algo, serviceEngineGroup.algo) &&
        Objects.equals(this.allowBurst, serviceEngineGroup.allowBurst) &&
        Objects.equals(this.appCachePercent, serviceEngineGroup.appCachePercent) &&
        Objects.equals(this.appCacheThreshold, serviceEngineGroup.appCacheThreshold) &&
        Objects.equals(this.appLearningMemoryPercent, serviceEngineGroup.appLearningMemoryPercent) &&
        Objects.equals(this.archiveShmLimit, serviceEngineGroup.archiveShmLimit) &&
        Objects.equals(this.asyncSsl, serviceEngineGroup.asyncSsl) &&
        Objects.equals(this.asyncSslThreads, serviceEngineGroup.asyncSslThreads) &&
        Objects.equals(this.autoRebalance, serviceEngineGroup.autoRebalance) &&
        Objects.equals(this.autoRebalanceCapacityPerSe, serviceEngineGroup.autoRebalanceCapacityPerSe) &&
        Objects.equals(this.autoRebalanceCriteria, serviceEngineGroup.autoRebalanceCriteria) &&
        Objects.equals(this.autoRebalanceInterval, serviceEngineGroup.autoRebalanceInterval) &&
        Objects.equals(this.autoRedistributeActiveStandbyLoad, serviceEngineGroup.autoRedistributeActiveStandbyLoad) &&
        Objects.equals(this.bgpStateUpdateInterval, serviceEngineGroup.bgpStateUpdateInterval) &&
        Objects.equals(this.bufferSe, serviceEngineGroup.bufferSe) &&
        Objects.equals(this.cloudRef, serviceEngineGroup.cloudRef) &&
        Objects.equals(this.configDebugsOnAllCores, serviceEngineGroup.configDebugsOnAllCores) &&
        Objects.equals(this.connectionMemoryPercentage, serviceEngineGroup.connectionMemoryPercentage) &&
        Objects.equals(this.coreShmAppCache, serviceEngineGroup.coreShmAppCache) &&
        Objects.equals(this.coreShmAppLearning, serviceEngineGroup.coreShmAppLearning) &&
        Objects.equals(this.cpuReserve, serviceEngineGroup.cpuReserve) &&
        Objects.equals(this.cpuSocketAffinity, serviceEngineGroup.cpuSocketAffinity) &&
        Objects.equals(this.customSecuritygroupsData, serviceEngineGroup.customSecuritygroupsData) &&
        Objects.equals(this.customSecuritygroupsMgmt, serviceEngineGroup.customSecuritygroupsMgmt) &&
        Objects.equals(this.customTag, serviceEngineGroup.customTag) &&
        Objects.equals(this.dataNetworkId, serviceEngineGroup.dataNetworkId) &&
        Objects.equals(this.datascriptTimeout, serviceEngineGroup.datascriptTimeout) &&
        Objects.equals(this.dedicatedDispatcherCore, serviceEngineGroup.dedicatedDispatcherCore) &&
        Objects.equals(this.description, serviceEngineGroup.description) &&
        Objects.equals(this.disableAviSecuritygroups, serviceEngineGroup.disableAviSecuritygroups) &&
        Objects.equals(this.disableCsumOffloads, serviceEngineGroup.disableCsumOffloads) &&
        Objects.equals(this.disableGro, serviceEngineGroup.disableGro) &&
        Objects.equals(this.disableSeMemoryCheck, serviceEngineGroup.disableSeMemoryCheck) &&
        Objects.equals(this.disableTso, serviceEngineGroup.disableTso) &&
        Objects.equals(this.diskPerSe, serviceEngineGroup.diskPerSe) &&
        Objects.equals(this.distributeLoadActiveStandby, serviceEngineGroup.distributeLoadActiveStandby) &&
        Objects.equals(this.distributeQueues, serviceEngineGroup.distributeQueues) &&
        Objects.equals(this.distributeVnics, serviceEngineGroup.distributeVnics) &&
        Objects.equals(this.enableGratarpPermanent, serviceEngineGroup.enableGratarpPermanent) &&
        Objects.equals(this.enableHsmPriming, serviceEngineGroup.enableHsmPriming) &&
        Objects.equals(this.enableMultiLb, serviceEngineGroup.enableMultiLb) &&
        Objects.equals(this.enablePcapTxRing, serviceEngineGroup.enablePcapTxRing) &&
        Objects.equals(this.enableRouting, serviceEngineGroup.enableRouting) &&
        Objects.equals(this.enableVipOnAllInterfaces, serviceEngineGroup.enableVipOnAllInterfaces) &&
        Objects.equals(this.enableVmac, serviceEngineGroup.enableVmac) &&
        Objects.equals(this.ephemeralPortrangeEnd, serviceEngineGroup.ephemeralPortrangeEnd) &&
        Objects.equals(this.ephemeralPortrangeStart, serviceEngineGroup.ephemeralPortrangeStart) &&
        Objects.equals(this.extraConfigMultiplier, serviceEngineGroup.extraConfigMultiplier) &&
        Objects.equals(this.extraSharedConfigMemory, serviceEngineGroup.extraSharedConfigMemory) &&
        Objects.equals(this.floatingIntfIp, serviceEngineGroup.floatingIntfIp) &&
        Objects.equals(this.floatingIntfIpSe2, serviceEngineGroup.floatingIntfIpSe2) &&
        Objects.equals(this.flowTableNewSynMaxEntries, serviceEngineGroup.flowTableNewSynMaxEntries) &&
        Objects.equals(this.freeListSize, serviceEngineGroup.freeListSize) &&
        Objects.equals(this.gratarpPermanentPeriodicity, serviceEngineGroup.gratarpPermanentPeriodicity) &&
        Objects.equals(this.haMode, serviceEngineGroup.haMode) &&
        Objects.equals(this.hardwaresecuritymodulegroupRef, serviceEngineGroup.hardwaresecuritymodulegroupRef) &&
        Objects.equals(this.heapMinimumConfigMemory, serviceEngineGroup.heapMinimumConfigMemory) &&
        Objects.equals(this.hmOnStandby, serviceEngineGroup.hmOnStandby) &&
        Objects.equals(this.hostAttributeKey, serviceEngineGroup.hostAttributeKey) &&
        Objects.equals(this.hostAttributeValue, serviceEngineGroup.hostAttributeValue) &&
        Objects.equals(this.hostGatewayMonitor, serviceEngineGroup.hostGatewayMonitor) &&
        Objects.equals(this.hypervisor, serviceEngineGroup.hypervisor) &&
        Objects.equals(this.ignoreRttThreshold, serviceEngineGroup.ignoreRttThreshold) &&
        Objects.equals(this.ingressAccessData, serviceEngineGroup.ingressAccessData) &&
        Objects.equals(this.ingressAccessMgmt, serviceEngineGroup.ingressAccessMgmt) &&
        Objects.equals(this.instanceFlavor, serviceEngineGroup.instanceFlavor) &&
        Objects.equals(this.iptables, serviceEngineGroup.iptables) &&
        Objects.equals(this.leastLoadCoreSelection, serviceEngineGroup.leastLoadCoreSelection) &&
        Objects.equals(this.licenseTier, serviceEngineGroup.licenseTier) &&
        Objects.equals(this.licenseType, serviceEngineGroup.licenseType) &&
        Objects.equals(this.logDisksz, serviceEngineGroup.logDisksz) &&
        Objects.equals(this.maxConcurrentExternalHm, serviceEngineGroup.maxConcurrentExternalHm) &&
        Objects.equals(this.maxCpuUsage, serviceEngineGroup.maxCpuUsage) &&
        Objects.equals(this.maxMemoryPerMempool, serviceEngineGroup.maxMemoryPerMempool) &&
        Objects.equals(this.maxNumSeDps, serviceEngineGroup.maxNumSeDps) &&
        Objects.equals(this.maxPublicIpsPerLb, serviceEngineGroup.maxPublicIpsPerLb) &&
        Objects.equals(this.maxQueuesPerVnic, serviceEngineGroup.maxQueuesPerVnic) &&
        Objects.equals(this.maxRulesPerLb, serviceEngineGroup.maxRulesPerLb) &&
        Objects.equals(this.maxScaleoutPerVs, serviceEngineGroup.maxScaleoutPerVs) &&
        Objects.equals(this.maxSe, serviceEngineGroup.maxSe) &&
        Objects.equals(this.maxVsPerSe, serviceEngineGroup.maxVsPerSe) &&
        Objects.equals(this.memReserve, serviceEngineGroup.memReserve) &&
        Objects.equals(this.memoryForConfigUpdate, serviceEngineGroup.memoryForConfigUpdate) &&
        Objects.equals(this.memoryPerSe, serviceEngineGroup.memoryPerSe) &&
        Objects.equals(this.mgmtNetworkRef, serviceEngineGroup.mgmtNetworkRef) &&
        Objects.equals(this.mgmtSubnet, serviceEngineGroup.mgmtSubnet) &&
        Objects.equals(this.minCpuUsage, serviceEngineGroup.minCpuUsage) &&
        Objects.equals(this.minScaleoutPerVs, serviceEngineGroup.minScaleoutPerVs) &&
        Objects.equals(this.minSe, serviceEngineGroup.minSe) &&
        Objects.equals(this.minimumConnectionMemory, serviceEngineGroup.minimumConnectionMemory) &&
        Objects.equals(this.minimumRequiredConfigMemory, serviceEngineGroup.minimumRequiredConfigMemory) &&
        Objects.equals(this.nLogStreamingThreads, serviceEngineGroup.nLogStreamingThreads) &&
        Objects.equals(this.name, serviceEngineGroup.name) &&
        Objects.equals(this.natFlowTcpClosedTimeout, serviceEngineGroup.natFlowTcpClosedTimeout) &&
        Objects.equals(this.natFlowTcpEstablishedTimeout, serviceEngineGroup.natFlowTcpEstablishedTimeout) &&
        Objects.equals(this.natFlowTcpHalfClosedTimeout, serviceEngineGroup.natFlowTcpHalfClosedTimeout) &&
        Objects.equals(this.natFlowTcpHandshakeTimeout, serviceEngineGroup.natFlowTcpHandshakeTimeout) &&
        Objects.equals(this.natFlowUdpNoresponseTimeout, serviceEngineGroup.natFlowUdpNoresponseTimeout) &&
        Objects.equals(this.natFlowUdpResponseTimeout, serviceEngineGroup.natFlowUdpResponseTimeout) &&
        Objects.equals(this.nonSignificantLogThrottle, serviceEngineGroup.nonSignificantLogThrottle) &&
        Objects.equals(this.numDispatcherCores, serviceEngineGroup.numDispatcherCores) &&
        Objects.equals(this.numFlowCoresSumChangesToIgnore, serviceEngineGroup.numFlowCoresSumChangesToIgnore) &&
        Objects.equals(this.openstackAvailabilityZone, serviceEngineGroup.openstackAvailabilityZone) &&
        Objects.equals(this.openstackAvailabilityZones, serviceEngineGroup.openstackAvailabilityZones) &&
        Objects.equals(this.openstackMgmtNetworkName, serviceEngineGroup.openstackMgmtNetworkName) &&
        Objects.equals(this.openstackMgmtNetworkUuid, serviceEngineGroup.openstackMgmtNetworkUuid) &&
        Objects.equals(this.osReservedMemory, serviceEngineGroup.osReservedMemory) &&
        Objects.equals(this.pcapTxMode, serviceEngineGroup.pcapTxMode) &&
        Objects.equals(this.perApp, serviceEngineGroup.perApp) &&
        Objects.equals(this.placementMode, serviceEngineGroup.placementMode) &&
        Objects.equals(this.realtimeSeMetrics, serviceEngineGroup.realtimeSeMetrics) &&
        Objects.equals(this.rebootOnPanic, serviceEngineGroup.rebootOnPanic) &&
        Objects.equals(this.rebootOnStop, serviceEngineGroup.rebootOnStop) &&
        Objects.equals(this.seBandwidthType, serviceEngineGroup.seBandwidthType) &&
        Objects.equals(this.seDeprovisionDelay, serviceEngineGroup.seDeprovisionDelay) &&
        Objects.equals(this.seDosProfile, serviceEngineGroup.seDosProfile) &&
        Objects.equals(this.seDpMaxHbVersion, serviceEngineGroup.seDpMaxHbVersion) &&
        Objects.equals(this.seDpVnicQueueStallEventSleep, serviceEngineGroup.seDpVnicQueueStallEventSleep) &&
        Objects.equals(this.seDpVnicQueueStallThreshold, serviceEngineGroup.seDpVnicQueueStallThreshold) &&
        Objects.equals(this.seDpVnicQueueStallTimeout, serviceEngineGroup.seDpVnicQueueStallTimeout) &&
        Objects.equals(this.seDpVnicRestartOnQueueStallCount, serviceEngineGroup.seDpVnicRestartOnQueueStallCount) &&
        Objects.equals(this.seDpVnicStallSeRestartWindow, serviceEngineGroup.seDpVnicStallSeRestartWindow) &&
        Objects.equals(this.seDpdkPmd, serviceEngineGroup.seDpdkPmd) &&
        Objects.equals(this.seFlowProbeRetries, serviceEngineGroup.seFlowProbeRetries) &&
        Objects.equals(this.seFlowProbeRetryTimer, serviceEngineGroup.seFlowProbeRetryTimer) &&
        Objects.equals(this.seFlowProbeTimer, serviceEngineGroup.seFlowProbeTimer) &&
        Objects.equals(this.seIpcUdpPort, serviceEngineGroup.seIpcUdpPort) &&
        Objects.equals(this.seKniBurstFactor, serviceEngineGroup.seKniBurstFactor) &&
        Objects.equals(this.seLro, serviceEngineGroup.seLro) &&
        Objects.equals(this.seMtu, serviceEngineGroup.seMtu) &&
        Objects.equals(this.seNamePrefix, serviceEngineGroup.seNamePrefix) &&
        Objects.equals(this.sePcapLookahead, serviceEngineGroup.sePcapLookahead) &&
        Objects.equals(this.sePcapPktCount, serviceEngineGroup.sePcapPktCount) &&
        Objects.equals(this.sePcapPktSz, serviceEngineGroup.sePcapPktSz) &&
        Objects.equals(this.sePcapQdiscBypass, serviceEngineGroup.sePcapQdiscBypass) &&
        Objects.equals(this.sePcapReinitFrequency, serviceEngineGroup.sePcapReinitFrequency) &&
        Objects.equals(this.sePcapReinitThreshold, serviceEngineGroup.sePcapReinitThreshold) &&
        Objects.equals(this.seProbePort, serviceEngineGroup.seProbePort) &&
        Objects.equals(this.seRemotePuntUdpPort, serviceEngineGroup.seRemotePuntUdpPort) &&
        Objects.equals(this.seRlProp, serviceEngineGroup.seRlProp) &&
        Objects.equals(this.seRouting, serviceEngineGroup.seRouting) &&
        Objects.equals(this.seRumSamplingNavInterval, serviceEngineGroup.seRumSamplingNavInterval) &&
        Objects.equals(this.seRumSamplingNavPercent, serviceEngineGroup.seRumSamplingNavPercent) &&
        Objects.equals(this.seRumSamplingResInterval, serviceEngineGroup.seRumSamplingResInterval) &&
        Objects.equals(this.seRumSamplingResPercent, serviceEngineGroup.seRumSamplingResPercent) &&
        Objects.equals(this.seSbDedicatedCore, serviceEngineGroup.seSbDedicatedCore) &&
        Objects.equals(this.seSbThreads, serviceEngineGroup.seSbThreads) &&
        Objects.equals(this.seThreadMultiplier, serviceEngineGroup.seThreadMultiplier) &&
        Objects.equals(this.seTracertPortRange, serviceEngineGroup.seTracertPortRange) &&
        Objects.equals(this.seTunnelMode, serviceEngineGroup.seTunnelMode) &&
        Objects.equals(this.seTunnelUdpPort, serviceEngineGroup.seTunnelUdpPort) &&
        Objects.equals(this.seTxBatchSize, serviceEngineGroup.seTxBatchSize) &&
        Objects.equals(this.seUdpEncapIpc, serviceEngineGroup.seUdpEncapIpc) &&
        Objects.equals(this.seUseDpdk, serviceEngineGroup.seUseDpdk) &&
        Objects.equals(this.seVsHbMaxPktsInBatch, serviceEngineGroup.seVsHbMaxPktsInBatch) &&
        Objects.equals(this.seVsHbMaxVsInPkt, serviceEngineGroup.seVsHbMaxVsInPkt) &&
        Objects.equals(this.selfSeElection, serviceEngineGroup.selfSeElection) &&
        Objects.equals(this.serviceIp6Subnets, serviceEngineGroup.serviceIp6Subnets) &&
        Objects.equals(this.serviceIpSubnets, serviceEngineGroup.serviceIpSubnets) &&
        Objects.equals(this.shmMinimumConfigMemory, serviceEngineGroup.shmMinimumConfigMemory) &&
        Objects.equals(this.significantLogThrottle, serviceEngineGroup.significantLogThrottle) &&
        Objects.equals(this.sslPreprocessSniHostname, serviceEngineGroup.sslPreprocessSniHostname) &&
        Objects.equals(this.tenantRef, serviceEngineGroup.tenantRef) &&
        Objects.equals(this.udfLogThrottle, serviceEngineGroup.udfLogThrottle) &&
        Objects.equals(this.url, serviceEngineGroup.url) &&
        Objects.equals(this.useStandardAlb, serviceEngineGroup.useStandardAlb) &&
        Objects.equals(this.uuid, serviceEngineGroup.uuid) &&
        Objects.equals(this.vcenterClusters, serviceEngineGroup.vcenterClusters) &&
        Objects.equals(this.vcenterDatastoreMode, serviceEngineGroup.vcenterDatastoreMode) &&
        Objects.equals(this.vcenterDatastores, serviceEngineGroup.vcenterDatastores) &&
        Objects.equals(this.vcenterDatastoresInclude, serviceEngineGroup.vcenterDatastoresInclude) &&
        Objects.equals(this.vcenterFolder, serviceEngineGroup.vcenterFolder) &&
        Objects.equals(this.vcenterHosts, serviceEngineGroup.vcenterHosts) &&
        Objects.equals(this.vcpusPerSe, serviceEngineGroup.vcpusPerSe) &&
        Objects.equals(this.vipAsg, serviceEngineGroup.vipAsg) &&
        Objects.equals(this.vsHostRedundancy, serviceEngineGroup.vsHostRedundancy) &&
        Objects.equals(this.vsScaleinTimeout, serviceEngineGroup.vsScaleinTimeout) &&
        Objects.equals(this.vsScaleinTimeoutForUpgrade, serviceEngineGroup.vsScaleinTimeoutForUpgrade) &&
        Objects.equals(this.vsScaleoutTimeout, serviceEngineGroup.vsScaleoutTimeout) &&
        Objects.equals(this.vsSeScaleoutAdditionalWaitTime, serviceEngineGroup.vsSeScaleoutAdditionalWaitTime) &&
        Objects.equals(this.vsSeScaleoutReadyTimeout, serviceEngineGroup.vsSeScaleoutReadyTimeout) &&
        Objects.equals(this.vsSwitchoverTimeout, serviceEngineGroup.vsSwitchoverTimeout) &&
        Objects.equals(this.vssPlacement, serviceEngineGroup.vssPlacement) &&
        Objects.equals(this.vssPlacementEnabled, serviceEngineGroup.vssPlacementEnabled) &&
        Objects.equals(this.wafLearningInterval, serviceEngineGroup.wafLearningInterval) &&
        Objects.equals(this.wafLearningMemory, serviceEngineGroup.wafLearningMemory) &&
        Objects.equals(this.wafMempool, serviceEngineGroup.wafMempool) &&
        Objects.equals(this.wafMempoolSize, serviceEngineGroup.wafMempoolSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, acceleratedNetworking, activeStandby, additionalConfigMemory, advertiseBackendNetworks, aggressiveFailureDetection, algo, allowBurst, appCachePercent, appCacheThreshold, appLearningMemoryPercent, archiveShmLimit, asyncSsl, asyncSslThreads, autoRebalance, autoRebalanceCapacityPerSe, autoRebalanceCriteria, autoRebalanceInterval, autoRedistributeActiveStandbyLoad, bgpStateUpdateInterval, bufferSe, cloudRef, configDebugsOnAllCores, connectionMemoryPercentage, coreShmAppCache, coreShmAppLearning, cpuReserve, cpuSocketAffinity, customSecuritygroupsData, customSecuritygroupsMgmt, customTag, dataNetworkId, datascriptTimeout, dedicatedDispatcherCore, description, disableAviSecuritygroups, disableCsumOffloads, disableGro, disableSeMemoryCheck, disableTso, diskPerSe, distributeLoadActiveStandby, distributeQueues, distributeVnics, enableGratarpPermanent, enableHsmPriming, enableMultiLb, enablePcapTxRing, enableRouting, enableVipOnAllInterfaces, enableVmac, ephemeralPortrangeEnd, ephemeralPortrangeStart, extraConfigMultiplier, extraSharedConfigMemory, floatingIntfIp, floatingIntfIpSe2, flowTableNewSynMaxEntries, freeListSize, gratarpPermanentPeriodicity, haMode, hardwaresecuritymodulegroupRef, heapMinimumConfigMemory, hmOnStandby, hostAttributeKey, hostAttributeValue, hostGatewayMonitor, hypervisor, ignoreRttThreshold, ingressAccessData, ingressAccessMgmt, instanceFlavor, iptables, leastLoadCoreSelection, licenseTier, licenseType, logDisksz, maxConcurrentExternalHm, maxCpuUsage, maxMemoryPerMempool, maxNumSeDps, maxPublicIpsPerLb, maxQueuesPerVnic, maxRulesPerLb, maxScaleoutPerVs, maxSe, maxVsPerSe, memReserve, memoryForConfigUpdate, memoryPerSe, mgmtNetworkRef, mgmtSubnet, minCpuUsage, minScaleoutPerVs, minSe, minimumConnectionMemory, minimumRequiredConfigMemory, nLogStreamingThreads, name, natFlowTcpClosedTimeout, natFlowTcpEstablishedTimeout, natFlowTcpHalfClosedTimeout, natFlowTcpHandshakeTimeout, natFlowUdpNoresponseTimeout, natFlowUdpResponseTimeout, nonSignificantLogThrottle, numDispatcherCores, numFlowCoresSumChangesToIgnore, openstackAvailabilityZone, openstackAvailabilityZones, openstackMgmtNetworkName, openstackMgmtNetworkUuid, osReservedMemory, pcapTxMode, perApp, placementMode, realtimeSeMetrics, rebootOnPanic, rebootOnStop, seBandwidthType, seDeprovisionDelay, seDosProfile, seDpMaxHbVersion, seDpVnicQueueStallEventSleep, seDpVnicQueueStallThreshold, seDpVnicQueueStallTimeout, seDpVnicRestartOnQueueStallCount, seDpVnicStallSeRestartWindow, seDpdkPmd, seFlowProbeRetries, seFlowProbeRetryTimer, seFlowProbeTimer, seIpcUdpPort, seKniBurstFactor, seLro, seMtu, seNamePrefix, sePcapLookahead, sePcapPktCount, sePcapPktSz, sePcapQdiscBypass, sePcapReinitFrequency, sePcapReinitThreshold, seProbePort, seRemotePuntUdpPort, seRlProp, seRouting, seRumSamplingNavInterval, seRumSamplingNavPercent, seRumSamplingResInterval, seRumSamplingResPercent, seSbDedicatedCore, seSbThreads, seThreadMultiplier, seTracertPortRange, seTunnelMode, seTunnelUdpPort, seTxBatchSize, seUdpEncapIpc, seUseDpdk, seVsHbMaxPktsInBatch, seVsHbMaxVsInPkt, selfSeElection, serviceIp6Subnets, serviceIpSubnets, shmMinimumConfigMemory, significantLogThrottle, sslPreprocessSniHostname, tenantRef, udfLogThrottle, url, useStandardAlb, uuid, vcenterClusters, vcenterDatastoreMode, vcenterDatastores, vcenterDatastoresInclude, vcenterFolder, vcenterHosts, vcpusPerSe, vipAsg, vsHostRedundancy, vsScaleinTimeout, vsScaleinTimeoutForUpgrade, vsScaleoutTimeout, vsSeScaleoutAdditionalWaitTime, vsSeScaleoutReadyTimeout, vsSwitchoverTimeout, vssPlacement, vssPlacementEnabled, wafLearningInterval, wafLearningMemory, wafMempool, wafMempoolSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceEngineGroup {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    acceleratedNetworking: ").append(toIndentedString(acceleratedNetworking)).append("\n");
    sb.append("    activeStandby: ").append(toIndentedString(activeStandby)).append("\n");
    sb.append("    additionalConfigMemory: ").append(toIndentedString(additionalConfigMemory)).append("\n");
    sb.append("    advertiseBackendNetworks: ").append(toIndentedString(advertiseBackendNetworks)).append("\n");
    sb.append("    aggressiveFailureDetection: ").append(toIndentedString(aggressiveFailureDetection)).append("\n");
    sb.append("    algo: ").append(toIndentedString(algo)).append("\n");
    sb.append("    allowBurst: ").append(toIndentedString(allowBurst)).append("\n");
    sb.append("    appCachePercent: ").append(toIndentedString(appCachePercent)).append("\n");
    sb.append("    appCacheThreshold: ").append(toIndentedString(appCacheThreshold)).append("\n");
    sb.append("    appLearningMemoryPercent: ").append(toIndentedString(appLearningMemoryPercent)).append("\n");
    sb.append("    archiveShmLimit: ").append(toIndentedString(archiveShmLimit)).append("\n");
    sb.append("    asyncSsl: ").append(toIndentedString(asyncSsl)).append("\n");
    sb.append("    asyncSslThreads: ").append(toIndentedString(asyncSslThreads)).append("\n");
    sb.append("    autoRebalance: ").append(toIndentedString(autoRebalance)).append("\n");
    sb.append("    autoRebalanceCapacityPerSe: ").append(toIndentedString(autoRebalanceCapacityPerSe)).append("\n");
    sb.append("    autoRebalanceCriteria: ").append(toIndentedString(autoRebalanceCriteria)).append("\n");
    sb.append("    autoRebalanceInterval: ").append(toIndentedString(autoRebalanceInterval)).append("\n");
    sb.append("    autoRedistributeActiveStandbyLoad: ").append(toIndentedString(autoRedistributeActiveStandbyLoad)).append("\n");
    sb.append("    bgpStateUpdateInterval: ").append(toIndentedString(bgpStateUpdateInterval)).append("\n");
    sb.append("    bufferSe: ").append(toIndentedString(bufferSe)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    configDebugsOnAllCores: ").append(toIndentedString(configDebugsOnAllCores)).append("\n");
    sb.append("    connectionMemoryPercentage: ").append(toIndentedString(connectionMemoryPercentage)).append("\n");
    sb.append("    coreShmAppCache: ").append(toIndentedString(coreShmAppCache)).append("\n");
    sb.append("    coreShmAppLearning: ").append(toIndentedString(coreShmAppLearning)).append("\n");
    sb.append("    cpuReserve: ").append(toIndentedString(cpuReserve)).append("\n");
    sb.append("    cpuSocketAffinity: ").append(toIndentedString(cpuSocketAffinity)).append("\n");
    sb.append("    customSecuritygroupsData: ").append(toIndentedString(customSecuritygroupsData)).append("\n");
    sb.append("    customSecuritygroupsMgmt: ").append(toIndentedString(customSecuritygroupsMgmt)).append("\n");
    sb.append("    customTag: ").append(toIndentedString(customTag)).append("\n");
    sb.append("    dataNetworkId: ").append(toIndentedString(dataNetworkId)).append("\n");
    sb.append("    datascriptTimeout: ").append(toIndentedString(datascriptTimeout)).append("\n");
    sb.append("    dedicatedDispatcherCore: ").append(toIndentedString(dedicatedDispatcherCore)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disableAviSecuritygroups: ").append(toIndentedString(disableAviSecuritygroups)).append("\n");
    sb.append("    disableCsumOffloads: ").append(toIndentedString(disableCsumOffloads)).append("\n");
    sb.append("    disableGro: ").append(toIndentedString(disableGro)).append("\n");
    sb.append("    disableSeMemoryCheck: ").append(toIndentedString(disableSeMemoryCheck)).append("\n");
    sb.append("    disableTso: ").append(toIndentedString(disableTso)).append("\n");
    sb.append("    diskPerSe: ").append(toIndentedString(diskPerSe)).append("\n");
    sb.append("    distributeLoadActiveStandby: ").append(toIndentedString(distributeLoadActiveStandby)).append("\n");
    sb.append("    distributeQueues: ").append(toIndentedString(distributeQueues)).append("\n");
    sb.append("    distributeVnics: ").append(toIndentedString(distributeVnics)).append("\n");
    sb.append("    enableGratarpPermanent: ").append(toIndentedString(enableGratarpPermanent)).append("\n");
    sb.append("    enableHsmPriming: ").append(toIndentedString(enableHsmPriming)).append("\n");
    sb.append("    enableMultiLb: ").append(toIndentedString(enableMultiLb)).append("\n");
    sb.append("    enablePcapTxRing: ").append(toIndentedString(enablePcapTxRing)).append("\n");
    sb.append("    enableRouting: ").append(toIndentedString(enableRouting)).append("\n");
    sb.append("    enableVipOnAllInterfaces: ").append(toIndentedString(enableVipOnAllInterfaces)).append("\n");
    sb.append("    enableVmac: ").append(toIndentedString(enableVmac)).append("\n");
    sb.append("    ephemeralPortrangeEnd: ").append(toIndentedString(ephemeralPortrangeEnd)).append("\n");
    sb.append("    ephemeralPortrangeStart: ").append(toIndentedString(ephemeralPortrangeStart)).append("\n");
    sb.append("    extraConfigMultiplier: ").append(toIndentedString(extraConfigMultiplier)).append("\n");
    sb.append("    extraSharedConfigMemory: ").append(toIndentedString(extraSharedConfigMemory)).append("\n");
    sb.append("    floatingIntfIp: ").append(toIndentedString(floatingIntfIp)).append("\n");
    sb.append("    floatingIntfIpSe2: ").append(toIndentedString(floatingIntfIpSe2)).append("\n");
    sb.append("    flowTableNewSynMaxEntries: ").append(toIndentedString(flowTableNewSynMaxEntries)).append("\n");
    sb.append("    freeListSize: ").append(toIndentedString(freeListSize)).append("\n");
    sb.append("    gratarpPermanentPeriodicity: ").append(toIndentedString(gratarpPermanentPeriodicity)).append("\n");
    sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
    sb.append("    hardwaresecuritymodulegroupRef: ").append(toIndentedString(hardwaresecuritymodulegroupRef)).append("\n");
    sb.append("    heapMinimumConfigMemory: ").append(toIndentedString(heapMinimumConfigMemory)).append("\n");
    sb.append("    hmOnStandby: ").append(toIndentedString(hmOnStandby)).append("\n");
    sb.append("    hostAttributeKey: ").append(toIndentedString(hostAttributeKey)).append("\n");
    sb.append("    hostAttributeValue: ").append(toIndentedString(hostAttributeValue)).append("\n");
    sb.append("    hostGatewayMonitor: ").append(toIndentedString(hostGatewayMonitor)).append("\n");
    sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
    sb.append("    ignoreRttThreshold: ").append(toIndentedString(ignoreRttThreshold)).append("\n");
    sb.append("    ingressAccessData: ").append(toIndentedString(ingressAccessData)).append("\n");
    sb.append("    ingressAccessMgmt: ").append(toIndentedString(ingressAccessMgmt)).append("\n");
    sb.append("    instanceFlavor: ").append(toIndentedString(instanceFlavor)).append("\n");
    sb.append("    iptables: ").append(toIndentedString(iptables)).append("\n");
    sb.append("    leastLoadCoreSelection: ").append(toIndentedString(leastLoadCoreSelection)).append("\n");
    sb.append("    licenseTier: ").append(toIndentedString(licenseTier)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    logDisksz: ").append(toIndentedString(logDisksz)).append("\n");
    sb.append("    maxConcurrentExternalHm: ").append(toIndentedString(maxConcurrentExternalHm)).append("\n");
    sb.append("    maxCpuUsage: ").append(toIndentedString(maxCpuUsage)).append("\n");
    sb.append("    maxMemoryPerMempool: ").append(toIndentedString(maxMemoryPerMempool)).append("\n");
    sb.append("    maxNumSeDps: ").append(toIndentedString(maxNumSeDps)).append("\n");
    sb.append("    maxPublicIpsPerLb: ").append(toIndentedString(maxPublicIpsPerLb)).append("\n");
    sb.append("    maxQueuesPerVnic: ").append(toIndentedString(maxQueuesPerVnic)).append("\n");
    sb.append("    maxRulesPerLb: ").append(toIndentedString(maxRulesPerLb)).append("\n");
    sb.append("    maxScaleoutPerVs: ").append(toIndentedString(maxScaleoutPerVs)).append("\n");
    sb.append("    maxSe: ").append(toIndentedString(maxSe)).append("\n");
    sb.append("    maxVsPerSe: ").append(toIndentedString(maxVsPerSe)).append("\n");
    sb.append("    memReserve: ").append(toIndentedString(memReserve)).append("\n");
    sb.append("    memoryForConfigUpdate: ").append(toIndentedString(memoryForConfigUpdate)).append("\n");
    sb.append("    memoryPerSe: ").append(toIndentedString(memoryPerSe)).append("\n");
    sb.append("    mgmtNetworkRef: ").append(toIndentedString(mgmtNetworkRef)).append("\n");
    sb.append("    mgmtSubnet: ").append(toIndentedString(mgmtSubnet)).append("\n");
    sb.append("    minCpuUsage: ").append(toIndentedString(minCpuUsage)).append("\n");
    sb.append("    minScaleoutPerVs: ").append(toIndentedString(minScaleoutPerVs)).append("\n");
    sb.append("    minSe: ").append(toIndentedString(minSe)).append("\n");
    sb.append("    minimumConnectionMemory: ").append(toIndentedString(minimumConnectionMemory)).append("\n");
    sb.append("    minimumRequiredConfigMemory: ").append(toIndentedString(minimumRequiredConfigMemory)).append("\n");
    sb.append("    nLogStreamingThreads: ").append(toIndentedString(nLogStreamingThreads)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    natFlowTcpClosedTimeout: ").append(toIndentedString(natFlowTcpClosedTimeout)).append("\n");
    sb.append("    natFlowTcpEstablishedTimeout: ").append(toIndentedString(natFlowTcpEstablishedTimeout)).append("\n");
    sb.append("    natFlowTcpHalfClosedTimeout: ").append(toIndentedString(natFlowTcpHalfClosedTimeout)).append("\n");
    sb.append("    natFlowTcpHandshakeTimeout: ").append(toIndentedString(natFlowTcpHandshakeTimeout)).append("\n");
    sb.append("    natFlowUdpNoresponseTimeout: ").append(toIndentedString(natFlowUdpNoresponseTimeout)).append("\n");
    sb.append("    natFlowUdpResponseTimeout: ").append(toIndentedString(natFlowUdpResponseTimeout)).append("\n");
    sb.append("    nonSignificantLogThrottle: ").append(toIndentedString(nonSignificantLogThrottle)).append("\n");
    sb.append("    numDispatcherCores: ").append(toIndentedString(numDispatcherCores)).append("\n");
    sb.append("    numFlowCoresSumChangesToIgnore: ").append(toIndentedString(numFlowCoresSumChangesToIgnore)).append("\n");
    sb.append("    openstackAvailabilityZone: ").append(toIndentedString(openstackAvailabilityZone)).append("\n");
    sb.append("    openstackAvailabilityZones: ").append(toIndentedString(openstackAvailabilityZones)).append("\n");
    sb.append("    openstackMgmtNetworkName: ").append(toIndentedString(openstackMgmtNetworkName)).append("\n");
    sb.append("    openstackMgmtNetworkUuid: ").append(toIndentedString(openstackMgmtNetworkUuid)).append("\n");
    sb.append("    osReservedMemory: ").append(toIndentedString(osReservedMemory)).append("\n");
    sb.append("    pcapTxMode: ").append(toIndentedString(pcapTxMode)).append("\n");
    sb.append("    perApp: ").append(toIndentedString(perApp)).append("\n");
    sb.append("    placementMode: ").append(toIndentedString(placementMode)).append("\n");
    sb.append("    realtimeSeMetrics: ").append(toIndentedString(realtimeSeMetrics)).append("\n");
    sb.append("    rebootOnPanic: ").append(toIndentedString(rebootOnPanic)).append("\n");
    sb.append("    rebootOnStop: ").append(toIndentedString(rebootOnStop)).append("\n");
    sb.append("    seBandwidthType: ").append(toIndentedString(seBandwidthType)).append("\n");
    sb.append("    seDeprovisionDelay: ").append(toIndentedString(seDeprovisionDelay)).append("\n");
    sb.append("    seDosProfile: ").append(toIndentedString(seDosProfile)).append("\n");
    sb.append("    seDpMaxHbVersion: ").append(toIndentedString(seDpMaxHbVersion)).append("\n");
    sb.append("    seDpVnicQueueStallEventSleep: ").append(toIndentedString(seDpVnicQueueStallEventSleep)).append("\n");
    sb.append("    seDpVnicQueueStallThreshold: ").append(toIndentedString(seDpVnicQueueStallThreshold)).append("\n");
    sb.append("    seDpVnicQueueStallTimeout: ").append(toIndentedString(seDpVnicQueueStallTimeout)).append("\n");
    sb.append("    seDpVnicRestartOnQueueStallCount: ").append(toIndentedString(seDpVnicRestartOnQueueStallCount)).append("\n");
    sb.append("    seDpVnicStallSeRestartWindow: ").append(toIndentedString(seDpVnicStallSeRestartWindow)).append("\n");
    sb.append("    seDpdkPmd: ").append(toIndentedString(seDpdkPmd)).append("\n");
    sb.append("    seFlowProbeRetries: ").append(toIndentedString(seFlowProbeRetries)).append("\n");
    sb.append("    seFlowProbeRetryTimer: ").append(toIndentedString(seFlowProbeRetryTimer)).append("\n");
    sb.append("    seFlowProbeTimer: ").append(toIndentedString(seFlowProbeTimer)).append("\n");
    sb.append("    seIpcUdpPort: ").append(toIndentedString(seIpcUdpPort)).append("\n");
    sb.append("    seKniBurstFactor: ").append(toIndentedString(seKniBurstFactor)).append("\n");
    sb.append("    seLro: ").append(toIndentedString(seLro)).append("\n");
    sb.append("    seMtu: ").append(toIndentedString(seMtu)).append("\n");
    sb.append("    seNamePrefix: ").append(toIndentedString(seNamePrefix)).append("\n");
    sb.append("    sePcapLookahead: ").append(toIndentedString(sePcapLookahead)).append("\n");
    sb.append("    sePcapPktCount: ").append(toIndentedString(sePcapPktCount)).append("\n");
    sb.append("    sePcapPktSz: ").append(toIndentedString(sePcapPktSz)).append("\n");
    sb.append("    sePcapQdiscBypass: ").append(toIndentedString(sePcapQdiscBypass)).append("\n");
    sb.append("    sePcapReinitFrequency: ").append(toIndentedString(sePcapReinitFrequency)).append("\n");
    sb.append("    sePcapReinitThreshold: ").append(toIndentedString(sePcapReinitThreshold)).append("\n");
    sb.append("    seProbePort: ").append(toIndentedString(seProbePort)).append("\n");
    sb.append("    seRemotePuntUdpPort: ").append(toIndentedString(seRemotePuntUdpPort)).append("\n");
    sb.append("    seRlProp: ").append(toIndentedString(seRlProp)).append("\n");
    sb.append("    seRouting: ").append(toIndentedString(seRouting)).append("\n");
    sb.append("    seRumSamplingNavInterval: ").append(toIndentedString(seRumSamplingNavInterval)).append("\n");
    sb.append("    seRumSamplingNavPercent: ").append(toIndentedString(seRumSamplingNavPercent)).append("\n");
    sb.append("    seRumSamplingResInterval: ").append(toIndentedString(seRumSamplingResInterval)).append("\n");
    sb.append("    seRumSamplingResPercent: ").append(toIndentedString(seRumSamplingResPercent)).append("\n");
    sb.append("    seSbDedicatedCore: ").append(toIndentedString(seSbDedicatedCore)).append("\n");
    sb.append("    seSbThreads: ").append(toIndentedString(seSbThreads)).append("\n");
    sb.append("    seThreadMultiplier: ").append(toIndentedString(seThreadMultiplier)).append("\n");
    sb.append("    seTracertPortRange: ").append(toIndentedString(seTracertPortRange)).append("\n");
    sb.append("    seTunnelMode: ").append(toIndentedString(seTunnelMode)).append("\n");
    sb.append("    seTunnelUdpPort: ").append(toIndentedString(seTunnelUdpPort)).append("\n");
    sb.append("    seTxBatchSize: ").append(toIndentedString(seTxBatchSize)).append("\n");
    sb.append("    seUdpEncapIpc: ").append(toIndentedString(seUdpEncapIpc)).append("\n");
    sb.append("    seUseDpdk: ").append(toIndentedString(seUseDpdk)).append("\n");
    sb.append("    seVsHbMaxPktsInBatch: ").append(toIndentedString(seVsHbMaxPktsInBatch)).append("\n");
    sb.append("    seVsHbMaxVsInPkt: ").append(toIndentedString(seVsHbMaxVsInPkt)).append("\n");
    sb.append("    selfSeElection: ").append(toIndentedString(selfSeElection)).append("\n");
    sb.append("    serviceIp6Subnets: ").append(toIndentedString(serviceIp6Subnets)).append("\n");
    sb.append("    serviceIpSubnets: ").append(toIndentedString(serviceIpSubnets)).append("\n");
    sb.append("    shmMinimumConfigMemory: ").append(toIndentedString(shmMinimumConfigMemory)).append("\n");
    sb.append("    significantLogThrottle: ").append(toIndentedString(significantLogThrottle)).append("\n");
    sb.append("    sslPreprocessSniHostname: ").append(toIndentedString(sslPreprocessSniHostname)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    udfLogThrottle: ").append(toIndentedString(udfLogThrottle)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    useStandardAlb: ").append(toIndentedString(useStandardAlb)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vcenterClusters: ").append(toIndentedString(vcenterClusters)).append("\n");
    sb.append("    vcenterDatastoreMode: ").append(toIndentedString(vcenterDatastoreMode)).append("\n");
    sb.append("    vcenterDatastores: ").append(toIndentedString(vcenterDatastores)).append("\n");
    sb.append("    vcenterDatastoresInclude: ").append(toIndentedString(vcenterDatastoresInclude)).append("\n");
    sb.append("    vcenterFolder: ").append(toIndentedString(vcenterFolder)).append("\n");
    sb.append("    vcenterHosts: ").append(toIndentedString(vcenterHosts)).append("\n");
    sb.append("    vcpusPerSe: ").append(toIndentedString(vcpusPerSe)).append("\n");
    sb.append("    vipAsg: ").append(toIndentedString(vipAsg)).append("\n");
    sb.append("    vsHostRedundancy: ").append(toIndentedString(vsHostRedundancy)).append("\n");
    sb.append("    vsScaleinTimeout: ").append(toIndentedString(vsScaleinTimeout)).append("\n");
    sb.append("    vsScaleinTimeoutForUpgrade: ").append(toIndentedString(vsScaleinTimeoutForUpgrade)).append("\n");
    sb.append("    vsScaleoutTimeout: ").append(toIndentedString(vsScaleoutTimeout)).append("\n");
    sb.append("    vsSeScaleoutAdditionalWaitTime: ").append(toIndentedString(vsSeScaleoutAdditionalWaitTime)).append("\n");
    sb.append("    vsSeScaleoutReadyTimeout: ").append(toIndentedString(vsSeScaleoutReadyTimeout)).append("\n");
    sb.append("    vsSwitchoverTimeout: ").append(toIndentedString(vsSwitchoverTimeout)).append("\n");
    sb.append("    vssPlacement: ").append(toIndentedString(vssPlacement)).append("\n");
    sb.append("    vssPlacementEnabled: ").append(toIndentedString(vssPlacementEnabled)).append("\n");
    sb.append("    wafLearningInterval: ").append(toIndentedString(wafLearningInterval)).append("\n");
    sb.append("    wafLearningMemory: ").append(toIndentedString(wafLearningMemory)).append("\n");
    sb.append("    wafMempool: ").append(toIndentedString(wafMempool)).append("\n");
    sb.append("    wafMempoolSize: ").append(toIndentedString(wafMempoolSize)).append("\n");
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

