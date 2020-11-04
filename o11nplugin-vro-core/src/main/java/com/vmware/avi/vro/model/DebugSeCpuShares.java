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
 * The DebugSeCpuShares is a POJO class extends AviRestResource that used for creating
 * DebugSeCpuShares.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DebugSeCpuShares")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGSECPUSHARES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DebugSeCpuShares extends AviRestResource {
    @JsonProperty("cpu")
    @JsonInclude(Include.NON_NULL)
    private Integer cpu = null;

    @JsonProperty("shares")
    @JsonInclude(Include.NON_NULL)
    private Integer shares = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cpu of obj type debugsecpushares field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cpu
   */
  @VsoMethod
  public Integer getCpu() {
    return cpu;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cpu of obj type debugsecpushares field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cpu set the cpu.
   */
  @VsoMethod
  public void setCpu(Integer  cpu) {
    this.cpu = cpu;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property shares of obj type debugsecpushares field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return shares
   */
  @VsoMethod
  public Integer getShares() {
    return shares;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property shares of obj type debugsecpushares field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param shares set the shares.
   */
  @VsoMethod
  public void setShares(Integer  shares) {
    this.shares = shares;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DebugSeCpuShares objDebugSeCpuShares = (DebugSeCpuShares) o;
  return   Objects.equals(this.cpu, objDebugSeCpuShares.cpu)&&
  Objects.equals(this.shares, objDebugSeCpuShares.shares);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DebugSeCpuShares {\n");
      sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
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

