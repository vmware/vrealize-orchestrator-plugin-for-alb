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
 * The PulseServicesTenantStatus is a POJO class extends AviRestResource that used for creating
 * PulseServicesTenantStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PulseServicesTenantStatus")
@VsoFinder(name = Constants.FINDER_VRO_PULSESERVICESTENANTSTATUS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PulseServicesTenantStatus extends AviRestResource {
    @JsonProperty("iprep_synced_at")
    @JsonInclude(Include.NON_NULL)
    private String iprepSyncedAt;

    @JsonProperty("last_connected_at")
    @JsonInclude(Include.NON_NULL)
    private String lastConnectedAt;

    @JsonProperty("last_disconnected_at")
    @JsonInclude(Include.NON_NULL)
    private String lastDisconnectedAt;

    @JsonProperty("last_registered_at")
    @JsonInclude(Include.NON_NULL)
    private String lastRegisteredAt;

    @JsonProperty("last_token_refreshed_at")
    @JsonInclude(Include.NON_NULL)
    private String lastTokenRefreshedAt;

    @JsonProperty("license_refreshed_at")
    @JsonInclude(Include.NON_NULL)
    private String licenseRefreshedAt;



  /**
   * This is the getter method this will return the attribute value.
   * Iprep sync timestamp.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return iprepSyncedAt
   */
  @VsoMethod
  public String getIprepSyncedAt() {
    return iprepSyncedAt;
  }

  /**
   * This is the setter method to the attribute.
   * Iprep sync timestamp.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param iprepSyncedAt set the iprepSyncedAt.
   */
  @VsoMethod
  public void setIprepSyncedAt(String  iprepSyncedAt) {
    this.iprepSyncedAt = iprepSyncedAt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp for last connection established.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastConnectedAt
   */
  @VsoMethod
  public String getLastConnectedAt() {
    return lastConnectedAt;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp for last connection established.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastConnectedAt set the lastConnectedAt.
   */
  @VsoMethod
  public void setLastConnectedAt(String  lastConnectedAt) {
    this.lastConnectedAt = lastConnectedAt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp for last connection broken at.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastDisconnectedAt
   */
  @VsoMethod
  public String getLastDisconnectedAt() {
    return lastDisconnectedAt;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp for last connection broken at.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastDisconnectedAt set the lastDisconnectedAt.
   */
  @VsoMethod
  public void setLastDisconnectedAt(String  lastDisconnectedAt) {
    this.lastDisconnectedAt = lastDisconnectedAt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp for registration.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastRegisteredAt
   */
  @VsoMethod
  public String getLastRegisteredAt() {
    return lastRegisteredAt;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp for registration.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastRegisteredAt set the lastRegisteredAt.
   */
  @VsoMethod
  public void setLastRegisteredAt(String  lastRegisteredAt) {
    this.lastRegisteredAt = lastRegisteredAt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp for token refresh.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastTokenRefreshedAt
   */
  @VsoMethod
  public String getLastTokenRefreshedAt() {
    return lastTokenRefreshedAt;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp for token refresh.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastTokenRefreshedAt set the lastTokenRefreshedAt.
   */
  @VsoMethod
  public void setLastTokenRefreshedAt(String  lastTokenRefreshedAt) {
    this.lastTokenRefreshedAt = lastTokenRefreshedAt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp for license refresh.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseRefreshedAt
   */
  @VsoMethod
  public String getLicenseRefreshedAt() {
    return licenseRefreshedAt;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp for license refresh.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param licenseRefreshedAt set the licenseRefreshedAt.
   */
  @VsoMethod
  public void setLicenseRefreshedAt(String  licenseRefreshedAt) {
    this.licenseRefreshedAt = licenseRefreshedAt;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PulseServicesTenantStatus objPulseServicesTenantStatus = (PulseServicesTenantStatus) o;
  return   Objects.equals(this.lastConnectedAt, objPulseServicesTenantStatus.lastConnectedAt)&&
  Objects.equals(this.lastDisconnectedAt, objPulseServicesTenantStatus.lastDisconnectedAt)&&
  Objects.equals(this.lastRegisteredAt, objPulseServicesTenantStatus.lastRegisteredAt)&&
  Objects.equals(this.lastTokenRefreshedAt, objPulseServicesTenantStatus.lastTokenRefreshedAt)&&
  Objects.equals(this.licenseRefreshedAt, objPulseServicesTenantStatus.licenseRefreshedAt)&&
  Objects.equals(this.iprepSyncedAt, objPulseServicesTenantStatus.iprepSyncedAt);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PulseServicesTenantStatus {\n");
      sb.append("    iprepSyncedAt: ").append(toIndentedString(iprepSyncedAt)).append("\n");
        sb.append("    lastConnectedAt: ").append(toIndentedString(lastConnectedAt)).append("\n");
        sb.append("    lastDisconnectedAt: ").append(toIndentedString(lastDisconnectedAt)).append("\n");
        sb.append("    lastRegisteredAt: ").append(toIndentedString(lastRegisteredAt)).append("\n");
        sb.append("    lastTokenRefreshedAt: ").append(toIndentedString(lastTokenRefreshedAt)).append("\n");
        sb.append("    licenseRefreshedAt: ").append(toIndentedString(licenseRefreshedAt)).append("\n");
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

