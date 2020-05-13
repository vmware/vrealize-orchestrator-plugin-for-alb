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
 * IPReputationDB
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IPReputationDB")
@VsoFinder(name = Constants.FINDER_VRO_IPREPUTATIONDB, idAccessor = "getObjectID()")
@Service
public class IPReputationDB extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("base_file_ref")
  private String baseFileRef = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("incremental_file_refs")
  @Valid
  private List<String> incrementalFileRefs = null;

  @JsonProperty("last_modified")
  private Long lastModifiedL = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vendor")
  private String vendor = null;

  
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
   * IP reputation DB base file. It is a reference to an object of type FileObject. Field introduced in 20.1.1.
   * @return baseFileRef
  **/
  @ApiModelProperty(value = "IP reputation DB base file. It is a reference to an object of type FileObject. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getBaseFileRef() {
    return baseFileRef;
  }
    
  @VsoMethod
  public void setBaseFileRef(String baseFileRef) {
    this.baseFileRef = baseFileRef;
  }

  
  /**
   * Description. Field introduced in 20.1.1.
   * @return description
  **/
  @ApiModelProperty(value = "Description. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  public IPReputationDB addIncrementalFileRefsItem(String incrementalFileRefsItem) {
    if (this.incrementalFileRefs == null) {
      this.incrementalFileRefs = new ArrayList<String>();
    }
    this.incrementalFileRefs.add(incrementalFileRefsItem);
    return this;
  }
  
  /**
   * IP reputation DB incremental update files. It is a reference to an object of type FileObject. Field introduced in 20.1.1.
   * @return incrementalFileRefs
  **/
  @ApiModelProperty(value = "IP reputation DB incremental update files. It is a reference to an object of type FileObject. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public List<String> getIncrementalFileRefs() {
    return incrementalFileRefs;
  }
    
  @VsoMethod
  public void setIncrementalFileRefs(List<String> incrementalFileRefs) {
    this.incrementalFileRefs = incrementalFileRefs;
  }

  
  /**
   * Timestamp of the last change made to this IP reputation DB. Field introduced in 20.1.1.
   * @return lastModified
  **/
  @ApiModelProperty(required = true, value = "Timestamp of the last change made to this IP reputation DB. Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public Long getLastModifiedL() {
    return lastModifiedL;
  }
    
  @VsoMethod
  public void setLastModifiedL(Long lastModifiedL) {
    this.lastModifiedL = lastModifiedL;
  }

  
  /**
   * IP reputation DB name. Field introduced in 20.1.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "IP reputation DB name. Field introduced in 20.1.1.")
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
   * UUID of this object. Field introduced in 20.1.1.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of this object. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   * Organization providing IP reputation data. Enum options - IP_REPUTATION_VENDOR_WEBROOT. Field introduced in 20.1.1.
   * @return vendor
  **/
  @ApiModelProperty(required = true, value = "Organization providing IP reputation data. Enum options - IP_REPUTATION_VENDOR_WEBROOT. Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getVendor() {
    return vendor;
  }
    
  @VsoMethod
  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  
  public String getObjectID() {
		return "IPReputationDB";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPReputationDB ipReputationDB = (IPReputationDB) o;
    return Objects.equals(this.lastModified, ipReputationDB.lastModified) &&
        Objects.equals(this.baseFileRef, ipReputationDB.baseFileRef) &&
        Objects.equals(this.description, ipReputationDB.description) &&
        Objects.equals(this.incrementalFileRefs, ipReputationDB.incrementalFileRefs) &&
        Objects.equals(this.lastModified, ipReputationDB.lastModified) &&
        Objects.equals(this.name, ipReputationDB.name) &&
        Objects.equals(this.tenantRef, ipReputationDB.tenantRef) &&
        Objects.equals(this.url, ipReputationDB.url) &&
        Objects.equals(this.uuid, ipReputationDB.uuid) &&
        Objects.equals(this.vendor, ipReputationDB.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, baseFileRef, description, incrementalFileRefs, lastModified, name, tenantRef, url, uuid, vendor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPReputationDB {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    baseFileRef: ").append(toIndentedString(baseFileRef)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    incrementalFileRefs: ").append(toIndentedString(incrementalFileRefs)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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

