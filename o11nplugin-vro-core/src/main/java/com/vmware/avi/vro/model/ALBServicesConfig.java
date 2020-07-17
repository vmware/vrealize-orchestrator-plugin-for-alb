package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ALBServicesUser;
import com.vmware.avi.vro.model.PortalFeatureOptIn;
import com.vmware.avi.vro.model.ProactiveSupportDefaults;
import com.vmware.avi.vro.model.ProxyConfiguration;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ALBServicesConfig is a POJO class extends AviRestResource that used for creating
 * ALBServicesConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ALBServicesConfig")
@VsoFinder(name = Constants.FINDER_VRO_ALBSERVICESCONFIG, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ALBServicesConfig extends AviRestResource {
  @JsonProperty("asset_contact")
  @JsonInclude(Include.NON_NULL)
  private ALBServicesUser assetContact = null;

  @JsonProperty("feature_opt_in_status")
  @JsonInclude(Include.NON_NULL)
  private PortalFeatureOptIn featureOptInStatus = null;

  @JsonProperty("ip_reputation_sync_interval")
  @JsonInclude(Include.NON_NULL)
  private Integer ipReputationSyncInterval = 60;

  @JsonProperty("polling_interval")
  @JsonInclude(Include.NON_NULL)
  private Integer pollingInterval = 10;

  @JsonProperty("portal_url")
  @JsonInclude(Include.NON_NULL)
  private String portalUrl = null;

  @JsonProperty("proactive_support_defaults")
  @JsonInclude(Include.NON_NULL)
  private ProactiveSupportDefaults proactiveSupportDefaults = null;

  @JsonProperty("split_proxy_configuration")
  @JsonInclude(Include.NON_NULL)
  private ProxyConfiguration splitProxyConfiguration = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("use_system_proxy")
  @JsonInclude(Include.NON_NULL)
  private Boolean useSystemProxy = true;

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Information about the default contact for this controller cluster.
   * Field introduced in 20.1.1.
   * @return assetContact
   */
  @VsoMethod
  public ALBServicesUser getAssetContact() {
    return assetContact;
  }

  /**
   * This is the setter method to the attribute.
   * Information about the default contact for this controller cluster.
   * Field introduced in 20.1.1.
   * @param assetContact set the assetContact.
   */
  @VsoMethod
  public void setAssetContact(ALBServicesUser assetContact) {
    this.assetContact = assetContact;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Information about the portal features opted in for controller.
   * Field introduced in 20.1.1.
   * @return featureOptInStatus
   */
  @VsoMethod
  public PortalFeatureOptIn getFeatureOptInStatus() {
    return featureOptInStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Information about the portal features opted in for controller.
   * Field introduced in 20.1.1.
   * @param featureOptInStatus set the featureOptInStatus.
   */
  @VsoMethod
  public void setFeatureOptInStatus(PortalFeatureOptIn featureOptInStatus) {
    this.featureOptInStatus = featureOptInStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip reputation db sync interval in minutes.
   * Allowed values are 2-1440.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return ipReputationSyncInterval
   */
  @VsoMethod
  public Integer getIpReputationSyncInterval() {
    return ipReputationSyncInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Ip reputation db sync interval in minutes.
   * Allowed values are 2-1440.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param ipReputationSyncInterval set the ipReputationSyncInterval.
   */
  @VsoMethod
  public void setIpReputationSyncInterval(Integer  ipReputationSyncInterval) {
    this.ipReputationSyncInterval = ipReputationSyncInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time interval in minutes.
   * Allowed values are 5-60.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return pollingInterval
   */
  @VsoMethod
  public Integer getPollingInterval() {
    return pollingInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Time interval in minutes.
   * Allowed values are 5-60.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param pollingInterval set the pollingInterval.
   */
  @VsoMethod
  public void setPollingInterval(Integer  pollingInterval) {
    this.pollingInterval = pollingInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The fqdn or ip address of the customer portal.
   * Field introduced in 18.2.6.
   * @return portalUrl
   */
  @VsoMethod
  public String getPortalUrl() {
    return portalUrl;
  }

  /**
   * This is the setter method to the attribute.
   * The fqdn or ip address of the customer portal.
   * Field introduced in 18.2.6.
   * @param portalUrl set the portalUrl.
   */
  @VsoMethod
  public void setPortalUrl(String  portalUrl) {
    this.portalUrl = portalUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default values to be used during proactive case creation and techsupport attachment.
   * Field introduced in 20.1.1.
   * @return proactiveSupportDefaults
   */
  @VsoMethod
  public ProactiveSupportDefaults getProactiveSupportDefaults() {
    return proactiveSupportDefaults;
  }

  /**
   * This is the setter method to the attribute.
   * Default values to be used during proactive case creation and techsupport attachment.
   * Field introduced in 20.1.1.
   * @param proactiveSupportDefaults set the proactiveSupportDefaults.
   */
  @VsoMethod
  public void setProactiveSupportDefaults(ProactiveSupportDefaults proactiveSupportDefaults) {
    this.proactiveSupportDefaults = proactiveSupportDefaults;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Split proxy configuration to connect external pulse services.
   * Field introduced in 20.1.1.
   * @return splitProxyConfiguration
   */
  @VsoMethod
  public ProxyConfiguration getSplitProxyConfiguration() {
    return splitProxyConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Split proxy configuration to connect external pulse services.
   * Field introduced in 20.1.1.
   * @param splitProxyConfiguration set the splitProxyConfiguration.
   */
  @VsoMethod
  public void setSplitProxyConfiguration(ProxyConfiguration splitProxyConfiguration) {
    this.splitProxyConfiguration = splitProxyConfiguration;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * By default, use system proxy configurationif false, use split proxy configuration.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return useSystemProxy
   */
  @VsoMethod
  public Boolean getUseSystemProxy() {
    return useSystemProxy;
  }

  /**
   * This is the setter method to the attribute.
   * By default, use system proxy configurationif false, use split proxy configuration.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param useSystemProxy set the useSystemProxy.
   */
  @VsoMethod
  public void setUseSystemProxy(Boolean  useSystemProxy) {
    this.useSystemProxy = useSystemProxy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return "ALBServicesConfig" + "(" + uuid + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ALBServicesConfig objALBServicesConfig = (ALBServicesConfig) o;
  return   Objects.equals(this.uuid, objALBServicesConfig.uuid)&&
  Objects.equals(this.ipReputationSyncInterval, objALBServicesConfig.ipReputationSyncInterval)&&
  Objects.equals(this.proactiveSupportDefaults, objALBServicesConfig.proactiveSupportDefaults)&&
  Objects.equals(this.portalUrl, objALBServicesConfig.portalUrl)&&
  Objects.equals(this.featureOptInStatus, objALBServicesConfig.featureOptInStatus)&&
  Objects.equals(this.splitProxyConfiguration, objALBServicesConfig.splitProxyConfiguration)&&
  Objects.equals(this.assetContact, objALBServicesConfig.assetContact)&&
  Objects.equals(this.useSystemProxy, objALBServicesConfig.useSystemProxy)&&
  Objects.equals(this.pollingInterval, objALBServicesConfig.pollingInterval);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ALBServicesConfig {\n");
      sb.append("    assetContact: ").append(toIndentedString(assetContact)).append("\n");
        sb.append("    featureOptInStatus: ").append(toIndentedString(featureOptInStatus)).append("\n");
        sb.append("    ipReputationSyncInterval: ").append(toIndentedString(ipReputationSyncInterval)).append("\n");
        sb.append("    pollingInterval: ").append(toIndentedString(pollingInterval)).append("\n");
        sb.append("    portalUrl: ").append(toIndentedString(portalUrl)).append("\n");
        sb.append("    proactiveSupportDefaults: ").append(toIndentedString(proactiveSupportDefaults)).append("\n");
        sb.append("    splitProxyConfiguration: ").append(toIndentedString(splitProxyConfiguration)).append("\n");
            sb.append("    useSystemProxy: ").append(toIndentedString(useSystemProxy)).append("\n");
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

