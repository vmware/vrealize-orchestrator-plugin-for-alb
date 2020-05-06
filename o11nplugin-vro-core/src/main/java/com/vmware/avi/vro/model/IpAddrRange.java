package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
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
 * IpAddrRange
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "IpAddrRange")
@VsoFinder(name = Constants.FINDER_VRO_IPADDRRANGE, idAccessor = "getObjectID()")
@Service
public class IpAddrRange extends AviRestResource  {
  @JsonProperty("begin")
  private IpAddr begin = null;

  @JsonProperty("end")
  private IpAddr end = null;

  
  /**
   * Starting IP address of the range.
   * @return begin
  **/
  @ApiModelProperty(required = true, value = "Starting IP address of the range.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddr getBegin() {
    return begin;
  }
    
  @VsoMethod
  public void setBegin(IpAddr begin) {
    this.begin = begin;
  }

  
  /**
   * Ending IP address of the range.
   * @return end
  **/
  @ApiModelProperty(required = true, value = "Ending IP address of the range.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddr getEnd() {
    return end;
  }
    
  @VsoMethod
  public void setEnd(IpAddr end) {
    this.end = end;
  }

  
  public String getObjectID() {
		return "IpAddrRange";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddrRange ipAddrRange = (IpAddrRange) o;
    return Objects.equals(this.begin, ipAddrRange.begin) &&
        Objects.equals(this.end, ipAddrRange.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(begin, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddrRange {\n");
    
    sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

