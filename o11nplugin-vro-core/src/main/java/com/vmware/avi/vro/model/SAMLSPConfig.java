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
 * The SAMLSPConfig is a POJO class extends AviRestResource that used for creating
 * SAMLSPConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SAMLSPConfig")
@VsoFinder(name = Constants.FINDER_VRO_SAMLSPCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SAMLSPConfig extends AviRestResource {
    @JsonProperty("acs_index")
    @JsonInclude(Include.NON_NULL)
    private Integer acsIndex = 0;

    @JsonProperty("authn_req_acs_type")
    @JsonInclude(Include.NON_NULL)
    private String authnReqAcsType = "SAML_AUTHN_REQ_ACS_TYPE_NONE";

    @JsonProperty("cookie_name")
    @JsonInclude(Include.NON_NULL)
    private String cookieName = null;

    @JsonProperty("cookie_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer cookieTimeout = 60;

    @JsonProperty("entity_id")
    @JsonInclude(Include.NON_NULL)
    private String entityId = null;

    @JsonProperty("key")
    @JsonInclude(Include.NON_NULL)
    private List<HttpCookiePersistenceKey> key = null;

    @JsonProperty("signing_ssl_key_and_certificate_ref")
    @JsonInclude(Include.NON_NULL)
    private String signingSslKeyAndCertificateRef = null;

    @JsonProperty("single_signon_url")
    @JsonInclude(Include.NON_NULL)
    private String singleSignonUrl = null;

    @JsonProperty("sp_metadata")
    @JsonInclude(Include.NON_NULL)
    private String spMetadata;

    @JsonProperty("use_idp_session_timeout")
    @JsonInclude(Include.NON_NULL)
    private Boolean useIdpSessionTimeout = null;



  /**
   * This is the getter method this will return the attribute value.
   * Index to be used in the assertionconsumerserviceindex attribute of the authentication request, if the authn_req_acs_type is set to use
   * assertionconsumerserviceindex.
   * Allowed values are 0-64.
   * Field introduced in 21.1.6, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return acsIndex
   */
  @VsoMethod
  public Integer getAcsIndex() {
    return acsIndex;
  }

  /**
   * This is the setter method to the attribute.
   * Index to be used in the assertionconsumerserviceindex attribute of the authentication request, if the authn_req_acs_type is set to use
   * assertionconsumerserviceindex.
   * Allowed values are 0-64.
   * Field introduced in 21.1.6, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param acsIndex set the acsIndex.
   */
  @VsoMethod
  public void setAcsIndex(Integer  acsIndex) {
    this.acsIndex = acsIndex;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Option to set the acs attributes in the authnrequest.
   * Enum options - SAML_AUTHN_REQ_ACS_TYPE_URL, SAML_AUTHN_REQ_ACS_TYPE_INDEX, SAML_AUTHN_REQ_ACS_TYPE_NONE.
   * Field introduced in 21.1.6, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SAML_AUTHN_REQ_ACS_TYPE_NONE".
   * @return authnReqAcsType
   */
  @VsoMethod
  public String getAuthnReqAcsType() {
    return authnReqAcsType;
  }

  /**
   * This is the setter method to the attribute.
   * Option to set the acs attributes in the authnrequest.
   * Enum options - SAML_AUTHN_REQ_ACS_TYPE_URL, SAML_AUTHN_REQ_ACS_TYPE_INDEX, SAML_AUTHN_REQ_ACS_TYPE_NONE.
   * Field introduced in 21.1.6, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SAML_AUTHN_REQ_ACS_TYPE_NONE".
   * @param authnReqAcsType set the authnReqAcsType.
   */
  @VsoMethod
  public void setAuthnReqAcsType(String  authnReqAcsType) {
    this.authnReqAcsType = authnReqAcsType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http cookie name for authenticated session.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cookieName
   */
  @VsoMethod
  public String getCookieName() {
    return cookieName;
  }

  /**
   * This is the setter method to the attribute.
   * Http cookie name for authenticated session.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cookieName set the cookieName.
   */
  @VsoMethod
  public void setCookieName(String  cookieName) {
    this.cookieName = cookieName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cookie timeout in minutes.
   * Allowed values are 1-1440.
   * Field introduced in 18.2.3.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return cookieTimeout
   */
  @VsoMethod
  public Integer getCookieTimeout() {
    return cookieTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Cookie timeout in minutes.
   * Allowed values are 1-1440.
   * Field introduced in 18.2.3.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param cookieTimeout set the cookieTimeout.
   */
  @VsoMethod
  public void setCookieTimeout(Integer  cookieTimeout) {
    this.cookieTimeout = cookieTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Globally unique saml entityid for this node.
   * The saml application entity id on the idp should match this.
   * Field introduced in 18.2.3.
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
   * Globally unique saml entityid for this node.
   * The saml application entity id on the idp should match this.
   * Field introduced in 18.2.3.
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
   * Key to generate the cookie.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return key
   */
  @VsoMethod
  public List<HttpCookiePersistenceKey> getKey() {
    return key;
  }

  /**
   * This is the setter method. this will set the key
   * Key to generate the cookie.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return key
   */
  @VsoMethod
  public void setKey(List<HttpCookiePersistenceKey>  key) {
    this.key = key;
  }

  /**
   * This is the setter method this will set the key
   * Key to generate the cookie.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return key
   */
  @VsoMethod
  public SAMLSPConfig addKeyItem(HttpCookiePersistenceKey keyItem) {
    if (this.key == null) {
      this.key = new ArrayList<HttpCookiePersistenceKey>();
    }
    this.key.add(keyItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Sp will use this ssl certificate to sign requests going to the idp and decrypt the assertions coming from idp.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 18.2.3.
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
   * Sp will use this ssl certificate to sign requests going to the idp and decrypt the assertions coming from idp.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 18.2.3.
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
   * Saml single signon endpoint to receive the authentication response.
   * This also specifies the destination endpoint to be configured for this application on the idp.
   * If the authn_req_acs_type is set to 'use assertionconsumerserviceurl', this endpoint will be sent in the assertionconsumerserviceurl attribute of
   * the authentication request.
   * Field introduced in 18.2.3.
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
   * Saml single signon endpoint to receive the authentication response.
   * This also specifies the destination endpoint to be configured for this application on the idp.
   * If the authn_req_acs_type is set to 'use assertionconsumerserviceurl', this endpoint will be sent in the assertionconsumerserviceurl attribute of
   * the authentication request.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param singleSignonUrl set the singleSignonUrl.
   */
  @VsoMethod
  public void setSingleSignonUrl(String  singleSignonUrl) {
    this.singleSignonUrl = singleSignonUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Saml sp metadata for this application.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return spMetadata
   */
  @VsoMethod
  public String getSpMetadata() {
    return spMetadata;
  }

  /**
   * This is the setter method to the attribute.
   * Saml sp metadata for this application.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @param spMetadata set the spMetadata.
   */
  @VsoMethod
  public void setSpMetadata(String  spMetadata) {
    this.spMetadata = spMetadata;
  }

  /**
   * This is the getter method this will return the attribute value.
   * By enabling this field idp can control how long the sp session can exist through the sessionnotonorafter field in the authnstatement of saml
   * response.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return useIdpSessionTimeout
   */
  @VsoMethod
  public Boolean getUseIdpSessionTimeout() {
    return useIdpSessionTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * By enabling this field idp can control how long the sp session can exist through the sessionnotonorafter field in the authnstatement of saml
   * response.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param useIdpSessionTimeout set the useIdpSessionTimeout.
   */
  @VsoMethod
  public void setUseIdpSessionTimeout(Boolean  useIdpSessionTimeout) {
    this.useIdpSessionTimeout = useIdpSessionTimeout;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SAMLSPConfig objSAMLSPConfig = (SAMLSPConfig) o;
  return   Objects.equals(this.entityId, objSAMLSPConfig.entityId)&&
  Objects.equals(this.singleSignonUrl, objSAMLSPConfig.singleSignonUrl)&&
  Objects.equals(this.spMetadata, objSAMLSPConfig.spMetadata)&&
  Objects.equals(this.key, objSAMLSPConfig.key)&&
  Objects.equals(this.cookieTimeout, objSAMLSPConfig.cookieTimeout)&&
  Objects.equals(this.cookieName, objSAMLSPConfig.cookieName)&&
  Objects.equals(this.signingSslKeyAndCertificateRef, objSAMLSPConfig.signingSslKeyAndCertificateRef)&&
  Objects.equals(this.useIdpSessionTimeout, objSAMLSPConfig.useIdpSessionTimeout)&&
  Objects.equals(this.authnReqAcsType, objSAMLSPConfig.authnReqAcsType)&&
  Objects.equals(this.acsIndex, objSAMLSPConfig.acsIndex);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SAMLSPConfig {\n");
      sb.append("    acsIndex: ").append(toIndentedString(acsIndex)).append("\n");
        sb.append("    authnReqAcsType: ").append(toIndentedString(authnReqAcsType)).append("\n");
        sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
        sb.append("    cookieTimeout: ").append(toIndentedString(cookieTimeout)).append("\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    signingSslKeyAndCertificateRef: ").append(toIndentedString(signingSslKeyAndCertificateRef)).append("\n");
        sb.append("    singleSignonUrl: ").append(toIndentedString(singleSignonUrl)).append("\n");
        sb.append("    spMetadata: ").append(toIndentedString(spMetadata)).append("\n");
        sb.append("    useIdpSessionTimeout: ").append(toIndentedString(useIdpSessionTimeout)).append("\n");
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

