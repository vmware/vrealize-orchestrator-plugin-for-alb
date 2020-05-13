package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AuthProfileHTTPClientParams;
import com.vmware.avi.vro.model.LdapAuthSettings;
import com.vmware.avi.vro.model.SamlSettings;
import com.vmware.avi.vro.model.TacacsPlusAuthSettings;
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
 * AuthProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AuthProfile")
@VsoFinder(name = Constants.FINDER_VRO_AUTHPROFILE, idAccessor = "getObjectID()")
@Service
public class AuthProfile extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("http")
  private AuthProfileHTTPClientParams http = null;

  @JsonProperty("ldap")
  private LdapAuthSettings ldap = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("pa_agent_ref")
  private String paAgentRef = null;

  @JsonProperty("saml")
  private SamlSettings saml = null;

  @JsonProperty("tacacs_plus")
  private TacacsPlusAuthSettings tacacsPlus = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * User defined description for the object.
   * @return description
  **/
  @ApiModelProperty(value = "User defined description for the object.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * HTTP user authentication params.
   * @return http
  **/
  @ApiModelProperty(value = "HTTP user authentication params.")

  @Valid

 
  @VsoMethod  
  public AuthProfileHTTPClientParams getHttp() {
    return http;
  }
    
  @VsoMethod
  public void setHttp(AuthProfileHTTPClientParams http) {
    this.http = http;
  }

  
  /**
   * LDAP server and directory settings.
   * @return ldap
  **/
  @ApiModelProperty(value = "LDAP server and directory settings.")

  @Valid

 
  @VsoMethod  
  public LdapAuthSettings getLdap() {
    return ldap;
  }
    
  @VsoMethod
  public void setLdap(LdapAuthSettings ldap) {
    this.ldap = ldap;
  }

  
  /**
   * Name of the Auth Profile.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the Auth Profile.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * PingAccessAgent uuid. It is a reference to an object of type PingAccessAgent. Field introduced in 18.2.3.
   * @return paAgentRef
  **/
  @ApiModelProperty(value = "PingAccessAgent uuid. It is a reference to an object of type PingAccessAgent. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getPaAgentRef() {
    return paAgentRef;
  }
    
  @VsoMethod
  public void setPaAgentRef(String paAgentRef) {
    this.paAgentRef = paAgentRef;
  }

  
  /**
   * SAML settings. Field introduced in 17.2.3.
   * @return saml
  **/
  @ApiModelProperty(value = "SAML settings. Field introduced in 17.2.3.")

  @Valid

 
  @VsoMethod  
  public SamlSettings getSaml() {
    return saml;
  }
    
  @VsoMethod
  public void setSaml(SamlSettings saml) {
    this.saml = saml;
  }

  
  /**
   * TACACS+ settings.
   * @return tacacsPlus
  **/
  @ApiModelProperty(value = "TACACS+ settings.")

  @Valid

 
  @VsoMethod  
  public TacacsPlusAuthSettings getTacacsPlus() {
    return tacacsPlus;
  }
    
  @VsoMethod
  public void setTacacsPlus(TacacsPlusAuthSettings tacacsPlus) {
    this.tacacsPlus = tacacsPlus;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * Type of the Auth Profile. Enum options - AUTH_PROFILE_LDAP, AUTH_PROFILE_TACACS_PLUS, AUTH_PROFILE_SAML, AUTH_PROFILE_PINGACCESS.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of the Auth Profile. Enum options - AUTH_PROFILE_LDAP, AUTH_PROFILE_TACACS_PLUS, AUTH_PROFILE_SAML, AUTH_PROFILE_PINGACCESS.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * UUID of the Auth Profile.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the Auth Profile.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "AuthProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthProfile authProfile = (AuthProfile) o;
    return Objects.equals(this.lastModified, authProfile.lastModified) &&
        Objects.equals(this.description, authProfile.description) &&
        Objects.equals(this.http, authProfile.http) &&
        Objects.equals(this.ldap, authProfile.ldap) &&
        Objects.equals(this.name, authProfile.name) &&
        Objects.equals(this.paAgentRef, authProfile.paAgentRef) &&
        Objects.equals(this.saml, authProfile.saml) &&
        Objects.equals(this.tacacsPlus, authProfile.tacacsPlus) &&
        Objects.equals(this.tenantRef, authProfile.tenantRef) &&
        Objects.equals(this.type, authProfile.type) &&
        Objects.equals(this.url, authProfile.url) &&
        Objects.equals(this.uuid, authProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, description, http, ldap, name, paAgentRef, saml, tacacsPlus, tenantRef, type, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthProfile {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
    sb.append("    ldap: ").append(toIndentedString(ldap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paAgentRef: ").append(toIndentedString(paAgentRef)).append("\n");
    sb.append("    saml: ").append(toIndentedString(saml)).append("\n");
    sb.append("    tacacsPlus: ").append(toIndentedString(tacacsPlus)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

