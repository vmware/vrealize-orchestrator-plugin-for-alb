package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HardwareSecurityModule;
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
 * HardwareSecurityModuleGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HardwareSecurityModuleGroup")
@VsoFinder(name = Constants.FINDER_VRO_HARDWARESECURITYMODULEGROUP, idAccessor = "getObjectID()")
@Service
public class HardwareSecurityModuleGroup extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("hsm")
  private HardwareSecurityModule hsm = null;

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
   * Hardware Security Module configuration.
   * @return hsm
  **/
  @ApiModelProperty(required = true, value = "Hardware Security Module configuration.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public HardwareSecurityModule getHsm() {
    return hsm;
  }
    
  @VsoMethod
  public void setHsm(HardwareSecurityModule hsm) {
    this.hsm = hsm;
  }

  
  /**
   * Name of the HSM Group configuration object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the HSM Group configuration object.")
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
   * UUID of the HSM Group configuration object.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the HSM Group configuration object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "HardwareSecurityModuleGroup";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HardwareSecurityModuleGroup hardwareSecurityModuleGroup = (HardwareSecurityModuleGroup) o;
    return Objects.equals(this.lastModified, hardwareSecurityModuleGroup.lastModified) &&
        Objects.equals(this.hsm, hardwareSecurityModuleGroup.hsm) &&
        Objects.equals(this.name, hardwareSecurityModuleGroup.name) &&
        Objects.equals(this.tenantRef, hardwareSecurityModuleGroup.tenantRef) &&
        Objects.equals(this.url, hardwareSecurityModuleGroup.url) &&
        Objects.equals(this.uuid, hardwareSecurityModuleGroup.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, hsm, name, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HardwareSecurityModuleGroup {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    hsm: ").append(toIndentedString(hsm)).append("\n");
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

