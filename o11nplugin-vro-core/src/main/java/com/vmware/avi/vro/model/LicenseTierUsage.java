package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.LicenseUsage;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The LicenseTierUsage is a POJO class extends AviRestResource that used for creating
 * LicenseTierUsage.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LicenseTierUsage")
@VsoFinder(name = Constants.FINDER_VRO_LICENSETIERUSAGE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LicenseTierUsage extends AviRestResource {
  @JsonProperty("tier")
  @JsonInclude(Include.NON_NULL)
  private String tier = null;

  @JsonProperty("usage")
  @JsonInclude(Include.NON_NULL)
  private LicenseUsage usage = null;



  /**
   * This is the getter method this will return the attribute value.
   * Specifies the license tier.
   * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC.
   * Field introduced in 20.1.1.
   * @return tier
   */
  @VsoMethod
  public String getTier() {
    return tier;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the license tier.
   * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC.
   * Field introduced in 20.1.1.
   * @param tier set the tier.
   */
  @VsoMethod
  public void setTier(String  tier) {
    this.tier = tier;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Usage stats of license tier.
   * Field introduced in 20.1.1.
   * @return usage
   */
  @VsoMethod
  public LicenseUsage getUsage() {
    return usage;
  }

  /**
   * This is the setter method to the attribute.
   * Usage stats of license tier.
   * Field introduced in 20.1.1.
   * @param usage set the usage.
   */
  @VsoMethod
  public void setUsage(LicenseUsage usage) {
    this.usage = usage;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LicenseTierUsage objLicenseTierUsage = (LicenseTierUsage) o;
  return   Objects.equals(this.tier, objLicenseTierUsage.tier)&&
  Objects.equals(this.usage, objLicenseTierUsage.usage);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LicenseTierUsage {\n");
      sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

