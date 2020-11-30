package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.LogAgentTCPClientEventDetail;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The LogAgentEventDetail is a POJO class extends AviRestResource that used for creating
 * LogAgentEventDetail.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LogAgentEventDetail")
@VsoFinder(name = Constants.FINDER_VRO_LOGAGENTEVENTDETAIL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LogAgentEventDetail extends AviRestResource {
    @JsonProperty("protocol")
    @JsonInclude(Include.NON_NULL)
    private String protocol = null;

    @JsonProperty("tcp_detail")
    @JsonInclude(Include.NON_NULL)
    private LogAgentTCPClientEventDetail tcpDetail = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;



  /**
   * This is the getter method this will return the attribute value.
   * Protocol used for communication to the external entity.
   * Enum options - TCP_CONN.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return protocol
   */
  @VsoMethod
  public String getProtocol() {
    return protocol;
  }

  /**
   * This is the setter method to the attribute.
   * Protocol used for communication to the external entity.
   * Enum options - TCP_CONN.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param protocol set the protocol.
   */
  @VsoMethod
  public void setProtocol(String  protocol) {
    this.protocol = protocol;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Event details for tcp connection event.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tcpDetail
   */
  @VsoMethod
  public LogAgentTCPClientEventDetail getTcpDetail() {
    return tcpDetail;
  }

  /**
   * This is the setter method to the attribute.
   * Event details for tcp connection event.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tcpDetail set the tcpDetail.
   */
  @VsoMethod
  public void setTcpDetail(LogAgentTCPClientEventDetail tcpDetail) {
    this.tcpDetail = tcpDetail;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of log agent event.
   * Enum options - LOG_AGENT_CONNECTION_ERROR.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of log agent event.
   * Enum options - LOG_AGENT_CONNECTION_ERROR.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  LogAgentEventDetail objLogAgentEventDetail = (LogAgentEventDetail) o;
  return   Objects.equals(this.type, objLogAgentEventDetail.type)&&
  Objects.equals(this.protocol, objLogAgentEventDetail.protocol)&&
  Objects.equals(this.tcpDetail, objLogAgentEventDetail.tcpDetail);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LogAgentEventDetail {\n");
      sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    tcpDetail: ").append(toIndentedString(tcpDetail)).append("\n");
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

