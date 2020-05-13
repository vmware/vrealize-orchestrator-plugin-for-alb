package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ControllerProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ControllerProperties")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERPROPERTIES, idAccessor = "getObjectID()")
@Service
public class ControllerProperties extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("allow_admin_network_updates")
  private Boolean allowAdminNetworkUpdates = null;

  @JsonProperty("allow_ip_forwarding")
  private Boolean allowIpForwarding = null;

  @JsonProperty("allow_unauthenticated_apis")
  private Boolean allowUnauthenticatedApis = null;

  @JsonProperty("allow_unauthenticated_nodes")
  private Boolean allowUnauthenticatedNodes = null;

  @JsonProperty("api_idle_timeout")
  private Integer apiIdleTimeout = 15;

  @JsonProperty("api_perf_logging_threshold")
  private Integer apiPerfLoggingThreshold = 10000;

  @JsonProperty("appviewx_compat_mode")
  private Boolean appviewxCompatMode = null;

  @JsonProperty("attach_ip_retry_interval")
  private Integer attachIpRetryInterval = 360;

  @JsonProperty("attach_ip_retry_limit")
  private Integer attachIpRetryLimit = 4;

  @JsonProperty("bm_use_ansible")
  private Boolean bmUseAnsible = true;

  @JsonProperty("cleanup_expired_authtoken_timeout_period")
  private Integer cleanupExpiredAuthtokenTimeoutPeriod = 60;

  @JsonProperty("cleanup_sessions_timeout_period")
  private Integer cleanupSessionsTimeoutPeriod = 60;

  @JsonProperty("cloud_reconcile")
  private Boolean cloudReconcile = true;

  @JsonProperty("cluster_ip_gratuitous_arp_period")
  private Integer clusterIpGratuitousArpPeriod = 60;

  @JsonProperty("consistency_check_timeout_period")
  private Integer consistencyCheckTimeoutPeriod = 60;

  @JsonProperty("crashed_se_reboot")
  private Integer crashedSeReboot = 900;

  @JsonProperty("dead_se_detection_timer")
  private Integer deadSeDetectionTimer = 360;

  @JsonProperty("default_minimum_api_timeout")
  private Integer defaultMinimumApiTimeout = 60;

  @JsonProperty("dns_refresh_period")
  private Integer dnsRefreshPeriod = 60;

  @JsonProperty("dummy")
  private Integer dummy = null;

  @JsonProperty("enable_api_sharding")
  private Boolean enableApiSharding = true;

  @JsonProperty("enable_memory_balancer")
  private Boolean enableMemoryBalancer = true;

  @JsonProperty("fatal_error_lease_time")
  private Integer fatalErrorLeaseTime = 120;

  @JsonProperty("max_dead_se_in_grp")
  private Integer maxDeadSeInGrp = 1;

  @JsonProperty("max_pcap_per_tenant")
  private Integer maxPcapPerTenant = 4;

  @JsonProperty("max_se_spawn_interval_delay")
  private Integer maxSeSpawnIntervalDelay = 1800;

  @JsonProperty("max_seq_attach_ip_failures")
  private Integer maxSeqAttachIpFailures = 3;

  @JsonProperty("max_seq_vnic_failures")
  private Integer maxSeqVnicFailures = 3;

  @JsonProperty("permission_scoped_shared_admin_networks")
  private Boolean permissionScopedSharedAdminNetworks = null;

  @JsonProperty("persistence_key_rotate_period")
  private Integer persistenceKeyRotatePeriod = null;

  @JsonProperty("portal_request_burst_limit")
  private Integer portalRequestBurstLimit = null;

  @JsonProperty("portal_request_rate_limit")
  private Integer portalRequestRateLimit = null;

  @JsonProperty("portal_token")
  private String portalToken = null;

  @JsonProperty("process_locked_useraccounts_timeout_period")
  private Integer processLockedUseraccountsTimeoutPeriod = 1;

  @JsonProperty("process_pki_profile_timeout_period")
  private Integer processPkiProfileTimeoutPeriod = 1440;

  @JsonProperty("query_host_fail")
  private Integer queryHostFail = 180;

  @JsonProperty("safenet_hsm_version")
  private String safenetHsmVersion = null;

  @JsonProperty("se_create_timeout")
  private Integer seCreateTimeout = 900;

  @JsonProperty("se_failover_attempt_interval")
  private Integer seFailoverAttemptInterval = 300;

  @JsonProperty("se_from_marketplace")
  private String seFromMarketplace = "IMAGE";

  @JsonProperty("se_offline_del")
  private Integer seOfflineDel = 172000;

  @JsonProperty("se_spawn_retry_interval")
  private Integer seSpawnRetryInterval = 300;

  @JsonProperty("se_vnic_cooldown")
  private Integer seVnicCooldown = 120;

  @JsonProperty("secure_channel_cleanup_timeout")
  private Integer secureChannelCleanupTimeout = 60;

  @JsonProperty("secure_channel_controller_token_timeout")
  private Integer secureChannelControllerTokenTimeout = 60;

  @JsonProperty("secure_channel_se_token_timeout")
  private Integer secureChannelSeTokenTimeout = 60;

  @JsonProperty("seupgrade_copy_pool_size")
  private Integer seupgradeCopyPoolSize = 5;

  @JsonProperty("seupgrade_fabric_pool_size")
  private Integer seupgradeFabricPoolSize = 20;

  @JsonProperty("seupgrade_segroup_min_dead_timeout")
  private Integer seupgradeSegroupMinDeadTimeout = 360;

  @JsonProperty("shared_ssl_certificates")
  private Boolean sharedSslCertificates = null;

  @JsonProperty("ssl_certificate_expiry_warning_days")
  @Valid
  private List<Integer> sslCertificateExpiryWarningDays = null;

  @JsonProperty("unresponsive_se_reboot")
  private Integer unresponsiveSeReboot = 300;

  @JsonProperty("upgrade_dns_ttl")
  private Integer upgradeDnsTtl = 5;

  @JsonProperty("upgrade_lease_time")
  private Integer upgradeLeaseTime = 360;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vnic_op_fail_time")
  private Integer vnicOpFailTime = 180;

  @JsonProperty("vs_apic_scaleout_timeout")
  private Integer vsApicScaleoutTimeout = 360;

  @JsonProperty("vs_awaiting_se_timeout")
  private Integer vsAwaitingSeTimeout = 60;

  @JsonProperty("vs_key_rotate_period")
  private Integer vsKeyRotatePeriod = 360;

  @JsonProperty("vs_scaleout_ready_check_interval")
  private Integer vsScaleoutReadyCheckInterval = 60;

  @JsonProperty("vs_se_attach_ip_fail")
  private Integer vsSeAttachIpFail = 600;

  @JsonProperty("vs_se_bootup_fail")
  private Integer vsSeBootupFail = 480;

  @JsonProperty("vs_se_create_fail")
  private Integer vsSeCreateFail = 1500;

  @JsonProperty("vs_se_ping_fail")
  private Integer vsSePingFail = 60;

  @JsonProperty("vs_se_vnic_fail")
  private Integer vsSeVnicFail = 300;

  @JsonProperty("vs_se_vnic_ip_fail")
  private Integer vsSeVnicIpFail = 120;

  @JsonProperty("warmstart_se_reconnect_wait_time")
  private Integer warmstartSeReconnectWaitTime = 480;

  @JsonProperty("warmstart_vs_resync_wait_time")
  private Integer warmstartVsResyncWaitTime = 300;

  
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
   * Allow non-admin tenants to update admin VrfContext and Network objects. Field introduced in 18.2.7, 20.1.1.
   * @return allowAdminNetworkUpdates
  **/
  @ApiModelProperty(value = "Allow non-admin tenants to update admin VrfContext and Network objects. Field introduced in 18.2.7, 20.1.1.")


 
  @VsoMethod  
  public Boolean isAllowAdminNetworkUpdates() {
    return allowAdminNetworkUpdates;
  }
    
  @VsoMethod
  public void setAllowAdminNetworkUpdates(Boolean allowAdminNetworkUpdates) {
    this.allowAdminNetworkUpdates = allowAdminNetworkUpdates;
  }

  
  /**
   *  Field introduced in 17.1.1.
   * @return allowIpForwarding
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isAllowIpForwarding() {
    return allowIpForwarding;
  }
    
  @VsoMethod
  public void setAllowIpForwarding(Boolean allowIpForwarding) {
    this.allowIpForwarding = allowIpForwarding;
  }

  
  /**
   * Allow unauthenticated access for special APIs.
   * @return allowUnauthenticatedApis
  **/
  @ApiModelProperty(value = "Allow unauthenticated access for special APIs.")


 
  @VsoMethod  
  public Boolean isAllowUnauthenticatedApis() {
    return allowUnauthenticatedApis;
  }
    
  @VsoMethod
  public void setAllowUnauthenticatedApis(Boolean allowUnauthenticatedApis) {
    this.allowUnauthenticatedApis = allowUnauthenticatedApis;
  }

  
  /**
   * Placeholder for description of property allow_unauthenticated_nodes of obj type ControllerProperties field type str  type boolean
   * @return allowUnauthenticatedNodes
  **/
  @ApiModelProperty(value = "Placeholder for description of property allow_unauthenticated_nodes of obj type ControllerProperties field type str  type boolean")


 
  @VsoMethod  
  public Boolean isAllowUnauthenticatedNodes() {
    return allowUnauthenticatedNodes;
  }
    
  @VsoMethod
  public void setAllowUnauthenticatedNodes(Boolean allowUnauthenticatedNodes) {
    this.allowUnauthenticatedNodes = allowUnauthenticatedNodes;
  }

  
  /**
   *  Allowed values are 0-1440.
   * @return apiIdleTimeout
  **/
  @ApiModelProperty(value = " Allowed values are 0-1440.")


 
  @VsoMethod  
  public Integer getApiIdleTimeout() {
    return apiIdleTimeout;
  }
    
  @VsoMethod
  public void setApiIdleTimeout(Integer apiIdleTimeout) {
    this.apiIdleTimeout = apiIdleTimeout;
  }

  
  /**
   * Threshold to log request timing in portal_performance.log and Server-Timing response header. Any stage taking longer than 1% of the threshold will be included in the Server-Timing header. Field introduced in 18.1.4, 18.2.1.
   * @return apiPerfLoggingThreshold
  **/
  @ApiModelProperty(value = "Threshold to log request timing in portal_performance.log and Server-Timing response header. Any stage taking longer than 1% of the threshold will be included in the Server-Timing header. Field introduced in 18.1.4, 18.2.1.")


 
  @VsoMethod  
  public Integer getApiPerfLoggingThreshold() {
    return apiPerfLoggingThreshold;
  }
    
  @VsoMethod
  public void setApiPerfLoggingThreshold(Integer apiPerfLoggingThreshold) {
    this.apiPerfLoggingThreshold = apiPerfLoggingThreshold;
  }

  
  /**
   * Export configuration in appviewx compatibility mode. Field introduced in 17.1.1.
   * @return appviewxCompatMode
  **/
  @ApiModelProperty(value = "Export configuration in appviewx compatibility mode. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isAppviewxCompatMode() {
    return appviewxCompatMode;
  }
    
  @VsoMethod
  public void setAppviewxCompatMode(Boolean appviewxCompatMode) {
    this.appviewxCompatMode = appviewxCompatMode;
  }

  
  /**
   * Number of attach_ip_retry_interval.
   * @return attachIpRetryInterval
  **/
  @ApiModelProperty(value = "Number of attach_ip_retry_interval.")


 
  @VsoMethod  
  public Integer getAttachIpRetryInterval() {
    return attachIpRetryInterval;
  }
    
  @VsoMethod
  public void setAttachIpRetryInterval(Integer attachIpRetryInterval) {
    this.attachIpRetryInterval = attachIpRetryInterval;
  }

  
  /**
   * Number of attach_ip_retry_limit.
   * @return attachIpRetryLimit
  **/
  @ApiModelProperty(value = "Number of attach_ip_retry_limit.")


 
  @VsoMethod  
  public Integer getAttachIpRetryLimit() {
    return attachIpRetryLimit;
  }
    
  @VsoMethod
  public void setAttachIpRetryLimit(Integer attachIpRetryLimit) {
    this.attachIpRetryLimit = attachIpRetryLimit;
  }

  
  /**
   * Use Ansible for SE creation in baremetal. Field introduced in 17.2.2.
   * @return bmUseAnsible
  **/
  @ApiModelProperty(value = "Use Ansible for SE creation in baremetal. Field introduced in 17.2.2.")


 
  @VsoMethod  
  public Boolean isBmUseAnsible() {
    return bmUseAnsible;
  }
    
  @VsoMethod
  public void setBmUseAnsible(Boolean bmUseAnsible) {
    this.bmUseAnsible = bmUseAnsible;
  }

  
  /**
   * Period for auth token cleanup job. Field introduced in 18.1.1.
   * @return cleanupExpiredAuthtokenTimeoutPeriod
  **/
  @ApiModelProperty(value = "Period for auth token cleanup job. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Integer getCleanupExpiredAuthtokenTimeoutPeriod() {
    return cleanupExpiredAuthtokenTimeoutPeriod;
  }
    
  @VsoMethod
  public void setCleanupExpiredAuthtokenTimeoutPeriod(Integer cleanupExpiredAuthtokenTimeoutPeriod) {
    this.cleanupExpiredAuthtokenTimeoutPeriod = cleanupExpiredAuthtokenTimeoutPeriod;
  }

  
  /**
   * Period for sessions cleanup job. Field introduced in 18.1.1.
   * @return cleanupSessionsTimeoutPeriod
  **/
  @ApiModelProperty(value = "Period for sessions cleanup job. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Integer getCleanupSessionsTimeoutPeriod() {
    return cleanupSessionsTimeoutPeriod;
  }
    
  @VsoMethod
  public void setCleanupSessionsTimeoutPeriod(Integer cleanupSessionsTimeoutPeriod) {
    this.cleanupSessionsTimeoutPeriod = cleanupSessionsTimeoutPeriod;
  }

  
  /**
   * Enable/Disable periodic reconcile for all the clouds. Field introduced in 17.2.14,18.1.5,18.2.1.
   * @return cloudReconcile
  **/
  @ApiModelProperty(value = "Enable/Disable periodic reconcile for all the clouds. Field introduced in 17.2.14,18.1.5,18.2.1.")


 
  @VsoMethod  
  public Boolean isCloudReconcile() {
    return cloudReconcile;
  }
    
  @VsoMethod
  public void setCloudReconcile(Boolean cloudReconcile) {
    this.cloudReconcile = cloudReconcile;
  }

  
  /**
   * Period for cluster ip gratuitous arp job.
   * @return clusterIpGratuitousArpPeriod
  **/
  @ApiModelProperty(value = "Period for cluster ip gratuitous arp job.")


 
  @VsoMethod  
  public Integer getClusterIpGratuitousArpPeriod() {
    return clusterIpGratuitousArpPeriod;
  }
    
  @VsoMethod
  public void setClusterIpGratuitousArpPeriod(Integer clusterIpGratuitousArpPeriod) {
    this.clusterIpGratuitousArpPeriod = clusterIpGratuitousArpPeriod;
  }

  
  /**
   * Period for consistency check job. Field introduced in 18.1.1.
   * @return consistencyCheckTimeoutPeriod
  **/
  @ApiModelProperty(value = "Period for consistency check job. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Integer getConsistencyCheckTimeoutPeriod() {
    return consistencyCheckTimeoutPeriod;
  }
    
  @VsoMethod
  public void setConsistencyCheckTimeoutPeriod(Integer consistencyCheckTimeoutPeriod) {
    this.consistencyCheckTimeoutPeriod = consistencyCheckTimeoutPeriod;
  }

  
  /**
   * Number of crashed_se_reboot.
   * @return crashedSeReboot
  **/
  @ApiModelProperty(value = "Number of crashed_se_reboot.")


 
  @VsoMethod  
  public Integer getCrashedSeReboot() {
    return crashedSeReboot;
  }
    
  @VsoMethod
  public void setCrashedSeReboot(Integer crashedSeReboot) {
    this.crashedSeReboot = crashedSeReboot;
  }

  
  /**
   * Number of dead_se_detection_timer.
   * @return deadSeDetectionTimer
  **/
  @ApiModelProperty(value = "Number of dead_se_detection_timer.")


 
  @VsoMethod  
  public Integer getDeadSeDetectionTimer() {
    return deadSeDetectionTimer;
  }
    
  @VsoMethod
  public void setDeadSeDetectionTimer(Integer deadSeDetectionTimer) {
    this.deadSeDetectionTimer = deadSeDetectionTimer;
  }

  
  /**
   * Minimum api timeout value.If this value is not 60, it will be the default timeout for all APIs that do not have a specific timeout.If an API has a specific timeout but is less than this value, this value will become the new timeout. Allowed values are 60-3600. Field introduced in 18.2.6.
   * @return defaultMinimumApiTimeout
  **/
  @ApiModelProperty(value = "Minimum api timeout value.If this value is not 60, it will be the default timeout for all APIs that do not have a specific timeout.If an API has a specific timeout but is less than this value, this value will become the new timeout. Allowed values are 60-3600. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getDefaultMinimumApiTimeout() {
    return defaultMinimumApiTimeout;
  }
    
  @VsoMethod
  public void setDefaultMinimumApiTimeout(Integer defaultMinimumApiTimeout) {
    this.defaultMinimumApiTimeout = defaultMinimumApiTimeout;
  }

  
  /**
   * Period for refresh pool and gslb DNS job.
   * @return dnsRefreshPeriod
  **/
  @ApiModelProperty(value = "Period for refresh pool and gslb DNS job.")


 
  @VsoMethod  
  public Integer getDnsRefreshPeriod() {
    return dnsRefreshPeriod;
  }
    
  @VsoMethod
  public void setDnsRefreshPeriod(Integer dnsRefreshPeriod) {
    this.dnsRefreshPeriod = dnsRefreshPeriod;
  }

  
  /**
   * Number of dummy.
   * @return dummy
  **/
  @ApiModelProperty(value = "Number of dummy.")


 
  @VsoMethod  
  public Integer getDummy() {
    return dummy;
  }
    
  @VsoMethod
  public void setDummy(Integer dummy) {
    this.dummy = dummy;
  }

  
  /**
   * This setting enables the controller leader to shard API requests to the followers (if any). Field introduced in 18.1.5, 18.2.1.
   * @return enableApiSharding
  **/
  @ApiModelProperty(value = "This setting enables the controller leader to shard API requests to the followers (if any). Field introduced in 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public Boolean isEnableApiSharding() {
    return enableApiSharding;
  }
    
  @VsoMethod
  public void setEnableApiSharding(Boolean enableApiSharding) {
    this.enableApiSharding = enableApiSharding;
  }

  
  /**
   * Enable/Disable Memory Balancer. Field introduced in 17.2.8.
   * @return enableMemoryBalancer
  **/
  @ApiModelProperty(value = "Enable/Disable Memory Balancer. Field introduced in 17.2.8.")


 
  @VsoMethod  
  public Boolean isEnableMemoryBalancer() {
    return enableMemoryBalancer;
  }
    
  @VsoMethod
  public void setEnableMemoryBalancer(Boolean enableMemoryBalancer) {
    this.enableMemoryBalancer = enableMemoryBalancer;
  }

  
  /**
   * Number of fatal_error_lease_time.
   * @return fatalErrorLeaseTime
  **/
  @ApiModelProperty(value = "Number of fatal_error_lease_time.")


 
  @VsoMethod  
  public Integer getFatalErrorLeaseTime() {
    return fatalErrorLeaseTime;
  }
    
  @VsoMethod
  public void setFatalErrorLeaseTime(Integer fatalErrorLeaseTime) {
    this.fatalErrorLeaseTime = fatalErrorLeaseTime;
  }

  
  /**
   * Number of max_dead_se_in_grp.
   * @return maxDeadSeInGrp
  **/
  @ApiModelProperty(value = "Number of max_dead_se_in_grp.")


 
  @VsoMethod  
  public Integer getMaxDeadSeInGrp() {
    return maxDeadSeInGrp;
  }
    
  @VsoMethod
  public void setMaxDeadSeInGrp(Integer maxDeadSeInGrp) {
    this.maxDeadSeInGrp = maxDeadSeInGrp;
  }

  
  /**
   * Maximum number of pcap files stored per tenant.
   * @return maxPcapPerTenant
  **/
  @ApiModelProperty(value = "Maximum number of pcap files stored per tenant.")


 
  @VsoMethod  
  public Integer getMaxPcapPerTenant() {
    return maxPcapPerTenant;
  }
    
  @VsoMethod
  public void setMaxPcapPerTenant(Integer maxPcapPerTenant) {
    this.maxPcapPerTenant = maxPcapPerTenant;
  }

  
  /**
   * Maximum delay possible to add to se_spawn_retry_interval after successive SE spawn failure. Field introduced in 20.1.1.
   * @return maxSeSpawnIntervalDelay
  **/
  @ApiModelProperty(value = "Maximum delay possible to add to se_spawn_retry_interval after successive SE spawn failure. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getMaxSeSpawnIntervalDelay() {
    return maxSeSpawnIntervalDelay;
  }
    
  @VsoMethod
  public void setMaxSeSpawnIntervalDelay(Integer maxSeSpawnIntervalDelay) {
    this.maxSeSpawnIntervalDelay = maxSeSpawnIntervalDelay;
  }

  
  /**
   * Maximum number of consecutive attach IP failures that halts VS placement. Field introduced in 17.2.2.
   * @return maxSeqAttachIpFailures
  **/
  @ApiModelProperty(value = "Maximum number of consecutive attach IP failures that halts VS placement. Field introduced in 17.2.2.")


 
  @VsoMethod  
  public Integer getMaxSeqAttachIpFailures() {
    return maxSeqAttachIpFailures;
  }
    
  @VsoMethod
  public void setMaxSeqAttachIpFailures(Integer maxSeqAttachIpFailures) {
    this.maxSeqAttachIpFailures = maxSeqAttachIpFailures;
  }

  
  /**
   * Number of max_seq_vnic_failures.
   * @return maxSeqVnicFailures
  **/
  @ApiModelProperty(value = "Number of max_seq_vnic_failures.")


 
  @VsoMethod  
  public Integer getMaxSeqVnicFailures() {
    return maxSeqVnicFailures;
  }
    
  @VsoMethod
  public void setMaxSeqVnicFailures(Integer maxSeqVnicFailures) {
    this.maxSeqVnicFailures = maxSeqVnicFailures;
  }

  
  /**
   * Network and VrfContext objects from the admin tenant will not be shared to non-admin tenants unless admin permissions are granted. Field introduced in 18.2.7, 20.1.1.
   * @return permissionScopedSharedAdminNetworks
  **/
  @ApiModelProperty(value = "Network and VrfContext objects from the admin tenant will not be shared to non-admin tenants unless admin permissions are granted. Field introduced in 18.2.7, 20.1.1.")


 
  @VsoMethod  
  public Boolean isPermissionScopedSharedAdminNetworks() {
    return permissionScopedSharedAdminNetworks;
  }
    
  @VsoMethod
  public void setPermissionScopedSharedAdminNetworks(Boolean permissionScopedSharedAdminNetworks) {
    this.permissionScopedSharedAdminNetworks = permissionScopedSharedAdminNetworks;
  }

  
  /**
   * Period for rotate app persistence keys job. Allowed values are 1-1051200. Special values are 0 - 'Disabled'.
   * @return persistenceKeyRotatePeriod
  **/
  @ApiModelProperty(value = "Period for rotate app persistence keys job. Allowed values are 1-1051200. Special values are 0 - 'Disabled'.")


 
  @VsoMethod  
  public Integer getPersistenceKeyRotatePeriod() {
    return persistenceKeyRotatePeriod;
  }
    
  @VsoMethod
  public void setPersistenceKeyRotatePeriod(Integer persistenceKeyRotatePeriod) {
    this.persistenceKeyRotatePeriod = persistenceKeyRotatePeriod;
  }

  
  /**
   * Burst limit on number of incoming requests0 to disable. Field introduced in 20.1.1.
   * @return portalRequestBurstLimit
  **/
  @ApiModelProperty(value = "Burst limit on number of incoming requests0 to disable. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getPortalRequestBurstLimit() {
    return portalRequestBurstLimit;
  }
    
  @VsoMethod
  public void setPortalRequestBurstLimit(Integer portalRequestBurstLimit) {
    this.portalRequestBurstLimit = portalRequestBurstLimit;
  }

  
  /**
   * Maximum average number of requests allowed per second0 to disable. Field introduced in 20.1.1.
   * @return portalRequestRateLimit
  **/
  @ApiModelProperty(value = "Maximum average number of requests allowed per second0 to disable. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getPortalRequestRateLimit() {
    return portalRequestRateLimit;
  }
    
  @VsoMethod
  public void setPortalRequestRateLimit(Integer portalRequestRateLimit) {
    this.portalRequestRateLimit = portalRequestRateLimit;
  }

  
  /**
   * Token used for uploading tech-support to portal. Field introduced in 16.4.6,17.1.2.
   * @return portalToken
  **/
  @ApiModelProperty(value = "Token used for uploading tech-support to portal. Field introduced in 16.4.6,17.1.2.")


 
  @VsoMethod  
  public String getPortalToken() {
    return portalToken;
  }
    
  @VsoMethod
  public void setPortalToken(String portalToken) {
    this.portalToken = portalToken;
  }

  
  /**
   * Period for process locked user accounts job. Field introduced in 18.1.1.
   * @return processLockedUseraccountsTimeoutPeriod
  **/
  @ApiModelProperty(value = "Period for process locked user accounts job. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Integer getProcessLockedUseraccountsTimeoutPeriod() {
    return processLockedUseraccountsTimeoutPeriod;
  }
    
  @VsoMethod
  public void setProcessLockedUseraccountsTimeoutPeriod(Integer processLockedUseraccountsTimeoutPeriod) {
    this.processLockedUseraccountsTimeoutPeriod = processLockedUseraccountsTimeoutPeriod;
  }

  
  /**
   * Period for process PKI profile job. Field introduced in 18.1.1.
   * @return processPkiProfileTimeoutPeriod
  **/
  @ApiModelProperty(value = "Period for process PKI profile job. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Integer getProcessPkiProfileTimeoutPeriod() {
    return processPkiProfileTimeoutPeriod;
  }
    
  @VsoMethod
  public void setProcessPkiProfileTimeoutPeriod(Integer processPkiProfileTimeoutPeriod) {
    this.processPkiProfileTimeoutPeriod = processPkiProfileTimeoutPeriod;
  }

  
  /**
   * Number of query_host_fail.
   * @return queryHostFail
  **/
  @ApiModelProperty(value = "Number of query_host_fail.")


 
  @VsoMethod  
  public Integer getQueryHostFail() {
    return queryHostFail;
  }
    
  @VsoMethod
  public void setQueryHostFail(Integer queryHostFail) {
    this.queryHostFail = queryHostFail;
  }

  
  /**
   * Version of the safenet package installed on the controller. Field introduced in 16.5.2,17.2.3.
   * @return safenetHsmVersion
  **/
  @ApiModelProperty(value = "Version of the safenet package installed on the controller. Field introduced in 16.5.2,17.2.3.")


 
  @VsoMethod  
  public String getSafenetHsmVersion() {
    return safenetHsmVersion;
  }
    
  @VsoMethod
  public void setSafenetHsmVersion(String safenetHsmVersion) {
    this.safenetHsmVersion = safenetHsmVersion;
  }

  
  /**
   * Number of se_create_timeout.
   * @return seCreateTimeout
  **/
  @ApiModelProperty(value = "Number of se_create_timeout.")


 
  @VsoMethod  
  public Integer getSeCreateTimeout() {
    return seCreateTimeout;
  }
    
  @VsoMethod
  public void setSeCreateTimeout(Integer seCreateTimeout) {
    this.seCreateTimeout = seCreateTimeout;
  }

  
  /**
   * Interval between attempting failovers to an SE.
   * @return seFailoverAttemptInterval
  **/
  @ApiModelProperty(value = "Interval between attempting failovers to an SE.")


 
  @VsoMethod  
  public Integer getSeFailoverAttemptInterval() {
    return seFailoverAttemptInterval;
  }
    
  @VsoMethod
  public void setSeFailoverAttemptInterval(Integer seFailoverAttemptInterval) {
    this.seFailoverAttemptInterval = seFailoverAttemptInterval;
  }

  
  /**
   * This setting decides whether SE is to be deployed from the cloud marketplace or to be created by the controller. The setting is applicable only when BYOL license is selected. Enum options - MARKETPLACE, IMAGE. Field introduced in 18.1.4, 18.2.1.
   * @return seFromMarketplace
  **/
  @ApiModelProperty(value = "This setting decides whether SE is to be deployed from the cloud marketplace or to be created by the controller. The setting is applicable only when BYOL license is selected. Enum options - MARKETPLACE, IMAGE. Field introduced in 18.1.4, 18.2.1.")


 
  @VsoMethod  
  public String getSeFromMarketplace() {
    return seFromMarketplace;
  }
    
  @VsoMethod
  public void setSeFromMarketplace(String seFromMarketplace) {
    this.seFromMarketplace = seFromMarketplace;
  }

  
  /**
   * Number of se_offline_del.
   * @return seOfflineDel
  **/
  @ApiModelProperty(value = "Number of se_offline_del.")


 
  @VsoMethod  
  public Integer getSeOfflineDel() {
    return seOfflineDel;
  }
    
  @VsoMethod
  public void setSeOfflineDel(Integer seOfflineDel) {
    this.seOfflineDel = seOfflineDel;
  }

  
  /**
   * Default retry period before attempting another Service Engine spawn in SE Group. Field introduced in 20.1.1.
   * @return seSpawnRetryInterval
  **/
  @ApiModelProperty(value = "Default retry period before attempting another Service Engine spawn in SE Group. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getSeSpawnRetryInterval() {
    return seSpawnRetryInterval;
  }
    
  @VsoMethod
  public void setSeSpawnRetryInterval(Integer seSpawnRetryInterval) {
    this.seSpawnRetryInterval = seSpawnRetryInterval;
  }

  
  /**
   * Number of se_vnic_cooldown.
   * @return seVnicCooldown
  **/
  @ApiModelProperty(value = "Number of se_vnic_cooldown.")


 
  @VsoMethod  
  public Integer getSeVnicCooldown() {
    return seVnicCooldown;
  }
    
  @VsoMethod
  public void setSeVnicCooldown(Integer seVnicCooldown) {
    this.seVnicCooldown = seVnicCooldown;
  }

  
  /**
   * Period for secure channel cleanup job.
   * @return secureChannelCleanupTimeout
  **/
  @ApiModelProperty(value = "Period for secure channel cleanup job.")


 
  @VsoMethod  
  public Integer getSecureChannelCleanupTimeout() {
    return secureChannelCleanupTimeout;
  }
    
  @VsoMethod
  public void setSecureChannelCleanupTimeout(Integer secureChannelCleanupTimeout) {
    this.secureChannelCleanupTimeout = secureChannelCleanupTimeout;
  }

  
  /**
   * Number of secure_channel_controller_token_timeout.
   * @return secureChannelControllerTokenTimeout
  **/
  @ApiModelProperty(value = "Number of secure_channel_controller_token_timeout.")


 
  @VsoMethod  
  public Integer getSecureChannelControllerTokenTimeout() {
    return secureChannelControllerTokenTimeout;
  }
    
  @VsoMethod
  public void setSecureChannelControllerTokenTimeout(Integer secureChannelControllerTokenTimeout) {
    this.secureChannelControllerTokenTimeout = secureChannelControllerTokenTimeout;
  }

  
  /**
   * Number of secure_channel_se_token_timeout.
   * @return secureChannelSeTokenTimeout
  **/
  @ApiModelProperty(value = "Number of secure_channel_se_token_timeout.")


 
  @VsoMethod  
  public Integer getSecureChannelSeTokenTimeout() {
    return secureChannelSeTokenTimeout;
  }
    
  @VsoMethod
  public void setSecureChannelSeTokenTimeout(Integer secureChannelSeTokenTimeout) {
    this.secureChannelSeTokenTimeout = secureChannelSeTokenTimeout;
  }

  
  /**
   * This parameter defines the number of simultaneous SE image downloads in a SeGroup. It is used to pace the SE downloads so that controller network/CPU bandwidth is a bounded operation. A value of 0 will disable the pacing scheme and all the SE(s) in the SeGroup will attempt to download the image. . Field introduced in 18.2.6.
   * @return seupgradeCopyPoolSize
  **/
  @ApiModelProperty(value = "This parameter defines the number of simultaneous SE image downloads in a SeGroup. It is used to pace the SE downloads so that controller network/CPU bandwidth is a bounded operation. A value of 0 will disable the pacing scheme and all the SE(s) in the SeGroup will attempt to download the image. . Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getSeupgradeCopyPoolSize() {
    return seupgradeCopyPoolSize;
  }
    
  @VsoMethod
  public void setSeupgradeCopyPoolSize(Integer seupgradeCopyPoolSize) {
    this.seupgradeCopyPoolSize = seupgradeCopyPoolSize;
  }

  
  /**
   * Pool size used for all fabric commands during se upgrade.
   * @return seupgradeFabricPoolSize
  **/
  @ApiModelProperty(value = "Pool size used for all fabric commands during se upgrade.")


 
  @VsoMethod  
  public Integer getSeupgradeFabricPoolSize() {
    return seupgradeFabricPoolSize;
  }
    
  @VsoMethod
  public void setSeupgradeFabricPoolSize(Integer seupgradeFabricPoolSize) {
    this.seupgradeFabricPoolSize = seupgradeFabricPoolSize;
  }

  
  /**
   * Time to wait before marking segroup upgrade as stuck.
   * @return seupgradeSegroupMinDeadTimeout
  **/
  @ApiModelProperty(value = "Time to wait before marking segroup upgrade as stuck.")


 
  @VsoMethod  
  public Integer getSeupgradeSegroupMinDeadTimeout() {
    return seupgradeSegroupMinDeadTimeout;
  }
    
  @VsoMethod
  public void setSeupgradeSegroupMinDeadTimeout(Integer seupgradeSegroupMinDeadTimeout) {
    this.seupgradeSegroupMinDeadTimeout = seupgradeSegroupMinDeadTimeout;
  }

  
  /**
   * SSL Certificates in the admin tenant can be used in non-admin tenants. Field introduced in 18.2.5.
   * @return sharedSslCertificates
  **/
  @ApiModelProperty(value = "SSL Certificates in the admin tenant can be used in non-admin tenants. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isSharedSslCertificates() {
    return sharedSslCertificates;
  }
    
  @VsoMethod
  public void setSharedSslCertificates(Boolean sharedSslCertificates) {
    this.sharedSslCertificates = sharedSslCertificates;
  }

  
  public ControllerProperties addSslCertificateExpiryWarningDaysItem(Integer sslCertificateExpiryWarningDaysItem) {
    if (this.sslCertificateExpiryWarningDays == null) {
      this.sslCertificateExpiryWarningDays = new ArrayList<Integer>();
    }
    this.sslCertificateExpiryWarningDays.add(sslCertificateExpiryWarningDaysItem);
    return this;
  }
  
  /**
   * Number of days for SSL Certificate expiry warning.
   * @return sslCertificateExpiryWarningDays
  **/
  @ApiModelProperty(value = "Number of days for SSL Certificate expiry warning.")


 
  @VsoMethod  
  public List<Integer> getSslCertificateExpiryWarningDays() {
    return sslCertificateExpiryWarningDays;
  }
    
  @VsoMethod
  public void setSslCertificateExpiryWarningDays(List<Integer> sslCertificateExpiryWarningDays) {
    this.sslCertificateExpiryWarningDays = sslCertificateExpiryWarningDays;
  }

  
  /**
   * Number of unresponsive_se_reboot.
   * @return unresponsiveSeReboot
  **/
  @ApiModelProperty(value = "Number of unresponsive_se_reboot.")


 
  @VsoMethod  
  public Integer getUnresponsiveSeReboot() {
    return unresponsiveSeReboot;
  }
    
  @VsoMethod
  public void setUnresponsiveSeReboot(Integer unresponsiveSeReboot) {
    this.unresponsiveSeReboot = unresponsiveSeReboot;
  }

  
  /**
   * Time to account for DNS TTL during upgrade. This is in addition to vs_scalein_timeout_for_upgrade in se_group. Field introduced in 17.1.1.
   * @return upgradeDnsTtl
  **/
  @ApiModelProperty(value = "Time to account for DNS TTL during upgrade. This is in addition to vs_scalein_timeout_for_upgrade in se_group. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getUpgradeDnsTtl() {
    return upgradeDnsTtl;
  }
    
  @VsoMethod
  public void setUpgradeDnsTtl(Integer upgradeDnsTtl) {
    this.upgradeDnsTtl = upgradeDnsTtl;
  }

  
  /**
   * Number of upgrade_lease_time.
   * @return upgradeLeaseTime
  **/
  @ApiModelProperty(value = "Number of upgrade_lease_time.")


 
  @VsoMethod  
  public Integer getUpgradeLeaseTime() {
    return upgradeLeaseTime;
  }
    
  @VsoMethod
  public void setUpgradeLeaseTime(Integer upgradeLeaseTime) {
    this.upgradeLeaseTime = upgradeLeaseTime;
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
   * Number of vnic_op_fail_time.
   * @return vnicOpFailTime
  **/
  @ApiModelProperty(value = "Number of vnic_op_fail_time.")


 
  @VsoMethod  
  public Integer getVnicOpFailTime() {
    return vnicOpFailTime;
  }
    
  @VsoMethod
  public void setVnicOpFailTime(Integer vnicOpFailTime) {
    this.vnicOpFailTime = vnicOpFailTime;
  }

  
  /**
   * Time to wait for the scaled out SE to become ready before marking the scaleout done, applies to APIC configuration only.
   * @return vsApicScaleoutTimeout
  **/
  @ApiModelProperty(value = "Time to wait for the scaled out SE to become ready before marking the scaleout done, applies to APIC configuration only.")


 
  @VsoMethod  
  public Integer getVsApicScaleoutTimeout() {
    return vsApicScaleoutTimeout;
  }
    
  @VsoMethod
  public void setVsApicScaleoutTimeout(Integer vsApicScaleoutTimeout) {
    this.vsApicScaleoutTimeout = vsApicScaleoutTimeout;
  }

  
  /**
   * Number of vs_awaiting_se_timeout.
   * @return vsAwaitingSeTimeout
  **/
  @ApiModelProperty(value = "Number of vs_awaiting_se_timeout.")


 
  @VsoMethod  
  public Integer getVsAwaitingSeTimeout() {
    return vsAwaitingSeTimeout;
  }
    
  @VsoMethod
  public void setVsAwaitingSeTimeout(Integer vsAwaitingSeTimeout) {
    this.vsAwaitingSeTimeout = vsAwaitingSeTimeout;
  }

  
  /**
   * Period for rotate VS keys job. Allowed values are 1-1051200. Special values are 0 - 'Disabled'.
   * @return vsKeyRotatePeriod
  **/
  @ApiModelProperty(value = "Period for rotate VS keys job. Allowed values are 1-1051200. Special values are 0 - 'Disabled'.")


 
  @VsoMethod  
  public Integer getVsKeyRotatePeriod() {
    return vsKeyRotatePeriod;
  }
    
  @VsoMethod
  public void setVsKeyRotatePeriod(Integer vsKeyRotatePeriod) {
    this.vsKeyRotatePeriod = vsKeyRotatePeriod;
  }

  
  /**
   * Interval for checking scaleout_ready status while controller is waiting for ScaleOutReady RPC from the Service Engine. Field introduced in 18.2.2.
   * @return vsScaleoutReadyCheckInterval
  **/
  @ApiModelProperty(value = "Interval for checking scaleout_ready status while controller is waiting for ScaleOutReady RPC from the Service Engine. Field introduced in 18.2.2.")


 
  @VsoMethod  
  public Integer getVsScaleoutReadyCheckInterval() {
    return vsScaleoutReadyCheckInterval;
  }
    
  @VsoMethod
  public void setVsScaleoutReadyCheckInterval(Integer vsScaleoutReadyCheckInterval) {
    this.vsScaleoutReadyCheckInterval = vsScaleoutReadyCheckInterval;
  }

  
  /**
   * Time to wait before marking attach IP operation on an SE as failed. Field introduced in 17.2.2.
   * @return vsSeAttachIpFail
  **/
  @ApiModelProperty(value = "Time to wait before marking attach IP operation on an SE as failed. Field introduced in 17.2.2.")


 
  @VsoMethod  
  public Integer getVsSeAttachIpFail() {
    return vsSeAttachIpFail;
  }
    
  @VsoMethod
  public void setVsSeAttachIpFail(Integer vsSeAttachIpFail) {
    this.vsSeAttachIpFail = vsSeAttachIpFail;
  }

  
  /**
   * Number of vs_se_bootup_fail.
   * @return vsSeBootupFail
  **/
  @ApiModelProperty(value = "Number of vs_se_bootup_fail.")


 
  @VsoMethod  
  public Integer getVsSeBootupFail() {
    return vsSeBootupFail;
  }
    
  @VsoMethod
  public void setVsSeBootupFail(Integer vsSeBootupFail) {
    this.vsSeBootupFail = vsSeBootupFail;
  }

  
  /**
   * Number of vs_se_create_fail.
   * @return vsSeCreateFail
  **/
  @ApiModelProperty(value = "Number of vs_se_create_fail.")


 
  @VsoMethod  
  public Integer getVsSeCreateFail() {
    return vsSeCreateFail;
  }
    
  @VsoMethod
  public void setVsSeCreateFail(Integer vsSeCreateFail) {
    this.vsSeCreateFail = vsSeCreateFail;
  }

  
  /**
   * Number of vs_se_ping_fail.
   * @return vsSePingFail
  **/
  @ApiModelProperty(value = "Number of vs_se_ping_fail.")


 
  @VsoMethod  
  public Integer getVsSePingFail() {
    return vsSePingFail;
  }
    
  @VsoMethod
  public void setVsSePingFail(Integer vsSePingFail) {
    this.vsSePingFail = vsSePingFail;
  }

  
  /**
   * Number of vs_se_vnic_fail.
   * @return vsSeVnicFail
  **/
  @ApiModelProperty(value = "Number of vs_se_vnic_fail.")


 
  @VsoMethod  
  public Integer getVsSeVnicFail() {
    return vsSeVnicFail;
  }
    
  @VsoMethod
  public void setVsSeVnicFail(Integer vsSeVnicFail) {
    this.vsSeVnicFail = vsSeVnicFail;
  }

  
  /**
   * Number of vs_se_vnic_ip_fail.
   * @return vsSeVnicIpFail
  **/
  @ApiModelProperty(value = "Number of vs_se_vnic_ip_fail.")


 
  @VsoMethod  
  public Integer getVsSeVnicIpFail() {
    return vsSeVnicIpFail;
  }
    
  @VsoMethod
  public void setVsSeVnicIpFail(Integer vsSeVnicIpFail) {
    this.vsSeVnicIpFail = vsSeVnicIpFail;
  }

  
  /**
   * Number of warmstart_se_reconnect_wait_time.
   * @return warmstartSeReconnectWaitTime
  **/
  @ApiModelProperty(value = "Number of warmstart_se_reconnect_wait_time.")


 
  @VsoMethod  
  public Integer getWarmstartSeReconnectWaitTime() {
    return warmstartSeReconnectWaitTime;
  }
    
  @VsoMethod
  public void setWarmstartSeReconnectWaitTime(Integer warmstartSeReconnectWaitTime) {
    this.warmstartSeReconnectWaitTime = warmstartSeReconnectWaitTime;
  }

  
  /**
   * Timeout for warmstart VS resync. Field introduced in 18.1.4, 18.2.1.
   * @return warmstartVsResyncWaitTime
  **/
  @ApiModelProperty(value = "Timeout for warmstart VS resync. Field introduced in 18.1.4, 18.2.1.")


 
  @VsoMethod  
  public Integer getWarmstartVsResyncWaitTime() {
    return warmstartVsResyncWaitTime;
  }
    
  @VsoMethod
  public void setWarmstartVsResyncWaitTime(Integer warmstartVsResyncWaitTime) {
    this.warmstartVsResyncWaitTime = warmstartVsResyncWaitTime;
  }

  
  public String getObjectID() {
		return "ControllerProperties";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerProperties controllerProperties = (ControllerProperties) o;
    return Objects.equals(this.lastModified, controllerProperties.lastModified) &&
        Objects.equals(this.allowAdminNetworkUpdates, controllerProperties.allowAdminNetworkUpdates) &&
        Objects.equals(this.allowIpForwarding, controllerProperties.allowIpForwarding) &&
        Objects.equals(this.allowUnauthenticatedApis, controllerProperties.allowUnauthenticatedApis) &&
        Objects.equals(this.allowUnauthenticatedNodes, controllerProperties.allowUnauthenticatedNodes) &&
        Objects.equals(this.apiIdleTimeout, controllerProperties.apiIdleTimeout) &&
        Objects.equals(this.apiPerfLoggingThreshold, controllerProperties.apiPerfLoggingThreshold) &&
        Objects.equals(this.appviewxCompatMode, controllerProperties.appviewxCompatMode) &&
        Objects.equals(this.attachIpRetryInterval, controllerProperties.attachIpRetryInterval) &&
        Objects.equals(this.attachIpRetryLimit, controllerProperties.attachIpRetryLimit) &&
        Objects.equals(this.bmUseAnsible, controllerProperties.bmUseAnsible) &&
        Objects.equals(this.cleanupExpiredAuthtokenTimeoutPeriod, controllerProperties.cleanupExpiredAuthtokenTimeoutPeriod) &&
        Objects.equals(this.cleanupSessionsTimeoutPeriod, controllerProperties.cleanupSessionsTimeoutPeriod) &&
        Objects.equals(this.cloudReconcile, controllerProperties.cloudReconcile) &&
        Objects.equals(this.clusterIpGratuitousArpPeriod, controllerProperties.clusterIpGratuitousArpPeriod) &&
        Objects.equals(this.consistencyCheckTimeoutPeriod, controllerProperties.consistencyCheckTimeoutPeriod) &&
        Objects.equals(this.crashedSeReboot, controllerProperties.crashedSeReboot) &&
        Objects.equals(this.deadSeDetectionTimer, controllerProperties.deadSeDetectionTimer) &&
        Objects.equals(this.defaultMinimumApiTimeout, controllerProperties.defaultMinimumApiTimeout) &&
        Objects.equals(this.dnsRefreshPeriod, controllerProperties.dnsRefreshPeriod) &&
        Objects.equals(this.dummy, controllerProperties.dummy) &&
        Objects.equals(this.enableApiSharding, controllerProperties.enableApiSharding) &&
        Objects.equals(this.enableMemoryBalancer, controllerProperties.enableMemoryBalancer) &&
        Objects.equals(this.fatalErrorLeaseTime, controllerProperties.fatalErrorLeaseTime) &&
        Objects.equals(this.maxDeadSeInGrp, controllerProperties.maxDeadSeInGrp) &&
        Objects.equals(this.maxPcapPerTenant, controllerProperties.maxPcapPerTenant) &&
        Objects.equals(this.maxSeSpawnIntervalDelay, controllerProperties.maxSeSpawnIntervalDelay) &&
        Objects.equals(this.maxSeqAttachIpFailures, controllerProperties.maxSeqAttachIpFailures) &&
        Objects.equals(this.maxSeqVnicFailures, controllerProperties.maxSeqVnicFailures) &&
        Objects.equals(this.permissionScopedSharedAdminNetworks, controllerProperties.permissionScopedSharedAdminNetworks) &&
        Objects.equals(this.persistenceKeyRotatePeriod, controllerProperties.persistenceKeyRotatePeriod) &&
        Objects.equals(this.portalRequestBurstLimit, controllerProperties.portalRequestBurstLimit) &&
        Objects.equals(this.portalRequestRateLimit, controllerProperties.portalRequestRateLimit) &&
        Objects.equals(this.portalToken, controllerProperties.portalToken) &&
        Objects.equals(this.processLockedUseraccountsTimeoutPeriod, controllerProperties.processLockedUseraccountsTimeoutPeriod) &&
        Objects.equals(this.processPkiProfileTimeoutPeriod, controllerProperties.processPkiProfileTimeoutPeriod) &&
        Objects.equals(this.queryHostFail, controllerProperties.queryHostFail) &&
        Objects.equals(this.safenetHsmVersion, controllerProperties.safenetHsmVersion) &&
        Objects.equals(this.seCreateTimeout, controllerProperties.seCreateTimeout) &&
        Objects.equals(this.seFailoverAttemptInterval, controllerProperties.seFailoverAttemptInterval) &&
        Objects.equals(this.seFromMarketplace, controllerProperties.seFromMarketplace) &&
        Objects.equals(this.seOfflineDel, controllerProperties.seOfflineDel) &&
        Objects.equals(this.seSpawnRetryInterval, controllerProperties.seSpawnRetryInterval) &&
        Objects.equals(this.seVnicCooldown, controllerProperties.seVnicCooldown) &&
        Objects.equals(this.secureChannelCleanupTimeout, controllerProperties.secureChannelCleanupTimeout) &&
        Objects.equals(this.secureChannelControllerTokenTimeout, controllerProperties.secureChannelControllerTokenTimeout) &&
        Objects.equals(this.secureChannelSeTokenTimeout, controllerProperties.secureChannelSeTokenTimeout) &&
        Objects.equals(this.seupgradeCopyPoolSize, controllerProperties.seupgradeCopyPoolSize) &&
        Objects.equals(this.seupgradeFabricPoolSize, controllerProperties.seupgradeFabricPoolSize) &&
        Objects.equals(this.seupgradeSegroupMinDeadTimeout, controllerProperties.seupgradeSegroupMinDeadTimeout) &&
        Objects.equals(this.sharedSslCertificates, controllerProperties.sharedSslCertificates) &&
        Objects.equals(this.sslCertificateExpiryWarningDays, controllerProperties.sslCertificateExpiryWarningDays) &&
        Objects.equals(this.unresponsiveSeReboot, controllerProperties.unresponsiveSeReboot) &&
        Objects.equals(this.upgradeDnsTtl, controllerProperties.upgradeDnsTtl) &&
        Objects.equals(this.upgradeLeaseTime, controllerProperties.upgradeLeaseTime) &&
        Objects.equals(this.url, controllerProperties.url) &&
        Objects.equals(this.uuid, controllerProperties.uuid) &&
        Objects.equals(this.vnicOpFailTime, controllerProperties.vnicOpFailTime) &&
        Objects.equals(this.vsApicScaleoutTimeout, controllerProperties.vsApicScaleoutTimeout) &&
        Objects.equals(this.vsAwaitingSeTimeout, controllerProperties.vsAwaitingSeTimeout) &&
        Objects.equals(this.vsKeyRotatePeriod, controllerProperties.vsKeyRotatePeriod) &&
        Objects.equals(this.vsScaleoutReadyCheckInterval, controllerProperties.vsScaleoutReadyCheckInterval) &&
        Objects.equals(this.vsSeAttachIpFail, controllerProperties.vsSeAttachIpFail) &&
        Objects.equals(this.vsSeBootupFail, controllerProperties.vsSeBootupFail) &&
        Objects.equals(this.vsSeCreateFail, controllerProperties.vsSeCreateFail) &&
        Objects.equals(this.vsSePingFail, controllerProperties.vsSePingFail) &&
        Objects.equals(this.vsSeVnicFail, controllerProperties.vsSeVnicFail) &&
        Objects.equals(this.vsSeVnicIpFail, controllerProperties.vsSeVnicIpFail) &&
        Objects.equals(this.warmstartSeReconnectWaitTime, controllerProperties.warmstartSeReconnectWaitTime) &&
        Objects.equals(this.warmstartVsResyncWaitTime, controllerProperties.warmstartVsResyncWaitTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, allowAdminNetworkUpdates, allowIpForwarding, allowUnauthenticatedApis, allowUnauthenticatedNodes, apiIdleTimeout, apiPerfLoggingThreshold, appviewxCompatMode, attachIpRetryInterval, attachIpRetryLimit, bmUseAnsible, cleanupExpiredAuthtokenTimeoutPeriod, cleanupSessionsTimeoutPeriod, cloudReconcile, clusterIpGratuitousArpPeriod, consistencyCheckTimeoutPeriod, crashedSeReboot, deadSeDetectionTimer, defaultMinimumApiTimeout, dnsRefreshPeriod, dummy, enableApiSharding, enableMemoryBalancer, fatalErrorLeaseTime, maxDeadSeInGrp, maxPcapPerTenant, maxSeSpawnIntervalDelay, maxSeqAttachIpFailures, maxSeqVnicFailures, permissionScopedSharedAdminNetworks, persistenceKeyRotatePeriod, portalRequestBurstLimit, portalRequestRateLimit, portalToken, processLockedUseraccountsTimeoutPeriod, processPkiProfileTimeoutPeriod, queryHostFail, safenetHsmVersion, seCreateTimeout, seFailoverAttemptInterval, seFromMarketplace, seOfflineDel, seSpawnRetryInterval, seVnicCooldown, secureChannelCleanupTimeout, secureChannelControllerTokenTimeout, secureChannelSeTokenTimeout, seupgradeCopyPoolSize, seupgradeFabricPoolSize, seupgradeSegroupMinDeadTimeout, sharedSslCertificates, sslCertificateExpiryWarningDays, unresponsiveSeReboot, upgradeDnsTtl, upgradeLeaseTime, url, uuid, vnicOpFailTime, vsApicScaleoutTimeout, vsAwaitingSeTimeout, vsKeyRotatePeriod, vsScaleoutReadyCheckInterval, vsSeAttachIpFail, vsSeBootupFail, vsSeCreateFail, vsSePingFail, vsSeVnicFail, vsSeVnicIpFail, warmstartSeReconnectWaitTime, warmstartVsResyncWaitTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerProperties {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    allowAdminNetworkUpdates: ").append(toIndentedString(allowAdminNetworkUpdates)).append("\n");
    sb.append("    allowIpForwarding: ").append(toIndentedString(allowIpForwarding)).append("\n");
    sb.append("    allowUnauthenticatedApis: ").append(toIndentedString(allowUnauthenticatedApis)).append("\n");
    sb.append("    allowUnauthenticatedNodes: ").append(toIndentedString(allowUnauthenticatedNodes)).append("\n");
    sb.append("    apiIdleTimeout: ").append(toIndentedString(apiIdleTimeout)).append("\n");
    sb.append("    apiPerfLoggingThreshold: ").append(toIndentedString(apiPerfLoggingThreshold)).append("\n");
    sb.append("    appviewxCompatMode: ").append(toIndentedString(appviewxCompatMode)).append("\n");
    sb.append("    attachIpRetryInterval: ").append(toIndentedString(attachIpRetryInterval)).append("\n");
    sb.append("    attachIpRetryLimit: ").append(toIndentedString(attachIpRetryLimit)).append("\n");
    sb.append("    bmUseAnsible: ").append(toIndentedString(bmUseAnsible)).append("\n");
    sb.append("    cleanupExpiredAuthtokenTimeoutPeriod: ").append(toIndentedString(cleanupExpiredAuthtokenTimeoutPeriod)).append("\n");
    sb.append("    cleanupSessionsTimeoutPeriod: ").append(toIndentedString(cleanupSessionsTimeoutPeriod)).append("\n");
    sb.append("    cloudReconcile: ").append(toIndentedString(cloudReconcile)).append("\n");
    sb.append("    clusterIpGratuitousArpPeriod: ").append(toIndentedString(clusterIpGratuitousArpPeriod)).append("\n");
    sb.append("    consistencyCheckTimeoutPeriod: ").append(toIndentedString(consistencyCheckTimeoutPeriod)).append("\n");
    sb.append("    crashedSeReboot: ").append(toIndentedString(crashedSeReboot)).append("\n");
    sb.append("    deadSeDetectionTimer: ").append(toIndentedString(deadSeDetectionTimer)).append("\n");
    sb.append("    defaultMinimumApiTimeout: ").append(toIndentedString(defaultMinimumApiTimeout)).append("\n");
    sb.append("    dnsRefreshPeriod: ").append(toIndentedString(dnsRefreshPeriod)).append("\n");
    sb.append("    dummy: ").append(toIndentedString(dummy)).append("\n");
    sb.append("    enableApiSharding: ").append(toIndentedString(enableApiSharding)).append("\n");
    sb.append("    enableMemoryBalancer: ").append(toIndentedString(enableMemoryBalancer)).append("\n");
    sb.append("    fatalErrorLeaseTime: ").append(toIndentedString(fatalErrorLeaseTime)).append("\n");
    sb.append("    maxDeadSeInGrp: ").append(toIndentedString(maxDeadSeInGrp)).append("\n");
    sb.append("    maxPcapPerTenant: ").append(toIndentedString(maxPcapPerTenant)).append("\n");
    sb.append("    maxSeSpawnIntervalDelay: ").append(toIndentedString(maxSeSpawnIntervalDelay)).append("\n");
    sb.append("    maxSeqAttachIpFailures: ").append(toIndentedString(maxSeqAttachIpFailures)).append("\n");
    sb.append("    maxSeqVnicFailures: ").append(toIndentedString(maxSeqVnicFailures)).append("\n");
    sb.append("    permissionScopedSharedAdminNetworks: ").append(toIndentedString(permissionScopedSharedAdminNetworks)).append("\n");
    sb.append("    persistenceKeyRotatePeriod: ").append(toIndentedString(persistenceKeyRotatePeriod)).append("\n");
    sb.append("    portalRequestBurstLimit: ").append(toIndentedString(portalRequestBurstLimit)).append("\n");
    sb.append("    portalRequestRateLimit: ").append(toIndentedString(portalRequestRateLimit)).append("\n");
    sb.append("    portalToken: ").append(toIndentedString(portalToken)).append("\n");
    sb.append("    processLockedUseraccountsTimeoutPeriod: ").append(toIndentedString(processLockedUseraccountsTimeoutPeriod)).append("\n");
    sb.append("    processPkiProfileTimeoutPeriod: ").append(toIndentedString(processPkiProfileTimeoutPeriod)).append("\n");
    sb.append("    queryHostFail: ").append(toIndentedString(queryHostFail)).append("\n");
    sb.append("    safenetHsmVersion: ").append(toIndentedString(safenetHsmVersion)).append("\n");
    sb.append("    seCreateTimeout: ").append(toIndentedString(seCreateTimeout)).append("\n");
    sb.append("    seFailoverAttemptInterval: ").append(toIndentedString(seFailoverAttemptInterval)).append("\n");
    sb.append("    seFromMarketplace: ").append(toIndentedString(seFromMarketplace)).append("\n");
    sb.append("    seOfflineDel: ").append(toIndentedString(seOfflineDel)).append("\n");
    sb.append("    seSpawnRetryInterval: ").append(toIndentedString(seSpawnRetryInterval)).append("\n");
    sb.append("    seVnicCooldown: ").append(toIndentedString(seVnicCooldown)).append("\n");
    sb.append("    secureChannelCleanupTimeout: ").append(toIndentedString(secureChannelCleanupTimeout)).append("\n");
    sb.append("    secureChannelControllerTokenTimeout: ").append(toIndentedString(secureChannelControllerTokenTimeout)).append("\n");
    sb.append("    secureChannelSeTokenTimeout: ").append(toIndentedString(secureChannelSeTokenTimeout)).append("\n");
    sb.append("    seupgradeCopyPoolSize: ").append(toIndentedString(seupgradeCopyPoolSize)).append("\n");
    sb.append("    seupgradeFabricPoolSize: ").append(toIndentedString(seupgradeFabricPoolSize)).append("\n");
    sb.append("    seupgradeSegroupMinDeadTimeout: ").append(toIndentedString(seupgradeSegroupMinDeadTimeout)).append("\n");
    sb.append("    sharedSslCertificates: ").append(toIndentedString(sharedSslCertificates)).append("\n");
    sb.append("    sslCertificateExpiryWarningDays: ").append(toIndentedString(sslCertificateExpiryWarningDays)).append("\n");
    sb.append("    unresponsiveSeReboot: ").append(toIndentedString(unresponsiveSeReboot)).append("\n");
    sb.append("    upgradeDnsTtl: ").append(toIndentedString(upgradeDnsTtl)).append("\n");
    sb.append("    upgradeLeaseTime: ").append(toIndentedString(upgradeLeaseTime)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vnicOpFailTime: ").append(toIndentedString(vnicOpFailTime)).append("\n");
    sb.append("    vsApicScaleoutTimeout: ").append(toIndentedString(vsApicScaleoutTimeout)).append("\n");
    sb.append("    vsAwaitingSeTimeout: ").append(toIndentedString(vsAwaitingSeTimeout)).append("\n");
    sb.append("    vsKeyRotatePeriod: ").append(toIndentedString(vsKeyRotatePeriod)).append("\n");
    sb.append("    vsScaleoutReadyCheckInterval: ").append(toIndentedString(vsScaleoutReadyCheckInterval)).append("\n");
    sb.append("    vsSeAttachIpFail: ").append(toIndentedString(vsSeAttachIpFail)).append("\n");
    sb.append("    vsSeBootupFail: ").append(toIndentedString(vsSeBootupFail)).append("\n");
    sb.append("    vsSeCreateFail: ").append(toIndentedString(vsSeCreateFail)).append("\n");
    sb.append("    vsSePingFail: ").append(toIndentedString(vsSePingFail)).append("\n");
    sb.append("    vsSeVnicFail: ").append(toIndentedString(vsSeVnicFail)).append("\n");
    sb.append("    vsSeVnicIpFail: ").append(toIndentedString(vsSeVnicIpFail)).append("\n");
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

