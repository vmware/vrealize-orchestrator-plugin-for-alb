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
 * The ControllerLicenseReconcileDetails is a POJO class extends AviRestResource that used for creating
 * ControllerLicenseReconcileDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerLicenseReconcileDetails")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERLICENSERECONCILEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerLicenseReconcileDetails extends AviRestResource {
    @JsonProperty("new_available_service_cores")
    @JsonInclude(Include.NON_NULL)
    private Float newAvailableServiceCores;

    @JsonProperty("new_consumed_service_cores")
    @JsonInclude(Include.NON_NULL)
    private Float newConsumedServiceCores;

    @JsonProperty("new_escrow_service_cores")
    @JsonInclude(Include.NON_NULL)
    private Float newEscrowServiceCores;

    @JsonProperty("new_remaining_service_cores")
    @JsonInclude(Include.NON_NULL)
    private Float newRemainingServiceCores;

    @JsonProperty("old_available_service_cores")
    @JsonInclude(Include.NON_NULL)
    private Float oldAvailableServiceCores;

    @JsonProperty("old_consumed_service_cores")
    @JsonInclude(Include.NON_NULL)
    private Float oldConsumedServiceCores;

    @JsonProperty("old_escrow_service_cores")
    @JsonInclude(Include.NON_NULL)
    private Float oldEscrowServiceCores;

    @JsonProperty("old_remaining_service_cores")
    @JsonInclude(Include.NON_NULL)
    private Float oldRemainingServiceCores;

    @JsonProperty("tenant_uuid")
    @JsonInclude(Include.NON_NULL)
    private String tenantUuid;

    @JsonProperty("tier")
    @JsonInclude(Include.NON_NULL)
    private String tier;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return newAvailableServiceCores
   */
  @VsoMethod
  public Float getNewAvailableServiceCores() {
    return newAvailableServiceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param newAvailableServiceCores set the newAvailableServiceCores.
   */
  @VsoMethod
  public void setNewAvailableServiceCores(Float  newAvailableServiceCores) {
    this.newAvailableServiceCores = newAvailableServiceCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return newConsumedServiceCores
   */
  @VsoMethod
  public Float getNewConsumedServiceCores() {
    return newConsumedServiceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param newConsumedServiceCores set the newConsumedServiceCores.
   */
  @VsoMethod
  public void setNewConsumedServiceCores(Float  newConsumedServiceCores) {
    this.newConsumedServiceCores = newConsumedServiceCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return newEscrowServiceCores
   */
  @VsoMethod
  public Float getNewEscrowServiceCores() {
    return newEscrowServiceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param newEscrowServiceCores set the newEscrowServiceCores.
   */
  @VsoMethod
  public void setNewEscrowServiceCores(Float  newEscrowServiceCores) {
    this.newEscrowServiceCores = newEscrowServiceCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return newRemainingServiceCores
   */
  @VsoMethod
  public Float getNewRemainingServiceCores() {
    return newRemainingServiceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param newRemainingServiceCores set the newRemainingServiceCores.
   */
  @VsoMethod
  public void setNewRemainingServiceCores(Float  newRemainingServiceCores) {
    this.newRemainingServiceCores = newRemainingServiceCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oldAvailableServiceCores
   */
  @VsoMethod
  public Float getOldAvailableServiceCores() {
    return oldAvailableServiceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param oldAvailableServiceCores set the oldAvailableServiceCores.
   */
  @VsoMethod
  public void setOldAvailableServiceCores(Float  oldAvailableServiceCores) {
    this.oldAvailableServiceCores = oldAvailableServiceCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oldConsumedServiceCores
   */
  @VsoMethod
  public Float getOldConsumedServiceCores() {
    return oldConsumedServiceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param oldConsumedServiceCores set the oldConsumedServiceCores.
   */
  @VsoMethod
  public void setOldConsumedServiceCores(Float  oldConsumedServiceCores) {
    this.oldConsumedServiceCores = oldConsumedServiceCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oldEscrowServiceCores
   */
  @VsoMethod
  public Float getOldEscrowServiceCores() {
    return oldEscrowServiceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param oldEscrowServiceCores set the oldEscrowServiceCores.
   */
  @VsoMethod
  public void setOldEscrowServiceCores(Float  oldEscrowServiceCores) {
    this.oldEscrowServiceCores = oldEscrowServiceCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oldRemainingServiceCores
   */
  @VsoMethod
  public Float getOldRemainingServiceCores() {
    return oldRemainingServiceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param oldRemainingServiceCores set the oldRemainingServiceCores.
   */
  @VsoMethod
  public void setOldRemainingServiceCores(Float  oldRemainingServiceCores) {
    this.oldRemainingServiceCores = oldRemainingServiceCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantUuid
   */
  @VsoMethod
  public String getTenantUuid() {
    return tenantUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantUuid set the tenantUuid.
   */
  @VsoMethod
  public void setTenantUuid(String  tenantUuid) {
    this.tenantUuid = tenantUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tier
   */
  @VsoMethod
  public String getTier() {
    return tier;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  ControllerLicenseReconcileDetails objControllerLicenseReconcileDetails = (ControllerLicenseReconcileDetails) o;
  return   Objects.equals(this.tenantUuid, objControllerLicenseReconcileDetails.tenantUuid)&&
  Objects.equals(this.tier, objControllerLicenseReconcileDetails.tier)&&
  Objects.equals(this.oldAvailableServiceCores, objControllerLicenseReconcileDetails.oldAvailableServiceCores)&&
  Objects.equals(this.newAvailableServiceCores, objControllerLicenseReconcileDetails.newAvailableServiceCores)&&
  Objects.equals(this.oldConsumedServiceCores, objControllerLicenseReconcileDetails.oldConsumedServiceCores)&&
  Objects.equals(this.newConsumedServiceCores, objControllerLicenseReconcileDetails.newConsumedServiceCores)&&
  Objects.equals(this.oldRemainingServiceCores, objControllerLicenseReconcileDetails.oldRemainingServiceCores)&&
  Objects.equals(this.newRemainingServiceCores, objControllerLicenseReconcileDetails.newRemainingServiceCores)&&
  Objects.equals(this.oldEscrowServiceCores, objControllerLicenseReconcileDetails.oldEscrowServiceCores)&&
  Objects.equals(this.newEscrowServiceCores, objControllerLicenseReconcileDetails.newEscrowServiceCores);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerLicenseReconcileDetails {\n");
      sb.append("    newAvailableServiceCores: ").append(toIndentedString(newAvailableServiceCores)).append("\n");
        sb.append("    newConsumedServiceCores: ").append(toIndentedString(newConsumedServiceCores)).append("\n");
        sb.append("    newEscrowServiceCores: ").append(toIndentedString(newEscrowServiceCores)).append("\n");
        sb.append("    newRemainingServiceCores: ").append(toIndentedString(newRemainingServiceCores)).append("\n");
        sb.append("    oldAvailableServiceCores: ").append(toIndentedString(oldAvailableServiceCores)).append("\n");
        sb.append("    oldConsumedServiceCores: ").append(toIndentedString(oldConsumedServiceCores)).append("\n");
        sb.append("    oldEscrowServiceCores: ").append(toIndentedString(oldEscrowServiceCores)).append("\n");
        sb.append("    oldRemainingServiceCores: ").append(toIndentedString(oldRemainingServiceCores)).append("\n");
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

