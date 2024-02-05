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
 * The ApplyLogRecommendations is a POJO class extends AviRestResource that used for creating
 * ApplyLogRecommendations.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApplyLogRecommendations")
@VsoFinder(name = Constants.FINDER_VRO_APPLYLOGRECOMMENDATIONS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApplyLogRecommendations extends AviRestResource {
    @JsonProperty("actions")
    @JsonInclude(Include.NON_NULL)
    private List<Action> actions;



  /**
   * This is the getter method this will return the attribute value.
   * Describe the actions we want to perform.
   * Field introduced in 21.1.3.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actions
   */
  @VsoMethod
  public List<Action> getActions() {
    return actions;
  }

  /**
   * This is the setter method. this will set the actions
   * Describe the actions we want to perform.
   * Field introduced in 21.1.3.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actions
   */
  @VsoMethod
  public void setActions(List<Action>  actions) {
    this.actions = actions;
  }

  /**
   * This is the setter method this will set the actions
   * Describe the actions we want to perform.
   * Field introduced in 21.1.3.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actions
   */
  @VsoMethod
  public ApplyLogRecommendations addActionsItem(Action actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<Action>();
    }
    this.actions.add(actionsItem);
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
  ApplyLogRecommendations objApplyLogRecommendations = (ApplyLogRecommendations) o;
  return   Objects.equals(this.actions, objApplyLogRecommendations.actions);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApplyLogRecommendations {\n");
      sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

