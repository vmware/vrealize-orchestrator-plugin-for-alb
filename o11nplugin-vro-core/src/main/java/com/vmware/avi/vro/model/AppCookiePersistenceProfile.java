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
 * AppCookiePersistenceProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AppCookiePersistenceProfile")
@VsoFinder(name = Constants.FINDER_VRO_APPCOOKIEPERSISTENCEPROFILE, idAccessor = "getObjectID()")
@Service
public class AppCookiePersistenceProfile extends AviRestResource  {
  @JsonProperty("encryption_key")
  private String encryptionKey = null;

  @JsonProperty("prst_hdr_name")
  private String prstHdrName = null;

  @JsonProperty("timeout")
  private Integer timeout = 20;

  
  /**
   * Key to use for cookie encryption.
   * @return encryptionKey
  **/
  @ApiModelProperty(value = "Key to use for cookie encryption.")


 
  @VsoMethod  
  public String getEncryptionKey() {
    return encryptionKey;
  }
    
  @VsoMethod
  public void setEncryptionKey(String encryptionKey) {
    this.encryptionKey = encryptionKey;
  }

  
  /**
   * Header or cookie name for application cookie persistence.
   * @return prstHdrName
  **/
  @ApiModelProperty(required = true, value = "Header or cookie name for application cookie persistence.")
  @NotNull


 
  @VsoMethod  
  public String getPrstHdrName() {
    return prstHdrName;
  }
    
  @VsoMethod
  public void setPrstHdrName(String prstHdrName) {
    this.prstHdrName = prstHdrName;
  }

  
  /**
   * The length of time after a client's connections have closed before expiring the client's persistence to a server. Allowed values are 1-720.
   * @return timeout
  **/
  @ApiModelProperty(value = "The length of time after a client's connections have closed before expiring the client's persistence to a server. Allowed values are 1-720.")


 
  @VsoMethod  
  public Integer getTimeout() {
    return timeout;
  }
    
  @VsoMethod
  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  
  public String getObjectID() {
		return "AppCookiePersistenceProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppCookiePersistenceProfile appCookiePersistenceProfile = (AppCookiePersistenceProfile) o;
    return Objects.equals(this.encryptionKey, appCookiePersistenceProfile.encryptionKey) &&
        Objects.equals(this.prstHdrName, appCookiePersistenceProfile.prstHdrName) &&
        Objects.equals(this.timeout, appCookiePersistenceProfile.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptionKey, prstHdrName, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppCookiePersistenceProfile {\n");
    
    sb.append("    encryptionKey: ").append(toIndentedString(encryptionKey)).append("\n");
    sb.append("    prstHdrName: ").append(toIndentedString(prstHdrName)).append("\n");
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

