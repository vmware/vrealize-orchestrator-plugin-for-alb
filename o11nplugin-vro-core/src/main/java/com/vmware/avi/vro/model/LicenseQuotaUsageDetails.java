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
 * The LicenseQuotaUsageDetails is a POJO class extends AviRestResource that used for creating
 * LicenseQuotaUsageDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LicenseQuotaUsageDetails")
@VsoFinder(name = Constants.FINDER_VRO_LICENSEQUOTAUSAGEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LicenseQuotaUsageDetails extends AviRestResource {
    @JsonProperty("tenant_quota_usage_infos")
    @JsonInclude(Include.NON_NULL)
    private List<TenantQuotaUsageInfo> tenantQuotaUsageInfos;



  /**
   * This is the getter method this will return the attribute value.
   * License quota usage details for tenants.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantQuotaUsageInfos
   */
  @VsoMethod
  public List<TenantQuotaUsageInfo> getTenantQuotaUsageInfos() {
    return tenantQuotaUsageInfos;
  }

  /**
   * This is the setter method. this will set the tenantQuotaUsageInfos
   * License quota usage details for tenants.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantQuotaUsageInfos
   */
  @VsoMethod
  public void setTenantQuotaUsageInfos(List<TenantQuotaUsageInfo>  tenantQuotaUsageInfos) {
    this.tenantQuotaUsageInfos = tenantQuotaUsageInfos;
  }

  /**
   * This is the setter method this will set the tenantQuotaUsageInfos
   * License quota usage details for tenants.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantQuotaUsageInfos
   */
  @VsoMethod
  public LicenseQuotaUsageDetails addTenantQuotaUsageInfosItem(TenantQuotaUsageInfo tenantQuotaUsageInfosItem) {
    if (this.tenantQuotaUsageInfos == null) {
      this.tenantQuotaUsageInfos = new ArrayList<TenantQuotaUsageInfo>();
    }
    this.tenantQuotaUsageInfos.add(tenantQuotaUsageInfosItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LicenseQuotaUsageDetails objLicenseQuotaUsageDetails = (LicenseQuotaUsageDetails) o;
  return   Objects.equals(this.tenantQuotaUsageInfos, objLicenseQuotaUsageDetails.tenantQuotaUsageInfos);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LicenseQuotaUsageDetails {\n");
      sb.append("    tenantQuotaUsageInfos: ").append(toIndentedString(tenantQuotaUsageInfos)).append("\n");
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

