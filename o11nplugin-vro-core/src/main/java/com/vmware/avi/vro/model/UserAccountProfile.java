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
 * UserAccountProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "UserAccountProfile")
@VsoFinder(name = Constants.FINDER_VRO_USERACCOUNTPROFILE, idAccessor = "getObjectID()")
@Service
public class UserAccountProfile extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("account_lock_timeout")
  private Integer accountLockTimeout = 30;

  @JsonProperty("credentials_timeout_threshold")
  private Integer credentialsTimeoutThreshold = 180;

  @JsonProperty("max_concurrent_sessions")
  private Integer maxConcurrentSessions = null;

  @JsonProperty("max_login_failure_count")
  private Integer maxLoginFailureCount = 3;

  @JsonProperty("max_password_history_count")
  private Integer maxPasswordHistoryCount = 4;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * Lock timeout period (in minutes). Default is 30 minutes.
   * @return accountLockTimeout
  **/
  @ApiModelProperty(value = "Lock timeout period (in minutes). Default is 30 minutes.")


 
  @VsoMethod  
  public Integer getAccountLockTimeout() {
    return accountLockTimeout;
  }
    
  @VsoMethod
  public void setAccountLockTimeout(Integer accountLockTimeout) {
    this.accountLockTimeout = accountLockTimeout;
  }

  
  /**
   * The time period after which credentials expire. Default is 180 days.
   * @return credentialsTimeoutThreshold
  **/
  @ApiModelProperty(value = "The time period after which credentials expire. Default is 180 days.")


 
  @VsoMethod  
  public Integer getCredentialsTimeoutThreshold() {
    return credentialsTimeoutThreshold;
  }
    
  @VsoMethod
  public void setCredentialsTimeoutThreshold(Integer credentialsTimeoutThreshold) {
    this.credentialsTimeoutThreshold = credentialsTimeoutThreshold;
  }

  
  /**
   * Maximum number of concurrent sessions allowed. There are unlimited sessions by default.
   * @return maxConcurrentSessions
  **/
  @ApiModelProperty(value = "Maximum number of concurrent sessions allowed. There are unlimited sessions by default.")


 
  @VsoMethod  
  public Integer getMaxConcurrentSessions() {
    return maxConcurrentSessions;
  }
    
  @VsoMethod
  public void setMaxConcurrentSessions(Integer maxConcurrentSessions) {
    this.maxConcurrentSessions = maxConcurrentSessions;
  }

  
  /**
   * Number of login attempts before lockout. Default is 3 attempts.
   * @return maxLoginFailureCount
  **/
  @ApiModelProperty(value = "Number of login attempts before lockout. Default is 3 attempts.")


 
  @VsoMethod  
  public Integer getMaxLoginFailureCount() {
    return maxLoginFailureCount;
  }
    
  @VsoMethod
  public void setMaxLoginFailureCount(Integer maxLoginFailureCount) {
    this.maxLoginFailureCount = maxLoginFailureCount;
  }

  
  /**
   * Maximum number of passwords to be maintained in the password history. Default is 4 passwords.
   * @return maxPasswordHistoryCount
  **/
  @ApiModelProperty(value = "Maximum number of passwords to be maintained in the password history. Default is 4 passwords.")


 
  @VsoMethod  
  public Integer getMaxPasswordHistoryCount() {
    return maxPasswordHistoryCount;
  }
    
  @VsoMethod
  public void setMaxPasswordHistoryCount(Integer maxPasswordHistoryCount) {
    this.maxPasswordHistoryCount = maxPasswordHistoryCount;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "UserAccountProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccountProfile userAccountProfile = (UserAccountProfile) o;
    return Objects.equals(this.lastModified, userAccountProfile.lastModified) &&
        Objects.equals(this.accountLockTimeout, userAccountProfile.accountLockTimeout) &&
        Objects.equals(this.credentialsTimeoutThreshold, userAccountProfile.credentialsTimeoutThreshold) &&
        Objects.equals(this.maxConcurrentSessions, userAccountProfile.maxConcurrentSessions) &&
        Objects.equals(this.maxLoginFailureCount, userAccountProfile.maxLoginFailureCount) &&
        Objects.equals(this.maxPasswordHistoryCount, userAccountProfile.maxPasswordHistoryCount) &&
        Objects.equals(this.name, userAccountProfile.name) &&
        Objects.equals(this.url, userAccountProfile.url) &&
        Objects.equals(this.uuid, userAccountProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, accountLockTimeout, credentialsTimeoutThreshold, maxConcurrentSessions, maxLoginFailureCount, maxPasswordHistoryCount, name, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccountProfile {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    accountLockTimeout: ").append(toIndentedString(accountLockTimeout)).append("\n");
    sb.append("    credentialsTimeoutThreshold: ").append(toIndentedString(credentialsTimeoutThreshold)).append("\n");
    sb.append("    maxConcurrentSessions: ").append(toIndentedString(maxConcurrentSessions)).append("\n");
    sb.append("    maxLoginFailureCount: ").append(toIndentedString(maxLoginFailureCount)).append("\n");
    sb.append("    maxPasswordHistoryCount: ").append(toIndentedString(maxPasswordHistoryCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

