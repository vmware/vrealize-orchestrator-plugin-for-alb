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
 * The LicenseTierSwitchDetiails is a POJO class extends AviRestResource that used for creating
 * LicenseTierSwitchDetiails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LicenseTierSwitchDetiails")
@VsoFinder(name = Constants.FINDER_VRO_LICENSETIERSWITCHDETIAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LicenseTierSwitchDetiails extends AviRestResource {
    @JsonProperty("destination_tier")
    @JsonInclude(Include.NON_NULL)
    private String destinationTier = null;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason = null;

    @JsonProperty("source_tier")
    @JsonInclude(Include.NON_NULL)
    private String sourceTier = null;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property destination_tier of obj type licensetierswitchdetiails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return destinationTier
   */
  @VsoMethod
  public String getDestinationTier() {
    return destinationTier;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property destination_tier of obj type licensetierswitchdetiails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param destinationTier set the destinationTier.
   */
  @VsoMethod
  public void setDestinationTier(String  destinationTier) {
    this.destinationTier = destinationTier;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property reason of obj type licensetierswitchdetiails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property reason of obj type licensetierswitchdetiails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property source_tier of obj type licensetierswitchdetiails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sourceTier
   */
  @VsoMethod
  public String getSourceTier() {
    return sourceTier;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property source_tier of obj type licensetierswitchdetiails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sourceTier set the sourceTier.
   */
  @VsoMethod
  public void setSourceTier(String  sourceTier) {
    this.sourceTier = sourceTier;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property status of obj type licensetierswitchdetiails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property status of obj type licensetierswitchdetiails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LicenseTierSwitchDetiails objLicenseTierSwitchDetiails = (LicenseTierSwitchDetiails) o;
  return   Objects.equals(this.sourceTier, objLicenseTierSwitchDetiails.sourceTier)&&
  Objects.equals(this.destinationTier, objLicenseTierSwitchDetiails.destinationTier)&&
  Objects.equals(this.status, objLicenseTierSwitchDetiails.status)&&
  Objects.equals(this.reason, objLicenseTierSwitchDetiails.reason);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LicenseTierSwitchDetiails {\n");
      sb.append("    destinationTier: ").append(toIndentedString(destinationTier)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    sourceTier: ").append(toIndentedString(sourceTier)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

