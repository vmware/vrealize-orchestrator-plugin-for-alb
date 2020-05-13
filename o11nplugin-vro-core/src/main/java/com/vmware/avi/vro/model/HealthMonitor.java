package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HealthMonitorAuthInfo;
import com.vmware.avi.vro.model.HealthMonitorDNS;
import com.vmware.avi.vro.model.HealthMonitorExternal;
import com.vmware.avi.vro.model.HealthMonitorHttp;
import com.vmware.avi.vro.model.HealthMonitorRadius;
import com.vmware.avi.vro.model.HealthMonitorSIP;
import com.vmware.avi.vro.model.HealthMonitorTcp;
import com.vmware.avi.vro.model.HealthMonitorUdp;
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
 * HealthMonitor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HealthMonitor")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITOR, idAccessor = "getObjectID()")
@Service
public class HealthMonitor extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("allow_duplicate_monitors")
  private Boolean allowDuplicateMonitors = null;

  @JsonProperty("authentication")
  private HealthMonitorAuthInfo authentication = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("disable_quickstart")
  private Boolean disableQuickstart = null;

  @JsonProperty("dns_monitor")
  private HealthMonitorDNS dnsMonitor = null;

  @JsonProperty("external_monitor")
  private HealthMonitorExternal externalMonitor = null;

  @JsonProperty("failed_checks")
  private Integer failedChecks = 2;

  @JsonProperty("http_monitor")
  private HealthMonitorHttp httpMonitor = null;

  @JsonProperty("https_monitor")
  private HealthMonitorHttp httpsMonitor = null;

  @JsonProperty("is_federated")
  private Boolean isFederated = null;

  @JsonProperty("monitor_port")
  private Integer monitorPort = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("radius_monitor")
  private HealthMonitorRadius radiusMonitor = null;

  @JsonProperty("receive_timeout")
  private Integer receiveTimeout = 4;

  @JsonProperty("send_interval")
  private Integer sendInterval = 10;

  @JsonProperty("sip_monitor")
  private HealthMonitorSIP sipMonitor = null;

  @JsonProperty("successful_checks")
  private Integer successfulChecks = 2;

  @JsonProperty("tcp_monitor")
  private HealthMonitorTcp tcpMonitor = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("udp_monitor")
  private HealthMonitorUdp udpMonitor = null;

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
   * By default, multiple instances of the same healthmonitor to the same server are suppressed intelligently. In rare cases, the monitor may have specific constructs that go beyond the server keys (ip, port, etc.) during which such suppression is not desired. Use this knob to allow duplicates. Field introduced in 18.2.8.
   * @return allowDuplicateMonitors
  **/
  @ApiModelProperty(value = "By default, multiple instances of the same healthmonitor to the same server are suppressed intelligently. In rare cases, the monitor may have specific constructs that go beyond the server keys (ip, port, etc.) during which such suppression is not desired. Use this knob to allow duplicates. Field introduced in 18.2.8.")


 
  @VsoMethod  
  public Boolean isAllowDuplicateMonitors() {
    return allowDuplicateMonitors;
  }
    
  @VsoMethod
  public void setAllowDuplicateMonitors(Boolean allowDuplicateMonitors) {
    this.allowDuplicateMonitors = allowDuplicateMonitors;
  }

  
  /**
   * Authentication information for username/password. Field introduced in 20.1.1.
   * @return authentication
  **/
  @ApiModelProperty(value = "Authentication information for username/password. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public HealthMonitorAuthInfo getAuthentication() {
    return authentication;
  }
    
  @VsoMethod
  public void setAuthentication(HealthMonitorAuthInfo authentication) {
    this.authentication = authentication;
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
   * During addition of a server or healthmonitors or during bootup, Avi performs sequential health checks rather than waiting for send-interval to kick in, to mark the server up as soon as possible. This knob may be used to turn this feature off. Field introduced in 18.2.7.
   * @return disableQuickstart
  **/
  @ApiModelProperty(value = "During addition of a server or healthmonitors or during bootup, Avi performs sequential health checks rather than waiting for send-interval to kick in, to mark the server up as soon as possible. This knob may be used to turn this feature off. Field introduced in 18.2.7.")


 
  @VsoMethod  
  public Boolean isDisableQuickstart() {
    return disableQuickstart;
  }
    
  @VsoMethod
  public void setDisableQuickstart(Boolean disableQuickstart) {
    this.disableQuickstart = disableQuickstart;
  }

  
  /**
   * Placeholder for description of property dns_monitor of obj type HealthMonitor field type str  type object
   * @return dnsMonitor
  **/
  @ApiModelProperty(value = "Placeholder for description of property dns_monitor of obj type HealthMonitor field type str  type object")

  @Valid

 
  @VsoMethod  
  public HealthMonitorDNS getDnsMonitor() {
    return dnsMonitor;
  }
    
  @VsoMethod
  public void setDnsMonitor(HealthMonitorDNS dnsMonitor) {
    this.dnsMonitor = dnsMonitor;
  }

  
  /**
   * Placeholder for description of property external_monitor of obj type HealthMonitor field type str  type object
   * @return externalMonitor
  **/
  @ApiModelProperty(value = "Placeholder for description of property external_monitor of obj type HealthMonitor field type str  type object")

  @Valid

 
  @VsoMethod  
  public HealthMonitorExternal getExternalMonitor() {
    return externalMonitor;
  }
    
  @VsoMethod
  public void setExternalMonitor(HealthMonitorExternal externalMonitor) {
    this.externalMonitor = externalMonitor;
  }

  
  /**
   * Number of continuous failed health checks before the server is marked down. Allowed values are 1-50.
   * @return failedChecks
  **/
  @ApiModelProperty(value = "Number of continuous failed health checks before the server is marked down. Allowed values are 1-50.")


 
  @VsoMethod  
  public Integer getFailedChecks() {
    return failedChecks;
  }
    
  @VsoMethod
  public void setFailedChecks(Integer failedChecks) {
    this.failedChecks = failedChecks;
  }

  
  /**
   * Placeholder for description of property http_monitor of obj type HealthMonitor field type str  type object
   * @return httpMonitor
  **/
  @ApiModelProperty(value = "Placeholder for description of property http_monitor of obj type HealthMonitor field type str  type object")

  @Valid

 
  @VsoMethod  
  public HealthMonitorHttp getHttpMonitor() {
    return httpMonitor;
  }
    
  @VsoMethod
  public void setHttpMonitor(HealthMonitorHttp httpMonitor) {
    this.httpMonitor = httpMonitor;
  }

  
  /**
   * Placeholder for description of property https_monitor of obj type HealthMonitor field type str  type object
   * @return httpsMonitor
  **/
  @ApiModelProperty(value = "Placeholder for description of property https_monitor of obj type HealthMonitor field type str  type object")

  @Valid

 
  @VsoMethod  
  public HealthMonitorHttp getHttpsMonitor() {
    return httpsMonitor;
  }
    
  @VsoMethod
  public void setHttpsMonitor(HealthMonitorHttp httpsMonitor) {
    this.httpsMonitor = httpsMonitor;
  }

  
  /**
   * This field describes the object's replication scope. If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.  If the field is set to true, then the object is replicated across the federation.  . Field introduced in 17.1.3.
   * @return isFederated
  **/
  @ApiModelProperty(value = "This field describes the object's replication scope. If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.  If the field is set to true, then the object is replicated across the federation.  . Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Boolean isIsFederated() {
    return isFederated;
  }
    
  @VsoMethod
  public void setIsFederated(Boolean isFederated) {
    this.isFederated = isFederated;
  }

  
  /**
   * Use this port instead of the port defined for the server in the Pool. If the monitor succeeds to this port, the load balanced traffic will still be sent to the port of the server defined within the Pool. Allowed values are 1-65535. Special values are 0 - 'Use server port'.
   * @return monitorPort
  **/
  @ApiModelProperty(value = "Use this port instead of the port defined for the server in the Pool. If the monitor succeeds to this port, the load balanced traffic will still be sent to the port of the server defined within the Pool. Allowed values are 1-65535. Special values are 0 - 'Use server port'.")


 
  @VsoMethod  
  public Integer getMonitorPort() {
    return monitorPort;
  }
    
  @VsoMethod
  public void setMonitorPort(Integer monitorPort) {
    this.monitorPort = monitorPort;
  }

  
  /**
   * A user friendly name for this health monitor.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A user friendly name for this health monitor.")
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
   * Health monitor for Radius. Field introduced in 18.2.3.
   * @return radiusMonitor
  **/
  @ApiModelProperty(value = "Health monitor for Radius. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public HealthMonitorRadius getRadiusMonitor() {
    return radiusMonitor;
  }
    
  @VsoMethod
  public void setRadiusMonitor(HealthMonitorRadius radiusMonitor) {
    this.radiusMonitor = radiusMonitor;
  }

  
  /**
   * A valid response from the server is expected within the receive timeout window.  This timeout must be less than the send interval.  If server status is regularly flapping up and down, consider increasing this value. Allowed values are 1-2400.
   * @return receiveTimeout
  **/
  @ApiModelProperty(value = "A valid response from the server is expected within the receive timeout window.  This timeout must be less than the send interval.  If server status is regularly flapping up and down, consider increasing this value. Allowed values are 1-2400.")


 
  @VsoMethod  
  public Integer getReceiveTimeout() {
    return receiveTimeout;
  }
    
  @VsoMethod
  public void setReceiveTimeout(Integer receiveTimeout) {
    this.receiveTimeout = receiveTimeout;
  }

  
  /**
   * Frequency, in seconds, that monitors are sent to a server. Allowed values are 1-3600.
   * @return sendInterval
  **/
  @ApiModelProperty(value = "Frequency, in seconds, that monitors are sent to a server. Allowed values are 1-3600.")


 
  @VsoMethod  
  public Integer getSendInterval() {
    return sendInterval;
  }
    
  @VsoMethod
  public void setSendInterval(Integer sendInterval) {
    this.sendInterval = sendInterval;
  }

  
  /**
   * Health monitor for SIP. Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * @return sipMonitor
  **/
  @ApiModelProperty(value = "Health monitor for SIP. Field introduced in 17.2.8, 18.1.3, 18.2.1.")

  @Valid

 
  @VsoMethod  
  public HealthMonitorSIP getSipMonitor() {
    return sipMonitor;
  }
    
  @VsoMethod
  public void setSipMonitor(HealthMonitorSIP sipMonitor) {
    this.sipMonitor = sipMonitor;
  }

  
  /**
   * Number of continuous successful health checks before server is marked up. Allowed values are 1-50.
   * @return successfulChecks
  **/
  @ApiModelProperty(value = "Number of continuous successful health checks before server is marked up. Allowed values are 1-50.")


 
  @VsoMethod  
  public Integer getSuccessfulChecks() {
    return successfulChecks;
  }
    
  @VsoMethod
  public void setSuccessfulChecks(Integer successfulChecks) {
    this.successfulChecks = successfulChecks;
  }

  
  /**
   * Placeholder for description of property tcp_monitor of obj type HealthMonitor field type str  type object
   * @return tcpMonitor
  **/
  @ApiModelProperty(value = "Placeholder for description of property tcp_monitor of obj type HealthMonitor field type str  type object")

  @Valid

 
  @VsoMethod  
  public HealthMonitorTcp getTcpMonitor() {
    return tcpMonitor;
  }
    
  @VsoMethod
  public void setTcpMonitor(HealthMonitorTcp tcpMonitor) {
    this.tcpMonitor = tcpMonitor;
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
   * Type of the health monitor. Enum options - HEALTH_MONITOR_PING, HEALTH_MONITOR_TCP, HEALTH_MONITOR_HTTP, HEALTH_MONITOR_HTTPS, HEALTH_MONITOR_EXTERNAL, HEALTH_MONITOR_UDP, HEALTH_MONITOR_DNS, HEALTH_MONITOR_GSLB, HEALTH_MONITOR_SIP, HEALTH_MONITOR_RADIUS.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of the health monitor. Enum options - HEALTH_MONITOR_PING, HEALTH_MONITOR_TCP, HEALTH_MONITOR_HTTP, HEALTH_MONITOR_HTTPS, HEALTH_MONITOR_EXTERNAL, HEALTH_MONITOR_UDP, HEALTH_MONITOR_DNS, HEALTH_MONITOR_GSLB, HEALTH_MONITOR_SIP, HEALTH_MONITOR_RADIUS.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Placeholder for description of property udp_monitor of obj type HealthMonitor field type str  type object
   * @return udpMonitor
  **/
  @ApiModelProperty(value = "Placeholder for description of property udp_monitor of obj type HealthMonitor field type str  type object")

  @Valid

 
  @VsoMethod  
  public HealthMonitorUdp getUdpMonitor() {
    return udpMonitor;
  }
    
  @VsoMethod
  public void setUdpMonitor(HealthMonitorUdp udpMonitor) {
    this.udpMonitor = udpMonitor;
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
   * UUID of the health monitor.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the health monitor.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "HealthMonitor";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthMonitor healthMonitor = (HealthMonitor) o;
    return Objects.equals(this.lastModified, healthMonitor.lastModified) &&
        Objects.equals(this.allowDuplicateMonitors, healthMonitor.allowDuplicateMonitors) &&
        Objects.equals(this.authentication, healthMonitor.authentication) &&
        Objects.equals(this.description, healthMonitor.description) &&
        Objects.equals(this.disableQuickstart, healthMonitor.disableQuickstart) &&
        Objects.equals(this.dnsMonitor, healthMonitor.dnsMonitor) &&
        Objects.equals(this.externalMonitor, healthMonitor.externalMonitor) &&
        Objects.equals(this.failedChecks, healthMonitor.failedChecks) &&
        Objects.equals(this.httpMonitor, healthMonitor.httpMonitor) &&
        Objects.equals(this.httpsMonitor, healthMonitor.httpsMonitor) &&
        Objects.equals(this.isFederated, healthMonitor.isFederated) &&
        Objects.equals(this.monitorPort, healthMonitor.monitorPort) &&
        Objects.equals(this.name, healthMonitor.name) &&
        Objects.equals(this.radiusMonitor, healthMonitor.radiusMonitor) &&
        Objects.equals(this.receiveTimeout, healthMonitor.receiveTimeout) &&
        Objects.equals(this.sendInterval, healthMonitor.sendInterval) &&
        Objects.equals(this.sipMonitor, healthMonitor.sipMonitor) &&
        Objects.equals(this.successfulChecks, healthMonitor.successfulChecks) &&
        Objects.equals(this.tcpMonitor, healthMonitor.tcpMonitor) &&
        Objects.equals(this.tenantRef, healthMonitor.tenantRef) &&
        Objects.equals(this.type, healthMonitor.type) &&
        Objects.equals(this.udpMonitor, healthMonitor.udpMonitor) &&
        Objects.equals(this.url, healthMonitor.url) &&
        Objects.equals(this.uuid, healthMonitor.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, allowDuplicateMonitors, authentication, description, disableQuickstart, dnsMonitor, externalMonitor, failedChecks, httpMonitor, httpsMonitor, isFederated, monitorPort, name, radiusMonitor, receiveTimeout, sendInterval, sipMonitor, successfulChecks, tcpMonitor, tenantRef, type, udpMonitor, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthMonitor {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    allowDuplicateMonitors: ").append(toIndentedString(allowDuplicateMonitors)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disableQuickstart: ").append(toIndentedString(disableQuickstart)).append("\n");
    sb.append("    dnsMonitor: ").append(toIndentedString(dnsMonitor)).append("\n");
    sb.append("    externalMonitor: ").append(toIndentedString(externalMonitor)).append("\n");
    sb.append("    failedChecks: ").append(toIndentedString(failedChecks)).append("\n");
    sb.append("    httpMonitor: ").append(toIndentedString(httpMonitor)).append("\n");
    sb.append("    httpsMonitor: ").append(toIndentedString(httpsMonitor)).append("\n");
    sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
    sb.append("    monitorPort: ").append(toIndentedString(monitorPort)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    radiusMonitor: ").append(toIndentedString(radiusMonitor)).append("\n");
    sb.append("    receiveTimeout: ").append(toIndentedString(receiveTimeout)).append("\n");
    sb.append("    sendInterval: ").append(toIndentedString(sendInterval)).append("\n");
    sb.append("    sipMonitor: ").append(toIndentedString(sipMonitor)).append("\n");
    sb.append("    successfulChecks: ").append(toIndentedString(successfulChecks)).append("\n");
    sb.append("    tcpMonitor: ").append(toIndentedString(tcpMonitor)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    udpMonitor: ").append(toIndentedString(udpMonitor)).append("\n");
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

