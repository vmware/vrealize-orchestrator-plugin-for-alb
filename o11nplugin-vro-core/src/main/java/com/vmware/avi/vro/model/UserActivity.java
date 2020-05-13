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
 * UserActivity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "UserActivity")
@VsoFinder(name = Constants.FINDER_VRO_USERACTIVITY, idAccessor = "getObjectID()")
@Service
public class UserActivity extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("concurrent_sessions")
  private Integer concurrentSessions = null;

  @JsonProperty("failed_login_attempts")
  private Integer failedLoginAttempts = null;

  @JsonProperty("last_login_ip")
  private String lastLoginIp = null;

  @JsonProperty("last_login_timestamp")
  private String lastLoginTimestamp = null;

  @JsonProperty("last_password_update")
  private String lastPasswordUpdate = null;

  @JsonProperty("logged_in")
  private Boolean loggedIn = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("previous_password")
  @Valid
  private List<String> previousPassword = null;

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
   * Number of concurrent user sessions open.
   * @return concurrentSessions
  **/
  @ApiModelProperty(value = "Number of concurrent user sessions open.")


 
  @VsoMethod  
  public Integer getConcurrentSessions() {
    return concurrentSessions;
  }
    
  @VsoMethod
  public void setConcurrentSessions(Integer concurrentSessions) {
    this.concurrentSessions = concurrentSessions;
  }

  
  /**
   * Number of failed login attempts before a successful login.
   * @return failedLoginAttempts
  **/
  @ApiModelProperty(value = "Number of failed login attempts before a successful login.")


 
  @VsoMethod  
  public Integer getFailedLoginAttempts() {
    return failedLoginAttempts;
  }
    
  @VsoMethod
  public void setFailedLoginAttempts(Integer failedLoginAttempts) {
    this.failedLoginAttempts = failedLoginAttempts;
  }

  
  /**
   * IP of the machine the user was last logged in from.
   * @return lastLoginIp
  **/
  @ApiModelProperty(value = "IP of the machine the user was last logged in from.")


 
  @VsoMethod  
  public String getLastLoginIp() {
    return lastLoginIp;
  }
    
  @VsoMethod
  public void setLastLoginIp(String lastLoginIp) {
    this.lastLoginIp = lastLoginIp;
  }

  
  /**
   * Timestamp of last login.
   * @return lastLoginTimestamp
  **/
  @ApiModelProperty(value = "Timestamp of last login.")


 
  @VsoMethod  
  public String getLastLoginTimestamp() {
    return lastLoginTimestamp;
  }
    
  @VsoMethod
  public void setLastLoginTimestamp(String lastLoginTimestamp) {
    this.lastLoginTimestamp = lastLoginTimestamp;
  }

  
  /**
   * Timestamp of last password update.
   * @return lastPasswordUpdate
  **/
  @ApiModelProperty(value = "Timestamp of last password update.")


 
  @VsoMethod  
  public String getLastPasswordUpdate() {
    return lastPasswordUpdate;
  }
    
  @VsoMethod
  public void setLastPasswordUpdate(String lastPasswordUpdate) {
    this.lastPasswordUpdate = lastPasswordUpdate;
  }

  
  /**
   * Indicates whether the user is logged in or not.
   * @return loggedIn
  **/
  @ApiModelProperty(value = "Indicates whether the user is logged in or not.")


 
  @VsoMethod  
  public Boolean isLoggedIn() {
    return loggedIn;
  }
    
  @VsoMethod
  public void setLoggedIn(Boolean loggedIn) {
    this.loggedIn = loggedIn;
  }

  
  /**
   * Name of the user this object refers to.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the user this object refers to.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public UserActivity addPreviousPasswordItem(String previousPasswordItem) {
    if (this.previousPassword == null) {
      this.previousPassword = new ArrayList<String>();
    }
    this.previousPassword.add(previousPasswordItem);
    return this;
  }
  
  /**
   * Stores the previous n passwords  where n is ControllerProperties.max_password_history_count. .
   * @return previousPassword
  **/
  @ApiModelProperty(value = "Stores the previous n passwords  where n is ControllerProperties.max_password_history_count. .")


 
  @VsoMethod  
  public List<String> getPreviousPassword() {
    return previousPassword;
  }
    
  @VsoMethod
  public void setPreviousPassword(List<String> previousPassword) {
    this.previousPassword = previousPassword;
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
		return "UserActivity";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserActivity userActivity = (UserActivity) o;
    return Objects.equals(this.lastModified, userActivity.lastModified) &&
        Objects.equals(this.concurrentSessions, userActivity.concurrentSessions) &&
        Objects.equals(this.failedLoginAttempts, userActivity.failedLoginAttempts) &&
        Objects.equals(this.lastLoginIp, userActivity.lastLoginIp) &&
        Objects.equals(this.lastLoginTimestamp, userActivity.lastLoginTimestamp) &&
        Objects.equals(this.lastPasswordUpdate, userActivity.lastPasswordUpdate) &&
        Objects.equals(this.loggedIn, userActivity.loggedIn) &&
        Objects.equals(this.name, userActivity.name) &&
        Objects.equals(this.previousPassword, userActivity.previousPassword) &&
        Objects.equals(this.url, userActivity.url) &&
        Objects.equals(this.uuid, userActivity.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, concurrentSessions, failedLoginAttempts, lastLoginIp, lastLoginTimestamp, lastPasswordUpdate, loggedIn, name, previousPassword, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivity {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    concurrentSessions: ").append(toIndentedString(concurrentSessions)).append("\n");
    sb.append("    failedLoginAttempts: ").append(toIndentedString(failedLoginAttempts)).append("\n");
    sb.append("    lastLoginIp: ").append(toIndentedString(lastLoginIp)).append("\n");
    sb.append("    lastLoginTimestamp: ").append(toIndentedString(lastLoginTimestamp)).append("\n");
    sb.append("    lastPasswordUpdate: ").append(toIndentedString(lastPasswordUpdate)).append("\n");
    sb.append("    loggedIn: ").append(toIndentedString(loggedIn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    previousPassword: ").append(toIndentedString(previousPassword)).append("\n");
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

