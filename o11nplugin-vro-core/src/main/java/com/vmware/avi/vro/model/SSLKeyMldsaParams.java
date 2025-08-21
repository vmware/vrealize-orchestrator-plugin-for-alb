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
 * The SSLKeyMldsaParams is a POJO class extends AviRestResource that used for creating
 * SSLKeyMldsaParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SSLKeyMldsaParams")
@VsoFinder(name = Constants.FINDER_VRO_SSLKEYMLDSAPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SSLKeyMldsaParams extends AviRestResource {
    @JsonProperty("algorithm")
    @JsonInclude(Include.NON_NULL)
    private String algorithm = "SSL_KEY_MLDSA44";



  /**
   * This is the getter method this will return the attribute value.
   * Mldsa signature algorithm.
   * Enum options - SSL_KEY_MLDSA44, SSL_KEY_MLDSA65, SSL_KEY_MLDSA87.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_KEY_MLDSA44".
   * @return algorithm
   */
  @VsoMethod
  public String getAlgorithm() {
    return algorithm;
  }

  /**
   * This is the setter method to the attribute.
   * Mldsa signature algorithm.
   * Enum options - SSL_KEY_MLDSA44, SSL_KEY_MLDSA65, SSL_KEY_MLDSA87.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_KEY_MLDSA44".
   * @param algorithm set the algorithm.
   */
  @VsoMethod
  public void setAlgorithm(String  algorithm) {
    this.algorithm = algorithm;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SSLKeyMldsaParams objSSLKeyMldsaParams = (SSLKeyMldsaParams) o;
  return   Objects.equals(this.algorithm, objSSLKeyMldsaParams.algorithm);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SSLKeyMldsaParams {\n");
      sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
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

