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
 * The FileObjectEventMap is a POJO class extends AviRestResource that used for creating
 * FileObjectEventMap.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "FileObjectEventMap")
@VsoFinder(name = Constants.FINDER_VRO_FILEOBJECTEVENTMAP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class FileObjectEventMap extends AviRestResource {
    @JsonProperty("task_event")
    @JsonInclude(Include.NON_NULL)
    private List<FileObjectEvent> taskEvent;

    @JsonProperty("task_name")
    @JsonInclude(Include.NON_NULL)
    private String taskName;



  /**
   * This is the getter method this will return the attribute value.
   * Actual event informations.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return taskEvent
   */
  @VsoMethod
  public List<FileObjectEvent> getTaskEvent() {
    return taskEvent;
  }

  /**
   * This is the setter method. this will set the taskEvent
   * Actual event informations.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return taskEvent
   */
  @VsoMethod
  public void setTaskEvent(List<FileObjectEvent>  taskEvent) {
    this.taskEvent = taskEvent;
  }

  /**
   * This is the setter method this will set the taskEvent
   * Actual event informations.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return taskEvent
   */
  @VsoMethod
  public FileObjectEventMap addTaskEventItem(FileObjectEvent taskEventItem) {
    if (this.taskEvent == null) {
      this.taskEvent = new ArrayList<FileObjectEvent>();
    }
    this.taskEvent.add(taskEventItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name of the event task.
   * Field introduced in 31.1.1.
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
   * Name of the event task.
   * Field introduced in 31.1.1.
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
  FileObjectEventMap objFileObjectEventMap = (FileObjectEventMap) o;
  return   Objects.equals(this.taskName, objFileObjectEventMap.taskName)&&
  Objects.equals(this.taskEvent, objFileObjectEventMap.taskEvent);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class FileObjectEventMap {\n");
      sb.append("    taskEvent: ").append(toIndentedString(taskEvent)).append("\n");
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

