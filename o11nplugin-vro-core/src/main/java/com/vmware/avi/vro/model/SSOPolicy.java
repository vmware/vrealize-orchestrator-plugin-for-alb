package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AuthenticationPolicy;
import com.vmware.avi.vro.model.AuthorizationPolicy;
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
 * SSOPolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SSOPolicy")
@VsoFinder(name = Constants.FINDER_VRO_SSOPOLICY, idAccessor = "getObjectID()")
@Service
public class SSOPolicy extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("authentication_policy")
  private AuthenticationPolicy authenticationPolicy = null;

  @JsonProperty("authorization_policy")
  private AuthorizationPolicy authorizationPolicy = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("type")
  private String type = "SSO_TYPE_SAML";

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
   * Authentication Policy Settings. Field introduced in 18.2.1.
   * @return authenticationPolicy
  **/
  @ApiModelProperty(required = true, value = "Authentication Policy Settings. Field introduced in 18.2.1.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public AuthenticationPolicy getAuthenticationPolicy() {
    return authenticationPolicy;
  }
    
  @VsoMethod
  public void setAuthenticationPolicy(AuthenticationPolicy authenticationPolicy) {
    this.authenticationPolicy = authenticationPolicy;
  }

  
  /**
   * Authorization Policy Settings. Field introduced in 18.2.5.
   * @return authorizationPolicy
  **/
  @ApiModelProperty(value = "Authorization Policy Settings. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public AuthorizationPolicy getAuthorizationPolicy() {
    return authorizationPolicy;
  }
    
  @VsoMethod
  public void setAuthorizationPolicy(AuthorizationPolicy authorizationPolicy) {
    this.authorizationPolicy = authorizationPolicy;
  }

  
  /**
   * Name of the SSO Policy. Field introduced in 18.2.3.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the SSO Policy. Field introduced in 18.2.3.")
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
   * UUID of the Tenant. It is a reference to an object of type Tenant. Field introduced in 18.2.3.
   * @return tenantRef
  **/
  @ApiModelProperty(value = "UUID of the Tenant. It is a reference to an object of type Tenant. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * SSO Policy Type. Enum options - SSO_TYPE_SAML, SSO_TYPE_PINGACCESS. Field introduced in 18.2.5.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "SSO Policy Type. Enum options - SSO_TYPE_SAML, SSO_TYPE_PINGACCESS. Field introduced in 18.2.5.")
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
   * UUID of the SSO Policy. Field introduced in 18.2.3.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the SSO Policy. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "SSOPolicy";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSOPolicy ssOPolicy = (SSOPolicy) o;
    return Objects.equals(this.lastModified, ssOPolicy.lastModified) &&
        Objects.equals(this.authenticationPolicy, ssOPolicy.authenticationPolicy) &&
        Objects.equals(this.authorizationPolicy, ssOPolicy.authorizationPolicy) &&
        Objects.equals(this.name, ssOPolicy.name) &&
        Objects.equals(this.tenantRef, ssOPolicy.tenantRef) &&
        Objects.equals(this.type, ssOPolicy.type) &&
        Objects.equals(this.url, ssOPolicy.url) &&
        Objects.equals(this.uuid, ssOPolicy.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, authenticationPolicy, authorizationPolicy, name, tenantRef, type, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSOPolicy {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    authenticationPolicy: ").append(toIndentedString(authenticationPolicy)).append("\n");
    sb.append("    authorizationPolicy: ").append(toIndentedString(authorizationPolicy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

