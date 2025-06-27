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
    @JsonProperty("checkpoint_uuid")
    @JsonInclude(Include.NON_NULL)
    private String checkpointUuid;

    @JsonProperty("replication_mode")
    @JsonInclude(Include.NON_NULL)
    private String replicationMode = "REPLICATION_MODE_CONTINUOUS";



  /**
   * This is the getter method this will return the attribute value.
   * Leader's checkpoint.
   * Follower attempt to replicate configuration till this checkpoint.
   * Field deprecated in 31.2.1.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return checkpointUuid
   */
  @VsoMethod
  public String getCheckpointUuid() {
    return checkpointUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Leader's checkpoint.
   * Follower attempt to replicate configuration till this checkpoint.
   * Field deprecated in 31.2.1.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @param checkpointUuid set the checkpointUuid.
   */
  @VsoMethod
  public void setCheckpointUuid(String  checkpointUuid) {
    this.checkpointUuid = checkpointUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Replication mode.
   * Enum options - REPLICATION_MODE_CONTINUOUS, REPLICATION_MODE_MANUAL, REPLICATION_MODE_ADAPTIVE.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
  Objects.equals(this.checkpointUuid, objReplicationPolicy.checkpointUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ReplicationPolicy {\n");
      sb.append("    checkpointUuid: ").append(toIndentedString(checkpointUuid)).append("\n");
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

