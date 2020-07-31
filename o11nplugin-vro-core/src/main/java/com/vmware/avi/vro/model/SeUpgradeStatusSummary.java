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
 * The SeUpgradeStatusSummary is a POJO class extends AviRestResource that used for creating
 * SeUpgradeStatusSummary.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeUpgradeStatusSummary")
@VsoFinder(name = Constants.FINDER_VRO_SEUPGRADESTATUSSUMMARY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeUpgradeStatusSummary extends AviRestResource {
  @JsonProperty("controller_version")
  @JsonInclude(Include.NON_NULL)
  private String controllerVersion = null;

  @JsonProperty("duration")
  @JsonInclude(Include.NON_NULL)
  private String duration = null;

  @JsonProperty("end_time")
  @JsonInclude(Include.NON_NULL)
  private String endTime = null;

  @JsonProperty("in_progress")
  @JsonInclude(Include.NON_NULL)
  private Boolean inProgress = null;

  @JsonProperty("notes")
  @JsonInclude(Include.NON_NULL)
  private List<String> notes = null;

  @JsonProperty("se_already_upgraded_at_start")
  @JsonInclude(Include.NON_NULL)
  private List<String> seAlreadyUpgradedAtStart = null;

  @JsonProperty("se_disconnected_at_start")
  @JsonInclude(Include.NON_NULL)
  private List<String> seDisconnectedAtStart = null;

  @JsonProperty("se_group_status")
  @JsonInclude(Include.NON_NULL)
  private List<SeGroupStatus> seGroupStatus = null;

  @JsonProperty("se_ip_missing_at_start")
  @JsonInclude(Include.NON_NULL)
  private List<String> seIpMissingAtStart = null;

  @JsonProperty("se_poweredoff_at_start")
  @JsonInclude(Include.NON_NULL)
  private List<String> sePoweredoffAtStart = null;

  @JsonProperty("se_upgrade_completed")
  @JsonInclude(Include.NON_NULL)
  private List<String> seUpgradeCompleted = null;

  @JsonProperty("se_upgrade_errors")
  @JsonInclude(Include.NON_NULL)
  private List<SeUpgradeEvents> seUpgradeErrors = null;

  @JsonProperty("se_upgrade_failed")
  @JsonInclude(Include.NON_NULL)
  private List<String> seUpgradeFailed = null;

  @JsonProperty("se_upgrade_in_progress")
  @JsonInclude(Include.NON_NULL)
  private List<String> seUpgradeInProgress = null;

  @JsonProperty("se_upgrade_not_started")
  @JsonInclude(Include.NON_NULL)
  private List<String> seUpgradeNotStarted = null;

  @JsonProperty("se_upgrade_retry_completed")
  @JsonInclude(Include.NON_NULL)
  private List<String> seUpgradeRetryCompleted = null;

  @JsonProperty("se_upgrade_retry_failed")
  @JsonInclude(Include.NON_NULL)
  private List<String> seUpgradeRetryFailed = null;

  @JsonProperty("se_upgrade_retry_in_progress")
  @JsonInclude(Include.NON_NULL)
  private List<String> seUpgradeRetryInProgress = null;

  @JsonProperty("se_upgrade_skip_suspended")
  @JsonInclude(Include.NON_NULL)
  private List<String> seUpgradeSkipSuspended = null;

  @JsonProperty("se_upgrade_suspended")
  @JsonInclude(Include.NON_NULL)
  private List<String> seUpgradeSuspended = null;

  @JsonProperty("start_time")
  @JsonInclude(Include.NON_NULL)
  private String startTime = null;

  @JsonProperty("state")
  @JsonInclude(Include.NON_NULL)
  private String state = null;

  @JsonProperty("vs_errors")
  @JsonInclude(Include.NON_NULL)
  private List<VsError> vsErrors = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property controller_version of obj type seupgradestatussummary field type str  type string.
   * @return controllerVersion
   */
  @VsoMethod
  public String getControllerVersion() {
    return controllerVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property controller_version of obj type seupgradestatussummary field type str  type string.
   * @param controllerVersion set the controllerVersion.
   */
  @VsoMethod
  public void setControllerVersion(String  controllerVersion) {
    this.controllerVersion = controllerVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property duration of obj type seupgradestatussummary field type str  type string.
   * @return duration
   */
  @VsoMethod
  public String getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property duration of obj type seupgradestatussummary field type str  type string.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(String  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property end_time of obj type seupgradestatussummary field type str  type string.
   * @return endTime
   */
  @VsoMethod
  public String getEndTime() {
    return endTime;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property end_time of obj type seupgradestatussummary field type str  type string.
   * @param endTime set the endTime.
   */
  @VsoMethod
  public void setEndTime(String  endTime) {
    this.endTime = endTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property in_progress of obj type seupgradestatussummary field type str  type boolean.
   * @return inProgress
   */
  @VsoMethod
  public Boolean getInProgress() {
    return inProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property in_progress of obj type seupgradestatussummary field type str  type boolean.
   * @param inProgress set the inProgress.
   */
  @VsoMethod
  public void setInProgress(Boolean  inProgress) {
    this.inProgress = inProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property notes of obj type seupgradestatussummary field type str  type array.
   * @return notes
   */
  @VsoMethod
  public List<String> getNotes() {
    return notes;
  }

  /**
   * This is the setter method. this will set the notes
   * Placeholder for description of property notes of obj type seupgradestatussummary field type str  type array.
   * @return notes
   */
  @VsoMethod
  public void setNotes(List<String>  notes) {
    this.notes = notes;
  }

  /**
   * This is the setter method this will set the notes
   * Placeholder for description of property notes of obj type seupgradestatussummary field type str  type array.
   * @return notes
   */
  @VsoMethod
  public SeUpgradeStatusSummary addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return seAlreadyUpgradedAtStart
   */
  @VsoMethod
  public List<String> getSeAlreadyUpgradedAtStart() {
    return seAlreadyUpgradedAtStart;
  }

  /**
   * This is the setter method. this will set the seAlreadyUpgradedAtStart
   * It is a reference to an object of type serviceengine.
   * @return seAlreadyUpgradedAtStart
   */
  @VsoMethod
  public void setSeAlreadyUpgradedAtStart(List<String>  seAlreadyUpgradedAtStart) {
    this.seAlreadyUpgradedAtStart = seAlreadyUpgradedAtStart;
  }

  /**
   * This is the setter method this will set the seAlreadyUpgradedAtStart
   * It is a reference to an object of type serviceengine.
   * @return seAlreadyUpgradedAtStart
   */
  @VsoMethod
  public SeUpgradeStatusSummary addSeAlreadyUpgradedAtStartItem(String seAlreadyUpgradedAtStartItem) {
    if (this.seAlreadyUpgradedAtStart == null) {
      this.seAlreadyUpgradedAtStart = new ArrayList<String>();
    }
    this.seAlreadyUpgradedAtStart.add(seAlreadyUpgradedAtStartItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return seDisconnectedAtStart
   */
  @VsoMethod
  public List<String> getSeDisconnectedAtStart() {
    return seDisconnectedAtStart;
  }

  /**
   * This is the setter method. this will set the seDisconnectedAtStart
   * It is a reference to an object of type serviceengine.
   * @return seDisconnectedAtStart
   */
  @VsoMethod
  public void setSeDisconnectedAtStart(List<String>  seDisconnectedAtStart) {
    this.seDisconnectedAtStart = seDisconnectedAtStart;
  }

  /**
   * This is the setter method this will set the seDisconnectedAtStart
   * It is a reference to an object of type serviceengine.
   * @return seDisconnectedAtStart
   */
  @VsoMethod
  public SeUpgradeStatusSummary addSeDisconnectedAtStartItem(String seDisconnectedAtStartItem) {
    if (this.seDisconnectedAtStart == null) {
      this.seDisconnectedAtStart = new ArrayList<String>();
    }
    this.seDisconnectedAtStart.add(seDisconnectedAtStartItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_group_status of obj type seupgradestatussummary field type str  type array.
   * @return seGroupStatus
   */
  @VsoMethod
  public List<SeGroupStatus> getSeGroupStatus() {
    return seGroupStatus;
  }

  /**
   * This is the setter method. this will set the seGroupStatus
   * Placeholder for description of property se_group_status of obj type seupgradestatussummary field type str  type array.
   * @return seGroupStatus
   */
  @VsoMethod
  public void setSeGroupStatus(List<SeGroupStatus>  seGroupStatus) {
    this.seGroupStatus = seGroupStatus;
  }

  /**
   * This is the setter method this will set the seGroupStatus
   * Placeholder for description of property se_group_status of obj type seupgradestatussummary field type str  type array.
   * @return seGroupStatus
   */
  @VsoMethod
  public SeUpgradeStatusSummary addSeGroupStatusItem(SeGroupStatus seGroupStatusItem) {
    if (this.seGroupStatus == null) {
      this.seGroupStatus = new ArrayList<SeGroupStatus>();
    }
    this.seGroupStatus.add(seGroupStatusItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return seIpMissingAtStart
   */
  @VsoMethod
  public List<String> getSeIpMissingAtStart() {
    return seIpMissingAtStart;
  }

  /**
   * This is the setter method. this will set the seIpMissingAtStart
   * It is a reference to an object of type serviceengine.
   * @return seIpMissingAtStart
   */
  @VsoMethod
  public void setSeIpMissingAtStart(List<String>  seIpMissingAtStart) {
    this.seIpMissingAtStart = seIpMissingAtStart;
  }

  /**
   * This is the setter method this will set the seIpMissingAtStart
   * It is a reference to an object of type serviceengine.
   * @return seIpMissingAtStart
   */
  @VsoMethod
  public SeUpgradeStatusSummary addSeIpMissingAtStartItem(String seIpMissingAtStartItem) {
    if (this.seIpMissingAtStart == null) {
      this.seIpMissingAtStart = new ArrayList<String>();
    }
    this.seIpMissingAtStart.add(seIpMissingAtStartItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return sePoweredoffAtStart
   */
  @VsoMethod
  public List<String> getSePoweredoffAtStart() {
    return sePoweredoffAtStart;
  }

  /**
   * This is the setter method. this will set the sePoweredoffAtStart
   * It is a reference to an object of type serviceengine.
   * @return sePoweredoffAtStart
   */
  @VsoMethod
  public void setSePoweredoffAtStart(List<String>  sePoweredoffAtStart) {
    this.sePoweredoffAtStart = sePoweredoffAtStart;
  }

  /**
   * This is the setter method this will set the sePoweredoffAtStart
   * It is a reference to an object of type serviceengine.
   * @return sePoweredoffAtStart
   */
  @VsoMethod
  public SeUpgradeStatusSummary addSePoweredoffAtStartItem(String sePoweredoffAtStartItem) {
    if (this.sePoweredoffAtStart == null) {
      this.sePoweredoffAtStart = new ArrayList<String>();
    }
    this.sePoweredoffAtStart.add(sePoweredoffAtStartItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeCompleted
   */
  @VsoMethod
  public List<String> getSeUpgradeCompleted() {
    return seUpgradeCompleted;
  }

  /**
   * This is the setter method. this will set the seUpgradeCompleted
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeCompleted
   */
  @VsoMethod
  public void setSeUpgradeCompleted(List<String>  seUpgradeCompleted) {
    this.seUpgradeCompleted = seUpgradeCompleted;
  }

  /**
   * This is the setter method this will set the seUpgradeCompleted
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeCompleted
   */
  @VsoMethod
  public SeUpgradeStatusSummary addSeUpgradeCompletedItem(String seUpgradeCompletedItem) {
    if (this.seUpgradeCompleted == null) {
      this.seUpgradeCompleted = new ArrayList<String>();
    }
    this.seUpgradeCompleted.add(seUpgradeCompletedItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_upgrade_errors of obj type seupgradestatussummary field type str  type array.
   * @return seUpgradeErrors
   */
  @VsoMethod
  public List<SeUpgradeEvents> getSeUpgradeErrors() {
    return seUpgradeErrors;
  }

  /**
   * This is the setter method. this will set the seUpgradeErrors
   * Placeholder for description of property se_upgrade_errors of obj type seupgradestatussummary field type str  type array.
   * @return seUpgradeErrors
   */
  @VsoMethod
  public void setSeUpgradeErrors(List<SeUpgradeEvents>  seUpgradeErrors) {
    this.seUpgradeErrors = seUpgradeErrors;
  }

  /**
   * This is the setter method this will set the seUpgradeErrors
   * Placeholder for description of property se_upgrade_errors of obj type seupgradestatussummary field type str  type array.
   * @return seUpgradeErrors
   */
  @VsoMethod
  public SeUpgradeStatusSummary addSeUpgradeErrorsItem(SeUpgradeEvents seUpgradeErrorsItem) {
    if (this.seUpgradeErrors == null) {
      this.seUpgradeErrors = new ArrayList<SeUpgradeEvents>();
    }
    this.seUpgradeErrors.add(seUpgradeErrorsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeFailed
   */
  @VsoMethod
  public List<String> getSeUpgradeFailed() {
    return seUpgradeFailed;
  }

  /**
   * This is the setter method. this will set the seUpgradeFailed
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeFailed
   */
  @VsoMethod
  public void setSeUpgradeFailed(List<String>  seUpgradeFailed) {
    this.seUpgradeFailed = seUpgradeFailed;
  }

  /**
   * This is the setter method this will set the seUpgradeFailed
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeFailed
   */
  @VsoMethod
  public SeUpgradeStatusSummary addSeUpgradeFailedItem(String seUpgradeFailedItem) {
    if (this.seUpgradeFailed == null) {
      this.seUpgradeFailed = new ArrayList<String>();
    }
    this.seUpgradeFailed.add(seUpgradeFailedItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeInProgress
   */
  @VsoMethod
  public List<String> getSeUpgradeInProgress() {
    return seUpgradeInProgress;
  }

  /**
   * This is the setter method. this will set the seUpgradeInProgress
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeInProgress
   */
  @VsoMethod
  public void setSeUpgradeInProgress(List<String>  seUpgradeInProgress) {
    this.seUpgradeInProgress = seUpgradeInProgress;
  }

  /**
   * This is the setter method this will set the seUpgradeInProgress
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeInProgress
   */
  @VsoMethod
  public SeUpgradeStatusSummary addSeUpgradeInProgressItem(String seUpgradeInProgressItem) {
    if (this.seUpgradeInProgress == null) {
      this.seUpgradeInProgress = new ArrayList<String>();
    }
    this.seUpgradeInProgress.add(seUpgradeInProgressItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeNotStarted
   */
  @VsoMethod
  public List<String> getSeUpgradeNotStarted() {
    return seUpgradeNotStarted;
  }

  /**
   * This is the setter method. this will set the seUpgradeNotStarted
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeNotStarted
   */
  @VsoMethod
  public void setSeUpgradeNotStarted(List<String>  seUpgradeNotStarted) {
    this.seUpgradeNotStarted = seUpgradeNotStarted;
  }

  /**
   * This is the setter method this will set the seUpgradeNotStarted
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeNotStarted
   */
  @VsoMethod
  public SeUpgradeStatusSummary addSeUpgradeNotStartedItem(String seUpgradeNotStartedItem) {
    if (this.seUpgradeNotStarted == null) {
      this.seUpgradeNotStarted = new ArrayList<String>();
    }
    this.seUpgradeNotStarted.add(seUpgradeNotStartedItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeRetryCompleted
   */
  @VsoMethod
  public List<String> getSeUpgradeRetryCompleted() {
    return seUpgradeRetryCompleted;
  }

  /**
   * This is the setter method. this will set the seUpgradeRetryCompleted
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeRetryCompleted
   */
  @VsoMethod
  public void setSeUpgradeRetryCompleted(List<String>  seUpgradeRetryCompleted) {
    this.seUpgradeRetryCompleted = seUpgradeRetryCompleted;
  }

  /**
   * This is the setter method this will set the seUpgradeRetryCompleted
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeRetryCompleted
   */
  @VsoMethod
  public SeUpgradeStatusSummary addSeUpgradeRetryCompletedItem(String seUpgradeRetryCompletedItem) {
    if (this.seUpgradeRetryCompleted == null) {
      this.seUpgradeRetryCompleted = new ArrayList<String>();
    }
    this.seUpgradeRetryCompleted.add(seUpgradeRetryCompletedItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeRetryFailed
   */
  @VsoMethod
  public List<String> getSeUpgradeRetryFailed() {
    return seUpgradeRetryFailed;
  }

  /**
   * This is the setter method. this will set the seUpgradeRetryFailed
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeRetryFailed
   */
  @VsoMethod
  public void setSeUpgradeRetryFailed(List<String>  seUpgradeRetryFailed) {
    this.seUpgradeRetryFailed = seUpgradeRetryFailed;
  }

  /**
   * This is the setter method this will set the seUpgradeRetryFailed
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeRetryFailed
   */
  @VsoMethod
  public SeUpgradeStatusSummary addSeUpgradeRetryFailedItem(String seUpgradeRetryFailedItem) {
    if (this.seUpgradeRetryFailed == null) {
      this.seUpgradeRetryFailed = new ArrayList<String>();
    }
    this.seUpgradeRetryFailed.add(seUpgradeRetryFailedItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeRetryInProgress
   */
  @VsoMethod
  public List<String> getSeUpgradeRetryInProgress() {
    return seUpgradeRetryInProgress;
  }

  /**
   * This is the setter method. this will set the seUpgradeRetryInProgress
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeRetryInProgress
   */
  @VsoMethod
  public void setSeUpgradeRetryInProgress(List<String>  seUpgradeRetryInProgress) {
    this.seUpgradeRetryInProgress = seUpgradeRetryInProgress;
  }

  /**
   * This is the setter method this will set the seUpgradeRetryInProgress
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeRetryInProgress
   */
  @VsoMethod
  public SeUpgradeStatusSummary addSeUpgradeRetryInProgressItem(String seUpgradeRetryInProgressItem) {
    if (this.seUpgradeRetryInProgress == null) {
      this.seUpgradeRetryInProgress = new ArrayList<String>();
    }
    this.seUpgradeRetryInProgress.add(seUpgradeRetryInProgressItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Service engines that were in suspended state and were skipped upon service engine group upgrade resumption.
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeSkipSuspended
   */
  @VsoMethod
  public List<String> getSeUpgradeSkipSuspended() {
    return seUpgradeSkipSuspended;
  }

  /**
   * This is the setter method. this will set the seUpgradeSkipSuspended
   * Service engines that were in suspended state and were skipped upon service engine group upgrade resumption.
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeSkipSuspended
   */
  @VsoMethod
  public void setSeUpgradeSkipSuspended(List<String>  seUpgradeSkipSuspended) {
    this.seUpgradeSkipSuspended = seUpgradeSkipSuspended;
  }

  /**
   * This is the setter method this will set the seUpgradeSkipSuspended
   * Service engines that were in suspended state and were skipped upon service engine group upgrade resumption.
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeSkipSuspended
   */
  @VsoMethod
  public SeUpgradeStatusSummary addSeUpgradeSkipSuspendedItem(String seUpgradeSkipSuspendedItem) {
    if (this.seUpgradeSkipSuspended == null) {
      this.seUpgradeSkipSuspended = new ArrayList<String>();
    }
    this.seUpgradeSkipSuspended.add(seUpgradeSkipSuspendedItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Service engines which triggered service engine group to be in suspended state.
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeSuspended
   */
  @VsoMethod
  public List<String> getSeUpgradeSuspended() {
    return seUpgradeSuspended;
  }

  /**
   * This is the setter method. this will set the seUpgradeSuspended
   * Service engines which triggered service engine group to be in suspended state.
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeSuspended
   */
  @VsoMethod
  public void setSeUpgradeSuspended(List<String>  seUpgradeSuspended) {
    this.seUpgradeSuspended = seUpgradeSuspended;
  }

  /**
   * This is the setter method this will set the seUpgradeSuspended
   * Service engines which triggered service engine group to be in suspended state.
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeSuspended
   */
  @VsoMethod
  public SeUpgradeStatusSummary addSeUpgradeSuspendedItem(String seUpgradeSuspendedItem) {
    if (this.seUpgradeSuspended == null) {
      this.seUpgradeSuspended = new ArrayList<String>();
    }
    this.seUpgradeSuspended.add(seUpgradeSuspendedItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property start_time of obj type seupgradestatussummary field type str  type string.
   * @return startTime
   */
  @VsoMethod
  public String getStartTime() {
    return startTime;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property start_time of obj type seupgradestatussummary field type str  type string.
   * @param startTime set the startTime.
   */
  @VsoMethod
  public void setStartTime(String  startTime) {
    this.startTime = startTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - SE_UPGRADE_PREVIEW, SE_UPGRADE_IN_PROGRESS, SE_UPGRADE_COMPLETE, SE_UPGRADE_ERROR, SE_UPGRADE_PRE_CHECKS, SE_IMAGE_INSTALL,
   * SE_UPGRADE_IMAGE_NOT_FOUND, SE_ALREADY_UPGRADED, SE_REBOOT, SE_CONNECT_AFTER_REBOOT, SE_PRE_UPGRADE_TASKS, SE_POST_UPGRADE_TASKS,
   * SE_WAIT_FOR_SWITCHOVER, SE_CHECK_SCALEDOUT_VS_EXISTS, SE_UPGRADE_SEMGR_REQUEST, SE_UPGRADE_SEMGR_SE_UNREACHABLE, SE_PRE_UPGRADE_SCALE_IN_OPS,
   * SE_POST_UPGRADE_SCALE_OUT_OPS, SE_UPGRADE_SUSPENDED, SE_UPGRADE_START...
   * @return state
   */
  @VsoMethod
  public String getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - SE_UPGRADE_PREVIEW, SE_UPGRADE_IN_PROGRESS, SE_UPGRADE_COMPLETE, SE_UPGRADE_ERROR, SE_UPGRADE_PRE_CHECKS, SE_IMAGE_INSTALL,
   * SE_UPGRADE_IMAGE_NOT_FOUND, SE_ALREADY_UPGRADED, SE_REBOOT, SE_CONNECT_AFTER_REBOOT, SE_PRE_UPGRADE_TASKS, SE_POST_UPGRADE_TASKS,
   * SE_WAIT_FOR_SWITCHOVER, SE_CHECK_SCALEDOUT_VS_EXISTS, SE_UPGRADE_SEMGR_REQUEST, SE_UPGRADE_SEMGR_SE_UNREACHABLE, SE_PRE_UPGRADE_SCALE_IN_OPS,
   * SE_POST_UPGRADE_SCALE_OUT_OPS, SE_UPGRADE_SUSPENDED, SE_UPGRADE_START...
   * @param state set the state.
   */
  @VsoMethod
  public void setState(String  state) {
    this.state = state;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vs_errors of obj type seupgradestatussummary field type str  type array.
   * @return vsErrors
   */
  @VsoMethod
  public List<VsError> getVsErrors() {
    return vsErrors;
  }

  /**
   * This is the setter method. this will set the vsErrors
   * Placeholder for description of property vs_errors of obj type seupgradestatussummary field type str  type array.
   * @return vsErrors
   */
  @VsoMethod
  public void setVsErrors(List<VsError>  vsErrors) {
    this.vsErrors = vsErrors;
  }

  /**
   * This is the setter method this will set the vsErrors
   * Placeholder for description of property vs_errors of obj type seupgradestatussummary field type str  type array.
   * @return vsErrors
   */
  @VsoMethod
  public SeUpgradeStatusSummary addVsErrorsItem(VsError vsErrorsItem) {
    if (this.vsErrors == null) {
      this.vsErrors = new ArrayList<VsError>();
    }
    this.vsErrors.add(vsErrorsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeUpgradeStatusSummary objSeUpgradeStatusSummary = (SeUpgradeStatusSummary) o;
  return   Objects.equals(this.inProgress, objSeUpgradeStatusSummary.inProgress)&&
  Objects.equals(this.state, objSeUpgradeStatusSummary.state)&&
  Objects.equals(this.controllerVersion, objSeUpgradeStatusSummary.controllerVersion)&&
  Objects.equals(this.notes, objSeUpgradeStatusSummary.notes)&&
  Objects.equals(this.startTime, objSeUpgradeStatusSummary.startTime)&&
  Objects.equals(this.endTime, objSeUpgradeStatusSummary.endTime)&&
  Objects.equals(this.duration, objSeUpgradeStatusSummary.duration)&&
  Objects.equals(this.seGroupStatus, objSeUpgradeStatusSummary.seGroupStatus)&&
  Objects.equals(this.seUpgradeNotStarted, objSeUpgradeStatusSummary.seUpgradeNotStarted)&&
  Objects.equals(this.seUpgradeInProgress, objSeUpgradeStatusSummary.seUpgradeInProgress)&&
  Objects.equals(this.seUpgradeCompleted, objSeUpgradeStatusSummary.seUpgradeCompleted)&&
  Objects.equals(this.seDisconnectedAtStart, objSeUpgradeStatusSummary.seDisconnectedAtStart)&&
  Objects.equals(this.sePoweredoffAtStart, objSeUpgradeStatusSummary.sePoweredoffAtStart)&&
  Objects.equals(this.seAlreadyUpgradedAtStart, objSeUpgradeStatusSummary.seAlreadyUpgradedAtStart)&&
  Objects.equals(this.seIpMissingAtStart, objSeUpgradeStatusSummary.seIpMissingAtStart)&&
  Objects.equals(this.seUpgradeFailed, objSeUpgradeStatusSummary.seUpgradeFailed)&&
  Objects.equals(this.seUpgradeRetryInProgress, objSeUpgradeStatusSummary.seUpgradeRetryInProgress)&&
  Objects.equals(this.seUpgradeRetryCompleted, objSeUpgradeStatusSummary.seUpgradeRetryCompleted)&&
  Objects.equals(this.seUpgradeRetryFailed, objSeUpgradeStatusSummary.seUpgradeRetryFailed)&&
  Objects.equals(this.seUpgradeErrors, objSeUpgradeStatusSummary.seUpgradeErrors)&&
  Objects.equals(this.vsErrors, objSeUpgradeStatusSummary.vsErrors)&&
  Objects.equals(this.seUpgradeSuspended, objSeUpgradeStatusSummary.seUpgradeSuspended)&&
  Objects.equals(this.seUpgradeSkipSuspended, objSeUpgradeStatusSummary.seUpgradeSkipSuspended);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeUpgradeStatusSummary {\n");
      sb.append("    controllerVersion: ").append(toIndentedString(controllerVersion)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    seAlreadyUpgradedAtStart: ").append(toIndentedString(seAlreadyUpgradedAtStart)).append("\n");
        sb.append("    seDisconnectedAtStart: ").append(toIndentedString(seDisconnectedAtStart)).append("\n");
        sb.append("    seGroupStatus: ").append(toIndentedString(seGroupStatus)).append("\n");
        sb.append("    seIpMissingAtStart: ").append(toIndentedString(seIpMissingAtStart)).append("\n");
        sb.append("    sePoweredoffAtStart: ").append(toIndentedString(sePoweredoffAtStart)).append("\n");
        sb.append("    seUpgradeCompleted: ").append(toIndentedString(seUpgradeCompleted)).append("\n");
        sb.append("    seUpgradeErrors: ").append(toIndentedString(seUpgradeErrors)).append("\n");
        sb.append("    seUpgradeFailed: ").append(toIndentedString(seUpgradeFailed)).append("\n");
        sb.append("    seUpgradeInProgress: ").append(toIndentedString(seUpgradeInProgress)).append("\n");
        sb.append("    seUpgradeNotStarted: ").append(toIndentedString(seUpgradeNotStarted)).append("\n");
        sb.append("    seUpgradeRetryCompleted: ").append(toIndentedString(seUpgradeRetryCompleted)).append("\n");
        sb.append("    seUpgradeRetryFailed: ").append(toIndentedString(seUpgradeRetryFailed)).append("\n");
        sb.append("    seUpgradeRetryInProgress: ").append(toIndentedString(seUpgradeRetryInProgress)).append("\n");
        sb.append("    seUpgradeSkipSuspended: ").append(toIndentedString(seUpgradeSkipSuspended)).append("\n");
        sb.append("    seUpgradeSuspended: ").append(toIndentedString(seUpgradeSuspended)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    vsErrors: ").append(toIndentedString(vsErrors)).append("\n");
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

