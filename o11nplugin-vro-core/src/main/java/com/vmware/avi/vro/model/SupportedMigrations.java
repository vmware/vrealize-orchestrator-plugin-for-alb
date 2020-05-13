package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * SupportedMigrations
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SupportedMigrations")
@VsoFinder(name = Constants.FINDER_VRO_SUPPORTEDMIGRATIONS, idAccessor = "getObjectID()")
@Service
public class SupportedMigrations extends AviRestResource  {
  @JsonProperty("api_version")
  private String apiVersion = null;

  @JsonProperty("controller_host_min_free_disk_size")
  private Integer controllerHostMinFreeDiskSize = 10;

  @JsonProperty("controller_min_free_disk_size")
  private Integer controllerMinFreeDiskSize = 10;

  @JsonProperty("max_active_versions")
  private Integer maxActiveVersions = 2;

  @JsonProperty("rollback_controller_disk_space")
  private Integer rollbackControllerDiskSpace = 2;

  @JsonProperty("rollback_se_disk_space")
  private Integer rollbackSeDiskSpace = 1;

  @JsonProperty("se_host_min_free_disk_size")
  private Integer seHostMinFreeDiskSize = 5;

  @JsonProperty("se_min_free_disk_size")
  private Integer seMinFreeDiskSize = 5;

  @JsonProperty("versions")
  @Valid
  private List<String> versions = null;

  
  /**
   * Api version of the image. Field introduced in 18.2.6.
   * @return apiVersion
  **/
  @ApiModelProperty(value = "Api version of the image. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getApiVersion() {
    return apiVersion;
  }
    
  @VsoMethod
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  
  /**
   * Minimum space required(in GB) on controller host for this image installation. Field introduced in 18.2.6.
   * @return controllerHostMinFreeDiskSize
  **/
  @ApiModelProperty(value = "Minimum space required(in GB) on controller host for this image installation. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getControllerHostMinFreeDiskSize() {
    return controllerHostMinFreeDiskSize;
  }
    
  @VsoMethod
  public void setControllerHostMinFreeDiskSize(Integer controllerHostMinFreeDiskSize) {
    this.controllerHostMinFreeDiskSize = controllerHostMinFreeDiskSize;
  }

  
  /**
   * Minimum space required(in GB) on controller for this image installation. Field introduced in 18.2.6.
   * @return controllerMinFreeDiskSize
  **/
  @ApiModelProperty(value = "Minimum space required(in GB) on controller for this image installation. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getControllerMinFreeDiskSize() {
    return controllerMinFreeDiskSize;
  }
    
  @VsoMethod
  public void setControllerMinFreeDiskSize(Integer controllerMinFreeDiskSize) {
    this.controllerMinFreeDiskSize = controllerMinFreeDiskSize;
  }

  
  /**
   * Supported active versions for this image. Field introduced in 18.2.6.
   * @return maxActiveVersions
  **/
  @ApiModelProperty(value = "Supported active versions for this image. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getMaxActiveVersions() {
    return maxActiveVersions;
  }
    
  @VsoMethod
  public void setMaxActiveVersions(Integer maxActiveVersions) {
    this.maxActiveVersions = maxActiveVersions;
  }

  
  /**
   * Minimum space required(in GB) on controller for rollback. Field introduced in 18.2.6.
   * @return rollbackControllerDiskSpace
  **/
  @ApiModelProperty(value = "Minimum space required(in GB) on controller for rollback. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getRollbackControllerDiskSpace() {
    return rollbackControllerDiskSpace;
  }
    
  @VsoMethod
  public void setRollbackControllerDiskSpace(Integer rollbackControllerDiskSpace) {
    this.rollbackControllerDiskSpace = rollbackControllerDiskSpace;
  }

  
  /**
   * Minimum space required(in GB) on se for rollback. Field introduced in 18.2.6.
   * @return rollbackSeDiskSpace
  **/
  @ApiModelProperty(value = "Minimum space required(in GB) on se for rollback. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getRollbackSeDiskSpace() {
    return rollbackSeDiskSpace;
  }
    
  @VsoMethod
  public void setRollbackSeDiskSpace(Integer rollbackSeDiskSpace) {
    this.rollbackSeDiskSpace = rollbackSeDiskSpace;
  }

  
  /**
   * Minimum space required(in GB) on se host for this image installation. Field introduced in 18.2.6.
   * @return seHostMinFreeDiskSize
  **/
  @ApiModelProperty(value = "Minimum space required(in GB) on se host for this image installation. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getSeHostMinFreeDiskSize() {
    return seHostMinFreeDiskSize;
  }
    
  @VsoMethod
  public void setSeHostMinFreeDiskSize(Integer seHostMinFreeDiskSize) {
    this.seHostMinFreeDiskSize = seHostMinFreeDiskSize;
  }

  
  /**
   * Minimum space required(in GB) on se for this image installation. Field introduced in 18.2.6.
   * @return seMinFreeDiskSize
  **/
  @ApiModelProperty(value = "Minimum space required(in GB) on se for this image installation. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getSeMinFreeDiskSize() {
    return seMinFreeDiskSize;
  }
    
  @VsoMethod
  public void setSeMinFreeDiskSize(Integer seMinFreeDiskSize) {
    this.seMinFreeDiskSize = seMinFreeDiskSize;
  }

  
  public SupportedMigrations addVersionsItem(String versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<String>();
    }
    this.versions.add(versionsItem);
    return this;
  }
  
  /**
   * Supported compatible versions for this image. Field introduced in 18.2.6.
   * @return versions
  **/
  @ApiModelProperty(value = "Supported compatible versions for this image. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public List<String> getVersions() {
    return versions;
  }
    
  @VsoMethod
  public void setVersions(List<String> versions) {
    this.versions = versions;
  }

  
  public String getObjectID() {
		return "SupportedMigrations";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedMigrations supportedMigrations = (SupportedMigrations) o;
    return Objects.equals(this.apiVersion, supportedMigrations.apiVersion) &&
        Objects.equals(this.controllerHostMinFreeDiskSize, supportedMigrations.controllerHostMinFreeDiskSize) &&
        Objects.equals(this.controllerMinFreeDiskSize, supportedMigrations.controllerMinFreeDiskSize) &&
        Objects.equals(this.maxActiveVersions, supportedMigrations.maxActiveVersions) &&
        Objects.equals(this.rollbackControllerDiskSpace, supportedMigrations.rollbackControllerDiskSpace) &&
        Objects.equals(this.rollbackSeDiskSpace, supportedMigrations.rollbackSeDiskSpace) &&
        Objects.equals(this.seHostMinFreeDiskSize, supportedMigrations.seHostMinFreeDiskSize) &&
        Objects.equals(this.seMinFreeDiskSize, supportedMigrations.seMinFreeDiskSize) &&
        Objects.equals(this.versions, supportedMigrations.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, controllerHostMinFreeDiskSize, controllerMinFreeDiskSize, maxActiveVersions, rollbackControllerDiskSpace, rollbackSeDiskSpace, seHostMinFreeDiskSize, seMinFreeDiskSize, versions);
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

