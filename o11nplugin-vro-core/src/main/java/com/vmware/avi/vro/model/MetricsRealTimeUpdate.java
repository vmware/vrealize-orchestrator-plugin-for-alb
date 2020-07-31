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
 * The MetricsRealTimeUpdate is a POJO class extends AviRestResource that used for creating
 * MetricsRealTimeUpdate.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MetricsRealTimeUpdate")
@VsoFinder(name = Constants.FINDER_VRO_METRICSREALTIMEUPDATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MetricsRealTimeUpdate extends AviRestResource {
  @JsonProperty("duration")
  @JsonInclude(Include.NON_NULL)
  private Integer duration = 30;

  @JsonProperty("enabled")
  @JsonInclude(Include.NON_NULL)
  private Boolean enabled = false;



  /**
   * This is the getter method this will return the attribute value.
   * Real time metrics collection duration in minutes.
   * 0 for infinite.
   * Special values are 0 - 'infinite'.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @return duration
   */
  @VsoMethod
  public Integer getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Real time metrics collection duration in minutes.
   * 0 for infinite.
   * Special values are 0 - 'infinite'.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(Integer  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enables real time metrics collection.
   * When disabled, 6 hour view is the most granular the system will track.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enables real time metrics collection.
   * When disabled, 6 hour view is the most granular the system will track.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MetricsRealTimeUpdate objMetricsRealTimeUpdate = (MetricsRealTimeUpdate) o;
  return   Objects.equals(this.enabled, objMetricsRealTimeUpdate.enabled)&&
  Objects.equals(this.duration, objMetricsRealTimeUpdate.duration);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricsRealTimeUpdate {\n");
      sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

