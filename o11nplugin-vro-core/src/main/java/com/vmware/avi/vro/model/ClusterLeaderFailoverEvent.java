package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ClusterNode;
import com.vmware.avi.vro.model.ClusterNode;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ClusterLeaderFailoverEvent is a POJO class extends AviRestResource that used for creating
 * ClusterLeaderFailoverEvent.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ClusterLeaderFailoverEvent")
@VsoFinder(name = Constants.FINDER_VRO_CLUSTERLEADERFAILOVEREVENT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ClusterLeaderFailoverEvent extends AviRestResource {
    @JsonProperty("leader_node")
    @JsonInclude(Include.NON_NULL)
    private ClusterNode leaderNode;

    @JsonProperty("previous_leader_node")
    @JsonInclude(Include.NON_NULL)
    private ClusterNode previousLeaderNode;



  /**
   * This is the getter method this will return the attribute value.
   * Details of the new controller cluster leader node.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return leaderNode
   */
  @VsoMethod
  public ClusterNode getLeaderNode() {
    return leaderNode;
  }

  /**
   * This is the setter method to the attribute.
   * Details of the new controller cluster leader node.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param leaderNode set the leaderNode.
   */
  @VsoMethod
  public void setLeaderNode(ClusterNode leaderNode) {
    this.leaderNode = leaderNode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Details of the previous controller cluster leader.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return previousLeaderNode
   */
  @VsoMethod
  public ClusterNode getPreviousLeaderNode() {
    return previousLeaderNode;
  }

  /**
   * This is the setter method to the attribute.
   * Details of the previous controller cluster leader.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param previousLeaderNode set the previousLeaderNode.
   */
  @VsoMethod
  public void setPreviousLeaderNode(ClusterNode previousLeaderNode) {
    this.previousLeaderNode = previousLeaderNode;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ClusterLeaderFailoverEvent objClusterLeaderFailoverEvent = (ClusterLeaderFailoverEvent) o;
  return   Objects.equals(this.leaderNode, objClusterLeaderFailoverEvent.leaderNode)&&
  Objects.equals(this.previousLeaderNode, objClusterLeaderFailoverEvent.previousLeaderNode);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ClusterLeaderFailoverEvent {\n");
      sb.append("    leaderNode: ").append(toIndentedString(leaderNode)).append("\n");
        sb.append("    previousLeaderNode: ").append(toIndentedString(previousLeaderNode)).append("\n");
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

