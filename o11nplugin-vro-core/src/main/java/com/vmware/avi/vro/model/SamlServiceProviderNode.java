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
 * The SamlServiceProviderNode is a POJO class extends AviRestResource that used for creating
 * SamlServiceProviderNode.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SamlServiceProviderNode")
@VsoFinder(name = Constants.FINDER_VRO_SAMLSERVICEPROVIDERNODE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SamlServiceProviderNode extends AviRestResource {
    @JsonProperty("entity_id")
    @JsonInclude(Include.NON_NULL)
    private String entityId = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("signing_cert")
    @JsonInclude(Include.NON_NULL)
    private String signingCert;

    @JsonProperty("signing_key")
    @JsonInclude(Include.NON_NULL)
    private String signingKey;

    @JsonProperty("signing_ssl_key_and_certificate_ref")
    @JsonInclude(Include.NON_NULL)
    private String signingSslKeyAndCertificateRef = null;

    @JsonProperty("single_signon_url")
    @JsonInclude(Include.NON_NULL)
    private String singleSignonUrl = null;



  /**
   * This is the getter method this will return the attribute value.
   * Globally unique entityid for this node.
   * Entity id on the idp should match this.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return entityId
   */
  @VsoMethod
  public String getEntityId() {
    return entityId;
  }

  /**
   * This is the setter method to the attribute.
   * Globally unique entityid for this node.
   * Entity id on the idp should match this.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param entityId set the entityId.
   */
  @VsoMethod
  public void setEntityId(String  entityId) {
    this.entityId = entityId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Refers to the cluster name identifier (virtual ip or fqdn).
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Refers to the cluster name identifier (virtual ip or fqdn).
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service provider signing certificate for metadata.
   * Field deprecated in 18.2.1.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return signingCert
   */
  @VsoMethod
  public String getSigningCert() {
    return signingCert;
  }

  /**
   * This is the setter method to the attribute.
   * Service provider signing certificate for metadata.
   * Field deprecated in 18.2.1.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param signingCert set the signingCert.
   */
  @VsoMethod
  public void setSigningCert(String  signingCert) {
    this.signingCert = signingCert;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service provider signing key for metadata.
   * Field deprecated in 18.2.1.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return signingKey
   */
  @VsoMethod
  public String getSigningKey() {
    return signingKey;
  }

  /**
   * This is the setter method to the attribute.
   * Service provider signing key for metadata.
   * Field deprecated in 18.2.1.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param signingKey set the signingKey.
   */
  @VsoMethod
  public void setSigningKey(String  signingKey) {
    this.signingKey = signingKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engines will use this ssl certificate to sign assertions going to the idp.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return signingSslKeyAndCertificateRef
   */
  @VsoMethod
  public String getSigningSslKeyAndCertificateRef() {
    return signingSslKeyAndCertificateRef;
  }

  /**
   * This is the setter method to the attribute.
   * Service engines will use this ssl certificate to sign assertions going to the idp.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param signingSslKeyAndCertificateRef set the signingSslKeyAndCertificateRef.
   */
  @VsoMethod
  public void setSigningSslKeyAndCertificateRef(String  signingSslKeyAndCertificateRef) {
    this.signingSslKeyAndCertificateRef = signingSslKeyAndCertificateRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Single signon url to be programmed on the idp.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return singleSignonUrl
   */
  @VsoMethod
  public String getSingleSignonUrl() {
    return singleSignonUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Single signon url to be programmed on the idp.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param singleSignonUrl set the singleSignonUrl.
   */
  @VsoMethod
  public void setSingleSignonUrl(String  singleSignonUrl) {
    this.singleSignonUrl = singleSignonUrl;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SamlServiceProviderNode objSamlServiceProviderNode = (SamlServiceProviderNode) o;
  return   Objects.equals(this.name, objSamlServiceProviderNode.name)&&
  Objects.equals(this.entityId, objSamlServiceProviderNode.entityId)&&
  Objects.equals(this.singleSignonUrl, objSamlServiceProviderNode.singleSignonUrl)&&
  Objects.equals(this.signingCert, objSamlServiceProviderNode.signingCert)&&
  Objects.equals(this.signingKey, objSamlServiceProviderNode.signingKey)&&
  Objects.equals(this.signingSslKeyAndCertificateRef, objSamlServiceProviderNode.signingSslKeyAndCertificateRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SamlServiceProviderNode {\n");
      sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    signingCert: ").append(toIndentedString(signingCert)).append("\n");
        sb.append("    signingKey: ").append(toIndentedString(signingKey)).append("\n");
        sb.append("    signingSslKeyAndCertificateRef: ").append(toIndentedString(signingSslKeyAndCertificateRef)).append("\n");
        sb.append("    singleSignonUrl: ").append(toIndentedString(singleSignonUrl)).append("\n");
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

