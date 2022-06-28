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
 * The VinfraMgmtNwChangeDetails is a POJO class extends AviRestResource that used for creating
 * VinfraMgmtNwChangeDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VinfraMgmtNwChangeDetails")
@VsoFinder(name = Constants.FINDER_VRO_VINFRAMGMTNWCHANGEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VinfraMgmtNwChangeDetails extends AviRestResource {
    @JsonProperty("existing_nw")
    @JsonInclude(Include.NON_NULL)
    private String existingNw = null;

    @JsonProperty("new_nw")
    @JsonInclude(Include.NON_NULL)
    private String newNw = null;

    @JsonProperty("vcenter")
    @JsonInclude(Include.NON_NULL)
    private String vcenter = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return existingNw
   */
  @VsoMethod
  public String getExistingNw() {
    return existingNw;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param existingNw set the existingNw.
   */
  @VsoMethod
  public void setExistingNw(String  existingNw) {
    this.existingNw = existingNw;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return newNw
   */
  @VsoMethod
  public String getNewNw() {
    return newNw;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param newNw set the newNw.
   */
  @VsoMethod
  public void setNewNw(String  newNw) {
    this.newNw = newNw;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenter
   */
  @VsoMethod
  public String getVcenter() {
    return vcenter;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenter set the vcenter.
   */
  @VsoMethod
  public void setVcenter(String  vcenter) {
    this.vcenter = vcenter;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VinfraMgmtNwChangeDetails objVinfraMgmtNwChangeDetails = (VinfraMgmtNwChangeDetails) o;
  return   Objects.equals(this.vcenter, objVinfraMgmtNwChangeDetails.vcenter)&&
  Objects.equals(this.existingNw, objVinfraMgmtNwChangeDetails.existingNw)&&
  Objects.equals(this.newNw, objVinfraMgmtNwChangeDetails.newNw);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VinfraMgmtNwChangeDetails {\n");
      sb.append("    existingNw: ").append(toIndentedString(existingNw)).append("\n");
        sb.append("    newNw: ").append(toIndentedString(newNw)).append("\n");
        sb.append("    vcenter: ").append(toIndentedString(vcenter)).append("\n");
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

