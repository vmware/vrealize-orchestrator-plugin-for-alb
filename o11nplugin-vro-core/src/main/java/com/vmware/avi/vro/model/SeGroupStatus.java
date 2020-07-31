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
 * The SeGroupStatus is a POJO class extends AviRestResource that used for creating
 * SeGroupStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeGroupStatus")
@VsoFinder(name = Constants.FINDER_VRO_SEGROUPSTATUS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeGroupStatus extends AviRestResource {
  @JsonProperty("controller_version")
  @JsonInclude(Include.NON_NULL)
  private String controllerVersion = null;

  @JsonProperty("disrupted_vs_ref")
  @JsonInclude(Include.NON_NULL)
  private List<String> disruptedVsRef = null;

  @JsonProperty("duration")
  @JsonInclude(Include.NON_NULL)
  private String duration = null;

  @JsonProperty("end_time")
  @JsonInclude(Include.NON_NULL)
  private String endTime = null;

  @JsonProperty("enqueue_time")
  @JsonInclude(Include.NON_NULL)
  private String enqueueTime = null;

  @JsonProperty("ha_mode")
  @JsonInclude(Include.NON_NULL)
  private String haMode = null;

  @JsonProperty("in_progress")
  @JsonInclude(Include.NON_NULL)
  private Boolean inProgress = null;

  @JsonProperty("notes")
  @JsonInclude(Include.NON_NULL)
  private List<String> notes = null;

  @JsonProperty("num_se")
  @JsonInclude(Include.NON_NULL)
  private Integer numSe = null;

  @JsonProperty("num_se_with_no_vs")
  @JsonInclude(Include.NON_NULL)
  private Integer numSeWithNoVs = null;

  @JsonProperty("num_se_with_vs_not_scaledout")
  @JsonInclude(Include.NON_NULL)
  private Integer numSeWithVsNotScaledout = null;

  @JsonProperty("num_se_with_vs_scaledout")
  @JsonInclude(Include.NON_NULL)
  private Integer numSeWithVsScaledout = null;

  @JsonProperty("num_vs")
  @JsonInclude(Include.NON_NULL)
  private Integer numVs = null;

  @JsonProperty("num_vs_disrupted")
  @JsonInclude(Include.NON_NULL)
  private Integer numVsDisrupted = null;

  @JsonProperty("progress")
  @JsonInclude(Include.NON_NULL)
  private Integer progress = null;

  @JsonProperty("reason")
  @JsonInclude(Include.NON_NULL)
  private List<String> reason = null;

  @JsonProperty("request_time")
  @JsonInclude(Include.NON_NULL)
  private String requestTime = null;

  @JsonProperty("se_already_upgraded_at_start")
  @JsonInclude(Include.NON_NULL)
  private List<String> seAlreadyUpgradedAtStart = null;

  @JsonProperty("se_disconnected_at_start")
  @JsonInclude(Include.NON_NULL)
  private List<String> seDisconnectedAtStart = null;

  @JsonProperty("se_group_name")
  @JsonInclude(Include.NON_NULL)
  private String seGroupName = null;

  @JsonProperty("se_group_uuid")
  @JsonInclude(Include.NON_NULL)
  private String seGroupUuid = null;

  @JsonProperty("se_ip_missing_at_start")
  @JsonInclude(Include.NON_NULL)
  private List<String> seIpMissingAtStart = null;

  @JsonProperty("se_poweredoff_at_start")
  @JsonInclude(Include.NON_NULL)
  private List<String> sePoweredoffAtStart = null;

  @JsonProperty("se_reboot_in_progress_ref")
  @JsonInclude(Include.NON_NULL)
  private String seRebootInProgressRef = null;

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

  @JsonProperty("se_upgrade_skip_suspended")
  @JsonInclude(Include.NON_NULL)
  private List<String> seUpgradeSkipSuspended = null;

  @JsonProperty("se_upgrade_suspended")
  @JsonInclude(Include.NON_NULL)
  private List<String> seUpgradeSuspended = null;

  @JsonProperty("se_with_no_vs")
  @JsonInclude(Include.NON_NULL)
  private List<String> seWithNoVs = null;

  @JsonProperty("se_with_vs_not_scaledout")
  @JsonInclude(Include.NON_NULL)
  private List<String> seWithVsNotScaledout = null;

  @JsonProperty("se_with_vs_scaledout")
  @JsonInclude(Include.NON_NULL)
  private List<String> seWithVsScaledout = null;

  @JsonProperty("start_time")
  @JsonInclude(Include.NON_NULL)
  private String startTime = null;

  @JsonProperty("state")
  @JsonInclude(Include.NON_NULL)
  private String state = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("thread")
  @JsonInclude(Include.NON_NULL)
  private String thread = null;

  @JsonProperty("traffic_status")
  @JsonInclude(Include.NON_NULL)
  private String trafficStatus = null;

  @JsonProperty("vs_errors")
  @JsonInclude(Include.NON_NULL)
  private List<VsError> vsErrors = null;

  @JsonProperty("vs_migrate_in_progress_ref")
  @JsonInclude(Include.NON_NULL)
  private List<String> vsMigrateInProgressRef = null;

  @JsonProperty("vs_scalein_in_progress_ref")
  @JsonInclude(Include.NON_NULL)
  private List<String> vsScaleinInProgressRef = null;

  @JsonProperty("vs_scaleout_in_progress_ref")
  @JsonInclude(Include.NON_NULL)
  private List<String> vsScaleoutInProgressRef = null;

  @JsonProperty("worker")
  @JsonInclude(Include.NON_NULL)
  private String worker = null;



  /**
   * This is the getter method this will return the attribute value.
   * Controller version.
   * Field introduced in 18.2.6.
   * @return controllerVersion
   */
  @VsoMethod
  public String getControllerVersion() {
    return controllerVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Controller version.
   * Field introduced in 18.2.6.
   * @param controllerVersion set the controllerVersion.
   */
  @VsoMethod
  public void setControllerVersion(String  controllerVersion) {
    this.controllerVersion = controllerVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type virtualservice.
   * @return disruptedVsRef
   */
  @VsoMethod
  public List<String> getDisruptedVsRef() {
    return disruptedVsRef;
  }

  /**
   * This is the setter method. this will set the disruptedVsRef
   * It is a reference to an object of type virtualservice.
   * @return disruptedVsRef
   */
  @VsoMethod
  public void setDisruptedVsRef(List<String>  disruptedVsRef) {
    this.disruptedVsRef = disruptedVsRef;
  }

  /**
   * This is the setter method this will set the disruptedVsRef
   * It is a reference to an object of type virtualservice.
   * @return disruptedVsRef
   */
  @VsoMethod
  public SeGroupStatus addDisruptedVsRefItem(String disruptedVsRefItem) {
    if (this.disruptedVsRef == null) {
      this.disruptedVsRef = new ArrayList<String>();
    }
    this.disruptedVsRef.add(disruptedVsRefItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property duration of obj type segroupstatus field type str  type string.
   * @return duration
   */
  @VsoMethod
  public String getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property duration of obj type segroupstatus field type str  type string.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(String  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property end_time of obj type segroupstatus field type str  type string.
   * @return endTime
   */
  @VsoMethod
  public String getEndTime() {
    return endTime;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property end_time of obj type segroupstatus field type str  type string.
   * @param endTime set the endTime.
   */
  @VsoMethod
  public void setEndTime(String  endTime) {
    this.endTime = endTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property enqueue_time of obj type segroupstatus field type str  type string.
   * @return enqueueTime
   */
  @VsoMethod
  public String getEnqueueTime() {
    return enqueueTime;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property enqueue_time of obj type segroupstatus field type str  type string.
   * @param enqueueTime set the enqueueTime.
   */
  @VsoMethod
  public void setEnqueueTime(String  enqueueTime) {
    this.enqueueTime = enqueueTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.
   * @return haMode
   */
  @VsoMethod
  public String getHaMode() {
    return haMode;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.
   * @param haMode set the haMode.
   */
  @VsoMethod
  public void setHaMode(String  haMode) {
    this.haMode = haMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Serviceenginegroup upgrade in progress.
   * Field introduced in 18.2.6.
   * @return inProgress
   */
  @VsoMethod
  public Boolean getInProgress() {
    return inProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Serviceenginegroup upgrade in progress.
   * Field introduced in 18.2.6.
   * @param inProgress set the inProgress.
   */
  @VsoMethod
  public void setInProgress(Boolean  inProgress) {
    this.inProgress = inProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property notes of obj type segroupstatus field type str  type array.
   * @return notes
   */
  @VsoMethod
  public List<String> getNotes() {
    return notes;
  }

  /**
   * This is the setter method. this will set the notes
   * Placeholder for description of property notes of obj type segroupstatus field type str  type array.
   * @return notes
   */
  @VsoMethod
  public void setNotes(List<String>  notes) {
    this.notes = notes;
  }

  /**
   * This is the setter method this will set the notes
   * Placeholder for description of property notes of obj type segroupstatus field type str  type array.
   * @return notes
   */
  @VsoMethod
  public SeGroupStatus addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_se of obj type segroupstatus field type str  type integer.
   * @return numSe
   */
  @VsoMethod
  public Integer getNumSe() {
    return numSe;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_se of obj type segroupstatus field type str  type integer.
   * @param numSe set the numSe.
   */
  @VsoMethod
  public void setNumSe(Integer  numSe) {
    this.numSe = numSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_se_with_no_vs of obj type segroupstatus field type str  type integer.
   * @return numSeWithNoVs
   */
  @VsoMethod
  public Integer getNumSeWithNoVs() {
    return numSeWithNoVs;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_se_with_no_vs of obj type segroupstatus field type str  type integer.
   * @param numSeWithNoVs set the numSeWithNoVs.
   */
  @VsoMethod
  public void setNumSeWithNoVs(Integer  numSeWithNoVs) {
    this.numSeWithNoVs = numSeWithNoVs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_se_with_vs_not_scaledout of obj type segroupstatus field type str  type integer.
   * @return numSeWithVsNotScaledout
   */
  @VsoMethod
  public Integer getNumSeWithVsNotScaledout() {
    return numSeWithVsNotScaledout;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_se_with_vs_not_scaledout of obj type segroupstatus field type str  type integer.
   * @param numSeWithVsNotScaledout set the numSeWithVsNotScaledout.
   */
  @VsoMethod
  public void setNumSeWithVsNotScaledout(Integer  numSeWithVsNotScaledout) {
    this.numSeWithVsNotScaledout = numSeWithVsNotScaledout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_se_with_vs_scaledout of obj type segroupstatus field type str  type integer.
   * @return numSeWithVsScaledout
   */
  @VsoMethod
  public Integer getNumSeWithVsScaledout() {
    return numSeWithVsScaledout;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_se_with_vs_scaledout of obj type segroupstatus field type str  type integer.
   * @param numSeWithVsScaledout set the numSeWithVsScaledout.
   */
  @VsoMethod
  public void setNumSeWithVsScaledout(Integer  numSeWithVsScaledout) {
    this.numSeWithVsScaledout = numSeWithVsScaledout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_vs of obj type segroupstatus field type str  type integer.
   * @return numVs
   */
  @VsoMethod
  public Integer getNumVs() {
    return numVs;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_vs of obj type segroupstatus field type str  type integer.
   * @param numVs set the numVs.
   */
  @VsoMethod
  public void setNumVs(Integer  numVs) {
    this.numVs = numVs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_vs_disrupted of obj type segroupstatus field type str  type integer.
   * @return numVsDisrupted
   */
  @VsoMethod
  public Integer getNumVsDisrupted() {
    return numVsDisrupted;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_vs_disrupted of obj type segroupstatus field type str  type integer.
   * @param numVsDisrupted set the numVsDisrupted.
   */
  @VsoMethod
  public void setNumVsDisrupted(Integer  numVsDisrupted) {
    this.numVsDisrupted = numVsDisrupted;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property progress of obj type segroupstatus field type str  type integer.
   * @return progress
   */
  @VsoMethod
  public Integer getProgress() {
    return progress;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property progress of obj type segroupstatus field type str  type integer.
   * @param progress set the progress.
   */
  @VsoMethod
  public void setProgress(Integer  progress) {
    this.progress = progress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property reason of obj type segroupstatus field type str  type array.
   * @return reason
   */
  @VsoMethod
  public List<String> getReason() {
    return reason;
  }

  /**
   * This is the setter method. this will set the reason
   * Placeholder for description of property reason of obj type segroupstatus field type str  type array.
   * @return reason
   */
  @VsoMethod
  public void setReason(List<String>  reason) {
    this.reason = reason;
  }

  /**
   * This is the setter method this will set the reason
   * Placeholder for description of property reason of obj type segroupstatus field type str  type array.
   * @return reason
   */
  @VsoMethod
  public SeGroupStatus addReasonItem(String reasonItem) {
    if (this.reason == null) {
      this.reason = new ArrayList<String>();
    }
    this.reason.add(reasonItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property request_time of obj type segroupstatus field type str  type string.
   * @return requestTime
   */
  @VsoMethod
  public String getRequestTime() {
    return requestTime;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property request_time of obj type segroupstatus field type str  type string.
   * @param requestTime set the requestTime.
   */
  @VsoMethod
  public void setRequestTime(String  requestTime) {
    this.requestTime = requestTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Serviceengines are already upgraded before the upgrade.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seAlreadyUpgradedAtStart
   */
  @VsoMethod
  public List<String> getSeAlreadyUpgradedAtStart() {
    return seAlreadyUpgradedAtStart;
  }

  /**
   * This is the setter method. this will set the seAlreadyUpgradedAtStart
   * Serviceengines are already upgraded before the upgrade.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seAlreadyUpgradedAtStart
   */
  @VsoMethod
  public void setSeAlreadyUpgradedAtStart(List<String>  seAlreadyUpgradedAtStart) {
    this.seAlreadyUpgradedAtStart = seAlreadyUpgradedAtStart;
  }

  /**
   * This is the setter method this will set the seAlreadyUpgradedAtStart
   * Serviceengines are already upgraded before the upgrade.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seAlreadyUpgradedAtStart
   */
  @VsoMethod
  public SeGroupStatus addSeAlreadyUpgradedAtStartItem(String seAlreadyUpgradedAtStartItem) {
    if (this.seAlreadyUpgradedAtStart == null) {
      this.seAlreadyUpgradedAtStart = new ArrayList<String>();
    }
    this.seAlreadyUpgradedAtStart.add(seAlreadyUpgradedAtStartItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Serviceengines in disconnected state before starting the upgrade.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seDisconnectedAtStart
   */
  @VsoMethod
  public List<String> getSeDisconnectedAtStart() {
    return seDisconnectedAtStart;
  }

  /**
   * This is the setter method. this will set the seDisconnectedAtStart
   * Serviceengines in disconnected state before starting the upgrade.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seDisconnectedAtStart
   */
  @VsoMethod
  public void setSeDisconnectedAtStart(List<String>  seDisconnectedAtStart) {
    this.seDisconnectedAtStart = seDisconnectedAtStart;
  }

  /**
   * This is the setter method this will set the seDisconnectedAtStart
   * Serviceengines in disconnected state before starting the upgrade.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seDisconnectedAtStart
   */
  @VsoMethod
  public SeGroupStatus addSeDisconnectedAtStartItem(String seDisconnectedAtStartItem) {
    if (this.seDisconnectedAtStart == null) {
      this.seDisconnectedAtStart = new ArrayList<String>();
    }
    this.seDisconnectedAtStart.add(seDisconnectedAtStartItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_group_name of obj type segroupstatus field type str  type string.
   * @return seGroupName
   */
  @VsoMethod
  public String getSeGroupName() {
    return seGroupName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property se_group_name of obj type segroupstatus field type str  type string.
   * @param seGroupName set the seGroupName.
   */
  @VsoMethod
  public void setSeGroupName(String  seGroupName) {
    this.seGroupName = seGroupName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of se_group.
   * @return seGroupUuid
   */
  @VsoMethod
  public String getSeGroupUuid() {
    return seGroupUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of se_group.
   * @param seGroupUuid set the seGroupUuid.
   */
  @VsoMethod
  public void setSeGroupUuid(String  seGroupUuid) {
    this.seGroupUuid = seGroupUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Serviceengines local ip not present before the upgrade.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seIpMissingAtStart
   */
  @VsoMethod
  public List<String> getSeIpMissingAtStart() {
    return seIpMissingAtStart;
  }

  /**
   * This is the setter method. this will set the seIpMissingAtStart
   * Serviceengines local ip not present before the upgrade.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seIpMissingAtStart
   */
  @VsoMethod
  public void setSeIpMissingAtStart(List<String>  seIpMissingAtStart) {
    this.seIpMissingAtStart = seIpMissingAtStart;
  }

  /**
   * This is the setter method this will set the seIpMissingAtStart
   * Serviceengines local ip not present before the upgrade.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seIpMissingAtStart
   */
  @VsoMethod
  public SeGroupStatus addSeIpMissingAtStartItem(String seIpMissingAtStartItem) {
    if (this.seIpMissingAtStart == null) {
      this.seIpMissingAtStart = new ArrayList<String>();
    }
    this.seIpMissingAtStart.add(seIpMissingAtStartItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Serviceengines in poweredoff state before the upgrade.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return sePoweredoffAtStart
   */
  @VsoMethod
  public List<String> getSePoweredoffAtStart() {
    return sePoweredoffAtStart;
  }

  /**
   * This is the setter method. this will set the sePoweredoffAtStart
   * Serviceengines in poweredoff state before the upgrade.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return sePoweredoffAtStart
   */
  @VsoMethod
  public void setSePoweredoffAtStart(List<String>  sePoweredoffAtStart) {
    this.sePoweredoffAtStart = sePoweredoffAtStart;
  }

  /**
   * This is the setter method this will set the sePoweredoffAtStart
   * Serviceengines in poweredoff state before the upgrade.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return sePoweredoffAtStart
   */
  @VsoMethod
  public SeGroupStatus addSePoweredoffAtStartItem(String sePoweredoffAtStartItem) {
    if (this.sePoweredoffAtStart == null) {
      this.sePoweredoffAtStart = new ArrayList<String>();
    }
    this.sePoweredoffAtStart.add(sePoweredoffAtStartItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return seRebootInProgressRef
   */
  @VsoMethod
  public String getSeRebootInProgressRef() {
    return seRebootInProgressRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type serviceengine.
   * @param seRebootInProgressRef set the seRebootInProgressRef.
   */
  @VsoMethod
  public void setSeRebootInProgressRef(String  seRebootInProgressRef) {
    this.seRebootInProgressRef = seRebootInProgressRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Serviceengines upgrade completed.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seUpgradeCompleted
   */
  @VsoMethod
  public List<String> getSeUpgradeCompleted() {
    return seUpgradeCompleted;
  }

  /**
   * This is the setter method. this will set the seUpgradeCompleted
   * Serviceengines upgrade completed.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seUpgradeCompleted
   */
  @VsoMethod
  public void setSeUpgradeCompleted(List<String>  seUpgradeCompleted) {
    this.seUpgradeCompleted = seUpgradeCompleted;
  }

  /**
   * This is the setter method this will set the seUpgradeCompleted
   * Serviceengines upgrade completed.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seUpgradeCompleted
   */
  @VsoMethod
  public SeGroupStatus addSeUpgradeCompletedItem(String seUpgradeCompletedItem) {
    if (this.seUpgradeCompleted == null) {
      this.seUpgradeCompleted = new ArrayList<String>();
    }
    this.seUpgradeCompleted.add(seUpgradeCompletedItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Serviceenginegroup upgrade errors.
   * Field introduced in 18.2.6.
   * @return seUpgradeErrors
   */
  @VsoMethod
  public List<SeUpgradeEvents> getSeUpgradeErrors() {
    return seUpgradeErrors;
  }

  /**
   * This is the setter method. this will set the seUpgradeErrors
   * Serviceenginegroup upgrade errors.
   * Field introduced in 18.2.6.
   * @return seUpgradeErrors
   */
  @VsoMethod
  public void setSeUpgradeErrors(List<SeUpgradeEvents>  seUpgradeErrors) {
    this.seUpgradeErrors = seUpgradeErrors;
  }

  /**
   * This is the setter method this will set the seUpgradeErrors
   * Serviceenginegroup upgrade errors.
   * Field introduced in 18.2.6.
   * @return seUpgradeErrors
   */
  @VsoMethod
  public SeGroupStatus addSeUpgradeErrorsItem(SeUpgradeEvents seUpgradeErrorsItem) {
    if (this.seUpgradeErrors == null) {
      this.seUpgradeErrors = new ArrayList<SeUpgradeEvents>();
    }
    this.seUpgradeErrors.add(seUpgradeErrorsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Serviceengines upgrade failed.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seUpgradeFailed
   */
  @VsoMethod
  public List<String> getSeUpgradeFailed() {
    return seUpgradeFailed;
  }

  /**
   * This is the setter method. this will set the seUpgradeFailed
   * Serviceengines upgrade failed.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seUpgradeFailed
   */
  @VsoMethod
  public void setSeUpgradeFailed(List<String>  seUpgradeFailed) {
    this.seUpgradeFailed = seUpgradeFailed;
  }

  /**
   * This is the setter method this will set the seUpgradeFailed
   * Serviceengines upgrade failed.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seUpgradeFailed
   */
  @VsoMethod
  public SeGroupStatus addSeUpgradeFailedItem(String seUpgradeFailedItem) {
    if (this.seUpgradeFailed == null) {
      this.seUpgradeFailed = new ArrayList<String>();
    }
    this.seUpgradeFailed.add(seUpgradeFailedItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Serviceengines upgrade in progress.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seUpgradeInProgress
   */
  @VsoMethod
  public List<String> getSeUpgradeInProgress() {
    return seUpgradeInProgress;
  }

  /**
   * This is the setter method. this will set the seUpgradeInProgress
   * Serviceengines upgrade in progress.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seUpgradeInProgress
   */
  @VsoMethod
  public void setSeUpgradeInProgress(List<String>  seUpgradeInProgress) {
    this.seUpgradeInProgress = seUpgradeInProgress;
  }

  /**
   * This is the setter method this will set the seUpgradeInProgress
   * Serviceengines upgrade in progress.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seUpgradeInProgress
   */
  @VsoMethod
  public SeGroupStatus addSeUpgradeInProgressItem(String seUpgradeInProgressItem) {
    if (this.seUpgradeInProgress == null) {
      this.seUpgradeInProgress = new ArrayList<String>();
    }
    this.seUpgradeInProgress.add(seUpgradeInProgressItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Serviceengines upgrade not started.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seUpgradeNotStarted
   */
  @VsoMethod
  public List<String> getSeUpgradeNotStarted() {
    return seUpgradeNotStarted;
  }

  /**
   * This is the setter method. this will set the seUpgradeNotStarted
   * Serviceengines upgrade not started.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seUpgradeNotStarted
   */
  @VsoMethod
  public void setSeUpgradeNotStarted(List<String>  seUpgradeNotStarted) {
    this.seUpgradeNotStarted = seUpgradeNotStarted;
  }

  /**
   * This is the setter method this will set the seUpgradeNotStarted
   * Serviceengines upgrade not started.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.6.
   * @return seUpgradeNotStarted
   */
  @VsoMethod
  public SeGroupStatus addSeUpgradeNotStartedItem(String seUpgradeNotStartedItem) {
    if (this.seUpgradeNotStarted == null) {
      this.seUpgradeNotStarted = new ArrayList<String>();
    }
    this.seUpgradeNotStarted.add(seUpgradeNotStartedItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Service engines that were in suspended state and were skipped upon service engine group ugprade resumption.
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeSkipSuspended
   */
  @VsoMethod
  public List<String> getSeUpgradeSkipSuspended() {
    return seUpgradeSkipSuspended;
  }

  /**
   * This is the setter method. this will set the seUpgradeSkipSuspended
   * Service engines that were in suspended state and were skipped upon service engine group ugprade resumption.
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeSkipSuspended
   */
  @VsoMethod
  public void setSeUpgradeSkipSuspended(List<String>  seUpgradeSkipSuspended) {
    this.seUpgradeSkipSuspended = seUpgradeSkipSuspended;
  }

  /**
   * This is the setter method this will set the seUpgradeSkipSuspended
   * Service engines that were in suspended state and were skipped upon service engine group ugprade resumption.
   * It is a reference to an object of type serviceengine.
   * @return seUpgradeSkipSuspended
   */
  @VsoMethod
  public SeGroupStatus addSeUpgradeSkipSuspendedItem(String seUpgradeSkipSuspendedItem) {
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
  public SeGroupStatus addSeUpgradeSuspendedItem(String seUpgradeSuspendedItem) {
    if (this.seUpgradeSuspended == null) {
      this.seUpgradeSuspended = new ArrayList<String>();
    }
    this.seUpgradeSuspended.add(seUpgradeSuspendedItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return seWithNoVs
   */
  @VsoMethod
  public List<String> getSeWithNoVs() {
    return seWithNoVs;
  }

  /**
   * This is the setter method. this will set the seWithNoVs
   * It is a reference to an object of type serviceengine.
   * @return seWithNoVs
   */
  @VsoMethod
  public void setSeWithNoVs(List<String>  seWithNoVs) {
    this.seWithNoVs = seWithNoVs;
  }

  /**
   * This is the setter method this will set the seWithNoVs
   * It is a reference to an object of type serviceengine.
   * @return seWithNoVs
   */
  @VsoMethod
  public SeGroupStatus addSeWithNoVsItem(String seWithNoVsItem) {
    if (this.seWithNoVs == null) {
      this.seWithNoVs = new ArrayList<String>();
    }
    this.seWithNoVs.add(seWithNoVsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return seWithVsNotScaledout
   */
  @VsoMethod
  public List<String> getSeWithVsNotScaledout() {
    return seWithVsNotScaledout;
  }

  /**
   * This is the setter method. this will set the seWithVsNotScaledout
   * It is a reference to an object of type serviceengine.
   * @return seWithVsNotScaledout
   */
  @VsoMethod
  public void setSeWithVsNotScaledout(List<String>  seWithVsNotScaledout) {
    this.seWithVsNotScaledout = seWithVsNotScaledout;
  }

  /**
   * This is the setter method this will set the seWithVsNotScaledout
   * It is a reference to an object of type serviceengine.
   * @return seWithVsNotScaledout
   */
  @VsoMethod
  public SeGroupStatus addSeWithVsNotScaledoutItem(String seWithVsNotScaledoutItem) {
    if (this.seWithVsNotScaledout == null) {
      this.seWithVsNotScaledout = new ArrayList<String>();
    }
    this.seWithVsNotScaledout.add(seWithVsNotScaledoutItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return seWithVsScaledout
   */
  @VsoMethod
  public List<String> getSeWithVsScaledout() {
    return seWithVsScaledout;
  }

  /**
   * This is the setter method. this will set the seWithVsScaledout
   * It is a reference to an object of type serviceengine.
   * @return seWithVsScaledout
   */
  @VsoMethod
  public void setSeWithVsScaledout(List<String>  seWithVsScaledout) {
    this.seWithVsScaledout = seWithVsScaledout;
  }

  /**
   * This is the setter method this will set the seWithVsScaledout
   * It is a reference to an object of type serviceengine.
   * @return seWithVsScaledout
   */
  @VsoMethod
  public SeGroupStatus addSeWithVsScaledoutItem(String seWithVsScaledoutItem) {
    if (this.seWithVsScaledout == null) {
      this.seWithVsScaledout = new ArrayList<String>();
    }
    this.seWithVsScaledout.add(seWithVsScaledoutItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property start_time of obj type segroupstatus field type str  type string.
   * @return startTime
   */
  @VsoMethod
  public String getStartTime() {
    return startTime;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property start_time of obj type segroupstatus field type str  type string.
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
   * It is a reference to an object of type tenant.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property thread of obj type segroupstatus field type str  type string.
   * @return thread
   */
  @VsoMethod
  public String getThread() {
    return thread;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property thread of obj type segroupstatus field type str  type string.
   * @param thread set the thread.
   */
  @VsoMethod
  public void setThread(String  thread) {
    this.thread = thread;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - TRAFFIC_DISRUPTED, TRAFFIC_NOT_DISRUPTED.
   * @return trafficStatus
   */
  @VsoMethod
  public String getTrafficStatus() {
    return trafficStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - TRAFFIC_DISRUPTED, TRAFFIC_NOT_DISRUPTED.
   * @param trafficStatus set the trafficStatus.
   */
  @VsoMethod
  public void setTrafficStatus(String  trafficStatus) {
    this.trafficStatus = trafficStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Virtualservice errors during the segroup upgrade.
   * Field introduced in 18.2.6.
   * @return vsErrors
   */
  @VsoMethod
  public List<VsError> getVsErrors() {
    return vsErrors;
  }

  /**
   * This is the setter method. this will set the vsErrors
   * Virtualservice errors during the segroup upgrade.
   * Field introduced in 18.2.6.
   * @return vsErrors
   */
  @VsoMethod
  public void setVsErrors(List<VsError>  vsErrors) {
    this.vsErrors = vsErrors;
  }

  /**
   * This is the setter method this will set the vsErrors
   * Virtualservice errors during the segroup upgrade.
   * Field introduced in 18.2.6.
   * @return vsErrors
   */
  @VsoMethod
  public SeGroupStatus addVsErrorsItem(VsError vsErrorsItem) {
    if (this.vsErrors == null) {
      this.vsErrors = new ArrayList<VsError>();
    }
    this.vsErrors.add(vsErrorsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type virtualservice.
   * @return vsMigrateInProgressRef
   */
  @VsoMethod
  public List<String> getVsMigrateInProgressRef() {
    return vsMigrateInProgressRef;
  }

  /**
   * This is the setter method. this will set the vsMigrateInProgressRef
   * It is a reference to an object of type virtualservice.
   * @return vsMigrateInProgressRef
   */
  @VsoMethod
  public void setVsMigrateInProgressRef(List<String>  vsMigrateInProgressRef) {
    this.vsMigrateInProgressRef = vsMigrateInProgressRef;
  }

  /**
   * This is the setter method this will set the vsMigrateInProgressRef
   * It is a reference to an object of type virtualservice.
   * @return vsMigrateInProgressRef
   */
  @VsoMethod
  public SeGroupStatus addVsMigrateInProgressRefItem(String vsMigrateInProgressRefItem) {
    if (this.vsMigrateInProgressRef == null) {
      this.vsMigrateInProgressRef = new ArrayList<String>();
    }
    this.vsMigrateInProgressRef.add(vsMigrateInProgressRefItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type virtualservice.
   * @return vsScaleinInProgressRef
   */
  @VsoMethod
  public List<String> getVsScaleinInProgressRef() {
    return vsScaleinInProgressRef;
  }

  /**
   * This is the setter method. this will set the vsScaleinInProgressRef
   * It is a reference to an object of type virtualservice.
   * @return vsScaleinInProgressRef
   */
  @VsoMethod
  public void setVsScaleinInProgressRef(List<String>  vsScaleinInProgressRef) {
    this.vsScaleinInProgressRef = vsScaleinInProgressRef;
  }

  /**
   * This is the setter method this will set the vsScaleinInProgressRef
   * It is a reference to an object of type virtualservice.
   * @return vsScaleinInProgressRef
   */
  @VsoMethod
  public SeGroupStatus addVsScaleinInProgressRefItem(String vsScaleinInProgressRefItem) {
    if (this.vsScaleinInProgressRef == null) {
      this.vsScaleinInProgressRef = new ArrayList<String>();
    }
    this.vsScaleinInProgressRef.add(vsScaleinInProgressRefItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type virtualservice.
   * @return vsScaleoutInProgressRef
   */
  @VsoMethod
  public List<String> getVsScaleoutInProgressRef() {
    return vsScaleoutInProgressRef;
  }

  /**
   * This is the setter method. this will set the vsScaleoutInProgressRef
   * It is a reference to an object of type virtualservice.
   * @return vsScaleoutInProgressRef
   */
  @VsoMethod
  public void setVsScaleoutInProgressRef(List<String>  vsScaleoutInProgressRef) {
    this.vsScaleoutInProgressRef = vsScaleoutInProgressRef;
  }

  /**
   * This is the setter method this will set the vsScaleoutInProgressRef
   * It is a reference to an object of type virtualservice.
   * @return vsScaleoutInProgressRef
   */
  @VsoMethod
  public SeGroupStatus addVsScaleoutInProgressRefItem(String vsScaleoutInProgressRefItem) {
    if (this.vsScaleoutInProgressRef == null) {
      this.vsScaleoutInProgressRef = new ArrayList<String>();
    }
    this.vsScaleoutInProgressRef.add(vsScaleoutInProgressRefItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property worker of obj type segroupstatus field type str  type string.
   * @return worker
   */
  @VsoMethod
  public String getWorker() {
    return worker;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property worker of obj type segroupstatus field type str  type string.
   * @param worker set the worker.
   */
  @VsoMethod
  public void setWorker(String  worker) {
    this.worker = worker;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeGroupStatus objSeGroupStatus = (SeGroupStatus) o;
  return   Objects.equals(this.seGroupUuid, objSeGroupStatus.seGroupUuid)&&
  Objects.equals(this.seGroupName, objSeGroupStatus.seGroupName)&&
  Objects.equals(this.haMode, objSeGroupStatus.haMode)&&
  Objects.equals(this.numSe, objSeGroupStatus.numSe)&&
  Objects.equals(this.numVs, objSeGroupStatus.numVs)&&
  Objects.equals(this.trafficStatus, objSeGroupStatus.trafficStatus)&&
  Objects.equals(this.reason, objSeGroupStatus.reason)&&
  Objects.equals(this.tenantRef, objSeGroupStatus.tenantRef)&&
  Objects.equals(this.progress, objSeGroupStatus.progress)&&
  Objects.equals(this.requestTime, objSeGroupStatus.requestTime)&&
  Objects.equals(this.enqueueTime, objSeGroupStatus.enqueueTime)&&
  Objects.equals(this.startTime, objSeGroupStatus.startTime)&&
  Objects.equals(this.endTime, objSeGroupStatus.endTime)&&
  Objects.equals(this.duration, objSeGroupStatus.duration)&&
  Objects.equals(this.state, objSeGroupStatus.state)&&
  Objects.equals(this.notes, objSeGroupStatus.notes)&&
  Objects.equals(this.worker, objSeGroupStatus.worker)&&
  Objects.equals(this.thread, objSeGroupStatus.thread)&&
  Objects.equals(this.numVsDisrupted, objSeGroupStatus.numVsDisrupted)&&
  Objects.equals(this.disruptedVsRef, objSeGroupStatus.disruptedVsRef)&&
  Objects.equals(this.numSeWithNoVs, objSeGroupStatus.numSeWithNoVs)&&
  Objects.equals(this.seWithNoVs, objSeGroupStatus.seWithNoVs)&&
  Objects.equals(this.numSeWithVsNotScaledout, objSeGroupStatus.numSeWithVsNotScaledout)&&
  Objects.equals(this.seWithVsNotScaledout, objSeGroupStatus.seWithVsNotScaledout)&&
  Objects.equals(this.numSeWithVsScaledout, objSeGroupStatus.numSeWithVsScaledout)&&
  Objects.equals(this.seWithVsScaledout, objSeGroupStatus.seWithVsScaledout)&&
  Objects.equals(this.seRebootInProgressRef, objSeGroupStatus.seRebootInProgressRef)&&
  Objects.equals(this.vsScaleoutInProgressRef, objSeGroupStatus.vsScaleoutInProgressRef)&&
  Objects.equals(this.vsScaleinInProgressRef, objSeGroupStatus.vsScaleinInProgressRef)&&
  Objects.equals(this.vsMigrateInProgressRef, objSeGroupStatus.vsMigrateInProgressRef)&&
  Objects.equals(this.seUpgradeSuspended, objSeGroupStatus.seUpgradeSuspended)&&
  Objects.equals(this.seUpgradeSkipSuspended, objSeGroupStatus.seUpgradeSkipSuspended)&&
  Objects.equals(this.inProgress, objSeGroupStatus.inProgress)&&
  Objects.equals(this.controllerVersion, objSeGroupStatus.controllerVersion)&&
  Objects.equals(this.seUpgradeNotStarted, objSeGroupStatus.seUpgradeNotStarted)&&
  Objects.equals(this.seUpgradeInProgress, objSeGroupStatus.seUpgradeInProgress)&&
  Objects.equals(this.seUpgradeCompleted, objSeGroupStatus.seUpgradeCompleted)&&
  Objects.equals(this.seDisconnectedAtStart, objSeGroupStatus.seDisconnectedAtStart)&&
  Objects.equals(this.sePoweredoffAtStart, objSeGroupStatus.sePoweredoffAtStart)&&
  Objects.equals(this.seAlreadyUpgradedAtStart, objSeGroupStatus.seAlreadyUpgradedAtStart)&&
  Objects.equals(this.seIpMissingAtStart, objSeGroupStatus.seIpMissingAtStart)&&
  Objects.equals(this.seUpgradeFailed, objSeGroupStatus.seUpgradeFailed)&&
  Objects.equals(this.seUpgradeErrors, objSeGroupStatus.seUpgradeErrors)&&
  Objects.equals(this.vsErrors, objSeGroupStatus.vsErrors);
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

