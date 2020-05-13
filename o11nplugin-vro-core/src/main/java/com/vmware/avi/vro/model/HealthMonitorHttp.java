package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HealthMonitorSSLAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * HealthMonitorHttp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HealthMonitorHttp")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITORHTTP, idAccessor = "getObjectID()")
@Service
public class HealthMonitorHttp extends AviRestResource  {
  @JsonProperty("auth_type")
  private String authType = null;

  @JsonProperty("exact_http_request")
  private Boolean exactHttpRequest = null;

  @JsonProperty("http_request")
  private String httpRequest = "GET / HTTP/1.0";

  @JsonProperty("http_request_body")
  private String httpRequestBody = null;

  @JsonProperty("http_response")
  private String httpResponse = null;

  @JsonProperty("http_response_code")
  @Valid
  private List<String> httpResponseCode = null;

  @JsonProperty("maintenance_code")
  @Valid
  private List<Integer> maintenanceCode = null;

  @JsonProperty("maintenance_response")
  private String maintenanceResponse = null;

  @JsonProperty("ssl_attributes")
  private HealthMonitorSSLAttributes sslAttributes = null;

  
  /**
   * Type of the authentication method. Enum options - AUTH_BASIC, AUTH_NTLM. Field introduced in 20.1.1.
   * @return authType
  **/
  @ApiModelProperty(value = "Type of the authentication method. Enum options - AUTH_BASIC, AUTH_NTLM. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getAuthType() {
    return authType;
  }
    
  @VsoMethod
  public void setAuthType(String authType) {
    this.authType = authType;
  }

  
  /**
   * Use the exact http_request string as specified by user, without any automatic insert of headers like Host header. Field introduced in 17.1.6,17.2.2.
   * @return exactHttpRequest
  **/
  @ApiModelProperty(value = "Use the exact http_request string as specified by user, without any automatic insert of headers like Host header. Field introduced in 17.1.6,17.2.2.")


 
  @VsoMethod  
  public Boolean isExactHttpRequest() {
    return exactHttpRequest;
  }
    
  @VsoMethod
  public void setExactHttpRequest(Boolean exactHttpRequest) {
    this.exactHttpRequest = exactHttpRequest;
  }

  
  /**
   * Send an HTTP request to the server.  The default GET / HTTP/1.0 may be extended with additional headers or information.  For instance, GET /index.htm HTTP/1.1 Host  www.site.com Connection  Close.
   * @return httpRequest
  **/
  @ApiModelProperty(value = "Send an HTTP request to the server.  The default GET / HTTP/1.0 may be extended with additional headers or information.  For instance, GET /index.htm HTTP/1.1 Host  www.site.com Connection  Close.")


 
  @VsoMethod  
  public String getHttpRequest() {
    return httpRequest;
  }
    
  @VsoMethod
  public void setHttpRequest(String httpRequest) {
    this.httpRequest = httpRequest;
  }

  
  /**
   * HTTP request body. Field introduced in 20.1.1.
   * @return httpRequestBody
  **/
  @ApiModelProperty(value = "HTTP request body. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getHttpRequestBody() {
    return httpRequestBody;
  }
    
  @VsoMethod
  public void setHttpRequestBody(String httpRequestBody) {
    this.httpRequestBody = httpRequestBody;
  }

  
  /**
   * Match for a keyword in the first 2Kb of the server header and body response.
   * @return httpResponse
  **/
  @ApiModelProperty(value = "Match for a keyword in the first 2Kb of the server header and body response.")


 
  @VsoMethod  
  public String getHttpResponse() {
    return httpResponse;
  }
    
  @VsoMethod
  public void setHttpResponse(String httpResponse) {
    this.httpResponse = httpResponse;
  }

  
  public HealthMonitorHttp addHttpResponseCodeItem(String httpResponseCodeItem) {
    if (this.httpResponseCode == null) {
      this.httpResponseCode = new ArrayList<String>();
    }
    this.httpResponseCode.add(httpResponseCodeItem);
    return this;
  }
  
  /**
   * List of HTTP response codes to match as successful.  Default is 2xx. Enum options - HTTP_ANY, HTTP_1XX, HTTP_2XX, HTTP_3XX, HTTP_4XX, HTTP_5XX.
   * @return httpResponseCode
  **/
  @ApiModelProperty(value = "List of HTTP response codes to match as successful.  Default is 2xx. Enum options - HTTP_ANY, HTTP_1XX, HTTP_2XX, HTTP_3XX, HTTP_4XX, HTTP_5XX.")


 
  @VsoMethod  
  public List<String> getHttpResponseCode() {
    return httpResponseCode;
  }
    
  @VsoMethod
  public void setHttpResponseCode(List<String> httpResponseCode) {
    this.httpResponseCode = httpResponseCode;
  }

  
  public HealthMonitorHttp addMaintenanceCodeItem(Integer maintenanceCodeItem) {
    if (this.maintenanceCode == null) {
      this.maintenanceCode = new ArrayList<Integer>();
    }
    this.maintenanceCode.add(maintenanceCodeItem);
    return this;
  }
  
  /**
   * Match or look for this HTTP response code indicating server maintenance.  A successful match results in the server being marked down. Allowed values are 101-599.
   * @return maintenanceCode
  **/
  @ApiModelProperty(value = "Match or look for this HTTP response code indicating server maintenance.  A successful match results in the server being marked down. Allowed values are 101-599.")


 
  @VsoMethod  
  public List<Integer> getMaintenanceCode() {
    return maintenanceCode;
  }
    
  @VsoMethod
  public void setMaintenanceCode(List<Integer> maintenanceCode) {
    this.maintenanceCode = maintenanceCode;
  }

  
  /**
   * Match or look for this keyword in the first 2KB of server header and body response indicating server maintenance.  A successful match results in the server being marked down.
   * @return maintenanceResponse
  **/
  @ApiModelProperty(value = "Match or look for this keyword in the first 2KB of server header and body response indicating server maintenance.  A successful match results in the server being marked down.")


 
  @VsoMethod  
  public String getMaintenanceResponse() {
    return maintenanceResponse;
  }
    
  @VsoMethod
  public void setMaintenanceResponse(String maintenanceResponse) {
    this.maintenanceResponse = maintenanceResponse;
  }

  
  /**
   * SSL attributes for HTTPS health monitor. Field introduced in 17.1.1.
   * @return sslAttributes
  **/
  @ApiModelProperty(value = "SSL attributes for HTTPS health monitor. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public HealthMonitorSSLAttributes getSslAttributes() {
    return sslAttributes;
  }
    
  @VsoMethod
  public void setSslAttributes(HealthMonitorSSLAttributes sslAttributes) {
    this.sslAttributes = sslAttributes;
  }

  
  public String getObjectID() {
		return "HealthMonitorHttp";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthMonitorHttp healthMonitorHttp = (HealthMonitorHttp) o;
    return Objects.equals(this.authType, healthMonitorHttp.authType) &&
        Objects.equals(this.exactHttpRequest, healthMonitorHttp.exactHttpRequest) &&
        Objects.equals(this.httpRequest, healthMonitorHttp.httpRequest) &&
        Objects.equals(this.httpRequestBody, healthMonitorHttp.httpRequestBody) &&
        Objects.equals(this.httpResponse, healthMonitorHttp.httpResponse) &&
        Objects.equals(this.httpResponseCode, healthMonitorHttp.httpResponseCode) &&
        Objects.equals(this.maintenanceCode, healthMonitorHttp.maintenanceCode) &&
        Objects.equals(this.maintenanceResponse, healthMonitorHttp.maintenanceResponse) &&
        Objects.equals(this.sslAttributes, healthMonitorHttp.sslAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, exactHttpRequest, httpRequest, httpRequestBody, httpResponse, httpResponseCode, maintenanceCode, maintenanceResponse, sslAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthMonitorHttp {\n");
    
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    exactHttpRequest: ").append(toIndentedString(exactHttpRequest)).append("\n");
    sb.append("    httpRequest: ").append(toIndentedString(httpRequest)).append("\n");
    sb.append("    httpRequestBody: ").append(toIndentedString(httpRequestBody)).append("\n");
    sb.append("    httpResponse: ").append(toIndentedString(httpResponse)).append("\n");
    sb.append("    httpResponseCode: ").append(toIndentedString(httpResponseCode)).append("\n");
    sb.append("    maintenanceCode: ").append(toIndentedString(maintenanceCode)).append("\n");
    sb.append("    maintenanceResponse: ").append(toIndentedString(maintenanceResponse)).append("\n");
    sb.append("    sslAttributes: ").append(toIndentedString(sslAttributes)).append("\n");
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

