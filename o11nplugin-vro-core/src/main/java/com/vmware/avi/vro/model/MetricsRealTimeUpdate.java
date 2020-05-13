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
 * MetricsRealTimeUpdate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "MetricsRealTimeUpdate")
@VsoFinder(name = Constants.FINDER_VRO_METRICSREALTIMEUPDATE, idAccessor = "getObjectID()")
@Service
public class MetricsRealTimeUpdate extends AviRestResource  {
  @JsonProperty("duration")
  private Integer duration = 30;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  
  /**
   * Real time metrics collection duration in minutes. 0 for infinite. Special values are 0 - 'infinite'.
   * @return duration
  **/
  @ApiModelProperty(value = "Real time metrics collection duration in minutes. 0 for infinite. Special values are 0 - 'infinite'.")


 
  @VsoMethod  
  public Integer getDuration() {
    return duration;
  }
    
  @VsoMethod
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * Enables real time metrics collection.  When disabled, 6 hour view is the most granular the system will track.
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "Enables real time metrics collection.  When disabled, 6 hour view is the most granular the system will track.")
  @NotNull


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  public String getObjectID() {
		return "MetricsRealTimeUpdate";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsRealTimeUpdate metricsRealTimeUpdate = (MetricsRealTimeUpdate) o;
    return Objects.equals(this.duration, metricsRealTimeUpdate.duration) &&
        Objects.equals(this.enabled, metricsRealTimeUpdate.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, enabled);
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

