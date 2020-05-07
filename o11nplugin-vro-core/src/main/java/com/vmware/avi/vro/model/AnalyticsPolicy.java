package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.ClientInsightsSampling;
import com.vmware.avi.vro.model.ClientLogFilter;
import com.vmware.avi.vro.model.FullClientLogs;
import com.vmware.avi.vro.model.MetricsRealTimeUpdate;
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
 * AnalyticsPolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "AnalyticsPolicy")
@VsoFinder(name = Constants.FINDER_VRO_ANALYTICSPOLICY, idAccessor = "getObjectID()")
@Service
public class AnalyticsPolicy extends AviRestResource  {
  @JsonProperty("all_headers")
  private Boolean allHeaders = null;

  @JsonProperty("client_insights")
  private String clientInsights = "NO_INSIGHTS";

  @JsonProperty("client_insights_sampling")
  private ClientInsightsSampling clientInsightsSampling = null;

  @JsonProperty("client_log_filters")
  @Valid
  private List<ClientLogFilter> clientLogFilters = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("full_client_logs")
  private FullClientLogs fullClientLogs = null;

  @JsonProperty("metrics_realtime_update")
  private MetricsRealTimeUpdate metricsRealtimeUpdate = null;

  @JsonProperty("significant_log_throttle")
  private Integer significantLogThrottle = 10;

  @JsonProperty("udf_log_throttle")
  private Integer udfLogThrottle = 10;

  
  /**
   * Log all headers. Field introduced in 18.1.4, 18.2.1.
   * @return allHeaders
  **/
  @ApiModelProperty(value = "Log all headers. Field introduced in 18.1.4, 18.2.1.")


 
  @VsoMethod  
  public Boolean isAllHeaders() {
    return allHeaders;
  }
    
  @VsoMethod
  public void setAllHeaders(Boolean allHeaders) {
    this.allHeaders = allHeaders;
  }

  
  /**
   * Gain insights from sampled client to server HTTP requests and responses. Enum options - NO_INSIGHTS, PASSIVE, ACTIVE.
   * @return clientInsights
  **/
  @ApiModelProperty(value = "Gain insights from sampled client to server HTTP requests and responses. Enum options - NO_INSIGHTS, PASSIVE, ACTIVE.")


 
  @VsoMethod  
  public String getClientInsights() {
    return clientInsights;
  }
    
  @VsoMethod
  public void setClientInsights(String clientInsights) {
    this.clientInsights = clientInsights;
  }

  
  /**
   * Placeholder for description of property client_insights_sampling of obj type AnalyticsPolicy field type str  type object
   * @return clientInsightsSampling
  **/
  @ApiModelProperty(value = "Placeholder for description of property client_insights_sampling of obj type AnalyticsPolicy field type str  type object")

  @Valid

 
  @VsoMethod  
  public ClientInsightsSampling getClientInsightsSampling() {
    return clientInsightsSampling;
  }
    
  @VsoMethod
  public void setClientInsightsSampling(ClientInsightsSampling clientInsightsSampling) {
    this.clientInsightsSampling = clientInsightsSampling;
  }

  
  public AnalyticsPolicy addClientLogFiltersItem(ClientLogFilter clientLogFiltersItem) {
    if (this.clientLogFilters == null) {
      this.clientLogFilters = new ArrayList<ClientLogFilter>();
    }
    this.clientLogFilters.add(clientLogFiltersItem);
    return this;
  }
  
  /**
   * Placeholder for description of property client_log_filters of obj type AnalyticsPolicy field type str  type object
   * @return clientLogFilters
  **/
  @ApiModelProperty(value = "Placeholder for description of property client_log_filters of obj type AnalyticsPolicy field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<ClientLogFilter> getClientLogFilters() {
    return clientLogFilters;
  }
    
  @VsoMethod
  public void setClientLogFilters(List<ClientLogFilter> clientLogFilters) {
    this.clientLogFilters = clientLogFilters;
  }

  
  /**
   * [DEPRECATED] Disable Analytics on this VirtualService. This will disable the collection of both metrics and logs. Please use following fields in AnalytcsProfile to control this behavior instead. disable_vs_analytics (for VirtualServices metrics), disable_server_analytics (for Pool metrics) and client_log_config (for logs). Field deprecated in 18.2.1. Field introduced in 17.2.4.
   * @return enabled
  **/
  @ApiModelProperty(value = "[DEPRECATED] Disable Analytics on this VirtualService. This will disable the collection of both metrics and logs. Please use following fields in AnalytcsProfile to control this behavior instead. disable_vs_analytics (for VirtualServices metrics), disable_server_analytics (for Pool metrics) and client_log_config (for logs). Field deprecated in 18.2.1. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * Placeholder for description of property full_client_logs of obj type AnalyticsPolicy field type str  type object
   * @return fullClientLogs
  **/
  @ApiModelProperty(value = "Placeholder for description of property full_client_logs of obj type AnalyticsPolicy field type str  type object")

  @Valid

 
  @VsoMethod  
  public FullClientLogs getFullClientLogs() {
    return fullClientLogs;
  }
    
  @VsoMethod
  public void setFullClientLogs(FullClientLogs fullClientLogs) {
    this.fullClientLogs = fullClientLogs;
  }

  
  /**
   * Settings to turn on realtime metrics and set duration for realtime updates.
   * @return metricsRealtimeUpdate
  **/
  @ApiModelProperty(value = "Settings to turn on realtime metrics and set duration for realtime updates.")

  @Valid

 
  @VsoMethod  
  public MetricsRealTimeUpdate getMetricsRealtimeUpdate() {
    return metricsRealtimeUpdate;
  }
    
  @VsoMethod
  public void setMetricsRealtimeUpdate(MetricsRealTimeUpdate metricsRealtimeUpdate) {
    this.metricsRealtimeUpdate = metricsRealtimeUpdate;
  }

  
  /**
   * This setting limits the number of significant logs generated per second for this VS on each SE. Default is 10 logs per second. Set it to zero (0) to disable throttling. Field introduced in 17.1.3.
   * @return significantLogThrottle
  **/
  @ApiModelProperty(value = "This setting limits the number of significant logs generated per second for this VS on each SE. Default is 10 logs per second. Set it to zero (0) to disable throttling. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Integer getSignificantLogThrottle() {
    return significantLogThrottle;
  }
    
  @VsoMethod
  public void setSignificantLogThrottle(Integer significantLogThrottle) {
    this.significantLogThrottle = significantLogThrottle;
  }

  
  /**
   * This setting limits the total number of UDF logs generated per second for this VS on each SE. UDF logs are generated due to the configured client log filters or the rules with logging enabled. Default is 10 logs per second. Set it to zero (0) to disable throttling. Field introduced in 17.1.3.
   * @return udfLogThrottle
  **/
  @ApiModelProperty(value = "This setting limits the total number of UDF logs generated per second for this VS on each SE. UDF logs are generated due to the configured client log filters or the rules with logging enabled. Default is 10 logs per second. Set it to zero (0) to disable throttling. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Integer getUdfLogThrottle() {
    return udfLogThrottle;
  }
    
  @VsoMethod
  public void setUdfLogThrottle(Integer udfLogThrottle) {
    this.udfLogThrottle = udfLogThrottle;
  }

  
  public String getObjectID() {
		return "AnalyticsPolicy";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsPolicy analyticsPolicy = (AnalyticsPolicy) o;
    return Objects.equals(this.allHeaders, analyticsPolicy.allHeaders) &&
        Objects.equals(this.clientInsights, analyticsPolicy.clientInsights) &&
        Objects.equals(this.clientInsightsSampling, analyticsPolicy.clientInsightsSampling) &&
        Objects.equals(this.clientLogFilters, analyticsPolicy.clientLogFilters) &&
        Objects.equals(this.enabled, analyticsPolicy.enabled) &&
        Objects.equals(this.fullClientLogs, analyticsPolicy.fullClientLogs) &&
        Objects.equals(this.metricsRealtimeUpdate, analyticsPolicy.metricsRealtimeUpdate) &&
        Objects.equals(this.significantLogThrottle, analyticsPolicy.significantLogThrottle) &&
        Objects.equals(this.udfLogThrottle, analyticsPolicy.udfLogThrottle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allHeaders, clientInsights, clientInsightsSampling, clientLogFilters, enabled, fullClientLogs, metricsRealtimeUpdate, significantLogThrottle, udfLogThrottle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsPolicy {\n");
    
    sb.append("    allHeaders: ").append(toIndentedString(allHeaders)).append("\n");
    sb.append("    clientInsights: ").append(toIndentedString(clientInsights)).append("\n");
    sb.append("    clientInsightsSampling: ").append(toIndentedString(clientInsightsSampling)).append("\n");
    sb.append("    clientLogFilters: ").append(toIndentedString(clientLogFilters)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    fullClientLogs: ").append(toIndentedString(fullClientLogs)).append("\n");
    sb.append("    metricsRealtimeUpdate: ").append(toIndentedString(metricsRealtimeUpdate)).append("\n");
    sb.append("    significantLogThrottle: ").append(toIndentedString(significantLogThrottle)).append("\n");
    sb.append("    udfLogThrottle: ").append(toIndentedString(udfLogThrottle)).append("\n");
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

