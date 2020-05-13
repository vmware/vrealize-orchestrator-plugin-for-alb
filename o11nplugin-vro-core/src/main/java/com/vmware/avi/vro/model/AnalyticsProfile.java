package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.ClientLogConfiguration;
import com.vmware.avi.vro.model.ClientLogStreamingConfig;
import com.vmware.avi.vro.model.HTTPStatusRange;
import com.vmware.avi.vro.model.SensitiveLogProfile;
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
 * AnalyticsProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AnalyticsProfile")
@VsoFinder(name = Constants.FINDER_VRO_ANALYTICSPROFILE, idAccessor = "getObjectID()")
@Service
public class AnalyticsProfile extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("apdex_response_threshold")
  private Integer apdexResponseThreshold = 500;

  @JsonProperty("apdex_response_tolerated_factor")
  private Double apdexResponseToleratedFactor = 4.0d;

  @JsonProperty("apdex_rtt_threshold")
  private Integer apdexRttThreshold = 250;

  @JsonProperty("apdex_rtt_tolerated_factor")
  private Double apdexRttToleratedFactor = 4.0d;

  @JsonProperty("apdex_rum_threshold")
  private Integer apdexRumThreshold = 5000;

  @JsonProperty("apdex_rum_tolerated_factor")
  private Double apdexRumToleratedFactor = 4.0d;

  @JsonProperty("apdex_server_response_threshold")
  private Integer apdexServerResponseThreshold = 400;

  @JsonProperty("apdex_server_response_tolerated_factor")
  private Double apdexServerResponseToleratedFactor = 4.0d;

  @JsonProperty("apdex_server_rtt_threshold")
  private Integer apdexServerRttThreshold = 125;

  @JsonProperty("apdex_server_rtt_tolerated_factor")
  private Double apdexServerRttToleratedFactor = 4.0d;

  @JsonProperty("client_log_config")
  private ClientLogConfiguration clientLogConfig = null;

  @JsonProperty("client_log_streaming_config")
  private ClientLogStreamingConfig clientLogStreamingConfig = null;

  @JsonProperty("conn_lossy_ooo_threshold")
  private Integer connLossyOooThreshold = 50;

  @JsonProperty("conn_lossy_timeo_rexmt_threshold")
  private Integer connLossyTimeoRexmtThreshold = 20;

  @JsonProperty("conn_lossy_total_rexmt_threshold")
  private Integer connLossyTotalRexmtThreshold = 50;

  @JsonProperty("conn_lossy_zero_win_size_event_threshold")
  private Integer connLossyZeroWinSizeEventThreshold = 2;

  @JsonProperty("conn_server_lossy_ooo_threshold")
  private Integer connServerLossyOooThreshold = 50;

  @JsonProperty("conn_server_lossy_timeo_rexmt_threshold")
  private Integer connServerLossyTimeoRexmtThreshold = 20;

  @JsonProperty("conn_server_lossy_total_rexmt_threshold")
  private Integer connServerLossyTotalRexmtThreshold = 50;

  @JsonProperty("conn_server_lossy_zero_win_size_event_threshold")
  private Integer connServerLossyZeroWinSizeEventThreshold = 2;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("disable_ondemand_metrics")
  private Boolean disableOndemandMetrics = null;

  @JsonProperty("disable_se_analytics")
  private Boolean disableSeAnalytics = null;

  @JsonProperty("disable_server_analytics")
  private Boolean disableServerAnalytics = null;

  @JsonProperty("disable_vs_analytics")
  private Boolean disableVsAnalytics = null;

  @JsonProperty("enable_advanced_analytics")
  private Boolean enableAdvancedAnalytics = true;

  @JsonProperty("exclude_client_close_before_request_as_error")
  private Boolean excludeClientCloseBeforeRequestAsError = null;

  @JsonProperty("exclude_dns_policy_drop_as_significant")
  private Boolean excludeDnsPolicyDropAsSignificant = null;

  @JsonProperty("exclude_gs_down_as_error")
  private Boolean excludeGsDownAsError = null;

  @JsonProperty("exclude_http_error_codes")
  @Valid
  private List<Integer> excludeHttpErrorCodes = null;

  @JsonProperty("exclude_invalid_dns_domain_as_error")
  private Boolean excludeInvalidDnsDomainAsError = null;

  @JsonProperty("exclude_invalid_dns_query_as_error")
  private Boolean excludeInvalidDnsQueryAsError = null;

  @JsonProperty("exclude_no_dns_record_as_error")
  private Boolean excludeNoDnsRecordAsError = null;

  @JsonProperty("exclude_no_valid_gs_member_as_error")
  private Boolean excludeNoValidGsMemberAsError = null;

  @JsonProperty("exclude_persistence_change_as_error")
  private Boolean excludePersistenceChangeAsError = null;

  @JsonProperty("exclude_server_dns_error_as_error")
  private Boolean excludeServerDnsErrorAsError = null;

  @JsonProperty("exclude_server_tcp_reset_as_error")
  private Boolean excludeServerTcpResetAsError = null;

  @JsonProperty("exclude_sip_error_codes")
  @Valid
  private List<Integer> excludeSipErrorCodes = null;

  @JsonProperty("exclude_syn_retransmit_as_error")
  private Boolean excludeSynRetransmitAsError = null;

  @JsonProperty("exclude_tcp_reset_as_error")
  private Boolean excludeTcpResetAsError = null;

  @JsonProperty("exclude_unsupported_dns_query_as_error")
  private Boolean excludeUnsupportedDnsQueryAsError = null;

  @JsonProperty("healthscore_max_server_limit")
  private Integer healthscoreMaxServerLimit = 20;

  @JsonProperty("hs_event_throttle_window")
  private Integer hsEventThrottleWindow = 1209600;

  @JsonProperty("hs_max_anomaly_penalty")
  private Integer hsMaxAnomalyPenalty = 10;

  @JsonProperty("hs_max_resources_penalty")
  private Integer hsMaxResourcesPenalty = 25;

  @JsonProperty("hs_max_security_penalty")
  private Integer hsMaxSecurityPenalty = 100;

  @JsonProperty("hs_min_dos_rate")
  private Integer hsMinDosRate = 1000;

  @JsonProperty("hs_performance_boost")
  private Integer hsPerformanceBoost = null;

  @JsonProperty("hs_pscore_traffic_threshold_l4_client")
  private Double hsPscoreTrafficThresholdL4Client = 10.0d;

  @JsonProperty("hs_pscore_traffic_threshold_l4_server")
  private Double hsPscoreTrafficThresholdL4Server = 10.0d;

  @JsonProperty("hs_security_certscore_expired")
  private Double hsSecurityCertscoreExpired = null;

  @JsonProperty("hs_security_certscore_gt30d")
  private Double hsSecurityCertscoreGt30d = 5.0d;

  @JsonProperty("hs_security_certscore_le07d")
  private Double hsSecurityCertscoreLe07d = 2.0d;

  @JsonProperty("hs_security_certscore_le30d")
  private Double hsSecurityCertscoreLe30d = 4.0d;

  @JsonProperty("hs_security_chain_invalidity_penalty")
  private Double hsSecurityChainInvalidityPenalty = 1.0d;

  @JsonProperty("hs_security_cipherscore_eq000b")
  private Double hsSecurityCipherscoreEq000b = null;

  @JsonProperty("hs_security_cipherscore_ge128b")
  private Double hsSecurityCipherscoreGe128b = 5.0d;

  @JsonProperty("hs_security_cipherscore_lt128b")
  private Double hsSecurityCipherscoreLt128b = 3.5d;

  @JsonProperty("hs_security_encalgo_score_none")
  private Double hsSecurityEncalgoScoreNone = null;

  @JsonProperty("hs_security_encalgo_score_rc4")
  private Double hsSecurityEncalgoScoreRc4 = 2.5d;

  @JsonProperty("hs_security_hsts_penalty")
  private Double hsSecurityHstsPenalty = 1.0d;

  @JsonProperty("hs_security_nonpfs_penalty")
  private Double hsSecurityNonpfsPenalty = 1.0d;

  @JsonProperty("hs_security_selfsignedcert_penalty")
  private Double hsSecuritySelfsignedcertPenalty = 1.0d;

  @JsonProperty("hs_security_ssl30_score")
  private Double hsSecuritySsl30Score = 3.5d;

  @JsonProperty("hs_security_tls10_score")
  private Double hsSecurityTls10Score = 5.0d;

  @JsonProperty("hs_security_tls11_score")
  private Double hsSecurityTls11Score = 5.0d;

  @JsonProperty("hs_security_tls12_score")
  private Double hsSecurityTls12Score = 5.0d;

  @JsonProperty("hs_security_tls13_score")
  private Double hsSecurityTls13Score = 5.0d;

  @JsonProperty("hs_security_weak_signature_algo_penalty")
  private Double hsSecurityWeakSignatureAlgoPenalty = 1.0d;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ondemand_metrics_idle_timeout")
  private Integer ondemandMetricsIdleTimeout = 1800;

  @JsonProperty("ranges")
  @Valid
  private List<HTTPStatusRange> ranges = null;

  @JsonProperty("resp_code_block")
  @Valid
  private List<String> respCodeBlock = null;

  @JsonProperty("sensitive_log_profile")
  private SensitiveLogProfile sensitiveLogProfile = null;

  @JsonProperty("sip_log_depth")
  private Integer sipLogDepth = 20;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
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
   * If a client receives an HTTP response in less than the Satisfactory Latency Threshold, the request is considered Satisfied. It is considered Tolerated if it is not Satisfied and less than Tolerated Latency Factor multiplied by the Satisfactory Latency Threshold. Greater than this number and the client's request is considered Frustrated. Allowed values are 1-30000.
   * @return apdexResponseThreshold
  **/
  @ApiModelProperty(value = "If a client receives an HTTP response in less than the Satisfactory Latency Threshold, the request is considered Satisfied. It is considered Tolerated if it is not Satisfied and less than Tolerated Latency Factor multiplied by the Satisfactory Latency Threshold. Greater than this number and the client's request is considered Frustrated. Allowed values are 1-30000.")


 
  @VsoMethod  
  public Integer getApdexResponseThreshold() {
    return apdexResponseThreshold;
  }
    
  @VsoMethod
  public void setApdexResponseThreshold(Integer apdexResponseThreshold) {
    this.apdexResponseThreshold = apdexResponseThreshold;
  }

  
  /**
   * Client tolerated response latency factor. Client must receive a response within this factor times the satisfactory threshold (apdex_response_threshold) to be considered tolerated. Allowed values are 1-1000.
   * @return apdexResponseToleratedFactor
  **/
  @ApiModelProperty(value = "Client tolerated response latency factor. Client must receive a response within this factor times the satisfactory threshold (apdex_response_threshold) to be considered tolerated. Allowed values are 1-1000.")


 
  @VsoMethod  
  public Double getApdexResponseToleratedFactor() {
    return apdexResponseToleratedFactor;
  }
    
  @VsoMethod
  public void setApdexResponseToleratedFactor(Double apdexResponseToleratedFactor) {
    this.apdexResponseToleratedFactor = apdexResponseToleratedFactor;
  }

  
  /**
   * Satisfactory client to Avi Round Trip Time(RTT). Allowed values are 1-2000.
   * @return apdexRttThreshold
  **/
  @ApiModelProperty(value = "Satisfactory client to Avi Round Trip Time(RTT). Allowed values are 1-2000.")


 
  @VsoMethod  
  public Integer getApdexRttThreshold() {
    return apdexRttThreshold;
  }
    
  @VsoMethod
  public void setApdexRttThreshold(Integer apdexRttThreshold) {
    this.apdexRttThreshold = apdexRttThreshold;
  }

  
  /**
   * Tolerated client to Avi Round Trip Time(RTT) factor.  It is a multiple of apdex_rtt_tolerated_factor. Allowed values are 1-1000.
   * @return apdexRttToleratedFactor
  **/
  @ApiModelProperty(value = "Tolerated client to Avi Round Trip Time(RTT) factor.  It is a multiple of apdex_rtt_tolerated_factor. Allowed values are 1-1000.")


 
  @VsoMethod  
  public Double getApdexRttToleratedFactor() {
    return apdexRttToleratedFactor;
  }
    
  @VsoMethod
  public void setApdexRttToleratedFactor(Double apdexRttToleratedFactor) {
    this.apdexRttToleratedFactor = apdexRttToleratedFactor;
  }

  
  /**
   * If a client is able to load a page in less than the Satisfactory Latency Threshold, the PageLoad is considered Satisfied.  It is considered tolerated if it is greater than Satisfied but less than the Tolerated Latency multiplied by Satisifed Latency. Greater than this number and the client's request is considered Frustrated.  A PageLoad includes the time for DNS lookup, download of all HTTP objects, and page render time. Allowed values are 1-30000.
   * @return apdexRumThreshold
  **/
  @ApiModelProperty(value = "If a client is able to load a page in less than the Satisfactory Latency Threshold, the PageLoad is considered Satisfied.  It is considered tolerated if it is greater than Satisfied but less than the Tolerated Latency multiplied by Satisifed Latency. Greater than this number and the client's request is considered Frustrated.  A PageLoad includes the time for DNS lookup, download of all HTTP objects, and page render time. Allowed values are 1-30000.")


 
  @VsoMethod  
  public Integer getApdexRumThreshold() {
    return apdexRumThreshold;
  }
    
  @VsoMethod
  public void setApdexRumThreshold(Integer apdexRumThreshold) {
    this.apdexRumThreshold = apdexRumThreshold;
  }

  
  /**
   * Virtual service threshold factor for tolerated Page Load Time (PLT) as multiple of apdex_rum_threshold. Allowed values are 1-1000.
   * @return apdexRumToleratedFactor
  **/
  @ApiModelProperty(value = "Virtual service threshold factor for tolerated Page Load Time (PLT) as multiple of apdex_rum_threshold. Allowed values are 1-1000.")


 
  @VsoMethod  
  public Double getApdexRumToleratedFactor() {
    return apdexRumToleratedFactor;
  }
    
  @VsoMethod
  public void setApdexRumToleratedFactor(Double apdexRumToleratedFactor) {
    this.apdexRumToleratedFactor = apdexRumToleratedFactor;
  }

  
  /**
   * A server HTTP response is considered Satisfied if latency is less than the Satisfactory Latency Threshold. The response is considered tolerated when it is greater than Satisfied but less than the Tolerated Latency Factor * S_Latency.  Greater than this number and the server response is considered Frustrated. Allowed values are 1-30000.
   * @return apdexServerResponseThreshold
  **/
  @ApiModelProperty(value = "A server HTTP response is considered Satisfied if latency is less than the Satisfactory Latency Threshold. The response is considered tolerated when it is greater than Satisfied but less than the Tolerated Latency Factor * S_Latency.  Greater than this number and the server response is considered Frustrated. Allowed values are 1-30000.")


 
  @VsoMethod  
  public Integer getApdexServerResponseThreshold() {
    return apdexServerResponseThreshold;
  }
    
  @VsoMethod
  public void setApdexServerResponseThreshold(Integer apdexServerResponseThreshold) {
    this.apdexServerResponseThreshold = apdexServerResponseThreshold;
  }

  
  /**
   * Server tolerated response latency factor. Servermust response within this factor times the satisfactory threshold (apdex_server_response_threshold) to be considered tolerated. Allowed values are 1-1000.
   * @return apdexServerResponseToleratedFactor
  **/
  @ApiModelProperty(value = "Server tolerated response latency factor. Servermust response within this factor times the satisfactory threshold (apdex_server_response_threshold) to be considered tolerated. Allowed values are 1-1000.")


 
  @VsoMethod  
  public Double getApdexServerResponseToleratedFactor() {
    return apdexServerResponseToleratedFactor;
  }
    
  @VsoMethod
  public void setApdexServerResponseToleratedFactor(Double apdexServerResponseToleratedFactor) {
    this.apdexServerResponseToleratedFactor = apdexServerResponseToleratedFactor;
  }

  
  /**
   * Satisfactory client to Avi Round Trip Time(RTT). Allowed values are 1-2000.
   * @return apdexServerRttThreshold
  **/
  @ApiModelProperty(value = "Satisfactory client to Avi Round Trip Time(RTT). Allowed values are 1-2000.")


 
  @VsoMethod  
  public Integer getApdexServerRttThreshold() {
    return apdexServerRttThreshold;
  }
    
  @VsoMethod
  public void setApdexServerRttThreshold(Integer apdexServerRttThreshold) {
    this.apdexServerRttThreshold = apdexServerRttThreshold;
  }

  
  /**
   * Tolerated client to Avi Round Trip Time(RTT) factor.  It is a multiple of apdex_rtt_tolerated_factor. Allowed values are 1-1000.
   * @return apdexServerRttToleratedFactor
  **/
  @ApiModelProperty(value = "Tolerated client to Avi Round Trip Time(RTT) factor.  It is a multiple of apdex_rtt_tolerated_factor. Allowed values are 1-1000.")


 
  @VsoMethod  
  public Double getApdexServerRttToleratedFactor() {
    return apdexServerRttToleratedFactor;
  }
    
  @VsoMethod
  public void setApdexServerRttToleratedFactor(Double apdexServerRttToleratedFactor) {
    this.apdexServerRttToleratedFactor = apdexServerRttToleratedFactor;
  }

  
  /**
   * Configure which logs are sent to the Avi Controller from SEs and how they are processed.
   * @return clientLogConfig
  **/
  @ApiModelProperty(value = "Configure which logs are sent to the Avi Controller from SEs and how they are processed.")

  @Valid

 
  @VsoMethod  
  public ClientLogConfiguration getClientLogConfig() {
    return clientLogConfig;
  }
    
  @VsoMethod
  public void setClientLogConfig(ClientLogConfiguration clientLogConfig) {
    this.clientLogConfig = clientLogConfig;
  }

  
  /**
   * Configure to stream logs to an external server. Field introduced in 17.1.1.
   * @return clientLogStreamingConfig
  **/
  @ApiModelProperty(value = "Configure to stream logs to an external server. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public ClientLogStreamingConfig getClientLogStreamingConfig() {
    return clientLogStreamingConfig;
  }
    
  @VsoMethod
  public void setClientLogStreamingConfig(ClientLogStreamingConfig clientLogStreamingConfig) {
    this.clientLogStreamingConfig = clientLogStreamingConfig;
  }

  
  /**
   * A connection between client and Avi is considered lossy when more than this percentage of out of order packets are received. Allowed values are 1-100.
   * @return connLossyOooThreshold
  **/
  @ApiModelProperty(value = "A connection between client and Avi is considered lossy when more than this percentage of out of order packets are received. Allowed values are 1-100.")


 
  @VsoMethod  
  public Integer getConnLossyOooThreshold() {
    return connLossyOooThreshold;
  }
    
  @VsoMethod
  public void setConnLossyOooThreshold(Integer connLossyOooThreshold) {
    this.connLossyOooThreshold = connLossyOooThreshold;
  }

  
  /**
   * A connection between client and Avi is considered lossy when more than this percentage of packets are retransmitted due to timeout. Allowed values are 1-100.
   * @return connLossyTimeoRexmtThreshold
  **/
  @ApiModelProperty(value = "A connection between client and Avi is considered lossy when more than this percentage of packets are retransmitted due to timeout. Allowed values are 1-100.")


 
  @VsoMethod  
  public Integer getConnLossyTimeoRexmtThreshold() {
    return connLossyTimeoRexmtThreshold;
  }
    
  @VsoMethod
  public void setConnLossyTimeoRexmtThreshold(Integer connLossyTimeoRexmtThreshold) {
    this.connLossyTimeoRexmtThreshold = connLossyTimeoRexmtThreshold;
  }

  
  /**
   * A connection between client and Avi is considered lossy when more than this percentage of packets are retransmitted. Allowed values are 1-100.
   * @return connLossyTotalRexmtThreshold
  **/
  @ApiModelProperty(value = "A connection between client and Avi is considered lossy when more than this percentage of packets are retransmitted. Allowed values are 1-100.")


 
  @VsoMethod  
  public Integer getConnLossyTotalRexmtThreshold() {
    return connLossyTotalRexmtThreshold;
  }
    
  @VsoMethod
  public void setConnLossyTotalRexmtThreshold(Integer connLossyTotalRexmtThreshold) {
    this.connLossyTotalRexmtThreshold = connLossyTotalRexmtThreshold;
  }

  
  /**
   * A client connection is considered lossy when percentage of times a packet could not be trasmitted due to TCP zero window is above this threshold. Allowed values are 0-100.
   * @return connLossyZeroWinSizeEventThreshold
  **/
  @ApiModelProperty(value = "A client connection is considered lossy when percentage of times a packet could not be trasmitted due to TCP zero window is above this threshold. Allowed values are 0-100.")


 
  @VsoMethod  
  public Integer getConnLossyZeroWinSizeEventThreshold() {
    return connLossyZeroWinSizeEventThreshold;
  }
    
  @VsoMethod
  public void setConnLossyZeroWinSizeEventThreshold(Integer connLossyZeroWinSizeEventThreshold) {
    this.connLossyZeroWinSizeEventThreshold = connLossyZeroWinSizeEventThreshold;
  }

  
  /**
   * A connection between Avi and server is considered lossy when more than this percentage of out of order packets are received. Allowed values are 1-100.
   * @return connServerLossyOooThreshold
  **/
  @ApiModelProperty(value = "A connection between Avi and server is considered lossy when more than this percentage of out of order packets are received. Allowed values are 1-100.")


 
  @VsoMethod  
  public Integer getConnServerLossyOooThreshold() {
    return connServerLossyOooThreshold;
  }
    
  @VsoMethod
  public void setConnServerLossyOooThreshold(Integer connServerLossyOooThreshold) {
    this.connServerLossyOooThreshold = connServerLossyOooThreshold;
  }

  
  /**
   * A connection between Avi and server is considered lossy when more than this percentage of packets are retransmitted due to timeout. Allowed values are 1-100.
   * @return connServerLossyTimeoRexmtThreshold
  **/
  @ApiModelProperty(value = "A connection between Avi and server is considered lossy when more than this percentage of packets are retransmitted due to timeout. Allowed values are 1-100.")


 
  @VsoMethod  
  public Integer getConnServerLossyTimeoRexmtThreshold() {
    return connServerLossyTimeoRexmtThreshold;
  }
    
  @VsoMethod
  public void setConnServerLossyTimeoRexmtThreshold(Integer connServerLossyTimeoRexmtThreshold) {
    this.connServerLossyTimeoRexmtThreshold = connServerLossyTimeoRexmtThreshold;
  }

  
  /**
   * A connection between Avi and server is considered lossy when more than this percentage of packets are retransmitted. Allowed values are 1-100.
   * @return connServerLossyTotalRexmtThreshold
  **/
  @ApiModelProperty(value = "A connection between Avi and server is considered lossy when more than this percentage of packets are retransmitted. Allowed values are 1-100.")


 
  @VsoMethod  
  public Integer getConnServerLossyTotalRexmtThreshold() {
    return connServerLossyTotalRexmtThreshold;
  }
    
  @VsoMethod
  public void setConnServerLossyTotalRexmtThreshold(Integer connServerLossyTotalRexmtThreshold) {
    this.connServerLossyTotalRexmtThreshold = connServerLossyTotalRexmtThreshold;
  }

  
  /**
   * A server connection is considered lossy when percentage of times a packet could not be trasmitted due to TCP zero window is above this threshold. Allowed values are 0-100.
   * @return connServerLossyZeroWinSizeEventThreshold
  **/
  @ApiModelProperty(value = "A server connection is considered lossy when percentage of times a packet could not be trasmitted due to TCP zero window is above this threshold. Allowed values are 0-100.")


 
  @VsoMethod  
  public Integer getConnServerLossyZeroWinSizeEventThreshold() {
    return connServerLossyZeroWinSizeEventThreshold;
  }
    
  @VsoMethod
  public void setConnServerLossyZeroWinSizeEventThreshold(Integer connServerLossyZeroWinSizeEventThreshold) {
    this.connServerLossyZeroWinSizeEventThreshold = connServerLossyZeroWinSizeEventThreshold;
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
   * Virtual Service (VS) metrics are processed only when there is live data traffic on the VS. In case, VS is idle for a period of time as specified by ondemand_metrics_idle_timeout then metrics processing is suspended for that VS. Field introduced in 18.1.1.
   * @return disableOndemandMetrics
  **/
  @ApiModelProperty(value = "Virtual Service (VS) metrics are processed only when there is live data traffic on the VS. In case, VS is idle for a period of time as specified by ondemand_metrics_idle_timeout then metrics processing is suspended for that VS. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Boolean isDisableOndemandMetrics() {
    return disableOndemandMetrics;
  }
    
  @VsoMethod
  public void setDisableOndemandMetrics(Boolean disableOndemandMetrics) {
    this.disableOndemandMetrics = disableOndemandMetrics;
  }

  
  /**
   * Disable node (service engine) level analytics forvs metrics.
   * @return disableSeAnalytics
  **/
  @ApiModelProperty(value = "Disable node (service engine) level analytics forvs metrics.")


 
  @VsoMethod  
  public Boolean isDisableSeAnalytics() {
    return disableSeAnalytics;
  }
    
  @VsoMethod
  public void setDisableSeAnalytics(Boolean disableSeAnalytics) {
    this.disableSeAnalytics = disableSeAnalytics;
  }

  
  /**
   * Disable analytics on backend servers. This may be desired in container environment when there are large number of ephemeral servers. Additionally, no healthscore of servers is computed when server analytics is disabled.
   * @return disableServerAnalytics
  **/
  @ApiModelProperty(value = "Disable analytics on backend servers. This may be desired in container environment when there are large number of ephemeral servers. Additionally, no healthscore of servers is computed when server analytics is disabled.")


 
  @VsoMethod  
  public Boolean isDisableServerAnalytics() {
    return disableServerAnalytics;
  }
    
  @VsoMethod
  public void setDisableServerAnalytics(Boolean disableServerAnalytics) {
    this.disableServerAnalytics = disableServerAnalytics;
  }

  
  /**
   * Disable VirtualService (frontend) Analytics. This flag disables metrics and healthscore for Virtualservice. Field introduced in 18.2.1.
   * @return disableVsAnalytics
  **/
  @ApiModelProperty(value = "Disable VirtualService (frontend) Analytics. This flag disables metrics and healthscore for Virtualservice. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public Boolean isDisableVsAnalytics() {
    return disableVsAnalytics;
  }
    
  @VsoMethod
  public void setDisableVsAnalytics(Boolean disableVsAnalytics) {
    this.disableVsAnalytics = disableVsAnalytics;
  }

  
  /**
   * Enables Advanced Analytics features like Anomaly detection. If set to false, anomaly computation (and associated rules/events) for VS, Pool and Server metrics will be disabled. However, setting it to false reduces cpu and memory requirements for Analytics subsystem. Field introduced in 17.2.13, 18.1.5, 18.2.1.
   * @return enableAdvancedAnalytics
  **/
  @ApiModelProperty(value = "Enables Advanced Analytics features like Anomaly detection. If set to false, anomaly computation (and associated rules/events) for VS, Pool and Server metrics will be disabled. However, setting it to false reduces cpu and memory requirements for Analytics subsystem. Field introduced in 17.2.13, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public Boolean isEnableAdvancedAnalytics() {
    return enableAdvancedAnalytics;
  }
    
  @VsoMethod
  public void setEnableAdvancedAnalytics(Boolean enableAdvancedAnalytics) {
    this.enableAdvancedAnalytics = enableAdvancedAnalytics;
  }

  
  /**
   * Exclude client closed connection before an HTTP request could be completed from being classified as an error.
   * @return excludeClientCloseBeforeRequestAsError
  **/
  @ApiModelProperty(value = "Exclude client closed connection before an HTTP request could be completed from being classified as an error.")


 
  @VsoMethod  
  public Boolean isExcludeClientCloseBeforeRequestAsError() {
    return excludeClientCloseBeforeRequestAsError;
  }
    
  @VsoMethod
  public void setExcludeClientCloseBeforeRequestAsError(Boolean excludeClientCloseBeforeRequestAsError) {
    this.excludeClientCloseBeforeRequestAsError = excludeClientCloseBeforeRequestAsError;
  }

  
  /**
   * Exclude dns policy drops from the list of errors. Field introduced in 17.2.2.
   * @return excludeDnsPolicyDropAsSignificant
  **/
  @ApiModelProperty(value = "Exclude dns policy drops from the list of errors. Field introduced in 17.2.2.")


 
  @VsoMethod  
  public Boolean isExcludeDnsPolicyDropAsSignificant() {
    return excludeDnsPolicyDropAsSignificant;
  }
    
  @VsoMethod
  public void setExcludeDnsPolicyDropAsSignificant(Boolean excludeDnsPolicyDropAsSignificant) {
    this.excludeDnsPolicyDropAsSignificant = excludeDnsPolicyDropAsSignificant;
  }

  
  /**
   * Exclude queries to GSLB services that are operationally down from the list of errors.
   * @return excludeGsDownAsError
  **/
  @ApiModelProperty(value = "Exclude queries to GSLB services that are operationally down from the list of errors.")


 
  @VsoMethod  
  public Boolean isExcludeGsDownAsError() {
    return excludeGsDownAsError;
  }
    
  @VsoMethod
  public void setExcludeGsDownAsError(Boolean excludeGsDownAsError) {
    this.excludeGsDownAsError = excludeGsDownAsError;
  }

  
  public AnalyticsProfile addExcludeHttpErrorCodesItem(Integer excludeHttpErrorCodesItem) {
    if (this.excludeHttpErrorCodes == null) {
      this.excludeHttpErrorCodes = new ArrayList<Integer>();
    }
    this.excludeHttpErrorCodes.add(excludeHttpErrorCodesItem);
    return this;
  }
  
  /**
   * List of HTTP status codes to be excluded from being classified as an error.  Error connections or responses impacts health score, are included as significant logs, and may be classified as part of a DoS attack.
   * @return excludeHttpErrorCodes
  **/
  @ApiModelProperty(value = "List of HTTP status codes to be excluded from being classified as an error.  Error connections or responses impacts health score, are included as significant logs, and may be classified as part of a DoS attack.")


 
  @VsoMethod  
  public List<Integer> getExcludeHttpErrorCodes() {
    return excludeHttpErrorCodes;
  }
    
  @VsoMethod
  public void setExcludeHttpErrorCodes(List<Integer> excludeHttpErrorCodes) {
    this.excludeHttpErrorCodes = excludeHttpErrorCodes;
  }

  
  /**
   * Exclude dns queries to domains outside the domains configured in the DNS application profile from the list of errors.
   * @return excludeInvalidDnsDomainAsError
  **/
  @ApiModelProperty(value = "Exclude dns queries to domains outside the domains configured in the DNS application profile from the list of errors.")


 
  @VsoMethod  
  public Boolean isExcludeInvalidDnsDomainAsError() {
    return excludeInvalidDnsDomainAsError;
  }
    
  @VsoMethod
  public void setExcludeInvalidDnsDomainAsError(Boolean excludeInvalidDnsDomainAsError) {
    this.excludeInvalidDnsDomainAsError = excludeInvalidDnsDomainAsError;
  }

  
  /**
   * Exclude invalid dns queries from the list of errors.
   * @return excludeInvalidDnsQueryAsError
  **/
  @ApiModelProperty(value = "Exclude invalid dns queries from the list of errors.")


 
  @VsoMethod  
  public Boolean isExcludeInvalidDnsQueryAsError() {
    return excludeInvalidDnsQueryAsError;
  }
    
  @VsoMethod
  public void setExcludeInvalidDnsQueryAsError(Boolean excludeInvalidDnsQueryAsError) {
    this.excludeInvalidDnsQueryAsError = excludeInvalidDnsQueryAsError;
  }

  
  /**
   * Exclude queries to domains that did not have configured services/records from the list of errors.
   * @return excludeNoDnsRecordAsError
  **/
  @ApiModelProperty(value = "Exclude queries to domains that did not have configured services/records from the list of errors.")


 
  @VsoMethod  
  public Boolean isExcludeNoDnsRecordAsError() {
    return excludeNoDnsRecordAsError;
  }
    
  @VsoMethod
  public void setExcludeNoDnsRecordAsError(Boolean excludeNoDnsRecordAsError) {
    this.excludeNoDnsRecordAsError = excludeNoDnsRecordAsError;
  }

  
  /**
   * Exclude queries to GSLB services that have no available members from the list of errors.
   * @return excludeNoValidGsMemberAsError
  **/
  @ApiModelProperty(value = "Exclude queries to GSLB services that have no available members from the list of errors.")


 
  @VsoMethod  
  public Boolean isExcludeNoValidGsMemberAsError() {
    return excludeNoValidGsMemberAsError;
  }
    
  @VsoMethod
  public void setExcludeNoValidGsMemberAsError(Boolean excludeNoValidGsMemberAsError) {
    this.excludeNoValidGsMemberAsError = excludeNoValidGsMemberAsError;
  }

  
  /**
   * Exclude persistence server changed while load balancing' from the list of errors.
   * @return excludePersistenceChangeAsError
  **/
  @ApiModelProperty(value = "Exclude persistence server changed while load balancing' from the list of errors.")


 
  @VsoMethod  
  public Boolean isExcludePersistenceChangeAsError() {
    return excludePersistenceChangeAsError;
  }
    
  @VsoMethod
  public void setExcludePersistenceChangeAsError(Boolean excludePersistenceChangeAsError) {
    this.excludePersistenceChangeAsError = excludePersistenceChangeAsError;
  }

  
  /**
   * Exclude server dns error response from the list of errors.
   * @return excludeServerDnsErrorAsError
  **/
  @ApiModelProperty(value = "Exclude server dns error response from the list of errors.")


 
  @VsoMethod  
  public Boolean isExcludeServerDnsErrorAsError() {
    return excludeServerDnsErrorAsError;
  }
    
  @VsoMethod
  public void setExcludeServerDnsErrorAsError(Boolean excludeServerDnsErrorAsError) {
    this.excludeServerDnsErrorAsError = excludeServerDnsErrorAsError;
  }

  
  /**
   * Exclude server TCP reset from errors.  It is common for applications like MS Exchange.
   * @return excludeServerTcpResetAsError
  **/
  @ApiModelProperty(value = "Exclude server TCP reset from errors.  It is common for applications like MS Exchange.")


 
  @VsoMethod  
  public Boolean isExcludeServerTcpResetAsError() {
    return excludeServerTcpResetAsError;
  }
    
  @VsoMethod
  public void setExcludeServerTcpResetAsError(Boolean excludeServerTcpResetAsError) {
    this.excludeServerTcpResetAsError = excludeServerTcpResetAsError;
  }

  
  public AnalyticsProfile addExcludeSipErrorCodesItem(Integer excludeSipErrorCodesItem) {
    if (this.excludeSipErrorCodes == null) {
      this.excludeSipErrorCodes = new ArrayList<Integer>();
    }
    this.excludeSipErrorCodes.add(excludeSipErrorCodesItem);
    return this;
  }
  
  /**
   * List of SIP status codes to be excluded from being classified as an error. Field introduced in 17.2.13, 18.1.5, 18.2.1.
   * @return excludeSipErrorCodes
  **/
  @ApiModelProperty(value = "List of SIP status codes to be excluded from being classified as an error. Field introduced in 17.2.13, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public List<Integer> getExcludeSipErrorCodes() {
    return excludeSipErrorCodes;
  }
    
  @VsoMethod
  public void setExcludeSipErrorCodes(List<Integer> excludeSipErrorCodes) {
    this.excludeSipErrorCodes = excludeSipErrorCodes;
  }

  
  /**
   * Exclude 'server unanswered syns' from the list of errors.
   * @return excludeSynRetransmitAsError
  **/
  @ApiModelProperty(value = "Exclude 'server unanswered syns' from the list of errors.")


 
  @VsoMethod  
  public Boolean isExcludeSynRetransmitAsError() {
    return excludeSynRetransmitAsError;
  }
    
  @VsoMethod
  public void setExcludeSynRetransmitAsError(Boolean excludeSynRetransmitAsError) {
    this.excludeSynRetransmitAsError = excludeSynRetransmitAsError;
  }

  
  /**
   * Exclude TCP resets by client from the list of potential errors.
   * @return excludeTcpResetAsError
  **/
  @ApiModelProperty(value = "Exclude TCP resets by client from the list of potential errors.")


 
  @VsoMethod  
  public Boolean isExcludeTcpResetAsError() {
    return excludeTcpResetAsError;
  }
    
  @VsoMethod
  public void setExcludeTcpResetAsError(Boolean excludeTcpResetAsError) {
    this.excludeTcpResetAsError = excludeTcpResetAsError;
  }

  
  /**
   * Exclude unsupported dns queries from the list of errors.
   * @return excludeUnsupportedDnsQueryAsError
  **/
  @ApiModelProperty(value = "Exclude unsupported dns queries from the list of errors.")


 
  @VsoMethod  
  public Boolean isExcludeUnsupportedDnsQueryAsError() {
    return excludeUnsupportedDnsQueryAsError;
  }
    
  @VsoMethod
  public void setExcludeUnsupportedDnsQueryAsError(Boolean excludeUnsupportedDnsQueryAsError) {
    this.excludeUnsupportedDnsQueryAsError = excludeUnsupportedDnsQueryAsError;
  }

  
  /**
   * Skips health score computation of pool servers when number of servers in a pool is more than this setting. Allowed values are 0-5000. Special values are 0- 'server health score is disabled'. Field introduced in 17.2.13, 18.1.4.
   * @return healthscoreMaxServerLimit
  **/
  @ApiModelProperty(value = "Skips health score computation of pool servers when number of servers in a pool is more than this setting. Allowed values are 0-5000. Special values are 0- 'server health score is disabled'. Field introduced in 17.2.13, 18.1.4.")


 
  @VsoMethod  
  public Integer getHealthscoreMaxServerLimit() {
    return healthscoreMaxServerLimit;
  }
    
  @VsoMethod
  public void setHealthscoreMaxServerLimit(Integer healthscoreMaxServerLimit) {
    this.healthscoreMaxServerLimit = healthscoreMaxServerLimit;
  }

  
  /**
   * Time window (in secs) within which only unique health change events should occur.
   * @return hsEventThrottleWindow
  **/
  @ApiModelProperty(value = "Time window (in secs) within which only unique health change events should occur.")


 
  @VsoMethod  
  public Integer getHsEventThrottleWindow() {
    return hsEventThrottleWindow;
  }
    
  @VsoMethod
  public void setHsEventThrottleWindow(Integer hsEventThrottleWindow) {
    this.hsEventThrottleWindow = hsEventThrottleWindow;
  }

  
  /**
   * Maximum penalty that may be deducted from health score for anomalies. Allowed values are 0-100.
   * @return hsMaxAnomalyPenalty
  **/
  @ApiModelProperty(value = "Maximum penalty that may be deducted from health score for anomalies. Allowed values are 0-100.")


 
  @VsoMethod  
  public Integer getHsMaxAnomalyPenalty() {
    return hsMaxAnomalyPenalty;
  }
    
  @VsoMethod
  public void setHsMaxAnomalyPenalty(Integer hsMaxAnomalyPenalty) {
    this.hsMaxAnomalyPenalty = hsMaxAnomalyPenalty;
  }

  
  /**
   * Maximum penalty that may be deducted from health score for high resource utilization. Allowed values are 0-100.
   * @return hsMaxResourcesPenalty
  **/
  @ApiModelProperty(value = "Maximum penalty that may be deducted from health score for high resource utilization. Allowed values are 0-100.")


 
  @VsoMethod  
  public Integer getHsMaxResourcesPenalty() {
    return hsMaxResourcesPenalty;
  }
    
  @VsoMethod
  public void setHsMaxResourcesPenalty(Integer hsMaxResourcesPenalty) {
    this.hsMaxResourcesPenalty = hsMaxResourcesPenalty;
  }

  
  /**
   * Maximum penalty that may be deducted from health score based on security assessment. Allowed values are 0-100.
   * @return hsMaxSecurityPenalty
  **/
  @ApiModelProperty(value = "Maximum penalty that may be deducted from health score based on security assessment. Allowed values are 0-100.")


 
  @VsoMethod  
  public Integer getHsMaxSecurityPenalty() {
    return hsMaxSecurityPenalty;
  }
    
  @VsoMethod
  public void setHsMaxSecurityPenalty(Integer hsMaxSecurityPenalty) {
    this.hsMaxSecurityPenalty = hsMaxSecurityPenalty;
  }

  
  /**
   * DoS connection rate below which the DoS security assessment will not kick in.
   * @return hsMinDosRate
  **/
  @ApiModelProperty(value = "DoS connection rate below which the DoS security assessment will not kick in.")


 
  @VsoMethod  
  public Integer getHsMinDosRate() {
    return hsMinDosRate;
  }
    
  @VsoMethod
  public void setHsMinDosRate(Integer hsMinDosRate) {
    this.hsMinDosRate = hsMinDosRate;
  }

  
  /**
   * Adds free performance score credits to health score. It can be used for compensating health score for known slow applications. Allowed values are 0-100.
   * @return hsPerformanceBoost
  **/
  @ApiModelProperty(value = "Adds free performance score credits to health score. It can be used for compensating health score for known slow applications. Allowed values are 0-100.")


 
  @VsoMethod  
  public Integer getHsPerformanceBoost() {
    return hsPerformanceBoost;
  }
    
  @VsoMethod
  public void setHsPerformanceBoost(Integer hsPerformanceBoost) {
    this.hsPerformanceBoost = hsPerformanceBoost;
  }

  
  /**
   * Threshold number of connections in 5min, below which apdexr, apdexc, rum_apdex, and other network quality metrics are not computed.
   * @return hsPscoreTrafficThresholdL4Client
  **/
  @ApiModelProperty(value = "Threshold number of connections in 5min, below which apdexr, apdexc, rum_apdex, and other network quality metrics are not computed.")


 
  @VsoMethod  
  public Double getHsPscoreTrafficThresholdL4Client() {
    return hsPscoreTrafficThresholdL4Client;
  }
    
  @VsoMethod
  public void setHsPscoreTrafficThresholdL4Client(Double hsPscoreTrafficThresholdL4Client) {
    this.hsPscoreTrafficThresholdL4Client = hsPscoreTrafficThresholdL4Client;
  }

  
  /**
   * Threshold number of connections in 5min, below which apdexr, apdexc, rum_apdex, and other network quality metrics are not computed.
   * @return hsPscoreTrafficThresholdL4Server
  **/
  @ApiModelProperty(value = "Threshold number of connections in 5min, below which apdexr, apdexc, rum_apdex, and other network quality metrics are not computed.")


 
  @VsoMethod  
  public Double getHsPscoreTrafficThresholdL4Server() {
    return hsPscoreTrafficThresholdL4Server;
  }
    
  @VsoMethod
  public void setHsPscoreTrafficThresholdL4Server(Double hsPscoreTrafficThresholdL4Server) {
    this.hsPscoreTrafficThresholdL4Server = hsPscoreTrafficThresholdL4Server;
  }

  
  /**
   * Score assigned when the certificate has expired. Allowed values are 0-5.
   * @return hsSecurityCertscoreExpired
  **/
  @ApiModelProperty(value = "Score assigned when the certificate has expired. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecurityCertscoreExpired() {
    return hsSecurityCertscoreExpired;
  }
    
  @VsoMethod
  public void setHsSecurityCertscoreExpired(Double hsSecurityCertscoreExpired) {
    this.hsSecurityCertscoreExpired = hsSecurityCertscoreExpired;
  }

  
  /**
   * Score assigned when the certificate expires in more than 30 days. Allowed values are 0-5.
   * @return hsSecurityCertscoreGt30d
  **/
  @ApiModelProperty(value = "Score assigned when the certificate expires in more than 30 days. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecurityCertscoreGt30d() {
    return hsSecurityCertscoreGt30d;
  }
    
  @VsoMethod
  public void setHsSecurityCertscoreGt30d(Double hsSecurityCertscoreGt30d) {
    this.hsSecurityCertscoreGt30d = hsSecurityCertscoreGt30d;
  }

  
  /**
   * Score assigned when the certificate expires in less than or equal to 7 days. Allowed values are 0-5.
   * @return hsSecurityCertscoreLe07d
  **/
  @ApiModelProperty(value = "Score assigned when the certificate expires in less than or equal to 7 days. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecurityCertscoreLe07d() {
    return hsSecurityCertscoreLe07d;
  }
    
  @VsoMethod
  public void setHsSecurityCertscoreLe07d(Double hsSecurityCertscoreLe07d) {
    this.hsSecurityCertscoreLe07d = hsSecurityCertscoreLe07d;
  }

  
  /**
   * Score assigned when the certificate expires in less than or equal to 30 days. Allowed values are 0-5.
   * @return hsSecurityCertscoreLe30d
  **/
  @ApiModelProperty(value = "Score assigned when the certificate expires in less than or equal to 30 days. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecurityCertscoreLe30d() {
    return hsSecurityCertscoreLe30d;
  }
    
  @VsoMethod
  public void setHsSecurityCertscoreLe30d(Double hsSecurityCertscoreLe30d) {
    this.hsSecurityCertscoreLe30d = hsSecurityCertscoreLe30d;
  }

  
  /**
   * Penalty for allowing certificates with invalid chain. Allowed values are 0-5.
   * @return hsSecurityChainInvalidityPenalty
  **/
  @ApiModelProperty(value = "Penalty for allowing certificates with invalid chain. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecurityChainInvalidityPenalty() {
    return hsSecurityChainInvalidityPenalty;
  }
    
  @VsoMethod
  public void setHsSecurityChainInvalidityPenalty(Double hsSecurityChainInvalidityPenalty) {
    this.hsSecurityChainInvalidityPenalty = hsSecurityChainInvalidityPenalty;
  }

  
  /**
   * Score assigned when the minimum cipher strength is 0 bits. Allowed values are 0-5.
   * @return hsSecurityCipherscoreEq000b
  **/
  @ApiModelProperty(value = "Score assigned when the minimum cipher strength is 0 bits. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecurityCipherscoreEq000b() {
    return hsSecurityCipherscoreEq000b;
  }
    
  @VsoMethod
  public void setHsSecurityCipherscoreEq000b(Double hsSecurityCipherscoreEq000b) {
    this.hsSecurityCipherscoreEq000b = hsSecurityCipherscoreEq000b;
  }

  
  /**
   * Score assigned when the minimum cipher strength is greater than equal to 128 bits. Allowed values are 0-5.
   * @return hsSecurityCipherscoreGe128b
  **/
  @ApiModelProperty(value = "Score assigned when the minimum cipher strength is greater than equal to 128 bits. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecurityCipherscoreGe128b() {
    return hsSecurityCipherscoreGe128b;
  }
    
  @VsoMethod
  public void setHsSecurityCipherscoreGe128b(Double hsSecurityCipherscoreGe128b) {
    this.hsSecurityCipherscoreGe128b = hsSecurityCipherscoreGe128b;
  }

  
  /**
   * Score assigned when the minimum cipher strength is less than 128 bits. Allowed values are 0-5.
   * @return hsSecurityCipherscoreLt128b
  **/
  @ApiModelProperty(value = "Score assigned when the minimum cipher strength is less than 128 bits. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecurityCipherscoreLt128b() {
    return hsSecurityCipherscoreLt128b;
  }
    
  @VsoMethod
  public void setHsSecurityCipherscoreLt128b(Double hsSecurityCipherscoreLt128b) {
    this.hsSecurityCipherscoreLt128b = hsSecurityCipherscoreLt128b;
  }

  
  /**
   * Score assigned when no algorithm is used for encryption. Allowed values are 0-5.
   * @return hsSecurityEncalgoScoreNone
  **/
  @ApiModelProperty(value = "Score assigned when no algorithm is used for encryption. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecurityEncalgoScoreNone() {
    return hsSecurityEncalgoScoreNone;
  }
    
  @VsoMethod
  public void setHsSecurityEncalgoScoreNone(Double hsSecurityEncalgoScoreNone) {
    this.hsSecurityEncalgoScoreNone = hsSecurityEncalgoScoreNone;
  }

  
  /**
   * Score assigned when RC4 algorithm is used for encryption. Allowed values are 0-5.
   * @return hsSecurityEncalgoScoreRc4
  **/
  @ApiModelProperty(value = "Score assigned when RC4 algorithm is used for encryption. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecurityEncalgoScoreRc4() {
    return hsSecurityEncalgoScoreRc4;
  }
    
  @VsoMethod
  public void setHsSecurityEncalgoScoreRc4(Double hsSecurityEncalgoScoreRc4) {
    this.hsSecurityEncalgoScoreRc4 = hsSecurityEncalgoScoreRc4;
  }

  
  /**
   * Penalty for not enabling HSTS. Allowed values are 0-5.
   * @return hsSecurityHstsPenalty
  **/
  @ApiModelProperty(value = "Penalty for not enabling HSTS. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecurityHstsPenalty() {
    return hsSecurityHstsPenalty;
  }
    
  @VsoMethod
  public void setHsSecurityHstsPenalty(Double hsSecurityHstsPenalty) {
    this.hsSecurityHstsPenalty = hsSecurityHstsPenalty;
  }

  
  /**
   * Penalty for allowing non-PFS handshakes. Allowed values are 0-5.
   * @return hsSecurityNonpfsPenalty
  **/
  @ApiModelProperty(value = "Penalty for allowing non-PFS handshakes. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecurityNonpfsPenalty() {
    return hsSecurityNonpfsPenalty;
  }
    
  @VsoMethod
  public void setHsSecurityNonpfsPenalty(Double hsSecurityNonpfsPenalty) {
    this.hsSecurityNonpfsPenalty = hsSecurityNonpfsPenalty;
  }

  
  /**
   * Deprecated. Allowed values are 0-5.
   * @return hsSecuritySelfsignedcertPenalty
  **/
  @ApiModelProperty(value = "Deprecated. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecuritySelfsignedcertPenalty() {
    return hsSecuritySelfsignedcertPenalty;
  }
    
  @VsoMethod
  public void setHsSecuritySelfsignedcertPenalty(Double hsSecuritySelfsignedcertPenalty) {
    this.hsSecuritySelfsignedcertPenalty = hsSecuritySelfsignedcertPenalty;
  }

  
  /**
   * Score assigned when supporting SSL3.0 encryption protocol. Allowed values are 0-5.
   * @return hsSecuritySsl30Score
  **/
  @ApiModelProperty(value = "Score assigned when supporting SSL3.0 encryption protocol. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecuritySsl30Score() {
    return hsSecuritySsl30Score;
  }
    
  @VsoMethod
  public void setHsSecuritySsl30Score(Double hsSecuritySsl30Score) {
    this.hsSecuritySsl30Score = hsSecuritySsl30Score;
  }

  
  /**
   * Score assigned when supporting TLS1.0 encryption protocol. Allowed values are 0-5.
   * @return hsSecurityTls10Score
  **/
  @ApiModelProperty(value = "Score assigned when supporting TLS1.0 encryption protocol. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecurityTls10Score() {
    return hsSecurityTls10Score;
  }
    
  @VsoMethod
  public void setHsSecurityTls10Score(Double hsSecurityTls10Score) {
    this.hsSecurityTls10Score = hsSecurityTls10Score;
  }

  
  /**
   * Score assigned when supporting TLS1.1 encryption protocol. Allowed values are 0-5.
   * @return hsSecurityTls11Score
  **/
  @ApiModelProperty(value = "Score assigned when supporting TLS1.1 encryption protocol. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecurityTls11Score() {
    return hsSecurityTls11Score;
  }
    
  @VsoMethod
  public void setHsSecurityTls11Score(Double hsSecurityTls11Score) {
    this.hsSecurityTls11Score = hsSecurityTls11Score;
  }

  
  /**
   * Score assigned when supporting TLS1.2 encryption protocol. Allowed values are 0-5.
   * @return hsSecurityTls12Score
  **/
  @ApiModelProperty(value = "Score assigned when supporting TLS1.2 encryption protocol. Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecurityTls12Score() {
    return hsSecurityTls12Score;
  }
    
  @VsoMethod
  public void setHsSecurityTls12Score(Double hsSecurityTls12Score) {
    this.hsSecurityTls12Score = hsSecurityTls12Score;
  }

  
  /**
   * Score assigned when supporting TLS1.3 encryption protocol. Allowed values are 0-5. Field introduced in 18.2.6.
   * @return hsSecurityTls13Score
  **/
  @ApiModelProperty(readOnly = true, value = "Score assigned when supporting TLS1.3 encryption protocol. Allowed values are 0-5. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Double getHsSecurityTls13Score() {
    return hsSecurityTls13Score;
  }
    
  @VsoMethod
  public void setHsSecurityTls13Score(Double hsSecurityTls13Score) {
    this.hsSecurityTls13Score = hsSecurityTls13Score;
  }

  
  /**
   * Penalty for allowing weak signature algorithm(s). Allowed values are 0-5.
   * @return hsSecurityWeakSignatureAlgoPenalty
  **/
  @ApiModelProperty(value = "Penalty for allowing weak signature algorithm(s). Allowed values are 0-5.")


 
  @VsoMethod  
  public Double getHsSecurityWeakSignatureAlgoPenalty() {
    return hsSecurityWeakSignatureAlgoPenalty;
  }
    
  @VsoMethod
  public void setHsSecurityWeakSignatureAlgoPenalty(Double hsSecurityWeakSignatureAlgoPenalty) {
    this.hsSecurityWeakSignatureAlgoPenalty = hsSecurityWeakSignatureAlgoPenalty;
  }

  
  /**
   * The name of the analytics profile.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the analytics profile.")
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
   * This flag sets the time duration of no live data traffic after which Virtual Service metrics processing is suspended. It is applicable only when disable_ondemand_metrics is set to false. Field introduced in 18.1.1.
   * @return ondemandMetricsIdleTimeout
  **/
  @ApiModelProperty(value = "This flag sets the time duration of no live data traffic after which Virtual Service metrics processing is suspended. It is applicable only when disable_ondemand_metrics is set to false. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Integer getOndemandMetricsIdleTimeout() {
    return ondemandMetricsIdleTimeout;
  }
    
  @VsoMethod
  public void setOndemandMetricsIdleTimeout(Integer ondemandMetricsIdleTimeout) {
    this.ondemandMetricsIdleTimeout = ondemandMetricsIdleTimeout;
  }

  
  public AnalyticsProfile addRangesItem(HTTPStatusRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<HTTPStatusRange>();
    }
    this.ranges.add(rangesItem);
    return this;
  }
  
  /**
   * List of HTTP status code ranges to be excluded from being classified as an error.
   * @return ranges
  **/
  @ApiModelProperty(value = "List of HTTP status code ranges to be excluded from being classified as an error.")

  @Valid

 
  @VsoMethod  
  public List<HTTPStatusRange> getRanges() {
    return ranges;
  }
    
  @VsoMethod
  public void setRanges(List<HTTPStatusRange> ranges) {
    this.ranges = ranges;
  }

  
  public AnalyticsProfile addRespCodeBlockItem(String respCodeBlockItem) {
    if (this.respCodeBlock == null) {
      this.respCodeBlock = new ArrayList<String>();
    }
    this.respCodeBlock.add(respCodeBlockItem);
    return this;
  }
  
  /**
   * Block of HTTP response codes to be excluded from being classified as an error. Enum options - AP_HTTP_RSP_4XX, AP_HTTP_RSP_5XX.
   * @return respCodeBlock
  **/
  @ApiModelProperty(value = "Block of HTTP response codes to be excluded from being classified as an error. Enum options - AP_HTTP_RSP_4XX, AP_HTTP_RSP_5XX.")


 
  @VsoMethod  
  public List<String> getRespCodeBlock() {
    return respCodeBlock;
  }
    
  @VsoMethod
  public void setRespCodeBlock(List<String> respCodeBlock) {
    this.respCodeBlock = respCodeBlock;
  }

  
  /**
   * Rules applied to the HTTP application log for filtering sensitive information. Field introduced in 17.2.10, 18.1.2.
   * @return sensitiveLogProfile
  **/
  @ApiModelProperty(value = "Rules applied to the HTTP application log for filtering sensitive information. Field introduced in 17.2.10, 18.1.2.")

  @Valid

 
  @VsoMethod  
  public SensitiveLogProfile getSensitiveLogProfile() {
    return sensitiveLogProfile;
  }
    
  @VsoMethod
  public void setSensitiveLogProfile(SensitiveLogProfile sensitiveLogProfile) {
    this.sensitiveLogProfile = sensitiveLogProfile;
  }

  
  /**
   * Maximum number of SIP messages added in logs for a SIP transaction. By default, this value is 20. Allowed values are 1-1000. Field introduced in 17.2.13, 18.1.5, 18.2.1.
   * @return sipLogDepth
  **/
  @ApiModelProperty(value = "Maximum number of SIP messages added in logs for a SIP transaction. By default, this value is 20. Allowed values are 1-1000. Field introduced in 17.2.13, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public Integer getSipLogDepth() {
    return sipLogDepth;
  }
    
  @VsoMethod
  public void setSipLogDepth(Integer sipLogDepth) {
    this.sipLogDepth = sipLogDepth;
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
   * UUID of the analytics profile.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the analytics profile.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "AnalyticsProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsProfile analyticsProfile = (AnalyticsProfile) o;
    return Objects.equals(this.lastModified, analyticsProfile.lastModified) &&
        Objects.equals(this.apdexResponseThreshold, analyticsProfile.apdexResponseThreshold) &&
        Objects.equals(this.apdexResponseToleratedFactor, analyticsProfile.apdexResponseToleratedFactor) &&
        Objects.equals(this.apdexRttThreshold, analyticsProfile.apdexRttThreshold) &&
        Objects.equals(this.apdexRttToleratedFactor, analyticsProfile.apdexRttToleratedFactor) &&
        Objects.equals(this.apdexRumThreshold, analyticsProfile.apdexRumThreshold) &&
        Objects.equals(this.apdexRumToleratedFactor, analyticsProfile.apdexRumToleratedFactor) &&
        Objects.equals(this.apdexServerResponseThreshold, analyticsProfile.apdexServerResponseThreshold) &&
        Objects.equals(this.apdexServerResponseToleratedFactor, analyticsProfile.apdexServerResponseToleratedFactor) &&
        Objects.equals(this.apdexServerRttThreshold, analyticsProfile.apdexServerRttThreshold) &&
        Objects.equals(this.apdexServerRttToleratedFactor, analyticsProfile.apdexServerRttToleratedFactor) &&
        Objects.equals(this.clientLogConfig, analyticsProfile.clientLogConfig) &&
        Objects.equals(this.clientLogStreamingConfig, analyticsProfile.clientLogStreamingConfig) &&
        Objects.equals(this.connLossyOooThreshold, analyticsProfile.connLossyOooThreshold) &&
        Objects.equals(this.connLossyTimeoRexmtThreshold, analyticsProfile.connLossyTimeoRexmtThreshold) &&
        Objects.equals(this.connLossyTotalRexmtThreshold, analyticsProfile.connLossyTotalRexmtThreshold) &&
        Objects.equals(this.connLossyZeroWinSizeEventThreshold, analyticsProfile.connLossyZeroWinSizeEventThreshold) &&
        Objects.equals(this.connServerLossyOooThreshold, analyticsProfile.connServerLossyOooThreshold) &&
        Objects.equals(this.connServerLossyTimeoRexmtThreshold, analyticsProfile.connServerLossyTimeoRexmtThreshold) &&
        Objects.equals(this.connServerLossyTotalRexmtThreshold, analyticsProfile.connServerLossyTotalRexmtThreshold) &&
        Objects.equals(this.connServerLossyZeroWinSizeEventThreshold, analyticsProfile.connServerLossyZeroWinSizeEventThreshold) &&
        Objects.equals(this.description, analyticsProfile.description) &&
        Objects.equals(this.disableOndemandMetrics, analyticsProfile.disableOndemandMetrics) &&
        Objects.equals(this.disableSeAnalytics, analyticsProfile.disableSeAnalytics) &&
        Objects.equals(this.disableServerAnalytics, analyticsProfile.disableServerAnalytics) &&
        Objects.equals(this.disableVsAnalytics, analyticsProfile.disableVsAnalytics) &&
        Objects.equals(this.enableAdvancedAnalytics, analyticsProfile.enableAdvancedAnalytics) &&
        Objects.equals(this.excludeClientCloseBeforeRequestAsError, analyticsProfile.excludeClientCloseBeforeRequestAsError) &&
        Objects.equals(this.excludeDnsPolicyDropAsSignificant, analyticsProfile.excludeDnsPolicyDropAsSignificant) &&
        Objects.equals(this.excludeGsDownAsError, analyticsProfile.excludeGsDownAsError) &&
        Objects.equals(this.excludeHttpErrorCodes, analyticsProfile.excludeHttpErrorCodes) &&
        Objects.equals(this.excludeInvalidDnsDomainAsError, analyticsProfile.excludeInvalidDnsDomainAsError) &&
        Objects.equals(this.excludeInvalidDnsQueryAsError, analyticsProfile.excludeInvalidDnsQueryAsError) &&
        Objects.equals(this.excludeNoDnsRecordAsError, analyticsProfile.excludeNoDnsRecordAsError) &&
        Objects.equals(this.excludeNoValidGsMemberAsError, analyticsProfile.excludeNoValidGsMemberAsError) &&
        Objects.equals(this.excludePersistenceChangeAsError, analyticsProfile.excludePersistenceChangeAsError) &&
        Objects.equals(this.excludeServerDnsErrorAsError, analyticsProfile.excludeServerDnsErrorAsError) &&
        Objects.equals(this.excludeServerTcpResetAsError, analyticsProfile.excludeServerTcpResetAsError) &&
        Objects.equals(this.excludeSipErrorCodes, analyticsProfile.excludeSipErrorCodes) &&
        Objects.equals(this.excludeSynRetransmitAsError, analyticsProfile.excludeSynRetransmitAsError) &&
        Objects.equals(this.excludeTcpResetAsError, analyticsProfile.excludeTcpResetAsError) &&
        Objects.equals(this.excludeUnsupportedDnsQueryAsError, analyticsProfile.excludeUnsupportedDnsQueryAsError) &&
        Objects.equals(this.healthscoreMaxServerLimit, analyticsProfile.healthscoreMaxServerLimit) &&
        Objects.equals(this.hsEventThrottleWindow, analyticsProfile.hsEventThrottleWindow) &&
        Objects.equals(this.hsMaxAnomalyPenalty, analyticsProfile.hsMaxAnomalyPenalty) &&
        Objects.equals(this.hsMaxResourcesPenalty, analyticsProfile.hsMaxResourcesPenalty) &&
        Objects.equals(this.hsMaxSecurityPenalty, analyticsProfile.hsMaxSecurityPenalty) &&
        Objects.equals(this.hsMinDosRate, analyticsProfile.hsMinDosRate) &&
        Objects.equals(this.hsPerformanceBoost, analyticsProfile.hsPerformanceBoost) &&
        Objects.equals(this.hsPscoreTrafficThresholdL4Client, analyticsProfile.hsPscoreTrafficThresholdL4Client) &&
        Objects.equals(this.hsPscoreTrafficThresholdL4Server, analyticsProfile.hsPscoreTrafficThresholdL4Server) &&
        Objects.equals(this.hsSecurityCertscoreExpired, analyticsProfile.hsSecurityCertscoreExpired) &&
        Objects.equals(this.hsSecurityCertscoreGt30d, analyticsProfile.hsSecurityCertscoreGt30d) &&
        Objects.equals(this.hsSecurityCertscoreLe07d, analyticsProfile.hsSecurityCertscoreLe07d) &&
        Objects.equals(this.hsSecurityCertscoreLe30d, analyticsProfile.hsSecurityCertscoreLe30d) &&
        Objects.equals(this.hsSecurityChainInvalidityPenalty, analyticsProfile.hsSecurityChainInvalidityPenalty) &&
        Objects.equals(this.hsSecurityCipherscoreEq000b, analyticsProfile.hsSecurityCipherscoreEq000b) &&
        Objects.equals(this.hsSecurityCipherscoreGe128b, analyticsProfile.hsSecurityCipherscoreGe128b) &&
        Objects.equals(this.hsSecurityCipherscoreLt128b, analyticsProfile.hsSecurityCipherscoreLt128b) &&
        Objects.equals(this.hsSecurityEncalgoScoreNone, analyticsProfile.hsSecurityEncalgoScoreNone) &&
        Objects.equals(this.hsSecurityEncalgoScoreRc4, analyticsProfile.hsSecurityEncalgoScoreRc4) &&
        Objects.equals(this.hsSecurityHstsPenalty, analyticsProfile.hsSecurityHstsPenalty) &&
        Objects.equals(this.hsSecurityNonpfsPenalty, analyticsProfile.hsSecurityNonpfsPenalty) &&
        Objects.equals(this.hsSecuritySelfsignedcertPenalty, analyticsProfile.hsSecuritySelfsignedcertPenalty) &&
        Objects.equals(this.hsSecuritySsl30Score, analyticsProfile.hsSecuritySsl30Score) &&
        Objects.equals(this.hsSecurityTls10Score, analyticsProfile.hsSecurityTls10Score) &&
        Objects.equals(this.hsSecurityTls11Score, analyticsProfile.hsSecurityTls11Score) &&
        Objects.equals(this.hsSecurityTls12Score, analyticsProfile.hsSecurityTls12Score) &&
        Objects.equals(this.hsSecurityTls13Score, analyticsProfile.hsSecurityTls13Score) &&
        Objects.equals(this.hsSecurityWeakSignatureAlgoPenalty, analyticsProfile.hsSecurityWeakSignatureAlgoPenalty) &&
        Objects.equals(this.name, analyticsProfile.name) &&
        Objects.equals(this.ondemandMetricsIdleTimeout, analyticsProfile.ondemandMetricsIdleTimeout) &&
        Objects.equals(this.ranges, analyticsProfile.ranges) &&
        Objects.equals(this.respCodeBlock, analyticsProfile.respCodeBlock) &&
        Objects.equals(this.sensitiveLogProfile, analyticsProfile.sensitiveLogProfile) &&
        Objects.equals(this.sipLogDepth, analyticsProfile.sipLogDepth) &&
        Objects.equals(this.tenantRef, analyticsProfile.tenantRef) &&
        Objects.equals(this.url, analyticsProfile.url) &&
        Objects.equals(this.uuid, analyticsProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, apdexResponseThreshold, apdexResponseToleratedFactor, apdexRttThreshold, apdexRttToleratedFactor, apdexRumThreshold, apdexRumToleratedFactor, apdexServerResponseThreshold, apdexServerResponseToleratedFactor, apdexServerRttThreshold, apdexServerRttToleratedFactor, clientLogConfig, clientLogStreamingConfig, connLossyOooThreshold, connLossyTimeoRexmtThreshold, connLossyTotalRexmtThreshold, connLossyZeroWinSizeEventThreshold, connServerLossyOooThreshold, connServerLossyTimeoRexmtThreshold, connServerLossyTotalRexmtThreshold, connServerLossyZeroWinSizeEventThreshold, description, disableOndemandMetrics, disableSeAnalytics, disableServerAnalytics, disableVsAnalytics, enableAdvancedAnalytics, excludeClientCloseBeforeRequestAsError, excludeDnsPolicyDropAsSignificant, excludeGsDownAsError, excludeHttpErrorCodes, excludeInvalidDnsDomainAsError, excludeInvalidDnsQueryAsError, excludeNoDnsRecordAsError, excludeNoValidGsMemberAsError, excludePersistenceChangeAsError, excludeServerDnsErrorAsError, excludeServerTcpResetAsError, excludeSipErrorCodes, excludeSynRetransmitAsError, excludeTcpResetAsError, excludeUnsupportedDnsQueryAsError, healthscoreMaxServerLimit, hsEventThrottleWindow, hsMaxAnomalyPenalty, hsMaxResourcesPenalty, hsMaxSecurityPenalty, hsMinDosRate, hsPerformanceBoost, hsPscoreTrafficThresholdL4Client, hsPscoreTrafficThresholdL4Server, hsSecurityCertscoreExpired, hsSecurityCertscoreGt30d, hsSecurityCertscoreLe07d, hsSecurityCertscoreLe30d, hsSecurityChainInvalidityPenalty, hsSecurityCipherscoreEq000b, hsSecurityCipherscoreGe128b, hsSecurityCipherscoreLt128b, hsSecurityEncalgoScoreNone, hsSecurityEncalgoScoreRc4, hsSecurityHstsPenalty, hsSecurityNonpfsPenalty, hsSecuritySelfsignedcertPenalty, hsSecuritySsl30Score, hsSecurityTls10Score, hsSecurityTls11Score, hsSecurityTls12Score, hsSecurityTls13Score, hsSecurityWeakSignatureAlgoPenalty, name, ondemandMetricsIdleTimeout, ranges, respCodeBlock, sensitiveLogProfile, sipLogDepth, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsProfile {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    apdexResponseThreshold: ").append(toIndentedString(apdexResponseThreshold)).append("\n");
    sb.append("    apdexResponseToleratedFactor: ").append(toIndentedString(apdexResponseToleratedFactor)).append("\n");
    sb.append("    apdexRttThreshold: ").append(toIndentedString(apdexRttThreshold)).append("\n");
    sb.append("    apdexRttToleratedFactor: ").append(toIndentedString(apdexRttToleratedFactor)).append("\n");
    sb.append("    apdexRumThreshold: ").append(toIndentedString(apdexRumThreshold)).append("\n");
    sb.append("    apdexRumToleratedFactor: ").append(toIndentedString(apdexRumToleratedFactor)).append("\n");
    sb.append("    apdexServerResponseThreshold: ").append(toIndentedString(apdexServerResponseThreshold)).append("\n");
    sb.append("    apdexServerResponseToleratedFactor: ").append(toIndentedString(apdexServerResponseToleratedFactor)).append("\n");
    sb.append("    apdexServerRttThreshold: ").append(toIndentedString(apdexServerRttThreshold)).append("\n");
    sb.append("    apdexServerRttToleratedFactor: ").append(toIndentedString(apdexServerRttToleratedFactor)).append("\n");
    sb.append("    clientLogConfig: ").append(toIndentedString(clientLogConfig)).append("\n");
    sb.append("    clientLogStreamingConfig: ").append(toIndentedString(clientLogStreamingConfig)).append("\n");
    sb.append("    connLossyOooThreshold: ").append(toIndentedString(connLossyOooThreshold)).append("\n");
    sb.append("    connLossyTimeoRexmtThreshold: ").append(toIndentedString(connLossyTimeoRexmtThreshold)).append("\n");
    sb.append("    connLossyTotalRexmtThreshold: ").append(toIndentedString(connLossyTotalRexmtThreshold)).append("\n");
    sb.append("    connLossyZeroWinSizeEventThreshold: ").append(toIndentedString(connLossyZeroWinSizeEventThreshold)).append("\n");
    sb.append("    connServerLossyOooThreshold: ").append(toIndentedString(connServerLossyOooThreshold)).append("\n");
    sb.append("    connServerLossyTimeoRexmtThreshold: ").append(toIndentedString(connServerLossyTimeoRexmtThreshold)).append("\n");
    sb.append("    connServerLossyTotalRexmtThreshold: ").append(toIndentedString(connServerLossyTotalRexmtThreshold)).append("\n");
    sb.append("    connServerLossyZeroWinSizeEventThreshold: ").append(toIndentedString(connServerLossyZeroWinSizeEventThreshold)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disableOndemandMetrics: ").append(toIndentedString(disableOndemandMetrics)).append("\n");
    sb.append("    disableSeAnalytics: ").append(toIndentedString(disableSeAnalytics)).append("\n");
    sb.append("    disableServerAnalytics: ").append(toIndentedString(disableServerAnalytics)).append("\n");
    sb.append("    disableVsAnalytics: ").append(toIndentedString(disableVsAnalytics)).append("\n");
    sb.append("    enableAdvancedAnalytics: ").append(toIndentedString(enableAdvancedAnalytics)).append("\n");
    sb.append("    excludeClientCloseBeforeRequestAsError: ").append(toIndentedString(excludeClientCloseBeforeRequestAsError)).append("\n");
    sb.append("    excludeDnsPolicyDropAsSignificant: ").append(toIndentedString(excludeDnsPolicyDropAsSignificant)).append("\n");
    sb.append("    excludeGsDownAsError: ").append(toIndentedString(excludeGsDownAsError)).append("\n");
    sb.append("    excludeHttpErrorCodes: ").append(toIndentedString(excludeHttpErrorCodes)).append("\n");
    sb.append("    excludeInvalidDnsDomainAsError: ").append(toIndentedString(excludeInvalidDnsDomainAsError)).append("\n");
    sb.append("    excludeInvalidDnsQueryAsError: ").append(toIndentedString(excludeInvalidDnsQueryAsError)).append("\n");
    sb.append("    excludeNoDnsRecordAsError: ").append(toIndentedString(excludeNoDnsRecordAsError)).append("\n");
    sb.append("    excludeNoValidGsMemberAsError: ").append(toIndentedString(excludeNoValidGsMemberAsError)).append("\n");
    sb.append("    excludePersistenceChangeAsError: ").append(toIndentedString(excludePersistenceChangeAsError)).append("\n");
    sb.append("    excludeServerDnsErrorAsError: ").append(toIndentedString(excludeServerDnsErrorAsError)).append("\n");
    sb.append("    excludeServerTcpResetAsError: ").append(toIndentedString(excludeServerTcpResetAsError)).append("\n");
    sb.append("    excludeSipErrorCodes: ").append(toIndentedString(excludeSipErrorCodes)).append("\n");
    sb.append("    excludeSynRetransmitAsError: ").append(toIndentedString(excludeSynRetransmitAsError)).append("\n");
    sb.append("    excludeTcpResetAsError: ").append(toIndentedString(excludeTcpResetAsError)).append("\n");
    sb.append("    excludeUnsupportedDnsQueryAsError: ").append(toIndentedString(excludeUnsupportedDnsQueryAsError)).append("\n");
    sb.append("    healthscoreMaxServerLimit: ").append(toIndentedString(healthscoreMaxServerLimit)).append("\n");
    sb.append("    hsEventThrottleWindow: ").append(toIndentedString(hsEventThrottleWindow)).append("\n");
    sb.append("    hsMaxAnomalyPenalty: ").append(toIndentedString(hsMaxAnomalyPenalty)).append("\n");
    sb.append("    hsMaxResourcesPenalty: ").append(toIndentedString(hsMaxResourcesPenalty)).append("\n");
    sb.append("    hsMaxSecurityPenalty: ").append(toIndentedString(hsMaxSecurityPenalty)).append("\n");
    sb.append("    hsMinDosRate: ").append(toIndentedString(hsMinDosRate)).append("\n");
    sb.append("    hsPerformanceBoost: ").append(toIndentedString(hsPerformanceBoost)).append("\n");
    sb.append("    hsPscoreTrafficThresholdL4Client: ").append(toIndentedString(hsPscoreTrafficThresholdL4Client)).append("\n");
    sb.append("    hsPscoreTrafficThresholdL4Server: ").append(toIndentedString(hsPscoreTrafficThresholdL4Server)).append("\n");
    sb.append("    hsSecurityCertscoreExpired: ").append(toIndentedString(hsSecurityCertscoreExpired)).append("\n");
    sb.append("    hsSecurityCertscoreGt30d: ").append(toIndentedString(hsSecurityCertscoreGt30d)).append("\n");
    sb.append("    hsSecurityCertscoreLe07d: ").append(toIndentedString(hsSecurityCertscoreLe07d)).append("\n");
    sb.append("    hsSecurityCertscoreLe30d: ").append(toIndentedString(hsSecurityCertscoreLe30d)).append("\n");
    sb.append("    hsSecurityChainInvalidityPenalty: ").append(toIndentedString(hsSecurityChainInvalidityPenalty)).append("\n");
    sb.append("    hsSecurityCipherscoreEq000b: ").append(toIndentedString(hsSecurityCipherscoreEq000b)).append("\n");
    sb.append("    hsSecurityCipherscoreGe128b: ").append(toIndentedString(hsSecurityCipherscoreGe128b)).append("\n");
    sb.append("    hsSecurityCipherscoreLt128b: ").append(toIndentedString(hsSecurityCipherscoreLt128b)).append("\n");
    sb.append("    hsSecurityEncalgoScoreNone: ").append(toIndentedString(hsSecurityEncalgoScoreNone)).append("\n");
    sb.append("    hsSecurityEncalgoScoreRc4: ").append(toIndentedString(hsSecurityEncalgoScoreRc4)).append("\n");
    sb.append("    hsSecurityHstsPenalty: ").append(toIndentedString(hsSecurityHstsPenalty)).append("\n");
    sb.append("    hsSecurityNonpfsPenalty: ").append(toIndentedString(hsSecurityNonpfsPenalty)).append("\n");
    sb.append("    hsSecuritySelfsignedcertPenalty: ").append(toIndentedString(hsSecuritySelfsignedcertPenalty)).append("\n");
    sb.append("    hsSecuritySsl30Score: ").append(toIndentedString(hsSecuritySsl30Score)).append("\n");
    sb.append("    hsSecurityTls10Score: ").append(toIndentedString(hsSecurityTls10Score)).append("\n");
    sb.append("    hsSecurityTls11Score: ").append(toIndentedString(hsSecurityTls11Score)).append("\n");
    sb.append("    hsSecurityTls12Score: ").append(toIndentedString(hsSecurityTls12Score)).append("\n");
    sb.append("    hsSecurityTls13Score: ").append(toIndentedString(hsSecurityTls13Score)).append("\n");
    sb.append("    hsSecurityWeakSignatureAlgoPenalty: ").append(toIndentedString(hsSecurityWeakSignatureAlgoPenalty)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ondemandMetricsIdleTimeout: ").append(toIndentedString(ondemandMetricsIdleTimeout)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    respCodeBlock: ").append(toIndentedString(respCodeBlock)).append("\n");
    sb.append("    sensitiveLogProfile: ").append(toIndentedString(sensitiveLogProfile)).append("\n");
    sb.append("    sipLogDepth: ").append(toIndentedString(sipLogDepth)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

