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
 * The ControllerInternalAuth is a POJO class extends AviRestResource that used for creating
 * ControllerInternalAuth.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerInternalAuth")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERINTERNALAUTH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerInternalAuth extends AviRestResource {
    @JsonProperty("symmetric_jwks_keys")
    @JsonInclude(Include.NON_NULL)
    private List<JWSKey> symmetricJwksKeys = null;



  /**
   * This is the getter method this will return the attribute value.
   * Symmetric keys used for signing/validating the jwt, only allowed with profile_type controller_internal_auth.
   * Field introduced in 20.1.6.
   * Minimum of 1 items required.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return symmetricJwksKeys
   */
  @VsoMethod
  public List<JWSKey> getSymmetricJwksKeys() {
    return symmetricJwksKeys;
  }

  /**
   * This is the setter method. this will set the symmetricJwksKeys
   * Symmetric keys used for signing/validating the jwt, only allowed with profile_type controller_internal_auth.
   * Field introduced in 20.1.6.
   * Minimum of 1 items required.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return symmetricJwksKeys
   */
  @VsoMethod
  public void setSymmetricJwksKeys(List<JWSKey>  symmetricJwksKeys) {
    this.symmetricJwksKeys = symmetricJwksKeys;
  }

  /**
   * This is the setter method this will set the symmetricJwksKeys
   * Symmetric keys used for signing/validating the jwt, only allowed with profile_type controller_internal_auth.
   * Field introduced in 20.1.6.
   * Minimum of 1 items required.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return symmetricJwksKeys
   */
  @VsoMethod
  public ControllerInternalAuth addSymmetricJwksKeysItem(JWSKey symmetricJwksKeysItem) {
    if (this.symmetricJwksKeys == null) {
      this.symmetricJwksKeys = new ArrayList<JWSKey>();
    }
    this.symmetricJwksKeys.add(symmetricJwksKeysItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ControllerInternalAuth objControllerInternalAuth = (ControllerInternalAuth) o;
  return   Objects.equals(this.symmetricJwksKeys, objControllerInternalAuth.symmetricJwksKeys);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerInternalAuth {\n");
      sb.append("    symmetricJwksKeys: ").append(toIndentedString(symmetricJwksKeys)).append("\n");
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

