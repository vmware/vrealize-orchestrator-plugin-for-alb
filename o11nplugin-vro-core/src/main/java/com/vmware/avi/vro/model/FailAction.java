package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.FailActionBackupPool;
import com.vmware.avi.vro.model.FailActionHTTPLocalResponse;
import com.vmware.avi.vro.model.FailActionHTTPRedirect;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The FailAction is a POJO class extends AviRestResource that used for creating
 * FailAction.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "FailAction")
@VsoFinder(name = Constants.FINDER_VRO_FAILACTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class FailAction extends AviRestResource {
    @JsonProperty("backup_pool")
    @JsonInclude(Include.NON_NULL)
    private FailActionBackupPool backupPool;

    @JsonProperty("local_rsp")
    @JsonInclude(Include.NON_NULL)
    private FailActionHTTPLocalResponse localRsp = null;

    @JsonProperty("redirect")
    @JsonInclude(Include.NON_NULL)
    private FailActionHTTPRedirect redirect = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = "FAIL_ACTION_CLOSE_CONN";



  /**
   * This is the getter method this will return the attribute value.
   * Backup pool when pool experiences a failure.
   * Field deprecated in 18.1.2.
   * @return backupPool
   */
  @VsoMethod
  public FailActionBackupPool getBackupPool() {
    return backupPool;
  }

  /**
   * This is the setter method to the attribute.
   * Backup pool when pool experiences a failure.
   * Field deprecated in 18.1.2.
   * @param backupPool set the backupPool.
   */
  @VsoMethod
  public void setBackupPool(FailActionBackupPool backupPool) {
    this.backupPool = backupPool;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Local response to http requests when pool experiences a failure.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return localRsp
   */
  @VsoMethod
  public FailActionHTTPLocalResponse getLocalRsp() {
    return localRsp;
  }

  /**
   * This is the setter method to the attribute.
   * Local response to http requests when pool experiences a failure.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param localRsp set the localRsp.
   */
  @VsoMethod
  public void setLocalRsp(FailActionHTTPLocalResponse localRsp) {
    this.localRsp = localRsp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Url to redirect http requests to when pool experiences a failure.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return redirect
   */
  @VsoMethod
  public FailActionHTTPRedirect getRedirect() {
    return redirect;
  }

  /**
   * This is the setter method to the attribute.
   * Url to redirect http requests to when pool experiences a failure.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param redirect set the redirect.
   */
  @VsoMethod
  public void setRedirect(FailActionHTTPRedirect redirect) {
    this.redirect = redirect;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enables a response to client when pool experiences a failure.
   * By default tcp connection is closed.
   * Enum options - FAIL_ACTION_HTTP_REDIRECT, FAIL_ACTION_HTTP_LOCAL_RSP, FAIL_ACTION_CLOSE_CONN, FAIL_ACTION_BACKUP_POOL.
   * Default value when not specified in API or module is interpreted by Avi Controller as "FAIL_ACTION_CLOSE_CONN".
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Enables a response to client when pool experiences a failure.
   * By default tcp connection is closed.
   * Enum options - FAIL_ACTION_HTTP_REDIRECT, FAIL_ACTION_HTTP_LOCAL_RSP, FAIL_ACTION_CLOSE_CONN, FAIL_ACTION_BACKUP_POOL.
   * Default value when not specified in API or module is interpreted by Avi Controller as "FAIL_ACTION_CLOSE_CONN".
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  FailAction objFailAction = (FailAction) o;
  return   Objects.equals(this.type, objFailAction.type)&&
  Objects.equals(this.redirect, objFailAction.redirect)&&
  Objects.equals(this.localRsp, objFailAction.localRsp)&&
  Objects.equals(this.backupPool, objFailAction.backupPool);
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

