package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.URIParam;
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
 * HTTPRedirectAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPRedirectAction")
@VsoFinder(name = Constants.FINDER_VRO_HTTPREDIRECTACTION, idAccessor = "getObjectID()")
@Service
public class HTTPRedirectAction extends AviRestResource  {
  @JsonProperty("host")
  private URIParam host = null;

  @JsonProperty("keep_query")
  private Boolean keepQuery = true;

  @JsonProperty("path")
  private URIParam path = null;

  @JsonProperty("port")
  private Integer port = null;

  @JsonProperty("protocol")
  private String protocol = null;

  @JsonProperty("status_code")
  private String statusCode = "HTTP_REDIRECT_STATUS_CODE_302";

  
  /**
   * Host config.
   * @return host
  **/
  @ApiModelProperty(value = "Host config.")

  @Valid

 
  @VsoMethod  
  public URIParam getHost() {
    return host;
  }
    
  @VsoMethod
  public void setHost(URIParam host) {
    this.host = host;
  }

  
  /**
   * Keep or drop the query of the incoming request URI in the redirected URI.
   * @return keepQuery
  **/
  @ApiModelProperty(value = "Keep or drop the query of the incoming request URI in the redirected URI.")


 
  @VsoMethod  
  public Boolean isKeepQuery() {
    return keepQuery;
  }
    
  @VsoMethod
  public void setKeepQuery(Boolean keepQuery) {
    this.keepQuery = keepQuery;
  }

  
  /**
   * Path config.
   * @return path
  **/
  @ApiModelProperty(value = "Path config.")

  @Valid

 
  @VsoMethod  
  public URIParam getPath() {
    return path;
  }
    
  @VsoMethod
  public void setPath(URIParam path) {
    this.path = path;
  }

  
  /**
   * Port to which redirect the request. Allowed values are 1-65535.
   * @return port
  **/
  @ApiModelProperty(value = "Port to which redirect the request. Allowed values are 1-65535.")


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  /**
   * Protocol type. Enum options - HTTP, HTTPS.
   * @return protocol
  **/
  @ApiModelProperty(required = true, value = "Protocol type. Enum options - HTTP, HTTPS.")
  @NotNull


 
  @VsoMethod  
  public String getProtocol() {
    return protocol;
  }
    
  @VsoMethod
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  
  /**
   * HTTP redirect status code. Enum options - HTTP_REDIRECT_STATUS_CODE_301, HTTP_REDIRECT_STATUS_CODE_302, HTTP_REDIRECT_STATUS_CODE_307.
   * @return statusCode
  **/
  @ApiModelProperty(value = "HTTP redirect status code. Enum options - HTTP_REDIRECT_STATUS_CODE_301, HTTP_REDIRECT_STATUS_CODE_302, HTTP_REDIRECT_STATUS_CODE_307.")


 
  @VsoMethod  
  public String getStatusCode() {
    return statusCode;
  }
    
  @VsoMethod
  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  
  public String getObjectID() {
		return "HTTPRedirectAction";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPRedirectAction htTPRedirectAction = (HTTPRedirectAction) o;
    return Objects.equals(this.host, htTPRedirectAction.host) &&
        Objects.equals(this.keepQuery, htTPRedirectAction.keepQuery) &&
        Objects.equals(this.path, htTPRedirectAction.path) &&
        Objects.equals(this.port, htTPRedirectAction.port) &&
        Objects.equals(this.protocol, htTPRedirectAction.protocol) &&
        Objects.equals(this.statusCode, htTPRedirectAction.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, keepQuery, path, port, protocol, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPRedirectAction {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    keepQuery: ").append(toIndentedString(keepQuery)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

