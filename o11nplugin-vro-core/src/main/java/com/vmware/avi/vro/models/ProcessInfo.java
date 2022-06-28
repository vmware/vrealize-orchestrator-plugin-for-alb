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
 * The ProcessInfo is a POJO class extends AviRestResource that used for creating
 * ProcessInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ProcessInfo")
@VsoFinder(name = Constants.FINDER_VRO_PROCESSINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ProcessInfo extends AviRestResource {
    @JsonProperty("current_process_id")
    @JsonInclude(Include.NON_NULL)
    private Float currentProcessId = null;

    @JsonProperty("current_process_mem_usage")
    @JsonInclude(Include.NON_NULL)
    private Float currentProcessMemUsage = null;

    @JsonProperty("intimation_count")
    @JsonInclude(Include.NON_NULL)
    private Float intimationCount = null;

    @JsonProperty("memory_limit")
    @JsonInclude(Include.NON_NULL)
    private Float memoryLimit = null;

    @JsonProperty("memory_trend_usage")
    @JsonInclude(Include.NON_NULL)
    private String memoryTrendUsage = null;

    @JsonProperty("process_mode")
    @JsonInclude(Include.NON_NULL)
    private String processMode = null;

    @JsonProperty("threshold_percent")
    @JsonInclude(Include.NON_NULL)
    private Float thresholdPercent = null;



  /**
   * This is the getter method this will return the attribute value.
   * Current process id.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return currentProcessId
   */
  @VsoMethod
  public Float getCurrentProcessId() {
    return currentProcessId;
  }

  /**
   * This is the setter method to the attribute.
   * Current process id.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param currentProcessId set the currentProcessId.
   */
  @VsoMethod
  public void setCurrentProcessId(Float  currentProcessId) {
    this.currentProcessId = currentProcessId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total memory usage of process in kbs.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return currentProcessMemUsage
   */
  @VsoMethod
  public Float getCurrentProcessMemUsage() {
    return currentProcessMemUsage;
  }

  /**
   * This is the setter method to the attribute.
   * Total memory usage of process in kbs.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param currentProcessMemUsage set the currentProcessMemUsage.
   */
  @VsoMethod
  public void setCurrentProcessMemUsage(Float  currentProcessMemUsage) {
    this.currentProcessMemUsage = currentProcessMemUsage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of times the process has been in current processmode.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return intimationCount
   */
  @VsoMethod
  public Float getIntimationCount() {
    return intimationCount;
  }

  /**
   * This is the setter method to the attribute.
   * Number of times the process has been in current processmode.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param intimationCount set the intimationCount.
   */
  @VsoMethod
  public void setIntimationCount(Float  intimationCount) {
    this.intimationCount = intimationCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Memory limit for process in kbs.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return memoryLimit
   */
  @VsoMethod
  public Float getMemoryLimit() {
    return memoryLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Memory limit for process in kbs.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param memoryLimit set the memoryLimit.
   */
  @VsoMethod
  public void setMemoryLimit(Float  memoryLimit) {
    this.memoryLimit = memoryLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Current usage trend of process memory.
   * Enum options - UPWARD, DOWNWARD, NEUTRAL.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return memoryTrendUsage
   */
  @VsoMethod
  public String getMemoryTrendUsage() {
    return memoryTrendUsage;
  }

  /**
   * This is the setter method to the attribute.
   * Current usage trend of process memory.
   * Enum options - UPWARD, DOWNWARD, NEUTRAL.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param memoryTrendUsage set the memoryTrendUsage.
   */
  @VsoMethod
  public void setMemoryTrendUsage(String  memoryTrendUsage) {
    this.memoryTrendUsage = memoryTrendUsage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Current mode of process.
   * Enum options - REGULAR, DEBUG, DEGRADED, STOP.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return processMode
   */
  @VsoMethod
  public String getProcessMode() {
    return processMode;
  }

  /**
   * This is the setter method to the attribute.
   * Current mode of process.
   * Enum options - REGULAR, DEBUG, DEGRADED, STOP.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param processMode set the processMode.
   */
  @VsoMethod
  public void setProcessMode(String  processMode) {
    this.processMode = processMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Percentage of memory used out of given limits.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return thresholdPercent
   */
  @VsoMethod
  public Float getThresholdPercent() {
    return thresholdPercent;
  }

  /**
   * This is the setter method to the attribute.
   * Percentage of memory used out of given limits.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param thresholdPercent set the thresholdPercent.
   */
  @VsoMethod
  public void setThresholdPercent(Float  thresholdPercent) {
    this.thresholdPercent = thresholdPercent;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ProcessInfo objProcessInfo = (ProcessInfo) o;
  return   Objects.equals(this.currentProcessMemUsage, objProcessInfo.currentProcessMemUsage)&&
  Objects.equals(this.memoryTrendUsage, objProcessInfo.memoryTrendUsage)&&
  Objects.equals(this.processMode, objProcessInfo.processMode)&&
  Objects.equals(this.thresholdPercent, objProcessInfo.thresholdPercent)&&
  Objects.equals(this.memoryLimit, objProcessInfo.memoryLimit)&&
  Objects.equals(this.currentProcessId, objProcessInfo.currentProcessId)&&
  Objects.equals(this.intimationCount, objProcessInfo.intimationCount);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ProcessInfo {\n");
      sb.append("    currentProcessId: ").append(toIndentedString(currentProcessId)).append("\n");
        sb.append("    currentProcessMemUsage: ").append(toIndentedString(currentProcessMemUsage)).append("\n");
        sb.append("    intimationCount: ").append(toIndentedString(intimationCount)).append("\n");
        sb.append("    memoryLimit: ").append(toIndentedString(memoryLimit)).append("\n");
        sb.append("    memoryTrendUsage: ").append(toIndentedString(memoryTrendUsage)).append("\n");
        sb.append("    processMode: ").append(toIndentedString(processMode)).append("\n");
        sb.append("    thresholdPercent: ").append(toIndentedString(thresholdPercent)).append("\n");
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

