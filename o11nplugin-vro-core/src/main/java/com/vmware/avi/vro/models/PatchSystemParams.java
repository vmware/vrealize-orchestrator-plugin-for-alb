package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SeGroupOptions;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The PatchSystemParams is a POJO class extends AviRestResource that used for creating
 * PatchSystemParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PatchSystemParams")
@VsoFinder(name = Constants.FINDER_VRO_PATCHSYSTEMPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PatchSystemParams extends AviRestResource {
    @JsonProperty("controller_patch_ref")
    @JsonInclude(Include.NON_NULL)
    private String controllerPatchRef = null;

    @JsonProperty("se_group_options")
    @JsonInclude(Include.NON_NULL)
    private SeGroupOptions seGroupOptions = null;

    @JsonProperty("se_patch_ref")
    @JsonInclude(Include.NON_NULL)
    private String sePatchRef = null;

    @JsonProperty("skip_warnings")
    @JsonInclude(Include.NON_NULL)
    private Boolean skipWarnings = false;



  /**
   * This is the getter method this will return the attribute value.
   * Image uuid for identifying controller patch image.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerPatchRef
   */
  @VsoMethod
  public String getControllerPatchRef() {
    return controllerPatchRef;
  }

  /**
   * This is the setter method to the attribute.
   * Image uuid for identifying controller patch image.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerPatchRef set the controllerPatchRef.
   */
  @VsoMethod
  public void setControllerPatchRef(String  controllerPatchRef) {
    this.controllerPatchRef = controllerPatchRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Se group options for the patch operations.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupOptions
   */
  @VsoMethod
  public SeGroupOptions getSeGroupOptions() {
    return seGroupOptions;
  }

  /**
   * This is the setter method to the attribute.
   * Se group options for the patch operations.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGroupOptions set the seGroupOptions.
   */
  @VsoMethod
  public void setSeGroupOptions(SeGroupOptions seGroupOptions) {
    this.seGroupOptions = seGroupOptions;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image uuid for identifying se patch image.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sePatchRef
   */
  @VsoMethod
  public String getSePatchRef() {
    return sePatchRef;
  }

  /**
   * This is the setter method to the attribute.
   * Image uuid for identifying se patch image.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sePatchRef set the sePatchRef.
   */
  @VsoMethod
  public void setSePatchRef(String  sePatchRef) {
    this.sePatchRef = sePatchRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This is flag when set as true skips few optional must checks.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return skipWarnings
   */
  @VsoMethod
  public Boolean getSkipWarnings() {
    return skipWarnings;
  }

  /**
   * This is the setter method to the attribute.
   * This is flag when set as true skips few optional must checks.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param skipWarnings set the skipWarnings.
   */
  @VsoMethod
  public void setSkipWarnings(Boolean  skipWarnings) {
    this.skipWarnings = skipWarnings;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PatchSystemParams objPatchSystemParams = (PatchSystemParams) o;
  return   Objects.equals(this.controllerPatchRef, objPatchSystemParams.controllerPatchRef)&&
  Objects.equals(this.sePatchRef, objPatchSystemParams.sePatchRef)&&
  Objects.equals(this.seGroupOptions, objPatchSystemParams.seGroupOptions)&&
  Objects.equals(this.skipWarnings, objPatchSystemParams.skipWarnings);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PatchSystemParams {\n");
      sb.append("    controllerPatchRef: ").append(toIndentedString(controllerPatchRef)).append("\n");
        sb.append("    seGroupOptions: ").append(toIndentedString(seGroupOptions)).append("\n");
        sb.append("    sePatchRef: ").append(toIndentedString(sePatchRef)).append("\n");
        sb.append("    skipWarnings: ").append(toIndentedString(skipWarnings)).append("\n");
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

