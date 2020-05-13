package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
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
 * BgpPeer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "BgpPeer")
@VsoFinder(name = Constants.FINDER_VRO_BGPPEER, idAccessor = "getObjectID()")
@Service
public class BgpPeer extends AviRestResource  {
  @JsonProperty("advertise_snat_ip")
  private Boolean advertiseSnatIp = true;

  @JsonProperty("advertise_vip")
  private Boolean advertiseVip = true;

  @JsonProperty("advertisement_interval")
  private Integer advertisementInterval = 5;

  @JsonProperty("bfd")
  private Boolean bfd = true;

  @JsonProperty("connect_timer")
  private Integer connectTimer = 10;

  @JsonProperty("ebgp_multihop")
  private Integer ebgpMultihop = null;

  @JsonProperty("hold_time")
  private Integer holdTime = null;

  @JsonProperty("keepalive_interval")
  private Integer keepaliveInterval = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("local_as")
  private Integer localAs = null;

  @JsonProperty("md5_secret")
  private String md5Secret = null;

  @JsonProperty("network_ref")
  private String networkRef = null;

  @JsonProperty("peer_ip")
  private IpAddr peerIp = null;

  @JsonProperty("peer_ip6")
  private IpAddr peerIp6 = null;

  @JsonProperty("remote_as")
  private Integer remoteAs = null;

  @JsonProperty("shutdown")
  private Boolean shutdown = null;

  @JsonProperty("subnet")
  private IpAddrPrefix subnet = null;

  @JsonProperty("subnet6")
  private IpAddrPrefix subnet6 = null;

  
  /**
   * Advertise SNAT IP to this Peer.
   * @return advertiseSnatIp
  **/
  @ApiModelProperty(value = "Advertise SNAT IP to this Peer.")


 
  @VsoMethod  
  public Boolean isAdvertiseSnatIp() {
    return advertiseSnatIp;
  }
    
  @VsoMethod
  public void setAdvertiseSnatIp(Boolean advertiseSnatIp) {
    this.advertiseSnatIp = advertiseSnatIp;
  }

  
  /**
   * Advertise VIP to this Peer.
   * @return advertiseVip
  **/
  @ApiModelProperty(value = "Advertise VIP to this Peer.")


 
  @VsoMethod  
  public Boolean isAdvertiseVip() {
    return advertiseVip;
  }
    
  @VsoMethod
  public void setAdvertiseVip(Boolean advertiseVip) {
    this.advertiseVip = advertiseVip;
  }

  
  /**
   * Advertisement interval for this Peer. Allowed values are 1-60.
   * @return advertisementInterval
  **/
  @ApiModelProperty(value = "Advertisement interval for this Peer. Allowed values are 1-60.")


 
  @VsoMethod  
  public Integer getAdvertisementInterval() {
    return advertisementInterval;
  }
    
  @VsoMethod
  public void setAdvertisementInterval(Integer advertisementInterval) {
    this.advertisementInterval = advertisementInterval;
  }

  
  /**
   * Enable Bi-Directional Forward Detection. Only async mode supported.
   * @return bfd
  **/
  @ApiModelProperty(value = "Enable Bi-Directional Forward Detection. Only async mode supported.")


 
  @VsoMethod  
  public Boolean isBfd() {
    return bfd;
  }
    
  @VsoMethod
  public void setBfd(Boolean bfd) {
    this.bfd = bfd;
  }

  
  /**
   * Connect timer for this Peer. Allowed values are 1-120.
   * @return connectTimer
  **/
  @ApiModelProperty(value = "Connect timer for this Peer. Allowed values are 1-120.")


 
  @VsoMethod  
  public Integer getConnectTimer() {
    return connectTimer;
  }
    
  @VsoMethod
  public void setConnectTimer(Integer connectTimer) {
    this.connectTimer = connectTimer;
  }

  
  /**
   * TTL for multihop ebgp Peer. Allowed values are 0-255. Field introduced in 17.1.3.
   * @return ebgpMultihop
  **/
  @ApiModelProperty(value = "TTL for multihop ebgp Peer. Allowed values are 0-255. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Integer getEbgpMultihop() {
    return ebgpMultihop;
  }
    
  @VsoMethod
  public void setEbgpMultihop(Integer ebgpMultihop) {
    this.ebgpMultihop = ebgpMultihop;
  }

  
  /**
   * Hold time for this Peer. Allowed values are 3-7200.
   * @return holdTime
  **/
  @ApiModelProperty(value = "Hold time for this Peer. Allowed values are 3-7200.")


 
  @VsoMethod  
  public Integer getHoldTime() {
    return holdTime;
  }
    
  @VsoMethod
  public void setHoldTime(Integer holdTime) {
    this.holdTime = holdTime;
  }

  
  /**
   * Keepalive interval for this Peer. Allowed values are 0-3600.
   * @return keepaliveInterval
  **/
  @ApiModelProperty(value = "Keepalive interval for this Peer. Allowed values are 0-3600.")


 
  @VsoMethod  
  public Integer getKeepaliveInterval() {
    return keepaliveInterval;
  }
    
  @VsoMethod
  public void setKeepaliveInterval(Integer keepaliveInterval) {
    this.keepaliveInterval = keepaliveInterval;
  }

  
  /**
   * Label used to enable learning and/or advertisement of routes to this peer. Field introduced in 20.1.1.
   * @return label
  **/
  @ApiModelProperty(value = "Label used to enable learning and/or advertisement of routes to this peer. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getLabel() {
    return label;
  }
    
  @VsoMethod
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * Local AS to use for this ebgp peer. If specified, this will override the local AS configured at the VRF level. Allowed values are 1-4294967295. Field introduced in 17.1.6,17.2.2.
   * @return localAs
  **/
  @ApiModelProperty(value = "Local AS to use for this ebgp peer. If specified, this will override the local AS configured at the VRF level. Allowed values are 1-4294967295. Field introduced in 17.1.6,17.2.2.")


 
  @VsoMethod  
  public Integer getLocalAs() {
    return localAs;
  }
    
  @VsoMethod
  public void setLocalAs(Integer localAs) {
    this.localAs = localAs;
  }

  
  /**
   * Peer Autonomous System Md5 Digest Secret Key.
   * @return md5Secret
  **/
  @ApiModelProperty(value = "Peer Autonomous System Md5 Digest Secret Key.")


 
  @VsoMethod  
  public String getMd5Secret() {
    return md5Secret;
  }
    
  @VsoMethod
  public void setMd5Secret(String md5Secret) {
    this.md5Secret = md5Secret;
  }

  
  /**
   * Network providing reachability for Peer. It is a reference to an object of type Network.
   * @return networkRef
  **/
  @ApiModelProperty(value = "Network providing reachability for Peer. It is a reference to an object of type Network.")


 
  @VsoMethod  
  public String getNetworkRef() {
    return networkRef;
  }
    
  @VsoMethod
  public void setNetworkRef(String networkRef) {
    this.networkRef = networkRef;
  }

  
  /**
   * IP Address of the BGP Peer.
   * @return peerIp
  **/
  @ApiModelProperty(value = "IP Address of the BGP Peer.")

  @Valid

 
  @VsoMethod  
  public IpAddr getPeerIp() {
    return peerIp;
  }
    
  @VsoMethod
  public void setPeerIp(IpAddr peerIp) {
    this.peerIp = peerIp;
  }

  
  /**
   * IPv6 Address of the BGP Peer. Field introduced in 18.1.1.
   * @return peerIp6
  **/
  @ApiModelProperty(value = "IPv6 Address of the BGP Peer. Field introduced in 18.1.1.")

  @Valid

 
  @VsoMethod  
  public IpAddr getPeerIp6() {
    return peerIp6;
  }
    
  @VsoMethod
  public void setPeerIp6(IpAddr peerIp6) {
    this.peerIp6 = peerIp6;
  }

  
  /**
   * Peer Autonomous System ID. Allowed values are 1-4294967295.
   * @return remoteAs
  **/
  @ApiModelProperty(value = "Peer Autonomous System ID. Allowed values are 1-4294967295.")


 
  @VsoMethod  
  public Integer getRemoteAs() {
    return remoteAs;
  }
    
  @VsoMethod
  public void setRemoteAs(Integer remoteAs) {
    this.remoteAs = remoteAs;
  }

  
  /**
   * Shutdown the BGP peer. Field introduced in 17.2.4.
   * @return shutdown
  **/
  @ApiModelProperty(value = "Shutdown the BGP peer. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public Boolean isShutdown() {
    return shutdown;
  }
    
  @VsoMethod
  public void setShutdown(Boolean shutdown) {
    this.shutdown = shutdown;
  }

  
  /**
   * Subnet providing reachability for Peer.
   * @return subnet
  **/
  @ApiModelProperty(value = "Subnet providing reachability for Peer.")

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getSubnet() {
    return subnet;
  }
    
  @VsoMethod
  public void setSubnet(IpAddrPrefix subnet) {
    this.subnet = subnet;
  }

  
  /**
   * IPv6 subnet providing reachability for Peer. Field introduced in 18.1.1.
   * @return subnet6
  **/
  @ApiModelProperty(value = "IPv6 subnet providing reachability for Peer. Field introduced in 18.1.1.")

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getSubnet6() {
    return subnet6;
  }
    
  @VsoMethod
  public void setSubnet6(IpAddrPrefix subnet6) {
    this.subnet6 = subnet6;
  }

  
  public String getObjectID() {
		return "BgpPeer";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpPeer bgpPeer = (BgpPeer) o;
    return Objects.equals(this.advertiseSnatIp, bgpPeer.advertiseSnatIp) &&
        Objects.equals(this.advertiseVip, bgpPeer.advertiseVip) &&
        Objects.equals(this.advertisementInterval, bgpPeer.advertisementInterval) &&
        Objects.equals(this.bfd, bgpPeer.bfd) &&
        Objects.equals(this.connectTimer, bgpPeer.connectTimer) &&
        Objects.equals(this.ebgpMultihop, bgpPeer.ebgpMultihop) &&
        Objects.equals(this.holdTime, bgpPeer.holdTime) &&
        Objects.equals(this.keepaliveInterval, bgpPeer.keepaliveInterval) &&
        Objects.equals(this.label, bgpPeer.label) &&
        Objects.equals(this.localAs, bgpPeer.localAs) &&
        Objects.equals(this.md5Secret, bgpPeer.md5Secret) &&
        Objects.equals(this.networkRef, bgpPeer.networkRef) &&
        Objects.equals(this.peerIp, bgpPeer.peerIp) &&
        Objects.equals(this.peerIp6, bgpPeer.peerIp6) &&
        Objects.equals(this.remoteAs, bgpPeer.remoteAs) &&
        Objects.equals(this.shutdown, bgpPeer.shutdown) &&
        Objects.equals(this.subnet, bgpPeer.subnet) &&
        Objects.equals(this.subnet6, bgpPeer.subnet6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiseSnatIp, advertiseVip, advertisementInterval, bfd, connectTimer, ebgpMultihop, holdTime, keepaliveInterval, label, localAs, md5Secret, networkRef, peerIp, peerIp6, remoteAs, shutdown, subnet, subnet6);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpPeer {\n");
    
    sb.append("    advertiseSnatIp: ").append(toIndentedString(advertiseSnatIp)).append("\n");
    sb.append("    advertiseVip: ").append(toIndentedString(advertiseVip)).append("\n");
    sb.append("    advertisementInterval: ").append(toIndentedString(advertisementInterval)).append("\n");
    sb.append("    bfd: ").append(toIndentedString(bfd)).append("\n");
    sb.append("    connectTimer: ").append(toIndentedString(connectTimer)).append("\n");
    sb.append("    ebgpMultihop: ").append(toIndentedString(ebgpMultihop)).append("\n");
    sb.append("    holdTime: ").append(toIndentedString(holdTime)).append("\n");
    sb.append("    keepaliveInterval: ").append(toIndentedString(keepaliveInterval)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    localAs: ").append(toIndentedString(localAs)).append("\n");
    sb.append("    md5Secret: ").append(toIndentedString(md5Secret)).append("\n");
    sb.append("    networkRef: ").append(toIndentedString(networkRef)).append("\n");
    sb.append("    peerIp: ").append(toIndentedString(peerIp)).append("\n");
    sb.append("    peerIp6: ").append(toIndentedString(peerIp6)).append("\n");
    sb.append("    remoteAs: ").append(toIndentedString(remoteAs)).append("\n");
    sb.append("    shutdown: ").append(toIndentedString(shutdown)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
    sb.append("    subnet6: ").append(toIndentedString(subnet6)).append("\n");
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

