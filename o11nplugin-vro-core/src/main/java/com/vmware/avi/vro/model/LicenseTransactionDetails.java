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
 * The LicenseTransactionDetails is a POJO class extends AviRestResource that used for creating
 * LicenseTransactionDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LicenseTransactionDetails")
@VsoFinder(name = Constants.FINDER_VRO_LICENSETRANSACTIONDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LicenseTransactionDetails extends AviRestResource {
    @JsonProperty("cookie")
    @JsonInclude(Include.NON_NULL)
    private String cookie = null;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description = null;

    @JsonProperty("id")
    @JsonInclude(Include.NON_NULL)
    private String id = null;

    @JsonProperty("licensed_service_cores")
    @JsonInclude(Include.NON_NULL)
    private Float licensedServiceCores = null;

    @JsonProperty("operation")
    @JsonInclude(Include.NON_NULL)
    private String operation = null;

    @JsonProperty("overdraft")
    @JsonInclude(Include.NON_NULL)
    private Boolean overdraft = null;

    @JsonProperty("service_cores")
    @JsonInclude(Include.NON_NULL)
    private Float serviceCores = null;

    @JsonProperty("tenant_uuid")
    @JsonInclude(Include.NON_NULL)
    private String tenantUuid = null;

    @JsonProperty("tier")
    @JsonInclude(Include.NON_NULL)
    private String tier = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cookie of obj type licensetransactiondetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cookie
   */
  @VsoMethod
  public String getCookie() {
    return cookie;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cookie of obj type licensetransactiondetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cookie set the cookie.
   */
  @VsoMethod
  public void setCookie(String  cookie) {
    this.cookie = cookie;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User defined description for the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * User defined description for the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property id of obj type licensetransactiondetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return id
   */
  @VsoMethod
  public String getId() {
    return id;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property id of obj type licensetransactiondetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param id set the id.
   */
  @VsoMethod
  public void setId(String  id) {
    this.id = id;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property licensed_service_cores of obj type licensetransactiondetails field type str  type float.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licensedServiceCores
   */
  @VsoMethod
  public Float getLicensedServiceCores() {
    return licensedServiceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property licensed_service_cores of obj type licensetransactiondetails field type str  type float.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param licensedServiceCores set the licensedServiceCores.
   */
  @VsoMethod
  public void setLicensedServiceCores(Float  licensedServiceCores) {
    this.licensedServiceCores = licensedServiceCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property operation of obj type licensetransactiondetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return operation
   */
  @VsoMethod
  public String getOperation() {
    return operation;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property operation of obj type licensetransactiondetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param operation set the operation.
   */
  @VsoMethod
  public void setOperation(String  operation) {
    this.operation = operation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property overdraft of obj type licensetransactiondetails field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return overdraft
   */
  @VsoMethod
  public Boolean getOverdraft() {
    return overdraft;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property overdraft of obj type licensetransactiondetails field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param overdraft set the overdraft.
   */
  @VsoMethod
  public void setOverdraft(Boolean  overdraft) {
    this.overdraft = overdraft;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property service_cores of obj type licensetransactiondetails field type str  type float.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceCores
   */
  @VsoMethod
  public Float getServiceCores() {
    return serviceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property service_cores of obj type licensetransactiondetails field type str  type float.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceCores set the serviceCores.
   */
  @VsoMethod
  public void setServiceCores(Float  serviceCores) {
    this.serviceCores = serviceCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantUuid
   */
  @VsoMethod
  public String getTenantUuid() {
    return tenantUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantUuid set the tenantUuid.
   */
  @VsoMethod
  public void setTenantUuid(String  tenantUuid) {
    this.tenantUuid = tenantUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property tier of obj type licensetransactiondetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tier
   */
  @VsoMethod
  public String getTier() {
    return tier;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property tier of obj type licensetransactiondetails field type str  type string.
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
  LicenseTransactionDetails objLicenseTransactionDetails = (LicenseTransactionDetails) o;
  return   Objects.equals(this.id, objLicenseTransactionDetails.id)&&
  Objects.equals(this.cookie, objLicenseTransactionDetails.cookie)&&
  Objects.equals(this.tenantUuid, objLicenseTransactionDetails.tenantUuid)&&
  Objects.equals(this.tier, objLicenseTransactionDetails.tier)&&
  Objects.equals(this.operation, objLicenseTransactionDetails.operation)&&
  Objects.equals(this.serviceCores, objLicenseTransactionDetails.serviceCores)&&
  Objects.equals(this.licensedServiceCores, objLicenseTransactionDetails.licensedServiceCores)&&
  Objects.equals(this.overdraft, objLicenseTransactionDetails.overdraft)&&
  Objects.equals(this.description, objLicenseTransactionDetails.description);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LicenseTransactionDetails {\n");
      sb.append("    cookie: ").append(toIndentedString(cookie)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    licensedServiceCores: ").append(toIndentedString(licensedServiceCores)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
        sb.append("    serviceCores: ").append(toIndentedString(serviceCores)).append("\n");
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

