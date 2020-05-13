package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SeUpgradeEvents;
import com.vmware.avi.vro.model.VsError;
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
 * SeGroupStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SeGroupStatus")
@VsoFinder(name = Constants.FINDER_VRO_SEGROUPSTATUS, idAccessor = "getObjectID()")
@Service
public class SeGroupStatus extends AviRestResource  {
  @JsonProperty("controller_version")
  private String controllerVersion = null;

  @JsonProperty("disrupted_vs_ref")
  @Valid
  private List<String> disruptedVsRef = null;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("end_time")
  private String endTime = null;

  @JsonProperty("enqueue_time")
  private String enqueueTime = null;

  @JsonProperty("ha_mode")
  private String haMode = null;

  @JsonProperty("in_progress")
  private Boolean inProgress = null;

  @JsonProperty("notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("num_se")
  private Integer numSe = null;

  @JsonProperty("num_se_with_no_vs")
  private Integer numSeWithNoVs = null;

  @JsonProperty("num_se_with_vs_not_scaledout")
  private Integer numSeWithVsNotScaledout = null;

  @JsonProperty("num_se_with_vs_scaledout")
  private Integer numSeWithVsScaledout = null;

  @JsonProperty("num_vs")
  private Integer numVs = null;

  @JsonProperty("num_vs_disrupted")
  private Integer numVsDisrupted = null;

  @JsonProperty("progress")
  private Integer progress = null;

  @JsonProperty("reason")
  @Valid
  private List<String> reason = null;

  @JsonProperty("request_time")
  private String requestTime = null;

  @JsonProperty("se_already_upgraded_at_start")
  @Valid
  private List<String> seAlreadyUpgradedAtStart = null;

  @JsonProperty("se_disconnected_at_start")
  @Valid
  private List<String> seDisconnectedAtStart = null;

  @JsonProperty("se_group_name")
  private String seGroupName = null;

  @JsonProperty("se_group_uuid")
  private String seGroupUuid = null;

  @JsonProperty("se_ip_missing_at_start")
  @Valid
  private List<String> seIpMissingAtStart = null;

  @JsonProperty("se_poweredoff_at_start")
  @Valid
  private List<String> sePoweredoffAtStart = null;

  @JsonProperty("se_reboot_in_progress_ref")
  private String seRebootInProgressRef = null;

  @JsonProperty("se_upgrade_completed")
  @Valid
  private List<String> seUpgradeCompleted = null;

  @JsonProperty("se_upgrade_errors")
  @Valid
  private List<SeUpgradeEvents> seUpgradeErrors = null;

  @JsonProperty("se_upgrade_failed")
  @Valid
  private List<String> seUpgradeFailed = null;

  @JsonProperty("se_upgrade_in_progress")
  @Valid
  private List<String> seUpgradeInProgress = null;

  @JsonProperty("se_upgrade_not_started")
  @Valid
  private List<String> seUpgradeNotStarted = null;

  @JsonProperty("se_upgrade_skip_suspended")
  @Valid
  private List<String> seUpgradeSkipSuspended = null;

  @JsonProperty("se_upgrade_suspended")
  @Valid
  private List<String> seUpgradeSuspended = null;

  @JsonProperty("se_with_no_vs")
  @Valid
  private List<String> seWithNoVs = null;

  @JsonProperty("se_with_vs_not_scaledout")
  @Valid
  private List<String> seWithVsNotScaledout = null;

  @JsonProperty("se_with_vs_scaledout")
  @Valid
  private List<String> seWithVsScaledout = null;

  @JsonProperty("start_time")
  private String startTime = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("thread")
  private String thread = null;

  @JsonProperty("traffic_status")
  private String trafficStatus = null;

  @JsonProperty("vs_errors")
  @Valid
  private List<VsError> vsErrors = null;

  @JsonProperty("vs_migrate_in_progress_ref")
  @Valid
  private List<String> vsMigrateInProgressRef = null;

  @JsonProperty("vs_scalein_in_progress_ref")
  @Valid
  private List<String> vsScaleinInProgressRef = null;

  @JsonProperty("vs_scaleout_in_progress_ref")
  @Valid
  private List<String> vsScaleoutInProgressRef = null;

  @JsonProperty("worker")
  private String worker = null;

  
  /**
   * Controller version. Field introduced in 18.2.6.
   * @return controllerVersion
  **/
  @ApiModelProperty(value = "Controller version. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getControllerVersion() {
    return controllerVersion;
  }
    
  @VsoMethod
  public void setControllerVersion(String controllerVersion) {
    this.controllerVersion = controllerVersion;
  }

  
  public SeGroupStatus addDisruptedVsRefItem(String disruptedVsRefItem) {
    if (this.disruptedVsRef == null) {
      this.disruptedVsRef = new ArrayList<String>();
    }
    this.disruptedVsRef.add(disruptedVsRefItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type VirtualService.
   * @return disruptedVsRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VirtualService.")


 
  @VsoMethod  
  public List<String> getDisruptedVsRef() {
    return disruptedVsRef;
  }
    
  @VsoMethod
  public void setDisruptedVsRef(List<String> disruptedVsRef) {
    this.disruptedVsRef = disruptedVsRef;
  }

  
  /**
   * duration of SeGroupStatus.
   * @return duration
  **/
  @ApiModelProperty(value = "duration of SeGroupStatus.")


 
  @VsoMethod  
  public String getDuration() {
    return duration;
  }
    
  @VsoMethod
  public void setDuration(String duration) {
    this.duration = duration;
  }

  
  /**
   * end_time of SeGroupStatus.
   * @return endTime
  **/
  @ApiModelProperty(value = "end_time of SeGroupStatus.")


 
  @VsoMethod  
  public String getEndTime() {
    return endTime;
  }
    
  @VsoMethod
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  
  /**
   * enqueue_time of SeGroupStatus.
   * @return enqueueTime
  **/
  @ApiModelProperty(value = "enqueue_time of SeGroupStatus.")


 
  @VsoMethod  
  public String getEnqueueTime() {
    return enqueueTime;
  }
    
  @VsoMethod
  public void setEnqueueTime(String enqueueTime) {
    this.enqueueTime = enqueueTime;
  }

  
  /**
   *  Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.
   * @return haMode
  **/
  @ApiModelProperty(value = " Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.")


 
  @VsoMethod  
  public String getHaMode() {
    return haMode;
  }
    
  @VsoMethod
  public void setHaMode(String haMode) {
    this.haMode = haMode;
  }

  
  /**
   * ServiceEngineGroup upgrade in progress. Field introduced in 18.2.6.
   * @return inProgress
  **/
  @ApiModelProperty(value = "ServiceEngineGroup upgrade in progress. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Boolean isInProgress() {
    return inProgress;
  }
    
  @VsoMethod
  public void setInProgress(Boolean inProgress) {
    this.inProgress = inProgress;
  }

  
  public SeGroupStatus addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }
  
  /**
   * notes of SeGroupStatus.
   * @return notes
  **/
  @ApiModelProperty(value = "notes of SeGroupStatus.")


 
  @VsoMethod  
  public List<String> getNotes() {
    return notes;
  }
    
  @VsoMethod
  public void setNotes(List<String> notes) {
    this.notes = notes;
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
   * Number of num_se_with_no_vs.
   * @return numSeWithNoVs
  **/
  @ApiModelProperty(value = "Number of num_se_with_no_vs.")


 
  @VsoMethod  
  public Integer getNumSeWithNoVs() {
    return numSeWithNoVs;
  }
    
  @VsoMethod
  public void setNumSeWithNoVs(Integer numSeWithNoVs) {
    this.numSeWithNoVs = numSeWithNoVs;
  }

  
  /**
   * Number of num_se_with_vs_not_scaledout.
   * @return numSeWithVsNotScaledout
  **/
  @ApiModelProperty(value = "Number of num_se_with_vs_not_scaledout.")


 
  @VsoMethod  
  public Integer getNumSeWithVsNotScaledout() {
    return numSeWithVsNotScaledout;
  }
    
  @VsoMethod
  public void setNumSeWithVsNotScaledout(Integer numSeWithVsNotScaledout) {
    this.numSeWithVsNotScaledout = numSeWithVsNotScaledout;
  }

  
  /**
   * Number of num_se_with_vs_scaledout.
   * @return numSeWithVsScaledout
  **/
  @ApiModelProperty(value = "Number of num_se_with_vs_scaledout.")


 
  @VsoMethod  
  public Integer getNumSeWithVsScaledout() {
    return numSeWithVsScaledout;
  }
    
  @VsoMethod
  public void setNumSeWithVsScaledout(Integer numSeWithVsScaledout) {
    this.numSeWithVsScaledout = numSeWithVsScaledout;
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

  
  /**
   * Number of num_vs_disrupted.
   * @return numVsDisrupted
  **/
  @ApiModelProperty(value = "Number of num_vs_disrupted.")


 
  @VsoMethod  
  public Integer getNumVsDisrupted() {
    return numVsDisrupted;
  }
    
  @VsoMethod
  public void setNumVsDisrupted(Integer numVsDisrupted) {
    this.numVsDisrupted = numVsDisrupted;
  }

  
  /**
   * Number of progress.
   * @return progress
  **/
  @ApiModelProperty(value = "Number of progress.")


 
  @VsoMethod  
  public Integer getProgress() {
    return progress;
  }
    
  @VsoMethod
  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  
  public SeGroupStatus addReasonItem(String reasonItem) {
    if (this.reason == null) {
      this.reason = new ArrayList<String>();
    }
    this.reason.add(reasonItem);
    return this;
  }
  
  /**
   * reason of SeGroupStatus.
   * @return reason
  **/
  @ApiModelProperty(value = "reason of SeGroupStatus.")


 
  @VsoMethod  
  public List<String> getReason() {
    return reason;
  }
    
  @VsoMethod
  public void setReason(List<String> reason) {
    this.reason = reason;
  }

  
  /**
   * request_time of SeGroupStatus.
   * @return requestTime
  **/
  @ApiModelProperty(value = "request_time of SeGroupStatus.")


 
  @VsoMethod  
  public String getRequestTime() {
    return requestTime;
  }
    
  @VsoMethod
  public void setRequestTime(String requestTime) {
    this.requestTime = requestTime;
  }

  
  public SeGroupStatus addSeAlreadyUpgradedAtStartItem(String seAlreadyUpgradedAtStartItem) {
    if (this.seAlreadyUpgradedAtStart == null) {
      this.seAlreadyUpgradedAtStart = new ArrayList<String>();
    }
    this.seAlreadyUpgradedAtStart.add(seAlreadyUpgradedAtStartItem);
    return this;
  }
  
  /**
   * ServiceEngines are already upgraded before the upgrade. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.6.
   * @return seAlreadyUpgradedAtStart
  **/
  @ApiModelProperty(value = "ServiceEngines are already upgraded before the upgrade. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public List<String> getSeAlreadyUpgradedAtStart() {
    return seAlreadyUpgradedAtStart;
  }
    
  @VsoMethod
  public void setSeAlreadyUpgradedAtStart(List<String> seAlreadyUpgradedAtStart) {
    this.seAlreadyUpgradedAtStart = seAlreadyUpgradedAtStart;
  }

  
  public SeGroupStatus addSeDisconnectedAtStartItem(String seDisconnectedAtStartItem) {
    if (this.seDisconnectedAtStart == null) {
      this.seDisconnectedAtStart = new ArrayList<String>();
    }
    this.seDisconnectedAtStart.add(seDisconnectedAtStartItem);
    return this;
  }
  
  /**
   * ServiceEngines in disconnected state before starting the upgrade. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.6.
   * @return seDisconnectedAtStart
  **/
  @ApiModelProperty(value = "ServiceEngines in disconnected state before starting the upgrade. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public List<String> getSeDisconnectedAtStart() {
    return seDisconnectedAtStart;
  }
    
  @VsoMethod
  public void setSeDisconnectedAtStart(List<String> seDisconnectedAtStart) {
    this.seDisconnectedAtStart = seDisconnectedAtStart;
  }

  
  /**
   * se_group_name of SeGroupStatus.
   * @return seGroupName
  **/
  @ApiModelProperty(value = "se_group_name of SeGroupStatus.")


 
  @VsoMethod  
  public String getSeGroupName() {
    return seGroupName;
  }
    
  @VsoMethod
  public void setSeGroupName(String seGroupName) {
    this.seGroupName = seGroupName;
  }

  
  /**
   * Unique object identifier of se_group.
   * @return seGroupUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of se_group.")


 
  @VsoMethod  
  public String getSeGroupUuid() {
    return seGroupUuid;
  }
    
  @VsoMethod
  public void setSeGroupUuid(String seGroupUuid) {
    this.seGroupUuid = seGroupUuid;
  }

  
  public SeGroupStatus addSeIpMissingAtStartItem(String seIpMissingAtStartItem) {
    if (this.seIpMissingAtStart == null) {
      this.seIpMissingAtStart = new ArrayList<String>();
    }
    this.seIpMissingAtStart.add(seIpMissingAtStartItem);
    return this;
  }
  
  /**
   * ServiceEngines local ip not present before the upgrade. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.6.
   * @return seIpMissingAtStart
  **/
  @ApiModelProperty(value = "ServiceEngines local ip not present before the upgrade. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public List<String> getSeIpMissingAtStart() {
    return seIpMissingAtStart;
  }
    
  @VsoMethod
  public void setSeIpMissingAtStart(List<String> seIpMissingAtStart) {
    this.seIpMissingAtStart = seIpMissingAtStart;
  }

  
  public SeGroupStatus addSePoweredoffAtStartItem(String sePoweredoffAtStartItem) {
    if (this.sePoweredoffAtStart == null) {
      this.sePoweredoffAtStart = new ArrayList<String>();
    }
    this.sePoweredoffAtStart.add(sePoweredoffAtStartItem);
    return this;
  }
  
  /**
   * ServiceEngines in poweredoff state before the upgrade. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.6.
   * @return sePoweredoffAtStart
  **/
  @ApiModelProperty(value = "ServiceEngines in poweredoff state before the upgrade. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public List<String> getSePoweredoffAtStart() {
    return sePoweredoffAtStart;
  }
    
  @VsoMethod
  public void setSePoweredoffAtStart(List<String> sePoweredoffAtStart) {
    this.sePoweredoffAtStart = sePoweredoffAtStart;
  }

  
  /**
   *  It is a reference to an object of type ServiceEngine.
   * @return seRebootInProgressRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type ServiceEngine.")


 
  @VsoMethod  
  public String getSeRebootInProgressRef() {
    return seRebootInProgressRef;
  }
    
  @VsoMethod
  public void setSeRebootInProgressRef(String seRebootInProgressRef) {
    this.seRebootInProgressRef = seRebootInProgressRef;
  }

  
  public SeGroupStatus addSeUpgradeCompletedItem(String seUpgradeCompletedItem) {
    if (this.seUpgradeCompleted == null) {
      this.seUpgradeCompleted = new ArrayList<String>();
    }
    this.seUpgradeCompleted.add(seUpgradeCompletedItem);
    return this;
  }
  
  /**
   * ServiceEngines upgrade completed. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.6.
   * @return seUpgradeCompleted
  **/
  @ApiModelProperty(value = "ServiceEngines upgrade completed. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public List<String> getSeUpgradeCompleted() {
    return seUpgradeCompleted;
  }
    
  @VsoMethod
  public void setSeUpgradeCompleted(List<String> seUpgradeCompleted) {
    this.seUpgradeCompleted = seUpgradeCompleted;
  }

  
  public SeGroupStatus addSeUpgradeErrorsItem(SeUpgradeEvents seUpgradeErrorsItem) {
    if (this.seUpgradeErrors == null) {
      this.seUpgradeErrors = new ArrayList<SeUpgradeEvents>();
    }
    this.seUpgradeErrors.add(seUpgradeErrorsItem);
    return this;
  }
  
  /**
   * ServiceEngineGroup upgrade errors. Field introduced in 18.2.6.
   * @return seUpgradeErrors
  **/
  @ApiModelProperty(value = "ServiceEngineGroup upgrade errors. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public List<SeUpgradeEvents> getSeUpgradeErrors() {
    return seUpgradeErrors;
  }
    
  @VsoMethod
  public void setSeUpgradeErrors(List<SeUpgradeEvents> seUpgradeErrors) {
    this.seUpgradeErrors = seUpgradeErrors;
  }

  
  public SeGroupStatus addSeUpgradeFailedItem(String seUpgradeFailedItem) {
    if (this.seUpgradeFailed == null) {
      this.seUpgradeFailed = new ArrayList<String>();
    }
    this.seUpgradeFailed.add(seUpgradeFailedItem);
    return this;
  }
  
  /**
   * ServiceEngines upgrade failed. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.6.
   * @return seUpgradeFailed
  **/
  @ApiModelProperty(value = "ServiceEngines upgrade failed. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public List<String> getSeUpgradeFailed() {
    return seUpgradeFailed;
  }
    
  @VsoMethod
  public void setSeUpgradeFailed(List<String> seUpgradeFailed) {
    this.seUpgradeFailed = seUpgradeFailed;
  }

  
  public SeGroupStatus addSeUpgradeInProgressItem(String seUpgradeInProgressItem) {
    if (this.seUpgradeInProgress == null) {
      this.seUpgradeInProgress = new ArrayList<String>();
    }
    this.seUpgradeInProgress.add(seUpgradeInProgressItem);
    return this;
  }
  
  /**
   * ServiceEngines upgrade in progress. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.6.
   * @return seUpgradeInProgress
  **/
  @ApiModelProperty(value = "ServiceEngines upgrade in progress. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public List<String> getSeUpgradeInProgress() {
    return seUpgradeInProgress;
  }
    
  @VsoMethod
  public void setSeUpgradeInProgress(List<String> seUpgradeInProgress) {
    this.seUpgradeInProgress = seUpgradeInProgress;
  }

  
  public SeGroupStatus addSeUpgradeNotStartedItem(String seUpgradeNotStartedItem) {
    if (this.seUpgradeNotStarted == null) {
      this.seUpgradeNotStarted = new ArrayList<String>();
    }
    this.seUpgradeNotStarted.add(seUpgradeNotStartedItem);
    return this;
  }
  
  /**
   * ServiceEngines upgrade not started. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.6.
   * @return seUpgradeNotStarted
  **/
  @ApiModelProperty(value = "ServiceEngines upgrade not started. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public List<String> getSeUpgradeNotStarted() {
    return seUpgradeNotStarted;
  }
    
  @VsoMethod
  public void setSeUpgradeNotStarted(List<String> seUpgradeNotStarted) {
    this.seUpgradeNotStarted = seUpgradeNotStarted;
  }

  
  public SeGroupStatus addSeUpgradeSkipSuspendedItem(String seUpgradeSkipSuspendedItem) {
    if (this.seUpgradeSkipSuspended == null) {
      this.seUpgradeSkipSuspended = new ArrayList<String>();
    }
    this.seUpgradeSkipSuspended.add(seUpgradeSkipSuspendedItem);
    return this;
  }
  
  /**
   * Service Engines that were in suspended state and were skipped upon Service Engine Group ugprade resumption. It is a reference to an object of type ServiceEngine.
   * @return seUpgradeSkipSuspended
  **/
  @ApiModelProperty(value = "Service Engines that were in suspended state and were skipped upon Service Engine Group ugprade resumption. It is a reference to an object of type ServiceEngine.")


 
  @VsoMethod  
  public List<String> getSeUpgradeSkipSuspended() {
    return seUpgradeSkipSuspended;
  }
    
  @VsoMethod
  public void setSeUpgradeSkipSuspended(List<String> seUpgradeSkipSuspended) {
    this.seUpgradeSkipSuspended = seUpgradeSkipSuspended;
  }

  
  public SeGroupStatus addSeUpgradeSuspendedItem(String seUpgradeSuspendedItem) {
    if (this.seUpgradeSuspended == null) {
      this.seUpgradeSuspended = new ArrayList<String>();
    }
    this.seUpgradeSuspended.add(seUpgradeSuspendedItem);
    return this;
  }
  
  /**
   * Service Engines which triggered Service Engine Group to be in suspended state. It is a reference to an object of type ServiceEngine.
   * @return seUpgradeSuspended
  **/
  @ApiModelProperty(value = "Service Engines which triggered Service Engine Group to be in suspended state. It is a reference to an object of type ServiceEngine.")


 
  @VsoMethod  
  public List<String> getSeUpgradeSuspended() {
    return seUpgradeSuspended;
  }
    
  @VsoMethod
  public void setSeUpgradeSuspended(List<String> seUpgradeSuspended) {
    this.seUpgradeSuspended = seUpgradeSuspended;
  }

  
  public SeGroupStatus addSeWithNoVsItem(String seWithNoVsItem) {
    if (this.seWithNoVs == null) {
      this.seWithNoVs = new ArrayList<String>();
    }
    this.seWithNoVs.add(seWithNoVsItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type ServiceEngine.
   * @return seWithNoVs
  **/
  @ApiModelProperty(value = " It is a reference to an object of type ServiceEngine.")


 
  @VsoMethod  
  public List<String> getSeWithNoVs() {
    return seWithNoVs;
  }
    
  @VsoMethod
  public void setSeWithNoVs(List<String> seWithNoVs) {
    this.seWithNoVs = seWithNoVs;
  }

  
  public SeGroupStatus addSeWithVsNotScaledoutItem(String seWithVsNotScaledoutItem) {
    if (this.seWithVsNotScaledout == null) {
      this.seWithVsNotScaledout = new ArrayList<String>();
    }
    this.seWithVsNotScaledout.add(seWithVsNotScaledoutItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type ServiceEngine.
   * @return seWithVsNotScaledout
  **/
  @ApiModelProperty(value = " It is a reference to an object of type ServiceEngine.")


 
  @VsoMethod  
  public List<String> getSeWithVsNotScaledout() {
    return seWithVsNotScaledout;
  }
    
  @VsoMethod
  public void setSeWithVsNotScaledout(List<String> seWithVsNotScaledout) {
    this.seWithVsNotScaledout = seWithVsNotScaledout;
  }

  
  public SeGroupStatus addSeWithVsScaledoutItem(String seWithVsScaledoutItem) {
    if (this.seWithVsScaledout == null) {
      this.seWithVsScaledout = new ArrayList<String>();
    }
    this.seWithVsScaledout.add(seWithVsScaledoutItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type ServiceEngine.
   * @return seWithVsScaledout
  **/
  @ApiModelProperty(value = " It is a reference to an object of type ServiceEngine.")


 
  @VsoMethod  
  public List<String> getSeWithVsScaledout() {
    return seWithVsScaledout;
  }
    
  @VsoMethod
  public void setSeWithVsScaledout(List<String> seWithVsScaledout) {
    this.seWithVsScaledout = seWithVsScaledout;
  }

  
  /**
   * start_time of SeGroupStatus.
   * @return startTime
  **/
  @ApiModelProperty(value = "start_time of SeGroupStatus.")


 
  @VsoMethod  
  public String getStartTime() {
    return startTime;
  }
    
  @VsoMethod
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  
  /**
   *  Enum options - SE_UPGRADE_PREVIEW, SE_UPGRADE_IN_PROGRESS, SE_UPGRADE_COMPLETE, SE_UPGRADE_ERROR, SE_UPGRADE_PRE_CHECKS, SE_IMAGE_INSTALL, SE_UPGRADE_IMAGE_NOT_FOUND, SE_ALREADY_UPGRADED, SE_REBOOT, SE_CONNECT_AFTER_REBOOT, SE_PRE_UPGRADE_TASKS, SE_POST_UPGRADE_TASKS, SE_WAIT_FOR_SWITCHOVER, SE_CHECK_SCALEDOUT_VS_EXISTS, SE_UPGRADE_SEMGR_REQUEST, SE_UPGRADE_SEMGR_SE_UNREACHABLE, SE_PRE_UPGRADE_SCALE_IN_OPS, SE_POST_UPGRADE_SCALE_OUT_OPS, SE_UPGRADE_SUSPENDED, SE_UPGRADE_START, SE_UPGRADE_PAUSED, SE_UPGRADE_FAILED, SE_UPGRADE_VERSION_CHECKS, SE_UPGRADE_CONNECTIVITY_CHECKS, SE_UPGRADE_VERIFY_VERSION, SE_UPGRADE_SKIP_RESUME_OPS, SE_UPGRADE_SEMGR_DONE, SEGROUP_UPGRADE_NOT_STARTED, SEGROUP_UPGRADE_ENQUEUED, SEGROUP_UPGRADE_ENQUEUE_FAILED, SEGROUP_UPGRADE_IN_PROGRESS, SEGROUP_UPGRADE_COMPLETE, SEGROUP_UPGRADE_ERROR, SEGROUP_UPGRADE_SUSPENDED, VS_DISRUPTED, VS_SCALEIN, VS_SCALEIN_ERROR, VS_SCALEIN_ERROR_RPC_FAILED, VS_SCALEOUT, VS_SCALEOUT_ERROR, VS_SCALEOUT_ERROR_RPC_FAILED, VS_SCALEOUT_ERROR_SE_NOT_READY, VS_MIGRATE, VS_MIGRATE_ERROR, VS_MIGRATE_BACK, VS_MIGRATE_BACK_ERROR, VS_MIGRATE_BACK_NOT_NEEDED, VS_MIGRATE_ERROR_NO_CANDIDATE_SE, VS_MIGRATE_ERROR_RPC_FAILED, VS_MIGRATE_BACK_ERROR_SE_NOT_READY, VS_MIGRATE_BACK_ERROR_RPC_FAILED, SEGROUP_PAUSE_PLACEMENT, SEGROUP_RESUME_PLACEMENT, SEGROUP_CLOUD_DISCOVERY, SEGROUP_IMAGE_GENERATION, SEGROUP_IMAGE_COPY_INSTALL_TO_SES, SEGROUP_SERIAL_SE_UPGRADE, SEGROUP_PARALLEL_SE_UPGRADE, SEGROUP_V2_TO_V1_ROLLBACK, SEGROUP_FAILED_SE_ERROR_RECOVERY, SEGROUP_SE_CONNECTIVITY_CHECKS, SEGROUP_UPGRADE_START, SEGROUP_WAIT_FOR_WARM_START_DONE.
   * @return state
  **/
  @ApiModelProperty(value = " Enum options - SE_UPGRADE_PREVIEW, SE_UPGRADE_IN_PROGRESS, SE_UPGRADE_COMPLETE, SE_UPGRADE_ERROR, SE_UPGRADE_PRE_CHECKS, SE_IMAGE_INSTALL, SE_UPGRADE_IMAGE_NOT_FOUND, SE_ALREADY_UPGRADED, SE_REBOOT, SE_CONNECT_AFTER_REBOOT, SE_PRE_UPGRADE_TASKS, SE_POST_UPGRADE_TASKS, SE_WAIT_FOR_SWITCHOVER, SE_CHECK_SCALEDOUT_VS_EXISTS, SE_UPGRADE_SEMGR_REQUEST, SE_UPGRADE_SEMGR_SE_UNREACHABLE, SE_PRE_UPGRADE_SCALE_IN_OPS, SE_POST_UPGRADE_SCALE_OUT_OPS, SE_UPGRADE_SUSPENDED, SE_UPGRADE_START, SE_UPGRADE_PAUSED, SE_UPGRADE_FAILED, SE_UPGRADE_VERSION_CHECKS, SE_UPGRADE_CONNECTIVITY_CHECKS, SE_UPGRADE_VERIFY_VERSION, SE_UPGRADE_SKIP_RESUME_OPS, SE_UPGRADE_SEMGR_DONE, SEGROUP_UPGRADE_NOT_STARTED, SEGROUP_UPGRADE_ENQUEUED, SEGROUP_UPGRADE_ENQUEUE_FAILED, SEGROUP_UPGRADE_IN_PROGRESS, SEGROUP_UPGRADE_COMPLETE, SEGROUP_UPGRADE_ERROR, SEGROUP_UPGRADE_SUSPENDED, VS_DISRUPTED, VS_SCALEIN, VS_SCALEIN_ERROR, VS_SCALEIN_ERROR_RPC_FAILED, VS_SCALEOUT, VS_SCALEOUT_ERROR, VS_SCALEOUT_ERROR_RPC_FAILED, VS_SCALEOUT_ERROR_SE_NOT_READY, VS_MIGRATE, VS_MIGRATE_ERROR, VS_MIGRATE_BACK, VS_MIGRATE_BACK_ERROR, VS_MIGRATE_BACK_NOT_NEEDED, VS_MIGRATE_ERROR_NO_CANDIDATE_SE, VS_MIGRATE_ERROR_RPC_FAILED, VS_MIGRATE_BACK_ERROR_SE_NOT_READY, VS_MIGRATE_BACK_ERROR_RPC_FAILED, SEGROUP_PAUSE_PLACEMENT, SEGROUP_RESUME_PLACEMENT, SEGROUP_CLOUD_DISCOVERY, SEGROUP_IMAGE_GENERATION, SEGROUP_IMAGE_COPY_INSTALL_TO_SES, SEGROUP_SERIAL_SE_UPGRADE, SEGROUP_PARALLEL_SE_UPGRADE, SEGROUP_V2_TO_V1_ROLLBACK, SEGROUP_FAILED_SE_ERROR_RECOVERY, SEGROUP_SE_CONNECTIVITY_CHECKS, SEGROUP_UPGRADE_START, SEGROUP_WAIT_FOR_WARM_START_DONE.")


 
  @VsoMethod  
  public String getState() {
    return state;
  }
    
  @VsoMethod
  public void setState(String state) {
    this.state = state;
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
   * thread of SeGroupStatus.
   * @return thread
  **/
  @ApiModelProperty(value = "thread of SeGroupStatus.")


 
  @VsoMethod  
  public String getThread() {
    return thread;
  }
    
  @VsoMethod
  public void setThread(String thread) {
    this.thread = thread;
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

  
  public SeGroupStatus addVsErrorsItem(VsError vsErrorsItem) {
    if (this.vsErrors == null) {
      this.vsErrors = new ArrayList<VsError>();
    }
    this.vsErrors.add(vsErrorsItem);
    return this;
  }
  
  /**
   * VirtualService errors during the SeGroup upgrade. Field introduced in 18.2.6.
   * @return vsErrors
  **/
  @ApiModelProperty(value = "VirtualService errors during the SeGroup upgrade. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public List<VsError> getVsErrors() {
    return vsErrors;
  }
    
  @VsoMethod
  public void setVsErrors(List<VsError> vsErrors) {
    this.vsErrors = vsErrors;
  }

  
  public SeGroupStatus addVsMigrateInProgressRefItem(String vsMigrateInProgressRefItem) {
    if (this.vsMigrateInProgressRef == null) {
      this.vsMigrateInProgressRef = new ArrayList<String>();
    }
    this.vsMigrateInProgressRef.add(vsMigrateInProgressRefItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type VirtualService.
   * @return vsMigrateInProgressRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VirtualService.")


 
  @VsoMethod  
  public List<String> getVsMigrateInProgressRef() {
    return vsMigrateInProgressRef;
  }
    
  @VsoMethod
  public void setVsMigrateInProgressRef(List<String> vsMigrateInProgressRef) {
    this.vsMigrateInProgressRef = vsMigrateInProgressRef;
  }

  
  public SeGroupStatus addVsScaleinInProgressRefItem(String vsScaleinInProgressRefItem) {
    if (this.vsScaleinInProgressRef == null) {
      this.vsScaleinInProgressRef = new ArrayList<String>();
    }
    this.vsScaleinInProgressRef.add(vsScaleinInProgressRefItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type VirtualService.
   * @return vsScaleinInProgressRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VirtualService.")


 
  @VsoMethod  
  public List<String> getVsScaleinInProgressRef() {
    return vsScaleinInProgressRef;
  }
    
  @VsoMethod
  public void setVsScaleinInProgressRef(List<String> vsScaleinInProgressRef) {
    this.vsScaleinInProgressRef = vsScaleinInProgressRef;
  }

  
  public SeGroupStatus addVsScaleoutInProgressRefItem(String vsScaleoutInProgressRefItem) {
    if (this.vsScaleoutInProgressRef == null) {
      this.vsScaleoutInProgressRef = new ArrayList<String>();
    }
    this.vsScaleoutInProgressRef.add(vsScaleoutInProgressRefItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type VirtualService.
   * @return vsScaleoutInProgressRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VirtualService.")


 
  @VsoMethod  
  public List<String> getVsScaleoutInProgressRef() {
    return vsScaleoutInProgressRef;
  }
    
  @VsoMethod
  public void setVsScaleoutInProgressRef(List<String> vsScaleoutInProgressRef) {
    this.vsScaleoutInProgressRef = vsScaleoutInProgressRef;
  }

  
  /**
   * worker of SeGroupStatus.
   * @return worker
  **/
  @ApiModelProperty(value = "worker of SeGroupStatus.")


 
  @VsoMethod  
  public String getWorker() {
    return worker;
  }
    
  @VsoMethod
  public void setWorker(String worker) {
    this.worker = worker;
  }

  
  public String getObjectID() {
		return "SeGroupStatus";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeGroupStatus seGroupStatus = (SeGroupStatus) o;
    return Objects.equals(this.controllerVersion, seGroupStatus.controllerVersion) &&
        Objects.equals(this.disruptedVsRef, seGroupStatus.disruptedVsRef) &&
        Objects.equals(this.duration, seGroupStatus.duration) &&
        Objects.equals(this.endTime, seGroupStatus.endTime) &&
        Objects.equals(this.enqueueTime, seGroupStatus.enqueueTime) &&
        Objects.equals(this.haMode, seGroupStatus.haMode) &&
        Objects.equals(this.inProgress, seGroupStatus.inProgress) &&
        Objects.equals(this.notes, seGroupStatus.notes) &&
        Objects.equals(this.numSe, seGroupStatus.numSe) &&
        Objects.equals(this.numSeWithNoVs, seGroupStatus.numSeWithNoVs) &&
        Objects.equals(this.numSeWithVsNotScaledout, seGroupStatus.numSeWithVsNotScaledout) &&
        Objects.equals(this.numSeWithVsScaledout, seGroupStatus.numSeWithVsScaledout) &&
        Objects.equals(this.numVs, seGroupStatus.numVs) &&
        Objects.equals(this.numVsDisrupted, seGroupStatus.numVsDisrupted) &&
        Objects.equals(this.progress, seGroupStatus.progress) &&
        Objects.equals(this.reason, seGroupStatus.reason) &&
        Objects.equals(this.requestTime, seGroupStatus.requestTime) &&
        Objects.equals(this.seAlreadyUpgradedAtStart, seGroupStatus.seAlreadyUpgradedAtStart) &&
        Objects.equals(this.seDisconnectedAtStart, seGroupStatus.seDisconnectedAtStart) &&
        Objects.equals(this.seGroupName, seGroupStatus.seGroupName) &&
        Objects.equals(this.seGroupUuid, seGroupStatus.seGroupUuid) &&
        Objects.equals(this.seIpMissingAtStart, seGroupStatus.seIpMissingAtStart) &&
        Objects.equals(this.sePoweredoffAtStart, seGroupStatus.sePoweredoffAtStart) &&
        Objects.equals(this.seRebootInProgressRef, seGroupStatus.seRebootInProgressRef) &&
        Objects.equals(this.seUpgradeCompleted, seGroupStatus.seUpgradeCompleted) &&
        Objects.equals(this.seUpgradeErrors, seGroupStatus.seUpgradeErrors) &&
        Objects.equals(this.seUpgradeFailed, seGroupStatus.seUpgradeFailed) &&
        Objects.equals(this.seUpgradeInProgress, seGroupStatus.seUpgradeInProgress) &&
        Objects.equals(this.seUpgradeNotStarted, seGroupStatus.seUpgradeNotStarted) &&
        Objects.equals(this.seUpgradeSkipSuspended, seGroupStatus.seUpgradeSkipSuspended) &&
        Objects.equals(this.seUpgradeSuspended, seGroupStatus.seUpgradeSuspended) &&
        Objects.equals(this.seWithNoVs, seGroupStatus.seWithNoVs) &&
        Objects.equals(this.seWithVsNotScaledout, seGroupStatus.seWithVsNotScaledout) &&
        Objects.equals(this.seWithVsScaledout, seGroupStatus.seWithVsScaledout) &&
        Objects.equals(this.startTime, seGroupStatus.startTime) &&
        Objects.equals(this.state, seGroupStatus.state) &&
        Objects.equals(this.tenantRef, seGroupStatus.tenantRef) &&
        Objects.equals(this.thread, seGroupStatus.thread) &&
        Objects.equals(this.trafficStatus, seGroupStatus.trafficStatus) &&
        Objects.equals(this.vsErrors, seGroupStatus.vsErrors) &&
        Objects.equals(this.vsMigrateInProgressRef, seGroupStatus.vsMigrateInProgressRef) &&
        Objects.equals(this.vsScaleinInProgressRef, seGroupStatus.vsScaleinInProgressRef) &&
        Objects.equals(this.vsScaleoutInProgressRef, seGroupStatus.vsScaleoutInProgressRef) &&
        Objects.equals(this.worker, seGroupStatus.worker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerVersion, disruptedVsRef, duration, endTime, enqueueTime, haMode, inProgress, notes, numSe, numSeWithNoVs, numSeWithVsNotScaledout, numSeWithVsScaledout, numVs, numVsDisrupted, progress, reason, requestTime, seAlreadyUpgradedAtStart, seDisconnectedAtStart, seGroupName, seGroupUuid, seIpMissingAtStart, sePoweredoffAtStart, seRebootInProgressRef, seUpgradeCompleted, seUpgradeErrors, seUpgradeFailed, seUpgradeInProgress, seUpgradeNotStarted, seUpgradeSkipSuspended, seUpgradeSuspended, seWithNoVs, seWithVsNotScaledout, seWithVsScaledout, startTime, state, tenantRef, thread, trafficStatus, vsErrors, vsMigrateInProgressRef, vsScaleinInProgressRef, vsScaleoutInProgressRef, worker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeGroupStatus {\n");
    
    sb.append("    controllerVersion: ").append(toIndentedString(controllerVersion)).append("\n");
    sb.append("    disruptedVsRef: ").append(toIndentedString(disruptedVsRef)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    enqueueTime: ").append(toIndentedString(enqueueTime)).append("\n");
    sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
    sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    numSe: ").append(toIndentedString(numSe)).append("\n");
    sb.append("    numSeWithNoVs: ").append(toIndentedString(numSeWithNoVs)).append("\n");
    sb.append("    numSeWithVsNotScaledout: ").append(toIndentedString(numSeWithVsNotScaledout)).append("\n");
    sb.append("    numSeWithVsScaledout: ").append(toIndentedString(numSeWithVsScaledout)).append("\n");
    sb.append("    numVs: ").append(toIndentedString(numVs)).append("\n");
    sb.append("    numVsDisrupted: ").append(toIndentedString(numVsDisrupted)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    seAlreadyUpgradedAtStart: ").append(toIndentedString(seAlreadyUpgradedAtStart)).append("\n");
    sb.append("    seDisconnectedAtStart: ").append(toIndentedString(seDisconnectedAtStart)).append("\n");
    sb.append("    seGroupName: ").append(toIndentedString(seGroupName)).append("\n");
    sb.append("    seGroupUuid: ").append(toIndentedString(seGroupUuid)).append("\n");
    sb.append("    seIpMissingAtStart: ").append(toIndentedString(seIpMissingAtStart)).append("\n");
    sb.append("    sePoweredoffAtStart: ").append(toIndentedString(sePoweredoffAtStart)).append("\n");
    sb.append("    seRebootInProgressRef: ").append(toIndentedString(seRebootInProgressRef)).append("\n");
    sb.append("    seUpgradeCompleted: ").append(toIndentedString(seUpgradeCompleted)).append("\n");
    sb.append("    seUpgradeErrors: ").append(toIndentedString(seUpgradeErrors)).append("\n");
    sb.append("    seUpgradeFailed: ").append(toIndentedString(seUpgradeFailed)).append("\n");
    sb.append("    seUpgradeInProgress: ").append(toIndentedString(seUpgradeInProgress)).append("\n");
    sb.append("    seUpgradeNotStarted: ").append(toIndentedString(seUpgradeNotStarted)).append("\n");
    sb.append("    seUpgradeSkipSuspended: ").append(toIndentedString(seUpgradeSkipSuspended)).append("\n");
    sb.append("    seUpgradeSuspended: ").append(toIndentedString(seUpgradeSuspended)).append("\n");
    sb.append("    seWithNoVs: ").append(toIndentedString(seWithNoVs)).append("\n");
    sb.append("    seWithVsNotScaledout: ").append(toIndentedString(seWithVsNotScaledout)).append("\n");
    sb.append("    seWithVsScaledout: ").append(toIndentedString(seWithVsScaledout)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    thread: ").append(toIndentedString(thread)).append("\n");
    sb.append("    trafficStatus: ").append(toIndentedString(trafficStatus)).append("\n");
    sb.append("    vsErrors: ").append(toIndentedString(vsErrors)).append("\n");
    sb.append("    vsMigrateInProgressRef: ").append(toIndentedString(vsMigrateInProgressRef)).append("\n");
    sb.append("    vsScaleinInProgressRef: ").append(toIndentedString(vsScaleinInProgressRef)).append("\n");
    sb.append("    vsScaleoutInProgressRef: ").append(toIndentedString(vsScaleoutInProgressRef)).append("\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
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

