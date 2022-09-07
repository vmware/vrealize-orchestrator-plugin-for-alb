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
 * The SupportedMigrations is a POJO class extends AviRestResource that used for creating
 * SupportedMigrations.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SupportedMigrations")
@VsoFinder(name = Constants.FINDER_VRO_SUPPORTEDMIGRATIONS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SupportedMigrations extends AviRestResource {
    @JsonProperty("api_version")
    @JsonInclude(Include.NON_NULL)
    private String apiVersion = null;

    @JsonProperty("controller_host_min_free_disk_size")
    @JsonInclude(Include.NON_NULL)
    private Integer controllerHostMinFreeDiskSize = 10;

    @JsonProperty("controller_min_cores")
    @JsonInclude(Include.NON_NULL)
    private Integer controllerMinCores = 8;

    @JsonProperty("controller_min_docker_version")
    @JsonInclude(Include.NON_NULL)
    private String controllerMinDockerVersion = "1.6.1";

    @JsonProperty("controller_min_free_disk_size")
    @JsonInclude(Include.NON_NULL)
    private Integer controllerMinFreeDiskSize = 10;

    @JsonProperty("controller_min_memory")
    @JsonInclude(Include.NON_NULL)
    private Integer controllerMinMemory = 24;

    @JsonProperty("controller_min_total_disk")
    @JsonInclude(Include.NON_NULL)
    private Integer controllerMinTotalDisk = 128;

    @JsonProperty("max_active_versions")
    @JsonInclude(Include.NON_NULL)
    private Integer maxActiveVersions = 2;

    @JsonProperty("min_supported_api_version")
    @JsonInclude(Include.NON_NULL)
    private String minSupportedApiVersion = null;

    @JsonProperty("podman_controller_host_min_free_disk_size")
    @JsonInclude(Include.NON_NULL)
    private Integer podmanControllerHostMinFreeDiskSize = 24;

    @JsonProperty("podman_se_host_min_free_disk_size")
    @JsonInclude(Include.NON_NULL)
    private Integer podmanSeHostMinFreeDiskSize = 12;

    @JsonProperty("rollback_controller_disk_space")
    @JsonInclude(Include.NON_NULL)
    private Integer rollbackControllerDiskSpace = 2;

    @JsonProperty("rollback_se_disk_space")
    @JsonInclude(Include.NON_NULL)
    private Integer rollbackSeDiskSpace = 1;

    @JsonProperty("se_host_min_free_disk_size")
    @JsonInclude(Include.NON_NULL)
    private Integer seHostMinFreeDiskSize = 5;

    @JsonProperty("se_min_cores")
    @JsonInclude(Include.NON_NULL)
    private Integer seMinCores = 2;

    @JsonProperty("se_min_free_disk_size")
    @JsonInclude(Include.NON_NULL)
    private Integer seMinFreeDiskSize = 5;

    @JsonProperty("se_min_memory")
    @JsonInclude(Include.NON_NULL)
    private Integer seMinMemory = 2;

    @JsonProperty("se_min_total_disk")
    @JsonInclude(Include.NON_NULL)
    private Integer seMinTotalDisk = 10;

    @JsonProperty("versions")
    @JsonInclude(Include.NON_NULL)
    private List<String> versions = null;



  /**
   * This is the getter method this will return the attribute value.
   * Minimum accepted api version.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return apiVersion
   */
  @VsoMethod
  public String getApiVersion() {
    return apiVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum accepted api version.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param apiVersion set the apiVersion.
   */
  @VsoMethod
  public void setApiVersion(String  apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum space required(in gb) on controller host for this image installation.
   * Field introduced in 18.2.6.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return controllerHostMinFreeDiskSize
   */
  @VsoMethod
  public Integer getControllerHostMinFreeDiskSize() {
    return controllerHostMinFreeDiskSize;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum space required(in gb) on controller host for this image installation.
   * Field introduced in 18.2.6.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param controllerHostMinFreeDiskSize set the controllerHostMinFreeDiskSize.
   */
  @VsoMethod
  public void setControllerHostMinFreeDiskSize(Integer  controllerHostMinFreeDiskSize) {
    this.controllerHostMinFreeDiskSize = controllerHostMinFreeDiskSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum number of cores required for controller.
   * Field introduced in 18.2.10, 20.1.2.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 8.
   * @return controllerMinCores
   */
  @VsoMethod
  public Integer getControllerMinCores() {
    return controllerMinCores;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum number of cores required for controller.
   * Field introduced in 18.2.10, 20.1.2.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 8.
   * @param controllerMinCores set the controllerMinCores.
   */
  @VsoMethod
  public void setControllerMinCores(Integer  controllerMinCores) {
    this.controllerMinCores = controllerMinCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum supported docker version required for controller.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "1.6.1".
   * @return controllerMinDockerVersion
   */
  @VsoMethod
  public String getControllerMinDockerVersion() {
    return controllerMinDockerVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum supported docker version required for controller.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "1.6.1".
   * @param controllerMinDockerVersion set the controllerMinDockerVersion.
   */
  @VsoMethod
  public void setControllerMinDockerVersion(String  controllerMinDockerVersion) {
    this.controllerMinDockerVersion = controllerMinDockerVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum space required(in gb) on controller for this image installation.
   * Field introduced in 18.2.6.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return controllerMinFreeDiskSize
   */
  @VsoMethod
  public Integer getControllerMinFreeDiskSize() {
    return controllerMinFreeDiskSize;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum space required(in gb) on controller for this image installation.
   * Field introduced in 18.2.6.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param controllerMinFreeDiskSize set the controllerMinFreeDiskSize.
   */
  @VsoMethod
  public void setControllerMinFreeDiskSize(Integer  controllerMinFreeDiskSize) {
    this.controllerMinFreeDiskSize = controllerMinFreeDiskSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum memory required(in gb) for controller.
   * Field introduced in 18.2.10, 20.1.2.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 24.
   * @return controllerMinMemory
   */
  @VsoMethod
  public Integer getControllerMinMemory() {
    return controllerMinMemory;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum memory required(in gb) for controller.
   * Field introduced in 18.2.10, 20.1.2.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 24.
   * @param controllerMinMemory set the controllerMinMemory.
   */
  @VsoMethod
  public void setControllerMinMemory(Integer  controllerMinMemory) {
    this.controllerMinMemory = controllerMinMemory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum space required(in gb) for controller.
   * Field introduced in 18.2.10, 20.1.2.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 128.
   * @return controllerMinTotalDisk
   */
  @VsoMethod
  public Integer getControllerMinTotalDisk() {
    return controllerMinTotalDisk;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum space required(in gb) for controller.
   * Field introduced in 18.2.10, 20.1.2.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 128.
   * @param controllerMinTotalDisk set the controllerMinTotalDisk.
   */
  @VsoMethod
  public void setControllerMinTotalDisk(Integer  controllerMinTotalDisk) {
    this.controllerMinTotalDisk = controllerMinTotalDisk;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Supported active versions for this image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return maxActiveVersions
   */
  @VsoMethod
  public Integer getMaxActiveVersions() {
    return maxActiveVersions;
  }

  /**
   * This is the setter method to the attribute.
   * Supported active versions for this image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param maxActiveVersions set the maxActiveVersions.
   */
  @VsoMethod
  public void setMaxActiveVersions(Integer  maxActiveVersions) {
    this.maxActiveVersions = maxActiveVersions;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum supported api version.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return minSupportedApiVersion
   */
  @VsoMethod
  public String getMinSupportedApiVersion() {
    return minSupportedApiVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum supported api version.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param minSupportedApiVersion set the minSupportedApiVersion.
   */
  @VsoMethod
  public void setMinSupportedApiVersion(String  minSupportedApiVersion) {
    this.minSupportedApiVersion = minSupportedApiVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum space required(in gb) on podman controller host for this image installation.
   * Field introduced in 21.1.4.
   * Unit is gb.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 24.
   * @return podmanControllerHostMinFreeDiskSize
   */
  @VsoMethod
  public Integer getPodmanControllerHostMinFreeDiskSize() {
    return podmanControllerHostMinFreeDiskSize;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum space required(in gb) on podman controller host for this image installation.
   * Field introduced in 21.1.4.
   * Unit is gb.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 24.
   * @param podmanControllerHostMinFreeDiskSize set the podmanControllerHostMinFreeDiskSize.
   */
  @VsoMethod
  public void setPodmanControllerHostMinFreeDiskSize(Integer  podmanControllerHostMinFreeDiskSize) {
    this.podmanControllerHostMinFreeDiskSize = podmanControllerHostMinFreeDiskSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum space required(in gb) on podman se host for this image installation.
   * Field introduced in 21.1.4.
   * Unit is gb.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 12.
   * @return podmanSeHostMinFreeDiskSize
   */
  @VsoMethod
  public Integer getPodmanSeHostMinFreeDiskSize() {
    return podmanSeHostMinFreeDiskSize;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum space required(in gb) on podman se host for this image installation.
   * Field introduced in 21.1.4.
   * Unit is gb.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 12.
   * @param podmanSeHostMinFreeDiskSize set the podmanSeHostMinFreeDiskSize.
   */
  @VsoMethod
  public void setPodmanSeHostMinFreeDiskSize(Integer  podmanSeHostMinFreeDiskSize) {
    this.podmanSeHostMinFreeDiskSize = podmanSeHostMinFreeDiskSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum space required(in gb) on controller for rollback.
   * Field introduced in 18.2.6.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return rollbackControllerDiskSpace
   */
  @VsoMethod
  public Integer getRollbackControllerDiskSpace() {
    return rollbackControllerDiskSpace;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum space required(in gb) on controller for rollback.
   * Field introduced in 18.2.6.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param rollbackControllerDiskSpace set the rollbackControllerDiskSpace.
   */
  @VsoMethod
  public void setRollbackControllerDiskSpace(Integer  rollbackControllerDiskSpace) {
    this.rollbackControllerDiskSpace = rollbackControllerDiskSpace;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum space required(in gb) on se for rollback.
   * Field introduced in 18.2.6.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return rollbackSeDiskSpace
   */
  @VsoMethod
  public Integer getRollbackSeDiskSpace() {
    return rollbackSeDiskSpace;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum space required(in gb) on se for rollback.
   * Field introduced in 18.2.6.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param rollbackSeDiskSpace set the rollbackSeDiskSpace.
   */
  @VsoMethod
  public void setRollbackSeDiskSpace(Integer  rollbackSeDiskSpace) {
    this.rollbackSeDiskSpace = rollbackSeDiskSpace;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum space required(in gb) on se host for this image installation.
   * Field introduced in 18.2.6.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return seHostMinFreeDiskSize
   */
  @VsoMethod
  public Integer getSeHostMinFreeDiskSize() {
    return seHostMinFreeDiskSize;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum space required(in gb) on se host for this image installation.
   * Field introduced in 18.2.6.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param seHostMinFreeDiskSize set the seHostMinFreeDiskSize.
   */
  @VsoMethod
  public void setSeHostMinFreeDiskSize(Integer  seHostMinFreeDiskSize) {
    this.seHostMinFreeDiskSize = seHostMinFreeDiskSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum  number of cores required for se.
   * Field introduced in 18.2.10, 20.1.2.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return seMinCores
   */
  @VsoMethod
  public Integer getSeMinCores() {
    return seMinCores;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum  number of cores required for se.
   * Field introduced in 18.2.10, 20.1.2.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param seMinCores set the seMinCores.
   */
  @VsoMethod
  public void setSeMinCores(Integer  seMinCores) {
    this.seMinCores = seMinCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum space required(in gb) on se for this image installation for non-fips mode(+1 gb for fips mode).
   * Field introduced in 18.2.6.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return seMinFreeDiskSize
   */
  @VsoMethod
  public Integer getSeMinFreeDiskSize() {
    return seMinFreeDiskSize;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum space required(in gb) on se for this image installation for non-fips mode(+1 gb for fips mode).
   * Field introduced in 18.2.6.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param seMinFreeDiskSize set the seMinFreeDiskSize.
   */
  @VsoMethod
  public void setSeMinFreeDiskSize(Integer  seMinFreeDiskSize) {
    this.seMinFreeDiskSize = seMinFreeDiskSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum  memory required(in gb) for se.
   * Field introduced in 18.2.10, 20.1.2.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return seMinMemory
   */
  @VsoMethod
  public Integer getSeMinMemory() {
    return seMinMemory;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum  memory required(in gb) for se.
   * Field introduced in 18.2.10, 20.1.2.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param seMinMemory set the seMinMemory.
   */
  @VsoMethod
  public void setSeMinMemory(Integer  seMinMemory) {
    this.seMinMemory = seMinMemory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum space required(in gb) for se.
   * Field introduced in 18.2.10, 20.1.2.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return seMinTotalDisk
   */
  @VsoMethod
  public Integer getSeMinTotalDisk() {
    return seMinTotalDisk;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum space required(in gb) for se.
   * Field introduced in 18.2.10, 20.1.2.
   * Unit is gb.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param seMinTotalDisk set the seMinTotalDisk.
   */
  @VsoMethod
  public void setSeMinTotalDisk(Integer  seMinTotalDisk) {
    this.seMinTotalDisk = seMinTotalDisk;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Supported compatible versions for this image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return versions
   */
  @VsoMethod
  public List<String> getVersions() {
    return versions;
  }

  /**
   * This is the setter method. this will set the versions
   * Supported compatible versions for this image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return versions
   */
  @VsoMethod
  public void setVersions(List<String>  versions) {
    this.versions = versions;
  }

  /**
   * This is the setter method this will set the versions
   * Supported compatible versions for this image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return versions
   */
  @VsoMethod
  public SupportedMigrations addVersionsItem(String versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<String>();
    }
    this.versions.add(versionsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SupportedMigrations objSupportedMigrations = (SupportedMigrations) o;
  return   Objects.equals(this.apiVersion, objSupportedMigrations.apiVersion)&&
  Objects.equals(this.versions, objSupportedMigrations.versions)&&
  Objects.equals(this.maxActiveVersions, objSupportedMigrations.maxActiveVersions)&&
  Objects.equals(this.controllerMinFreeDiskSize, objSupportedMigrations.controllerMinFreeDiskSize)&&
  Objects.equals(this.seMinFreeDiskSize, objSupportedMigrations.seMinFreeDiskSize)&&
  Objects.equals(this.controllerHostMinFreeDiskSize, objSupportedMigrations.controllerHostMinFreeDiskSize)&&
  Objects.equals(this.seHostMinFreeDiskSize, objSupportedMigrations.seHostMinFreeDiskSize)&&
  Objects.equals(this.rollbackControllerDiskSpace, objSupportedMigrations.rollbackControllerDiskSpace)&&
  Objects.equals(this.rollbackSeDiskSpace, objSupportedMigrations.rollbackSeDiskSpace)&&
  Objects.equals(this.seMinTotalDisk, objSupportedMigrations.seMinTotalDisk)&&
  Objects.equals(this.seMinMemory, objSupportedMigrations.seMinMemory)&&
  Objects.equals(this.seMinCores, objSupportedMigrations.seMinCores)&&
  Objects.equals(this.controllerMinTotalDisk, objSupportedMigrations.controllerMinTotalDisk)&&
  Objects.equals(this.controllerMinMemory, objSupportedMigrations.controllerMinMemory)&&
  Objects.equals(this.controllerMinCores, objSupportedMigrations.controllerMinCores)&&
  Objects.equals(this.controllerMinDockerVersion, objSupportedMigrations.controllerMinDockerVersion)&&
  Objects.equals(this.minSupportedApiVersion, objSupportedMigrations.minSupportedApiVersion)&&
  Objects.equals(this.podmanControllerHostMinFreeDiskSize, objSupportedMigrations.podmanControllerHostMinFreeDiskSize)&&
  Objects.equals(this.podmanSeHostMinFreeDiskSize, objSupportedMigrations.podmanSeHostMinFreeDiskSize);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SupportedMigrations {\n");
      sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    controllerHostMinFreeDiskSize: ").append(toIndentedString(controllerHostMinFreeDiskSize)).append("\n");
        sb.append("    controllerMinCores: ").append(toIndentedString(controllerMinCores)).append("\n");
        sb.append("    controllerMinDockerVersion: ").append(toIndentedString(controllerMinDockerVersion)).append("\n");
        sb.append("    controllerMinFreeDiskSize: ").append(toIndentedString(controllerMinFreeDiskSize)).append("\n");
        sb.append("    controllerMinMemory: ").append(toIndentedString(controllerMinMemory)).append("\n");
        sb.append("    controllerMinTotalDisk: ").append(toIndentedString(controllerMinTotalDisk)).append("\n");
        sb.append("    maxActiveVersions: ").append(toIndentedString(maxActiveVersions)).append("\n");
        sb.append("    minSupportedApiVersion: ").append(toIndentedString(minSupportedApiVersion)).append("\n");
        sb.append("    podmanControllerHostMinFreeDiskSize: ").append(toIndentedString(podmanControllerHostMinFreeDiskSize)).append("\n");
        sb.append("    podmanSeHostMinFreeDiskSize: ").append(toIndentedString(podmanSeHostMinFreeDiskSize)).append("\n");
        sb.append("    rollbackControllerDiskSpace: ").append(toIndentedString(rollbackControllerDiskSpace)).append("\n");
        sb.append("    rollbackSeDiskSpace: ").append(toIndentedString(rollbackSeDiskSpace)).append("\n");
        sb.append("    seHostMinFreeDiskSize: ").append(toIndentedString(seHostMinFreeDiskSize)).append("\n");
        sb.append("    seMinCores: ").append(toIndentedString(seMinCores)).append("\n");
        sb.append("    seMinFreeDiskSize: ").append(toIndentedString(seMinFreeDiskSize)).append("\n");
        sb.append("    seMinMemory: ").append(toIndentedString(seMinMemory)).append("\n");
        sb.append("    seMinTotalDisk: ").append(toIndentedString(seMinTotalDisk)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

