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
 * The TLSTicket is a POJO class extends AviRestResource that used for creating
 * TLSTicket.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TLSTicket")
@VsoFinder(name = Constants.FINDER_VRO_TLSTICKET)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TLSTicket extends AviRestResource {
  @JsonProperty("aes_key")
  @JsonInclude(Include.NON_NULL)
  private String aesKey = null;

  @JsonProperty("hmac_key")
  @JsonInclude(Include.NON_NULL)
  private String hmacKey = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property aes_key of obj type tlsticket field type str  type string.
   * @return aesKey
   */
  @VsoMethod
  public String getAesKey() {
    return aesKey;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property aes_key of obj type tlsticket field type str  type string.
   * @param aesKey set the aesKey.
   */
  @VsoMethod
  public void setAesKey(String  aesKey) {
    this.aesKey = aesKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property hmac_key of obj type tlsticket field type str  type string.
   * @return hmacKey
   */
  @VsoMethod
  public String getHmacKey() {
    return hmacKey;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property hmac_key of obj type tlsticket field type str  type string.
   * @param hmacKey set the hmacKey.
   */
  @VsoMethod
  public void setHmacKey(String  hmacKey) {
    this.hmacKey = hmacKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TLSTicket objTLSTicket = (TLSTicket) o;
  return   Objects.equals(this.hmacKey, objTLSTicket.hmacKey)&&
  Objects.equals(this.name, objTLSTicket.name)&&
  Objects.equals(this.aesKey, objTLSTicket.aesKey);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TLSTicket {\n");
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
