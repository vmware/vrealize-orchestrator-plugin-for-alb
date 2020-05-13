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
 * SSLClientRequestHeader
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SSLClientRequestHeader")
@VsoFinder(name = Constants.FINDER_VRO_SSLCLIENTREQUESTHEADER, idAccessor = "getObjectID()")
@Service
public class SSLClientRequestHeader extends AviRestResource  {
  @JsonProperty("request_header")
  private String requestHeader = null;

  @JsonProperty("request_header_value")
  private String requestHeaderValue = null;

  
  /**
   * If this header exists, reset the connection. If the ssl variable is specified, add a header with this value.
   * @return requestHeader
  **/
  @ApiModelProperty(value = "If this header exists, reset the connection. If the ssl variable is specified, add a header with this value.")


 
  @VsoMethod  
  public String getRequestHeader() {
    return requestHeader;
  }
    
  @VsoMethod
  public void setRequestHeader(String requestHeader) {
    this.requestHeader = requestHeader;
  }

  
  /**
   * Set the request header with the value as indicated by this SSL variable. Eg. send the whole certificate in PEM format. Enum options - HTTP_POLICY_VAR_CLIENT_IP, HTTP_POLICY_VAR_VS_PORT, HTTP_POLICY_VAR_VS_IP, HTTP_POLICY_VAR_HTTP_HDR, HTTP_POLICY_VAR_SSL_CLIENT_FINGERPRINT, HTTP_POLICY_VAR_SSL_CLIENT_SERIAL, HTTP_POLICY_VAR_SSL_CLIENT_ISSUER, HTTP_POLICY_VAR_SSL_CLIENT_SUBJECT, HTTP_POLICY_VAR_SSL_CLIENT_RAW, HTTP_POLICY_VAR_SSL_PROTOCOL, HTTP_POLICY_VAR_SSL_SERVER_NAME, HTTP_POLICY_VAR_USER_NAME, HTTP_POLICY_VAR_SSL_CIPHER, HTTP_POLICY_VAR_REQUEST_ID.
   * @return requestHeaderValue
  **/
  @ApiModelProperty(value = "Set the request header with the value as indicated by this SSL variable. Eg. send the whole certificate in PEM format. Enum options - HTTP_POLICY_VAR_CLIENT_IP, HTTP_POLICY_VAR_VS_PORT, HTTP_POLICY_VAR_VS_IP, HTTP_POLICY_VAR_HTTP_HDR, HTTP_POLICY_VAR_SSL_CLIENT_FINGERPRINT, HTTP_POLICY_VAR_SSL_CLIENT_SERIAL, HTTP_POLICY_VAR_SSL_CLIENT_ISSUER, HTTP_POLICY_VAR_SSL_CLIENT_SUBJECT, HTTP_POLICY_VAR_SSL_CLIENT_RAW, HTTP_POLICY_VAR_SSL_PROTOCOL, HTTP_POLICY_VAR_SSL_SERVER_NAME, HTTP_POLICY_VAR_USER_NAME, HTTP_POLICY_VAR_SSL_CIPHER, HTTP_POLICY_VAR_REQUEST_ID.")


 
  @VsoMethod  
  public String getRequestHeaderValue() {
    return requestHeaderValue;
  }
    
  @VsoMethod
  public void setRequestHeaderValue(String requestHeaderValue) {
    this.requestHeaderValue = requestHeaderValue;
  }

  
  public String getObjectID() {
		return "SSLClientRequestHeader";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSLClientRequestHeader ssLClientRequestHeader = (SSLClientRequestHeader) o;
    return Objects.equals(this.requestHeader, ssLClientRequestHeader.requestHeader) &&
        Objects.equals(this.requestHeaderValue, ssLClientRequestHeader.requestHeaderValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, requestHeaderValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSLClientRequestHeader {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    requestHeaderValue: ").append(toIndentedString(requestHeaderValue)).append("\n");
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

