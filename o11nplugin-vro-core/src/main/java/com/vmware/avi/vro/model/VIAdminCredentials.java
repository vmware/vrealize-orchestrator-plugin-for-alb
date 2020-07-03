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
 * The VIAdminCredentials is a POJO class extends AviRestResource that used for creating
 * VIAdminCredentials.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VIAdminCredentials")
@VsoFinder(name = Constants.FINDER_VRO_VIADMINCREDENTIALS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VIAdminCredentials extends AviRestResource {
  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = "root";

  @JsonProperty("password")
  @JsonInclude(Include.NON_NULL)
  private String password = "vmware";

  @JsonProperty("privilege")
  @JsonInclude(Include.NON_NULL)
  private String privilege = null;

  @JsonProperty("vcenter_url")
  @JsonInclude(Include.NON_NULL)
  private String vcenterUrl = null;

  @JsonProperty("vi_mgr_token")
  @JsonInclude(Include.NON_NULL)
  private String viMgrToken = null;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as root.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as root.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property password of obj type viadmincredentials field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as vmware.
   * @return password
   */
  @VsoMethod
  public String getPassword() {
    return password;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property password of obj type viadmincredentials field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as vmware.
   * @param password set the password.
   */
  @VsoMethod
  public void setPassword(String  password) {
    this.password = password;
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

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_url of obj type viadmincredentials field type str  type string.
   * @return vcenterUrl
   */
  @VsoMethod
  public String getVcenterUrl() {
    return vcenterUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_url of obj type viadmincredentials field type str  type string.
   * @param vcenterUrl set the vcenterUrl.
   */
  @VsoMethod
  public void setVcenterUrl(String  vcenterUrl) {
    this.vcenterUrl = vcenterUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vi_mgr_token of obj type viadmincredentials field type str  type string.
   * @return viMgrToken
   */
  @VsoMethod
  public String getViMgrToken() {
    return viMgrToken;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vi_mgr_token of obj type viadmincredentials field type str  type string.
   * @param viMgrToken set the viMgrToken.
   */
  @VsoMethod
  public void setViMgrToken(String  viMgrToken) {
    this.viMgrToken = viMgrToken;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VIAdminCredentials objVIAdminCredentials = (VIAdminCredentials) o;
  return   Objects.equals(this.vcenterUrl, objVIAdminCredentials.vcenterUrl)&&
  Objects.equals(this.privilege, objVIAdminCredentials.privilege)&&
  Objects.equals(this.password, objVIAdminCredentials.password)&&
  Objects.equals(this.name, objVIAdminCredentials.name)&&
  Objects.equals(this.viMgrToken, objVIAdminCredentials.viMgrToken);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VIAdminCredentials {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
        sb.append("    vcenterUrl: ").append(toIndentedString(vcenterUrl)).append("\n");
        sb.append("    viMgrToken: ").append(toIndentedString(viMgrToken)).append("\n");
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
