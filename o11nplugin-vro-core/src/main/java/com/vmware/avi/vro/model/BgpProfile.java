package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.BgpPeer;
import com.vmware.avi.vro.model.BgpRoutingOptions;
import com.vmware.avi.vro.model.IpCommunity;
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
 * BgpProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "BgpProfile")
@VsoFinder(name = Constants.FINDER_VRO_BGPPROFILE, idAccessor = "getObjectID()")
@Service
public class BgpProfile extends AviRestResource  {
  @JsonProperty("community")
  @Valid
  private List<String> community = null;

  @JsonProperty("hold_time")
  private Integer holdTime = 180;

  @JsonProperty("ibgp")
  private Boolean ibgp = true;

  @JsonProperty("ip_communities")
  @Valid
  private List<IpCommunity> ipCommunities = null;

  @JsonProperty("keepalive_interval")
  private Integer keepaliveInterval = 60;

  @JsonProperty("local_as")
  private Integer localAs = null;

  @JsonProperty("local_preference")
  private Integer localPreference = null;

  @JsonProperty("num_as_path_prepend")
  private Integer numAsPathPrepend = null;

  @JsonProperty("peers")
  @Valid
  private List<BgpPeer> peers = null;

  @JsonProperty("routing_options")
  @Valid
  private List<BgpRoutingOptions> routingOptions = null;

  @JsonProperty("send_community")
  private Boolean sendCommunity = true;

  @JsonProperty("shutdown")
  private Boolean shutdown = null;

  
  public BgpProfile addCommunityItem(String communityItem) {
    if (this.community == null) {
      this.community = new ArrayList<String>();
    }
    this.community.add(communityItem);
    return this;
  }
  
  /**
   * Community string either in aa nn format where aa, nn is within [1,65535] or local-AS|no-advertise|no-export|internet. Field introduced in 17.1.2.
   * @return community
  **/
  @ApiModelProperty(value = "Community string either in aa nn format where aa, nn is within [1,65535] or local-AS|no-advertise|no-export|internet. Field introduced in 17.1.2.")


 
  @VsoMethod  
  public List<String> getCommunity() {
    return community;
  }
    
  @VsoMethod
  public void setCommunity(List<String> community) {
    this.community = community;
  }

  
  /**
   * Hold time for Peers. Allowed values are 3-7200.
   * @return holdTime
  **/
  @ApiModelProperty(value = "Hold time for Peers. Allowed values are 3-7200.")


 
  @VsoMethod  
  public Integer getHoldTime() {
    return holdTime;
  }
    
  @VsoMethod
  public void setHoldTime(Integer holdTime) {
    this.holdTime = holdTime;
  }

  
  /**
   * BGP peer type.
   * @return ibgp
  **/
  @ApiModelProperty(required = true, value = "BGP peer type.")
  @NotNull


 
  @VsoMethod  
  public Boolean isIbgp() {
    return ibgp;
  }
    
  @VsoMethod
  public void setIbgp(Boolean ibgp) {
    this.ibgp = ibgp;
  }

  
  public BgpProfile addIpCommunitiesItem(IpCommunity ipCommunitiesItem) {
    if (this.ipCommunities == null) {
      this.ipCommunities = new ArrayList<IpCommunity>();
    }
    this.ipCommunities.add(ipCommunitiesItem);
    return this;
  }
  
  /**
   * Communities per IP address range. Field introduced in 17.1.3.
   * @return ipCommunities
  **/
  @ApiModelProperty(value = "Communities per IP address range. Field introduced in 17.1.3.")

  @Valid

 
  @VsoMethod  
  public List<IpCommunity> getIpCommunities() {
    return ipCommunities;
  }
    
  @VsoMethod
  public void setIpCommunities(List<IpCommunity> ipCommunities) {
    this.ipCommunities = ipCommunities;
  }

  
  /**
   * Keepalive interval for Peers. Allowed values are 0-3600.
   * @return keepaliveInterval
  **/
  @ApiModelProperty(value = "Keepalive interval for Peers. Allowed values are 0-3600.")


 
  @VsoMethod  
  public Integer getKeepaliveInterval() {
    return keepaliveInterval;
  }
    
  @VsoMethod
  public void setKeepaliveInterval(Integer keepaliveInterval) {
    this.keepaliveInterval = keepaliveInterval;
  }

  
  /**
   * Local Autonomous System ID. Allowed values are 1-4294967295.
   * @return localAs
  **/
  @ApiModelProperty(required = true, value = "Local Autonomous System ID. Allowed values are 1-4294967295.")
  @NotNull


 
  @VsoMethod  
  public Integer getLocalAs() {
    return localAs;
  }
    
  @VsoMethod
  public void setLocalAs(Integer localAs) {
    this.localAs = localAs;
  }

  
  /**
   * LOCAL_PREF to be used for routes advertised. Applicable only over iBGP. Field introduced in 20.1.1.
   * @return localPreference
  **/
  @ApiModelProperty(value = "LOCAL_PREF to be used for routes advertised. Applicable only over iBGP. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getLocalPreference() {
    return localPreference;
  }
    
  @VsoMethod
  public void setLocalPreference(Integer localPreference) {
    this.localPreference = localPreference;
  }

  
  /**
   * Number of times the local AS should be prepended additionally. Allowed values are 1-10. Field introduced in 20.1.1.
   * @return numAsPathPrepend
  **/
  @ApiModelProperty(value = "Number of times the local AS should be prepended additionally. Allowed values are 1-10. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getNumAsPathPrepend() {
    return numAsPathPrepend;
  }
    
  @VsoMethod
  public void setNumAsPathPrepend(Integer numAsPathPrepend) {
    this.numAsPathPrepend = numAsPathPrepend;
  }

  
  public BgpProfile addPeersItem(BgpPeer peersItem) {
    if (this.peers == null) {
      this.peers = new ArrayList<BgpPeer>();
    }
    this.peers.add(peersItem);
    return this;
  }
  
  /**
   * BGP Peers.
   * @return peers
  **/
  @ApiModelProperty(value = "BGP Peers.")

  @Valid

 
  @VsoMethod  
  public List<BgpPeer> getPeers() {
    return peers;
  }
    
  @VsoMethod
  public void setPeers(List<BgpPeer> peers) {
    this.peers = peers;
  }

  
  public BgpProfile addRoutingOptionsItem(BgpRoutingOptions routingOptionsItem) {
    if (this.routingOptions == null) {
      this.routingOptions = new ArrayList<BgpRoutingOptions>();
    }
    this.routingOptions.add(routingOptionsItem);
    return this;
  }
  
  /**
   * Learning and advertising options for BGP peers. Field introduced in 20.1.1.
   * @return routingOptions
  **/
  @ApiModelProperty(value = "Learning and advertising options for BGP peers. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public List<BgpRoutingOptions> getRoutingOptions() {
    return routingOptions;
  }
    
  @VsoMethod
  public void setRoutingOptions(List<BgpRoutingOptions> routingOptions) {
    this.routingOptions = routingOptions;
  }

  
  /**
   * Send community attribute to all peers. Field introduced in 17.1.2.
   * @return sendCommunity
  **/
  @ApiModelProperty(value = "Send community attribute to all peers. Field introduced in 17.1.2.")


 
  @VsoMethod  
  public Boolean isSendCommunity() {
    return sendCommunity;
  }
    
  @VsoMethod
  public void setSendCommunity(Boolean sendCommunity) {
    this.sendCommunity = sendCommunity;
  }

  
  /**
   * Shutdown the bgp. Field introduced in 17.2.4.
   * @return shutdown
  **/
  @ApiModelProperty(value = "Shutdown the bgp. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public Boolean isShutdown() {
    return shutdown;
  }
    
  @VsoMethod
  public void setShutdown(Boolean shutdown) {
    this.shutdown = shutdown;
  }

  
  public String getObjectID() {
		return "BgpProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpProfile bgpProfile = (BgpProfile) o;
    return Objects.equals(this.community, bgpProfile.community) &&
        Objects.equals(this.holdTime, bgpProfile.holdTime) &&
        Objects.equals(this.ibgp, bgpProfile.ibgp) &&
        Objects.equals(this.ipCommunities, bgpProfile.ipCommunities) &&
        Objects.equals(this.keepaliveInterval, bgpProfile.keepaliveInterval) &&
        Objects.equals(this.localAs, bgpProfile.localAs) &&
        Objects.equals(this.localPreference, bgpProfile.localPreference) &&
        Objects.equals(this.numAsPathPrepend, bgpProfile.numAsPathPrepend) &&
        Objects.equals(this.peers, bgpProfile.peers) &&
        Objects.equals(this.routingOptions, bgpProfile.routingOptions) &&
        Objects.equals(this.sendCommunity, bgpProfile.sendCommunity) &&
        Objects.equals(this.shutdown, bgpProfile.shutdown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(community, holdTime, ibgp, ipCommunities, keepaliveInterval, localAs, localPreference, numAsPathPrepend, peers, routingOptions, sendCommunity, shutdown);
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

