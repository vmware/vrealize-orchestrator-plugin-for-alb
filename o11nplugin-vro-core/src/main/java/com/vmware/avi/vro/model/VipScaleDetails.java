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
 * The VipScaleDetails is a POJO class extends AviRestResource that used for creating
 * VipScaleDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VipScaleDetails")
@VsoFinder(name = Constants.FINDER_VRO_VIPSCALEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VipScaleDetails extends AviRestResource {
    @JsonProperty("availability_zone")
    @JsonInclude(Include.NON_NULL)
    private String availabilityZone;

    @JsonProperty("error")
    @JsonInclude(Include.NON_NULL)
    private String error;

    @JsonProperty("subnet_uuid")
    @JsonInclude(Include.NON_NULL)
    private String subnetUuid;

    @JsonProperty("vip_id")
    @JsonInclude(Include.NON_NULL)
    private String vipId;

    @JsonProperty("vsvip_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vsvipUuid;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return availabilityZone
   */
  @VsoMethod
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param availabilityZone set the availabilityZone.
   */
  @VsoMethod
  public void setAvailabilityZone(String  availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return error
   */
  @VsoMethod
  public String getError() {
    return error;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param error set the error.
   */
  @VsoMethod
  public void setError(String  error) {
    this.error = error;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subnetUuid
   */
  @VsoMethod
  public String getSubnetUuid() {
    return subnetUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subnetUuid set the subnetUuid.
   */
  @VsoMethod
  public void setSubnetUuid(String  subnetUuid) {
    this.subnetUuid = subnetUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipId set the vipId.
   */
  @VsoMethod
  public void setVipId(String  vipId) {
    this.vipId = vipId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsvipUuid
   */
  @VsoMethod
  public String getVsvipUuid() {
    return vsvipUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsvipUuid set the vsvipUuid.
   */
  @VsoMethod
  public void setVsvipUuid(String  vsvipUuid) {
    this.vsvipUuid = vsvipUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VipScaleDetails objVipScaleDetails = (VipScaleDetails) o;
  return   Objects.equals(this.vsvipUuid, objVipScaleDetails.vsvipUuid)&&
  Objects.equals(this.vipId, objVipScaleDetails.vipId)&&
  Objects.equals(this.availabilityZone, objVipScaleDetails.availabilityZone)&&
  Objects.equals(this.subnetUuid, objVipScaleDetails.subnetUuid)&&
  Objects.equals(this.error, objVipScaleDetails.error);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VipScaleDetails {\n");
      sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    subnetUuid: ").append(toIndentedString(subnetUuid)).append("\n");
        sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
        sb.append("    vsvipUuid: ").append(toIndentedString(vsvipUuid)).append("\n");
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

