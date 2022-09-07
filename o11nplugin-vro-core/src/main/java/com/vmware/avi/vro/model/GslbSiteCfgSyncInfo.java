package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.TimeStamp;
import com.vmware.avi.vro.model.ConfigVersionStatus;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbSiteCfgSyncInfo is a POJO class extends AviRestResource that used for creating
 * GslbSiteCfgSyncInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbSiteCfgSyncInfo")
@VsoFinder(name = Constants.FINDER_VRO_GSLBSITECFGSYNCINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbSiteCfgSyncInfo extends AviRestResource {
    @JsonProperty("errored_objects")
    @JsonInclude(Include.NON_NULL)
    private List<VersionInfo> erroredObjects = null;

    @JsonProperty("last_changed_time")
    @JsonInclude(Include.NON_NULL)
    private TimeStamp lastChangedTime = null;

    @JsonProperty("last_fail_obj")
    @JsonInclude(Include.NON_NULL)
    private ConfigVersionStatus lastFailObj = null;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason = null;

    @JsonProperty("recommendation")
    @JsonInclude(Include.NON_NULL)
    private String recommendation = null;

    @JsonProperty("sync_state")
    @JsonInclude(Include.NON_NULL)
    private String syncState = null;



  /**
   * This is the getter method this will return the attribute value.
   * Objects that could not be synced to the site.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return erroredObjects
   */
  @VsoMethod
  public List<VersionInfo> getErroredObjects() {
    return erroredObjects;
  }

  /**
   * This is the setter method. this will set the erroredObjects
   * Objects that could not be synced to the site.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return erroredObjects
   */
  @VsoMethod
  public void setErroredObjects(List<VersionInfo>  erroredObjects) {
    this.erroredObjects = erroredObjects;
  }

  /**
   * This is the setter method this will set the erroredObjects
   * Objects that could not be synced to the site.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return erroredObjects
   */
  @VsoMethod
  public GslbSiteCfgSyncInfo addErroredObjectsItem(VersionInfo erroredObjectsItem) {
    if (this.erroredObjects == null) {
      this.erroredObjects = new ArrayList<VersionInfo>();
    }
    this.erroredObjects.add(erroredObjectsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastChangedTime
   */
  @VsoMethod
  public TimeStamp getLastChangedTime() {
    return lastChangedTime;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastChangedTime set the lastChangedTime.
   */
  @VsoMethod
  public void setLastChangedTime(TimeStamp lastChangedTime) {
    this.lastChangedTime = lastChangedTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Last object having replication issue.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastFailObj
   */
  @VsoMethod
  public ConfigVersionStatus getLastFailObj() {
    return lastFailObj;
  }

  /**
   * This is the setter method to the attribute.
   * Last object having replication issue.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastFailObj set the lastFailObj.
   */
  @VsoMethod
  public void setLastFailObj(ConfigVersionStatus lastFailObj) {
    this.lastFailObj = lastFailObj;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason for the replication issues.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason for the replication issues.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Recommended way to resolve replication issue.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return recommendation
   */
  @VsoMethod
  public String getRecommendation() {
    return recommendation;
  }

  /**
   * This is the setter method to the attribute.
   * Recommended way to resolve replication issue.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param recommendation set the recommendation.
   */
  @VsoMethod
  public void setRecommendation(String  recommendation) {
    this.recommendation = recommendation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configuration sync-state of the site.
   * Enum options - GSLB_SITE_CFG_IN_SYNC, GSLB_SITE_CFG_OUT_OF_SYNC, GSLB_SITE_CFG_SYNC_DISABLED, GSLB_SITE_CFG_SYNC_IN_PROGRESS,
   * GSLB_SITE_CFG_SYNC_NOT_APPLICABLE, GSLB_SITE_CFG_SYNCED_TILL_CHECKPOINT, GSLB_SITE_CFG_SYNC_SUSPENDED, GSLB_SITE_CFG_SYNC_STALLED.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return syncState
   */
  @VsoMethod
  public String getSyncState() {
    return syncState;
  }

  /**
   * This is the setter method to the attribute.
   * Configuration sync-state of the site.
   * Enum options - GSLB_SITE_CFG_IN_SYNC, GSLB_SITE_CFG_OUT_OF_SYNC, GSLB_SITE_CFG_SYNC_DISABLED, GSLB_SITE_CFG_SYNC_IN_PROGRESS,
   * GSLB_SITE_CFG_SYNC_NOT_APPLICABLE, GSLB_SITE_CFG_SYNCED_TILL_CHECKPOINT, GSLB_SITE_CFG_SYNC_SUSPENDED, GSLB_SITE_CFG_SYNC_STALLED.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param syncState set the syncState.
   */
  @VsoMethod
  public void setSyncState(String  syncState) {
    this.syncState = syncState;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbSiteCfgSyncInfo objGslbSiteCfgSyncInfo = (GslbSiteCfgSyncInfo) o;
  return   Objects.equals(this.syncState, objGslbSiteCfgSyncInfo.syncState)&&
  Objects.equals(this.lastChangedTime, objGslbSiteCfgSyncInfo.lastChangedTime)&&
  Objects.equals(this.erroredObjects, objGslbSiteCfgSyncInfo.erroredObjects)&&
  Objects.equals(this.reason, objGslbSiteCfgSyncInfo.reason)&&
  Objects.equals(this.recommendation, objGslbSiteCfgSyncInfo.recommendation)&&
  Objects.equals(this.lastFailObj, objGslbSiteCfgSyncInfo.lastFailObj);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbSiteCfgSyncInfo {\n");
      sb.append("    erroredObjects: ").append(toIndentedString(erroredObjects)).append("\n");
        sb.append("    lastChangedTime: ").append(toIndentedString(lastChangedTime)).append("\n");
        sb.append("    lastFailObj: ").append(toIndentedString(lastFailObj)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
        sb.append("    syncState: ").append(toIndentedString(syncState)).append("\n");
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

