package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SubnetRuntime;
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
 * NetworkRuntime
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NetworkRuntime")
@VsoFinder(name = Constants.FINDER_VRO_NETWORKRUNTIME, idAccessor = "getObjectID()")
@Service
public class NetworkRuntime extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("se_uuid")
  @Valid
  private List<String> seUuid = null;

  @JsonProperty("subnet_runtime")
  @Valid
  private List<SubnetRuntime> subnetRuntime = null;

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

  
  public NetworkRuntime addSeUuidItem(String seUuidItem) {
    if (this.seUuid == null) {
      this.seUuid = new ArrayList<String>();
    }
    this.seUuid.add(seUuidItem);
    return this;
  }
  
  /**
   * Unique object identifier of se.
   * @return seUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of se.")


 
  @VsoMethod  
  public List<String> getSeUuid() {
    return seUuid;
  }
    
  @VsoMethod
  public void setSeUuid(List<String> seUuid) {
    this.seUuid = seUuid;
  }

  
  public NetworkRuntime addSubnetRuntimeItem(SubnetRuntime subnetRuntimeItem) {
    if (this.subnetRuntime == null) {
      this.subnetRuntime = new ArrayList<SubnetRuntime>();
    }
    this.subnetRuntime.add(subnetRuntimeItem);
    return this;
  }
  
  /**
   * Placeholder for description of property subnet_runtime of obj type NetworkRuntime field type str  type object
   * @return subnetRuntime
  **/
  @ApiModelProperty(value = "Placeholder for description of property subnet_runtime of obj type NetworkRuntime field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<SubnetRuntime> getSubnetRuntime() {
    return subnetRuntime;
  }
    
  @VsoMethod
  public void setSubnetRuntime(List<SubnetRuntime> subnetRuntime) {
    this.subnetRuntime = subnetRuntime;
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
		return "NetworkRuntime";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkRuntime networkRuntime = (NetworkRuntime) o;
    return Objects.equals(this.lastModified, networkRuntime.lastModified) &&
        Objects.equals(this.name, networkRuntime.name) &&
        Objects.equals(this.seUuid, networkRuntime.seUuid) &&
        Objects.equals(this.subnetRuntime, networkRuntime.subnetRuntime) &&
        Objects.equals(this.tenantRef, networkRuntime.tenantRef) &&
        Objects.equals(this.url, networkRuntime.url) &&
        Objects.equals(this.uuid, networkRuntime.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, name, seUuid, subnetRuntime, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkRuntime {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
    sb.append("    subnetRuntime: ").append(toIndentedString(subnetRuntime)).append("\n");
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

