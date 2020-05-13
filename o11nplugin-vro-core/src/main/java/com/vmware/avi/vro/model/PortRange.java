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
 * PortRange
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "PortRange")
@VsoFinder(name = Constants.FINDER_VRO_PORTRANGE, idAccessor = "getObjectID()")
@Service
public class PortRange extends AviRestResource  {
  @JsonProperty("end")
  private Integer end = null;

  @JsonProperty("start")
  private Integer start = null;

  
  /**
   * TCP/UDP port range end (inclusive). Allowed values are 1-65535.
   * @return end
  **/
  @ApiModelProperty(required = true, value = "TCP/UDP port range end (inclusive). Allowed values are 1-65535.")
  @NotNull


 
  @VsoMethod  
  public Integer getEnd() {
    return end;
  }
    
  @VsoMethod
  public void setEnd(Integer end) {
    this.end = end;
  }

  
  /**
   * TCP/UDP port range start (inclusive). Allowed values are 1-65535.
   * @return start
  **/
  @ApiModelProperty(required = true, value = "TCP/UDP port range start (inclusive). Allowed values are 1-65535.")
  @NotNull


 
  @VsoMethod  
  public Integer getStart() {
    return start;
  }
    
  @VsoMethod
  public void setStart(Integer start) {
    this.start = start;
  }

  
  public String getObjectID() {
		return "PortRange";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortRange portRange = (PortRange) o;
    return Objects.equals(this.end, portRange.end) &&
        Objects.equals(this.start, portRange.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortRange {\n");
    
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

