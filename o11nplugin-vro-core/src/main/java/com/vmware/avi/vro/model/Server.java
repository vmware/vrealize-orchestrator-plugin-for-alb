package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DiscoveredNetwork;
import com.vmware.avi.vro.model.GeoLocation;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
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
 * Server
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:16:36.466+05:30")

@VsoObject(create = false, name = "Server")
@VsoFinder(name = Constants.FINDER_VRO_SERVER, idAccessor = "getObjectID()")
@Service
public class Server extends AviRestResource  {
  @JsonProperty("autoscaling_group_name")
  private String autoscalingGroupName = null;

  @JsonProperty("availability_zone")
  private String availabilityZone = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("discovered_network_ref")
  @Valid
  private List<String> discoveredNetworkRef = null;

  @JsonProperty("discovered_networks")
  @Valid
  private List<DiscoveredNetwork> discoveredNetworks = null;

  @JsonProperty("discovered_subnet")
  @Valid
  private List<IpAddrPrefix> discoveredSubnet = null;

  @JsonProperty("enabled")
  private Boolean enabled = true;

  @JsonProperty("external_orchestration_id")
  private String externalOrchestrationId = null;

  @JsonProperty("external_uuid")
  private String externalUuid = null;

  @JsonProperty("hostname")
  private String hostname = null;

  @JsonProperty("ip")
  private IpAddr ip = null;

  @JsonProperty("location")
  private GeoLocation location = null;

  @JsonProperty("mac_address")
  private String macAddress = null;

  @JsonProperty("nw_ref")
  private String nwRef = null;

  @JsonProperty("port")
  private Integer port = null;

  @JsonProperty("prst_hdr_val")
  private String prstHdrVal = null;

  @JsonProperty("ratio")
  private Integer ratio = 1;

  @JsonProperty("resolve_server_by_dns")
  private Boolean resolveServerByDns = null;

  @JsonProperty("rewrite_host_header")
  private Boolean rewriteHostHeader = null;

  @JsonProperty("server_node")
  private String serverNode = null;

  @JsonProperty("static")
  private Boolean _static = null;

  @JsonProperty("verify_network")
  private Boolean verifyNetwork = null;

  @JsonProperty("vm_ref")
  private String vmRef = null;

  
  /**
   * Name of autoscaling group this server belongs to. Field introduced in 17.1.2.
   * @return autoscalingGroupName
  **/
  @ApiModelProperty(value = "Name of autoscaling group this server belongs to. Field introduced in 17.1.2.")


 
  @VsoMethod  
  public String getAutoscalingGroupName() {
    return autoscalingGroupName;
  }
    
  @VsoMethod
  public void setAutoscalingGroupName(String autoscalingGroupName) {
    this.autoscalingGroupName = autoscalingGroupName;
  }

  
  /**
   * Availability-zone of the server VM.
   * @return availabilityZone
  **/
  @ApiModelProperty(value = "Availability-zone of the server VM.")


 
  @VsoMethod  
  public String getAvailabilityZone() {
    return availabilityZone;
  }
    
  @VsoMethod
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  
  /**
   * A description of the Server.
   * @return description
  **/
  @ApiModelProperty(value = "A description of the Server.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  public Server addDiscoveredNetworkRefItem(String discoveredNetworkRefItem) {
    if (this.discoveredNetworkRef == null) {
      this.discoveredNetworkRef = new ArrayList<String>();
    }
    this.discoveredNetworkRef.add(discoveredNetworkRefItem);
    return this;
  }
  
  /**
   * (internal-use) Discovered network for this server. This field is deprecated. It is a reference to an object of type Network. Field deprecated in 17.1.1.
   * @return discoveredNetworkRef
  **/
  @ApiModelProperty(value = "(internal-use) Discovered network for this server. This field is deprecated. It is a reference to an object of type Network. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public List<String> getDiscoveredNetworkRef() {
    return discoveredNetworkRef;
  }
    
  @VsoMethod
  public void setDiscoveredNetworkRef(List<String> discoveredNetworkRef) {
    this.discoveredNetworkRef = discoveredNetworkRef;
  }

  
  public Server addDiscoveredNetworksItem(DiscoveredNetwork discoveredNetworksItem) {
    if (this.discoveredNetworks == null) {
      this.discoveredNetworks = new ArrayList<DiscoveredNetwork>();
    }
    this.discoveredNetworks.add(discoveredNetworksItem);
    return this;
  }
  
  /**
   * (internal-use) Discovered networks providing reachability for server IP. This field is used internally by Avi, not editable by the user.
   * @return discoveredNetworks
  **/
  @ApiModelProperty(value = "(internal-use) Discovered networks providing reachability for server IP. This field is used internally by Avi, not editable by the user.")

  @Valid

 
  @VsoMethod  
  public List<DiscoveredNetwork> getDiscoveredNetworks() {
    return discoveredNetworks;
  }
    
  @VsoMethod
  public void setDiscoveredNetworks(List<DiscoveredNetwork> discoveredNetworks) {
    this.discoveredNetworks = discoveredNetworks;
  }

  
  public Server addDiscoveredSubnetItem(IpAddrPrefix discoveredSubnetItem) {
    if (this.discoveredSubnet == null) {
      this.discoveredSubnet = new ArrayList<IpAddrPrefix>();
    }
    this.discoveredSubnet.add(discoveredSubnetItem);
    return this;
  }
  
  /**
   * (internal-use) Discovered subnet for this server. This field is deprecated. Field deprecated in 17.1.1.
   * @return discoveredSubnet
  **/
  @ApiModelProperty(value = "(internal-use) Discovered subnet for this server. This field is deprecated. Field deprecated in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<IpAddrPrefix> getDiscoveredSubnet() {
    return discoveredSubnet;
  }
    
  @VsoMethod
  public void setDiscoveredSubnet(List<IpAddrPrefix> discoveredSubnet) {
    this.discoveredSubnet = discoveredSubnet;
  }

  
  /**
   * Enable, Disable or Graceful Disable determine if new or existing connections to the server are allowed.
   * @return enabled
  **/
  @ApiModelProperty(value = "Enable, Disable or Graceful Disable determine if new or existing connections to the server are allowed.")


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * UID of server in external orchestration systems.
   * @return externalOrchestrationId
  **/
  @ApiModelProperty(value = "UID of server in external orchestration systems.")


 
  @VsoMethod  
  public String getExternalOrchestrationId() {
    return externalOrchestrationId;
  }
    
  @VsoMethod
  public void setExternalOrchestrationId(String externalOrchestrationId) {
    this.externalOrchestrationId = externalOrchestrationId;
  }

  
  /**
   * UUID identifying VM in OpenStack and other external compute.
   * @return externalUuid
  **/
  @ApiModelProperty(value = "UUID identifying VM in OpenStack and other external compute.")


 
  @VsoMethod  
  public String getExternalUuid() {
    return externalUuid;
  }
    
  @VsoMethod
  public void setExternalUuid(String externalUuid) {
    this.externalUuid = externalUuid;
  }

  
  /**
   * DNS resolvable name of the server.  May be used in place of the IP address.
   * @return hostname
  **/
  @ApiModelProperty(value = "DNS resolvable name of the server.  May be used in place of the IP address.")


 
  @VsoMethod  
  public String getHostname() {
    return hostname;
  }
    
  @VsoMethod
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  
  /**
   * IP Address of the server.  Required if there is no resolvable host name.
   * @return ip
  **/
  @ApiModelProperty(required = true, value = "IP Address of the server.  Required if there is no resolvable host name.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddr getIp() {
    return ip;
  }
    
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  
  /**
   * (internal-use) Geographic location of the server.Currently only for internal usage. Field introduced in 17.1.1.
   * @return location
  **/
  @ApiModelProperty(value = "(internal-use) Geographic location of the server.Currently only for internal usage. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public GeoLocation getLocation() {
    return location;
  }
    
  @VsoMethod
  public void setLocation(GeoLocation location) {
    this.location = location;
  }

  
  /**
   * MAC address of server.
   * @return macAddress
  **/
  @ApiModelProperty(value = "MAC address of server.")


 
  @VsoMethod  
  public String getMacAddress() {
    return macAddress;
  }
    
  @VsoMethod
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  
  /**
   * (internal-use) This field is used internally by Avi, not editable by the user. It is a reference to an object of type VIMgrNWRuntime.
   * @return nwRef
  **/
  @ApiModelProperty(value = "(internal-use) This field is used internally by Avi, not editable by the user. It is a reference to an object of type VIMgrNWRuntime.")


 
  @VsoMethod  
  public String getNwRef() {
    return nwRef;
  }
    
  @VsoMethod
  public void setNwRef(String nwRef) {
    this.nwRef = nwRef;
  }

  
  /**
   * Optionally specify the servers port number.  This will override the pool's default server port attribute. Allowed values are 1-65535. Special values are 0- 'use backend port in pool'.
   * @return port
  **/
  @ApiModelProperty(value = "Optionally specify the servers port number.  This will override the pool's default server port attribute. Allowed values are 1-65535. Special values are 0- 'use backend port in pool'.")


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  /**
   * Header value for custom header persistence. .
   * @return prstHdrVal
  **/
  @ApiModelProperty(value = "Header value for custom header persistence. .")


 
  @VsoMethod  
  public String getPrstHdrVal() {
    return prstHdrVal;
  }
    
  @VsoMethod
  public void setPrstHdrVal(String prstHdrVal) {
    this.prstHdrVal = prstHdrVal;
  }

  
  /**
   * Ratio of selecting eligible servers in the pool. Allowed values are 1-20.
   * @return ratio
  **/
  @ApiModelProperty(value = "Ratio of selecting eligible servers in the pool. Allowed values are 1-20.")


 
  @VsoMethod  
  public Integer getRatio() {
    return ratio;
  }
    
  @VsoMethod
  public void setRatio(Integer ratio) {
    this.ratio = ratio;
  }

  
  /**
   * Auto resolve server's IP using DNS name.
   * @return resolveServerByDns
  **/
  @ApiModelProperty(value = "Auto resolve server's IP using DNS name.")


 
  @VsoMethod  
  public Boolean isResolveServerByDns() {
    return resolveServerByDns;
  }
    
  @VsoMethod
  public void setResolveServerByDns(Boolean resolveServerByDns) {
    this.resolveServerByDns = resolveServerByDns;
  }

  
  /**
   * Rewrite incoming Host Header to server name.
   * @return rewriteHostHeader
  **/
  @ApiModelProperty(value = "Rewrite incoming Host Header to server name.")


 
  @VsoMethod  
  public Boolean isRewriteHostHeader() {
    return rewriteHostHeader;
  }
    
  @VsoMethod
  public void setRewriteHostHeader(Boolean rewriteHostHeader) {
    this.rewriteHostHeader = rewriteHostHeader;
  }

  
  /**
   * Hostname of the node where the server VM or container resides.
   * @return serverNode
  **/
  @ApiModelProperty(value = "Hostname of the node where the server VM or container resides.")


 
  @VsoMethod  
  public String getServerNode() {
    return serverNode;
  }
    
  @VsoMethod
  public void setServerNode(String serverNode) {
    this.serverNode = serverNode;
  }

  
  /**
   * If statically learned.
   * @return _static
  **/
  @ApiModelProperty(value = "If statically learned.")


 
  @VsoMethod  
  public Boolean isStatic() {
    return _static;
  }
    
  @VsoMethod
  public void setStatic(Boolean _static) {
    this._static = _static;
  }

  
  /**
   * Verify server belongs to a discovered network or reachable via a discovered network. Verify reachable network isn't the OpenStack management network.
   * @return verifyNetwork
  **/
  @ApiModelProperty(value = "Verify server belongs to a discovered network or reachable via a discovered network. Verify reachable network isn't the OpenStack management network.")


 
  @VsoMethod  
  public Boolean isVerifyNetwork() {
    return verifyNetwork;
  }
    
  @VsoMethod
  public void setVerifyNetwork(Boolean verifyNetwork) {
    this.verifyNetwork = verifyNetwork;
  }

  
  /**
   * (internal-use) This field is used internally by Avi, not editable by the user. It is a reference to an object of type VIMgrVMRuntime.
   * @return vmRef
  **/
  @ApiModelProperty(value = "(internal-use) This field is used internally by Avi, not editable by the user. It is a reference to an object of type VIMgrVMRuntime.")


 
  @VsoMethod  
  public String getVmRef() {
    return vmRef;
  }
    
  @VsoMethod
  public void setVmRef(String vmRef) {
    this.vmRef = vmRef;
  }

  
  public String getObjectID() {
		return "Server";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Server server = (Server) o;
    return Objects.equals(this.autoscalingGroupName, server.autoscalingGroupName) &&
        Objects.equals(this.availabilityZone, server.availabilityZone) &&
        Objects.equals(this.description, server.description) &&
        Objects.equals(this.discoveredNetworkRef, server.discoveredNetworkRef) &&
        Objects.equals(this.discoveredNetworks, server.discoveredNetworks) &&
        Objects.equals(this.discoveredSubnet, server.discoveredSubnet) &&
        Objects.equals(this.enabled, server.enabled) &&
        Objects.equals(this.externalOrchestrationId, server.externalOrchestrationId) &&
        Objects.equals(this.externalUuid, server.externalUuid) &&
        Objects.equals(this.hostname, server.hostname) &&
        Objects.equals(this.ip, server.ip) &&
        Objects.equals(this.location, server.location) &&
        Objects.equals(this.macAddress, server.macAddress) &&
        Objects.equals(this.nwRef, server.nwRef) &&
        Objects.equals(this.port, server.port) &&
        Objects.equals(this.prstHdrVal, server.prstHdrVal) &&
        Objects.equals(this.ratio, server.ratio) &&
        Objects.equals(this.resolveServerByDns, server.resolveServerByDns) &&
        Objects.equals(this.rewriteHostHeader, server.rewriteHostHeader) &&
        Objects.equals(this.serverNode, server.serverNode) &&
        Objects.equals(this._static, server._static) &&
        Objects.equals(this.verifyNetwork, server.verifyNetwork) &&
        Objects.equals(this.vmRef, server.vmRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoscalingGroupName, availabilityZone, description, discoveredNetworkRef, discoveredNetworks, discoveredSubnet, enabled, externalOrchestrationId, externalUuid, hostname, ip, location, macAddress, nwRef, port, prstHdrVal, ratio, resolveServerByDns, rewriteHostHeader, serverNode, _static, verifyNetwork, vmRef);
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
    sb.append("    _static: ").append(toIndentedString(_static)).append("\n");
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

