package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ClusterNodeDbFailedEvent is a POJO class extends AviRestResource that used for creating
 * ClusterNodeDbFailedEvent.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ClusterNodeDbFailedEvent")
@VsoFinder(name = Constants.FINDER_VRO_CLUSTERNODEDBFAILEDEVENT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ClusterNodeDbFailedEvent extends AviRestResource {
    @JsonProperty("failure_count")
    @JsonInclude(Include.NON_NULL)
    private Integer failureCount;

    @JsonProperty("ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr ip;

    @JsonProperty("node_name")
    @JsonInclude(Include.NON_NULL)
    private String nodeName;



  /**
   * This is the getter method this will return the attribute value.
   * Number of failures.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return failureCount
   */
  @VsoMethod
  public Integer getFailureCount() {
    return failureCount;
  }

  /**
   * This is the setter method to the attribute.
   * Number of failures.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param failureCount set the failureCount.
   */
  @VsoMethod
  public void setFailureCount(Integer  failureCount) {
    this.failureCount = failureCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip address of the controller vm.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ip
   */
  @VsoMethod
  public IpAddr getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address of the controller vm.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of controller node.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodeName
   */
  @VsoMethod
  public String getNodeName() {
    return nodeName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of controller node.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nodeName set the nodeName.
   */
  @VsoMethod
  public void setNodeName(String  nodeName) {
    this.nodeName = nodeName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ClusterNodeDbFailedEvent objClusterNodeDbFailedEvent = (ClusterNodeDbFailedEvent) o;
  return   Objects.equals(this.nodeName, objClusterNodeDbFailedEvent.nodeName)&&
  Objects.equals(this.ip, objClusterNodeDbFailedEvent.ip)&&
  Objects.equals(this.failureCount, objClusterNodeDbFailedEvent.failureCount);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ClusterNodeDbFailedEvent {\n");
      sb.append("    failureCount: ").append(toIndentedString(failureCount)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
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

