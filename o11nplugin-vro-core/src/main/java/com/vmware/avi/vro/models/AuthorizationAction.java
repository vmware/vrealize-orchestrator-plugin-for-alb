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
 * The AuthorizationAction is a POJO class extends AviRestResource that used for creating
 * AuthorizationAction.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AuthorizationAction")
@VsoFinder(name = Constants.FINDER_VRO_AUTHORIZATIONACTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AuthorizationAction extends AviRestResource {
    @JsonProperty("status_code")
    @JsonInclude(Include.NON_NULL)
    private String statusCode = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = "ALLOW_ACCESS";



  /**
   * This is the getter method this will return the attribute value.
   * Http status code to use for local response when an policy rule is matched.
   * Enum options - HTTP_RESPONSE_STATUS_CODE_401, HTTP_RESPONSE_STATUS_CODE_403.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return statusCode
   */
  @VsoMethod
  public String getStatusCode() {
    return statusCode;
  }

  /**
   * This is the setter method to the attribute.
   * Http status code to use for local response when an policy rule is matched.
   * Enum options - HTTP_RESPONSE_STATUS_CODE_401, HTTP_RESPONSE_STATUS_CODE_403.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param statusCode set the statusCode.
   */
  @VsoMethod
  public void setStatusCode(String  statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Defines the action taken when an authorization policy rule is matched.
   * By default, access is allowed to the requested resource.
   * Enum options - ALLOW_ACCESS, CLOSE_CONNECTION, HTTP_LOCAL_RESPONSE.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ALLOW_ACCESS".
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Defines the action taken when an authorization policy rule is matched.
   * By default, access is allowed to the requested resource.
   * Enum options - ALLOW_ACCESS, CLOSE_CONNECTION, HTTP_LOCAL_RESPONSE.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ALLOW_ACCESS".
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
  AuthorizationAction objAuthorizationAction = (AuthorizationAction) o;
  return   Objects.equals(this.type, objAuthorizationAction.type)&&
  Objects.equals(this.statusCode, objAuthorizationAction.statusCode);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AuthorizationAction {\n");
      sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

