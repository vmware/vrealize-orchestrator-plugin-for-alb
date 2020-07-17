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
 * The ControllerSize is a POJO class extends AviRestResource that used for creating
 * ControllerSize.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerSize")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERSIZE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerSize extends AviRestResource {
  @JsonProperty("flavor")
  @JsonInclude(Include.NON_NULL)
  private String flavor = null;

  @JsonProperty("min_cpus")
  @JsonInclude(Include.NON_NULL)
  private Integer minCpus = null;

  @JsonProperty("min_memory")
  @JsonInclude(Include.NON_NULL)
  private Integer minMemory = null;



  /**
   * This is the getter method this will return the attribute value.
   * Controller flavor (s/m/l) for this controller size.
   * Enum options - CONTROLLER_SMALL, CONTROLLER_MEDIUM, CONTROLLER_LARGE.
   * Field introduced in 20.1.1.
   * @return flavor
   */
  @VsoMethod
  public String getFlavor() {
    return flavor;
  }

  /**
   * This is the setter method to the attribute.
   * Controller flavor (s/m/l) for this controller size.
   * Enum options - CONTROLLER_SMALL, CONTROLLER_MEDIUM, CONTROLLER_LARGE.
   * Field introduced in 20.1.1.
   * @param flavor set the flavor.
   */
  @VsoMethod
  public void setFlavor(String  flavor) {
    this.flavor = flavor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum number of cpu cores required.
   * Field introduced in 20.1.1.
   * @return minCpus
   */
  @VsoMethod
  public Integer getMinCpus() {
    return minCpus;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum number of cpu cores required.
   * Field introduced in 20.1.1.
   * @param minCpus set the minCpus.
   */
  @VsoMethod
  public void setMinCpus(Integer  minCpus) {
    this.minCpus = minCpus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum memory required.
   * Field introduced in 20.1.1.
   * @return minMemory
   */
  @VsoMethod
  public Integer getMinMemory() {
    return minMemory;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum memory required.
   * Field introduced in 20.1.1.
   * @param minMemory set the minMemory.
   */
  @VsoMethod
  public void setMinMemory(Integer  minMemory) {
    this.minMemory = minMemory;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ControllerSize objControllerSize = (ControllerSize) o;
  return   Objects.equals(this.flavor, objControllerSize.flavor)&&
  Objects.equals(this.minMemory, objControllerSize.minMemory)&&
  Objects.equals(this.minCpus, objControllerSize.minCpus);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerSize {\n");
      sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    minCpus: ").append(toIndentedString(minCpus)).append("\n");
        sb.append("    minMemory: ").append(toIndentedString(minMemory)).append("\n");
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

