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
 * The UpgradeTask is a POJO class extends AviRestResource that used for creating
 * UpgradeTask.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "UpgradeTask")
@VsoFinder(name = Constants.FINDER_VRO_UPGRADETASK)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class UpgradeTask extends AviRestResource {
  @JsonProperty("duration")
  @JsonInclude(Include.NON_NULL)
  private String duration = null;

  @JsonProperty("end_time")
  @JsonInclude(Include.NON_NULL)
  private String endTime = null;

  @JsonProperty("start_time")
  @JsonInclude(Include.NON_NULL)
  private String startTime = null;

  @JsonProperty("task")
  @JsonInclude(Include.NON_NULL)
  private String task = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property duration of obj type upgradetask field type str  type string.
   * @return duration
   */
  @VsoMethod
  public String getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property duration of obj type upgradetask field type str  type string.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(String  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property end_time of obj type upgradetask field type str  type string.
   * @return endTime
   */
  @VsoMethod
  public String getEndTime() {
    return endTime;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property end_time of obj type upgradetask field type str  type string.
   * @param endTime set the endTime.
   */
  @VsoMethod
  public void setEndTime(String  endTime) {
    this.endTime = endTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property start_time of obj type upgradetask field type str  type string.
   * @return startTime
   */
  @VsoMethod
  public String getStartTime() {
    return startTime;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property start_time of obj type upgradetask field type str  type string.
   * @param startTime set the startTime.
   */
  @VsoMethod
  public void setStartTime(String  startTime) {
    this.startTime = startTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - PREPARE_FOR_SHUTDOWN, COPY_AND_VERIFY_IMAGE, INSTALL_IMAGE, POST_INSTALL_HOOKS, PREPARE_CONTROLLER_FOR_SHUTDOWN, STOP_CONTROLLER,
   * EXTRACT_PATCH_IMAGE, EXECUTE_PRE_INSTALL_COMMANDS, INSTALL_PATCH_IMAGE, PREPARE_FOR_REBOOT_CONTROLLER_NODES, REBOOT_CONTROLLER_NODES,
   * WAIT_FOR_ALL_CONTROLLER_NODES_ONLINE, PRE_UPGRADE_HOOKS, MIGRATE_CONFIG, START_PRIMARY_CONTROLLER, START_ALL_CONTROLLERS, POST_UPGRADE_HOOKS,
   * EXECUTE_POST_INSTALL_COMMANDS, SET_CONTROLLER_UPGRADE_COMPLETED, STATE_NOT_USED_IN_V2...
   * @return task
   */
  @VsoMethod
  public String getTask() {
    return task;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - PREPARE_FOR_SHUTDOWN, COPY_AND_VERIFY_IMAGE, INSTALL_IMAGE, POST_INSTALL_HOOKS, PREPARE_CONTROLLER_FOR_SHUTDOWN, STOP_CONTROLLER,
   * EXTRACT_PATCH_IMAGE, EXECUTE_PRE_INSTALL_COMMANDS, INSTALL_PATCH_IMAGE, PREPARE_FOR_REBOOT_CONTROLLER_NODES, REBOOT_CONTROLLER_NODES,
   * WAIT_FOR_ALL_CONTROLLER_NODES_ONLINE, PRE_UPGRADE_HOOKS, MIGRATE_CONFIG, START_PRIMARY_CONTROLLER, START_ALL_CONTROLLERS, POST_UPGRADE_HOOKS,
   * EXECUTE_POST_INSTALL_COMMANDS, SET_CONTROLLER_UPGRADE_COMPLETED, STATE_NOT_USED_IN_V2...
   * @param task set the task.
   */
  @VsoMethod
  public void setTask(String  task) {
    this.task = task;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  UpgradeTask objUpgradeTask = (UpgradeTask) o;
  return   Objects.equals(this.duration, objUpgradeTask.duration)&&
  Objects.equals(this.startTime, objUpgradeTask.startTime)&&
  Objects.equals(this.task, objUpgradeTask.task)&&
  Objects.equals(this.endTime, objUpgradeTask.endTime);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class UpgradeTask {\n");
      sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
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
