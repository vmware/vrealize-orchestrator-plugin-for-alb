package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.VIMgrInterestedEntity;
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
 * VIMgrDCRuntime
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIMgrDCRuntime")
@VsoFinder(name = Constants.FINDER_VRO_VIMGRDCRUNTIME, idAccessor = "getObjectID()")
@Service
public class VIMgrDCRuntime extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("cluster_refs")
  @Valid
  private List<String> clusterRefs = null;

  @JsonProperty("host_refs")
  @Valid
  private List<String> hostRefs = null;

  @JsonProperty("interested_hosts")
  @Valid
  private List<VIMgrInterestedEntity> interestedHosts = null;

  @JsonProperty("interested_nws")
  @Valid
  private List<VIMgrInterestedEntity> interestedNws = null;

  @JsonProperty("interested_vms")
  @Valid
  private List<VIMgrInterestedEntity> interestedVms = null;

  @JsonProperty("inventory_state")
  private Integer inventoryState = null;

  @JsonProperty("managed_object_id")
  private String managedObjectId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nw_refs")
  @Valid
  private List<String> nwRefs = null;

  @JsonProperty("pending_vcenter_reqs")
  private Integer pendingVcenterReqs = null;

  @JsonProperty("sevm_refs")
  @Valid
  private List<String> sevmRefs = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vcenter_uuid")
  private String vcenterUuid = null;

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

  
  public VIMgrDCRuntime addClusterRefsItem(String clusterRefsItem) {
    if (this.clusterRefs == null) {
      this.clusterRefs = new ArrayList<String>();
    }
    this.clusterRefs.add(clusterRefsItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type VIMgrClusterRuntime.
   * @return clusterRefs
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VIMgrClusterRuntime.")


 
  @VsoMethod  
  public List<String> getClusterRefs() {
    return clusterRefs;
  }
    
  @VsoMethod
  public void setClusterRefs(List<String> clusterRefs) {
    this.clusterRefs = clusterRefs;
  }

  
  public VIMgrDCRuntime addHostRefsItem(String hostRefsItem) {
    if (this.hostRefs == null) {
      this.hostRefs = new ArrayList<String>();
    }
    this.hostRefs.add(hostRefsItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type VIMgrHostRuntime.
   * @return hostRefs
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VIMgrHostRuntime.")


 
  @VsoMethod  
  public List<String> getHostRefs() {
    return hostRefs;
  }
    
  @VsoMethod
  public void setHostRefs(List<String> hostRefs) {
    this.hostRefs = hostRefs;
  }

  
  public VIMgrDCRuntime addInterestedHostsItem(VIMgrInterestedEntity interestedHostsItem) {
    if (this.interestedHosts == null) {
      this.interestedHosts = new ArrayList<VIMgrInterestedEntity>();
    }
    this.interestedHosts.add(interestedHostsItem);
    return this;
  }
  
  /**
   * Placeholder for description of property interested_hosts of obj type VIMgrDCRuntime field type str  type object
   * @return interestedHosts
  **/
  @ApiModelProperty(value = "Placeholder for description of property interested_hosts of obj type VIMgrDCRuntime field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<VIMgrInterestedEntity> getInterestedHosts() {
    return interestedHosts;
  }
    
  @VsoMethod
  public void setInterestedHosts(List<VIMgrInterestedEntity> interestedHosts) {
    this.interestedHosts = interestedHosts;
  }

  
  public VIMgrDCRuntime addInterestedNwsItem(VIMgrInterestedEntity interestedNwsItem) {
    if (this.interestedNws == null) {
      this.interestedNws = new ArrayList<VIMgrInterestedEntity>();
    }
    this.interestedNws.add(interestedNwsItem);
    return this;
  }
  
  /**
   * Placeholder for description of property interested_nws of obj type VIMgrDCRuntime field type str  type object
   * @return interestedNws
  **/
  @ApiModelProperty(value = "Placeholder for description of property interested_nws of obj type VIMgrDCRuntime field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<VIMgrInterestedEntity> getInterestedNws() {
    return interestedNws;
  }
    
  @VsoMethod
  public void setInterestedNws(List<VIMgrInterestedEntity> interestedNws) {
    this.interestedNws = interestedNws;
  }

  
  public VIMgrDCRuntime addInterestedVmsItem(VIMgrInterestedEntity interestedVmsItem) {
    if (this.interestedVms == null) {
      this.interestedVms = new ArrayList<VIMgrInterestedEntity>();
    }
    this.interestedVms.add(interestedVmsItem);
    return this;
  }
  
  /**
   * Placeholder for description of property interested_vms of obj type VIMgrDCRuntime field type str  type object
   * @return interestedVms
  **/
  @ApiModelProperty(value = "Placeholder for description of property interested_vms of obj type VIMgrDCRuntime field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<VIMgrInterestedEntity> getInterestedVms() {
    return interestedVms;
  }
    
  @VsoMethod
  public void setInterestedVms(List<VIMgrInterestedEntity> interestedVms) {
    this.interestedVms = interestedVms;
  }

  
  /**
   * Number of inventory_state.
   * @return inventoryState
  **/
  @ApiModelProperty(value = "Number of inventory_state.")


 
  @VsoMethod  
  public Integer getInventoryState() {
    return inventoryState;
  }
    
  @VsoMethod
  public void setInventoryState(Integer inventoryState) {
    this.inventoryState = inventoryState;
  }

  
  /**
   * managed_object_id of VIMgrDCRuntime.
   * @return managedObjectId
  **/
  @ApiModelProperty(required = true, value = "managed_object_id of VIMgrDCRuntime.")
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

  
  public VIMgrDCRuntime addNwRefsItem(String nwRefsItem) {
    if (this.nwRefs == null) {
      this.nwRefs = new ArrayList<String>();
    }
    this.nwRefs.add(nwRefsItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type VIMgrNWRuntime.
   * @return nwRefs
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VIMgrNWRuntime.")


 
  @VsoMethod  
  public List<String> getNwRefs() {
    return nwRefs;
  }
    
  @VsoMethod
  public void setNwRefs(List<String> nwRefs) {
    this.nwRefs = nwRefs;
  }

  
  /**
   * Number of pending_vcenter_reqs.
   * @return pendingVcenterReqs
  **/
  @ApiModelProperty(value = "Number of pending_vcenter_reqs.")


 
  @VsoMethod  
  public Integer getPendingVcenterReqs() {
    return pendingVcenterReqs;
  }
    
  @VsoMethod
  public void setPendingVcenterReqs(Integer pendingVcenterReqs) {
    this.pendingVcenterReqs = pendingVcenterReqs;
  }

  
  public VIMgrDCRuntime addSevmRefsItem(String sevmRefsItem) {
    if (this.sevmRefs == null) {
      this.sevmRefs = new ArrayList<String>();
    }
    this.sevmRefs.add(sevmRefsItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type VIMgrSEVMRuntime.
   * @return sevmRefs
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VIMgrSEVMRuntime.")


 
  @VsoMethod  
  public List<String> getSevmRefs() {
    return sevmRefs;
  }
    
  @VsoMethod
  public void setSevmRefs(List<String> sevmRefs) {
    this.sevmRefs = sevmRefs;
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
   * Unique object identifier of vcenter.
   * @return vcenterUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of vcenter.")


 
  @VsoMethod  
  public String getVcenterUuid() {
    return vcenterUuid;
  }
    
  @VsoMethod
  public void setVcenterUuid(String vcenterUuid) {
    this.vcenterUuid = vcenterUuid;
  }

  
  public VIMgrDCRuntime addVmRefsItem(String vmRefsItem) {
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
		return "VIMgrDCRuntime";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIMgrDCRuntime viMgrDCRuntime = (VIMgrDCRuntime) o;
    return Objects.equals(this.lastModified, viMgrDCRuntime.lastModified) &&
        Objects.equals(this.cloudRef, viMgrDCRuntime.cloudRef) &&
        Objects.equals(this.clusterRefs, viMgrDCRuntime.clusterRefs) &&
        Objects.equals(this.hostRefs, viMgrDCRuntime.hostRefs) &&
        Objects.equals(this.interestedHosts, viMgrDCRuntime.interestedHosts) &&
        Objects.equals(this.interestedNws, viMgrDCRuntime.interestedNws) &&
        Objects.equals(this.interestedVms, viMgrDCRuntime.interestedVms) &&
        Objects.equals(this.inventoryState, viMgrDCRuntime.inventoryState) &&
        Objects.equals(this.managedObjectId, viMgrDCRuntime.managedObjectId) &&
        Objects.equals(this.name, viMgrDCRuntime.name) &&
        Objects.equals(this.nwRefs, viMgrDCRuntime.nwRefs) &&
        Objects.equals(this.pendingVcenterReqs, viMgrDCRuntime.pendingVcenterReqs) &&
        Objects.equals(this.sevmRefs, viMgrDCRuntime.sevmRefs) &&
        Objects.equals(this.tenantRef, viMgrDCRuntime.tenantRef) &&
        Objects.equals(this.type, viMgrDCRuntime.type) &&
        Objects.equals(this.url, viMgrDCRuntime.url) &&
        Objects.equals(this.uuid, viMgrDCRuntime.uuid) &&
        Objects.equals(this.vcenterUuid, viMgrDCRuntime.vcenterUuid) &&
        Objects.equals(this.vmRefs, viMgrDCRuntime.vmRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, cloudRef, clusterRefs, hostRefs, interestedHosts, interestedNws, interestedVms, inventoryState, managedObjectId, name, nwRefs, pendingVcenterReqs, sevmRefs, tenantRef, type, url, uuid, vcenterUuid, vmRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIMgrDCRuntime {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    clusterRefs: ").append(toIndentedString(clusterRefs)).append("\n");
    sb.append("    hostRefs: ").append(toIndentedString(hostRefs)).append("\n");
    sb.append("    interestedHosts: ").append(toIndentedString(interestedHosts)).append("\n");
    sb.append("    interestedNws: ").append(toIndentedString(interestedNws)).append("\n");
    sb.append("    interestedVms: ").append(toIndentedString(interestedVms)).append("\n");
    sb.append("    inventoryState: ").append(toIndentedString(inventoryState)).append("\n");
    sb.append("    managedObjectId: ").append(toIndentedString(managedObjectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nwRefs: ").append(toIndentedString(nwRefs)).append("\n");
    sb.append("    pendingVcenterReqs: ").append(toIndentedString(pendingVcenterReqs)).append("\n");
    sb.append("    sevmRefs: ").append(toIndentedString(sevmRefs)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vcenterUuid: ").append(toIndentedString(vcenterUuid)).append("\n");
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

