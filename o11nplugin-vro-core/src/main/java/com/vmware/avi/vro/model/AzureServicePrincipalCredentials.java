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
 * AzureServicePrincipalCredentials
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AzureServicePrincipalCredentials")
@VsoFinder(name = Constants.FINDER_VRO_AZURESERVICEPRINCIPALCREDENTIALS, idAccessor = "getObjectID()")
@Service
public class AzureServicePrincipalCredentials extends AviRestResource  {
  @JsonProperty("application_id")
  private String applicationId = null;

  @JsonProperty("authentication_token")
  private String authenticationToken = null;

  @JsonProperty("tenant_id")
  private String tenantId = null;

  
  /**
   * Application Id created for Avi Controller. Required for application id based authentication only. Field introduced in 17.2.1.
   * @return applicationId
  **/
  @ApiModelProperty(value = "Application Id created for Avi Controller. Required for application id based authentication only. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getApplicationId() {
    return applicationId;
  }
    
  @VsoMethod
  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  
  /**
   * Authentication token created for the Avi Controller application. Required for application id based authentication only. Field introduced in 17.2.1.
   * @return authenticationToken
  **/
  @ApiModelProperty(value = "Authentication token created for the Avi Controller application. Required for application id based authentication only. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getAuthenticationToken() {
    return authenticationToken;
  }
    
  @VsoMethod
  public void setAuthenticationToken(String authenticationToken) {
    this.authenticationToken = authenticationToken;
  }

  
  /**
   * Tenant ID for the subscription. Required for application id based authentication only. Field introduced in 17.2.1.
   * @return tenantId
  **/
  @ApiModelProperty(value = "Tenant ID for the subscription. Required for application id based authentication only. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getTenantId() {
    return tenantId;
  }
    
  @VsoMethod
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  
  public String getObjectID() {
		return "AzureServicePrincipalCredentials";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureServicePrincipalCredentials azureServicePrincipalCredentials = (AzureServicePrincipalCredentials) o;
    return Objects.equals(this.applicationId, azureServicePrincipalCredentials.applicationId) &&
        Objects.equals(this.authenticationToken, azureServicePrincipalCredentials.authenticationToken) &&
        Objects.equals(this.tenantId, azureServicePrincipalCredentials.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, authenticationToken, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureServicePrincipalCredentials {\n");
    
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    authenticationToken: ").append(toIndentedString(authenticationToken)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

