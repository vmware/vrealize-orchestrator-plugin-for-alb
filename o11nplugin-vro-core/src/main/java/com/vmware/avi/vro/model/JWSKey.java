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
 * The JWSKey is a POJO class extends AviRestResource that used for creating
 * JWSKey.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "JWSKey")
@VsoFinder(name = Constants.FINDER_VRO_JWSKEY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class JWSKey extends AviRestResource {
    @JsonProperty("alg")
    @JsonInclude(Include.NON_NULL)
    private String alg = "HS256";

    @JsonProperty("key")
    @JsonInclude(Include.NON_NULL)
    private String key = null;

    @JsonProperty("kid")
    @JsonInclude(Include.NON_NULL)
    private String kid = null;

    @JsonProperty("kty")
    @JsonInclude(Include.NON_NULL)
    private String kty = "oct";



  /**
   * This is the getter method this will return the attribute value.
   * Algorithm that need to be used while signing/validation, allowed values  hs256, hs384, hs512.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "HS256".
   * @return alg
   */
  @VsoMethod
  public String getAlg() {
    return alg;
  }

  /**
   * This is the setter method to the attribute.
   * Algorithm that need to be used while signing/validation, allowed values  hs256, hs384, hs512.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "HS256".
   * @param alg set the alg.
   */
  @VsoMethod
  public void setAlg(String  alg) {
    this.alg = alg;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Secret jwk for signing/validation, length of the key varies depending upon the type of algorithm used for key generation {hs256  32 bytes, hs384
   * 48bytes, hs512  64 bytes}.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return key
   */
  @VsoMethod
  public String getKey() {
    return key;
  }

  /**
   * This is the setter method to the attribute.
   * Secret jwk for signing/validation, length of the key varies depending upon the type of algorithm used for key generation {hs256  32 bytes, hs384
   * 48bytes, hs512  64 bytes}.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param key set the key.
   */
  @VsoMethod
  public void setKey(String  key) {
    this.key = key;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique key id across all keys.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return kid
   */
  @VsoMethod
  public String getKid() {
    return kid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique key id across all keys.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param kid set the kid.
   */
  @VsoMethod
  public void setKid(String  kid) {
    this.kid = kid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Secret key type/format, allowed value  octet(oct).
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "oct".
   * @return kty
   */
  @VsoMethod
  public String getKty() {
    return kty;
  }

  /**
   * This is the setter method to the attribute.
   * Secret key type/format, allowed value  octet(oct).
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "oct".
   * @param kty set the kty.
   */
  @VsoMethod
  public void setKty(String  kty) {
    this.kty = kty;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  JWSKey objJWSKey = (JWSKey) o;
  return   Objects.equals(this.alg, objJWSKey.alg)&&
  Objects.equals(this.kty, objJWSKey.kty)&&
  Objects.equals(this.kid, objJWSKey.kid)&&
  Objects.equals(this.key, objJWSKey.key);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class JWSKey {\n");
      sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
        sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
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

