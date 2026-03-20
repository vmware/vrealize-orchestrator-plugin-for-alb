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
 * The LicensePolicy is a POJO class extends AviRestResource that used for creating
 * LicensePolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LicensePolicy")
@VsoFinder(name = Constants.FINDER_VRO_LICENSEPOLICY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LicensePolicy extends AviRestResource {
    @JsonProperty("expiration_date")
    @JsonInclude(Include.NON_NULL)
    private String expirationDate;

    @JsonProperty("expiration_pre_warn")
    @JsonInclude(Include.NON_NULL)
    private String expirationPreWarn;

    @JsonProperty("expiration_reason")
    @JsonInclude(Include.NON_NULL)
    private String expirationReason;

    @JsonProperty("grace_period")
    @JsonInclude(Include.NON_NULL)
    private String gracePeriod;

    @JsonProperty("license_warnings")
    @JsonInclude(Include.NON_NULL)
    private List<LicenseWarning> licenseWarnings;



  /**
   * This is the getter method this will return the attribute value.
   * License expiration date.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return expirationDate
   */
  @VsoMethod
  public String getExpirationDate() {
    return expirationDate;
  }

  /**
   * This is the setter method to the attribute.
   * License expiration date.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param expirationDate set the expirationDate.
   */
  @VsoMethod
  public void setExpirationDate(String  expirationDate) {
    this.expirationDate = expirationDate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Expiration pre warning period.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return expirationPreWarn
   */
  @VsoMethod
  public String getExpirationPreWarn() {
    return expirationPreWarn;
  }

  /**
   * This is the setter method to the attribute.
   * Expiration pre warning period.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param expirationPreWarn set the expirationPreWarn.
   */
  @VsoMethod
  public void setExpirationPreWarn(String  expirationPreWarn) {
    this.expirationPreWarn = expirationPreWarn;
  }

  /**
   * This is the getter method this will return the attribute value.
   * License expiration reason.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return expirationReason
   */
  @VsoMethod
  public String getExpirationReason() {
    return expirationReason;
  }

  /**
   * This is the setter method to the attribute.
   * License expiration reason.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param expirationReason set the expirationReason.
   */
  @VsoMethod
  public void setExpirationReason(String  expirationReason) {
    this.expirationReason = expirationReason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * License grace period.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gracePeriod
   */
  @VsoMethod
  public String getGracePeriod() {
    return gracePeriod;
  }

  /**
   * This is the setter method to the attribute.
   * License grace period.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gracePeriod set the gracePeriod.
   */
  @VsoMethod
  public void setGracePeriod(String  gracePeriod) {
    this.gracePeriod = gracePeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * License warnings.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseWarnings
   */
  @VsoMethod
  public List<LicenseWarning> getLicenseWarnings() {
    return licenseWarnings;
  }

  /**
   * This is the setter method. this will set the licenseWarnings
   * License warnings.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseWarnings
   */
  @VsoMethod
  public void setLicenseWarnings(List<LicenseWarning>  licenseWarnings) {
    this.licenseWarnings = licenseWarnings;
  }

  /**
   * This is the setter method this will set the licenseWarnings
   * License warnings.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseWarnings
   */
  @VsoMethod
  public LicensePolicy addLicenseWarningsItem(LicenseWarning licenseWarningsItem) {
    if (this.licenseWarnings == null) {
      this.licenseWarnings = new ArrayList<LicenseWarning>();
    }
    this.licenseWarnings.add(licenseWarningsItem);
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
  LicensePolicy objLicensePolicy = (LicensePolicy) o;
  return   Objects.equals(this.expirationDate, objLicensePolicy.expirationDate)&&
  Objects.equals(this.expirationReason, objLicensePolicy.expirationReason)&&
  Objects.equals(this.gracePeriod, objLicensePolicy.gracePeriod)&&
  Objects.equals(this.expirationPreWarn, objLicensePolicy.expirationPreWarn)&&
  Objects.equals(this.licenseWarnings, objLicensePolicy.licenseWarnings);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LicensePolicy {\n");
      sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
        sb.append("    expirationPreWarn: ").append(toIndentedString(expirationPreWarn)).append("\n");
        sb.append("    expirationReason: ").append(toIndentedString(expirationReason)).append("\n");
        sb.append("    gracePeriod: ").append(toIndentedString(gracePeriod)).append("\n");
        sb.append("    licenseWarnings: ").append(toIndentedString(licenseWarnings)).append("\n");
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

