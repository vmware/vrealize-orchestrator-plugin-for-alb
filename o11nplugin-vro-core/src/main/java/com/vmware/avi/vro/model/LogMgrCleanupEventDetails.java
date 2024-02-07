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
 * The LogMgrCleanupEventDetails is a POJO class extends AviRestResource that used for creating
 * LogMgrCleanupEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LogMgrCleanupEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_LOGMGRCLEANUPEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LogMgrCleanupEventDetails extends AviRestResource {
    @JsonProperty("cleanup_count")
    @JsonInclude(Include.NON_NULL)
    private Integer cleanupCount;

    @JsonProperty("controller")
    @JsonInclude(Include.NON_NULL)
    private String controller;

    @JsonProperty("curr_size")
    @JsonInclude(Include.NON_NULL)
    private Integer currSize;

    @JsonProperty("from_time")
    @JsonInclude(Include.NON_NULL)
    private String fromTime;

    @JsonProperty("size_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer sizeLimit;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cleanupCount
   */
  @VsoMethod
  public Integer getCleanupCount() {
    return cleanupCount;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cleanupCount set the cleanupCount.
   */
  @VsoMethod
  public void setCleanupCount(Integer  cleanupCount) {
    this.cleanupCount = cleanupCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controller
   */
  @VsoMethod
  public String getController() {
    return controller;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controller set the controller.
   */
  @VsoMethod
  public void setController(String  controller) {
    this.controller = controller;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return currSize
   */
  @VsoMethod
  public Integer getCurrSize() {
    return currSize;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param currSize set the currSize.
   */
  @VsoMethod
  public void setCurrSize(Integer  currSize) {
    this.currSize = currSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fromTime
   */
  @VsoMethod
  public String getFromTime() {
    return fromTime;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fromTime set the fromTime.
   */
  @VsoMethod
  public void setFromTime(String  fromTime) {
    this.fromTime = fromTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sizeLimit
   */
  @VsoMethod
  public Integer getSizeLimit() {
    return sizeLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sizeLimit set the sizeLimit.
   */
  @VsoMethod
  public void setSizeLimit(Integer  sizeLimit) {
    this.sizeLimit = sizeLimit;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LogMgrCleanupEventDetails objLogMgrCleanupEventDetails = (LogMgrCleanupEventDetails) o;
  return   Objects.equals(this.controller, objLogMgrCleanupEventDetails.controller)&&
  Objects.equals(this.sizeLimit, objLogMgrCleanupEventDetails.sizeLimit)&&
  Objects.equals(this.currSize, objLogMgrCleanupEventDetails.currSize)&&
  Objects.equals(this.cleanupCount, objLogMgrCleanupEventDetails.cleanupCount)&&
  Objects.equals(this.fromTime, objLogMgrCleanupEventDetails.fromTime);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LogMgrCleanupEventDetails {\n");
      sb.append("    cleanupCount: ").append(toIndentedString(cleanupCount)).append("\n");
        sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
        sb.append("    currSize: ").append(toIndentedString(currSize)).append("\n");
        sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
        sb.append("    sizeLimit: ").append(toIndentedString(sizeLimit)).append("\n");
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

