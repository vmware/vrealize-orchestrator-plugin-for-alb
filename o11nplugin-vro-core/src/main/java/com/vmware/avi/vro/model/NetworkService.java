package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.RoutingService;
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
 * NetworkService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NetworkService")
@VsoFinder(name = Constants.FINDER_VRO_NETWORKSERVICE, idAccessor = "getObjectID()")
@Service
public class NetworkService extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("routing_service")
  private RoutingService routingService = null;

  @JsonProperty("se_group_ref")
  private String seGroupRef = null;

  @JsonProperty("service_type")
  private String serviceType = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vrf_ref")
  private String vrfRef = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   *  It is a reference to an object of type Cloud. Field introduced in 18.2.5.
   * @return cloudRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Cloud. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getCloudRef() {
    return cloudRef;
  }
    
  @VsoMethod
  public void setCloudRef(String cloudRef) {
    this.cloudRef = cloudRef;
  }

  
  /**
   * Name of the NetworkService. Field introduced in 18.2.5.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the NetworkService. Field introduced in 18.2.5.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Routing Information of the NetworkService. Field introduced in 18.2.5.
   * @return routingService
  **/
  @ApiModelProperty(value = "Routing Information of the NetworkService. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public RoutingService getRoutingService() {
    return routingService;
  }
    
  @VsoMethod
  public void setRoutingService(RoutingService routingService) {
    this.routingService = routingService;
  }

  
  /**
   * Service Engine Group to which the service is applied. It is a reference to an object of type ServiceEngineGroup. Field introduced in 18.2.5.
   * @return seGroupRef
  **/
  @ApiModelProperty(required = true, value = "Service Engine Group to which the service is applied. It is a reference to an object of type ServiceEngineGroup. Field introduced in 18.2.5.")
  @NotNull


 
  @VsoMethod  
  public String getSeGroupRef() {
    return seGroupRef;
  }
    
  @VsoMethod
  public void setSeGroupRef(String seGroupRef) {
    this.seGroupRef = seGroupRef;
  }

  
  /**
   * Indicates the type of NetworkService. Enum options - ROUTING_SERVICE. Field introduced in 18.2.5.
   * @return serviceType
  **/
  @ApiModelProperty(required = true, value = "Indicates the type of NetworkService. Enum options - ROUTING_SERVICE. Field introduced in 18.2.5.")
  @NotNull


 
  @VsoMethod  
  public String getServiceType() {
    return serviceType;
  }
    
  @VsoMethod
  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  
  /**
   *  It is a reference to an object of type Tenant. Field introduced in 18.2.5.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * UUID of the NetworkService. Field introduced in 18.2.5.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the NetworkService. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   * VRF context to which the service is scoped. It is a reference to an object of type VrfContext. Field introduced in 18.2.5.
   * @return vrfRef
  **/
  @ApiModelProperty(required = true, value = "VRF context to which the service is scoped. It is a reference to an object of type VrfContext. Field introduced in 18.2.5.")
  @NotNull


 
  @VsoMethod  
  public String getVrfRef() {
    return vrfRef;
  }
    
  @VsoMethod
  public void setVrfRef(String vrfRef) {
    this.vrfRef = vrfRef;
  }

  
  public String getObjectID() {
		return "NetworkService";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkService networkService = (NetworkService) o;
    return Objects.equals(this.lastModified, networkService.lastModified) &&
        Objects.equals(this.cloudRef, networkService.cloudRef) &&
        Objects.equals(this.name, networkService.name) &&
        Objects.equals(this.routingService, networkService.routingService) &&
        Objects.equals(this.seGroupRef, networkService.seGroupRef) &&
        Objects.equals(this.serviceType, networkService.serviceType) &&
        Objects.equals(this.tenantRef, networkService.tenantRef) &&
        Objects.equals(this.url, networkService.url) &&
        Objects.equals(this.uuid, networkService.uuid) &&
        Objects.equals(this.vrfRef, networkService.vrfRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, cloudRef, name, routingService, seGroupRef, serviceType, tenantRef, url, uuid, vrfRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkService {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    routingService: ").append(toIndentedString(routingService)).append("\n");
    sb.append("    seGroupRef: ").append(toIndentedString(seGroupRef)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vrfRef: ").append(toIndentedString(vrfRef)).append("\n");
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

