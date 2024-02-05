package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.URIParam;
import com.vmware.avi.vro.model.URIParam;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HTTPRewriteLocHdrAction is a POJO class extends AviRestResource that used for creating
 * HTTPRewriteLocHdrAction.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPRewriteLocHdrAction")
@VsoFinder(name = Constants.FINDER_VRO_HTTPREWRITELOCHDRACTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPRewriteLocHdrAction extends AviRestResource {
    @JsonProperty("host")
    @JsonInclude(Include.NON_NULL)
    private URIParam host;

    @JsonProperty("keep_query")
    @JsonInclude(Include.NON_NULL)
    private Boolean keepQuery = true;

    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private URIParam path;

    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private Integer port;

    @JsonProperty("protocol")
    @JsonInclude(Include.NON_NULL)
    private String protocol;



  /**
   * This is the getter method this will return the attribute value.
   * Host config.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return host
   */
  @VsoMethod
  public URIParam getHost() {
    return host;
  }

  /**
   * This is the setter method to the attribute.
   * Host config.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param host set the host.
   */
  @VsoMethod
  public void setHost(URIParam host) {
    this.host = host;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Keep or drop the query from the server side redirect uri.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return keepQuery
   */
  @VsoMethod
  public Boolean getKeepQuery() {
    return keepQuery;
  }

  /**
   * This is the setter method to the attribute.
   * Keep or drop the query from the server side redirect uri.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param keepQuery set the keepQuery.
   */
  @VsoMethod
  public void setKeepQuery(Boolean  keepQuery) {
    this.keepQuery = keepQuery;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Path config.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return path
   */
  @VsoMethod
  public URIParam getPath() {
    return path;
  }

  /**
   * This is the setter method to the attribute.
   * Path config.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param path set the path.
   */
  @VsoMethod
  public void setPath(URIParam path) {
    this.path = path;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Port to use in the redirected uri.
   * Allowed values are 1-65535.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return port
   */
  @VsoMethod
  public Integer getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Port to use in the redirected uri.
   * Allowed values are 1-65535.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(Integer  port) {
    this.port = port;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http protocol type.
   * Enum options - HTTP, HTTPS.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return protocol
   */
  @VsoMethod
  public String getProtocol() {
    return protocol;
  }

  /**
   * This is the setter method to the attribute.
   * Http protocol type.
   * Enum options - HTTP, HTTPS.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param protocol set the protocol.
   */
  @VsoMethod
  public void setProtocol(String  protocol) {
    this.protocol = protocol;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTPRewriteLocHdrAction objHTTPRewriteLocHdrAction = (HTTPRewriteLocHdrAction) o;
  return   Objects.equals(this.protocol, objHTTPRewriteLocHdrAction.protocol)&&
  Objects.equals(this.port, objHTTPRewriteLocHdrAction.port)&&
  Objects.equals(this.host, objHTTPRewriteLocHdrAction.host)&&
  Objects.equals(this.path, objHTTPRewriteLocHdrAction.path)&&
  Objects.equals(this.keepQuery, objHTTPRewriteLocHdrAction.keepQuery);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HTTPRewriteLocHdrAction {\n");
      sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    keepQuery: ").append(toIndentedString(keepQuery)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

