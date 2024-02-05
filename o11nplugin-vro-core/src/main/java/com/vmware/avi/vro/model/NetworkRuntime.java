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
    private String name;

    @JsonProperty("obj_uuids")
    @JsonInclude(Include.NON_NULL)
    private List<String> objUuids;

    @JsonProperty("subnet_runtime")
    @JsonInclude(Include.NON_NULL)
    private List<SubnetRuntime> subnetRuntime;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Objects using static ips in this network.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objUuids
   */
  @VsoMethod
  public List<String> getObjUuids() {
    return objUuids;
  }

  /**
   * This is the setter method. this will set the objUuids
   * Objects using static ips in this network.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objUuids
   */
  @VsoMethod
  public void setObjUuids(List<String>  objUuids) {
    this.objUuids = objUuids;
  }

  /**
   * This is the setter method this will set the objUuids
   * Objects using static ips in this network.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objUuids
   */
  @VsoMethod
  public NetworkRuntime addObjUuidsItem(String objUuidsItem) {
    if (this.objUuids == null) {
      this.objUuids = new ArrayList<String>();
    }
    this.objUuids.add(objUuidsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subnetRuntime
   */
  @VsoMethod
  public List<SubnetRuntime> getSubnetRuntime() {
    return subnetRuntime;
  }

  /**
   * This is the setter method. this will set the subnetRuntime
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subnetRuntime
   */
  @VsoMethod
  public void setSubnetRuntime(List<SubnetRuntime>  subnetRuntime) {
    this.subnetRuntime = subnetRuntime;
  }

  /**
   * This is the setter method this will set the subnetRuntime
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  Objects.equals(this.objUuids, objNetworkRuntime.objUuids)&&
  Objects.equals(this.tenantRef, objNetworkRuntime.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NetworkRuntime {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    objUuids: ").append(toIndentedString(objUuids)).append("\n");
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

