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
 * The OshiftSharedVirtualService is a POJO class extends AviRestResource that used for creating
 * OshiftSharedVirtualService.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OshiftSharedVirtualService")
@VsoFinder(name = Constants.FINDER_VRO_OSHIFTSHAREDVIRTUALSERVICE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OshiftSharedVirtualService extends AviRestResource {
    @JsonProperty("virtualservice_name")
    @JsonInclude(Include.NON_NULL)
    private String virtualserviceName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Name of shared virtualservice.
   * Virtualservice will be created automatically by cloud connector.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return virtualserviceName
   */
  @VsoMethod
  public String getVirtualserviceName() {
    return virtualserviceName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of shared virtualservice.
   * Virtualservice will be created automatically by cloud connector.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param virtualserviceName set the virtualserviceName.
   */
  @VsoMethod
  public void setVirtualserviceName(String  virtualserviceName) {
    this.virtualserviceName = virtualserviceName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OshiftSharedVirtualService objOshiftSharedVirtualService = (OshiftSharedVirtualService) o;
  return   Objects.equals(this.virtualserviceName, objOshiftSharedVirtualService.virtualserviceName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OshiftSharedVirtualService {\n");
      sb.append("    virtualserviceName: ").append(toIndentedString(virtualserviceName)).append("\n");
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

