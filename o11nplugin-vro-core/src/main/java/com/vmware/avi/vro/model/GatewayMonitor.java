package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
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
 * GatewayMonitor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GatewayMonitor")
@VsoFinder(name = Constants.FINDER_VRO_GATEWAYMONITOR, idAccessor = "getObjectID()")
@Service
public class GatewayMonitor extends AviRestResource  {
  @JsonProperty("gateway_ip")
  private IpAddr gatewayIp = null;

  @JsonProperty("gateway_monitor_fail_threshold")
  private Integer gatewayMonitorFailThreshold = 10;

  @JsonProperty("gateway_monitor_interval")
  private Integer gatewayMonitorInterval = 1000;

  @JsonProperty("gateway_monitor_success_threshold")
  private Integer gatewayMonitorSuccessThreshold = 15;

  @JsonProperty("subnet")
  private IpAddrPrefix subnet = null;

  
  /**
   * IP address of next hop gateway to be monitored.
   * @return gatewayIp
  **/
  @ApiModelProperty(required = true, value = "IP address of next hop gateway to be monitored.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddr getGatewayIp() {
    return gatewayIp;
  }
    
  @VsoMethod
  public void setGatewayIp(IpAddr gatewayIp) {
    this.gatewayIp = gatewayIp;
  }

  
  /**
   * The number of consecutive failed gateway health checks before a gateway is marked down. Allowed values are 3-50.
   * @return gatewayMonitorFailThreshold
  **/
  @ApiModelProperty(value = "The number of consecutive failed gateway health checks before a gateway is marked down. Allowed values are 3-50.")


 
  @VsoMethod  
  public Integer getGatewayMonitorFailThreshold() {
    return gatewayMonitorFailThreshold;
  }
    
  @VsoMethod
  public void setGatewayMonitorFailThreshold(Integer gatewayMonitorFailThreshold) {
    this.gatewayMonitorFailThreshold = gatewayMonitorFailThreshold;
  }

  
  /**
   * The interval between two ping requests sent by the gateway monitor in milliseconds. If a value is not specified, requests are sent every second. Allowed values are 100-60000.
   * @return gatewayMonitorInterval
  **/
  @ApiModelProperty(value = "The interval between two ping requests sent by the gateway monitor in milliseconds. If a value is not specified, requests are sent every second. Allowed values are 100-60000.")


 
  @VsoMethod  
  public Integer getGatewayMonitorInterval() {
    return gatewayMonitorInterval;
  }
    
  @VsoMethod
  public void setGatewayMonitorInterval(Integer gatewayMonitorInterval) {
    this.gatewayMonitorInterval = gatewayMonitorInterval;
  }

  
  /**
   * The number of consecutive successful gateway health checks before a gateway that was marked down by the gateway monitor is marked up. Allowed values are 3-50.
   * @return gatewayMonitorSuccessThreshold
  **/
  @ApiModelProperty(value = "The number of consecutive successful gateway health checks before a gateway that was marked down by the gateway monitor is marked up. Allowed values are 3-50.")


 
  @VsoMethod  
  public Integer getGatewayMonitorSuccessThreshold() {
    return gatewayMonitorSuccessThreshold;
  }
    
  @VsoMethod
  public void setGatewayMonitorSuccessThreshold(Integer gatewayMonitorSuccessThreshold) {
    this.gatewayMonitorSuccessThreshold = gatewayMonitorSuccessThreshold;
  }

  
  /**
   * Subnet providing reachability for Multi-hop Gateway. Field introduced in 18.1.1.
   * @return subnet
  **/
  @ApiModelProperty(value = "Subnet providing reachability for Multi-hop Gateway. Field introduced in 18.1.1.")

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getSubnet() {
    return subnet;
  }
    
  @VsoMethod
  public void setSubnet(IpAddrPrefix subnet) {
    this.subnet = subnet;
  }

  
  public String getObjectID() {
		return "GatewayMonitor";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayMonitor gatewayMonitor = (GatewayMonitor) o;
    return Objects.equals(this.gatewayIp, gatewayMonitor.gatewayIp) &&
        Objects.equals(this.gatewayMonitorFailThreshold, gatewayMonitor.gatewayMonitorFailThreshold) &&
        Objects.equals(this.gatewayMonitorInterval, gatewayMonitor.gatewayMonitorInterval) &&
        Objects.equals(this.gatewayMonitorSuccessThreshold, gatewayMonitor.gatewayMonitorSuccessThreshold) &&
        Objects.equals(this.subnet, gatewayMonitor.subnet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayIp, gatewayMonitorFailThreshold, gatewayMonitorInterval, gatewayMonitorSuccessThreshold, subnet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayMonitor {\n");
    
    sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
    sb.append("    gatewayMonitorFailThreshold: ").append(toIndentedString(gatewayMonitorFailThreshold)).append("\n");
    sb.append("    gatewayMonitorInterval: ").append(toIndentedString(gatewayMonitorInterval)).append("\n");
    sb.append("    gatewayMonitorSuccessThreshold: ").append(toIndentedString(gatewayMonitorSuccessThreshold)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
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

