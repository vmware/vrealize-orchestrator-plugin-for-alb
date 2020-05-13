package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.GCPNetworkConfig;
import com.vmware.avi.vro.model.GCPVIPAllocation;
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
 * GCPConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GCPConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_GCPCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class GCPConfiguration extends AviRestResource  {
  @JsonProperty("cloud_credentials_ref")
  private String cloudCredentialsRef = null;

  @JsonProperty("encryption_key_id")
  private String encryptionKeyId = null;

  @JsonProperty("firewall_target_tags")
  @Valid
  private List<String> firewallTargetTags = null;

  @JsonProperty("gcs_bucket_name")
  private String gcsBucketName = null;

  @JsonProperty("gcs_project_id")
  private String gcsProjectId = null;

  @JsonProperty("match_se_group_subnet")
  private Boolean matchSeGroupSubnet = null;

  @JsonProperty("network_config")
  private GCPNetworkConfig networkConfig = null;

  @JsonProperty("region_name")
  private String regionName = null;

  @JsonProperty("se_project_id")
  private String seProjectId = null;

  @JsonProperty("vip_allocation_strategy")
  private GCPVIPAllocation vipAllocationStrategy = null;

  @JsonProperty("zones")
  @Valid
  private List<String> zones = new ArrayList<String>();

  
  /**
   * Credentials to access Google Cloud Platform APIs. It is a reference to an object of type CloudConnectorUser. Field introduced in 18.2.1.
   * @return cloudCredentialsRef
  **/
  @ApiModelProperty(value = "Credentials to access Google Cloud Platform APIs. It is a reference to an object of type CloudConnectorUser. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getCloudCredentialsRef() {
    return cloudCredentialsRef;
  }
    
  @VsoMethod
  public void setCloudCredentialsRef(String cloudCredentialsRef) {
    this.cloudCredentialsRef = cloudCredentialsRef;
  }

  
  /**
   * Key Resource ID of Customer-Managed Encryption Key (CMEK) used to encrypt Service Engine disks and images. Field introduced in 20.1.1.
   * @return encryptionKeyId
  **/
  @ApiModelProperty(value = "Key Resource ID of Customer-Managed Encryption Key (CMEK) used to encrypt Service Engine disks and images. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getEncryptionKeyId() {
    return encryptionKeyId;
  }
    
  @VsoMethod
  public void setEncryptionKeyId(String encryptionKeyId) {
    this.encryptionKeyId = encryptionKeyId;
  }

  
  public GCPConfiguration addFirewallTargetTagsItem(String firewallTargetTagsItem) {
    if (this.firewallTargetTags == null) {
      this.firewallTargetTags = new ArrayList<String>();
    }
    this.firewallTargetTags.add(firewallTargetTagsItem);
    return this;
  }
  
  /**
   * Firewall rule network target tags which will be applied on Service Engines to allow ingress and egress traffic for Service Engines. Field introduced in 18.2.1.
   * @return firewallTargetTags
  **/
  @ApiModelProperty(value = "Firewall rule network target tags which will be applied on Service Engines to allow ingress and egress traffic for Service Engines. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public List<String> getFirewallTargetTags() {
    return firewallTargetTags;
  }
    
  @VsoMethod
  public void setFirewallTargetTags(List<String> firewallTargetTags) {
    this.firewallTargetTags = firewallTargetTags;
  }

  
  /**
   * Google Cloud Storage Bucket Name where Service Engine image will be uploaded. This image will be deleted once the image is created in Google compute images. By default, a bucket will be created if this field is not specified. Field introduced in 18.2.1.
   * @return gcsBucketName
  **/
  @ApiModelProperty(value = "Google Cloud Storage Bucket Name where Service Engine image will be uploaded. This image will be deleted once the image is created in Google compute images. By default, a bucket will be created if this field is not specified. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getGcsBucketName() {
    return gcsBucketName;
  }
    
  @VsoMethod
  public void setGcsBucketName(String gcsBucketName) {
    this.gcsBucketName = gcsBucketName;
  }

  
  /**
   * Google Cloud Storage Project ID where Service Engine image will be uploaded. This image will be deleted once the image is created in Google compute images. By default, Service Engine Project ID will be used. Field introduced in 18.2.1.
   * @return gcsProjectId
  **/
  @ApiModelProperty(value = "Google Cloud Storage Project ID where Service Engine image will be uploaded. This image will be deleted once the image is created in Google compute images. By default, Service Engine Project ID will be used. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getGcsProjectId() {
    return gcsProjectId;
  }
    
  @VsoMethod
  public void setGcsProjectId(String gcsProjectId) {
    this.gcsProjectId = gcsProjectId;
  }

  
  /**
   * Match SE group subnets for VIP placement. Default is to not match SE group subnets. Field introduced in 18.2.1.
   * @return matchSeGroupSubnet
  **/
  @ApiModelProperty(value = "Match SE group subnets for VIP placement. Default is to not match SE group subnets. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public Boolean isMatchSeGroupSubnet() {
    return matchSeGroupSubnet;
  }
    
  @VsoMethod
  public void setMatchSeGroupSubnet(Boolean matchSeGroupSubnet) {
    this.matchSeGroupSubnet = matchSeGroupSubnet;
  }

  
  /**
   * Google Cloud Platform VPC Network configuration for the Service Engines. Field introduced in 18.2.1.
   * @return networkConfig
  **/
  @ApiModelProperty(required = true, value = "Google Cloud Platform VPC Network configuration for the Service Engines. Field introduced in 18.2.1.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public GCPNetworkConfig getNetworkConfig() {
    return networkConfig;
  }
    
  @VsoMethod
  public void setNetworkConfig(GCPNetworkConfig networkConfig) {
    this.networkConfig = networkConfig;
  }

  
  /**
   * Google Cloud Platform Region Name where Service Engines will be spawned. Field introduced in 18.2.1.
   * @return regionName
  **/
  @ApiModelProperty(required = true, value = "Google Cloud Platform Region Name where Service Engines will be spawned. Field introduced in 18.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getRegionName() {
    return regionName;
  }
    
  @VsoMethod
  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  
  /**
   * Google Cloud Platform Project ID where Service Engines will be spawned. Field introduced in 18.2.1.
   * @return seProjectId
  **/
  @ApiModelProperty(required = true, value = "Google Cloud Platform Project ID where Service Engines will be spawned. Field introduced in 18.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getSeProjectId() {
    return seProjectId;
  }
    
  @VsoMethod
  public void setSeProjectId(String seProjectId) {
    this.seProjectId = seProjectId;
  }

  
  /**
   * VIP allocation strategy defines how the VIPs will be created in Google Cloud. Field introduced in 20.1.1.
   * @return vipAllocationStrategy
  **/
  @ApiModelProperty(required = true, value = "VIP allocation strategy defines how the VIPs will be created in Google Cloud. Field introduced in 20.1.1.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public GCPVIPAllocation getVipAllocationStrategy() {
    return vipAllocationStrategy;
  }
    
  @VsoMethod
  public void setVipAllocationStrategy(GCPVIPAllocation vipAllocationStrategy) {
    this.vipAllocationStrategy = vipAllocationStrategy;
  }

  
  public GCPConfiguration addZonesItem(String zonesItem) {
    this.zones.add(zonesItem);
    return this;
  }
  
  /**
   * Google Cloud Platform Zones where Service Engines will be distributed for HA. Field introduced in 18.2.1.
   * @return zones
  **/
  @ApiModelProperty(required = true, value = "Google Cloud Platform Zones where Service Engines will be distributed for HA. Field introduced in 18.2.1.")
  @NotNull


 
  @VsoMethod  
  public List<String> getZones() {
    return zones;
  }
    
  @VsoMethod
  public void setZones(List<String> zones) {
    this.zones = zones;
  }

  
  public String getObjectID() {
		return "GCPConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPConfiguration gcPConfiguration = (GCPConfiguration) o;
    return Objects.equals(this.cloudCredentialsRef, gcPConfiguration.cloudCredentialsRef) &&
        Objects.equals(this.encryptionKeyId, gcPConfiguration.encryptionKeyId) &&
        Objects.equals(this.firewallTargetTags, gcPConfiguration.firewallTargetTags) &&
        Objects.equals(this.gcsBucketName, gcPConfiguration.gcsBucketName) &&
        Objects.equals(this.gcsProjectId, gcPConfiguration.gcsProjectId) &&
        Objects.equals(this.matchSeGroupSubnet, gcPConfiguration.matchSeGroupSubnet) &&
        Objects.equals(this.networkConfig, gcPConfiguration.networkConfig) &&
        Objects.equals(this.regionName, gcPConfiguration.regionName) &&
        Objects.equals(this.seProjectId, gcPConfiguration.seProjectId) &&
        Objects.equals(this.vipAllocationStrategy, gcPConfiguration.vipAllocationStrategy) &&
        Objects.equals(this.zones, gcPConfiguration.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudCredentialsRef, encryptionKeyId, firewallTargetTags, gcsBucketName, gcsProjectId, matchSeGroupSubnet, networkConfig, regionName, seProjectId, vipAllocationStrategy, zones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPConfiguration {\n");
    
    sb.append("    cloudCredentialsRef: ").append(toIndentedString(cloudCredentialsRef)).append("\n");
    sb.append("    encryptionKeyId: ").append(toIndentedString(encryptionKeyId)).append("\n");
    sb.append("    firewallTargetTags: ").append(toIndentedString(firewallTargetTags)).append("\n");
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

