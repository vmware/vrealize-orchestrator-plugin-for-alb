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
 * The MetricsMissingDataInterval is a POJO class extends AviRestResource that used for creating
 * MetricsMissingDataInterval.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MetricsMissingDataInterval")
@VsoFinder(name = Constants.FINDER_VRO_METRICSMISSINGDATAINTERVAL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MetricsMissingDataInterval extends AviRestResource {
    @JsonProperty("end")
    @JsonInclude(Include.NON_NULL)
    private String end;

    @JsonProperty("start")
    @JsonInclude(Include.NON_NULL)
    private String start;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return end
   */
  @VsoMethod
  public String getEnd() {
    return end;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param end set the end.
   */
  @VsoMethod
  public void setEnd(String  end) {
    this.end = end;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return start
   */
  @VsoMethod
  public String getStart() {
    return start;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param start set the start.
   */
  @VsoMethod
  public void setStart(String  start) {
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
  MetricsMissingDataInterval objMetricsMissingDataInterval = (MetricsMissingDataInterval) o;
  return   Objects.equals(this.start, objMetricsMissingDataInterval.start)&&
  Objects.equals(this.end, objMetricsMissingDataInterval.end);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricsMissingDataInterval {\n");
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

