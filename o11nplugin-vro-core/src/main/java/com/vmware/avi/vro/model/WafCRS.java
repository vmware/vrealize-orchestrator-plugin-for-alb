package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.WafRuleGroup;
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
 * WafCRS
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafCRS")
@VsoFinder(name = Constants.FINDER_VRO_WAFCRS, idAccessor = "getObjectID()")
@Service
public class WafCRS extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("groups")
  @Valid
  private List<WafRuleGroup> groups = null;

  @JsonProperty("integrity")
  private String integrity = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("release_date")
  private String releaseDate = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

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
   * A short description of this ruleset. Field introduced in 18.1.1.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A short description of this ruleset. Field introduced in 18.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  public WafCRS addGroupsItem(WafRuleGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<WafRuleGroup>();
    }
    this.groups.add(groupsItem);
    return this;
  }
  
  /**
   * WAF Rules are sorted in groups based on their characterization. Field introduced in 18.1.1.
   * @return groups
  **/
  @ApiModelProperty(value = "WAF Rules are sorted in groups based on their characterization. Field introduced in 18.1.1.")

  @Valid

 
  @VsoMethod  
  public List<WafRuleGroup> getGroups() {
    return groups;
  }
    
  @VsoMethod
  public void setGroups(List<WafRuleGroup> groups) {
    this.groups = groups;
  }

  
  /**
   * Integrity protection value. Field introduced in 18.2.1.
   * @return integrity
  **/
  @ApiModelProperty(required = true, value = "Integrity protection value. Field introduced in 18.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getIntegrity() {
    return integrity;
  }
    
  @VsoMethod
  public void setIntegrity(String integrity) {
    this.integrity = integrity;
  }

  
  /**
   * The name of this ruleset object. Field introduced in 18.2.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of this ruleset object. Field introduced in 18.2.1.")
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
   * The release date of this version in RFC 3339 / ISO 8601 format. Field introduced in 18.1.1.
   * @return releaseDate
  **/
  @ApiModelProperty(required = true, value = "The release date of this version in RFC 3339 / ISO 8601 format. Field introduced in 18.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getReleaseDate() {
    return releaseDate;
  }
    
  @VsoMethod
  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  
  /**
   * Tenant that this object belongs to. It is a reference to an object of type Tenant. Field introduced in 18.2.1.
   * @return tenantRef
  **/
  @ApiModelProperty(value = "Tenant that this object belongs to. It is a reference to an object of type Tenant. Field introduced in 18.2.1.")


 
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
   *  Field introduced in 18.1.1.
   * @return uuid
  **/
  @ApiModelProperty(value = " Field introduced in 18.1.1.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   * The version of this ruleset object. Field introduced in 18.1.1.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version of this ruleset object. Field introduced in 18.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getVersion() {
    return version;
  }
    
  @VsoMethod
  public void setVersion(String version) {
    this.version = version;
  }

  
  public String getObjectID() {
		return "WafCRS";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafCRS wafCRS = (WafCRS) o;
    return Objects.equals(this.lastModified, wafCRS.lastModified) &&
        Objects.equals(this.description, wafCRS.description) &&
        Objects.equals(this.groups, wafCRS.groups) &&
        Objects.equals(this.integrity, wafCRS.integrity) &&
        Objects.equals(this.name, wafCRS.name) &&
        Objects.equals(this.releaseDate, wafCRS.releaseDate) &&
        Objects.equals(this.tenantRef, wafCRS.tenantRef) &&
        Objects.equals(this.url, wafCRS.url) &&
        Objects.equals(this.uuid, wafCRS.uuid) &&
        Objects.equals(this.version, wafCRS.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, description, groups, integrity, name, releaseDate, tenantRef, url, uuid, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafCRS {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    integrity: ").append(toIndentedString(integrity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

