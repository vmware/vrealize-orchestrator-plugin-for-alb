package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.OshiftDockerRegistryMetaData;
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
 * DockerRegistry
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DockerRegistry")
@VsoFinder(name = Constants.FINDER_VRO_DOCKERREGISTRY, idAccessor = "getObjectID()")
@Service
public class DockerRegistry extends AviRestResource  {
  @JsonProperty("oshift_registry")
  private OshiftDockerRegistryMetaData oshiftRegistry = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("private")
  private Boolean _private = null;

  @JsonProperty("registry")
  private String registry = "avinetworks/se";

  @JsonProperty("se_repository_push")
  private Boolean seRepositoryPush = null;

  @JsonProperty("username")
  private String username = null;

  
  /**
   * Openshift integrated registry config.
   * @return oshiftRegistry
  **/
  @ApiModelProperty(value = "Openshift integrated registry config.")

  @Valid

 
  @VsoMethod  
  public OshiftDockerRegistryMetaData getOshiftRegistry() {
    return oshiftRegistry;
  }
    
  @VsoMethod
  public void setOshiftRegistry(OshiftDockerRegistryMetaData oshiftRegistry) {
    this.oshiftRegistry = oshiftRegistry;
  }

  
  /**
   * Password for docker registry. Authorized 'regular user' password if registry is Openshift integrated registry.
   * @return password
  **/
  @ApiModelProperty(value = "Password for docker registry. Authorized 'regular user' password if registry is Openshift integrated registry.")


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * Set if docker registry is private. Avi controller will not attempt to push SE image to the registry, unless se_repository_push is set.
   * @return _private
  **/
  @ApiModelProperty(value = "Set if docker registry is private. Avi controller will not attempt to push SE image to the registry, unless se_repository_push is set.")


 
  @VsoMethod  
  public Boolean isPrivate() {
    return _private;
  }
    
  @VsoMethod
  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  
  /**
   * Avi ServiceEngine repository name. For private registry, it's registry port/repository, for public registry, it's registry/repository, for openshift registry, it's registry port/namespace/repo.
   * @return registry
  **/
  @ApiModelProperty(value = "Avi ServiceEngine repository name. For private registry, it's registry port/repository, for public registry, it's registry/repository, for openshift registry, it's registry port/namespace/repo.")


 
  @VsoMethod  
  public String getRegistry() {
    return registry;
  }
    
  @VsoMethod
  public void setRegistry(String registry) {
    this.registry = registry;
  }

  
  /**
   * Avi Controller will push ServiceEngine image to docker repository. Field deprecated in 18.2.6.
   * @return seRepositoryPush
  **/
  @ApiModelProperty(value = "Avi Controller will push ServiceEngine image to docker repository. Field deprecated in 18.2.6.")


 
  @VsoMethod  
  public Boolean isSeRepositoryPush() {
    return seRepositoryPush;
  }
    
  @VsoMethod
  public void setSeRepositoryPush(Boolean seRepositoryPush) {
    this.seRepositoryPush = seRepositoryPush;
  }

  
  /**
   * Username for docker registry. Authorized 'regular user' if registry is Openshift integrated registry.
   * @return username
  **/
  @ApiModelProperty(value = "Username for docker registry. Authorized 'regular user' if registry is Openshift integrated registry.")


 
  @VsoMethod  
  public String getUsername() {
    return username;
  }
    
  @VsoMethod
  public void setUsername(String username) {
    this.username = username;
  }

  
  public String getObjectID() {
		return "DockerRegistry";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DockerRegistry dockerRegistry = (DockerRegistry) o;
    return Objects.equals(this.oshiftRegistry, dockerRegistry.oshiftRegistry) &&
        Objects.equals(this.password, dockerRegistry.password) &&
        Objects.equals(this._private, dockerRegistry._private) &&
        Objects.equals(this.registry, dockerRegistry.registry) &&
        Objects.equals(this.seRepositoryPush, dockerRegistry.seRepositoryPush) &&
        Objects.equals(this.username, dockerRegistry.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oshiftRegistry, password, _private, registry, seRepositoryPush, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DockerRegistry {\n");
    
    sb.append("    oshiftRegistry: ").append(toIndentedString(oshiftRegistry)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("    seRepositoryPush: ").append(toIndentedString(seRepositoryPush)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

