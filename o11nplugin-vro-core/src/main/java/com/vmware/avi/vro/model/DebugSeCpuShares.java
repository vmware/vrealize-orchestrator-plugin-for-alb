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
 * DebugSeCpuShares
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DebugSeCpuShares")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGSECPUSHARES, idAccessor = "getObjectID()")
@Service
public class DebugSeCpuShares extends AviRestResource  {
  @JsonProperty("cpu")
  private Integer cpu = null;

  @JsonProperty("shares")
  private Integer shares = null;

  
  /**
   * Number of cpu.
   * @return cpu
  **/
  @ApiModelProperty(required = true, value = "Number of cpu.")
  @NotNull


 
  @VsoMethod  
  public Integer getCpu() {
    return cpu;
  }
    
  @VsoMethod
  public void setCpu(Integer cpu) {
    this.cpu = cpu;
  }

  
  /**
   * Number of shares.
   * @return shares
  **/
  @ApiModelProperty(required = true, value = "Number of shares.")
  @NotNull


 
  @VsoMethod  
  public Integer getShares() {
    return shares;
  }
    
  @VsoMethod
  public void setShares(Integer shares) {
    this.shares = shares;
  }

  
  public String getObjectID() {
		return "DebugSeCpuShares";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugSeCpuShares debugSeCpuShares = (DebugSeCpuShares) o;
    return Objects.equals(this.cpu, debugSeCpuShares.cpu) &&
        Objects.equals(this.shares, debugSeCpuShares.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, shares);
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

