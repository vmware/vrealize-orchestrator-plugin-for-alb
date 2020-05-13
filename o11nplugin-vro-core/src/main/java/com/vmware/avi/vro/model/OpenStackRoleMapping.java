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
 * OpenStackRoleMapping
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "OpenStackRoleMapping")
@VsoFinder(name = Constants.FINDER_VRO_OPENSTACKROLEMAPPING, idAccessor = "getObjectID()")
@Service
public class OpenStackRoleMapping extends AviRestResource  {
  @JsonProperty("avi_role")
  private String aviRole = null;

  @JsonProperty("os_role")
  private String osRole = null;

  
  /**
   * Role name in Avi.
   * @return aviRole
  **/
  @ApiModelProperty(required = true, value = "Role name in Avi.")
  @NotNull


 
  @VsoMethod  
  public String getAviRole() {
    return aviRole;
  }
    
  @VsoMethod
  public void setAviRole(String aviRole) {
    this.aviRole = aviRole;
  }

  
  /**
   * Role name in OpenStack.
   * @return osRole
  **/
  @ApiModelProperty(required = true, value = "Role name in OpenStack.")
  @NotNull


 
  @VsoMethod  
  public String getOsRole() {
    return osRole;
  }
    
  @VsoMethod
  public void setOsRole(String osRole) {
    this.osRole = osRole;
  }

  
  public String getObjectID() {
		return "OpenStackRoleMapping";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenStackRoleMapping openStackRoleMapping = (OpenStackRoleMapping) o;
    return Objects.equals(this.aviRole, openStackRoleMapping.aviRole) &&
        Objects.equals(this.osRole, openStackRoleMapping.osRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aviRole, osRole);
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

