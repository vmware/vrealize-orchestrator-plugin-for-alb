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
 * The StatediffEvent is a POJO class extends AviRestResource that used for creating
 * StatediffEvent.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "StatediffEvent")
@VsoFinder(name = Constants.FINDER_VRO_STATEDIFFEVENT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class StatediffEvent extends AviRestResource {
    @JsonProperty("duration")
    @JsonInclude(Include.NON_NULL)
    private Integer duration = null;

    @JsonProperty("end_time")
    @JsonInclude(Include.NON_NULL)
    private String endTime = null;

    @JsonProperty("message")
    @JsonInclude(Include.NON_NULL)
    private String message = null;

    @JsonProperty("start_time")
    @JsonInclude(Include.NON_NULL)
    private String startTime = null;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status = "FB_INIT";

    @JsonProperty("task_name")
    @JsonInclude(Include.NON_NULL)
    private String taskName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Time taken to complete statediff event in seconds.
   * Field introduced in 21.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return duration
   */
  @VsoMethod
  public Integer getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Time taken to complete statediff event in seconds.
   * Field introduced in 21.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(Integer  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Task end time.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return endTime
   */
  @VsoMethod
  public String getEndTime() {
    return endTime;
  }

  /**
   * This is the setter method to the attribute.
   * Task end time.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param endTime set the endTime.
   */
  @VsoMethod
  public void setEndTime(String  endTime) {
    this.endTime = endTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Statediff event message if any.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return message
   */
  @VsoMethod
  public String getMessage() {
    return message;
  }

  /**
   * This is the setter method to the attribute.
   * Statediff event message if any.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param message set the message.
   */
  @VsoMethod
  public void setMessage(String  message) {
    this.message = message;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Task start time.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return startTime
   */
  @VsoMethod
  public String getStartTime() {
    return startTime;
  }

  /**
   * This is the setter method to the attribute.
   * Task start time.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param startTime set the startTime.
   */
  @VsoMethod
  public void setStartTime(String  startTime) {
    this.startTime = startTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Statediff event status.
   * Enum options - FB_INIT, FB_IN_PROGRESS, FB_COMPLETED, FB_FAILED, FB_COMPLETED_WITH_ERRORS.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "FB_INIT".
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Statediff event status.
   * Enum options - FB_INIT, FB_IN_PROGRESS, FB_COMPLETED, FB_FAILED, FB_COMPLETED_WITH_ERRORS.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "FB_INIT".
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of statediff task.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return taskName
   */
  @VsoMethod
  public String getTaskName() {
    return taskName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of statediff task.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
  StatediffEvent objStatediffEvent = (StatediffEvent) o;
  return   Objects.equals(this.taskName, objStatediffEvent.taskName)&&
  Objects.equals(this.startTime, objStatediffEvent.startTime)&&
  Objects.equals(this.endTime, objStatediffEvent.endTime)&&
  Objects.equals(this.status, objStatediffEvent.status)&&
  Objects.equals(this.message, objStatediffEvent.message)&&
  Objects.equals(this.duration, objStatediffEvent.duration);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class StatediffEvent {\n");
      sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

