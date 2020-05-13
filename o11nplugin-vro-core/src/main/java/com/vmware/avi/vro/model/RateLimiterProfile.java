package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.RateProfile;
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
 * RateLimiterProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "RateLimiterProfile")
@VsoFinder(name = Constants.FINDER_VRO_RATELIMITERPROFILE, idAccessor = "getObjectID()")
@Service
public class RateLimiterProfile extends AviRestResource  {
  @JsonProperty("client_ip_connections_rate_limit")
  private RateProfile clientIpConnectionsRateLimit = null;

  @JsonProperty("client_ip_failed_requests_rate_limit")
  private RateProfile clientIpFailedRequestsRateLimit = null;

  @JsonProperty("client_ip_requests_rate_limit")
  private RateProfile clientIpRequestsRateLimit = null;

  @JsonProperty("client_ip_scanners_requests_rate_limit")
  private RateProfile clientIpScannersRequestsRateLimit = null;

  @JsonProperty("client_ip_to_uri_failed_requests_rate_limit")
  private RateProfile clientIpToUriFailedRequestsRateLimit = null;

  @JsonProperty("client_ip_to_uri_requests_rate_limit")
  private RateProfile clientIpToUriRequestsRateLimit = null;

  @JsonProperty("custom_requests_rate_limit")
  private RateProfile customRequestsRateLimit = null;

  @JsonProperty("http_header_rate_limits")
  @Valid
  private List<RateProfile> httpHeaderRateLimits = null;

  @JsonProperty("uri_failed_requests_rate_limit")
  private RateProfile uriFailedRequestsRateLimit = null;

  @JsonProperty("uri_requests_rate_limit")
  private RateProfile uriRequestsRateLimit = null;

  @JsonProperty("uri_scanners_requests_rate_limit")
  private RateProfile uriScannersRequestsRateLimit = null;

  
  /**
   * Rate Limit all connections made from any single client IP address to the Virtual Service.
   * @return clientIpConnectionsRateLimit
  **/
  @ApiModelProperty(value = "Rate Limit all connections made from any single client IP address to the Virtual Service.")

  @Valid

 
  @VsoMethod  
  public RateProfile getClientIpConnectionsRateLimit() {
    return clientIpConnectionsRateLimit;
  }
    
  @VsoMethod
  public void setClientIpConnectionsRateLimit(RateProfile clientIpConnectionsRateLimit) {
    this.clientIpConnectionsRateLimit = clientIpConnectionsRateLimit;
  }

  
  /**
   * Rate Limit all requests from a client for a specified period of time once the count of failed requests from that client crosses a threshold for that period. Clients are tracked based on their IP address. Count and time period are specified through the RateProfile. Requests are deemed failed based on client or server side error status codes, consistent with how Avi Logs and Metrics subsystems mark failed requests. .
   * @return clientIpFailedRequestsRateLimit
  **/
  @ApiModelProperty(value = "Rate Limit all requests from a client for a specified period of time once the count of failed requests from that client crosses a threshold for that period. Clients are tracked based on their IP address. Count and time period are specified through the RateProfile. Requests are deemed failed based on client or server side error status codes, consistent with how Avi Logs and Metrics subsystems mark failed requests. .")

  @Valid

 
  @VsoMethod  
  public RateProfile getClientIpFailedRequestsRateLimit() {
    return clientIpFailedRequestsRateLimit;
  }
    
  @VsoMethod
  public void setClientIpFailedRequestsRateLimit(RateProfile clientIpFailedRequestsRateLimit) {
    this.clientIpFailedRequestsRateLimit = clientIpFailedRequestsRateLimit;
  }

  
  /**
   * Rate Limit all HTTP requests from any single client IP address to all URLs of the Virtual Service.
   * @return clientIpRequestsRateLimit
  **/
  @ApiModelProperty(value = "Rate Limit all HTTP requests from any single client IP address to all URLs of the Virtual Service.")

  @Valid

 
  @VsoMethod  
  public RateProfile getClientIpRequestsRateLimit() {
    return clientIpRequestsRateLimit;
  }
    
  @VsoMethod
  public void setClientIpRequestsRateLimit(RateProfile clientIpRequestsRateLimit) {
    this.clientIpRequestsRateLimit = clientIpRequestsRateLimit;
  }

  
  /**
   * Automatically track clients and classify them into 3 groups - Good, Bad, Unknown. Clients are tracked based on their IP Address. Clients are added to the Good group when the Avi Scan Detection system builds history of requests from them that complete successfully. Clients are added to Unknown group when there is insufficient history about them. Requests from such clients are rate limited to the rate specified in the RateProfile. Finally, Clients with history of failed requests are added to Bad group and their requests are rate limited with stricter thresholds than the Unknown Clients group. The Avi Scan Detection system automatically tunes itself so that the Good, Bad, and Unknown client IPs group membership changes dynamically with the changes in traffic patterns through the ADC.
   * @return clientIpScannersRequestsRateLimit
  **/
  @ApiModelProperty(value = "Automatically track clients and classify them into 3 groups - Good, Bad, Unknown. Clients are tracked based on their IP Address. Clients are added to the Good group when the Avi Scan Detection system builds history of requests from them that complete successfully. Clients are added to Unknown group when there is insufficient history about them. Requests from such clients are rate limited to the rate specified in the RateProfile. Finally, Clients with history of failed requests are added to Bad group and their requests are rate limited with stricter thresholds than the Unknown Clients group. The Avi Scan Detection system automatically tunes itself so that the Good, Bad, and Unknown client IPs group membership changes dynamically with the changes in traffic patterns through the ADC.")

  @Valid

 
  @VsoMethod  
  public RateProfile getClientIpScannersRequestsRateLimit() {
    return clientIpScannersRequestsRateLimit;
  }
    
  @VsoMethod
  public void setClientIpScannersRequestsRateLimit(RateProfile clientIpScannersRequestsRateLimit) {
    this.clientIpScannersRequestsRateLimit = clientIpScannersRequestsRateLimit;
  }

  
  /**
   * Rate Limit all requests from a client to a URI for a specified period of time once the count of failed requests from that client to the URI crosses a threshold for that period. Clients are tracked based on their IP address. Count and time period are specified through the RateProfile. Requests are deemed failed based on client or server side error status codes, consistent with how Avi Logs and Metrics subsystems mark failed requests. .
   * @return clientIpToUriFailedRequestsRateLimit
  **/
  @ApiModelProperty(value = "Rate Limit all requests from a client to a URI for a specified period of time once the count of failed requests from that client to the URI crosses a threshold for that period. Clients are tracked based on their IP address. Count and time period are specified through the RateProfile. Requests are deemed failed based on client or server side error status codes, consistent with how Avi Logs and Metrics subsystems mark failed requests. .")

  @Valid

 
  @VsoMethod  
  public RateProfile getClientIpToUriFailedRequestsRateLimit() {
    return clientIpToUriFailedRequestsRateLimit;
  }
    
  @VsoMethod
  public void setClientIpToUriFailedRequestsRateLimit(RateProfile clientIpToUriFailedRequestsRateLimit) {
    this.clientIpToUriFailedRequestsRateLimit = clientIpToUriFailedRequestsRateLimit;
  }

  
  /**
   * Rate Limit all HTTP requests from any single client IP address to any single URL.
   * @return clientIpToUriRequestsRateLimit
  **/
  @ApiModelProperty(value = "Rate Limit all HTTP requests from any single client IP address to any single URL.")

  @Valid

 
  @VsoMethod  
  public RateProfile getClientIpToUriRequestsRateLimit() {
    return clientIpToUriRequestsRateLimit;
  }
    
  @VsoMethod
  public void setClientIpToUriRequestsRateLimit(RateProfile clientIpToUriRequestsRateLimit) {
    this.clientIpToUriRequestsRateLimit = clientIpToUriRequestsRateLimit;
  }

  
  /**
   * Rate Limit all HTTP requests that map to any custom string. Field introduced in 17.2.13,18.1.3,18.2.1.
   * @return customRequestsRateLimit
  **/
  @ApiModelProperty(value = "Rate Limit all HTTP requests that map to any custom string. Field introduced in 17.2.13,18.1.3,18.2.1.")

  @Valid

 
  @VsoMethod  
  public RateProfile getCustomRequestsRateLimit() {
    return customRequestsRateLimit;
  }
    
  @VsoMethod
  public void setCustomRequestsRateLimit(RateProfile customRequestsRateLimit) {
    this.customRequestsRateLimit = customRequestsRateLimit;
  }

  
  public RateLimiterProfile addHttpHeaderRateLimitsItem(RateProfile httpHeaderRateLimitsItem) {
    if (this.httpHeaderRateLimits == null) {
      this.httpHeaderRateLimits = new ArrayList<RateProfile>();
    }
    this.httpHeaderRateLimits.add(httpHeaderRateLimitsItem);
    return this;
  }
  
  /**
   * Rate Limit all HTTP requests from all client IP addresses that contain any single HTTP header value. Field introduced in 17.1.1.
   * @return httpHeaderRateLimits
  **/
  @ApiModelProperty(value = "Rate Limit all HTTP requests from all client IP addresses that contain any single HTTP header value. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<RateProfile> getHttpHeaderRateLimits() {
    return httpHeaderRateLimits;
  }
    
  @VsoMethod
  public void setHttpHeaderRateLimits(List<RateProfile> httpHeaderRateLimits) {
    this.httpHeaderRateLimits = httpHeaderRateLimits;
  }

  
  /**
   * Rate Limit all requests to a URI for a specified period of time once the count of failed requests to that URI crosses a threshold for that period. Count and time period are specified through the RateProfile. Requests are deemed failed based on client or server side error status codes, consistent with how Avi Logs and Metrics subsystems mark failed requests. .
   * @return uriFailedRequestsRateLimit
  **/
  @ApiModelProperty(value = "Rate Limit all requests to a URI for a specified period of time once the count of failed requests to that URI crosses a threshold for that period. Count and time period are specified through the RateProfile. Requests are deemed failed based on client or server side error status codes, consistent with how Avi Logs and Metrics subsystems mark failed requests. .")

  @Valid

 
  @VsoMethod  
  public RateProfile getUriFailedRequestsRateLimit() {
    return uriFailedRequestsRateLimit;
  }
    
  @VsoMethod
  public void setUriFailedRequestsRateLimit(RateProfile uriFailedRequestsRateLimit) {
    this.uriFailedRequestsRateLimit = uriFailedRequestsRateLimit;
  }

  
  /**
   * Rate Limit all HTTP requests from all client IP addresses to any single URL.
   * @return uriRequestsRateLimit
  **/
  @ApiModelProperty(value = "Rate Limit all HTTP requests from all client IP addresses to any single URL.")

  @Valid

 
  @VsoMethod  
  public RateProfile getUriRequestsRateLimit() {
    return uriRequestsRateLimit;
  }
    
  @VsoMethod
  public void setUriRequestsRateLimit(RateProfile uriRequestsRateLimit) {
    this.uriRequestsRateLimit = uriRequestsRateLimit;
  }

  
  /**
   * Automatically track URIs and classify them into 3 groups - Good, Bad, Unknown. URIs are added to the Good group when the Avi Scan Detection system builds history of requests to URIs that complete successfully. URIs are added to Unknown group when there is insufficient history about them. Requests for such URIs are rate limited to the rate specified in the RateProfile. Finally, URIs with history of failed requests are added to Bad group and requests to them are rate limited with stricter thresholds than the Unknown URIs group. The Avi Scan Detection system automatically tunes itself so that the Good, Bad, and Unknown URIs group membership changes dynamically with the changes in traffic patterns through the ADC.
   * @return uriScannersRequestsRateLimit
  **/
  @ApiModelProperty(value = "Automatically track URIs and classify them into 3 groups - Good, Bad, Unknown. URIs are added to the Good group when the Avi Scan Detection system builds history of requests to URIs that complete successfully. URIs are added to Unknown group when there is insufficient history about them. Requests for such URIs are rate limited to the rate specified in the RateProfile. Finally, URIs with history of failed requests are added to Bad group and requests to them are rate limited with stricter thresholds than the Unknown URIs group. The Avi Scan Detection system automatically tunes itself so that the Good, Bad, and Unknown URIs group membership changes dynamically with the changes in traffic patterns through the ADC.")

  @Valid

 
  @VsoMethod  
  public RateProfile getUriScannersRequestsRateLimit() {
    return uriScannersRequestsRateLimit;
  }
    
  @VsoMethod
  public void setUriScannersRequestsRateLimit(RateProfile uriScannersRequestsRateLimit) {
    this.uriScannersRequestsRateLimit = uriScannersRequestsRateLimit;
  }

  
  public String getObjectID() {
		return "RateLimiterProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLimiterProfile rateLimiterProfile = (RateLimiterProfile) o;
    return Objects.equals(this.clientIpConnectionsRateLimit, rateLimiterProfile.clientIpConnectionsRateLimit) &&
        Objects.equals(this.clientIpFailedRequestsRateLimit, rateLimiterProfile.clientIpFailedRequestsRateLimit) &&
        Objects.equals(this.clientIpRequestsRateLimit, rateLimiterProfile.clientIpRequestsRateLimit) &&
        Objects.equals(this.clientIpScannersRequestsRateLimit, rateLimiterProfile.clientIpScannersRequestsRateLimit) &&
        Objects.equals(this.clientIpToUriFailedRequestsRateLimit, rateLimiterProfile.clientIpToUriFailedRequestsRateLimit) &&
        Objects.equals(this.clientIpToUriRequestsRateLimit, rateLimiterProfile.clientIpToUriRequestsRateLimit) &&
        Objects.equals(this.customRequestsRateLimit, rateLimiterProfile.customRequestsRateLimit) &&
        Objects.equals(this.httpHeaderRateLimits, rateLimiterProfile.httpHeaderRateLimits) &&
        Objects.equals(this.uriFailedRequestsRateLimit, rateLimiterProfile.uriFailedRequestsRateLimit) &&
        Objects.equals(this.uriRequestsRateLimit, rateLimiterProfile.uriRequestsRateLimit) &&
        Objects.equals(this.uriScannersRequestsRateLimit, rateLimiterProfile.uriScannersRequestsRateLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIpConnectionsRateLimit, clientIpFailedRequestsRateLimit, clientIpRequestsRateLimit, clientIpScannersRequestsRateLimit, clientIpToUriFailedRequestsRateLimit, clientIpToUriRequestsRateLimit, customRequestsRateLimit, httpHeaderRateLimits, uriFailedRequestsRateLimit, uriRequestsRateLimit, uriScannersRequestsRateLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLimiterProfile {\n");
    
    sb.append("    clientIpConnectionsRateLimit: ").append(toIndentedString(clientIpConnectionsRateLimit)).append("\n");
    sb.append("    clientIpFailedRequestsRateLimit: ").append(toIndentedString(clientIpFailedRequestsRateLimit)).append("\n");
    sb.append("    clientIpRequestsRateLimit: ").append(toIndentedString(clientIpRequestsRateLimit)).append("\n");
    sb.append("    clientIpScannersRequestsRateLimit: ").append(toIndentedString(clientIpScannersRequestsRateLimit)).append("\n");
    sb.append("    clientIpToUriFailedRequestsRateLimit: ").append(toIndentedString(clientIpToUriFailedRequestsRateLimit)).append("\n");
    sb.append("    clientIpToUriRequestsRateLimit: ").append(toIndentedString(clientIpToUriRequestsRateLimit)).append("\n");
    sb.append("    customRequestsRateLimit: ").append(toIndentedString(customRequestsRateLimit)).append("\n");
    sb.append("    httpHeaderRateLimits: ").append(toIndentedString(httpHeaderRateLimits)).append("\n");
    sb.append("    uriFailedRequestsRateLimit: ").append(toIndentedString(uriFailedRequestsRateLimit)).append("\n");
    sb.append("    uriRequestsRateLimit: ").append(toIndentedString(uriRequestsRateLimit)).append("\n");
    sb.append("    uriScannersRequestsRateLimit: ").append(toIndentedString(uriScannersRequestsRateLimit)).append("\n");
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

