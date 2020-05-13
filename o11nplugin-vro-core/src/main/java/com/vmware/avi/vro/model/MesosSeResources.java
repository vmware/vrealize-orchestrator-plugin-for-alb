package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * MesosSeResources
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "MesosSeResources")
@VsoFinder(name = Constants.FINDER_VRO_MESOSSERESOURCES, idAccessor = "getObjectID()")
@Service
public class MesosSeResources extends AviRestResource  {
  @JsonProperty("attribute_key")
  private String attributeKey = null;

  @JsonProperty("attribute_value")
  private String attributeValue = null;

  @JsonProperty("cpu")
  private Float cpu = 2.0f;

  @JsonProperty("memory")
  private Integer memory = 4096;

  
  /**
   * Attribute (Fleet or Mesos) key of Hosts.
   * @return attributeKey
  **/
  @ApiModelProperty(required = true, value = "Attribute (Fleet or Mesos) key of Hosts.")
  @NotNull


 
  @VsoMethod  
  public String getAttributeKey() {
    return attributeKey;
  }
    
  @VsoMethod
  public void setAttributeKey(String attributeKey) {
    this.attributeKey = attributeKey;
  }

  
  /**
   * Attribute (Fleet or Mesos) value of Hosts.
   * @return attributeValue
  **/
  @ApiModelProperty(required = true, value = "Attribute (Fleet or Mesos) value of Hosts.")
  @NotNull


 
  @VsoMethod  
  public String getAttributeValue() {
    return attributeValue;
  }
    
  @VsoMethod
  public void setAttributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
  }

  
  /**
   * Obsolete - ignored.
   * @return cpu
  **/
  @ApiModelProperty(value = "Obsolete - ignored.")


 
  @VsoMethod  
  public Float getCpu() {
    return cpu;
  }
    
  @VsoMethod
  public void setCpu(Float cpu) {
    this.cpu = cpu;
  }

  
  /**
   * Obsolete - ignored.
   * @return memory
  **/
  @ApiModelProperty(value = "Obsolete - ignored.")


 
  @VsoMethod  
  public Integer getMemory() {
    return memory;
  }
    
  @VsoMethod
  public void setMemory(Integer memory) {
    this.memory = memory;
  }

  
  public String getObjectID() {
		return "MesosSeResources";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MesosSeResources mesosSeResources = (MesosSeResources) o;
    return Objects.equals(this.attributeKey, mesosSeResources.attributeKey) &&
        Objects.equals(this.attributeValue, mesosSeResources.attributeValue) &&
        Objects.equals(this.cpu, mesosSeResources.cpu) &&
        Objects.equals(this.memory, mesosSeResources.memory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeKey, attributeValue, cpu, memory);
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

