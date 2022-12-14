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
 * The VCASetup is a POJO class extends AviRestResource that used for creating
 * VCASetup.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VCASetup")
@VsoFinder(name = Constants.FINDER_VRO_VCASETUP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VCASetup extends AviRestResource {
    @JsonProperty("cc_id")
    @JsonInclude(Include.NON_NULL)
    private String ccId = null;

    @JsonProperty("error_string")
    @JsonInclude(Include.NON_NULL)
    private String errorString = null;

    @JsonProperty("instance")
    @JsonInclude(Include.NON_NULL)
    private String instance = null;

    @JsonProperty("privilege")
    @JsonInclude(Include.NON_NULL)
    private String privilege = null;

    @JsonProperty("username")
    @JsonInclude(Include.NON_NULL)
    private String username = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return instance
   */
  @VsoMethod
  public String getInstance() {
    return instance;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param instance set the instance.
   */
  @VsoMethod
  public void setInstance(String  instance) {
    this.instance = instance;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return privilege
   */
  @VsoMethod
  public String getPrivilege() {
    return privilege;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param privilege set the privilege.
   */
  @VsoMethod
  public void setPrivilege(String  privilege) {
    this.privilege = privilege;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return username
   */
  @VsoMethod
  public String getUsername() {
    return username;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
  VCASetup objVCASetup = (VCASetup) o;
  return   Objects.equals(this.ccId, objVCASetup.ccId)&&
  Objects.equals(this.username, objVCASetup.username)&&
  Objects.equals(this.instance, objVCASetup.instance)&&
  Objects.equals(this.privilege, objVCASetup.privilege)&&
  Objects.equals(this.errorString, objVCASetup.errorString);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VCASetup {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
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

