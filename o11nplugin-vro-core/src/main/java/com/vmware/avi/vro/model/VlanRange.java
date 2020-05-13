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
 * VlanRange
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VlanRange")
@VsoFinder(name = Constants.FINDER_VRO_VLANRANGE, idAccessor = "getObjectID()")
@Service
public class VlanRange extends AviRestResource  {
  @JsonProperty("end")
  private Integer end = null;

  @JsonProperty("start")
  private Integer start = null;

  
  /**
   * Number of end.
   * @return end
  **/
  @ApiModelProperty(required = true, value = "Number of end.")
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
   * Number of start.
   * @return start
  **/
  @ApiModelProperty(required = true, value = "Number of start.")
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
		return "VlanRange";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VlanRange vlanRange = (VlanRange) o;
    return Objects.equals(this.end, vlanRange.end) &&
        Objects.equals(this.start, vlanRange.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VlanRange {\n");
    
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

