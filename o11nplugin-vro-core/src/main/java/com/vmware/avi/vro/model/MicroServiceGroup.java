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
 * MicroServiceGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "MicroServiceGroup")
@VsoFinder(name = Constants.FINDER_VRO_MICROSERVICEGROUP, idAccessor = "getObjectID()")
@Service
public class MicroServiceGroup extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("service_refs")
  @Valid
  private List<String> serviceRefs = null;

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
   * Creator name.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Creator name.")


 
  @VsoMethod  
  public String getCreatedBy() {
    return createdBy;
  }
    
  @VsoMethod
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
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
   * Name of the MicroService group.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the MicroService group.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public MicroServiceGroup addServiceRefsItem(String serviceRefsItem) {
    if (this.serviceRefs == null) {
      this.serviceRefs = new ArrayList<String>();
    }
    this.serviceRefs.add(serviceRefsItem);
    return this;
  }
  
  /**
   * Configure MicroService(es). It is a reference to an object of type MicroService.
   * @return serviceRefs
  **/
  @ApiModelProperty(value = "Configure MicroService(es). It is a reference to an object of type MicroService.")


 
  @VsoMethod  
  public List<String> getServiceRefs() {
    return serviceRefs;
  }
    
  @VsoMethod
  public void setServiceRefs(List<String> serviceRefs) {
    this.serviceRefs = serviceRefs;
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
   * UUID of the MicroService group.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the MicroService group.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "MicroServiceGroup";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicroServiceGroup microServiceGroup = (MicroServiceGroup) o;
    return Objects.equals(this.lastModified, microServiceGroup.lastModified) &&
        Objects.equals(this.createdBy, microServiceGroup.createdBy) &&
        Objects.equals(this.description, microServiceGroup.description) &&
        Objects.equals(this.name, microServiceGroup.name) &&
        Objects.equals(this.serviceRefs, microServiceGroup.serviceRefs) &&
        Objects.equals(this.tenantRef, microServiceGroup.tenantRef) &&
        Objects.equals(this.url, microServiceGroup.url) &&
        Objects.equals(this.uuid, microServiceGroup.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, createdBy, description, name, serviceRefs, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicroServiceGroup {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceRefs: ").append(toIndentedString(serviceRefs)).append("\n");
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

