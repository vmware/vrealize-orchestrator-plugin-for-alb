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
 * The LinuxServerHost is a POJO class extends AviRestResource that used for creating
 * LinuxServerHost.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LinuxServerHost")
@VsoFinder(name = Constants.FINDER_VRO_LINUXSERVERHOST)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LinuxServerHost extends AviRestResource {
    @JsonProperty("host_attr")
    @JsonInclude(Include.NON_NULL)
    private List<HostAttributes> hostAttr;

    @JsonProperty("host_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr hostIp;

    @JsonProperty("node_availability_zone")
    @JsonInclude(Include.NON_NULL)
    private String nodeAvailabilityZone;

    @JsonProperty("se_group_ref")
    @JsonInclude(Include.NON_NULL)
    private String seGroupRef;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostAttr
   */
  @VsoMethod
  public List<HostAttributes> getHostAttr() {
    return hostAttr;
  }

  /**
   * This is the setter method. this will set the hostAttr
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostAttr
   */
  @VsoMethod
  public void setHostAttr(List<HostAttributes>  hostAttr) {
    this.hostAttr = hostAttr;
  }

  /**
   * This is the setter method this will set the hostAttr
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostAttr
   */
  @VsoMethod
  public LinuxServerHost addHostAttrItem(HostAttributes hostAttrItem) {
    if (this.hostAttr == null) {
      this.hostAttr = new ArrayList<HostAttributes>();
    }
    this.hostAttr.add(hostAttrItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostIp
   */
  @VsoMethod
  public IpAddr getHostIp() {
    return hostIp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostIp set the hostIp.
   */
  @VsoMethod
  public void setHostIp(IpAddr hostIp) {
    this.hostIp = hostIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Node's availability zone.
   * Serviceengines belonging to the availability zone will be rebooted during a manual dr failover.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodeAvailabilityZone
   */
  @VsoMethod
  public String getNodeAvailabilityZone() {
    return nodeAvailabilityZone;
  }

  /**
   * This is the setter method to the attribute.
   * Node's availability zone.
   * Serviceengines belonging to the availability zone will be rebooted during a manual dr failover.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nodeAvailabilityZone set the nodeAvailabilityZone.
   */
  @VsoMethod
  public void setNodeAvailabilityZone(String  nodeAvailabilityZone) {
    this.nodeAvailabilityZone = nodeAvailabilityZone;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The se group association for the se.
   * If none, then 'default-group' segroup is associated with the se.
   * It is a reference to an object of type serviceenginegroup.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupRef
   */
  @VsoMethod
  public String getSeGroupRef() {
    return seGroupRef;
  }

  /**
   * This is the setter method to the attribute.
   * The se group association for the se.
   * If none, then 'default-group' segroup is associated with the se.
   * It is a reference to an object of type serviceenginegroup.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGroupRef set the seGroupRef.
   */
  @VsoMethod
  public void setSeGroupRef(String  seGroupRef) {
    this.seGroupRef = seGroupRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LinuxServerHost objLinuxServerHost = (LinuxServerHost) o;
  return   Objects.equals(this.hostIp, objLinuxServerHost.hostIp)&&
  Objects.equals(this.hostAttr, objLinuxServerHost.hostAttr)&&
  Objects.equals(this.nodeAvailabilityZone, objLinuxServerHost.nodeAvailabilityZone)&&
  Objects.equals(this.seGroupRef, objLinuxServerHost.seGroupRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LinuxServerHost {\n");
      sb.append("    hostAttr: ").append(toIndentedString(hostAttr)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    nodeAvailabilityZone: ").append(toIndentedString(nodeAvailabilityZone)).append("\n");
        sb.append("    seGroupRef: ").append(toIndentedString(seGroupRef)).append("\n");
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

