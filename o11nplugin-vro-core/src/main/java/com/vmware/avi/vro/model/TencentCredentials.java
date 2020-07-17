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
 * The TencentCredentials is a POJO class extends AviRestResource that used for creating
 * TencentCredentials.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TencentCredentials")
@VsoFinder(name = Constants.FINDER_VRO_TENCENTCREDENTIALS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TencentCredentials extends AviRestResource {
  @JsonProperty("secret_id")
  @JsonInclude(Include.NON_NULL)
  private String secretId = null;

  @JsonProperty("secret_key")
  @JsonInclude(Include.NON_NULL)
  private String secretKey = null;



  /**
   * This is the getter method this will return the attribute value.
   * Tencent secret id.
   * Field introduced in 18.2.3.
   * @return secretId
   */
  @VsoMethod
  public String getSecretId() {
    return secretId;
  }

  /**
   * This is the setter method to the attribute.
   * Tencent secret id.
   * Field introduced in 18.2.3.
   * @param secretId set the secretId.
   */
  @VsoMethod
  public void setSecretId(String  secretId) {
    this.secretId = secretId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tencent secret key.
   * Field introduced in 18.2.3.
   * @return secretKey
   */
  @VsoMethod
  public String getSecretKey() {
    return secretKey;
  }

  /**
   * This is the setter method to the attribute.
   * Tencent secret key.
   * Field introduced in 18.2.3.
   * @param secretKey set the secretKey.
   */
  @VsoMethod
  public void setSecretKey(String  secretKey) {
    this.secretKey = secretKey;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TencentCredentials objTencentCredentials = (TencentCredentials) o;
  return   Objects.equals(this.secretKey, objTencentCredentials.secretKey)&&
  Objects.equals(this.secretId, objTencentCredentials.secretId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TencentCredentials {\n");
      sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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

