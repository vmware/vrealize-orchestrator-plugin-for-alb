package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HttpCookiePersistenceKey;
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
 * HttpCookiePersistenceProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HttpCookiePersistenceProfile")
@VsoFinder(name = Constants.FINDER_VRO_HTTPCOOKIEPERSISTENCEPROFILE, idAccessor = "getObjectID()")
@Service
public class HttpCookiePersistenceProfile extends AviRestResource  {
  @JsonProperty("always_send_cookie")
  private Boolean alwaysSendCookie = null;

  @JsonProperty("cookie_name")
  private String cookieName = null;

  @JsonProperty("encryption_key")
  private String encryptionKey = null;

  @JsonProperty("key")
  @Valid
  private List<HttpCookiePersistenceKey> key = null;

  @JsonProperty("timeout")
  private Integer timeout = null;

  
  /**
   * If no persistence cookie was received from the client, always send it.
   * @return alwaysSendCookie
  **/
  @ApiModelProperty(value = "If no persistence cookie was received from the client, always send it.")


 
  @VsoMethod  
  public Boolean isAlwaysSendCookie() {
    return alwaysSendCookie;
  }
    
  @VsoMethod
  public void setAlwaysSendCookie(Boolean alwaysSendCookie) {
    this.alwaysSendCookie = alwaysSendCookie;
  }

  
  /**
   * HTTP cookie name for cookie persistence.
   * @return cookieName
  **/
  @ApiModelProperty(value = "HTTP cookie name for cookie persistence.")


 
  @VsoMethod  
  public String getCookieName() {
    return cookieName;
  }
    
  @VsoMethod
  public void setCookieName(String cookieName) {
    this.cookieName = cookieName;
  }

  
  /**
   * Key name to use for cookie encryption.
   * @return encryptionKey
  **/
  @ApiModelProperty(value = "Key name to use for cookie encryption.")


 
  @VsoMethod  
  public String getEncryptionKey() {
    return encryptionKey;
  }
    
  @VsoMethod
  public void setEncryptionKey(String encryptionKey) {
    this.encryptionKey = encryptionKey;
  }

  
  public HttpCookiePersistenceProfile addKeyItem(HttpCookiePersistenceKey keyItem) {
    if (this.key == null) {
      this.key = new ArrayList<HttpCookiePersistenceKey>();
    }
    this.key.add(keyItem);
    return this;
  }
  
  /**
   * Placeholder for description of property key of obj type HttpCookiePersistenceProfile field type str  type object
   * @return key
  **/
  @ApiModelProperty(value = "Placeholder for description of property key of obj type HttpCookiePersistenceProfile field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<HttpCookiePersistenceKey> getKey() {
    return key;
  }
    
  @VsoMethod
  public void setKey(List<HttpCookiePersistenceKey> key) {
    this.key = key;
  }

  
  /**
   * The maximum lifetime of any session cookie. No value or 'zero' indicates no timeout. Allowed values are 1-14400. Special values are 0- 'No Timeout'.
   * @return timeout
  **/
  @ApiModelProperty(value = "The maximum lifetime of any session cookie. No value or 'zero' indicates no timeout. Allowed values are 1-14400. Special values are 0- 'No Timeout'.")


 
  @VsoMethod  
  public Integer getTimeout() {
    return timeout;
  }
    
  @VsoMethod
  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  
  public String getObjectID() {
		return "HttpCookiePersistenceProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpCookiePersistenceProfile httpCookiePersistenceProfile = (HttpCookiePersistenceProfile) o;
    return Objects.equals(this.alwaysSendCookie, httpCookiePersistenceProfile.alwaysSendCookie) &&
        Objects.equals(this.cookieName, httpCookiePersistenceProfile.cookieName) &&
        Objects.equals(this.encryptionKey, httpCookiePersistenceProfile.encryptionKey) &&
        Objects.equals(this.key, httpCookiePersistenceProfile.key) &&
        Objects.equals(this.timeout, httpCookiePersistenceProfile.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alwaysSendCookie, cookieName, encryptionKey, key, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpCookiePersistenceProfile {\n");
    
    sb.append("    alwaysSendCookie: ").append(toIndentedString(alwaysSendCookie)).append("\n");
    sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
    sb.append("    encryptionKey: ").append(toIndentedString(encryptionKey)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

