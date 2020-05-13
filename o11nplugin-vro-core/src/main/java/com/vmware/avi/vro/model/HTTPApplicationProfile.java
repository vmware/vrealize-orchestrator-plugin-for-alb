package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CompressionProfile;
import com.vmware.avi.vro.model.HTTP2ApplicationProfile;
import com.vmware.avi.vro.model.HttpCacheConfig;
import com.vmware.avi.vro.model.SSLClientCertificateAction;
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
 * HTTPApplicationProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPApplicationProfile")
@VsoFinder(name = Constants.FINDER_VRO_HTTPAPPLICATIONPROFILE, idAccessor = "getObjectID()")
@Service
public class HTTPApplicationProfile extends AviRestResource  {
  @JsonProperty("allow_dots_in_header_name")
  private Boolean allowDotsInHeaderName = null;

  @JsonProperty("cache_config")
  private HttpCacheConfig cacheConfig = null;

  @JsonProperty("client_body_timeout")
  private Integer clientBodyTimeout = 30000;

  @JsonProperty("client_header_timeout")
  private Integer clientHeaderTimeout = 10000;

  @JsonProperty("client_max_body_size")
  private Long clientMaxBodySize = null;

  @JsonProperty("client_max_header_size")
  private Integer clientMaxHeaderSize = 12;

  @JsonProperty("client_max_request_size")
  private Integer clientMaxRequestSize = 48;

  @JsonProperty("compression_profile")
  private CompressionProfile compressionProfile = null;

  @JsonProperty("connection_multiplexing_enabled")
  private Boolean connectionMultiplexingEnabled = true;

  @JsonProperty("disable_keepalive_posts_msie6")
  private Boolean disableKeepalivePostsMsie6 = true;

  @JsonProperty("disable_sni_hostname_check")
  private Boolean disableSniHostnameCheck = null;

  @JsonProperty("enable_chunk_merge")
  private Boolean enableChunkMerge = true;

  @JsonProperty("enable_fire_and_forget")
  private Boolean enableFireAndForget = null;

  @JsonProperty("enable_request_body_buffering")
  private Boolean enableRequestBodyBuffering = null;

  @JsonProperty("enable_request_body_metrics")
  private Boolean enableRequestBodyMetrics = null;

  @JsonProperty("fwd_close_hdr_for_bound_connections")
  private Boolean fwdCloseHdrForBoundConnections = true;

  @JsonProperty("hsts_enabled")
  private Boolean hstsEnabled = null;

  @JsonProperty("hsts_max_age")
  private Long hstsMaxAge = 365l;

  @JsonProperty("hsts_subdomains_enabled")
  private Boolean hstsSubdomainsEnabled = true;

  @JsonProperty("http2_enabled")
  private Boolean http2Enabled = null;

  @JsonProperty("http2_profile")
  private HTTP2ApplicationProfile http2Profile = null;

  @JsonProperty("http_to_https")
  private Boolean httpToHttps = null;

  @JsonProperty("http_upstream_buffer_size")
  private Integer httpUpstreamBufferSize = null;

  @JsonProperty("httponly_enabled")
  private Boolean httponlyEnabled = null;

  @JsonProperty("keepalive_header")
  private Boolean keepaliveHeader = null;

  @JsonProperty("keepalive_timeout")
  private Integer keepaliveTimeout = 30000;

  @JsonProperty("max_bad_rps_cip")
  private Integer maxBadRpsCip = null;

  @JsonProperty("max_bad_rps_cip_uri")
  private Integer maxBadRpsCipUri = null;

  @JsonProperty("max_bad_rps_uri")
  private Integer maxBadRpsUri = null;

  @JsonProperty("max_http2_concurrent_streams_per_connection")
  private Integer maxHttp2ConcurrentStreamsPerConnection = null;

  @JsonProperty("max_http2_control_frames_per_connection")
  private Integer maxHttp2ControlFramesPerConnection = null;

  @JsonProperty("max_http2_empty_data_frames_per_connection")
  private Integer maxHttp2EmptyDataFramesPerConnection = null;

  @JsonProperty("max_http2_queued_frames_to_client_per_connection")
  private Integer maxHttp2QueuedFramesToClientPerConnection = null;

  @JsonProperty("max_keepalive_requests")
  private Integer maxKeepaliveRequests = 100;

  @JsonProperty("max_response_headers_size")
  private Integer maxResponseHeadersSize = 48;

  @JsonProperty("max_rps_cip")
  private Integer maxRpsCip = null;

  @JsonProperty("max_rps_cip_uri")
  private Integer maxRpsCipUri = null;

  @JsonProperty("max_rps_unknown_cip")
  private Integer maxRpsUnknownCip = null;

  @JsonProperty("max_rps_unknown_uri")
  private Integer maxRpsUnknownUri = null;

  @JsonProperty("max_rps_uri")
  private Integer maxRpsUri = null;

  @JsonProperty("pki_profile_ref")
  private String pkiProfileRef = null;

  @JsonProperty("post_accept_timeout")
  private Integer postAcceptTimeout = 30000;

  @JsonProperty("reset_conn_http_on_ssl_port")
  private Boolean resetConnHttpOnSslPort = null;

  @JsonProperty("respond_with_100_continue")
  private Boolean respondWith100Continue = true;

  @JsonProperty("secure_cookie_enabled")
  private Boolean secureCookieEnabled = null;

  @JsonProperty("server_side_redirect_to_https")
  private Boolean serverSideRedirectToHttps = null;

  @JsonProperty("spdy_enabled")
  private Boolean spdyEnabled = null;

  @JsonProperty("spdy_fwd_proxy_mode")
  private Boolean spdyFwdProxyMode = null;

  @JsonProperty("ssl_client_certificate_action")
  private SSLClientCertificateAction sslClientCertificateAction = null;

  @JsonProperty("ssl_client_certificate_mode")
  private String sslClientCertificateMode = "SSL_CLIENT_CERTIFICATE_NONE";

  @JsonProperty("ssl_everywhere_enabled")
  private Boolean sslEverywhereEnabled = null;

  @JsonProperty("use_app_keepalive_timeout")
  private Boolean useAppKeepaliveTimeout = null;

  @JsonProperty("websockets_enabled")
  private Boolean websocketsEnabled = true;

  @JsonProperty("x_forwarded_proto_enabled")
  private Boolean xForwardedProtoEnabled = null;

  @JsonProperty("xff_alternate_name")
  private String xffAlternateName = "X-Forwarded-For";

  @JsonProperty("xff_enabled")
  private Boolean xffEnabled = true;

  
  /**
   * Allow use of dot (.) in HTTP header names, for instance Header.app.special  PickAppVersionX.
   * @return allowDotsInHeaderName
  **/
  @ApiModelProperty(value = "Allow use of dot (.) in HTTP header names, for instance Header.app.special  PickAppVersionX.")


 
  @VsoMethod  
  public Boolean isAllowDotsInHeaderName() {
    return allowDotsInHeaderName;
  }
    
  @VsoMethod
  public void setAllowDotsInHeaderName(Boolean allowDotsInHeaderName) {
    this.allowDotsInHeaderName = allowDotsInHeaderName;
  }

  
  /**
   * HTTP Caching config to use with this HTTP Profile.
   * @return cacheConfig
  **/
  @ApiModelProperty(value = "HTTP Caching config to use with this HTTP Profile.")

  @Valid

 
  @VsoMethod  
  public HttpCacheConfig getCacheConfig() {
    return cacheConfig;
  }
    
  @VsoMethod
  public void setCacheConfig(HttpCacheConfig cacheConfig) {
    this.cacheConfig = cacheConfig;
  }

  
  /**
   * The maximum length of time allowed between consecutive read operations for a client request body. The value '0' specifies no timeout. This setting generally impacts the length of time allowed for a client to send a POST. Allowed values are 0-100000000.
   * @return clientBodyTimeout
  **/
  @ApiModelProperty(value = "The maximum length of time allowed between consecutive read operations for a client request body. The value '0' specifies no timeout. This setting generally impacts the length of time allowed for a client to send a POST. Allowed values are 0-100000000.")


 
  @VsoMethod  
  public Integer getClientBodyTimeout() {
    return clientBodyTimeout;
  }
    
  @VsoMethod
  public void setClientBodyTimeout(Integer clientBodyTimeout) {
    this.clientBodyTimeout = clientBodyTimeout;
  }

  
  /**
   * The maximum length of time allowed for a client to transmit an entire request header. This helps mitigate various forms of SlowLoris attacks. Allowed values are 10-100000000.
   * @return clientHeaderTimeout
  **/
  @ApiModelProperty(value = "The maximum length of time allowed for a client to transmit an entire request header. This helps mitigate various forms of SlowLoris attacks. Allowed values are 10-100000000.")


 
  @VsoMethod  
  public Integer getClientHeaderTimeout() {
    return clientHeaderTimeout;
  }
    
  @VsoMethod
  public void setClientHeaderTimeout(Integer clientHeaderTimeout) {
    this.clientHeaderTimeout = clientHeaderTimeout;
  }

  
  /**
   * Maximum size for the client request body.  This limits the size of the client data that can be uploaded/posted as part of a single HTTP Request.  Default 0 => Unlimited.
   * @return clientMaxBodySize
  **/
  @ApiModelProperty(value = "Maximum size for the client request body.  This limits the size of the client data that can be uploaded/posted as part of a single HTTP Request.  Default 0 => Unlimited.")


 
  @VsoMethod  
  public Long getClientMaxBodySize() {
    return clientMaxBodySize;
  }
    
  @VsoMethod
  public void setClientMaxBodySize(Long clientMaxBodySize) {
    this.clientMaxBodySize = clientMaxBodySize;
  }

  
  /**
   * Maximum size in Kbytes of a single HTTP header in the client request. Allowed values are 1-64.
   * @return clientMaxHeaderSize
  **/
  @ApiModelProperty(value = "Maximum size in Kbytes of a single HTTP header in the client request. Allowed values are 1-64.")


 
  @VsoMethod  
  public Integer getClientMaxHeaderSize() {
    return clientMaxHeaderSize;
  }
    
  @VsoMethod
  public void setClientMaxHeaderSize(Integer clientMaxHeaderSize) {
    this.clientMaxHeaderSize = clientMaxHeaderSize;
  }

  
  /**
   * Maximum size in Kbytes of all the client HTTP request headers. Allowed values are 1-256.
   * @return clientMaxRequestSize
  **/
  @ApiModelProperty(value = "Maximum size in Kbytes of all the client HTTP request headers. Allowed values are 1-256.")


 
  @VsoMethod  
  public Integer getClientMaxRequestSize() {
    return clientMaxRequestSize;
  }
    
  @VsoMethod
  public void setClientMaxRequestSize(Integer clientMaxRequestSize) {
    this.clientMaxRequestSize = clientMaxRequestSize;
  }

  
  /**
   * HTTP Compression settings to use with this HTTP Profile.
   * @return compressionProfile
  **/
  @ApiModelProperty(value = "HTTP Compression settings to use with this HTTP Profile.")

  @Valid

 
  @VsoMethod  
  public CompressionProfile getCompressionProfile() {
    return compressionProfile;
  }
    
  @VsoMethod
  public void setCompressionProfile(CompressionProfile compressionProfile) {
    this.compressionProfile = compressionProfile;
  }

  
  /**
   * Allows HTTP requests, not just TCP connections, to be load balanced across servers.  Proxied TCP connections to servers may be reused by multiple clients to improve performance. Not compatible with Preserve Client IP.
   * @return connectionMultiplexingEnabled
  **/
  @ApiModelProperty(value = "Allows HTTP requests, not just TCP connections, to be load balanced across servers.  Proxied TCP connections to servers may be reused by multiple clients to improve performance. Not compatible with Preserve Client IP.")


 
  @VsoMethod  
  public Boolean isConnectionMultiplexingEnabled() {
    return connectionMultiplexingEnabled;
  }
    
  @VsoMethod
  public void setConnectionMultiplexingEnabled(Boolean connectionMultiplexingEnabled) {
    this.connectionMultiplexingEnabled = connectionMultiplexingEnabled;
  }

  
  /**
   * Disable keep-alive client side connections for older browsers based off MS Internet Explorer 6.0 (MSIE6). For some applications, this might break NTLM authentication for older clients based off MSIE6. For such applications, set this option to false to allow keep-alive connections.
   * @return disableKeepalivePostsMsie6
  **/
  @ApiModelProperty(value = "Disable keep-alive client side connections for older browsers based off MS Internet Explorer 6.0 (MSIE6). For some applications, this might break NTLM authentication for older clients based off MSIE6. For such applications, set this option to false to allow keep-alive connections.")


 
  @VsoMethod  
  public Boolean isDisableKeepalivePostsMsie6() {
    return disableKeepalivePostsMsie6;
  }
    
  @VsoMethod
  public void setDisableKeepalivePostsMsie6(Boolean disableKeepalivePostsMsie6) {
    this.disableKeepalivePostsMsie6 = disableKeepalivePostsMsie6;
  }

  
  /**
   * Disable strict check between TLS servername and HTTP Host name. Field introduced in 18.2.5.
   * @return disableSniHostnameCheck
  **/
  @ApiModelProperty(value = "Disable strict check between TLS servername and HTTP Host name. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isDisableSniHostnameCheck() {
    return disableSniHostnameCheck;
  }
    
  @VsoMethod
  public void setDisableSniHostnameCheck(Boolean disableSniHostnameCheck) {
    this.disableSniHostnameCheck = disableSniHostnameCheck;
  }

  
  /**
   * Enable chunk body merge for chunked transfer encoding response. Field introduced in 18.2.7.
   * @return enableChunkMerge
  **/
  @ApiModelProperty(value = "Enable chunk body merge for chunked transfer encoding response. Field introduced in 18.2.7.")


 
  @VsoMethod  
  public Boolean isEnableChunkMerge() {
    return enableChunkMerge;
  }
    
  @VsoMethod
  public void setEnableChunkMerge(Boolean enableChunkMerge) {
    this.enableChunkMerge = enableChunkMerge;
  }

  
  /**
   * Enable support for fire and forget feature. If enabled, request from client is forwarded to server even if client prematurely closes the connection. Field introduced in 17.2.4.
   * @return enableFireAndForget
  **/
  @ApiModelProperty(value = "Enable support for fire and forget feature. If enabled, request from client is forwarded to server even if client prematurely closes the connection. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public Boolean isEnableFireAndForget() {
    return enableFireAndForget;
  }
    
  @VsoMethod
  public void setEnableFireAndForget(Boolean enableFireAndForget) {
    this.enableFireAndForget = enableFireAndForget;
  }

  
  /**
   * Enable request body buffering for POST requests. If enabled, max buffer size is set to lower of 32M or the value (non-zero) configured in client_max_body_size.
   * @return enableRequestBodyBuffering
  **/
  @ApiModelProperty(value = "Enable request body buffering for POST requests. If enabled, max buffer size is set to lower of 32M or the value (non-zero) configured in client_max_body_size.")


 
  @VsoMethod  
  public Boolean isEnableRequestBodyBuffering() {
    return enableRequestBodyBuffering;
  }
    
  @VsoMethod
  public void setEnableRequestBodyBuffering(Boolean enableRequestBodyBuffering) {
    this.enableRequestBodyBuffering = enableRequestBodyBuffering;
  }

  
  /**
   * Enable HTTP request body metrics. If enabled, requests from clients are parsed and relevant statistics about them are gathered. Currently, it processes HTTP POST requests with Content-Type application/x-www-form-urlencoded or multipart/form-data, and adds the number of detected parameters to the l7_client.http_params_count. This is an experimental feature and it may have performance impact. Use it when detailed information about the number of HTTP POST parameters is needed, e.g. for WAF sizing. Field introduced in 18.1.5, 18.2.1.
   * @return enableRequestBodyMetrics
  **/
  @ApiModelProperty(value = "Enable HTTP request body metrics. If enabled, requests from clients are parsed and relevant statistics about them are gathered. Currently, it processes HTTP POST requests with Content-Type application/x-www-form-urlencoded or multipart/form-data, and adds the number of detected parameters to the l7_client.http_params_count. This is an experimental feature and it may have performance impact. Use it when detailed information about the number of HTTP POST parameters is needed, e.g. for WAF sizing. Field introduced in 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public Boolean isEnableRequestBodyMetrics() {
    return enableRequestBodyMetrics;
  }
    
  @VsoMethod
  public void setEnableRequestBodyMetrics(Boolean enableRequestBodyMetrics) {
    this.enableRequestBodyMetrics = enableRequestBodyMetrics;
  }

  
  /**
   * Forward the Connection  Close header coming from backend server to the client if connection-switching is enabled, i.e. front-end and backend connections are bound together. Field introduced in 18.2.3.
   * @return fwdCloseHdrForBoundConnections
  **/
  @ApiModelProperty(value = "Forward the Connection  Close header coming from backend server to the client if connection-switching is enabled, i.e. front-end and backend connections are bound together. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isFwdCloseHdrForBoundConnections() {
    return fwdCloseHdrForBoundConnections;
  }
    
  @VsoMethod
  public void setFwdCloseHdrForBoundConnections(Boolean fwdCloseHdrForBoundConnections) {
    this.fwdCloseHdrForBoundConnections = fwdCloseHdrForBoundConnections;
  }

  
  /**
   * Inserts HTTP Strict-Transport-Security header in the HTTPS response.  HSTS can help mitigate man-in-the-middle attacks by telling browsers that support HSTS that they should only access this site via HTTPS.
   * @return hstsEnabled
  **/
  @ApiModelProperty(value = "Inserts HTTP Strict-Transport-Security header in the HTTPS response.  HSTS can help mitigate man-in-the-middle attacks by telling browsers that support HSTS that they should only access this site via HTTPS.")


 
  @VsoMethod  
  public Boolean isHstsEnabled() {
    return hstsEnabled;
  }
    
  @VsoMethod
  public void setHstsEnabled(Boolean hstsEnabled) {
    this.hstsEnabled = hstsEnabled;
  }

  
  /**
   * Number of days for which the client should regard this virtual service as a known HSTS host. Allowed values are 0-10000.
   * @return hstsMaxAge
  **/
  @ApiModelProperty(value = "Number of days for which the client should regard this virtual service as a known HSTS host. Allowed values are 0-10000.")


 
  @VsoMethod  
  public Long getHstsMaxAge() {
    return hstsMaxAge;
  }
    
  @VsoMethod
  public void setHstsMaxAge(Long hstsMaxAge) {
    this.hstsMaxAge = hstsMaxAge;
  }

  
  /**
   * Insert the 'includeSubdomains' directive in the HTTP Strict-Transport-Security header. Adding the includeSubdomains directive signals the User-Agent that the HSTS Policy applies to this HSTS Host as well as any subdomains of the host's domain name. Field introduced in 17.2.13, 18.1.4, 18.2.1.
   * @return hstsSubdomainsEnabled
  **/
  @ApiModelProperty(value = "Insert the 'includeSubdomains' directive in the HTTP Strict-Transport-Security header. Adding the includeSubdomains directive signals the User-Agent that the HSTS Policy applies to this HSTS Host as well as any subdomains of the host's domain name. Field introduced in 17.2.13, 18.1.4, 18.2.1.")


 
  @VsoMethod  
  public Boolean isHstsSubdomainsEnabled() {
    return hstsSubdomainsEnabled;
  }
    
  @VsoMethod
  public void setHstsSubdomainsEnabled(Boolean hstsSubdomainsEnabled) {
    this.hstsSubdomainsEnabled = hstsSubdomainsEnabled;
  }

  
  /**
   * Enable HTTP2 for traffic from clients to the virtual service. Field deprecated in 20.1.1. Field introduced in 18.1.1.
   * @return http2Enabled
  **/
  @ApiModelProperty(value = "Enable HTTP2 for traffic from clients to the virtual service. Field deprecated in 20.1.1. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Boolean isHttp2Enabled() {
    return http2Enabled;
  }
    
  @VsoMethod
  public void setHttp2Enabled(Boolean http2Enabled) {
    this.http2Enabled = http2Enabled;
  }

  
  /**
   * Specifies the HTTP/2 specific application profile parameters. Field introduced in 20.1.1.
   * @return http2Profile
  **/
  @ApiModelProperty(value = "Specifies the HTTP/2 specific application profile parameters. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public HTTP2ApplicationProfile getHttp2Profile() {
    return http2Profile;
  }
    
  @VsoMethod
  public void setHttp2Profile(HTTP2ApplicationProfile http2Profile) {
    this.http2Profile = http2Profile;
  }

  
  /**
   * Client requests received via HTTP will be redirected to HTTPS.
   * @return httpToHttps
  **/
  @ApiModelProperty(value = "Client requests received via HTTP will be redirected to HTTPS.")


 
  @VsoMethod  
  public Boolean isHttpToHttps() {
    return httpToHttps;
  }
    
  @VsoMethod
  public void setHttpToHttps(Boolean httpToHttps) {
    this.httpToHttps = httpToHttps;
  }

  
  /**
   * Size of HTTP buffer in kB. Allowed values are 1-256. Special values are 0- 'Auto compute the size of buffer'. Field introduced in 20.1.1.
   * @return httpUpstreamBufferSize
  **/
  @ApiModelProperty(value = "Size of HTTP buffer in kB. Allowed values are 1-256. Special values are 0- 'Auto compute the size of buffer'. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getHttpUpstreamBufferSize() {
    return httpUpstreamBufferSize;
  }
    
  @VsoMethod
  public void setHttpUpstreamBufferSize(Integer httpUpstreamBufferSize) {
    this.httpUpstreamBufferSize = httpUpstreamBufferSize;
  }

  
  /**
   * Mark HTTP cookies as HTTPonly.  This helps mitigate cross site scripting attacks as browsers will not allow these cookies to be read by third parties, such as javascript.
   * @return httponlyEnabled
  **/
  @ApiModelProperty(value = "Mark HTTP cookies as HTTPonly.  This helps mitigate cross site scripting attacks as browsers will not allow these cookies to be read by third parties, such as javascript.")


 
  @VsoMethod  
  public Boolean isHttponlyEnabled() {
    return httponlyEnabled;
  }
    
  @VsoMethod
  public void setHttponlyEnabled(Boolean httponlyEnabled) {
    this.httponlyEnabled = httponlyEnabled;
  }

  
  /**
   * Send HTTP 'Keep-Alive' header to the client. By default, the timeout specified in the 'Keep-Alive Timeout' field will be used unless the 'Use App Keepalive Timeout' flag is set, in which case the timeout sent by the application will be honored.
   * @return keepaliveHeader
  **/
  @ApiModelProperty(value = "Send HTTP 'Keep-Alive' header to the client. By default, the timeout specified in the 'Keep-Alive Timeout' field will be used unless the 'Use App Keepalive Timeout' flag is set, in which case the timeout sent by the application will be honored.")


 
  @VsoMethod  
  public Boolean isKeepaliveHeader() {
    return keepaliveHeader;
  }
    
  @VsoMethod
  public void setKeepaliveHeader(Boolean keepaliveHeader) {
    this.keepaliveHeader = keepaliveHeader;
  }

  
  /**
   * The max idle time allowed between HTTP requests over a Keep-alive connection. Allowed values are 10-100000000.
   * @return keepaliveTimeout
  **/
  @ApiModelProperty(value = "The max idle time allowed between HTTP requests over a Keep-alive connection. Allowed values are 10-100000000.")


 
  @VsoMethod  
  public Integer getKeepaliveTimeout() {
    return keepaliveTimeout;
  }
    
  @VsoMethod
  public void setKeepaliveTimeout(Integer keepaliveTimeout) {
    this.keepaliveTimeout = keepaliveTimeout;
  }

  
  /**
   * Maximum bad requests per second per client IP. Allowed values are 10-1000. Special values are 0- 'unlimited'.
   * @return maxBadRpsCip
  **/
  @ApiModelProperty(value = "Maximum bad requests per second per client IP. Allowed values are 10-1000. Special values are 0- 'unlimited'.")


 
  @VsoMethod  
  public Integer getMaxBadRpsCip() {
    return maxBadRpsCip;
  }
    
  @VsoMethod
  public void setMaxBadRpsCip(Integer maxBadRpsCip) {
    this.maxBadRpsCip = maxBadRpsCip;
  }

  
  /**
   * Maximum bad requests per second per client IP and URI. Allowed values are 10-1000. Special values are 0- 'unlimited'.
   * @return maxBadRpsCipUri
  **/
  @ApiModelProperty(value = "Maximum bad requests per second per client IP and URI. Allowed values are 10-1000. Special values are 0- 'unlimited'.")


 
  @VsoMethod  
  public Integer getMaxBadRpsCipUri() {
    return maxBadRpsCipUri;
  }
    
  @VsoMethod
  public void setMaxBadRpsCipUri(Integer maxBadRpsCipUri) {
    this.maxBadRpsCipUri = maxBadRpsCipUri;
  }

  
  /**
   * Maximum bad requests per second per URI. Allowed values are 10-1000. Special values are 0- 'unlimited'.
   * @return maxBadRpsUri
  **/
  @ApiModelProperty(value = "Maximum bad requests per second per URI. Allowed values are 10-1000. Special values are 0- 'unlimited'.")


 
  @VsoMethod  
  public Integer getMaxBadRpsUri() {
    return maxBadRpsUri;
  }
    
  @VsoMethod
  public void setMaxBadRpsUri(Integer maxBadRpsUri) {
    this.maxBadRpsUri = maxBadRpsUri;
  }

  
  /**
   * The max number of concurrent streams over a client side HTTP/2 connection. Allowed values are 1-256. Field deprecated in 20.1.1. Field introduced in 18.2.6.
   * @return maxHttp2ConcurrentStreamsPerConnection
  **/
  @ApiModelProperty(value = "The max number of concurrent streams over a client side HTTP/2 connection. Allowed values are 1-256. Field deprecated in 20.1.1. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getMaxHttp2ConcurrentStreamsPerConnection() {
    return maxHttp2ConcurrentStreamsPerConnection;
  }
    
  @VsoMethod
  public void setMaxHttp2ConcurrentStreamsPerConnection(Integer maxHttp2ConcurrentStreamsPerConnection) {
    this.maxHttp2ConcurrentStreamsPerConnection = maxHttp2ConcurrentStreamsPerConnection;
  }

  
  /**
   * The max number of control frames that client can send over an HTTP/2 connection. '0' means unlimited. Allowed values are 0-10000. Special values are 0- 'Unlimited control frames on a client side HTTP/2 connection'. Field deprecated in 20.1.1. Field introduced in 18.2.6.
   * @return maxHttp2ControlFramesPerConnection
  **/
  @ApiModelProperty(value = "The max number of control frames that client can send over an HTTP/2 connection. '0' means unlimited. Allowed values are 0-10000. Special values are 0- 'Unlimited control frames on a client side HTTP/2 connection'. Field deprecated in 20.1.1. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getMaxHttp2ControlFramesPerConnection() {
    return maxHttp2ControlFramesPerConnection;
  }
    
  @VsoMethod
  public void setMaxHttp2ControlFramesPerConnection(Integer maxHttp2ControlFramesPerConnection) {
    this.maxHttp2ControlFramesPerConnection = maxHttp2ControlFramesPerConnection;
  }

  
  /**
   * The max number of empty data frames that client can send over an HTTP/2 connection. '0' means unlimited. Allowed values are 0-10000. Special values are 0- 'Unlimited empty data frames over a client side HTTP/2 connection'. Field deprecated in 20.1.1. Field introduced in 18.2.6.
   * @return maxHttp2EmptyDataFramesPerConnection
  **/
  @ApiModelProperty(value = "The max number of empty data frames that client can send over an HTTP/2 connection. '0' means unlimited. Allowed values are 0-10000. Special values are 0- 'Unlimited empty data frames over a client side HTTP/2 connection'. Field deprecated in 20.1.1. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getMaxHttp2EmptyDataFramesPerConnection() {
    return maxHttp2EmptyDataFramesPerConnection;
  }
    
  @VsoMethod
  public void setMaxHttp2EmptyDataFramesPerConnection(Integer maxHttp2EmptyDataFramesPerConnection) {
    this.maxHttp2EmptyDataFramesPerConnection = maxHttp2EmptyDataFramesPerConnection;
  }

  
  /**
   * The max number of frames that can be queued waiting to be sent over a client side HTTP/2 connection at any given time. '0' means unlimited. Allowed values are 0-10000. Special values are 0- 'Unlimited frames can be queued on a client side HTTP/2 connection'. Field deprecated in 20.1.1. Field introduced in 18.2.6.
   * @return maxHttp2QueuedFramesToClientPerConnection
  **/
  @ApiModelProperty(value = "The max number of frames that can be queued waiting to be sent over a client side HTTP/2 connection at any given time. '0' means unlimited. Allowed values are 0-10000. Special values are 0- 'Unlimited frames can be queued on a client side HTTP/2 connection'. Field deprecated in 20.1.1. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getMaxHttp2QueuedFramesToClientPerConnection() {
    return maxHttp2QueuedFramesToClientPerConnection;
  }
    
  @VsoMethod
  public void setMaxHttp2QueuedFramesToClientPerConnection(Integer maxHttp2QueuedFramesToClientPerConnection) {
    this.maxHttp2QueuedFramesToClientPerConnection = maxHttp2QueuedFramesToClientPerConnection;
  }

  
  /**
   * The max number of HTTP requests that can be sent over a Keep-Alive connection. '0' means unlimited. Allowed values are 0-1000000. Special values are 0- 'Unlimited requests on a connection'. Field introduced in 18.2.5.
   * @return maxKeepaliveRequests
  **/
  @ApiModelProperty(value = "The max number of HTTP requests that can be sent over a Keep-Alive connection. '0' means unlimited. Allowed values are 0-1000000. Special values are 0- 'Unlimited requests on a connection'. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getMaxKeepaliveRequests() {
    return maxKeepaliveRequests;
  }
    
  @VsoMethod
  public void setMaxKeepaliveRequests(Integer maxKeepaliveRequests) {
    this.maxKeepaliveRequests = maxKeepaliveRequests;
  }

  
  /**
   * Maximum size in Kbytes of all the HTTP response headers. Allowed values are 1-256.
   * @return maxResponseHeadersSize
  **/
  @ApiModelProperty(value = "Maximum size in Kbytes of all the HTTP response headers. Allowed values are 1-256.")


 
  @VsoMethod  
  public Integer getMaxResponseHeadersSize() {
    return maxResponseHeadersSize;
  }
    
  @VsoMethod
  public void setMaxResponseHeadersSize(Integer maxResponseHeadersSize) {
    this.maxResponseHeadersSize = maxResponseHeadersSize;
  }

  
  /**
   * Maximum requests per second per client IP. Allowed values are 10-1000. Special values are 0- 'unlimited'.
   * @return maxRpsCip
  **/
  @ApiModelProperty(value = "Maximum requests per second per client IP. Allowed values are 10-1000. Special values are 0- 'unlimited'.")


 
  @VsoMethod  
  public Integer getMaxRpsCip() {
    return maxRpsCip;
  }
    
  @VsoMethod
  public void setMaxRpsCip(Integer maxRpsCip) {
    this.maxRpsCip = maxRpsCip;
  }

  
  /**
   * Maximum requests per second per client IP and URI. Allowed values are 10-1000. Special values are 0- 'unlimited'.
   * @return maxRpsCipUri
  **/
  @ApiModelProperty(value = "Maximum requests per second per client IP and URI. Allowed values are 10-1000. Special values are 0- 'unlimited'.")


 
  @VsoMethod  
  public Integer getMaxRpsCipUri() {
    return maxRpsCipUri;
  }
    
  @VsoMethod
  public void setMaxRpsCipUri(Integer maxRpsCipUri) {
    this.maxRpsCipUri = maxRpsCipUri;
  }

  
  /**
   * Maximum unknown client IPs per second. Allowed values are 10-1000. Special values are 0- 'unlimited'.
   * @return maxRpsUnknownCip
  **/
  @ApiModelProperty(value = "Maximum unknown client IPs per second. Allowed values are 10-1000. Special values are 0- 'unlimited'.")


 
  @VsoMethod  
  public Integer getMaxRpsUnknownCip() {
    return maxRpsUnknownCip;
  }
    
  @VsoMethod
  public void setMaxRpsUnknownCip(Integer maxRpsUnknownCip) {
    this.maxRpsUnknownCip = maxRpsUnknownCip;
  }

  
  /**
   * Maximum unknown URIs per second. Allowed values are 10-1000. Special values are 0- 'unlimited'.
   * @return maxRpsUnknownUri
  **/
  @ApiModelProperty(value = "Maximum unknown URIs per second. Allowed values are 10-1000. Special values are 0- 'unlimited'.")


 
  @VsoMethod  
  public Integer getMaxRpsUnknownUri() {
    return maxRpsUnknownUri;
  }
    
  @VsoMethod
  public void setMaxRpsUnknownUri(Integer maxRpsUnknownUri) {
    this.maxRpsUnknownUri = maxRpsUnknownUri;
  }

  
  /**
   * Maximum requests per second per URI. Allowed values are 10-1000. Special values are 0- 'unlimited'.
   * @return maxRpsUri
  **/
  @ApiModelProperty(value = "Maximum requests per second per URI. Allowed values are 10-1000. Special values are 0- 'unlimited'.")


 
  @VsoMethod  
  public Integer getMaxRpsUri() {
    return maxRpsUri;
  }
    
  @VsoMethod
  public void setMaxRpsUri(Integer maxRpsUri) {
    this.maxRpsUri = maxRpsUri;
  }

  
  /**
   * Select the PKI profile to be associated with the Virtual Service. This profile defines the Certificate Authority and Revocation List. It is a reference to an object of type PKIProfile.
   * @return pkiProfileRef
  **/
  @ApiModelProperty(value = "Select the PKI profile to be associated with the Virtual Service. This profile defines the Certificate Authority and Revocation List. It is a reference to an object of type PKIProfile.")


 
  @VsoMethod  
  public String getPkiProfileRef() {
    return pkiProfileRef;
  }
    
  @VsoMethod
  public void setPkiProfileRef(String pkiProfileRef) {
    this.pkiProfileRef = pkiProfileRef;
  }

  
  /**
   * The max allowed length of time between a client establishing a TCP connection until Avi receives the first byte of the client's HTTP request. Allowed values are 10-100000000.
   * @return postAcceptTimeout
  **/
  @ApiModelProperty(value = "The max allowed length of time between a client establishing a TCP connection until Avi receives the first byte of the client's HTTP request. Allowed values are 10-100000000.")


 
  @VsoMethod  
  public Integer getPostAcceptTimeout() {
    return postAcceptTimeout;
  }
    
  @VsoMethod
  public void setPostAcceptTimeout(Integer postAcceptTimeout) {
    this.postAcceptTimeout = postAcceptTimeout;
  }

  
  /**
   * If enabled, an HTTP request on an SSL port will result in connection close instead of a 400 response. Field introduced in 18.2.6.
   * @return resetConnHttpOnSslPort
  **/
  @ApiModelProperty(value = "If enabled, an HTTP request on an SSL port will result in connection close instead of a 400 response. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Boolean isResetConnHttpOnSslPort() {
    return resetConnHttpOnSslPort;
  }
    
  @VsoMethod
  public void setResetConnHttpOnSslPort(Boolean resetConnHttpOnSslPort) {
    this.resetConnHttpOnSslPort = resetConnHttpOnSslPort;
  }

  
  /**
   * Avi will respond with 100-Continue response if Expect  100-Continue header received from client. Field introduced in 17.2.8.
   * @return respondWith100Continue
  **/
  @ApiModelProperty(value = "Avi will respond with 100-Continue response if Expect  100-Continue header received from client. Field introduced in 17.2.8.")


 
  @VsoMethod  
  public Boolean isRespondWith100Continue() {
    return respondWith100Continue;
  }
    
  @VsoMethod
  public void setRespondWith100Continue(Boolean respondWith100Continue) {
    this.respondWith100Continue = respondWith100Continue;
  }

  
  /**
   * Mark server cookies with the 'Secure' attribute.  Client browsers will not send a cookie marked as secure over an unencrypted connection.  If Avi is terminating SSL from clients and passing it as HTTP to the server, the server may return cookies without the secure flag set.
   * @return secureCookieEnabled
  **/
  @ApiModelProperty(value = "Mark server cookies with the 'Secure' attribute.  Client browsers will not send a cookie marked as secure over an unencrypted connection.  If Avi is terminating SSL from clients and passing it as HTTP to the server, the server may return cookies without the secure flag set.")


 
  @VsoMethod  
  public Boolean isSecureCookieEnabled() {
    return secureCookieEnabled;
  }
    
  @VsoMethod
  public void setSecureCookieEnabled(Boolean secureCookieEnabled) {
    this.secureCookieEnabled = secureCookieEnabled;
  }

  
  /**
   * When terminating client SSL sessions at Avi, servers may incorrectly send redirect to clients as HTTP.  This option will rewrite the server's redirect responses for this virtual service from HTTP to HTTPS.
   * @return serverSideRedirectToHttps
  **/
  @ApiModelProperty(value = "When terminating client SSL sessions at Avi, servers may incorrectly send redirect to clients as HTTP.  This option will rewrite the server's redirect responses for this virtual service from HTTP to HTTPS.")


 
  @VsoMethod  
  public Boolean isServerSideRedirectToHttps() {
    return serverSideRedirectToHttps;
  }
    
  @VsoMethod
  public void setServerSideRedirectToHttps(Boolean serverSideRedirectToHttps) {
    this.serverSideRedirectToHttps = serverSideRedirectToHttps;
  }

  
  /**
   * This field is deprecated. Field deprecated in 18.2.8.
   * @return spdyEnabled
  **/
  @ApiModelProperty(value = "This field is deprecated. Field deprecated in 18.2.8.")


 
  @VsoMethod  
  public Boolean isSpdyEnabled() {
    return spdyEnabled;
  }
    
  @VsoMethod
  public void setSpdyEnabled(Boolean spdyEnabled) {
    this.spdyEnabled = spdyEnabled;
  }

  
  /**
   * This field is deprecated. Field deprecated in 18.2.8.
   * @return spdyFwdProxyMode
  **/
  @ApiModelProperty(value = "This field is deprecated. Field deprecated in 18.2.8.")


 
  @VsoMethod  
  public Boolean isSpdyFwdProxyMode() {
    return spdyFwdProxyMode;
  }
    
  @VsoMethod
  public void setSpdyFwdProxyMode(Boolean spdyFwdProxyMode) {
    this.spdyFwdProxyMode = spdyFwdProxyMode;
  }

  
  /**
   * Set of match/action rules that govern what happens when the client certificate request is enabled.
   * @return sslClientCertificateAction
  **/
  @ApiModelProperty(value = "Set of match/action rules that govern what happens when the client certificate request is enabled.")

  @Valid

 
  @VsoMethod  
  public SSLClientCertificateAction getSslClientCertificateAction() {
    return sslClientCertificateAction;
  }
    
  @VsoMethod
  public void setSslClientCertificateAction(SSLClientCertificateAction sslClientCertificateAction) {
    this.sslClientCertificateAction = sslClientCertificateAction;
  }

  
  /**
   * Specifies whether the client side verification is set to none, request or require. Enum options - SSL_CLIENT_CERTIFICATE_NONE, SSL_CLIENT_CERTIFICATE_REQUEST, SSL_CLIENT_CERTIFICATE_REQUIRE.
   * @return sslClientCertificateMode
  **/
  @ApiModelProperty(value = "Specifies whether the client side verification is set to none, request or require. Enum options - SSL_CLIENT_CERTIFICATE_NONE, SSL_CLIENT_CERTIFICATE_REQUEST, SSL_CLIENT_CERTIFICATE_REQUIRE.")


 
  @VsoMethod  
  public String getSslClientCertificateMode() {
    return sslClientCertificateMode;
  }
    
  @VsoMethod
  public void setSslClientCertificateMode(String sslClientCertificateMode) {
    this.sslClientCertificateMode = sslClientCertificateMode;
  }

  
  /**
   * Enable common settings to increase the level of security for  virtual services running HTTP and HTTPS. For sites that are  HTTP only, these settings will have no effect. Field deprecated in 18.2.7.
   * @return sslEverywhereEnabled
  **/
  @ApiModelProperty(value = "Enable common settings to increase the level of security for  virtual services running HTTP and HTTPS. For sites that are  HTTP only, these settings will have no effect. Field deprecated in 18.2.7.")


 
  @VsoMethod  
  public Boolean isSslEverywhereEnabled() {
    return sslEverywhereEnabled;
  }
    
  @VsoMethod
  public void setSslEverywhereEnabled(Boolean sslEverywhereEnabled) {
    this.sslEverywhereEnabled = sslEverywhereEnabled;
  }

  
  /**
   * Use 'Keep-Alive' header timeout sent by application instead of sending the HTTP Keep-Alive Timeout.
   * @return useAppKeepaliveTimeout
  **/
  @ApiModelProperty(value = "Use 'Keep-Alive' header timeout sent by application instead of sending the HTTP Keep-Alive Timeout.")


 
  @VsoMethod  
  public Boolean isUseAppKeepaliveTimeout() {
    return useAppKeepaliveTimeout;
  }
    
  @VsoMethod
  public void setUseAppKeepaliveTimeout(Boolean useAppKeepaliveTimeout) {
    this.useAppKeepaliveTimeout = useAppKeepaliveTimeout;
  }

  
  /**
   * Enable Websockets proxy for traffic from clients to the virtual service. Connections to this VS start in HTTP mode. If the client requests an Upgrade to Websockets, and the server responds back with success, then the connection is upgraded to WebSockets mode. .
   * @return websocketsEnabled
  **/
  @ApiModelProperty(value = "Enable Websockets proxy for traffic from clients to the virtual service. Connections to this VS start in HTTP mode. If the client requests an Upgrade to Websockets, and the server responds back with success, then the connection is upgraded to WebSockets mode. .")


 
  @VsoMethod  
  public Boolean isWebsocketsEnabled() {
    return websocketsEnabled;
  }
    
  @VsoMethod
  public void setWebsocketsEnabled(Boolean websocketsEnabled) {
    this.websocketsEnabled = websocketsEnabled;
  }

  
  /**
   * Insert an X-Forwarded-Proto header in the request sent to the server.  When the client connects via SSL, Avi terminates the SSL, and then forwards the requests to the servers via HTTP, so the servers can determine the original protocol via this header.  In this example, the value will be 'https'.
   * @return xForwardedProtoEnabled
  **/
  @ApiModelProperty(value = "Insert an X-Forwarded-Proto header in the request sent to the server.  When the client connects via SSL, Avi terminates the SSL, and then forwards the requests to the servers via HTTP, so the servers can determine the original protocol via this header.  In this example, the value will be 'https'.")


 
  @VsoMethod  
  public Boolean isXForwardedProtoEnabled() {
    return xForwardedProtoEnabled;
  }
    
  @VsoMethod
  public void setXForwardedProtoEnabled(Boolean xForwardedProtoEnabled) {
    this.xForwardedProtoEnabled = xForwardedProtoEnabled;
  }

  
  /**
   * Provide a custom name for the X-Forwarded-For header sent to the servers.
   * @return xffAlternateName
  **/
  @ApiModelProperty(value = "Provide a custom name for the X-Forwarded-For header sent to the servers.")


 
  @VsoMethod  
  public String getXffAlternateName() {
    return xffAlternateName;
  }
    
  @VsoMethod
  public void setXffAlternateName(String xffAlternateName) {
    this.xffAlternateName = xffAlternateName;
  }

  
  /**
   * The client's original IP address is inserted into an HTTP request header sent to the server.  Servers may use this address for logging or other purposes, rather than Avi's source NAT address used in the Avi to server IP connection.
   * @return xffEnabled
  **/
  @ApiModelProperty(value = "The client's original IP address is inserted into an HTTP request header sent to the server.  Servers may use this address for logging or other purposes, rather than Avi's source NAT address used in the Avi to server IP connection.")


 
  @VsoMethod  
  public Boolean isXffEnabled() {
    return xffEnabled;
  }
    
  @VsoMethod
  public void setXffEnabled(Boolean xffEnabled) {
    this.xffEnabled = xffEnabled;
  }

  
  public String getObjectID() {
		return "HTTPApplicationProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPApplicationProfile htTPApplicationProfile = (HTTPApplicationProfile) o;
    return Objects.equals(this.allowDotsInHeaderName, htTPApplicationProfile.allowDotsInHeaderName) &&
        Objects.equals(this.cacheConfig, htTPApplicationProfile.cacheConfig) &&
        Objects.equals(this.clientBodyTimeout, htTPApplicationProfile.clientBodyTimeout) &&
        Objects.equals(this.clientHeaderTimeout, htTPApplicationProfile.clientHeaderTimeout) &&
        Objects.equals(this.clientMaxBodySize, htTPApplicationProfile.clientMaxBodySize) &&
        Objects.equals(this.clientMaxHeaderSize, htTPApplicationProfile.clientMaxHeaderSize) &&
        Objects.equals(this.clientMaxRequestSize, htTPApplicationProfile.clientMaxRequestSize) &&
        Objects.equals(this.compressionProfile, htTPApplicationProfile.compressionProfile) &&
        Objects.equals(this.connectionMultiplexingEnabled, htTPApplicationProfile.connectionMultiplexingEnabled) &&
        Objects.equals(this.disableKeepalivePostsMsie6, htTPApplicationProfile.disableKeepalivePostsMsie6) &&
        Objects.equals(this.disableSniHostnameCheck, htTPApplicationProfile.disableSniHostnameCheck) &&
        Objects.equals(this.enableChunkMerge, htTPApplicationProfile.enableChunkMerge) &&
        Objects.equals(this.enableFireAndForget, htTPApplicationProfile.enableFireAndForget) &&
        Objects.equals(this.enableRequestBodyBuffering, htTPApplicationProfile.enableRequestBodyBuffering) &&
        Objects.equals(this.enableRequestBodyMetrics, htTPApplicationProfile.enableRequestBodyMetrics) &&
        Objects.equals(this.fwdCloseHdrForBoundConnections, htTPApplicationProfile.fwdCloseHdrForBoundConnections) &&
        Objects.equals(this.hstsEnabled, htTPApplicationProfile.hstsEnabled) &&
        Objects.equals(this.hstsMaxAge, htTPApplicationProfile.hstsMaxAge) &&
        Objects.equals(this.hstsSubdomainsEnabled, htTPApplicationProfile.hstsSubdomainsEnabled) &&
        Objects.equals(this.http2Enabled, htTPApplicationProfile.http2Enabled) &&
        Objects.equals(this.http2Profile, htTPApplicationProfile.http2Profile) &&
        Objects.equals(this.httpToHttps, htTPApplicationProfile.httpToHttps) &&
        Objects.equals(this.httpUpstreamBufferSize, htTPApplicationProfile.httpUpstreamBufferSize) &&
        Objects.equals(this.httponlyEnabled, htTPApplicationProfile.httponlyEnabled) &&
        Objects.equals(this.keepaliveHeader, htTPApplicationProfile.keepaliveHeader) &&
        Objects.equals(this.keepaliveTimeout, htTPApplicationProfile.keepaliveTimeout) &&
        Objects.equals(this.maxBadRpsCip, htTPApplicationProfile.maxBadRpsCip) &&
        Objects.equals(this.maxBadRpsCipUri, htTPApplicationProfile.maxBadRpsCipUri) &&
        Objects.equals(this.maxBadRpsUri, htTPApplicationProfile.maxBadRpsUri) &&
        Objects.equals(this.maxHttp2ConcurrentStreamsPerConnection, htTPApplicationProfile.maxHttp2ConcurrentStreamsPerConnection) &&
        Objects.equals(this.maxHttp2ControlFramesPerConnection, htTPApplicationProfile.maxHttp2ControlFramesPerConnection) &&
        Objects.equals(this.maxHttp2EmptyDataFramesPerConnection, htTPApplicationProfile.maxHttp2EmptyDataFramesPerConnection) &&
        Objects.equals(this.maxHttp2QueuedFramesToClientPerConnection, htTPApplicationProfile.maxHttp2QueuedFramesToClientPerConnection) &&
        Objects.equals(this.maxKeepaliveRequests, htTPApplicationProfile.maxKeepaliveRequests) &&
        Objects.equals(this.maxResponseHeadersSize, htTPApplicationProfile.maxResponseHeadersSize) &&
        Objects.equals(this.maxRpsCip, htTPApplicationProfile.maxRpsCip) &&
        Objects.equals(this.maxRpsCipUri, htTPApplicationProfile.maxRpsCipUri) &&
        Objects.equals(this.maxRpsUnknownCip, htTPApplicationProfile.maxRpsUnknownCip) &&
        Objects.equals(this.maxRpsUnknownUri, htTPApplicationProfile.maxRpsUnknownUri) &&
        Objects.equals(this.maxRpsUri, htTPApplicationProfile.maxRpsUri) &&
        Objects.equals(this.pkiProfileRef, htTPApplicationProfile.pkiProfileRef) &&
        Objects.equals(this.postAcceptTimeout, htTPApplicationProfile.postAcceptTimeout) &&
        Objects.equals(this.resetConnHttpOnSslPort, htTPApplicationProfile.resetConnHttpOnSslPort) &&
        Objects.equals(this.respondWith100Continue, htTPApplicationProfile.respondWith100Continue) &&
        Objects.equals(this.secureCookieEnabled, htTPApplicationProfile.secureCookieEnabled) &&
        Objects.equals(this.serverSideRedirectToHttps, htTPApplicationProfile.serverSideRedirectToHttps) &&
        Objects.equals(this.spdyEnabled, htTPApplicationProfile.spdyEnabled) &&
        Objects.equals(this.spdyFwdProxyMode, htTPApplicationProfile.spdyFwdProxyMode) &&
        Objects.equals(this.sslClientCertificateAction, htTPApplicationProfile.sslClientCertificateAction) &&
        Objects.equals(this.sslClientCertificateMode, htTPApplicationProfile.sslClientCertificateMode) &&
        Objects.equals(this.sslEverywhereEnabled, htTPApplicationProfile.sslEverywhereEnabled) &&
        Objects.equals(this.useAppKeepaliveTimeout, htTPApplicationProfile.useAppKeepaliveTimeout) &&
        Objects.equals(this.websocketsEnabled, htTPApplicationProfile.websocketsEnabled) &&
        Objects.equals(this.xForwardedProtoEnabled, htTPApplicationProfile.xForwardedProtoEnabled) &&
        Objects.equals(this.xffAlternateName, htTPApplicationProfile.xffAlternateName) &&
        Objects.equals(this.xffEnabled, htTPApplicationProfile.xffEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowDotsInHeaderName, cacheConfig, clientBodyTimeout, clientHeaderTimeout, clientMaxBodySize, clientMaxHeaderSize, clientMaxRequestSize, compressionProfile, connectionMultiplexingEnabled, disableKeepalivePostsMsie6, disableSniHostnameCheck, enableChunkMerge, enableFireAndForget, enableRequestBodyBuffering, enableRequestBodyMetrics, fwdCloseHdrForBoundConnections, hstsEnabled, hstsMaxAge, hstsSubdomainsEnabled, http2Enabled, http2Profile, httpToHttps, httpUpstreamBufferSize, httponlyEnabled, keepaliveHeader, keepaliveTimeout, maxBadRpsCip, maxBadRpsCipUri, maxBadRpsUri, maxHttp2ConcurrentStreamsPerConnection, maxHttp2ControlFramesPerConnection, maxHttp2EmptyDataFramesPerConnection, maxHttp2QueuedFramesToClientPerConnection, maxKeepaliveRequests, maxResponseHeadersSize, maxRpsCip, maxRpsCipUri, maxRpsUnknownCip, maxRpsUnknownUri, maxRpsUri, pkiProfileRef, postAcceptTimeout, resetConnHttpOnSslPort, respondWith100Continue, secureCookieEnabled, serverSideRedirectToHttps, spdyEnabled, spdyFwdProxyMode, sslClientCertificateAction, sslClientCertificateMode, sslEverywhereEnabled, useAppKeepaliveTimeout, websocketsEnabled, xForwardedProtoEnabled, xffAlternateName, xffEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPApplicationProfile {\n");
    
    sb.append("    allowDotsInHeaderName: ").append(toIndentedString(allowDotsInHeaderName)).append("\n");
    sb.append("    cacheConfig: ").append(toIndentedString(cacheConfig)).append("\n");
    sb.append("    clientBodyTimeout: ").append(toIndentedString(clientBodyTimeout)).append("\n");
    sb.append("    clientHeaderTimeout: ").append(toIndentedString(clientHeaderTimeout)).append("\n");
    sb.append("    clientMaxBodySize: ").append(toIndentedString(clientMaxBodySize)).append("\n");
    sb.append("    clientMaxHeaderSize: ").append(toIndentedString(clientMaxHeaderSize)).append("\n");
    sb.append("    clientMaxRequestSize: ").append(toIndentedString(clientMaxRequestSize)).append("\n");
    sb.append("    compressionProfile: ").append(toIndentedString(compressionProfile)).append("\n");
    sb.append("    connectionMultiplexingEnabled: ").append(toIndentedString(connectionMultiplexingEnabled)).append("\n");
    sb.append("    disableKeepalivePostsMsie6: ").append(toIndentedString(disableKeepalivePostsMsie6)).append("\n");
    sb.append("    disableSniHostnameCheck: ").append(toIndentedString(disableSniHostnameCheck)).append("\n");
    sb.append("    enableChunkMerge: ").append(toIndentedString(enableChunkMerge)).append("\n");
    sb.append("    enableFireAndForget: ").append(toIndentedString(enableFireAndForget)).append("\n");
    sb.append("    enableRequestBodyBuffering: ").append(toIndentedString(enableRequestBodyBuffering)).append("\n");
    sb.append("    enableRequestBodyMetrics: ").append(toIndentedString(enableRequestBodyMetrics)).append("\n");
    sb.append("    fwdCloseHdrForBoundConnections: ").append(toIndentedString(fwdCloseHdrForBoundConnections)).append("\n");
    sb.append("    hstsEnabled: ").append(toIndentedString(hstsEnabled)).append("\n");
    sb.append("    hstsMaxAge: ").append(toIndentedString(hstsMaxAge)).append("\n");
    sb.append("    hstsSubdomainsEnabled: ").append(toIndentedString(hstsSubdomainsEnabled)).append("\n");
    sb.append("    http2Enabled: ").append(toIndentedString(http2Enabled)).append("\n");
    sb.append("    http2Profile: ").append(toIndentedString(http2Profile)).append("\n");
    sb.append("    httpToHttps: ").append(toIndentedString(httpToHttps)).append("\n");
    sb.append("    httpUpstreamBufferSize: ").append(toIndentedString(httpUpstreamBufferSize)).append("\n");
    sb.append("    httponlyEnabled: ").append(toIndentedString(httponlyEnabled)).append("\n");
    sb.append("    keepaliveHeader: ").append(toIndentedString(keepaliveHeader)).append("\n");
    sb.append("    keepaliveTimeout: ").append(toIndentedString(keepaliveTimeout)).append("\n");
    sb.append("    maxBadRpsCip: ").append(toIndentedString(maxBadRpsCip)).append("\n");
    sb.append("    maxBadRpsCipUri: ").append(toIndentedString(maxBadRpsCipUri)).append("\n");
    sb.append("    maxBadRpsUri: ").append(toIndentedString(maxBadRpsUri)).append("\n");
    sb.append("    maxHttp2ConcurrentStreamsPerConnection: ").append(toIndentedString(maxHttp2ConcurrentStreamsPerConnection)).append("\n");
    sb.append("    maxHttp2ControlFramesPerConnection: ").append(toIndentedString(maxHttp2ControlFramesPerConnection)).append("\n");
    sb.append("    maxHttp2EmptyDataFramesPerConnection: ").append(toIndentedString(maxHttp2EmptyDataFramesPerConnection)).append("\n");
    sb.append("    maxHttp2QueuedFramesToClientPerConnection: ").append(toIndentedString(maxHttp2QueuedFramesToClientPerConnection)).append("\n");
    sb.append("    maxKeepaliveRequests: ").append(toIndentedString(maxKeepaliveRequests)).append("\n");
    sb.append("    maxResponseHeadersSize: ").append(toIndentedString(maxResponseHeadersSize)).append("\n");
    sb.append("    maxRpsCip: ").append(toIndentedString(maxRpsCip)).append("\n");
    sb.append("    maxRpsCipUri: ").append(toIndentedString(maxRpsCipUri)).append("\n");
    sb.append("    maxRpsUnknownCip: ").append(toIndentedString(maxRpsUnknownCip)).append("\n");
    sb.append("    maxRpsUnknownUri: ").append(toIndentedString(maxRpsUnknownUri)).append("\n");
    sb.append("    maxRpsUri: ").append(toIndentedString(maxRpsUri)).append("\n");
    sb.append("    pkiProfileRef: ").append(toIndentedString(pkiProfileRef)).append("\n");
    sb.append("    postAcceptTimeout: ").append(toIndentedString(postAcceptTimeout)).append("\n");
    sb.append("    resetConnHttpOnSslPort: ").append(toIndentedString(resetConnHttpOnSslPort)).append("\n");
    sb.append("    respondWith100Continue: ").append(toIndentedString(respondWith100Continue)).append("\n");
    sb.append("    secureCookieEnabled: ").append(toIndentedString(secureCookieEnabled)).append("\n");
    sb.append("    serverSideRedirectToHttps: ").append(toIndentedString(serverSideRedirectToHttps)).append("\n");
    sb.append("    spdyEnabled: ").append(toIndentedString(spdyEnabled)).append("\n");
    sb.append("    spdyFwdProxyMode: ").append(toIndentedString(spdyFwdProxyMode)).append("\n");
    sb.append("    sslClientCertificateAction: ").append(toIndentedString(sslClientCertificateAction)).append("\n");
    sb.append("    sslClientCertificateMode: ").append(toIndentedString(sslClientCertificateMode)).append("\n");
    sb.append("    sslEverywhereEnabled: ").append(toIndentedString(sslEverywhereEnabled)).append("\n");
    sb.append("    useAppKeepaliveTimeout: ").append(toIndentedString(useAppKeepaliveTimeout)).append("\n");
    sb.append("    websocketsEnabled: ").append(toIndentedString(websocketsEnabled)).append("\n");
    sb.append("    xForwardedProtoEnabled: ").append(toIndentedString(xForwardedProtoEnabled)).append("\n");
    sb.append("    xffAlternateName: ").append(toIndentedString(xffAlternateName)).append("\n");
    sb.append("    xffEnabled: ").append(toIndentedString(xffEnabled)).append("\n");
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

