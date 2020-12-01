package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AuthnRuleMatch;
import com.vmware.avi.vro.model.AuthzRuleMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The JwtLog is a POJO class extends AviRestResource that used for creating
 * JwtLog.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "JwtLog")
@VsoFinder(name = Constants.FINDER_VRO_JWTLOG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class JwtLog extends AviRestResource {
    @JsonProperty("authn_rule_match")
    @JsonInclude(Include.NON_NULL)
    private AuthnRuleMatch authnRuleMatch = null;

    @JsonProperty("authz_rule_match")
    @JsonInclude(Include.NON_NULL)
    private AuthzRuleMatch authzRuleMatch = null;

    @JsonProperty("is_jwt_verified")
    @JsonInclude(Include.NON_NULL)
    private Boolean isJwtVerified = null;

    @JsonProperty("token_payload")
    @JsonInclude(Include.NON_NULL)
    private String tokenPayload = null;



  /**
   * This is the getter method this will return the attribute value.
   * Authentication policy rule match.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authnRuleMatch
   */
  @VsoMethod
  public AuthnRuleMatch getAuthnRuleMatch() {
    return authnRuleMatch;
  }

  /**
   * This is the setter method to the attribute.
   * Authentication policy rule match.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param authnRuleMatch set the authnRuleMatch.
   */
  @VsoMethod
  public void setAuthnRuleMatch(AuthnRuleMatch authnRuleMatch) {
    this.authnRuleMatch = authnRuleMatch;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Authorization policy rule match.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authzRuleMatch
   */
  @VsoMethod
  public AuthzRuleMatch getAuthzRuleMatch() {
    return authzRuleMatch;
  }

  /**
   * This is the setter method to the attribute.
   * Authorization policy rule match.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param authzRuleMatch set the authzRuleMatch.
   */
  @VsoMethod
  public void setAuthzRuleMatch(AuthzRuleMatch authzRuleMatch) {
    this.authzRuleMatch = authzRuleMatch;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Set to true, if jwt validation is successful.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return isJwtVerified
   */
  @VsoMethod
  public Boolean getIsJwtVerified() {
    return isJwtVerified;
  }

  /**
   * This is the setter method to the attribute.
   * Set to true, if jwt validation is successful.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param isJwtVerified set the isJwtVerified.
   */
  @VsoMethod
  public void setIsJwtVerified(Boolean  isJwtVerified) {
    this.isJwtVerified = isJwtVerified;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Jwt token payload.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tokenPayload
   */
  @VsoMethod
  public String getTokenPayload() {
    return tokenPayload;
  }

  /**
   * This is the setter method to the attribute.
   * Jwt token payload.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tokenPayload set the tokenPayload.
   */
  @VsoMethod
  public void setTokenPayload(String  tokenPayload) {
    this.tokenPayload = tokenPayload;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  JwtLog objJwtLog = (JwtLog) o;
  return   Objects.equals(this.isJwtVerified, objJwtLog.isJwtVerified)&&
  Objects.equals(this.authnRuleMatch, objJwtLog.authnRuleMatch)&&
  Objects.equals(this.authzRuleMatch, objJwtLog.authzRuleMatch)&&
  Objects.equals(this.tokenPayload, objJwtLog.tokenPayload);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class JwtLog {\n");
      sb.append("    authnRuleMatch: ").append(toIndentedString(authnRuleMatch)).append("\n");
        sb.append("    authzRuleMatch: ").append(toIndentedString(authzRuleMatch)).append("\n");
        sb.append("    isJwtVerified: ").append(toIndentedString(isJwtVerified)).append("\n");
        sb.append("    tokenPayload: ").append(toIndentedString(tokenPayload)).append("\n");
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

