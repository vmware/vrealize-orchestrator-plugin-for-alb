package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.VsEvStatus;
import com.vmware.avi.vro.model.TimeStamp;
import com.vmware.avi.vro.model.TimeStamp;
import com.vmware.avi.vro.model.ScaleStatus;
import com.vmware.avi.vro.model.VsMigrateParams;
import com.vmware.avi.vro.model.VirtualServiceResource;
import com.vmware.avi.vro.model.ScaleStatus;
import com.vmware.avi.vro.model.VsScaleinParams;
import com.vmware.avi.vro.model.OperationalStatus;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VipRuntime is a POJO class extends AviRestResource that used for creating
 * VipRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VipRuntime")
@VsoFinder(name = Constants.FINDER_VRO_VIPRUNTIME)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VipRuntime extends AviRestResource {
    @JsonProperty("ev")
    @JsonInclude(Include.NON_NULL)
    private List<String> ev = null;

    @JsonProperty("ev_status")
    @JsonInclude(Include.NON_NULL)
    private VsEvStatus evStatus = null;

    @JsonProperty("first_se_assigned_time")
    @JsonInclude(Include.NON_NULL)
    private TimeStamp firstSeAssignedTime = null;

    @JsonProperty("first_time_placement")
    @JsonInclude(Include.NON_NULL)
    private Boolean firstTimePlacement = false;

    @JsonProperty("fsm_state_id")
    @JsonInclude(Include.NON_NULL)
    private String fsmStateId = "0";

    @JsonProperty("fsm_state_name")
    @JsonInclude(Include.NON_NULL)
    private String fsmStateName = "VipFsmMap::Inactive";

    @JsonProperty("last_changed_time")
    @JsonInclude(Include.NON_NULL)
    private TimeStamp lastChangedTime = null;

    @JsonProperty("last_scale_status")
    @JsonInclude(Include.NON_NULL)
    private ScaleStatus lastScaleStatus = null;

    @JsonProperty("marked_for_delete")
    @JsonInclude(Include.NON_NULL)
    private Boolean markedForDelete = false;

    @JsonProperty("metrics_mgr_port")
    @JsonInclude(Include.NON_NULL)
    private String metricsMgrPort = null;

    @JsonProperty("migrate_in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean migrateInProgress = false;

    @JsonProperty("migrate_request")
    @JsonInclude(Include.NON_NULL)
    private VsMigrateParams migrateRequest = null;

    @JsonProperty("migrate_scalein_pending")
    @JsonInclude(Include.NON_NULL)
    private Boolean migrateScaleinPending = false;

    @JsonProperty("migrate_scaleout_pending")
    @JsonInclude(Include.NON_NULL)
    private Boolean migrateScaleoutPending = false;

    @JsonProperty("num_additional_se")
    @JsonInclude(Include.NON_NULL)
    private Integer numAdditionalSe = 0;

    @JsonProperty("prev_metrics_mgr_port")
    @JsonInclude(Include.NON_NULL)
    private String prevMetricsMgrPort = null;

    @JsonProperty("progress_percent")
    @JsonInclude(Include.NON_NULL)
    private Integer progressPercent = 0;

    @JsonProperty("requested_resource")
    @JsonInclude(Include.NON_NULL)
    private VirtualServiceResource requestedResource = null;

    @JsonProperty("scale_status")
    @JsonInclude(Include.NON_NULL)
    private ScaleStatus scaleStatus = null;

    @JsonProperty("scalein_in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean scaleinInProgress = false;

    @JsonProperty("scalein_request")
    @JsonInclude(Include.NON_NULL)
    private VsScaleinParams scaleinRequest = null;

    @JsonProperty("scaleout_in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean scaleoutInProgress = false;

    @JsonProperty("se_list")
    @JsonInclude(Include.NON_NULL)
    private List<SeList> seList = null;

    @JsonProperty("servers_configured")
    @JsonInclude(Include.NON_NULL)
    private Boolean serversConfigured;

    @JsonProperty("supp_runtime_status")
    @JsonInclude(Include.NON_NULL)
    private OperationalStatus suppRuntimeStatus = null;

    @JsonProperty("user_scaleout_pending")
    @JsonInclude(Include.NON_NULL)
    private Boolean userScaleoutPending = false;

    @JsonProperty("vip_id")
    @JsonInclude(Include.NON_NULL)
    private String vipId = null;

    @JsonProperty("warmstart_resync_done")
    @JsonInclude(Include.NON_NULL)
    private Boolean warmstartResyncDone = false;

    @JsonProperty("warmstart_resync_sent")
    @JsonInclude(Include.NON_NULL)
    private Boolean warmstartResyncSent = false;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property ev of obj type vipruntime field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ev
   */
  @VsoMethod
  public List<String> getEv() {
    return ev;
  }

  /**
   * This is the setter method. this will set the ev
   * Placeholder for description of property ev of obj type vipruntime field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ev
   */
  @VsoMethod
  public void setEv(List<String>  ev) {
    this.ev = ev;
  }

  /**
   * This is the setter method this will set the ev
   * Placeholder for description of property ev of obj type vipruntime field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ev
   */
  @VsoMethod
  public VipRuntime addEvItem(String evItem) {
    if (this.ev == null) {
      this.ev = new ArrayList<String>();
    }
    this.ev.add(evItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property ev_status of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return evStatus
   */
  @VsoMethod
  public VsEvStatus getEvStatus() {
    return evStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property ev_status of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param evStatus set the evStatus.
   */
  @VsoMethod
  public void setEvStatus(VsEvStatus evStatus) {
    this.evStatus = evStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property first_se_assigned_time of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return firstSeAssignedTime
   */
  @VsoMethod
  public TimeStamp getFirstSeAssignedTime() {
    return firstSeAssignedTime;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property first_se_assigned_time of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param firstSeAssignedTime set the firstSeAssignedTime.
   */
  @VsoMethod
  public void setFirstSeAssignedTime(TimeStamp firstSeAssignedTime) {
    this.firstSeAssignedTime = firstSeAssignedTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property first_time_placement of obj type vipruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return firstTimePlacement
   */
  @VsoMethod
  public Boolean getFirstTimePlacement() {
    return firstTimePlacement;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property first_time_placement of obj type vipruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param firstTimePlacement set the firstTimePlacement.
   */
  @VsoMethod
  public void setFirstTimePlacement(Boolean  firstTimePlacement) {
    this.firstTimePlacement = firstTimePlacement;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property fsm_state_id of obj type vipruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as "0".
   * @return fsmStateId
   */
  @VsoMethod
  public String getFsmStateId() {
    return fsmStateId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property fsm_state_id of obj type vipruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as "0".
   * @param fsmStateId set the fsmStateId.
   */
  @VsoMethod
  public void setFsmStateId(String  fsmStateId) {
    this.fsmStateId = fsmStateId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property fsm_state_name of obj type vipruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as "VipFsmMap::Inactive".
   * @return fsmStateName
   */
  @VsoMethod
  public String getFsmStateName() {
    return fsmStateName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property fsm_state_name of obj type vipruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as "VipFsmMap::Inactive".
   * @param fsmStateName set the fsmStateName.
   */
  @VsoMethod
  public void setFsmStateName(String  fsmStateName) {
    this.fsmStateName = fsmStateName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property last_changed_time of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastChangedTime
   */
  @VsoMethod
  public TimeStamp getLastChangedTime() {
    return lastChangedTime;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property last_changed_time of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastChangedTime set the lastChangedTime.
   */
  @VsoMethod
  public void setLastChangedTime(TimeStamp lastChangedTime) {
    this.lastChangedTime = lastChangedTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property last_scale_status of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastScaleStatus
   */
  @VsoMethod
  public ScaleStatus getLastScaleStatus() {
    return lastScaleStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property last_scale_status of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastScaleStatus set the lastScaleStatus.
   */
  @VsoMethod
  public void setLastScaleStatus(ScaleStatus lastScaleStatus) {
    this.lastScaleStatus = lastScaleStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property marked_for_delete of obj type vipruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return markedForDelete
   */
  @VsoMethod
  public Boolean getMarkedForDelete() {
    return markedForDelete;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property marked_for_delete of obj type vipruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param markedForDelete set the markedForDelete.
   */
  @VsoMethod
  public void setMarkedForDelete(Boolean  markedForDelete) {
    this.markedForDelete = markedForDelete;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricsMgrPort
   */
  @VsoMethod
  public String getMetricsMgrPort() {
    return metricsMgrPort;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metricsMgrPort set the metricsMgrPort.
   */
  @VsoMethod
  public void setMetricsMgrPort(String  metricsMgrPort) {
    this.metricsMgrPort = metricsMgrPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property migrate_in_progress of obj type vipruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return migrateInProgress
   */
  @VsoMethod
  public Boolean getMigrateInProgress() {
    return migrateInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property migrate_in_progress of obj type vipruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param migrateInProgress set the migrateInProgress.
   */
  @VsoMethod
  public void setMigrateInProgress(Boolean  migrateInProgress) {
    this.migrateInProgress = migrateInProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property migrate_request of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return migrateRequest
   */
  @VsoMethod
  public VsMigrateParams getMigrateRequest() {
    return migrateRequest;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property migrate_request of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param migrateRequest set the migrateRequest.
   */
  @VsoMethod
  public void setMigrateRequest(VsMigrateParams migrateRequest) {
    this.migrateRequest = migrateRequest;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property migrate_scalein_pending of obj type vipruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return migrateScaleinPending
   */
  @VsoMethod
  public Boolean getMigrateScaleinPending() {
    return migrateScaleinPending;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property migrate_scalein_pending of obj type vipruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param migrateScaleinPending set the migrateScaleinPending.
   */
  @VsoMethod
  public void setMigrateScaleinPending(Boolean  migrateScaleinPending) {
    this.migrateScaleinPending = migrateScaleinPending;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property migrate_scaleout_pending of obj type vipruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return migrateScaleoutPending
   */
  @VsoMethod
  public Boolean getMigrateScaleoutPending() {
    return migrateScaleoutPending;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property migrate_scaleout_pending of obj type vipruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param migrateScaleoutPending set the migrateScaleoutPending.
   */
  @VsoMethod
  public void setMigrateScaleoutPending(Boolean  migrateScaleoutPending) {
    this.migrateScaleoutPending = migrateScaleoutPending;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_additional_se of obj type vipruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return numAdditionalSe
   */
  @VsoMethod
  public Integer getNumAdditionalSe() {
    return numAdditionalSe;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_additional_se of obj type vipruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param numAdditionalSe set the numAdditionalSe.
   */
  @VsoMethod
  public void setNumAdditionalSe(Integer  numAdditionalSe) {
    this.numAdditionalSe = numAdditionalSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return prevMetricsMgrPort
   */
  @VsoMethod
  public String getPrevMetricsMgrPort() {
    return prevMetricsMgrPort;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param prevMetricsMgrPort set the prevMetricsMgrPort.
   */
  @VsoMethod
  public void setPrevMetricsMgrPort(String  prevMetricsMgrPort) {
    this.prevMetricsMgrPort = prevMetricsMgrPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property progress_percent of obj type vipruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return progressPercent
   */
  @VsoMethod
  public Integer getProgressPercent() {
    return progressPercent;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property progress_percent of obj type vipruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param progressPercent set the progressPercent.
   */
  @VsoMethod
  public void setProgressPercent(Integer  progressPercent) {
    this.progressPercent = progressPercent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property requested_resource of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requestedResource
   */
  @VsoMethod
  public VirtualServiceResource getRequestedResource() {
    return requestedResource;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property requested_resource of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param requestedResource set the requestedResource.
   */
  @VsoMethod
  public void setRequestedResource(VirtualServiceResource requestedResource) {
    this.requestedResource = requestedResource;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property scale_status of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scaleStatus
   */
  @VsoMethod
  public ScaleStatus getScaleStatus() {
    return scaleStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property scale_status of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param scaleStatus set the scaleStatus.
   */
  @VsoMethod
  public void setScaleStatus(ScaleStatus scaleStatus) {
    this.scaleStatus = scaleStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property scalein_in_progress of obj type vipruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return scaleinInProgress
   */
  @VsoMethod
  public Boolean getScaleinInProgress() {
    return scaleinInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property scalein_in_progress of obj type vipruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param scaleinInProgress set the scaleinInProgress.
   */
  @VsoMethod
  public void setScaleinInProgress(Boolean  scaleinInProgress) {
    this.scaleinInProgress = scaleinInProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property scalein_request of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scaleinRequest
   */
  @VsoMethod
  public VsScaleinParams getScaleinRequest() {
    return scaleinRequest;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property scalein_request of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param scaleinRequest set the scaleinRequest.
   */
  @VsoMethod
  public void setScaleinRequest(VsScaleinParams scaleinRequest) {
    this.scaleinRequest = scaleinRequest;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property scaleout_in_progress of obj type vipruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return scaleoutInProgress
   */
  @VsoMethod
  public Boolean getScaleoutInProgress() {
    return scaleoutInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property scaleout_in_progress of obj type vipruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param scaleoutInProgress set the scaleoutInProgress.
   */
  @VsoMethod
  public void setScaleoutInProgress(Boolean  scaleoutInProgress) {
    this.scaleoutInProgress = scaleoutInProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_list of obj type vipruntime field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seList
   */
  @VsoMethod
  public List<SeList> getSeList() {
    return seList;
  }

  /**
   * This is the setter method. this will set the seList
   * Placeholder for description of property se_list of obj type vipruntime field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seList
   */
  @VsoMethod
  public void setSeList(List<SeList>  seList) {
    this.seList = seList;
  }

  /**
   * This is the setter method this will set the seList
   * Placeholder for description of property se_list of obj type vipruntime field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seList
   */
  @VsoMethod
  public VipRuntime addSeListItem(SeList seListItem) {
    if (this.seList == null) {
      this.seList = new ArrayList<SeList>();
    }
    this.seList.add(seListItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 18.2.5.
   * @return serversConfigured
   */
  @VsoMethod
  public Boolean getServersConfigured() {
    return serversConfigured;
  }

  /**
   * This is the setter method to the attribute.
   * Field deprecated in 18.2.5.
   * @param serversConfigured set the serversConfigured.
   */
  @VsoMethod
  public void setServersConfigured(Boolean  serversConfigured) {
    this.serversConfigured = serversConfigured;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property supp_runtime_status of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return suppRuntimeStatus
   */
  @VsoMethod
  public OperationalStatus getSuppRuntimeStatus() {
    return suppRuntimeStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property supp_runtime_status of obj type vipruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param suppRuntimeStatus set the suppRuntimeStatus.
   */
  @VsoMethod
  public void setSuppRuntimeStatus(OperationalStatus suppRuntimeStatus) {
    this.suppRuntimeStatus = suppRuntimeStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property user_scaleout_pending of obj type vipruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return userScaleoutPending
   */
  @VsoMethod
  public Boolean getUserScaleoutPending() {
    return userScaleoutPending;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property user_scaleout_pending of obj type vipruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param userScaleoutPending set the userScaleoutPending.
   */
  @VsoMethod
  public void setUserScaleoutPending(Boolean  userScaleoutPending) {
    this.userScaleoutPending = userScaleoutPending;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vip_id of obj type vipruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipId
   */
  @VsoMethod
  public String getVipId() {
    return vipId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vip_id of obj type vipruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipId set the vipId.
   */
  @VsoMethod
  public void setVipId(String  vipId) {
    this.vipId = vipId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vip finished resyncing with resource manager.
   * Field introduced in 18.1.4, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return warmstartResyncDone
   */
  @VsoMethod
  public Boolean getWarmstartResyncDone() {
    return warmstartResyncDone;
  }

  /**
   * This is the setter method to the attribute.
   * Vip finished resyncing with resource manager.
   * Field introduced in 18.1.4, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param warmstartResyncDone set the warmstartResyncDone.
   */
  @VsoMethod
  public void setWarmstartResyncDone(Boolean  warmstartResyncDone) {
    this.warmstartResyncDone = warmstartResyncDone;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rpc sent to resource manager for warmstart resync.
   * Field introduced in 18.1.4, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return warmstartResyncSent
   */
  @VsoMethod
  public Boolean getWarmstartResyncSent() {
    return warmstartResyncSent;
  }

  /**
   * This is the setter method to the attribute.
   * Rpc sent to resource manager for warmstart resync.
   * Field introduced in 18.1.4, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param warmstartResyncSent set the warmstartResyncSent.
   */
  @VsoMethod
  public void setWarmstartResyncSent(Boolean  warmstartResyncSent) {
    this.warmstartResyncSent = warmstartResyncSent;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VipRuntime objVipRuntime = (VipRuntime) o;
  return   Objects.equals(this.vipId, objVipRuntime.vipId)&&
  Objects.equals(this.fsmStateName, objVipRuntime.fsmStateName)&&
  Objects.equals(this.fsmStateId, objVipRuntime.fsmStateId)&&
  Objects.equals(this.serversConfigured, objVipRuntime.serversConfigured)&&
  Objects.equals(this.lastChangedTime, objVipRuntime.lastChangedTime)&&
  Objects.equals(this.markedForDelete, objVipRuntime.markedForDelete)&&
  Objects.equals(this.progressPercent, objVipRuntime.progressPercent)&&
  Objects.equals(this.scaleStatus, objVipRuntime.scaleStatus)&&
  Objects.equals(this.metricsMgrPort, objVipRuntime.metricsMgrPort)&&
  Objects.equals(this.prevMetricsMgrPort, objVipRuntime.prevMetricsMgrPort)&&
  Objects.equals(this.scaleoutInProgress, objVipRuntime.scaleoutInProgress)&&
  Objects.equals(this.userScaleoutPending, objVipRuntime.userScaleoutPending)&&
  Objects.equals(this.scaleinInProgress, objVipRuntime.scaleinInProgress)&&
  Objects.equals(this.scaleinRequest, objVipRuntime.scaleinRequest)&&
  Objects.equals(this.migrateInProgress, objVipRuntime.migrateInProgress)&&
  Objects.equals(this.migrateRequest, objVipRuntime.migrateRequest)&&
  Objects.equals(this.migrateScaleoutPending, objVipRuntime.migrateScaleoutPending)&&
  Objects.equals(this.migrateScaleinPending, objVipRuntime.migrateScaleinPending)&&
  Objects.equals(this.firstTimePlacement, objVipRuntime.firstTimePlacement)&&
  Objects.equals(this.seList, objVipRuntime.seList)&&
  Objects.equals(this.requestedResource, objVipRuntime.requestedResource)&&
  Objects.equals(this.suppRuntimeStatus, objVipRuntime.suppRuntimeStatus)&&
  Objects.equals(this.firstSeAssignedTime, objVipRuntime.firstSeAssignedTime)&&
  Objects.equals(this.numAdditionalSe, objVipRuntime.numAdditionalSe)&&
  Objects.equals(this.evStatus, objVipRuntime.evStatus)&&
  Objects.equals(this.ev, objVipRuntime.ev)&&
  Objects.equals(this.lastScaleStatus, objVipRuntime.lastScaleStatus)&&
  Objects.equals(this.warmstartResyncSent, objVipRuntime.warmstartResyncSent)&&
  Objects.equals(this.warmstartResyncDone, objVipRuntime.warmstartResyncDone);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VipRuntime {\n");
      sb.append("    ev: ").append(toIndentedString(ev)).append("\n");
        sb.append("    evStatus: ").append(toIndentedString(evStatus)).append("\n");
        sb.append("    firstSeAssignedTime: ").append(toIndentedString(firstSeAssignedTime)).append("\n");
        sb.append("    firstTimePlacement: ").append(toIndentedString(firstTimePlacement)).append("\n");
        sb.append("    fsmStateId: ").append(toIndentedString(fsmStateId)).append("\n");
        sb.append("    fsmStateName: ").append(toIndentedString(fsmStateName)).append("\n");
        sb.append("    lastChangedTime: ").append(toIndentedString(lastChangedTime)).append("\n");
        sb.append("    lastScaleStatus: ").append(toIndentedString(lastScaleStatus)).append("\n");
        sb.append("    markedForDelete: ").append(toIndentedString(markedForDelete)).append("\n");
        sb.append("    metricsMgrPort: ").append(toIndentedString(metricsMgrPort)).append("\n");
        sb.append("    migrateInProgress: ").append(toIndentedString(migrateInProgress)).append("\n");
        sb.append("    migrateRequest: ").append(toIndentedString(migrateRequest)).append("\n");
        sb.append("    migrateScaleinPending: ").append(toIndentedString(migrateScaleinPending)).append("\n");
        sb.append("    migrateScaleoutPending: ").append(toIndentedString(migrateScaleoutPending)).append("\n");
        sb.append("    numAdditionalSe: ").append(toIndentedString(numAdditionalSe)).append("\n");
        sb.append("    prevMetricsMgrPort: ").append(toIndentedString(prevMetricsMgrPort)).append("\n");
        sb.append("    progressPercent: ").append(toIndentedString(progressPercent)).append("\n");
        sb.append("    requestedResource: ").append(toIndentedString(requestedResource)).append("\n");
        sb.append("    scaleStatus: ").append(toIndentedString(scaleStatus)).append("\n");
        sb.append("    scaleinInProgress: ").append(toIndentedString(scaleinInProgress)).append("\n");
        sb.append("    scaleinRequest: ").append(toIndentedString(scaleinRequest)).append("\n");
        sb.append("    scaleoutInProgress: ").append(toIndentedString(scaleoutInProgress)).append("\n");
        sb.append("    seList: ").append(toIndentedString(seList)).append("\n");
        sb.append("    serversConfigured: ").append(toIndentedString(serversConfigured)).append("\n");
        sb.append("    suppRuntimeStatus: ").append(toIndentedString(suppRuntimeStatus)).append("\n");
        sb.append("    userScaleoutPending: ").append(toIndentedString(userScaleoutPending)).append("\n");
        sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
        sb.append("    warmstartResyncDone: ").append(toIndentedString(warmstartResyncDone)).append("\n");
        sb.append("    warmstartResyncSent: ").append(toIndentedString(warmstartResyncSent)).append("\n");
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

