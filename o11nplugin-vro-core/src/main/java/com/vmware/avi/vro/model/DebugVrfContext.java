package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DebugVrf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * DebugVrfContext
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DebugVrfContext")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGVRFCONTEXT, idAccessor = "getObjectID()")
@Service
public class DebugVrfContext extends AviRestResource  {
  @JsonProperty("command_buffer_interval")
  private Integer commandBufferInterval = 2;

  @JsonProperty("command_buffer_size")
  private Integer commandBufferSize = 32768;

  @JsonProperty("flags")
  @Valid
  private List<DebugVrf> flags = null;

  
  /**
   * Vrf config command buffer process interval. Allowed values are 1-4. Field introduced in 17.2.13,18.1.5,18.2.1.
   * @return commandBufferInterval
  **/
  @ApiModelProperty(value = "Vrf config command buffer process interval. Allowed values are 1-4. Field introduced in 17.2.13,18.1.5,18.2.1.")


 
  @VsoMethod  
  public Integer getCommandBufferInterval() {
    return commandBufferInterval;
  }
    
  @VsoMethod
  public void setCommandBufferInterval(Integer commandBufferInterval) {
    this.commandBufferInterval = commandBufferInterval;
  }

  
  /**
   * Vrf config command buffer size. Allowed values are 1-32768. Field introduced in 17.2.13,18.1.5,18.2.1.
   * @return commandBufferSize
  **/
  @ApiModelProperty(value = "Vrf config command buffer size. Allowed values are 1-32768. Field introduced in 17.2.13,18.1.5,18.2.1.")


 
  @VsoMethod  
  public Integer getCommandBufferSize() {
    return commandBufferSize;
  }
    
  @VsoMethod
  public void setCommandBufferSize(Integer commandBufferSize) {
    this.commandBufferSize = commandBufferSize;
  }

  
  public DebugVrfContext addFlagsItem(DebugVrf flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<DebugVrf>();
    }
    this.flags.add(flagsItem);
    return this;
  }
  
  /**
   *  Field introduced in 17.1.1.
   * @return flags
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<DebugVrf> getFlags() {
    return flags;
  }
    
  @VsoMethod
  public void setFlags(List<DebugVrf> flags) {
    this.flags = flags;
  }

  
  public String getObjectID() {
		return "DebugVrfContext";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugVrfContext debugVrfContext = (DebugVrfContext) o;
    return Objects.equals(this.commandBufferInterval, debugVrfContext.commandBufferInterval) &&
        Objects.equals(this.commandBufferSize, debugVrfContext.commandBufferSize) &&
        Objects.equals(this.flags, debugVrfContext.flags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandBufferInterval, commandBufferSize, flags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugVrfContext {\n");
    
    sb.append("    commandBufferInterval: ").append(toIndentedString(commandBufferInterval)).append("\n");
    sb.append("    commandBufferSize: ").append(toIndentedString(commandBufferSize)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
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

