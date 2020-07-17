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
 * The AwsEncryption is a POJO class extends AviRestResource that used for creating
 * AwsEncryption.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AwsEncryption")
@VsoFinder(name = Constants.FINDER_VRO_AWSENCRYPTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AwsEncryption extends AviRestResource {
  @JsonProperty("master_key")
  @JsonInclude(Include.NON_NULL)
  private String masterKey = null;

  @JsonProperty("mode")
  @JsonInclude(Include.NON_NULL)
  private String mode = "AWS_ENCRYPTION_MODE_NONE";



  /**
   * This is the getter method this will return the attribute value.
   * Aws kms arn id of the master key for encryption.
   * Field introduced in 17.2.3.
   * @return masterKey
   */
  @VsoMethod
  public String getMasterKey() {
    return masterKey;
  }

  /**
   * This is the setter method to the attribute.
   * Aws kms arn id of the master key for encryption.
   * Field introduced in 17.2.3.
   * @param masterKey set the masterKey.
   */
  @VsoMethod
  public void setMasterKey(String  masterKey) {
    this.masterKey = masterKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Aws encryption mode.
   * Enum options - AWS_ENCRYPTION_MODE_NONE, AWS_ENCRYPTION_MODE_SSE_KMS.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as AWS_ENCRYPTION_MODE_NONE.
   * @return mode
   */
  @VsoMethod
  public String getMode() {
    return mode;
  }

  /**
   * This is the setter method to the attribute.
   * Aws encryption mode.
   * Enum options - AWS_ENCRYPTION_MODE_NONE, AWS_ENCRYPTION_MODE_SSE_KMS.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as AWS_ENCRYPTION_MODE_NONE.
   * @param mode set the mode.
   */
  @VsoMethod
  public void setMode(String  mode) {
    this.mode = mode;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AwsEncryption objAwsEncryption = (AwsEncryption) o;
  return   Objects.equals(this.masterKey, objAwsEncryption.masterKey)&&
  Objects.equals(this.mode, objAwsEncryption.mode);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AwsEncryption {\n");
      sb.append("    masterKey: ").append(toIndentedString(masterKey)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

