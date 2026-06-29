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
 * The KeylessLicense is a POJO class extends AviRestResource that used for creating
 * KeylessLicense.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "KeylessLicense")
@VsoFinder(name = Constants.FINDER_VRO_KEYLESSLICENSE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class KeylessLicense extends AviRestResource {
    @JsonProperty("license_token")
    @JsonInclude(Include.NON_NULL)
    private String licenseToken;



  /**
   * This is the getter method this will return the attribute value.
   * Keyless license subscription details.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseToken
   */
  @VsoMethod
  public String getLicenseToken() {
    return licenseToken;
  }

  /**
   * This is the setter method to the attribute.
   * Keyless license subscription details.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param licenseToken set the licenseToken.
   */
  @VsoMethod
  public void setLicenseToken(String  licenseToken) {
    this.licenseToken = licenseToken;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  KeylessLicense objKeylessLicense = (KeylessLicense) o;
  return   Objects.equals(this.licenseToken, objKeylessLicense.licenseToken);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class KeylessLicense {\n");
      sb.append("    licenseToken: ").append(toIndentedString(licenseToken)).append("\n");
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

