package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.PortMatchGeneric;
import com.vmware.avi.vro.model.IPReputationTypeMatch;
import com.vmware.avi.vro.model.MicroServiceMatch;
import com.vmware.avi.vro.model.PortMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The NetworkSecurityMatchTarget is a POJO class extends AviRestResource that used for creating
 * NetworkSecurityMatchTarget.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NetworkSecurityMatchTarget")
@VsoFinder(name = Constants.FINDER_VRO_NETWORKSECURITYMATCHTARGET)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NetworkSecurityMatchTarget extends AviRestResource {
    @JsonProperty("client_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddrMatch clientIp;

    @JsonProperty("client_port")
    @JsonInclude(Include.NON_NULL)
    private PortMatchGeneric clientPort;

    @JsonProperty("geo_matches")
    @JsonInclude(Include.NON_NULL)
    private List<GeoMatch> geoMatches;

    @JsonProperty("ip_reputation_type")
    @JsonInclude(Include.NON_NULL)
    private IPReputationTypeMatch ipReputationType;

    @JsonProperty("microservice")
    @JsonInclude(Include.NON_NULL)
    private MicroServiceMatch microservice;

    @JsonProperty("vs_port")
    @JsonInclude(Include.NON_NULL)
    private PortMatch vsPort;



  /**
   * This is the getter method this will return the attribute value.
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
   * Matches the source port of incoming packets in the client side traffic.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientPort
   */
  @VsoMethod
  public PortMatchGeneric getClientPort() {
    return clientPort;
  }

  /**
   * This is the setter method to the attribute.
   * Matches the source port of incoming packets in the client side traffic.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientPort set the clientPort.
   */
  @VsoMethod
  public void setClientPort(PortMatchGeneric clientPort) {
    this.clientPort = clientPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Matches the geo information of incoming packets in the client side traffic.
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
   * Matches the geo information of incoming packets in the client side traffic.
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
   * Matches the geo information of incoming packets in the client side traffic.
   * Field introduced in 21.1.1.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return geoMatches
   */
  @VsoMethod
  public NetworkSecurityMatchTarget addGeoMatchesItem(GeoMatch geoMatchesItem) {
    if (this.geoMatches == null) {
      this.geoMatches = new ArrayList<GeoMatch>();
    }
    this.geoMatches.add(geoMatchesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 20.1.1.
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
   * Field introduced in 20.1.1.
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
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return microservice
   */
  @VsoMethod
  public MicroServiceMatch getMicroservice() {
    return microservice;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param microservice set the microservice.
   */
  @VsoMethod
  public void setMicroservice(MicroServiceMatch microservice) {
    this.microservice = microservice;
  }

  /**
   * This is the getter method this will return the attribute value.
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
  NetworkSecurityMatchTarget objNetworkSecurityMatchTarget = (NetworkSecurityMatchTarget) o;
  return   Objects.equals(this.clientIp, objNetworkSecurityMatchTarget.clientIp)&&
  Objects.equals(this.vsPort, objNetworkSecurityMatchTarget.vsPort)&&
  Objects.equals(this.microservice, objNetworkSecurityMatchTarget.microservice)&&
  Objects.equals(this.ipReputationType, objNetworkSecurityMatchTarget.ipReputationType)&&
  Objects.equals(this.clientPort, objNetworkSecurityMatchTarget.clientPort)&&
  Objects.equals(this.geoMatches, objNetworkSecurityMatchTarget.geoMatches);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NetworkSecurityMatchTarget {\n");
      sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
        sb.append("    geoMatches: ").append(toIndentedString(geoMatches)).append("\n");
        sb.append("    ipReputationType: ").append(toIndentedString(ipReputationType)).append("\n");
        sb.append("    microservice: ").append(toIndentedString(microservice)).append("\n");
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

