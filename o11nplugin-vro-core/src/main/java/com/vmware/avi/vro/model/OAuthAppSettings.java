package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.OIDCConfig;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The OAuthAppSettings is a POJO class extends AviRestResource that used for creating
 * OAuthAppSettings.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OAuthAppSettings")
@VsoFinder(name = Constants.FINDER_VRO_OAUTHAPPSETTINGS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OAuthAppSettings extends AviRestResource {
    @JsonProperty("client_id")
    @JsonInclude(Include.NON_NULL)
    private String clientId = null;

    @JsonProperty("client_secret")
    @JsonInclude(Include.NON_NULL)
    private String clientSecret = null;

    @JsonProperty("oidc_config")
    @JsonInclude(Include.NON_NULL)
    private OIDCConfig oidcConfig = null;

    @JsonProperty("scopes")
    @JsonInclude(Include.NON_NULL)
    private List<String> scopes = null;



  /**
   * This is the getter method this will return the attribute value.
   * Application specific identifier.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientId
   */
  @VsoMethod
  public String getClientId() {
    return clientId;
  }

  /**
   * This is the setter method to the attribute.
   * Application specific identifier.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientId set the clientId.
   */
  @VsoMethod
  public void setClientId(String  clientId) {
    this.clientId = clientId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Application specific identifier secret.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientSecret
   */
  @VsoMethod
  public String getClientSecret() {
    return clientSecret;
  }

  /**
   * This is the setter method to the attribute.
   * Application specific identifier secret.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientSecret set the clientSecret.
   */
  @VsoMethod
  public void setClientSecret(String  clientSecret) {
    this.clientSecret = clientSecret;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Openid connect specific configuration.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oidcConfig
   */
  @VsoMethod
  public OIDCConfig getOidcConfig() {
    return oidcConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Openid connect specific configuration.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param oidcConfig set the oidcConfig.
   */
  @VsoMethod
  public void setOidcConfig(OIDCConfig oidcConfig) {
    this.oidcConfig = oidcConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Scope specified to give limited access to the app.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scopes
   */
  @VsoMethod
  public List<String> getScopes() {
    return scopes;
  }

  /**
   * This is the setter method. this will set the scopes
   * Scope specified to give limited access to the app.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scopes
   */
  @VsoMethod
  public void setScopes(List<String>  scopes) {
    this.scopes = scopes;
  }

  /**
   * This is the setter method this will set the scopes
   * Scope specified to give limited access to the app.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scopes
   */
  @VsoMethod
  public OAuthAppSettings addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<String>();
    }
    this.scopes.add(scopesItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OAuthAppSettings objOAuthAppSettings = (OAuthAppSettings) o;
  return   Objects.equals(this.scopes, objOAuthAppSettings.scopes)&&
  Objects.equals(this.oidcConfig, objOAuthAppSettings.oidcConfig)&&
  Objects.equals(this.clientId, objOAuthAppSettings.clientId)&&
  Objects.equals(this.clientSecret, objOAuthAppSettings.clientSecret);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OAuthAppSettings {\n");
      sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
        sb.append("    oidcConfig: ").append(toIndentedString(oidcConfig)).append("\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

