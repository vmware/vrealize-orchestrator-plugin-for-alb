package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The JWTProfile is a POJO class extends AviRestResource that used for creating
 * JWTProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "JWTProfile")
@VsoFinder(name = Constants.FINDER_VRO_JWTPROFILE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class JWTProfile extends AviRestResource {
    @JsonProperty("is_federated")
    @JsonInclude(Include.NON_NULL)
    private Boolean isFederated = false;

    @JsonProperty("jwks_keys")
    @JsonInclude(Include.NON_NULL)
    private List<JWSKey> jwksKeys = null;

    @JsonProperty("jwt_auth_type")
    @JsonInclude(Include.NON_NULL)
    private String jwtAuthType = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

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
   * This field describes the object's replication scope.
   * If the field is set to false, then the object is visible within the controller-cluster.
   * If the field is set to true, then the object is replicated across the federation.
   * Field introduced in 20.1.5.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
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
   * Field introduced in 20.1.5.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isFederated set the isFederated.
   */
  @VsoMethod
  public void setIsFederated(Boolean  isFederated) {
    this.isFederated = isFederated;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Jwk keys used for signing/validating the jwt.
   * Field introduced in 20.1.5.
   * Minimum of 1 items required.
   * Maximum of 1 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return jwksKeys
   */
  @VsoMethod
  public List<JWSKey> getJwksKeys() {
    return jwksKeys;
  }

  /**
   * This is the setter method. this will set the jwksKeys
   * Jwk keys used for signing/validating the jwt.
   * Field introduced in 20.1.5.
   * Minimum of 1 items required.
   * Maximum of 1 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return jwksKeys
   */
  @VsoMethod
  public void setJwksKeys(List<JWSKey>  jwksKeys) {
    this.jwksKeys = jwksKeys;
  }

  /**
   * This is the setter method this will set the jwksKeys
   * Jwk keys used for signing/validating the jwt.
   * Field introduced in 20.1.5.
   * Minimum of 1 items required.
   * Maximum of 1 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return jwksKeys
   */
  @VsoMethod
  public JWTProfile addJwksKeysItem(JWSKey jwksKeysItem) {
    if (this.jwksKeys == null) {
      this.jwksKeys = new ArrayList<JWSKey>();
    }
    this.jwksKeys.add(jwksKeysItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Jwt auth type for jwt validation.
   * Enum options - JWT_TYPE_JWS.
   * Field introduced in 20.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return jwtAuthType
   */
  @VsoMethod
  public String getJwtAuthType() {
    return jwtAuthType;
  }

  /**
   * This is the setter method to the attribute.
   * Jwt auth type for jwt validation.
   * Enum options - JWT_TYPE_JWS.
   * Field introduced in 20.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param jwtAuthType set the jwtAuthType.
   */
  @VsoMethod
  public void setJwtAuthType(String  jwtAuthType) {
    this.jwtAuthType = jwtAuthType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A user friendly name for this jwt profile.
   * Field introduced in 20.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * A user friendly name for this jwt profile.
   * Field introduced in 20.1.5.
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
   * Field introduced in 20.1.5.
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
   * Field introduced in 20.1.5.
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
   * Uuid of the jwt profile.
   * Field introduced in 20.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the jwt profile.
   * Field introduced in 20.1.5.
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
  JWTProfile objJWTProfile = (JWTProfile) o;
  return   Objects.equals(this.uuid, objJWTProfile.uuid)&&
  Objects.equals(this.name, objJWTProfile.name)&&
  Objects.equals(this.jwksKeys, objJWTProfile.jwksKeys)&&
  Objects.equals(this.jwtAuthType, objJWTProfile.jwtAuthType)&&
  Objects.equals(this.isFederated, objJWTProfile.isFederated)&&
  Objects.equals(this.tenantRef, objJWTProfile.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class JWTProfile {\n");
      sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
        sb.append("    jwksKeys: ").append(toIndentedString(jwksKeys)).append("\n");
        sb.append("    jwtAuthType: ").append(toIndentedString(jwtAuthType)).append("\n");
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

