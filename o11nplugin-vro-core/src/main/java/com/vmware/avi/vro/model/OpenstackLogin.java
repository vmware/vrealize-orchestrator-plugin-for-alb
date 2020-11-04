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
 * The OpenstackLogin is a POJO class extends AviRestResource that used for creating
 * OpenstackLogin.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OpenstackLogin")
@VsoFinder(name = Constants.FINDER_VRO_OPENSTACKLOGIN)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OpenstackLogin extends AviRestResource {
    @JsonProperty("admin_tenant")
    @JsonInclude(Include.NON_NULL)
    private String adminTenant = "admin";

    @JsonProperty("auth_url")
    @JsonInclude(Include.NON_NULL)
    private String authUrl = null;

    @JsonProperty("keystone_host")
    @JsonInclude(Include.NON_NULL)
    private String keystoneHost = null;

    @JsonProperty("password")
    @JsonInclude(Include.NON_NULL)
    private String password = null;

    @JsonProperty("region")
    @JsonInclude(Include.NON_NULL)
    private String region = null;

    @JsonProperty("username")
    @JsonInclude(Include.NON_NULL)
    private String username = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property admin_tenant of obj type openstacklogin field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as "admin".
   * @return adminTenant
   */
  @VsoMethod
  public String getAdminTenant() {
    return adminTenant;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property admin_tenant of obj type openstacklogin field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as "admin".
   * @param adminTenant set the adminTenant.
   */
  @VsoMethod
  public void setAdminTenant(String  adminTenant) {
    this.adminTenant = adminTenant;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property auth_url of obj type openstacklogin field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authUrl
   */
  @VsoMethod
  public String getAuthUrl() {
    return authUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property auth_url of obj type openstacklogin field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param authUrl set the authUrl.
   */
  @VsoMethod
  public void setAuthUrl(String  authUrl) {
    this.authUrl = authUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property keystone_host of obj type openstacklogin field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return keystoneHost
   */
  @VsoMethod
  public String getKeystoneHost() {
    return keystoneHost;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property keystone_host of obj type openstacklogin field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param keystoneHost set the keystoneHost.
   */
  @VsoMethod
  public void setKeystoneHost(String  keystoneHost) {
    this.keystoneHost = keystoneHost;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property password of obj type openstacklogin field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return password
   */
  @VsoMethod
  public String getPassword() {
    return password;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property password of obj type openstacklogin field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param password set the password.
   */
  @VsoMethod
  public void setPassword(String  password) {
    this.password = password;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property region of obj type openstacklogin field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return region
   */
  @VsoMethod
  public String getRegion() {
    return region;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property region of obj type openstacklogin field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param region set the region.
   */
  @VsoMethod
  public void setRegion(String  region) {
    this.region = region;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property username of obj type openstacklogin field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return username
   */
  @VsoMethod
  public String getUsername() {
    return username;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property username of obj type openstacklogin field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param username set the username.
   */
  @VsoMethod
  public void setUsername(String  username) {
    this.username = username;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OpenstackLogin objOpenstackLogin = (OpenstackLogin) o;
  return   Objects.equals(this.username, objOpenstackLogin.username)&&
  Objects.equals(this.password, objOpenstackLogin.password)&&
  Objects.equals(this.adminTenant, objOpenstackLogin.adminTenant)&&
  Objects.equals(this.keystoneHost, objOpenstackLogin.keystoneHost)&&
  Objects.equals(this.region, objOpenstackLogin.region)&&
  Objects.equals(this.authUrl, objOpenstackLogin.authUrl);
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

