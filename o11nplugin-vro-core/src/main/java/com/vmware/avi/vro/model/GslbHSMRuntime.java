package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.LocalInfo;
import com.vmware.avi.vro.model.OperationalStatus;
import com.vmware.avi.vro.model.RemoteInfo;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbHSMRuntime is a POJO class extends AviRestResource that used for creating
 * GslbHSMRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbHSMRuntime")
@VsoFinder(name = Constants.FINDER_VRO_GSLBHSMRUNTIME, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbHSMRuntime extends AviRestResource {
    @JsonProperty("cluster_uuid")
    @JsonInclude(Include.NON_NULL)
    private String clusterUuid;

    @JsonProperty("enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean enabled;

    @JsonProperty("events")
    @JsonInclude(Include.NON_NULL)
    private List<EventInfo> events;

    @JsonProperty("local_info")
    @JsonInclude(Include.NON_NULL)
    private LocalInfo localInfo;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("obj_uuid")
    @JsonInclude(Include.NON_NULL)
    private String objUuid;

    @JsonProperty("oper_status")
    @JsonInclude(Include.NON_NULL)
    private OperationalStatus operStatus;

    @JsonProperty("remote_info")
    @JsonInclude(Include.NON_NULL)
    private RemoteInfo remoteInfo;

    @JsonProperty("send_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer sendInterval;

    @JsonProperty("site_name")
    @JsonInclude(Include.NON_NULL)
    private String siteName;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * The site controller cluster uuid.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clusterUuid
   */
  @VsoMethod
  public String getClusterUuid() {
    return clusterUuid;
  }

  /**
   * This is the setter method to the attribute.
   * The site controller cluster uuid.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clusterUuid set the clusterUuid.
   */
  @VsoMethod
  public void setClusterUuid(String  clusterUuid) {
    this.clusterUuid = clusterUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Represents whether hsm is enabled/disabled.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Represents whether hsm is enabled/disabled.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Events captured wrt to config replication.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public List<EventInfo> getEvents() {
    return events;
  }

  /**
   * This is the setter method. this will set the events
   * Events captured wrt to config replication.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public void setEvents(List<EventInfo>  events) {
    this.events = events;
  }

  /**
   * This is the setter method this will set the events
   * Events captured wrt to config replication.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public GslbHSMRuntime addEventsItem(EventInfo eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<EventInfo>();
    }
    this.events.add(eventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Represents local info for the site.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return localInfo
   */
  @VsoMethod
  public LocalInfo getLocalInfo() {
    return localInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Represents local info for the site.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param localInfo set the localInfo.
   */
  @VsoMethod
  public void setLocalInfo(LocalInfo localInfo) {
    this.localInfo = localInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of db entry.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * The name of db entry.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Gslb hsm runtime object uuid.
   * Points to the gslb to which this belongs.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objUuid
   */
  @VsoMethod
  public String getObjUuid() {
    return objUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Gslb hsm runtime object uuid.
   * Points to the gslb to which this belongs.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objUuid set the objUuid.
   */
  @VsoMethod
  public void setObjUuid(String  objUuid) {
    this.objUuid = objUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Gslb site operational status, represents whether site is up or down.
   * Field introduced in 31.1.1.
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
   * Gslb site operational status, represents whether site is up or down.
   * Field introduced in 31.1.1.
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
   * Remote info is basically updated by grw.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return remoteInfo
   */
  @VsoMethod
  public RemoteInfo getRemoteInfo() {
    return remoteInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Remote info is basically updated by grw.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param remoteInfo set the remoteInfo.
   */
  @VsoMethod
  public void setRemoteInfo(RemoteInfo remoteInfo) {
    this.remoteInfo = remoteInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Frequency with which group members communicate.
   * This field shadows glb_cfg.send_interval.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sendInterval
   */
  @VsoMethod
  public Integer getSendInterval() {
    return sendInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Frequency with which group members communicate.
   * This field shadows glb_cfg.send_interval.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sendInterval set the sendInterval.
   */
  @VsoMethod
  public void setSendInterval(Integer  sendInterval) {
    this.sendInterval = sendInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The gslb site name.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return siteName
   */
  @VsoMethod
  public String getSiteName() {
    return siteName;
  }

  /**
   * This is the setter method to the attribute.
   * The gslb site name.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param siteName set the siteName.
   */
  @VsoMethod
  public void setSiteName(String  siteName) {
    this.siteName = siteName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
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
   * The uuid of db entry.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * The uuid of db entry.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  GslbHSMRuntime objGslbHSMRuntime = (GslbHSMRuntime) o;
  return   Objects.equals(this.uuid, objGslbHSMRuntime.uuid)&&
  Objects.equals(this.name, objGslbHSMRuntime.name)&&
  Objects.equals(this.clusterUuid, objGslbHSMRuntime.clusterUuid)&&
  Objects.equals(this.siteName, objGslbHSMRuntime.siteName)&&
  Objects.equals(this.objUuid, objGslbHSMRuntime.objUuid)&&
  Objects.equals(this.enabled, objGslbHSMRuntime.enabled)&&
  Objects.equals(this.sendInterval, objGslbHSMRuntime.sendInterval)&&
  Objects.equals(this.operStatus, objGslbHSMRuntime.operStatus)&&
  Objects.equals(this.localInfo, objGslbHSMRuntime.localInfo)&&
  Objects.equals(this.remoteInfo, objGslbHSMRuntime.remoteInfo)&&
  Objects.equals(this.events, objGslbHSMRuntime.events)&&
  Objects.equals(this.tenantRef, objGslbHSMRuntime.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbHSMRuntime {\n");
      sb.append("    clusterUuid: ").append(toIndentedString(clusterUuid)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    localInfo: ").append(toIndentedString(localInfo)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    objUuid: ").append(toIndentedString(objUuid)).append("\n");
        sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
        sb.append("    remoteInfo: ").append(toIndentedString(remoteInfo)).append("\n");
        sb.append("    sendInterval: ").append(toIndentedString(sendInterval)).append("\n");
        sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

