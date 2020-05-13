package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HttpCookiePersistenceKey;
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
 * SAMLSPConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SAMLSPConfig")
@VsoFinder(name = Constants.FINDER_VRO_SAMLSPCONFIG, idAccessor = "getObjectID()")
@Service
public class SAMLSPConfig extends AviRestResource  {
  @JsonProperty("cookie_name")
  private String cookieName = null;

  @JsonProperty("cookie_timeout")
  private Integer cookieTimeout = 60;

  @JsonProperty("entity_id")
  private String entityId = null;

  @JsonProperty("key")
  @Valid
  private List<HttpCookiePersistenceKey> key = null;

  @JsonProperty("signing_ssl_key_and_certificate_ref")
  private String signingSslKeyAndCertificateRef = null;

  @JsonProperty("single_signon_url")
  private String singleSignonUrl = null;

  @JsonProperty("sp_metadata")
  private String spMetadata = null;

  @JsonProperty("use_idp_session_timeout")
  private Boolean useIdpSessionTimeout = null;

  
  /**
   * HTTP cookie name for authenticated session. Field introduced in 18.2.3.
   * @return cookieName
  **/
  @ApiModelProperty(value = "HTTP cookie name for authenticated session. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getCookieName() {
    return cookieName;
  }
    
  @VsoMethod
  public void setCookieName(String cookieName) {
    this.cookieName = cookieName;
  }

  
  /**
   * Cookie timeout in minutes. Allowed values are 1-1440. Field introduced in 18.2.3.
   * @return cookieTimeout
  **/
  @ApiModelProperty(value = "Cookie timeout in minutes. Allowed values are 1-1440. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getCookieTimeout() {
    return cookieTimeout;
  }
    
  @VsoMethod
  public void setCookieTimeout(Integer cookieTimeout) {
    this.cookieTimeout = cookieTimeout;
  }

  
  /**
   * Globally unique SAML entityID for this node. The SAML application entity ID on the IDP should match this. Field introduced in 18.2.3.
   * @return entityId
  **/
  @ApiModelProperty(required = true, value = "Globally unique SAML entityID for this node. The SAML application entity ID on the IDP should match this. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getEntityId() {
    return entityId;
  }
    
  @VsoMethod
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  
  public SAMLSPConfig addKeyItem(HttpCookiePersistenceKey keyItem) {
    if (this.key == null) {
      this.key = new ArrayList<HttpCookiePersistenceKey>();
    }
    this.key.add(keyItem);
    return this;
  }
  
  /**
   * Key to generate the cookie. Field introduced in 18.2.3.
   * @return key
  **/
  @ApiModelProperty(value = "Key to generate the cookie. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public List<HttpCookiePersistenceKey> getKey() {
    return key;
  }
    
  @VsoMethod
  public void setKey(List<HttpCookiePersistenceKey> key) {
    this.key = key;
  }

  
  /**
   * SP will use this SSL certificate to sign requests going to the IdP and decrypt the assertions coming from IdP. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 18.2.3.
   * @return signingSslKeyAndCertificateRef
  **/
  @ApiModelProperty(value = "SP will use this SSL certificate to sign requests going to the IdP and decrypt the assertions coming from IdP. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getSigningSslKeyAndCertificateRef() {
    return signingSslKeyAndCertificateRef;
  }
    
  @VsoMethod
  public void setSigningSslKeyAndCertificateRef(String signingSslKeyAndCertificateRef) {
    this.signingSslKeyAndCertificateRef = signingSslKeyAndCertificateRef;
  }

  
  /**
   * SAML Single Signon URL to be programmed on the IDP. Field introduced in 18.2.3.
   * @return singleSignonUrl
  **/
  @ApiModelProperty(required = true, value = "SAML Single Signon URL to be programmed on the IDP. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getSingleSignonUrl() {
    return singleSignonUrl;
  }
    
  @VsoMethod
  public void setSingleSignonUrl(String singleSignonUrl) {
    this.singleSignonUrl = singleSignonUrl;
  }

  
  /**
   * SAML SP metadata for this application. Field introduced in 18.2.3.
   * @return spMetadata
  **/
  @ApiModelProperty(readOnly = true, value = "SAML SP metadata for this application. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getSpMetadata() {
    return spMetadata;
  }
    
  @VsoMethod
  public void setSpMetadata(String spMetadata) {
    this.spMetadata = spMetadata;
  }

  
  /**
   * By enabling this field IdP can control how long the SP session can exist through the SessionNotOnOrAfter field in the AuthNStatement of SAML Response. Field introduced in 18.2.7.
   * @return useIdpSessionTimeout
  **/
  @ApiModelProperty(value = "By enabling this field IdP can control how long the SP session can exist through the SessionNotOnOrAfter field in the AuthNStatement of SAML Response. Field introduced in 18.2.7.")


 
  @VsoMethod  
  public Boolean isUseIdpSessionTimeout() {
    return useIdpSessionTimeout;
  }
    
  @VsoMethod
  public void setUseIdpSessionTimeout(Boolean useIdpSessionTimeout) {
    this.useIdpSessionTimeout = useIdpSessionTimeout;
  }

  
  public String getObjectID() {
		return "SAMLSPConfig";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAMLSPConfig saMLSPConfig = (SAMLSPConfig) o;
    return Objects.equals(this.cookieName, saMLSPConfig.cookieName) &&
        Objects.equals(this.cookieTimeout, saMLSPConfig.cookieTimeout) &&
        Objects.equals(this.entityId, saMLSPConfig.entityId) &&
        Objects.equals(this.key, saMLSPConfig.key) &&
        Objects.equals(this.signingSslKeyAndCertificateRef, saMLSPConfig.signingSslKeyAndCertificateRef) &&
        Objects.equals(this.singleSignonUrl, saMLSPConfig.singleSignonUrl) &&
        Objects.equals(this.spMetadata, saMLSPConfig.spMetadata) &&
        Objects.equals(this.useIdpSessionTimeout, saMLSPConfig.useIdpSessionTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cookieName, cookieTimeout, entityId, key, signingSslKeyAndCertificateRef, singleSignonUrl, spMetadata, useIdpSessionTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAMLSPConfig {\n");
    
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

