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
 * SeRpcProxyDebugFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SeRpcProxyDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_SERPCPROXYDEBUGFILTER, idAccessor = "getObjectID()")
@Service
public class SeRpcProxyDebugFilter extends AviRestResource  {
  @JsonProperty("method_name")
  private String methodName = null;

  @JsonProperty("queue")
  private String queue = null;

  @JsonProperty("se_uuid")
  private String seUuid = null;

  
  /**
   * Method name of RPC. Field introduced in 18.1.5, 18.2.1.
   * @return methodName
  **/
  @ApiModelProperty(value = "Method name of RPC. Field introduced in 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public String getMethodName() {
    return methodName;
  }
    
  @VsoMethod
  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  
  /**
   * Queue name of RPC. Field introduced in 18.1.5, 18.2.1.
   * @return queue
  **/
  @ApiModelProperty(value = "Queue name of RPC. Field introduced in 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public String getQueue() {
    return queue;
  }
    
  @VsoMethod
  public void setQueue(String queue) {
    this.queue = queue;
  }

  
  /**
   * UUID of Service Engine. Field introduced in 18.1.5, 18.2.1.
   * @return seUuid
  **/
  @ApiModelProperty(value = "UUID of Service Engine. Field introduced in 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public String getSeUuid() {
    return seUuid;
  }
    
  @VsoMethod
  public void setSeUuid(String seUuid) {
    this.seUuid = seUuid;
  }

  
  public String getObjectID() {
		return "SeRpcProxyDebugFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeRpcProxyDebugFilter seRpcProxyDebugFilter = (SeRpcProxyDebugFilter) o;
    return Objects.equals(this.methodName, seRpcProxyDebugFilter.methodName) &&
        Objects.equals(this.queue, seRpcProxyDebugFilter.queue) &&
        Objects.equals(this.seUuid, seRpcProxyDebugFilter.seUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodName, queue, seUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeRpcProxyDebugFilter {\n");
    
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
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

