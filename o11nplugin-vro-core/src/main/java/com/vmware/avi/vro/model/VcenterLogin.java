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
 * The VcenterLogin is a POJO class extends AviRestResource that used for creating
 * VcenterLogin.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VcenterLogin")
@VsoFinder(name = Constants.FINDER_VRO_VCENTERLOGIN)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VcenterLogin extends AviRestResource {
  @JsonProperty("cloud_uuid")
  @JsonInclude(Include.NON_NULL)
  private String cloudUuid = null;

  @JsonProperty("password")
  @JsonInclude(Include.NON_NULL)
  private String password = "vmware";

  @JsonProperty("start_ts")
  @JsonInclude(Include.NON_NULL)
  private Integer startTs = null;

  @JsonProperty("username")
  @JsonInclude(Include.NON_NULL)
  private String username = "root";

  @JsonProperty("vcenter_url")
  @JsonInclude(Include.NON_NULL)
  private String vcenterUrl = null;



  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of cloud.
   * @return cloudUuid
   */
  @VsoMethod
  public String getCloudUuid() {
    return cloudUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of cloud.
   * @param cloudUuid set the cloudUuid.
   */
  @VsoMethod
  public void setCloudUuid(String  cloudUuid) {
    this.cloudUuid = cloudUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property password of obj type vcenterlogin field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as vmware.
   * @return password
   */
  @VsoMethod
  public String getPassword() {
    return password;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property password of obj type vcenterlogin field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as vmware.
   * @param password set the password.
   */
  @VsoMethod
  public void setPassword(String  password) {
    this.password = password;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property start_ts of obj type vcenterlogin field type str  type integer.
   * @return startTs
   */
  @VsoMethod
  public Integer getStartTs() {
    return startTs;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property start_ts of obj type vcenterlogin field type str  type integer.
   * @param startTs set the startTs.
   */
  @VsoMethod
  public void setStartTs(Integer  startTs) {
    this.startTs = startTs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property username of obj type vcenterlogin field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as root.
   * @return username
   */
  @VsoMethod
  public String getUsername() {
    return username;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property username of obj type vcenterlogin field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as root.
   * @param username set the username.
   */
  @VsoMethod
  public void setUsername(String  username) {
    this.username = username;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_url of obj type vcenterlogin field type str  type string.
   * @return vcenterUrl
   */
  @VsoMethod
  public String getVcenterUrl() {
    return vcenterUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_url of obj type vcenterlogin field type str  type string.
   * @param vcenterUrl set the vcenterUrl.
   */
  @VsoMethod
  public void setVcenterUrl(String  vcenterUrl) {
    this.vcenterUrl = vcenterUrl;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VcenterLogin objVcenterLogin = (VcenterLogin) o;
  return   Objects.equals(this.vcenterUrl, objVcenterLogin.vcenterUrl)&&
  Objects.equals(this.username, objVcenterLogin.username)&&
  Objects.equals(this.password, objVcenterLogin.password)&&
  Objects.equals(this.startTs, objVcenterLogin.startTs)&&
  Objects.equals(this.cloudUuid, objVcenterLogin.cloudUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VcenterLogin {\n");
      sb.append("    cloudUuid: ").append(toIndentedString(cloudUuid)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    startTs: ").append(toIndentedString(startTs)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    vcenterUrl: ").append(toIndentedString(vcenterUrl)).append("\n");
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
