package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ReadinessCheckObj;
import com.vmware.avi.vro.model.ReportGenerationRequest;
import com.vmware.avi.vro.model.ReportGenState;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The Report is a POJO class extends AviRestResource that used for creating
 * Report.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Report")
@VsoFinder(name = Constants.FINDER_VRO_REPORT, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Report extends AviRestResource {
    @JsonProperty("duration")
    @JsonInclude(Include.NON_NULL)
    private Integer duration;

    @JsonProperty("end_time")
    @JsonInclude(Include.NON_NULL)
    private String endTime;

    @JsonProperty("filename")
    @JsonInclude(Include.NON_NULL)
    private String filename;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("node")
    @JsonInclude(Include.NON_NULL)
    private String node;

    @JsonProperty("pre_check")
    @JsonInclude(Include.NON_NULL)
    private ReadinessCheckObj preCheck;

    @JsonProperty("progress")
    @JsonInclude(Include.NON_NULL)
    private Integer progress = 0;

    @JsonProperty("request")
    @JsonInclude(Include.NON_NULL)
    private ReportGenerationRequest request;

    @JsonProperty("start_time")
    @JsonInclude(Include.NON_NULL)
    private String startTime;

    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private ReportGenState state;

    @JsonProperty("tasks")
    @JsonInclude(Include.NON_NULL)
    private List<TaskEventMap> tasks;

    @JsonProperty("tasks_completed")
    @JsonInclude(Include.NON_NULL)
    private Integer tasksCompleted;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("total_tasks")
    @JsonInclude(Include.NON_NULL)
    private Integer totalTasks;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Time taken to complete report generation in seconds.
   * Field introduced in 31.2.1.
   * Unit is sec.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return duration
   */
  @VsoMethod
  public Integer getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Time taken to complete report generation in seconds.
   * Field introduced in 31.2.1.
   * Unit is sec.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(Integer  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * End time of the report generation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return endTime
   */
  @VsoMethod
  public String getEndTime() {
    return endTime;
  }

  /**
   * This is the setter method to the attribute.
   * End time of the report generation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param endTime set the endTime.
   */
  @VsoMethod
  public void setEndTime(String  endTime) {
    this.endTime = endTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the report artifact on reports repository.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return filename
   */
  @VsoMethod
  public String getFilename() {
    return filename;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the report artifact on reports repository.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param filename set the filename.
   */
  @VsoMethod
  public void setFilename(String  filename) {
    this.filename = filename;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the report.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the report.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cluster member node on which the report is processed.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return node
   */
  @VsoMethod
  public String getNode() {
    return node;
  }

  /**
   * This is the setter method to the attribute.
   * Cluster member node on which the report is processed.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param node set the node.
   */
  @VsoMethod
  public void setNode(String  node) {
    this.node = node;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pre-check details for the report generation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return preCheck
   */
  @VsoMethod
  public ReadinessCheckObj getPreCheck() {
    return preCheck;
  }

  /**
   * This is the setter method to the attribute.
   * Pre-check details for the report generation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param preCheck set the preCheck.
   */
  @VsoMethod
  public void setPreCheck(ReadinessCheckObj preCheck) {
    this.preCheck = preCheck;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Percentage of tasks completed.
   * Allowed values are 0-100.
   * Field introduced in 31.2.1.
   * Unit is percent.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return progress
   */
  @VsoMethod
  public Integer getProgress() {
    return progress;
  }

  /**
   * This is the setter method to the attribute.
   * Percentage of tasks completed.
   * Allowed values are 0-100.
   * Field introduced in 31.2.1.
   * Unit is percent.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param progress set the progress.
   */
  @VsoMethod
  public void setProgress(Integer  progress) {
    this.progress = progress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Request for the report generation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return request
   */
  @VsoMethod
  public ReportGenerationRequest getRequest() {
    return request;
  }

  /**
   * This is the setter method to the attribute.
   * Request for the report generation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param request set the request.
   */
  @VsoMethod
  public void setRequest(ReportGenerationRequest request) {
    this.request = request;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Start time of the report generation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return startTime
   */
  @VsoMethod
  public String getStartTime() {
    return startTime;
  }

  /**
   * This is the setter method to the attribute.
   * Start time of the report generation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param startTime set the startTime.
   */
  @VsoMethod
  public void setStartTime(String  startTime) {
    this.startTime = startTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * State of the report generation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public ReportGenState getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * State of the report generation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(ReportGenState state) {
    this.state = state;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of tasks associated with the report generation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tasks
   */
  @VsoMethod
  public List<TaskEventMap> getTasks() {
    return tasks;
  }

  /**
   * This is the setter method. this will set the tasks
   * List of tasks associated with the report generation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tasks
   */
  @VsoMethod
  public void setTasks(List<TaskEventMap>  tasks) {
    this.tasks = tasks;
  }

  /**
   * This is the setter method this will set the tasks
   * List of tasks associated with the report generation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tasks
   */
  @VsoMethod
  public Report addTasksItem(TaskEventMap tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<TaskEventMap>();
    }
    this.tasks.add(tasksItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * No.
   * Of tasks completed.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tasksCompleted
   */
  @VsoMethod
  public Integer getTasksCompleted() {
    return tasksCompleted;
  }

  /**
   * This is the setter method to the attribute.
   * No.
   * Of tasks completed.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tasksCompleted set the tasksCompleted.
   */
  @VsoMethod
  public void setTasksCompleted(Integer  tasksCompleted) {
    this.tasksCompleted = tasksCompleted;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant uuid of the report generation.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant uuid of the report generation.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total no.
   * Of tasks.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return totalTasks
   */
  @VsoMethod
  public Integer getTotalTasks() {
    return totalTasks;
  }

  /**
   * This is the setter method to the attribute.
   * Total no.
   * Of tasks.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param totalTasks set the totalTasks.
   */
  @VsoMethod
  public void setTotalTasks(Integer  totalTasks) {
    this.totalTasks = totalTasks;
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
   * Uuid identifier for the report generation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid identifier for the report generation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  Report objReport = (Report) o;
  return   Objects.equals(this.uuid, objReport.uuid)&&
  Objects.equals(this.name, objReport.name)&&
  Objects.equals(this.state, objReport.state)&&
  Objects.equals(this.node, objReport.node)&&
  Objects.equals(this.filename, objReport.filename)&&
  Objects.equals(this.startTime, objReport.startTime)&&
  Objects.equals(this.endTime, objReport.endTime)&&
  Objects.equals(this.duration, objReport.duration)&&
  Objects.equals(this.preCheck, objReport.preCheck)&&
  Objects.equals(this.tasks, objReport.tasks)&&
  Objects.equals(this.totalTasks, objReport.totalTasks)&&
  Objects.equals(this.tasksCompleted, objReport.tasksCompleted)&&
  Objects.equals(this.progress, objReport.progress)&&
  Objects.equals(this.request, objReport.request)&&
  Objects.equals(this.tenantRef, objReport.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Report {\n");
      sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    node: ").append(toIndentedString(node)).append("\n");
        sb.append("    preCheck: ").append(toIndentedString(preCheck)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    request: ").append(toIndentedString(request)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    tasksCompleted: ").append(toIndentedString(tasksCompleted)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    totalTasks: ").append(toIndentedString(totalTasks)).append("\n");
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

