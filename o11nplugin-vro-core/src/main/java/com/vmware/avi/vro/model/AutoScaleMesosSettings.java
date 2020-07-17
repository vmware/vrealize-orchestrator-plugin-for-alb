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
 * The AutoScaleMesosSettings is a POJO class extends AviRestResource that used for creating
 * AutoScaleMesosSettings.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AutoScaleMesosSettings")
@VsoFinder(name = Constants.FINDER_VRO_AUTOSCALEMESOSSETTINGS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AutoScaleMesosSettings extends AviRestResource {
  @JsonProperty("force")
  @JsonInclude(Include.NON_NULL)
  private Boolean force = true;



  /**
   * This is the getter method this will return the attribute value.
   * Apply scaleout even when there are deployments inprogress.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return force
   */
  @VsoMethod
  public Boolean getForce() {
    return force;
  }

  /**
   * This is the setter method to the attribute.
   * Apply scaleout even when there are deployments inprogress.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param force set the force.
   */
  @VsoMethod
  public void setForce(Boolean  force) {
    this.force = force;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AutoScaleMesosSettings objAutoScaleMesosSettings = (AutoScaleMesosSettings) o;
  return   Objects.equals(this.force, objAutoScaleMesosSettings.force);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AutoScaleMesosSettings {\n");
      sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

