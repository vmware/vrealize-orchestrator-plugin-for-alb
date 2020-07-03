package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ControllerPortalAsset;
import com.vmware.avi.vro.model.ControllerPortalAuth;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ControllerPortalRegistration is a POJO class extends AviRestResource that used for creating
 * ControllerPortalRegistration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerPortalRegistration")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERPORTALREGISTRATION, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerPortalRegistration extends AviRestResource {
  @JsonProperty("asset")
  @JsonInclude(Include.NON_NULL)
  private ControllerPortalAsset asset = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("portal_auth")
  @JsonInclude(Include.NON_NULL)
  private ControllerPortalAuth portalAuth = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * @return asset
   */
  @VsoMethod
  public ControllerPortalAsset getAsset() {
    return asset;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * @param asset set the asset.
   */
  @VsoMethod
  public void setAsset(ControllerPortalAsset asset) {
    this.asset = asset;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * @return portalAuth
   */
  @VsoMethod
  public ControllerPortalAuth getPortalAuth() {
    return portalAuth;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * @param portalAuth set the portalAuth.
   */
  @VsoMethod
  public void setPortalAuth(ControllerPortalAuth portalAuth) {
    this.portalAuth = portalAuth;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.6.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.6.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ControllerPortalRegistration objControllerPortalRegistration = (ControllerPortalRegistration) o;
  return   Objects.equals(this.uuid, objControllerPortalRegistration.uuid)&&
  Objects.equals(this.portalAuth, objControllerPortalRegistration.portalAuth)&&
  Objects.equals(this.asset, objControllerPortalRegistration.asset)&&
  Objects.equals(this.tenantRef, objControllerPortalRegistration.tenantRef)&&
  Objects.equals(this.name, objControllerPortalRegistration.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerPortalRegistration {\n");
      sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    portalAuth: ").append(toIndentedString(portalAuth)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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
