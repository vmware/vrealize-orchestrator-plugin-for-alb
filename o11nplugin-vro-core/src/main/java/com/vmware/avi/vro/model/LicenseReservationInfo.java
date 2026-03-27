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
 * The LicenseReservationInfo is a POJO class extends AviRestResource that used for creating
 * LicenseReservationInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LicenseReservationInfo")
@VsoFinder(name = Constants.FINDER_VRO_LICENSERESERVATIONINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LicenseReservationInfo extends AviRestResource {
    @JsonProperty("reserved")
    @JsonInclude(Include.NON_NULL)
    private Integer reserved;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * License cores reserved by tenant/se group.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reserved
   */
  @VsoMethod
  public Integer getReserved() {
    return reserved;
  }

  /**
   * This is the setter method to the attribute.
   * License cores reserved by tenant/se group.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reserved set the reserved.
   */
  @VsoMethod
  public void setReserved(Integer  reserved) {
    this.reserved = reserved;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid for tenant/se group.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid for tenant/se group.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LicenseReservationInfo objLicenseReservationInfo = (LicenseReservationInfo) o;
  return   Objects.equals(this.uuid, objLicenseReservationInfo.uuid)&&
  Objects.equals(this.reserved, objLicenseReservationInfo.reserved);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LicenseReservationInfo {\n");
      sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

