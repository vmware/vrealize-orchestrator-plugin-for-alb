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
 * The AvailabilityZone is a POJO class extends AviRestResource that used for creating
 * AvailabilityZone.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AvailabilityZone")
@VsoFinder(name = Constants.FINDER_VRO_AVAILABILITYZONE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AvailabilityZone extends AviRestResource {
  @JsonProperty("cloud_ref")
  @JsonInclude(Include.NON_NULL)
  private String cloudRef = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;

  @JsonProperty("vcenter_refs")
  @JsonInclude(Include.NON_NULL)
  private List<String> vcenterRefs = null;



  /**
   * This is the getter method this will return the attribute value.
   * Availability zone belongs to cloud.
   * It is a reference to an object of type cloud.
   * Field introduced in 20.1.1.
   * @return cloudRef
   */
  @VsoMethod
  public String getCloudRef() {
    return cloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * Availability zone belongs to cloud.
   * It is a reference to an object of type cloud.
   * Field introduced in 20.1.1.
   * @param cloudRef set the cloudRef.
   */
  @VsoMethod
  public void setCloudRef(String  cloudRef) {
    this.cloudRef = cloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Availabilty zone where vcenter list belongs to.
   * Field introduced in 20.1.1.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Availabilty zone where vcenter list belongs to.
   * Field introduced in 20.1.1.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Availabilityzone belongs to tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.1.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Availabilityzone belongs to tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.1.
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
   * Availability zone config uuid.
   * Field introduced in 20.1.1.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Availability zone config uuid.
   * Field introduced in 20.1.1.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Group of vcenter list belong to availabilty zone.
   * It is a reference to an object of type vcenterserver.
   * Field introduced in 20.1.1.
   * @return vcenterRefs
   */
  @VsoMethod
  public List<String> getVcenterRefs() {
    return vcenterRefs;
  }

  /**
   * This is the setter method. this will set the vcenterRefs
   * Group of vcenter list belong to availabilty zone.
   * It is a reference to an object of type vcenterserver.
   * Field introduced in 20.1.1.
   * @return vcenterRefs
   */
  @VsoMethod
  public void setVcenterRefs(List<String>  vcenterRefs) {
    this.vcenterRefs = vcenterRefs;
  }

  /**
   * This is the setter method this will set the vcenterRefs
   * Group of vcenter list belong to availabilty zone.
   * It is a reference to an object of type vcenterserver.
   * Field introduced in 20.1.1.
   * @return vcenterRefs
   */
  @VsoMethod
  public AvailabilityZone addVcenterRefsItem(String vcenterRefsItem) {
    if (this.vcenterRefs == null) {
      this.vcenterRefs = new ArrayList<String>();
    }
    this.vcenterRefs.add(vcenterRefsItem);
    return this;
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
  AvailabilityZone objAvailabilityZone = (AvailabilityZone) o;
  return   Objects.equals(this.uuid, objAvailabilityZone.uuid)&&
  Objects.equals(this.name, objAvailabilityZone.name)&&
  Objects.equals(this.vcenterRefs, objAvailabilityZone.vcenterRefs)&&
  Objects.equals(this.tenantRef, objAvailabilityZone.tenantRef)&&
  Objects.equals(this.cloudRef, objAvailabilityZone.cloudRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AvailabilityZone {\n");
      sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vcenterRefs: ").append(toIndentedString(vcenterRefs)).append("\n");
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

