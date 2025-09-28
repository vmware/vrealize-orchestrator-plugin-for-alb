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
 * The ApplicationSamplingConfig is a POJO class extends AviRestResource that used for creating
 * ApplicationSamplingConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApplicationSamplingConfig")
@VsoFinder(name = Constants.FINDER_VRO_APPLICATIONSAMPLINGCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApplicationSamplingConfig extends AviRestResource {
    @JsonProperty("max_sampling_percent")
    @JsonInclude(Include.NON_NULL)
    private Integer maxSamplingPercent = 1;

    @JsonProperty("min_update_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer minUpdateInterval = 30;



  /**
   * This is the getter method this will return the attribute value.
   * Maximum percent of the application data subjected to application learning.
   * Allowed values are 1-100.
   * Field introduced in 31.2.1.
   * Unit is percent.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return maxSamplingPercent
   */
  @VsoMethod
  public Integer getMaxSamplingPercent() {
    return maxSamplingPercent;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum percent of the application data subjected to application learning.
   * Allowed values are 1-100.
   * Field introduced in 31.2.1.
   * Unit is percent.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param maxSamplingPercent set the maxSamplingPercent.
   */
  @VsoMethod
  public void setMaxSamplingPercent(Integer  maxSamplingPercent) {
    this.maxSamplingPercent = maxSamplingPercent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum periodicity at which serviceengine sends the application data to the controller.
   * Allowed values are 1-60.
   * Field introduced in 31.2.1.
   * Unit is min.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @return minUpdateInterval
   */
  @VsoMethod
  public Integer getMinUpdateInterval() {
    return minUpdateInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum periodicity at which serviceengine sends the application data to the controller.
   * Allowed values are 1-60.
   * Field introduced in 31.2.1.
   * Unit is min.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @param minUpdateInterval set the minUpdateInterval.
   */
  @VsoMethod
  public void setMinUpdateInterval(Integer  minUpdateInterval) {
    this.minUpdateInterval = minUpdateInterval;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ApplicationSamplingConfig objApplicationSamplingConfig = (ApplicationSamplingConfig) o;
  return   Objects.equals(this.maxSamplingPercent, objApplicationSamplingConfig.maxSamplingPercent)&&
  Objects.equals(this.minUpdateInterval, objApplicationSamplingConfig.minUpdateInterval);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApplicationSamplingConfig {\n");
      sb.append("    maxSamplingPercent: ").append(toIndentedString(maxSamplingPercent)).append("\n");
        sb.append("    minUpdateInterval: ").append(toIndentedString(minUpdateInterval)).append("\n");
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

