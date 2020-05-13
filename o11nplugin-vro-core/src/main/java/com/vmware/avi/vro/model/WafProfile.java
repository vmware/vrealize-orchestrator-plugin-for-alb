package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.WafConfig;
import com.vmware.avi.vro.model.WafDataFile;
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
 * WafProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafProfile")
@VsoFinder(name = Constants.FINDER_VRO_WAFPROFILE, idAccessor = "getObjectID()")
@Service
public class WafProfile extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("config")
  private WafConfig config = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("files")
  @Valid
  private List<WafDataFile> files = null;

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
   * Config params for WAF. Field introduced in 17.2.1.
   * @return config
  **/
  @ApiModelProperty(required = true, value = "Config params for WAF. Field introduced in 17.2.1.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public WafConfig getConfig() {
    return config;
  }
    
  @VsoMethod
  public void setConfig(WafConfig config) {
    this.config = config;
  }

  
  /**
   *  Field introduced in 17.2.1.
   * @return description
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  public WafProfile addFilesItem(WafDataFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<WafDataFile>();
    }
    this.files.add(filesItem);
    return this;
  }
  
  /**
   * List of Data Files Used for WAF Rules. Field introduced in 17.2.1.
   * @return files
  **/
  @ApiModelProperty(value = "List of Data Files Used for WAF Rules. Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public List<WafDataFile> getFiles() {
    return files;
  }
    
  @VsoMethod
  public void setFiles(List<WafDataFile> files) {
    this.files = files;
  }

  
  /**
   *  Field introduced in 17.2.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = " Field introduced in 17.2.1.")
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
   *  It is a reference to an object of type Tenant. Field introduced in 17.2.1.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant. Field introduced in 17.2.1.")


 
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
   *  Field introduced in 17.2.1.
   * @return uuid
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "WafProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafProfile wafProfile = (WafProfile) o;
    return Objects.equals(this.lastModified, wafProfile.lastModified) &&
        Objects.equals(this.config, wafProfile.config) &&
        Objects.equals(this.description, wafProfile.description) &&
        Objects.equals(this.files, wafProfile.files) &&
        Objects.equals(this.name, wafProfile.name) &&
        Objects.equals(this.tenantRef, wafProfile.tenantRef) &&
        Objects.equals(this.url, wafProfile.url) &&
        Objects.equals(this.uuid, wafProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, config, description, files, name, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafProfile {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

