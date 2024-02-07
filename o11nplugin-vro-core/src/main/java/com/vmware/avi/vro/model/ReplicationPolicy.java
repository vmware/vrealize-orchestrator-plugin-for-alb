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
 * The ReplicationPolicy is a POJO class extends AviRestResource that used for creating
 * ReplicationPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ReplicationPolicy")
@VsoFinder(name = Constants.FINDER_VRO_REPLICATIONPOLICY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ReplicationPolicy extends AviRestResource {
    @JsonProperty("checkpoint_ref")
    @JsonInclude(Include.NON_NULL)
    private String checkpointRef;

    @JsonProperty("replication_mode")
    @JsonInclude(Include.NON_NULL)
    private String replicationMode = "REPLICATION_MODE_CONTINUOUS";



  /**
   * This is the getter method this will return the attribute value.
   * Leader's checkpoint.
   * Follower attempt to replicate configuration till this checkpoint.
   * It is a reference to an object of type federationcheckpoint.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return checkpointRef
   */
  @VsoMethod
  public String getCheckpointRef() {
    return checkpointRef;
  }

  /**
   * This is the setter method to the attribute.
   * Leader's checkpoint.
   * Follower attempt to replicate configuration till this checkpoint.
   * It is a reference to an object of type federationcheckpoint.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param checkpointRef set the checkpointRef.
   */
  @VsoMethod
  public void setCheckpointRef(String  checkpointRef) {
    this.checkpointRef = checkpointRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Replication mode.
   * Enum options - REPLICATION_MODE_CONTINUOUS, REPLICATION_MODE_MANUAL, REPLICATION_MODE_ADAPTIVE.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "REPLICATION_MODE_CONTINUOUS".
   * @return replicationMode
   */
  @VsoMethod
  public String getReplicationMode() {
    return replicationMode;
  }

  /**
   * This is the setter method to the attribute.
   * Replication mode.
   * Enum options - REPLICATION_MODE_CONTINUOUS, REPLICATION_MODE_MANUAL, REPLICATION_MODE_ADAPTIVE.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "REPLICATION_MODE_CONTINUOUS".
   * @param replicationMode set the replicationMode.
   */
  @VsoMethod
  public void setReplicationMode(String  replicationMode) {
    this.replicationMode = replicationMode;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ReplicationPolicy objReplicationPolicy = (ReplicationPolicy) o;
  return   Objects.equals(this.replicationMode, objReplicationPolicy.replicationMode)&&
  Objects.equals(this.checkpointRef, objReplicationPolicy.checkpointRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ReplicationPolicy {\n");
      sb.append("    checkpointRef: ").append(toIndentedString(checkpointRef)).append("\n");
        sb.append("    replicationMode: ").append(toIndentedString(replicationMode)).append("\n");
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

