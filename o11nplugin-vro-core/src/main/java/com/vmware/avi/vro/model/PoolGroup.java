package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.FailAction;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The PoolGroup is a POJO class extends AviRestResource that used for creating
 * PoolGroup.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PoolGroup")
@VsoFinder(name = Constants.FINDER_VRO_POOLGROUP, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PoolGroup extends AviRestResource {
  @JsonProperty("cloud_config_cksum")
  @JsonInclude(Include.NON_NULL)
  private String cloudConfigCksum = null;

  @JsonProperty("cloud_ref")
  @JsonInclude(Include.NON_NULL)
  private String cloudRef = null;

  @JsonProperty("created_by")
  @JsonInclude(Include.NON_NULL)
  private String createdBy = null;

  @JsonProperty("deployment_policy_ref")
  @JsonInclude(Include.NON_NULL)
  private String deploymentPolicyRef = null;

  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("enable_http2")
  @JsonInclude(Include.NON_NULL)
  private Boolean enableHttp2 = false;

  @JsonProperty("fail_action")
  @JsonInclude(Include.NON_NULL)
  private FailAction failAction = null;

  @JsonProperty("implicit_priority_labels")
  @JsonInclude(Include.NON_NULL)
  private Boolean implicitPriorityLabels = false;

  @JsonProperty("members")
  @JsonInclude(Include.NON_NULL)
  private List<PoolGroupMember> members = null;

  @JsonProperty("min_servers")
  @JsonInclude(Include.NON_NULL)
  private Integer minServers = 0;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("priority_labels_ref")
  @JsonInclude(Include.NON_NULL)
  private String priorityLabelsRef = null;

  @JsonProperty("service_metadata")
  @JsonInclude(Include.NON_NULL)
  private String serviceMetadata = null;

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
   * Checksum of cloud configuration for poolgroup.
   * Internally set by cloud connector.
   * @return cloudConfigCksum
   */
  @VsoMethod
  public String getCloudConfigCksum() {
    return cloudConfigCksum;
  }

  /**
   * This is the setter method to the attribute.
   * Checksum of cloud configuration for poolgroup.
   * Internally set by cloud connector.
   * @param cloudConfigCksum set the cloudConfigCksum.
   */
  @VsoMethod
  public void setCloudConfigCksum(String  cloudConfigCksum) {
    this.cloudConfigCksum = cloudConfigCksum;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type cloud.
   * @return cloudRef
   */
  @VsoMethod
  public String getCloudRef() {
    return cloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type cloud.
   * @param cloudRef set the cloudRef.
   */
  @VsoMethod
  public void setCloudRef(String  cloudRef) {
    this.cloudRef = cloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the user who created the object.
   * @return createdBy
   */
  @VsoMethod
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the user who created the object.
   * @param createdBy set the createdBy.
   */
  @VsoMethod
  public void setCreatedBy(String  createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * When setup autoscale manager will automatically promote new pools into production when deployment goals are met.
   * It is a reference to an object of type poolgroupdeploymentpolicy.
   * @return deploymentPolicyRef
   */
  @VsoMethod
  public String getDeploymentPolicyRef() {
    return deploymentPolicyRef;
  }

  /**
   * This is the setter method to the attribute.
   * When setup autoscale manager will automatically promote new pools into production when deployment goals are met.
   * It is a reference to an object of type poolgroupdeploymentpolicy.
   * @param deploymentPolicyRef set the deploymentPolicyRef.
   */
  @VsoMethod
  public void setDeploymentPolicyRef(String  deploymentPolicyRef) {
    this.deploymentPolicyRef = deploymentPolicyRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Description of pool group.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Description of pool group.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable http/2 for traffic from virtualservice to all the backend servers in all the pools configured under this poolgroup.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableHttp2
   */
  @VsoMethod
  public Boolean getEnableHttp2() {
    return enableHttp2;
  }

  /**
   * This is the setter method to the attribute.
   * Enable http/2 for traffic from virtualservice to all the backend servers in all the pools configured under this poolgroup.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableHttp2 set the enableHttp2.
   */
  @VsoMethod
  public void setEnableHttp2(Boolean  enableHttp2) {
    this.enableHttp2 = enableHttp2;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable an action - close connection, http redirect, or local http response - when a pool group failure happens.
   * By default, a connection will be closed, in case the pool group experiences a failure.
   * @return failAction
   */
  @VsoMethod
  public FailAction getFailAction() {
    return failAction;
  }

  /**
   * This is the setter method to the attribute.
   * Enable an action - close connection, http redirect, or local http response - when a pool group failure happens.
   * By default, a connection will be closed, in case the pool group experiences a failure.
   * @param failAction set the failAction.
   */
  @VsoMethod
  public void setFailAction(FailAction failAction) {
    this.failAction = failAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Whether an implicit set of priority labels is generated.
   * Field introduced in 17.1.9,17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return implicitPriorityLabels
   */
  @VsoMethod
  public Boolean getImplicitPriorityLabels() {
    return implicitPriorityLabels;
  }

  /**
   * This is the setter method to the attribute.
   * Whether an implicit set of priority labels is generated.
   * Field introduced in 17.1.9,17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param implicitPriorityLabels set the implicitPriorityLabels.
   */
  @VsoMethod
  public void setImplicitPriorityLabels(Boolean  implicitPriorityLabels) {
    this.implicitPriorityLabels = implicitPriorityLabels;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of pool group members object of type poolgroupmember.
   * @return members
   */
  @VsoMethod
  public List<PoolGroupMember> getMembers() {
    return members;
  }

  /**
   * This is the setter method. this will set the members
   * List of pool group members object of type poolgroupmember.
   * @return members
   */
  @VsoMethod
  public void setMembers(List<PoolGroupMember>  members) {
    this.members = members;
  }

  /**
   * This is the setter method this will set the members
   * List of pool group members object of type poolgroupmember.
   * @return members
   */
  @VsoMethod
  public PoolGroup addMembersItem(PoolGroupMember membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<PoolGroupMember>();
    }
    this.members.add(membersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The minimum number of servers to distribute traffic to.
   * Allowed values are 1-65535.
   * Special values are 0 - 'disable'.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return minServers
   */
  @VsoMethod
  public Integer getMinServers() {
    return minServers;
  }

  /**
   * This is the setter method to the attribute.
   * The minimum number of servers to distribute traffic to.
   * Allowed values are 1-65535.
   * Special values are 0 - 'disable'.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param minServers set the minServers.
   */
  @VsoMethod
  public void setMinServers(Integer  minServers) {
    this.minServers = minServers;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of the pool group.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * The name of the pool group.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the priority labels.
   * If not provided, pool group member priority label will be interpreted as a number with a larger number considered higher priority.
   * It is a reference to an object of type prioritylabels.
   * @return priorityLabelsRef
   */
  @VsoMethod
  public String getPriorityLabelsRef() {
    return priorityLabelsRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the priority labels.
   * If not provided, pool group member priority label will be interpreted as a number with a larger number considered higher priority.
   * It is a reference to an object of type prioritylabels.
   * @param priorityLabelsRef set the priorityLabelsRef.
   */
  @VsoMethod
  public void setPriorityLabelsRef(String  priorityLabelsRef) {
    this.priorityLabelsRef = priorityLabelsRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Metadata pertaining to the service provided by this poolgroup.
   * In openshift/kubernetes environments, app metadata info is stored.
   * Any user input to this field will be overwritten by avi vantage.
   * Field introduced in 17.2.14,18.1.5,18.2.1.
   * @return serviceMetadata
   */
  @VsoMethod
  public String getServiceMetadata() {
    return serviceMetadata;
  }

  /**
   * This is the setter method to the attribute.
   * Metadata pertaining to the service provided by this poolgroup.
   * In openshift/kubernetes environments, app metadata info is stored.
   * Any user input to this field will be overwritten by avi vantage.
   * Field introduced in 17.2.14,18.1.5,18.2.1.
   * @param serviceMetadata set the serviceMetadata.
   */
  @VsoMethod
  public void setServiceMetadata(String  serviceMetadata) {
    this.serviceMetadata = serviceMetadata;
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
   * Uuid of the pool group.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the pool group.
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
  PoolGroup objPoolGroup = (PoolGroup) o;
  return   Objects.equals(this.uuid, objPoolGroup.uuid)&&
  Objects.equals(this.implicitPriorityLabels, objPoolGroup.implicitPriorityLabels)&&
  Objects.equals(this.description, objPoolGroup.description)&&
  Objects.equals(this.createdBy, objPoolGroup.createdBy)&&
  Objects.equals(this.cloudRef, objPoolGroup.cloudRef)&&
  Objects.equals(this.members, objPoolGroup.members)&&
  Objects.equals(this.deploymentPolicyRef, objPoolGroup.deploymentPolicyRef)&&
  Objects.equals(this.cloudConfigCksum, objPoolGroup.cloudConfigCksum)&&
  Objects.equals(this.enableHttp2, objPoolGroup.enableHttp2)&&
  Objects.equals(this.minServers, objPoolGroup.minServers)&&
  Objects.equals(this.priorityLabelsRef, objPoolGroup.priorityLabelsRef)&&
  Objects.equals(this.failAction, objPoolGroup.failAction)&&
  Objects.equals(this.serviceMetadata, objPoolGroup.serviceMetadata)&&
  Objects.equals(this.tenantRef, objPoolGroup.tenantRef)&&
  Objects.equals(this.name, objPoolGroup.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PoolGroup {\n");
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

