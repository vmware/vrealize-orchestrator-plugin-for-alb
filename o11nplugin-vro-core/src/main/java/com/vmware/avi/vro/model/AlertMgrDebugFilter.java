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
 * The AlertMgrDebugFilter is a POJO class extends AviRestResource that used for creating
 * AlertMgrDebugFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AlertMgrDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_ALERTMGRDEBUGFILTER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AlertMgrDebugFilter extends AviRestResource {
    @JsonProperty("alert_objid")
    @JsonInclude(Include.NON_NULL)
    private String alertObjid = null;

    @JsonProperty("alert_uuid")
    @JsonInclude(Include.NON_NULL)
    private String alertUuid = null;

    @JsonProperty("cfg_uuid")
    @JsonInclude(Include.NON_NULL)
    private String cfgUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Filter debugs for entity uuid.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return alertObjid
   */
  @VsoMethod
  public String getAlertObjid() {
    return alertObjid;
  }

  /**
   * This is the setter method to the attribute.
   * Filter debugs for entity uuid.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param alertObjid set the alertObjid.
   */
  @VsoMethod
  public void setAlertObjid(String  alertObjid) {
    this.alertObjid = alertObjid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Filter debugs for an alert id.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return alertUuid
   */
  @VsoMethod
  public String getAlertUuid() {
    return alertUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Filter debugs for an alert id.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param alertUuid set the alertUuid.
   */
  @VsoMethod
  public void setAlertUuid(String  alertUuid) {
    this.alertUuid = alertUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Filter debugs for an alert config.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cfgUuid
   */
  @VsoMethod
  public String getCfgUuid() {
    return cfgUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Filter debugs for an alert config.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cfgUuid set the cfgUuid.
   */
  @VsoMethod
  public void setCfgUuid(String  cfgUuid) {
    this.cfgUuid = cfgUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AlertMgrDebugFilter objAlertMgrDebugFilter = (AlertMgrDebugFilter) o;
  return   Objects.equals(this.alertUuid, objAlertMgrDebugFilter.alertUuid)&&
  Objects.equals(this.alertObjid, objAlertMgrDebugFilter.alertObjid)&&
  Objects.equals(this.cfgUuid, objAlertMgrDebugFilter.cfgUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AlertMgrDebugFilter {\n");
      sb.append("    alertObjid: ").append(toIndentedString(alertObjid)).append("\n");
        sb.append("    alertUuid: ").append(toIndentedString(alertUuid)).append("\n");
        sb.append("    cfgUuid: ").append(toIndentedString(cfgUuid)).append("\n");
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

