package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VIMgrVMRuntime is a POJO class extends AviRestResource that used for creating
 * VIMgrVMRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VIMgrVMRuntime")
@VsoFinder(name = Constants.FINDER_VRO_VIMGRVMRUNTIME, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VIMgrVMRuntime extends AviRestResource {
    @JsonProperty("availability_zone")
    @JsonInclude(Include.NON_NULL)
    private String availabilityZone = null;

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

    @JsonProperty("controller_vm")
    @JsonInclude(Include.NON_NULL)
    private Boolean controllerVm = null;

    @JsonProperty("cpu_reservation")
    @JsonInclude(Include.NON_NULL)
    private Integer cpuReservation = null;

    @JsonProperty("cpu_shares")
    @JsonInclude(Include.NON_NULL)
    private Integer cpuShares = null;

    @JsonProperty("creation_in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean creationInProgress = null;

    @JsonProperty("guest_nic")
    @JsonInclude(Include.NON_NULL)
    private List<VIMgrGuestNicRuntime> guestNic = null;

    @JsonProperty("host")
    @JsonInclude(Include.NON_NULL)
    private String host = null;

    @JsonProperty("init_vnics")
    @JsonInclude(Include.NON_NULL)
    private Integer initVnics = null;

    @JsonProperty("managed_object_id")
    @JsonInclude(Include.NON_NULL)
    private String managedObjectId = null;

    @JsonProperty("mem_shares")
    @JsonInclude(Include.NON_NULL)
    private Integer memShares = null;

    @JsonProperty("memory")
    @JsonInclude(Include.NON_NULL)
    private Integer memory = null;

    @JsonProperty("memory_reservation")
    @JsonInclude(Include.NON_NULL)
    private Integer memoryReservation = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("num_cpu")
    @JsonInclude(Include.NON_NULL)
    private Integer numCpu = null;

    @JsonProperty("ovf_avisetype_field")
    @JsonInclude(Include.NON_NULL)
    private String ovfAvisetypeField = null;

    @JsonProperty("powerstate")
    @JsonInclude(Include.NON_NULL)
    private String powerstate = null;

    @JsonProperty("se_ver")
    @JsonInclude(Include.NON_NULL)
    private Integer seVer = 1;

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

    @JsonProperty("vcenter_rm_cookie")
    @JsonInclude(Include.NON_NULL)
    private String vcenterRmCookie = null;

    @JsonProperty("vcenter_se_type")
    @JsonInclude(Include.NON_NULL)
    private String vcenterSeType = null;

    @JsonProperty("vcenter_template_vm")
    @JsonInclude(Include.NON_NULL)
    private Boolean vcenterTemplateVm = null;

    @JsonProperty("vcenter_vAppName")
    @JsonInclude(Include.NON_NULL)
    private String vcenterVappname = null;

    @JsonProperty("vcenter_vAppVendor")
    @JsonInclude(Include.NON_NULL)
    private String vcenterVappvendor = null;

    @JsonProperty("vcenter_vm_type")
    @JsonInclude(Include.NON_NULL)
    private String vcenterVmType = null;

    @JsonProperty("vcenter_vnic_discovered")
    @JsonInclude(Include.NON_NULL)
    private Boolean vcenterVnicDiscovered = null;

    @JsonProperty("vm_lb_weight")
    @JsonInclude(Include.NON_NULL)
    private Integer vmLbWeight = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property availability_zone of obj type vimgrvmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return availabilityZone
   */
  @VsoMethod
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property availability_zone of obj type vimgrvmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param availabilityZone set the availabilityZone.
   */
  @VsoMethod
  public void setAvailabilityZone(String  availabilityZone) {
    this.availabilityZone = availabilityZone;
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
   * Placeholder for description of property connection_state of obj type vimgrvmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return connectionState
   */
  @VsoMethod
  public String getConnectionState() {
    return connectionState;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property connection_state of obj type vimgrvmruntime field type str  type string.
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
   * Placeholder for description of property controller_ip_addr of obj type vimgrvmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerIpAddr
   */
  @VsoMethod
  public String getControllerIpAddr() {
    return controllerIpAddr;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property controller_ip_addr of obj type vimgrvmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerIpAddr set the controllerIpAddr.
   */
  @VsoMethod
  public void setControllerIpAddr(String  controllerIpAddr) {
    this.controllerIpAddr = controllerIpAddr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property controller_vm of obj type vimgrvmruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerVm
   */
  @VsoMethod
  public Boolean getControllerVm() {
    return controllerVm;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property controller_vm of obj type vimgrvmruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerVm set the controllerVm.
   */
  @VsoMethod
  public void setControllerVm(Boolean  controllerVm) {
    this.controllerVm = controllerVm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cpu_reservation of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cpuReservation
   */
  @VsoMethod
  public Integer getCpuReservation() {
    return cpuReservation;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cpu_reservation of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cpuReservation set the cpuReservation.
   */
  @VsoMethod
  public void setCpuReservation(Integer  cpuReservation) {
    this.cpuReservation = cpuReservation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cpu_shares of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cpuShares
   */
  @VsoMethod
  public Integer getCpuShares() {
    return cpuShares;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cpu_shares of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cpuShares set the cpuShares.
   */
  @VsoMethod
  public void setCpuShares(Integer  cpuShares) {
    this.cpuShares = cpuShares;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property creation_in_progress of obj type vimgrvmruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return creationInProgress
   */
  @VsoMethod
  public Boolean getCreationInProgress() {
    return creationInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property creation_in_progress of obj type vimgrvmruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param creationInProgress set the creationInProgress.
   */
  @VsoMethod
  public void setCreationInProgress(Boolean  creationInProgress) {
    this.creationInProgress = creationInProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property guest_nic of obj type vimgrvmruntime field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return guestNic
   */
  @VsoMethod
  public List<VIMgrGuestNicRuntime> getGuestNic() {
    return guestNic;
  }

  /**
   * This is the setter method. this will set the guestNic
   * Placeholder for description of property guest_nic of obj type vimgrvmruntime field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return guestNic
   */
  @VsoMethod
  public void setGuestNic(List<VIMgrGuestNicRuntime>  guestNic) {
    this.guestNic = guestNic;
  }

  /**
   * This is the setter method this will set the guestNic
   * Placeholder for description of property guest_nic of obj type vimgrvmruntime field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return guestNic
   */
  @VsoMethod
  public VIMgrVMRuntime addGuestNicItem(VIMgrGuestNicRuntime guestNicItem) {
    if (this.guestNic == null) {
      this.guestNic = new ArrayList<VIMgrGuestNicRuntime>();
    }
    this.guestNic.add(guestNicItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property host of obj type vimgrvmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return host
   */
  @VsoMethod
  public String getHost() {
    return host;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property host of obj type vimgrvmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param host set the host.
   */
  @VsoMethod
  public void setHost(String  host) {
    this.host = host;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property init_vnics of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return initVnics
   */
  @VsoMethod
  public Integer getInitVnics() {
    return initVnics;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property init_vnics of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param initVnics set the initVnics.
   */
  @VsoMethod
  public void setInitVnics(Integer  initVnics) {
    this.initVnics = initVnics;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property managed_object_id of obj type vimgrvmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return managedObjectId
   */
  @VsoMethod
  public String getManagedObjectId() {
    return managedObjectId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property managed_object_id of obj type vimgrvmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param managedObjectId set the managedObjectId.
   */
  @VsoMethod
  public void setManagedObjectId(String  managedObjectId) {
    this.managedObjectId = managedObjectId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property mem_shares of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return memShares
   */
  @VsoMethod
  public Integer getMemShares() {
    return memShares;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property mem_shares of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param memShares set the memShares.
   */
  @VsoMethod
  public void setMemShares(Integer  memShares) {
    this.memShares = memShares;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property memory of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return memory
   */
  @VsoMethod
  public Integer getMemory() {
    return memory;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property memory of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param memory set the memory.
   */
  @VsoMethod
  public void setMemory(Integer  memory) {
    this.memory = memory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property memory_reservation of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return memoryReservation
   */
  @VsoMethod
  public Integer getMemoryReservation() {
    return memoryReservation;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property memory_reservation of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param memoryReservation set the memoryReservation.
   */
  @VsoMethod
  public void setMemoryReservation(Integer  memoryReservation) {
    this.memoryReservation = memoryReservation;
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
   * Placeholder for description of property num_cpu of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numCpu
   */
  @VsoMethod
  public Integer getNumCpu() {
    return numCpu;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_cpu of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numCpu set the numCpu.
   */
  @VsoMethod
  public void setNumCpu(Integer  numCpu) {
    this.numCpu = numCpu;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1,17.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ovfAvisetypeField
   */
  @VsoMethod
  public String getOvfAvisetypeField() {
    return ovfAvisetypeField;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1,17.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ovfAvisetypeField set the ovfAvisetypeField.
   */
  @VsoMethod
  public void setOvfAvisetypeField(String  ovfAvisetypeField) {
    this.ovfAvisetypeField = ovfAvisetypeField;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property powerstate of obj type vimgrvmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return powerstate
   */
  @VsoMethod
  public String getPowerstate() {
    return powerstate;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property powerstate of obj type vimgrvmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param powerstate set the powerstate.
   */
  @VsoMethod
  public void setPowerstate(String  powerstate) {
    this.powerstate = powerstate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_ver of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return seVer
   */
  @VsoMethod
  public Integer getSeVer() {
    return seVer;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property se_ver of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param seVer set the seVer.
   */
  @VsoMethod
  public void setSeVer(Integer  seVer) {
    this.seVer = seVer;
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
   * Placeholder for description of property vcenter_rm_cookie of obj type vimgrvmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterRmCookie
   */
  @VsoMethod
  public String getVcenterRmCookie() {
    return vcenterRmCookie;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_rm_cookie of obj type vimgrvmruntime field type str  type string.
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
   * Placeholder for description of property vcenter_template_vm of obj type vimgrvmruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterTemplateVm
   */
  @VsoMethod
  public Boolean getVcenterTemplateVm() {
    return vcenterTemplateVm;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_template_vm of obj type vimgrvmruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterTemplateVm set the vcenterTemplateVm.
   */
  @VsoMethod
  public void setVcenterTemplateVm(Boolean  vcenterTemplateVm) {
    this.vcenterTemplateVm = vcenterTemplateVm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_vappname of obj type vimgrvmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterVappname
   */
  @VsoMethod
  public String getVcenterVappname() {
    return vcenterVappname;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_vappname of obj type vimgrvmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterVappname set the vcenterVappname.
   */
  @VsoMethod
  public void setVcenterVappname(String  vcenterVappname) {
    this.vcenterVappname = vcenterVappname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_vappvendor of obj type vimgrvmruntime field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterVappvendor
   */
  @VsoMethod
  public String getVcenterVappvendor() {
    return vcenterVappvendor;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_vappvendor of obj type vimgrvmruntime field type str  type string.
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
   * Placeholder for description of property vcenter_vnic_discovered of obj type vimgrvmruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterVnicDiscovered
   */
  @VsoMethod
  public Boolean getVcenterVnicDiscovered() {
    return vcenterVnicDiscovered;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_vnic_discovered of obj type vimgrvmruntime field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterVnicDiscovered set the vcenterVnicDiscovered.
   */
  @VsoMethod
  public void setVcenterVnicDiscovered(Boolean  vcenterVnicDiscovered) {
    this.vcenterVnicDiscovered = vcenterVnicDiscovered;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vm_lb_weight of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vmLbWeight
   */
  @VsoMethod
  public Integer getVmLbWeight() {
    return vmLbWeight;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vm_lb_weight of obj type vimgrvmruntime field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vmLbWeight set the vmLbWeight.
   */
  @VsoMethod
  public void setVmLbWeight(Integer  vmLbWeight) {
    this.vmLbWeight = vmLbWeight;
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
  VIMgrVMRuntime objVIMgrVMRuntime = (VIMgrVMRuntime) o;
  return   Objects.equals(this.type, objVIMgrVMRuntime.type)&&
  Objects.equals(this.uuid, objVIMgrVMRuntime.uuid)&&
  Objects.equals(this.name, objVIMgrVMRuntime.name)&&
  Objects.equals(this.managedObjectId, objVIMgrVMRuntime.managedObjectId)&&
  Objects.equals(this.host, objVIMgrVMRuntime.host)&&
  Objects.equals(this.powerstate, objVIMgrVMRuntime.powerstate)&&
  Objects.equals(this.connectionState, objVIMgrVMRuntime.connectionState)&&
  Objects.equals(this.vcenterDatacenterUuid, objVIMgrVMRuntime.vcenterDatacenterUuid)&&
  Objects.equals(this.vcenterVmType, objVIMgrVMRuntime.vcenterVmType)&&
  Objects.equals(this.vcenterVnicDiscovered, objVIMgrVMRuntime.vcenterVnicDiscovered)&&
  Objects.equals(this.vcenterVappname, objVIMgrVMRuntime.vcenterVappname)&&
  Objects.equals(this.vcenterVappvendor, objVIMgrVMRuntime.vcenterVappvendor)&&
  Objects.equals(this.vcenterTemplateVm, objVIMgrVMRuntime.vcenterTemplateVm)&&
  Objects.equals(this.vcenterSeType, objVIMgrVMRuntime.vcenterSeType)&&
  Objects.equals(this.creationInProgress, objVIMgrVMRuntime.creationInProgress)&&
  Objects.equals(this.vcenterRmCookie, objVIMgrVMRuntime.vcenterRmCookie)&&
  Objects.equals(this.numCpu, objVIMgrVMRuntime.numCpu)&&
  Objects.equals(this.cpuShares, objVIMgrVMRuntime.cpuShares)&&
  Objects.equals(this.cpuReservation, objVIMgrVMRuntime.cpuReservation)&&
  Objects.equals(this.memory, objVIMgrVMRuntime.memory)&&
  Objects.equals(this.memShares, objVIMgrVMRuntime.memShares)&&
  Objects.equals(this.memoryReservation, objVIMgrVMRuntime.memoryReservation)&&
  Objects.equals(this.vmLbWeight, objVIMgrVMRuntime.vmLbWeight)&&
  Objects.equals(this.controllerIpAddr, objVIMgrVMRuntime.controllerIpAddr)&&
  Objects.equals(this.guestNic, objVIMgrVMRuntime.guestNic)&&
  Objects.equals(this.controllerVm, objVIMgrVMRuntime.controllerVm)&&
  Objects.equals(this.seVer, objVIMgrVMRuntime.seVer)&&
  Objects.equals(this.initVnics, objVIMgrVMRuntime.initVnics)&&
  Objects.equals(this.controllerClusterUuid, objVIMgrVMRuntime.controllerClusterUuid)&&
  Objects.equals(this.availabilityZone, objVIMgrVMRuntime.availabilityZone)&&
  Objects.equals(this.ovfAvisetypeField, objVIMgrVMRuntime.ovfAvisetypeField)&&
  Objects.equals(this.tenantRef, objVIMgrVMRuntime.tenantRef)&&
  Objects.equals(this.cloudRef, objVIMgrVMRuntime.cloudRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VIMgrVMRuntime {\n");
      sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
        sb.append("    connectionState: ").append(toIndentedString(connectionState)).append("\n");
        sb.append("    controllerClusterUuid: ").append(toIndentedString(controllerClusterUuid)).append("\n");
        sb.append("    controllerIpAddr: ").append(toIndentedString(controllerIpAddr)).append("\n");
        sb.append("    controllerVm: ").append(toIndentedString(controllerVm)).append("\n");
        sb.append("    cpuReservation: ").append(toIndentedString(cpuReservation)).append("\n");
        sb.append("    cpuShares: ").append(toIndentedString(cpuShares)).append("\n");
        sb.append("    creationInProgress: ").append(toIndentedString(creationInProgress)).append("\n");
        sb.append("    guestNic: ").append(toIndentedString(guestNic)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    initVnics: ").append(toIndentedString(initVnics)).append("\n");
        sb.append("    managedObjectId: ").append(toIndentedString(managedObjectId)).append("\n");
        sb.append("    memShares: ").append(toIndentedString(memShares)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    memoryReservation: ").append(toIndentedString(memoryReservation)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    numCpu: ").append(toIndentedString(numCpu)).append("\n");
        sb.append("    ovfAvisetypeField: ").append(toIndentedString(ovfAvisetypeField)).append("\n");
        sb.append("    powerstate: ").append(toIndentedString(powerstate)).append("\n");
        sb.append("    seVer: ").append(toIndentedString(seVer)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vcenterDatacenterUuid: ").append(toIndentedString(vcenterDatacenterUuid)).append("\n");
        sb.append("    vcenterRmCookie: ").append(toIndentedString(vcenterRmCookie)).append("\n");
        sb.append("    vcenterSeType: ").append(toIndentedString(vcenterSeType)).append("\n");
        sb.append("    vcenterTemplateVm: ").append(toIndentedString(vcenterTemplateVm)).append("\n");
        sb.append("    vcenterVappname: ").append(toIndentedString(vcenterVappname)).append("\n");
        sb.append("    vcenterVappvendor: ").append(toIndentedString(vcenterVappvendor)).append("\n");
        sb.append("    vcenterVmType: ").append(toIndentedString(vcenterVmType)).append("\n");
        sb.append("    vcenterVnicDiscovered: ").append(toIndentedString(vcenterVnicDiscovered)).append("\n");
        sb.append("    vmLbWeight: ").append(toIndentedString(vmLbWeight)).append("\n");
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

