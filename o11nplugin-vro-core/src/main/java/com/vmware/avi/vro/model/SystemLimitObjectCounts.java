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
 * The SystemLimitObjectCounts is a POJO class extends AviRestResource that used for creating
 * SystemLimitObjectCounts.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SystemLimitObjectCounts")
@VsoFinder(name = Constants.FINDER_VRO_SYSTEMLIMITOBJECTCOUNTS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SystemLimitObjectCounts extends AviRestResource {
    @JsonProperty("object_counts")
    @JsonInclude(Include.NON_NULL)
    private List<SystemLimitObjectCount> objectCounts;



  /**
   * This is the getter method this will return the attribute value.
   * System limit count info for various system limits.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objectCounts
   */
  @VsoMethod
  public List<SystemLimitObjectCount> getObjectCounts() {
    return objectCounts;
  }

  /**
   * This is the setter method. this will set the objectCounts
   * System limit count info for various system limits.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objectCounts
   */
  @VsoMethod
  public void setObjectCounts(List<SystemLimitObjectCount>  objectCounts) {
    this.objectCounts = objectCounts;
  }

  /**
   * This is the setter method this will set the objectCounts
   * System limit count info for various system limits.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objectCounts
   */
  @VsoMethod
  public SystemLimitObjectCounts addObjectCountsItem(SystemLimitObjectCount objectCountsItem) {
    if (this.objectCounts == null) {
      this.objectCounts = new ArrayList<SystemLimitObjectCount>();
    }
    this.objectCounts.add(objectCountsItem);
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
  SystemLimitObjectCounts objSystemLimitObjectCounts = (SystemLimitObjectCounts) o;
  return   Objects.equals(this.objectCounts, objSystemLimitObjectCounts.objectCounts);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SystemLimitObjectCounts {\n");
      sb.append("    objectCounts: ").append(toIndentedString(objectCounts)).append("\n");
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

