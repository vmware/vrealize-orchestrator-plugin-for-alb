package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.GeoLocation;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The Server is a POJO class extends AviRestResource that used for creating
 * Server.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Server")
@VsoFinder(name = Constants.FINDER_VRO_SERVER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Server extends AviRestResource {
  @JsonProperty("autoscaling_group_name")
  @JsonInclude(Include.NON_NULL)
  private String autoscalingGroupName = null;

  @JsonProperty("availability_zone")
  @JsonInclude(Include.NON_NULL)
  private String availabilityZone = null;

  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("discovered_network_ref")
  @JsonInclude(Include.NON_NULL)
  private List<String> discoveredNetworkRef = null;

  @JsonProperty("discovered_networks")
  @JsonInclude(Include.NON_NULL)
  private List<DiscoveredNetwork> discoveredNetworks = null;

  @JsonProperty("discovered_subnet")
  @JsonInclude(Include.NON_NULL)
  private List<IpAddrPrefix> discoveredSubnet = null;

  @JsonProperty("enabled")
  @JsonInclude(Include.NON_NULL)
  private Boolean enabled = true;

  @JsonProperty("external_orchestration_id")
  @JsonInclude(Include.NON_NULL)
  private String externalOrchestrationId = null;

  @JsonProperty("external_uuid")
  @JsonInclude(Include.NON_NULL)
  private String externalUuid = null;

  @JsonProperty("hostname")
  @JsonInclude(Include.NON_NULL)
  private String hostname = null;

  @JsonProperty("ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddr ip = null;

  @JsonProperty("location")
  @JsonInclude(Include.NON_NULL)
  private GeoLocation location = null;

  @JsonProperty("mac_address")
  @JsonInclude(Include.NON_NULL)
  private String macAddress = null;

  @JsonProperty("nw_ref")
  @JsonInclude(Include.NON_NULL)
  private String nwRef = null;

  @JsonProperty("port")
  @JsonInclude(Include.NON_NULL)
  private Integer port = null;

  @JsonProperty("prst_hdr_val")
  @JsonInclude(Include.NON_NULL)
  private String prstHdrVal = null;

  @JsonProperty("ratio")
  @JsonInclude(Include.NON_NULL)
  private Integer ratio = 1;

  @JsonProperty("resolve_server_by_dns")
  @JsonInclude(Include.NON_NULL)
  private Boolean resolveServerByDns = false;

  @JsonProperty("rewrite_host_header")
  @JsonInclude(Include.NON_NULL)
  private Boolean rewriteHostHeader = false;

  @JsonProperty("server_node")
  @JsonInclude(Include.NON_NULL)
  private String serverNode = null;

  @JsonProperty("static")
  @JsonInclude(Include.NON_NULL)
  private Boolean statics = false;

  @JsonProperty("verify_network")
  @JsonInclude(Include.NON_NULL)
  private Boolean verifyNetwork = false;

  @JsonProperty("vm_ref")
  @JsonInclude(Include.NON_NULL)
  private String vmRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * Name of autoscaling group this server belongs to.
   * Field introduced in 17.1.2.
   * @return autoscalingGroupName
   */
  @VsoMethod
  public String getAutoscalingGroupName() {
    return autoscalingGroupName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of autoscaling group this server belongs to.
   * Field introduced in 17.1.2.
   * @param autoscalingGroupName set the autoscalingGroupName.
   */
  @VsoMethod
  public void setAutoscalingGroupName(String  autoscalingGroupName) {
    this.autoscalingGroupName = autoscalingGroupName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Availability-zone of the server vm.
   * @return availabilityZone
   */
  @VsoMethod
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  /**
   * This is the setter method to the attribute.
   * Availability-zone of the server vm.
   * @param availabilityZone set the availabilityZone.
   */
  @VsoMethod
  public void setAvailabilityZone(String  availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A description of the server.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * A description of the server.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * (internal-use) discovered network for this server.
   * This field is deprecated.
   * It is a reference to an object of type network.
   * Field deprecated in 17.1.1.
   * @return discoveredNetworkRef
   */
  @VsoMethod
  public List<String> getDiscoveredNetworkRef() {
    return discoveredNetworkRef;
  }

  /**
   * This is the setter method. this will set the discoveredNetworkRef
   * (internal-use) discovered network for this server.
   * This field is deprecated.
   * It is a reference to an object of type network.
   * Field deprecated in 17.1.1.
   * @return discoveredNetworkRef
   */
  @VsoMethod
  public void setDiscoveredNetworkRef(List<String>  discoveredNetworkRef) {
    this.discoveredNetworkRef = discoveredNetworkRef;
  }

  /**
   * This is the setter method this will set the discoveredNetworkRef
   * (internal-use) discovered network for this server.
   * This field is deprecated.
   * It is a reference to an object of type network.
   * Field deprecated in 17.1.1.
   * @return discoveredNetworkRef
   */
  @VsoMethod
  public Server addDiscoveredNetworkRefItem(String discoveredNetworkRefItem) {
    if (this.discoveredNetworkRef == null) {
      this.discoveredNetworkRef = new ArrayList<String>();
    }
    this.discoveredNetworkRef.add(discoveredNetworkRefItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * (internal-use) discovered networks providing reachability for server ip.
   * This field is used internally by avi, not editable by the user.
   * @return discoveredNetworks
   */
  @VsoMethod
  public List<DiscoveredNetwork> getDiscoveredNetworks() {
    return discoveredNetworks;
  }

  /**
   * This is the setter method. this will set the discoveredNetworks
   * (internal-use) discovered networks providing reachability for server ip.
   * This field is used internally by avi, not editable by the user.
   * @return discoveredNetworks
   */
  @VsoMethod
  public void setDiscoveredNetworks(List<DiscoveredNetwork>  discoveredNetworks) {
    this.discoveredNetworks = discoveredNetworks;
  }

  /**
   * This is the setter method this will set the discoveredNetworks
   * (internal-use) discovered networks providing reachability for server ip.
   * This field is used internally by avi, not editable by the user.
   * @return discoveredNetworks
   */
  @VsoMethod
  public Server addDiscoveredNetworksItem(DiscoveredNetwork discoveredNetworksItem) {
    if (this.discoveredNetworks == null) {
      this.discoveredNetworks = new ArrayList<DiscoveredNetwork>();
    }
    this.discoveredNetworks.add(discoveredNetworksItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * (internal-use) discovered subnet for this server.
   * This field is deprecated.
   * Field deprecated in 17.1.1.
   * @return discoveredSubnet
   */
  @VsoMethod
  public List<IpAddrPrefix> getDiscoveredSubnet() {
    return discoveredSubnet;
  }

  /**
   * This is the setter method. this will set the discoveredSubnet
   * (internal-use) discovered subnet for this server.
   * This field is deprecated.
   * Field deprecated in 17.1.1.
   * @return discoveredSubnet
   */
  @VsoMethod
  public void setDiscoveredSubnet(List<IpAddrPrefix>  discoveredSubnet) {
    this.discoveredSubnet = discoveredSubnet;
  }

  /**
   * This is the setter method this will set the discoveredSubnet
   * (internal-use) discovered subnet for this server.
   * This field is deprecated.
   * Field deprecated in 17.1.1.
   * @return discoveredSubnet
   */
  @VsoMethod
  public Server addDiscoveredSubnetItem(IpAddrPrefix discoveredSubnetItem) {
    if (this.discoveredSubnet == null) {
      this.discoveredSubnet = new ArrayList<IpAddrPrefix>();
    }
    this.discoveredSubnet.add(discoveredSubnetItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Enable, disable or graceful disable determine if new or existing connections to the server are allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable, disable or graceful disable determine if new or existing connections to the server are allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uid of server in external orchestration systems.
   * @return externalOrchestrationId
   */
  @VsoMethod
  public String getExternalOrchestrationId() {
    return externalOrchestrationId;
  }

  /**
   * This is the setter method to the attribute.
   * Uid of server in external orchestration systems.
   * @param externalOrchestrationId set the externalOrchestrationId.
   */
  @VsoMethod
  public void setExternalOrchestrationId(String  externalOrchestrationId) {
    this.externalOrchestrationId = externalOrchestrationId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid identifying vm in openstack and other external compute.
   * @return externalUuid
   */
  @VsoMethod
  public String getExternalUuid() {
    return externalUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid identifying vm in openstack and other external compute.
   * @param externalUuid set the externalUuid.
   */
  @VsoMethod
  public void setExternalUuid(String  externalUuid) {
    this.externalUuid = externalUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dns resolvable name of the server.
   * May be used in place of the ip address.
   * @return hostname
   */
  @VsoMethod
  public String getHostname() {
    return hostname;
  }

  /**
   * This is the setter method to the attribute.
   * Dns resolvable name of the server.
   * May be used in place of the ip address.
   * @param hostname set the hostname.
   */
  @VsoMethod
  public void setHostname(String  hostname) {
    this.hostname = hostname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip address of the server.
   * Required if there is no resolvable host name.
   * @return ip
   */
  @VsoMethod
  public IpAddr getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address of the server.
   * Required if there is no resolvable host name.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * (internal-use) geographic location of the server.currently only for internal usage.
   * Field introduced in 17.1.1.
   * @return location
   */
  @VsoMethod
  public GeoLocation getLocation() {
    return location;
  }

  /**
   * This is the setter method to the attribute.
   * (internal-use) geographic location of the server.currently only for internal usage.
   * Field introduced in 17.1.1.
   * @param location set the location.
   */
  @VsoMethod
  public void setLocation(GeoLocation location) {
    this.location = location;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mac address of server.
   * @return macAddress
   */
  @VsoMethod
  public String getMacAddress() {
    return macAddress;
  }

  /**
   * This is the setter method to the attribute.
   * Mac address of server.
   * @param macAddress set the macAddress.
   */
  @VsoMethod
  public void setMacAddress(String  macAddress) {
    this.macAddress = macAddress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * (internal-use) this field is used internally by avi, not editable by the user.
   * It is a reference to an object of type vimgrnwruntime.
   * @return nwRef
   */
  @VsoMethod
  public String getNwRef() {
    return nwRef;
  }

  /**
   * This is the setter method to the attribute.
   * (internal-use) this field is used internally by avi, not editable by the user.
   * It is a reference to an object of type vimgrnwruntime.
   * @param nwRef set the nwRef.
   */
  @VsoMethod
  public void setNwRef(String  nwRef) {
    this.nwRef = nwRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Optionally specify the servers port number.
   * This will override the pool's default server port attribute.
   * Allowed values are 1-65535.
   * Special values are 0- 'use backend port in pool'.
   * @return port
   */
  @VsoMethod
  public Integer getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Optionally specify the servers port number.
   * This will override the pool's default server port attribute.
   * Allowed values are 1-65535.
   * Special values are 0- 'use backend port in pool'.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(Integer  port) {
    this.port = port;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Header value for custom header persistence.
   * @return prstHdrVal
   */
  @VsoMethod
  public String getPrstHdrVal() {
    return prstHdrVal;
  }

  /**
   * This is the setter method to the attribute.
   * Header value for custom header persistence.
   * @param prstHdrVal set the prstHdrVal.
   */
  @VsoMethod
  public void setPrstHdrVal(String  prstHdrVal) {
    this.prstHdrVal = prstHdrVal;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ratio of selecting eligible servers in the pool.
   * Allowed values are 1-20.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return ratio
   */
  @VsoMethod
  public Integer getRatio() {
    return ratio;
  }

  /**
   * This is the setter method to the attribute.
   * Ratio of selecting eligible servers in the pool.
   * Allowed values are 1-20.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param ratio set the ratio.
   */
  @VsoMethod
  public void setRatio(Integer  ratio) {
    this.ratio = ratio;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Auto resolve server's ip using dns name.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return resolveServerByDns
   */
  @VsoMethod
  public Boolean getResolveServerByDns() {
    return resolveServerByDns;
  }

  /**
   * This is the setter method to the attribute.
   * Auto resolve server's ip using dns name.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param resolveServerByDns set the resolveServerByDns.
   */
  @VsoMethod
  public void setResolveServerByDns(Boolean  resolveServerByDns) {
    this.resolveServerByDns = resolveServerByDns;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rewrite incoming host header to server name.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return rewriteHostHeader
   */
  @VsoMethod
  public Boolean getRewriteHostHeader() {
    return rewriteHostHeader;
  }

  /**
   * This is the setter method to the attribute.
   * Rewrite incoming host header to server name.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param rewriteHostHeader set the rewriteHostHeader.
   */
  @VsoMethod
  public void setRewriteHostHeader(Boolean  rewriteHostHeader) {
    this.rewriteHostHeader = rewriteHostHeader;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Hostname of the node where the server vm or container resides.
   * @return serverNode
   */
  @VsoMethod
  public String getServerNode() {
    return serverNode;
  }

  /**
   * This is the setter method to the attribute.
   * Hostname of the node where the server vm or container resides.
   * @param serverNode set the serverNode.
   */
  @VsoMethod
  public void setServerNode(String  serverNode) {
    this.serverNode = serverNode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If statically learned.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return statics
   */
  @VsoMethod
  public Boolean getStatic() {
    return statics;
  }

  /**
   * This is the setter method to the attribute.
   * If statically learned.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param statics set the statics.
   */
  @VsoMethod
  public void setStatic(Boolean  statics) {
    this.statics = statics;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Verify server belongs to a discovered network or reachable via a discovered network.
   * Verify reachable network isn't the openstack management network.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return verifyNetwork
   */
  @VsoMethod
  public Boolean getVerifyNetwork() {
    return verifyNetwork;
  }

  /**
   * This is the setter method to the attribute.
   * Verify server belongs to a discovered network or reachable via a discovered network.
   * Verify reachable network isn't the openstack management network.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param verifyNetwork set the verifyNetwork.
   */
  @VsoMethod
  public void setVerifyNetwork(Boolean  verifyNetwork) {
    this.verifyNetwork = verifyNetwork;
  }

  /**
   * This is the getter method this will return the attribute value.
   * (internal-use) this field is used internally by avi, not editable by the user.
   * It is a reference to an object of type vimgrvmruntime.
   * @return vmRef
   */
  @VsoMethod
  public String getVmRef() {
    return vmRef;
  }

  /**
   * This is the setter method to the attribute.
   * (internal-use) this field is used internally by avi, not editable by the user.
   * It is a reference to an object of type vimgrvmruntime.
   * @param vmRef set the vmRef.
   */
  @VsoMethod
  public void setVmRef(String  vmRef) {
    this.vmRef = vmRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  Server objServer = (Server) o;
  return   Objects.equals(this.availabilityZone, objServer.availabilityZone)&&
  Objects.equals(this.autoscalingGroupName, objServer.autoscalingGroupName)&&
  Objects.equals(this.ip, objServer.ip)&&
  Objects.equals(this.statics, objServer.statics)&&
  Objects.equals(this.discoveredNetworkRef, objServer.discoveredNetworkRef)&&
  Objects.equals(this.rewriteHostHeader, objServer.rewriteHostHeader)&&
  Objects.equals(this.port, objServer.port)&&
  Objects.equals(this.ratio, objServer.ratio)&&
  Objects.equals(this.hostname, objServer.hostname)&&
  Objects.equals(this.verifyNetwork, objServer.verifyNetwork)&&
  Objects.equals(this.location, objServer.location)&&
  Objects.equals(this.macAddress, objServer.macAddress)&&
  Objects.equals(this.externalUuid, objServer.externalUuid)&&
  Objects.equals(this.prstHdrVal, objServer.prstHdrVal)&&
  Objects.equals(this.description, objServer.description)&&
  Objects.equals(this.resolveServerByDns, objServer.resolveServerByDns)&&
  Objects.equals(this.externalOrchestrationId, objServer.externalOrchestrationId)&&
  Objects.equals(this.discoveredNetworks, objServer.discoveredNetworks)&&
  Objects.equals(this.enabled, objServer.enabled)&&
  Objects.equals(this.discoveredSubnet, objServer.discoveredSubnet)&&
  Objects.equals(this.serverNode, objServer.serverNode)&&
  Objects.equals(this.nwRef, objServer.nwRef)&&
  Objects.equals(this.vmRef, objServer.vmRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Server {\n");
      sb.append("    autoscalingGroupName: ").append(toIndentedString(autoscalingGroupName)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    discoveredNetworkRef: ").append(toIndentedString(discoveredNetworkRef)).append("\n");
        sb.append("    discoveredNetworks: ").append(toIndentedString(discoveredNetworks)).append("\n");
        sb.append("    discoveredSubnet: ").append(toIndentedString(discoveredSubnet)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    externalOrchestrationId: ").append(toIndentedString(externalOrchestrationId)).append("\n");
        sb.append("    externalUuid: ").append(toIndentedString(externalUuid)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    nwRef: ").append(toIndentedString(nwRef)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    prstHdrVal: ").append(toIndentedString(prstHdrVal)).append("\n");
        sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
        sb.append("    resolveServerByDns: ").append(toIndentedString(resolveServerByDns)).append("\n");
        sb.append("    rewriteHostHeader: ").append(toIndentedString(rewriteHostHeader)).append("\n");
        sb.append("    serverNode: ").append(toIndentedString(serverNode)).append("\n");
        sb.append("    statics: ").append(toIndentedString(statics)).append("\n");
        sb.append("    verifyNetwork: ").append(toIndentedString(verifyNetwork)).append("\n");
        sb.append("    vmRef: ").append(toIndentedString(vmRef)).append("\n");
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

