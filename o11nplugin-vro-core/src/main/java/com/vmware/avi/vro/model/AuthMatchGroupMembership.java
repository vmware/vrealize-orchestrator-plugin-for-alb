package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * AuthMatchGroupMembership
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AuthMatchGroupMembership")
@VsoFinder(name = Constants.FINDER_VRO_AUTHMATCHGROUPMEMBERSHIP, idAccessor = "getObjectID()")
@Service
public class AuthMatchGroupMembership extends AviRestResource  {
  @JsonProperty("criteria")
  private String criteria = null;

  @JsonProperty("groups")
  @Valid
  private List<String> groups = null;

  
  /**
   * rule match criteria. Enum options - AUTH_MATCH_CONTAINS, AUTH_MATCH_DOES_NOT_CONTAIN, AUTH_MATCH_REGEX.
   * @return criteria
  **/
  @ApiModelProperty(value = "rule match criteria. Enum options - AUTH_MATCH_CONTAINS, AUTH_MATCH_DOES_NOT_CONTAIN, AUTH_MATCH_REGEX.")


 
  @VsoMethod  
  public String getCriteria() {
    return criteria;
  }
    
  @VsoMethod
  public void setCriteria(String criteria) {
    this.criteria = criteria;
  }

  
  public AuthMatchGroupMembership addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }
  
  /**
   * groups of AuthMatchGroupMembership.
   * @return groups
  **/
  @ApiModelProperty(value = "groups of AuthMatchGroupMembership.")


 
  @VsoMethod  
  public List<String> getGroups() {
    return groups;
  }
    
  @VsoMethod
  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  
  public String getObjectID() {
		return "AuthMatchGroupMembership";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthMatchGroupMembership authMatchGroupMembership = (AuthMatchGroupMembership) o;
    return Objects.equals(this.criteria, authMatchGroupMembership.criteria) &&
        Objects.equals(this.groups, authMatchGroupMembership.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteria, groups);
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

