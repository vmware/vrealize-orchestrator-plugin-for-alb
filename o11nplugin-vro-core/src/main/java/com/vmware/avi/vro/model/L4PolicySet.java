package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.L4ConnectionPolicy;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The L4PolicySet is a POJO class extends AviRestResource that used for creating
 * L4PolicySet.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "L4PolicySet")
@VsoFinder(name = Constants.FINDER_VRO_L4POLICYSET, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class L4PolicySet extends AviRestResource {
  @JsonProperty("created_by")
  @JsonInclude(Include.NON_NULL)
  private String createdBy = null;

  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("is_internal_policy")
  @JsonInclude(Include.NON_NULL)
  private Boolean isInternalPolicy = false;

  @JsonProperty("l4_connection_policy")
  @JsonInclude(Include.NON_NULL)
  private L4ConnectionPolicy l4ConnectionPolicy = null;

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



  /**
   * This is the getter method this will return the attribute value.
   * Creator name.
   * Field introduced in 17.2.7.
   * @return createdBy
   */
  @VsoMethod
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * This is the setter method to the attribute.
   * Creator name.
   * Field introduced in 17.2.7.
   * @param createdBy set the createdBy.
   */
  @VsoMethod
  public void setCreatedBy(String  createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.7.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.7.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.7.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isInternalPolicy
   */
  @VsoMethod
  public Boolean getIsInternalPolicy() {
    return isInternalPolicy;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.7.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isInternalPolicy set the isInternalPolicy.
   */
  @VsoMethod
  public void setIsInternalPolicy(Boolean  isInternalPolicy) {
    this.isInternalPolicy = isInternalPolicy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Policy to apply when a new transport connection is setup.
   * Field introduced in 17.2.7.
   * @return l4ConnectionPolicy
   */
  @VsoMethod
  public L4ConnectionPolicy getL4ConnectionPolicy() {
    return l4ConnectionPolicy;
  }

  /**
   * This is the setter method to the attribute.
   * Policy to apply when a new transport connection is setup.
   * Field introduced in 17.2.7.
   * @param l4ConnectionPolicy set the l4ConnectionPolicy.
   */
  @VsoMethod
  public void setL4ConnectionPolicy(L4ConnectionPolicy l4ConnectionPolicy) {
    this.l4ConnectionPolicy = l4ConnectionPolicy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the l4 policy set.
   * Field introduced in 17.2.7.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the l4 policy set.
   * Field introduced in 17.2.7.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Field introduced in 17.2.7.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * Field introduced in 17.2.7.
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
   * Id of the l4 policy set.
   * Field introduced in 17.2.7.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Id of the l4 policy set.
   * Field introduced in 17.2.7.
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
  L4PolicySet objL4PolicySet = (L4PolicySet) o;
  return   Objects.equals(this.l4ConnectionPolicy, objL4PolicySet.l4ConnectionPolicy)&&
  Objects.equals(this.uuid, objL4PolicySet.uuid)&&
  Objects.equals(this.description, objL4PolicySet.description)&&
  Objects.equals(this.createdBy, objL4PolicySet.createdBy)&&
  Objects.equals(this.name, objL4PolicySet.name)&&
  Objects.equals(this.tenantRef, objL4PolicySet.tenantRef)&&
  Objects.equals(this.isInternalPolicy, objL4PolicySet.isInternalPolicy);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class L4PolicySet {\n");
      sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isInternalPolicy: ").append(toIndentedString(isInternalPolicy)).append("\n");
        sb.append("    l4ConnectionPolicy: ").append(toIndentedString(l4ConnectionPolicy)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

