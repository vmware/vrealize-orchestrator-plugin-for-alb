package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The BgpProfile is a POJO class extends AviRestResource that used for creating
 * BgpProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BgpProfile")
@VsoFinder(name = Constants.FINDER_VRO_BGPPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BgpProfile extends AviRestResource {
    @JsonProperty("community")
    @JsonInclude(Include.NON_NULL)
    private List<String> community = null;

    @JsonProperty("hold_time")
    @JsonInclude(Include.NON_NULL)
    private Integer holdTime = 180;

    @JsonProperty("ibgp")
    @JsonInclude(Include.NON_NULL)
    private Boolean ibgp = true;

    @JsonProperty("ip_communities")
    @JsonInclude(Include.NON_NULL)
    private List<IpCommunity> ipCommunities = null;

    @JsonProperty("keepalive_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer keepaliveInterval = 60;

    @JsonProperty("local_as")
    @JsonInclude(Include.NON_NULL)
    private Integer localAs = null;

    @JsonProperty("local_preference")
    @JsonInclude(Include.NON_NULL)
    private Integer localPreference = null;

    @JsonProperty("num_as_path_prepend")
    @JsonInclude(Include.NON_NULL)
    private Integer numAsPathPrepend = null;

    @JsonProperty("peers")
    @JsonInclude(Include.NON_NULL)
    private List<BgpPeer> peers = null;

    @JsonProperty("routing_options")
    @JsonInclude(Include.NON_NULL)
    private List<BgpRoutingOptions> routingOptions = null;

    @JsonProperty("send_community")
    @JsonInclude(Include.NON_NULL)
    private Boolean sendCommunity = true;

    @JsonProperty("shutdown")
    @JsonInclude(Include.NON_NULL)
    private Boolean shutdown = false;



  /**
   * This is the getter method this will return the attribute value.
   * Community string either in aa nn format where aa, nn is within [1,65535] or local-as|no-advertise|no-export|internet.
   * Field introduced in 17.1.2.
   * Maximum of 16 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return community
   */
  @VsoMethod
  public List<String> getCommunity() {
    return community;
  }

  /**
   * This is the setter method. this will set the community
   * Community string either in aa nn format where aa, nn is within [1,65535] or local-as|no-advertise|no-export|internet.
   * Field introduced in 17.1.2.
   * Maximum of 16 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return community
   */
  @VsoMethod
  public void setCommunity(List<String>  community) {
    this.community = community;
  }

  /**
   * This is the setter method this will set the community
   * Community string either in aa nn format where aa, nn is within [1,65535] or local-as|no-advertise|no-export|internet.
   * Field introduced in 17.1.2.
   * Maximum of 16 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return community
   */
  @VsoMethod
  public BgpProfile addCommunityItem(String communityItem) {
    if (this.community == null) {
      this.community = new ArrayList<String>();
    }
    this.community.add(communityItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Hold time for peers.
   * Allowed values are 3-7200.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 180.
   * @return holdTime
   */
  @VsoMethod
  public Integer getHoldTime() {
    return holdTime;
  }

  /**
   * This is the setter method to the attribute.
   * Hold time for peers.
   * Allowed values are 3-7200.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 180.
   * @param holdTime set the holdTime.
   */
  @VsoMethod
  public void setHoldTime(Integer  holdTime) {
    this.holdTime = holdTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Bgp peer type.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return ibgp
   */
  @VsoMethod
  public Boolean getIbgp() {
    return ibgp;
  }

  /**
   * This is the setter method to the attribute.
   * Bgp peer type.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param ibgp set the ibgp.
   */
  @VsoMethod
  public void setIbgp(Boolean  ibgp) {
    this.ibgp = ibgp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Communities per ip address range.
   * Field introduced in 17.1.3.
   * Maximum of 1024 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipCommunities
   */
  @VsoMethod
  public List<IpCommunity> getIpCommunities() {
    return ipCommunities;
  }

  /**
   * This is the setter method. this will set the ipCommunities
   * Communities per ip address range.
   * Field introduced in 17.1.3.
   * Maximum of 1024 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipCommunities
   */
  @VsoMethod
  public void setIpCommunities(List<IpCommunity>  ipCommunities) {
    this.ipCommunities = ipCommunities;
  }

  /**
   * This is the setter method this will set the ipCommunities
   * Communities per ip address range.
   * Field introduced in 17.1.3.
   * Maximum of 1024 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipCommunities
   */
  @VsoMethod
  public BgpProfile addIpCommunitiesItem(IpCommunity ipCommunitiesItem) {
    if (this.ipCommunities == null) {
      this.ipCommunities = new ArrayList<IpCommunity>();
    }
    this.ipCommunities.add(ipCommunitiesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Keepalive interval for peers.
   * Allowed values are 0-3600.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return keepaliveInterval
   */
  @VsoMethod
  public Integer getKeepaliveInterval() {
    return keepaliveInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Keepalive interval for peers.
   * Allowed values are 0-3600.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param keepaliveInterval set the keepaliveInterval.
   */
  @VsoMethod
  public void setKeepaliveInterval(Integer  keepaliveInterval) {
    this.keepaliveInterval = keepaliveInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Local autonomous system id.
   * Allowed values are 1-4294967295.
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
   * Local autonomous system id.
   * Allowed values are 1-4294967295.
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
   * Local_pref to be used for routes advertised.
   * Applicable only over ibgp.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return localPreference
   */
  @VsoMethod
  public Integer getLocalPreference() {
    return localPreference;
  }

  /**
   * This is the setter method to the attribute.
   * Local_pref to be used for routes advertised.
   * Applicable only over ibgp.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param localPreference set the localPreference.
   */
  @VsoMethod
  public void setLocalPreference(Integer  localPreference) {
    this.localPreference = localPreference;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of times the local as should be prepended additionally.
   * Allowed values are 1-10.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numAsPathPrepend
   */
  @VsoMethod
  public Integer getNumAsPathPrepend() {
    return numAsPathPrepend;
  }

  /**
   * This is the setter method to the attribute.
   * Number of times the local as should be prepended additionally.
   * Allowed values are 1-10.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numAsPathPrepend set the numAsPathPrepend.
   */
  @VsoMethod
  public void setNumAsPathPrepend(Integer  numAsPathPrepend) {
    this.numAsPathPrepend = numAsPathPrepend;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Bgp peers.
   * Maximum of 128 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return peers
   */
  @VsoMethod
  public List<BgpPeer> getPeers() {
    return peers;
  }

  /**
   * This is the setter method. this will set the peers
   * Bgp peers.
   * Maximum of 128 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return peers
   */
  @VsoMethod
  public void setPeers(List<BgpPeer>  peers) {
    this.peers = peers;
  }

  /**
   * This is the setter method this will set the peers
   * Bgp peers.
   * Maximum of 128 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return peers
   */
  @VsoMethod
  public BgpProfile addPeersItem(BgpPeer peersItem) {
    if (this.peers == null) {
      this.peers = new ArrayList<BgpPeer>();
    }
    this.peers.add(peersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Learning and advertising options for bgp peers.
   * Field introduced in 20.1.1.
   * Maximum of 128 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return routingOptions
   */
  @VsoMethod
  public List<BgpRoutingOptions> getRoutingOptions() {
    return routingOptions;
  }

  /**
   * This is the setter method. this will set the routingOptions
   * Learning and advertising options for bgp peers.
   * Field introduced in 20.1.1.
   * Maximum of 128 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return routingOptions
   */
  @VsoMethod
  public void setRoutingOptions(List<BgpRoutingOptions>  routingOptions) {
    this.routingOptions = routingOptions;
  }

  /**
   * This is the setter method this will set the routingOptions
   * Learning and advertising options for bgp peers.
   * Field introduced in 20.1.1.
   * Maximum of 128 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return routingOptions
   */
  @VsoMethod
  public BgpProfile addRoutingOptionsItem(BgpRoutingOptions routingOptionsItem) {
    if (this.routingOptions == null) {
      this.routingOptions = new ArrayList<BgpRoutingOptions>();
    }
    this.routingOptions.add(routingOptionsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Send community attribute to all peers.
   * Field introduced in 17.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return sendCommunity
   */
  @VsoMethod
  public Boolean getSendCommunity() {
    return sendCommunity;
  }

  /**
   * This is the setter method to the attribute.
   * Send community attribute to all peers.
   * Field introduced in 17.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param sendCommunity set the sendCommunity.
   */
  @VsoMethod
  public void setSendCommunity(Boolean  sendCommunity) {
    this.sendCommunity = sendCommunity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Shutdown the bgp.
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
   * Shutdown the bgp.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param shutdown set the shutdown.
   */
  @VsoMethod
  public void setShutdown(Boolean  shutdown) {
    this.shutdown = shutdown;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  BgpProfile objBgpProfile = (BgpProfile) o;
  return   Objects.equals(this.localAs, objBgpProfile.localAs)&&
  Objects.equals(this.ibgp, objBgpProfile.ibgp)&&
  Objects.equals(this.peers, objBgpProfile.peers)&&
  Objects.equals(this.keepaliveInterval, objBgpProfile.keepaliveInterval)&&
  Objects.equals(this.holdTime, objBgpProfile.holdTime)&&
  Objects.equals(this.sendCommunity, objBgpProfile.sendCommunity)&&
  Objects.equals(this.community, objBgpProfile.community)&&
  Objects.equals(this.ipCommunities, objBgpProfile.ipCommunities)&&
  Objects.equals(this.localPreference, objBgpProfile.localPreference)&&
  Objects.equals(this.numAsPathPrepend, objBgpProfile.numAsPathPrepend)&&
  Objects.equals(this.routingOptions, objBgpProfile.routingOptions)&&
  Objects.equals(this.shutdown, objBgpProfile.shutdown);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BgpProfile {\n");
      sb.append("    community: ").append(toIndentedString(community)).append("\n");
        sb.append("    holdTime: ").append(toIndentedString(holdTime)).append("\n");
        sb.append("    ibgp: ").append(toIndentedString(ibgp)).append("\n");
        sb.append("    ipCommunities: ").append(toIndentedString(ipCommunities)).append("\n");
        sb.append("    keepaliveInterval: ").append(toIndentedString(keepaliveInterval)).append("\n");
        sb.append("    localAs: ").append(toIndentedString(localAs)).append("\n");
        sb.append("    localPreference: ").append(toIndentedString(localPreference)).append("\n");
        sb.append("    numAsPathPrepend: ").append(toIndentedString(numAsPathPrepend)).append("\n");
        sb.append("    peers: ").append(toIndentedString(peers)).append("\n");
        sb.append("    routingOptions: ").append(toIndentedString(routingOptions)).append("\n");
        sb.append("    sendCommunity: ").append(toIndentedString(sendCommunity)).append("\n");
        sb.append("    shutdown: ").append(toIndentedString(shutdown)).append("\n");
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

