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

/**
 * Service
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "Service")
@VsoFinder(name = Constants.FINDER_VRO_SERVICE, idAccessor = "getObjectID()")
@org.springframework.stereotype.Service
public class Service extends AviRestResource  {
  @JsonProperty("enable_ssl")
  private Boolean enableSsl = null;

  @JsonProperty("override_application_profile_ref")
  private String overrideApplicationProfileRef = null;

  @JsonProperty("override_network_profile_ref")
  private String overrideNetworkProfileRef = null;

  @JsonProperty("port")
  private Integer port = null;

  @JsonProperty("port_range_end")
  private Integer portRangeEnd = null;

  
  /**
   * Enable SSL termination and offload for traffic from clients.
   * @return enableSsl
  **/
  @ApiModelProperty(value = "Enable SSL termination and offload for traffic from clients.")


 
  @VsoMethod  
  public Boolean isEnableSsl() {
    return enableSsl;
  }
    
  @VsoMethod
  public void setEnableSsl(Boolean enableSsl) {
    this.enableSsl = enableSsl;
  }

  
  /**
   * Enable application layer specific features for the this specific service. It is a reference to an object of type ApplicationProfile. Field introduced in 17.2.4.
   * @return overrideApplicationProfileRef
  **/
  @ApiModelProperty(value = "Enable application layer specific features for the this specific service. It is a reference to an object of type ApplicationProfile. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public String getOverrideApplicationProfileRef() {
    return overrideApplicationProfileRef;
  }
    
  @VsoMethod
  public void setOverrideApplicationProfileRef(String overrideApplicationProfileRef) {
    this.overrideApplicationProfileRef = overrideApplicationProfileRef;
  }

  
  /**
   * Override the network profile for this specific service port. It is a reference to an object of type NetworkProfile.
   * @return overrideNetworkProfileRef
  **/
  @ApiModelProperty(value = "Override the network profile for this specific service port. It is a reference to an object of type NetworkProfile.")


 
  @VsoMethod  
  public String getOverrideNetworkProfileRef() {
    return overrideNetworkProfileRef;
  }
    
  @VsoMethod
  public void setOverrideNetworkProfileRef(String overrideNetworkProfileRef) {
    this.overrideNetworkProfileRef = overrideNetworkProfileRef;
  }

  
  /**
   * The Virtual Service's port number. Allowed values are 1-65535.
   * @return port
  **/
  @ApiModelProperty(required = true, value = "The Virtual Service's port number. Allowed values are 1-65535.")
  @NotNull


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  /**
   * The end of the Virtual Service's port number range. Allowed values are 1-65535. Special values are 0- 'single port'.
   * @return portRangeEnd
  **/
  @ApiModelProperty(value = "The end of the Virtual Service's port number range. Allowed values are 1-65535. Special values are 0- 'single port'.")


 
  @VsoMethod  
  public Integer getPortRangeEnd() {
    return portRangeEnd;
  }
    
  @VsoMethod
  public void setPortRangeEnd(Integer portRangeEnd) {
    this.portRangeEnd = portRangeEnd;
  }

  
  public String getObjectID() {
		return "Service";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.enableSsl, service.enableSsl) &&
        Objects.equals(this.overrideApplicationProfileRef, service.overrideApplicationProfileRef) &&
        Objects.equals(this.overrideNetworkProfileRef, service.overrideNetworkProfileRef) &&
        Objects.equals(this.port, service.port) &&
        Objects.equals(this.portRangeEnd, service.portRangeEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableSsl, overrideApplicationProfileRef, overrideNetworkProfileRef, port, portRangeEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
    sb.append("    overrideApplicationProfileRef: ").append(toIndentedString(overrideApplicationProfileRef)).append("\n");
    sb.append("    overrideNetworkProfileRef: ").append(toIndentedString(overrideNetworkProfileRef)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    portRangeEnd: ").append(toIndentedString(portRangeEnd)).append("\n");
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

