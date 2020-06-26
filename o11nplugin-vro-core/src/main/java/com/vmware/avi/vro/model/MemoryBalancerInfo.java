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
 * The MemoryBalancerInfo is a POJO class extends AviRestResource that used for creating
 * MemoryBalancerInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MemoryBalancerInfo")
@VsoFinder(name = Constants.FINDER_VRO_MEMORYBALANCERINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MemoryBalancerInfo extends AviRestResource {
  @JsonProperty("child")
  @JsonInclude(Include.NON_NULL)
  private List<ChildProcessInfo> child = null;

  @JsonProperty("controller_memory")
  @JsonInclude(Include.NON_NULL)
  private Integer controllerMemory = null;

  @JsonProperty("limit")
  @JsonInclude(Include.NON_NULL)
  private Integer limit = null;

  @JsonProperty("memory_used")
  @JsonInclude(Include.NON_NULL)
  private Integer memoryUsed = null;

  @JsonProperty("pid")
  @JsonInclude(Include.NON_NULL)
  private Integer pid = null;

  @JsonProperty("process")
  @JsonInclude(Include.NON_NULL)
  private String process = null;



  /**
   * This is the getter method this will return the attribute value.
   * Child process information.
   * @return child
   */
  @VsoMethod
  public List<ChildProcessInfo> getChild() {
    return child;
  }

  /**
   * This is the setter method. this will set the child
   * Child process information.
   * @return child
   */
  @VsoMethod
  public void setChild(List<ChildProcessInfo>  child) {
    this.child = child;
  }

  /**
   * This is the setter method this will set the child
   * Child process information.
   * @return child
   */
  @VsoMethod
  public MemoryBalancerInfo addChildItem(ChildProcessInfo childItem) {
    if (this.child == null) {
      this.child = new ArrayList<ChildProcessInfo>();
    }
    this.child.add(childItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Controller memory.
   * @return controllerMemory
   */
  @VsoMethod
  public Integer getControllerMemory() {
    return controllerMemory;
  }

  /**
   * This is the setter method to the attribute.
   * Controller memory.
   * @param controllerMemory set the controllerMemory.
   */
  @VsoMethod
  public void setControllerMemory(Integer  controllerMemory) {
    this.controllerMemory = controllerMemory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Limit on the memory (in mb) for the process.
   * @return limit
   */
  @VsoMethod
  public Integer getLimit() {
    return limit;
  }

  /**
   * This is the setter method to the attribute.
   * Limit on the memory (in mb) for the process.
   * @param limit set the limit.
   */
  @VsoMethod
  public void setLimit(Integer  limit) {
    this.limit = limit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Amount of memory (in mb) used by the process.
   * @return memoryUsed
   */
  @VsoMethod
  public Integer getMemoryUsed() {
    return memoryUsed;
  }

  /**
   * This is the setter method to the attribute.
   * Amount of memory (in mb) used by the process.
   * @param memoryUsed set the memoryUsed.
   */
  @VsoMethod
  public void setMemoryUsed(Integer  memoryUsed) {
    this.memoryUsed = memoryUsed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pid of the process.
   * @return pid
   */
  @VsoMethod
  public Integer getPid() {
    return pid;
  }

  /**
   * This is the setter method to the attribute.
   * Pid of the process.
   * @param pid set the pid.
   */
  @VsoMethod
  public void setPid(Integer  pid) {
    this.pid = pid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the process.
   * @return process
   */
  @VsoMethod
  public String getProcess() {
    return process;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the process.
   * @param process set the process.
   */
  @VsoMethod
  public void setProcess(String  process) {
    this.process = process;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MemoryBalancerInfo objMemoryBalancerInfo = (MemoryBalancerInfo) o;
  return   Objects.equals(this.memoryUsed, objMemoryBalancerInfo.memoryUsed)&&
  Objects.equals(this.process, objMemoryBalancerInfo.process)&&
  Objects.equals(this.pid, objMemoryBalancerInfo.pid)&&
  Objects.equals(this.limit, objMemoryBalancerInfo.limit)&&
  Objects.equals(this.child, objMemoryBalancerInfo.child)&&
  Objects.equals(this.controllerMemory, objMemoryBalancerInfo.controllerMemory);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MemoryBalancerInfo {\n");
      sb.append("    child: ").append(toIndentedString(child)).append("\n");
        sb.append("    controllerMemory: ").append(toIndentedString(controllerMemory)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    memoryUsed: ").append(toIndentedString(memoryUsed)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
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
