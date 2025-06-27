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
 * The LogManagerDebugFilter is a POJO class extends AviRestResource that used for creating
 * LogManagerDebugFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LogManagerDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_LOGMANAGERDEBUGFILTER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LogManagerDebugFilter extends AviRestResource {
    @JsonProperty("entity_ref")
    @JsonInclude(Include.NON_NULL)
    private String entityRef;

    @JsonProperty("telemetry_trace_log_level")
    @JsonInclude(Include.NON_NULL)
    private String telemetryTraceLogLevel;



  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the entity.
   * It is a reference to an object of type virtualservice.
   * Field introduced in 21.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return entityRef
   */
  @VsoMethod
  public String getEntityRef() {
    return entityRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the entity.
   * It is a reference to an object of type virtualservice.
   * Field introduced in 21.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param entityRef set the entityRef.
   */
  @VsoMethod
  public void setEntityRef(String  entityRef) {
    this.entityRef = entityRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Set the log level for telemetry trace logs.
   * Enum options - LOG_LEVEL_DISABLED, LOG_LEVEL_INFO, LOG_LEVEL_WARNING, LOG_LEVEL_ERROR.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return telemetryTraceLogLevel
   */
  @VsoMethod
  public String getTelemetryTraceLogLevel() {
    return telemetryTraceLogLevel;
  }

  /**
   * This is the setter method to the attribute.
   * Set the log level for telemetry trace logs.
   * Enum options - LOG_LEVEL_DISABLED, LOG_LEVEL_INFO, LOG_LEVEL_WARNING, LOG_LEVEL_ERROR.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param telemetryTraceLogLevel set the telemetryTraceLogLevel.
   */
  @VsoMethod
  public void setTelemetryTraceLogLevel(String  telemetryTraceLogLevel) {
    this.telemetryTraceLogLevel = telemetryTraceLogLevel;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LogManagerDebugFilter objLogManagerDebugFilter = (LogManagerDebugFilter) o;
  return   Objects.equals(this.entityRef, objLogManagerDebugFilter.entityRef)&&
  Objects.equals(this.telemetryTraceLogLevel, objLogManagerDebugFilter.telemetryTraceLogLevel);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LogManagerDebugFilter {\n");
      sb.append("    entityRef: ").append(toIndentedString(entityRef)).append("\n");
        sb.append("    telemetryTraceLogLevel: ").append(toIndentedString(telemetryTraceLogLevel)).append("\n");
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

