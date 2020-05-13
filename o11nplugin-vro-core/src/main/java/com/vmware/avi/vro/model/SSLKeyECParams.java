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
 * SSLKeyECParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SSLKeyECParams")
@VsoFinder(name = Constants.FINDER_VRO_SSLKEYECPARAMS, idAccessor = "getObjectID()")
@Service
public class SSLKeyECParams extends AviRestResource  {
  @JsonProperty("curve")
  private String curve = "SSL_KEY_EC_CURVE_SECP256R1";

  
  /**
   *  Enum options - SSL_KEY_EC_CURVE_SECP256R1, SSL_KEY_EC_CURVE_SECP384R1, SSL_KEY_EC_CURVE_SECP521R1.
   * @return curve
  **/
  @ApiModelProperty(value = " Enum options - SSL_KEY_EC_CURVE_SECP256R1, SSL_KEY_EC_CURVE_SECP384R1, SSL_KEY_EC_CURVE_SECP521R1.")


 
  @VsoMethod  
  public String getCurve() {
    return curve;
  }
    
  @VsoMethod
  public void setCurve(String curve) {
    this.curve = curve;
  }

  
  public String getObjectID() {
		return "SSLKeyECParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSLKeyECParams ssLKeyECParams = (SSLKeyECParams) o;
    return Objects.equals(this.curve, ssLKeyECParams.curve);
  }

  @Override
  public int hashCode() {
    return Objects.hash(curve);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSLKeyECParams {\n");
    
    sb.append("    curve: ").append(toIndentedString(curve)).append("\n");
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

