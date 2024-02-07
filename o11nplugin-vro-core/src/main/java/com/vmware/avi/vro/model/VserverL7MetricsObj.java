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
 * The VserverL7MetricsObj is a POJO class extends AviRestResource that used for creating
 * VserverL7MetricsObj.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VserverL7MetricsObj")
@VsoFinder(name = Constants.FINDER_VRO_VSERVERL7METRICSOBJ)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VserverL7MetricsObj extends AviRestResource {
    @JsonProperty("apdexr")
    @JsonInclude(Include.NON_NULL)
    private Float apdexr;

    @JsonProperty("avg_application_response_time")
    @JsonInclude(Include.NON_NULL)
    private Float avgApplicationResponseTime;

    @JsonProperty("avg_blocking_time")
    @JsonInclude(Include.NON_NULL)
    private Float avgBlockingTime;

    @JsonProperty("avg_browser_rendering_time")
    @JsonInclude(Include.NON_NULL)
    private Float avgBrowserRenderingTime;

    @JsonProperty("avg_cache_bytes")
    @JsonInclude(Include.NON_NULL)
    private Float avgCacheBytes;

    @JsonProperty("avg_cache_hits")
    @JsonInclude(Include.NON_NULL)
    private Float avgCacheHits;

    @JsonProperty("avg_cacheable_bytes")
    @JsonInclude(Include.NON_NULL)
    private Float avgCacheableBytes;

    @JsonProperty("avg_cacheable_hits")
    @JsonInclude(Include.NON_NULL)
    private Float avgCacheableHits;

    @JsonProperty("avg_client_data_transfer_time")
    @JsonInclude(Include.NON_NULL)
    private Float avgClientDataTransferTime;

    @JsonProperty("avg_client_rtt")
    @JsonInclude(Include.NON_NULL)
    private Float avgClientRtt;

    @JsonProperty("avg_client_txn_latency")
    @JsonInclude(Include.NON_NULL)
    private Float avgClientTxnLatency;

    @JsonProperty("avg_complete_responses")
    @JsonInclude(Include.NON_NULL)
    private Float avgCompleteResponses;

    @JsonProperty("avg_connection_time")
    @JsonInclude(Include.NON_NULL)
    private Float avgConnectionTime;

    @JsonProperty("avg_dns_lookup_time")
    @JsonInclude(Include.NON_NULL)
    private Float avgDnsLookupTime;

    @JsonProperty("avg_dom_content_load_time")
    @JsonInclude(Include.NON_NULL)
    private Float avgDomContentLoadTime;

    @JsonProperty("avg_error_responses")
    @JsonInclude(Include.NON_NULL)
    private Float avgErrorResponses;

    @JsonProperty("avg_errors_excluded")
    @JsonInclude(Include.NON_NULL)
    private Float avgErrorsExcluded;

    @JsonProperty("avg_frustrated_responses")
    @JsonInclude(Include.NON_NULL)
    private Float avgFrustratedResponses;

    @JsonProperty("avg_http_headers_bytes")
    @JsonInclude(Include.NON_NULL)
    private Float avgHttpHeadersBytes;

    @JsonProperty("avg_http_headers_count")
    @JsonInclude(Include.NON_NULL)
    private Float avgHttpHeadersCount;

    @JsonProperty("avg_http_params_count")
    @JsonInclude(Include.NON_NULL)
    private Float avgHttpParamsCount;

    @JsonProperty("avg_page_download_time")
    @JsonInclude(Include.NON_NULL)
    private Float avgPageDownloadTime;

    @JsonProperty("avg_page_load_time")
    @JsonInclude(Include.NON_NULL)
    private Float avgPageLoadTime;

    @JsonProperty("avg_params_per_req")
    @JsonInclude(Include.NON_NULL)
    private Float avgParamsPerReq;

    @JsonProperty("avg_post_bytes")
    @JsonInclude(Include.NON_NULL)
    private Float avgPostBytes;

    @JsonProperty("avg_post_compression_bytes")
    @JsonInclude(Include.NON_NULL)
    private Float avgPostCompressionBytes;

    @JsonProperty("avg_pre_compression_bytes")
    @JsonInclude(Include.NON_NULL)
    private Float avgPreCompressionBytes;

    @JsonProperty("avg_redirection_time")
    @JsonInclude(Include.NON_NULL)
    private Float avgRedirectionTime;

    @JsonProperty("avg_reqs_per_session")
    @JsonInclude(Include.NON_NULL)
    private Float avgReqsPerSession;

    @JsonProperty("avg_resp_1xx")
    @JsonInclude(Include.NON_NULL)
    private Float avgResp1Xx;

    @JsonProperty("avg_resp_2xx")
    @JsonInclude(Include.NON_NULL)
    private Float avgResp2Xx;

    @JsonProperty("avg_resp_3xx")
    @JsonInclude(Include.NON_NULL)
    private Float avgResp3Xx;

    @JsonProperty("avg_resp_4xx")
    @JsonInclude(Include.NON_NULL)
    private Float avgResp4Xx;

    @JsonProperty("avg_resp_4xx_avi_errors")
    @JsonInclude(Include.NON_NULL)
    private Float avgResp4XxAviErrors;

    @JsonProperty("avg_resp_5xx")
    @JsonInclude(Include.NON_NULL)
    private Float avgResp5Xx;

    @JsonProperty("avg_resp_5xx_avi_errors")
    @JsonInclude(Include.NON_NULL)
    private Float avgResp5XxAviErrors;

    @JsonProperty("avg_rum_client_data_transfer_time")
    @JsonInclude(Include.NON_NULL)
    private Float avgRumClientDataTransferTime;

    @JsonProperty("avg_satisfactory_responses")
    @JsonInclude(Include.NON_NULL)
    private Float avgSatisfactoryResponses;

    @JsonProperty("avg_server_rtt")
    @JsonInclude(Include.NON_NULL)
    private Float avgServerRtt;

    @JsonProperty("avg_service_time")
    @JsonInclude(Include.NON_NULL)
    private Float avgServiceTime;

    @JsonProperty("avg_ssl_auth_dsa")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslAuthDsa;

    @JsonProperty("avg_ssl_auth_ecdsa")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslAuthEcdsa;

    @JsonProperty("avg_ssl_auth_rsa")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslAuthRsa;

    @JsonProperty("avg_ssl_connections")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslConnections;

    @JsonProperty("avg_ssl_ecdsa_non_pfs")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslEcdsaNonPfs;

    @JsonProperty("avg_ssl_ecdsa_pfs")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslEcdsaPfs;

    @JsonProperty("avg_ssl_errors")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslErrors;

    @JsonProperty("avg_ssl_failed_connections")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslFailedConnections;

    @JsonProperty("avg_ssl_handshake_network_errors")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslHandshakeNetworkErrors;

    @JsonProperty("avg_ssl_handshake_protocol_errors")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslHandshakeProtocolErrors;

    @JsonProperty("avg_ssl_handshakes_new")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslHandshakesNew;

    @JsonProperty("avg_ssl_handshakes_non_pfs")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslHandshakesNonPfs;

    @JsonProperty("avg_ssl_handshakes_pfs")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslHandshakesPfs;

    @JsonProperty("avg_ssl_handshakes_reused")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslHandshakesReused;

    @JsonProperty("avg_ssl_handshakes_timedout")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslHandshakesTimedout;

    @JsonProperty("avg_ssl_kx_dh")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslKxDh;

    @JsonProperty("avg_ssl_kx_ecdh")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslKxEcdh;

    @JsonProperty("avg_ssl_kx_rsa")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslKxRsa;

    @JsonProperty("avg_ssl_rsa_non_pfs")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslRsaNonPfs;

    @JsonProperty("avg_ssl_rsa_pfs")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslRsaPfs;

    @JsonProperty("avg_ssl_ver_ssl30")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslVerSsl30;

    @JsonProperty("avg_ssl_ver_tls10")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslVerTls10;

    @JsonProperty("avg_ssl_ver_tls11")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslVerTls11;

    @JsonProperty("avg_ssl_ver_tls12")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslVerTls12;

    @JsonProperty("avg_ssl_ver_tls13")
    @JsonInclude(Include.NON_NULL)
    private Float avgSslVerTls13;

    @JsonProperty("avg_tolerated_responses")
    @JsonInclude(Include.NON_NULL)
    private Float avgToleratedResponses;

    @JsonProperty("avg_total_http2_requests")
    @JsonInclude(Include.NON_NULL)
    private Float avgTotalHttp2Requests;

    @JsonProperty("avg_total_requests")
    @JsonInclude(Include.NON_NULL)
    private Float avgTotalRequests;

    @JsonProperty("avg_uri_length")
    @JsonInclude(Include.NON_NULL)
    private Float avgUriLength;

    @JsonProperty("avg_waf_attacks")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafAttacks;

    @JsonProperty("avg_waf_disabled")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafDisabled;

    @JsonProperty("avg_waf_evaluated")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafEvaluated;

    @JsonProperty("avg_waf_evaluated_request_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafEvaluatedRequestBodyPhase;

    @JsonProperty("avg_waf_evaluated_request_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafEvaluatedRequestHeaderPhase;

    @JsonProperty("avg_waf_evaluated_response_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafEvaluatedResponseBodyPhase;

    @JsonProperty("avg_waf_evaluated_response_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafEvaluatedResponseHeaderPhase;

    @JsonProperty("avg_waf_flagged")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafFlagged;

    @JsonProperty("avg_waf_flagged_request_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafFlaggedRequestBodyPhase;

    @JsonProperty("avg_waf_flagged_request_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafFlaggedRequestHeaderPhase;

    @JsonProperty("avg_waf_flagged_response_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafFlaggedResponseBodyPhase;

    @JsonProperty("avg_waf_flagged_response_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafFlaggedResponseHeaderPhase;

    @JsonProperty("avg_waf_latency_request_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafLatencyRequestBodyPhase;

    @JsonProperty("avg_waf_latency_request_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafLatencyRequestHeaderPhase;

    @JsonProperty("avg_waf_latency_response_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafLatencyResponseBodyPhase;

    @JsonProperty("avg_waf_latency_response_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafLatencyResponseHeaderPhase;

    @JsonProperty("avg_waf_matched")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafMatched;

    @JsonProperty("avg_waf_matched_request_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafMatchedRequestBodyPhase;

    @JsonProperty("avg_waf_matched_request_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafMatchedRequestHeaderPhase;

    @JsonProperty("avg_waf_matched_response_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafMatchedResponseBodyPhase;

    @JsonProperty("avg_waf_matched_response_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafMatchedResponseHeaderPhase;

    @JsonProperty("avg_waf_rejected")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafRejected;

    @JsonProperty("avg_waf_rejected_request_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafRejectedRequestBodyPhase;

    @JsonProperty("avg_waf_rejected_request_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafRejectedRequestHeaderPhase;

    @JsonProperty("avg_waf_rejected_response_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafRejectedResponseBodyPhase;

    @JsonProperty("avg_waf_rejected_response_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float avgWafRejectedResponseHeaderPhase;

    @JsonProperty("avg_waiting_time")
    @JsonInclude(Include.NON_NULL)
    private Float avgWaitingTime;

    @JsonProperty("max_concurrent_sessions")
    @JsonInclude(Include.NON_NULL)
    private Float maxConcurrentSessions;

    @JsonProperty("max_ssl_open_sessions")
    @JsonInclude(Include.NON_NULL)
    private Float maxSslOpenSessions;

    @JsonProperty("node_obj_id")
    @JsonInclude(Include.NON_NULL)
    private String nodeObjId;

    @JsonProperty("pct_cache_hits")
    @JsonInclude(Include.NON_NULL)
    private Float pctCacheHits;

    @JsonProperty("pct_cacheable_hits")
    @JsonInclude(Include.NON_NULL)
    private Float pctCacheableHits;

    @JsonProperty("pct_get_reqs")
    @JsonInclude(Include.NON_NULL)
    private Float pctGetReqs;

    @JsonProperty("pct_post_reqs")
    @JsonInclude(Include.NON_NULL)
    private Float pctPostReqs;

    @JsonProperty("pct_response_errors")
    @JsonInclude(Include.NON_NULL)
    private Float pctResponseErrors;

    @JsonProperty("pct_ssl_failed_connections")
    @JsonInclude(Include.NON_NULL)
    private Float pctSslFailedConnections;

    @JsonProperty("pct_waf_attacks")
    @JsonInclude(Include.NON_NULL)
    private Float pctWafAttacks;

    @JsonProperty("pct_waf_disabled")
    @JsonInclude(Include.NON_NULL)
    private Float pctWafDisabled;

    @JsonProperty("pct_waf_evaluated")
    @JsonInclude(Include.NON_NULL)
    private Float pctWafEvaluated;

    @JsonProperty("pct_waf_flagged")
    @JsonInclude(Include.NON_NULL)
    private Float pctWafFlagged;

    @JsonProperty("pct_waf_matched")
    @JsonInclude(Include.NON_NULL)
    private Float pctWafMatched;

    @JsonProperty("pct_waf_rejected")
    @JsonInclude(Include.NON_NULL)
    private Float pctWafRejected;

    @JsonProperty("rum_apdexr")
    @JsonInclude(Include.NON_NULL)
    private Float rumApdexr;

    @JsonProperty("ssl_protocol_strength")
    @JsonInclude(Include.NON_NULL)
    private Float sslProtocolStrength;

    @JsonProperty("sum_application_response_time")
    @JsonInclude(Include.NON_NULL)
    private Float sumApplicationResponseTime;

    @JsonProperty("sum_blocking_time")
    @JsonInclude(Include.NON_NULL)
    private Float sumBlockingTime;

    @JsonProperty("sum_browser_rendering_time")
    @JsonInclude(Include.NON_NULL)
    private Float sumBrowserRenderingTime;

    @JsonProperty("sum_client_data_transfer_time")
    @JsonInclude(Include.NON_NULL)
    private Float sumClientDataTransferTime;

    @JsonProperty("sum_client_rtt")
    @JsonInclude(Include.NON_NULL)
    private Float sumClientRtt;

    @JsonProperty("sum_connection_time")
    @JsonInclude(Include.NON_NULL)
    private Float sumConnectionTime;

    @JsonProperty("sum_dns_lookup_time")
    @JsonInclude(Include.NON_NULL)
    private Float sumDnsLookupTime;

    @JsonProperty("sum_dom_content_load_time")
    @JsonInclude(Include.NON_NULL)
    private Float sumDomContentLoadTime;

    @JsonProperty("sum_errors")
    @JsonInclude(Include.NON_NULL)
    private Float sumErrors;

    @JsonProperty("sum_finished_sessions")
    @JsonInclude(Include.NON_NULL)
    private Float sumFinishedSessions;

    @JsonProperty("sum_get_client_txn_latency")
    @JsonInclude(Include.NON_NULL)
    private Float sumGetClientTxnLatency;

    @JsonProperty("sum_get_client_txn_latency_bucket1")
    @JsonInclude(Include.NON_NULL)
    private Float sumGetClientTxnLatencyBucket1;

    @JsonProperty("sum_get_client_txn_latency_bucket2")
    @JsonInclude(Include.NON_NULL)
    private Float sumGetClientTxnLatencyBucket2;

    @JsonProperty("sum_get_reqs")
    @JsonInclude(Include.NON_NULL)
    private Float sumGetReqs;

    @JsonProperty("sum_http_headers_bytes")
    @JsonInclude(Include.NON_NULL)
    private Float sumHttpHeadersBytes;

    @JsonProperty("sum_http_headers_count")
    @JsonInclude(Include.NON_NULL)
    private Float sumHttpHeadersCount;

    @JsonProperty("sum_http_params_count")
    @JsonInclude(Include.NON_NULL)
    private Float sumHttpParamsCount;

    @JsonProperty("sum_num_page_load_time_bucket1")
    @JsonInclude(Include.NON_NULL)
    private Float sumNumPageLoadTimeBucket1;

    @JsonProperty("sum_num_page_load_time_bucket2")
    @JsonInclude(Include.NON_NULL)
    private Float sumNumPageLoadTimeBucket2;

    @JsonProperty("sum_num_rum_samples")
    @JsonInclude(Include.NON_NULL)
    private Float sumNumRumSamples;

    @JsonProperty("sum_other_client_txn_latency")
    @JsonInclude(Include.NON_NULL)
    private Float sumOtherClientTxnLatency;

    @JsonProperty("sum_other_client_txn_latency_bucket1")
    @JsonInclude(Include.NON_NULL)
    private Float sumOtherClientTxnLatencyBucket1;

    @JsonProperty("sum_other_client_txn_latency_bucket2")
    @JsonInclude(Include.NON_NULL)
    private Float sumOtherClientTxnLatencyBucket2;

    @JsonProperty("sum_other_reqs")
    @JsonInclude(Include.NON_NULL)
    private Float sumOtherReqs;

    @JsonProperty("sum_page_download_time")
    @JsonInclude(Include.NON_NULL)
    private Float sumPageDownloadTime;

    @JsonProperty("sum_page_load_time")
    @JsonInclude(Include.NON_NULL)
    private Float sumPageLoadTime;

    @JsonProperty("sum_post_bytes")
    @JsonInclude(Include.NON_NULL)
    private Float sumPostBytes;

    @JsonProperty("sum_post_client_txn_latency")
    @JsonInclude(Include.NON_NULL)
    private Float sumPostClientTxnLatency;

    @JsonProperty("sum_post_client_txn_latency_bucket1")
    @JsonInclude(Include.NON_NULL)
    private Float sumPostClientTxnLatencyBucket1;

    @JsonProperty("sum_post_client_txn_latency_bucket2")
    @JsonInclude(Include.NON_NULL)
    private Float sumPostClientTxnLatencyBucket2;

    @JsonProperty("sum_post_reqs")
    @JsonInclude(Include.NON_NULL)
    private Float sumPostReqs;

    @JsonProperty("sum_redirection_time")
    @JsonInclude(Include.NON_NULL)
    private Float sumRedirectionTime;

    @JsonProperty("sum_reqs_finished_sessions")
    @JsonInclude(Include.NON_NULL)
    private Float sumReqsFinishedSessions;

    @JsonProperty("sum_reqs_with_params")
    @JsonInclude(Include.NON_NULL)
    private Float sumReqsWithParams;

    @JsonProperty("sum_resp_1xx")
    @JsonInclude(Include.NON_NULL)
    private Float sumResp1Xx;

    @JsonProperty("sum_resp_2xx")
    @JsonInclude(Include.NON_NULL)
    private Float sumResp2Xx;

    @JsonProperty("sum_resp_3xx")
    @JsonInclude(Include.NON_NULL)
    private Float sumResp3Xx;

    @JsonProperty("sum_resp_4xx")
    @JsonInclude(Include.NON_NULL)
    private Float sumResp4Xx;

    @JsonProperty("sum_resp_5xx")
    @JsonInclude(Include.NON_NULL)
    private Float sumResp5Xx;

    @JsonProperty("sum_rum_client_data_transfer_time")
    @JsonInclude(Include.NON_NULL)
    private Float sumRumClientDataTransferTime;

    @JsonProperty("sum_server_rtt")
    @JsonInclude(Include.NON_NULL)
    private Float sumServerRtt;

    @JsonProperty("sum_service_time")
    @JsonInclude(Include.NON_NULL)
    private Float sumServiceTime;

    @JsonProperty("sum_total_responses")
    @JsonInclude(Include.NON_NULL)
    private Float sumTotalResponses;

    @JsonProperty("sum_uri_length")
    @JsonInclude(Include.NON_NULL)
    private Float sumUriLength;

    @JsonProperty("sum_waf_attacks")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafAttacks;

    @JsonProperty("sum_waf_disabled")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafDisabled;

    @JsonProperty("sum_waf_evaluated_request_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafEvaluatedRequestBodyPhase;

    @JsonProperty("sum_waf_evaluated_request_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafEvaluatedRequestHeaderPhase;

    @JsonProperty("sum_waf_evaluated_response_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafEvaluatedResponseBodyPhase;

    @JsonProperty("sum_waf_evaluated_response_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafEvaluatedResponseHeaderPhase;

    @JsonProperty("sum_waf_flagged")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafFlagged;

    @JsonProperty("sum_waf_flagged_request_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafFlaggedRequestBodyPhase;

    @JsonProperty("sum_waf_flagged_request_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafFlaggedRequestHeaderPhase;

    @JsonProperty("sum_waf_flagged_response_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafFlaggedResponseBodyPhase;

    @JsonProperty("sum_waf_flagged_response_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafFlaggedResponseHeaderPhase;

    @JsonProperty("sum_waf_latency_request_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafLatencyRequestBodyPhase;

    @JsonProperty("sum_waf_latency_request_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafLatencyRequestHeaderPhase;

    @JsonProperty("sum_waf_latency_response_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafLatencyResponseBodyPhase;

    @JsonProperty("sum_waf_latency_response_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafLatencyResponseHeaderPhase;

    @JsonProperty("sum_waf_matched_request_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafMatchedRequestBodyPhase;

    @JsonProperty("sum_waf_matched_request_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafMatchedRequestHeaderPhase;

    @JsonProperty("sum_waf_matched_response_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafMatchedResponseBodyPhase;

    @JsonProperty("sum_waf_matched_response_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafMatchedResponseHeaderPhase;

    @JsonProperty("sum_waf_rejected")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafRejected;

    @JsonProperty("sum_waf_rejected_request_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafRejectedRequestBodyPhase;

    @JsonProperty("sum_waf_rejected_request_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafRejectedRequestHeaderPhase;

    @JsonProperty("sum_waf_rejected_response_body_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafRejectedResponseBodyPhase;

    @JsonProperty("sum_waf_rejected_response_header_phase")
    @JsonInclude(Include.NON_NULL)
    private Float sumWafRejectedResponseHeaderPhase;

    @JsonProperty("sum_waiting_time")
    @JsonInclude(Include.NON_NULL)
    private Float sumWaitingTime;



  /**
   * This is the getter method this will return the attribute value.
   * Client apdex measures quality of server response based on latency.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return apdexr
   */
  @VsoMethod
  public Float getApdexr() {
    return apdexr;
  }

  /**
   * This is the setter method to the attribute.
   * Client apdex measures quality of server response based on latency.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param apdexr set the apdexr.
   */
  @VsoMethod
  public void setApdexr(Float  apdexr) {
    this.apdexr = apdexr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average server/application response latency.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgApplicationResponseTime
   */
  @VsoMethod
  public Float getAvgApplicationResponseTime() {
    return avgApplicationResponseTime;
  }

  /**
   * This is the setter method to the attribute.
   * Average server/application response latency.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgApplicationResponseTime set the avgApplicationResponseTime.
   */
  @VsoMethod
  public void setAvgApplicationResponseTime(Float  avgApplicationResponseTime) {
    this.avgApplicationResponseTime = avgApplicationResponseTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average time client was blocked as reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgBlockingTime
   */
  @VsoMethod
  public Float getAvgBlockingTime() {
    return avgBlockingTime;
  }

  /**
   * This is the setter method to the attribute.
   * Average time client was blocked as reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgBlockingTime set the avgBlockingTime.
   */
  @VsoMethod
  public void setAvgBlockingTime(Float  avgBlockingTime) {
    this.avgBlockingTime = avgBlockingTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average browser rendering latency.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgBrowserRenderingTime
   */
  @VsoMethod
  public Float getAvgBrowserRenderingTime() {
    return avgBrowserRenderingTime;
  }

  /**
   * This is the setter method to the attribute.
   * Average browser rendering latency.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgBrowserRenderingTime set the avgBrowserRenderingTime.
   */
  @VsoMethod
  public void setAvgBrowserRenderingTime(Float  avgBrowserRenderingTime) {
    this.avgBrowserRenderingTime = avgBrowserRenderingTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average cache bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgCacheBytes
   */
  @VsoMethod
  public Float getAvgCacheBytes() {
    return avgCacheBytes;
  }

  /**
   * This is the setter method to the attribute.
   * Average cache bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgCacheBytes set the avgCacheBytes.
   */
  @VsoMethod
  public void setAvgCacheBytes(Float  avgCacheBytes) {
    this.avgCacheBytes = avgCacheBytes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average cache hit of requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgCacheHits
   */
  @VsoMethod
  public Float getAvgCacheHits() {
    return avgCacheHits;
  }

  /**
   * This is the setter method to the attribute.
   * Average cache hit of requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgCacheHits set the avgCacheHits.
   */
  @VsoMethod
  public void setAvgCacheHits(Float  avgCacheHits) {
    this.avgCacheHits = avgCacheHits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average cacheable bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgCacheableBytes
   */
  @VsoMethod
  public Float getAvgCacheableBytes() {
    return avgCacheableBytes;
  }

  /**
   * This is the setter method to the attribute.
   * Average cacheable bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgCacheableBytes set the avgCacheableBytes.
   */
  @VsoMethod
  public void setAvgCacheableBytes(Float  avgCacheableBytes) {
    this.avgCacheableBytes = avgCacheableBytes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average cacheable hit of requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgCacheableHits
   */
  @VsoMethod
  public Float getAvgCacheableHits() {
    return avgCacheableHits;
  }

  /**
   * This is the setter method to the attribute.
   * Average cacheable hit of requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgCacheableHits set the avgCacheableHits.
   */
  @VsoMethod
  public void setAvgCacheableHits(Float  avgCacheableHits) {
    this.avgCacheableHits = avgCacheableHits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average client data transfer time that represents latency of sending response to the client excluding the rtt time.
   * Higher client data transfer time signifies lower bandwidth  between client and avi service engine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgClientDataTransferTime
   */
  @VsoMethod
  public Float getAvgClientDataTransferTime() {
    return avgClientDataTransferTime;
  }

  /**
   * This is the setter method to the attribute.
   * Average client data transfer time that represents latency of sending response to the client excluding the rtt time.
   * Higher client data transfer time signifies lower bandwidth  between client and avi service engine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgClientDataTransferTime set the avgClientDataTransferTime.
   */
  @VsoMethod
  public void setAvgClientDataTransferTime(Float  avgClientDataTransferTime) {
    this.avgClientDataTransferTime = avgClientDataTransferTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average client round trip time.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgClientRtt
   */
  @VsoMethod
  public Float getAvgClientRtt() {
    return avgClientRtt;
  }

  /**
   * This is the setter method to the attribute.
   * Average client round trip time.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgClientRtt set the avgClientRtt.
   */
  @VsoMethod
  public void setAvgClientRtt(Float  avgClientRtt) {
    this.avgClientRtt = avgClientRtt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average client transaction latency computed by adding response latencies across all http requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgClientTxnLatency
   */
  @VsoMethod
  public Float getAvgClientTxnLatency() {
    return avgClientTxnLatency;
  }

  /**
   * This is the setter method to the attribute.
   * Average client transaction latency computed by adding response latencies across all http requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgClientTxnLatency set the avgClientTxnLatency.
   */
  @VsoMethod
  public void setAvgClientTxnLatency(Float  avgClientTxnLatency) {
    this.avgClientTxnLatency = avgClientTxnLatency;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate of http responses sent per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgCompleteResponses
   */
  @VsoMethod
  public Float getAvgCompleteResponses() {
    return avgCompleteResponses;
  }

  /**
   * This is the setter method to the attribute.
   * Rate of http responses sent per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgCompleteResponses set the avgCompleteResponses.
   */
  @VsoMethod
  public void setAvgCompleteResponses(Float  avgCompleteResponses) {
    this.avgCompleteResponses = avgCompleteResponses;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average client connection latency reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgConnectionTime
   */
  @VsoMethod
  public Float getAvgConnectionTime() {
    return avgConnectionTime;
  }

  /**
   * This is the setter method to the attribute.
   * Average client connection latency reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgConnectionTime set the avgConnectionTime.
   */
  @VsoMethod
  public void setAvgConnectionTime(Float  avgConnectionTime) {
    this.avgConnectionTime = avgConnectionTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average domain lookup latency reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDnsLookupTime
   */
  @VsoMethod
  public Float getAvgDnsLookupTime() {
    return avgDnsLookupTime;
  }

  /**
   * This is the setter method to the attribute.
   * Average domain lookup latency reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDnsLookupTime set the avgDnsLookupTime.
   */
  @VsoMethod
  public void setAvgDnsLookupTime(Float  avgDnsLookupTime) {
    this.avgDnsLookupTime = avgDnsLookupTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average dom content load time reported by clients.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgDomContentLoadTime
   */
  @VsoMethod
  public Float getAvgDomContentLoadTime() {
    return avgDomContentLoadTime;
  }

  /**
   * This is the setter method to the attribute.
   * Average dom content load time reported by clients.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgDomContentLoadTime set the avgDomContentLoadTime.
   */
  @VsoMethod
  public void setAvgDomContentLoadTime(Float  avgDomContentLoadTime) {
    this.avgDomContentLoadTime = avgDomContentLoadTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate of http error responses sent per second.
   * It does not include errors excluded in analytics profile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgErrorResponses
   */
  @VsoMethod
  public Float getAvgErrorResponses() {
    return avgErrorResponses;
  }

  /**
   * This is the setter method to the attribute.
   * Rate of http error responses sent per second.
   * It does not include errors excluded in analytics profile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgErrorResponses set the avgErrorResponses.
   */
  @VsoMethod
  public void setAvgErrorResponses(Float  avgErrorResponses) {
    this.avgErrorResponses = avgErrorResponses;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate of http responses excluded as errors based on analytics profile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgErrorsExcluded
   */
  @VsoMethod
  public Float getAvgErrorsExcluded() {
    return avgErrorsExcluded;
  }

  /**
   * This is the setter method to the attribute.
   * Rate of http responses excluded as errors based on analytics profile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgErrorsExcluded set the avgErrorsExcluded.
   */
  @VsoMethod
  public void setAvgErrorsExcluded(Float  avgErrorsExcluded) {
    this.avgErrorsExcluded = avgErrorsExcluded;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Avg number of http requests that completed within frustrated latency.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgFrustratedResponses
   */
  @VsoMethod
  public Float getAvgFrustratedResponses() {
    return avgFrustratedResponses;
  }

  /**
   * This is the setter method to the attribute.
   * Avg number of http requests that completed within frustrated latency.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgFrustratedResponses set the avgFrustratedResponses.
   */
  @VsoMethod
  public void setAvgFrustratedResponses(Float  avgFrustratedResponses) {
    this.avgFrustratedResponses = avgFrustratedResponses;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average size of http headers per request.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgHttpHeadersBytes
   */
  @VsoMethod
  public Float getAvgHttpHeadersBytes() {
    return avgHttpHeadersBytes;
  }

  /**
   * This is the setter method to the attribute.
   * Average size of http headers per request.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgHttpHeadersBytes set the avgHttpHeadersBytes.
   */
  @VsoMethod
  public void setAvgHttpHeadersBytes(Float  avgHttpHeadersBytes) {
    this.avgHttpHeadersBytes = avgHttpHeadersBytes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of http headers per request.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgHttpHeadersCount
   */
  @VsoMethod
  public Float getAvgHttpHeadersCount() {
    return avgHttpHeadersCount;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of http headers per request.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgHttpHeadersCount set the avgHttpHeadersCount.
   */
  @VsoMethod
  public void setAvgHttpHeadersCount(Float  avgHttpHeadersCount) {
    this.avgHttpHeadersCount = avgHttpHeadersCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of http request parameters per request.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgHttpParamsCount
   */
  @VsoMethod
  public Float getAvgHttpParamsCount() {
    return avgHttpParamsCount;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of http request parameters per request.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgHttpParamsCount set the avgHttpParamsCount.
   */
  @VsoMethod
  public void setAvgHttpParamsCount(Float  avgHttpParamsCount) {
    this.avgHttpParamsCount = avgHttpParamsCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average page load time reported by clients.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgPageDownloadTime
   */
  @VsoMethod
  public Float getAvgPageDownloadTime() {
    return avgPageDownloadTime;
  }

  /**
   * This is the setter method to the attribute.
   * Average page load time reported by clients.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgPageDownloadTime set the avgPageDownloadTime.
   */
  @VsoMethod
  public void setAvgPageDownloadTime(Float  avgPageDownloadTime) {
    this.avgPageDownloadTime = avgPageDownloadTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average page load time reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgPageLoadTime
   */
  @VsoMethod
  public Float getAvgPageLoadTime() {
    return avgPageLoadTime;
  }

  /**
   * This is the setter method to the attribute.
   * Average page load time reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgPageLoadTime set the avgPageLoadTime.
   */
  @VsoMethod
  public void setAvgPageLoadTime(Float  avgPageLoadTime) {
    this.avgPageLoadTime = avgPageLoadTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of http request parameters per request, taking into account only requests with parameters.
   * Field introduced in 17.2.12, 18.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgParamsPerReq
   */
  @VsoMethod
  public Float getAvgParamsPerReq() {
    return avgParamsPerReq;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of http request parameters per request, taking into account only requests with parameters.
   * Field introduced in 17.2.12, 18.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgParamsPerReq set the avgParamsPerReq.
   */
  @VsoMethod
  public void setAvgParamsPerReq(Float  avgParamsPerReq) {
    this.avgParamsPerReq = avgParamsPerReq;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average size of http post request.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgPostBytes
   */
  @VsoMethod
  public Float getAvgPostBytes() {
    return avgPostBytes;
  }

  /**
   * This is the setter method to the attribute.
   * Average size of http post request.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgPostBytes set the avgPostBytes.
   */
  @VsoMethod
  public void setAvgPostBytes(Float  avgPostBytes) {
    this.avgPostBytes = avgPostBytes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average post compression bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgPostCompressionBytes
   */
  @VsoMethod
  public Float getAvgPostCompressionBytes() {
    return avgPostCompressionBytes;
  }

  /**
   * This is the setter method to the attribute.
   * Average post compression bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgPostCompressionBytes set the avgPostCompressionBytes.
   */
  @VsoMethod
  public void setAvgPostCompressionBytes(Float  avgPostCompressionBytes) {
    this.avgPostCompressionBytes = avgPostCompressionBytes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average pre compression bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgPreCompressionBytes
   */
  @VsoMethod
  public Float getAvgPreCompressionBytes() {
    return avgPreCompressionBytes;
  }

  /**
   * This is the setter method to the attribute.
   * Average pre compression bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgPreCompressionBytes set the avgPreCompressionBytes.
   */
  @VsoMethod
  public void setAvgPreCompressionBytes(Float  avgPreCompressionBytes) {
    this.avgPreCompressionBytes = avgPreCompressionBytes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average redirect latency reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgRedirectionTime
   */
  @VsoMethod
  public Float getAvgRedirectionTime() {
    return avgRedirectionTime;
  }

  /**
   * This is the setter method to the attribute.
   * Average redirect latency reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgRedirectionTime set the avgRedirectionTime.
   */
  @VsoMethod
  public void setAvgRedirectionTime(Float  avgRedirectionTime) {
    this.avgRedirectionTime = avgRedirectionTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average requests per session measured for closed sessions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgReqsPerSession
   */
  @VsoMethod
  public Float getAvgReqsPerSession() {
    return avgReqsPerSession;
  }

  /**
   * This is the setter method to the attribute.
   * Average requests per session measured for closed sessions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgReqsPerSession set the avgReqsPerSession.
   */
  @VsoMethod
  public void setAvgReqsPerSession(Float  avgReqsPerSession) {
    this.avgReqsPerSession = avgReqsPerSession;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate of 1xx http responses sent per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgResp1Xx
   */
  @VsoMethod
  public Float getAvgResp1Xx() {
    return avgResp1Xx;
  }

  /**
   * This is the setter method to the attribute.
   * Rate of 1xx http responses sent per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgResp1Xx set the avgResp1Xx.
   */
  @VsoMethod
  public void setAvgResp1Xx(Float  avgResp1Xx) {
    this.avgResp1Xx = avgResp1Xx;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate of 2xx http responses sent per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgResp2Xx
   */
  @VsoMethod
  public Float getAvgResp2Xx() {
    return avgResp2Xx;
  }

  /**
   * This is the setter method to the attribute.
   * Rate of 2xx http responses sent per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgResp2Xx set the avgResp2Xx.
   */
  @VsoMethod
  public void setAvgResp2Xx(Float  avgResp2Xx) {
    this.avgResp2Xx = avgResp2Xx;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate of 3xx http responses sent per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgResp3Xx
   */
  @VsoMethod
  public Float getAvgResp3Xx() {
    return avgResp3Xx;
  }

  /**
   * This is the setter method to the attribute.
   * Rate of 3xx http responses sent per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgResp3Xx set the avgResp3Xx.
   */
  @VsoMethod
  public void setAvgResp3Xx(Float  avgResp3Xx) {
    this.avgResp3Xx = avgResp3Xx;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate of 4xx http responses sent per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgResp4Xx
   */
  @VsoMethod
  public Float getAvgResp4Xx() {
    return avgResp4Xx;
  }

  /**
   * This is the setter method to the attribute.
   * Rate of 4xx http responses sent per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgResp4Xx set the avgResp4Xx.
   */
  @VsoMethod
  public void setAvgResp4Xx(Float  avgResp4Xx) {
    this.avgResp4Xx = avgResp4Xx;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate of 4xx http responses as errors sent by avi.
   * It does not include any error codes excluded in the analytics profile and pool server errors.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgResp4XxAviErrors
   */
  @VsoMethod
  public Float getAvgResp4XxAviErrors() {
    return avgResp4XxAviErrors;
  }

  /**
   * This is the setter method to the attribute.
   * Rate of 4xx http responses as errors sent by avi.
   * It does not include any error codes excluded in the analytics profile and pool server errors.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgResp4XxAviErrors set the avgResp4XxAviErrors.
   */
  @VsoMethod
  public void setAvgResp4XxAviErrors(Float  avgResp4XxAviErrors) {
    this.avgResp4XxAviErrors = avgResp4XxAviErrors;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate of 5xx http responses sent per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgResp5Xx
   */
  @VsoMethod
  public Float getAvgResp5Xx() {
    return avgResp5Xx;
  }

  /**
   * This is the setter method to the attribute.
   * Rate of 5xx http responses sent per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgResp5Xx set the avgResp5Xx.
   */
  @VsoMethod
  public void setAvgResp5Xx(Float  avgResp5Xx) {
    this.avgResp5Xx = avgResp5Xx;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate of 5xx http responses as errors sent by avi.
   * It does not include any error codes excluded in the analytics profile and pool server errors.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgResp5XxAviErrors
   */
  @VsoMethod
  public Float getAvgResp5XxAviErrors() {
    return avgResp5XxAviErrors;
  }

  /**
   * This is the setter method to the attribute.
   * Rate of 5xx http responses as errors sent by avi.
   * It does not include any error codes excluded in the analytics profile and pool server errors.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgResp5XxAviErrors set the avgResp5XxAviErrors.
   */
  @VsoMethod
  public void setAvgResp5XxAviErrors(Float  avgResp5XxAviErrors) {
    this.avgResp5XxAviErrors = avgResp5XxAviErrors;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total client data transfer time by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgRumClientDataTransferTime
   */
  @VsoMethod
  public Float getAvgRumClientDataTransferTime() {
    return avgRumClientDataTransferTime;
  }

  /**
   * This is the setter method to the attribute.
   * Total client data transfer time by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgRumClientDataTransferTime set the avgRumClientDataTransferTime.
   */
  @VsoMethod
  public void setAvgRumClientDataTransferTime(Float  avgRumClientDataTransferTime) {
    this.avgRumClientDataTransferTime = avgRumClientDataTransferTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Avg number of http requests that completed within satisfactory latency.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSatisfactoryResponses
   */
  @VsoMethod
  public Float getAvgSatisfactoryResponses() {
    return avgSatisfactoryResponses;
  }

  /**
   * This is the setter method to the attribute.
   * Avg number of http requests that completed within satisfactory latency.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSatisfactoryResponses set the avgSatisfactoryResponses.
   */
  @VsoMethod
  public void setAvgSatisfactoryResponses(Float  avgSatisfactoryResponses) {
    this.avgSatisfactoryResponses = avgSatisfactoryResponses;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average server round trip time.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgServerRtt
   */
  @VsoMethod
  public Float getAvgServerRtt() {
    return avgServerRtt;
  }

  /**
   * This is the setter method to the attribute.
   * Average server round trip time.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgServerRtt set the avgServerRtt.
   */
  @VsoMethod
  public void setAvgServerRtt(Float  avgServerRtt) {
    this.avgServerRtt = avgServerRtt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average latency from receipt of request to start of response.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgServiceTime
   */
  @VsoMethod
  public Float getAvgServiceTime() {
    return avgServiceTime;
  }

  /**
   * This is the setter method to the attribute.
   * Average latency from receipt of request to start of response.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgServiceTime set the avgServiceTime.
   */
  @VsoMethod
  public void setAvgServiceTime(Float  avgServiceTime) {
    this.avgServiceTime = avgServiceTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl sessions using dsa certificate.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslAuthDsa
   */
  @VsoMethod
  public Float getAvgSslAuthDsa() {
    return avgSslAuthDsa;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl sessions using dsa certificate.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslAuthDsa set the avgSslAuthDsa.
   */
  @VsoMethod
  public void setAvgSslAuthDsa(Float  avgSslAuthDsa) {
    this.avgSslAuthDsa = avgSslAuthDsa;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl sessions using elliptic curve dsa (ecdsa) certificates.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslAuthEcdsa
   */
  @VsoMethod
  public Float getAvgSslAuthEcdsa() {
    return avgSslAuthEcdsa;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl sessions using elliptic curve dsa (ecdsa) certificates.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslAuthEcdsa set the avgSslAuthEcdsa.
   */
  @VsoMethod
  public void setAvgSslAuthEcdsa(Float  avgSslAuthEcdsa) {
    this.avgSslAuthEcdsa = avgSslAuthEcdsa;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl sessions using rsa certificate.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslAuthRsa
   */
  @VsoMethod
  public Float getAvgSslAuthRsa() {
    return avgSslAuthRsa;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl sessions using rsa certificate.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslAuthRsa set the avgSslAuthRsa.
   */
  @VsoMethod
  public void setAvgSslAuthRsa(Float  avgSslAuthRsa) {
    this.avgSslAuthRsa = avgSslAuthRsa;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl sessions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslConnections
   */
  @VsoMethod
  public Float getAvgSslConnections() {
    return avgSslConnections;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl sessions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslConnections set the avgSslConnections.
   */
  @VsoMethod
  public void setAvgSslConnections(Float  avgSslConnections) {
    this.avgSslConnections = avgSslConnections;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl exchanges using ec cerificates without pfs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslEcdsaNonPfs
   */
  @VsoMethod
  public Float getAvgSslEcdsaNonPfs() {
    return avgSslEcdsaNonPfs;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl exchanges using ec cerificates without pfs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslEcdsaNonPfs set the avgSslEcdsaNonPfs.
   */
  @VsoMethod
  public void setAvgSslEcdsaNonPfs(Float  avgSslEcdsaNonPfs) {
    this.avgSslEcdsaNonPfs = avgSslEcdsaNonPfs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl exchanges using ec cerificates and pfs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslEcdsaPfs
   */
  @VsoMethod
  public Float getAvgSslEcdsaPfs() {
    return avgSslEcdsaPfs;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl exchanges using ec cerificates and pfs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslEcdsaPfs set the avgSslEcdsaPfs.
   */
  @VsoMethod
  public void setAvgSslEcdsaPfs(Float  avgSslEcdsaPfs) {
    this.avgSslEcdsaPfs = avgSslEcdsaPfs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl errors due to clients, protocol errors,network errors and handshake timeouts.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslErrors
   */
  @VsoMethod
  public Float getAvgSslErrors() {
    return avgSslErrors;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl errors due to clients, protocol errors,network errors and handshake timeouts.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslErrors set the avgSslErrors.
   */
  @VsoMethod
  public void setAvgSslErrors(Float  avgSslErrors) {
    this.avgSslErrors = avgSslErrors;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl connections failed due to protocol , network or timeout reasons.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslFailedConnections
   */
  @VsoMethod
  public Float getAvgSslFailedConnections() {
    return avgSslFailedConnections;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl connections failed due to protocol , network or timeout reasons.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslFailedConnections set the avgSslFailedConnections.
   */
  @VsoMethod
  public void setAvgSslFailedConnections(Float  avgSslFailedConnections) {
    this.avgSslFailedConnections = avgSslFailedConnections;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl handshakes failed due to network errors.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslHandshakeNetworkErrors
   */
  @VsoMethod
  public Float getAvgSslHandshakeNetworkErrors() {
    return avgSslHandshakeNetworkErrors;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl handshakes failed due to network errors.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslHandshakeNetworkErrors set the avgSslHandshakeNetworkErrors.
   */
  @VsoMethod
  public void setAvgSslHandshakeNetworkErrors(Float  avgSslHandshakeNetworkErrors) {
    this.avgSslHandshakeNetworkErrors = avgSslHandshakeNetworkErrors;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl handshake failed due to clients or protocol errors.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslHandshakeProtocolErrors
   */
  @VsoMethod
  public Float getAvgSslHandshakeProtocolErrors() {
    return avgSslHandshakeProtocolErrors;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl handshake failed due to clients or protocol errors.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslHandshakeProtocolErrors set the avgSslHandshakeProtocolErrors.
   */
  @VsoMethod
  public void setAvgSslHandshakeProtocolErrors(Float  avgSslHandshakeProtocolErrors) {
    this.avgSslHandshakeProtocolErrors = avgSslHandshakeProtocolErrors;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average new successful ssl sessions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslHandshakesNew
   */
  @VsoMethod
  public Float getAvgSslHandshakesNew() {
    return avgSslHandshakesNew;
  }

  /**
   * This is the setter method to the attribute.
   * Average new successful ssl sessions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslHandshakesNew set the avgSslHandshakesNew.
   */
  @VsoMethod
  public void setAvgSslHandshakesNew(Float  avgSslHandshakesNew) {
    this.avgSslHandshakesNew = avgSslHandshakesNew;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl exchanges using non-pfs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslHandshakesNonPfs
   */
  @VsoMethod
  public Float getAvgSslHandshakesNonPfs() {
    return avgSslHandshakesNonPfs;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl exchanges using non-pfs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslHandshakesNonPfs set the avgSslHandshakesNonPfs.
   */
  @VsoMethod
  public void setAvgSslHandshakesNonPfs(Float  avgSslHandshakesNonPfs) {
    this.avgSslHandshakesNonPfs = avgSslHandshakesNonPfs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl exchanges using pfs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslHandshakesPfs
   */
  @VsoMethod
  public Float getAvgSslHandshakesPfs() {
    return avgSslHandshakesPfs;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl exchanges using pfs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslHandshakesPfs set the avgSslHandshakesPfs.
   */
  @VsoMethod
  public void setAvgSslHandshakesPfs(Float  avgSslHandshakesPfs) {
    this.avgSslHandshakesPfs = avgSslHandshakesPfs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average new successful resumed ssl sessions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslHandshakesReused
   */
  @VsoMethod
  public Float getAvgSslHandshakesReused() {
    return avgSslHandshakesReused;
  }

  /**
   * This is the setter method to the attribute.
   * Average new successful resumed ssl sessions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslHandshakesReused set the avgSslHandshakesReused.
   */
  @VsoMethod
  public void setAvgSslHandshakesReused(Float  avgSslHandshakesReused) {
    this.avgSslHandshakesReused = avgSslHandshakesReused;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl handshakes timed out.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslHandshakesTimedout
   */
  @VsoMethod
  public Float getAvgSslHandshakesTimedout() {
    return avgSslHandshakesTimedout;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl handshakes timed out.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslHandshakesTimedout set the avgSslHandshakesTimedout.
   */
  @VsoMethod
  public void setAvgSslHandshakesTimedout(Float  avgSslHandshakesTimedout) {
    this.avgSslHandshakesTimedout = avgSslHandshakesTimedout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl exchanges using diffie-hellman.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslKxDh
   */
  @VsoMethod
  public Float getAvgSslKxDh() {
    return avgSslKxDh;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl exchanges using diffie-hellman.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslKxDh set the avgSslKxDh.
   */
  @VsoMethod
  public void setAvgSslKxDh(Float  avgSslKxDh) {
    this.avgSslKxDh = avgSslKxDh;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl exchanges using rsa.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslKxEcdh
   */
  @VsoMethod
  public Float getAvgSslKxEcdh() {
    return avgSslKxEcdh;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl exchanges using rsa.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslKxEcdh set the avgSslKxEcdh.
   */
  @VsoMethod
  public void setAvgSslKxEcdh(Float  avgSslKxEcdh) {
    this.avgSslKxEcdh = avgSslKxEcdh;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl exchanges using rsa.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslKxRsa
   */
  @VsoMethod
  public Float getAvgSslKxRsa() {
    return avgSslKxRsa;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl exchanges using rsa.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslKxRsa set the avgSslKxRsa.
   */
  @VsoMethod
  public void setAvgSslKxRsa(Float  avgSslKxRsa) {
    this.avgSslKxRsa = avgSslKxRsa;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl exchanges using rsa cerificates without pfs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslRsaNonPfs
   */
  @VsoMethod
  public Float getAvgSslRsaNonPfs() {
    return avgSslRsaNonPfs;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl exchanges using rsa cerificates without pfs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslRsaNonPfs set the avgSslRsaNonPfs.
   */
  @VsoMethod
  public void setAvgSslRsaNonPfs(Float  avgSslRsaNonPfs) {
    this.avgSslRsaNonPfs = avgSslRsaNonPfs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl exchanges using rsa cerificates and pfs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslRsaPfs
   */
  @VsoMethod
  public Float getAvgSslRsaPfs() {
    return avgSslRsaPfs;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl exchanges using rsa cerificates and pfs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslRsaPfs set the avgSslRsaPfs.
   */
  @VsoMethod
  public void setAvgSslRsaPfs(Float  avgSslRsaPfs) {
    this.avgSslRsaPfs = avgSslRsaPfs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl sessions with version 3.0.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslVerSsl30
   */
  @VsoMethod
  public Float getAvgSslVerSsl30() {
    return avgSslVerSsl30;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl sessions with version 3.0.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslVerSsl30 set the avgSslVerSsl30.
   */
  @VsoMethod
  public void setAvgSslVerSsl30(Float  avgSslVerSsl30) {
    this.avgSslVerSsl30 = avgSslVerSsl30;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl sessions with tls version 1.0.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslVerTls10
   */
  @VsoMethod
  public Float getAvgSslVerTls10() {
    return avgSslVerTls10;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl sessions with tls version 1.0.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslVerTls10 set the avgSslVerTls10.
   */
  @VsoMethod
  public void setAvgSslVerTls10(Float  avgSslVerTls10) {
    this.avgSslVerTls10 = avgSslVerTls10;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl sessions with tls version 1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslVerTls11
   */
  @VsoMethod
  public Float getAvgSslVerTls11() {
    return avgSslVerTls11;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl sessions with tls version 1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslVerTls11 set the avgSslVerTls11.
   */
  @VsoMethod
  public void setAvgSslVerTls11(Float  avgSslVerTls11) {
    this.avgSslVerTls11 = avgSslVerTls11;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl sessions with tls version 1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslVerTls12
   */
  @VsoMethod
  public Float getAvgSslVerTls12() {
    return avgSslVerTls12;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl sessions with tls version 1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslVerTls12 set the avgSslVerTls12.
   */
  @VsoMethod
  public void setAvgSslVerTls12(Float  avgSslVerTls12) {
    this.avgSslVerTls12 = avgSslVerTls12;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average ssl sessions with tls version 1.3.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgSslVerTls13
   */
  @VsoMethod
  public Float getAvgSslVerTls13() {
    return avgSslVerTls13;
  }

  /**
   * This is the setter method to the attribute.
   * Average ssl sessions with tls version 1.3.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgSslVerTls13 set the avgSslVerTls13.
   */
  @VsoMethod
  public void setAvgSslVerTls13(Float  avgSslVerTls13) {
    this.avgSslVerTls13 = avgSslVerTls13;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Avg number of http requests that completed within tolerated latency.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgToleratedResponses
   */
  @VsoMethod
  public Float getAvgToleratedResponses() {
    return avgToleratedResponses;
  }

  /**
   * This is the setter method to the attribute.
   * Avg number of http requests that completed within tolerated latency.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgToleratedResponses set the avgToleratedResponses.
   */
  @VsoMethod
  public void setAvgToleratedResponses(Float  avgToleratedResponses) {
    this.avgToleratedResponses = avgToleratedResponses;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of client http2 requests received by the virtual service per second.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgTotalHttp2Requests
   */
  @VsoMethod
  public Float getAvgTotalHttp2Requests() {
    return avgTotalHttp2Requests;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of client http2 requests received by the virtual service per second.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgTotalHttp2Requests set the avgTotalHttp2Requests.
   */
  @VsoMethod
  public void setAvgTotalHttp2Requests(Float  avgTotalHttp2Requests) {
    this.avgTotalHttp2Requests = avgTotalHttp2Requests;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average rate of client http requests received by the virtual service per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgTotalRequests
   */
  @VsoMethod
  public Float getAvgTotalRequests() {
    return avgTotalRequests;
  }

  /**
   * This is the setter method to the attribute.
   * Average rate of client http requests received by the virtual service per second.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgTotalRequests set the avgTotalRequests.
   */
  @VsoMethod
  public void setAvgTotalRequests(Float  avgTotalRequests) {
    this.avgTotalRequests = avgTotalRequests;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average length of http uri per request.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgUriLength
   */
  @VsoMethod
  public Float getAvgUriLength() {
    return avgUriLength;
  }

  /**
   * This is the setter method to the attribute.
   * Average length of http uri per request.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgUriLength set the avgUriLength.
   */
  @VsoMethod
  public void setAvgUriLength(Float  avgUriLength) {
    this.avgUriLength = avgUriLength;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of transactions per second identified by waf as attacks.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafAttacks
   */
  @VsoMethod
  public Float getAvgWafAttacks() {
    return avgWafAttacks;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of transactions per second identified by waf as attacks.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafAttacks set the avgWafAttacks.
   */
  @VsoMethod
  public void setAvgWafAttacks(Float  avgWafAttacks) {
    this.avgWafAttacks = avgWafAttacks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of transactions per second bypassing waf.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafDisabled
   */
  @VsoMethod
  public Float getAvgWafDisabled() {
    return avgWafDisabled;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of transactions per second bypassing waf.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafDisabled set the avgWafDisabled.
   */
  @VsoMethod
  public void setAvgWafDisabled(Float  avgWafDisabled) {
    this.avgWafDisabled = avgWafDisabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of transactions per second evaluated by waf.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafEvaluated
   */
  @VsoMethod
  public Float getAvgWafEvaluated() {
    return avgWafEvaluated;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of transactions per second evaluated by waf.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafEvaluated set the avgWafEvaluated.
   */
  @VsoMethod
  public void setAvgWafEvaluated(Float  avgWafEvaluated) {
    this.avgWafEvaluated = avgWafEvaluated;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of requests per second evaluated by waf in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafEvaluatedRequestBodyPhase
   */
  @VsoMethod
  public Float getAvgWafEvaluatedRequestBodyPhase() {
    return avgWafEvaluatedRequestBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of requests per second evaluated by waf in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafEvaluatedRequestBodyPhase set the avgWafEvaluatedRequestBodyPhase.
   */
  @VsoMethod
  public void setAvgWafEvaluatedRequestBodyPhase(Float  avgWafEvaluatedRequestBodyPhase) {
    this.avgWafEvaluatedRequestBodyPhase = avgWafEvaluatedRequestBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of requests per second evaluated by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafEvaluatedRequestHeaderPhase
   */
  @VsoMethod
  public Float getAvgWafEvaluatedRequestHeaderPhase() {
    return avgWafEvaluatedRequestHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of requests per second evaluated by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafEvaluatedRequestHeaderPhase set the avgWafEvaluatedRequestHeaderPhase.
   */
  @VsoMethod
  public void setAvgWafEvaluatedRequestHeaderPhase(Float  avgWafEvaluatedRequestHeaderPhase) {
    this.avgWafEvaluatedRequestHeaderPhase = avgWafEvaluatedRequestHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of responses per second evaluated by waf in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafEvaluatedResponseBodyPhase
   */
  @VsoMethod
  public Float getAvgWafEvaluatedResponseBodyPhase() {
    return avgWafEvaluatedResponseBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of responses per second evaluated by waf in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafEvaluatedResponseBodyPhase set the avgWafEvaluatedResponseBodyPhase.
   */
  @VsoMethod
  public void setAvgWafEvaluatedResponseBodyPhase(Float  avgWafEvaluatedResponseBodyPhase) {
    this.avgWafEvaluatedResponseBodyPhase = avgWafEvaluatedResponseBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of responsess per second evaluated by waf in response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafEvaluatedResponseHeaderPhase
   */
  @VsoMethod
  public Float getAvgWafEvaluatedResponseHeaderPhase() {
    return avgWafEvaluatedResponseHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of responsess per second evaluated by waf in response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafEvaluatedResponseHeaderPhase set the avgWafEvaluatedResponseHeaderPhase.
   */
  @VsoMethod
  public void setAvgWafEvaluatedResponseHeaderPhase(Float  avgWafEvaluatedResponseHeaderPhase) {
    this.avgWafEvaluatedResponseHeaderPhase = avgWafEvaluatedResponseHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of transactions per second flagged by waf.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafFlagged
   */
  @VsoMethod
  public Float getAvgWafFlagged() {
    return avgWafFlagged;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of transactions per second flagged by waf.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafFlagged set the avgWafFlagged.
   */
  @VsoMethod
  public void setAvgWafFlagged(Float  avgWafFlagged) {
    this.avgWafFlagged = avgWafFlagged;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of requests per second flagged (but not rejected) by waf in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafFlaggedRequestBodyPhase
   */
  @VsoMethod
  public Float getAvgWafFlaggedRequestBodyPhase() {
    return avgWafFlaggedRequestBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of requests per second flagged (but not rejected) by waf in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafFlaggedRequestBodyPhase set the avgWafFlaggedRequestBodyPhase.
   */
  @VsoMethod
  public void setAvgWafFlaggedRequestBodyPhase(Float  avgWafFlaggedRequestBodyPhase) {
    this.avgWafFlaggedRequestBodyPhase = avgWafFlaggedRequestBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of requests per second flagged (but not rejected) by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafFlaggedRequestHeaderPhase
   */
  @VsoMethod
  public Float getAvgWafFlaggedRequestHeaderPhase() {
    return avgWafFlaggedRequestHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of requests per second flagged (but not rejected) by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafFlaggedRequestHeaderPhase set the avgWafFlaggedRequestHeaderPhase.
   */
  @VsoMethod
  public void setAvgWafFlaggedRequestHeaderPhase(Float  avgWafFlaggedRequestHeaderPhase) {
    this.avgWafFlaggedRequestHeaderPhase = avgWafFlaggedRequestHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of responses per second flagged (but not rejected) by waf in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafFlaggedResponseBodyPhase
   */
  @VsoMethod
  public Float getAvgWafFlaggedResponseBodyPhase() {
    return avgWafFlaggedResponseBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of responses per second flagged (but not rejected) by waf in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafFlaggedResponseBodyPhase set the avgWafFlaggedResponseBodyPhase.
   */
  @VsoMethod
  public void setAvgWafFlaggedResponseBodyPhase(Float  avgWafFlaggedResponseBodyPhase) {
    this.avgWafFlaggedResponseBodyPhase = avgWafFlaggedResponseBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of responses per second flagged (but not rejected) by waf in response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafFlaggedResponseHeaderPhase
   */
  @VsoMethod
  public Float getAvgWafFlaggedResponseHeaderPhase() {
    return avgWafFlaggedResponseHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of responses per second flagged (but not rejected) by waf in response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafFlaggedResponseHeaderPhase set the avgWafFlaggedResponseHeaderPhase.
   */
  @VsoMethod
  public void setAvgWafFlaggedResponseHeaderPhase(Float  avgWafFlaggedResponseHeaderPhase) {
    this.avgWafFlaggedResponseHeaderPhase = avgWafFlaggedResponseHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average waf latency seen due to waf request body processing.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafLatencyRequestBodyPhase
   */
  @VsoMethod
  public Float getAvgWafLatencyRequestBodyPhase() {
    return avgWafLatencyRequestBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average waf latency seen due to waf request body processing.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafLatencyRequestBodyPhase set the avgWafLatencyRequestBodyPhase.
   */
  @VsoMethod
  public void setAvgWafLatencyRequestBodyPhase(Float  avgWafLatencyRequestBodyPhase) {
    this.avgWafLatencyRequestBodyPhase = avgWafLatencyRequestBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average waf latency seen due to waf request header processing.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafLatencyRequestHeaderPhase
   */
  @VsoMethod
  public Float getAvgWafLatencyRequestHeaderPhase() {
    return avgWafLatencyRequestHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average waf latency seen due to waf request header processing.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafLatencyRequestHeaderPhase set the avgWafLatencyRequestHeaderPhase.
   */
  @VsoMethod
  public void setAvgWafLatencyRequestHeaderPhase(Float  avgWafLatencyRequestHeaderPhase) {
    this.avgWafLatencyRequestHeaderPhase = avgWafLatencyRequestHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average waf latency seen due to waf response body processing.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafLatencyResponseBodyPhase
   */
  @VsoMethod
  public Float getAvgWafLatencyResponseBodyPhase() {
    return avgWafLatencyResponseBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average waf latency seen due to waf response body processing.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafLatencyResponseBodyPhase set the avgWafLatencyResponseBodyPhase.
   */
  @VsoMethod
  public void setAvgWafLatencyResponseBodyPhase(Float  avgWafLatencyResponseBodyPhase) {
    this.avgWafLatencyResponseBodyPhase = avgWafLatencyResponseBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average waf latency seen due to waf response header processing.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafLatencyResponseHeaderPhase
   */
  @VsoMethod
  public Float getAvgWafLatencyResponseHeaderPhase() {
    return avgWafLatencyResponseHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average waf latency seen due to waf response header processing.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafLatencyResponseHeaderPhase set the avgWafLatencyResponseHeaderPhase.
   */
  @VsoMethod
  public void setAvgWafLatencyResponseHeaderPhase(Float  avgWafLatencyResponseHeaderPhase) {
    this.avgWafLatencyResponseHeaderPhase = avgWafLatencyResponseHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of transactions per second matched by waf rule/rules.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafMatched
   */
  @VsoMethod
  public Float getAvgWafMatched() {
    return avgWafMatched;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of transactions per second matched by waf rule/rules.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafMatched set the avgWafMatched.
   */
  @VsoMethod
  public void setAvgWafMatched(Float  avgWafMatched) {
    this.avgWafMatched = avgWafMatched;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of requests per second matched by waf in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafMatchedRequestBodyPhase
   */
  @VsoMethod
  public Float getAvgWafMatchedRequestBodyPhase() {
    return avgWafMatchedRequestBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of requests per second matched by waf in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafMatchedRequestBodyPhase set the avgWafMatchedRequestBodyPhase.
   */
  @VsoMethod
  public void setAvgWafMatchedRequestBodyPhase(Float  avgWafMatchedRequestBodyPhase) {
    this.avgWafMatchedRequestBodyPhase = avgWafMatchedRequestBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of requests per second matched by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafMatchedRequestHeaderPhase
   */
  @VsoMethod
  public Float getAvgWafMatchedRequestHeaderPhase() {
    return avgWafMatchedRequestHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of requests per second matched by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafMatchedRequestHeaderPhase set the avgWafMatchedRequestHeaderPhase.
   */
  @VsoMethod
  public void setAvgWafMatchedRequestHeaderPhase(Float  avgWafMatchedRequestHeaderPhase) {
    this.avgWafMatchedRequestHeaderPhase = avgWafMatchedRequestHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of responses per second matched by waf in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafMatchedResponseBodyPhase
   */
  @VsoMethod
  public Float getAvgWafMatchedResponseBodyPhase() {
    return avgWafMatchedResponseBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of responses per second matched by waf in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafMatchedResponseBodyPhase set the avgWafMatchedResponseBodyPhase.
   */
  @VsoMethod
  public void setAvgWafMatchedResponseBodyPhase(Float  avgWafMatchedResponseBodyPhase) {
    this.avgWafMatchedResponseBodyPhase = avgWafMatchedResponseBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of responses per second matched by waf in response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafMatchedResponseHeaderPhase
   */
  @VsoMethod
  public Float getAvgWafMatchedResponseHeaderPhase() {
    return avgWafMatchedResponseHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of responses per second matched by waf in response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafMatchedResponseHeaderPhase set the avgWafMatchedResponseHeaderPhase.
   */
  @VsoMethod
  public void setAvgWafMatchedResponseHeaderPhase(Float  avgWafMatchedResponseHeaderPhase) {
    this.avgWafMatchedResponseHeaderPhase = avgWafMatchedResponseHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of transactions per second rejected by waf.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafRejected
   */
  @VsoMethod
  public Float getAvgWafRejected() {
    return avgWafRejected;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of transactions per second rejected by waf.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafRejected set the avgWafRejected.
   */
  @VsoMethod
  public void setAvgWafRejected(Float  avgWafRejected) {
    this.avgWafRejected = avgWafRejected;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of requests per second rejected by waf in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafRejectedRequestBodyPhase
   */
  @VsoMethod
  public Float getAvgWafRejectedRequestBodyPhase() {
    return avgWafRejectedRequestBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of requests per second rejected by waf in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafRejectedRequestBodyPhase set the avgWafRejectedRequestBodyPhase.
   */
  @VsoMethod
  public void setAvgWafRejectedRequestBodyPhase(Float  avgWafRejectedRequestBodyPhase) {
    this.avgWafRejectedRequestBodyPhase = avgWafRejectedRequestBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of requests per second rejected by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafRejectedRequestHeaderPhase
   */
  @VsoMethod
  public Float getAvgWafRejectedRequestHeaderPhase() {
    return avgWafRejectedRequestHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of requests per second rejected by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafRejectedRequestHeaderPhase set the avgWafRejectedRequestHeaderPhase.
   */
  @VsoMethod
  public void setAvgWafRejectedRequestHeaderPhase(Float  avgWafRejectedRequestHeaderPhase) {
    this.avgWafRejectedRequestHeaderPhase = avgWafRejectedRequestHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of responses per second rejected by waf in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafRejectedResponseBodyPhase
   */
  @VsoMethod
  public Float getAvgWafRejectedResponseBodyPhase() {
    return avgWafRejectedResponseBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of responses per second rejected by waf in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafRejectedResponseBodyPhase set the avgWafRejectedResponseBodyPhase.
   */
  @VsoMethod
  public void setAvgWafRejectedResponseBodyPhase(Float  avgWafRejectedResponseBodyPhase) {
    this.avgWafRejectedResponseBodyPhase = avgWafRejectedResponseBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average number of responses per second rejected by waf in response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWafRejectedResponseHeaderPhase
   */
  @VsoMethod
  public Float getAvgWafRejectedResponseHeaderPhase() {
    return avgWafRejectedResponseHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Average number of responses per second rejected by waf in response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWafRejectedResponseHeaderPhase set the avgWafRejectedResponseHeaderPhase.
   */
  @VsoMethod
  public void setAvgWafRejectedResponseHeaderPhase(Float  avgWafRejectedResponseHeaderPhase) {
    this.avgWafRejectedResponseHeaderPhase = avgWafRejectedResponseHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average waiting time reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return avgWaitingTime
   */
  @VsoMethod
  public Float getAvgWaitingTime() {
    return avgWaitingTime;
  }

  /**
   * This is the setter method to the attribute.
   * Average waiting time reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param avgWaitingTime set the avgWaitingTime.
   */
  @VsoMethod
  public void setAvgWaitingTime(Float  avgWaitingTime) {
    this.avgWaitingTime = avgWaitingTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of concurrent http sessions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxConcurrentSessions
   */
  @VsoMethod
  public Float getMaxConcurrentSessions() {
    return maxConcurrentSessions;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of concurrent http sessions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxConcurrentSessions set the maxConcurrentSessions.
   */
  @VsoMethod
  public void setMaxConcurrentSessions(Float  maxConcurrentSessions) {
    this.maxConcurrentSessions = maxConcurrentSessions;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of open ssl sessions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxSslOpenSessions
   */
  @VsoMethod
  public Float getMaxSslOpenSessions() {
    return maxSslOpenSessions;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of open ssl sessions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxSslOpenSessions set the maxSslOpenSessions.
   */
  @VsoMethod
  public void setMaxSslOpenSessions(Float  maxSslOpenSessions) {
    this.maxSslOpenSessions = maxSslOpenSessions;
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
   * Percentage cache hit of requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctCacheHits
   */
  @VsoMethod
  public Float getPctCacheHits() {
    return pctCacheHits;
  }

  /**
   * This is the setter method to the attribute.
   * Percentage cache hit of requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctCacheHits set the pctCacheHits.
   */
  @VsoMethod
  public void setPctCacheHits(Float  pctCacheHits) {
    this.pctCacheHits = pctCacheHits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Percentage cacheable hit of requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctCacheableHits
   */
  @VsoMethod
  public Float getPctCacheableHits() {
    return pctCacheableHits;
  }

  /**
   * This is the setter method to the attribute.
   * Percentage cacheable hit of requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctCacheableHits set the pctCacheableHits.
   */
  @VsoMethod
  public void setPctCacheableHits(Float  pctCacheableHits) {
    this.pctCacheableHits = pctCacheableHits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of http get requests as a percentage of total requests received.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctGetReqs
   */
  @VsoMethod
  public Float getPctGetReqs() {
    return pctGetReqs;
  }

  /**
   * This is the setter method to the attribute.
   * Number of http get requests as a percentage of total requests received.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctGetReqs set the pctGetReqs.
   */
  @VsoMethod
  public void setPctGetReqs(Float  pctGetReqs) {
    this.pctGetReqs = pctGetReqs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of http post requests as a percentage of total requests received.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctPostReqs
   */
  @VsoMethod
  public Float getPctPostReqs() {
    return pctPostReqs;
  }

  /**
   * This is the setter method to the attribute.
   * Number of http post requests as a percentage of total requests received.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctPostReqs set the pctPostReqs.
   */
  @VsoMethod
  public void setPctPostReqs(Float  pctPostReqs) {
    this.pctPostReqs = pctPostReqs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Percent of 4xx and 5xx responses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctResponseErrors
   */
  @VsoMethod
  public Float getPctResponseErrors() {
    return pctResponseErrors;
  }

  /**
   * This is the setter method to the attribute.
   * Percent of 4xx and 5xx responses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctResponseErrors set the pctResponseErrors.
   */
  @VsoMethod
  public void setPctResponseErrors(Float  pctResponseErrors) {
    this.pctResponseErrors = pctResponseErrors;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Percent of ssl connections failured due to protocol , network or timeout reasons.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctSslFailedConnections
   */
  @VsoMethod
  public Float getPctSslFailedConnections() {
    return pctSslFailedConnections;
  }

  /**
   * This is the setter method to the attribute.
   * Percent of ssl connections failured due to protocol , network or timeout reasons.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctSslFailedConnections set the pctSslFailedConnections.
   */
  @VsoMethod
  public void setPctSslFailedConnections(Float  pctSslFailedConnections) {
    this.pctSslFailedConnections = pctSslFailedConnections;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Malicious transactions (attacks) identified by waf as the pecentage  of total requests received.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctWafAttacks
   */
  @VsoMethod
  public Float getPctWafAttacks() {
    return pctWafAttacks;
  }

  /**
   * This is the setter method to the attribute.
   * Malicious transactions (attacks) identified by waf as the pecentage  of total requests received.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctWafAttacks set the pctWafAttacks.
   */
  @VsoMethod
  public void setPctWafAttacks(Float  pctWafAttacks) {
    this.pctWafAttacks = pctWafAttacks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Transactions bypassing waf as the percentage of total requests received.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctWafDisabled
   */
  @VsoMethod
  public Float getPctWafDisabled() {
    return pctWafDisabled;
  }

  /**
   * This is the setter method to the attribute.
   * Transactions bypassing waf as the percentage of total requests received.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctWafDisabled set the pctWafDisabled.
   */
  @VsoMethod
  public void setPctWafDisabled(Float  pctWafDisabled) {
    this.pctWafDisabled = pctWafDisabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf evaluated transactions as the pecentage of total requests received.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctWafEvaluated
   */
  @VsoMethod
  public Float getPctWafEvaluated() {
    return pctWafEvaluated;
  }

  /**
   * This is the setter method to the attribute.
   * Waf evaluated transactions as the pecentage of total requests received.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctWafEvaluated set the pctWafEvaluated.
   */
  @VsoMethod
  public void setPctWafEvaluated(Float  pctWafEvaluated) {
    this.pctWafEvaluated = pctWafEvaluated;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf flagged transactions as the percentage of total waf evaluated transactions.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctWafFlagged
   */
  @VsoMethod
  public Float getPctWafFlagged() {
    return pctWafFlagged;
  }

  /**
   * This is the setter method to the attribute.
   * Waf flagged transactions as the percentage of total waf evaluated transactions.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctWafFlagged set the pctWafFlagged.
   */
  @VsoMethod
  public void setPctWafFlagged(Float  pctWafFlagged) {
    this.pctWafFlagged = pctWafFlagged;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf matched requests as the percentage of total waf evaluated requests.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctWafMatched
   */
  @VsoMethod
  public Float getPctWafMatched() {
    return pctWafMatched;
  }

  /**
   * This is the setter method to the attribute.
   * Waf matched requests as the percentage of total waf evaluated requests.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctWafMatched set the pctWafMatched.
   */
  @VsoMethod
  public void setPctWafMatched(Float  pctWafMatched) {
    this.pctWafMatched = pctWafMatched;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf rejected transactions as the percentage of total waf evaluated transactions.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pctWafRejected
   */
  @VsoMethod
  public Float getPctWafRejected() {
    return pctWafRejected;
  }

  /**
   * This is the setter method to the attribute.
   * Waf rejected transactions as the percentage of total waf evaluated transactions.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pctWafRejected set the pctWafRejected.
   */
  @VsoMethod
  public void setPctWafRejected(Float  pctWafRejected) {
    this.pctWafRejected = pctWafRejected;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Apdex measures quality of server response based on real user metric.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rumApdexr
   */
  @VsoMethod
  public Float getRumApdexr() {
    return rumApdexr;
  }

  /**
   * This is the setter method to the attribute.
   * Apdex measures quality of server response based on real user metric.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rumApdexr set the rumApdexr.
   */
  @VsoMethod
  public void setRumApdexr(Float  rumApdexr) {
    this.rumApdexr = rumApdexr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Protocol strength of ssl ciphers used.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslProtocolStrength
   */
  @VsoMethod
  public Float getSslProtocolStrength() {
    return sslProtocolStrength;
  }

  /**
   * This is the setter method to the attribute.
   * Protocol strength of ssl ciphers used.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sslProtocolStrength set the sslProtocolStrength.
   */
  @VsoMethod
  public void setSslProtocolStrength(Float  sslProtocolStrength) {
    this.sslProtocolStrength = sslProtocolStrength;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total time taken by server to respond to requesti.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumApplicationResponseTime
   */
  @VsoMethod
  public Float getSumApplicationResponseTime() {
    return sumApplicationResponseTime;
  }

  /**
   * This is the setter method to the attribute.
   * Total time taken by server to respond to requesti.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumApplicationResponseTime set the sumApplicationResponseTime.
   */
  @VsoMethod
  public void setSumApplicationResponseTime(Float  sumApplicationResponseTime) {
    this.sumApplicationResponseTime = sumApplicationResponseTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total time client was blocked.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumBlockingTime
   */
  @VsoMethod
  public Float getSumBlockingTime() {
    return sumBlockingTime;
  }

  /**
   * This is the setter method to the attribute.
   * Total time client was blocked.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumBlockingTime set the sumBlockingTime.
   */
  @VsoMethod
  public void setSumBlockingTime(Float  sumBlockingTime) {
    this.sumBlockingTime = sumBlockingTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total browser rendering latency reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumBrowserRenderingTime
   */
  @VsoMethod
  public Float getSumBrowserRenderingTime() {
    return sumBrowserRenderingTime;
  }

  /**
   * This is the setter method to the attribute.
   * Total browser rendering latency reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumBrowserRenderingTime set the sumBrowserRenderingTime.
   */
  @VsoMethod
  public void setSumBrowserRenderingTime(Float  sumBrowserRenderingTime) {
    this.sumBrowserRenderingTime = sumBrowserRenderingTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Average client data transfer time computed by adding response latencies across all http requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumClientDataTransferTime
   */
  @VsoMethod
  public Float getSumClientDataTransferTime() {
    return sumClientDataTransferTime;
  }

  /**
   * This is the setter method to the attribute.
   * Average client data transfer time computed by adding response latencies across all http requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumClientDataTransferTime set the sumClientDataTransferTime.
   */
  @VsoMethod
  public void setSumClientDataTransferTime(Float  sumClientDataTransferTime) {
    this.sumClientDataTransferTime = sumClientDataTransferTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sum of all client round trip times for all samples.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumClientRtt
   */
  @VsoMethod
  public Float getSumClientRtt() {
    return sumClientRtt;
  }

  /**
   * This is the setter method to the attribute.
   * Sum of all client round trip times for all samples.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumClientRtt set the sumClientRtt.
   */
  @VsoMethod
  public void setSumClientRtt(Float  sumClientRtt) {
    this.sumClientRtt = sumClientRtt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total client connection latency reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumConnectionTime
   */
  @VsoMethod
  public Float getSumConnectionTime() {
    return sumConnectionTime;
  }

  /**
   * This is the setter method to the attribute.
   * Total client connection latency reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumConnectionTime set the sumConnectionTime.
   */
  @VsoMethod
  public void setSumConnectionTime(Float  sumConnectionTime) {
    this.sumConnectionTime = sumConnectionTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total domain lookup latency reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumDnsLookupTime
   */
  @VsoMethod
  public Float getSumDnsLookupTime() {
    return sumDnsLookupTime;
  }

  /**
   * This is the setter method to the attribute.
   * Total domain lookup latency reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumDnsLookupTime set the sumDnsLookupTime.
   */
  @VsoMethod
  public void setSumDnsLookupTime(Float  sumDnsLookupTime) {
    this.sumDnsLookupTime = sumDnsLookupTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total dom content latency reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumDomContentLoadTime
   */
  @VsoMethod
  public Float getSumDomContentLoadTime() {
    return sumDomContentLoadTime;
  }

  /**
   * This is the setter method to the attribute.
   * Total dom content latency reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumDomContentLoadTime set the sumDomContentLoadTime.
   */
  @VsoMethod
  public void setSumDomContentLoadTime(Float  sumDomContentLoadTime) {
    this.sumDomContentLoadTime = sumDomContentLoadTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Count of http 400 and 500 errors for a virtual service in a time interval.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumErrors
   */
  @VsoMethod
  public Float getSumErrors() {
    return sumErrors;
  }

  /**
   * This is the setter method to the attribute.
   * Count of http 400 and 500 errors for a virtual service in a time interval.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumErrors set the sumErrors.
   */
  @VsoMethod
  public void setSumErrors(Float  sumErrors) {
    this.sumErrors = sumErrors;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of server sessions closed in this interval.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumFinishedSessions
   */
  @VsoMethod
  public Float getSumFinishedSessions() {
    return sumFinishedSessions;
  }

  /**
   * This is the setter method to the attribute.
   * Number of server sessions closed in this interval.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumFinishedSessions set the sumFinishedSessions.
   */
  @VsoMethod
  public void setSumFinishedSessions(Float  sumFinishedSessions) {
    this.sumFinishedSessions = sumFinishedSessions;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total latency from responses to all the get requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumGetClientTxnLatency
   */
  @VsoMethod
  public Float getSumGetClientTxnLatency() {
    return sumGetClientTxnLatency;
  }

  /**
   * This is the setter method to the attribute.
   * Total latency from responses to all the get requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumGetClientTxnLatency set the sumGetClientTxnLatency.
   */
  @VsoMethod
  public void setSumGetClientTxnLatency(Float  sumGetClientTxnLatency) {
    this.sumGetClientTxnLatency = sumGetClientTxnLatency;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http get requests that were responded satisfactorily within latency threshold.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumGetClientTxnLatencyBucket1
   */
  @VsoMethod
  public Float getSumGetClientTxnLatencyBucket1() {
    return sumGetClientTxnLatencyBucket1;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http get requests that were responded satisfactorily within latency threshold.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumGetClientTxnLatencyBucket1 set the sumGetClientTxnLatencyBucket1.
   */
  @VsoMethod
  public void setSumGetClientTxnLatencyBucket1(Float  sumGetClientTxnLatencyBucket1) {
    this.sumGetClientTxnLatencyBucket1 = sumGetClientTxnLatencyBucket1;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http get requests that were responded beyond latency threshold but within tolerated limits.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumGetClientTxnLatencyBucket2
   */
  @VsoMethod
  public Float getSumGetClientTxnLatencyBucket2() {
    return sumGetClientTxnLatencyBucket2;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http get requests that were responded beyond latency threshold but within tolerated limits.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumGetClientTxnLatencyBucket2 set the sumGetClientTxnLatencyBucket2.
   */
  @VsoMethod
  public void setSumGetClientTxnLatencyBucket2(Float  sumGetClientTxnLatencyBucket2) {
    this.sumGetClientTxnLatencyBucket2 = sumGetClientTxnLatencyBucket2;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http get requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumGetReqs
   */
  @VsoMethod
  public Float getSumGetReqs() {
    return sumGetReqs;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http get requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumGetReqs set the sumGetReqs.
   */
  @VsoMethod
  public void setSumGetReqs(Float  sumGetReqs) {
    this.sumGetReqs = sumGetReqs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total size of http request headers.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumHttpHeadersBytes
   */
  @VsoMethod
  public Float getSumHttpHeadersBytes() {
    return sumHttpHeadersBytes;
  }

  /**
   * This is the setter method to the attribute.
   * Total size of http request headers.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumHttpHeadersBytes set the sumHttpHeadersBytes.
   */
  @VsoMethod
  public void setSumHttpHeadersBytes(Float  sumHttpHeadersBytes) {
    this.sumHttpHeadersBytes = sumHttpHeadersBytes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http headers across all requests in a given metrics interval.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumHttpHeadersCount
   */
  @VsoMethod
  public Float getSumHttpHeadersCount() {
    return sumHttpHeadersCount;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http headers across all requests in a given metrics interval.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumHttpHeadersCount set the sumHttpHeadersCount.
   */
  @VsoMethod
  public void setSumHttpHeadersCount(Float  sumHttpHeadersCount) {
    this.sumHttpHeadersCount = sumHttpHeadersCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http request parameters.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumHttpParamsCount
   */
  @VsoMethod
  public Float getSumHttpParamsCount() {
    return sumHttpParamsCount;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http request parameters.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumHttpParamsCount set the sumHttpParamsCount.
   */
  @VsoMethod
  public void setSumHttpParamsCount(Float  sumHttpParamsCount) {
    this.sumHttpParamsCount = sumHttpParamsCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total samples that had satisfactory page load time.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumNumPageLoadTimeBucket1
   */
  @VsoMethod
  public Float getSumNumPageLoadTimeBucket1() {
    return sumNumPageLoadTimeBucket1;
  }

  /**
   * This is the setter method to the attribute.
   * Total samples that had satisfactory page load time.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumNumPageLoadTimeBucket1 set the sumNumPageLoadTimeBucket1.
   */
  @VsoMethod
  public void setSumNumPageLoadTimeBucket1(Float  sumNumPageLoadTimeBucket1) {
    this.sumNumPageLoadTimeBucket1 = sumNumPageLoadTimeBucket1;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total samples that had tolerated page load time.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumNumPageLoadTimeBucket2
   */
  @VsoMethod
  public Float getSumNumPageLoadTimeBucket2() {
    return sumNumPageLoadTimeBucket2;
  }

  /**
   * This is the setter method to the attribute.
   * Total samples that had tolerated page load time.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumNumPageLoadTimeBucket2 set the sumNumPageLoadTimeBucket2.
   */
  @VsoMethod
  public void setSumNumPageLoadTimeBucket2(Float  sumNumPageLoadTimeBucket2) {
    this.sumNumPageLoadTimeBucket2 = sumNumPageLoadTimeBucket2;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total samples used for rum metrics.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumNumRumSamples
   */
  @VsoMethod
  public Float getSumNumRumSamples() {
    return sumNumRumSamples;
  }

  /**
   * This is the setter method to the attribute.
   * Total samples used for rum metrics.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumNumRumSamples set the sumNumRumSamples.
   */
  @VsoMethod
  public void setSumNumRumSamples(Float  sumNumRumSamples) {
    this.sumNumRumSamples = sumNumRumSamples;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total latency from responses to all the requests other than get or post.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumOtherClientTxnLatency
   */
  @VsoMethod
  public Float getSumOtherClientTxnLatency() {
    return sumOtherClientTxnLatency;
  }

  /**
   * This is the setter method to the attribute.
   * Total latency from responses to all the requests other than get or post.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumOtherClientTxnLatency set the sumOtherClientTxnLatency.
   */
  @VsoMethod
  public void setSumOtherClientTxnLatency(Float  sumOtherClientTxnLatency) {
    this.sumOtherClientTxnLatency = sumOtherClientTxnLatency;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http requests other than get or post that were responded satisfactorily within latency threshold.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumOtherClientTxnLatencyBucket1
   */
  @VsoMethod
  public Float getSumOtherClientTxnLatencyBucket1() {
    return sumOtherClientTxnLatencyBucket1;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http requests other than get or post that were responded satisfactorily within latency threshold.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumOtherClientTxnLatencyBucket1 set the sumOtherClientTxnLatencyBucket1.
   */
  @VsoMethod
  public void setSumOtherClientTxnLatencyBucket1(Float  sumOtherClientTxnLatencyBucket1) {
    this.sumOtherClientTxnLatencyBucket1 = sumOtherClientTxnLatencyBucket1;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http requests other than get or post that were responded beyond latency threshold but within tolerated limits.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumOtherClientTxnLatencyBucket2
   */
  @VsoMethod
  public Float getSumOtherClientTxnLatencyBucket2() {
    return sumOtherClientTxnLatencyBucket2;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http requests other than get or post that were responded beyond latency threshold but within tolerated limits.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumOtherClientTxnLatencyBucket2 set the sumOtherClientTxnLatencyBucket2.
   */
  @VsoMethod
  public void setSumOtherClientTxnLatencyBucket2(Float  sumOtherClientTxnLatencyBucket2) {
    this.sumOtherClientTxnLatencyBucket2 = sumOtherClientTxnLatencyBucket2;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http requests that are not get or post requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumOtherReqs
   */
  @VsoMethod
  public Float getSumOtherReqs() {
    return sumOtherReqs;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http requests that are not get or post requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumOtherReqs set the sumOtherReqs.
   */
  @VsoMethod
  public void setSumOtherReqs(Float  sumOtherReqs) {
    this.sumOtherReqs = sumOtherReqs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total time to transfer response to client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumPageDownloadTime
   */
  @VsoMethod
  public Float getSumPageDownloadTime() {
    return sumPageDownloadTime;
  }

  /**
   * This is the setter method to the attribute.
   * Total time to transfer response to client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumPageDownloadTime set the sumPageDownloadTime.
   */
  @VsoMethod
  public void setSumPageDownloadTime(Float  sumPageDownloadTime) {
    this.sumPageDownloadTime = sumPageDownloadTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total page load time reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumPageLoadTime
   */
  @VsoMethod
  public Float getSumPageLoadTime() {
    return sumPageLoadTime;
  }

  /**
   * This is the setter method to the attribute.
   * Total page load time reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumPageLoadTime set the sumPageLoadTime.
   */
  @VsoMethod
  public void setSumPageLoadTime(Float  sumPageLoadTime) {
    this.sumPageLoadTime = sumPageLoadTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total size of http post requests.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumPostBytes
   */
  @VsoMethod
  public Float getSumPostBytes() {
    return sumPostBytes;
  }

  /**
   * This is the setter method to the attribute.
   * Total size of http post requests.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumPostBytes set the sumPostBytes.
   */
  @VsoMethod
  public void setSumPostBytes(Float  sumPostBytes) {
    this.sumPostBytes = sumPostBytes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total latency from responses to all the post requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumPostClientTxnLatency
   */
  @VsoMethod
  public Float getSumPostClientTxnLatency() {
    return sumPostClientTxnLatency;
  }

  /**
   * This is the setter method to the attribute.
   * Total latency from responses to all the post requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumPostClientTxnLatency set the sumPostClientTxnLatency.
   */
  @VsoMethod
  public void setSumPostClientTxnLatency(Float  sumPostClientTxnLatency) {
    this.sumPostClientTxnLatency = sumPostClientTxnLatency;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http post requests that were responded satisfactorily within latency threshold.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumPostClientTxnLatencyBucket1
   */
  @VsoMethod
  public Float getSumPostClientTxnLatencyBucket1() {
    return sumPostClientTxnLatencyBucket1;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http post requests that were responded satisfactorily within latency threshold.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumPostClientTxnLatencyBucket1 set the sumPostClientTxnLatencyBucket1.
   */
  @VsoMethod
  public void setSumPostClientTxnLatencyBucket1(Float  sumPostClientTxnLatencyBucket1) {
    this.sumPostClientTxnLatencyBucket1 = sumPostClientTxnLatencyBucket1;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http post requests that were responded beyond latency threshold but within tolerated limits.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumPostClientTxnLatencyBucket2
   */
  @VsoMethod
  public Float getSumPostClientTxnLatencyBucket2() {
    return sumPostClientTxnLatencyBucket2;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http post requests that were responded beyond latency threshold but within tolerated limits.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumPostClientTxnLatencyBucket2 set the sumPostClientTxnLatencyBucket2.
   */
  @VsoMethod
  public void setSumPostClientTxnLatencyBucket2(Float  sumPostClientTxnLatencyBucket2) {
    this.sumPostClientTxnLatencyBucket2 = sumPostClientTxnLatencyBucket2;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http post requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumPostReqs
   */
  @VsoMethod
  public Float getSumPostReqs() {
    return sumPostReqs;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http post requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumPostReqs set the sumPostReqs.
   */
  @VsoMethod
  public void setSumPostReqs(Float  sumPostReqs) {
    this.sumPostReqs = sumPostReqs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total redirect latency reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumRedirectionTime
   */
  @VsoMethod
  public Float getSumRedirectionTime() {
    return sumRedirectionTime;
  }

  /**
   * This is the setter method to the attribute.
   * Total redirect latency reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumRedirectionTime set the sumRedirectionTime.
   */
  @VsoMethod
  public void setSumRedirectionTime(Float  sumRedirectionTime) {
    this.sumRedirectionTime = sumRedirectionTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of requests served across server sessions closed in the interval.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumReqsFinishedSessions
   */
  @VsoMethod
  public Float getSumReqsFinishedSessions() {
    return sumReqsFinishedSessions;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of requests served across server sessions closed in the interval.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumReqsFinishedSessions set the sumReqsFinishedSessions.
   */
  @VsoMethod
  public void setSumReqsFinishedSessions(Float  sumReqsFinishedSessions) {
    this.sumReqsFinishedSessions = sumReqsFinishedSessions;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http requests containing at least one parameter.
   * Field introduced in 17.2.12, 18.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumReqsWithParams
   */
  @VsoMethod
  public Float getSumReqsWithParams() {
    return sumReqsWithParams;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http requests containing at least one parameter.
   * Field introduced in 17.2.12, 18.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumReqsWithParams set the sumReqsWithParams.
   */
  @VsoMethod
  public void setSumReqsWithParams(Float  sumReqsWithParams) {
    this.sumReqsWithParams = sumReqsWithParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http 1xx responses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumResp1Xx
   */
  @VsoMethod
  public Float getSumResp1Xx() {
    return sumResp1Xx;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http 1xx responses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumResp1Xx set the sumResp1Xx.
   */
  @VsoMethod
  public void setSumResp1Xx(Float  sumResp1Xx) {
    this.sumResp1Xx = sumResp1Xx;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http 2xx responses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumResp2Xx
   */
  @VsoMethod
  public Float getSumResp2Xx() {
    return sumResp2Xx;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http 2xx responses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumResp2Xx set the sumResp2Xx.
   */
  @VsoMethod
  public void setSumResp2Xx(Float  sumResp2Xx) {
    this.sumResp2Xx = sumResp2Xx;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http 3xx responses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumResp3Xx
   */
  @VsoMethod
  public Float getSumResp3Xx() {
    return sumResp3Xx;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http 3xx responses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumResp3Xx set the sumResp3Xx.
   */
  @VsoMethod
  public void setSumResp3Xx(Float  sumResp3Xx) {
    this.sumResp3Xx = sumResp3Xx;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http 4xx error responses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumResp4Xx
   */
  @VsoMethod
  public Float getSumResp4Xx() {
    return sumResp4Xx;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http 4xx error responses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumResp4Xx set the sumResp4Xx.
   */
  @VsoMethod
  public void setSumResp4Xx(Float  sumResp4Xx) {
    this.sumResp4Xx = sumResp4Xx;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http 5xx error responses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumResp5Xx
   */
  @VsoMethod
  public Float getSumResp5Xx() {
    return sumResp5Xx;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http 5xx error responses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumResp5Xx set the sumResp5Xx.
   */
  @VsoMethod
  public void setSumResp5Xx(Float  sumResp5Xx) {
    this.sumResp5Xx = sumResp5Xx;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total client data transfer time by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumRumClientDataTransferTime
   */
  @VsoMethod
  public Float getSumRumClientDataTransferTime() {
    return sumRumClientDataTransferTime;
  }

  /**
   * This is the setter method to the attribute.
   * Total client data transfer time by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumRumClientDataTransferTime set the sumRumClientDataTransferTime.
   */
  @VsoMethod
  public void setSumRumClientDataTransferTime(Float  sumRumClientDataTransferTime) {
    this.sumRumClientDataTransferTime = sumRumClientDataTransferTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sum of all server round trip times for all samples.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumServerRtt
   */
  @VsoMethod
  public Float getSumServerRtt() {
    return sumServerRtt;
  }

  /**
   * This is the setter method to the attribute.
   * Sum of all server round trip times for all samples.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumServerRtt set the sumServerRtt.
   */
  @VsoMethod
  public void setSumServerRtt(Float  sumServerRtt) {
    this.sumServerRtt = sumServerRtt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total time from receipt of request to start of response.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumServiceTime
   */
  @VsoMethod
  public Float getSumServiceTime() {
    return sumServiceTime;
  }

  /**
   * This is the setter method to the attribute.
   * Total time from receipt of request to start of response.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumServiceTime set the sumServiceTime.
   */
  @VsoMethod
  public void setSumServiceTime(Float  sumServiceTime) {
    this.sumServiceTime = sumServiceTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of http responses sent.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumTotalResponses
   */
  @VsoMethod
  public Float getSumTotalResponses() {
    return sumTotalResponses;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of http responses sent.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumTotalResponses set the sumTotalResponses.
   */
  @VsoMethod
  public void setSumTotalResponses(Float  sumTotalResponses) {
    this.sumTotalResponses = sumTotalResponses;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total length of http request uris.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumUriLength
   */
  @VsoMethod
  public Float getSumUriLength() {
    return sumUriLength;
  }

  /**
   * This is the setter method to the attribute.
   * Total length of http request uris.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumUriLength set the sumUriLength.
   */
  @VsoMethod
  public void setSumUriLength(Float  sumUriLength) {
    this.sumUriLength = sumUriLength;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of transactions identified by waf as attacks.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafAttacks
   */
  @VsoMethod
  public Float getSumWafAttacks() {
    return sumWafAttacks;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of transactions identified by waf as attacks.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafAttacks set the sumWafAttacks.
   */
  @VsoMethod
  public void setSumWafAttacks(Float  sumWafAttacks) {
    this.sumWafAttacks = sumWafAttacks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of requests bypassing waf.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafDisabled
   */
  @VsoMethod
  public Float getSumWafDisabled() {
    return sumWafDisabled;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of requests bypassing waf.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafDisabled set the sumWafDisabled.
   */
  @VsoMethod
  public void setSumWafDisabled(Float  sumWafDisabled) {
    this.sumWafDisabled = sumWafDisabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of requests evaluated by waf in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafEvaluatedRequestBodyPhase
   */
  @VsoMethod
  public Float getSumWafEvaluatedRequestBodyPhase() {
    return sumWafEvaluatedRequestBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of requests evaluated by waf in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafEvaluatedRequestBodyPhase set the sumWafEvaluatedRequestBodyPhase.
   */
  @VsoMethod
  public void setSumWafEvaluatedRequestBodyPhase(Float  sumWafEvaluatedRequestBodyPhase) {
    this.sumWafEvaluatedRequestBodyPhase = sumWafEvaluatedRequestBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of requests evaluated by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafEvaluatedRequestHeaderPhase
   */
  @VsoMethod
  public Float getSumWafEvaluatedRequestHeaderPhase() {
    return sumWafEvaluatedRequestHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of requests evaluated by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafEvaluatedRequestHeaderPhase set the sumWafEvaluatedRequestHeaderPhase.
   */
  @VsoMethod
  public void setSumWafEvaluatedRequestHeaderPhase(Float  sumWafEvaluatedRequestHeaderPhase) {
    this.sumWafEvaluatedRequestHeaderPhase = sumWafEvaluatedRequestHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of responses evaluated by waf in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafEvaluatedResponseBodyPhase
   */
  @VsoMethod
  public Float getSumWafEvaluatedResponseBodyPhase() {
    return sumWafEvaluatedResponseBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of responses evaluated by waf in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafEvaluatedResponseBodyPhase set the sumWafEvaluatedResponseBodyPhase.
   */
  @VsoMethod
  public void setSumWafEvaluatedResponseBodyPhase(Float  sumWafEvaluatedResponseBodyPhase) {
    this.sumWafEvaluatedResponseBodyPhase = sumWafEvaluatedResponseBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of responses evaluated by waf in response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafEvaluatedResponseHeaderPhase
   */
  @VsoMethod
  public Float getSumWafEvaluatedResponseHeaderPhase() {
    return sumWafEvaluatedResponseHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of responses evaluated by waf in response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafEvaluatedResponseHeaderPhase set the sumWafEvaluatedResponseHeaderPhase.
   */
  @VsoMethod
  public void setSumWafEvaluatedResponseHeaderPhase(Float  sumWafEvaluatedResponseHeaderPhase) {
    this.sumWafEvaluatedResponseHeaderPhase = sumWafEvaluatedResponseHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of transactions (requests or responses) flagged as attack by waf.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafFlagged
   */
  @VsoMethod
  public Float getSumWafFlagged() {
    return sumWafFlagged;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of transactions (requests or responses) flagged as attack by waf.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafFlagged set the sumWafFlagged.
   */
  @VsoMethod
  public void setSumWafFlagged(Float  sumWafFlagged) {
    this.sumWafFlagged = sumWafFlagged;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of requests flagged (but not rejected) by waf in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafFlaggedRequestBodyPhase
   */
  @VsoMethod
  public Float getSumWafFlaggedRequestBodyPhase() {
    return sumWafFlaggedRequestBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of requests flagged (but not rejected) by waf in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafFlaggedRequestBodyPhase set the sumWafFlaggedRequestBodyPhase.
   */
  @VsoMethod
  public void setSumWafFlaggedRequestBodyPhase(Float  sumWafFlaggedRequestBodyPhase) {
    this.sumWafFlaggedRequestBodyPhase = sumWafFlaggedRequestBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of requests flagged (but not rejected) by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafFlaggedRequestHeaderPhase
   */
  @VsoMethod
  public Float getSumWafFlaggedRequestHeaderPhase() {
    return sumWafFlaggedRequestHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of requests flagged (but not rejected) by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafFlaggedRequestHeaderPhase set the sumWafFlaggedRequestHeaderPhase.
   */
  @VsoMethod
  public void setSumWafFlaggedRequestHeaderPhase(Float  sumWafFlaggedRequestHeaderPhase) {
    this.sumWafFlaggedRequestHeaderPhase = sumWafFlaggedRequestHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of responses flagged (but not rejected) by waf in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafFlaggedResponseBodyPhase
   */
  @VsoMethod
  public Float getSumWafFlaggedResponseBodyPhase() {
    return sumWafFlaggedResponseBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of responses flagged (but not rejected) by waf in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafFlaggedResponseBodyPhase set the sumWafFlaggedResponseBodyPhase.
   */
  @VsoMethod
  public void setSumWafFlaggedResponseBodyPhase(Float  sumWafFlaggedResponseBodyPhase) {
    this.sumWafFlaggedResponseBodyPhase = sumWafFlaggedResponseBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of responses flagged (but not rejected) by waf in response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafFlaggedResponseHeaderPhase
   */
  @VsoMethod
  public Float getSumWafFlaggedResponseHeaderPhase() {
    return sumWafFlaggedResponseHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of responses flagged (but not rejected) by waf in response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafFlaggedResponseHeaderPhase set the sumWafFlaggedResponseHeaderPhase.
   */
  @VsoMethod
  public void setSumWafFlaggedResponseHeaderPhase(Float  sumWafFlaggedResponseHeaderPhase) {
    this.sumWafFlaggedResponseHeaderPhase = sumWafFlaggedResponseHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total latency seen by all evaluated requests in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafLatencyRequestBodyPhase
   */
  @VsoMethod
  public Float getSumWafLatencyRequestBodyPhase() {
    return sumWafLatencyRequestBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total latency seen by all evaluated requests in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafLatencyRequestBodyPhase set the sumWafLatencyRequestBodyPhase.
   */
  @VsoMethod
  public void setSumWafLatencyRequestBodyPhase(Float  sumWafLatencyRequestBodyPhase) {
    this.sumWafLatencyRequestBodyPhase = sumWafLatencyRequestBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total latency seen by all transactions evaluated by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafLatencyRequestHeaderPhase
   */
  @VsoMethod
  public Float getSumWafLatencyRequestHeaderPhase() {
    return sumWafLatencyRequestHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total latency seen by all transactions evaluated by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafLatencyRequestHeaderPhase set the sumWafLatencyRequestHeaderPhase.
   */
  @VsoMethod
  public void setSumWafLatencyRequestHeaderPhase(Float  sumWafLatencyRequestHeaderPhase) {
    this.sumWafLatencyRequestHeaderPhase = sumWafLatencyRequestHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total latency seen by all evaluated responses in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafLatencyResponseBodyPhase
   */
  @VsoMethod
  public Float getSumWafLatencyResponseBodyPhase() {
    return sumWafLatencyResponseBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total latency seen by all evaluated responses in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafLatencyResponseBodyPhase set the sumWafLatencyResponseBodyPhase.
   */
  @VsoMethod
  public void setSumWafLatencyResponseBodyPhase(Float  sumWafLatencyResponseBodyPhase) {
    this.sumWafLatencyResponseBodyPhase = sumWafLatencyResponseBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total latency seen by all evaluated responsess in waf response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafLatencyResponseHeaderPhase
   */
  @VsoMethod
  public Float getSumWafLatencyResponseHeaderPhase() {
    return sumWafLatencyResponseHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total latency seen by all evaluated responsess in waf response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafLatencyResponseHeaderPhase set the sumWafLatencyResponseHeaderPhase.
   */
  @VsoMethod
  public void setSumWafLatencyResponseHeaderPhase(Float  sumWafLatencyResponseHeaderPhase) {
    this.sumWafLatencyResponseHeaderPhase = sumWafLatencyResponseHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of requests matched by waf in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafMatchedRequestBodyPhase
   */
  @VsoMethod
  public Float getSumWafMatchedRequestBodyPhase() {
    return sumWafMatchedRequestBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of requests matched by waf in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafMatchedRequestBodyPhase set the sumWafMatchedRequestBodyPhase.
   */
  @VsoMethod
  public void setSumWafMatchedRequestBodyPhase(Float  sumWafMatchedRequestBodyPhase) {
    this.sumWafMatchedRequestBodyPhase = sumWafMatchedRequestBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of requests matched by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafMatchedRequestHeaderPhase
   */
  @VsoMethod
  public Float getSumWafMatchedRequestHeaderPhase() {
    return sumWafMatchedRequestHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of requests matched by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafMatchedRequestHeaderPhase set the sumWafMatchedRequestHeaderPhase.
   */
  @VsoMethod
  public void setSumWafMatchedRequestHeaderPhase(Float  sumWafMatchedRequestHeaderPhase) {
    this.sumWafMatchedRequestHeaderPhase = sumWafMatchedRequestHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of responses matched by waf in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafMatchedResponseBodyPhase
   */
  @VsoMethod
  public Float getSumWafMatchedResponseBodyPhase() {
    return sumWafMatchedResponseBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of responses matched by waf in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafMatchedResponseBodyPhase set the sumWafMatchedResponseBodyPhase.
   */
  @VsoMethod
  public void setSumWafMatchedResponseBodyPhase(Float  sumWafMatchedResponseBodyPhase) {
    this.sumWafMatchedResponseBodyPhase = sumWafMatchedResponseBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of responses matched by waf in response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafMatchedResponseHeaderPhase
   */
  @VsoMethod
  public Float getSumWafMatchedResponseHeaderPhase() {
    return sumWafMatchedResponseHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of responses matched by waf in response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafMatchedResponseHeaderPhase set the sumWafMatchedResponseHeaderPhase.
   */
  @VsoMethod
  public void setSumWafMatchedResponseHeaderPhase(Float  sumWafMatchedResponseHeaderPhase) {
    this.sumWafMatchedResponseHeaderPhase = sumWafMatchedResponseHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of transactions (requests or responses) rejected by waf.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafRejected
   */
  @VsoMethod
  public Float getSumWafRejected() {
    return sumWafRejected;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of transactions (requests or responses) rejected by waf.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafRejected set the sumWafRejected.
   */
  @VsoMethod
  public void setSumWafRejected(Float  sumWafRejected) {
    this.sumWafRejected = sumWafRejected;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of requests rejected by waf in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafRejectedRequestBodyPhase
   */
  @VsoMethod
  public Float getSumWafRejectedRequestBodyPhase() {
    return sumWafRejectedRequestBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of requests rejected by waf in request body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafRejectedRequestBodyPhase set the sumWafRejectedRequestBodyPhase.
   */
  @VsoMethod
  public void setSumWafRejectedRequestBodyPhase(Float  sumWafRejectedRequestBodyPhase) {
    this.sumWafRejectedRequestBodyPhase = sumWafRejectedRequestBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of requests rejected by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafRejectedRequestHeaderPhase
   */
  @VsoMethod
  public Float getSumWafRejectedRequestHeaderPhase() {
    return sumWafRejectedRequestHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of requests rejected by waf in request header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafRejectedRequestHeaderPhase set the sumWafRejectedRequestHeaderPhase.
   */
  @VsoMethod
  public void setSumWafRejectedRequestHeaderPhase(Float  sumWafRejectedRequestHeaderPhase) {
    this.sumWafRejectedRequestHeaderPhase = sumWafRejectedRequestHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of responses rejected by waf in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafRejectedResponseBodyPhase
   */
  @VsoMethod
  public Float getSumWafRejectedResponseBodyPhase() {
    return sumWafRejectedResponseBodyPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of responses rejected by waf in response body phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafRejectedResponseBodyPhase set the sumWafRejectedResponseBodyPhase.
   */
  @VsoMethod
  public void setSumWafRejectedResponseBodyPhase(Float  sumWafRejectedResponseBodyPhase) {
    this.sumWafRejectedResponseBodyPhase = sumWafRejectedResponseBodyPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of responses rejected by waf in response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWafRejectedResponseHeaderPhase
   */
  @VsoMethod
  public Float getSumWafRejectedResponseHeaderPhase() {
    return sumWafRejectedResponseHeaderPhase;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of responses rejected by waf in response header phase.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWafRejectedResponseHeaderPhase set the sumWafRejectedResponseHeaderPhase.
   */
  @VsoMethod
  public void setSumWafRejectedResponseHeaderPhase(Float  sumWafRejectedResponseHeaderPhase) {
    this.sumWafRejectedResponseHeaderPhase = sumWafRejectedResponseHeaderPhase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total waiting reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sumWaitingTime
   */
  @VsoMethod
  public Float getSumWaitingTime() {
    return sumWaitingTime;
  }

  /**
   * This is the setter method to the attribute.
   * Total waiting reported by client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sumWaitingTime set the sumWaitingTime.
   */
  @VsoMethod
  public void setSumWaitingTime(Float  sumWaitingTime) {
    this.sumWaitingTime = sumWaitingTime;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VserverL7MetricsObj objVserverL7MetricsObj = (VserverL7MetricsObj) o;
  return   Objects.equals(this.nodeObjId, objVserverL7MetricsObj.nodeObjId)&&
  Objects.equals(this.sumGetReqs, objVserverL7MetricsObj.sumGetReqs)&&
  Objects.equals(this.sumPostReqs, objVserverL7MetricsObj.sumPostReqs)&&
  Objects.equals(this.sumOtherReqs, objVserverL7MetricsObj.sumOtherReqs)&&
  Objects.equals(this.sumFinishedSessions, objVserverL7MetricsObj.sumFinishedSessions)&&
  Objects.equals(this.sumReqsFinishedSessions, objVserverL7MetricsObj.sumReqsFinishedSessions)&&
  Objects.equals(this.maxConcurrentSessions, objVserverL7MetricsObj.maxConcurrentSessions)&&
  Objects.equals(this.avgReqsPerSession, objVserverL7MetricsObj.avgReqsPerSession)&&
  Objects.equals(this.sumResp1Xx, objVserverL7MetricsObj.sumResp1Xx)&&
  Objects.equals(this.avgResp1Xx, objVserverL7MetricsObj.avgResp1Xx)&&
  Objects.equals(this.sumResp2Xx, objVserverL7MetricsObj.sumResp2Xx)&&
  Objects.equals(this.avgResp2Xx, objVserverL7MetricsObj.avgResp2Xx)&&
  Objects.equals(this.sumResp3Xx, objVserverL7MetricsObj.sumResp3Xx)&&
  Objects.equals(this.avgResp3Xx, objVserverL7MetricsObj.avgResp3Xx)&&
  Objects.equals(this.sumResp4Xx, objVserverL7MetricsObj.sumResp4Xx)&&
  Objects.equals(this.avgResp4Xx, objVserverL7MetricsObj.avgResp4Xx)&&
  Objects.equals(this.avgResp4XxAviErrors, objVserverL7MetricsObj.avgResp4XxAviErrors)&&
  Objects.equals(this.sumResp5Xx, objVserverL7MetricsObj.sumResp5Xx)&&
  Objects.equals(this.avgResp5Xx, objVserverL7MetricsObj.avgResp5Xx)&&
  Objects.equals(this.avgResp5XxAviErrors, objVserverL7MetricsObj.avgResp5XxAviErrors)&&
  Objects.equals(this.sumErrors, objVserverL7MetricsObj.sumErrors)&&
  Objects.equals(this.avgErrorResponses, objVserverL7MetricsObj.avgErrorResponses)&&
  Objects.equals(this.avgErrorsExcluded, objVserverL7MetricsObj.avgErrorsExcluded)&&
  Objects.equals(this.pctResponseErrors, objVserverL7MetricsObj.pctResponseErrors)&&
  Objects.equals(this.sumGetClientTxnLatencyBucket1, objVserverL7MetricsObj.sumGetClientTxnLatencyBucket1)&&
  Objects.equals(this.sumGetClientTxnLatencyBucket2, objVserverL7MetricsObj.sumGetClientTxnLatencyBucket2)&&
  Objects.equals(this.sumPostClientTxnLatencyBucket1, objVserverL7MetricsObj.sumPostClientTxnLatencyBucket1)&&
  Objects.equals(this.sumPostClientTxnLatencyBucket2, objVserverL7MetricsObj.sumPostClientTxnLatencyBucket2)&&
  Objects.equals(this.sumOtherClientTxnLatencyBucket1, objVserverL7MetricsObj.sumOtherClientTxnLatencyBucket1)&&
  Objects.equals(this.sumOtherClientTxnLatencyBucket2, objVserverL7MetricsObj.sumOtherClientTxnLatencyBucket2)&&
  Objects.equals(this.avgTotalRequests, objVserverL7MetricsObj.avgTotalRequests)&&
  Objects.equals(this.sumTotalResponses, objVserverL7MetricsObj.sumTotalResponses)&&
  Objects.equals(this.avgCompleteResponses, objVserverL7MetricsObj.avgCompleteResponses)&&
  Objects.equals(this.avgCacheHits, objVserverL7MetricsObj.avgCacheHits)&&
  Objects.equals(this.avgCacheBytes, objVserverL7MetricsObj.avgCacheBytes)&&
  Objects.equals(this.avgCacheableHits, objVserverL7MetricsObj.avgCacheableHits)&&
  Objects.equals(this.avgCacheableBytes, objVserverL7MetricsObj.avgCacheableBytes)&&
  Objects.equals(this.pctCacheHits, objVserverL7MetricsObj.pctCacheHits)&&
  Objects.equals(this.pctCacheableHits, objVserverL7MetricsObj.pctCacheableHits)&&
  Objects.equals(this.avgPreCompressionBytes, objVserverL7MetricsObj.avgPreCompressionBytes)&&
  Objects.equals(this.avgPostCompressionBytes, objVserverL7MetricsObj.avgPostCompressionBytes)&&
  Objects.equals(this.apdexr, objVserverL7MetricsObj.apdexr)&&
  Objects.equals(this.sumGetClientTxnLatency, objVserverL7MetricsObj.sumGetClientTxnLatency)&&
  Objects.equals(this.sumPostClientTxnLatency, objVserverL7MetricsObj.sumPostClientTxnLatency)&&
  Objects.equals(this.sumOtherClientTxnLatency, objVserverL7MetricsObj.sumOtherClientTxnLatency)&&
  Objects.equals(this.avgClientTxnLatency, objVserverL7MetricsObj.avgClientTxnLatency)&&
  Objects.equals(this.sumClientDataTransferTime, objVserverL7MetricsObj.sumClientDataTransferTime)&&
  Objects.equals(this.avgClientDataTransferTime, objVserverL7MetricsObj.avgClientDataTransferTime)&&
  Objects.equals(this.sumRedirectionTime, objVserverL7MetricsObj.sumRedirectionTime)&&
  Objects.equals(this.sumDnsLookupTime, objVserverL7MetricsObj.sumDnsLookupTime)&&
  Objects.equals(this.sumConnectionTime, objVserverL7MetricsObj.sumConnectionTime)&&
  Objects.equals(this.sumBlockingTime, objVserverL7MetricsObj.sumBlockingTime)&&
  Objects.equals(this.sumApplicationResponseTime, objVserverL7MetricsObj.sumApplicationResponseTime)&&
  Objects.equals(this.sumServerRtt, objVserverL7MetricsObj.sumServerRtt)&&
  Objects.equals(this.sumClientRtt, objVserverL7MetricsObj.sumClientRtt)&&
  Objects.equals(this.sumServiceTime, objVserverL7MetricsObj.sumServiceTime)&&
  Objects.equals(this.sumPageDownloadTime, objVserverL7MetricsObj.sumPageDownloadTime)&&
  Objects.equals(this.sumBrowserRenderingTime, objVserverL7MetricsObj.sumBrowserRenderingTime)&&
  Objects.equals(this.sumDomContentLoadTime, objVserverL7MetricsObj.sumDomContentLoadTime)&&
  Objects.equals(this.sumPageLoadTime, objVserverL7MetricsObj.sumPageLoadTime)&&
  Objects.equals(this.sumNumPageLoadTimeBucket1, objVserverL7MetricsObj.sumNumPageLoadTimeBucket1)&&
  Objects.equals(this.sumNumPageLoadTimeBucket2, objVserverL7MetricsObj.sumNumPageLoadTimeBucket2)&&
  Objects.equals(this.sumWaitingTime, objVserverL7MetricsObj.sumWaitingTime)&&
  Objects.equals(this.sumNumRumSamples, objVserverL7MetricsObj.sumNumRumSamples)&&
  Objects.equals(this.sumRumClientDataTransferTime, objVserverL7MetricsObj.sumRumClientDataTransferTime)&&
  Objects.equals(this.avgRedirectionTime, objVserverL7MetricsObj.avgRedirectionTime)&&
  Objects.equals(this.avgDnsLookupTime, objVserverL7MetricsObj.avgDnsLookupTime)&&
  Objects.equals(this.avgConnectionTime, objVserverL7MetricsObj.avgConnectionTime)&&
  Objects.equals(this.avgBlockingTime, objVserverL7MetricsObj.avgBlockingTime)&&
  Objects.equals(this.avgServerRtt, objVserverL7MetricsObj.avgServerRtt)&&
  Objects.equals(this.avgClientRtt, objVserverL7MetricsObj.avgClientRtt)&&
  Objects.equals(this.avgApplicationResponseTime, objVserverL7MetricsObj.avgApplicationResponseTime)&&
  Objects.equals(this.avgBrowserRenderingTime, objVserverL7MetricsObj.avgBrowserRenderingTime)&&
  Objects.equals(this.avgServiceTime, objVserverL7MetricsObj.avgServiceTime)&&
  Objects.equals(this.avgPageDownloadTime, objVserverL7MetricsObj.avgPageDownloadTime)&&
  Objects.equals(this.avgDomContentLoadTime, objVserverL7MetricsObj.avgDomContentLoadTime)&&
  Objects.equals(this.avgPageLoadTime, objVserverL7MetricsObj.avgPageLoadTime)&&
  Objects.equals(this.avgWaitingTime, objVserverL7MetricsObj.avgWaitingTime)&&
  Objects.equals(this.avgRumClientDataTransferTime, objVserverL7MetricsObj.avgRumClientDataTransferTime)&&
  Objects.equals(this.rumApdexr, objVserverL7MetricsObj.rumApdexr)&&
  Objects.equals(this.avgSslHandshakesNew, objVserverL7MetricsObj.avgSslHandshakesNew)&&
  Objects.equals(this.avgSslHandshakesReused, objVserverL7MetricsObj.avgSslHandshakesReused)&&
  Objects.equals(this.avgSslHandshakeProtocolErrors, objVserverL7MetricsObj.avgSslHandshakeProtocolErrors)&&
  Objects.equals(this.avgSslHandshakeNetworkErrors, objVserverL7MetricsObj.avgSslHandshakeNetworkErrors)&&
  Objects.equals(this.avgSslHandshakesTimedout, objVserverL7MetricsObj.avgSslHandshakesTimedout)&&
  Objects.equals(this.avgSslErrors, objVserverL7MetricsObj.avgSslErrors)&&
  Objects.equals(this.maxSslOpenSessions, objVserverL7MetricsObj.maxSslOpenSessions)&&
  Objects.equals(this.avgSslVerSsl30, objVserverL7MetricsObj.avgSslVerSsl30)&&
  Objects.equals(this.avgSslVerTls10, objVserverL7MetricsObj.avgSslVerTls10)&&
  Objects.equals(this.avgSslVerTls11, objVserverL7MetricsObj.avgSslVerTls11)&&
  Objects.equals(this.avgSslVerTls12, objVserverL7MetricsObj.avgSslVerTls12)&&
  Objects.equals(this.avgSslAuthRsa, objVserverL7MetricsObj.avgSslAuthRsa)&&
  Objects.equals(this.avgSslAuthEcdsa, objVserverL7MetricsObj.avgSslAuthEcdsa)&&
  Objects.equals(this.avgSslAuthDsa, objVserverL7MetricsObj.avgSslAuthDsa)&&
  Objects.equals(this.avgSslConnections, objVserverL7MetricsObj.avgSslConnections)&&
  Objects.equals(this.avgSslFailedConnections, objVserverL7MetricsObj.avgSslFailedConnections)&&
  Objects.equals(this.pctSslFailedConnections, objVserverL7MetricsObj.pctSslFailedConnections)&&
  Objects.equals(this.avgSatisfactoryResponses, objVserverL7MetricsObj.avgSatisfactoryResponses)&&
  Objects.equals(this.avgToleratedResponses, objVserverL7MetricsObj.avgToleratedResponses)&&
  Objects.equals(this.avgFrustratedResponses, objVserverL7MetricsObj.avgFrustratedResponses)&&
  Objects.equals(this.avgSslKxRsa, objVserverL7MetricsObj.avgSslKxRsa)&&
  Objects.equals(this.avgSslKxDh, objVserverL7MetricsObj.avgSslKxDh)&&
  Objects.equals(this.avgSslKxEcdh, objVserverL7MetricsObj.avgSslKxEcdh)&&
  Objects.equals(this.avgSslRsaPfs, objVserverL7MetricsObj.avgSslRsaPfs)&&
  Objects.equals(this.avgSslHandshakesPfs, objVserverL7MetricsObj.avgSslHandshakesPfs)&&
  Objects.equals(this.sslProtocolStrength, objVserverL7MetricsObj.sslProtocolStrength)&&
  Objects.equals(this.avgSslRsaNonPfs, objVserverL7MetricsObj.avgSslRsaNonPfs)&&
  Objects.equals(this.avgSslEcdsaPfs, objVserverL7MetricsObj.avgSslEcdsaPfs)&&
  Objects.equals(this.avgSslEcdsaNonPfs, objVserverL7MetricsObj.avgSslEcdsaNonPfs)&&
  Objects.equals(this.avgSslHandshakesNonPfs, objVserverL7MetricsObj.avgSslHandshakesNonPfs)&&
  Objects.equals(this.avgWafMatchedRequestHeaderPhase, objVserverL7MetricsObj.avgWafMatchedRequestHeaderPhase)&&
  Objects.equals(this.sumWafMatchedRequestHeaderPhase, objVserverL7MetricsObj.sumWafMatchedRequestHeaderPhase)&&
  Objects.equals(this.avgWafRejectedRequestHeaderPhase, objVserverL7MetricsObj.avgWafRejectedRequestHeaderPhase)&&
  Objects.equals(this.sumWafRejectedRequestHeaderPhase, objVserverL7MetricsObj.sumWafRejectedRequestHeaderPhase)&&
  Objects.equals(this.avgWafEvaluatedRequestHeaderPhase, objVserverL7MetricsObj.avgWafEvaluatedRequestHeaderPhase)&&
  Objects.equals(this.sumWafEvaluatedRequestHeaderPhase, objVserverL7MetricsObj.sumWafEvaluatedRequestHeaderPhase)&&
  Objects.equals(this.avgWafFlaggedRequestHeaderPhase, objVserverL7MetricsObj.avgWafFlaggedRequestHeaderPhase)&&
  Objects.equals(this.sumWafFlaggedRequestHeaderPhase, objVserverL7MetricsObj.sumWafFlaggedRequestHeaderPhase)&&
  Objects.equals(this.sumWafLatencyRequestHeaderPhase, objVserverL7MetricsObj.sumWafLatencyRequestHeaderPhase)&&
  Objects.equals(this.avgWafLatencyRequestHeaderPhase, objVserverL7MetricsObj.avgWafLatencyRequestHeaderPhase)&&
  Objects.equals(this.avgWafMatchedRequestBodyPhase, objVserverL7MetricsObj.avgWafMatchedRequestBodyPhase)&&
  Objects.equals(this.sumWafMatchedRequestBodyPhase, objVserverL7MetricsObj.sumWafMatchedRequestBodyPhase)&&
  Objects.equals(this.avgWafRejectedRequestBodyPhase, objVserverL7MetricsObj.avgWafRejectedRequestBodyPhase)&&
  Objects.equals(this.sumWafRejectedRequestBodyPhase, objVserverL7MetricsObj.sumWafRejectedRequestBodyPhase)&&
  Objects.equals(this.avgWafEvaluatedRequestBodyPhase, objVserverL7MetricsObj.avgWafEvaluatedRequestBodyPhase)&&
  Objects.equals(this.sumWafEvaluatedRequestBodyPhase, objVserverL7MetricsObj.sumWafEvaluatedRequestBodyPhase)&&
  Objects.equals(this.avgWafFlaggedRequestBodyPhase, objVserverL7MetricsObj.avgWafFlaggedRequestBodyPhase)&&
  Objects.equals(this.sumWafFlaggedRequestBodyPhase, objVserverL7MetricsObj.sumWafFlaggedRequestBodyPhase)&&
  Objects.equals(this.sumWafLatencyRequestBodyPhase, objVserverL7MetricsObj.sumWafLatencyRequestBodyPhase)&&
  Objects.equals(this.avgWafLatencyRequestBodyPhase, objVserverL7MetricsObj.avgWafLatencyRequestBodyPhase)&&
  Objects.equals(this.avgWafMatchedResponseHeaderPhase, objVserverL7MetricsObj.avgWafMatchedResponseHeaderPhase)&&
  Objects.equals(this.sumWafMatchedResponseHeaderPhase, objVserverL7MetricsObj.sumWafMatchedResponseHeaderPhase)&&
  Objects.equals(this.avgWafRejectedResponseHeaderPhase, objVserverL7MetricsObj.avgWafRejectedResponseHeaderPhase)&&
  Objects.equals(this.sumWafRejectedResponseHeaderPhase, objVserverL7MetricsObj.sumWafRejectedResponseHeaderPhase)&&
  Objects.equals(this.avgWafEvaluatedResponseHeaderPhase, objVserverL7MetricsObj.avgWafEvaluatedResponseHeaderPhase)&&
  Objects.equals(this.sumWafEvaluatedResponseHeaderPhase, objVserverL7MetricsObj.sumWafEvaluatedResponseHeaderPhase)&&
  Objects.equals(this.avgWafFlaggedResponseHeaderPhase, objVserverL7MetricsObj.avgWafFlaggedResponseHeaderPhase)&&
  Objects.equals(this.sumWafFlaggedResponseHeaderPhase, objVserverL7MetricsObj.sumWafFlaggedResponseHeaderPhase)&&
  Objects.equals(this.sumWafLatencyResponseHeaderPhase, objVserverL7MetricsObj.sumWafLatencyResponseHeaderPhase)&&
  Objects.equals(this.avgWafLatencyResponseHeaderPhase, objVserverL7MetricsObj.avgWafLatencyResponseHeaderPhase)&&
  Objects.equals(this.avgWafMatchedResponseBodyPhase, objVserverL7MetricsObj.avgWafMatchedResponseBodyPhase)&&
  Objects.equals(this.sumWafMatchedResponseBodyPhase, objVserverL7MetricsObj.sumWafMatchedResponseBodyPhase)&&
  Objects.equals(this.avgWafRejectedResponseBodyPhase, objVserverL7MetricsObj.avgWafRejectedResponseBodyPhase)&&
  Objects.equals(this.sumWafRejectedResponseBodyPhase, objVserverL7MetricsObj.sumWafRejectedResponseBodyPhase)&&
  Objects.equals(this.avgWafEvaluatedResponseBodyPhase, objVserverL7MetricsObj.avgWafEvaluatedResponseBodyPhase)&&
  Objects.equals(this.sumWafEvaluatedResponseBodyPhase, objVserverL7MetricsObj.sumWafEvaluatedResponseBodyPhase)&&
  Objects.equals(this.avgWafFlaggedResponseBodyPhase, objVserverL7MetricsObj.avgWafFlaggedResponseBodyPhase)&&
  Objects.equals(this.sumWafFlaggedResponseBodyPhase, objVserverL7MetricsObj.sumWafFlaggedResponseBodyPhase)&&
  Objects.equals(this.sumWafLatencyResponseBodyPhase, objVserverL7MetricsObj.sumWafLatencyResponseBodyPhase)&&
  Objects.equals(this.avgWafLatencyResponseBodyPhase, objVserverL7MetricsObj.avgWafLatencyResponseBodyPhase)&&
  Objects.equals(this.avgWafMatched, objVserverL7MetricsObj.avgWafMatched)&&
  Objects.equals(this.avgWafEvaluated, objVserverL7MetricsObj.avgWafEvaluated)&&
  Objects.equals(this.avgWafRejected, objVserverL7MetricsObj.avgWafRejected)&&
  Objects.equals(this.sumWafRejected, objVserverL7MetricsObj.sumWafRejected)&&
  Objects.equals(this.avgWafFlagged, objVserverL7MetricsObj.avgWafFlagged)&&
  Objects.equals(this.sumWafFlagged, objVserverL7MetricsObj.sumWafFlagged)&&
  Objects.equals(this.pctWafMatched, objVserverL7MetricsObj.pctWafMatched)&&
  Objects.equals(this.pctWafRejected, objVserverL7MetricsObj.pctWafRejected)&&
  Objects.equals(this.pctWafFlagged, objVserverL7MetricsObj.pctWafFlagged)&&
  Objects.equals(this.pctWafEvaluated, objVserverL7MetricsObj.pctWafEvaluated)&&
  Objects.equals(this.avgWafAttacks, objVserverL7MetricsObj.avgWafAttacks)&&
  Objects.equals(this.sumWafAttacks, objVserverL7MetricsObj.sumWafAttacks)&&
  Objects.equals(this.pctWafAttacks, objVserverL7MetricsObj.pctWafAttacks)&&
  Objects.equals(this.sumWafDisabled, objVserverL7MetricsObj.sumWafDisabled)&&
  Objects.equals(this.avgWafDisabled, objVserverL7MetricsObj.avgWafDisabled)&&
  Objects.equals(this.pctWafDisabled, objVserverL7MetricsObj.pctWafDisabled)&&
  Objects.equals(this.sumHttpHeadersCount, objVserverL7MetricsObj.sumHttpHeadersCount)&&
  Objects.equals(this.avgHttpHeadersCount, objVserverL7MetricsObj.avgHttpHeadersCount)&&
  Objects.equals(this.sumHttpHeadersBytes, objVserverL7MetricsObj.sumHttpHeadersBytes)&&
  Objects.equals(this.avgHttpHeadersBytes, objVserverL7MetricsObj.avgHttpHeadersBytes)&&
  Objects.equals(this.pctGetReqs, objVserverL7MetricsObj.pctGetReqs)&&
  Objects.equals(this.pctPostReqs, objVserverL7MetricsObj.pctPostReqs)&&
  Objects.equals(this.sumHttpParamsCount, objVserverL7MetricsObj.sumHttpParamsCount)&&
  Objects.equals(this.avgHttpParamsCount, objVserverL7MetricsObj.avgHttpParamsCount)&&
  Objects.equals(this.sumUriLength, objVserverL7MetricsObj.sumUriLength)&&
  Objects.equals(this.avgUriLength, objVserverL7MetricsObj.avgUriLength)&&
  Objects.equals(this.sumPostBytes, objVserverL7MetricsObj.sumPostBytes)&&
  Objects.equals(this.avgPostBytes, objVserverL7MetricsObj.avgPostBytes)&&
  Objects.equals(this.sumReqsWithParams, objVserverL7MetricsObj.sumReqsWithParams)&&
  Objects.equals(this.avgParamsPerReq, objVserverL7MetricsObj.avgParamsPerReq)&&
  Objects.equals(this.avgTotalHttp2Requests, objVserverL7MetricsObj.avgTotalHttp2Requests)&&
  Objects.equals(this.avgSslVerTls13, objVserverL7MetricsObj.avgSslVerTls13);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VserverL7MetricsObj {\n");
      sb.append("    apdexr: ").append(toIndentedString(apdexr)).append("\n");
        sb.append("    avgApplicationResponseTime: ").append(toIndentedString(avgApplicationResponseTime)).append("\n");
        sb.append("    avgBlockingTime: ").append(toIndentedString(avgBlockingTime)).append("\n");
        sb.append("    avgBrowserRenderingTime: ").append(toIndentedString(avgBrowserRenderingTime)).append("\n");
        sb.append("    avgCacheBytes: ").append(toIndentedString(avgCacheBytes)).append("\n");
        sb.append("    avgCacheHits: ").append(toIndentedString(avgCacheHits)).append("\n");
        sb.append("    avgCacheableBytes: ").append(toIndentedString(avgCacheableBytes)).append("\n");
        sb.append("    avgCacheableHits: ").append(toIndentedString(avgCacheableHits)).append("\n");
        sb.append("    avgClientDataTransferTime: ").append(toIndentedString(avgClientDataTransferTime)).append("\n");
        sb.append("    avgClientRtt: ").append(toIndentedString(avgClientRtt)).append("\n");
        sb.append("    avgClientTxnLatency: ").append(toIndentedString(avgClientTxnLatency)).append("\n");
        sb.append("    avgCompleteResponses: ").append(toIndentedString(avgCompleteResponses)).append("\n");
        sb.append("    avgConnectionTime: ").append(toIndentedString(avgConnectionTime)).append("\n");
        sb.append("    avgDnsLookupTime: ").append(toIndentedString(avgDnsLookupTime)).append("\n");
        sb.append("    avgDomContentLoadTime: ").append(toIndentedString(avgDomContentLoadTime)).append("\n");
        sb.append("    avgErrorResponses: ").append(toIndentedString(avgErrorResponses)).append("\n");
        sb.append("    avgErrorsExcluded: ").append(toIndentedString(avgErrorsExcluded)).append("\n");
        sb.append("    avgFrustratedResponses: ").append(toIndentedString(avgFrustratedResponses)).append("\n");
        sb.append("    avgHttpHeadersBytes: ").append(toIndentedString(avgHttpHeadersBytes)).append("\n");
        sb.append("    avgHttpHeadersCount: ").append(toIndentedString(avgHttpHeadersCount)).append("\n");
        sb.append("    avgHttpParamsCount: ").append(toIndentedString(avgHttpParamsCount)).append("\n");
        sb.append("    avgPageDownloadTime: ").append(toIndentedString(avgPageDownloadTime)).append("\n");
        sb.append("    avgPageLoadTime: ").append(toIndentedString(avgPageLoadTime)).append("\n");
        sb.append("    avgParamsPerReq: ").append(toIndentedString(avgParamsPerReq)).append("\n");
        sb.append("    avgPostBytes: ").append(toIndentedString(avgPostBytes)).append("\n");
        sb.append("    avgPostCompressionBytes: ").append(toIndentedString(avgPostCompressionBytes)).append("\n");
        sb.append("    avgPreCompressionBytes: ").append(toIndentedString(avgPreCompressionBytes)).append("\n");
        sb.append("    avgRedirectionTime: ").append(toIndentedString(avgRedirectionTime)).append("\n");
        sb.append("    avgReqsPerSession: ").append(toIndentedString(avgReqsPerSession)).append("\n");
        sb.append("    avgResp1Xx: ").append(toIndentedString(avgResp1Xx)).append("\n");
        sb.append("    avgResp2Xx: ").append(toIndentedString(avgResp2Xx)).append("\n");
        sb.append("    avgResp3Xx: ").append(toIndentedString(avgResp3Xx)).append("\n");
        sb.append("    avgResp4Xx: ").append(toIndentedString(avgResp4Xx)).append("\n");
        sb.append("    avgResp4XxAviErrors: ").append(toIndentedString(avgResp4XxAviErrors)).append("\n");
        sb.append("    avgResp5Xx: ").append(toIndentedString(avgResp5Xx)).append("\n");
        sb.append("    avgResp5XxAviErrors: ").append(toIndentedString(avgResp5XxAviErrors)).append("\n");
        sb.append("    avgRumClientDataTransferTime: ").append(toIndentedString(avgRumClientDataTransferTime)).append("\n");
        sb.append("    avgSatisfactoryResponses: ").append(toIndentedString(avgSatisfactoryResponses)).append("\n");
        sb.append("    avgServerRtt: ").append(toIndentedString(avgServerRtt)).append("\n");
        sb.append("    avgServiceTime: ").append(toIndentedString(avgServiceTime)).append("\n");
        sb.append("    avgSslAuthDsa: ").append(toIndentedString(avgSslAuthDsa)).append("\n");
        sb.append("    avgSslAuthEcdsa: ").append(toIndentedString(avgSslAuthEcdsa)).append("\n");
        sb.append("    avgSslAuthRsa: ").append(toIndentedString(avgSslAuthRsa)).append("\n");
        sb.append("    avgSslConnections: ").append(toIndentedString(avgSslConnections)).append("\n");
        sb.append("    avgSslEcdsaNonPfs: ").append(toIndentedString(avgSslEcdsaNonPfs)).append("\n");
        sb.append("    avgSslEcdsaPfs: ").append(toIndentedString(avgSslEcdsaPfs)).append("\n");
        sb.append("    avgSslErrors: ").append(toIndentedString(avgSslErrors)).append("\n");
        sb.append("    avgSslFailedConnections: ").append(toIndentedString(avgSslFailedConnections)).append("\n");
        sb.append("    avgSslHandshakeNetworkErrors: ").append(toIndentedString(avgSslHandshakeNetworkErrors)).append("\n");
        sb.append("    avgSslHandshakeProtocolErrors: ").append(toIndentedString(avgSslHandshakeProtocolErrors)).append("\n");
        sb.append("    avgSslHandshakesNew: ").append(toIndentedString(avgSslHandshakesNew)).append("\n");
        sb.append("    avgSslHandshakesNonPfs: ").append(toIndentedString(avgSslHandshakesNonPfs)).append("\n");
        sb.append("    avgSslHandshakesPfs: ").append(toIndentedString(avgSslHandshakesPfs)).append("\n");
        sb.append("    avgSslHandshakesReused: ").append(toIndentedString(avgSslHandshakesReused)).append("\n");
        sb.append("    avgSslHandshakesTimedout: ").append(toIndentedString(avgSslHandshakesTimedout)).append("\n");
        sb.append("    avgSslKxDh: ").append(toIndentedString(avgSslKxDh)).append("\n");
        sb.append("    avgSslKxEcdh: ").append(toIndentedString(avgSslKxEcdh)).append("\n");
        sb.append("    avgSslKxRsa: ").append(toIndentedString(avgSslKxRsa)).append("\n");
        sb.append("    avgSslRsaNonPfs: ").append(toIndentedString(avgSslRsaNonPfs)).append("\n");
        sb.append("    avgSslRsaPfs: ").append(toIndentedString(avgSslRsaPfs)).append("\n");
        sb.append("    avgSslVerSsl30: ").append(toIndentedString(avgSslVerSsl30)).append("\n");
        sb.append("    avgSslVerTls10: ").append(toIndentedString(avgSslVerTls10)).append("\n");
        sb.append("    avgSslVerTls11: ").append(toIndentedString(avgSslVerTls11)).append("\n");
        sb.append("    avgSslVerTls12: ").append(toIndentedString(avgSslVerTls12)).append("\n");
        sb.append("    avgSslVerTls13: ").append(toIndentedString(avgSslVerTls13)).append("\n");
        sb.append("    avgToleratedResponses: ").append(toIndentedString(avgToleratedResponses)).append("\n");
        sb.append("    avgTotalHttp2Requests: ").append(toIndentedString(avgTotalHttp2Requests)).append("\n");
        sb.append("    avgTotalRequests: ").append(toIndentedString(avgTotalRequests)).append("\n");
        sb.append("    avgUriLength: ").append(toIndentedString(avgUriLength)).append("\n");
        sb.append("    avgWafAttacks: ").append(toIndentedString(avgWafAttacks)).append("\n");
        sb.append("    avgWafDisabled: ").append(toIndentedString(avgWafDisabled)).append("\n");
        sb.append("    avgWafEvaluated: ").append(toIndentedString(avgWafEvaluated)).append("\n");
        sb.append("    avgWafEvaluatedRequestBodyPhase: ").append(toIndentedString(avgWafEvaluatedRequestBodyPhase)).append("\n");
        sb.append("    avgWafEvaluatedRequestHeaderPhase: ").append(toIndentedString(avgWafEvaluatedRequestHeaderPhase)).append("\n");
        sb.append("    avgWafEvaluatedResponseBodyPhase: ").append(toIndentedString(avgWafEvaluatedResponseBodyPhase)).append("\n");
        sb.append("    avgWafEvaluatedResponseHeaderPhase: ").append(toIndentedString(avgWafEvaluatedResponseHeaderPhase)).append("\n");
        sb.append("    avgWafFlagged: ").append(toIndentedString(avgWafFlagged)).append("\n");
        sb.append("    avgWafFlaggedRequestBodyPhase: ").append(toIndentedString(avgWafFlaggedRequestBodyPhase)).append("\n");
        sb.append("    avgWafFlaggedRequestHeaderPhase: ").append(toIndentedString(avgWafFlaggedRequestHeaderPhase)).append("\n");
        sb.append("    avgWafFlaggedResponseBodyPhase: ").append(toIndentedString(avgWafFlaggedResponseBodyPhase)).append("\n");
        sb.append("    avgWafFlaggedResponseHeaderPhase: ").append(toIndentedString(avgWafFlaggedResponseHeaderPhase)).append("\n");
        sb.append("    avgWafLatencyRequestBodyPhase: ").append(toIndentedString(avgWafLatencyRequestBodyPhase)).append("\n");
        sb.append("    avgWafLatencyRequestHeaderPhase: ").append(toIndentedString(avgWafLatencyRequestHeaderPhase)).append("\n");
        sb.append("    avgWafLatencyResponseBodyPhase: ").append(toIndentedString(avgWafLatencyResponseBodyPhase)).append("\n");
        sb.append("    avgWafLatencyResponseHeaderPhase: ").append(toIndentedString(avgWafLatencyResponseHeaderPhase)).append("\n");
        sb.append("    avgWafMatched: ").append(toIndentedString(avgWafMatched)).append("\n");
        sb.append("    avgWafMatchedRequestBodyPhase: ").append(toIndentedString(avgWafMatchedRequestBodyPhase)).append("\n");
        sb.append("    avgWafMatchedRequestHeaderPhase: ").append(toIndentedString(avgWafMatchedRequestHeaderPhase)).append("\n");
        sb.append("    avgWafMatchedResponseBodyPhase: ").append(toIndentedString(avgWafMatchedResponseBodyPhase)).append("\n");
        sb.append("    avgWafMatchedResponseHeaderPhase: ").append(toIndentedString(avgWafMatchedResponseHeaderPhase)).append("\n");
        sb.append("    avgWafRejected: ").append(toIndentedString(avgWafRejected)).append("\n");
        sb.append("    avgWafRejectedRequestBodyPhase: ").append(toIndentedString(avgWafRejectedRequestBodyPhase)).append("\n");
        sb.append("    avgWafRejectedRequestHeaderPhase: ").append(toIndentedString(avgWafRejectedRequestHeaderPhase)).append("\n");
        sb.append("    avgWafRejectedResponseBodyPhase: ").append(toIndentedString(avgWafRejectedResponseBodyPhase)).append("\n");
        sb.append("    avgWafRejectedResponseHeaderPhase: ").append(toIndentedString(avgWafRejectedResponseHeaderPhase)).append("\n");
        sb.append("    avgWaitingTime: ").append(toIndentedString(avgWaitingTime)).append("\n");
        sb.append("    maxConcurrentSessions: ").append(toIndentedString(maxConcurrentSessions)).append("\n");
        sb.append("    maxSslOpenSessions: ").append(toIndentedString(maxSslOpenSessions)).append("\n");
        sb.append("    nodeObjId: ").append(toIndentedString(nodeObjId)).append("\n");
        sb.append("    pctCacheHits: ").append(toIndentedString(pctCacheHits)).append("\n");
        sb.append("    pctCacheableHits: ").append(toIndentedString(pctCacheableHits)).append("\n");
        sb.append("    pctGetReqs: ").append(toIndentedString(pctGetReqs)).append("\n");
        sb.append("    pctPostReqs: ").append(toIndentedString(pctPostReqs)).append("\n");
        sb.append("    pctResponseErrors: ").append(toIndentedString(pctResponseErrors)).append("\n");
        sb.append("    pctSslFailedConnections: ").append(toIndentedString(pctSslFailedConnections)).append("\n");
        sb.append("    pctWafAttacks: ").append(toIndentedString(pctWafAttacks)).append("\n");
        sb.append("    pctWafDisabled: ").append(toIndentedString(pctWafDisabled)).append("\n");
        sb.append("    pctWafEvaluated: ").append(toIndentedString(pctWafEvaluated)).append("\n");
        sb.append("    pctWafFlagged: ").append(toIndentedString(pctWafFlagged)).append("\n");
        sb.append("    pctWafMatched: ").append(toIndentedString(pctWafMatched)).append("\n");
        sb.append("    pctWafRejected: ").append(toIndentedString(pctWafRejected)).append("\n");
        sb.append("    rumApdexr: ").append(toIndentedString(rumApdexr)).append("\n");
        sb.append("    sslProtocolStrength: ").append(toIndentedString(sslProtocolStrength)).append("\n");
        sb.append("    sumApplicationResponseTime: ").append(toIndentedString(sumApplicationResponseTime)).append("\n");
        sb.append("    sumBlockingTime: ").append(toIndentedString(sumBlockingTime)).append("\n");
        sb.append("    sumBrowserRenderingTime: ").append(toIndentedString(sumBrowserRenderingTime)).append("\n");
        sb.append("    sumClientDataTransferTime: ").append(toIndentedString(sumClientDataTransferTime)).append("\n");
        sb.append("    sumClientRtt: ").append(toIndentedString(sumClientRtt)).append("\n");
        sb.append("    sumConnectionTime: ").append(toIndentedString(sumConnectionTime)).append("\n");
        sb.append("    sumDnsLookupTime: ").append(toIndentedString(sumDnsLookupTime)).append("\n");
        sb.append("    sumDomContentLoadTime: ").append(toIndentedString(sumDomContentLoadTime)).append("\n");
        sb.append("    sumErrors: ").append(toIndentedString(sumErrors)).append("\n");
        sb.append("    sumFinishedSessions: ").append(toIndentedString(sumFinishedSessions)).append("\n");
        sb.append("    sumGetClientTxnLatency: ").append(toIndentedString(sumGetClientTxnLatency)).append("\n");
        sb.append("    sumGetClientTxnLatencyBucket1: ").append(toIndentedString(sumGetClientTxnLatencyBucket1)).append("\n");
        sb.append("    sumGetClientTxnLatencyBucket2: ").append(toIndentedString(sumGetClientTxnLatencyBucket2)).append("\n");
        sb.append("    sumGetReqs: ").append(toIndentedString(sumGetReqs)).append("\n");
        sb.append("    sumHttpHeadersBytes: ").append(toIndentedString(sumHttpHeadersBytes)).append("\n");
        sb.append("    sumHttpHeadersCount: ").append(toIndentedString(sumHttpHeadersCount)).append("\n");
        sb.append("    sumHttpParamsCount: ").append(toIndentedString(sumHttpParamsCount)).append("\n");
        sb.append("    sumNumPageLoadTimeBucket1: ").append(toIndentedString(sumNumPageLoadTimeBucket1)).append("\n");
        sb.append("    sumNumPageLoadTimeBucket2: ").append(toIndentedString(sumNumPageLoadTimeBucket2)).append("\n");
        sb.append("    sumNumRumSamples: ").append(toIndentedString(sumNumRumSamples)).append("\n");
        sb.append("    sumOtherClientTxnLatency: ").append(toIndentedString(sumOtherClientTxnLatency)).append("\n");
        sb.append("    sumOtherClientTxnLatencyBucket1: ").append(toIndentedString(sumOtherClientTxnLatencyBucket1)).append("\n");
        sb.append("    sumOtherClientTxnLatencyBucket2: ").append(toIndentedString(sumOtherClientTxnLatencyBucket2)).append("\n");
        sb.append("    sumOtherReqs: ").append(toIndentedString(sumOtherReqs)).append("\n");
        sb.append("    sumPageDownloadTime: ").append(toIndentedString(sumPageDownloadTime)).append("\n");
        sb.append("    sumPageLoadTime: ").append(toIndentedString(sumPageLoadTime)).append("\n");
        sb.append("    sumPostBytes: ").append(toIndentedString(sumPostBytes)).append("\n");
        sb.append("    sumPostClientTxnLatency: ").append(toIndentedString(sumPostClientTxnLatency)).append("\n");
        sb.append("    sumPostClientTxnLatencyBucket1: ").append(toIndentedString(sumPostClientTxnLatencyBucket1)).append("\n");
        sb.append("    sumPostClientTxnLatencyBucket2: ").append(toIndentedString(sumPostClientTxnLatencyBucket2)).append("\n");
        sb.append("    sumPostReqs: ").append(toIndentedString(sumPostReqs)).append("\n");
        sb.append("    sumRedirectionTime: ").append(toIndentedString(sumRedirectionTime)).append("\n");
        sb.append("    sumReqsFinishedSessions: ").append(toIndentedString(sumReqsFinishedSessions)).append("\n");
        sb.append("    sumReqsWithParams: ").append(toIndentedString(sumReqsWithParams)).append("\n");
        sb.append("    sumResp1Xx: ").append(toIndentedString(sumResp1Xx)).append("\n");
        sb.append("    sumResp2Xx: ").append(toIndentedString(sumResp2Xx)).append("\n");
        sb.append("    sumResp3Xx: ").append(toIndentedString(sumResp3Xx)).append("\n");
        sb.append("    sumResp4Xx: ").append(toIndentedString(sumResp4Xx)).append("\n");
        sb.append("    sumResp5Xx: ").append(toIndentedString(sumResp5Xx)).append("\n");
        sb.append("    sumRumClientDataTransferTime: ").append(toIndentedString(sumRumClientDataTransferTime)).append("\n");
        sb.append("    sumServerRtt: ").append(toIndentedString(sumServerRtt)).append("\n");
        sb.append("    sumServiceTime: ").append(toIndentedString(sumServiceTime)).append("\n");
        sb.append("    sumTotalResponses: ").append(toIndentedString(sumTotalResponses)).append("\n");
        sb.append("    sumUriLength: ").append(toIndentedString(sumUriLength)).append("\n");
        sb.append("    sumWafAttacks: ").append(toIndentedString(sumWafAttacks)).append("\n");
        sb.append("    sumWafDisabled: ").append(toIndentedString(sumWafDisabled)).append("\n");
        sb.append("    sumWafEvaluatedRequestBodyPhase: ").append(toIndentedString(sumWafEvaluatedRequestBodyPhase)).append("\n");
        sb.append("    sumWafEvaluatedRequestHeaderPhase: ").append(toIndentedString(sumWafEvaluatedRequestHeaderPhase)).append("\n");
        sb.append("    sumWafEvaluatedResponseBodyPhase: ").append(toIndentedString(sumWafEvaluatedResponseBodyPhase)).append("\n");
        sb.append("    sumWafEvaluatedResponseHeaderPhase: ").append(toIndentedString(sumWafEvaluatedResponseHeaderPhase)).append("\n");
        sb.append("    sumWafFlagged: ").append(toIndentedString(sumWafFlagged)).append("\n");
        sb.append("    sumWafFlaggedRequestBodyPhase: ").append(toIndentedString(sumWafFlaggedRequestBodyPhase)).append("\n");
        sb.append("    sumWafFlaggedRequestHeaderPhase: ").append(toIndentedString(sumWafFlaggedRequestHeaderPhase)).append("\n");
        sb.append("    sumWafFlaggedResponseBodyPhase: ").append(toIndentedString(sumWafFlaggedResponseBodyPhase)).append("\n");
        sb.append("    sumWafFlaggedResponseHeaderPhase: ").append(toIndentedString(sumWafFlaggedResponseHeaderPhase)).append("\n");
        sb.append("    sumWafLatencyRequestBodyPhase: ").append(toIndentedString(sumWafLatencyRequestBodyPhase)).append("\n");
        sb.append("    sumWafLatencyRequestHeaderPhase: ").append(toIndentedString(sumWafLatencyRequestHeaderPhase)).append("\n");
        sb.append("    sumWafLatencyResponseBodyPhase: ").append(toIndentedString(sumWafLatencyResponseBodyPhase)).append("\n");
        sb.append("    sumWafLatencyResponseHeaderPhase: ").append(toIndentedString(sumWafLatencyResponseHeaderPhase)).append("\n");
        sb.append("    sumWafMatchedRequestBodyPhase: ").append(toIndentedString(sumWafMatchedRequestBodyPhase)).append("\n");
        sb.append("    sumWafMatchedRequestHeaderPhase: ").append(toIndentedString(sumWafMatchedRequestHeaderPhase)).append("\n");
        sb.append("    sumWafMatchedResponseBodyPhase: ").append(toIndentedString(sumWafMatchedResponseBodyPhase)).append("\n");
        sb.append("    sumWafMatchedResponseHeaderPhase: ").append(toIndentedString(sumWafMatchedResponseHeaderPhase)).append("\n");
        sb.append("    sumWafRejected: ").append(toIndentedString(sumWafRejected)).append("\n");
        sb.append("    sumWafRejectedRequestBodyPhase: ").append(toIndentedString(sumWafRejectedRequestBodyPhase)).append("\n");
        sb.append("    sumWafRejectedRequestHeaderPhase: ").append(toIndentedString(sumWafRejectedRequestHeaderPhase)).append("\n");
        sb.append("    sumWafRejectedResponseBodyPhase: ").append(toIndentedString(sumWafRejectedResponseBodyPhase)).append("\n");
        sb.append("    sumWafRejectedResponseHeaderPhase: ").append(toIndentedString(sumWafRejectedResponseHeaderPhase)).append("\n");
        sb.append("    sumWaitingTime: ").append(toIndentedString(sumWaitingTime)).append("\n");
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

