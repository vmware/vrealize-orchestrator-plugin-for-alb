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
 * The OAuthVSConfig is a POJO class extends AviRestResource that used for creating
 * OAuthVSConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OAuthVSConfig")
@VsoFinder(name = Constants.FINDER_VRO_OAUTHVSCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OAuthVSConfig extends AviRestResource {
    @JsonProperty("cookie_name")
    @JsonInclude(Include.NON_NULL)
    private String cookieName = null;

    @JsonProperty("cookie_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer cookieTimeout = 60;

    @JsonProperty("key")
    @JsonInclude(Include.NON_NULL)
    private List<HttpCookiePersistenceKey> key = null;

    @JsonProperty("oauth_settings")
    @JsonInclude(Include.NON_NULL)
    private List<OAuthSettings> oauthSettings = null;

    @JsonProperty("redirect_uri")
    @JsonInclude(Include.NON_NULL)
    private String redirectUri = null;



  /**
   * This is the getter method this will return the attribute value.
   * Http cookie name for authorized session.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cookieName
   */
  @VsoMethod
  public String getCookieName() {
    return cookieName;
  }

  /**
   * This is the setter method to the attribute.
   * Http cookie name for authorized session.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cookieName set the cookieName.
   */
  @VsoMethod
  public void setCookieName(String  cookieName) {
    this.cookieName = cookieName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http cookie timeout for authorized session.
   * Allowed values are 1-1440.
   * Field introduced in 21.1.3.
   * Unit is min.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return cookieTimeout
   */
  @VsoMethod
  public Integer getCookieTimeout() {
    return cookieTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Http cookie timeout for authorized session.
   * Allowed values are 1-1440.
   * Field introduced in 21.1.3.
   * Unit is min.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param cookieTimeout set the cookieTimeout.
   */
  @VsoMethod
  public void setCookieTimeout(Integer  cookieTimeout) {
    this.cookieTimeout = cookieTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Key to generate the cookie.
   * Field introduced in 21.1.3.
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
   * Field introduced in 21.1.3.
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
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return key
   */
  @VsoMethod
  public OAuthVSConfig addKeyItem(HttpCookiePersistenceKey keyItem) {
    if (this.key == null) {
      this.key = new ArrayList<HttpCookiePersistenceKey>();
    }
    this.key.add(keyItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Application and idp settings for oauth/oidc.
   * Field introduced in 21.1.3.
   * Maximum of 1 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oauthSettings
   */
  @VsoMethod
  public List<OAuthSettings> getOauthSettings() {
    return oauthSettings;
  }

  /**
   * This is the setter method. this will set the oauthSettings
   * Application and idp settings for oauth/oidc.
   * Field introduced in 21.1.3.
   * Maximum of 1 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oauthSettings
   */
  @VsoMethod
  public void setOauthSettings(List<OAuthSettings>  oauthSettings) {
    this.oauthSettings = oauthSettings;
  }

  /**
   * This is the setter method this will set the oauthSettings
   * Application and idp settings for oauth/oidc.
   * Field introduced in 21.1.3.
   * Maximum of 1 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oauthSettings
   */
  @VsoMethod
  public OAuthVSConfig addOauthSettingsItem(OAuthSettings oauthSettingsItem) {
    if (this.oauthSettings == null) {
      this.oauthSettings = new ArrayList<OAuthSettings>();
    }
    this.oauthSettings.add(oauthSettingsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Redirect uri specified in the request to authorization server.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return redirectUri
   */
  @VsoMethod
  public String getRedirectUri() {
    return redirectUri;
  }

  /**
   * This is the setter method to the attribute.
   * Redirect uri specified in the request to authorization server.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param redirectUri set the redirectUri.
   */
  @VsoMethod
  public void setRedirectUri(String  redirectUri) {
    this.redirectUri = redirectUri;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OAuthVSConfig objOAuthVSConfig = (OAuthVSConfig) o;
  return   Objects.equals(this.redirectUri, objOAuthVSConfig.redirectUri)&&
  Objects.equals(this.cookieName, objOAuthVSConfig.cookieName)&&
  Objects.equals(this.cookieTimeout, objOAuthVSConfig.cookieTimeout)&&
  Objects.equals(this.oauthSettings, objOAuthVSConfig.oauthSettings)&&
  Objects.equals(this.key, objOAuthVSConfig.key);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OAuthVSConfig {\n");
      sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
        sb.append("    cookieTimeout: ").append(toIndentedString(cookieTimeout)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    oauthSettings: ").append(toIndentedString(oauthSettings)).append("\n");
        sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
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

