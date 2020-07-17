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
 * The SeMemoryLimitEventDetails is a POJO class extends AviRestResource that used for creating
 * SeMemoryLimitEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeMemoryLimitEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEMEMORYLIMITEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeMemoryLimitEventDetails extends AviRestResource {
  @JsonProperty("config_memory_status")
  @JsonInclude(Include.NON_NULL)
  private String configMemoryStatus = null;

  @JsonProperty("heap_config_hard_limit")
  @JsonInclude(Include.NON_NULL)
  private Integer heapConfigHardLimit = null;

  @JsonProperty("heap_config_soft_limit")
  @JsonInclude(Include.NON_NULL)
  private Integer heapConfigSoftLimit = null;

  @JsonProperty("heap_config_usage")
  @JsonInclude(Include.NON_NULL)
  private Integer heapConfigUsage = null;

  @JsonProperty("heap_conn_usage")
  @JsonInclude(Include.NON_NULL)
  private Integer heapConnUsage = null;

  @JsonProperty("se_ref")
  @JsonInclude(Include.NON_NULL)
  private String seRef = null;

  @JsonProperty("shm_config_hard_limit")
  @JsonInclude(Include.NON_NULL)
  private Integer shmConfigHardLimit = null;

  @JsonProperty("shm_config_soft_limit")
  @JsonInclude(Include.NON_NULL)
  private Integer shmConfigSoftLimit = null;

  @JsonProperty("shm_config_usage")
  @JsonInclude(Include.NON_NULL)
  private Integer shmConfigUsage = null;

  @JsonProperty("shm_conn_usage")
  @JsonInclude(Include.NON_NULL)
  private Integer shmConnUsage = null;



  /**
   * This is the getter method this will return the attribute value.
   * Current status of config memory.
   * Field introduced in 18.2.2.
   * @return configMemoryStatus
   */
  @VsoMethod
  public String getConfigMemoryStatus() {
    return configMemoryStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Current status of config memory.
   * Field introduced in 18.2.2.
   * @param configMemoryStatus set the configMemoryStatus.
   */
  @VsoMethod
  public void setConfigMemoryStatus(String  configMemoryStatus) {
    this.configMemoryStatus = configMemoryStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Heap config memory hard limit.
   * Field introduced in 18.2.2.
   * @return heapConfigHardLimit
   */
  @VsoMethod
  public Integer getHeapConfigHardLimit() {
    return heapConfigHardLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Heap config memory hard limit.
   * Field introduced in 18.2.2.
   * @param heapConfigHardLimit set the heapConfigHardLimit.
   */
  @VsoMethod
  public void setHeapConfigHardLimit(Integer  heapConfigHardLimit) {
    this.heapConfigHardLimit = heapConfigHardLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Heap config memory soft limit.
   * Field introduced in 18.2.2.
   * @return heapConfigSoftLimit
   */
  @VsoMethod
  public Integer getHeapConfigSoftLimit() {
    return heapConfigSoftLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Heap config memory soft limit.
   * Field introduced in 18.2.2.
   * @param heapConfigSoftLimit set the heapConfigSoftLimit.
   */
  @VsoMethod
  public void setHeapConfigSoftLimit(Integer  heapConfigSoftLimit) {
    this.heapConfigSoftLimit = heapConfigSoftLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Config memory usage in heap memory.
   * Field introduced in 18.2.2.
   * @return heapConfigUsage
   */
  @VsoMethod
  public Integer getHeapConfigUsage() {
    return heapConfigUsage;
  }

  /**
   * This is the setter method to the attribute.
   * Config memory usage in heap memory.
   * Field introduced in 18.2.2.
   * @param heapConfigUsage set the heapConfigUsage.
   */
  @VsoMethod
  public void setHeapConfigUsage(Integer  heapConfigUsage) {
    this.heapConfigUsage = heapConfigUsage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Connection memory usage in heap memory.
   * Field introduced in 18.2.2.
   * @return heapConnUsage
   */
  @VsoMethod
  public Integer getHeapConnUsage() {
    return heapConnUsage;
  }

  /**
   * This is the setter method to the attribute.
   * Connection memory usage in heap memory.
   * Field introduced in 18.2.2.
   * @param heapConnUsage set the heapConnUsage.
   */
  @VsoMethod
  public void setHeapConnUsage(Integer  heapConnUsage) {
    this.heapConnUsage = heapConnUsage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the se responsible for this event.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.2.
   * @return seRef
   */
  @VsoMethod
  public String getSeRef() {
    return seRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the se responsible for this event.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 18.2.2.
   * @param seRef set the seRef.
   */
  @VsoMethod
  public void setSeRef(String  seRef) {
    this.seRef = seRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Current shm config memory hard limit.
   * Field introduced in 18.2.2.
   * @return shmConfigHardLimit
   */
  @VsoMethod
  public Integer getShmConfigHardLimit() {
    return shmConfigHardLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Current shm config memory hard limit.
   * Field introduced in 18.2.2.
   * @param shmConfigHardLimit set the shmConfigHardLimit.
   */
  @VsoMethod
  public void setShmConfigHardLimit(Integer  shmConfigHardLimit) {
    this.shmConfigHardLimit = shmConfigHardLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Current shm config memory soft limit.
   * Field introduced in 18.2.2.
   * @return shmConfigSoftLimit
   */
  @VsoMethod
  public Integer getShmConfigSoftLimit() {
    return shmConfigSoftLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Current shm config memory soft limit.
   * Field introduced in 18.2.2.
   * @param shmConfigSoftLimit set the shmConfigSoftLimit.
   */
  @VsoMethod
  public void setShmConfigSoftLimit(Integer  shmConfigSoftLimit) {
    this.shmConfigSoftLimit = shmConfigSoftLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Config memory usage in shared memory.
   * Field introduced in 18.2.2.
   * @return shmConfigUsage
   */
  @VsoMethod
  public Integer getShmConfigUsage() {
    return shmConfigUsage;
  }

  /**
   * This is the setter method to the attribute.
   * Config memory usage in shared memory.
   * Field introduced in 18.2.2.
   * @param shmConfigUsage set the shmConfigUsage.
   */
  @VsoMethod
  public void setShmConfigUsage(Integer  shmConfigUsage) {
    this.shmConfigUsage = shmConfigUsage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Connection memory usage in shared memory.
   * Field introduced in 18.2.2.
   * @return shmConnUsage
   */
  @VsoMethod
  public Integer getShmConnUsage() {
    return shmConnUsage;
  }

  /**
   * This is the setter method to the attribute.
   * Connection memory usage in shared memory.
   * Field introduced in 18.2.2.
   * @param shmConnUsage set the shmConnUsage.
   */
  @VsoMethod
  public void setShmConnUsage(Integer  shmConnUsage) {
    this.shmConnUsage = shmConnUsage;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeMemoryLimitEventDetails objSeMemoryLimitEventDetails = (SeMemoryLimitEventDetails) o;
  return   Objects.equals(this.shmConnUsage, objSeMemoryLimitEventDetails.shmConnUsage)&&
  Objects.equals(this.heapConfigHardLimit, objSeMemoryLimitEventDetails.heapConfigHardLimit)&&
  Objects.equals(this.heapConnUsage, objSeMemoryLimitEventDetails.heapConnUsage)&&
  Objects.equals(this.shmConfigSoftLimit, objSeMemoryLimitEventDetails.shmConfigSoftLimit)&&
  Objects.equals(this.seRef, objSeMemoryLimitEventDetails.seRef)&&
  Objects.equals(this.heapConfigSoftLimit, objSeMemoryLimitEventDetails.heapConfigSoftLimit)&&
  Objects.equals(this.shmConfigUsage, objSeMemoryLimitEventDetails.shmConfigUsage)&&
  Objects.equals(this.shmConfigHardLimit, objSeMemoryLimitEventDetails.shmConfigHardLimit)&&
  Objects.equals(this.configMemoryStatus, objSeMemoryLimitEventDetails.configMemoryStatus)&&
  Objects.equals(this.heapConfigUsage, objSeMemoryLimitEventDetails.heapConfigUsage);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeMemoryLimitEventDetails {\n");
      sb.append("    configMemoryStatus: ").append(toIndentedString(configMemoryStatus)).append("\n");
        sb.append("    heapConfigHardLimit: ").append(toIndentedString(heapConfigHardLimit)).append("\n");
        sb.append("    heapConfigSoftLimit: ").append(toIndentedString(heapConfigSoftLimit)).append("\n");
        sb.append("    heapConfigUsage: ").append(toIndentedString(heapConfigUsage)).append("\n");
        sb.append("    heapConnUsage: ").append(toIndentedString(heapConnUsage)).append("\n");
        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
        sb.append("    shmConfigHardLimit: ").append(toIndentedString(shmConfigHardLimit)).append("\n");
        sb.append("    shmConfigSoftLimit: ").append(toIndentedString(shmConfigSoftLimit)).append("\n");
        sb.append("    shmConfigUsage: ").append(toIndentedString(shmConfigUsage)).append("\n");
        sb.append("    shmConnUsage: ").append(toIndentedString(shmConnUsage)).append("\n");
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

