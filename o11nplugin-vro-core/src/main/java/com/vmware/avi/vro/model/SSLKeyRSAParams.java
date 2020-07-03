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
 * The SSLKeyRSAParams is a POJO class extends AviRestResource that used for creating
 * SSLKeyRSAParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SSLKeyRSAParams")
@VsoFinder(name = Constants.FINDER_VRO_SSLKEYRSAPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SSLKeyRSAParams extends AviRestResource {
  @JsonProperty("exponent")
  @JsonInclude(Include.NON_NULL)
  private Integer exponent = 65537;

  @JsonProperty("key_size")
  @JsonInclude(Include.NON_NULL)
  private String keySize = "SSL_KEY_2048_BITS";



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property exponent of obj type sslkeyrsaparams field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 65537.
   * @return exponent
   */
  @VsoMethod
  public Integer getExponent() {
    return exponent;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property exponent of obj type sslkeyrsaparams field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 65537.
   * @param exponent set the exponent.
   */
  @VsoMethod
  public void setExponent(Integer  exponent) {
    this.exponent = exponent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - SSL_KEY_1024_BITS, SSL_KEY_2048_BITS, SSL_KEY_3072_BITS, SSL_KEY_4096_BITS.
   * Default value when not specified in API or module is interpreted by Avi Controller as SSL_KEY_2048_BITS.
   * @return keySize
   */
  @VsoMethod
  public String getKeySize() {
    return keySize;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - SSL_KEY_1024_BITS, SSL_KEY_2048_BITS, SSL_KEY_3072_BITS, SSL_KEY_4096_BITS.
   * Default value when not specified in API or module is interpreted by Avi Controller as SSL_KEY_2048_BITS.
   * @param keySize set the keySize.
   */
  @VsoMethod
  public void setKeySize(String  keySize) {
    this.keySize = keySize;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SSLKeyRSAParams objSSLKeyRSAParams = (SSLKeyRSAParams) o;
  return   Objects.equals(this.keySize, objSSLKeyRSAParams.keySize)&&
  Objects.equals(this.exponent, objSSLKeyRSAParams.exponent);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SSLKeyRSAParams {\n");
      sb.append("    exponent: ").append(toIndentedString(exponent)).append("\n");
        sb.append("    keySize: ").append(toIndentedString(keySize)).append("\n");
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
