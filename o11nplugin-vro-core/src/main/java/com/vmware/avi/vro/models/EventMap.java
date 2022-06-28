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
 * The EventMap is a POJO class extends AviRestResource that used for creating
 * EventMap.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "EventMap")
@VsoFinder(name = Constants.FINDER_VRO_EVENTMAP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class EventMap extends AviRestResource {
    @JsonProperty("nodes_events")
    @JsonInclude(Include.NON_NULL)
    private List<UpgradeEvent> nodesEvents = null;

    @JsonProperty("sub_events")
    @JsonInclude(Include.NON_NULL)
    private List<UpgradeEvent> subEvents = null;

    @JsonProperty("task")
    @JsonInclude(Include.NON_NULL)
    private String task = null;

    @JsonProperty("task_name")
    @JsonInclude(Include.NON_NULL)
    private String taskName = null;



  /**
   * This is the getter method this will return the attribute value.
   * List of all events node wise.(not in use).
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodesEvents
   */
  @VsoMethod
  public List<UpgradeEvent> getNodesEvents() {
    return nodesEvents;
  }

  /**
   * This is the setter method. this will set the nodesEvents
   * List of all events node wise.(not in use).
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodesEvents
   */
  @VsoMethod
  public void setNodesEvents(List<UpgradeEvent>  nodesEvents) {
    this.nodesEvents = nodesEvents;
  }

  /**
   * This is the setter method this will set the nodesEvents
   * List of all events node wise.(not in use).
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodesEvents
   */
  @VsoMethod
  public EventMap addNodesEventsItem(UpgradeEvent nodesEventsItem) {
    if (this.nodesEvents == null) {
      this.nodesEvents = new ArrayList<UpgradeEvent>();
    }
    this.nodesEvents.add(nodesEventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * List of all events node wise.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subEvents
   */
  @VsoMethod
  public List<UpgradeEvent> getSubEvents() {
    return subEvents;
  }

  /**
   * This is the setter method. this will set the subEvents
   * List of all events node wise.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subEvents
   */
  @VsoMethod
  public void setSubEvents(List<UpgradeEvent>  subEvents) {
    this.subEvents = subEvents;
  }

  /**
   * This is the setter method this will set the subEvents
   * List of all events node wise.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subEvents
   */
  @VsoMethod
  public EventMap addSubEventsItem(UpgradeEvent subEventsItem) {
    if (this.subEvents == null) {
      this.subEvents = new ArrayList<UpgradeEvent>();
    }
    this.subEvents.add(subEventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Enum representing the task.(not in use).
   * Enum options - PREPARE_FOR_SHUTDOWN, COPY_AND_VERIFY_IMAGE, INSTALL_IMAGE, POST_INSTALL_HOOKS, PREPARE_CONTROLLER_FOR_SHUTDOWN, STOP_CONTROLLER,
   * EXTRACT_PATCH_IMAGE, EXECUTE_PRE_INSTALL_COMMANDS, INSTALL_PATCH_IMAGE, PREPARE_FOR_REBOOT_CONTROLLER_NODES, REBOOT_CONTROLLER_NODES,
   * WAIT_FOR_ALL_CONTROLLER_NODES_ONLINE, PRE_UPGRADE_HOOKS, MIGRATE_CONFIG, START_PRIMARY_CONTROLLER, START_ALL_CONTROLLERS, POST_UPGRADE_HOOKS,
   * EXECUTE_POST_INSTALL_COMMANDS, SET_CONTROLLER_UPGRADE_COMPLETED, STATE_NOT_USED_IN_V2...
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return task
   */
  @VsoMethod
  public String getTask() {
    return task;
  }

  /**
   * This is the setter method to the attribute.
   * Enum representing the task.(not in use).
   * Enum options - PREPARE_FOR_SHUTDOWN, COPY_AND_VERIFY_IMAGE, INSTALL_IMAGE, POST_INSTALL_HOOKS, PREPARE_CONTROLLER_FOR_SHUTDOWN, STOP_CONTROLLER,
   * EXTRACT_PATCH_IMAGE, EXECUTE_PRE_INSTALL_COMMANDS, INSTALL_PATCH_IMAGE, PREPARE_FOR_REBOOT_CONTROLLER_NODES, REBOOT_CONTROLLER_NODES,
   * WAIT_FOR_ALL_CONTROLLER_NODES_ONLINE, PRE_UPGRADE_HOOKS, MIGRATE_CONFIG, START_PRIMARY_CONTROLLER, START_ALL_CONTROLLERS, POST_UPGRADE_HOOKS,
   * EXECUTE_POST_INSTALL_COMMANDS, SET_CONTROLLER_UPGRADE_COMPLETED, STATE_NOT_USED_IN_V2...
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param task set the task.
   */
  @VsoMethod
  public void setTask(String  task) {
    this.task = task;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name representing the task.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return taskName
   */
  @VsoMethod
  public String getTaskName() {
    return taskName;
  }

  /**
   * This is the setter method to the attribute.
   * Name representing the task.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param taskName set the taskName.
   */
  @VsoMethod
  public void setTaskName(String  taskName) {
    this.taskName = taskName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  EventMap objEventMap = (EventMap) o;
  return   Objects.equals(this.task, objEventMap.task)&&
  Objects.equals(this.nodesEvents, objEventMap.nodesEvents)&&
  Objects.equals(this.taskName, objEventMap.taskName)&&
  Objects.equals(this.subEvents, objEventMap.subEvents);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class EventMap {\n");
      sb.append("    nodesEvents: ").append(toIndentedString(nodesEvents)).append("\n");
        sb.append("    subEvents: ").append(toIndentedString(subEvents)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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

