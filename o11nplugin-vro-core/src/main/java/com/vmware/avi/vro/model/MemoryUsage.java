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
    @JsonProperty("available")
    @JsonInclude(Include.NON_NULL)
    private Integer available;

    @JsonProperty("effective_ctlr_mem_used_percent")
    @JsonInclude(Include.NON_NULL)
    private Integer effectiveCtlrMemUsedPercent;

    @JsonProperty("free")
    @JsonInclude(Include.NON_NULL)
    private Integer free;

    @JsonProperty("total")
    @JsonInclude(Include.NON_NULL)
    private Integer total;



  /**
   * This is the getter method this will return the attribute value.
   * Available memory of the node.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return available
   */
  @VsoMethod
  public Integer getAvailable() {
    return available;
  }

  /**
   * This is the setter method to the attribute.
   * Available memory of the node.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param available set the available.
   */
  @VsoMethod
  public void setAvailable(Integer  available) {
    this.available = available;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Effective total memory used by memory balancer to make decisions for stopping processes.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return effectiveCtlrMemUsedPercent
   */
  @VsoMethod
  public Integer getEffectiveCtlrMemUsedPercent() {
    return effectiveCtlrMemUsedPercent;
  }

  /**
   * This is the setter method to the attribute.
   * Effective total memory used by memory balancer to make decisions for stopping processes.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param effectiveCtlrMemUsedPercent set the effectiveCtlrMemUsedPercent.
   */
  @VsoMethod
  public void setEffectiveCtlrMemUsedPercent(Integer  effectiveCtlrMemUsedPercent) {
    this.effectiveCtlrMemUsedPercent = effectiveCtlrMemUsedPercent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return free
   */
  @VsoMethod
  public Integer getFree() {
    return free;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param free set the free.
   */
  @VsoMethod
  public void setFree(Integer  free) {
    this.free = free;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return total
   */
  @VsoMethod
  public Integer getTotal() {
    return total;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
  Objects.equals(this.free, objMemoryUsage.free)&&
  Objects.equals(this.available, objMemoryUsage.available)&&
  Objects.equals(this.effectiveCtlrMemUsedPercent, objMemoryUsage.effectiveCtlrMemUsedPercent);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MemoryUsage {\n");
      sb.append("    available: ").append(toIndentedString(available)).append("\n");
        sb.append("    effectiveCtlrMemUsedPercent: ").append(toIndentedString(effectiveCtlrMemUsedPercent)).append("\n");
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

