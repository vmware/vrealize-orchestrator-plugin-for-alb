package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GatewayMonitor is a POJO class extends AviRestResource that used for creating
 * GatewayMonitor.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GatewayMonitor")
@VsoFinder(name = Constants.FINDER_VRO_GATEWAYMONITOR)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GatewayMonitor extends AviRestResource {
  @JsonProperty("gateway_ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddr gatewayIp = null;

  @JsonProperty("gateway_monitor_fail_threshold")
  @JsonInclude(Include.NON_NULL)
  private Integer gatewayMonitorFailThreshold = 10;

  @JsonProperty("gateway_monitor_interval")
  @JsonInclude(Include.NON_NULL)
  private Integer gatewayMonitorInterval = 1000;

  @JsonProperty("gateway_monitor_success_threshold")
  @JsonInclude(Include.NON_NULL)
  private Integer gatewayMonitorSuccessThreshold = 15;

  @JsonProperty("subnet")
  @JsonInclude(Include.NON_NULL)
  private IpAddrPrefix subnet = null;



  /**
   * This is the getter method this will return the attribute value.
   * Ip address of next hop gateway to be monitored.
   * @return gatewayIp
   */
  @VsoMethod
  public IpAddr getGatewayIp() {
    return gatewayIp;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address of next hop gateway to be monitored.
   * @param gatewayIp set the gatewayIp.
   */
  @VsoMethod
  public void setGatewayIp(IpAddr gatewayIp) {
    this.gatewayIp = gatewayIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The number of consecutive failed gateway health checks before a gateway is marked down.
   * Allowed values are 3-50.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return gatewayMonitorFailThreshold
   */
  @VsoMethod
  public Integer getGatewayMonitorFailThreshold() {
    return gatewayMonitorFailThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * The number of consecutive failed gateway health checks before a gateway is marked down.
   * Allowed values are 3-50.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param gatewayMonitorFailThreshold set the gatewayMonitorFailThreshold.
   */
  @VsoMethod
  public void setGatewayMonitorFailThreshold(Integer  gatewayMonitorFailThreshold) {
    this.gatewayMonitorFailThreshold = gatewayMonitorFailThreshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The interval between two ping requests sent by the gateway monitor in milliseconds.
   * If a value is not specified, requests are sent every second.
   * Allowed values are 100-60000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @return gatewayMonitorInterval
   */
  @VsoMethod
  public Integer getGatewayMonitorInterval() {
    return gatewayMonitorInterval;
  }

  /**
   * This is the setter method to the attribute.
   * The interval between two ping requests sent by the gateway monitor in milliseconds.
   * If a value is not specified, requests are sent every second.
   * Allowed values are 100-60000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @param gatewayMonitorInterval set the gatewayMonitorInterval.
   */
  @VsoMethod
  public void setGatewayMonitorInterval(Integer  gatewayMonitorInterval) {
    this.gatewayMonitorInterval = gatewayMonitorInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The number of consecutive successful gateway health checks before a gateway that was marked down by the gateway monitor is marked up.
   * Allowed values are 3-50.
   * Default value when not specified in API or module is interpreted by Avi Controller as 15.
   * @return gatewayMonitorSuccessThreshold
   */
  @VsoMethod
  public Integer getGatewayMonitorSuccessThreshold() {
    return gatewayMonitorSuccessThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * The number of consecutive successful gateway health checks before a gateway that was marked down by the gateway monitor is marked up.
   * Allowed values are 3-50.
   * Default value when not specified in API or module is interpreted by Avi Controller as 15.
   * @param gatewayMonitorSuccessThreshold set the gatewayMonitorSuccessThreshold.
   */
  @VsoMethod
  public void setGatewayMonitorSuccessThreshold(Integer  gatewayMonitorSuccessThreshold) {
    this.gatewayMonitorSuccessThreshold = gatewayMonitorSuccessThreshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Subnet providing reachability for multi-hop gateway.
   * Field introduced in 18.1.1.
   * @return subnet
   */
  @VsoMethod
  public IpAddrPrefix getSubnet() {
    return subnet;
  }

  /**
   * This is the setter method to the attribute.
   * Subnet providing reachability for multi-hop gateway.
   * Field introduced in 18.1.1.
   * @param subnet set the subnet.
   */
  @VsoMethod
  public void setSubnet(IpAddrPrefix subnet) {
    this.subnet = subnet;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GatewayMonitor objGatewayMonitor = (GatewayMonitor) o;
  return   Objects.equals(this.gatewayIp, objGatewayMonitor.gatewayIp)&&
  Objects.equals(this.gatewayMonitorInterval, objGatewayMonitor.gatewayMonitorInterval)&&
  Objects.equals(this.gatewayMonitorFailThreshold, objGatewayMonitor.gatewayMonitorFailThreshold)&&
  Objects.equals(this.gatewayMonitorSuccessThreshold, objGatewayMonitor.gatewayMonitorSuccessThreshold)&&
  Objects.equals(this.subnet, objGatewayMonitor.subnet);
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

