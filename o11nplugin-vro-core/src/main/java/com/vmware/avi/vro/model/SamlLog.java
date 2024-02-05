package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SamlAuthnRuleMatch;
import com.vmware.avi.vro.model.SamlAuthzRuleMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SamlLog is a POJO class extends AviRestResource that used for creating
 * SamlLog.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SamlLog")
@VsoFinder(name = Constants.FINDER_VRO_SAMLLOG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SamlLog extends AviRestResource {
    @JsonProperty("is_saml_authentication_used")
    @JsonInclude(Include.NON_NULL)
    private Boolean isSamlAuthenticationUsed;

    @JsonProperty("saml_attribute_lists")
    @JsonInclude(Include.NON_NULL)
    private List<SamlAttribute> samlAttributeLists;

    @JsonProperty("saml_auth_status")
    @JsonInclude(Include.NON_NULL)
    private String samlAuthStatus;

    @JsonProperty("saml_authn_rule_match")
    @JsonInclude(Include.NON_NULL)
    private SamlAuthnRuleMatch samlAuthnRuleMatch;

    @JsonProperty("saml_authz_rule_match")
    @JsonInclude(Include.NON_NULL)
    private SamlAuthzRuleMatch samlAuthzRuleMatch;

    @JsonProperty("saml_session_cookie_expired")
    @JsonInclude(Include.NON_NULL)
    private Boolean samlSessionCookieExpired;

    @JsonProperty("userid")
    @JsonInclude(Include.NON_NULL)
    private String userid;



  /**
   * This is the getter method this will return the attribute value.
   * Set to true if saml authentication is used.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return isSamlAuthenticationUsed
   */
  @VsoMethod
  public Boolean getIsSamlAuthenticationUsed() {
    return isSamlAuthenticationUsed;
  }

  /**
   * This is the setter method to the attribute.
   * Set to true if saml authentication is used.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param isSamlAuthenticationUsed set the isSamlAuthenticationUsed.
   */
  @VsoMethod
  public void setIsSamlAuthenticationUsed(Boolean  isSamlAuthenticationUsed) {
    this.isSamlAuthenticationUsed = isSamlAuthenticationUsed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Saml attribute list.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return samlAttributeLists
   */
  @VsoMethod
  public List<SamlAttribute> getSamlAttributeLists() {
    return samlAttributeLists;
  }

  /**
   * This is the setter method. this will set the samlAttributeLists
   * Saml attribute list.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return samlAttributeLists
   */
  @VsoMethod
  public void setSamlAttributeLists(List<SamlAttribute>  samlAttributeLists) {
    this.samlAttributeLists = samlAttributeLists;
  }

  /**
   * This is the setter method this will set the samlAttributeLists
   * Saml attribute list.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return samlAttributeLists
   */
  @VsoMethod
  public SamlLog addSamlAttributeListsItem(SamlAttribute samlAttributeListsItem) {
    if (this.samlAttributeLists == null) {
      this.samlAttributeLists = new ArrayList<SamlAttribute>();
    }
    this.samlAttributeLists.add(samlAttributeListsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Saml authentication status.
   * Enum options - SAML_AUTH_STATUS_UNAVAILABLE, SAML_AUTH_STATUS_UNAUTH_GET_REQUEST, SAML_AUTH_STATUS_UNAUTH_REQ_UNSUPPORTED_METHOD,
   * SAML_AUTH_STATUS_AUTH_REQUEST_GENERATED, SAML_AUTH_STATUS_AUTH_RESPONSE_RECEIVED, SAML_AUTH_STATUS_AUTHENTICATED_REQUEST,
   * SAML_AUTH_STATUS_AUTHORIZATION_FAILED.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return samlAuthStatus
   */
  @VsoMethod
  public String getSamlAuthStatus() {
    return samlAuthStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Saml authentication status.
   * Enum options - SAML_AUTH_STATUS_UNAVAILABLE, SAML_AUTH_STATUS_UNAUTH_GET_REQUEST, SAML_AUTH_STATUS_UNAUTH_REQ_UNSUPPORTED_METHOD,
   * SAML_AUTH_STATUS_AUTH_REQUEST_GENERATED, SAML_AUTH_STATUS_AUTH_RESPONSE_RECEIVED, SAML_AUTH_STATUS_AUTHENTICATED_REQUEST,
   * SAML_AUTH_STATUS_AUTHORIZATION_FAILED.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param samlAuthStatus set the samlAuthStatus.
   */
  @VsoMethod
  public void setSamlAuthStatus(String  samlAuthStatus) {
    this.samlAuthStatus = samlAuthStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Saml authentication rule match.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return samlAuthnRuleMatch
   */
  @VsoMethod
  public SamlAuthnRuleMatch getSamlAuthnRuleMatch() {
    return samlAuthnRuleMatch;
  }

  /**
   * This is the setter method to the attribute.
   * Saml authentication rule match.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param samlAuthnRuleMatch set the samlAuthnRuleMatch.
   */
  @VsoMethod
  public void setSamlAuthnRuleMatch(SamlAuthnRuleMatch samlAuthnRuleMatch) {
    this.samlAuthnRuleMatch = samlAuthnRuleMatch;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Saml authorization rule match.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return samlAuthzRuleMatch
   */
  @VsoMethod
  public SamlAuthzRuleMatch getSamlAuthzRuleMatch() {
    return samlAuthzRuleMatch;
  }

  /**
   * This is the setter method to the attribute.
   * Saml authorization rule match.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param samlAuthzRuleMatch set the samlAuthzRuleMatch.
   */
  @VsoMethod
  public void setSamlAuthzRuleMatch(SamlAuthzRuleMatch samlAuthzRuleMatch) {
    this.samlAuthzRuleMatch = samlAuthzRuleMatch;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Is set when saml session cookie is expired.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return samlSessionCookieExpired
   */
  @VsoMethod
  public Boolean getSamlSessionCookieExpired() {
    return samlSessionCookieExpired;
  }

  /**
   * This is the setter method to the attribute.
   * Is set when saml session cookie is expired.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param samlSessionCookieExpired set the samlSessionCookieExpired.
   */
  @VsoMethod
  public void setSamlSessionCookieExpired(Boolean  samlSessionCookieExpired) {
    this.samlSessionCookieExpired = samlSessionCookieExpired;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Saml userid.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return userid
   */
  @VsoMethod
  public String getUserid() {
    return userid;
  }

  /**
   * This is the setter method to the attribute.
   * Saml userid.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param userid set the userid.
   */
  @VsoMethod
  public void setUserid(String  userid) {
    this.userid = userid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SamlLog objSamlLog = (SamlLog) o;
  return   Objects.equals(this.isSamlAuthenticationUsed, objSamlLog.isSamlAuthenticationUsed)&&
  Objects.equals(this.samlAuthnRuleMatch, objSamlLog.samlAuthnRuleMatch)&&
  Objects.equals(this.samlAuthzRuleMatch, objSamlLog.samlAuthzRuleMatch)&&
  Objects.equals(this.samlAuthStatus, objSamlLog.samlAuthStatus)&&
  Objects.equals(this.samlSessionCookieExpired, objSamlLog.samlSessionCookieExpired)&&
  Objects.equals(this.userid, objSamlLog.userid)&&
  Objects.equals(this.samlAttributeLists, objSamlLog.samlAttributeLists);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SamlLog {\n");
      sb.append("    isSamlAuthenticationUsed: ").append(toIndentedString(isSamlAuthenticationUsed)).append("\n");
        sb.append("    samlAttributeLists: ").append(toIndentedString(samlAttributeLists)).append("\n");
        sb.append("    samlAuthStatus: ").append(toIndentedString(samlAuthStatus)).append("\n");
        sb.append("    samlAuthnRuleMatch: ").append(toIndentedString(samlAuthnRuleMatch)).append("\n");
        sb.append("    samlAuthzRuleMatch: ").append(toIndentedString(samlAuthzRuleMatch)).append("\n");
        sb.append("    samlSessionCookieExpired: ").append(toIndentedString(samlSessionCookieExpired)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
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

