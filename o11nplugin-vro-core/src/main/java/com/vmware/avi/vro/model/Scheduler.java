package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * Scheduler
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "Scheduler")
@VsoFinder(name = Constants.FINDER_VRO_SCHEDULER, idAccessor = "getObjectID()")
@Service
public class Scheduler extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("backup_config_ref")
  private String backupConfigRef = null;

  @JsonProperty("enabled")
  private Boolean enabled = true;

  @JsonProperty("end_date_time")
  private String endDateTime = null;

  @JsonProperty("frequency")
  private Integer frequency = null;

  @JsonProperty("frequency_unit")
  private String frequencyUnit = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("run_mode")
  private String runMode = null;

  @JsonProperty("run_script_ref")
  private String runScriptRef = null;

  @JsonProperty("scheduler_action")
  private String schedulerAction = "SCHEDULER_ACTION_BACKUP";

  @JsonProperty("start_date_time")
  private String startDateTime = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * Backup Configuration to be executed by this scheduler. It is a reference to an object of type BackupConfiguration.
   * @return backupConfigRef
  **/
  @ApiModelProperty(value = "Backup Configuration to be executed by this scheduler. It is a reference to an object of type BackupConfiguration.")


 
  @VsoMethod  
  public String getBackupConfigRef() {
    return backupConfigRef;
  }
    
  @VsoMethod
  public void setBackupConfigRef(String backupConfigRef) {
    this.backupConfigRef = backupConfigRef;
  }

  
  /**
   * Placeholder for description of property enabled of obj type Scheduler field type str  type boolean
   * @return enabled
  **/
  @ApiModelProperty(value = "Placeholder for description of property enabled of obj type Scheduler field type str  type boolean")


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * Scheduler end date and time.
   * @return endDateTime
  **/
  @ApiModelProperty(value = "Scheduler end date and time.")


 
  @VsoMethod  
  public String getEndDateTime() {
    return endDateTime;
  }
    
  @VsoMethod
  public void setEndDateTime(String endDateTime) {
    this.endDateTime = endDateTime;
  }

  
  /**
   * Frequency at which CUSTOM scheduler will run. Allowed values are 0-60.
   * @return frequency
  **/
  @ApiModelProperty(value = "Frequency at which CUSTOM scheduler will run. Allowed values are 0-60.")


 
  @VsoMethod  
  public Integer getFrequency() {
    return frequency;
  }
    
  @VsoMethod
  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  
  /**
   * Unit at which CUSTOM scheduler will run. Enum options - SCHEDULER_FREQUENCY_UNIT_MIN, SCHEDULER_FREQUENCY_UNIT_HOUR, SCHEDULER_FREQUENCY_UNIT_DAY, SCHEDULER_FREQUENCY_UNIT_WEEK, SCHEDULER_FREQUENCY_UNIT_MONTH.
   * @return frequencyUnit
  **/
  @ApiModelProperty(value = "Unit at which CUSTOM scheduler will run. Enum options - SCHEDULER_FREQUENCY_UNIT_MIN, SCHEDULER_FREQUENCY_UNIT_HOUR, SCHEDULER_FREQUENCY_UNIT_DAY, SCHEDULER_FREQUENCY_UNIT_WEEK, SCHEDULER_FREQUENCY_UNIT_MONTH.")


 
  @VsoMethod  
  public String getFrequencyUnit() {
    return frequencyUnit;
  }
    
  @VsoMethod
  public void setFrequencyUnit(String frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
  }

  
  /**
   * Name of scheduler.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of scheduler.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Scheduler Run Mode. Enum options - RUN_MODE_PERIODIC, RUN_MODE_AT, RUN_MODE_NOW.
   * @return runMode
  **/
  @ApiModelProperty(value = "Scheduler Run Mode. Enum options - RUN_MODE_PERIODIC, RUN_MODE_AT, RUN_MODE_NOW.")


 
  @VsoMethod  
  public String getRunMode() {
    return runMode;
  }
    
  @VsoMethod
  public void setRunMode(String runMode) {
    this.runMode = runMode;
  }

  
  /**
   * Control script to be executed by this scheduler. It is a reference to an object of type AlertScriptConfig.
   * @return runScriptRef
  **/
  @ApiModelProperty(value = "Control script to be executed by this scheduler. It is a reference to an object of type AlertScriptConfig.")


 
  @VsoMethod  
  public String getRunScriptRef() {
    return runScriptRef;
  }
    
  @VsoMethod
  public void setRunScriptRef(String runScriptRef) {
    this.runScriptRef = runScriptRef;
  }

  
  /**
   * Define Scheduler Action. Enum options - SCHEDULER_ACTION_RUN_A_SCRIPT, SCHEDULER_ACTION_BACKUP.
   * @return schedulerAction
  **/
  @ApiModelProperty(value = "Define Scheduler Action. Enum options - SCHEDULER_ACTION_RUN_A_SCRIPT, SCHEDULER_ACTION_BACKUP.")


 
  @VsoMethod  
  public String getSchedulerAction() {
    return schedulerAction;
  }
    
  @VsoMethod
  public void setSchedulerAction(String schedulerAction) {
    this.schedulerAction = schedulerAction;
  }

  
  /**
   * Scheduler start date and time.
   * @return startDateTime
  **/
  @ApiModelProperty(value = "Scheduler start date and time.")


 
  @VsoMethod  
  public String getStartDateTime() {
    return startDateTime;
  }
    
  @VsoMethod
  public void setStartDateTime(String startDateTime) {
    this.startDateTime = startDateTime;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "Scheduler";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scheduler scheduler = (Scheduler) o;
    return Objects.equals(this.lastModified, scheduler.lastModified) &&
        Objects.equals(this.backupConfigRef, scheduler.backupConfigRef) &&
        Objects.equals(this.enabled, scheduler.enabled) &&
        Objects.equals(this.endDateTime, scheduler.endDateTime) &&
        Objects.equals(this.frequency, scheduler.frequency) &&
        Objects.equals(this.frequencyUnit, scheduler.frequencyUnit) &&
        Objects.equals(this.name, scheduler.name) &&
        Objects.equals(this.runMode, scheduler.runMode) &&
        Objects.equals(this.runScriptRef, scheduler.runScriptRef) &&
        Objects.equals(this.schedulerAction, scheduler.schedulerAction) &&
        Objects.equals(this.startDateTime, scheduler.startDateTime) &&
        Objects.equals(this.tenantRef, scheduler.tenantRef) &&
        Objects.equals(this.url, scheduler.url) &&
        Objects.equals(this.uuid, scheduler.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, backupConfigRef, enabled, endDateTime, frequency, frequencyUnit, name, runMode, runScriptRef, schedulerAction, startDateTime, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scheduler {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

