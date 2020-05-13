package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * SeResources
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SeResources")
@VsoFinder(name = Constants.FINDER_VRO_SERESOURCES, idAccessor = "getObjectID()")
@Service
public class SeResources extends AviRestResource  {
  @JsonProperty("cores_per_socket")
  private Integer coresPerSocket = null;

  @JsonProperty("disk")
  private Integer disk = null;

  @JsonProperty("hyper_threading")
  private Boolean hyperThreading = null;

  @JsonProperty("memory")
  private Integer memory = null;

  @JsonProperty("num_vcpus")
  private Integer numVcpus = null;

  @JsonProperty("sockets")
  private Integer sockets = null;

  
  /**
   * Number of cores_per_socket.
   * @return coresPerSocket
  **/
  @ApiModelProperty(value = "Number of cores_per_socket.")


 
  @VsoMethod  
  public Integer getCoresPerSocket() {
    return coresPerSocket;
  }
    
  @VsoMethod
  public void setCoresPerSocket(Integer coresPerSocket) {
    this.coresPerSocket = coresPerSocket;
  }

  
  /**
   * Number of disk.
   * @return disk
  **/
  @ApiModelProperty(required = true, value = "Number of disk.")
  @NotNull


 
  @VsoMethod  
  public Integer getDisk() {
    return disk;
  }
    
  @VsoMethod
  public void setDisk(Integer disk) {
    this.disk = disk;
  }

  
  /**
   * Placeholder for description of property hyper_threading of obj type SeResources field type str  type boolean
   * @return hyperThreading
  **/
  @ApiModelProperty(value = "Placeholder for description of property hyper_threading of obj type SeResources field type str  type boolean")


 
  @VsoMethod  
  public Boolean isHyperThreading() {
    return hyperThreading;
  }
    
  @VsoMethod
  public void setHyperThreading(Boolean hyperThreading) {
    this.hyperThreading = hyperThreading;
  }

  
  /**
   * Number of memory.
   * @return memory
  **/
  @ApiModelProperty(required = true, value = "Number of memory.")
  @NotNull


 
  @VsoMethod  
  public Integer getMemory() {
    return memory;
  }
    
  @VsoMethod
  public void setMemory(Integer memory) {
    this.memory = memory;
  }

  
  /**
   * Number of num_vcpus.
   * @return numVcpus
  **/
  @ApiModelProperty(required = true, value = "Number of num_vcpus.")
  @NotNull


 
  @VsoMethod  
  public Integer getNumVcpus() {
    return numVcpus;
  }
    
  @VsoMethod
  public void setNumVcpus(Integer numVcpus) {
    this.numVcpus = numVcpus;
  }

  
  /**
   * Number of sockets.
   * @return sockets
  **/
  @ApiModelProperty(value = "Number of sockets.")


 
  @VsoMethod  
  public Integer getSockets() {
    return sockets;
  }
    
  @VsoMethod
  public void setSockets(Integer sockets) {
    this.sockets = sockets;
  }

  
  public String getObjectID() {
		return "SeResources";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeResources seResources = (SeResources) o;
    return Objects.equals(this.coresPerSocket, seResources.coresPerSocket) &&
        Objects.equals(this.disk, seResources.disk) &&
        Objects.equals(this.hyperThreading, seResources.hyperThreading) &&
        Objects.equals(this.memory, seResources.memory) &&
        Objects.equals(this.numVcpus, seResources.numVcpus) &&
        Objects.equals(this.sockets, seResources.sockets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coresPerSocket, disk, hyperThreading, memory, numVcpus, sockets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeResources {\n");
    
    sb.append("    coresPerSocket: ").append(toIndentedString(coresPerSocket)).append("\n");
    sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
    sb.append("    hyperThreading: ").append(toIndentedString(hyperThreading)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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

