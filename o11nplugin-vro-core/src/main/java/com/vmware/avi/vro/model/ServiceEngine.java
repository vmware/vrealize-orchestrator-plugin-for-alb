package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.vNIC;
import com.vmware.avi.vro.model.SeResources;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ServiceEngine is a POJO class extends AviRestResource that used for creating
 * ServiceEngine.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ServiceEngine")
@VsoFinder(name = Constants.FINDER_VRO_SERVICEENGINE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ServiceEngine extends AviRestResource {
  @JsonProperty("availability_zone")
  @JsonInclude(Include.NON_NULL)
  private String availabilityZone = null;

  @JsonProperty("cloud_ref")
  @JsonInclude(Include.NON_NULL)
  private String cloudRef = null;

  @JsonProperty("container_mode")
  @JsonInclude(Include.NON_NULL)
  private Boolean containerMode = false;

  @JsonProperty("container_type")
  @JsonInclude(Include.NON_NULL)
  private String containerType = "CONTAINER_TYPE_HOST";

  @JsonProperty("controller_created")
  @JsonInclude(Include.NON_NULL)
  private Boolean controllerCreated = false;

  @JsonProperty("controller_ip")
  @JsonInclude(Include.NON_NULL)
  private String controllerIp = null;

  @JsonProperty("data_vnics")
  @JsonInclude(Include.NON_NULL)
  private List<vNIC> dataVnics = null;

  @JsonProperty("enable_state")
  @JsonInclude(Include.NON_NULL)
  private String enableState = "SE_STATE_ENABLED";

  @JsonProperty("flavor")
  @JsonInclude(Include.NON_NULL)
  private String flavor = null;

  @JsonProperty("host_ref")
  @JsonInclude(Include.NON_NULL)
  private String hostRef = null;

  @JsonProperty("hypervisor")
  @JsonInclude(Include.NON_NULL)
  private String hypervisor = null;

  @JsonProperty("mgmt_vnic")
  @JsonInclude(Include.NON_NULL)
  private vNIC mgmtVnic = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = "vm name unknown";

  @JsonProperty("resources")
  @JsonInclude(Include.NON_NULL)
  private SeResources resources = null;

  @JsonProperty("se_group_ref")
  @JsonInclude(Include.NON_NULL)
  private String seGroupRef = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property availability_zone of obj type serviceengine field type str  type string.
   * @return availabilityZone
   */
  @VsoMethod
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property availability_zone of obj type serviceengine field type str  type string.
   * @param availabilityZone set the availabilityZone.
   */
  @VsoMethod
  public void setAvailabilityZone(String  availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type cloud.
   * @return cloudRef
   */
  @VsoMethod
  public String getCloudRef() {
    return cloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type cloud.
   * @param cloudRef set the cloudRef.
   */
  @VsoMethod
  public void setCloudRef(String  cloudRef) {
    this.cloudRef = cloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property container_mode of obj type serviceengine field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return containerMode
   */
  @VsoMethod
  public Boolean getContainerMode() {
    return containerMode;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property container_mode of obj type serviceengine field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param containerMode set the containerMode.
   */
  @VsoMethod
  public void setContainerMode(Boolean  containerMode) {
    this.containerMode = containerMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - CONTAINER_TYPE_BRIDGE, CONTAINER_TYPE_HOST, CONTAINER_TYPE_HOST_DPDK.
   * Default value when not specified in API or module is interpreted by Avi Controller as CONTAINER_TYPE_HOST.
   * @return containerType
   */
  @VsoMethod
  public String getContainerType() {
    return containerType;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - CONTAINER_TYPE_BRIDGE, CONTAINER_TYPE_HOST, CONTAINER_TYPE_HOST_DPDK.
   * Default value when not specified in API or module is interpreted by Avi Controller as CONTAINER_TYPE_HOST.
   * @param containerType set the containerType.
   */
  @VsoMethod
  public void setContainerType(String  containerType) {
    this.containerType = containerType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property controller_created of obj type serviceengine field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return controllerCreated
   */
  @VsoMethod
  public Boolean getControllerCreated() {
    return controllerCreated;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property controller_created of obj type serviceengine field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param controllerCreated set the controllerCreated.
   */
  @VsoMethod
  public void setControllerCreated(Boolean  controllerCreated) {
    this.controllerCreated = controllerCreated;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property controller_ip of obj type serviceengine field type str  type string.
   * @return controllerIp
   */
  @VsoMethod
  public String getControllerIp() {
    return controllerIp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property controller_ip of obj type serviceengine field type str  type string.
   * @param controllerIp set the controllerIp.
   */
  @VsoMethod
  public void setControllerIp(String  controllerIp) {
    this.controllerIp = controllerIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property data_vnics of obj type serviceengine field type str  type array.
   * @return dataVnics
   */
  @VsoMethod
  public List<vNIC> getDataVnics() {
    return dataVnics;
  }

  /**
   * This is the setter method. this will set the dataVnics
   * Placeholder for description of property data_vnics of obj type serviceengine field type str  type array.
   * @return dataVnics
   */
  @VsoMethod
  public void setDataVnics(List<vNIC>  dataVnics) {
    this.dataVnics = dataVnics;
  }

  /**
   * This is the setter method this will set the dataVnics
   * Placeholder for description of property data_vnics of obj type serviceengine field type str  type array.
   * @return dataVnics
   */
  @VsoMethod
  public ServiceEngine addDataVnicsItem(vNIC dataVnicsItem) {
    if (this.dataVnics == null) {
      this.dataVnics = new ArrayList<vNIC>();
    }
    this.dataVnics.add(dataVnicsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Inorder to disable se set this field appropriately.
   * Enum options - SE_STATE_ENABLED, SE_STATE_DISABLED_FOR_PLACEMENT, SE_STATE_DISABLED, SE_STATE_DISABLED_FORCE.
   * Default value when not specified in API or module is interpreted by Avi Controller as SE_STATE_ENABLED.
   * @return enableState
   */
  @VsoMethod
  public String getEnableState() {
    return enableState;
  }

  /**
   * This is the setter method to the attribute.
   * Inorder to disable se set this field appropriately.
   * Enum options - SE_STATE_ENABLED, SE_STATE_DISABLED_FOR_PLACEMENT, SE_STATE_DISABLED, SE_STATE_DISABLED_FORCE.
   * Default value when not specified in API or module is interpreted by Avi Controller as SE_STATE_ENABLED.
   * @param enableState set the enableState.
   */
  @VsoMethod
  public void setEnableState(String  enableState) {
    this.enableState = enableState;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property flavor of obj type serviceengine field type str  type string.
   * @return flavor
   */
  @VsoMethod
  public String getFlavor() {
    return flavor;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property flavor of obj type serviceengine field type str  type string.
   * @param flavor set the flavor.
   */
  @VsoMethod
  public void setFlavor(String  flavor) {
    this.flavor = flavor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type vimgrhostruntime.
   * @return hostRef
   */
  @VsoMethod
  public String getHostRef() {
    return hostRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type vimgrhostruntime.
   * @param hostRef set the hostRef.
   */
  @VsoMethod
  public void setHostRef(String  hostRef) {
    this.hostRef = hostRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * @return hypervisor
   */
  @VsoMethod
  public String getHypervisor() {
    return hypervisor;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * @param hypervisor set the hypervisor.
   */
  @VsoMethod
  public void setHypervisor(String  hypervisor) {
    this.hypervisor = hypervisor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property mgmt_vnic of obj type serviceengine field type str  type ref.
   * @return mgmtVnic
   */
  @VsoMethod
  public vNIC getMgmtVnic() {
    return mgmtVnic;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property mgmt_vnic of obj type serviceengine field type str  type ref.
   * @param mgmtVnic set the mgmtVnic.
   */
  @VsoMethod
  public void setMgmtVnic(vNIC mgmtVnic) {
    this.mgmtVnic = mgmtVnic;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as vm name unknown.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as vm name unknown.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property resources of obj type serviceengine field type str  type ref.
   * @return resources
   */
  @VsoMethod
  public SeResources getResources() {
    return resources;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property resources of obj type serviceengine field type str  type ref.
   * @param resources set the resources.
   */
  @VsoMethod
  public void setResources(SeResources resources) {
    this.resources = resources;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceenginegroup.
   * @return seGroupRef
   */
  @VsoMethod
  public String getSeGroupRef() {
    return seGroupRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type serviceenginegroup.
   * @param seGroupRef set the seGroupRef.
   */
  @VsoMethod
  public void setSeGroupRef(String  seGroupRef) {
    this.seGroupRef = seGroupRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
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
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
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
  ServiceEngine objServiceEngine = (ServiceEngine) o;
  return   Objects.equals(this.containerMode, objServiceEngine.containerMode)&&
  Objects.equals(this.enableState, objServiceEngine.enableState)&&
  Objects.equals(this.uuid, objServiceEngine.uuid)&&
  Objects.equals(this.mgmtVnic, objServiceEngine.mgmtVnic)&&
  Objects.equals(this.hypervisor, objServiceEngine.hypervisor)&&
  Objects.equals(this.controllerCreated, objServiceEngine.controllerCreated)&&
  Objects.equals(this.dataVnics, objServiceEngine.dataVnics)&&
  Objects.equals(this.hostRef, objServiceEngine.hostRef)&&
  Objects.equals(this.cloudRef, objServiceEngine.cloudRef)&&
  Objects.equals(this.containerType, objServiceEngine.containerType)&&
  Objects.equals(this.availabilityZone, objServiceEngine.availabilityZone)&&
  Objects.equals(this.controllerIp, objServiceEngine.controllerIp)&&
  Objects.equals(this.flavor, objServiceEngine.flavor)&&
  Objects.equals(this.seGroupRef, objServiceEngine.seGroupRef)&&
  Objects.equals(this.tenantRef, objServiceEngine.tenantRef)&&
  Objects.equals(this.resources, objServiceEngine.resources)&&
  Objects.equals(this.name, objServiceEngine.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ServiceEngine {\n");
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
