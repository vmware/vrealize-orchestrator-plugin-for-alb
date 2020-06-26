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
 * The BfdProfile is a POJO class extends AviRestResource that used for creating
 * BfdProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BfdProfile")
@VsoFinder(name = Constants.FINDER_VRO_BFDPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BfdProfile extends AviRestResource {
  @JsonProperty("minrx")
  @JsonInclude(Include.NON_NULL)
  private Integer minrx = 1000;

  @JsonProperty("mintx")
  @JsonInclude(Include.NON_NULL)
  private Integer mintx = 1000;

  @JsonProperty("multi")
  @JsonInclude(Include.NON_NULL)
  private Integer multi = 3;



  /**
   * This is the getter method this will return the attribute value.
   * Default required minimum receive interval (in ms) used in bfd.
   * Allowed values are 500-4000000.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @return minrx
   */
  @VsoMethod
  public Integer getMinrx() {
    return minrx;
  }

  /**
   * This is the setter method to the attribute.
   * Default required minimum receive interval (in ms) used in bfd.
   * Allowed values are 500-4000000.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @param minrx set the minrx.
   */
  @VsoMethod
  public void setMinrx(Integer  minrx) {
    this.minrx = minrx;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default desired minimum transmit interval (in ms) used in bfd.
   * Allowed values are 500-4000000.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @return mintx
   */
  @VsoMethod
  public Integer getMintx() {
    return mintx;
  }

  /**
   * This is the setter method to the attribute.
   * Default desired minimum transmit interval (in ms) used in bfd.
   * Allowed values are 500-4000000.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @param mintx set the mintx.
   */
  @VsoMethod
  public void setMintx(Integer  mintx) {
    this.mintx = mintx;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default detection multiplier used in bfd.
   * Allowed values are 3-255.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @return multi
   */
  @VsoMethod
  public Integer getMulti() {
    return multi;
  }

  /**
   * This is the setter method to the attribute.
   * Default detection multiplier used in bfd.
   * Allowed values are 3-255.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @param multi set the multi.
   */
  @VsoMethod
  public void setMulti(Integer  multi) {
    this.multi = multi;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  BfdProfile objBfdProfile = (BfdProfile) o;
  return   Objects.equals(this.multi, objBfdProfile.multi)&&
  Objects.equals(this.mintx, objBfdProfile.mintx)&&
  Objects.equals(this.minrx, objBfdProfile.minrx);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BfdProfile {\n");
      sb.append("    minrx: ").append(toIndentedString(minrx)).append("\n");
        sb.append("    mintx: ").append(toIndentedString(mintx)).append("\n");
        sb.append("    multi: ").append(toIndentedString(multi)).append("\n");
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
