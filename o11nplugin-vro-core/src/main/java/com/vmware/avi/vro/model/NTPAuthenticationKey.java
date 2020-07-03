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
 * The NTPAuthenticationKey is a POJO class extends AviRestResource that used for creating
 * NTPAuthenticationKey.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NTPAuthenticationKey")
@VsoFinder(name = Constants.FINDER_VRO_NTPAUTHENTICATIONKEY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NTPAuthenticationKey extends AviRestResource {
  @JsonProperty("algorithm")
  @JsonInclude(Include.NON_NULL)
  private String algorithm = "NTP_AUTH_ALGORITHM_MD5";

  @JsonProperty("key")
  @JsonInclude(Include.NON_NULL)
  private String key = null;

  @JsonProperty("key_number")
  @JsonInclude(Include.NON_NULL)
  private Integer keyNumber = null;



  /**
   * This is the getter method this will return the attribute value.
   * Message digest algorithm used for ntp authentication.
   * Default is ntp_auth_algorithm_md5.
   * Enum options - NTP_AUTH_ALGORITHM_MD5, NTP_AUTH_ALGORITHM_SHA1.
   * Default value when not specified in API or module is interpreted by Avi Controller as NTP_AUTH_ALGORITHM_MD5.
   * @return algorithm
   */
  @VsoMethod
  public String getAlgorithm() {
    return algorithm;
  }

  /**
   * This is the setter method to the attribute.
   * Message digest algorithm used for ntp authentication.
   * Default is ntp_auth_algorithm_md5.
   * Enum options - NTP_AUTH_ALGORITHM_MD5, NTP_AUTH_ALGORITHM_SHA1.
   * Default value when not specified in API or module is interpreted by Avi Controller as NTP_AUTH_ALGORITHM_MD5.
   * @param algorithm set the algorithm.
   */
  @VsoMethod
  public void setAlgorithm(String  algorithm) {
    this.algorithm = algorithm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ntp authentication key.
   * @return key
   */
  @VsoMethod
  public String getKey() {
    return key;
  }

  /**
   * This is the setter method to the attribute.
   * Ntp authentication key.
   * @param key set the key.
   */
  @VsoMethod
  public void setKey(String  key) {
    this.key = key;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Key number to be assigned to the authentication-key.
   * Allowed values are 1-65534.
   * @return keyNumber
   */
  @VsoMethod
  public Integer getKeyNumber() {
    return keyNumber;
  }

  /**
   * This is the setter method to the attribute.
   * Key number to be assigned to the authentication-key.
   * Allowed values are 1-65534.
   * @param keyNumber set the keyNumber.
   */
  @VsoMethod
  public void setKeyNumber(Integer  keyNumber) {
    this.keyNumber = keyNumber;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NTPAuthenticationKey objNTPAuthenticationKey = (NTPAuthenticationKey) o;
  return   Objects.equals(this.keyNumber, objNTPAuthenticationKey.keyNumber)&&
  Objects.equals(this.key, objNTPAuthenticationKey.key)&&
  Objects.equals(this.algorithm, objNTPAuthenticationKey.algorithm);
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
