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
 * The VinfraVcenterDiscoveryFailure is a POJO class extends AviRestResource that used for creating
 * VinfraVcenterDiscoveryFailure.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VinfraVcenterDiscoveryFailure")
@VsoFinder(name = Constants.FINDER_VRO_VINFRAVCENTERDISCOVERYFAILURE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VinfraVcenterDiscoveryFailure extends AviRestResource {
    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private String state;

    @JsonProperty("vcenter")
    @JsonInclude(Include.NON_NULL)
    private String vcenter;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public String getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(String  state) {
    this.state = state;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenter
   */
  @VsoMethod
  public String getVcenter() {
    return vcenter;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenter set the vcenter.
   */
  @VsoMethod
  public void setVcenter(String  vcenter) {
    this.vcenter = vcenter;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VinfraVcenterDiscoveryFailure objVinfraVcenterDiscoveryFailure = (VinfraVcenterDiscoveryFailure) o;
  return   Objects.equals(this.vcenter, objVinfraVcenterDiscoveryFailure.vcenter)&&
  Objects.equals(this.state, objVinfraVcenterDiscoveryFailure.state);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VinfraVcenterDiscoveryFailure {\n");
      sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    vcenter: ").append(toIndentedString(vcenter)).append("\n");
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

