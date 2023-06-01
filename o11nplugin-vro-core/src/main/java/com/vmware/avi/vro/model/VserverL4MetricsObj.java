package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VserverL4MetricsObj is a POJO class extends AviRestResource that used for creating
 * VserverL4MetricsObj.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VserverL4MetricsObj")
@VsoFinder(name = Constants.FINDER_VRO_VSERVERL4METRICSOBJ)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VserverL4MetricsObj extends AviRestResource {
    @JsonProperty("apdexc")
    @JsonInclude(Include.NON_NULL)
    private Float apdexc = null;

    @JsonProperty("apdexrtt")
    @JsonInclude(Include.NON_NULL)
    private Float apdexrtt = null;

    @JsonProperty("avg_application_dos_attacks")
    @JsonInclude(Include.NON_NULL)
    private Float avgApplicationDosAttacks = null;

    @JsonProperty("avg_bandwidth")
    @JsonInclude(Include.NON_NULL)
    private Float avgBandwidth = null;

    @JsonProperty("avg_bytes_policy_drops")
    @JsonInclude(Include.NON_NULL)
    private Float avgBytesPolicyDrops = null;

    @JsonProperty("avg_complete_conns")
    @JsonInclude(Include.NON_NULL)
    private Float avgCompleteConns = null;

    @JsonProperty("avg_connections_dropped")
    @JsonInclude(Include.NON_NULL)
    private Float avgConnectionsDropped = null;

    @JsonProperty("avg_dos_app_error")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosAppError = null;

    @JsonProperty("avg_dos_attacks")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosAttacks = null;

    @JsonProperty("avg_dos_bad_rst_flood")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosBadRstFlood = null;

    @JsonProperty("avg_dos_bandwidth")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosBandwidth = null;

    @JsonProperty("avg_dos_conn")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosConn = null;

    @JsonProperty("avg_dos_conn_ip_rl_drop")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosConnIpRlDrop = null;

    @JsonProperty("avg_dos_conn_rl_drop")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosConnRlDrop = null;

    @JsonProperty("avg_dos_fake_session")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosFakeSession = null;

    @JsonProperty("avg_dos_http_abort")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosHttpAbort = null;

    @JsonProperty("avg_dos_http_error")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosHttpError = null;

    @JsonProperty("avg_dos_http_timeout")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosHttpTimeout = null;

    @JsonProperty("avg_dos_malformed_flood")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosMalformedFlood = null;

    @JsonProperty("avg_dos_non_syn_flood")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosNonSynFlood = null;

    @JsonProperty("avg_dos_req")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosReq = null;

    @JsonProperty("avg_dos_req_cookie_rl_drop")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosReqCookieRlDrop = null;

    @JsonProperty("avg_dos_req_custom_rl_drop")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosReqCustomRlDrop = null;

    @JsonProperty("avg_dos_req_hdr_rl_drop")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosReqHdrRlDrop = null;

    @JsonProperty("avg_dos_req_ip_rl_drop")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosReqIpRlDrop = null;

    @JsonProperty("avg_dos_req_ip_rl_drop_bad")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosReqIpRlDropBad = null;

    @JsonProperty("avg_dos_req_ip_scan_bad_rl_drop")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosReqIpScanBadRlDrop = null;

    @JsonProperty("avg_dos_req_ip_scan_unknown_rl_drop")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosReqIpScanUnknownRlDrop = null;

    @JsonProperty("avg_dos_req_ip_uri_rl_drop")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosReqIpUriRlDrop = null;

    @JsonProperty("avg_dos_req_ip_uri_rl_drop_bad")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosReqIpUriRlDropBad = null;

    @JsonProperty("avg_dos_req_rl_drop")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosReqRlDrop = null;

    @JsonProperty("avg_dos_req_uri_rl_drop")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosReqUriRlDrop = null;

    @JsonProperty("avg_dos_req_uri_rl_drop_bad")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosReqUriRlDropBad = null;

    @JsonProperty("avg_dos_req_uri_scan_bad_rl_drop")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosReqUriScanBadRlDrop = null;

    @JsonProperty("avg_dos_req_uri_scan_unknown_rl_drop")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosReqUriScanUnknownRlDrop = null;

    @JsonProperty("avg_dos_rx_bytes")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosRxBytes = null;

    @JsonProperty("avg_dos_slow_uri")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosSlowUri = null;

    @JsonProperty("avg_dos_small_window_stress")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosSmallWindowStress = null;

    @JsonProperty("avg_dos_ssl_error")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosSslError = null;

    @JsonProperty("avg_dos_syn_flood")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosSynFlood = null;

    @JsonProperty("avg_dos_total_req")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosTotalReq = null;

    @JsonProperty("avg_dos_tx_bytes")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosTxBytes = null;

    @JsonProperty("avg_dos_zero_window_stress")
    @JsonInclude(Include.NON_NULL)
    private Float avgDosZeroWindowStress = null;

    @JsonProperty("avg_errored_connections")
    @JsonInclude(Include.NON_NULL)
    private Float avgErroredConnections = null;

    @JsonProperty("avg_half_open_conns")
    @JsonInclude(Include.NON_NULL)
    private Float avgHalfOpenConns = null;

    @JsonProperty("avg_l4_client_latency")
    @JsonInclude(Include.NON_NULL)
    private Float avgL4ClientLatency = null;

    @JsonProperty("avg_lossy_connections")
    @JsonInclude(Include.NON_NULL)
    private Float avgLossyConnections = null;

    @JsonProperty("avg_lossy_req")
    @JsonInclude(Include.NON_NULL)
    private Float avgLossyReq = null;

    @JsonProperty("avg_network_dos_attacks")
    @JsonInclude(Include.NON_NULL)
    private Float avgNetworkDosAttacks = null;

    @JsonProperty("avg_new_established_conns")
    @JsonInclude(Include.NON_NULL)
    private Float avgNewEstablishedConns = null;

    @JsonProperty("avg_pkts_policy_drops")
    @JsonInclude(Include.NON_NULL)
    private Float avgPktsPolicyDrops = null;

    @JsonProperty("avg_policy_drops")
    @JsonInclude(Include.NON_NULL)
    private Float avgPolicyDrops = null;

    @JsonProperty("avg_rx_bytes")
    @JsonInclude(Include.NON_NULL)
    private Float avgRxBytes = null;

    @JsonProperty("avg_rx_bytes_dropped")
    @JsonInclude(Include.NON_NULL)
    private Float avgRxBytesDropped = null;

    @JsonProperty("avg_rx_pkts")
    @JsonInclude(Include.NON_NULL)
    private Float avgRxPkts = null;

    @JsonProperty("avg_rx_pkts_dropped")
    @JsonInclude(Include.NON_NULL)
    private Float avgRxPktsDropped = null;

    @JsonProperty("avg_syns")
    @JsonInclude(Include.NON_NULL)
    private Float avgSyns = null;

    @JsonProperty("avg_total_connections")
    @JsonInclude(Include.NON_NULL)
    private Float avgTotalConnections = null;

    @JsonProperty("avg_total_rtt")
    @JsonInclude(Include.NON_NULL)
    private Float avgTotalRtt = null;

    @JsonProperty("avg_tx_bytes")
    @JsonInclude(Include.NON_NULL)
    private Float avgTxBytes = null;

    @JsonProperty("avg_tx_pkts")
    @JsonInclude(Include.NON_NULL)
    private Float avgTxPkts = null;

    @JsonProperty("max_connection_estb_time_fe")
    @JsonInclude(Include.NON_NULL)
    private Float maxConnectionEstbTimeFe = null;

    @JsonProperty("max_num_active_se")
    @JsonInclude(Include.NON_NULL)
    private Float maxNumActiveSe = null;

    @JsonProperty("max_open_conns")
    @JsonInclude(Include.NON_NULL)
    private Float maxOpenConns = null;

    @JsonProperty("max_rx_bytes_absolute")
    @JsonInclude(Include.NON_NULL)
    private Float maxRxBytesAbsolute = null;

    @JsonProperty("max_rx_pkts_absolute")
    @JsonInclude(Include.NON_NULL)
    private Float maxRxPktsAbsolute = null;

    @JsonProperty("max_tx_bytes_absolute")
    @JsonInclude(Include.NON_NULL)
    private Float maxTxBytesAbsolute = null;

    @JsonProperty("max_tx_pkts_absolute")
    @JsonInclude(Include.NON_NULL)
    private Float maxTxPktsAbsolute = null;

    @JsonProperty("node_obj_id")
    @JsonInclude(Include.NON_NULL)
    private String nodeObjId = null;

    @JsonProperty("pct_application_dos_attacks")
    @JsonInclude(Include.NON_NULL)
    private Float pctApplicationDosAttacks = null;

    @JsonProperty("pct_connection_errors")
    @JsonInclude(Include.NON_NULL)
    private Float pctConnectionErrors = null;

    @JsonProperty("pct_connections_dos_attacks")
    @JsonInclude(Include.NON_NULL)
    private Float pctConnectionsDosAttacks = null;

    @JsonProperty("pct_dos_bandwidth")
    @JsonInclude(Include.NON_NULL)
    private Float pctDosBandwidth = null;

    @JsonProperty("pct_dos_rx_bytes")
    @JsonInclude(Include.NON_NULL)
    private Float pctDosRxBytes = null;

    @JsonProperty("pct_network_dos_attacks")
    @JsonInclude(Include.NON_NULL)
    private Float pctNetworkDosAttacks = null;

    @JsonProperty("pct_pkts_dos_attacks")
    @JsonInclude(Include.NON_NULL)
    private Float pctPktsDosAttacks = null;

    @JsonProperty("pct_policy_drops")
    @JsonInclude(Include.NON_NULL)
    private Float pctPolicyDrops = null;

    @JsonProperty("sum_conn_duration")
    @JsonInclude(Include.NON_NULL)
    private Float sumConnDuration = null;

    @JsonProperty("sum_conn_est_time_exceeded_flows_fe")
    @JsonInclude(Include.NON_NULL)
    private Float sumConnEstTimeExceededFlowsFe = null;

    @JsonProperty("sum_connection_dropped_user_limit")
    @JsonInclude(Include.NON_NULL)
    private Float sumConnectionDroppedUserLimit = null;

    @JsonProperty("sum_connection_errors")
    @JsonInclude(Include.NON_NULL)
    private Float sumConnectionErrors = null;

    @JsonProperty("sum_connections_dropped")
    @JsonInclude(Include.NON_NULL)
    private Float sumConnectionsDropped = null;

    @JsonProperty("sum_dup_ack_retransmits")
    @JsonInclude(Include.NON_NULL)
    private Float sumDupAckRetransmits = null;

    @JsonProperty("sum_end_to_end_rtt")
    @JsonInclude(Include.NON_NULL)
    private Float sumEndToEndRtt = null;

    @JsonProperty("sum_end_to_end_rtt_bucket1")
    @JsonInclude(Include.NON_NULL)
    private Float sumEndToEndRttBucket1 = null;

    @JsonProperty("sum_end_to_end_rtt_bucket2")
    @JsonInclude(Include.NON_NULL)
    private Float sumEndToEndRttBucket2 = null;

    @JsonProperty("sum_finished_conns")
    @JsonInclude(Include.NON_NULL)
    private Float sumFinishedConns = null;

    @JsonProperty("sum_ingress_latency_exceeded_flows")
    @JsonInclude(Include.NON_NULL)
    private Float sumIngressLatencyExceededFlows = null;

    @JsonProperty("sum_lossy_connections")
    @JsonInclude(Include.NON_NULL)
    private Float sumLossyConnections = null;

    @JsonProperty("sum_lossy_req")
    @JsonInclude(Include.NON_NULL)
    private Float sumLossyReq = null;

    @JsonProperty("sum_out_of_orders")
    @JsonInclude(Include.NON_NULL)
    private Float sumOutOfOrders = null;

    @JsonProperty("sum_packet_dropped_user_bandwidth_limit")
    @JsonInclude(Include.NON_NULL)
    private Float sumPacketDroppedUserBandwidthLimit = null;

    @JsonProperty("sum_rtt_valid_connections")
    @JsonInclude(Include.NON_NULL)
    private Float sumRttValidConnections = null;

    @JsonProperty("sum_sack_retransmits")
    @JsonInclude(Include.NON_NULL)
    private Float sumSackRetransmits = null;

    @JsonProperty("sum_server_flow_control")
    @JsonInclude(Include.NON_NULL)
    private Float sumServerFlowControl = null;

    @JsonProperty("sum_timeout_retransmits")
    @JsonInclude(Include.NON_NULL)
    private Float sumTimeoutRetransmits = null;

    @JsonProperty("sum_zero_window_size_events")
    @JsonInclude(Include.NON_NULL)
    private Float sumZeroWindowSizeEvents = null;



  /**
   * This is the getter method this will return the attribute value.
   * Apdex measuring quality of network connections to servers.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return apdexc
   */
  @VsoMethod
  public Float getApdexc() {
    return apdexc;
  }

  /**
   * This is the setter method to the attribute.
   * Apdex measuring quality of network connections to servers.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param apdexc set the apdexc.
   */
  @VsoMethod
  public void setApdexc(Float  apdexc) {
    this.apdexc = apdexc;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Apdex measuring network connection quality based on rtt.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return apdexrtt
   */
  @VsoMethod
  public Float getApdexrtt() {
    return apdexrtt;
  }

  /**
   * This is the setter method to the attribute.
   * Apdex measuring network connection quality based on rtt.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param apdexrtt set the apdexrtt.
   */
  @VsoMethod
  public void setApdexrtt(Float  apdexrtt) {
    this.apdexrtt = apdexrtt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of application ddos attacks occurring.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgApplicationDosAttacks
   */
  @VsoMethod
  public Float getAvgApplicationDosAttacks() {
    return avgApplicationDosAttacks;
  }

  /**
   * This is the setter method to the attribute.
   * Number of application ddos attacks occurring.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgApplicationDosAttacks set the avgApplicationDosAttacks.
   */
  @VsoMethod
  public void setAvgApplicationDosAttacks(Float  avgApplicationDosAttacks) {
    this.avgApplicationDosAttacks = avgApplicationDosAttacks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average transmit and receive network bandwidth between client and virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgBandwidth
   */
  @VsoMethod
  public Float getAvgBandwidth() {
    return avgBandwidth;
  }

  /**
   * This is the setter method to the attribute.
   * Average transmit and receive network bandwidth between client and virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgBandwidth set the avgBandwidth.
   */
  @VsoMethod
  public void setAvgBandwidth(Float  avgBandwidth) {
    this.avgBandwidth = avgBandwidth;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Averaged rate bytes dropped per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgBytesPolicyDrops
   */
  @VsoMethod
  public Float getAvgBytesPolicyDrops() {
    return avgBytesPolicyDrops;
  }

  /**
   * This is the setter method to the attribute.
   * Averaged rate bytes dropped per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgBytesPolicyDrops set the avgBytesPolicyDrops.
   */
  @VsoMethod
  public void setAvgBytesPolicyDrops(Float  avgBytesPolicyDrops) {
    this.avgBytesPolicyDrops = avgBytesPolicyDrops;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate of total connections per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgCompleteConns
   */
  @VsoMethod
  public Float getAvgCompleteConns() {
    return avgCompleteConns;
  }

  /**
   * This is the setter method to the attribute.
   * Rate of total connections per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgCompleteConns set the avgCompleteConns.
   */
  @VsoMethod
  public void setAvgCompleteConns(Float  avgCompleteConns) {
    this.avgCompleteConns = avgCompleteConns;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate of dropped connections per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgConnectionsDropped
   */
  @VsoMethod
  public Float getAvgConnectionsDropped() {
    return avgConnectionsDropped;
  }

  /**
   * This is the setter method to the attribute.
   * Rate of dropped connections per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgConnectionsDropped set the avgConnectionsDropped.
   */
  @VsoMethod
  public void setAvgConnectionsDropped(Float  avgConnectionsDropped) {
    this.avgConnectionsDropped = avgConnectionsDropped;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  rate of http app errors.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosAppError
   */
  @VsoMethod
  public Float getAvgDosAppError() {
    return avgDosAppError;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  rate of http app errors.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosAppError set the avgDosAppError.
   */
  @VsoMethod
  public void setAvgDosAppError(Float  avgDosAppError) {
    this.avgDosAppError = avgDosAppError;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number ddos attacks occurring.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosAttacks
   */
  @VsoMethod
  public Float getAvgDosAttacks() {
    return avgDosAttacks;
  }

  /**
   * This is the setter method to the attribute.
   * Number ddos attacks occurring.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosAttacks set the avgDosAttacks.
   */
  @VsoMethod
  public void setAvgDosAttacks(Float  avgDosAttacks) {
    this.avgDosAttacks = avgDosAttacks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  rate of bad rst floods.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosBadRstFlood
   */
  @VsoMethod
  public Float getAvgDosBadRstFlood() {
    return avgDosBadRstFlood;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  rate of bad rst floods.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosBadRstFlood set the avgDosBadRstFlood.
   */
  @VsoMethod
  public void setAvgDosBadRstFlood(Float  avgDosBadRstFlood) {
    this.avgDosBadRstFlood = avgDosBadRstFlood;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average transmit and receive network bandwidth between client and virtual service related to ddos attack.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosBandwidth
   */
  @VsoMethod
  public Float getAvgDosBandwidth() {
    return avgDosBandwidth;
  }

  /**
   * This is the setter method to the attribute.
   * Average transmit and receive network bandwidth between client and virtual service related to ddos attack.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosBandwidth set the avgDosBandwidth.
   */
  @VsoMethod
  public void setAvgDosBandwidth(Float  avgDosBandwidth) {
    this.avgDosBandwidth = avgDosBandwidth;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of connections considered as dos.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosConn
   */
  @VsoMethod
  public Float getAvgDosConn() {
    return avgDosConn;
  }

  /**
   * This is the setter method to the attribute.
   * Number of connections considered as dos.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosConn set the avgDosConn.
   */
  @VsoMethod
  public void setAvgDosConn(Float  avgDosConn) {
    this.avgDosConn = avgDosConn;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  connections dropped due to ip rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosConnIpRlDrop
   */
  @VsoMethod
  public Float getAvgDosConnIpRlDrop() {
    return avgDosConnIpRlDrop;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  connections dropped due to ip rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosConnIpRlDrop set the avgDosConnIpRlDrop.
   */
  @VsoMethod
  public void setAvgDosConnIpRlDrop(Float  avgDosConnIpRlDrop) {
    this.avgDosConnIpRlDrop = avgDosConnIpRlDrop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  connections dropped due to vs rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosConnRlDrop
   */
  @VsoMethod
  public Float getAvgDosConnRlDrop() {
    return avgDosConnRlDrop;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  connections dropped due to vs rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosConnRlDrop set the avgDosConnRlDrop.
   */
  @VsoMethod
  public void setAvgDosConnRlDrop(Float  avgDosConnRlDrop) {
    this.avgDosConnRlDrop = avgDosConnRlDrop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  rate of fake sessions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosFakeSession
   */
  @VsoMethod
  public Float getAvgDosFakeSession() {
    return avgDosFakeSession;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  rate of fake sessions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosFakeSession set the avgDosFakeSession.
   */
  @VsoMethod
  public void setAvgDosFakeSession(Float  avgDosFakeSession) {
    this.avgDosFakeSession = avgDosFakeSession;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  rate of http aborts.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosHttpAbort
   */
  @VsoMethod
  public Float getAvgDosHttpAbort() {
    return avgDosHttpAbort;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  rate of http aborts.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosHttpAbort set the avgDosHttpAbort.
   */
  @VsoMethod
  public void setAvgDosHttpAbort(Float  avgDosHttpAbort) {
    this.avgDosHttpAbort = avgDosHttpAbort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  rate of http errors.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosHttpError
   */
  @VsoMethod
  public Float getAvgDosHttpError() {
    return avgDosHttpError;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  rate of http errors.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosHttpError set the avgDosHttpError.
   */
  @VsoMethod
  public void setAvgDosHttpError(Float  avgDosHttpError) {
    this.avgDosHttpError = avgDosHttpError;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  rate of http timeouts.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosHttpTimeout
   */
  @VsoMethod
  public Float getAvgDosHttpTimeout() {
    return avgDosHttpTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  rate of http timeouts.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosHttpTimeout set the avgDosHttpTimeout.
   */
  @VsoMethod
  public void setAvgDosHttpTimeout(Float  avgDosHttpTimeout) {
    this.avgDosHttpTimeout = avgDosHttpTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  rate of malformed packet floods.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosMalformedFlood
   */
  @VsoMethod
  public Float getAvgDosMalformedFlood() {
    return avgDosMalformedFlood;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  rate of malformed packet floods.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosMalformedFlood set the avgDosMalformedFlood.
   */
  @VsoMethod
  public void setAvgDosMalformedFlood(Float  avgDosMalformedFlood) {
    this.avgDosMalformedFlood = avgDosMalformedFlood;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  non syn packet flood.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosNonSynFlood
   */
  @VsoMethod
  public Float getAvgDosNonSynFlood() {
    return avgDosNonSynFlood;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  non syn packet flood.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosNonSynFlood set the avgDosNonSynFlood.
   */
  @VsoMethod
  public void setAvgDosNonSynFlood(Float  avgDosNonSynFlood) {
    this.avgDosNonSynFlood = avgDosNonSynFlood;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of request considered as dos.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosReq
   */
  @VsoMethod
  public Float getAvgDosReq() {
    return avgDosReq;
  }

  /**
   * This is the setter method to the attribute.
   * Number of request considered as dos.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosReq set the avgDosReq.
   */
  @VsoMethod
  public void setAvgDosReq(Float  avgDosReq) {
    this.avgDosReq = avgDosReq;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  requests dropped due to cookie rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosReqCookieRlDrop
   */
  @VsoMethod
  public Float getAvgDosReqCookieRlDrop() {
    return avgDosReqCookieRlDrop;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  requests dropped due to cookie rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosReqCookieRlDrop set the avgDosReqCookieRlDrop.
   */
  @VsoMethod
  public void setAvgDosReqCookieRlDrop(Float  avgDosReqCookieRlDrop) {
    this.avgDosReqCookieRlDrop = avgDosReqCookieRlDrop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  requests dropped due to custom rate limit.
   * Field introduced in 17.2.13,18.1.3,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosReqCustomRlDrop
   */
  @VsoMethod
  public Float getAvgDosReqCustomRlDrop() {
    return avgDosReqCustomRlDrop;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  requests dropped due to custom rate limit.
   * Field introduced in 17.2.13,18.1.3,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosReqCustomRlDrop set the avgDosReqCustomRlDrop.
   */
  @VsoMethod
  public void setAvgDosReqCustomRlDrop(Float  avgDosReqCustomRlDrop) {
    this.avgDosReqCustomRlDrop = avgDosReqCustomRlDrop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  requests dropped due to header rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosReqHdrRlDrop
   */
  @VsoMethod
  public Float getAvgDosReqHdrRlDrop() {
    return avgDosReqHdrRlDrop;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  requests dropped due to header rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosReqHdrRlDrop set the avgDosReqHdrRlDrop.
   */
  @VsoMethod
  public void setAvgDosReqHdrRlDrop(Float  avgDosReqHdrRlDrop) {
    this.avgDosReqHdrRlDrop = avgDosReqHdrRlDrop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  requests dropped due to ip rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosReqIpRlDrop
   */
  @VsoMethod
  public Float getAvgDosReqIpRlDrop() {
    return avgDosReqIpRlDrop;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  requests dropped due to ip rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosReqIpRlDrop set the avgDosReqIpRlDrop.
   */
  @VsoMethod
  public void setAvgDosReqIpRlDrop(Float  avgDosReqIpRlDrop) {
    this.avgDosReqIpRlDrop = avgDosReqIpRlDrop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  requests dropped due to ip rate limit for bad requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosReqIpRlDropBad
   */
  @VsoMethod
  public Float getAvgDosReqIpRlDropBad() {
    return avgDosReqIpRlDropBad;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  requests dropped due to ip rate limit for bad requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosReqIpRlDropBad set the avgDosReqIpRlDropBad.
   */
  @VsoMethod
  public void setAvgDosReqIpRlDropBad(Float  avgDosReqIpRlDropBad) {
    this.avgDosReqIpRlDropBad = avgDosReqIpRlDropBad;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  requests dropped due to bad ip rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosReqIpScanBadRlDrop
   */
  @VsoMethod
  public Float getAvgDosReqIpScanBadRlDrop() {
    return avgDosReqIpScanBadRlDrop;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  requests dropped due to bad ip rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosReqIpScanBadRlDrop set the avgDosReqIpScanBadRlDrop.
   */
  @VsoMethod
  public void setAvgDosReqIpScanBadRlDrop(Float  avgDosReqIpScanBadRlDrop) {
    this.avgDosReqIpScanBadRlDrop = avgDosReqIpScanBadRlDrop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  requests dropped due to unknown ip rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosReqIpScanUnknownRlDrop
   */
  @VsoMethod
  public Float getAvgDosReqIpScanUnknownRlDrop() {
    return avgDosReqIpScanUnknownRlDrop;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  requests dropped due to unknown ip rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosReqIpScanUnknownRlDrop set the avgDosReqIpScanUnknownRlDrop.
   */
  @VsoMethod
  public void setAvgDosReqIpScanUnknownRlDrop(Float  avgDosReqIpScanUnknownRlDrop) {
    this.avgDosReqIpScanUnknownRlDrop = avgDosReqIpScanUnknownRlDrop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  requests dropped due to ip+url rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosReqIpUriRlDrop
   */
  @VsoMethod
  public Float getAvgDosReqIpUriRlDrop() {
    return avgDosReqIpUriRlDrop;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  requests dropped due to ip+url rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosReqIpUriRlDrop set the avgDosReqIpUriRlDrop.
   */
  @VsoMethod
  public void setAvgDosReqIpUriRlDrop(Float  avgDosReqIpUriRlDrop) {
    this.avgDosReqIpUriRlDrop = avgDosReqIpUriRlDrop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  requests dropped due to ip+url rate limit for bad requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosReqIpUriRlDropBad
   */
  @VsoMethod
  public Float getAvgDosReqIpUriRlDropBad() {
    return avgDosReqIpUriRlDropBad;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  requests dropped due to ip+url rate limit for bad requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosReqIpUriRlDropBad set the avgDosReqIpUriRlDropBad.
   */
  @VsoMethod
  public void setAvgDosReqIpUriRlDropBad(Float  avgDosReqIpUriRlDropBad) {
    this.avgDosReqIpUriRlDropBad = avgDosReqIpUriRlDropBad;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  requests dropped due to vs rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosReqRlDrop
   */
  @VsoMethod
  public Float getAvgDosReqRlDrop() {
    return avgDosReqRlDrop;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  requests dropped due to vs rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosReqRlDrop set the avgDosReqRlDrop.
   */
  @VsoMethod
  public void setAvgDosReqRlDrop(Float  avgDosReqRlDrop) {
    this.avgDosReqRlDrop = avgDosReqRlDrop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  requests dropped due to url rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosReqUriRlDrop
   */
  @VsoMethod
  public Float getAvgDosReqUriRlDrop() {
    return avgDosReqUriRlDrop;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  requests dropped due to url rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosReqUriRlDrop set the avgDosReqUriRlDrop.
   */
  @VsoMethod
  public void setAvgDosReqUriRlDrop(Float  avgDosReqUriRlDrop) {
    this.avgDosReqUriRlDrop = avgDosReqUriRlDrop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  requests dropped due to url rate limit for bad requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosReqUriRlDropBad
   */
  @VsoMethod
  public Float getAvgDosReqUriRlDropBad() {
    return avgDosReqUriRlDropBad;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  requests dropped due to url rate limit for bad requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosReqUriRlDropBad set the avgDosReqUriRlDropBad.
   */
  @VsoMethod
  public void setAvgDosReqUriRlDropBad(Float  avgDosReqUriRlDropBad) {
    this.avgDosReqUriRlDropBad = avgDosReqUriRlDropBad;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  requests dropped due to bad url rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosReqUriScanBadRlDrop
   */
  @VsoMethod
  public Float getAvgDosReqUriScanBadRlDrop() {
    return avgDosReqUriScanBadRlDrop;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  requests dropped due to bad url rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosReqUriScanBadRlDrop set the avgDosReqUriScanBadRlDrop.
   */
  @VsoMethod
  public void setAvgDosReqUriScanBadRlDrop(Float  avgDosReqUriScanBadRlDrop) {
    this.avgDosReqUriScanBadRlDrop = avgDosReqUriScanBadRlDrop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  requests dropped due to unknown url rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosReqUriScanUnknownRlDrop
   */
  @VsoMethod
  public Float getAvgDosReqUriScanUnknownRlDrop() {
    return avgDosReqUriScanUnknownRlDrop;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  requests dropped due to unknown url rate limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosReqUriScanUnknownRlDrop set the avgDosReqUriScanUnknownRlDrop.
   */
  @VsoMethod
  public void setAvgDosReqUriScanUnknownRlDrop(Float  avgDosReqUriScanUnknownRlDrop) {
    this.avgDosReqUriScanUnknownRlDrop = avgDosReqUriScanUnknownRlDrop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average rate of bytes received per second related to ddos attack.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosRxBytes
   */
  @VsoMethod
  public Float getAvgDosRxBytes() {
    return avgDosRxBytes;
  }

  /**
   * This is the setter method to the attribute.
   * Average rate of bytes received per second related to ddos attack.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosRxBytes set the avgDosRxBytes.
   */
  @VsoMethod
  public void setAvgDosRxBytes(Float  avgDosRxBytes) {
    this.avgDosRxBytes = avgDosRxBytes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  slow uri.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosSlowUri
   */
  @VsoMethod
  public Float getAvgDosSlowUri() {
    return avgDosSlowUri;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  slow uri.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosSlowUri set the avgDosSlowUri.
   */
  @VsoMethod
  public void setAvgDosSlowUri(Float  avgDosSlowUri) {
    this.avgDosSlowUri = avgDosSlowUri;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  rate of small window stresses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosSmallWindowStress
   */
  @VsoMethod
  public Float getAvgDosSmallWindowStress() {
    return avgDosSmallWindowStress;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  rate of small window stresses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosSmallWindowStress set the avgDosSmallWindowStress.
   */
  @VsoMethod
  public void setAvgDosSmallWindowStress(Float  avgDosSmallWindowStress) {
    this.avgDosSmallWindowStress = avgDosSmallWindowStress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  rate of http ssl errors.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosSslError
   */
  @VsoMethod
  public Float getAvgDosSslError() {
    return avgDosSslError;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  rate of http ssl errors.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosSslError set the avgDosSslError.
   */
  @VsoMethod
  public void setAvgDosSslError(Float  avgDosSslError) {
    this.avgDosSslError = avgDosSslError;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  rate of syn floods.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosSynFlood
   */
  @VsoMethod
  public Float getAvgDosSynFlood() {
    return avgDosSynFlood;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  rate of syn floods.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosSynFlood set the avgDosSynFlood.
   */
  @VsoMethod
  public void setAvgDosSynFlood(Float  avgDosSynFlood) {
    this.avgDosSynFlood = avgDosSynFlood;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of request used for l7 dos requests normalization.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosTotalReq
   */
  @VsoMethod
  public Float getAvgDosTotalReq() {
    return avgDosTotalReq;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of request used for l7 dos requests normalization.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosTotalReq set the avgDosTotalReq.
   */
  @VsoMethod
  public void setAvgDosTotalReq(Float  avgDosTotalReq) {
    this.avgDosTotalReq = avgDosTotalReq;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average rate of bytes transmitted per second related to ddos attack.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosTxBytes
   */
  @VsoMethod
  public Float getAvgDosTxBytes() {
    return avgDosTxBytes;
  }

  /**
   * This is the setter method to the attribute.
   * Average rate of bytes transmitted per second related to ddos attack.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosTxBytes set the avgDosTxBytes.
   */
  @VsoMethod
  public void setAvgDosTxBytes(Float  avgDosTxBytes) {
    this.avgDosTxBytes = avgDosTxBytes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos attack  rate of zero window stresses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDosZeroWindowStress
   */
  @VsoMethod
  public Float getAvgDosZeroWindowStress() {
    return avgDosZeroWindowStress;
  }

  /**
   * This is the setter method to the attribute.
   * Dos attack  rate of zero window stresses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDosZeroWindowStress set the avgDosZeroWindowStress.
   */
  @VsoMethod
  public void setAvgDosZeroWindowStress(Float  avgDosZeroWindowStress) {
    this.avgDosZeroWindowStress = avgDosZeroWindowStress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate of total errored connections per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgErroredConnections
   */
  @VsoMethod
  public Float getAvgErroredConnections() {
    return avgErroredConnections;
  }

  /**
   * This is the setter method to the attribute.
   * Rate of total errored connections per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgErroredConnections set the avgErroredConnections.
   */
  @VsoMethod
  public void setAvgErroredConnections(Float  avgErroredConnections) {
    this.avgErroredConnections = avgErroredConnections;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average rate of syn ddos attacks on virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgHalfOpenConns
   */
  @VsoMethod
  public Float getAvgHalfOpenConns() {
    return avgHalfOpenConns;
  }

  /**
   * This is the setter method to the attribute.
   * Average rate of syn ddos attacks on virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgHalfOpenConns set the avgHalfOpenConns.
   */
  @VsoMethod
  public void setAvgHalfOpenConns(Float  avgHalfOpenConns) {
    this.avgHalfOpenConns = avgHalfOpenConns;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average l4 connection duration which does not include client rtt.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgL4ClientLatency
   */
  @VsoMethod
  public Float getAvgL4ClientLatency() {
    return avgL4ClientLatency;
  }

  /**
   * This is the setter method to the attribute.
   * Average l4 connection duration which does not include client rtt.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgL4ClientLatency set the avgL4ClientLatency.
   */
  @VsoMethod
  public void setAvgL4ClientLatency(Float  avgL4ClientLatency) {
    this.avgL4ClientLatency = avgL4ClientLatency;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate of lossy connections per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgLossyConnections
   */
  @VsoMethod
  public Float getAvgLossyConnections() {
    return avgLossyConnections;
  }

  /**
   * This is the setter method to the attribute.
   * Rate of lossy connections per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgLossyConnections set the avgLossyConnections.
   */
  @VsoMethod
  public void setAvgLossyConnections(Float  avgLossyConnections) {
    this.avgLossyConnections = avgLossyConnections;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Averaged rate of lossy request per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgLossyReq
   */
  @VsoMethod
  public Float getAvgLossyReq() {
    return avgLossyReq;
  }

  /**
   * This is the setter method to the attribute.
   * Averaged rate of lossy request per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgLossyReq set the avgLossyReq.
   */
  @VsoMethod
  public void setAvgLossyReq(Float  avgLossyReq) {
    this.avgLossyReq = avgLossyReq;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of network ddos attacks occurring.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgNetworkDosAttacks
   */
  @VsoMethod
  public Float getAvgNetworkDosAttacks() {
    return avgNetworkDosAttacks;
  }

  /**
   * This is the setter method to the attribute.
   * Number of network ddos attacks occurring.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgNetworkDosAttacks set the avgNetworkDosAttacks.
   */
  @VsoMethod
  public void setAvgNetworkDosAttacks(Float  avgNetworkDosAttacks) {
    this.avgNetworkDosAttacks = avgNetworkDosAttacks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Averaged rate of new client connections per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgNewEstablishedConns
   */
  @VsoMethod
  public Float getAvgNewEstablishedConns() {
    return avgNewEstablishedConns;
  }

  /**
   * This is the setter method to the attribute.
   * Averaged rate of new client connections per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgNewEstablishedConns set the avgNewEstablishedConns.
   */
  @VsoMethod
  public void setAvgNewEstablishedConns(Float  avgNewEstablishedConns) {
    this.avgNewEstablishedConns = avgNewEstablishedConns;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Averaged rate of dropped packets per second due to policy.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgPktsPolicyDrops
   */
  @VsoMethod
  public Float getAvgPktsPolicyDrops() {
    return avgPktsPolicyDrops;
  }

  /**
   * This is the setter method to the attribute.
   * Averaged rate of dropped packets per second due to policy.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgPktsPolicyDrops set the avgPktsPolicyDrops.
   */
  @VsoMethod
  public void setAvgPktsPolicyDrops(Float  avgPktsPolicyDrops) {
    this.avgPktsPolicyDrops = avgPktsPolicyDrops;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate of total connections dropped due to vs policy per second.
   * It includes drops due to rate limits, security policy drops, connection limits etc.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgPolicyDrops
   */
  @VsoMethod
  public Float getAvgPolicyDrops() {
    return avgPolicyDrops;
  }

  /**
   * This is the setter method to the attribute.
   * Rate of total connections dropped due to vs policy per second.
   * It includes drops due to rate limits, security policy drops, connection limits etc.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgPolicyDrops set the avgPolicyDrops.
   */
  @VsoMethod
  public void setAvgPolicyDrops(Float  avgPolicyDrops) {
    this.avgPolicyDrops = avgPolicyDrops;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average rate of bytes received per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgRxBytes
   */
  @VsoMethod
  public Float getAvgRxBytes() {
    return avgRxBytes;
  }

  /**
   * This is the setter method to the attribute.
   * Average rate of bytes received per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgRxBytes set the avgRxBytes.
   */
  @VsoMethod
  public void setAvgRxBytes(Float  avgRxBytes) {
    this.avgRxBytes = avgRxBytes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average rate of received bytes dropped per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgRxBytesDropped
   */
  @VsoMethod
  public Float getAvgRxBytesDropped() {
    return avgRxBytesDropped;
  }

  /**
   * This is the setter method to the attribute.
   * Average rate of received bytes dropped per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgRxBytesDropped set the avgRxBytesDropped.
   */
  @VsoMethod
  public void setAvgRxBytesDropped(Float  avgRxBytesDropped) {
    this.avgRxBytesDropped = avgRxBytesDropped;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average rate of packets received per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgRxPkts
   */
  @VsoMethod
  public Float getAvgRxPkts() {
    return avgRxPkts;
  }

  /**
   * This is the setter method to the attribute.
   * Average rate of packets received per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgRxPkts set the avgRxPkts.
   */
  @VsoMethod
  public void setAvgRxPkts(Float  avgRxPkts) {
    this.avgRxPkts = avgRxPkts;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average rate of received packets dropped per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgRxPktsDropped
   */
  @VsoMethod
  public Float getAvgRxPktsDropped() {
    return avgRxPktsDropped;
  }

  /**
   * This is the setter method to the attribute.
   * Average rate of received packets dropped per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgRxPktsDropped set the avgRxPktsDropped.
   */
  @VsoMethod
  public void setAvgRxPktsDropped(Float  avgRxPktsDropped) {
    this.avgRxPktsDropped = avgRxPktsDropped;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total syncs sent across all connections.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSyns
   */
  @VsoMethod
  public Float getAvgSyns() {
    return avgSyns;
  }

  /**
   * This is the setter method to the attribute.
   * Total syncs sent across all connections.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSyns set the avgSyns.
   */
  @VsoMethod
  public void setAvgSyns(Float  avgSyns) {
    this.avgSyns = avgSyns;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Averaged rate bytes dropped per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgTotalConnections
   */
  @VsoMethod
  public Float getAvgTotalConnections() {
    return avgTotalConnections;
  }

  /**
   * This is the setter method to the attribute.
   * Averaged rate bytes dropped per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgTotalConnections set the avgTotalConnections.
   */
  @VsoMethod
  public void setAvgTotalConnections(Float  avgTotalConnections) {
    this.avgTotalConnections = avgTotalConnections;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average network round trip time between client and virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgTotalRtt
   */
  @VsoMethod
  public Float getAvgTotalRtt() {
    return avgTotalRtt;
  }

  /**
   * This is the setter method to the attribute.
   * Average network round trip time between client and virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgTotalRtt set the avgTotalRtt.
   */
  @VsoMethod
  public void setAvgTotalRtt(Float  avgTotalRtt) {
    this.avgTotalRtt = avgTotalRtt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average rate of bytes transmitted per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgTxBytes
   */
  @VsoMethod
  public Float getAvgTxBytes() {
    return avgTxBytes;
  }

  /**
   * This is the setter method to the attribute.
   * Average rate of bytes transmitted per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgTxBytes set the avgTxBytes.
   */
  @VsoMethod
  public void setAvgTxBytes(Float  avgTxBytes) {
    this.avgTxBytes = avgTxBytes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average rate of packets transmitted per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgTxPkts
   */
  @VsoMethod
  public Float getAvgTxPkts() {
    return avgTxPkts;
  }

  /**
   * This is the setter method to the attribute.
   * Average rate of packets transmitted per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgTxPkts set the avgTxPkts.
   */
  @VsoMethod
  public void setAvgTxPkts(Float  avgTxPkts) {
    this.avgTxPkts = avgTxPkts;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum connection establishment time on the client side.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxConnectionEstbTimeFe
   */
  @VsoMethod
  public Float getMaxConnectionEstbTimeFe() {
    return maxConnectionEstbTimeFe;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum connection establishment time on the client side.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxConnectionEstbTimeFe set the maxConnectionEstbTimeFe.
   */
  @VsoMethod
  public void setMaxConnectionEstbTimeFe(Float  maxConnectionEstbTimeFe) {
    this.maxConnectionEstbTimeFe = maxConnectionEstbTimeFe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max number of ses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxNumActiveSe
   */
  @VsoMethod
  public Float getMaxNumActiveSe() {
    return maxNumActiveSe;
  }

  /**
   * This is the setter method to the attribute.
   * Max number of ses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxNumActiveSe set the maxNumActiveSe.
   */
  @VsoMethod
  public void setMaxNumActiveSe(Float  maxNumActiveSe) {
    this.maxNumActiveSe = maxNumActiveSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max number of open connections.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxOpenConns
   */
  @VsoMethod
  public Float getMaxOpenConns() {
    return maxOpenConns;
  }

  /**
   * This is the setter method to the attribute.
   * Max number of open connections.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxOpenConns set the maxOpenConns.
   */
  @VsoMethod
  public void setMaxOpenConns(Float  maxOpenConns) {
    this.maxOpenConns = maxOpenConns;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of received bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxRxBytesAbsolute
   */
  @VsoMethod
  public Float getMaxRxBytesAbsolute() {
    return maxRxBytesAbsolute;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of received bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxRxBytesAbsolute set the maxRxBytesAbsolute.
   */
  @VsoMethod
  public void setMaxRxBytesAbsolute(Float  maxRxBytesAbsolute) {
    this.maxRxBytesAbsolute = maxRxBytesAbsolute;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of received frames.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxRxPktsAbsolute
   */
  @VsoMethod
  public Float getMaxRxPktsAbsolute() {
    return maxRxPktsAbsolute;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of received frames.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxRxPktsAbsolute set the maxRxPktsAbsolute.
   */
  @VsoMethod
  public void setMaxRxPktsAbsolute(Float  maxRxPktsAbsolute) {
    this.maxRxPktsAbsolute = maxRxPktsAbsolute;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of transmitted bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxTxBytesAbsolute
   */
  @VsoMethod
  public Float getMaxTxBytesAbsolute() {
    return maxTxBytesAbsolute;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of transmitted bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxTxBytesAbsolute set the maxTxBytesAbsolute.
   */
  @VsoMethod
  public void setMaxTxBytesAbsolute(Float  maxTxBytesAbsolute) {
    this.maxTxBytesAbsolute = maxTxBytesAbsolute;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of transmitted frames.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxTxPktsAbsolute
   */
  @VsoMethod
  public Float getMaxTxPktsAbsolute() {
    return maxTxPktsAbsolute;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of transmitted frames.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxTxPktsAbsolute set the maxTxPktsAbsolute.
   */
  @VsoMethod
  public void setMaxTxPktsAbsolute(Float  maxTxPktsAbsolute) {
    this.maxTxPktsAbsolute = maxTxPktsAbsolute;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodeObjId
   */
  @VsoMethod
  public String getNodeObjId() {
    return nodeObjId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nodeObjId set the nodeObjId.
   */
  @VsoMethod
  public void setNodeObjId(String  nodeObjId) {
    this.nodeObjId = nodeObjId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Fraction of l7 requests owing to dos.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctApplicationDosAttacks
   */
  @VsoMethod
  public Float getPctApplicationDosAttacks() {
    return pctApplicationDosAttacks;
  }

  /**
   * This is the setter method to the attribute.
   * Fraction of l7 requests owing to dos.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctApplicationDosAttacks set the pctApplicationDosAttacks.
   */
  @VsoMethod
  public void setPctApplicationDosAttacks(Float  pctApplicationDosAttacks) {
    this.pctApplicationDosAttacks = pctApplicationDosAttacks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Percent of l4 connection dropped and lossy for virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctConnectionErrors
   */
  @VsoMethod
  public Float getPctConnectionErrors() {
    return pctConnectionErrors;
  }

  /**
   * This is the setter method to the attribute.
   * Percent of l4 connection dropped and lossy for virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctConnectionErrors set the pctConnectionErrors.
   */
  @VsoMethod
  public void setPctConnectionErrors(Float  pctConnectionErrors) {
    this.pctConnectionErrors = pctConnectionErrors;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Fraction of l4 connections owing to dos.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctConnectionsDosAttacks
   */
  @VsoMethod
  public Float getPctConnectionsDosAttacks() {
    return pctConnectionsDosAttacks;
  }

  /**
   * This is the setter method to the attribute.
   * Fraction of l4 connections owing to dos.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctConnectionsDosAttacks set the pctConnectionsDosAttacks.
   */
  @VsoMethod
  public void setPctConnectionsDosAttacks(Float  pctConnectionsDosAttacks) {
    this.pctConnectionsDosAttacks = pctConnectionsDosAttacks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dos bandwidth percentage.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctDosBandwidth
   */
  @VsoMethod
  public Float getPctDosBandwidth() {
    return pctDosBandwidth;
  }

  /**
   * This is the setter method to the attribute.
   * Dos bandwidth percentage.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctDosBandwidth set the pctDosBandwidth.
   */
  @VsoMethod
  public void setPctDosBandwidth(Float  pctDosBandwidth) {
    this.pctDosBandwidth = pctDosBandwidth;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Percentage of received bytes as part of a dos attack.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctDosRxBytes
   */
  @VsoMethod
  public Float getPctDosRxBytes() {
    return pctDosRxBytes;
  }

  /**
   * This is the setter method to the attribute.
   * Percentage of received bytes as part of a dos attack.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctDosRxBytes set the pctDosRxBytes.
   */
  @VsoMethod
  public void setPctDosRxBytes(Float  pctDosRxBytes) {
    this.pctDosRxBytes = pctDosRxBytes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Deprecated.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctNetworkDosAttacks
   */
  @VsoMethod
  public Float getPctNetworkDosAttacks() {
    return pctNetworkDosAttacks;
  }

  /**
   * This is the setter method to the attribute.
   * Deprecated.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctNetworkDosAttacks set the pctNetworkDosAttacks.
   */
  @VsoMethod
  public void setPctNetworkDosAttacks(Float  pctNetworkDosAttacks) {
    this.pctNetworkDosAttacks = pctNetworkDosAttacks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Fraction of packets owing to dos.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctPktsDosAttacks
   */
  @VsoMethod
  public Float getPctPktsDosAttacks() {
    return pctPktsDosAttacks;
  }

  /**
   * This is the setter method to the attribute.
   * Fraction of packets owing to dos.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctPktsDosAttacks set the pctPktsDosAttacks.
   */
  @VsoMethod
  public void setPctPktsDosAttacks(Float  pctPktsDosAttacks) {
    this.pctPktsDosAttacks = pctPktsDosAttacks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Fraction of l4 requests dropped owing to policy.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctPolicyDrops
   */
  @VsoMethod
  public Float getPctPolicyDrops() {
    return pctPolicyDrops;
  }

  /**
   * This is the setter method to the attribute.
   * Fraction of l4 requests dropped owing to policy.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctPolicyDrops set the pctPolicyDrops.
   */
  @VsoMethod
  public void setPctPolicyDrops(Float  pctPolicyDrops) {
    this.pctPolicyDrops = pctPolicyDrops;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total duration across all connections.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumConnDuration
   */
  @VsoMethod
  public Float getSumConnDuration() {
    return sumConnDuration;
  }

  /**
   * This is the setter method to the attribute.
   * Total duration across all connections.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumConnDuration set the sumConnDuration.
   */
  @VsoMethod
  public void setSumConnDuration(Float  sumConnDuration) {
    this.sumConnDuration = sumConnDuration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of times client side connection establishment time was breached.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumConnEstTimeExceededFlowsFe
   */
  @VsoMethod
  public Float getSumConnEstTimeExceededFlowsFe() {
    return sumConnEstTimeExceededFlowsFe;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of times client side connection establishment time was breached.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumConnEstTimeExceededFlowsFe set the sumConnEstTimeExceededFlowsFe.
   */
  @VsoMethod
  public void setSumConnEstTimeExceededFlowsFe(Float  sumConnEstTimeExceededFlowsFe) {
    this.sumConnEstTimeExceededFlowsFe = sumConnEstTimeExceededFlowsFe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of connection dropped due to vserver connection limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumConnectionDroppedUserLimit
   */
  @VsoMethod
  public Float getSumConnectionDroppedUserLimit() {
    return sumConnectionDroppedUserLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of connection dropped due to vserver connection limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumConnectionDroppedUserLimit set the sumConnectionDroppedUserLimit.
   */
  @VsoMethod
  public void setSumConnectionDroppedUserLimit(Float  sumConnectionDroppedUserLimit) {
    this.sumConnectionDroppedUserLimit = sumConnectionDroppedUserLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of client network connections that were lossy or dropped.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumConnectionErrors
   */
  @VsoMethod
  public Float getSumConnectionErrors() {
    return sumConnectionErrors;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of client network connections that were lossy or dropped.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumConnectionErrors set the sumConnectionErrors.
   */
  @VsoMethod
  public void setSumConnectionErrors(Float  sumConnectionErrors) {
    this.sumConnectionErrors = sumConnectionErrors;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total connections dropped including failed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumConnectionsDropped
   */
  @VsoMethod
  public Float getSumConnectionsDropped() {
    return sumConnectionsDropped;
  }

  /**
   * This is the setter method to the attribute.
   * Total connections dropped including failed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumConnectionsDropped set the sumConnectionsDropped.
   */
  @VsoMethod
  public void setSumConnectionsDropped(Float  sumConnectionsDropped) {
    this.sumConnectionsDropped = sumConnectionsDropped;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total duplicate ack retransmits across all connections.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumDupAckRetransmits
   */
  @VsoMethod
  public Float getSumDupAckRetransmits() {
    return sumDupAckRetransmits;
  }

  /**
   * This is the setter method to the attribute.
   * Total duplicate ack retransmits across all connections.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumDupAckRetransmits set the sumDupAckRetransmits.
   */
  @VsoMethod
  public void setSumDupAckRetransmits(Float  sumDupAckRetransmits) {
    this.sumDupAckRetransmits = sumDupAckRetransmits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sum of end to end network rtt experienced by end clients.
   * Higher value would increase response times experienced by clients.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumEndToEndRtt
   */
  @VsoMethod
  public Float getSumEndToEndRtt() {
    return sumEndToEndRtt;
  }

  /**
   * This is the setter method to the attribute.
   * Sum of end to end network rtt experienced by end clients.
   * Higher value would increase response times experienced by clients.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumEndToEndRtt set the sumEndToEndRtt.
   */
  @VsoMethod
  public void setSumEndToEndRtt(Float  sumEndToEndRtt) {
    this.sumEndToEndRtt = sumEndToEndRtt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total connections that have rtt values from 0 to rtt threshold.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumEndToEndRttBucket1
   */
  @VsoMethod
  public Float getSumEndToEndRttBucket1() {
    return sumEndToEndRttBucket1;
  }

  /**
   * This is the setter method to the attribute.
   * Total connections that have rtt values from 0 to rtt threshold.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumEndToEndRttBucket1 set the sumEndToEndRttBucket1.
   */
  @VsoMethod
  public void setSumEndToEndRttBucket1(Float  sumEndToEndRttBucket1) {
    this.sumEndToEndRttBucket1 = sumEndToEndRttBucket1;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total connections that have rtt values rtt threshold and above.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumEndToEndRttBucket2
   */
  @VsoMethod
  public Float getSumEndToEndRttBucket2() {
    return sumEndToEndRttBucket2;
  }

  /**
   * This is the setter method to the attribute.
   * Total connections that have rtt values rtt threshold and above.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumEndToEndRttBucket2 set the sumEndToEndRttBucket2.
   */
  @VsoMethod
  public void setSumEndToEndRttBucket2(Float  sumEndToEndRttBucket2) {
    this.sumEndToEndRttBucket2 = sumEndToEndRttBucket2;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of finished connections.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumFinishedConns
   */
  @VsoMethod
  public Float getSumFinishedConns() {
    return sumFinishedConns;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of finished connections.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumFinishedConns set the sumFinishedConns.
   */
  @VsoMethod
  public void setSumFinishedConns(Float  sumFinishedConns) {
    this.sumFinishedConns = sumFinishedConns;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of times 'latency_threshold' was breached during ingress.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumIngressLatencyExceededFlows
   */
  @VsoMethod
  public Float getSumIngressLatencyExceededFlows() {
    return sumIngressLatencyExceededFlows;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of times 'latency_threshold' was breached during ingress.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumIngressLatencyExceededFlows set the sumIngressLatencyExceededFlows.
   */
  @VsoMethod
  public void setSumIngressLatencyExceededFlows(Float  sumIngressLatencyExceededFlows) {
    this.sumIngressLatencyExceededFlows = sumIngressLatencyExceededFlows;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total connections that were lossy due to high packet retransmissions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumLossyConnections
   */
  @VsoMethod
  public Float getSumLossyConnections() {
    return sumLossyConnections;
  }

  /**
   * This is the setter method to the attribute.
   * Total connections that were lossy due to high packet retransmissions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumLossyConnections set the sumLossyConnections.
   */
  @VsoMethod
  public void setSumLossyConnections(Float  sumLossyConnections) {
    this.sumLossyConnections = sumLossyConnections;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total requests that were lossy due to high packet retransmissions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumLossyReq
   */
  @VsoMethod
  public Float getSumLossyReq() {
    return sumLossyReq;
  }

  /**
   * This is the setter method to the attribute.
   * Total requests that were lossy due to high packet retransmissions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumLossyReq set the sumLossyReq.
   */
  @VsoMethod
  public void setSumLossyReq(Float  sumLossyReq) {
    this.sumLossyReq = sumLossyReq;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total out of order packets across all connections.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumOutOfOrders
   */
  @VsoMethod
  public Float getSumOutOfOrders() {
    return sumOutOfOrders;
  }

  /**
   * This is the setter method to the attribute.
   * Total out of order packets across all connections.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumOutOfOrders set the sumOutOfOrders.
   */
  @VsoMethod
  public void setSumOutOfOrders(Float  sumOutOfOrders) {
    this.sumOutOfOrders = sumOutOfOrders;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of packets dropped due to vserver bandwidth limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumPacketDroppedUserBandwidthLimit
   */
  @VsoMethod
  public Float getSumPacketDroppedUserBandwidthLimit() {
    return sumPacketDroppedUserBandwidthLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of packets dropped due to vserver bandwidth limit.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumPacketDroppedUserBandwidthLimit set the sumPacketDroppedUserBandwidthLimit.
   */
  @VsoMethod
  public void setSumPacketDroppedUserBandwidthLimit(Float  sumPacketDroppedUserBandwidthLimit) {
    this.sumPacketDroppedUserBandwidthLimit = sumPacketDroppedUserBandwidthLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number connections used for rtt.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumRttValidConnections
   */
  @VsoMethod
  public Float getSumRttValidConnections() {
    return sumRttValidConnections;
  }

  /**
   * This is the setter method to the attribute.
   * Total number connections used for rtt.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumRttValidConnections set the sumRttValidConnections.
   */
  @VsoMethod
  public void setSumRttValidConnections(Float  sumRttValidConnections) {
    this.sumRttValidConnections = sumRttValidConnections;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total sack retransmits across all connections.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumSackRetransmits
   */
  @VsoMethod
  public Float getSumSackRetransmits() {
    return sumSackRetransmits;
  }

  /**
   * This is the setter method to the attribute.
   * Total sack retransmits across all connections.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumSackRetransmits set the sumSackRetransmits.
   */
  @VsoMethod
  public void setSumSackRetransmits(Float  sumSackRetransmits) {
    this.sumSackRetransmits = sumSackRetransmits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of connections with server flow control condition.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumServerFlowControl
   */
  @VsoMethod
  public Float getSumServerFlowControl() {
    return sumServerFlowControl;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of connections with server flow control condition.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumServerFlowControl set the sumServerFlowControl.
   */
  @VsoMethod
  public void setSumServerFlowControl(Float  sumServerFlowControl) {
    this.sumServerFlowControl = sumServerFlowControl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total connection timeouts in the interval.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumTimeoutRetransmits
   */
  @VsoMethod
  public Float getSumTimeoutRetransmits() {
    return sumTimeoutRetransmits;
  }

  /**
   * This is the setter method to the attribute.
   * Total connection timeouts in the interval.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumTimeoutRetransmits set the sumTimeoutRetransmits.
   */
  @VsoMethod
  public void setSumTimeoutRetransmits(Float  sumTimeoutRetransmits) {
    this.sumTimeoutRetransmits = sumTimeoutRetransmits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of zero window size events across all connections.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumZeroWindowSizeEvents
   */
  @VsoMethod
  public Float getSumZeroWindowSizeEvents() {
    return sumZeroWindowSizeEvents;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of zero window size events across all connections.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumZeroWindowSizeEvents set the sumZeroWindowSizeEvents.
   */
  @VsoMethod
  public void setSumZeroWindowSizeEvents(Float  sumZeroWindowSizeEvents) {
    this.sumZeroWindowSizeEvents = sumZeroWindowSizeEvents;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VserverL4MetricsObj objVserverL4MetricsObj = (VserverL4MetricsObj) o;
  return   Objects.equals(this.nodeObjId, objVserverL4MetricsObj.nodeObjId)&&
  Objects.equals(this.sumDupAckRetransmits, objVserverL4MetricsObj.sumDupAckRetransmits)&&
  Objects.equals(this.sumSackRetransmits, objVserverL4MetricsObj.sumSackRetransmits)&&
  Objects.equals(this.sumTimeoutRetransmits, objVserverL4MetricsObj.sumTimeoutRetransmits)&&
  Objects.equals(this.sumOutOfOrders, objVserverL4MetricsObj.sumOutOfOrders)&&
  Objects.equals(this.avgSyns, objVserverL4MetricsObj.avgSyns)&&
  Objects.equals(this.avgNewEstablishedConns, objVserverL4MetricsObj.avgNewEstablishedConns)&&
  Objects.equals(this.sumFinishedConns, objVserverL4MetricsObj.sumFinishedConns)&&
  Objects.equals(this.maxOpenConns, objVserverL4MetricsObj.maxOpenConns)&&
  Objects.equals(this.sumConnectionsDropped, objVserverL4MetricsObj.sumConnectionsDropped)&&
  Objects.equals(this.avgRxPkts, objVserverL4MetricsObj.avgRxPkts)&&
  Objects.equals(this.avgRxBytes, objVserverL4MetricsObj.avgRxBytes)&&
  Objects.equals(this.avgTxPkts, objVserverL4MetricsObj.avgTxPkts)&&
  Objects.equals(this.avgTxBytes, objVserverL4MetricsObj.avgTxBytes)&&
  Objects.equals(this.sumEndToEndRttBucket1, objVserverL4MetricsObj.sumEndToEndRttBucket1)&&
  Objects.equals(this.sumEndToEndRttBucket2, objVserverL4MetricsObj.sumEndToEndRttBucket2)&&
  Objects.equals(this.sumConnDuration, objVserverL4MetricsObj.sumConnDuration)&&
  Objects.equals(this.sumZeroWindowSizeEvents, objVserverL4MetricsObj.sumZeroWindowSizeEvents)&&
  Objects.equals(this.sumServerFlowControl, objVserverL4MetricsObj.sumServerFlowControl)&&
  Objects.equals(this.sumEndToEndRtt, objVserverL4MetricsObj.sumEndToEndRtt)&&
  Objects.equals(this.avgBandwidth, objVserverL4MetricsObj.avgBandwidth)&&
  Objects.equals(this.sumLossyConnections, objVserverL4MetricsObj.sumLossyConnections)&&
  Objects.equals(this.sumLossyReq, objVserverL4MetricsObj.sumLossyReq)&&
  Objects.equals(this.sumConnectionErrors, objVserverL4MetricsObj.sumConnectionErrors)&&
  Objects.equals(this.pctConnectionErrors, objVserverL4MetricsObj.pctConnectionErrors)&&
  Objects.equals(this.avgTotalRtt, objVserverL4MetricsObj.avgTotalRtt)&&
  Objects.equals(this.sumRttValidConnections, objVserverL4MetricsObj.sumRttValidConnections)&&
  Objects.equals(this.apdexc, objVserverL4MetricsObj.apdexc)&&
  Objects.equals(this.apdexrtt, objVserverL4MetricsObj.apdexrtt)&&
  Objects.equals(this.avgCompleteConns, objVserverL4MetricsObj.avgCompleteConns)&&
  Objects.equals(this.avgLossyConnections, objVserverL4MetricsObj.avgLossyConnections)&&
  Objects.equals(this.avgConnectionsDropped, objVserverL4MetricsObj.avgConnectionsDropped)&&
  Objects.equals(this.avgErroredConnections, objVserverL4MetricsObj.avgErroredConnections)&&
  Objects.equals(this.avgPolicyDrops, objVserverL4MetricsObj.avgPolicyDrops)&&
  Objects.equals(this.maxRxPktsAbsolute, objVserverL4MetricsObj.maxRxPktsAbsolute)&&
  Objects.equals(this.maxRxBytesAbsolute, objVserverL4MetricsObj.maxRxBytesAbsolute)&&
  Objects.equals(this.maxTxPktsAbsolute, objVserverL4MetricsObj.maxTxPktsAbsolute)&&
  Objects.equals(this.maxTxBytesAbsolute, objVserverL4MetricsObj.maxTxBytesAbsolute)&&
  Objects.equals(this.sumConnectionDroppedUserLimit, objVserverL4MetricsObj.sumConnectionDroppedUserLimit)&&
  Objects.equals(this.sumPacketDroppedUserBandwidthLimit, objVserverL4MetricsObj.sumPacketDroppedUserBandwidthLimit)&&
  Objects.equals(this.avgL4ClientLatency, objVserverL4MetricsObj.avgL4ClientLatency)&&
  Objects.equals(this.avgDosSynFlood, objVserverL4MetricsObj.avgDosSynFlood)&&
  Objects.equals(this.avgDosBadRstFlood, objVserverL4MetricsObj.avgDosBadRstFlood)&&
  Objects.equals(this.avgDosMalformedFlood, objVserverL4MetricsObj.avgDosMalformedFlood)&&
  Objects.equals(this.avgDosFakeSession, objVserverL4MetricsObj.avgDosFakeSession)&&
  Objects.equals(this.avgDosZeroWindowStress, objVserverL4MetricsObj.avgDosZeroWindowStress)&&
  Objects.equals(this.avgDosSmallWindowStress, objVserverL4MetricsObj.avgDosSmallWindowStress)&&
  Objects.equals(this.avgDosHttpTimeout, objVserverL4MetricsObj.avgDosHttpTimeout)&&
  Objects.equals(this.avgDosHttpError, objVserverL4MetricsObj.avgDosHttpError)&&
  Objects.equals(this.avgDosHttpAbort, objVserverL4MetricsObj.avgDosHttpAbort)&&
  Objects.equals(this.avgDosSslError, objVserverL4MetricsObj.avgDosSslError)&&
  Objects.equals(this.avgDosAppError, objVserverL4MetricsObj.avgDosAppError)&&
  Objects.equals(this.avgNetworkDosAttacks, objVserverL4MetricsObj.avgNetworkDosAttacks)&&
  Objects.equals(this.avgApplicationDosAttacks, objVserverL4MetricsObj.avgApplicationDosAttacks)&&
  Objects.equals(this.avgDosRxBytes, objVserverL4MetricsObj.avgDosRxBytes)&&
  Objects.equals(this.avgDosTxBytes, objVserverL4MetricsObj.avgDosTxBytes)&&
  Objects.equals(this.avgDosBandwidth, objVserverL4MetricsObj.avgDosBandwidth)&&
  Objects.equals(this.avgDosTotalReq, objVserverL4MetricsObj.avgDosTotalReq)&&
  Objects.equals(this.avgDosReq, objVserverL4MetricsObj.avgDosReq)&&
  Objects.equals(this.avgDosConn, objVserverL4MetricsObj.avgDosConn)&&
  Objects.equals(this.pctDosRxBytes, objVserverL4MetricsObj.pctDosRxBytes)&&
  Objects.equals(this.pctDosBandwidth, objVserverL4MetricsObj.pctDosBandwidth)&&
  Objects.equals(this.pctNetworkDosAttacks, objVserverL4MetricsObj.pctNetworkDosAttacks)&&
  Objects.equals(this.pctApplicationDosAttacks, objVserverL4MetricsObj.pctApplicationDosAttacks)&&
  Objects.equals(this.pctPolicyDrops, objVserverL4MetricsObj.pctPolicyDrops)&&
  Objects.equals(this.pctConnectionsDosAttacks, objVserverL4MetricsObj.pctConnectionsDosAttacks)&&
  Objects.equals(this.pctPktsDosAttacks, objVserverL4MetricsObj.pctPktsDosAttacks)&&
  Objects.equals(this.avgDosNonSynFlood, objVserverL4MetricsObj.avgDosNonSynFlood)&&
  Objects.equals(this.avgDosSlowUri, objVserverL4MetricsObj.avgDosSlowUri)&&
  Objects.equals(this.avgDosConnRlDrop, objVserverL4MetricsObj.avgDosConnRlDrop)&&
  Objects.equals(this.avgDosReqRlDrop, objVserverL4MetricsObj.avgDosReqRlDrop)&&
  Objects.equals(this.avgDosConnIpRlDrop, objVserverL4MetricsObj.avgDosConnIpRlDrop)&&
  Objects.equals(this.avgDosReqIpRlDrop, objVserverL4MetricsObj.avgDosReqIpRlDrop)&&
  Objects.equals(this.avgDosReqUriRlDrop, objVserverL4MetricsObj.avgDosReqUriRlDrop)&&
  Objects.equals(this.avgDosReqIpUriRlDrop, objVserverL4MetricsObj.avgDosReqIpUriRlDrop)&&
  Objects.equals(this.avgDosReqIpRlDropBad, objVserverL4MetricsObj.avgDosReqIpRlDropBad)&&
  Objects.equals(this.avgDosReqUriRlDropBad, objVserverL4MetricsObj.avgDosReqUriRlDropBad)&&
  Objects.equals(this.avgDosReqIpUriRlDropBad, objVserverL4MetricsObj.avgDosReqIpUriRlDropBad)&&
  Objects.equals(this.avgDosReqIpScanBadRlDrop, objVserverL4MetricsObj.avgDosReqIpScanBadRlDrop)&&
  Objects.equals(this.avgDosReqIpScanUnknownRlDrop, objVserverL4MetricsObj.avgDosReqIpScanUnknownRlDrop)&&
  Objects.equals(this.avgDosReqUriScanBadRlDrop, objVserverL4MetricsObj.avgDosReqUriScanBadRlDrop)&&
  Objects.equals(this.avgDosReqUriScanUnknownRlDrop, objVserverL4MetricsObj.avgDosReqUriScanUnknownRlDrop)&&
  Objects.equals(this.avgDosReqHdrRlDrop, objVserverL4MetricsObj.avgDosReqHdrRlDrop)&&
  Objects.equals(this.avgDosReqCookieRlDrop, objVserverL4MetricsObj.avgDosReqCookieRlDrop)&&
  Objects.equals(this.avgDosReqCustomRlDrop, objVserverL4MetricsObj.avgDosReqCustomRlDrop)&&
  Objects.equals(this.avgRxPktsDropped, objVserverL4MetricsObj.avgRxPktsDropped)&&
  Objects.equals(this.avgRxBytesDropped, objVserverL4MetricsObj.avgRxBytesDropped)&&
  Objects.equals(this.avgLossyReq, objVserverL4MetricsObj.avgLossyReq)&&
  Objects.equals(this.avgPktsPolicyDrops, objVserverL4MetricsObj.avgPktsPolicyDrops)&&
  Objects.equals(this.avgBytesPolicyDrops, objVserverL4MetricsObj.avgBytesPolicyDrops)&&
  Objects.equals(this.avgTotalConnections, objVserverL4MetricsObj.avgTotalConnections)&&
  Objects.equals(this.maxNumActiveSe, objVserverL4MetricsObj.maxNumActiveSe)&&
  Objects.equals(this.avgDosAttacks, objVserverL4MetricsObj.avgDosAttacks)&&
  Objects.equals(this.avgHalfOpenConns, objVserverL4MetricsObj.avgHalfOpenConns)&&
  Objects.equals(this.maxConnectionEstbTimeFe, objVserverL4MetricsObj.maxConnectionEstbTimeFe)&&
  Objects.equals(this.sumIngressLatencyExceededFlows, objVserverL4MetricsObj.sumIngressLatencyExceededFlows)&&
  Objects.equals(this.sumConnEstTimeExceededFlowsFe, objVserverL4MetricsObj.sumConnEstTimeExceededFlowsFe);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VserverL4MetricsObj {\n");
      sb.append("    apdexc: ").append(toIndentedString(apdexc)).append("\n");
        sb.append("    apdexrtt: ").append(toIndentedString(apdexrtt)).append("\n");
        sb.append("    avgApplicationDosAttacks: ").append(toIndentedString(avgApplicationDosAttacks)).append("\n");
        sb.append("    avgBandwidth: ").append(toIndentedString(avgBandwidth)).append("\n");
        sb.append("    avgBytesPolicyDrops: ").append(toIndentedString(avgBytesPolicyDrops)).append("\n");
        sb.append("    avgCompleteConns: ").append(toIndentedString(avgCompleteConns)).append("\n");
        sb.append("    avgConnectionsDropped: ").append(toIndentedString(avgConnectionsDropped)).append("\n");
        sb.append("    avgDosAppError: ").append(toIndentedString(avgDosAppError)).append("\n");
        sb.append("    avgDosAttacks: ").append(toIndentedString(avgDosAttacks)).append("\n");
        sb.append("    avgDosBadRstFlood: ").append(toIndentedString(avgDosBadRstFlood)).append("\n");
        sb.append("    avgDosBandwidth: ").append(toIndentedString(avgDosBandwidth)).append("\n");
        sb.append("    avgDosConn: ").append(toIndentedString(avgDosConn)).append("\n");
        sb.append("    avgDosConnIpRlDrop: ").append(toIndentedString(avgDosConnIpRlDrop)).append("\n");
        sb.append("    avgDosConnRlDrop: ").append(toIndentedString(avgDosConnRlDrop)).append("\n");
        sb.append("    avgDosFakeSession: ").append(toIndentedString(avgDosFakeSession)).append("\n");
        sb.append("    avgDosHttpAbort: ").append(toIndentedString(avgDosHttpAbort)).append("\n");
        sb.append("    avgDosHttpError: ").append(toIndentedString(avgDosHttpError)).append("\n");
        sb.append("    avgDosHttpTimeout: ").append(toIndentedString(avgDosHttpTimeout)).append("\n");
        sb.append("    avgDosMalformedFlood: ").append(toIndentedString(avgDosMalformedFlood)).append("\n");
        sb.append("    avgDosNonSynFlood: ").append(toIndentedString(avgDosNonSynFlood)).append("\n");
        sb.append("    avgDosReq: ").append(toIndentedString(avgDosReq)).append("\n");
        sb.append("    avgDosReqCookieRlDrop: ").append(toIndentedString(avgDosReqCookieRlDrop)).append("\n");
        sb.append("    avgDosReqCustomRlDrop: ").append(toIndentedString(avgDosReqCustomRlDrop)).append("\n");
        sb.append("    avgDosReqHdrRlDrop: ").append(toIndentedString(avgDosReqHdrRlDrop)).append("\n");
        sb.append("    avgDosReqIpRlDrop: ").append(toIndentedString(avgDosReqIpRlDrop)).append("\n");
        sb.append("    avgDosReqIpRlDropBad: ").append(toIndentedString(avgDosReqIpRlDropBad)).append("\n");
        sb.append("    avgDosReqIpScanBadRlDrop: ").append(toIndentedString(avgDosReqIpScanBadRlDrop)).append("\n");
        sb.append("    avgDosReqIpScanUnknownRlDrop: ").append(toIndentedString(avgDosReqIpScanUnknownRlDrop)).append("\n");
        sb.append("    avgDosReqIpUriRlDrop: ").append(toIndentedString(avgDosReqIpUriRlDrop)).append("\n");
        sb.append("    avgDosReqIpUriRlDropBad: ").append(toIndentedString(avgDosReqIpUriRlDropBad)).append("\n");
        sb.append("    avgDosReqRlDrop: ").append(toIndentedString(avgDosReqRlDrop)).append("\n");
        sb.append("    avgDosReqUriRlDrop: ").append(toIndentedString(avgDosReqUriRlDrop)).append("\n");
        sb.append("    avgDosReqUriRlDropBad: ").append(toIndentedString(avgDosReqUriRlDropBad)).append("\n");
        sb.append("    avgDosReqUriScanBadRlDrop: ").append(toIndentedString(avgDosReqUriScanBadRlDrop)).append("\n");
        sb.append("    avgDosReqUriScanUnknownRlDrop: ").append(toIndentedString(avgDosReqUriScanUnknownRlDrop)).append("\n");
        sb.append("    avgDosRxBytes: ").append(toIndentedString(avgDosRxBytes)).append("\n");
        sb.append("    avgDosSlowUri: ").append(toIndentedString(avgDosSlowUri)).append("\n");
        sb.append("    avgDosSmallWindowStress: ").append(toIndentedString(avgDosSmallWindowStress)).append("\n");
        sb.append("    avgDosSslError: ").append(toIndentedString(avgDosSslError)).append("\n");
        sb.append("    avgDosSynFlood: ").append(toIndentedString(avgDosSynFlood)).append("\n");
        sb.append("    avgDosTotalReq: ").append(toIndentedString(avgDosTotalReq)).append("\n");
        sb.append("    avgDosTxBytes: ").append(toIndentedString(avgDosTxBytes)).append("\n");
        sb.append("    avgDosZeroWindowStress: ").append(toIndentedString(avgDosZeroWindowStress)).append("\n");
        sb.append("    avgErroredConnections: ").append(toIndentedString(avgErroredConnections)).append("\n");
        sb.append("    avgHalfOpenConns: ").append(toIndentedString(avgHalfOpenConns)).append("\n");
        sb.append("    avgL4ClientLatency: ").append(toIndentedString(avgL4ClientLatency)).append("\n");
        sb.append("    avgLossyConnections: ").append(toIndentedString(avgLossyConnections)).append("\n");
        sb.append("    avgLossyReq: ").append(toIndentedString(avgLossyReq)).append("\n");
        sb.append("    avgNetworkDosAttacks: ").append(toIndentedString(avgNetworkDosAttacks)).append("\n");
        sb.append("    avgNewEstablishedConns: ").append(toIndentedString(avgNewEstablishedConns)).append("\n");
        sb.append("    avgPktsPolicyDrops: ").append(toIndentedString(avgPktsPolicyDrops)).append("\n");
        sb.append("    avgPolicyDrops: ").append(toIndentedString(avgPolicyDrops)).append("\n");
        sb.append("    avgRxBytes: ").append(toIndentedString(avgRxBytes)).append("\n");
        sb.append("    avgRxBytesDropped: ").append(toIndentedString(avgRxBytesDropped)).append("\n");
        sb.append("    avgRxPkts: ").append(toIndentedString(avgRxPkts)).append("\n");
        sb.append("    avgRxPktsDropped: ").append(toIndentedString(avgRxPktsDropped)).append("\n");
        sb.append("    avgSyns: ").append(toIndentedString(avgSyns)).append("\n");
        sb.append("    avgTotalConnections: ").append(toIndentedString(avgTotalConnections)).append("\n");
        sb.append("    avgTotalRtt: ").append(toIndentedString(avgTotalRtt)).append("\n");
        sb.append("    avgTxBytes: ").append(toIndentedString(avgTxBytes)).append("\n");
        sb.append("    avgTxPkts: ").append(toIndentedString(avgTxPkts)).append("\n");
        sb.append("    maxConnectionEstbTimeFe: ").append(toIndentedString(maxConnectionEstbTimeFe)).append("\n");
        sb.append("    maxNumActiveSe: ").append(toIndentedString(maxNumActiveSe)).append("\n");
        sb.append("    maxOpenConns: ").append(toIndentedString(maxOpenConns)).append("\n");
        sb.append("    maxRxBytesAbsolute: ").append(toIndentedString(maxRxBytesAbsolute)).append("\n");
        sb.append("    maxRxPktsAbsolute: ").append(toIndentedString(maxRxPktsAbsolute)).append("\n");
        sb.append("    maxTxBytesAbsolute: ").append(toIndentedString(maxTxBytesAbsolute)).append("\n");
        sb.append("    maxTxPktsAbsolute: ").append(toIndentedString(maxTxPktsAbsolute)).append("\n");
        sb.append("    nodeObjId: ").append(toIndentedString(nodeObjId)).append("\n");
        sb.append("    pctApplicationDosAttacks: ").append(toIndentedString(pctApplicationDosAttacks)).append("\n");
        sb.append("    pctConnectionErrors: ").append(toIndentedString(pctConnectionErrors)).append("\n");
        sb.append("    pctConnectionsDosAttacks: ").append(toIndentedString(pctConnectionsDosAttacks)).append("\n");
        sb.append("    pctDosBandwidth: ").append(toIndentedString(pctDosBandwidth)).append("\n");
        sb.append("    pctDosRxBytes: ").append(toIndentedString(pctDosRxBytes)).append("\n");
        sb.append("    pctNetworkDosAttacks: ").append(toIndentedString(pctNetworkDosAttacks)).append("\n");
        sb.append("    pctPktsDosAttacks: ").append(toIndentedString(pctPktsDosAttacks)).append("\n");
        sb.append("    pctPolicyDrops: ").append(toIndentedString(pctPolicyDrops)).append("\n");
        sb.append("    sumConnDuration: ").append(toIndentedString(sumConnDuration)).append("\n");
        sb.append("    sumConnEstTimeExceededFlowsFe: ").append(toIndentedString(sumConnEstTimeExceededFlowsFe)).append("\n");
        sb.append("    sumConnectionDroppedUserLimit: ").append(toIndentedString(sumConnectionDroppedUserLimit)).append("\n");
        sb.append("    sumConnectionErrors: ").append(toIndentedString(sumConnectionErrors)).append("\n");
        sb.append("    sumConnectionsDropped: ").append(toIndentedString(sumConnectionsDropped)).append("\n");
        sb.append("    sumDupAckRetransmits: ").append(toIndentedString(sumDupAckRetransmits)).append("\n");
        sb.append("    sumEndToEndRtt: ").append(toIndentedString(sumEndToEndRtt)).append("\n");
        sb.append("    sumEndToEndRttBucket1: ").append(toIndentedString(sumEndToEndRttBucket1)).append("\n");
        sb.append("    sumEndToEndRttBucket2: ").append(toIndentedString(sumEndToEndRttBucket2)).append("\n");
        sb.append("    sumFinishedConns: ").append(toIndentedString(sumFinishedConns)).append("\n");
        sb.append("    sumIngressLatencyExceededFlows: ").append(toIndentedString(sumIngressLatencyExceededFlows)).append("\n");
        sb.append("    sumLossyConnections: ").append(toIndentedString(sumLossyConnections)).append("\n");
        sb.append("    sumLossyReq: ").append(toIndentedString(sumLossyReq)).append("\n");
        sb.append("    sumOutOfOrders: ").append(toIndentedString(sumOutOfOrders)).append("\n");
        sb.append("    sumPacketDroppedUserBandwidthLimit: ").append(toIndentedString(sumPacketDroppedUserBandwidthLimit)).append("\n");
        sb.append("    sumRttValidConnections: ").append(toIndentedString(sumRttValidConnections)).append("\n");
        sb.append("    sumSackRetransmits: ").append(toIndentedString(sumSackRetransmits)).append("\n");
        sb.append("    sumServerFlowControl: ").append(toIndentedString(sumServerFlowControl)).append("\n");
        sb.append("    sumTimeoutRetransmits: ").append(toIndentedString(sumTimeoutRetransmits)).append("\n");
        sb.append("    sumZeroWindowSizeEvents: ").append(toIndentedString(sumZeroWindowSizeEvents)).append("\n");
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

