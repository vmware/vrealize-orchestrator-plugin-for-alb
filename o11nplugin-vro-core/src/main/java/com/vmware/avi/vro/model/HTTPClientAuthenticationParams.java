package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.StringMatch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * HTTPClientAuthenticationParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPClientAuthenticationParams")
@VsoFinder(name = Constants.FINDER_VRO_HTTPCLIENTAUTHENTICATIONPARAMS, idAccessor = "getObjectID()")
@Service
public class HTTPClientAuthenticationParams extends AviRestResource  {
  @JsonProperty("auth_profile_ref")
  private String authProfileRef = null;

  @JsonProperty("realm")
  private String realm = null;

  @JsonProperty("request_uri_path")
  private StringMatch requestUriPath = null;

  @JsonProperty("type")
  private String type = null;

  
  /**
   * Auth Profile to use for validating users. It is a reference to an object of type AuthProfile.
   * @return authProfileRef
  **/
  @ApiModelProperty(value = "Auth Profile to use for validating users. It is a reference to an object of type AuthProfile.")


 
  @VsoMethod  
  public String getAuthProfileRef() {
    return authProfileRef;
  }
    
  @VsoMethod
  public void setAuthProfileRef(String authProfileRef) {
    this.authProfileRef = authProfileRef;
  }

  
  /**
   * Basic authentication realm to present to a user along with the prompt for credentials.
   * @return realm
  **/
  @ApiModelProperty(value = "Basic authentication realm to present to a user along with the prompt for credentials.")


 
  @VsoMethod  
  public String getRealm() {
    return realm;
  }
    
  @VsoMethod
  public void setRealm(String realm) {
    this.realm = realm;
  }

  
  /**
   * Rrequest URI path when the authentication applies.
   * @return requestUriPath
  **/
  @ApiModelProperty(value = "Rrequest URI path when the authentication applies.")

  @Valid

 
  @VsoMethod  
  public StringMatch getRequestUriPath() {
    return requestUriPath;
  }
    
  @VsoMethod
  public void setRequestUriPath(StringMatch requestUriPath) {
    this.requestUriPath = requestUriPath;
  }

  
  /**
   * type of client authentication. Enum options - HTTP_BASIC_AUTH.
   * @return type
  **/
  @ApiModelProperty(value = "type of client authentication. Enum options - HTTP_BASIC_AUTH.")


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "HTTPClientAuthenticationParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPClientAuthenticationParams htTPClientAuthenticationParams = (HTTPClientAuthenticationParams) o;
    return Objects.equals(this.authProfileRef, htTPClientAuthenticationParams.authProfileRef) &&
        Objects.equals(this.realm, htTPClientAuthenticationParams.realm) &&
        Objects.equals(this.requestUriPath, htTPClientAuthenticationParams.requestUriPath) &&
        Objects.equals(this.type, htTPClientAuthenticationParams.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authProfileRef, realm, requestUriPath, type);
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

