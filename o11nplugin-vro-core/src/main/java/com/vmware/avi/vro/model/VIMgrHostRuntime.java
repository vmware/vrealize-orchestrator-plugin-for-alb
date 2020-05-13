package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CdpLldpInfo;
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
 * VIMgrHostRuntime
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIMgrHostRuntime")
@VsoFinder(name = Constants.FINDER_VRO_VIMGRHOSTRUNTIME, idAccessor = "getObjectID()")
@Service
public class VIMgrHostRuntime extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("cluster_name")
  private String clusterName = null;

  @JsonProperty("cluster_uuid")
  private String clusterUuid = null;

  @JsonProperty("cntlr_accessible")
  private Boolean cntlrAccessible = true;

  @JsonProperty("connection_state")
  private String connectionState = "connected";

  @JsonProperty("cpu_hz")
  private Long cpuHz = null;

  @JsonProperty("maintenance_mode")
  private Boolean maintenanceMode = null;

  @JsonProperty("managed_object_id")
  private String managedObjectId = null;

  @JsonProperty("mem")
  private Long mem = null;

  @JsonProperty("mgmt_portgroup")
  private String mgmtPortgroup = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("network_uuids")
  @Valid
  private List<String> networkUuids = null;

  @JsonProperty("num_cpu_cores")
  private Integer numCpuCores = null;

  @JsonProperty("num_cpu_packages")
  private Integer numCpuPackages = null;

  @JsonProperty("num_cpu_threads")
  private Integer numCpuThreads = null;

  @JsonProperty("pnics")
  @Valid
  private List<CdpLldpInfo> pnics = null;

  @JsonProperty("powerstate")
  private String powerstate = null;

  @JsonProperty("quarantine_start_ts")
  private String quarantineStartTs = null;

  @JsonProperty("quarantined")
  private Boolean quarantined = null;

  @JsonProperty("quarantined_periods")
  private Integer quarantinedPeriods = 1;

  @JsonProperty("se_fail_cnt")
  private Integer seFailCnt = null;

  @JsonProperty("se_success_cnt")
  private Integer seSuccessCnt = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vm_refs")
  @Valid
  private List<String> vmRefs = null;

  
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

  
  /**
   * cluster_name of VIMgrHostRuntime.
   * @return clusterName
  **/
  @ApiModelProperty(value = "cluster_name of VIMgrHostRuntime.")


 
  @VsoMethod  
  public String getClusterName() {
    return clusterName;
  }
    
  @VsoMethod
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  
  /**
   * Unique object identifier of cluster.
   * @return clusterUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of cluster.")


 
  @VsoMethod  
  public String getClusterUuid() {
    return clusterUuid;
  }
    
  @VsoMethod
  public void setClusterUuid(String clusterUuid) {
    this.clusterUuid = clusterUuid;
  }

  
  /**
   * Placeholder for description of property cntlr_accessible of obj type VIMgrHostRuntime field type str  type boolean
   * @return cntlrAccessible
  **/
  @ApiModelProperty(value = "Placeholder for description of property cntlr_accessible of obj type VIMgrHostRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isCntlrAccessible() {
    return cntlrAccessible;
  }
    
  @VsoMethod
  public void setCntlrAccessible(Boolean cntlrAccessible) {
    this.cntlrAccessible = cntlrAccessible;
  }

  
  /**
   * connection_state of VIMgrHostRuntime.
   * @return connectionState
  **/
  @ApiModelProperty(value = "connection_state of VIMgrHostRuntime.")


 
  @VsoMethod  
  public String getConnectionState() {
    return connectionState;
  }
    
  @VsoMethod
  public void setConnectionState(String connectionState) {
    this.connectionState = connectionState;
  }

  
  /**
   * Number of cpu_hz.
   * @return cpuHz
  **/
  @ApiModelProperty(value = "Number of cpu_hz.")


 
  @VsoMethod  
  public Long getCpuHz() {
    return cpuHz;
  }
    
  @VsoMethod
  public void setCpuHz(Long cpuHz) {
    this.cpuHz = cpuHz;
  }

  
  /**
   * Placeholder for description of property maintenance_mode of obj type VIMgrHostRuntime field type str  type boolean
   * @return maintenanceMode
  **/
  @ApiModelProperty(value = "Placeholder for description of property maintenance_mode of obj type VIMgrHostRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isMaintenanceMode() {
    return maintenanceMode;
  }
    
  @VsoMethod
  public void setMaintenanceMode(Boolean maintenanceMode) {
    this.maintenanceMode = maintenanceMode;
  }

  
  /**
   * managed_object_id of VIMgrHostRuntime.
   * @return managedObjectId
  **/
  @ApiModelProperty(required = true, value = "managed_object_id of VIMgrHostRuntime.")
  @NotNull


 
  @VsoMethod  
  public String getManagedObjectId() {
    return managedObjectId;
  }
    
  @VsoMethod
  public void setManagedObjectId(String managedObjectId) {
    this.managedObjectId = managedObjectId;
  }

  
  /**
   * Number of mem.
   * @return mem
  **/
  @ApiModelProperty(value = "Number of mem.")


 
  @VsoMethod  
  public Long getMem() {
    return mem;
  }
    
  @VsoMethod
  public void setMem(Long mem) {
    this.mem = mem;
  }

  
  /**
   * mgmt_portgroup of VIMgrHostRuntime.
   * @return mgmtPortgroup
  **/
  @ApiModelProperty(value = "mgmt_portgroup of VIMgrHostRuntime.")


 
  @VsoMethod  
  public String getMgmtPortgroup() {
    return mgmtPortgroup;
  }
    
  @VsoMethod
  public void setMgmtPortgroup(String mgmtPortgroup) {
    this.mgmtPortgroup = mgmtPortgroup;
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

  
  public VIMgrHostRuntime addNetworkUuidsItem(String networkUuidsItem) {
    if (this.networkUuids == null) {
      this.networkUuids = new ArrayList<String>();
    }
    this.networkUuids.add(networkUuidsItem);
    return this;
  }
  
  /**
   * Unique object identifiers of networks.
   * @return networkUuids
  **/
  @ApiModelProperty(value = "Unique object identifiers of networks.")


 
  @VsoMethod  
  public List<String> getNetworkUuids() {
    return networkUuids;
  }
    
  @VsoMethod
  public void setNetworkUuids(List<String> networkUuids) {
    this.networkUuids = networkUuids;
  }

  
  /**
   * Number of num_cpu_cores.
   * @return numCpuCores
  **/
  @ApiModelProperty(value = "Number of num_cpu_cores.")


 
  @VsoMethod  
  public Integer getNumCpuCores() {
    return numCpuCores;
  }
    
  @VsoMethod
  public void setNumCpuCores(Integer numCpuCores) {
    this.numCpuCores = numCpuCores;
  }

  
  /**
   * Number of num_cpu_packages.
   * @return numCpuPackages
  **/
  @ApiModelProperty(value = "Number of num_cpu_packages.")


 
  @VsoMethod  
  public Integer getNumCpuPackages() {
    return numCpuPackages;
  }
    
  @VsoMethod
  public void setNumCpuPackages(Integer numCpuPackages) {
    this.numCpuPackages = numCpuPackages;
  }

  
  /**
   * Number of num_cpu_threads.
   * @return numCpuThreads
  **/
  @ApiModelProperty(value = "Number of num_cpu_threads.")


 
  @VsoMethod  
  public Integer getNumCpuThreads() {
    return numCpuThreads;
  }
    
  @VsoMethod
  public void setNumCpuThreads(Integer numCpuThreads) {
    this.numCpuThreads = numCpuThreads;
  }

  
  public VIMgrHostRuntime addPnicsItem(CdpLldpInfo pnicsItem) {
    if (this.pnics == null) {
      this.pnics = new ArrayList<CdpLldpInfo>();
    }
    this.pnics.add(pnicsItem);
    return this;
  }
  
  /**
   * Placeholder for description of property pnics of obj type VIMgrHostRuntime field type str  type object
   * @return pnics
  **/
  @ApiModelProperty(value = "Placeholder for description of property pnics of obj type VIMgrHostRuntime field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<CdpLldpInfo> getPnics() {
    return pnics;
  }
    
  @VsoMethod
  public void setPnics(List<CdpLldpInfo> pnics) {
    this.pnics = pnics;
  }

  
  /**
   * powerstate of VIMgrHostRuntime.
   * @return powerstate
  **/
  @ApiModelProperty(value = "powerstate of VIMgrHostRuntime.")


 
  @VsoMethod  
  public String getPowerstate() {
    return powerstate;
  }
    
  @VsoMethod
  public void setPowerstate(String powerstate) {
    this.powerstate = powerstate;
  }

  
  /**
   * quarantine_start_ts of VIMgrHostRuntime.
   * @return quarantineStartTs
  **/
  @ApiModelProperty(value = "quarantine_start_ts of VIMgrHostRuntime.")


 
  @VsoMethod  
  public String getQuarantineStartTs() {
    return quarantineStartTs;
  }
    
  @VsoMethod
  public void setQuarantineStartTs(String quarantineStartTs) {
    this.quarantineStartTs = quarantineStartTs;
  }

  
  /**
   * Placeholder for description of property quarantined of obj type VIMgrHostRuntime field type str  type boolean
   * @return quarantined
  **/
  @ApiModelProperty(value = "Placeholder for description of property quarantined of obj type VIMgrHostRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isQuarantined() {
    return quarantined;
  }
    
  @VsoMethod
  public void setQuarantined(Boolean quarantined) {
    this.quarantined = quarantined;
  }

  
  /**
   * Number of quarantined_periods.
   * @return quarantinedPeriods
  **/
  @ApiModelProperty(value = "Number of quarantined_periods.")


 
  @VsoMethod  
  public Integer getQuarantinedPeriods() {
    return quarantinedPeriods;
  }
    
  @VsoMethod
  public void setQuarantinedPeriods(Integer quarantinedPeriods) {
    this.quarantinedPeriods = quarantinedPeriods;
  }

  
  /**
   * Number of se_fail_cnt.
   * @return seFailCnt
  **/
  @ApiModelProperty(value = "Number of se_fail_cnt.")


 
  @VsoMethod  
  public Integer getSeFailCnt() {
    return seFailCnt;
  }
    
  @VsoMethod
  public void setSeFailCnt(Integer seFailCnt) {
    this.seFailCnt = seFailCnt;
  }

  
  /**
   * Number of se_success_cnt.
   * @return seSuccessCnt
  **/
  @ApiModelProperty(value = "Number of se_success_cnt.")


 
  @VsoMethod  
  public Integer getSeSuccessCnt() {
    return seSuccessCnt;
  }
    
  @VsoMethod
  public void setSeSuccessCnt(Integer seSuccessCnt) {
    this.seSuccessCnt = seSuccessCnt;
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

  
  public VIMgrHostRuntime addVmRefsItem(String vmRefsItem) {
    if (this.vmRefs == null) {
      this.vmRefs = new ArrayList<String>();
    }
    this.vmRefs.add(vmRefsItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type VIMgrVMRuntime.
   * @return vmRefs
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VIMgrVMRuntime.")


 
  @VsoMethod  
  public List<String> getVmRefs() {
    return vmRefs;
  }
    
  @VsoMethod
  public void setVmRefs(List<String> vmRefs) {
    this.vmRefs = vmRefs;
  }

  
  public String getObjectID() {
		return "VIMgrHostRuntime";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIMgrHostRuntime viMgrHostRuntime = (VIMgrHostRuntime) o;
    return Objects.equals(this.lastModified, viMgrHostRuntime.lastModified) &&
        Objects.equals(this.cloudRef, viMgrHostRuntime.cloudRef) &&
        Objects.equals(this.clusterName, viMgrHostRuntime.clusterName) &&
        Objects.equals(this.clusterUuid, viMgrHostRuntime.clusterUuid) &&
        Objects.equals(this.cntlrAccessible, viMgrHostRuntime.cntlrAccessible) &&
        Objects.equals(this.connectionState, viMgrHostRuntime.connectionState) &&
        Objects.equals(this.cpuHz, viMgrHostRuntime.cpuHz) &&
        Objects.equals(this.maintenanceMode, viMgrHostRuntime.maintenanceMode) &&
        Objects.equals(this.managedObjectId, viMgrHostRuntime.managedObjectId) &&
        Objects.equals(this.mem, viMgrHostRuntime.mem) &&
        Objects.equals(this.mgmtPortgroup, viMgrHostRuntime.mgmtPortgroup) &&
        Objects.equals(this.name, viMgrHostRuntime.name) &&
        Objects.equals(this.networkUuids, viMgrHostRuntime.networkUuids) &&
        Objects.equals(this.numCpuCores, viMgrHostRuntime.numCpuCores) &&
        Objects.equals(this.numCpuPackages, viMgrHostRuntime.numCpuPackages) &&
        Objects.equals(this.numCpuThreads, viMgrHostRuntime.numCpuThreads) &&
        Objects.equals(this.pnics, viMgrHostRuntime.pnics) &&
        Objects.equals(this.powerstate, viMgrHostRuntime.powerstate) &&
        Objects.equals(this.quarantineStartTs, viMgrHostRuntime.quarantineStartTs) &&
        Objects.equals(this.quarantined, viMgrHostRuntime.quarantined) &&
        Objects.equals(this.quarantinedPeriods, viMgrHostRuntime.quarantinedPeriods) &&
        Objects.equals(this.seFailCnt, viMgrHostRuntime.seFailCnt) &&
        Objects.equals(this.seSuccessCnt, viMgrHostRuntime.seSuccessCnt) &&
        Objects.equals(this.tenantRef, viMgrHostRuntime.tenantRef) &&
        Objects.equals(this.type, viMgrHostRuntime.type) &&
        Objects.equals(this.url, viMgrHostRuntime.url) &&
        Objects.equals(this.uuid, viMgrHostRuntime.uuid) &&
        Objects.equals(this.vmRefs, viMgrHostRuntime.vmRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, cloudRef, clusterName, clusterUuid, cntlrAccessible, connectionState, cpuHz, maintenanceMode, managedObjectId, mem, mgmtPortgroup, name, networkUuids, numCpuCores, numCpuPackages, numCpuThreads, pnics, powerstate, quarantineStartTs, quarantined, quarantinedPeriods, seFailCnt, seSuccessCnt, tenantRef, type, url, uuid, vmRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIMgrHostRuntime {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    clusterUuid: ").append(toIndentedString(clusterUuid)).append("\n");
    sb.append("    cntlrAccessible: ").append(toIndentedString(cntlrAccessible)).append("\n");
    sb.append("    connectionState: ").append(toIndentedString(connectionState)).append("\n");
    sb.append("    cpuHz: ").append(toIndentedString(cpuHz)).append("\n");
    sb.append("    maintenanceMode: ").append(toIndentedString(maintenanceMode)).append("\n");
    sb.append("    managedObjectId: ").append(toIndentedString(managedObjectId)).append("\n");
    sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
    sb.append("    mgmtPortgroup: ").append(toIndentedString(mgmtPortgroup)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkUuids: ").append(toIndentedString(networkUuids)).append("\n");
    sb.append("    numCpuCores: ").append(toIndentedString(numCpuCores)).append("\n");
    sb.append("    numCpuPackages: ").append(toIndentedString(numCpuPackages)).append("\n");
    sb.append("    numCpuThreads: ").append(toIndentedString(numCpuThreads)).append("\n");
    sb.append("    pnics: ").append(toIndentedString(pnics)).append("\n");
    sb.append("    powerstate: ").append(toIndentedString(powerstate)).append("\n");
    sb.append("    quarantineStartTs: ").append(toIndentedString(quarantineStartTs)).append("\n");
    sb.append("    quarantined: ").append(toIndentedString(quarantined)).append("\n");
    sb.append("    quarantinedPeriods: ").append(toIndentedString(quarantinedPeriods)).append("\n");
    sb.append("    seFailCnt: ").append(toIndentedString(seFailCnt)).append("\n");
    sb.append("    seSuccessCnt: ").append(toIndentedString(seSuccessCnt)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vmRefs: ").append(toIndentedString(vmRefs)).append("\n");
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

