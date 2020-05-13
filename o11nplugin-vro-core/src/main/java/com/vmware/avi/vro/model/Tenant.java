package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.TenantConfiguration;
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
 * Tenant
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "Tenant")
@VsoFinder(name = Constants.FINDER_VRO_TENANT, idAccessor = "getObjectID()")
@Service
public class Tenant extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("config_settings")
  private TenantConfiguration configSettings = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("local")
  private Boolean local = true;

  @JsonProperty("name")
  private String name = null;

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
   * Placeholder for description of property config_settings of obj type Tenant field type str  type object
   * @return configSettings
  **/
  @ApiModelProperty(value = "Placeholder for description of property config_settings of obj type Tenant field type str  type object")

  @Valid

 
  @VsoMethod  
  public TenantConfiguration getConfigSettings() {
    return configSettings;
  }
    
  @VsoMethod
  public void setConfigSettings(TenantConfiguration configSettings) {
    this.configSettings = configSettings;
  }

  
  /**
   * Creator of this tenant.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Creator of this tenant.")


 
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
   * Placeholder for description of property local of obj type Tenant field type str  type boolean
   * @return local
  **/
  @ApiModelProperty(value = "Placeholder for description of property local of obj type Tenant field type str  type boolean")


 
  @VsoMethod  
  public Boolean isLocal() {
    return local;
  }
    
  @VsoMethod
  public void setLocal(Boolean local) {
    this.local = local;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
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
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "Tenant";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tenant tenant = (Tenant) o;
    return Objects.equals(this.lastModified, tenant.lastModified) &&
        Objects.equals(this.configSettings, tenant.configSettings) &&
        Objects.equals(this.createdBy, tenant.createdBy) &&
        Objects.equals(this.description, tenant.description) &&
        Objects.equals(this.local, tenant.local) &&
        Objects.equals(this.name, tenant.name) &&
        Objects.equals(this.url, tenant.url) &&
        Objects.equals(this.uuid, tenant.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, configSettings, createdBy, description, local, name, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenant {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    configSettings: ").append(toIndentedString(configSettings)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

