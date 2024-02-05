package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ControllerInternalAuth;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The JWTServerProfile is a POJO class extends AviRestResource that used for creating
 * JWTServerProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "JWTServerProfile")
@VsoFinder(name = Constants.FINDER_VRO_JWTSERVERPROFILE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class JWTServerProfile extends AviRestResource {
    @JsonProperty("controller_internal_auth")
    @JsonInclude(Include.NON_NULL)
    private ControllerInternalAuth controllerInternalAuth;

    @JsonProperty("is_federated")
    @JsonInclude(Include.NON_NULL)
    private Boolean isFederated = false;

    @JsonProperty("issuer")
    @JsonInclude(Include.NON_NULL)
    private String issuer;

    @JsonProperty("jwks_keys")
    @JsonInclude(Include.NON_NULL)
    private String jwksKeys;

    @JsonProperty("jwt_profile_type")
    @JsonInclude(Include.NON_NULL)
    private String jwtProfileType = "CLIENT_AUTH";

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Jwt auth configuration for profile_type controller_internal_auth.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerInternalAuth
   */
  @VsoMethod
  public ControllerInternalAuth getControllerInternalAuth() {
    return controllerInternalAuth;
  }

  /**
   * This is the setter method to the attribute.
   * Jwt auth configuration for profile_type controller_internal_auth.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerInternalAuth set the controllerInternalAuth.
   */
  @VsoMethod
  public void setControllerInternalAuth(ControllerInternalAuth controllerInternalAuth) {
    this.controllerInternalAuth = controllerInternalAuth;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field describes the object's replication scope.
   * If the field is set to false, then the object is visible within the controller-cluster.
   * If the field is set to true, then the object is replicated across the federation.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isFederated
   */
  @VsoMethod
  public Boolean getIsFederated() {
    return isFederated;
  }

  /**
   * This is the setter method to the attribute.
   * This field describes the object's replication scope.
   * If the field is set to false, then the object is visible within the controller-cluster.
   * If the field is set to true, then the object is replicated across the federation.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isFederated set the isFederated.
   */
  @VsoMethod
  public void setIsFederated(Boolean  isFederated) {
    this.isFederated = isFederated;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uniquely identifiable name of the token issuer, only allowed with profile_type client_auth.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return issuer
   */
  @VsoMethod
  public String getIssuer() {
    return issuer;
  }

  /**
   * This is the setter method to the attribute.
   * Uniquely identifiable name of the token issuer, only allowed with profile_type client_auth.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param issuer set the issuer.
   */
  @VsoMethod
  public void setIssuer(String  issuer) {
    this.issuer = issuer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Jwks key set used for validating the jwt, only allowed with profile_type client_auth.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return jwksKeys
   */
  @VsoMethod
  public String getJwksKeys() {
    return jwksKeys;
  }

  /**
   * This is the setter method to the attribute.
   * Jwks key set used for validating the jwt, only allowed with profile_type client_auth.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param jwksKeys set the jwksKeys.
   */
  @VsoMethod
  public void setJwksKeys(String  jwksKeys) {
    this.jwksKeys = jwksKeys;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of jwt server profile which defines the usage type.
   * Enum options - CLIENT_AUTH, CONTROLLER_INTERNAL_AUTH.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "CLIENT_AUTH".
   * @return jwtProfileType
   */
  @VsoMethod
  public String getJwtProfileType() {
    return jwtProfileType;
  }

  /**
   * This is the setter method to the attribute.
   * Type of jwt server profile which defines the usage type.
   * Enum options - CLIENT_AUTH, CONTROLLER_INTERNAL_AUTH.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "CLIENT_AUTH".
   * @param jwtProfileType set the jwtProfileType.
   */
  @VsoMethod
  public void setJwtProfileType(String  jwtProfileType) {
    this.jwtProfileType = jwtProfileType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the jwt profile.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the jwt profile.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Uuid of the jwtprofile.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the jwtprofile.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  JWTServerProfile objJWTServerProfile = (JWTServerProfile) o;
  return   Objects.equals(this.uuid, objJWTServerProfile.uuid)&&
  Objects.equals(this.name, objJWTServerProfile.name)&&
  Objects.equals(this.jwksKeys, objJWTServerProfile.jwksKeys)&&
  Objects.equals(this.issuer, objJWTServerProfile.issuer)&&
  Objects.equals(this.tenantRef, objJWTServerProfile.tenantRef)&&
  Objects.equals(this.isFederated, objJWTServerProfile.isFederated)&&
  Objects.equals(this.jwtProfileType, objJWTServerProfile.jwtProfileType)&&
  Objects.equals(this.controllerInternalAuth, objJWTServerProfile.controllerInternalAuth);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class JWTServerProfile {\n");
      sb.append("    controllerInternalAuth: ").append(toIndentedString(controllerInternalAuth)).append("\n");
        sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    jwksKeys: ").append(toIndentedString(jwksKeys)).append("\n");
        sb.append("    jwtProfileType: ").append(toIndentedString(jwtProfileType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

