package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AzureInfo;
import com.vmware.avi.vro.model.VIMgrGuestNicRuntime;
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
 * VIMgrSEVMRuntime
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIMgrSEVMRuntime")
@VsoFinder(name = Constants.FINDER_VRO_VIMGRSEVMRUNTIME, idAccessor = "getObjectID()")
@Service
public class VIMgrSEVMRuntime extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("availability_zone")
  private String availabilityZone = null;

  @JsonProperty("azure_info")
  private AzureInfo azureInfo = null;

  @JsonProperty("cloud_name")
  private String cloudName = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("connection_state")
  private String connectionState = null;

  @JsonProperty("controller_cluster_uuid")
  private String controllerClusterUuid = null;

  @JsonProperty("controller_ip_addr")
  private String controllerIpAddr = null;

  @JsonProperty("cookie")
  private String cookie = null;

  @JsonProperty("creation_in_progress")
  private Boolean creationInProgress = null;

  @JsonProperty("deletion_in_progress")
  private Boolean deletionInProgress = null;

  @JsonProperty("discovery_response")
  private String discoveryResponse = null;

  @JsonProperty("discovery_status")
  private Integer discoveryStatus = null;

  @JsonProperty("disk_gb")
  private Integer diskGb = null;

  @JsonProperty("flavor")
  private String flavor = null;

  @JsonProperty("guest_nic")
  @Valid
  private List<VIMgrGuestNicRuntime> guestNic = null;

  @JsonProperty("host")
  private String host = null;

  @JsonProperty("host_ref")
  private String hostRef = null;

  @JsonProperty("hostid")
  private String hostid = null;

  @JsonProperty("hypervisor")
  private String hypervisor = null;

  @JsonProperty("init_vnics")
  private Integer initVnics = null;

  @JsonProperty("last_discovery")
  private Integer lastDiscovery = null;

  @JsonProperty("managed_object_id")
  private String managedObjectId = null;

  @JsonProperty("memory_mb")
  private Integer memoryMb = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("powerstate")
  private String powerstate = null;

  @JsonProperty("security_group_uuid")
  private String securityGroupUuid = null;

  @JsonProperty("segroup_ref")
  private String segroupRef = null;

  @JsonProperty("server_group_uuid")
  private String serverGroupUuid = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vcenter_datacenter_uuid")
  private String vcenterDatacenterUuid = null;

  @JsonProperty("vcenter_rm_cookie")
  private String vcenterRmCookie = null;

  @JsonProperty("vcenter_se_type")
  private String vcenterSeType = null;

  @JsonProperty("vcenter_template_vm")
  private Boolean vcenterTemplateVm = null;

  @JsonProperty("vcenter_vAppName")
  private String vcenterVAppName = null;

  @JsonProperty("vcenter_vAppVendor")
  private String vcenterVAppVendor = null;

  @JsonProperty("vcenter_vm_type")
  private String vcenterVmType = null;

  @JsonProperty("vcpus")
  private Integer vcpus = null;

  
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
   * availability_zone of VIMgrSEVMRuntime.
   * @return availabilityZone
  **/
  @ApiModelProperty(value = "availability_zone of VIMgrSEVMRuntime.")


 
  @VsoMethod  
  public String getAvailabilityZone() {
    return availabilityZone;
  }
    
  @VsoMethod
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  
  /**
   *  Field introduced in 17.2.1.
   * @return azureInfo
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public AzureInfo getAzureInfo() {
    return azureInfo;
  }
    
  @VsoMethod
  public void setAzureInfo(AzureInfo azureInfo) {
    this.azureInfo = azureInfo;
  }

  
  /**
   * cloud_name of VIMgrSEVMRuntime.
   * @return cloudName
  **/
  @ApiModelProperty(value = "cloud_name of VIMgrSEVMRuntime.")


 
  @VsoMethod  
  public String getCloudName() {
    return cloudName;
  }
    
  @VsoMethod
  public void setCloudName(String cloudName) {
    this.cloudName = cloudName;
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
   * connection_state of VIMgrSEVMRuntime.
   * @return connectionState
  **/
  @ApiModelProperty(value = "connection_state of VIMgrSEVMRuntime.")


 
  @VsoMethod  
  public String getConnectionState() {
    return connectionState;
  }
    
  @VsoMethod
  public void setConnectionState(String connectionState) {
    this.connectionState = connectionState;
  }

  
  /**
   * Unique object identifier of controller_cluster.
   * @return controllerClusterUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of controller_cluster.")


 
  @VsoMethod  
  public String getControllerClusterUuid() {
    return controllerClusterUuid;
  }
    
  @VsoMethod
  public void setControllerClusterUuid(String controllerClusterUuid) {
    this.controllerClusterUuid = controllerClusterUuid;
  }

  
  /**
   * controller_ip_addr of VIMgrSEVMRuntime.
   * @return controllerIpAddr
  **/
  @ApiModelProperty(value = "controller_ip_addr of VIMgrSEVMRuntime.")


 
  @VsoMethod  
  public String getControllerIpAddr() {
    return controllerIpAddr;
  }
    
  @VsoMethod
  public void setControllerIpAddr(String controllerIpAddr) {
    this.controllerIpAddr = controllerIpAddr;
  }

  
  /**
   * Service Engine Cookie set by the resource manager. Field introduced in 18.2.2.
   * @return cookie
  **/
  @ApiModelProperty(value = "Service Engine Cookie set by the resource manager. Field introduced in 18.2.2.")


 
  @VsoMethod  
  public String getCookie() {
    return cookie;
  }
    
  @VsoMethod
  public void setCookie(String cookie) {
    this.cookie = cookie;
  }

  
  /**
   * Placeholder for description of property creation_in_progress of obj type VIMgrSEVMRuntime field type str  type boolean
   * @return creationInProgress
  **/
  @ApiModelProperty(value = "Placeholder for description of property creation_in_progress of obj type VIMgrSEVMRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isCreationInProgress() {
    return creationInProgress;
  }
    
  @VsoMethod
  public void setCreationInProgress(Boolean creationInProgress) {
    this.creationInProgress = creationInProgress;
  }

  
  /**
   * Placeholder for description of property deletion_in_progress of obj type VIMgrSEVMRuntime field type str  type boolean
   * @return deletionInProgress
  **/
  @ApiModelProperty(value = "Placeholder for description of property deletion_in_progress of obj type VIMgrSEVMRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isDeletionInProgress() {
    return deletionInProgress;
  }
    
  @VsoMethod
  public void setDeletionInProgress(Boolean deletionInProgress) {
    this.deletionInProgress = deletionInProgress;
  }

  
  /**
   * discovery_response of VIMgrSEVMRuntime.
   * @return discoveryResponse
  **/
  @ApiModelProperty(value = "discovery_response of VIMgrSEVMRuntime.")


 
  @VsoMethod  
  public String getDiscoveryResponse() {
    return discoveryResponse;
  }
    
  @VsoMethod
  public void setDiscoveryResponse(String discoveryResponse) {
    this.discoveryResponse = discoveryResponse;
  }

  
  /**
   * Number of discovery_status.
   * @return discoveryStatus
  **/
  @ApiModelProperty(value = "Number of discovery_status.")


 
  @VsoMethod  
  public Integer getDiscoveryStatus() {
    return discoveryStatus;
  }
    
  @VsoMethod
  public void setDiscoveryStatus(Integer discoveryStatus) {
    this.discoveryStatus = discoveryStatus;
  }

  
  /**
   * Disk space in GB for each service engine VM. Field introduced in 18.2.2.
   * @return diskGb
  **/
  @ApiModelProperty(value = "Disk space in GB for each service engine VM. Field introduced in 18.2.2.")


 
  @VsoMethod  
  public Integer getDiskGb() {
    return diskGb;
  }
    
  @VsoMethod
  public void setDiskGb(Integer diskGb) {
    this.diskGb = diskGb;
  }

  
  /**
   * flavor of VIMgrSEVMRuntime.
   * @return flavor
  **/
  @ApiModelProperty(value = "flavor of VIMgrSEVMRuntime.")


 
  @VsoMethod  
  public String getFlavor() {
    return flavor;
  }
    
  @VsoMethod
  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  
  public VIMgrSEVMRuntime addGuestNicItem(VIMgrGuestNicRuntime guestNicItem) {
    if (this.guestNic == null) {
      this.guestNic = new ArrayList<VIMgrGuestNicRuntime>();
    }
    this.guestNic.add(guestNicItem);
    return this;
  }
  
  /**
   * Placeholder for description of property guest_nic of obj type VIMgrSEVMRuntime field type str  type object
   * @return guestNic
  **/
  @ApiModelProperty(value = "Placeholder for description of property guest_nic of obj type VIMgrSEVMRuntime field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<VIMgrGuestNicRuntime> getGuestNic() {
    return guestNic;
  }
    
  @VsoMethod
  public void setGuestNic(List<VIMgrGuestNicRuntime> guestNic) {
    this.guestNic = guestNic;
  }

  
  /**
   * host of VIMgrSEVMRuntime.
   * @return host
  **/
  @ApiModelProperty(value = "host of VIMgrSEVMRuntime.")


 
  @VsoMethod  
  public String getHost() {
    return host;
  }
    
  @VsoMethod
  public void setHost(String host) {
    this.host = host;
  }

  
  /**
   *  It is a reference to an object of type VIMgrHostRuntime.
   * @return hostRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VIMgrHostRuntime.")


 
  @VsoMethod  
  public String getHostRef() {
    return hostRef;
  }
    
  @VsoMethod
  public void setHostRef(String hostRef) {
    this.hostRef = hostRef;
  }

  
  /**
   * hostid of VIMgrSEVMRuntime.
   * @return hostid
  **/
  @ApiModelProperty(value = "hostid of VIMgrSEVMRuntime.")


 
  @VsoMethod  
  public String getHostid() {
    return hostid;
  }
    
  @VsoMethod
  public void setHostid(String hostid) {
    this.hostid = hostid;
  }

  
  /**
   *  Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * @return hypervisor
  **/
  @ApiModelProperty(value = " Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.")


 
  @VsoMethod  
  public String getHypervisor() {
    return hypervisor;
  }
    
  @VsoMethod
  public void setHypervisor(String hypervisor) {
    this.hypervisor = hypervisor;
  }

  
  /**
   * Number of init_vnics.
   * @return initVnics
  **/
  @ApiModelProperty(value = "Number of init_vnics.")


 
  @VsoMethod  
  public Integer getInitVnics() {
    return initVnics;
  }
    
  @VsoMethod
  public void setInitVnics(Integer initVnics) {
    this.initVnics = initVnics;
  }

  
  /**
   * Number of last_discovery.
   * @return lastDiscovery
  **/
  @ApiModelProperty(value = "Number of last_discovery.")


 
  @VsoMethod  
  public Integer getLastDiscovery() {
    return lastDiscovery;
  }
    
  @VsoMethod
  public void setLastDiscovery(Integer lastDiscovery) {
    this.lastDiscovery = lastDiscovery;
  }

  
  /**
   * managed_object_id of VIMgrSEVMRuntime.
   * @return managedObjectId
  **/
  @ApiModelProperty(required = true, value = "managed_object_id of VIMgrSEVMRuntime.")
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
   * Memory in MB for each service engine VM. Field introduced in 18.2.2.
   * @return memoryMb
  **/
  @ApiModelProperty(value = "Memory in MB for each service engine VM. Field introduced in 18.2.2.")


 
  @VsoMethod  
  public Integer getMemoryMb() {
    return memoryMb;
  }
    
  @VsoMethod
  public void setMemoryMb(Integer memoryMb) {
    this.memoryMb = memoryMb;
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
   * powerstate of VIMgrSEVMRuntime.
   * @return powerstate
  **/
  @ApiModelProperty(value = "powerstate of VIMgrSEVMRuntime.")


 
  @VsoMethod  
  public String getPowerstate() {
    return powerstate;
  }
    
  @VsoMethod
  public void setPowerstate(String powerstate) {
    this.powerstate = powerstate;
  }

  
  /**
   * Unique object identifier of security_group.
   * @return securityGroupUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of security_group.")


 
  @VsoMethod  
  public String getSecurityGroupUuid() {
    return securityGroupUuid;
  }
    
  @VsoMethod
  public void setSecurityGroupUuid(String securityGroupUuid) {
    this.securityGroupUuid = securityGroupUuid;
  }

  
  /**
   *  It is a reference to an object of type ServiceEngineGroup.
   * @return segroupRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type ServiceEngineGroup.")


 
  @VsoMethod  
  public String getSegroupRef() {
    return segroupRef;
  }
    
  @VsoMethod
  public void setSegroupRef(String segroupRef) {
    this.segroupRef = segroupRef;
  }

  
  /**
   * Unique object identifier of server_group.
   * @return serverGroupUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of server_group.")


 
  @VsoMethod  
  public String getServerGroupUuid() {
    return serverGroupUuid;
  }
    
  @VsoMethod
  public void setServerGroupUuid(String serverGroupUuid) {
    this.serverGroupUuid = serverGroupUuid;
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

  
  /**
   * Unique object identifier of vcenter_datacenter.
   * @return vcenterDatacenterUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of vcenter_datacenter.")


 
  @VsoMethod  
  public String getVcenterDatacenterUuid() {
    return vcenterDatacenterUuid;
  }
    
  @VsoMethod
  public void setVcenterDatacenterUuid(String vcenterDatacenterUuid) {
    this.vcenterDatacenterUuid = vcenterDatacenterUuid;
  }

  
  /**
   * vcenter_rm_cookie of VIMgrSEVMRuntime.
   * @return vcenterRmCookie
  **/
  @ApiModelProperty(value = "vcenter_rm_cookie of VIMgrSEVMRuntime.")


 
  @VsoMethod  
  public String getVcenterRmCookie() {
    return vcenterRmCookie;
  }
    
  @VsoMethod
  public void setVcenterRmCookie(String vcenterRmCookie) {
    this.vcenterRmCookie = vcenterRmCookie;
  }

  
  /**
   *  Enum options - VIMGR_SE_NETWORK_ADMIN, VIMGR_SE_UNIFIED_ADMIN.
   * @return vcenterSeType
  **/
  @ApiModelProperty(value = " Enum options - VIMGR_SE_NETWORK_ADMIN, VIMGR_SE_UNIFIED_ADMIN.")


 
  @VsoMethod  
  public String getVcenterSeType() {
    return vcenterSeType;
  }
    
  @VsoMethod
  public void setVcenterSeType(String vcenterSeType) {
    this.vcenterSeType = vcenterSeType;
  }

  
  /**
   * Placeholder for description of property vcenter_template_vm of obj type VIMgrSEVMRuntime field type str  type boolean
   * @return vcenterTemplateVm
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_template_vm of obj type VIMgrSEVMRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isVcenterTemplateVm() {
    return vcenterTemplateVm;
  }
    
  @VsoMethod
  public void setVcenterTemplateVm(Boolean vcenterTemplateVm) {
    this.vcenterTemplateVm = vcenterTemplateVm;
  }

  
  /**
   * vcenter_vAppName of VIMgrSEVMRuntime.
   * @return vcenterVAppName
  **/
  @ApiModelProperty(value = "vcenter_vAppName of VIMgrSEVMRuntime.")


 
  @VsoMethod  
  public String getVcenterVAppName() {
    return vcenterVAppName;
  }
    
  @VsoMethod
  public void setVcenterVAppName(String vcenterVAppName) {
    this.vcenterVAppName = vcenterVAppName;
  }

  
  /**
   * vcenter_vAppVendor of VIMgrSEVMRuntime.
   * @return vcenterVAppVendor
  **/
  @ApiModelProperty(value = "vcenter_vAppVendor of VIMgrSEVMRuntime.")


 
  @VsoMethod  
  public String getVcenterVAppVendor() {
    return vcenterVAppVendor;
  }
    
  @VsoMethod
  public void setVcenterVAppVendor(String vcenterVAppVendor) {
    this.vcenterVAppVendor = vcenterVAppVendor;
  }

  
  /**
   *  Enum options - VMTYPE_SE_VM, VMTYPE_POOL_SRVR.
   * @return vcenterVmType
  **/
  @ApiModelProperty(value = " Enum options - VMTYPE_SE_VM, VMTYPE_POOL_SRVR.")


 
  @VsoMethod  
  public String getVcenterVmType() {
    return vcenterVmType;
  }
    
  @VsoMethod
  public void setVcenterVmType(String vcenterVmType) {
    this.vcenterVmType = vcenterVmType;
  }

  
  /**
   * Count of vcpus for each service engine VM. Field introduced in 18.2.2.
   * @return vcpus
  **/
  @ApiModelProperty(value = "Count of vcpus for each service engine VM. Field introduced in 18.2.2.")


 
  @VsoMethod  
  public Integer getVcpus() {
    return vcpus;
  }
    
  @VsoMethod
  public void setVcpus(Integer vcpus) {
    this.vcpus = vcpus;
  }

  
  public String getObjectID() {
		return "VIMgrSEVMRuntime";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIMgrSEVMRuntime viMgrSEVMRuntime = (VIMgrSEVMRuntime) o;
    return Objects.equals(this.lastModified, viMgrSEVMRuntime.lastModified) &&
        Objects.equals(this.availabilityZone, viMgrSEVMRuntime.availabilityZone) &&
        Objects.equals(this.azureInfo, viMgrSEVMRuntime.azureInfo) &&
        Objects.equals(this.cloudName, viMgrSEVMRuntime.cloudName) &&
        Objects.equals(this.cloudRef, viMgrSEVMRuntime.cloudRef) &&
        Objects.equals(this.connectionState, viMgrSEVMRuntime.connectionState) &&
        Objects.equals(this.controllerClusterUuid, viMgrSEVMRuntime.controllerClusterUuid) &&
        Objects.equals(this.controllerIpAddr, viMgrSEVMRuntime.controllerIpAddr) &&
        Objects.equals(this.cookie, viMgrSEVMRuntime.cookie) &&
        Objects.equals(this.creationInProgress, viMgrSEVMRuntime.creationInProgress) &&
        Objects.equals(this.deletionInProgress, viMgrSEVMRuntime.deletionInProgress) &&
        Objects.equals(this.discoveryResponse, viMgrSEVMRuntime.discoveryResponse) &&
        Objects.equals(this.discoveryStatus, viMgrSEVMRuntime.discoveryStatus) &&
        Objects.equals(this.diskGb, viMgrSEVMRuntime.diskGb) &&
        Objects.equals(this.flavor, viMgrSEVMRuntime.flavor) &&
        Objects.equals(this.guestNic, viMgrSEVMRuntime.guestNic) &&
        Objects.equals(this.host, viMgrSEVMRuntime.host) &&
        Objects.equals(this.hostRef, viMgrSEVMRuntime.hostRef) &&
        Objects.equals(this.hostid, viMgrSEVMRuntime.hostid) &&
        Objects.equals(this.hypervisor, viMgrSEVMRuntime.hypervisor) &&
        Objects.equals(this.initVnics, viMgrSEVMRuntime.initVnics) &&
        Objects.equals(this.lastDiscovery, viMgrSEVMRuntime.lastDiscovery) &&
        Objects.equals(this.managedObjectId, viMgrSEVMRuntime.managedObjectId) &&
        Objects.equals(this.memoryMb, viMgrSEVMRuntime.memoryMb) &&
        Objects.equals(this.name, viMgrSEVMRuntime.name) &&
        Objects.equals(this.powerstate, viMgrSEVMRuntime.powerstate) &&
        Objects.equals(this.securityGroupUuid, viMgrSEVMRuntime.securityGroupUuid) &&
        Objects.equals(this.segroupRef, viMgrSEVMRuntime.segroupRef) &&
        Objects.equals(this.serverGroupUuid, viMgrSEVMRuntime.serverGroupUuid) &&
        Objects.equals(this.tenantRef, viMgrSEVMRuntime.tenantRef) &&
        Objects.equals(this.type, viMgrSEVMRuntime.type) &&
        Objects.equals(this.url, viMgrSEVMRuntime.url) &&
        Objects.equals(this.uuid, viMgrSEVMRuntime.uuid) &&
        Objects.equals(this.vcenterDatacenterUuid, viMgrSEVMRuntime.vcenterDatacenterUuid) &&
        Objects.equals(this.vcenterRmCookie, viMgrSEVMRuntime.vcenterRmCookie) &&
        Objects.equals(this.vcenterSeType, viMgrSEVMRuntime.vcenterSeType) &&
        Objects.equals(this.vcenterTemplateVm, viMgrSEVMRuntime.vcenterTemplateVm) &&
        Objects.equals(this.vcenterVAppName, viMgrSEVMRuntime.vcenterVAppName) &&
        Objects.equals(this.vcenterVAppVendor, viMgrSEVMRuntime.vcenterVAppVendor) &&
        Objects.equals(this.vcenterVmType, viMgrSEVMRuntime.vcenterVmType) &&
        Objects.equals(this.vcpus, viMgrSEVMRuntime.vcpus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, availabilityZone, azureInfo, cloudName, cloudRef, connectionState, controllerClusterUuid, controllerIpAddr, cookie, creationInProgress, deletionInProgress, discoveryResponse, discoveryStatus, diskGb, flavor, guestNic, host, hostRef, hostid, hypervisor, initVnics, lastDiscovery, managedObjectId, memoryMb, name, powerstate, securityGroupUuid, segroupRef, serverGroupUuid, tenantRef, type, url, uuid, vcenterDatacenterUuid, vcenterRmCookie, vcenterSeType, vcenterTemplateVm, vcenterVAppName, vcenterVAppVendor, vcenterVmType, vcpus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIMgrSEVMRuntime {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    azureInfo: ").append(toIndentedString(azureInfo)).append("\n");
    sb.append("    cloudName: ").append(toIndentedString(cloudName)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    connectionState: ").append(toIndentedString(connectionState)).append("\n");
    sb.append("    controllerClusterUuid: ").append(toIndentedString(controllerClusterUuid)).append("\n");
    sb.append("    controllerIpAddr: ").append(toIndentedString(controllerIpAddr)).append("\n");
    sb.append("    cookie: ").append(toIndentedString(cookie)).append("\n");
    sb.append("    creationInProgress: ").append(toIndentedString(creationInProgress)).append("\n");
    sb.append("    deletionInProgress: ").append(toIndentedString(deletionInProgress)).append("\n");
    sb.append("    discoveryResponse: ").append(toIndentedString(discoveryResponse)).append("\n");
    sb.append("    discoveryStatus: ").append(toIndentedString(discoveryStatus)).append("\n");
    sb.append("    diskGb: ").append(toIndentedString(diskGb)).append("\n");
    sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
    sb.append("    guestNic: ").append(toIndentedString(guestNic)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    hostRef: ").append(toIndentedString(hostRef)).append("\n");
    sb.append("    hostid: ").append(toIndentedString(hostid)).append("\n");
    sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
    sb.append("    initVnics: ").append(toIndentedString(initVnics)).append("\n");
    sb.append("    lastDiscovery: ").append(toIndentedString(lastDiscovery)).append("\n");
    sb.append("    managedObjectId: ").append(toIndentedString(managedObjectId)).append("\n");
    sb.append("    memoryMb: ").append(toIndentedString(memoryMb)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    powerstate: ").append(toIndentedString(powerstate)).append("\n");
    sb.append("    securityGroupUuid: ").append(toIndentedString(securityGroupUuid)).append("\n");
    sb.append("    segroupRef: ").append(toIndentedString(segroupRef)).append("\n");
    sb.append("    serverGroupUuid: ").append(toIndentedString(serverGroupUuid)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vcenterDatacenterUuid: ").append(toIndentedString(vcenterDatacenterUuid)).append("\n");
    sb.append("    vcenterRmCookie: ").append(toIndentedString(vcenterRmCookie)).append("\n");
    sb.append("    vcenterSeType: ").append(toIndentedString(vcenterSeType)).append("\n");
    sb.append("    vcenterTemplateVm: ").append(toIndentedString(vcenterTemplateVm)).append("\n");
    sb.append("    vcenterVAppName: ").append(toIndentedString(vcenterVAppName)).append("\n");
    sb.append("    vcenterVAppVendor: ").append(toIndentedString(vcenterVAppVendor)).append("\n");
    sb.append("    vcenterVmType: ").append(toIndentedString(vcenterVmType)).append("\n");
    sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
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

