package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.VIAdminCredentials;
import com.vmware.avi.vro.model.VISeVmIpConfParams;
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
 * VISetMgmtIpSEReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VISetMgmtIpSEReq")
@VsoFinder(name = Constants.FINDER_VRO_VISETMGMTIPSEREQ, idAccessor = "getObjectID()")
@Service
public class VISetMgmtIpSEReq extends AviRestResource  {
  @JsonProperty("admin")
  private VIAdminCredentials admin = null;

  @JsonProperty("all_vnic_connected")
  private Boolean allVnicConnected = null;

  @JsonProperty("cloud_uuid")
  private String cloudUuid = null;

  @JsonProperty("dc_uuid")
  private String dcUuid = null;

  @JsonProperty("ip_params")
  private VISeVmIpConfParams ipParams = null;

  @JsonProperty("power_on")
  private Boolean powerOn = true;

  @JsonProperty("rm_cookie")
  private String rmCookie = null;

  @JsonProperty("sevm_uuid")
  private String sevmUuid = null;

  
  /**
   * Placeholder for description of property admin of obj type VISetMgmtIpSEReq field type str  type object
   * @return admin
  **/
  @ApiModelProperty(value = "Placeholder for description of property admin of obj type VISetMgmtIpSEReq field type str  type object")

  @Valid

 
  @VsoMethod  
  public VIAdminCredentials getAdmin() {
    return admin;
  }
    
  @VsoMethod
  public void setAdmin(VIAdminCredentials admin) {
    this.admin = admin;
  }

  
  /**
   * Placeholder for description of property all_vnic_connected of obj type VISetMgmtIpSEReq field type str  type boolean
   * @return allVnicConnected
  **/
  @ApiModelProperty(value = "Placeholder for description of property all_vnic_connected of obj type VISetMgmtIpSEReq field type str  type boolean")


 
  @VsoMethod  
  public Boolean isAllVnicConnected() {
    return allVnicConnected;
  }
    
  @VsoMethod
  public void setAllVnicConnected(Boolean allVnicConnected) {
    this.allVnicConnected = allVnicConnected;
  }

  
  /**
   * Unique object identifier of cloud.
   * @return cloudUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of cloud.")


 
  @VsoMethod  
  public String getCloudUuid() {
    return cloudUuid;
  }
    
  @VsoMethod
  public void setCloudUuid(String cloudUuid) {
    this.cloudUuid = cloudUuid;
  }

  
  /**
   * Unique object identifier of dc.
   * @return dcUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of dc.")


 
  @VsoMethod  
  public String getDcUuid() {
    return dcUuid;
  }
    
  @VsoMethod
  public void setDcUuid(String dcUuid) {
    this.dcUuid = dcUuid;
  }

  
  /**
   * Placeholder for description of property ip_params of obj type VISetMgmtIpSEReq field type str  type object
   * @return ipParams
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property ip_params of obj type VISetMgmtIpSEReq field type str  type object")
  @NotNull

  @Valid

 
  @VsoMethod  
  public VISeVmIpConfParams getIpParams() {
    return ipParams;
  }
    
  @VsoMethod
  public void setIpParams(VISeVmIpConfParams ipParams) {
    this.ipParams = ipParams;
  }

  
  /**
   * Placeholder for description of property power_on of obj type VISetMgmtIpSEReq field type str  type boolean
   * @return powerOn
  **/
  @ApiModelProperty(value = "Placeholder for description of property power_on of obj type VISetMgmtIpSEReq field type str  type boolean")


 
  @VsoMethod  
  public Boolean isPowerOn() {
    return powerOn;
  }
    
  @VsoMethod
  public void setPowerOn(Boolean powerOn) {
    this.powerOn = powerOn;
  }

  
  /**
   * rm_cookie of VISetMgmtIpSEReq.
   * @return rmCookie
  **/
  @ApiModelProperty(value = "rm_cookie of VISetMgmtIpSEReq.")


 
  @VsoMethod  
  public String getRmCookie() {
    return rmCookie;
  }
    
  @VsoMethod
  public void setRmCookie(String rmCookie) {
    this.rmCookie = rmCookie;
  }

  
  /**
   * Unique object identifier of sevm.
   * @return sevmUuid
  **/
  @ApiModelProperty(required = true, value = "Unique object identifier of sevm.")
  @NotNull


 
  @VsoMethod  
  public String getSevmUuid() {
    return sevmUuid;
  }
    
  @VsoMethod
  public void setSevmUuid(String sevmUuid) {
    this.sevmUuid = sevmUuid;
  }

  
  public String getObjectID() {
		return "VISetMgmtIpSEReq";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VISetMgmtIpSEReq viSetMgmtIpSEReq = (VISetMgmtIpSEReq) o;
    return Objects.equals(this.admin, viSetMgmtIpSEReq.admin) &&
        Objects.equals(this.allVnicConnected, viSetMgmtIpSEReq.allVnicConnected) &&
        Objects.equals(this.cloudUuid, viSetMgmtIpSEReq.cloudUuid) &&
        Objects.equals(this.dcUuid, viSetMgmtIpSEReq.dcUuid) &&
        Objects.equals(this.ipParams, viSetMgmtIpSEReq.ipParams) &&
        Objects.equals(this.powerOn, viSetMgmtIpSEReq.powerOn) &&
        Objects.equals(this.rmCookie, viSetMgmtIpSEReq.rmCookie) &&
        Objects.equals(this.sevmUuid, viSetMgmtIpSEReq.sevmUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, allVnicConnected, cloudUuid, dcUuid, ipParams, powerOn, rmCookie, sevmUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VISetMgmtIpSEReq {\n");
    
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    allVnicConnected: ").append(toIndentedString(allVnicConnected)).append("\n");
    sb.append("    cloudUuid: ").append(toIndentedString(cloudUuid)).append("\n");
    sb.append("    dcUuid: ").append(toIndentedString(dcUuid)).append("\n");
    sb.append("    ipParams: ").append(toIndentedString(ipParams)).append("\n");
    sb.append("    powerOn: ").append(toIndentedString(powerOn)).append("\n");
    sb.append("    rmCookie: ").append(toIndentedString(rmCookie)).append("\n");
    sb.append("    sevmUuid: ").append(toIndentedString(sevmUuid)).append("\n");
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

