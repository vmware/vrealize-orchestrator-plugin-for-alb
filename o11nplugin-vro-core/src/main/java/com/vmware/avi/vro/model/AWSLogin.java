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
 * The AWSLogin is a POJO class extends AviRestResource that used for creating
 * AWSLogin.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AWSLogin")
@VsoFinder(name = Constants.FINDER_VRO_AWSLOGIN)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AWSLogin extends AviRestResource {
  @JsonProperty("access_key_id")
  @JsonInclude(Include.NON_NULL)
  private String accessKeyId = null;

  @JsonProperty("iam_assume_role")
  @JsonInclude(Include.NON_NULL)
  private String iamAssumeRole = null;

  @JsonProperty("region")
  @JsonInclude(Include.NON_NULL)
  private String region = "us-west-1";

  @JsonProperty("secret_access_key")
  @JsonInclude(Include.NON_NULL)
  private String secretAccessKey = null;

  @JsonProperty("use_iam_roles")
  @JsonInclude(Include.NON_NULL)
  private Boolean useIamRoles = null;

  @JsonProperty("vpc_id")
  @JsonInclude(Include.NON_NULL)
  private String vpcId = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property access_key_id of obj type awslogin field type str  type string.
   * @return accessKeyId
   */
  @VsoMethod
  public String getAccessKeyId() {
    return accessKeyId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property access_key_id of obj type awslogin field type str  type string.
   * @param accessKeyId set the accessKeyId.
   */
  @VsoMethod
  public void setAccessKeyId(String  accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property iam_assume_role of obj type awslogin field type str  type string.
   * @return iamAssumeRole
   */
  @VsoMethod
  public String getIamAssumeRole() {
    return iamAssumeRole;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property iam_assume_role of obj type awslogin field type str  type string.
   * @param iamAssumeRole set the iamAssumeRole.
   */
  @VsoMethod
  public void setIamAssumeRole(String  iamAssumeRole) {
    this.iamAssumeRole = iamAssumeRole;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Aws region.
   * Default value when not specified in API or module is interpreted by Avi Controller as us-west-1.
   * @return region
   */
  @VsoMethod
  public String getRegion() {
    return region;
  }

  /**
   * This is the setter method to the attribute.
   * Aws region.
   * Default value when not specified in API or module is interpreted by Avi Controller as us-west-1.
   * @param region set the region.
   */
  @VsoMethod
  public void setRegion(String  region) {
    this.region = region;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property secret_access_key of obj type awslogin field type str  type string.
   * @return secretAccessKey
   */
  @VsoMethod
  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property secret_access_key of obj type awslogin field type str  type string.
   * @param secretAccessKey set the secretAccessKey.
   */
  @VsoMethod
  public void setSecretAccessKey(String  secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property use_iam_roles of obj type awslogin field type str  type boolean.
   * @return useIamRoles
   */
  @VsoMethod
  public Boolean getUseIamRoles() {
    return useIamRoles;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property use_iam_roles of obj type awslogin field type str  type boolean.
   * @param useIamRoles set the useIamRoles.
   */
  @VsoMethod
  public void setUseIamRoles(Boolean  useIamRoles) {
    this.useIamRoles = useIamRoles;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vpc_id of obj type awslogin field type str  type string.
   * @return vpcId
   */
  @VsoMethod
  public String getVpcId() {
    return vpcId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vpc_id of obj type awslogin field type str  type string.
   * @param vpcId set the vpcId.
   */
  @VsoMethod
  public void setVpcId(String  vpcId) {
    this.vpcId = vpcId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AWSLogin objAWSLogin = (AWSLogin) o;
  return   Objects.equals(this.useIamRoles, objAWSLogin.useIamRoles)&&
  Objects.equals(this.region, objAWSLogin.region)&&
  Objects.equals(this.secretAccessKey, objAWSLogin.secretAccessKey)&&
  Objects.equals(this.accessKeyId, objAWSLogin.accessKeyId)&&
  Objects.equals(this.iamAssumeRole, objAWSLogin.iamAssumeRole)&&
  Objects.equals(this.vpcId, objAWSLogin.vpcId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AWSLogin {\n");
      sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
        sb.append("    iamAssumeRole: ").append(toIndentedString(iamAssumeRole)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
        sb.append("    useIamRoles: ").append(toIndentedString(useIamRoles)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
