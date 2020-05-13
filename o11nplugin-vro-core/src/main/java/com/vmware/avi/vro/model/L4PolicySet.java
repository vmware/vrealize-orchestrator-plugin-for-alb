package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.L4ConnectionPolicy;
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
 * L4PolicySet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "L4PolicySet")
@VsoFinder(name = Constants.FINDER_VRO_L4POLICYSET, idAccessor = "getObjectID()")
@Service
public class L4PolicySet extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("is_internal_policy")
  private Boolean isInternalPolicy = null;

  @JsonProperty("l4_connection_policy")
  private L4ConnectionPolicy l4ConnectionPolicy = null;

  @JsonProperty("name")
  private String name = null;

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
   * Creator name. Field introduced in 17.2.7.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Creator name. Field introduced in 17.2.7.")


 
  @VsoMethod  
  public String getCreatedBy() {
    return createdBy;
  }
    
  @VsoMethod
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   *  Field introduced in 17.2.7.
   * @return description
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.7.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   *  Field introduced in 17.2.7.
   * @return isInternalPolicy
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.7.")


 
  @VsoMethod  
  public Boolean isIsInternalPolicy() {
    return isInternalPolicy;
  }
    
  @VsoMethod
  public void setIsInternalPolicy(Boolean isInternalPolicy) {
    this.isInternalPolicy = isInternalPolicy;
  }

  
  /**
   * Policy to apply when a new transport connection is setup. Field introduced in 17.2.7.
   * @return l4ConnectionPolicy
  **/
  @ApiModelProperty(value = "Policy to apply when a new transport connection is setup. Field introduced in 17.2.7.")

  @Valid

 
  @VsoMethod  
  public L4ConnectionPolicy getL4ConnectionPolicy() {
    return l4ConnectionPolicy;
  }
    
  @VsoMethod
  public void setL4ConnectionPolicy(L4ConnectionPolicy l4ConnectionPolicy) {
    this.l4ConnectionPolicy = l4ConnectionPolicy;
  }

  
  /**
   * Name of the L4 Policy Set. Field introduced in 17.2.7.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the L4 Policy Set. Field introduced in 17.2.7.")
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
   *  It is a reference to an object of type Tenant. Field introduced in 17.2.7.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant. Field introduced in 17.2.7.")


 
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
   * ID of the L4 Policy Set. Field introduced in 17.2.7.
   * @return uuid
  **/
  @ApiModelProperty(value = "ID of the L4 Policy Set. Field introduced in 17.2.7.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "L4PolicySet";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L4PolicySet l4PolicySet = (L4PolicySet) o;
    return Objects.equals(this.lastModified, l4PolicySet.lastModified) &&
        Objects.equals(this.createdBy, l4PolicySet.createdBy) &&
        Objects.equals(this.description, l4PolicySet.description) &&
        Objects.equals(this.isInternalPolicy, l4PolicySet.isInternalPolicy) &&
        Objects.equals(this.l4ConnectionPolicy, l4PolicySet.l4ConnectionPolicy) &&
        Objects.equals(this.name, l4PolicySet.name) &&
        Objects.equals(this.tenantRef, l4PolicySet.tenantRef) &&
        Objects.equals(this.url, l4PolicySet.url) &&
        Objects.equals(this.uuid, l4PolicySet.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, createdBy, description, isInternalPolicy, l4ConnectionPolicy, name, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L4PolicySet {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isInternalPolicy: ").append(toIndentedString(isInternalPolicy)).append("\n");
    sb.append("    l4ConnectionPolicy: ").append(toIndentedString(l4ConnectionPolicy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

