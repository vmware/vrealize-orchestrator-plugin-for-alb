package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.VsScaleinParams;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SeUpgradeScaleinEventDetails is a POJO class extends AviRestResource that used for creating
 * SeUpgradeScaleinEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeUpgradeScaleinEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEUPGRADESCALEINEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeUpgradeScaleinEventDetails extends AviRestResource {
    @JsonProperty("scalein_params")
    @JsonInclude(Include.NON_NULL)
    private VsScaleinParams scaleinParams = null;

    @JsonProperty("vs_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vsUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property scalein_params of obj type seupgradescaleineventdetails field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scaleinParams
   */
  @VsoMethod
  public VsScaleinParams getScaleinParams() {
    return scaleinParams;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property scalein_params of obj type seupgradescaleineventdetails field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param scaleinParams set the scaleinParams.
   */
  @VsoMethod
  public void setScaleinParams(VsScaleinParams scaleinParams) {
    this.scaleinParams = scaleinParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of vs.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of vs.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  SeUpgradeScaleinEventDetails objSeUpgradeScaleinEventDetails = (SeUpgradeScaleinEventDetails) o;
  return   Objects.equals(this.vsUuid, objSeUpgradeScaleinEventDetails.vsUuid)&&
  Objects.equals(this.scaleinParams, objSeUpgradeScaleinEventDetails.scaleinParams);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeUpgradeScaleinEventDetails {\n");
      sb.append("    scaleinParams: ").append(toIndentedString(scaleinParams)).append("\n");
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

