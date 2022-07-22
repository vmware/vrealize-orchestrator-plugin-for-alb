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
 * The OpenStackRoleMapping is a POJO class extends AviRestResource that used for creating
 * OpenStackRoleMapping.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OpenStackRoleMapping")
@VsoFinder(name = Constants.FINDER_VRO_OPENSTACKROLEMAPPING)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OpenStackRoleMapping extends AviRestResource {
    @JsonProperty("avi_role")
    @JsonInclude(Include.NON_NULL)
    private String aviRole = null;

    @JsonProperty("os_role")
    @JsonInclude(Include.NON_NULL)
    private String osRole = null;



  /**
   * This is the getter method this will return the attribute value.
   * Role name in avi.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return aviRole
   */
  @VsoMethod
  public String getAviRole() {
    return aviRole;
  }

  /**
   * This is the setter method to the attribute.
   * Role name in avi.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param aviRole set the aviRole.
   */
  @VsoMethod
  public void setAviRole(String  aviRole) {
    this.aviRole = aviRole;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Role name in openstack.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return osRole
   */
  @VsoMethod
  public String getOsRole() {
    return osRole;
  }

  /**
   * This is the setter method to the attribute.
   * Role name in openstack.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param osRole set the osRole.
   */
  @VsoMethod
  public void setOsRole(String  osRole) {
    this.osRole = osRole;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OpenStackRoleMapping objOpenStackRoleMapping = (OpenStackRoleMapping) o;
  return   Objects.equals(this.osRole, objOpenStackRoleMapping.osRole)&&
  Objects.equals(this.aviRole, objOpenStackRoleMapping.aviRole);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OpenStackRoleMapping {\n");
      sb.append("    aviRole: ").append(toIndentedString(aviRole)).append("\n");
        sb.append("    osRole: ").append(toIndentedString(osRole)).append("\n");
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

