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

  @JsonProperty("controller_min_free_disk_size")
  @JsonInclude(Include.NON_NULL)
  private Integer controllerMinFreeDiskSize = 10;

  @JsonProperty("max_active_versions")
  @JsonInclude(Include.NON_NULL)
  private Integer maxActiveVersions = 2;

  @JsonProperty("rollback_controller_disk_space")
  @JsonInclude(Include.NON_NULL)
  private Integer rollbackControllerDiskSpace = 2;

  @JsonProperty("rollback_se_disk_space")
  @JsonInclude(Include.NON_NULL)
  private Integer rollbackSeDiskSpace = 1;

  @JsonProperty("se_host_min_free_disk_size")
  @JsonInclude(Include.NON_NULL)
  private Integer seHostMinFreeDiskSize = 5;

  @JsonProperty("se_min_free_disk_size")
  @JsonInclude(Include.NON_NULL)
  private Integer seMinFreeDiskSize = 5;

  @JsonProperty("versions")
  @JsonInclude(Include.NON_NULL)
  private List<String> versions = null;



  /**
   * This is the getter method this will return the attribute value.
   * Api version of the image.
   * Field introduced in 18.2.6.
   * @return apiVersion
   */
  @VsoMethod
  public String getApiVersion() {
    return apiVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Api version of the image.
   * Field introduced in 18.2.6.
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
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param controllerHostMinFreeDiskSize set the controllerHostMinFreeDiskSize.
   */
  @VsoMethod
  public void setControllerHostMinFreeDiskSize(Integer  controllerHostMinFreeDiskSize) {
    this.controllerHostMinFreeDiskSize = controllerHostMinFreeDiskSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum space required(in gb) on controller for this image installation.
   * Field introduced in 18.2.6.
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
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param controllerMinFreeDiskSize set the controllerMinFreeDiskSize.
   */
  @VsoMethod
  public void setControllerMinFreeDiskSize(Integer  controllerMinFreeDiskSize) {
    this.controllerMinFreeDiskSize = controllerMinFreeDiskSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Supported active versions for this image.
   * Field introduced in 18.2.6.
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
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param maxActiveVersions set the maxActiveVersions.
   */
  @VsoMethod
  public void setMaxActiveVersions(Integer  maxActiveVersions) {
    this.maxActiveVersions = maxActiveVersions;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum space required(in gb) on controller for rollback.
   * Field introduced in 18.2.6.
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
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param seHostMinFreeDiskSize set the seHostMinFreeDiskSize.
   */
  @VsoMethod
  public void setSeHostMinFreeDiskSize(Integer  seHostMinFreeDiskSize) {
    this.seHostMinFreeDiskSize = seHostMinFreeDiskSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum space required(in gb) on se for this image installation.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return seMinFreeDiskSize
   */
  @VsoMethod
  public Integer getSeMinFreeDiskSize() {
    return seMinFreeDiskSize;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum space required(in gb) on se for this image installation.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param seMinFreeDiskSize set the seMinFreeDiskSize.
   */
  @VsoMethod
  public void setSeMinFreeDiskSize(Integer  seMinFreeDiskSize) {
    this.seMinFreeDiskSize = seMinFreeDiskSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Supported compatible versions for this image.
   * Field introduced in 18.2.6.
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
  return   Objects.equals(this.seMinFreeDiskSize, objSupportedMigrations.seMinFreeDiskSize)&&
  Objects.equals(this.versions, objSupportedMigrations.versions)&&
  Objects.equals(this.controllerMinFreeDiskSize, objSupportedMigrations.controllerMinFreeDiskSize)&&
  Objects.equals(this.seHostMinFreeDiskSize, objSupportedMigrations.seHostMinFreeDiskSize)&&
  Objects.equals(this.controllerHostMinFreeDiskSize, objSupportedMigrations.controllerHostMinFreeDiskSize)&&
  Objects.equals(this.rollbackControllerDiskSpace, objSupportedMigrations.rollbackControllerDiskSpace)&&
  Objects.equals(this.maxActiveVersions, objSupportedMigrations.maxActiveVersions)&&
  Objects.equals(this.rollbackSeDiskSpace, objSupportedMigrations.rollbackSeDiskSpace)&&
  Objects.equals(this.apiVersion, objSupportedMigrations.apiVersion);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SupportedMigrations {\n");
      sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    controllerHostMinFreeDiskSize: ").append(toIndentedString(controllerHostMinFreeDiskSize)).append("\n");
        sb.append("    controllerMinFreeDiskSize: ").append(toIndentedString(controllerMinFreeDiskSize)).append("\n");
        sb.append("    maxActiveVersions: ").append(toIndentedString(maxActiveVersions)).append("\n");
        sb.append("    rollbackControllerDiskSpace: ").append(toIndentedString(rollbackControllerDiskSpace)).append("\n");
        sb.append("    rollbackSeDiskSpace: ").append(toIndentedString(rollbackSeDiskSpace)).append("\n");
        sb.append("    seHostMinFreeDiskSize: ").append(toIndentedString(seHostMinFreeDiskSize)).append("\n");
        sb.append("    seMinFreeDiskSize: ").append(toIndentedString(seMinFreeDiskSize)).append("\n");
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
