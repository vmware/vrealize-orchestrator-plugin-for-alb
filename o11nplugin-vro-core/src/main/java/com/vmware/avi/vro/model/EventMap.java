package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.UpgradeEvent;
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
 * EventMap
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "EventMap")
@VsoFinder(name = Constants.FINDER_VRO_EVENTMAP, idAccessor = "getObjectID()")
@Service
public class EventMap extends AviRestResource  {
  @JsonProperty("nodes_events")
  @Valid
  private List<UpgradeEvent> nodesEvents = null;

  @JsonProperty("task")
  private String task = null;

  
  public EventMap addNodesEventsItem(UpgradeEvent nodesEventsItem) {
    if (this.nodesEvents == null) {
      this.nodesEvents = new ArrayList<UpgradeEvent>();
    }
    this.nodesEvents.add(nodesEventsItem);
    return this;
  }
  
  /**
   * List of all events node wise. Field introduced in 18.2.6.
   * @return nodesEvents
  **/
  @ApiModelProperty(value = "List of all events node wise. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public List<UpgradeEvent> getNodesEvents() {
    return nodesEvents;
  }
    
  @VsoMethod
  public void setNodesEvents(List<UpgradeEvent> nodesEvents) {
    this.nodesEvents = nodesEvents;
  }

  
  /**
   * Enum representing the task. Enum options - PREPARE_FOR_SHUTDOWN, COPY_AND_VERIFY_IMAGE, INSTALL_IMAGE, POST_INSTALL_HOOKS, PREPARE_CONTROLLER_FOR_SHUTDOWN, STOP_CONTROLLER, EXTRACT_PATCH_IMAGE, EXECUTE_PRE_INSTALL_COMMANDS, INSTALL_PATCH_IMAGE, PREPARE_FOR_REBOOT_CONTROLLER_NODES, REBOOT_CONTROLLER_NODES, WAIT_FOR_ALL_CONTROLLER_NODES_ONLINE, PRE_UPGRADE_HOOKS, MIGRATE_CONFIG, START_PRIMARY_CONTROLLER, START_ALL_CONTROLLERS, POST_UPGRADE_HOOKS, EXECUTE_POST_INSTALL_COMMANDS, SET_CONTROLLER_UPGRADE_COMPLETED, STATE_NOT_USED_IN_V2, COMMIT_UPGRADE, UNKNOWN_TASK, PATCH_CONTROLLER_HEALTH_CHECK. Field introduced in 18.2.6.
   * @return task
  **/
  @ApiModelProperty(value = "Enum representing the task. Enum options - PREPARE_FOR_SHUTDOWN, COPY_AND_VERIFY_IMAGE, INSTALL_IMAGE, POST_INSTALL_HOOKS, PREPARE_CONTROLLER_FOR_SHUTDOWN, STOP_CONTROLLER, EXTRACT_PATCH_IMAGE, EXECUTE_PRE_INSTALL_COMMANDS, INSTALL_PATCH_IMAGE, PREPARE_FOR_REBOOT_CONTROLLER_NODES, REBOOT_CONTROLLER_NODES, WAIT_FOR_ALL_CONTROLLER_NODES_ONLINE, PRE_UPGRADE_HOOKS, MIGRATE_CONFIG, START_PRIMARY_CONTROLLER, START_ALL_CONTROLLERS, POST_UPGRADE_HOOKS, EXECUTE_POST_INSTALL_COMMANDS, SET_CONTROLLER_UPGRADE_COMPLETED, STATE_NOT_USED_IN_V2, COMMIT_UPGRADE, UNKNOWN_TASK, PATCH_CONTROLLER_HEALTH_CHECK. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getTask() {
    return task;
  }
    
  @VsoMethod
  public void setTask(String task) {
    this.task = task;
  }

  
  public String getObjectID() {
		return "EventMap";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventMap eventMap = (EventMap) o;
    return Objects.equals(this.nodesEvents, eventMap.nodesEvents) &&
        Objects.equals(this.task, eventMap.task);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodesEvents, task);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventMap {\n");
    
    sb.append("    nodesEvents: ").append(toIndentedString(nodesEvents)).append("\n");
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

