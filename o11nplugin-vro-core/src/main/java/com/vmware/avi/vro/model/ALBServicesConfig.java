package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.ALBServicesUser;
import com.vmware.avi.vro.model.PortalFeatureOptIn;
import com.vmware.avi.vro.model.ProactiveSupportDefaults;
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
 * ALBServicesConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ALBServicesConfig")
@VsoFinder(name = Constants.FINDER_VRO_ALBSERVICESCONFIG, idAccessor = "getObjectID()")
@Service
public class ALBServicesConfig extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("asset_contact")
  private ALBServicesUser assetContact = null;

  @JsonProperty("feature_opt_in_status")
  private PortalFeatureOptIn featureOptInStatus = null;

  @JsonProperty("polling_interval")
  private Integer pollingInterval = 10;

  @JsonProperty("portal_url")
  private String portalUrl = null;

  @JsonProperty("proactive_support_defaults")
  private ProactiveSupportDefaults proactiveSupportDefaults = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * Information about the default contact for this controller cluster. Field introduced in 20.1.1.
   * @return assetContact
  **/
  @ApiModelProperty(value = "Information about the default contact for this controller cluster. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public ALBServicesUser getAssetContact() {
    return assetContact;
  }
    
  @VsoMethod
  public void setAssetContact(ALBServicesUser assetContact) {
    this.assetContact = assetContact;
  }

  
  /**
   * Information about the portal features opted in for controller. Field introduced in 20.1.1.
   * @return featureOptInStatus
  **/
  @ApiModelProperty(required = true, value = "Information about the portal features opted in for controller. Field introduced in 20.1.1.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public PortalFeatureOptIn getFeatureOptInStatus() {
    return featureOptInStatus;
  }
    
  @VsoMethod
  public void setFeatureOptInStatus(PortalFeatureOptIn featureOptInStatus) {
    this.featureOptInStatus = featureOptInStatus;
  }

  
  /**
   * Time interval in minutes. Allowed values are 5-60. Field introduced in 18.2.6.
   * @return pollingInterval
  **/
  @ApiModelProperty(value = "Time interval in minutes. Allowed values are 5-60. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getPollingInterval() {
    return pollingInterval;
  }
    
  @VsoMethod
  public void setPollingInterval(Integer pollingInterval) {
    this.pollingInterval = pollingInterval;
  }

  
  /**
   * The FQDN or IP address of the customer portal. Field introduced in 18.2.6.
   * @return portalUrl
  **/
  @ApiModelProperty(required = true, value = "The FQDN or IP address of the customer portal. Field introduced in 18.2.6.")
  @NotNull


 
  @VsoMethod  
  public String getPortalUrl() {
    return portalUrl;
  }
    
  @VsoMethod
  public void setPortalUrl(String portalUrl) {
    this.portalUrl = portalUrl;
  }

  
  /**
   * Default values to be used during proactive case creation and techsupport attachment. Field introduced in 20.1.1.
   * @return proactiveSupportDefaults
  **/
  @ApiModelProperty(required = true, value = "Default values to be used during proactive case creation and techsupport attachment. Field introduced in 20.1.1.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public ProactiveSupportDefaults getProactiveSupportDefaults() {
    return proactiveSupportDefaults;
  }
    
  @VsoMethod
  public void setProactiveSupportDefaults(ProactiveSupportDefaults proactiveSupportDefaults) {
    this.proactiveSupportDefaults = proactiveSupportDefaults;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   *  Field introduced in 18.2.6.
   * @return uuid
  **/
  @ApiModelProperty(value = " Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "ALBServicesConfig";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ALBServicesConfig alBServicesConfig = (ALBServicesConfig) o;
    return Objects.equals(this.lastModified, alBServicesConfig.lastModified) &&
        Objects.equals(this.assetContact, alBServicesConfig.assetContact) &&
        Objects.equals(this.featureOptInStatus, alBServicesConfig.featureOptInStatus) &&
        Objects.equals(this.pollingInterval, alBServicesConfig.pollingInterval) &&
        Objects.equals(this.portalUrl, alBServicesConfig.portalUrl) &&
        Objects.equals(this.proactiveSupportDefaults, alBServicesConfig.proactiveSupportDefaults) &&
        Objects.equals(this.url, alBServicesConfig.url) &&
        Objects.equals(this.uuid, alBServicesConfig.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, assetContact, featureOptInStatus, pollingInterval, portalUrl, proactiveSupportDefaults, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ALBServicesConfig {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    assetContact: ").append(toIndentedString(assetContact)).append("\n");
    sb.append("    featureOptInStatus: ").append(toIndentedString(featureOptInStatus)).append("\n");
    sb.append("    pollingInterval: ").append(toIndentedString(pollingInterval)).append("\n");
    sb.append("    portalUrl: ").append(toIndentedString(portalUrl)).append("\n");
    sb.append("    proactiveSupportDefaults: ").append(toIndentedString(proactiveSupportDefaults)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

