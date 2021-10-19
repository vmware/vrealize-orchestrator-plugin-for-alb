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
 * The ControllerInfo is a POJO class extends AviRestResource that used for creating
 * ControllerInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerInfo")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerInfo extends AviRestResource {
    @JsonProperty("current_controller_mem_usage")
    @JsonInclude(Include.NON_NULL)
    private Float currentControllerMemUsage = null;



  /**
   * This is the getter method this will return the attribute value.
   * Total controller memory usage in gbs.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return currentControllerMemUsage
   */
  @VsoMethod
  public Float getCurrentControllerMemUsage() {
    return currentControllerMemUsage;
  }

  /**
   * This is the setter method to the attribute.
   * Total controller memory usage in gbs.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param currentControllerMemUsage set the currentControllerMemUsage.
   */
  @VsoMethod
  public void setCurrentControllerMemUsage(Float  currentControllerMemUsage) {
    this.currentControllerMemUsage = currentControllerMemUsage;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ControllerInfo objControllerInfo = (ControllerInfo) o;
  return   Objects.equals(this.currentControllerMemUsage, objControllerInfo.currentControllerMemUsage);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerInfo {\n");
      sb.append("    currentControllerMemUsage: ").append(toIndentedString(currentControllerMemUsage)).append("\n");
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

