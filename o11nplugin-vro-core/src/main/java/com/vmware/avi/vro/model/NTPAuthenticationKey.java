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
 * NTPAuthenticationKey
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NTPAuthenticationKey")
@VsoFinder(name = Constants.FINDER_VRO_NTPAUTHENTICATIONKEY, idAccessor = "getObjectID()")
@Service
public class NTPAuthenticationKey extends AviRestResource  {
  @JsonProperty("algorithm")
  private String algorithm = "NTP_AUTH_ALGORITHM_MD5";

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("key_number")
  private Integer keyNumber = null;

  
  /**
   * Message Digest Algorithm used for NTP authentication. Default is NTP_AUTH_ALGORITHM_MD5. Enum options - NTP_AUTH_ALGORITHM_MD5, NTP_AUTH_ALGORITHM_SHA1.
   * @return algorithm
  **/
  @ApiModelProperty(value = "Message Digest Algorithm used for NTP authentication. Default is NTP_AUTH_ALGORITHM_MD5. Enum options - NTP_AUTH_ALGORITHM_MD5, NTP_AUTH_ALGORITHM_SHA1.")


 
  @VsoMethod  
  public String getAlgorithm() {
    return algorithm;
  }
    
  @VsoMethod
  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  
  /**
   * NTP Authentication key.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "NTP Authentication key.")
  @NotNull


 
  @VsoMethod  
  public String getKey() {
    return key;
  }
    
  @VsoMethod
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   * Key number to be assigned to the authentication-key. Allowed values are 1-65534.
   * @return keyNumber
  **/
  @ApiModelProperty(required = true, value = "Key number to be assigned to the authentication-key. Allowed values are 1-65534.")
  @NotNull


 
  @VsoMethod  
  public Integer getKeyNumber() {
    return keyNumber;
  }
    
  @VsoMethod
  public void setKeyNumber(Integer keyNumber) {
    this.keyNumber = keyNumber;
  }

  
  public String getObjectID() {
		return "NTPAuthenticationKey";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NTPAuthenticationKey ntPAuthenticationKey = (NTPAuthenticationKey) o;
    return Objects.equals(this.algorithm, ntPAuthenticationKey.algorithm) &&
        Objects.equals(this.key, ntPAuthenticationKey.key) &&
        Objects.equals(this.keyNumber, ntPAuthenticationKey.keyNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, key, keyNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NTPAuthenticationKey {\n");
    
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyNumber: ").append(toIndentedString(keyNumber)).append("\n");
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

