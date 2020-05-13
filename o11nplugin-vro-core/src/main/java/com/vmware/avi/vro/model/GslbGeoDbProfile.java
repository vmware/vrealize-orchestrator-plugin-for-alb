package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.GslbGeoDbEntry;
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
 * GslbGeoDbProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GslbGeoDbProfile")
@VsoFinder(name = Constants.FINDER_VRO_GSLBGEODBPROFILE, idAccessor = "getObjectID()")
@Service
public class GslbGeoDbProfile extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("entries")
  @Valid
  private List<GslbGeoDbEntry> entries = null;

  @JsonProperty("is_federated")
  private Boolean isFederated = true;

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
   *  Field introduced in 17.1.1.
   * @return description
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  public GslbGeoDbProfile addEntriesItem(GslbGeoDbEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<GslbGeoDbEntry>();
    }
    this.entries.add(entriesItem);
    return this;
  }
  
  /**
   * List of Geodb entries. An entry can either be a geodb file or an ip address group with geo properties. . Field introduced in 17.1.1.
   * @return entries
  **/
  @ApiModelProperty(value = "List of Geodb entries. An entry can either be a geodb file or an ip address group with geo properties. . Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<GslbGeoDbEntry> getEntries() {
    return entries;
  }
    
  @VsoMethod
  public void setEntries(List<GslbGeoDbEntry> entries) {
    this.entries = entries;
  }

  
  /**
   * This field indicates that this object is replicated across GSLB federation. Field introduced in 17.1.3.
   * @return isFederated
  **/
  @ApiModelProperty(value = "This field indicates that this object is replicated across GSLB federation. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Boolean isIsFederated() {
    return isFederated;
  }
    
  @VsoMethod
  public void setIsFederated(Boolean isFederated) {
    this.isFederated = isFederated;
  }

  
  /**
   * A user-friendly name for the geodb profile. Field introduced in 17.1.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A user-friendly name for the geodb profile. Field introduced in 17.1.1.")
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
   * UUID of the geodb profile. Field introduced in 17.1.1.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the geodb profile. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "GslbGeoDbProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GslbGeoDbProfile gslbGeoDbProfile = (GslbGeoDbProfile) o;
    return Objects.equals(this.lastModified, gslbGeoDbProfile.lastModified) &&
        Objects.equals(this.description, gslbGeoDbProfile.description) &&
        Objects.equals(this.entries, gslbGeoDbProfile.entries) &&
        Objects.equals(this.isFederated, gslbGeoDbProfile.isFederated) &&
        Objects.equals(this.name, gslbGeoDbProfile.name) &&
        Objects.equals(this.tenantRef, gslbGeoDbProfile.tenantRef) &&
        Objects.equals(this.url, gslbGeoDbProfile.url) &&
        Objects.equals(this.uuid, gslbGeoDbProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, description, entries, isFederated, name, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GslbGeoDbProfile {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
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

