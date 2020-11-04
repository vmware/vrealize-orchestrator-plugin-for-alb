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
 * The TimeStamp is a POJO class extends AviRestResource that used for creating
 * TimeStamp.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TimeStamp")
@VsoFinder(name = Constants.FINDER_VRO_TIMESTAMP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TimeStamp extends AviRestResource {
    @JsonProperty("secs")
    @JsonInclude(Include.NON_NULL)
    private Integer secs = null;

    @JsonProperty("usecs")
    @JsonInclude(Include.NON_NULL)
    private Integer usecs = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property secs of obj type timestamp field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return secs
   */
  @VsoMethod
  public Integer getSecs() {
    return secs;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property secs of obj type timestamp field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param secs set the secs.
   */
  @VsoMethod
  public void setSecs(Integer  secs) {
    this.secs = secs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property usecs of obj type timestamp field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return usecs
   */
  @VsoMethod
  public Integer getUsecs() {
    return usecs;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property usecs of obj type timestamp field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param usecs set the usecs.
   */
  @VsoMethod
  public void setUsecs(Integer  usecs) {
    this.usecs = usecs;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TimeStamp objTimeStamp = (TimeStamp) o;
  return   Objects.equals(this.secs, objTimeStamp.secs)&&
  Objects.equals(this.usecs, objTimeStamp.usecs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TimeStamp {\n");
      sb.append("    secs: ").append(toIndentedString(secs)).append("\n");
        sb.append("    usecs: ").append(toIndentedString(usecs)).append("\n");
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

