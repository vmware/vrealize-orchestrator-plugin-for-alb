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
 * The ControllerParams is a POJO class extends AviRestResource that used for creating
 * ControllerParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerParams")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerParams extends AviRestResource {
    @JsonProperty("task_base_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer taskBaseTimeout = 300;



  /**
   * This is the getter method this will return the attribute value.
   * Base timeout value for all controller-specific upgrade operation tasks.
   * The timeout value for each task is a multiple of task_base_timeout.
   * For example, switchandreboot task timeout = [multiplier] * task_base_timeout.
   * (the multiplier varies by task.).
   * Allowed values are 300-3600.
   * Field introduced in 31.1.1.
   * Unit is sec.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return taskBaseTimeout
   */
  @VsoMethod
  public Integer getTaskBaseTimeout() {
    return taskBaseTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Base timeout value for all controller-specific upgrade operation tasks.
   * The timeout value for each task is a multiple of task_base_timeout.
   * For example, switchandreboot task timeout = [multiplier] * task_base_timeout.
   * (the multiplier varies by task.).
   * Allowed values are 300-3600.
   * Field introduced in 31.1.1.
   * Unit is sec.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param taskBaseTimeout set the taskBaseTimeout.
   */
  @VsoMethod
  public void setTaskBaseTimeout(Integer  taskBaseTimeout) {
    this.taskBaseTimeout = taskBaseTimeout;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ControllerParams objControllerParams = (ControllerParams) o;
  return   Objects.equals(this.taskBaseTimeout, objControllerParams.taskBaseTimeout);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerParams {\n");
      sb.append("    taskBaseTimeout: ").append(toIndentedString(taskBaseTimeout)).append("\n");
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

