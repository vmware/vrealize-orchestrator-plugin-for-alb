package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.EventMap;
import com.vmware.avi.vro.model.PatchData;
import com.vmware.avi.vro.model.SeGroupStatus;
import com.vmware.avi.vro.model.SeUpgradeEvents;
import com.vmware.avi.vro.model.UpgradeOpsParam;
import com.vmware.avi.vro.model.UpgradeOpsState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * UpgradeStatusInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "UpgradeStatusInfo")
@VsoFinder(name = Constants.FINDER_VRO_UPGRADESTATUSINFO, idAccessor = "getObjectID()")
@Service
public class UpgradeStatusInfo extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("enable_patch_rollback")
  private Boolean enablePatchRollback = null;

  @JsonProperty("enable_rollback")
  private Boolean enableRollback = null;

  @JsonProperty("end_time")
  private String endTime = null;

  @JsonProperty("enqueue_time")
  private String enqueueTime = null;

  @JsonProperty("image_ref")
  private String imageRef = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("node_type")
  private String nodeType = null;

  @JsonProperty("obj_cloud_ref")
  private String objCloudRef = null;

  @JsonProperty("params")
  private UpgradeOpsParam params = null;

  @JsonProperty("patch_image_ref")
  private String patchImageRef = null;

  @JsonProperty("patch_list")
  @Valid
  private List<PatchData> patchList = null;

  @JsonProperty("patch_version")
  private String patchVersion = null;

  @JsonProperty("previous_image_ref")
  private String previousImageRef = null;

  @JsonProperty("previous_patch_image_ref")
  private String previousPatchImageRef = null;

  @JsonProperty("previous_patch_list")
  @Valid
  private List<PatchData> previousPatchList = null;

  @JsonProperty("previous_patch_version")
  private String previousPatchVersion = null;

  @JsonProperty("previous_version")
  private String previousVersion = null;

  @JsonProperty("progress")
  private Integer progress = null;

  @JsonProperty("se_upgrade_events")
  @Valid
  private List<SeUpgradeEvents> seUpgradeEvents = null;

  @JsonProperty("seg_status")
  private SeGroupStatus segStatus = null;

  @JsonProperty("start_time")
  private String startTime = null;

  @JsonProperty("state")
  private UpgradeOpsState state = null;

  @JsonProperty("system")
  private Boolean system = null;

  @JsonProperty("tasks_completed")
  private Integer tasksCompleted = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("total_tasks")
  private Integer totalTasks = null;

  @JsonProperty("upgrade_events")
  @Valid
  private List<EventMap> upgradeEvents = null;

  @JsonProperty("upgrade_ops")
  private String upgradeOps = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("version")
  private String version = null;

  
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
   * Duration of Upgrade operation in seconds. Field introduced in 18.2.6.
   * @return duration
  **/
  @ApiModelProperty(value = "Duration of Upgrade operation in seconds. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getDuration() {
    return duration;
  }
    
  @VsoMethod
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * Check if the patch rollback is possible on this node. Field introduced in 18.2.6.
   * @return enablePatchRollback
  **/
  @ApiModelProperty(value = "Check if the patch rollback is possible on this node. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Boolean isEnablePatchRollback() {
    return enablePatchRollback;
  }
    
  @VsoMethod
  public void setEnablePatchRollback(Boolean enablePatchRollback) {
    this.enablePatchRollback = enablePatchRollback;
  }

  
  /**
   * Check if the rollback is possible on this node. Field introduced in 18.2.6.
   * @return enableRollback
  **/
  @ApiModelProperty(value = "Check if the rollback is possible on this node. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Boolean isEnableRollback() {
    return enableRollback;
  }
    
  @VsoMethod
  public void setEnableRollback(Boolean enableRollback) {
    this.enableRollback = enableRollback;
  }

  
  /**
   * End time of Upgrade operation. Field introduced in 18.2.6.
   * @return endTime
  **/
  @ApiModelProperty(value = "End time of Upgrade operation. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getEndTime() {
    return endTime;
  }
    
  @VsoMethod
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  
  /**
   * Enqueue time of Upgrade operation. Field introduced in 18.2.6.
   * @return enqueueTime
  **/
  @ApiModelProperty(value = "Enqueue time of Upgrade operation. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getEnqueueTime() {
    return enqueueTime;
  }
    
  @VsoMethod
  public void setEnqueueTime(String enqueueTime) {
    this.enqueueTime = enqueueTime;
  }

  
  /**
   * Image uuid for identifying the current base image. It is a reference to an object of type Image. Field introduced in 18.2.6.
   * @return imageRef
  **/
  @ApiModelProperty(value = "Image uuid for identifying the current base image. It is a reference to an object of type Image. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getImageRef() {
    return imageRef;
  }
    
  @VsoMethod
  public void setImageRef(String imageRef) {
    this.imageRef = imageRef;
  }

  
  /**
   * Name of the system such as cluster name, se group name and se name. Field introduced in 18.2.6.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the system such as cluster name, se group name and se name. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Type of the system such as controller_cluster, se_group or se. Enum options - NODE_CONTROLLER_CLUSTER, NODE_SE_GROUP, NODE_SE_TYPE. Field introduced in 18.2.6.
   * @return nodeType
  **/
  @ApiModelProperty(value = "Type of the system such as controller_cluster, se_group or se. Enum options - NODE_CONTROLLER_CLUSTER, NODE_SE_GROUP, NODE_SE_TYPE. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getNodeType() {
    return nodeType;
  }
    
  @VsoMethod
  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  
  /**
   * Cloud that this object belongs to. It is a reference to an object of type Cloud. Field introduced in 18.2.6.
   * @return objCloudRef
  **/
  @ApiModelProperty(value = "Cloud that this object belongs to. It is a reference to an object of type Cloud. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getObjCloudRef() {
    return objCloudRef;
  }
    
  @VsoMethod
  public void setObjCloudRef(String objCloudRef) {
    this.objCloudRef = objCloudRef;
  }

  
  /**
   * Parameters associated with the Upgrade operation. Field introduced in 18.2.6.
   * @return params
  **/
  @ApiModelProperty(value = "Parameters associated with the Upgrade operation. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public UpgradeOpsParam getParams() {
    return params;
  }
    
  @VsoMethod
  public void setParams(UpgradeOpsParam params) {
    this.params = params;
  }

  
  /**
   * Image uuid for identifying the current patch.Example  Base-image is 18.2.6 and a patch 6p1 is applied, then this field will indicate the 6p1 value. . It is a reference to an object of type Image. Field introduced in 18.2.6.
   * @return patchImageRef
  **/
  @ApiModelProperty(value = "Image uuid for identifying the current patch.Example  Base-image is 18.2.6 and a patch 6p1 is applied, then this field will indicate the 6p1 value. . It is a reference to an object of type Image. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getPatchImageRef() {
    return patchImageRef;
  }
    
  @VsoMethod
  public void setPatchImageRef(String patchImageRef) {
    this.patchImageRef = patchImageRef;
  }

  
  public UpgradeStatusInfo addPatchListItem(PatchData patchListItem) {
    if (this.patchList == null) {
      this.patchList = new ArrayList<PatchData>();
    }
    this.patchList.add(patchListItem);
    return this;
  }
  
  /**
   * List of patches applied to this node. Example  Base-image is 18.2.6 and a patch 6p1 is applied, then a patch 6p5 applied, this field will indicate the [{'6p1', '6p1_image_uuid'}, {'6p5', '6p5_image_uuid'}] value. Field introduced in 18.2.8, 20.1.1.
   * @return patchList
  **/
  @ApiModelProperty(value = "List of patches applied to this node. Example  Base-image is 18.2.6 and a patch 6p1 is applied, then a patch 6p5 applied, this field will indicate the [{'6p1', '6p1_image_uuid'}, {'6p5', '6p5_image_uuid'}] value. Field introduced in 18.2.8, 20.1.1.")

  @Valid

 
  @VsoMethod  
  public List<PatchData> getPatchList() {
    return patchList;
  }
    
  @VsoMethod
  public void setPatchList(List<PatchData> patchList) {
    this.patchList = patchList;
  }

  
  /**
   * Current patch version applied to this node. Example  Base-image is 18.2.6 and a patch 6p1 is applied, then this field will indicate the 6p1 value. . Field introduced in 18.2.6.
   * @return patchVersion
  **/
  @ApiModelProperty(value = "Current patch version applied to this node. Example  Base-image is 18.2.6 and a patch 6p1 is applied, then this field will indicate the 6p1 value. . Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getPatchVersion() {
    return patchVersion;
  }
    
  @VsoMethod
  public void setPatchVersion(String patchVersion) {
    this.patchVersion = patchVersion;
  }

  
  /**
   * Image uuid for identifying previous base image.Example  Base-image was 18.2.5 and an upgrade was done to 18.2.6, then this field will indicate the 18.2.5 value. . It is a reference to an object of type Image. Field introduced in 18.2.6.
   * @return previousImageRef
  **/
  @ApiModelProperty(value = "Image uuid for identifying previous base image.Example  Base-image was 18.2.5 and an upgrade was done to 18.2.6, then this field will indicate the 18.2.5 value. . It is a reference to an object of type Image. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getPreviousImageRef() {
    return previousImageRef;
  }
    
  @VsoMethod
  public void setPreviousImageRef(String previousImageRef) {
    this.previousImageRef = previousImageRef;
  }

  
  /**
   * Image uuid for identifying previous patch.Example  Base-image was 18.2.6 with a patch 6p1. Upgrade was initiated to 18.2.8 with patch 8p1. The previous_image field will contain 18.2.6 and this field will indicate the 6p1 value. . It is a reference to an object of type Image. Field introduced in 18.2.6.
   * @return previousPatchImageRef
  **/
  @ApiModelProperty(value = "Image uuid for identifying previous patch.Example  Base-image was 18.2.6 with a patch 6p1. Upgrade was initiated to 18.2.8 with patch 8p1. The previous_image field will contain 18.2.6 and this field will indicate the 6p1 value. . It is a reference to an object of type Image. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getPreviousPatchImageRef() {
    return previousPatchImageRef;
  }
    
  @VsoMethod
  public void setPreviousPatchImageRef(String previousPatchImageRef) {
    this.previousPatchImageRef = previousPatchImageRef;
  }

  
  public UpgradeStatusInfo addPreviousPatchListItem(PatchData previousPatchListItem) {
    if (this.previousPatchList == null) {
      this.previousPatchList = new ArrayList<PatchData>();
    }
    this.previousPatchList.add(previousPatchListItem);
    return this;
  }
  
  /**
   * List of patches applied to this node on previous major version. Field introduced in 18.2.8, 20.1.1.
   * @return previousPatchList
  **/
  @ApiModelProperty(value = "List of patches applied to this node on previous major version. Field introduced in 18.2.8, 20.1.1.")

  @Valid

 
  @VsoMethod  
  public List<PatchData> getPreviousPatchList() {
    return previousPatchList;
  }
    
  @VsoMethod
  public void setPreviousPatchList(List<PatchData> previousPatchList) {
    this.previousPatchList = previousPatchList;
  }

  
  /**
   * Previous patch version applied to this node.Example  Base-image was 18.2.6 with a patch 6p1. Upgrade was initiated to 18.2.8 with patch 8p1. The previous_image field will contain 18.2.6 and this field will indicate the 6p1 value. . Field introduced in 18.2.6.
   * @return previousPatchVersion
  **/
  @ApiModelProperty(value = "Previous patch version applied to this node.Example  Base-image was 18.2.6 with a patch 6p1. Upgrade was initiated to 18.2.8 with patch 8p1. The previous_image field will contain 18.2.6 and this field will indicate the 6p1 value. . Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getPreviousPatchVersion() {
    return previousPatchVersion;
  }
    
  @VsoMethod
  public void setPreviousPatchVersion(String previousPatchVersion) {
    this.previousPatchVersion = previousPatchVersion;
  }

  
  /**
   * Previous version prior to upgrade.Example  Base-image was 18.2.5 and an upgrade was done to 18.2.6, then this field will indicate the 18.2.5 value. . Field introduced in 18.2.6.
   * @return previousVersion
  **/
  @ApiModelProperty(value = "Previous version prior to upgrade.Example  Base-image was 18.2.5 and an upgrade was done to 18.2.6, then this field will indicate the 18.2.5 value. . Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getPreviousVersion() {
    return previousVersion;
  }
    
  @VsoMethod
  public void setPreviousVersion(String previousVersion) {
    this.previousVersion = previousVersion;
  }

  
  /**
   * Upgrade operations progress which holds value between 0-100. Allowed values are 0-100. Field introduced in 18.2.8, 20.1.1.
   * @return progress
  **/
  @ApiModelProperty(value = "Upgrade operations progress which holds value between 0-100. Allowed values are 0-100. Field introduced in 18.2.8, 20.1.1.")


 
  @VsoMethod  
  public Integer getProgress() {
    return progress;
  }
    
  @VsoMethod
  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  
  public UpgradeStatusInfo addSeUpgradeEventsItem(SeUpgradeEvents seUpgradeEventsItem) {
    if (this.seUpgradeEvents == null) {
      this.seUpgradeEvents = new ArrayList<SeUpgradeEvents>();
    }
    this.seUpgradeEvents.add(seUpgradeEventsItem);
    return this;
  }
  
  /**
   * ServiceEngineGroup upgrade errors. Field introduced in 18.2.6.
   * @return seUpgradeEvents
  **/
  @ApiModelProperty(value = "ServiceEngineGroup upgrade errors. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public List<SeUpgradeEvents> getSeUpgradeEvents() {
    return seUpgradeEvents;
  }
    
  @VsoMethod
  public void setSeUpgradeEvents(List<SeUpgradeEvents> seUpgradeEvents) {
    this.seUpgradeEvents = seUpgradeEvents;
  }

  
  /**
   * Detailed SeGroup status. Field introduced in 18.2.6.
   * @return segStatus
  **/
  @ApiModelProperty(value = "Detailed SeGroup status. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public SeGroupStatus getSegStatus() {
    return segStatus;
  }
    
  @VsoMethod
  public void setSegStatus(SeGroupStatus segStatus) {
    this.segStatus = segStatus;
  }

  
  /**
   * Start time of Upgrade operation. Field introduced in 18.2.6.
   * @return startTime
  **/
  @ApiModelProperty(value = "Start time of Upgrade operation. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getStartTime() {
    return startTime;
  }
    
  @VsoMethod
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  
  /**
   * Current status of the Upgrade operation. Field introduced in 18.2.6.
   * @return state
  **/
  @ApiModelProperty(value = "Current status of the Upgrade operation. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public UpgradeOpsState getState() {
    return state;
  }
    
  @VsoMethod
  public void setState(UpgradeOpsState state) {
    this.state = state;
  }

  
  /**
   * Flag is set only in the cluster if the upgrade is initiated as a system-upgrade. . Field introduced in 18.2.6.
   * @return system
  **/
  @ApiModelProperty(value = "Flag is set only in the cluster if the upgrade is initiated as a system-upgrade. . Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Boolean isSystem() {
    return system;
  }
    
  @VsoMethod
  public void setSystem(Boolean system) {
    this.system = system;
  }

  
  /**
   * Completed set of tasks in the Upgrade operation. Field introduced in 18.2.6.
   * @return tasksCompleted
  **/
  @ApiModelProperty(value = "Completed set of tasks in the Upgrade operation. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getTasksCompleted() {
    return tasksCompleted;
  }
    
  @VsoMethod
  public void setTasksCompleted(Integer tasksCompleted) {
    this.tasksCompleted = tasksCompleted;
  }

  
  /**
   * Tenant that this object belongs to. It is a reference to an object of type Tenant. Field introduced in 18.2.6.
   * @return tenantRef
  **/
  @ApiModelProperty(value = "Tenant that this object belongs to. It is a reference to an object of type Tenant. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * Total number of tasks in the Upgrade operation. Field introduced in 18.2.6.
   * @return totalTasks
  **/
  @ApiModelProperty(value = "Total number of tasks in the Upgrade operation. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getTotalTasks() {
    return totalTasks;
  }
    
  @VsoMethod
  public void setTotalTasks(Integer totalTasks) {
    this.totalTasks = totalTasks;
  }

  
  public UpgradeStatusInfo addUpgradeEventsItem(EventMap upgradeEventsItem) {
    if (this.upgradeEvents == null) {
      this.upgradeEvents = new ArrayList<EventMap>();
    }
    this.upgradeEvents.add(upgradeEventsItem);
    return this;
  }
  
  /**
   * Events performed for Upgrade operation. Field introduced in 18.2.6.
   * @return upgradeEvents
  **/
  @ApiModelProperty(value = "Events performed for Upgrade operation. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public List<EventMap> getUpgradeEvents() {
    return upgradeEvents;
  }
    
  @VsoMethod
  public void setUpgradeEvents(List<EventMap> upgradeEvents) {
    this.upgradeEvents = upgradeEvents;
  }

  
  /**
   * Upgrade operations requested. Enum options - UPGRADE, PATCH, ROLLBACK, ROLLBACKPATCH, SEGROUP_RESUME. Field introduced in 18.2.6.
   * @return upgradeOps
  **/
  @ApiModelProperty(value = "Upgrade operations requested. Enum options - UPGRADE, PATCH, ROLLBACK, ROLLBACKPATCH, SEGROUP_RESUME. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getUpgradeOps() {
    return upgradeOps;
  }
    
  @VsoMethod
  public void setUpgradeOps(String upgradeOps) {
    this.upgradeOps = upgradeOps;
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
   * UUID Identifier for the system such as cluster, se group and se. Field introduced in 18.2.6.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID Identifier for the system such as cluster, se group and se. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   * Current base image applied to this node. Field introduced in 18.2.6.
   * @return version
  **/
  @ApiModelProperty(value = "Current base image applied to this node. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getVersion() {
    return version;
  }
    
  @VsoMethod
  public void setVersion(String version) {
    this.version = version;
  }

  
  public String getObjectID() {
		return "UpgradeStatusInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeStatusInfo upgradeStatusInfo = (UpgradeStatusInfo) o;
    return Objects.equals(this.lastModified, upgradeStatusInfo.lastModified) &&
        Objects.equals(this.duration, upgradeStatusInfo.duration) &&
        Objects.equals(this.enablePatchRollback, upgradeStatusInfo.enablePatchRollback) &&
        Objects.equals(this.enableRollback, upgradeStatusInfo.enableRollback) &&
        Objects.equals(this.endTime, upgradeStatusInfo.endTime) &&
        Objects.equals(this.enqueueTime, upgradeStatusInfo.enqueueTime) &&
        Objects.equals(this.imageRef, upgradeStatusInfo.imageRef) &&
        Objects.equals(this.name, upgradeStatusInfo.name) &&
        Objects.equals(this.nodeType, upgradeStatusInfo.nodeType) &&
        Objects.equals(this.objCloudRef, upgradeStatusInfo.objCloudRef) &&
        Objects.equals(this.params, upgradeStatusInfo.params) &&
        Objects.equals(this.patchImageRef, upgradeStatusInfo.patchImageRef) &&
        Objects.equals(this.patchList, upgradeStatusInfo.patchList) &&
        Objects.equals(this.patchVersion, upgradeStatusInfo.patchVersion) &&
        Objects.equals(this.previousImageRef, upgradeStatusInfo.previousImageRef) &&
        Objects.equals(this.previousPatchImageRef, upgradeStatusInfo.previousPatchImageRef) &&
        Objects.equals(this.previousPatchList, upgradeStatusInfo.previousPatchList) &&
        Objects.equals(this.previousPatchVersion, upgradeStatusInfo.previousPatchVersion) &&
        Objects.equals(this.previousVersion, upgradeStatusInfo.previousVersion) &&
        Objects.equals(this.progress, upgradeStatusInfo.progress) &&
        Objects.equals(this.seUpgradeEvents, upgradeStatusInfo.seUpgradeEvents) &&
        Objects.equals(this.segStatus, upgradeStatusInfo.segStatus) &&
        Objects.equals(this.startTime, upgradeStatusInfo.startTime) &&
        Objects.equals(this.state, upgradeStatusInfo.state) &&
        Objects.equals(this.system, upgradeStatusInfo.system) &&
        Objects.equals(this.tasksCompleted, upgradeStatusInfo.tasksCompleted) &&
        Objects.equals(this.tenantRef, upgradeStatusInfo.tenantRef) &&
        Objects.equals(this.totalTasks, upgradeStatusInfo.totalTasks) &&
        Objects.equals(this.upgradeEvents, upgradeStatusInfo.upgradeEvents) &&
        Objects.equals(this.upgradeOps, upgradeStatusInfo.upgradeOps) &&
        Objects.equals(this.url, upgradeStatusInfo.url) &&
        Objects.equals(this.uuid, upgradeStatusInfo.uuid) &&
        Objects.equals(this.version, upgradeStatusInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, duration, enablePatchRollback, enableRollback, endTime, enqueueTime, imageRef, name, nodeType, objCloudRef, params, patchImageRef, patchList, patchVersion, previousImageRef, previousPatchImageRef, previousPatchList, previousPatchVersion, previousVersion, progress, seUpgradeEvents, segStatus, startTime, state, system, tasksCompleted, tenantRef, totalTasks, upgradeEvents, upgradeOps, url, uuid, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeStatusInfo {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    enablePatchRollback: ").append(toIndentedString(enablePatchRollback)).append("\n");
    sb.append("    enableRollback: ").append(toIndentedString(enableRollback)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    enqueueTime: ").append(toIndentedString(enqueueTime)).append("\n");
    sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    objCloudRef: ").append(toIndentedString(objCloudRef)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    patchImageRef: ").append(toIndentedString(patchImageRef)).append("\n");
    sb.append("    patchList: ").append(toIndentedString(patchList)).append("\n");
    sb.append("    patchVersion: ").append(toIndentedString(patchVersion)).append("\n");
    sb.append("    previousImageRef: ").append(toIndentedString(previousImageRef)).append("\n");
    sb.append("    previousPatchImageRef: ").append(toIndentedString(previousPatchImageRef)).append("\n");
    sb.append("    previousPatchList: ").append(toIndentedString(previousPatchList)).append("\n");
    sb.append("    previousPatchVersion: ").append(toIndentedString(previousPatchVersion)).append("\n");
    sb.append("    previousVersion: ").append(toIndentedString(previousVersion)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    seUpgradeEvents: ").append(toIndentedString(seUpgradeEvents)).append("\n");
    sb.append("    segStatus: ").append(toIndentedString(segStatus)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    tasksCompleted: ").append(toIndentedString(tasksCompleted)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    totalTasks: ").append(toIndentedString(totalTasks)).append("\n");
    sb.append("    upgradeEvents: ").append(toIndentedString(upgradeEvents)).append("\n");
    sb.append("    upgradeOps: ").append(toIndentedString(upgradeOps)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

