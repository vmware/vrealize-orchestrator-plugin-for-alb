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
 * The FalsePositiveLearningConfig is a POJO class extends AviRestResource that used for creating
 * FalsePositiveLearningConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "FalsePositiveLearningConfig")
@VsoFinder(name = Constants.FINDER_VRO_FALSEPOSITIVELEARNINGCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class FalsePositiveLearningConfig extends AviRestResource {
    @JsonProperty("max_apps_supported")
    @JsonInclude(Include.NON_NULL)
    private Integer maxAppsSupported = 2;

    @JsonProperty("min_monitor_time")
    @JsonInclude(Include.NON_NULL)
    private Integer minMonitorTime = 10080;

    @JsonProperty("min_trans_per_application")
    @JsonInclude(Include.NON_NULL)
    private Integer minTransPerApplication = 1000000;

    @JsonProperty("min_trans_per_uri")
    @JsonInclude(Include.NON_NULL)
    private Integer minTransPerUri = 10000;



  /**
   * This is the getter method this will return the attribute value.
   * Max number of applications supported to detect false positive.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return maxAppsSupported
   */
  @VsoMethod
  public Integer getMaxAppsSupported() {
    return maxAppsSupported;
  }

  /**
   * This is the setter method to the attribute.
   * Max number of applications supported to detect false positive.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param maxAppsSupported set the maxAppsSupported.
   */
  @VsoMethod
  public void setMaxAppsSupported(Integer  maxAppsSupported) {
    this.maxAppsSupported = maxAppsSupported;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum monitor time required to automatically detect false positive.
   * Unit is minutes.
   * Field introduced in 22.1.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10080.
   * @return minMonitorTime
   */
  @VsoMethod
  public Integer getMinMonitorTime() {
    return minMonitorTime;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum monitor time required to automatically detect false positive.
   * Unit is minutes.
   * Field introduced in 22.1.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10080.
   * @param minMonitorTime set the minMonitorTime.
   */
  @VsoMethod
  public void setMinMonitorTime(Integer  minMonitorTime) {
    this.minMonitorTime = minMonitorTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum number of transactions in one application required to automatically detect false positive.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000000.
   * @return minTransPerApplication
   */
  @VsoMethod
  public Integer getMinTransPerApplication() {
    return minTransPerApplication;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum number of transactions in one application required to automatically detect false positive.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000000.
   * @param minTransPerApplication set the minTransPerApplication.
   */
  @VsoMethod
  public void setMinTransPerApplication(Integer  minTransPerApplication) {
    this.minTransPerApplication = minTransPerApplication;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum number of transactions in one uri required to automatically detect false positive.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
   * @return minTransPerUri
   */
  @VsoMethod
  public Integer getMinTransPerUri() {
    return minTransPerUri;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum number of transactions in one uri required to automatically detect false positive.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
   * @param minTransPerUri set the minTransPerUri.
   */
  @VsoMethod
  public void setMinTransPerUri(Integer  minTransPerUri) {
    this.minTransPerUri = minTransPerUri;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  FalsePositiveLearningConfig objFalsePositiveLearningConfig = (FalsePositiveLearningConfig) o;
  return   Objects.equals(this.minTransPerApplication, objFalsePositiveLearningConfig.minTransPerApplication)&&
  Objects.equals(this.minTransPerUri, objFalsePositiveLearningConfig.minTransPerUri)&&
  Objects.equals(this.minMonitorTime, objFalsePositiveLearningConfig.minMonitorTime)&&
  Objects.equals(this.maxAppsSupported, objFalsePositiveLearningConfig.maxAppsSupported);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class FalsePositiveLearningConfig {\n");
      sb.append("    maxAppsSupported: ").append(toIndentedString(maxAppsSupported)).append("\n");
        sb.append("    minMonitorTime: ").append(toIndentedString(minMonitorTime)).append("\n");
        sb.append("    minTransPerApplication: ").append(toIndentedString(minTransPerApplication)).append("\n");
        sb.append("    minTransPerUri: ").append(toIndentedString(minTransPerUri)).append("\n");
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

