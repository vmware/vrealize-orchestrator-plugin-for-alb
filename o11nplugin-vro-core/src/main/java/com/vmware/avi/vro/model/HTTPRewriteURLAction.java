package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.URIParam;
import com.vmware.avi.vro.model.URIParam;
import com.vmware.avi.vro.model.URIParamQuery;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HTTPRewriteURLAction is a POJO class extends AviRestResource that used for creating
 * HTTPRewriteURLAction.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPRewriteURLAction")
@VsoFinder(name = Constants.FINDER_VRO_HTTPREWRITEURLACTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPRewriteURLAction extends AviRestResource {
    @JsonProperty("host_hdr")
    @JsonInclude(Include.NON_NULL)
    private URIParam hostHdr = null;

    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private URIParam path = null;

    @JsonProperty("query")
    @JsonInclude(Include.NON_NULL)
    private URIParamQuery query = null;



  /**
   * This is the getter method this will return the attribute value.
   * Host config.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostHdr
   */
  @VsoMethod
  public URIParam getHostHdr() {
    return hostHdr;
  }

  /**
   * This is the setter method to the attribute.
   * Host config.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostHdr set the hostHdr.
   */
  @VsoMethod
  public void setHostHdr(URIParam hostHdr) {
    this.hostHdr = hostHdr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Path config.
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
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param path set the path.
   */
  @VsoMethod
  public void setPath(URIParam path) {
    this.path = path;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Query config.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return query
   */
  @VsoMethod
  public URIParamQuery getQuery() {
    return query;
  }

  /**
   * This is the setter method to the attribute.
   * Query config.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param query set the query.
   */
  @VsoMethod
  public void setQuery(URIParamQuery query) {
    this.query = query;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTPRewriteURLAction objHTTPRewriteURLAction = (HTTPRewriteURLAction) o;
  return   Objects.equals(this.hostHdr, objHTTPRewriteURLAction.hostHdr)&&
  Objects.equals(this.path, objHTTPRewriteURLAction.path)&&
  Objects.equals(this.query, objHTTPRewriteURLAction.query);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HTTPRewriteURLAction {\n");
      sb.append("    hostHdr: ").append(toIndentedString(hostHdr)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

