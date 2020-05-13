package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HostAttributes;
import com.vmware.avi.vro.model.IpAddr;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * LinuxServerHost
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "LinuxServerHost")
@VsoFinder(name = Constants.FINDER_VRO_LINUXSERVERHOST, idAccessor = "getObjectID()")
@Service
public class LinuxServerHost extends AviRestResource  {
  @JsonProperty("host_attr")
  @Valid
  private List<HostAttributes> hostAttr = null;

  @JsonProperty("host_ip")
  private IpAddr hostIp = null;

  @JsonProperty("node_availability_zone")
  private String nodeAvailabilityZone = null;

  @JsonProperty("se_group_ref")
  private String seGroupRef = null;

  
  public LinuxServerHost addHostAttrItem(HostAttributes hostAttrItem) {
    if (this.hostAttr == null) {
      this.hostAttr = new ArrayList<HostAttributes>();
    }
    this.hostAttr.add(hostAttrItem);
    return this;
  }
  
  /**
   * Placeholder for description of property host_attr of obj type LinuxServerHost field type str  type object
   * @return hostAttr
  **/
  @ApiModelProperty(value = "Placeholder for description of property host_attr of obj type LinuxServerHost field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<HostAttributes> getHostAttr() {
    return hostAttr;
  }
    
  @VsoMethod
  public void setHostAttr(List<HostAttributes> hostAttr) {
    this.hostAttr = hostAttr;
  }

  
  /**
   * Placeholder for description of property host_ip of obj type LinuxServerHost field type str  type object
   * @return hostIp
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property host_ip of obj type LinuxServerHost field type str  type object")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddr getHostIp() {
    return hostIp;
  }
    
  @VsoMethod
  public void setHostIp(IpAddr hostIp) {
    this.hostIp = hostIp;
  }

  
  /**
   * Node's availability zone. ServiceEngines belonging to the availability zone will be rebooted during a manual DR failover.
   * @return nodeAvailabilityZone
  **/
  @ApiModelProperty(value = "Node's availability zone. ServiceEngines belonging to the availability zone will be rebooted during a manual DR failover.")


 
  @VsoMethod  
  public String getNodeAvailabilityZone() {
    return nodeAvailabilityZone;
  }
    
  @VsoMethod
  public void setNodeAvailabilityZone(String nodeAvailabilityZone) {
    this.nodeAvailabilityZone = nodeAvailabilityZone;
  }

  
  /**
   * The SE Group association for the SE. If None, then 'Default-Group' SEGroup is associated with the SE. It is a reference to an object of type ServiceEngineGroup. Field introduced in 17.2.1.
   * @return seGroupRef
  **/
  @ApiModelProperty(value = "The SE Group association for the SE. If None, then 'Default-Group' SEGroup is associated with the SE. It is a reference to an object of type ServiceEngineGroup. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getSeGroupRef() {
    return seGroupRef;
  }
    
  @VsoMethod
  public void setSeGroupRef(String seGroupRef) {
    this.seGroupRef = seGroupRef;
  }

  
  public String getObjectID() {
		return "LinuxServerHost";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinuxServerHost linuxServerHost = (LinuxServerHost) o;
    return Objects.equals(this.hostAttr, linuxServerHost.hostAttr) &&
        Objects.equals(this.hostIp, linuxServerHost.hostIp) &&
        Objects.equals(this.nodeAvailabilityZone, linuxServerHost.nodeAvailabilityZone) &&
        Objects.equals(this.seGroupRef, linuxServerHost.seGroupRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostAttr, hostIp, nodeAvailabilityZone, seGroupRef);
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

