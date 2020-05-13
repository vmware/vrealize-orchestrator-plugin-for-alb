package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SubJob;
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
 * JobEntry
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "JobEntry")
@VsoFinder(name = Constants.FINDER_VRO_JOBENTRY, idAccessor = "getObjectID()")
@Service
public class JobEntry extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("expires_at")
  private String expiresAt = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("obj_key")
  private String objKey = null;

  @JsonProperty("subjobs")
  @Valid
  private List<SubJob> subjobs = null;

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
   * expires_at of JobEntry.
   * @return expiresAt
  **/
  @ApiModelProperty(required = true, value = "expires_at of JobEntry.")
  @NotNull


 
  @VsoMethod  
  public String getExpiresAt() {
    return expiresAt;
  }
    
  @VsoMethod
  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  
  /**
   *  Field introduced in 18.1.2.
   * @return name
  **/
  @ApiModelProperty(required = true, value = " Field introduced in 18.1.2.")
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
   * obj_key of JobEntry.
   * @return objKey
  **/
  @ApiModelProperty(required = true, value = "obj_key of JobEntry.")
  @NotNull


 
  @VsoMethod  
  public String getObjKey() {
    return objKey;
  }
    
  @VsoMethod
  public void setObjKey(String objKey) {
    this.objKey = objKey;
  }

  
  public JobEntry addSubjobsItem(SubJob subjobsItem) {
    if (this.subjobs == null) {
      this.subjobs = new ArrayList<SubJob>();
    }
    this.subjobs.add(subjobsItem);
    return this;
  }
  
  /**
   *  Field introduced in 18.1.1.
   * @return subjobs
  **/
  @ApiModelProperty(value = " Field introduced in 18.1.1.")

  @Valid

 
  @VsoMethod  
  public List<SubJob> getSubjobs() {
    return subjobs;
  }
    
  @VsoMethod
  public void setSubjobs(List<SubJob> subjobs) {
    this.subjobs = subjobs;
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
		return "JobEntry";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobEntry jobEntry = (JobEntry) o;
    return Objects.equals(this.lastModified, jobEntry.lastModified) &&
        Objects.equals(this.expiresAt, jobEntry.expiresAt) &&
        Objects.equals(this.name, jobEntry.name) &&
        Objects.equals(this.objKey, jobEntry.objKey) &&
        Objects.equals(this.subjobs, jobEntry.subjobs) &&
        Objects.equals(this.tenantRef, jobEntry.tenantRef) &&
        Objects.equals(this.url, jobEntry.url) &&
        Objects.equals(this.uuid, jobEntry.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, expiresAt, name, objKey, subjobs, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobEntry {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objKey: ").append(toIndentedString(objKey)).append("\n");
    sb.append("    subjobs: ").append(toIndentedString(subjobs)).append("\n");
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

