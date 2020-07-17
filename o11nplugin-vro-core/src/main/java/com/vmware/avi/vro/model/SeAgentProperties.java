package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SeAgentStateCacheProperties;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SeAgentProperties is a POJO class extends AviRestResource that used for creating
 * SeAgentProperties.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeAgentProperties")
@VsoFinder(name = Constants.FINDER_VRO_SEAGENTPROPERTIES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeAgentProperties extends AviRestResource {
  @JsonProperty("controller_echo_miss_aggressive_limit")
  @JsonInclude(Include.NON_NULL)
  private Integer controllerEchoMissAggressiveLimit = 2;

  @JsonProperty("controller_echo_miss_limit")
  @JsonInclude(Include.NON_NULL)
  private Integer controllerEchoMissLimit = 4;

  @JsonProperty("controller_echo_rpc_aggressive_timeout")
  @JsonInclude(Include.NON_NULL)
  private Integer controllerEchoRpcAggressiveTimeout = 2000;

  @JsonProperty("controller_echo_rpc_timeout")
  @JsonInclude(Include.NON_NULL)
  private Integer controllerEchoRpcTimeout = 2000;

  @JsonProperty("controller_heartbeat_miss_limit")
  @JsonInclude(Include.NON_NULL)
  private Integer controllerHeartbeatMissLimit = 6;

  @JsonProperty("controller_heartbeat_timeout_sec")
  @JsonInclude(Include.NON_NULL)
  private Integer controllerHeartbeatTimeoutSec = 12;

  @JsonProperty("controller_registration_timeout_sec")
  @JsonInclude(Include.NON_NULL)
  private Integer controllerRegistrationTimeoutSec = 30;

  @JsonProperty("controller_rpc_timeout")
  @JsonInclude(Include.NON_NULL)
  private Integer controllerRpcTimeout = 10;

  @JsonProperty("cpustats_interval")
  @JsonInclude(Include.NON_NULL)
  private Integer cpustatsInterval = 5;

  @JsonProperty("ctrl_reg_pending_max_wait_time")
  @JsonInclude(Include.NON_NULL)
  private Integer ctrlRegPendingMaxWaitTime = 150;

  @JsonProperty("debug_mode")
  @JsonInclude(Include.NON_NULL)
  private Boolean debugMode = false;

  @JsonProperty("dp_aggressive_deq_interval_msec")
  @JsonInclude(Include.NON_NULL)
  private Integer dpAggressiveDeqIntervalMsec = 1;

  @JsonProperty("dp_aggressive_enq_interval_msec")
  @JsonInclude(Include.NON_NULL)
  private Integer dpAggressiveEnqIntervalMsec = 1;

  @JsonProperty("dp_batch_size")
  @JsonInclude(Include.NON_NULL)
  private Integer dpBatchSize = 100;

  @JsonProperty("dp_deq_interval_msec")
  @JsonInclude(Include.NON_NULL)
  private Integer dpDeqIntervalMsec = 20;

  @JsonProperty("dp_enq_interval_msec")
  @JsonInclude(Include.NON_NULL)
  private Integer dpEnqIntervalMsec = 20;

  @JsonProperty("dp_max_wait_rsp_time_sec")
  @JsonInclude(Include.NON_NULL)
  private Integer dpMaxWaitRspTimeSec = 60;

  @JsonProperty("dp_reg_pending_max_wait_time")
  @JsonInclude(Include.NON_NULL)
  private Integer dpRegPendingMaxWaitTime = 75;

  @JsonProperty("headless_timeout_sec")
  @JsonInclude(Include.NON_NULL)
  private Integer headlessTimeoutSec = 0;

  @JsonProperty("ignore_docker_mac_change")
  @JsonInclude(Include.NON_NULL)
  private Boolean ignoreDockerMacChange = true;

  @JsonProperty("ns_helper_deq_interval_msec")
  @JsonInclude(Include.NON_NULL)
  private Integer nsHelperDeqIntervalMsec = 20;

  @JsonProperty("sdb_flush_interval")
  @JsonInclude(Include.NON_NULL)
  private Integer sdbFlushInterval = 100;

  @JsonProperty("sdb_pipeline_size")
  @JsonInclude(Include.NON_NULL)
  private Integer sdbPipelineSize = 100;

  @JsonProperty("sdb_scan_count")
  @JsonInclude(Include.NON_NULL)
  private Integer sdbScanCount = 1000;

  @JsonProperty("se_grp_change_disruptive")
  @JsonInclude(Include.NON_NULL)
  private Boolean seGrpChangeDisruptive = true;

  @JsonProperty("seagent_statecache_properties")
  @JsonInclude(Include.NON_NULL)
  private SeAgentStateCacheProperties seagentStatecacheProperties = null;

  @JsonProperty("send_se_ready_timeout")
  @JsonInclude(Include.NON_NULL)
  private Integer sendSeReadyTimeout = 300;

  @JsonProperty("states_flush_interval")
  @JsonInclude(Include.NON_NULL)
  private Integer statesFlushInterval = 100;

  @JsonProperty("vnic_dhcp_ip_check_interval")
  @JsonInclude(Include.NON_NULL)
  private Integer vnicDhcpIpCheckInterval = 6;

  @JsonProperty("vnic_dhcp_ip_max_retries")
  @JsonInclude(Include.NON_NULL)
  private Integer vnicDhcpIpMaxRetries = 10;

  @JsonProperty("vnic_ip_delete_interval")
  @JsonInclude(Include.NON_NULL)
  private Integer vnicIpDeleteInterval = 5;

  @JsonProperty("vnic_probe_interval")
  @JsonInclude(Include.NON_NULL)
  private Integer vnicProbeInterval = 5;

  @JsonProperty("vnic_rpc_retry_interval")
  @JsonInclude(Include.NON_NULL)
  private Integer vnicRpcRetryInterval = 5;

  @JsonProperty("vnicdb_cmd_history_size")
  @JsonInclude(Include.NON_NULL)
  private Integer vnicdbCmdHistorySize = 256;



  /**
   * This is the getter method this will return the attribute value.
   * Aggressive count of hb misses for se health check failure.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return controllerEchoMissAggressiveLimit
   */
  @VsoMethod
  public Integer getControllerEchoMissAggressiveLimit() {
    return controllerEchoMissAggressiveLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Aggressive count of hb misses for se health check failure.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param controllerEchoMissAggressiveLimit set the controllerEchoMissAggressiveLimit.
   */
  @VsoMethod
  public void setControllerEchoMissAggressiveLimit(Integer  controllerEchoMissAggressiveLimit) {
    this.controllerEchoMissAggressiveLimit = controllerEchoMissAggressiveLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Count of hb misses for se health check failure.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @return controllerEchoMissLimit
   */
  @VsoMethod
  public Integer getControllerEchoMissLimit() {
    return controllerEchoMissLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Count of hb misses for se health check failure.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @param controllerEchoMissLimit set the controllerEchoMissLimit.
   */
  @VsoMethod
  public void setControllerEchoMissLimit(Integer  controllerEchoMissLimit) {
    this.controllerEchoMissLimit = controllerEchoMissLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Aggressive timeout used for se health check.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @return controllerEchoRpcAggressiveTimeout
   */
  @VsoMethod
  public Integer getControllerEchoRpcAggressiveTimeout() {
    return controllerEchoRpcAggressiveTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Aggressive timeout used for se health check.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @param controllerEchoRpcAggressiveTimeout set the controllerEchoRpcAggressiveTimeout.
   */
  @VsoMethod
  public void setControllerEchoRpcAggressiveTimeout(Integer  controllerEchoRpcAggressiveTimeout) {
    this.controllerEchoRpcAggressiveTimeout = controllerEchoRpcAggressiveTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timeout used for se health check.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @return controllerEchoRpcTimeout
   */
  @VsoMethod
  public Integer getControllerEchoRpcTimeout() {
    return controllerEchoRpcTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Timeout used for se health check.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @param controllerEchoRpcTimeout set the controllerEchoRpcTimeout.
   */
  @VsoMethod
  public void setControllerEchoRpcTimeout(Integer  controllerEchoRpcTimeout) {
    this.controllerEchoRpcTimeout = controllerEchoRpcTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed values are 1-20.
   * Default value when not specified in API or module is interpreted by Avi Controller as 6.
   * @return controllerHeartbeatMissLimit
   */
  @VsoMethod
  public Integer getControllerHeartbeatMissLimit() {
    return controllerHeartbeatMissLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed values are 1-20.
   * Default value when not specified in API or module is interpreted by Avi Controller as 6.
   * @param controllerHeartbeatMissLimit set the controllerHeartbeatMissLimit.
   */
  @VsoMethod
  public void setControllerHeartbeatMissLimit(Integer  controllerHeartbeatMissLimit) {
    this.controllerHeartbeatMissLimit = controllerHeartbeatMissLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed values are 1-60.
   * Default value when not specified in API or module is interpreted by Avi Controller as 12.
   * @return controllerHeartbeatTimeoutSec
   */
  @VsoMethod
  public Integer getControllerHeartbeatTimeoutSec() {
    return controllerHeartbeatTimeoutSec;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed values are 1-60.
   * Default value when not specified in API or module is interpreted by Avi Controller as 12.
   * @param controllerHeartbeatTimeoutSec set the controllerHeartbeatTimeoutSec.
   */
  @VsoMethod
  public void setControllerHeartbeatTimeoutSec(Integer  controllerHeartbeatTimeoutSec) {
    this.controllerHeartbeatTimeoutSec = controllerHeartbeatTimeoutSec;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property controller_registration_timeout_sec of obj type seagentproperties field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @return controllerRegistrationTimeoutSec
   */
  @VsoMethod
  public Integer getControllerRegistrationTimeoutSec() {
    return controllerRegistrationTimeoutSec;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property controller_registration_timeout_sec of obj type seagentproperties field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @param controllerRegistrationTimeoutSec set the controllerRegistrationTimeoutSec.
   */
  @VsoMethod
  public void setControllerRegistrationTimeoutSec(Integer  controllerRegistrationTimeoutSec) {
    this.controllerRegistrationTimeoutSec = controllerRegistrationTimeoutSec;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property controller_rpc_timeout of obj type seagentproperties field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return controllerRpcTimeout
   */
  @VsoMethod
  public Integer getControllerRpcTimeout() {
    return controllerRpcTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property controller_rpc_timeout of obj type seagentproperties field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param controllerRpcTimeout set the controllerRpcTimeout.
   */
  @VsoMethod
  public void setControllerRpcTimeout(Integer  controllerRpcTimeout) {
    this.controllerRpcTimeout = controllerRpcTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cpustats_interval of obj type seagentproperties field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return cpustatsInterval
   */
  @VsoMethod
  public Integer getCpustatsInterval() {
    return cpustatsInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cpustats_interval of obj type seagentproperties field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param cpustatsInterval set the cpustatsInterval.
   */
  @VsoMethod
  public void setCpustatsInterval(Integer  cpustatsInterval) {
    this.cpustatsInterval = cpustatsInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max time to wait for ctrl registration before assert.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 150.
   * @return ctrlRegPendingMaxWaitTime
   */
  @VsoMethod
  public Integer getCtrlRegPendingMaxWaitTime() {
    return ctrlRegPendingMaxWaitTime;
  }

  /**
   * This is the setter method to the attribute.
   * Max time to wait for ctrl registration before assert.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 150.
   * @param ctrlRegPendingMaxWaitTime set the ctrlRegPendingMaxWaitTime.
   */
  @VsoMethod
  public void setCtrlRegPendingMaxWaitTime(Integer  ctrlRegPendingMaxWaitTime) {
    this.ctrlRegPendingMaxWaitTime = ctrlRegPendingMaxWaitTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property debug_mode of obj type seagentproperties field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return debugMode
   */
  @VsoMethod
  public Boolean getDebugMode() {
    return debugMode;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property debug_mode of obj type seagentproperties field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param debugMode set the debugMode.
   */
  @VsoMethod
  public void setDebugMode(Boolean  debugMode) {
    this.debugMode = debugMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return dpAggressiveDeqIntervalMsec
   */
  @VsoMethod
  public Integer getDpAggressiveDeqIntervalMsec() {
    return dpAggressiveDeqIntervalMsec;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param dpAggressiveDeqIntervalMsec set the dpAggressiveDeqIntervalMsec.
   */
  @VsoMethod
  public void setDpAggressiveDeqIntervalMsec(Integer  dpAggressiveDeqIntervalMsec) {
    this.dpAggressiveDeqIntervalMsec = dpAggressiveDeqIntervalMsec;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return dpAggressiveEnqIntervalMsec
   */
  @VsoMethod
  public Integer getDpAggressiveEnqIntervalMsec() {
    return dpAggressiveEnqIntervalMsec;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param dpAggressiveEnqIntervalMsec set the dpAggressiveEnqIntervalMsec.
   */
  @VsoMethod
  public void setDpAggressiveEnqIntervalMsec(Integer  dpAggressiveEnqIntervalMsec) {
    this.dpAggressiveEnqIntervalMsec = dpAggressiveEnqIntervalMsec;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property dp_batch_size of obj type seagentproperties field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return dpBatchSize
   */
  @VsoMethod
  public Integer getDpBatchSize() {
    return dpBatchSize;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property dp_batch_size of obj type seagentproperties field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param dpBatchSize set the dpBatchSize.
   */
  @VsoMethod
  public void setDpBatchSize(Integer  dpBatchSize) {
    this.dpBatchSize = dpBatchSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @return dpDeqIntervalMsec
   */
  @VsoMethod
  public Integer getDpDeqIntervalMsec() {
    return dpDeqIntervalMsec;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @param dpDeqIntervalMsec set the dpDeqIntervalMsec.
   */
  @VsoMethod
  public void setDpDeqIntervalMsec(Integer  dpDeqIntervalMsec) {
    this.dpDeqIntervalMsec = dpDeqIntervalMsec;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @return dpEnqIntervalMsec
   */
  @VsoMethod
  public Integer getDpEnqIntervalMsec() {
    return dpEnqIntervalMsec;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @param dpEnqIntervalMsec set the dpEnqIntervalMsec.
   */
  @VsoMethod
  public void setDpEnqIntervalMsec(Integer  dpEnqIntervalMsec) {
    this.dpEnqIntervalMsec = dpEnqIntervalMsec;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property dp_max_wait_rsp_time_sec of obj type seagentproperties field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return dpMaxWaitRspTimeSec
   */
  @VsoMethod
  public Integer getDpMaxWaitRspTimeSec() {
    return dpMaxWaitRspTimeSec;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property dp_max_wait_rsp_time_sec of obj type seagentproperties field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param dpMaxWaitRspTimeSec set the dpMaxWaitRspTimeSec.
   */
  @VsoMethod
  public void setDpMaxWaitRspTimeSec(Integer  dpMaxWaitRspTimeSec) {
    this.dpMaxWaitRspTimeSec = dpMaxWaitRspTimeSec;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max time to wait for dp registration before assert.
   * Default value when not specified in API or module is interpreted by Avi Controller as 75.
   * @return dpRegPendingMaxWaitTime
   */
  @VsoMethod
  public Integer getDpRegPendingMaxWaitTime() {
    return dpRegPendingMaxWaitTime;
  }

  /**
   * This is the setter method to the attribute.
   * Max time to wait for dp registration before assert.
   * Default value when not specified in API or module is interpreted by Avi Controller as 75.
   * @param dpRegPendingMaxWaitTime set the dpRegPendingMaxWaitTime.
   */
  @VsoMethod
  public void setDpRegPendingMaxWaitTime(Integer  dpRegPendingMaxWaitTime) {
    this.dpRegPendingMaxWaitTime = dpRegPendingMaxWaitTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property headless_timeout_sec of obj type seagentproperties field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return headlessTimeoutSec
   */
  @VsoMethod
  public Integer getHeadlessTimeoutSec() {
    return headlessTimeoutSec;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property headless_timeout_sec of obj type seagentproperties field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param headlessTimeoutSec set the headlessTimeoutSec.
   */
  @VsoMethod
  public void setHeadlessTimeoutSec(Integer  headlessTimeoutSec) {
    this.headlessTimeoutSec = headlessTimeoutSec;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property ignore_docker_mac_change of obj type seagentproperties field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return ignoreDockerMacChange
   */
  @VsoMethod
  public Boolean getIgnoreDockerMacChange() {
    return ignoreDockerMacChange;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property ignore_docker_mac_change of obj type seagentproperties field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param ignoreDockerMacChange set the ignoreDockerMacChange.
   */
  @VsoMethod
  public void setIgnoreDockerMacChange(Boolean  ignoreDockerMacChange) {
    this.ignoreDockerMacChange = ignoreDockerMacChange;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dequeue interval for receive queue from ns helper.
   * Allowed values are 1-1000.
   * Field introduced in 17.2.13, 18.1.3, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @return nsHelperDeqIntervalMsec
   */
  @VsoMethod
  public Integer getNsHelperDeqIntervalMsec() {
    return nsHelperDeqIntervalMsec;
  }

  /**
   * This is the setter method to the attribute.
   * Dequeue interval for receive queue from ns helper.
   * Allowed values are 1-1000.
   * Field introduced in 17.2.13, 18.1.3, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @param nsHelperDeqIntervalMsec set the nsHelperDeqIntervalMsec.
   */
  @VsoMethod
  public void setNsHelperDeqIntervalMsec(Integer  nsHelperDeqIntervalMsec) {
    this.nsHelperDeqIntervalMsec = nsHelperDeqIntervalMsec;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sdb pipeline flush interval.
   * Allowed values are 1-10000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return sdbFlushInterval
   */
  @VsoMethod
  public Integer getSdbFlushInterval() {
    return sdbFlushInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Sdb pipeline flush interval.
   * Allowed values are 1-10000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param sdbFlushInterval set the sdbFlushInterval.
   */
  @VsoMethod
  public void setSdbFlushInterval(Integer  sdbFlushInterval) {
    this.sdbFlushInterval = sdbFlushInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sdb pipeline size.
   * Allowed values are 1-10000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return sdbPipelineSize
   */
  @VsoMethod
  public Integer getSdbPipelineSize() {
    return sdbPipelineSize;
  }

  /**
   * This is the setter method to the attribute.
   * Sdb pipeline size.
   * Allowed values are 1-10000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param sdbPipelineSize set the sdbPipelineSize.
   */
  @VsoMethod
  public void setSdbPipelineSize(Integer  sdbPipelineSize) {
    this.sdbPipelineSize = sdbPipelineSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sdb scan count.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @return sdbScanCount
   */
  @VsoMethod
  public Integer getSdbScanCount() {
    return sdbScanCount;
  }

  /**
   * This is the setter method to the attribute.
   * Sdb scan count.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @param sdbScanCount set the sdbScanCount.
   */
  @VsoMethod
  public void setSdbScanCount(Integer  sdbScanCount) {
    this.sdbScanCount = sdbScanCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Internal flag used to decide if se restart is needed,when the se-group is changed.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return seGrpChangeDisruptive
   */
  @VsoMethod
  public Boolean getSeGrpChangeDisruptive() {
    return seGrpChangeDisruptive;
  }

  /**
   * This is the setter method to the attribute.
   * Internal flag used to decide if se restart is needed,when the se-group is changed.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param seGrpChangeDisruptive set the seGrpChangeDisruptive.
   */
  @VsoMethod
  public void setSeGrpChangeDisruptive(Boolean  seGrpChangeDisruptive) {
    this.seGrpChangeDisruptive = seGrpChangeDisruptive;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Seagent properties for state cache functionality.
   * Field introduced in 18.2.5.
   * @return seagentStatecacheProperties
   */
  @VsoMethod
  public SeAgentStateCacheProperties getSeagentStatecacheProperties() {
    return seagentStatecacheProperties;
  }

  /**
   * This is the setter method to the attribute.
   * Seagent properties for state cache functionality.
   * Field introduced in 18.2.5.
   * @param seagentStatecacheProperties set the seagentStatecacheProperties.
   */
  @VsoMethod
  public void setSeagentStatecacheProperties(SeAgentStateCacheProperties seagentStatecacheProperties) {
    this.seagentStatecacheProperties = seagentStatecacheProperties;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timeout for sending se_ready without ns helper registration completion.
   * Allowed values are 10-600.
   * Field introduced in 17.2.13, 18.1.3, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return sendSeReadyTimeout
   */
  @VsoMethod
  public Integer getSendSeReadyTimeout() {
    return sendSeReadyTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Timeout for sending se_ready without ns helper registration completion.
   * Allowed values are 10-600.
   * Field introduced in 17.2.13, 18.1.3, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param sendSeReadyTimeout set the sendSeReadyTimeout.
   */
  @VsoMethod
  public void setSendSeReadyTimeout(Integer  sendSeReadyTimeout) {
    this.sendSeReadyTimeout = sendSeReadyTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Interval for update of operational states to controller.
   * Allowed values are 1-10000.
   * Field introduced in 18.2.1, 17.2.14, 18.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return statesFlushInterval
   */
  @VsoMethod
  public Integer getStatesFlushInterval() {
    return statesFlushInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Interval for update of operational states to controller.
   * Allowed values are 1-10000.
   * Field introduced in 18.2.1, 17.2.14, 18.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param statesFlushInterval set the statesFlushInterval.
   */
  @VsoMethod
  public void setStatesFlushInterval(Integer  statesFlushInterval) {
    this.statesFlushInterval = statesFlushInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dhcp ip check interval.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 6.
   * @return vnicDhcpIpCheckInterval
   */
  @VsoMethod
  public Integer getVnicDhcpIpCheckInterval() {
    return vnicDhcpIpCheckInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Dhcp ip check interval.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 6.
   * @param vnicDhcpIpCheckInterval set the vnicDhcpIpCheckInterval.
   */
  @VsoMethod
  public void setVnicDhcpIpCheckInterval(Integer  vnicDhcpIpCheckInterval) {
    this.vnicDhcpIpCheckInterval = vnicDhcpIpCheckInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dhcp ip max retries.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return vnicDhcpIpMaxRetries
   */
  @VsoMethod
  public Integer getVnicDhcpIpMaxRetries() {
    return vnicDhcpIpMaxRetries;
  }

  /**
   * This is the setter method to the attribute.
   * Dhcp ip max retries.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param vnicDhcpIpMaxRetries set the vnicDhcpIpMaxRetries.
   */
  @VsoMethod
  public void setVnicDhcpIpMaxRetries(Integer  vnicDhcpIpMaxRetries) {
    this.vnicDhcpIpMaxRetries = vnicDhcpIpMaxRetries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Wait interval before deleting ip.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return vnicIpDeleteInterval
   */
  @VsoMethod
  public Integer getVnicIpDeleteInterval() {
    return vnicIpDeleteInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Wait interval before deleting ip.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param vnicIpDeleteInterval set the vnicIpDeleteInterval.
   */
  @VsoMethod
  public void setVnicIpDeleteInterval(Integer  vnicIpDeleteInterval) {
    this.vnicIpDeleteInterval = vnicIpDeleteInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Probe vnic interval.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return vnicProbeInterval
   */
  @VsoMethod
  public Integer getVnicProbeInterval() {
    return vnicProbeInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Probe vnic interval.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param vnicProbeInterval set the vnicProbeInterval.
   */
  @VsoMethod
  public void setVnicProbeInterval(Integer  vnicProbeInterval) {
    this.vnicProbeInterval = vnicProbeInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time interval for retrying the failed vnic rpc requests.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return vnicRpcRetryInterval
   */
  @VsoMethod
  public Integer getVnicRpcRetryInterval() {
    return vnicRpcRetryInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Time interval for retrying the failed vnic rpc requests.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param vnicRpcRetryInterval set the vnicRpcRetryInterval.
   */
  @VsoMethod
  public void setVnicRpcRetryInterval(Integer  vnicRpcRetryInterval) {
    this.vnicRpcRetryInterval = vnicRpcRetryInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Size of vnicdb command history.
   * Allowed values are 0-65535.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 256.
   * @return vnicdbCmdHistorySize
   */
  @VsoMethod
  public Integer getVnicdbCmdHistorySize() {
    return vnicdbCmdHistorySize;
  }

  /**
   * This is the setter method to the attribute.
   * Size of vnicdb command history.
   * Allowed values are 0-65535.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 256.
   * @param vnicdbCmdHistorySize set the vnicdbCmdHistorySize.
   */
  @VsoMethod
  public void setVnicdbCmdHistorySize(Integer  vnicdbCmdHistorySize) {
    this.vnicdbCmdHistorySize = vnicdbCmdHistorySize;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeAgentProperties objSeAgentProperties = (SeAgentProperties) o;
  return   Objects.equals(this.vnicRpcRetryInterval, objSeAgentProperties.vnicRpcRetryInterval)&&
  Objects.equals(this.dpEnqIntervalMsec, objSeAgentProperties.dpEnqIntervalMsec)&&
  Objects.equals(this.sdbScanCount, objSeAgentProperties.sdbScanCount)&&
  Objects.equals(this.dpRegPendingMaxWaitTime, objSeAgentProperties.dpRegPendingMaxWaitTime)&&
  Objects.equals(this.controllerEchoRpcAggressiveTimeout, objSeAgentProperties.controllerEchoRpcAggressiveTimeout)&&
  Objects.equals(this.statesFlushInterval, objSeAgentProperties.statesFlushInterval)&&
  Objects.equals(this.dpAggressiveEnqIntervalMsec, objSeAgentProperties.dpAggressiveEnqIntervalMsec)&&
  Objects.equals(this.nsHelperDeqIntervalMsec, objSeAgentProperties.nsHelperDeqIntervalMsec)&&
  Objects.equals(this.vnicIpDeleteInterval, objSeAgentProperties.vnicIpDeleteInterval)&&
  Objects.equals(this.dpMaxWaitRspTimeSec, objSeAgentProperties.dpMaxWaitRspTimeSec)&&
  Objects.equals(this.sendSeReadyTimeout, objSeAgentProperties.sendSeReadyTimeout)&&
  Objects.equals(this.seGrpChangeDisruptive, objSeAgentProperties.seGrpChangeDisruptive)&&
  Objects.equals(this.controllerRpcTimeout, objSeAgentProperties.controllerRpcTimeout)&&
  Objects.equals(this.headlessTimeoutSec, objSeAgentProperties.headlessTimeoutSec)&&
  Objects.equals(this.dpAggressiveDeqIntervalMsec, objSeAgentProperties.dpAggressiveDeqIntervalMsec)&&
  Objects.equals(this.controllerEchoRpcTimeout, objSeAgentProperties.controllerEchoRpcTimeout)&&
  Objects.equals(this.ignoreDockerMacChange, objSeAgentProperties.ignoreDockerMacChange)&&
  Objects.equals(this.sdbPipelineSize, objSeAgentProperties.sdbPipelineSize)&&
  Objects.equals(this.cpustatsInterval, objSeAgentProperties.cpustatsInterval)&&
  Objects.equals(this.dpBatchSize, objSeAgentProperties.dpBatchSize)&&
  Objects.equals(this.vnicdbCmdHistorySize, objSeAgentProperties.vnicdbCmdHistorySize)&&
  Objects.equals(this.vnicProbeInterval, objSeAgentProperties.vnicProbeInterval)&&
  Objects.equals(this.debugMode, objSeAgentProperties.debugMode)&&
  Objects.equals(this.vnicDhcpIpMaxRetries, objSeAgentProperties.vnicDhcpIpMaxRetries)&&
  Objects.equals(this.seagentStatecacheProperties, objSeAgentProperties.seagentStatecacheProperties)&&
  Objects.equals(this.dpDeqIntervalMsec, objSeAgentProperties.dpDeqIntervalMsec)&&
  Objects.equals(this.ctrlRegPendingMaxWaitTime, objSeAgentProperties.ctrlRegPendingMaxWaitTime)&&
  Objects.equals(this.controllerHeartbeatMissLimit, objSeAgentProperties.controllerHeartbeatMissLimit)&&
  Objects.equals(this.sdbFlushInterval, objSeAgentProperties.sdbFlushInterval)&&
  Objects.equals(this.controllerEchoMissAggressiveLimit, objSeAgentProperties.controllerEchoMissAggressiveLimit)&&
  Objects.equals(this.controllerHeartbeatTimeoutSec, objSeAgentProperties.controllerHeartbeatTimeoutSec)&&
  Objects.equals(this.controllerRegistrationTimeoutSec, objSeAgentProperties.controllerRegistrationTimeoutSec)&&
  Objects.equals(this.controllerEchoMissLimit, objSeAgentProperties.controllerEchoMissLimit)&&
  Objects.equals(this.vnicDhcpIpCheckInterval, objSeAgentProperties.vnicDhcpIpCheckInterval);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeAgentProperties {\n");
      sb.append("    controllerEchoMissAggressiveLimit: ").append(toIndentedString(controllerEchoMissAggressiveLimit)).append("\n");
        sb.append("    controllerEchoMissLimit: ").append(toIndentedString(controllerEchoMissLimit)).append("\n");
        sb.append("    controllerEchoRpcAggressiveTimeout: ").append(toIndentedString(controllerEchoRpcAggressiveTimeout)).append("\n");
        sb.append("    controllerEchoRpcTimeout: ").append(toIndentedString(controllerEchoRpcTimeout)).append("\n");
        sb.append("    controllerHeartbeatMissLimit: ").append(toIndentedString(controllerHeartbeatMissLimit)).append("\n");
        sb.append("    controllerHeartbeatTimeoutSec: ").append(toIndentedString(controllerHeartbeatTimeoutSec)).append("\n");
        sb.append("    controllerRegistrationTimeoutSec: ").append(toIndentedString(controllerRegistrationTimeoutSec)).append("\n");
        sb.append("    controllerRpcTimeout: ").append(toIndentedString(controllerRpcTimeout)).append("\n");
        sb.append("    cpustatsInterval: ").append(toIndentedString(cpustatsInterval)).append("\n");
        sb.append("    ctrlRegPendingMaxWaitTime: ").append(toIndentedString(ctrlRegPendingMaxWaitTime)).append("\n");
        sb.append("    debugMode: ").append(toIndentedString(debugMode)).append("\n");
        sb.append("    dpAggressiveDeqIntervalMsec: ").append(toIndentedString(dpAggressiveDeqIntervalMsec)).append("\n");
        sb.append("    dpAggressiveEnqIntervalMsec: ").append(toIndentedString(dpAggressiveEnqIntervalMsec)).append("\n");
        sb.append("    dpBatchSize: ").append(toIndentedString(dpBatchSize)).append("\n");
        sb.append("    dpDeqIntervalMsec: ").append(toIndentedString(dpDeqIntervalMsec)).append("\n");
        sb.append("    dpEnqIntervalMsec: ").append(toIndentedString(dpEnqIntervalMsec)).append("\n");
        sb.append("    dpMaxWaitRspTimeSec: ").append(toIndentedString(dpMaxWaitRspTimeSec)).append("\n");
        sb.append("    dpRegPendingMaxWaitTime: ").append(toIndentedString(dpRegPendingMaxWaitTime)).append("\n");
        sb.append("    headlessTimeoutSec: ").append(toIndentedString(headlessTimeoutSec)).append("\n");
        sb.append("    ignoreDockerMacChange: ").append(toIndentedString(ignoreDockerMacChange)).append("\n");
        sb.append("    nsHelperDeqIntervalMsec: ").append(toIndentedString(nsHelperDeqIntervalMsec)).append("\n");
        sb.append("    sdbFlushInterval: ").append(toIndentedString(sdbFlushInterval)).append("\n");
        sb.append("    sdbPipelineSize: ").append(toIndentedString(sdbPipelineSize)).append("\n");
        sb.append("    sdbScanCount: ").append(toIndentedString(sdbScanCount)).append("\n");
        sb.append("    seGrpChangeDisruptive: ").append(toIndentedString(seGrpChangeDisruptive)).append("\n");
        sb.append("    seagentStatecacheProperties: ").append(toIndentedString(seagentStatecacheProperties)).append("\n");
        sb.append("    sendSeReadyTimeout: ").append(toIndentedString(sendSeReadyTimeout)).append("\n");
        sb.append("    statesFlushInterval: ").append(toIndentedString(statesFlushInterval)).append("\n");
        sb.append("    vnicDhcpIpCheckInterval: ").append(toIndentedString(vnicDhcpIpCheckInterval)).append("\n");
        sb.append("    vnicDhcpIpMaxRetries: ").append(toIndentedString(vnicDhcpIpMaxRetries)).append("\n");
        sb.append("    vnicIpDeleteInterval: ").append(toIndentedString(vnicIpDeleteInterval)).append("\n");
        sb.append("    vnicProbeInterval: ").append(toIndentedString(vnicProbeInterval)).append("\n");
        sb.append("    vnicRpcRetryInterval: ").append(toIndentedString(vnicRpcRetryInterval)).append("\n");
        sb.append("    vnicdbCmdHistorySize: ").append(toIndentedString(vnicdbCmdHistorySize)).append("\n");
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

