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
 * The TencentZoneNetwork is a POJO class extends AviRestResource that used for creating
 * TencentZoneNetwork.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TencentZoneNetwork")
@VsoFinder(name = Constants.FINDER_VRO_TENCENTZONENETWORK)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TencentZoneNetwork extends AviRestResource {
    @JsonProperty("availability_zone")
    @JsonInclude(Include.NON_NULL)
    private String availabilityZone;

    @JsonProperty("usable_subnet_id")
    @JsonInclude(Include.NON_NULL)
    private String usableSubnetId;



  /**
   * This is the getter method this will return the attribute value.
   * Availability zone.
   * Field introduced in 18.2.3.
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
   * Availability zone.
   * Field introduced in 18.2.3.
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
   * Usable networks for virtual ip.
   * If virtualservice does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for ip
   * allocation.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return usableSubnetId
   */
  @VsoMethod
  public String getUsableSubnetId() {
    return usableSubnetId;
  }

  /**
   * This is the setter method to the attribute.
   * Usable networks for virtual ip.
   * If virtualservice does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for ip
   * allocation.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param usableSubnetId set the usableSubnetId.
   */
  @VsoMethod
  public void setUsableSubnetId(String  usableSubnetId) {
    this.usableSubnetId = usableSubnetId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TencentZoneNetwork objTencentZoneNetwork = (TencentZoneNetwork) o;
  return   Objects.equals(this.availabilityZone, objTencentZoneNetwork.availabilityZone)&&
  Objects.equals(this.usableSubnetId, objTencentZoneNetwork.usableSubnetId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TencentZoneNetwork {\n");
      sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    usableSubnetId: ").append(toIndentedString(usableSubnetId)).append("\n");
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

