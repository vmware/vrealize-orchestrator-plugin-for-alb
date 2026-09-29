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
 * The SupervisorSeGroupFreeLicenseDetails is a POJO class extends AviRestResource that used for creating
 * SupervisorSeGroupFreeLicenseDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SupervisorSeGroupFreeLicenseDetails")
@VsoFinder(name = Constants.FINDER_VRO_SUPERVISORSEGROUPFREELICENSEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SupervisorSeGroupFreeLicenseDetails extends AviRestResource {
    @JsonProperty("free_su_limit")
    @JsonInclude(Include.NON_NULL)
    private Float freeSuLimit;

    @JsonProperty("se_group_name")
    @JsonInclude(Include.NON_NULL)
    private String seGroupName;

    @JsonProperty("se_group_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seGroupUuid;

    @JsonProperty("service_units_used")
    @JsonInclude(Include.NON_NULL)
    private Float serviceUnitsUsed;



  /**
   * This is the getter method this will return the attribute value.
   * Free service unit allowance for the supervisor se group.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return freeSuLimit
   */
  @VsoMethod
  public Float getFreeSuLimit() {
    return freeSuLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Free service unit allowance for the supervisor se group.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param freeSuLimit set the freeSuLimit.
   */
  @VsoMethod
  public void setFreeSuLimit(Float  freeSuLimit) {
    this.freeSuLimit = freeSuLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the supervisor se group.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupName
   */
  @VsoMethod
  public String getSeGroupName() {
    return seGroupName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the supervisor se group.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGroupName set the seGroupName.
   */
  @VsoMethod
  public void setSeGroupName(String  seGroupName) {
    this.seGroupName = seGroupName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the supervisor se group.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupUuid
   */
  @VsoMethod
  public String getSeGroupUuid() {
    return seGroupUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the supervisor se group.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGroupUuid set the seGroupUuid.
   */
  @VsoMethod
  public void setSeGroupUuid(String  seGroupUuid) {
    this.seGroupUuid = seGroupUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service units currently consumed and reserved by the supervisor se group.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceUnitsUsed
   */
  @VsoMethod
  public Float getServiceUnitsUsed() {
    return serviceUnitsUsed;
  }

  /**
   * This is the setter method to the attribute.
   * Service units currently consumed and reserved by the supervisor se group.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceUnitsUsed set the serviceUnitsUsed.
   */
  @VsoMethod
  public void setServiceUnitsUsed(Float  serviceUnitsUsed) {
    this.serviceUnitsUsed = serviceUnitsUsed;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SupervisorSeGroupFreeLicenseDetails objSupervisorSeGroupFreeLicenseDetails = (SupervisorSeGroupFreeLicenseDetails) o;
  return   Objects.equals(this.seGroupUuid, objSupervisorSeGroupFreeLicenseDetails.seGroupUuid)&&
  Objects.equals(this.seGroupName, objSupervisorSeGroupFreeLicenseDetails.seGroupName)&&
  Objects.equals(this.serviceUnitsUsed, objSupervisorSeGroupFreeLicenseDetails.serviceUnitsUsed)&&
  Objects.equals(this.freeSuLimit, objSupervisorSeGroupFreeLicenseDetails.freeSuLimit);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SupervisorSeGroupFreeLicenseDetails {\n");
      sb.append("    freeSuLimit: ").append(toIndentedString(freeSuLimit)).append("\n");
        sb.append("    seGroupName: ").append(toIndentedString(seGroupName)).append("\n");
        sb.append("    seGroupUuid: ").append(toIndentedString(seGroupUuid)).append("\n");
        sb.append("    serviceUnitsUsed: ").append(toIndentedString(serviceUnitsUsed)).append("\n");
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

