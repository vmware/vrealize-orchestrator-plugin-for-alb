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
 * The SeDiscontinuousTimeChangeEventDetails is a POJO class extends AviRestResource that used for creating
 * SeDiscontinuousTimeChangeEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeDiscontinuousTimeChangeEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEDISCONTINUOUSTIMECHANGEEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeDiscontinuousTimeChangeEventDetails extends AviRestResource {
    @JsonProperty("drift_time")
    @JsonInclude(Include.NON_NULL)
    private Integer driftTime = null;

    @JsonProperty("from_time")
    @JsonInclude(Include.NON_NULL)
    private String fromTime = null;

    @JsonProperty("ntp_servers")
    @JsonInclude(Include.NON_NULL)
    private String ntpServers = null;

    @JsonProperty("se_name")
    @JsonInclude(Include.NON_NULL)
    private String seName = null;

    @JsonProperty("se_ref")
    @JsonInclude(Include.NON_NULL)
    private String seRef = null;

    @JsonProperty("to_time")
    @JsonInclude(Include.NON_NULL)
    private String toTime = null;



  /**
   * This is the getter method this will return the attribute value.
   * Relative time drift between se and controller in terms of microseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return driftTime
   */
  @VsoMethod
  public Integer getDriftTime() {
    return driftTime;
  }

  /**
   * This is the setter method to the attribute.
   * Relative time drift between se and controller in terms of microseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param driftTime set the driftTime.
   */
  @VsoMethod
  public void setDriftTime(Integer  driftTime) {
    this.driftTime = driftTime;
  }

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
   * Name of the se responsible for this event.
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seName
   */
  @VsoMethod
  public String getSeName() {
    return seName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the se responsible for this event.
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seName set the seName.
   */
  @VsoMethod
  public void setSeName(String  seName) {
    this.seName = seName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the se responsible for this event.
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seRef
   */
  @VsoMethod
  public String getSeRef() {
    return seRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the se responsible for this event.
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seRef set the seRef.
   */
  @VsoMethod
  public void setSeRef(String  seRef) {
    this.seRef = seRef;
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
  SeDiscontinuousTimeChangeEventDetails objSeDiscontinuousTimeChangeEventDetails = (SeDiscontinuousTimeChangeEventDetails) o;
  return   Objects.equals(this.seName, objSeDiscontinuousTimeChangeEventDetails.seName)&&
  Objects.equals(this.seRef, objSeDiscontinuousTimeChangeEventDetails.seRef)&&
  Objects.equals(this.fromTime, objSeDiscontinuousTimeChangeEventDetails.fromTime)&&
  Objects.equals(this.toTime, objSeDiscontinuousTimeChangeEventDetails.toTime)&&
  Objects.equals(this.driftTime, objSeDiscontinuousTimeChangeEventDetails.driftTime)&&
  Objects.equals(this.ntpServers, objSeDiscontinuousTimeChangeEventDetails.ntpServers);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeDiscontinuousTimeChangeEventDetails {\n");
      sb.append("    driftTime: ").append(toIndentedString(driftTime)).append("\n");
        sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
        sb.append("    ntpServers: ").append(toIndentedString(ntpServers)).append("\n");
        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
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

