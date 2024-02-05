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
 * The VinfraVcenterObjDeleteDetails is a POJO class extends AviRestResource that used for creating
 * VinfraVcenterObjDeleteDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VinfraVcenterObjDeleteDetails")
@VsoFinder(name = Constants.FINDER_VRO_VINFRAVCENTEROBJDELETEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VinfraVcenterObjDeleteDetails extends AviRestResource {
    @JsonProperty("obj_name")
    @JsonInclude(Include.NON_NULL)
    private String objName;

    @JsonProperty("vcenter")
    @JsonInclude(Include.NON_NULL)
    private String vcenter;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objName
   */
  @VsoMethod
  public String getObjName() {
    return objName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objName set the objName.
   */
  @VsoMethod
  public void setObjName(String  objName) {
    this.objName = objName;
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
  VinfraVcenterObjDeleteDetails objVinfraVcenterObjDeleteDetails = (VinfraVcenterObjDeleteDetails) o;
  return   Objects.equals(this.vcenter, objVinfraVcenterObjDeleteDetails.vcenter)&&
  Objects.equals(this.objName, objVinfraVcenterObjDeleteDetails.objName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VinfraVcenterObjDeleteDetails {\n");
      sb.append("    objName: ").append(toIndentedString(objName)).append("\n");
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

