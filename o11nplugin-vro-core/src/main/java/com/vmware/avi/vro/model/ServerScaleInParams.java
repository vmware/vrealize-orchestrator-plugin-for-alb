package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.ServerId;
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
 * ServerScaleInParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ServerScaleInParams")
@VsoFinder(name = Constants.FINDER_VRO_SERVERSCALEINPARAMS, idAccessor = "getObjectID()")
@Service
public class ServerScaleInParams extends AviRestResource  {
  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("servers")
  @Valid
  private List<ServerId> servers = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * Reason for the manual scalein.
   * @return reason
  **/
  @ApiModelProperty(value = "Reason for the manual scalein.")


 
  @VsoMethod  
  public String getReason() {
    return reason;
  }
    
  @VsoMethod
  public void setReason(String reason) {
    this.reason = reason;
  }

  
  public ServerScaleInParams addServersItem(ServerId serversItem) {
    if (this.servers == null) {
      this.servers = new ArrayList<ServerId>();
    }
    this.servers.add(serversItem);
    return this;
  }
  
  /**
   * List of server IDs that should be scaled in.
   * @return servers
  **/
  @ApiModelProperty(value = "List of server IDs that should be scaled in.")

  @Valid

 
  @VsoMethod  
  public List<ServerId> getServers() {
    return servers;
  }
    
  @VsoMethod
  public void setServers(List<ServerId> servers) {
    this.servers = servers;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "ServerScaleInParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerScaleInParams serverScaleInParams = (ServerScaleInParams) o;
    return Objects.equals(this.reason, serverScaleInParams.reason) &&
        Objects.equals(this.servers, serverScaleInParams.servers) &&
        Objects.equals(this.uuid, serverScaleInParams.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, servers, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerScaleInParams {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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

