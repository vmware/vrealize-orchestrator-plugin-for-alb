package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DNSConfig;
import com.vmware.avi.vro.model.GslbClientIpAddrGroup;
import com.vmware.avi.vro.model.GslbSite;
import com.vmware.avi.vro.model.GslbThirdPartySite;
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
 * Gslb
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "Gslb")
@VsoFinder(name = Constants.FINDER_VRO_GSLB, idAccessor = "getObjectID()")
@Service
public class Gslb extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("async_interval")
  private Integer asyncInterval = null;

  @JsonProperty("clear_on_max_retries")
  private Integer clearOnMaxRetries = 20;

  @JsonProperty("client_ip_addr_group")
  private GslbClientIpAddrGroup clientIpAddrGroup = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("dns_configs")
  @Valid
  private List<DNSConfig> dnsConfigs = null;

  @JsonProperty("error_resync_interval")
  private Integer errorResyncInterval = 300;

  @JsonProperty("is_federated")
  private Boolean isFederated = true;

  @JsonProperty("leader_cluster_uuid")
  private String leaderClusterUuid = null;

  @JsonProperty("maintenance_mode")
  private Boolean maintenanceMode = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("send_interval")
  private Integer sendInterval = 15;

  @JsonProperty("send_interval_prior_to_maintenance_mode")
  private Integer sendIntervalPriorToMaintenanceMode = null;

  @JsonProperty("sites")
  @Valid
  private List<GslbSite> sites = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("third_party_sites")
  @Valid
  private List<GslbThirdPartySite> thirdPartySites = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("view_id")
  private Long viewId = null;

  
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
   * Frequency with which messages are propagated to Vs Mgr. Value of 0 disables async behavior and RPC are sent inline. Allowed values are 0-5. Field introduced in 18.2.3.
   * @return asyncInterval
  **/
  @ApiModelProperty(value = "Frequency with which messages are propagated to Vs Mgr. Value of 0 disables async behavior and RPC are sent inline. Allowed values are 0-5. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getAsyncInterval() {
    return asyncInterval;
  }
    
  @VsoMethod
  public void setAsyncInterval(Integer asyncInterval) {
    this.asyncInterval = asyncInterval;
  }

  
  /**
   * Max retries after which the remote site is treated as a fresh start. In fresh start all the configs are downloaded. Allowed values are 1-1024.
   * @return clearOnMaxRetries
  **/
  @ApiModelProperty(value = "Max retries after which the remote site is treated as a fresh start. In fresh start all the configs are downloaded. Allowed values are 1-1024.")


 
  @VsoMethod  
  public Integer getClearOnMaxRetries() {
    return clearOnMaxRetries;
  }
    
  @VsoMethod
  public void setClearOnMaxRetries(Integer clearOnMaxRetries) {
    this.clearOnMaxRetries = clearOnMaxRetries;
  }

  
  /**
   * Group to specify if the client ip addresses are public or private. Field introduced in 17.1.2.
   * @return clientIpAddrGroup
  **/
  @ApiModelProperty(value = "Group to specify if the client ip addresses are public or private. Field introduced in 17.1.2.")

  @Valid

 
  @VsoMethod  
  public GslbClientIpAddrGroup getClientIpAddrGroup() {
    return clientIpAddrGroup;
  }
    
  @VsoMethod
  public void setClientIpAddrGroup(GslbClientIpAddrGroup clientIpAddrGroup) {
    this.clientIpAddrGroup = clientIpAddrGroup;
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

  
  public Gslb addDnsConfigsItem(DNSConfig dnsConfigsItem) {
    if (this.dnsConfigs == null) {
      this.dnsConfigs = new ArrayList<DNSConfig>();
    }
    this.dnsConfigs.add(dnsConfigsItem);
    return this;
  }
  
  /**
   * Sub domain configuration for the GSLB.  GSLB service's FQDN must be a match one of these subdomains. .
   * @return dnsConfigs
  **/
  @ApiModelProperty(value = "Sub domain configuration for the GSLB.  GSLB service's FQDN must be a match one of these subdomains. .")

  @Valid

 
  @VsoMethod  
  public List<DNSConfig> getDnsConfigs() {
    return dnsConfigs;
  }
    
  @VsoMethod
  public void setDnsConfigs(List<DNSConfig> dnsConfigs) {
    this.dnsConfigs = dnsConfigs;
  }

  
  /**
   * Frequency with which errored messages are resynced to follower sites. Value of 0 disables resync behavior. Allowed values are 60-3600. Special values are 0 - 'Disable'. Field introduced in 18.2.3.
   * @return errorResyncInterval
  **/
  @ApiModelProperty(value = "Frequency with which errored messages are resynced to follower sites. Value of 0 disables resync behavior. Allowed values are 60-3600. Special values are 0 - 'Disable'. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getErrorResyncInterval() {
    return errorResyncInterval;
  }
    
  @VsoMethod
  public void setErrorResyncInterval(Integer errorResyncInterval) {
    this.errorResyncInterval = errorResyncInterval;
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
   * Mark this Site as leader of GSLB configuration. This site is the one among the Avi sites.
   * @return leaderClusterUuid
  **/
  @ApiModelProperty(required = true, value = "Mark this Site as leader of GSLB configuration. This site is the one among the Avi sites.")
  @NotNull


 
  @VsoMethod  
  public String getLeaderClusterUuid() {
    return leaderClusterUuid;
  }
    
  @VsoMethod
  public void setLeaderClusterUuid(String leaderClusterUuid) {
    this.leaderClusterUuid = leaderClusterUuid;
  }

  
  /**
   * This field disables the configuration operations on the leader for all federated objects.  CUD operations on Gslb, GslbService, GslbGeoDbProfile and other federated objects will be rejected. The rest-api disabling helps in upgrade scenarios where we don't want configuration sync operations to the Gslb member when the member is being upgraded.  This configuration programmatically blocks the leader from accepting new Gslb configuration when member sites are undergoing upgrade. . Field introduced in 17.2.1.
   * @return maintenanceMode
  **/
  @ApiModelProperty(value = "This field disables the configuration operations on the leader for all federated objects.  CUD operations on Gslb, GslbService, GslbGeoDbProfile and other federated objects will be rejected. The rest-api disabling helps in upgrade scenarios where we don't want configuration sync operations to the Gslb member when the member is being upgraded.  This configuration programmatically blocks the leader from accepting new Gslb configuration when member sites are undergoing upgrade. . Field introduced in 17.2.1.")


 
  @VsoMethod  
  public Boolean isMaintenanceMode() {
    return maintenanceMode;
  }
    
  @VsoMethod
  public void setMaintenanceMode(Boolean maintenanceMode) {
    this.maintenanceMode = maintenanceMode;
  }

  
  /**
   * Name for the GSLB object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name for the GSLB object.")
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
   * Frequency with which group members communicate. Allowed values are 1-3600.
   * @return sendInterval
  **/
  @ApiModelProperty(value = "Frequency with which group members communicate. Allowed values are 1-3600.")


 
  @VsoMethod  
  public Integer getSendInterval() {
    return sendInterval;
  }
    
  @VsoMethod
  public void setSendInterval(Integer sendInterval) {
    this.sendInterval = sendInterval;
  }

  
  /**
   * The user can specify a send-interval while entering maintenance mode. The validity of this 'maintenance send-interval' is only during maintenance mode. When the user leaves maintenance mode, the original send-interval is reinstated. This internal variable is used to store the original send-interval. . Field introduced in 18.2.3.
   * @return sendIntervalPriorToMaintenanceMode
  **/
  @ApiModelProperty(value = "The user can specify a send-interval while entering maintenance mode. The validity of this 'maintenance send-interval' is only during maintenance mode. When the user leaves maintenance mode, the original send-interval is reinstated. This internal variable is used to store the original send-interval. . Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getSendIntervalPriorToMaintenanceMode() {
    return sendIntervalPriorToMaintenanceMode;
  }
    
  @VsoMethod
  public void setSendIntervalPriorToMaintenanceMode(Integer sendIntervalPriorToMaintenanceMode) {
    this.sendIntervalPriorToMaintenanceMode = sendIntervalPriorToMaintenanceMode;
  }

  
  public Gslb addSitesItem(GslbSite sitesItem) {
    if (this.sites == null) {
      this.sites = new ArrayList<GslbSite>();
    }
    this.sites.add(sitesItem);
    return this;
  }
  
  /**
   * Select Avi site member belonging to this Gslb.
   * @return sites
  **/
  @ApiModelProperty(value = "Select Avi site member belonging to this Gslb.")

  @Valid

 
  @VsoMethod  
  public List<GslbSite> getSites() {
    return sites;
  }
    
  @VsoMethod
  public void setSites(List<GslbSite> sites) {
    this.sites = sites;
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

  
  public Gslb addThirdPartySitesItem(GslbThirdPartySite thirdPartySitesItem) {
    if (this.thirdPartySites == null) {
      this.thirdPartySites = new ArrayList<GslbThirdPartySite>();
    }
    this.thirdPartySites.add(thirdPartySitesItem);
    return this;
  }
  
  /**
   * Third party site member belonging to this Gslb. Field introduced in 17.1.1.
   * @return thirdPartySites
  **/
  @ApiModelProperty(value = "Third party site member belonging to this Gslb. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<GslbThirdPartySite> getThirdPartySites() {
    return thirdPartySites;
  }
    
  @VsoMethod
  public void setThirdPartySites(List<GslbThirdPartySite> thirdPartySites) {
    this.thirdPartySites = thirdPartySites;
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
   * UUID of the GSLB object.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the GSLB object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   * The view-id is used in change-leader mode to differentiate partitioned groups while they have the same GSLB namespace. Each partitioned group will be able to operate independently by using the view-id.
   * @return viewId
  **/
  @ApiModelProperty(value = "The view-id is used in change-leader mode to differentiate partitioned groups while they have the same GSLB namespace. Each partitioned group will be able to operate independently by using the view-id.")


 
  @VsoMethod  
  public Long getViewId() {
    return viewId;
  }
    
  @VsoMethod
  public void setViewId(Long viewId) {
    this.viewId = viewId;
  }

  
  public String getObjectID() {
		return "Gslb";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gslb gslb = (Gslb) o;
    return Objects.equals(this.lastModified, gslb.lastModified) &&
        Objects.equals(this.asyncInterval, gslb.asyncInterval) &&
        Objects.equals(this.clearOnMaxRetries, gslb.clearOnMaxRetries) &&
        Objects.equals(this.clientIpAddrGroup, gslb.clientIpAddrGroup) &&
        Objects.equals(this.description, gslb.description) &&
        Objects.equals(this.dnsConfigs, gslb.dnsConfigs) &&
        Objects.equals(this.errorResyncInterval, gslb.errorResyncInterval) &&
        Objects.equals(this.isFederated, gslb.isFederated) &&
        Objects.equals(this.leaderClusterUuid, gslb.leaderClusterUuid) &&
        Objects.equals(this.maintenanceMode, gslb.maintenanceMode) &&
        Objects.equals(this.name, gslb.name) &&
        Objects.equals(this.sendInterval, gslb.sendInterval) &&
        Objects.equals(this.sendIntervalPriorToMaintenanceMode, gslb.sendIntervalPriorToMaintenanceMode) &&
        Objects.equals(this.sites, gslb.sites) &&
        Objects.equals(this.tenantRef, gslb.tenantRef) &&
        Objects.equals(this.thirdPartySites, gslb.thirdPartySites) &&
        Objects.equals(this.url, gslb.url) &&
        Objects.equals(this.uuid, gslb.uuid) &&
        Objects.equals(this.viewId, gslb.viewId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, asyncInterval, clearOnMaxRetries, clientIpAddrGroup, description, dnsConfigs, errorResyncInterval, isFederated, leaderClusterUuid, maintenanceMode, name, sendInterval, sendIntervalPriorToMaintenanceMode, sites, tenantRef, thirdPartySites, url, uuid, viewId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gslb {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    asyncInterval: ").append(toIndentedString(asyncInterval)).append("\n");
    sb.append("    clearOnMaxRetries: ").append(toIndentedString(clearOnMaxRetries)).append("\n");
    sb.append("    clientIpAddrGroup: ").append(toIndentedString(clientIpAddrGroup)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dnsConfigs: ").append(toIndentedString(dnsConfigs)).append("\n");
    sb.append("    errorResyncInterval: ").append(toIndentedString(errorResyncInterval)).append("\n");
    sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
    sb.append("    leaderClusterUuid: ").append(toIndentedString(leaderClusterUuid)).append("\n");
    sb.append("    maintenanceMode: ").append(toIndentedString(maintenanceMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sendInterval: ").append(toIndentedString(sendInterval)).append("\n");
    sb.append("    sendIntervalPriorToMaintenanceMode: ").append(toIndentedString(sendIntervalPriorToMaintenanceMode)).append("\n");
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    thirdPartySites: ").append(toIndentedString(thirdPartySites)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    viewId: ").append(toIndentedString(viewId)).append("\n");
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

