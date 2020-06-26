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
 * The MemoryUsageInfo is a POJO class extends AviRestResource that used for creating
 * MemoryUsageInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MemoryUsageInfo")
@VsoFinder(name = Constants.FINDER_VRO_MEMORYUSAGEINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MemoryUsageInfo extends AviRestResource {
  @JsonProperty("mem_usage_on_nodes")
  @JsonInclude(Include.NON_NULL)
  private List<MemoryUsagePerNode> memUsageOnNodes = null;



  /**
   * This is the getter method this will return the attribute value.
   * Identifies the memory usage of the node.
   * Field introduced in 17.2.12, 18.1.2.
   * @return memUsageOnNodes
   */
  @VsoMethod
  public List<MemoryUsagePerNode> getMemUsageOnNodes() {
    return memUsageOnNodes;
  }

  /**
   * This is the setter method. this will set the memUsageOnNodes
   * Identifies the memory usage of the node.
   * Field introduced in 17.2.12, 18.1.2.
   * @return memUsageOnNodes
   */
  @VsoMethod
  public void setMemUsageOnNodes(List<MemoryUsagePerNode>  memUsageOnNodes) {
    this.memUsageOnNodes = memUsageOnNodes;
  }

  /**
   * This is the setter method this will set the memUsageOnNodes
   * Identifies the memory usage of the node.
   * Field introduced in 17.2.12, 18.1.2.
   * @return memUsageOnNodes
   */
  @VsoMethod
  public MemoryUsageInfo addMemUsageOnNodesItem(MemoryUsagePerNode memUsageOnNodesItem) {
    if (this.memUsageOnNodes == null) {
      this.memUsageOnNodes = new ArrayList<MemoryUsagePerNode>();
    }
    this.memUsageOnNodes.add(memUsageOnNodesItem);
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
  MemoryUsageInfo objMemoryUsageInfo = (MemoryUsageInfo) o;
  return   Objects.equals(this.memUsageOnNodes, objMemoryUsageInfo.memUsageOnNodes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MemoryUsageInfo {\n");
      sb.append("    memUsageOnNodes: ").append(toIndentedString(memUsageOnNodes)).append("\n");
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
