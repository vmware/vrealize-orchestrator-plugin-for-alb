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
 * InternalGatewayMonitor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "InternalGatewayMonitor")
@VsoFinder(name = Constants.FINDER_VRO_INTERNALGATEWAYMONITOR, idAccessor = "getObjectID()")
@Service
public class InternalGatewayMonitor extends AviRestResource  {
  @JsonProperty("disable_gateway_monitor")
  private Boolean disableGatewayMonitor = null;

  @JsonProperty("gateway_monitor_failure_threshold")
  private Integer gatewayMonitorFailureThreshold = 10;

  @JsonProperty("gateway_monitor_interval")
  private Integer gatewayMonitorInterval = 1000;

  @JsonProperty("gateway_monitor_success_threshold")
  private Integer gatewayMonitorSuccessThreshold = 15;

  
  /**
   * Disable the gateway monitor for default gateway. They are monitored by default. Field introduced in 17.1.1.
   * @return disableGatewayMonitor
  **/
  @ApiModelProperty(value = "Disable the gateway monitor for default gateway. They are monitored by default. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isDisableGatewayMonitor() {
    return disableGatewayMonitor;
  }
    
  @VsoMethod
  public void setDisableGatewayMonitor(Boolean disableGatewayMonitor) {
    this.disableGatewayMonitor = disableGatewayMonitor;
  }

  
  /**
   * The number of consecutive failed gateway health checks before a gateway is marked down. Allowed values are 3-50. Field introduced in 17.1.1.
   * @return gatewayMonitorFailureThreshold
  **/
  @ApiModelProperty(value = "The number of consecutive failed gateway health checks before a gateway is marked down. Allowed values are 3-50. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getGatewayMonitorFailureThreshold() {
    return gatewayMonitorFailureThreshold;
  }
    
  @VsoMethod
  public void setGatewayMonitorFailureThreshold(Integer gatewayMonitorFailureThreshold) {
    this.gatewayMonitorFailureThreshold = gatewayMonitorFailureThreshold;
  }

  
  /**
   * The interval between two ping requests sent by the gateway monitor in milliseconds. If a value is not specified, requests are sent every second. Allowed values are 100-60000. Field introduced in 17.1.1.
   * @return gatewayMonitorInterval
  **/
  @ApiModelProperty(value = "The interval between two ping requests sent by the gateway monitor in milliseconds. If a value is not specified, requests are sent every second. Allowed values are 100-60000. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getGatewayMonitorInterval() {
    return gatewayMonitorInterval;
  }
    
  @VsoMethod
  public void setGatewayMonitorInterval(Integer gatewayMonitorInterval) {
    this.gatewayMonitorInterval = gatewayMonitorInterval;
  }

  
  /**
   * The number of consecutive successful gateway health checks before a gateway that was marked down by the gateway monitor is marked up. Allowed values are 3-50. Field introduced in 17.1.1.
   * @return gatewayMonitorSuccessThreshold
  **/
  @ApiModelProperty(value = "The number of consecutive successful gateway health checks before a gateway that was marked down by the gateway monitor is marked up. Allowed values are 3-50. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getGatewayMonitorSuccessThreshold() {
    return gatewayMonitorSuccessThreshold;
  }
    
  @VsoMethod
  public void setGatewayMonitorSuccessThreshold(Integer gatewayMonitorSuccessThreshold) {
    this.gatewayMonitorSuccessThreshold = gatewayMonitorSuccessThreshold;
  }

  
  public String getObjectID() {
		return "InternalGatewayMonitor";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalGatewayMonitor internalGatewayMonitor = (InternalGatewayMonitor) o;
    return Objects.equals(this.disableGatewayMonitor, internalGatewayMonitor.disableGatewayMonitor) &&
        Objects.equals(this.gatewayMonitorFailureThreshold, internalGatewayMonitor.gatewayMonitorFailureThreshold) &&
        Objects.equals(this.gatewayMonitorInterval, internalGatewayMonitor.gatewayMonitorInterval) &&
        Objects.equals(this.gatewayMonitorSuccessThreshold, internalGatewayMonitor.gatewayMonitorSuccessThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableGatewayMonitor, gatewayMonitorFailureThreshold, gatewayMonitorInterval, gatewayMonitorSuccessThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalGatewayMonitor {\n");
    
    sb.append("    disableGatewayMonitor: ").append(toIndentedString(disableGatewayMonitor)).append("\n");
    sb.append("    gatewayMonitorFailureThreshold: ").append(toIndentedString(gatewayMonitorFailureThreshold)).append("\n");
    sb.append("    gatewayMonitorInterval: ").append(toIndentedString(gatewayMonitorInterval)).append("\n");
    sb.append("    gatewayMonitorSuccessThreshold: ").append(toIndentedString(gatewayMonitorSuccessThreshold)).append("\n");
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

