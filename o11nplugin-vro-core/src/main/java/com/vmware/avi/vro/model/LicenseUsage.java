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
 * The LicenseUsage is a POJO class extends AviRestResource that used for creating
 * LicenseUsage.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LicenseUsage")
@VsoFinder(name = Constants.FINDER_VRO_LICENSEUSAGE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LicenseUsage extends AviRestResource {
    @JsonProperty("available")
    @JsonInclude(Include.NON_NULL)
    private Float available = 0.0f;

    @JsonProperty("consumed")
    @JsonInclude(Include.NON_NULL)
    private Float consumed = 0.0f;

    @JsonProperty("escrow")
    @JsonInclude(Include.NON_NULL)
    private Float escrow = 0.0f;

    @JsonProperty("remaining")
    @JsonInclude(Include.NON_NULL)
    private Float remaining = 0.0f;



  /**
   * This is the getter method this will return the attribute value.
   * Total license cores available for consumption.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @return available
   */
  @VsoMethod
  public Float getAvailable() {
    return available;
  }

  /**
   * This is the setter method to the attribute.
   * Total license cores available for consumption.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @param available set the available.
   */
  @VsoMethod
  public void setAvailable(Float  available) {
    this.available = available;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total license cores consumed.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @return consumed
   */
  @VsoMethod
  public Float getConsumed() {
    return consumed;
  }

  /**
   * This is the setter method to the attribute.
   * Total license cores consumed.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @param consumed set the consumed.
   */
  @VsoMethod
  public void setConsumed(Float  consumed) {
    this.consumed = consumed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total license cores reserved or escrowed.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @return escrow
   */
  @VsoMethod
  public Float getEscrow() {
    return escrow;
  }

  /**
   * This is the setter method to the attribute.
   * Total license cores reserved or escrowed.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @param escrow set the escrow.
   */
  @VsoMethod
  public void setEscrow(Float  escrow) {
    this.escrow = escrow;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total license cores remaining for consumption.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @return remaining
   */
  @VsoMethod
  public Float getRemaining() {
    return remaining;
  }

  /**
   * This is the setter method to the attribute.
   * Total license cores remaining for consumption.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @param remaining set the remaining.
   */
  @VsoMethod
  public void setRemaining(Float  remaining) {
    this.remaining = remaining;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LicenseUsage objLicenseUsage = (LicenseUsage) o;
  return   Objects.equals(this.available, objLicenseUsage.available)&&
  Objects.equals(this.consumed, objLicenseUsage.consumed)&&
  Objects.equals(this.escrow, objLicenseUsage.escrow)&&
  Objects.equals(this.remaining, objLicenseUsage.remaining);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LicenseUsage {\n");
      sb.append("    available: ").append(toIndentedString(available)).append("\n");
        sb.append("    consumed: ").append(toIndentedString(consumed)).append("\n");
        sb.append("    escrow: ").append(toIndentedString(escrow)).append("\n");
        sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
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

