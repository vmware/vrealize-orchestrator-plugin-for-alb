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
 * The HealthMonitorUdp is a POJO class extends AviRestResource that used for creating
 * HealthMonitorUdp.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HealthMonitorUdp")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITORUDP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HealthMonitorUdp extends AviRestResource {
  @JsonProperty("maintenance_response")
  @JsonInclude(Include.NON_NULL)
  private String maintenanceResponse = null;

  @JsonProperty("udp_request")
  @JsonInclude(Include.NON_NULL)
  private String udpRequest = null;

  @JsonProperty("udp_response")
  @JsonInclude(Include.NON_NULL)
  private String udpResponse = null;



  /**
   * This is the getter method this will return the attribute value.
   * Match or look for this keyword in the first 2kb of server's response indicating server maintenance.
   * A successful match results in the server being marked down.
   * @return maintenanceResponse
   */
  @VsoMethod
  public String getMaintenanceResponse() {
    return maintenanceResponse;
  }

  /**
   * This is the setter method to the attribute.
   * Match or look for this keyword in the first 2kb of server's response indicating server maintenance.
   * A successful match results in the server being marked down.
   * @param maintenanceResponse set the maintenanceResponse.
   */
  @VsoMethod
  public void setMaintenanceResponse(String  maintenanceResponse) {
    this.maintenanceResponse = maintenanceResponse;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Send udp request.
   * @return udpRequest
   */
  @VsoMethod
  public String getUdpRequest() {
    return udpRequest;
  }

  /**
   * This is the setter method to the attribute.
   * Send udp request.
   * @param udpRequest set the udpRequest.
   */
  @VsoMethod
  public void setUdpRequest(String  udpRequest) {
    this.udpRequest = udpRequest;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Match for keyword in the udp response.
   * @return udpResponse
   */
  @VsoMethod
  public String getUdpResponse() {
    return udpResponse;
  }

  /**
   * This is the setter method to the attribute.
   * Match for keyword in the udp response.
   * @param udpResponse set the udpResponse.
   */
  @VsoMethod
  public void setUdpResponse(String  udpResponse) {
    this.udpResponse = udpResponse;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HealthMonitorUdp objHealthMonitorUdp = (HealthMonitorUdp) o;
  return   Objects.equals(this.maintenanceResponse, objHealthMonitorUdp.maintenanceResponse)&&
  Objects.equals(this.udpRequest, objHealthMonitorUdp.udpRequest)&&
  Objects.equals(this.udpResponse, objHealthMonitorUdp.udpResponse);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HealthMonitorUdp {\n");
      sb.append("    maintenanceResponse: ").append(toIndentedString(maintenanceResponse)).append("\n");
        sb.append("    udpRequest: ").append(toIndentedString(udpRequest)).append("\n");
        sb.append("    udpResponse: ").append(toIndentedString(udpResponse)).append("\n");
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

