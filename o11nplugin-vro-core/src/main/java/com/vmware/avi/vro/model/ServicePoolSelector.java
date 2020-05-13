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
 * ServicePoolSelector
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ServicePoolSelector")
@VsoFinder(name = Constants.FINDER_VRO_SERVICEPOOLSELECTOR, idAccessor = "getObjectID()")
@Service
public class ServicePoolSelector extends AviRestResource  {
  @JsonProperty("service_pool_group_ref")
  private String servicePoolGroupRef = null;

  @JsonProperty("service_pool_ref")
  private String servicePoolRef = null;

  @JsonProperty("service_port")
  private Integer servicePort = null;

  @JsonProperty("service_port_range_end")
  private Integer servicePortRangeEnd = null;

  @JsonProperty("service_protocol")
  private String serviceProtocol = null;

  
  /**
   *  It is a reference to an object of type PoolGroup.
   * @return servicePoolGroupRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type PoolGroup.")


 
  @VsoMethod  
  public String getServicePoolGroupRef() {
    return servicePoolGroupRef;
  }
    
  @VsoMethod
  public void setServicePoolGroupRef(String servicePoolGroupRef) {
    this.servicePoolGroupRef = servicePoolGroupRef;
  }

  
  /**
   *  It is a reference to an object of type Pool.
   * @return servicePoolRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Pool.")


 
  @VsoMethod  
  public String getServicePoolRef() {
    return servicePoolRef;
  }
    
  @VsoMethod
  public void setServicePoolRef(String servicePoolRef) {
    this.servicePoolRef = servicePoolRef;
  }

  
  /**
   * Pool based destination port. Allowed values are 1-65535.
   * @return servicePort
  **/
  @ApiModelProperty(required = true, value = "Pool based destination port. Allowed values are 1-65535.")
  @NotNull


 
  @VsoMethod  
  public Integer getServicePort() {
    return servicePort;
  }
    
  @VsoMethod
  public void setServicePort(Integer servicePort) {
    this.servicePort = servicePort;
  }

  
  /**
   * The end of the Service port number range. Allowed values are 1-65535. Special values are 0- 'single port'. Field introduced in 17.2.4.
   * @return servicePortRangeEnd
  **/
  @ApiModelProperty(value = "The end of the Service port number range. Allowed values are 1-65535. Special values are 0- 'single port'. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public Integer getServicePortRangeEnd() {
    return servicePortRangeEnd;
  }
    
  @VsoMethod
  public void setServicePortRangeEnd(Integer servicePortRangeEnd) {
    this.servicePortRangeEnd = servicePortRangeEnd;
  }

  
  /**
   * Destination protocol to match for the pool selection. If not specified, it will match any protocol. Enum options - PROTOCOL_TYPE_TCP_PROXY, PROTOCOL_TYPE_TCP_FAST_PATH, PROTOCOL_TYPE_UDP_FAST_PATH, PROTOCOL_TYPE_UDP_PROXY.
   * @return serviceProtocol
  **/
  @ApiModelProperty(value = "Destination protocol to match for the pool selection. If not specified, it will match any protocol. Enum options - PROTOCOL_TYPE_TCP_PROXY, PROTOCOL_TYPE_TCP_FAST_PATH, PROTOCOL_TYPE_UDP_FAST_PATH, PROTOCOL_TYPE_UDP_PROXY.")


 
  @VsoMethod  
  public String getServiceProtocol() {
    return serviceProtocol;
  }
    
  @VsoMethod
  public void setServiceProtocol(String serviceProtocol) {
    this.serviceProtocol = serviceProtocol;
  }

  
  public String getObjectID() {
		return "ServicePoolSelector";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicePoolSelector servicePoolSelector = (ServicePoolSelector) o;
    return Objects.equals(this.servicePoolGroupRef, servicePoolSelector.servicePoolGroupRef) &&
        Objects.equals(this.servicePoolRef, servicePoolSelector.servicePoolRef) &&
        Objects.equals(this.servicePort, servicePoolSelector.servicePort) &&
        Objects.equals(this.servicePortRangeEnd, servicePoolSelector.servicePortRangeEnd) &&
        Objects.equals(this.serviceProtocol, servicePoolSelector.serviceProtocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicePoolGroupRef, servicePoolRef, servicePort, servicePortRangeEnd, serviceProtocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePoolSelector {\n");
    
    sb.append("    servicePoolGroupRef: ").append(toIndentedString(servicePoolGroupRef)).append("\n");
    sb.append("    servicePoolRef: ").append(toIndentedString(servicePoolRef)).append("\n");
    sb.append("    servicePort: ").append(toIndentedString(servicePort)).append("\n");
    sb.append("    servicePortRangeEnd: ").append(toIndentedString(servicePortRangeEnd)).append("\n");
    sb.append("    serviceProtocol: ").append(toIndentedString(serviceProtocol)).append("\n");
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

