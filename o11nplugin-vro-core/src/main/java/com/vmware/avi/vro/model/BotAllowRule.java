package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.MatchTarget;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The BotAllowRule is a POJO class extends AviRestResource that used for creating
 * BotAllowRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BotAllowRule")
@VsoFinder(name = Constants.FINDER_VRO_BOTALLOWRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BotAllowRule extends AviRestResource {
    @JsonProperty("action")
    @JsonInclude(Include.NON_NULL)
    private String action = null;

    @JsonProperty("condition")
    @JsonInclude(Include.NON_NULL)
    private MatchTarget condition = null;

    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;



  /**
   * This is the getter method this will return the attribute value.
   * The action to take.
   * Enum options - BOT_ACTION_BYPASS, BOT_ACTION_CONTINUE.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return action
   */
  @VsoMethod
  public String getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * The action to take.
   * Enum options - BOT_ACTION_BYPASS, BOT_ACTION_CONTINUE.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(String  action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The condition to match.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return condition
   */
  @VsoMethod
  public MatchTarget getCondition() {
    return condition;
  }

  /**
   * This is the setter method to the attribute.
   * The condition to match.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param condition set the condition.
   */
  @VsoMethod
  public void setCondition(MatchTarget condition) {
    this.condition = condition;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rules are processed in order of this index field.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Rules are processed in order of this index field.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A name describing the rule in a short form.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * A name describing the rule in a short form.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  BotAllowRule objBotAllowRule = (BotAllowRule) o;
  return   Objects.equals(this.index, objBotAllowRule.index)&&
  Objects.equals(this.name, objBotAllowRule.name)&&
  Objects.equals(this.condition, objBotAllowRule.condition)&&
  Objects.equals(this.action, objBotAllowRule.action);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BotAllowRule {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

