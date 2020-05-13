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
 * AwsEncryption
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AwsEncryption")
@VsoFinder(name = Constants.FINDER_VRO_AWSENCRYPTION, idAccessor = "getObjectID()")
@Service
public class AwsEncryption extends AviRestResource  {
  @JsonProperty("master_key")
  private String masterKey = null;

  @JsonProperty("mode")
  private String mode = "AWS_ENCRYPTION_MODE_NONE";

  
  /**
   * AWS KMS ARN ID of the master key for encryption. Field introduced in 17.2.3.
   * @return masterKey
  **/
  @ApiModelProperty(value = "AWS KMS ARN ID of the master key for encryption. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getMasterKey() {
    return masterKey;
  }
    
  @VsoMethod
  public void setMasterKey(String masterKey) {
    this.masterKey = masterKey;
  }

  
  /**
   * AWS encryption mode. Enum options - AWS_ENCRYPTION_MODE_NONE, AWS_ENCRYPTION_MODE_SSE_KMS. Field introduced in 17.2.3.
   * @return mode
  **/
  @ApiModelProperty(value = "AWS encryption mode. Enum options - AWS_ENCRYPTION_MODE_NONE, AWS_ENCRYPTION_MODE_SSE_KMS. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getMode() {
    return mode;
  }
    
  @VsoMethod
  public void setMode(String mode) {
    this.mode = mode;
  }

  
  public String getObjectID() {
		return "AwsEncryption";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEncryption awsEncryption = (AwsEncryption) o;
    return Objects.equals(this.masterKey, awsEncryption.masterKey) &&
        Objects.equals(this.mode, awsEncryption.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(masterKey, mode);
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

