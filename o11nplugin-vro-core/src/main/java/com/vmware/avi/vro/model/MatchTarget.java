package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.BotDetectionMatch;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.CookieMatch;
import com.vmware.avi.vro.model.HostHdrMatch;
import com.vmware.avi.vro.model.IPReputationTypeMatch;
import com.vmware.avi.vro.model.MethodMatch;
import com.vmware.avi.vro.model.PathMatch;
import com.vmware.avi.vro.model.ProtocolMatch;
import com.vmware.avi.vro.model.QueryMatch;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.HTTPVersionMatch;
import com.vmware.avi.vro.model.PortMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The MatchTarget is a POJO class extends AviRestResource that used for creating
 * MatchTarget.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MatchTarget")
@VsoFinder(name = Constants.FINDER_VRO_MATCHTARGET)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MatchTarget extends AviRestResource {
    @JsonProperty("bot_detection_result")
    @JsonInclude(Include.NON_NULL)
    private BotDetectionMatch botDetectionResult = null;

    @JsonProperty("client_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddrMatch clientIp = null;

    @JsonProperty("cookie")
    @JsonInclude(Include.NON_NULL)
    private CookieMatch cookie = null;

    @JsonProperty("geo_matches")
    @JsonInclude(Include.NON_NULL)
    private List<GeoMatch> geoMatches = null;

    @JsonProperty("hdrs")
    @JsonInclude(Include.NON_NULL)
    private List<HdrMatch> hdrs = null;

    @JsonProperty("host_hdr")
    @JsonInclude(Include.NON_NULL)
    private HostHdrMatch hostHdr = null;

    @JsonProperty("ip_reputation_type")
    @JsonInclude(Include.NON_NULL)
    private IPReputationTypeMatch ipReputationType = null;

    @JsonProperty("method")
    @JsonInclude(Include.NON_NULL)
    private MethodMatch method = null;

    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private PathMatch path = null;

    @JsonProperty("protocol")
    @JsonInclude(Include.NON_NULL)
    private ProtocolMatch protocol = null;

    @JsonProperty("query")
    @JsonInclude(Include.NON_NULL)
    private QueryMatch query = null;

    @JsonProperty("source_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddrMatch sourceIp = null;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private HTTPVersionMatch version = null;

    @JsonProperty("vs_port")
    @JsonInclude(Include.NON_NULL)
    private PortMatch vsPort = null;



  /**
   * This is the getter method this will return the attribute value.
   * Configure the bot classification result.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return botDetectionResult
   */
  @VsoMethod
  public BotDetectionMatch getBotDetectionResult() {
    return botDetectionResult;
  }

  /**
   * This is the setter method to the attribute.
   * Configure the bot classification result.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param botDetectionResult set the botDetectionResult.
   */
  @VsoMethod
  public void setBotDetectionResult(BotDetectionMatch botDetectionResult) {
    this.botDetectionResult = botDetectionResult;
  }

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
   * Configure the geo information.
   * Field introduced in 21.1.1.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return geoMatches
   */
  @VsoMethod
  public List<GeoMatch> getGeoMatches() {
    return geoMatches;
  }

  /**
   * This is the setter method. this will set the geoMatches
   * Configure the geo information.
   * Field introduced in 21.1.1.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return geoMatches
   */
  @VsoMethod
  public void setGeoMatches(List<GeoMatch>  geoMatches) {
    this.geoMatches = geoMatches;
  }

  /**
   * This is the setter method this will set the geoMatches
   * Configure the geo information.
   * Field introduced in 21.1.1.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return geoMatches
   */
  @VsoMethod
  public MatchTarget addGeoMatchesItem(GeoMatch geoMatchesItem) {
    if (this.geoMatches == null) {
      this.geoMatches = new ArrayList<GeoMatch>();
    }
    this.geoMatches.add(geoMatchesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Configure http header(s).
   * All configured headers must match.
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
   * Configure http header(s).
   * All configured headers must match.
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
   * Configure http header(s).
   * All configured headers must match.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hdrs
   */
  @VsoMethod
  public MatchTarget addHdrsItem(HdrMatch hdrsItem) {
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
   * Configure ip reputation.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipReputationType
   */
  @VsoMethod
  public IPReputationTypeMatch getIpReputationType() {
    return ipReputationType;
  }

  /**
   * This is the setter method to the attribute.
   * Configure ip reputation.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipReputationType set the ipReputationType.
   */
  @VsoMethod
  public void setIpReputationType(IPReputationTypeMatch ipReputationType) {
    this.ipReputationType = ipReputationType;
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
  MatchTarget objMatchTarget = (MatchTarget) o;
  return   Objects.equals(this.clientIp, objMatchTarget.clientIp)&&
  Objects.equals(this.vsPort, objMatchTarget.vsPort)&&
  Objects.equals(this.protocol, objMatchTarget.protocol)&&
  Objects.equals(this.method, objMatchTarget.method)&&
  Objects.equals(this.version, objMatchTarget.version)&&
  Objects.equals(this.path, objMatchTarget.path)&&
  Objects.equals(this.query, objMatchTarget.query)&&
  Objects.equals(this.hdrs, objMatchTarget.hdrs)&&
  Objects.equals(this.cookie, objMatchTarget.cookie)&&
  Objects.equals(this.hostHdr, objMatchTarget.hostHdr)&&
  Objects.equals(this.ipReputationType, objMatchTarget.ipReputationType)&&
  Objects.equals(this.geoMatches, objMatchTarget.geoMatches)&&
  Objects.equals(this.botDetectionResult, objMatchTarget.botDetectionResult)&&
  Objects.equals(this.sourceIp, objMatchTarget.sourceIp);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MatchTarget {\n");
      sb.append("    botDetectionResult: ").append(toIndentedString(botDetectionResult)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    cookie: ").append(toIndentedString(cookie)).append("\n");
        sb.append("    geoMatches: ").append(toIndentedString(geoMatches)).append("\n");
        sb.append("    hdrs: ").append(toIndentedString(hdrs)).append("\n");
        sb.append("    hostHdr: ").append(toIndentedString(hostHdr)).append("\n");
        sb.append("    ipReputationType: ").append(toIndentedString(ipReputationType)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
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

