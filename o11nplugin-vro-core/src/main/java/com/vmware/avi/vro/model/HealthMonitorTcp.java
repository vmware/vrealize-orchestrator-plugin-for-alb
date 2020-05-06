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
 * HealthMonitorTcp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:14:41.363+05:30")

@VsoObject(create = false, name = "HealthMonitorTcp")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITORTCP, idAccessor = "getObjectID()")
@Service
public class HealthMonitorTcp extends AviRestResource  {
  @JsonProperty("maintenance_response")
  private String maintenanceResponse = null;

  @JsonProperty("tcp_half_open")
  private Boolean tcpHalfOpen = null;

  @JsonProperty("tcp_request")
  private String tcpRequest = null;

  @JsonProperty("tcp_response")
  private String tcpResponse = null;

  
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
   * Configure TCP health monitor to use half-open TCP connections to monitor the health of backend servers thereby avoiding consumption of a full fledged server side connection and the overhead and logs associated with it.  This method is light-weight as it makes use of listener in server's kernel layer to measure the health and a child socket or user thread is not created on the server side.
   * @return tcpHalfOpen
  **/
  @ApiModelProperty(value = "Configure TCP health monitor to use half-open TCP connections to monitor the health of backend servers thereby avoiding consumption of a full fledged server side connection and the overhead and logs associated with it.  This method is light-weight as it makes use of listener in server's kernel layer to measure the health and a child socket or user thread is not created on the server side.")


 
  @VsoMethod  
  public Boolean isTcpHalfOpen() {
    return tcpHalfOpen;
  }
    
  @VsoMethod
  public void setTcpHalfOpen(Boolean tcpHalfOpen) {
    this.tcpHalfOpen = tcpHalfOpen;
  }

  
  /**
   * Request data to send after completing the TCP handshake.
   * @return tcpRequest
  **/
  @ApiModelProperty(value = "Request data to send after completing the TCP handshake.")


 
  @VsoMethod  
  public String getTcpRequest() {
    return tcpRequest;
  }
    
  @VsoMethod
  public void setTcpRequest(String tcpRequest) {
    this.tcpRequest = tcpRequest;
  }

  
  /**
   * Match for the desired keyword in the first 2Kb of the server's TCP response. If this field is left blank, no server response is required.
   * @return tcpResponse
  **/
  @ApiModelProperty(value = "Match for the desired keyword in the first 2Kb of the server's TCP response. If this field is left blank, no server response is required.")


 
  @VsoMethod  
  public String getTcpResponse() {
    return tcpResponse;
  }
    
  @VsoMethod
  public void setTcpResponse(String tcpResponse) {
    this.tcpResponse = tcpResponse;
  }

  
  public String getObjectID() {
		return "HealthMonitorTcp";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthMonitorTcp healthMonitorTcp = (HealthMonitorTcp) o;
    return Objects.equals(this.maintenanceResponse, healthMonitorTcp.maintenanceResponse) &&
        Objects.equals(this.tcpHalfOpen, healthMonitorTcp.tcpHalfOpen) &&
        Objects.equals(this.tcpRequest, healthMonitorTcp.tcpRequest) &&
        Objects.equals(this.tcpResponse, healthMonitorTcp.tcpResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintenanceResponse, tcpHalfOpen, tcpRequest, tcpResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthMonitorTcp {\n");
    
    sb.append("    maintenanceResponse: ").append(toIndentedString(maintenanceResponse)).append("\n");
    sb.append("    tcpHalfOpen: ").append(toIndentedString(tcpHalfOpen)).append("\n");
    sb.append("    tcpRequest: ").append(toIndentedString(tcpRequest)).append("\n");
    sb.append("    tcpResponse: ").append(toIndentedString(tcpResponse)).append("\n");
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

