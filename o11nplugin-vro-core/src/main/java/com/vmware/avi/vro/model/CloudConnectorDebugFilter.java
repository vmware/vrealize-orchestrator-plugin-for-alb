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
 * CloudConnectorDebugFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CloudConnectorDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDCONNECTORDEBUGFILTER, idAccessor = "getObjectID()")
@Service
public class CloudConnectorDebugFilter extends AviRestResource  {
  @JsonProperty("app_id")
  private String appId = null;

  @JsonProperty("disable_se_reboot")
  private Boolean disableSeReboot = null;

  @JsonProperty("se_id")
  private String seId = null;

  
  /**
   * filter debugs for an app.
   * @return appId
  **/
  @ApiModelProperty(value = "filter debugs for an app.")


 
  @VsoMethod  
  public String getAppId() {
    return appId;
  }
    
  @VsoMethod
  public void setAppId(String appId) {
    this.appId = appId;
  }

  
  /**
   * Disable SE reboot via cloud connector on HB miss.
   * @return disableSeReboot
  **/
  @ApiModelProperty(value = "Disable SE reboot via cloud connector on HB miss.")


 
  @VsoMethod  
  public Boolean isDisableSeReboot() {
    return disableSeReboot;
  }
    
  @VsoMethod
  public void setDisableSeReboot(Boolean disableSeReboot) {
    this.disableSeReboot = disableSeReboot;
  }

  
  /**
   * filter debugs for a SE.
   * @return seId
  **/
  @ApiModelProperty(value = "filter debugs for a SE.")


 
  @VsoMethod  
  public String getSeId() {
    return seId;
  }
    
  @VsoMethod
  public void setSeId(String seId) {
    this.seId = seId;
  }

  
  public String getObjectID() {
		return "CloudConnectorDebugFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudConnectorDebugFilter cloudConnectorDebugFilter = (CloudConnectorDebugFilter) o;
    return Objects.equals(this.appId, cloudConnectorDebugFilter.appId) &&
        Objects.equals(this.disableSeReboot, cloudConnectorDebugFilter.disableSeReboot) &&
        Objects.equals(this.seId, cloudConnectorDebugFilter.seId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, disableSeReboot, seId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudConnectorDebugFilter {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    disableSeReboot: ").append(toIndentedString(disableSeReboot)).append("\n");
    sb.append("    seId: ").append(toIndentedString(seId)).append("\n");
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

