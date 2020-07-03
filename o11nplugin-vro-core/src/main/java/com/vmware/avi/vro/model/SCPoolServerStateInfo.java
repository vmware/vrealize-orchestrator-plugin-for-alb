package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.OperationalStatus;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SCPoolServerStateInfo is a POJO class extends AviRestResource that used for creating
 * SCPoolServerStateInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SCPoolServerStateInfo")
@VsoFinder(name = Constants.FINDER_VRO_SCPOOLSERVERSTATEINFO, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SCPoolServerStateInfo extends AviRestResource {
  @JsonProperty("is_server")
  @JsonInclude(Include.NON_NULL)
  private Boolean isServer = false;

  @JsonProperty("oper_status")
  @JsonInclude(Include.NON_NULL)
  private OperationalStatus operStatus = null;

  @JsonProperty("pool_id")
  @JsonInclude(Include.NON_NULL)
  private String poolId = null;

  @JsonProperty("server_states")
  @JsonInclude(Include.NON_NULL)
  private List<SCServerStateInfo> serverStates = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isServer
   */
  @VsoMethod
  public Boolean getIsServer() {
    return isServer;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isServer set the isServer.
   */
  @VsoMethod
  public void setIsServer(Boolean  isServer) {
    this.isServer = isServer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * @return operStatus
   */
  @VsoMethod
  public OperationalStatus getOperStatus() {
    return operStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * @param operStatus set the operStatus.
   */
  @VsoMethod
  public void setOperStatus(OperationalStatus operStatus) {
    this.operStatus = operStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * @return poolId
   */
  @VsoMethod
  public String getPoolId() {
    return poolId;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * @param poolId set the poolId.
   */
  @VsoMethod
  public void setPoolId(String  poolId) {
    this.poolId = poolId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * @return serverStates
   */
  @VsoMethod
  public List<SCServerStateInfo> getServerStates() {
    return serverStates;
  }

  /**
   * This is the setter method. this will set the serverStates
   * Field introduced in 17.1.1.
   * @return serverStates
   */
  @VsoMethod
  public void setServerStates(List<SCServerStateInfo>  serverStates) {
    this.serverStates = serverStates;
  }

  /**
   * This is the setter method this will set the serverStates
   * Field introduced in 17.1.1.
   * @return serverStates
   */
  @VsoMethod
  public SCPoolServerStateInfo addServerStatesItem(SCServerStateInfo serverStatesItem) {
    if (this.serverStates == null) {
      this.serverStates = new ArrayList<SCServerStateInfo>();
    }
    this.serverStates.add(serverStatesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Field introduced in 17.1.1.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * Field introduced in 17.1.1.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return "SCPoolServerStateInfo" + "(" + uuid + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SCPoolServerStateInfo objSCPoolServerStateInfo = (SCPoolServerStateInfo) o;
  return   Objects.equals(this.uuid, objSCPoolServerStateInfo.uuid)&&
  Objects.equals(this.poolId, objSCPoolServerStateInfo.poolId)&&
  Objects.equals(this.isServer, objSCPoolServerStateInfo.isServer)&&
  Objects.equals(this.operStatus, objSCPoolServerStateInfo.operStatus)&&
  Objects.equals(this.tenantRef, objSCPoolServerStateInfo.tenantRef)&&
  Objects.equals(this.serverStates, objSCPoolServerStateInfo.serverStates);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SCPoolServerStateInfo {\n");
      sb.append("    isServer: ").append(toIndentedString(isServer)).append("\n");
        sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    serverStates: ").append(toIndentedString(serverStates)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
