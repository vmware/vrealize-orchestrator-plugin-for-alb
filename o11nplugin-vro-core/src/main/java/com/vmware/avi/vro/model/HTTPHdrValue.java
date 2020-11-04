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
 * The HTTPHdrValue is a POJO class extends AviRestResource that used for creating
 * HTTPHdrValue.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPHdrValue")
@VsoFinder(name = Constants.FINDER_VRO_HTTPHDRVALUE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPHdrValue extends AviRestResource {
    @JsonProperty("val")
    @JsonInclude(Include.NON_NULL)
    private String val = null;

    @JsonProperty("var")
    @JsonInclude(Include.NON_NULL)
    private String var = null;



  /**
   * This is the getter method this will return the attribute value.
   * Http header value or variable representing an http header.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return val
   */
  @VsoMethod
  public String getVal() {
    return val;
  }

  /**
   * This is the setter method to the attribute.
   * Http header value or variable representing an http header.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param val set the val.
   */
  @VsoMethod
  public void setVal(String  val) {
    this.val = val;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Variable.
   * Enum options - HTTP_POLICY_VAR_CLIENT_IP, HTTP_POLICY_VAR_VS_PORT, HTTP_POLICY_VAR_VS_IP, HTTP_POLICY_VAR_HTTP_HDR,
   * HTTP_POLICY_VAR_SSL_CLIENT_FINGERPRINT, HTTP_POLICY_VAR_SSL_CLIENT_SERIAL, HTTP_POLICY_VAR_SSL_CLIENT_ISSUER, HTTP_POLICY_VAR_SSL_CLIENT_SUBJECT,
   * HTTP_POLICY_VAR_SSL_CLIENT_RAW, HTTP_POLICY_VAR_SSL_PROTOCOL, HTTP_POLICY_VAR_SSL_SERVER_NAME, HTTP_POLICY_VAR_USER_NAME,
   * HTTP_POLICY_VAR_SSL_CIPHER, HTTP_POLICY_VAR_REQUEST_ID.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return var
   */
  @VsoMethod
  public String getVar() {
    return var;
  }

  /**
   * This is the setter method to the attribute.
   * Variable.
   * Enum options - HTTP_POLICY_VAR_CLIENT_IP, HTTP_POLICY_VAR_VS_PORT, HTTP_POLICY_VAR_VS_IP, HTTP_POLICY_VAR_HTTP_HDR,
   * HTTP_POLICY_VAR_SSL_CLIENT_FINGERPRINT, HTTP_POLICY_VAR_SSL_CLIENT_SERIAL, HTTP_POLICY_VAR_SSL_CLIENT_ISSUER, HTTP_POLICY_VAR_SSL_CLIENT_SUBJECT,
   * HTTP_POLICY_VAR_SSL_CLIENT_RAW, HTTP_POLICY_VAR_SSL_PROTOCOL, HTTP_POLICY_VAR_SSL_SERVER_NAME, HTTP_POLICY_VAR_USER_NAME,
   * HTTP_POLICY_VAR_SSL_CIPHER, HTTP_POLICY_VAR_REQUEST_ID.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param var set the var.
   */
  @VsoMethod
  public void setVar(String  var) {
    this.var = var;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTPHdrValue objHTTPHdrValue = (HTTPHdrValue) o;
  return   Objects.equals(this.var, objHTTPHdrValue.var)&&
  Objects.equals(this.val, objHTTPHdrValue.val);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HTTPHdrValue {\n");
      sb.append("    val: ").append(toIndentedString(val)).append("\n");
        sb.append("    var: ").append(toIndentedString(var)).append("\n");
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

