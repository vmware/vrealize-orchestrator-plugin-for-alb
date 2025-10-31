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
 * The ComplexityConstraint is a POJO class extends AviRestResource that used for creating
 * ComplexityConstraint.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ComplexityConstraint")
@VsoFinder(name = Constants.FINDER_VRO_COMPLEXITYCONSTRAINT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ComplexityConstraint extends AviRestResource {
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

    @JsonProperty("password_history")
    @JsonInclude(Include.NON_NULL)
    private Integer passwordHistory = 5;



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



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ComplexityConstraint objComplexityConstraint = (ComplexityConstraint) o;
  return   Objects.equals(this.minLength, objComplexityConstraint.minLength)&&
  Objects.equals(this.minUppercase, objComplexityConstraint.minUppercase)&&
  Objects.equals(this.minLowercase, objComplexityConstraint.minLowercase)&&
  Objects.equals(this.minSpecial, objComplexityConstraint.minSpecial)&&
  Objects.equals(this.minNumeric, objComplexityConstraint.minNumeric)&&
  Objects.equals(this.passwordHistory, objComplexityConstraint.passwordHistory);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ComplexityConstraint {\n");
      sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
        sb.append("    minLowercase: ").append(toIndentedString(minLowercase)).append("\n");
        sb.append("    minNumeric: ").append(toIndentedString(minNumeric)).append("\n");
        sb.append("    minSpecial: ").append(toIndentedString(minSpecial)).append("\n");
        sb.append("    minUppercase: ").append(toIndentedString(minUppercase)).append("\n");
        sb.append("    passwordHistory: ").append(toIndentedString(passwordHistory)).append("\n");
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

