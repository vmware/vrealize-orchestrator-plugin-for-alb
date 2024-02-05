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
 * The ChildProcessInfo is a POJO class extends AviRestResource that used for creating
 * ChildProcessInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ChildProcessInfo")
@VsoFinder(name = Constants.FINDER_VRO_CHILDPROCESSINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ChildProcessInfo extends AviRestResource {
    @JsonProperty("memory")
    @JsonInclude(Include.NON_NULL)
    private Integer memory;

    @JsonProperty("pid")
    @JsonInclude(Include.NON_NULL)
    private Integer pid;



  /**
   * This is the getter method this will return the attribute value.
   * Amount of memory (in mb) used by the sub process.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return memory
   */
  @VsoMethod
  public Integer getMemory() {
    return memory;
  }

  /**
   * This is the setter method to the attribute.
   * Amount of memory (in mb) used by the sub process.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param memory set the memory.
   */
  @VsoMethod
  public void setMemory(Integer  memory) {
    this.memory = memory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Process id of the sub process.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pid
   */
  @VsoMethod
  public Integer getPid() {
    return pid;
  }

  /**
   * This is the setter method to the attribute.
   * Process id of the sub process.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pid set the pid.
   */
  @VsoMethod
  public void setPid(Integer  pid) {
    this.pid = pid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ChildProcessInfo objChildProcessInfo = (ChildProcessInfo) o;
  return   Objects.equals(this.pid, objChildProcessInfo.pid)&&
  Objects.equals(this.memory, objChildProcessInfo.memory);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ChildProcessInfo {\n");
      sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
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

