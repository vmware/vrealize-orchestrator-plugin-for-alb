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
 * The NtpWeakAuthAlgorithmEventDetails is a POJO class extends AviRestResource that used for creating
 * NtpWeakAuthAlgorithmEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NtpWeakAuthAlgorithmEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_NTPWEAKAUTHALGORITHMEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NtpWeakAuthAlgorithmEventDetails extends AviRestResource {
    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;



  /**
   * This is the getter method this will return the attribute value.
   * Comma-separated list of key numbers using weak ntp auth algorithms (md5 or sha1).
   * Field introduced in 32.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Comma-separated list of key numbers using weak ntp auth algorithms (md5 or sha1).
   * Field introduced in 32.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NtpWeakAuthAlgorithmEventDetails objNtpWeakAuthAlgorithmEventDetails = (NtpWeakAuthAlgorithmEventDetails) o;
  return   Objects.equals(this.description, objNtpWeakAuthAlgorithmEventDetails.description);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NtpWeakAuthAlgorithmEventDetails {\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

