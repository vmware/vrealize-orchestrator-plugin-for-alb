package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SeResources;
import com.vmware.avi.vro.model.VNIC;
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
 * ServiceEngine
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ServiceEngine")
@VsoFinder(name = Constants.FINDER_VRO_SERVICEENGINE, idAccessor = "getObjectID()")
@Service
public class ServiceEngine extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("availability_zone")
  private String availabilityZone = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("container_mode")
  private Boolean containerMode = null;

  @JsonProperty("container_type")
  private String containerType = "CONTAINER_TYPE_HOST";

  @JsonProperty("controller_created")
  private Boolean controllerCreated = null;

  @JsonProperty("controller_ip")
  private String controllerIp = null;

  @JsonProperty("data_vnics")
  @Valid
  private List<VNIC> dataVnics = null;

  @JsonProperty("enable_state")
  private String enableState = "SE_STATE_ENABLED";

  @JsonProperty("flavor")
  private String flavor = null;

  @JsonProperty("host_ref")
  private String hostRef = null;

  @JsonProperty("hypervisor")
  private String hypervisor = null;

  @JsonProperty("mgmt_vnic")
  private VNIC mgmtVnic = null;

  @JsonProperty("name")
  private String name = "VM name unknown";

  @JsonProperty("resources")
  private SeResources resources = null;

  @JsonProperty("se_group_ref")
  private String seGroupRef = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
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
   * availability_zone of ServiceEngine.
   * @return availabilityZone
  **/
  @ApiModelProperty(value = "availability_zone of ServiceEngine.")


 
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
   * Placeholder for description of property container_mode of obj type ServiceEngine field type str  type boolean
   * @return containerMode
  **/
  @ApiModelProperty(value = "Placeholder for description of property container_mode of obj type ServiceEngine field type str  type boolean")


 
  @VsoMethod  
  public Boolean isContainerMode() {
    return containerMode;
  }
    
  @VsoMethod
  public void setContainerMode(Boolean containerMode) {
    this.containerMode = containerMode;
  }

  
  /**
   *  Enum options - CONTAINER_TYPE_BRIDGE, CONTAINER_TYPE_HOST, CONTAINER_TYPE_HOST_DPDK.
   * @return containerType
  **/
  @ApiModelProperty(value = " Enum options - CONTAINER_TYPE_BRIDGE, CONTAINER_TYPE_HOST, CONTAINER_TYPE_HOST_DPDK.")


 
  @VsoMethod  
  public String getContainerType() {
    return containerType;
  }
    
  @VsoMethod
  public void setContainerType(String containerType) {
    this.containerType = containerType;
  }

  
  /**
   * Placeholder for description of property controller_created of obj type ServiceEngine field type str  type boolean
   * @return controllerCreated
  **/
  @ApiModelProperty(value = "Placeholder for description of property controller_created of obj type ServiceEngine field type str  type boolean")


 
  @VsoMethod  
  public Boolean isControllerCreated() {
    return controllerCreated;
  }
    
  @VsoMethod
  public void setControllerCreated(Boolean controllerCreated) {
    this.controllerCreated = controllerCreated;
  }

  
  /**
   * controller_ip of ServiceEngine.
   * @return controllerIp
  **/
  @ApiModelProperty(value = "controller_ip of ServiceEngine.")


 
  @VsoMethod  
  public String getControllerIp() {
    return controllerIp;
  }
    
  @VsoMethod
  public void setControllerIp(String controllerIp) {
    this.controllerIp = controllerIp;
  }

  
  public ServiceEngine addDataVnicsItem(VNIC dataVnicsItem) {
    if (this.dataVnics == null) {
      this.dataVnics = new ArrayList<VNIC>();
    }
    this.dataVnics.add(dataVnicsItem);
    return this;
  }
  
  /**
   * Placeholder for description of property data_vnics of obj type ServiceEngine field type str  type object
   * @return dataVnics
  **/
  @ApiModelProperty(value = "Placeholder for description of property data_vnics of obj type ServiceEngine field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<VNIC> getDataVnics() {
    return dataVnics;
  }
    
  @VsoMethod
  public void setDataVnics(List<VNIC> dataVnics) {
    this.dataVnics = dataVnics;
  }

  
  /**
   * inorder to disable SE set this field appropriately. Enum options - SE_STATE_ENABLED, SE_STATE_DISABLED_FOR_PLACEMENT, SE_STATE_DISABLED, SE_STATE_DISABLED_FORCE.
   * @return enableState
  **/
  @ApiModelProperty(value = "inorder to disable SE set this field appropriately. Enum options - SE_STATE_ENABLED, SE_STATE_DISABLED_FOR_PLACEMENT, SE_STATE_DISABLED, SE_STATE_DISABLED_FORCE.")


 
  @VsoMethod  
  public String getEnableState() {
    return enableState;
  }
    
  @VsoMethod
  public void setEnableState(String enableState) {
    this.enableState = enableState;
  }

  
  /**
   * flavor of ServiceEngine.
   * @return flavor
  **/
  @ApiModelProperty(value = "flavor of ServiceEngine.")


 
  @VsoMethod  
  public String getFlavor() {
    return flavor;
  }
    
  @VsoMethod
  public void setFlavor(String flavor) {
    this.flavor = flavor;
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
   * Placeholder for description of property mgmt_vnic of obj type ServiceEngine field type str  type object
   * @return mgmtVnic
  **/
  @ApiModelProperty(value = "Placeholder for description of property mgmt_vnic of obj type ServiceEngine field type str  type object")

  @Valid

 
  @VsoMethod  
  public VNIC getMgmtVnic() {
    return mgmtVnic;
  }
    
  @VsoMethod
  public void setMgmtVnic(VNIC mgmtVnic) {
    this.mgmtVnic = mgmtVnic;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the object.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Placeholder for description of property resources of obj type ServiceEngine field type str  type object
   * @return resources
  **/
  @ApiModelProperty(value = "Placeholder for description of property resources of obj type ServiceEngine field type str  type object")

  @Valid

 
  @VsoMethod  
  public SeResources getResources() {
    return resources;
  }
    
  @VsoMethod
  public void setResources(SeResources resources) {
    this.resources = resources;
  }

  
  /**
   *  It is a reference to an object of type ServiceEngineGroup.
   * @return seGroupRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type ServiceEngineGroup.")


 
  @VsoMethod  
  public String getSeGroupRef() {
    return seGroupRef;
  }
    
  @VsoMethod
  public void setSeGroupRef(String seGroupRef) {
    this.seGroupRef = seGroupRef;
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

  
  public String getObjectID() {
		return "ServiceEngine";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceEngine serviceEngine = (ServiceEngine) o;
    return Objects.equals(this.lastModified, serviceEngine.lastModified) &&
        Objects.equals(this.availabilityZone, serviceEngine.availabilityZone) &&
        Objects.equals(this.cloudRef, serviceEngine.cloudRef) &&
        Objects.equals(this.containerMode, serviceEngine.containerMode) &&
        Objects.equals(this.containerType, serviceEngine.containerType) &&
        Objects.equals(this.controllerCreated, serviceEngine.controllerCreated) &&
        Objects.equals(this.controllerIp, serviceEngine.controllerIp) &&
        Objects.equals(this.dataVnics, serviceEngine.dataVnics) &&
        Objects.equals(this.enableState, serviceEngine.enableState) &&
        Objects.equals(this.flavor, serviceEngine.flavor) &&
        Objects.equals(this.hostRef, serviceEngine.hostRef) &&
        Objects.equals(this.hypervisor, serviceEngine.hypervisor) &&
        Objects.equals(this.mgmtVnic, serviceEngine.mgmtVnic) &&
        Objects.equals(this.name, serviceEngine.name) &&
        Objects.equals(this.resources, serviceEngine.resources) &&
        Objects.equals(this.seGroupRef, serviceEngine.seGroupRef) &&
        Objects.equals(this.tenantRef, serviceEngine.tenantRef) &&
        Objects.equals(this.url, serviceEngine.url) &&
        Objects.equals(this.uuid, serviceEngine.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, availabilityZone, cloudRef, containerMode, containerType, controllerCreated, controllerIp, dataVnics, enableState, flavor, hostRef, hypervisor, mgmtVnic, name, resources, seGroupRef, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceEngine {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    containerMode: ").append(toIndentedString(containerMode)).append("\n");
    sb.append("    containerType: ").append(toIndentedString(containerType)).append("\n");
    sb.append("    controllerCreated: ").append(toIndentedString(controllerCreated)).append("\n");
    sb.append("    controllerIp: ").append(toIndentedString(controllerIp)).append("\n");
    sb.append("    dataVnics: ").append(toIndentedString(dataVnics)).append("\n");
    sb.append("    enableState: ").append(toIndentedString(enableState)).append("\n");
    sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
    sb.append("    hostRef: ").append(toIndentedString(hostRef)).append("\n");
    sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
    sb.append("    mgmtVnic: ").append(toIndentedString(mgmtVnic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    seGroupRef: ").append(toIndentedString(seGroupRef)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

