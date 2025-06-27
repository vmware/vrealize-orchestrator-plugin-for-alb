package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SHMSummary;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.GeoLocation;
import com.vmware.avi.vro.model.OperationalStatus;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ServerRuntimeSummary is a POJO class extends AviRestResource that used for creating
 * ServerRuntimeSummary.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ServerRuntimeSummary")
@VsoFinder(name = Constants.FINDER_VRO_SERVERRUNTIMESUMMARY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ServerRuntimeSummary extends AviRestResource {
    @JsonProperty("get_state")
    @JsonInclude(Include.NON_NULL)
    private Boolean getState = false;

    @JsonProperty("health_monitor_list")
    @JsonInclude(Include.NON_NULL)
    private SHMSummary healthMonitorList;

    @JsonProperty("hostname")
    @JsonInclude(Include.NON_NULL)
    private String hostname;

    @JsonProperty("ip_addr")
    @JsonInclude(Include.NON_NULL)
    private IpAddr ipAddr;

    @JsonProperty("is_local")
    @JsonInclude(Include.NON_NULL)
    private Boolean isLocal = true;

    @JsonProperty("is_standby")
    @JsonInclude(Include.NON_NULL)
    private Boolean isStandby = false;

    @JsonProperty("location")
    @JsonInclude(Include.NON_NULL)
    private GeoLocation location;

    @JsonProperty("oper_status")
    @JsonInclude(Include.NON_NULL)
    private OperationalStatus operStatus;

    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private Integer port;

    @JsonProperty("resolve_server_by_dns")
    @JsonInclude(Include.NON_NULL)
    private Boolean resolveServerByDns = false;

    @JsonProperty("se_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seUuid;

    @JsonProperty("vs_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vsUuid;



  /**
   * This is the getter method this will return the attribute value.
   * Flag set by the non-owner service engines to indicate that they need to get state for this server from controller.
   * Field introduced in 18.2.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return getState
   */
  @VsoMethod
  public Boolean getGetState() {
    return getState;
  }

  /**
   * This is the setter method to the attribute.
   * Flag set by the non-owner service engines to indicate that they need to get state for this server from controller.
   * Field introduced in 18.2.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param getState set the getState.
   */
  @VsoMethod
  public void setGetState(Boolean  getState) {
    this.getState = getState;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Health monitor name, state and reason if down.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return healthMonitorList
   */
  @VsoMethod
  public SHMSummary getHealthMonitorList() {
    return healthMonitorList;
  }

  /**
   * This is the setter method to the attribute.
   * Health monitor name, state and reason if down.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param healthMonitorList set the healthMonitorList.
   */
  @VsoMethod
  public void setHealthMonitorList(SHMSummary healthMonitorList) {
    this.healthMonitorList = healthMonitorList;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostname
   */
  @VsoMethod
  public String getHostname() {
    return hostname;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostname set the hostname.
   */
  @VsoMethod
  public void setHostname(String  hostname) {
    this.hostname = hostname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddr
   */
  @VsoMethod
  public IpAddr getIpAddr() {
    return ipAddr;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipAddr set the ipAddr.
   */
  @VsoMethod
  public void setIpAddr(IpAddr ipAddr) {
    this.ipAddr = ipAddr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return isLocal
   */
  @VsoMethod
  public Boolean getIsLocal() {
    return isLocal;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param isLocal set the isLocal.
   */
  @VsoMethod
  public void setIsLocal(Boolean  isLocal) {
    this.isLocal = isLocal;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isStandby
   */
  @VsoMethod
  public Boolean getIsStandby() {
    return isStandby;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isStandby set the isStandby.
   */
  @VsoMethod
  public void setIsStandby(Boolean  isStandby) {
    this.isStandby = isStandby;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Virtualservice member in case this server is a member of gs group, and geo location available.
   * Field introduced in 17.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return location
   */
  @VsoMethod
  public GeoLocation getLocation() {
    return location;
  }

  /**
   * This is the setter method to the attribute.
   * Virtualservice member in case this server is a member of gs group, and geo location available.
   * Field introduced in 17.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param location set the location.
   */
  @VsoMethod
  public void setLocation(GeoLocation location) {
    this.location = location;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return operStatus
   */
  @VsoMethod
  public OperationalStatus getOperStatus() {
    return operStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param operStatus set the operStatus.
   */
  @VsoMethod
  public void setOperStatus(OperationalStatus operStatus) {
    this.operStatus = operStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return port
   */
  @VsoMethod
  public Integer getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(Integer  port) {
    this.port = port;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag used to indicate if server or gs member hostname is resolved by dns.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return resolveServerByDns
   */
  @VsoMethod
  public Boolean getResolveServerByDns() {
    return resolveServerByDns;
  }

  /**
   * This is the setter method to the attribute.
   * Flag used to indicate if server or gs member hostname is resolved by dns.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param resolveServerByDns set the resolveServerByDns.
   */
  @VsoMethod
  public void setResolveServerByDns(Boolean  resolveServerByDns) {
    this.resolveServerByDns = resolveServerByDns;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seUuid
   */
  @VsoMethod
  public String getSeUuid() {
    return seUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seUuid set the seUuid.
   */
  @VsoMethod
  public void setSeUuid(String  seUuid) {
    this.seUuid = seUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Virtualservice member in case this server is a member of gs group.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Virtualservice member in case this server is a member of gs group.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ServerRuntimeSummary objServerRuntimeSummary = (ServerRuntimeSummary) o;
  return   Objects.equals(this.ipAddr, objServerRuntimeSummary.ipAddr)&&
  Objects.equals(this.port, objServerRuntimeSummary.port)&&
  Objects.equals(this.hostname, objServerRuntimeSummary.hostname)&&
  Objects.equals(this.operStatus, objServerRuntimeSummary.operStatus)&&
  Objects.equals(this.seUuid, objServerRuntimeSummary.seUuid)&&
  Objects.equals(this.healthMonitorList, objServerRuntimeSummary.healthMonitorList)&&
  Objects.equals(this.isStandby, objServerRuntimeSummary.isStandby)&&
  Objects.equals(this.vsUuid, objServerRuntimeSummary.vsUuid)&&
  Objects.equals(this.isLocal, objServerRuntimeSummary.isLocal)&&
  Objects.equals(this.location, objServerRuntimeSummary.location)&&
  Objects.equals(this.getState, objServerRuntimeSummary.getState)&&
  Objects.equals(this.resolveServerByDns, objServerRuntimeSummary.resolveServerByDns);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ServerRuntimeSummary {\n");
      sb.append("    getState: ").append(toIndentedString(getState)).append("\n");
        sb.append("    healthMonitorList: ").append(toIndentedString(healthMonitorList)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
        sb.append("    isLocal: ").append(toIndentedString(isLocal)).append("\n");
        sb.append("    isStandby: ").append(toIndentedString(isStandby)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    resolveServerByDns: ").append(toIndentedString(resolveServerByDns)).append("\n");
        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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

