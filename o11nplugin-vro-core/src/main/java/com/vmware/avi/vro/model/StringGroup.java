package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.KeyValue;
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
 * StringGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "StringGroup")
@VsoFinder(name = Constants.FINDER_VRO_STRINGGROUP, idAccessor = "getObjectID()")
@Service
public class StringGroup extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("kv")
  @Valid
  private List<KeyValue> kv = null;

  @JsonProperty("longest_match")
  private Boolean longestMatch = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("type")
  private String type = "SG_TYPE_STRING";

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

  
  public StringGroup addKvItem(KeyValue kvItem) {
    if (this.kv == null) {
      this.kv = new ArrayList<KeyValue>();
    }
    this.kv.add(kvItem);
    return this;
  }
  
  /**
   * Configure Key Value in the string group.
   * @return kv
  **/
  @ApiModelProperty(value = "Configure Key Value in the string group.")

  @Valid

 
  @VsoMethod  
  public List<KeyValue> getKv() {
    return kv;
  }
    
  @VsoMethod
  public void setKv(List<KeyValue> kv) {
    this.kv = kv;
  }

  
  /**
   * Enable the longest match, default is the shortest match. Field introduced in 18.2.8.
   * @return longestMatch
  **/
  @ApiModelProperty(value = "Enable the longest match, default is the shortest match. Field introduced in 18.2.8.")


 
  @VsoMethod  
  public Boolean isLongestMatch() {
    return longestMatch;
  }
    
  @VsoMethod
  public void setLongestMatch(Boolean longestMatch) {
    this.longestMatch = longestMatch;
  }

  
  /**
   * Name of the string group.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the string group.")
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
   * Type of StringGroup. Enum options - SG_TYPE_STRING, SG_TYPE_KEYVAL.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of StringGroup. Enum options - SG_TYPE_STRING, SG_TYPE_KEYVAL.")
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
   * UUID of the string group.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the string group.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "StringGroup";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringGroup stringGroup = (StringGroup) o;
    return Objects.equals(this.lastModified, stringGroup.lastModified) &&
        Objects.equals(this.description, stringGroup.description) &&
        Objects.equals(this.kv, stringGroup.kv) &&
        Objects.equals(this.longestMatch, stringGroup.longestMatch) &&
        Objects.equals(this.name, stringGroup.name) &&
        Objects.equals(this.tenantRef, stringGroup.tenantRef) &&
        Objects.equals(this.type, stringGroup.type) &&
        Objects.equals(this.url, stringGroup.url) &&
        Objects.equals(this.uuid, stringGroup.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, description, kv, longestMatch, name, tenantRef, type, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringGroup {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    kv: ").append(toIndentedString(kv)).append("\n");
    sb.append("    longestMatch: ").append(toIndentedString(longestMatch)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

