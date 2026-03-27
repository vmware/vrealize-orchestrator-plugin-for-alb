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
 * The TaskEventMap is a POJO class extends AviRestResource that used for creating
 * TaskEventMap.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TaskEventMap")
@VsoFinder(name = Constants.FINDER_VRO_TASKEVENTMAP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TaskEventMap extends AviRestResource {
    @JsonProperty("nodes_events")
    @JsonInclude(Include.NON_NULL)
    private List<TaskEvent> nodesEvents;

    @JsonProperty("sub_events")
    @JsonInclude(Include.NON_NULL)
    private List<TaskEvent> subEvents;

    @JsonProperty("task_name")
    @JsonInclude(Include.NON_NULL)
    private String taskName;



  /**
   * This is the getter method this will return the attribute value.
   * List of all events node wise.
   * Field introduced in 21.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodesEvents
   */
  @VsoMethod
  public List<TaskEvent> getNodesEvents() {
    return nodesEvents;
  }

  /**
   * This is the setter method. this will set the nodesEvents
   * List of all events node wise.
   * Field introduced in 21.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodesEvents
   */
  @VsoMethod
  public void setNodesEvents(List<TaskEvent>  nodesEvents) {
    this.nodesEvents = nodesEvents;
  }

  /**
   * This is the setter method this will set the nodesEvents
   * List of all events node wise.
   * Field introduced in 21.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodesEvents
   */
  @VsoMethod
  public TaskEventMap addNodesEventsItem(TaskEvent nodesEventsItem) {
    if (this.nodesEvents == null) {
      this.nodesEvents = new ArrayList<TaskEvent>();
    }
    this.nodesEvents.add(nodesEventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * List of all events node wise.
   * Field introduced in 21.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subEvents
   */
  @VsoMethod
  public List<TaskEvent> getSubEvents() {
    return subEvents;
  }

  /**
   * This is the setter method. this will set the subEvents
   * List of all events node wise.
   * Field introduced in 21.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subEvents
   */
  @VsoMethod
  public void setSubEvents(List<TaskEvent>  subEvents) {
    this.subEvents = subEvents;
  }

  /**
   * This is the setter method this will set the subEvents
   * List of all events node wise.
   * Field introduced in 21.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subEvents
   */
  @VsoMethod
  public TaskEventMap addSubEventsItem(TaskEvent subEventsItem) {
    if (this.subEvents == null) {
      this.subEvents = new ArrayList<TaskEvent>();
    }
    this.subEvents.add(subEventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name representing the task.
   * Field introduced in 21.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
   * Field introduced in 21.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
  TaskEventMap objTaskEventMap = (TaskEventMap) o;
  return   Objects.equals(this.taskName, objTaskEventMap.taskName)&&
  Objects.equals(this.nodesEvents, objTaskEventMap.nodesEvents)&&
  Objects.equals(this.subEvents, objTaskEventMap.subEvents);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TaskEventMap {\n");
      sb.append("    nodesEvents: ").append(toIndentedString(nodesEvents)).append("\n");
        sb.append("    subEvents: ").append(toIndentedString(subEvents)).append("\n");
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

