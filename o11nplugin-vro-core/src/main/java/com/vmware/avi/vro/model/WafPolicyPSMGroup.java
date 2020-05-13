package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.WafPSMLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * WafPolicyPSMGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafPolicyPSMGroup")
@VsoFinder(name = Constants.FINDER_VRO_WAFPOLICYPSMGROUP, idAccessor = "getObjectID()")
@Service
public class WafPolicyPSMGroup extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("enable")
  private Boolean enable = true;

  @JsonProperty("hit_action")
  private String hitAction = "WAF_ACTION_ALLOW_PARAMETER";

  @JsonProperty("is_learning_group")
  private Boolean isLearningGroup = null;

  @JsonProperty("locations")
  @Valid
  private List<WafPSMLocation> locations = null;

  @JsonProperty("miss_action")
  private String missAction = "WAF_ACTION_NO_OP";

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * Free-text comment about this group. Field introduced in 18.2.3.
   * @return description
  **/
  @ApiModelProperty(value = "Free-text comment about this group. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Enable or disable this WAF rule group. Field introduced in 18.2.3.
   * @return enable
  **/
  @ApiModelProperty(value = "Enable or disable this WAF rule group. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isEnable() {
    return enable;
  }
    
  @VsoMethod
  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  
  /**
   * If a rule in this group matches the match_value pattern, this action will be executed. Allowed actions are WAF_ACTION_NO_OP and WAF_ACTION_ALLOW_PARAMETER. Enum options - WAF_ACTION_NO_OP, WAF_ACTION_BLOCK, WAF_ACTION_ALLOW_PARAMETER. Field introduced in 18.2.3.
   * @return hitAction
  **/
  @ApiModelProperty(value = "If a rule in this group matches the match_value pattern, this action will be executed. Allowed actions are WAF_ACTION_NO_OP and WAF_ACTION_ALLOW_PARAMETER. Enum options - WAF_ACTION_NO_OP, WAF_ACTION_BLOCK, WAF_ACTION_ALLOW_PARAMETER. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getHitAction() {
    return hitAction;
  }
    
  @VsoMethod
  public void setHitAction(String hitAction) {
    this.hitAction = hitAction;
  }

  
  /**
   * This field indicates that this group is used for learning. Field introduced in 18.2.3.
   * @return isLearningGroup
  **/
  @ApiModelProperty(value = "This field indicates that this group is used for learning. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isIsLearningGroup() {
    return isLearningGroup;
  }
    
  @VsoMethod
  public void setIsLearningGroup(Boolean isLearningGroup) {
    this.isLearningGroup = isLearningGroup;
  }

  
  public WafPolicyPSMGroup addLocationsItem(WafPSMLocation locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<WafPSMLocation>();
    }
    this.locations.add(locationsItem);
    return this;
  }
  
  /**
   * Positive Security Model locations. These are used to partition the application name space. Field introduced in 18.2.3.
   * @return locations
  **/
  @ApiModelProperty(value = "Positive Security Model locations. These are used to partition the application name space. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public List<WafPSMLocation> getLocations() {
    return locations;
  }
    
  @VsoMethod
  public void setLocations(List<WafPSMLocation> locations) {
    this.locations = locations;
  }

  
  /**
   * If a rule in this group does not match the match_value pattern, this action will be executed. Allowed actions are WAF_ACTION_NO_OP and WAF_ACTION_BLOCK. Enum options - WAF_ACTION_NO_OP, WAF_ACTION_BLOCK, WAF_ACTION_ALLOW_PARAMETER. Field introduced in 18.2.3.
   * @return missAction
  **/
  @ApiModelProperty(value = "If a rule in this group does not match the match_value pattern, this action will be executed. Allowed actions are WAF_ACTION_NO_OP and WAF_ACTION_BLOCK. Enum options - WAF_ACTION_NO_OP, WAF_ACTION_BLOCK, WAF_ACTION_ALLOW_PARAMETER. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getMissAction() {
    return missAction;
  }
    
  @VsoMethod
  public void setMissAction(String missAction) {
    this.missAction = missAction;
  }

  
  /**
   * User defined name of the group. Field introduced in 18.2.3.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "User defined name of the group. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Tenant that this object belongs to. It is a reference to an object of type Tenant. Field introduced in 18.2.3.
   * @return tenantRef
  **/
  @ApiModelProperty(value = "Tenant that this object belongs to. It is a reference to an object of type Tenant. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * UUID of this object. Field introduced in 18.2.3.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of this object. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "WafPolicyPSMGroup";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafPolicyPSMGroup wafPolicyPSMGroup = (WafPolicyPSMGroup) o;
    return Objects.equals(this.lastModified, wafPolicyPSMGroup.lastModified) &&
        Objects.equals(this.description, wafPolicyPSMGroup.description) &&
        Objects.equals(this.enable, wafPolicyPSMGroup.enable) &&
        Objects.equals(this.hitAction, wafPolicyPSMGroup.hitAction) &&
        Objects.equals(this.isLearningGroup, wafPolicyPSMGroup.isLearningGroup) &&
        Objects.equals(this.locations, wafPolicyPSMGroup.locations) &&
        Objects.equals(this.missAction, wafPolicyPSMGroup.missAction) &&
        Objects.equals(this.name, wafPolicyPSMGroup.name) &&
        Objects.equals(this.tenantRef, wafPolicyPSMGroup.tenantRef) &&
        Objects.equals(this.url, wafPolicyPSMGroup.url) &&
        Objects.equals(this.uuid, wafPolicyPSMGroup.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, description, enable, hitAction, isLearningGroup, locations, missAction, name, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafPolicyPSMGroup {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    hitAction: ").append(toIndentedString(hitAction)).append("\n");
    sb.append("    isLearningGroup: ").append(toIndentedString(isLearningGroup)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    missAction: ").append(toIndentedString(missAction)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

