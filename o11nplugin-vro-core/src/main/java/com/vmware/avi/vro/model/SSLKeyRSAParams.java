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
 * SSLKeyRSAParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SSLKeyRSAParams")
@VsoFinder(name = Constants.FINDER_VRO_SSLKEYRSAPARAMS, idAccessor = "getObjectID()")
@Service
public class SSLKeyRSAParams extends AviRestResource  {
  @JsonProperty("exponent")
  private Integer exponent = 65537;

  @JsonProperty("key_size")
  private String keySize = "SSL_KEY_2048_BITS";

  
  /**
   * Number of exponent.
   * @return exponent
  **/
  @ApiModelProperty(value = "Number of exponent.")


 
  @VsoMethod  
  public Integer getExponent() {
    return exponent;
  }
    
  @VsoMethod
  public void setExponent(Integer exponent) {
    this.exponent = exponent;
  }

  
  /**
   *  Enum options - SSL_KEY_1024_BITS, SSL_KEY_2048_BITS, SSL_KEY_3072_BITS, SSL_KEY_4096_BITS.
   * @return keySize
  **/
  @ApiModelProperty(value = " Enum options - SSL_KEY_1024_BITS, SSL_KEY_2048_BITS, SSL_KEY_3072_BITS, SSL_KEY_4096_BITS.")


 
  @VsoMethod  
  public String getKeySize() {
    return keySize;
  }
    
  @VsoMethod
  public void setKeySize(String keySize) {
    this.keySize = keySize;
  }

  
  public String getObjectID() {
		return "SSLKeyRSAParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSLKeyRSAParams ssLKeyRSAParams = (SSLKeyRSAParams) o;
    return Objects.equals(this.exponent, ssLKeyRSAParams.exponent) &&
        Objects.equals(this.keySize, ssLKeyRSAParams.keySize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exponent, keySize);
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

