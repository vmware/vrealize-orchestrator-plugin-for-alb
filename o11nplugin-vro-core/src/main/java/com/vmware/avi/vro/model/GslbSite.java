package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.GslbGeoLocation;
import com.vmware.avi.vro.model.GslbHealthMonitorProxy;
import com.vmware.avi.vro.model.GslbSiteDnsVs;
import com.vmware.avi.vro.model.IpAddr;
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
 * GslbSite
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GslbSite")
@VsoFinder(name = Constants.FINDER_VRO_GSLBSITE, idAccessor = "getObjectID()")
@Service
public class GslbSite extends AviRestResource  {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("cluster_uuid")
  private String clusterUuid = null;

  @JsonProperty("dns_vs_uuids")
  @Valid
  private List<String> dnsVsUuids = null;

  @JsonProperty("dns_vses")
  @Valid
  private List<GslbSiteDnsVs> dnsVses = null;

  @JsonProperty("enabled")
  private Boolean enabled = true;

  @JsonProperty("hm_proxies")
  @Valid
  private List<GslbHealthMonitorProxy> hmProxies = null;

  @JsonProperty("hm_shard_enabled")
  private Boolean hmShardEnabled = null;

  @JsonProperty("ip_addresses")
  @Valid
  private List<IpAddr> ipAddresses = null;

  @JsonProperty("location")
  private GslbGeoLocation location = null;

  @JsonProperty("member_type")
  private String memberType = "GSLB_PASSIVE_MEMBER";

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("port")
  private Integer port = 443;

  @JsonProperty("ratio")
  private Integer ratio = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * IP Address or a DNS resolvable, fully qualified domain name of the Site Controller Cluster.
   * @return address
  **/
  @ApiModelProperty(value = "IP Address or a DNS resolvable, fully qualified domain name of the Site Controller Cluster.")


 
  @VsoMethod  
  public String getAddress() {
    return address;
  }
    
  @VsoMethod
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * UUID of the 'Cluster' object of the Controller Cluster in this site.
   * @return clusterUuid
  **/
  @ApiModelProperty(required = true, value = "UUID of the 'Cluster' object of the Controller Cluster in this site.")
  @NotNull


 
  @VsoMethod  
  public String getClusterUuid() {
    return clusterUuid;
  }
    
  @VsoMethod
  public void setClusterUuid(String clusterUuid) {
    this.clusterUuid = clusterUuid;
  }

  
  public GslbSite addDnsVsUuidsItem(String dnsVsUuidsItem) {
    if (this.dnsVsUuids == null) {
      this.dnsVsUuids = new ArrayList<String>();
    }
    this.dnsVsUuids.add(dnsVsUuidsItem);
    return this;
  }
  
  /**
   * The DNS VSes on which the GslbServices shall be placed. The site has to be an ACTIVE member.  This field is deprecated in 17.2.3 and replaced by 'dns_vses' field. . Field deprecated in 17.2.3.
   * @return dnsVsUuids
  **/
  @ApiModelProperty(value = "The DNS VSes on which the GslbServices shall be placed. The site has to be an ACTIVE member.  This field is deprecated in 17.2.3 and replaced by 'dns_vses' field. . Field deprecated in 17.2.3.")


 
  @VsoMethod  
  public List<String> getDnsVsUuids() {
    return dnsVsUuids;
  }
    
  @VsoMethod
  public void setDnsVsUuids(List<String> dnsVsUuids) {
    this.dnsVsUuids = dnsVsUuids;
  }

  
  public GslbSite addDnsVsesItem(GslbSiteDnsVs dnsVsesItem) {
    if (this.dnsVses == null) {
      this.dnsVses = new ArrayList<GslbSiteDnsVs>();
    }
    this.dnsVses.add(dnsVsesItem);
    return this;
  }
  
  /**
   * This field identifies the DNS VS and the subdomains it hosts for Gslb services. . Field introduced in 17.2.3.
   * @return dnsVses
  **/
  @ApiModelProperty(value = "This field identifies the DNS VS and the subdomains it hosts for Gslb services. . Field introduced in 17.2.3.")

  @Valid

 
  @VsoMethod  
  public List<GslbSiteDnsVs> getDnsVses() {
    return dnsVses;
  }
    
  @VsoMethod
  public void setDnsVses(List<GslbSiteDnsVs> dnsVses) {
    this.dnsVses = dnsVses;
  }

  
  /**
   * Enable or disable the Site.  This is useful in maintenance scenarios such as upgrade and routine maintenance.  A disabled site's configuration shall be retained but it will not get any new configuration updates.  It shall not participate in Health-Status monitoring.  VIPs of the Virtual Services on the disabled site shall not be sent in DNS response.  When a site transitions from disabled to enabled, it is treated similar to the addition of a new site.
   * @return enabled
  **/
  @ApiModelProperty(value = "Enable or disable the Site.  This is useful in maintenance scenarios such as upgrade and routine maintenance.  A disabled site's configuration shall be retained but it will not get any new configuration updates.  It shall not participate in Health-Status monitoring.  VIPs of the Virtual Services on the disabled site shall not be sent in DNS response.  When a site transitions from disabled to enabled, it is treated similar to the addition of a new site.")


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  public GslbSite addHmProxiesItem(GslbHealthMonitorProxy hmProxiesItem) {
    if (this.hmProxies == null) {
      this.hmProxies = new ArrayList<GslbHealthMonitorProxy>();
    }
    this.hmProxies.add(hmProxiesItem);
    return this;
  }
  
  /**
   * User can designate certain Avi sites to run health monitor probes for VIPs/VS(es) for this site. This is useful in network deployments where the VIPs/VS(es) are reachable only from certain sites. A typical scenario is a firewall between two GSLB sites. User may want to run health monitor probes from sites on either side of the firewall so that each designated site can derive a datapath view of the reachable members. If the health monitor proxies are not configured, then the default behavior is to run health monitor probes from all the active sites. Field introduced in 17.1.1.
   * @return hmProxies
  **/
  @ApiModelProperty(value = "User can designate certain Avi sites to run health monitor probes for VIPs/VS(es) for this site. This is useful in network deployments where the VIPs/VS(es) are reachable only from certain sites. A typical scenario is a firewall between two GSLB sites. User may want to run health monitor probes from sites on either side of the firewall so that each designated site can derive a datapath view of the reachable members. If the health monitor proxies are not configured, then the default behavior is to run health monitor probes from all the active sites. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<GslbHealthMonitorProxy> getHmProxies() {
    return hmProxies;
  }
    
  @VsoMethod
  public void setHmProxies(List<GslbHealthMonitorProxy> hmProxies) {
    this.hmProxies = hmProxies;
  }

  
  /**
   * This field enables the health monitor shard functionality on a site-basis. Field introduced in 18.2.2.
   * @return hmShardEnabled
  **/
  @ApiModelProperty(value = "This field enables the health monitor shard functionality on a site-basis. Field introduced in 18.2.2.")


 
  @VsoMethod  
  public Boolean isHmShardEnabled() {
    return hmShardEnabled;
  }
    
  @VsoMethod
  public void setHmShardEnabled(Boolean hmShardEnabled) {
    this.hmShardEnabled = hmShardEnabled;
  }

  
  public GslbSite addIpAddressesItem(IpAddr ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<IpAddr>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }
  
  /**
   * IP Address(es) of the Site's Cluster. For a 3-node cluster, either the cluster vIP is provided, or the list of controller IPs in the cluster are provided.
   * @return ipAddresses
  **/
  @ApiModelProperty(value = "IP Address(es) of the Site's Cluster. For a 3-node cluster, either the cluster vIP is provided, or the list of controller IPs in the cluster are provided.")

  @Valid

 
  @VsoMethod  
  public List<IpAddr> getIpAddresses() {
    return ipAddresses;
  }
    
  @VsoMethod
  public void setIpAddresses(List<IpAddr> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }

  
  /**
   * Geographic location of the site. Field introduced in 17.1.1.
   * @return location
  **/
  @ApiModelProperty(value = "Geographic location of the site. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public GslbGeoLocation getLocation() {
    return location;
  }
    
  @VsoMethod
  public void setLocation(GslbGeoLocation location) {
    this.location = location;
  }

  
  /**
   * The site's member type  A leader is set to ACTIVE while allmembers are set to passive. . Enum options - GSLB_ACTIVE_MEMBER, GSLB_PASSIVE_MEMBER.
   * @return memberType
  **/
  @ApiModelProperty(value = "The site's member type  A leader is set to ACTIVE while allmembers are set to passive. . Enum options - GSLB_ACTIVE_MEMBER, GSLB_PASSIVE_MEMBER.")


 
  @VsoMethod  
  public String getMemberType() {
    return memberType;
  }
    
  @VsoMethod
  public void setMemberType(String memberType) {
    this.memberType = memberType;
  }

  
  /**
   * Name for the Site Controller Cluster.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name for the Site Controller Cluster.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The password used when authenticating with the Site.
   * @return password
  **/
  @ApiModelProperty(required = true, value = "The password used when authenticating with the Site.")
  @NotNull


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * The Site Controller Cluster's REST API port number. Allowed values are 1-65535.
   * @return port
  **/
  @ApiModelProperty(value = "The Site Controller Cluster's REST API port number. Allowed values are 1-65535.")


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  /**
   * User can overide the individual GslbPoolMember ratio for all the VIPs/VS(es) of this site. If this field is not  configured then the GslbPoolMember ratio gets applied. . Allowed values are 1-20. Field introduced in 17.1.1.
   * @return ratio
  **/
  @ApiModelProperty(value = "User can overide the individual GslbPoolMember ratio for all the VIPs/VS(es) of this site. If this field is not  configured then the GslbPoolMember ratio gets applied. . Allowed values are 1-20. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getRatio() {
    return ratio;
  }
    
  @VsoMethod
  public void setRatio(Integer ratio) {
    this.ratio = ratio;
  }

  
  /**
   * The username used when authenticating with the Site. .
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The username used when authenticating with the Site. .")
  @NotNull


 
  @VsoMethod  
  public String getUsername() {
    return username;
  }
    
  @VsoMethod
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   * This field is used as a key in the datastore for the GslbSite table to encapsulate site-related info. . Field introduced in 17.2.5.
   * @return uuid
  **/
  @ApiModelProperty(value = "This field is used as a key in the datastore for the GslbSite table to encapsulate site-related info. . Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "GslbSite";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GslbSite gslbSite = (GslbSite) o;
    return Objects.equals(this.address, gslbSite.address) &&
        Objects.equals(this.clusterUuid, gslbSite.clusterUuid) &&
        Objects.equals(this.dnsVsUuids, gslbSite.dnsVsUuids) &&
        Objects.equals(this.dnsVses, gslbSite.dnsVses) &&
        Objects.equals(this.enabled, gslbSite.enabled) &&
        Objects.equals(this.hmProxies, gslbSite.hmProxies) &&
        Objects.equals(this.hmShardEnabled, gslbSite.hmShardEnabled) &&
        Objects.equals(this.ipAddresses, gslbSite.ipAddresses) &&
        Objects.equals(this.location, gslbSite.location) &&
        Objects.equals(this.memberType, gslbSite.memberType) &&
        Objects.equals(this.name, gslbSite.name) &&
        Objects.equals(this.password, gslbSite.password) &&
        Objects.equals(this.port, gslbSite.port) &&
        Objects.equals(this.ratio, gslbSite.ratio) &&
        Objects.equals(this.username, gslbSite.username) &&
        Objects.equals(this.uuid, gslbSite.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, clusterUuid, dnsVsUuids, dnsVses, enabled, hmProxies, hmShardEnabled, ipAddresses, location, memberType, name, password, port, ratio, username, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GslbSite {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    clusterUuid: ").append(toIndentedString(clusterUuid)).append("\n");
    sb.append("    dnsVsUuids: ").append(toIndentedString(dnsVsUuids)).append("\n");
    sb.append("    dnsVses: ").append(toIndentedString(dnsVses)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    hmProxies: ").append(toIndentedString(hmProxies)).append("\n");
    sb.append("    hmShardEnabled: ").append(toIndentedString(hmShardEnabled)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

