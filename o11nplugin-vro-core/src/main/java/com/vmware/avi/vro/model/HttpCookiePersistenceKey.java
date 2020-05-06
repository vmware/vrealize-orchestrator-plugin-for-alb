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
 * HttpCookiePersistenceKey
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "HttpCookiePersistenceKey")
@VsoFinder(name = Constants.FINDER_VRO_HTTPCOOKIEPERSISTENCEKEY, idAccessor = "getObjectID()")
@Service
public class HttpCookiePersistenceKey extends AviRestResource  {
  @JsonProperty("aes_key")
  private String aesKey = null;

  @JsonProperty("hmac_key")
  private String hmacKey = null;

  @JsonProperty("name")
  private String name = null;

  
  /**
   * aes_key of HttpCookiePersistenceKey.
   * @return aesKey
  **/
  @ApiModelProperty(value = "aes_key of HttpCookiePersistenceKey.")


 
  @VsoMethod  
  public String getAesKey() {
    return aesKey;
  }
    
  @VsoMethod
  public void setAesKey(String aesKey) {
    this.aesKey = aesKey;
  }

  
  /**
   * hmac_key of HttpCookiePersistenceKey.
   * @return hmacKey
  **/
  @ApiModelProperty(value = "hmac_key of HttpCookiePersistenceKey.")


 
  @VsoMethod  
  public String getHmacKey() {
    return hmacKey;
  }
    
  @VsoMethod
  public void setHmacKey(String hmacKey) {
    this.hmacKey = hmacKey;
  }

  
  /**
   * name to use for cookie encryption.
   * @return name
  **/
  @ApiModelProperty(value = "name to use for cookie encryption.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public String getObjectID() {
		return "HttpCookiePersistenceKey";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpCookiePersistenceKey httpCookiePersistenceKey = (HttpCookiePersistenceKey) o;
    return Objects.equals(this.aesKey, httpCookiePersistenceKey.aesKey) &&
        Objects.equals(this.hmacKey, httpCookiePersistenceKey.hmacKey) &&
        Objects.equals(this.name, httpCookiePersistenceKey.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aesKey, hmacKey, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpCookiePersistenceKey {\n");
    
    sb.append("    aesKey: ").append(toIndentedString(aesKey)).append("\n");
    sb.append("    hmacKey: ").append(toIndentedString(hmacKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

