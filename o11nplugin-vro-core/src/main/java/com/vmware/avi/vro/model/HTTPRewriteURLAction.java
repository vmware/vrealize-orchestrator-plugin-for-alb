package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.URIParam;
import com.vmware.avi.vro.model.URIParamQuery;
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
 * HTTPRewriteURLAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPRewriteURLAction")
@VsoFinder(name = Constants.FINDER_VRO_HTTPREWRITEURLACTION, idAccessor = "getObjectID()")
@Service
public class HTTPRewriteURLAction extends AviRestResource  {
  @JsonProperty("host_hdr")
  private URIParam hostHdr = null;

  @JsonProperty("path")
  private URIParam path = null;

  @JsonProperty("query")
  private URIParamQuery query = null;

  
  /**
   * Host config.
   * @return hostHdr
  **/
  @ApiModelProperty(value = "Host config.")

  @Valid

 
  @VsoMethod  
  public URIParam getHostHdr() {
    return hostHdr;
  }
    
  @VsoMethod
  public void setHostHdr(URIParam hostHdr) {
    this.hostHdr = hostHdr;
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
   * Query config.
   * @return query
  **/
  @ApiModelProperty(value = "Query config.")

  @Valid

 
  @VsoMethod  
  public URIParamQuery getQuery() {
    return query;
  }
    
  @VsoMethod
  public void setQuery(URIParamQuery query) {
    this.query = query;
  }

  
  public String getObjectID() {
		return "HTTPRewriteURLAction";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPRewriteURLAction htTPRewriteURLAction = (HTTPRewriteURLAction) o;
    return Objects.equals(this.hostHdr, htTPRewriteURLAction.hostHdr) &&
        Objects.equals(this.path, htTPRewriteURLAction.path) &&
        Objects.equals(this.query, htTPRewriteURLAction.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostHdr, path, query);
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

