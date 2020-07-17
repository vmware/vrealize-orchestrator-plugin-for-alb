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
 * The HttpCookiePersistenceProfile is a POJO class extends AviRestResource that used for creating
 * HttpCookiePersistenceProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HttpCookiePersistenceProfile")
@VsoFinder(name = Constants.FINDER_VRO_HTTPCOOKIEPERSISTENCEPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HttpCookiePersistenceProfile extends AviRestResource {
  @JsonProperty("always_send_cookie")
  @JsonInclude(Include.NON_NULL)
  private Boolean alwaysSendCookie = false;

  @JsonProperty("cookie_name")
  @JsonInclude(Include.NON_NULL)
  private String cookieName = null;

  @JsonProperty("encryption_key")
  @JsonInclude(Include.NON_NULL)
  private String encryptionKey = null;

  @JsonProperty("key")
  @JsonInclude(Include.NON_NULL)
  private List<HttpCookiePersistenceKey> key = null;

  @JsonProperty("timeout")
  @JsonInclude(Include.NON_NULL)
  private Integer timeout = null;



  /**
   * This is the getter method this will return the attribute value.
   * If no persistence cookie was received from the client, always send it.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return alwaysSendCookie
   */
  @VsoMethod
  public Boolean getAlwaysSendCookie() {
    return alwaysSendCookie;
  }

  /**
   * This is the setter method to the attribute.
   * If no persistence cookie was received from the client, always send it.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param alwaysSendCookie set the alwaysSendCookie.
   */
  @VsoMethod
  public void setAlwaysSendCookie(Boolean  alwaysSendCookie) {
    this.alwaysSendCookie = alwaysSendCookie;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http cookie name for cookie persistence.
   * @return cookieName
   */
  @VsoMethod
  public String getCookieName() {
    return cookieName;
  }

  /**
   * This is the setter method to the attribute.
   * Http cookie name for cookie persistence.
   * @param cookieName set the cookieName.
   */
  @VsoMethod
  public void setCookieName(String  cookieName) {
    this.cookieName = cookieName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Key name to use for cookie encryption.
   * @return encryptionKey
   */
  @VsoMethod
  public String getEncryptionKey() {
    return encryptionKey;
  }

  /**
   * This is the setter method to the attribute.
   * Key name to use for cookie encryption.
   * @param encryptionKey set the encryptionKey.
   */
  @VsoMethod
  public void setEncryptionKey(String  encryptionKey) {
    this.encryptionKey = encryptionKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property key of obj type httpcookiepersistenceprofile field type str  type array.
   * @return key
   */
  @VsoMethod
  public List<HttpCookiePersistenceKey> getKey() {
    return key;
  }

  /**
   * This is the setter method. this will set the key
   * Placeholder for description of property key of obj type httpcookiepersistenceprofile field type str  type array.
   * @return key
   */
  @VsoMethod
  public void setKey(List<HttpCookiePersistenceKey>  key) {
    this.key = key;
  }

  /**
   * This is the setter method this will set the key
   * Placeholder for description of property key of obj type httpcookiepersistenceprofile field type str  type array.
   * @return key
   */
  @VsoMethod
  public HttpCookiePersistenceProfile addKeyItem(HttpCookiePersistenceKey keyItem) {
    if (this.key == null) {
      this.key = new ArrayList<HttpCookiePersistenceKey>();
    }
    this.key.add(keyItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The maximum lifetime of any session cookie.
   * No value or 'zero' indicates no timeout.
   * Allowed values are 1-14400.
   * Special values are 0- 'no timeout'.
   * @return timeout
   */
  @VsoMethod
  public Integer getTimeout() {
    return timeout;
  }

  /**
   * This is the setter method to the attribute.
   * The maximum lifetime of any session cookie.
   * No value or 'zero' indicates no timeout.
   * Allowed values are 1-14400.
   * Special values are 0- 'no timeout'.
   * @param timeout set the timeout.
   */
  @VsoMethod
  public void setTimeout(Integer  timeout) {
    this.timeout = timeout;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HttpCookiePersistenceProfile objHttpCookiePersistenceProfile = (HttpCookiePersistenceProfile) o;
  return   Objects.equals(this.alwaysSendCookie, objHttpCookiePersistenceProfile.alwaysSendCookie)&&
  Objects.equals(this.timeout, objHttpCookiePersistenceProfile.timeout)&&
  Objects.equals(this.cookieName, objHttpCookiePersistenceProfile.cookieName)&&
  Objects.equals(this.encryptionKey, objHttpCookiePersistenceProfile.encryptionKey)&&
  Objects.equals(this.key, objHttpCookiePersistenceProfile.key);
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

