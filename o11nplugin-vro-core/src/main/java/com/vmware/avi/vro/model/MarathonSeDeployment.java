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
 * MarathonSeDeployment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "MarathonSeDeployment")
@VsoFinder(name = Constants.FINDER_VRO_MARATHONSEDEPLOYMENT, idAccessor = "getObjectID()")
@Service
public class MarathonSeDeployment extends AviRestResource  {
  @JsonProperty("docker_image")
  private String dockerImage = "fedora";

  @JsonProperty("host_os")
  private String hostOs = "COREOS";

  @JsonProperty("resource_roles")
  @Valid
  private List<String> resourceRoles = null;

  @JsonProperty("uris")
  @Valid
  private List<String> uris = null;

  
  /**
   * Docker image to be used for Avi SE installation e.g. fedora, ubuntu.
   * @return dockerImage
  **/
  @ApiModelProperty(value = "Docker image to be used for Avi SE installation e.g. fedora, ubuntu.")


 
  @VsoMethod  
  public String getDockerImage() {
    return dockerImage;
  }
    
  @VsoMethod
  public void setDockerImage(String dockerImage) {
    this.dockerImage = dockerImage;
  }

  
  /**
   * Host OS distribution e.g. COREOS, UBUNTU, REDHAT.
   * @return hostOs
  **/
  @ApiModelProperty(value = "Host OS distribution e.g. COREOS, UBUNTU, REDHAT.")


 
  @VsoMethod  
  public String getHostOs() {
    return hostOs;
  }
    
  @VsoMethod
  public void setHostOs(String hostOs) {
    this.hostOs = hostOs;
  }

  
  public MarathonSeDeployment addResourceRolesItem(String resourceRolesItem) {
    if (this.resourceRoles == null) {
      this.resourceRoles = new ArrayList<String>();
    }
    this.resourceRoles.add(resourceRolesItem);
    return this;
  }
  
  /**
   * Accepted resource roles for SEs.
   * @return resourceRoles
  **/
  @ApiModelProperty(value = "Accepted resource roles for SEs.")


 
  @VsoMethod  
  public List<String> getResourceRoles() {
    return resourceRoles;
  }
    
  @VsoMethod
  public void setResourceRoles(List<String> resourceRoles) {
    this.resourceRoles = resourceRoles;
  }

  
  public MarathonSeDeployment addUrisItem(String urisItem) {
    if (this.uris == null) {
      this.uris = new ArrayList<String>();
    }
    this.uris.add(urisItem);
    return this;
  }
  
  /**
   * URIs to be resolved for starting the application.
   * @return uris
  **/
  @ApiModelProperty(value = "URIs to be resolved for starting the application.")


 
  @VsoMethod  
  public List<String> getUris() {
    return uris;
  }
    
  @VsoMethod
  public void setUris(List<String> uris) {
    this.uris = uris;
  }

  
  public String getObjectID() {
		return "MarathonSeDeployment";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarathonSeDeployment marathonSeDeployment = (MarathonSeDeployment) o;
    return Objects.equals(this.dockerImage, marathonSeDeployment.dockerImage) &&
        Objects.equals(this.hostOs, marathonSeDeployment.hostOs) &&
        Objects.equals(this.resourceRoles, marathonSeDeployment.resourceRoles) &&
        Objects.equals(this.uris, marathonSeDeployment.uris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dockerImage, hostOs, resourceRoles, uris);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarathonSeDeployment {\n");
    
    sb.append("    dockerImage: ").append(toIndentedString(dockerImage)).append("\n");
    sb.append("    hostOs: ").append(toIndentedString(hostOs)).append("\n");
    sb.append("    resourceRoles: ").append(toIndentedString(resourceRoles)).append("\n");
    sb.append("    uris: ").append(toIndentedString(uris)).append("\n");
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

