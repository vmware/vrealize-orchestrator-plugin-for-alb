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
 * The OpenStackClusterSetup is a POJO class extends AviRestResource that used for creating
 * OpenStackClusterSetup.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OpenStackClusterSetup")
@VsoFinder(name = Constants.FINDER_VRO_OPENSTACKCLUSTERSETUP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OpenStackClusterSetup extends AviRestResource {
  @JsonProperty("admin_tenant")
  @JsonInclude(Include.NON_NULL)
  private String adminTenant = null;

  @JsonProperty("auth_url")
  @JsonInclude(Include.NON_NULL)
  private String authUrl = null;

  @JsonProperty("cc_id")
  @JsonInclude(Include.NON_NULL)
  private String ccId = null;

  @JsonProperty("error_string")
  @JsonInclude(Include.NON_NULL)
  private String errorString = null;

  @JsonProperty("keystone_host")
  @JsonInclude(Include.NON_NULL)
  private String keystoneHost = null;

  @JsonProperty("privilege")
  @JsonInclude(Include.NON_NULL)
  private String privilege = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property admin_tenant of obj type openstackclustersetup field type str  type string.
   * @return adminTenant
   */
  @VsoMethod
  public String getAdminTenant() {
    return adminTenant;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property admin_tenant of obj type openstackclustersetup field type str  type string.
   * @param adminTenant set the adminTenant.
   */
  @VsoMethod
  public void setAdminTenant(String  adminTenant) {
    this.adminTenant = adminTenant;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property auth_url of obj type openstackclustersetup field type str  type string.
   * @return authUrl
   */
  @VsoMethod
  public String getAuthUrl() {
    return authUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property auth_url of obj type openstackclustersetup field type str  type string.
   * @param authUrl set the authUrl.
   */
  @VsoMethod
  public void setAuthUrl(String  authUrl) {
    this.authUrl = authUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cc_id of obj type openstackclustersetup field type str  type string.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cc_id of obj type openstackclustersetup field type str  type string.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property error_string of obj type openstackclustersetup field type str  type string.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property error_string of obj type openstackclustersetup field type str  type string.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property keystone_host of obj type openstackclustersetup field type str  type string.
   * @return keystoneHost
   */
  @VsoMethod
  public String getKeystoneHost() {
    return keystoneHost;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property keystone_host of obj type openstackclustersetup field type str  type string.
   * @param keystoneHost set the keystoneHost.
   */
  @VsoMethod
  public void setKeystoneHost(String  keystoneHost) {
    this.keystoneHost = keystoneHost;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
   * @return privilege
   */
  @VsoMethod
  public String getPrivilege() {
    return privilege;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
   * @param privilege set the privilege.
   */
  @VsoMethod
  public void setPrivilege(String  privilege) {
    this.privilege = privilege;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OpenStackClusterSetup objOpenStackClusterSetup = (OpenStackClusterSetup) o;
  return   Objects.equals(this.ccId, objOpenStackClusterSetup.ccId)&&
  Objects.equals(this.keystoneHost, objOpenStackClusterSetup.keystoneHost)&&
  Objects.equals(this.adminTenant, objOpenStackClusterSetup.adminTenant)&&
  Objects.equals(this.privilege, objOpenStackClusterSetup.privilege)&&
  Objects.equals(this.errorString, objOpenStackClusterSetup.errorString)&&
  Objects.equals(this.authUrl, objOpenStackClusterSetup.authUrl);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OpenStackClusterSetup {\n");
      sb.append("    adminTenant: ").append(toIndentedString(adminTenant)).append("\n");
        sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
        sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    keystoneHost: ").append(toIndentedString(keystoneHost)).append("\n");
        sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
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

