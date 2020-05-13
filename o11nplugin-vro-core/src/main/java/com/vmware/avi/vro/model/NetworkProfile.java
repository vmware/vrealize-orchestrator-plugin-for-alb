package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.NetworkProfileUnion;
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
 * NetworkProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NetworkProfile")
@VsoFinder(name = Constants.FINDER_VRO_NETWORKPROFILE, idAccessor = "getObjectID()")
@Service
public class NetworkProfile extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("connection_mirror")
  private Boolean connectionMirror = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("profile")
  private NetworkProfileUnion profile = null;

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
   * When enabled, Avi mirrors all TCP fastpath connections to standby. Applicable only in Legacy HA Mode. Field introduced in 18.1.3,18.2.1.
   * @return connectionMirror
  **/
  @ApiModelProperty(value = "When enabled, Avi mirrors all TCP fastpath connections to standby. Applicable only in Legacy HA Mode. Field introduced in 18.1.3,18.2.1.")


 
  @VsoMethod  
  public Boolean isConnectionMirror() {
    return connectionMirror;
  }
    
  @VsoMethod
  public void setConnectionMirror(Boolean connectionMirror) {
    this.connectionMirror = connectionMirror;
  }

  
  /**
   * User defined description for the object.
   * @return description
  **/
  @ApiModelProperty(value = "User defined description for the object.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The name of the network profile.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the network profile.")
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
   * Placeholder for description of property profile of obj type NetworkProfile field type str  type object
   * @return profile
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property profile of obj type NetworkProfile field type str  type object")
  @NotNull

  @Valid

 
  @VsoMethod  
  public NetworkProfileUnion getProfile() {
    return profile;
  }
    
  @VsoMethod
  public void setProfile(NetworkProfileUnion profile) {
    this.profile = profile;
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
   * UUID of the network profile.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the network profile.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "NetworkProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkProfile networkProfile = (NetworkProfile) o;
    return Objects.equals(this.lastModified, networkProfile.lastModified) &&
        Objects.equals(this.connectionMirror, networkProfile.connectionMirror) &&
        Objects.equals(this.description, networkProfile.description) &&
        Objects.equals(this.name, networkProfile.name) &&
        Objects.equals(this.profile, networkProfile.profile) &&
        Objects.equals(this.tenantRef, networkProfile.tenantRef) &&
        Objects.equals(this.url, networkProfile.url) &&
        Objects.equals(this.uuid, networkProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, connectionMirror, description, name, profile, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkProfile {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    connectionMirror: ").append(toIndentedString(connectionMirror)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

