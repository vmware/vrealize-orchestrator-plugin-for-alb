package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * VIMgrVMRuntime
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIMgrVMRuntime")
@VsoFinder(name = Constants.FINDER_VRO_VIMGRVMRUNTIME, idAccessor = "getObjectID()")
@Service
public class VIMgrVMRuntime extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("availability_zone")
  private String availabilityZone = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("connection_state")
  private String connectionState = null;

  @JsonProperty("controller_cluster_uuid")
  private String controllerClusterUuid = null;

  @JsonProperty("controller_ip_addr")
  private String controllerIpAddr = null;

  @JsonProperty("controller_vm")
  private Boolean controllerVm = null;

  @JsonProperty("cpu_reservation")
  private Long cpuReservation = null;

  @JsonProperty("cpu_shares")
  private Integer cpuShares = null;

  @JsonProperty("creation_in_progress")
  private Boolean creationInProgress = null;

  @JsonProperty("guest_nic")
  @Valid
  private List<VIMgrGuestNicRuntime> guestNic = null;

  @JsonProperty("host")
  private String host = null;

  @JsonProperty("init_vnics")
  private Integer initVnics = null;

  @JsonProperty("managed_object_id")
  private String managedObjectId = null;

  @JsonProperty("mem_shares")
  private Integer memShares = null;

  @JsonProperty("memory")
  private Long memory = null;

  @JsonProperty("memory_reservation")
  private Long memoryReservation = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("num_cpu")
  private Integer numCpu = null;

  @JsonProperty("ovf_avisetype_field")
  private String ovfAvisetypeField = null;

  @JsonProperty("powerstate")
  private String powerstate = null;

  @JsonProperty("se_ver")
  private Integer seVer = 1;

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

  @JsonProperty("vcenter_vnic_discovered")
  private Boolean vcenterVnicDiscovered = null;

  @JsonProperty("vm_lb_weight")
  private Integer vmLbWeight = null;

  
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
   * availability_zone of VIMgrVMRuntime.
   * @return availabilityZone
  **/
  @ApiModelProperty(value = "availability_zone of VIMgrVMRuntime.")


 
  @VsoMethod  
  public String getAvailabilityZone() {
    return availabilityZone;
  }
    
  @VsoMethod
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
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
   * connection_state of VIMgrVMRuntime.
   * @return connectionState
  **/
  @ApiModelProperty(value = "connection_state of VIMgrVMRuntime.")


 
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
   * controller_ip_addr of VIMgrVMRuntime.
   * @return controllerIpAddr
  **/
  @ApiModelProperty(value = "controller_ip_addr of VIMgrVMRuntime.")


 
  @VsoMethod  
  public String getControllerIpAddr() {
    return controllerIpAddr;
  }
    
  @VsoMethod
  public void setControllerIpAddr(String controllerIpAddr) {
    this.controllerIpAddr = controllerIpAddr;
  }

  
  /**
   * Placeholder for description of property controller_vm of obj type VIMgrVMRuntime field type str  type boolean
   * @return controllerVm
  **/
  @ApiModelProperty(value = "Placeholder for description of property controller_vm of obj type VIMgrVMRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isControllerVm() {
    return controllerVm;
  }
    
  @VsoMethod
  public void setControllerVm(Boolean controllerVm) {
    this.controllerVm = controllerVm;
  }

  
  /**
   * Number of cpu_reservation.
   * @return cpuReservation
  **/
  @ApiModelProperty(value = "Number of cpu_reservation.")


 
  @VsoMethod  
  public Long getCpuReservation() {
    return cpuReservation;
  }
    
  @VsoMethod
  public void setCpuReservation(Long cpuReservation) {
    this.cpuReservation = cpuReservation;
  }

  
  /**
   * Number of cpu_shares.
   * @return cpuShares
  **/
  @ApiModelProperty(value = "Number of cpu_shares.")


 
  @VsoMethod  
  public Integer getCpuShares() {
    return cpuShares;
  }
    
  @VsoMethod
  public void setCpuShares(Integer cpuShares) {
    this.cpuShares = cpuShares;
  }

  
  /**
   * Placeholder for description of property creation_in_progress of obj type VIMgrVMRuntime field type str  type boolean
   * @return creationInProgress
  **/
  @ApiModelProperty(value = "Placeholder for description of property creation_in_progress of obj type VIMgrVMRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isCreationInProgress() {
    return creationInProgress;
  }
    
  @VsoMethod
  public void setCreationInProgress(Boolean creationInProgress) {
    this.creationInProgress = creationInProgress;
  }

  
  public VIMgrVMRuntime addGuestNicItem(VIMgrGuestNicRuntime guestNicItem) {
    if (this.guestNic == null) {
      this.guestNic = new ArrayList<VIMgrGuestNicRuntime>();
    }
    this.guestNic.add(guestNicItem);
    return this;
  }
  
  /**
   * Placeholder for description of property guest_nic of obj type VIMgrVMRuntime field type str  type object
   * @return guestNic
  **/
  @ApiModelProperty(value = "Placeholder for description of property guest_nic of obj type VIMgrVMRuntime field type str  type object")

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
   * host of VIMgrVMRuntime.
   * @return host
  **/
  @ApiModelProperty(value = "host of VIMgrVMRuntime.")


 
  @VsoMethod  
  public String getHost() {
    return host;
  }
    
  @VsoMethod
  public void setHost(String host) {
    this.host = host;
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
   * managed_object_id of VIMgrVMRuntime.
   * @return managedObjectId
  **/
  @ApiModelProperty(required = true, value = "managed_object_id of VIMgrVMRuntime.")
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
   * Number of mem_shares.
   * @return memShares
  **/
  @ApiModelProperty(value = "Number of mem_shares.")


 
  @VsoMethod  
  public Integer getMemShares() {
    return memShares;
  }
    
  @VsoMethod
  public void setMemShares(Integer memShares) {
    this.memShares = memShares;
  }

  
  /**
   * Number of memory.
   * @return memory
  **/
  @ApiModelProperty(value = "Number of memory.")


 
  @VsoMethod  
  public Long getMemory() {
    return memory;
  }
    
  @VsoMethod
  public void setMemory(Long memory) {
    this.memory = memory;
  }

  
  /**
   * Number of memory_reservation.
   * @return memoryReservation
  **/
  @ApiModelProperty(value = "Number of memory_reservation.")


 
  @VsoMethod  
  public Long getMemoryReservation() {
    return memoryReservation;
  }
    
  @VsoMethod
  public void setMemoryReservation(Long memoryReservation) {
    this.memoryReservation = memoryReservation;
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
   * Number of num_cpu.
   * @return numCpu
  **/
  @ApiModelProperty(value = "Number of num_cpu.")


 
  @VsoMethod  
  public Integer getNumCpu() {
    return numCpu;
  }
    
  @VsoMethod
  public void setNumCpu(Integer numCpu) {
    this.numCpu = numCpu;
  }

  
  /**
   *  Field introduced in 17.1.1,17.1.3.
   * @return ovfAvisetypeField
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1,17.1.3.")


 
  @VsoMethod  
  public String getOvfAvisetypeField() {
    return ovfAvisetypeField;
  }
    
  @VsoMethod
  public void setOvfAvisetypeField(String ovfAvisetypeField) {
    this.ovfAvisetypeField = ovfAvisetypeField;
  }

  
  /**
   * powerstate of VIMgrVMRuntime.
   * @return powerstate
  **/
  @ApiModelProperty(value = "powerstate of VIMgrVMRuntime.")


 
  @VsoMethod  
  public String getPowerstate() {
    return powerstate;
  }
    
  @VsoMethod
  public void setPowerstate(String powerstate) {
    this.powerstate = powerstate;
  }

  
  /**
   * Number of se_ver.
   * @return seVer
  **/
  @ApiModelProperty(value = "Number of se_ver.")


 
  @VsoMethod  
  public Integer getSeVer() {
    return seVer;
  }
    
  @VsoMethod
  public void setSeVer(Integer seVer) {
    this.seVer = seVer;
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
   * vcenter_rm_cookie of VIMgrVMRuntime.
   * @return vcenterRmCookie
  **/
  @ApiModelProperty(value = "vcenter_rm_cookie of VIMgrVMRuntime.")


 
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
   * Placeholder for description of property vcenter_template_vm of obj type VIMgrVMRuntime field type str  type boolean
   * @return vcenterTemplateVm
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_template_vm of obj type VIMgrVMRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isVcenterTemplateVm() {
    return vcenterTemplateVm;
  }
    
  @VsoMethod
  public void setVcenterTemplateVm(Boolean vcenterTemplateVm) {
    this.vcenterTemplateVm = vcenterTemplateVm;
  }

  
  /**
   * vcenter_vAppName of VIMgrVMRuntime.
   * @return vcenterVAppName
  **/
  @ApiModelProperty(value = "vcenter_vAppName of VIMgrVMRuntime.")


 
  @VsoMethod  
  public String getVcenterVAppName() {
    return vcenterVAppName;
  }
    
  @VsoMethod
  public void setVcenterVAppName(String vcenterVAppName) {
    this.vcenterVAppName = vcenterVAppName;
  }

  
  /**
   * vcenter_vAppVendor of VIMgrVMRuntime.
   * @return vcenterVAppVendor
  **/
  @ApiModelProperty(value = "vcenter_vAppVendor of VIMgrVMRuntime.")


 
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
   * Placeholder for description of property vcenter_vnic_discovered of obj type VIMgrVMRuntime field type str  type boolean
   * @return vcenterVnicDiscovered
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_vnic_discovered of obj type VIMgrVMRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isVcenterVnicDiscovered() {
    return vcenterVnicDiscovered;
  }
    
  @VsoMethod
  public void setVcenterVnicDiscovered(Boolean vcenterVnicDiscovered) {
    this.vcenterVnicDiscovered = vcenterVnicDiscovered;
  }

  
  /**
   * Number of vm_lb_weight.
   * @return vmLbWeight
  **/
  @ApiModelProperty(value = "Number of vm_lb_weight.")


 
  @VsoMethod  
  public Integer getVmLbWeight() {
    return vmLbWeight;
  }
    
  @VsoMethod
  public void setVmLbWeight(Integer vmLbWeight) {
    this.vmLbWeight = vmLbWeight;
  }

  
  public String getObjectID() {
		return "VIMgrVMRuntime";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIMgrVMRuntime viMgrVMRuntime = (VIMgrVMRuntime) o;
    return Objects.equals(this.lastModified, viMgrVMRuntime.lastModified) &&
        Objects.equals(this.availabilityZone, viMgrVMRuntime.availabilityZone) &&
        Objects.equals(this.cloudRef, viMgrVMRuntime.cloudRef) &&
        Objects.equals(this.connectionState, viMgrVMRuntime.connectionState) &&
        Objects.equals(this.controllerClusterUuid, viMgrVMRuntime.controllerClusterUuid) &&
        Objects.equals(this.controllerIpAddr, viMgrVMRuntime.controllerIpAddr) &&
        Objects.equals(this.controllerVm, viMgrVMRuntime.controllerVm) &&
        Objects.equals(this.cpuReservation, viMgrVMRuntime.cpuReservation) &&
        Objects.equals(this.cpuShares, viMgrVMRuntime.cpuShares) &&
        Objects.equals(this.creationInProgress, viMgrVMRuntime.creationInProgress) &&
        Objects.equals(this.guestNic, viMgrVMRuntime.guestNic) &&
        Objects.equals(this.host, viMgrVMRuntime.host) &&
        Objects.equals(this.initVnics, viMgrVMRuntime.initVnics) &&
        Objects.equals(this.managedObjectId, viMgrVMRuntime.managedObjectId) &&
        Objects.equals(this.memShares, viMgrVMRuntime.memShares) &&
        Objects.equals(this.memory, viMgrVMRuntime.memory) &&
        Objects.equals(this.memoryReservation, viMgrVMRuntime.memoryReservation) &&
        Objects.equals(this.name, viMgrVMRuntime.name) &&
        Objects.equals(this.numCpu, viMgrVMRuntime.numCpu) &&
        Objects.equals(this.ovfAvisetypeField, viMgrVMRuntime.ovfAvisetypeField) &&
        Objects.equals(this.powerstate, viMgrVMRuntime.powerstate) &&
        Objects.equals(this.seVer, viMgrVMRuntime.seVer) &&
        Objects.equals(this.tenantRef, viMgrVMRuntime.tenantRef) &&
        Objects.equals(this.type, viMgrVMRuntime.type) &&
        Objects.equals(this.url, viMgrVMRuntime.url) &&
        Objects.equals(this.uuid, viMgrVMRuntime.uuid) &&
        Objects.equals(this.vcenterDatacenterUuid, viMgrVMRuntime.vcenterDatacenterUuid) &&
        Objects.equals(this.vcenterRmCookie, viMgrVMRuntime.vcenterRmCookie) &&
        Objects.equals(this.vcenterSeType, viMgrVMRuntime.vcenterSeType) &&
        Objects.equals(this.vcenterTemplateVm, viMgrVMRuntime.vcenterTemplateVm) &&
        Objects.equals(this.vcenterVAppName, viMgrVMRuntime.vcenterVAppName) &&
        Objects.equals(this.vcenterVAppVendor, viMgrVMRuntime.vcenterVAppVendor) &&
        Objects.equals(this.vcenterVmType, viMgrVMRuntime.vcenterVmType) &&
        Objects.equals(this.vcenterVnicDiscovered, viMgrVMRuntime.vcenterVnicDiscovered) &&
        Objects.equals(this.vmLbWeight, viMgrVMRuntime.vmLbWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, availabilityZone, cloudRef, connectionState, controllerClusterUuid, controllerIpAddr, controllerVm, cpuReservation, cpuShares, creationInProgress, guestNic, host, initVnics, managedObjectId, memShares, memory, memoryReservation, name, numCpu, ovfAvisetypeField, powerstate, seVer, tenantRef, type, url, uuid, vcenterDatacenterUuid, vcenterRmCookie, vcenterSeType, vcenterTemplateVm, vcenterVAppName, vcenterVAppVendor, vcenterVmType, vcenterVnicDiscovered, vmLbWeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIMgrVMRuntime {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vcenterDatacenterUuid: ").append(toIndentedString(vcenterDatacenterUuid)).append("\n");
    sb.append("    vcenterRmCookie: ").append(toIndentedString(vcenterRmCookie)).append("\n");
    sb.append("    vcenterSeType: ").append(toIndentedString(vcenterSeType)).append("\n");
    sb.append("    vcenterTemplateVm: ").append(toIndentedString(vcenterTemplateVm)).append("\n");
    sb.append("    vcenterVAppName: ").append(toIndentedString(vcenterVAppName)).append("\n");
    sb.append("    vcenterVAppVendor: ").append(toIndentedString(vcenterVAppVendor)).append("\n");
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

