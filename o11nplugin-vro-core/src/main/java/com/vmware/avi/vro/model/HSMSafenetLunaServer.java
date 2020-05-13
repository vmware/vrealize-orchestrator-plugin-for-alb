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
 * HSMSafenetLunaServer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HSMSafenetLunaServer")
@VsoFinder(name = Constants.FINDER_VRO_HSMSAFENETLUNASERVER, idAccessor = "getObjectID()")
@Service
public class HSMSafenetLunaServer extends AviRestResource  {
  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("partition_passwd")
  private String partitionPasswd = null;

  @JsonProperty("partition_serial_number")
  private String partitionSerialNumber = null;

  @JsonProperty("remote_ip")
  private String remoteIp = null;

  @JsonProperty("server_cert")
  private String serverCert = null;

  
  /**
   *  Field introduced in 16.5.2,17.2.3.
   * @return index
  **/
  @ApiModelProperty(required = true, value = " Field introduced in 16.5.2,17.2.3.")
  @NotNull


 
  @VsoMethod  
  public Integer getIndex() {
    return index;
  }
    
  @VsoMethod
  public void setIndex(Integer index) {
    this.index = index;
  }

  
  /**
   * Password of the partition assigned to this client.
   * @return partitionPasswd
  **/
  @ApiModelProperty(value = "Password of the partition assigned to this client.")


 
  @VsoMethod  
  public String getPartitionPasswd() {
    return partitionPasswd;
  }
    
  @VsoMethod
  public void setPartitionPasswd(String partitionPasswd) {
    this.partitionPasswd = partitionPasswd;
  }

  
  /**
   * Serial number of the partition assigned to this client. Field introduced in 16.5.2,17.2.3.
   * @return partitionSerialNumber
  **/
  @ApiModelProperty(value = "Serial number of the partition assigned to this client. Field introduced in 16.5.2,17.2.3.")


 
  @VsoMethod  
  public String getPartitionSerialNumber() {
    return partitionSerialNumber;
  }
    
  @VsoMethod
  public void setPartitionSerialNumber(String partitionSerialNumber) {
    this.partitionSerialNumber = partitionSerialNumber;
  }

  
  /**
   * IP address of the Safenet/Gemalto HSM device.
   * @return remoteIp
  **/
  @ApiModelProperty(required = true, value = "IP address of the Safenet/Gemalto HSM device.")
  @NotNull


 
  @VsoMethod  
  public String getRemoteIp() {
    return remoteIp;
  }
    
  @VsoMethod
  public void setRemoteIp(String remoteIp) {
    this.remoteIp = remoteIp;
  }

  
  /**
   * CA certificate of the server.
   * @return serverCert
  **/
  @ApiModelProperty(required = true, value = "CA certificate of the server.")
  @NotNull


 
  @VsoMethod  
  public String getServerCert() {
    return serverCert;
  }
    
  @VsoMethod
  public void setServerCert(String serverCert) {
    this.serverCert = serverCert;
  }

  
  public String getObjectID() {
		return "HSMSafenetLunaServer";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HSMSafenetLunaServer hsMSafenetLunaServer = (HSMSafenetLunaServer) o;
    return Objects.equals(this.index, hsMSafenetLunaServer.index) &&
        Objects.equals(this.partitionPasswd, hsMSafenetLunaServer.partitionPasswd) &&
        Objects.equals(this.partitionSerialNumber, hsMSafenetLunaServer.partitionSerialNumber) &&
        Objects.equals(this.remoteIp, hsMSafenetLunaServer.remoteIp) &&
        Objects.equals(this.serverCert, hsMSafenetLunaServer.serverCert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, partitionPasswd, partitionSerialNumber, remoteIp, serverCert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HSMSafenetLunaServer {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    partitionPasswd: ").append(toIndentedString(partitionPasswd)).append("\n");
    sb.append("    partitionSerialNumber: ").append(toIndentedString(partitionSerialNumber)).append("\n");
    sb.append("    remoteIp: ").append(toIndentedString(remoteIp)).append("\n");
    sb.append("    serverCert: ").append(toIndentedString(serverCert)).append("\n");
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

