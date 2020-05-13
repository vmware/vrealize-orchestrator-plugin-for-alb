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
 * HealthMonitorUdp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HealthMonitorUdp")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITORUDP, idAccessor = "getObjectID()")
@Service
public class HealthMonitorUdp extends AviRestResource  {
  @JsonProperty("maintenance_response")
  private String maintenanceResponse = null;

  @JsonProperty("udp_request")
  private String udpRequest = null;

  @JsonProperty("udp_response")
  private String udpResponse = null;

  
  /**
   * Match or look for this keyword in the first 2KB of server's response indicating server maintenance.  A successful match results in the server being marked down.
   * @return maintenanceResponse
  **/
  @ApiModelProperty(value = "Match or look for this keyword in the first 2KB of server's response indicating server maintenance.  A successful match results in the server being marked down.")


 
  @VsoMethod  
  public String getMaintenanceResponse() {
    return maintenanceResponse;
  }
    
  @VsoMethod
  public void setMaintenanceResponse(String maintenanceResponse) {
    this.maintenanceResponse = maintenanceResponse;
  }

  
  /**
   * Send UDP request.
   * @return udpRequest
  **/
  @ApiModelProperty(value = "Send UDP request.")


 
  @VsoMethod  
  public String getUdpRequest() {
    return udpRequest;
  }
    
  @VsoMethod
  public void setUdpRequest(String udpRequest) {
    this.udpRequest = udpRequest;
  }

  
  /**
   * Match for keyword in the UDP response.
   * @return udpResponse
  **/
  @ApiModelProperty(value = "Match for keyword in the UDP response.")


 
  @VsoMethod  
  public String getUdpResponse() {
    return udpResponse;
  }
    
  @VsoMethod
  public void setUdpResponse(String udpResponse) {
    this.udpResponse = udpResponse;
  }

  
  public String getObjectID() {
		return "HealthMonitorUdp";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthMonitorUdp healthMonitorUdp = (HealthMonitorUdp) o;
    return Objects.equals(this.maintenanceResponse, healthMonitorUdp.maintenanceResponse) &&
        Objects.equals(this.udpRequest, healthMonitorUdp.udpRequest) &&
        Objects.equals(this.udpResponse, healthMonitorUdp.udpResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintenanceResponse, udpRequest, udpResponse);
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

