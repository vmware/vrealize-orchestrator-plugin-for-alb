package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VsScaleinParams is a POJO class extends AviRestResource that used for creating
 * VsScaleinParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VsScaleinParams")
@VsoFinder(name = Constants.FINDER_VRO_VSSCALEINPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VsScaleinParams extends AviRestResource {
    @JsonIgnore
    private Boolean adminDown = false;

    @JsonProperty("from_se_ref")
    @JsonInclude(Include.NON_NULL)
    private String fromSeRef;

    @JsonProperty("scalein_primary")
    @JsonInclude(Include.NON_NULL)
    private Boolean scaleinPrimary;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("vip_id")
    @JsonInclude(Include.NON_NULL)
    private String vipId;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return adminDown
   */
  @VsoMethod
  public Boolean getAdminDown() {
    return adminDown;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param adminDown set the adminDown.
   */
  @VsoMethod
  public void setAdminDown(Boolean  adminDown) {
    this.adminDown = adminDown;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fromSeRef
   */
  @VsoMethod
  public String getFromSeRef() {
    return fromSeRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fromSeRef set the fromSeRef.
   */
  @VsoMethod
  public void setFromSeRef(String  fromSeRef) {
    this.fromSeRef = fromSeRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scaleinPrimary
   */
  @VsoMethod
  public Boolean getScaleinPrimary() {
    return scaleinPrimary;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param scaleinPrimary set the scaleinPrimary.
   */
  @VsoMethod
  public void setScaleinPrimary(Boolean  scaleinPrimary) {
    this.scaleinPrimary = scaleinPrimary;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipId
   */
  @VsoMethod
  public String getVipId() {
    return vipId;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipId set the vipId.
   */
  @VsoMethod
  public void setVipId(String  vipId) {
    this.vipId = vipId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VsScaleinParams objVsScaleinParams = (VsScaleinParams) o;
  return   Objects.equals(this.uuid, objVsScaleinParams.uuid)&&
  Objects.equals(this.fromSeRef, objVsScaleinParams.fromSeRef)&&
  Objects.equals(this.scaleinPrimary, objVsScaleinParams.scaleinPrimary)&&
  Objects.equals(this.adminDown, objVsScaleinParams.adminDown)&&
  Objects.equals(this.vipId, objVsScaleinParams.vipId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VsScaleinParams {\n");
      sb.append("    adminDown: ").append(toIndentedString(adminDown)).append("\n");
        sb.append("    fromSeRef: ").append(toIndentedString(fromSeRef)).append("\n");
        sb.append("    scaleinPrimary: ").append(toIndentedString(scaleinPrimary)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
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

