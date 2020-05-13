package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SeAgentStateCacheProperties;
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
 * SeAgentProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SeAgentProperties")
@VsoFinder(name = Constants.FINDER_VRO_SEAGENTPROPERTIES, idAccessor = "getObjectID()")
@Service
public class SeAgentProperties extends AviRestResource  {
  @JsonProperty("controller_echo_miss_aggressive_limit")
  private Integer controllerEchoMissAggressiveLimit = 2;

  @JsonProperty("controller_echo_miss_limit")
  private Integer controllerEchoMissLimit = 4;

  @JsonProperty("controller_echo_rpc_aggressive_timeout")
  private Integer controllerEchoRpcAggressiveTimeout = 2000;

  @JsonProperty("controller_echo_rpc_timeout")
  private Integer controllerEchoRpcTimeout = 2000;

  @JsonProperty("controller_heartbeat_miss_limit")
  private Integer controllerHeartbeatMissLimit = 6;

  @JsonProperty("controller_heartbeat_timeout_sec")
  private Integer controllerHeartbeatTimeoutSec = 12;

  @JsonProperty("controller_registration_timeout_sec")
  private Integer controllerRegistrationTimeoutSec = 30;

  @JsonProperty("controller_rpc_timeout")
  private Integer controllerRpcTimeout = 10;

  @JsonProperty("cpustats_interval")
  private Integer cpustatsInterval = 5;

  @JsonProperty("ctrl_reg_pending_max_wait_time")
  private Integer ctrlRegPendingMaxWaitTime = 150;

  @JsonProperty("debug_mode")
  private Boolean debugMode = null;

  @JsonProperty("dp_aggressive_deq_interval_msec")
  private Integer dpAggressiveDeqIntervalMsec = 1;

  @JsonProperty("dp_aggressive_enq_interval_msec")
  private Integer dpAggressiveEnqIntervalMsec = 1;

  @JsonProperty("dp_batch_size")
  private Integer dpBatchSize = 100;

  @JsonProperty("dp_deq_interval_msec")
  private Integer dpDeqIntervalMsec = 20;

  @JsonProperty("dp_enq_interval_msec")
  private Integer dpEnqIntervalMsec = 20;

  @JsonProperty("dp_max_wait_rsp_time_sec")
  private Integer dpMaxWaitRspTimeSec = 60;

  @JsonProperty("dp_reg_pending_max_wait_time")
  private Integer dpRegPendingMaxWaitTime = 75;

  @JsonProperty("headless_timeout_sec")
  private Integer headlessTimeoutSec = null;

  @JsonProperty("ignore_docker_mac_change")
  private Boolean ignoreDockerMacChange = true;

  @JsonProperty("ns_helper_deq_interval_msec")
  private Integer nsHelperDeqIntervalMsec = 20;

  @JsonProperty("sdb_flush_interval")
  private Integer sdbFlushInterval = 100;

  @JsonProperty("sdb_pipeline_size")
  private Integer sdbPipelineSize = 100;

  @JsonProperty("sdb_scan_count")
  private Integer sdbScanCount = 1000;

  @JsonProperty("se_grp_change_disruptive")
  private Boolean seGrpChangeDisruptive = true;

  @JsonProperty("seagent_statecache_properties")
  private SeAgentStateCacheProperties seagentStatecacheProperties = null;

  @JsonProperty("send_se_ready_timeout")
  private Integer sendSeReadyTimeout = 300;

  @JsonProperty("states_flush_interval")
  private Integer statesFlushInterval = 100;

  @JsonProperty("vnic_dhcp_ip_check_interval")
  private Integer vnicDhcpIpCheckInterval = 6;

  @JsonProperty("vnic_dhcp_ip_max_retries")
  private Integer vnicDhcpIpMaxRetries = 10;

  @JsonProperty("vnic_ip_delete_interval")
  private Integer vnicIpDeleteInterval = 5;

  @JsonProperty("vnic_probe_interval")
  private Integer vnicProbeInterval = 5;

  @JsonProperty("vnic_rpc_retry_interval")
  private Integer vnicRpcRetryInterval = 5;

  @JsonProperty("vnicdb_cmd_history_size")
  private Integer vnicdbCmdHistorySize = 256;

  
  /**
   * Aggressive Count of HB misses for se health check failure. Allowed values are 1-1000.
   * @return controllerEchoMissAggressiveLimit
  **/
  @ApiModelProperty(value = "Aggressive Count of HB misses for se health check failure. Allowed values are 1-1000.")


 
  @VsoMethod  
  public Integer getControllerEchoMissAggressiveLimit() {
    return controllerEchoMissAggressiveLimit;
  }
    
  @VsoMethod
  public void setControllerEchoMissAggressiveLimit(Integer controllerEchoMissAggressiveLimit) {
    this.controllerEchoMissAggressiveLimit = controllerEchoMissAggressiveLimit;
  }

  
  /**
   * Count of HB misses for se health check failure. Allowed values are 1-1000.
   * @return controllerEchoMissLimit
  **/
  @ApiModelProperty(value = "Count of HB misses for se health check failure. Allowed values are 1-1000.")


 
  @VsoMethod  
  public Integer getControllerEchoMissLimit() {
    return controllerEchoMissLimit;
  }
    
  @VsoMethod
  public void setControllerEchoMissLimit(Integer controllerEchoMissLimit) {
    this.controllerEchoMissLimit = controllerEchoMissLimit;
  }

  
  /**
   * Aggressive Timeout used for se health check.
   * @return controllerEchoRpcAggressiveTimeout
  **/
  @ApiModelProperty(value = "Aggressive Timeout used for se health check.")


 
  @VsoMethod  
  public Integer getControllerEchoRpcAggressiveTimeout() {
    return controllerEchoRpcAggressiveTimeout;
  }
    
  @VsoMethod
  public void setControllerEchoRpcAggressiveTimeout(Integer controllerEchoRpcAggressiveTimeout) {
    this.controllerEchoRpcAggressiveTimeout = controllerEchoRpcAggressiveTimeout;
  }

  
  /**
   * Timeout used for se health check.
   * @return controllerEchoRpcTimeout
  **/
  @ApiModelProperty(value = "Timeout used for se health check.")


 
  @VsoMethod  
  public Integer getControllerEchoRpcTimeout() {
    return controllerEchoRpcTimeout;
  }
    
  @VsoMethod
  public void setControllerEchoRpcTimeout(Integer controllerEchoRpcTimeout) {
    this.controllerEchoRpcTimeout = controllerEchoRpcTimeout;
  }

  
  /**
   *  Allowed values are 1-20.
   * @return controllerHeartbeatMissLimit
  **/
  @ApiModelProperty(value = " Allowed values are 1-20.")


 
  @VsoMethod  
  public Integer getControllerHeartbeatMissLimit() {
    return controllerHeartbeatMissLimit;
  }
    
  @VsoMethod
  public void setControllerHeartbeatMissLimit(Integer controllerHeartbeatMissLimit) {
    this.controllerHeartbeatMissLimit = controllerHeartbeatMissLimit;
  }

  
  /**
   *  Allowed values are 1-60.
   * @return controllerHeartbeatTimeoutSec
  **/
  @ApiModelProperty(value = " Allowed values are 1-60.")


 
  @VsoMethod  
  public Integer getControllerHeartbeatTimeoutSec() {
    return controllerHeartbeatTimeoutSec;
  }
    
  @VsoMethod
  public void setControllerHeartbeatTimeoutSec(Integer controllerHeartbeatTimeoutSec) {
    this.controllerHeartbeatTimeoutSec = controllerHeartbeatTimeoutSec;
  }

  
  /**
   * Number of controller_registration_timeout_sec.
   * @return controllerRegistrationTimeoutSec
  **/
  @ApiModelProperty(value = "Number of controller_registration_timeout_sec.")


 
  @VsoMethod  
  public Integer getControllerRegistrationTimeoutSec() {
    return controllerRegistrationTimeoutSec;
  }
    
  @VsoMethod
  public void setControllerRegistrationTimeoutSec(Integer controllerRegistrationTimeoutSec) {
    this.controllerRegistrationTimeoutSec = controllerRegistrationTimeoutSec;
  }

  
  /**
   * Number of controller_rpc_timeout.
   * @return controllerRpcTimeout
  **/
  @ApiModelProperty(value = "Number of controller_rpc_timeout.")


 
  @VsoMethod  
  public Integer getControllerRpcTimeout() {
    return controllerRpcTimeout;
  }
    
  @VsoMethod
  public void setControllerRpcTimeout(Integer controllerRpcTimeout) {
    this.controllerRpcTimeout = controllerRpcTimeout;
  }

  
  /**
   * Number of cpustats_interval.
   * @return cpustatsInterval
  **/
  @ApiModelProperty(value = "Number of cpustats_interval.")


 
  @VsoMethod  
  public Integer getCpustatsInterval() {
    return cpustatsInterval;
  }
    
  @VsoMethod
  public void setCpustatsInterval(Integer cpustatsInterval) {
    this.cpustatsInterval = cpustatsInterval;
  }

  
  /**
   * Max time to wait for ctrl registration before assert. Allowed values are 1-1000.
   * @return ctrlRegPendingMaxWaitTime
  **/
  @ApiModelProperty(value = "Max time to wait for ctrl registration before assert. Allowed values are 1-1000.")


 
  @VsoMethod  
  public Integer getCtrlRegPendingMaxWaitTime() {
    return ctrlRegPendingMaxWaitTime;
  }
    
  @VsoMethod
  public void setCtrlRegPendingMaxWaitTime(Integer ctrlRegPendingMaxWaitTime) {
    this.ctrlRegPendingMaxWaitTime = ctrlRegPendingMaxWaitTime;
  }

  
  /**
   * Placeholder for description of property debug_mode of obj type SeAgentProperties field type str  type boolean
   * @return debugMode
  **/
  @ApiModelProperty(value = "Placeholder for description of property debug_mode of obj type SeAgentProperties field type str  type boolean")


 
  @VsoMethod  
  public Boolean isDebugMode() {
    return debugMode;
  }
    
  @VsoMethod
  public void setDebugMode(Boolean debugMode) {
    this.debugMode = debugMode;
  }

  
  /**
   *  Allowed values are 1-1000.
   * @return dpAggressiveDeqIntervalMsec
  **/
  @ApiModelProperty(value = " Allowed values are 1-1000.")


 
  @VsoMethod  
  public Integer getDpAggressiveDeqIntervalMsec() {
    return dpAggressiveDeqIntervalMsec;
  }
    
  @VsoMethod
  public void setDpAggressiveDeqIntervalMsec(Integer dpAggressiveDeqIntervalMsec) {
    this.dpAggressiveDeqIntervalMsec = dpAggressiveDeqIntervalMsec;
  }

  
  /**
   *  Allowed values are 1-1000.
   * @return dpAggressiveEnqIntervalMsec
  **/
  @ApiModelProperty(value = " Allowed values are 1-1000.")


 
  @VsoMethod  
  public Integer getDpAggressiveEnqIntervalMsec() {
    return dpAggressiveEnqIntervalMsec;
  }
    
  @VsoMethod
  public void setDpAggressiveEnqIntervalMsec(Integer dpAggressiveEnqIntervalMsec) {
    this.dpAggressiveEnqIntervalMsec = dpAggressiveEnqIntervalMsec;
  }

  
  /**
   * Number of dp_batch_size.
   * @return dpBatchSize
  **/
  @ApiModelProperty(value = "Number of dp_batch_size.")


 
  @VsoMethod  
  public Integer getDpBatchSize() {
    return dpBatchSize;
  }
    
  @VsoMethod
  public void setDpBatchSize(Integer dpBatchSize) {
    this.dpBatchSize = dpBatchSize;
  }

  
  /**
   *  Allowed values are 1-1000.
   * @return dpDeqIntervalMsec
  **/
  @ApiModelProperty(value = " Allowed values are 1-1000.")


 
  @VsoMethod  
  public Integer getDpDeqIntervalMsec() {
    return dpDeqIntervalMsec;
  }
    
  @VsoMethod
  public void setDpDeqIntervalMsec(Integer dpDeqIntervalMsec) {
    this.dpDeqIntervalMsec = dpDeqIntervalMsec;
  }

  
  /**
   *  Allowed values are 1-1000.
   * @return dpEnqIntervalMsec
  **/
  @ApiModelProperty(value = " Allowed values are 1-1000.")


 
  @VsoMethod  
  public Integer getDpEnqIntervalMsec() {
    return dpEnqIntervalMsec;
  }
    
  @VsoMethod
  public void setDpEnqIntervalMsec(Integer dpEnqIntervalMsec) {
    this.dpEnqIntervalMsec = dpEnqIntervalMsec;
  }

  
  /**
   * Number of dp_max_wait_rsp_time_sec.
   * @return dpMaxWaitRspTimeSec
  **/
  @ApiModelProperty(value = "Number of dp_max_wait_rsp_time_sec.")


 
  @VsoMethod  
  public Integer getDpMaxWaitRspTimeSec() {
    return dpMaxWaitRspTimeSec;
  }
    
  @VsoMethod
  public void setDpMaxWaitRspTimeSec(Integer dpMaxWaitRspTimeSec) {
    this.dpMaxWaitRspTimeSec = dpMaxWaitRspTimeSec;
  }

  
  /**
   * Max time to wait for dp registration before assert.
   * @return dpRegPendingMaxWaitTime
  **/
  @ApiModelProperty(value = "Max time to wait for dp registration before assert.")


 
  @VsoMethod  
  public Integer getDpRegPendingMaxWaitTime() {
    return dpRegPendingMaxWaitTime;
  }
    
  @VsoMethod
  public void setDpRegPendingMaxWaitTime(Integer dpRegPendingMaxWaitTime) {
    this.dpRegPendingMaxWaitTime = dpRegPendingMaxWaitTime;
  }

  
  /**
   * Number of headless_timeout_sec.
   * @return headlessTimeoutSec
  **/
  @ApiModelProperty(value = "Number of headless_timeout_sec.")


 
  @VsoMethod  
  public Integer getHeadlessTimeoutSec() {
    return headlessTimeoutSec;
  }
    
  @VsoMethod
  public void setHeadlessTimeoutSec(Integer headlessTimeoutSec) {
    this.headlessTimeoutSec = headlessTimeoutSec;
  }

  
  /**
   * Placeholder for description of property ignore_docker_mac_change of obj type SeAgentProperties field type str  type boolean
   * @return ignoreDockerMacChange
  **/
  @ApiModelProperty(value = "Placeholder for description of property ignore_docker_mac_change of obj type SeAgentProperties field type str  type boolean")


 
  @VsoMethod  
  public Boolean isIgnoreDockerMacChange() {
    return ignoreDockerMacChange;
  }
    
  @VsoMethod
  public void setIgnoreDockerMacChange(Boolean ignoreDockerMacChange) {
    this.ignoreDockerMacChange = ignoreDockerMacChange;
  }

  
  /**
   * Dequeue interval for receive queue from NS HELPER. Allowed values are 1-1000. Field introduced in 17.2.13, 18.1.3, 18.2.1.
   * @return nsHelperDeqIntervalMsec
  **/
  @ApiModelProperty(value = "Dequeue interval for receive queue from NS HELPER. Allowed values are 1-1000. Field introduced in 17.2.13, 18.1.3, 18.2.1.")


 
  @VsoMethod  
  public Integer getNsHelperDeqIntervalMsec() {
    return nsHelperDeqIntervalMsec;
  }
    
  @VsoMethod
  public void setNsHelperDeqIntervalMsec(Integer nsHelperDeqIntervalMsec) {
    this.nsHelperDeqIntervalMsec = nsHelperDeqIntervalMsec;
  }

  
  /**
   * SDB pipeline flush interval. Allowed values are 1-10000.
   * @return sdbFlushInterval
  **/
  @ApiModelProperty(value = "SDB pipeline flush interval. Allowed values are 1-10000.")


 
  @VsoMethod  
  public Integer getSdbFlushInterval() {
    return sdbFlushInterval;
  }
    
  @VsoMethod
  public void setSdbFlushInterval(Integer sdbFlushInterval) {
    this.sdbFlushInterval = sdbFlushInterval;
  }

  
  /**
   * SDB pipeline size. Allowed values are 1-10000.
   * @return sdbPipelineSize
  **/
  @ApiModelProperty(value = "SDB pipeline size. Allowed values are 1-10000.")


 
  @VsoMethod  
  public Integer getSdbPipelineSize() {
    return sdbPipelineSize;
  }
    
  @VsoMethod
  public void setSdbPipelineSize(Integer sdbPipelineSize) {
    this.sdbPipelineSize = sdbPipelineSize;
  }

  
  /**
   * SDB scan count. Allowed values are 1-1000.
   * @return sdbScanCount
  **/
  @ApiModelProperty(value = "SDB scan count. Allowed values are 1-1000.")


 
  @VsoMethod  
  public Integer getSdbScanCount() {
    return sdbScanCount;
  }
    
  @VsoMethod
  public void setSdbScanCount(Integer sdbScanCount) {
    this.sdbScanCount = sdbScanCount;
  }

  
  /**
   * Internal flag used to decide if SE restart is needed,when the se-group is changed. Field introduced in 18.2.3.
   * @return seGrpChangeDisruptive
  **/
  @ApiModelProperty(value = "Internal flag used to decide if SE restart is needed,when the se-group is changed. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isSeGrpChangeDisruptive() {
    return seGrpChangeDisruptive;
  }
    
  @VsoMethod
  public void setSeGrpChangeDisruptive(Boolean seGrpChangeDisruptive) {
    this.seGrpChangeDisruptive = seGrpChangeDisruptive;
  }

  
  /**
   * SeAgent properties for State Cache functionality. Field introduced in 18.2.5.
   * @return seagentStatecacheProperties
  **/
  @ApiModelProperty(value = "SeAgent properties for State Cache functionality. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public SeAgentStateCacheProperties getSeagentStatecacheProperties() {
    return seagentStatecacheProperties;
  }
    
  @VsoMethod
  public void setSeagentStatecacheProperties(SeAgentStateCacheProperties seagentStatecacheProperties) {
    this.seagentStatecacheProperties = seagentStatecacheProperties;
  }

  
  /**
   * Timeout for sending SE_READY without NS HELPER registration completion. Allowed values are 10-600. Field introduced in 17.2.13, 18.1.3, 18.2.1.
   * @return sendSeReadyTimeout
  **/
  @ApiModelProperty(value = "Timeout for sending SE_READY without NS HELPER registration completion. Allowed values are 10-600. Field introduced in 17.2.13, 18.1.3, 18.2.1.")


 
  @VsoMethod  
  public Integer getSendSeReadyTimeout() {
    return sendSeReadyTimeout;
  }
    
  @VsoMethod
  public void setSendSeReadyTimeout(Integer sendSeReadyTimeout) {
    this.sendSeReadyTimeout = sendSeReadyTimeout;
  }

  
  /**
   * Interval for update of operational states to controller. Allowed values are 1-10000. Field introduced in 18.2.1, 17.2.14, 18.1.5.
   * @return statesFlushInterval
  **/
  @ApiModelProperty(value = "Interval for update of operational states to controller. Allowed values are 1-10000. Field introduced in 18.2.1, 17.2.14, 18.1.5.")


 
  @VsoMethod  
  public Integer getStatesFlushInterval() {
    return statesFlushInterval;
  }
    
  @VsoMethod
  public void setStatesFlushInterval(Integer statesFlushInterval) {
    this.statesFlushInterval = statesFlushInterval;
  }

  
  /**
   * DHCP ip check interval. Allowed values are 1-1000.
   * @return vnicDhcpIpCheckInterval
  **/
  @ApiModelProperty(value = "DHCP ip check interval. Allowed values are 1-1000.")


 
  @VsoMethod  
  public Integer getVnicDhcpIpCheckInterval() {
    return vnicDhcpIpCheckInterval;
  }
    
  @VsoMethod
  public void setVnicDhcpIpCheckInterval(Integer vnicDhcpIpCheckInterval) {
    this.vnicDhcpIpCheckInterval = vnicDhcpIpCheckInterval;
  }

  
  /**
   * DHCP ip max retries.
   * @return vnicDhcpIpMaxRetries
  **/
  @ApiModelProperty(value = "DHCP ip max retries.")


 
  @VsoMethod  
  public Integer getVnicDhcpIpMaxRetries() {
    return vnicDhcpIpMaxRetries;
  }
    
  @VsoMethod
  public void setVnicDhcpIpMaxRetries(Integer vnicDhcpIpMaxRetries) {
    this.vnicDhcpIpMaxRetries = vnicDhcpIpMaxRetries;
  }

  
  /**
   * wait interval before deleting IP.
   * @return vnicIpDeleteInterval
  **/
  @ApiModelProperty(value = "wait interval before deleting IP.")


 
  @VsoMethod  
  public Integer getVnicIpDeleteInterval() {
    return vnicIpDeleteInterval;
  }
    
  @VsoMethod
  public void setVnicIpDeleteInterval(Integer vnicIpDeleteInterval) {
    this.vnicIpDeleteInterval = vnicIpDeleteInterval;
  }

  
  /**
   * Probe vnic interval.
   * @return vnicProbeInterval
  **/
  @ApiModelProperty(value = "Probe vnic interval.")


 
  @VsoMethod  
  public Integer getVnicProbeInterval() {
    return vnicProbeInterval;
  }
    
  @VsoMethod
  public void setVnicProbeInterval(Integer vnicProbeInterval) {
    this.vnicProbeInterval = vnicProbeInterval;
  }

  
  /**
   * Time interval for retrying the failed VNIC RPC requests. Field introduced in 18.2.6.
   * @return vnicRpcRetryInterval
  **/
  @ApiModelProperty(value = "Time interval for retrying the failed VNIC RPC requests. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getVnicRpcRetryInterval() {
    return vnicRpcRetryInterval;
  }
    
  @VsoMethod
  public void setVnicRpcRetryInterval(Integer vnicRpcRetryInterval) {
    this.vnicRpcRetryInterval = vnicRpcRetryInterval;
  }

  
  /**
   * Size of vnicdb command history. Allowed values are 0-65535. Field introduced in 18.2.3.
   * @return vnicdbCmdHistorySize
  **/
  @ApiModelProperty(value = "Size of vnicdb command history. Allowed values are 0-65535. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getVnicdbCmdHistorySize() {
    return vnicdbCmdHistorySize;
  }
    
  @VsoMethod
  public void setVnicdbCmdHistorySize(Integer vnicdbCmdHistorySize) {
    this.vnicdbCmdHistorySize = vnicdbCmdHistorySize;
  }

  
  public String getObjectID() {
		return "SeAgentProperties";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeAgentProperties seAgentProperties = (SeAgentProperties) o;
    return Objects.equals(this.controllerEchoMissAggressiveLimit, seAgentProperties.controllerEchoMissAggressiveLimit) &&
        Objects.equals(this.controllerEchoMissLimit, seAgentProperties.controllerEchoMissLimit) &&
        Objects.equals(this.controllerEchoRpcAggressiveTimeout, seAgentProperties.controllerEchoRpcAggressiveTimeout) &&
        Objects.equals(this.controllerEchoRpcTimeout, seAgentProperties.controllerEchoRpcTimeout) &&
        Objects.equals(this.controllerHeartbeatMissLimit, seAgentProperties.controllerHeartbeatMissLimit) &&
        Objects.equals(this.controllerHeartbeatTimeoutSec, seAgentProperties.controllerHeartbeatTimeoutSec) &&
        Objects.equals(this.controllerRegistrationTimeoutSec, seAgentProperties.controllerRegistrationTimeoutSec) &&
        Objects.equals(this.controllerRpcTimeout, seAgentProperties.controllerRpcTimeout) &&
        Objects.equals(this.cpustatsInterval, seAgentProperties.cpustatsInterval) &&
        Objects.equals(this.ctrlRegPendingMaxWaitTime, seAgentProperties.ctrlRegPendingMaxWaitTime) &&
        Objects.equals(this.debugMode, seAgentProperties.debugMode) &&
        Objects.equals(this.dpAggressiveDeqIntervalMsec, seAgentProperties.dpAggressiveDeqIntervalMsec) &&
        Objects.equals(this.dpAggressiveEnqIntervalMsec, seAgentProperties.dpAggressiveEnqIntervalMsec) &&
        Objects.equals(this.dpBatchSize, seAgentProperties.dpBatchSize) &&
        Objects.equals(this.dpDeqIntervalMsec, seAgentProperties.dpDeqIntervalMsec) &&
        Objects.equals(this.dpEnqIntervalMsec, seAgentProperties.dpEnqIntervalMsec) &&
        Objects.equals(this.dpMaxWaitRspTimeSec, seAgentProperties.dpMaxWaitRspTimeSec) &&
        Objects.equals(this.dpRegPendingMaxWaitTime, seAgentProperties.dpRegPendingMaxWaitTime) &&
        Objects.equals(this.headlessTimeoutSec, seAgentProperties.headlessTimeoutSec) &&
        Objects.equals(this.ignoreDockerMacChange, seAgentProperties.ignoreDockerMacChange) &&
        Objects.equals(this.nsHelperDeqIntervalMsec, seAgentProperties.nsHelperDeqIntervalMsec) &&
        Objects.equals(this.sdbFlushInterval, seAgentProperties.sdbFlushInterval) &&
        Objects.equals(this.sdbPipelineSize, seAgentProperties.sdbPipelineSize) &&
        Objects.equals(this.sdbScanCount, seAgentProperties.sdbScanCount) &&
        Objects.equals(this.seGrpChangeDisruptive, seAgentProperties.seGrpChangeDisruptive) &&
        Objects.equals(this.seagentStatecacheProperties, seAgentProperties.seagentStatecacheProperties) &&
        Objects.equals(this.sendSeReadyTimeout, seAgentProperties.sendSeReadyTimeout) &&
        Objects.equals(this.statesFlushInterval, seAgentProperties.statesFlushInterval) &&
        Objects.equals(this.vnicDhcpIpCheckInterval, seAgentProperties.vnicDhcpIpCheckInterval) &&
        Objects.equals(this.vnicDhcpIpMaxRetries, seAgentProperties.vnicDhcpIpMaxRetries) &&
        Objects.equals(this.vnicIpDeleteInterval, seAgentProperties.vnicIpDeleteInterval) &&
        Objects.equals(this.vnicProbeInterval, seAgentProperties.vnicProbeInterval) &&
        Objects.equals(this.vnicRpcRetryInterval, seAgentProperties.vnicRpcRetryInterval) &&
        Objects.equals(this.vnicdbCmdHistorySize, seAgentProperties.vnicdbCmdHistorySize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerEchoMissAggressiveLimit, controllerEchoMissLimit, controllerEchoRpcAggressiveTimeout, controllerEchoRpcTimeout, controllerHeartbeatMissLimit, controllerHeartbeatTimeoutSec, controllerRegistrationTimeoutSec, controllerRpcTimeout, cpustatsInterval, ctrlRegPendingMaxWaitTime, debugMode, dpAggressiveDeqIntervalMsec, dpAggressiveEnqIntervalMsec, dpBatchSize, dpDeqIntervalMsec, dpEnqIntervalMsec, dpMaxWaitRspTimeSec, dpRegPendingMaxWaitTime, headlessTimeoutSec, ignoreDockerMacChange, nsHelperDeqIntervalMsec, sdbFlushInterval, sdbPipelineSize, sdbScanCount, seGrpChangeDisruptive, seagentStatecacheProperties, sendSeReadyTimeout, statesFlushInterval, vnicDhcpIpCheckInterval, vnicDhcpIpMaxRetries, vnicIpDeleteInterval, vnicProbeInterval, vnicRpcRetryInterval, vnicdbCmdHistorySize);
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

