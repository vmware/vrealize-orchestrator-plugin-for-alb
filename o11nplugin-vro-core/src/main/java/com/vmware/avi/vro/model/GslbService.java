package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.GslbPool;
import com.vmware.avi.vro.model.GslbServiceDownResponse;
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
 * GslbService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GslbService")
@VsoFinder(name = Constants.FINDER_VRO_GSLBSERVICE, idAccessor = "getObjectID()")
@Service
public class GslbService extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("application_persistence_profile_ref")
  private String applicationPersistenceProfileRef = null;

  @JsonProperty("controller_health_status_enabled")
  private Boolean controllerHealthStatusEnabled = true;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("domain_names")
  @Valid
  private List<String> domainNames = null;

  @JsonProperty("down_response")
  private GslbServiceDownResponse downResponse = null;

  @JsonProperty("enabled")
  private Boolean enabled = true;

  @JsonProperty("groups")
  @Valid
  private List<GslbPool> groups = null;

  @JsonProperty("health_monitor_refs")
  @Valid
  private List<String> healthMonitorRefs = null;

  @JsonProperty("health_monitor_scope")
  private String healthMonitorScope = "GSLB_SERVICE_HEALTH_MONITOR_ALL_MEMBERS";

  @JsonProperty("hm_off")
  private Boolean hmOff = null;

  @JsonProperty("is_federated")
  private Boolean isFederated = true;

  @JsonProperty("min_members")
  private Integer minMembers = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("num_dns_ip")
  private Integer numDnsIp = null;

  @JsonProperty("pool_algorithm")
  private String poolAlgorithm = "GSLB_SERVICE_ALGORITHM_PRIORITY";

  @JsonProperty("resolve_cname")
  private Boolean resolveCname = null;

  @JsonProperty("site_persistence_enabled")
  private Boolean sitePersistenceEnabled = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("ttl")
  private Integer ttl = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("use_edns_client_subnet")
  private Boolean useEdnsClientSubnet = true;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("wildcard_match")
  private Boolean wildcardMatch = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * The federated application persistence associated with GslbService site persistence functionality. . It is a reference to an object of type ApplicationPersistenceProfile. Field introduced in 17.2.1.
   * @return applicationPersistenceProfileRef
  **/
  @ApiModelProperty(value = "The federated application persistence associated with GslbService site persistence functionality. . It is a reference to an object of type ApplicationPersistenceProfile. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getApplicationPersistenceProfileRef() {
    return applicationPersistenceProfileRef;
  }
    
  @VsoMethod
  public void setApplicationPersistenceProfileRef(String applicationPersistenceProfileRef) {
    this.applicationPersistenceProfileRef = applicationPersistenceProfileRef;
  }

  
  /**
   * GS member's overall health status is derived based on a combination of controller and datapath health-status inputs. Note that the datapath status is determined by the association of health monitor profiles. Only the controller provided status is determined through this configuration. .
   * @return controllerHealthStatusEnabled
  **/
  @ApiModelProperty(value = "GS member's overall health status is derived based on a combination of controller and datapath health-status inputs. Note that the datapath status is determined by the association of health monitor profiles. Only the controller provided status is determined through this configuration. .")


 
  @VsoMethod  
  public Boolean isControllerHealthStatusEnabled() {
    return controllerHealthStatusEnabled;
  }
    
  @VsoMethod
  public void setControllerHealthStatusEnabled(Boolean controllerHealthStatusEnabled) {
    this.controllerHealthStatusEnabled = controllerHealthStatusEnabled;
  }

  
  /**
   * Creator name. Field introduced in 17.1.2.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Creator name. Field introduced in 17.1.2.")


 
  @VsoMethod  
  public String getCreatedBy() {
    return createdBy;
  }
    
  @VsoMethod
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * User defined description for the object.
   * @return description
  **/
  @ApiModelProperty(value = "User defined description for the object.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  public GslbService addDomainNamesItem(String domainNamesItem) {
    if (this.domainNames == null) {
      this.domainNames = new ArrayList<String>();
    }
    this.domainNames.add(domainNamesItem);
    return this;
  }
  
  /**
   * Fully qualified domain name of the GSLB service.
   * @return domainNames
  **/
  @ApiModelProperty(value = "Fully qualified domain name of the GSLB service.")


 
  @VsoMethod  
  public List<String> getDomainNames() {
    return domainNames;
  }
    
  @VsoMethod
  public void setDomainNames(List<String> domainNames) {
    this.domainNames = domainNames;
  }

  
  /**
   * Response to the client query when the GSLB service is DOWN.
   * @return downResponse
  **/
  @ApiModelProperty(value = "Response to the client query when the GSLB service is DOWN.")

  @Valid

 
  @VsoMethod  
  public GslbServiceDownResponse getDownResponse() {
    return downResponse;
  }
    
  @VsoMethod
  public void setDownResponse(GslbServiceDownResponse downResponse) {
    this.downResponse = downResponse;
  }

  
  /**
   * Enable or disable the GSLB service. If the GSLB service is enabled, then the VIPs are sent in the DNS responses based on reachability and configured algorithm. If the GSLB service is disabled, then the VIPs are no longer available in the DNS response.
   * @return enabled
  **/
  @ApiModelProperty(value = "Enable or disable the GSLB service. If the GSLB service is enabled, then the VIPs are sent in the DNS responses based on reachability and configured algorithm. If the GSLB service is disabled, then the VIPs are no longer available in the DNS response.")


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  public GslbService addGroupsItem(GslbPool groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<GslbPool>();
    }
    this.groups.add(groupsItem);
    return this;
  }
  
  /**
   * Select list of pools belonging to this GSLB service.
   * @return groups
  **/
  @ApiModelProperty(value = "Select list of pools belonging to this GSLB service.")

  @Valid

 
  @VsoMethod  
  public List<GslbPool> getGroups() {
    return groups;
  }
    
  @VsoMethod
  public void setGroups(List<GslbPool> groups) {
    this.groups = groups;
  }

  
  public GslbService addHealthMonitorRefsItem(String healthMonitorRefsItem) {
    if (this.healthMonitorRefs == null) {
      this.healthMonitorRefs = new ArrayList<String>();
    }
    this.healthMonitorRefs.add(healthMonitorRefsItem);
    return this;
  }
  
  /**
   * Verify VS health by applying one or more health monitors.  Active monitors generate synthetic traffic from DNS Service Engine and to mark a VS up or down based on the response. . It is a reference to an object of type HealthMonitor.
   * @return healthMonitorRefs
  **/
  @ApiModelProperty(value = "Verify VS health by applying one or more health monitors.  Active monitors generate synthetic traffic from DNS Service Engine and to mark a VS up or down based on the response. . It is a reference to an object of type HealthMonitor.")


 
  @VsoMethod  
  public List<String> getHealthMonitorRefs() {
    return healthMonitorRefs;
  }
    
  @VsoMethod
  public void setHealthMonitorRefs(List<String> healthMonitorRefs) {
    this.healthMonitorRefs = healthMonitorRefs;
  }

  
  /**
   * Health monitor probe can be executed for all the members or it can be executed only for third-party members. This operational mode is useful to reduce the number of health monitor probes in case of a hybrid scenario. In such a case, Avi members can have controller derived status while Non-Avi members can be probed by via health monitor probes in dataplane. Enum options - GSLB_SERVICE_HEALTH_MONITOR_ALL_MEMBERS, GSLB_SERVICE_HEALTH_MONITOR_ONLY_NON_AVI_MEMBERS.
   * @return healthMonitorScope
  **/
  @ApiModelProperty(value = "Health monitor probe can be executed for all the members or it can be executed only for third-party members. This operational mode is useful to reduce the number of health monitor probes in case of a hybrid scenario. In such a case, Avi members can have controller derived status while Non-Avi members can be probed by via health monitor probes in dataplane. Enum options - GSLB_SERVICE_HEALTH_MONITOR_ALL_MEMBERS, GSLB_SERVICE_HEALTH_MONITOR_ONLY_NON_AVI_MEMBERS.")


 
  @VsoMethod  
  public String getHealthMonitorScope() {
    return healthMonitorScope;
  }
    
  @VsoMethod
  public void setHealthMonitorScope(String healthMonitorScope) {
    this.healthMonitorScope = healthMonitorScope;
  }

  
  /**
   * This field is an internal field and is used in SE. Field introduced in 18.2.2.
   * @return hmOff
  **/
  @ApiModelProperty(value = "This field is an internal field and is used in SE. Field introduced in 18.2.2.")


 
  @VsoMethod  
  public Boolean isHmOff() {
    return hmOff;
  }
    
  @VsoMethod
  public void setHmOff(Boolean hmOff) {
    this.hmOff = hmOff;
  }

  
  /**
   * This field indicates that this object is replicated across GSLB federation. Field introduced in 17.1.3.
   * @return isFederated
  **/
  @ApiModelProperty(value = "This field indicates that this object is replicated across GSLB federation. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Boolean isIsFederated() {
    return isFederated;
  }
    
  @VsoMethod
  public void setIsFederated(Boolean isFederated) {
    this.isFederated = isFederated;
  }

  
  /**
   * The minimum number of members to distribute traffic to. Allowed values are 1-65535. Special values are 0 - 'Disable'. Field introduced in 17.2.4.
   * @return minMembers
  **/
  @ApiModelProperty(value = "The minimum number of members to distribute traffic to. Allowed values are 1-65535. Special values are 0 - 'Disable'. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public Integer getMinMembers() {
    return minMembers;
  }
    
  @VsoMethod
  public void setMinMembers(Integer minMembers) {
    this.minMembers = minMembers;
  }

  
  /**
   * Name for the GSLB service.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name for the GSLB service.")
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
   * Number of IP addresses of this GSLB service to be returned by the DNS Service. Enter 0 to return all IP addresses. Allowed values are 1-20. Special values are 0- 'Return all IP addresses'.
   * @return numDnsIp
  **/
  @ApiModelProperty(value = "Number of IP addresses of this GSLB service to be returned by the DNS Service. Enter 0 to return all IP addresses. Allowed values are 1-20. Special values are 0- 'Return all IP addresses'.")


 
  @VsoMethod  
  public Integer getNumDnsIp() {
    return numDnsIp;
  }
    
  @VsoMethod
  public void setNumDnsIp(Integer numDnsIp) {
    this.numDnsIp = numDnsIp;
  }

  
  /**
   * The load balancing algorithm will pick a GSLB pool within the GSLB service list of available pools. Enum options - GSLB_SERVICE_ALGORITHM_PRIORITY, GSLB_SERVICE_ALGORITHM_GEO. Field introduced in 17.2.3.
   * @return poolAlgorithm
  **/
  @ApiModelProperty(value = "The load balancing algorithm will pick a GSLB pool within the GSLB service list of available pools. Enum options - GSLB_SERVICE_ALGORITHM_PRIORITY, GSLB_SERVICE_ALGORITHM_GEO. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getPoolAlgorithm() {
    return poolAlgorithm;
  }
    
  @VsoMethod
  public void setPoolAlgorithm(String poolAlgorithm) {
    this.poolAlgorithm = poolAlgorithm;
  }

  
  /**
   * This field indicates that for a CNAME query, respond with resolved CNAMEs in the additional section with A records. Field introduced in 18.2.5.
   * @return resolveCname
  **/
  @ApiModelProperty(value = "This field indicates that for a CNAME query, respond with resolved CNAMEs in the additional section with A records. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isResolveCname() {
    return resolveCname;
  }
    
  @VsoMethod
  public void setResolveCname(Boolean resolveCname) {
    this.resolveCname = resolveCname;
  }

  
  /**
   * Enable site-persistence for the GslbService. . Field introduced in 17.2.1.
   * @return sitePersistenceEnabled
  **/
  @ApiModelProperty(value = "Enable site-persistence for the GslbService. . Field introduced in 17.2.1.")


 
  @VsoMethod  
  public Boolean isSitePersistenceEnabled() {
    return sitePersistenceEnabled;
  }
    
  @VsoMethod
  public void setSitePersistenceEnabled(Boolean sitePersistenceEnabled) {
    this.sitePersistenceEnabled = sitePersistenceEnabled;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * TTL value (in seconds) for records served for this GSLB service by the DNS Service. Allowed values are 0-86400.
   * @return ttl
  **/
  @ApiModelProperty(value = "TTL value (in seconds) for records served for this GSLB service by the DNS Service. Allowed values are 0-86400.")


 
  @VsoMethod  
  public Integer getTtl() {
    return ttl;
  }
    
  @VsoMethod
  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Use the client ip subnet from the EDNS option as source IPaddress for client geo-location and consistent hash algorithm. Default is true. Field introduced in 17.1.1.
   * @return useEdnsClientSubnet
  **/
  @ApiModelProperty(value = "Use the client ip subnet from the EDNS option as source IPaddress for client geo-location and consistent hash algorithm. Default is true. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isUseEdnsClientSubnet() {
    return useEdnsClientSubnet;
  }
    
  @VsoMethod
  public void setUseEdnsClientSubnet(Boolean useEdnsClientSubnet) {
    this.useEdnsClientSubnet = useEdnsClientSubnet;
  }

  
  /**
   * UUID of the GSLB service.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the GSLB service.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   * Enable wild-card match of fqdn  if an exact match is not found in the DNS table, the longest match is chosen by wild-carding the fqdn in the DNS request. Default is false. Field introduced in 17.1.1.
   * @return wildcardMatch
  **/
  @ApiModelProperty(value = "Enable wild-card match of fqdn  if an exact match is not found in the DNS table, the longest match is chosen by wild-carding the fqdn in the DNS request. Default is false. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isWildcardMatch() {
    return wildcardMatch;
  }
    
  @VsoMethod
  public void setWildcardMatch(Boolean wildcardMatch) {
    this.wildcardMatch = wildcardMatch;
  }

  
  public String getObjectID() {
		return "GslbService";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GslbService gslbService = (GslbService) o;
    return Objects.equals(this.lastModified, gslbService.lastModified) &&
        Objects.equals(this.applicationPersistenceProfileRef, gslbService.applicationPersistenceProfileRef) &&
        Objects.equals(this.controllerHealthStatusEnabled, gslbService.controllerHealthStatusEnabled) &&
        Objects.equals(this.createdBy, gslbService.createdBy) &&
        Objects.equals(this.description, gslbService.description) &&
        Objects.equals(this.domainNames, gslbService.domainNames) &&
        Objects.equals(this.downResponse, gslbService.downResponse) &&
        Objects.equals(this.enabled, gslbService.enabled) &&
        Objects.equals(this.groups, gslbService.groups) &&
        Objects.equals(this.healthMonitorRefs, gslbService.healthMonitorRefs) &&
        Objects.equals(this.healthMonitorScope, gslbService.healthMonitorScope) &&
        Objects.equals(this.hmOff, gslbService.hmOff) &&
        Objects.equals(this.isFederated, gslbService.isFederated) &&
        Objects.equals(this.minMembers, gslbService.minMembers) &&
        Objects.equals(this.name, gslbService.name) &&
        Objects.equals(this.numDnsIp, gslbService.numDnsIp) &&
        Objects.equals(this.poolAlgorithm, gslbService.poolAlgorithm) &&
        Objects.equals(this.resolveCname, gslbService.resolveCname) &&
        Objects.equals(this.sitePersistenceEnabled, gslbService.sitePersistenceEnabled) &&
        Objects.equals(this.tenantRef, gslbService.tenantRef) &&
        Objects.equals(this.ttl, gslbService.ttl) &&
        Objects.equals(this.url, gslbService.url) &&
        Objects.equals(this.useEdnsClientSubnet, gslbService.useEdnsClientSubnet) &&
        Objects.equals(this.uuid, gslbService.uuid) &&
        Objects.equals(this.wildcardMatch, gslbService.wildcardMatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, applicationPersistenceProfileRef, controllerHealthStatusEnabled, createdBy, description, domainNames, downResponse, enabled, groups, healthMonitorRefs, healthMonitorScope, hmOff, isFederated, minMembers, name, numDnsIp, poolAlgorithm, resolveCname, sitePersistenceEnabled, tenantRef, ttl, url, useEdnsClientSubnet, uuid, wildcardMatch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GslbService {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    applicationPersistenceProfileRef: ").append(toIndentedString(applicationPersistenceProfileRef)).append("\n");
    sb.append("    controllerHealthStatusEnabled: ").append(toIndentedString(controllerHealthStatusEnabled)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
    sb.append("    downResponse: ").append(toIndentedString(downResponse)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    healthMonitorRefs: ").append(toIndentedString(healthMonitorRefs)).append("\n");
    sb.append("    healthMonitorScope: ").append(toIndentedString(healthMonitorScope)).append("\n");
    sb.append("    hmOff: ").append(toIndentedString(hmOff)).append("\n");
    sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
    sb.append("    minMembers: ").append(toIndentedString(minMembers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numDnsIp: ").append(toIndentedString(numDnsIp)).append("\n");
    sb.append("    poolAlgorithm: ").append(toIndentedString(poolAlgorithm)).append("\n");
    sb.append("    resolveCname: ").append(toIndentedString(resolveCname)).append("\n");
    sb.append("    sitePersistenceEnabled: ").append(toIndentedString(sitePersistenceEnabled)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    useEdnsClientSubnet: ").append(toIndentedString(useEdnsClientSubnet)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    wildcardMatch: ").append(toIndentedString(wildcardMatch)).append("\n");
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

