package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.TimeStamp;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The CertJwtStore is a POJO class extends AviRestResource that used for creating
 * CertJwtStore.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CertJwtStore")
@VsoFinder(name = Constants.FINDER_VRO_CERTJWTSTORE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CertJwtStore extends AviRestResource {
    @JsonProperty("jwt")
    @JsonInclude(Include.NON_NULL)
    private String jwt;

    @JsonProperty("key")
    @JsonInclude(Include.NON_NULL)
    private String key;

    @JsonProperty("key_passphrase")
    @JsonInclude(Include.NON_NULL)
    private String keyPassphrase;

    @JsonProperty("kid")
    @JsonInclude(Include.NON_NULL)
    private String kid;

    @JsonProperty("last_rotated_at")
    @JsonInclude(Include.NON_NULL)
    private TimeStamp lastRotatedAt;

    @JsonProperty("public_key_algorithm")
    @JsonInclude(Include.NON_NULL)
    private String publicKeyAlgorithm;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Jwt containing current portal certificate along with the full certificate bundle chain, signed by the private key of previous portal certificate.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return jwt
   */
  @VsoMethod
  public String getJwt() {
    return jwt;
  }

  /**
   * This is the setter method to the attribute.
   * Jwt containing current portal certificate along with the full certificate bundle chain, signed by the private key of previous portal certificate.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param jwt set the jwt.
   */
  @VsoMethod
  public void setJwt(String  jwt) {
    this.jwt = jwt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Private key.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return key
   */
  @VsoMethod
  public String getKey() {
    return key;
  }

  /**
   * This is the setter method to the attribute.
   * Private key.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param key set the key.
   */
  @VsoMethod
  public void setKey(String  key) {
    this.key = key;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Private key passphrase.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return keyPassphrase
   */
  @VsoMethod
  public String getKeyPassphrase() {
    return keyPassphrase;
  }

  /**
   * This is the setter method to the attribute.
   * Private key passphrase.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param keyPassphrase set the keyPassphrase.
   */
  @VsoMethod
  public void setKeyPassphrase(String  keyPassphrase) {
    this.keyPassphrase = keyPassphrase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sha256 thumbprint of the previous old portal certificate.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return kid
   */
  @VsoMethod
  public String getKid() {
    return kid;
  }

  /**
   * This is the setter method to the attribute.
   * Sha256 thumbprint of the previous old portal certificate.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param kid set the kid.
   */
  @VsoMethod
  public void setKid(String  kid) {
    this.kid = kid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp of certificate rotation.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastRotatedAt
   */
  @VsoMethod
  public TimeStamp getLastRotatedAt() {
    return lastRotatedAt;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp of certificate rotation.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastRotatedAt set the lastRotatedAt.
   */
  @VsoMethod
  public void setLastRotatedAt(TimeStamp lastRotatedAt) {
    this.lastRotatedAt = lastRotatedAt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Public key algorithm.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return publicKeyAlgorithm
   */
  @VsoMethod
  public String getPublicKeyAlgorithm() {
    return publicKeyAlgorithm;
  }

  /**
   * This is the setter method to the attribute.
   * Public key algorithm.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param publicKeyAlgorithm set the publicKeyAlgorithm.
   */
  @VsoMethod
  public void setPublicKeyAlgorithm(String  publicKeyAlgorithm) {
    this.publicKeyAlgorithm = publicKeyAlgorithm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of ssl certificate.
   * Enum options - SSL_CERTIFICATE_TYPE_VIRTUALSERVICE, SSL_CERTIFICATE_TYPE_SYSTEM, SSL_CERTIFICATE_TYPE_CA, SSL_CERTIFICATE_TYPE_CLIENT,
   * SSL_CERTIFICATE_TYPE_SECURE_CHANNEL.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of ssl certificate.
   * Enum options - SSL_CERTIFICATE_TYPE_VIRTUALSERVICE, SSL_CERTIFICATE_TYPE_SYSTEM, SSL_CERTIFICATE_TYPE_CA, SSL_CERTIFICATE_TYPE_CLIENT,
   * SSL_CERTIFICATE_TYPE_SECURE_CHANNEL.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
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
   * Uuid of jwt.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of jwt.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return "CertJwtStore" + "(" + uuid + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CertJwtStore objCertJwtStore = (CertJwtStore) o;
  return   Objects.equals(this.uuid, objCertJwtStore.uuid)&&
  Objects.equals(this.kid, objCertJwtStore.kid)&&
  Objects.equals(this.jwt, objCertJwtStore.jwt)&&
  Objects.equals(this.publicKeyAlgorithm, objCertJwtStore.publicKeyAlgorithm)&&
  Objects.equals(this.lastRotatedAt, objCertJwtStore.lastRotatedAt)&&
  Objects.equals(this.key, objCertJwtStore.key)&&
  Objects.equals(this.keyPassphrase, objCertJwtStore.keyPassphrase)&&
  Objects.equals(this.type, objCertJwtStore.type);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CertJwtStore {\n");
      sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    keyPassphrase: ").append(toIndentedString(keyPassphrase)).append("\n");
        sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
        sb.append("    lastRotatedAt: ").append(toIndentedString(lastRotatedAt)).append("\n");
        sb.append("    publicKeyAlgorithm: ").append(toIndentedString(publicKeyAlgorithm)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

