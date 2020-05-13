package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.OperationalStatus;
import com.vmware.avi.vro.model.SCServerStateInfo;
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
 * SCPoolServerStateInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SCPoolServerStateInfo")
@VsoFinder(name = Constants.FINDER_VRO_SCPOOLSERVERSTATEINFO, idAccessor = "getObjectID()")
@Service
public class SCPoolServerStateInfo extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("is_server")
  private Boolean isServer = null;

  @JsonProperty("oper_status")
  private OperationalStatus operStatus = null;

  @JsonProperty("pool_id")
  private String poolId = null;

  @JsonProperty("server_states")
  @Valid
  private List<SCServerStateInfo> serverStates = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   *  Field introduced in 17.1.1.
   * @return isServer
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isIsServer() {
    return isServer;
  }
    
  @VsoMethod
  public void setIsServer(Boolean isServer) {
    this.isServer = isServer;
  }

  
  /**
   *  Field introduced in 17.1.1.
   * @return operStatus
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public OperationalStatus getOperStatus() {
    return operStatus;
  }
    
  @VsoMethod
  public void setOperStatus(OperationalStatus operStatus) {
    this.operStatus = operStatus;
  }

  
  /**
   *  Field introduced in 17.1.1.
   * @return poolId
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getPoolId() {
    return poolId;
  }
    
  @VsoMethod
  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  
  public SCPoolServerStateInfo addServerStatesItem(SCServerStateInfo serverStatesItem) {
    if (this.serverStates == null) {
      this.serverStates = new ArrayList<SCServerStateInfo>();
    }
    this.serverStates.add(serverStatesItem);
    return this;
  }
  
  /**
   *  Field introduced in 17.1.1.
   * @return serverStates
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<SCServerStateInfo> getServerStates() {
    return serverStates;
  }
    
  @VsoMethod
  public void setServerStates(List<SCServerStateInfo> serverStates) {
    this.serverStates = serverStates;
  }

  
  /**
   *  It is a reference to an object of type Tenant. Field introduced in 17.1.1.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   *  Field introduced in 17.1.1.
   * @return uuid
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "SCPoolServerStateInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SCPoolServerStateInfo scPoolServerStateInfo = (SCPoolServerStateInfo) o;
    return Objects.equals(this.lastModified, scPoolServerStateInfo.lastModified) &&
        Objects.equals(this.isServer, scPoolServerStateInfo.isServer) &&
        Objects.equals(this.operStatus, scPoolServerStateInfo.operStatus) &&
        Objects.equals(this.poolId, scPoolServerStateInfo.poolId) &&
        Objects.equals(this.serverStates, scPoolServerStateInfo.serverStates) &&
        Objects.equals(this.tenantRef, scPoolServerStateInfo.tenantRef) &&
        Objects.equals(this.url, scPoolServerStateInfo.url) &&
        Objects.equals(this.uuid, scPoolServerStateInfo.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, isServer, operStatus, poolId, serverStates, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SCPoolServerStateInfo {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    isServer: ").append(toIndentedString(isServer)).append("\n");
    sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    serverStates: ").append(toIndentedString(serverStates)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

