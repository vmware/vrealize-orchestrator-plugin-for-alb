package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.TechSupportParams;
import com.vmware.avi.vro.model.TechSupportState;
import com.vmware.avi.vro.model.ReadinessCheckObj;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The TechSupport is a POJO class extends AviRestResource that used for creating
 * TechSupport.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TechSupport")
@VsoFinder(name = Constants.FINDER_VRO_TECHSUPPORT, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TechSupport extends AviRestResource {
    @JsonProperty("case_number")
    @JsonInclude(Include.NON_NULL)
    private String caseNumber;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("duration")
    @JsonInclude(Include.NON_NULL)
    private Integer duration;

    @JsonProperty("end_time")
    @JsonInclude(Include.NON_NULL)
    private String endTime;

    @JsonProperty("errors")
    @JsonInclude(Include.NON_NULL)
    private List<String> errors;

    @JsonProperty("level")
    @JsonInclude(Include.NON_NULL)
    private String level;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("node")
    @JsonInclude(Include.NON_NULL)
    private String node;

    @JsonProperty("obj_name")
    @JsonInclude(Include.NON_NULL)
    private String objName;

    @JsonProperty("obj_uuid")
    @JsonInclude(Include.NON_NULL)
    private String objUuid;

    @JsonProperty("output")
    @JsonInclude(Include.NON_NULL)
    private String output;

    @JsonProperty("params")
    @JsonInclude(Include.NON_NULL)
    private TechSupportParams params;

    @JsonProperty("progress")
    @JsonInclude(Include.NON_NULL)
    private Integer progress = 0;

    @JsonProperty("size")
    @JsonInclude(Include.NON_NULL)
    private Float size;

    @JsonProperty("start_time")
    @JsonInclude(Include.NON_NULL)
    private String startTime;

    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private TechSupportState state;

    @JsonProperty("tasks")
    @JsonInclude(Include.NON_NULL)
    private List<TechSupportEventMap> tasks;

    @JsonProperty("tasks_completed")
    @JsonInclude(Include.NON_NULL)
    private Integer tasksCompleted;

    @JsonProperty("techsupport_readiness")
    @JsonInclude(Include.NON_NULL)
    private ReadinessCheckObj techsupportReadiness;

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

    @JsonProperty("warnings")
    @JsonInclude(Include.NON_NULL)
    private List<String> warnings;



  /**
   * This is the getter method this will return the attribute value.
   * 'customer case number for which this techsupport is generated.
   * ''useful for connected portal and other use-cases.'.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return caseNumber
   */
  @VsoMethod
  public String getCaseNumber() {
    return caseNumber;
  }

  /**
   * This is the setter method to the attribute.
   * 'customer case number for which this techsupport is generated.
   * ''useful for connected portal and other use-cases.'.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param caseNumber set the caseNumber.
   */
  @VsoMethod
  public void setCaseNumber(String  caseNumber) {
    this.caseNumber = caseNumber;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User provided description to capture additional details and context regarding the techsupport invocation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * User provided description to capture additional details and context regarding the techsupport invocation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total time taken for techsupport collection.
   * Field introduced in 31.2.1.
   * Unit is sec.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return duration
   */
  @VsoMethod
  public Integer getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Total time taken for techsupport collection.
   * Field introduced in 31.2.1.
   * Unit is sec.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(Integer  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * End timestamp of techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return endTime
   */
  @VsoMethod
  public String getEndTime() {
    return endTime;
  }

  /**
   * This is the setter method to the attribute.
   * End timestamp of techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param endTime set the endTime.
   */
  @VsoMethod
  public void setEndTime(String  endTime) {
    this.endTime = endTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Error logged during techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errors
   */
  @VsoMethod
  public List<String> getErrors() {
    return errors;
  }

  /**
   * This is the setter method. this will set the errors
   * Error logged during techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errors
   */
  @VsoMethod
  public void setErrors(List<String>  errors) {
    this.errors = errors;
  }

  /**
   * This is the setter method this will set the errors
   * Error logged during techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errors
   */
  @VsoMethod
  public TechSupport addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<String>();
    }
    this.errors.add(errorsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name of the techsupport level.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return level
   */
  @VsoMethod
  public String getLevel() {
    return level;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the techsupport level.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param level set the level.
   */
  @VsoMethod
  public void setLevel(String  level) {
    this.level = level;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of techsupport invocation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of techsupport invocation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cluster member node on which the techsupport tarball bundle is saved.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return node
   */
  @VsoMethod
  public String getNode() {
    return node;
  }

  /**
   * This is the setter method to the attribute.
   * Cluster member node on which the techsupport tarball bundle is saved.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param node set the node.
   */
  @VsoMethod
  public void setNode(String  node) {
    this.node = node;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Object name if one exists.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objName
   */
  @VsoMethod
  public String getObjName() {
    return objName;
  }

  /**
   * This is the setter method to the attribute.
   * Object name if one exists.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objName set the objName.
   */
  @VsoMethod
  public void setObjName(String  objName) {
    this.objName = objName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Techsupport collection object uuid specified for different objects such as se/vs/pool etc.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objUuid
   */
  @VsoMethod
  public String getObjUuid() {
    return objUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Techsupport collection object uuid specified for different objects such as se/vs/pool etc.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objUuid set the objUuid.
   */
  @VsoMethod
  public void setObjUuid(String  objUuid) {
    this.objUuid = objUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Techsupport collection output file path.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return output
   */
  @VsoMethod
  public String getOutput() {
    return output;
  }

  /**
   * This is the setter method to the attribute.
   * Techsupport collection output file path.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param output set the output.
   */
  @VsoMethod
  public void setOutput(String  output) {
    this.output = output;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Techsupport params associated with latest techsupport collection.
   * User passed params will have more preference.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return params
   */
  @VsoMethod
  public TechSupportParams getParams() {
    return params;
  }

  /**
   * This is the setter method to the attribute.
   * Techsupport params associated with latest techsupport collection.
   * User passed params will have more preference.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param params set the params.
   */
  @VsoMethod
  public void setParams(TechSupportParams params) {
    this.params = params;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Techsupport collection progress which holds value between 0-100.
   * Allowed values are 0-100.
   * Field introduced in 31.2.1.
   * Unit is percent.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return progress
   */
  @VsoMethod
  public Integer getProgress() {
    return progress;
  }

  /**
   * This is the setter method to the attribute.
   * Techsupport collection progress which holds value between 0-100.
   * Allowed values are 0-100.
   * Field introduced in 31.2.1.
   * Unit is percent.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param progress set the progress.
   */
  @VsoMethod
  public void setProgress(Integer  progress) {
    this.progress = progress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Size of collected techsupport tarball.
   * Field introduced in 31.2.1.
   * Unit is mb.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return size
   */
  @VsoMethod
  public Float getSize() {
    return size;
  }

  /**
   * This is the setter method to the attribute.
   * Size of collected techsupport tarball.
   * Field introduced in 31.2.1.
   * Unit is mb.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param size set the size.
   */
  @VsoMethod
  public void setSize(Float  size) {
    this.size = size;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Start timestamp of techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return startTime
   */
  @VsoMethod
  public String getStartTime() {
    return startTime;
  }

  /**
   * This is the setter method to the attribute.
   * Start timestamp of techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param startTime set the startTime.
   */
  @VsoMethod
  public void setStartTime(String  startTime) {
    this.startTime = startTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * State of current/last techsupport invocation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public TechSupportState getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * State of current/last techsupport invocation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(TechSupportState state) {
    this.state = state;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Events performed for techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tasks
   */
  @VsoMethod
  public List<TechSupportEventMap> getTasks() {
    return tasks;
  }

  /**
   * This is the setter method. this will set the tasks
   * Events performed for techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tasks
   */
  @VsoMethod
  public void setTasks(List<TechSupportEventMap>  tasks) {
    this.tasks = tasks;
  }

  /**
   * This is the setter method this will set the tasks
   * Events performed for techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tasks
   */
  @VsoMethod
  public TechSupport addTasksItem(TechSupportEventMap tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<TechSupportEventMap>();
    }
    this.tasks.add(tasksItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Completed set of tasks in the techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tasksCompleted
   */
  @VsoMethod
  public Integer getTasksCompleted() {
    return tasksCompleted;
  }

  /**
   * This is the setter method to the attribute.
   * Completed set of tasks in the techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tasksCompleted set the tasksCompleted.
   */
  @VsoMethod
  public void setTasksCompleted(Integer  tasksCompleted) {
    this.tasksCompleted = tasksCompleted;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Techsupport readiness checks execution details.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return techsupportReadiness
   */
  @VsoMethod
  public ReadinessCheckObj getTechsupportReadiness() {
    return techsupportReadiness;
  }

  /**
   * This is the setter method to the attribute.
   * Techsupport readiness checks execution details.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param techsupportReadiness set the techsupportReadiness.
   */
  @VsoMethod
  public void setTechsupportReadiness(ReadinessCheckObj techsupportReadiness) {
    this.techsupportReadiness = techsupportReadiness;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant uuid associated with the techsupport.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant uuid associated with the techsupport.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of tasks in the techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return totalTasks
   */
  @VsoMethod
  public Integer getTotalTasks() {
    return totalTasks;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of tasks in the techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
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
   * Uuid identifier for the techsupport invocation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid identifier for the techsupport invocation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Warning logged during techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return warnings
   */
  @VsoMethod
  public List<String> getWarnings() {
    return warnings;
  }

  /**
   * This is the setter method. this will set the warnings
   * Warning logged during techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return warnings
   */
  @VsoMethod
  public void setWarnings(List<String>  warnings) {
    this.warnings = warnings;
  }

  /**
   * This is the setter method this will set the warnings
   * Warning logged during techsupport collection.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return warnings
   */
  @VsoMethod
  public TechSupport addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<String>();
    }
    this.warnings.add(warningsItem);
    return this;
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
  TechSupport objTechSupport = (TechSupport) o;
  return   Objects.equals(this.uuid, objTechSupport.uuid)&&
  Objects.equals(this.name, objTechSupport.name)&&
  Objects.equals(this.state, objTechSupport.state)&&
  Objects.equals(this.level, objTechSupport.level)&&
  Objects.equals(this.objUuid, objTechSupport.objUuid)&&
  Objects.equals(this.objName, objTechSupport.objName)&&
  Objects.equals(this.tasks, objTechSupport.tasks)&&
  Objects.equals(this.totalTasks, objTechSupport.totalTasks)&&
  Objects.equals(this.tasksCompleted, objTechSupport.tasksCompleted)&&
  Objects.equals(this.progress, objTechSupport.progress)&&
  Objects.equals(this.errors, objTechSupport.errors)&&
  Objects.equals(this.warnings, objTechSupport.warnings)&&
  Objects.equals(this.caseNumber, objTechSupport.caseNumber)&&
  Objects.equals(this.description, objTechSupport.description)&&
  Objects.equals(this.node, objTechSupport.node)&&
  Objects.equals(this.techsupportReadiness, objTechSupport.techsupportReadiness)&&
  Objects.equals(this.startTime, objTechSupport.startTime)&&
  Objects.equals(this.endTime, objTechSupport.endTime)&&
  Objects.equals(this.duration, objTechSupport.duration)&&
  Objects.equals(this.params, objTechSupport.params)&&
  Objects.equals(this.output, objTechSupport.output)&&
  Objects.equals(this.size, objTechSupport.size)&&
  Objects.equals(this.tenantRef, objTechSupport.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TechSupport {\n");
      sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    node: ").append(toIndentedString(node)).append("\n");
        sb.append("    objName: ").append(toIndentedString(objName)).append("\n");
        sb.append("    objUuid: ").append(toIndentedString(objUuid)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    tasksCompleted: ").append(toIndentedString(tasksCompleted)).append("\n");
        sb.append("    techsupportReadiness: ").append(toIndentedString(techsupportReadiness)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    totalTasks: ").append(toIndentedString(totalTasks)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

