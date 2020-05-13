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
 * AuthProfileHTTPClientParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AuthProfileHTTPClientParams")
@VsoFinder(name = Constants.FINDER_VRO_AUTHPROFILEHTTPCLIENTPARAMS, idAccessor = "getObjectID()")
@Service
public class AuthProfileHTTPClientParams extends AviRestResource  {
  @JsonProperty("cache_expiration_time")
  private Integer cacheExpirationTime = 5;

  @JsonProperty("group_member_is_full_dn")
  private Boolean groupMemberIsFullDn = null;

  @JsonProperty("request_header")
  private String requestHeader = null;

  @JsonProperty("require_user_groups")
  @Valid
  private List<String> requireUserGroups = null;

  
  /**
   * The max allowed length of time a clients authentication is cached. Allowed values are 1-30.
   * @return cacheExpirationTime
  **/
  @ApiModelProperty(value = "The max allowed length of time a clients authentication is cached. Allowed values are 1-30.")


 
  @VsoMethod  
  public Integer getCacheExpirationTime() {
    return cacheExpirationTime;
  }
    
  @VsoMethod
  public void setCacheExpirationTime(Integer cacheExpirationTime) {
    this.cacheExpirationTime = cacheExpirationTime;
  }

  
  /**
   * Group member entries contain full DNs instead of just user id attribute values. This should now be configured using the LdapDirectorySettings field instead. Field deprecated in 18.2.1.
   * @return groupMemberIsFullDn
  **/
  @ApiModelProperty(value = "Group member entries contain full DNs instead of just user id attribute values. This should now be configured using the LdapDirectorySettings field instead. Field deprecated in 18.2.1.")


 
  @VsoMethod  
  public Boolean isGroupMemberIsFullDn() {
    return groupMemberIsFullDn;
  }
    
  @VsoMethod
  public void setGroupMemberIsFullDn(Boolean groupMemberIsFullDn) {
    this.groupMemberIsFullDn = groupMemberIsFullDn;
  }

  
  /**
   * Insert an HTTP header.  This field is used to define the header name.  The value of the header is set to the client's HTTP Auth user ID.
   * @return requestHeader
  **/
  @ApiModelProperty(value = "Insert an HTTP header.  This field is used to define the header name.  The value of the header is set to the client's HTTP Auth user ID.")


 
  @VsoMethod  
  public String getRequestHeader() {
    return requestHeader;
  }
    
  @VsoMethod
  public void setRequestHeader(String requestHeader) {
    this.requestHeader = requestHeader;
  }

  
  public AuthProfileHTTPClientParams addRequireUserGroupsItem(String requireUserGroupsItem) {
    if (this.requireUserGroups == null) {
      this.requireUserGroups = new ArrayList<String>();
    }
    this.requireUserGroups.add(requireUserGroupsItem);
    return this;
  }
  
  /**
   * A user should be a member of these groups.  Each group is defined by the DN.  For example, CN=testgroup,OU=groups,dc=example,dc=avinetworks,DC=com.
   * @return requireUserGroups
  **/
  @ApiModelProperty(value = "A user should be a member of these groups.  Each group is defined by the DN.  For example, CN=testgroup,OU=groups,dc=example,dc=avinetworks,DC=com.")


 
  @VsoMethod  
  public List<String> getRequireUserGroups() {
    return requireUserGroups;
  }
    
  @VsoMethod
  public void setRequireUserGroups(List<String> requireUserGroups) {
    this.requireUserGroups = requireUserGroups;
  }

  
  public String getObjectID() {
		return "AuthProfileHTTPClientParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthProfileHTTPClientParams authProfileHTTPClientParams = (AuthProfileHTTPClientParams) o;
    return Objects.equals(this.cacheExpirationTime, authProfileHTTPClientParams.cacheExpirationTime) &&
        Objects.equals(this.groupMemberIsFullDn, authProfileHTTPClientParams.groupMemberIsFullDn) &&
        Objects.equals(this.requestHeader, authProfileHTTPClientParams.requestHeader) &&
        Objects.equals(this.requireUserGroups, authProfileHTTPClientParams.requireUserGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheExpirationTime, groupMemberIsFullDn, requestHeader, requireUserGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthProfileHTTPClientParams {\n");
    
    sb.append("    cacheExpirationTime: ").append(toIndentedString(cacheExpirationTime)).append("\n");
    sb.append("    groupMemberIsFullDn: ").append(toIndentedString(groupMemberIsFullDn)).append("\n");
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    requireUserGroups: ").append(toIndentedString(requireUserGroups)).append("\n");
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

