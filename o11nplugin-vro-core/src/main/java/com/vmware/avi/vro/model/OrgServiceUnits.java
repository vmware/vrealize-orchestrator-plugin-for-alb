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
 * The OrgServiceUnits is a POJO class extends AviRestResource that used for creating
 * OrgServiceUnits.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OrgServiceUnits")
@VsoFinder(name = Constants.FINDER_VRO_ORGSERVICEUNITS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OrgServiceUnits extends AviRestResource {
    @JsonProperty("available_service_units")
    @JsonInclude(Include.NON_NULL)
    private Float availableServiceUnits = null;

    @JsonProperty("org_id")
    @JsonInclude(Include.NON_NULL)
    private String orgId = null;

    @JsonProperty("used_service_units")
    @JsonInclude(Include.NON_NULL)
    private Float usedServiceUnits = null;



  /**
   * This is the getter method this will return the attribute value.
   * Available service units on pulse portal.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return availableServiceUnits
   */
  @VsoMethod
  public Float getAvailableServiceUnits() {
    return availableServiceUnits;
  }

  /**
   * This is the setter method to the attribute.
   * Available service units on pulse portal.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param availableServiceUnits set the availableServiceUnits.
   */
  @VsoMethod
  public void setAvailableServiceUnits(Float  availableServiceUnits) {
    this.availableServiceUnits = availableServiceUnits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Organization id.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return orgId
   */
  @VsoMethod
  public String getOrgId() {
    return orgId;
  }

  /**
   * This is the setter method to the attribute.
   * Organization id.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param orgId set the orgId.
   */
  @VsoMethod
  public void setOrgId(String  orgId) {
    this.orgId = orgId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Used service units on pulse portal.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return usedServiceUnits
   */
  @VsoMethod
  public Float getUsedServiceUnits() {
    return usedServiceUnits;
  }

  /**
   * This is the setter method to the attribute.
   * Used service units on pulse portal.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param usedServiceUnits set the usedServiceUnits.
   */
  @VsoMethod
  public void setUsedServiceUnits(Float  usedServiceUnits) {
    this.usedServiceUnits = usedServiceUnits;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OrgServiceUnits objOrgServiceUnits = (OrgServiceUnits) o;
  return   Objects.equals(this.orgId, objOrgServiceUnits.orgId)&&
  Objects.equals(this.availableServiceUnits, objOrgServiceUnits.availableServiceUnits)&&
  Objects.equals(this.usedServiceUnits, objOrgServiceUnits.usedServiceUnits);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OrgServiceUnits {\n");
      sb.append("    availableServiceUnits: ").append(toIndentedString(availableServiceUnits)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    usedServiceUnits: ").append(toIndentedString(usedServiceUnits)).append("\n");
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

