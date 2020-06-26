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
 * The SeReconcileDetails is a POJO class extends AviRestResource that used for creating
 * SeReconcileDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeReconcileDetails")
@VsoFinder(name = Constants.FINDER_VRO_SERECONCILEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeReconcileDetails extends AviRestResource {
  @JsonProperty("new_service_cores")
  @JsonInclude(Include.NON_NULL)
  private Float newServiceCores = null;

  @JsonProperty("old_service_cores")
  @JsonInclude(Include.NON_NULL)
  private Float oldServiceCores = null;

  @JsonProperty("se_uuid")
  @JsonInclude(Include.NON_NULL)
  private String seUuid = null;

  @JsonProperty("tenant_uuid")
  @JsonInclude(Include.NON_NULL)
  private String tenantUuid = null;

  @JsonProperty("tier")
  @JsonInclude(Include.NON_NULL)
  private String tier = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property new_service_cores of obj type sereconciledetails field type str  type float.
   * @return newServiceCores
   */
  @VsoMethod
  public Float getNewServiceCores() {
    return newServiceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property new_service_cores of obj type sereconciledetails field type str  type float.
   * @param newServiceCores set the newServiceCores.
   */
  @VsoMethod
  public void setNewServiceCores(Float  newServiceCores) {
    this.newServiceCores = newServiceCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property old_service_cores of obj type sereconciledetails field type str  type float.
   * @return oldServiceCores
   */
  @VsoMethod
  public Float getOldServiceCores() {
    return oldServiceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property old_service_cores of obj type sereconciledetails field type str  type float.
   * @param oldServiceCores set the oldServiceCores.
   */
  @VsoMethod
  public void setOldServiceCores(Float  oldServiceCores) {
    this.oldServiceCores = oldServiceCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of se.
   * @return seUuid
   */
  @VsoMethod
  public String getSeUuid() {
    return seUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of se.
   * @param seUuid set the seUuid.
   */
  @VsoMethod
  public void setSeUuid(String  seUuid) {
    this.seUuid = seUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of tenant.
   * @return tenantUuid
   */
  @VsoMethod
  public String getTenantUuid() {
    return tenantUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of tenant.
   * @param tenantUuid set the tenantUuid.
   */
  @VsoMethod
  public void setTenantUuid(String  tenantUuid) {
    this.tenantUuid = tenantUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property tier of obj type sereconciledetails field type str  type string.
   * @return tier
   */
  @VsoMethod
  public String getTier() {
    return tier;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property tier of obj type sereconciledetails field type str  type string.
   * @param tier set the tier.
   */
  @VsoMethod
  public void setTier(String  tier) {
    this.tier = tier;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeReconcileDetails objSeReconcileDetails = (SeReconcileDetails) o;
  return   Objects.equals(this.tier, objSeReconcileDetails.tier)&&
  Objects.equals(this.newServiceCores, objSeReconcileDetails.newServiceCores)&&
  Objects.equals(this.oldServiceCores, objSeReconcileDetails.oldServiceCores)&&
  Objects.equals(this.seUuid, objSeReconcileDetails.seUuid)&&
  Objects.equals(this.tenantUuid, objSeReconcileDetails.tenantUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeReconcileDetails {\n");
      sb.append("    newServiceCores: ").append(toIndentedString(newServiceCores)).append("\n");
        sb.append("    oldServiceCores: ").append(toIndentedString(oldServiceCores)).append("\n");
        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
        sb.append("    tenantUuid: ").append(toIndentedString(tenantUuid)).append("\n");
        sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
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
