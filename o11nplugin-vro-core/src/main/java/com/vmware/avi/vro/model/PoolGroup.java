package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.FailAction;
import com.vmware.avi.vro.model.PoolGroupMember;
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
 * PoolGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "PoolGroup")
@VsoFinder(name = Constants.FINDER_VRO_POOLGROUP, idAccessor = "getObjectID()")
@Service
public class PoolGroup extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("cloud_config_cksum")
  private String cloudConfigCksum = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("deployment_policy_ref")
  private String deploymentPolicyRef = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("enable_http2")
  private Boolean enableHttp2 = null;

  @JsonProperty("fail_action")
  private FailAction failAction = null;

  @JsonProperty("implicit_priority_labels")
  private Boolean implicitPriorityLabels = null;

  @JsonProperty("members")
  @Valid
  private List<PoolGroupMember> members = null;

  @JsonProperty("min_servers")
  private Integer minServers = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("priority_labels_ref")
  private String priorityLabelsRef = null;

  @JsonProperty("service_metadata")
  private String serviceMetadata = null;

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
   * Checksum of cloud configuration for PoolGroup. Internally set by cloud connector.
   * @return cloudConfigCksum
  **/
  @ApiModelProperty(value = "Checksum of cloud configuration for PoolGroup. Internally set by cloud connector.")


 
  @VsoMethod  
  public String getCloudConfigCksum() {
    return cloudConfigCksum;
  }
    
  @VsoMethod
  public void setCloudConfigCksum(String cloudConfigCksum) {
    this.cloudConfigCksum = cloudConfigCksum;
  }

  
  /**
   *  It is a reference to an object of type Cloud.
   * @return cloudRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Cloud.")


 
  @VsoMethod  
  public String getCloudRef() {
    return cloudRef;
  }
    
  @VsoMethod
  public void setCloudRef(String cloudRef) {
    this.cloudRef = cloudRef;
  }

  
  /**
   * Name of the user who created the object.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Name of the user who created the object.")


 
  @VsoMethod  
  public String getCreatedBy() {
    return createdBy;
  }
    
  @VsoMethod
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * When setup autoscale manager will automatically promote new pools into production when deployment goals are met. It is a reference to an object of type PoolGroupDeploymentPolicy.
   * @return deploymentPolicyRef
  **/
  @ApiModelProperty(value = "When setup autoscale manager will automatically promote new pools into production when deployment goals are met. It is a reference to an object of type PoolGroupDeploymentPolicy.")


 
  @VsoMethod  
  public String getDeploymentPolicyRef() {
    return deploymentPolicyRef;
  }
    
  @VsoMethod
  public void setDeploymentPolicyRef(String deploymentPolicyRef) {
    this.deploymentPolicyRef = deploymentPolicyRef;
  }

  
  /**
   * Description of Pool Group.
   * @return description
  **/
  @ApiModelProperty(value = "Description of Pool Group.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Enable HTTP/2 for traffic from VirtualService to all the backend servers in all the pools configured under this PoolGroup. Field introduced in 20.1.1.
   * @return enableHttp2
  **/
  @ApiModelProperty(value = "Enable HTTP/2 for traffic from VirtualService to all the backend servers in all the pools configured under this PoolGroup. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isEnableHttp2() {
    return enableHttp2;
  }
    
  @VsoMethod
  public void setEnableHttp2(Boolean enableHttp2) {
    this.enableHttp2 = enableHttp2;
  }

  
  /**
   * Enable an action - Close Connection, HTTP Redirect, or Local HTTP Response - when a pool group failure happens. By default, a connection will be closed, in case the pool group experiences a failure.
   * @return failAction
  **/
  @ApiModelProperty(value = "Enable an action - Close Connection, HTTP Redirect, or Local HTTP Response - when a pool group failure happens. By default, a connection will be closed, in case the pool group experiences a failure.")

  @Valid

 
  @VsoMethod  
  public FailAction getFailAction() {
    return failAction;
  }
    
  @VsoMethod
  public void setFailAction(FailAction failAction) {
    this.failAction = failAction;
  }

  
  /**
   * Whether an implicit set of priority labels is generated. Field introduced in 17.1.9,17.2.3.
   * @return implicitPriorityLabels
  **/
  @ApiModelProperty(value = "Whether an implicit set of priority labels is generated. Field introduced in 17.1.9,17.2.3.")


 
  @VsoMethod  
  public Boolean isImplicitPriorityLabels() {
    return implicitPriorityLabels;
  }
    
  @VsoMethod
  public void setImplicitPriorityLabels(Boolean implicitPriorityLabels) {
    this.implicitPriorityLabels = implicitPriorityLabels;
  }

  
  public PoolGroup addMembersItem(PoolGroupMember membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<PoolGroupMember>();
    }
    this.members.add(membersItem);
    return this;
  }
  
  /**
   * List of pool group members object of type PoolGroupMember.
   * @return members
  **/
  @ApiModelProperty(value = "List of pool group members object of type PoolGroupMember.")

  @Valid

 
  @VsoMethod  
  public List<PoolGroupMember> getMembers() {
    return members;
  }
    
  @VsoMethod
  public void setMembers(List<PoolGroupMember> members) {
    this.members = members;
  }

  
  /**
   * The minimum number of servers to distribute traffic to. Allowed values are 1-65535. Special values are 0 - 'Disable'.
   * @return minServers
  **/
  @ApiModelProperty(value = "The minimum number of servers to distribute traffic to. Allowed values are 1-65535. Special values are 0 - 'Disable'.")


 
  @VsoMethod  
  public Integer getMinServers() {
    return minServers;
  }
    
  @VsoMethod
  public void setMinServers(Integer minServers) {
    this.minServers = minServers;
  }

  
  /**
   * The name of the pool group.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the pool group.")
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
   * UUID of the priority labels. If not provided, pool group member priority label will be interpreted as a number with a larger number considered higher priority. It is a reference to an object of type PriorityLabels.
   * @return priorityLabelsRef
  **/
  @ApiModelProperty(value = "UUID of the priority labels. If not provided, pool group member priority label will be interpreted as a number with a larger number considered higher priority. It is a reference to an object of type PriorityLabels.")


 
  @VsoMethod  
  public String getPriorityLabelsRef() {
    return priorityLabelsRef;
  }
    
  @VsoMethod
  public void setPriorityLabelsRef(String priorityLabelsRef) {
    this.priorityLabelsRef = priorityLabelsRef;
  }

  
  /**
   * Metadata pertaining to the service provided by this PoolGroup. In Openshift/Kubernetes environments, app metadata info is stored. Any user input to this field will be overwritten by Avi Vantage. Field introduced in 17.2.14,18.1.5,18.2.1.
   * @return serviceMetadata
  **/
  @ApiModelProperty(value = "Metadata pertaining to the service provided by this PoolGroup. In Openshift/Kubernetes environments, app metadata info is stored. Any user input to this field will be overwritten by Avi Vantage. Field introduced in 17.2.14,18.1.5,18.2.1.")


 
  @VsoMethod  
  public String getServiceMetadata() {
    return serviceMetadata;
  }
    
  @VsoMethod
  public void setServiceMetadata(String serviceMetadata) {
    this.serviceMetadata = serviceMetadata;
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
   * UUID of the pool group.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the pool group.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "PoolGroup";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolGroup poolGroup = (PoolGroup) o;
    return Objects.equals(this.lastModified, poolGroup.lastModified) &&
        Objects.equals(this.cloudConfigCksum, poolGroup.cloudConfigCksum) &&
        Objects.equals(this.cloudRef, poolGroup.cloudRef) &&
        Objects.equals(this.createdBy, poolGroup.createdBy) &&
        Objects.equals(this.deploymentPolicyRef, poolGroup.deploymentPolicyRef) &&
        Objects.equals(this.description, poolGroup.description) &&
        Objects.equals(this.enableHttp2, poolGroup.enableHttp2) &&
        Objects.equals(this.failAction, poolGroup.failAction) &&
        Objects.equals(this.implicitPriorityLabels, poolGroup.implicitPriorityLabels) &&
        Objects.equals(this.members, poolGroup.members) &&
        Objects.equals(this.minServers, poolGroup.minServers) &&
        Objects.equals(this.name, poolGroup.name) &&
        Objects.equals(this.priorityLabelsRef, poolGroup.priorityLabelsRef) &&
        Objects.equals(this.serviceMetadata, poolGroup.serviceMetadata) &&
        Objects.equals(this.tenantRef, poolGroup.tenantRef) &&
        Objects.equals(this.url, poolGroup.url) &&
        Objects.equals(this.uuid, poolGroup.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, cloudConfigCksum, cloudRef, createdBy, deploymentPolicyRef, description, enableHttp2, failAction, implicitPriorityLabels, members, minServers, name, priorityLabelsRef, serviceMetadata, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolGroup {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    deploymentPolicyRef: ").append(toIndentedString(deploymentPolicyRef)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enableHttp2: ").append(toIndentedString(enableHttp2)).append("\n");
    sb.append("    failAction: ").append(toIndentedString(failAction)).append("\n");
    sb.append("    implicitPriorityLabels: ").append(toIndentedString(implicitPriorityLabels)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    minServers: ").append(toIndentedString(minServers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priorityLabelsRef: ").append(toIndentedString(priorityLabelsRef)).append("\n");
    sb.append("    serviceMetadata: ").append(toIndentedString(serviceMetadata)).append("\n");
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

