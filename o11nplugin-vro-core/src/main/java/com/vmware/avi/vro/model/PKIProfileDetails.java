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
 * The PKIProfileDetails is a POJO class extends AviRestResource that used for creating
 * PKIProfileDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PKIProfileDetails")
@VsoFinder(name = Constants.FINDER_VRO_PKIPROFILEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PKIProfileDetails extends AviRestResource {
    @JsonProperty("crls")
    @JsonInclude(Include.NON_NULL)
    private String crls;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;



  /**
   * This is the getter method this will return the attribute value.
   * Crl list.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return crls
   */
  @VsoMethod
  public String getCrls() {
    return crls;
  }

  /**
   * This is the setter method to the attribute.
   * Crl list.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param crls set the crls.
   */
  @VsoMethod
  public void setCrls(String  crls) {
    this.crls = crls;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of pkiprofile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of pkiprofile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PKIProfileDetails objPKIProfileDetails = (PKIProfileDetails) o;
  return   Objects.equals(this.name, objPKIProfileDetails.name)&&
  Objects.equals(this.crls, objPKIProfileDetails.crls);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PKIProfileDetails {\n");
      sb.append("    crls: ").append(toIndentedString(crls)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

