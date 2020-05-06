package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * PoolAnalyticsPolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:16:36.466+05:30")

@VsoObject(create = false, name = "PoolAnalyticsPolicy")
@VsoFinder(name = Constants.FINDER_VRO_POOLANALYTICSPOLICY, idAccessor = "getObjectID()")
@Service
public class PoolAnalyticsPolicy extends AviRestResource  {
  @JsonProperty("enable_realtime_metrics")
  private Boolean enableRealtimeMetrics = null;

  
  /**
   * Enable real time metrics for server and pool metrics eg. l4_server.xxx, l7_server.xxx. Field introduced in 18.1.5, 18.2.1.
   * @return enableRealtimeMetrics
  **/
  @ApiModelProperty(value = "Enable real time metrics for server and pool metrics eg. l4_server.xxx, l7_server.xxx. Field introduced in 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public Boolean isEnableRealtimeMetrics() {
    return enableRealtimeMetrics;
  }
    
  @VsoMethod
  public void setEnableRealtimeMetrics(Boolean enableRealtimeMetrics) {
    this.enableRealtimeMetrics = enableRealtimeMetrics;
  }

  
  public String getObjectID() {
		return "PoolAnalyticsPolicy";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolAnalyticsPolicy poolAnalyticsPolicy = (PoolAnalyticsPolicy) o;
    return Objects.equals(this.enableRealtimeMetrics, poolAnalyticsPolicy.enableRealtimeMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableRealtimeMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolAnalyticsPolicy {\n");
    
    sb.append("    enableRealtimeMetrics: ").append(toIndentedString(enableRealtimeMetrics)).append("\n");
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

