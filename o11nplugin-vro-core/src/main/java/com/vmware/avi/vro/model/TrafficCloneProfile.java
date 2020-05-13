package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CloneServer;
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
 * TrafficCloneProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "TrafficCloneProfile")
@VsoFinder(name = Constants.FINDER_VRO_TRAFFICCLONEPROFILE, idAccessor = "getObjectID()")
@Service
public class TrafficCloneProfile extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("clone_servers")
  @Valid
  private List<CloneServer> cloneServers = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("preserve_client_ip")
  private Boolean preserveClientIp = null;

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

  
  public TrafficCloneProfile addCloneServersItem(CloneServer cloneServersItem) {
    if (this.cloneServers == null) {
      this.cloneServers = new ArrayList<CloneServer>();
    }
    this.cloneServers.add(cloneServersItem);
    return this;
  }
  
  /**
   *  Field introduced in 17.1.1.
   * @return cloneServers
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<CloneServer> getCloneServers() {
    return cloneServers;
  }
    
  @VsoMethod
  public void setCloneServers(List<CloneServer> cloneServers) {
    this.cloneServers = cloneServers;
  }

  
  /**
   *  It is a reference to an object of type Cloud. Field introduced in 17.1.1.
   * @return cloudRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Cloud. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getCloudRef() {
    return cloudRef;
  }
    
  @VsoMethod
  public void setCloudRef(String cloudRef) {
    this.cloudRef = cloudRef;
  }

  
  /**
   * Name for the Traffic Clone Profile. Field introduced in 17.1.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name for the Traffic Clone Profile. Field introduced in 17.1.1.")
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
   * Specifies if client IP needs to be preserved to clone destination. Field introduced in 17.1.1.
   * @return preserveClientIp
  **/
  @ApiModelProperty(value = "Specifies if client IP needs to be preserved to clone destination. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isPreserveClientIp() {
    return preserveClientIp;
  }
    
  @VsoMethod
  public void setPreserveClientIp(Boolean preserveClientIp) {
    this.preserveClientIp = preserveClientIp;
  }

  
  /**
   *  It is a reference to an object of type Tenant. Field introduced in 17.1.1.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant. Field introduced in 17.1.1.")


 
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
   * UUID of the Traffic Clone Profile. Field introduced in 17.1.1.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the Traffic Clone Profile. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "TrafficCloneProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrafficCloneProfile trafficCloneProfile = (TrafficCloneProfile) o;
    return Objects.equals(this.lastModified, trafficCloneProfile.lastModified) &&
        Objects.equals(this.cloneServers, trafficCloneProfile.cloneServers) &&
        Objects.equals(this.cloudRef, trafficCloneProfile.cloudRef) &&
        Objects.equals(this.name, trafficCloneProfile.name) &&
        Objects.equals(this.preserveClientIp, trafficCloneProfile.preserveClientIp) &&
        Objects.equals(this.tenantRef, trafficCloneProfile.tenantRef) &&
        Objects.equals(this.url, trafficCloneProfile.url) &&
        Objects.equals(this.uuid, trafficCloneProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, cloneServers, cloudRef, name, preserveClientIp, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrafficCloneProfile {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    cloneServers: ").append(toIndentedString(cloneServers)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preserveClientIp: ").append(toIndentedString(preserveClientIp)).append("\n");
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

