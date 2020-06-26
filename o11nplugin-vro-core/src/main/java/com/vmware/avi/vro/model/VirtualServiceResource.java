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
 * The VirtualServiceResource is a POJO class extends AviRestResource that used for creating
 * VirtualServiceResource.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VirtualServiceResource")
@VsoFinder(name = Constants.FINDER_VRO_VIRTUALSERVICERESOURCE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VirtualServiceResource extends AviRestResource {
  @JsonProperty("is_exclusive")
  @JsonInclude(Include.NON_NULL)
  private Boolean isExclusive = null;

  @JsonProperty("memory")
  @JsonInclude(Include.NON_NULL)
  private Integer memory = null;

  @JsonProperty("num_se")
  @JsonInclude(Include.NON_NULL)
  private Integer numSe = null;

  @JsonProperty("num_standby_se")
  @JsonInclude(Include.NON_NULL)
  private Integer numStandbySe = null;

  @JsonProperty("num_vcpus")
  @JsonInclude(Include.NON_NULL)
  private Integer numVcpus = null;

  @JsonProperty("scalein_primary")
  @JsonInclude(Include.NON_NULL)
  private Boolean scaleinPrimary = null;

  @JsonProperty("scalein_se_uuid")
  @JsonInclude(Include.NON_NULL)
  private String scaleinSeUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * This field is not being used.
   * Field deprecated in 18.1.5, 18.2.1.
   * @return isExclusive
   */
  @VsoMethod
  public Boolean getIsExclusive() {
    return isExclusive;
  }

  /**
   * This is the setter method to the attribute.
   * This field is not being used.
   * Field deprecated in 18.1.5, 18.2.1.
   * @param isExclusive set the isExclusive.
   */
  @VsoMethod
  public void setIsExclusive(Boolean  isExclusive) {
    this.isExclusive = isExclusive;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property memory of obj type virtualserviceresource field type str  type integer.
   * @return memory
   */
  @VsoMethod
  public Integer getMemory() {
    return memory;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property memory of obj type virtualserviceresource field type str  type integer.
   * @param memory set the memory.
   */
  @VsoMethod
  public void setMemory(Integer  memory) {
    this.memory = memory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_se of obj type virtualserviceresource field type str  type integer.
   * @return numSe
   */
  @VsoMethod
  public Integer getNumSe() {
    return numSe;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_se of obj type virtualserviceresource field type str  type integer.
   * @param numSe set the numSe.
   */
  @VsoMethod
  public void setNumSe(Integer  numSe) {
    this.numSe = numSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_standby_se of obj type virtualserviceresource field type str  type integer.
   * @return numStandbySe
   */
  @VsoMethod
  public Integer getNumStandbySe() {
    return numStandbySe;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_standby_se of obj type virtualserviceresource field type str  type integer.
   * @param numStandbySe set the numStandbySe.
   */
  @VsoMethod
  public void setNumStandbySe(Integer  numStandbySe) {
    this.numStandbySe = numStandbySe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_vcpus of obj type virtualserviceresource field type str  type integer.
   * @return numVcpus
   */
  @VsoMethod
  public Integer getNumVcpus() {
    return numVcpus;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_vcpus of obj type virtualserviceresource field type str  type integer.
   * @param numVcpus set the numVcpus.
   */
  @VsoMethod
  public void setNumVcpus(Integer  numVcpus) {
    this.numVcpus = numVcpus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Indicates if the primary se is being scaled in.
   * This state is now derived from the virtual service runtime.
   * Field deprecated in 18.1.5, 18.2.1.
   * @return scaleinPrimary
   */
  @VsoMethod
  public Boolean getScaleinPrimary() {
    return scaleinPrimary;
  }

  /**
   * This is the setter method to the attribute.
   * Indicates if the primary se is being scaled in.
   * This state is now derived from the virtual service runtime.
   * Field deprecated in 18.1.5, 18.2.1.
   * @param scaleinPrimary set the scaleinPrimary.
   */
  @VsoMethod
  public void setScaleinPrimary(Boolean  scaleinPrimary) {
    this.scaleinPrimary = scaleinPrimary;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Indicates which se is being scaled in.
   * This information is now derived from the virtual service runtime.
   * Field deprecated in 18.1.5, 18.2.1.
   * @return scaleinSeUuid
   */
  @VsoMethod
  public String getScaleinSeUuid() {
    return scaleinSeUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Indicates which se is being scaled in.
   * This information is now derived from the virtual service runtime.
   * Field deprecated in 18.1.5, 18.2.1.
   * @param scaleinSeUuid set the scaleinSeUuid.
   */
  @VsoMethod
  public void setScaleinSeUuid(String  scaleinSeUuid) {
    this.scaleinSeUuid = scaleinSeUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VirtualServiceResource objVirtualServiceResource = (VirtualServiceResource) o;
  return   Objects.equals(this.scaleinPrimary, objVirtualServiceResource.scaleinPrimary)&&
  Objects.equals(this.numVcpus, objVirtualServiceResource.numVcpus)&&
  Objects.equals(this.numStandbySe, objVirtualServiceResource.numStandbySe)&&
  Objects.equals(this.isExclusive, objVirtualServiceResource.isExclusive)&&
  Objects.equals(this.memory, objVirtualServiceResource.memory)&&
  Objects.equals(this.numSe, objVirtualServiceResource.numSe)&&
  Objects.equals(this.scaleinSeUuid, objVirtualServiceResource.scaleinSeUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VirtualServiceResource {\n");
      sb.append("    isExclusive: ").append(toIndentedString(isExclusive)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    numSe: ").append(toIndentedString(numSe)).append("\n");
        sb.append("    numStandbySe: ").append(toIndentedString(numStandbySe)).append("\n");
        sb.append("    numVcpus: ").append(toIndentedString(numVcpus)).append("\n");
        sb.append("    scaleinPrimary: ").append(toIndentedString(scaleinPrimary)).append("\n");
        sb.append("    scaleinSeUuid: ").append(toIndentedString(scaleinSeUuid)).append("\n");
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
