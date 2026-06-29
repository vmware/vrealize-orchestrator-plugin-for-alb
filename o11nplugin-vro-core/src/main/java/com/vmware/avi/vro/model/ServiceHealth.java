package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.TimeStamp;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ServiceHealth is a POJO class extends AviRestResource that used for creating
 * ServiceHealth.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ServiceHealth")
@VsoFinder(name = Constants.FINDER_VRO_SERVICEHEALTH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ServiceHealth extends AviRestResource {
    @JsonProperty("available")
    @JsonInclude(Include.NON_NULL)
    private Boolean available;

    @JsonProperty("controllerReason")
    @JsonInclude(Include.NON_NULL)
    private String controllerReason;

    @JsonProperty("id")
    @JsonInclude(Include.NON_NULL)
    private String id;

    @JsonProperty("last_updated_time")
    @JsonInclude(Include.NON_NULL)
    private TimeStamp lastUpdatedTime;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("operational")
    @JsonInclude(Include.NON_NULL)
    private Boolean operational = false;

    @JsonProperty("portalReason")
    @JsonInclude(Include.NON_NULL)
    private String portalReason;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason = "SYSERR_SUCCESS";



  /**
   * This is the getter method this will return the attribute value.
   * Availability status of service.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return available
   */
  @VsoMethod
  public Boolean getAvailable() {
    return available;
  }

  /**
   * This is the setter method to the attribute.
   * Availability status of service.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param available set the available.
   */
  @VsoMethod
  public void setAvailable(Boolean  available) {
    this.available = available;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Error message of failure if the service is unoperational, updated by controller.
   * Field introduced in 21.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerReason
   */
  @VsoMethod
  public String getControllerreason() {
    return controllerReason;
  }

  /**
   * This is the setter method to the attribute.
   * Error message of failure if the service is unoperational, updated by controller.
   * Field introduced in 21.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerReason set the controllerReason.
   */
  @VsoMethod
  public void setControllerreason(String  controllerReason) {
    this.controllerReason = controllerReason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique id for each service.
   * Field introduced in 21.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return id
   */
  @VsoMethod
  public String getId() {
    return id;
  }

  /**
   * This is the setter method to the attribute.
   * Unique id for each service.
   * Field introduced in 21.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param id set the id.
   */
  @VsoMethod
  public void setId(String  id) {
    this.id = id;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp of the last update on health of service.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastUpdatedTime
   */
  @VsoMethod
  public TimeStamp getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp of the last update on health of service.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastUpdatedTime set the lastUpdatedTime.
   */
  @VsoMethod
  public void setLastUpdatedTime(TimeStamp lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of service.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of service.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Operationality status of service.
   * Field introduced in 21.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return operational
   */
  @VsoMethod
  public Boolean getOperational() {
    return operational;
  }

  /**
   * This is the setter method to the attribute.
   * Operationality status of service.
   * Field introduced in 21.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param operational set the operational.
   */
  @VsoMethod
  public void setOperational(Boolean  operational) {
    this.operational = operational;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Error message of failure if the service is unavailable, updated by pulse cloud services.
   * Field introduced in 21.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return portalReason
   */
  @VsoMethod
  public String getPortalreason() {
    return portalReason;
  }

  /**
   * This is the setter method to the attribute.
   * Error message of failure if the service is unavailable, updated by pulse cloud services.
   * Field introduced in 21.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param portalReason set the portalReason.
   */
  @VsoMethod
  public void setPortalreason(String  portalReason) {
    this.portalReason = portalReason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason of failure if the service is unavailable.
   * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
   * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
   * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_FAILED...
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SYSERR_SUCCESS".
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason of failure if the service is unavailable.
   * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
   * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
   * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_FAILED...
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SYSERR_SUCCESS".
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ServiceHealth objServiceHealth = (ServiceHealth) o;
  return   Objects.equals(this.name, objServiceHealth.name)&&
  Objects.equals(this.available, objServiceHealth.available)&&
  Objects.equals(this.reason, objServiceHealth.reason)&&
  Objects.equals(this.lastUpdatedTime, objServiceHealth.lastUpdatedTime)&&
  Objects.equals(this.portalReason, objServiceHealth.portalReason)&&
  Objects.equals(this.operational, objServiceHealth.operational)&&
  Objects.equals(this.controllerReason, objServiceHealth.controllerReason)&&
  Objects.equals(this.id, objServiceHealth.id);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ServiceHealth {\n");
      sb.append("    available: ").append(toIndentedString(available)).append("\n");
        sb.append("    controllerReason: ").append(toIndentedString(controllerReason)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operational: ").append(toIndentedString(operational)).append("\n");
        sb.append("    portalReason: ").append(toIndentedString(portalReason)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

