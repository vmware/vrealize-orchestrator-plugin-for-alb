package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.HealthMonitorAuthInfo;
import com.vmware.avi.vro.model.HealthMonitorDNS;
import com.vmware.avi.vro.model.HealthMonitorExternal;
import com.vmware.avi.vro.model.HealthMonitorHttp;
import com.vmware.avi.vro.model.HealthMonitorHttp;
import com.vmware.avi.vro.model.HealthMonitorRadius;
import com.vmware.avi.vro.model.HealthMonitorSIP;
import com.vmware.avi.vro.model.HealthMonitorTcp;
import com.vmware.avi.vro.model.HealthMonitorUdp;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HealthMonitor is a POJO class extends AviRestResource that used for creating
 * HealthMonitor.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HealthMonitor")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITOR, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HealthMonitor extends AviRestResource {
  @JsonProperty("allow_duplicate_monitors")
  @JsonInclude(Include.NON_NULL)
  private Boolean allowDuplicateMonitors = null;

  @JsonProperty("authentication")
  @JsonInclude(Include.NON_NULL)
  private HealthMonitorAuthInfo authentication = null;

  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("disable_quickstart")
  @JsonInclude(Include.NON_NULL)
  private Boolean disableQuickstart = null;

  @JsonProperty("dns_monitor")
  @JsonInclude(Include.NON_NULL)
  private HealthMonitorDNS dnsMonitor = null;

  @JsonProperty("external_monitor")
  @JsonInclude(Include.NON_NULL)
  private HealthMonitorExternal externalMonitor = null;

  @JsonProperty("failed_checks")
  @JsonInclude(Include.NON_NULL)
  private Integer failedChecks = 2;

  @JsonProperty("http_monitor")
  @JsonInclude(Include.NON_NULL)
  private HealthMonitorHttp httpMonitor = null;

  @JsonProperty("https_monitor")
  @JsonInclude(Include.NON_NULL)
  private HealthMonitorHttp httpsMonitor = null;

  @JsonProperty("is_federated")
  @JsonInclude(Include.NON_NULL)
  private Boolean isFederated = false;

  @JsonProperty("monitor_port")
  @JsonInclude(Include.NON_NULL)
  private Integer monitorPort = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("radius_monitor")
  @JsonInclude(Include.NON_NULL)
  private HealthMonitorRadius radiusMonitor = null;

  @JsonProperty("receive_timeout")
  @JsonInclude(Include.NON_NULL)
  private Integer receiveTimeout = 4;

  @JsonProperty("send_interval")
  @JsonInclude(Include.NON_NULL)
  private Integer sendInterval = 10;

  @JsonProperty("sip_monitor")
  @JsonInclude(Include.NON_NULL)
  private HealthMonitorSIP sipMonitor = null;

  @JsonProperty("successful_checks")
  @JsonInclude(Include.NON_NULL)
  private Integer successfulChecks = 2;

  @JsonProperty("tcp_monitor")
  @JsonInclude(Include.NON_NULL)
  private HealthMonitorTcp tcpMonitor = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("type")
  @JsonInclude(Include.NON_NULL)
  private String type = null;

  @JsonProperty("udp_monitor")
  @JsonInclude(Include.NON_NULL)
  private HealthMonitorUdp udpMonitor = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * By default, multiple instances of the same healthmonitor to the same server are suppressed intelligently.
   * In rare cases, the monitor may have specific constructs that go beyond the server keys (ip, port, etc.) during which such suppression is not
   * desired.
   * Use this knob to allow duplicates.
   * Field introduced in 18.2.8.
   * @return allowDuplicateMonitors
   */
  @VsoMethod
  public Boolean getAllowDuplicateMonitors() {
    return allowDuplicateMonitors;
  }

  /**
   * This is the setter method to the attribute.
   * By default, multiple instances of the same healthmonitor to the same server are suppressed intelligently.
   * In rare cases, the monitor may have specific constructs that go beyond the server keys (ip, port, etc.) during which such suppression is not
   * desired.
   * Use this knob to allow duplicates.
   * Field introduced in 18.2.8.
   * @param allowDuplicateMonitors set the allowDuplicateMonitors.
   */
  @VsoMethod
  public void setAllowDuplicateMonitors(Boolean  allowDuplicateMonitors) {
    this.allowDuplicateMonitors = allowDuplicateMonitors;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Authentication information for username/password.
   * Field introduced in 20.1.1.
   * @return authentication
   */
  @VsoMethod
  public HealthMonitorAuthInfo getAuthentication() {
    return authentication;
  }

  /**
   * This is the setter method to the attribute.
   * Authentication information for username/password.
   * Field introduced in 20.1.1.
   * @param authentication set the authentication.
   */
  @VsoMethod
  public void setAuthentication(HealthMonitorAuthInfo authentication) {
    this.authentication = authentication;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User defined description for the object.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * User defined description for the object.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * During addition of a server or healthmonitors or during bootup, avi performs sequential health checks rather than waiting for send-interval to
   * kick in, to mark the server up as soon as possible.
   * This knob may be used to turn this feature off.
   * Field introduced in 18.2.7.
   * @return disableQuickstart
   */
  @VsoMethod
  public Boolean getDisableQuickstart() {
    return disableQuickstart;
  }

  /**
   * This is the setter method to the attribute.
   * During addition of a server or healthmonitors or during bootup, avi performs sequential health checks rather than waiting for send-interval to
   * kick in, to mark the server up as soon as possible.
   * This knob may be used to turn this feature off.
   * Field introduced in 18.2.7.
   * @param disableQuickstart set the disableQuickstart.
   */
  @VsoMethod
  public void setDisableQuickstart(Boolean  disableQuickstart) {
    this.disableQuickstart = disableQuickstart;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property dns_monitor of obj type healthmonitor field type str  type ref.
   * @return dnsMonitor
   */
  @VsoMethod
  public HealthMonitorDNS getDnsMonitor() {
    return dnsMonitor;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property dns_monitor of obj type healthmonitor field type str  type ref.
   * @param dnsMonitor set the dnsMonitor.
   */
  @VsoMethod
  public void setDnsMonitor(HealthMonitorDNS dnsMonitor) {
    this.dnsMonitor = dnsMonitor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property external_monitor of obj type healthmonitor field type str  type ref.
   * @return externalMonitor
   */
  @VsoMethod
  public HealthMonitorExternal getExternalMonitor() {
    return externalMonitor;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property external_monitor of obj type healthmonitor field type str  type ref.
   * @param externalMonitor set the externalMonitor.
   */
  @VsoMethod
  public void setExternalMonitor(HealthMonitorExternal externalMonitor) {
    this.externalMonitor = externalMonitor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of continuous failed health checks before the server is marked down.
   * Allowed values are 1-50.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return failedChecks
   */
  @VsoMethod
  public Integer getFailedChecks() {
    return failedChecks;
  }

  /**
   * This is the setter method to the attribute.
   * Number of continuous failed health checks before the server is marked down.
   * Allowed values are 1-50.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param failedChecks set the failedChecks.
   */
  @VsoMethod
  public void setFailedChecks(Integer  failedChecks) {
    this.failedChecks = failedChecks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property http_monitor of obj type healthmonitor field type str  type ref.
   * @return httpMonitor
   */
  @VsoMethod
  public HealthMonitorHttp getHttpMonitor() {
    return httpMonitor;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property http_monitor of obj type healthmonitor field type str  type ref.
   * @param httpMonitor set the httpMonitor.
   */
  @VsoMethod
  public void setHttpMonitor(HealthMonitorHttp httpMonitor) {
    this.httpMonitor = httpMonitor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property https_monitor of obj type healthmonitor field type str  type ref.
   * @return httpsMonitor
   */
  @VsoMethod
  public HealthMonitorHttp getHttpsMonitor() {
    return httpsMonitor;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property https_monitor of obj type healthmonitor field type str  type ref.
   * @param httpsMonitor set the httpsMonitor.
   */
  @VsoMethod
  public void setHttpsMonitor(HealthMonitorHttp httpsMonitor) {
    this.httpsMonitor = httpsMonitor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field describes the object's replication scope.
   * If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.
   * If the field is set to true, then the object is replicated across the federation.
   * Field introduced in 17.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isFederated
   */
  @VsoMethod
  public Boolean getIsFederated() {
    return isFederated;
  }

  /**
   * This is the setter method to the attribute.
   * This field describes the object's replication scope.
   * If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.
   * If the field is set to true, then the object is replicated across the federation.
   * Field introduced in 17.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isFederated set the isFederated.
   */
  @VsoMethod
  public void setIsFederated(Boolean  isFederated) {
    this.isFederated = isFederated;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use this port instead of the port defined for the server in the pool.
   * If the monitor succeeds to this port, the load balanced traffic will still be sent to the port of the server defined within the pool.
   * Allowed values are 1-65535.
   * Special values are 0 - 'use server port'.
   * @return monitorPort
   */
  @VsoMethod
  public Integer getMonitorPort() {
    return monitorPort;
  }

  /**
   * This is the setter method to the attribute.
   * Use this port instead of the port defined for the server in the pool.
   * If the monitor succeeds to this port, the load balanced traffic will still be sent to the port of the server defined within the pool.
   * Allowed values are 1-65535.
   * Special values are 0 - 'use server port'.
   * @param monitorPort set the monitorPort.
   */
  @VsoMethod
  public void setMonitorPort(Integer  monitorPort) {
    this.monitorPort = monitorPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A user friendly name for this health monitor.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * A user friendly name for this health monitor.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Health monitor for radius.
   * Field introduced in 18.2.3.
   * @return radiusMonitor
   */
  @VsoMethod
  public HealthMonitorRadius getRadiusMonitor() {
    return radiusMonitor;
  }

  /**
   * This is the setter method to the attribute.
   * Health monitor for radius.
   * Field introduced in 18.2.3.
   * @param radiusMonitor set the radiusMonitor.
   */
  @VsoMethod
  public void setRadiusMonitor(HealthMonitorRadius radiusMonitor) {
    this.radiusMonitor = radiusMonitor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A valid response from the server is expected within the receive timeout window.
   * This timeout must be less than the send interval.
   * If server status is regularly flapping up and down, consider increasing this value.
   * Allowed values are 1-2400.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @return receiveTimeout
   */
  @VsoMethod
  public Integer getReceiveTimeout() {
    return receiveTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * A valid response from the server is expected within the receive timeout window.
   * This timeout must be less than the send interval.
   * If server status is regularly flapping up and down, consider increasing this value.
   * Allowed values are 1-2400.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @param receiveTimeout set the receiveTimeout.
   */
  @VsoMethod
  public void setReceiveTimeout(Integer  receiveTimeout) {
    this.receiveTimeout = receiveTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Frequency, in seconds, that monitors are sent to a server.
   * Allowed values are 1-3600.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return sendInterval
   */
  @VsoMethod
  public Integer getSendInterval() {
    return sendInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Frequency, in seconds, that monitors are sent to a server.
   * Allowed values are 1-3600.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param sendInterval set the sendInterval.
   */
  @VsoMethod
  public void setSendInterval(Integer  sendInterval) {
    this.sendInterval = sendInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Health monitor for sip.
   * Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * @return sipMonitor
   */
  @VsoMethod
  public HealthMonitorSIP getSipMonitor() {
    return sipMonitor;
  }

  /**
   * This is the setter method to the attribute.
   * Health monitor for sip.
   * Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * @param sipMonitor set the sipMonitor.
   */
  @VsoMethod
  public void setSipMonitor(HealthMonitorSIP sipMonitor) {
    this.sipMonitor = sipMonitor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of continuous successful health checks before server is marked up.
   * Allowed values are 1-50.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return successfulChecks
   */
  @VsoMethod
  public Integer getSuccessfulChecks() {
    return successfulChecks;
  }

  /**
   * This is the setter method to the attribute.
   * Number of continuous successful health checks before server is marked up.
   * Allowed values are 1-50.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param successfulChecks set the successfulChecks.
   */
  @VsoMethod
  public void setSuccessfulChecks(Integer  successfulChecks) {
    this.successfulChecks = successfulChecks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property tcp_monitor of obj type healthmonitor field type str  type ref.
   * @return tcpMonitor
   */
  @VsoMethod
  public HealthMonitorTcp getTcpMonitor() {
    return tcpMonitor;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property tcp_monitor of obj type healthmonitor field type str  type ref.
   * @param tcpMonitor set the tcpMonitor.
   */
  @VsoMethod
  public void setTcpMonitor(HealthMonitorTcp tcpMonitor) {
    this.tcpMonitor = tcpMonitor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of the health monitor.
   * Enum options - HEALTH_MONITOR_PING, HEALTH_MONITOR_TCP, HEALTH_MONITOR_HTTP, HEALTH_MONITOR_HTTPS, HEALTH_MONITOR_EXTERNAL, HEALTH_MONITOR_UDP,
   * HEALTH_MONITOR_DNS, HEALTH_MONITOR_GSLB, HEALTH_MONITOR_SIP, HEALTH_MONITOR_RADIUS.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of the health monitor.
   * Enum options - HEALTH_MONITOR_PING, HEALTH_MONITOR_TCP, HEALTH_MONITOR_HTTP, HEALTH_MONITOR_HTTPS, HEALTH_MONITOR_EXTERNAL, HEALTH_MONITOR_UDP,
   * HEALTH_MONITOR_DNS, HEALTH_MONITOR_GSLB, HEALTH_MONITOR_SIP, HEALTH_MONITOR_RADIUS.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property udp_monitor of obj type healthmonitor field type str  type ref.
   * @return udpMonitor
   */
  @VsoMethod
  public HealthMonitorUdp getUdpMonitor() {
    return udpMonitor;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property udp_monitor of obj type healthmonitor field type str  type ref.
   * @param udpMonitor set the udpMonitor.
   */
  @VsoMethod
  public void setUdpMonitor(HealthMonitorUdp udpMonitor) {
    this.udpMonitor = udpMonitor;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the health monitor.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the health monitor.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HealthMonitor objHealthMonitor = (HealthMonitor) o;
  return   Objects.equals(this.uuid, objHealthMonitor.uuid)&&
  Objects.equals(this.name, objHealthMonitor.name)&&
  Objects.equals(this.sendInterval, objHealthMonitor.sendInterval)&&
  Objects.equals(this.receiveTimeout, objHealthMonitor.receiveTimeout)&&
  Objects.equals(this.successfulChecks, objHealthMonitor.successfulChecks)&&
  Objects.equals(this.failedChecks, objHealthMonitor.failedChecks)&&
  Objects.equals(this.type, objHealthMonitor.type)&&
  Objects.equals(this.tcpMonitor, objHealthMonitor.tcpMonitor)&&
  Objects.equals(this.httpMonitor, objHealthMonitor.httpMonitor)&&
  Objects.equals(this.httpsMonitor, objHealthMonitor.httpsMonitor)&&
  Objects.equals(this.externalMonitor, objHealthMonitor.externalMonitor)&&
  Objects.equals(this.udpMonitor, objHealthMonitor.udpMonitor)&&
  Objects.equals(this.dnsMonitor, objHealthMonitor.dnsMonitor)&&
  Objects.equals(this.monitorPort, objHealthMonitor.monitorPort)&&
  Objects.equals(this.sipMonitor, objHealthMonitor.sipMonitor)&&
  Objects.equals(this.radiusMonitor, objHealthMonitor.radiusMonitor)&&
  Objects.equals(this.disableQuickstart, objHealthMonitor.disableQuickstart)&&
  Objects.equals(this.allowDuplicateMonitors, objHealthMonitor.allowDuplicateMonitors)&&
  Objects.equals(this.authentication, objHealthMonitor.authentication)&&
  Objects.equals(this.isFederated, objHealthMonitor.isFederated)&&
  Objects.equals(this.description, objHealthMonitor.description)&&
  Objects.equals(this.tenantRef, objHealthMonitor.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HealthMonitor {\n");
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

