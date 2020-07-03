package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.CPUUsage;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The CPUUsagePerNode is a POJO class extends AviRestResource that used for creating
 * CPUUsagePerNode.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CPUUsagePerNode")
@VsoFinder(name = Constants.FINDER_VRO_CPUUSAGEPERNODE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CPUUsagePerNode extends AviRestResource {
  @JsonProperty("cpu_info")
  @JsonInclude(Include.NON_NULL)
  private CPUUsage cpuInfo = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;



  /**
   * This is the getter method this will return the attribute value.
   * Identifies the cpu usage of the node.
   * Field introduced in 17.2.12, 18.1.2.
   * @return cpuInfo
   */
  @VsoMethod
  public CPUUsage getCpuInfo() {
    return cpuInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Identifies the cpu usage of the node.
   * Field introduced in 17.2.12, 18.1.2.
   * @param cpuInfo set the cpuInfo.
   */
  @VsoMethod
  public void setCpuInfo(CPUUsage cpuInfo) {
    this.cpuInfo = cpuInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Identifies the ip address of the node.
   * Field introduced in 17.2.12, 18.1.2.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Identifies the ip address of the node.
   * Field introduced in 17.2.12, 18.1.2.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CPUUsagePerNode objCPUUsagePerNode = (CPUUsagePerNode) o;
  return   Objects.equals(this.cpuInfo, objCPUUsagePerNode.cpuInfo)&&
  Objects.equals(this.name, objCPUUsagePerNode.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CPUUsagePerNode {\n");
      sb.append("    cpuInfo: ").append(toIndentedString(cpuInfo)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
