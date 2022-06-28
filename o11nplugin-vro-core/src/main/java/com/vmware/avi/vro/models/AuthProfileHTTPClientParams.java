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
 * The AuthProfileHTTPClientParams is a POJO class extends AviRestResource that used for creating
 * AuthProfileHTTPClientParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AuthProfileHTTPClientParams")
@VsoFinder(name = Constants.FINDER_VRO_AUTHPROFILEHTTPCLIENTPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AuthProfileHTTPClientParams extends AviRestResource {
    @JsonProperty("cache_expiration_time")
    @JsonInclude(Include.NON_NULL)
    private Integer cacheExpirationTime = 5;

    @JsonProperty("request_header")
    @JsonInclude(Include.NON_NULL)
    private String requestHeader = null;

    @JsonProperty("require_user_groups")
    @JsonInclude(Include.NON_NULL)
    private List<String> requireUserGroups = null;



  /**
   * This is the getter method this will return the attribute value.
   * The max allowed length of time a clients authentication is cached.
   * Allowed values are 1-30.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return cacheExpirationTime
   */
  @VsoMethod
  public Integer getCacheExpirationTime() {
    return cacheExpirationTime;
  }

  /**
   * This is the setter method to the attribute.
   * The max allowed length of time a clients authentication is cached.
   * Allowed values are 1-30.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param cacheExpirationTime set the cacheExpirationTime.
   */
  @VsoMethod
  public void setCacheExpirationTime(Integer  cacheExpirationTime) {
    this.cacheExpirationTime = cacheExpirationTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Insert an http header.
   * This field is used to define the header name.
   * The value of the header is set to the client's http auth user id.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requestHeader
   */
  @VsoMethod
  public String getRequestHeader() {
    return requestHeader;
  }

  /**
   * This is the setter method to the attribute.
   * Insert an http header.
   * This field is used to define the header name.
   * The value of the header is set to the client's http auth user id.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param requestHeader set the requestHeader.
   */
  @VsoMethod
  public void setRequestHeader(String  requestHeader) {
    this.requestHeader = requestHeader;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A user should be a member of these groups.
   * Each group is defined by the dn.
   * For example, cn=testgroup,ou=groups,dc=example,dc=avinetworks,dc=com.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requireUserGroups
   */
  @VsoMethod
  public List<String> getRequireUserGroups() {
    return requireUserGroups;
  }

  /**
   * This is the setter method. this will set the requireUserGroups
   * A user should be a member of these groups.
   * Each group is defined by the dn.
   * For example, cn=testgroup,ou=groups,dc=example,dc=avinetworks,dc=com.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requireUserGroups
   */
  @VsoMethod
  public void setRequireUserGroups(List<String>  requireUserGroups) {
    this.requireUserGroups = requireUserGroups;
  }

  /**
   * This is the setter method this will set the requireUserGroups
   * A user should be a member of these groups.
   * Each group is defined by the dn.
   * For example, cn=testgroup,ou=groups,dc=example,dc=avinetworks,dc=com.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requireUserGroups
   */
  @VsoMethod
  public AuthProfileHTTPClientParams addRequireUserGroupsItem(String requireUserGroupsItem) {
    if (this.requireUserGroups == null) {
      this.requireUserGroups = new ArrayList<String>();
    }
    this.requireUserGroups.add(requireUserGroupsItem);
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
  AuthProfileHTTPClientParams objAuthProfileHTTPClientParams = (AuthProfileHTTPClientParams) o;
  return   Objects.equals(this.requestHeader, objAuthProfileHTTPClientParams.requestHeader)&&
  Objects.equals(this.cacheExpirationTime, objAuthProfileHTTPClientParams.cacheExpirationTime)&&
  Objects.equals(this.requireUserGroups, objAuthProfileHTTPClientParams.requireUserGroups);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AuthProfileHTTPClientParams {\n");
      sb.append("    cacheExpirationTime: ").append(toIndentedString(cacheExpirationTime)).append("\n");
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

