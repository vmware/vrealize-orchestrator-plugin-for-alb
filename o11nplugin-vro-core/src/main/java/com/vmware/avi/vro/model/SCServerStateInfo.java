package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.OperationalStatus;
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
 * SCServerStateInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SCServerStateInfo")
@VsoFinder(name = Constants.FINDER_VRO_SCSERVERSTATEINFO, idAccessor = "getObjectID()")
@Service
public class SCServerStateInfo extends AviRestResource  {
  @JsonProperty("oper_status")
  private OperationalStatus operStatus = null;

  @JsonProperty("server_ip")
  private IpAddr serverIp = null;

  @JsonProperty("server_port")
  private Integer serverPort = null;

  
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
   * @return serverIp
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public IpAddr getServerIp() {
    return serverIp;
  }
    
  @VsoMethod
  public void setServerIp(IpAddr serverIp) {
    this.serverIp = serverIp;
  }

  
  /**
   *  Allowed values are 1-65535. Field introduced in 17.1.1.
   * @return serverPort
  **/
  @ApiModelProperty(value = " Allowed values are 1-65535. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getServerPort() {
    return serverPort;
  }
    
  @VsoMethod
  public void setServerPort(Integer serverPort) {
    this.serverPort = serverPort;
  }

  
  public String getObjectID() {
		return "SCServerStateInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SCServerStateInfo scServerStateInfo = (SCServerStateInfo) o;
    return Objects.equals(this.operStatus, scServerStateInfo.operStatus) &&
        Objects.equals(this.serverIp, scServerStateInfo.serverIp) &&
        Objects.equals(this.serverPort, scServerStateInfo.serverPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operStatus, serverIp, serverPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SCServerStateInfo {\n");
    
    sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
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

