package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ClusterNodeShutdownEvent is a POJO class extends AviRestResource that used for creating
 * ClusterNodeShutdownEvent.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ClusterNodeShutdownEvent")
@VsoFinder(name = Constants.FINDER_VRO_CLUSTERNODESHUTDOWNEVENT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ClusterNodeShutdownEvent extends AviRestResource {
    @JsonProperty("ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr ip;

    @JsonProperty("ip6")
    @JsonInclude(Include.NON_NULL)
    private IpAddr ip6;

    @JsonProperty("node_name")
    @JsonInclude(Include.NON_NULL)
    private String nodeName;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason;



  /**
   * This is the getter method this will return the attribute value.
   * Ipv4 address of the controller vm.
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
   * Ipv4 address of the controller vm.
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
   * Ipv6 address of the controller vm.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ip6
   */
  @VsoMethod
  public IpAddr getIp6() {
    return ip6;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv6 address of the controller vm.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ip6 set the ip6.
   */
  @VsoMethod
  public void setIp6(IpAddr ip6) {
    this.ip6 = ip6;
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

  /**
   * This is the getter method this will return the attribute value.
   * Reason for controller node shutdown.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason for controller node shutdown.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ClusterNodeShutdownEvent objClusterNodeShutdownEvent = (ClusterNodeShutdownEvent) o;
  return   Objects.equals(this.nodeName, objClusterNodeShutdownEvent.nodeName)&&
  Objects.equals(this.ip, objClusterNodeShutdownEvent.ip)&&
  Objects.equals(this.reason, objClusterNodeShutdownEvent.reason)&&
  Objects.equals(this.ip6, objClusterNodeShutdownEvent.ip6);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ClusterNodeShutdownEvent {\n");
      sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    ip6: ").append(toIndentedString(ip6)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

