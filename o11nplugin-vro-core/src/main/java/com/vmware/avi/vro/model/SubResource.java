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
 * The SubResource is a POJO class extends AviRestResource that used for creating
 * SubResource.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SubResource")
@VsoFinder(name = Constants.FINDER_VRO_SUBRESOURCE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SubResource extends AviRestResource {
    @JsonProperty("exclude_subresources")
    @JsonInclude(Include.NON_NULL)
    private Boolean excludeSubresources = false;

    @JsonProperty("subresources")
    @JsonInclude(Include.NON_NULL)
    private List<String> subresources;



  /**
   * This is the getter method this will return the attribute value.
   * Allows modification of all fields except for the specified subresources.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return excludeSubresources
   */
  @VsoMethod
  public Boolean getExcludeSubresources() {
    return excludeSubresources;
  }

  /**
   * This is the setter method to the attribute.
   * Allows modification of all fields except for the specified subresources.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param excludeSubresources set the excludeSubresources.
   */
  @VsoMethod
  public void setExcludeSubresources(Boolean  excludeSubresources) {
    this.excludeSubresources = excludeSubresources;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Subresources user can modify.
   * Each subresource specifies and individual field.
   * I.e.
   * Subresource_pool_enabled allows modification of the enabled field in the pool object.
   * Enum options - SUBRESOURCE_POOL_ENABLED, SUBRESOURCE_POOL_SERVERS, SUBRESOURCE_POOL_SERVER_ENABLED, SUBRESOURCE_VIRTUALSERVICE_ENABLED,
   * SUBRESOURCE_VIRTUALSERVICE_AUTO_ALLOCATE_FLOATING_IP, SUBRESOURCE_GSLBSERVICE_ENABLED, SUBRESOURCE_GSLBSERVICE_GROUPS,
   * SUBRESOURCE_GSLBSERVICE_GROUP_ENABLED, SUBRESOURCE_GSLBSERVICE_GROUP_MEMBERS, SUBRESOURCE_GSLBSERVICE_GROUP_MEMBER_ENABLED.
   * Field introduced in 20.1.5.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subresources
   */
  @VsoMethod
  public List<String> getSubresources() {
    return subresources;
  }

  /**
   * This is the setter method. this will set the subresources
   * Subresources user can modify.
   * Each subresource specifies and individual field.
   * I.e.
   * Subresource_pool_enabled allows modification of the enabled field in the pool object.
   * Enum options - SUBRESOURCE_POOL_ENABLED, SUBRESOURCE_POOL_SERVERS, SUBRESOURCE_POOL_SERVER_ENABLED, SUBRESOURCE_VIRTUALSERVICE_ENABLED,
   * SUBRESOURCE_VIRTUALSERVICE_AUTO_ALLOCATE_FLOATING_IP, SUBRESOURCE_GSLBSERVICE_ENABLED, SUBRESOURCE_GSLBSERVICE_GROUPS,
   * SUBRESOURCE_GSLBSERVICE_GROUP_ENABLED, SUBRESOURCE_GSLBSERVICE_GROUP_MEMBERS, SUBRESOURCE_GSLBSERVICE_GROUP_MEMBER_ENABLED.
   * Field introduced in 20.1.5.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subresources
   */
  @VsoMethod
  public void setSubresources(List<String>  subresources) {
    this.subresources = subresources;
  }

  /**
   * This is the setter method this will set the subresources
   * Subresources user can modify.
   * Each subresource specifies and individual field.
   * I.e.
   * Subresource_pool_enabled allows modification of the enabled field in the pool object.
   * Enum options - SUBRESOURCE_POOL_ENABLED, SUBRESOURCE_POOL_SERVERS, SUBRESOURCE_POOL_SERVER_ENABLED, SUBRESOURCE_VIRTUALSERVICE_ENABLED,
   * SUBRESOURCE_VIRTUALSERVICE_AUTO_ALLOCATE_FLOATING_IP, SUBRESOURCE_GSLBSERVICE_ENABLED, SUBRESOURCE_GSLBSERVICE_GROUPS,
   * SUBRESOURCE_GSLBSERVICE_GROUP_ENABLED, SUBRESOURCE_GSLBSERVICE_GROUP_MEMBERS, SUBRESOURCE_GSLBSERVICE_GROUP_MEMBER_ENABLED.
   * Field introduced in 20.1.5.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subresources
   */
  @VsoMethod
  public SubResource addSubresourcesItem(String subresourcesItem) {
    if (this.subresources == null) {
      this.subresources = new ArrayList<String>();
    }
    this.subresources.add(subresourcesItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SubResource objSubResource = (SubResource) o;
  return   Objects.equals(this.excludeSubresources, objSubResource.excludeSubresources)&&
  Objects.equals(this.subresources, objSubResource.subresources);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SubResource {\n");
      sb.append("    excludeSubresources: ").append(toIndentedString(excludeSubresources)).append("\n");
        sb.append("    subresources: ").append(toIndentedString(subresources)).append("\n");
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

