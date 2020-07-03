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
 * The MesosSeResources is a POJO class extends AviRestResource that used for creating
 * MesosSeResources.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MesosSeResources")
@VsoFinder(name = Constants.FINDER_VRO_MESOSSERESOURCES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MesosSeResources extends AviRestResource {
  @JsonProperty("attribute_key")
  @JsonInclude(Include.NON_NULL)
  private String attributeKey = null;

  @JsonProperty("attribute_value")
  @JsonInclude(Include.NON_NULL)
  private String attributeValue = null;

  @JsonProperty("cpu")
  @JsonInclude(Include.NON_NULL)
  private float cpu = 2.0f;

  @JsonProperty("memory")
  @JsonInclude(Include.NON_NULL)
  private Integer memory = 4096;



  /**
   * This is the getter method this will return the attribute value.
   * Attribute (fleet or mesos) key of hosts.
   * @return attributeKey
   */
  @VsoMethod
  public String getAttributeKey() {
    return attributeKey;
  }

  /**
   * This is the setter method to the attribute.
   * Attribute (fleet or mesos) key of hosts.
   * @param attributeKey set the attributeKey.
   */
  @VsoMethod
  public void setAttributeKey(String  attributeKey) {
    this.attributeKey = attributeKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Attribute (fleet or mesos) value of hosts.
   * @return attributeValue
   */
  @VsoMethod
  public String getAttributeValue() {
    return attributeValue;
  }

  /**
   * This is the setter method to the attribute.
   * Attribute (fleet or mesos) value of hosts.
   * @param attributeValue set the attributeValue.
   */
  @VsoMethod
  public void setAttributeValue(String  attributeValue) {
    this.attributeValue = attributeValue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Obsolete - ignored.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.0.
   * @return cpu
   */
  @VsoMethod
  public Float getCpu() {
    return cpu;
  }

  /**
   * This is the setter method to the attribute.
   * Obsolete - ignored.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.0.
   * @param cpu set the cpu.
   */
  @VsoMethod
  public void setCpu(Float  cpu) {
    this.cpu = cpu;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Obsolete - ignored.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
   * @return memory
   */
  @VsoMethod
  public Integer getMemory() {
    return memory;
  }

  /**
   * This is the setter method to the attribute.
   * Obsolete - ignored.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
   * @param memory set the memory.
   */
  @VsoMethod
  public void setMemory(Integer  memory) {
    this.memory = memory;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MesosSeResources objMesosSeResources = (MesosSeResources) o;
  return   Objects.equals(this.attributeKey, objMesosSeResources.attributeKey)&&
  Objects.equals(this.memory, objMesosSeResources.memory)&&
  Objects.equals(this.cpu, objMesosSeResources.cpu)&&
  Objects.equals(this.attributeValue, objMesosSeResources.attributeValue);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MesosSeResources {\n");
      sb.append("    attributeKey: ").append(toIndentedString(attributeKey)).append("\n");
        sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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
