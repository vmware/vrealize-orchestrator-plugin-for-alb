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
 * TencentCredentials
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "TencentCredentials")
@VsoFinder(name = Constants.FINDER_VRO_TENCENTCREDENTIALS, idAccessor = "getObjectID()")
@Service
public class TencentCredentials extends AviRestResource  {
  @JsonProperty("secret_id")
  private String secretId = null;

  @JsonProperty("secret_key")
  private String secretKey = null;

  
  /**
   * Tencent secret ID. Field introduced in 18.2.3.
   * @return secretId
  **/
  @ApiModelProperty(required = true, value = "Tencent secret ID. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getSecretId() {
    return secretId;
  }
    
  @VsoMethod
  public void setSecretId(String secretId) {
    this.secretId = secretId;
  }

  
  /**
   * Tencent secret key. Field introduced in 18.2.3.
   * @return secretKey
  **/
  @ApiModelProperty(required = true, value = "Tencent secret key. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getSecretKey() {
    return secretKey;
  }
    
  @VsoMethod
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  
  public String getObjectID() {
		return "TencentCredentials";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TencentCredentials tencentCredentials = (TencentCredentials) o;
    return Objects.equals(this.secretId, tencentCredentials.secretId) &&
        Objects.equals(this.secretKey, tencentCredentials.secretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretId, secretKey);
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

