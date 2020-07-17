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
 * The UserActivity is a POJO class extends AviRestResource that used for creating
 * UserActivity.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "UserActivity")
@VsoFinder(name = Constants.FINDER_VRO_USERACTIVITY, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class UserActivity extends AviRestResource {
  @JsonProperty("concurrent_sessions")
  @JsonInclude(Include.NON_NULL)
  private Integer concurrentSessions = 0;

  @JsonProperty("failed_login_attempts")
  @JsonInclude(Include.NON_NULL)
  private Integer failedLoginAttempts = 0;

  @JsonProperty("last_login_ip")
  @JsonInclude(Include.NON_NULL)
  private String lastLoginIp = null;

  @JsonProperty("last_login_timestamp")
  @JsonInclude(Include.NON_NULL)
  private String lastLoginTimestamp = null;

  @JsonProperty("last_password_update")
  @JsonInclude(Include.NON_NULL)
  private String lastPasswordUpdate = null;

  @JsonProperty("logged_in")
  @JsonInclude(Include.NON_NULL)
  private Boolean loggedIn = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("previous_password")
  @JsonInclude(Include.NON_NULL)
  private List<String> previousPassword = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Number of concurrent user sessions open.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return concurrentSessions
   */
  @VsoMethod
  public Integer getConcurrentSessions() {
    return concurrentSessions;
  }

  /**
   * This is the setter method to the attribute.
   * Number of concurrent user sessions open.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param concurrentSessions set the concurrentSessions.
   */
  @VsoMethod
  public void setConcurrentSessions(Integer  concurrentSessions) {
    this.concurrentSessions = concurrentSessions;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of failed login attempts before a successful login.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return failedLoginAttempts
   */
  @VsoMethod
  public Integer getFailedLoginAttempts() {
    return failedLoginAttempts;
  }

  /**
   * This is the setter method to the attribute.
   * Number of failed login attempts before a successful login.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param failedLoginAttempts set the failedLoginAttempts.
   */
  @VsoMethod
  public void setFailedLoginAttempts(Integer  failedLoginAttempts) {
    this.failedLoginAttempts = failedLoginAttempts;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip of the machine the user was last logged in from.
   * @return lastLoginIp
   */
  @VsoMethod
  public String getLastLoginIp() {
    return lastLoginIp;
  }

  /**
   * This is the setter method to the attribute.
   * Ip of the machine the user was last logged in from.
   * @param lastLoginIp set the lastLoginIp.
   */
  @VsoMethod
  public void setLastLoginIp(String  lastLoginIp) {
    this.lastLoginIp = lastLoginIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp of last login.
   * @return lastLoginTimestamp
   */
  @VsoMethod
  public String getLastLoginTimestamp() {
    return lastLoginTimestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp of last login.
   * @param lastLoginTimestamp set the lastLoginTimestamp.
   */
  @VsoMethod
  public void setLastLoginTimestamp(String  lastLoginTimestamp) {
    this.lastLoginTimestamp = lastLoginTimestamp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp of last password update.
   * @return lastPasswordUpdate
   */
  @VsoMethod
  public String getLastPasswordUpdate() {
    return lastPasswordUpdate;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp of last password update.
   * @param lastPasswordUpdate set the lastPasswordUpdate.
   */
  @VsoMethod
  public void setLastPasswordUpdate(String  lastPasswordUpdate) {
    this.lastPasswordUpdate = lastPasswordUpdate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Indicates whether the user is logged in or not.
   * @return loggedIn
   */
  @VsoMethod
  public Boolean getLoggedIn() {
    return loggedIn;
  }

  /**
   * This is the setter method to the attribute.
   * Indicates whether the user is logged in or not.
   * @param loggedIn set the loggedIn.
   */
  @VsoMethod
  public void setLoggedIn(Boolean  loggedIn) {
    this.loggedIn = loggedIn;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the user this object refers to.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the user this object refers to.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Stores the previous n passwords  where n is controllerproperties.max_password_history_count.
   * @return previousPassword
   */
  @VsoMethod
  public List<String> getPreviousPassword() {
    return previousPassword;
  }

  /**
   * This is the setter method. this will set the previousPassword
   * Stores the previous n passwords  where n is controllerproperties.max_password_history_count.
   * @return previousPassword
   */
  @VsoMethod
  public void setPreviousPassword(List<String>  previousPassword) {
    this.previousPassword = previousPassword;
  }

  /**
   * This is the setter method this will set the previousPassword
   * Stores the previous n passwords  where n is controllerproperties.max_password_history_count.
   * @return previousPassword
   */
  @VsoMethod
  public UserActivity addPreviousPasswordItem(String previousPasswordItem) {
    if (this.previousPassword == null) {
      this.previousPassword = new ArrayList<String>();
    }
    this.previousPassword.add(previousPasswordItem);
    return this;
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
  UserActivity objUserActivity = (UserActivity) o;
  return   Objects.equals(this.lastPasswordUpdate, objUserActivity.lastPasswordUpdate)&&
  Objects.equals(this.failedLoginAttempts, objUserActivity.failedLoginAttempts)&&
  Objects.equals(this.uuid, objUserActivity.uuid)&&
  Objects.equals(this.lastLoginTimestamp, objUserActivity.lastLoginTimestamp)&&
  Objects.equals(this.lastLoginIp, objUserActivity.lastLoginIp)&&
  Objects.equals(this.previousPassword, objUserActivity.previousPassword)&&
  Objects.equals(this.loggedIn, objUserActivity.loggedIn)&&
  Objects.equals(this.concurrentSessions, objUserActivity.concurrentSessions)&&
  Objects.equals(this.name, objUserActivity.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class UserActivity {\n");
      sb.append("    concurrentSessions: ").append(toIndentedString(concurrentSessions)).append("\n");
        sb.append("    failedLoginAttempts: ").append(toIndentedString(failedLoginAttempts)).append("\n");
        sb.append("    lastLoginIp: ").append(toIndentedString(lastLoginIp)).append("\n");
        sb.append("    lastLoginTimestamp: ").append(toIndentedString(lastLoginTimestamp)).append("\n");
        sb.append("    lastPasswordUpdate: ").append(toIndentedString(lastPasswordUpdate)).append("\n");
        sb.append("    loggedIn: ").append(toIndentedString(loggedIn)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    previousPassword: ").append(toIndentedString(previousPassword)).append("\n");
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

