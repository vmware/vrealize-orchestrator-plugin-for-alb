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
 * The FailActionHTTPRedirect is a POJO class extends AviRestResource that used for creating
 * FailActionHTTPRedirect.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "FailActionHTTPRedirect")
@VsoFinder(name = Constants.FINDER_VRO_FAILACTIONHTTPREDIRECT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class FailActionHTTPRedirect extends AviRestResource {
  @JsonProperty("host")
  @JsonInclude(Include.NON_NULL)
  private String host = null;

  @JsonProperty("path")
  @JsonInclude(Include.NON_NULL)
  private String path = null;

  @JsonProperty("protocol")
  @JsonInclude(Include.NON_NULL)
  private String protocol = "HTTPS";

  @JsonProperty("query")
  @JsonInclude(Include.NON_NULL)
  private String query = null;

  @JsonProperty("status_code")
  @JsonInclude(Include.NON_NULL)
  private String statusCode = "HTTP_REDIRECT_STATUS_CODE_302";



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property host of obj type failactionhttpredirect field type str  type string.
   * @return host
   */
  @VsoMethod
  public String getHost() {
    return host;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property host of obj type failactionhttpredirect field type str  type string.
   * @param host set the host.
   */
  @VsoMethod
  public void setHost(String  host) {
    this.host = host;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property path of obj type failactionhttpredirect field type str  type string.
   * @return path
   */
  @VsoMethod
  public String getPath() {
    return path;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property path of obj type failactionhttpredirect field type str  type string.
   * @param path set the path.
   */
  @VsoMethod
  public void setPath(String  path) {
    this.path = path;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - HTTP, HTTPS.
   * Default value when not specified in API or module is interpreted by Avi Controller as HTTPS.
   * @return protocol
   */
  @VsoMethod
  public String getProtocol() {
    return protocol;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - HTTP, HTTPS.
   * Default value when not specified in API or module is interpreted by Avi Controller as HTTPS.
   * @param protocol set the protocol.
   */
  @VsoMethod
  public void setProtocol(String  protocol) {
    this.protocol = protocol;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property query of obj type failactionhttpredirect field type str  type string.
   * @return query
   */
  @VsoMethod
  public String getQuery() {
    return query;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property query of obj type failactionhttpredirect field type str  type string.
   * @param query set the query.
   */
  @VsoMethod
  public void setQuery(String  query) {
    this.query = query;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - HTTP_REDIRECT_STATUS_CODE_301, HTTP_REDIRECT_STATUS_CODE_302, HTTP_REDIRECT_STATUS_CODE_307.
   * Default value when not specified in API or module is interpreted by Avi Controller as HTTP_REDIRECT_STATUS_CODE_302.
   * @return statusCode
   */
  @VsoMethod
  public String getStatusCode() {
    return statusCode;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - HTTP_REDIRECT_STATUS_CODE_301, HTTP_REDIRECT_STATUS_CODE_302, HTTP_REDIRECT_STATUS_CODE_307.
   * Default value when not specified in API or module is interpreted by Avi Controller as HTTP_REDIRECT_STATUS_CODE_302.
   * @param statusCode set the statusCode.
   */
  @VsoMethod
  public void setStatusCode(String  statusCode) {
    this.statusCode = statusCode;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  FailActionHTTPRedirect objFailActionHTTPRedirect = (FailActionHTTPRedirect) o;
  return   Objects.equals(this.protocol, objFailActionHTTPRedirect.protocol)&&
  Objects.equals(this.host, objFailActionHTTPRedirect.host)&&
  Objects.equals(this.path, objFailActionHTTPRedirect.path)&&
  Objects.equals(this.query, objFailActionHTTPRedirect.query)&&
  Objects.equals(this.statusCode, objFailActionHTTPRedirect.statusCode);
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

