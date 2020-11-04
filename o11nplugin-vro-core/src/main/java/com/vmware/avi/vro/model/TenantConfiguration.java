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
 * The TenantConfiguration is a POJO class extends AviRestResource that used for creating
 * TenantConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TenantConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_TENANTCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TenantConfiguration extends AviRestResource {
    @JsonProperty("se_in_provider_context")
    @JsonInclude(Include.NON_NULL)
    private Boolean seInProviderContext = true;

    @JsonProperty("tenant_access_to_provider_se")
    @JsonInclude(Include.NON_NULL)
    private Boolean tenantAccessToProviderSe = true;

    @JsonProperty("tenant_vrf")
    @JsonInclude(Include.NON_NULL)
    private Boolean tenantVrf = false;



  /**
   * This is the getter method this will return the attribute value.
   * Controls the ownership of serviceengines.
   * Service engines can either be exclusively owned by each tenant or owned by the administrator and shared by all tenants.
   * When serviceengines are owned by the administrator, each tenant can have either read access or no access to their service engines.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return seInProviderContext
   */
  @VsoMethod
  public Boolean getSeInProviderContext() {
    return seInProviderContext;
  }

  /**
   * This is the setter method to the attribute.
   * Controls the ownership of serviceengines.
   * Service engines can either be exclusively owned by each tenant or owned by the administrator and shared by all tenants.
   * When serviceengines are owned by the administrator, each tenant can have either read access or no access to their service engines.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param seInProviderContext set the seInProviderContext.
   */
  @VsoMethod
  public void setSeInProviderContext(Boolean  seInProviderContext) {
    this.seInProviderContext = seInProviderContext;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property tenant_access_to_provider_se of obj type tenantconfiguration field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return tenantAccessToProviderSe
   */
  @VsoMethod
  public Boolean getTenantAccessToProviderSe() {
    return tenantAccessToProviderSe;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property tenant_access_to_provider_se of obj type tenantconfiguration field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param tenantAccessToProviderSe set the tenantAccessToProviderSe.
   */
  @VsoMethod
  public void setTenantAccessToProviderSe(Boolean  tenantAccessToProviderSe) {
    this.tenantAccessToProviderSe = tenantAccessToProviderSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * When 'per tenant ip domain' is selected, each tenant gets its own routing domain that is not shared with any other tenant.
   * When 'share ip domain across all tenants' is selected, all tenants share the same routing domain.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return tenantVrf
   */
  @VsoMethod
  public Boolean getTenantVrf() {
    return tenantVrf;
  }

  /**
   * This is the setter method to the attribute.
   * When 'per tenant ip domain' is selected, each tenant gets its own routing domain that is not shared with any other tenant.
   * When 'share ip domain across all tenants' is selected, all tenants share the same routing domain.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param tenantVrf set the tenantVrf.
   */
  @VsoMethod
  public void setTenantVrf(Boolean  tenantVrf) {
    this.tenantVrf = tenantVrf;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TenantConfiguration objTenantConfiguration = (TenantConfiguration) o;
  return   Objects.equals(this.tenantVrf, objTenantConfiguration.tenantVrf)&&
  Objects.equals(this.seInProviderContext, objTenantConfiguration.seInProviderContext)&&
  Objects.equals(this.tenantAccessToProviderSe, objTenantConfiguration.tenantAccessToProviderSe);
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

