package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.LdapDirectorySettings;
import com.vmware.avi.vro.model.LdapUserBindSettings;
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
 * LdapAuthSettings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "LdapAuthSettings")
@VsoFinder(name = Constants.FINDER_VRO_LDAPAUTHSETTINGS, idAccessor = "getObjectID()")
@Service
public class LdapAuthSettings extends AviRestResource  {
  @JsonProperty("base_dn")
  private String baseDn = null;

  @JsonProperty("bind_as_administrator")
  private Boolean bindAsAdministrator = true;

  @JsonProperty("email_attribute")
  private String emailAttribute = "email";

  @JsonProperty("full_name_attribute")
  private String fullNameAttribute = "name";

  @JsonProperty("port")
  private Integer port = 389;

  @JsonProperty("security_mode")
  private String securityMode = null;

  @JsonProperty("server")
  @Valid
  private List<String> server = null;

  @JsonProperty("settings")
  private LdapDirectorySettings settings = null;

  @JsonProperty("user_bind")
  private LdapUserBindSettings userBind = null;

  
  /**
   * The LDAP base DN.  For example, avinetworks.com would be DC=avinetworks,DC=com.
   * @return baseDn
  **/
  @ApiModelProperty(value = "The LDAP base DN.  For example, avinetworks.com would be DC=avinetworks,DC=com.")


 
  @VsoMethod  
  public String getBaseDn() {
    return baseDn;
  }
    
  @VsoMethod
  public void setBaseDn(String baseDn) {
    this.baseDn = baseDn;
  }

  
  /**
   * LDAP administrator credentials are used to search for users and group memberships.
   * @return bindAsAdministrator
  **/
  @ApiModelProperty(value = "LDAP administrator credentials are used to search for users and group memberships.")


 
  @VsoMethod  
  public Boolean isBindAsAdministrator() {
    return bindAsAdministrator;
  }
    
  @VsoMethod
  public void setBindAsAdministrator(Boolean bindAsAdministrator) {
    this.bindAsAdministrator = bindAsAdministrator;
  }

  
  /**
   * LDAP attribute that refers to user email.
   * @return emailAttribute
  **/
  @ApiModelProperty(value = "LDAP attribute that refers to user email.")


 
  @VsoMethod  
  public String getEmailAttribute() {
    return emailAttribute;
  }
    
  @VsoMethod
  public void setEmailAttribute(String emailAttribute) {
    this.emailAttribute = emailAttribute;
  }

  
  /**
   * LDAP attribute that refers to user's full name.
   * @return fullNameAttribute
  **/
  @ApiModelProperty(value = "LDAP attribute that refers to user's full name.")


 
  @VsoMethod  
  public String getFullNameAttribute() {
    return fullNameAttribute;
  }
    
  @VsoMethod
  public void setFullNameAttribute(String fullNameAttribute) {
    this.fullNameAttribute = fullNameAttribute;
  }

  
  /**
   * Query the LDAP servers on this port.
   * @return port
  **/
  @ApiModelProperty(value = "Query the LDAP servers on this port.")


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  /**
   * LDAP connection security mode. Enum options - AUTH_LDAP_SECURE_NONE, AUTH_LDAP_SECURE_USE_LDAPS.
   * @return securityMode
  **/
  @ApiModelProperty(value = "LDAP connection security mode. Enum options - AUTH_LDAP_SECURE_NONE, AUTH_LDAP_SECURE_USE_LDAPS.")


 
  @VsoMethod  
  public String getSecurityMode() {
    return securityMode;
  }
    
  @VsoMethod
  public void setSecurityMode(String securityMode) {
    this.securityMode = securityMode;
  }

  
  public LdapAuthSettings addServerItem(String serverItem) {
    if (this.server == null) {
      this.server = new ArrayList<String>();
    }
    this.server.add(serverItem);
    return this;
  }
  
  /**
   * LDAP server IP address or Hostname. Use IP address if an auth profile is used to configure Virtual Service.
   * @return server
  **/
  @ApiModelProperty(value = "LDAP server IP address or Hostname. Use IP address if an auth profile is used to configure Virtual Service.")


 
  @VsoMethod  
  public List<String> getServer() {
    return server;
  }
    
  @VsoMethod
  public void setServer(List<String> server) {
    this.server = server;
  }

  
  /**
   * LDAP full directory configuration with administrator credentials.
   * @return settings
  **/
  @ApiModelProperty(value = "LDAP full directory configuration with administrator credentials.")

  @Valid

 
  @VsoMethod  
  public LdapDirectorySettings getSettings() {
    return settings;
  }
    
  @VsoMethod
  public void setSettings(LdapDirectorySettings settings) {
    this.settings = settings;
  }

  
  /**
   * LDAP anonymous bind configuration.
   * @return userBind
  **/
  @ApiModelProperty(value = "LDAP anonymous bind configuration.")

  @Valid

 
  @VsoMethod  
  public LdapUserBindSettings getUserBind() {
    return userBind;
  }
    
  @VsoMethod
  public void setUserBind(LdapUserBindSettings userBind) {
    this.userBind = userBind;
  }

  
  public String getObjectID() {
		return "LdapAuthSettings";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LdapAuthSettings ldapAuthSettings = (LdapAuthSettings) o;
    return Objects.equals(this.baseDn, ldapAuthSettings.baseDn) &&
        Objects.equals(this.bindAsAdministrator, ldapAuthSettings.bindAsAdministrator) &&
        Objects.equals(this.emailAttribute, ldapAuthSettings.emailAttribute) &&
        Objects.equals(this.fullNameAttribute, ldapAuthSettings.fullNameAttribute) &&
        Objects.equals(this.port, ldapAuthSettings.port) &&
        Objects.equals(this.securityMode, ldapAuthSettings.securityMode) &&
        Objects.equals(this.server, ldapAuthSettings.server) &&
        Objects.equals(this.settings, ldapAuthSettings.settings) &&
        Objects.equals(this.userBind, ldapAuthSettings.userBind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseDn, bindAsAdministrator, emailAttribute, fullNameAttribute, port, securityMode, server, settings, userBind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapAuthSettings {\n");
    
    sb.append("    baseDn: ").append(toIndentedString(baseDn)).append("\n");
    sb.append("    bindAsAdministrator: ").append(toIndentedString(bindAsAdministrator)).append("\n");
    sb.append("    emailAttribute: ").append(toIndentedString(emailAttribute)).append("\n");
    sb.append("    fullNameAttribute: ").append(toIndentedString(fullNameAttribute)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    securityMode: ").append(toIndentedString(securityMode)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    userBind: ").append(toIndentedString(userBind)).append("\n");
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

