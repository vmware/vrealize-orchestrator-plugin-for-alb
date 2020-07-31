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
 * The SeHbRecoveredEventDetails is a POJO class extends AviRestResource that used for creating
 * SeHbRecoveredEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeHbRecoveredEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEHBRECOVEREDEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeHbRecoveredEventDetails extends AviRestResource {
  @JsonProperty("hb_type")
  @JsonInclude(Include.NON_NULL)
  private Integer hbType = 1;

  @JsonProperty("remote_se_ref")
  @JsonInclude(Include.NON_NULL)
  private String remoteSeRef = null;

  @JsonProperty("reporting_se_ref")
  @JsonInclude(Include.NON_NULL)
  private String reportingSeRef = null;

  @JsonProperty("vs_uuid")
  @JsonInclude(Include.NON_NULL)
  private String vsUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Heartbeat request/response received.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return hbType
   */
  @VsoMethod
  public Integer getHbType() {
    return hbType;
  }

  /**
   * This is the setter method to the attribute.
   * Heartbeat request/response received.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param hbType set the hbType.
   */
  @VsoMethod
  public void setHbType(Integer  hbType) {
    this.hbType = hbType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the remote se with which dataplane heartbeat recovered.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 20.1.1.
   * @return remoteSeRef
   */
  @VsoMethod
  public String getRemoteSeRef() {
    return remoteSeRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the remote se with which dataplane heartbeat recovered.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 20.1.1.
   * @param remoteSeRef set the remoteSeRef.
   */
  @VsoMethod
  public void setRemoteSeRef(String  remoteSeRef) {
    this.remoteSeRef = remoteSeRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the se reporting this event.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 20.1.1.
   * @return reportingSeRef
   */
  @VsoMethod
  public String getReportingSeRef() {
    return reportingSeRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the se reporting this event.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 20.1.1.
   * @param reportingSeRef set the reportingSeRef.
   */
  @VsoMethod
  public void setReportingSeRef(String  reportingSeRef) {
    this.reportingSeRef = reportingSeRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of a vs which is placed on reporting-se and remote-se.
   * Field introduced in 20.1.1.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of a vs which is placed on reporting-se and remote-se.
   * Field introduced in 20.1.1.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeHbRecoveredEventDetails objSeHbRecoveredEventDetails = (SeHbRecoveredEventDetails) o;
  return   Objects.equals(this.reportingSeRef, objSeHbRecoveredEventDetails.reportingSeRef)&&
  Objects.equals(this.remoteSeRef, objSeHbRecoveredEventDetails.remoteSeRef)&&
  Objects.equals(this.hbType, objSeHbRecoveredEventDetails.hbType)&&
  Objects.equals(this.vsUuid, objSeHbRecoveredEventDetails.vsUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeHbRecoveredEventDetails {\n");
      sb.append("    hbType: ").append(toIndentedString(hbType)).append("\n");
        sb.append("    remoteSeRef: ").append(toIndentedString(remoteSeRef)).append("\n");
        sb.append("    reportingSeRef: ").append(toIndentedString(reportingSeRef)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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

