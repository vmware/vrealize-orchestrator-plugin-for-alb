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
 * The CentralLicenseRefreshDetails is a POJO class extends AviRestResource that used for creating
 * CentralLicenseRefreshDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CentralLicenseRefreshDetails")
@VsoFinder(name = Constants.FINDER_VRO_CENTRALLICENSEREFRESHDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CentralLicenseRefreshDetails extends AviRestResource {
    @JsonProperty("message")
    @JsonInclude(Include.NON_NULL)
    private String message = null;

    @JsonProperty("service_units")
    @JsonInclude(Include.NON_NULL)
    private Float serviceUnits = null;

    @JsonProperty("tenant_uuid")
    @JsonInclude(Include.NON_NULL)
    private String tenantUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Message.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return message
   */
  @VsoMethod
  public String getMessage() {
    return message;
  }

  /**
   * This is the setter method to the attribute.
   * Message.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param message set the message.
   */
  @VsoMethod
  public void setMessage(String  message) {
    this.message = message;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service units.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceUnits
   */
  @VsoMethod
  public Float getServiceUnits() {
    return serviceUnits;
  }

  /**
   * This is the setter method to the attribute.
   * Service units.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceUnits set the serviceUnits.
   */
  @VsoMethod
  public void setServiceUnits(Float  serviceUnits) {
    this.serviceUnits = serviceUnits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant uuid.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantUuid
   */
  @VsoMethod
  public String getTenantUuid() {
    return tenantUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant uuid.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantUuid set the tenantUuid.
   */
  @VsoMethod
  public void setTenantUuid(String  tenantUuid) {
    this.tenantUuid = tenantUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CentralLicenseRefreshDetails objCentralLicenseRefreshDetails = (CentralLicenseRefreshDetails) o;
  return   Objects.equals(this.message, objCentralLicenseRefreshDetails.message)&&
  Objects.equals(this.serviceUnits, objCentralLicenseRefreshDetails.serviceUnits)&&
  Objects.equals(this.tenantUuid, objCentralLicenseRefreshDetails.tenantUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CentralLicenseRefreshDetails {\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    serviceUnits: ").append(toIndentedString(serviceUnits)).append("\n");
        sb.append("    tenantUuid: ").append(toIndentedString(tenantUuid)).append("\n");
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

