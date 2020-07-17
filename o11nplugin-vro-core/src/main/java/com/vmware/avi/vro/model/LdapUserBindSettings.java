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
 * The LdapUserBindSettings is a POJO class extends AviRestResource that used for creating
 * LdapUserBindSettings.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LdapUserBindSettings")
@VsoFinder(name = Constants.FINDER_VRO_LDAPUSERBINDSETTINGS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LdapUserBindSettings extends AviRestResource {
  @JsonProperty("dn_template")
  @JsonInclude(Include.NON_NULL)
  private String dnTemplate = null;

  @JsonProperty("token")
  @JsonInclude(Include.NON_NULL)
  private String token = "<user>";

  @JsonProperty("user_attributes")
  @JsonInclude(Include.NON_NULL)
  private List<String> userAttributes = null;

  @JsonProperty("user_id_attribute")
  @JsonInclude(Include.NON_NULL)
  private String userIdAttribute = null;



  /**
   * This is the getter method this will return the attribute value.
   * Ldap user dn pattern is used to bind ldap user after replacing the user token with real username.
   * @return dnTemplate
   */
  @VsoMethod
  public String getDnTemplate() {
    return dnTemplate;
  }

  /**
   * This is the setter method to the attribute.
   * Ldap user dn pattern is used to bind ldap user after replacing the user token with real username.
   * @param dnTemplate set the dnTemplate.
   */
  @VsoMethod
  public void setDnTemplate(String  dnTemplate) {
    this.dnTemplate = dnTemplate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ldap token is replaced with real user name in the user dn pattern.
   * Default value when not specified in API or module is interpreted by Avi Controller as <user>.
   * @return token
   */
  @VsoMethod
  public String getToken() {
    return token;
  }

  /**
   * This is the setter method to the attribute.
   * Ldap token is replaced with real user name in the user dn pattern.
   * Default value when not specified in API or module is interpreted by Avi Controller as <user>.
   * @param token set the token.
   */
  @VsoMethod
  public void setToken(String  token) {
    this.token = token;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ldap user attributes to fetch on a successful user bind.
   * @return userAttributes
   */
  @VsoMethod
  public List<String> getUserAttributes() {
    return userAttributes;
  }

  /**
   * This is the setter method. this will set the userAttributes
   * Ldap user attributes to fetch on a successful user bind.
   * @return userAttributes
   */
  @VsoMethod
  public void setUserAttributes(List<String>  userAttributes) {
    this.userAttributes = userAttributes;
  }

  /**
   * This is the setter method this will set the userAttributes
   * Ldap user attributes to fetch on a successful user bind.
   * @return userAttributes
   */
  @VsoMethod
  public LdapUserBindSettings addUserAttributesItem(String userAttributesItem) {
    if (this.userAttributes == null) {
      this.userAttributes = new ArrayList<String>();
    }
    this.userAttributes.add(userAttributesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Ldap user id attribute is the login attribute that uniquely identifies a single user record.
   * @return userIdAttribute
   */
  @VsoMethod
  public String getUserIdAttribute() {
    return userIdAttribute;
  }

  /**
   * This is the setter method to the attribute.
   * Ldap user id attribute is the login attribute that uniquely identifies a single user record.
   * @param userIdAttribute set the userIdAttribute.
   */
  @VsoMethod
  public void setUserIdAttribute(String  userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LdapUserBindSettings objLdapUserBindSettings = (LdapUserBindSettings) o;
  return   Objects.equals(this.dnTemplate, objLdapUserBindSettings.dnTemplate)&&
  Objects.equals(this.userAttributes, objLdapUserBindSettings.userAttributes)&&
  Objects.equals(this.token, objLdapUserBindSettings.token)&&
  Objects.equals(this.userIdAttribute, objLdapUserBindSettings.userIdAttribute);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LdapUserBindSettings {\n");
      sb.append("    dnTemplate: ").append(toIndentedString(dnTemplate)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    userAttributes: ").append(toIndentedString(userAttributes)).append("\n");
        sb.append("    userIdAttribute: ").append(toIndentedString(userIdAttribute)).append("\n");
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

