package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AkoAmkoClusterDeploymentInfo;
import com.vmware.avi.vro.model.AkoAmkoClusterMetadata;
import com.vmware.avi.vro.model.AkoAmkoClusterVersionInfo;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The AkoAmkoCluster is a POJO class extends AviRestResource that used for creating
 * AkoAmkoCluster.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AkoAmkoCluster")
@VsoFinder(name = Constants.FINDER_VRO_AKOAMKOCLUSTER, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AkoAmkoCluster extends AviRestResource {
    @JsonProperty("cloud_config_cksum")
    @JsonInclude(Include.NON_NULL)
    private String cloudConfigCksum;

    @JsonProperty("cloud_ref")
    @JsonInclude(Include.NON_NULL)
    private String cloudRef;

    @JsonProperty("cluster_type")
    @JsonInclude(Include.NON_NULL)
    private String clusterType;

    @JsonProperty("created_by")
    @JsonInclude(Include.NON_NULL)
    private String createdBy;

    @JsonProperty("deployment_info")
    @JsonInclude(Include.NON_NULL)
    private AkoAmkoClusterDeploymentInfo deploymentInfo;

    @JsonProperty("metadata")
    @JsonInclude(Include.NON_NULL)
    private AkoAmkoClusterMetadata metadata;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("version_info")
    @JsonInclude(Include.NON_NULL)
    private AkoAmkoClusterVersionInfo versionInfo;



  /**
   * This is the getter method this will return the attribute value.
   * Checksum of the cloud configuration for akoamkocluster object.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudConfigCksum
   */
  @VsoMethod
  public String getCloudConfigCksum() {
    return cloudConfigCksum;
  }

  /**
   * This is the setter method to the attribute.
   * Checksum of the cloud configuration for akoamkocluster object.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudConfigCksum set the cloudConfigCksum.
   */
  @VsoMethod
  public void setCloudConfigCksum(String  cloudConfigCksum) {
    this.cloudConfigCksum = cloudConfigCksum;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cloud reference uuid in avi controller.
   * It is a reference to an object of type cloud.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudRef
   */
  @VsoMethod
  public String getCloudRef() {
    return cloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud reference uuid in avi controller.
   * It is a reference to an object of type cloud.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudRef set the cloudRef.
   */
  @VsoMethod
  public void setCloudRef(String  cloudRef) {
    this.cloudRef = cloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of operator - ako or amko.
   * Enum options - CLUSTER_TYPE_AKO, CLUSTER_TYPE_AMKO.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clusterType
   */
  @VsoMethod
  public String getClusterType() {
    return clusterType;
  }

  /**
   * This is the setter method to the attribute.
   * Type of operator - ako or amko.
   * Enum options - CLUSTER_TYPE_AKO, CLUSTER_TYPE_AMKO.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clusterType set the clusterType.
   */
  @VsoMethod
  public void setClusterType(String  clusterType) {
    this.clusterType = clusterType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ako/amko user identifier.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return createdBy
   */
  @VsoMethod
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * This is the setter method to the attribute.
   * Ako/amko user identifier.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param createdBy set the createdBy.
   */
  @VsoMethod
  public void setCreatedBy(String  createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Deployment configuration information.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return deploymentInfo
   */
  @VsoMethod
  public AkoAmkoClusterDeploymentInfo getDeploymentInfo() {
    return deploymentInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Deployment configuration information.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param deploymentInfo set the deploymentInfo.
   */
  @VsoMethod
  public void setDeploymentInfo(AkoAmkoClusterDeploymentInfo deploymentInfo) {
    this.deploymentInfo = deploymentInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Additional cluster metadata.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metadata
   */
  @VsoMethod
  public AkoAmkoClusterMetadata getMetadata() {
    return metadata;
  }

  /**
   * This is the setter method to the attribute.
   * Additional cluster metadata.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metadata set the metadata.
   */
  @VsoMethod
  public void setMetadata(AkoAmkoClusterMetadata metadata) {
    this.metadata = metadata;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the ako/amko cluster.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the ako/amko cluster.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant that ako/amko cluster belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant that ako/amko cluster belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Uuid of the ako/amko cluster.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the ako/amko cluster.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Version information including kubernetes and ako/amko versions.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return versionInfo
   */
  @VsoMethod
  public AkoAmkoClusterVersionInfo getVersionInfo() {
    return versionInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Version information including kubernetes and ako/amko versions.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param versionInfo set the versionInfo.
   */
  @VsoMethod
  public void setVersionInfo(AkoAmkoClusterVersionInfo versionInfo) {
    this.versionInfo = versionInfo;
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
  AkoAmkoCluster objAkoAmkoCluster = (AkoAmkoCluster) o;
  return   Objects.equals(this.uuid, objAkoAmkoCluster.uuid)&&
  Objects.equals(this.name, objAkoAmkoCluster.name)&&
  Objects.equals(this.createdBy, objAkoAmkoCluster.createdBy)&&
  Objects.equals(this.clusterType, objAkoAmkoCluster.clusterType)&&
  Objects.equals(this.cloudRef, objAkoAmkoCluster.cloudRef)&&
  Objects.equals(this.versionInfo, objAkoAmkoCluster.versionInfo)&&
  Objects.equals(this.deploymentInfo, objAkoAmkoCluster.deploymentInfo)&&
  Objects.equals(this.metadata, objAkoAmkoCluster.metadata)&&
  Objects.equals(this.tenantRef, objAkoAmkoCluster.tenantRef)&&
  Objects.equals(this.cloudConfigCksum, objAkoAmkoCluster.cloudConfigCksum);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AkoAmkoCluster {\n");
      sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    deploymentInfo: ").append(toIndentedString(deploymentInfo)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    versionInfo: ").append(toIndentedString(versionInfo)).append("\n");
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

