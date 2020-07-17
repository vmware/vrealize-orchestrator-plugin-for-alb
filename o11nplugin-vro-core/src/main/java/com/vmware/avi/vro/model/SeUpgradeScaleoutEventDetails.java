package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.VsScaleoutParams;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SeUpgradeScaleoutEventDetails is a POJO class extends AviRestResource that used for creating
 * SeUpgradeScaleoutEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeUpgradeScaleoutEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEUPGRADESCALEOUTEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeUpgradeScaleoutEventDetails extends AviRestResource {
  @JsonProperty("scaleout_params")
  @JsonInclude(Include.NON_NULL)
  private VsScaleoutParams scaleoutParams = null;

  @JsonProperty("vs_uuid")
  @JsonInclude(Include.NON_NULL)
  private String vsUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property scaleout_params of obj type seupgradescaleouteventdetails field type str  type ref.
   * @return scaleoutParams
   */
  @VsoMethod
  public VsScaleoutParams getScaleoutParams() {
    return scaleoutParams;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property scaleout_params of obj type seupgradescaleouteventdetails field type str  type ref.
   * @param scaleoutParams set the scaleoutParams.
   */
  @VsoMethod
  public void setScaleoutParams(VsScaleoutParams scaleoutParams) {
    this.scaleoutParams = scaleoutParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of vs.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of vs.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeUpgradeScaleoutEventDetails objSeUpgradeScaleoutEventDetails = (SeUpgradeScaleoutEventDetails) o;
  return   Objects.equals(this.vsUuid, objSeUpgradeScaleoutEventDetails.vsUuid)&&
  Objects.equals(this.scaleoutParams, objSeUpgradeScaleoutEventDetails.scaleoutParams);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeUpgradeScaleoutEventDetails {\n");
      sb.append("    scaleoutParams: ").append(toIndentedString(scaleoutParams)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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

