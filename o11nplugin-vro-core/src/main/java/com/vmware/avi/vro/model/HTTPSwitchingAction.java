package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HTTPLocalFile;
import com.vmware.avi.vro.model.PoolServer;
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
 * HTTPSwitchingAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPSwitchingAction")
@VsoFinder(name = Constants.FINDER_VRO_HTTPSWITCHINGACTION, idAccessor = "getObjectID()")
@Service
public class HTTPSwitchingAction extends AviRestResource  {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("file")
  private HTTPLocalFile file = null;

  @JsonProperty("pool_group_ref")
  private String poolGroupRef = null;

  @JsonProperty("pool_ref")
  private String poolRef = null;

  @JsonProperty("server")
  private PoolServer server = null;

  @JsonProperty("status_code")
  private String statusCode = null;

  
  /**
   * Content switching action type. Enum options - HTTP_SWITCHING_SELECT_POOL, HTTP_SWITCHING_SELECT_LOCAL, HTTP_SWITCHING_SELECT_POOLGROUP.
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Content switching action type. Enum options - HTTP_SWITCHING_SELECT_POOL, HTTP_SWITCHING_SELECT_LOCAL, HTTP_SWITCHING_SELECT_POOLGROUP.")
  @NotNull


 
  @VsoMethod  
  public String getAction() {
    return action;
  }
    
  @VsoMethod
  public void setAction(String action) {
    this.action = action;
  }

  
  /**
   * File from which to serve local response to the request.
   * @return file
  **/
  @ApiModelProperty(value = "File from which to serve local response to the request.")

  @Valid

 
  @VsoMethod  
  public HTTPLocalFile getFile() {
    return file;
  }
    
  @VsoMethod
  public void setFile(HTTPLocalFile file) {
    this.file = file;
  }

  
  /**
   * UUID of the pool group to serve the request. It is a reference to an object of type PoolGroup.
   * @return poolGroupRef
  **/
  @ApiModelProperty(value = "UUID of the pool group to serve the request. It is a reference to an object of type PoolGroup.")


 
  @VsoMethod  
  public String getPoolGroupRef() {
    return poolGroupRef;
  }
    
  @VsoMethod
  public void setPoolGroupRef(String poolGroupRef) {
    this.poolGroupRef = poolGroupRef;
  }

  
  /**
   * UUID of the pool of servers to serve the request. It is a reference to an object of type Pool.
   * @return poolRef
  **/
  @ApiModelProperty(value = "UUID of the pool of servers to serve the request. It is a reference to an object of type Pool.")


 
  @VsoMethod  
  public String getPoolRef() {
    return poolRef;
  }
    
  @VsoMethod
  public void setPoolRef(String poolRef) {
    this.poolRef = poolRef;
  }

  
  /**
   * Specific pool server to select.
   * @return server
  **/
  @ApiModelProperty(value = "Specific pool server to select.")

  @Valid

 
  @VsoMethod  
  public PoolServer getServer() {
    return server;
  }
    
  @VsoMethod
  public void setServer(PoolServer server) {
    this.server = server;
  }

  
  /**
   * HTTP status code to use when serving local response. Enum options - HTTP_LOCAL_RESPONSE_STATUS_CODE_200, HTTP_LOCAL_RESPONSE_STATUS_CODE_204, HTTP_LOCAL_RESPONSE_STATUS_CODE_403, HTTP_LOCAL_RESPONSE_STATUS_CODE_404, HTTP_LOCAL_RESPONSE_STATUS_CODE_429, HTTP_LOCAL_RESPONSE_STATUS_CODE_501.
   * @return statusCode
  **/
  @ApiModelProperty(value = "HTTP status code to use when serving local response. Enum options - HTTP_LOCAL_RESPONSE_STATUS_CODE_200, HTTP_LOCAL_RESPONSE_STATUS_CODE_204, HTTP_LOCAL_RESPONSE_STATUS_CODE_403, HTTP_LOCAL_RESPONSE_STATUS_CODE_404, HTTP_LOCAL_RESPONSE_STATUS_CODE_429, HTTP_LOCAL_RESPONSE_STATUS_CODE_501.")


 
  @VsoMethod  
  public String getStatusCode() {
    return statusCode;
  }
    
  @VsoMethod
  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  
  public String getObjectID() {
		return "HTTPSwitchingAction";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPSwitchingAction htTPSwitchingAction = (HTTPSwitchingAction) o;
    return Objects.equals(this.action, htTPSwitchingAction.action) &&
        Objects.equals(this.file, htTPSwitchingAction.file) &&
        Objects.equals(this.poolGroupRef, htTPSwitchingAction.poolGroupRef) &&
        Objects.equals(this.poolRef, htTPSwitchingAction.poolRef) &&
        Objects.equals(this.server, htTPSwitchingAction.server) &&
        Objects.equals(this.statusCode, htTPSwitchingAction.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, file, poolGroupRef, poolRef, server, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPSwitchingAction {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    poolGroupRef: ").append(toIndentedString(poolGroupRef)).append("\n");
    sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

