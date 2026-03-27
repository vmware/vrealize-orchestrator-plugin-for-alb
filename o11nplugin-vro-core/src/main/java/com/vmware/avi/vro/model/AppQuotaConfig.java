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
 * The AppQuotaConfig is a POJO class extends AviRestResource that used for creating
 * AppQuotaConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AppQuotaConfig")
@VsoFinder(name = Constants.FINDER_VRO_APPQUOTACONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AppQuotaConfig extends AviRestResource {
    @JsonProperty("vs_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer vsLimit = -1;



  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of virtual services allowed for this tenant.
   * -1 as default is maximum value, set to 0 to disallow any vs creation.
   * Allowed values are -1-+65535.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as -1.
   * @return vsLimit
   */
  @VsoMethod
  public Integer getVsLimit() {
    return vsLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of virtual services allowed for this tenant.
   * -1 as default is maximum value, set to 0 to disallow any vs creation.
   * Allowed values are -1-+65535.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as -1.
   * @param vsLimit set the vsLimit.
   */
  @VsoMethod
  public void setVsLimit(Integer  vsLimit) {
    this.vsLimit = vsLimit;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AppQuotaConfig objAppQuotaConfig = (AppQuotaConfig) o;
  return   Objects.equals(this.vsLimit, objAppQuotaConfig.vsLimit);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AppQuotaConfig {\n");
      sb.append("    vsLimit: ").append(toIndentedString(vsLimit)).append("\n");
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

