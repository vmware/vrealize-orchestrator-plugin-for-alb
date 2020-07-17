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
 * The MicroService is a POJO class extends AviRestResource that used for creating
 * MicroService.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MicroService")
@VsoFinder(name = Constants.FINDER_VRO_MICROSERVICE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MicroService extends AviRestResource {
  @JsonProperty("application_name")
  @JsonInclude(Include.NON_NULL)
  private String applicationName = null;

  @JsonProperty("cloud_config_cksum")
  @JsonInclude(Include.NON_NULL)
  private String cloudConfigCksum = null;

  @JsonProperty("containers")
  @JsonInclude(Include.NON_NULL)
  private List<MicroServiceContainer> containers = null;

  @JsonProperty("created_by")
  @JsonInclude(Include.NON_NULL)
  private String createdBy = null;

  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("ip_list")
  @JsonInclude(Include.NON_NULL)
  private Boolean ipList = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("orchestrator_name")
  @JsonInclude(Include.NON_NULL)
  private String orchestratorName = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property application_name of obj type microservice field type str  type string.
   * @return applicationName
   */
  @VsoMethod
  public String getApplicationName() {
    return applicationName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property application_name of obj type microservice field type str  type string.
   * @param applicationName set the applicationName.
   */
  @VsoMethod
  public void setApplicationName(String  applicationName) {
    this.applicationName = applicationName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Checksum of cloud configuration for microservice.
   * Internally set by cloud connector.
   * Field introduced in 17.2.8.
   * @return cloudConfigCksum
   */
  @VsoMethod
  public String getCloudConfigCksum() {
    return cloudConfigCksum;
  }

  /**
   * This is the setter method to the attribute.
   * Checksum of cloud configuration for microservice.
   * Internally set by cloud connector.
   * Field introduced in 17.2.8.
   * @param cloudConfigCksum set the cloudConfigCksum.
   */
  @VsoMethod
  public void setCloudConfigCksum(String  cloudConfigCksum) {
    this.cloudConfigCksum = cloudConfigCksum;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The list of containers for this microservice.
   * @return containers
   */
  @VsoMethod
  public List<MicroServiceContainer> getContainers() {
    return containers;
  }

  /**
   * This is the setter method. this will set the containers
   * The list of containers for this microservice.
   * @return containers
   */
  @VsoMethod
  public void setContainers(List<MicroServiceContainer>  containers) {
    this.containers = containers;
  }

  /**
   * This is the setter method this will set the containers
   * The list of containers for this microservice.
   * @return containers
   */
  @VsoMethod
  public MicroService addContainersItem(MicroServiceContainer containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<MicroServiceContainer>();
    }
    this.containers.add(containersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Creator name.
   * @return createdBy
   */
  @VsoMethod
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * This is the setter method to the attribute.
   * Creator name.
   * @param createdBy set the createdBy.
   */
  @VsoMethod
  public void setCreatedBy(String  createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User defined description for the object.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * User defined description for the object.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag to indicate if container ip list is provided by cloud connectorthis is applicable for overlay cases.
   * @return ipList
   */
  @VsoMethod
  public Boolean getIpList() {
    return ipList;
  }

  /**
   * This is the setter method to the attribute.
   * Flag to indicate if container ip list is provided by cloud connectorthis is applicable for overlay cases.
   * @param ipList set the ipList.
   */
  @VsoMethod
  public void setIpList(Boolean  ipList) {
    this.ipList = ipList;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property orchestrator_name of obj type microservice field type str  type string.
   * @return orchestratorName
   */
  @VsoMethod
  public String getOrchestratorName() {
    return orchestratorName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property orchestrator_name of obj type microservice field type str  type string.
   * @param orchestratorName set the orchestratorName.
   */
  @VsoMethod
  public void setOrchestratorName(String  orchestratorName) {
    this.orchestratorName = orchestratorName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MicroService objMicroService = (MicroService) o;
  return   Objects.equals(this.orchestratorName, objMicroService.orchestratorName)&&
  Objects.equals(this.ipList, objMicroService.ipList)&&
  Objects.equals(this.description, objMicroService.description)&&
  Objects.equals(this.createdBy, objMicroService.createdBy)&&
  Objects.equals(this.name, objMicroService.name)&&
  Objects.equals(this.cloudConfigCksum, objMicroService.cloudConfigCksum)&&
  Objects.equals(this.applicationName, objMicroService.applicationName)&&
  Objects.equals(this.tenantRef, objMicroService.tenantRef)&&
  Objects.equals(this.containers, objMicroService.containers)&&
  Objects.equals(this.uuid, objMicroService.uuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MicroService {\n");
      sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
        sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    orchestratorName: ").append(toIndentedString(orchestratorName)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

