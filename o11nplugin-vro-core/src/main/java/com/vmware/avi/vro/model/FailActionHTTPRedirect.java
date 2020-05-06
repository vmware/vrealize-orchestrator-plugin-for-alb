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
 * FailActionHTTPRedirect
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:16:36.466+05:30")

@VsoObject(create = false, name = "FailActionHTTPRedirect")
@VsoFinder(name = Constants.FINDER_VRO_FAILACTIONHTTPREDIRECT, idAccessor = "getObjectID()")
@Service
public class FailActionHTTPRedirect extends AviRestResource  {
  @JsonProperty("host")
  private String host = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("protocol")
  private String protocol = "HTTPS";

  @JsonProperty("query")
  private String query = null;

  @JsonProperty("status_code")
  private String statusCode = "HTTP_REDIRECT_STATUS_CODE_302";

  
  /**
   * host of FailActionHTTPRedirect.
   * @return host
  **/
  @ApiModelProperty(required = true, value = "host of FailActionHTTPRedirect.")
  @NotNull


 
  @VsoMethod  
  public String getHost() {
    return host;
  }
    
  @VsoMethod
  public void setHost(String host) {
    this.host = host;
  }

  
  /**
   * path of FailActionHTTPRedirect.
   * @return path
  **/
  @ApiModelProperty(value = "path of FailActionHTTPRedirect.")


 
  @VsoMethod  
  public String getPath() {
    return path;
  }
    
  @VsoMethod
  public void setPath(String path) {
    this.path = path;
  }

  
  /**
   *  Enum options - HTTP, HTTPS.
   * @return protocol
  **/
  @ApiModelProperty(value = " Enum options - HTTP, HTTPS.")


 
  @VsoMethod  
  public String getProtocol() {
    return protocol;
  }
    
  @VsoMethod
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  
  /**
   * query of FailActionHTTPRedirect.
   * @return query
  **/
  @ApiModelProperty(value = "query of FailActionHTTPRedirect.")


 
  @VsoMethod  
  public String getQuery() {
    return query;
  }
    
  @VsoMethod
  public void setQuery(String query) {
    this.query = query;
  }

  
  /**
   *  Enum options - HTTP_REDIRECT_STATUS_CODE_301, HTTP_REDIRECT_STATUS_CODE_302, HTTP_REDIRECT_STATUS_CODE_307.
   * @return statusCode
  **/
  @ApiModelProperty(value = " Enum options - HTTP_REDIRECT_STATUS_CODE_301, HTTP_REDIRECT_STATUS_CODE_302, HTTP_REDIRECT_STATUS_CODE_307.")


 
  @VsoMethod  
  public String getStatusCode() {
    return statusCode;
  }
    
  @VsoMethod
  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  
  public String getObjectID() {
		return "FailActionHTTPRedirect";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailActionHTTPRedirect failActionHTTPRedirect = (FailActionHTTPRedirect) o;
    return Objects.equals(this.host, failActionHTTPRedirect.host) &&
        Objects.equals(this.path, failActionHTTPRedirect.path) &&
        Objects.equals(this.protocol, failActionHTTPRedirect.protocol) &&
        Objects.equals(this.query, failActionHTTPRedirect.query) &&
        Objects.equals(this.statusCode, failActionHTTPRedirect.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, path, protocol, query, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailActionHTTPRedirect {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

