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
 * HealthMonitorSIP
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HealthMonitorSIP")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITORSIP, idAccessor = "getObjectID()")
@Service
public class HealthMonitorSIP extends AviRestResource  {
  @JsonProperty("sip_monitor_transport")
  private String sipMonitorTransport = "SIP_UDP_PROTO";

  @JsonProperty("sip_request_code")
  private String sipRequestCode = "SIP_OPTIONS";

  @JsonProperty("sip_response")
  private String sipResponse = "SIP/2.0";

  
  /**
   * Specify the transport protocol TCP or UDP, to be used for SIP health monitor. The default transport is UDP. Enum options - SIP_UDP_PROTO, SIP_TCP_PROTO. Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @return sipMonitorTransport
  **/
  @ApiModelProperty(value = "Specify the transport protocol TCP or UDP, to be used for SIP health monitor. The default transport is UDP. Enum options - SIP_UDP_PROTO, SIP_TCP_PROTO. Field introduced in 17.2.14, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public String getSipMonitorTransport() {
    return sipMonitorTransport;
  }
    
  @VsoMethod
  public void setSipMonitorTransport(String sipMonitorTransport) {
    this.sipMonitorTransport = sipMonitorTransport;
  }

  
  /**
   * Specify the SIP request to be sent to the server. By default, SIP OPTIONS request will be sent. Enum options - SIP_OPTIONS. Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * @return sipRequestCode
  **/
  @ApiModelProperty(value = "Specify the SIP request to be sent to the server. By default, SIP OPTIONS request will be sent. Enum options - SIP_OPTIONS. Field introduced in 17.2.8, 18.1.3, 18.2.1.")


 
  @VsoMethod  
  public String getSipRequestCode() {
    return sipRequestCode;
  }
    
  @VsoMethod
  public void setSipRequestCode(String sipRequestCode) {
    this.sipRequestCode = sipRequestCode;
  }

  
  /**
   * Match for a keyword in the first 2KB of the server header and body response. By default, it matches for SIP/2.0. Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * @return sipResponse
  **/
  @ApiModelProperty(value = "Match for a keyword in the first 2KB of the server header and body response. By default, it matches for SIP/2.0. Field introduced in 17.2.8, 18.1.3, 18.2.1.")


 
  @VsoMethod  
  public String getSipResponse() {
    return sipResponse;
  }
    
  @VsoMethod
  public void setSipResponse(String sipResponse) {
    this.sipResponse = sipResponse;
  }

  
  public String getObjectID() {
		return "HealthMonitorSIP";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthMonitorSIP healthMonitorSIP = (HealthMonitorSIP) o;
    return Objects.equals(this.sipMonitorTransport, healthMonitorSIP.sipMonitorTransport) &&
        Objects.equals(this.sipRequestCode, healthMonitorSIP.sipRequestCode) &&
        Objects.equals(this.sipResponse, healthMonitorSIP.sipResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sipMonitorTransport, sipRequestCode, sipResponse);
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

