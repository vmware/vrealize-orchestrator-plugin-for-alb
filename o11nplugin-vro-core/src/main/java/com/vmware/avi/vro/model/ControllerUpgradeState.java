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
 * The ControllerUpgradeState is a POJO class extends AviRestResource that used for creating
 * ControllerUpgradeState.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerUpgradeState")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERUPGRADESTATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerUpgradeState extends AviRestResource {
    @JsonProperty("controller_progress")
    @JsonInclude(Include.NON_NULL)
    private Integer controllerProgress = null;

    @JsonProperty("in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean inProgress = null;

    @JsonProperty("notes")
    @JsonInclude(Include.NON_NULL)
    private List<String> notes = null;

    @JsonProperty("rollback")
    @JsonInclude(Include.NON_NULL)
    private Boolean rollback = null;

    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private String state = null;

    @JsonProperty("tasks_completed")
    @JsonInclude(Include.NON_NULL)
    private List<UpgradeTask> tasksCompleted = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property controller_progress of obj type controllerupgradestate field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerProgress
   */
  @VsoMethod
  public Integer getControllerProgress() {
    return controllerProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property controller_progress of obj type controllerupgradestate field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerProgress set the controllerProgress.
   */
  @VsoMethod
  public void setControllerProgress(Integer  controllerProgress) {
    this.controllerProgress = controllerProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property in_progress of obj type controllerupgradestate field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return inProgress
   */
  @VsoMethod
  public Boolean getInProgress() {
    return inProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property in_progress of obj type controllerupgradestate field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param inProgress set the inProgress.
   */
  @VsoMethod
  public void setInProgress(Boolean  inProgress) {
    this.inProgress = inProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property notes of obj type controllerupgradestate field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return notes
   */
  @VsoMethod
  public List<String> getNotes() {
    return notes;
  }

  /**
   * This is the setter method. this will set the notes
   * Placeholder for description of property notes of obj type controllerupgradestate field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return notes
   */
  @VsoMethod
  public void setNotes(List<String>  notes) {
    this.notes = notes;
  }

  /**
   * This is the setter method this will set the notes
   * Placeholder for description of property notes of obj type controllerupgradestate field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return notes
   */
  @VsoMethod
  public ControllerUpgradeState addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property rollback of obj type controllerupgradestate field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rollback
   */
  @VsoMethod
  public Boolean getRollback() {
    return rollback;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property rollback of obj type controllerupgradestate field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rollback set the rollback.
   */
  @VsoMethod
  public void setRollback(Boolean  rollback) {
    this.rollback = rollback;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - UPGRADE_STARTED, UPGRADE_WAITING, UPGRADE_IN_PROGRESS, UPGRADE_CONTROLLER_COMPLETED, UPGRADE_COMPLETED, UPGRADE_ABORT_IN_PROGRESS,
   * UPGRADE_ABORTED, UPGRADE_DUMMY_1, UPGRADE_DUMMY_2, UPGRADE_DUMMY_3, UPGRADE_DUMMY_4, UPGRADE_DUMMY_5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public String getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - UPGRADE_STARTED, UPGRADE_WAITING, UPGRADE_IN_PROGRESS, UPGRADE_CONTROLLER_COMPLETED, UPGRADE_COMPLETED, UPGRADE_ABORT_IN_PROGRESS,
   * UPGRADE_ABORTED, UPGRADE_DUMMY_1, UPGRADE_DUMMY_2, UPGRADE_DUMMY_3, UPGRADE_DUMMY_4, UPGRADE_DUMMY_5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(String  state) {
    this.state = state;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property tasks_completed of obj type controllerupgradestate field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tasksCompleted
   */
  @VsoMethod
  public List<UpgradeTask> getTasksCompleted() {
    return tasksCompleted;
  }

  /**
   * This is the setter method. this will set the tasksCompleted
   * Placeholder for description of property tasks_completed of obj type controllerupgradestate field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tasksCompleted
   */
  @VsoMethod
  public void setTasksCompleted(List<UpgradeTask>  tasksCompleted) {
    this.tasksCompleted = tasksCompleted;
  }

  /**
   * This is the setter method this will set the tasksCompleted
   * Placeholder for description of property tasks_completed of obj type controllerupgradestate field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tasksCompleted
   */
  @VsoMethod
  public ControllerUpgradeState addTasksCompletedItem(UpgradeTask tasksCompletedItem) {
    if (this.tasksCompleted == null) {
      this.tasksCompleted = new ArrayList<UpgradeTask>();
    }
    this.tasksCompleted.add(tasksCompletedItem);
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
  ControllerUpgradeState objControllerUpgradeState = (ControllerUpgradeState) o;
  return   Objects.equals(this.inProgress, objControllerUpgradeState.inProgress)&&
  Objects.equals(this.state, objControllerUpgradeState.state)&&
  Objects.equals(this.tasksCompleted, objControllerUpgradeState.tasksCompleted)&&
  Objects.equals(this.controllerProgress, objControllerUpgradeState.controllerProgress)&&
  Objects.equals(this.rollback, objControllerUpgradeState.rollback)&&
  Objects.equals(this.notes, objControllerUpgradeState.notes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerUpgradeState {\n");
      sb.append("    controllerProgress: ").append(toIndentedString(controllerProgress)).append("\n");
        sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    rollback: ").append(toIndentedString(rollback)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tasksCompleted: ").append(toIndentedString(tasksCompleted)).append("\n");
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

