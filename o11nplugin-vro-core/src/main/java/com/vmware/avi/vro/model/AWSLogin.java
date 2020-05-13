package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * AWSLogin
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AWSLogin")
@VsoFinder(name = Constants.FINDER_VRO_AWSLOGIN, idAccessor = "getObjectID()")
@Service
public class AWSLogin extends AviRestResource  {
  @JsonProperty("access_key_id")
  private String accessKeyId = null;

  @JsonProperty("iam_assume_role")
  private String iamAssumeRole = null;

  @JsonProperty("region")
  private String region = "us-west-1";

  @JsonProperty("secret_access_key")
  private String secretAccessKey = null;

  @JsonProperty("use_iam_roles")
  private Boolean useIamRoles = null;

  @JsonProperty("vpc_id")
  private String vpcId = null;

  
  /**
   * access_key_id of AWSLogin.
   * @return accessKeyId
  **/
  @ApiModelProperty(value = "access_key_id of AWSLogin.")


 
  @VsoMethod  
  public String getAccessKeyId() {
    return accessKeyId;
  }
    
  @VsoMethod
  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  
  /**
   * iam_assume_role of AWSLogin.
   * @return iamAssumeRole
  **/
  @ApiModelProperty(value = "iam_assume_role of AWSLogin.")


 
  @VsoMethod  
  public String getIamAssumeRole() {
    return iamAssumeRole;
  }
    
  @VsoMethod
  public void setIamAssumeRole(String iamAssumeRole) {
    this.iamAssumeRole = iamAssumeRole;
  }

  
  /**
   * AWS region.
   * @return region
  **/
  @ApiModelProperty(value = "AWS region.")


 
  @VsoMethod  
  public String getRegion() {
    return region;
  }
    
  @VsoMethod
  public void setRegion(String region) {
    this.region = region;
  }

  
  /**
   * secret_access_key of AWSLogin.
   * @return secretAccessKey
  **/
  @ApiModelProperty(value = "secret_access_key of AWSLogin.")


 
  @VsoMethod  
  public String getSecretAccessKey() {
    return secretAccessKey;
  }
    
  @VsoMethod
  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }

  
  /**
   * Placeholder for description of property use_iam_roles of obj type AWSLogin field type str  type boolean
   * @return useIamRoles
  **/
  @ApiModelProperty(value = "Placeholder for description of property use_iam_roles of obj type AWSLogin field type str  type boolean")


 
  @VsoMethod  
  public Boolean isUseIamRoles() {
    return useIamRoles;
  }
    
  @VsoMethod
  public void setUseIamRoles(Boolean useIamRoles) {
    this.useIamRoles = useIamRoles;
  }

  
  /**
   * vpc_id of AWSLogin.
   * @return vpcId
  **/
  @ApiModelProperty(value = "vpc_id of AWSLogin.")


 
  @VsoMethod  
  public String getVpcId() {
    return vpcId;
  }
    
  @VsoMethod
  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  
  public String getObjectID() {
		return "AWSLogin";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSLogin awSLogin = (AWSLogin) o;
    return Objects.equals(this.accessKeyId, awSLogin.accessKeyId) &&
        Objects.equals(this.iamAssumeRole, awSLogin.iamAssumeRole) &&
        Objects.equals(this.region, awSLogin.region) &&
        Objects.equals(this.secretAccessKey, awSLogin.secretAccessKey) &&
        Objects.equals(this.useIamRoles, awSLogin.useIamRoles) &&
        Objects.equals(this.vpcId, awSLogin.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, iamAssumeRole, region, secretAccessKey, useIamRoles, vpcId);
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

