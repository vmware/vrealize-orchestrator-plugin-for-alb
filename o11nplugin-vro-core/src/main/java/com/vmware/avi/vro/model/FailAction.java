package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.FailActionBackupPool;
import com.vmware.avi.vro.model.FailActionHTTPLocalResponse;
import com.vmware.avi.vro.model.FailActionHTTPRedirect;
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
 * FailAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:16:36.466+05:30")

@VsoObject(create = false, name = "FailAction")
@VsoFinder(name = Constants.FINDER_VRO_FAILACTION, idAccessor = "getObjectID()")
@Service
public class FailAction extends AviRestResource  {
  @JsonProperty("backup_pool")
  private FailActionBackupPool backupPool = null;

  @JsonProperty("local_rsp")
  private FailActionHTTPLocalResponse localRsp = null;

  @JsonProperty("redirect")
  private FailActionHTTPRedirect redirect = null;

  @JsonProperty("type")
  private String type = "FAIL_ACTION_CLOSE_CONN";

  
  /**
   * Backup Pool when pool experiences a failure. Field deprecated in 18.1.2.
   * @return backupPool
  **/
  @ApiModelProperty(value = "Backup Pool when pool experiences a failure. Field deprecated in 18.1.2.")

  @Valid

 
  @VsoMethod  
  public FailActionBackupPool getBackupPool() {
    return backupPool;
  }
    
  @VsoMethod
  public void setBackupPool(FailActionBackupPool backupPool) {
    this.backupPool = backupPool;
  }

  
  /**
   * Local response to HTTP requests when pool experiences a failure.
   * @return localRsp
  **/
  @ApiModelProperty(value = "Local response to HTTP requests when pool experiences a failure.")

  @Valid

 
  @VsoMethod  
  public FailActionHTTPLocalResponse getLocalRsp() {
    return localRsp;
  }
    
  @VsoMethod
  public void setLocalRsp(FailActionHTTPLocalResponse localRsp) {
    this.localRsp = localRsp;
  }

  
  /**
   * URL to redirect HTTP requests to when pool experiences a failure.
   * @return redirect
  **/
  @ApiModelProperty(value = "URL to redirect HTTP requests to when pool experiences a failure.")

  @Valid

 
  @VsoMethod  
  public FailActionHTTPRedirect getRedirect() {
    return redirect;
  }
    
  @VsoMethod
  public void setRedirect(FailActionHTTPRedirect redirect) {
    this.redirect = redirect;
  }

  
  /**
   * Enables a response to client when pool experiences a failure. By default TCP connection is closed. Enum options - FAIL_ACTION_HTTP_REDIRECT, FAIL_ACTION_HTTP_LOCAL_RSP, FAIL_ACTION_CLOSE_CONN, FAIL_ACTION_BACKUP_POOL.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Enables a response to client when pool experiences a failure. By default TCP connection is closed. Enum options - FAIL_ACTION_HTTP_REDIRECT, FAIL_ACTION_HTTP_LOCAL_RSP, FAIL_ACTION_CLOSE_CONN, FAIL_ACTION_BACKUP_POOL.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "FailAction";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailAction failAction = (FailAction) o;
    return Objects.equals(this.backupPool, failAction.backupPool) &&
        Objects.equals(this.localRsp, failAction.localRsp) &&
        Objects.equals(this.redirect, failAction.redirect) &&
        Objects.equals(this.type, failAction.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupPool, localRsp, redirect, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailAction {\n");
    
    sb.append("    backupPool: ").append(toIndentedString(backupPool)).append("\n");
    sb.append("    localRsp: ").append(toIndentedString(localRsp)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

