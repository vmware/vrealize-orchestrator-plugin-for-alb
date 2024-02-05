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
 * The ControllerDiscontinuousTimeChangeEventDetails is a POJO class extends AviRestResource that used for creating
 * ControllerDiscontinuousTimeChangeEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerDiscontinuousTimeChangeEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERDISCONTINUOUSTIMECHANGEEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerDiscontinuousTimeChangeEventDetails extends AviRestResource {
    @JsonProperty("from_time")
    @JsonInclude(Include.NON_NULL)
    private String fromTime;

    @JsonProperty("node_name")
    @JsonInclude(Include.NON_NULL)
    private String nodeName;

    @JsonProperty("ntp_servers")
    @JsonInclude(Include.NON_NULL)
    private String ntpServers;

    @JsonProperty("to_time")
    @JsonInclude(Include.NON_NULL)
    private String toTime;



  /**
   * This is the getter method this will return the attribute value.
   * Time stamp before the discontinuous jump in time.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fromTime
   */
  @VsoMethod
  public String getFromTime() {
    return fromTime;
  }

  /**
   * This is the setter method to the attribute.
   * Time stamp before the discontinuous jump in time.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fromTime set the fromTime.
   */
  @VsoMethod
  public void setFromTime(String  fromTime) {
    this.fromTime = fromTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the controller responsible for this event.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodeName
   */
  @VsoMethod
  public String getNodeName() {
    return nodeName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the controller responsible for this event.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nodeName set the nodeName.
   */
  @VsoMethod
  public void setNodeName(String  nodeName) {
    this.nodeName = nodeName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * System peer and candidate ntp servers active at the point of time jump.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ntpServers
   */
  @VsoMethod
  public String getNtpServers() {
    return ntpServers;
  }

  /**
   * This is the setter method to the attribute.
   * System peer and candidate ntp servers active at the point of time jump.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ntpServers set the ntpServers.
   */
  @VsoMethod
  public void setNtpServers(String  ntpServers) {
    this.ntpServers = ntpServers;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time stamp to which the time has discontinuously jumped.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return toTime
   */
  @VsoMethod
  public String getToTime() {
    return toTime;
  }

  /**
   * This is the setter method to the attribute.
   * Time stamp to which the time has discontinuously jumped.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param toTime set the toTime.
   */
  @VsoMethod
  public void setToTime(String  toTime) {
    this.toTime = toTime;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ControllerDiscontinuousTimeChangeEventDetails objControllerDiscontinuousTimeChangeEventDetails = (ControllerDiscontinuousTimeChangeEventDetails) o;
  return   Objects.equals(this.nodeName, objControllerDiscontinuousTimeChangeEventDetails.nodeName)&&
  Objects.equals(this.fromTime, objControllerDiscontinuousTimeChangeEventDetails.fromTime)&&
  Objects.equals(this.toTime, objControllerDiscontinuousTimeChangeEventDetails.toTime)&&
  Objects.equals(this.ntpServers, objControllerDiscontinuousTimeChangeEventDetails.ntpServers);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerDiscontinuousTimeChangeEventDetails {\n");
      sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    ntpServers: ").append(toIndentedString(ntpServers)).append("\n");
        sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
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

