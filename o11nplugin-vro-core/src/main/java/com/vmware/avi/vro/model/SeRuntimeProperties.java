package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AppHdr;
import com.vmware.avi.vro.model.DosThresholdProfile;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.PortRange;
import com.vmware.avi.vro.model.SeRateLimiters;
import com.vmware.avi.vro.model.SeRuntimeCompressionProperties;
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
 * SeRuntimeProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SeRuntimeProperties")
@VsoFinder(name = Constants.FINDER_VRO_SERUNTIMEPROPERTIES, idAccessor = "getObjectID()")
@Service
public class SeRuntimeProperties extends AviRestResource  {
  @JsonProperty("admin_ssh_enabled")
  private Boolean adminSshEnabled = true;

  @JsonProperty("app_headers")
  @Valid
  private List<AppHdr> appHeaders = null;

  @JsonProperty("baremetal_dispatcher_handles_flows")
  private Boolean baremetalDispatcherHandlesFlows = null;

  @JsonProperty("connections_lossy_log_rate_limiter_threshold")
  private Integer connectionsLossyLogRateLimiterThreshold = 1000;

  @JsonProperty("connections_udfnf_log_rate_limiter_threshold")
  private Integer connectionsUdfnfLogRateLimiterThreshold = 1000;

  @JsonProperty("disable_flow_probes")
  private Boolean disableFlowProbes = null;

  @JsonProperty("disable_gro")
  private Boolean disableGro = null;

  @JsonProperty("disable_tso")
  private Boolean disableTso = null;

  @JsonProperty("dos_profile")
  private DosThresholdProfile dosProfile = null;

  @JsonProperty("downstream_send_timeout")
  private Integer downstreamSendTimeout = 3600000;

  @JsonProperty("dp_aggressive_hb_frequency")
  private Integer dpAggressiveHbFrequency = 100;

  @JsonProperty("dp_aggressive_hb_timeout_count")
  private Integer dpAggressiveHbTimeoutCount = 10;

  @JsonProperty("dp_hb_frequency")
  private Integer dpHbFrequency = 100;

  @JsonProperty("dp_hb_timeout_count")
  private Integer dpHbTimeoutCount = 10;

  @JsonProperty("dupip_frequency")
  private Integer dupipFrequency = null;

  @JsonProperty("dupip_timeout_count")
  private Integer dupipTimeoutCount = 5;

  @JsonProperty("enable_hsm_log")
  private Boolean enableHsmLog = null;

  @JsonProperty("feproxy_vips_enable_proxy_arp")
  private Boolean feproxyVipsEnableProxyArp = true;

  @JsonProperty("flow_table_batch_push_frequency")
  private Integer flowTableBatchPushFrequency = 5;

  @JsonProperty("flow_table_max_entries_deprecated")
  private Integer flowTableMaxEntriesDeprecated = 100000000;

  @JsonProperty("flow_table_new_syn_max_entries")
  private Integer flowTableNewSynMaxEntries = 40000;

  @JsonProperty("global_mtu")
  private Integer globalMtu = null;

  @JsonProperty("http_rum_console_log")
  private Boolean httpRumConsoleLog = null;

  @JsonProperty("http_rum_min_content_length")
  private Integer httpRumMinContentLength = 64;

  @JsonProperty("lb_batch_push_frequency")
  private Integer lbBatchPushFrequency = 5;

  @JsonProperty("lb_fail_max_time")
  private Integer lbFailMaxTime = 5;

  @JsonProperty("lbaction_num_requests_to_dispatch")
  private Integer lbactionNumRequestsToDispatch = 4;

  @JsonProperty("lbaction_rq_per_request_max_retries")
  private Integer lbactionRqPerRequestMaxRetries = 22;

  @JsonProperty("log_agent_compress_logs")
  private Boolean logAgentCompressLogs = true;

  @JsonProperty("log_agent_conn_send_buffer_size")
  private Integer logAgentConnSendBufferSize = 16384;

  @JsonProperty("log_agent_export_msg_buffer_size")
  private Integer logAgentExportMsgBufferSize = 524288;

  @JsonProperty("log_agent_export_wait_time")
  private Integer logAgentExportWaitTime = 100;

  @JsonProperty("log_agent_file_sz_appl")
  private Integer logAgentFileSzAppl = 4;

  @JsonProperty("log_agent_file_sz_conn")
  private Integer logAgentFileSzConn = 4;

  @JsonProperty("log_agent_file_sz_debug")
  private Integer logAgentFileSzDebug = 4;

  @JsonProperty("log_agent_file_sz_event")
  private Integer logAgentFileSzEvent = 4;

  @JsonProperty("log_agent_log_storage_min_sz")
  private Integer logAgentLogStorageMinSz = 1024;

  @JsonProperty("log_agent_max_active_adf_files_per_vs")
  private Integer logAgentMaxActiveAdfFilesPerVs = 100;

  @JsonProperty("log_agent_max_concurrent_rsync")
  private Integer logAgentMaxConcurrentRsync = 1024;

  @JsonProperty("log_agent_max_logmessage_proto_sz")
  private Integer logAgentMaxLogmessageProtoSz = 65536;

  @JsonProperty("log_agent_max_storage_excess_percent")
  private Integer logAgentMaxStorageExcessPercent = 110;

  @JsonProperty("log_agent_max_storage_ignore_percent")
  private Float logAgentMaxStorageIgnorePercent = 20.0f;

  @JsonProperty("log_agent_min_storage_per_vs")
  private Integer logAgentMinStoragePerVs = 10;

  @JsonProperty("log_agent_pause_interval")
  private Integer logAgentPauseInterval = null;

  @JsonProperty("log_agent_sleep_interval")
  private Integer logAgentSleepInterval = 10;

  @JsonProperty("log_agent_unknown_vs_timer")
  private Integer logAgentUnknownVsTimer = 1800;

  @JsonProperty("log_message_max_file_list_size")
  private Integer logMessageMaxFileListSize = 64;

  @JsonProperty("max_throughput")
  private Integer maxThroughput = 10000;

  @JsonProperty("mcache_enabled")
  private Boolean mcacheEnabled = null;

  @JsonProperty("mcache_fetch_enabled")
  private Boolean mcacheFetchEnabled = null;

  @JsonProperty("mcache_max_cache_size")
  private Long mcacheMaxCacheSize = null;

  @JsonProperty("mcache_store_in_enabled")
  private Boolean mcacheStoreInEnabled = null;

  @JsonProperty("mcache_store_in_max_size")
  private Integer mcacheStoreInMaxSize = null;

  @JsonProperty("mcache_store_in_min_size")
  private Integer mcacheStoreInMinSize = null;

  @JsonProperty("mcache_store_out_enabled")
  private Boolean mcacheStoreOutEnabled = null;

  @JsonProperty("mcache_store_se_max_size")
  private Long mcacheStoreSeMaxSize = null;

  @JsonProperty("ngx_free_connection_stack")
  private Boolean ngxFreeConnectionStack = null;

  @JsonProperty("persistence_entries_low_watermark")
  private Integer persistenceEntriesLowWatermark = 20000;

  @JsonProperty("persistence_mem_max")
  private Integer persistenceMemMax = null;

  @JsonProperty("scaleout_udp_per_pkt")
  private Boolean scaleoutUdpPerPkt = true;

  @JsonProperty("se_auth_ldap_bind_timeout")
  private Integer seAuthLdapBindTimeout = 5000;

  @JsonProperty("se_auth_ldap_cache_size")
  private Integer seAuthLdapCacheSize = 100000;

  @JsonProperty("se_auth_ldap_connect_timeout")
  private Integer seAuthLdapConnectTimeout = 10000;

  @JsonProperty("se_auth_ldap_conns_per_server")
  private Integer seAuthLdapConnsPerServer = 1;

  @JsonProperty("se_auth_ldap_reconnect_timeout")
  private Integer seAuthLdapReconnectTimeout = 10000;

  @JsonProperty("se_auth_ldap_request_timeout")
  private Integer seAuthLdapRequestTimeout = 10000;

  @JsonProperty("se_auth_ldap_servers_failover_only")
  private Boolean seAuthLdapServersFailoverOnly = null;

  @JsonProperty("se_dp_compression")
  private SeRuntimeCompressionProperties seDpCompression = null;

  @JsonProperty("se_dp_hm_drops")
  private Integer seDpHmDrops = null;

  @JsonProperty("se_dp_if_state_poll_interval")
  private Integer seDpIfStatePollInterval = 10;

  @JsonProperty("se_dp_log_nf_enqueue_percent")
  private Integer seDpLogNfEnqueuePercent = 70;

  @JsonProperty("se_dp_log_udf_enqueue_percent")
  private Integer seDpLogUdfEnqueuePercent = 90;

  @JsonProperty("se_dp_vnic_queue_stall_event_sleep")
  private Integer seDpVnicQueueStallEventSleep = null;

  @JsonProperty("se_dp_vnic_queue_stall_threshold")
  private Integer seDpVnicQueueStallThreshold = null;

  @JsonProperty("se_dp_vnic_queue_stall_timeout")
  private Integer seDpVnicQueueStallTimeout = null;

  @JsonProperty("se_dp_vnic_restart_on_queue_stall_count")
  private Integer seDpVnicRestartOnQueueStallCount = null;

  @JsonProperty("se_dp_vnic_stall_se_restart_window")
  private Integer seDpVnicStallSeRestartWindow = null;

  @JsonProperty("se_dump_core_on_assert")
  private Boolean seDumpCoreOnAssert = null;

  @JsonProperty("se_handle_interface_routes")
  private Boolean seHandleInterfaceRoutes = null;

  @JsonProperty("se_hb_persist_fudge_bits")
  private Integer seHbPersistFudgeBits = 3;

  @JsonProperty("se_mac_error_threshold_to_disable_promiscious")
  private Integer seMacErrorThresholdToDisablePromiscious = 1000;

  @JsonProperty("se_malloc_thresh")
  private Integer seMallocThresh = null;

  @JsonProperty("se_memory_poison")
  private Boolean seMemoryPoison = true;

  @JsonProperty("se_metrics_interval")
  private Integer seMetricsInterval = 60000;

  @JsonProperty("se_metrics_rt_enabled")
  private Boolean seMetricsRtEnabled = true;

  @JsonProperty("se_metrics_rt_interval")
  private Integer seMetricsRtInterval = 1000;

  @JsonProperty("se_packet_buffer_max")
  private Integer sePacketBufferMax = null;

  @JsonProperty("se_random_tcp_drops")
  private Boolean seRandomTcpDrops = null;

  @JsonProperty("se_rate_limiters")
  private SeRateLimiters seRateLimiters = null;

  @JsonProperty("service_ip_subnets")
  @Valid
  private List<IpAddrPrefix> serviceIpSubnets = null;

  @JsonProperty("service_port_ranges")
  @Valid
  private List<PortRange> servicePortRanges = null;

  @JsonProperty("services_accessible_all_interfaces")
  private Boolean servicesAccessibleAllInterfaces = null;

  @JsonProperty("spdy_fwd_proxy_parse_enable")
  private Boolean spdyFwdProxyParseEnable = true;

  @JsonProperty("tcp_syn_cache_max")
  private Integer tcpSynCacheMax = 32768;

  @JsonProperty("tcp_syncache_max_retransmit_default")
  private Integer tcpSyncacheMaxRetransmitDefault = 4;

  @JsonProperty("upstream_connect_timeout")
  private Integer upstreamConnectTimeout = 3600000;

  @JsonProperty("upstream_connpool_cache_thresh")
  private Integer upstreamConnpoolCacheThresh = -1;

  @JsonProperty("upstream_connpool_conn_idle_thresh_tmo")
  private Integer upstreamConnpoolConnIdleThreshTmo = -1;

  @JsonProperty("upstream_connpool_conn_idle_tmo")
  private Integer upstreamConnpoolConnIdleTmo = null;

  @JsonProperty("upstream_connpool_conn_life_tmo")
  private Integer upstreamConnpoolConnLifeTmo = null;

  @JsonProperty("upstream_connpool_conn_max_reuse")
  private Integer upstreamConnpoolConnMaxReuse = null;

  @JsonProperty("upstream_connpool_core_max_cache")
  private Integer upstreamConnpoolCoreMaxCache = -1;

  @JsonProperty("upstream_connpool_enable")
  private Boolean upstreamConnpoolEnable = true;

  @JsonProperty("upstream_connpool_server_max_cache")
  private Integer upstreamConnpoolServerMaxCache = null;

  @JsonProperty("upstream_connpool_strategy")
  private Integer upstreamConnpoolStrategy = -1;

  @JsonProperty("upstream_keepalive")
  private Boolean upstreamKeepalive = null;

  @JsonProperty("upstream_read_timeout")
  private Integer upstreamReadTimeout = 3600000;

  @JsonProperty("upstream_send_timeout")
  private Integer upstreamSendTimeout = 3600000;

  @JsonProperty("user_defined_metric_age")
  private Integer userDefinedMetricAge = 60;

  
  /**
   * Allow admin user ssh access to SE. Field introduced in 18.2.5.
   * @return adminSshEnabled
  **/
  @ApiModelProperty(value = "Allow admin user ssh access to SE. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isAdminSshEnabled() {
    return adminSshEnabled;
  }
    
  @VsoMethod
  public void setAdminSshEnabled(Boolean adminSshEnabled) {
    this.adminSshEnabled = adminSshEnabled;
  }

  
  public SeRuntimeProperties addAppHeadersItem(AppHdr appHeadersItem) {
    if (this.appHeaders == null) {
      this.appHeaders = new ArrayList<AppHdr>();
    }
    this.appHeaders.add(appHeadersItem);
    return this;
  }
  
  /**
   * Placeholder for description of property app_headers of obj type SeRuntimeProperties field type str  type object
   * @return appHeaders
  **/
  @ApiModelProperty(value = "Placeholder for description of property app_headers of obj type SeRuntimeProperties field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<AppHdr> getAppHeaders() {
    return appHeaders;
  }
    
  @VsoMethod
  public void setAppHeaders(List<AppHdr> appHeaders) {
    this.appHeaders = appHeaders;
  }

  
  /**
   * Control if dispatcher core also handles TCP flows in baremetal SE.
   * @return baremetalDispatcherHandlesFlows
  **/
  @ApiModelProperty(value = "Control if dispatcher core also handles TCP flows in baremetal SE.")


 
  @VsoMethod  
  public Boolean isBaremetalDispatcherHandlesFlows() {
    return baremetalDispatcherHandlesFlows;
  }
    
  @VsoMethod
  public void setBaremetalDispatcherHandlesFlows(Boolean baremetalDispatcherHandlesFlows) {
    this.baremetalDispatcherHandlesFlows = baremetalDispatcherHandlesFlows;
  }

  
  /**
   * Rate limit on maximum adf lossy log to pushper second.
   * @return connectionsLossyLogRateLimiterThreshold
  **/
  @ApiModelProperty(value = "Rate limit on maximum adf lossy log to pushper second.")


 
  @VsoMethod  
  public Integer getConnectionsLossyLogRateLimiterThreshold() {
    return connectionsLossyLogRateLimiterThreshold;
  }
    
  @VsoMethod
  public void setConnectionsLossyLogRateLimiterThreshold(Integer connectionsLossyLogRateLimiterThreshold) {
    this.connectionsLossyLogRateLimiterThreshold = connectionsLossyLogRateLimiterThreshold;
  }

  
  /**
   * Rate limit on maximum adf udf or nf log to pushper second.
   * @return connectionsUdfnfLogRateLimiterThreshold
  **/
  @ApiModelProperty(value = "Rate limit on maximum adf udf or nf log to pushper second.")


 
  @VsoMethod  
  public Integer getConnectionsUdfnfLogRateLimiterThreshold() {
    return connectionsUdfnfLogRateLimiterThreshold;
  }
    
  @VsoMethod
  public void setConnectionsUdfnfLogRateLimiterThreshold(Integer connectionsUdfnfLogRateLimiterThreshold) {
    this.connectionsUdfnfLogRateLimiterThreshold = connectionsUdfnfLogRateLimiterThreshold;
  }

  
  /**
   * Disable Flow Probes for Scaled out VS'es. Field introduced in 17.1.1.
   * @return disableFlowProbes
  **/
  @ApiModelProperty(value = "Disable Flow Probes for Scaled out VS'es. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isDisableFlowProbes() {
    return disableFlowProbes;
  }
    
  @VsoMethod
  public void setDisableFlowProbes(Boolean disableFlowProbes) {
    this.disableFlowProbes = disableFlowProbes;
  }

  
  /**
   * Deprecated. Field deprecated in 17.2.5. Field introduced in 17.2.1.
   * @return disableGro
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 17.2.5. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public Boolean isDisableGro() {
    return disableGro;
  }
    
  @VsoMethod
  public void setDisableGro(Boolean disableGro) {
    this.disableGro = disableGro;
  }

  
  /**
   * Deprecated. Field deprecated in 17.2.5. Field introduced in 17.2.4.
   * @return disableTso
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 17.2.5. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public Boolean isDisableTso() {
    return disableTso;
  }
    
  @VsoMethod
  public void setDisableTso(Boolean disableTso) {
    this.disableTso = disableTso;
  }

  
  /**
   * Placeholder for description of property dos_profile of obj type SeRuntimeProperties field type str  type object
   * @return dosProfile
  **/
  @ApiModelProperty(value = "Placeholder for description of property dos_profile of obj type SeRuntimeProperties field type str  type object")

  @Valid

 
  @VsoMethod  
  public DosThresholdProfile getDosProfile() {
    return dosProfile;
  }
    
  @VsoMethod
  public void setDosProfile(DosThresholdProfile dosProfile) {
    this.dosProfile = dosProfile;
  }

  
  /**
   * Timeout for downstream to become writable.
   * @return downstreamSendTimeout
  **/
  @ApiModelProperty(value = "Timeout for downstream to become writable.")


 
  @VsoMethod  
  public Integer getDownstreamSendTimeout() {
    return downstreamSendTimeout;
  }
    
  @VsoMethod
  public void setDownstreamSendTimeout(Integer downstreamSendTimeout) {
    this.downstreamSendTimeout = downstreamSendTimeout;
  }

  
  /**
   * Frequency of SE - SE HB messages when aggressive failure mode detection is enabled.
   * @return dpAggressiveHbFrequency
  **/
  @ApiModelProperty(value = "Frequency of SE - SE HB messages when aggressive failure mode detection is enabled.")


 
  @VsoMethod  
  public Integer getDpAggressiveHbFrequency() {
    return dpAggressiveHbFrequency;
  }
    
  @VsoMethod
  public void setDpAggressiveHbFrequency(Integer dpAggressiveHbFrequency) {
    this.dpAggressiveHbFrequency = dpAggressiveHbFrequency;
  }

  
  /**
   * Consecutive HB failures after which failure is reported to controller,when aggressive failure mode detection is enabled.
   * @return dpAggressiveHbTimeoutCount
  **/
  @ApiModelProperty(value = "Consecutive HB failures after which failure is reported to controller,when aggressive failure mode detection is enabled.")


 
  @VsoMethod  
  public Integer getDpAggressiveHbTimeoutCount() {
    return dpAggressiveHbTimeoutCount;
  }
    
  @VsoMethod
  public void setDpAggressiveHbTimeoutCount(Integer dpAggressiveHbTimeoutCount) {
    this.dpAggressiveHbTimeoutCount = dpAggressiveHbTimeoutCount;
  }

  
  /**
   * Frequency of SE - SE HB messages when aggressive failure mode detection is not enabled.
   * @return dpHbFrequency
  **/
  @ApiModelProperty(value = "Frequency of SE - SE HB messages when aggressive failure mode detection is not enabled.")


 
  @VsoMethod  
  public Integer getDpHbFrequency() {
    return dpHbFrequency;
  }
    
  @VsoMethod
  public void setDpHbFrequency(Integer dpHbFrequency) {
    this.dpHbFrequency = dpHbFrequency;
  }

  
  /**
   * Consecutive HB failures after which failure is reported to controller, when aggressive failure mode detection is not enabled.
   * @return dpHbTimeoutCount
  **/
  @ApiModelProperty(value = "Consecutive HB failures after which failure is reported to controller, when aggressive failure mode detection is not enabled.")


 
  @VsoMethod  
  public Integer getDpHbTimeoutCount() {
    return dpHbTimeoutCount;
  }
    
  @VsoMethod
  public void setDpHbTimeoutCount(Integer dpHbTimeoutCount) {
    this.dpHbTimeoutCount = dpHbTimeoutCount;
  }

  
  /**
   * Frequency of ARP requests sent by SE for each VIP to detect duplicate IP when it loses conectivity to controller.
   * @return dupipFrequency
  **/
  @ApiModelProperty(value = "Frequency of ARP requests sent by SE for each VIP to detect duplicate IP when it loses conectivity to controller.")


 
  @VsoMethod  
  public Integer getDupipFrequency() {
    return dupipFrequency;
  }
    
  @VsoMethod
  public void setDupipFrequency(Integer dupipFrequency) {
    this.dupipFrequency = dupipFrequency;
  }

  
  /**
   * Number of ARP responses received for the VIP after which SE decides that the VIP has been moved and disables the VIP.
   * @return dupipTimeoutCount
  **/
  @ApiModelProperty(value = "Number of ARP responses received for the VIP after which SE decides that the VIP has been moved and disables the VIP.")


 
  @VsoMethod  
  public Integer getDupipTimeoutCount() {
    return dupipTimeoutCount;
  }
    
  @VsoMethod
  public void setDupipTimeoutCount(Integer dupipTimeoutCount) {
    this.dupipTimeoutCount = dupipTimeoutCount;
  }

  
  /**
   * Enable HSM luna engine logs. Field introduced in 16.4.8, 17.1.11, 17.2.3.
   * @return enableHsmLog
  **/
  @ApiModelProperty(value = "Enable HSM luna engine logs. Field introduced in 16.4.8, 17.1.11, 17.2.3.")


 
  @VsoMethod  
  public Boolean isEnableHsmLog() {
    return enableHsmLog;
  }
    
  @VsoMethod
  public void setEnableHsmLog(Boolean enableHsmLog) {
    this.enableHsmLog = enableHsmLog;
  }

  
  /**
   * Enable proxy ARP from Host interface for Front End  proxies.
   * @return feproxyVipsEnableProxyArp
  **/
  @ApiModelProperty(value = "Enable proxy ARP from Host interface for Front End  proxies.")


 
  @VsoMethod  
  public Boolean isFeproxyVipsEnableProxyArp() {
    return feproxyVipsEnableProxyArp;
  }
    
  @VsoMethod
  public void setFeproxyVipsEnableProxyArp(Boolean feproxyVipsEnableProxyArp) {
    this.feproxyVipsEnableProxyArp = feproxyVipsEnableProxyArp;
  }

  
  /**
   * How often to push the flow table IPC messages in the main loop. The value is the number of times through the loop before pushing the batch. i.e, a value of 1 means every time through the loop.
   * @return flowTableBatchPushFrequency
  **/
  @ApiModelProperty(value = "How often to push the flow table IPC messages in the main loop. The value is the number of times through the loop before pushing the batch. i.e, a value of 1 means every time through the loop.")


 
  @VsoMethod  
  public Integer getFlowTableBatchPushFrequency() {
    return flowTableBatchPushFrequency;
  }
    
  @VsoMethod
  public void setFlowTableBatchPushFrequency(Integer flowTableBatchPushFrequency) {
    this.flowTableBatchPushFrequency = flowTableBatchPushFrequency;
  }

  
  /**
   * Deprecated. Field deprecated in 17.1.1.
   * @return flowTableMaxEntriesDeprecated
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public Integer getFlowTableMaxEntriesDeprecated() {
    return flowTableMaxEntriesDeprecated;
  }
    
  @VsoMethod
  public void setFlowTableMaxEntriesDeprecated(Integer flowTableMaxEntriesDeprecated) {
    this.flowTableMaxEntriesDeprecated = flowTableMaxEntriesDeprecated;
  }

  
  /**
   * Deprecated. Field deprecated in 17.2.5.
   * @return flowTableNewSynMaxEntries
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 17.2.5.")


 
  @VsoMethod  
  public Integer getFlowTableNewSynMaxEntries() {
    return flowTableNewSynMaxEntries;
  }
    
  @VsoMethod
  public void setFlowTableNewSynMaxEntries(Integer flowTableNewSynMaxEntries) {
    this.flowTableNewSynMaxEntries = flowTableNewSynMaxEntries;
  }

  
  /**
   * Overrides the MTU value received via DHCP or some other means. Use this when the infrastructure advertises an MTU that is not supported by all devices in the network. For example, in AWS or when an overlay is used.
   * @return globalMtu
  **/
  @ApiModelProperty(value = "Overrides the MTU value received via DHCP or some other means. Use this when the infrastructure advertises an MTU that is not supported by all devices in the network. For example, in AWS or when an overlay is used.")


 
  @VsoMethod  
  public Integer getGlobalMtu() {
    return globalMtu;
  }
    
  @VsoMethod
  public void setGlobalMtu(Integer globalMtu) {
    this.globalMtu = globalMtu;
  }

  
  /**
   * Enable Javascript console logs on the client browser when collecting client insights.
   * @return httpRumConsoleLog
  **/
  @ApiModelProperty(value = "Enable Javascript console logs on the client browser when collecting client insights.")


 
  @VsoMethod  
  public Boolean isHttpRumConsoleLog() {
    return httpRumConsoleLog;
  }
    
  @VsoMethod
  public void setHttpRumConsoleLog(Boolean httpRumConsoleLog) {
    this.httpRumConsoleLog = httpRumConsoleLog;
  }

  
  /**
   * Minimum response size content length to sample for client insights.
   * @return httpRumMinContentLength
  **/
  @ApiModelProperty(value = "Minimum response size content length to sample for client insights.")


 
  @VsoMethod  
  public Integer getHttpRumMinContentLength() {
    return httpRumMinContentLength;
  }
    
  @VsoMethod
  public void setHttpRumMinContentLength(Integer httpRumMinContentLength) {
    this.httpRumMinContentLength = httpRumMinContentLength;
  }

  
  /**
   * How often to push the LB IPC messages in the main loop. The value is the number of times the loop has to run before pushing the batch. i.e, a value of 1 means the batch is pushed every time the loop runs. Field deprecated in 18.1.3. Field introduced in 17.2.8.
   * @return lbBatchPushFrequency
  **/
  @ApiModelProperty(value = "How often to push the LB IPC messages in the main loop. The value is the number of times the loop has to run before pushing the batch. i.e, a value of 1 means the batch is pushed every time the loop runs. Field deprecated in 18.1.3. Field introduced in 17.2.8.")


 
  @VsoMethod  
  public Integer getLbBatchPushFrequency() {
    return lbBatchPushFrequency;
  }
    
  @VsoMethod
  public void setLbBatchPushFrequency(Integer lbBatchPushFrequency) {
    this.lbBatchPushFrequency = lbBatchPushFrequency;
  }

  
  /**
   * Deprecated. Field deprecated in 17.1.1.
   * @return lbFailMaxTime
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public Integer getLbFailMaxTime() {
    return lbFailMaxTime;
  }
    
  @VsoMethod
  public void setLbFailMaxTime(Integer lbFailMaxTime) {
    this.lbFailMaxTime = lbFailMaxTime;
  }

  
  /**
   * Number of requests to dispatch from the request queue at a regular interval.
   * @return lbactionNumRequestsToDispatch
  **/
  @ApiModelProperty(value = "Number of requests to dispatch from the request queue at a regular interval.")


 
  @VsoMethod  
  public Integer getLbactionNumRequestsToDispatch() {
    return lbactionNumRequestsToDispatch;
  }
    
  @VsoMethod
  public void setLbactionNumRequestsToDispatch(Integer lbactionNumRequestsToDispatch) {
    this.lbactionNumRequestsToDispatch = lbactionNumRequestsToDispatch;
  }

  
  /**
   * Maximum retries per request in the request queue.
   * @return lbactionRqPerRequestMaxRetries
  **/
  @ApiModelProperty(value = "Maximum retries per request in the request queue.")


 
  @VsoMethod  
  public Integer getLbactionRqPerRequestMaxRetries() {
    return lbactionRqPerRequestMaxRetries;
  }
    
  @VsoMethod
  public void setLbactionRqPerRequestMaxRetries(Integer lbactionRqPerRequestMaxRetries) {
    this.lbactionRqPerRequestMaxRetries = lbactionRqPerRequestMaxRetries;
  }

  
  /**
   * Flag to indicate if log files are compressed upon full on the Service Engine.
   * @return logAgentCompressLogs
  **/
  @ApiModelProperty(value = "Flag to indicate if log files are compressed upon full on the Service Engine.")


 
  @VsoMethod  
  public Boolean isLogAgentCompressLogs() {
    return logAgentCompressLogs;
  }
    
  @VsoMethod
  public void setLogAgentCompressLogs(Boolean logAgentCompressLogs) {
    this.logAgentCompressLogs = logAgentCompressLogs;
  }

  
  /**
   * Log-agent test property used to simulate slow TCP connections.
   * @return logAgentConnSendBufferSize
  **/
  @ApiModelProperty(value = "Log-agent test property used to simulate slow TCP connections.")


 
  @VsoMethod  
  public Integer getLogAgentConnSendBufferSize() {
    return logAgentConnSendBufferSize;
  }
    
  @VsoMethod
  public void setLogAgentConnSendBufferSize(Integer logAgentConnSendBufferSize) {
    this.logAgentConnSendBufferSize = logAgentConnSendBufferSize;
  }

  
  /**
   * Maximum size of data sent by log-agent to Controller over the TCP connection.
   * @return logAgentExportMsgBufferSize
  **/
  @ApiModelProperty(value = "Maximum size of data sent by log-agent to Controller over the TCP connection.")


 
  @VsoMethod  
  public Integer getLogAgentExportMsgBufferSize() {
    return logAgentExportMsgBufferSize;
  }
    
  @VsoMethod
  public void setLogAgentExportMsgBufferSize(Integer logAgentExportMsgBufferSize) {
    this.logAgentExportMsgBufferSize = logAgentExportMsgBufferSize;
  }

  
  /**
   * Time log-agent waits before sending data to the Controller.
   * @return logAgentExportWaitTime
  **/
  @ApiModelProperty(value = "Time log-agent waits before sending data to the Controller.")


 
  @VsoMethod  
  public Integer getLogAgentExportWaitTime() {
    return logAgentExportWaitTime;
  }
    
  @VsoMethod
  public void setLogAgentExportWaitTime(Integer logAgentExportWaitTime) {
    this.logAgentExportWaitTime = logAgentExportWaitTime;
  }

  
  /**
   * Maximum application log file size before rollover.
   * @return logAgentFileSzAppl
  **/
  @ApiModelProperty(value = "Maximum application log file size before rollover.")


 
  @VsoMethod  
  public Integer getLogAgentFileSzAppl() {
    return logAgentFileSzAppl;
  }
    
  @VsoMethod
  public void setLogAgentFileSzAppl(Integer logAgentFileSzAppl) {
    this.logAgentFileSzAppl = logAgentFileSzAppl;
  }

  
  /**
   * Maximum connection log file size before rollover.
   * @return logAgentFileSzConn
  **/
  @ApiModelProperty(value = "Maximum connection log file size before rollover.")


 
  @VsoMethod  
  public Integer getLogAgentFileSzConn() {
    return logAgentFileSzConn;
  }
    
  @VsoMethod
  public void setLogAgentFileSzConn(Integer logAgentFileSzConn) {
    this.logAgentFileSzConn = logAgentFileSzConn;
  }

  
  /**
   * Maximum debug log file size before rollover.
   * @return logAgentFileSzDebug
  **/
  @ApiModelProperty(value = "Maximum debug log file size before rollover.")


 
  @VsoMethod  
  public Integer getLogAgentFileSzDebug() {
    return logAgentFileSzDebug;
  }
    
  @VsoMethod
  public void setLogAgentFileSzDebug(Integer logAgentFileSzDebug) {
    this.logAgentFileSzDebug = logAgentFileSzDebug;
  }

  
  /**
   * Maximum event log file size before rollover.
   * @return logAgentFileSzEvent
  **/
  @ApiModelProperty(value = "Maximum event log file size before rollover.")


 
  @VsoMethod  
  public Integer getLogAgentFileSzEvent() {
    return logAgentFileSzEvent;
  }
    
  @VsoMethod
  public void setLogAgentFileSzEvent(Integer logAgentFileSzEvent) {
    this.logAgentFileSzEvent = logAgentFileSzEvent;
  }

  
  /**
   * Minimum storage allocated for logs irrespective of memory and cores.
   * @return logAgentLogStorageMinSz
  **/
  @ApiModelProperty(value = "Minimum storage allocated for logs irrespective of memory and cores.")


 
  @VsoMethod  
  public Integer getLogAgentLogStorageMinSz() {
    return logAgentLogStorageMinSz;
  }
    
  @VsoMethod
  public void setLogAgentLogStorageMinSz(Integer logAgentLogStorageMinSz) {
    this.logAgentLogStorageMinSz = logAgentLogStorageMinSz;
  }

  
  /**
   * Maximum number of Virtual Service log files maintained for significant logs on the Service Engine.
   * @return logAgentMaxActiveAdfFilesPerVs
  **/
  @ApiModelProperty(value = "Maximum number of Virtual Service log files maintained for significant logs on the Service Engine.")


 
  @VsoMethod  
  public Integer getLogAgentMaxActiveAdfFilesPerVs() {
    return logAgentMaxActiveAdfFilesPerVs;
  }
    
  @VsoMethod
  public void setLogAgentMaxActiveAdfFilesPerVs(Integer logAgentMaxActiveAdfFilesPerVs) {
    this.logAgentMaxActiveAdfFilesPerVs = logAgentMaxActiveAdfFilesPerVs;
  }

  
  /**
   * Maximum concurrent rsync requests initiated from log-agent to the Controller.
   * @return logAgentMaxConcurrentRsync
  **/
  @ApiModelProperty(value = "Maximum concurrent rsync requests initiated from log-agent to the Controller.")


 
  @VsoMethod  
  public Integer getLogAgentMaxConcurrentRsync() {
    return logAgentMaxConcurrentRsync;
  }
    
  @VsoMethod
  public void setLogAgentMaxConcurrentRsync(Integer logAgentMaxConcurrentRsync) {
    this.logAgentMaxConcurrentRsync = logAgentMaxConcurrentRsync;
  }

  
  /**
   * Maximum size of serialized log message on the Service Engine.
   * @return logAgentMaxLogmessageProtoSz
  **/
  @ApiModelProperty(value = "Maximum size of serialized log message on the Service Engine.")


 
  @VsoMethod  
  public Integer getLogAgentMaxLogmessageProtoSz() {
    return logAgentMaxLogmessageProtoSz;
  }
    
  @VsoMethod
  public void setLogAgentMaxLogmessageProtoSz(Integer logAgentMaxLogmessageProtoSz) {
    this.logAgentMaxLogmessageProtoSz = logAgentMaxLogmessageProtoSz;
  }

  
  /**
   * Excess percentage threshold of disk size to trigger cleanup of logs on the Service Engine.
   * @return logAgentMaxStorageExcessPercent
  **/
  @ApiModelProperty(value = "Excess percentage threshold of disk size to trigger cleanup of logs on the Service Engine.")


 
  @VsoMethod  
  public Integer getLogAgentMaxStorageExcessPercent() {
    return logAgentMaxStorageExcessPercent;
  }
    
  @VsoMethod
  public void setLogAgentMaxStorageExcessPercent(Integer logAgentMaxStorageExcessPercent) {
    this.logAgentMaxStorageExcessPercent = logAgentMaxStorageExcessPercent;
  }

  
  /**
   * Maximum storage on the disk not allocated for logs on the Service Engine.
   * @return logAgentMaxStorageIgnorePercent
  **/
  @ApiModelProperty(value = "Maximum storage on the disk not allocated for logs on the Service Engine.")


 
  @VsoMethod  
  public Float getLogAgentMaxStorageIgnorePercent() {
    return logAgentMaxStorageIgnorePercent;
  }
    
  @VsoMethod
  public void setLogAgentMaxStorageIgnorePercent(Float logAgentMaxStorageIgnorePercent) {
    this.logAgentMaxStorageIgnorePercent = logAgentMaxStorageIgnorePercent;
  }

  
  /**
   * Minimum storage allocated to any given VirtualService on the Service Engine.
   * @return logAgentMinStoragePerVs
  **/
  @ApiModelProperty(value = "Minimum storage allocated to any given VirtualService on the Service Engine.")


 
  @VsoMethod  
  public Integer getLogAgentMinStoragePerVs() {
    return logAgentMinStoragePerVs;
  }
    
  @VsoMethod
  public void setLogAgentMinStoragePerVs(Integer logAgentMinStoragePerVs) {
    this.logAgentMinStoragePerVs = logAgentMinStoragePerVs;
  }

  
  /**
   * Time interval log-agent pauses between logs obtained from the dataplane.
   * @return logAgentPauseInterval
  **/
  @ApiModelProperty(value = "Time interval log-agent pauses between logs obtained from the dataplane.")


 
  @VsoMethod  
  public Integer getLogAgentPauseInterval() {
    return logAgentPauseInterval;
  }
    
  @VsoMethod
  public void setLogAgentPauseInterval(Integer logAgentPauseInterval) {
    this.logAgentPauseInterval = logAgentPauseInterval;
  }

  
  /**
   * Internal timer to stall log-agent and prevent it from hogging CPU cycles on the Service Engine.
   * @return logAgentSleepInterval
  **/
  @ApiModelProperty(value = "Internal timer to stall log-agent and prevent it from hogging CPU cycles on the Service Engine.")


 
  @VsoMethod  
  public Integer getLogAgentSleepInterval() {
    return logAgentSleepInterval;
  }
    
  @VsoMethod
  public void setLogAgentSleepInterval(Integer logAgentSleepInterval) {
    this.logAgentSleepInterval = logAgentSleepInterval;
  }

  
  /**
   * Timeout to purge unknown Virtual Service logs from the Service Engine.
   * @return logAgentUnknownVsTimer
  **/
  @ApiModelProperty(value = "Timeout to purge unknown Virtual Service logs from the Service Engine.")


 
  @VsoMethod  
  public Integer getLogAgentUnknownVsTimer() {
    return logAgentUnknownVsTimer;
  }
    
  @VsoMethod
  public void setLogAgentUnknownVsTimer(Integer logAgentUnknownVsTimer) {
    this.logAgentUnknownVsTimer = logAgentUnknownVsTimer;
  }

  
  /**
   * Maximum number of file names in a log message.
   * @return logMessageMaxFileListSize
  **/
  @ApiModelProperty(value = "Maximum number of file names in a log message.")


 
  @VsoMethod  
  public Integer getLogMessageMaxFileListSize() {
    return logMessageMaxFileListSize;
  }
    
  @VsoMethod
  public void setLogMessageMaxFileListSize(Integer logMessageMaxFileListSize) {
    this.logMessageMaxFileListSize = logMessageMaxFileListSize;
  }

  
  /**
   * Deprecated. Field deprecated in 17.1.1.
   * @return maxThroughput
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public Integer getMaxThroughput() {
    return maxThroughput;
  }
    
  @VsoMethod
  public void setMaxThroughput(Integer maxThroughput) {
    this.maxThroughput = maxThroughput;
  }

  
  /**
   * enables mcache - controls fetch/store/store_out.
   * @return mcacheEnabled
  **/
  @ApiModelProperty(value = "enables mcache - controls fetch/store/store_out.")


 
  @VsoMethod  
  public Boolean isMcacheEnabled() {
    return mcacheEnabled;
  }
    
  @VsoMethod
  public void setMcacheEnabled(Boolean mcacheEnabled) {
    this.mcacheEnabled = mcacheEnabled;
  }

  
  /**
   * enables mcache_fetch.
   * @return mcacheFetchEnabled
  **/
  @ApiModelProperty(value = "enables mcache_fetch.")


 
  @VsoMethod  
  public Boolean isMcacheFetchEnabled() {
    return mcacheFetchEnabled;
  }
    
  @VsoMethod
  public void setMcacheFetchEnabled(Boolean mcacheFetchEnabled) {
    this.mcacheFetchEnabled = mcacheFetchEnabled;
  }

  
  /**
   * Use SE Group's app_cache_percent to set cache memory usage limit on SE. Field deprecated in 18.2.3.
   * @return mcacheMaxCacheSize
  **/
  @ApiModelProperty(value = "Use SE Group's app_cache_percent to set cache memory usage limit on SE. Field deprecated in 18.2.3.")


 
  @VsoMethod  
  public Long getMcacheMaxCacheSize() {
    return mcacheMaxCacheSize;
  }
    
  @VsoMethod
  public void setMcacheMaxCacheSize(Long mcacheMaxCacheSize) {
    this.mcacheMaxCacheSize = mcacheMaxCacheSize;
  }

  
  /**
   * enables mcache_store.
   * @return mcacheStoreInEnabled
  **/
  @ApiModelProperty(value = "enables mcache_store.")


 
  @VsoMethod  
  public Boolean isMcacheStoreInEnabled() {
    return mcacheStoreInEnabled;
  }
    
  @VsoMethod
  public void setMcacheStoreInEnabled(Boolean mcacheStoreInEnabled) {
    this.mcacheStoreInEnabled = mcacheStoreInEnabled;
  }

  
  /**
   * max object size.
   * @return mcacheStoreInMaxSize
  **/
  @ApiModelProperty(value = "max object size.")


 
  @VsoMethod  
  public Integer getMcacheStoreInMaxSize() {
    return mcacheStoreInMaxSize;
  }
    
  @VsoMethod
  public void setMcacheStoreInMaxSize(Integer mcacheStoreInMaxSize) {
    this.mcacheStoreInMaxSize = mcacheStoreInMaxSize;
  }

  
  /**
   * min object size.
   * @return mcacheStoreInMinSize
  **/
  @ApiModelProperty(value = "min object size.")


 
  @VsoMethod  
  public Integer getMcacheStoreInMinSize() {
    return mcacheStoreInMinSize;
  }
    
  @VsoMethod
  public void setMcacheStoreInMinSize(Integer mcacheStoreInMinSize) {
    this.mcacheStoreInMinSize = mcacheStoreInMinSize;
  }

  
  /**
   * enables mcache_store_out.
   * @return mcacheStoreOutEnabled
  **/
  @ApiModelProperty(value = "enables mcache_store_out.")


 
  @VsoMethod  
  public Boolean isMcacheStoreOutEnabled() {
    return mcacheStoreOutEnabled;
  }
    
  @VsoMethod
  public void setMcacheStoreOutEnabled(Boolean mcacheStoreOutEnabled) {
    this.mcacheStoreOutEnabled = mcacheStoreOutEnabled;
  }

  
  /**
   * Use SE Group's app_cache_percent to set cache memory usage limit on SE. Field deprecated in 18.2.3.
   * @return mcacheStoreSeMaxSize
  **/
  @ApiModelProperty(value = "Use SE Group's app_cache_percent to set cache memory usage limit on SE. Field deprecated in 18.2.3.")


 
  @VsoMethod  
  public Long getMcacheStoreSeMaxSize() {
    return mcacheStoreSeMaxSize;
  }
    
  @VsoMethod
  public void setMcacheStoreSeMaxSize(Long mcacheStoreSeMaxSize) {
    this.mcacheStoreSeMaxSize = mcacheStoreSeMaxSize;
  }

  
  /**
   * Placeholder for description of property ngx_free_connection_stack of obj type SeRuntimeProperties field type str  type boolean
   * @return ngxFreeConnectionStack
  **/
  @ApiModelProperty(value = "Placeholder for description of property ngx_free_connection_stack of obj type SeRuntimeProperties field type str  type boolean")


 
  @VsoMethod  
  public Boolean isNgxFreeConnectionStack() {
    return ngxFreeConnectionStack;
  }
    
  @VsoMethod
  public void setNgxFreeConnectionStack(Boolean ngxFreeConnectionStack) {
    this.ngxFreeConnectionStack = ngxFreeConnectionStack;
  }

  
  /**
   * Deprecated. Field deprecated in 17.1.1.
   * @return persistenceEntriesLowWatermark
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public Integer getPersistenceEntriesLowWatermark() {
    return persistenceEntriesLowWatermark;
  }
    
  @VsoMethod
  public void setPersistenceEntriesLowWatermark(Integer persistenceEntriesLowWatermark) {
    this.persistenceEntriesLowWatermark = persistenceEntriesLowWatermark;
  }

  
  /**
   * Maximum memory in bytes allocated for persistence entries. Allowed values are 0-33554432.
   * @return persistenceMemMax
  **/
  @ApiModelProperty(value = "Maximum memory in bytes allocated for persistence entries. Allowed values are 0-33554432.")


 
  @VsoMethod  
  public Integer getPersistenceMemMax() {
    return persistenceMemMax;
  }
    
  @VsoMethod
  public void setPersistenceMemMax(Integer persistenceMemMax) {
    this.persistenceMemMax = persistenceMemMax;
  }

  
  /**
   * Enable punting of UDP packets from primary to other Service Engines. This applies to Virtual Services with Per-Packet Loadbalancing enabled.
   * @return scaleoutUdpPerPkt
  **/
  @ApiModelProperty(value = "Enable punting of UDP packets from primary to other Service Engines. This applies to Virtual Services with Per-Packet Loadbalancing enabled.")


 
  @VsoMethod  
  public Boolean isScaleoutUdpPerPkt() {
    return scaleoutUdpPerPkt;
  }
    
  @VsoMethod
  public void setScaleoutUdpPerPkt(Boolean scaleoutUdpPerPkt) {
    this.scaleoutUdpPerPkt = scaleoutUdpPerPkt;
  }

  
  /**
   * LDAP basicauth default bind timeout enforced on connections to LDAP server.
   * @return seAuthLdapBindTimeout
  **/
  @ApiModelProperty(value = "LDAP basicauth default bind timeout enforced on connections to LDAP server.")


 
  @VsoMethod  
  public Integer getSeAuthLdapBindTimeout() {
    return seAuthLdapBindTimeout;
  }
    
  @VsoMethod
  public void setSeAuthLdapBindTimeout(Integer seAuthLdapBindTimeout) {
    this.seAuthLdapBindTimeout = seAuthLdapBindTimeout;
  }

  
  /**
   * Size of LDAP basicauth credentials cache used on the dataplane.
   * @return seAuthLdapCacheSize
  **/
  @ApiModelProperty(value = "Size of LDAP basicauth credentials cache used on the dataplane.")


 
  @VsoMethod  
  public Integer getSeAuthLdapCacheSize() {
    return seAuthLdapCacheSize;
  }
    
  @VsoMethod
  public void setSeAuthLdapCacheSize(Integer seAuthLdapCacheSize) {
    this.seAuthLdapCacheSize = seAuthLdapCacheSize;
  }

  
  /**
   * LDAP basicauth default connection timeout enforced on connections to LDAP server.
   * @return seAuthLdapConnectTimeout
  **/
  @ApiModelProperty(value = "LDAP basicauth default connection timeout enforced on connections to LDAP server.")


 
  @VsoMethod  
  public Integer getSeAuthLdapConnectTimeout() {
    return seAuthLdapConnectTimeout;
  }
    
  @VsoMethod
  public void setSeAuthLdapConnectTimeout(Integer seAuthLdapConnectTimeout) {
    this.seAuthLdapConnectTimeout = seAuthLdapConnectTimeout;
  }

  
  /**
   * Number of concurrent connections to LDAP server by a single basic auth LDAP process.
   * @return seAuthLdapConnsPerServer
  **/
  @ApiModelProperty(value = "Number of concurrent connections to LDAP server by a single basic auth LDAP process.")


 
  @VsoMethod  
  public Integer getSeAuthLdapConnsPerServer() {
    return seAuthLdapConnsPerServer;
  }
    
  @VsoMethod
  public void setSeAuthLdapConnsPerServer(Integer seAuthLdapConnsPerServer) {
    this.seAuthLdapConnsPerServer = seAuthLdapConnsPerServer;
  }

  
  /**
   * LDAP basicauth default reconnect timeout enforced on connections to LDAP server.
   * @return seAuthLdapReconnectTimeout
  **/
  @ApiModelProperty(value = "LDAP basicauth default reconnect timeout enforced on connections to LDAP server.")


 
  @VsoMethod  
  public Integer getSeAuthLdapReconnectTimeout() {
    return seAuthLdapReconnectTimeout;
  }
    
  @VsoMethod
  public void setSeAuthLdapReconnectTimeout(Integer seAuthLdapReconnectTimeout) {
    this.seAuthLdapReconnectTimeout = seAuthLdapReconnectTimeout;
  }

  
  /**
   * LDAP basicauth default login or group search request timeout enforced on connections to LDAP server.
   * @return seAuthLdapRequestTimeout
  **/
  @ApiModelProperty(value = "LDAP basicauth default login or group search request timeout enforced on connections to LDAP server.")


 
  @VsoMethod  
  public Integer getSeAuthLdapRequestTimeout() {
    return seAuthLdapRequestTimeout;
  }
    
  @VsoMethod
  public void setSeAuthLdapRequestTimeout(Integer seAuthLdapRequestTimeout) {
    this.seAuthLdapRequestTimeout = seAuthLdapRequestTimeout;
  }

  
  /**
   * LDAP basicauth uses multiple ldap servers in the event of a failover only.
   * @return seAuthLdapServersFailoverOnly
  **/
  @ApiModelProperty(value = "LDAP basicauth uses multiple ldap servers in the event of a failover only.")


 
  @VsoMethod  
  public Boolean isSeAuthLdapServersFailoverOnly() {
    return seAuthLdapServersFailoverOnly;
  }
    
  @VsoMethod
  public void setSeAuthLdapServersFailoverOnly(Boolean seAuthLdapServersFailoverOnly) {
    this.seAuthLdapServersFailoverOnly = seAuthLdapServersFailoverOnly;
  }

  
  /**
   * Placeholder for description of property se_dp_compression of obj type SeRuntimeProperties field type str  type object
   * @return seDpCompression
  **/
  @ApiModelProperty(value = "Placeholder for description of property se_dp_compression of obj type SeRuntimeProperties field type str  type object")

  @Valid

 
  @VsoMethod  
  public SeRuntimeCompressionProperties getSeDpCompression() {
    return seDpCompression;
  }
    
  @VsoMethod
  public void setSeDpCompression(SeRuntimeCompressionProperties seDpCompression) {
    this.seDpCompression = seDpCompression;
  }

  
  /**
   * Internal only. Used to simulate SE - SE HB failure.
   * @return seDpHmDrops
  **/
  @ApiModelProperty(value = "Internal only. Used to simulate SE - SE HB failure.")


 
  @VsoMethod  
  public Integer getSeDpHmDrops() {
    return seDpHmDrops;
  }
    
  @VsoMethod
  public void setSeDpHmDrops(Integer seDpHmDrops) {
    this.seDpHmDrops = seDpHmDrops;
  }

  
  /**
   * Number of jiffies between polling interface state.
   * @return seDpIfStatePollInterval
  **/
  @ApiModelProperty(value = "Number of jiffies between polling interface state.")


 
  @VsoMethod  
  public Integer getSeDpIfStatePollInterval() {
    return seDpIfStatePollInterval;
  }
    
  @VsoMethod
  public void setSeDpIfStatePollInterval(Integer seDpIfStatePollInterval) {
    this.seDpIfStatePollInterval = seDpIfStatePollInterval;
  }

  
  /**
   * Internal buffer full indicator on the Service Engine beyond which the unfiltered logs are abandoned.
   * @return seDpLogNfEnqueuePercent
  **/
  @ApiModelProperty(value = "Internal buffer full indicator on the Service Engine beyond which the unfiltered logs are abandoned.")


 
  @VsoMethod  
  public Integer getSeDpLogNfEnqueuePercent() {
    return seDpLogNfEnqueuePercent;
  }
    
  @VsoMethod
  public void setSeDpLogNfEnqueuePercent(Integer seDpLogNfEnqueuePercent) {
    this.seDpLogNfEnqueuePercent = seDpLogNfEnqueuePercent;
  }

  
  /**
   * Internal buffer full indicator on the Service Engine beyond which the user filtered logs are abandoned.
   * @return seDpLogUdfEnqueuePercent
  **/
  @ApiModelProperty(value = "Internal buffer full indicator on the Service Engine beyond which the user filtered logs are abandoned.")


 
  @VsoMethod  
  public Integer getSeDpLogUdfEnqueuePercent() {
    return seDpLogUdfEnqueuePercent;
  }
    
  @VsoMethod
  public void setSeDpLogUdfEnqueuePercent(Integer seDpLogUdfEnqueuePercent) {
    this.seDpLogUdfEnqueuePercent = seDpLogUdfEnqueuePercent;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.5. Field introduced in 17.1.1.
   * @return seDpVnicQueueStallEventSleep
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.5. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getSeDpVnicQueueStallEventSleep() {
    return seDpVnicQueueStallEventSleep;
  }
    
  @VsoMethod
  public void setSeDpVnicQueueStallEventSleep(Integer seDpVnicQueueStallEventSleep) {
    this.seDpVnicQueueStallEventSleep = seDpVnicQueueStallEventSleep;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.5. Field introduced in 17.1.1.
   * @return seDpVnicQueueStallThreshold
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.5. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getSeDpVnicQueueStallThreshold() {
    return seDpVnicQueueStallThreshold;
  }
    
  @VsoMethod
  public void setSeDpVnicQueueStallThreshold(Integer seDpVnicQueueStallThreshold) {
    this.seDpVnicQueueStallThreshold = seDpVnicQueueStallThreshold;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.5. Field introduced in 17.1.1.
   * @return seDpVnicQueueStallTimeout
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.5. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getSeDpVnicQueueStallTimeout() {
    return seDpVnicQueueStallTimeout;
  }
    
  @VsoMethod
  public void setSeDpVnicQueueStallTimeout(Integer seDpVnicQueueStallTimeout) {
    this.seDpVnicQueueStallTimeout = seDpVnicQueueStallTimeout;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.5. Field introduced in 17.1.14, 17.2.5, 18.1.1.
   * @return seDpVnicRestartOnQueueStallCount
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.5. Field introduced in 17.1.14, 17.2.5, 18.1.1.")


 
  @VsoMethod  
  public Integer getSeDpVnicRestartOnQueueStallCount() {
    return seDpVnicRestartOnQueueStallCount;
  }
    
  @VsoMethod
  public void setSeDpVnicRestartOnQueueStallCount(Integer seDpVnicRestartOnQueueStallCount) {
    this.seDpVnicRestartOnQueueStallCount = seDpVnicRestartOnQueueStallCount;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.5. Field introduced in 17.1.14, 17.2.5, 18.1.1.
   * @return seDpVnicStallSeRestartWindow
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.5. Field introduced in 17.1.14, 17.2.5, 18.1.1.")


 
  @VsoMethod  
  public Integer getSeDpVnicStallSeRestartWindow() {
    return seDpVnicStallSeRestartWindow;
  }
    
  @VsoMethod
  public void setSeDpVnicStallSeRestartWindow(Integer seDpVnicStallSeRestartWindow) {
    this.seDpVnicStallSeRestartWindow = seDpVnicStallSeRestartWindow;
  }

  
  /**
   * Enable core dump on assert. Field introduced in 18.1.3, 18.2.1.
   * @return seDumpCoreOnAssert
  **/
  @ApiModelProperty(value = "Enable core dump on assert. Field introduced in 18.1.3, 18.2.1.")


 
  @VsoMethod  
  public Boolean isSeDumpCoreOnAssert() {
    return seDumpCoreOnAssert;
  }
    
  @VsoMethod
  public void setSeDumpCoreOnAssert(Boolean seDumpCoreOnAssert) {
    this.seDumpCoreOnAssert = seDumpCoreOnAssert;
  }

  
  /**
   * Accept/ignore interface routes (i.e, no next hop IP address).
   * @return seHandleInterfaceRoutes
  **/
  @ApiModelProperty(value = "Accept/ignore interface routes (i.e, no next hop IP address).")


 
  @VsoMethod  
  public Boolean isSeHandleInterfaceRoutes() {
    return seHandleInterfaceRoutes;
  }
    
  @VsoMethod
  public void setSeHandleInterfaceRoutes(Boolean seHandleInterfaceRoutes) {
    this.seHandleInterfaceRoutes = seHandleInterfaceRoutes;
  }

  
  /**
   * Internal use only. Allowed values are 0-7.
   * @return seHbPersistFudgeBits
  **/
  @ApiModelProperty(value = "Internal use only. Allowed values are 0-7.")


 
  @VsoMethod  
  public Integer getSeHbPersistFudgeBits() {
    return seHbPersistFudgeBits;
  }
    
  @VsoMethod
  public void setSeHbPersistFudgeBits(Integer seHbPersistFudgeBits) {
    this.seHbPersistFudgeBits = seHbPersistFudgeBits;
  }

  
  /**
   * Number of packets with wrong mac after which SE attempts to disable promiscious mode.
   * @return seMacErrorThresholdToDisablePromiscious
  **/
  @ApiModelProperty(value = "Number of packets with wrong mac after which SE attempts to disable promiscious mode.")


 
  @VsoMethod  
  public Integer getSeMacErrorThresholdToDisablePromiscious() {
    return seMacErrorThresholdToDisablePromiscious;
  }
    
  @VsoMethod
  public void setSeMacErrorThresholdToDisablePromiscious(Integer seMacErrorThresholdToDisablePromiscious) {
    this.seMacErrorThresholdToDisablePromiscious = seMacErrorThresholdToDisablePromiscious;
  }

  
  /**
   * Deprecated. Field deprecated in 17.1.1.
   * @return seMallocThresh
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public Integer getSeMallocThresh() {
    return seMallocThresh;
  }
    
  @VsoMethod
  public void setSeMallocThresh(Integer seMallocThresh) {
    this.seMallocThresh = seMallocThresh;
  }

  
  /**
   * Internal use only. Enables poisoning of freed memory blocks.
   * @return seMemoryPoison
  **/
  @ApiModelProperty(value = "Internal use only. Enables poisoning of freed memory blocks.")


 
  @VsoMethod  
  public Boolean isSeMemoryPoison() {
    return seMemoryPoison;
  }
    
  @VsoMethod
  public void setSeMemoryPoison(Boolean seMemoryPoison) {
    this.seMemoryPoison = seMemoryPoison;
  }

  
  /**
   * Internal use only. Frequency (ms) of metrics updates from SE to controller.
   * @return seMetricsInterval
  **/
  @ApiModelProperty(value = "Internal use only. Frequency (ms) of metrics updates from SE to controller.")


 
  @VsoMethod  
  public Integer getSeMetricsInterval() {
    return seMetricsInterval;
  }
    
  @VsoMethod
  public void setSeMetricsInterval(Integer seMetricsInterval) {
    this.seMetricsInterval = seMetricsInterval;
  }

  
  /**
   * Internal use only. Enable or disable real time metrics irrespective of virtualservice or SE group configuration.
   * @return seMetricsRtEnabled
  **/
  @ApiModelProperty(value = "Internal use only. Enable or disable real time metrics irrespective of virtualservice or SE group configuration.")


 
  @VsoMethod  
  public Boolean isSeMetricsRtEnabled() {
    return seMetricsRtEnabled;
  }
    
  @VsoMethod
  public void setSeMetricsRtEnabled(Boolean seMetricsRtEnabled) {
    this.seMetricsRtEnabled = seMetricsRtEnabled;
  }

  
  /**
   * Internal use only. Frequency (ms) of realtime metrics updates from SE to controller.
   * @return seMetricsRtInterval
  **/
  @ApiModelProperty(value = "Internal use only. Frequency (ms) of realtime metrics updates from SE to controller.")


 
  @VsoMethod  
  public Integer getSeMetricsRtInterval() {
    return seMetricsRtInterval;
  }
    
  @VsoMethod
  public void setSeMetricsRtInterval(Integer seMetricsRtInterval) {
    this.seMetricsRtInterval = seMetricsRtInterval;
  }

  
  /**
   * Internal use only. Used to artificially reduce the available number of packet buffers.
   * @return sePacketBufferMax
  **/
  @ApiModelProperty(value = "Internal use only. Used to artificially reduce the available number of packet buffers.")


 
  @VsoMethod  
  public Integer getSePacketBufferMax() {
    return sePacketBufferMax;
  }
    
  @VsoMethod
  public void setSePacketBufferMax(Integer sePacketBufferMax) {
    this.sePacketBufferMax = sePacketBufferMax;
  }

  
  /**
   * Internal use only. If enabled, randomly packets are dropped.
   * @return seRandomTcpDrops
  **/
  @ApiModelProperty(value = "Internal use only. If enabled, randomly packets are dropped.")


 
  @VsoMethod  
  public Boolean isSeRandomTcpDrops() {
    return seRandomTcpDrops;
  }
    
  @VsoMethod
  public void setSeRandomTcpDrops(Boolean seRandomTcpDrops) {
    this.seRandomTcpDrops = seRandomTcpDrops;
  }

  
  /**
   * SE rate limiters.
   * @return seRateLimiters
  **/
  @ApiModelProperty(value = "SE rate limiters.")

  @Valid

 
  @VsoMethod  
  public SeRateLimiters getSeRateLimiters() {
    return seRateLimiters;
  }
    
  @VsoMethod
  public void setSeRateLimiters(SeRateLimiters seRateLimiters) {
    this.seRateLimiters = seRateLimiters;
  }

  
  public SeRuntimeProperties addServiceIpSubnetsItem(IpAddrPrefix serviceIpSubnetsItem) {
    if (this.serviceIpSubnets == null) {
      this.serviceIpSubnets = new ArrayList<IpAddrPrefix>();
    }
    this.serviceIpSubnets.add(serviceIpSubnetsItem);
    return this;
  }
  
  /**
   * IP ranges on which there may be virtual services (for configuring iptables/routes).
   * @return serviceIpSubnets
  **/
  @ApiModelProperty(value = "IP ranges on which there may be virtual services (for configuring iptables/routes).")

  @Valid

 
  @VsoMethod  
  public List<IpAddrPrefix> getServiceIpSubnets() {
    return serviceIpSubnets;
  }
    
  @VsoMethod
  public void setServiceIpSubnets(List<IpAddrPrefix> serviceIpSubnets) {
    this.serviceIpSubnets = serviceIpSubnets;
  }

  
  public SeRuntimeProperties addServicePortRangesItem(PortRange servicePortRangesItem) {
    if (this.servicePortRanges == null) {
      this.servicePortRanges = new ArrayList<PortRange>();
    }
    this.servicePortRanges.add(servicePortRangesItem);
    return this;
  }
  
  /**
   * Port ranges on which there may be virtual services (for configuring iptables). Applicable in container ecosystems like Mesos.
   * @return servicePortRanges
  **/
  @ApiModelProperty(value = "Port ranges on which there may be virtual services (for configuring iptables). Applicable in container ecosystems like Mesos.")

  @Valid

 
  @VsoMethod  
  public List<PortRange> getServicePortRanges() {
    return servicePortRanges;
  }
    
  @VsoMethod
  public void setServicePortRanges(List<PortRange> servicePortRanges) {
    this.servicePortRanges = servicePortRanges;
  }

  
  /**
   * Make service ports accessible on all Host interfaces in addition to East-West VIP and/or bridge IP.
   * @return servicesAccessibleAllInterfaces
  **/
  @ApiModelProperty(value = "Make service ports accessible on all Host interfaces in addition to East-West VIP and/or bridge IP.")


 
  @VsoMethod  
  public Boolean isServicesAccessibleAllInterfaces() {
    return servicesAccessibleAllInterfaces;
  }
    
  @VsoMethod
  public void setServicesAccessibleAllInterfaces(Boolean servicesAccessibleAllInterfaces) {
    this.servicesAccessibleAllInterfaces = servicesAccessibleAllInterfaces;
  }

  
  /**
   * Placeholder for description of property spdy_fwd_proxy_parse_enable of obj type SeRuntimeProperties field type str  type boolean
   * @return spdyFwdProxyParseEnable
  **/
  @ApiModelProperty(value = "Placeholder for description of property spdy_fwd_proxy_parse_enable of obj type SeRuntimeProperties field type str  type boolean")


 
  @VsoMethod  
  public Boolean isSpdyFwdProxyParseEnable() {
    return spdyFwdProxyParseEnable;
  }
    
  @VsoMethod
  public void setSpdyFwdProxyParseEnable(Boolean spdyFwdProxyParseEnable) {
    this.spdyFwdProxyParseEnable = spdyFwdProxyParseEnable;
  }

  
  /**
   * Maximum size of the SYN cache table. After this limit is reached, SYN cookies are used. This is per core of the serviceengine. Field deprecated in 17.2.5.
   * @return tcpSynCacheMax
  **/
  @ApiModelProperty(value = "Maximum size of the SYN cache table. After this limit is reached, SYN cookies are used. This is per core of the serviceengine. Field deprecated in 17.2.5.")


 
  @VsoMethod  
  public Integer getTcpSynCacheMax() {
    return tcpSynCacheMax;
  }
    
  @VsoMethod
  public void setTcpSynCacheMax(Integer tcpSynCacheMax) {
    this.tcpSynCacheMax = tcpSynCacheMax;
  }

  
  /**
   * Default value for max number of retransmissions for a SYN packet.
   * @return tcpSyncacheMaxRetransmitDefault
  **/
  @ApiModelProperty(value = "Default value for max number of retransmissions for a SYN packet.")


 
  @VsoMethod  
  public Integer getTcpSyncacheMaxRetransmitDefault() {
    return tcpSyncacheMaxRetransmitDefault;
  }
    
  @VsoMethod
  public void setTcpSyncacheMaxRetransmitDefault(Integer tcpSyncacheMaxRetransmitDefault) {
    this.tcpSyncacheMaxRetransmitDefault = tcpSyncacheMaxRetransmitDefault;
  }

  
  /**
   * Timeout for backend connection.
   * @return upstreamConnectTimeout
  **/
  @ApiModelProperty(value = "Timeout for backend connection.")


 
  @VsoMethod  
  public Integer getUpstreamConnectTimeout() {
    return upstreamConnectTimeout;
  }
    
  @VsoMethod
  public void setUpstreamConnectTimeout(Integer upstreamConnectTimeout) {
    this.upstreamConnectTimeout = upstreamConnectTimeout;
  }

  
  /**
   * L7 Upstream Connection pool cache threshold in percentage.
   * @return upstreamConnpoolCacheThresh
  **/
  @ApiModelProperty(value = "L7 Upstream Connection pool cache threshold in percentage.")


 
  @VsoMethod  
  public Integer getUpstreamConnpoolCacheThresh() {
    return upstreamConnpoolCacheThresh;
  }
    
  @VsoMethod
  public void setUpstreamConnpoolCacheThresh(Integer upstreamConnpoolCacheThresh) {
    this.upstreamConnpoolCacheThresh = upstreamConnpoolCacheThresh;
  }

  
  /**
   * Idle timeout value for a connection in the upstream connection pool, when the current cache size is above the threshold.
   * @return upstreamConnpoolConnIdleThreshTmo
  **/
  @ApiModelProperty(value = "Idle timeout value for a connection in the upstream connection pool, when the current cache size is above the threshold.")


 
  @VsoMethod  
  public Integer getUpstreamConnpoolConnIdleThreshTmo() {
    return upstreamConnpoolConnIdleThreshTmo;
  }
    
  @VsoMethod
  public void setUpstreamConnpoolConnIdleThreshTmo(Integer upstreamConnpoolConnIdleThreshTmo) {
    this.upstreamConnpoolConnIdleThreshTmo = upstreamConnpoolConnIdleThreshTmo;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.1.
   * @return upstreamConnpoolConnIdleTmo
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.1.")


 
  @VsoMethod  
  public Integer getUpstreamConnpoolConnIdleTmo() {
    return upstreamConnpoolConnIdleTmo;
  }
    
  @VsoMethod
  public void setUpstreamConnpoolConnIdleTmo(Integer upstreamConnpoolConnIdleTmo) {
    this.upstreamConnpoolConnIdleTmo = upstreamConnpoolConnIdleTmo;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.1.
   * @return upstreamConnpoolConnLifeTmo
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.1.")


 
  @VsoMethod  
  public Integer getUpstreamConnpoolConnLifeTmo() {
    return upstreamConnpoolConnLifeTmo;
  }
    
  @VsoMethod
  public void setUpstreamConnpoolConnLifeTmo(Integer upstreamConnpoolConnLifeTmo) {
    this.upstreamConnpoolConnLifeTmo = upstreamConnpoolConnLifeTmo;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.1.
   * @return upstreamConnpoolConnMaxReuse
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.1.")


 
  @VsoMethod  
  public Integer getUpstreamConnpoolConnMaxReuse() {
    return upstreamConnpoolConnMaxReuse;
  }
    
  @VsoMethod
  public void setUpstreamConnpoolConnMaxReuse(Integer upstreamConnpoolConnMaxReuse) {
    this.upstreamConnpoolConnMaxReuse = upstreamConnpoolConnMaxReuse;
  }

  
  /**
   * L7 Upstream Connection pool max cache size per core.
   * @return upstreamConnpoolCoreMaxCache
  **/
  @ApiModelProperty(value = "L7 Upstream Connection pool max cache size per core.")


 
  @VsoMethod  
  public Integer getUpstreamConnpoolCoreMaxCache() {
    return upstreamConnpoolCoreMaxCache;
  }
    
  @VsoMethod
  public void setUpstreamConnpoolCoreMaxCache(Integer upstreamConnpoolCoreMaxCache) {
    this.upstreamConnpoolCoreMaxCache = upstreamConnpoolCoreMaxCache;
  }

  
  /**
   * Enable upstream connection pool.
   * @return upstreamConnpoolEnable
  **/
  @ApiModelProperty(value = "Enable upstream connection pool.")


 
  @VsoMethod  
  public Boolean isUpstreamConnpoolEnable() {
    return upstreamConnpoolEnable;
  }
    
  @VsoMethod
  public void setUpstreamConnpoolEnable(Boolean upstreamConnpoolEnable) {
    this.upstreamConnpoolEnable = upstreamConnpoolEnable;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.1.
   * @return upstreamConnpoolServerMaxCache
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.1.")


 
  @VsoMethod  
  public Integer getUpstreamConnpoolServerMaxCache() {
    return upstreamConnpoolServerMaxCache;
  }
    
  @VsoMethod
  public void setUpstreamConnpoolServerMaxCache(Integer upstreamConnpoolServerMaxCache) {
    this.upstreamConnpoolServerMaxCache = upstreamConnpoolServerMaxCache;
  }

  
  /**
   * Number of upstream_connpool_strategy.
   * @return upstreamConnpoolStrategy
  **/
  @ApiModelProperty(value = "Number of upstream_connpool_strategy.")


 
  @VsoMethod  
  public Integer getUpstreamConnpoolStrategy() {
    return upstreamConnpoolStrategy;
  }
    
  @VsoMethod
  public void setUpstreamConnpoolStrategy(Integer upstreamConnpoolStrategy) {
    this.upstreamConnpoolStrategy = upstreamConnpoolStrategy;
  }

  
  /**
   * Placeholder for description of property upstream_keepalive of obj type SeRuntimeProperties field type str  type boolean
   * @return upstreamKeepalive
  **/
  @ApiModelProperty(value = "Placeholder for description of property upstream_keepalive of obj type SeRuntimeProperties field type str  type boolean")


 
  @VsoMethod  
  public Boolean isUpstreamKeepalive() {
    return upstreamKeepalive;
  }
    
  @VsoMethod
  public void setUpstreamKeepalive(Boolean upstreamKeepalive) {
    this.upstreamKeepalive = upstreamKeepalive;
  }

  
  /**
   * Timeout for data to be received from backend.
   * @return upstreamReadTimeout
  **/
  @ApiModelProperty(value = "Timeout for data to be received from backend.")


 
  @VsoMethod  
  public Integer getUpstreamReadTimeout() {
    return upstreamReadTimeout;
  }
    
  @VsoMethod
  public void setUpstreamReadTimeout(Integer upstreamReadTimeout) {
    this.upstreamReadTimeout = upstreamReadTimeout;
  }

  
  /**
   * Timeout for upstream to become writable.
   * @return upstreamSendTimeout
  **/
  @ApiModelProperty(value = "Timeout for upstream to become writable.")


 
  @VsoMethod  
  public Integer getUpstreamSendTimeout() {
    return upstreamSendTimeout;
  }
    
  @VsoMethod
  public void setUpstreamSendTimeout(Integer upstreamSendTimeout) {
    this.upstreamSendTimeout = upstreamSendTimeout;
  }

  
  /**
   * Defines in seconds how long before an unused user-defined-metric is garbage collected. Field introduced in 17.1.5.
   * @return userDefinedMetricAge
  **/
  @ApiModelProperty(value = "Defines in seconds how long before an unused user-defined-metric is garbage collected. Field introduced in 17.1.5.")


 
  @VsoMethod  
  public Integer getUserDefinedMetricAge() {
    return userDefinedMetricAge;
  }
    
  @VsoMethod
  public void setUserDefinedMetricAge(Integer userDefinedMetricAge) {
    this.userDefinedMetricAge = userDefinedMetricAge;
  }

  
  public String getObjectID() {
		return "SeRuntimeProperties";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeRuntimeProperties seRuntimeProperties = (SeRuntimeProperties) o;
    return Objects.equals(this.adminSshEnabled, seRuntimeProperties.adminSshEnabled) &&
        Objects.equals(this.appHeaders, seRuntimeProperties.appHeaders) &&
        Objects.equals(this.baremetalDispatcherHandlesFlows, seRuntimeProperties.baremetalDispatcherHandlesFlows) &&
        Objects.equals(this.connectionsLossyLogRateLimiterThreshold, seRuntimeProperties.connectionsLossyLogRateLimiterThreshold) &&
        Objects.equals(this.connectionsUdfnfLogRateLimiterThreshold, seRuntimeProperties.connectionsUdfnfLogRateLimiterThreshold) &&
        Objects.equals(this.disableFlowProbes, seRuntimeProperties.disableFlowProbes) &&
        Objects.equals(this.disableGro, seRuntimeProperties.disableGro) &&
        Objects.equals(this.disableTso, seRuntimeProperties.disableTso) &&
        Objects.equals(this.dosProfile, seRuntimeProperties.dosProfile) &&
        Objects.equals(this.downstreamSendTimeout, seRuntimeProperties.downstreamSendTimeout) &&
        Objects.equals(this.dpAggressiveHbFrequency, seRuntimeProperties.dpAggressiveHbFrequency) &&
        Objects.equals(this.dpAggressiveHbTimeoutCount, seRuntimeProperties.dpAggressiveHbTimeoutCount) &&
        Objects.equals(this.dpHbFrequency, seRuntimeProperties.dpHbFrequency) &&
        Objects.equals(this.dpHbTimeoutCount, seRuntimeProperties.dpHbTimeoutCount) &&
        Objects.equals(this.dupipFrequency, seRuntimeProperties.dupipFrequency) &&
        Objects.equals(this.dupipTimeoutCount, seRuntimeProperties.dupipTimeoutCount) &&
        Objects.equals(this.enableHsmLog, seRuntimeProperties.enableHsmLog) &&
        Objects.equals(this.feproxyVipsEnableProxyArp, seRuntimeProperties.feproxyVipsEnableProxyArp) &&
        Objects.equals(this.flowTableBatchPushFrequency, seRuntimeProperties.flowTableBatchPushFrequency) &&
        Objects.equals(this.flowTableMaxEntriesDeprecated, seRuntimeProperties.flowTableMaxEntriesDeprecated) &&
        Objects.equals(this.flowTableNewSynMaxEntries, seRuntimeProperties.flowTableNewSynMaxEntries) &&
        Objects.equals(this.globalMtu, seRuntimeProperties.globalMtu) &&
        Objects.equals(this.httpRumConsoleLog, seRuntimeProperties.httpRumConsoleLog) &&
        Objects.equals(this.httpRumMinContentLength, seRuntimeProperties.httpRumMinContentLength) &&
        Objects.equals(this.lbBatchPushFrequency, seRuntimeProperties.lbBatchPushFrequency) &&
        Objects.equals(this.lbFailMaxTime, seRuntimeProperties.lbFailMaxTime) &&
        Objects.equals(this.lbactionNumRequestsToDispatch, seRuntimeProperties.lbactionNumRequestsToDispatch) &&
        Objects.equals(this.lbactionRqPerRequestMaxRetries, seRuntimeProperties.lbactionRqPerRequestMaxRetries) &&
        Objects.equals(this.logAgentCompressLogs, seRuntimeProperties.logAgentCompressLogs) &&
        Objects.equals(this.logAgentConnSendBufferSize, seRuntimeProperties.logAgentConnSendBufferSize) &&
        Objects.equals(this.logAgentExportMsgBufferSize, seRuntimeProperties.logAgentExportMsgBufferSize) &&
        Objects.equals(this.logAgentExportWaitTime, seRuntimeProperties.logAgentExportWaitTime) &&
        Objects.equals(this.logAgentFileSzAppl, seRuntimeProperties.logAgentFileSzAppl) &&
        Objects.equals(this.logAgentFileSzConn, seRuntimeProperties.logAgentFileSzConn) &&
        Objects.equals(this.logAgentFileSzDebug, seRuntimeProperties.logAgentFileSzDebug) &&
        Objects.equals(this.logAgentFileSzEvent, seRuntimeProperties.logAgentFileSzEvent) &&
        Objects.equals(this.logAgentLogStorageMinSz, seRuntimeProperties.logAgentLogStorageMinSz) &&
        Objects.equals(this.logAgentMaxActiveAdfFilesPerVs, seRuntimeProperties.logAgentMaxActiveAdfFilesPerVs) &&
        Objects.equals(this.logAgentMaxConcurrentRsync, seRuntimeProperties.logAgentMaxConcurrentRsync) &&
        Objects.equals(this.logAgentMaxLogmessageProtoSz, seRuntimeProperties.logAgentMaxLogmessageProtoSz) &&
        Objects.equals(this.logAgentMaxStorageExcessPercent, seRuntimeProperties.logAgentMaxStorageExcessPercent) &&
        Objects.equals(this.logAgentMaxStorageIgnorePercent, seRuntimeProperties.logAgentMaxStorageIgnorePercent) &&
        Objects.equals(this.logAgentMinStoragePerVs, seRuntimeProperties.logAgentMinStoragePerVs) &&
        Objects.equals(this.logAgentPauseInterval, seRuntimeProperties.logAgentPauseInterval) &&
        Objects.equals(this.logAgentSleepInterval, seRuntimeProperties.logAgentSleepInterval) &&
        Objects.equals(this.logAgentUnknownVsTimer, seRuntimeProperties.logAgentUnknownVsTimer) &&
        Objects.equals(this.logMessageMaxFileListSize, seRuntimeProperties.logMessageMaxFileListSize) &&
        Objects.equals(this.maxThroughput, seRuntimeProperties.maxThroughput) &&
        Objects.equals(this.mcacheEnabled, seRuntimeProperties.mcacheEnabled) &&
        Objects.equals(this.mcacheFetchEnabled, seRuntimeProperties.mcacheFetchEnabled) &&
        Objects.equals(this.mcacheMaxCacheSize, seRuntimeProperties.mcacheMaxCacheSize) &&
        Objects.equals(this.mcacheStoreInEnabled, seRuntimeProperties.mcacheStoreInEnabled) &&
        Objects.equals(this.mcacheStoreInMaxSize, seRuntimeProperties.mcacheStoreInMaxSize) &&
        Objects.equals(this.mcacheStoreInMinSize, seRuntimeProperties.mcacheStoreInMinSize) &&
        Objects.equals(this.mcacheStoreOutEnabled, seRuntimeProperties.mcacheStoreOutEnabled) &&
        Objects.equals(this.mcacheStoreSeMaxSize, seRuntimeProperties.mcacheStoreSeMaxSize) &&
        Objects.equals(this.ngxFreeConnectionStack, seRuntimeProperties.ngxFreeConnectionStack) &&
        Objects.equals(this.persistenceEntriesLowWatermark, seRuntimeProperties.persistenceEntriesLowWatermark) &&
        Objects.equals(this.persistenceMemMax, seRuntimeProperties.persistenceMemMax) &&
        Objects.equals(this.scaleoutUdpPerPkt, seRuntimeProperties.scaleoutUdpPerPkt) &&
        Objects.equals(this.seAuthLdapBindTimeout, seRuntimeProperties.seAuthLdapBindTimeout) &&
        Objects.equals(this.seAuthLdapCacheSize, seRuntimeProperties.seAuthLdapCacheSize) &&
        Objects.equals(this.seAuthLdapConnectTimeout, seRuntimeProperties.seAuthLdapConnectTimeout) &&
        Objects.equals(this.seAuthLdapConnsPerServer, seRuntimeProperties.seAuthLdapConnsPerServer) &&
        Objects.equals(this.seAuthLdapReconnectTimeout, seRuntimeProperties.seAuthLdapReconnectTimeout) &&
        Objects.equals(this.seAuthLdapRequestTimeout, seRuntimeProperties.seAuthLdapRequestTimeout) &&
        Objects.equals(this.seAuthLdapServersFailoverOnly, seRuntimeProperties.seAuthLdapServersFailoverOnly) &&
        Objects.equals(this.seDpCompression, seRuntimeProperties.seDpCompression) &&
        Objects.equals(this.seDpHmDrops, seRuntimeProperties.seDpHmDrops) &&
        Objects.equals(this.seDpIfStatePollInterval, seRuntimeProperties.seDpIfStatePollInterval) &&
        Objects.equals(this.seDpLogNfEnqueuePercent, seRuntimeProperties.seDpLogNfEnqueuePercent) &&
        Objects.equals(this.seDpLogUdfEnqueuePercent, seRuntimeProperties.seDpLogUdfEnqueuePercent) &&
        Objects.equals(this.seDpVnicQueueStallEventSleep, seRuntimeProperties.seDpVnicQueueStallEventSleep) &&
        Objects.equals(this.seDpVnicQueueStallThreshold, seRuntimeProperties.seDpVnicQueueStallThreshold) &&
        Objects.equals(this.seDpVnicQueueStallTimeout, seRuntimeProperties.seDpVnicQueueStallTimeout) &&
        Objects.equals(this.seDpVnicRestartOnQueueStallCount, seRuntimeProperties.seDpVnicRestartOnQueueStallCount) &&
        Objects.equals(this.seDpVnicStallSeRestartWindow, seRuntimeProperties.seDpVnicStallSeRestartWindow) &&
        Objects.equals(this.seDumpCoreOnAssert, seRuntimeProperties.seDumpCoreOnAssert) &&
        Objects.equals(this.seHandleInterfaceRoutes, seRuntimeProperties.seHandleInterfaceRoutes) &&
        Objects.equals(this.seHbPersistFudgeBits, seRuntimeProperties.seHbPersistFudgeBits) &&
        Objects.equals(this.seMacErrorThresholdToDisablePromiscious, seRuntimeProperties.seMacErrorThresholdToDisablePromiscious) &&
        Objects.equals(this.seMallocThresh, seRuntimeProperties.seMallocThresh) &&
        Objects.equals(this.seMemoryPoison, seRuntimeProperties.seMemoryPoison) &&
        Objects.equals(this.seMetricsInterval, seRuntimeProperties.seMetricsInterval) &&
        Objects.equals(this.seMetricsRtEnabled, seRuntimeProperties.seMetricsRtEnabled) &&
        Objects.equals(this.seMetricsRtInterval, seRuntimeProperties.seMetricsRtInterval) &&
        Objects.equals(this.sePacketBufferMax, seRuntimeProperties.sePacketBufferMax) &&
        Objects.equals(this.seRandomTcpDrops, seRuntimeProperties.seRandomTcpDrops) &&
        Objects.equals(this.seRateLimiters, seRuntimeProperties.seRateLimiters) &&
        Objects.equals(this.serviceIpSubnets, seRuntimeProperties.serviceIpSubnets) &&
        Objects.equals(this.servicePortRanges, seRuntimeProperties.servicePortRanges) &&
        Objects.equals(this.servicesAccessibleAllInterfaces, seRuntimeProperties.servicesAccessibleAllInterfaces) &&
        Objects.equals(this.spdyFwdProxyParseEnable, seRuntimeProperties.spdyFwdProxyParseEnable) &&
        Objects.equals(this.tcpSynCacheMax, seRuntimeProperties.tcpSynCacheMax) &&
        Objects.equals(this.tcpSyncacheMaxRetransmitDefault, seRuntimeProperties.tcpSyncacheMaxRetransmitDefault) &&
        Objects.equals(this.upstreamConnectTimeout, seRuntimeProperties.upstreamConnectTimeout) &&
        Objects.equals(this.upstreamConnpoolCacheThresh, seRuntimeProperties.upstreamConnpoolCacheThresh) &&
        Objects.equals(this.upstreamConnpoolConnIdleThreshTmo, seRuntimeProperties.upstreamConnpoolConnIdleThreshTmo) &&
        Objects.equals(this.upstreamConnpoolConnIdleTmo, seRuntimeProperties.upstreamConnpoolConnIdleTmo) &&
        Objects.equals(this.upstreamConnpoolConnLifeTmo, seRuntimeProperties.upstreamConnpoolConnLifeTmo) &&
        Objects.equals(this.upstreamConnpoolConnMaxReuse, seRuntimeProperties.upstreamConnpoolConnMaxReuse) &&
        Objects.equals(this.upstreamConnpoolCoreMaxCache, seRuntimeProperties.upstreamConnpoolCoreMaxCache) &&
        Objects.equals(this.upstreamConnpoolEnable, seRuntimeProperties.upstreamConnpoolEnable) &&
        Objects.equals(this.upstreamConnpoolServerMaxCache, seRuntimeProperties.upstreamConnpoolServerMaxCache) &&
        Objects.equals(this.upstreamConnpoolStrategy, seRuntimeProperties.upstreamConnpoolStrategy) &&
        Objects.equals(this.upstreamKeepalive, seRuntimeProperties.upstreamKeepalive) &&
        Objects.equals(this.upstreamReadTimeout, seRuntimeProperties.upstreamReadTimeout) &&
        Objects.equals(this.upstreamSendTimeout, seRuntimeProperties.upstreamSendTimeout) &&
        Objects.equals(this.userDefinedMetricAge, seRuntimeProperties.userDefinedMetricAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminSshEnabled, appHeaders, baremetalDispatcherHandlesFlows, connectionsLossyLogRateLimiterThreshold, connectionsUdfnfLogRateLimiterThreshold, disableFlowProbes, disableGro, disableTso, dosProfile, downstreamSendTimeout, dpAggressiveHbFrequency, dpAggressiveHbTimeoutCount, dpHbFrequency, dpHbTimeoutCount, dupipFrequency, dupipTimeoutCount, enableHsmLog, feproxyVipsEnableProxyArp, flowTableBatchPushFrequency, flowTableMaxEntriesDeprecated, flowTableNewSynMaxEntries, globalMtu, httpRumConsoleLog, httpRumMinContentLength, lbBatchPushFrequency, lbFailMaxTime, lbactionNumRequestsToDispatch, lbactionRqPerRequestMaxRetries, logAgentCompressLogs, logAgentConnSendBufferSize, logAgentExportMsgBufferSize, logAgentExportWaitTime, logAgentFileSzAppl, logAgentFileSzConn, logAgentFileSzDebug, logAgentFileSzEvent, logAgentLogStorageMinSz, logAgentMaxActiveAdfFilesPerVs, logAgentMaxConcurrentRsync, logAgentMaxLogmessageProtoSz, logAgentMaxStorageExcessPercent, logAgentMaxStorageIgnorePercent, logAgentMinStoragePerVs, logAgentPauseInterval, logAgentSleepInterval, logAgentUnknownVsTimer, logMessageMaxFileListSize, maxThroughput, mcacheEnabled, mcacheFetchEnabled, mcacheMaxCacheSize, mcacheStoreInEnabled, mcacheStoreInMaxSize, mcacheStoreInMinSize, mcacheStoreOutEnabled, mcacheStoreSeMaxSize, ngxFreeConnectionStack, persistenceEntriesLowWatermark, persistenceMemMax, scaleoutUdpPerPkt, seAuthLdapBindTimeout, seAuthLdapCacheSize, seAuthLdapConnectTimeout, seAuthLdapConnsPerServer, seAuthLdapReconnectTimeout, seAuthLdapRequestTimeout, seAuthLdapServersFailoverOnly, seDpCompression, seDpHmDrops, seDpIfStatePollInterval, seDpLogNfEnqueuePercent, seDpLogUdfEnqueuePercent, seDpVnicQueueStallEventSleep, seDpVnicQueueStallThreshold, seDpVnicQueueStallTimeout, seDpVnicRestartOnQueueStallCount, seDpVnicStallSeRestartWindow, seDumpCoreOnAssert, seHandleInterfaceRoutes, seHbPersistFudgeBits, seMacErrorThresholdToDisablePromiscious, seMallocThresh, seMemoryPoison, seMetricsInterval, seMetricsRtEnabled, seMetricsRtInterval, sePacketBufferMax, seRandomTcpDrops, seRateLimiters, serviceIpSubnets, servicePortRanges, servicesAccessibleAllInterfaces, spdyFwdProxyParseEnable, tcpSynCacheMax, tcpSyncacheMaxRetransmitDefault, upstreamConnectTimeout, upstreamConnpoolCacheThresh, upstreamConnpoolConnIdleThreshTmo, upstreamConnpoolConnIdleTmo, upstreamConnpoolConnLifeTmo, upstreamConnpoolConnMaxReuse, upstreamConnpoolCoreMaxCache, upstreamConnpoolEnable, upstreamConnpoolServerMaxCache, upstreamConnpoolStrategy, upstreamKeepalive, upstreamReadTimeout, upstreamSendTimeout, userDefinedMetricAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeRuntimeProperties {\n");
    
    sb.append("    adminSshEnabled: ").append(toIndentedString(adminSshEnabled)).append("\n");
    sb.append("    appHeaders: ").append(toIndentedString(appHeaders)).append("\n");
    sb.append("    baremetalDispatcherHandlesFlows: ").append(toIndentedString(baremetalDispatcherHandlesFlows)).append("\n");
    sb.append("    connectionsLossyLogRateLimiterThreshold: ").append(toIndentedString(connectionsLossyLogRateLimiterThreshold)).append("\n");
    sb.append("    connectionsUdfnfLogRateLimiterThreshold: ").append(toIndentedString(connectionsUdfnfLogRateLimiterThreshold)).append("\n");
    sb.append("    disableFlowProbes: ").append(toIndentedString(disableFlowProbes)).append("\n");
    sb.append("    disableGro: ").append(toIndentedString(disableGro)).append("\n");
    sb.append("    disableTso: ").append(toIndentedString(disableTso)).append("\n");
    sb.append("    dosProfile: ").append(toIndentedString(dosProfile)).append("\n");
    sb.append("    downstreamSendTimeout: ").append(toIndentedString(downstreamSendTimeout)).append("\n");
    sb.append("    dpAggressiveHbFrequency: ").append(toIndentedString(dpAggressiveHbFrequency)).append("\n");
    sb.append("    dpAggressiveHbTimeoutCount: ").append(toIndentedString(dpAggressiveHbTimeoutCount)).append("\n");
    sb.append("    dpHbFrequency: ").append(toIndentedString(dpHbFrequency)).append("\n");
    sb.append("    dpHbTimeoutCount: ").append(toIndentedString(dpHbTimeoutCount)).append("\n");
    sb.append("    dupipFrequency: ").append(toIndentedString(dupipFrequency)).append("\n");
    sb.append("    dupipTimeoutCount: ").append(toIndentedString(dupipTimeoutCount)).append("\n");
    sb.append("    enableHsmLog: ").append(toIndentedString(enableHsmLog)).append("\n");
    sb.append("    feproxyVipsEnableProxyArp: ").append(toIndentedString(feproxyVipsEnableProxyArp)).append("\n");
    sb.append("    flowTableBatchPushFrequency: ").append(toIndentedString(flowTableBatchPushFrequency)).append("\n");
    sb.append("    flowTableMaxEntriesDeprecated: ").append(toIndentedString(flowTableMaxEntriesDeprecated)).append("\n");
    sb.append("    flowTableNewSynMaxEntries: ").append(toIndentedString(flowTableNewSynMaxEntries)).append("\n");
    sb.append("    globalMtu: ").append(toIndentedString(globalMtu)).append("\n");
    sb.append("    httpRumConsoleLog: ").append(toIndentedString(httpRumConsoleLog)).append("\n");
    sb.append("    httpRumMinContentLength: ").append(toIndentedString(httpRumMinContentLength)).append("\n");
    sb.append("    lbBatchPushFrequency: ").append(toIndentedString(lbBatchPushFrequency)).append("\n");
    sb.append("    lbFailMaxTime: ").append(toIndentedString(lbFailMaxTime)).append("\n");
    sb.append("    lbactionNumRequestsToDispatch: ").append(toIndentedString(lbactionNumRequestsToDispatch)).append("\n");
    sb.append("    lbactionRqPerRequestMaxRetries: ").append(toIndentedString(lbactionRqPerRequestMaxRetries)).append("\n");
    sb.append("    logAgentCompressLogs: ").append(toIndentedString(logAgentCompressLogs)).append("\n");
    sb.append("    logAgentConnSendBufferSize: ").append(toIndentedString(logAgentConnSendBufferSize)).append("\n");
    sb.append("    logAgentExportMsgBufferSize: ").append(toIndentedString(logAgentExportMsgBufferSize)).append("\n");
    sb.append("    logAgentExportWaitTime: ").append(toIndentedString(logAgentExportWaitTime)).append("\n");
    sb.append("    logAgentFileSzAppl: ").append(toIndentedString(logAgentFileSzAppl)).append("\n");
    sb.append("    logAgentFileSzConn: ").append(toIndentedString(logAgentFileSzConn)).append("\n");
    sb.append("    logAgentFileSzDebug: ").append(toIndentedString(logAgentFileSzDebug)).append("\n");
    sb.append("    logAgentFileSzEvent: ").append(toIndentedString(logAgentFileSzEvent)).append("\n");
    sb.append("    logAgentLogStorageMinSz: ").append(toIndentedString(logAgentLogStorageMinSz)).append("\n");
    sb.append("    logAgentMaxActiveAdfFilesPerVs: ").append(toIndentedString(logAgentMaxActiveAdfFilesPerVs)).append("\n");
    sb.append("    logAgentMaxConcurrentRsync: ").append(toIndentedString(logAgentMaxConcurrentRsync)).append("\n");
    sb.append("    logAgentMaxLogmessageProtoSz: ").append(toIndentedString(logAgentMaxLogmessageProtoSz)).append("\n");
    sb.append("    logAgentMaxStorageExcessPercent: ").append(toIndentedString(logAgentMaxStorageExcessPercent)).append("\n");
    sb.append("    logAgentMaxStorageIgnorePercent: ").append(toIndentedString(logAgentMaxStorageIgnorePercent)).append("\n");
    sb.append("    logAgentMinStoragePerVs: ").append(toIndentedString(logAgentMinStoragePerVs)).append("\n");
    sb.append("    logAgentPauseInterval: ").append(toIndentedString(logAgentPauseInterval)).append("\n");
    sb.append("    logAgentSleepInterval: ").append(toIndentedString(logAgentSleepInterval)).append("\n");
    sb.append("    logAgentUnknownVsTimer: ").append(toIndentedString(logAgentUnknownVsTimer)).append("\n");
    sb.append("    logMessageMaxFileListSize: ").append(toIndentedString(logMessageMaxFileListSize)).append("\n");
    sb.append("    maxThroughput: ").append(toIndentedString(maxThroughput)).append("\n");
    sb.append("    mcacheEnabled: ").append(toIndentedString(mcacheEnabled)).append("\n");
    sb.append("    mcacheFetchEnabled: ").append(toIndentedString(mcacheFetchEnabled)).append("\n");
    sb.append("    mcacheMaxCacheSize: ").append(toIndentedString(mcacheMaxCacheSize)).append("\n");
    sb.append("    mcacheStoreInEnabled: ").append(toIndentedString(mcacheStoreInEnabled)).append("\n");
    sb.append("    mcacheStoreInMaxSize: ").append(toIndentedString(mcacheStoreInMaxSize)).append("\n");
    sb.append("    mcacheStoreInMinSize: ").append(toIndentedString(mcacheStoreInMinSize)).append("\n");
    sb.append("    mcacheStoreOutEnabled: ").append(toIndentedString(mcacheStoreOutEnabled)).append("\n");
    sb.append("    mcacheStoreSeMaxSize: ").append(toIndentedString(mcacheStoreSeMaxSize)).append("\n");
    sb.append("    ngxFreeConnectionStack: ").append(toIndentedString(ngxFreeConnectionStack)).append("\n");
    sb.append("    persistenceEntriesLowWatermark: ").append(toIndentedString(persistenceEntriesLowWatermark)).append("\n");
    sb.append("    persistenceMemMax: ").append(toIndentedString(persistenceMemMax)).append("\n");
    sb.append("    scaleoutUdpPerPkt: ").append(toIndentedString(scaleoutUdpPerPkt)).append("\n");
    sb.append("    seAuthLdapBindTimeout: ").append(toIndentedString(seAuthLdapBindTimeout)).append("\n");
    sb.append("    seAuthLdapCacheSize: ").append(toIndentedString(seAuthLdapCacheSize)).append("\n");
    sb.append("    seAuthLdapConnectTimeout: ").append(toIndentedString(seAuthLdapConnectTimeout)).append("\n");
    sb.append("    seAuthLdapConnsPerServer: ").append(toIndentedString(seAuthLdapConnsPerServer)).append("\n");
    sb.append("    seAuthLdapReconnectTimeout: ").append(toIndentedString(seAuthLdapReconnectTimeout)).append("\n");
    sb.append("    seAuthLdapRequestTimeout: ").append(toIndentedString(seAuthLdapRequestTimeout)).append("\n");
    sb.append("    seAuthLdapServersFailoverOnly: ").append(toIndentedString(seAuthLdapServersFailoverOnly)).append("\n");
    sb.append("    seDpCompression: ").append(toIndentedString(seDpCompression)).append("\n");
    sb.append("    seDpHmDrops: ").append(toIndentedString(seDpHmDrops)).append("\n");
    sb.append("    seDpIfStatePollInterval: ").append(toIndentedString(seDpIfStatePollInterval)).append("\n");
    sb.append("    seDpLogNfEnqueuePercent: ").append(toIndentedString(seDpLogNfEnqueuePercent)).append("\n");
    sb.append("    seDpLogUdfEnqueuePercent: ").append(toIndentedString(seDpLogUdfEnqueuePercent)).append("\n");
    sb.append("    seDpVnicQueueStallEventSleep: ").append(toIndentedString(seDpVnicQueueStallEventSleep)).append("\n");
    sb.append("    seDpVnicQueueStallThreshold: ").append(toIndentedString(seDpVnicQueueStallThreshold)).append("\n");
    sb.append("    seDpVnicQueueStallTimeout: ").append(toIndentedString(seDpVnicQueueStallTimeout)).append("\n");
    sb.append("    seDpVnicRestartOnQueueStallCount: ").append(toIndentedString(seDpVnicRestartOnQueueStallCount)).append("\n");
    sb.append("    seDpVnicStallSeRestartWindow: ").append(toIndentedString(seDpVnicStallSeRestartWindow)).append("\n");
    sb.append("    seDumpCoreOnAssert: ").append(toIndentedString(seDumpCoreOnAssert)).append("\n");
    sb.append("    seHandleInterfaceRoutes: ").append(toIndentedString(seHandleInterfaceRoutes)).append("\n");
    sb.append("    seHbPersistFudgeBits: ").append(toIndentedString(seHbPersistFudgeBits)).append("\n");
    sb.append("    seMacErrorThresholdToDisablePromiscious: ").append(toIndentedString(seMacErrorThresholdToDisablePromiscious)).append("\n");
    sb.append("    seMallocThresh: ").append(toIndentedString(seMallocThresh)).append("\n");
    sb.append("    seMemoryPoison: ").append(toIndentedString(seMemoryPoison)).append("\n");
    sb.append("    seMetricsInterval: ").append(toIndentedString(seMetricsInterval)).append("\n");
    sb.append("    seMetricsRtEnabled: ").append(toIndentedString(seMetricsRtEnabled)).append("\n");
    sb.append("    seMetricsRtInterval: ").append(toIndentedString(seMetricsRtInterval)).append("\n");
    sb.append("    sePacketBufferMax: ").append(toIndentedString(sePacketBufferMax)).append("\n");
    sb.append("    seRandomTcpDrops: ").append(toIndentedString(seRandomTcpDrops)).append("\n");
    sb.append("    seRateLimiters: ").append(toIndentedString(seRateLimiters)).append("\n");
    sb.append("    serviceIpSubnets: ").append(toIndentedString(serviceIpSubnets)).append("\n");
    sb.append("    servicePortRanges: ").append(toIndentedString(servicePortRanges)).append("\n");
    sb.append("    servicesAccessibleAllInterfaces: ").append(toIndentedString(servicesAccessibleAllInterfaces)).append("\n");
    sb.append("    spdyFwdProxyParseEnable: ").append(toIndentedString(spdyFwdProxyParseEnable)).append("\n");
    sb.append("    tcpSynCacheMax: ").append(toIndentedString(tcpSynCacheMax)).append("\n");
    sb.append("    tcpSyncacheMaxRetransmitDefault: ").append(toIndentedString(tcpSyncacheMaxRetransmitDefault)).append("\n");
    sb.append("    upstreamConnectTimeout: ").append(toIndentedString(upstreamConnectTimeout)).append("\n");
    sb.append("    upstreamConnpoolCacheThresh: ").append(toIndentedString(upstreamConnpoolCacheThresh)).append("\n");
    sb.append("    upstreamConnpoolConnIdleThreshTmo: ").append(toIndentedString(upstreamConnpoolConnIdleThreshTmo)).append("\n");
    sb.append("    upstreamConnpoolConnIdleTmo: ").append(toIndentedString(upstreamConnpoolConnIdleTmo)).append("\n");
    sb.append("    upstreamConnpoolConnLifeTmo: ").append(toIndentedString(upstreamConnpoolConnLifeTmo)).append("\n");
    sb.append("    upstreamConnpoolConnMaxReuse: ").append(toIndentedString(upstreamConnpoolConnMaxReuse)).append("\n");
    sb.append("    upstreamConnpoolCoreMaxCache: ").append(toIndentedString(upstreamConnpoolCoreMaxCache)).append("\n");
    sb.append("    upstreamConnpoolEnable: ").append(toIndentedString(upstreamConnpoolEnable)).append("\n");
    sb.append("    upstreamConnpoolServerMaxCache: ").append(toIndentedString(upstreamConnpoolServerMaxCache)).append("\n");
    sb.append("    upstreamConnpoolStrategy: ").append(toIndentedString(upstreamConnpoolStrategy)).append("\n");
    sb.append("    upstreamKeepalive: ").append(toIndentedString(upstreamKeepalive)).append("\n");
    sb.append("    upstreamReadTimeout: ").append(toIndentedString(upstreamReadTimeout)).append("\n");
    sb.append("    upstreamSendTimeout: ").append(toIndentedString(upstreamSendTimeout)).append("\n");
    sb.append("    userDefinedMetricAge: ").append(toIndentedString(userDefinedMetricAge)).append("\n");
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

