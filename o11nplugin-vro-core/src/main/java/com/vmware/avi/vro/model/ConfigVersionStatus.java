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
 * The ConfigVersionStatus is a POJO class extends AviRestResource that used for creating
 * ConfigVersionStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ConfigVersionStatus")
@VsoFinder(name = Constants.FINDER_VRO_CONFIGVERSIONSTATUS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ConfigVersionStatus extends AviRestResource {
    @JsonProperty("event_type")
    @JsonInclude(Include.NON_NULL)
    private String eventType = null;

    @JsonProperty("obj_name")
    @JsonInclude(Include.NON_NULL)
    private String objName = null;

    @JsonProperty("obj_uuid")
    @JsonInclude(Include.NON_NULL)
    private String objUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Type of replication event.
   * Enum options - DNSVS, OBJECT_CONFIG_VERSION.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventType
   */
  @VsoMethod
  public String getEventType() {
    return eventType;
  }

  /**
   * This is the setter method to the attribute.
   * Type of replication event.
   * Enum options - DNSVS, OBJECT_CONFIG_VERSION.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param eventType set the eventType.
   */
  @VsoMethod
  public void setEventType(String  eventType) {
    this.eventType = eventType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of config object.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objName
   */
  @VsoMethod
  public String getObjName() {
    return objName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of config object.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objName set the objName.
   */
  @VsoMethod
  public void setObjName(String  objName) {
    this.objName = objName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of config object.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objUuid
   */
  @VsoMethod
  public String getObjUuid() {
    return objUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of config object.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objUuid set the objUuid.
   */
  @VsoMethod
  public void setObjUuid(String  objUuid) {
    this.objUuid = objUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ConfigVersionStatus objConfigVersionStatus = (ConfigVersionStatus) o;
  return   Objects.equals(this.objName, objConfigVersionStatus.objName)&&
  Objects.equals(this.objUuid, objConfigVersionStatus.objUuid)&&
  Objects.equals(this.eventType, objConfigVersionStatus.eventType);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ConfigVersionStatus {\n");
      sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    objName: ").append(toIndentedString(objName)).append("\n");
        sb.append("    objUuid: ").append(toIndentedString(objUuid)).append("\n");
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

