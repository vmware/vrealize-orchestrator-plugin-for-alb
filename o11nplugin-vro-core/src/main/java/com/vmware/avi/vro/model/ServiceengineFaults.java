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
 * The ServiceengineFaults is a POJO class extends AviRestResource that used for creating
 * ServiceengineFaults.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ServiceengineFaults")
@VsoFinder(name = Constants.FINDER_VRO_SERVICEENGINEFAULTS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ServiceengineFaults extends AviRestResource {
    @JsonProperty("debug_faults")
    @JsonInclude(Include.NON_NULL)
    private Boolean debugFaults = true;



  /**
   * This is the getter method this will return the attribute value.
   * Enable debug faults.
   * Field introduced in 20.1.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return debugFaults
   */
  @VsoMethod
  public Boolean getDebugFaults() {
    return debugFaults;
  }

  /**
   * This is the setter method to the attribute.
   * Enable debug faults.
   * Field introduced in 20.1.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param debugFaults set the debugFaults.
   */
  @VsoMethod
  public void setDebugFaults(Boolean  debugFaults) {
    this.debugFaults = debugFaults;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ServiceengineFaults objServiceengineFaults = (ServiceengineFaults) o;
  return   Objects.equals(this.debugFaults, objServiceengineFaults.debugFaults);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ServiceengineFaults {\n");
      sb.append("    debugFaults: ").append(toIndentedString(debugFaults)).append("\n");
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

