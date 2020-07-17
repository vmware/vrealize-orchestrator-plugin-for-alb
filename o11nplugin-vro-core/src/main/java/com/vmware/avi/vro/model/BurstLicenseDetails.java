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
 * The BurstLicenseDetails is a POJO class extends AviRestResource that used for creating
 * BurstLicenseDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BurstLicenseDetails")
@VsoFinder(name = Constants.FINDER_VRO_BURSTLICENSEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BurstLicenseDetails extends AviRestResource {
  @JsonProperty("cores")
  @JsonInclude(Include.NON_NULL)
  private Integer cores = null;

  @JsonProperty("end_time")
  @JsonInclude(Include.NON_NULL)
  private String endTime = null;

  @JsonProperty("se_name")
  @JsonInclude(Include.NON_NULL)
  private String seName = null;

  @JsonProperty("se_uuid")
  @JsonInclude(Include.NON_NULL)
  private String seUuid = null;

  @JsonProperty("start_time")
  @JsonInclude(Include.NON_NULL)
  private String startTime = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cores of obj type burstlicensedetails field type str  type integer.
   * @return cores
   */
  @VsoMethod
  public Integer getCores() {
    return cores;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cores of obj type burstlicensedetails field type str  type integer.
   * @param cores set the cores.
   */
  @VsoMethod
  public void setCores(Integer  cores) {
    this.cores = cores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property end_time of obj type burstlicensedetails field type str  type string.
   * @return endTime
   */
  @VsoMethod
  public String getEndTime() {
    return endTime;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property end_time of obj type burstlicensedetails field type str  type string.
   * @param endTime set the endTime.
   */
  @VsoMethod
  public void setEndTime(String  endTime) {
    this.endTime = endTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_name of obj type burstlicensedetails field type str  type string.
   * @return seName
   */
  @VsoMethod
  public String getSeName() {
    return seName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property se_name of obj type burstlicensedetails field type str  type string.
   * @param seName set the seName.
   */
  @VsoMethod
  public void setSeName(String  seName) {
    this.seName = seName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of se.
   * @return seUuid
   */
  @VsoMethod
  public String getSeUuid() {
    return seUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of se.
   * @param seUuid set the seUuid.
   */
  @VsoMethod
  public void setSeUuid(String  seUuid) {
    this.seUuid = seUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property start_time of obj type burstlicensedetails field type str  type string.
   * @return startTime
   */
  @VsoMethod
  public String getStartTime() {
    return startTime;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property start_time of obj type burstlicensedetails field type str  type string.
   * @param startTime set the startTime.
   */
  @VsoMethod
  public void setStartTime(String  startTime) {
    this.startTime = startTime;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  BurstLicenseDetails objBurstLicenseDetails = (BurstLicenseDetails) o;
  return   Objects.equals(this.seName, objBurstLicenseDetails.seName)&&
  Objects.equals(this.startTime, objBurstLicenseDetails.startTime)&&
  Objects.equals(this.endTime, objBurstLicenseDetails.endTime)&&
  Objects.equals(this.seUuid, objBurstLicenseDetails.seUuid)&&
  Objects.equals(this.cores, objBurstLicenseDetails.cores);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BurstLicenseDetails {\n");
      sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

