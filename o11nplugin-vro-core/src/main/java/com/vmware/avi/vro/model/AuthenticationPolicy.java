package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AuthenticationRule;
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
 * AuthenticationPolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "AuthenticationPolicy")
@VsoFinder(name = Constants.FINDER_VRO_AUTHENTICATIONPOLICY, idAccessor = "getObjectID()")
@Service
public class AuthenticationPolicy extends AviRestResource  {
  @JsonProperty("auth_profile_ref")
  private String authProfileRef = null;

  @JsonProperty("authn_rules")
  @Valid
  private List<AuthenticationRule> authnRules = null;

  @JsonProperty("cookie_name")
  private String cookieName = null;

  @JsonProperty("cookie_timeout")
  private Integer cookieTimeout = 60;

  @JsonProperty("default_auth_profile_ref")
  private String defaultAuthProfileRef = null;

  @JsonProperty("entity_id")
  private String entityId = null;

  @JsonProperty("key")
  @Valid
  private List<HttpCookiePersistenceKey> key = null;

  @JsonProperty("single_signon_url")
  private String singleSignonUrl = null;

  @JsonProperty("sp_metadata")
  private String spMetadata = null;

  
  /**
   * Auth Profile to use for validating users. It is a reference to an object of type AuthProfile. Field deprecated in 18.2.3. Field introduced in 18.2.1.
   * @return authProfileRef
  **/
  @ApiModelProperty(value = "Auth Profile to use for validating users. It is a reference to an object of type AuthProfile. Field deprecated in 18.2.3. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getAuthProfileRef() {
    return authProfileRef;
  }
    
  @VsoMethod
  public void setAuthProfileRef(String authProfileRef) {
    this.authProfileRef = authProfileRef;
  }

  
  public AuthenticationPolicy addAuthnRulesItem(AuthenticationRule authnRulesItem) {
    if (this.authnRules == null) {
      this.authnRules = new ArrayList<AuthenticationRule>();
    }
    this.authnRules.add(authnRulesItem);
    return this;
  }
  
  /**
   * Add rules to apply auth profile to specific targets. Field introduced in 18.2.5.
   * @return authnRules
  **/
  @ApiModelProperty(value = "Add rules to apply auth profile to specific targets. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public List<AuthenticationRule> getAuthnRules() {
    return authnRules;
  }
    
  @VsoMethod
  public void setAuthnRules(List<AuthenticationRule> authnRules) {
    this.authnRules = authnRules;
  }

  
  /**
   * HTTP cookie name for authenticated session. Field deprecated in 18.2.3. Field introduced in 18.2.1.
   * @return cookieName
  **/
  @ApiModelProperty(value = "HTTP cookie name for authenticated session. Field deprecated in 18.2.3. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getCookieName() {
    return cookieName;
  }
    
  @VsoMethod
  public void setCookieName(String cookieName) {
    this.cookieName = cookieName;
  }

  
  /**
   * Cookie timeout in minutes. Allowed values are 1-1440. Field deprecated in 18.2.3. Field introduced in 18.2.1.
   * @return cookieTimeout
  **/
  @ApiModelProperty(value = "Cookie timeout in minutes. Allowed values are 1-1440. Field deprecated in 18.2.3. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public Integer getCookieTimeout() {
    return cookieTimeout;
  }
    
  @VsoMethod
  public void setCookieTimeout(Integer cookieTimeout) {
    this.cookieTimeout = cookieTimeout;
  }

  
  /**
   * Auth Profile to use for validating users. It is a reference to an object of type AuthProfile. Field introduced in 18.2.3.
   * @return defaultAuthProfileRef
  **/
  @ApiModelProperty(required = true, value = "Auth Profile to use for validating users. It is a reference to an object of type AuthProfile. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getDefaultAuthProfileRef() {
    return defaultAuthProfileRef;
  }
    
  @VsoMethod
  public void setDefaultAuthProfileRef(String defaultAuthProfileRef) {
    this.defaultAuthProfileRef = defaultAuthProfileRef;
  }

  
  /**
   * Globally unique entityID for this node. Entity ID on the IDP should match this. Field deprecated in 18.2.3. Field introduced in 18.2.1.
   * @return entityId
  **/
  @ApiModelProperty(value = "Globally unique entityID for this node. Entity ID on the IDP should match this. Field deprecated in 18.2.3. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getEntityId() {
    return entityId;
  }
    
  @VsoMethod
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  
  public AuthenticationPolicy addKeyItem(HttpCookiePersistenceKey keyItem) {
    if (this.key == null) {
      this.key = new ArrayList<HttpCookiePersistenceKey>();
    }
    this.key.add(keyItem);
    return this;
  }
  
  /**
   * Key to generate the cookie. Field deprecated in 18.2.3. Field introduced in 18.2.1.
   * @return key
  **/
  @ApiModelProperty(value = "Key to generate the cookie. Field deprecated in 18.2.3. Field introduced in 18.2.1.")

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
   * Single Signon URL to be programmed on the IDP. Field deprecated in 18.2.3. Field introduced in 18.2.1.
   * @return singleSignonUrl
  **/
  @ApiModelProperty(value = "Single Signon URL to be programmed on the IDP. Field deprecated in 18.2.3. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getSingleSignonUrl() {
    return singleSignonUrl;
  }
    
  @VsoMethod
  public void setSingleSignonUrl(String singleSignonUrl) {
    this.singleSignonUrl = singleSignonUrl;
  }

  
  /**
   * SAML SP metadata. Field deprecated in 18.2.3. Field introduced in 18.2.1.
   * @return spMetadata
  **/
  @ApiModelProperty(readOnly = true, value = "SAML SP metadata. Field deprecated in 18.2.3. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getSpMetadata() {
    return spMetadata;
  }
    
  @VsoMethod
  public void setSpMetadata(String spMetadata) {
    this.spMetadata = spMetadata;
  }

  
  public String getObjectID() {
		return "AuthenticationPolicy";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationPolicy authenticationPolicy = (AuthenticationPolicy) o;
    return Objects.equals(this.authProfileRef, authenticationPolicy.authProfileRef) &&
        Objects.equals(this.authnRules, authenticationPolicy.authnRules) &&
        Objects.equals(this.cookieName, authenticationPolicy.cookieName) &&
        Objects.equals(this.cookieTimeout, authenticationPolicy.cookieTimeout) &&
        Objects.equals(this.defaultAuthProfileRef, authenticationPolicy.defaultAuthProfileRef) &&
        Objects.equals(this.entityId, authenticationPolicy.entityId) &&
        Objects.equals(this.key, authenticationPolicy.key) &&
        Objects.equals(this.singleSignonUrl, authenticationPolicy.singleSignonUrl) &&
        Objects.equals(this.spMetadata, authenticationPolicy.spMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authProfileRef, authnRules, cookieName, cookieTimeout, defaultAuthProfileRef, entityId, key, singleSignonUrl, spMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationPolicy {\n");
    
    sb.append("    authProfileRef: ").append(toIndentedString(authProfileRef)).append("\n");
    sb.append("    authnRules: ").append(toIndentedString(authnRules)).append("\n");
    sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
    sb.append("    cookieTimeout: ").append(toIndentedString(cookieTimeout)).append("\n");
    sb.append("    defaultAuthProfileRef: ").append(toIndentedString(defaultAuthProfileRef)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    singleSignonUrl: ").append(toIndentedString(singleSignonUrl)).append("\n");
    sb.append("    spMetadata: ").append(toIndentedString(spMetadata)).append("\n");
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

