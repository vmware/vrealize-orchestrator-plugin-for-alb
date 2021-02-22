package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SeGroupStatus;
import com.vmware.avi.vro.model.UpgradeOpsState;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The OpsHistory is a POJO class extends AviRestResource that used for creating
 * OpsHistory.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OpsHistory")
@VsoFinder(name = Constants.FINDER_VRO_OPSHISTORY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OpsHistory extends AviRestResource {
    @JsonProperty("duration")
    @JsonInclude(Include.NON_NULL)
    private Integer duration = null;

    @JsonProperty("end_time")
    @JsonInclude(Include.NON_NULL)
    private String endTime = null;

    @JsonProperty("ops")
    @JsonInclude(Include.NON_NULL)
    private String ops = null;

    @JsonProperty("patch_version")
    @JsonInclude(Include.NON_NULL)
    private String patchVersion = null;

    @JsonProperty("se_upgrade_events")
    @JsonInclude(Include.NON_NULL)
    private List<SeUpgradeEvents> seUpgradeEvents = null;

    @JsonProperty("seg_status")
    @JsonInclude(Include.NON_NULL)
    private SeGroupStatus segStatus = null;

    @JsonProperty("start_time")
    @JsonInclude(Include.NON_NULL)
    private String startTime = null;

    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private UpgradeOpsState state = null;

    @JsonProperty("upgrade_events")
    @JsonInclude(Include.NON_NULL)
    private List<EventMap> upgradeEvents = null;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private String version = null;



  /**
   * This is the getter method this will return the attribute value.
   * Duration of upgrade operation in seconds.
   * Field introduced in 20.1.4.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return duration
   */
  @VsoMethod
  public Integer getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Duration of upgrade operation in seconds.
   * Field introduced in 20.1.4.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(Integer  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * End time of upgrade operation.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return endTime
   */
  @VsoMethod
  public String getEndTime() {
    return endTime;
  }

  /**
   * This is the setter method to the attribute.
   * End time of upgrade operation.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param endTime set the endTime.
   */
  @VsoMethod
  public void setEndTime(String  endTime) {
    this.endTime = endTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Upgrade operation performed.
   * Enum options - UPGRADE, PATCH, ROLLBACK, ROLLBACKPATCH, SEGROUP_RESUME.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ops
   */
  @VsoMethod
  public String getOps() {
    return ops;
  }

  /**
   * This is the setter method to the attribute.
   * Upgrade operation performed.
   * Enum options - UPGRADE, PATCH, ROLLBACK, ROLLBACKPATCH, SEGROUP_RESUME.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ops set the ops.
   */
  @VsoMethod
  public void setOps(String  ops) {
    this.ops = ops;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Patch after the upgrade operation.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return patchVersion
   */
  @VsoMethod
  public String getPatchVersion() {
    return patchVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Patch after the upgrade operation.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param patchVersion set the patchVersion.
   */
  @VsoMethod
  public void setPatchVersion(String  patchVersion) {
    this.patchVersion = patchVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Serviceenginegroup/se events for upgrade operation.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seUpgradeEvents
   */
  @VsoMethod
  public List<SeUpgradeEvents> getSeUpgradeEvents() {
    return seUpgradeEvents;
  }

  /**
   * This is the setter method. this will set the seUpgradeEvents
   * Serviceenginegroup/se events for upgrade operation.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seUpgradeEvents
   */
  @VsoMethod
  public void setSeUpgradeEvents(List<SeUpgradeEvents>  seUpgradeEvents) {
    this.seUpgradeEvents = seUpgradeEvents;
  }

  /**
   * This is the setter method this will set the seUpgradeEvents
   * Serviceenginegroup/se events for upgrade operation.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seUpgradeEvents
   */
  @VsoMethod
  public OpsHistory addSeUpgradeEventsItem(SeUpgradeEvents seUpgradeEventsItem) {
    if (this.seUpgradeEvents == null) {
      this.seUpgradeEvents = new ArrayList<SeUpgradeEvents>();
    }
    this.seUpgradeEvents.add(seUpgradeEventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Segroup status for the upgrade operation.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return segStatus
   */
  @VsoMethod
  public SeGroupStatus getSegStatus() {
    return segStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Segroup status for the upgrade operation.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param segStatus set the segStatus.
   */
  @VsoMethod
  public void setSegStatus(SeGroupStatus segStatus) {
    this.segStatus = segStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Start time of upgrade operation.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return startTime
   */
  @VsoMethod
  public String getStartTime() {
    return startTime;
  }

  /**
   * This is the setter method to the attribute.
   * Start time of upgrade operation.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param startTime set the startTime.
   */
  @VsoMethod
  public void setStartTime(String  startTime) {
    this.startTime = startTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Upgrade operation status.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public UpgradeOpsState getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * Upgrade operation status.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(UpgradeOpsState state) {
    this.state = state;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Controller events for upgrade operation.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return upgradeEvents
   */
  @VsoMethod
  public List<EventMap> getUpgradeEvents() {
    return upgradeEvents;
  }

  /**
   * This is the setter method. this will set the upgradeEvents
   * Controller events for upgrade operation.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return upgradeEvents
   */
  @VsoMethod
  public void setUpgradeEvents(List<EventMap>  upgradeEvents) {
    this.upgradeEvents = upgradeEvents;
  }

  /**
   * This is the setter method this will set the upgradeEvents
   * Controller events for upgrade operation.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return upgradeEvents
   */
  @VsoMethod
  public OpsHistory addUpgradeEventsItem(EventMap upgradeEventsItem) {
    if (this.upgradeEvents == null) {
      this.upgradeEvents = new ArrayList<EventMap>();
    }
    this.upgradeEvents.add(upgradeEventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Image after the upgrade operation.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return version
   */
  @VsoMethod
  public String getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Image after the upgrade operation.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(String  version) {
    this.version = version;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OpsHistory objOpsHistory = (OpsHistory) o;
  return   Objects.equals(this.ops, objOpsHistory.ops)&&
  Objects.equals(this.state, objOpsHistory.state)&&
  Objects.equals(this.version, objOpsHistory.version)&&
  Objects.equals(this.patchVersion, objOpsHistory.patchVersion)&&
  Objects.equals(this.segStatus, objOpsHistory.segStatus)&&
  Objects.equals(this.upgradeEvents, objOpsHistory.upgradeEvents)&&
  Objects.equals(this.seUpgradeEvents, objOpsHistory.seUpgradeEvents)&&
  Objects.equals(this.startTime, objOpsHistory.startTime)&&
  Objects.equals(this.endTime, objOpsHistory.endTime)&&
  Objects.equals(this.duration, objOpsHistory.duration);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OpsHistory {\n");
      sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    ops: ").append(toIndentedString(ops)).append("\n");
        sb.append("    patchVersion: ").append(toIndentedString(patchVersion)).append("\n");
        sb.append("    seUpgradeEvents: ").append(toIndentedString(seUpgradeEvents)).append("\n");
        sb.append("    segStatus: ").append(toIndentedString(segStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    upgradeEvents: ").append(toIndentedString(upgradeEvents)).append("\n");
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

