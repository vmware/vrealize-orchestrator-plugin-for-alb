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
 * The UserAccountProfile is a POJO class extends AviRestResource that used for creating
 * UserAccountProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "UserAccountProfile")
@VsoFinder(name = Constants.FINDER_VRO_USERACCOUNTPROFILE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class UserAccountProfile extends AviRestResource {
  @JsonProperty("account_lock_timeout")
  @JsonInclude(Include.NON_NULL)
  private Integer accountLockTimeout = 30;

  @JsonProperty("credentials_timeout_threshold")
  @JsonInclude(Include.NON_NULL)
  private Integer credentialsTimeoutThreshold = 180;

  @JsonProperty("max_concurrent_sessions")
  @JsonInclude(Include.NON_NULL)
  private Integer maxConcurrentSessions = 0;

  @JsonProperty("max_login_failure_count")
  @JsonInclude(Include.NON_NULL)
  private Integer maxLoginFailureCount = 3;

  @JsonProperty("max_password_history_count")
  @JsonInclude(Include.NON_NULL)
  private Integer maxPasswordHistoryCount = 4;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Lock timeout period (in minutes).
   * Default is 30 minutes.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @return accountLockTimeout
   */
  @VsoMethod
  public Integer getAccountLockTimeout() {
    return accountLockTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Lock timeout period (in minutes).
   * Default is 30 minutes.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @param accountLockTimeout set the accountLockTimeout.
   */
  @VsoMethod
  public void setAccountLockTimeout(Integer  accountLockTimeout) {
    this.accountLockTimeout = accountLockTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The time period after which credentials expire.
   * Default is 180 days.
   * Default value when not specified in API or module is interpreted by Avi Controller as 180.
   * @return credentialsTimeoutThreshold
   */
  @VsoMethod
  public Integer getCredentialsTimeoutThreshold() {
    return credentialsTimeoutThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * The time period after which credentials expire.
   * Default is 180 days.
   * Default value when not specified in API or module is interpreted by Avi Controller as 180.
   * @param credentialsTimeoutThreshold set the credentialsTimeoutThreshold.
   */
  @VsoMethod
  public void setCredentialsTimeoutThreshold(Integer  credentialsTimeoutThreshold) {
    this.credentialsTimeoutThreshold = credentialsTimeoutThreshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of concurrent sessions allowed.
   * There are unlimited sessions by default.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return maxConcurrentSessions
   */
  @VsoMethod
  public Integer getMaxConcurrentSessions() {
    return maxConcurrentSessions;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of concurrent sessions allowed.
   * There are unlimited sessions by default.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param maxConcurrentSessions set the maxConcurrentSessions.
   */
  @VsoMethod
  public void setMaxConcurrentSessions(Integer  maxConcurrentSessions) {
    this.maxConcurrentSessions = maxConcurrentSessions;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of login attempts before lockout.
   * Default is 3 attempts.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @return maxLoginFailureCount
   */
  @VsoMethod
  public Integer getMaxLoginFailureCount() {
    return maxLoginFailureCount;
  }

  /**
   * This is the setter method to the attribute.
   * Number of login attempts before lockout.
   * Default is 3 attempts.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @param maxLoginFailureCount set the maxLoginFailureCount.
   */
  @VsoMethod
  public void setMaxLoginFailureCount(Integer  maxLoginFailureCount) {
    this.maxLoginFailureCount = maxLoginFailureCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of passwords to be maintained in the password history.
   * Default is 4 passwords.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @return maxPasswordHistoryCount
   */
  @VsoMethod
  public Integer getMaxPasswordHistoryCount() {
    return maxPasswordHistoryCount;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of passwords to be maintained in the password history.
   * Default is 4 passwords.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @param maxPasswordHistoryCount set the maxPasswordHistoryCount.
   */
  @VsoMethod
  public void setMaxPasswordHistoryCount(Integer  maxPasswordHistoryCount) {
    this.maxPasswordHistoryCount = maxPasswordHistoryCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  UserAccountProfile objUserAccountProfile = (UserAccountProfile) o;
  return   Objects.equals(this.uuid, objUserAccountProfile.uuid)&&
  Objects.equals(this.name, objUserAccountProfile.name)&&
  Objects.equals(this.maxPasswordHistoryCount, objUserAccountProfile.maxPasswordHistoryCount)&&
  Objects.equals(this.maxLoginFailureCount, objUserAccountProfile.maxLoginFailureCount)&&
  Objects.equals(this.accountLockTimeout, objUserAccountProfile.accountLockTimeout)&&
  Objects.equals(this.maxConcurrentSessions, objUserAccountProfile.maxConcurrentSessions)&&
  Objects.equals(this.credentialsTimeoutThreshold, objUserAccountProfile.credentialsTimeoutThreshold);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class UserAccountProfile {\n");
      sb.append("    accountLockTimeout: ").append(toIndentedString(accountLockTimeout)).append("\n");
        sb.append("    credentialsTimeoutThreshold: ").append(toIndentedString(credentialsTimeoutThreshold)).append("\n");
        sb.append("    maxConcurrentSessions: ").append(toIndentedString(maxConcurrentSessions)).append("\n");
        sb.append("    maxLoginFailureCount: ").append(toIndentedString(maxLoginFailureCount)).append("\n");
        sb.append("    maxPasswordHistoryCount: ").append(toIndentedString(maxPasswordHistoryCount)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

