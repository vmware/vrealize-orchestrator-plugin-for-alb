package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.VIMgrIPSubnetRuntime;
import com.vmware.avi.vro.model.VlanRange;
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
 * VIMgrNWRuntime
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIMgrNWRuntime")
@VsoFinder(name = Constants.FINDER_VRO_VIMGRNWRUNTIME, idAccessor = "getObjectID()")
@Service
public class VIMgrNWRuntime extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("apic_vrf_context")
  private String apicVrfContext = null;

  @JsonProperty("auto_expand")
  private Boolean autoExpand = null;

  @JsonProperty("availability_zone")
  private String availabilityZone = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("datacenter_uuid")
  private String datacenterUuid = null;

  @JsonProperty("dvs")
  private Boolean dvs = null;

  @JsonProperty("host_refs")
  @Valid
  private List<String> hostRefs = null;

  @JsonProperty("interested_nw")
  private Boolean interestedNw = null;

  @JsonProperty("ip_subnet")
  @Valid
  private List<VIMgrIPSubnetRuntime> ipSubnet = null;

  @JsonProperty("managed_object_id")
  private String managedObjectId = null;

  @JsonProperty("MgmtNW")
  private Boolean mgmtNW = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("num_ports")
  private Integer numPorts = null;

  @JsonProperty("switch_name")
  private String switchName = null;

  @JsonProperty("tenant_name")
  private String tenantName = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vlan")
  private Integer vlan = null;

  @JsonProperty("vlan_range")
  @Valid
  private List<VlanRange> vlanRange = null;

  @JsonProperty("vm_refs")
  @Valid
  private List<String> vmRefs = null;

  @JsonProperty("vrf_context_ref")
  private String vrfContextRef = null;

  
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
   * apic_vrf_context of VIMgrNWRuntime.
   * @return apicVrfContext
  **/
  @ApiModelProperty(value = "apic_vrf_context of VIMgrNWRuntime.")


 
  @VsoMethod  
  public String getApicVrfContext() {
    return apicVrfContext;
  }
    
  @VsoMethod
  public void setApicVrfContext(String apicVrfContext) {
    this.apicVrfContext = apicVrfContext;
  }

  
  /**
   * Placeholder for description of property auto_expand of obj type VIMgrNWRuntime field type str  type boolean
   * @return autoExpand
  **/
  @ApiModelProperty(value = "Placeholder for description of property auto_expand of obj type VIMgrNWRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isAutoExpand() {
    return autoExpand;
  }
    
  @VsoMethod
  public void setAutoExpand(Boolean autoExpand) {
    this.autoExpand = autoExpand;
  }

  
  /**
   * availability_zone of VIMgrNWRuntime.
   * @return availabilityZone
  **/
  @ApiModelProperty(value = "availability_zone of VIMgrNWRuntime.")


 
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
   * Unique object identifier of datacenter.
   * @return datacenterUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of datacenter.")


 
  @VsoMethod  
  public String getDatacenterUuid() {
    return datacenterUuid;
  }
    
  @VsoMethod
  public void setDatacenterUuid(String datacenterUuid) {
    this.datacenterUuid = datacenterUuid;
  }

  
  /**
   * Placeholder for description of property dvs of obj type VIMgrNWRuntime field type str  type boolean
   * @return dvs
  **/
  @ApiModelProperty(value = "Placeholder for description of property dvs of obj type VIMgrNWRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isDvs() {
    return dvs;
  }
    
  @VsoMethod
  public void setDvs(Boolean dvs) {
    this.dvs = dvs;
  }

  
  public VIMgrNWRuntime addHostRefsItem(String hostRefsItem) {
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

  
  /**
   * Placeholder for description of property interested_nw of obj type VIMgrNWRuntime field type str  type boolean
   * @return interestedNw
  **/
  @ApiModelProperty(value = "Placeholder for description of property interested_nw of obj type VIMgrNWRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isInterestedNw() {
    return interestedNw;
  }
    
  @VsoMethod
  public void setInterestedNw(Boolean interestedNw) {
    this.interestedNw = interestedNw;
  }

  
  public VIMgrNWRuntime addIpSubnetItem(VIMgrIPSubnetRuntime ipSubnetItem) {
    if (this.ipSubnet == null) {
      this.ipSubnet = new ArrayList<VIMgrIPSubnetRuntime>();
    }
    this.ipSubnet.add(ipSubnetItem);
    return this;
  }
  
  /**
   * Placeholder for description of property ip_subnet of obj type VIMgrNWRuntime field type str  type object
   * @return ipSubnet
  **/
  @ApiModelProperty(value = "Placeholder for description of property ip_subnet of obj type VIMgrNWRuntime field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<VIMgrIPSubnetRuntime> getIpSubnet() {
    return ipSubnet;
  }
    
  @VsoMethod
  public void setIpSubnet(List<VIMgrIPSubnetRuntime> ipSubnet) {
    this.ipSubnet = ipSubnet;
  }

  
  /**
   * managed_object_id of VIMgrNWRuntime.
   * @return managedObjectId
  **/
  @ApiModelProperty(required = true, value = "managed_object_id of VIMgrNWRuntime.")
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
   * Placeholder for description of property MgmtNW of obj type VIMgrNWRuntime field type str  type boolean
   * @return mgmtNW
  **/
  @ApiModelProperty(value = "Placeholder for description of property MgmtNW of obj type VIMgrNWRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isMgmtNW() {
    return mgmtNW;
  }
    
  @VsoMethod
  public void setMgmtNW(Boolean mgmtNW) {
    this.mgmtNW = mgmtNW;
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
   * Number of num_ports.
   * @return numPorts
  **/
  @ApiModelProperty(value = "Number of num_ports.")


 
  @VsoMethod  
  public Integer getNumPorts() {
    return numPorts;
  }
    
  @VsoMethod
  public void setNumPorts(Integer numPorts) {
    this.numPorts = numPorts;
  }

  
  /**
   * switch_name of VIMgrNWRuntime.
   * @return switchName
  **/
  @ApiModelProperty(value = "switch_name of VIMgrNWRuntime.")


 
  @VsoMethod  
  public String getSwitchName() {
    return switchName;
  }
    
  @VsoMethod
  public void setSwitchName(String switchName) {
    this.switchName = switchName;
  }

  
  /**
   * tenant_name of VIMgrNWRuntime.
   * @return tenantName
  **/
  @ApiModelProperty(value = "tenant_name of VIMgrNWRuntime.")


 
  @VsoMethod  
  public String getTenantName() {
    return tenantName;
  }
    
  @VsoMethod
  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
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
   * Number of vlan.
   * @return vlan
  **/
  @ApiModelProperty(value = "Number of vlan.")


 
  @VsoMethod  
  public Integer getVlan() {
    return vlan;
  }
    
  @VsoMethod
  public void setVlan(Integer vlan) {
    this.vlan = vlan;
  }

  
  public VIMgrNWRuntime addVlanRangeItem(VlanRange vlanRangeItem) {
    if (this.vlanRange == null) {
      this.vlanRange = new ArrayList<VlanRange>();
    }
    this.vlanRange.add(vlanRangeItem);
    return this;
  }
  
  /**
   * Placeholder for description of property vlan_range of obj type VIMgrNWRuntime field type str  type object
   * @return vlanRange
  **/
  @ApiModelProperty(value = "Placeholder for description of property vlan_range of obj type VIMgrNWRuntime field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<VlanRange> getVlanRange() {
    return vlanRange;
  }
    
  @VsoMethod
  public void setVlanRange(List<VlanRange> vlanRange) {
    this.vlanRange = vlanRange;
  }

  
  public VIMgrNWRuntime addVmRefsItem(String vmRefsItem) {
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

  
  /**
   *  It is a reference to an object of type VrfContext.
   * @return vrfContextRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VrfContext.")


 
  @VsoMethod  
  public String getVrfContextRef() {
    return vrfContextRef;
  }
    
  @VsoMethod
  public void setVrfContextRef(String vrfContextRef) {
    this.vrfContextRef = vrfContextRef;
  }

  
  public String getObjectID() {
		return "VIMgrNWRuntime";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIMgrNWRuntime viMgrNWRuntime = (VIMgrNWRuntime) o;
    return Objects.equals(this.lastModified, viMgrNWRuntime.lastModified) &&
        Objects.equals(this.apicVrfContext, viMgrNWRuntime.apicVrfContext) &&
        Objects.equals(this.autoExpand, viMgrNWRuntime.autoExpand) &&
        Objects.equals(this.availabilityZone, viMgrNWRuntime.availabilityZone) &&
        Objects.equals(this.cloudRef, viMgrNWRuntime.cloudRef) &&
        Objects.equals(this.datacenterUuid, viMgrNWRuntime.datacenterUuid) &&
        Objects.equals(this.dvs, viMgrNWRuntime.dvs) &&
        Objects.equals(this.hostRefs, viMgrNWRuntime.hostRefs) &&
        Objects.equals(this.interestedNw, viMgrNWRuntime.interestedNw) &&
        Objects.equals(this.ipSubnet, viMgrNWRuntime.ipSubnet) &&
        Objects.equals(this.managedObjectId, viMgrNWRuntime.managedObjectId) &&
        Objects.equals(this.mgmtNW, viMgrNWRuntime.mgmtNW) &&
        Objects.equals(this.name, viMgrNWRuntime.name) &&
        Objects.equals(this.numPorts, viMgrNWRuntime.numPorts) &&
        Objects.equals(this.switchName, viMgrNWRuntime.switchName) &&
        Objects.equals(this.tenantName, viMgrNWRuntime.tenantName) &&
        Objects.equals(this.tenantRef, viMgrNWRuntime.tenantRef) &&
        Objects.equals(this.type, viMgrNWRuntime.type) &&
        Objects.equals(this.url, viMgrNWRuntime.url) &&
        Objects.equals(this.uuid, viMgrNWRuntime.uuid) &&
        Objects.equals(this.vlan, viMgrNWRuntime.vlan) &&
        Objects.equals(this.vlanRange, viMgrNWRuntime.vlanRange) &&
        Objects.equals(this.vmRefs, viMgrNWRuntime.vmRefs) &&
        Objects.equals(this.vrfContextRef, viMgrNWRuntime.vrfContextRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, apicVrfContext, autoExpand, availabilityZone, cloudRef, datacenterUuid, dvs, hostRefs, interestedNw, ipSubnet, managedObjectId, mgmtNW, name, numPorts, switchName, tenantName, tenantRef, type, url, uuid, vlan, vlanRange, vmRefs, vrfContextRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIMgrNWRuntime {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    apicVrfContext: ").append(toIndentedString(apicVrfContext)).append("\n");
    sb.append("    autoExpand: ").append(toIndentedString(autoExpand)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    datacenterUuid: ").append(toIndentedString(datacenterUuid)).append("\n");
    sb.append("    dvs: ").append(toIndentedString(dvs)).append("\n");
    sb.append("    hostRefs: ").append(toIndentedString(hostRefs)).append("\n");
    sb.append("    interestedNw: ").append(toIndentedString(interestedNw)).append("\n");
    sb.append("    ipSubnet: ").append(toIndentedString(ipSubnet)).append("\n");
    sb.append("    managedObjectId: ").append(toIndentedString(managedObjectId)).append("\n");
    sb.append("    mgmtNW: ").append(toIndentedString(mgmtNW)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numPorts: ").append(toIndentedString(numPorts)).append("\n");
    sb.append("    switchName: ").append(toIndentedString(switchName)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
    sb.append("    vlanRange: ").append(toIndentedString(vlanRange)).append("\n");
    sb.append("    vmRefs: ").append(toIndentedString(vmRefs)).append("\n");
    sb.append("    vrfContextRef: ").append(toIndentedString(vrfContextRef)).append("\n");
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

