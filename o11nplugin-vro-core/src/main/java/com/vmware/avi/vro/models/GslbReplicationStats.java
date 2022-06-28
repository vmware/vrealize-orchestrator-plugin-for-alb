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
 * The GslbReplicationStats is a POJO class extends AviRestResource that used for creating
 * GslbReplicationStats.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbReplicationStats")
@VsoFinder(name = Constants.FINDER_VRO_GSLBREPLICATIONSTATS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbReplicationStats extends AviRestResource {
    @JsonProperty("acknowledged_version")
    @JsonInclude(Include.NON_NULL)
    private Integer acknowledgedVersion = null;

    @JsonProperty("pending_object_count")
    @JsonInclude(Include.NON_NULL)
    private Integer pendingObjectCount = null;

    @JsonProperty("received_version")
    @JsonInclude(Include.NON_NULL)
    private Integer receivedVersion = null;



  /**
   * This is the getter method this will return the attribute value.
   * Last config version acknowledged.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return acknowledgedVersion
   */
  @VsoMethod
  public Integer getAcknowledgedVersion() {
    return acknowledgedVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Last config version acknowledged.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param acknowledgedVersion set the acknowledgedVersion.
   */
  @VsoMethod
  public void setAcknowledgedVersion(Integer  acknowledgedVersion) {
    this.acknowledgedVersion = acknowledgedVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of pending objects.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pendingObjectCount
   */
  @VsoMethod
  public Integer getPendingObjectCount() {
    return pendingObjectCount;
  }

  /**
   * This is the setter method to the attribute.
   * Number of pending objects.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pendingObjectCount set the pendingObjectCount.
   */
  @VsoMethod
  public void setPendingObjectCount(Integer  pendingObjectCount) {
    this.pendingObjectCount = pendingObjectCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Last config version received.
   * On leader, this represents the version received from federated datastore.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return receivedVersion
   */
  @VsoMethod
  public Integer getReceivedVersion() {
    return receivedVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Last config version received.
   * On leader, this represents the version received from federated datastore.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param receivedVersion set the receivedVersion.
   */
  @VsoMethod
  public void setReceivedVersion(Integer  receivedVersion) {
    this.receivedVersion = receivedVersion;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbReplicationStats objGslbReplicationStats = (GslbReplicationStats) o;
  return   Objects.equals(this.receivedVersion, objGslbReplicationStats.receivedVersion)&&
  Objects.equals(this.acknowledgedVersion, objGslbReplicationStats.acknowledgedVersion)&&
  Objects.equals(this.pendingObjectCount, objGslbReplicationStats.pendingObjectCount);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbReplicationStats {\n");
      sb.append("    acknowledgedVersion: ").append(toIndentedString(acknowledgedVersion)).append("\n");
        sb.append("    pendingObjectCount: ").append(toIndentedString(pendingObjectCount)).append("\n");
        sb.append("    receivedVersion: ").append(toIndentedString(receivedVersion)).append("\n");
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

