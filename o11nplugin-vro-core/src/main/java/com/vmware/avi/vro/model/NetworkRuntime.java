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
 * The NetworkRuntime is a POJO class extends AviRestResource that used for creating
 * NetworkRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NetworkRuntime")
@VsoFinder(name = Constants.FINDER_VRO_NETWORKRUNTIME, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NetworkRuntime extends AviRestResource {
  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("se_uuid")
  @JsonInclude(Include.NON_NULL)
  private List<String> seUuid = null;

  @JsonProperty("subnet_runtime")
  @JsonInclude(Include.NON_NULL)
  private List<SubnetRuntime> subnetRuntime = null;

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
   * Unique object identifier of se.
   * @return seUuid
   */
  @VsoMethod
  public List<String> getSeUuid() {
    return seUuid;
  }

  /**
   * This is the setter method. this will set the seUuid
   * Unique object identifier of se.
   * @return seUuid
   */
  @VsoMethod
  public void setSeUuid(List<String>  seUuid) {
    this.seUuid = seUuid;
  }

  /**
   * This is the setter method this will set the seUuid
   * Unique object identifier of se.
   * @return seUuid
   */
  @VsoMethod
  public NetworkRuntime addSeUuidItem(String seUuidItem) {
    if (this.seUuid == null) {
      this.seUuid = new ArrayList<String>();
    }
    this.seUuid.add(seUuidItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property subnet_runtime of obj type networkruntime field type str  type array.
   * @return subnetRuntime
   */
  @VsoMethod
  public List<SubnetRuntime> getSubnetRuntime() {
    return subnetRuntime;
  }

  /**
   * This is the setter method. this will set the subnetRuntime
   * Placeholder for description of property subnet_runtime of obj type networkruntime field type str  type array.
   * @return subnetRuntime
   */
  @VsoMethod
  public void setSubnetRuntime(List<SubnetRuntime>  subnetRuntime) {
    this.subnetRuntime = subnetRuntime;
  }

  /**
   * This is the setter method this will set the subnetRuntime
   * Placeholder for description of property subnet_runtime of obj type networkruntime field type str  type array.
   * @return subnetRuntime
   */
  @VsoMethod
  public NetworkRuntime addSubnetRuntimeItem(SubnetRuntime subnetRuntimeItem) {
    if (this.subnetRuntime == null) {
      this.subnetRuntime = new ArrayList<SubnetRuntime>();
    }
    this.subnetRuntime.add(subnetRuntimeItem);
    return this;
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
  NetworkRuntime objNetworkRuntime = (NetworkRuntime) o;
  return   Objects.equals(this.uuid, objNetworkRuntime.uuid)&&
  Objects.equals(this.name, objNetworkRuntime.name)&&
  Objects.equals(this.subnetRuntime, objNetworkRuntime.subnetRuntime)&&
  Objects.equals(this.seUuid, objNetworkRuntime.seUuid)&&
  Objects.equals(this.tenantRef, objNetworkRuntime.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NetworkRuntime {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
        sb.append("    subnetRuntime: ").append(toIndentedString(subnetRuntime)).append("\n");
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

