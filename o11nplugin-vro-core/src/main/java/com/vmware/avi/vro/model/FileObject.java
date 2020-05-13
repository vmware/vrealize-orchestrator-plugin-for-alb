package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * FileObject
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "FileObject")
@VsoFinder(name = Constants.FINDER_VRO_FILEOBJECT, idAccessor = "getObjectID()")
@Service
public class FileObject extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("checksum")
  private String checksum = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("read_only")
  private Boolean readOnly = null;

  @JsonProperty("restrict_download")
  private Boolean restrictDownload = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("version")
  private String version = null;

  
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
   * SHA1 checksum of the file. Field introduced in 20.1.1.
   * @return checksum
  **/
  @ApiModelProperty(value = "SHA1 checksum of the file. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getChecksum() {
    return checksum;
  }
    
  @VsoMethod
  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  
  /**
   * Timestamp of creation for the file. Field introduced in 20.1.1.
   * @return created
  **/
  @ApiModelProperty(value = "Timestamp of creation for the file. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getCreated() {
    return created;
  }
    
  @VsoMethod
  public void setCreated(String created) {
    this.created = created;
  }

  
  /**
   * Description of the file. Field introduced in 20.1.1.
   * @return description
  **/
  @ApiModelProperty(value = "Description of the file. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Name of the file object. Field introduced in 20.1.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the file object. Field introduced in 20.1.1.")
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
   * Path to the file. Field introduced in 20.1.1.
   * @return path
  **/
  @ApiModelProperty(value = "Path to the file. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getPath() {
    return path;
  }
    
  @VsoMethod
  public void setPath(String path) {
    this.path = path;
  }

  
  /**
   * Enforce Read-Only on the file. Field introduced in 20.1.1.
   * @return readOnly
  **/
  @ApiModelProperty(value = "Enforce Read-Only on the file. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isReadOnly() {
    return readOnly;
  }
    
  @VsoMethod
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  
  /**
   * Flag to allow/restrict download of the file. Field introduced in 20.1.1.
   * @return restrictDownload
  **/
  @ApiModelProperty(value = "Flag to allow/restrict download of the file. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isRestrictDownload() {
    return restrictDownload;
  }
    
  @VsoMethod
  public void setRestrictDownload(Boolean restrictDownload) {
    this.restrictDownload = restrictDownload;
  }

  
  /**
   * Size of the file. Field introduced in 20.1.1.
   * @return size
  **/
  @ApiModelProperty(value = "Size of the file. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Long getSize() {
    return size;
  }
    
  @VsoMethod
  public void setSize(Long size) {
    this.size = size;
  }

  
  /**
   * Tenant that this object belongs to. It is a reference to an object of type Tenant. Field introduced in 20.1.1.
   * @return tenantRef
  **/
  @ApiModelProperty(value = "Tenant that this object belongs to. It is a reference to an object of type Tenant. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * Type of the file. Enum options - OTHER_FILE_TYPES, IP_REPUTATION, GEO_DB, TECH_SUPPORT, HSMPACKAGES, IPAMDNSSCRIPTS, CONTROLLER_IMAGE. Field introduced in 20.1.1.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of the file. Enum options - OTHER_FILE_TYPES, IP_REPUTATION, GEO_DB, TECH_SUPPORT, HSMPACKAGES, IPAMDNSSCRIPTS, CONTROLLER_IMAGE. Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
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
   * UUID of the file. Field introduced in 20.1.1.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the file. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   * Version of the file. Field introduced in 20.1.1.
   * @return version
  **/
  @ApiModelProperty(value = "Version of the file. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getVersion() {
    return version;
  }
    
  @VsoMethod
  public void setVersion(String version) {
    this.version = version;
  }

  
  public String getObjectID() {
		return "FileObject";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileObject fileObject = (FileObject) o;
    return Objects.equals(this.lastModified, fileObject.lastModified) &&
        Objects.equals(this.checksum, fileObject.checksum) &&
        Objects.equals(this.created, fileObject.created) &&
        Objects.equals(this.description, fileObject.description) &&
        Objects.equals(this.name, fileObject.name) &&
        Objects.equals(this.path, fileObject.path) &&
        Objects.equals(this.readOnly, fileObject.readOnly) &&
        Objects.equals(this.restrictDownload, fileObject.restrictDownload) &&
        Objects.equals(this.size, fileObject.size) &&
        Objects.equals(this.tenantRef, fileObject.tenantRef) &&
        Objects.equals(this.type, fileObject.type) &&
        Objects.equals(this.url, fileObject.url) &&
        Objects.equals(this.uuid, fileObject.uuid) &&
        Objects.equals(this.version, fileObject.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, checksum, created, description, name, path, readOnly, restrictDownload, size, tenantRef, type, url, uuid, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileObject {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    restrictDownload: ").append(toIndentedString(restrictDownload)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

