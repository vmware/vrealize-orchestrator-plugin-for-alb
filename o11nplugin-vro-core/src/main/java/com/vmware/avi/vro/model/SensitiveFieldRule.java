package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.StringMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SensitiveFieldRule is a POJO class extends AviRestResource that used for creating
 * SensitiveFieldRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SensitiveFieldRule")
@VsoFinder(name = Constants.FINDER_VRO_SENSITIVEFIELDRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SensitiveFieldRule extends AviRestResource {
  @JsonProperty("action")
  @JsonInclude(Include.NON_NULL)
  private String action = "LOG_FIELD_REMOVE";

  @JsonProperty("enabled")
  @JsonInclude(Include.NON_NULL)
  private Boolean enabled = false;

  @JsonProperty("index")
  @JsonInclude(Include.NON_NULL)
  private Integer index = null;

  @JsonProperty("match")
  @JsonInclude(Include.NON_NULL)
  private StringMatch match = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;



  /**
   * This is the getter method this will return the attribute value.
   * Action for the matched log field, for instance the matched field can be removed or masked off.
   * Enum options - LOG_FIELD_REMOVE, LOG_FIELD_MASKOFF.
   * Field introduced in 17.2.10, 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as LOG_FIELD_REMOVE.
   * @return action
   */
  @VsoMethod
  public String getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Action for the matched log field, for instance the matched field can be removed or masked off.
   * Enum options - LOG_FIELD_REMOVE, LOG_FIELD_MASKOFF.
   * Field introduced in 17.2.10, 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as LOG_FIELD_REMOVE.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(String  action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable rule to match the sensitive fields.
   * Field introduced in 17.2.10, 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable rule to match the sensitive fields.
   * Field introduced in 17.2.10, 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Index of the rule.
   * Field introduced in 17.2.10, 18.1.2.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Index of the rule.
   * Field introduced in 17.2.10, 18.1.2.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Criterion to use for matching in the log.
   * Field introduced in 17.2.10, 18.1.2.
   * @return match
   */
  @VsoMethod
  public StringMatch getMatch() {
    return match;
  }

  /**
   * This is the setter method to the attribute.
   * Criterion to use for matching in the log.
   * Field introduced in 17.2.10, 18.1.2.
   * @param match set the match.
   */
  @VsoMethod
  public void setMatch(StringMatch match) {
    this.match = match;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the rule.
   * Field introduced in 17.2.10, 18.1.2.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the rule.
   * Field introduced in 17.2.10, 18.1.2.
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
  SensitiveFieldRule objSensitiveFieldRule = (SensitiveFieldRule) o;
  return   Objects.equals(this.name, objSensitiveFieldRule.name)&&
  Objects.equals(this.index, objSensitiveFieldRule.index)&&
  Objects.equals(this.enabled, objSensitiveFieldRule.enabled)&&
  Objects.equals(this.match, objSensitiveFieldRule.match)&&
  Objects.equals(this.action, objSensitiveFieldRule.action);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SensitiveFieldRule {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    match: ").append(toIndentedString(match)).append("\n");
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

