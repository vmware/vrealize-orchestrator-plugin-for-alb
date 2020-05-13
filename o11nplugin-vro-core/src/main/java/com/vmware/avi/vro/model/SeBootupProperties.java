package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SeBootupCompressionProperties;
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
 * SeBootupProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SeBootupProperties")
@VsoFinder(name = Constants.FINDER_VRO_SEBOOTUPPROPERTIES, idAccessor = "getObjectID()")
@Service
public class SeBootupProperties extends AviRestResource  {
  @JsonProperty("distribute_queues")
  private Boolean distributeQueues = null;

  @JsonProperty("distribute_vnics")
  private Boolean distributeVnics = null;

  @JsonProperty("docker_backend_portend")
  private Integer dockerBackendPortend = 30720;

  @JsonProperty("docker_backend_portstart")
  private Integer dockerBackendPortstart = 20480;

  @JsonProperty("fair_queueing_enabled")
  private Boolean fairQueueingEnabled = null;

  @JsonProperty("geo_db_granularity")
  private Integer geoDbGranularity = 1;

  @JsonProperty("l7_conns_per_core")
  private Integer l7ConnsPerCore = 16384;

  @JsonProperty("l7_resvd_listen_conns_per_core")
  private Integer l7ResvdListenConnsPerCore = 256;

  @JsonProperty("log_agent_debug_enabled")
  private Boolean logAgentDebugEnabled = null;

  @JsonProperty("log_agent_trace_enabled")
  private Boolean logAgentTraceEnabled = true;

  @JsonProperty("se_dp_compression")
  private SeBootupCompressionProperties seDpCompression = null;

  @JsonProperty("se_dpdk_pmd")
  private Integer seDpdkPmd = null;

  @JsonProperty("se_emulated_cores")
  private Integer seEmulatedCores = null;

  @JsonProperty("se_ip_encap_ipc")
  private Integer seIpEncapIpc = null;

  @JsonProperty("se_l3_encap_ipc")
  private Integer seL3EncapIpc = null;

  @JsonProperty("se_log_buffer_app_blocking_dequeue")
  private Boolean seLogBufferAppBlockingDequeue = null;

  @JsonProperty("se_log_buffer_applog_size")
  private Integer seLogBufferApplogSize = 4096;

  @JsonProperty("se_log_buffer_chunk_count")
  private Integer seLogBufferChunkCount = 1024;

  @JsonProperty("se_log_buffer_conn_blocking_dequeue")
  private Boolean seLogBufferConnBlockingDequeue = null;

  @JsonProperty("se_log_buffer_connlog_size")
  private Integer seLogBufferConnlogSize = 1024;

  @JsonProperty("se_log_buffer_events_blocking_dequeue")
  private Boolean seLogBufferEventsBlockingDequeue = true;

  @JsonProperty("se_log_buffer_events_size")
  private Integer seLogBufferEventsSize = 512;

  @JsonProperty("se_lro")
  private Integer seLro = null;

  @JsonProperty("se_pcap_pkt_count")
  private Integer sePcapPktCount = null;

  @JsonProperty("se_pcap_pkt_sz")
  private Integer sePcapPktSz = null;

  @JsonProperty("se_rum_sampling_nav_interval")
  private Integer seRumSamplingNavInterval = null;

  @JsonProperty("se_rum_sampling_nav_percent")
  private Integer seRumSamplingNavPercent = null;

  @JsonProperty("se_rum_sampling_res_interval")
  private Integer seRumSamplingResInterval = null;

  @JsonProperty("se_rum_sampling_res_percent")
  private Integer seRumSamplingResPercent = null;

  @JsonProperty("se_tunnel_mode")
  private Integer seTunnelMode = null;

  @JsonProperty("se_tx_batch_size")
  private Integer seTxBatchSize = null;

  @JsonProperty("se_use_dpdk")
  private Integer seUseDpdk = null;

  @JsonProperty("ssl_sess_cache_per_vs")
  private Integer sslSessCachePerVs = 4096;

  @JsonProperty("ssl_sess_cache_timeout")
  private Integer sslSessCacheTimeout = 86400;

  @JsonProperty("tcp_syncache_hashsize")
  private Integer tcpSyncacheHashsize = 8192;

  
  /**
   * Deprecated. Field deprecated in 17.2.8. Field introduced in 17.1.1.
   * @return distributeQueues
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 17.2.8. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isDistributeQueues() {
    return distributeQueues;
  }
    
  @VsoMethod
  public void setDistributeQueues(Boolean distributeQueues) {
    this.distributeQueues = distributeQueues;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.5.
   * @return distributeVnics
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.5.")


 
  @VsoMethod  
  public Boolean isDistributeVnics() {
    return distributeVnics;
  }
    
  @VsoMethod
  public void setDistributeVnics(Boolean distributeVnics) {
    this.distributeVnics = distributeVnics;
  }

  
  /**
   * End of the Local TCP port range used by SE for backend connections in docker environment.
   * @return dockerBackendPortend
  **/
  @ApiModelProperty(value = "End of the Local TCP port range used by SE for backend connections in docker environment.")


 
  @VsoMethod  
  public Integer getDockerBackendPortend() {
    return dockerBackendPortend;
  }
    
  @VsoMethod
  public void setDockerBackendPortend(Integer dockerBackendPortend) {
    this.dockerBackendPortend = dockerBackendPortend;
  }

  
  /**
   * Start of the Local TCP port range used by SE for backend connections in docker environment.
   * @return dockerBackendPortstart
  **/
  @ApiModelProperty(value = "Start of the Local TCP port range used by SE for backend connections in docker environment.")


 
  @VsoMethod  
  public Integer getDockerBackendPortstart() {
    return dockerBackendPortstart;
  }
    
  @VsoMethod
  public void setDockerBackendPortstart(Integer dockerBackendPortstart) {
    this.dockerBackendPortstart = dockerBackendPortstart;
  }

  
  /**
   * Enable or disable fair queueing for packet transmission among virtualservices on an SE.
   * @return fairQueueingEnabled
  **/
  @ApiModelProperty(value = "Enable or disable fair queueing for packet transmission among virtualservices on an SE.")


 
  @VsoMethod  
  public Boolean isFairQueueingEnabled() {
    return fairQueueingEnabled;
  }
    
  @VsoMethod
  public void setFairQueueingEnabled(Boolean fairQueueingEnabled) {
    this.fairQueueingEnabled = fairQueueingEnabled;
  }

  
  /**
   * Granularity or Resolution of co-ordinates used. When the value is 1 the co-ordinates provided in the geo-db are used as is (highest resolution.This value provides a 'zoom-out' value so that coarser co-ordinates are used. With higher resolution, logs can contain finer location information. But, lower resolution provides significant memory and cpu benefits on the service engine. Besides, given a smaller number of members that are separated geographically, a lower resolution is sufficient for correct load-balancing. Allowed values are 1-20. Field introduced in 17.1.1.
   * @return geoDbGranularity
  **/
  @ApiModelProperty(value = "Granularity or Resolution of co-ordinates used. When the value is 1 the co-ordinates provided in the geo-db are used as is (highest resolution.This value provides a 'zoom-out' value so that coarser co-ordinates are used. With higher resolution, logs can contain finer location information. But, lower resolution provides significant memory and cpu benefits on the service engine. Besides, given a smaller number of members that are separated geographically, a lower resolution is sufficient for correct load-balancing. Allowed values are 1-20. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getGeoDbGranularity() {
    return geoDbGranularity;
  }
    
  @VsoMethod
  public void setGeoDbGranularity(Integer geoDbGranularity) {
    this.geoDbGranularity = geoDbGranularity;
  }

  
  /**
   * Number of L7 connections that can be cached per core.
   * @return l7ConnsPerCore
  **/
  @ApiModelProperty(value = "Number of L7 connections that can be cached per core.")


 
  @VsoMethod  
  public Integer getL7ConnsPerCore() {
    return l7ConnsPerCore;
  }
    
  @VsoMethod
  public void setL7ConnsPerCore(Integer l7ConnsPerCore) {
    this.l7ConnsPerCore = l7ConnsPerCore;
  }

  
  /**
   * Number of reserved L7 listener connections per core.
   * @return l7ResvdListenConnsPerCore
  **/
  @ApiModelProperty(value = "Number of reserved L7 listener connections per core.")


 
  @VsoMethod  
  public Integer getL7ResvdListenConnsPerCore() {
    return l7ResvdListenConnsPerCore;
  }
    
  @VsoMethod
  public void setL7ResvdListenConnsPerCore(Integer l7ResvdListenConnsPerCore) {
    this.l7ResvdListenConnsPerCore = l7ResvdListenConnsPerCore;
  }

  
  /**
   * Enable debug logs by default on Service Engine. This includes all other debugging logs. Debug logs can also be explcitly enabled from the CLI shell.
   * @return logAgentDebugEnabled
  **/
  @ApiModelProperty(value = "Enable debug logs by default on Service Engine. This includes all other debugging logs. Debug logs can also be explcitly enabled from the CLI shell.")


 
  @VsoMethod  
  public Boolean isLogAgentDebugEnabled() {
    return logAgentDebugEnabled;
  }
    
  @VsoMethod
  public void setLogAgentDebugEnabled(Boolean logAgentDebugEnabled) {
    this.logAgentDebugEnabled = logAgentDebugEnabled;
  }

  
  /**
   * Enable trace logs by default on Service Engine. Configuration operations are logged along with other important logs by Service Engine.
   * @return logAgentTraceEnabled
  **/
  @ApiModelProperty(value = "Enable trace logs by default on Service Engine. Configuration operations are logged along with other important logs by Service Engine.")


 
  @VsoMethod  
  public Boolean isLogAgentTraceEnabled() {
    return logAgentTraceEnabled;
  }
    
  @VsoMethod
  public void setLogAgentTraceEnabled(Boolean logAgentTraceEnabled) {
    this.logAgentTraceEnabled = logAgentTraceEnabled;
  }

  
  /**
   * Placeholder for description of property se_dp_compression of obj type SeBootupProperties field type str  type object
   * @return seDpCompression
  **/
  @ApiModelProperty(value = "Placeholder for description of property se_dp_compression of obj type SeBootupProperties field type str  type object")

  @Valid

 
  @VsoMethod  
  public SeBootupCompressionProperties getSeDpCompression() {
    return seDpCompression;
  }
    
  @VsoMethod
  public void setSeDpCompression(SeBootupCompressionProperties seDpCompression) {
    this.seDpCompression = seDpCompression;
  }

  
  /**
   * This field has been moved to se_group properties 18.1.2 onwards. Field deprecated in 18.1.3.
   * @return seDpdkPmd
  **/
  @ApiModelProperty(value = "This field has been moved to se_group properties 18.1.2 onwards. Field deprecated in 18.1.3.")


 
  @VsoMethod  
  public Integer getSeDpdkPmd() {
    return seDpdkPmd;
  }
    
  @VsoMethod
  public void setSeDpdkPmd(Integer seDpdkPmd) {
    this.seDpdkPmd = seDpdkPmd;
  }

  
  /**
   * Use this to emulate more/less cpus than is actually available. One datapath process is started for each core.
   * @return seEmulatedCores
  **/
  @ApiModelProperty(value = "Use this to emulate more/less cpus than is actually available. One datapath process is started for each core.")


 
  @VsoMethod  
  public Integer getSeEmulatedCores() {
    return seEmulatedCores;
  }
    
  @VsoMethod
  public void setSeEmulatedCores(Integer seEmulatedCores) {
    this.seEmulatedCores = seEmulatedCores;
  }

  
  /**
   * Determines if SE-SE IPC messages are encapsulated in an IP header       0        Automatically determine based on hypervisor type    1        Use IP encap unconditionally    ~[0,1]   Don't use IP encap.
   * @return seIpEncapIpc
  **/
  @ApiModelProperty(value = "Determines if SE-SE IPC messages are encapsulated in an IP header       0        Automatically determine based on hypervisor type    1        Use IP encap unconditionally    ~[0,1]   Don't use IP encap.")


 
  @VsoMethod  
  public Integer getSeIpEncapIpc() {
    return seIpEncapIpc;
  }
    
  @VsoMethod
  public void setSeIpEncapIpc(Integer seIpEncapIpc) {
    this.seIpEncapIpc = seIpEncapIpc;
  }

  
  /**
   * Determines if SE-SE IPC messages use SE interface IP instead of VIP        0        Automatically determine based on hypervisor type    1        Use SE interface IP unconditionally    ~[0,1]   Don't use SE interface IP.
   * @return seL3EncapIpc
  **/
  @ApiModelProperty(value = "Determines if SE-SE IPC messages use SE interface IP instead of VIP        0        Automatically determine based on hypervisor type    1        Use SE interface IP unconditionally    ~[0,1]   Don't use SE interface IP.")


 
  @VsoMethod  
  public Integer getSeL3EncapIpc() {
    return seL3EncapIpc;
  }
    
  @VsoMethod
  public void setSeL3EncapIpc(Integer seL3EncapIpc) {
    this.seL3EncapIpc = seL3EncapIpc;
  }

  
  /**
   * Internal flag that blocks dataplane until all application logs are flushed to log-agent process.
   * @return seLogBufferAppBlockingDequeue
  **/
  @ApiModelProperty(value = "Internal flag that blocks dataplane until all application logs are flushed to log-agent process.")


 
  @VsoMethod  
  public Boolean isSeLogBufferAppBlockingDequeue() {
    return seLogBufferAppBlockingDequeue;
  }
    
  @VsoMethod
  public void setSeLogBufferAppBlockingDequeue(Boolean seLogBufferAppBlockingDequeue) {
    this.seLogBufferAppBlockingDequeue = seLogBufferAppBlockingDequeue;
  }

  
  /**
   * Internal application log buffer size to use on Service Engine. Can be fine tuned for better performance of data plane in specific environments.
   * @return seLogBufferApplogSize
  **/
  @ApiModelProperty(value = "Internal application log buffer size to use on Service Engine. Can be fine tuned for better performance of data plane in specific environments.")


 
  @VsoMethod  
  public Integer getSeLogBufferApplogSize() {
    return seLogBufferApplogSize;
  }
    
  @VsoMethod
  public void setSeLogBufferApplogSize(Integer seLogBufferApplogSize) {
    this.seLogBufferApplogSize = seLogBufferApplogSize;
  }

  
  /**
   * Number of internal buffer chunks to use on Service Engine. Can be fine tuned for better performance of data plane in specific environments.
   * @return seLogBufferChunkCount
  **/
  @ApiModelProperty(value = "Number of internal buffer chunks to use on Service Engine. Can be fine tuned for better performance of data plane in specific environments.")


 
  @VsoMethod  
  public Integer getSeLogBufferChunkCount() {
    return seLogBufferChunkCount;
  }
    
  @VsoMethod
  public void setSeLogBufferChunkCount(Integer seLogBufferChunkCount) {
    this.seLogBufferChunkCount = seLogBufferChunkCount;
  }

  
  /**
   * Internal flag that blocks dataplane until all connection logs are flushed to log-agent process.
   * @return seLogBufferConnBlockingDequeue
  **/
  @ApiModelProperty(value = "Internal flag that blocks dataplane until all connection logs are flushed to log-agent process.")


 
  @VsoMethod  
  public Boolean isSeLogBufferConnBlockingDequeue() {
    return seLogBufferConnBlockingDequeue;
  }
    
  @VsoMethod
  public void setSeLogBufferConnBlockingDequeue(Boolean seLogBufferConnBlockingDequeue) {
    this.seLogBufferConnBlockingDequeue = seLogBufferConnBlockingDequeue;
  }

  
  /**
   * Internal connection log buffer size to use on Service Engine. Can be fine tuned for better performance of data plane in specific environments.
   * @return seLogBufferConnlogSize
  **/
  @ApiModelProperty(value = "Internal connection log buffer size to use on Service Engine. Can be fine tuned for better performance of data plane in specific environments.")


 
  @VsoMethod  
  public Integer getSeLogBufferConnlogSize() {
    return seLogBufferConnlogSize;
  }
    
  @VsoMethod
  public void setSeLogBufferConnlogSize(Integer seLogBufferConnlogSize) {
    this.seLogBufferConnlogSize = seLogBufferConnlogSize;
  }

  
  /**
   * Internal flag that blocks dataplane until all outstanding events are flushed to log-agent process.
   * @return seLogBufferEventsBlockingDequeue
  **/
  @ApiModelProperty(value = "Internal flag that blocks dataplane until all outstanding events are flushed to log-agent process.")


 
  @VsoMethod  
  public Boolean isSeLogBufferEventsBlockingDequeue() {
    return seLogBufferEventsBlockingDequeue;
  }
    
  @VsoMethod
  public void setSeLogBufferEventsBlockingDequeue(Boolean seLogBufferEventsBlockingDequeue) {
    this.seLogBufferEventsBlockingDequeue = seLogBufferEventsBlockingDequeue;
  }

  
  /**
   * Internal events buffer size to use on Service Engine. Can be fine tuned for better performance of data plane in specific environments.
   * @return seLogBufferEventsSize
  **/
  @ApiModelProperty(value = "Internal events buffer size to use on Service Engine. Can be fine tuned for better performance of data plane in specific environments.")


 
  @VsoMethod  
  public Integer getSeLogBufferEventsSize() {
    return seLogBufferEventsSize;
  }
    
  @VsoMethod
  public void setSeLogBufferEventsSize(Integer seLogBufferEventsSize) {
    this.seLogBufferEventsSize = seLogBufferEventsSize;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.5.
   * @return seLro
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.5.")


 
  @VsoMethod  
  public Integer getSeLro() {
    return seLro;
  }
    
  @VsoMethod
  public void setSeLro(Integer seLro) {
    this.seLro = seLro;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.5.
   * @return sePcapPktCount
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.5.")


 
  @VsoMethod  
  public Integer getSePcapPktCount() {
    return sePcapPktCount;
  }
    
  @VsoMethod
  public void setSePcapPktCount(Integer sePcapPktCount) {
    this.sePcapPktCount = sePcapPktCount;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.5.
   * @return sePcapPktSz
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.5.")


 
  @VsoMethod  
  public Integer getSePcapPktSz() {
    return sePcapPktSz;
  }
    
  @VsoMethod
  public void setSePcapPktSz(Integer sePcapPktSz) {
    this.sePcapPktSz = sePcapPktSz;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.6.
   * @return seRumSamplingNavInterval
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.6.")


 
  @VsoMethod  
  public Integer getSeRumSamplingNavInterval() {
    return seRumSamplingNavInterval;
  }
    
  @VsoMethod
  public void setSeRumSamplingNavInterval(Integer seRumSamplingNavInterval) {
    this.seRumSamplingNavInterval = seRumSamplingNavInterval;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.6.
   * @return seRumSamplingNavPercent
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.6.")


 
  @VsoMethod  
  public Integer getSeRumSamplingNavPercent() {
    return seRumSamplingNavPercent;
  }
    
  @VsoMethod
  public void setSeRumSamplingNavPercent(Integer seRumSamplingNavPercent) {
    this.seRumSamplingNavPercent = seRumSamplingNavPercent;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.6.
   * @return seRumSamplingResInterval
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.6.")


 
  @VsoMethod  
  public Integer getSeRumSamplingResInterval() {
    return seRumSamplingResInterval;
  }
    
  @VsoMethod
  public void setSeRumSamplingResInterval(Integer seRumSamplingResInterval) {
    this.seRumSamplingResInterval = seRumSamplingResInterval;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.6.
   * @return seRumSamplingResPercent
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.6.")


 
  @VsoMethod  
  public Integer getSeRumSamplingResPercent() {
    return seRumSamplingResPercent;
  }
    
  @VsoMethod
  public void setSeRumSamplingResPercent(Integer seRumSamplingResPercent) {
    this.seRumSamplingResPercent = seRumSamplingResPercent;
  }

  
  /**
   * Determines if DSR from secondary SE is active or not      0        Automatically determine based on hypervisor type    1        Disable DSR unconditionally    ~[0,1]   Enable DSR unconditionally. Field deprecated in 17.1.1.
   * @return seTunnelMode
  **/
  @ApiModelProperty(value = "Determines if DSR from secondary SE is active or not      0        Automatically determine based on hypervisor type    1        Disable DSR unconditionally    ~[0,1]   Enable DSR unconditionally. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public Integer getSeTunnelMode() {
    return seTunnelMode;
  }
    
  @VsoMethod
  public void setSeTunnelMode(Integer seTunnelMode) {
    this.seTunnelMode = seTunnelMode;
  }

  
  /**
   * Deprecated. Field deprecated in 18.2.5.
   * @return seTxBatchSize
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 18.2.5.")


 
  @VsoMethod  
  public Integer getSeTxBatchSize() {
    return seTxBatchSize;
  }
    
  @VsoMethod
  public void setSeTxBatchSize(Integer seTxBatchSize) {
    this.seTxBatchSize = seTxBatchSize;
  }

  
  /**
   * This field has been moved to se_group properties 18.1.2 onwards. Field deprecated in 18.1.3.
   * @return seUseDpdk
  **/
  @ApiModelProperty(value = "This field has been moved to se_group properties 18.1.2 onwards. Field deprecated in 18.1.3.")


 
  @VsoMethod  
  public Integer getSeUseDpdk() {
    return seUseDpdk;
  }
    
  @VsoMethod
  public void setSeUseDpdk(Integer seUseDpdk) {
    this.seUseDpdk = seUseDpdk;
  }

  
  /**
   * Number of ssl_sess_cache_per_vs.
   * @return sslSessCachePerVs
  **/
  @ApiModelProperty(value = "Number of ssl_sess_cache_per_vs.")


 
  @VsoMethod  
  public Integer getSslSessCachePerVs() {
    return sslSessCachePerVs;
  }
    
  @VsoMethod
  public void setSslSessCachePerVs(Integer sslSessCachePerVs) {
    this.sslSessCachePerVs = sslSessCachePerVs;
  }

  
  /**
   * Number of ssl_sess_cache_timeout.
   * @return sslSessCacheTimeout
  **/
  @ApiModelProperty(value = "Number of ssl_sess_cache_timeout.")


 
  @VsoMethod  
  public Integer getSslSessCacheTimeout() {
    return sslSessCacheTimeout;
  }
    
  @VsoMethod
  public void setSslSessCacheTimeout(Integer sslSessCacheTimeout) {
    this.sslSessCacheTimeout = sslSessCacheTimeout;
  }

  
  /**
   * Size of the TCP SYN cache hash table.
   * @return tcpSyncacheHashsize
  **/
  @ApiModelProperty(value = "Size of the TCP SYN cache hash table.")


 
  @VsoMethod  
  public Integer getTcpSyncacheHashsize() {
    return tcpSyncacheHashsize;
  }
    
  @VsoMethod
  public void setTcpSyncacheHashsize(Integer tcpSyncacheHashsize) {
    this.tcpSyncacheHashsize = tcpSyncacheHashsize;
  }

  
  public String getObjectID() {
		return "SeBootupProperties";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeBootupProperties seBootupProperties = (SeBootupProperties) o;
    return Objects.equals(this.distributeQueues, seBootupProperties.distributeQueues) &&
        Objects.equals(this.distributeVnics, seBootupProperties.distributeVnics) &&
        Objects.equals(this.dockerBackendPortend, seBootupProperties.dockerBackendPortend) &&
        Objects.equals(this.dockerBackendPortstart, seBootupProperties.dockerBackendPortstart) &&
        Objects.equals(this.fairQueueingEnabled, seBootupProperties.fairQueueingEnabled) &&
        Objects.equals(this.geoDbGranularity, seBootupProperties.geoDbGranularity) &&
        Objects.equals(this.l7ConnsPerCore, seBootupProperties.l7ConnsPerCore) &&
        Objects.equals(this.l7ResvdListenConnsPerCore, seBootupProperties.l7ResvdListenConnsPerCore) &&
        Objects.equals(this.logAgentDebugEnabled, seBootupProperties.logAgentDebugEnabled) &&
        Objects.equals(this.logAgentTraceEnabled, seBootupProperties.logAgentTraceEnabled) &&
        Objects.equals(this.seDpCompression, seBootupProperties.seDpCompression) &&
        Objects.equals(this.seDpdkPmd, seBootupProperties.seDpdkPmd) &&
        Objects.equals(this.seEmulatedCores, seBootupProperties.seEmulatedCores) &&
        Objects.equals(this.seIpEncapIpc, seBootupProperties.seIpEncapIpc) &&
        Objects.equals(this.seL3EncapIpc, seBootupProperties.seL3EncapIpc) &&
        Objects.equals(this.seLogBufferAppBlockingDequeue, seBootupProperties.seLogBufferAppBlockingDequeue) &&
        Objects.equals(this.seLogBufferApplogSize, seBootupProperties.seLogBufferApplogSize) &&
        Objects.equals(this.seLogBufferChunkCount, seBootupProperties.seLogBufferChunkCount) &&
        Objects.equals(this.seLogBufferConnBlockingDequeue, seBootupProperties.seLogBufferConnBlockingDequeue) &&
        Objects.equals(this.seLogBufferConnlogSize, seBootupProperties.seLogBufferConnlogSize) &&
        Objects.equals(this.seLogBufferEventsBlockingDequeue, seBootupProperties.seLogBufferEventsBlockingDequeue) &&
        Objects.equals(this.seLogBufferEventsSize, seBootupProperties.seLogBufferEventsSize) &&
        Objects.equals(this.seLro, seBootupProperties.seLro) &&
        Objects.equals(this.sePcapPktCount, seBootupProperties.sePcapPktCount) &&
        Objects.equals(this.sePcapPktSz, seBootupProperties.sePcapPktSz) &&
        Objects.equals(this.seRumSamplingNavInterval, seBootupProperties.seRumSamplingNavInterval) &&
        Objects.equals(this.seRumSamplingNavPercent, seBootupProperties.seRumSamplingNavPercent) &&
        Objects.equals(this.seRumSamplingResInterval, seBootupProperties.seRumSamplingResInterval) &&
        Objects.equals(this.seRumSamplingResPercent, seBootupProperties.seRumSamplingResPercent) &&
        Objects.equals(this.seTunnelMode, seBootupProperties.seTunnelMode) &&
        Objects.equals(this.seTxBatchSize, seBootupProperties.seTxBatchSize) &&
        Objects.equals(this.seUseDpdk, seBootupProperties.seUseDpdk) &&
        Objects.equals(this.sslSessCachePerVs, seBootupProperties.sslSessCachePerVs) &&
        Objects.equals(this.sslSessCacheTimeout, seBootupProperties.sslSessCacheTimeout) &&
        Objects.equals(this.tcpSyncacheHashsize, seBootupProperties.tcpSyncacheHashsize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributeQueues, distributeVnics, dockerBackendPortend, dockerBackendPortstart, fairQueueingEnabled, geoDbGranularity, l7ConnsPerCore, l7ResvdListenConnsPerCore, logAgentDebugEnabled, logAgentTraceEnabled, seDpCompression, seDpdkPmd, seEmulatedCores, seIpEncapIpc, seL3EncapIpc, seLogBufferAppBlockingDequeue, seLogBufferApplogSize, seLogBufferChunkCount, seLogBufferConnBlockingDequeue, seLogBufferConnlogSize, seLogBufferEventsBlockingDequeue, seLogBufferEventsSize, seLro, sePcapPktCount, sePcapPktSz, seRumSamplingNavInterval, seRumSamplingNavPercent, seRumSamplingResInterval, seRumSamplingResPercent, seTunnelMode, seTxBatchSize, seUseDpdk, sslSessCachePerVs, sslSessCacheTimeout, tcpSyncacheHashsize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeBootupProperties {\n");
    
    sb.append("    distributeQueues: ").append(toIndentedString(distributeQueues)).append("\n");
    sb.append("    distributeVnics: ").append(toIndentedString(distributeVnics)).append("\n");
    sb.append("    dockerBackendPortend: ").append(toIndentedString(dockerBackendPortend)).append("\n");
    sb.append("    dockerBackendPortstart: ").append(toIndentedString(dockerBackendPortstart)).append("\n");
    sb.append("    fairQueueingEnabled: ").append(toIndentedString(fairQueueingEnabled)).append("\n");
    sb.append("    geoDbGranularity: ").append(toIndentedString(geoDbGranularity)).append("\n");
    sb.append("    l7ConnsPerCore: ").append(toIndentedString(l7ConnsPerCore)).append("\n");
    sb.append("    l7ResvdListenConnsPerCore: ").append(toIndentedString(l7ResvdListenConnsPerCore)).append("\n");
    sb.append("    logAgentDebugEnabled: ").append(toIndentedString(logAgentDebugEnabled)).append("\n");
    sb.append("    logAgentTraceEnabled: ").append(toIndentedString(logAgentTraceEnabled)).append("\n");
    sb.append("    seDpCompression: ").append(toIndentedString(seDpCompression)).append("\n");
    sb.append("    seDpdkPmd: ").append(toIndentedString(seDpdkPmd)).append("\n");
    sb.append("    seEmulatedCores: ").append(toIndentedString(seEmulatedCores)).append("\n");
    sb.append("    seIpEncapIpc: ").append(toIndentedString(seIpEncapIpc)).append("\n");
    sb.append("    seL3EncapIpc: ").append(toIndentedString(seL3EncapIpc)).append("\n");
    sb.append("    seLogBufferAppBlockingDequeue: ").append(toIndentedString(seLogBufferAppBlockingDequeue)).append("\n");
    sb.append("    seLogBufferApplogSize: ").append(toIndentedString(seLogBufferApplogSize)).append("\n");
    sb.append("    seLogBufferChunkCount: ").append(toIndentedString(seLogBufferChunkCount)).append("\n");
    sb.append("    seLogBufferConnBlockingDequeue: ").append(toIndentedString(seLogBufferConnBlockingDequeue)).append("\n");
    sb.append("    seLogBufferConnlogSize: ").append(toIndentedString(seLogBufferConnlogSize)).append("\n");
    sb.append("    seLogBufferEventsBlockingDequeue: ").append(toIndentedString(seLogBufferEventsBlockingDequeue)).append("\n");
    sb.append("    seLogBufferEventsSize: ").append(toIndentedString(seLogBufferEventsSize)).append("\n");
    sb.append("    seLro: ").append(toIndentedString(seLro)).append("\n");
    sb.append("    sePcapPktCount: ").append(toIndentedString(sePcapPktCount)).append("\n");
    sb.append("    sePcapPktSz: ").append(toIndentedString(sePcapPktSz)).append("\n");
    sb.append("    seRumSamplingNavInterval: ").append(toIndentedString(seRumSamplingNavInterval)).append("\n");
    sb.append("    seRumSamplingNavPercent: ").append(toIndentedString(seRumSamplingNavPercent)).append("\n");
    sb.append("    seRumSamplingResInterval: ").append(toIndentedString(seRumSamplingResInterval)).append("\n");
    sb.append("    seRumSamplingResPercent: ").append(toIndentedString(seRumSamplingResPercent)).append("\n");
    sb.append("    seTunnelMode: ").append(toIndentedString(seTunnelMode)).append("\n");
    sb.append("    seTxBatchSize: ").append(toIndentedString(seTxBatchSize)).append("\n");
    sb.append("    seUseDpdk: ").append(toIndentedString(seUseDpdk)).append("\n");
    sb.append("    sslSessCachePerVs: ").append(toIndentedString(sslSessCachePerVs)).append("\n");
    sb.append("    sslSessCacheTimeout: ").append(toIndentedString(sslSessCacheTimeout)).append("\n");
    sb.append("    tcpSyncacheHashsize: ").append(toIndentedString(tcpSyncacheHashsize)).append("\n");
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

