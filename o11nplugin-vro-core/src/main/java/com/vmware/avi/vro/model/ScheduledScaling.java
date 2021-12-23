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
 * The ScheduledScaling is a POJO class extends AviRestResource that used for creating
 * ScheduledScaling.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ScheduledScaling")
@VsoFinder(name = Constants.FINDER_VRO_SCHEDULEDSCALING)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ScheduledScaling extends AviRestResource {
    @JsonProperty("autoscaling_duration")
    @JsonInclude(Include.NON_NULL)
    private Integer autoscalingDuration = 1;

    @JsonProperty("cron_expression")
    @JsonInclude(Include.NON_NULL)
    private String cronExpression = null;

    @JsonProperty("desired_capacity")
    @JsonInclude(Include.NON_NULL)
    private Integer desiredCapacity = null;

    @JsonProperty("enable")
    @JsonInclude(Include.NON_NULL)
    private Boolean enable = true;

    @JsonProperty("end_date")
    @JsonInclude(Include.NON_NULL)
    private String endDate = null;

    @JsonProperty("recurrence")
    @JsonInclude(Include.NON_NULL)
    private String recurrence;

    @JsonProperty("schedule_max_step")
    @JsonInclude(Include.NON_NULL)
    private Integer scheduleMaxStep = 1;

    @JsonProperty("start_date")
    @JsonInclude(Include.NON_NULL)
    private String startDate = null;



  /**
   * This is the getter method this will return the attribute value.
   * Scheduled autoscale duration (in hours).
   * Allowed values are 1-24.
   * Field introduced in 21.1.1.
   * Unit is hours.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return autoscalingDuration
   */
  @VsoMethod
  public Integer getAutoscalingDuration() {
    return autoscalingDuration;
  }

  /**
   * This is the setter method to the attribute.
   * Scheduled autoscale duration (in hours).
   * Allowed values are 1-24.
   * Field introduced in 21.1.1.
   * Unit is hours.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param autoscalingDuration set the autoscalingDuration.
   */
  @VsoMethod
  public void setAutoscalingDuration(Integer  autoscalingDuration) {
    this.autoscalingDuration = autoscalingDuration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The cron expression describing desired time for the scheduled autoscale.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cronExpression
   */
  @VsoMethod
  public String getCronExpression() {
    return cronExpression;
  }

  /**
   * This is the setter method to the attribute.
   * The cron expression describing desired time for the scheduled autoscale.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cronExpression set the cronExpression.
   */
  @VsoMethod
  public void setCronExpression(String  cronExpression) {
    this.cronExpression = cronExpression;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Desired number of servers during scheduled intervals, it may cause scale-in or scale-out based on the value.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return desiredCapacity
   */
  @VsoMethod
  public Integer getDesiredCapacity() {
    return desiredCapacity;
  }

  /**
   * This is the setter method to the attribute.
   * Desired number of servers during scheduled intervals, it may cause scale-in or scale-out based on the value.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param desiredCapacity set the desiredCapacity.
   */
  @VsoMethod
  public void setDesiredCapacity(Integer  desiredCapacity) {
    this.desiredCapacity = desiredCapacity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enables the scheduled autoscale.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enable
   */
  @VsoMethod
  public Boolean getEnable() {
    return enable;
  }

  /**
   * This is the setter method to the attribute.
   * Enables the scheduled autoscale.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enable set the enable.
   */
  @VsoMethod
  public void setEnable(Boolean  enable) {
    this.enable = enable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Scheduled autoscale end date in iso8601 format, said day will be included in scheduled and have to be in future and greater than start date.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return endDate
   */
  @VsoMethod
  public String getEndDate() {
    return endDate;
  }

  /**
   * This is the setter method to the attribute.
   * Scheduled autoscale end date in iso8601 format, said day will be included in scheduled and have to be in future and greater than start date.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param endDate set the endDate.
   */
  @VsoMethod
  public void setEndDate(String  endDate) {
    this.endDate = endDate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Deprecated.frequency of the scheduled autoscale.
   * Enum options - ONCE, EVERY_DAY, EVERY_WEEK, EVERY_MONTH.
   * Field deprecated in 21.1.3.
   * Field introduced in 21.1.1.
   * @return recurrence
   */
  @VsoMethod
  public String getRecurrence() {
    return recurrence;
  }

  /**
   * This is the setter method to the attribute.
   * Deprecated.frequency of the scheduled autoscale.
   * Enum options - ONCE, EVERY_DAY, EVERY_WEEK, EVERY_MONTH.
   * Field deprecated in 21.1.3.
   * Field introduced in 21.1.1.
   * @param recurrence set the recurrence.
   */
  @VsoMethod
  public void setRecurrence(String  recurrence) {
    this.recurrence = recurrence;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of simultaneous scale-in/out servers for scheduled autoscale.
   * If this value is 0, regular autoscale policy dictates this.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return scheduleMaxStep
   */
  @VsoMethod
  public Integer getScheduleMaxStep() {
    return scheduleMaxStep;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of simultaneous scale-in/out servers for scheduled autoscale.
   * If this value is 0, regular autoscale policy dictates this.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param scheduleMaxStep set the scheduleMaxStep.
   */
  @VsoMethod
  public void setScheduleMaxStep(Integer  scheduleMaxStep) {
    this.scheduleMaxStep = scheduleMaxStep;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Scheduled autoscale start date in iso8601 format, said day will be included in scheduled and have to be in future.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return startDate
   */
  @VsoMethod
  public String getStartDate() {
    return startDate;
  }

  /**
   * This is the setter method to the attribute.
   * Scheduled autoscale start date in iso8601 format, said day will be included in scheduled and have to be in future.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param startDate set the startDate.
   */
  @VsoMethod
  public void setStartDate(String  startDate) {
    this.startDate = startDate;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ScheduledScaling objScheduledScaling = (ScheduledScaling) o;
  return   Objects.equals(this.recurrence, objScheduledScaling.recurrence)&&
  Objects.equals(this.enable, objScheduledScaling.enable)&&
  Objects.equals(this.desiredCapacity, objScheduledScaling.desiredCapacity)&&
  Objects.equals(this.cronExpression, objScheduledScaling.cronExpression)&&
  Objects.equals(this.startDate, objScheduledScaling.startDate)&&
  Objects.equals(this.endDate, objScheduledScaling.endDate)&&
  Objects.equals(this.autoscalingDuration, objScheduledScaling.autoscalingDuration)&&
  Objects.equals(this.scheduleMaxStep, objScheduledScaling.scheduleMaxStep);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ScheduledScaling {\n");
      sb.append("    autoscalingDuration: ").append(toIndentedString(autoscalingDuration)).append("\n");
        sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
        sb.append("    desiredCapacity: ").append(toIndentedString(desiredCapacity)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
        sb.append("    scheduleMaxStep: ").append(toIndentedString(scheduleMaxStep)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

