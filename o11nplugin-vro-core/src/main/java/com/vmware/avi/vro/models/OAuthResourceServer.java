package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.JWTValidationParams;
import com.vmware.avi.vro.model.OpaqueTokenValidationParams;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The OAuthResourceServer is a POJO class extends AviRestResource that used for creating
 * OAuthResourceServer.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OAuthResourceServer")
@VsoFinder(name = Constants.FINDER_VRO_OAUTHRESOURCESERVER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OAuthResourceServer extends AviRestResource {
    @JsonProperty("access_type")
    @JsonInclude(Include.NON_NULL)
    private String accessType = "ACCESS_TOKEN_TYPE_JWT";

    @JsonProperty("jwt_params")
    @JsonInclude(Include.NON_NULL)
    private JWTValidationParams jwtParams = null;

    @JsonProperty("opaque_token_params")
    @JsonInclude(Include.NON_NULL)
    private OpaqueTokenValidationParams opaqueTokenParams = null;



  /**
   * This is the getter method this will return the attribute value.
   * Access token type.
   * Enum options - ACCESS_TOKEN_TYPE_JWT, ACCESS_TOKEN_TYPE_OPAQUE.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ACCESS_TOKEN_TYPE_JWT".
   * @return accessType
   */
  @VsoMethod
  public String getAccessType() {
    return accessType;
  }

  /**
   * This is the setter method to the attribute.
   * Access token type.
   * Enum options - ACCESS_TOKEN_TYPE_JWT, ACCESS_TOKEN_TYPE_OPAQUE.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ACCESS_TOKEN_TYPE_JWT".
   * @param accessType set the accessType.
   */
  @VsoMethod
  public void setAccessType(String  accessType) {
    this.accessType = accessType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Validation parameters to be used when access token type is jwt.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return jwtParams
   */
  @VsoMethod
  public JWTValidationParams getJwtParams() {
    return jwtParams;
  }

  /**
   * This is the setter method to the attribute.
   * Validation parameters to be used when access token type is jwt.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param jwtParams set the jwtParams.
   */
  @VsoMethod
  public void setJwtParams(JWTValidationParams jwtParams) {
    this.jwtParams = jwtParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Validation parameters to be used when access token type is opaque.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return opaqueTokenParams
   */
  @VsoMethod
  public OpaqueTokenValidationParams getOpaqueTokenParams() {
    return opaqueTokenParams;
  }

  /**
   * This is the setter method to the attribute.
   * Validation parameters to be used when access token type is opaque.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param opaqueTokenParams set the opaqueTokenParams.
   */
  @VsoMethod
  public void setOpaqueTokenParams(OpaqueTokenValidationParams opaqueTokenParams) {
    this.opaqueTokenParams = opaqueTokenParams;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OAuthResourceServer objOAuthResourceServer = (OAuthResourceServer) o;
  return   Objects.equals(this.accessType, objOAuthResourceServer.accessType)&&
  Objects.equals(this.opaqueTokenParams, objOAuthResourceServer.opaqueTokenParams)&&
  Objects.equals(this.jwtParams, objOAuthResourceServer.jwtParams);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OAuthResourceServer {\n");
      sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
        sb.append("    jwtParams: ").append(toIndentedString(jwtParams)).append("\n");
        sb.append("    opaqueTokenParams: ").append(toIndentedString(opaqueTokenParams)).append("\n");
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

