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
 * CCProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CCProperties")
@VsoFinder(name = Constants.FINDER_VRO_CCPROPERTIES, idAccessor = "getObjectID()")
@Service
public class CCProperties extends AviRestResource  {
  @JsonProperty("rpc_poll_interval")
  private Integer rpcPollInterval = 60;

  @JsonProperty("rpc_queue_size")
  private Integer rpcQueueSize = 100;

  
  /**
   * Number of rpc_poll_interval.
   * @return rpcPollInterval
  **/
  @ApiModelProperty(value = "Number of rpc_poll_interval.")


 
  @VsoMethod  
  public Integer getRpcPollInterval() {
    return rpcPollInterval;
  }
    
  @VsoMethod
  public void setRpcPollInterval(Integer rpcPollInterval) {
    this.rpcPollInterval = rpcPollInterval;
  }

  
  /**
   * Number of rpc_queue_size.
   * @return rpcQueueSize
  **/
  @ApiModelProperty(value = "Number of rpc_queue_size.")


 
  @VsoMethod  
  public Integer getRpcQueueSize() {
    return rpcQueueSize;
  }
    
  @VsoMethod
  public void setRpcQueueSize(Integer rpcQueueSize) {
    this.rpcQueueSize = rpcQueueSize;
  }

  
  public String getObjectID() {
		return "CCProperties";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CCProperties ccProperties = (CCProperties) o;
    return Objects.equals(this.rpcPollInterval, ccProperties.rpcPollInterval) &&
        Objects.equals(this.rpcQueueSize, ccProperties.rpcQueueSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rpcPollInterval, rpcQueueSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CCProperties {\n");
    
    sb.append("    rpcPollInterval: ").append(toIndentedString(rpcPollInterval)).append("\n");
    sb.append("    rpcQueueSize: ").append(toIndentedString(rpcQueueSize)).append("\n");
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

