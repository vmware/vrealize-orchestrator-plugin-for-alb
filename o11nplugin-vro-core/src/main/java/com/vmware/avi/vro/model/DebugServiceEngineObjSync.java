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
 * The DebugServiceEngineObjSync is a POJO class extends AviRestResource that used for creating
 * DebugServiceEngineObjSync.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DebugServiceEngineObjSync")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGSERVICEENGINEOBJSYNC)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DebugServiceEngineObjSync extends AviRestResource {
    @JsonProperty("log_level")
    @JsonInclude(Include.NON_NULL)
    private String logLevel = "LOG_LVL_INFO";

    @JsonProperty("publish_packet_drops")
    @JsonInclude(Include.NON_NULL)
    private Integer publishPacketDrops;



  /**
   * This is the getter method this will return the attribute value.
   * Objsync logging verbosity.
   * Enum options - LOG_LVL_ERROR, LOG_LVL_WARNING, LOG_LVL_INFO, LOG_LVL_DEBUG.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "LOG_LVL_INFO".
   * @return logLevel
   */
  @VsoMethod
  public String getLogLevel() {
    return logLevel;
  }

  /**
   * This is the setter method to the attribute.
   * Objsync logging verbosity.
   * Enum options - LOG_LVL_ERROR, LOG_LVL_WARNING, LOG_LVL_INFO, LOG_LVL_DEBUG.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "LOG_LVL_INFO".
   * @param logLevel set the logLevel.
   */
  @VsoMethod
  public void setLogLevel(String  logLevel) {
    this.logLevel = logLevel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Drop 1 packet in every n packets.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return publishPacketDrops
   */
  @VsoMethod
  public Integer getPublishPacketDrops() {
    return publishPacketDrops;
  }

  /**
   * This is the setter method to the attribute.
   * Drop 1 packet in every n packets.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param publishPacketDrops set the publishPacketDrops.
   */
  @VsoMethod
  public void setPublishPacketDrops(Integer  publishPacketDrops) {
    this.publishPacketDrops = publishPacketDrops;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DebugServiceEngineObjSync objDebugServiceEngineObjSync = (DebugServiceEngineObjSync) o;
  return   Objects.equals(this.publishPacketDrops, objDebugServiceEngineObjSync.publishPacketDrops)&&
  Objects.equals(this.logLevel, objDebugServiceEngineObjSync.logLevel);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DebugServiceEngineObjSync {\n");
      sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
        sb.append("    publishPacketDrops: ").append(toIndentedString(publishPacketDrops)).append("\n");
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

