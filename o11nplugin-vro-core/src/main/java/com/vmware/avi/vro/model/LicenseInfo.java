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
 * The LicenseInfo is a POJO class extends AviRestResource that used for creating
 * LicenseInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LicenseInfo")
@VsoFinder(name = Constants.FINDER_VRO_LICENSEINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LicenseInfo extends AviRestResource {
  @JsonProperty("last_updated")
  @JsonInclude(Include.NON_NULL)
  private Integer lastUpdated = null;

  @JsonProperty("service_cores")
  @JsonInclude(Include.NON_NULL)
  private Float serviceCores = null;

  @JsonProperty("tenant_uuid")
  @JsonInclude(Include.NON_NULL)
  private String tenantUuid = null;

  @JsonProperty("tier")
  @JsonInclude(Include.NON_NULL)
  private String tier = null;

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Last updated time.
   * Field introduced in 20.1.1.
   * @return lastUpdated
   */
  @VsoMethod
  public Integer getLastUpdated() {
    return lastUpdated;
  }

  /**
   * This is the setter method to the attribute.
   * Last updated time.
   * Field introduced in 20.1.1.
   * @param lastUpdated set the lastUpdated.
   */
  @VsoMethod
  public void setLastUpdated(Integer  lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Quantity of service cores.
   * Field introduced in 20.1.1.
   * @return serviceCores
   */
  @VsoMethod
  public Float getServiceCores() {
    return serviceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Quantity of service cores.
   * Field introduced in 20.1.1.
   * @param serviceCores set the serviceCores.
   */
  @VsoMethod
  public void setServiceCores(Float  serviceCores) {
    this.serviceCores = serviceCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies the license tier.
   * Field introduced in 20.1.1.
   * @return tenantUuid
   */
  @VsoMethod
  public String getTenantUuid() {
    return tenantUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the license tier.
   * Field introduced in 20.1.1.
   * @param tenantUuid set the tenantUuid.
   */
  @VsoMethod
  public void setTenantUuid(String  tenantUuid) {
    this.tenantUuid = tenantUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies the license tier.
   * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC.
   * Field introduced in 20.1.1.
   * @return tier
   */
  @VsoMethod
  public String getTier() {
    return tier;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the license tier.
   * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC.
   * Field introduced in 20.1.1.
   * @param tier set the tier.
   */
  @VsoMethod
  public void setTier(String  tier) {
    this.tier = tier;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Identifier(license_id, se_uuid, cookie).
   * Field introduced in 20.1.1.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Identifier(license_id, se_uuid, cookie).
   * Field introduced in 20.1.1.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LicenseInfo objLicenseInfo = (LicenseInfo) o;
  return   Objects.equals(this.tier, objLicenseInfo.tier)&&
  Objects.equals(this.serviceCores, objLicenseInfo.serviceCores)&&
  Objects.equals(this.lastUpdated, objLicenseInfo.lastUpdated)&&
  Objects.equals(this.uuid, objLicenseInfo.uuid)&&
  Objects.equals(this.tenantUuid, objLicenseInfo.tenantUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LicenseInfo {\n");
      sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("    serviceCores: ").append(toIndentedString(serviceCores)).append("\n");
        sb.append("    tenantUuid: ").append(toIndentedString(tenantUuid)).append("\n");
        sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

