package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.OAuthAppSettings;
import com.vmware.avi.vro.model.OAuthResourceServer;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The OAuthSettings is a POJO class extends AviRestResource that used for creating
 * OAuthSettings.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OAuthSettings")
@VsoFinder(name = Constants.FINDER_VRO_OAUTHSETTINGS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OAuthSettings extends AviRestResource {
    @JsonProperty("app_settings")
    @JsonInclude(Include.NON_NULL)
    private OAuthAppSettings appSettings;

    @JsonProperty("auth_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String authProfileRef;

    @JsonProperty("resource_server")
    @JsonInclude(Include.NON_NULL)
    private OAuthResourceServer resourceServer;



  /**
   * This is the getter method this will return the attribute value.
   * Application-specific oauth config.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return appSettings
   */
  @VsoMethod
  public OAuthAppSettings getAppSettings() {
    return appSettings;
  }

  /**
   * This is the setter method to the attribute.
   * Application-specific oauth config.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param appSettings set the appSettings.
   */
  @VsoMethod
  public void setAppSettings(OAuthAppSettings appSettings) {
    this.appSettings = appSettings;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Auth profile to use for validating users.
   * It is a reference to an object of type authprofile.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authProfileRef
   */
  @VsoMethod
  public String getAuthProfileRef() {
    return authProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Auth profile to use for validating users.
   * It is a reference to an object of type authprofile.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param authProfileRef set the authProfileRef.
   */
  @VsoMethod
  public void setAuthProfileRef(String  authProfileRef) {
    this.authProfileRef = authProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Resource server oauth config.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resourceServer
   */
  @VsoMethod
  public OAuthResourceServer getResourceServer() {
    return resourceServer;
  }

  /**
   * This is the setter method to the attribute.
   * Resource server oauth config.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param resourceServer set the resourceServer.
   */
  @VsoMethod
  public void setResourceServer(OAuthResourceServer resourceServer) {
    this.resourceServer = resourceServer;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OAuthSettings objOAuthSettings = (OAuthSettings) o;
  return   Objects.equals(this.authProfileRef, objOAuthSettings.authProfileRef)&&
  Objects.equals(this.appSettings, objOAuthSettings.appSettings)&&
  Objects.equals(this.resourceServer, objOAuthSettings.resourceServer);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OAuthSettings {\n");
      sb.append("    appSettings: ").append(toIndentedString(appSettings)).append("\n");
        sb.append("    authProfileRef: ").append(toIndentedString(authProfileRef)).append("\n");
        sb.append("    resourceServer: ").append(toIndentedString(resourceServer)).append("\n");
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

