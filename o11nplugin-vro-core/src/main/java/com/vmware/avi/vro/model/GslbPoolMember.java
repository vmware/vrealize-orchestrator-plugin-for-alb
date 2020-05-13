package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.GslbGeoLocation;
import com.vmware.avi.vro.model.GslbHealthMonitorProxy;
import com.vmware.avi.vro.model.GslbIpAddr;
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
 * GslbPoolMember
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GslbPoolMember")
@VsoFinder(name = Constants.FINDER_VRO_GSLBPOOLMEMBER, idAccessor = "getObjectID()")
@Service
public class GslbPoolMember extends AviRestResource  {
  @JsonProperty("cloud_uuid")
  private String cloudUuid = null;

  @JsonProperty("cluster_uuid")
  private String clusterUuid = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("enabled")
  private Boolean enabled = true;

  @JsonProperty("fqdn")
  private String fqdn = null;

  @JsonProperty("hm_proxies")
  @Valid
  private List<GslbHealthMonitorProxy> hmProxies = null;

  @JsonProperty("hostname")
  private String hostname = null;

  @JsonProperty("ip")
  private IpAddr ip = null;

  @JsonProperty("location")
  private GslbGeoLocation location = null;

  @JsonProperty("public_ip")
  private GslbIpAddr publicIp = null;

  @JsonProperty("ratio")
  private Integer ratio = 1;

  @JsonProperty("vs_uuid")
  private String vsUuid = null;

  
  /**
   * The Cloud UUID of the Site. Field introduced in 17.1.2.
   * @return cloudUuid
  **/
  @ApiModelProperty(value = "The Cloud UUID of the Site. Field introduced in 17.1.2.")


 
  @VsoMethod  
  public String getCloudUuid() {
    return cloudUuid;
  }
    
  @VsoMethod
  public void setCloudUuid(String cloudUuid) {
    this.cloudUuid = cloudUuid;
  }

  
  /**
   * The Cluster UUID of the Site.
   * @return clusterUuid
  **/
  @ApiModelProperty(value = "The Cluster UUID of the Site.")


 
  @VsoMethod  
  public String getClusterUuid() {
    return clusterUuid;
  }
    
  @VsoMethod
  public void setClusterUuid(String clusterUuid) {
    this.clusterUuid = clusterUuid;
  }

  
  /**
   * User provided information that records member details such as application owner name, contact, etc. Field introduced in 17.1.3.
   * @return description
  **/
  @ApiModelProperty(value = "User provided information that records member details such as application owner name, contact, etc. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Enable or Disable member to decide if this address should be provided in DNS responses.
   * @return enabled
  **/
  @ApiModelProperty(value = "Enable or Disable member to decide if this address should be provided in DNS responses.")


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * The pool member is configured with a fully qualified domain name.  The FQDN is resolved to an IP address by the controller. DNS service shall health monitor the resolved IP address while it will return the fqdn(cname) in the DNS response.If the user has configured an IP address (in addition to the FQDN), then the IP address will get overwritten whenever periodic FQDN refresh is done by the controller. .
   * @return fqdn
  **/
  @ApiModelProperty(value = "The pool member is configured with a fully qualified domain name.  The FQDN is resolved to an IP address by the controller. DNS service shall health monitor the resolved IP address while it will return the fqdn(cname) in the DNS response.If the user has configured an IP address (in addition to the FQDN), then the IP address will get overwritten whenever periodic FQDN refresh is done by the controller. .")


 
  @VsoMethod  
  public String getFqdn() {
    return fqdn;
  }
    
  @VsoMethod
  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }

  
  public GslbPoolMember addHmProxiesItem(GslbHealthMonitorProxy hmProxiesItem) {
    if (this.hmProxies == null) {
      this.hmProxies = new ArrayList<GslbHealthMonitorProxy>();
    }
    this.hmProxies.add(hmProxiesItem);
    return this;
  }
  
  /**
   * Internal generated system-field. Field deprecated in 18.2.2. Field introduced in 17.1.1.
   * @return hmProxies
  **/
  @ApiModelProperty(value = "Internal generated system-field. Field deprecated in 18.2.2. Field introduced in 17.1.1.")

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
   * Hostname to be used as host header for http health monitors and as TLS server name for https health monitors.(By default, the fqdn of the GSLB pool member or GSLB service is used.) Note  this field is not used as http host header when exact_http_request is set in the health monitor. . Field introduced in 18.2.5.
   * @return hostname
  **/
  @ApiModelProperty(value = "Hostname to be used as host header for http health monitors and as TLS server name for https health monitors.(By default, the fqdn of the GSLB pool member or GSLB service is used.) Note  this field is not used as http host header when exact_http_request is set in the health monitor. . Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getHostname() {
    return hostname;
  }
    
  @VsoMethod
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  
  /**
   * IP address of the pool member. If this IP address is hosted via an AVI virtual service, then the user should configure the cluster uuid and virtual service uuid. If this IP address is hosted on a third-party device and the device is tagged/tethered to a third-party site, then user can configure the third-party site uuid.  User may configure the IP address without the cluster uuid or the virtual service uuid.  In this option, some advanced site related features cannot be enabled. If the user has configured a fqdn for the pool member, then it takes precedence and will overwrite the configured IP address. .
   * @return ip
  **/
  @ApiModelProperty(value = "IP address of the pool member. If this IP address is hosted via an AVI virtual service, then the user should configure the cluster uuid and virtual service uuid. If this IP address is hosted on a third-party device and the device is tagged/tethered to a third-party site, then user can configure the third-party site uuid.  User may configure the IP address without the cluster uuid or the virtual service uuid.  In this option, some advanced site related features cannot be enabled. If the user has configured a fqdn for the pool member, then it takes precedence and will overwrite the configured IP address. .")

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
   * Geographic location of the pool member. Field introduced in 17.1.1.
   * @return location
  **/
  @ApiModelProperty(value = "Geographic location of the pool member. Field introduced in 17.1.1.")

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
   * Alternate IP addresses of the pool member. In usual deployments, the VIP in the virtual service is a private IP address. This gets configured in the 'ip' field of the GSLB service. This field is used to host the public IP address for the VIP, which gets NATed to the private IP by a firewall. Client DNS requests coming in from within the intranet should have the private IP served in the A record, and requests from outside this should be served the public IP address. Field introduced in 17.1.2.
   * @return publicIp
  **/
  @ApiModelProperty(value = "Alternate IP addresses of the pool member. In usual deployments, the VIP in the virtual service is a private IP address. This gets configured in the 'ip' field of the GSLB service. This field is used to host the public IP address for the VIP, which gets NATed to the private IP by a firewall. Client DNS requests coming in from within the intranet should have the private IP served in the A record, and requests from outside this should be served the public IP address. Field introduced in 17.1.2.")

  @Valid

 
  @VsoMethod  
  public GslbIpAddr getPublicIp() {
    return publicIp;
  }
    
  @VsoMethod
  public void setPublicIp(GslbIpAddr publicIp) {
    this.publicIp = publicIp;
  }

  
  /**
   * Overrides the default ratio of 1.  Reduces the percentage the LB algorithm would pick the server in relation to its peers.  Range is 1-20. Allowed values are 1-20.
   * @return ratio
  **/
  @ApiModelProperty(value = "Overrides the default ratio of 1.  Reduces the percentage the LB algorithm would pick the server in relation to its peers.  Range is 1-20. Allowed values are 1-20.")


 
  @VsoMethod  
  public Integer getRatio() {
    return ratio;
  }
    
  @VsoMethod
  public void setRatio(Integer ratio) {
    this.ratio = ratio;
  }

  
  /**
   * Select local virtual service in the specified controller cluster belonging to this GSLB service. The virtual service may have multiple IP addresses and FQDNs.  User will have to choose IP address or FQDN and configure it in the respective field. .
   * @return vsUuid
  **/
  @ApiModelProperty(value = "Select local virtual service in the specified controller cluster belonging to this GSLB service. The virtual service may have multiple IP addresses and FQDNs.  User will have to choose IP address or FQDN and configure it in the respective field. .")


 
  @VsoMethod  
  public String getVsUuid() {
    return vsUuid;
  }
    
  @VsoMethod
  public void setVsUuid(String vsUuid) {
    this.vsUuid = vsUuid;
  }

  
  public String getObjectID() {
		return "GslbPoolMember";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GslbPoolMember gslbPoolMember = (GslbPoolMember) o;
    return Objects.equals(this.cloudUuid, gslbPoolMember.cloudUuid) &&
        Objects.equals(this.clusterUuid, gslbPoolMember.clusterUuid) &&
        Objects.equals(this.description, gslbPoolMember.description) &&
        Objects.equals(this.enabled, gslbPoolMember.enabled) &&
        Objects.equals(this.fqdn, gslbPoolMember.fqdn) &&
        Objects.equals(this.hmProxies, gslbPoolMember.hmProxies) &&
        Objects.equals(this.hostname, gslbPoolMember.hostname) &&
        Objects.equals(this.ip, gslbPoolMember.ip) &&
        Objects.equals(this.location, gslbPoolMember.location) &&
        Objects.equals(this.publicIp, gslbPoolMember.publicIp) &&
        Objects.equals(this.ratio, gslbPoolMember.ratio) &&
        Objects.equals(this.vsUuid, gslbPoolMember.vsUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudUuid, clusterUuid, description, enabled, fqdn, hmProxies, hostname, ip, location, publicIp, ratio, vsUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GslbPoolMember {\n");
    
    sb.append("    cloudUuid: ").append(toIndentedString(cloudUuid)).append("\n");
    sb.append("    clusterUuid: ").append(toIndentedString(clusterUuid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    hmProxies: ").append(toIndentedString(hmProxies)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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

