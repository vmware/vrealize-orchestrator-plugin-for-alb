package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.MicroServiceContainer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * MicroService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "MicroService")
@VsoFinder(name = Constants.FINDER_VRO_MICROSERVICE, idAccessor = "getObjectID()")
@Service
public class MicroService extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("application_name")
  private String applicationName = null;

  @JsonProperty("cloud_config_cksum")
  private String cloudConfigCksum = null;

  @JsonProperty("containers")
  @Valid
  private List<MicroServiceContainer> containers = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("ip_list")
  private Boolean ipList = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("orchestrator_name")
  private String orchestratorName = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
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
   * application_name of MicroService.
   * @return applicationName
  **/
  @ApiModelProperty(required = true, value = "application_name of MicroService.")
  @NotNull


 
  @VsoMethod  
  public String getApplicationName() {
    return applicationName;
  }
    
  @VsoMethod
  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  
  /**
   * Checksum of cloud configuration for Microservice. Internally set by cloud connector. Field introduced in 17.2.8.
   * @return cloudConfigCksum
  **/
  @ApiModelProperty(value = "Checksum of cloud configuration for Microservice. Internally set by cloud connector. Field introduced in 17.2.8.")


 
  @VsoMethod  
  public String getCloudConfigCksum() {
    return cloudConfigCksum;
  }
    
  @VsoMethod
  public void setCloudConfigCksum(String cloudConfigCksum) {
    this.cloudConfigCksum = cloudConfigCksum;
  }

  
  public MicroService addContainersItem(MicroServiceContainer containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<MicroServiceContainer>();
    }
    this.containers.add(containersItem);
    return this;
  }
  
  /**
   * The list of containers for this microservice.
   * @return containers
  **/
  @ApiModelProperty(value = "The list of containers for this microservice.")

  @Valid

 
  @VsoMethod  
  public List<MicroServiceContainer> getContainers() {
    return containers;
  }
    
  @VsoMethod
  public void setContainers(List<MicroServiceContainer> containers) {
    this.containers = containers;
  }

  
  /**
   * Creator name.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Creator name.")


 
  @VsoMethod  
  public String getCreatedBy() {
    return createdBy;
  }
    
  @VsoMethod
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * User defined description for the object.
   * @return description
  **/
  @ApiModelProperty(value = "User defined description for the object.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Flag to indicate if container IP list is provided by cloud connectorThis is applicable for overlay cases.
   * @return ipList
  **/
  @ApiModelProperty(value = "Flag to indicate if container IP list is provided by cloud connectorThis is applicable for overlay cases.")


 
  @VsoMethod  
  public Boolean isIpList() {
    return ipList;
  }
    
  @VsoMethod
  public void setIpList(Boolean ipList) {
    this.ipList = ipList;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
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
   * orchestrator_name of MicroService.
   * @return orchestratorName
  **/
  @ApiModelProperty(required = true, value = "orchestrator_name of MicroService.")
  @NotNull


 
  @VsoMethod  
  public String getOrchestratorName() {
    return orchestratorName;
  }
    
  @VsoMethod
  public void setOrchestratorName(String orchestratorName) {
    this.orchestratorName = orchestratorName;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
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
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "MicroService";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicroService microService = (MicroService) o;
    return Objects.equals(this.lastModified, microService.lastModified) &&
        Objects.equals(this.applicationName, microService.applicationName) &&
        Objects.equals(this.cloudConfigCksum, microService.cloudConfigCksum) &&
        Objects.equals(this.containers, microService.containers) &&
        Objects.equals(this.createdBy, microService.createdBy) &&
        Objects.equals(this.description, microService.description) &&
        Objects.equals(this.ipList, microService.ipList) &&
        Objects.equals(this.name, microService.name) &&
        Objects.equals(this.orchestratorName, microService.orchestratorName) &&
        Objects.equals(this.tenantRef, microService.tenantRef) &&
        Objects.equals(this.url, microService.url) &&
        Objects.equals(this.uuid, microService.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, applicationName, cloudConfigCksum, containers, createdBy, description, ipList, name, orchestratorName, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicroService {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orchestratorName: ").append(toIndentedString(orchestratorName)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

