package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The BgpPeer is a POJO class extends AviRestResource that used for creating
 * BgpPeer.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BgpPeer")
@VsoFinder(name = Constants.FINDER_VRO_BGPPEER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BgpPeer extends AviRestResource {
    @JsonProperty("advertise_snat_ip")
    @JsonInclude(Include.NON_NULL)
    private Boolean advertiseSnatIp = true;

    @JsonProperty("advertise_vip")
    @JsonInclude(Include.NON_NULL)
    private Boolean advertiseVip = true;

    @JsonProperty("advertisement_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer advertisementInterval = 5;

    @JsonProperty("bfd")
    @JsonInclude(Include.NON_NULL)
    private Boolean bfd = true;

    @JsonProperty("connect_timer")
    @JsonInclude(Include.NON_NULL)
    private Integer connectTimer = 10;

    @JsonProperty("ebgp_multihop")
    @JsonInclude(Include.NON_NULL)
    private Integer ebgpMultihop = 0;

    @JsonProperty("hold_time")
    @JsonInclude(Include.NON_NULL)
    private Integer holdTime = null;

    @JsonProperty("ibgp_local_as_override")
    @JsonInclude(Include.NON_NULL)
    private Boolean ibgpLocalAsOverride = null;

    @JsonProperty("keepalive_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer keepaliveInterval = null;

    @JsonProperty("label")
    @JsonInclude(Include.NON_NULL)
    private String label = null;

    @JsonProperty("local_as")
    @JsonInclude(Include.NON_NULL)
    private Integer localAs = null;

    @JsonProperty("md5_secret")
    @JsonInclude(Include.NON_NULL)
    private String md5Secret = null;

    @JsonProperty("network_ref")
    @JsonInclude(Include.NON_NULL)
    private String networkRef = null;

    @JsonProperty("peer_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr peerIp = null;

    @JsonProperty("peer_ip6")
    @JsonInclude(Include.NON_NULL)
    private IpAddr peerIp6 = null;

    @JsonProperty("remote_as")
    @JsonInclude(Include.NON_NULL)
    private Integer remoteAs = null;

    @JsonProperty("shutdown")
    @JsonInclude(Include.NON_NULL)
    private Boolean shutdown = false;

    @JsonProperty("subnet")
    @JsonInclude(Include.NON_NULL)
    private IpAddrPrefix subnet = null;

    @JsonProperty("subnet6")
    @JsonInclude(Include.NON_NULL)
    private IpAddrPrefix subnet6 = null;



  /**
   * This is the getter method this will return the attribute value.
   * Advertise snat ip to this peer.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return advertiseSnatIp
   */
  @VsoMethod
  public Boolean getAdvertiseSnatIp() {
    return advertiseSnatIp;
  }

  /**
   * This is the setter method to the attribute.
   * Advertise snat ip to this peer.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param advertiseSnatIp set the advertiseSnatIp.
   */
  @VsoMethod
  public void setAdvertiseSnatIp(Boolean  advertiseSnatIp) {
    this.advertiseSnatIp = advertiseSnatIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Advertise vip to this peer.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return advertiseVip
   */
  @VsoMethod
  public Boolean getAdvertiseVip() {
    return advertiseVip;
  }

  /**
   * This is the setter method to the attribute.
   * Advertise vip to this peer.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param advertiseVip set the advertiseVip.
   */
  @VsoMethod
  public void setAdvertiseVip(Boolean  advertiseVip) {
    this.advertiseVip = advertiseVip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Advertisement interval for this peer.
   * Allowed values are 1-60.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return advertisementInterval
   */
  @VsoMethod
  public Integer getAdvertisementInterval() {
    return advertisementInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Advertisement interval for this peer.
   * Allowed values are 1-60.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param advertisementInterval set the advertisementInterval.
   */
  @VsoMethod
  public void setAdvertisementInterval(Integer  advertisementInterval) {
    this.advertisementInterval = advertisementInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable bi-directional forward detection.
   * Only async mode supported.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return bfd
   */
  @VsoMethod
  public Boolean getBfd() {
    return bfd;
  }

  /**
   * This is the setter method to the attribute.
   * Enable bi-directional forward detection.
   * Only async mode supported.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param bfd set the bfd.
   */
  @VsoMethod
  public void setBfd(Boolean  bfd) {
    this.bfd = bfd;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Connect timer for this peer.
   * Allowed values are 1-120.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return connectTimer
   */
  @VsoMethod
  public Integer getConnectTimer() {
    return connectTimer;
  }

  /**
   * This is the setter method to the attribute.
   * Connect timer for this peer.
   * Allowed values are 1-120.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param connectTimer set the connectTimer.
   */
  @VsoMethod
  public void setConnectTimer(Integer  connectTimer) {
    this.connectTimer = connectTimer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ttl for multihop ebgp peer.
   * Allowed values are 0-255.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return ebgpMultihop
   */
  @VsoMethod
  public Integer getEbgpMultihop() {
    return ebgpMultihop;
  }

  /**
   * This is the setter method to the attribute.
   * Ttl for multihop ebgp peer.
   * Allowed values are 0-255.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param ebgpMultihop set the ebgpMultihop.
   */
  @VsoMethod
  public void setEbgpMultihop(Integer  ebgpMultihop) {
    this.ebgpMultihop = ebgpMultihop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Hold time for this peer.
   * Allowed values are 3-7200.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return holdTime
   */
  @VsoMethod
  public Integer getHoldTime() {
    return holdTime;
  }

  /**
   * This is the setter method to the attribute.
   * Hold time for this peer.
   * Allowed values are 3-7200.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param holdTime set the holdTime.
   */
  @VsoMethod
  public void setHoldTime(Integer  holdTime) {
    this.holdTime = holdTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Override the profile level local_as with the peer level remote_as.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ibgpLocalAsOverride
   */
  @VsoMethod
  public Boolean getIbgpLocalAsOverride() {
    return ibgpLocalAsOverride;
  }

  /**
   * This is the setter method to the attribute.
   * Override the profile level local_as with the peer level remote_as.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ibgpLocalAsOverride set the ibgpLocalAsOverride.
   */
  @VsoMethod
  public void setIbgpLocalAsOverride(Boolean  ibgpLocalAsOverride) {
    this.ibgpLocalAsOverride = ibgpLocalAsOverride;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Keepalive interval for this peer.
   * Allowed values are 0-3600.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return keepaliveInterval
   */
  @VsoMethod
  public Integer getKeepaliveInterval() {
    return keepaliveInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Keepalive interval for this peer.
   * Allowed values are 0-3600.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param keepaliveInterval set the keepaliveInterval.
   */
  @VsoMethod
  public void setKeepaliveInterval(Integer  keepaliveInterval) {
    this.keepaliveInterval = keepaliveInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Label used to enable learning and/or advertisement of routes to this peer.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return label
   */
  @VsoMethod
  public String getLabel() {
    return label;
  }

  /**
   * This is the setter method to the attribute.
   * Label used to enable learning and/or advertisement of routes to this peer.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param label set the label.
   */
  @VsoMethod
  public void setLabel(String  label) {
    this.label = label;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Local as to use for this ebgp peer.
   * If specified, this will override the local as configured at the vrf level.
   * Allowed values are 1-4294967295.
   * Field introduced in 17.1.6,17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return localAs
   */
  @VsoMethod
  public Integer getLocalAs() {
    return localAs;
  }

  /**
   * This is the setter method to the attribute.
   * Local as to use for this ebgp peer.
   * If specified, this will override the local as configured at the vrf level.
   * Allowed values are 1-4294967295.
   * Field introduced in 17.1.6,17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param localAs set the localAs.
   */
  @VsoMethod
  public void setLocalAs(Integer  localAs) {
    this.localAs = localAs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Peer autonomous system md5 digest secret key.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return md5Secret
   */
  @VsoMethod
  public String getMd5Secret() {
    return md5Secret;
  }

  /**
   * This is the setter method to the attribute.
   * Peer autonomous system md5 digest secret key.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param md5Secret set the md5Secret.
   */
  @VsoMethod
  public void setMd5Secret(String  md5Secret) {
    this.md5Secret = md5Secret;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Network providing reachability for peer.
   * It is a reference to an object of type network.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networkRef
   */
  @VsoMethod
  public String getNetworkRef() {
    return networkRef;
  }

  /**
   * This is the setter method to the attribute.
   * Network providing reachability for peer.
   * It is a reference to an object of type network.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param networkRef set the networkRef.
   */
  @VsoMethod
  public void setNetworkRef(String  networkRef) {
    this.networkRef = networkRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip address of the bgp peer.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return peerIp
   */
  @VsoMethod
  public IpAddr getPeerIp() {
    return peerIp;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address of the bgp peer.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param peerIp set the peerIp.
   */
  @VsoMethod
  public void setPeerIp(IpAddr peerIp) {
    this.peerIp = peerIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipv6 address of the bgp peer.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return peerIp6
   */
  @VsoMethod
  public IpAddr getPeerIp6() {
    return peerIp6;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv6 address of the bgp peer.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param peerIp6 set the peerIp6.
   */
  @VsoMethod
  public void setPeerIp6(IpAddr peerIp6) {
    this.peerIp6 = peerIp6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Peer autonomous system id.
   * Allowed values are 1-4294967295.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return remoteAs
   */
  @VsoMethod
  public Integer getRemoteAs() {
    return remoteAs;
  }

  /**
   * This is the setter method to the attribute.
   * Peer autonomous system id.
   * Allowed values are 1-4294967295.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param remoteAs set the remoteAs.
   */
  @VsoMethod
  public void setRemoteAs(Integer  remoteAs) {
    this.remoteAs = remoteAs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Shutdown the bgp peer.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return shutdown
   */
  @VsoMethod
  public Boolean getShutdown() {
    return shutdown;
  }

  /**
   * This is the setter method to the attribute.
   * Shutdown the bgp peer.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param shutdown set the shutdown.
   */
  @VsoMethod
  public void setShutdown(Boolean  shutdown) {
    this.shutdown = shutdown;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Subnet providing reachability for peer.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subnet
   */
  @VsoMethod
  public IpAddrPrefix getSubnet() {
    return subnet;
  }

  /**
   * This is the setter method to the attribute.
   * Subnet providing reachability for peer.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subnet set the subnet.
   */
  @VsoMethod
  public void setSubnet(IpAddrPrefix subnet) {
    this.subnet = subnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipv6 subnet providing reachability for peer.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subnet6
   */
  @VsoMethod
  public IpAddrPrefix getSubnet6() {
    return subnet6;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv6 subnet providing reachability for peer.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subnet6 set the subnet6.
   */
  @VsoMethod
  public void setSubnet6(IpAddrPrefix subnet6) {
    this.subnet6 = subnet6;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  BgpPeer objBgpPeer = (BgpPeer) o;
  return   Objects.equals(this.remoteAs, objBgpPeer.remoteAs)&&
  Objects.equals(this.peerIp, objBgpPeer.peerIp)&&
  Objects.equals(this.subnet, objBgpPeer.subnet)&&
  Objects.equals(this.md5Secret, objBgpPeer.md5Secret)&&
  Objects.equals(this.bfd, objBgpPeer.bfd)&&
  Objects.equals(this.networkRef, objBgpPeer.networkRef)&&
  Objects.equals(this.advertiseVip, objBgpPeer.advertiseVip)&&
  Objects.equals(this.advertiseSnatIp, objBgpPeer.advertiseSnatIp)&&
  Objects.equals(this.advertisementInterval, objBgpPeer.advertisementInterval)&&
  Objects.equals(this.connectTimer, objBgpPeer.connectTimer)&&
  Objects.equals(this.keepaliveInterval, objBgpPeer.keepaliveInterval)&&
  Objects.equals(this.holdTime, objBgpPeer.holdTime)&&
  Objects.equals(this.ebgpMultihop, objBgpPeer.ebgpMultihop)&&
  Objects.equals(this.localAs, objBgpPeer.localAs)&&
  Objects.equals(this.peerIp6, objBgpPeer.peerIp6)&&
  Objects.equals(this.subnet6, objBgpPeer.subnet6)&&
  Objects.equals(this.shutdown, objBgpPeer.shutdown)&&
  Objects.equals(this.label, objBgpPeer.label)&&
  Objects.equals(this.ibgpLocalAsOverride, objBgpPeer.ibgpLocalAsOverride);
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
        sb.append("    ibgpLocalAsOverride: ").append(toIndentedString(ibgpLocalAsOverride)).append("\n");
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

