package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * VsError
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VsError")
@VsoFinder(name = Constants.FINDER_VRO_VSERROR, idAccessor = "getObjectID()")
@Service
public class VsError extends AviRestResource  {
  @JsonProperty("reason")
  @Valid
  private List<String> reason = null;

  @JsonProperty("se_group_ha_mode")
  private String seGroupHaMode = null;

  @JsonProperty("se_group_ref")
  private String seGroupRef = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("traffic_status")
  private String trafficStatus = null;

  @JsonProperty("vip_id")
  private String vipId = null;

  @JsonProperty("vs_ref")
  private String vsRef = null;

  
  public VsError addReasonItem(String reasonItem) {
    if (this.reason == null) {
      this.reason = new ArrayList<String>();
    }
    this.reason.add(reasonItem);
    return this;
  }
  
  /**
   * reason of VsError.
   * @return reason
  **/
  @ApiModelProperty(value = "reason of VsError.")


 
  @VsoMethod  
  public List<String> getReason() {
    return reason;
  }
    
  @VsoMethod
  public void setReason(List<String> reason) {
    this.reason = reason;
  }

  
  /**
   *  Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.
   * @return seGroupHaMode
  **/
  @ApiModelProperty(value = " Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.")


 
  @VsoMethod  
  public String getSeGroupHaMode() {
    return seGroupHaMode;
  }
    
  @VsoMethod
  public void setSeGroupHaMode(String seGroupHaMode) {
    this.seGroupHaMode = seGroupHaMode;
  }

  
  /**
   *  It is a reference to an object of type ServiceEngineGroup.
   * @return seGroupRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type ServiceEngineGroup.")


 
  @VsoMethod  
  public String getSeGroupRef() {
    return seGroupRef;
  }
    
  @VsoMethod
  public void setSeGroupRef(String seGroupRef) {
    this.seGroupRef = seGroupRef;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   *  Enum options - TRAFFIC_DISRUPTED, TRAFFIC_NOT_DISRUPTED.
   * @return trafficStatus
  **/
  @ApiModelProperty(value = " Enum options - TRAFFIC_DISRUPTED, TRAFFIC_NOT_DISRUPTED.")


 
  @VsoMethod  
  public String getTrafficStatus() {
    return trafficStatus;
  }
    
  @VsoMethod
  public void setTrafficStatus(String trafficStatus) {
    this.trafficStatus = trafficStatus;
  }

  
  /**
   * vip_id of VsError.
   * @return vipId
  **/
  @ApiModelProperty(value = "vip_id of VsError.")


 
  @VsoMethod  
  public String getVipId() {
    return vipId;
  }
    
  @VsoMethod
  public void setVipId(String vipId) {
    this.vipId = vipId;
  }

  
  /**
   *  It is a reference to an object of type VirtualService.
   * @return vsRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VirtualService.")


 
  @VsoMethod  
  public String getVsRef() {
    return vsRef;
  }
    
  @VsoMethod
  public void setVsRef(String vsRef) {
    this.vsRef = vsRef;
  }

  
  public String getObjectID() {
		return "VsError";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VsError vsError = (VsError) o;
    return Objects.equals(this.reason, vsError.reason) &&
        Objects.equals(this.seGroupHaMode, vsError.seGroupHaMode) &&
        Objects.equals(this.seGroupRef, vsError.seGroupRef) &&
        Objects.equals(this.tenantRef, vsError.tenantRef) &&
        Objects.equals(this.trafficStatus, vsError.trafficStatus) &&
        Objects.equals(this.vipId, vsError.vipId) &&
        Objects.equals(this.vsRef, vsError.vsRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, seGroupHaMode, seGroupRef, tenantRef, trafficStatus, vipId, vsRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VsError {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    seGroupHaMode: ").append(toIndentedString(seGroupHaMode)).append("\n");
    sb.append("    seGroupRef: ").append(toIndentedString(seGroupRef)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    trafficStatus: ").append(toIndentedString(trafficStatus)).append("\n");
    sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
    sb.append("    vsRef: ").append(toIndentedString(vsRef)).append("\n");
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

