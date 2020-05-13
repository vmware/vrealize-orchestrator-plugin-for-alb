package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.UpgradeOpsState;
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
 * UpgradeStatusSummary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "UpgradeStatusSummary")
@VsoFinder(name = Constants.FINDER_VRO_UPGRADESTATUSSUMMARY, idAccessor = "getObjectID()")
@Service
public class UpgradeStatusSummary extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("enable_patch_rollback")
  private Boolean enablePatchRollback = null;

  @JsonProperty("enable_rollback")
  private Boolean enableRollback = null;

  @JsonProperty("end_time")
  private String endTime = null;

  @JsonProperty("image_ref")
  private String imageRef = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("node_type")
  private String nodeType = null;

  @JsonProperty("obj_cloud_ref")
  private String objCloudRef = null;

  @JsonProperty("patch_image_ref")
  private String patchImageRef = null;

  @JsonProperty("start_time")
  private String startTime = null;

  @JsonProperty("state")
  private UpgradeOpsState state = null;

  @JsonProperty("tasks_completed")
  private Integer tasksCompleted = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("total_tasks")
  private Integer totalTasks = null;

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
   * End time of upgrade operations. Field introduced in 18.2.6.
   * @return endTime
  **/
  @ApiModelProperty(value = "End time of upgrade operations. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getEndTime() {
    return endTime;
  }
    
  @VsoMethod
  public void setEndTime(String endTime) {
    this.endTime = endTime;
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
   * Image uuid for identifying the current patch. It is a reference to an object of type Image. Field introduced in 18.2.6.
   * @return patchImageRef
  **/
  @ApiModelProperty(value = "Image uuid for identifying the current patch. It is a reference to an object of type Image. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getPatchImageRef() {
    return patchImageRef;
  }
    
  @VsoMethod
  public void setPatchImageRef(String patchImageRef) {
    this.patchImageRef = patchImageRef;
  }

  
  /**
   * Start time of upgrade operations. Field introduced in 18.2.6.
   * @return startTime
  **/
  @ApiModelProperty(value = "Start time of upgrade operations. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getStartTime() {
    return startTime;
  }
    
  @VsoMethod
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  
  /**
   * Current status of the upgrade operations. Field introduced in 18.2.6.
   * @return state
  **/
  @ApiModelProperty(value = "Current status of the upgrade operations. Field introduced in 18.2.6.")

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
   * Upgrade tasks completed. Field introduced in 18.2.6.
   * @return tasksCompleted
  **/
  @ApiModelProperty(value = "Upgrade tasks completed. Field introduced in 18.2.6.")


 
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
   * Total upgrade tasks. Field introduced in 18.2.6.
   * @return totalTasks
  **/
  @ApiModelProperty(value = "Total upgrade tasks. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getTotalTasks() {
    return totalTasks;
  }
    
  @VsoMethod
  public void setTotalTasks(Integer totalTasks) {
    this.totalTasks = totalTasks;
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
		return "UpgradeStatusSummary";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeStatusSummary upgradeStatusSummary = (UpgradeStatusSummary) o;
    return Objects.equals(this.lastModified, upgradeStatusSummary.lastModified) &&
        Objects.equals(this.enablePatchRollback, upgradeStatusSummary.enablePatchRollback) &&
        Objects.equals(this.enableRollback, upgradeStatusSummary.enableRollback) &&
        Objects.equals(this.endTime, upgradeStatusSummary.endTime) &&
        Objects.equals(this.imageRef, upgradeStatusSummary.imageRef) &&
        Objects.equals(this.name, upgradeStatusSummary.name) &&
        Objects.equals(this.nodeType, upgradeStatusSummary.nodeType) &&
        Objects.equals(this.objCloudRef, upgradeStatusSummary.objCloudRef) &&
        Objects.equals(this.patchImageRef, upgradeStatusSummary.patchImageRef) &&
        Objects.equals(this.startTime, upgradeStatusSummary.startTime) &&
        Objects.equals(this.state, upgradeStatusSummary.state) &&
        Objects.equals(this.tasksCompleted, upgradeStatusSummary.tasksCompleted) &&
        Objects.equals(this.tenantRef, upgradeStatusSummary.tenantRef) &&
        Objects.equals(this.totalTasks, upgradeStatusSummary.totalTasks) &&
        Objects.equals(this.upgradeOps, upgradeStatusSummary.upgradeOps) &&
        Objects.equals(this.url, upgradeStatusSummary.url) &&
        Objects.equals(this.uuid, upgradeStatusSummary.uuid) &&
        Objects.equals(this.version, upgradeStatusSummary.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, enablePatchRollback, enableRollback, endTime, imageRef, name, nodeType, objCloudRef, patchImageRef, startTime, state, tasksCompleted, tenantRef, totalTasks, upgradeOps, url, uuid, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeStatusSummary {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    enablePatchRollback: ").append(toIndentedString(enablePatchRollback)).append("\n");
    sb.append("    enableRollback: ").append(toIndentedString(enableRollback)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    objCloudRef: ").append(toIndentedString(objCloudRef)).append("\n");
    sb.append("    patchImageRef: ").append(toIndentedString(patchImageRef)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tasksCompleted: ").append(toIndentedString(tasksCompleted)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    totalTasks: ").append(toIndentedString(totalTasks)).append("\n");
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

