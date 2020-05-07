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
 * FullClientLogs
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "FullClientLogs")
@VsoFinder(name = Constants.FINDER_VRO_FULLCLIENTLOGS, idAccessor = "getObjectID()")
@Service
public class FullClientLogs extends AviRestResource  {
  @JsonProperty("all_headers")
  private Boolean allHeaders = null;

  @JsonProperty("duration")
  private Integer duration = 30;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("throttle")
  private Integer throttle = 10;

  
  /**
   * [DEPRECATED] Log all headers. Please use the all_headers flag in AnalyticsPolicy. Field deprecated in 18.1.4, 18.2.1.
   * @return allHeaders
  **/
  @ApiModelProperty(value = "[DEPRECATED] Log all headers. Please use the all_headers flag in AnalyticsPolicy. Field deprecated in 18.1.4, 18.2.1.")


 
  @VsoMethod  
  public Boolean isAllHeaders() {
    return allHeaders;
  }
    
  @VsoMethod
  public void setAllHeaders(Boolean allHeaders) {
    this.allHeaders = allHeaders;
  }

  
  /**
   * How long should the system capture all logs, measured in minutes. Set to 0 for infinite. Special values are 0 - 'infinite'.
   * @return duration
  **/
  @ApiModelProperty(value = "How long should the system capture all logs, measured in minutes. Set to 0 for infinite. Special values are 0 - 'infinite'.")


 
  @VsoMethod  
  public Integer getDuration() {
    return duration;
  }
    
  @VsoMethod
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * Capture all client logs including connections and requests.  When disabled, only errors will be logged.
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "Capture all client logs including connections and requests.  When disabled, only errors will be logged.")
  @NotNull


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * This setting limits the number of non-significant logs generated per second for this VS on each SE. Default is 10 logs per second. Set it to zero (0) to disable throttling. Field introduced in 17.1.3.
   * @return throttle
  **/
  @ApiModelProperty(value = "This setting limits the number of non-significant logs generated per second for this VS on each SE. Default is 10 logs per second. Set it to zero (0) to disable throttling. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Integer getThrottle() {
    return throttle;
  }
    
  @VsoMethod
  public void setThrottle(Integer throttle) {
    this.throttle = throttle;
  }

  
  public String getObjectID() {
		return "FullClientLogs";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullClientLogs fullClientLogs = (FullClientLogs) o;
    return Objects.equals(this.allHeaders, fullClientLogs.allHeaders) &&
        Objects.equals(this.duration, fullClientLogs.duration) &&
        Objects.equals(this.enabled, fullClientLogs.enabled) &&
        Objects.equals(this.throttle, fullClientLogs.throttle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allHeaders, duration, enabled, throttle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullClientLogs {\n");
    
    sb.append("    allHeaders: ").append(toIndentedString(allHeaders)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    throttle: ").append(toIndentedString(throttle)).append("\n");
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

