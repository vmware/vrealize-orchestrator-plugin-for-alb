package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SamlIdentityProviderSettings;
import com.vmware.avi.vro.model.SamlServiceProviderSettings;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SamlSettings is a POJO class extends AviRestResource that used for creating
 * SamlSettings.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SamlSettings")
@VsoFinder(name = Constants.FINDER_VRO_SAMLSETTINGS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SamlSettings extends AviRestResource {
    @JsonProperty("idp")
    @JsonInclude(Include.NON_NULL)
    private SamlIdentityProviderSettings idp;

    @JsonProperty("sp")
    @JsonInclude(Include.NON_NULL)
    private SamlServiceProviderSettings sp;



  /**
   * This is the getter method this will return the attribute value.
   * Configure remote identity provider settings.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return idp
   */
  @VsoMethod
  public SamlIdentityProviderSettings getIdp() {
    return idp;
  }

  /**
   * This is the setter method to the attribute.
   * Configure remote identity provider settings.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param idp set the idp.
   */
  @VsoMethod
  public void setIdp(SamlIdentityProviderSettings idp) {
    this.idp = idp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure service provider settings for the controller.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sp
   */
  @VsoMethod
  public SamlServiceProviderSettings getSp() {
    return sp;
  }

  /**
   * This is the setter method to the attribute.
   * Configure service provider settings for the controller.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sp set the sp.
   */
  @VsoMethod
  public void setSp(SamlServiceProviderSettings sp) {
    this.sp = sp;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SamlSettings objSamlSettings = (SamlSettings) o;
  return   Objects.equals(this.idp, objSamlSettings.idp)&&
  Objects.equals(this.sp, objSamlSettings.sp);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SamlSettings {\n");
      sb.append("    idp: ").append(toIndentedString(idp)).append("\n");
        sb.append("    sp: ").append(toIndentedString(sp)).append("\n");
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

