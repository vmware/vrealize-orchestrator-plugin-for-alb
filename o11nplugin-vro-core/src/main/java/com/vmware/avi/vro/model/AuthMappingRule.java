package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AuthMatchAttribute;
import com.vmware.avi.vro.model.AuthMatchGroupMembership;
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
 * AuthMappingRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AuthMappingRule")
@VsoFinder(name = Constants.FINDER_VRO_AUTHMAPPINGRULE, idAccessor = "getObjectID()")
@Service
public class AuthMappingRule extends AviRestResource  {
  @JsonProperty("assign_policy")
  private String assignPolicy = null;

  @JsonProperty("assign_role")
  private String assignRole = null;

  @JsonProperty("assign_tenant")
  private String assignTenant = null;

  @JsonProperty("attribute_match")
  private AuthMatchAttribute attributeMatch = null;

  @JsonProperty("group_match")
  private AuthMatchGroupMembership groupMatch = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("is_superuser")
  private Boolean isSuperuser = null;

  @JsonProperty("object_access_policy_refs")
  @Valid
  private List<String> objectAccessPolicyRefs = null;

  @JsonProperty("policy_attribute_name")
  private String policyAttributeName = null;

  @JsonProperty("role_attribute_name")
  private String roleAttributeName = null;

  @JsonProperty("role_refs")
  @Valid
  private List<String> roleRefs = null;

  @JsonProperty("tenant_attribute_name")
  private String tenantAttributeName = null;

  @JsonProperty("tenant_refs")
  @Valid
  private List<String> tenantRefs = null;

  
  /**
   * Assignment rule for the Object Access Policy. Enum options - ASSIGN_ALL, ASSIGN_FROM_SELECT_LIST, ASSIGN_MATCHING_GROUP_NAME, ASSIGN_MATCHING_ATTRIBUTE_VALUE, ASSIGN_MATCHING_GROUP_REGEX, ASSIGN_MATCHING_ATTRIBUTE_REGEX. Field introduced in 18.2.7, 20.1.1.
   * @return assignPolicy
  **/
  @ApiModelProperty(value = "Assignment rule for the Object Access Policy. Enum options - ASSIGN_ALL, ASSIGN_FROM_SELECT_LIST, ASSIGN_MATCHING_GROUP_NAME, ASSIGN_MATCHING_ATTRIBUTE_VALUE, ASSIGN_MATCHING_GROUP_REGEX, ASSIGN_MATCHING_ATTRIBUTE_REGEX. Field introduced in 18.2.7, 20.1.1.")


 
  @VsoMethod  
  public String getAssignPolicy() {
    return assignPolicy;
  }
    
  @VsoMethod
  public void setAssignPolicy(String assignPolicy) {
    this.assignPolicy = assignPolicy;
  }

  
  /**
   *  Enum options - ASSIGN_ALL, ASSIGN_FROM_SELECT_LIST, ASSIGN_MATCHING_GROUP_NAME, ASSIGN_MATCHING_ATTRIBUTE_VALUE, ASSIGN_MATCHING_GROUP_REGEX, ASSIGN_MATCHING_ATTRIBUTE_REGEX.
   * @return assignRole
  **/
  @ApiModelProperty(value = " Enum options - ASSIGN_ALL, ASSIGN_FROM_SELECT_LIST, ASSIGN_MATCHING_GROUP_NAME, ASSIGN_MATCHING_ATTRIBUTE_VALUE, ASSIGN_MATCHING_GROUP_REGEX, ASSIGN_MATCHING_ATTRIBUTE_REGEX.")


 
  @VsoMethod  
  public String getAssignRole() {
    return assignRole;
  }
    
  @VsoMethod
  public void setAssignRole(String assignRole) {
    this.assignRole = assignRole;
  }

  
  /**
   *  Enum options - ASSIGN_ALL, ASSIGN_FROM_SELECT_LIST, ASSIGN_MATCHING_GROUP_NAME, ASSIGN_MATCHING_ATTRIBUTE_VALUE, ASSIGN_MATCHING_GROUP_REGEX, ASSIGN_MATCHING_ATTRIBUTE_REGEX.
   * @return assignTenant
  **/
  @ApiModelProperty(value = " Enum options - ASSIGN_ALL, ASSIGN_FROM_SELECT_LIST, ASSIGN_MATCHING_GROUP_NAME, ASSIGN_MATCHING_ATTRIBUTE_VALUE, ASSIGN_MATCHING_GROUP_REGEX, ASSIGN_MATCHING_ATTRIBUTE_REGEX.")


 
  @VsoMethod  
  public String getAssignTenant() {
    return assignTenant;
  }
    
  @VsoMethod
  public void setAssignTenant(String assignTenant) {
    this.assignTenant = assignTenant;
  }

  
  /**
   * Placeholder for description of property attribute_match of obj type AuthMappingRule field type str  type object
   * @return attributeMatch
  **/
  @ApiModelProperty(value = "Placeholder for description of property attribute_match of obj type AuthMappingRule field type str  type object")

  @Valid

 
  @VsoMethod  
  public AuthMatchAttribute getAttributeMatch() {
    return attributeMatch;
  }
    
  @VsoMethod
  public void setAttributeMatch(AuthMatchAttribute attributeMatch) {
    this.attributeMatch = attributeMatch;
  }

  
  /**
   * Placeholder for description of property group_match of obj type AuthMappingRule field type str  type object
   * @return groupMatch
  **/
  @ApiModelProperty(value = "Placeholder for description of property group_match of obj type AuthMappingRule field type str  type object")

  @Valid

 
  @VsoMethod  
  public AuthMatchGroupMembership getGroupMatch() {
    return groupMatch;
  }
    
  @VsoMethod
  public void setGroupMatch(AuthMatchGroupMembership groupMatch) {
    this.groupMatch = groupMatch;
  }

  
  /**
   * Number of index.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Number of index.")
  @NotNull


 
  @VsoMethod  
  public Integer getIndex() {
    return index;
  }
    
  @VsoMethod
  public void setIndex(Integer index) {
    this.index = index;
  }

  
  /**
   * Placeholder for description of property is_superuser of obj type AuthMappingRule field type str  type boolean
   * @return isSuperuser
  **/
  @ApiModelProperty(value = "Placeholder for description of property is_superuser of obj type AuthMappingRule field type str  type boolean")


 
  @VsoMethod  
  public Boolean isIsSuperuser() {
    return isSuperuser;
  }
    
  @VsoMethod
  public void setIsSuperuser(Boolean isSuperuser) {
    this.isSuperuser = isSuperuser;
  }

  
  public AuthMappingRule addObjectAccessPolicyRefsItem(String objectAccessPolicyRefsItem) {
    if (this.objectAccessPolicyRefs == null) {
      this.objectAccessPolicyRefs = new ArrayList<String>();
    }
    this.objectAccessPolicyRefs.add(objectAccessPolicyRefsItem);
    return this;
  }
  
  /**
   * Object Access Policies to assign to user on successful match. It is a reference to an object of type ObjectAccessPolicy. Field introduced in 18.2.7, 20.1.1.
   * @return objectAccessPolicyRefs
  **/
  @ApiModelProperty(value = "Object Access Policies to assign to user on successful match. It is a reference to an object of type ObjectAccessPolicy. Field introduced in 18.2.7, 20.1.1.")


 
  @VsoMethod  
  public List<String> getObjectAccessPolicyRefs() {
    return objectAccessPolicyRefs;
  }
    
  @VsoMethod
  public void setObjectAccessPolicyRefs(List<String> objectAccessPolicyRefs) {
    this.objectAccessPolicyRefs = objectAccessPolicyRefs;
  }

  
  /**
   * Attribute name for Object Access Policy assignment. Field introduced in 18.2.7, 20.1.1.
   * @return policyAttributeName
  **/
  @ApiModelProperty(value = "Attribute name for Object Access Policy assignment. Field introduced in 18.2.7, 20.1.1.")


 
  @VsoMethod  
  public String getPolicyAttributeName() {
    return policyAttributeName;
  }
    
  @VsoMethod
  public void setPolicyAttributeName(String policyAttributeName) {
    this.policyAttributeName = policyAttributeName;
  }

  
  /**
   * role_attribute_name of AuthMappingRule.
   * @return roleAttributeName
  **/
  @ApiModelProperty(value = "role_attribute_name of AuthMappingRule.")


 
  @VsoMethod  
  public String getRoleAttributeName() {
    return roleAttributeName;
  }
    
  @VsoMethod
  public void setRoleAttributeName(String roleAttributeName) {
    this.roleAttributeName = roleAttributeName;
  }

  
  public AuthMappingRule addRoleRefsItem(String roleRefsItem) {
    if (this.roleRefs == null) {
      this.roleRefs = new ArrayList<String>();
    }
    this.roleRefs.add(roleRefsItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type Role.
   * @return roleRefs
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Role.")


 
  @VsoMethod  
  public List<String> getRoleRefs() {
    return roleRefs;
  }
    
  @VsoMethod
  public void setRoleRefs(List<String> roleRefs) {
    this.roleRefs = roleRefs;
  }

  
  /**
   * tenant_attribute_name of AuthMappingRule.
   * @return tenantAttributeName
  **/
  @ApiModelProperty(value = "tenant_attribute_name of AuthMappingRule.")


 
  @VsoMethod  
  public String getTenantAttributeName() {
    return tenantAttributeName;
  }
    
  @VsoMethod
  public void setTenantAttributeName(String tenantAttributeName) {
    this.tenantAttributeName = tenantAttributeName;
  }

  
  public AuthMappingRule addTenantRefsItem(String tenantRefsItem) {
    if (this.tenantRefs == null) {
      this.tenantRefs = new ArrayList<String>();
    }
    this.tenantRefs.add(tenantRefsItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRefs
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
  @VsoMethod  
  public List<String> getTenantRefs() {
    return tenantRefs;
  }
    
  @VsoMethod
  public void setTenantRefs(List<String> tenantRefs) {
    this.tenantRefs = tenantRefs;
  }

  
  public String getObjectID() {
		return "AuthMappingRule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthMappingRule authMappingRule = (AuthMappingRule) o;
    return Objects.equals(this.assignPolicy, authMappingRule.assignPolicy) &&
        Objects.equals(this.assignRole, authMappingRule.assignRole) &&
        Objects.equals(this.assignTenant, authMappingRule.assignTenant) &&
        Objects.equals(this.attributeMatch, authMappingRule.attributeMatch) &&
        Objects.equals(this.groupMatch, authMappingRule.groupMatch) &&
        Objects.equals(this.index, authMappingRule.index) &&
        Objects.equals(this.isSuperuser, authMappingRule.isSuperuser) &&
        Objects.equals(this.objectAccessPolicyRefs, authMappingRule.objectAccessPolicyRefs) &&
        Objects.equals(this.policyAttributeName, authMappingRule.policyAttributeName) &&
        Objects.equals(this.roleAttributeName, authMappingRule.roleAttributeName) &&
        Objects.equals(this.roleRefs, authMappingRule.roleRefs) &&
        Objects.equals(this.tenantAttributeName, authMappingRule.tenantAttributeName) &&
        Objects.equals(this.tenantRefs, authMappingRule.tenantRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignPolicy, assignRole, assignTenant, attributeMatch, groupMatch, index, isSuperuser, objectAccessPolicyRefs, policyAttributeName, roleAttributeName, roleRefs, tenantAttributeName, tenantRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthMappingRule {\n");
    
    sb.append("    assignPolicy: ").append(toIndentedString(assignPolicy)).append("\n");
    sb.append("    assignRole: ").append(toIndentedString(assignRole)).append("\n");
    sb.append("    assignTenant: ").append(toIndentedString(assignTenant)).append("\n");
    sb.append("    attributeMatch: ").append(toIndentedString(attributeMatch)).append("\n");
    sb.append("    groupMatch: ").append(toIndentedString(groupMatch)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    isSuperuser: ").append(toIndentedString(isSuperuser)).append("\n");
    sb.append("    objectAccessPolicyRefs: ").append(toIndentedString(objectAccessPolicyRefs)).append("\n");
    sb.append("    policyAttributeName: ").append(toIndentedString(policyAttributeName)).append("\n");
    sb.append("    roleAttributeName: ").append(toIndentedString(roleAttributeName)).append("\n");
    sb.append("    roleRefs: ").append(toIndentedString(roleRefs)).append("\n");
    sb.append("    tenantAttributeName: ").append(toIndentedString(tenantAttributeName)).append("\n");
    sb.append("    tenantRefs: ").append(toIndentedString(tenantRefs)).append("\n");
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

