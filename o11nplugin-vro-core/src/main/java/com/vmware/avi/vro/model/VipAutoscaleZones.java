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
 * The VipAutoscaleZones is a POJO class extends AviRestResource that used for creating
 * VipAutoscaleZones.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VipAutoscaleZones")
@VsoFinder(name = Constants.FINDER_VRO_VIPAUTOSCALEZONES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VipAutoscaleZones extends AviRestResource {
    @JsonProperty("availability_zone")
    @JsonInclude(Include.NON_NULL)
    private String availabilityZone;

    @JsonProperty("fip_capable")
    @JsonInclude(Include.NON_NULL)
    private Boolean fipCapable;

    @JsonProperty("subnet_uuid")
    @JsonInclude(Include.NON_NULL)
    private String subnetUuid;



  /**
   * This is the getter method this will return the attribute value.
   * Availability zone associated with the subnet.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return availabilityZone
   */
  @VsoMethod
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  /**
   * This is the setter method to the attribute.
   * Availability zone associated with the subnet.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @param availabilityZone set the availabilityZone.
   */
  @VsoMethod
  public void setAvailabilityZone(String  availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Determines if the subnet is capable of hosting publicly accessible ip.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return fipCapable
   */
  @VsoMethod
  public Boolean getFipCapable() {
    return fipCapable;
  }

  /**
   * This is the setter method to the attribute.
   * Determines if the subnet is capable of hosting publicly accessible ip.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @param fipCapable set the fipCapable.
   */
  @VsoMethod
  public void setFipCapable(Boolean  fipCapable) {
    this.fipCapable = fipCapable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the subnet for new ip address allocation.
   * Field introduced in 17.2.12, 18.1.2.
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
   * Uuid of the subnet for new ip address allocation.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subnetUuid set the subnetUuid.
   */
  @VsoMethod
  public void setSubnetUuid(String  subnetUuid) {
    this.subnetUuid = subnetUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VipAutoscaleZones objVipAutoscaleZones = (VipAutoscaleZones) o;
  return   Objects.equals(this.availabilityZone, objVipAutoscaleZones.availabilityZone)&&
  Objects.equals(this.subnetUuid, objVipAutoscaleZones.subnetUuid)&&
  Objects.equals(this.fipCapable, objVipAutoscaleZones.fipCapable);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VipAutoscaleZones {\n");
      sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    fipCapable: ").append(toIndentedString(fipCapable)).append("\n");
        sb.append("    subnetUuid: ").append(toIndentedString(subnetUuid)).append("\n");
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

