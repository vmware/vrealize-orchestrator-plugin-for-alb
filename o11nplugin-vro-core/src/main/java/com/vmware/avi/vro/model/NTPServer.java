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
 * NTPServer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NTPServer")
@VsoFinder(name = Constants.FINDER_VRO_NTPSERVER, idAccessor = "getObjectID()")
@Service
public class NTPServer extends AviRestResource  {
  @JsonProperty("key_number")
  private Integer keyNumber = null;

  @JsonProperty("server")
  private IpAddr server = null;

  
  /**
   * Key number from the list of trusted keys used to authenticate this server. Allowed values are 1-65534.
   * @return keyNumber
  **/
  @ApiModelProperty(value = "Key number from the list of trusted keys used to authenticate this server. Allowed values are 1-65534.")


 
  @VsoMethod  
  public Integer getKeyNumber() {
    return keyNumber;
  }
    
  @VsoMethod
  public void setKeyNumber(Integer keyNumber) {
    this.keyNumber = keyNumber;
  }

  
  /**
   * IP Address of the NTP Server.
   * @return server
  **/
  @ApiModelProperty(required = true, value = "IP Address of the NTP Server.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddr getServer() {
    return server;
  }
    
  @VsoMethod
  public void setServer(IpAddr server) {
    this.server = server;
  }

  
  public String getObjectID() {
		return "NTPServer";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NTPServer ntPServer = (NTPServer) o;
    return Objects.equals(this.keyNumber, ntPServer.keyNumber) &&
        Objects.equals(this.server, ntPServer.server);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyNumber, server);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NTPServer {\n");
    
    sb.append("    keyNumber: ").append(toIndentedString(keyNumber)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
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

