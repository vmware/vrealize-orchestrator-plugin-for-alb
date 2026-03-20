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
 * The RemoteController is a POJO class extends AviRestResource that used for creating
 * RemoteController.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RemoteController")
@VsoFinder(name = Constants.FINDER_VRO_REMOTECONTROLLER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RemoteController extends AviRestResource {
    @JsonProperty("address")
    @JsonInclude(Include.NON_NULL)
    private String address;

    @JsonProperty("enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean enabled = false;

    @JsonProperty("password")
    @JsonInclude(Include.NON_NULL)
    private String password;

    @JsonProperty("tenant")
    @JsonInclude(Include.NON_NULL)
    private String tenant;

    @JsonProperty("username")
    @JsonInclude(Include.NON_NULL)
    private String username;



  /**
   * This is the getter method this will return the attribute value.
   * Remote controller address.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return address
   */
  @VsoMethod
  public String getAddress() {
    return address;
  }

  /**
   * This is the setter method to the attribute.
   * Remote controller address.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param address set the address.
   */
  @VsoMethod
  public void setAddress(String  address) {
    this.address = address;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable remote controller request.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable remote controller request.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Remote controller password.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return password
   */
  @VsoMethod
  public String getPassword() {
    return password;
  }

  /**
   * This is the setter method to the attribute.
   * Remote controller password.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param password set the password.
   */
  @VsoMethod
  public void setPassword(String  password) {
    this.password = password;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Remote controller tenant name.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenant
   */
  @VsoMethod
  public String getTenant() {
    return tenant;
  }

  /**
   * This is the setter method to the attribute.
   * Remote controller tenant name.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenant set the tenant.
   */
  @VsoMethod
  public void setTenant(String  tenant) {
    this.tenant = tenant;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Remote controller username.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return username
   */
  @VsoMethod
  public String getUsername() {
    return username;
  }

  /**
   * This is the setter method to the attribute.
   * Remote controller username.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
  RemoteController objRemoteController = (RemoteController) o;
  return   Objects.equals(this.enabled, objRemoteController.enabled)&&
  Objects.equals(this.address, objRemoteController.address)&&
  Objects.equals(this.username, objRemoteController.username)&&
  Objects.equals(this.password, objRemoteController.password)&&
  Objects.equals(this.tenant, objRemoteController.tenant);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RemoteController {\n");
      sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
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

