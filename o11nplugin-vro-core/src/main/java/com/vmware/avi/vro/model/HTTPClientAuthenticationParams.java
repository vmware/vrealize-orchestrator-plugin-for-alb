package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.StringMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HTTPClientAuthenticationParams is a POJO class extends AviRestResource that used for creating
 * HTTPClientAuthenticationParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPClientAuthenticationParams")
@VsoFinder(name = Constants.FINDER_VRO_HTTPCLIENTAUTHENTICATIONPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPClientAuthenticationParams extends AviRestResource {
    @JsonProperty("auth_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String authProfileRef = null;

    @JsonProperty("realm")
    @JsonInclude(Include.NON_NULL)
    private String realm = null;

    @JsonProperty("request_uri_path")
    @JsonInclude(Include.NON_NULL)
    private StringMatch requestUriPath = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;



  /**
   * This is the getter method this will return the attribute value.
   * Auth profile to use for validating users.
   * It is a reference to an object of type authprofile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param authProfileRef set the authProfileRef.
   */
  @VsoMethod
  public void setAuthProfileRef(String  authProfileRef) {
    this.authProfileRef = authProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Basic authentication realm to present to a user along with the prompt for credentials.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return realm
   */
  @VsoMethod
  public String getRealm() {
    return realm;
  }

  /**
   * This is the setter method to the attribute.
   * Basic authentication realm to present to a user along with the prompt for credentials.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param realm set the realm.
   */
  @VsoMethod
  public void setRealm(String  realm) {
    this.realm = realm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rrequest uri path when the authentication applies.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requestUriPath
   */
  @VsoMethod
  public StringMatch getRequestUriPath() {
    return requestUriPath;
  }

  /**
   * This is the setter method to the attribute.
   * Rrequest uri path when the authentication applies.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param requestUriPath set the requestUriPath.
   */
  @VsoMethod
  public void setRequestUriPath(StringMatch requestUriPath) {
    this.requestUriPath = requestUriPath;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of client authentication.
   * Enum options - HTTP_BASIC_AUTH.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of client authentication.
   * Enum options - HTTP_BASIC_AUTH.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTPClientAuthenticationParams objHTTPClientAuthenticationParams = (HTTPClientAuthenticationParams) o;
  return   Objects.equals(this.type, objHTTPClientAuthenticationParams.type)&&
  Objects.equals(this.requestUriPath, objHTTPClientAuthenticationParams.requestUriPath)&&
  Objects.equals(this.authProfileRef, objHTTPClientAuthenticationParams.authProfileRef)&&
  Objects.equals(this.realm, objHTTPClientAuthenticationParams.realm);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HTTPClientAuthenticationParams {\n");
      sb.append("    authProfileRef: ").append(toIndentedString(authProfileRef)).append("\n");
        sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
        sb.append("    requestUriPath: ").append(toIndentedString(requestUriPath)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

