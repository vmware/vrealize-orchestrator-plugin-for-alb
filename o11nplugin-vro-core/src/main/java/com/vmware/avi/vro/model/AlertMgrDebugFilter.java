package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * AlertMgrDebugFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AlertMgrDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_ALERTMGRDEBUGFILTER, idAccessor = "getObjectID()")
@Service
public class AlertMgrDebugFilter extends AviRestResource  {
  @JsonProperty("alert_objid")
  private String alertObjid = null;

  @JsonProperty("alert_uuid")
  private String alertUuid = null;

  @JsonProperty("cfg_uuid")
  private String cfgUuid = null;

  
  /**
   * filter debugs for entity uuid.
   * @return alertObjid
  **/
  @ApiModelProperty(value = "filter debugs for entity uuid.")


 
  @VsoMethod  
  public String getAlertObjid() {
    return alertObjid;
  }
    
  @VsoMethod
  public void setAlertObjid(String alertObjid) {
    this.alertObjid = alertObjid;
  }

  
  /**
   * filter debugs for an alert id.
   * @return alertUuid
  **/
  @ApiModelProperty(value = "filter debugs for an alert id.")


 
  @VsoMethod  
  public String getAlertUuid() {
    return alertUuid;
  }
    
  @VsoMethod
  public void setAlertUuid(String alertUuid) {
    this.alertUuid = alertUuid;
  }

  
  /**
   * filter debugs for an alert config.
   * @return cfgUuid
  **/
  @ApiModelProperty(value = "filter debugs for an alert config.")


 
  @VsoMethod  
  public String getCfgUuid() {
    return cfgUuid;
  }
    
  @VsoMethod
  public void setCfgUuid(String cfgUuid) {
    this.cfgUuid = cfgUuid;
  }

  
  public String getObjectID() {
		return "AlertMgrDebugFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertMgrDebugFilter alertMgrDebugFilter = (AlertMgrDebugFilter) o;
    return Objects.equals(this.alertObjid, alertMgrDebugFilter.alertObjid) &&
        Objects.equals(this.alertUuid, alertMgrDebugFilter.alertUuid) &&
        Objects.equals(this.cfgUuid, alertMgrDebugFilter.cfgUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertObjid, alertUuid, cfgUuid);
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

