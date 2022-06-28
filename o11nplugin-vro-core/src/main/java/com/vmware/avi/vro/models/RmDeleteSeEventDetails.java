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
 * The RmDeleteSeEventDetails is a POJO class extends AviRestResource that used for creating
 * RmDeleteSeEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RmDeleteSeEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_RMDELETESEEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RmDeleteSeEventDetails extends AviRestResource {
    @JsonProperty("cloud_name")
    @JsonInclude(Include.NON_NULL)
    private String cloudName = null;

    @JsonProperty("cloud_uuid")
    @JsonInclude(Include.NON_NULL)
    private String cloudUuid = null;

    @JsonProperty("host_name")
    @JsonInclude(Include.NON_NULL)
    private String hostName = null;

    @JsonProperty("host_uuid")
    @JsonInclude(Include.NON_NULL)
    private String hostUuid = null;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason = null;

    @JsonProperty("se_cookie")
    @JsonInclude(Include.NON_NULL)
    private String seCookie = null;

    @JsonProperty("se_grp_name")
    @JsonInclude(Include.NON_NULL)
    private String seGrpName = null;

    @JsonProperty("se_grp_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seGrpUuid = null;

    @JsonProperty("se_name")
    @JsonInclude(Include.NON_NULL)
    private String seName = null;

    @JsonProperty("se_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seUuid = null;

    @JsonProperty("status_code")
    @JsonInclude(Include.NON_NULL)
    private Integer statusCode = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudName
   */
  @VsoMethod
  public String getCloudName() {
    return cloudName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudName set the cloudName.
   */
  @VsoMethod
  public void setCloudName(String  cloudName) {
    this.cloudName = cloudName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudUuid
   */
  @VsoMethod
  public String getCloudUuid() {
    return cloudUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudUuid set the cloudUuid.
   */
  @VsoMethod
  public void setCloudUuid(String  cloudUuid) {
    this.cloudUuid = cloudUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostName
   */
  @VsoMethod
  public String getHostName() {
    return hostName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostName set the hostName.
   */
  @VsoMethod
  public void setHostName(String  hostName) {
    this.hostName = hostName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostUuid
   */
  @VsoMethod
  public String getHostUuid() {
    return hostUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostUuid set the hostUuid.
   */
  @VsoMethod
  public void setHostUuid(String  hostUuid) {
    this.hostUuid = hostUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seCookie
   */
  @VsoMethod
  public String getSeCookie() {
    return seCookie;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seCookie set the seCookie.
   */
  @VsoMethod
  public void setSeCookie(String  seCookie) {
    this.seCookie = seCookie;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGrpName
   */
  @VsoMethod
  public String getSeGrpName() {
    return seGrpName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGrpName set the seGrpName.
   */
  @VsoMethod
  public void setSeGrpName(String  seGrpName) {
    this.seGrpName = seGrpName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGrpUuid
   */
  @VsoMethod
  public String getSeGrpUuid() {
    return seGrpUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGrpUuid set the seGrpUuid.
   */
  @VsoMethod
  public void setSeGrpUuid(String  seGrpUuid) {
    this.seGrpUuid = seGrpUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seName
   */
  @VsoMethod
  public String getSeName() {
    return seName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seName set the seName.
   */
  @VsoMethod
  public void setSeName(String  seName) {
    this.seName = seName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seUuid
   */
  @VsoMethod
  public String getSeUuid() {
    return seUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seUuid set the seUuid.
   */
  @VsoMethod
  public void setSeUuid(String  seUuid) {
    this.seUuid = seUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return statusCode
   */
  @VsoMethod
  public Integer getStatusCode() {
    return statusCode;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param statusCode set the statusCode.
   */
  @VsoMethod
  public void setStatusCode(Integer  statusCode) {
    this.statusCode = statusCode;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RmDeleteSeEventDetails objRmDeleteSeEventDetails = (RmDeleteSeEventDetails) o;
  return   Objects.equals(this.seName, objRmDeleteSeEventDetails.seName)&&
  Objects.equals(this.seCookie, objRmDeleteSeEventDetails.seCookie)&&
  Objects.equals(this.seUuid, objRmDeleteSeEventDetails.seUuid)&&
  Objects.equals(this.hostUuid, objRmDeleteSeEventDetails.hostUuid)&&
  Objects.equals(this.hostName, objRmDeleteSeEventDetails.hostName)&&
  Objects.equals(this.statusCode, objRmDeleteSeEventDetails.statusCode)&&
  Objects.equals(this.reason, objRmDeleteSeEventDetails.reason)&&
  Objects.equals(this.seGrpUuid, objRmDeleteSeEventDetails.seGrpUuid)&&
  Objects.equals(this.seGrpName, objRmDeleteSeEventDetails.seGrpName)&&
  Objects.equals(this.cloudUuid, objRmDeleteSeEventDetails.cloudUuid)&&
  Objects.equals(this.cloudName, objRmDeleteSeEventDetails.cloudName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RmDeleteSeEventDetails {\n");
      sb.append("    cloudName: ").append(toIndentedString(cloudName)).append("\n");
        sb.append("    cloudUuid: ").append(toIndentedString(cloudUuid)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostUuid: ").append(toIndentedString(hostUuid)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    seCookie: ").append(toIndentedString(seCookie)).append("\n");
        sb.append("    seGrpName: ").append(toIndentedString(seGrpName)).append("\n");
        sb.append("    seGrpUuid: ").append(toIndentedString(seGrpUuid)).append("\n");
        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

