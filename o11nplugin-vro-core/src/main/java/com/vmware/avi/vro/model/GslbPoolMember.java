package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.GslbGeoLocation;
import com.vmware.avi.vro.model.GslbIpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbPoolMember is a POJO class extends AviRestResource that used for creating
 * GslbPoolMember.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbPoolMember")
@VsoFinder(name = Constants.FINDER_VRO_GSLBPOOLMEMBER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbPoolMember extends AviRestResource {
  @JsonProperty("cloud_uuid")
  @JsonInclude(Include.NON_NULL)
  private String cloudUuid = null;

  @JsonProperty("cluster_uuid")
  @JsonInclude(Include.NON_NULL)
  private String clusterUuid = null;

  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("enabled")
  @JsonInclude(Include.NON_NULL)
  private Boolean enabled = true;

  @JsonProperty("fqdn")
  @JsonInclude(Include.NON_NULL)
  private String fqdn = null;

  @JsonProperty("hm_proxies")
  @JsonInclude(Include.NON_NULL)
  private List<GslbHealthMonitorProxy> hmProxies = null;

  @JsonProperty("hostname")
  @JsonInclude(Include.NON_NULL)
  private String hostname = null;

  @JsonProperty("ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddr ip = null;

  @JsonProperty("location")
  @JsonInclude(Include.NON_NULL)
  private GslbGeoLocation location = null;

  @JsonProperty("public_ip")
  @JsonInclude(Include.NON_NULL)
  private GslbIpAddr publicIp = null;

  @JsonProperty("ratio")
  @JsonInclude(Include.NON_NULL)
  private Integer ratio = 1;

  @JsonProperty("resolve_fqdn_to_v6")
  @JsonInclude(Include.NON_NULL)
  private Boolean resolveFqdnToV6 = false;

  @JsonProperty("vs_uuid")
  @JsonInclude(Include.NON_NULL)
  private String vsUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * The cloud uuid of the site.
   * Field introduced in 17.1.2.
   * @return cloudUuid
   */
  @VsoMethod
  public String getCloudUuid() {
    return cloudUuid;
  }

  /**
   * This is the setter method to the attribute.
   * The cloud uuid of the site.
   * Field introduced in 17.1.2.
   * @param cloudUuid set the cloudUuid.
   */
  @VsoMethod
  public void setCloudUuid(String  cloudUuid) {
    this.cloudUuid = cloudUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The cluster uuid of the site.
   * @return clusterUuid
   */
  @VsoMethod
  public String getClusterUuid() {
    return clusterUuid;
  }

  /**
   * This is the setter method to the attribute.
   * The cluster uuid of the site.
   * @param clusterUuid set the clusterUuid.
   */
  @VsoMethod
  public void setClusterUuid(String  clusterUuid) {
    this.clusterUuid = clusterUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User provided information that records member details such as application owner name, contact, etc.
   * Field introduced in 17.1.3.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * User provided information that records member details such as application owner name, contact, etc.
   * Field introduced in 17.1.3.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable or disable member to decide if this address should be provided in dns responses.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable or disable member to decide if this address should be provided in dns responses.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The pool member is configured with a fully qualified domain name.
   * The fqdn is resolved to an ip address by the controller.
   * Dns service shall health monitor the resolved ip address while it will return the fqdn(cname) in the dns response.if the user has configured an
   * ip address (in addition to the fqdn), then the ip address will get overwritten whenever periodic fqdn refresh is done by the controller.
   * @return fqdn
   */
  @VsoMethod
  public String getFqdn() {
    return fqdn;
  }

  /**
   * This is the setter method to the attribute.
   * The pool member is configured with a fully qualified domain name.
   * The fqdn is resolved to an ip address by the controller.
   * Dns service shall health monitor the resolved ip address while it will return the fqdn(cname) in the dns response.if the user has configured an
   * ip address (in addition to the fqdn), then the ip address will get overwritten whenever periodic fqdn refresh is done by the controller.
   * @param fqdn set the fqdn.
   */
  @VsoMethod
  public void setFqdn(String  fqdn) {
    this.fqdn = fqdn;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Internal generated system-field.
   * Field deprecated in 18.2.2.
   * Field introduced in 17.1.1.
   * @return hmProxies
   */
  @VsoMethod
  public List<GslbHealthMonitorProxy> getHmProxies() {
    return hmProxies;
  }

  /**
   * This is the setter method. this will set the hmProxies
   * Internal generated system-field.
   * Field deprecated in 18.2.2.
   * Field introduced in 17.1.1.
   * @return hmProxies
   */
  @VsoMethod
  public void setHmProxies(List<GslbHealthMonitorProxy>  hmProxies) {
    this.hmProxies = hmProxies;
  }

  /**
   * This is the setter method this will set the hmProxies
   * Internal generated system-field.
   * Field deprecated in 18.2.2.
   * Field introduced in 17.1.1.
   * @return hmProxies
   */
  @VsoMethod
  public GslbPoolMember addHmProxiesItem(GslbHealthMonitorProxy hmProxiesItem) {
    if (this.hmProxies == null) {
      this.hmProxies = new ArrayList<GslbHealthMonitorProxy>();
    }
    this.hmProxies.add(hmProxiesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Hostname to be used as host header for http health monitors and as tls server name for https health monitors.(by default, the fqdn of the gslb
   * pool member or gslb service is used.) note  this field is not used as http host header when exact_http_request is set in the health monitor.
   * Field introduced in 18.2.5.
   * @return hostname
   */
  @VsoMethod
  public String getHostname() {
    return hostname;
  }

  /**
   * This is the setter method to the attribute.
   * Hostname to be used as host header for http health monitors and as tls server name for https health monitors.(by default, the fqdn of the gslb
   * pool member or gslb service is used.) note  this field is not used as http host header when exact_http_request is set in the health monitor.
   * Field introduced in 18.2.5.
   * @param hostname set the hostname.
   */
  @VsoMethod
  public void setHostname(String  hostname) {
    this.hostname = hostname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip address of the pool member.
   * If this ip address is hosted via an avi virtual service, then the user should configure the cluster uuid and virtual service uuid.
   * If this ip address is hosted on a third-party device and the device is tagged/tethered to a third-party site, then user can configure the
   * third-party site uuid.
   * User may configure the ip address without the cluster uuid or the virtual service uuid.
   * In this option, some advanced site related features cannot be enabled.
   * If the user has configured a fqdn for the pool member, then it takes precedence and will overwrite the configured ip address.
   * @return ip
   */
  @VsoMethod
  public IpAddr getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address of the pool member.
   * If this ip address is hosted via an avi virtual service, then the user should configure the cluster uuid and virtual service uuid.
   * If this ip address is hosted on a third-party device and the device is tagged/tethered to a third-party site, then user can configure the
   * third-party site uuid.
   * User may configure the ip address without the cluster uuid or the virtual service uuid.
   * In this option, some advanced site related features cannot be enabled.
   * If the user has configured a fqdn for the pool member, then it takes precedence and will overwrite the configured ip address.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Geographic location of the pool member.
   * Field introduced in 17.1.1.
   * @return location
   */
  @VsoMethod
  public GslbGeoLocation getLocation() {
    return location;
  }

  /**
   * This is the setter method to the attribute.
   * Geographic location of the pool member.
   * Field introduced in 17.1.1.
   * @param location set the location.
   */
  @VsoMethod
  public void setLocation(GslbGeoLocation location) {
    this.location = location;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Alternate ip addresses of the pool member.
   * In usual deployments, the vip in the virtual service is a private ip address.
   * This gets configured in the 'ip' field of the gslb service.
   * This field is used to host the public ip address for the vip, which gets nated to the private ip by a firewall.
   * Client dns requests coming in from within the intranet should have the private ip served in the a record, and requests from outside this should
   * be served the public ip address.
   * Field introduced in 17.1.2.
   * @return publicIp
   */
  @VsoMethod
  public GslbIpAddr getPublicIp() {
    return publicIp;
  }

  /**
   * This is the setter method to the attribute.
   * Alternate ip addresses of the pool member.
   * In usual deployments, the vip in the virtual service is a private ip address.
   * This gets configured in the 'ip' field of the gslb service.
   * This field is used to host the public ip address for the vip, which gets nated to the private ip by a firewall.
   * Client dns requests coming in from within the intranet should have the private ip served in the a record, and requests from outside this should
   * be served the public ip address.
   * Field introduced in 17.1.2.
   * @param publicIp set the publicIp.
   */
  @VsoMethod
  public void setPublicIp(GslbIpAddr publicIp) {
    this.publicIp = publicIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Overrides the default ratio of 1.
   * Reduces the percentage the lb algorithm would pick the server in relation to its peers.
   * Range is 1-20.
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
   * Overrides the default ratio of 1.
   * Reduces the percentage the lb algorithm would pick the server in relation to its peers.
   * Range is 1-20.
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
   * This field indicates if the fqdn should be resolved to a v6 or a v4 address family.
   * Field introduced in 18.2.8, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return resolveFqdnToV6
   */
  @VsoMethod
  public Boolean getResolveFqdnToV6() {
    return resolveFqdnToV6;
  }

  /**
   * This is the setter method to the attribute.
   * This field indicates if the fqdn should be resolved to a v6 or a v4 address family.
   * Field introduced in 18.2.8, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param resolveFqdnToV6 set the resolveFqdnToV6.
   */
  @VsoMethod
  public void setResolveFqdnToV6(Boolean  resolveFqdnToV6) {
    this.resolveFqdnToV6 = resolveFqdnToV6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Select local virtual service in the specified controller cluster belonging to this gslb service.
   * The virtual service may have multiple ip addresses and fqdns.
   * User will have to choose ip address or fqdn and configure it in the respective field.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Select local virtual service in the specified controller cluster belonging to this gslb service.
   * The virtual service may have multiple ip addresses and fqdns.
   * User will have to choose ip address or fqdn and configure it in the respective field.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbPoolMember objGslbPoolMember = (GslbPoolMember) o;
  return   Objects.equals(this.ratio, objGslbPoolMember.ratio)&&
  Objects.equals(this.description, objGslbPoolMember.description)&&
  Objects.equals(this.ip, objGslbPoolMember.ip)&&
  Objects.equals(this.hostname, objGslbPoolMember.hostname)&&
  Objects.equals(this.enabled, objGslbPoolMember.enabled)&&
  Objects.equals(this.fqdn, objGslbPoolMember.fqdn)&&
  Objects.equals(this.publicIp, objGslbPoolMember.publicIp)&&
  Objects.equals(this.vsUuid, objGslbPoolMember.vsUuid)&&
  Objects.equals(this.location, objGslbPoolMember.location)&&
  Objects.equals(this.hmProxies, objGslbPoolMember.hmProxies)&&
  Objects.equals(this.clusterUuid, objGslbPoolMember.clusterUuid)&&
  Objects.equals(this.cloudUuid, objGslbPoolMember.cloudUuid)&&
  Objects.equals(this.resolveFqdnToV6, objGslbPoolMember.resolveFqdnToV6);
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
        sb.append("    resolveFqdnToV6: ").append(toIndentedString(resolveFqdnToV6)).append("\n");
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
