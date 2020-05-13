package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AwsZoneNetwork;
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
 * IpamDnsAwsProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IpamDnsAwsProfile")
@VsoFinder(name = Constants.FINDER_VRO_IPAMDNSAWSPROFILE, idAccessor = "getObjectID()")
@Service
public class IpamDnsAwsProfile extends AviRestResource  {
  @JsonProperty("access_key_id")
  private String accessKeyId = null;

  @JsonProperty("egress_service_subnets")
  @Valid
  private List<String> egressServiceSubnets = null;

  @JsonProperty("iam_assume_role")
  private String iamAssumeRole = null;

  @JsonProperty("publish_vip_to_public_zone")
  private Boolean publishVipToPublicZone = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("secret_access_key")
  private String secretAccessKey = null;

  @JsonProperty("ttl")
  private Integer ttl = 60;

  @JsonProperty("usable_domains")
  @Valid
  private List<String> usableDomains = null;

  @JsonProperty("usable_network_uuids")
  @Valid
  private List<String> usableNetworkUuids = null;

  @JsonProperty("use_iam_roles")
  private Boolean useIamRoles = null;

  @JsonProperty("vpc")
  private String vpc = null;

  @JsonProperty("vpc_id")
  private String vpcId = null;

  @JsonProperty("zones")
  @Valid
  private List<AwsZoneNetwork> zones = null;

  
  /**
   * AWS access key ID.
   * @return accessKeyId
  **/
  @ApiModelProperty(value = "AWS access key ID.")


 
  @VsoMethod  
  public String getAccessKeyId() {
    return accessKeyId;
  }
    
  @VsoMethod
  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  
  public IpamDnsAwsProfile addEgressServiceSubnetsItem(String egressServiceSubnetsItem) {
    if (this.egressServiceSubnets == null) {
      this.egressServiceSubnets = new ArrayList<String>();
    }
    this.egressServiceSubnets.add(egressServiceSubnetsItem);
    return this;
  }
  
  /**
   * A list of subnets used for source IP allocation for egress services in Openshift/k8s on Aws. Field introduced in 18.2.3.
   * @return egressServiceSubnets
  **/
  @ApiModelProperty(value = "A list of subnets used for source IP allocation for egress services in Openshift/k8s on Aws. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public List<String> getEgressServiceSubnets() {
    return egressServiceSubnets;
  }
    
  @VsoMethod
  public void setEgressServiceSubnets(List<String> egressServiceSubnets) {
    this.egressServiceSubnets = egressServiceSubnets;
  }

  
  /**
   * IAM assume role for cross-account access. Field introduced in 17.1.1.
   * @return iamAssumeRole
  **/
  @ApiModelProperty(value = "IAM assume role for cross-account access. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getIamAssumeRole() {
    return iamAssumeRole;
  }
    
  @VsoMethod
  public void setIamAssumeRole(String iamAssumeRole) {
    this.iamAssumeRole = iamAssumeRole;
  }

  
  /**
   * If enabled and the virtual service is not floating ip capable, vip will be published to both private and public zones. This flag is applicable only for AWS DNS profile. Field introduced in 17.2.10.
   * @return publishVipToPublicZone
  **/
  @ApiModelProperty(value = "If enabled and the virtual service is not floating ip capable, vip will be published to both private and public zones. This flag is applicable only for AWS DNS profile. Field introduced in 17.2.10.")


 
  @VsoMethod  
  public Boolean isPublishVipToPublicZone() {
    return publishVipToPublicZone;
  }
    
  @VsoMethod
  public void setPublishVipToPublicZone(Boolean publishVipToPublicZone) {
    this.publishVipToPublicZone = publishVipToPublicZone;
  }

  
  /**
   * AWS region.
   * @return region
  **/
  @ApiModelProperty(value = "AWS region.")


 
  @VsoMethod  
  public String getRegion() {
    return region;
  }
    
  @VsoMethod
  public void setRegion(String region) {
    this.region = region;
  }

  
  /**
   * AWS secret access key.
   * @return secretAccessKey
  **/
  @ApiModelProperty(value = "AWS secret access key.")


 
  @VsoMethod  
  public String getSecretAccessKey() {
    return secretAccessKey;
  }
    
  @VsoMethod
  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }

  
  /**
   * Default TTL for all records. Allowed values are 1-172800. Field introduced in 17.1.3.
   * @return ttl
  **/
  @ApiModelProperty(value = "Default TTL for all records. Allowed values are 1-172800. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Integer getTtl() {
    return ttl;
  }
    
  @VsoMethod
  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }

  
  public IpamDnsAwsProfile addUsableDomainsItem(String usableDomainsItem) {
    if (this.usableDomains == null) {
      this.usableDomains = new ArrayList<String>();
    }
    this.usableDomains.add(usableDomainsItem);
    return this;
  }
  
  /**
   * Usable domains to pick from Amazon Route 53. Field introduced in 17.1.1.
   * @return usableDomains
  **/
  @ApiModelProperty(value = "Usable domains to pick from Amazon Route 53. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public List<String> getUsableDomains() {
    return usableDomains;
  }
    
  @VsoMethod
  public void setUsableDomains(List<String> usableDomains) {
    this.usableDomains = usableDomains;
  }

  
  public IpamDnsAwsProfile addUsableNetworkUuidsItem(String usableNetworkUuidsItem) {
    if (this.usableNetworkUuids == null) {
      this.usableNetworkUuids = new ArrayList<String>();
    }
    this.usableNetworkUuids.add(usableNetworkUuidsItem);
    return this;
  }
  
  /**
   * Usable networks for Virtual IP. If VirtualService does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for IP allocation. Field introduced in 17.1.1.
   * @return usableNetworkUuids
  **/
  @ApiModelProperty(value = "Usable networks for Virtual IP. If VirtualService does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for IP allocation. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public List<String> getUsableNetworkUuids() {
    return usableNetworkUuids;
  }
    
  @VsoMethod
  public void setUsableNetworkUuids(List<String> usableNetworkUuids) {
    this.usableNetworkUuids = usableNetworkUuids;
  }

  
  /**
   * Use IAM roles instead of access and secret key.
   * @return useIamRoles
  **/
  @ApiModelProperty(value = "Use IAM roles instead of access and secret key.")


 
  @VsoMethod  
  public Boolean isUseIamRoles() {
    return useIamRoles;
  }
    
  @VsoMethod
  public void setUseIamRoles(Boolean useIamRoles) {
    this.useIamRoles = useIamRoles;
  }

  
  /**
   * VPC name.
   * @return vpc
  **/
  @ApiModelProperty(value = "VPC name.")


 
  @VsoMethod  
  public String getVpc() {
    return vpc;
  }
    
  @VsoMethod
  public void setVpc(String vpc) {
    this.vpc = vpc;
  }

  
  /**
   * VPC ID.
   * @return vpcId
  **/
  @ApiModelProperty(required = true, value = "VPC ID.")
  @NotNull


 
  @VsoMethod  
  public String getVpcId() {
    return vpcId;
  }
    
  @VsoMethod
  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  
  public IpamDnsAwsProfile addZonesItem(AwsZoneNetwork zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<AwsZoneNetwork>();
    }
    this.zones.add(zonesItem);
    return this;
  }
  
  /**
   * Network configuration for Virtual IP per AZ. Field introduced in 17.1.3.
   * @return zones
  **/
  @ApiModelProperty(value = "Network configuration for Virtual IP per AZ. Field introduced in 17.1.3.")

  @Valid

 
  @VsoMethod  
  public List<AwsZoneNetwork> getZones() {
    return zones;
  }
    
  @VsoMethod
  public void setZones(List<AwsZoneNetwork> zones) {
    this.zones = zones;
  }

  
  public String getObjectID() {
		return "IpamDnsAwsProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpamDnsAwsProfile ipamDnsAwsProfile = (IpamDnsAwsProfile) o;
    return Objects.equals(this.accessKeyId, ipamDnsAwsProfile.accessKeyId) &&
        Objects.equals(this.egressServiceSubnets, ipamDnsAwsProfile.egressServiceSubnets) &&
        Objects.equals(this.iamAssumeRole, ipamDnsAwsProfile.iamAssumeRole) &&
        Objects.equals(this.publishVipToPublicZone, ipamDnsAwsProfile.publishVipToPublicZone) &&
        Objects.equals(this.region, ipamDnsAwsProfile.region) &&
        Objects.equals(this.secretAccessKey, ipamDnsAwsProfile.secretAccessKey) &&
        Objects.equals(this.ttl, ipamDnsAwsProfile.ttl) &&
        Objects.equals(this.usableDomains, ipamDnsAwsProfile.usableDomains) &&
        Objects.equals(this.usableNetworkUuids, ipamDnsAwsProfile.usableNetworkUuids) &&
        Objects.equals(this.useIamRoles, ipamDnsAwsProfile.useIamRoles) &&
        Objects.equals(this.vpc, ipamDnsAwsProfile.vpc) &&
        Objects.equals(this.vpcId, ipamDnsAwsProfile.vpcId) &&
        Objects.equals(this.zones, ipamDnsAwsProfile.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, egressServiceSubnets, iamAssumeRole, publishVipToPublicZone, region, secretAccessKey, ttl, usableDomains, usableNetworkUuids, useIamRoles, vpc, vpcId, zones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpamDnsAwsProfile {\n");
    
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    egressServiceSubnets: ").append(toIndentedString(egressServiceSubnets)).append("\n");
    sb.append("    iamAssumeRole: ").append(toIndentedString(iamAssumeRole)).append("\n");
    sb.append("    publishVipToPublicZone: ").append(toIndentedString(publishVipToPublicZone)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    usableDomains: ").append(toIndentedString(usableDomains)).append("\n");
    sb.append("    usableNetworkUuids: ").append(toIndentedString(usableNetworkUuids)).append("\n");
    sb.append("    useIamRoles: ").append(toIndentedString(useIamRoles)).append("\n");
    sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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

