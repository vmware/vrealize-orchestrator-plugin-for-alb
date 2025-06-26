package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.FdsInfo;
import com.vmware.avi.vro.model.LocalInfo;
import com.vmware.avi.vro.model.RemoteInfo;
import com.vmware.avi.vro.model.ReplicationPolicy;
import com.vmware.avi.vro.model.OperationalStatus;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbCRMRuntime is a POJO class extends AviRestResource that used for creating
 * GslbCRMRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbCRMRuntime")
@VsoFinder(name = Constants.FINDER_VRO_GSLBCRMRUNTIME, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbCRMRuntime extends AviRestResource {
    @JsonProperty("cluster_uuid")
    @JsonInclude(Include.NON_NULL)
    private String clusterUuid;

    @JsonProperty("events")
    @JsonInclude(Include.NON_NULL)
    private List<EventInfo> events;

    @JsonProperty("fds_info")
    @JsonInclude(Include.NON_NULL)
    private FdsInfo fdsInfo;

    @JsonProperty("local_info")
    @JsonInclude(Include.NON_NULL)
    private LocalInfo localInfo;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("obj_uuid")
    @JsonInclude(Include.NON_NULL)
    private String objUuid;

    @JsonProperty("remote_info")
    @JsonInclude(Include.NON_NULL)
    private RemoteInfo remoteInfo;

    @JsonProperty("replication_policy")
    @JsonInclude(Include.NON_NULL)
    private ReplicationPolicy replicationPolicy;

    @JsonProperty("site_name")
    @JsonInclude(Include.NON_NULL)
    private String siteName;

    @JsonProperty("status_info")
    @JsonInclude(Include.NON_NULL)
    private OperationalStatus statusInfo;

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
   * This field tracks the site_uuid for local/remote site.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clusterUuid
   */
  @VsoMethod
  public String getClusterUuid() {
    return clusterUuid;
  }

  /**
   * This is the setter method to the attribute.
   * This field tracks the site_uuid for local/remote site.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clusterUuid set the clusterUuid.
   */
  @VsoMethod
  public void setClusterUuid(String  clusterUuid) {
    this.clusterUuid = clusterUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Events captured wrt to config replication.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
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
   * Allowed with any value in enterprise, enterprise with cloud services edition.
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
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public GslbCRMRuntime addEventsItem(EventInfo eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<EventInfo>();
    }
    this.events.add(eventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Federated data store related info.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fdsInfo
   */
  @VsoMethod
  public FdsInfo getFdsInfo() {
    return fdsInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Federated data store related info.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fdsInfo set the fdsInfo.
   */
  @VsoMethod
  public void setFdsInfo(FdsInfo fdsInfo) {
    this.fdsInfo = fdsInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Represents local info for the site.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
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
   * Allowed with any value in enterprise, enterprise with cloud services edition.
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
   * Allowed with any value in enterprise, enterprise with cloud services edition.
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
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Gslb crm runtime object uuid.
   * Points to the gslb to which this belongs.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objUuid
   */
  @VsoMethod
  public String getObjUuid() {
    return objUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Gslb crm runtime object uuid.
   * Points to the gslb to which this belongs.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objUuid set the objUuid.
   */
  @VsoMethod
  public void setObjUuid(String  objUuid) {
    this.objUuid = objUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Respresents remote site's info wrt to replication.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return remoteInfo
   */
  @VsoMethod
  public RemoteInfo getRemoteInfo() {
    return remoteInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Respresents remote site's info wrt to replication.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param remoteInfo set the remoteInfo.
   */
  @VsoMethod
  public void setRemoteInfo(RemoteInfo remoteInfo) {
    this.remoteInfo = remoteInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Policy for replicating configuration to the active follower sites.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return replicationPolicy
   */
  @VsoMethod
  public ReplicationPolicy getReplicationPolicy() {
    return replicationPolicy;
  }

  /**
   * This is the setter method to the attribute.
   * Policy for replicating configuration to the active follower sites.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param replicationPolicy set the replicationPolicy.
   */
  @VsoMethod
  public void setReplicationPolicy(ReplicationPolicy replicationPolicy) {
    this.replicationPolicy = replicationPolicy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field tracks the site name.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return siteName
   */
  @VsoMethod
  public String getSiteName() {
    return siteName;
  }

  /**
   * This is the setter method to the attribute.
   * This field tracks the site name.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param siteName set the siteName.
   */
  @VsoMethod
  public void setSiteName(String  siteName) {
    this.siteName = siteName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Crm operational status.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return statusInfo
   */
  @VsoMethod
  public OperationalStatus getStatusInfo() {
    return statusInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Crm operational status.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param statusInfo set the statusInfo.
   */
  @VsoMethod
  public void setStatusInfo(OperationalStatus statusInfo) {
    this.statusInfo = statusInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
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
   * Allowed with any value in enterprise, enterprise with cloud services edition.
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
   * Allowed with any value in enterprise, enterprise with cloud services edition.
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
   * Allowed with any value in enterprise, enterprise with cloud services edition.
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
  GslbCRMRuntime objGslbCRMRuntime = (GslbCRMRuntime) o;
  return   Objects.equals(this.uuid, objGslbCRMRuntime.uuid)&&
  Objects.equals(this.name, objGslbCRMRuntime.name)&&
  Objects.equals(this.objUuid, objGslbCRMRuntime.objUuid)&&
  Objects.equals(this.clusterUuid, objGslbCRMRuntime.clusterUuid)&&
  Objects.equals(this.siteName, objGslbCRMRuntime.siteName)&&
  Objects.equals(this.statusInfo, objGslbCRMRuntime.statusInfo)&&
  Objects.equals(this.fdsInfo, objGslbCRMRuntime.fdsInfo)&&
  Objects.equals(this.replicationPolicy, objGslbCRMRuntime.replicationPolicy)&&
  Objects.equals(this.remoteInfo, objGslbCRMRuntime.remoteInfo)&&
  Objects.equals(this.localInfo, objGslbCRMRuntime.localInfo)&&
  Objects.equals(this.events, objGslbCRMRuntime.events)&&
  Objects.equals(this.tenantRef, objGslbCRMRuntime.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbCRMRuntime {\n");
      sb.append("    clusterUuid: ").append(toIndentedString(clusterUuid)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    fdsInfo: ").append(toIndentedString(fdsInfo)).append("\n");
        sb.append("    localInfo: ").append(toIndentedString(localInfo)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    objUuid: ").append(toIndentedString(objUuid)).append("\n");
        sb.append("    remoteInfo: ").append(toIndentedString(remoteInfo)).append("\n");
        sb.append("    replicationPolicy: ").append(toIndentedString(replicationPolicy)).append("\n");
        sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
        sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
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

