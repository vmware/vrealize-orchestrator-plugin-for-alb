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
 * BurstResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "BurstResource")
@VsoFinder(name = Constants.FINDER_VRO_BURSTRESOURCE, idAccessor = "getObjectID()")
@Service
public class BurstResource extends AviRestResource  {
  @JsonProperty("accounted_license_id")
  private String accountedLicenseId = null;

  @JsonProperty("last_alert_time")
  private String lastAlertTime = null;

  @JsonProperty("license_tier")
  private String licenseTier = null;

  @JsonProperty("se_cookie")
  private String seCookie = null;

  @JsonProperty("se_uuid")
  private String seUuid = null;

  @JsonProperty("start_time")
  private String startTime = null;

  
  /**
   * License ID against which this burst has been accounted. Field introduced in 17.2.5.
   * @return accountedLicenseId
  **/
  @ApiModelProperty(value = "License ID against which this burst has been accounted. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getAccountedLicenseId() {
    return accountedLicenseId;
  }
    
  @VsoMethod
  public void setAccountedLicenseId(String accountedLicenseId) {
    this.accountedLicenseId = accountedLicenseId;
  }

  
  /**
   * Time UTC of the last alert created for this burst resource. Field introduced in 17.2.5.
   * @return lastAlertTime
  **/
  @ApiModelProperty(value = "Time UTC of the last alert created for this burst resource. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getLastAlertTime() {
    return lastAlertTime;
  }
    
  @VsoMethod
  public void setLastAlertTime(String lastAlertTime) {
    this.lastAlertTime = lastAlertTime;
  }

  
  /**
   *  Enum options - ENTERPRISE_16, ENTERPRISE_18. Field introduced in 17.2.5.
   * @return licenseTier
  **/
  @ApiModelProperty(value = " Enum options - ENTERPRISE_16, ENTERPRISE_18. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getLicenseTier() {
    return licenseTier;
  }
    
  @VsoMethod
  public void setLicenseTier(String licenseTier) {
    this.licenseTier = licenseTier;
  }

  
  /**
   *  Field introduced in 17.2.5.
   * @return seCookie
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getSeCookie() {
    return seCookie;
  }
    
  @VsoMethod
  public void setSeCookie(String seCookie) {
    this.seCookie = seCookie;
  }

  
  /**
   * Service Engine which triggered the burst license usage. Field introduced in 17.2.5.
   * @return seUuid
  **/
  @ApiModelProperty(value = "Service Engine which triggered the burst license usage. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getSeUuid() {
    return seUuid;
  }
    
  @VsoMethod
  public void setSeUuid(String seUuid) {
    this.seUuid = seUuid;
  }

  
  /**
   * Time UTC when the burst license was put in use. Field introduced in 17.2.5.
   * @return startTime
  **/
  @ApiModelProperty(value = "Time UTC when the burst license was put in use. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getStartTime() {
    return startTime;
  }
    
  @VsoMethod
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  
  public String getObjectID() {
		return "BurstResource";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BurstResource burstResource = (BurstResource) o;
    return Objects.equals(this.accountedLicenseId, burstResource.accountedLicenseId) &&
        Objects.equals(this.lastAlertTime, burstResource.lastAlertTime) &&
        Objects.equals(this.licenseTier, burstResource.licenseTier) &&
        Objects.equals(this.seCookie, burstResource.seCookie) &&
        Objects.equals(this.seUuid, burstResource.seUuid) &&
        Objects.equals(this.startTime, burstResource.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountedLicenseId, lastAlertTime, licenseTier, seCookie, seUuid, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BurstResource {\n");
    
    sb.append("    accountedLicenseId: ").append(toIndentedString(accountedLicenseId)).append("\n");
    sb.append("    lastAlertTime: ").append(toIndentedString(lastAlertTime)).append("\n");
    sb.append("    licenseTier: ").append(toIndentedString(licenseTier)).append("\n");
    sb.append("    seCookie: ").append(toIndentedString(seCookie)).append("\n");
    sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

