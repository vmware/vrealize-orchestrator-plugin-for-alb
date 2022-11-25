package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.OshiftDockerRegistryMetaData;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DockerRegistry is a POJO class extends AviRestResource that used for creating
 * DockerRegistry.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DockerRegistry")
@VsoFinder(name = Constants.FINDER_VRO_DOCKERREGISTRY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DockerRegistry extends AviRestResource {
    @JsonProperty("oshift_registry")
    @JsonInclude(Include.NON_NULL)
    private OshiftDockerRegistryMetaData oshiftRegistry = null;

    @JsonProperty("password")
    @JsonInclude(Include.NON_NULL)
    private String password = null;

    @JsonProperty("privates")
    @JsonInclude(Include.NON_NULL)
    private Boolean privates = false;

    @JsonProperty("registry")
    @JsonInclude(Include.NON_NULL)
    private String registry = "avinetworks/se";

    @JsonProperty("se_repository_push")
    @JsonInclude(Include.NON_NULL)
    private Boolean seRepositoryPush;

    @JsonProperty("username")
    @JsonInclude(Include.NON_NULL)
    private String username = null;



  /**
   * This is the getter method this will return the attribute value.
   * Openshift integrated registry config.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oshiftRegistry
   */
  @VsoMethod
  public OshiftDockerRegistryMetaData getOshiftRegistry() {
    return oshiftRegistry;
  }

  /**
   * This is the setter method to the attribute.
   * Openshift integrated registry config.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param oshiftRegistry set the oshiftRegistry.
   */
  @VsoMethod
  public void setOshiftRegistry(OshiftDockerRegistryMetaData oshiftRegistry) {
    this.oshiftRegistry = oshiftRegistry;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Password for docker registry.
   * Authorized 'regular user' password if registry is openshift integrated registry.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return password
   */
  @VsoMethod
  public String getPassword() {
    return password;
  }

  /**
   * This is the setter method to the attribute.
   * Password for docker registry.
   * Authorized 'regular user' password if registry is openshift integrated registry.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param password set the password.
   */
  @VsoMethod
  public void setPassword(String  password) {
    this.password = password;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Set if docker registry is private.
   * Avi controller will not attempt to push se image to the registry, unless se_repository_push is set.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return privates
   */
  @VsoMethod
  public Boolean getPrivates() {
    return privates;
  }

  /**
   * This is the setter method to the attribute.
   * Set if docker registry is private.
   * Avi controller will not attempt to push se image to the registry, unless se_repository_push is set.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param privates set the privates.
   */
  @VsoMethod
  public void setPrivates(Boolean  privates) {
    this.privates = privates;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Avi serviceengine repository name.
   * For private registry, it's registry port/repository, for public registry, it's registry/repository, for openshift registry, it's registry
   * port/namespace/repo.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "avinetworks/se".
   * @return registry
   */
  @VsoMethod
  public String getRegistry() {
    return registry;
  }

  /**
   * This is the setter method to the attribute.
   * Avi serviceengine repository name.
   * For private registry, it's registry port/repository, for public registry, it's registry/repository, for openshift registry, it's registry
   * port/namespace/repo.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "avinetworks/se".
   * @param registry set the registry.
   */
  @VsoMethod
  public void setRegistry(String  registry) {
    this.registry = registry;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Avi controller will push serviceengine image to docker repository.
   * Field deprecated in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return seRepositoryPush
   */
  @VsoMethod
  public Boolean getSeRepositoryPush() {
    return seRepositoryPush;
  }

  /**
   * This is the setter method to the attribute.
   * Avi controller will push serviceengine image to docker repository.
   * Field deprecated in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param seRepositoryPush set the seRepositoryPush.
   */
  @VsoMethod
  public void setSeRepositoryPush(Boolean  seRepositoryPush) {
    this.seRepositoryPush = seRepositoryPush;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Username for docker registry.
   * Authorized 'regular user' if registry is openshift integrated registry.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return username
   */
  @VsoMethod
  public String getUsername() {
    return username;
  }

  /**
   * This is the setter method to the attribute.
   * Username for docker registry.
   * Authorized 'regular user' if registry is openshift integrated registry.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param username set the username.
   */
  @VsoMethod
  public void setUsername(String  username) {
    this.username = username;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DockerRegistry objDockerRegistry = (DockerRegistry) o;
  return   Objects.equals(this.registry, objDockerRegistry.registry)&&
  Objects.equals(this.privates, objDockerRegistry.privates)&&
  Objects.equals(this.username, objDockerRegistry.username)&&
  Objects.equals(this.password, objDockerRegistry.password)&&
  Objects.equals(this.seRepositoryPush, objDockerRegistry.seRepositoryPush)&&
  Objects.equals(this.oshiftRegistry, objDockerRegistry.oshiftRegistry);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DockerRegistry {\n");
      sb.append("    oshiftRegistry: ").append(toIndentedString(oshiftRegistry)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    privates: ").append(toIndentedString(privates)).append("\n");
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

