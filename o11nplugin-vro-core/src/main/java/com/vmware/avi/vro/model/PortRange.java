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
 * The PortRange is a POJO class extends AviRestResource that used for creating
 * PortRange.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PortRange")
@VsoFinder(name = Constants.FINDER_VRO_PORTRANGE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PortRange extends AviRestResource {
  @JsonProperty("end")
  @JsonInclude(Include.NON_NULL)
  private Integer end = null;

  @JsonProperty("start")
  @JsonInclude(Include.NON_NULL)
  private Integer start = null;



  /**
   * This is the getter method this will return the attribute value.
   * Tcp/udp port range end (inclusive).
   * Allowed values are 1-65535.
   * @return end
   */
  @VsoMethod
  public Integer getEnd() {
    return end;
  }

  /**
   * This is the setter method to the attribute.
   * Tcp/udp port range end (inclusive).
   * Allowed values are 1-65535.
   * @param end set the end.
   */
  @VsoMethod
  public void setEnd(Integer  end) {
    this.end = end;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tcp/udp port range start (inclusive).
   * Allowed values are 1-65535.
   * @return start
   */
  @VsoMethod
  public Integer getStart() {
    return start;
  }

  /**
   * This is the setter method to the attribute.
   * Tcp/udp port range start (inclusive).
   * Allowed values are 1-65535.
   * @param start set the start.
   */
  @VsoMethod
  public void setStart(Integer  start) {
    this.start = start;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PortRange objPortRange = (PortRange) o;
  return   Objects.equals(this.start, objPortRange.start)&&
  Objects.equals(this.end, objPortRange.end);
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

