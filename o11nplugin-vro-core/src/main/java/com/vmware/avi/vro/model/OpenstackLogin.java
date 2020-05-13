package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * OpenstackLogin
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "OpenstackLogin")
@VsoFinder(name = Constants.FINDER_VRO_OPENSTACKLOGIN, idAccessor = "getObjectID()")
@Service
public class OpenstackLogin extends AviRestResource  {
  @JsonProperty("admin_tenant")
  private String adminTenant = "admin";

  @JsonProperty("auth_url")
  private String authUrl = null;

  @JsonProperty("keystone_host")
  private String keystoneHost = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("username")
  private String username = null;

  
  /**
   * admin_tenant of OpenstackLogin.
   * @return adminTenant
  **/
  @ApiModelProperty(value = "admin_tenant of OpenstackLogin.")


 
  @VsoMethod  
  public String getAdminTenant() {
    return adminTenant;
  }
    
  @VsoMethod
  public void setAdminTenant(String adminTenant) {
    this.adminTenant = adminTenant;
  }

  
  /**
   * auth_url of OpenstackLogin.
   * @return authUrl
  **/
  @ApiModelProperty(value = "auth_url of OpenstackLogin.")


 
  @VsoMethod  
  public String getAuthUrl() {
    return authUrl;
  }
    
  @VsoMethod
  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }

  
  /**
   * keystone_host of OpenstackLogin.
   * @return keystoneHost
  **/
  @ApiModelProperty(value = "keystone_host of OpenstackLogin.")


 
  @VsoMethod  
  public String getKeystoneHost() {
    return keystoneHost;
  }
    
  @VsoMethod
  public void setKeystoneHost(String keystoneHost) {
    this.keystoneHost = keystoneHost;
  }

  
  /**
   * password of OpenstackLogin.
   * @return password
  **/
  @ApiModelProperty(required = true, value = "password of OpenstackLogin.")
  @NotNull


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * region of OpenstackLogin.
   * @return region
  **/
  @ApiModelProperty(value = "region of OpenstackLogin.")


 
  @VsoMethod  
  public String getRegion() {
    return region;
  }
    
  @VsoMethod
  public void setRegion(String region) {
    this.region = region;
  }

  
  /**
   * username of OpenstackLogin.
   * @return username
  **/
  @ApiModelProperty(required = true, value = "username of OpenstackLogin.")
  @NotNull


 
  @VsoMethod  
  public String getUsername() {
    return username;
  }
    
  @VsoMethod
  public void setUsername(String username) {
    this.username = username;
  }

  
  public String getObjectID() {
		return "OpenstackLogin";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenstackLogin openstackLogin = (OpenstackLogin) o;
    return Objects.equals(this.adminTenant, openstackLogin.adminTenant) &&
        Objects.equals(this.authUrl, openstackLogin.authUrl) &&
        Objects.equals(this.keystoneHost, openstackLogin.keystoneHost) &&
        Objects.equals(this.password, openstackLogin.password) &&
        Objects.equals(this.region, openstackLogin.region) &&
        Objects.equals(this.username, openstackLogin.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminTenant, authUrl, keystoneHost, password, region, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenstackLogin {\n");
    
    sb.append("    adminTenant: ").append(toIndentedString(adminTenant)).append("\n");
    sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
    sb.append("    keystoneHost: ").append(toIndentedString(keystoneHost)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

