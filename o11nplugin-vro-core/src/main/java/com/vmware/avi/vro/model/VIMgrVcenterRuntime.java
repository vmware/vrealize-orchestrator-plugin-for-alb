package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * VIMgrVcenterRuntime
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIMgrVcenterRuntime")
@VsoFinder(name = Constants.FINDER_VRO_VIMGRVCENTERRUNTIME, idAccessor = "getObjectID()")
@Service
public class VIMgrVcenterRuntime extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("api_version")
  private String apiVersion = null;

  @JsonProperty("apic_mode")
  private Boolean apicMode = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("datacenter_refs")
  @Valid
  private List<String> datacenterRefs = null;

  @JsonProperty("disc_end_time")
  private String discEndTime = null;

  @JsonProperty("disc_start_time")
  private String discStartTime = null;

  @JsonProperty("discovered_datacenter")
  private String discoveredDatacenter = null;

  @JsonProperty("inventory_progress")
  private String inventoryProgress = null;

  @JsonProperty("inventory_state")
  private String inventoryState = null;

  @JsonProperty("management_network")
  private String managementNetwork = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("num_clusters")
  private Long numClusters = null;

  @JsonProperty("num_dcs")
  private Long numDcs = null;

  @JsonProperty("num_hosts")
  private Long numHosts = null;

  @JsonProperty("num_nws")
  private Long numNws = null;

  @JsonProperty("num_vcenter_req_pending")
  private Long numVcenterReqPending = null;

  @JsonProperty("num_vms")
  private Long numVms = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("privilege")
  private String privilege = null;

  @JsonProperty("progress")
  private Long progress = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vcenter_connected")
  private Boolean vcenterConnected = null;

  @JsonProperty("vcenter_fullname")
  private String vcenterFullname = null;

  @JsonProperty("vcenter_template_se_location")
  private String vcenterTemplateSeLocation = null;

  @JsonProperty("vcenter_url")
  private String vcenterUrl = null;

  
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
   * api_version of VIMgrVcenterRuntime.
   * @return apiVersion
  **/
  @ApiModelProperty(value = "api_version of VIMgrVcenterRuntime.")


 
  @VsoMethod  
  public String getApiVersion() {
    return apiVersion;
  }
    
  @VsoMethod
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  
  /**
   * Placeholder for description of property apic_mode of obj type VIMgrVcenterRuntime field type str  type boolean
   * @return apicMode
  **/
  @ApiModelProperty(value = "Placeholder for description of property apic_mode of obj type VIMgrVcenterRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isApicMode() {
    return apicMode;
  }
    
  @VsoMethod
  public void setApicMode(Boolean apicMode) {
    this.apicMode = apicMode;
  }

  
  /**
   *  It is a reference to an object of type Cloud.
   * @return cloudRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Cloud.")


 
  @VsoMethod  
  public String getCloudRef() {
    return cloudRef;
  }
    
  @VsoMethod
  public void setCloudRef(String cloudRef) {
    this.cloudRef = cloudRef;
  }

  
  public VIMgrVcenterRuntime addDatacenterRefsItem(String datacenterRefsItem) {
    if (this.datacenterRefs == null) {
      this.datacenterRefs = new ArrayList<String>();
    }
    this.datacenterRefs.add(datacenterRefsItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type VIMgrDCRuntime.
   * @return datacenterRefs
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VIMgrDCRuntime.")


 
  @VsoMethod  
  public List<String> getDatacenterRefs() {
    return datacenterRefs;
  }
    
  @VsoMethod
  public void setDatacenterRefs(List<String> datacenterRefs) {
    this.datacenterRefs = datacenterRefs;
  }

  
  /**
   * disc_end_time of VIMgrVcenterRuntime.
   * @return discEndTime
  **/
  @ApiModelProperty(value = "disc_end_time of VIMgrVcenterRuntime.")


 
  @VsoMethod  
  public String getDiscEndTime() {
    return discEndTime;
  }
    
  @VsoMethod
  public void setDiscEndTime(String discEndTime) {
    this.discEndTime = discEndTime;
  }

  
  /**
   * disc_start_time of VIMgrVcenterRuntime.
   * @return discStartTime
  **/
  @ApiModelProperty(value = "disc_start_time of VIMgrVcenterRuntime.")


 
  @VsoMethod  
  public String getDiscStartTime() {
    return discStartTime;
  }
    
  @VsoMethod
  public void setDiscStartTime(String discStartTime) {
    this.discStartTime = discStartTime;
  }

  
  /**
   * discovered_datacenter of VIMgrVcenterRuntime.
   * @return discoveredDatacenter
  **/
  @ApiModelProperty(value = "discovered_datacenter of VIMgrVcenterRuntime.")


 
  @VsoMethod  
  public String getDiscoveredDatacenter() {
    return discoveredDatacenter;
  }
    
  @VsoMethod
  public void setDiscoveredDatacenter(String discoveredDatacenter) {
    this.discoveredDatacenter = discoveredDatacenter;
  }

  
  /**
   * inventory_progress of VIMgrVcenterRuntime.
   * @return inventoryProgress
  **/
  @ApiModelProperty(value = "inventory_progress of VIMgrVcenterRuntime.")


 
  @VsoMethod  
  public String getInventoryProgress() {
    return inventoryProgress;
  }
    
  @VsoMethod
  public void setInventoryProgress(String inventoryProgress) {
    this.inventoryProgress = inventoryProgress;
  }

  
  /**
   *  Enum options - VCENTER_DISCOVERY_BAD_CREDENTIALS, VCENTER_DISCOVERY_RETRIEVING_DC, VCENTER_DISCOVERY_WAITING_DC, VCENTER_DISCOVERY_RETRIEVING_NW, VCENTER_DISCOVERY_ONGOING, VCENTER_DISCOVERY_RESYNCING, VCENTER_DISCOVERY_COMPLETE, VCENTER_DISCOVERY_DELETING_VCENTER, VCENTER_DISCOVERY_FAILURE, VCENTER_DISCOVERY_COMPLETE_NO_MGMT_NW, VCENTER_DISCOVERY_COMPLETE_PER_TENANT_IP_ROUTE, VCENTER_DISCOVERY_MAKING_SE_OVA, VCENTER_DISCOVERY_RESYNC_FAILED, VCENTER_DISCOVERY_OBJECT_LIMIT_REACHED.
   * @return inventoryState
  **/
  @ApiModelProperty(value = " Enum options - VCENTER_DISCOVERY_BAD_CREDENTIALS, VCENTER_DISCOVERY_RETRIEVING_DC, VCENTER_DISCOVERY_WAITING_DC, VCENTER_DISCOVERY_RETRIEVING_NW, VCENTER_DISCOVERY_ONGOING, VCENTER_DISCOVERY_RESYNCING, VCENTER_DISCOVERY_COMPLETE, VCENTER_DISCOVERY_DELETING_VCENTER, VCENTER_DISCOVERY_FAILURE, VCENTER_DISCOVERY_COMPLETE_NO_MGMT_NW, VCENTER_DISCOVERY_COMPLETE_PER_TENANT_IP_ROUTE, VCENTER_DISCOVERY_MAKING_SE_OVA, VCENTER_DISCOVERY_RESYNC_FAILED, VCENTER_DISCOVERY_OBJECT_LIMIT_REACHED.")


 
  @VsoMethod  
  public String getInventoryState() {
    return inventoryState;
  }
    
  @VsoMethod
  public void setInventoryState(String inventoryState) {
    this.inventoryState = inventoryState;
  }

  
  /**
   * management_network of VIMgrVcenterRuntime.
   * @return managementNetwork
  **/
  @ApiModelProperty(value = "management_network of VIMgrVcenterRuntime.")


 
  @VsoMethod  
  public String getManagementNetwork() {
    return managementNetwork;
  }
    
  @VsoMethod
  public void setManagementNetwork(String managementNetwork) {
    this.managementNetwork = managementNetwork;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
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
   * Number of num_clusters.
   * @return numClusters
  **/
  @ApiModelProperty(value = "Number of num_clusters.")


 
  @VsoMethod  
  public Long getNumClusters() {
    return numClusters;
  }
    
  @VsoMethod
  public void setNumClusters(Long numClusters) {
    this.numClusters = numClusters;
  }

  
  /**
   * Number of num_dcs.
   * @return numDcs
  **/
  @ApiModelProperty(value = "Number of num_dcs.")


 
  @VsoMethod  
  public Long getNumDcs() {
    return numDcs;
  }
    
  @VsoMethod
  public void setNumDcs(Long numDcs) {
    this.numDcs = numDcs;
  }

  
  /**
   * Number of num_hosts.
   * @return numHosts
  **/
  @ApiModelProperty(value = "Number of num_hosts.")


 
  @VsoMethod  
  public Long getNumHosts() {
    return numHosts;
  }
    
  @VsoMethod
  public void setNumHosts(Long numHosts) {
    this.numHosts = numHosts;
  }

  
  /**
   * Number of num_nws.
   * @return numNws
  **/
  @ApiModelProperty(value = "Number of num_nws.")


 
  @VsoMethod  
  public Long getNumNws() {
    return numNws;
  }
    
  @VsoMethod
  public void setNumNws(Long numNws) {
    this.numNws = numNws;
  }

  
  /**
   * Number of num_vcenter_req_pending.
   * @return numVcenterReqPending
  **/
  @ApiModelProperty(value = "Number of num_vcenter_req_pending.")


 
  @VsoMethod  
  public Long getNumVcenterReqPending() {
    return numVcenterReqPending;
  }
    
  @VsoMethod
  public void setNumVcenterReqPending(Long numVcenterReqPending) {
    this.numVcenterReqPending = numVcenterReqPending;
  }

  
  /**
   * Number of num_vms.
   * @return numVms
  **/
  @ApiModelProperty(value = "Number of num_vms.")


 
  @VsoMethod  
  public Long getNumVms() {
    return numVms;
  }
    
  @VsoMethod
  public void setNumVms(Long numVms) {
    this.numVms = numVms;
  }

  
  /**
   * password of VIMgrVcenterRuntime.
   * @return password
  **/
  @ApiModelProperty(required = true, value = "password of VIMgrVcenterRuntime.")
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
   *  Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
   * @return privilege
  **/
  @ApiModelProperty(value = " Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.")


 
  @VsoMethod  
  public String getPrivilege() {
    return privilege;
  }
    
  @VsoMethod
  public void setPrivilege(String privilege) {
    this.privilege = privilege;
  }

  
  /**
   * Number of progress.
   * @return progress
  **/
  @ApiModelProperty(value = "Number of progress.")


 
  @VsoMethod  
  public Long getProgress() {
    return progress;
  }
    
  @VsoMethod
  public void setProgress(Long progress) {
    this.progress = progress;
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
   *  Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP, CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP.
   * @return type
  **/
  @ApiModelProperty(required = true, value = " Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP, CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
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
   * username of VIMgrVcenterRuntime.
   * @return username
  **/
  @ApiModelProperty(required = true, value = "username of VIMgrVcenterRuntime.")
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
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   * Placeholder for description of property vcenter_connected of obj type VIMgrVcenterRuntime field type str  type boolean
   * @return vcenterConnected
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_connected of obj type VIMgrVcenterRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isVcenterConnected() {
    return vcenterConnected;
  }
    
  @VsoMethod
  public void setVcenterConnected(Boolean vcenterConnected) {
    this.vcenterConnected = vcenterConnected;
  }

  
  /**
   * vcenter_fullname of VIMgrVcenterRuntime.
   * @return vcenterFullname
  **/
  @ApiModelProperty(value = "vcenter_fullname of VIMgrVcenterRuntime.")


 
  @VsoMethod  
  public String getVcenterFullname() {
    return vcenterFullname;
  }
    
  @VsoMethod
  public void setVcenterFullname(String vcenterFullname) {
    this.vcenterFullname = vcenterFullname;
  }

  
  /**
   * vcenter_template_se_location of VIMgrVcenterRuntime.
   * @return vcenterTemplateSeLocation
  **/
  @ApiModelProperty(value = "vcenter_template_se_location of VIMgrVcenterRuntime.")


 
  @VsoMethod  
  public String getVcenterTemplateSeLocation() {
    return vcenterTemplateSeLocation;
  }
    
  @VsoMethod
  public void setVcenterTemplateSeLocation(String vcenterTemplateSeLocation) {
    this.vcenterTemplateSeLocation = vcenterTemplateSeLocation;
  }

  
  /**
   * vcenter_url of VIMgrVcenterRuntime.
   * @return vcenterUrl
  **/
  @ApiModelProperty(required = true, value = "vcenter_url of VIMgrVcenterRuntime.")
  @NotNull


 
  @VsoMethod  
  public String getVcenterUrl() {
    return vcenterUrl;
  }
    
  @VsoMethod
  public void setVcenterUrl(String vcenterUrl) {
    this.vcenterUrl = vcenterUrl;
  }

  
  public String getObjectID() {
		return "VIMgrVcenterRuntime";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIMgrVcenterRuntime viMgrVcenterRuntime = (VIMgrVcenterRuntime) o;
    return Objects.equals(this.lastModified, viMgrVcenterRuntime.lastModified) &&
        Objects.equals(this.apiVersion, viMgrVcenterRuntime.apiVersion) &&
        Objects.equals(this.apicMode, viMgrVcenterRuntime.apicMode) &&
        Objects.equals(this.cloudRef, viMgrVcenterRuntime.cloudRef) &&
        Objects.equals(this.datacenterRefs, viMgrVcenterRuntime.datacenterRefs) &&
        Objects.equals(this.discEndTime, viMgrVcenterRuntime.discEndTime) &&
        Objects.equals(this.discStartTime, viMgrVcenterRuntime.discStartTime) &&
        Objects.equals(this.discoveredDatacenter, viMgrVcenterRuntime.discoveredDatacenter) &&
        Objects.equals(this.inventoryProgress, viMgrVcenterRuntime.inventoryProgress) &&
        Objects.equals(this.inventoryState, viMgrVcenterRuntime.inventoryState) &&
        Objects.equals(this.managementNetwork, viMgrVcenterRuntime.managementNetwork) &&
        Objects.equals(this.name, viMgrVcenterRuntime.name) &&
        Objects.equals(this.numClusters, viMgrVcenterRuntime.numClusters) &&
        Objects.equals(this.numDcs, viMgrVcenterRuntime.numDcs) &&
        Objects.equals(this.numHosts, viMgrVcenterRuntime.numHosts) &&
        Objects.equals(this.numNws, viMgrVcenterRuntime.numNws) &&
        Objects.equals(this.numVcenterReqPending, viMgrVcenterRuntime.numVcenterReqPending) &&
        Objects.equals(this.numVms, viMgrVcenterRuntime.numVms) &&
        Objects.equals(this.password, viMgrVcenterRuntime.password) &&
        Objects.equals(this.privilege, viMgrVcenterRuntime.privilege) &&
        Objects.equals(this.progress, viMgrVcenterRuntime.progress) &&
        Objects.equals(this.tenantRef, viMgrVcenterRuntime.tenantRef) &&
        Objects.equals(this.type, viMgrVcenterRuntime.type) &&
        Objects.equals(this.url, viMgrVcenterRuntime.url) &&
        Objects.equals(this.username, viMgrVcenterRuntime.username) &&
        Objects.equals(this.uuid, viMgrVcenterRuntime.uuid) &&
        Objects.equals(this.vcenterConnected, viMgrVcenterRuntime.vcenterConnected) &&
        Objects.equals(this.vcenterFullname, viMgrVcenterRuntime.vcenterFullname) &&
        Objects.equals(this.vcenterTemplateSeLocation, viMgrVcenterRuntime.vcenterTemplateSeLocation) &&
        Objects.equals(this.vcenterUrl, viMgrVcenterRuntime.vcenterUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, apiVersion, apicMode, cloudRef, datacenterRefs, discEndTime, discStartTime, discoveredDatacenter, inventoryProgress, inventoryState, managementNetwork, name, numClusters, numDcs, numHosts, numNws, numVcenterReqPending, numVms, password, privilege, progress, tenantRef, type, url, username, uuid, vcenterConnected, vcenterFullname, vcenterTemplateSeLocation, vcenterUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIMgrVcenterRuntime {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    apicMode: ").append(toIndentedString(apicMode)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    datacenterRefs: ").append(toIndentedString(datacenterRefs)).append("\n");
    sb.append("    discEndTime: ").append(toIndentedString(discEndTime)).append("\n");
    sb.append("    discStartTime: ").append(toIndentedString(discStartTime)).append("\n");
    sb.append("    discoveredDatacenter: ").append(toIndentedString(discoveredDatacenter)).append("\n");
    sb.append("    inventoryProgress: ").append(toIndentedString(inventoryProgress)).append("\n");
    sb.append("    inventoryState: ").append(toIndentedString(inventoryState)).append("\n");
    sb.append("    managementNetwork: ").append(toIndentedString(managementNetwork)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numClusters: ").append(toIndentedString(numClusters)).append("\n");
    sb.append("    numDcs: ").append(toIndentedString(numDcs)).append("\n");
    sb.append("    numHosts: ").append(toIndentedString(numHosts)).append("\n");
    sb.append("    numNws: ").append(toIndentedString(numNws)).append("\n");
    sb.append("    numVcenterReqPending: ").append(toIndentedString(numVcenterReqPending)).append("\n");
    sb.append("    numVms: ").append(toIndentedString(numVms)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vcenterConnected: ").append(toIndentedString(vcenterConnected)).append("\n");
    sb.append("    vcenterFullname: ").append(toIndentedString(vcenterFullname)).append("\n");
    sb.append("    vcenterTemplateSeLocation: ").append(toIndentedString(vcenterTemplateSeLocation)).append("\n");
    sb.append("    vcenterUrl: ").append(toIndentedString(vcenterUrl)).append("\n");
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

