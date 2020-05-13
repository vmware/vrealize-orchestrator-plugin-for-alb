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
 * VIAdminCredentials
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIAdminCredentials")
@VsoFinder(name = Constants.FINDER_VRO_VIADMINCREDENTIALS, idAccessor = "getObjectID()")
@Service
public class VIAdminCredentials extends AviRestResource  {
  @JsonProperty("name")
  private String name = "root";

  @JsonProperty("password")
  private String password = "vmware";

  @JsonProperty("privilege")
  private String privilege = null;

  @JsonProperty("vcenter_url")
  private String vcenterUrl = null;

  @JsonProperty("vi_mgr_token")
  private String viMgrToken = null;

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the object.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * password of VIAdminCredentials.
   * @return password
  **/
  @ApiModelProperty(value = "password of VIAdminCredentials.")


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   *  Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
   * @return privilege
  **/
  @ApiModelProperty(value = " Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.")


 
  @VsoMethod  
  public String getPrivilege() {
    return privilege;
  }
    
  @VsoMethod
  public void setPrivilege(String privilege) {
    this.privilege = privilege;
  }

  
  /**
   * vcenter_url of VIAdminCredentials.
   * @return vcenterUrl
  **/
  @ApiModelProperty(required = true, value = "vcenter_url of VIAdminCredentials.")
  @NotNull


 
  @VsoMethod  
  public String getVcenterUrl() {
    return vcenterUrl;
  }
    
  @VsoMethod
  public void setVcenterUrl(String vcenterUrl) {
    this.vcenterUrl = vcenterUrl;
  }

  
  /**
   * vi_mgr_token of VIAdminCredentials.
   * @return viMgrToken
  **/
  @ApiModelProperty(value = "vi_mgr_token of VIAdminCredentials.")


 
  @VsoMethod  
  public String getViMgrToken() {
    return viMgrToken;
  }
    
  @VsoMethod
  public void setViMgrToken(String viMgrToken) {
    this.viMgrToken = viMgrToken;
  }

  
  public String getObjectID() {
		return "VIAdminCredentials";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIAdminCredentials viAdminCredentials = (VIAdminCredentials) o;
    return Objects.equals(this.name, viAdminCredentials.name) &&
        Objects.equals(this.password, viAdminCredentials.password) &&
        Objects.equals(this.privilege, viAdminCredentials.privilege) &&
        Objects.equals(this.vcenterUrl, viAdminCredentials.vcenterUrl) &&
        Objects.equals(this.viMgrToken, viAdminCredentials.viMgrToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, password, privilege, vcenterUrl, viMgrToken);
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

