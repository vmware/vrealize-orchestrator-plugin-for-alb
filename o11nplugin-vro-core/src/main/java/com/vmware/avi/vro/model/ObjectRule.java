package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.RetentionAction;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ObjectRule is a POJO class extends AviRestResource that used for creating
 * ObjectRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ObjectRule")
@VsoFinder(name = Constants.FINDER_VRO_OBJECTRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ObjectRule extends AviRestResource {
    @JsonProperty("action")
    @JsonInclude(Include.NON_NULL)
    private RetentionAction action;

    @JsonProperty("limit")
    @JsonInclude(Include.NON_NULL)
    private Integer limit;

    @JsonProperty("model_name")
    @JsonInclude(Include.NON_NULL)
    private String modelName;



  /**
   * This is the getter method this will return the attribute value.
   * Action to trigger when policy conditions are met.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return action
   */
  @VsoMethod
  public RetentionAction getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Action to trigger when policy conditions are met.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(RetentionAction action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of objects allowed in the system.
   * When the limit exceeds, action is invoked for the oldest objects.
   * Allowed values are 1-100000.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return limit
   */
  @VsoMethod
  public Integer getLimit() {
    return limit;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of objects allowed in the system.
   * When the limit exceeds, action is invoked for the oldest objects.
   * Allowed values are 1-100000.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param limit set the limit.
   */
  @VsoMethod
  public void setLimit(Integer  limit) {
    this.limit = limit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object model.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return modelName
   */
  @VsoMethod
  public String getModelName() {
    return modelName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object model.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @param modelName set the modelName.
   */
  @VsoMethod
  public void setModelName(String  modelName) {
    this.modelName = modelName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ObjectRule objObjectRule = (ObjectRule) o;
  return   Objects.equals(this.action, objObjectRule.action)&&
  Objects.equals(this.modelName, objObjectRule.modelName)&&
  Objects.equals(this.limit, objObjectRule.limit);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ObjectRule {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
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

