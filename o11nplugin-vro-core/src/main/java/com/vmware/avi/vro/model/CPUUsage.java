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
 * The CPUUsage is a POJO class extends AviRestResource that used for creating
 * CPUUsage.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CPUUsage")
@VsoFinder(name = Constants.FINDER_VRO_CPUUSAGE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CPUUsage extends AviRestResource {
    @JsonProperty("cpu_percent")
    @JsonInclude(Include.NON_NULL)
    private Float cpuPercent = null;

    @JsonProperty("num_cores")
    @JsonInclude(Include.NON_NULL)
    private Integer numCores = null;



  /**
   * This is the getter method this will return the attribute value.
   * Cpu usage in percentage.
   * Field introduced in 21.1.1.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cpuPercent
   */
  @VsoMethod
  public Float getCpuPercent() {
    return cpuPercent;
  }

  /**
   * This is the setter method to the attribute.
   * Cpu usage in percentage.
   * Field introduced in 21.1.1.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cpuPercent set the cpuPercent.
   */
  @VsoMethod
  public void setCpuPercent(Float  cpuPercent) {
    this.cpuPercent = cpuPercent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_cores of obj type cpuusage field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numCores
   */
  @VsoMethod
  public Integer getNumCores() {
    return numCores;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_cores of obj type cpuusage field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numCores set the numCores.
   */
  @VsoMethod
  public void setNumCores(Integer  numCores) {
    this.numCores = numCores;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CPUUsage objCPUUsage = (CPUUsage) o;
  return   Objects.equals(this.numCores, objCPUUsage.numCores)&&
  Objects.equals(this.cpuPercent, objCPUUsage.cpuPercent);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CPUUsage {\n");
      sb.append("    cpuPercent: ").append(toIndentedString(cpuPercent)).append("\n");
        sb.append("    numCores: ").append(toIndentedString(numCores)).append("\n");
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

