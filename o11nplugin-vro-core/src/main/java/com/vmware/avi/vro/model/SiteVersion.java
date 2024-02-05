package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SiteVersion is a POJO class extends AviRestResource that used for creating
 * SiteVersion.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SiteVersion")
@VsoFinder(name = Constants.FINDER_VRO_SITEVERSION, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SiteVersion extends AviRestResource {
    @JsonProperty("datetime")
    @JsonInclude(Include.NON_NULL)
    private String datetime;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("prev_target_version")
    @JsonInclude(Include.NON_NULL)
    private Integer prevTargetVersion;

    @JsonProperty("replication_state")
    @JsonInclude(Include.NON_NULL)
    private String replicationState;

    @JsonProperty("site_id")
    @JsonInclude(Include.NON_NULL)
    private String siteId;

    @JsonProperty("target_timeline")
    @JsonInclude(Include.NON_NULL)
    private String targetTimeline;

    @JsonProperty("target_version")
    @JsonInclude(Include.NON_NULL)
    private Integer targetVersion;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("timeline")
    @JsonInclude(Include.NON_NULL)
    private String timeline;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private Integer version;

    @JsonProperty("version_type")
    @JsonInclude(Include.NON_NULL)
    private String versionType;



  /**
   * This is the getter method this will return the attribute value.
   * This field represents the creation time of the federateddiff.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return datetime
   */
  @VsoMethod
  public String getDatetime() {
    return datetime;
  }

  /**
   * This is the setter method to the attribute.
   * This field represents the creation time of the federateddiff.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param datetime set the datetime.
   */
  @VsoMethod
  public void setDatetime(String  datetime) {
    this.datetime = datetime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the site.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the site.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Previous targer version for a site.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return prevTargetVersion
   */
  @VsoMethod
  public Integer getPrevTargetVersion() {
    return prevTargetVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Previous targer version for a site.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param prevTargetVersion set the prevTargetVersion.
   */
  @VsoMethod
  public void setPrevTargetVersion(Integer  prevTargetVersion) {
    this.prevTargetVersion = prevTargetVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Replication state for a site.
   * Enum options - REPLICATION_STATE_FASTFORWARD, REPLICATION_STATE_FORCESYNC, REPLICATION_STATE_STREAMING, REPLICATION_STATE_SUSPENDED,
   * REPLICATION_STATE_INIT, REPLICATION_STATE_WAIT, REPLICATION_STATE_NOT_APPLICABLE.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return replicationState
   */
  @VsoMethod
  public String getReplicationState() {
    return replicationState;
  }

  /**
   * This is the setter method to the attribute.
   * Replication state for a site.
   * Enum options - REPLICATION_STATE_FASTFORWARD, REPLICATION_STATE_FORCESYNC, REPLICATION_STATE_STREAMING, REPLICATION_STATE_SUSPENDED,
   * REPLICATION_STATE_INIT, REPLICATION_STATE_WAIT, REPLICATION_STATE_NOT_APPLICABLE.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param replicationState set the replicationState.
   */
  @VsoMethod
  public void setReplicationState(String  replicationState) {
    this.replicationState = replicationState;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cluster uuid of the site.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return siteId
   */
  @VsoMethod
  public String getSiteId() {
    return siteId;
  }

  /**
   * This is the setter method to the attribute.
   * Cluster uuid of the site.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param siteId set the siteId.
   */
  @VsoMethod
  public void setSiteId(String  siteId) {
    this.siteId = siteId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Target timeline of the site.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return targetTimeline
   */
  @VsoMethod
  public String getTargetTimeline() {
    return targetTimeline;
  }

  /**
   * This is the setter method to the attribute.
   * Target timeline of the site.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param targetTimeline set the targetTimeline.
   */
  @VsoMethod
  public void setTargetTimeline(String  targetTimeline) {
    this.targetTimeline = targetTimeline;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Target version of the site.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return targetVersion
   */
  @VsoMethod
  public Integer getTargetVersion() {
    return targetVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Target version of the site.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param targetVersion set the targetVersion.
   */
  @VsoMethod
  public void setTargetVersion(Integer  targetVersion) {
    this.targetVersion = targetVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timeline of the site.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return timeline
   */
  @VsoMethod
  public String getTimeline() {
    return timeline;
  }

  /**
   * This is the setter method to the attribute.
   * Timeline of the site.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param timeline set the timeline.
   */
  @VsoMethod
  public void setTimeline(String  timeline) {
    this.timeline = timeline;
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
   * Uuid of the siteversion object.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the siteversion object.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Version of the site.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return version
   */
  @VsoMethod
  public Integer getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Version of the site.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(Integer  version) {
    this.version = version;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of message for which version is maintained.
   * Enum options - CONFIG_VERSION, HEALTH_STATUS_VERSION.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return versionType
   */
  @VsoMethod
  public String getVersionType() {
    return versionType;
  }

  /**
   * This is the setter method to the attribute.
   * Type of message for which version is maintained.
   * Enum options - CONFIG_VERSION, HEALTH_STATUS_VERSION.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param versionType set the versionType.
   */
  @VsoMethod
  public void setVersionType(String  versionType) {
    this.versionType = versionType;
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
  SiteVersion objSiteVersion = (SiteVersion) o;
  return   Objects.equals(this.uuid, objSiteVersion.uuid)&&
  Objects.equals(this.name, objSiteVersion.name)&&
  Objects.equals(this.datetime, objSiteVersion.datetime)&&
  Objects.equals(this.siteId, objSiteVersion.siteId)&&
  Objects.equals(this.versionType, objSiteVersion.versionType)&&
  Objects.equals(this.version, objSiteVersion.version)&&
  Objects.equals(this.targetVersion, objSiteVersion.targetVersion)&&
  Objects.equals(this.prevTargetVersion, objSiteVersion.prevTargetVersion)&&
  Objects.equals(this.replicationState, objSiteVersion.replicationState)&&
  Objects.equals(this.timeline, objSiteVersion.timeline)&&
  Objects.equals(this.targetTimeline, objSiteVersion.targetTimeline)&&
  Objects.equals(this.tenantRef, objSiteVersion.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SiteVersion {\n");
      sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    prevTargetVersion: ").append(toIndentedString(prevTargetVersion)).append("\n");
        sb.append("    replicationState: ").append(toIndentedString(replicationState)).append("\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    targetTimeline: ").append(toIndentedString(targetTimeline)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
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

