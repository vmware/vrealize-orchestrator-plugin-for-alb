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
 * HSMThalesRFS
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HSMThalesRFS")
@VsoFinder(name = Constants.FINDER_VRO_HSMTHALESRFS, idAccessor = "getObjectID()")
@Service
public class HSMThalesRFS extends AviRestResource  {
  @JsonProperty("ip")
  private IpAddr ip = null;

  @JsonProperty("port")
  private Integer port = 9004;

  
  /**
   * IP address of the RFS server from where to sync the Thales encrypted private key.
   * @return ip
  **/
  @ApiModelProperty(required = true, value = "IP address of the RFS server from where to sync the Thales encrypted private key.")
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
   * Port at which the RFS server accepts the sync request from clients for Thales encrypted private key. Allowed values are 1-65535.
   * @return port
  **/
  @ApiModelProperty(value = "Port at which the RFS server accepts the sync request from clients for Thales encrypted private key. Allowed values are 1-65535.")


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  public String getObjectID() {
		return "HSMThalesRFS";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HSMThalesRFS hsMThalesRFS = (HSMThalesRFS) o;
    return Objects.equals(this.ip, hsMThalesRFS.ip) &&
        Objects.equals(this.port, hsMThalesRFS.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HSMThalesRFS {\n");
    
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

