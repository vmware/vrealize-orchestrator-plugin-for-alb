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
 * The AWSSetup is a POJO class extends AviRestResource that used for creating
 * AWSSetup.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AWSSetup")
@VsoFinder(name = Constants.FINDER_VRO_AWSSETUP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AWSSetup extends AviRestResource {
  @JsonProperty("access_key_id")
  @JsonInclude(Include.NON_NULL)
  private String accessKeyId = null;

  @JsonProperty("cc_id")
  @JsonInclude(Include.NON_NULL)
  private String ccId = null;

  @JsonProperty("error_string")
  @JsonInclude(Include.NON_NULL)
  private String errorString = null;

  @JsonProperty("privilege")
  @JsonInclude(Include.NON_NULL)
  private String privilege = null;

  @JsonProperty("region")
  @JsonInclude(Include.NON_NULL)
  private String region = null;

  @JsonProperty("vpc_id")
  @JsonInclude(Include.NON_NULL)
  private String vpcId = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property access_key_id of obj type awssetup field type str  type string.
   * @return accessKeyId
   */
  @VsoMethod
  public String getAccessKeyId() {
    return accessKeyId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property access_key_id of obj type awssetup field type str  type string.
   * @param accessKeyId set the accessKeyId.
   */
  @VsoMethod
  public void setAccessKeyId(String  accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cc_id of obj type awssetup field type str  type string.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cc_id of obj type awssetup field type str  type string.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property error_string of obj type awssetup field type str  type string.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property error_string of obj type awssetup field type str  type string.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
   * @return privilege
   */
  @VsoMethod
  public String getPrivilege() {
    return privilege;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
   * @param privilege set the privilege.
   */
  @VsoMethod
  public void setPrivilege(String  privilege) {
    this.privilege = privilege;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property region of obj type awssetup field type str  type string.
   * @return region
   */
  @VsoMethod
  public String getRegion() {
    return region;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property region of obj type awssetup field type str  type string.
   * @param region set the region.
   */
  @VsoMethod
  public void setRegion(String  region) {
    this.region = region;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.3.
   * @return vpcId
   */
  @VsoMethod
  public String getVpcId() {
    return vpcId;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.3.
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
  AWSSetup objAWSSetup = (AWSSetup) o;
  return   Objects.equals(this.errorString, objAWSSetup.errorString)&&
  Objects.equals(this.region, objAWSSetup.region)&&
  Objects.equals(this.accessKeyId, objAWSSetup.accessKeyId)&&
  Objects.equals(this.privilege, objAWSSetup.privilege)&&
  Objects.equals(this.vpcId, objAWSSetup.vpcId)&&
  Objects.equals(this.ccId, objAWSSetup.ccId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AWSSetup {\n");
      sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
        sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
