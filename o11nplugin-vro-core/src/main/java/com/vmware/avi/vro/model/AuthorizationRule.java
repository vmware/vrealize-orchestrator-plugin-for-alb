package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AuthorizationAction;
import com.vmware.avi.vro.model.AuthorizationMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The AuthorizationRule is a POJO class extends AviRestResource that used for creating
 * AuthorizationRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AuthorizationRule")
@VsoFinder(name = Constants.FINDER_VRO_AUTHORIZATIONRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AuthorizationRule extends AviRestResource {
    @JsonProperty("action")
    @JsonInclude(Include.NON_NULL)
    private AuthorizationAction action = null;

    @JsonProperty("enable")
    @JsonInclude(Include.NON_NULL)
    private Boolean enable = true;

    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index = null;

    @JsonProperty("match")
    @JsonInclude(Include.NON_NULL)
    private AuthorizationMatch match = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;



  /**
   * This is the getter method this will return the attribute value.
   * Authorization action when rule is matched.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return action
   */
  @VsoMethod
  public AuthorizationAction getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Authorization action when rule is matched.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(AuthorizationAction action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable or disable the rule.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enable
   */
  @VsoMethod
  public Boolean getEnable() {
    return enable;
  }

  /**
   * This is the setter method to the attribute.
   * Enable or disable the rule.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enable set the enable.
   */
  @VsoMethod
  public void setEnable(Boolean  enable) {
    this.enable = enable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Index of the authorization policy rule.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Index of the authorization policy rule.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Authorization match criteria for the rule.
   * Field introduced in 18.2.5.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return match
   */
  @VsoMethod
  public AuthorizationMatch getMatch() {
    return match;
  }

  /**
   * This is the setter method to the attribute.
   * Authorization match criteria for the rule.
   * Field introduced in 18.2.5.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param match set the match.
   */
  @VsoMethod
  public void setMatch(AuthorizationMatch match) {
    this.match = match;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the rule.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the rule.
   * Field introduced in 18.2.5.
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
  AuthorizationRule objAuthorizationRule = (AuthorizationRule) o;
  return   Objects.equals(this.name, objAuthorizationRule.name)&&
  Objects.equals(this.index, objAuthorizationRule.index)&&
  Objects.equals(this.enable, objAuthorizationRule.enable)&&
  Objects.equals(this.match, objAuthorizationRule.match)&&
  Objects.equals(this.action, objAuthorizationRule.action);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AuthorizationRule {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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

