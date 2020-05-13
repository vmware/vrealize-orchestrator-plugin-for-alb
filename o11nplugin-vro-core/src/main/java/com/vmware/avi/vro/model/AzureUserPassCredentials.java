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
 * AzureUserPassCredentials
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AzureUserPassCredentials")
@VsoFinder(name = Constants.FINDER_VRO_AZUREUSERPASSCREDENTIALS, idAccessor = "getObjectID()")
@Service
public class AzureUserPassCredentials extends AviRestResource  {
  @JsonProperty("password")
  private String password = null;

  @JsonProperty("tenant_name")
  private String tenantName = null;

  @JsonProperty("username")
  private String username = null;

  
  /**
   * Password for Azure subscription. Required only if username is provided. Field introduced in 17.2.1.
   * @return password
  **/
  @ApiModelProperty(value = "Password for Azure subscription. Required only if username is provided. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * Tenant or the active directory associated with the subscription. Required for user name password authentication. Field introduced in 17.2.1.
   * @return tenantName
  **/
  @ApiModelProperty(value = "Tenant or the active directory associated with the subscription. Required for user name password authentication. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getTenantName() {
    return tenantName;
  }
    
  @VsoMethod
  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  
  /**
   * Username for Azure subscription. Required only for username password based authentication. Field introduced in 17.2.1.
   * @return username
  **/
  @ApiModelProperty(value = "Username for Azure subscription. Required only for username password based authentication. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getUsername() {
    return username;
  }
    
  @VsoMethod
  public void setUsername(String username) {
    this.username = username;
  }

  
  public String getObjectID() {
		return "AzureUserPassCredentials";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureUserPassCredentials azureUserPassCredentials = (AzureUserPassCredentials) o;
    return Objects.equals(this.password, azureUserPassCredentials.password) &&
        Objects.equals(this.tenantName, azureUserPassCredentials.tenantName) &&
        Objects.equals(this.username, azureUserPassCredentials.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, tenantName, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureUserPassCredentials {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
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

