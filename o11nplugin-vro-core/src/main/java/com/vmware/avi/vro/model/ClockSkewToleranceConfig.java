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
 * The ClockSkewToleranceConfig is a POJO class extends AviRestResource that used for creating
 * ClockSkewToleranceConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ClockSkewToleranceConfig")
@VsoFinder(name = Constants.FINDER_VRO_CLOCKSKEWTOLERANCECONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ClockSkewToleranceConfig extends AviRestResource {
    @JsonProperty("enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean enabled = true;

    @JsonProperty("skew_tolerance")
    @JsonInclude(Include.NON_NULL)
    private Integer skewTolerance = 30;



  /**
   * This is the getter method this will return the attribute value.
   * Enable clock-skew tolerance when validating jwt exp/iat claims.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable clock-skew tolerance when validating jwt exp/iat claims.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum clock drift tolerated between the token-issuing and verifying sides when validating jwt exp/iat claims.
   * Allowed values are 1-300.
   * Field introduced in 32.1.4.
   * Unit is sec.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @return skewTolerance
   */
  @VsoMethod
  public Integer getSkewTolerance() {
    return skewTolerance;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum clock drift tolerated between the token-issuing and verifying sides when validating jwt exp/iat claims.
   * Allowed values are 1-300.
   * Field introduced in 32.1.4.
   * Unit is sec.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @param skewTolerance set the skewTolerance.
   */
  @VsoMethod
  public void setSkewTolerance(Integer  skewTolerance) {
    this.skewTolerance = skewTolerance;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ClockSkewToleranceConfig objClockSkewToleranceConfig = (ClockSkewToleranceConfig) o;
  return   Objects.equals(this.enabled, objClockSkewToleranceConfig.enabled)&&
  Objects.equals(this.skewTolerance, objClockSkewToleranceConfig.skewTolerance);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ClockSkewToleranceConfig {\n");
      sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    skewTolerance: ").append(toIndentedString(skewTolerance)).append("\n");
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

