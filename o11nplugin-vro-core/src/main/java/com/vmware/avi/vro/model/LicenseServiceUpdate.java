package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.OrgServiceUnits;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The LicenseServiceUpdate is a POJO class extends AviRestResource that used for creating
 * LicenseServiceUpdate.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LicenseServiceUpdate")
@VsoFinder(name = Constants.FINDER_VRO_LICENSESERVICEUPDATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LicenseServiceUpdate extends AviRestResource {
    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("service_units")
    @JsonInclude(Include.NON_NULL)
    private OrgServiceUnits serviceUnits;



  /**
   * This is the getter method this will return the attribute value.
   * Name.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Organization id.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceUnits
   */
  @VsoMethod
  public OrgServiceUnits getServiceUnits() {
    return serviceUnits;
  }

  /**
   * This is the setter method to the attribute.
   * Organization id.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceUnits set the serviceUnits.
   */
  @VsoMethod
  public void setServiceUnits(OrgServiceUnits serviceUnits) {
    this.serviceUnits = serviceUnits;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LicenseServiceUpdate objLicenseServiceUpdate = (LicenseServiceUpdate) o;
  return   Objects.equals(this.name, objLicenseServiceUpdate.name)&&
  Objects.equals(this.serviceUnits, objLicenseServiceUpdate.serviceUnits);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LicenseServiceUpdate {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serviceUnits: ").append(toIndentedString(serviceUnits)).append("\n");
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

