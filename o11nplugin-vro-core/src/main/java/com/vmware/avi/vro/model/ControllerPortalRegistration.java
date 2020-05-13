package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.ControllerPortalAsset;
import com.vmware.avi.vro.model.ControllerPortalAuth;
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
 * ControllerPortalRegistration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ControllerPortalRegistration")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERPORTALREGISTRATION, idAccessor = "getObjectID()")
@Service
public class ControllerPortalRegistration extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("asset")
  private ControllerPortalAsset asset = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("portal_auth")
  private ControllerPortalAuth portalAuth = null;

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
   *  Field introduced in 18.2.6.
   * @return asset
  **/
  @ApiModelProperty(value = " Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public ControllerPortalAsset getAsset() {
    return asset;
  }
    
  @VsoMethod
  public void setAsset(ControllerPortalAsset asset) {
    this.asset = asset;
  }

  
  /**
   *  Field introduced in 18.2.6.
   * @return name
  **/
  @ApiModelProperty(required = true, value = " Field introduced in 18.2.6.")
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
   *  Field introduced in 18.2.6.
   * @return portalAuth
  **/
  @ApiModelProperty(value = " Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public ControllerPortalAuth getPortalAuth() {
    return portalAuth;
  }
    
  @VsoMethod
  public void setPortalAuth(ControllerPortalAuth portalAuth) {
    this.portalAuth = portalAuth;
  }

  
  /**
   *  It is a reference to an object of type Tenant. Field introduced in 18.2.6.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant. Field introduced in 18.2.6.")


 
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
   *  Field introduced in 18.2.6.
   * @return uuid
  **/
  @ApiModelProperty(value = " Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "ControllerPortalRegistration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerPortalRegistration controllerPortalRegistration = (ControllerPortalRegistration) o;
    return Objects.equals(this.lastModified, controllerPortalRegistration.lastModified) &&
        Objects.equals(this.asset, controllerPortalRegistration.asset) &&
        Objects.equals(this.name, controllerPortalRegistration.name) &&
        Objects.equals(this.portalAuth, controllerPortalRegistration.portalAuth) &&
        Objects.equals(this.tenantRef, controllerPortalRegistration.tenantRef) &&
        Objects.equals(this.url, controllerPortalRegistration.url) &&
        Objects.equals(this.uuid, controllerPortalRegistration.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, asset, name, portalAuth, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerPortalRegistration {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    portalAuth: ").append(toIndentedString(portalAuth)).append("\n");
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

