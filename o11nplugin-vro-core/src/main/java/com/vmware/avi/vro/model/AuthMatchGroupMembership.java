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
 * The AuthMatchGroupMembership is a POJO class extends AviRestResource that used for creating
 * AuthMatchGroupMembership.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AuthMatchGroupMembership")
@VsoFinder(name = Constants.FINDER_VRO_AUTHMATCHGROUPMEMBERSHIP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AuthMatchGroupMembership extends AviRestResource {
  @JsonProperty("criteria")
  @JsonInclude(Include.NON_NULL)
  private String criteria = null;

  @JsonProperty("groups")
  @JsonInclude(Include.NON_NULL)
  private List<String> groups = null;



  /**
   * This is the getter method this will return the attribute value.
   * Rule match criteria.
   * Enum options - AUTH_MATCH_CONTAINS, AUTH_MATCH_DOES_NOT_CONTAIN, AUTH_MATCH_REGEX.
   * @return criteria
   */
  @VsoMethod
  public String getCriteria() {
    return criteria;
  }

  /**
   * This is the setter method to the attribute.
   * Rule match criteria.
   * Enum options - AUTH_MATCH_CONTAINS, AUTH_MATCH_DOES_NOT_CONTAIN, AUTH_MATCH_REGEX.
   * @param criteria set the criteria.
   */
  @VsoMethod
  public void setCriteria(String  criteria) {
    this.criteria = criteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property groups of obj type authmatchgroupmembership field type str  type array.
   * @return groups
   */
  @VsoMethod
  public List<String> getGroups() {
    return groups;
  }

  /**
   * This is the setter method. this will set the groups
   * Placeholder for description of property groups of obj type authmatchgroupmembership field type str  type array.
   * @return groups
   */
  @VsoMethod
  public void setGroups(List<String>  groups) {
    this.groups = groups;
  }

  /**
   * This is the setter method this will set the groups
   * Placeholder for description of property groups of obj type authmatchgroupmembership field type str  type array.
   * @return groups
   */
  @VsoMethod
  public AuthMatchGroupMembership addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
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
  AuthMatchGroupMembership objAuthMatchGroupMembership = (AuthMatchGroupMembership) o;
  return   Objects.equals(this.groups, objAuthMatchGroupMembership.groups)&&
  Objects.equals(this.criteria, objAuthMatchGroupMembership.criteria);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AuthMatchGroupMembership {\n");
      sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
