package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * SeUpgradeEvents
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SeUpgradeEvents")
@VsoFinder(name = Constants.FINDER_VRO_SEUPGRADEEVENTS, idAccessor = "getObjectID()")
@Service
public class SeUpgradeEvents extends AviRestResource  {
  @JsonProperty("from_se_ref")
  private String fromSeRef = null;

  @JsonProperty("num_se")
  private Integer numSe = null;

  @JsonProperty("num_se_group")
  private Integer numSeGroup = null;

  @JsonProperty("num_vs")
  private Integer numVs = null;

  @JsonProperty("reason")
  @Valid
  private List<String> reason = null;

  @JsonProperty("se_group_ha_mode")
  private String seGroupHaMode = null;

  @JsonProperty("se_group_ref")
  private String seGroupRef = null;

  @JsonProperty("se_ref")
  private String seRef = null;

  @JsonProperty("task")
  private String task = null;

  @JsonProperty("to_se_ref")
  private String toSeRef = null;

  @JsonProperty("traffic_status")
  private String trafficStatus = null;

  @JsonProperty("vs_ref")
  private String vsRef = null;

  
  /**
   *  It is a reference to an object of type ServiceEngine.
   * @return fromSeRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type ServiceEngine.")


 
  @VsoMethod  
  public String getFromSeRef() {
    return fromSeRef;
  }
    
  @VsoMethod
  public void setFromSeRef(String fromSeRef) {
    this.fromSeRef = fromSeRef;
  }

  
  /**
   * Number of num_se.
   * @return numSe
  **/
  @ApiModelProperty(value = "Number of num_se.")


 
  @VsoMethod  
  public Integer getNumSe() {
    return numSe;
  }
    
  @VsoMethod
  public void setNumSe(Integer numSe) {
    this.numSe = numSe;
  }

  
  /**
   * Number of num_se_group.
   * @return numSeGroup
  **/
  @ApiModelProperty(value = "Number of num_se_group.")


 
  @VsoMethod  
  public Integer getNumSeGroup() {
    return numSeGroup;
  }
    
  @VsoMethod
  public void setNumSeGroup(Integer numSeGroup) {
    this.numSeGroup = numSeGroup;
  }

  
  /**
   * Number of num_vs.
   * @return numVs
  **/
  @ApiModelProperty(value = "Number of num_vs.")


 
  @VsoMethod  
  public Integer getNumVs() {
    return numVs;
  }
    
  @VsoMethod
  public void setNumVs(Integer numVs) {
    this.numVs = numVs;
  }

  
  public SeUpgradeEvents addReasonItem(String reasonItem) {
    if (this.reason == null) {
      this.reason = new ArrayList<String>();
    }
    this.reason.add(reasonItem);
    return this;
  }
  
  /**
   * reason of SeUpgradeEvents.
   * @return reason
  **/
  @ApiModelProperty(value = "reason of SeUpgradeEvents.")


 
  @VsoMethod  
  public List<String> getReason() {
    return reason;
  }
    
  @VsoMethod
  public void setReason(List<String> reason) {
    this.reason = reason;
  }

  
  /**
   *  Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.
   * @return seGroupHaMode
  **/
  @ApiModelProperty(value = " Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.")


 
  @VsoMethod  
  public String getSeGroupHaMode() {
    return seGroupHaMode;
  }
    
  @VsoMethod
  public void setSeGroupHaMode(String seGroupHaMode) {
    this.seGroupHaMode = seGroupHaMode;
  }

  
  /**
   *  It is a reference to an object of type ServiceEngineGroup.
   * @return seGroupRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type ServiceEngineGroup.")


 
  @VsoMethod  
  public String getSeGroupRef() {
    return seGroupRef;
  }
    
  @VsoMethod
  public void setSeGroupRef(String seGroupRef) {
    this.seGroupRef = seGroupRef;
  }

  
  /**
   *  It is a reference to an object of type ServiceEngine.
   * @return seRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type ServiceEngine.")


 
  @VsoMethod  
  public String getSeRef() {
    return seRef;
  }
    
  @VsoMethod
  public void setSeRef(String seRef) {
    this.seRef = seRef;
  }

  
  /**
   *  Enum options - SE_UPGRADE_PREVIEW, SE_UPGRADE_IN_PROGRESS, SE_UPGRADE_COMPLETE, SE_UPGRADE_ERROR, SE_UPGRADE_PRE_CHECKS, SE_IMAGE_INSTALL, SE_UPGRADE_IMAGE_NOT_FOUND, SE_ALREADY_UPGRADED, SE_REBOOT, SE_CONNECT_AFTER_REBOOT, SE_PRE_UPGRADE_TASKS, SE_POST_UPGRADE_TASKS, SE_WAIT_FOR_SWITCHOVER, SE_CHECK_SCALEDOUT_VS_EXISTS, SE_UPGRADE_SEMGR_REQUEST, SE_UPGRADE_SEMGR_SE_UNREACHABLE, SE_PRE_UPGRADE_SCALE_IN_OPS, SE_POST_UPGRADE_SCALE_OUT_OPS, SE_UPGRADE_SUSPENDED, SE_UPGRADE_START, SE_UPGRADE_PAUSED, SE_UPGRADE_FAILED, SE_UPGRADE_VERSION_CHECKS, SE_UPGRADE_CONNECTIVITY_CHECKS, SE_UPGRADE_VERIFY_VERSION, SE_UPGRADE_SKIP_RESUME_OPS, SE_UPGRADE_SEMGR_DONE, SEGROUP_UPGRADE_NOT_STARTED, SEGROUP_UPGRADE_ENQUEUED, SEGROUP_UPGRADE_ENQUEUE_FAILED, SEGROUP_UPGRADE_IN_PROGRESS, SEGROUP_UPGRADE_COMPLETE, SEGROUP_UPGRADE_ERROR, SEGROUP_UPGRADE_SUSPENDED, VS_DISRUPTED, VS_SCALEIN, VS_SCALEIN_ERROR, VS_SCALEIN_ERROR_RPC_FAILED, VS_SCALEOUT, VS_SCALEOUT_ERROR, VS_SCALEOUT_ERROR_RPC_FAILED, VS_SCALEOUT_ERROR_SE_NOT_READY, VS_MIGRATE, VS_MIGRATE_ERROR, VS_MIGRATE_BACK, VS_MIGRATE_BACK_ERROR, VS_MIGRATE_BACK_NOT_NEEDED, VS_MIGRATE_ERROR_NO_CANDIDATE_SE, VS_MIGRATE_ERROR_RPC_FAILED, VS_MIGRATE_BACK_ERROR_SE_NOT_READY, VS_MIGRATE_BACK_ERROR_RPC_FAILED, SEGROUP_PAUSE_PLACEMENT, SEGROUP_RESUME_PLACEMENT, SEGROUP_CLOUD_DISCOVERY, SEGROUP_IMAGE_GENERATION, SEGROUP_IMAGE_COPY_INSTALL_TO_SES, SEGROUP_SERIAL_SE_UPGRADE, SEGROUP_PARALLEL_SE_UPGRADE, SEGROUP_V2_TO_V1_ROLLBACK, SEGROUP_FAILED_SE_ERROR_RECOVERY, SEGROUP_SE_CONNECTIVITY_CHECKS, SEGROUP_UPGRADE_START, SEGROUP_WAIT_FOR_WARM_START_DONE.
   * @return task
  **/
  @ApiModelProperty(value = " Enum options - SE_UPGRADE_PREVIEW, SE_UPGRADE_IN_PROGRESS, SE_UPGRADE_COMPLETE, SE_UPGRADE_ERROR, SE_UPGRADE_PRE_CHECKS, SE_IMAGE_INSTALL, SE_UPGRADE_IMAGE_NOT_FOUND, SE_ALREADY_UPGRADED, SE_REBOOT, SE_CONNECT_AFTER_REBOOT, SE_PRE_UPGRADE_TASKS, SE_POST_UPGRADE_TASKS, SE_WAIT_FOR_SWITCHOVER, SE_CHECK_SCALEDOUT_VS_EXISTS, SE_UPGRADE_SEMGR_REQUEST, SE_UPGRADE_SEMGR_SE_UNREACHABLE, SE_PRE_UPGRADE_SCALE_IN_OPS, SE_POST_UPGRADE_SCALE_OUT_OPS, SE_UPGRADE_SUSPENDED, SE_UPGRADE_START, SE_UPGRADE_PAUSED, SE_UPGRADE_FAILED, SE_UPGRADE_VERSION_CHECKS, SE_UPGRADE_CONNECTIVITY_CHECKS, SE_UPGRADE_VERIFY_VERSION, SE_UPGRADE_SKIP_RESUME_OPS, SE_UPGRADE_SEMGR_DONE, SEGROUP_UPGRADE_NOT_STARTED, SEGROUP_UPGRADE_ENQUEUED, SEGROUP_UPGRADE_ENQUEUE_FAILED, SEGROUP_UPGRADE_IN_PROGRESS, SEGROUP_UPGRADE_COMPLETE, SEGROUP_UPGRADE_ERROR, SEGROUP_UPGRADE_SUSPENDED, VS_DISRUPTED, VS_SCALEIN, VS_SCALEIN_ERROR, VS_SCALEIN_ERROR_RPC_FAILED, VS_SCALEOUT, VS_SCALEOUT_ERROR, VS_SCALEOUT_ERROR_RPC_FAILED, VS_SCALEOUT_ERROR_SE_NOT_READY, VS_MIGRATE, VS_MIGRATE_ERROR, VS_MIGRATE_BACK, VS_MIGRATE_BACK_ERROR, VS_MIGRATE_BACK_NOT_NEEDED, VS_MIGRATE_ERROR_NO_CANDIDATE_SE, VS_MIGRATE_ERROR_RPC_FAILED, VS_MIGRATE_BACK_ERROR_SE_NOT_READY, VS_MIGRATE_BACK_ERROR_RPC_FAILED, SEGROUP_PAUSE_PLACEMENT, SEGROUP_RESUME_PLACEMENT, SEGROUP_CLOUD_DISCOVERY, SEGROUP_IMAGE_GENERATION, SEGROUP_IMAGE_COPY_INSTALL_TO_SES, SEGROUP_SERIAL_SE_UPGRADE, SEGROUP_PARALLEL_SE_UPGRADE, SEGROUP_V2_TO_V1_ROLLBACK, SEGROUP_FAILED_SE_ERROR_RECOVERY, SEGROUP_SE_CONNECTIVITY_CHECKS, SEGROUP_UPGRADE_START, SEGROUP_WAIT_FOR_WARM_START_DONE.")


 
  @VsoMethod  
  public String getTask() {
    return task;
  }
    
  @VsoMethod
  public void setTask(String task) {
    this.task = task;
  }

  
  /**
   *  It is a reference to an object of type ServiceEngine.
   * @return toSeRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type ServiceEngine.")


 
  @VsoMethod  
  public String getToSeRef() {
    return toSeRef;
  }
    
  @VsoMethod
  public void setToSeRef(String toSeRef) {
    this.toSeRef = toSeRef;
  }

  
  /**
   *  Enum options - TRAFFIC_DISRUPTED, TRAFFIC_NOT_DISRUPTED.
   * @return trafficStatus
  **/
  @ApiModelProperty(value = " Enum options - TRAFFIC_DISRUPTED, TRAFFIC_NOT_DISRUPTED.")


 
  @VsoMethod  
  public String getTrafficStatus() {
    return trafficStatus;
  }
    
  @VsoMethod
  public void setTrafficStatus(String trafficStatus) {
    this.trafficStatus = trafficStatus;
  }

  
  /**
   *  It is a reference to an object of type VirtualService.
   * @return vsRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VirtualService.")


 
  @VsoMethod  
  public String getVsRef() {
    return vsRef;
  }
    
  @VsoMethod
  public void setVsRef(String vsRef) {
    this.vsRef = vsRef;
  }

  
  public String getObjectID() {
		return "SeUpgradeEvents";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeUpgradeEvents seUpgradeEvents = (SeUpgradeEvents) o;
    return Objects.equals(this.fromSeRef, seUpgradeEvents.fromSeRef) &&
        Objects.equals(this.numSe, seUpgradeEvents.numSe) &&
        Objects.equals(this.numSeGroup, seUpgradeEvents.numSeGroup) &&
        Objects.equals(this.numVs, seUpgradeEvents.numVs) &&
        Objects.equals(this.reason, seUpgradeEvents.reason) &&
        Objects.equals(this.seGroupHaMode, seUpgradeEvents.seGroupHaMode) &&
        Objects.equals(this.seGroupRef, seUpgradeEvents.seGroupRef) &&
        Objects.equals(this.seRef, seUpgradeEvents.seRef) &&
        Objects.equals(this.task, seUpgradeEvents.task) &&
        Objects.equals(this.toSeRef, seUpgradeEvents.toSeRef) &&
        Objects.equals(this.trafficStatus, seUpgradeEvents.trafficStatus) &&
        Objects.equals(this.vsRef, seUpgradeEvents.vsRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromSeRef, numSe, numSeGroup, numVs, reason, seGroupHaMode, seGroupRef, seRef, task, toSeRef, trafficStatus, vsRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeUpgradeEvents {\n");
    
    sb.append("    fromSeRef: ").append(toIndentedString(fromSeRef)).append("\n");
    sb.append("    numSe: ").append(toIndentedString(numSe)).append("\n");
    sb.append("    numSeGroup: ").append(toIndentedString(numSeGroup)).append("\n");
    sb.append("    numVs: ").append(toIndentedString(numVs)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    seGroupHaMode: ").append(toIndentedString(seGroupHaMode)).append("\n");
    sb.append("    seGroupRef: ").append(toIndentedString(seGroupRef)).append("\n");
    sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    toSeRef: ").append(toIndentedString(toSeRef)).append("\n");
    sb.append("    trafficStatus: ").append(toIndentedString(trafficStatus)).append("\n");
    sb.append("    vsRef: ").append(toIndentedString(vsRef)).append("\n");
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

