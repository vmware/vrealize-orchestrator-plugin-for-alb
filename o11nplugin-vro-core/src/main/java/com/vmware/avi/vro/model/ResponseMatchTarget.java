package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CookieMatch;
import com.vmware.avi.vro.model.HTTPStatusMatch;
import com.vmware.avi.vro.model.HTTPVersionMatch;
import com.vmware.avi.vro.model.HdrMatch;
import com.vmware.avi.vro.model.HostHdrMatch;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.LocationHdrMatch;
import com.vmware.avi.vro.model.MethodMatch;
import com.vmware.avi.vro.model.PathMatch;
import com.vmware.avi.vro.model.PortMatch;
import com.vmware.avi.vro.model.ProtocolMatch;
import com.vmware.avi.vro.model.QueryMatch;
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
 * ResponseMatchTarget
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ResponseMatchTarget")
@VsoFinder(name = Constants.FINDER_VRO_RESPONSEMATCHTARGET, idAccessor = "getObjectID()")
@Service
public class ResponseMatchTarget extends AviRestResource  {
  @JsonProperty("client_ip")
  private IpAddrMatch clientIp = null;

  @JsonProperty("cookie")
  private CookieMatch cookie = null;

  @JsonProperty("hdrs")
  @Valid
  private List<HdrMatch> hdrs = null;

  @JsonProperty("host_hdr")
  private HostHdrMatch hostHdr = null;

  @JsonProperty("loc_hdr")
  private LocationHdrMatch locHdr = null;

  @JsonProperty("method")
  private MethodMatch method = null;

  @JsonProperty("path")
  private PathMatch path = null;

  @JsonProperty("protocol")
  private ProtocolMatch protocol = null;

  @JsonProperty("query")
  private QueryMatch query = null;

  @JsonProperty("rsp_hdrs")
  @Valid
  private List<HdrMatch> rspHdrs = null;

  @JsonProperty("status")
  private HTTPStatusMatch status = null;

  @JsonProperty("version")
  private HTTPVersionMatch version = null;

  @JsonProperty("vs_port")
  private PortMatch vsPort = null;

  
  /**
   * Configure client ip addresses.
   * @return clientIp
  **/
  @ApiModelProperty(value = "Configure client ip addresses.")

  @Valid

 
  @VsoMethod  
  public IpAddrMatch getClientIp() {
    return clientIp;
  }
    
  @VsoMethod
  public void setClientIp(IpAddrMatch clientIp) {
    this.clientIp = clientIp;
  }

  
  /**
   * Configure HTTP cookie(s).
   * @return cookie
  **/
  @ApiModelProperty(value = "Configure HTTP cookie(s).")

  @Valid

 
  @VsoMethod  
  public CookieMatch getCookie() {
    return cookie;
  }
    
  @VsoMethod
  public void setCookie(CookieMatch cookie) {
    this.cookie = cookie;
  }

  
  public ResponseMatchTarget addHdrsItem(HdrMatch hdrsItem) {
    if (this.hdrs == null) {
      this.hdrs = new ArrayList<HdrMatch>();
    }
    this.hdrs.add(hdrsItem);
    return this;
  }
  
  /**
   * Configure HTTP headers.
   * @return hdrs
  **/
  @ApiModelProperty(value = "Configure HTTP headers.")

  @Valid

 
  @VsoMethod  
  public List<HdrMatch> getHdrs() {
    return hdrs;
  }
    
  @VsoMethod
  public void setHdrs(List<HdrMatch> hdrs) {
    this.hdrs = hdrs;
  }

  
  /**
   * Configure the host header.
   * @return hostHdr
  **/
  @ApiModelProperty(value = "Configure the host header.")

  @Valid

 
  @VsoMethod  
  public HostHdrMatch getHostHdr() {
    return hostHdr;
  }
    
  @VsoMethod
  public void setHostHdr(HostHdrMatch hostHdr) {
    this.hostHdr = hostHdr;
  }

  
  /**
   * Configure the location header.
   * @return locHdr
  **/
  @ApiModelProperty(value = "Configure the location header.")

  @Valid

 
  @VsoMethod  
  public LocationHdrMatch getLocHdr() {
    return locHdr;
  }
    
  @VsoMethod
  public void setLocHdr(LocationHdrMatch locHdr) {
    this.locHdr = locHdr;
  }

  
  /**
   * Configure HTTP methods.
   * @return method
  **/
  @ApiModelProperty(value = "Configure HTTP methods.")

  @Valid

 
  @VsoMethod  
  public MethodMatch getMethod() {
    return method;
  }
    
  @VsoMethod
  public void setMethod(MethodMatch method) {
    this.method = method;
  }

  
  /**
   * Configure request paths.
   * @return path
  **/
  @ApiModelProperty(value = "Configure request paths.")

  @Valid

 
  @VsoMethod  
  public PathMatch getPath() {
    return path;
  }
    
  @VsoMethod
  public void setPath(PathMatch path) {
    this.path = path;
  }

  
  /**
   * Configure the type of HTTP protocol.
   * @return protocol
  **/
  @ApiModelProperty(value = "Configure the type of HTTP protocol.")

  @Valid

 
  @VsoMethod  
  public ProtocolMatch getProtocol() {
    return protocol;
  }
    
  @VsoMethod
  public void setProtocol(ProtocolMatch protocol) {
    this.protocol = protocol;
  }

  
  /**
   * Configure request query.
   * @return query
  **/
  @ApiModelProperty(value = "Configure request query.")

  @Valid

 
  @VsoMethod  
  public QueryMatch getQuery() {
    return query;
  }
    
  @VsoMethod
  public void setQuery(QueryMatch query) {
    this.query = query;
  }

  
  public ResponseMatchTarget addRspHdrsItem(HdrMatch rspHdrsItem) {
    if (this.rspHdrs == null) {
      this.rspHdrs = new ArrayList<HdrMatch>();
    }
    this.rspHdrs.add(rspHdrsItem);
    return this;
  }
  
  /**
   * Configure the HTTP headers in response.
   * @return rspHdrs
  **/
  @ApiModelProperty(value = "Configure the HTTP headers in response.")

  @Valid

 
  @VsoMethod  
  public List<HdrMatch> getRspHdrs() {
    return rspHdrs;
  }
    
  @VsoMethod
  public void setRspHdrs(List<HdrMatch> rspHdrs) {
    this.rspHdrs = rspHdrs;
  }

  
  /**
   * Configure the HTTP status code(s).
   * @return status
  **/
  @ApiModelProperty(value = "Configure the HTTP status code(s).")

  @Valid

 
  @VsoMethod  
  public HTTPStatusMatch getStatus() {
    return status;
  }
    
  @VsoMethod
  public void setStatus(HTTPStatusMatch status) {
    this.status = status;
  }

  
  /**
   * Configure versions of the HTTP protocol.
   * @return version
  **/
  @ApiModelProperty(value = "Configure versions of the HTTP protocol.")

  @Valid

 
  @VsoMethod  
  public HTTPVersionMatch getVersion() {
    return version;
  }
    
  @VsoMethod
  public void setVersion(HTTPVersionMatch version) {
    this.version = version;
  }

  
  /**
   * Configure virtual service ports.
   * @return vsPort
  **/
  @ApiModelProperty(value = "Configure virtual service ports.")

  @Valid

 
  @VsoMethod  
  public PortMatch getVsPort() {
    return vsPort;
  }
    
  @VsoMethod
  public void setVsPort(PortMatch vsPort) {
    this.vsPort = vsPort;
  }

  
  public String getObjectID() {
		return "ResponseMatchTarget";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseMatchTarget responseMatchTarget = (ResponseMatchTarget) o;
    return Objects.equals(this.clientIp, responseMatchTarget.clientIp) &&
        Objects.equals(this.cookie, responseMatchTarget.cookie) &&
        Objects.equals(this.hdrs, responseMatchTarget.hdrs) &&
        Objects.equals(this.hostHdr, responseMatchTarget.hostHdr) &&
        Objects.equals(this.locHdr, responseMatchTarget.locHdr) &&
        Objects.equals(this.method, responseMatchTarget.method) &&
        Objects.equals(this.path, responseMatchTarget.path) &&
        Objects.equals(this.protocol, responseMatchTarget.protocol) &&
        Objects.equals(this.query, responseMatchTarget.query) &&
        Objects.equals(this.rspHdrs, responseMatchTarget.rspHdrs) &&
        Objects.equals(this.status, responseMatchTarget.status) &&
        Objects.equals(this.version, responseMatchTarget.version) &&
        Objects.equals(this.vsPort, responseMatchTarget.vsPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIp, cookie, hdrs, hostHdr, locHdr, method, path, protocol, query, rspHdrs, status, version, vsPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseMatchTarget {\n");
    
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    cookie: ").append(toIndentedString(cookie)).append("\n");
    sb.append("    hdrs: ").append(toIndentedString(hdrs)).append("\n");
    sb.append("    hostHdr: ").append(toIndentedString(hostHdr)).append("\n");
    sb.append("    locHdr: ").append(toIndentedString(locHdr)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    rspHdrs: ").append(toIndentedString(rspHdrs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    vsPort: ").append(toIndentedString(vsPort)).append("\n");
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

