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
 * The LicenseDetails is a POJO class extends AviRestResource that used for creating
 * LicenseDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LicenseDetails")
@VsoFinder(name = Constants.FINDER_VRO_LICENSEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LicenseDetails extends AviRestResource {
  @JsonProperty("backend_servers")
  @JsonInclude(Include.NON_NULL)
  private Integer backendServers = null;

  @JsonProperty("expiry_at")
  @JsonInclude(Include.NON_NULL)
  private String expiryAt = null;

  @JsonProperty("license_id")
  @JsonInclude(Include.NON_NULL)
  private String licenseId = null;

  @JsonProperty("license_type")
  @JsonInclude(Include.NON_NULL)
  private String licenseType = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property backend_servers of obj type licensedetails field type str  type integer.
   * @return backendServers
   */
  @VsoMethod
  public Integer getBackendServers() {
    return backendServers;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property backend_servers of obj type licensedetails field type str  type integer.
   * @param backendServers set the backendServers.
   */
  @VsoMethod
  public void setBackendServers(Integer  backendServers) {
    this.backendServers = backendServers;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property expiry_at of obj type licensedetails field type str  type string.
   * @return expiryAt
   */
  @VsoMethod
  public String getExpiryAt() {
    return expiryAt;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property expiry_at of obj type licensedetails field type str  type string.
   * @param expiryAt set the expiryAt.
   */
  @VsoMethod
  public void setExpiryAt(String  expiryAt) {
    this.expiryAt = expiryAt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property license_id of obj type licensedetails field type str  type string.
   * @return licenseId
   */
  @VsoMethod
  public String getLicenseId() {
    return licenseId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property license_id of obj type licensedetails field type str  type string.
   * @param licenseId set the licenseId.
   */
  @VsoMethod
  public void setLicenseId(String  licenseId) {
    this.licenseId = licenseId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property license_type of obj type licensedetails field type str  type string.
   * @return licenseType
   */
  @VsoMethod
  public String getLicenseType() {
    return licenseType;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property license_type of obj type licensedetails field type str  type string.
   * @param licenseType set the licenseType.
   */
  @VsoMethod
  public void setLicenseType(String  licenseType) {
    this.licenseType = licenseType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LicenseDetails objLicenseDetails = (LicenseDetails) o;
  return   Objects.equals(this.licenseType, objLicenseDetails.licenseType)&&
  Objects.equals(this.licenseId, objLicenseDetails.licenseId)&&
  Objects.equals(this.expiryAt, objLicenseDetails.expiryAt)&&
  Objects.equals(this.name, objLicenseDetails.name)&&
  Objects.equals(this.backendServers, objLicenseDetails.backendServers);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LicenseDetails {\n");
      sb.append("    backendServers: ").append(toIndentedString(backendServers)).append("\n");
        sb.append("    expiryAt: ").append(toIndentedString(expiryAt)).append("\n");
        sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
        sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

