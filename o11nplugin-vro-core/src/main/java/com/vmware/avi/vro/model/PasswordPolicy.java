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
 * The PasswordPolicy is a POJO class extends AviRestResource that used for creating
 * PasswordPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PasswordPolicy")
@VsoFinder(name = Constants.FINDER_VRO_PASSWORDPOLICY, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PasswordPolicy extends AviRestResource {
    @JsonProperty("lockout_evaluation_period")
    @JsonInclude(Include.NON_NULL)
    private Integer lockoutEvaluationPeriod = 900;

    @JsonProperty("lockout_max_auth_failures")
    @JsonInclude(Include.NON_NULL)
    private Integer lockoutMaxAuthFailures = 3;

    @JsonProperty("lockout_period")
    @JsonInclude(Include.NON_NULL)
    private Integer lockoutPeriod = 900;

    @JsonProperty("min_length")
    @JsonInclude(Include.NON_NULL)
    private Integer minLength = 15;

    @JsonProperty("min_lowercase")
    @JsonInclude(Include.NON_NULL)
    private Integer minLowercase = 1;

    @JsonProperty("min_numeric")
    @JsonInclude(Include.NON_NULL)
    private Integer minNumeric = 1;

    @JsonProperty("min_special")
    @JsonInclude(Include.NON_NULL)
    private Integer minSpecial = 1;

    @JsonProperty("min_uppercase")
    @JsonInclude(Include.NON_NULL)
    private Integer minUppercase = 1;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("password_expiration_days")
    @JsonInclude(Include.NON_NULL)
    private Integer passwordExpirationDays = 365;

    @JsonProperty("password_history")
    @JsonInclude(Include.NON_NULL)
    private Integer passwordHistory = 5;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Time window for evaluating failed attempts in seconds.
   * Defaults to 900 seconds.
   * Allowed values are 300-1800.
   * Field introduced in 32.1.1.
   * Unit is sec.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 900.
   * @return lockoutEvaluationPeriod
   */
  @VsoMethod
  public Integer getLockoutEvaluationPeriod() {
    return lockoutEvaluationPeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Time window for evaluating failed attempts in seconds.
   * Defaults to 900 seconds.
   * Allowed values are 300-1800.
   * Field introduced in 32.1.1.
   * Unit is sec.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 900.
   * @param lockoutEvaluationPeriod set the lockoutEvaluationPeriod.
   */
  @VsoMethod
  public void setLockoutEvaluationPeriod(Integer  lockoutEvaluationPeriod) {
    this.lockoutEvaluationPeriod = lockoutEvaluationPeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of failed attempts before account lockout.
   * Defaults to 3.
   * Allowed values are 0-5.
   * Special values are 0- unlimited login attempts allowed.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @return lockoutMaxAuthFailures
   */
  @VsoMethod
  public Integer getLockoutMaxAuthFailures() {
    return lockoutMaxAuthFailures;
  }

  /**
   * This is the setter method to the attribute.
   * Number of failed attempts before account lockout.
   * Defaults to 3.
   * Allowed values are 0-5.
   * Special values are 0- unlimited login attempts allowed.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @param lockoutMaxAuthFailures set the lockoutMaxAuthFailures.
   */
  @VsoMethod
  public void setLockoutMaxAuthFailures(Integer  lockoutMaxAuthFailures) {
    this.lockoutMaxAuthFailures = lockoutMaxAuthFailures;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Account lockout duration in seconds.
   * Defaults to 900 seconds.
   * Allowed values are 600-1800.
   * Field introduced in 32.1.1.
   * Unit is sec.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 900.
   * @return lockoutPeriod
   */
  @VsoMethod
  public Integer getLockoutPeriod() {
    return lockoutPeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Account lockout duration in seconds.
   * Defaults to 900 seconds.
   * Allowed values are 600-1800.
   * Field introduced in 32.1.1.
   * Unit is sec.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 900.
   * @param lockoutPeriod set the lockoutPeriod.
   */
  @VsoMethod
  public void setLockoutPeriod(Integer  lockoutPeriod) {
    this.lockoutPeriod = lockoutPeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum password length.
   * Defaults to 15 characters.
   * Allowed values are 8-64.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 15.
   * @return minLength
   */
  @VsoMethod
  public Integer getMinLength() {
    return minLength;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum password length.
   * Defaults to 15 characters.
   * Allowed values are 8-64.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 15.
   * @param minLength set the minLength.
   */
  @VsoMethod
  public void setMinLength(Integer  minLength) {
    this.minLength = minLength;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum number of lowercase characters required.
   * Allowed values are 0-10.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return minLowercase
   */
  @VsoMethod
  public Integer getMinLowercase() {
    return minLowercase;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum number of lowercase characters required.
   * Allowed values are 0-10.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param minLowercase set the minLowercase.
   */
  @VsoMethod
  public void setMinLowercase(Integer  minLowercase) {
    this.minLowercase = minLowercase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum number of numeric characters required.
   * Allowed values are 0-10.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return minNumeric
   */
  @VsoMethod
  public Integer getMinNumeric() {
    return minNumeric;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum number of numeric characters required.
   * Allowed values are 0-10.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param minNumeric set the minNumeric.
   */
  @VsoMethod
  public void setMinNumeric(Integer  minNumeric) {
    this.minNumeric = minNumeric;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum number of special characters required.
   * Allowed values are 0-10.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return minSpecial
   */
  @VsoMethod
  public Integer getMinSpecial() {
    return minSpecial;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum number of special characters required.
   * Allowed values are 0-10.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param minSpecial set the minSpecial.
   */
  @VsoMethod
  public void setMinSpecial(Integer  minSpecial) {
    this.minSpecial = minSpecial;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum number of uppercase characters required.
   * Allowed values are 0-10.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return minUppercase
   */
  @VsoMethod
  public Integer getMinUppercase() {
    return minUppercase;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum number of uppercase characters required.
   * Allowed values are 0-10.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param minUppercase set the minUppercase.
   */
  @VsoMethod
  public void setMinUppercase(Integer  minUppercase) {
    this.minUppercase = minUppercase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the password policy configuration.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the password policy configuration.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Password expiry period in days.
   * Defaults to 365 days.
   * Allowed values are 30-730.
   * Field introduced in 32.1.1.
   * Unit is days.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 365.
   * @return passwordExpirationDays
   */
  @VsoMethod
  public Integer getPasswordExpirationDays() {
    return passwordExpirationDays;
  }

  /**
   * This is the setter method to the attribute.
   * Password expiry period in days.
   * Defaults to 365 days.
   * Allowed values are 30-730.
   * Field introduced in 32.1.1.
   * Unit is days.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 365.
   * @param passwordExpirationDays set the passwordExpirationDays.
   */
  @VsoMethod
  public void setPasswordExpirationDays(Integer  passwordExpirationDays) {
    this.passwordExpirationDays = passwordExpirationDays;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of previous passwords to remember.
   * Defaults to 5.
   * Allowed values are 1-10.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return passwordHistory
   */
  @VsoMethod
  public Integer getPasswordHistory() {
    return passwordHistory;
  }

  /**
   * This is the setter method to the attribute.
   * Number of previous passwords to remember.
   * Defaults to 5.
   * Allowed values are 1-10.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param passwordHistory set the passwordHistory.
   */
  @VsoMethod
  public void setPasswordHistory(Integer  passwordHistory) {
    this.passwordHistory = passwordHistory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant ref for the passwordpolicy.
   * It is a reference to an object of type tenant.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant ref for the passwordpolicy.
   * It is a reference to an object of type tenant.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the passwordpolicy.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the passwordpolicy.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PasswordPolicy objPasswordPolicy = (PasswordPolicy) o;
  return   Objects.equals(this.uuid, objPasswordPolicy.uuid)&&
  Objects.equals(this.name, objPasswordPolicy.name)&&
  Objects.equals(this.minLength, objPasswordPolicy.minLength)&&
  Objects.equals(this.minUppercase, objPasswordPolicy.minUppercase)&&
  Objects.equals(this.minLowercase, objPasswordPolicy.minLowercase)&&
  Objects.equals(this.minSpecial, objPasswordPolicy.minSpecial)&&
  Objects.equals(this.minNumeric, objPasswordPolicy.minNumeric)&&
  Objects.equals(this.passwordHistory, objPasswordPolicy.passwordHistory)&&
  Objects.equals(this.passwordExpirationDays, objPasswordPolicy.passwordExpirationDays)&&
  Objects.equals(this.lockoutMaxAuthFailures, objPasswordPolicy.lockoutMaxAuthFailures)&&
  Objects.equals(this.lockoutEvaluationPeriod, objPasswordPolicy.lockoutEvaluationPeriod)&&
  Objects.equals(this.lockoutPeriod, objPasswordPolicy.lockoutPeriod)&&
  Objects.equals(this.tenantRef, objPasswordPolicy.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PasswordPolicy {\n");
      sb.append("    lockoutEvaluationPeriod: ").append(toIndentedString(lockoutEvaluationPeriod)).append("\n");
        sb.append("    lockoutMaxAuthFailures: ").append(toIndentedString(lockoutMaxAuthFailures)).append("\n");
        sb.append("    lockoutPeriod: ").append(toIndentedString(lockoutPeriod)).append("\n");
        sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
        sb.append("    minLowercase: ").append(toIndentedString(minLowercase)).append("\n");
        sb.append("    minNumeric: ").append(toIndentedString(minNumeric)).append("\n");
        sb.append("    minSpecial: ").append(toIndentedString(minSpecial)).append("\n");
        sb.append("    minUppercase: ").append(toIndentedString(minUppercase)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    passwordExpirationDays: ").append(toIndentedString(passwordExpirationDays)).append("\n");
        sb.append("    passwordHistory: ").append(toIndentedString(passwordHistory)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

