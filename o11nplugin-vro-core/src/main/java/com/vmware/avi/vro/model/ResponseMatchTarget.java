package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.CookieMatch;
import com.vmware.avi.vro.model.HostHdrMatch;
import com.vmware.avi.vro.model.LocationHdrMatch;
import com.vmware.avi.vro.model.MethodMatch;
import com.vmware.avi.vro.model.PathMatch;
import com.vmware.avi.vro.model.ProtocolMatch;
import com.vmware.avi.vro.model.QueryMatch;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.HTTPStatusMatch;
import com.vmware.avi.vro.model.HTTPVersionMatch;
import com.vmware.avi.vro.model.PortMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ResponseMatchTarget is a POJO class extends AviRestResource that used for creating
 * ResponseMatchTarget.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ResponseMatchTarget")
@VsoFinder(name = Constants.FINDER_VRO_RESPONSEMATCHTARGET)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ResponseMatchTarget extends AviRestResource {
    @JsonProperty("client_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddrMatch clientIp;

    @JsonProperty("cookie")
    @JsonInclude(Include.NON_NULL)
    private CookieMatch cookie;

    @JsonProperty("hdrs")
    @JsonInclude(Include.NON_NULL)
    private List<HdrMatch> hdrs;

    @JsonProperty("host_hdr")
    @JsonInclude(Include.NON_NULL)
    private HostHdrMatch hostHdr;

    @JsonProperty("loc_hdr")
    @JsonInclude(Include.NON_NULL)
    private LocationHdrMatch locHdr;

    @JsonProperty("method")
    @JsonInclude(Include.NON_NULL)
    private MethodMatch method;

    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private PathMatch path;

    @JsonProperty("protocol")
    @JsonInclude(Include.NON_NULL)
    private ProtocolMatch protocol;

    @JsonProperty("query")
    @JsonInclude(Include.NON_NULL)
    private QueryMatch query;

    @JsonProperty("rsp_hdrs")
    @JsonInclude(Include.NON_NULL)
    private List<HdrMatch> rspHdrs;

    @JsonProperty("source_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddrMatch sourceIp;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private HTTPStatusMatch status;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private HTTPVersionMatch version;

    @JsonProperty("vs_port")
    @JsonInclude(Include.NON_NULL)
    private PortMatch vsPort;



  /**
   * This is the getter method this will return the attribute value.
   * Configure client ip addresses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientIp
   */
  @VsoMethod
  public IpAddrMatch getClientIp() {
    return clientIp;
  }

  /**
   * This is the setter method to the attribute.
   * Configure client ip addresses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIp set the clientIp.
   */
  @VsoMethod
  public void setClientIp(IpAddrMatch clientIp) {
    this.clientIp = clientIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure http cookie(s).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cookie
   */
  @VsoMethod
  public CookieMatch getCookie() {
    return cookie;
  }

  /**
   * This is the setter method to the attribute.
   * Configure http cookie(s).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cookie set the cookie.
   */
  @VsoMethod
  public void setCookie(CookieMatch cookie) {
    this.cookie = cookie;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure http headers.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hdrs
   */
  @VsoMethod
  public List<HdrMatch> getHdrs() {
    return hdrs;
  }

  /**
   * This is the setter method. this will set the hdrs
   * Configure http headers.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hdrs
   */
  @VsoMethod
  public void setHdrs(List<HdrMatch>  hdrs) {
    this.hdrs = hdrs;
  }

  /**
   * This is the setter method this will set the hdrs
   * Configure http headers.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hdrs
   */
  @VsoMethod
  public ResponseMatchTarget addHdrsItem(HdrMatch hdrsItem) {
    if (this.hdrs == null) {
      this.hdrs = new ArrayList<HdrMatch>();
    }
    this.hdrs.add(hdrsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Configure the host header.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostHdr
   */
  @VsoMethod
  public HostHdrMatch getHostHdr() {
    return hostHdr;
  }

  /**
   * This is the setter method to the attribute.
   * Configure the host header.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostHdr set the hostHdr.
   */
  @VsoMethod
  public void setHostHdr(HostHdrMatch hostHdr) {
    this.hostHdr = hostHdr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure the location header.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return locHdr
   */
  @VsoMethod
  public LocationHdrMatch getLocHdr() {
    return locHdr;
  }

  /**
   * This is the setter method to the attribute.
   * Configure the location header.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param locHdr set the locHdr.
   */
  @VsoMethod
  public void setLocHdr(LocationHdrMatch locHdr) {
    this.locHdr = locHdr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure http methods.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return method
   */
  @VsoMethod
  public MethodMatch getMethod() {
    return method;
  }

  /**
   * This is the setter method to the attribute.
   * Configure http methods.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param method set the method.
   */
  @VsoMethod
  public void setMethod(MethodMatch method) {
    this.method = method;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure request paths.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return path
   */
  @VsoMethod
  public PathMatch getPath() {
    return path;
  }

  /**
   * This is the setter method to the attribute.
   * Configure request paths.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param path set the path.
   */
  @VsoMethod
  public void setPath(PathMatch path) {
    this.path = path;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure the type of http protocol.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return protocol
   */
  @VsoMethod
  public ProtocolMatch getProtocol() {
    return protocol;
  }

  /**
   * This is the setter method to the attribute.
   * Configure the type of http protocol.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param protocol set the protocol.
   */
  @VsoMethod
  public void setProtocol(ProtocolMatch protocol) {
    this.protocol = protocol;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure request query.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return query
   */
  @VsoMethod
  public QueryMatch getQuery() {
    return query;
  }

  /**
   * This is the setter method to the attribute.
   * Configure request query.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param query set the query.
   */
  @VsoMethod
  public void setQuery(QueryMatch query) {
    this.query = query;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure the http headers in response.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rspHdrs
   */
  @VsoMethod
  public List<HdrMatch> getRspHdrs() {
    return rspHdrs;
  }

  /**
   * This is the setter method. this will set the rspHdrs
   * Configure the http headers in response.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rspHdrs
   */
  @VsoMethod
  public void setRspHdrs(List<HdrMatch>  rspHdrs) {
    this.rspHdrs = rspHdrs;
  }

  /**
   * This is the setter method this will set the rspHdrs
   * Configure the http headers in response.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rspHdrs
   */
  @VsoMethod
  public ResponseMatchTarget addRspHdrsItem(HdrMatch rspHdrsItem) {
    if (this.rspHdrs == null) {
      this.rspHdrs = new ArrayList<HdrMatch>();
    }
    this.rspHdrs.add(rspHdrsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Configure source ip addresses.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sourceIp
   */
  @VsoMethod
  public IpAddrMatch getSourceIp() {
    return sourceIp;
  }

  /**
   * This is the setter method to the attribute.
   * Configure source ip addresses.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sourceIp set the sourceIp.
   */
  @VsoMethod
  public void setSourceIp(IpAddrMatch sourceIp) {
    this.sourceIp = sourceIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure the http status code(s).
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return status
   */
  @VsoMethod
  public HTTPStatusMatch getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Configure the http status code(s).
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(HTTPStatusMatch status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure versions of the http protocol.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return version
   */
  @VsoMethod
  public HTTPVersionMatch getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Configure versions of the http protocol.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(HTTPVersionMatch version) {
    this.version = version;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure virtual service ports.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsPort
   */
  @VsoMethod
  public PortMatch getVsPort() {
    return vsPort;
  }

  /**
   * This is the setter method to the attribute.
   * Configure virtual service ports.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsPort set the vsPort.
   */
  @VsoMethod
  public void setVsPort(PortMatch vsPort) {
    this.vsPort = vsPort;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ResponseMatchTarget objResponseMatchTarget = (ResponseMatchTarget) o;
  return   Objects.equals(this.clientIp, objResponseMatchTarget.clientIp)&&
  Objects.equals(this.vsPort, objResponseMatchTarget.vsPort)&&
  Objects.equals(this.protocol, objResponseMatchTarget.protocol)&&
  Objects.equals(this.method, objResponseMatchTarget.method)&&
  Objects.equals(this.version, objResponseMatchTarget.version)&&
  Objects.equals(this.path, objResponseMatchTarget.path)&&
  Objects.equals(this.query, objResponseMatchTarget.query)&&
  Objects.equals(this.hdrs, objResponseMatchTarget.hdrs)&&
  Objects.equals(this.cookie, objResponseMatchTarget.cookie)&&
  Objects.equals(this.hostHdr, objResponseMatchTarget.hostHdr)&&
  Objects.equals(this.locHdr, objResponseMatchTarget.locHdr)&&
  Objects.equals(this.status, objResponseMatchTarget.status)&&
  Objects.equals(this.rspHdrs, objResponseMatchTarget.rspHdrs)&&
  Objects.equals(this.sourceIp, objResponseMatchTarget.sourceIp);
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
        sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
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

