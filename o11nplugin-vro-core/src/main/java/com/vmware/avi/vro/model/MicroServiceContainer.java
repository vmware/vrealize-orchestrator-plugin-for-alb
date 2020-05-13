package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
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
 * MicroServiceContainer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "MicroServiceContainer")
@VsoFinder(name = Constants.FINDER_VRO_MICROSERVICECONTAINER, idAccessor = "getObjectID()")
@Service
public class MicroServiceContainer extends AviRestResource  {
  @JsonProperty("container_id")
  private String containerId = null;

  @JsonProperty("host")
  private String host = null;

  @JsonProperty("ip")
  private IpAddr ip = null;

  @JsonProperty("port")
  private Integer port = null;

  @JsonProperty("task_id")
  private String taskId = null;

  
  /**
   * ID of the container.
   * @return containerId
  **/
  @ApiModelProperty(value = "ID of the container.")


 
  @VsoMethod  
  public String getContainerId() {
    return containerId;
  }
    
  @VsoMethod
  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  
  /**
   * ID or name of the host where the container is.
   * @return host
  **/
  @ApiModelProperty(value = "ID or name of the host where the container is.")


 
  @VsoMethod  
  public String getHost() {
    return host;
  }
    
  @VsoMethod
  public void setHost(String host) {
    this.host = host;
  }

  
  /**
   * IP Address of the container.
   * @return ip
  **/
  @ApiModelProperty(required = true, value = "IP Address of the container.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddr getIp() {
    return ip;
  }
    
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  
  /**
   * Port nunber of the instance.
   * @return port
  **/
  @ApiModelProperty(value = "Port nunber of the instance.")


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  /**
   * Marathon Task ID of the instance.
   * @return taskId
  **/
  @ApiModelProperty(value = "Marathon Task ID of the instance.")


 
  @VsoMethod  
  public String getTaskId() {
    return taskId;
  }
    
  @VsoMethod
  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  
  public String getObjectID() {
		return "MicroServiceContainer";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicroServiceContainer microServiceContainer = (MicroServiceContainer) o;
    return Objects.equals(this.containerId, microServiceContainer.containerId) &&
        Objects.equals(this.host, microServiceContainer.host) &&
        Objects.equals(this.ip, microServiceContainer.ip) &&
        Objects.equals(this.port, microServiceContainer.port) &&
        Objects.equals(this.taskId, microServiceContainer.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerId, host, ip, port, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicroServiceContainer {\n");
    
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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

