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
 * The CPUUsageInfo is a POJO class extends AviRestResource that used for creating
 * CPUUsageInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CPUUsageInfo")
@VsoFinder(name = Constants.FINDER_VRO_CPUUSAGEINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CPUUsageInfo extends AviRestResource {
    @JsonProperty("cpu_usage_on_nodes")
    @JsonInclude(Include.NON_NULL)
    private List<CPUUsagePerNode> cpuUsageOnNodes = null;



  /**
   * This is the getter method this will return the attribute value.
   * Identifies the cpu usage of the node.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cpuUsageOnNodes
   */
  @VsoMethod
  public List<CPUUsagePerNode> getCpuUsageOnNodes() {
    return cpuUsageOnNodes;
  }

  /**
   * This is the setter method. this will set the cpuUsageOnNodes
   * Identifies the cpu usage of the node.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cpuUsageOnNodes
   */
  @VsoMethod
  public void setCpuUsageOnNodes(List<CPUUsagePerNode>  cpuUsageOnNodes) {
    this.cpuUsageOnNodes = cpuUsageOnNodes;
  }

  /**
   * This is the setter method this will set the cpuUsageOnNodes
   * Identifies the cpu usage of the node.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cpuUsageOnNodes
   */
  @VsoMethod
  public CPUUsageInfo addCpuUsageOnNodesItem(CPUUsagePerNode cpuUsageOnNodesItem) {
    if (this.cpuUsageOnNodes == null) {
      this.cpuUsageOnNodes = new ArrayList<CPUUsagePerNode>();
    }
    this.cpuUsageOnNodes.add(cpuUsageOnNodesItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CPUUsageInfo objCPUUsageInfo = (CPUUsageInfo) o;
  return   Objects.equals(this.cpuUsageOnNodes, objCPUUsageInfo.cpuUsageOnNodes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CPUUsageInfo {\n");
      sb.append("    cpuUsageOnNodes: ").append(toIndentedString(cpuUsageOnNodes)).append("\n");
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

