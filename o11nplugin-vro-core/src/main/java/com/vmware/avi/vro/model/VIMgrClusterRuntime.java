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
 * The VIMgrClusterRuntime is a POJO class extends AviRestResource that used for creating
 * VIMgrClusterRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VIMgrClusterRuntime")
@VsoFinder(name = Constants.FINDER_VRO_VIMGRCLUSTERRUNTIME, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VIMgrClusterRuntime extends AviRestResource {
  @JsonProperty("cloud_ref")
  @JsonInclude(Include.NON_NULL)
  private String cloudRef = null;

  @JsonProperty("datacenter_managed_object_id")
  @JsonInclude(Include.NON_NULL)
  private String datacenterManagedObjectId = null;

  @JsonProperty("datacenter_uuid")
  @JsonInclude(Include.NON_NULL)
  private String datacenterUuid = null;

  @JsonProperty("host_refs")
  @JsonInclude(Include.NON_NULL)
  private List<String> hostRefs = null;

  @JsonProperty("managed_object_id")
  @JsonInclude(Include.NON_NULL)
  private String managedObjectId = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

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
   * Placeholder for description of property datacenter_managed_object_id of obj type vimgrclusterruntime field type str  type string.
   * @return datacenterManagedObjectId
   */
  @VsoMethod
  public String getDatacenterManagedObjectId() {
    return datacenterManagedObjectId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property datacenter_managed_object_id of obj type vimgrclusterruntime field type str  type string.
   * @param datacenterManagedObjectId set the datacenterManagedObjectId.
   */
  @VsoMethod
  public void setDatacenterManagedObjectId(String  datacenterManagedObjectId) {
    this.datacenterManagedObjectId = datacenterManagedObjectId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of datacenter.
   * @return datacenterUuid
   */
  @VsoMethod
  public String getDatacenterUuid() {
    return datacenterUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of datacenter.
   * @param datacenterUuid set the datacenterUuid.
   */
  @VsoMethod
  public void setDatacenterUuid(String  datacenterUuid) {
    this.datacenterUuid = datacenterUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type vimgrhostruntime.
   * @return hostRefs
   */
  @VsoMethod
  public List<String> getHostRefs() {
    return hostRefs;
  }

  /**
   * This is the setter method. this will set the hostRefs
   * It is a reference to an object of type vimgrhostruntime.
   * @return hostRefs
   */
  @VsoMethod
  public void setHostRefs(List<String>  hostRefs) {
    this.hostRefs = hostRefs;
  }

  /**
   * This is the setter method this will set the hostRefs
   * It is a reference to an object of type vimgrhostruntime.
   * @return hostRefs
   */
  @VsoMethod
  public VIMgrClusterRuntime addHostRefsItem(String hostRefsItem) {
    if (this.hostRefs == null) {
      this.hostRefs = new ArrayList<String>();
    }
    this.hostRefs.add(hostRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property managed_object_id of obj type vimgrclusterruntime field type str  type string.
   * @return managedObjectId
   */
  @VsoMethod
  public String getManagedObjectId() {
    return managedObjectId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property managed_object_id of obj type vimgrclusterruntime field type str  type string.
   * @param managedObjectId set the managedObjectId.
   */
  @VsoMethod
  public void setManagedObjectId(String  managedObjectId) {
    this.managedObjectId = managedObjectId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
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
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
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
  VIMgrClusterRuntime objVIMgrClusterRuntime = (VIMgrClusterRuntime) o;
  return   Objects.equals(this.hostRefs, objVIMgrClusterRuntime.hostRefs)&&
  Objects.equals(this.datacenterManagedObjectId, objVIMgrClusterRuntime.datacenterManagedObjectId)&&
  Objects.equals(this.uuid, objVIMgrClusterRuntime.uuid)&&
  Objects.equals(this.cloudRef, objVIMgrClusterRuntime.cloudRef)&&
  Objects.equals(this.datacenterUuid, objVIMgrClusterRuntime.datacenterUuid)&&
  Objects.equals(this.managedObjectId, objVIMgrClusterRuntime.managedObjectId)&&
  Objects.equals(this.type, objVIMgrClusterRuntime.type)&&
  Objects.equals(this.tenantRef, objVIMgrClusterRuntime.tenantRef)&&
  Objects.equals(this.name, objVIMgrClusterRuntime.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VIMgrClusterRuntime {\n");
      sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
        sb.append("    datacenterManagedObjectId: ").append(toIndentedString(datacenterManagedObjectId)).append("\n");
        sb.append("    datacenterUuid: ").append(toIndentedString(datacenterUuid)).append("\n");
        sb.append("    hostRefs: ").append(toIndentedString(hostRefs)).append("\n");
        sb.append("    managedObjectId: ").append(toIndentedString(managedObjectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

