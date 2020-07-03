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
 * The SchedulerActionDetails is a POJO class extends AviRestResource that used for creating
 * SchedulerActionDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SchedulerActionDetails")
@VsoFinder(name = Constants.FINDER_VRO_SCHEDULERACTIONDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SchedulerActionDetails extends AviRestResource {
  @JsonProperty("backup_uri")
  @JsonInclude(Include.NON_NULL)
  private List<String> backupUri = null;

  @JsonProperty("control_script_output")
  @JsonInclude(Include.NON_NULL)
  private String controlScriptOutput = null;

  @JsonProperty("execution_datestamp")
  @JsonInclude(Include.NON_NULL)
  private String executionDatestamp = null;

  @JsonProperty("scheduler_uuid")
  @JsonInclude(Include.NON_NULL)
  private String schedulerUuid = null;

  @JsonProperty("status")
  @JsonInclude(Include.NON_NULL)
  private String status = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property backup_uri of obj type scheduleractiondetails field type str  type array.
   * @return backupUri
   */
  @VsoMethod
  public List<String> getBackupUri() {
    return backupUri;
  }

  /**
   * This is the setter method. this will set the backupUri
   * Placeholder for description of property backup_uri of obj type scheduleractiondetails field type str  type array.
   * @return backupUri
   */
  @VsoMethod
  public void setBackupUri(List<String>  backupUri) {
    this.backupUri = backupUri;
  }

  /**
   * This is the setter method this will set the backupUri
   * Placeholder for description of property backup_uri of obj type scheduleractiondetails field type str  type array.
   * @return backupUri
   */
  @VsoMethod
  public SchedulerActionDetails addBackupUriItem(String backupUriItem) {
    if (this.backupUri == null) {
      this.backupUri = new ArrayList<String>();
    }
    this.backupUri.add(backupUriItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property control_script_output of obj type scheduleractiondetails field type str  type string.
   * @return controlScriptOutput
   */
  @VsoMethod
  public String getControlScriptOutput() {
    return controlScriptOutput;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property control_script_output of obj type scheduleractiondetails field type str  type string.
   * @param controlScriptOutput set the controlScriptOutput.
   */
  @VsoMethod
  public void setControlScriptOutput(String  controlScriptOutput) {
    this.controlScriptOutput = controlScriptOutput;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property execution_datestamp of obj type scheduleractiondetails field type str  type string.
   * @return executionDatestamp
   */
  @VsoMethod
  public String getExecutionDatestamp() {
    return executionDatestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property execution_datestamp of obj type scheduleractiondetails field type str  type string.
   * @param executionDatestamp set the executionDatestamp.
   */
  @VsoMethod
  public void setExecutionDatestamp(String  executionDatestamp) {
    this.executionDatestamp = executionDatestamp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of scheduler.
   * @return schedulerUuid
   */
  @VsoMethod
  public String getSchedulerUuid() {
    return schedulerUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of scheduler.
   * @param schedulerUuid set the schedulerUuid.
   */
  @VsoMethod
  public void setSchedulerUuid(String  schedulerUuid) {
    this.schedulerUuid = schedulerUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property status of obj type scheduleractiondetails field type str  type string.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property status of obj type scheduleractiondetails field type str  type string.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SchedulerActionDetails objSchedulerActionDetails = (SchedulerActionDetails) o;
  return   Objects.equals(this.controlScriptOutput, objSchedulerActionDetails.controlScriptOutput)&&
  Objects.equals(this.executionDatestamp, objSchedulerActionDetails.executionDatestamp)&&
  Objects.equals(this.backupUri, objSchedulerActionDetails.backupUri)&&
  Objects.equals(this.status, objSchedulerActionDetails.status)&&
  Objects.equals(this.schedulerUuid, objSchedulerActionDetails.schedulerUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SchedulerActionDetails {\n");
      sb.append("    backupUri: ").append(toIndentedString(backupUri)).append("\n");
        sb.append("    controlScriptOutput: ").append(toIndentedString(controlScriptOutput)).append("\n");
        sb.append("    executionDatestamp: ").append(toIndentedString(executionDatestamp)).append("\n");
        sb.append("    schedulerUuid: ").append(toIndentedString(schedulerUuid)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
