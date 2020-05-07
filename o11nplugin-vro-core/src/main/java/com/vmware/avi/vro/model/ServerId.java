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
 * ServerId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:16:36.466+05:30")

@VsoObject(create = false, name = "ServerId")
@VsoFinder(name = Constants.FINDER_VRO_SERVERID, idAccessor = "getObjectID()")
@Service
public class ServerId extends AviRestResource  {
  @JsonProperty("external_uuid")
  private String externalUuid = null;

  @JsonProperty("ip")
  private IpAddr ip = null;

  @JsonProperty("port")
  private Integer port = null;

  
  /**
   * This is the external cloud uuid of the Pool server.
   * @return externalUuid
  **/
  @ApiModelProperty(value = "This is the external cloud uuid of the Pool server.")


 
  @VsoMethod  
  public String getExternalUuid() {
    return externalUuid;
  }
    
  @VsoMethod
  public void setExternalUuid(String externalUuid) {
    this.externalUuid = externalUuid;
  }

  
  /**
   * Placeholder for description of property ip of obj type ServerId field type str  type object
   * @return ip
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property ip of obj type ServerId field type str  type object")
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
   * Number of port.
   * @return port
  **/
  @ApiModelProperty(required = true, value = "Number of port.")
  @NotNull


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  public String getObjectID() {
		return "ServerId";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerId serverId = (ServerId) o;
    return Objects.equals(this.externalUuid, serverId.externalUuid) &&
        Objects.equals(this.ip, serverId.ip) &&
        Objects.equals(this.port, serverId.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUuid, ip, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerId {\n");
    
    sb.append("    externalUuid: ").append(toIndentedString(externalUuid)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

