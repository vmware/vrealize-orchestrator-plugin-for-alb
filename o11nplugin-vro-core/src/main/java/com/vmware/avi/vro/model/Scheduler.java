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
 * The Scheduler is a POJO class extends AviRestResource that used for creating
 * Scheduler.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Scheduler")
@VsoFinder(name = Constants.FINDER_VRO_SCHEDULER, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Scheduler extends AviRestResource {
  @JsonProperty("backup_config_ref")
  @JsonInclude(Include.NON_NULL)
  private String backupConfigRef = null;

  @JsonProperty("enabled")
  @JsonInclude(Include.NON_NULL)
  private Boolean enabled = true;

  @JsonProperty("end_date_time")
  @JsonInclude(Include.NON_NULL)
  private String endDateTime = null;

  @JsonProperty("frequency")
  @JsonInclude(Include.NON_NULL)
  private Integer frequency = null;

  @JsonProperty("frequency_unit")
  @JsonInclude(Include.NON_NULL)
  private String frequencyUnit = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("run_mode")
  @JsonInclude(Include.NON_NULL)
  private String runMode = null;

  @JsonProperty("run_script_ref")
  @JsonInclude(Include.NON_NULL)
  private String runScriptRef = null;

  @JsonProperty("scheduler_action")
  @JsonInclude(Include.NON_NULL)
  private String schedulerAction = "SCHEDULER_ACTION_BACKUP";

  @JsonProperty("start_date_time")
  @JsonInclude(Include.NON_NULL)
  private String startDateTime = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Backup configuration to be executed by this scheduler.
   * It is a reference to an object of type backupconfiguration.
   * @return backupConfigRef
   */
  @VsoMethod
  public String getBackupConfigRef() {
    return backupConfigRef;
  }

  /**
   * This is the setter method to the attribute.
   * Backup configuration to be executed by this scheduler.
   * It is a reference to an object of type backupconfiguration.
   * @param backupConfigRef set the backupConfigRef.
   */
  @VsoMethod
  public void setBackupConfigRef(String  backupConfigRef) {
    this.backupConfigRef = backupConfigRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property enabled of obj type scheduler field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property enabled of obj type scheduler field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Scheduler end date and time.
   * @return endDateTime
   */
  @VsoMethod
  public String getEndDateTime() {
    return endDateTime;
  }

  /**
   * This is the setter method to the attribute.
   * Scheduler end date and time.
   * @param endDateTime set the endDateTime.
   */
  @VsoMethod
  public void setEndDateTime(String  endDateTime) {
    this.endDateTime = endDateTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Frequency at which custom scheduler will run.
   * Allowed values are 0-60.
   * @return frequency
   */
  @VsoMethod
  public Integer getFrequency() {
    return frequency;
  }

  /**
   * This is the setter method to the attribute.
   * Frequency at which custom scheduler will run.
   * Allowed values are 0-60.
   * @param frequency set the frequency.
   */
  @VsoMethod
  public void setFrequency(Integer  frequency) {
    this.frequency = frequency;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unit at which custom scheduler will run.
   * Enum options - SCHEDULER_FREQUENCY_UNIT_MIN, SCHEDULER_FREQUENCY_UNIT_HOUR, SCHEDULER_FREQUENCY_UNIT_DAY, SCHEDULER_FREQUENCY_UNIT_WEEK,
   * SCHEDULER_FREQUENCY_UNIT_MONTH.
   * @return frequencyUnit
   */
  @VsoMethod
  public String getFrequencyUnit() {
    return frequencyUnit;
  }

  /**
   * This is the setter method to the attribute.
   * Unit at which custom scheduler will run.
   * Enum options - SCHEDULER_FREQUENCY_UNIT_MIN, SCHEDULER_FREQUENCY_UNIT_HOUR, SCHEDULER_FREQUENCY_UNIT_DAY, SCHEDULER_FREQUENCY_UNIT_WEEK,
   * SCHEDULER_FREQUENCY_UNIT_MONTH.
   * @param frequencyUnit set the frequencyUnit.
   */
  @VsoMethod
  public void setFrequencyUnit(String  frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of scheduler.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of scheduler.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Scheduler run mode.
   * Enum options - RUN_MODE_PERIODIC, RUN_MODE_AT, RUN_MODE_NOW.
   * @return runMode
   */
  @VsoMethod
  public String getRunMode() {
    return runMode;
  }

  /**
   * This is the setter method to the attribute.
   * Scheduler run mode.
   * Enum options - RUN_MODE_PERIODIC, RUN_MODE_AT, RUN_MODE_NOW.
   * @param runMode set the runMode.
   */
  @VsoMethod
  public void setRunMode(String  runMode) {
    this.runMode = runMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Control script to be executed by this scheduler.
   * It is a reference to an object of type alertscriptconfig.
   * @return runScriptRef
   */
  @VsoMethod
  public String getRunScriptRef() {
    return runScriptRef;
  }

  /**
   * This is the setter method to the attribute.
   * Control script to be executed by this scheduler.
   * It is a reference to an object of type alertscriptconfig.
   * @param runScriptRef set the runScriptRef.
   */
  @VsoMethod
  public void setRunScriptRef(String  runScriptRef) {
    this.runScriptRef = runScriptRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Define scheduler action.
   * Enum options - SCHEDULER_ACTION_RUN_A_SCRIPT, SCHEDULER_ACTION_BACKUP.
   * Default value when not specified in API or module is interpreted by Avi Controller as SCHEDULER_ACTION_BACKUP.
   * @return schedulerAction
   */
  @VsoMethod
  public String getSchedulerAction() {
    return schedulerAction;
  }

  /**
   * This is the setter method to the attribute.
   * Define scheduler action.
   * Enum options - SCHEDULER_ACTION_RUN_A_SCRIPT, SCHEDULER_ACTION_BACKUP.
   * Default value when not specified in API or module is interpreted by Avi Controller as SCHEDULER_ACTION_BACKUP.
   * @param schedulerAction set the schedulerAction.
   */
  @VsoMethod
  public void setSchedulerAction(String  schedulerAction) {
    this.schedulerAction = schedulerAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Scheduler start date and time.
   * @return startDateTime
   */
  @VsoMethod
  public String getStartDateTime() {
    return startDateTime;
  }

  /**
   * This is the setter method to the attribute.
   * Scheduler start date and time.
   * @param startDateTime set the startDateTime.
   */
  @VsoMethod
  public void setStartDateTime(String  startDateTime) {
    this.startDateTime = startDateTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  Scheduler objScheduler = (Scheduler) o;
  return   Objects.equals(this.startDateTime, objScheduler.startDateTime)&&
  Objects.equals(this.backupConfigRef, objScheduler.backupConfigRef)&&
  Objects.equals(this.uuid, objScheduler.uuid)&&
  Objects.equals(this.enabled, objScheduler.enabled)&&
  Objects.equals(this.frequencyUnit, objScheduler.frequencyUnit)&&
  Objects.equals(this.name, objScheduler.name)&&
  Objects.equals(this.frequency, objScheduler.frequency)&&
  Objects.equals(this.schedulerAction, objScheduler.schedulerAction)&&
  Objects.equals(this.endDateTime, objScheduler.endDateTime)&&
  Objects.equals(this.runScriptRef, objScheduler.runScriptRef)&&
  Objects.equals(this.tenantRef, objScheduler.tenantRef)&&
  Objects.equals(this.runMode, objScheduler.runMode);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Scheduler {\n");
      sb.append("    backupConfigRef: ").append(toIndentedString(backupConfigRef)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    frequencyUnit: ").append(toIndentedString(frequencyUnit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    runMode: ").append(toIndentedString(runMode)).append("\n");
        sb.append("    runScriptRef: ").append(toIndentedString(runScriptRef)).append("\n");
        sb.append("    schedulerAction: ").append(toIndentedString(schedulerAction)).append("\n");
        sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

