package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.OperationalStatus;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SCServerStateInfo is a POJO class extends AviRestResource that used for creating
 * SCServerStateInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SCServerStateInfo")
@VsoFinder(name = Constants.FINDER_VRO_SCSERVERSTATEINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SCServerStateInfo extends AviRestResource {
    @JsonProperty("oper_status")
    @JsonInclude(Include.NON_NULL)
    private OperationalStatus operStatus = null;

    @JsonProperty("server_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr serverIp = null;

    @JsonProperty("server_port")
    @JsonInclude(Include.NON_NULL)
    private Integer serverPort = null;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return operStatus
   */
  @VsoMethod
  public OperationalStatus getOperStatus() {
    return operStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param operStatus set the operStatus.
   */
  @VsoMethod
  public void setOperStatus(OperationalStatus operStatus) {
    this.operStatus = operStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverIp
   */
  @VsoMethod
  public IpAddr getServerIp() {
    return serverIp;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverIp set the serverIp.
   */
  @VsoMethod
  public void setServerIp(IpAddr serverIp) {
    this.serverIp = serverIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed values are 1-65535.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverPort
   */
  @VsoMethod
  public Integer getServerPort() {
    return serverPort;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed values are 1-65535.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverPort set the serverPort.
   */
  @VsoMethod
  public void setServerPort(Integer  serverPort) {
    this.serverPort = serverPort;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SCServerStateInfo objSCServerStateInfo = (SCServerStateInfo) o;
  return   Objects.equals(this.serverIp, objSCServerStateInfo.serverIp)&&
  Objects.equals(this.serverPort, objSCServerStateInfo.serverPort)&&
  Objects.equals(this.operStatus, objSCServerStateInfo.operStatus);
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

