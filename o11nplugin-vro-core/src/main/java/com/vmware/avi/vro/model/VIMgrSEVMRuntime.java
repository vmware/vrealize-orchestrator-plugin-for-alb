package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AzureInfo;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VIMgrSEVMRuntime is a POJO class extends AviRestResource that used for creating
 * VIMgrSEVMRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VIMgrSEVMRuntime")
@VsoFinder(name = Constants.FINDER_VRO_VIMGRSEVMRUNTIME, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VIMgrSEVMRuntime extends AviRestResource {
    @JsonProperty("availability_zone")
    @JsonInclude(Include.NON_NULL)
    private String availabilityZone = null;

    @JsonProperty("azure_info")
    @JsonInclude(Include.NON_NULL)
    private AzureInfo azureInfo = null;

    @JsonProperty("cloud_name")
    @JsonInclude(Include.NON_NULL)
    private String cloudName = null;

    @JsonProperty("cloud_ref")
    @JsonInclude(Include.NON_NULL)
    private String cloudRef = null;

    @JsonProperty("connection_state")
    @JsonInclude(Include.NON_NULL)
    private String connectionState = null;

    @JsonProperty("controller_cluster_uuid")
    @JsonInclude(Include.NON_NULL)
    private String controllerClusterUuid = null;

    @JsonProperty("controller_ip_addr")
    @JsonInclude(Include.NON_NULL)
    private String controllerIpAddr = null;

    @JsonProperty("cookie")
    @JsonInclude(Include.NON_NULL)
    private String cookie = null;

    @JsonProperty("creation_in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean creationInProgress = null;

    @JsonProperty("deletion_in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean deletionInProgress = null;

    @JsonProperty("discovery_response")
    @JsonInclude(Include.NON_NULL)
    private String discoveryResponse = null;

    @JsonProperty("discovery_status")
    @JsonInclude(Include.NON_NULL)
    private Integer discoveryStatus = null;

    @JsonProperty("disk_gb")
    @JsonInclude(Include.NON_NULL)
    private Integer diskGb = null;

    @JsonProperty("flavor")
    @JsonInclude(Include.NON_NULL)
    private String flavor = null;

    @JsonProperty("gcp_se_project_id")
    @JsonInclude(Include.NON_NULL)
    private String gcpSeProjectId = null;

    @JsonProperty("guest_nic")
    @JsonInclude(Include.NON_NULL)
    private List<VIMgrGuestNicRuntime> guestNic = null;

    @JsonProperty("host")
    @JsonInclude(Include.NON_NULL)
    private String host = null;

    @JsonProperty("host_ref")
    @JsonInclude(Include.NON_NULL)
    private String hostRef = null;

    @JsonProperty("hostid")
    @JsonInclude(Include.NON_NULL)
    private String hostid = null;

    @JsonProperty("hypervisor")
    @JsonInclude(Include.NON_NULL)
    private String hypervisor = null;

    @JsonProperty("init_vnics")
    @JsonInclude(Include.NON_NULL)
    private Integer initVnics = null;

    @JsonProperty("last_discovery")
    @JsonInclude(Include.NON_NULL)
    private Integer lastDiscovery = null;

    @JsonProperty("managed_object_id")
    @JsonInclude(Include.NON_NULL)
    private String managedObjectId = null;

    @JsonProperty("memory_mb")
    @JsonInclude(Include.NON_NULL)
    private Integer memoryMb = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("powerstate")
    @JsonInclude(Include.NON_NULL)
    private String powerstate = null;

    @JsonProperty("security_group_uuid")
    @JsonInclude(Include.NON_NULL)
    private String securityGroupUuid = null;

    @JsonProperty("segroup_ref")
    @JsonInclude(Include.NON_NULL)
    private String segroupRef = null;

    @JsonProperty("server_group_uuid")
    @JsonInclude(Include.NON_NULL)
    private String serverGroupUuid = null;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;

    @JsonProperty("vcenter_datacenter_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vcenterDatacenterUuid = null;

    @JsonProperty("vcenter_instance_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vcenterInstanceUuid = null;

    @JsonProperty("vcenter_ref")
    @JsonInclude(Include.NON_NULL)
    private String vcenterRef = null;

    @JsonProperty("vcenter_rm_cookie")
    @JsonInclude(Include.NON_NULL)
    private String vcenterRmCookie = null;

    @JsonProperty("vcenter_se_type")
    @JsonInclude(Include.NON_NULL)
    private String vcenterSeType = null;

    @JsonProperty("vcenter_template_vm")
    @JsonInclude(Include.NON_NULL)
    private Boolean vcenterTemplateVm = null;

    @JsonProperty("vcenter_url")
    @JsonInclude(Include.NON_NULL)
    private String vcenterUrl = null;

    @JsonProperty("vcenter_vAppName")
    @JsonInclude(Include.NON_NULL)
    private String vcenterVappname = null;

    @JsonProperty("vcenter_vAppVendor")
    @JsonInclude(Include.NON_NULL)
    private String vcenterVappvendor = null;

    @JsonProperty("vcenter_vm_type")
    @JsonInclude(Include.NON_NULL)
    private String vcenterVmType = null;

    @JsonProperty("vcpus")
    @JsonInclude(Include.NON_NULL)
    private Integer vcpus = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property availability_zone of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return availabilityZone
   */
  @VsoMethod
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property availability_zone of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param availabilityZone set the availabilityZone.
   */
  @VsoMethod
  public void setAvailabilityZone(String  availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return azureInfo
   */
  @VsoMethod
  public AzureInfo getAzureInfo() {
    return azureInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param azureInfo set the azureInfo.
   */
  @VsoMethod
  public void setAzureInfo(AzureInfo azureInfo) {
    this.azureInfo = azureInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cloud_name of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudName
   */
  @VsoMethod
  public String getCloudName() {
    return cloudName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cloud_name of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudName set the cloudName.
   */
  @VsoMethod
  public void setCloudName(String  cloudName) {
    this.cloudName = cloudName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type cloud.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudRef
   */
  @VsoMethod
  public String getCloudRef() {
    return cloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type cloud.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudRef set the cloudRef.
   */
  @VsoMethod
  public void setCloudRef(String  cloudRef) {
    this.cloudRef = cloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property connection_state of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return connectionState
   */
  @VsoMethod
  public String getConnectionState() {
    return connectionState;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property connection_state of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param connectionState set the connectionState.
   */
  @VsoMethod
  public void setConnectionState(String  connectionState) {
    this.connectionState = connectionState;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of controller_cluster.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerClusterUuid
   */
  @VsoMethod
  public String getControllerClusterUuid() {
    return controllerClusterUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of controller_cluster.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerClusterUuid set the controllerClusterUuid.
   */
  @VsoMethod
  public void setControllerClusterUuid(String  controllerClusterUuid) {
    this.controllerClusterUuid = controllerClusterUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property controller_ip_addr of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerIpAddr
   */
  @VsoMethod
  public String getControllerIpAddr() {
    return controllerIpAddr;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property controller_ip_addr of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerIpAddr set the controllerIpAddr.
   */
  @VsoMethod
  public void setControllerIpAddr(String  controllerIpAddr) {
    this.controllerIpAddr = controllerIpAddr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine cookie set by the resource manager.
   * Field introduced in 18.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cookie
   */
  @VsoMethod
  public String getCookie() {
    return cookie;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine cookie set by the resource manager.
   * Field introduced in 18.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cookie set the cookie.
   */
  @VsoMethod
  public void setCookie(String  cookie) {
    this.cookie = cookie;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property creation_in_progress of obj type vimgrsevmruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return creationInProgress
   */
  @VsoMethod
  public Boolean getCreationInProgress() {
    return creationInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property creation_in_progress of obj type vimgrsevmruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param creationInProgress set the creationInProgress.
   */
  @VsoMethod
  public void setCreationInProgress(Boolean  creationInProgress) {
    this.creationInProgress = creationInProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property deletion_in_progress of obj type vimgrsevmruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return deletionInProgress
   */
  @VsoMethod
  public Boolean getDeletionInProgress() {
    return deletionInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property deletion_in_progress of obj type vimgrsevmruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param deletionInProgress set the deletionInProgress.
   */
  @VsoMethod
  public void setDeletionInProgress(Boolean  deletionInProgress) {
    this.deletionInProgress = deletionInProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property discovery_response of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return discoveryResponse
   */
  @VsoMethod
  public String getDiscoveryResponse() {
    return discoveryResponse;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property discovery_response of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param discoveryResponse set the discoveryResponse.
   */
  @VsoMethod
  public void setDiscoveryResponse(String  discoveryResponse) {
    this.discoveryResponse = discoveryResponse;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property discovery_status of obj type vimgrsevmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return discoveryStatus
   */
  @VsoMethod
  public Integer getDiscoveryStatus() {
    return discoveryStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property discovery_status of obj type vimgrsevmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param discoveryStatus set the discoveryStatus.
   */
  @VsoMethod
  public void setDiscoveryStatus(Integer  discoveryStatus) {
    this.discoveryStatus = discoveryStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Disk space in gb for each service engine vm.
   * Field introduced in 18.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return diskGb
   */
  @VsoMethod
  public Integer getDiskGb() {
    return diskGb;
  }

  /**
   * This is the setter method to the attribute.
   * Disk space in gb for each service engine vm.
   * Field introduced in 18.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param diskGb set the diskGb.
   */
  @VsoMethod
  public void setDiskGb(Integer  diskGb) {
    this.diskGb = diskGb;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property flavor of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return flavor
   */
  @VsoMethod
  public String getFlavor() {
    return flavor;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property flavor of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param flavor set the flavor.
   */
  @VsoMethod
  public void setFlavor(String  flavor) {
    this.flavor = flavor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Gcp project id in which se is created.
   * This field is applicable for gcp cloud type only.
   * Field introduced in 21.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gcpSeProjectId
   */
  @VsoMethod
  public String getGcpSeProjectId() {
    return gcpSeProjectId;
  }

  /**
   * This is the setter method to the attribute.
   * Gcp project id in which se is created.
   * This field is applicable for gcp cloud type only.
   * Field introduced in 21.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gcpSeProjectId set the gcpSeProjectId.
   */
  @VsoMethod
  public void setGcpSeProjectId(String  gcpSeProjectId) {
    this.gcpSeProjectId = gcpSeProjectId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property guest_nic of obj type vimgrsevmruntime field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return guestNic
   */
  @VsoMethod
  public List<VIMgrGuestNicRuntime> getGuestNic() {
    return guestNic;
  }

  /**
   * This is the setter method. this will set the guestNic
   * Placeholder for description of property guest_nic of obj type vimgrsevmruntime field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return guestNic
   */
  @VsoMethod
  public void setGuestNic(List<VIMgrGuestNicRuntime>  guestNic) {
    this.guestNic = guestNic;
  }

  /**
   * This is the setter method this will set the guestNic
   * Placeholder for description of property guest_nic of obj type vimgrsevmruntime field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return guestNic
   */
  @VsoMethod
  public VIMgrSEVMRuntime addGuestNicItem(VIMgrGuestNicRuntime guestNicItem) {
    if (this.guestNic == null) {
      this.guestNic = new ArrayList<VIMgrGuestNicRuntime>();
    }
    this.guestNic.add(guestNicItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property host of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return host
   */
  @VsoMethod
  public String getHost() {
    return host;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property host of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param host set the host.
   */
  @VsoMethod
  public void setHost(String  host) {
    this.host = host;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type vimgrhostruntime.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostRef
   */
  @VsoMethod
  public String getHostRef() {
    return hostRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type vimgrhostruntime.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostRef set the hostRef.
   */
  @VsoMethod
  public void setHostRef(String  hostRef) {
    this.hostRef = hostRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property hostid of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostid
   */
  @VsoMethod
  public String getHostid() {
    return hostid;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property hostid of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostid set the hostid.
   */
  @VsoMethod
  public void setHostid(String  hostid) {
    this.hostid = hostid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hypervisor
   */
  @VsoMethod
  public String getHypervisor() {
    return hypervisor;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hypervisor set the hypervisor.
   */
  @VsoMethod
  public void setHypervisor(String  hypervisor) {
    this.hypervisor = hypervisor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property init_vnics of obj type vimgrsevmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return initVnics
   */
  @VsoMethod
  public Integer getInitVnics() {
    return initVnics;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property init_vnics of obj type vimgrsevmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param initVnics set the initVnics.
   */
  @VsoMethod
  public void setInitVnics(Integer  initVnics) {
    this.initVnics = initVnics;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property last_discovery of obj type vimgrsevmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastDiscovery
   */
  @VsoMethod
  public Integer getLastDiscovery() {
    return lastDiscovery;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property last_discovery of obj type vimgrsevmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastDiscovery set the lastDiscovery.
   */
  @VsoMethod
  public void setLastDiscovery(Integer  lastDiscovery) {
    this.lastDiscovery = lastDiscovery;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property managed_object_id of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return managedObjectId
   */
  @VsoMethod
  public String getManagedObjectId() {
    return managedObjectId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property managed_object_id of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param managedObjectId set the managedObjectId.
   */
  @VsoMethod
  public void setManagedObjectId(String  managedObjectId) {
    this.managedObjectId = managedObjectId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Memory in mb for each service engine vm.
   * Field introduced in 18.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return memoryMb
   */
  @VsoMethod
  public Integer getMemoryMb() {
    return memoryMb;
  }

  /**
   * This is the setter method to the attribute.
   * Memory in mb for each service engine vm.
   * Field introduced in 18.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param memoryMb set the memoryMb.
   */
  @VsoMethod
  public void setMemoryMb(Integer  memoryMb) {
    this.memoryMb = memoryMb;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property powerstate of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return powerstate
   */
  @VsoMethod
  public String getPowerstate() {
    return powerstate;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property powerstate of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param powerstate set the powerstate.
   */
  @VsoMethod
  public void setPowerstate(String  powerstate) {
    this.powerstate = powerstate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of security_group.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return securityGroupUuid
   */
  @VsoMethod
  public String getSecurityGroupUuid() {
    return securityGroupUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of security_group.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param securityGroupUuid set the securityGroupUuid.
   */
  @VsoMethod
  public void setSecurityGroupUuid(String  securityGroupUuid) {
    this.securityGroupUuid = securityGroupUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceenginegroup.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return segroupRef
   */
  @VsoMethod
  public String getSegroupRef() {
    return segroupRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type serviceenginegroup.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param segroupRef set the segroupRef.
   */
  @VsoMethod
  public void setSegroupRef(String  segroupRef) {
    this.segroupRef = segroupRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of server_group.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverGroupUuid
   */
  @VsoMethod
  public String getServerGroupUuid() {
    return serverGroupUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of server_group.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverGroupUuid set the serverGroupUuid.
   */
  @VsoMethod
  public void setServerGroupUuid(String  serverGroupUuid) {
    this.serverGroupUuid = serverGroupUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of vcenter_datacenter.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterDatacenterUuid
   */
  @VsoMethod
  public String getVcenterDatacenterUuid() {
    return vcenterDatacenterUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of vcenter_datacenter.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterDatacenterUuid set the vcenterDatacenterUuid.
   */
  @VsoMethod
  public void setVcenterDatacenterUuid(String  vcenterDatacenterUuid) {
    this.vcenterDatacenterUuid = vcenterDatacenterUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Serviceengine instance uuid from vcenter.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterInstanceUuid
   */
  @VsoMethod
  public String getVcenterInstanceUuid() {
    return vcenterInstanceUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Serviceengine instance uuid from vcenter.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterInstanceUuid set the vcenterInstanceUuid.
   */
  @VsoMethod
  public void setVcenterInstanceUuid(String  vcenterInstanceUuid) {
    this.vcenterInstanceUuid = vcenterInstanceUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Serviceengine belongs to vcenter.
   * It is a reference to an object of type vcenterserver.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterRef
   */
  @VsoMethod
  public String getVcenterRef() {
    return vcenterRef;
  }

  /**
   * This is the setter method to the attribute.
   * Serviceengine belongs to vcenter.
   * It is a reference to an object of type vcenterserver.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterRef set the vcenterRef.
   */
  @VsoMethod
  public void setVcenterRef(String  vcenterRef) {
    this.vcenterRef = vcenterRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_rm_cookie of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterRmCookie
   */
  @VsoMethod
  public String getVcenterRmCookie() {
    return vcenterRmCookie;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_rm_cookie of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterRmCookie set the vcenterRmCookie.
   */
  @VsoMethod
  public void setVcenterRmCookie(String  vcenterRmCookie) {
    this.vcenterRmCookie = vcenterRmCookie;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - VIMGR_SE_NETWORK_ADMIN, VIMGR_SE_UNIFIED_ADMIN.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterSeType
   */
  @VsoMethod
  public String getVcenterSeType() {
    return vcenterSeType;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - VIMGR_SE_NETWORK_ADMIN, VIMGR_SE_UNIFIED_ADMIN.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterSeType set the vcenterSeType.
   */
  @VsoMethod
  public void setVcenterSeType(String  vcenterSeType) {
    this.vcenterSeType = vcenterSeType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_template_vm of obj type vimgrsevmruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterTemplateVm
   */
  @VsoMethod
  public Boolean getVcenterTemplateVm() {
    return vcenterTemplateVm;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_template_vm of obj type vimgrsevmruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterTemplateVm set the vcenterTemplateVm.
   */
  @VsoMethod
  public void setVcenterTemplateVm(Boolean  vcenterTemplateVm) {
    this.vcenterTemplateVm = vcenterTemplateVm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine deployed in vcenter.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterUrl
   */
  @VsoMethod
  public String getVcenterUrl() {
    return vcenterUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine deployed in vcenter.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterUrl set the vcenterUrl.
   */
  @VsoMethod
  public void setVcenterUrl(String  vcenterUrl) {
    this.vcenterUrl = vcenterUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_vappname of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterVappname
   */
  @VsoMethod
  public String getVcenterVappname() {
    return vcenterVappname;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_vappname of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterVappname set the vcenterVappname.
   */
  @VsoMethod
  public void setVcenterVappname(String  vcenterVappname) {
    this.vcenterVappname = vcenterVappname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_vappvendor of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterVappvendor
   */
  @VsoMethod
  public String getVcenterVappvendor() {
    return vcenterVappvendor;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_vappvendor of obj type vimgrsevmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterVappvendor set the vcenterVappvendor.
   */
  @VsoMethod
  public void setVcenterVappvendor(String  vcenterVappvendor) {
    this.vcenterVappvendor = vcenterVappvendor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - VMTYPE_SE_VM, VMTYPE_POOL_SRVR.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterVmType
   */
  @VsoMethod
  public String getVcenterVmType() {
    return vcenterVmType;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - VMTYPE_SE_VM, VMTYPE_POOL_SRVR.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterVmType set the vcenterVmType.
   */
  @VsoMethod
  public void setVcenterVmType(String  vcenterVmType) {
    this.vcenterVmType = vcenterVmType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Count of vcpus for each service engine vm.
   * Field introduced in 18.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcpus
   */
  @VsoMethod
  public Integer getVcpus() {
    return vcpus;
  }

  /**
   * This is the setter method to the attribute.
   * Count of vcpus for each service engine vm.
   * Field introduced in 18.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcpus set the vcpus.
   */
  @VsoMethod
  public void setVcpus(Integer  vcpus) {
    this.vcpus = vcpus;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VIMgrSEVMRuntime objVIMgrSEVMRuntime = (VIMgrSEVMRuntime) o;
  return   Objects.equals(this.type, objVIMgrSEVMRuntime.type)&&
  Objects.equals(this.uuid, objVIMgrSEVMRuntime.uuid)&&
  Objects.equals(this.name, objVIMgrSEVMRuntime.name)&&
  Objects.equals(this.managedObjectId, objVIMgrSEVMRuntime.managedObjectId)&&
  Objects.equals(this.host, objVIMgrSEVMRuntime.host)&&
  Objects.equals(this.powerstate, objVIMgrSEVMRuntime.powerstate)&&
  Objects.equals(this.connectionState, objVIMgrSEVMRuntime.connectionState)&&
  Objects.equals(this.vcenterDatacenterUuid, objVIMgrSEVMRuntime.vcenterDatacenterUuid)&&
  Objects.equals(this.vcenterVmType, objVIMgrSEVMRuntime.vcenterVmType)&&
  Objects.equals(this.vcenterVappname, objVIMgrSEVMRuntime.vcenterVappname)&&
  Objects.equals(this.vcenterVappvendor, objVIMgrSEVMRuntime.vcenterVappvendor)&&
  Objects.equals(this.vcenterTemplateVm, objVIMgrSEVMRuntime.vcenterTemplateVm)&&
  Objects.equals(this.vcenterSeType, objVIMgrSEVMRuntime.vcenterSeType)&&
  Objects.equals(this.creationInProgress, objVIMgrSEVMRuntime.creationInProgress)&&
  Objects.equals(this.vcenterRmCookie, objVIMgrSEVMRuntime.vcenterRmCookie)&&
  Objects.equals(this.controllerIpAddr, objVIMgrSEVMRuntime.controllerIpAddr)&&
  Objects.equals(this.guestNic, objVIMgrSEVMRuntime.guestNic)&&
  Objects.equals(this.initVnics, objVIMgrSEVMRuntime.initVnics)&&
  Objects.equals(this.cloudName, objVIMgrSEVMRuntime.cloudName)&&
  Objects.equals(this.flavor, objVIMgrSEVMRuntime.flavor)&&
  Objects.equals(this.hypervisor, objVIMgrSEVMRuntime.hypervisor)&&
  Objects.equals(this.securityGroupUuid, objVIMgrSEVMRuntime.securityGroupUuid)&&
  Objects.equals(this.serverGroupUuid, objVIMgrSEVMRuntime.serverGroupUuid)&&
  Objects.equals(this.segroupRef, objVIMgrSEVMRuntime.segroupRef)&&
  Objects.equals(this.lastDiscovery, objVIMgrSEVMRuntime.lastDiscovery)&&
  Objects.equals(this.discoveryStatus, objVIMgrSEVMRuntime.discoveryStatus)&&
  Objects.equals(this.discoveryResponse, objVIMgrSEVMRuntime.discoveryResponse)&&
  Objects.equals(this.deletionInProgress, objVIMgrSEVMRuntime.deletionInProgress)&&
  Objects.equals(this.hostid, objVIMgrSEVMRuntime.hostid)&&
  Objects.equals(this.controllerClusterUuid, objVIMgrSEVMRuntime.controllerClusterUuid)&&
  Objects.equals(this.availabilityZone, objVIMgrSEVMRuntime.availabilityZone)&&
  Objects.equals(this.hostRef, objVIMgrSEVMRuntime.hostRef)&&
  Objects.equals(this.azureInfo, objVIMgrSEVMRuntime.azureInfo)&&
  Objects.equals(this.diskGb, objVIMgrSEVMRuntime.diskGb)&&
  Objects.equals(this.vcpus, objVIMgrSEVMRuntime.vcpus)&&
  Objects.equals(this.memoryMb, objVIMgrSEVMRuntime.memoryMb)&&
  Objects.equals(this.cookie, objVIMgrSEVMRuntime.cookie)&&
  Objects.equals(this.vcenterUrl, objVIMgrSEVMRuntime.vcenterUrl)&&
  Objects.equals(this.vcenterRef, objVIMgrSEVMRuntime.vcenterRef)&&
  Objects.equals(this.vcenterInstanceUuid, objVIMgrSEVMRuntime.vcenterInstanceUuid)&&
  Objects.equals(this.tenantRef, objVIMgrSEVMRuntime.tenantRef)&&
  Objects.equals(this.cloudRef, objVIMgrSEVMRuntime.cloudRef)&&
  Objects.equals(this.gcpSeProjectId, objVIMgrSEVMRuntime.gcpSeProjectId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VIMgrSEVMRuntime {\n");
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
        sb.append("    gcpSeProjectId: ").append(toIndentedString(gcpSeProjectId)).append("\n");
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
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vcenterDatacenterUuid: ").append(toIndentedString(vcenterDatacenterUuid)).append("\n");
        sb.append("    vcenterInstanceUuid: ").append(toIndentedString(vcenterInstanceUuid)).append("\n");
        sb.append("    vcenterRef: ").append(toIndentedString(vcenterRef)).append("\n");
        sb.append("    vcenterRmCookie: ").append(toIndentedString(vcenterRmCookie)).append("\n");
        sb.append("    vcenterSeType: ").append(toIndentedString(vcenterSeType)).append("\n");
        sb.append("    vcenterTemplateVm: ").append(toIndentedString(vcenterTemplateVm)).append("\n");
        sb.append("    vcenterUrl: ").append(toIndentedString(vcenterUrl)).append("\n");
        sb.append("    vcenterVappname: ").append(toIndentedString(vcenterVappname)).append("\n");
        sb.append("    vcenterVappvendor: ").append(toIndentedString(vcenterVappvendor)).append("\n");
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

