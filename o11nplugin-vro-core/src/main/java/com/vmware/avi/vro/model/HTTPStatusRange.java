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
 * HTTPStatusRange
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:16:36.466+05:30")

@VsoObject(create = false, name = "HTTPStatusRange")
@VsoFinder(name = Constants.FINDER_VRO_HTTPSTATUSRANGE, idAccessor = "getObjectID()")
@Service
public class HTTPStatusRange extends AviRestResource  {
  @JsonProperty("begin")
  private Integer begin = null;

  @JsonProperty("end")
  private Integer end = null;

  
  /**
   * Starting HTTP response status code.
   * @return begin
  **/
  @ApiModelProperty(required = true, value = "Starting HTTP response status code.")
  @NotNull


 
  @VsoMethod  
  public Integer getBegin() {
    return begin;
  }
    
  @VsoMethod
  public void setBegin(Integer begin) {
    this.begin = begin;
  }

  
  /**
   * Ending HTTP response status code.
   * @return end
  **/
  @ApiModelProperty(required = true, value = "Ending HTTP response status code.")
  @NotNull


 
  @VsoMethod  
  public Integer getEnd() {
    return end;
  }
    
  @VsoMethod
  public void setEnd(Integer end) {
    this.end = end;
  }

  
  public String getObjectID() {
		return "HTTPStatusRange";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPStatusRange htTPStatusRange = (HTTPStatusRange) o;
    return Objects.equals(this.begin, htTPStatusRange.begin) &&
        Objects.equals(this.end, htTPStatusRange.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(begin, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPStatusRange {\n");
    
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

