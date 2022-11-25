package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GCPEncryptionKeys;
import com.vmware.avi.vro.model.GCPNetworkConfig;
import com.vmware.avi.vro.model.GCPVIPAllocation;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GCPConfiguration is a POJO class extends AviRestResource that used for creating
 * GCPConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GCPConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_GCPCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GCPConfiguration extends AviRestResource {
    @JsonProperty("cloud_credentials_ref")
    @JsonInclude(Include.NON_NULL)
    private String cloudCredentialsRef = null;

    @JsonProperty("encryption_key_id")
    @JsonInclude(Include.NON_NULL)
    private String encryptionKeyId;

    @JsonProperty("encryption_keys")
    @JsonInclude(Include.NON_NULL)
    private GCPEncryptionKeys encryptionKeys = null;

    @JsonProperty("firewall_target_tags")
    @JsonInclude(Include.NON_NULL)
    private List<String> firewallTargetTags = null;

    @JsonProperty("gcp_service_account_email")
    @JsonInclude(Include.NON_NULL)
    private String gcpServiceAccountEmail = null;

    @JsonProperty("gcs_bucket_name")
    @JsonInclude(Include.NON_NULL)
    private String gcsBucketName = null;

    @JsonProperty("gcs_project_id")
    @JsonInclude(Include.NON_NULL)
    private String gcsProjectId = null;

    @JsonProperty("match_se_group_subnet")
    @JsonInclude(Include.NON_NULL)
    private Boolean matchSeGroupSubnet;

    @JsonProperty("network_config")
    @JsonInclude(Include.NON_NULL)
    private GCPNetworkConfig networkConfig = null;

    @JsonProperty("region_name")
    @JsonInclude(Include.NON_NULL)
    private String regionName = null;

    @JsonProperty("se_project_id")
    @JsonInclude(Include.NON_NULL)
    private String seProjectId = null;

    @JsonProperty("vip_allocation_strategy")
    @JsonInclude(Include.NON_NULL)
    private GCPVIPAllocation vipAllocationStrategy = null;

    @JsonProperty("zones")
    @JsonInclude(Include.NON_NULL)
    private List<String> zones = null;



  /**
   * This is the getter method this will return the attribute value.
   * Credentials to access google cloud platform apis.
   * It is a reference to an object of type cloudconnectoruser.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudCredentialsRef
   */
  @VsoMethod
  public String getCloudCredentialsRef() {
    return cloudCredentialsRef;
  }

  /**
   * This is the setter method to the attribute.
   * Credentials to access google cloud platform apis.
   * It is a reference to an object of type cloudconnectoruser.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudCredentialsRef set the cloudCredentialsRef.
   */
  @VsoMethod
  public void setCloudCredentialsRef(String  cloudCredentialsRef) {
    this.cloudCredentialsRef = cloudCredentialsRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Deprecated, please use encryption_keys field.
   * Field deprecated in 18.2.10, 20.1.2.
   * Field introduced in 18.2.7, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return encryptionKeyId
   */
  @VsoMethod
  public String getEncryptionKeyId() {
    return encryptionKeyId;
  }

  /**
   * This is the setter method to the attribute.
   * Deprecated, please use encryption_keys field.
   * Field deprecated in 18.2.10, 20.1.2.
   * Field introduced in 18.2.7, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param encryptionKeyId set the encryptionKeyId.
   */
  @VsoMethod
  public void setEncryptionKeyId(String  encryptionKeyId) {
    this.encryptionKeyId = encryptionKeyId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Encryption keys for google cloud services.
   * Field introduced in 18.2.10, 20.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return encryptionKeys
   */
  @VsoMethod
  public GCPEncryptionKeys getEncryptionKeys() {
    return encryptionKeys;
  }

  /**
   * This is the setter method to the attribute.
   * Encryption keys for google cloud services.
   * Field introduced in 18.2.10, 20.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param encryptionKeys set the encryptionKeys.
   */
  @VsoMethod
  public void setEncryptionKeys(GCPEncryptionKeys encryptionKeys) {
    this.encryptionKeys = encryptionKeys;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Firewall rule network target tags which will be applied on service engines to allow ingress and egress traffic for service engines.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return firewallTargetTags
   */
  @VsoMethod
  public List<String> getFirewallTargetTags() {
    return firewallTargetTags;
  }

  /**
   * This is the setter method. this will set the firewallTargetTags
   * Firewall rule network target tags which will be applied on service engines to allow ingress and egress traffic for service engines.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return firewallTargetTags
   */
  @VsoMethod
  public void setFirewallTargetTags(List<String>  firewallTargetTags) {
    this.firewallTargetTags = firewallTargetTags;
  }

  /**
   * This is the setter method this will set the firewallTargetTags
   * Firewall rule network target tags which will be applied on service engines to allow ingress and egress traffic for service engines.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return firewallTargetTags
   */
  @VsoMethod
  public GCPConfiguration addFirewallTargetTagsItem(String firewallTargetTagsItem) {
    if (this.firewallTargetTags == null) {
      this.firewallTargetTags = new ArrayList<String>();
    }
    this.firewallTargetTags.add(firewallTargetTagsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Email of gcp service account to be associated to the service engines.
   * Field introduced in 20.1.7, 21.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gcpServiceAccountEmail
   */
  @VsoMethod
  public String getGcpServiceAccountEmail() {
    return gcpServiceAccountEmail;
  }

  /**
   * This is the setter method to the attribute.
   * Email of gcp service account to be associated to the service engines.
   * Field introduced in 20.1.7, 21.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gcpServiceAccountEmail set the gcpServiceAccountEmail.
   */
  @VsoMethod
  public void setGcpServiceAccountEmail(String  gcpServiceAccountEmail) {
    this.gcpServiceAccountEmail = gcpServiceAccountEmail;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Google cloud storage bucket name where service engine image will be uploaded.
   * This image will be deleted once the image is created in google compute images.
   * By default, a bucket will be created if this field is not specified.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gcsBucketName
   */
  @VsoMethod
  public String getGcsBucketName() {
    return gcsBucketName;
  }

  /**
   * This is the setter method to the attribute.
   * Google cloud storage bucket name where service engine image will be uploaded.
   * This image will be deleted once the image is created in google compute images.
   * By default, a bucket will be created if this field is not specified.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gcsBucketName set the gcsBucketName.
   */
  @VsoMethod
  public void setGcsBucketName(String  gcsBucketName) {
    this.gcsBucketName = gcsBucketName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Google cloud storage project id where service engine image will be uploaded.
   * This image will be deleted once the image is created in google compute images.
   * By default, service engine project id will be used.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gcsProjectId
   */
  @VsoMethod
  public String getGcsProjectId() {
    return gcsProjectId;
  }

  /**
   * This is the setter method to the attribute.
   * Google cloud storage project id where service engine image will be uploaded.
   * This image will be deleted once the image is created in google compute images.
   * By default, service engine project id will be used.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gcsProjectId set the gcsProjectId.
   */
  @VsoMethod
  public void setGcsProjectId(String  gcsProjectId) {
    this.gcsProjectId = gcsProjectId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Deprecated, please use match_se_group_subnet in routes mode in.
   * Vip_allocation_strategy.
   * Field deprecated in 20.1.1.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return matchSeGroupSubnet
   */
  @VsoMethod
  public Boolean getMatchSeGroupSubnet() {
    return matchSeGroupSubnet;
  }

  /**
   * This is the setter method to the attribute.
   * Deprecated, please use match_se_group_subnet in routes mode in.
   * Vip_allocation_strategy.
   * Field deprecated in 20.1.1.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param matchSeGroupSubnet set the matchSeGroupSubnet.
   */
  @VsoMethod
  public void setMatchSeGroupSubnet(Boolean  matchSeGroupSubnet) {
    this.matchSeGroupSubnet = matchSeGroupSubnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Google cloud platform vpc network configuration for the service engines.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networkConfig
   */
  @VsoMethod
  public GCPNetworkConfig getNetworkConfig() {
    return networkConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Google cloud platform vpc network configuration for the service engines.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param networkConfig set the networkConfig.
   */
  @VsoMethod
  public void setNetworkConfig(GCPNetworkConfig networkConfig) {
    this.networkConfig = networkConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Google cloud platform region name where service engines will be spawned.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return regionName
   */
  @VsoMethod
  public String getRegionName() {
    return regionName;
  }

  /**
   * This is the setter method to the attribute.
   * Google cloud platform region name where service engines will be spawned.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param regionName set the regionName.
   */
  @VsoMethod
  public void setRegionName(String  regionName) {
    this.regionName = regionName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Google cloud platform project id where service engines will be spawned.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seProjectId
   */
  @VsoMethod
  public String getSeProjectId() {
    return seProjectId;
  }

  /**
   * This is the setter method to the attribute.
   * Google cloud platform project id where service engines will be spawned.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seProjectId set the seProjectId.
   */
  @VsoMethod
  public void setSeProjectId(String  seProjectId) {
    this.seProjectId = seProjectId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vip allocation strategy defines how the vips will be created in google cloud.
   * Field introduced in 18.2.9, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipAllocationStrategy
   */
  @VsoMethod
  public GCPVIPAllocation getVipAllocationStrategy() {
    return vipAllocationStrategy;
  }

  /**
   * This is the setter method to the attribute.
   * Vip allocation strategy defines how the vips will be created in google cloud.
   * Field introduced in 18.2.9, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipAllocationStrategy set the vipAllocationStrategy.
   */
  @VsoMethod
  public void setVipAllocationStrategy(GCPVIPAllocation vipAllocationStrategy) {
    this.vipAllocationStrategy = vipAllocationStrategy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Google cloud platform zones where service engines will be distributed for ha.
   * Field introduced in 18.2.1.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return zones
   */
  @VsoMethod
  public List<String> getZones() {
    return zones;
  }

  /**
   * This is the setter method. this will set the zones
   * Google cloud platform zones where service engines will be distributed for ha.
   * Field introduced in 18.2.1.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return zones
   */
  @VsoMethod
  public void setZones(List<String>  zones) {
    this.zones = zones;
  }

  /**
   * This is the setter method this will set the zones
   * Google cloud platform zones where service engines will be distributed for ha.
   * Field introduced in 18.2.1.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return zones
   */
  @VsoMethod
  public GCPConfiguration addZonesItem(String zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<String>();
    }
    this.zones.add(zonesItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GCPConfiguration objGCPConfiguration = (GCPConfiguration) o;
  return   Objects.equals(this.cloudCredentialsRef, objGCPConfiguration.cloudCredentialsRef)&&
  Objects.equals(this.regionName, objGCPConfiguration.regionName)&&
  Objects.equals(this.zones, objGCPConfiguration.zones)&&
  Objects.equals(this.seProjectId, objGCPConfiguration.seProjectId)&&
  Objects.equals(this.networkConfig, objGCPConfiguration.networkConfig)&&
  Objects.equals(this.firewallTargetTags, objGCPConfiguration.firewallTargetTags)&&
  Objects.equals(this.matchSeGroupSubnet, objGCPConfiguration.matchSeGroupSubnet)&&
  Objects.equals(this.gcsProjectId, objGCPConfiguration.gcsProjectId)&&
  Objects.equals(this.gcsBucketName, objGCPConfiguration.gcsBucketName)&&
  Objects.equals(this.encryptionKeyId, objGCPConfiguration.encryptionKeyId)&&
  Objects.equals(this.vipAllocationStrategy, objGCPConfiguration.vipAllocationStrategy)&&
  Objects.equals(this.encryptionKeys, objGCPConfiguration.encryptionKeys)&&
  Objects.equals(this.gcpServiceAccountEmail, objGCPConfiguration.gcpServiceAccountEmail);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GCPConfiguration {\n");
      sb.append("    cloudCredentialsRef: ").append(toIndentedString(cloudCredentialsRef)).append("\n");
        sb.append("    encryptionKeyId: ").append(toIndentedString(encryptionKeyId)).append("\n");
        sb.append("    encryptionKeys: ").append(toIndentedString(encryptionKeys)).append("\n");
        sb.append("    firewallTargetTags: ").append(toIndentedString(firewallTargetTags)).append("\n");
        sb.append("    gcpServiceAccountEmail: ").append(toIndentedString(gcpServiceAccountEmail)).append("\n");
        sb.append("    gcsBucketName: ").append(toIndentedString(gcsBucketName)).append("\n");
        sb.append("    gcsProjectId: ").append(toIndentedString(gcsProjectId)).append("\n");
        sb.append("    matchSeGroupSubnet: ").append(toIndentedString(matchSeGroupSubnet)).append("\n");
        sb.append("    networkConfig: ").append(toIndentedString(networkConfig)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    seProjectId: ").append(toIndentedString(seProjectId)).append("\n");
        sb.append("    vipAllocationStrategy: ").append(toIndentedString(vipAllocationStrategy)).append("\n");
        sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
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

