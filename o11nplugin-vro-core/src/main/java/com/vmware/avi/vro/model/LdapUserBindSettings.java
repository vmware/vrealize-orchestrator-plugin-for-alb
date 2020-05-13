package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * LdapUserBindSettings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "LdapUserBindSettings")
@VsoFinder(name = Constants.FINDER_VRO_LDAPUSERBINDSETTINGS, idAccessor = "getObjectID()")
@Service
public class LdapUserBindSettings extends AviRestResource  {
  @JsonProperty("dn_template")
  private String dnTemplate = null;

  @JsonProperty("token")
  private String token = "<user>";

  @JsonProperty("user_attributes")
  @Valid
  private List<String> userAttributes = null;

  @JsonProperty("user_id_attribute")
  private String userIdAttribute = null;

  
  /**
   * LDAP user DN pattern is used to bind LDAP user after replacing the user token with real username.
   * @return dnTemplate
  **/
  @ApiModelProperty(value = "LDAP user DN pattern is used to bind LDAP user after replacing the user token with real username.")


 
  @VsoMethod  
  public String getDnTemplate() {
    return dnTemplate;
  }
    
  @VsoMethod
  public void setDnTemplate(String dnTemplate) {
    this.dnTemplate = dnTemplate;
  }

  
  /**
   * LDAP token is replaced with real user name in the user DN pattern.
   * @return token
  **/
  @ApiModelProperty(value = "LDAP token is replaced with real user name in the user DN pattern.")


 
  @VsoMethod  
  public String getToken() {
    return token;
  }
    
  @VsoMethod
  public void setToken(String token) {
    this.token = token;
  }

  
  public LdapUserBindSettings addUserAttributesItem(String userAttributesItem) {
    if (this.userAttributes == null) {
      this.userAttributes = new ArrayList<String>();
    }
    this.userAttributes.add(userAttributesItem);
    return this;
  }
  
  /**
   * LDAP user attributes to fetch on a successful user bind.
   * @return userAttributes
  **/
  @ApiModelProperty(value = "LDAP user attributes to fetch on a successful user bind.")


 
  @VsoMethod  
  public List<String> getUserAttributes() {
    return userAttributes;
  }
    
  @VsoMethod
  public void setUserAttributes(List<String> userAttributes) {
    this.userAttributes = userAttributes;
  }

  
  /**
   * LDAP user id attribute is the login attribute that uniquely identifies a single user record.
   * @return userIdAttribute
  **/
  @ApiModelProperty(value = "LDAP user id attribute is the login attribute that uniquely identifies a single user record.")


 
  @VsoMethod  
  public String getUserIdAttribute() {
    return userIdAttribute;
  }
    
  @VsoMethod
  public void setUserIdAttribute(String userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
  }

  
  public String getObjectID() {
		return "LdapUserBindSettings";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LdapUserBindSettings ldapUserBindSettings = (LdapUserBindSettings) o;
    return Objects.equals(this.dnTemplate, ldapUserBindSettings.dnTemplate) &&
        Objects.equals(this.token, ldapUserBindSettings.token) &&
        Objects.equals(this.userAttributes, ldapUserBindSettings.userAttributes) &&
        Objects.equals(this.userIdAttribute, ldapUserBindSettings.userIdAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnTemplate, token, userAttributes, userIdAttribute);
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

