package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.FalsePositiveLearningConfig;
import com.vmware.avi.vro.model.UserAgentCacheConfig;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ControllerProperties is a POJO class extends AviRestResource that used for creating
 * ControllerProperties.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerProperties")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERPROPERTIES, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerProperties extends AviRestResource {
    @JsonProperty("allow_admin_network_updates")
    @JsonInclude(Include.NON_NULL)
    private Boolean allowAdminNetworkUpdates = false;

    @JsonProperty("allow_ip_forwarding")
    @JsonInclude(Include.NON_NULL)
    private Boolean allowIpForwarding = false;

    @JsonProperty("allow_unauthenticated_apis")
    @JsonInclude(Include.NON_NULL)
    private Boolean allowUnauthenticatedApis = false;

    @JsonProperty("allow_unauthenticated_nodes")
    @JsonInclude(Include.NON_NULL)
    private Boolean allowUnauthenticatedNodes = false;

    @JsonProperty("api_idle_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer apiIdleTimeout = 15;

    @JsonProperty("api_perf_logging_threshold")
    @JsonInclude(Include.NON_NULL)
    private Integer apiPerfLoggingThreshold = 10000;

    @JsonProperty("appviewx_compat_mode")
    @JsonInclude(Include.NON_NULL)
    private Boolean appviewxCompatMode = false;

    @JsonProperty("async_patch_merge_period")
    @JsonInclude(Include.NON_NULL)
    private Integer asyncPatchMergePeriod = 0;

    @JsonProperty("async_patch_request_cleanup_duration")
    @JsonInclude(Include.NON_NULL)
    private Integer asyncPatchRequestCleanupDuration = 60;

    @JsonProperty("attach_ip_retry_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer attachIpRetryInterval = 360;

    @JsonProperty("attach_ip_retry_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer attachIpRetryLimit = 4;

    @JsonProperty("bm_use_ansible")
    @JsonInclude(Include.NON_NULL)
    private Boolean bmUseAnsible = true;

    @JsonProperty("check_vsvip_fqdn_syntax")
    @JsonInclude(Include.NON_NULL)
    private Boolean checkVsvipFqdnSyntax = true;

    @JsonProperty("cleanup_expired_authtoken_timeout_period")
    @JsonInclude(Include.NON_NULL)
    private Integer cleanupExpiredAuthtokenTimeoutPeriod = 60;

    @JsonProperty("cleanup_sessions_timeout_period")
    @JsonInclude(Include.NON_NULL)
    private Integer cleanupSessionsTimeoutPeriod = 60;

    @JsonProperty("cloud_discovery_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer cloudDiscoveryInterval = 5;

    @JsonProperty("cloud_reconcile")
    @JsonInclude(Include.NON_NULL)
    private Boolean cloudReconcile = true;

    @JsonProperty("cloud_reconcile_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer cloudReconcileInterval = 5;

    @JsonProperty("cluster_ip_gratuitous_arp_period")
    @JsonInclude(Include.NON_NULL)
    private Integer clusterIpGratuitousArpPeriod = 60;

    @JsonProperty("consistency_check_timeout_period")
    @JsonInclude(Include.NON_NULL)
    private Integer consistencyCheckTimeoutPeriod = 60;

    @JsonProperty("controller_resource_info_collection_period")
    @JsonInclude(Include.NON_NULL)
    private Integer controllerResourceInfoCollectionPeriod = 525600;

    @JsonProperty("crashed_se_reboot")
    @JsonInclude(Include.NON_NULL)
    private Integer crashedSeReboot = 900;

    @JsonProperty("dead_se_detection_timer")
    @JsonInclude(Include.NON_NULL)
    private Integer deadSeDetectionTimer = 360;

    @JsonProperty("default_minimum_api_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer defaultMinimumApiTimeout = 60;

    @JsonProperty("del_offline_se_after_reboot_delay")
    @JsonInclude(Include.NON_NULL)
    private Integer delOfflineSeAfterRebootDelay = 300;

    @JsonProperty("detach_ip_retry_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer detachIpRetryInterval = 60;

    @JsonProperty("detach_ip_retry_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer detachIpRetryLimit = 4;

    @JsonProperty("detach_ip_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer detachIpTimeout = 300;

    @JsonProperty("dns_refresh_period")
    @JsonInclude(Include.NON_NULL)
    private Integer dnsRefreshPeriod = 60;

    @JsonProperty("dummy")
    @JsonInclude(Include.NON_NULL)
    private Integer dummy;

    @JsonProperty("edit_system_limits")
    @JsonInclude(Include.NON_NULL)
    private Boolean editSystemLimits = false;

    @JsonProperty("enable_api_sharding")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableApiSharding = true;

    @JsonProperty("enable_memory_balancer")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableMemoryBalancer = true;

    @JsonProperty("enable_per_process_stop")
    @JsonInclude(Include.NON_NULL)
    private Boolean enablePerProcessStop = false;

    @JsonIgnore
    private Boolean enableResmgrLogCachePrint = false;

    @JsonProperty("false_positive_learning_config")
    @JsonInclude(Include.NON_NULL)
    private FalsePositiveLearningConfig falsePositiveLearningConfig;

    @JsonProperty("fatal_error_lease_time")
    @JsonInclude(Include.NON_NULL)
    private Integer fatalErrorLeaseTime = 120;

    @JsonProperty("federated_datastore_cleanup_duration")
    @JsonInclude(Include.NON_NULL)
    private Integer federatedDatastoreCleanupDuration = 120;

    @JsonProperty("file_object_cleanup_period")
    @JsonInclude(Include.NON_NULL)
    private Integer fileObjectCleanupPeriod = 1440;

    @JsonProperty("fileobject_max_file_versions")
    @JsonInclude(Include.NON_NULL)
    private Integer fileobjectMaxFileVersions = 3;

    @JsonProperty("gslb_purge_batch_size")
    @JsonInclude(Include.NON_NULL)
    private Integer gslbPurgeBatchSize = 1000;

    @JsonProperty("gslb_purge_sleep_time_ms")
    @JsonInclude(Include.NON_NULL)
    private Integer gslbPurgeSleepTimeMs = 50;

    @JsonProperty("ignore_vrf_in_networksubnetlist")
    @JsonInclude(Include.NON_NULL)
    private Boolean ignoreVrfInNetworksubnetlist = false;

    @JsonProperty("max_dead_se_in_grp")
    @JsonInclude(Include.NON_NULL)
    private Integer maxDeadSeInGrp = 1;

    @JsonProperty("max_pcap_per_tenant")
    @JsonInclude(Include.NON_NULL)
    private Integer maxPcapPerTenant = 4;

    @JsonProperty("max_se_spawn_interval_delay")
    @JsonInclude(Include.NON_NULL)
    private Integer maxSeSpawnIntervalDelay = 1800;

    @JsonProperty("max_seq_attach_ip_failures")
    @JsonInclude(Include.NON_NULL)
    private Integer maxSeqAttachIpFailures = 3;

    @JsonProperty("max_seq_vnic_failures")
    @JsonInclude(Include.NON_NULL)
    private Integer maxSeqVnicFailures = 3;

    @JsonProperty("max_threads_cc_vip_bg_worker")
    @JsonInclude(Include.NON_NULL)
    private Integer maxThreadsCcVipBgWorker = 20;

    @JsonProperty("permission_scoped_shared_admin_networks")
    @JsonInclude(Include.NON_NULL)
    private Boolean permissionScopedSharedAdminNetworks = false;

    @JsonProperty("persistence_key_rotate_period")
    @JsonInclude(Include.NON_NULL)
    private Integer persistenceKeyRotatePeriod = 0;

    @JsonProperty("portal_request_burst_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer portalRequestBurstLimit = 0;

    @JsonProperty("portal_request_rate_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer portalRequestRateLimit = 0;

    @JsonProperty("portal_token")
    @JsonInclude(Include.NON_NULL)
    private String portalToken;

    @JsonProperty("postgres_vacuum_period")
    @JsonInclude(Include.NON_NULL)
    private Integer postgresVacuumPeriod = 20160;

    @JsonProperty("process_locked_useraccounts_timeout_period")
    @JsonInclude(Include.NON_NULL)
    private Integer processLockedUseraccountsTimeoutPeriod = 1;

    @JsonProperty("process_pki_profile_timeout_period")
    @JsonInclude(Include.NON_NULL)
    private Integer processPkiProfileTimeoutPeriod = 1440;

    @JsonProperty("query_host_fail")
    @JsonInclude(Include.NON_NULL)
    private Integer queryHostFail = 180;

    @JsonProperty("resmgr_log_caching_period")
    @JsonInclude(Include.NON_NULL)
    private Integer resmgrLogCachingPeriod = 21600;

    @JsonProperty("restrict_cloud_read_access")
    @JsonInclude(Include.NON_NULL)
    private Boolean restrictCloudReadAccess = false;

    @JsonProperty("safenet_hsm_version")
    @JsonInclude(Include.NON_NULL)
    private String safenetHsmVersion;

    @JsonProperty("se_create_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer seCreateTimeout = 900;

    @JsonProperty("se_failover_attempt_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer seFailoverAttemptInterval = 300;

    @JsonProperty("se_from_marketplace")
    @JsonInclude(Include.NON_NULL)
    private String seFromMarketplace = "IMAGE_SE";

    @JsonProperty("se_offline_del")
    @JsonInclude(Include.NON_NULL)
    private Integer seOfflineDel = 172000;

    @JsonProperty("se_spawn_retry_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer seSpawnRetryInterval = 300;

    @JsonProperty("se_upgrade_flow_cleanup_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer seUpgradeFlowCleanupTimeout = 90;

    @JsonProperty("se_vnic_cooldown")
    @JsonInclude(Include.NON_NULL)
    private Integer seVnicCooldown = 120;

    @JsonProperty("se_vnic_gc_wait_time")
    @JsonInclude(Include.NON_NULL)
    private Integer seVnicGcWaitTime = 300;

    @JsonProperty("secure_channel_cleanup_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer secureChannelCleanupTimeout = 60;

    @JsonProperty("secure_channel_controller_token_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer secureChannelControllerTokenTimeout = 60;

    @JsonProperty("secure_channel_se_token_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer secureChannelSeTokenTimeout = 60;

    @JsonProperty("seupgrade_copy_buffer_size")
    @JsonInclude(Include.NON_NULL)
    private Integer seupgradeCopyBufferSize = 512;

    @JsonProperty("seupgrade_copy_pool_size")
    @JsonInclude(Include.NON_NULL)
    private Integer seupgradeCopyPoolSize = 5;

    @JsonProperty("seupgrade_fabric_pool_size")
    @JsonInclude(Include.NON_NULL)
    private Integer seupgradeFabricPoolSize = 20;

    @JsonProperty("seupgrade_segroup_min_dead_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer seupgradeSegroupMinDeadTimeout = 360;

    @JsonProperty("shared_ssl_certificates")
    @JsonInclude(Include.NON_NULL)
    private Boolean sharedSslCertificates = false;

    @JsonProperty("skopeo_retry_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer skopeoRetryInterval = 5;

    @JsonProperty("skopeo_retry_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer skopeoRetryLimit = 3;

    @JsonProperty("soft_min_mem_per_se_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer softMinMemPerSeLimit = 1900;

    @JsonProperty("ssl_certificate_expiry_warning_days")
    @JsonInclude(Include.NON_NULL)
    private List<Integer> sslCertificateExpiryWarningDays;

    @JsonProperty("system_report_cleanup_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer systemReportCleanupInterval = 60;

    @JsonProperty("system_report_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer systemReportLimit = 10;

    @JsonProperty("unresponsive_se_reboot")
    @JsonInclude(Include.NON_NULL)
    private Integer unresponsiveSeReboot = 300;

    @JsonProperty("update_dns_entry_retry_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer updateDnsEntryRetryLimit = 3;

    @JsonProperty("update_dns_entry_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer updateDnsEntryTimeout = 120;

    @JsonProperty("upgrade_dns_ttl")
    @JsonInclude(Include.NON_NULL)
    private Integer upgradeDnsTtl = 5;

    @JsonProperty("upgrade_fat_se_lease_time")
    @JsonInclude(Include.NON_NULL)
    private Integer upgradeFatSeLeaseTime = 1200;

    @JsonProperty("upgrade_lease_time")
    @JsonInclude(Include.NON_NULL)
    private Integer upgradeLeaseTime = 600;

    @JsonProperty("upgrade_se_per_vs_scale_ops_txn_time")
    @JsonInclude(Include.NON_NULL)
    private Integer upgradeSePerVsScaleOpsTxnTime = 3;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("user_agent_cache_config")
    @JsonInclude(Include.NON_NULL)
    private UserAgentCacheConfig userAgentCacheConfig;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("vnic_op_fail_time")
    @JsonInclude(Include.NON_NULL)
    private Integer vnicOpFailTime = 180;

    @JsonProperty("vs_awaiting_se_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer vsAwaitingSeTimeout = 60;

    @JsonProperty("vs_key_rotate_period")
    @JsonInclude(Include.NON_NULL)
    private Integer vsKeyRotatePeriod = 360;

    @JsonProperty("vs_scaleout_ready_check_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer vsScaleoutReadyCheckInterval = 60;

    @JsonProperty("vs_se_attach_ip_fail")
    @JsonInclude(Include.NON_NULL)
    private Integer vsSeAttachIpFail = 600;

    @JsonProperty("vs_se_bootup_fail")
    @JsonInclude(Include.NON_NULL)
    private Integer vsSeBootupFail = 480;

    @JsonProperty("vs_se_bootup_fail_patch")
    @JsonInclude(Include.NON_NULL)
    private Integer vsSeBootupFailPatch = 600;

    @JsonProperty("vs_se_create_fail")
    @JsonInclude(Include.NON_NULL)
    private Integer vsSeCreateFail = 1500;

    @JsonProperty("vs_se_ping_fail")
    @JsonInclude(Include.NON_NULL)
    private Integer vsSePingFail = 60;

    @JsonProperty("vs_se_vnic_fail")
    @JsonInclude(Include.NON_NULL)
    private Integer vsSeVnicFail = 300;

    @JsonProperty("vs_se_vnic_ip_fail")
    @JsonInclude(Include.NON_NULL)
    private Integer vsSeVnicIpFail = 120;

    @JsonProperty("vsphere_ha_detection_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer vsphereHaDetectionTimeout = 120;

    @JsonProperty("vsphere_ha_recovery_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer vsphereHaRecoveryTimeout = 480;

    @JsonProperty("vsphere_ha_timer_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer vsphereHaTimerInterval = 20;

    @JsonProperty("warmstart_se_reconnect_wait_time")
    @JsonInclude(Include.NON_NULL)
    private Integer warmstartSeReconnectWaitTime = 480;

    @JsonProperty("warmstart_vs_resync_wait_time")
    @JsonInclude(Include.NON_NULL)
    private Integer warmstartVsResyncWaitTime = 300;



  /**
   * This is the getter method this will return the attribute value.
   * Allow non-admin tenants to update admin vrfcontext and network objects.
   * Field introduced in 18.2.7, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return allowAdminNetworkUpdates
   */
  @VsoMethod
  public Boolean getAllowAdminNetworkUpdates() {
    return allowAdminNetworkUpdates;
  }

  /**
   * This is the setter method to the attribute.
   * Allow non-admin tenants to update admin vrfcontext and network objects.
   * Field introduced in 18.2.7, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param allowAdminNetworkUpdates set the allowAdminNetworkUpdates.
   */
  @VsoMethod
  public void setAllowAdminNetworkUpdates(Boolean  allowAdminNetworkUpdates) {
    this.allowAdminNetworkUpdates = allowAdminNetworkUpdates;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return allowIpForwarding
   */
  @VsoMethod
  public Boolean getAllowIpForwarding() {
    return allowIpForwarding;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param allowIpForwarding set the allowIpForwarding.
   */
  @VsoMethod
  public void setAllowIpForwarding(Boolean  allowIpForwarding) {
    this.allowIpForwarding = allowIpForwarding;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allow unauthenticated access for special apis.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return allowUnauthenticatedApis
   */
  @VsoMethod
  public Boolean getAllowUnauthenticatedApis() {
    return allowUnauthenticatedApis;
  }

  /**
   * This is the setter method to the attribute.
   * Allow unauthenticated access for special apis.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param allowUnauthenticatedApis set the allowUnauthenticatedApis.
   */
  @VsoMethod
  public void setAllowUnauthenticatedApis(Boolean  allowUnauthenticatedApis) {
    this.allowUnauthenticatedApis = allowUnauthenticatedApis;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return allowUnauthenticatedNodes
   */
  @VsoMethod
  public Boolean getAllowUnauthenticatedNodes() {
    return allowUnauthenticatedNodes;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param allowUnauthenticatedNodes set the allowUnauthenticatedNodes.
   */
  @VsoMethod
  public void setAllowUnauthenticatedNodes(Boolean  allowUnauthenticatedNodes) {
    this.allowUnauthenticatedNodes = allowUnauthenticatedNodes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed values are 0-1440.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 15.
   * @return apiIdleTimeout
   */
  @VsoMethod
  public Integer getApiIdleTimeout() {
    return apiIdleTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed values are 0-1440.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 15.
   * @param apiIdleTimeout set the apiIdleTimeout.
   */
  @VsoMethod
  public void setApiIdleTimeout(Integer  apiIdleTimeout) {
    this.apiIdleTimeout = apiIdleTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Threshold to log request timing in portal_performance.log and server-timing response header.
   * Any stage taking longer than 1% of the threshold will be included in the server-timing header.
   * Field introduced in 18.1.4, 18.2.1.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
   * @return apiPerfLoggingThreshold
   */
  @VsoMethod
  public Integer getApiPerfLoggingThreshold() {
    return apiPerfLoggingThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * Threshold to log request timing in portal_performance.log and server-timing response header.
   * Any stage taking longer than 1% of the threshold will be included in the server-timing header.
   * Field introduced in 18.1.4, 18.2.1.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
   * @param apiPerfLoggingThreshold set the apiPerfLoggingThreshold.
   */
  @VsoMethod
  public void setApiPerfLoggingThreshold(Integer  apiPerfLoggingThreshold) {
    this.apiPerfLoggingThreshold = apiPerfLoggingThreshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Export configuration in appviewx compatibility mode.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return appviewxCompatMode
   */
  @VsoMethod
  public Boolean getAppviewxCompatMode() {
    return appviewxCompatMode;
  }

  /**
   * This is the setter method to the attribute.
   * Export configuration in appviewx compatibility mode.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param appviewxCompatMode set the appviewxCompatMode.
   */
  @VsoMethod
  public void setAppviewxCompatMode(Boolean  appviewxCompatMode) {
    this.appviewxCompatMode = appviewxCompatMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Period for which asynchronous patch requests are queued.
   * Allowed values are 30-120.
   * Special values are 0 - deactivated.
   * Field introduced in 18.2.11, 20.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return asyncPatchMergePeriod
   */
  @VsoMethod
  public Integer getAsyncPatchMergePeriod() {
    return asyncPatchMergePeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Period for which asynchronous patch requests are queued.
   * Allowed values are 30-120.
   * Special values are 0 - deactivated.
   * Field introduced in 18.2.11, 20.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param asyncPatchMergePeriod set the asyncPatchMergePeriod.
   */
  @VsoMethod
  public void setAsyncPatchMergePeriod(Integer  asyncPatchMergePeriod) {
    this.asyncPatchMergePeriod = asyncPatchMergePeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Duration for which asynchronous patch requests should be kept, after being marked as success or fail.
   * Allowed values are 5-120.
   * Field introduced in 18.2.11, 20.1.3.
   * Unit is min.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return asyncPatchRequestCleanupDuration
   */
  @VsoMethod
  public Integer getAsyncPatchRequestCleanupDuration() {
    return asyncPatchRequestCleanupDuration;
  }

  /**
   * This is the setter method to the attribute.
   * Duration for which asynchronous patch requests should be kept, after being marked as success or fail.
   * Allowed values are 5-120.
   * Field introduced in 18.2.11, 20.1.3.
   * Unit is min.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param asyncPatchRequestCleanupDuration set the asyncPatchRequestCleanupDuration.
   */
  @VsoMethod
  public void setAsyncPatchRequestCleanupDuration(Integer  asyncPatchRequestCleanupDuration) {
    this.asyncPatchRequestCleanupDuration = asyncPatchRequestCleanupDuration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 360.
   * @return attachIpRetryInterval
   */
  @VsoMethod
  public Integer getAttachIpRetryInterval() {
    return attachIpRetryInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 360.
   * @param attachIpRetryInterval set the attachIpRetryInterval.
   */
  @VsoMethod
  public void setAttachIpRetryInterval(Integer  attachIpRetryInterval) {
    this.attachIpRetryInterval = attachIpRetryInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @return attachIpRetryLimit
   */
  @VsoMethod
  public Integer getAttachIpRetryLimit() {
    return attachIpRetryLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @param attachIpRetryLimit set the attachIpRetryLimit.
   */
  @VsoMethod
  public void setAttachIpRetryLimit(Integer  attachIpRetryLimit) {
    this.attachIpRetryLimit = attachIpRetryLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use ansible for se creation in baremetal.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return bmUseAnsible
   */
  @VsoMethod
  public Boolean getBmUseAnsible() {
    return bmUseAnsible;
  }

  /**
   * This is the setter method to the attribute.
   * Use ansible for se creation in baremetal.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param bmUseAnsible set the bmUseAnsible.
   */
  @VsoMethod
  public void setBmUseAnsible(Boolean  bmUseAnsible) {
    this.bmUseAnsible = bmUseAnsible;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enforce vsvip fqdn syntax checks.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return checkVsvipFqdnSyntax
   */
  @VsoMethod
  public Boolean getCheckVsvipFqdnSyntax() {
    return checkVsvipFqdnSyntax;
  }

  /**
   * This is the setter method to the attribute.
   * Enforce vsvip fqdn syntax checks.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param checkVsvipFqdnSyntax set the checkVsvipFqdnSyntax.
   */
  @VsoMethod
  public void setCheckVsvipFqdnSyntax(Boolean  checkVsvipFqdnSyntax) {
    this.checkVsvipFqdnSyntax = checkVsvipFqdnSyntax;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Period for auth token cleanup job.
   * Field introduced in 18.1.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return cleanupExpiredAuthtokenTimeoutPeriod
   */
  @VsoMethod
  public Integer getCleanupExpiredAuthtokenTimeoutPeriod() {
    return cleanupExpiredAuthtokenTimeoutPeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Period for auth token cleanup job.
   * Field introduced in 18.1.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param cleanupExpiredAuthtokenTimeoutPeriod set the cleanupExpiredAuthtokenTimeoutPeriod.
   */
  @VsoMethod
  public void setCleanupExpiredAuthtokenTimeoutPeriod(Integer  cleanupExpiredAuthtokenTimeoutPeriod) {
    this.cleanupExpiredAuthtokenTimeoutPeriod = cleanupExpiredAuthtokenTimeoutPeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Period for sessions cleanup job.
   * Field introduced in 18.1.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return cleanupSessionsTimeoutPeriod
   */
  @VsoMethod
  public Integer getCleanupSessionsTimeoutPeriod() {
    return cleanupSessionsTimeoutPeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Period for sessions cleanup job.
   * Field introduced in 18.1.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param cleanupSessionsTimeoutPeriod set the cleanupSessionsTimeoutPeriod.
   */
  @VsoMethod
  public void setCleanupSessionsTimeoutPeriod(Integer  cleanupSessionsTimeoutPeriod) {
    this.cleanupSessionsTimeoutPeriod = cleanupSessionsTimeoutPeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time in minutes to wait between consecutive cloud discovery cycles.
   * Allowed values are 1-1440.
   * Field introduced in 30.2.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return cloudDiscoveryInterval
   */
  @VsoMethod
  public Integer getCloudDiscoveryInterval() {
    return cloudDiscoveryInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Time in minutes to wait between consecutive cloud discovery cycles.
   * Allowed values are 1-1440.
   * Field introduced in 30.2.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param cloudDiscoveryInterval set the cloudDiscoveryInterval.
   */
  @VsoMethod
  public void setCloudDiscoveryInterval(Integer  cloudDiscoveryInterval) {
    this.cloudDiscoveryInterval = cloudDiscoveryInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable/disable periodic reconcile for all the clouds.
   * Field introduced in 17.2.14,18.1.5,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return cloudReconcile
   */
  @VsoMethod
  public Boolean getCloudReconcile() {
    return cloudReconcile;
  }

  /**
   * This is the setter method to the attribute.
   * Enable/disable periodic reconcile for all the clouds.
   * Field introduced in 17.2.14,18.1.5,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param cloudReconcile set the cloudReconcile.
   */
  @VsoMethod
  public void setCloudReconcile(Boolean  cloudReconcile) {
    this.cloudReconcile = cloudReconcile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time in minutes to wait between consecutive cloud reconcile cycles.
   * Allowed values are 1-1440.
   * Field introduced in 30.2.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return cloudReconcileInterval
   */
  @VsoMethod
  public Integer getCloudReconcileInterval() {
    return cloudReconcileInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Time in minutes to wait between consecutive cloud reconcile cycles.
   * Allowed values are 1-1440.
   * Field introduced in 30.2.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param cloudReconcileInterval set the cloudReconcileInterval.
   */
  @VsoMethod
  public void setCloudReconcileInterval(Integer  cloudReconcileInterval) {
    this.cloudReconcileInterval = cloudReconcileInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Period for cluster ip gratuitous arp job.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return clusterIpGratuitousArpPeriod
   */
  @VsoMethod
  public Integer getClusterIpGratuitousArpPeriod() {
    return clusterIpGratuitousArpPeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Period for cluster ip gratuitous arp job.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param clusterIpGratuitousArpPeriod set the clusterIpGratuitousArpPeriod.
   */
  @VsoMethod
  public void setClusterIpGratuitousArpPeriod(Integer  clusterIpGratuitousArpPeriod) {
    this.clusterIpGratuitousArpPeriod = clusterIpGratuitousArpPeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Period for consistency check job.
   * Field introduced in 18.1.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return consistencyCheckTimeoutPeriod
   */
  @VsoMethod
  public Integer getConsistencyCheckTimeoutPeriod() {
    return consistencyCheckTimeoutPeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Period for consistency check job.
   * Field introduced in 18.1.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param consistencyCheckTimeoutPeriod set the consistencyCheckTimeoutPeriod.
   */
  @VsoMethod
  public void setConsistencyCheckTimeoutPeriod(Integer  consistencyCheckTimeoutPeriod) {
    this.consistencyCheckTimeoutPeriod = consistencyCheckTimeoutPeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Periodically collect stats.
   * Field introduced in 20.1.3.
   * Unit is min.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 525600.
   * @return controllerResourceInfoCollectionPeriod
   */
  @VsoMethod
  public Integer getControllerResourceInfoCollectionPeriod() {
    return controllerResourceInfoCollectionPeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Periodically collect stats.
   * Field introduced in 20.1.3.
   * Unit is min.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 525600.
   * @param controllerResourceInfoCollectionPeriod set the controllerResourceInfoCollectionPeriod.
   */
  @VsoMethod
  public void setControllerResourceInfoCollectionPeriod(Integer  controllerResourceInfoCollectionPeriod) {
    this.controllerResourceInfoCollectionPeriod = controllerResourceInfoCollectionPeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 900.
   * @return crashedSeReboot
   */
  @VsoMethod
  public Integer getCrashedSeReboot() {
    return crashedSeReboot;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 900.
   * @param crashedSeReboot set the crashedSeReboot.
   */
  @VsoMethod
  public void setCrashedSeReboot(Integer  crashedSeReboot) {
    this.crashedSeReboot = crashedSeReboot;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 360.
   * @return deadSeDetectionTimer
   */
  @VsoMethod
  public Integer getDeadSeDetectionTimer() {
    return deadSeDetectionTimer;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 360.
   * @param deadSeDetectionTimer set the deadSeDetectionTimer.
   */
  @VsoMethod
  public void setDeadSeDetectionTimer(Integer  deadSeDetectionTimer) {
    this.deadSeDetectionTimer = deadSeDetectionTimer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum api timeout value.if this value is not 60, it will be the default timeout for all apis that do not have a specific timeout.if an api has
   * a specific timeout but is less than this value, this value will become the new timeout.
   * Allowed values are 60-3600.
   * Field introduced in 18.2.6.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return defaultMinimumApiTimeout
   */
  @VsoMethod
  public Integer getDefaultMinimumApiTimeout() {
    return defaultMinimumApiTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum api timeout value.if this value is not 60, it will be the default timeout for all apis that do not have a specific timeout.if an api has
   * a specific timeout but is less than this value, this value will become the new timeout.
   * Allowed values are 60-3600.
   * Field introduced in 18.2.6.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param defaultMinimumApiTimeout set the defaultMinimumApiTimeout.
   */
  @VsoMethod
  public void setDefaultMinimumApiTimeout(Integer  defaultMinimumApiTimeout) {
    this.defaultMinimumApiTimeout = defaultMinimumApiTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The amount of time the controller will wait before deleting an offline se after it has been rebooted.
   * For unresponsive ses, the total time will be  unresponsive_se_reboot + del_offline_se_after_reboot_delay.
   * For crashed ses, the total time will be crashed_se_reboot + del_offline_se_after_reboot_delay.
   * Field introduced in 20.1.5.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return delOfflineSeAfterRebootDelay
   */
  @VsoMethod
  public Integer getDelOfflineSeAfterRebootDelay() {
    return delOfflineSeAfterRebootDelay;
  }

  /**
   * This is the setter method to the attribute.
   * The amount of time the controller will wait before deleting an offline se after it has been rebooted.
   * For unresponsive ses, the total time will be  unresponsive_se_reboot + del_offline_se_after_reboot_delay.
   * For crashed ses, the total time will be crashed_se_reboot + del_offline_se_after_reboot_delay.
   * Field introduced in 20.1.5.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param delOfflineSeAfterRebootDelay set the delOfflineSeAfterRebootDelay.
   */
  @VsoMethod
  public void setDelOfflineSeAfterRebootDelay(Integer  delOfflineSeAfterRebootDelay) {
    this.delOfflineSeAfterRebootDelay = delOfflineSeAfterRebootDelay;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Amount of time to wait after last detach ip failure before attempting next detach ip retry.
   * Field introduced in 21.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return detachIpRetryInterval
   */
  @VsoMethod
  public Integer getDetachIpRetryInterval() {
    return detachIpRetryInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Amount of time to wait after last detach ip failure before attempting next detach ip retry.
   * Field introduced in 21.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param detachIpRetryInterval set the detachIpRetryInterval.
   */
  @VsoMethod
  public void setDetachIpRetryInterval(Integer  detachIpRetryInterval) {
    this.detachIpRetryInterval = detachIpRetryInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of detach ip retries.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @return detachIpRetryLimit
   */
  @VsoMethod
  public Integer getDetachIpRetryLimit() {
    return detachIpRetryLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of detach ip retries.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @param detachIpRetryLimit set the detachIpRetryLimit.
   */
  @VsoMethod
  public void setDetachIpRetryLimit(Integer  detachIpRetryLimit) {
    this.detachIpRetryLimit = detachIpRetryLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time to wait before marking detach ip as failed.
   * Field introduced in 21.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return detachIpTimeout
   */
  @VsoMethod
  public Integer getDetachIpTimeout() {
    return detachIpTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Time to wait before marking detach ip as failed.
   * Field introduced in 21.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param detachIpTimeout set the detachIpTimeout.
   */
  @VsoMethod
  public void setDetachIpTimeout(Integer  detachIpTimeout) {
    this.detachIpTimeout = detachIpTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Period for refresh pool and gslb dns job.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 60), basic edition(allowed values- 60), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return dnsRefreshPeriod
   */
  @VsoMethod
  public Integer getDnsRefreshPeriod() {
    return dnsRefreshPeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Period for refresh pool and gslb dns job.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 60), basic edition(allowed values- 60), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param dnsRefreshPeriod set the dnsRefreshPeriod.
   */
  @VsoMethod
  public void setDnsRefreshPeriod(Integer  dnsRefreshPeriod) {
    this.dnsRefreshPeriod = dnsRefreshPeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dummy
   */
  @VsoMethod
  public Integer getDummy() {
    return dummy;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dummy set the dummy.
   */
  @VsoMethod
  public void setDummy(Integer  dummy) {
    this.dummy = dummy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allow editing of system limits.
   * Keep in mind that these system limits have been carefully selected based on rigorous testing in our testig environments.
   * Modifying these limits could destabilize your cluster.
   * Do this at your own risk!.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return editSystemLimits
   */
  @VsoMethod
  public Boolean getEditSystemLimits() {
    return editSystemLimits;
  }

  /**
   * This is the setter method to the attribute.
   * Allow editing of system limits.
   * Keep in mind that these system limits have been carefully selected based on rigorous testing in our testig environments.
   * Modifying these limits could destabilize your cluster.
   * Do this at your own risk!.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param editSystemLimits set the editSystemLimits.
   */
  @VsoMethod
  public void setEditSystemLimits(Boolean  editSystemLimits) {
    this.editSystemLimits = editSystemLimits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This setting enables the controller leader to shard api requests to the followers (if any).
   * Field introduced in 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enableApiSharding
   */
  @VsoMethod
  public Boolean getEnableApiSharding() {
    return enableApiSharding;
  }

  /**
   * This is the setter method to the attribute.
   * This setting enables the controller leader to shard api requests to the followers (if any).
   * Field introduced in 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enableApiSharding set the enableApiSharding.
   */
  @VsoMethod
  public void setEnableApiSharding(Boolean  enableApiSharding) {
    this.enableApiSharding = enableApiSharding;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable/disable memory balancer.
   * Field introduced in 17.2.8.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enableMemoryBalancer
   */
  @VsoMethod
  public Boolean getEnableMemoryBalancer() {
    return enableMemoryBalancer;
  }

  /**
   * This is the setter method to the attribute.
   * Enable/disable memory balancer.
   * Field introduced in 17.2.8.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enableMemoryBalancer set the enableMemoryBalancer.
   */
  @VsoMethod
  public void setEnableMemoryBalancer(Boolean  enableMemoryBalancer) {
    this.enableMemoryBalancer = enableMemoryBalancer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable stopping of individual processes if process cross the given threshold limit, even when the total controller memory usage is belowits
   * threshold limit.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enablePerProcessStop
   */
  @VsoMethod
  public Boolean getEnablePerProcessStop() {
    return enablePerProcessStop;
  }

  /**
   * This is the setter method to the attribute.
   * Enable stopping of individual processes if process cross the given threshold limit, even when the total controller memory usage is belowits
   * threshold limit.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enablePerProcessStop set the enablePerProcessStop.
   */
  @VsoMethod
  public void setEnablePerProcessStop(Boolean  enablePerProcessStop) {
    this.enablePerProcessStop = enablePerProcessStop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable printing of cached logs inside resource manager.
   * Used for debugging purposes only.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableResmgrLogCachePrint
   */
  @VsoMethod
  public Boolean getEnableResmgrLogCachePrint() {
    return enableResmgrLogCachePrint;
  }

  /**
   * This is the setter method to the attribute.
   * Enable printing of cached logs inside resource manager.
   * Used for debugging purposes only.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableResmgrLogCachePrint set the enableResmgrLogCachePrint.
   */
  @VsoMethod
  public void setEnableResmgrLogCachePrint(Boolean  enableResmgrLogCachePrint) {
    this.enableResmgrLogCachePrint = enableResmgrLogCachePrint;
  }

  /**
   * This is the getter method this will return the attribute value.
   * False positive learning configuration.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return falsePositiveLearningConfig
   */
  @VsoMethod
  public FalsePositiveLearningConfig getFalsePositiveLearningConfig() {
    return falsePositiveLearningConfig;
  }

  /**
   * This is the setter method to the attribute.
   * False positive learning configuration.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param falsePositiveLearningConfig set the falsePositiveLearningConfig.
   */
  @VsoMethod
  public void setFalsePositiveLearningConfig(FalsePositiveLearningConfig falsePositiveLearningConfig) {
    this.falsePositiveLearningConfig = falsePositiveLearningConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 120.
   * @return fatalErrorLeaseTime
   */
  @VsoMethod
  public Integer getFatalErrorLeaseTime() {
    return fatalErrorLeaseTime;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 120.
   * @param fatalErrorLeaseTime set the fatalErrorLeaseTime.
   */
  @VsoMethod
  public void setFatalErrorLeaseTime(Integer  fatalErrorLeaseTime) {
    this.fatalErrorLeaseTime = fatalErrorLeaseTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Federated datastore will not cleanup diffs unless they are at least this duration in the past.
   * Field introduced in 20.1.1.
   * Unit is hours.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 120.
   * @return federatedDatastoreCleanupDuration
   */
  @VsoMethod
  public Integer getFederatedDatastoreCleanupDuration() {
    return federatedDatastoreCleanupDuration;
  }

  /**
   * This is the setter method to the attribute.
   * Federated datastore will not cleanup diffs unless they are at least this duration in the past.
   * Field introduced in 20.1.1.
   * Unit is hours.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 120.
   * @param federatedDatastoreCleanupDuration set the federatedDatastoreCleanupDuration.
   */
  @VsoMethod
  public void setFederatedDatastoreCleanupDuration(Integer  federatedDatastoreCleanupDuration) {
    this.federatedDatastoreCleanupDuration = federatedDatastoreCleanupDuration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Period for file object cleanup job.
   * Field introduced in 20.1.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1440.
   * @return fileObjectCleanupPeriod
   */
  @VsoMethod
  public Integer getFileObjectCleanupPeriod() {
    return fileObjectCleanupPeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Period for file object cleanup job.
   * Field introduced in 20.1.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1440.
   * @param fileObjectCleanupPeriod set the fileObjectCleanupPeriod.
   */
  @VsoMethod
  public void setFileObjectCleanupPeriod(Integer  fileObjectCleanupPeriod) {
    this.fileObjectCleanupPeriod = fileObjectCleanupPeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This is the max number of file versions that will be retained for a file referenced by the local fileobject.
   * Subsequent uploads of file will result in the file rotation of the older version and the latest version retained.
   * Example  when a file upload is done for the first time, there will be a v1 version.
   * Subsequent uploads will get mapped to v1, v2 and v3 versions.
   * On the fourth upload of the file, the v1 will be file rotated and v2, v3 and v4 will be retained.
   * Allowed values are 1-5.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @return fileobjectMaxFileVersions
   */
  @VsoMethod
  public Integer getFileobjectMaxFileVersions() {
    return fileobjectMaxFileVersions;
  }

  /**
   * This is the setter method to the attribute.
   * This is the max number of file versions that will be retained for a file referenced by the local fileobject.
   * Subsequent uploads of file will result in the file rotation of the older version and the latest version retained.
   * Example  when a file upload is done for the first time, there will be a v1 version.
   * Subsequent uploads will get mapped to v1, v2 and v3 versions.
   * On the fourth upload of the file, the v1 will be file rotated and v2, v3 and v4 will be retained.
   * Allowed values are 1-5.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @param fileobjectMaxFileVersions set the fileobjectMaxFileVersions.
   */
  @VsoMethod
  public void setFileobjectMaxFileVersions(Integer  fileobjectMaxFileVersions) {
    this.fileobjectMaxFileVersions = fileobjectMaxFileVersions;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Batch size for the vs_mgr to perform datastrorecleanup during a gslb purge.
   * Allowed values are 50-1200.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @return gslbPurgeBatchSize
   */
  @VsoMethod
  public Integer getGslbPurgeBatchSize() {
    return gslbPurgeBatchSize;
  }

  /**
   * This is the setter method to the attribute.
   * Batch size for the vs_mgr to perform datastrorecleanup during a gslb purge.
   * Allowed values are 50-1200.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @param gslbPurgeBatchSize set the gslbPurgeBatchSize.
   */
  @VsoMethod
  public void setGslbPurgeBatchSize(Integer  gslbPurgeBatchSize) {
    this.gslbPurgeBatchSize = gslbPurgeBatchSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sleep time in the vs_mgr during a federatedpurge rpc call.
   * Allowed values are 50-100.
   * Field introduced in 22.1.3.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 50.
   * @return gslbPurgeSleepTimeMs
   */
  @VsoMethod
  public Integer getGslbPurgeSleepTimeMs() {
    return gslbPurgeSleepTimeMs;
  }

  /**
   * This is the setter method to the attribute.
   * Sleep time in the vs_mgr during a federatedpurge rpc call.
   * Allowed values are 50-100.
   * Field introduced in 22.1.3.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 50.
   * @param gslbPurgeSleepTimeMs set the gslbPurgeSleepTimeMs.
   */
  @VsoMethod
  public void setGslbPurgeSleepTimeMs(Integer  gslbPurgeSleepTimeMs) {
    this.gslbPurgeSleepTimeMs = gslbPurgeSleepTimeMs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ignore the vrf_context filter for /networksubnetlist api.
   * Field introduced in 22.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return ignoreVrfInNetworksubnetlist
   */
  @VsoMethod
  public Boolean getIgnoreVrfInNetworksubnetlist() {
    return ignoreVrfInNetworksubnetlist;
  }

  /**
   * This is the setter method to the attribute.
   * Ignore the vrf_context filter for /networksubnetlist api.
   * Field introduced in 22.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param ignoreVrfInNetworksubnetlist set the ignoreVrfInNetworksubnetlist.
   */
  @VsoMethod
  public void setIgnoreVrfInNetworksubnetlist(Boolean  ignoreVrfInNetworksubnetlist) {
    this.ignoreVrfInNetworksubnetlist = ignoreVrfInNetworksubnetlist;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return maxDeadSeInGrp
   */
  @VsoMethod
  public Integer getMaxDeadSeInGrp() {
    return maxDeadSeInGrp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param maxDeadSeInGrp set the maxDeadSeInGrp.
   */
  @VsoMethod
  public void setMaxDeadSeInGrp(Integer  maxDeadSeInGrp) {
    this.maxDeadSeInGrp = maxDeadSeInGrp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of pcap files stored per tenant.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @return maxPcapPerTenant
   */
  @VsoMethod
  public Integer getMaxPcapPerTenant() {
    return maxPcapPerTenant;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of pcap files stored per tenant.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @param maxPcapPerTenant set the maxPcapPerTenant.
   */
  @VsoMethod
  public void setMaxPcapPerTenant(Integer  maxPcapPerTenant) {
    this.maxPcapPerTenant = maxPcapPerTenant;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum delay possible to add to se_spawn_retry_interval after successive se spawn failure.
   * Field introduced in 20.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1800.
   * @return maxSeSpawnIntervalDelay
   */
  @VsoMethod
  public Integer getMaxSeSpawnIntervalDelay() {
    return maxSeSpawnIntervalDelay;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum delay possible to add to se_spawn_retry_interval after successive se spawn failure.
   * Field introduced in 20.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1800.
   * @param maxSeSpawnIntervalDelay set the maxSeSpawnIntervalDelay.
   */
  @VsoMethod
  public void setMaxSeSpawnIntervalDelay(Integer  maxSeSpawnIntervalDelay) {
    this.maxSeSpawnIntervalDelay = maxSeSpawnIntervalDelay;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of consecutive attach ip failures that halts vs placement.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @return maxSeqAttachIpFailures
   */
  @VsoMethod
  public Integer getMaxSeqAttachIpFailures() {
    return maxSeqAttachIpFailures;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of consecutive attach ip failures that halts vs placement.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @param maxSeqAttachIpFailures set the maxSeqAttachIpFailures.
   */
  @VsoMethod
  public void setMaxSeqAttachIpFailures(Integer  maxSeqAttachIpFailures) {
    this.maxSeqAttachIpFailures = maxSeqAttachIpFailures;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @return maxSeqVnicFailures
   */
  @VsoMethod
  public Integer getMaxSeqVnicFailures() {
    return maxSeqVnicFailures;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @param maxSeqVnicFailures set the maxSeqVnicFailures.
   */
  @VsoMethod
  public void setMaxSeqVnicFailures(Integer  maxSeqVnicFailures) {
    this.maxSeqVnicFailures = maxSeqVnicFailures;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of threads in threadpool used by cloud connector ccvipbgworker.
   * Allowed values are 1-100.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @return maxThreadsCcVipBgWorker
   */
  @VsoMethod
  public Integer getMaxThreadsCcVipBgWorker() {
    return maxThreadsCcVipBgWorker;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of threads in threadpool used by cloud connector ccvipbgworker.
   * Allowed values are 1-100.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @param maxThreadsCcVipBgWorker set the maxThreadsCcVipBgWorker.
   */
  @VsoMethod
  public void setMaxThreadsCcVipBgWorker(Integer  maxThreadsCcVipBgWorker) {
    this.maxThreadsCcVipBgWorker = maxThreadsCcVipBgWorker;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Network and vrfcontext objects from the admin tenant will not be shared to non-admin tenants unless admin permissions are granted.
   * Field introduced in 18.2.7, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return permissionScopedSharedAdminNetworks
   */
  @VsoMethod
  public Boolean getPermissionScopedSharedAdminNetworks() {
    return permissionScopedSharedAdminNetworks;
  }

  /**
   * This is the setter method to the attribute.
   * Network and vrfcontext objects from the admin tenant will not be shared to non-admin tenants unless admin permissions are granted.
   * Field introduced in 18.2.7, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param permissionScopedSharedAdminNetworks set the permissionScopedSharedAdminNetworks.
   */
  @VsoMethod
  public void setPermissionScopedSharedAdminNetworks(Boolean  permissionScopedSharedAdminNetworks) {
    this.permissionScopedSharedAdminNetworks = permissionScopedSharedAdminNetworks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Period for rotate app persistence keys job.
   * Allowed values are 1-1051200.
   * Special values are 0 - disabled.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return persistenceKeyRotatePeriod
   */
  @VsoMethod
  public Integer getPersistenceKeyRotatePeriod() {
    return persistenceKeyRotatePeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Period for rotate app persistence keys job.
   * Allowed values are 1-1051200.
   * Special values are 0 - disabled.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param persistenceKeyRotatePeriod set the persistenceKeyRotatePeriod.
   */
  @VsoMethod
  public void setPersistenceKeyRotatePeriod(Integer  persistenceKeyRotatePeriod) {
    this.persistenceKeyRotatePeriod = persistenceKeyRotatePeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Burst limit on number of incoming requests.
   * 0 to disable.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return portalRequestBurstLimit
   */
  @VsoMethod
  public Integer getPortalRequestBurstLimit() {
    return portalRequestBurstLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Burst limit on number of incoming requests.
   * 0 to disable.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param portalRequestBurstLimit set the portalRequestBurstLimit.
   */
  @VsoMethod
  public void setPortalRequestBurstLimit(Integer  portalRequestBurstLimit) {
    this.portalRequestBurstLimit = portalRequestBurstLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum average number of requests allowed per second.
   * 0 to disable.
   * Field introduced in 20.1.1.
   * Unit is per_second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return portalRequestRateLimit
   */
  @VsoMethod
  public Integer getPortalRequestRateLimit() {
    return portalRequestRateLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum average number of requests allowed per second.
   * 0 to disable.
   * Field introduced in 20.1.1.
   * Unit is per_second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param portalRequestRateLimit set the portalRequestRateLimit.
   */
  @VsoMethod
  public void setPortalRequestRateLimit(Integer  portalRequestRateLimit) {
    this.portalRequestRateLimit = portalRequestRateLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Token used for uploading tech-support to portal.
   * Field introduced in 16.4.6,17.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return portalToken
   */
  @VsoMethod
  public String getPortalToken() {
    return portalToken;
  }

  /**
   * This is the setter method to the attribute.
   * Token used for uploading tech-support to portal.
   * Field introduced in 16.4.6,17.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param portalToken set the portalToken.
   */
  @VsoMethod
  public void setPortalToken(String  portalToken) {
    this.portalToken = portalToken;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Period for which postgres vacuum are executed.
   * Allowed values are 30-40320.
   * Special values are 0 - deactivated.
   * Field introduced in 22.1.3.
   * Unit is min.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20160.
   * @return postgresVacuumPeriod
   */
  @VsoMethod
  public Integer getPostgresVacuumPeriod() {
    return postgresVacuumPeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Period for which postgres vacuum are executed.
   * Allowed values are 30-40320.
   * Special values are 0 - deactivated.
   * Field introduced in 22.1.3.
   * Unit is min.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20160.
   * @param postgresVacuumPeriod set the postgresVacuumPeriod.
   */
  @VsoMethod
  public void setPostgresVacuumPeriod(Integer  postgresVacuumPeriod) {
    this.postgresVacuumPeriod = postgresVacuumPeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Period for process locked user accounts job.
   * Field introduced in 18.1.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return processLockedUseraccountsTimeoutPeriod
   */
  @VsoMethod
  public Integer getProcessLockedUseraccountsTimeoutPeriod() {
    return processLockedUseraccountsTimeoutPeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Period for process locked user accounts job.
   * Field introduced in 18.1.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param processLockedUseraccountsTimeoutPeriod set the processLockedUseraccountsTimeoutPeriod.
   */
  @VsoMethod
  public void setProcessLockedUseraccountsTimeoutPeriod(Integer  processLockedUseraccountsTimeoutPeriod) {
    this.processLockedUseraccountsTimeoutPeriod = processLockedUseraccountsTimeoutPeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Period for process pki profile job.
   * Field introduced in 18.1.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1440.
   * @return processPkiProfileTimeoutPeriod
   */
  @VsoMethod
  public Integer getProcessPkiProfileTimeoutPeriod() {
    return processPkiProfileTimeoutPeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Period for process pki profile job.
   * Field introduced in 18.1.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1440.
   * @param processPkiProfileTimeoutPeriod set the processPkiProfileTimeoutPeriod.
   */
  @VsoMethod
  public void setProcessPkiProfileTimeoutPeriod(Integer  processPkiProfileTimeoutPeriod) {
    this.processPkiProfileTimeoutPeriod = processPkiProfileTimeoutPeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 180.
   * @return queryHostFail
   */
  @VsoMethod
  public Integer getQueryHostFail() {
    return queryHostFail;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 180.
   * @param queryHostFail set the queryHostFail.
   */
  @VsoMethod
  public void setQueryHostFail(Integer  queryHostFail) {
    this.queryHostFail = queryHostFail;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Period for each cycle of log caching in resource manager.
   * At the end of each cycle, the in memory cached log history will be cleared.
   * Field introduced in 20.1.5.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 21600.
   * @return resmgrLogCachingPeriod
   */
  @VsoMethod
  public Integer getResmgrLogCachingPeriod() {
    return resmgrLogCachingPeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Period for each cycle of log caching in resource manager.
   * At the end of each cycle, the in memory cached log history will be cleared.
   * Field introduced in 20.1.5.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 21600.
   * @param resmgrLogCachingPeriod set the resmgrLogCachingPeriod.
   */
  @VsoMethod
  public void setResmgrLogCachingPeriod(Integer  resmgrLogCachingPeriod) {
    this.resmgrLogCachingPeriod = resmgrLogCachingPeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Restrict read access to cloud.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return restrictCloudReadAccess
   */
  @VsoMethod
  public Boolean getRestrictCloudReadAccess() {
    return restrictCloudReadAccess;
  }

  /**
   * This is the setter method to the attribute.
   * Restrict read access to cloud.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param restrictCloudReadAccess set the restrictCloudReadAccess.
   */
  @VsoMethod
  public void setRestrictCloudReadAccess(Boolean  restrictCloudReadAccess) {
    this.restrictCloudReadAccess = restrictCloudReadAccess;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Version of the safenet package installed on the controller.
   * Field introduced in 16.5.2,17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return safenetHsmVersion
   */
  @VsoMethod
  public String getSafenetHsmVersion() {
    return safenetHsmVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Version of the safenet package installed on the controller.
   * Field introduced in 16.5.2,17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param safenetHsmVersion set the safenetHsmVersion.
   */
  @VsoMethod
  public void setSafenetHsmVersion(String  safenetHsmVersion) {
    this.safenetHsmVersion = safenetHsmVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 900.
   * @return seCreateTimeout
   */
  @VsoMethod
  public Integer getSeCreateTimeout() {
    return seCreateTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 900.
   * @param seCreateTimeout set the seCreateTimeout.
   */
  @VsoMethod
  public void setSeCreateTimeout(Integer  seCreateTimeout) {
    this.seCreateTimeout = seCreateTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Interval between attempting failovers to an se.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return seFailoverAttemptInterval
   */
  @VsoMethod
  public Integer getSeFailoverAttemptInterval() {
    return seFailoverAttemptInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Interval between attempting failovers to an se.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param seFailoverAttemptInterval set the seFailoverAttemptInterval.
   */
  @VsoMethod
  public void setSeFailoverAttemptInterval(Integer  seFailoverAttemptInterval) {
    this.seFailoverAttemptInterval = seFailoverAttemptInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This setting decides whether se is to be deployed from the cloud marketplace or to be created by the controller.
   * The setting is applicable only when byol license is selected.
   * Enum options - MARKETPLACE, IMAGE_SE.
   * Field introduced in 18.1.4, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "IMAGE_SE".
   * @return seFromMarketplace
   */
  @VsoMethod
  public String getSeFromMarketplace() {
    return seFromMarketplace;
  }

  /**
   * This is the setter method to the attribute.
   * This setting decides whether se is to be deployed from the cloud marketplace or to be created by the controller.
   * The setting is applicable only when byol license is selected.
   * Enum options - MARKETPLACE, IMAGE_SE.
   * Field introduced in 18.1.4, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "IMAGE_SE".
   * @param seFromMarketplace set the seFromMarketplace.
   */
  @VsoMethod
  public void setSeFromMarketplace(String  seFromMarketplace) {
    this.seFromMarketplace = seFromMarketplace;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 172000.
   * @return seOfflineDel
   */
  @VsoMethod
  public Integer getSeOfflineDel() {
    return seOfflineDel;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 172000.
   * @param seOfflineDel set the seOfflineDel.
   */
  @VsoMethod
  public void setSeOfflineDel(Integer  seOfflineDel) {
    this.seOfflineDel = seOfflineDel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default retry period before attempting another service engine spawn in se group.
   * Field introduced in 20.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return seSpawnRetryInterval
   */
  @VsoMethod
  public Integer getSeSpawnRetryInterval() {
    return seSpawnRetryInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Default retry period before attempting another service engine spawn in se group.
   * Field introduced in 20.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param seSpawnRetryInterval set the seSpawnRetryInterval.
   */
  @VsoMethod
  public void setSeSpawnRetryInterval(Integer  seSpawnRetryInterval) {
    this.seSpawnRetryInterval = seSpawnRetryInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timeout for flows cleanup by serviceengine during upgrade.internal knob  to be exercised under the surveillance of vmware avi support team.
   * Field introduced in 22.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 90.
   * @return seUpgradeFlowCleanupTimeout
   */
  @VsoMethod
  public Integer getSeUpgradeFlowCleanupTimeout() {
    return seUpgradeFlowCleanupTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Timeout for flows cleanup by serviceengine during upgrade.internal knob  to be exercised under the surveillance of vmware avi support team.
   * Field introduced in 22.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 90.
   * @param seUpgradeFlowCleanupTimeout set the seUpgradeFlowCleanupTimeout.
   */
  @VsoMethod
  public void setSeUpgradeFlowCleanupTimeout(Integer  seUpgradeFlowCleanupTimeout) {
    this.seUpgradeFlowCleanupTimeout = seUpgradeFlowCleanupTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 120.
   * @return seVnicCooldown
   */
  @VsoMethod
  public Integer getSeVnicCooldown() {
    return seVnicCooldown;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 120.
   * @param seVnicCooldown set the seVnicCooldown.
   */
  @VsoMethod
  public void setSeVnicCooldown(Integer  seVnicCooldown) {
    this.seVnicCooldown = seVnicCooldown;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Duration to wait after last vnic addition before proceeding with vnic garbage collection.
   * Used for testing purposes.
   * Field introduced in 20.1.4.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return seVnicGcWaitTime
   */
  @VsoMethod
  public Integer getSeVnicGcWaitTime() {
    return seVnicGcWaitTime;
  }

  /**
   * This is the setter method to the attribute.
   * Duration to wait after last vnic addition before proceeding with vnic garbage collection.
   * Used for testing purposes.
   * Field introduced in 20.1.4.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param seVnicGcWaitTime set the seVnicGcWaitTime.
   */
  @VsoMethod
  public void setSeVnicGcWaitTime(Integer  seVnicGcWaitTime) {
    this.seVnicGcWaitTime = seVnicGcWaitTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Period for secure channel cleanup job.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return secureChannelCleanupTimeout
   */
  @VsoMethod
  public Integer getSecureChannelCleanupTimeout() {
    return secureChannelCleanupTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Period for secure channel cleanup job.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param secureChannelCleanupTimeout set the secureChannelCleanupTimeout.
   */
  @VsoMethod
  public void setSecureChannelCleanupTimeout(Integer  secureChannelCleanupTimeout) {
    this.secureChannelCleanupTimeout = secureChannelCleanupTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return secureChannelControllerTokenTimeout
   */
  @VsoMethod
  public Integer getSecureChannelControllerTokenTimeout() {
    return secureChannelControllerTokenTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param secureChannelControllerTokenTimeout set the secureChannelControllerTokenTimeout.
   */
  @VsoMethod
  public void setSecureChannelControllerTokenTimeout(Integer  secureChannelControllerTokenTimeout) {
    this.secureChannelControllerTokenTimeout = secureChannelControllerTokenTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return secureChannelSeTokenTimeout
   */
  @VsoMethod
  public Integer getSecureChannelSeTokenTimeout() {
    return secureChannelSeTokenTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param secureChannelSeTokenTimeout set the secureChannelSeTokenTimeout.
   */
  @VsoMethod
  public void setSecureChannelSeTokenTimeout(Integer  secureChannelSeTokenTimeout) {
    this.secureChannelSeTokenTimeout = secureChannelSeTokenTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This parameter defines the buffer size during se image downloads in a segroup.
   * It is used to pace the se downloads so that controller network/cpu bandwidth is a bounded operation.
   * Field introduced in 22.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 512.
   * @return seupgradeCopyBufferSize
   */
  @VsoMethod
  public Integer getSeupgradeCopyBufferSize() {
    return seupgradeCopyBufferSize;
  }

  /**
   * This is the setter method to the attribute.
   * This parameter defines the buffer size during se image downloads in a segroup.
   * It is used to pace the se downloads so that controller network/cpu bandwidth is a bounded operation.
   * Field introduced in 22.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 512.
   * @param seupgradeCopyBufferSize set the seupgradeCopyBufferSize.
   */
  @VsoMethod
  public void setSeupgradeCopyBufferSize(Integer  seupgradeCopyBufferSize) {
    this.seupgradeCopyBufferSize = seupgradeCopyBufferSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This parameter defines the number of simultaneous se image downloads in a segroup.
   * It is used to pace the se downloads so that controller network/cpu bandwidth is a bounded operation.
   * A value of 0 will disable the pacing scheme and all the se(s) in the segroup will attempt to download the image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return seupgradeCopyPoolSize
   */
  @VsoMethod
  public Integer getSeupgradeCopyPoolSize() {
    return seupgradeCopyPoolSize;
  }

  /**
   * This is the setter method to the attribute.
   * This parameter defines the number of simultaneous se image downloads in a segroup.
   * It is used to pace the se downloads so that controller network/cpu bandwidth is a bounded operation.
   * A value of 0 will disable the pacing scheme and all the se(s) in the segroup will attempt to download the image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param seupgradeCopyPoolSize set the seupgradeCopyPoolSize.
   */
  @VsoMethod
  public void setSeupgradeCopyPoolSize(Integer  seupgradeCopyPoolSize) {
    this.seupgradeCopyPoolSize = seupgradeCopyPoolSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The pool size is used to control the number of concurrent segroup upgrades.
   * This field value takes affect upon controller warm reboot.
   * Allowed values are 2-20.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @return seupgradeFabricPoolSize
   */
  @VsoMethod
  public Integer getSeupgradeFabricPoolSize() {
    return seupgradeFabricPoolSize;
  }

  /**
   * This is the setter method to the attribute.
   * The pool size is used to control the number of concurrent segroup upgrades.
   * This field value takes affect upon controller warm reboot.
   * Allowed values are 2-20.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @param seupgradeFabricPoolSize set the seupgradeFabricPoolSize.
   */
  @VsoMethod
  public void setSeupgradeFabricPoolSize(Integer  seupgradeFabricPoolSize) {
    this.seupgradeFabricPoolSize = seupgradeFabricPoolSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time to wait before marking segroup upgrade as stuck.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 360.
   * @return seupgradeSegroupMinDeadTimeout
   */
  @VsoMethod
  public Integer getSeupgradeSegroupMinDeadTimeout() {
    return seupgradeSegroupMinDeadTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Time to wait before marking segroup upgrade as stuck.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 360.
   * @param seupgradeSegroupMinDeadTimeout set the seupgradeSegroupMinDeadTimeout.
   */
  @VsoMethod
  public void setSeupgradeSegroupMinDeadTimeout(Integer  seupgradeSegroupMinDeadTimeout) {
    this.seupgradeSegroupMinDeadTimeout = seupgradeSegroupMinDeadTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ssl certificates in the admin tenant can be used in non-admin tenants.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return sharedSslCertificates
   */
  @VsoMethod
  public Boolean getSharedSslCertificates() {
    return sharedSslCertificates;
  }

  /**
   * This is the setter method to the attribute.
   * Ssl certificates in the admin tenant can be used in non-admin tenants.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param sharedSslCertificates set the sharedSslCertificates.
   */
  @VsoMethod
  public void setSharedSslCertificates(Boolean  sharedSslCertificates) {
    this.sharedSslCertificates = sharedSslCertificates;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time interval (in seconds) between retires for skopeo commands.
   * Field introduced in 30.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return skopeoRetryInterval
   */
  @VsoMethod
  public Integer getSkopeoRetryInterval() {
    return skopeoRetryInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Time interval (in seconds) between retires for skopeo commands.
   * Field introduced in 30.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param skopeoRetryInterval set the skopeoRetryInterval.
   */
  @VsoMethod
  public void setSkopeoRetryInterval(Integer  skopeoRetryInterval) {
    this.skopeoRetryInterval = skopeoRetryInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of times to try skopeo commands for remote image registries.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @return skopeoRetryLimit
   */
  @VsoMethod
  public Integer getSkopeoRetryLimit() {
    return skopeoRetryLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Number of times to try skopeo commands for remote image registries.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @param skopeoRetryLimit set the skopeoRetryLimit.
   */
  @VsoMethod
  public void setSkopeoRetryLimit(Integer  skopeoRetryLimit) {
    this.skopeoRetryLimit = skopeoRetryLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Soft limit on the minimum se memory that an se needs to have on se register.
   * Field introduced in 30.1.1.
   * Unit is mb.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1900.
   * @return softMinMemPerSeLimit
   */
  @VsoMethod
  public Integer getSoftMinMemPerSeLimit() {
    return softMinMemPerSeLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Soft limit on the minimum se memory that an se needs to have on se register.
   * Field introduced in 30.1.1.
   * Unit is mb.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1900.
   * @param softMinMemPerSeLimit set the softMinMemPerSeLimit.
   */
  @VsoMethod
  public void setSoftMinMemPerSeLimit(Integer  softMinMemPerSeLimit) {
    this.softMinMemPerSeLimit = softMinMemPerSeLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of days for ssl certificate expiry warning.
   * Unit is days.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslCertificateExpiryWarningDays
   */
  @VsoMethod
  public List<Integer> getSslCertificateExpiryWarningDays() {
    return sslCertificateExpiryWarningDays;
  }

  /**
   * This is the setter method. this will set the sslCertificateExpiryWarningDays
   * Number of days for ssl certificate expiry warning.
   * Unit is days.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslCertificateExpiryWarningDays
   */
  @VsoMethod
  public void setSslCertificateExpiryWarningDays(List<Integer>  sslCertificateExpiryWarningDays) {
    this.sslCertificateExpiryWarningDays = sslCertificateExpiryWarningDays;
  }

  /**
   * This is the setter method this will set the sslCertificateExpiryWarningDays
   * Number of days for ssl certificate expiry warning.
   * Unit is days.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslCertificateExpiryWarningDays
   */
  @VsoMethod
  public ControllerProperties addSslCertificateExpiryWarningDaysItem(Integer sslCertificateExpiryWarningDaysItem) {
    if (this.sslCertificateExpiryWarningDays == null) {
      this.sslCertificateExpiryWarningDays = new ArrayList<Integer>();
    }
    this.sslCertificateExpiryWarningDays.add(sslCertificateExpiryWarningDaysItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Time in minutes to wait between cleanup of systemreports.
   * Allowed values are 15-300.
   * Field introduced in 22.1.6, 30.2.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return systemReportCleanupInterval
   */
  @VsoMethod
  public Integer getSystemReportCleanupInterval() {
    return systemReportCleanupInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Time in minutes to wait between cleanup of systemreports.
   * Allowed values are 15-300.
   * Field introduced in 22.1.6, 30.2.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param systemReportCleanupInterval set the systemReportCleanupInterval.
   */
  @VsoMethod
  public void setSystemReportCleanupInterval(Integer  systemReportCleanupInterval) {
    this.systemReportCleanupInterval = systemReportCleanupInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of systemreports retained in the system.
   * Once the number of system reports exceed this threshold, the oldest systemreport will be removed and the latest one retained.
   * I.e.
   * The systemreport will be rotated and the reports don't exceed the threshold.
   * Allowed values are 5-50.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return systemReportLimit
   */
  @VsoMethod
  public Integer getSystemReportLimit() {
    return systemReportLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Number of systemreports retained in the system.
   * Once the number of system reports exceed this threshold, the oldest systemreport will be removed and the latest one retained.
   * I.e.
   * The systemreport will be rotated and the reports don't exceed the threshold.
   * Allowed values are 5-50.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param systemReportLimit set the systemReportLimit.
   */
  @VsoMethod
  public void setSystemReportLimit(Integer  systemReportLimit) {
    this.systemReportLimit = systemReportLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return unresponsiveSeReboot
   */
  @VsoMethod
  public Integer getUnresponsiveSeReboot() {
    return unresponsiveSeReboot;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param unresponsiveSeReboot set the unresponsiveSeReboot.
   */
  @VsoMethod
  public void setUnresponsiveSeReboot(Integer  unresponsiveSeReboot) {
    this.unresponsiveSeReboot = unresponsiveSeReboot;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of times to retry a dns entry update/delete operation.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @return updateDnsEntryRetryLimit
   */
  @VsoMethod
  public Integer getUpdateDnsEntryRetryLimit() {
    return updateDnsEntryRetryLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Number of times to retry a dns entry update/delete operation.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @param updateDnsEntryRetryLimit set the updateDnsEntryRetryLimit.
   */
  @VsoMethod
  public void setUpdateDnsEntryRetryLimit(Integer  updateDnsEntryRetryLimit) {
    this.updateDnsEntryRetryLimit = updateDnsEntryRetryLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timeout period for a dns entry update/delete operation.
   * Field introduced in 21.1.4.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 120.
   * @return updateDnsEntryTimeout
   */
  @VsoMethod
  public Integer getUpdateDnsEntryTimeout() {
    return updateDnsEntryTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Timeout period for a dns entry update/delete operation.
   * Field introduced in 21.1.4.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 120.
   * @param updateDnsEntryTimeout set the updateDnsEntryTimeout.
   */
  @VsoMethod
  public void setUpdateDnsEntryTimeout(Integer  updateDnsEntryTimeout) {
    this.updateDnsEntryTimeout = updateDnsEntryTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time to account for dns ttl during upgrade.
   * This is in addition to vs_scalein_timeout_for_upgrade in se_group.
   * Field introduced in 17.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 5), basic edition(allowed values- 5), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return upgradeDnsTtl
   */
  @VsoMethod
  public Integer getUpgradeDnsTtl() {
    return upgradeDnsTtl;
  }

  /**
   * This is the setter method to the attribute.
   * Time to account for dns ttl during upgrade.
   * This is in addition to vs_scalein_timeout_for_upgrade in se_group.
   * Field introduced in 17.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 5), basic edition(allowed values- 5), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param upgradeDnsTtl set the upgradeDnsTtl.
   */
  @VsoMethod
  public void setUpgradeDnsTtl(Integer  upgradeDnsTtl) {
    this.upgradeDnsTtl = upgradeDnsTtl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Amount of time controller waits for a large-sized se (>=128gb memory) to reconnect after it is rebooted during upgrade.
   * Field introduced in 18.2.10, 20.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1200.
   * @return upgradeFatSeLeaseTime
   */
  @VsoMethod
  public Integer getUpgradeFatSeLeaseTime() {
    return upgradeFatSeLeaseTime;
  }

  /**
   * This is the setter method to the attribute.
   * Amount of time controller waits for a large-sized se (>=128gb memory) to reconnect after it is rebooted during upgrade.
   * Field introduced in 18.2.10, 20.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1200.
   * @param upgradeFatSeLeaseTime set the upgradeFatSeLeaseTime.
   */
  @VsoMethod
  public void setUpgradeFatSeLeaseTime(Integer  upgradeFatSeLeaseTime) {
    this.upgradeFatSeLeaseTime = upgradeFatSeLeaseTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Amount of time controller waits for a regular-sized se (<128gb memory) to reconnect after it is rebooted during upgrade.
   * Starting 18.2.10/20.1.1, the default time has increased from 360 seconds to 600 seconds.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 600.
   * @return upgradeLeaseTime
   */
  @VsoMethod
  public Integer getUpgradeLeaseTime() {
    return upgradeLeaseTime;
  }

  /**
   * This is the setter method to the attribute.
   * Amount of time controller waits for a regular-sized se (<128gb memory) to reconnect after it is rebooted during upgrade.
   * Starting 18.2.10/20.1.1, the default time has increased from 360 seconds to 600 seconds.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 600.
   * @param upgradeLeaseTime set the upgradeLeaseTime.
   */
  @VsoMethod
  public void setUpgradeLeaseTime(Integer  upgradeLeaseTime) {
    this.upgradeLeaseTime = upgradeLeaseTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This parameter defines the upper-bound value of the vs scale-in or vs scale-out operation executed in the sescalein and sescale context.
   * User can tweak this parameter to a higher value if the segroup gets suspended due to sescalein or sescaleout timeout failure typically associated
   * with high number of vs(es) scaled out.
   * Field introduced in 18.2.10, 20.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @return upgradeSePerVsScaleOpsTxnTime
   */
  @VsoMethod
  public Integer getUpgradeSePerVsScaleOpsTxnTime() {
    return upgradeSePerVsScaleOpsTxnTime;
  }

  /**
   * This is the setter method to the attribute.
   * This parameter defines the upper-bound value of the vs scale-in or vs scale-out operation executed in the sescalein and sescale context.
   * User can tweak this parameter to a higher value if the segroup gets suspended due to sescalein or sescaleout timeout failure typically associated
   * with high number of vs(es) scaled out.
   * Field introduced in 18.2.10, 20.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @param upgradeSePerVsScaleOpsTxnTime set the upgradeSePerVsScaleOpsTxnTime.
   */
  @VsoMethod
  public void setUpgradeSePerVsScaleOpsTxnTime(Integer  upgradeSePerVsScaleOpsTxnTime) {
    this.upgradeSePerVsScaleOpsTxnTime = upgradeSePerVsScaleOpsTxnTime;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configuration for user-agent cache used in bot management.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return userAgentCacheConfig
   */
  @VsoMethod
  public UserAgentCacheConfig getUserAgentCacheConfig() {
    return userAgentCacheConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Configuration for user-agent cache used in bot management.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param userAgentCacheConfig set the userAgentCacheConfig.
   */
  @VsoMethod
  public void setUserAgentCacheConfig(UserAgentCacheConfig userAgentCacheConfig) {
    this.userAgentCacheConfig = userAgentCacheConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 180.
   * @return vnicOpFailTime
   */
  @VsoMethod
  public Integer getVnicOpFailTime() {
    return vnicOpFailTime;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 180.
   * @param vnicOpFailTime set the vnicOpFailTime.
   */
  @VsoMethod
  public void setVnicOpFailTime(Integer  vnicOpFailTime) {
    this.vnicOpFailTime = vnicOpFailTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return vsAwaitingSeTimeout
   */
  @VsoMethod
  public Integer getVsAwaitingSeTimeout() {
    return vsAwaitingSeTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param vsAwaitingSeTimeout set the vsAwaitingSeTimeout.
   */
  @VsoMethod
  public void setVsAwaitingSeTimeout(Integer  vsAwaitingSeTimeout) {
    this.vsAwaitingSeTimeout = vsAwaitingSeTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Period for rotate vs keys job.
   * Allowed values are 1-1051200.
   * Special values are 0 - disabled.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 360.
   * @return vsKeyRotatePeriod
   */
  @VsoMethod
  public Integer getVsKeyRotatePeriod() {
    return vsKeyRotatePeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Period for rotate vs keys job.
   * Allowed values are 1-1051200.
   * Special values are 0 - disabled.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 360.
   * @param vsKeyRotatePeriod set the vsKeyRotatePeriod.
   */
  @VsoMethod
  public void setVsKeyRotatePeriod(Integer  vsKeyRotatePeriod) {
    this.vsKeyRotatePeriod = vsKeyRotatePeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Interval for checking scaleout_ready status while controller is waiting for scaleoutready rpc from the service engine.
   * Field introduced in 18.2.2.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return vsScaleoutReadyCheckInterval
   */
  @VsoMethod
  public Integer getVsScaleoutReadyCheckInterval() {
    return vsScaleoutReadyCheckInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Interval for checking scaleout_ready status while controller is waiting for scaleoutready rpc from the service engine.
   * Field introduced in 18.2.2.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param vsScaleoutReadyCheckInterval set the vsScaleoutReadyCheckInterval.
   */
  @VsoMethod
  public void setVsScaleoutReadyCheckInterval(Integer  vsScaleoutReadyCheckInterval) {
    this.vsScaleoutReadyCheckInterval = vsScaleoutReadyCheckInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time to wait before marking attach ip operation on an se as failed.
   * Field introduced in 17.2.2.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 600.
   * @return vsSeAttachIpFail
   */
  @VsoMethod
  public Integer getVsSeAttachIpFail() {
    return vsSeAttachIpFail;
  }

  /**
   * This is the setter method to the attribute.
   * Time to wait before marking attach ip operation on an se as failed.
   * Field introduced in 17.2.2.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 600.
   * @param vsSeAttachIpFail set the vsSeAttachIpFail.
   */
  @VsoMethod
  public void setVsSeAttachIpFail(Integer  vsSeAttachIpFail) {
    this.vsSeAttachIpFail = vsSeAttachIpFail;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 480.
   * @return vsSeBootupFail
   */
  @VsoMethod
  public Integer getVsSeBootupFail() {
    return vsSeBootupFail;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 480.
   * @param vsSeBootupFail set the vsSeBootupFail.
   */
  @VsoMethod
  public void setVsSeBootupFail(Integer  vsSeBootupFail) {
    this.vsSeBootupFail = vsSeBootupFail;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Wait for longer for patch ses to boot up.
   * Field introduced in 30.2.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 600.
   * @return vsSeBootupFailPatch
   */
  @VsoMethod
  public Integer getVsSeBootupFailPatch() {
    return vsSeBootupFailPatch;
  }

  /**
   * This is the setter method to the attribute.
   * Wait for longer for patch ses to boot up.
   * Field introduced in 30.2.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 600.
   * @param vsSeBootupFailPatch set the vsSeBootupFailPatch.
   */
  @VsoMethod
  public void setVsSeBootupFailPatch(Integer  vsSeBootupFailPatch) {
    this.vsSeBootupFailPatch = vsSeBootupFailPatch;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1500.
   * @return vsSeCreateFail
   */
  @VsoMethod
  public Integer getVsSeCreateFail() {
    return vsSeCreateFail;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1500.
   * @param vsSeCreateFail set the vsSeCreateFail.
   */
  @VsoMethod
  public void setVsSeCreateFail(Integer  vsSeCreateFail) {
    this.vsSeCreateFail = vsSeCreateFail;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return vsSePingFail
   */
  @VsoMethod
  public Integer getVsSePingFail() {
    return vsSePingFail;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param vsSePingFail set the vsSePingFail.
   */
  @VsoMethod
  public void setVsSePingFail(Integer  vsSePingFail) {
    this.vsSePingFail = vsSePingFail;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return vsSeVnicFail
   */
  @VsoMethod
  public Integer getVsSeVnicFail() {
    return vsSeVnicFail;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param vsSeVnicFail set the vsSeVnicFail.
   */
  @VsoMethod
  public void setVsSeVnicFail(Integer  vsSeVnicFail) {
    this.vsSeVnicFail = vsSeVnicFail;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 120.
   * @return vsSeVnicIpFail
   */
  @VsoMethod
  public Integer getVsSeVnicIpFail() {
    return vsSeVnicIpFail;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 120.
   * @param vsSeVnicIpFail set the vsSeVnicIpFail.
   */
  @VsoMethod
  public void setVsSeVnicIpFail(Integer  vsSeVnicIpFail) {
    this.vsSeVnicIpFail = vsSeVnicIpFail;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vsphere ha monitor detection timeout.
   * If vsphere_ha_enabled is true and the controller is not able to reach the se, placement will wait for this duration for vsphere_ha_inprogress to
   * be marked true before taking corrective action.
   * Field introduced in 20.1.7, 21.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 120.
   * @return vsphereHaDetectionTimeout
   */
  @VsoMethod
  public Integer getVsphereHaDetectionTimeout() {
    return vsphereHaDetectionTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Vsphere ha monitor detection timeout.
   * If vsphere_ha_enabled is true and the controller is not able to reach the se, placement will wait for this duration for vsphere_ha_inprogress to
   * be marked true before taking corrective action.
   * Field introduced in 20.1.7, 21.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 120.
   * @param vsphereHaDetectionTimeout set the vsphereHaDetectionTimeout.
   */
  @VsoMethod
  public void setVsphereHaDetectionTimeout(Integer  vsphereHaDetectionTimeout) {
    this.vsphereHaDetectionTimeout = vsphereHaDetectionTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vsphere ha monitor recovery timeout.
   * Once vsphere_ha_inprogress is set to true (meaning host failure detected and vsphere ha will recover the service engine), placement will wait for
   * at least this duration for the se to reconnect to the controller before taking corrective action.
   * Field introduced in 20.1.7, 21.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 480.
   * @return vsphereHaRecoveryTimeout
   */
  @VsoMethod
  public Integer getVsphereHaRecoveryTimeout() {
    return vsphereHaRecoveryTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Vsphere ha monitor recovery timeout.
   * Once vsphere_ha_inprogress is set to true (meaning host failure detected and vsphere ha will recover the service engine), placement will wait for
   * at least this duration for the se to reconnect to the controller before taking corrective action.
   * Field introduced in 20.1.7, 21.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 480.
   * @param vsphereHaRecoveryTimeout set the vsphereHaRecoveryTimeout.
   */
  @VsoMethod
  public void setVsphereHaRecoveryTimeout(Integer  vsphereHaRecoveryTimeout) {
    this.vsphereHaRecoveryTimeout = vsphereHaRecoveryTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vsphere ha monitor timer interval for sending cc_check_se_status to cloud connector.
   * Field introduced in 20.1.7, 21.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @return vsphereHaTimerInterval
   */
  @VsoMethod
  public Integer getVsphereHaTimerInterval() {
    return vsphereHaTimerInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Vsphere ha monitor timer interval for sending cc_check_se_status to cloud connector.
   * Field introduced in 20.1.7, 21.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @param vsphereHaTimerInterval set the vsphereHaTimerInterval.
   */
  @VsoMethod
  public void setVsphereHaTimerInterval(Integer  vsphereHaTimerInterval) {
    this.vsphereHaTimerInterval = vsphereHaTimerInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 480.
   * @return warmstartSeReconnectWaitTime
   */
  @VsoMethod
  public Integer getWarmstartSeReconnectWaitTime() {
    return warmstartSeReconnectWaitTime;
  }

  /**
   * This is the setter method to the attribute.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 480.
   * @param warmstartSeReconnectWaitTime set the warmstartSeReconnectWaitTime.
   */
  @VsoMethod
  public void setWarmstartSeReconnectWaitTime(Integer  warmstartSeReconnectWaitTime) {
    this.warmstartSeReconnectWaitTime = warmstartSeReconnectWaitTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timeout for warmstart vs resync.
   * Field introduced in 18.1.4, 18.2.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return warmstartVsResyncWaitTime
   */
  @VsoMethod
  public Integer getWarmstartVsResyncWaitTime() {
    return warmstartVsResyncWaitTime;
  }

  /**
   * This is the setter method to the attribute.
   * Timeout for warmstart vs resync.
   * Field introduced in 18.1.4, 18.2.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param warmstartVsResyncWaitTime set the warmstartVsResyncWaitTime.
   */
  @VsoMethod
  public void setWarmstartVsResyncWaitTime(Integer  warmstartVsResyncWaitTime) {
    this.warmstartVsResyncWaitTime = warmstartVsResyncWaitTime;
  }


  public String getObjectID() {
    return "ControllerProperties" + "(" + uuid + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ControllerProperties objControllerProperties = (ControllerProperties) o;
  return   Objects.equals(this.uuid, objControllerProperties.uuid)&&
  Objects.equals(this.dummy, objControllerProperties.dummy)&&
  Objects.equals(this.unresponsiveSeReboot, objControllerProperties.unresponsiveSeReboot)&&
  Objects.equals(this.crashedSeReboot, objControllerProperties.crashedSeReboot)&&
  Objects.equals(this.seOfflineDel, objControllerProperties.seOfflineDel)&&
  Objects.equals(this.vsSeCreateFail, objControllerProperties.vsSeCreateFail)&&
  Objects.equals(this.vsSeVnicFail, objControllerProperties.vsSeVnicFail)&&
  Objects.equals(this.vsSeBootupFail, objControllerProperties.vsSeBootupFail)&&
  Objects.equals(this.seVnicCooldown, objControllerProperties.seVnicCooldown)&&
  Objects.equals(this.vsSeVnicIpFail, objControllerProperties.vsSeVnicIpFail)&&
  Objects.equals(this.fatalErrorLeaseTime, objControllerProperties.fatalErrorLeaseTime)&&
  Objects.equals(this.upgradeLeaseTime, objControllerProperties.upgradeLeaseTime)&&
  Objects.equals(this.queryHostFail, objControllerProperties.queryHostFail)&&
  Objects.equals(this.vnicOpFailTime, objControllerProperties.vnicOpFailTime)&&
  Objects.equals(this.dnsRefreshPeriod, objControllerProperties.dnsRefreshPeriod)&&
  Objects.equals(this.seCreateTimeout, objControllerProperties.seCreateTimeout)&&
  Objects.equals(this.maxDeadSeInGrp, objControllerProperties.maxDeadSeInGrp)&&
  Objects.equals(this.deadSeDetectionTimer, objControllerProperties.deadSeDetectionTimer)&&
  Objects.equals(this.apiIdleTimeout, objControllerProperties.apiIdleTimeout)&&
  Objects.equals(this.allowUnauthenticatedNodes, objControllerProperties.allowUnauthenticatedNodes)&&
  Objects.equals(this.clusterIpGratuitousArpPeriod, objControllerProperties.clusterIpGratuitousArpPeriod)&&
  Objects.equals(this.vsKeyRotatePeriod, objControllerProperties.vsKeyRotatePeriod)&&
  Objects.equals(this.secureChannelControllerTokenTimeout, objControllerProperties.secureChannelControllerTokenTimeout)&&
  Objects.equals(this.secureChannelSeTokenTimeout, objControllerProperties.secureChannelSeTokenTimeout)&&
  Objects.equals(this.maxSeqVnicFailures, objControllerProperties.maxSeqVnicFailures)&&
  Objects.equals(this.vsAwaitingSeTimeout, objControllerProperties.vsAwaitingSeTimeout)&&
  Objects.equals(this.secureChannelCleanupTimeout, objControllerProperties.secureChannelCleanupTimeout)&&
  Objects.equals(this.attachIpRetryInterval, objControllerProperties.attachIpRetryInterval)&&
  Objects.equals(this.attachIpRetryLimit, objControllerProperties.attachIpRetryLimit)&&
  Objects.equals(this.persistenceKeyRotatePeriod, objControllerProperties.persistenceKeyRotatePeriod)&&
  Objects.equals(this.allowUnauthenticatedApis, objControllerProperties.allowUnauthenticatedApis)&&
  Objects.equals(this.warmstartSeReconnectWaitTime, objControllerProperties.warmstartSeReconnectWaitTime)&&
  Objects.equals(this.vsSePingFail, objControllerProperties.vsSePingFail)&&
  Objects.equals(this.seFailoverAttemptInterval, objControllerProperties.seFailoverAttemptInterval)&&
  Objects.equals(this.maxPcapPerTenant, objControllerProperties.maxPcapPerTenant)&&
  Objects.equals(this.sslCertificateExpiryWarningDays, objControllerProperties.sslCertificateExpiryWarningDays)&&
  Objects.equals(this.seupgradeFabricPoolSize, objControllerProperties.seupgradeFabricPoolSize)&&
  Objects.equals(this.seupgradeSegroupMinDeadTimeout, objControllerProperties.seupgradeSegroupMinDeadTimeout)&&
  Objects.equals(this.allowIpForwarding, objControllerProperties.allowIpForwarding)&&
  Objects.equals(this.appviewxCompatMode, objControllerProperties.appviewxCompatMode)&&
  Objects.equals(this.upgradeDnsTtl, objControllerProperties.upgradeDnsTtl)&&
  Objects.equals(this.portalToken, objControllerProperties.portalToken)&&
  Objects.equals(this.bmUseAnsible, objControllerProperties.bmUseAnsible)&&
  Objects.equals(this.vsSeAttachIpFail, objControllerProperties.vsSeAttachIpFail)&&
  Objects.equals(this.maxSeqAttachIpFailures, objControllerProperties.maxSeqAttachIpFailures)&&
  Objects.equals(this.safenetHsmVersion, objControllerProperties.safenetHsmVersion)&&
  Objects.equals(this.cleanupExpiredAuthtokenTimeoutPeriod, objControllerProperties.cleanupExpiredAuthtokenTimeoutPeriod)&&
  Objects.equals(this.cleanupSessionsTimeoutPeriod, objControllerProperties.cleanupSessionsTimeoutPeriod)&&
  Objects.equals(this.consistencyCheckTimeoutPeriod, objControllerProperties.consistencyCheckTimeoutPeriod)&&
  Objects.equals(this.processLockedUseraccountsTimeoutPeriod, objControllerProperties.processLockedUseraccountsTimeoutPeriod)&&
  Objects.equals(this.processPkiProfileTimeoutPeriod, objControllerProperties.processPkiProfileTimeoutPeriod)&&
  Objects.equals(this.enableMemoryBalancer, objControllerProperties.enableMemoryBalancer)&&
  Objects.equals(this.warmstartVsResyncWaitTime, objControllerProperties.warmstartVsResyncWaitTime)&&
  Objects.equals(this.apiPerfLoggingThreshold, objControllerProperties.apiPerfLoggingThreshold)&&
  Objects.equals(this.seFromMarketplace, objControllerProperties.seFromMarketplace)&&
  Objects.equals(this.cloudReconcile, objControllerProperties.cloudReconcile)&&
  Objects.equals(this.enableApiSharding, objControllerProperties.enableApiSharding)&&
  Objects.equals(this.vsScaleoutReadyCheckInterval, objControllerProperties.vsScaleoutReadyCheckInterval)&&
  Objects.equals(this.sharedSslCertificates, objControllerProperties.sharedSslCertificates)&&
  Objects.equals(this.defaultMinimumApiTimeout, objControllerProperties.defaultMinimumApiTimeout)&&
  Objects.equals(this.seupgradeCopyPoolSize, objControllerProperties.seupgradeCopyPoolSize)&&
  Objects.equals(this.permissionScopedSharedAdminNetworks, objControllerProperties.permissionScopedSharedAdminNetworks)&&
  Objects.equals(this.allowAdminNetworkUpdates, objControllerProperties.allowAdminNetworkUpdates)&&
  Objects.equals(this.seSpawnRetryInterval, objControllerProperties.seSpawnRetryInterval)&&
  Objects.equals(this.maxSeSpawnIntervalDelay, objControllerProperties.maxSeSpawnIntervalDelay)&&
  Objects.equals(this.portalRequestRateLimit, objControllerProperties.portalRequestRateLimit)&&
  Objects.equals(this.portalRequestBurstLimit, objControllerProperties.portalRequestBurstLimit)&&
  Objects.equals(this.federatedDatastoreCleanupDuration, objControllerProperties.federatedDatastoreCleanupDuration)&&
  Objects.equals(this.editSystemLimits, objControllerProperties.editSystemLimits)&&
  Objects.equals(this.fileObjectCleanupPeriod, objControllerProperties.fileObjectCleanupPeriod)&&
  Objects.equals(this.upgradeFatSeLeaseTime, objControllerProperties.upgradeFatSeLeaseTime)&&
  Objects.equals(this.upgradeSePerVsScaleOpsTxnTime, objControllerProperties.upgradeSePerVsScaleOpsTxnTime)&&
  Objects.equals(this.maxThreadsCcVipBgWorker, objControllerProperties.maxThreadsCcVipBgWorker)&&
  Objects.equals(this.asyncPatchMergePeriod, objControllerProperties.asyncPatchMergePeriod)&&
  Objects.equals(this.asyncPatchRequestCleanupDuration, objControllerProperties.asyncPatchRequestCleanupDuration)&&
  Objects.equals(this.controllerResourceInfoCollectionPeriod, objControllerProperties.controllerResourceInfoCollectionPeriod)&&
  Objects.equals(this.seVnicGcWaitTime, objControllerProperties.seVnicGcWaitTime)&&
  Objects.equals(this.resmgrLogCachingPeriod, objControllerProperties.resmgrLogCachingPeriod)&&
  Objects.equals(this.userAgentCacheConfig, objControllerProperties.userAgentCacheConfig)&&
  Objects.equals(this.delOfflineSeAfterRebootDelay, objControllerProperties.delOfflineSeAfterRebootDelay)&&
  Objects.equals(this.enableResmgrLogCachePrint, objControllerProperties.enableResmgrLogCachePrint)&&
  Objects.equals(this.enablePerProcessStop, objControllerProperties.enablePerProcessStop)&&
  Objects.equals(this.checkVsvipFqdnSyntax, objControllerProperties.checkVsvipFqdnSyntax)&&
  Objects.equals(this.vsphereHaTimerInterval, objControllerProperties.vsphereHaTimerInterval)&&
  Objects.equals(this.vsphereHaDetectionTimeout, objControllerProperties.vsphereHaDetectionTimeout)&&
  Objects.equals(this.vsphereHaRecoveryTimeout, objControllerProperties.vsphereHaRecoveryTimeout)&&
  Objects.equals(this.detachIpRetryInterval, objControllerProperties.detachIpRetryInterval)&&
  Objects.equals(this.detachIpRetryLimit, objControllerProperties.detachIpRetryLimit)&&
  Objects.equals(this.detachIpTimeout, objControllerProperties.detachIpTimeout)&&
  Objects.equals(this.restrictCloudReadAccess, objControllerProperties.restrictCloudReadAccess)&&
  Objects.equals(this.updateDnsEntryTimeout, objControllerProperties.updateDnsEntryTimeout)&&
  Objects.equals(this.updateDnsEntryRetryLimit, objControllerProperties.updateDnsEntryRetryLimit)&&
  Objects.equals(this.seUpgradeFlowCleanupTimeout, objControllerProperties.seUpgradeFlowCleanupTimeout)&&
  Objects.equals(this.falsePositiveLearningConfig, objControllerProperties.falsePositiveLearningConfig)&&
  Objects.equals(this.gslbPurgeBatchSize, objControllerProperties.gslbPurgeBatchSize)&&
  Objects.equals(this.gslbPurgeSleepTimeMs, objControllerProperties.gslbPurgeSleepTimeMs)&&
  Objects.equals(this.postgresVacuumPeriod, objControllerProperties.postgresVacuumPeriod)&&
  Objects.equals(this.ignoreVrfInNetworksubnetlist, objControllerProperties.ignoreVrfInNetworksubnetlist)&&
  Objects.equals(this.seupgradeCopyBufferSize, objControllerProperties.seupgradeCopyBufferSize)&&
  Objects.equals(this.vsSeBootupFailPatch, objControllerProperties.vsSeBootupFailPatch)&&
  Objects.equals(this.skopeoRetryLimit, objControllerProperties.skopeoRetryLimit)&&
  Objects.equals(this.skopeoRetryInterval, objControllerProperties.skopeoRetryInterval)&&
  Objects.equals(this.softMinMemPerSeLimit, objControllerProperties.softMinMemPerSeLimit)&&
  Objects.equals(this.cloudReconcileInterval, objControllerProperties.cloudReconcileInterval)&&
  Objects.equals(this.cloudDiscoveryInterval, objControllerProperties.cloudDiscoveryInterval)&&
  Objects.equals(this.systemReportLimit, objControllerProperties.systemReportLimit)&&
  Objects.equals(this.systemReportCleanupInterval, objControllerProperties.systemReportCleanupInterval)&&
  Objects.equals(this.fileobjectMaxFileVersions, objControllerProperties.fileobjectMaxFileVersions);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerProperties {\n");
      sb.append("    allowAdminNetworkUpdates: ").append(toIndentedString(allowAdminNetworkUpdates)).append("\n");
        sb.append("    allowIpForwarding: ").append(toIndentedString(allowIpForwarding)).append("\n");
        sb.append("    allowUnauthenticatedApis: ").append(toIndentedString(allowUnauthenticatedApis)).append("\n");
        sb.append("    allowUnauthenticatedNodes: ").append(toIndentedString(allowUnauthenticatedNodes)).append("\n");
        sb.append("    apiIdleTimeout: ").append(toIndentedString(apiIdleTimeout)).append("\n");
        sb.append("    apiPerfLoggingThreshold: ").append(toIndentedString(apiPerfLoggingThreshold)).append("\n");
        sb.append("    appviewxCompatMode: ").append(toIndentedString(appviewxCompatMode)).append("\n");
        sb.append("    asyncPatchMergePeriod: ").append(toIndentedString(asyncPatchMergePeriod)).append("\n");
        sb.append("    asyncPatchRequestCleanupDuration: ").append(toIndentedString(asyncPatchRequestCleanupDuration)).append("\n");
        sb.append("    attachIpRetryInterval: ").append(toIndentedString(attachIpRetryInterval)).append("\n");
        sb.append("    attachIpRetryLimit: ").append(toIndentedString(attachIpRetryLimit)).append("\n");
        sb.append("    bmUseAnsible: ").append(toIndentedString(bmUseAnsible)).append("\n");
        sb.append("    checkVsvipFqdnSyntax: ").append(toIndentedString(checkVsvipFqdnSyntax)).append("\n");
        sb.append("    cleanupExpiredAuthtokenTimeoutPeriod: ").append(toIndentedString(cleanupExpiredAuthtokenTimeoutPeriod)).append("\n");
        sb.append("    cleanupSessionsTimeoutPeriod: ").append(toIndentedString(cleanupSessionsTimeoutPeriod)).append("\n");
        sb.append("    cloudDiscoveryInterval: ").append(toIndentedString(cloudDiscoveryInterval)).append("\n");
        sb.append("    cloudReconcile: ").append(toIndentedString(cloudReconcile)).append("\n");
        sb.append("    cloudReconcileInterval: ").append(toIndentedString(cloudReconcileInterval)).append("\n");
        sb.append("    clusterIpGratuitousArpPeriod: ").append(toIndentedString(clusterIpGratuitousArpPeriod)).append("\n");
        sb.append("    consistencyCheckTimeoutPeriod: ").append(toIndentedString(consistencyCheckTimeoutPeriod)).append("\n");
        sb.append("    controllerResourceInfoCollectionPeriod: ").append(toIndentedString(controllerResourceInfoCollectionPeriod)).append("\n");
        sb.append("    crashedSeReboot: ").append(toIndentedString(crashedSeReboot)).append("\n");
        sb.append("    deadSeDetectionTimer: ").append(toIndentedString(deadSeDetectionTimer)).append("\n");
        sb.append("    defaultMinimumApiTimeout: ").append(toIndentedString(defaultMinimumApiTimeout)).append("\n");
        sb.append("    delOfflineSeAfterRebootDelay: ").append(toIndentedString(delOfflineSeAfterRebootDelay)).append("\n");
        sb.append("    detachIpRetryInterval: ").append(toIndentedString(detachIpRetryInterval)).append("\n");
        sb.append("    detachIpRetryLimit: ").append(toIndentedString(detachIpRetryLimit)).append("\n");
        sb.append("    detachIpTimeout: ").append(toIndentedString(detachIpTimeout)).append("\n");
        sb.append("    dnsRefreshPeriod: ").append(toIndentedString(dnsRefreshPeriod)).append("\n");
        sb.append("    dummy: ").append(toIndentedString(dummy)).append("\n");
        sb.append("    editSystemLimits: ").append(toIndentedString(editSystemLimits)).append("\n");
        sb.append("    enableApiSharding: ").append(toIndentedString(enableApiSharding)).append("\n");
        sb.append("    enableMemoryBalancer: ").append(toIndentedString(enableMemoryBalancer)).append("\n");
        sb.append("    enablePerProcessStop: ").append(toIndentedString(enablePerProcessStop)).append("\n");
        sb.append("    enableResmgrLogCachePrint: ").append(toIndentedString(enableResmgrLogCachePrint)).append("\n");
        sb.append("    falsePositiveLearningConfig: ").append(toIndentedString(falsePositiveLearningConfig)).append("\n");
        sb.append("    fatalErrorLeaseTime: ").append(toIndentedString(fatalErrorLeaseTime)).append("\n");
        sb.append("    federatedDatastoreCleanupDuration: ").append(toIndentedString(federatedDatastoreCleanupDuration)).append("\n");
        sb.append("    fileObjectCleanupPeriod: ").append(toIndentedString(fileObjectCleanupPeriod)).append("\n");
        sb.append("    fileobjectMaxFileVersions: ").append(toIndentedString(fileobjectMaxFileVersions)).append("\n");
        sb.append("    gslbPurgeBatchSize: ").append(toIndentedString(gslbPurgeBatchSize)).append("\n");
        sb.append("    gslbPurgeSleepTimeMs: ").append(toIndentedString(gslbPurgeSleepTimeMs)).append("\n");
        sb.append("    ignoreVrfInNetworksubnetlist: ").append(toIndentedString(ignoreVrfInNetworksubnetlist)).append("\n");
        sb.append("    maxDeadSeInGrp: ").append(toIndentedString(maxDeadSeInGrp)).append("\n");
        sb.append("    maxPcapPerTenant: ").append(toIndentedString(maxPcapPerTenant)).append("\n");
        sb.append("    maxSeSpawnIntervalDelay: ").append(toIndentedString(maxSeSpawnIntervalDelay)).append("\n");
        sb.append("    maxSeqAttachIpFailures: ").append(toIndentedString(maxSeqAttachIpFailures)).append("\n");
        sb.append("    maxSeqVnicFailures: ").append(toIndentedString(maxSeqVnicFailures)).append("\n");
        sb.append("    maxThreadsCcVipBgWorker: ").append(toIndentedString(maxThreadsCcVipBgWorker)).append("\n");
        sb.append("    permissionScopedSharedAdminNetworks: ").append(toIndentedString(permissionScopedSharedAdminNetworks)).append("\n");
        sb.append("    persistenceKeyRotatePeriod: ").append(toIndentedString(persistenceKeyRotatePeriod)).append("\n");
        sb.append("    portalRequestBurstLimit: ").append(toIndentedString(portalRequestBurstLimit)).append("\n");
        sb.append("    portalRequestRateLimit: ").append(toIndentedString(portalRequestRateLimit)).append("\n");
        sb.append("    portalToken: ").append(toIndentedString(portalToken)).append("\n");
        sb.append("    postgresVacuumPeriod: ").append(toIndentedString(postgresVacuumPeriod)).append("\n");
        sb.append("    processLockedUseraccountsTimeoutPeriod: ").append(toIndentedString(processLockedUseraccountsTimeoutPeriod)).append("\n");
        sb.append("    processPkiProfileTimeoutPeriod: ").append(toIndentedString(processPkiProfileTimeoutPeriod)).append("\n");
        sb.append("    queryHostFail: ").append(toIndentedString(queryHostFail)).append("\n");
        sb.append("    resmgrLogCachingPeriod: ").append(toIndentedString(resmgrLogCachingPeriod)).append("\n");
        sb.append("    restrictCloudReadAccess: ").append(toIndentedString(restrictCloudReadAccess)).append("\n");
        sb.append("    safenetHsmVersion: ").append(toIndentedString(safenetHsmVersion)).append("\n");
        sb.append("    seCreateTimeout: ").append(toIndentedString(seCreateTimeout)).append("\n");
        sb.append("    seFailoverAttemptInterval: ").append(toIndentedString(seFailoverAttemptInterval)).append("\n");
        sb.append("    seFromMarketplace: ").append(toIndentedString(seFromMarketplace)).append("\n");
        sb.append("    seOfflineDel: ").append(toIndentedString(seOfflineDel)).append("\n");
        sb.append("    seSpawnRetryInterval: ").append(toIndentedString(seSpawnRetryInterval)).append("\n");
        sb.append("    seUpgradeFlowCleanupTimeout: ").append(toIndentedString(seUpgradeFlowCleanupTimeout)).append("\n");
        sb.append("    seVnicCooldown: ").append(toIndentedString(seVnicCooldown)).append("\n");
        sb.append("    seVnicGcWaitTime: ").append(toIndentedString(seVnicGcWaitTime)).append("\n");
        sb.append("    secureChannelCleanupTimeout: ").append(toIndentedString(secureChannelCleanupTimeout)).append("\n");
        sb.append("    secureChannelControllerTokenTimeout: ").append(toIndentedString(secureChannelControllerTokenTimeout)).append("\n");
        sb.append("    secureChannelSeTokenTimeout: ").append(toIndentedString(secureChannelSeTokenTimeout)).append("\n");
        sb.append("    seupgradeCopyBufferSize: ").append(toIndentedString(seupgradeCopyBufferSize)).append("\n");
        sb.append("    seupgradeCopyPoolSize: ").append(toIndentedString(seupgradeCopyPoolSize)).append("\n");
        sb.append("    seupgradeFabricPoolSize: ").append(toIndentedString(seupgradeFabricPoolSize)).append("\n");
        sb.append("    seupgradeSegroupMinDeadTimeout: ").append(toIndentedString(seupgradeSegroupMinDeadTimeout)).append("\n");
        sb.append("    sharedSslCertificates: ").append(toIndentedString(sharedSslCertificates)).append("\n");
        sb.append("    skopeoRetryInterval: ").append(toIndentedString(skopeoRetryInterval)).append("\n");
        sb.append("    skopeoRetryLimit: ").append(toIndentedString(skopeoRetryLimit)).append("\n");
        sb.append("    softMinMemPerSeLimit: ").append(toIndentedString(softMinMemPerSeLimit)).append("\n");
        sb.append("    sslCertificateExpiryWarningDays: ").append(toIndentedString(sslCertificateExpiryWarningDays)).append("\n");
        sb.append("    systemReportCleanupInterval: ").append(toIndentedString(systemReportCleanupInterval)).append("\n");
        sb.append("    systemReportLimit: ").append(toIndentedString(systemReportLimit)).append("\n");
        sb.append("    unresponsiveSeReboot: ").append(toIndentedString(unresponsiveSeReboot)).append("\n");
        sb.append("    updateDnsEntryRetryLimit: ").append(toIndentedString(updateDnsEntryRetryLimit)).append("\n");
        sb.append("    updateDnsEntryTimeout: ").append(toIndentedString(updateDnsEntryTimeout)).append("\n");
        sb.append("    upgradeDnsTtl: ").append(toIndentedString(upgradeDnsTtl)).append("\n");
        sb.append("    upgradeFatSeLeaseTime: ").append(toIndentedString(upgradeFatSeLeaseTime)).append("\n");
        sb.append("    upgradeLeaseTime: ").append(toIndentedString(upgradeLeaseTime)).append("\n");
        sb.append("    upgradeSePerVsScaleOpsTxnTime: ").append(toIndentedString(upgradeSePerVsScaleOpsTxnTime)).append("\n");
            sb.append("    userAgentCacheConfig: ").append(toIndentedString(userAgentCacheConfig)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vnicOpFailTime: ").append(toIndentedString(vnicOpFailTime)).append("\n");
        sb.append("    vsAwaitingSeTimeout: ").append(toIndentedString(vsAwaitingSeTimeout)).append("\n");
        sb.append("    vsKeyRotatePeriod: ").append(toIndentedString(vsKeyRotatePeriod)).append("\n");
        sb.append("    vsScaleoutReadyCheckInterval: ").append(toIndentedString(vsScaleoutReadyCheckInterval)).append("\n");
        sb.append("    vsSeAttachIpFail: ").append(toIndentedString(vsSeAttachIpFail)).append("\n");
        sb.append("    vsSeBootupFail: ").append(toIndentedString(vsSeBootupFail)).append("\n");
        sb.append("    vsSeBootupFailPatch: ").append(toIndentedString(vsSeBootupFailPatch)).append("\n");
        sb.append("    vsSeCreateFail: ").append(toIndentedString(vsSeCreateFail)).append("\n");
        sb.append("    vsSePingFail: ").append(toIndentedString(vsSePingFail)).append("\n");
        sb.append("    vsSeVnicFail: ").append(toIndentedString(vsSeVnicFail)).append("\n");
        sb.append("    vsSeVnicIpFail: ").append(toIndentedString(vsSeVnicIpFail)).append("\n");
        sb.append("    vsphereHaDetectionTimeout: ").append(toIndentedString(vsphereHaDetectionTimeout)).append("\n");
        sb.append("    vsphereHaRecoveryTimeout: ").append(toIndentedString(vsphereHaRecoveryTimeout)).append("\n");
        sb.append("    vsphereHaTimerInterval: ").append(toIndentedString(vsphereHaTimerInterval)).append("\n");
        sb.append("    warmstartSeReconnectWaitTime: ").append(toIndentedString(warmstartSeReconnectWaitTime)).append("\n");
        sb.append("    warmstartVsResyncWaitTime: ").append(toIndentedString(warmstartVsResyncWaitTime)).append("\n");
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

