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
 * LdapDirectorySettings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "LdapDirectorySettings")
@VsoFinder(name = Constants.FINDER_VRO_LDAPDIRECTORYSETTINGS, idAccessor = "getObjectID()")
@Service
public class LdapDirectorySettings extends AviRestResource  {
  @JsonProperty("admin_bind_dn")
  private String adminBindDn = null;

  @JsonProperty("group_filter")
  private String groupFilter = "(objectClass=*)";

  @JsonProperty("group_member_attribute")
  private String groupMemberAttribute = "member";

  @JsonProperty("group_member_is_full_dn")
  private Boolean groupMemberIsFullDn = true;

  @JsonProperty("group_search_dn")
  private String groupSearchDn = null;

  @JsonProperty("group_search_scope")
  private String groupSearchScope = "AUTH_LDAP_SCOPE_SUBTREE";

  @JsonProperty("ignore_referrals")
  private Boolean ignoreReferrals = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("user_attributes")
  @Valid
  private List<String> userAttributes = null;

  @JsonProperty("user_id_attribute")
  private String userIdAttribute = null;

  @JsonProperty("user_search_dn")
  private String userSearchDn = null;

  @JsonProperty("user_search_scope")
  private String userSearchScope = "AUTH_LDAP_SCOPE_ONE";

  
  /**
   * LDAP Admin User DN. Administrator credentials are required to search for users under user search DN or groups under group search DN.
   * @return adminBindDn
  **/
  @ApiModelProperty(value = "LDAP Admin User DN. Administrator credentials are required to search for users under user search DN or groups under group search DN.")


 
  @VsoMethod  
  public String getAdminBindDn() {
    return adminBindDn;
  }
    
  @VsoMethod
  public void setAdminBindDn(String adminBindDn) {
    this.adminBindDn = adminBindDn;
  }

  
  /**
   * Group filter is used to identify groups during search.
   * @return groupFilter
  **/
  @ApiModelProperty(value = "Group filter is used to identify groups during search.")


 
  @VsoMethod  
  public String getGroupFilter() {
    return groupFilter;
  }
    
  @VsoMethod
  public void setGroupFilter(String groupFilter) {
    this.groupFilter = groupFilter;
  }

  
  /**
   * LDAP group attribute that identifies each of the group members.
   * @return groupMemberAttribute
  **/
  @ApiModelProperty(value = "LDAP group attribute that identifies each of the group members.")


 
  @VsoMethod  
  public String getGroupMemberAttribute() {
    return groupMemberAttribute;
  }
    
  @VsoMethod
  public void setGroupMemberAttribute(String groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
  }

  
  /**
   * Group member entries contain full DNs instead of just user id attribute values.
   * @return groupMemberIsFullDn
  **/
  @ApiModelProperty(value = "Group member entries contain full DNs instead of just user id attribute values.")


 
  @VsoMethod  
  public Boolean isGroupMemberIsFullDn() {
    return groupMemberIsFullDn;
  }
    
  @VsoMethod
  public void setGroupMemberIsFullDn(Boolean groupMemberIsFullDn) {
    this.groupMemberIsFullDn = groupMemberIsFullDn;
  }

  
  /**
   * LDAP group search DN is the root of search for a given group in the LDAP directory. Only matching groups present in this LDAP directory sub-tree will be checked for user membership.
   * @return groupSearchDn
  **/
  @ApiModelProperty(value = "LDAP group search DN is the root of search for a given group in the LDAP directory. Only matching groups present in this LDAP directory sub-tree will be checked for user membership.")


 
  @VsoMethod  
  public String getGroupSearchDn() {
    return groupSearchDn;
  }
    
  @VsoMethod
  public void setGroupSearchDn(String groupSearchDn) {
    this.groupSearchDn = groupSearchDn;
  }

  
  /**
   * LDAP group search scope defines how deep to search for the group starting from the group search DN. Enum options - AUTH_LDAP_SCOPE_BASE, AUTH_LDAP_SCOPE_ONE, AUTH_LDAP_SCOPE_SUBTREE.
   * @return groupSearchScope
  **/
  @ApiModelProperty(value = "LDAP group search scope defines how deep to search for the group starting from the group search DN. Enum options - AUTH_LDAP_SCOPE_BASE, AUTH_LDAP_SCOPE_ONE, AUTH_LDAP_SCOPE_SUBTREE.")


 
  @VsoMethod  
  public String getGroupSearchScope() {
    return groupSearchScope;
  }
    
  @VsoMethod
  public void setGroupSearchScope(String groupSearchScope) {
    this.groupSearchScope = groupSearchScope;
  }

  
  /**
   * During user or group search, ignore searching referrals.
   * @return ignoreReferrals
  **/
  @ApiModelProperty(value = "During user or group search, ignore searching referrals.")


 
  @VsoMethod  
  public Boolean isIgnoreReferrals() {
    return ignoreReferrals;
  }
    
  @VsoMethod
  public void setIgnoreReferrals(Boolean ignoreReferrals) {
    this.ignoreReferrals = ignoreReferrals;
  }

  
  /**
   * LDAP Admin User Password.
   * @return password
  **/
  @ApiModelProperty(value = "LDAP Admin User Password.")


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  public LdapDirectorySettings addUserAttributesItem(String userAttributesItem) {
    if (this.userAttributes == null) {
      this.userAttributes = new ArrayList<String>();
    }
    this.userAttributes.add(userAttributesItem);
    return this;
  }
  
  /**
   * LDAP user attributes to fetch on a successful user bind.
   * @return userAttributes
  **/
  @ApiModelProperty(value = "LDAP user attributes to fetch on a successful user bind.")


 
  @VsoMethod  
  public List<String> getUserAttributes() {
    return userAttributes;
  }
    
  @VsoMethod
  public void setUserAttributes(List<String> userAttributes) {
    this.userAttributes = userAttributes;
  }

  
  /**
   * LDAP user id attribute is the login attribute that uniquely identifies a single user record.
   * @return userIdAttribute
  **/
  @ApiModelProperty(value = "LDAP user id attribute is the login attribute that uniquely identifies a single user record.")


 
  @VsoMethod  
  public String getUserIdAttribute() {
    return userIdAttribute;
  }
    
  @VsoMethod
  public void setUserIdAttribute(String userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
  }

  
  /**
   * LDAP user search DN is the root of search for a given user in the LDAP directory. Only user records present in this LDAP directory sub-tree will be validated.
   * @return userSearchDn
  **/
  @ApiModelProperty(value = "LDAP user search DN is the root of search for a given user in the LDAP directory. Only user records present in this LDAP directory sub-tree will be validated.")


 
  @VsoMethod  
  public String getUserSearchDn() {
    return userSearchDn;
  }
    
  @VsoMethod
  public void setUserSearchDn(String userSearchDn) {
    this.userSearchDn = userSearchDn;
  }

  
  /**
   * LDAP user search scope defines how deep to search for the user starting from user search DN. Enum options - AUTH_LDAP_SCOPE_BASE, AUTH_LDAP_SCOPE_ONE, AUTH_LDAP_SCOPE_SUBTREE.
   * @return userSearchScope
  **/
  @ApiModelProperty(value = "LDAP user search scope defines how deep to search for the user starting from user search DN. Enum options - AUTH_LDAP_SCOPE_BASE, AUTH_LDAP_SCOPE_ONE, AUTH_LDAP_SCOPE_SUBTREE.")


 
  @VsoMethod  
  public String getUserSearchScope() {
    return userSearchScope;
  }
    
  @VsoMethod
  public void setUserSearchScope(String userSearchScope) {
    this.userSearchScope = userSearchScope;
  }

  
  public String getObjectID() {
		return "LdapDirectorySettings";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LdapDirectorySettings ldapDirectorySettings = (LdapDirectorySettings) o;
    return Objects.equals(this.adminBindDn, ldapDirectorySettings.adminBindDn) &&
        Objects.equals(this.groupFilter, ldapDirectorySettings.groupFilter) &&
        Objects.equals(this.groupMemberAttribute, ldapDirectorySettings.groupMemberAttribute) &&
        Objects.equals(this.groupMemberIsFullDn, ldapDirectorySettings.groupMemberIsFullDn) &&
        Objects.equals(this.groupSearchDn, ldapDirectorySettings.groupSearchDn) &&
        Objects.equals(this.groupSearchScope, ldapDirectorySettings.groupSearchScope) &&
        Objects.equals(this.ignoreReferrals, ldapDirectorySettings.ignoreReferrals) &&
        Objects.equals(this.password, ldapDirectorySettings.password) &&
        Objects.equals(this.userAttributes, ldapDirectorySettings.userAttributes) &&
        Objects.equals(this.userIdAttribute, ldapDirectorySettings.userIdAttribute) &&
        Objects.equals(this.userSearchDn, ldapDirectorySettings.userSearchDn) &&
        Objects.equals(this.userSearchScope, ldapDirectorySettings.userSearchScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminBindDn, groupFilter, groupMemberAttribute, groupMemberIsFullDn, groupSearchDn, groupSearchScope, ignoreReferrals, password, userAttributes, userIdAttribute, userSearchDn, userSearchScope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapDirectorySettings {\n");
    
    sb.append("    adminBindDn: ").append(toIndentedString(adminBindDn)).append("\n");
    sb.append("    groupFilter: ").append(toIndentedString(groupFilter)).append("\n");
    sb.append("    groupMemberAttribute: ").append(toIndentedString(groupMemberAttribute)).append("\n");
    sb.append("    groupMemberIsFullDn: ").append(toIndentedString(groupMemberIsFullDn)).append("\n");
    sb.append("    groupSearchDn: ").append(toIndentedString(groupSearchDn)).append("\n");
    sb.append("    groupSearchScope: ").append(toIndentedString(groupSearchScope)).append("\n");
    sb.append("    ignoreReferrals: ").append(toIndentedString(ignoreReferrals)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    userAttributes: ").append(toIndentedString(userAttributes)).append("\n");
    sb.append("    userIdAttribute: ").append(toIndentedString(userIdAttribute)).append("\n");
    sb.append("    userSearchDn: ").append(toIndentedString(userSearchDn)).append("\n");
    sb.append("    userSearchScope: ").append(toIndentedString(userSearchScope)).append("\n");
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

