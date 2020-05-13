package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * VIMgrClusterRuntime
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIMgrClusterRuntime")
@VsoFinder(name = Constants.FINDER_VRO_VIMGRCLUSTERRUNTIME, idAccessor = "getObjectID()")
@Service
public class VIMgrClusterRuntime extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("datacenter_managed_object_id")
  private String datacenterManagedObjectId = null;

  @JsonProperty("datacenter_uuid")
  private String datacenterUuid = null;

  @JsonProperty("host_refs")
  @Valid
  private List<String> hostRefs = null;

  @JsonProperty("managed_object_id")
  private String managedObjectId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("type")
  private String type = null;

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
   * datacenter_managed_object_id of VIMgrClusterRuntime.
   * @return datacenterManagedObjectId
  **/
  @ApiModelProperty(value = "datacenter_managed_object_id of VIMgrClusterRuntime.")


 
  @VsoMethod  
  public String getDatacenterManagedObjectId() {
    return datacenterManagedObjectId;
  }
    
  @VsoMethod
  public void setDatacenterManagedObjectId(String datacenterManagedObjectId) {
    this.datacenterManagedObjectId = datacenterManagedObjectId;
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

  
  public VIMgrClusterRuntime addHostRefsItem(String hostRefsItem) {
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
   * managed_object_id of VIMgrClusterRuntime.
   * @return managedObjectId
  **/
  @ApiModelProperty(required = true, value = "managed_object_id of VIMgrClusterRuntime.")
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

  
  public String getObjectID() {
		return "VIMgrClusterRuntime";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIMgrClusterRuntime viMgrClusterRuntime = (VIMgrClusterRuntime) o;
    return Objects.equals(this.lastModified, viMgrClusterRuntime.lastModified) &&
        Objects.equals(this.cloudRef, viMgrClusterRuntime.cloudRef) &&
        Objects.equals(this.datacenterManagedObjectId, viMgrClusterRuntime.datacenterManagedObjectId) &&
        Objects.equals(this.datacenterUuid, viMgrClusterRuntime.datacenterUuid) &&
        Objects.equals(this.hostRefs, viMgrClusterRuntime.hostRefs) &&
        Objects.equals(this.managedObjectId, viMgrClusterRuntime.managedObjectId) &&
        Objects.equals(this.name, viMgrClusterRuntime.name) &&
        Objects.equals(this.tenantRef, viMgrClusterRuntime.tenantRef) &&
        Objects.equals(this.type, viMgrClusterRuntime.type) &&
        Objects.equals(this.url, viMgrClusterRuntime.url) &&
        Objects.equals(this.uuid, viMgrClusterRuntime.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, cloudRef, datacenterManagedObjectId, datacenterUuid, hostRefs, managedObjectId, name, tenantRef, type, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIMgrClusterRuntime {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    datacenterManagedObjectId: ").append(toIndentedString(datacenterManagedObjectId)).append("\n");
    sb.append("    datacenterUuid: ").append(toIndentedString(datacenterUuid)).append("\n");
    sb.append("    hostRefs: ").append(toIndentedString(hostRefs)).append("\n");
    sb.append("    managedObjectId: ").append(toIndentedString(managedObjectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

