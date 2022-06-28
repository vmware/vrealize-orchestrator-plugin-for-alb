package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HealthMonitorSIP is a POJO class extends AviRestResource that used for creating
 * HealthMonitorSIP.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HealthMonitorSIP")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITORSIP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HealthMonitorSIP extends AviRestResource {
    @JsonProperty("sip_monitor_transport")
    @JsonInclude(Include.NON_NULL)
    private String sipMonitorTransport = "SIP_UDP_PROTO";

    @JsonProperty("sip_request_code")
    @JsonInclude(Include.NON_NULL)
    private String sipRequestCode = "SIP_OPTIONS";

    @JsonProperty("sip_response")
    @JsonInclude(Include.NON_NULL)
    private String sipResponse = "SIP/2.0";



  /**
   * This is the getter method this will return the attribute value.
   * Specify the transport protocol tcp or udp, to be used for sip health monitor.
   * The default transport is udp.
   * Enum options - SIP_UDP_PROTO, SIP_TCP_PROTO.
   * Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SIP_UDP_PROTO".
   * @return sipMonitorTransport
   */
  @VsoMethod
  public String getSipMonitorTransport() {
    return sipMonitorTransport;
  }

  /**
   * This is the setter method to the attribute.
   * Specify the transport protocol tcp or udp, to be used for sip health monitor.
   * The default transport is udp.
   * Enum options - SIP_UDP_PROTO, SIP_TCP_PROTO.
   * Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SIP_UDP_PROTO".
   * @param sipMonitorTransport set the sipMonitorTransport.
   */
  @VsoMethod
  public void setSipMonitorTransport(String  sipMonitorTransport) {
    this.sipMonitorTransport = sipMonitorTransport;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specify the sip request to be sent to the server.
   * By default, sip options request will be sent.
   * Enum options - SIP_OPTIONS.
   * Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SIP_OPTIONS".
   * @return sipRequestCode
   */
  @VsoMethod
  public String getSipRequestCode() {
    return sipRequestCode;
  }

  /**
   * This is the setter method to the attribute.
   * Specify the sip request to be sent to the server.
   * By default, sip options request will be sent.
   * Enum options - SIP_OPTIONS.
   * Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SIP_OPTIONS".
   * @param sipRequestCode set the sipRequestCode.
   */
  @VsoMethod
  public void setSipRequestCode(String  sipRequestCode) {
    this.sipRequestCode = sipRequestCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Match for a keyword in the first 2kb of the server header and body response.
   * By default, it matches for sip/2.0.
   * Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SIP/2.0".
   * @return sipResponse
   */
  @VsoMethod
  public String getSipResponse() {
    return sipResponse;
  }

  /**
   * This is the setter method to the attribute.
   * Match for a keyword in the first 2kb of the server header and body response.
   * By default, it matches for sip/2.0.
   * Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SIP/2.0".
   * @param sipResponse set the sipResponse.
   */
  @VsoMethod
  public void setSipResponse(String  sipResponse) {
    this.sipResponse = sipResponse;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HealthMonitorSIP objHealthMonitorSIP = (HealthMonitorSIP) o;
  return   Objects.equals(this.sipRequestCode, objHealthMonitorSIP.sipRequestCode)&&
  Objects.equals(this.sipResponse, objHealthMonitorSIP.sipResponse)&&
  Objects.equals(this.sipMonitorTransport, objHealthMonitorSIP.sipMonitorTransport);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HealthMonitorSIP {\n");
      sb.append("    sipMonitorTransport: ").append(toIndentedString(sipMonitorTransport)).append("\n");
        sb.append("    sipRequestCode: ").append(toIndentedString(sipRequestCode)).append("\n");
        sb.append("    sipResponse: ").append(toIndentedString(sipResponse)).append("\n");
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

