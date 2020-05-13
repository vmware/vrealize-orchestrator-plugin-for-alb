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
 * TenantConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "TenantConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_TENANTCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class TenantConfiguration extends AviRestResource  {
  @JsonProperty("se_in_provider_context")
  private Boolean seInProviderContext = true;

  @JsonProperty("tenant_access_to_provider_se")
  private Boolean tenantAccessToProviderSe = true;

  @JsonProperty("tenant_vrf")
  private Boolean tenantVrf = null;

  
  /**
   * Controls the ownership of ServiceEngines. Service Engines can either be exclusively owned by each tenant or owned by the administrator and shared by all tenants. When ServiceEngines are owned by the administrator, each tenant can have either read access or no access to their Service Engines.
   * @return seInProviderContext
  **/
  @ApiModelProperty(value = "Controls the ownership of ServiceEngines. Service Engines can either be exclusively owned by each tenant or owned by the administrator and shared by all tenants. When ServiceEngines are owned by the administrator, each tenant can have either read access or no access to their Service Engines.")


 
  @VsoMethod  
  public Boolean isSeInProviderContext() {
    return seInProviderContext;
  }
    
  @VsoMethod
  public void setSeInProviderContext(Boolean seInProviderContext) {
    this.seInProviderContext = seInProviderContext;
  }

  
  /**
   * Placeholder for description of property tenant_access_to_provider_se of obj type TenantConfiguration field type str  type boolean
   * @return tenantAccessToProviderSe
  **/
  @ApiModelProperty(value = "Placeholder for description of property tenant_access_to_provider_se of obj type TenantConfiguration field type str  type boolean")


 
  @VsoMethod  
  public Boolean isTenantAccessToProviderSe() {
    return tenantAccessToProviderSe;
  }
    
  @VsoMethod
  public void setTenantAccessToProviderSe(Boolean tenantAccessToProviderSe) {
    this.tenantAccessToProviderSe = tenantAccessToProviderSe;
  }

  
  /**
   * When 'Per Tenant IP Domain' is selected, each tenant gets its own routing domain that is not shared with any other tenant. When 'Share IP Domain across all tenants' is selected, all tenants share the same routing domain.
   * @return tenantVrf
  **/
  @ApiModelProperty(value = "When 'Per Tenant IP Domain' is selected, each tenant gets its own routing domain that is not shared with any other tenant. When 'Share IP Domain across all tenants' is selected, all tenants share the same routing domain.")


 
  @VsoMethod  
  public Boolean isTenantVrf() {
    return tenantVrf;
  }
    
  @VsoMethod
  public void setTenantVrf(Boolean tenantVrf) {
    this.tenantVrf = tenantVrf;
  }

  
  public String getObjectID() {
		return "TenantConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantConfiguration tenantConfiguration = (TenantConfiguration) o;
    return Objects.equals(this.seInProviderContext, tenantConfiguration.seInProviderContext) &&
        Objects.equals(this.tenantAccessToProviderSe, tenantConfiguration.tenantAccessToProviderSe) &&
        Objects.equals(this.tenantVrf, tenantConfiguration.tenantVrf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seInProviderContext, tenantAccessToProviderSe, tenantVrf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantConfiguration {\n");
    
    sb.append("    seInProviderContext: ").append(toIndentedString(seInProviderContext)).append("\n");
    sb.append("    tenantAccessToProviderSe: ").append(toIndentedString(tenantAccessToProviderSe)).append("\n");
    sb.append("    tenantVrf: ").append(toIndentedString(tenantVrf)).append("\n");
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

