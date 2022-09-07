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
 * The SeResources is a POJO class extends AviRestResource that used for creating
 * SeResources.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeResources")
@VsoFinder(name = Constants.FINDER_VRO_SERESOURCES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeResources extends AviRestResource {
    @JsonProperty("cores_per_socket")
    @JsonInclude(Include.NON_NULL)
    private Integer coresPerSocket = null;

    @JsonProperty("disk")
    @JsonInclude(Include.NON_NULL)
    private Integer disk = null;

    @JsonProperty("hyper_threading")
    @JsonInclude(Include.NON_NULL)
    private Boolean hyperThreading = null;

    @JsonProperty("hypervisor_mode")
    @JsonInclude(Include.NON_NULL)
    private Boolean hypervisorMode = null;

    @JsonProperty("memory")
    @JsonInclude(Include.NON_NULL)
    private Integer memory = null;

    @JsonProperty("num_datapath_processes")
    @JsonInclude(Include.NON_NULL)
    private Integer numDatapathProcesses = null;

    @JsonProperty("num_vcpus")
    @JsonInclude(Include.NON_NULL)
    private Integer numVcpus = null;

    @JsonProperty("sockets")
    @JsonInclude(Include.NON_NULL)
    private Integer sockets = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return coresPerSocket
   */
  @VsoMethod
  public Integer getCoresPerSocket() {
    return coresPerSocket;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param coresPerSocket set the coresPerSocket.
   */
  @VsoMethod
  public void setCoresPerSocket(Integer  coresPerSocket) {
    this.coresPerSocket = coresPerSocket;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return disk
   */
  @VsoMethod
  public Integer getDisk() {
    return disk;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param disk set the disk.
   */
  @VsoMethod
  public void setDisk(Integer  disk) {
    this.disk = disk;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hyperThreading
   */
  @VsoMethod
  public Boolean getHyperThreading() {
    return hyperThreading;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hyperThreading set the hyperThreading.
   */
  @VsoMethod
  public void setHyperThreading(Boolean  hyperThreading) {
    this.hyperThreading = hyperThreading;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Indicates that the se is running on a virtual machine.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hypervisorMode
   */
  @VsoMethod
  public Boolean getHypervisorMode() {
    return hypervisorMode;
  }

  /**
   * This is the setter method to the attribute.
   * Indicates that the se is running on a virtual machine.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hypervisorMode set the hypervisorMode.
   */
  @VsoMethod
  public void setHypervisorMode(Boolean  hypervisorMode) {
    this.hypervisorMode = hypervisorMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return memory
   */
  @VsoMethod
  public Integer getMemory() {
    return memory;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param memory set the memory.
   */
  @VsoMethod
  public void setMemory(Integer  memory) {
    this.memory = memory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Indicates the number of active datapath processes.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numDatapathProcesses
   */
  @VsoMethod
  public Integer getNumDatapathProcesses() {
    return numDatapathProcesses;
  }

  /**
   * This is the setter method to the attribute.
   * Indicates the number of active datapath processes.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numDatapathProcesses set the numDatapathProcesses.
   */
  @VsoMethod
  public void setNumDatapathProcesses(Integer  numDatapathProcesses) {
    this.numDatapathProcesses = numDatapathProcesses;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numVcpus
   */
  @VsoMethod
  public Integer getNumVcpus() {
    return numVcpus;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numVcpus set the numVcpus.
   */
  @VsoMethod
  public void setNumVcpus(Integer  numVcpus) {
    this.numVcpus = numVcpus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sockets
   */
  @VsoMethod
  public Integer getSockets() {
    return sockets;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sockets set the sockets.
   */
  @VsoMethod
  public void setSockets(Integer  sockets) {
    this.sockets = sockets;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeResources objSeResources = (SeResources) o;
  return   Objects.equals(this.numVcpus, objSeResources.numVcpus)&&
  Objects.equals(this.memory, objSeResources.memory)&&
  Objects.equals(this.disk, objSeResources.disk)&&
  Objects.equals(this.hyperThreading, objSeResources.hyperThreading)&&
  Objects.equals(this.sockets, objSeResources.sockets)&&
  Objects.equals(this.coresPerSocket, objSeResources.coresPerSocket)&&
  Objects.equals(this.hypervisorMode, objSeResources.hypervisorMode)&&
  Objects.equals(this.numDatapathProcesses, objSeResources.numDatapathProcesses);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeResources {\n");
      sb.append("    coresPerSocket: ").append(toIndentedString(coresPerSocket)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
        sb.append("    hyperThreading: ").append(toIndentedString(hyperThreading)).append("\n");
        sb.append("    hypervisorMode: ").append(toIndentedString(hypervisorMode)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    numDatapathProcesses: ").append(toIndentedString(numDatapathProcesses)).append("\n");
        sb.append("    numVcpus: ").append(toIndentedString(numVcpus)).append("\n");
        sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
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

