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
 * The WafPolicyPSMGroup is a POJO class extends AviRestResource that used for creating
 * WafPolicyPSMGroup.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafPolicyPSMGroup")
@VsoFinder(name = Constants.FINDER_VRO_WAFPOLICYPSMGROUP, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafPolicyPSMGroup extends AviRestResource {
  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("enable")
  @JsonInclude(Include.NON_NULL)
  private Boolean enable = true;

  @JsonProperty("hit_action")
  @JsonInclude(Include.NON_NULL)
  private String hitAction = "WAF_ACTION_ALLOW_PARAMETER";

  @JsonProperty("is_learning_group")
  @JsonInclude(Include.NON_NULL)
  private Boolean isLearningGroup = false;

  @JsonProperty("locations")
  @JsonInclude(Include.NON_NULL)
  private List<WafPSMLocation> locations = null;

  @JsonProperty("miss_action")
  @JsonInclude(Include.NON_NULL)
  private String missAction = "WAF_ACTION_NO_OP";

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Free-text comment about this group.
   * Field introduced in 18.2.3.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Free-text comment about this group.
   * Field introduced in 18.2.3.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable or disable this waf rule group.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enable
   */
  @VsoMethod
  public Boolean getEnable() {
    return enable;
  }

  /**
   * This is the setter method to the attribute.
   * Enable or disable this waf rule group.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enable set the enable.
   */
  @VsoMethod
  public void setEnable(Boolean  enable) {
    this.enable = enable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If a rule in this group matches the match_value pattern, this action will be executed.
   * Allowed actions are waf_action_no_op and waf_action_allow_parameter.
   * Enum options - WAF_ACTION_NO_OP, WAF_ACTION_BLOCK, WAF_ACTION_ALLOW_PARAMETER.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as WAF_ACTION_ALLOW_PARAMETER.
   * @return hitAction
   */
  @VsoMethod
  public String getHitAction() {
    return hitAction;
  }

  /**
   * This is the setter method to the attribute.
   * If a rule in this group matches the match_value pattern, this action will be executed.
   * Allowed actions are waf_action_no_op and waf_action_allow_parameter.
   * Enum options - WAF_ACTION_NO_OP, WAF_ACTION_BLOCK, WAF_ACTION_ALLOW_PARAMETER.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as WAF_ACTION_ALLOW_PARAMETER.
   * @param hitAction set the hitAction.
   */
  @VsoMethod
  public void setHitAction(String  hitAction) {
    this.hitAction = hitAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field indicates that this group is used for learning.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isLearningGroup
   */
  @VsoMethod
  public Boolean getIsLearningGroup() {
    return isLearningGroup;
  }

  /**
   * This is the setter method to the attribute.
   * This field indicates that this group is used for learning.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isLearningGroup set the isLearningGroup.
   */
  @VsoMethod
  public void setIsLearningGroup(Boolean  isLearningGroup) {
    this.isLearningGroup = isLearningGroup;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Positive security model locations.
   * These are used to partition the application name space.
   * Field introduced in 18.2.3.
   * @return locations
   */
  @VsoMethod
  public List<WafPSMLocation> getLocations() {
    return locations;
  }

  /**
   * This is the setter method. this will set the locations
   * Positive security model locations.
   * These are used to partition the application name space.
   * Field introduced in 18.2.3.
   * @return locations
   */
  @VsoMethod
  public void setLocations(List<WafPSMLocation>  locations) {
    this.locations = locations;
  }

  /**
   * This is the setter method this will set the locations
   * Positive security model locations.
   * These are used to partition the application name space.
   * Field introduced in 18.2.3.
   * @return locations
   */
  @VsoMethod
  public WafPolicyPSMGroup addLocationsItem(WafPSMLocation locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<WafPSMLocation>();
    }
    this.locations.add(locationsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * If a rule in this group does not match the match_value pattern, this action will be executed.
   * Allowed actions are waf_action_no_op and waf_action_block.
   * Enum options - WAF_ACTION_NO_OP, WAF_ACTION_BLOCK, WAF_ACTION_ALLOW_PARAMETER.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as WAF_ACTION_NO_OP.
   * @return missAction
   */
  @VsoMethod
  public String getMissAction() {
    return missAction;
  }

  /**
   * This is the setter method to the attribute.
   * If a rule in this group does not match the match_value pattern, this action will be executed.
   * Allowed actions are waf_action_no_op and waf_action_block.
   * Enum options - WAF_ACTION_NO_OP, WAF_ACTION_BLOCK, WAF_ACTION_ALLOW_PARAMETER.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as WAF_ACTION_NO_OP.
   * @param missAction set the missAction.
   */
  @VsoMethod
  public void setMissAction(String  missAction) {
    this.missAction = missAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User defined name of the group.
   * Field introduced in 18.2.3.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * User defined name of the group.
   * Field introduced in 18.2.3.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.3.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.3.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of this object.
   * Field introduced in 18.2.3.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of this object.
   * Field introduced in 18.2.3.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  WafPolicyPSMGroup objWafPolicyPSMGroup = (WafPolicyPSMGroup) o;
  return   Objects.equals(this.enable, objWafPolicyPSMGroup.enable)&&
  Objects.equals(this.uuid, objWafPolicyPSMGroup.uuid)&&
  Objects.equals(this.description, objWafPolicyPSMGroup.description)&&
  Objects.equals(this.locations, objWafPolicyPSMGroup.locations)&&
  Objects.equals(this.isLearningGroup, objWafPolicyPSMGroup.isLearningGroup)&&
  Objects.equals(this.hitAction, objWafPolicyPSMGroup.hitAction)&&
  Objects.equals(this.tenantRef, objWafPolicyPSMGroup.tenantRef)&&
  Objects.equals(this.missAction, objWafPolicyPSMGroup.missAction)&&
  Objects.equals(this.name, objWafPolicyPSMGroup.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafPolicyPSMGroup {\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    hitAction: ").append(toIndentedString(hitAction)).append("\n");
        sb.append("    isLearningGroup: ").append(toIndentedString(isLearningGroup)).append("\n");
        sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
        sb.append("    missAction: ").append(toIndentedString(missAction)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
