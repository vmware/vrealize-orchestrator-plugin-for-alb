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
 * The SCProperties is a POJO class extends AviRestResource that used for creating
 * SCProperties.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SCProperties")
@VsoFinder(name = Constants.FINDER_VRO_SCPROPERTIES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SCProperties extends AviRestResource {
    @JsonProperty("delay_injections")
    @JsonInclude(Include.NON_NULL)
    private List<SCFaultOptions> delayInjections;



  /**
   * This is the getter method this will return the attribute value.
   * Introduce delay faults in scm config, se, resmgrgo paths.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return delayInjections
   */
  @VsoMethod
  public List<SCFaultOptions> getDelayInjections() {
    return delayInjections;
  }

  /**
   * This is the setter method. this will set the delayInjections
   * Introduce delay faults in scm config, se, resmgrgo paths.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return delayInjections
   */
  @VsoMethod
  public void setDelayInjections(List<SCFaultOptions>  delayInjections) {
    this.delayInjections = delayInjections;
  }

  /**
   * This is the setter method this will set the delayInjections
   * Introduce delay faults in scm config, se, resmgrgo paths.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return delayInjections
   */
  @VsoMethod
  public SCProperties addDelayInjectionsItem(SCFaultOptions delayInjectionsItem) {
    if (this.delayInjections == null) {
      this.delayInjections = new ArrayList<SCFaultOptions>();
    }
    this.delayInjections.add(delayInjectionsItem);
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
  SCProperties objSCProperties = (SCProperties) o;
  return   Objects.equals(this.delayInjections, objSCProperties.delayInjections);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SCProperties {\n");
      sb.append("    delayInjections: ").append(toIndentedString(delayInjections)).append("\n");
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

