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
 * The SeHmEventShmDetails is a POJO class extends AviRestResource that used for creating
 * SeHmEventShmDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeHmEventShmDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEHMEVENTSHMDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeHmEventShmDetails extends AviRestResource {
    @JsonProperty("average_response_time")
    @JsonInclude(Include.NON_NULL)
    private Integer averageResponseTime;

    @JsonProperty("health_monitor")
    @JsonInclude(Include.NON_NULL)
    private String healthMonitor;

    @JsonProperty("resp_string")
    @JsonInclude(Include.NON_NULL)
    private String respString;

    @JsonProperty("response_code")
    @JsonInclude(Include.NON_NULL)
    private Integer responseCode;



  /**
   * This is the getter method this will return the attribute value.
   * Average health monitor response time from server in milli-seconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return averageResponseTime
   */
  @VsoMethod
  public Integer getAverageResponseTime() {
    return averageResponseTime;
  }

  /**
   * This is the setter method to the attribute.
   * Average health monitor response time from server in milli-seconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param averageResponseTime set the averageResponseTime.
   */
  @VsoMethod
  public void setAverageResponseTime(Integer  averageResponseTime) {
    this.averageResponseTime = averageResponseTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Health monitor name.
   * It is a reference to an object of type healthmonitor.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return healthMonitor
   */
  @VsoMethod
  public String getHealthMonitor() {
    return healthMonitor;
  }

  /**
   * This is the setter method to the attribute.
   * Health monitor name.
   * It is a reference to an object of type healthmonitor.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param healthMonitor set the healthMonitor.
   */
  @VsoMethod
  public void setHealthMonitor(String  healthMonitor) {
    this.healthMonitor = healthMonitor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return respString
   */
  @VsoMethod
  public String getRespString() {
    return respString;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param respString set the respString.
   */
  @VsoMethod
  public void setRespString(String  respString) {
    this.respString = respString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Response code from server.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return responseCode
   */
  @VsoMethod
  public Integer getResponseCode() {
    return responseCode;
  }

  /**
   * This is the setter method to the attribute.
   * Response code from server.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param responseCode set the responseCode.
   */
  @VsoMethod
  public void setResponseCode(Integer  responseCode) {
    this.responseCode = responseCode;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeHmEventShmDetails objSeHmEventShmDetails = (SeHmEventShmDetails) o;
  return   Objects.equals(this.healthMonitor, objSeHmEventShmDetails.healthMonitor)&&
  Objects.equals(this.averageResponseTime, objSeHmEventShmDetails.averageResponseTime)&&
  Objects.equals(this.respString, objSeHmEventShmDetails.respString)&&
  Objects.equals(this.responseCode, objSeHmEventShmDetails.responseCode);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeHmEventShmDetails {\n");
      sb.append("    averageResponseTime: ").append(toIndentedString(averageResponseTime)).append("\n");
        sb.append("    healthMonitor: ").append(toIndentedString(healthMonitor)).append("\n");
        sb.append("    respString: ").append(toIndentedString(respString)).append("\n");
        sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
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

