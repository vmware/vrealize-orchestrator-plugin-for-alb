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
 * The MemoryUsage is a POJO class extends AviRestResource that used for creating
 * MemoryUsage.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MemoryUsage")
@VsoFinder(name = Constants.FINDER_VRO_MEMORYUSAGE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MemoryUsage extends AviRestResource {
    @JsonProperty("free")
    @JsonInclude(Include.NON_NULL)
    private Integer free;

    @JsonProperty("total")
    @JsonInclude(Include.NON_NULL)
    private Integer total;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return free
   */
  @VsoMethod
  public Integer getFree() {
    return free;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param free set the free.
   */
  @VsoMethod
  public void setFree(Integer  free) {
    this.free = free;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return total
   */
  @VsoMethod
  public Integer getTotal() {
    return total;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param total set the total.
   */
  @VsoMethod
  public void setTotal(Integer  total) {
    this.total = total;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MemoryUsage objMemoryUsage = (MemoryUsage) o;
  return   Objects.equals(this.total, objMemoryUsage.total)&&
  Objects.equals(this.free, objMemoryUsage.free);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MemoryUsage {\n");
      sb.append("    free: ").append(toIndentedString(free)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

